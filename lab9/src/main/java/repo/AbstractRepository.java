package repo;


import entity.Artist;

import javax.persistence.*;
import javax.persistence.Query;



public abstract class AbstractRepository<L> {

    
    public void create(L nume){
        AlbumManager.entityManager.persist(nume);
    }
}
