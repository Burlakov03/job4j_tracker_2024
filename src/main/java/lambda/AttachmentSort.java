package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );
        Comparator comparator = (o1, o2) -> {
            Attachment left = (Attachment) o1;
            Attachment right = (Attachment) o2;
            return Integer.compare(left.getSize(), right.getSize());
        };
        Comparator<Attachment> comparatorAscName = Comparator.comparing(Attachment::getName);
        Comparator<Attachment> comparatorDescName = (left, right) -> {
            return right.getName().compareTo(left.getName());
        };
        attachments.sort(comparator);
        System.out.println(attachments);
    }
}
