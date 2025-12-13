public class Professor extends User {

	private Department department;
	private String position;

	public Professor(int id, String login, String name, Department department, String position) {
        super(id, login, name);
        this.department = department;
        this.position = position;
        super.addRole("PROFESSOR");
    }

	public void gradeStudent(Student student, String subject, int grade) {
		System.out.println(position + " " + getName() + " выставил оценку " + grade + 
                         " студенту " + student.getName() + " по предмету " + subject);
	}

	public void uploadMaterial(String materialTitle, String subject) {
		System.out.println(getName() + " выложил материал: " + materialTitle + " по предмету " + subject);
	}

	public Department getDepartment() { return department; }
    public void setDepartment(Department department) { this.department = department; }
    
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

}