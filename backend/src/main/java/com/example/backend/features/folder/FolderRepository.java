package com.example.backend.features.folder;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.backend.entities.folder.Folder;

public interface FolderRepository extends JpaRepository<Folder, Long> {

}
