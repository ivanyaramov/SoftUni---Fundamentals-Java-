import java.util.Scanner;

public class messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String s="";
        for(int i=0;i<a;i++){
            int num = Integer.parseInt(scanner.nextLine());
            switch(num){
                case 2: s+="a"; continue;
                case 22: s+="b"; continue;
                case 222: s+="c"; continue;
                case 3: s+="d"; continue;
                case 33: s+="e"; continue;
                case 333: s+="f"; continue;
                case 4: s+="g"; continue;
                case 44: s+="h"; continue;
                case 444: s+="i"; continue;
                case 5: s+="j"; continue;
                case 55: s+="k"; continue;
                case 555: s+="l"; continue;
                case 6: s+="m"; continue;
                case 66: s+="n"; continue;
                case 666: s+="o"; continue;
                case 7: s+="p"; continue;
                case 77: s+="q"; continue;
                case 777: s+="r"; continue;
                case 7777: s+="s"; continue;
                case 8: s+="t"; continue;
                case 88: s+="u"; continue;
                case 888: s+="v"; continue;
                case 9: s+="w"; continue;
                case 99: s+="x"; continue;
                case 999: s+="y"; continue;
                case 9999: s+="z"; continue;
                case 0: s+=" "; continue;
            }

        }
        System.out.println(s);
    }
}
