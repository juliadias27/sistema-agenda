# 📞 Sistema de Agenda Telefônica (Java)

## 📌 Descrição do Projeto

Este projeto consiste em uma **aplicação de agenda telefônica em Java**, desenvolvida com o objetivo de **praticar Programação Orientada a Objetos (POO)**, sintaxe básica da linguagem Java e organização de código.

A aplicação funciona via **console**, permitindo ao usuário cadastrar, listar, buscar e remover contatos.

---

## 🎯 Objetivos

* Aplicar os conceitos fundamentais de **POO**
* Praticar o uso de **classes, objetos e métodos**
* Trabalhar com **listas (`List` / `ArrayList`)**
* Utilizar **tratamento de exceções**
* Separar responsabilidades entre classes
* Preparar base para futura migração para **Spring Boot**

---

## 🛠️ Tecnologias Utilizadas

* **Java**
* **Scanner** (entrada de dados pelo console)
* **List / ArrayList**
* **Tratamento de exceções (`try/catch`)**

---

## 🧱 Estrutura do Projeto

### 📂 Classes do Sistema

#### 🔹 `SistemaAgenda`

Responsável pela **interação com o usuário** via console.
Apresenta o menu de opções e chama os métodos da classe `Agenda`.

Funções principais:

* Exibir menu
* Ler dados do usuário
* Tratar exceções
* Controlar o fluxo da aplicação

---

#### 🔹 `Agenda`

Responsável pela **regra de negócio** da aplicação.

Funções principais:

* Adicionar contato
* Listar contatos
* Buscar contato pelo nome
* Remover contato pelo ID
* Garantir que não existam contatos duplicados (ID ou telefone)

---

#### 🔹 `Contato`

Representa a **entidade contato**.

Atributos:

* `id`
* `nome`
* `telefone`

Responsabilidades:

* Armazenar os dados do contato
* Validar os dados no construtor
* Garantir que nenhum contato inválido seja criado

---

## 📋 Funcionalidades

* ✅ Cadastrar contato
* ✅ Listar todos os contatos
* ✅ Buscar contato pelo nome
* ✅ Remover contato pelo ID
* ✅ Validação de dados
* ✅ Tratamento de erros

---

## ⚠️ Validações Implementadas

As validações são feitas **no construtor da classe `Contato`**, garantindo a integridade dos dados:

* ID não pode ser negativo
* Nome não pode ser vazio ou nulo
* Telefone deve conter 11 dígitos

Caso alguma validação falhe, uma `IllegalArgumentException` é lançada e tratada no sistema.

---

## ▶️ Como Executar o Projeto

1. Compile as classes Java
2. Execute a classe `SistemaAgenda`
3. Utilize o menu exibido no console para interagir com a aplicação

---

## 🚀 Possíveis Melhorias Futuras

* Persistência de dados em arquivo ou banco de dados
* Criação de interface gráfica
* Migração para **Spring Boot**
* Implementação de API REST
* Validações com Bean Validation (`@NotNull`, `@Size`, etc.)

---

## 👩‍💻 Autora

Projeto desenvolvido por **Júlia Dias Mendes**, com foco em aprendizado e evolução em Java e Programação Orientada a Objetos.

---

## 📚 Observação Final

Este projeto foi desenvolvido com fins educacionais e serve como base para estudos mais avançados em **Spring Boot e desenvolvimento backend**.
