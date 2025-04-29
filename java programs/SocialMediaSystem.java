import java.util.*;

class SocialMedia {
    Set<String> followers = new HashSet<>();

    void follow(String user) {
        followers.add(user);
    }
}

class SocialMediaSystem {
    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();
        sm.follow("Bharath");
        sm.follow("Ajay");
        sm.follow("Damu");
        System.out.println("Followers: " + sm.followers);
    }
}