# 🔐 JWT Auth API

API de autenticação desenvolvida com Spring Boot utilizando JSON Web Tokens (JWT).
O projeto implementa um fluxo completo de autenticação com boas práticas de segurança e arquitetura.

---

## 🚀 Tecnologias utilizadas

* Java 21+
* Spring Boot
* Spring Security
* Spring Data JPA
* JWT (JSON Web Token)
* Lombok
* H2 / PostgreSQL

---

## 📌 Funcionalidades

* ✅ Cadastro de usuário
* ✅ Login com autenticação JWT
* ✅ Geração de Access Token
* ✅ Refresh Token
* ✅ Proteção de rotas
* ✅ Criptografia de senha com BCrypt
* ✅ Controle de roles (USER / ADMIN)

---

## 🧱 Arquitetura do projeto

```
src/main/java/com/douglaspacheco/auth
 ├── controller
 ├──config
 ├── dto
 ├── model
 ├── repository
 ├── service
 └── security

```

---

## 🔐 Fluxo de autenticação

1. Usuário realiza cadastro
2. Usuário faz login com email e senha
3. API valida credenciais
4. Gera um JWT (Access Token)
5. Token é enviado nas requisições protegidas
6. API valida o token a cada request

---

## 📡 Endpoints principais

### 🔑 Autenticação

**Registro**

```
POST /auth/register
```

**Login**

```
POST /auth/login
```

**Refresh Token**

```
POST /auth/refresh
```

---

### 👤 Usuário

**Perfil (protegido)**

```
GET /user/profile
```

---

## 🛠️ Como rodar o projeto

### Pré-requisitos

* Java 21
* Maven ou Gradle

### Passos

```bash
# Clone o repositório
git clone https://github.com/dougpacx/jwt-auth-api.git

# Acesse a pasta
cd jwt-auth-api

# Rode o projeto
./mvnw spring-boot:run
```

Ou, se estiver usando Gradle:

```bash
./gradlew bootRun
```

---

## 🧪 Testando a API

Você pode utilizar:

* Postman
* Insomnia

### Exemplo de login

```json
POST /auth/login

{
  "email": "user@email.com",
  "password": "123456"
}
```

Resposta esperada:

```json
{
  "accessToken": "jwt_token_aqui",
  "refreshToken": "refresh_token_aqui"
}
```

---

## 🔒 Segurança

* Senhas armazenadas com BCrypt
* Tokens com expiração
* Rotas protegidas via Spring Security
* Validação de JWT em cada requisição

---

## 📈 Melhorias futuras

* [ ] Implementar 2FA
* [ ] Integração com OAuth2 (Google/GitHub)
* [ ] Logs de autenticação
* [ ] Rate limiting
* [ ] Deploy em cloud (AWS / Railway)

---

## 👨‍💻 Autor
Douglas Pacheco

