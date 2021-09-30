package com.vomoxada.rsocketmicroservicelookup.controller

import com.vomoxada.rsocketmicroservicelookup.domain.dto.response.ProfessionResponse
import com.vomoxada.rsocketmicroservicelookup.service.ProfessionService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException
import java.util.UUID

@RestController
@RequestMapping("/professions")
class ProfessionRestController(
    private val professionService: ProfessionService
) {

    @GetMapping("/{id}")
    suspend fun getProfessionById(@PathVariable id: UUID): ProfessionResponse {
        return professionService.getById(id) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND)
    }
}