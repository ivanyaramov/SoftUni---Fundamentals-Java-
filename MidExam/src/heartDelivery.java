import java.util.Scanner;

public class heartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] arrstring = a.split("@");
        int[] arr = new int[arrstring.length];
        for (int l = 0; l < arrstring.length; l++) {
            arr[l] = Integer.parseInt(arrstring[l]);
        }
        int i=0;
        while(true){
            String s = scanner.nextLine();
            if(s.equals("Love!")){
                break;
            }
            String[] arrjump= s.split(" ");
            int jump=Integer.parseInt((arrjump[1]));
            if(i+jump>arr.length-1){
                i=0;
            }
            else{
                i+=jump;
            }

            if(arr[i]>0){
                arr[i]-=2;
                if(arr[i]<=0){
                    System.out.printf("Place %d has Valentine's day.",i);
                    System.out.println();
                }
            }
            else{
                System.out.printf("Place %d already had Valentine's day.",i);
                System.out.println();
            }





        }

        System.out.printf("Cupid's last position was %d.",i);
        System.out.println();
        int br=0;
        for(int k=0;k<arr.length;k++){
            if(arr[k]>0){
                br++;
            }
        }
        if(br==0){
            System.out.println("Mission was successful.");
        }
        else{
            System.out.printf("Cupid has failed %d places.",br);
            System.out.println();
        }


    }
}
