package com.cloudframe.app.repository;

import com.cloudframe.app.cfbooks.dto.*;
import com.cloudframe.app.data.Field;


public interface CfbooksRepository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     */
    public void openBookscurCfbooks(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeBookscurCfbooks(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm dclbooks
* @parm nullvars
* @parm sqlca
     */
    public void fetchBookscurCfbooks(Dclbooks dclbooks, Nullvars nullvars, Sqlca sqlca) throws Exception;

}
