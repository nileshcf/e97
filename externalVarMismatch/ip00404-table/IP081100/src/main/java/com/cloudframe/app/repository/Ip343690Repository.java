package com.cloudframe.app.repository;

import com.cloudframe.app.ip343690.dto.*;
import com.cloudframe.app.data.Field;


public interface Ip343690Repository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm tipapma
* @parm sqlca
     */
    public void openPmaCursorIp343690(Tipapma tipapma, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm tipapma
* @parm sqlca
     */
    public void fetchPmaCursorIp343690(Tipapma tipapma, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closePmaCursorIp343690(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a execute query.
     *
     * @parm tipapma
* @parm itipapma
* @parm sqlca
     */
    public void updateTipapma1(Tipapma tipapma, Itipapma itipapma, Sqlca sqlca) throws Exception;

}
