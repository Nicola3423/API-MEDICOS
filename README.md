Projeto de Cadastro de Médicos (Spring Boot + JPA)

Descrição:

Este projeto tem como objetivo desenvolver uma aplicação web para o cadastro e gerenciamento de dados de médicos. A aplicação utiliza a tecnologia Spring Boot para a construção do backend e JPA para a persistência dos dados em um banco de dados relacional.

Tecnologias Utilizadas:

<br>Spring Boot: Framework Java para desenvolvimento de aplicações web.
<br>JPA: Java Persistence API para mapeamento objeto-relacional.
<br>vollmed_api: Banco de dados utilizado (MySQL).
<br>Lombok: Para reduzir a quantidade de código boilerplate.

Funcionalidades:

Cadastro de médicos: Permite cadastrar novos médicos com os seguintes dados:
Nome
Email
CRM
Telefone
Especialidade
Endereço (logradouro, bairro, CEP, cidade, UF)

Consulta de médicos: Permite consultar a lista de médicos cadastrados, filtrando por diversos critérios (nome, especialidade, etc.).

Edição de médicos: Permite editar os dados de um médico cadastrado.

Exclusão de médicos: Permite excluir um médico cadastrado.

Migração de dados: Cria as tabelas no banco de dados e popula-as com dados iniciais (opcional).


Instruções de Uso:
<br>Pré-requisitos:
<br>Java 7 ou superior
<br>Maven
<br>vollmed_api e um cliente para se conectar a ele
<br>Clonando o projeto:
<br>git clone https://github.com/Nicola3423/API-MEDICOS

Configurando o banco de dados:
<br>Criar um banco de dados com o nome vollmed_api.
<br>Configurar as credenciais de acesso no arquivo application.properties
<br>A aplicação estará disponível em http://localhost:8080 (ou outra porta configurada)

Feedback: Foi incrível desenvolver este projeto! Os desafios, apesar de pequenos, foram ótimos para aprimorar minhas habilidades em Spring. A experiência foi muito gratificante


Diagrama:
![api](https://github.com/user-attachments/assets/225b2d24-2861-4817-932a-735e459748a0)



