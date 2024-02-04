package Service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PraiseRegistration {
    private  final KafkaTemplate<Object,Object> template;

    public <T> void PraiseAddRegistration(String topicos, T dados){
        template.send(topicos,dados);}
}
