package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.model.Item;
import com.example.model.ItemRepository;
import com.example.model.ItemSection;
import com.example.model.ItemSectionRepository;
import com.example.model.Section;
import com.example.model.Store;
import com.example.model.StoreRepository;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@Bean
	public CommandLineRunner demo(ItemRepository itemRepository, StoreRepository storeRepository,
			ItemSectionRepository itemSectionRepository) {
		return (args) -> {
			
		};
	}
}
