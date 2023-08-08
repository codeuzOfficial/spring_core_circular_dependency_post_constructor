package dasturlash.uz;

import org.springframework.stereotype.Service;


@Service
public class SmsService {
    private StudentService service;

    public void setService(StudentService service) {
        this.service = service;
    }
}
