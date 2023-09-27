CREATE TABLE IF NOT EXISTS news
(

    id          SERIAL PRIMARY KEY,
    title       varchar(128),
    text        text,
    preview_img text,
    createdAt   timestamp

);