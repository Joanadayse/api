package med.voll.api.domain.consulta.validacoes;

import med.voll.api.controller.DadosAgendamentoConsulta;

public interface ValidadorCancelamentoDeConsulta {
    void validar(DadosAgendamentoConsulta dados);
}
