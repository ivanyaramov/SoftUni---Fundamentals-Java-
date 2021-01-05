import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class students2 {
    static class Students {
        String firstname;
        String lastname;
        int age;
        String hometown;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<Students> list = new ArrayList();
        while (!s.equals("end")) {
            String[] arr = s.split(" ");
            Students info = new Students();
            info.firstname = arr[0];
            info.lastname = arr[1];
            info.age = Integer.parseInt(arr[2]);
            info.hometown = arr[3];
            boolean bool = true;
            for (int i = 0; i < list.size(); i++) {
                if (info.firstname.equals(list.get(i).firstname) && info.lastname.equals(list.get(i).lastname)) {
                    list.set(i,info);
                    bool = false;
                    break;
                }
            }
            if (bool) {
                list.add(info);
            }
            s = scanner.nextLine();


        }
        String grad = scanner.nextLine();
        for (Students student : list) {
            if (student.hometown.equals(grad)) {
                System.out.printf("%s %s is %d years old", student.firstname, student.lastname, student.age);
                System.out.println();
            }


        }
    }
}

