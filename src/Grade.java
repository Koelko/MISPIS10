public class Grade {
    private int value;
    private Student student; 
    private Subject subject;
    private Professor professor; 
    
    public Grade(int value, Student student, Subject subject, Professor professor) {
        this.value = value;
        this.student = student;
        this.subject = subject;
        this.professor = professor;
    }
    
    
    public int getValue() { return value; }
    public Student getStudent() { return student; }
    public Subject getSubject() { return subject; }
    public Professor getProfessor() { return professor; }
}