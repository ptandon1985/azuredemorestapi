package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/helloWorld")
    public ResponseEntity<String> hellowWorld() {
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }

    @GetMapping("/helloWorld2")
    public ResponseEntity<String> hellowWorld2() {
        return new ResponseEntity<>("Hello World 2", HttpStatus.OK);
    }
}
