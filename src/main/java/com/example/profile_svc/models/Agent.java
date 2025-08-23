package com.example.profile_svc.models;

import jakarta.persistence.*;

@Entity
public class Agent {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String agentCode;
    private String agentName;
    private String status; // e.g. ACTIVE

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getAgentCode() { return agentCode; }
    public void setAgentCode(String agentCode) { this.agentCode = agentCode; }
    public String getAgentName() { return agentName; }
    public void setAgentName(String agentName) { this.agentName = agentName; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
