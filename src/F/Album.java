package F;

public class Album {
    /*properties*/
    private String title;
    private String author;
    private int year;

    /*constructor*/
    public Album(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void show(){
        System.out.println(title + " , " + author + " , " + year);

    }



}/*end class*/
