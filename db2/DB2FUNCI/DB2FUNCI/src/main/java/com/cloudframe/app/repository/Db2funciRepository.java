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
     * @parm sqlca
* @parm work
* @parm parmlstGroup
     */
    public void call(Sqlca sqlca, Work work, ParmlstGroup parmlstGroup) throws Exception;

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
     * @parm sqlca
* @parm dcltbdemsec
     */
    public void fetchC1Db2funci(Sqlca sqlca, Dcltbdemsec dcltbdemsec) throws Exception;

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
* @parm sqlca
* @parm dclscpsectb
     */
    public void openPositionCursorDb2funci(ApplicationCodeListGroup applicationCodeListGroup, HostVariables hostVariables, Sqlca sqlca, Dclscpsectb dclscpsectb) throws Exception;

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
* @parm sqlca
* @parm db2Indicators
* @parm bdms01CallParameters
     */
    public void selectTmasterAdpNumber(Dclvmstranb dclvmstranb, Sqlca sqlca, Db2Indicators db2Indicators, Bdms01CallParameters bdms01CallParameters) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dclvcrrexrt
     */
    public void selectTcrrncyExchRate(Sqlca sqlca, Dclvcrrexrt dclvcrrexrt) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm dclvmsdxrfk
     */
    public void openXrefCursorDb2funci(Sqlca sqlca, Dclvmsdxrfk dclvmsdxrfk) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm dclvmsdxrfk
     */
    public void fetchXrefCursorDb2funci(Sqlca sqlca, Dclvmsdxrfk dclvmsdxrfk) throws Exception;

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
     * @parm sqlca
* @parm dcltbdemsec
     */
    public void fetchIsinCursorDb2funci(Sqlca sqlca, Dcltbdemsec dcltbdemsec) throws Exception;

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
    public void closeIsinCursorDb2funci(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm db2Indicators
* @parm dclvbsscrdt
* @parm work
     */
    public void selectTbaseSecurityDat(Sqlca sqlca, Db2Indicators db2Indicators, Dclvbsscrdt dclvbsscrdt, Work work) throws Exception;

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
