# Gerador de links para Whatsapp

### Requisitos para build e execução local:
- JDK 17
- Docker

### Build local:
```shell
  docker build -t linkwhatsapp:latest . 
```
### Execução local:
```shell
  docker run --name linkwhatsapp -d -p 8080:8080 linkwhatsapp:latest
``` 

### Endpoint hospedado no Azure
<span style="color:darkorange; font-weight: bold; font-size: 11px">POST</span> ``` https://generatedlinkwhatsapp.azurewebsites.net/url/create ```

```json
{
    "number": "5511916683119",
    "text": "boa noite estou testando essa API e se funcionar irá abrir a conversa no Whatsapp com essa conversa!"
}
```