package med.voll.api.domain.consulta.validacoes;

import med.voll.api.controller.DadosAgendamentoConsulta;
import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ValidadorPacienteSemOutraConsultaNoDia implements ValidadorAgendamentoDeConsulta {
    @Autowired
    public ConsultaRepository repository;
    public void validar (DadosAgendamentoConsulta dados){
var primeiroHorario= dados.data().withHour(7);
        var ultimoHorario= dados.data().withHour(18);
        var pacientePossuiOutraConsultaNoDia= repository.existsByPacienteIdAndDataBetween(dados.idPaciente(),primeiroHorario,ultimoHorario);
     if (pacientePossuiOutraConsultaNoDia){
         throw new ValidacaoException("Paciente ja possui uma consulta agendada neste dia");
     }

    }
}
