package com.cloudframe.app.repository;

import com.cloudframe.app.vsamdb2.dto.*;
import com.cloudframe.app.data.Field;


public interface Vsamdb2Repository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm tbxmlwgt
     */
    public void selectTbwidget(Sqlca sqlca, Tbxmlwgt tbxmlwgt) throws Exception;

}
