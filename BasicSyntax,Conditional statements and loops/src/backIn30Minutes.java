import java.util.Scanner;

public class backIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        if(minutes<30){
            minutes+=30;
        }
        else{
            hours+=1;
            minutes=minutes-30;
        }
        if(hours==24){
            hours=0;
        }

        if(minutes<10){
            System.out.printf("%d:0%d", hours, minutes);
        }
        else {
            System.out.printf("%d:%d", hours, minutes);
        }
    }
}
