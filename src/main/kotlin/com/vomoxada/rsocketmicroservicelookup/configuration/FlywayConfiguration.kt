package com.vomoxada.rsocketmicroservicelookup.configuration

import com.vomoxada.rsocketmicroservicelookup.configuration.properties.DatabaseProperties
import org.flywaydb.core.Flyway
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class FlywayConfiguration(
    private val databaseProperties: DatabaseProperties
) {

    @Bean(initMethod = "migrate")
    fun flyway(): Flyway {
        return Flyway(
            with(databaseProperties) {
                Flyway.configure()
                    .baselineOnMigrate(true)
                    .outOfOrder(true)
                    .dataSource(
                        getDatabaseUrl(host, port, name),
                        username,
                        password
                    )
            }
        )
    }

    private fun getDatabaseUrl(host: String, port: String, name: String): String {
        return "jdbc:postgresql://$host:$port/$name"
    }
}
