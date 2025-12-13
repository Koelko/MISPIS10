public class Faculty {
    private String name;
    private University university;
    private Dean dean;
    
    public Faculty(String name, University university, Dean dean) {
        this.name = name;
        this.university = university;
        this.dean = dean;
    }
    
    public String getName() { return name; }
    public Dean getDean() { return dean; }
    public University getUniversity() { return university; }
    
    public void setName(String name) { this.name = name; }
    public void setUniversity(University university) { this.university = university; }
    public void setDean(Dean dean) { this.dean = dean; }
}