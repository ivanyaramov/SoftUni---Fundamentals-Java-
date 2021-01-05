import java.util.Scanner;

public class rageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lost = Integer.parseInt(scanner.nextLine());
        double headset = Double.parseDouble(scanner.nextLine());
        double mouse = Double.parseDouble(scanner.nextLine());
        double keyboard = Double.parseDouble(scanner.nextLine());
        double display = Double.parseDouble(scanner.nextLine());
        int brmouse=0;
        int brheadset=0;
        int brkeyboard=0;
        int brdisplay=0;
        for(int i=1;i<=lost;i++){
            if(i%2==0){
                brheadset++;
            }
            if(i%3==0){
                brmouse++;
            }
            if(i%6==0){
                brkeyboard++;
            }
            if(i%12==0){
                brdisplay++;
            }
        }
        double obshto= brdisplay*display + brheadset*headset + brkeyboard*keyboard + brmouse*mouse;
        System.out.printf("Rage expenses: %.2f lv.",obshto);
    }
}
