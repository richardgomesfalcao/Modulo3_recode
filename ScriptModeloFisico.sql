CREATE TABLE Usuário 
( 
 idUsuário INT PRIMARY KEY,  
 Nome VARCHAR(10) NOT NULL,  
 Sobrenome VARCHAR(10) NOT NULL,  
 Email VARCHAR(30),  
 Senha VARCHAR(10) NOT NULL 
); 

CREATE TABLE Destino 
( 
 idDestino INT PRIMARY KEY,  
 Nome VARCHAR(30) NOT NULL,  
 Duração  INT NOT NULL,  
 Descrição VARCHAR(300),  
 Foto FLOAT NOT NULL,  
 Preço FLOAT NOT NULL,  
 Avaliação INT NOT NULL
); 

CREATE TABLE Reserva 
( 
 ID INT PRIMARY KEY,  
 Data DATE NOT NULL,  
 Status VARCHAR(10) NOT NULL,  
 idUsuário INT,  
 idDestino INT,  
 idFuncionário INT 
); 

CREATE TABLE Comentário 
( 
 ID INT PRIMARY KEY,  
 Texto VARCHAR(500) NOT NULL,  
 Avaliação VARCHAR(30) NOT NULL,  
 idDestino INT NOT NULL,  
 idUsuario INT NOT NULL
); 

CREATE TABLE Funcionário (
    Nome VARCHAR(10) NOT NULL,
    Sobrenome VARCHAR(10) NOT NULL,
    Cargo VARCHAR(15) NOT NULL,
    Email VARCHAR(30) NOT NULL,
    ID INT PRIMARY KEY
); 

ALTER TABLE Reserva ADD FOREIGN KEY(idUsuário) REFERENCES Usuário (idUsuário);
ALTER TABLE Reserva ADD FOREIGN KEY(idDestino) REFERENCES Destino (idDestino);
ALTER TABLE Reserva ADD FOREIGN KEY(idFuncionário) REFERENCES Funcionário (ID);
ALTER TABLE Comentário ADD FOREIGN KEY(idDestino) REFERENCES Destino (idDestino);
ALTER TABLE Comentário ADD FOREIGN KEY(idUsuario) REFERENCES Usuário (idUsuário);