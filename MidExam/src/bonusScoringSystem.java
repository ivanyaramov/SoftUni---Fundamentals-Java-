import java.util.Scanner;

public class bonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());
        double max=0;
        int att=0;
        for(int i=0;i<students;i++){
            int attendance = Integer.parseInt(scanner.nextLine());
            double totalbonus=attendance/(double)lectures*(5+bonus);
            if(totalbonus>max){
                max=totalbonus;
                att=attendance;

            }
        }
        max=Math.round(max);
        System.out.printf("Max Bonus: %.0f.",max);
        System.out.println();
        System.out.println("The student has attended "+att+" lectures.");
    }
}
