package com.example.backend.features.folder.service;

import java.util.List;
import com.example.backend.entities.folder.Folder;
import com.example.backend.entities.folder.FolderDto;

public interface FolderService {

  FolderDto addFolder(Folder folder);

  List<FolderDto> allFolders();

}
