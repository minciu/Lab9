/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repo;

import entity.Artist;
import javax.persistence.*;
import util.PersistenceUtil;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class ArtistRepository {
    EntityManagerFactory entity;

    public ArtistRepository(EntityManagerFactory entity) {
        this.entityManagerFactory = entity;
    }
    
    public void create(Artist artist) {
        EntityManager entity2 = entity.createEntityManager();
        EntityTransaction entity3;
        entity3 = entityManager.getTransaction();
        entity3.begin();
        entity2.persist(artist);
        entity3.commit();
    }
    public Artist findById(int id){
        EntityManager entity2 = entity.createEntityManager();
        Artist artist;
        artist = entity2.find(Artist.class, id);
        return artist;
    
    }
    
    public List<Artist> findByName(String nume){
        EntityManager entity2 = entityManagerFactory.createEntityManager();

        Query col = entity2.createNamedQuery("Artist.findByName");
        col.setParameter("name",nume);
        List<Artist> artists = new ArrayList<>();
            artists = col.getResultList();
        
        
        
        return artists;
    }
}
