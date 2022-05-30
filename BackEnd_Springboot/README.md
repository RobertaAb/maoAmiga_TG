# tg_suporte
<br>

# Spring Boot
O Spring Boot facilita a criação de aplicativos independentes baseados em Spring de nível de produção que você pode "apenas executar".
Temos uma visão otimista da plataforma Spring e das bibliotecas de terceiros para que você possa começar com o mínimo de barulho. A maioria dos aplicativos Spring Boot precisa de configuração mínima do Spring.
Recursos
Crie aplicativos Spring autônomos
Incorpore o Tomcat, Jetty ou Undertow diretamente (sem necessidade de implantar arquivos WAR)
Forneça dependências 'iniciais' opinativas para simplificar sua configuração de compilação
Configure automaticamente bibliotecas Spring e de terceiros sempre que possível
Forneça recursos prontos para produção, como métricas, verificações de integridade e configuração externa
Absolutamente nenhuma geração de código e nenhum requisito para configuração XML
<br>




# Referências Bibliográficas

<br>
SpringBoot.Visão Geral. Acesso em 25/04/2022 as 14h50 pelo link:
https://spring-io.translate.goog/projects/spring-boot?_x_tr_sl=en&_x_tr_tl=pt&_x_tr_hl=pt-BR&_x_tr_pto=sc


<br>
<br>
<br>
UML

Classe Usuarios
- id_usuario
- nome
- email
- senha
- status_usuario
- tipo_usuario
- role_deletar
- role_atualizar
- role_salvar

Classe Procedimento
- id_procedimento
- titulo
- problema
- solucao
+ id_usuario fk
+ id_tipo_problema fk

Classe Tipo problema
- id_tipo_problema
- descricao_problema


// USUARIOS
CREATE TABLE USUARIOS (
  id_usuario INT UNIQUE AUTOINCREMENT,
  nome VARCHAR(255),
  email VARCHAR(255),
  senha VARCHAR(255),
  status_usuario VARCHAR(255),
  tipo_usuario VARCHAR(255),
  role_deletar VARCHAR(255),
  role_atualizar VARCHAR(255),
  role_salvar VARCHAR(255)
);


// TIPO_PROBLEMA
CREATE TABLE TIPO_PROBLEMA(
  id_tipo_problema INT UNIQUE AUTOINCREMENT,
  descricao_problema VARCHAR(255)
);


// PROCEDIMENTO
CREATE TABLE PROCEDIMENTO(
  id_procedimento INT UNIQUE AUTOINCREMENT,
  titulo VARCHAR(255),
  problema VARCHAR(255),
  solucao VARCHAR(255)
  id_usuario INT
  id_tipo_problema INT
);


ALTER TABLE PROCEDIMENTO
ADD FOREIGN KEY (id_usuario) REFERENCES USUARIOS(id_usuario);

ALTER TABLE PROCEDIMENTO
ADD FOREIGN KEY (id_tipo_problema) REFERENCES TIPO_PROBLEMA(id_tipo_problema);
