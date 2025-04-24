package com.cloudframe.app.repository;

import com.cloudframe.app.db2prog2.dto.*;
import java.sql.ResultSet;
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
     * @return 
     */
    public ResultSet openWidgetDb2prog2(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm tbwidget
     */
    public void fetchWidgetDb2prog2(ResultSet widgetResultSet, Sqlca sqlca, Tbwidget tbwidget) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeWidgetDb2prog2(ResultSet widgetResultSet, Sqlca sqlca) throws Exception;

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
