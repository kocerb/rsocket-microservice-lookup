package com.vomoxada.rsocketmicroservicelookup.domain.model

import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.annotation.PersistenceConstructor
import org.springframework.data.annotation.Version
import org.springframework.data.relational.core.mapping.Table
import java.time.Instant
import java.util.UUID

@Table
data class Profession @PersistenceConstructor constructor(
    @Id val id: UUID? = null,
    val name: String,
    @Version var version: Int? = null,
    @CreatedDate var createdAt: Instant? = null,
    @CreatedBy var createdBy: UUID? = null,
    @LastModifiedDate var lastModifiedAt: Instant? = null,
    @LastModifiedBy var lastModifiedBy: UUID? = null,
)
