package com.cloudframe.app.repository;

import com.cloudframe.app.db2prog1.dto.*;
import com.cloudframe.app.data.Field;


public interface Db2prog1Repository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dclbooks
* @parm sqlca
     */
    public void selectBooks(Dclbooks dclbooks, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm tbwidget
     */
    public void insertTbwidget(Sqlca sqlca, Tbwidget tbwidget) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm tbwidget
     */
    public void updateTbwidget(Sqlca sqlca, Tbwidget tbwidget) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     */
    public void openWidgetDb2prog1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm tbwidget
     */
    public void fetchWidgetDb2prog1(Sqlca sqlca, Tbwidget tbwidget) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeWidgetDb2prog1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm tbwidget
     */
    public void deleteTbwidget(Sqlca sqlca, Tbwidget tbwidget) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm tbwidget
     */
    public void selectTbwidget(Sqlca sqlca, Tbwidget tbwidget) throws Exception;

}
