package demo.ecommerce.business.concretes;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.HashMap;
import java.util.Map;

@Service
public class PredictService {

    private final RestTemplate restTemplate = new RestTemplate();

    public int kmeansPredict(double annualIncome, double spendingScore) {
        String url = "http://localhost:5000/kmeans";
        Map<String, Object> request = new HashMap<>();
        request.put("features", new double[]{annualIncome, spendingScore});
        Map<String, Integer> response = restTemplate.postForObject(url, request, Map.class);
        return response.get("cluster");
    }

    public double regressionPredict(double annualIncome) {
        String url = "http://localhost:5000/regression";
        Map<String, Object> request = new HashMap<>();
        request.put("annual_income", annualIncome);
        Map<String, Double> response = restTemplate.postForObject(url, request, Map.class);
        return response.get("spending_score");
    }

    public int classificationPredict(double annualIncome, int age) {
        String url = "http://localhost:5000/classification";
        Map<String, Object> request = new HashMap<>();
        request.put("features", new double[]{annualIncome, age});
        Map<String, Integer> response = restTemplate.postForObject(url, request, Map.class);
        return response.get("spending_class");
    }
}
