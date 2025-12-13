public class Main {
    public static void main(String[] args) {
        System.out.println("=== Запуск университетской информационной системы ===\n");
        
        // 1. Создаем ректора
        Rector rector = new Rector(1, "rector_ivanov", "Иванов Иван Иванович", null);
        
        // 2. Создаем университет
        University university = new University("Национальный Технический Университет", rector);
        rector.setUniversity(university);
        
        // 3. Создаем декана
        Dean dean = new Dean(2, "dean_petrov", "Петров Петр Петрович", null);
        
        // 4. Создаем факультет
        Faculty faculty = new Faculty("Факультет Информационных Технологий", university, dean);
        dean.setFaculty(faculty);
        
        // 5. Создаем кафедру
        Department department = new Department("Кафедра Программирования и Информационных Систем", faculty);
        
        // 6. Создаем предмет
        Subject javaSubject = new Subject("CS101", "Программирование на Java", faculty);
        Subject umlSubject = new Subject("CS102", "UML и проектирование систем", faculty);
        
        // 7. Создаем преподавателя
        Professor professor = new Professor(3, "prof_sidorov", "Сидоров Сидор Сидорович", 
                                          department, "Доцент");
        
        // 8. Создаем студентов
        Student student1 = new Student(4, "stud_kozlov", "Козлов Константин", 
                                      12345, "ИТ-21", faculty);
        Student student2 = new Student(5, "stud_nikolaev", "Николаев Николай", 
                                      12346, "ИТ-21", faculty);
        
        // 9. Создаем задания
        Assignment lab10 = new Assignment("Лабораторная работа 10: UML диаграммы", umlSubject);
        Assignment homework = new Assignment("Домашнее задание: классы в Java", javaSubject);
        
        // 10. Создаем материалы
        Materials lectureNotes = new Materials("Конспект лекций по UML", umlSubject);
        Materials practiceTasks = new Materials("Практические задания по Java", javaSubject);
        
        System.out.println("=== Аутентификация пользователей ===");
        student1.login();
        student2.login();
        professor.login();
        dean.login();
        rector.login();
        
        System.out.println("\n=== Учебный процесс ===");
        
        // Студенты просматривают расписание
        System.out.println("\n--- Просмотр расписания ---");
        student1.viewSchedule();
        student2.viewSchedule();
        
        // Студенты сдают задания
        System.out.println("\n--- Сдача заданий ---");
        student1.submitAssignment(lab10.getTitle());
        lab10.submit(student1);
        
        student2.submitAssignment(homework.getTitle());
        homework.submit(student2);
        
        // Преподаватель выкладывает материалы
        System.out.println("\n--- Работа преподавателя ---");
        professor.uploadMaterial("Лекция 1: Введение в UML", "UML и проектирование систем");
        professor.uploadMaterial("Лекция 2: Диаграммы классов", "UML и проектирование систем");
        
        lectureNotes.upload(professor);
        practiceTasks.upload(professor);
        
        // Преподаватель выставляет оценки
        System.out.println("\n--- Выставление оценок ---");
        professor.gradeStudent(student1, "UML и проектирование систем", 5);
        professor.gradeStudent(student2, "Программирование на Java", 4);
        
        // Создаем объекты оценок
        Grade grade1 = new Grade(5, student1, umlSubject, professor);
        Grade grade2 = new Grade(4, student2, javaSubject, professor);
        
        System.out.println("\nОценка 1: " + grade1.getValue() + " баллов, студент: " + 
                          grade1.getStudent().getName() + ", предмет: " + grade1.getSubject().getTitle());
        System.out.println("Оценка 2: " + grade2.getValue() + " баллов, студент: " + 
                          grade2.getStudent().getName() + ", предмет: " + grade2.getSubject().getTitle());
        
        System.out.println("\n=== Административная деятельность ===");
        
        // Декан управляет факультетом
        System.out.println("\n--- Управление факультетом ---");
        dean.manageFaculty();
        System.out.println("Декан факультета: " + faculty.getName() + " - " + dean.getName());
        System.out.println("Кафедра: " + department.getName() + ", заведующий: " + professor.getName());
        
        // Ректор управляет университетом
        System.out.println("\n--- Управление университетом ---");
        rector.manageUniversity();
        System.out.println("Ректор университета: " + university.getName() + " - " + rector.getName());
        System.out.println("Количество факультетов: 1 (" + faculty.getName() + ")");
        
        System.out.println("\n=== Информация о пользователях ===");
        student1.displayInfo();
        student2.displayInfo();
        professor.displayInfo();
        dean.displayInfo();
        rector.displayInfo();
        
        System.out.println("\n=== Проверка ролей ===");
        System.out.println("Студент " + student1.getName() + " имеет роль PROFESSOR: " + 
                          student1.hasRole("PROFESSOR"));
        System.out.println("Преподаватель " + professor.getName() + " имеет роль PROFESSOR: " + 
                          professor.hasRole("PROFESSOR"));
        System.out.println("Декан " + dean.getName() + " имеет роль DEAN: " + 
                          dean.hasRole("DEAN"));
        System.out.println("Ректор " + rector.getName() + " имеет роль RECTOR: " + 
                          rector.hasRole("RECTOR"));
        
        // Добавляем дополнительные роли
        System.out.println("\n--- Добавление ролей ---");
        student1.addRole("LIBRARY_USER");
        student1.addRole("SPORTS_CLUB_MEMBER");
        student1.addRole("STUDENT"); // Попытка добавить существующую роль
        
        System.out.println("\nОбновленные роли студента " + student1.getName() + ": " + 
                          student1.getRoles());
        
        System.out.println("\n=== Выход из системы ===");
        student1.logOut();
        student2.logOut();
        professor.logOut();
        dean.logOut();
        rector.logOut();
        
        System.out.println("\n=== Система завершила работу успешно! ===");
        System.out.println("Всего пользователей: 5");
        System.out.println("Всего операций: 15+");
        System.out.println("Система готова к использованию в учебном процессе.");
    }
}