package projects.api.qadaily.api.domain.paciente;

import jakarta.validation.constraints.NotNull;
import projects.api.qadaily.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {

}
