package com.cxytiandi.elasticsearch.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "cxytiandi", type = "article")
public class Article {
	@Id    
    @Field(type = FieldType.Integer, index = FieldIndex.not_analyzed, store = true)    
	private Integer id;
	
	@Field(type = FieldType.String, index = FieldIndex.not_analyzed, store = true)   
	private String sid;
	
	@Field(type = FieldType.String, index = FieldIndex.analyzed, store = true, analyzer = "ik_max_word", searchAnalyzer = "ik_max_word") 
	private String title;
	
	@Field(type = FieldType.String, index = FieldIndex.not_analyzed, store = true) 
	private String url;
	
	@Field(type = FieldType.String, index = FieldIndex.not_analyzed, store = true) 
	private String content;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
