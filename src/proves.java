import java.util.Scanner;
import java.util.Random;


public class proves {

    public static void main(String[] args) {

        int player1;
        int computer = (int)(Math.random()*5+1);


        // Esto es una prueba para Github;

        Scanner one = new Scanner(System.in);

        System.out.println("Introduce tu elección (piedra(1)/papel(2)/tijera(3)): ");

        player1 = one.nextInt();


        /** CODI PER ARREGLAR:
         *  System.out.println("Player1 "+contador+" - "+contador_computer+" computer");
         proves.main(null);
         */




        // Opción 1: Piedra

        if (player1 == 1) {

            System.out.println("Has elegido piedra");
            if (computer == 1) {

                System.out.println("Los dos habeis sacado piedra");
                System.out.println("EMPATE! Vuelve a intentarlo...");
                proves.main(null);

            }

            if (computer == 2) {
                System.out.println("El ordenador ha elegido papel");
                System.out.println("Papel tapa piedra");
                System.out.println("DERROTA!");


            }

            if (computer == 3) {
                System.out.println("El ordenador ha elegido tijera");
                System.out.println("Piedra aplasta tijeras");
                System.out.println("VICTORIA!");


            }

            if (computer == 4) {
                System.out.println("El ordenador ha elegido lagarto");
                System.out.println("Piedra aplasta lagarto");
                System.out.println("VICTORIA!");

            }

            if (computer == 5) {
                System.out.println("El ordenador ha elegido Spock");
                System.out.println("Spock vaporiza Piedra");
                System.out.println("DERROTA!");
            }

        }




        // Opción 2: Papel

        if (player1 == 2) {

            System.out.println("Has elegido papel");
            if (computer == 1) {

                System.out.println("El ordenador ha elegido piedra");
                System.out.println("Papel tapa piedra");
                System.out.println("VICTORIA!");


            }

            if (computer == 2) {
                System.out.println("Los dos habeis elegido papel");
                System.out.println("EMPATE! Vuelve a intentarlo...");
                proves.main(null);

            }

            if (computer == 3) {
                System.out.println("El ordenador ha elegido tijera");
                System.out.println("Tijeras cortan papel");
                System.out.println("DERROTA!");


            }

            if (computer == 4) {
                System.out.println("El ordenador ha elegido lagarto");
                System.out.println("Lagarto devora papel");
                System.out.println("DERROTA!");

            }

            if (computer == 5) {
                System.out.println("El ordenador ha elegido Spock");
                System.out.println("Papel desautoriza a Spock");
                System.out.println("VICTORIA!");
            }

        }


        // Opción 3: Tijeras

        if (player1 == 3) {

            System.out.println("Has elegido tijera");
            if (computer == 1) {

                System.out.println("El ordenador ha elegido piedra");
                System.out.println("Piedra aplasta tijeras");
                System.out.println("DERROTA");


            }

            if (computer == 2) {
                System.out.println("El ordenador ha elegido papel");
                System.out.println("Tijeras cortan papel");
                System.out.println("VICTORIA!");

            }

            if (computer == 3) {
                System.out.println("Los dos habeis elegido tijera");
                System.out.println("EMPATE!  Vuelve a intentarlo...");
                proves.main(null);
            }

            if (computer == 4) {
                System.out.println("El ordenador ha elegido lagarto");
                System.out.println("Tijeras decapita lagarto");
                System.out.println("VICTORIA!");

            }

            if (computer == 5) {
                System.out.println("El ordenador ha elegido Spock");
                System.out.println("Spock rompe tijeras");
                System.out.println("DERROTA!");
            }


        }

    }

}

