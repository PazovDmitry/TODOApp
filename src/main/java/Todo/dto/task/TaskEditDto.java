package Todo.dto.task;

import Todo.enums.Priority;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class TaskEditDto {

    private final String name;

    private final Priority priority;

    private final String text;

    public TaskEditDto(@JsonProperty("name") String name,
                       @JsonProperty("priority") Priority priority,
                       @JsonProperty("text") String text) {
        this.name = name;
        this.priority = priority;
        this.text = text;
    }
}