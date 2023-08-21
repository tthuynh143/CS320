import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaskTest {

  private String id, name, description;
  private String tooLongId, tooLongName, tooLongDescription;

  @BeforeEach
  void setUp() {
    id = "112457891";
    name = "Bunny Project";
    description = "Task Needs Description.";
    tooLongId = "45178411544478881123";
    tooLongName = "Task Name Too Long";
    tooLongDescription =
        "Description Can't Be Longer Than 50 Characters!.";
  }

  @Test
  void getTaskIdTest() {
    Task task = new Task(id);
    Assertions.assertEquals(id, task.getId());
  }

  @Test
  void getNameTest() {
    Task task = new Task(id, name);
    Assertions.assertEquals(name, task.getName());
  }

  @Test
  void getDescriptionTest() {
    Task task = new Task(id, name, description);
    Assertions.assertEquals(description, task.getDescription());
  }

  @Test
  void setNameTest() {
    Task task = new Task();
    task.setName(name);
    Assertions.assertEquals(name, task.getName());
  }

  @Test
  void setDescriptionTest() {
    Task task = new Task();
    task.setDescription(description);
    Assertions.assertEquals(description, task.getDescription());
  }

  @Test
  void TaskIdTooLongTest() {
    Assertions.assertThrows(IllegalArgumentException.class,
                            () -> new Task(tooLongId));
  }

  @Test
  void setTooLongNameTest() {
    Task task = new Task();
    Assertions.assertThrows(IllegalArgumentException.class,
                            () -> task.setName(tooLongName));
  }

  @Test
  void setTooLongDescriptionTest() {
    Task task = new Task();
    Assertions.assertThrows(IllegalArgumentException.class,
                            () -> task.setDescription(tooLongDescription));
  }

  @Test
  void TaskIdNullTest() {
    Assertions.assertThrows(IllegalArgumentException.class,
                            () -> new Task(null));
  }

  @Test
  void TaskNameNullTest() {
    Task task = new Task();
    Assertions.assertThrows(IllegalArgumentException.class,
                            () -> task.setName(null));
  }

  @Test
  void TaskDescriptionNullTest() {
    Task task = new Task();
    Assertions.assertThrows(IllegalArgumentException.class,
                            () -> task.setDescription(null));
  }
}
