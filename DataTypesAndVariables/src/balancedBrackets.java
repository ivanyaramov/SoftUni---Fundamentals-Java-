import java.util.Scanner;

public class balancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int br=0;
        boolean bool=true;
        for(int i=0;i<a;i++){
            String s = scanner.nextLine();
            if(s.charAt(0)=='('){
                br++;

            }
            if(br==2){
                bool=false;
            }
            if(s.charAt(0)==')'){
               br--;
            }
            if(br==-2){
                bool=false;
            }

        }
        if(br==0 &&bool){
            System.out.println("BALANCED");
        }
        else{
            System.out.println("UNBALANCED");
        }
    }
}
