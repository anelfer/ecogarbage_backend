CREATE TABLE IF NOT EXISTS garbage_points
(

    id          SERIAL PRIMARY KEY,
    name        VARCHAR(255),
    description VARCHAR(255),
    lng         DOUBLE PRECISION,
    lat         DOUBLE PRECISION,
    createdAt   timestamp,
    updateAt    timestamp

);