FROM mysql:5.7
LABEL MAINTAINER="shubham"
ENV MYSQL_USER="root"
ENV MYSQL_DATABASE="restapi"
ENV MYSQL_ROOT_PASSWORD="s"
copy First.sql /docker-entrypoint-initdb.d/ 
EXPOSE 3306


FROM openjdk:8-jdk-alpine
copy User_Object-0.0.1-SNAPSHOT.war User_Object-0.0.1-SNAPSHOT.war
EXPOSE 8080
ENTRYPOINT ["java","-jar","User_Object-0.0.1-SNAPSHOT.war"]
