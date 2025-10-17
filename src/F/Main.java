package F;

public class Main {

    static void main(String[] args) {

    Album one = new Album("master of puppets", "Metallica", 1987);
    Album two = new Album("And Justice for All", "Metallica", 1989);
//    Album three = new Album("Tunnel of love", "Bruce Springsteen", 1985);

    /*default constructors*/
    Collection collection = new Collection();
    collection.addToAlbumList(one);
    collection.addToAlbumList(two);
    /*on the fly instance creation*/
    collection.addToAlbumList(new Album("Tunnel of Love", "Bruce Springsteen",1985));

    collection.showCollection();




    }

}
