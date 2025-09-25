package Latihan_2;

public class Pengurangan2 {
    public static void main(String[] args) {
        int w, x, y, z;
        x = 5;
        w = 5;

        y = 8 - x--; 
        z = 8 - --w;

        System.out.println("Hasil Pengurangan2:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("w = " + w);
        System.out.println("z = " + z);
    }
}

