package tdd_assignment3;

import java.util.ArrayList;

public class BookStore implements Booker, Searcher,Remove {
	private ArrayList<Book> list ;
	public BookStore(){
		list = new ArrayList<Book>();
	
	}
	public Boolean AddBook(Book newBook){
		Boolean added = list.add(newBook);
		if(added){
		return true;
		}else{
		return false;
		}
	}
	public Boolean RemoveBook(String bkName){
		Boolean removed = false;
		for(Book b : list){  
			
        		if(b.name == bkName){
				list.remove(b);
				removed  = true;
				break;
			}  
    		}
		
		if(removed){
			return true;
		}else{
			return false;
		}

	}
	public Boolean search(String BookName){
		Boolean Found = false;
		for(Book book:list){  
        		if(book.name == BookName){
				Found  = true;
				break;
			}  
    		}
		if(Found){
			return true;
		}else{
			return false;
		}
	}


}
