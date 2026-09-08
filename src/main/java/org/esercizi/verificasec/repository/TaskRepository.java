package org.esercizi.verificasec.repository;

import org.esercizi.verificasec.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {

    public List<Task> findAllByOwnerName(String username);

}
