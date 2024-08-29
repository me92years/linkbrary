package com.example.backend.features.folder.handler;

import java.util.List;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import com.example.backend.entities.folder.Folder;
import com.example.backend.entities.folder.FolderDto;
import com.example.backend.features.folder.service.FolderService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class FolderHandler {

  private final FolderService folderService;

  @QueryMapping
  public List<FolderDto> allFolders() {
    return folderService.allFolders();
  }

  @MutationMapping
  public FolderDto addFolder(@Argument("name") String name) {
    Folder folder = Folder.from(name);
    return folderService.addFolder(folder);
  }

}
