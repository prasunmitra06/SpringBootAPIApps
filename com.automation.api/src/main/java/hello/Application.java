package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

/*
If getting port problem
1] In command line interface

netstat -aon | find /i "listening"
2] Find port 8080 Ctrl+F and Enter 8080 (Port number of a process you want to kill)

3] Kill it's associated process id.

Taskkill /PID ProcessNumber /F

Taskkill /PID 3440 /F
*/