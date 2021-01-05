import java.util.Scanner;

public class passwordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        if(!numOfCharacters(a)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if(!lettersAndDigits(a)){
            System.out.println("Password must consist only of letters and digits");
        }
        if(!haveAtLeastTwoDigits(a)){
            System.out.println("Password must have at least 2 digits");
        }
        if(numOfCharacters(a) && lettersAndDigits(a)&& haveAtLeastTwoDigits(a)){
            System.out.println("Password is valid");
        }



    }
    static boolean numOfCharacters(String a){

        boolean bool=true;
        if (a.length() < 6 || a.length() > 10) {
           bool=false;
           return bool;
        }
        return bool;
    }


    static boolean lettersAndDigits(String a){
        boolean bool=true;
        for(int i=0;i<a.length();i++){
            if (!((a.charAt(i)>=48&&a.charAt(i)<=57) || (a.charAt(i)>=65&&a.charAt(i)<=90) || (a.charAt(i)>=97&&a.charAt(i)<=122))){
                bool=false;

                return bool;
            }

        }
        return bool;
    }



    static boolean haveAtLeastTwoDigits(String a){
        boolean bool=true;
        int br=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>=48 && a.charAt(i)<=57){
                br++;
            }
        }
        if(br<2){
            bool=false;

            return bool;
        }
        return bool;
    }

}

