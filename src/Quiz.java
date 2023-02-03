import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String[] fragen = {"wie viel ist 5+4?", "wie viel ist 3*5"};
        int [] antworten = {9, 15};

        int count = 0;
        while(count < fragen.length){
            System.out.println(fragen[count]);

            Scanner scan;
            scan = new Scanner(System.in);
            int eingabeUser = scan.nextInt();

            if (eingabeUser == antworten[count]) {
                System.out.println("richtig");
                count ++;
            } else {
                System.out.println("falsch");
            }
        }
    }
}