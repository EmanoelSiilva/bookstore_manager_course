package com.emanoelsilva.bookstoremanager.repository;

import com.emanoelsilva.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
