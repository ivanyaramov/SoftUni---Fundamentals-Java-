import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class songs {
    static class Song{
        String typelist;
        String name;
        String time;
    }

    static List<Song> songs=new ArrayList();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<n;i++){
            String line = scanner.nextLine();
            Song song=new Song();
            String[] arr=line.split("_");
            song.typelist=arr[0];
            song.name=arr[1];
            song.time=arr[2];
            songs.add(song);

        }
        String uslovie= scanner.nextLine();
        if(uslovie.equals("all")){
            for(Song a:songs){
                System.out.println(a.name);

            }
        }

        else{

            for(Song a:songs){
                if(a.typelist.equals(uslovie)){
                    System.out.println(a.name);
                }
            }
        }
    }
}

