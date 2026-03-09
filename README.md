# 📦 Sistema de Controle de Estoque (Java + MySQL)

Um sistema de gerenciamento de estoque via terminal (Console Application) desenvolvido em **Java** com integração a um banco de dados **MySQL**. O projeto implementa as operações fundamentais de um **CRUD** (Create, Read, Update, Delete) de forma interativa.

## 🚀 Funcionalidades

O sistema apresenta um menu interativo onde o usuário pode escolher as seguintes opções:
- **1. Cadastrar novo Produto:** Insere um produto no banco de dados com nome, preço e quantidade.
- **2. Listar todos os Produtos:** Consulta o banco de dados e exibe todos os produtos cadastrados e seus respectivos IDs.
- **3. Atualizar Estoque:** Altera a quantidade de um produto específico no banco de dados através do seu ID.
- **4. Remover Produto:** Exclui um produto do registro permanentemente através do seu ID.
- **5. Sair:** Encerra a aplicação de forma segura.

## 🛠️ Tecnologias Utilizadas

- **Java (JDK):** Lógica de negócios, Orientação a Objetos e entrada de dados via `Scanner`.
- **MySQL:** Banco de dados relacional para persistência das informações.
- **JDBC (Java Database Connectivity):** Comunicação entre a aplicação Java e o banco de dados.

## ⚙️ Estrutura do Projeto (Arquitetura MVC Simplificada)

- `Main.java`: Ponto de entrada da aplicação e menu interativo.
- `Produto.java`: Classe de modelo que representa os atributos e métodos de um produto.
- `ProdutoDAO.java`: Classe responsável pela comunicação com o banco de dados (Data Access Object), contendo os métodos SQL (`INSERT`, `SELECT`, `UPDATE`, `DELETE`).
- `Conexao.java`: Classe que gerencia a conexão direta com o MySQL.

- ## 🧠 O que eu aprendi neste projeto

O desenvolvimento deste sistema foi um grande passo prático para consolidar meus conhecimentos. Durante o processo, pude aprender e aplicar:

- **Integração entre Aplicação e Banco de Dados:** Entendi na prática como fazer o Java "conversar" com o MySQL utilizando o JDBC (Java Database Connectivity) e o driver Connector/J. Essa visão de como as aplicações se conectam à infraestrutura de dados é fundamental.
- **Operações CRUD e SQL Seguro:** Pratiquei a escrita de comandos SQL reais (`INSERT`, `SELECT`, `UPDATE`, `DELETE`) de dentro do código Java, utilizando `PreparedStatement` para proteger o banco de dados contra falhas e injeções de código.
- **Padrão de Projeto DAO (Data Access Object):** Aprendi a separar as responsabilidades do código. A classe `Main` foca apenas em interagir com o usuário, enquanto a `ProdutoDAO` concentra toda a lógica complexa de banco de dados, deixando o projeto limpo e organizado.
- **Gerenciamento de Recursos (Conexões):** Utilizei o bloco `try-with-resources` para garantir que as conexões com o banco de dados sejam abertas e fechadas automaticamente. Isso evita vazamentos de memória e sobrecarga no servidor de banco de dados.
- **Lógica de Menus Dinâmicos:** Consolidei o uso da classe `Scanner` junto com laços de repetição (`while`) e estruturas de decisão (`switch-case`) para criar uma navegação contínua pelo terminal.



 Desenvolvido por Guilherme Ribeiro.
