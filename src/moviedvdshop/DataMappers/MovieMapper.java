package moviedvdshop.DataMappers;

import java.util.ArrayList;
import moviedvdshop.Model.Movie;
import java.sql.*;
import moviedvdshop.Util.DBConnector;

/**
 *
 * @author thor
 */
public class MovieMapper {

    public static ArrayList<Movie> movieList() throws ClassNotFoundException, SQLException {
        ArrayList<Movie> returnList = new ArrayList<>();
        
     /*   `movie_id` int(11) NOT NULL AUTO_INCREMENT,
   `movie_title` varchar(100) NOT NULL,
   `director` varchar(50) NOT NULL,
   `year` year(4) NOT NULL,
   `genre_id` int(11) NOT NULL,*/
        // TODO: hent fra databasen
        Connection myConnector = null;
        Statement statement = null;
        ResultSet resultSet = null;

        myConnector = DBConnector.getConnector();
        String query = "SELECT * FROM movies";
        statement = myConnector.createStatement();
        resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            String movie_title = resultSet.getString("movie_title");
            String movie_director = resultSet.getString("director");
            int movie_id = resultSet.getInt("movie_id");
            Movie tmpMovie = new Movie(movie_id, movie_title, movie_director, "2001");
            returnList.add(tmpMovie);
        }

        //lukker efter mig
        resultSet.close();
        statement.close();
        myConnector.close();

        return returnList;
    }

}
