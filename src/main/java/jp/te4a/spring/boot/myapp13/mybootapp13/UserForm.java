package jp.te4a.spring.boot.myapp13.mybootapp13;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserForm {
	@NotNull
	@Size(min=6, max=12)
	private String username;
	@Size(min=6, max=12)
	private String password;
}

