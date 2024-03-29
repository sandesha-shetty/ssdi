package com.ssdi.bookshare;

import com.ssdi.bookshare.model.Book;
import com.ssdi.bookshare.model.User;
import com.ssdi.bookshare.repository.BookRepository;
import com.ssdi.bookshare.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookshareApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookshareApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(UserRepository repository, BookRepository bookRepository){
		return args -> {
			User user1 = new User("sss","ss","a@gmail.com","9802820980");
			Book book1 = new Book("Lord of the Rings","J R MArtin",66.5,true);
			user1.add(book1);
			repository.save(new User("aan","shetty","a@gmail.com","9802820980"));
			repository.save(new User("ban","shetty","b@gmail.com","9802820981"));
			repository.save(new User("can","shetty","c@gmail.com","9802820982"));
			repository.save(new User("dan","shetty","d@gmail.com","9802820983"));
			repository.save(new User("ean","shetty","e@gmail.com","9802820984"));
			repository.save(new User("fan","shetty","f@gmail.com","9802820985"));
			repository.save(new User("gan","shetty","f@gmail.com","9802820986"));
			repository.save(user1);


		};

	}

}
