package me.ermicioia.simpleapp.border;

import lombok.RequiredArgsConstructor;
import me.ermicioia.simpleapp.control.BookEditionRepository;
import me.ermicioia.simpleapp.control.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
class BookController {

    private final BookRepository bookRepository;
    private final BookEditionRepository bookEditionRepository;

    private final BookTransformer bookTransformer;
    private final BookV2Transformer bookV2Transformer;
    private final BookV3Transformer bookV3Transformer;
    private final BookV4Transformer bookV4Transformer;

    @GetMapping
    List<BookDto> getBooks() {
        return bookTransformer.fromEntity(bookRepository.findAll());
    }

    @GetMapping("/v2")
    List<BookV2Dto> getBooksV2() {
        return bookV2Transformer.fromEntity(bookRepository.findAll());
    }

    @GetMapping(params = "version=3")
    List<BookV3Dto> getBooksV3() {
        return bookV3Transformer.fromEntity(bookRepository.findAll());
    }

    @GetMapping(produces = "application/vnd.simpleapp.api+json;version=4")
    List<BookV4Dto> getBooksV4() {
        return bookV4Transformer.fromEntity(bookEditionRepository.findAll());
    }

}
