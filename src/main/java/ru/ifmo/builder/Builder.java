package ru.ifmo.builder;

import javafx.util.Pair;
import ru.ifmo.interfaces.INaturalLog;
import ru.ifmo.interfaces.ISine;
import ru.ifmo.system.CompoundedFunction;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class Builder {

    ISine iSine;
    INaturalLog iNaturalLog;
    CompoundedFunction systemSolver;
    public Builder(ISine iSine, INaturalLog iNaturalLog, CompoundedFunction systemSolver) {
        this.iNaturalLog = iNaturalLog;
        this.iSine = iSine;
        this.systemSolver = systemSolver;
    }

    public List<Pair<BigDecimal, BigDecimal>> drawSine(double from, double to, double step) {
        List<Pair<BigDecimal, BigDecimal>> list = new LinkedList<>();
        BigDecimal calc;
        for (double i = from; i < to; i+=step) {
            try {
                calc = iSine.calculate(i);
                list.add(new Pair<BigDecimal, BigDecimal>(new BigDecimal(i), calc));
            } catch (Exception ex) {

            }
        }
        return list;
    }
}
