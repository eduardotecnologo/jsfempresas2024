package jsfempresas2024.erp.validators;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class InscricaoEstadualValidator implements ConstraintValidator<ValidInscricaoEstadual, String> {

    @Override
    public void initialize(ValidInscricaoEstadual constraintAnnotation) {
        // Inicialização, se necessário
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isEmpty()) {
            return false;
        }

        // Obter a sigla do estado (UF)
        String uf = value.length() >= 2 ? value.substring(0, 2) : "";
        return validateByState(uf, value);
    }

    private boolean validateByState(String uf, String value) {
        switch (uf) {
            case "AC": return validateAC(value);
            case "AL": return validateAL(value);
            case "AP": return validateAP(value);
            case "AM": return validateAM(value);
            case "BA": return validateBA(value);
            case "CE": return validateCE(value);
            case "DF": return validateDF(value);
            case "ES": return validateES(value);
            case "GO": return validateGO(value);
            case "MA": return validateMA(value);
            case "MT": return validateMT(value);
            case "MS": return validateMS(value);
            case "MG": return validateMG(value);
            case "PA": return validatePA(value);
            case "PB": return validatePB(value);
            case "PR": return validatePR(value);
            case "PE": return validatePE(value);
            case "PI": return validatePI(value);
            case "RJ": return validateRJ(value);
            case "RN": return validateRN(value);
            case "RS": return validateRS(value);
            case "RO": return validateRO(value);
            case "RR": return validateRR(value);
            case "SC": return validateSC(value);
            case "SP": return validateSP(value);
            case "SE": return validateSE(value);
            case "TO": return validateTO(value);
            default: return false;
        }
    }

    private boolean validateAC(String value) {
        return value.length() == 13;
    }

    private boolean validateAL(String value) {
        return value.length() == 9;
    }

    private boolean validateAP(String value) {
        return value.length() == 9;
    }

    private boolean validateAM(String value) {
        return value.length() == 14;
    }

    private boolean validateBA(String value) {
        return value.length() == 8;
    }

    private boolean validateCE(String value) {
        return value.length() == 9;
    }

    private boolean validateDF(String value) {
        return value.length() == 13;
    }

    private boolean validateES(String value) {
        return value.length() == 9;
    }

    private boolean validateGO(String value) {
        return value.length() == 14;
    }

    private boolean validateMA(String value) {
        return value.length() == 9;
    }

    private boolean validateMT(String value) {
        return value.length() == 11;
    }

    private boolean validateMS(String value) {
        return value.length() == 11;
    }

    private boolean validateMG(String value) {
        return value.length() == 13;
    }

    private boolean validatePA(String value) {
        return value.length() == 9;
    }

    private boolean validatePB(String value) {
        return value.length() == 9;
    }

    private boolean validatePR(String value) {
        return value.length() == 12;
    }

    private boolean validatePE(String value) {
        return value.length() == 14;
    }

    private boolean validatePI(String value) {
        return value.length() == 9;
    }

    private boolean validateRJ(String value) {
        return value.length() == 8;
    }

    private boolean validateRN(String value) {
        return value.length() == 9;
    }

    private boolean validateRS(String value) {
        return value.length() == 10;
    }

    private boolean validateRO(String value) {
        return value.length() == 14;
    }

    private boolean validateRR(String value) {
        return value.length() == 9;
    }

    private boolean validateSC(String value) {
        return value.length() == 9;
    }

    private boolean validateSP(String value) {
        return value.length() == 12 || value.length() == 13;
    }

    private boolean validateSE(String value) {
        return value.length() == 9;
    }

    private boolean validateTO(String value) {
        return value.length() == 14;
    }
}


