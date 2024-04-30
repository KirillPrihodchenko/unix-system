docker-compose up -d

timeout /t 3 /nobreak > nul

start "" "http://127.0.0.1:9080/"
start "" "http://127.0.0.1:9090/"