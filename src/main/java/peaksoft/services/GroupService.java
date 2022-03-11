package peaksoft.services;

import peaksoft.entities.Group;

import java.util.List;

public interface GroupService {
    void UpdateGroupsTable(Group group);

    void saveGroups(Group group);

    void removeGroupsById(long id);

    List<Group> getAllGroups();

    Group getById(long id);
}
