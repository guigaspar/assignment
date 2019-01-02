# Assignment

Aplicação Angular e Spring Boot

Para executar o programa, basta fazer o download e navegar até o diretório do projeto(/assignments) e executar o comando mvn spring-boot:run. Pode ser importado em alguma IDE Java(eclipse/intellij) e executar pela Application.Class

Optei por criar uma aplicação AngularJS consumindo serviços Rest, estes serviços concentrando as lógicas de negócio. 
Endpoints da aplicação:

http://localhost:8080/home (SPA do angular)

http://localhost:8080/customers (GET - Retorna todos os clientes)

http://localhost:8080/customers (POST - Cria o cliente)

Para testar os serviços via Postman, segue a coleção:
https://www.getpostman.com/collections/1afc60b924fa0addc352

O banco de dados utilizado é um banco H2 in memory(ao desligar a aplicação, os dados não são mantidos no bd).
Para verificar como os dados estão sendo persistidos no banco de dados, acessar:
http://localhost:8080/h2-console/
