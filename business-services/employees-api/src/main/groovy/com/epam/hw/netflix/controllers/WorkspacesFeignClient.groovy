package com.epam.hw.netflix.controllers

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@FeignClient(name = "workspaces-api")
interface WorkspacesFeignClient {

    @RequestMapping("/{id}")
    def getWorkspaceById(@PathVariable("id") String id);
}
