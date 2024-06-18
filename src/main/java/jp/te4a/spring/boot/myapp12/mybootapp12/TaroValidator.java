package jp.te4a.spring.boot.myapp12.mybootapp12;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jp.te4a.spring.boot.myapp12.mybootapp12.TaroValid.Valid;

public class TaroValidator implements ConstraintValidator<Valid,String>{
	String param;
	@Override
	public void initialize(TaroValid.Valid nv){ 
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

