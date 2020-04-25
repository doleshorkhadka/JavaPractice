import java.util.Random;
import java.util.Scanner;

public class main {
          public static void main(String[] args){
/*
        Random rand = new Random();
//        System.out.println(rand.nextInt(10));
*/
          Scanner scanner = new Scanner(System.in);
          System.out.println("1. Cd Player ");
          System.out.println("2. DVD Player");
          System.out.println("3. Mp3 Player");
          System.out.print("Choose a player: ");

          int value = scanner.nextInt();

          if(value == 1){
              Player cd = new CdPlayer();
              cd.details();
          }
          else if (value == 2) {
              DvdPlayer dvd = new DvdPlayer();
              dvd.details();
          }
          else {
              Mp3Player mp = new Mp3Player();
              mp.details();
          }
          }
    }