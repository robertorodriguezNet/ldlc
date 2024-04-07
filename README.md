# LDLC

## Entorno de desarrollo

- Entorno de desarrollo: Jakarta 9
- JDK: 17
- IDE: Eclipse 2024-03 (4.31.0)
- SGBD: MySQL 8.3.0

## Creación del proyecto

- Se crea un proyecto con Maven.
  - *GropId*: net.robertorodriguez.net
  - *Artifact*: ldlc

- Modificamos el **pom.xml**
  - Añadimos `properties`.
  - añadimos dependencias:
    - MySQL 8.3.0
- Actualizamos el proyecto: *Maven -> Update project*.
- Revisar las proiedades del proyecto
  - *Java Build Path* debe tener la versión del JDK correcta.
  - *Java Compiler* debe tener la versión del JDK correcta.
- Crear el paquete `net.robertorodriguez.jdbc` en la ruta *src\main\java*.
  - Crear la clase `App.java` con el método `main`.

### Modificacion del pom.xml

El archivo **pom.xml** creado por *Eclipse* no genera las `properties`.

`pom.xml`

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>net.robertorodriguez</groupId>
    <artifactId>ldlc-jersey</artifactId>
    <version>0.0.1-SNAPSHOT</version>

    <properties>            
        <project.buid.sourceEncoding>UTF-8</project.buid.sourceEncoding>            
        <maven.compiler.source>17</maven.compiler.source>           
        <maven.compiler.target>17</maven.compiler.target>
    </properties>    

    <dependencies>
        <dependency>
            <groupId>com.mysql</groupId>
            <artifactId>mysql-connector-j</artifactId>
            <version>8.3.0</version>
        </dependency>
    </dependencies>

</project> 
```
