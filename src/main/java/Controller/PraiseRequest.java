package Controller;

import Service.PraiseRegistration;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PraiseRequest {
    private final PraiseRegistration eventosService;
    @PostMapping(path = "/api/salva-pedido")
    public ResponseEntity<String> salvarPedido(@RequestBody PraiseRequest pedido){
        eventosService.PraiseAddRegistration("SalvarPedido", pedido);
        return ResponseEntity.ok("Sucesso");
    }

}
