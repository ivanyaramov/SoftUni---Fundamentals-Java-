import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class validUsernames {
    public static boolean bool (String word){
        if (word.length() < 3 || word.length() > 16) {
           return false;
        }
        for(int y=0;y<word.length();y++){
            if(!Character.isLetter(word.charAt(y))&&!Character.isDigit(word.charAt(y)) && word.charAt(y)!='-' && word.charAt(y)!='_' ){
                return false;
            }
        }


        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        List<String> list= new ArrayList<>();
        String[] arr= a.split(", ");
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);

        }
       for(int i=0;i<list.size();i++){
           if(!bool(list.get(i))){
               list.remove(i);
               i--;
           }
       }
        for(String s:list){
            System.out.println(s);
        }

    }
}
