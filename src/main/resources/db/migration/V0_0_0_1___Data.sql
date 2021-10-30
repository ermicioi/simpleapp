INSERT INTO book (id, title) VALUES
    (1, 'The Mysterious Island'),
    (2, 'Twenty Thousand Leagues Under the Sea'),
    (3, 'Jules Verne: Four Novels'),
    (4, 'Second Foundation'),
    (5, 'Harry Potter and the Chamber of Secrets'),
    (6, 'Harry Potter and the Philosopher’s Stone')
;

INSERT INTo book_author (id, first_name, last_name) VALUES
    (1, 'Jules', 'Verne'),
    (2, 'Isaac', 'Asimov'),
    (3, 'Joanne', 'Rowling')
;

INSERT INTO book_author_map (book_id, author_id) VALUES
    (1, 1),
    (2, 1),
    (3, 1),
    (4, 2),
    (5, 3),
    (6, 3)
;

INSERT INTO book_category (id, name) VALUES
    (1, 'Science Fiction'),
    (2, 'Child Adventure')
;

INSERT INTO book_category_map (book_id, category_id) VALUES
    (1, 1),
    (2, 1),
    (3, 1),
    (4, 1),
    (5, 2),
    (6, 2)
;

INSERT INTO book_publisher (id, name) VALUES
    (1, 'Wordsworth Editions'),
    (2, 'Canterbury Classics'),
    (3, 'HarperVoyager'),
    (4, 'Bloomsbury Children\'s Books')
;

INSERT INTO book_edition (id, isbn, book_id, publisher_id) VALUES
    (1, '1840226242', 1, 1),
    (2, '9781853260315', 2, 1),
    (3, '1607103176', 3, 2),
    (4, '0553382594', 4, 3),
    (5, '152663788X', 5, 4),
    (6, '1526626586', 6, 4)
;
