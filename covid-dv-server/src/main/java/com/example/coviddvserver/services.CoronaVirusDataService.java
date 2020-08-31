package com.example.coviddvserver.services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class CovidDVDataService {

public static String COVIDGlobalDataURL = "https://github.com/CSSEGISandData/COVID-19/blob/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_deaths_global.csv";
 
@PostConstruct
  public void fetchVirusData(){

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request =  HttpRequest.newBuilder().uri(URI.create(COVIDGlobalDataURL)).build(); 
    HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());

    System.out.println(httpResponse.body());

  }  

}