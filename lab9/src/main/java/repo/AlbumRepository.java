/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repo;

import javax.persistence.*;
import entity.Album;
import entity.Artist;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author user
 */
public class AlbumRepository {
    EntityManagerFactory entity;

    public AlbumRepository(EntityManagerFactory entity) {
        this.entity = entity;
    }
    
    public void create(Album album) {
        EntityManager entity2 = entity.createEntityManager();
        EntityTransaction entity3;
        
            entity3 = entity2.getTransaction();
            entity3.begin();
            entity2.persist(album);
            entity3.commit();
            
    }
    
    public Album findById(int id){
        EntityManager entity2 = entityManagerFactory.createEntityManager();
            Album album;
            album = entity2.find(Album.class, id);
            return album;
    }
    
    public List<Album> findByArtist(Artist artist){
        EntityManager entity2 = entityManagerFactory.createEntityManager();

        Query col = entity2.createNamedQuery("Album.findByArtist");
        col.setParameter("artist_id",artist.getId());
        List<Album> album = new ArrayList<>();
        album = col.getResultList();
        return album;
    }
    
    public List<Album> findByName(String name){
        EntityManager entity2 = entityManagerFactory.createEntityManager();

        Query col = entity2.createNamedQuery("Album.findByName");
        col.setParameter("name",name);
        List<Album> album = new ArrayList<>();
       
            album = col.getResultList();
           return album; 
        }
}
