package com.cloudframe.app.repository;

import com.cloudframe.app.db2hst1.dto.*;
import com.cloudframe.app.data.Field;


public interface Db2hst1Repository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dcltemp06
* @parm work
     */
    public void selectTemp06(Sqlca sqlca, Dcltemp06 dcltemp06, Work work) throws Exception;

}
