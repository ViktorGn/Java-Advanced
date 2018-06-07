import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class E10PopulationCounterNoStream {
    static class City {
        String name;
        Long population;
        City (String name,Long population){
            this.name=name;
            this.population=population;
        }
        int compareTo(City c){
            int res=0;
            if (c.population>this.population) res = 1;
            if (c.population<this.population) res = -1;
            return res;
        }



    }
    static class ResultLine {
        String name;
        Long population;
        List<City> cities;
        ResultLine(String name, City city) {
            this.name=name;
            this.population=city.population;
            this.cities=new LinkedList<>();
            cities.add(city);
        }
        String tostring (){
            cities.sort((a,b)->a.compareTo(b));
            String re=String.format("%s (total population: %d)",name, population);
            for (City e : cities) {//in collcetion c
                    re=re+String.format("\n=>%s: %d", e.name, e.population);
            }
          return re;
        };
        int compareTo(ResultLine r){
            int res=0;
            if (r.population>this.population) res = 1;
            if (r.population<this.population) res = -1;
            return res;
        }
    }

public static void main(String[] args) throws IOException {
// Init
    List<ResultLine> result = new LinkedList<>();
// Input
    String text = "";
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    while (!"report".equals(text = reader.readLine())) {
        String[] tokens = text.split("\\|");
        String inCity = tokens[0];
        String inCountry = tokens[1];
        Long inPopulation = Long.parseLong(tokens[2]);
        City c = new City(inCity, inPopulation);

        ResultLine l = findRL(inCountry, result);

        if (l == null) {
            ResultLine r = new ResultLine(inCountry, c);
            result.add(r);
        } else {
            l.population += inPopulation;
            l.cities.add(c);
        }
    }
    result.sort((a,b)->a.compareTo(b));
    result.forEach(e-> System.out.println(e.tostring()));
}


    private static ResultLine findRL(String inCountry, List<ResultLine> result) {
        ResultLine r = null;
        for (ResultLine e : result) {
            if (e.name.equals(inCountry)) {
                r = e;
                break;
            }
        }
        return r;
    }
}