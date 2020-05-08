# DockerAssignment

Steps to run code :
● Pull Mysql image :

    sudo docker pull mysql:5.7

● Run Mysql Container :
    
    sudo docker run -it -h localhost --name firstmysqlapp -e MYSQL_ROOT_PASSWORD=s -e MYSQL_DATABASE=restapi -e MYSQL_USER=root@localhost -e MYSQL_PASSWORD=s -d mysql:5.7
  
● Build Dockerfile :

    sudo docker build -t userobject .
    
● Run Dockerfile :

    sudo docker run -it -p 8080:8080 --link firstmysqlapp userobject:latest
