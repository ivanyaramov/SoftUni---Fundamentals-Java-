import java.util.*;

public class legendaryfarming {
    public static void banov(Map<String,Integer> map,String material){
map.put(material,map.get(material)-250);
Map<String,Integer>realmap=new HashMap<>();
        Map<String,Integer>fakemap=new TreeMap<>();
        for (Map.Entry<String, Integer> str : map.entrySet()) {
            if(str.getKey().equals("fragments") || str.getKey().equals("motes") || str.getKey().equals("shards")){
                realmap.put(str.getKey(),str.getValue());
            }
            else{
                fakemap.put(str.getKey(),str.getValue());
            }

        }

      realmap.entrySet().stream()
              .sorted((a,b)-> {
                  if (a.getValue().compareTo(b.getValue()) == 0){
                      return a.getKey().compareTo(b.getKey());
                  }
                  return b.getValue().compareTo(a.getValue());


              })
              .forEach(pair -> System.out.printf("%s: %d%n",pair.getKey(),pair.getValue()));


        for (Map.Entry<String, Integer> str2 : fakemap.entrySet()) {
            System.out.printf("%s: %d",str2.getKey(),str2.getValue());
            System.out.println();

        }


    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> map= new HashMap<>();
        map.put("fragments",0);
        map.put("motes",0);
        map.put("shards",0);


boolean bool=true;
        while(bool){
            String a = scanner.nextLine();
            String[] arr=a.split(" ");
            for(int i=0;i<arr.length;i+=2) {


                    int quantity = Integer.parseInt(arr[i]);



                    String material = arr[i+1].toLowerCase();



                if (map.get(material) == null) {
                    map.put(material, 0);
                }
                map.put(material, map.get(material) + quantity);
                if (material.equals("shards") && map.get(material) >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    banov(map, material);
                    bool=false;
                    break;

                }
                if (material.equals("fragments") && map.get(material) >= 250) {
                    System.out.println("Valanyr obtained!");
                    banov(map, material);
                    bool=false;
                    break;

                }
                if (material.equals("motes") && map.get(material) >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    banov(map, material);
                    bool=false;

                    break;

                }
            }


        }

    }
}
