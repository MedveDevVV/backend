package com.medved.backend.repositories

import com.medved.backend.common.DataPayload
import org.springframework.stereotype.Repository
import java.io.File

@Repository
class DataRepository {

    fun receiveData(payload: DataPayload) {
        File("data.txt").appendText(payload.text + "\n")
    }
}