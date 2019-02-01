# kotlin-springboot-graphlq
A project that shows how to build GraphQL APIs with Kotlin and SpringBoot

# Setting up
After clonning the repo, run the app and interacte with the API on `http://localhost:9000/graphiql`.

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
