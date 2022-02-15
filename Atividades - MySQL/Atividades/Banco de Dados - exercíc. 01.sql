
create table tb_personagem(
id bigint auto_increment primary key,
nome varchar (255),
nivel int,
ataque int,
defesa int,
classe_id bigint, -- instaciação do bigint entre tabelas, sempre que for criar uma outra tabela precisa ter
foreign key(classe_id) references tb_classe(id)
);

insert into tb_personagem(nome, nivel, ataque, defesa, classe_id) values ("Fada Sensata", 300, 1500, 500, 1);
insert into tb_personagem(nome, nivel, ataque, defesa, classe_id) values ("Tacador de flecha", 300, 1500, 500, 3);
insert into tb_personagem(nome, nivel, ataque, defesa, classe_id) values ("Cura mais", 800, 2500, 4000, 4);

select * from tb_classe 

delete from tb_classe where id = 2;

select * from tb_classe 

select * from tb_personagem

delete from tb_personagem where id = 3;
delete from tb_personagem where id = 4;
delete from tb_personagem where id = 5;
delete from tb_personagem where id = 7;
delete from tb_personagem where id = 9;
delete from tb_personagem where id = 11;
delete from tb_personagem where id = 12;
delete from tb_personagem where id = 13;
delete from tb_personagem where id = 14;

select * from tb_personagem where ataque >= 2000;

select * from tb_personagem where defesa >= 1000 and defesa <= 2000;
-- onde pode ser feito desse jeito também:
select * from tb_personagem where defesa between 1000 and 2000;

select * from tb_personagem
inner join tb_classe on tb_classe.id = tb_personagem.classe_id

