package org.esercizi.verificasec.services;


import lombok.RequiredArgsConstructor;
import org.esercizi.verificasec.models.Task;
import org.esercizi.verificasec.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    public List<Task> findAllByUsername(String username) {
        return taskRepository.findAllByOwnerName(username);
    }
}
