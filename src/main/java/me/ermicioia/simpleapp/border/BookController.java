package me.ermicioia.simpleapp.border;

import lombok.RequiredArgsConstructor;
import me.ermicioia.simpleapp.control.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {

    private final BookRepository bookRepository;
    private final BookTransformer bookTransformer;
    private final BookV2Transformer bookV2Transformer;

    @GetMapping
    List<BookDto> getBooks() {
        return bookTransformer.fromEntity(bookRepository.findAll());
    }

    @GetMapping("/v2")
    List<BookV2Dto> getBooksV2() {
        return bookV2Transformer.fromEntity(bookRepository.findAll());
    }

}
