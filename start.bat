@echo off
docker-compose build
docker-compose up -d

timeout /t 4 /nobreak > nul

start "" "http://127.0.0.1:9080/"
start "" "http://127.0.0.1:9090/"
