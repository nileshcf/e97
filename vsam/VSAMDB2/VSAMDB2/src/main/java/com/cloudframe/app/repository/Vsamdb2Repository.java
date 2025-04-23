package com.cloudframe.app.repository;

import com.cloudframe.app.vsamdb2.dto.*;
import com.cloudframe.app.data.Field;


public interface Vsamdb2Repository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm tbxmlwgt
* @parm sqlca
     */
    public void selectTbwidget(Tbxmlwgt tbxmlwgt, Sqlca sqlca) throws Exception;

}
