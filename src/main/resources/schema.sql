CREATE SEQUENCE IF NOT EXISTS vehicles_id_seq START WITH 100 INCREMENT BY 1;

CREATE TABLE IF NOT EXISTS vehicles (
     id SERIAL primary key,
     renavam varchar(255),
     make varchar(255),
     model varchar(255),
     "year" bigint,
     plate varchar(20),
     color varchar(255),
     is_older bool,
     active bool,
     created_at timestamp,
     updated_at timestamp,
     deleted_at timestamp
);