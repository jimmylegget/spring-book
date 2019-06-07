package com.springbook.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
/**
 * Created by qida on 2017/8/23.
 */
public interface BookRepository extends JpaRepository<Book,Long> {
}
