CREATE TABLE IF NOT EXISTS curso
(
   id SERIAL NOT NULL,
   nome VARCHAR (45) NOT NULL,
   valor DECIMAL
   (
      25,
      2
   )
   NOT NULL,
   cargahorariatotal INTEGER NOT NULL,
   CONSTRAINT curso_key PRIMARY KEY (id)
);
CREATE INDEX I1_curso on curso (nome);
ALTER TABLE IF EXISTS curso ADD CONSTRAINT U1_curso UNIQUE (nome);
