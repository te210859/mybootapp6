package jp.te4a.spring.boot.myapp11.mybootapp11;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jp.te4a.spring.boot.myapp11.mybootapp11.TestValid.Valid;

public class TestValidator implements ConstraintValidator<Valid,String>{
	String param;
	@Override
	public void initialize(TestValid.Valid nv){ 
		param =  nv.param(); 
	}
	@Override
	public boolean isValid(String in,ConstraintValidatorContext cxt){
		if(in == null){
			return false;
		}
		System.out.println(in.equals(param));
		return !in.equals(param);
		}
}

