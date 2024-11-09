 CREATE TABLE medicos (
       id INT AUTO_INCREMENT PRIMARY KEY,
       crm VARCHAR(20) NOT NULL,
       email VARCHAR(255) NOT NULL,
       bairro VARCHAR(255),
       cep VARCHAR(8),
       cidade VARCHAR(255),
       complemento VARCHAR(255),
       logradouro VARCHAR(255),
       numero VARCHAR(20),
       uf VARCHAR(2),
       especialidade VARCHAR(255),
       nome VARCHAR(255) NOT NULL
     );