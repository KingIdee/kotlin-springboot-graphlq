# kotlin-springboot-graphlq
A project that shows how to build GraphQL APIs with Kotlin and SpringBoot

# Setting up
After clonning the repo, run the app and interacte with the API on `http://localhost:9000/graphiql`.

This app is authenticated with Auth0 too, create a new API on Auth0 and replace the Auth0 details on `src/main/resources/application.properties` with yours.
If you want to remove the authentication, simply delete the `SecurityConfig.kt` file.

# Sample
If you want to add a new item to the database, you can run this mutation:

```
mutation {
  newSnack(
    name: "French Fries",
    amount: 40.5) {
      id name amount
  }
}
```

If you want to query data from the database, you can run this:

```
query {
  snacks {
    id
    name
    amount
    reviews {
      snackId
      rating
      text
    }
  }
}
```
