public class University {
    private String name;
    private Rector rector;
    
    public University(String name, Rector rector) {
        this.name = name;
        this.rector = rector;
    }
    
    public String getName() { return name; }
    public Rector getRector() { return rector; }
    
    public void setName(String name) { this.name = name; }
    public void setRector(Rector rector) { this.rector = rector; }
}