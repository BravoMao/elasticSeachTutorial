package com.jianli.elasticsearch;

import com.jianli.elasticsearch.model.Log;
import com.jianli.elasticsearch.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ESApplication implements CommandLineRunner {

  @Autowired
  private LogRepository logRepository;

  public static void main(String[] args) {
    SpringApplication.run(ESApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {


    logRepository.save(new Log("001", "us", "201710151420", "test"));
    logRepository.save(new Log("002", "us", "201710151420", "test2"));
    logRepository.save(new Log("003", "us", "201710151420", "test3"));

    // fuzzey search
    List<Log> logs = logRepository.findByCountry("us");

    // List<Book> books = bookService.findByTitle("Elasticsearch Basics");

    logs.forEach(x -> System.out.println(x));


  }

}
