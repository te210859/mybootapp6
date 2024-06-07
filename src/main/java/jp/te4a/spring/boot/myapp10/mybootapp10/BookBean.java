package jp.te4a.spring.boot.myapp10.mybootapp10;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Entity
@Table(name = "books")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBean {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id ;
  @Column(nullable = false)
  private String title;
  private String writter;
  private String publisher;
  private Integer price;
}




