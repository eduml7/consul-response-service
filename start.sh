./consul agent -dev -server=false -join=172.17.0.2 -bind=172.17.0.3 &
java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar ./app.jar && fg
