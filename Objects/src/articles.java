import java.util.Scanner;

public class articles {
    public static class Article {
        static String title;
        static String content;
        static String author;

        Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }
    }
    static void edit(String nov){
        Article.content=nov;
    }
    static void changeAuthor(String nov){
        Article.author=nov;
    }
    static void rename(String nov){
        Article.title=nov;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] arr=s.split(", ");
        Article article=new Article(arr[0],arr[1],arr[2]);
        int a = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<a;i++){
            String f = scanner.nextLine();
            String[] komanda=f.split(": ");
            if(komanda[0].equals("Edit")){
                edit(komanda[1]);
            }
            if(komanda[0].equals("ChangeAuthor")){
                changeAuthor(komanda[1]);
            }
            if(komanda[0].equals("Rename")){
                rename(komanda[1]);
            }
        }

        System.out.printf("%s - %s: %s",article.title,article.content,article.author);

    }
}
