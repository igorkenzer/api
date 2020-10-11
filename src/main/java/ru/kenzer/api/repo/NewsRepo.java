package ru.kenzer.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kenzer.api.entity.News;

public interface NewsRepo extends JpaRepository<News, Long> {

}
