# AutomatingTest

This repository contains simple Playwright Java examples used while learning Playwright and automating browser actions.

Included
- `src/main/java/testcase/Testbrowser.java` — small example that launches Chromium, navigates to Google, fills the search box and submits a search.

Prerequisites
- Java 11 or newer
- Maven (for building and running via the Maven lifecycle)
- Playwright Java dependencies (the project already references Playwright in its Maven POM)

Build

1. From the repository root run:

```cmd
mvn clean compile
```

Run

If you have the Maven Exec Plugin available in your environment (or added to the POM), run the `Testbrowser` main class with:

```cmd
mvn compile exec:java -Dexec.mainClass="testcase.Testbrowser"
```

Alternatively, build the project and run the class from the compiled classes (you will need to include dependencies on the classpath):

```cmd
mvn package
java -cp target/classes;path\to\dependencies\* testcase.Testbrowser
```

Notes
- Playwright may require native browsers to be installed for the first run. If you see errors about missing browsers, follow the Playwright Java setup instructions in the official docs to install browsers for your environment.
- This README is deliberately minimal — let me know if you want a detailed setup section (Playwright installation, example screenshots, or CI instructions).
