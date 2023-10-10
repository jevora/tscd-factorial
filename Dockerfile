# Utiliza una imagen base que incluya Java (por ejemplo, OpenJDK)
FROM openjdk:11

# Copia el script Bash al contenedor
COPY init.sh /usr/local/bin/
RUN chmod +x /usr/local/bin/init.sh

# Ejecuta el script Bash al construir la imagen
RUN /usr/local/bin/init.sh

# Comando de inicio para ejecutar la aplicación Java
CMD ["java", "-jar", "tscd-factorial/target/factorial-1.0-SNAPSHOT.jar"]
