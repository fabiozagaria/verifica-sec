package org.esercizi.verificasec.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.esercizi.verificasec.repository;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;


}
