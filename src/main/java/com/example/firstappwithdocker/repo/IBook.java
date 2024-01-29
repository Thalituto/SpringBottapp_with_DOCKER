package com.example.firstappwithdocker.repo;

import com.example.firstappwithdocker.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface IBook extends JpaRepository<Book,Long> {

}
