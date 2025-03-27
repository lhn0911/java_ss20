package ss20.Bai10;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task {
    private int id;
    private String title;
    private User assignedTo;
    private LocalDate dueDate;
    private boolean completed;

    public Task() {
    }

    public Task(int id, String title, User assignedTo, LocalDate dueDate, boolean completed) {
        this.id = id;
        this.title = title;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(User assignedTo) {
        this.assignedTo = assignedTo;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public static void printOver(List<Task> tasks, LocalDate currentDate) {
        System.out.println("== Công việc quá hạn chưa hoàn thành ==");
        tasks.stream()
                .filter(task -> !task.isCompleted() && task.getDueDate().isBefore(currentDate))
                .forEach(task -> System.out.printf("- %s (Giao cho: %s, hạn chót: %s)%n",
                        task.getTitle(), task.getAssignedTo().getName(), task.getDueDate()));
        System.out.println();
    }

    public static void printCount(List<Task> tasks) {
        long completedCount = tasks.stream().filter(Task::isCompleted).count();
        System.out.println("Tổng số công việc đã hoàn thành: " + completedCount);
        System.out.println();
    }

    public static void printUser(List<Task> tasks) {
        System.out.println("== Thống kê công việc theo người dùng ==");
        Map<User, List<Task>> userTasks = tasks.stream().collect(Collectors.groupingBy(Task::getAssignedTo));

        userTasks.forEach((user, taskList) -> {
            long overdueTasks = taskList.stream()
                    .filter(task -> !task.isCompleted() && task.getDueDate().isBefore(LocalDate.of(2025, 3, 23)))
                    .count();
            System.out.printf("- Tên: %s | Email: %s | Tổng việc: %d | Quá hạn: %d%n",
                    user.getName(), user.getEmail().orElse("Không có email"), taskList.size(), overdueTasks);
        });
        System.out.println();
    }
}
