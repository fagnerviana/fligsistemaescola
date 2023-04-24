CREATE TABLE IF NOT EXISTS turma
(
   id SERIAL NOT NULL,
   codigo VARCHAR (45) NOT NULL,
   data DATE NOT NULL,
   CONSTRAINT turma_key PRIMARY KEY (id)
);
CREATE INDEX I1_turma on turma (codigo);
ALTER TABLE IF EXISTS turma ADD CONSTRAINT U1_turma UNIQUE (codigo);
