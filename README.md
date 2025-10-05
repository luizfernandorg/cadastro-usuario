# User Registry

This project demonstrates basic CRUD creation skills in Java with Spring.

## API Documentation

#### Returns user data

```http
  GET /usuario?email=email@email.com
```

| Parameter   | Type       | Description                           |
| :---------- | :--------- | :---------------------------------- |
| `email` | `string` | assigns an email as a parameter |

#### Creates a user in the system
```http
  POST /usuario
```
Include the parameters in the JSON body:
| Parameter   | Type       | Description                                   |
| :---------- | :--------- | :------------------------------------------ |
| `email`      | `string` | sets an email for the new user |
| `nome`      | `string` | sets a name for the new user |

#### Updates the user
```http
  PUT /usuario?id=id
```
In the JSON body, update the desired data: email, name, or both:
| Parameter |	Type	| Description |
| :---------- | :--------- | :------------------------------------------ |
| 'id'	| 'integer'	| user Id |

#### Deletes the user
```http
  DELETE /usuario?email=email@email.com
```
Deletes a user by the email defined in the parameter:
| Parameter   | Type       | Description                                   |
| :---------- | :--------- | :------------------------------------------ |
| `email`      | `string` | 	sets an email to delete the user |

## Installation and Execution
#### Installation

```
git clone https://github.com/luizfernandorg/cadastro-usuario.git
```
#### Run via terminal

```
cd cadastro-usuario
./gradlew clean build;./gradlew bootRun
```
