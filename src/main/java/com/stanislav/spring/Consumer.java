package com.stanislav.spring;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Stanislav Hlova
 */
public class Consumer {
    public static void main(String[] args) throws IOException {
        RestTemplate restTemplate = new RestTemplate();

        String url = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json";
        String response = restTemplate.getForObject(url, String.class);

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(response);
        List<Currency> currencyList = new ArrayList<>();
        for (JsonNode node : jsonNode) {
            Currency currency = new Currency();
            currency.setTxt(new String(node.get("txt").asText().getBytes(StandardCharsets.UTF_8)));
            currency.setCc(new String(node.get("cc").asText().getBytes(StandardCharsets.UTF_8)));
            currency.setExchangeDate(new String(node.get("exchangedate").asText().getBytes(StandardCharsets.UTF_8)));
            currency.setR030(Integer.parseInt(new String(node.get("r030").asText().getBytes(StandardCharsets.UTF_8))));
            currency.setRate(Double.parseDouble(new String(node.get("rate").asText().getBytes(StandardCharsets.UTF_8))));

            currencyList.add(currency);
        }
        Currency[] currencyArray = currencyList.toArray(new Currency[0]);
        Arrays.sort(currencyArray);
        for(Currency currency : currencyArray){
            System.out.println(currency);
        }

    }
}
