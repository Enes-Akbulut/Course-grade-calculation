import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double math, physics, turkish, chemical, music, avarage = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Math score : ");
        math = input.nextDouble();
        if (!(math < 0 || math > 100)) {
            avarage = avarage + math;
        } else {
            avarage = 0;
        }

        System.out.println("Enter the Physics score : ");
        physics = input.nextDouble();
        if (!(physics < 0 || physics > 100)) {
            avarage=avarage+physics;
        }

        System.out.println("Enter the Turkish score : ");
        turkish = input.nextDouble();
        if (!(turkish < 0 || turkish > 100)) {
            avarage = avarage + turkish;
        }

        System.out.println("Enter the Chemical score : ");
        chemical = input.nextDouble();
        if (!(chemical < 0 || chemical > 100)) {
            avarage = avarage + chemical;
        }

        System.out.println("Enter the Music score : ");
        music = input.nextDouble();
        if (!(math < 0 || music > 100)) {
            avarage = avarage + music;
        }
        avarage=avarage/5;
        if (avarage<0){
            System.out.println("eksi not girildi hesaplamaniz yapilmayacak");
        }
        System.out.println("Avarage grade"+avarage);

        if (avarage >= 55) {
            System.out.println("You pass the class !");

        }   else{
            System.out.println("You failed the clas, see you next year :)"); }



    }
}