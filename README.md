# puc-javaee-projeto-final

### 1. Executar Docker MongoDB e RabbitMQ
#### 1.1. MongoDB:
```
docker run -d -p 27017:27017 -v ~/docker_data/mongodb:/data/db mong
```

#### 1.2. RabbitMQ:
```
docker run -d --hostname rabbitmq --name rabbitmq-management -p 15672:15672 -p 5671:5671 -p 5672:5672 rabbitmq:management
```

### 2. Configurar e-mail de Origem
```
Alterar constantes fromEmail e password com os dados do e-mail de Origem no arquivo /src/main/java/com/javaee/allan/mercadoacoes/emailsender/EmailSender.java
```

### 3. Executar o projeto no Eclipse

### 4. Endereços Docker:
* MongoDB: mongodb://localhost:27017
* RabbitMQ: http://localhost:15672/#/queues

### 5. API's
#### 5.1. Empresas
* Listar empersas
```
GET http://localhost:8080/api/v1/companies
```
