# Utiliza una imagen base que incluya Java (por ejemplo, OpenJDK)
FROM openjdk:11

# Copia el script Bash al contenedor
COPY target/factorial-1.0-SNAPSHOT.jar /home

# EXPOSE PORT
EXPOSE 8080

# Comando de inicio para ejecutar la aplicación Java
CMD ["java", "-jar", "/home/factorial-1.0-SNAPSHOT.jar"]
