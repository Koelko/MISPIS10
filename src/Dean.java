public class Dean extends User {

	private Faculty faculty;

	public Dean(int id, String login, String name, Faculty faculty) {
        super(id, login, name);
        this.faculty = faculty;
        super.addRole("DEAN");
        super.addRole("PROFESSOR"); 
    }

	public void manageFaculty() {
		System.out.println("Декан " + getName() + " управляет факультетом: " + faculty.getName());
        System.out.println("Действия: назначение преподавателей, утверждение планов, формирование отчетов");
	}

 	public Faculty getFaculty() { return faculty; }
    public void setFaculty(Faculty faculty) { this.faculty = faculty; }

}