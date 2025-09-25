package Latihan_2;

public class Penambahan2 {
    public static void main(String[] args) {
        int w, x, y, z;
        x = 5;
        w = 5;

        y = 8 - x++;  // y = 8 - 5 = 3, lalu x jadi 6
        z = 8 - ++w;  // w naik dulu (6), jadi z = 8 - 6 = 2

        // tampilkan hasil
        System.out.println("Hasil Penambahan2:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("w = " + w);
        System.out.println("z = " + z);
    }
}
