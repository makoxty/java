CREATE TABLE IF NOT EXISTS CLIENT (
  id   INTEGER NOT NULL AUTO_INCREMENT,
  clientId   INTEGER,
  name       VARCHAR(256),
  tellNumber INTEGER,
  sex        VARCHAR(256),
  age        VARCHAR(256),
  PRIMARY KEY (id)
);