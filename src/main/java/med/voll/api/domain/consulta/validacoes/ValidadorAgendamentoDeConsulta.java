package med.voll.api.domain.consulta.validacoes;

import med.voll.api.controller.DadosAgendamentoConsulta;

public interface ValidadorAgendamentoDeConsulta {
    void validar(DadosAgendamentoConsulta dados);
}
