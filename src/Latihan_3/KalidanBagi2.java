package Latihan_3;

public class KalidanBagi2 {
    public static void main(String[] args) {
        int x = 20;

        int kali2 = x << 1;

        int bagi2 = x >> 1;

        System.out.println("Nilai awal x = " + x);
        System.out.println("x * 2 (dengan bit shift) = " + kali2);
        System.out.println("x / 2 (dengan bit shift) = " + bagi2);
    }
}

