package com.cloudframe.app.repository;

import com.cloudframe.app.db2set3.dto.*;
import com.cloudframe.app.data.Field;


public interface Db2set3Repository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm vars
     */
    public void select(Sqlca sqlca, Vars vars) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm vars
     */
    public void select1(Sqlca sqlca, Vars vars) throws Exception;

}
