package dcp.dcpChat.dao.user;

import dcp.dcpChat.dao.AbstractBaseDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


abstract class AbstractUserBaseDao<T> extends AbstractBaseDao<T> {
    @Autowired
    @Qualifier("userSqlSessionTemplate")
    private SqlSessionTemplate userSqlSessionTemplate;

    @Override
    protected T getMapper() {
        return userSqlSessionTemplate.getMapper(getMapperClass());
    }
}