# Projeto de Adoção de Animais

## Tecnologias Utilizadas

- Spring Boot com Java
- Maven para gerenciamento de dependências
- Banco de dados My SQL
- Flyway para controle de Migration


## Tarefas
### Primeira Tarefa: Criando um controller para Tutor
- Iniciado o projeto criando um controller para a classe tutor
- Primeira inserção usando o postman na seguinte URL:
```javascript
// URL: http://localhost:8080/tutores (POST)
{
    "nome":"Luciano Lessa",
    "email":"luciano@adopet.com",
    "senha":"Root1234"
}
```
### Permitindo uma atualização
```javascript
// URL: http://localhost:8080/tutores/1 (PUT)
{
    "nome":"Luciano Cordeiro Lessa",
    "telefone":"(81) 3341-4247",
    "cidade":"Recife",
    "sobre":"Descrição do tutor"
}
```