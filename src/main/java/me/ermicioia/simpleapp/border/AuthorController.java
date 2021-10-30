package me.ermicioia.simpleapp.border;

import lombok.RequiredArgsConstructor;
import me.ermicioia.simpleapp.control.BookAuthorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Nonnull;
import javax.validation.Valid;
import java.util.List;

import static me.ermicioia.simpleapp.border.ControllerConstants.JSON_VERSION_1;

@RestController
@RequestMapping("/authors")
@RequiredArgsConstructor
class AuthorController {

    private final BookAuthorRepository bookAuthorRepository;
    private final BookAuthorTransformer bookAuthorTransformer;

    @GetMapping(produces = JSON_VERSION_1)
    List<BookAuthorDto> getAuthors() {
        return bookAuthorTransformer.fromEntity(bookAuthorRepository.findAll());
    }

    @PostMapping(consumes = JSON_VERSION_1)
    void addAuthor(@RequestBody @Valid final BookAuthorDto bookAuthor) {
        bookAuthorRepository.save(bookAuthorTransformer.fromDto(bookAuthor));
    }

}
