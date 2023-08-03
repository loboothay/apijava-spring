package projects.api.qadaily.api.domain.consulta.validacoes;

import org.springframework.stereotype.Component;
import projects.api.qadaily.api.domain.ValidacaoException;
import projects.api.qadaily.api.domain.consulta.DadosAgendamentoConsulta;

import java.time.DayOfWeek;

@Component
public class ValidadorHorarioFuncionamentoClinica implements ValidadorAgendamentoDeConsulta {
    public void validar(DadosAgendamentoConsulta dados){
        var dataConsulta = dados.data();
        var domingo = dataConsulta.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        var antesDaAbertura = dataConsulta.getHour()<7;
        var depoisDoEncerramento = dataConsulta.getHour()>18;
        if(domingo||antesDaAbertura||depoisDoEncerramento){
            throw new ValidacaoException("Consulta fora do horário de funcionamento da clínica");
        }
    }
}
