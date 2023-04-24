CREATE TABLE IF NOT EXISTS turma_has_professor
(
   idaluno BIGINT NOT NULL,
   idturma BIGINT NOT NULL,
   CONSTRAINT turma_has_professor_key PRIMARY KEY (idaluno, idturma)
);
ALTER TABLE turma_has_professor ADD FOREIGN KEY (idaluno) REFERENCES usuario (id) ON UPDATE NO ACTION ON DELETE NO ACTION;
ALTER TABLE turma_has_professor ADD FOREIGN KEY (idturma) REFERENCES turma (id) ON UPDATE NO ACTION ON DELETE NO ACTION;
