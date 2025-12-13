public class Assignment {

	private String title;
	private Subject subject;

    public Assignment(String title, Subject subject) {
        this.title = title;
        this.subject = subject;
    }
	
	public void submit(Student student) {
		System.out.println("Задание \"" + title + "\" по предмету " + 
                          subject.getTitle() + " сдано студентом " + student.getName());
	}

 	public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    
    public Subject getSubject() { return subject; }
    public void setSubject(Subject subject) { this.subject = subject; }
}