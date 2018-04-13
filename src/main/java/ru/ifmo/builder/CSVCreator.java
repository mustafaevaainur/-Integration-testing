package ru.ifmo.builder;

import javafx.util.Pair;
import ru.ifmo.logarithmic.NaturalLog;
import ru.ifmo.trigonometric.Sine;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

public class CSVCreator {

    private Builder builder = new Builder(new Sine(0.001), new NaturalLog(0.001), null);


    public void fillFillBySinValues(double from, double to, double step) {
        List<Pair<BigDecimal, BigDecimal>> list =  builder.drawSine(from, to, step);
        try(FileWriter writer = new FileWriter("sine.csv", false)) {
            writer.append("x, sin(x)\n");
            for(Pair<BigDecimal, BigDecimal> item : list) {
                StringBuilder builder =
                        (new StringBuilder(item.getKey().toString()))
                                .append(" , ")
                                .append(item.getValue().toString())
                                .append("\n");
                writer.append(builder);
            }

        } catch (IOException ex) {

        }
    }

    public void fillFillByNaturalLogValues(double from, double to, double step) {
        List<Pair<BigDecimal, BigDecimal>> list =  builder.drawNaturalLog(from, to, step);
        try(FileWriter writer = new FileWriter("natlog.csv", false)) {
            writer.append("x, ln(x)\n");
            for(Pair<BigDecimal, BigDecimal> item : list) {
                StringBuilder builder =
                        (new StringBuilder(item.getKey().toString()))
                                .append(" , ")
                                .append(item.getValue().toString())
                                .append("\n");
                writer.append(builder);
            }

        } catch (IOException ex) {

        }
    }

}
