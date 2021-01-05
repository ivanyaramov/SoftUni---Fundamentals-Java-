import java.util.Scanner;

public class equalSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] arrstring=a.split(" ");
        int[]arr=new int[arrstring.length];
        for(int l=0;l<arrstring.length;l++){
            arr[l]=Integer.parseInt(arrstring[l]);
        }
        int suml=0,sumr=0, br=0;
        boolean bool=false;
        for(int k=0;k<arr.length;k++){
            for(int i=0;i<arr.length;i++){
                if(i<k){
                    suml+=arr[i];
                }
                else if(i>k){
                    sumr+=arr[i];
                }
                else{
                    br=i;
                }

            }
            if(sumr==suml){
                System.out.println(br);
                bool=true;
            }
            suml=0;
            sumr=0;
            br=0;

        }
        if(!bool){
            System.out.println("no");
        }

    }
}
