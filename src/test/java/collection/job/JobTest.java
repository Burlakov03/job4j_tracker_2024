package collection.job;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class JobTest {
    @Test
    public void whenJobAscByName() {
        List<Job> jobs = Arrays.asList(
                new Job("Ivan", 1),
                new Job("Petr", 5),
                new Job("Vladimir", 2),
                new Job("Alexandr", 2),
                new Job("Andrei", 4)
        );
        jobs.sort(new JobAscByName());
        List<Job> expected = Arrays.asList(
                new Job("Alexandr", 2),
                new Job("Andrei", 4),
                new Job("Ivan", 1),
                new Job("Petr", 5),
                new Job("Vladimir", 2)
        );
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenJobDescByName() {
        List<Job> jobs = Arrays.asList(
                new Job("Ivan", 1),
                new Job("Petr", 5),
                new Job("Vladimir", 2),
                new Job("Alexandr", 2),
                new Job("Andrei", 4)
        );
        jobs.sort(new JobDescByName());
        List<Job> expected = Arrays.asList(
                new Job("Vladimir", 2),
                new Job("Petr", 5),
                new Job("Ivan", 1),
                new Job("Andrei", 4),
                new Job("Alexandr", 2)
        );
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenJobAscByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Ivan", 1),
                new Job("Petr", 5),
                new Job("Vladimir", 2),
                new Job("Alexandr", 2),
                new Job("Andrei", 4)
        );
        jobs.sort(new JobAscByPriority());
        List<Job> expected = Arrays.asList(
                new Job("Ivan", 1),
                new Job("Vladimir", 2),
                new Job("Alexandr", 2),
                new Job("Andrei", 4),
                new Job("Petr", 5)
        );
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenJobDescByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("Ivan", 1),
                new Job("Petr", 5),
                new Job("Vladimir", 2),
                new Job("Alexandr", 2),
                new Job("Andrei", 4)
        );
        jobs.sort(new JobDescByPriority());
        List<Job> expected = Arrays.asList(
                new Job("Petr", 5),
                new Job("Andrei", 4),
                new Job("Vladimir", 2),
                new Job("Alexandr", 2),
                new Job("Ivan", 1)
        );
        assertThat(jobs).isEqualTo(expected);
    }

    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> jobComparator = new JobAscByPriority().thenComparing(new JobDescByName());
        int result = jobComparator.compare(
                new Job("Impl Task", 0),
                new Job("Fix Bag", 1)
        );
        assertThat(result).isLessThan(0);
    }

}