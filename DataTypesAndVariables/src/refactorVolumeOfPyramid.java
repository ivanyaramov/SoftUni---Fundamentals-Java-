import java.util.Scanner;

public class refactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length: ");
        double dul = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        double sh = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        double H = Double.parseDouble(scanner.nextLine());
        double V = (dul*sh*H) / 3;
        System.out.printf("Pyramid Volume: %.2f", V);

    }
}
