package edu.fra.uas.config;
/*
import java.util.ArrayList;
import java.util.List;

public class initDB {
    private List<DataPoint> dataPoints = new ArrayList<>();

    public void addDataPoint(DataPoint dp) {
        dataPoints.add(dp);
    }

    public List<DataPoint> getDataPoints() {
        return dataPoints;
    }

    public String toJson() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < dataPoints.size(); i++) {
            sb.append("{\"label\":\"").append(dataPoints.get(i).getLabel()).append("\",\"wert\":").append(dataPoints.get(i).getY()).append("}");
            if (i != dataPoints.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static class DataPoint {
        private String label;
        private double y;

        public DataPoint(String label, double y) {
            this.label = label;
            this.y = y;
        }

        public String getLabel() {
            return label;
        }

        public double getY() {
            return y;
        }
    }
}
}*/
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.fra.uas.model.Barchart;
import edu.fra.uas.repository.BarchartRepository;

@Component
public class initDB {

    @Autowired
    private BarchartRepository repository;

   @PostConstruct
    private void init() {
     //   Barchart barchart1 = new Barchart("a", 123);

      //  this.repository.save(barchart1);
    
    }
}