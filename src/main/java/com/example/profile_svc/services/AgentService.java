package com.example.profile_svc.services;

import com.example.profile_svc.models.Agent;
import com.example.profile_svc.repositories.AgentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class    AgentService {
    private final AgentRepository repo;

    public AgentService(AgentRepository repo) {
        this.repo = repo;
    }

    public List<Agent> findAll() {
        return repo.findAll();
    }

    public Agent create(Agent a) {
        return repo.save(a);
    }
}
