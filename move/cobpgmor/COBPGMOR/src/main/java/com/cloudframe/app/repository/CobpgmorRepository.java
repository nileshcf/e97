package com.cloudframe.app.repository;

import com.cloudframe.app.cobpgmor.dto.*;
import java.sql.ResultSet;
import com.cloudframe.app.data.Field;


public interface CobpgmorRepository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     * @return 
     */
    public ResultSet openCcurCobpgmor(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCcurCobpgmor(ResultSet ccurResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm hvErec
* @parm ibook
     */
    public void fetchCcurCobpgmor(ResultSet ccurResultSet, Sqlca sqlca, HvErec hvErec, Ibook ibook) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm work
     */
    public void selectTbjemp(Sqlca sqlca, Work work) throws Exception;

}
