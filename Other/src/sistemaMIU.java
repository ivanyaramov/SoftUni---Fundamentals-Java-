import java.util.Scanner;

public class sistemaMIU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()) {
            String text = "MI";
            String input = scanner.nextLine();

                for(int i=0;i<input.length();i++) {
                    if (input.charAt(i)=='A') {
                        if (text.charAt(text.length() - 1) == 'I') {
                            text += "U";
                        }
                    }
                    if (input.charAt(i)=='B') {
                        text+=text.substring(1,text.length());


                    }
                    if (input.charAt(i)=='C') {

                int ind=text.indexOf("III");
                while(ind>=0){
                    text=text.substring(0,ind)+"U"+text.substring(ind+3,text.length());
                    ind=text.indexOf("III");
                }

                    }
                    if (input.charAt(i)=='D') {
                    text=text.replace("UU","");
                    }

                }

            System.out.println(text);

        }
    }
}
