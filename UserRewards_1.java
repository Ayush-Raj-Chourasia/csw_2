import java.util.HashMap;

class User_2 {
    String name;
    String phone;
    int reward;

    User_2(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.reward = 100;
    }
}

public class UserRewards_1 {
    static HashMap<String, User_2> users = new HashMap<>();

    public static void addUser(String name, String phone) {
        if (users.containsKey(phone)) {
            users.get(phone).reward = 0;
            System.out.println("User already exists. Reward set to 0.");
        } else {
            users.put(phone, new User_2(name, phone));
            System.out.println("New user added with reward: 100");
        }
    }

    public static void main(String[] args) {
        addUser("Alice", "12345");
        addUser("Bob", "67890");
        addUser("Alice", "12345");
    }
}
