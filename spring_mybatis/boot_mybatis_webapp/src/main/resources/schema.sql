CREATE TABLE IF NOT EXISTS Login (
  id   INTEGER NOT NULL AUTO_INCREMENT,
  login_id   INTEGER,
  password   VARCHAR(256),
  name       VARCHAR(256),
  tell_number INTEGER,
  sex        VARCHAR(256),
  age        VARCHAR(256),
  PRIMARY KEY (id)
);