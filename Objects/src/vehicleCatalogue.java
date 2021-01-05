import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class vehicleCatalogue {
    public static class Vehicle{
        String type;
        String model;
        String color;
        int horsePower;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int brcar=0;
        int brtruck=0;
        double hpcar=0;
        double hptruck=0;
        List<Vehicle>list=new ArrayList<>();
        List<Vehicle>list2=new ArrayList<>();
        String s = scanner.nextLine();

            while (!s.equals("End")) {

                String[] arr = s.split(" ");
                Vehicle veh = new Vehicle();
                veh.type = arr[0];
                veh.model = arr[1];
                veh.color = arr[2];
                veh.horsePower = Integer.parseInt(arr[3]);
                list.add(veh);
                s = scanner.nextLine();

            }
for(Vehicle vehicle:list) {
    if (vehicle.type.equals("car")) {
        brcar++;
        hpcar += vehicle.horsePower;
    }
    if (vehicle.type.equals("truck")) {
        brtruck++;
        hptruck += vehicle.horsePower;
    }
}

        while(true) {
            s=scanner.nextLine();
            if(s.equals("Close the Catalogue")){
                break;
            }
            for(Vehicle vehicle:list){

                if(vehicle.model.equals(s)){
                    if(vehicle.type.equals("car")){
                        System.out.println("Type: Car");
                    }
                    if(vehicle.type.equals("truck")){
                        System.out.println("Type: Truck");
                    }

                    System.out.println("Model: "+vehicle.model);
                    System.out.println("Color: "+vehicle.color);
                    System.out.println("Horsepower: "+vehicle.horsePower);

                }
            }

        }
if(brcar>0) {
    System.out.printf("Cars have average horsepower of: %.2f.", hpcar / brcar);
    System.out.println();
}
else{
    System.out.printf("Cars have average horsepower of: 0.00.");
    System.out.println();

}


if(brtruck>0) {
            System.out.printf("Trucks have average horsepower of: %.2f.", hptruck / brtruck);

        }
        else{
    System.out.printf("Trucks have average horsepower of: 0.00.");

        }
    }
}
