package ru.ifmo.builder;

import javafx.util.Pair;
import ru.ifmo.trigonometric.Sine;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

public class CSVCreator {

    private Builder builder = new Builder(new Sine(0.001), null, null);


    public void fillFillBySinValues(double from, double to, double step) {
        List<Pair<BigDecimal, BigDecimal>> list =  builder.drawSine(from, to, step);
        try(FileWriter writer = new FileWriter("sine.csv", false)) {
            for(Pair<BigDecimal, BigDecimal> item : list) {
                StringBuilder builder =
                        (new StringBuilder(item.getKey().toString()))
                                .append(" | ")
                                .append(item.getValue().toString())
                                .append("\n");
                writer.append(builder);
            }

        } catch (IOException ex) {

        }
    }

}
