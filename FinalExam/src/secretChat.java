import java.util.Scanner;

public class secretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        StringBuilder build= new StringBuilder();
        build.append(a);
        while(true){
            String line = scanner.nextLine();
            if(line.equals("Reveal")){
                break;
            }
            String[] arr= line.split(":\\|:");
            if(arr[0].equals("InsertSpace")){
                int i=Integer.parseInt(arr[1]);
                build.insert(i," ");
                a=build.toString();
                System.out.println(a);

            }

            if(arr[0].equals("Reverse")){
                String sub=arr[1];
                StringBuilder sub1=new StringBuilder();
                sub1.append(sub);
                int index=build.indexOf(sub);
                if(index<0){
                    System.out.println("error");
                }
                else{
                    build.replace(index,index+sub.length(),"");
                    sub1.reverse();
                    build.append(sub1);
                    a=build.toString();
                    System.out.println(a);
                }
            }

            if(arr[0].equals("ChangeAll")){
                String sub=arr[1];
                String replace=arr[2];
                a=a.replace(sub,replace);
                build.replace(0,build.length(),"");
                build.append(a);
                System.out.println(a);
            }

        }
        System.out.print("You have a new text message: ");
        System.out.println(a);

    }
}
