FROM maven:3.8.3-openjdk-17

COPY pom.xml .
COPY ./src ./src

# RUN mvn install:install-file -DgroupId=org.projectlombokk -DartifactId=lombok-mapstruct-binding -Dversion=0.2.0 -Dpackaging=jar -Dfile=/path/to/file
RUN mvn install -DskipTests