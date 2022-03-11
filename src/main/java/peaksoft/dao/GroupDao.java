package peaksoft.dao;



import peaksoft.entities.Group;

import java.util.List;

public interface GroupDao {

    void UpdateGroupsTable(Group group);

    void saveGroups(Group group);

    void removeGroupsById(long id);

    List<Group> getAllGroups();
    Group getById(long id);
}
