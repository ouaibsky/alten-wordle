# Societe Generale / Alten / WORDLE

## Prerequisites:

* Internet access.
* Java 17
    * Download it from: https://adoptium.net/
    * Make sure to define an env variable: JAVA_HOME (JDK_install_dir)
    * Make sure to add JAVA_HOME/bin to your **PATH** environment variable
* [Intellij Community Edition](https://www.jetbrains.com/fr-fr/idea/download/).

## Import Project into IntelliJ:

* File -> New -> Project From Version Control
    * paste into URL: https://github.com/ouaibsky/sg-alten-wordle.git

## Build the project

* open a terminal or Windows powershell (can be also into IntelliJ||Terminal)
* run the command:
    * linux/mac
       ```
         ./mvnw -DskipTests  
       ```
    * windows/powershEll
       ```
         .\mvnw -DskipTests  
       ```
    * windows/DOS
       ```
         mvnw -DskipTests  
       ```

    * You should get a file:

  > target/wordle-1.0.0-SNAPSHOT.jar

    * Test it:

  > java -jar target/wordle-1.0.0-SNAPSHOT.jar

    * You should get a prompt, type **help** to check if it works.