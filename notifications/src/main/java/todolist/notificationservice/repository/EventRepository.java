package todolist.notificationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import todolist.notificationservice.model.EventModel;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<EventModel, Long>  {
    List<EventModel> findByaction(String action);
}
