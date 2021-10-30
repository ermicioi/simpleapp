package me.ermicioia.simpleapp.border;

import lombok.RequiredArgsConstructor;
import me.ermicioia.simpleapp.control.BookAuthorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/authors")
@RequiredArgsConstructor
class AuthorController {

    private final BookAuthorRepository bookAuthorRepository;
    private final BookAuthorTransformer bookAuthorTransformer;

    @GetMapping(produces = "application/vnd.simpleapp.api+json;version=1")
    List<BookAuthorDto> getAuthors() {
        return bookAuthorTransformer.fromEntity(bookAuthorRepository.findAll());
    }

}
