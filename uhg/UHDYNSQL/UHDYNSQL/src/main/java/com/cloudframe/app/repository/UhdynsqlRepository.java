package com.cloudframe.app.repository;

import com.cloudframe.app.uhdynsql.dto.*;
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
     */
    public void openWidgetCsrUhdynsql(Field sqlda, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm tbxmlwgt
     */
    public void fetchWidgetCsrUhdynsql(Sqlca sqlca, Tbxmlwgt tbxmlwgt) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeWidgetCsrUhdynsql(Sqlca sqlca) throws Exception;

}
