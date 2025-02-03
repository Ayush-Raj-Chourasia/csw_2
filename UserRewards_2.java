class User_1 {
    String name;
    int phone;
    int reward;

    public User_1(String name, int phone) {
        this.name = name;
        this.phone = phone;
        this.reward = 0;
    }

    public void displayUser() {
        System.out.println("Name: " + name + ", Phone: " + phone + ", Reward: " + reward);
    }
}

class Reward {
    private static User_1[] userList = new User_1[100];
    private static int userCount = 0;

    public int calcReward(User_1 u) {
        for (int i = 0; i < userCount; i++) {
            if (userList[i].name.equals(u.name) && userList[i].phone == u.phone) {
                u.reward = 0;
                return u.reward;
            }
        }
        u.reward = 500;
        userList[userCount++] = u;
        return u.reward;
    }
}

public class UserRewards_2{
    public static void main(String[] args) {
        User_1 user1 = new User_1("Alice", 987654321);
        User_1 user2 = new User_1("Bob", 123456789);
        User_1 user3 = new User_1("Alice", 987654321);

        Reward rewardSystem = new Reward();

        System.out.println("Reward for " + user1.name + ": " + rewardSystem.calcReward(user1));
        System.out.println("Reward for " + user2.name + ": " + rewardSystem.calcReward(user2));
        System.out.println("Reward for " + user3.name + ": " + rewardSystem.calcReward(user3));

        System.out.println("\nUser Details:");
        user1.displayUser();
        user2.displayUser();
        user3.displayUser();
    }
}
