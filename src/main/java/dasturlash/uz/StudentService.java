package dasturlash.uz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class StudentService {
    @Autowired
    private SmsService smsService;

    @PostConstruct
    public void init() {
        smsService.setService(this);
    }
}
