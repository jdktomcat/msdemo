package com.xdd.mdemo.pack.blog.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by angelo.tang on 2017-3-24.
 */
public class GenericTypeHandler<E extends Serializable> extends BaseTypeHandler<E> {

    private Class<E> type;

    public GenericTypeHandler(Class<E> type) {
        this.type = type;
    }

    public void setNonNullParameter(PreparedStatement ps, int i, E parameter, JdbcType jdbcType) throws SQLException {
        ps.setObject(i,parameter);
    }

    public E getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return (E)rs.getObject(columnName);
    }

    public E getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return (E)rs.getObject(columnIndex);
    }

    public E getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return (E)cs.getObject(columnIndex);
    }
}
