import java.util.Scanner;

public class snowBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        double max=0;
        int sSnow=0;
        int sTime=0;
        int sQuality=0;
        double sValue=0;
        int maxsnow=0;
        int maxtime=0;
        int maxquality=0;
        for(int i=0;i<a;i++){
             sSnow = Integer.parseInt(scanner.nextLine());
             sTime = Integer.parseInt(scanner.nextLine());
             sQuality = Integer.parseInt(scanner.nextLine());
            sValue=Math.pow((double)sSnow/sTime,sQuality);
            if(sValue>max){
                max=sValue;
                maxsnow=sSnow;
                maxquality=sQuality;
                maxtime=sTime;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",maxsnow,maxtime,max,maxquality);
    }
}
