package F;

import java.util.ArrayList;

public class Collection {

    public ArrayList<Album> albumList = new ArrayList<>();

    public ArrayList<Album> addToAlbumList(Album album) {
        albumList.add(album);
        return albumList;

    }
    /*show the album list*/
    public void showCollection(){
        if (albumList.isEmpty()){
            System.out.println("sorry no albums in the list");
        } else {
            System.out.println("here is my collection!");
        }
        for (Album sinlgleAlbum : albumList){
            sinlgleAlbum.show();
        }
    }



}

