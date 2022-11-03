/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/**
 *
 * @author klazutin
 */
public class RatingRegister {
    private HashMap<Film, List<Rating>> overallRatings;
    private HashMap<Person, HashMap<Film, Rating>> personalRatings;
    
    public RatingRegister() {
        this.overallRatings = new HashMap<Film, List<Rating>>();
        this.personalRatings = new HashMap<Person, HashMap<Film, Rating>>();
    }
    
    public void addRating(Film film, Rating rating) {
        if (!overallRatings.containsKey(film)){
            overallRatings.put(film, new ArrayList<Rating>());
        }
        overallRatings.get(film).add(rating);
    }
    
    public List<Rating> getRatings(Film film) {
        return this.overallRatings.get(film);
    }
    
    public Map<Film, List<Rating>> filmRatings() {
        return this.overallRatings;
    }
    
    public void addRating(Person person, Film film, Rating rating) {
        if (!personalRatings.containsKey(person)){
            personalRatings.put(person, new HashMap<Film, Rating>());
        }
        personalRatings.get(person).put(film, rating);
        this.addRating(film, rating);
    }
    
    public Rating getRating(Person person, Film film) {
        if (personalRatings.get(person).containsKey(film)) {
            return personalRatings.get(person).get(film);
        } else {
            return Rating.NOT_WATCHED;
        }
    }
    
    public Map<Film, Rating> getPersonalRatings(Person person) {
        if (personalRatings.containsKey(person)) {
            return personalRatings.get(person);
        } else {
            return new HashMap<Film, Rating>();
        }
    }
    
    public List<Person> reviewers() {
        ArrayList<Person> result = new ArrayList<Person>();
        result.addAll(personalRatings.keySet());
        return result;
    }
    
}
