package ch.awae.spring.config.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ServiceWithValue {

    private final int port;

    @Autowired
    public ServiceWithValue(@Value("${service.port}") int port) {
        this.port = port;
        System.out.println("port from injection: " + this.port);
    }

}
