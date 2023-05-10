CREATE TABLE IF NOT EXISTS boletim
(
   idaluno BIGINT NOT NULL,
   idturma BIGINT NOT NULL,
   faltas INTEGER NOT NULL,
   notas_media DECIMAL(25,2) NOT NULL,
   resultado_final DECIMAL(25,2) NOT NULL,
   CONSTRAINT boletim_key PRIMARY KEY (idaluno, idturma));
ALTER TABLE boletim ADD FOREIGN KEY (idaluno) REFERENCES usuario (id) ON UPDATE NO ACTION ON DELETE NO ACTION;
ALTER TABLE boletim ADD FOREIGN KEY (idturma) REFERENCES turma (id) ON UPDATE NO ACTION ON DELETE NO ACTION;


CREATE TABLE turma_has_aluno
(
  idaluno bigint NOT NULL,
  idturma bigint NOT NULL,
  CONSTRAINT turma_has_aluno_key PRIMARY KEY (idaluno, idturma),
  CONSTRAINT turma_has_aluno_idaluno_fkey FOREIGN KEY (idaluno) REFERENCES usuario (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT turma_has_aluno_idturma_fkey FOREIGN KEY (idturma) REFERENCES pturma (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
);
