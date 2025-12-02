import java.util.ArrayList;
import java.util.List;

public class LearningData {

    public static List<Number> getNumbersFrom1To10() {
        List<Number> learningData = new ArrayList<>();
        learningData.add(new Number(1, "un"));
        learningData.add(new Number(2, "deux"));
        learningData.add(new Number(3, "trois"));
        learningData.add(new Number(4, "quatre"));
        learningData.add(new Number(5, "cinq"));
        learningData.add(new Number(6, "six"));
        learningData.add(new Number(7, "sept"));
        learningData.add(new Number(8, "huit"));
        learningData.add(new Number(9, "neuf"));
        learningData.add(new Number(10, "dix"));
        return learningData;
    }
    public static List<Number> getNumbersFrom11To19() {
        List<Number> learningData = new ArrayList<>();
        learningData.add(new Number(11, "onze"));
        learningData.add(new Number(12, "douze"));
        learningData.add(new Number(13, "treize"));
        learningData.add(new Number(14, "quatorze"));
        learningData.add(new Number(15, "quinze"));
        learningData.add(new Number(16, "seize"));
        learningData.add(new Number(17, "dix-sept"));
        learningData.add(new Number(18, "dix-huit"));
        learningData.add(new Number(19, "dix-neuf"));
        return learningData;
    }

    public static List<Number> getNumbersFrom20To100() {
        List<Number> learningData = new ArrayList<>();
        learningData.add(new Number(20, "vingt"));
        learningData.add(new Number(30, "trente"));
        learningData.add(new Number(40, "quarante"));
        learningData.add(new Number(50, "cinquante"));
        learningData.add(new Number(60, "soixante"));
        learningData.add(new Number(70, "soixante-dix"));
        learningData.add(new Number(80, "quatre-vingts"));
        learningData.add(new Number(90, "quatre-vingt-dix"));
        learningData.add(new Number(100, "cent"));
        return learningData;
    }
}
