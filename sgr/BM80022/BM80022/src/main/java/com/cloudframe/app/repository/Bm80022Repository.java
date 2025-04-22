package com.cloudframe.app.repository;

import com.cloudframe.app.bm80022.dto.*;
import com.cloudframe.app.data.Field;


public interface Bm80022Repository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     */
    public void openCurGe18Bm80022(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm ge1801Array
* @parm sqlca
     */
    public void fetchCurGe18Bm80022(Ge1801Array ge1801Array, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCurGe18Bm80022(Sqlca sqlca) throws Exception;

}
