public class Student extends User {

	private int studId;
	private String group;
	private Faculty faculty;

	public Student(int id, String login, String name, int studId, String group, Faculty faculty) {
        super(id, login, name);
        this.studId = studId;
        this.group = group;
        this.faculty = faculty;
        super.addRole("STUDENT");
    }
	public void viewSchedule() {
		System.out.println(getName() + " просматривает расписание группы " + group);
	}

	public void submitAssignment(String assignmentTitle) {
		System.out.println(getName() + " сдает задание: " + assignmentTitle);
	}

	public int getStudId() { return studId; }
    public void setStudId(int studId) { this.studId = studId; }
    
    public String getGroup() { return group; }
    public void setGroup(String group) { this.group = group; }
    
    public Faculty getFaculty() { return faculty; }
    public void setFaculty(Faculty faculty) { this.faculty = faculty; }

}