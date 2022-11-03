/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import reference.RatingRegister;
import reference.comparator.FilmComparator;
import reference.comparator.PersonComparator;
import reference.comparator.SingleFilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

/** 
 *
 * @author klazutin
 */
public class Reference {
    private RatingRegister register;
    
    public Reference(RatingRegister register) {
        this.register = register;
    }
    
    public Film dumbRecommendation(Person person) {
        List<Film> films = new ArrayList<Film>(register.filmRatings().keySet());
        Collections.sort(films, new FilmComparator(register.filmRatings()));
        System.out.println(films.get(0));
        return films.get(0);
    }
    
    public Film smartRecommendation(Person person) {
        HashMap<Person, Integer> personSimilarity = new HashMap<Person, Integer>();
        for (Person p : register.reviewers()) {
            if (person != p) {
                int totalRating = 0;
                for (Film f : register.getPersonalRatings(person).keySet()) {
                    int myRating = register.getRating(person, f).getValue();
                    int theirRating = register.getRating(p, f).getValue();
                    totalRating += myRating * theirRating;
                }
                personSimilarity.put(p, totalRating);
            }
        }
//        System.out.println(personSimilarity);
        ArrayList<Person> persons = new ArrayList<Person>(personSimilarity.keySet());
        Collections.sort(persons, new PersonComparator(personSimilarity));
        Person mostSimilarPerson = persons.get(0);
//        System.out.println(persons);
//        System.out.println("Most similar person: " + mostSimilarPerson);
        Map<Film, Rating> mostSimilarPersonRatings = register.getPersonalRatings(mostSimilarPerson);
//        System.out.println("Most similar person ratings: " + mostSimilarPersonRatings);
        ArrayList<Film> mostSimilarPersonFilms = new ArrayList<Film>(mostSimilarPersonRatings.keySet());
        Collections.sort(mostSimilarPersonFilms, new SingleFilmComparator(mostSimilarPersonRatings));
        Film finalFilm = null;
        for (Film f : mostSimilarPersonFilms) {
            if (!register.getPersonalRatings(person).keySet().contains(f)) {
                finalFilm = f;
                break;
            }
        }
        return finalFilm;
    }
    
    public Film recommendFilm(Person person) {
        Film result = null;
        if (register.getPersonalRatings(person).keySet().isEmpty()) {
            result = dumbRecommendation(person);
        } else {
            result = smartRecommendation(person);
        }
        return result;
    }
}

// 1. find similarity with each person in the reviewers list
//    sum of products of rankings of films watched by both
// for films we both watched:
// 1a.calculate sum of products of rankings of me
// 1b.calculate sum of products of rankings of every other person
// 1c.find the person with the biggest similarity value
// 2. find the film that this person has watched that I haven't watched
//     with the highest rating
