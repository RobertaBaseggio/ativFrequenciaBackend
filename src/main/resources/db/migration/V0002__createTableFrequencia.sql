CREATE TABLE frequencia(
    id bigint not null auto_increment,
    id_aluno bigint not null,
    frequencia boolean,
    horario varchar(30),
    data Date,
    primary key(id)
);

ALTER TABLE frequencia ADD CONSTRAINT fk_aluno_frequencia FOREIGN KEY (id_aluno) REFERENCES aluno (id);

