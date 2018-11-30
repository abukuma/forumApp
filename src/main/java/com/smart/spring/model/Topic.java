package com.smart.spring.model;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author: Stupid Boy
 * @Date: 2018/11/30 11:31
 * @Version 1.0
 * @Description:主题PO类
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Table(name = "t_topic")
public class Topic extends BaseDomain {
    /**
     * 精华主题帖子，系统常量使用static final定义
     */
    public static final int DIGEST_TOPIC = 1;
    /**
     * 普通的主题帖子
     */
    public static final int NOT_DIGEST_TOPIC = 0;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "topic_id")
    private int topicId;

    @Column(name = "board_id")
    //private Board board;
    //啥时候使用成员类？
    private int boardID;

    //建立主题和帖子之间的关系，为啥不是Set
    @Transient
    private MainPost mainPost = new MainPost();

    @Column(name = "topic_title")
    private String topicTitle;

    @Column(name = "user_id")
    private User user;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "last_post")
    private Date lastPost;

    @Column(name = "topic_views")
    private int topicViews;

    @Column(name = "topic_replies")
    private int topicReplies;

    @Column(name = "digest")
    private int digest = NOT_DIGEST_TOPIC;

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }


    public String getTopicTitle() {
        return topicTitle;
    }

    public void setTopicTitle(String topicTitle) {
        this.topicTitle = topicTitle;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastPost() {
        return lastPost;
    }

    public void setLastPost(Date lastPost) {
        this.lastPost = lastPost;
    }

    public int getTopicViews() {
        return topicViews;
    }

    public void setTopicViews(int topicViews) {
        this.topicViews = topicViews;
    }

    public int getTopicReplies() {
        return topicReplies;
    }

    public void setTopicReplies(int topicReplies) {
        this.topicReplies = topicReplies;
    }

    public int getDigest() {
        return digest;
    }

    public void setDigest(int digest) {
        this.digest = digest;
    }

    public int getBoardID() {
        return boardID;
    }

    public void setBoardID(int boardID) {
        this.boardID = boardID;
    }

    public MainPost getMainPost() {
        return mainPost;
    }

    public void setMainPost(MainPost mainPost) {
        this.mainPost = mainPost;
    }
}
