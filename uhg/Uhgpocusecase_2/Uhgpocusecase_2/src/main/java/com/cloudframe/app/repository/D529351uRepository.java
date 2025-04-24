package com.cloudframe.app.repository;

import com.cloudframe.app.d529351u.dto.*;
import java.sql.ResultSet;
import com.cloudframe.app.data.Field;


public interface D529351uRepository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dclfeSpiPlnVar
* @parm workArea
* @parm sqlca
     * @return 
     */
    public ResultSet openCsplnvD529351u(DclfeSpiPlnVar dclfeSpiPlnVar, WorkArea workArea, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm hvHostVariablesCsplnv
* @parm sqlca
     */
    public void fetchCsplnvD529351u(ResultSet csplnvResultSet, HvHostVariablesCsplnv hvHostVariablesCsplnv, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsplnvD529351u(ResultSet csplnvResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm dclfeSpiRuleFrToSvc
     * @return 
     */
    public ResultSet openCsfrtoD529351u(Sqlca sqlca, DclfeSpiRuleFrToSvc dclfeSpiRuleFrToSvc) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm hvHostVariablesCsfrto
     */
    public void fetchCsfrtoD529351u(ResultSet csfrtoResultSet, Sqlca sqlca, HvHostVariablesCsfrto hvHostVariablesCsfrto) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsfrtoD529351u(ResultSet csfrtoResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dclfeSpiRuleProvTyp
* @parm sqlca
     * @return 
     */
    public ResultSet openCsptypD529351u(DclfeSpiRuleProvTyp dclfeSpiRuleProvTyp, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm dclfeSpiRuleProvTyp
* @parm sqlca
     */
    public void fetchCsptypD529351u(ResultSet csptypResultSet, DclfeSpiRuleProvTyp dclfeSpiRuleProvTyp, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsptypD529351u(ResultSet csptypResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm testVariables
* @parm sqlca
* @parm dclfeSpiRuleIcd
* @parm lstIcdKey
     * @return 
     */
    public ResultSet openCsicdD529351u(TestVariables testVariables, Sqlca sqlca, DclfeSpiRuleIcd dclfeSpiRuleIcd, LstIcdKey lstIcdKey) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm hvHostVariablesCsicdo
     */
    public void fetchCsicdD529351u(ResultSet csicdResultSet, Sqlca sqlca, HvHostVariablesCsicdo hvHostVariablesCsicdo) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsicdD529351u(ResultSet csicdResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dclfeSpiRuleFrCondPos
* @parm sqlca
     * @return 
     */
    public ResultSet openCsfcndD529351u(DclfeSpiRuleFrCondPos dclfeSpiRuleFrCondPos, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm dclfeSpiRuleFrCondPos
* @parm sqlca
     */
    public void fetchCsfcndD529351u(ResultSet csfcndResultSet, DclfeSpiRuleFrCondPos dclfeSpiRuleFrCondPos, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsfcndD529351u(ResultSet csfcndResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dclfeSpiRuleCaus
* @parm sqlca
     */
    public void selectFeSpiRuleCaus(DclfeSpiRuleCaus dclfeSpiRuleCaus, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm dclfeSpiRuleIpa
* @parm sqlca
     */
    public void selectFeSpiRuleIpa(DclfeSpiRuleIpa dclfeSpiRuleIpa, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm dclfeSpiRuleFrToSvc
     * @return 
     */
    public ResultSet openSvcMainCsrD529351u(Sqlca sqlca, DclfeSpiRuleFrToSvc dclfeSpiRuleFrToSvc) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm hvHostVariablesSvcmain
     */
    public void fetchSvcMainCsrD529351u(ResultSet svcMainCsrResultSet, Sqlca sqlca, HvHostVariablesSvcmain hvHostVariablesSvcmain) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeSvcMainCsrD529351u(ResultSet svcMainCsrResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dclfeSpiRuleProvTyp
* @parm dclfeSpiRuleFrCondPos
* @parm dclfeSpiRuleIpa
* @parm dclfeSpiRuleCpeFlg
* @parm dclfeSpiRuleCaus
* @parm testVariables
* @parm sqlca
     * @return 
     */
    public ResultSet openCombCurD529351u(DclfeSpiRuleProvTyp dclfeSpiRuleProvTyp, DclfeSpiRuleFrCondPos dclfeSpiRuleFrCondPos, DclfeSpiRuleIpa dclfeSpiRuleIpa, DclfeSpiRuleCpeFlg dclfeSpiRuleCpeFlg, DclfeSpiRuleCaus dclfeSpiRuleCaus, TestVariables testVariables, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm hvHostVariablesCombcr
* @parm sqlca
     */
    public void fetchCombCurD529351u(ResultSet combCurResultSet, HvHostVariablesCombcr hvHostVariablesCombcr, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCombCurD529351u(ResultSet combCurResultSet, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm testVariables
* @parm sqlca
* @parm dclfeSpiRuleIcd
* @parm lstIcdKey
     * @return 
     */
    public ResultSet openCsicdFirst9999SpiD529351u(TestVariables testVariables, Sqlca sqlca, DclfeSpiRuleIcd dclfeSpiRuleIcd, LstIcdKey lstIcdKey) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm sqlca
* @parm hvHostVariablesCsicdo
     */
    public void fetchCsicdFirst9999SpiD529351u(ResultSet csicdFirst9999SpiResultSet, Sqlca sqlca, HvHostVariablesCsicdo hvHostVariablesCsicdo) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsicdFirst9999SpiD529351u(ResultSet csicdFirst9999SpiResultSet, Sqlca sqlca) throws Exception;

}
