import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter a random number: ");
        byte height = scanner.nextByte();


        System.out.println("***********************************");
        System.out.println("                          ");
        System.out.println("  Happy New Year, " + name + "!");
        System.out.println("  Wishing you joy and");
        System.out.println("  success in the coming year!");
        System.out.println("  Thank you so much SIR");
        System.out.println("  Ikaw ang dahilan bakit pati");
        System.out.println("  itong Greeting Card ay ");
        System.out.println("  Nakacode! XD !!!");
        System.out.println("                          ");
        System.out.println("***********************************");


        System.out.println();
        System.out.println();

        for (int i = 1; i <= height; i++) {

            for (int j = height; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }



        for (int i = 1; i <= height / 3; i++) {
            for (int j = 1; j < height; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

        scanner.close();
    }
}
