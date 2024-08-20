import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Unesite prvi broj: ");

        Scanner skeniraj = new Scanner(System.in);
        int x = Integer.parseInt(skeniraj.nextLine());

        System.out.println("Unesite drugi broj: ");
        int y = Integer.parseInt(skeniraj.nextLine());

        System.out.println("Rezultat je: " + (x + y));

    }
}