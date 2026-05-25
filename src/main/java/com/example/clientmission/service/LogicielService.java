package com.example.clientmission.service;

import com.example.clientmission.client.MissionApiClient;
import com.example.clientmission.dto.MissionResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogicielService {

    private final MissionApiClient missionApiClient;

    public LogicielService(MissionApiClient missionApiClient) {
        this.missionApiClient = missionApiClient;
    }

    public List<MissionResponse> findAll() {
        return missionApiClient.findAllMissions();
    }

    public MissionResponse createMission(String titre) {
        if (titre == null || titre.isBlank()) {
            throw new IllegalArgumentException("Le titre est obligatoire");
        }

        return missionApiClient.createMission(titre);
    }

    public MissionResponse findById(Long id) {
        return missionApiClient.findMissionById(id);
    }

    public void deleteById(Long id) {
        missionApiClient.deleteMissionById(id);
    }
}