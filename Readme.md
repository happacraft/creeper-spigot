```
$ gie clone git@github.com:xsota/creeper-spigot.git
$ cd creeper-spigot
$ docker-compose up
$ echo eula=true > app/eula.txt
$ ./gradlew build # gradlew build
$ cp build/libs/creeper-spigot-1.0-SNAPSHOT.jar app/plugins
$ docker-compose up -d
```
