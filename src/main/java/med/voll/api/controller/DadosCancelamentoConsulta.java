package med.voll.api.controller;

import jakarta.validation.constraints.NotNull;

public record DadosCancelamentoConsulta(@NotNull
                                         Long idConsulta,

                                        @NotNull
                                         MotivoCancelamento motivo) {

}
