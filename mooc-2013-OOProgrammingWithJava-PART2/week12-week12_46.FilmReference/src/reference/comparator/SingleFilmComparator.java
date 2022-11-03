/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author klazutin
 */
public class SingleFilmComparator implements Comparator<Film> {
    private Map<Film, Rating> ratings;
    
    public SingleFilmComparator (Map<Film, Rating> ratings) {
        this.ratings = ratings;
    }

    @Override
    public int compare(Film f1, Film f2) {
        return ratings.get(f2).getValue() - ratings.get(f1).getValue();
    }
}
