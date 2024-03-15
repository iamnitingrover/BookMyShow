package in.nitingrover.BookMyShow.controller;

import in.nitingrover.BookMyShow.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //Tells SpringBoot that this is a controller and based on Rest APIs
public class TicketController {

    @Autowired  //create the dependency and inject inside controller
    private TicketService ticketService;
    @GetMapping("/hello")
    public ResponseEntity test(){
        String hello = ticketService.test();
        return ResponseEntity.ok(hello);
    }
}
