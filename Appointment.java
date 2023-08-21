

import java.util.Date;

public class Appointment {

  final private byte APPOINTMENT_ID_LENGTH;
  final private byte APPOINTMENT_DESCRIPTION_LENGTH;
  final private String INITIALIZER;
  private String appointmentId;
  private Date appointmentDate;
  private String description;

  {
    APPOINTMENT_ID_LENGTH = 10;
    APPOINTMENT_DESCRIPTION_LENGTH = 50;
    INITIALIZER = "INITIAL";
  }

  Appointment() {
    Date tomorrow = new Date();
    appointmentId = INITIALIZER;
    appointmentDate = tomorrow;
    description = INITIALIZER;
  }

  Appointment(String id) {
    Date tomorrow = new Date();
    updateAppointmentId(id);
    appointmentDate = tomorrow;
    description = INITIALIZER;
  }

  Appointment(String id, Date date) {
    updateAppointmentId(id);
    updateDate(date);
    description = INITIALIZER;
  }

  Appointment(String id, Date date, String description) {
    updateAppointmentId(id);
    updateDate(date);
    updateDescription(description);
  }

  public void updateAppointmentId(String id) {
    if (id == null) {
      throw new IllegalArgumentException("The Appointment ID Can't Be Null!");
    } else if (id.length() > APPOINTMENT_ID_LENGTH) {
      throw new IllegalArgumentException("The Appointment ID Can't Go Over " +
                                         APPOINTMENT_ID_LENGTH +
                                         " Characters.");
    } else {
      this.appointmentId = id;
    }
  }

  public String getAppointmentId() { return appointmentId; }

  public void updateDate(Date date) {
    if (date == null) {
      throw new IllegalArgumentException("The Appointment Date Can't Be Null");
    } else if (date.before(new Date())) {
      throw new IllegalArgumentException(
          "This Appointment is Not Current!");
    } else {
      this.appointmentDate = date;
    }
  }

  public Date getAppointmentDate() { return appointmentDate; }

  public void updateDescription(String description) {
    if (description == null) {
      throw new IllegalArgumentException(
          "The Appointment Description Can't Be Null!");
    } else if (description.length() > APPOINTMENT_DESCRIPTION_LENGTH) {
      throw new IllegalArgumentException(
          "The Appointment Description Can't Go Over " +
          APPOINTMENT_DESCRIPTION_LENGTH + "Characters.");
    } else {
      this.description = description;
    }
  }

  public String getDescription() { return description; }
}
