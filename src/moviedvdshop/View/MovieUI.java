package moviedvdshop.View;

import moviedvdshop.Model.MainMovieList;
import moviedvdshop.Model.Movie;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thor
 */
public class MovieUI {

	// får en liste med film-objekter

	public static void viewMovieList(MainMovieList movieList) { 
		for (Movie m : movieList.getMovieList()) {
			System.out.println("Title" + m.getDirector());
		}
	}
	
}	