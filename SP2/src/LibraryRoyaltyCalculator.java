public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {
        Author author = new Author("Rachel Goldstein");

        author.addTitle(new PrintedBook("World of Warcraft: War Crimes","TE", 50,  200));
        author.addTitle(new AudioBook("World of Warcraft: Learn to hit level 60 in HARDCORE","FAG", 30, 300));
        author.addTitle(new PrintedBook("World of Warcraft: The songs of the third war", "LYRIK", 40,100));


        double totalRoyalty = author.calculateTotalPay();
        System.out.println("Rachel Goldstein" + ": " + totalRoyalty + " kr.");
    }
}
