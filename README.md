# API de Recursos Humanos em Microserviços

## Visão Geral

Este projeto consiste em construir uma API utilizando a arquitetura de microserviços para uma empresa de Recursos Humanos (RH). A API visa fornecer funcionalidades essenciais para a gestão de recursos humanos, como gerenciamento de funcionários, departamentos, cargos, entre outros.

## Estrutura do Projeto

O projeto está organizado em vários microserviços, cada um responsável por uma funcionalidade específica:

- **Serviço de Funcionários:** Gerencia informações dos funcionários, incluindo criação, atualização, exclusão e consulta de registros.
- **Serviço de Departamentos:** Gerencia os departamentos da empresa, permitindo a criação e modificação de departamentos.
- **Serviço de Cargos:** Gerencia os cargos disponíveis na empresa e a atribuição de cargos aos funcionários.

## Tecnologias Utilizadas

- **Spring Boot:** Framework para criação de microserviços em Java.
- **Spring Cloud:** Ferramentas para facilitar a criação e gestão de microserviços.
- **Hibernate:** Framework de mapeamento objeto-relacional (ORM) para persistência de dados.
- **MySQL:** Banco de dados relacional utilizado para armazenar as informações da aplicação.
- **Docker:** Utilizado para containerização dos microserviços, garantindo portabilidade e escalabilidade.

