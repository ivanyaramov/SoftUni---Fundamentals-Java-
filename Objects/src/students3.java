import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class students3 {
    public static class Students{
        String fname;
        String lname;
        String ocenka;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Students> list=new ArrayList<>();
        List<Students> list2=new ArrayList<>();
        for(int i=0;i<n;i++){

            String[] arr=scanner.nextLine().split(" ");
            Students student=new Students();
            student.fname=arr[0];
            student.lname =arr[1];
            student.ocenka=arr[2];
            list.add(student);
        }

        list.stream().sorted((p2,p1) -> p1.ocenka.compareTo(p2.ocenka))
                .forEach(person -> list2.add(person));


        for(Students stud : list2){
            System.out.println(stud.fname+" "+stud.lname+": "+stud.ocenka);
        }
    }

}
