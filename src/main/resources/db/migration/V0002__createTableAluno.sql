
CREATE TABLE aluno(
    id bigint not null auto_increment,
    nome varchar(150) not null,
    frequencia boolean,
    primary key (id)
);