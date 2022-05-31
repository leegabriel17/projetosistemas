CREATE TABLE autor (
	codigo INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	email VARCHAR(50) NOT NULL,
	senha VARCHAR(150) NOT NULL
	
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO autor ( nome, email, senha) values ( 'Administrador', 'admin@ifsp.edu.br', '$2a$10$X607ZPhQ4EgGNaYKt3n4SONjIv9zc.VMWdEuhCuba7oLAL5IvcL5.');
INSERT INTO autor ( nome, email, senha) values ( 'Maria Silva', 'maria@ifsp.edu.br', '$2a$10$Zc3w6HyuPOPXamaMhh.PQOXvDnEsadztbfi6/RyZWJDzimE8WQjaq');
INSERT INTO autor ( nome, email, senha) values ( 'Gislaine', 'gislaine@ifsp.edu.br', '$2a$10$1rHoWxZGBIPZlyGl.d5Vju7hwRJ7P.Am/KRy5Dazdx9BBInRHhczi');
CREATE TABLE permissao (
	codigo INT PRIMARY KEY,
	descricao VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE autor_permissao (
	codigo_autor INT NOT NULL,
	codigo_permissao INT NOT NULL,
	PRIMARY KEY (codigo_autor, codigo_permissao),
	FOREIGN KEY (codigo_autor) REFERENCES autor(codigo),
	FOREIGN KEY (codigo_permissao) REFERENCES permissao(codigo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO permissao (codigo, descricao) values (1, 'ROLE_CADASTRAR_CATEGORIA');
INSERT INTO permissao (codigo, descricao) values (2, 'ROLE_PESQUISAR_CATEGORIA');

INSERT INTO permissao (codigo, descricao) values (3, 'ROLE_CADASTRAR_PESSOA');
INSERT INTO permissao (codigo, descricao) values (4, 'ROLE_REMOVER_PESSOA');
INSERT INTO permissao (codigo, descricao) values (5, 'ROLE_PESQUISAR_PESSOA');

INSERT INTO permissao (codigo, descricao) values (6, 'ROLE_CADASTRAR_LANCAMENTO');
INSERT INTO permissao (codigo, descricao) values (7, 'ROLE_REMOVER_LANCAMENTO');
INSERT INTO permissao (codigo, descricao) values (8, 'ROLE_PESQUISAR_LANCAMENTO');

-- admin
INSERT INTO autor_permissao (codigo_autor, codigo_permissao) values (1, 1);
INSERT INTO autor_permissao (codigo_autor, codigo_permissao) values (1, 2);
INSERT INTO autor_permissao (codigo_autor, codigo_permissao) values (1, 3);
INSERT INTO autor_permissao (codigo_autor, codigo_permissao) values (1, 4);
INSERT INTO autor_permissao (codigo_autor, codigo_permissao) values (1, 5);
INSERT INTO autor_permissao (codigo_autor, codigo_permissao) values (1, 6);
INSERT INTO autor_permissao (codigo_autor, codigo_permissao) values (1, 7);
INSERT INTO autor_permissao (codigo_autor, codigo_permissao) values (1, 8);

--gislaine
INSERT INTO autor_permissao (codigo_autor, codigo_permissao) values (3, 1);
INSERT INTO autor_permissao (codigo_autor, codigo_permissao) values (3, 2);
INSERT INTO autor_permissao (codigo_autor, codigo_permissao) values (3, 3);
INSERT INTO autor_permissao (codigo_autor, codigo_permissao) values (3, 4);
INSERT INTO autor_permissao (codigo_autor, codigo_permissao) values (3, 5);
INSERT INTO autor_permissao (codigo_autor, codigo_permissao) values (3, 6);
INSERT INTO autor_permissao (codigo_autor, codigo_permissao) values (3, 7);
INSERT INTO autor_permissao (codigo_autor, codigo_permissao) values (3, 8);

-- maria
INSERT INTO autor_permissao (codigo_autor, codigo_permissao) values (2, 2);
INSERT INTO autor_permissao (codigo_autor, codigo_permissao) values (2, 5);
INSERT INTO autor_permissao (codigo_autor, codigo_permissao) values (2, 8);

