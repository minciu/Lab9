/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 *
 * @author user
 */
public class PersistenceUtil {
    private EntityManagerFactory entity ;

    public PersistenceUtil() {
        entity = Persistence.createEntityManagerFactory("MusicAlbumsPU");
    }

    public EntityManagerFactory getEntity() {
        return entity;
    }

    
}
