package dcp.dcpChat.dao.user;


import dcp.dcpChat.dto.generated.UserInfo;
import dcp.dcpChat.dto.generated.UserInfoMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserInfoDao extends AbstractUserBaseDao<UserInfoMapper> {

    @Override
    protected Class<UserInfoMapper> getMapperClass() {
        return UserInfoMapper.class;
    }

    public UserInfo selectByPrimaryKey(int userId) {
        return getMapper().selectByPrimaryKey(userId);
    }

    public void insertByPrimaryKey(UserInfo userInfo) {
        getMapper().insert(userInfo);
    }

}
