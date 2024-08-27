package ycraah.web.javadb.myspringboot.answer;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import ycraah.web.javadb.myspringboot.question.Question;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Answer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(columnDefinition = "TEXT")
  private String content;

  private LocalDateTime createDate;

  @ManyToOne
  private Question question;
}
