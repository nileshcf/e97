package com.cloudframe.app.repository;

import com.cloudframe.app.db2func.dto.*;
import com.cloudframe.app.data.Field;


public interface Db2funcRepository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dateFields
     */
    public void selectTbdemsec(Sqlca sqlca, DateFields dateFields) throws Exception;

    /**
     * This method will handle the sql operations for a stored-procedure query.
     *
     * @parm parmlstGroup
* @parm sqlca
* @parm work
     */
    public void call(ParmlstGroup parmlstGroup, Sqlca sqlca, Work work) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm work
     */
    public void associate(Sqlca sqlca, Work work) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm work
     */
    public void allocate(Sqlca sqlca, Work work) throws Exception;

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
     * @parm sqlca
* @parm sdms01Parm
     */
    public void call1(Sqlca sqlca, Sdms01Parm sdms01Parm) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm applicationCodeListGroup
* @parm dclscpsectb
* @parm sqlca
* @parm hostVariables
     */
    public void openPositionCursorDb2func(ApplicationCodeListGroup applicationCodeListGroup, Dclscpsectb dclscpsectb, Sqlca sqlca, HostVariables hostVariables) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dateFields
     */
    public void selectSysdummy1(Sqlca sqlca, DateFields dateFields) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dclvmstranb
* @parm sqlca
* @parm bdms01CallParameters
* @parm db2Indicators
     */
    public void selectTmasterAdpNumber(Dclvmstranb dclvmstranb, Sqlca sqlca, Bdms01CallParameters bdms01CallParameters, Db2Indicators db2Indicators) throws Exception;

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
     */
    public void openXrefCursorDb2func(Sqlca sqlca, Dclvmsdxrfk dclvmsdxrfk) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm dclvmsdxrfk
     */
    public void fetchXrefCursorDb2func(Sqlca sqlca, Dclvmsdxrfk dclvmsdxrfk) throws Exception;

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
     * @parm dclvbsscrdt
* @parm sqlca
* @parm work
* @parm db2Indicators
     */
    public void selectTbaseSecurityDat(Dclvbsscrdt dclvbsscrdt, Sqlca sqlca, Work work, Db2Indicators db2Indicators) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm work
     */
    public void selectScholitb(Sqlca sqlca, Work work) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm work
     */
    public void selectScholitb1(Sqlca sqlca, Work work) throws Exception;

}
