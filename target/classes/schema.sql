DROP TABLE IF EXISTS test_datos_figuras;
DROP TABLE IF EXISTS test_figuras;

CREATE TABLE test_figuras (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  figura VARCHAR(250) NOT NULL
);

CREATE TABLE test_datos_figuras (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  base DECIMAL(8,2),
  altura DECIMAL(8,2),
  diametro DECIMAL(8,2),
  id_figura INT NOT NULL
);