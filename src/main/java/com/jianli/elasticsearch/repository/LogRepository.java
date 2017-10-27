package com.jianli.elasticsearch.repository;

import com.jianli.elasticsearch.model.Log;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface LogRepository extends ElasticsearchRepository<Log, String> {
  List<Log> findByMetrics(String metrics);

  List<Log> findByCountry(String country);

}
