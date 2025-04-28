package com.cloudframe.app.repository;

import com.cloudframe.app.uhdynsql.dto.*;
import java.sql.ResultSet;
import com.cloudframe.app.data.Field;


public interface UhdynsqlRepository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm wqSqlFullClause
* @parm sqlca
     */
    public void prepare(WqSqlFullClause wqSqlFullClause, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     * @return 
     */
    public ResultSet openWidgetCsrUhdynsql(Field sqlda, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm tbxmlwgt
* @parm sqlca
     */
    public void fetchWidgetCsrUhdynsql(ResultSet widgetCsrResultSet, Tbxmlwgt tbxmlwgt, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeWidgetCsrUhdynsql(ResultSet widgetCsrResultSet, Sqlca sqlca) throws Exception;

}
