import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    private static final int AFTERNOON_START = 12;
    private static final int AFTERNOON_END = 18;
    
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, parser);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour() >= AFTERNOON_START && appointmentDate.getHour() < AFTERNOON_END;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a");
        return String.format("You have an appointment on %s.", parser.format(appointmentDate));
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.now()
            .withMonth(9)
            .withDayOfMonth(15);
    }
}
