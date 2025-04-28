package com.cloudframe.app.repository;

import com.cloudframe.app.db2hst1.dto.*;
import com.cloudframe.app.data.Field;


public interface Db2hst1Repository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dcltemp06
* @parm sqlca
* @parm work
     */
    public void selectTemp06(Dcltemp06 dcltemp06, Sqlca sqlca, Work work) throws Exception;

}
