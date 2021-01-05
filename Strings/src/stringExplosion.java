import java.util.Scanner;

public class stringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        StringBuilder build=new StringBuilder();
        build.append(a);
        boolean bool=true;
        String s="";
        for(int i=0;i<build.length();i++) {
            int power = 0;
            if (build.charAt(i) == '>') {


int k=i;
                while (true) {
                    if(k>=build.length()){
                        bool=false;
                        break;

                    }
                        if (build.charAt(k) == '>') {
                            s += build.charAt(k + 1);
                            power+=Integer.parseInt(s);
                            s="";
                            k++;

                        }

                        else {
                            build.replace(k, k + 1, "");
                            power--;
                        }

                        if(power==0){
                            i=k-1;
                            break;
                        }



                    if(power==0){
                        break;
                    }

                }
                if(!bool){
                    break;
                }
            }
        }
        System.out.println(build);
    }
}
