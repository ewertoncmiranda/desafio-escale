package br.com.priscilasanfer.escale.core.exceptions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetalheErro {
    private String campo;
    private String mensagem;
    private String valor;
}
