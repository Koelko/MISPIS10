public class Subject {
    private String code;
    private String title;
    private Faculty faculty;
    
    public Subject(String code, String title, Faculty faculty) {
        this.code = code;
        this.title = title;
        this.faculty = faculty;
    }
    
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    
    public Faculty getFaculty() { return faculty; }
    public void setFaculty(Faculty faculty) { this.faculty = faculty; }
}