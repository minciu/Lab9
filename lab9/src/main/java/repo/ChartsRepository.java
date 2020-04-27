package repo;

import clojure.lang.Compiler;
import entity.Charts;
import javax.persistence.*;
import entity.Album;
import entity.Artist;
import java.util.ArrayList;
import java.util.List;

public class ChartsRepository {
    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MusicAlbumsPU");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    
    public List<Charts> sortAlbumsCharts(){
        List<Charts> sortedAlbums = new ArrayList<>();
        String sortingQuery = "SELECT c.id, c.album_id FROM Chart c JOIN Album a ON c.album_id = a.id ORDER BY a.release_year";
        Query query = entityManager.createQuery(sortingQuery);
        sortedAlbums = query.getResultList();
        return sortedAlbums;
    }


    /**
     * Returns a list of charts representing albums that match a genre given as parameter
     * @param musicGenre
     * @return
     */
    public List<Charts> getByGenres(String musicGenre){
        List<Charts> foundAlbums = new ArrayList<>();
        String sortingQuery = "SELECT c.id, c.album_id FROM Char c JOIN Album a ON c.album_id = a.id WHERE a.musicGenre = musicGenre";
        Query query = entityManager.createQuery(sortingQuery);
        foundAlbums = query.getResultList();
        return foundAlbums;
    }
}
