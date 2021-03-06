package io.swagger.model.crm;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by gros on 01.12.17.
 */
public interface MeetingRepository extends CrudRepository<Meeting, Integer> {
    public Meeting findById(Integer id);
}