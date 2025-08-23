package com.example.profile_svc.models;

import jakarta.persistence.*;

@Entity
@Table(name = "AGENT")
public class Agent {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "agent_seq")
    @SequenceGenerator(name = "agent_seq", sequenceName = "AGENT_SEQ", allocationSize = 1)
    @Column(name = "AGENT_ID")
    private Long id;

    @Column(name = "AGENT_CODE")
    private String agentCode;

    @Column(name = "AGENT_NAME")
    private String agentName;

    @Column(name = "STATUS")
    private String status;
    // getters and setters...

    // ===== IMPORTANT: getters and setters for ALL fields! =====
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getAgentCode() { return agentCode; }
    public void setAgentCode(String agentCode) { this.agentCode = agentCode; }

    public String getAgentName() { return agentName; }
    public void setAgentName(String agentName) { this.agentName = agentName; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
