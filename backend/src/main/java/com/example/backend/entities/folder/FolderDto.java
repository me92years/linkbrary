package com.example.backend.entities.folder;

import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class FolderDto {
  private Long id;
  private String name;
  private Integer linkCount;
  private LocalDateTime createdAt;
  private LocalDateTime modifiedAt;

  public static FolderDto from(Folder entity) {
    return FolderDto.builder().id(entity.getId())
        .name(entity.getName())
        .linkCount(entity.getLinkCount())
        .createdAt(entity.getCreatedAt())
        .modifiedAt(entity.getModifiedAt())
        .build();
  }

}
