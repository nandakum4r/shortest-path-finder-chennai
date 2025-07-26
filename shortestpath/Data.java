package shortestpath;

import java.util.HashMap;
import java.util.Map;


public class Data {
    
        // Create the outer map
        public static Map<String, Map<String, Double>> dist = new HashMap<>();
        static
        {
        // Populate the map
        dist.put("Adayar", createInnerMap(new String[]{"Besant Nagar", "Guindy", "Thiruvanmiyur", "Santhome"}, new double[]{1.1, 6.0, 2.4, 5.8}));
        dist.put("Alandur", createInnerMap(new String[]{"Guindy", "Velachery", "Nanganallur", "Pallavaram", "Manapakkam", "Ashok Nagar"}, new double[]{4.2, 6.3, 3.4, 6.8, 4.1, 5.0}));
        dist.put("Alwarpet", createInnerMap(new String[]{"Teynampet", "Mylapore", "Saidapet"}, new double[]{1.3, 2.1, 5.3}));
        dist.put("Ambattur", createInnerMap(new String[]{"Avadi", "Mogappair", "Kolathur"}, new double[]{9.7, 7.0, 8.9}));
        dist.put("Anna Nagar", createInnerMap(new String[]{"Mogappair", "Koyambedu", "Ayanavaram", "Choolaimedu", "Kolathur"}, new double[]{4.5, 3.8, 4.3, 3.8, 6.6}));
        dist.put("Ashok Nagar", createInnerMap(new String[]{"Saidapet", "K.K. Nagar", "Alandur", "Vadapalani", "T. Nagar", "Manapakkam", "Kodambakkam"}, new double[]{3.2, 1.7, 5.0, 1.7, 3.0, 5.4, 2.6}));
        dist.put("Avadi", createInnerMap(new String[]{"Ambattur", "Mogappair", "Porur"}, new double[]{9.7, 10.9, 13.8}));
        dist.put("Ayanavaram", createInnerMap(new String[]{"Kolathur", "Anna Nagar", "Washermanpet", "Egmore", "Choolaimedu"}, new double[]{5.0, 4.3, 9.2, 5.2, 5.7}));
        dist.put("Besant Nagar", createInnerMap(new String[]{"Adayar", "Santhome", "Thiruvanmiyur"}, new double[]{1.1, 7.1, 2.9}));
        dist.put("Choolaimedu", createInnerMap(new String[]{"Koyambedu", "Vadapalani", "Kodambakkam", "Nungambakkam", "Anna Nagar", "Egmore", "Ayanavaram"}, new double[]{5.1, 2.4, 1.8, 3.0, 3.8, 5.0, 5.7}));
        dist.put("Chromepet", createInnerMap(new String[]{"Tambaram", "Pallavaram", "Medavakkam"}, new double[]{6.8, 3.1, 8.3}));
        dist.put("Egmore", createInnerMap(new String[]{"Nungambakkam", "Mount Road", "Ayanavaram", "Choolaimedu", "Washermanpet"}, new double[]{3.9, 1.7, 5.2, 5.0, 8.1}));
        dist.put("Guindy", createInnerMap(new String[]{"Adayar", "Alandur", "Velachery", "Saidapet", "Manapakkam"}, new double[]{6.0, 4.2, 3.0, 2.3, 5.9}));
        dist.put("Injambakkam", createInnerMap(new String[]{"Sholinghanallur", "Medavakkam", "Pallikaranai", "Thiruvanmiyur"}, new double[]{4.6, 10.7, 10.7, 7.1}));
        dist.put("K.K. Nagar", createInnerMap(new String[]{"Ashok Nagar", "Porur", "Manapakkam", "Vadapalani", "Koyambedu"}, new double[]{1.7, 5.6, 4.0, 2.3, 5.0}));
        dist.put("Kodambakkam", createInnerMap(new String[]{"Vadapalani", "Ashok Nagar", "T. Nagar", "Choolaimedu", "Nungambakkam"}, new double[]{1.6, 2.6, 2.1, 1.8, 2.7}));
        dist.put("Kolathur", createInnerMap(new String[]{"Ambattur", "Madhavaram", "Mogappair", "Anna Nagar", "Ayanavaram", "Washermanpet"}, new double[]{8.9, 5.1, 8.1, 6.6, 5.0, 10.9}));
        dist.put("Koyambedu", createInnerMap(new String[]{"Mogappair", "Porur", "K.K. Nagar", "Vadapalani", "Choolaimedu", "Anna Nagar"}, new double[]{4.0, 7.7, 5.0, 4.2, 5.1, 3.8}));
        dist.put("Madhavaram", createInnerMap(new String[]{"Kolathur", "Washermanpet"}, new double[]{5.1, 9.7}));
        dist.put("Madipakkam", createInnerMap(new String[]{"Nanganallur", "Velachery", "Pallikaranai", "Pallavaram"}, new double[]{2.6, 4.4, 5.8, 2.6}));
        dist.put("Manapakkam", createInnerMap(new String[]{"Porur", "K.K. Nagar", "Alandur", "Saidapet", "Ashok Nagar", "Guindy"}, new double[]{3.8, 4.0, 4.1, 5.7, 5.4, 5.9}));
        dist.put("Medavakkam", createInnerMap(new String[]{"Tambaram", "Sholinghanallur", "Pallikaranai", "Injambakkam", "Chromepet"}, new double[]{10.6, 6.0, 4.0, 10.7, 8.3}));
        dist.put("Mogappair", createInnerMap(new String[]{"Anna Nagar", "Koyambedu", "Ambattur", "Avadi", "Kolathur", "Porur"}, new double[]{4.5, 4.0, 7.0, 10.9, 8.1, 8.2}));
        dist.put("Mount Road", createInnerMap(new String[]{"Egmore", "Mylapore"}, new double[]{1.7, 5.4}));
        dist.put("Mylapore", createInnerMap(new String[]{"Mount Road", "Alwarpet", "Santhome", "Teynampet"}, new double[]{5.4, 2.1, 2.6, 2.7}));
        dist.put("Nanganallur", createInnerMap(new String[]{"Alandur", "Velachery", "Madipakkam", "Pallavaram"}, new double[]{3.4, 6.3, 2.6, 5.7}));
        dist.put("Nungambakkam", createInnerMap(new String[]{"Choolaimedu", "Kodambakkam", "Egmore", "T. Nagar", "Teynampet"}, new double[]{3.0, 2.7, 3.9, 2.9, 4.1}));
        dist.put("Pallavaram", createInnerMap(new String[]{"Chromepet", "Nanganallur", "Madipakkam", "Alandur"}, new double[]{3.1, 5.7, 2.6, 6.8}));
        dist.put("Pallikaranai", createInnerMap(new String[]{"Medavakkam", "Sholinghanallur", "Injambakkam", "Madipakkam"}, new double[]{4.0, 4.4, 10.7, 5.8}));
        dist.put("Porur", createInnerMap(new String[]{"Mogappair", "Manapakkam", "K.K. Nagar", "Koyambedu", "Avadi"}, new double[]{8.2, 3.8, 5.6, 7.7, 13.8}));
        dist.put("Saidapet", createInnerMap(new String[]{"Alwarpet", "Ashok Nagar", "Guindy", "Manapakkam", "T. Nagar"}, new double[]{5.3, 3.2, 2.3, 5.7, 3.3}));
        dist.put("Santhome", createInnerMap(new String[]{"Adayar", "Besant Nagar", "Mylapore"}, new double[]{5.8, 7.1, 2.6}));
        dist.put("Sholinghanallur", createInnerMap(new String[]{"Medavakkam", "Pallikaranai", "Injambakkam"}, new double[]{6.0, 4.4, 4.6}));
        dist.put("Tambaram", createInnerMap(new String[]{"Chromepet", "Medavakkam"}, new double[]{6.8, 10.6}));
        dist.put("Teynampet", createInnerMap(new String[]{"Alwarpet", "T. Nagar", "Mylapore", "Nungambakkam"}, new double[]{1.3, 2.3, 2.7, 4.1}));
        dist.put("Thiruvanmiyur", createInnerMap(new String[]{"Adayar", "Besant Nagar", "Injambakkam", "Velachery"}, new double[]{2.4, 2.9, 7.1, 7.1}));
        dist.put("T. Nagar", createInnerMap(new String[]{"Kodambakkam", "Nungambakkam", "Teynampet", "Saidapet", "Ashok Nagar", "Vadapalani"}, new double[]{2.1, 2.9, 2.3, 3.3, 3.0, 4.0}));
        dist.put("Vadapalani", createInnerMap(new String[]{"T. Nagar", "K.K. Nagar", "Ashok Nagar", "Koyambedu", "Kodambakkam", "Choolaimedu"}, new double[]{4.0, 2.3, 1.7, 4.2, 1.6, 2.4}));
        dist.put("Velachery", createInnerMap(new String[]{"Alandur", "Guindy", "Madipakkam", "Nanganallur", "Thiruvanmiyur"}, new double[]{6.3, 3.0, 4.4, 6.3, 7.1}));
        dist.put("Washermanpet", createInnerMap(new String[]{"Madhavaram", "Kolathur", "Ayanavaram", "Egmore"}, new double[]{9.7, 10.9, 9.2, 8.1}));
    }


    private static Map<String, Double> createInnerMap(String[] keys, double[] values) {
        Map<String, Double> innerMap = new HashMap<>();
        for (int i = 0; i < keys.length; i++) {
            innerMap.put(keys[i], values[i]);
        }
        return innerMap;
    }
}