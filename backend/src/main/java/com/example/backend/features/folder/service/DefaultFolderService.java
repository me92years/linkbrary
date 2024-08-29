package com.example.backend.features.folder.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.backend.entities.folder.Folder;
import com.example.backend.entities.folder.FolderDto;
import com.example.backend.features.folder.repository.FolderRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DefaultFolderService implements FolderService {

  private final FolderRepository folderRepository;

  @Override
  public FolderDto addFolder(Folder folder) {
    Folder saved = folderRepository.save(folder);
    return FolderDto.from(saved);
  }

  @Override
  public List<FolderDto> allFolders() {
    List<FolderDto> folderDtos = folderRepository.findAll()
        .stream()
        .map(entity -> FolderDto.from(entity)).toList();
    
    return folderDtos;
  }

}
