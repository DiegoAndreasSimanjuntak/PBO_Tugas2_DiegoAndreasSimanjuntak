public class Pengurangan {
    public static void main(String[] args) {
        int x, y, z;

        x = 42;
        y = x--;   // y = 42, x = 41

        // tampilkan nilai x dan y
        System.out.println("Setelah y = x-- :");
        System.out.println("x = " + x + ", y = " + y);

        z = --x;   // x turun dulu baru masuk ke z → x = 40, z = 40

        // tampilkan nilai x dan z
        System.out.println("Setelah z = --x :");
        System.out.println("x = " + x + ", z = " + z);
    }
}

