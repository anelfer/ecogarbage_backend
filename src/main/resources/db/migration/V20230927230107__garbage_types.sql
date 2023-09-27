CREATE TABLE IF NOT EXISTS garbage_types
(

    id          SERIAL PRIMARY KEY,
    type        varchar(128),
    name        varchar(256),
    description varchar(512),
    createdAt   timestamp

);