package com.cloudframe.app.repository;

import com.cloudframe.app.sup01751.dto.*;
import com.cloudframe.app.data.Field;


public interface Sup01751Repository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm work
     */
    public void selectTphyScyTran(Sqlca sqlca, Work work) throws Exception;

}
