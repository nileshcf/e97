package com.cloudframe.app.repository;

import com.cloudframe.app.db2funci.dto.*;
import java.sql.ResultSet;
import com.cloudframe.app.data.Field;


public interface Db2funciRepository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dateFields
* @parm sqlca
     */
    public void selectTbdemsec(DateFields dateFields, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a stored-procedure query.
     *
     * @parm work
* @parm parmlstGroup
* @parm sqlca
     */
    public void call(Work work, ParmlstGroup parmlstGroup, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm work
* @parm sqlca
     */
    public void associate(Work work, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm work
* @parm sqlca
     */
    public void allocate(Work work, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm dcltbdemsec
     */
    public void fetchC1Db2funci(ResultSet c1ResultSet, Sqlca sqlca, Dcltbdemsec dcltbdemsec) throws Exception;

    /**
     * This method will handle the sql operations for a stored-procedure query.
     *
     * @parm sqlca
* @parm sdms01Parm
     */
    public void call1(Sqlca sqlca, Sdms01Parm sdms01Parm) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm hostVariables
* @parm sqlca
* @parm dclscpsectb
* @parm applicationCodeListGroup
     * @return 
     */
    public ResultSet openPositionCursorDb2funci(HostVariables hostVariables, Sqlca sqlca, Dclscpsectb dclscpsectb, ApplicationCodeListGroup applicationCodeListGroup) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dateFields
* @parm sqlca
     */
    public void selectSysdummy1(DateFields dateFields, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm db2Indicators
* @parm sqlca
* @parm bdms01CallParameters
* @parm dclvmstranb
     */
    public void selectTmasterAdpNumber(Db2Indicators db2Indicators, Sqlca sqlca, Bdms01CallParameters bdms01CallParameters, Dclvmstranb dclvmstranb) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dclvcrrexrt
* @parm sqlca
     */
    public void selectTcrrncyExchRate(Dclvcrrexrt dclvcrrexrt, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm dclvmsdxrfk
     * @return 
     */
    public ResultSet openXrefCursorDb2funci(Sqlca sqlca, Dclvmsdxrfk dclvmsdxrfk) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm dclvmsdxrfk
     */
    public void fetchXrefCursorDb2funci(ResultSet xrefCursorResultSet, Sqlca sqlca, Dclvmsdxrfk dclvmsdxrfk) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeXrefCursorDb2funci(ResultSet xrefCursorResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     * @return 
     */
    public ResultSet openIsinCursorDb2funci(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm dcltbdemsec
     */
    public void fetchIsinCursorDb2funci(ResultSet isinCursorResultSet, Sqlca sqlca, Dcltbdemsec dcltbdemsec) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dcltbdemsec
     */
    public void updateTbdemsec(Sqlca sqlca, Dcltbdemsec dcltbdemsec) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dcltbdemsec
     */
    public void updateTbdemsec1(Sqlca sqlca, Dcltbdemsec dcltbdemsec) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dcltbdemsec
     */
    public void selectTbdemsec1(Sqlca sqlca, Dcltbdemsec dcltbdemsec) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeIsinCursorDb2funci(ResultSet isinCursorResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm db2Indicators
* @parm work
* @parm dclvbsscrdt
* @parm sqlca
     */
    public void selectTbaseSecurityDat(Db2Indicators db2Indicators, Work work, Dclvbsscrdt dclvbsscrdt, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm work
* @parm sqlca
     */
    public void selectScholitb(Work work, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm work
* @parm sqlca
     */
    public void selectScholitb1(Work work, Sqlca sqlca) throws Exception;

}
