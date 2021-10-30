package me.ermicioia.simpleapp.control;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookAuthorRepository extends JpaRepository<BookAuthorEntity, Long> {
}
