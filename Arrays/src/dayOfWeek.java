import java.util.Scanner;

public class dayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        String arr[]=new String[]{"Monday","Tuesday","Wednesday","Thursday", "Friday","Saturday", "Sunday"};
        if(day>0 && day<8){
            System.out.println(arr[day-1]);
        }
        else{
            System.out.println("Invalid day!");
        }




    }
}
