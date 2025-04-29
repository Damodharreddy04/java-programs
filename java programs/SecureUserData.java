import java.util.Scanner;

class User {
    private String name;
    private String password;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean validatePassword(String input) {
        return password.equals(input);
    }
}

public class SecureUserData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        user.setName(name);

        System.out.println("Set your password:");
        String password = scanner.nextLine();
        user.setPassword(password);

        System.out.println("\nName: " + user.getName());

        System.out.println("Enter your password for validation:");
        String inputPassword = scanner.nextLine();
        if (user.validatePassword(inputPassword)) {
            System.out.println("Password Valid: true");
        } else {
            System.out.println("Password Valid: false");
        }
    }
}
