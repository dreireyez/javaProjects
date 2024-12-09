public class Manipulation {
    public static void main(String[] args) {
        String str1 = "A man, a plan, a canal, Panala";
        System.out.println(str1);
    }
    public static String manipulate(String str1)
        {
            str1 = str1.toLowerCase();
            str1 = str1.replaceAll("[^a-zA-Z0-9]","");
            return str1;
        }
}