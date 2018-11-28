package com.yj.demo1128.vo;


public class Comments {

  private Integer id;
  private Integer hotEventsId;
  private String commentDate;
  private String content;

  public Comments() {
  }

  public Comments(Integer id, Integer hotEventsId, String commentDate, String content) {
    this.id = id;
    this.hotEventsId = hotEventsId;
    this.commentDate = commentDate;
    this.content = content;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getHotEventsId() {
    return hotEventsId;
  }

  public void setHotEventsId(Integer hotEventsId) {
    this.hotEventsId = hotEventsId;
  }

  public String getCommentDate() {
    return commentDate;
  }

  public void setCommentDate(String commentDate) {
    this.commentDate = commentDate;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
