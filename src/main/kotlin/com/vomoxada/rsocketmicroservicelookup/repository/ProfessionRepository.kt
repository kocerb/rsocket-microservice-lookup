package com.vomoxada.rsocketmicroservicelookup.repository

import com.vomoxada.rsocketmicroservicelookup.domain.model.Profession
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import java.util.UUID

interface ProfessionRepository : CoroutineCrudRepository<Profession, UUID>