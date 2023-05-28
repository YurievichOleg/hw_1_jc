# FROM bellsoft/liberica-openjdk-alpine:latest as BuildProject
# WORKDIR /app
# COPY ./java ./src
# RUN mkdir ./out
# RUN javac -sourcepath ./src -d out ./src/ru/gb/sample/Main.java

# FROM scratch as OutPutFile
# COPY --from=BuildProject /app/out /bin
FROM bellsoft/liberica-openjdk-alpine:latest
WORKDIR /app
COPY ./bin .
CMD java -classpath . ru.gb.sample.Main