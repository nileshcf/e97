package com.cloudframe.app.repository;

import com.cloudframe.app.db2funci.dto.*;
import com.cloudframe.app.data.Field;


public interface Db2funciRepository {
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
     * @parm hostVariables
* @parm applicationCodeListGroup
* @parm dclscpsectb
* @parm sqlca
     */
    public void openPositionCursorDb2funci(HostVariables hostVariables, ApplicationCodeListGroup applicationCodeListGroup, Dclscpsectb dclscpsectb, Sqlca sqlca) throws Exception;

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
* @parm bdms01CallParameters
* @parm sqlca
* @parm db2Indicators
     */
    public void selectTmasterAdpNumber(Dclvmstranb dclvmstranb, Bdms01CallParameters bdms01CallParameters, Sqlca sqlca, Db2Indicators db2Indicators) throws Exception;

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
     * @parm dclvbsscrdt
* @parm work
* @parm sqlca
* @parm db2Indicators
     */
    public void selectTbaseSecurityDat(Dclvbsscrdt dclvbsscrdt, Work work, Sqlca sqlca, Db2Indicators db2Indicators) throws Exception;

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
