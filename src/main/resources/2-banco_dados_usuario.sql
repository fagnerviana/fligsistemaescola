CREATE TABLE IF NOT EXISTS usuario
(
   id SERIAL NOT NULL,
   nome VARCHAR (45) NOT NULL,
   senha VARCHAR (45) NOT NULL,
   login VARCHAR (45) NOT NULL,
   tipousuario VARCHAR (45) NOT NULL,
   CONSTRAINT usuario_key PRIMARY KEY (id)
);
CREATE INDEX I1_usuario on usuario (login);
ALTER TABLE IF EXISTS usuario ADD CONSTRAINT U1_usuario UNIQUE (login);
