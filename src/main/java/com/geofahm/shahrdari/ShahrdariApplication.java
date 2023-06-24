package com.geofahm.shahrdari;

import com.geofahm.shahrdari.config.Backup;
import com.github.eloyzone.jalalicalendar.DateConverter;
import com.github.eloyzone.jalalicalendar.JalaliDate;
import com.github.eloyzone.jalalicalendar.JalaliDateFormatter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@SpringBootApplication

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan(basePackages = "com.geofahm.shahrdari")
//
//@EnableJpaRepositories(basePackages = {"com.geofahm.shahrdari.model.repository"})
//@EntityScan(basePackages = {"com.geofahm.shahrdari.model.entity"})
public class ShahrdariApplication extends SpringBootServletInitializer {
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ShahrdariApplication.class);
	}
	public static void main(String[] args) {


		SpringApplication.run(ShahrdariApplication.class, args);
	}

}
