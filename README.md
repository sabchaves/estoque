📦 Sistema de Estoque – API de Gestão de Produtos

Este projeto é uma API para gerenciamento de estoque, desenvolvida com o objetivo de facilitar o controlo e a organização de produtos.
A aplicação permite que sejam realizadas operações básicas do dia a dia de um sistema de estoque, como cadastrar novos itens, consultar informações específicas, atualizar dados e remover produtos que já não são necessários.

A API foi estruturada de forma simples, clara e funcional, ideal tanto para fins de estudo quanto para uso em pequenos projetos.
Ela faz uso de um banco de dados em memória, permitindo que testes sejam feitos rapidamente, sem necessidade de instalação ou configuração adicional.

🛍️ O que o sistema oferece

O sistema trabalha com uma entidade principal: Produto.
Cada produto pode possuir informações como nome, preço, modelo e descrição. Essas características permitem que o estoque se mantenha organizado e categorizado.

Dentro da API, é possível:

Visualizar todos os produtos cadastrados
Ideal para ter uma visão geral do estoque.

Consultar produtos individualmente
Perfeito para verificar detalhes específicos sobre um item.

Adicionar novos produtos
Mantendo o estoque sempre atualizado com novos itens.

Atualizar informações de produtos existentes
Caso algo mude — preço, modelo ou nome — é possível ajustar manualmente.

Remover produtos do estoque
Para manter a lista organizada e evitar itens que já não são mais necessários.

🧠 Objetivo do projeto

O principal objetivo deste projeto é oferecer uma estrutura completa e funcional para o estudo de APIs REST utilizando Spring Boot.
Através dele, é possível compreender:

Como organizar um projeto de backend

Como criar endpoints claros e bem definidos

Como estruturar uma camada de serviço

Como trabalhar com um banco de dados simples

Como testar todas as funcionalidades utilizando ferramentas de requisição

📚 Sobre a organização interna

O projeto foi dividido em diretórios que representam diferentes responsabilidades:

Controller: controla as rotas e recebe as requisições

Serviço: contém a lógica de negócio

Modelo: define a estrutura do produto

Repositório: cuida da comunicação com o banco de dados

Essa estrutura torna o código fácil de compreender, manter e evoluir.

🗂 Para que serve este projeto

Este sistema é ideal para:

Exercícios de lógica de programação

Estudos sobre Spring Boot

Testes com APIs

Projetos escolares e universitários

Evolução para sistemas maiores no futuro

Com ele, torna-se muito mais simples entender como uma aplicação real funciona por dentro e como construir um backend organizado.

🧰 Tecnologias Utilizadas

Java

Spring Boot

Spring Web

Spring Data JPA

Maven

Lombok

H2 Database (em memória)