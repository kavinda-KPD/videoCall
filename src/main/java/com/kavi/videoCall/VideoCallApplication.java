package com.kavi.videoCall;

import com.kavi.videoCall.user.User;
import com.kavi.videoCall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideoCallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoCallApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			UserService service
	){
		return args -> {
			service.register(User.builder()
					.userName("Kavi")
					.email("kavi@mail.com")
					.password("kpd")
					.build());
			service.register(User.builder()
					.userName("pasan")
					.email("pasan@mail.com")
					.password("psn")
					.build());
			service.register(User.builder()
					.userName("rasika")
					.email("rsk@mail.com")
					.password("rsk")
					.build());
			service.register(User.builder()
					.userName("diss")
					.email("diss@mail.com")
					.password("diss")
					.build());
		};
	}
}
