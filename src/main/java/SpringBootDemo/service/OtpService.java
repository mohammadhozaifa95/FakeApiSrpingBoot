package SpringBootDemo.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import SpringBootDemo.model.OtpModel;

@Service
public class OtpService {
    @Autowired
	JavaMailSender sender;
    
    public String genrateOtp() {
    	return String.valueOf(100000+ new Random().nextInt(900000));
    }
    
    public OtpModel send(OtpModel model) {
    	String otp = genrateOtp();
    	model.setOtp(otp);
    	
    	SimpleMailMessage message=new SimpleMailMessage();
    	message.setTo(model.getEmail());
    	message.setSubject(model.getSubject());
    	message.setText(model.getMessage()+"\n YOUR OTP IS :"+otp);
    	
    	sender.send(message);
    	
		return model;
    	
    }
}
