import java.util.Scanner;

public class evenAndOddSubstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] chisla= a.split(" ");
        int sumodd=0;
        int sumeven=0;
        int[] chislaint=new int[chisla.length];
        for(int i=0;i<chisla.length;i++){
            chislaint[i]=Integer.parseInt(chisla[i]);
            if(chislaint[i]%2==0){
                sumeven+=chislaint[i];
            }
            else{
                sumodd+=chislaint[i];
            }
        }
        System.out.println(sumeven-sumodd);
    }
}
