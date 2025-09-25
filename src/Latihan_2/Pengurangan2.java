package Latihan_2;

public class Pengurangan2 {
    public static void main(String[] args) {
        int w, x, y, z;
        x = 5;
        w = 5;

        y = 8 - x--;  // y = 8 - 5 = 3, lalu x jadi 4
        z = 8 - --w;  // w turun dulu (4), jadi z = 8 - 4 = 4

        System.out.println("Hasil Pengurangan2:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("w = " + w);
        System.out.println("z = " + z);
    }
}

