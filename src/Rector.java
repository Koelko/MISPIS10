public class Rector extends User {

	private University university;

    public Rector(int id, String login, String name, University university) {
        super(id, login, name);
        this.university = university;
        super.addRole("RECTOR");
        super.addRole("PROFESSOR"); 
    }

	public void manageUniversity() {
		System.out.println("Ректор " + getName() + " управляет университетом: " + university.getName());
        System.out.println("Действия: стратегическое планирование, утверждение бюджетов, кадровые решения");
	}

    public University getUniversity() { return university; }
    public void setUniversity(University university) { this.university = university; }

}