import java.text.DecimalFormat;
import java.util.Scanner;

public class datatypefinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean banov=true;
        boolean y=true;
        String a="";
        while(true){
             a = scanner.nextLine();
            if(a.equals("END")){
                break;
            }
            for(int k=0;k<a.length();k++){
                if(a.charAt(k)!=45 && a.charAt(k)!=46){
                    y=false;

                }}
                if(y){
                    if(a.length()==1){
                        System.out.printf("%s is character type",a);
                        System.out.println();
                    }
                    else {
                        System.out.printf("%s is string type", a);
                        System.out.println();
                    }
                    continue;
                }

            if(a.equalsIgnoreCase("true")||a.equalsIgnoreCase("false")){
                System.out.printf("%s is boolean type",a);
                System.out.println();
            }
            else{
                for (int i=0;i<a.length();i++){
                if((a.charAt(i)>57 || a.charAt(i)<48) && a.charAt(i)!=46 &&a.charAt(i)!=45){
                    banov=false;
                }}
                    if(!banov){
                        if(a.length()==1){
                            System.out.printf("%s is character type",a);
                            System.out.println();

                        }
                        else{
                        System.out.printf("%s is string type",a);
                        System.out.println();}
                        banov=true;
                    }
                    else{double s = Double.parseDouble(a);
                        if(s%1<1 && s%1!=0){

                            String m = new DecimalFormat("0.####").format(s);

                            System.out.printf("%s is floating point type",m);
                            System.out.println();
                        }
                        else{
                            System.out.printf("%.0f is integer type",s);
                            System.out.println();
                        }

                    }
              /*  else{
                    double s = Double.parseDouble(a);
                    if(s%1<1 && s%1!=0){
                        System.out.printf("%f is a floating point type",s);
                        System.out.println();
                    }
                    else{
                        System.out.printf("%.0f is integer type",s);
                        System.out.println();
                    }
                }*/


            }
            y=true;
        }


    }
}
