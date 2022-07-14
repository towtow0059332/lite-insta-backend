package com.coding.towtow.instagram_backend.service;

import com.coding.towtow.instagram_backend.entity.Status;
import com.coding.towtow.instagram_backend.repository.StatusRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class StatusService {
    private StatusRepository statusRepository;
    private UserService userService;

    public StatusService(StatusRepository statusRepository, UserService userService) {
        this.statusRepository = statusRepository;
        this.userService = userService;
    }

    public Status submitDataOfStatus( Status status) {
        return statusRepository.save(status);
    }

    public ArrayList<Status> retrieveStatuses() {
        ArrayList<Status> statuses = statusRepository.findAll();
        for(Status status:statuses){
            status.setUsername(userService.displayMetadataOfUser(status.getUserId()).getUsername());
        }
        return statuses;
    }
}
