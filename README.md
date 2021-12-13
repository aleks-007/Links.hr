# Links.hr

## Prerequisites:
---------------
- Java JDK - https://jdk.java.net/java-se-ri/13
- Maven - https://maven.apache.org/download.cgi - Binary zip archive
- Setup environment variables: 
1. Add as a system variable JAVA_HOME ~ eg. "C:\Program Files\Java\jdk1.8.0_202"
2. Configure env variables by adding Maven and Java to the path ~ eg. "C:\Program Files\Java\jdk1.8.0_202\bin", "C:\Maven\apache-maven-3.8.1\bin"

## Execution:
---------------
*   Go to project root via cmd 
```sh
$ mvn test -Dtest=hr.links.ui.tests.* test
``` 
*   Run tests from Intelij
*   Run by testng.xml from InteliJ

