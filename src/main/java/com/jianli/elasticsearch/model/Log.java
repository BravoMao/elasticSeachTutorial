package com.jianli.elasticsearch.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author jzhang
 *
 */

@Document(indexName = "logs", type = "test")
public class Log {
  @Id
  private String id;

  private String country;

  private String date;

  private String metrics;

  public Log() {
    // defaut constuct
  }

  public Log(String id, String country, String date, String metrics) {
    super();
    this.id = id;
    this.country = country;
    this.date = date;
    this.metrics = metrics;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getMetrics() {
    return metrics;
  }

  public void setMetrics(String metrics) {
    this.metrics = metrics;
  }

  @Override
  public String toString() {
    return "Book{" +
        "id='" + id + '\'' +
        ", country='" + country + '\'' +
        ", date='" + date + '\'' +
        ", metrics='" + metrics + '\'' +
        '}';
  }


}
