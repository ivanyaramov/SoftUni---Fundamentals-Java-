import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class appendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        List<Character> list = new ArrayList<>();
        String total="";
        String total2="";
        for(int i=0;i<line.length();i++){

            if(line.charAt(i)!=' ' && line.charAt(i)!='|'){

                list.add(line.charAt(i));
                if(i<line.length()-1 && line.charAt(i+1)!=' ' && line.charAt(i+1)!='|'){
                    list.add('*');
                }


            }

            if(line.charAt(i)=='|' || i==line.length()-1){
                int br=list.size();
                for(int k=0;k<br;k++){
                    total=total+list.get(0);
                    list.remove(0);

                    if(k==br-1){
                        total2=total+total2;
                        total="";
                    }
                }

            }

        }
        for(int y=0;y<total2.length();y++){

            System.out.print(total2.charAt(y));
            if(y<total2.length()-1 && total2.charAt(y+1)=='*'){
                y++;
            }
            else{
                System.out.print(" ");
            }
        }


    }
}