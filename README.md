# fuse4j
Java library with JNI native library bindings for FUSE https://github.com/libfuse/libfuse
## How to build
### JNI library (libfuse4j.so)
- Install CMake
  - on Ubuntu: `sudo apt install cmake` or `sudo snap install cmake`
- Install fuse3
  - on Ubuntu: `sudo apt install fuse3`
- Open command prompt in the project directory and run the following commands:
  - `cmake -H./native -B./native/build`
  - `cmake --build ./native/build --config Release`
  - `cp ./native/build/libfuse4j.so ./src/main/resources/one/papachi/fuse4j`
### Java library (fuse4j-x.y.z.jar)
- Install JDK 17
  - on Ubuntu: `sudo apt install openjdk-17-jdk`
- Install maven
  - on Ubuntu: `sudo apt install maven`
- Open command prompt in the project directory and run the following commands:
  - `mvn install`
## How to use
If you are using maven as your build tool, you can reference the library in your `pom.xml`
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>one.papachi</groupId>
  <artifactId>example</artifactId>
  <version>1.0.0</version>

  <properties>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
  </properties>

  <dependencies>
    <dependency>
      <groupId>one.papachi</groupId>
      <artifactId>fuse4j</artifactId>
      <version>1.0.0</version>
    </dependency>
  </dependencies>

</project>
```