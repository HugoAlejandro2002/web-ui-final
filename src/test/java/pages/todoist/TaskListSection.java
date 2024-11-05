package pages.todoist;

import controls.Label;
import org.openqa.selenium.By;

public class TaskListSection {
    public Label getTaskByName(String taskName) {
        return new Label(By.xpath("//div[@class='task_content' and text()='" + taskName + "']"));
    }

    public boolean isTaskDisplayed(String taskName) {
        return getTaskByName(taskName).isControlDislayed();
    }
}
