package projects.api.qadaily.api.infra.springdoc;

import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfigurations {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components()
                        .addSecuritySchemes("bearer-key",
                                new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")))
                .info(new Info()
                        .title("Java Spring API Voll.med")
                        .description("API Rest da aplicação Voll.med, contendo as funcionalidades de CRUD de médicos e de pacientes, além de agendamento e cancelamento de consultas. API Construída no curso da Alura para realização de testes.")
                        .contact(new Contact()
                                .name("Time Backend QADaily")
                                .email("backend@qadaily.com.br"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://qadaily/api/licenca")));
    }
}
