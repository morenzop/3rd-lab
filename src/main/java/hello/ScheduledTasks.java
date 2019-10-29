package hello;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

RestTemplate restTemplate= new RestTemplate();
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
   Info otherShit= restTemplate.getForObject("https://api.cryptonator.com/api/ticker/btc-usd", Info.class);
   log.info(otherShit.toString());
    }

}
