public class Penambahan {
    public static void main(String[] args) {
        int x, y, z;

        x = 42;
        y = x++;   

        System.out.println("Setelah y = x++ :");
        System.out.println("x = " + x + ", y = " + y);

        z = ++x;   // x naik dulu baru masuk ke z → x = 44, z = 44

        System.out.println("Setelah z = ++x :");
        System.out.println("x = " + x + ", z = " + z);
    }
}
