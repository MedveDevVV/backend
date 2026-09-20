package com.medved.backend.controllers

import com.medved.backend.common.DataPayload
import com.medved.backend.services.DataService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class DataController(private val dataService: DataService) {

    @PostMapping("/data")
    fun receiveData(@RequestBody payload: DataPayload): String {
        dataService.receiveData(payload)
        return "OK"
    }
}