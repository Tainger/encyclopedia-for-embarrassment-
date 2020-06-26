package com.aliEducation.validator;

import com.aliEducation.util.ValidatorUtil;
import org.springframework.util.StringUtils;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class isMobileValidator implements ConstraintValidator <isMobile,String>{


    private boolean required = true;

    /**
     * 初始化方法
     * @param constraintAnnotation
     */
    @Override
    public void initialize(isMobile constraintAnnotation) {
        required = constraintAnnotation.required();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        if(required){
            return ValidatorUtil.isMobile(value);
        }else{
            if(StringUtils.isEmpty(value)){
                return false;
            }else{
                return  ValidatorUtil.isMobile(value);
            }
        }
    }
}
