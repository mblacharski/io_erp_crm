package io.swagger.model.crm;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BaseModel;

import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * TaskNote
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-15T00:41:28.115Z")
@Entity
public class TaskNote extends BaseModel {
  @JsonProperty("id")
  @Id
  @GeneratedValue
  private Integer id;

  @JsonProperty("task")
  @NotNull
  @ManyToOne(cascade = CascadeType.PERSIST)
  @JoinColumn(name = "task_id")
  private Task task;

  @JsonProperty("content")
  @NotNull
  @Column(nullable = false, unique = false)
  private String content;

  @JsonProperty("backgroundColor")
  @NotNull
  @Column(nullable = false, unique = false)
  private String backgroundColor;

  protected TaskNote() {}

  public TaskNote(Integer id, Task task, String content, String backgroundColor) {
    this.id = id;
    this.task = task;
    this.content = content;
    this.backgroundColor = backgroundColor;
  }

  public TaskNote id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TaskNote task(Task task) {
    this.task = task;
    return this;
  }

   /**
   * Get task
   * @return task
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Task getTask() {
    return task;
  }

  public void setTask(Task task) {
    this.task = task;
  }

  public TaskNote content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public TaskNote backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

   /**
   * Get backgroundColor
   * @return backgroundColor
  **/
  @ApiModelProperty(value = "")

 @Size(min=4,max=10)
  public String getBackgroundColor() {
    return backgroundColor;
  }

  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskNote taskNote = (TaskNote) o;
    return Objects.equals(this.id, taskNote.id) &&
        Objects.equals(this.task, taskNote.task) &&
        Objects.equals(this.content, taskNote.content) &&
        Objects.equals(this.backgroundColor, taskNote.backgroundColor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, task, content, backgroundColor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskNote {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

