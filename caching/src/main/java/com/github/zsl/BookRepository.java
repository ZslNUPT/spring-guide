package com.github.zsl;

public interface BookRepository {

    Book getByIsbn(String isbn);

}