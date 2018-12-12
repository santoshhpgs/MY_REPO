package com.personal.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class MaptoListJava {

    public static void main(String... args) {
        HashMap<String, String> personalLoanOffers = new HashMap<String, String>();
        // preparing hashmap with keys and values
        personalLoanOffers.put("personal loan by DBS", "Interest rate low");
        personalLoanOffers.put("personal loan by Standard Charted", "Interest rate low");
        personalLoanOffers.put("HSBC personal loan by DBS", "14%");
        personalLoanOffers.put("Bankd of America Personal loan", "11%");
      
        System.out.println("personalLoanOffers_map: " + personalLoanOffers);
      
        //Converting HashMap keys into ArrayList
        List<String> keyList = new ArrayList<String>(personalLoanOffers.keySet());
      //  System.out.println("Size of Key list from Map: " + keyList.size());
      
        //Converting HashMap Values into ArrayList
        List<String> valueList = new ArrayList<String>(personalLoanOffers.values());
       // System.out.println("Size of Value list from Map: " + valueList.size());


      
        List<Entry> entryList = new ArrayList(personalLoanOffers.entrySet());
       // System.out.println("Size of Entry list from Map: " + entryList.size());
        System.out.println("personalLoanOffers_List: " + entryList);
     

    }
}