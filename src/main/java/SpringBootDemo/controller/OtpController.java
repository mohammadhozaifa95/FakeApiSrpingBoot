package SpringBootDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import SpringBootDemo.model.OtpModel;
import SpringBootDemo.service.OtpService;

@RestController
public class OtpController {
    @Autowired
	OtpService service;
    
    @PostMapping("/send")
    public OtpModel send(@RequestBody  OtpModel m) {
		return service.send(m);
    	
    }
}
