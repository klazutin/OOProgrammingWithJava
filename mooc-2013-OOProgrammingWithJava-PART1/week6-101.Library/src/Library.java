/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author klazutin
 */
import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books = new ArrayList<Book>();
    
    public Library(){
        
    }
    
    public void addBook(Book newBook){
        books.add(newBook);
    }
    
    public void printBooks(){
        for(Book book : books){
            System.out.println(book.toString());
        }
    }
    
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> result = new ArrayList<Book>(); 
        for (Book book : books){
            if(StringUtils.included(book.title(), title)){
                result.add(book);
            }
        }
        return result;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> result = new ArrayList<Book>(); 
        for (Book book : books){
            if(StringUtils.included(book.publisher(), publisher)){
                result.add(book);
            }
        }    
        return result;
    }
    
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> result = new ArrayList<Book>(); 
        for (Book book : books){
            if(book.year() == year){
                result.add(book);
            }
        }        
        return result;
    }
}
