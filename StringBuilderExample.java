public class StringBuilderExample {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("Hello");
        sb.append(" ");
        sb.append("World");

        String result = sb.toString();

        System.out.println(result);
    }
}