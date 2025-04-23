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
     * @parm sqlca
* @parm ibook
* @parm hvErec
     */
    public void fetchCcurCobpgmor(Sqlca sqlca, Ibook ibook, HvErec hvErec) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm work
     */
    public void selectTbjemp(Sqlca sqlca, Work work) throws Exception;

}
