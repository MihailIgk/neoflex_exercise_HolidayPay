package neoflex.exercise.HolidayPay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HolidayPayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolidayPayApplication.class, args);
	}
	
	@GetMapping("/calculacte")
	public double calculacte(@RequestParam(value = "middleSalary", defaultValue = "120000") double middleSalary) {
		return middleSalary;
	}

}
