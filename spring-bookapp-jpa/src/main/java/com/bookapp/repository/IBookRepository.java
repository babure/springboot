package com.bookapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.*;

import com.bookapp.model.Book;

@Repository
public interface IBookRepository extends JpaRepository<Book,Integer>{
	//derived queries
	List<Book> findByAuthor(String author);
	List<Book> findByCategory(String category);
	List<Book> findByPriceLessThan(double price);
    
	//custom query
	@Query("from Book b where b.author= ?1 and b.price< ?2")
	List<Book> findByAutPrice(String auth,double cost);
	
	//native query
	@Query(value = "select * from book b where b.author= ?1 and b.price< ?2",nativeQuery = true)
	List<Book> findByAuthAndPrice(String author, double cost);
}
