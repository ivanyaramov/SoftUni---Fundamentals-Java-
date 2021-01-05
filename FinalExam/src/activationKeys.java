import java.util.Scanner;

public class activationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        StringBuilder build= new StringBuilder();
        build.append(code);
        while(true){
            String a = scanner.nextLine();
            if(a.equals("Generate")){
                break;
            }
            String[] arr= a.split(">>>");
            if(arr[0].equals("Contains")){
                if(code.contains(arr[1])){
                    System.out.printf("%s contains %s%n",code,arr[1]);
                }
                else{
                    System.out.println("Substring not found!");
                }
            }


            if(arr[0].equals("Flip")){
                int start=Integer.parseInt(arr[2]);
                int end=Integer.parseInt(arr[3]);
                String replaced="";
                if(arr[1].equals("Upper")){

                    for(int i=start;i<end;i++){
                       char c= Character.toUpperCase(code.charAt(i));
                       replaced+=c;

                    }
                    build.replace(start,end,replaced);
                    code=build.toString();
                }
                else{
                    for(int i=start;i<end;i++){
                        char c= Character.toLowerCase(code.charAt(i));
                        replaced+=c;

                    }
                    build.replace(start,end,replaced);
                    code=build.toString();

                }
                System.out.println(code);

            }



            if(arr[0].equals("Slice")){
                int start=Integer.parseInt(arr[1]);
                int end=Integer.parseInt(arr[2]);
                build.replace(start,end,"");
                code=build.toString();
                System.out.println(code);

            }



        }
        System.out.print("Your activation key is: ");
        System.out.println(code);
    }
}
