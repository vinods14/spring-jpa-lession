CREATE TABLE customer (
  id BIGINT AUTO_INCREMENT NOT NULL,
   first_name VARCHAR(255),
   last_name VARCHAR(255),
   email VARCHAR(255),
   phone VARCHAR(255),
   CONSTRAINT pk_customer PRIMARY KEY (id)
);