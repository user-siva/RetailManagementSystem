package users;

public abstract class User {
    private String id;
    private String name;
    private String email;
    private String password;
    private String contact;

    public User(String id, String name, String email, String password, String contact) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.contact = contact;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

}
