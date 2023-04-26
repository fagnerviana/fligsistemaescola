CREATE TABLE IF NOT EXISTS avaliacao
(
   id SERIAL NOT NULL,
   iddisciplina BIGINT NOT NULL,
   notaProva DECIMAL
   (
      25,
      2
   )
   NOT NULL,
   nome VARCHAR (45) NOT NULL,
   CONSTRAINT avaliacao_key PRIMARY KEY (id)
);
CREATE INDEX I1_avaliacao on avaliacao (nome, iddisciplina);
ALTER TABLE IF EXISTS avaliacao ADD CONSTRAINT U1_avaliacao UNIQUE (nome, iddisciplina);
ALTER TABLE avaliacao ADD FOREIGN KEY (iddisciplina) REFERENCES disciplina (id) ON UPDATE NO ACTION ON DELETE NO ACTION;
