package com.cloudframe.app.repository;

import com.cloudframe.app.cobpgmor.dto.*;
import com.cloudframe.app.data.Field;


public interface CobpgmorRepository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     */
    public void openCcurCobpgmor(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCcurCobpgmor(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm ibook
* @parm sqlca
* @parm hvErec
     */
    public void fetchCcurCobpgmor(Ibook ibook, Sqlca sqlca, HvErec hvErec) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm work
* @parm sqlca
     */
    public void selectTbjemp(Work work, Sqlca sqlca) throws Exception;

}
