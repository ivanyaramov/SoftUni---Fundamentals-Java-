import java.util.Scanner;

public class multiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String sh="";
        StringBuilder build=new StringBuilder();
        int ostatuk=0;
        int b = Integer.parseInt(scanner.nextLine());
        int k=0;
        if(a.isEmpty()) {
            a="0";
        }
        else {
            if (a.charAt(0) == '0') {
                for (int i = 0; i <= a.length(); i++) {
                    if (a.charAt(i) == '0') {
                        k++;
                    } else {
                        break;
                    }
                }
            }
        }
for(int i=a.length()-1;i>=k;i--){
    sh+=a.charAt(i);
    int current=Integer.parseInt(sh);
    sh="";
    int sum=b*current;
    if(sum%10+ostatuk>9){
        build=build.append((sum%10+ostatuk)%10);
        ostatuk=(sum%10+ostatuk)/10;
    }
    else {
       build= build.append(sum % 10 + ostatuk);
        ostatuk=sum/10;
    }
    if(i==k){
        if(ostatuk>0)
        build=build.append(ostatuk);
    }



}

build=build.reverse();
        if (build.charAt(0) == '0') {
            for(int i=0;i<build.length()-1;i++){
                if(build.charAt(i)=='0'){
                    build.replace(i,i+1,"");
                    i--;
                }
                else{
                    break;
                }
            }


        }
        System.out.println(build);

    }
}
