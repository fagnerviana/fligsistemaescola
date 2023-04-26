CREATE TABLE IF NOT EXISTS boletim
(
   idaluno BIGINT NOT NULL,
   idturma BIGINT NOT NULL,
   faltas INTEGER NOT NULL,
   notas_media DECIMAL
   (
      25,
      2
   )
   NOT NULL,
   resultado_final DECIMAL
   (
      25,
      2
   )
   NOT NULL,
   CONSTRAINT boletim_key PRIMARY KEY (idaluno, idturma)
);
ALTER TABLE boletim ADD FOREIGN KEY (idaluno) REFERENCES usuario (id) ON UPDATE NO ACTION ON DELETE NO ACTION;
ALTER TABLE boletim ADD FOREIGN KEY (idturma) REFERENCES turma (id) ON UPDATE NO ACTION ON DELETE NO ACTION;
