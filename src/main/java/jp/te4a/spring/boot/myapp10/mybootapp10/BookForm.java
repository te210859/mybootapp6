package jp.te4a.spring.boot.myapp10.mybootapp10;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookForm {
  private Integer id ;
  private String title;
  private String writter;
  private String publisher;
  private Integer price;
}

