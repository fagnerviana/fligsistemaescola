CREATE TABLE IF NOT EXISTS disciplina
(
   id SERIAL NOT NULL,
   nome VARCHAR (45) NOT NULL,
   cargahoraria INTEGER NOT NULL,
   CONSTRAINT disciplina_key PRIMARY KEY (id)
);
CREATE INDEX I1_disciplina on disciplina (nome);
ALTER TABLE IF EXISTS disciplina ADD CONSTRAINT U1_disciplina UNIQUE (nome);
