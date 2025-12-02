import java.util.ArrayList;
import java.util.List;

public class LearningData {

    public static List<Phrase> getNumbersFrom1To10() {
        List<Phrase> learningData = new ArrayList<>();
        learningData.add(new Phrase(1, "un"));
        learningData.add(new Phrase(2, "deux"));
        learningData.add(new Phrase(3, "trois"));
        learningData.add(new Phrase(4, "quatre"));
        learningData.add(new Phrase(5, "cinq"));
        learningData.add(new Phrase(6, "six"));
        learningData.add(new Phrase(7, "sept"));
        learningData.add(new Phrase(8, "huit"));
        learningData.add(new Phrase(9, "neuf"));
        learningData.add(new Phrase(10, "dix"));
        return learningData;
    }
    public static List<Phrase> getNumbersFrom11To19() {
        List<Phrase> learningData = new ArrayList<>();
        learningData.add(new Phrase(11, "onze"));
        learningData.add(new Phrase(12, "douze"));
        learningData.add(new Phrase(13, "treize"));
        learningData.add(new Phrase(14, "quatorze"));
        learningData.add(new Phrase(15, "quinze"));
        learningData.add(new Phrase(16, "seize"));
        learningData.add(new Phrase(17, "dix-sept"));
        learningData.add(new Phrase(18, "dix-huit"));
        learningData.add(new Phrase(19, "dix-neuf"));
        return learningData;
    }

    public static List<Phrase> getNumbersFrom20To100() {
        List<Phrase> learningData = new ArrayList<>();
        learningData.add(new Phrase(20, "vingt"));
        learningData.add(new Phrase(30, "trente"));
        learningData.add(new Phrase(40, "quarante"));
        learningData.add(new Phrase(50, "cinquante"));
        learningData.add(new Phrase(60, "soixante"));
        learningData.add(new Phrase(70, "soixante-dix"));
        learningData.add(new Phrase(80, "quatre-vingts"));
        learningData.add(new Phrase(90, "quatre-vingt-dix"));
        learningData.add(new Phrase(100, "cent"));
        return learningData;
    }
}
