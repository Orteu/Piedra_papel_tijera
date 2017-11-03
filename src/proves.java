import com.sun.xml.internal.bind.v2.TODO;

import java.util.Scanner;
import java.util.Random;


public class proves {

    public static void main(String[] args) {

        int player1;



        Scanner one = new Scanner(System.in);

        System.out.println("Introduce tu elección (piedra(1)/papel(2)/tijera(3)/lagarto(4)/Spock(5)): ");

        player1 = one.nextInt();
        int cont_player = 0;
        int cont_computer = 0;


        while (cont_computer <3 || cont_player <3) {

            // TODO Codi per fer el contador (compta pero no guarda la puntuació) (prova feta a Opción 1)

            // Opción 1: Piedra

            if (player1 == 1) {

                int computer = (int) (Math.random() * 5 + 1);


                System.out.println("Has elegido piedra");
                if (computer == 1) {

                    System.out.println("Los dos habeis sacado piedra");
                    System.out.println("EMPATE! Vuelve a intentarlo...");
                    System.out.println("Computer " + cont_computer + " - " + cont_player + " Player1");
                    System.out.println("Introduce tu elección (piedra(1)/papel(2)/tijera(3)/lagarto(4)/Spock(5)): ");
                    player1 = one.nextInt();


                } else if (computer == 2) {
                    System.out.println("El ordenador ha elegido papel");
                    System.out.println("Papel tapa piedra!");
                    System.out.println("DERROTA!");
                    cont_computer++;
                    System.out.println("Computer " + cont_computer + " - " + cont_player + " Player1");
                    System.out.println("Introduce tu elección (piedra(1)/papel(2)/tijera(3)/lagarto(4)/Spock(5)): ");
                    player1 = one.nextInt();


                } else if (computer == 3) {
                    System.out.println("El ordenador ha elegido tijera");
                    System.out.println("Piedra aplasta tijeras!");
                    System.out.println("VICTORIA!");
                    cont_player++;
                    System.out.println("Computer " + cont_computer + " - " + cont_player + " Player1");
                    System.out.println("Introduce tu elección (piedra(1)/papel(2)/tijera(3)/lagarto(4)/Spock(5)): ");
                    player1 = one.nextInt();


                } else if (computer == 4) {
                    System.out.println("El ordenador ha elegido lagarto");
                    System.out.println("Piedra aplasta lagarto!");
                    System.out.println("VICTORIA!");
                    cont_player++;
                    System.out.println("Computer " + cont_computer + " - " + cont_player + " Player1");
                    System.out.println("Introduce tu elección (piedra(1)/papel(2)/tijera(3)/lagarto(4)/Spock(5)): ");
                    player1 = one.nextInt();


                } else if (computer == 5) {
                    System.out.println("El ordenador ha elegido Spock");
                    System.out.println("Spock vaporiza Piedra!");
                    System.out.println("DERROTA!");
                    cont_computer++;
                    System.out.println("Computer " + cont_computer + " - " + cont_player + " Player1");
                    System.out.println("Introduce tu elección (piedra(1)/papel(2)/tijera(3)/lagarto(4)/Spock(5)): ");
                    player1 = one.nextInt();
                }
                if(cont_computer == 3){
                    System.out.println("El ordenador te ha ganado la partida...");
                    break;
                }

                if(cont_player == 3){
                    System.out.println("Has ganado la partida!!!");
                    break;
                }

            }


            // Opción 2: Papel

            if (player1 == 2) {

                int computer = (int) (Math.random() * 5 + 1);

                System.out.println("Has elegido papel");
                if (computer == 1) {

                    System.out.println("El ordenador ha elegido piedra");
                    System.out.println("Papel tapa piedra!");
                    System.out.println("VICTORIA!");
                    cont_player++;
                    System.out.println("Computer " + cont_computer + " - " + cont_player + " Player1");
                    System.out.println("Introduce tu elección (piedra(1)/papel(2)/tijera(3)/lagarto(4)/Spock(5)): ");
                    player1 = one.nextInt();


                } else if (computer == 2) {
                    System.out.println("Los dos habeis elegido papel");
                    System.out.println("EMPATE! Vuelve a intentarlo...");
                    System.out.println("Computer " + cont_computer + " - " + cont_player + " Player1");
                    System.out.println("Introduce tu elección (piedra(1)/papel(2)/tijera(3)/lagarto(4)/Spock(5)): ");
                    player1 = one.nextInt();

                } else if (computer == 3) {
                    System.out.println("El ordenador ha elegido tijera");
                    System.out.println("Tijeras cortan papel!");
                    System.out.println("DERROTA!");
                    cont_computer++;
                    System.out.println("Computer " + cont_computer + " - " + cont_player + " Player1");
                    System.out.println("Introduce tu elección (piedra(1)/papel(2)/tijera(3)/lagarto(4)/Spock(5)): ");
                    player1 = one.nextInt();


                } else if (computer == 4) {
                    System.out.println("El ordenador ha elegido lagarto");
                    System.out.println("Lagarto devora papel!");
                    System.out.println("DERROTA!");
                    cont_computer++;
                    System.out.println("Computer " + cont_computer + " - " + cont_player + " Player1");
                    System.out.println("Introduce tu elección (piedra(1)/papel(2)/tijera(3)/lagarto(4)/Spock(5)): ");
                    player1 = one.nextInt();

                } else if (computer == 5) {
                    System.out.println("El ordenador ha elegido Spock");
                    System.out.println("Papel desautoriza a Spock!");
                    System.out.println("VICTORIA!");
                    cont_player++;
                    System.out.println("Computer " + cont_computer + " - " + cont_player + " Player1");
                    System.out.println("Introduce tu elección (piedra(1)/papel(2)/tijera(3)/lagarto(4)/Spock(5)): ");
                    player1 = one.nextInt();
                }

                if(cont_computer == 3){
                    System.out.println("El ordenador te ha ganado la partida...");
                    break;
                }

                if(cont_player == 3){
                    System.out.println("Has ganado la partida!!!");
                    break;
                }

            }


            // Opción 3: Tijeras

            if (player1 == 3) {

                int computer = (int) (Math.random() * 5 + 1);

                System.out.println("Has elegido tijera");
                if (computer == 1) {

                    System.out.println("El ordenador ha elegido piedra");
                    System.out.println("Piedra aplasta tijeras!");
                    System.out.println("DERROTA");
                    cont_computer++;
                    System.out.println("Computer " + cont_computer + " - " + cont_player + " Player1");
                    System.out.println("Introduce tu elección (piedra(1)/papel(2)/tijera(3)/lagarto(4)/Spock(5)): ");
                    player1 = one.nextInt();


                } else if (computer == 2) {
                    System.out.println("El ordenador ha elegido papel");
                    System.out.println("Tijeras cortan papel!");
                    System.out.println("VICTORIA!");
                    cont_player++;
                    System.out.println("Computer " + cont_computer + " - " + cont_player + " Player1");
                    System.out.println("Introduce tu elección (piedra(1)/papel(2)/tijera(3)/lagarto(4)/Spock(5)): ");
                    player1 = one.nextInt();

                } else if (computer == 3) {
                    System.out.println("Los dos habeis elegido tijera");
                    System.out.println("EMPATE!  Vuelve a intentarlo...");
                    System.out.println("Computer " + cont_computer + " - " + cont_player + " Player1");
                    System.out.println("Introduce tu elección (piedra(1)/papel(2)/tijera(3)/lagarto(4)/Spock(5)): ");
                    player1 = one.nextInt();

                } else if (computer == 4) {
                    System.out.println("El ordenador ha elegido lagarto");
                    System.out.println("Tijeras decapita lagarto!");
                    System.out.println("VICTORIA!");
                    cont_player++;
                    System.out.println("Computer " + cont_computer + " - " + cont_player + " Player1");
                    System.out.println("Introduce tu elección (piedra(1)/papel(2)/tijera(3)/lagarto(4)/Spock(5)): ");
                    player1 = one.nextInt();

                } else if (computer == 5) {
                    System.out.println("El ordenador ha elegido Spock");
                    System.out.println("Spock rompe tijeras!");
                    System.out.println("DERROTA!");
                    cont_computer++;
                    System.out.println("Computer " + cont_computer + " - " + cont_player + " Player1");
                    System.out.println("Introduce tu elección (piedra(1)/papel(2)/tijera(3)/lagarto(4)/Spock(5)): ");
                    player1 = one.nextInt();
                }

                if(cont_computer == 3){
                    System.out.println("El ordenador te ha ganado la partida...");
                    break;
                }

                if(cont_player == 3){
                    System.out.println("Has ganado la partida!!!");
                    break;
                }


            }

            // Opción 4: Lagarto

            if (player1 == 4) {

                int computer = (int) (Math.random() * 5 + 1);

                System.out.println("Has elegido lagarto");
                if (computer == 1) {

                    System.out.println("El ordenador ha elegido piedra");
                    System.out.println("Piedra aplasta lagarto!");
                    System.out.println("DERROTA!");
                    cont_computer++;
                    System.out.println("Computer " + cont_computer + " - " + cont_player + " Player1");
                    System.out.println("Introduce tu elección (piedra(1)/papel(2)/tijera(3)/lagarto(4)/Spock(5)): ");
                    player1 = one.nextInt();
                }

                if (computer == 2) {
                    System.out.println("El ordenador ha elegido papel");
                    System.out.println("Lagarto devora a papel!");
                    System.out.println("VICTORIA!");
                    cont_player++;
                    System.out.println("Computer " + cont_computer + " - " + cont_player + " Player1");
                    System.out.println("Introduce tu elección (piedra(1)/papel(2)/tijera(3)/lagarto(4)/Spock(5)): ");
                    player1 = one.nextInt();

                }

                if (computer == 3) {
                    System.out.println("El ordenador ha elegido tijera");
                    System.out.println("Tijeras decapitan a lagarto...");
                    System.out.println("DERROTA!");
                    cont_computer++;
                    System.out.println("Computer " + cont_computer + " - " + cont_player + " Player1");
                    System.out.println("Introduce tu elección (piedra(1)/papel(2)/tijera(3)/lagarto(4)/Spock(5)): ");
                    player1 = one.nextInt();
                }

                if (computer == 4) {
                    System.out.println("El ordenador ha elegido lagarto");
                    System.out.println("Los dos habeis elegido a Lagarto...");
                    System.out.println("EMPATE!");
                    System.out.println("Computer " + cont_computer + " - " + cont_player + " Player1");
                    System.out.println("Introduce tu elección (piedra(1)/papel(2)/tijera(3)/lagarto(4)/Spock(5)): ");
                    player1 = one.nextInt();

                }

                if (computer == 5) {
                    System.out.println("El ordenador ha elegido Spock");
                    System.out.println("Lagarto envenena a Spock!");
                    System.out.println("VICTORIA!");
                    cont_player++;
                    System.out.println("Computer " + cont_computer + " - " + cont_player + " Player1");
                    System.out.println("Introduce tu elección (piedra(1)/papel(2)/tijera(3)/lagarto(4)/Spock(5)): ");
                    player1 = one.nextInt();
                }

                if(cont_computer == 3){
                    System.out.println("El ordenador te ha ganado la partida...");
                    break;
                }

                if(cont_player == 3){
                    System.out.println("Has ganado la partida!!!");
                    break;
                }

            }

            // Opción 5: Spock

            if (player1 == 5) {

                int computer = (int) (Math.random() * 5 + 1);

                System.out.println("Has elegido Spock");
                if (computer == 1) {

                    System.out.println("El ordenador ha elegido piedra");
                    System.out.println("Spock vaporiza piedra!");
                    System.out.println("VICTORIA!");
                    cont_player++;
                    System.out.println("Computer " + cont_computer + " - " + cont_player + " Player1");
                    System.out.println("Introduce tu elección (piedra(1)/papel(2)/tijera(3)/lagarto(4)/Spock(5)): ");
                    player1 = one.nextInt();


                }

                if (computer == 2) {
                    System.out.println("El ordenador ha elegido papel");
                    System.out.println("Papel desautoriza a Spock!");
                    System.out.println("DERROTA!");
                    cont_computer++;
                    System.out.println("Computer " + cont_computer + " - " + cont_player + " Player1");
                    System.out.println("Introduce tu elección (piedra(1)/papel(2)/tijera(3)/lagarto(4)/Spock(5)): ");
                    player1 = one.nextInt();

                }

                if (computer == 3) {
                    System.out.println("El ordenador ha elegido tijera");
                    System.out.println("Spock rompe tijeras!");
                    System.out.println("VICTORIA!");
                    cont_player++;
                    System.out.println("Computer " + cont_computer + " - " + cont_player + " Player1");
                    System.out.println("Introduce tu elección (piedra(1)/papel(2)/tijera(3)/lagarto(4)/Spock(5)): ");
                    player1 = one.nextInt();


                }

                if (computer == 4) {
                    System.out.println("El ordenador ha elegido lagarto");
                    System.out.println("Lagarto envenena a Spock!");
                    System.out.println("DERROTA!");
                    cont_computer++;
                    System.out.println("Computer " + cont_computer + " - " + cont_player + " Player1");
                    System.out.println("Introduce tu elección (piedra(1)/papel(2)/tijera(3)/lagarto(4)/Spock(5)): ");
                    player1 = one.nextInt();

                }

                if (computer == 5) {
                    System.out.println("El ordenador ha elegido Spock");
                    System.out.println("Los dos habeis elegido Spock...");
                    System.out.println("EMPATE!  Vuelve a intentarlo...");
                    System.out.println("Computer " + cont_computer + " - " + cont_player + " Player1");
                    System.out.println("Introduce tu elección (piedra(1)/papel(2)/tijera(3)/lagarto(4)/Spock(5)): ");
                    System.out.println("");
                    player1 = one.nextInt();
                }
                if(cont_computer == 3){
                    System.out.println("El ordenador te ha ganado la partida...");
                    break;
                }

                if(cont_player == 3){
                    System.out.println("Has ganado la partida!!!");
                    break;
                }


            } else if (player1 > 5) {
                System.out.println("ERROR: Valor introducido no válido.");
                proves.main(null);
            }

        }

    }

}

