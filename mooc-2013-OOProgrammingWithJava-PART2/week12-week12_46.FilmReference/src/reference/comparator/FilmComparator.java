/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author klazutin
 */
public class FilmComparator implements Comparator<Film> {
    private Map<Film, List<Rating>> ratings;
    
    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }
    
    private double getAverageScore(Film film) {
        int sumRatings = 0;
        int countRatings = 0;
        for (Rating rating : ratings.get(film)) {
            sumRatings += rating.getValue();
            countRatings++;
        }
        return sumRatings / countRatings;
    }    

    @Override
    public int compare(Film film1, Film film2) {
        if(getAverageScore(film2) > getAverageScore(film1)) {
            return 1;
        } else if (getAverageScore(film1) > getAverageScore(film2)) {
            return -1;
        } else {
            return 0;
        }
    }
    
}
