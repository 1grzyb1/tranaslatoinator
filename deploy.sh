gradle build
docker build -t grzybek/translatoinator .
ssh docker stop $(docker ps -q --filter ancestor=grzybek/translatoinator )
docker save grzybek/translatoinator | bzip2 | pv | ssh grzybek docker load
ssh grzybek docker run -p 8080:8080 --net=host -d grzybek/translatoinator