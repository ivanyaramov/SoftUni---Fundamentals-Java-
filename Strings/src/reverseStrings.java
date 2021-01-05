import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class reverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list=new ArrayList<>();
        while(true){
            String a = scanner.nextLine();
            if(a.equals("end")){
                break;
            }
            list.add(a);

        }


        for(String s: list){
            String reversed="";
            System.out.printf("%s = ",s);
            for(int i=s.length()-1;i>=0;i--){
                reversed+=s.charAt(i);
            }
            System.out.println(reversed);
        }

    }
}
