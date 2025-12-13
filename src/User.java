import java.util.ArrayList;
import java.util.List;

public class User {

    private int id;
    private String login;
    private String name;
    private List<String> roles;

    public User(int id, String login, String name) {
        this.id = id;
        this.login = login;
        this.name = name;
        this.roles = new ArrayList<>();
        this.roles.add("USER");
    }

    public void login() {
        System.out.println("Пользователь " + name + " (логин: " + login + ") вошел в систему");
        System.out.println("Роли пользователя: " + roles);
    }

    public void logOut() {
        System.out.println("Пользователь " + name + " вышел из системы");
    }

    public boolean hasRole(String role) {
        return roles.contains(role.toUpperCase());
    }

    public void addRole(String role) {
        if (!hasRole(role)) {
            roles.add(role.toUpperCase());
            System.out.println("Пользователю " + name + " добавлена роль: " + role);
        } else {
            System.out.println("Пользователь " + name + " уже имеет роль: " + role);
        }
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<String> getRoles() { return roles; }
    public void setRoles(List<String> roles) { this.roles = roles; }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Логин: " + login + ", Имя: " + name + ", Роли: " + roles);
    }
}