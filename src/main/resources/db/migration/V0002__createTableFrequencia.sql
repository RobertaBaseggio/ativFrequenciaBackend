CREATE TABLE frequencia(
    id bigint not null,
    id_aluno bigint not null,
    frequencia varchar(20),
    data Date,
    primary key(id)
);

ALTER TABLE frequencia ADD CONSTRAINT fk_aluno_frequencia FOREIGN KEY (id_aluno) REFERENCES aluno (id);

