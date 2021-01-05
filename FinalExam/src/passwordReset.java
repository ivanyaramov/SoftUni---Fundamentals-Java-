import java.util.Scanner;

public class passwordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pw = scanner.nextLine();
        String nova="";
        while(true){
            String a = scanner.nextLine();
            if(a.equals("Done")){
                break;
            }
            String[] arr= a.split(" ");
            if(arr[0].equals("TakeOdd")){
                for(int i=1;i<pw.length();i+=2){
                    nova+=pw.charAt(i);

                }
                pw=nova;
                nova="";
                System.out.println(pw);

            }

            else if(arr[0].equals("Cut")){

                StringBuilder build = new StringBuilder();
                build.append(pw);
                build.replace(Integer.parseInt(arr[1]),Integer.parseInt(arr[1])+Integer.parseInt(arr[2]),"");
                pw=build.toString();
                System.out.println(pw);
            }
            else if(arr[0].equals("Substitute")){
                int index=pw.indexOf(arr[1]);
                if(index<0){
                    System.out.println("Nothing to replace!");
                }
                else{
                    pw=pw.replace(arr[1],arr[2]);
                    System.out.println(pw);
                }
            }
        }

        System.out.print("Your password is: ");
        System.out.println(pw);
    }
}
