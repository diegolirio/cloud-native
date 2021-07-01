# Cloud Native

#### Install GraalVM

SDK MAN!!!   
https://www.baeldung.com/java-sdkman-intro

```
sdk list java
```

```
sdk install java 21.0.0.2.r11-grl
```

```
sdk use java 21.0.0.2.r11-grl
```

> Pre-Requisites
 - [Docker](https://docs.docker.com/engine/install/) 
```shell
mvn clean package spring-boot:build-image -Pnative -DskipTests
```    
