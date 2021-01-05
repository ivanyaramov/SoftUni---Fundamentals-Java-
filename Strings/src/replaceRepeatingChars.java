import java.util.Scanner;

public class replaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String s="";
        s+=a.charAt(0);
        for(int i=1;i<a.length();i++){

            if( a.charAt(i)!=a.charAt(i-1)) {
                s += a.charAt(i);
            }
            if(a.charAt(i)==a.charAt(i-1)){

                while(true){
                    if(i>=a.length()){
                        break;
                    }
                    if(a.charAt(i)!=a.charAt(i-1) ){
                        i--;
                        break;
                    }
                    i++;
                }
            }
        }
        System.out.println(s);
    }
}
