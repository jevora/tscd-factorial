# Utiliza una imagen base que incluya Java (por ejemplo, OpenJDK)
FROM openjdk:11

# Copia el script Bash al contenedor
COPY my_script.sh /usr/local/bin/
RUN chmod +x /usr/local/bin/my_script.sh

# Establece el directorio de trabajo
WORKDIR /app

# Copia tu aplicación Java al contenedor (suponiendo que tienes un archivo JAR)
COPY my_app.jar .

# Ejecuta el script Bash al construir la imagen
RUN /usr/local/bin/my_script.sh

# Comando de inicio para ejecutar la aplicación Java
CMD ["java", "-jar", "my_app.jar"]
