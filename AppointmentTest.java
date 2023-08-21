


import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppointmentTest {

  private String id, description;
  private String tooLongId, tooLongDescription;
  private Date date, pastDate;

  @SuppressWarnings("deprecation")
  @BeforeEach
  void setUp() {
    id = "011045784";
    description = "Appointment Needs The Required Description.";
    date = new Date(3021, Calendar.JANUARY, 1);
    tooLongId = "0000000000000477911346461";
    tooLongDescription =
        "The Description Is Too Long.";
    pastDate = new Date(0);
  }

  @Test
  void testUpdateAppointmentId() {
    Appointment appt = new Appointment();
    assertThrows(IllegalArgumentException.class,
                 () -> appt.updateAppointmentId(null));
    assertThrows(IllegalArgumentException.class,
                 () -> appt.updateAppointmentId(tooLongId));
    appt.updateAppointmentId(id);
    assertEquals(id, appt.getAppointmentId());
  }

  @Test
  void testGetAppointmentId() {
    Appointment appt = new Appointment(id);
    assertNotNull(appt.getAppointmentId());
    assertEquals(appt.getAppointmentId().length(), 10);
    assertEquals(id, appt.getAppointmentId());
  }

  @Test
  void testUpdateDate() {
    Appointment appt = new Appointment();
    assertThrows(IllegalArgumentException.class, () -> appt.updateDate(null));
    assertThrows(IllegalArgumentException.class,
                 () -> appt.updateDate(pastDate));
    appt.updateDate(date);
    assertEquals(date, appt.getAppointmentDate());
  }

  @Test
  void testGetAppointmentDate() {
    Appointment appt = new Appointment(id, date);
    assertNotNull(appt.getAppointmentDate());
    assertEquals(date, appt.getAppointmentDate());
  }

  @Test
  void testUpdateDescription() {
    Appointment appt = new Appointment();
    assertThrows(IllegalArgumentException.class,
                 () -> appt.updateDescription(null));
    assertThrows(IllegalArgumentException.class,
                 () -> appt.updateDescription(tooLongDescription));
    appt.updateDescription(description);
    assertEquals(description, appt.getDescription());
  }

  @Test
  void testGetDescription() {
    Appointment appt = new Appointment(id, date, description);
    assertNotNull(appt.getDescription());
    assertTrue(appt.getDescription().length() <= 50);
    assertEquals(description, appt.getDescription());
  }
}