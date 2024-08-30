package com.example.backend.features.folder;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.backend.entities.folder.Folder;
import com.example.backend.entities.folder.FolderDto;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DefaultFolderService implements FolderService {

  private final FolderRepository folderRepository;

  @Override
  public FolderDto addFolder(Folder folder) {
    return FolderDto.from(folderRepository.save(folder));
  }

  @Override
  public List<FolderDto> allFolders() {
    List<FolderDto> folderDtos =
        folderRepository.findAll().stream().map(entity -> FolderDto.from(entity)).toList();
    return folderDtos;
  }

  @Override
  public FolderDto getFolder(Long id) {
    return FolderDto.from(folderRepository.findById(id).get());
  }

  @Override
  public void delFolder(Long id) {
    folderRepository.deleteById(id);
  }

  @Override
  @Transactional
  public FolderDto modFolder(Long id, String name) {
    Folder saved = folderRepository.findById(id).get();
    Folder modified = saved.modName(name);
    return FolderDto.from(folderRepository.save(modified));
  }

}
