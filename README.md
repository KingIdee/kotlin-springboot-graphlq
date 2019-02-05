# kotlin-springboot-graphlq
A project that shows how to build GraphQL APIs with Kotlin and SpringBoot

# Setting up
The recommended IDE for this project is [Intellij IDEA](https://www.jetbrains.com/idea/). After clonning the repo, open the project on the IDE, and run the it using the green run icon at the toolbar of the IDE. You can also run using this command on the root directory:

```
For Mac
./gradlew bootRun

For windows
gradle bootRun
```

After running the app, it will build and serve the API at localhost. You can interacte with the API at `http://localhost:9000/graphiql`.

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

If you want to query data from the database, you can run this query:

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
