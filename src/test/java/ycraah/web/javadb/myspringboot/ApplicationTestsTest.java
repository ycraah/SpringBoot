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
    Optional<Answer> oa = this.answerRepository.findById(1);
    assertTrue(oa.isPresent());
    Answer a = oa.get();
    assertEquals(2, a.getQuestion().getId());
  }
}