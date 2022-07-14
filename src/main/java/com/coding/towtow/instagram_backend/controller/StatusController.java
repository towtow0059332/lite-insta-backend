package com.coding.towtow.instagram_backend.controller;

import com.coding.towtow.instagram_backend.entity.Status;
import com.coding.towtow.instagram_backend.service.StatusService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("status")
public class StatusController {
    private StatusService statusService;

    public StatusController(StatusService statusService) {
        this.statusService = statusService;
    }

    @PostMapping
    private Status submitStatus(@RequestBody Status status) {
        System.out.println("StatusController.submitStatus()");
        return statusService.submitDataOfStatus(status);
    }

    @GetMapping
    public ArrayList<Status> getAllStatus() {
        System.out.println("StatusController.getAllStatus()");
        return statusService.retrieveStatuses();
    }
}
