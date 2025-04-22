package com.cloudframe.app.repository;

import com.cloudframe.app.db2hst1.dto.*;
import com.cloudframe.app.data.Field;


public interface Db2hst1Repository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm work
* @parm sqlca
* @parm dcltemp06
     */
    public void selectTemp06(Work work, Sqlca sqlca, Dcltemp06 dcltemp06) throws Exception;

}
