package entity;


public class Charts {
    
    private int id;
    private int album_id;
    
    public Album(int id, int album_id) {
        this.id = id;
        this.album_id = album_id;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    public int getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(int album_id) {
        this.album_id = album_id;
    }
}
