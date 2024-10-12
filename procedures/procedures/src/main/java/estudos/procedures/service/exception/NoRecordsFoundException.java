package estudos.procedures.service.exception;

import lombok.Getter;

import java.util.ResourceBundle;

@Getter
public class NoRecordsFoundException extends RuntimeException {

    private static final ResourceBundle bundle = ResourceBundle.getBundle("messages");
    private final int codigo;
    private final String mensagem;

    public NoRecordsFoundException(){
        super(bundle.getString("DADOS_NAO_ENCONTRADOS"));
        this.codigo = 404;
        this.mensagem = bundle.getString("DADOS_NAO_ENCONTRADOS");
    }

}
