create database escola;

use escola;

create table professor (
    cod_prof int not null auto_increment,
    nome varchar(30), disciplina varchar(20), idade int,
    primary key (cod_prof));


insert into professor (nome,disciplina,idade) 
values
('Rolando Nero', 'Matemática', 45);

insert into professor (nome,disciplina,idade) 
values
('Raimundo Lero', 'Física', 32);


create table aluno (
    cod_aluno int not null auto_increment,
    nome varchar(30), matricula varchar(5), numdisciplinas int,
    primary key (cod_aluno));

insert into aluno (nome,matricula,numdisciplinas) 
values
('Pachco Vargas', '34345', 3);

insert into aluno (nome,matricula,numdisciplinas) 
values
('Tereza Lopes', '65467', 4);

insert into aluno (nome,matricula,numdisciplinas) 
values
('Joana Dark', '87844', 1);





