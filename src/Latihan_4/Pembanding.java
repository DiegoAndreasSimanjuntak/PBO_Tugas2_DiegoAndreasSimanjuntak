public class Pembanding {
    public static void main(String[] args) {
        int age = 36;

        boolean hasilBanding1 = age < 25;   
        boolean hasilBanding2 = age != 26;  

        System.out.println("age = " + age);
        System.out.println("hasilBanding1 (age < 25) = " + hasilBanding1);
        System.out.println("hasilBanding2 (age != 26) = " + hasilBanding2);
    }
}
