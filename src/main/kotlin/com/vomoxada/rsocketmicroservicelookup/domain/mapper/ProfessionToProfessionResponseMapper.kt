package com.vomoxada.rsocketmicroservicelookup.domain.mapper

import com.vomoxada.rsocketmicroservicelookup.domain.dto.response.ProfessionResponse
import com.vomoxada.rsocketmicroservicelookup.domain.model.Profession
import org.mapstruct.Mapper
import org.springframework.core.convert.converter.Converter

@Mapper
interface ProfessionToProfessionResponseMapper: Converter<Profession, ProfessionResponse>