create table tutores(

    id bigint not null auto_increment,
    email varchar(100) not null unique,
    senha varchar(255) not null,
    nome varchar(100) not null,
    cidade varchar(100),
    sobre varchar(255),
    telefone varchar(25),

    primary key(id)
);