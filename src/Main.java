//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x=3, y=2, z=6;
        if (x>y){
            System.out.println("Veci je X: " +x);
        }else {
            x=y;
            System.out.println("Y je veci od X:" +x);
        }
        if(y>z){
            System.out.println("Y je veci od Z");

        }


        int t = x+y;


        System.out.printf("Rezultat je:" +t);
    }
}