package estudos.procedures.Exception;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Map;

@Data
@Builder
public class ErrorResponseValid {

    private LocalDateTime timestamp;
    private Map<String, String> errors;
}
