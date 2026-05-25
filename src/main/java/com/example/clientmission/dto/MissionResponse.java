package com.example.clientmission.dto;

public class MissionResponse {
    private Long id;
    private String titre;
    private boolean terminee;

    public MissionResponse() {
    }

    public MissionResponse(Long id, String titre, boolean terminee) {
        this.id = id;
        this.titre = titre;
        this.terminee = terminee;
    }

    public Long getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public boolean isTerminee() {
        return terminee;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setTerminee(boolean terminee) {
        this.terminee = terminee;
    }
}