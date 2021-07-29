package week1;

public class Loop3 {
    public static void main(String[] args) {


        int i = 2;
        int[] a = {1, 2, 4, 6};
        int z = 0;
        int b = 0;
        System.out.println("Starting value of z = " +z);

        do {
            int y = i * a[b];
            z = z + y;
            System.out.println("Value of z at index "+b+ " = "+z);
            b++;
        } while (b <= a.length-1);
        System.out.println("Ending value of z = " +z);
    }
}
