# API Rest utilizando JPA, Spring Boot, Ribbon e H2

## Requisitos:

- Possuir JDK 10 ou superior

## Api Rest:

- Um dos objetivos do desenvolvimento dos dois microservicos é demonstrar a diferença entre a utilização de RestTemplate e o Feign.

- Além disso, outo dos objetivos é demonstrar a utilização do Ribbon no balanceamento de carga dos microservicos.

- Obs.: Rodar o microserviço product-service 2 vezes, em portas distintas.

### Rodar microservicos em portas distintas:

- clique sobre o projeto com o botão direito do mouse

- Vá em Run As, Após Run Configurations, clique sobre o microserviço product-service no canto esquerdo da janela, clique na aba Argtuments.

- Em Vm Arguments insira -Dserver.port=9001 e clique em Run

- Após entre novamente no mesmo caminho e retire o comando anterior e clique em Run

- Os microservicos estaram rodando nas portas 8001 e 9001

### Rodar microservico item-service:

- Clique sobre o projeto, va em Run As e clique em Spring Boot App