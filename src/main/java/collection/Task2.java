package collection;

public class Task2 {
    private String number;
    private String description;

    public Task2(String number, String description) {
        this.number = number;
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

    // Включите этот метод, если понадобится описание задачи
    public String getDescription() {
        return description;
    }
}
