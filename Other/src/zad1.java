import java.util.Scanner;

public class zad1 {
    /**
     * validate that the value is within the valid range for a single byte
     *
     */
    public static boolean validate(int a) {
        if(a>255 || a<-1){


        return false;}
        return true;
    }

    /**
     * RLE-encode a sequence of bytes from stdin
     * a -1 in the input marks the end
     */
    public static void encode(String arr[]) {

        int br=1;




        for(int i=2;i<arr.length;i++){
            if(Integer.parseInt(arr[i])>255 || Integer.parseInt(arr[i])<-1)
            {
                System.out.println("error");
                break;
            }
            if(arr[i].equals(arr[i-1])){
                br++;
            }
            else{
                System.out.print(br+" "+arr[i-1]+" ");
                br=1;
            }

        }


        // ASSIGNMENT: your code here
    }

    /**
     * decodes RLE-encoded input
     * a -1 in the input marks the end
     */
    public static void decode(String arr[]) {

        for(int i=1;i<arr.length-1;i+=2){
            if(Integer.parseInt(arr[i])>255 || Integer.parseInt(arr[i+1])>255 || Integer.parseInt(arr[i])<-1 || Integer.parseInt(arr[i+1])<-1)
            {
                System.out.println("error");
                break;
            }

            for(int k=0;k<Integer.parseInt(arr[i]);k++){
                if(arr[i+1].equals("-1")){
                    System.out.println("error");
                    break;
                }

                System.out.print(arr[i+1]+ " ");
            }
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String[] arr = a.split(" ");

        boolean encodeMode = Boolean.parseBoolean(arr[0]);
        if (encodeMode) {
            encode(arr);
        } else {
            decode(arr);
        }
    }
}