public class UnderstandingStrings {

    public static void main(String[] args) {

        String original = "Hello";

        String modified = original.concat(" World");

        System.out.println("Original: " + original);
        System.out.println("Modified: " + modified);

        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("Same object: " + (str1 == str2));
    }
}