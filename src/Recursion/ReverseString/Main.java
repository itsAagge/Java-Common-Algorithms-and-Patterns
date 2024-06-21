package Recursion.ReverseString;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverse("retniW"));
    }

    public static String reverse(String s) {
        if (s.isEmpty()) {
            return "";
        }
        String answer = "";
        answer += s.charAt(s.length() - 1);
        return answer + reverse(s.substring(0,s.length() - 1));
    }
}
