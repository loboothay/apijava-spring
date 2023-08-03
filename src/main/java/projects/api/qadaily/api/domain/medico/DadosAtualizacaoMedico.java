package projects.api.qadaily.api.domain.medico;
import jakarta.validation.constraints.NotNull;
import projects.api.qadaily.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
