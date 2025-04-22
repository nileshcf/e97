package com.cloudframe.app.repository;

import com.cloudframe.app.db2funci.dto.*;
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
     * @parm dcltbdemsec
* @parm sqlca
     */
    public void fetchC1Db2funci(Dcltbdemsec dcltbdemsec, Sqlca sqlca) throws Exception;

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
     * @parm applicationCodeListGroup
* @parm hostVariables
* @parm dclscpsectb
* @parm sqlca
     */
    public void openPositionCursorDb2funci(ApplicationCodeListGroup applicationCodeListGroup, HostVariables hostVariables, Dclscpsectb dclscpsectb, Sqlca sqlca) throws Exception;

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
* @parm dclvmstranb
* @parm bdms01CallParameters
     */
    public void selectTmasterAdpNumber(Db2Indicators db2Indicators, Sqlca sqlca, Dclvmstranb dclvmstranb, Bdms01CallParameters bdms01CallParameters) throws Exception;

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
    public void openXrefCursorDb2funci(Dclvmsdxrfk dclvmsdxrfk, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm dclvmsdxrfk
* @parm sqlca
     */
    public void fetchXrefCursorDb2funci(Dclvmsdxrfk dclvmsdxrfk, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeXrefCursorDb2funci(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     */
    public void openIsinCursorDb2funci(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm dcltbdemsec
* @parm sqlca
     */
    public void fetchIsinCursorDb2funci(Dcltbdemsec dcltbdemsec, Sqlca sqlca) throws Exception;

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
    public void closeIsinCursorDb2funci(Sqlca sqlca) throws Exception;

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
