# Sprint 1 Task S1.02

## Repository with level-1 and level-2 exercises from the Java programming course, developed using IntelliJ IDEA and Maven.

### 📂 Repository Contents

| Level      | Exercise | Package       | Main Classes                                                                       | Description                                                                                                                |
|------------|-----------|---------------|------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------|
| 🎵 Level-1 | Exercise 1 | `exceptions`  | `EmptySaleException`, `Product`, `Sale`, `TestIndexOutOfBounds`                    | Demonstrates custom exceptions (EmptySaleException, TestIndexOutOfBounds) to handle empty sales and invalid list indices.  |
| 🚗 Level-2 | Exercise 2 | `exceptions2` | `ConsoleReader`, `MainExceptions`, `InvalidCharException`, `InvalidYesNoException` | Uses ConsoleReader and custom exceptions (InvalidCharException, InvalidYesNoException) to validate and handle user input.  |


## ⚙️ Requirements

- Java JDK 25 o superior
- Maven
- IntelliJ IDEA (optional, but recommended)

---

## 💻 Installation and Execution

1. Clone the repository:

````bash
git clone https://github.com/erictc95/TascaS1.02.git
````

2. Open the project in IntelliJ IDEA or compile with Maven:

````bash
cd TascaS1.02
mvn compile
````

3. Run a specific exercise with Maven:

````bash
mvn exec:java -Dexec.mainClass="package.Main"
````

4. Replace package.Main with the main class of each exercise:

Level-1 / Exercise 1: exceptions.TestIndexOutOfBounds

Level-2 / Exercise 1: exceptions2.MainExceptions


You can also open each Main.java class in IntelliJ and run it directly from the IDE.

## 📝 Usage

Each level folder contains independent exercises.
The exercises demonstrate Java concepts such as different types of Exceptions, like EmptySaleException, IndexOutOfBoundsException, InputMismatchException and your own message for the Exceptions.
## 🤝 Contributions

If you want to improve the exercises or add examples:

Fork the repository

Create a branch for your changes: git checkout -b my-branch

Commit your changes: git commit -m "My contribution"

Push your branch: git push origin my-branch

Open a Pull Request

## 📜 License

MIT License

## 👤 Author

Eric Tarres Cabrisas - GitHub --> erictc95
