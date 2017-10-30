import java.util.Scanner;
import java.util.Random;


public class proves {

    public static void main(String[] args) {

        int player1;
        int computer = (int)(Math.random()*3+1);


        Scanner one = new Scanner(System.in);

        System.out.println("Introduce tu elección (piedra(1)/papel(2)/tijera(3)): ");

        player1 = one.nextInt();


        if (player1 == 1 ){

                System.out.println("Has elegido piedra");
                if(computer == 1){

                    System.out.println("Los dos habeis sacado piedra");
                    System.out.println("EMPATE");
                }

                if(computer == 2){
                    System.out.println("El ordenador ha elegido papel");
                    System.out.println("DERROTA!");
                }

                if(computer == 3){
                    System.out.println("El ordenador ha elegido tijera");
                    System.out.println("VICTORIA!");
                }

        }

        if (player1 == 2 ) {

            System.out.println("Has elegido papel");
            if (computer == 1) {

                System.out.println("El ordenador ha elegido piedra");
                System.out.println("VICTORIA");
            }

            if (computer == 2) {
                System.out.println("Los dos habeis elegido papel");
                System.out.println("EMPATE!");
            }

            if (computer == 3) {
                System.out.println("El ordenador ha elegido tijera");
                System.out.println("DERROTA!");
            }

        }

        if (player1 == 3 ) {

            System.out.println("Has elegido tijera");
            if (computer == 1) {

                System.out.println("El ordenador ha elegido piedra");
                System.out.println("DERROTA");
            }

            if (computer == 2) {
                System.out.println("El ordenador ha elegido papel");
                System.out.println("VICTORIA!");
            }

            if (computer == 3) {
                System.out.println("Los dos habeis elegido tijera");
                System.out.println("EMPATE!");
            }

        }








    }

}
