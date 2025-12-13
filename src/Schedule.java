public class Schedule {
    private String day;
    private String time;
    private Subject subject;
    
    public Schedule(String day, String time, Subject subject) {
        this.day = day;
        this.time = time;
        this.subject = subject;
    }
    
    public void getSchedule() {
        System.out.println("Расписание: " + day + " " + time + " - " + subject.getTitle());
    }
    
    public String getDay() { return day; }
    public void setDay(String day) { this.day = day; }
    
    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }
    
    public Subject getSubject() { return subject; }
    public void setSubject(Subject subject) { this.subject = subject; }
}