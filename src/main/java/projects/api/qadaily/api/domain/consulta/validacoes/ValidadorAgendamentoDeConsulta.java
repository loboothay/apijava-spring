package projects.api.qadaily.api.domain.consulta.validacoes;

import projects.api.qadaily.api.domain.consulta.DadosAgendamentoConsulta;

public interface ValidadorAgendamentoDeConsulta {
    void validar(DadosAgendamentoConsulta dados);
}
