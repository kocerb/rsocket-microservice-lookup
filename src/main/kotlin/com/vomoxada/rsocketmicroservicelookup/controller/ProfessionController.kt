package com.vomoxada.rsocketmicroservicelookup.controller

import com.vomoxada.rsocketmicroservicelookup.domain.dto.response.ProfessionResponse
import com.vomoxada.rsocketmicroservicelookup.service.ProfessionService
import kotlinx.coroutines.flow.Flow
import org.springframework.messaging.handler.annotation.DestinationVariable
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.stereotype.Controller
import java.util.UUID

@Controller
class ProfessionController(
    private val professionService: ProfessionService
) {

    @MessageMapping("professions.getById.{id}")
    suspend fun getProfessionById(@DestinationVariable id: UUID): ProfessionResponse? {
        return professionService.getById(id)
    }

    @MessageMapping("professions.getAll")
    fun getProfessions(): Flow<ProfessionResponse> {
        return professionService.getAll()
    }
}
