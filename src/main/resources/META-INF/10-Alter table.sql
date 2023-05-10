ALTER TABLE disciplina ADD COLUMN idprofessor bigint;
ALTER TABLE disciplina ADD FOREIGN KEY (idprofessor) REFERENCES usuario (id) ON UPDATE NO ACTION ON DELETE NO ACTION;