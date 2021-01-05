import java.util.Scanner;

public class fromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String a = "";
        String b = "";
        long num1 = 0;
        long num2 = 0;
        long suml = 0;
        long sumr = 0;
        boolean bool = true;
        for (int i = 0; i < n; i++) {
            a="";
            b="";
            String s = scanner.nextLine();
            for (int k = 0; k < s.length(); k++) {
                if (s.charAt(k) == ' ') {
                    bool = false;
                    continue;

                }
                if (bool) {
                    a = a + s.charAt(k);
                }

                if (!bool) {
                    b = b + s.charAt(k);
                }


            }
            bool = true;
            num1 = Long.parseLong(a);
            num2 = Long.parseLong(b);
            if (num1 > num2) {
                while (true) {
                    suml = suml + num1 % 10;

                    num1 = num1 / 10;
                    if (num1 == 0) {
                        break;
                    }

                }
                if(suml<0){
                    suml=suml*(-1);
                }
                System.out.println(suml);
                suml=0;
            } else {
                while (true) {
                    sumr = sumr + num2 % 10;
                    num2 = num2 / 10;
                    if (num2 == 0) {
                        break;
                    }

                }
                if(sumr<0){
                    sumr=sumr*(-1);
                }
                System.out.println(sumr);
                sumr=0;


            }

        }
    }
}

