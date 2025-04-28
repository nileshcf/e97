package com.cloudframe.app.repository;

import com.cloudframe.app.d529351u.dto.*;
import com.cloudframe.app.data.Field;


public interface D529351uRepository {
    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dclfeSpiPlnVar
* @parm workArea
* @parm sqlca
     */
    public void openCsplnvD529351u(DclfeSpiPlnVar dclfeSpiPlnVar, WorkArea workArea, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm hvHostVariablesCsplnv
* @parm sqlca
     */
    public void fetchCsplnvD529351u(HvHostVariablesCsplnv hvHostVariablesCsplnv, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsplnvD529351u(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dclfeSpiRuleFrToSvc
* @parm sqlca
     */
    public void openCsfrtoD529351u(DclfeSpiRuleFrToSvc dclfeSpiRuleFrToSvc, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm hvHostVariablesCsfrto
* @parm sqlca
     */
    public void fetchCsfrtoD529351u(HvHostVariablesCsfrto hvHostVariablesCsfrto, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsfrtoD529351u(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dclfeSpiRuleProvTyp
* @parm sqlca
     */
    public void openCsptypD529351u(DclfeSpiRuleProvTyp dclfeSpiRuleProvTyp, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm dclfeSpiRuleProvTyp
* @parm sqlca
     */
    public void fetchCsptypD529351u(DclfeSpiRuleProvTyp dclfeSpiRuleProvTyp, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsptypD529351u(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dclfeSpiRuleIcd
* @parm lstIcdKey
* @parm sqlca
* @parm testVariables
     */
    public void openCsicdD529351u(DclfeSpiRuleIcd dclfeSpiRuleIcd, LstIcdKey lstIcdKey, Sqlca sqlca, TestVariables testVariables) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm hvHostVariablesCsicdo
* @parm sqlca
     */
    public void fetchCsicdD529351u(HvHostVariablesCsicdo hvHostVariablesCsicdo, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsicdD529351u(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
* @parm dclfeSpiRuleFrCondPos
     */
    public void openCsfcndD529351u(Sqlca sqlca, DclfeSpiRuleFrCondPos dclfeSpiRuleFrCondPos) throws Exception;

    /**
     * This method will handle the sql operations for a fetch query.
     *
     * @parm sqlca
* @parm dclfeSpiRuleFrCondPos
     */
    public void fetchCsfcndD529351u(Sqlca sqlca, DclfeSpiRuleFrCondPos dclfeSpiRuleFrCondPos) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsfcndD529351u(Sqlca sqlca) throws Exception;

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
     * @parm dclfeSpiRuleFrToSvc
* @parm sqlca
     */
    public void openSvcMainCsrD529351u(DclfeSpiRuleFrToSvc dclfeSpiRuleFrToSvc, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm hvHostVariablesSvcmain
* @parm sqlca
     */
    public void fetchSvcMainCsrD529351u(HvHostVariablesSvcmain hvHostVariablesSvcmain, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeSvcMainCsrD529351u(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dclfeSpiRuleCaus
* @parm dclfeSpiRuleProvTyp
* @parm dclfeSpiRuleIpa
* @parm sqlca
* @parm dclfeSpiRuleFrCondPos
* @parm testVariables
* @parm dclfeSpiRuleCpeFlg
     */
    public void openCombCurD529351u(DclfeSpiRuleCaus dclfeSpiRuleCaus, DclfeSpiRuleProvTyp dclfeSpiRuleProvTyp, DclfeSpiRuleIpa dclfeSpiRuleIpa, Sqlca sqlca, DclfeSpiRuleFrCondPos dclfeSpiRuleFrCondPos, TestVariables testVariables, DclfeSpiRuleCpeFlg dclfeSpiRuleCpeFlg) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm hvHostVariablesCombcr
* @parm sqlca
     */
    public void fetchCombCurD529351u(HvHostVariablesCombcr hvHostVariablesCombcr, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCombCurD529351u(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dclfeSpiRuleIcd
* @parm lstIcdKey
* @parm sqlca
* @parm testVariables
     */
    public void openCsicdFirst9999SpiD529351u(DclfeSpiRuleIcd dclfeSpiRuleIcd, LstIcdKey lstIcdKey, Sqlca sqlca, TestVariables testVariables) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm hvHostVariablesCsicdo
* @parm sqlca
     */
    public void fetchCsicdFirst9999SpiD529351u(HvHostVariablesCsicdo hvHostVariablesCsicdo, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsicdFirst9999SpiD529351u(Sqlca sqlca) throws Exception;

}
