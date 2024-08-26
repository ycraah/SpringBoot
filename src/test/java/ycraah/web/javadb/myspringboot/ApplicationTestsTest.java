package ycraah.web.javadb.myspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ApplicationTestsTest {

  @Autowired
  private QuestionRepository questionRepository;

  @Autowired
  private AnswerRepository answerRepository;

  @Test
  void testJpa() {
    Optional<Question> oq = questionRepository.findById(2);
    assertTrue(oq.isPresent());
    Question q = oq.get();

    Answer a = new Answer();
    a.setContent("네 자동으로 생성됩니다.");
    a.setQuestion(q);
    a.setCreateDate(LocalDateTime.now());
    this.answerRepository.save(a);
  }
}