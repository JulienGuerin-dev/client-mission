package com.example.clientmission.controller;

import com.example.clientmission.dto.CreateLogicielMissionRequest;
import com.example.clientmission.dto.MissionResponse;
import com.example.clientmission.service.LogicielService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/logiciel")
public class LogicielController {

    private final LogicielService logicielService;

    public LogicielController(LogicielService logicielService) {
        this.logicielService = logicielService;
    }

    @GetMapping
    public List<MissionResponse> findAll() {
        return logicielService.findAll();
    }

    @PostMapping
    public MissionResponse createMission(@RequestBody CreateLogicielMissionRequest request) {
        return logicielService.createMission(request.getTitre());
    }

    @GetMapping("/{id}")
    public MissionResponse findById(@PathVariable Long id) {
        return logicielService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        logicielService.deleteById(id);
    }
}