package com.example.profile_svc.models;

import jakarta.persistence.*;

@Entity
@Table(name = "AGENT", schema = "AGENTAPP1")
public class Agent {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "agent_seq_gen"
    )
    @SequenceGenerator(
            name = "agent_seq_gen",
            sequenceName = "AGENTAPP1.AGENT_SEQ", // Your Oracle sequence
            allocationSize = 1
    )
    @Column(name = "AGENT_ID") // Must match Oracle column!
    private Long agentId;

    @Column(name = "AGENT_CODE")
    private String agentCode;

    @Column(name = "AGENT_NAME")
    private String agentName;

    @Column(name = "STATUS")
    private String status; // e.g. ACTIVE

    // Getter/Setter for agentId
    public Long getAgentId() { return agentId; }
    public void setAgentId(Long agentId) { this.agentId = agentId; }
    // Getter/Setter for agentCode
    public String getAgentCode() { return agentCode; }
    public void setAgentCode(String agentCode) { this.agentCode = agentCode; }
    // Getter/Setter for agentName
    public String getAgentName() { return agentName; }
    public void setAgentName(String agentName) { this.agentName = agentName; }
    // Getter/Setter for status
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
