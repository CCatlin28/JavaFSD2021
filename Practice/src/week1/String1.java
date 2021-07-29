package week1;

public class String1 {
    public static void main(String[] args) {
        String str1 = "Today is my birthday.";
        StringBuilder sb1 = new StringBuilder("Today has been a good day.");
        sb1.append(" "+str1);
        System.out.println(sb1);
        int s = sb1.length();
        System.out.println(s);
        sb1.delete(17,21);
        sb1.insert(17, "GREAT");
        System.out.println(sb1);
    }
}
