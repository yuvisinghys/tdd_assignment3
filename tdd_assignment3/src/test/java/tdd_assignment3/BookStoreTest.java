package tdd_assignment3;

import static org.junit.Assert.*;

//import static org.junit.Assert.*
import java.util.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BookStoreTest {
	private BookStore obj;
	@Before
	public void setUp() throws Exception{
	obj = new BookStore();
}

	@After
	public void tearDown() throws Exception{
	obj = null;
}
	
	@Test
	public void testAdd(){
		
		Boolean bookAdded = true;

		Book bk1 = new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		assertEquals(bookAdded, obj.AddBook(bk1));
	
		Book bk2 = new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		assertEquals(bookAdded, obj.AddBook(bk2));

		Book bk3 = new Book(103,"Operating System","Galvin","Wiley",6);
		assertEquals(bookAdded, obj.AddBook(bk3));

	}
	
	@Test
	public void testSearch(){
     
		Book bk1 = new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Book bk2 = new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		Book bk3 = new Book(103,"Operating System","Galvin","Wiley",6);
		obj.AddBook(bk1);
		obj.AddBook(bk2);
		obj.AddBook(bk3);
	
	 	String bkName = "Let us C";
	 	Boolean Found = true;
	
	 	assertEquals(Found, obj.search(bkName));

	 	bkName = "Data Communications & Networking";
	 	assertEquals(Found, obj.search(bkName));

	 	bkName = "Operating System";
	  	assertEquals(Found, obj.search(bkName));
	}
	
	@Test
	public void testRemove(){

	
	
	
	Book bk1 = new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
	Book bk2 = new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
	Book bk3 = new Book(103,"Operating System","Galvin","Wiley",6);
	obj.AddBook(bk1);
	obj.AddBook(bk2);
	obj.AddBook(bk3);
	
	String bkName = "Let us C";
	Boolean bookRemoved = true;
	
	assertEquals(bookRemoved, obj.RemoveBook(bkName));

	bkName = "Data Communications & Networking";
	assertEquals(bookRemoved, obj.RemoveBook(bkName));

	bkName = "Operating System";
	assertEquals(bookRemoved, obj.RemoveBook(bkName));



	}
}



	