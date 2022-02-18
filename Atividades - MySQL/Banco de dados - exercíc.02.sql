create database db_RH

use db_RH;

create table tb_funcionaries(
id bigint auto_increment,
nome varchar(255) not null,
habilidade varchar(255),
salario varchar(255),
faltasjustificadas varchar(255),
beneficio varchar(255),
);

insert into tb_funcionaries (nome, habilidade, salario, faltasjustificadas,beneficio)
 values ("Helena", "Inteligência emocional", " 2200 ", "5", "Vale-transporte");
 insert into tb_funcionaries (nome, habilidade, salario, faltasjustificadas,beneficio)
 values ("Larissa", "Liderança", " 2100 ", "2", "Vale-alimentação");
 insert into tb_funcionaries (nome, habilidade, salario, faltasjustificadas,beneficio)
 values ("Lane", "Criatividade", " 1800 ", "1", "Convênio Médico");
 insert into tb_funcionaries (nome, habilidade, salario, faltasjustificadas,beneficio)
 values ("Izabela", "Resiliência", " 1900 ", "4", "Vale-refeição");
 
select * from tb_funcionaries
 
select * from tb_funcionaries where salario >= 2000;

select * from tb_funcionaries where salario < 2000;