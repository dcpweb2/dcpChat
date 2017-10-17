package dcp.dcpChat.dao;


abstract public class AbstractBaseDao<T> {
    /**
     * MapperClass 取得
     *
     * @return MapperClass
     */
    abstract protected Class<T> getMapperClass();

    /**
     * Mapper 取得
     *
     * @return Mapper
     */
    abstract protected T getMapper();
}
