package com.vomoxada.rsocketmicroservicelookup

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class RsocketMicroserviceLookupApplication

fun main(args: Array<String>) {
	runApplication<RsocketMicroserviceLookupApplication>(*args)
}
