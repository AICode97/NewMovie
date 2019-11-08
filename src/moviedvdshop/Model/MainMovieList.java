/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviedvdshop.Model;

import java.sql.SQLException;
import java.util.ArrayList;
import moviedvdshop.DataMappers.MovieMapper;

/**
 *
 * @author thor
 */
public class MainMovieList {
    ArrayList<Movie> movies;
  
    
    public MainMovieList() throws ClassNotFoundException, SQLException{
        movies = new ArrayList<>();
        fillListFromDB();
    }
    public ArrayList<Movie>getMovieList(){
        return movies;
        
    }
    public void fillListFromDB() throws ClassNotFoundException, SQLException{
        movies= MovieMapper.movieList();
    }
    public void filllistFromFile(){
            movies = null;
    }
	
}
