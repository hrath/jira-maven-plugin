package com.atlassian.jira.rest;

import java.util.Map;

import javax.xml.bind.annotation.XmlElement;

public class Assignee {
    
    @XmlElement
    private String self;

    @XmlElement
    private String id;

    @XmlElement
    private String description;
    
    @XmlElement
    private Lead lead;
    
    @XmlElement
    private Map avatarUrls;
    
    @XmlElement
    private String displayName;
    
    @XmlElement
    private String active;

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Lead getLead() {
        return lead;
    }

    public void setLead(Lead lead) {
        this.lead = lead;
    }

    public Map getAvatarUrls() {
        return avatarUrls;
    }

    public void setAvatarUrls(Map avatarUrls) {
        this.avatarUrls = avatarUrls;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Assignee [self=" + self + ", id=" + id + ", description=" + description + ", lead=" + lead
                + ", avatarUrls=" + avatarUrls + ", displayName=" + displayName + ", active=" + active + "]";
    }

}
