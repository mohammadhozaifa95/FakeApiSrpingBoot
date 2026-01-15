package SpringBootDemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OtpModel {
private String email;
private String subject;
private String message;
private String otp;
}
