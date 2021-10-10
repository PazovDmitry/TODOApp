package TODOApp.entity;

import TODOApp.dto.Priority;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Getter
@Setter
public class Task {

    @Id
    @SequenceGenerator(name = "task_id_seq_generator",
            sequenceName = "task_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "task_id_seq_generator")
    private Integer id;

    private String title;

    private String text;

    @Enumerated(EnumType.STRING)
    private Priority priority;

    @UpdateTimestamp
    private Instant createdAt;

    @UpdateTimestamp
    private Instant updatedAt;

    private Integer creatorId;

    public Task() {
    }

    public Task(String title, String text, Priority priority, Integer creatorId) {
        this.title = title;
        this.text = text;
        this.priority = priority;
        this.creatorId = creatorId;
    }
}