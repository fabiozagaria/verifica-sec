package org.esercizi.verificasec.repository;


import org.esercizi.verificasec.models.Task;
import org.esercizi.verificasec.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {


}
