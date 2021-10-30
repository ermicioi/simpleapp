CREATE TABLE book (
    id          INT             NOT NULL AUTO_INCREMENT,
    version     INT             NOT NULL DEFAULT 0,
    title       VARCHAR(255)    NOT NULL,
    PRIMARY KEY pk_book__id (id)
);

CREATE TABLE book_author (
    id          INT             NOT NULL AUTO_INCREMENT,
    version     INT             NOT NULL DEFAULT 0,
    first_name  VARCHAR(255)    NOT NULL,
    last_name   VARCHAR(255)    NOT NULL,
    PRIMARY KEY pk_book_author__id (id),
    CONSTRAINT uc_first_last_name UNIQUE (first_name , last_name)
);

CREATE TABLE book_author_map (
    book_id     INT NOT NULL,
    author_id   INT NOT NULL,
    FOREIGN KEY fk_book_author_map__book_id (book_id)       REFERENCES book(id),
    FOREIGN KEY fk_book_author_map__author_id (author_id)   REFERENCES book_author(id)
);

CREATE TABLE book_category (
    id      INT             NOT NULL AUTO_INCREMENT,
    version INT             NOT NULL DEFAULT 0,
    name    VARCHAR(255)    NOT NULL,
    PRIMARY KEY pk_book_category__id (id)
);

CREATE TABLE book_category_map (
    book_id         INT NOT NULL,
    category_id     INT NOT NULL,
    FOREIGN KEY fk_book_category_map__book_id (book_id)         REFERENCES book(id),
    FOREIGN KEY fk_book_category_map__category_id (category_id) REFERENCES book_category(id)
);

CREATE TABLE book_publisher (
    id      INT             NOT NULL AUTO_INCREMENT,
    version INT             NOT NULL DEFAULT 0,
    name    VARCHAR(255)    NOT NULL,
    PRIMARY KEY pk_book_publisher__id (id)
);

CREATE TABLE book_edition (
    id              INT             NOT NULL AUTO_INCREMENT,
    version         INT             NOT NULL DEFAULT 0,
    isbn            VARCHAR(255)    NOT NULL,
    book_id         INT             NOT NULL,
    publisher_id    INT             NOT NULL,
    PRIMARY KEY pk_book_edition__id (id),
    FOREIGN KEY fk_book_edition__book_id (book_id)              REFERENCES book(id),
    FOREIGN KEY fk_book_edition__publisher_id (publisher_id)    REFERENCES book_publisher(id)
);
