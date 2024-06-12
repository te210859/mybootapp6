package jp.te4a.spring.boot.myapp11.mybootapp11;

import jakarta.validation.constraints.*;
//import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import jp.te4a.spring.boot.myapp11.mybootapp11.TestValid.Valid;
@Data
@NoArgsConstructor
public class BookForm {
  private Integer id;
  @NotNull
  @Size(min = 3)
  @Valid(param = "abc")
  private String title;
  @Size(min = 3, max = 20)
  private String writter;
  private String publisher;
  @Min(0)
  private Integer price;
}


