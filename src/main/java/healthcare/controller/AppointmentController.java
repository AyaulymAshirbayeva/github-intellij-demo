package healthcare.controller;

import healthcare.entity.Appointment;
import healthcare.service.AppointmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping
    public Appointment create(@RequestBody Appointment appointment) {
        return appointmentService.create(appointment);
    }

    @GetMapping
    public List<Appointment> getAll() {
        return appointmentService.getAll();
    }
}
