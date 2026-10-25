public class FavoriteThings5 {
    public static void main(String[] args) {
        // 1. Declare and initialize a String array with 5 favorite things
        String[] favoriteThings = {"Pizza", "Video Games", "Music", "Books", "Coffee" , "Sleeping", "Walking"};

        System.out.println("--- My Favorite Things ---");

        for (int i = 0; i < favoriteThings.length; i++) {
            System.out.println((i + 1) + ". " + favoriteThings[i]);
        }

        System.out.println();
        
        System.out.println("Total number of items in the array: " + favoriteThings.length);
    }
}
