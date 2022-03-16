package com.todo.todo.entity;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="todo")
public class ToDo
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "description")
    private String description;

    @Column(name = "is_done")
    private boolean isDone;

    @Column(name = "target_date")
    private Date targetDate;

    public ToDo(int id, String description, boolean isDone, Date targetDate) {
        this.id = id;
        this.description = description;
        this.isDone = isDone;
        this.targetDate = targetDate;
    }

    public ToDo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", isDone=" + isDone +
                ", targetDate=" + targetDate +
                '}';
    }
}
