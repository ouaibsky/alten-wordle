# Societe Generale / Alten / WORDLE

## Prerequisites:

* Internet access is required.
* Java 17
    * Download it from: https://adoptium.net/
    * Make sure to define an env variable: JAVA_HOME (JDK_install_dir)
    * Make sure to add JAVA_HOME/bin to your **PATH** environment variable
* Download and install [Intellij Community Edition](https://www.jetbrains.com/fr-fr/idea/download/).

## Import Project into IntelliJ:

* If not done yet, declare your JDK 17 into IntelliJ:
    * **File -> Project Structure -> Platform Settings -> SDKs section**.
    * If you don't have a jdk name "**17**":
        * Click on "**+**", then select the dir where you installed the jdk 17 (:warning: root directory of the jdk, not
          jdk_dir/bin :no_entry:).
        * Don't forget to name it "**17**"
* Import the project template:
    * **File -> New -> Project From Version Control**
        * Paste into URL this value: https://github.com/ouaibsky/sg-alten-wordle.git
* Make sure you project is imported as a Maven project
    * Right-click on **pom.xml** -> Maven -> You must see "Reload project".
    * If not right-click on **pom.xml** -> Add as Maven project (or something like that)
* Make sure your project is configured with jdk17
    * **File -> Project Structure -> Project Settings -> Project**
        * JDK: make sure to select the JDK 17 previously defined.
        * Language level: make sure to select: 17 Sealed class, ...

## Build the project

### IntelliJ

* Click on the green hammer (toolbar on top right). ![hammer](img/green-hammer.png)

### Command line / terminal

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

## Run test samples

### Maven Command Line

    > ./mvnw

### IntelliJ

* Open the file WordleCommandTest
* Click the green arrow on the left of the class name.
*
![hammer](img/run-tests.png)
