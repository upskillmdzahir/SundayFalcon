package Com.Upskill.Assignment_4;

public class Assignment4_1 {

    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;

    // Constructor
    public Assignment4_1(String username, String password, String email, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter methods
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Setter methods
    public void setPassword(String value) {
        password = value;
    }

    public void setEmail(String eadd) {
        email = eadd;
    }

    // Display user information
    public void displayUserInfo() {
        System.out.println("Username: " + getUsername());
        System.out.println("Password: " + getPassword());
        System.out.println("Email: " + getEmail());
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
    }

    public static void main(String[] args) {
        // Creating a user object
        Assignment4_1 user = new Assignment4_1("john_doe", "123456xyz", "john@example.com", "John", "Doe");

        // Displaying user information
        user.displayUserInfo();
    }
}
