#Distribuição do AlpineLinux que contem a JRE
FROM eclipse-temurin:17-alpine
#Criando pasta temporária
VOLUME /tmp
#Liberando a porta 8080 do container
EXPOSE 8080
#Informando o arquivo .jar que será inserido dentro da imagem
ARG JAR_FILE=target/linkwhatsapp-1.0.jar
#Informando que o arquivo linkwhatsapp-01.0.jar no container irá se chamar app.jar
ADD ${JAR_FILE} app.jar
#Comando de inicialização do conteiner
ENTRYPOINT ["java", "-jar", "/app.jar"]
#Autor da aplicação
LABEL authors="Lucas Manhães"