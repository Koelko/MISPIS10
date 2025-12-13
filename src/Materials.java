public class Materials {

	private String title;
	private Subject subject;

    public Materials(String title, Subject subject) {
        this.title = title;
        this.subject = subject;
    }

	public void upload(Professor professor) {
		System.out.println("Материал \"" + title + "\" по предмету " + 
                          subject.getTitle() + " загружен преподавателем " + professor.getName());
	}

	public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    
    public Subject getSubject() { return subject; }
    public void setSubject(Subject subject) { this.subject = subject; }

}