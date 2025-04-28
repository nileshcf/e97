package com.cloudframe.app.repository;

import com.cloudframe.app.db2set3.dto.*;
import com.cloudframe.app.data.Field;


public interface Db2set3Repository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm vars
* @parm sqlca
     */
    public void select(Vars vars, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm vars
* @parm sqlca
     */
    public void select1(Vars vars, Sqlca sqlca) throws Exception;

}
