package com.example.backend.features.folder;

import java.util.List;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import com.example.backend.entities.folder.Folder;
import com.example.backend.entities.folder.FolderDto;
import com.example.backend.shared.lib.MessageResponse;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class FolderApi {

  private final FolderService folderService;

  @QueryMapping
  public List<FolderDto> allFolders() {
    return folderService.allFolders();
  }

  @QueryMapping
  public FolderDto getFolder(@Argument("id") String id) {
    return folderService.getFolder(Long.parseLong(id));
  }
  
  @MutationMapping
  public FolderDto addFolder(@Argument("name") String name) {
    Folder folder = Folder.from(name);
    return folderService.addFolder(folder);
  }
  
  @MutationMapping
  public FolderDto modFolder(@Argument("id") Long id, @Argument("name") String name) {
    return folderService.modFolder(id, name);
  }

  @MutationMapping
  public MessageResponse delFolder(@Argument("id") Long id) {
    folderService.delFolder(id);
    return new MessageResponse("폴더가 삭제되었습니다.");
  }

}
