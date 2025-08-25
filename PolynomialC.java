import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PolynomialC {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = null;
        try {
            root = mapper.readTree(new File("input.json"));
        } catch (Exception e) {
            System.err.println("Error reading input file: " + e.getMessage());
            return;
        }

        int k = root.get("keys").get("k").asInt();
        List<BigInteger> X = new ArrayList<>(), Y = new ArrayList<>();

        for (int i = 1; X.size() < k; i++) {
            String key = String.valueOf(i);
            if (!root.has(key)) continue;
            JsonNode node = root.get(key);
            BigInteger x = BigInteger.valueOf(i);
            BigInteger y = new BigInteger(node.get("value").asText(), node.get("base").asInt());
            X.add(x);
            Y.add(y);
        }

        BigInteger c = BigInteger.ZERO;
        for (int i = 0; i < k; i++) {
            BigInteger xi = X.get(i), yi = Y.get(i);
            BigInteger num = BigInteger.ONE, den = BigInteger.ONE;
            for (int j = 0; j < k; j++) {
                if (i == j) continue;
                BigInteger xj = X.get(j);
                num = num.multiply(xj.negate());
                den = den.multiply(xi.subtract(xj));
            }
            c = c.add(yi.multiply(num).divide(den));
        }

        System.out.println("Constant c = " + c);
    }
}