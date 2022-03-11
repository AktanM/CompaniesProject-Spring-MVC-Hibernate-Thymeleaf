package peaksoft.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.dao.GroupDao;
import peaksoft.entities.Group;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupDao groupDao;

    @Override
    public void UpdateGroupsTable(Group group) {
        groupDao.UpdateGroupsTable(group);
    }

    @Override
    public void saveGroups(Group group) {
        groupDao.saveGroups(group);
    }

    @Override
    public void removeGroupsById(long id) {
        groupDao.removeGroupsById(id);
    }

    @Override
    public List<Group> getAllGroups() {
        return groupDao.getAllGroups();
    }

    @Override
    public Group getById(long id) {
        return groupDao.getById(id);
    }
}