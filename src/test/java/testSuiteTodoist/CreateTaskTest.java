package testSuiteTodoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.todoist.TaskListSection;

import java.util.Date;

public class CreateTaskTest extends BaseTestTodoist {

    TaskListSection taskListSection = new TaskListSection();
    @Test
    public void createTaskSuccessfully() {
        String taskName = "Task " + new Date().getTime();

        mainPageTodoist.loginButton.click();
        loginPageTodoist.login("apazahuaychohugoalejandro@gmail.com", "Holasoyyo2002");

        menuSectionTodoist.addTaskButton.click();
        addTaskSection.addTask(taskName);

        Assertions.assertTrue(taskListSection.isTaskDisplayed(taskName), "ERROR: La tarea no se creó correctamente.");
    }
}
