ALTER TABLE Veiculo DROP CONSTRAINT FKVeiculo652748;
ALTER TABLE Reserva DROP CONSTRAINT FKReserva520514;
ALTER TABLE Reserva DROP CONSTRAINT FKReserva762773;
ALTER TABLE Pagamento DROP CONSTRAINT FKPagamento765087;
ALTER TABLE Manutencao DROP CONSTRAINT FKManutencao178953;
ALTER TABLE Historico_utilizacao DROP CONSTRAINT FKHistorico_553925;
ALTER TABLE Historico_utilizacao DROP CONSTRAINT FKHistorico_311666;
ALTER TABLE Endereco DROP CONSTRAINT FKEndereco841202;
ALTER TABLE Vaga DROP CONSTRAINT FKVaga791300;

DROP TABLE Historico_utilizacao;
DROP TABLE Pagamento;
DROP TABLE Reserva;
DROP TABLE Vaga;
DROP TABLE Manutencao;
DROP TABLE Veiculo;
DROP TABLE Endereco;
DROP TABLE Funcionario;
DROP TABLE Cliente;
