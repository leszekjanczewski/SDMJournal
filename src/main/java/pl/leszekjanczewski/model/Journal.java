package pl.leszekjanczewski.model;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "journals")
public class Journal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "journal_id")
    private Long journalId;

    @Column
    private String content;

    @Column(name = "create_time")
    private Date created;

    @Column(name = "update_time")
    private Date updated;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @PrePersist
    public void setCreateTime() {
        this.created = new Date();
    }

    @PreUpdate
    public void setUpdateTime() {
        this.updated = new Date();
    }

    public Long getJournalId() {
        return journalId;
    }

    public void setJournalId(Long journalId) {
        this.journalId = journalId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
