package education.p0004.reserve;

import lombok.Data;

import java.io.Serializable;

@Data
public class InputForm implements Serializable {
    private static final long SerialVersionUID = 1L;
    public Boolean isBadRequest = false;
    public Boolean isInvalidFormatOfItemQuantity = false;

    private void clearErrors() {
        isBadRequest = false;
        isInvalidFormatOfItemQuantity = false;
    }
    public Boolean hasError(){
        return isBadRequest || isInvalidFormatOfItemQuantity;
    }
}
