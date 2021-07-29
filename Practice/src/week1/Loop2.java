package week1;

public class Loop2 {
    public static void main(String[] args) {


        int i = 5;
        int[] a = {5, 10, 20, 40};
        int z = 0;
        int b = 0;
        System.out.println("Starting value of z = " +z);

        while (b <= a.length-1) {
            int y = i * a[b];
            z = z + y;
            System.out.println("Value of z at index "+b+ " = "+z);
            b++;
        }
        System.out.println("Ending value of z = " +z);
    }
}
