package com.cloudframe.app.repository;

import com.cloudframe.app.db2func.dto.*;
import com.cloudframe.app.data.Field;


public interface Db2funcRepository {
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
     * @parm parmlstGroup
* @parm work
* @parm sqlca
     */
    public void call(ParmlstGroup parmlstGroup, Work work, Sqlca sqlca) throws Exception;

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
     * @parm dcltbdemsec
* @parm sqlca
     */
    public void fetchC1Db2func(Dcltbdemsec dcltbdemsec, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a stored-procedure query.
     *
     * @parm sdms01Parm
* @parm sqlca
     */
    public void call1(Sdms01Parm sdms01Parm, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dclscpsectb
* @parm hostVariables
* @parm sqlca
* @parm applicationCodeListGroup
     */
    public void openPositionCursorDb2func(Dclscpsectb dclscpsectb, HostVariables hostVariables, Sqlca sqlca, ApplicationCodeListGroup applicationCodeListGroup) throws Exception;

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
     * @parm dclvmstranb
* @parm db2Indicators
* @parm sqlca
* @parm bdms01CallParameters
     */
    public void selectTmasterAdpNumber(Dclvmstranb dclvmstranb, Db2Indicators db2Indicators, Sqlca sqlca, Bdms01CallParameters bdms01CallParameters) throws Exception;

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
     * @parm dclvmsdxrfk
* @parm sqlca
     */
    public void openXrefCursorDb2func(Dclvmsdxrfk dclvmsdxrfk, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm dclvmsdxrfk
* @parm sqlca
     */
    public void fetchXrefCursorDb2func(Dclvmsdxrfk dclvmsdxrfk, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeXrefCursorDb2func(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     */
    public void openIsinCursorDb2func(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm dcltbdemsec
* @parm sqlca
     */
    public void fetchIsinCursorDb2func(Dcltbdemsec dcltbdemsec, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dcltbdemsec
* @parm sqlca
     */
    public void updateTbdemsec(Dcltbdemsec dcltbdemsec, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dcltbdemsec
* @parm sqlca
     */
    public void updateTbdemsec1(Dcltbdemsec dcltbdemsec, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dcltbdemsec
* @parm sqlca
     */
    public void selectTbdemsec1(Dcltbdemsec dcltbdemsec, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeIsinCursorDb2func(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm work
* @parm dclvbsscrdt
* @parm db2Indicators
* @parm sqlca
     */
    public void selectTbaseSecurityDat(Work work, Dclvbsscrdt dclvbsscrdt, Db2Indicators db2Indicators, Sqlca sqlca) throws Exception;

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
