import java.util.Scanner;

public class theimitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        StringBuilder build= new StringBuilder();
        build.append(line);
        while(true){
            String a = scanner.nextLine();
            if(a.equals("Decode")){
                break;
            }
            String[] arr=a.split("\\|");
            if(arr[0].equals("Move")){
                int i=0;
                while(true) {
                    if(i==Integer.parseInt(arr[1])){
                        break;
                    }
                    build.append(build.charAt(0));
                    build.replace(0,1,"");
                    i++;
                }
            }



            if(arr[0].equals("Insert")){
                build.insert(Integer.parseInt(arr[1]),arr[2]);
            }

            if(arr[0].equals("ChangeAll")){
                String current=build.toString();
                current=current.replace(arr[1],arr[2]);
                build.replace(0,build.length(),"");
                build.append(current);

            }


        }
        System.out.print("The decrypted message is: ");
        System.out.println(build);
    }
}
