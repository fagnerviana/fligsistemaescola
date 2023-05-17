CREATE TABLE IF NOT EXISTS disciplina_has_professor
(
   iddisciplina BIGINT NOT NULL,
   idprofessor BIGINT NOT NULL,
   CONSTRAINT disciplina_has_professor_key PRIMARY KEY (iddisciplina, idprofessor)
);
ALTER TABLE disciplina_has_professor ADD FOREIGN KEY (idprofessor) REFERENCES usuario (id) ON UPDATE NO ACTION ON DELETE NO ACTION;
ALTER TABLE disciplina_has_professor ADD FOREIGN KEY (iddisciplina) REFERENCES disciplina (id) ON UPDATE NO ACTION ON DELETE NO ACTION;
