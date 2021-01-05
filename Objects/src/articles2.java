import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class articles2 {
     public static class Article {
         String title;
        String content;
        String author;}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Article> list=new ArrayList<>();
        List<Article> list2=new ArrayList<>();
        for(int i=0;i<n;i++){
            String s = scanner.nextLine();
            String[] arr=s.split(", ");
            Article article=new Article();
            article.title=arr[0];
            article.content=arr[1];
            article.author=arr[2];
            list.add(article);
        }


        String komanda = scanner.nextLine();

        if(komanda.equals("title")){
            list.stream().sorted((p1,p2) -> p1.title.compareTo(p2.title))
                    .forEach(person -> list2.add(person));


        }
        if(komanda.equals("content")){
            list.stream().sorted((p1,p2) -> p1.content.compareTo(p2.content))
                    .forEach(person -> list2.add(person));



        }
        if(komanda.equals("author")){
            list.stream().sorted((p1,p2) -> p1.author.compareTo(p2.author))
                    .forEach(person -> list2.add(person));



        }
        for(Article b : list2){
            System.out.print(b.title+" - "+b.content+": "+b.author);
            System.out.println();
        }



    }
}
