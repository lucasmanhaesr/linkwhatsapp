# Gerador de links para Whatsapp

### Requisitos:
- JDK 17
- Docker

### Build:
```shell
  docker build -t linkwhatsapp:latest . 
```
### Execução:
```shell
  docker run --name linkwhatsapp -d -p 8080:8080 linkwhatsapp:latest
``` 