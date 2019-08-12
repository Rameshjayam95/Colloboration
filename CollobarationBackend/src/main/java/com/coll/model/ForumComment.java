package com.coll.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class ForumComment {

@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="Forumcomid")
@SequenceGenerator(name="Forumcomid",allocationSize=1,sequenceName="Forumcomid_seq")
private int commentId;
public int getCommentId() {
	return commentId;
}
public void setCommentId(int commentId) {
	this.commentId = commentId;
}
public int getForumId() {
	return forumId;
}
public void setForumId(int forumId) {
	this.forumId = forumId;
}
public String getForumComment() {
	return forumComment;
}
public void setForumComment(String forumComment) {
	this.forumComment = forumComment;
}
public Date getCommentDate() {
	return commentDate;
}
public void setCommentDate(Date commentDate) {
	this.commentDate = commentDate;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
private int forumId;
private String forumComment;
@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="dd-MM-yyyy")
private Date commentDate;
private String username;
}