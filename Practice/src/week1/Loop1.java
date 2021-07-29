package week1;

public class Loop1 {
    public static void main(String[] args) {


        int i = 50;
        int[] a = {5, 10, 1, 30};
        int z = 0;
        System.out.println("Starting value of z = " +z);

        for (int b = 0; b <= a.length - 1; b++) {
            int y = i * a[b];
            z = z + y;
            System.out.println("Value of z at index "+b+ " = "+z);
        }
        System.out.println("Ending value of z = " +z);
    }
}
