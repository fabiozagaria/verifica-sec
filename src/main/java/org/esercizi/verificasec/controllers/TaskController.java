package org.esercizi.verificasec.controllers;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.esercizi.verificasec.models.Task;
import org.esercizi.verificasec.models.User;
import org.esercizi.verificasec.services.TaskService;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("api/tasks")
public class TaskController {

    private final TaskService taskService;

    @GetMapping
    public List<Task> findAll(
            Authentication authentication
    ) {
        String username = authentication.getName();
        return taskService.findAllByUsername(username);

    }
}
