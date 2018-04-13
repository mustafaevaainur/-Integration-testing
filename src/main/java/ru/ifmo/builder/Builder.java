package ru.ifmo.builder;

import javafx.util.Pair;
import ru.ifmo.interfaces.INaturalLog;
import ru.ifmo.interfaces.ISine;
import ru.ifmo.system.CompoundedFunction;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class Builder {

    private ISine iSine;
    private INaturalLog iNaturalLog;
    private CompoundedFunction compoundedFunction;
    public Builder(ISine iSine, INaturalLog iNaturalLog, CompoundedFunction compoundedFunction) {
        this.iNaturalLog = iNaturalLog;
        this.iSine = iSine;
        this.compoundedFunction = compoundedFunction;
    }

    public List<Pair<BigDecimal, BigDecimal>> drawSine(double from, double to, double step) {
        List<Pair<BigDecimal, BigDecimal>> list = new LinkedList<>();
        BigDecimal calc;
        for (double i = from; i < to; i+=step) {
            try {
                calc = iSine.calculate(i);
                list.add(new Pair<>(new BigDecimal(i), calc));
            } catch (Exception ex) {

            }
        }
        return list;
    }

    public List<Pair<BigDecimal, BigDecimal>> drawNaturalLog(double from, double to, double step) {
        List<Pair<BigDecimal, BigDecimal>> list = new LinkedList<>();
        BigDecimal calc;
        for (double i = from; i < to; i+=step) {
            try {
                calc = iNaturalLog.calculate(i);
                list.add(new Pair<>(new BigDecimal(i), calc));
            } catch (Exception ex) {

            }
        }
        return list;
    }

    public List<Pair<BigDecimal, BigDecimal>> drawCompoundFunction(double from, double to, double step) {
        List<Pair<BigDecimal, BigDecimal>> list = new LinkedList<>();
        BigDecimal calc;
        for (double i = from; i < to; i+=step) {
            try {
                calc = compoundedFunction.calculate(i);
                list.add(new Pair<>(new BigDecimal(i), calc));
            } catch (Exception ex) {

            }
        }
        return list;
    }
}
