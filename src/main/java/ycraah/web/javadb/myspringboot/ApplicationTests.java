package ycraah.web.javadb.myspringboot;

import java.time.LocalDateTime;

public class ApplicationTests {

  private QuestionRepository questionRepository;

  void testJpa(){
    Question q1 = new Question();
    q1.setSubject("sbb가 무엇인가요?");
    q1.setContent("sbb에 대해서 알고 싶습니다");
    q1.setCreateDate(LocalDateTime.now());
    this.questionRepository.save(q1);

    Question q2 = new Question();
    q2.setSubject("스프링 부트 모델 질문입니다");
    q2.setContent("id는 자동으로 생성되나요?");
    q2.setCreateDate(LocalDateTime.now());
    this.questionRepository.save(q2);
  }
}
