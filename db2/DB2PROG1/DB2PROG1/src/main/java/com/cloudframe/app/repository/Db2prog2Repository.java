package com.cloudframe.app.repository;

import com.cloudframe.app.db2prog2.dto.*;
import com.cloudframe.app.data.Field;


public interface Db2prog2Repository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dclbooks
     */
    public void selectBooks(Sqlca sqlca, Dclbooks dclbooks) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm tbwidget
* @parm sqlca
     */
    public void insertTbwidget(Tbwidget tbwidget, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm tbwidget
* @parm sqlca
     */
    public void updateTbwidget(Tbwidget tbwidget, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     */
    public void openWidgetDb2prog2(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm tbwidget
* @parm sqlca
     */
    public void fetchWidgetDb2prog2(Tbwidget tbwidget, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeWidgetDb2prog2(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm tbwidget
* @parm sqlca
     */
    public void deleteTbwidget(Tbwidget tbwidget, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm tbwidget
* @parm sqlca
     */
    public void selectTbwidget(Tbwidget tbwidget, Sqlca sqlca) throws Exception;

}
