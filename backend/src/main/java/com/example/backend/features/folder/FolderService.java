package com.example.backend.features.folder;

import java.util.List;
import com.example.backend.entities.folder.Folder;
import com.example.backend.entities.folder.FolderDto;

public interface FolderService {

  FolderDto addFolder(Folder folder);

  List<FolderDto> allFolders();

  FolderDto getFolder(Long id);

  void delFolder(Long id);

  FolderDto modFolder(Long id, String name);

}
