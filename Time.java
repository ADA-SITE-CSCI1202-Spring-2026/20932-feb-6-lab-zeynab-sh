import java.util.Scanner;

public class Time {
    public static void main(String[] args){
        
        Scanner input = new Scanner (System.in);

        System.out.println("Enter seconds: ");
        int seconds = input.nextInt();

        int hours = seconds / 3600;
        int seconds2 = seconds % 3600;
        int minutes = seconds2 / 60;
        int seconds3 = minutes % 60;


        System.out.println(hours + " hours, " + minutes + " minutes, " + seconds3 + " seconds");

        input.close();

    }
}
