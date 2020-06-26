package com.aliEducation.validator;

import javax.validation.Constraint;
import java.lang.annotation.*;
import javax.validation.Payload;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {isMobileValidator.class})
public @interface isMobile {

    boolean required() default true;

    String message() default "  参数校验异常，手机号码格式有误";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
