/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import repo.AlbumRepository;
import repo.ArtistRepository;
import util.PersistenceUtil;
import entity.Album;
import entity.Artist;

/**
 *
 * @author user
 */
public class AlbumManager {
    public static void main(String[] args) {
    PersistenceUtil pers = new PersistenceUtil();
    Artist artist = new Artist("Delah", "India");
    Artist artist2 = new Artist("Nana", "Japan");
    Artist artist3 = new Artist("Marylion", "USA");
    }

}
