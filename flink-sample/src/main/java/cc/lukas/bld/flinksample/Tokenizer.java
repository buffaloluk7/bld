package cc.lukas.bld.flinksample;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.util.Collector;

/**
 * Created by Lukas on 05.06.2016.
 *
 * Implements the string tokenizer that splits sentences into words as a user-defined
 * FlatMapFunction. The function takes a line (String) and splits it into
 * multiple pairs in the form of "(word,1)" ({@code Tuple2<String, Integer>}).
 */
public class Tokenizer implements FlatMapFunction<String, Tuple2<String, Integer>> {

    @Override
    public void flatMap(String value, Collector<Tuple2<String, Integer>> out) {
        // normalize and split the line
        String[] tokens = value.toLowerCase().split("\\W+");

        // emit the pairs
        for (String token : tokens) {
            if (token.length() > 0) {
                out.collect(new Tuple2<>(token, 1));
            }
        }
    }

}