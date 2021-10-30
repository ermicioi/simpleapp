package me.ermicioia.simpleapp.border;

import lombok.RequiredArgsConstructor;
import me.ermicioia.simpleapp.control.BookAuthorEntity;
import me.ermicioia.simpleapp.control.BookAuthorRepository;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Nonnull;
import javax.validation.Valid;
import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.stream.Collectors;

import static me.ermicioia.simpleapp.border.ControllerConstants.CSV_VERSION_1;
import static me.ermicioia.simpleapp.border.ControllerConstants.JSON_VERSION_1;

@RestController
@RequestMapping("/authors")
@RequiredArgsConstructor
class BookAuthorController {

    private final BookAuthorRepository bookAuthorRepository;
    private final BookAuthorTransformer bookAuthorTransformer;

    @GetMapping(produces = JSON_VERSION_1)
    List<BookAuthorDto> getAuthors() {
        return bookAuthorTransformer.fromEntity(bookAuthorRepository.findAll());
    }

    @GetMapping(produces = CSV_VERSION_1)
    ResponseEntity<Resource> getAuthorsCsv() {
        final List<BookAuthorDto> authors = bookAuthorTransformer.fromEntity(bookAuthorRepository.findAll());
        final String content = authors.stream()
                .map(author -> String.format("%s, %s", author.getFirstName(), author.getLastName()))
                .collect(Collectors.joining("\\n"));

        final byte[] contentBytes = content.getBytes();

        final InputStreamResource resource = new InputStreamResource(new ByteArrayInputStream(contentBytes));

        final HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=authors.csv");

        return ResponseEntity.ok()
                .headers(headers)
                .contentLength(contentBytes.length)
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(resource);
    }

    @PostMapping(consumes = JSON_VERSION_1)
    void addAuthor(@RequestBody @Valid final BookAuthorDto bookAuthor) {
        bookAuthorRepository.save(bookAuthorTransformer.fromDto(bookAuthor));
    }

    @PutMapping(value = "/{id}", consumes = JSON_VERSION_1)
    void updateAuthor(
            @PathVariable("id") @Nonnull final Long id,
            @RequestBody @Valid final BookAuthorDto authorDto) {
        final BookAuthorEntity author = bookAuthorRepository.getById(id);
        bookAuthorTransformer.update(author, authorDto);
        bookAuthorRepository.save(author);
    }

}
