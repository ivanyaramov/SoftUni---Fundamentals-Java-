import java.util.Scanner;

public class beerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double obem=0;
        double maxobem=0;
        String kraino="";
        for(int i=0;i<n;i++){
            String name = scanner.nextLine();
            double r = Double.parseDouble(scanner.nextLine());
            int h = Integer.parseInt(scanner.nextLine());
            obem=Math.pow(r,2)*Math.PI*h;
            if (obem>maxobem){
                maxobem=obem;
                kraino=name;

            }


        }
        System.out.println(kraino);
    }
}
