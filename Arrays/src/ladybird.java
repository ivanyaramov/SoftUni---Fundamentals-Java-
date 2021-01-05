import java.util.Scanner;

public class ladybird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int[] arr= new int[a];
        String s = scanner.nextLine();
        String[] arrstring = s.split(" ");
        int[] arrtest = new int[arrstring.length];
        for(int i=0;i<arrstring.length;i++){

            arrtest[i]=Integer.parseInt(arrstring[i]);

        }

        for(int i=0;i<arrtest.length;i++){
            if(arrtest[i]>=0 && arrtest[i]<arr.length) {
                arr[arrtest[i]] = 1;
            }

        }
        while(true){
            String komanda = scanner.nextLine();
            if(komanda.equals("end")){
                break;
            }
            String[] komandastring=komanda.split(" ");
            int e1 = Integer.parseInt(komandastring[0]);
            int e2= Integer.parseInt(komandastring[2]);
            if(e1>=arr.length || e1<0){
                continue;
            }
            if(arr[e1]==0){
                continue;
            }
            if(komandastring[1].equals("right")){
                arr[e1]=0;
while (true) {
    if (e1 + e2 < arr.length) {
        if (arr[e1 + e2] == 0) {
            arr[e1 + e2] = 1;
            break;

        } else {
            e1 += 1;

        }

    }
    else{
        break;
    }
}


            }

            else if(komandastring[1].equals("left")){
                arr[e1]=0;
while(true) {
    if (e1 - e2 > -1) {
        if (arr[e1 - e2] == 0) {
            arr[e1 - e2] = 1;
break;
        } else {
            e1 -= 1;

        }
    }
    else{
        break;
    }

}

            }
        }


        for(int numbers: arr){
            System.out.print(numbers+" ");
        }

    }
}
