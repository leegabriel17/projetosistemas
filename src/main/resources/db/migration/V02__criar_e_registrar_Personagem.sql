CREATE TABLE Personagem 
( 
 Codigo INT PRIMARY KEY NOT NULL AUTO_INCREMENT,  
 nome VARCHAR(120) NOT NULL,  
 titulo VARCHAR(50) NOT NULL,  
 idade INT,  
 data_Nascimento DATE,  
 local_de_Nascimento VARCHAR(100),  
 genero VARCHAR(20),  
 altura VARCHAR(10) NOT NULL,  
 cor_dos_Olhos VARCHAR(30),  
 porte VARCHAR(40) NOT NULL,  
 cor_da_Pele CHAR(40) NOT NULL,  
 cabelo VARCHAR(40),  
 qualidades VARCHAR(300) NOT NULL,  
 defeitos VARCHAR(300) NOT NULL,  
 traumas VARCHAR(400),  
 valores VARCHAR(300),  
 background VARCHAR(10000),  
 bebiveis VARCHAR(200),  
 alimentos VARCHAR(200),  
 conhecimentos VARCHAR(200),  
 medicinais VARCHAR(200),  
 armas VARCHAR(200)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO personagem(nome,titulo,idade,data_Nascimento,local_de_Nascimento,genero,altura,cor_dos_Olhos,porte,cor_da_Pele,cabelo,qualidades,defeitos,traumas,valores,background,bebiveis,alimentos,conhecimentos,medicinais,armas) value("Lincon","Protagonista",23,"2020-04-20","Hospital","Neutro",'1.83',"Castanho Escuro","Magro","Branco","Raspado","Altruista","Resmungão","-----","Respeito","Nasceu na roça","Cachaça","Batata Frita","Fundamental","Ataduras","De Fogo");
INSERT INTO personagem(nome,titulo,idade,data_Nascimento,local_de_Nascimento,genero,altura,cor_dos_Olhos,porte,cor_da_Pele,cabelo,qualidades,defeitos,traumas,valores,background,bebiveis,alimentos,conhecimentos,medicinais,armas) value("Astolfo","Coadjuvante",12,"2020-04-20","Casa","Masculino",'1.29',"Castanho","Gordinho","Branco","Cumprido","Bondoso","Ingenuo","Abandonado pelos pais","Heróis","Sempre quer estar ao lado dos herois","Agua","X-Buger","Carta e Emancipação","Ataduras","Io-Io");
INSERT INTO personagem(nome,titulo,idade,data_Nascimento,local_de_Nascimento,genero,altura,cor_dos_Olhos,porte,cor_da_Pele,cabelo,qualidades,defeitos,traumas,valores,background,bebiveis,alimentos,conhecimentos,medicinais,armas) value("El Loko","Antagonista",65,"2020-04-20","Lativênia","Masculino",'1.92',"Vermelho","Magro","Azul","Sem Cabelo","Não Tem","Odiar tudo que se move","Mataram sua tartaruga quano ele era criança","A Maldade","devidoa seu trauam eel quer eliminar todos seres vivos do mundo","Sangue de Inocentes","Coração de Galinha","Nada","Nada","Revolver");



