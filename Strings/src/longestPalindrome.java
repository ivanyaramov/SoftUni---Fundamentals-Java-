import java.util.Scanner;

public class longestPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String b = scanner.nextLine();
        String[] a=b.split("");
        int max=0;

        for(int i=0;i<a.length;i++){
            for(int k=i;k<a.length;k++){
                if(a[i].equals(a[k])){
                    StringBuilder build=new StringBuilder();
                    build.append(b.substring(i,k+1));
                    String cur=build.toString();
                    String rev=build.reverse().toString();

                    if(cur.equals(rev)){
                        if(build.length()>max){
                            max=build.length();
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}
