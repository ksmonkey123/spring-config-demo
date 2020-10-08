package ch.awae.spring.config.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceWithConfig {

    private final int port;

    @Autowired
    public ServiceWithConfig(ServiceConfiguration configuration) {
        this.port = configuration.getPort();
        System.out.println("port from config: " + this.port);
    }

}
