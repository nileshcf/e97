package com.cloudframe.app.repository;

import com.cloudframe.app.db2prog1.dto.*;
import java.sql.ResultSet;
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
     * @return 
     */
    public ResultSet openWidgetDb2prog1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm tbwidget
* @parm sqlca
     */
    public void fetchWidgetDb2prog1(ResultSet widgetResultSet, Tbwidget tbwidget, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeWidgetDb2prog1(ResultSet widgetResultSet, Sqlca sqlca) throws Exception;

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
