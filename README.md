# Bank QA Automation Project

![Build Status](https://img.shields.io/badge/build-passing-brightgreen)
![Cucumber](https://img.shields.io/badge/Cucumber-7.29.0-blue)
![Java](https://img.shields.io/badge/Java-17-orange)
![Maven](https://img.shields.io/badge/Maven-Project-blue)

Este projeto é um exemplo de automação de testes de operações bancárias, desenvolvido durante o bootcamp **PcD Tech Bradesco – Java & QA Developer** da DIO.

O projeto utiliza **Java**, **JUnit 4/5** e **Cucumber** para implementar testes automatizados seguindo a abordagem **BDD (Behavior Driven Development)**.
---

## Funcionalidades testadas

| Funcionalidade | Cenário de Teste |
|----------------|----------------|
| Depósito       | Depositar dinheiro em uma conta existente |
| Saque          | Sacar dinheiro de uma conta existente |
| Transferência  | Transferir dinheiro entre contas de diferentes usuários |

---
## Estrutura do projeto
```
    bankqa/
    │
    ├─ src/
    │ ├─ main/java/bank/ # Classes do sistema bancário (BankSystem, Account, User)
    │ └─ test/java/steps/ # Steps do Cucumber
    │ └─ test/resources/features/ # Features do Cucumber
    │
    ├─ pom.xml # Gerenciador de dependências Maven
    └─ README.md
```
---
## Tecnologias utilizadas

- Java 17
- Maven
- JUnit 4/5
- Cucumber 7.29.0
- Selenium (opcional para testes de UI)
---

## Como executar os testes

1. Clone o repositório:

```bash
    git clone <URL_DO_REPOSITORIO>
    cd bankqa
```
2. Compile o projeto:

```bash
  mvn clean compile
```

3. Execute os testes do Cucumber:
```bash
  mvn test
```

4. Relatórios HTML serão gerados em:

```bash
    target/cucumber-reports.html
```

## Observações

Este projeto é um exemplo didático de QA automatizado.

Todos os testes estão implementados com BDD, seguindo a sintaxe Gherkin.

Possível evolução: integração com Selenium para testes de interface, cobertura de mais cenários e testes de exceções.


## Autor
Gabriel Conceição
Bootcamp PcD Tech Bradesco – Java & QA Developer