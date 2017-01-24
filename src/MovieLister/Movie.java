package MovieLister;

import java.util.List;

/**
 * Created by RyanHarper on 1/17/17.
 */
public class Movie {
    private String title;
    private String genre;

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public static String getGenreFromUser(int x) {
        String genre;
        switch (x) {
            case (1):
                genre = "Animated";
                break;
            case (2):
                genre = "Musical";
                break;
            case (3):
                genre = "Comedy";
                break;
            case (4):
                genre = "Drama";
                break;
            case (5):
                genre = "Horror";
                break;
            case (6):
                genre = "Scifi";
                break;
            default:
                genre = "";
                break;
        }
        return genre;
    }
    //Now that we have the users genre, int x, we now sort through all the movies in movieList and find each movie that has the genre the user chose.
    public static List sortGenre(int x, List<Movie> movieList) {
        for (int i = 0; i < movieList.size(); i++) {
            if (movieList.get(i).getGenre().equalsIgnoreCase(getGenreFromUser(x))) {
                System.out.println(movieList.get(i).getTitle());
            }
        }
        return movieList;
    }
}
