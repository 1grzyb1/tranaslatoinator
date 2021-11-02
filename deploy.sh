gradle build
docker build -t grzybek/translatoinator .
ssh grzybek docker rm $(docker stop $(docker ps -a -q --filter ancestor=grzybek/translatoinator --format="{{.ID}}"))
docker save grzybek/translatoinator | bzip2 | pv | ssh grzybek docker load
ssh grzybek docker run -p 8080:8080 --net=host -d grzybek/translatoinator