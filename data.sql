INSERT INTO category (name)
VALUES
    ('Science Fiction')
;

INSERT INTO author (first_name, last_name)
VALUES
    ('Isaac', 'Asimov')
;

INSERT INTO publisher (name)
VALUES
    ('Paw Prints')
;

INSERT INTO book (title)
VALUES
    ('Foundation and Earth')
;

-- --------------------------------------------------------------------------------------------
SELECT id INTO @book_id FROM book WHERE title = 'Foundation and Earth'
;
INSERT INTO book_category (book_id, category_id) VALUES (
    @book_id, (SELECT id FROM category WHERE name = 'Science Fiction')
);
INSERT INTO edition (isbn, book_id, publisher_id) VALUES (
    '1439507228', @book_id, (SELECT id FROM category WHERE name = 'Paw Prints')
);
-- --------------------------------------------------------------------------------------------
