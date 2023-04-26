CREATE TABLE IF NOT EXISTS avaliacao_turma_aluno
(
   idaluno BIGINT NOT NULL,
   idavaliacao BIGINT NOT NULL,
   idturma BIGINT NOT NULL,
   resultado DECIMAL
   (
      25,
      2
   )
   NOT NULL,
   CONSTRAINT avaliacao_turma_aluno_key PRIMARY KEY (idaluno, idavaliacao, idturma)
);
ALTER TABLE avaliacao_turma_aluno ADD FOREIGN KEY (idaluno) REFERENCES usuario (id) ON UPDATE NO ACTION ON DELETE NO ACTION;
ALTER TABLE avaliacao_turma_aluno ADD FOREIGN KEY (idavaliacao) REFERENCES avaliacao (id) ON UPDATE NO ACTION ON DELETE NO ACTION;
ALTER TABLE avaliacao_turma_aluno ADD FOREIGN KEY (idturma) REFERENCES turma (id) ON UPDATE NO ACTION ON DELETE NO ACTION;
