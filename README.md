# libreta
Importar proyecto
2.En la terminal (dentro de la carpeta del proyecto) ejecutar el siguiente comando "./mvnw clean package -DskipTests"
3.En la terminal (dentro de la carpeta del proyecto) ejecutar el siguiente comando "docker-compose build"
4.En la terminal (dentro de la carpeta del proyecto) ejecutar el siguiente comando "docker-compose up"
5.El proyecto estará corriendo con la base de datos vacía.
6.Si quieres conectarte a la base de datos descarga pgadmin4 y las credenciales están en docker-compose.yml
7.Si quieres añadir datos te he dejado un script dentro de src/main/resources/insert10_muscles.txt
