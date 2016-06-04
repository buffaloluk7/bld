package cc.lukas.bld.flinksample;

import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.aggregation.Aggregations;
import org.apache.flink.api.java.tuple.Tuple2;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by Lukas on 05.06.2016.
 */
public class TokenizerExample {

    @Test
    public void runTokenizerExample() throws Exception {
        final ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();
        final DataSet<String> sampleString = env.fromElements("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus scelerisque, metus et commodo pharetra, diam mi dapibus purus, interdum accumsan mi turpis eget elit. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Suspendisse potenti. Cras eros eros, viverra id velit sed, tempus mollis quam. Vivamus maximus tristique laoreet. Vestibulum tempus fringilla metus. Vestibulum viverra nibh vitae neque hendrerit malesuada at vitae ante. Phasellus lobortis non diam sed commodo. Pellentesque facilisis massa a erat vulputate, id ornare felis malesuada. Nam nec dignissim est. Nulla sed pellentesque risus.");

        List<Tuple2<String, Integer>> wordCounts = sampleString
                .flatMap(new Tokenizer())
                .groupBy(0)
                .aggregate(Aggregations.SUM, 1)
                .collect();

        Assert.assertThat(wordCounts, Matchers.hasSize(71));
    }

}