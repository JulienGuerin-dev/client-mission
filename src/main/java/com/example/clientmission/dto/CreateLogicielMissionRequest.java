package com.example.clientmission.dto;

public class CreateLogicielMissionRequest {
    private String titre;

    public CreateLogicielMissionRequest() {
    }

    public CreateLogicielMissionRequest(String titre) {
        this.titre = titre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}