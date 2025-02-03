import java.util.ArrayList;

class User {
    String name;
    String phone;
    int reward;

    User(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.reward = 100;
    }
}

public class UserRewards {
    static ArrayList<User> users = new ArrayList<>();

    public static void addUser(String name, String phone) {
        for (User user : users) {
            if (user.phone.equals(phone)) {
                user.reward = 0;
                System.out.println("User already exists. Reward set to 0.");
                return;
            }
        }
        users.add(new User(name, phone));
        System.out.println("New user added with reward: 100");
    }

    public static void main(String[] args) {
        addUser("Alice", "12345");
        addUser("Bob", "67890");
        addUser("Alice", "12345");
    }
}
