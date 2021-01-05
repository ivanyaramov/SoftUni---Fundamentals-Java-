import java.util.Scanner;

public class theLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people= Integer.parseInt(scanner.nextLine());
        String a = scanner.nextLine();
        String[] arrstring = a.split(" ");
        int[] arr = new int[arrstring.length];
        int br1 = 0;
        for (int l = 0; l < arrstring.length; l++) {
            arr[l] = Integer.parseInt(arrstring[l]);
        }
        int i=0;
        while(people>0){
            if(arr[i]<4){
                if(people>4-arr[i]){
                    people=people-(4-arr[i]);
                    arr[i]=4;

                }
                else if(people<4-arr[i]){
                    arr[i]+=people;
                    people=0;
                    System.out.println("The lift has empty spots!");
                }
                else{
                    arr[i]+=people;
                    people=0;
                    if(i==arr.length-1){

                    }
                    else{
                        System.out.println("The lift has empty spots!");
                    }
                }

            }
            else{
                i++;
            }
            if(i>=arr.length){
                System.out.printf("There isn't enough space! %d people in a queue!",people);
                System.out.println();
                break;
            }

        }

        for(int n: arr){
            System.out.print(n+" ");
        }


    }
}
