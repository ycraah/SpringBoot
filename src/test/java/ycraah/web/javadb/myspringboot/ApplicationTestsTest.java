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
    assertEquals(2, this.questionRepository.count());
    Optional<Question> oq = this.questionRepository.findById(1);
    assertTrue(oq.isPresent());
    Question q = oq.get();
    this.questionRepository.delete(q);
    assertEquals(1, questionRepository.count());

  }
}