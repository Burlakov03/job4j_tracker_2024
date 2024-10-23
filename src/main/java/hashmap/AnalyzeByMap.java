package hashmap;

import java.util.*;
import java.util.function.BiFunction;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double sum = 0;
        int count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
                count++;
            }
        }
        return sum == 0 ? 0 : sum / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sum = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            labels.add(new Label(pupil.name(), sum == 0 ? 0 : sum / pupil.subjects().size()));
        }
        return labels;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> map = new HashMap<>();
        List<Label> result = new ArrayList<>();
        BiFunction<Integer, Integer, Integer> function = Integer::sum;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.merge(subject.name(), subject.score(), function);
            }
        }
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            result.add(new Label(item.getKey(), (double) item.getValue() / pupils.size()));
        }
        return result;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double result = 0;
            for (Subject subject : pupil.subjects()) {
                result += subject.score();
            }
            labels.add(new Label(pupil.name(), result));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        BiFunction<Integer, Integer, Integer> function = Integer::sum;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.merge(subject.name(), subject.score(), function);
            }
        }
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            labels.add(new Label(item.getKey(), item.getValue()));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }
}
