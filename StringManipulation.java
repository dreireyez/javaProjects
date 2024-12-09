public class StringManipulation {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal, Panama";
        String myOutputString = createMyOutput(str);
        boolean isMyOutput = isMyOutput(myOutputString);
        System.out.println("My String\t\t:" + str);
        System.out.println("My Output String\t:" + myOutputString);
        System.out.println("Is \"" + myOutputString + "\" is my Output? \n" + isMyOutput);
    }

    public static String createMyOutput(String str) {
        String reverseStr = reverseString(str);
        return reverseStr;
    }

    public static boolean isMyOutput(String str) {
        str = manipulate(str);
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static String manipulate(String str1) {
        str1 = str1.toLowerCase();
        str1 = str1.replaceAll("[^a-zA-Z0-9]", "");
        return str1;
    }

    public static String reverseString(String str) {
        str = manipulate(str);
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }
}
