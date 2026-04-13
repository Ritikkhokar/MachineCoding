package MachineCoding.BuildGoogleDocsCodersArmy.Entities;

public class User {
    String name;
    int id;
    String email;

    public User(int id, String name, String email) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

}
