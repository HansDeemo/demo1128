package com.yj.demo1128.vo;


public class Hotevents {

  private Integer id;
  private String keyWord;
  private String hotContent;
  private Integer serchSum;
  private String createDate;

  public Hotevents(Integer id, String keyWord, String hotContent, Integer serchSum, String createDate) {
    this.id = id;
    this.keyWord = keyWord;
    this.hotContent = hotContent;
    this.serchSum = serchSum;
    this.createDate = createDate;
  }

  public Hotevents() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getKeyWord() {
    return keyWord;
  }

  public void setKeyWord(String keyWord) {
    this.keyWord = keyWord;
  }

  public String getHotContent() {
    return hotContent;
  }

  public void setHotContent(String hotContent) {
    this.hotContent = hotContent;
  }

  public Integer getSerchSum() {
    return serchSum;
  }

  public void setSerchSum(Integer serchSum) {
    this.serchSum = serchSum;
  }

  public String getCreateDate() {
    return createDate;
  }

  public void setCreateDate(String createDate) {
    this.createDate = createDate;
  }
}
