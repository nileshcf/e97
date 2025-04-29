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
     * @parm hvErec
* @parm sqlca
* @parm ibook
     */
    public void fetchCcurCobpgmor(HvErec hvErec, Sqlca sqlca, Ibook ibook) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm work
     */
    public void selectTbjemp(Sqlca sqlca, Work work) throws Exception;

}
