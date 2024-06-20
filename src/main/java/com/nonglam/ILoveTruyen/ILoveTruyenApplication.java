package com.nonglam.ILoveTruyen;

import com.nonglam.ILoveTruyen.model.Category;
import com.nonglam.ILoveTruyen.service.CategoryService;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Data
@SpringBootApplication
public class ILoveTruyenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ILoveTruyenApplication.class, args);
	}

}
