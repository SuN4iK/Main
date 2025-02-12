package game;

import java.util.Scanner;

public class Main {
    int players;
    for(;;){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество игроков: ");
            if (players > 0) {
                return(players);
                System.out.println("Введите имя первого игрока");
            } else {
                if (players ==0){

                    System.out.println("Игра прекращена.");
                    break;

                } else if (players<0){

                    System.out.println("Число игроков не может быть меньше 0");

                } else{

                    System.out.println("Слишком много игроков!");
                }
            }

        } else{
            System.out.println("Вы ввели не число, или Ваше число слишком большое!");

        }
    }

    //ЕМАЕ ЧЕ ДЕЛАТЬ
}
