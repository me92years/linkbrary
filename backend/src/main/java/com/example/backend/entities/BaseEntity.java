package com.example.backend.entities;

import java.time.LocalDateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

@MappedSuperclass
@Getter
@EntityListeners(value = { AuditingEntityListener.class })
public class BaseEntity {
  
  @CreatedDate
  @Column(insertable = true, updatable = false)
  private LocalDateTime createdAt;
  
  @LastModifiedDate
  @Column(name="last_modified_at", insertable = false, updatable = true)
  private LocalDateTime modifiedAt;
  
}
