package com.cloudframe.app.repository;

import com.cloudframe.app.uhdynsql.dto.*;
import com.cloudframe.app.data.Field;


public interface UhdynsqlRepository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm wqSqlFullClause
     */
    public void prepare(Sqlca sqlca, WqSqlFullClause wqSqlFullClause) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     */
    public void openWidgetCsrUhdynsql(Field sqlda, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm tbxmlwgt
* @parm sqlca
     */
    public void fetchWidgetCsrUhdynsql(Tbxmlwgt tbxmlwgt, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeWidgetCsrUhdynsql(Sqlca sqlca) throws Exception;

}
