package estudos.procedures.Exception;

import estudos.procedures.service.exception.NoRecordsFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NoRecordsFoundException.class)
    public ResponseEntity<ErrorResponse> handleNoRecordsFoundException(NoRecordsFoundException ex) {
        ErrorResponse errorResponse = new ErrorResponse(ex.getCodigo(), ex.getMensagem());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

}
