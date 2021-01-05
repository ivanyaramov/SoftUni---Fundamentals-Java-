import java.util.Scanner;

public class worldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
StringBuilder build =new StringBuilder();
        String a = scanner.nextLine();
        build.append(a);
        while(true){
            String line = scanner.nextLine();
            if (line.equals("Travel")){
                break;
            }
            String[] arr=line.split(":");
            if(arr[0].equals("Add Stop")){
                int c= Integer.parseInt(arr[1]);
                if(c<build.length()&& c>=0){
                    build.insert(c,arr[2]);

                }
                System.out.println(build);
            }

            if(arr[0].equals("Remove Stop")) {
                int c = Integer.parseInt(arr[1]);
                int d = Integer.parseInt(arr[2]);
                if (c >= 0 &&c<build.length()&& d < build.length() && d>=0) {
                    build.replace(c, d+1, "");

                }
                System.out.println(build);
            }

                if(arr[0].equals("Switch")){
                    build=new StringBuilder(build.toString().replace(arr[1],arr[2]));
                    System.out.println(build);
                }






        }

        System.out.print("Ready for world tour! Planned stops: ");
        System.out.println(build);

    }
}
