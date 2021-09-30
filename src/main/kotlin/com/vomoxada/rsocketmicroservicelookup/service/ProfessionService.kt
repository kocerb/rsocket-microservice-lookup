package com.vomoxada.rsocketmicroservicelookup.service

import com.vomoxada.rsocketmicroservicelookup.domain.dto.response.ProfessionResponse
import com.vomoxada.rsocketmicroservicelookup.domain.mapper.ProfessionToProfessionResponseMapper
import com.vomoxada.rsocketmicroservicelookup.repository.ProfessionRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class ProfessionService(
    private val professionRepository: ProfessionRepository,
    private val professionToProfessionResponseMapper: ProfessionToProfessionResponseMapper
) {

    suspend fun getById(id: UUID): ProfessionResponse? {
        return professionRepository.findById(id)?.let { professionToProfessionResponseMapper.convert(it)!! }
    }

    fun getAll(): Flow<ProfessionResponse> {
        return professionRepository
            .findAll()
            .map { professionToProfessionResponseMapper.convert(it)!! }
    }
}