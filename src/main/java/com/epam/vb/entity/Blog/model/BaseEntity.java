package com.epam.vb.entity.Blog.model;

import java.util.UUID;

public abstract class BaseEntity {
    final UUID uuid;
    Long id;
    boolean deleted;

    public BaseEntity() {
        uuid = UUID.randomUUID();
    }
    public BaseEntity(UUID uuid) {this.uuid = uuid;}

    @Override
    public boolean equals(Object obj) {
        if ( this == obj) return true;
        if (!(obj instanceof BaseEntity)) return false;
        BaseEntity that = (BaseEntity) obj;
        return uuid.equals(that.uuid);
    }

    @Override
    public int hashCode() {
        return uuid.hashCode();
    }

    public UUID getUuid() {
        return uuid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
