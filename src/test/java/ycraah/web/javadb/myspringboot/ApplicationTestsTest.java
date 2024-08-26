package ycraah.web.javadb.myspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ApplicationTestsTest {

  @Autowired
  private QuestionRepository questionRepository;

  @Test
  void testJpa() {
    Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
    assertEquals(1, q.getId());
  }
}