# Projeto API de Veículos

Este projeto é uma API de gerenciamento de veículos desenvolvida em Java 21 com Spring Boot. O banco de dados utilizado é o H2, um banco de dados em memória. Os testes são realizados com JUnit, Mockito para mocks e Rest Assured para testes de integração. Este projeto é para fins didáticos e utiliza uma arquitetura simples em camadas.

## Descrição

A API de Veículos permite realizar operações CRUD (Criar, Ler, Atualizar, Deletar) em informações de veículos. Cada veículo possui um ID, marca, modelo, ano e preço.

## Tecnologias Utilizadas

- Java 21
- Spring Boot 3
- H2 Database
- JUnit 5
- Mockito
- Rest Assured

## Estrutura do Projeto

O projeto está organizado em uma arquitetura simples em camadas:

- **Controller:** Responsável por lidar com as requisições HTTP.
- **Service:** Contém a lógica de negócios.
- **Repository:** Interage com o banco de dados.
- **Model:** Representa as entidades do banco de dados.
- **DTO:** Objetos de Transferência de Dados usados para comunicações entre camadas.
- **Exception:** Tratamento de exceções específicas do projeto.

## Como Executar o Serviço

1. **Clone o repositório:**

    ```sh
    git clone https://github.com/seu-usuario/api-veiculos.git
    cd api-veiculos
    ```

2. **Execute o serviço:**

    ```sh
    ./mvnw spring-boot:run
    ```

3. **A API estará disponível em:**

    ```
    http://localhost:8080
    ```
4. **Consulte a documentação na seguinte url:**
     ```
    http://localhost:8080/swagger-ui/index.html
    ```
## Endpoints

### Criar um novo veículo

- **POST** `/v1/veiculos`
  - **Request Body:**
    ```json
    {
      "vin": "FR456935576504",
      "make": "HAFEI",
      "model": "Towner Passageiro 1.0 8V 48cv 7L 5p",
      "year": 2009,
      "isOlder": false
    }
    ```

### Obter todos os veículos

- **GET** `/v1/veiculos`

### Obter um veículo por ID

- **GET** `/v1/veiculos/{id}`

### Atualizar um veículo

- **PUT** `/v1/veiculos/{id}`
- **Request Body:**
    ```json
    {
      "vin": "FR456935576504",
      "make": "HAFEI",
      "model": "Towner Passageiro 1.0 8V 48cv 7L 5p",
      "year": 2009,
      "isOlder": false
    }
    ```

### Deletar um veículo

- **DELETE** `/v1/veiculos/{id}`

## Testes

### Executar testes unitários e de integração

```sh
./mvnw test
```
## Licença
Este projeto é licenciado sob a Licença MIT. Veja o arquivo LICENSE para mais detalhes.

## Aviso
Este projeto foi desenvolvido para fins didáticos e não deve ser utilizado em produção. Ele demonstra uma arquitetura simples em camadas e as tecnologias mencionadas acima.

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

## Autor
Desenvolvido por Rodrigo Ferreira.