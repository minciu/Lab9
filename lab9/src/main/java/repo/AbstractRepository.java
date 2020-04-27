package repo;


import entity.Artist;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public abstract class AbstractRepository<L> {

    
    public void create(L nume){
        AlbumManager.entityManager.persist(nume);
    }
}
