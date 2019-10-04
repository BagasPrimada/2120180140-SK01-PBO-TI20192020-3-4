public class NewClass {
   public static void main(String[] args) {
//        saya membuat baris kedua menjadi 2 angka gak bisa pak 
        for (int i = 1; i <= 10; i++) {
            for (int k = 10; k >= i; k--) {
                System.out.print(" ");
            }
            for (int k = 2; k <= i; k++) {
                System.out.print("4");
            }
            for (int k = 3; k <= i; k++) {
                System.out.print("4");
            }
            System.out.println();
        }
    }
}
