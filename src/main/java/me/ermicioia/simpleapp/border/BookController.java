package me.ermicioia.simpleapp.border;

import lombok.RequiredArgsConstructor;
import me.ermicioia.simpleapp.control.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {

    private final BookRepository bookRepository;
    private final BookTransformer bookTransformer;

    @GetMapping
    List<BookDto> getBooks() {
        return bookTransformer.fromEntity(bookRepository.findAll());
    }

}
