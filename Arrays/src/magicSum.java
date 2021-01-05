import java.util.Scanner;

public class magicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] arrstring = a.split(" ");
        int[] arr = new int[arrstring.length];
        int broi = Integer.parseInt(scanner.nextLine());
        int arr2[] = new int[arrstring.length];
        int br1 = 0;
        boolean bool = true;
        for (int l = 0; l < arrstring.length; l++) {
            arr[l] = Integer.parseInt(arrstring[l]);
        }


        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr.length; i++) {
                if (k != i) {
                    if (arr[k] + arr[i] == broi) {
                        for (int g = 0; g < arr.length; g++) {
                            if (arr2[g] == i)
                                bool = false;
                        }
                        if (bool) {
                            System.out.print(arr[k] + " ");
                            System.out.println(arr[i]);
                            arr2[br1] = k;
                            br1++;
                        } else {
                            bool = true;
                        }

                    }
                }
            }
        }
    }
}

