package jsfempresas2024.erp.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = InscricaoEstadualValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidInscricaoEstadual {
    String message() default "Inscrição Estadual inválida";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
