package com.medved.backend.services

import com.medved.backend.common.DataPayload
import com.medved.backend.repositories.DataRepository
import org.springframework.stereotype.Service

@Service
class DataService(private val dataRepository: DataRepository) {

    fun receiveData(payload: DataPayload){
        dataRepository.receiveData(payload)
    }
}