CREATE TABLE IF NOT EXISTS disciplina_has_curso
(
   iddisciplina BIGINT NOT NULL,
   idcurso BIGINT NOT NULL,
   CONSTRAINT disciplina_has_curso_key PRIMARY KEY (iddisciplina, idcurso)
);
ALTER TABLE disciplina_has_curso ADD FOREIGN KEY (iddisciplina) REFERENCES disciplina (id) ON UPDATE NO ACTION ON DELETE NO ACTION;
ALTER TABLE disciplina_has_curso ADD FOREIGN KEY (idcurso) REFERENCES curso (id) ON UPDATE NO ACTION ON DELETE NO ACTION;