# Spring boot - Keycloak

[Documentação do Keycloak](https://www.keycloak.org/documentation)

### Docker

Executar comando docker-compose para subir instancia do Keycloak com PostgreSQL.

```
docker-compose up -d
```

### Criar um realm "desenvolvimento"

1. Acessar [painel keycloak](http://localhost:8080/auth/admin) e selecionar add realm.

![image](https://user-images.githubusercontent.com/20303042/102028049-e1e93080-3d86-11eb-9bde-b9d87bab1d24.png)

### Criar um client para aplicação spring-boot "desenvolvimento"

1. Após criar o realm "desenvolvimento" selecione o mesmo e crie um novo client conforme imagem abaixo:

![image](https://user-images.githubusercontent.com/20303042/102028098-296fbc80-3d87-11eb-9352-26571375fa0f.png)

2. Ao criar o client irá aparecer as demais configurações, então em "Access Type" deixe marcado como "confidential" e salve! isso habilitará a aba "Credentials", nesta aba irá conter o secret que será usado futuramente em sua aplicação spring.

![image](https://user-images.githubusercontent.com/20303042/102028257-0560ab00-3d88-11eb-8f21-464ef36b2696.png)
