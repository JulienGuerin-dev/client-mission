package com.example.clientmission.client;

import com.example.clientmission.dto.CreateLogicielMissionRequest;
import com.example.clientmission.dto.MissionResponse;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import java.util.List;

@Component
public class MissionApiClient {

    private final RestClient missionApiRestClient;

    public MissionApiClient(RestClient missionApiRestClient) {
        this.missionApiRestClient = missionApiRestClient;
    }

    public List<MissionResponse> findAllMissions() {
        return missionApiRestClient.get()
                .uri("/missions")
                .retrieve()
                .body(new ParameterizedTypeReference<List<MissionResponse>>() {});
    }

    public MissionResponse createMission(String titre) {
        CreateLogicielMissionRequest request = new CreateLogicielMissionRequest(titre);

        return missionApiRestClient.post()
                .uri("/missions")
                .body(request)
                .retrieve()
                .body(MissionResponse.class);
    }

    public MissionResponse findMissionById(Long id) {
        return missionApiRestClient.get()
                .uri("/missions/{id}", id)
                .retrieve()
                .body(MissionResponse.class);
    }

    public void deleteMissionById(Long id) {
        missionApiRestClient.delete()
                .uri("/missions/{id}", id)
                .retrieve()
                .toBodilessEntity();
    }
}