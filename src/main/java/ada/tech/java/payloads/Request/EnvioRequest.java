package ada.tech.java.payloads.Request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class EnvioRequest implements Serializable {
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String id_cliente;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String id_compra;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String destinatario;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String cep;


}
