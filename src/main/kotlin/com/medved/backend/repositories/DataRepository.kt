package com.medved.backend.repositories

import com.medved.backend.common.DataPayload
import org.springframework.stereotype.Repository
import java.io.File

@Repository
class DataRepository {
    val fileName = "data.txt"

    fun receiveData(payload: DataPayload) {
        File(fileName).appendText(payload.text + "\n")
    }

    fun readData() : String {
        val file = File(fileName)
        if (!file.exists()) return ""
        return file.readText()
    }
}