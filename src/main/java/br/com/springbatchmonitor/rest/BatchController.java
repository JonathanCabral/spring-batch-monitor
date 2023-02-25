package br.com.springbatchmonitor.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/batch")
public class BatchController {

    @GetMapping("/executions/")
    public ResponseEntity<?> getExecutions() {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/executions/date/{date}")
    public ResponseEntity<?> getExecutionsPerDay(@RequestParam("date") String date) {
        return ResponseEntity.ok(date);
    }

}

