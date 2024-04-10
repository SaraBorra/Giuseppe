package Giuseppe.com.Giuseppe;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GiuseppeController {

    @GetMapping("/v1/ciao")
    public String hello(@RequestParam("nome") String nome, @RequestParam("provincia") String provincia ){
        return "Ciao " +nome + ", com'è il tempo in " +provincia+ "?";
    }

}
