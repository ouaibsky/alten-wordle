# Societe Generale / Alten / WORDLE

## Prerequisites:

* Java 17
    * Download it from: https://adoptium.net/
    * Make sure to add JAVA_DIR/bin to your **PATH** environment variable
* Intellij Community Edition.

## Build the project

* open a terminal or windows powershell (can be also into IntelliJ||Terminal
* run the command:
    * linux/mac
       ```
         ./mvnw -DskipTests  
       ```
    * windows/powershEll
       ```
         ./mvnw -DskipTests  
       ```
    * windows/DOS
       ```
         mvnw -DskipTests  
       ```

    * You should get the file:

  > target/wordle-1.0.0-SNAPSHOT.jar

    * Test it:

  > java -jar target/wordle-1.0.0-SNAPSHOT.jar

    * You should get a prompt, type **help** to check if it works.