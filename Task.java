public class Task {

  private String Id;
  private String name;
  private String description;

  Task() {
    Id = "ID";
    name = "NAME";
    description = "DESCRIPTION";
  }

  Task(String Id) {
    checkId(Id);
    name = "NAME";
    description = "DESCRIPTION";
  }

  Task(String Id, String name) {
    checkId(Id);
    setName(name);
    description = "DESCRIPTION";
  }

  Task(String Id, String name, String description) {
    checkId(Id);
    setName(name);
    setDescription(description);
  }

  public final String getId() { return Id; }

  public final String getName() { return name; }

  protected void setName(String name) {
    if (name == null || name.length() > 20) {
      throw new IllegalArgumentException(
          "The Task Name Can't Be More Than 20 Characters.");
    } else {
      this.name = name;
    }
  }

  public final String getDescription() { return description; }

  protected void setDescription(String taskDescription) {
    if (taskDescription == null || taskDescription.length() > 50) {
      throw new IllegalArgumentException(
          "The Task Description Can't Be More Than 50 Characters.");
    } else {
      this.description = taskDescription;
    }
  }

  private void checkTaskId(String Id) {
    if (Id == null || Id.length() > 10) {
      throw new IllegalArgumentException(
          "Invalid. The ID Can't Be More Than 10 Characters.");
    } else {
      this.Id = Id;
    }
  }
}
