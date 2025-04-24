package com.cloudframe.app.ip829010;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.ip829010.dto.FraudMqDebugDisp600;
import com.cloudframe.app.global.sharedvar.Ip30781TipaccdTable;
import com.cloudframe.app.global.sharedvar.Ip34051MqProcessParameters;
import com.cloudframe.app.global.sharedvar.Ip50211Tipafac;
import com.cloudframe.app.global.sharedvar.Ip70301IsItCallFromWlmGroup;
import com.cloudframe.app.global.sharedvar.Ip7051f4EntryFoundGroup;
import com.cloudframe.app.global.sharedvar.Ip70301PimRusMqSrvActiveGroup;
import com.cloudframe.app.global.sharedvar.ApiLayout;
import com.cloudframe.app.ip829010.dto.Work;
import com.cloudframe.app.ip829010.dto.Ip82921ErrPayloadMsg;
import com.cloudframe.app.ip829010.dto.QueueVars800;
import com.cloudframe.app.global.sharedvar.Ip70301FastpayMqSrvActiveGroup;
import com.cloudframe.app.global.sharedvar.Ip70301PmaIndMqSrvActiveGroup;
import com.cloudframe.app.global.sharedvar.Ip70711TipamrsEntries;
import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
import com.cloudframe.app.global.sharedvar.GetBrowseCallsGroup100;
import com.cloudframe.app.global.sharedvar.Ip996021JobInformation;
import com.cloudframe.app.global.sharedvar.Ip70301IsMqReqSentSwGroup;
import com.cloudframe.app.global.sharedvar.Ip70521MqApiLayout;
import com.cloudframe.app.global.sharedvar.LinkVariable800;
import com.cloudframe.app.global.sharedvar.Ip70301MpAchMqSrvActiveGroup;
import com.cloudframe.app.global.sharedvar.Ip70301CemauthMqSrvActiveGroup;
import com.cloudframe.app.global.sharedvar.Ip70511EntryFoundGroup;
import com.cloudframe.app.global.sharedvar.Ip70301IsItCallFromNspkGroup;
import com.cloudframe.app.global.sharedvar.Ip30881Db2McwaitInputValue;
import com.cloudframe.app.global.sharedvar.Ip70301PmaIdnMqSrvActiveGroup;
import com.cloudframe.app.global.sharedvar.Ip70301OrigMsgLenGroup;
import com.cloudframe.app.global.sharedvar.Ip70301PimIdnMqSrvActiveGroup;
import com.cloudframe.app.ip829010.dto.MqputFailCnt613;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
import com.cloudframe.app.global.sharedvar.Ip08101RunControlRecord;
import com.cloudframe.app.global.sharedvar.Ip70301QrRfndMqSrvActiveGroup;
import com.cloudframe.app.global.sharedvar.Ip7052f4MqApiLayout;
import com.cloudframe.app.global.sharedvar.Ip70301CemnspkMqSrvActiveGroup;
import com.cloudframe.app.global.sharedvar.ArePhysicalFilesOverGroup100;
import com.cloudframe.app.global.sharedvar.CheckCloseQueueGroup100;
import com.cloudframe.app.global.sharedvar.Ip70301IsFraudMqSrvActiveGroup;
import com.cloudframe.app.global.sharedvar.Ip70301IsCemresMqSrvActveGroup;
import com.cloudframe.app.ip829010.dto.QueueErrorMsg611;
import com.cloudframe.app.global.sharedvar.Ip70301InstallMqSrvActiveGroup;
import com.cloudframe.app.global.sharedvar.Ip70301PmiIdnMqSrvActiveGroup;
import com.cloudframe.app.global.sharedvar.Ip89011EnvironmentIndArea;
import com.cloudframe.app.ip829010.dto.MrsRowCnt608;
import com.cloudframe.app.global.sharedvar.Ip70301PmtIdnMqSrvActiveGroup;
import com.cloudframe.app.ip829010.dto.FnsPayload;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
import com.cloudframe.app.global.sharedvar.Ip7051f4Table;
import com.cloudframe.app.global.sharedvar.Ip70511Table;
import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
import com.cloudframe.app.global.sharedvar.CheckPutQueueGroup100;
import com.cloudframe.app.ip829010.dto.MqputSkipCnt610;
import com.cloudframe.app.ip829010.dto.TipamrsSkipCnt611;
import com.cloudframe.app.global.sharedvar.Ip70301PimIndMqSrvActiveGroup;
import com.cloudframe.app.global.sharedvar.Ip02015PrcssAgrmtTable;
import com.cloudframe.app.global.sharedvar.Ip50201ClosedDate;
import com.cloudframe.app.global.sharedvar.Ip70301PmaRusMqSrvActiveGroup;
import com.cloudframe.app.global.sharedvar.Ip70301PmiAmsMqSrvActiveGroup;
import com.cloudframe.app.ip829010.dto.FnsPayloadExpirationDate;
import com.cloudframe.app.ip829010.file.records.Sys201ErrMsgOut;
import com.cloudframe.app.global.sharedvar.Ip57901Tipaqpr;
import com.cloudframe.app.global.sharedvar.Ip64801LrmCommBlock;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
import com.cloudframe.app.global.sharedvar.Ip70301PmaAmsMqSrvActiveGroup;
import com.cloudframe.app.global.sharedvar.Ip70301LnCloneOwnerIdGroup;
import com.cloudframe.app.global.sharedvar.Ip50201ExpirationDate;
import com.cloudframe.app.global.sharedvar.Ip50201Tipafaa;
import com.cloudframe.app.global.sharedvar.FnsPldRdExpirationDate;
import com.cloudframe.app.global.sharedvar.Ip70301PmtRusMqSrvActiveGroup;
import com.cloudframe.app.ip829010.dto.Parms1000;
import com.cloudframe.app.ip829010.dto.FaaFacNotFndCnt614;
import com.cloudframe.app.ip829010.dto.ErrorMsg6003012;
import com.cloudframe.app.global.sharedvar.Ip70301PmiRusMqSrvActiveGroup;
import com.cloudframe.app.ip829010.dto.ErrorMsg6003011;
import com.cloudframe.app.global.sharedvar.Ip70301PmiIndMqSrvActiveGroup;
import com.cloudframe.app.ip829010.dto.ErrorMsg6003010;
import com.cloudframe.app.global.sharedvar.Ip70301AlmPreMqSrvActiveGroup;
import com.cloudframe.app.global.sharedvar.Ip70301IsCemreqMqSrvActveGroup;
import com.cloudframe.app.global.sharedvar.Ip70301AlmChaMqSrvActiveGroup;
import com.cloudframe.app.global.sharedvar.Ip70301AlmRspMqSrvActiveGroup;
import com.cloudframe.app.ip829010.dto.AbendPara900;
import com.cloudframe.app.ip829010.dto.Ip82921ErrMsgOut;
import com.cloudframe.app.ip829010.dto.AbendMessage900;
import com.cloudframe.app.global.sharedvar.FnsPldRd;
import com.cloudframe.app.global.sharedvar.Ip70301PimAmsMqSrvActiveGroup;
import com.cloudframe.app.global.sharedvar.Ip70301LnCommitCntGroup;
import com.cloudframe.app.global.sharedvar.CheckGetQueueGroup100;
import com.cloudframe.app.ip829010.dto.MqgetFailCnt612;
import com.cloudframe.app.global.sharedvar.Ip70701TipamrqEntries;
import com.cloudframe.app.ip829010.dto.Ip28221PaTableRestart;
import com.cloudframe.app.global.sharedvar.Ip30771TipacliTable;
import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
import com.cloudframe.app.global.sharedvar.Ip70301PmtIndMqSrvActiveGroup;


@Context
public class Ip829010Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    QueueErrorMsg611 queueErrorMsg611;
    Ip70701TipamrqEntries ip70701TipamrqEntries;
    Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup;
    Ip996011ProgramStartMessage ip996011ProgramStartMessage;
    Ip50211Tipafac ip50211Tipafac;
    Ip70301PmaAmsMqSrvActiveGroup ip70301PmaAmsMqSrvActiveGroup;
    Ip30771TipacliTable ip30771TipacliTable;
    Ip70301PmiRusMqSrvActiveGroup ip70301PmiRusMqSrvActiveGroup;
    Ip28221PaTableRestart ip28221PaTableRestart;
    Ip7051f4EntryFoundGroup ip7051f4EntryFoundGroup;
    Ip70301IsItCallFromNspkGroup ip70301IsItCallFromNspkGroup;
    Ip30881Db2McwaitInputValue ip30881Db2McwaitInputValue;
    ApiLayout apiLayout;
    Ip70521MqApiLayout ip70521MqApiLayout;
    AbendPara900 abendPara900;
    Ip70301PimRusMqSrvActiveGroup ip70301PimRusMqSrvActiveGroup;
    ArePhysicalFilesOverGroup100 arePhysicalFilesOverGroup100;
    Sys201ErrMsgOut sys201ErrMsgOut;
    Ip08101RunControlRecord ip08101RunControlRecord;
    Ip70301IsCemresMqSrvActveGroup ip70301IsCemresMqSrvActveGroup;
    Ip70301QrRfndMqSrvActiveGroup ip70301QrRfndMqSrvActiveGroup;
    Ip50005ClearingDtTm ip50005ClearingDtTm;
    Ip82921ErrMsgOut ip82921ErrMsgOut;
    Ip70301PimAmsMqSrvActiveGroup ip70301PimAmsMqSrvActiveGroup;
    Parms1000 parms1000;
    Ip70301PimIndMqSrvActiveGroup ip70301PimIndMqSrvActiveGroup;
    Ip70301IsItCallFromWlmGroup ip70301IsItCallFromWlmGroup;
    Work work;
    Ip60001EventLogWorkArea ip60001EventLogWorkArea;
    Ip70301IsCemreqMqSrvActveGroup ip70301IsCemreqMqSrvActveGroup;
    Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup;
    Ip64801LrmCommBlock ip64801LrmCommBlock;
    Ip30781TipaccdTable ip30781TipaccdTable;
    Ip70301OrigMsgLenGroup ip70301OrigMsgLenGroup;
    Ip50005OneDayRec ip50005OneDayRec;
    Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable;
    MqgetFailCnt612 mqgetFailCnt612;
    Ip70301CemnspkMqSrvActiveGroup ip70301CemnspkMqSrvActiveGroup;
    Ip70301MpAchMqSrvActiveGroup ip70301MpAchMqSrvActiveGroup;
    Ip70301PmiIndMqSrvActiveGroup ip70301PmiIndMqSrvActiveGroup;
    FaaFacNotFndCnt614 faaFacNotFndCnt614;
    Ip70511EntryFoundGroup ip70511EntryFoundGroup;
    Ip57901Tipaqpr ip57901Tipaqpr;
    FraudMqDebugDisp600 fraudMqDebugDisp600;
    ErrorMsg6003010 errorMsg6003010;
    Ip70301PmtIdnMqSrvActiveGroup ip70301PmtIdnMqSrvActiveGroup;
    LinkVariable800 linkVariable800;
    GetBrowseCallsGroup100 getBrowseCallsGroup100;
    ErrorMsg6003011 errorMsg6003011;
    MrsRowCnt608 mrsRowCnt608;
    Ip70301PimIdnMqSrvActiveGroup ip70301PimIdnMqSrvActiveGroup;
    ErrorMsg6003012 errorMsg6003012;
    Ip70301LnCommitCntGroup ip70301LnCommitCntGroup;
    Ip70301AlmPreMqSrvActiveGroup ip70301AlmPreMqSrvActiveGroup;
    Ip70301FastpayMqSrvActiveGroup ip70301FastpayMqSrvActiveGroup;
    MqputSkipCnt610 mqputSkipCnt610;
    Ip70301PmiIdnMqSrvActiveGroup ip70301PmiIdnMqSrvActiveGroup;
    Ip70301AlmChaMqSrvActiveGroup ip70301AlmChaMqSrvActiveGroup;
    AbendMessage900 abendMessage900;
    Ip70301CemauthMqSrvActiveGroup ip70301CemauthMqSrvActiveGroup;
    Ip89011EnvironmentIndArea ip89011EnvironmentIndArea;
    CheckCloseQueueGroup100 checkCloseQueueGroup100;
    Ip7051f4Table ip7051f4Table;
    Ip7052f4MqApiLayout ip7052f4MqApiLayout;
    QueueVars800 queueVars800;
    Ip70711TipamrsEntries ip70711TipamrsEntries;
    MqputFailCnt613 mqputFailCnt613;
    Ip70301PmaRusMqSrvActiveGroup ip70301PmaRusMqSrvActiveGroup;
    FnsPayload fnsPayload;
    Ip70301InstallMqSrvActiveGroup ip70301InstallMqSrvActiveGroup;
    FnsPldRd fnsPldRd;
    Ip70301IsMqReqSentSwGroup ip70301IsMqReqSentSwGroup;
    Ip70511Table ip70511Table;
    Ip70301PmtRusMqSrvActiveGroup ip70301PmtRusMqSrvActiveGroup;
    Ip50201Tipafaa ip50201Tipafaa;
    Ip70301PmtIndMqSrvActiveGroup ip70301PmtIndMqSrvActiveGroup;
    CheckGetQueueGroup100 checkGetQueueGroup100;
    Ip996021JobInformation ip996021JobInformation;
    CheckPutQueueGroup100 checkPutQueueGroup100;
    Ip70301PmaIndMqSrvActiveGroup ip70301PmaIndMqSrvActiveGroup;
    Ip34051MqProcessParameters ip34051MqProcessParameters;
    Ip70301PmiAmsMqSrvActiveGroup ip70301PmiAmsMqSrvActiveGroup;
    Ip70301IsFraudMqSrvActiveGroup ip70301IsFraudMqSrvActiveGroup;
    Ip70301LnCloneOwnerIdGroup ip70301LnCloneOwnerIdGroup;
    Ip70301AlmRspMqSrvActiveGroup ip70301AlmRspMqSrvActiveGroup;
    TipamrsSkipCnt611 tipamrsSkipCnt611;
    Ip70301PmaIdnMqSrvActiveGroup ip70301PmaIdnMqSrvActiveGroup;


    private int rc;

    public GlobalExecutorCtx getGlobalCtx() {
            return globalCtx;
    }

    public void setGlobalCtx(GlobalExecutorCtx globalCtx) {
        this.globalCtx = globalCtx;
    }

    public int getRc() {
        return this.rc;
    }

    public void setRc(int rc) {
        this.rc = rc;
    }



    boolean programEnded = false;

    public boolean isProgramEnded() {
        return this.programEnded;
    }

    public void setProgramEnded(boolean programEnded) {
        this.programEnded = programEnded;
    }


    public QueueErrorMsg611 getQueueErrorMsg611() {
        if (queueErrorMsg611 == null) {
            queueErrorMsg611 = new QueueErrorMsg611();
        }

        return queueErrorMsg611;
    }

    public void setQueueErrorMsg611(QueueErrorMsg611 queueErrorMsg611) {
        this.queueErrorMsg611 = queueErrorMsg611;
    }
    public Ip70701TipamrqEntries getIp70701TipamrqEntries() {
        if (ip70701TipamrqEntries == null) {
            ip70701TipamrqEntries = globalCtx.getGlobalDto(Ip70701TipamrqEntries.class);
        }

        return ip70701TipamrqEntries;
    }

    public Ip50005OneDayReadStatusGroup getIp50005OneDayReadStatusGroup() {
        if (ip50005OneDayReadStatusGroup == null) {
            ip50005OneDayReadStatusGroup = globalCtx.getGlobalDto(Ip50005OneDayReadStatusGroup.class);
        }

        return ip50005OneDayReadStatusGroup;
    }

    public Ip996011ProgramStartMessage getIp996011ProgramStartMessage() {
        if (ip996011ProgramStartMessage == null) {
            ip996011ProgramStartMessage = globalCtx.getGlobalDto(Ip996011ProgramStartMessage.class);
        }

        return ip996011ProgramStartMessage;
    }

    public Ip50211Tipafac getIp50211Tipafac() {
        if (ip50211Tipafac == null) {
            ip50211Tipafac = globalCtx.getGlobalDto(Ip50211Tipafac.class);
        }

        return ip50211Tipafac;
    }

    public Ip70301PmaAmsMqSrvActiveGroup getIp70301PmaAmsMqSrvActiveGroup() {
        if (ip70301PmaAmsMqSrvActiveGroup == null) {
            ip70301PmaAmsMqSrvActiveGroup = globalCtx.getGlobalDto(Ip70301PmaAmsMqSrvActiveGroup.class);
        }

        return ip70301PmaAmsMqSrvActiveGroup;
    }

    public Ip30771TipacliTable getIp30771TipacliTable() {
        if (ip30771TipacliTable == null) {
            ip30771TipacliTable = globalCtx.getGlobalDto(Ip30771TipacliTable.class);
        }

        return ip30771TipacliTable;
    }

    public Ip70301PmiRusMqSrvActiveGroup getIp70301PmiRusMqSrvActiveGroup() {
        if (ip70301PmiRusMqSrvActiveGroup == null) {
            ip70301PmiRusMqSrvActiveGroup = globalCtx.getGlobalDto(Ip70301PmiRusMqSrvActiveGroup.class);
        }

        return ip70301PmiRusMqSrvActiveGroup;
    }

    public Ip28221PaTableRestart getIp28221PaTableRestart() {
        if (ip28221PaTableRestart == null) {
            ip28221PaTableRestart = new Ip28221PaTableRestart();
        }

        return ip28221PaTableRestart;
    }

    public void setIp28221PaTableRestart(Ip28221PaTableRestart ip28221PaTableRestart) {
        this.ip28221PaTableRestart = ip28221PaTableRestart;
    }
    public Ip7051f4EntryFoundGroup getIp7051f4EntryFoundGroup() {
        if (ip7051f4EntryFoundGroup == null) {
            ip7051f4EntryFoundGroup = globalCtx.getGlobalDto(Ip7051f4EntryFoundGroup.class);
        }

        return ip7051f4EntryFoundGroup;
    }

    public Ip70301IsItCallFromNspkGroup getIp70301IsItCallFromNspkGroup() {
        if (ip70301IsItCallFromNspkGroup == null) {
            ip70301IsItCallFromNspkGroup = globalCtx.getGlobalDto(Ip70301IsItCallFromNspkGroup.class);
        }

        return ip70301IsItCallFromNspkGroup;
    }

    public Ip30881Db2McwaitInputValue getIp30881Db2McwaitInputValue() {
        if (ip30881Db2McwaitInputValue == null) {
            ip30881Db2McwaitInputValue = globalCtx.getGlobalDto(Ip30881Db2McwaitInputValue.class);
        }

        return ip30881Db2McwaitInputValue;
    }

    public ApiLayout getApiLayout() {
        if (apiLayout == null) {
            apiLayout = globalCtx.getGlobalDto(ApiLayout.class);
        }

        return apiLayout;
    }

    public Ip70521MqApiLayout getIp70521MqApiLayout() {
        if (ip70521MqApiLayout == null) {
            ip70521MqApiLayout = globalCtx.getGlobalDto(Ip70521MqApiLayout.class);
        }

        return ip70521MqApiLayout;
    }

    public AbendPara900 getAbendPara900() {
        if (abendPara900 == null) {
            abendPara900 = new AbendPara900();
        }

        return abendPara900;
    }

    public void setAbendPara900(AbendPara900 abendPara900) {
        this.abendPara900 = abendPara900;
    }
    public Ip70301PimRusMqSrvActiveGroup getIp70301PimRusMqSrvActiveGroup() {
        if (ip70301PimRusMqSrvActiveGroup == null) {
            ip70301PimRusMqSrvActiveGroup = globalCtx.getGlobalDto(Ip70301PimRusMqSrvActiveGroup.class);
        }

        return ip70301PimRusMqSrvActiveGroup;
    }

    public ArePhysicalFilesOverGroup100 getArePhysicalFilesOverGroup100() {
        if (arePhysicalFilesOverGroup100 == null) {
            arePhysicalFilesOverGroup100 = globalCtx.getGlobalDto(ArePhysicalFilesOverGroup100.class);
        }

        return arePhysicalFilesOverGroup100;
    }

    public Sys201ErrMsgOut getSys201ErrMsgOut() {
        if (sys201ErrMsgOut == null) {
            sys201ErrMsgOut = new Sys201ErrMsgOut();
        }

        return sys201ErrMsgOut;
    }

    public void setSys201ErrMsgOut(Sys201ErrMsgOut sys201ErrMsgOut) {
        this.sys201ErrMsgOut = sys201ErrMsgOut;
    }
    public Ip08101RunControlRecord getIp08101RunControlRecord() {
        if (ip08101RunControlRecord == null) {
            ip08101RunControlRecord = globalCtx.getGlobalDto(Ip08101RunControlRecord.class);
        }

        return ip08101RunControlRecord;
    }

    public Ip70301IsCemresMqSrvActveGroup getIp70301IsCemresMqSrvActveGroup() {
        if (ip70301IsCemresMqSrvActveGroup == null) {
            ip70301IsCemresMqSrvActveGroup = globalCtx.getGlobalDto(Ip70301IsCemresMqSrvActveGroup.class);
        }

        return ip70301IsCemresMqSrvActveGroup;
    }

    public Ip70301QrRfndMqSrvActiveGroup getIp70301QrRfndMqSrvActiveGroup() {
        if (ip70301QrRfndMqSrvActiveGroup == null) {
            ip70301QrRfndMqSrvActiveGroup = globalCtx.getGlobalDto(Ip70301QrRfndMqSrvActiveGroup.class);
        }

        return ip70301QrRfndMqSrvActiveGroup;
    }

    public Ip50005ClearingDtTm getIp50005ClearingDtTm() {
        if (ip50005ClearingDtTm == null) {
            ip50005ClearingDtTm = globalCtx.getGlobalDto(Ip50005ClearingDtTm.class);
        }

        return ip50005ClearingDtTm;
    }

    public Ip82921ErrMsgOut getIp82921ErrMsgOut() {
        if (ip82921ErrMsgOut == null) {
            ip82921ErrMsgOut = new Ip82921ErrMsgOut();
        }

        return ip82921ErrMsgOut;
    }

    public void setIp82921ErrMsgOut(Ip82921ErrMsgOut ip82921ErrMsgOut) {
        this.ip82921ErrMsgOut = ip82921ErrMsgOut;
    }
    public Ip70301PimAmsMqSrvActiveGroup getIp70301PimAmsMqSrvActiveGroup() {
        if (ip70301PimAmsMqSrvActiveGroup == null) {
            ip70301PimAmsMqSrvActiveGroup = globalCtx.getGlobalDto(Ip70301PimAmsMqSrvActiveGroup.class);
        }

        return ip70301PimAmsMqSrvActiveGroup;
    }

    public Parms1000 getParms1000() {
        if (parms1000 == null) {
            parms1000 = new Parms1000();
        }

        return parms1000;
    }

    public void setParms1000(Parms1000 parms1000) {
        this.parms1000 = parms1000;
    }
    public Ip70301PimIndMqSrvActiveGroup getIp70301PimIndMqSrvActiveGroup() {
        if (ip70301PimIndMqSrvActiveGroup == null) {
            ip70301PimIndMqSrvActiveGroup = globalCtx.getGlobalDto(Ip70301PimIndMqSrvActiveGroup.class);
        }

        return ip70301PimIndMqSrvActiveGroup;
    }

    public Ip70301IsItCallFromWlmGroup getIp70301IsItCallFromWlmGroup() {
        if (ip70301IsItCallFromWlmGroup == null) {
            ip70301IsItCallFromWlmGroup = globalCtx.getGlobalDto(Ip70301IsItCallFromWlmGroup.class);
        }

        return ip70301IsItCallFromWlmGroup;
    }

    public Work getWork() {
        if (work == null) {
            work = new Work();
        }

        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }
    public Ip60001EventLogWorkArea getIp60001EventLogWorkArea() {
        if (ip60001EventLogWorkArea == null) {
            ip60001EventLogWorkArea = globalCtx.getGlobalDto(Ip60001EventLogWorkArea.class);
        }

        return ip60001EventLogWorkArea;
    }

    public Ip70301IsCemreqMqSrvActveGroup getIp70301IsCemreqMqSrvActveGroup() {
        if (ip70301IsCemreqMqSrvActveGroup == null) {
            ip70301IsCemreqMqSrvActveGroup = globalCtx.getGlobalDto(Ip70301IsCemreqMqSrvActveGroup.class);
        }

        return ip70301IsCemreqMqSrvActveGroup;
    }

    public Ip50005OneDayRecLthGroup getIp50005OneDayRecLthGroup() {
        if (ip50005OneDayRecLthGroup == null) {
            ip50005OneDayRecLthGroup = globalCtx.getGlobalDto(Ip50005OneDayRecLthGroup.class);
        }

        return ip50005OneDayRecLthGroup;
    }

    public Ip64801LrmCommBlock getIp64801LrmCommBlock() {
        if (ip64801LrmCommBlock == null) {
            ip64801LrmCommBlock = globalCtx.getGlobalDto(Ip64801LrmCommBlock.class);
        }

        return ip64801LrmCommBlock;
    }

    public Ip30781TipaccdTable getIp30781TipaccdTable() {
        if (ip30781TipaccdTable == null) {
            ip30781TipaccdTable = globalCtx.getGlobalDto(Ip30781TipaccdTable.class);
        }

        return ip30781TipaccdTable;
    }

    public Ip70301OrigMsgLenGroup getIp70301OrigMsgLenGroup() {
        if (ip70301OrigMsgLenGroup == null) {
            ip70301OrigMsgLenGroup = globalCtx.getGlobalDto(Ip70301OrigMsgLenGroup.class);
        }

        return ip70301OrigMsgLenGroup;
    }

    public Ip50005OneDayRec getIp50005OneDayRec() {
        if (ip50005OneDayRec == null) {
            ip50005OneDayRec = globalCtx.getGlobalDto(Ip50005OneDayRec.class);
        }

        return ip50005OneDayRec;
    }

    public Ip02015PrcssAgrmtTable getIp02015PrcssAgrmtTable() {
        if (ip02015PrcssAgrmtTable == null) {
            ip02015PrcssAgrmtTable = globalCtx.getGlobalDto(Ip02015PrcssAgrmtTable.class);
        }

        return ip02015PrcssAgrmtTable;
    }

    public MqgetFailCnt612 getMqgetFailCnt612() {
        if (mqgetFailCnt612 == null) {
            mqgetFailCnt612 = new MqgetFailCnt612();
        }

        return mqgetFailCnt612;
    }

    public void setMqgetFailCnt612(MqgetFailCnt612 mqgetFailCnt612) {
        this.mqgetFailCnt612 = mqgetFailCnt612;
    }
    public Ip70301CemnspkMqSrvActiveGroup getIp70301CemnspkMqSrvActiveGroup() {
        if (ip70301CemnspkMqSrvActiveGroup == null) {
            ip70301CemnspkMqSrvActiveGroup = globalCtx.getGlobalDto(Ip70301CemnspkMqSrvActiveGroup.class);
        }

        return ip70301CemnspkMqSrvActiveGroup;
    }

    public Ip70301MpAchMqSrvActiveGroup getIp70301MpAchMqSrvActiveGroup() {
        if (ip70301MpAchMqSrvActiveGroup == null) {
            ip70301MpAchMqSrvActiveGroup = globalCtx.getGlobalDto(Ip70301MpAchMqSrvActiveGroup.class);
        }

        return ip70301MpAchMqSrvActiveGroup;
    }

    public Ip70301PmiIndMqSrvActiveGroup getIp70301PmiIndMqSrvActiveGroup() {
        if (ip70301PmiIndMqSrvActiveGroup == null) {
            ip70301PmiIndMqSrvActiveGroup = globalCtx.getGlobalDto(Ip70301PmiIndMqSrvActiveGroup.class);
        }

        return ip70301PmiIndMqSrvActiveGroup;
    }

    public FaaFacNotFndCnt614 getFaaFacNotFndCnt614() {
        if (faaFacNotFndCnt614 == null) {
            faaFacNotFndCnt614 = new FaaFacNotFndCnt614();
        }

        return faaFacNotFndCnt614;
    }

    public void setFaaFacNotFndCnt614(FaaFacNotFndCnt614 faaFacNotFndCnt614) {
        this.faaFacNotFndCnt614 = faaFacNotFndCnt614;
    }
    public Ip70511EntryFoundGroup getIp70511EntryFoundGroup() {
        if (ip70511EntryFoundGroup == null) {
            ip70511EntryFoundGroup = globalCtx.getGlobalDto(Ip70511EntryFoundGroup.class);
        }

        return ip70511EntryFoundGroup;
    }

    public Ip57901Tipaqpr getIp57901Tipaqpr() {
        if (ip57901Tipaqpr == null) {
            ip57901Tipaqpr = globalCtx.getGlobalDto(Ip57901Tipaqpr.class);
        }

        return ip57901Tipaqpr;
    }

    public FraudMqDebugDisp600 getFraudMqDebugDisp600() {
        if (fraudMqDebugDisp600 == null) {
            fraudMqDebugDisp600 = new FraudMqDebugDisp600();
        }

        return fraudMqDebugDisp600;
    }

    public void setFraudMqDebugDisp600(FraudMqDebugDisp600 fraudMqDebugDisp600) {
        this.fraudMqDebugDisp600 = fraudMqDebugDisp600;
    }
    public ErrorMsg6003010 getErrorMsg6003010() {
        if (errorMsg6003010 == null) {
            errorMsg6003010 = new ErrorMsg6003010();
        }

        return errorMsg6003010;
    }

    public void setErrorMsg6003010(ErrorMsg6003010 errorMsg6003010) {
        this.errorMsg6003010 = errorMsg6003010;
    }
    public Ip70301PmtIdnMqSrvActiveGroup getIp70301PmtIdnMqSrvActiveGroup() {
        if (ip70301PmtIdnMqSrvActiveGroup == null) {
            ip70301PmtIdnMqSrvActiveGroup = globalCtx.getGlobalDto(Ip70301PmtIdnMqSrvActiveGroup.class);
        }

        return ip70301PmtIdnMqSrvActiveGroup;
    }

    public LinkVariable800 getLinkVariable800() {
        if (linkVariable800 == null) {
            linkVariable800 = globalCtx.getGlobalDto(LinkVariable800.class);
        }

        return linkVariable800;
    }

    public GetBrowseCallsGroup100 getGetBrowseCallsGroup100() {
        if (getBrowseCallsGroup100 == null) {
            getBrowseCallsGroup100 = globalCtx.getGlobalDto(GetBrowseCallsGroup100.class);
        }

        return getBrowseCallsGroup100;
    }

    public ErrorMsg6003011 getErrorMsg6003011() {
        if (errorMsg6003011 == null) {
            errorMsg6003011 = new ErrorMsg6003011();
        }

        return errorMsg6003011;
    }

    public void setErrorMsg6003011(ErrorMsg6003011 errorMsg6003011) {
        this.errorMsg6003011 = errorMsg6003011;
    }
    public MrsRowCnt608 getMrsRowCnt608() {
        if (mrsRowCnt608 == null) {
            mrsRowCnt608 = new MrsRowCnt608();
        }

        return mrsRowCnt608;
    }

    public void setMrsRowCnt608(MrsRowCnt608 mrsRowCnt608) {
        this.mrsRowCnt608 = mrsRowCnt608;
    }
    public Ip70301PimIdnMqSrvActiveGroup getIp70301PimIdnMqSrvActiveGroup() {
        if (ip70301PimIdnMqSrvActiveGroup == null) {
            ip70301PimIdnMqSrvActiveGroup = globalCtx.getGlobalDto(Ip70301PimIdnMqSrvActiveGroup.class);
        }

        return ip70301PimIdnMqSrvActiveGroup;
    }

    public ErrorMsg6003012 getErrorMsg6003012() {
        if (errorMsg6003012 == null) {
            errorMsg6003012 = new ErrorMsg6003012();
        }

        return errorMsg6003012;
    }

    public void setErrorMsg6003012(ErrorMsg6003012 errorMsg6003012) {
        this.errorMsg6003012 = errorMsg6003012;
    }
    public Ip70301LnCommitCntGroup getIp70301LnCommitCntGroup() {
        if (ip70301LnCommitCntGroup == null) {
            ip70301LnCommitCntGroup = globalCtx.getGlobalDto(Ip70301LnCommitCntGroup.class);
        }

        return ip70301LnCommitCntGroup;
    }

    public Ip70301AlmPreMqSrvActiveGroup getIp70301AlmPreMqSrvActiveGroup() {
        if (ip70301AlmPreMqSrvActiveGroup == null) {
            ip70301AlmPreMqSrvActiveGroup = globalCtx.getGlobalDto(Ip70301AlmPreMqSrvActiveGroup.class);
        }

        return ip70301AlmPreMqSrvActiveGroup;
    }

    public Ip70301FastpayMqSrvActiveGroup getIp70301FastpayMqSrvActiveGroup() {
        if (ip70301FastpayMqSrvActiveGroup == null) {
            ip70301FastpayMqSrvActiveGroup = globalCtx.getGlobalDto(Ip70301FastpayMqSrvActiveGroup.class);
        }

        return ip70301FastpayMqSrvActiveGroup;
    }

    public MqputSkipCnt610 getMqputSkipCnt610() {
        if (mqputSkipCnt610 == null) {
            mqputSkipCnt610 = new MqputSkipCnt610();
        }

        return mqputSkipCnt610;
    }

    public void setMqputSkipCnt610(MqputSkipCnt610 mqputSkipCnt610) {
        this.mqputSkipCnt610 = mqputSkipCnt610;
    }
    public Ip70301PmiIdnMqSrvActiveGroup getIp70301PmiIdnMqSrvActiveGroup() {
        if (ip70301PmiIdnMqSrvActiveGroup == null) {
            ip70301PmiIdnMqSrvActiveGroup = globalCtx.getGlobalDto(Ip70301PmiIdnMqSrvActiveGroup.class);
        }

        return ip70301PmiIdnMqSrvActiveGroup;
    }

    public Ip70301AlmChaMqSrvActiveGroup getIp70301AlmChaMqSrvActiveGroup() {
        if (ip70301AlmChaMqSrvActiveGroup == null) {
            ip70301AlmChaMqSrvActiveGroup = globalCtx.getGlobalDto(Ip70301AlmChaMqSrvActiveGroup.class);
        }

        return ip70301AlmChaMqSrvActiveGroup;
    }

    public AbendMessage900 getAbendMessage900() {
        if (abendMessage900 == null) {
            abendMessage900 = new AbendMessage900();
        }

        return abendMessage900;
    }

    public void setAbendMessage900(AbendMessage900 abendMessage900) {
        this.abendMessage900 = abendMessage900;
    }
    public Ip70301CemauthMqSrvActiveGroup getIp70301CemauthMqSrvActiveGroup() {
        if (ip70301CemauthMqSrvActiveGroup == null) {
            ip70301CemauthMqSrvActiveGroup = globalCtx.getGlobalDto(Ip70301CemauthMqSrvActiveGroup.class);
        }

        return ip70301CemauthMqSrvActiveGroup;
    }

    public Ip89011EnvironmentIndArea getIp89011EnvironmentIndArea() {
        if (ip89011EnvironmentIndArea == null) {
            ip89011EnvironmentIndArea = globalCtx.getGlobalDto(Ip89011EnvironmentIndArea.class);
        }

        return ip89011EnvironmentIndArea;
    }

    public CheckCloseQueueGroup100 getCheckCloseQueueGroup100() {
        if (checkCloseQueueGroup100 == null) {
            checkCloseQueueGroup100 = globalCtx.getGlobalDto(CheckCloseQueueGroup100.class);
        }

        return checkCloseQueueGroup100;
    }

    public Ip7051f4Table getIp7051f4Table() {
        if (ip7051f4Table == null) {
            ip7051f4Table = globalCtx.getGlobalDto(Ip7051f4Table.class);
        }

        return ip7051f4Table;
    }

    public Ip7052f4MqApiLayout getIp7052f4MqApiLayout() {
        if (ip7052f4MqApiLayout == null) {
            ip7052f4MqApiLayout = globalCtx.getGlobalDto(Ip7052f4MqApiLayout.class);
        }

        return ip7052f4MqApiLayout;
    }

    public QueueVars800 getQueueVars800() {
        if (queueVars800 == null) {
            queueVars800 = new QueueVars800();
        }

        return queueVars800;
    }

    public void setQueueVars800(QueueVars800 queueVars800) {
        this.queueVars800 = queueVars800;
    }
    public Ip70711TipamrsEntries getIp70711TipamrsEntries() {
        if (ip70711TipamrsEntries == null) {
            ip70711TipamrsEntries = globalCtx.getGlobalDto(Ip70711TipamrsEntries.class);
        }

        return ip70711TipamrsEntries;
    }

    public MqputFailCnt613 getMqputFailCnt613() {
        if (mqputFailCnt613 == null) {
            mqputFailCnt613 = new MqputFailCnt613();
        }

        return mqputFailCnt613;
    }

    public void setMqputFailCnt613(MqputFailCnt613 mqputFailCnt613) {
        this.mqputFailCnt613 = mqputFailCnt613;
    }
    public Ip70301PmaRusMqSrvActiveGroup getIp70301PmaRusMqSrvActiveGroup() {
        if (ip70301PmaRusMqSrvActiveGroup == null) {
            ip70301PmaRusMqSrvActiveGroup = globalCtx.getGlobalDto(Ip70301PmaRusMqSrvActiveGroup.class);
        }

        return ip70301PmaRusMqSrvActiveGroup;
    }

    public FnsPayload getFnsPayload() {
        if (fnsPayload == null) {
            fnsPayload = new FnsPayload();
        }

        return fnsPayload;
    }

    public void setFnsPayload(FnsPayload fnsPayload) {
        this.fnsPayload = fnsPayload;
    }
    public Ip70301InstallMqSrvActiveGroup getIp70301InstallMqSrvActiveGroup() {
        if (ip70301InstallMqSrvActiveGroup == null) {
            ip70301InstallMqSrvActiveGroup = globalCtx.getGlobalDto(Ip70301InstallMqSrvActiveGroup.class);
        }

        return ip70301InstallMqSrvActiveGroup;
    }

    public FnsPldRd getFnsPldRd() {
        if (fnsPldRd == null) {
            fnsPldRd = globalCtx.getGlobalDto(FnsPldRd.class);
        }

        return fnsPldRd;
    }

    public Ip70301IsMqReqSentSwGroup getIp70301IsMqReqSentSwGroup() {
        if (ip70301IsMqReqSentSwGroup == null) {
            ip70301IsMqReqSentSwGroup = globalCtx.getGlobalDto(Ip70301IsMqReqSentSwGroup.class);
        }

        return ip70301IsMqReqSentSwGroup;
    }

    public Ip70511Table getIp70511Table() {
        if (ip70511Table == null) {
            ip70511Table = globalCtx.getGlobalDto(Ip70511Table.class);
        }

        return ip70511Table;
    }

    public Ip70301PmtRusMqSrvActiveGroup getIp70301PmtRusMqSrvActiveGroup() {
        if (ip70301PmtRusMqSrvActiveGroup == null) {
            ip70301PmtRusMqSrvActiveGroup = globalCtx.getGlobalDto(Ip70301PmtRusMqSrvActiveGroup.class);
        }

        return ip70301PmtRusMqSrvActiveGroup;
    }

    public Ip50201Tipafaa getIp50201Tipafaa() {
        if (ip50201Tipafaa == null) {
            ip50201Tipafaa = globalCtx.getGlobalDto(Ip50201Tipafaa.class);
        }

        return ip50201Tipafaa;
    }

    public Ip70301PmtIndMqSrvActiveGroup getIp70301PmtIndMqSrvActiveGroup() {
        if (ip70301PmtIndMqSrvActiveGroup == null) {
            ip70301PmtIndMqSrvActiveGroup = globalCtx.getGlobalDto(Ip70301PmtIndMqSrvActiveGroup.class);
        }

        return ip70301PmtIndMqSrvActiveGroup;
    }

    public CheckGetQueueGroup100 getCheckGetQueueGroup100() {
        if (checkGetQueueGroup100 == null) {
            checkGetQueueGroup100 = globalCtx.getGlobalDto(CheckGetQueueGroup100.class);
        }

        return checkGetQueueGroup100;
    }

    public Ip996021JobInformation getIp996021JobInformation() {
        if (ip996021JobInformation == null) {
            ip996021JobInformation = globalCtx.getGlobalDto(Ip996021JobInformation.class);
        }

        return ip996021JobInformation;
    }

    public CheckPutQueueGroup100 getCheckPutQueueGroup100() {
        if (checkPutQueueGroup100 == null) {
            checkPutQueueGroup100 = globalCtx.getGlobalDto(CheckPutQueueGroup100.class);
        }

        return checkPutQueueGroup100;
    }

    public Ip70301PmaIndMqSrvActiveGroup getIp70301PmaIndMqSrvActiveGroup() {
        if (ip70301PmaIndMqSrvActiveGroup == null) {
            ip70301PmaIndMqSrvActiveGroup = globalCtx.getGlobalDto(Ip70301PmaIndMqSrvActiveGroup.class);
        }

        return ip70301PmaIndMqSrvActiveGroup;
    }

    public Ip34051MqProcessParameters getIp34051MqProcessParameters() {
        if (ip34051MqProcessParameters == null) {
            ip34051MqProcessParameters = globalCtx.getGlobalDto(Ip34051MqProcessParameters.class);
        }

        return ip34051MqProcessParameters;
    }

    public Ip70301PmiAmsMqSrvActiveGroup getIp70301PmiAmsMqSrvActiveGroup() {
        if (ip70301PmiAmsMqSrvActiveGroup == null) {
            ip70301PmiAmsMqSrvActiveGroup = globalCtx.getGlobalDto(Ip70301PmiAmsMqSrvActiveGroup.class);
        }

        return ip70301PmiAmsMqSrvActiveGroup;
    }

    public Ip70301IsFraudMqSrvActiveGroup getIp70301IsFraudMqSrvActiveGroup() {
        if (ip70301IsFraudMqSrvActiveGroup == null) {
            ip70301IsFraudMqSrvActiveGroup = globalCtx.getGlobalDto(Ip70301IsFraudMqSrvActiveGroup.class);
        }

        return ip70301IsFraudMqSrvActiveGroup;
    }

    public Ip70301LnCloneOwnerIdGroup getIp70301LnCloneOwnerIdGroup() {
        if (ip70301LnCloneOwnerIdGroup == null) {
            ip70301LnCloneOwnerIdGroup = globalCtx.getGlobalDto(Ip70301LnCloneOwnerIdGroup.class);
        }

        return ip70301LnCloneOwnerIdGroup;
    }

    public Ip70301AlmRspMqSrvActiveGroup getIp70301AlmRspMqSrvActiveGroup() {
        if (ip70301AlmRspMqSrvActiveGroup == null) {
            ip70301AlmRspMqSrvActiveGroup = globalCtx.getGlobalDto(Ip70301AlmRspMqSrvActiveGroup.class);
        }

        return ip70301AlmRspMqSrvActiveGroup;
    }

    public TipamrsSkipCnt611 getTipamrsSkipCnt611() {
        if (tipamrsSkipCnt611 == null) {
            tipamrsSkipCnt611 = new TipamrsSkipCnt611();
        }

        return tipamrsSkipCnt611;
    }

    public void setTipamrsSkipCnt611(TipamrsSkipCnt611 tipamrsSkipCnt611) {
        this.tipamrsSkipCnt611 = tipamrsSkipCnt611;
    }
    public Ip70301PmaIdnMqSrvActiveGroup getIp70301PmaIdnMqSrvActiveGroup() {
        if (ip70301PmaIdnMqSrvActiveGroup == null) {
            ip70301PmaIdnMqSrvActiveGroup = globalCtx.getGlobalDto(Ip70301PmaIdnMqSrvActiveGroup.class);
        }

        return ip70301PmaIdnMqSrvActiveGroup;
    }



    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += queueErrorMsg611.hashCode();
        str += ip70701TipamrqEntries.hashCode();
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += ip996011ProgramStartMessage.hashCode();
        str += ip50211Tipafac.hashCode();
        str += ip70301PmaAmsMqSrvActiveGroup.hashCode();
        str += ip30771TipacliTable.hashCode();
        str += ip70301PmiRusMqSrvActiveGroup.hashCode();
        str += ip28221PaTableRestart.hashCode();
        str += ip7051f4EntryFoundGroup.hashCode();
        str += ip70301IsItCallFromNspkGroup.hashCode();
        str += ip30881Db2McwaitInputValue.hashCode();
        str += apiLayout.hashCode();
        str += ip70521MqApiLayout.hashCode();
        str += abendPara900.hashCode();
        str += ip70301PimRusMqSrvActiveGroup.hashCode();
        str += arePhysicalFilesOverGroup100.hashCode();
        str += sys201ErrMsgOut.hashCode();
        str += ip08101RunControlRecord.hashCode();
        str += ip70301IsCemresMqSrvActveGroup.hashCode();
        str += ip70301QrRfndMqSrvActiveGroup.hashCode();
        str += ip50005ClearingDtTm.hashCode();
        str += ip82921ErrMsgOut.hashCode();
        str += ip70301PimAmsMqSrvActiveGroup.hashCode();
        str += parms1000.hashCode();
        str += ip70301PimIndMqSrvActiveGroup.hashCode();
        str += ip70301IsItCallFromWlmGroup.hashCode();
        str += work.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += ip70301IsCemreqMqSrvActveGroup.hashCode();
        str += ip50005OneDayRecLthGroup.hashCode();
        str += ip64801LrmCommBlock.hashCode();
        str += ip30781TipaccdTable.hashCode();
        str += ip70301OrigMsgLenGroup.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += ip02015PrcssAgrmtTable.hashCode();
        str += mqgetFailCnt612.hashCode();
        str += ip70301CemnspkMqSrvActiveGroup.hashCode();
        str += ip70301MpAchMqSrvActiveGroup.hashCode();
        str += ip70301PmiIndMqSrvActiveGroup.hashCode();
        str += faaFacNotFndCnt614.hashCode();
        str += ip70511EntryFoundGroup.hashCode();
        str += ip57901Tipaqpr.hashCode();
        str += fraudMqDebugDisp600.hashCode();
        str += errorMsg6003010.hashCode();
        str += ip70301PmtIdnMqSrvActiveGroup.hashCode();
        str += linkVariable800.hashCode();
        str += getBrowseCallsGroup100.hashCode();
        str += errorMsg6003011.hashCode();
        str += mrsRowCnt608.hashCode();
        str += ip70301PimIdnMqSrvActiveGroup.hashCode();
        str += errorMsg6003012.hashCode();
        str += ip70301LnCommitCntGroup.hashCode();
        str += ip70301AlmPreMqSrvActiveGroup.hashCode();
        str += ip70301FastpayMqSrvActiveGroup.hashCode();
        str += mqputSkipCnt610.hashCode();
        str += ip70301PmiIdnMqSrvActiveGroup.hashCode();
        str += ip70301AlmChaMqSrvActiveGroup.hashCode();
        str += abendMessage900.hashCode();
        str += ip70301CemauthMqSrvActiveGroup.hashCode();
        str += ip89011EnvironmentIndArea.hashCode();
        str += checkCloseQueueGroup100.hashCode();
        str += ip7051f4Table.hashCode();
        str += ip7052f4MqApiLayout.hashCode();
        str += queueVars800.hashCode();
        str += ip70711TipamrsEntries.hashCode();
        str += mqputFailCnt613.hashCode();
        str += ip70301PmaRusMqSrvActiveGroup.hashCode();
        str += fnsPayload.hashCode();
        str += ip70301InstallMqSrvActiveGroup.hashCode();
        str += fnsPldRd.hashCode();
        str += ip70301IsMqReqSentSwGroup.hashCode();
        str += ip70511Table.hashCode();
        str += ip70301PmtRusMqSrvActiveGroup.hashCode();
        str += ip50201Tipafaa.hashCode();
        str += ip70301PmtIndMqSrvActiveGroup.hashCode();
        str += checkGetQueueGroup100.hashCode();
        str += ip996021JobInformation.hashCode();
        str += checkPutQueueGroup100.hashCode();
        str += ip70301PmaIndMqSrvActiveGroup.hashCode();
        str += ip34051MqProcessParameters.hashCode();
        str += ip70301PmiAmsMqSrvActiveGroup.hashCode();
        str += ip70301IsFraudMqSrvActiveGroup.hashCode();
        str += ip70301LnCloneOwnerIdGroup.hashCode();
        str += ip70301AlmRspMqSrvActiveGroup.hashCode();
        str += tipamrsSkipCnt611.hashCode();
        str += ip70301PmaIdnMqSrvActiveGroup.hashCode();
       return str.hashCode();
    }

    public Ip829010Ctx clone() {
        Ip829010Ctx cloneObj = new Ip829010Ctx();
        cloneObj.queueErrorMsg611 = new QueueErrorMsg611();
        cloneObj.queueErrorMsg611.set(queueErrorMsg611.getClonedField());
        cloneObj.ip70701TipamrqEntries = new Ip70701TipamrqEntries();
        cloneObj.ip70701TipamrqEntries.set(ip70701TipamrqEntries.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.ip50211Tipafac = new Ip50211Tipafac();
        cloneObj.ip50211Tipafac.set(ip50211Tipafac.getClonedField());
        cloneObj.ip70301PmaAmsMqSrvActiveGroup = new Ip70301PmaAmsMqSrvActiveGroup();
        cloneObj.ip70301PmaAmsMqSrvActiveGroup.set(ip70301PmaAmsMqSrvActiveGroup.getClonedField());
        cloneObj.ip30771TipacliTable = new Ip30771TipacliTable();
        cloneObj.ip30771TipacliTable.set(ip30771TipacliTable.getClonedField());
        cloneObj.ip70301PmiRusMqSrvActiveGroup = new Ip70301PmiRusMqSrvActiveGroup();
        cloneObj.ip70301PmiRusMqSrvActiveGroup.set(ip70301PmiRusMqSrvActiveGroup.getClonedField());
        cloneObj.ip28221PaTableRestart = new Ip28221PaTableRestart();
        cloneObj.ip28221PaTableRestart.set(ip28221PaTableRestart.getClonedField());
        cloneObj.ip7051f4EntryFoundGroup = new Ip7051f4EntryFoundGroup();
        cloneObj.ip7051f4EntryFoundGroup.set(ip7051f4EntryFoundGroup.getClonedField());
        cloneObj.ip70301IsItCallFromNspkGroup = new Ip70301IsItCallFromNspkGroup();
        cloneObj.ip70301IsItCallFromNspkGroup.set(ip70301IsItCallFromNspkGroup.getClonedField());
        cloneObj.ip30881Db2McwaitInputValue = new Ip30881Db2McwaitInputValue();
        cloneObj.ip30881Db2McwaitInputValue.set(ip30881Db2McwaitInputValue.getClonedField());
        cloneObj.apiLayout = new ApiLayout();
        cloneObj.apiLayout.set(apiLayout.getClonedField());
        cloneObj.ip70521MqApiLayout = new Ip70521MqApiLayout();
        cloneObj.ip70521MqApiLayout.set(ip70521MqApiLayout.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.ip70301PimRusMqSrvActiveGroup = new Ip70301PimRusMqSrvActiveGroup();
        cloneObj.ip70301PimRusMqSrvActiveGroup.set(ip70301PimRusMqSrvActiveGroup.getClonedField());
        cloneObj.arePhysicalFilesOverGroup100 = new ArePhysicalFilesOverGroup100();
        cloneObj.arePhysicalFilesOverGroup100.set(arePhysicalFilesOverGroup100.getClonedField());
        cloneObj.sys201ErrMsgOut = new Sys201ErrMsgOut();
        cloneObj.sys201ErrMsgOut.set(sys201ErrMsgOut.getClonedField());
        cloneObj.ip08101RunControlRecord = new Ip08101RunControlRecord();
        cloneObj.ip08101RunControlRecord.set(ip08101RunControlRecord.getClonedField());
        cloneObj.ip70301IsCemresMqSrvActveGroup = new Ip70301IsCemresMqSrvActveGroup();
        cloneObj.ip70301IsCemresMqSrvActveGroup.set(ip70301IsCemresMqSrvActveGroup.getClonedField());
        cloneObj.ip70301QrRfndMqSrvActiveGroup = new Ip70301QrRfndMqSrvActiveGroup();
        cloneObj.ip70301QrRfndMqSrvActiveGroup.set(ip70301QrRfndMqSrvActiveGroup.getClonedField());
        cloneObj.ip50005ClearingDtTm = new Ip50005ClearingDtTm();
        cloneObj.ip50005ClearingDtTm.set(ip50005ClearingDtTm.getClonedField());
        cloneObj.ip82921ErrMsgOut = new Ip82921ErrMsgOut();
        cloneObj.ip82921ErrMsgOut.set(ip82921ErrMsgOut.getClonedField());
        cloneObj.ip70301PimAmsMqSrvActiveGroup = new Ip70301PimAmsMqSrvActiveGroup();
        cloneObj.ip70301PimAmsMqSrvActiveGroup.set(ip70301PimAmsMqSrvActiveGroup.getClonedField());
        cloneObj.parms1000 = new Parms1000();
        cloneObj.parms1000.set(parms1000.getClonedField());
        cloneObj.ip70301PimIndMqSrvActiveGroup = new Ip70301PimIndMqSrvActiveGroup();
        cloneObj.ip70301PimIndMqSrvActiveGroup.set(ip70301PimIndMqSrvActiveGroup.getClonedField());
        cloneObj.ip70301IsItCallFromWlmGroup = new Ip70301IsItCallFromWlmGroup();
        cloneObj.ip70301IsItCallFromWlmGroup.set(ip70301IsItCallFromWlmGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.ip70301IsCemreqMqSrvActveGroup = new Ip70301IsCemreqMqSrvActveGroup();
        cloneObj.ip70301IsCemreqMqSrvActveGroup.set(ip70301IsCemreqMqSrvActveGroup.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.ip64801LrmCommBlock = new Ip64801LrmCommBlock();
        cloneObj.ip64801LrmCommBlock.set(ip64801LrmCommBlock.getClonedField());
        cloneObj.ip30781TipaccdTable = new Ip30781TipaccdTable();
        cloneObj.ip30781TipaccdTable.set(ip30781TipaccdTable.getClonedField());
        cloneObj.ip70301OrigMsgLenGroup = new Ip70301OrigMsgLenGroup();
        cloneObj.ip70301OrigMsgLenGroup.set(ip70301OrigMsgLenGroup.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        cloneObj.mqgetFailCnt612 = new MqgetFailCnt612();
        cloneObj.mqgetFailCnt612.set(mqgetFailCnt612.getClonedField());
        cloneObj.ip70301CemnspkMqSrvActiveGroup = new Ip70301CemnspkMqSrvActiveGroup();
        cloneObj.ip70301CemnspkMqSrvActiveGroup.set(ip70301CemnspkMqSrvActiveGroup.getClonedField());
        cloneObj.ip70301MpAchMqSrvActiveGroup = new Ip70301MpAchMqSrvActiveGroup();
        cloneObj.ip70301MpAchMqSrvActiveGroup.set(ip70301MpAchMqSrvActiveGroup.getClonedField());
        cloneObj.ip70301PmiIndMqSrvActiveGroup = new Ip70301PmiIndMqSrvActiveGroup();
        cloneObj.ip70301PmiIndMqSrvActiveGroup.set(ip70301PmiIndMqSrvActiveGroup.getClonedField());
        cloneObj.faaFacNotFndCnt614 = new FaaFacNotFndCnt614();
        cloneObj.faaFacNotFndCnt614.set(faaFacNotFndCnt614.getClonedField());
        cloneObj.ip70511EntryFoundGroup = new Ip70511EntryFoundGroup();
        cloneObj.ip70511EntryFoundGroup.set(ip70511EntryFoundGroup.getClonedField());
        cloneObj.ip57901Tipaqpr = new Ip57901Tipaqpr();
        cloneObj.ip57901Tipaqpr.set(ip57901Tipaqpr.getClonedField());
        cloneObj.fraudMqDebugDisp600 = new FraudMqDebugDisp600();
        cloneObj.fraudMqDebugDisp600.set(fraudMqDebugDisp600.getClonedField());
        cloneObj.errorMsg6003010 = new ErrorMsg6003010();
        cloneObj.errorMsg6003010.set(errorMsg6003010.getClonedField());
        cloneObj.ip70301PmtIdnMqSrvActiveGroup = new Ip70301PmtIdnMqSrvActiveGroup();
        cloneObj.ip70301PmtIdnMqSrvActiveGroup.set(ip70301PmtIdnMqSrvActiveGroup.getClonedField());
        cloneObj.linkVariable800 = new LinkVariable800();
        cloneObj.linkVariable800.set(linkVariable800.getClonedField());
        cloneObj.getBrowseCallsGroup100 = new GetBrowseCallsGroup100();
        cloneObj.getBrowseCallsGroup100.set(getBrowseCallsGroup100.getClonedField());
        cloneObj.errorMsg6003011 = new ErrorMsg6003011();
        cloneObj.errorMsg6003011.set(errorMsg6003011.getClonedField());
        cloneObj.mrsRowCnt608 = new MrsRowCnt608();
        cloneObj.mrsRowCnt608.set(mrsRowCnt608.getClonedField());
        cloneObj.ip70301PimIdnMqSrvActiveGroup = new Ip70301PimIdnMqSrvActiveGroup();
        cloneObj.ip70301PimIdnMqSrvActiveGroup.set(ip70301PimIdnMqSrvActiveGroup.getClonedField());
        cloneObj.errorMsg6003012 = new ErrorMsg6003012();
        cloneObj.errorMsg6003012.set(errorMsg6003012.getClonedField());
        cloneObj.ip70301LnCommitCntGroup = new Ip70301LnCommitCntGroup();
        cloneObj.ip70301LnCommitCntGroup.set(ip70301LnCommitCntGroup.getClonedField());
        cloneObj.ip70301AlmPreMqSrvActiveGroup = new Ip70301AlmPreMqSrvActiveGroup();
        cloneObj.ip70301AlmPreMqSrvActiveGroup.set(ip70301AlmPreMqSrvActiveGroup.getClonedField());
        cloneObj.ip70301FastpayMqSrvActiveGroup = new Ip70301FastpayMqSrvActiveGroup();
        cloneObj.ip70301FastpayMqSrvActiveGroup.set(ip70301FastpayMqSrvActiveGroup.getClonedField());
        cloneObj.mqputSkipCnt610 = new MqputSkipCnt610();
        cloneObj.mqputSkipCnt610.set(mqputSkipCnt610.getClonedField());
        cloneObj.ip70301PmiIdnMqSrvActiveGroup = new Ip70301PmiIdnMqSrvActiveGroup();
        cloneObj.ip70301PmiIdnMqSrvActiveGroup.set(ip70301PmiIdnMqSrvActiveGroup.getClonedField());
        cloneObj.ip70301AlmChaMqSrvActiveGroup = new Ip70301AlmChaMqSrvActiveGroup();
        cloneObj.ip70301AlmChaMqSrvActiveGroup.set(ip70301AlmChaMqSrvActiveGroup.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.ip70301CemauthMqSrvActiveGroup = new Ip70301CemauthMqSrvActiveGroup();
        cloneObj.ip70301CemauthMqSrvActiveGroup.set(ip70301CemauthMqSrvActiveGroup.getClonedField());
        cloneObj.ip89011EnvironmentIndArea = new Ip89011EnvironmentIndArea();
        cloneObj.ip89011EnvironmentIndArea.set(ip89011EnvironmentIndArea.getClonedField());
        cloneObj.checkCloseQueueGroup100 = new CheckCloseQueueGroup100();
        cloneObj.checkCloseQueueGroup100.set(checkCloseQueueGroup100.getClonedField());
        cloneObj.ip7051f4Table = new Ip7051f4Table();
        cloneObj.ip7051f4Table.set(ip7051f4Table.getClonedField());
        cloneObj.ip7052f4MqApiLayout = new Ip7052f4MqApiLayout();
        cloneObj.ip7052f4MqApiLayout.set(ip7052f4MqApiLayout.getClonedField());
        cloneObj.queueVars800 = new QueueVars800();
        cloneObj.queueVars800.set(queueVars800.getClonedField());
        cloneObj.ip70711TipamrsEntries = new Ip70711TipamrsEntries();
        cloneObj.ip70711TipamrsEntries.set(ip70711TipamrsEntries.getClonedField());
        cloneObj.mqputFailCnt613 = new MqputFailCnt613();
        cloneObj.mqputFailCnt613.set(mqputFailCnt613.getClonedField());
        cloneObj.ip70301PmaRusMqSrvActiveGroup = new Ip70301PmaRusMqSrvActiveGroup();
        cloneObj.ip70301PmaRusMqSrvActiveGroup.set(ip70301PmaRusMqSrvActiveGroup.getClonedField());
        cloneObj.fnsPayload = new FnsPayload();
        cloneObj.fnsPayload.set(fnsPayload.getClonedField());
        cloneObj.ip70301InstallMqSrvActiveGroup = new Ip70301InstallMqSrvActiveGroup();
        cloneObj.ip70301InstallMqSrvActiveGroup.set(ip70301InstallMqSrvActiveGroup.getClonedField());
        cloneObj.fnsPldRd = new FnsPldRd();
        cloneObj.fnsPldRd.set(fnsPldRd.getClonedField());
        cloneObj.ip70301IsMqReqSentSwGroup = new Ip70301IsMqReqSentSwGroup();
        cloneObj.ip70301IsMqReqSentSwGroup.set(ip70301IsMqReqSentSwGroup.getClonedField());
        cloneObj.ip70511Table = new Ip70511Table();
        cloneObj.ip70511Table.set(ip70511Table.getClonedField());
        cloneObj.ip70301PmtRusMqSrvActiveGroup = new Ip70301PmtRusMqSrvActiveGroup();
        cloneObj.ip70301PmtRusMqSrvActiveGroup.set(ip70301PmtRusMqSrvActiveGroup.getClonedField());
        cloneObj.ip50201Tipafaa = new Ip50201Tipafaa();
        cloneObj.ip50201Tipafaa.set(ip50201Tipafaa.getClonedField());
        cloneObj.ip70301PmtIndMqSrvActiveGroup = new Ip70301PmtIndMqSrvActiveGroup();
        cloneObj.ip70301PmtIndMqSrvActiveGroup.set(ip70301PmtIndMqSrvActiveGroup.getClonedField());
        cloneObj.checkGetQueueGroup100 = new CheckGetQueueGroup100();
        cloneObj.checkGetQueueGroup100.set(checkGetQueueGroup100.getClonedField());
        cloneObj.ip996021JobInformation = new Ip996021JobInformation();
        cloneObj.ip996021JobInformation.set(ip996021JobInformation.getClonedField());
        cloneObj.checkPutQueueGroup100 = new CheckPutQueueGroup100();
        cloneObj.checkPutQueueGroup100.set(checkPutQueueGroup100.getClonedField());
        cloneObj.ip70301PmaIndMqSrvActiveGroup = new Ip70301PmaIndMqSrvActiveGroup();
        cloneObj.ip70301PmaIndMqSrvActiveGroup.set(ip70301PmaIndMqSrvActiveGroup.getClonedField());
        cloneObj.ip34051MqProcessParameters = new Ip34051MqProcessParameters();
        cloneObj.ip34051MqProcessParameters.set(ip34051MqProcessParameters.getClonedField());
        cloneObj.ip70301PmiAmsMqSrvActiveGroup = new Ip70301PmiAmsMqSrvActiveGroup();
        cloneObj.ip70301PmiAmsMqSrvActiveGroup.set(ip70301PmiAmsMqSrvActiveGroup.getClonedField());
        cloneObj.ip70301IsFraudMqSrvActiveGroup = new Ip70301IsFraudMqSrvActiveGroup();
        cloneObj.ip70301IsFraudMqSrvActiveGroup.set(ip70301IsFraudMqSrvActiveGroup.getClonedField());
        cloneObj.ip70301LnCloneOwnerIdGroup = new Ip70301LnCloneOwnerIdGroup();
        cloneObj.ip70301LnCloneOwnerIdGroup.set(ip70301LnCloneOwnerIdGroup.getClonedField());
        cloneObj.ip70301AlmRspMqSrvActiveGroup = new Ip70301AlmRspMqSrvActiveGroup();
        cloneObj.ip70301AlmRspMqSrvActiveGroup.set(ip70301AlmRspMqSrvActiveGroup.getClonedField());
        cloneObj.tipamrsSkipCnt611 = new TipamrsSkipCnt611();
        cloneObj.tipamrsSkipCnt611.set(tipamrsSkipCnt611.getClonedField());
        cloneObj.ip70301PmaIdnMqSrvActiveGroup = new Ip70301PmaIdnMqSrvActiveGroup();
        cloneObj.ip70301PmaIdnMqSrvActiveGroup.set(ip70301PmaIdnMqSrvActiveGroup.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Parms1000 parms1000 = Ip829010Ctx.this.getParms1000();


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += parms1000.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.parms1000 = new Parms1000();
        cloneObj.parms1000.set(parms1000.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class MainlineInCtx implements Cloneable {
     Ip64801LrmCommBlock ip64801LrmCommBlock = Ip829010Ctx.this.getIp64801LrmCommBlock();

	/**
	 *	Test condition "END" for isIp6480188LrmStatEnd()
	 *	@return  Returns true if isIp6480188LrmStatEnd() is "END"
	 */
   public boolean isIp6480188LrmStatEnd() throws CFException {
      return ip64801LrmCommBlock.isIp6480188LrmStatEnd();
   }

	/**
	*  set values "END"
	*/
   	public void setIp6480188LrmStatEndTrue()  throws CFException{  			
    	ip64801LrmCommBlock.setIp6480188LrmStatEndTrue();
   	}

        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip64801LrmCommBlock.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.ip64801LrmCommBlock = new Ip64801LrmCommBlock();
        cloneObj.ip64801LrmCommBlock.set(ip64801LrmCommBlock.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class PerformInitializationInCtx implements Cloneable {
     Work work = Ip829010Ctx.this.getWork();

	/**
	 *	Test condition "Y" for isItIsFirstTime88100()
	 *	@return  Returns true if isItIsFirstTime88100() is "Y"
	 */
   public boolean isItIsFirstTime88100() throws CFException {
      return work.isItIsFirstTime88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsFirstTime88100True()  throws CFException{  			
    	work.setItIsFirstTime88100True();
   	}

        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public PerformInitializationOutCtx getPerformInitializationOutCtx() {
            return new PerformInitializationOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
       return str.hashCode();
    }

    public PerformInitializationInCtx clone() {
        PerformInitializationInCtx cloneObj = new PerformInitializationInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public PerformInitializationInCtx getPerformInitializationInCtx() {
            return new PerformInitializationInCtx();
    }
     public class PerformInitializationOutCtx implements Cloneable {
     Work work = Ip829010Ctx.this.getWork();

	/**
	 *	Test condition "N" for isItIsNotFirstTime88100()
	 *	@return  Returns true if isItIsNotFirstTime88100() is "N"
	 */
   public boolean isItIsNotFirstTime88100() throws CFException {
      return work.isItIsNotFirstTime88100();
   }

	/**
	*  set values "N"
	*/
   	public void setItIsNotFirstTime88100True()  throws CFException{  			
    	work.setItIsNotFirstTime88100True();
   	}

        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
       return str.hashCode();
    }

    public PerformInitializationOutCtx clone() {
        PerformInitializationOutCtx cloneObj = new PerformInitializationOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public PerformInitializationOutCtx getPerformInitializationOutCtx() {
            return new PerformInitializationOutCtx();
    }
     public class DisplayExecMsgsInCtx implements Cloneable {
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = Ip829010Ctx.this.getIp996011ProgramStartMessage();
     Work work = Ip829010Ctx.this.getWork();

	/**
	 *	Returns the value of pgmIp829010300
	 *	@return pgmIp829010300
	 */
   public char[] getPgmIp829010300() throws CFException  {              
   		return work.getPgmIp829010300();
   }

  
	/**
	*  set variable pgmIp829010300
	*  @param value
	**/
   public void setPgmIp829010300(char[] value) throws CFException {
      work.setPgmIp829010300(value);
   } 

	/**
	 *	Returns the value of pgmVersion300
	 *	@return pgmVersion300
	 */
   public char[] getPgmVersion300() throws CFException  {              
   		return work.getPgmVersion300();
   }

  
	/**
	*  set variable pgmVersion300
	*  @param value
	**/
   public void setPgmVersion300(char[] value) throws CFException {
      work.setPgmVersion300(value);
   } 

	/**
	 *	Returns the value of pgmIp996010300
	 *	@return pgmIp996010300
	 */
   public char[] getPgmIp996010300() throws CFException  {              
   		return work.getPgmIp996010300();
   }

  
	/**
	*  set variable pgmIp996010300
	*  @param value
	**/
   public void setPgmIp996010300(char[] value) throws CFException {
      work.setPgmIp996010300(value);
   } 


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public DisplayExecMsgsOutCtx getDisplayExecMsgsOutCtx() {
            return new DisplayExecMsgsOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip996011ProgramStartMessage.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DisplayExecMsgsInCtx clone() {
        DisplayExecMsgsInCtx cloneObj = new DisplayExecMsgsInCtx();
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayExecMsgsInCtx getDisplayExecMsgsInCtx() {
            return new DisplayExecMsgsInCtx();
    }
     public class DisplayExecMsgsOutCtx implements Cloneable {
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = Ip829010Ctx.this.getIp996011ProgramStartMessage();
     Work work = Ip829010Ctx.this.getWork();

	/**
	 *	Returns the value of ip996011PgmVersion
	 *	@return ip996011PgmVersion
	 */
   public char[] getIp996011PgmVersion() throws CFException  {              
   		return ip996011ProgramStartMessage.getIp996011PgmVersion();
   }

  
	/**
	*  set variable ip996011PgmVersion
	*  @param value
	**/
   public void setIp996011PgmVersion(char[] value) throws CFException {
      ip996011ProgramStartMessage.setIp996011PgmVersion(value);
   } 

     /**
	 * 	Update Ip996011PgmVersion 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996011PgmVersion(char[] source, int sourceIndex) throws CFException {
      ip996011ProgramStartMessage.setIp996011PgmVersion(source, sourceIndex);
   	
   }
   
   public void setIp996011PgmVersion(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip996011ProgramStartMessage.setIp996011PgmVersion(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip996011PgmVersion 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996011PgmVersion(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996011ProgramStartMessage.setIp996011PgmVersion(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip996011PgmVersion with another Field
	 *	@param value
	 */
   public void setIp996011PgmVersion(Field source) {
      ip996011ProgramStartMessage.setIp996011PgmVersion(source);
   }  
   
     /**
	 * 	Update Ip996011PgmVersion 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996011PgmVersion(Field source, int sourceIndex,int sourceLen) {
      ip996011ProgramStartMessage.setIp996011PgmVersion(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip996011PgmVersion 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996011PgmVersion(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996011ProgramStartMessage.setIp996011PgmVersion(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pgmIp829010300
	 *	@return pgmIp829010300
	 */
   public char[] getPgmIp829010300() throws CFException  {              
   		return work.getPgmIp829010300();
   }

  
	/**
	*  set variable pgmIp829010300
	*  @param value
	**/
   public void setPgmIp829010300(char[] value) throws CFException {
      work.setPgmIp829010300(value);
   } 

	/**
	 *	Returns the value of ptrIp996010800
	 *	@return ptrIp996010800
	 */
   public char[] getPtrIp996010800() throws CFException  {              
   		return work.getPtrIp996010800();
   }

  
	/**
	*  set variable ptrIp996010800
	*  @param value
	**/
   public void setPtrIp996010800(char[] value) throws CFException {
      work.setPtrIp996010800(value);
   } 

	/**
	 *	Returns the value of ip996011PgmId
	 *	@return ip996011PgmId
	 */
   public char[] getIp996011PgmId() throws CFException  {              
   		return ip996011ProgramStartMessage.getIp996011PgmId();
   }

  
	/**
	*  set variable ip996011PgmId
	*  @param value
	**/
   public void setIp996011PgmId(char[] value) throws CFException {
      ip996011ProgramStartMessage.setIp996011PgmId(value);
   } 

     /**
	 * 	Update Ip996011PgmId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996011PgmId(char[] source, int sourceIndex) throws CFException {
      ip996011ProgramStartMessage.setIp996011PgmId(source, sourceIndex);
   	
   }
   
   public void setIp996011PgmId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip996011ProgramStartMessage.setIp996011PgmId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip996011PgmId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996011PgmId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996011ProgramStartMessage.setIp996011PgmId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip996011PgmId with another Field
	 *	@param value
	 */
   public void setIp996011PgmId(Field source) {
      ip996011ProgramStartMessage.setIp996011PgmId(source);
   }  
   
     /**
	 * 	Update Ip996011PgmId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996011PgmId(Field source, int sourceIndex,int sourceLen) {
      ip996011ProgramStartMessage.setIp996011PgmId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip996011PgmId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996011PgmId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996011ProgramStartMessage.setIp996011PgmId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip996011WhenCompiled
	 *	@return ip996011WhenCompiled
	 */
   public char[] getIp996011WhenCompiled() throws CFException  {              
   		return ip996011ProgramStartMessage.getIp996011WhenCompiled();
   }

  
	/**
	*  set variable ip996011WhenCompiled
	*  @param value
	**/
   public void setIp996011WhenCompiled(char[] value) throws CFException {
      ip996011ProgramStartMessage.setIp996011WhenCompiled(value);
   } 

     /**
	 * 	Update Ip996011WhenCompiled 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996011WhenCompiled(char[] source, int sourceIndex) throws CFException {
      ip996011ProgramStartMessage.setIp996011WhenCompiled(source, sourceIndex);
   	
   }
   
   public void setIp996011WhenCompiled(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip996011ProgramStartMessage.setIp996011WhenCompiled(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip996011WhenCompiled 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996011WhenCompiled(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996011ProgramStartMessage.setIp996011WhenCompiled(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip996011WhenCompiled with another Field
	 *	@param value
	 */
   public void setIp996011WhenCompiled(Field source) {
      ip996011ProgramStartMessage.setIp996011WhenCompiled(source);
   }  
   
     /**
	 * 	Update Ip996011WhenCompiled 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996011WhenCompiled(Field source, int sourceIndex,int sourceLen) {
      ip996011ProgramStartMessage.setIp996011WhenCompiled(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip996011WhenCompiled 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996011WhenCompiled(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996011ProgramStartMessage.setIp996011WhenCompiled(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pgmVersion300
	 *	@return pgmVersion300
	 */
   public char[] getPgmVersion300() throws CFException  {              
   		return work.getPgmVersion300();
   }

  
	/**
	*  set variable pgmVersion300
	*  @param value
	**/
   public void setPgmVersion300(char[] value) throws CFException {
      work.setPgmVersion300(value);
   } 


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip996011ProgramStartMessage.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DisplayExecMsgsOutCtx clone() {
        DisplayExecMsgsOutCtx cloneObj = new DisplayExecMsgsOutCtx();
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayExecMsgsOutCtx getDisplayExecMsgsOutCtx() {
            return new DisplayExecMsgsOutCtx();
    }
     public class SetProcedurePointersInCtx implements Cloneable {
     Work work = Ip829010Ctx.this.getWork();

	/**
	 *	Returns the value of pgmIp599810300
	 *	@return pgmIp599810300
	 */
   public char[] getPgmIp599810300() throws CFException  {              
   		return work.getPgmIp599810300();
   }

  
	/**
	*  set variable pgmIp599810300
	*  @param value
	**/
   public void setPgmIp599810300(char[] value) throws CFException {
      work.setPgmIp599810300(value);
   } 

	/**
	 *	Returns the value of pgmIp595210300
	 *	@return pgmIp595210300
	 */
   public char[] getPgmIp595210300() throws CFException  {              
   		return work.getPgmIp595210300();
   }

  
	/**
	*  set variable pgmIp595210300
	*  @param value
	**/
   public void setPgmIp595210300(char[] value) throws CFException {
      work.setPgmIp595210300(value);
   } 

	/**
	 *	Returns the value of pgmIp708020300
	 *	@return pgmIp708020300
	 */
   public char[] getPgmIp708020300() throws CFException  {              
   		return work.getPgmIp708020300();
   }

  
	/**
	*  set variable pgmIp708020300
	*  @param value
	**/
   public void setPgmIp708020300(char[] value) throws CFException {
      work.setPgmIp708020300(value);
   } 

	/**
	 *	Returns the value of pgmIp708010300
	 *	@return pgmIp708010300
	 */
   public char[] getPgmIp708010300() throws CFException  {              
   		return work.getPgmIp708010300();
   }

  
	/**
	*  set variable pgmIp708010300
	*  @param value
	**/
   public void setPgmIp708010300(char[] value) throws CFException {
      work.setPgmIp708010300(value);
   } 

	/**
	 *	Returns the value of pgmIp703020300
	 *	@return pgmIp703020300
	 */
   public char[] getPgmIp703020300() throws CFException  {              
   		return work.getPgmIp703020300();
   }

  
	/**
	*  set variable pgmIp703020300
	*  @param value
	**/
   public void setPgmIp703020300(char[] value) throws CFException {
      work.setPgmIp703020300(value);
   } 

	/**
	 *	Returns the value of pgmIp996010300
	 *	@return pgmIp996010300
	 */
   public char[] getPgmIp996010300() throws CFException  {              
   		return work.getPgmIp996010300();
   }

  
	/**
	*  set variable pgmIp996010300
	*  @param value
	**/
   public void setPgmIp996010300(char[] value) throws CFException {
      work.setPgmIp996010300(value);
   } 

	/**
	 *	Returns the value of pgmIp521010300
	 *	@return pgmIp521010300
	 */
   public char[] getPgmIp521010300() throws CFException  {              
   		return work.getPgmIp521010300();
   }

  
	/**
	*  set variable pgmIp521010300
	*  @param value
	**/
   public void setPgmIp521010300(char[] value) throws CFException {
      work.setPgmIp521010300(value);
   } 

	/**
	 *	Returns the value of pgmIp648010300
	 *	@return pgmIp648010300
	 */
   public char[] getPgmIp648010300() throws CFException  {              
   		return work.getPgmIp648010300();
   }

  
	/**
	*  set variable pgmIp648010300
	*  @param value
	**/
   public void setPgmIp648010300(char[] value) throws CFException {
      work.setPgmIp648010300(value);
   } 

	/**
	 *	Returns the value of pgmIp081110300
	 *	@return pgmIp081110300
	 */
   public char[] getPgmIp081110300() throws CFException  {              
   		return work.getPgmIp081110300();
   }

  
	/**
	*  set variable pgmIp081110300
	*  @param value
	**/
   public void setPgmIp081110300(char[] value) throws CFException {
      work.setPgmIp081110300(value);
   } 

	/**
	 *	Returns the value of pgmIp996020300
	 *	@return pgmIp996020300
	 */
   public char[] getPgmIp996020300() throws CFException  {              
   		return work.getPgmIp996020300();
   }

  
	/**
	*  set variable pgmIp996020300
	*  @param value
	**/
   public void setPgmIp996020300(char[] value) throws CFException {
      work.setPgmIp996020300(value);
   } 

	/**
	 *	Returns the value of abendPgm300
	 *	@return abendPgm300
	 */
   public char[] getAbendPgm300() throws CFException  {              
   		return work.getAbendPgm300();
   }

  
	/**
	*  set variable abendPgm300
	*  @param value
	**/
   public void setAbendPgm300(char[] value) throws CFException {
      work.setAbendPgm300(value);
   } 

	/**
	 *	Returns the value of pgmIp890110300
	 *	@return pgmIp890110300
	 */
   public char[] getPgmIp890110300() throws CFException  {              
   		return work.getPgmIp890110300();
   }

  
	/**
	*  set variable pgmIp890110300
	*  @param value
	**/
   public void setPgmIp890110300(char[] value) throws CFException {
      work.setPgmIp890110300(value);
   } 

	/**
	 *	Returns the value of pgmIp282210300
	 *	@return pgmIp282210300
	 */
   public char[] getPgmIp282210300() throws CFException  {              
   		return work.getPgmIp282210300();
   }

  
	/**
	*  set variable pgmIp282210300
	*  @param value
	**/
   public void setPgmIp282210300(char[] value) throws CFException {
      work.setPgmIp282210300(value);
   } 

	/**
	 *	Returns the value of pgmIp586010300
	 *	@return pgmIp586010300
	 */
   public char[] getPgmIp586010300() throws CFException  {              
   		return work.getPgmIp586010300();
   }

  
	/**
	*  set variable pgmIp586010300
	*  @param value
	**/
   public void setPgmIp586010300(char[] value) throws CFException {
      work.setPgmIp586010300(value);
   } 


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public SetProcedurePointersOutCtx getSetProcedurePointersOutCtx() {
            return new SetProcedurePointersOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
       return str.hashCode();
    }

    public SetProcedurePointersInCtx clone() {
        SetProcedurePointersInCtx cloneObj = new SetProcedurePointersInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SetProcedurePointersInCtx getSetProcedurePointersInCtx() {
            return new SetProcedurePointersInCtx();
    }
     public class SetProcedurePointersOutCtx implements Cloneable {
     Work work = Ip829010Ctx.this.getWork();

	/**
	 *	Returns the value of ptrIp890110800
	 *	@return ptrIp890110800
	 */
   public char[] getPtrIp890110800() throws CFException  {              
   		return work.getPtrIp890110800();
   }

  
	/**
	*  set variable ptrIp890110800
	*  @param value
	**/
   public void setPtrIp890110800(char[] value) throws CFException {
      work.setPtrIp890110800(value);
   } 

	/**
	 *	Returns the value of ptrIp599810800
	 *	@return ptrIp599810800
	 */
   public char[] getPtrIp599810800() throws CFException  {              
   		return work.getPtrIp599810800();
   }

  
	/**
	*  set variable ptrIp599810800
	*  @param value
	**/
   public void setPtrIp599810800(char[] value) throws CFException {
      work.setPtrIp599810800(value);
   } 

	/**
	 *	Returns the value of ptrIp595210800
	 *	@return ptrIp595210800
	 */
   public char[] getPtrIp595210800() throws CFException  {              
   		return work.getPtrIp595210800();
   }

  
	/**
	*  set variable ptrIp595210800
	*  @param value
	**/
   public void setPtrIp595210800(char[] value) throws CFException {
      work.setPtrIp595210800(value);
   } 

	/**
	 *	Returns the value of ptrIp708020800
	 *	@return ptrIp708020800
	 */
   public char[] getPtrIp708020800() throws CFException  {              
   		return work.getPtrIp708020800();
   }

  
	/**
	*  set variable ptrIp708020800
	*  @param value
	**/
   public void setPtrIp708020800(char[] value) throws CFException {
      work.setPtrIp708020800(value);
   } 

	/**
	 *	Returns the value of ptrIp708010800
	 *	@return ptrIp708010800
	 */
   public char[] getPtrIp708010800() throws CFException  {              
   		return work.getPtrIp708010800();
   }

  
	/**
	*  set variable ptrIp708010800
	*  @param value
	**/
   public void setPtrIp708010800(char[] value) throws CFException {
      work.setPtrIp708010800(value);
   } 

	/**
	 *	Returns the value of ptrIp282210800
	 *	@return ptrIp282210800
	 */
   public char[] getPtrIp282210800() throws CFException  {              
   		return work.getPtrIp282210800();
   }

  
	/**
	*  set variable ptrIp282210800
	*  @param value
	**/
   public void setPtrIp282210800(char[] value) throws CFException {
      work.setPtrIp282210800(value);
   } 

	/**
	 *	Returns the value of abendPtr800
	 *	@return abendPtr800
	 */
   public char[] getAbendPtr800() throws CFException  {              
   		return work.getAbendPtr800();
   }

  
	/**
	*  set variable abendPtr800
	*  @param value
	**/
   public void setAbendPtr800(char[] value) throws CFException {
      work.setAbendPtr800(value);
   } 

	/**
	 *	Returns the value of ptrIp996020800
	 *	@return ptrIp996020800
	 */
   public char[] getPtrIp996020800() throws CFException  {              
   		return work.getPtrIp996020800();
   }

  
	/**
	*  set variable ptrIp996020800
	*  @param value
	**/
   public void setPtrIp996020800(char[] value) throws CFException {
      work.setPtrIp996020800(value);
   } 

	/**
	 *	Returns the value of ptrIp521010800
	 *	@return ptrIp521010800
	 */
   public char[] getPtrIp521010800() throws CFException  {              
   		return work.getPtrIp521010800();
   }

  
	/**
	*  set variable ptrIp521010800
	*  @param value
	**/
   public void setPtrIp521010800(char[] value) throws CFException {
      work.setPtrIp521010800(value);
   } 

	/**
	 *	Returns the value of ptrIp081110800
	 *	@return ptrIp081110800
	 */
   public char[] getPtrIp081110800() throws CFException  {              
   		return work.getPtrIp081110800();
   }

  
	/**
	*  set variable ptrIp081110800
	*  @param value
	**/
   public void setPtrIp081110800(char[] value) throws CFException {
      work.setPtrIp081110800(value);
   } 

	/**
	 *	Returns the value of ptrIp703020800
	 *	@return ptrIp703020800
	 */
   public char[] getPtrIp703020800() throws CFException  {              
   		return work.getPtrIp703020800();
   }

  
	/**
	*  set variable ptrIp703020800
	*  @param value
	**/
   public void setPtrIp703020800(char[] value) throws CFException {
      work.setPtrIp703020800(value);
   } 

	/**
	 *	Returns the value of ptrIp586010800
	 *	@return ptrIp586010800
	 */
   public char[] getPtrIp586010800() throws CFException  {              
   		return work.getPtrIp586010800();
   }

  
	/**
	*  set variable ptrIp586010800
	*  @param value
	**/
   public void setPtrIp586010800(char[] value) throws CFException {
      work.setPtrIp586010800(value);
   } 

	/**
	 *	Returns the value of ptrIp648010800
	 *	@return ptrIp648010800
	 */
   public char[] getPtrIp648010800() throws CFException  {              
   		return work.getPtrIp648010800();
   }

  
	/**
	*  set variable ptrIp648010800
	*  @param value
	**/
   public void setPtrIp648010800(char[] value) throws CFException {
      work.setPtrIp648010800(value);
   } 

	/**
	 *	Returns the value of ptrIp996010800
	 *	@return ptrIp996010800
	 */
   public char[] getPtrIp996010800() throws CFException  {              
   		return work.getPtrIp996010800();
   }

  
	/**
	*  set variable ptrIp996010800
	*  @param value
	**/
   public void setPtrIp996010800(char[] value) throws CFException {
      work.setPtrIp996010800(value);
   } 


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
       return str.hashCode();
    }

    public SetProcedurePointersOutCtx clone() {
        SetProcedurePointersOutCtx cloneObj = new SetProcedurePointersOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SetProcedurePointersOutCtx getSetProcedurePointersOutCtx() {
            return new SetProcedurePointersOutCtx();
    }
     public class InitializeVariablesInCtx implements Cloneable {
     Ip996021JobInformation ip996021JobInformation = Ip829010Ctx.this.getIp996021JobInformation();
     Ip70711TipamrsEntries ip70711TipamrsEntries = Ip829010Ctx.this.getIp70711TipamrsEntries();
     Ip70301IsFraudMqSrvActiveGroup ip70301IsFraudMqSrvActiveGroup = Ip829010Ctx.this.getIp70301IsFraudMqSrvActiveGroup();
     Ip70511Table ip70511Table = Ip829010Ctx.this.getIp70511Table();
     Work work = Ip829010Ctx.this.getWork();

	/**
	 *	Returns the value of ip996021JobName
	 *	@return ip996021JobName
	 */
   public char[] getIp996021JobName() throws CFException  {              
   		return ip996021JobInformation.getIp996021JobName();
   }

  
	/**
	*  set variable ip996021JobName
	*  @param value
	**/
   public void setIp996021JobName(char[] value) throws CFException {
      ip996021JobInformation.setIp996021JobName(value);
   } 

     /**
	 * 	Update Ip996021JobName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996021JobName(char[] source, int sourceIndex) throws CFException {
      ip996021JobInformation.setIp996021JobName(source, sourceIndex);
   	
   }
   
   public void setIp996021JobName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip996021JobInformation.setIp996021JobName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip996021JobName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996021JobName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996021JobInformation.setIp996021JobName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip996021JobName with another Field
	 *	@param value
	 */
   public void setIp996021JobName(Field source) {
      ip996021JobInformation.setIp996021JobName(source);
   }  
   
     /**
	 * 	Update Ip996021JobName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996021JobName(Field source, int sourceIndex,int sourceLen) {
      ip996021JobInformation.setIp996021JobName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip996021JobName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996021JobName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996021JobInformation.setIp996021JobName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ptrIp996020800
	 *	@return ptrIp996020800
	 */
   public char[] getPtrIp996020800() throws CFException  {              
   		return work.getPtrIp996020800();
   }

  
	/**
	*  set variable ptrIp996020800
	*  @param value
	**/
   public void setPtrIp996020800(char[] value) throws CFException {
      work.setPtrIp996020800(value);
   } 

	/**
	 *	Returns the value of ip996021LparName
	 *	@return ip996021LparName
	 */
   public char[] getIp996021LparName() throws CFException  {              
   		return ip996021JobInformation.getIp996021LparName();
   }

  
	/**
	*  set variable ip996021LparName
	*  @param value
	**/
   public void setIp996021LparName(char[] value) throws CFException {
      ip996021JobInformation.setIp996021LparName(value);
   } 

     /**
	 * 	Update Ip996021LparName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996021LparName(char[] source, int sourceIndex) throws CFException {
      ip996021JobInformation.setIp996021LparName(source, sourceIndex);
   	
   }
   
   public void setIp996021LparName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip996021JobInformation.setIp996021LparName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip996021LparName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996021LparName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996021JobInformation.setIp996021LparName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip996021LparName with another Field
	 *	@param value
	 */
   public void setIp996021LparName(Field source) {
      ip996021JobInformation.setIp996021LparName(source);
   }  
   
     /**
	 * 	Update Ip996021LparName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996021LparName(Field source, int sourceIndex,int sourceLen) {
      ip996021JobInformation.setIp996021LparName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip996021LparName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996021LparName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996021JobInformation.setIp996021LparName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public InitializeVariablesOutCtx getInitializeVariablesOutCtx() {
            return new InitializeVariablesOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip996021JobInformation.hashCode();
        str += ip70711TipamrsEntries.hashCode();
        str += ip70301IsFraudMqSrvActiveGroup.hashCode();
        str += ip70511Table.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public InitializeVariablesInCtx clone() {
        InitializeVariablesInCtx cloneObj = new InitializeVariablesInCtx();
        cloneObj.ip996021JobInformation = new Ip996021JobInformation();
        cloneObj.ip996021JobInformation.set(ip996021JobInformation.getClonedField());
        cloneObj.ip70711TipamrsEntries = new Ip70711TipamrsEntries();
        cloneObj.ip70711TipamrsEntries.set(ip70711TipamrsEntries.getClonedField());
        cloneObj.ip70301IsFraudMqSrvActiveGroup = new Ip70301IsFraudMqSrvActiveGroup();
        cloneObj.ip70301IsFraudMqSrvActiveGroup.set(ip70301IsFraudMqSrvActiveGroup.getClonedField());
        cloneObj.ip70511Table = new Ip70511Table();
        cloneObj.ip70511Table.set(ip70511Table.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InitializeVariablesInCtx getInitializeVariablesInCtx() {
            return new InitializeVariablesInCtx();
    }
     public class InitializeVariablesOutCtx implements Cloneable {
     Ip996021JobInformation ip996021JobInformation = Ip829010Ctx.this.getIp996021JobInformation();
     Ip70711TipamrsEntries ip70711TipamrsEntries = Ip829010Ctx.this.getIp70711TipamrsEntries();
     Ip70301IsFraudMqSrvActiveGroup ip70301IsFraudMqSrvActiveGroup = Ip829010Ctx.this.getIp70301IsFraudMqSrvActiveGroup();
     Ip70511Table ip70511Table = Ip829010Ctx.this.getIp70511Table();
     Work work = Ip829010Ctx.this.getWork();

	/**
	 *	Returns the value of ip996021JobName
	 *	@return ip996021JobName
	 */
   public char[] getIp996021JobName() throws CFException  {              
   		return ip996021JobInformation.getIp996021JobName();
   }

  
	/**
	*  set variable ip996021JobName
	*  @param value
	**/
   public void setIp996021JobName(char[] value) throws CFException {
      ip996021JobInformation.setIp996021JobName(value);
   } 

     /**
	 * 	Update Ip996021JobName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996021JobName(char[] source, int sourceIndex) throws CFException {
      ip996021JobInformation.setIp996021JobName(source, sourceIndex);
   	
   }
   
   public void setIp996021JobName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip996021JobInformation.setIp996021JobName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip996021JobName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996021JobName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996021JobInformation.setIp996021JobName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip996021JobName with another Field
	 *	@param value
	 */
   public void setIp996021JobName(Field source) {
      ip996021JobInformation.setIp996021JobName(source);
   }  
   
     /**
	 * 	Update Ip996021JobName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996021JobName(Field source, int sourceIndex,int sourceLen) {
      ip996021JobInformation.setIp996021JobName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip996021JobName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996021JobName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996021JobInformation.setIp996021JobName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "N" for isIp70301FraudMqActiveN88()
	 *	@return  Returns true if isIp70301FraudMqActiveN88() is "N"
	 */
   public boolean isIp70301FraudMqActiveN88() throws CFException {
      return ip70301IsFraudMqSrvActiveGroup.isIp70301FraudMqActiveN88();
   }

	/**
	*  set values "N"
	*/
   	public void setIp70301FraudMqActiveN88True()  throws CFException{  			
    	ip70301IsFraudMqSrvActiveGroup.setIp70301FraudMqActiveN88True();
   	}
	/**
	 *	Returns the value of ip70711GftDasetNam
	 *	@return ip70711GftDasetNam
	 */
   public char[] getIp70711GftDasetNam() throws CFException  {              
   		return ip70711TipamrsEntries.getIp70711TipamrsKey().getIp70711GftDasetNam();
   }

  
	/**
	*  set variable ip70711GftDasetNam
	*  @param value
	**/
   public void setIp70711GftDasetNam(char[] value) throws CFException {
      ip70711TipamrsEntries.getIp70711TipamrsKey().setIp70711GftDasetNam(value);
   } 

     /**
	 * 	Update Ip70711GftDasetNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70711GftDasetNam(char[] source, int sourceIndex) throws CFException {
      ip70711TipamrsEntries.getIp70711TipamrsKey().setIp70711GftDasetNam(source, sourceIndex);
   	
   }
   
   public void setIp70711GftDasetNam(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70711TipamrsEntries.getIp70711TipamrsKey().setIp70711GftDasetNam(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70711GftDasetNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70711GftDasetNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70711TipamrsEntries.getIp70711TipamrsKey().setIp70711GftDasetNam(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70711GftDasetNam with another Field
	 *	@param value
	 */
   public void setIp70711GftDasetNam(Field source) {
      ip70711TipamrsEntries.getIp70711TipamrsKey().setIp70711GftDasetNam(source);
   }  
   
     /**
	 * 	Update Ip70711GftDasetNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70711GftDasetNam(Field source, int sourceIndex,int sourceLen) {
      ip70711TipamrsEntries.getIp70711TipamrsKey().setIp70711GftDasetNam(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70711GftDasetNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70711GftDasetNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70711TipamrsEntries.getIp70711TipamrsKey().setIp70711GftDasetNam(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of jobname800
	 *	@return jobname800
	 */
   public char[] getJobname800() throws CFException  {              
   		return work.getJobname800();
   }

  
	/**
	*  set variable jobname800
	*  @param value
	**/
   public void setJobname800(char[] value) throws CFException {
      work.setJobname800(value);
   } 

	/**
	 *	Returns the value of tipamrsSkipCount800
	 *	@return tipamrsSkipCount800
	 */
	public int getTipamrsSkipCount800() throws CFException {        
   		return work.getTipamrsSkipCount800();
	}
	
	/**
	 * 	Update TipamrsSkipCount800 with the passed value
	 *	@param number
	 */
	public void setTipamrsSkipCount800(int number)  throws CFException{
		work.setTipamrsSkipCount800(number);
	}


	public void setTipamrsSkipCount800(long number)  throws CFException{
		work.setTipamrsSkipCount800((int)number);
	}


	/**
	 *	Returns the value of mqgetFailCount800
	 *	@return mqgetFailCount800
	 */
	public int getMqgetFailCount800() throws CFException {        
   		return work.getMqgetFailCount800();
	}
	
	/**
	 * 	Update MqgetFailCount800 with the passed value
	 *	@param number
	 */
	public void setMqgetFailCount800(int number)  throws CFException{
		work.setMqgetFailCount800(number);
	}


	public void setMqgetFailCount800(long number)  throws CFException{
		work.setMqgetFailCount800((int)number);
	}


	/**
	 *	Returns the value of ip996021LparName
	 *	@return ip996021LparName
	 */
   public char[] getIp996021LparName() throws CFException  {              
   		return ip996021JobInformation.getIp996021LparName();
   }

  
	/**
	*  set variable ip996021LparName
	*  @param value
	**/
   public void setIp996021LparName(char[] value) throws CFException {
      ip996021JobInformation.setIp996021LparName(value);
   } 

     /**
	 * 	Update Ip996021LparName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp996021LparName(char[] source, int sourceIndex) throws CFException {
      ip996021JobInformation.setIp996021LparName(source, sourceIndex);
   	
   }
   
   public void setIp996021LparName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip996021JobInformation.setIp996021LparName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip996021LparName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp996021LparName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996021JobInformation.setIp996021LparName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip996021LparName with another Field
	 *	@param value
	 */
   public void setIp996021LparName(Field source) {
      ip996021JobInformation.setIp996021LparName(source);
   }  
   
     /**
	 * 	Update Ip996021LparName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp996021LparName(Field source, int sourceIndex,int sourceLen) {
      ip996021JobInformation.setIp996021LparName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip996021LparName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp996021LparName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip996021JobInformation.setIp996021LparName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of mqputSkipCount800
	 *	@return mqputSkipCount800
	 */
	public int getMqputSkipCount800() throws CFException {        
   		return work.getMqputSkipCount800();
	}
	
	/**
	 * 	Update MqputSkipCount800 with the passed value
	 *	@param number
	 */
	public void setMqputSkipCount800(int number)  throws CFException{
		work.setMqputSkipCount800(number);
	}


	public void setMqputSkipCount800(long number)  throws CFException{
		work.setMqputSkipCount800((int)number);
	}


	/**
	 *	Returns the value of faaFacNotFndCnt800
	 *	@return faaFacNotFndCnt800
	 */
	public int getFaaFacNotFndCnt800() throws CFException {        
   		return work.getFaaFacNotFndCnt800();
	}
	
	/**
	 * 	Update FaaFacNotFndCnt800 with the passed value
	 *	@param number
	 */
	public void setFaaFacNotFndCnt800(int number)  throws CFException{
		work.setFaaFacNotFndCnt800(number);
	}


	public void setFaaFacNotFndCnt800(long number)  throws CFException{
		work.setFaaFacNotFndCnt800((int)number);
	}


	/**
	 *	Returns the value of ip70511Cpu
	 *	@return ip70511Cpu
	 */
   public char[] getIp70511Cpu() throws CFException  {              
   		return ip70511Table.getIp70511TableKey().getIp70511Cpu();
   }

  
	/**
	*  set variable ip70511Cpu
	*  @param value
	**/
   public void setIp70511Cpu(char[] value) throws CFException {
      ip70511Table.getIp70511TableKey().setIp70511Cpu(value);
   } 

     /**
	 * 	Update Ip70511Cpu 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70511Cpu(char[] source, int sourceIndex) throws CFException {
      ip70511Table.getIp70511TableKey().setIp70511Cpu(source, sourceIndex);
   	
   }
   
   public void setIp70511Cpu(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70511Table.getIp70511TableKey().setIp70511Cpu(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70511Cpu 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70511Cpu(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70511Table.getIp70511TableKey().setIp70511Cpu(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70511Cpu with another Field
	 *	@param value
	 */
   public void setIp70511Cpu(Field source) {
      ip70511Table.getIp70511TableKey().setIp70511Cpu(source);
   }  
   
     /**
	 * 	Update Ip70511Cpu 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70511Cpu(Field source, int sourceIndex,int sourceLen) {
      ip70511Table.getIp70511TableKey().setIp70511Cpu(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70511Cpu 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70511Cpu(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70511Table.getIp70511TableKey().setIp70511Cpu(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of mqputFailCount800
	 *	@return mqputFailCount800
	 */
	public int getMqputFailCount800() throws CFException {        
   		return work.getMqputFailCount800();
	}
	
	/**
	 * 	Update MqputFailCount800 with the passed value
	 *	@param number
	 */
	public void setMqputFailCount800(int number)  throws CFException{
		work.setMqputFailCount800(number);
	}


	public void setMqputFailCount800(long number)  throws CFException{
		work.setMqputFailCount800((int)number);
	}



        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip996021JobInformation.hashCode();
        str += ip70711TipamrsEntries.hashCode();
        str += ip70301IsFraudMqSrvActiveGroup.hashCode();
        str += ip70511Table.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public InitializeVariablesOutCtx clone() {
        InitializeVariablesOutCtx cloneObj = new InitializeVariablesOutCtx();
        cloneObj.ip996021JobInformation = new Ip996021JobInformation();
        cloneObj.ip996021JobInformation.set(ip996021JobInformation.getClonedField());
        cloneObj.ip70711TipamrsEntries = new Ip70711TipamrsEntries();
        cloneObj.ip70711TipamrsEntries.set(ip70711TipamrsEntries.getClonedField());
        cloneObj.ip70301IsFraudMqSrvActiveGroup = new Ip70301IsFraudMqSrvActiveGroup();
        cloneObj.ip70301IsFraudMqSrvActiveGroup.set(ip70301IsFraudMqSrvActiveGroup.getClonedField());
        cloneObj.ip70511Table = new Ip70511Table();
        cloneObj.ip70511Table.set(ip70511Table.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InitializeVariablesOutCtx getInitializeVariablesOutCtx() {
            return new InitializeVariablesOutCtx();
    }
     public class GetMqRespJobNameInCtx implements Cloneable {
     Parms1000 parms1000 = Ip829010Ctx.this.getParms1000();
     Ip30881Db2McwaitInputValue ip30881Db2McwaitInputValue = Ip829010Ctx.this.getIp30881Db2McwaitInputValue();
     AbendPara900 abendPara900 = Ip829010Ctx.this.getAbendPara900();
     Work work = Ip829010Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip829010Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of retryErrorAbendCode300
	 *	@return retryErrorAbendCode300
	 */
   public char[] getRetryErrorAbendCode300() throws CFException  {              
   		return work.getRetryErrorAbendCode300();
   }

  
	/**
	*  set variable retryErrorAbendCode300
	*  @param value
	**/
   public void setRetryErrorAbendCode300(char[] value) throws CFException {
      work.setRetryErrorAbendCode300(value);
   } 

	/**
	 *	Returns the value of lnParm911Retry1000
	 *	@return lnParm911Retry1000
	 */
	public int getLnParm911Retry1000() throws CFException {
   		return parms1000.getLnParm911Retry1000();
	}


	/**
	 *	Returns String value of lnParm911Retry1000
	 *	@return lnParm911Retry1000
	 */
	public char[]  getLnParm911Retry1000String() throws CFException {
	     return String.valueOf(parms1000.getLnParm911Retry1000String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lnParm911Retry1000IsNumeric()  throws CFException{
	    return parms1000.lnParm911Retry1000IsNumeric();
	}

	/**
	 * 	Update LnParm911Retry1000 with the passed value
	 *	@param number
	 */
	public void setLnParm911Retry1000(int number)  throws CFException{
		parms1000.setLnParm911Retry1000(number);
	}
	

	public void setLnParm911Retry1000(long number)  throws CFException{
	    parms1000.setLnParm911Retry1000(number);
	}
	
	
	/**
	 * 	Update LnParm911Retry1000 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLnParm911Retry1000(char[] value)  throws CFException {
		parms1000.setLnParm911Retry1000(value);
	}
	
	/**
	 * 	Update LnParm911Retry1000 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLnParm911Retry1000String(char[] value)  throws CFException{
		parms1000.setLnParm911Retry1000(value);
	}	

	/**
	 *	Returns the value of parms1000
	 *	@return parms1000
	 */   
	 public Parms1000 getParms1000() {
   	return parms1000;
   }


	/**
	 *	Returns the value of jobnumErrorAbendCode300
	 *	@return jobnumErrorAbendCode300
	 */
   public char[] getJobnumErrorAbendCode300() throws CFException  {              
   		return work.getJobnumErrorAbendCode300();
   }

  
	/**
	*  set variable jobnumErrorAbendCode300
	*  @param value
	**/
   public void setJobnumErrorAbendCode300(char[] value) throws CFException {
      work.setJobnumErrorAbendCode300(value);
   } 

	/**
	 *	Returns the value of jobNameError600
	 *	@return jobNameError600
	 */
   public char[] getJobNameError600() throws CFException  {              
   		return work.getJobNameError600();
   }

  
	/**
	*  set variable jobNameError600
	*  @param value
	**/
   public void setJobNameError600(char[] value) throws CFException {
      work.setJobNameError600(value);
   } 

	/**
	 *	Returns the value of lnMqDebugSw1000
	 *	@return lnMqDebugSw1000
	 */
   public char[] getLnMqDebugSw1000() throws CFException  {              
   		return parms1000.getLnMqDebugSw1000();
   }

  
	/**
	*  set variable lnMqDebugSw1000
	*  @param value
	**/
   public void setLnMqDebugSw1000(char[] value) throws CFException {
      parms1000.setLnMqDebugSw1000(value);
   } 

     /**
	 * 	Update LnMqDebugSw1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLnMqDebugSw1000(char[] source, int sourceIndex) throws CFException {
      parms1000.setLnMqDebugSw1000(source, sourceIndex);
   	
   }
   
   public void setLnMqDebugSw1000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      parms1000.setLnMqDebugSw1000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LnMqDebugSw1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLnMqDebugSw1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parms1000.setLnMqDebugSw1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LnMqDebugSw1000 with another Field
	 *	@param value
	 */
   public void setLnMqDebugSw1000(Field source) {
      parms1000.setLnMqDebugSw1000(source);
   }  
   
     /**
	 * 	Update LnMqDebugSw1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLnMqDebugSw1000(Field source, int sourceIndex,int sourceLen) {
      parms1000.setLnMqDebugSw1000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LnMqDebugSw1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLnMqDebugSw1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parms1000.setLnMqDebugSw1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lnFacreqJobgrpNum1000
	 *	@return lnFacreqJobgrpNum1000
	 */
	public int getLnFacreqJobgrpNum1000() throws CFException {
   		return parms1000.getLnFacreqJobgrpNum1000();
	}


	/**
	 *	Returns String value of lnFacreqJobgrpNum1000
	 *	@return lnFacreqJobgrpNum1000
	 */
	public char[]  getLnFacreqJobgrpNum1000String() throws CFException {
	     return String.valueOf(parms1000.getLnFacreqJobgrpNum1000String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lnFacreqJobgrpNum1000IsNumeric()  throws CFException{
	    return parms1000.lnFacreqJobgrpNum1000IsNumeric();
	}

	/**
	 * 	Update LnFacreqJobgrpNum1000 with the passed value
	 *	@param number
	 */
	public void setLnFacreqJobgrpNum1000(int number)  throws CFException{
		parms1000.setLnFacreqJobgrpNum1000(number);
	}
	

	public void setLnFacreqJobgrpNum1000(long number)  throws CFException{
	    parms1000.setLnFacreqJobgrpNum1000(number);
	}
	
	
	/**
	 * 	Update LnFacreqJobgrpNum1000 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLnFacreqJobgrpNum1000(char[] value)  throws CFException {
		parms1000.setLnFacreqJobgrpNum1000(value);
	}
	
	/**
	 * 	Update LnFacreqJobgrpNum1000 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLnFacreqJobgrpNum1000String(char[] value)  throws CFException{
		parms1000.setLnFacreqJobgrpNum1000(value);
	}	

	/**
	 *	Returns the value of retryCountError602
	 *	@return retryCountError602
	 */
   public char[] getRetryCountError602() throws CFException  {              
   		return work.getRetryCountError602();
   }

  
	/**
	*  set variable retryCountError602
	*  @param value
	**/
   public void setRetryCountError602(char[] value) throws CFException {
      work.setRetryCountError602(value);
   } 

	/**
	 *	Returns the value of valueFacreq300
	 *	@return valueFacreq300
	 */
   public char[] getValueFacreq300() throws CFException  {              
   		return work.getValueFacreq300();
   }

  
	/**
	*  set variable valueFacreq300
	*  @param value
	**/
   public void setValueFacreq300(char[] value) throws CFException {
      work.setValueFacreq300(value);
   } 

	/**
	 *	Returns the value of paraName1400300
	 *	@return paraName1400300
	 */
   public char[] getParaName1400300() throws CFException  {              
   		return work.getParaName1400300();
   }

  
	/**
	*  set variable paraName1400300
	*  @param value
	**/
   public void setParaName1400300(char[] value) throws CFException {
      work.setParaName1400300(value);
   } 

	/**
	 *	Returns the value of jobNumError601
	 *	@return jobNumError601
	 */
   public char[] getJobNumError601() throws CFException  {              
   		return work.getJobNumError601();
   }

  
	/**
	*  set variable jobNumError601
	*  @param value
	**/
   public void setJobNumError601(char[] value) throws CFException {
      work.setJobNumError601(value);
   } 

	/**
	 *	Returns the value of jobnameErrorAbendCode300
	 *	@return jobnameErrorAbendCode300
	 */
   public char[] getJobnameErrorAbendCode300() throws CFException  {              
   		return work.getJobnameErrorAbendCode300();
   }

  
	/**
	*  set variable jobnameErrorAbendCode300
	*  @param value
	**/
   public void setJobnameErrorAbendCode300(char[] value) throws CFException {
      work.setJobnameErrorAbendCode300(value);
   } 

	/**
	 *	Returns the value of lnFacreqJobgrpName1000
	 *	@return lnFacreqJobgrpName1000
	 */
   public char[] getLnFacreqJobgrpName1000() throws CFException  {              
   		return parms1000.getLnFacreqJobgrpName1000();
   }

  
	/**
	*  set variable lnFacreqJobgrpName1000
	*  @param value
	**/
   public void setLnFacreqJobgrpName1000(char[] value) throws CFException {
      parms1000.setLnFacreqJobgrpName1000(value);
   } 

     /**
	 * 	Update LnFacreqJobgrpName1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(char[] source, int sourceIndex) throws CFException {
      parms1000.setLnFacreqJobgrpName1000(source, sourceIndex);
   	
   }
   
   public void setLnFacreqJobgrpName1000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      parms1000.setLnFacreqJobgrpName1000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LnFacreqJobgrpName1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parms1000.setLnFacreqJobgrpName1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LnFacreqJobgrpName1000 with another Field
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(Field source) {
      parms1000.setLnFacreqJobgrpName1000(source);
   }  
   
     /**
	 * 	Update LnFacreqJobgrpName1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(Field source, int sourceIndex,int sourceLen) {
      parms1000.setLnFacreqJobgrpName1000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LnFacreqJobgrpName1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parms1000.setLnFacreqJobgrpName1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public GetMqRespJobNameOutCtx getGetMqRespJobNameOutCtx() {
            return new GetMqRespJobNameOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += parms1000.hashCode();
        str += ip30881Db2McwaitInputValue.hashCode();
        str += abendPara900.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public GetMqRespJobNameInCtx clone() {
        GetMqRespJobNameInCtx cloneObj = new GetMqRespJobNameInCtx();
        cloneObj.parms1000 = new Parms1000();
        cloneObj.parms1000.set(parms1000.getClonedField());
        cloneObj.ip30881Db2McwaitInputValue = new Ip30881Db2McwaitInputValue();
        cloneObj.ip30881Db2McwaitInputValue.set(ip30881Db2McwaitInputValue.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public GetMqRespJobNameInCtx getGetMqRespJobNameInCtx() {
            return new GetMqRespJobNameInCtx();
    }
     public class GetMqRespJobNameOutCtx implements Cloneable {
     Parms1000 parms1000 = Ip829010Ctx.this.getParms1000();
     Ip30881Db2McwaitInputValue ip30881Db2McwaitInputValue = Ip829010Ctx.this.getIp30881Db2McwaitInputValue();
     AbendPara900 abendPara900 = Ip829010Ctx.this.getAbendPara900();
     Work work = Ip829010Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip829010Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of lnRespDebugInd800
	 *	@return lnRespDebugInd800
	 */
   public char[] getLnRespDebugInd800() throws CFException  {              
   		return work.getLnRespDebugInd800();
   }

  
	/**
	*  set variable lnRespDebugInd800
	*  @param value
	**/
   public void setLnRespDebugInd800(char[] value) throws CFException {
      work.setLnRespDebugInd800(value);
   } 

	/**
	 *	Returns the value of retryErrorAbendCode300
	 *	@return retryErrorAbendCode300
	 */
   public char[] getRetryErrorAbendCode300() throws CFException  {              
   		return work.getRetryErrorAbendCode300();
   }

  
	/**
	*  set variable retryErrorAbendCode300
	*  @param value
	**/
   public void setRetryErrorAbendCode300(char[] value) throws CFException {
      work.setRetryErrorAbendCode300(value);
   } 

	/**
	 *	Returns the value of lnParm911Retry1000
	 *	@return lnParm911Retry1000
	 */
	public int getLnParm911Retry1000() throws CFException {
   		return parms1000.getLnParm911Retry1000();
	}


	/**
	 *	Returns String value of lnParm911Retry1000
	 *	@return lnParm911Retry1000
	 */
	public char[]  getLnParm911Retry1000String() throws CFException {
	     return String.valueOf(parms1000.getLnParm911Retry1000String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lnParm911Retry1000IsNumeric()  throws CFException{
	    return parms1000.lnParm911Retry1000IsNumeric();
	}

	/**
	 * 	Update LnParm911Retry1000 with the passed value
	 *	@param number
	 */
	public void setLnParm911Retry1000(int number)  throws CFException{
		parms1000.setLnParm911Retry1000(number);
	}
	

	public void setLnParm911Retry1000(long number)  throws CFException{
	    parms1000.setLnParm911Retry1000(number);
	}
	
	
	/**
	 * 	Update LnParm911Retry1000 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLnParm911Retry1000(char[] value)  throws CFException {
		parms1000.setLnParm911Retry1000(value);
	}
	
	/**
	 * 	Update LnParm911Retry1000 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLnParm911Retry1000String(char[] value)  throws CFException{
		parms1000.setLnParm911Retry1000(value);
	}	

	/**
	 *	Returns the value of jobnumErrorAbendCode300
	 *	@return jobnumErrorAbendCode300
	 */
   public char[] getJobnumErrorAbendCode300() throws CFException  {              
   		return work.getJobnumErrorAbendCode300();
   }

  
	/**
	*  set variable jobnumErrorAbendCode300
	*  @param value
	**/
   public void setJobnumErrorAbendCode300(char[] value) throws CFException {
      work.setJobnumErrorAbendCode300(value);
   } 

	/**
	 *	Returns the value of jobNameError600
	 *	@return jobNameError600
	 */
   public char[] getJobNameError600() throws CFException  {              
   		return work.getJobNameError600();
   }

  
	/**
	*  set variable jobNameError600
	*  @param value
	**/
   public void setJobNameError600(char[] value) throws CFException {
      work.setJobNameError600(value);
   } 

	/**
	 *	Returns the value of lnMqDebugSw1000
	 *	@return lnMqDebugSw1000
	 */
   public char[] getLnMqDebugSw1000() throws CFException  {              
   		return parms1000.getLnMqDebugSw1000();
   }

  
	/**
	*  set variable lnMqDebugSw1000
	*  @param value
	**/
   public void setLnMqDebugSw1000(char[] value) throws CFException {
      parms1000.setLnMqDebugSw1000(value);
   } 

     /**
	 * 	Update LnMqDebugSw1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLnMqDebugSw1000(char[] source, int sourceIndex) throws CFException {
      parms1000.setLnMqDebugSw1000(source, sourceIndex);
   	
   }
   
   public void setLnMqDebugSw1000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      parms1000.setLnMqDebugSw1000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LnMqDebugSw1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLnMqDebugSw1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parms1000.setLnMqDebugSw1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LnMqDebugSw1000 with another Field
	 *	@param value
	 */
   public void setLnMqDebugSw1000(Field source) {
      parms1000.setLnMqDebugSw1000(source);
   }  
   
     /**
	 * 	Update LnMqDebugSw1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLnMqDebugSw1000(Field source, int sourceIndex,int sourceLen) {
      parms1000.setLnMqDebugSw1000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LnMqDebugSw1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLnMqDebugSw1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parms1000.setLnMqDebugSw1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of retryCountError602
	 *	@return retryCountError602
	 */
   public char[] getRetryCountError602() throws CFException  {              
   		return work.getRetryCountError602();
   }

  
	/**
	*  set variable retryCountError602
	*  @param value
	**/
   public void setRetryCountError602(char[] value) throws CFException {
      work.setRetryCountError602(value);
   } 

	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return abendMessage900.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      abendMessage900.setAbendText900(value);
   } 

     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendText900(source, sourceIndex);
   	
   }
   
   public void setAbendText900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendText900 with another Field
	 *	@param value
	 */
   public void setAbendText900(Field source) {
      abendMessage900.setAbendText900(source);
   }  
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of paraName1400300
	 *	@return paraName1400300
	 */
   public char[] getParaName1400300() throws CFException  {              
   		return work.getParaName1400300();
   }

  
	/**
	*  set variable paraName1400300
	*  @param value
	**/
   public void setParaName1400300(char[] value) throws CFException {
      work.setParaName1400300(value);
   } 

	/**
	 *	Returns the value of jobNumError601
	 *	@return jobNumError601
	 */
   public char[] getJobNumError601() throws CFException  {              
   		return work.getJobNumError601();
   }

  
	/**
	*  set variable jobNumError601
	*  @param value
	**/
   public void setJobNumError601(char[] value) throws CFException {
      work.setJobNumError601(value);
   } 

	/**
	 *	Returns the value of jobnameErrorAbendCode300
	 *	@return jobnameErrorAbendCode300
	 */
   public char[] getJobnameErrorAbendCode300() throws CFException  {              
   		return work.getJobnameErrorAbendCode300();
   }

  
	/**
	*  set variable jobnameErrorAbendCode300
	*  @param value
	**/
   public void setJobnameErrorAbendCode300(char[] value) throws CFException {
      work.setJobnameErrorAbendCode300(value);
   } 

	/**
	 *	Returns the value of abendParaName900
	 *	@return abendParaName900
	 */
   public char[] getAbendParaName900() throws CFException  {              
   		return abendPara900.getAbendParaName900();
   }

  
	/**
	*  set variable abendParaName900
	*  @param value
	**/
   public void setAbendParaName900(char[] value) throws CFException {
      abendPara900.setAbendParaName900(value);
   } 

     /**
	 * 	Update AbendParaName900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendParaName900(char[] source, int sourceIndex) throws CFException {
      abendPara900.setAbendParaName900(source, sourceIndex);
   	
   }
   
   public void setAbendParaName900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendParaName900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendParaName900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendParaName900 with another Field
	 *	@param value
	 */
   public void setAbendParaName900(Field source) {
      abendPara900.setAbendParaName900(source);
   }  
   
     /**
	 * 	Update AbendParaName900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendParaName900(Field source, int sourceIndex,int sourceLen) {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendParaName900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendParaName900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of facreqJobgrpName800
	 *	@return facreqJobgrpName800
	 */
   public char[] getFacreqJobgrpName800() throws CFException  {              
   		return work.getFacreqJobgrpName800();
   }

  
	/**
	*  set variable facreqJobgrpName800
	*  @param value
	**/
   public void setFacreqJobgrpName800(char[] value) throws CFException {
      work.setFacreqJobgrpName800(value);
   } 

	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip30881911RetryValue
	 *	@return ip30881911RetryValue
	 */
	public int getIp30881911RetryValue() throws CFException {
   		return ip30881Db2McwaitInputValue.getIp30881911RetryValue();
	}


	/**
	 *	Returns String value of ip30881911RetryValue
	 *	@return ip30881911RetryValue
	 */
	public char[]  getIp30881911RetryValueString() throws CFException {
	     return String.valueOf(ip30881Db2McwaitInputValue.getIp30881911RetryValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip30881911RetryValueIsNumeric()  throws CFException{
	    return ip30881Db2McwaitInputValue.ip30881911RetryValueIsNumeric();
	}

	/**
	 * 	Update Ip30881911RetryValue with the passed value
	 *	@param number
	 */
	public void setIp30881911RetryValue(int number)  throws CFException{
		ip30881Db2McwaitInputValue.setIp30881911RetryValue(number);
	}
	

	public void setIp30881911RetryValue(long number)  throws CFException{
	    ip30881Db2McwaitInputValue.setIp30881911RetryValue(number);
	}
	
	
	/**
	 * 	Update Ip30881911RetryValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp30881911RetryValue(char[] value)  throws CFException {
		ip30881Db2McwaitInputValue.setIp30881911RetryValue(value);
	}
	
	/**
	 * 	Update Ip30881911RetryValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp30881911RetryValueString(char[] value)  throws CFException{
		ip30881Db2McwaitInputValue.setIp30881911RetryValue(value);
	}	


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += parms1000.hashCode();
        str += ip30881Db2McwaitInputValue.hashCode();
        str += abendPara900.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public GetMqRespJobNameOutCtx clone() {
        GetMqRespJobNameOutCtx cloneObj = new GetMqRespJobNameOutCtx();
        cloneObj.parms1000 = new Parms1000();
        cloneObj.parms1000.set(parms1000.getClonedField());
        cloneObj.ip30881Db2McwaitInputValue = new Ip30881Db2McwaitInputValue();
        cloneObj.ip30881Db2McwaitInputValue.set(ip30881Db2McwaitInputValue.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public GetMqRespJobNameOutCtx getGetMqRespJobNameOutCtx() {
            return new GetMqRespJobNameOutCtx();
    }
     public class ProcessSys09eCtrlCardInCtx implements Cloneable {
     Work work = Ip829010Ctx.this.getWork();

	/**
	 *	Returns the value of ptrIp890110800
	 *	@return ptrIp890110800
	 */
   public char[] getPtrIp890110800() throws CFException  {              
   		return work.getPtrIp890110800();
   }

  
	/**
	*  set variable ptrIp890110800
	*  @param value
	**/
   public void setPtrIp890110800(char[] value) throws CFException {
      work.setPtrIp890110800(value);
   } 


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public ProcessSys09eCtrlCardOutCtx getProcessSys09eCtrlCardOutCtx() {
            return new ProcessSys09eCtrlCardOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessSys09eCtrlCardInCtx clone() {
        ProcessSys09eCtrlCardInCtx cloneObj = new ProcessSys09eCtrlCardInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessSys09eCtrlCardInCtx getProcessSys09eCtrlCardInCtx() {
            return new ProcessSys09eCtrlCardInCtx();
    }
     public class ProcessSys09eCtrlCardOutCtx implements Cloneable {
     Work work = Ip829010Ctx.this.getWork();


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessSys09eCtrlCardOutCtx clone() {
        ProcessSys09eCtrlCardOutCtx cloneObj = new ProcessSys09eCtrlCardOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessSys09eCtrlCardOutCtx getProcessSys09eCtrlCardOutCtx() {
            return new ProcessSys09eCtrlCardOutCtx();
    }
     public class ProcessRuncntlFileInCtx implements Cloneable {
     Ip50005ClearingDtTm ip50005ClearingDtTm = Ip829010Ctx.this.getIp50005ClearingDtTm();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip829010Ctx.this.getIp60001EventLogWorkArea();
     Work work = Ip829010Ctx.this.getWork();
     Ip08101RunControlRecord ip08101RunControlRecord = Ip829010Ctx.this.getIp08101RunControlRecord();

	/**
	 *	Returns the value of ip08101RunIndicator
	 *	@return ip08101RunIndicator
	 */
   public char[] getIp08101RunIndicator() throws CFException  {              
   		return ip08101RunControlRecord.getIp08101RptInds().getIp08101RunIndicator();
   }

  
	/**
	*  set variable ip08101RunIndicator
	*  @param value
	**/
   public void setIp08101RunIndicator(char[] value) throws CFException {
      ip08101RunControlRecord.getIp08101RptInds().setIp08101RunIndicator(value);
   } 

     /**
	 * 	Update Ip08101RunIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101RunIndicator(char[] source, int sourceIndex) throws CFException {
      ip08101RunControlRecord.getIp08101RptInds().setIp08101RunIndicator(source, sourceIndex);
   	
   }
   
   public void setIp08101RunIndicator(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip08101RunControlRecord.getIp08101RptInds().setIp08101RunIndicator(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip08101RunIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RunIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip08101RunControlRecord.getIp08101RptInds().setIp08101RunIndicator(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip08101RunIndicator with another Field
	 *	@param value
	 */
   public void setIp08101RunIndicator(Field source) {
      ip08101RunControlRecord.getIp08101RptInds().setIp08101RunIndicator(source);
   }  
   
     /**
	 * 	Update Ip08101RunIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101RunIndicator(Field source, int sourceIndex,int sourceLen) {
      ip08101RunControlRecord.getIp08101RptInds().setIp08101RunIndicator(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip08101RunIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RunIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip08101RunControlRecord.getIp08101RptInds().setIp08101RunIndicator(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip50005ClearingDtTm
	 *	@return ip50005ClearingDtTm
	 */   
	 public Ip50005ClearingDtTm getIp50005ClearingDtTm() {
   	return ip50005ClearingDtTm;
   }


	/**
	 *	Returns the value of ptrIp081110800
	 *	@return ptrIp081110800
	 */
   public char[] getPtrIp081110800() throws CFException  {              
   		return work.getPtrIp081110800();
   }

  
	/**
	*  set variable ptrIp081110800
	*  @param value
	**/
   public void setPtrIp081110800(char[] value) throws CFException {
      work.setPtrIp081110800(value);
   } 

	/**
	 *	Returns the value of ip08101RptProcessTime
	 *	@return ip08101RptProcessTime
	 */
   public char[] getIp08101RptProcessTime() throws CFException  {              
   		return ip08101RunControlRecord.getIp08101RptProcessTime();
   }

  
	/**
	*  set variable ip08101RptProcessTime
	*  @param value
	**/
   public void setIp08101RptProcessTime(char[] value) throws CFException {
      ip08101RunControlRecord.setIp08101RptProcessTime(value);
   } 

     /**
	 * 	Update Ip08101RptProcessTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101RptProcessTime(char[] source, int sourceIndex) throws CFException {
      ip08101RunControlRecord.setIp08101RptProcessTime(source, sourceIndex);
   	
   }
   
   public void setIp08101RptProcessTime(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip08101RunControlRecord.setIp08101RptProcessTime(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip08101RptProcessTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RptProcessTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip08101RunControlRecord.setIp08101RptProcessTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip08101RptProcessTime with another Field
	 *	@param value
	 */
   public void setIp08101RptProcessTime(Field source) {
      ip08101RunControlRecord.setIp08101RptProcessTime(source);
   }  
   
     /**
	 * 	Update Ip08101RptProcessTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101RptProcessTime(Field source, int sourceIndex,int sourceLen) {
      ip08101RunControlRecord.setIp08101RptProcessTime(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip08101RptProcessTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RptProcessTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip08101RunControlRecord.setIp08101RptProcessTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip08101ProcessDate
	 *	@return ip08101ProcessDate
	 */
	public long getIp08101ProcessDate() throws CFException {
   		return ip08101RunControlRecord.getIp08101ProcessDate();
	}


	/**
	 *	Returns String value of ip08101ProcessDate
	 *	@return ip08101ProcessDate
	 */
	public char[]  getIp08101ProcessDateString() throws CFException {
	     return String.valueOf(ip08101RunControlRecord.getIp08101ProcessDateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip08101ProcessDateIsNumeric()  throws CFException{
	    return ip08101RunControlRecord.ip08101ProcessDateIsNumeric();
	}

	/**
	 * 	Update Ip08101ProcessDate with the passed value
	 *	@param number
	 */
	public void setIp08101ProcessDate(long number)  throws CFException{
		ip08101RunControlRecord.setIp08101ProcessDate(number);
	}
	

	
	/**
	 * 	Update Ip08101ProcessDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp08101ProcessDate(char[] value)  throws CFException {
		ip08101RunControlRecord.setIp08101ProcessDate(value);
	}
	
	/**
	 * 	Update Ip08101ProcessDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp08101ProcessDateString(char[] value)  throws CFException{
		ip08101RunControlRecord.setIp08101ProcessDate(value);
	}	

	/**
	 *	Returns the value of ip08101RunControlRecord
	 *	@return ip08101RunControlRecord
	 */   
	 public Ip08101RunControlRecord getIp08101RunControlRecord() {
   	return ip08101RunControlRecord;
   }



        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public ProcessRuncntlFileOutCtx getProcessRuncntlFileOutCtx() {
            return new ProcessRuncntlFileOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip50005ClearingDtTm.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += work.hashCode();
        str += ip08101RunControlRecord.hashCode();
       return str.hashCode();
    }

    public ProcessRuncntlFileInCtx clone() {
        ProcessRuncntlFileInCtx cloneObj = new ProcessRuncntlFileInCtx();
        cloneObj.ip50005ClearingDtTm = new Ip50005ClearingDtTm();
        cloneObj.ip50005ClearingDtTm.set(ip50005ClearingDtTm.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip08101RunControlRecord = new Ip08101RunControlRecord();
        cloneObj.ip08101RunControlRecord.set(ip08101RunControlRecord.getClonedField());
        return cloneObj;
    }

    }

    public ProcessRuncntlFileInCtx getProcessRuncntlFileInCtx() {
            return new ProcessRuncntlFileInCtx();
    }
     public class ProcessRuncntlFileOutCtx implements Cloneable {
     Ip50005ClearingDtTm ip50005ClearingDtTm = Ip829010Ctx.this.getIp50005ClearingDtTm();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip829010Ctx.this.getIp60001EventLogWorkArea();
     Work work = Ip829010Ctx.this.getWork();
     Ip08101RunControlRecord ip08101RunControlRecord = Ip829010Ctx.this.getIp08101RunControlRecord();

	/**
	 *	Returns the value of ip08101RunIndicator
	 *	@return ip08101RunIndicator
	 */
   public char[] getIp08101RunIndicator() throws CFException  {              
   		return ip08101RunControlRecord.getIp08101RptInds().getIp08101RunIndicator();
   }

  
	/**
	*  set variable ip08101RunIndicator
	*  @param value
	**/
   public void setIp08101RunIndicator(char[] value) throws CFException {
      ip08101RunControlRecord.getIp08101RptInds().setIp08101RunIndicator(value);
   } 

     /**
	 * 	Update Ip08101RunIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101RunIndicator(char[] source, int sourceIndex) throws CFException {
      ip08101RunControlRecord.getIp08101RptInds().setIp08101RunIndicator(source, sourceIndex);
   	
   }
   
   public void setIp08101RunIndicator(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip08101RunControlRecord.getIp08101RptInds().setIp08101RunIndicator(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip08101RunIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RunIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip08101RunControlRecord.getIp08101RptInds().setIp08101RunIndicator(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip08101RunIndicator with another Field
	 *	@param value
	 */
   public void setIp08101RunIndicator(Field source) {
      ip08101RunControlRecord.getIp08101RptInds().setIp08101RunIndicator(source);
   }  
   
     /**
	 * 	Update Ip08101RunIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101RunIndicator(Field source, int sourceIndex,int sourceLen) {
      ip08101RunControlRecord.getIp08101RptInds().setIp08101RunIndicator(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip08101RunIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RunIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip08101RunControlRecord.getIp08101RptInds().setIp08101RunIndicator(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip50005ClearingDt
	 *	@return ip50005ClearingDt
	 */
   public char[] getIp50005ClearingDt() throws CFException  {              
   		return ip50005ClearingDtTm.getIp50005ClearingDt();
   }

  
	/**
	*  set variable ip50005ClearingDt
	*  @param value
	**/
   public void setIp50005ClearingDt(char[] value) throws CFException {
      ip50005ClearingDtTm.setIp50005ClearingDt(value);
   } 

     /**
	 * 	Update Ip50005ClearingDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50005ClearingDt(char[] source, int sourceIndex) throws CFException {
      ip50005ClearingDtTm.setIp50005ClearingDt(source, sourceIndex);
   	
   }
   
   public void setIp50005ClearingDt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip50005ClearingDtTm.setIp50005ClearingDt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50005ClearingDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005ClearingDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50005ClearingDtTm.setIp50005ClearingDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50005ClearingDt with another Field
	 *	@param value
	 */
   public void setIp50005ClearingDt(Field source) {
      ip50005ClearingDtTm.setIp50005ClearingDt(source);
   }  
   
     /**
	 * 	Update Ip50005ClearingDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50005ClearingDt(Field source, int sourceIndex,int sourceLen) {
      ip50005ClearingDtTm.setIp50005ClearingDt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip50005ClearingDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005ClearingDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50005ClearingDtTm.setIp50005ClearingDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip50005ClearingDtTm
	 *	@return ip50005ClearingDtTm
	 */   
	 public Ip50005ClearingDtTm getIp50005ClearingDtTm() {
   	return ip50005ClearingDtTm;
   }


	/**
	 *	Returns the value of ip08101RptProcessTime
	 *	@return ip08101RptProcessTime
	 */
   public char[] getIp08101RptProcessTime() throws CFException  {              
   		return ip08101RunControlRecord.getIp08101RptProcessTime();
   }

  
	/**
	*  set variable ip08101RptProcessTime
	*  @param value
	**/
   public void setIp08101RptProcessTime(char[] value) throws CFException {
      ip08101RunControlRecord.setIp08101RptProcessTime(value);
   } 

     /**
	 * 	Update Ip08101RptProcessTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101RptProcessTime(char[] source, int sourceIndex) throws CFException {
      ip08101RunControlRecord.setIp08101RptProcessTime(source, sourceIndex);
   	
   }
   
   public void setIp08101RptProcessTime(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip08101RunControlRecord.setIp08101RptProcessTime(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip08101RptProcessTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RptProcessTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip08101RunControlRecord.setIp08101RptProcessTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip08101RptProcessTime with another Field
	 *	@param value
	 */
   public void setIp08101RptProcessTime(Field source) {
      ip08101RunControlRecord.setIp08101RptProcessTime(source);
   }  
   
     /**
	 * 	Update Ip08101RptProcessTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101RptProcessTime(Field source, int sourceIndex,int sourceLen) {
      ip08101RunControlRecord.setIp08101RptProcessTime(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip08101RptProcessTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RptProcessTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip08101RunControlRecord.setIp08101RptProcessTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip50005ClearingTm
	 *	@return ip50005ClearingTm
	 */
   public char[] getIp50005ClearingTm() throws CFException  {              
   		return ip50005ClearingDtTm.getIp50005ClearingTm();
   }

  
	/**
	*  set variable ip50005ClearingTm
	*  @param value
	**/
   public void setIp50005ClearingTm(char[] value) throws CFException {
      ip50005ClearingDtTm.setIp50005ClearingTm(value);
   } 

     /**
	 * 	Update Ip50005ClearingTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50005ClearingTm(char[] source, int sourceIndex) throws CFException {
      ip50005ClearingDtTm.setIp50005ClearingTm(source, sourceIndex);
   	
   }
   
   public void setIp50005ClearingTm(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip50005ClearingDtTm.setIp50005ClearingTm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50005ClearingTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005ClearingTm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50005ClearingDtTm.setIp50005ClearingTm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50005ClearingTm with another Field
	 *	@param value
	 */
   public void setIp50005ClearingTm(Field source) {
      ip50005ClearingDtTm.setIp50005ClearingTm(source);
   }  
   
     /**
	 * 	Update Ip50005ClearingTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50005ClearingTm(Field source, int sourceIndex,int sourceLen) {
      ip50005ClearingDtTm.setIp50005ClearingTm(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip50005ClearingTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005ClearingTm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50005ClearingDtTm.setIp50005ClearingTm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip08101ProcessDate
	 *	@return ip08101ProcessDate
	 */
	public long getIp08101ProcessDate() throws CFException {
   		return ip08101RunControlRecord.getIp08101ProcessDate();
	}


	/**
	 *	Returns String value of ip08101ProcessDate
	 *	@return ip08101ProcessDate
	 */
	public char[]  getIp08101ProcessDateString() throws CFException {
	     return String.valueOf(ip08101RunControlRecord.getIp08101ProcessDateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip08101ProcessDateIsNumeric()  throws CFException{
	    return ip08101RunControlRecord.ip08101ProcessDateIsNumeric();
	}

	/**
	 * 	Update Ip08101ProcessDate with the passed value
	 *	@param number
	 */
	public void setIp08101ProcessDate(long number)  throws CFException{
		ip08101RunControlRecord.setIp08101ProcessDate(number);
	}
	

	
	/**
	 * 	Update Ip08101ProcessDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp08101ProcessDate(char[] value)  throws CFException {
		ip08101RunControlRecord.setIp08101ProcessDate(value);
	}
	
	/**
	 * 	Update Ip08101ProcessDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp08101ProcessDateString(char[] value)  throws CFException{
		ip08101RunControlRecord.setIp08101ProcessDate(value);
	}	

	/**
	 *	Returns the value of ip60001EventLogControl
	 *	@return ip60001EventLogControl
	 */
   public char[] getIp60001EventLogControl() throws CFException  {              
   		return ip60001EventLogWorkArea.getIp60001EventLogControl();
   }

  
	/**
	*  set variable ip60001EventLogControl
	*  @param value
	**/
   public void setIp60001EventLogControl(char[] value) throws CFException {
      ip60001EventLogWorkArea.setIp60001EventLogControl(value);
   } 

     /**
	 * 	Update Ip60001EventLogControl 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001EventLogControl(char[] source, int sourceIndex) throws CFException {
      ip60001EventLogWorkArea.setIp60001EventLogControl(source, sourceIndex);
   	
   }
   
   public void setIp60001EventLogControl(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip60001EventLogWorkArea.setIp60001EventLogControl(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip60001EventLogControl 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001EventLogControl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001EventLogControl(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip60001EventLogControl with another Field
	 *	@param value
	 */
   public void setIp60001EventLogControl(Field source) {
      ip60001EventLogWorkArea.setIp60001EventLogControl(source);
   }  
   
     /**
	 * 	Update Ip60001EventLogControl 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001EventLogControl(Field source, int sourceIndex,int sourceLen) {
      ip60001EventLogWorkArea.setIp60001EventLogControl(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip60001EventLogControl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001EventLogControl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001EventLogControl(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip50005ClearingDtTm.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += work.hashCode();
        str += ip08101RunControlRecord.hashCode();
       return str.hashCode();
    }

    public ProcessRuncntlFileOutCtx clone() {
        ProcessRuncntlFileOutCtx cloneObj = new ProcessRuncntlFileOutCtx();
        cloneObj.ip50005ClearingDtTm = new Ip50005ClearingDtTm();
        cloneObj.ip50005ClearingDtTm.set(ip50005ClearingDtTm.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip08101RunControlRecord = new Ip08101RunControlRecord();
        cloneObj.ip08101RunControlRecord.set(ip08101RunControlRecord.getClonedField());
        return cloneObj;
    }

    }

    public ProcessRuncntlFileOutCtx getProcessRuncntlFileOutCtx() {
            return new ProcessRuncntlFileOutCtx();
    }
     public class GetTbl201InfoInCtx implements Cloneable {
     Ip28221PaTableRestart ip28221PaTableRestart = Ip829010Ctx.this.getIp28221PaTableRestart();
     Ip70511Table ip70511Table = Ip829010Ctx.this.getIp70511Table();
     Work work = Ip829010Ctx.this.getWork();
     Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable = Ip829010Ctx.this.getIp02015PrcssAgrmtTable();

	/**
	 *	Returns the value of ip28221PaTableRestart
	 *	@return ip28221PaTableRestart
	 */   
	 public Ip28221PaTableRestart getIp28221PaTableRestart() {
   	return ip28221PaTableRestart;
   }


	/**
	 *	Returns the value of ptrIp282210800
	 *	@return ptrIp282210800
	 */
   public char[] getPtrIp282210800() throws CFException  {              
   		return work.getPtrIp282210800();
   }

  
	/**
	*  set variable ptrIp282210800
	*  @param value
	**/
   public void setPtrIp282210800(char[] value) throws CFException {
      work.setPtrIp282210800(value);
   } 

	/**
	 *	Returns the value of ip02015HostPrcssAgrmtId
	 *	@return ip02015HostPrcssAgrmtId
	 */
   public char[] getIp02015HostPrcssAgrmtId() throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015HostPrcssAgrmtId();
   }

  
	/**
	*  set variable ip02015HostPrcssAgrmtId
	*  @param value
	**/
   public void setIp02015HostPrcssAgrmtId(char[] value) throws CFException {
      ip02015PrcssAgrmtTable.setIp02015HostPrcssAgrmtId(value);
   } 

     /**
	 * 	Update Ip02015HostPrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015HostPrcssAgrmtId(char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.setIp02015HostPrcssAgrmtId(source, sourceIndex);
   	
   }
   
   public void setIp02015HostPrcssAgrmtId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.setIp02015HostPrcssAgrmtId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015HostPrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015HostPrcssAgrmtId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.setIp02015HostPrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015HostPrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp02015HostPrcssAgrmtId(Field source) {
      ip02015PrcssAgrmtTable.setIp02015HostPrcssAgrmtId(source);
   }  
   
     /**
	 * 	Update Ip02015HostPrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015HostPrcssAgrmtId(Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.setIp02015HostPrcssAgrmtId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015HostPrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015HostPrcssAgrmtId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.setIp02015HostPrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public GetTbl201InfoOutCtx getGetTbl201InfoOutCtx() {
            return new GetTbl201InfoOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip28221PaTableRestart.hashCode();
        str += ip70511Table.hashCode();
        str += work.hashCode();
        str += ip02015PrcssAgrmtTable.hashCode();
       return str.hashCode();
    }

    public GetTbl201InfoInCtx clone() {
        GetTbl201InfoInCtx cloneObj = new GetTbl201InfoInCtx();
        cloneObj.ip28221PaTableRestart = new Ip28221PaTableRestart();
        cloneObj.ip28221PaTableRestart.set(ip28221PaTableRestart.getClonedField());
        cloneObj.ip70511Table = new Ip70511Table();
        cloneObj.ip70511Table.set(ip70511Table.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        return cloneObj;
    }

    }

    public GetTbl201InfoInCtx getGetTbl201InfoInCtx() {
            return new GetTbl201InfoInCtx();
    }
     public class GetTbl201InfoOutCtx implements Cloneable {
     Ip28221PaTableRestart ip28221PaTableRestart = Ip829010Ctx.this.getIp28221PaTableRestart();
     Ip70511Table ip70511Table = Ip829010Ctx.this.getIp70511Table();
     Work work = Ip829010Ctx.this.getWork();
     Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable = Ip829010Ctx.this.getIp02015PrcssAgrmtTable();

	/**
	 *	Test condition "N" for isIp28221Ip282210NoRestrt88()
	 *	@return  Returns true if isIp28221Ip282210NoRestrt88() is "N"
	 */
   public boolean isIp28221Ip282210NoRestrt88() throws CFException {
      return ip28221PaTableRestart.isIp28221Ip282210NoRestrt88();
   }

	/**
	*  set values "N"
	*/
   	public void setIp28221Ip282210NoRestrt88True()  throws CFException{  			
    	ip28221PaTableRestart.setIp28221Ip282210NoRestrt88True();
   	}
	/**
	 *	Returns the value of ip70511HostPrcssAgrmtId
	 *	@return ip70511HostPrcssAgrmtId
	 */
   public char[] getIp70511HostPrcssAgrmtId() throws CFException  {              
   		return ip70511Table.getIp70511TableKey().getIp70511HostPrcssAgrmtId();
   }

  
	/**
	*  set variable ip70511HostPrcssAgrmtId
	*  @param value
	**/
   public void setIp70511HostPrcssAgrmtId(char[] value) throws CFException {
      ip70511Table.getIp70511TableKey().setIp70511HostPrcssAgrmtId(value);
   } 

     /**
	 * 	Update Ip70511HostPrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70511HostPrcssAgrmtId(char[] source, int sourceIndex) throws CFException {
      ip70511Table.getIp70511TableKey().setIp70511HostPrcssAgrmtId(source, sourceIndex);
   	
   }
   
   public void setIp70511HostPrcssAgrmtId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70511Table.getIp70511TableKey().setIp70511HostPrcssAgrmtId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70511HostPrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70511HostPrcssAgrmtId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70511Table.getIp70511TableKey().setIp70511HostPrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70511HostPrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp70511HostPrcssAgrmtId(Field source) {
      ip70511Table.getIp70511TableKey().setIp70511HostPrcssAgrmtId(source);
   }  
   
     /**
	 * 	Update Ip70511HostPrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70511HostPrcssAgrmtId(Field source, int sourceIndex,int sourceLen) {
      ip70511Table.getIp70511TableKey().setIp70511HostPrcssAgrmtId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70511HostPrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70511HostPrcssAgrmtId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70511Table.getIp70511TableKey().setIp70511HostPrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip28221PaTableRestart
	 *	@return ip28221PaTableRestart
	 */   
	 public Ip28221PaTableRestart getIp28221PaTableRestart() {
   	return ip28221PaTableRestart;
   }


	/**
	 *	Returns the value of ip02015HostPrcssAgrmtId
	 *	@return ip02015HostPrcssAgrmtId
	 */
   public char[] getIp02015HostPrcssAgrmtId() throws CFException  {              
   		return ip02015PrcssAgrmtTable.getIp02015HostPrcssAgrmtId();
   }

  
	/**
	*  set variable ip02015HostPrcssAgrmtId
	*  @param value
	**/
   public void setIp02015HostPrcssAgrmtId(char[] value) throws CFException {
      ip02015PrcssAgrmtTable.setIp02015HostPrcssAgrmtId(value);
   } 

     /**
	 * 	Update Ip02015HostPrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015HostPrcssAgrmtId(char[] source, int sourceIndex) throws CFException {
      ip02015PrcssAgrmtTable.setIp02015HostPrcssAgrmtId(source, sourceIndex);
   	
   }
   
   public void setIp02015HostPrcssAgrmtId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02015PrcssAgrmtTable.setIp02015HostPrcssAgrmtId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02015HostPrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015HostPrcssAgrmtId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.setIp02015HostPrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02015HostPrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp02015HostPrcssAgrmtId(Field source) {
      ip02015PrcssAgrmtTable.setIp02015HostPrcssAgrmtId(source);
   }  
   
     /**
	 * 	Update Ip02015HostPrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015HostPrcssAgrmtId(Field source, int sourceIndex,int sourceLen) {
      ip02015PrcssAgrmtTable.setIp02015HostPrcssAgrmtId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02015HostPrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015HostPrcssAgrmtId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02015PrcssAgrmtTable.setIp02015HostPrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip28221PaTableRestart.hashCode();
        str += ip70511Table.hashCode();
        str += work.hashCode();
        str += ip02015PrcssAgrmtTable.hashCode();
       return str.hashCode();
    }

    public GetTbl201InfoOutCtx clone() {
        GetTbl201InfoOutCtx cloneObj = new GetTbl201InfoOutCtx();
        cloneObj.ip28221PaTableRestart = new Ip28221PaTableRestart();
        cloneObj.ip28221PaTableRestart.set(ip28221PaTableRestart.getClonedField());
        cloneObj.ip70511Table = new Ip70511Table();
        cloneObj.ip70511Table.set(ip70511Table.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        return cloneObj;
    }

    }

    public GetTbl201InfoOutCtx getGetTbl201InfoOutCtx() {
            return new GetTbl201InfoOutCtx();
    }
     public class StartLrmInCtx implements Cloneable {
     Ip64801LrmCommBlock ip64801LrmCommBlock = Ip829010Ctx.this.getIp64801LrmCommBlock();
     Parms1000 parms1000 = Ip829010Ctx.this.getParms1000();
     Ip30881Db2McwaitInputValue ip30881Db2McwaitInputValue = Ip829010Ctx.this.getIp30881Db2McwaitInputValue();

	/**
	 *	Returns the value of lnFacreqJobgrpNum1000
	 *	@return lnFacreqJobgrpNum1000
	 */
	public int getLnFacreqJobgrpNum1000() throws CFException {
   		return parms1000.getLnFacreqJobgrpNum1000();
	}


	/**
	 *	Returns String value of lnFacreqJobgrpNum1000
	 *	@return lnFacreqJobgrpNum1000
	 */
	public char[]  getLnFacreqJobgrpNum1000String() throws CFException {
	     return String.valueOf(parms1000.getLnFacreqJobgrpNum1000String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lnFacreqJobgrpNum1000IsNumeric()  throws CFException{
	    return parms1000.lnFacreqJobgrpNum1000IsNumeric();
	}

	/**
	 * 	Update LnFacreqJobgrpNum1000 with the passed value
	 *	@param number
	 */
	public void setLnFacreqJobgrpNum1000(int number)  throws CFException{
		parms1000.setLnFacreqJobgrpNum1000(number);
	}
	

	public void setLnFacreqJobgrpNum1000(long number)  throws CFException{
	    parms1000.setLnFacreqJobgrpNum1000(number);
	}
	
	
	/**
	 * 	Update LnFacreqJobgrpNum1000 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLnFacreqJobgrpNum1000(char[] value)  throws CFException {
		parms1000.setLnFacreqJobgrpNum1000(value);
	}
	
	/**
	 * 	Update LnFacreqJobgrpNum1000 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLnFacreqJobgrpNum1000String(char[] value)  throws CFException{
		parms1000.setLnFacreqJobgrpNum1000(value);
	}	

	/**
	 *	Returns the value of lnParm911Retry1000
	 *	@return lnParm911Retry1000
	 */
	public int getLnParm911Retry1000() throws CFException {
   		return parms1000.getLnParm911Retry1000();
	}


	/**
	 *	Returns String value of lnParm911Retry1000
	 *	@return lnParm911Retry1000
	 */
	public char[]  getLnParm911Retry1000String() throws CFException {
	     return String.valueOf(parms1000.getLnParm911Retry1000String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lnParm911Retry1000IsNumeric()  throws CFException{
	    return parms1000.lnParm911Retry1000IsNumeric();
	}

	/**
	 * 	Update LnParm911Retry1000 with the passed value
	 *	@param number
	 */
	public void setLnParm911Retry1000(int number)  throws CFException{
		parms1000.setLnParm911Retry1000(number);
	}
	

	public void setLnParm911Retry1000(long number)  throws CFException{
	    parms1000.setLnParm911Retry1000(number);
	}
	
	
	/**
	 * 	Update LnParm911Retry1000 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLnParm911Retry1000(char[] value)  throws CFException {
		parms1000.setLnParm911Retry1000(value);
	}
	
	/**
	 * 	Update LnParm911Retry1000 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLnParm911Retry1000String(char[] value)  throws CFException{
		parms1000.setLnParm911Retry1000(value);
	}	

	/**
	 *	Returns the value of lnFacreqJobgrpName1000
	 *	@return lnFacreqJobgrpName1000
	 */
   public char[] getLnFacreqJobgrpName1000() throws CFException  {              
   		return parms1000.getLnFacreqJobgrpName1000();
   }

  
	/**
	*  set variable lnFacreqJobgrpName1000
	*  @param value
	**/
   public void setLnFacreqJobgrpName1000(char[] value) throws CFException {
      parms1000.setLnFacreqJobgrpName1000(value);
   } 

     /**
	 * 	Update LnFacreqJobgrpName1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(char[] source, int sourceIndex) throws CFException {
      parms1000.setLnFacreqJobgrpName1000(source, sourceIndex);
   	
   }
   
   public void setLnFacreqJobgrpName1000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      parms1000.setLnFacreqJobgrpName1000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LnFacreqJobgrpName1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parms1000.setLnFacreqJobgrpName1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LnFacreqJobgrpName1000 with another Field
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(Field source) {
      parms1000.setLnFacreqJobgrpName1000(source);
   }  
   
     /**
	 * 	Update LnFacreqJobgrpName1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(Field source, int sourceIndex,int sourceLen) {
      parms1000.setLnFacreqJobgrpName1000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LnFacreqJobgrpName1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parms1000.setLnFacreqJobgrpName1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public StartLrmOutCtx getStartLrmOutCtx() {
            return new StartLrmOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip64801LrmCommBlock.hashCode();
        str += parms1000.hashCode();
        str += ip30881Db2McwaitInputValue.hashCode();
       return str.hashCode();
    }

    public StartLrmInCtx clone() {
        StartLrmInCtx cloneObj = new StartLrmInCtx();
        cloneObj.ip64801LrmCommBlock = new Ip64801LrmCommBlock();
        cloneObj.ip64801LrmCommBlock.set(ip64801LrmCommBlock.getClonedField());
        cloneObj.parms1000 = new Parms1000();
        cloneObj.parms1000.set(parms1000.getClonedField());
        cloneObj.ip30881Db2McwaitInputValue = new Ip30881Db2McwaitInputValue();
        cloneObj.ip30881Db2McwaitInputValue.set(ip30881Db2McwaitInputValue.getClonedField());
        return cloneObj;
    }

    }

    public StartLrmInCtx getStartLrmInCtx() {
            return new StartLrmInCtx();
    }
     public class StartLrmOutCtx implements Cloneable {
     Ip64801LrmCommBlock ip64801LrmCommBlock = Ip829010Ctx.this.getIp64801LrmCommBlock();
     Parms1000 parms1000 = Ip829010Ctx.this.getParms1000();
     Ip30881Db2McwaitInputValue ip30881Db2McwaitInputValue = Ip829010Ctx.this.getIp30881Db2McwaitInputValue();

	/**
	 *	Test condition "STRT" for isIp6480188LrmStrtReq()
	 *	@return  Returns true if isIp6480188LrmStrtReq() is "STRT"
	 */
   public boolean isIp6480188LrmStrtReq() throws CFException {
      return ip64801LrmCommBlock.isIp6480188LrmStrtReq();
   }

	/**
	*  set values "STRT"
	*/
   	public void setIp6480188LrmStrtReqTrue()  throws CFException{  			
    	ip64801LrmCommBlock.setIp6480188LrmStrtReqTrue();
   	}
	/**
	 *	Returns the value of lnFacreqJobgrpNum1000
	 *	@return lnFacreqJobgrpNum1000
	 */
	public int getLnFacreqJobgrpNum1000() throws CFException {
   		return parms1000.getLnFacreqJobgrpNum1000();
	}


	/**
	 *	Returns String value of lnFacreqJobgrpNum1000
	 *	@return lnFacreqJobgrpNum1000
	 */
	public char[]  getLnFacreqJobgrpNum1000String() throws CFException {
	     return String.valueOf(parms1000.getLnFacreqJobgrpNum1000String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lnFacreqJobgrpNum1000IsNumeric()  throws CFException{
	    return parms1000.lnFacreqJobgrpNum1000IsNumeric();
	}

	/**
	 * 	Update LnFacreqJobgrpNum1000 with the passed value
	 *	@param number
	 */
	public void setLnFacreqJobgrpNum1000(int number)  throws CFException{
		parms1000.setLnFacreqJobgrpNum1000(number);
	}
	

	public void setLnFacreqJobgrpNum1000(long number)  throws CFException{
	    parms1000.setLnFacreqJobgrpNum1000(number);
	}
	
	
	/**
	 * 	Update LnFacreqJobgrpNum1000 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLnFacreqJobgrpNum1000(char[] value)  throws CFException {
		parms1000.setLnFacreqJobgrpNum1000(value);
	}
	
	/**
	 * 	Update LnFacreqJobgrpNum1000 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLnFacreqJobgrpNum1000String(char[] value)  throws CFException{
		parms1000.setLnFacreqJobgrpNum1000(value);
	}	

	/**
	 *	Returns the value of ip64801LrmJobgrpNum
	 *	@return ip64801LrmJobgrpNum
	 */
	public int getIp64801LrmJobgrpNum() throws CFException {
   		return ip64801LrmCommBlock.getIp64801LrmJobgrpNum();
	}


	/**
	 *	Returns String value of ip64801LrmJobgrpNum
	 *	@return ip64801LrmJobgrpNum
	 */
	public char[]  getIp64801LrmJobgrpNumString() throws CFException {
	     return String.valueOf(ip64801LrmCommBlock.getIp64801LrmJobgrpNumString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip64801LrmJobgrpNumIsNumeric()  throws CFException{
	    return ip64801LrmCommBlock.ip64801LrmJobgrpNumIsNumeric();
	}

	/**
	 * 	Update Ip64801LrmJobgrpNum with the passed value
	 *	@param number
	 */
	public void setIp64801LrmJobgrpNum(int number)  throws CFException{
		ip64801LrmCommBlock.setIp64801LrmJobgrpNum(number);
	}
	

	public void setIp64801LrmJobgrpNum(long number)  throws CFException{
	    ip64801LrmCommBlock.setIp64801LrmJobgrpNum(number);
	}
	
	
	/**
	 * 	Update Ip64801LrmJobgrpNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp64801LrmJobgrpNum(char[] value)  throws CFException {
		ip64801LrmCommBlock.setIp64801LrmJobgrpNum(value);
	}
	
	/**
	 * 	Update Ip64801LrmJobgrpNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp64801LrmJobgrpNumString(char[] value)  throws CFException{
		ip64801LrmCommBlock.setIp64801LrmJobgrpNum(value);
	}	

	/**
	 *	Returns the value of lnParm911Retry1000
	 *	@return lnParm911Retry1000
	 */
	public int getLnParm911Retry1000() throws CFException {
   		return parms1000.getLnParm911Retry1000();
	}


	/**
	 *	Returns String value of lnParm911Retry1000
	 *	@return lnParm911Retry1000
	 */
	public char[]  getLnParm911Retry1000String() throws CFException {
	     return String.valueOf(parms1000.getLnParm911Retry1000String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lnParm911Retry1000IsNumeric()  throws CFException{
	    return parms1000.lnParm911Retry1000IsNumeric();
	}

	/**
	 * 	Update LnParm911Retry1000 with the passed value
	 *	@param number
	 */
	public void setLnParm911Retry1000(int number)  throws CFException{
		parms1000.setLnParm911Retry1000(number);
	}
	

	public void setLnParm911Retry1000(long number)  throws CFException{
	    parms1000.setLnParm911Retry1000(number);
	}
	
	
	/**
	 * 	Update LnParm911Retry1000 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLnParm911Retry1000(char[] value)  throws CFException {
		parms1000.setLnParm911Retry1000(value);
	}
	
	/**
	 * 	Update LnParm911Retry1000 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLnParm911Retry1000String(char[] value)  throws CFException{
		parms1000.setLnParm911Retry1000(value);
	}	

	/**
	 *	Returns the value of lnFacreqJobgrpName1000
	 *	@return lnFacreqJobgrpName1000
	 */
   public char[] getLnFacreqJobgrpName1000() throws CFException  {              
   		return parms1000.getLnFacreqJobgrpName1000();
   }

  
	/**
	*  set variable lnFacreqJobgrpName1000
	*  @param value
	**/
   public void setLnFacreqJobgrpName1000(char[] value) throws CFException {
      parms1000.setLnFacreqJobgrpName1000(value);
   } 

     /**
	 * 	Update LnFacreqJobgrpName1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(char[] source, int sourceIndex) throws CFException {
      parms1000.setLnFacreqJobgrpName1000(source, sourceIndex);
   	
   }
   
   public void setLnFacreqJobgrpName1000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      parms1000.setLnFacreqJobgrpName1000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LnFacreqJobgrpName1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parms1000.setLnFacreqJobgrpName1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LnFacreqJobgrpName1000 with another Field
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(Field source) {
      parms1000.setLnFacreqJobgrpName1000(source);
   }  
   
     /**
	 * 	Update LnFacreqJobgrpName1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(Field source, int sourceIndex,int sourceLen) {
      parms1000.setLnFacreqJobgrpName1000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LnFacreqJobgrpName1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parms1000.setLnFacreqJobgrpName1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip30881911RetryValue
	 *	@return ip30881911RetryValue
	 */
	public int getIp30881911RetryValue() throws CFException {
   		return ip30881Db2McwaitInputValue.getIp30881911RetryValue();
	}


	/**
	 *	Returns String value of ip30881911RetryValue
	 *	@return ip30881911RetryValue
	 */
	public char[]  getIp30881911RetryValueString() throws CFException {
	     return String.valueOf(ip30881Db2McwaitInputValue.getIp30881911RetryValueString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip30881911RetryValueIsNumeric()  throws CFException{
	    return ip30881Db2McwaitInputValue.ip30881911RetryValueIsNumeric();
	}

	/**
	 * 	Update Ip30881911RetryValue with the passed value
	 *	@param number
	 */
	public void setIp30881911RetryValue(int number)  throws CFException{
		ip30881Db2McwaitInputValue.setIp30881911RetryValue(number);
	}
	

	public void setIp30881911RetryValue(long number)  throws CFException{
	    ip30881Db2McwaitInputValue.setIp30881911RetryValue(number);
	}
	
	
	/**
	 * 	Update Ip30881911RetryValue with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp30881911RetryValue(char[] value)  throws CFException {
		ip30881Db2McwaitInputValue.setIp30881911RetryValue(value);
	}
	
	/**
	 * 	Update Ip30881911RetryValue with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp30881911RetryValueString(char[] value)  throws CFException{
		ip30881Db2McwaitInputValue.setIp30881911RetryValue(value);
	}	

	/**
	 *	Returns the value of ip64801LrmJobgrpName
	 *	@return ip64801LrmJobgrpName
	 */
   public char[] getIp64801LrmJobgrpName() throws CFException  {              
   		return ip64801LrmCommBlock.getIp64801LrmJobgrpName();
   }

  
	/**
	*  set variable ip64801LrmJobgrpName
	*  @param value
	**/
   public void setIp64801LrmJobgrpName(char[] value) throws CFException {
      ip64801LrmCommBlock.setIp64801LrmJobgrpName(value);
   } 

     /**
	 * 	Update Ip64801LrmJobgrpName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp64801LrmJobgrpName(char[] source, int sourceIndex) throws CFException {
      ip64801LrmCommBlock.setIp64801LrmJobgrpName(source, sourceIndex);
   	
   }
   
   public void setIp64801LrmJobgrpName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip64801LrmCommBlock.setIp64801LrmJobgrpName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip64801LrmJobgrpName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp64801LrmJobgrpName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip64801LrmCommBlock.setIp64801LrmJobgrpName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip64801LrmJobgrpName with another Field
	 *	@param value
	 */
   public void setIp64801LrmJobgrpName(Field source) {
      ip64801LrmCommBlock.setIp64801LrmJobgrpName(source);
   }  
   
     /**
	 * 	Update Ip64801LrmJobgrpName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp64801LrmJobgrpName(Field source, int sourceIndex,int sourceLen) {
      ip64801LrmCommBlock.setIp64801LrmJobgrpName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip64801LrmJobgrpName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp64801LrmJobgrpName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip64801LrmCommBlock.setIp64801LrmJobgrpName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip64801LrmCommBlock.hashCode();
        str += parms1000.hashCode();
        str += ip30881Db2McwaitInputValue.hashCode();
       return str.hashCode();
    }

    public StartLrmOutCtx clone() {
        StartLrmOutCtx cloneObj = new StartLrmOutCtx();
        cloneObj.ip64801LrmCommBlock = new Ip64801LrmCommBlock();
        cloneObj.ip64801LrmCommBlock.set(ip64801LrmCommBlock.getClonedField());
        cloneObj.parms1000 = new Parms1000();
        cloneObj.parms1000.set(parms1000.getClonedField());
        cloneObj.ip30881Db2McwaitInputValue = new Ip30881Db2McwaitInputValue();
        cloneObj.ip30881Db2McwaitInputValue.set(ip30881Db2McwaitInputValue.getClonedField());
        return cloneObj;
    }

    }

    public StartLrmOutCtx getStartLrmOutCtx() {
            return new StartLrmOutCtx();
    }
     public class ConnectMqInCtx implements Cloneable {
     Ip89011EnvironmentIndArea ip89011EnvironmentIndArea = Ip829010Ctx.this.getIp89011EnvironmentIndArea();
     Ip7052f4MqApiLayout ip7052f4MqApiLayout = Ip829010Ctx.this.getIp7052f4MqApiLayout();
     QueueVars800 queueVars800 = Ip829010Ctx.this.getQueueVars800();
     Ip57901Tipaqpr ip57901Tipaqpr = Ip829010Ctx.this.getIp57901Tipaqpr();
     Parms1000 parms1000 = Ip829010Ctx.this.getParms1000();
     Ip34051MqProcessParameters ip34051MqProcessParameters = Ip829010Ctx.this.getIp34051MqProcessParameters();
     LinkVariable800 linkVariable800 = Ip829010Ctx.this.getLinkVariable800();
     Ip70511Table ip70511Table = Ip829010Ctx.this.getIp70511Table();
     Work work = Ip829010Ctx.this.getWork();
     Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable = Ip829010Ctx.this.getIp02015PrcssAgrmtTable();

	/**
	 *	Returns the value of ip7052f4QName
	 *	@return ip7052f4QName
	 */
   public char[] getIp7052f4QName() throws CFException  {              
   		return ip7052f4MqApiLayout.getIp7052f4QName();
   }

  
	/**
	*  set variable ip7052f4QName
	*  @param value
	**/
   public void setIp7052f4QName(char[] value) throws CFException {
      ip7052f4MqApiLayout.setIp7052f4QName(value);
   } 

     /**
	 * 	Update Ip7052f4QName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052f4QName(char[] source, int sourceIndex) throws CFException {
      ip7052f4MqApiLayout.setIp7052f4QName(source, sourceIndex);
   	
   }
   
   public void setIp7052f4QName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip7052f4MqApiLayout.setIp7052f4QName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip7052f4QName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4QName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip7052f4MqApiLayout.setIp7052f4QName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip7052f4QName with another Field
	 *	@param value
	 */
   public void setIp7052f4QName(Field source) {
      ip7052f4MqApiLayout.setIp7052f4QName(source);
   }  
   
     /**
	 * 	Update Ip7052f4QName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052f4QName(Field source, int sourceIndex,int sourceLen) {
      ip7052f4MqApiLayout.setIp7052f4QName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip7052f4QName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4QName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip7052f4MqApiLayout.setIp7052f4QName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lnFacreqJobgrpNum1000
	 *	@return lnFacreqJobgrpNum1000
	 */
	public int getLnFacreqJobgrpNum1000() throws CFException {
   		return parms1000.getLnFacreqJobgrpNum1000();
	}


	/**
	 *	Returns String value of lnFacreqJobgrpNum1000
	 *	@return lnFacreqJobgrpNum1000
	 */
	public char[]  getLnFacreqJobgrpNum1000String() throws CFException {
	     return String.valueOf(parms1000.getLnFacreqJobgrpNum1000String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lnFacreqJobgrpNum1000IsNumeric()  throws CFException{
	    return parms1000.lnFacreqJobgrpNum1000IsNumeric();
	}

	/**
	 * 	Update LnFacreqJobgrpNum1000 with the passed value
	 *	@param number
	 */
	public void setLnFacreqJobgrpNum1000(int number)  throws CFException{
		parms1000.setLnFacreqJobgrpNum1000(number);
	}
	

	public void setLnFacreqJobgrpNum1000(long number)  throws CFException{
	    parms1000.setLnFacreqJobgrpNum1000(number);
	}
	
	
	/**
	 * 	Update LnFacreqJobgrpNum1000 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLnFacreqJobgrpNum1000(char[] value)  throws CFException {
		parms1000.setLnFacreqJobgrpNum1000(value);
	}
	
	/**
	 * 	Update LnFacreqJobgrpNum1000 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLnFacreqJobgrpNum1000String(char[] value)  throws CFException{
		parms1000.setLnFacreqJobgrpNum1000(value);
	}	

	/**
	 *	Returns the value of ip7052f4Hconn
	 *	@return ip7052f4Hconn
	 */
	public int getIp7052f4Hconn() throws CFException {        
   		return ip7052f4MqApiLayout.getIp7052f4Hconn();
	}
	
	/**
	 * 	Update Ip7052f4Hconn with the passed value
	 *	@param number
	 */
	public void setIp7052f4Hconn(int number)  throws CFException{
		ip7052f4MqApiLayout.setIp7052f4Hconn(number);
	}


	public void setIp7052f4Hconn(long number)  throws CFException{
		ip7052f4MqApiLayout.setIp7052f4Hconn((int)number);
	}


	/**
	 *	Returns the value of lnCloneOwnerId1000
	 *	@return lnCloneOwnerId1000
	 */
   public char[] getLnCloneOwnerId1000() throws CFException  {              
   		return parms1000.getLnCloneOwnerId1000();
   }

  
	/**
	*  set variable lnCloneOwnerId1000
	*  @param value
	**/
   public void setLnCloneOwnerId1000(char[] value) throws CFException {
      parms1000.setLnCloneOwnerId1000(value);
   } 

     /**
	 * 	Update LnCloneOwnerId1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLnCloneOwnerId1000(char[] source, int sourceIndex) throws CFException {
      parms1000.setLnCloneOwnerId1000(source, sourceIndex);
   	
   }
   
   public void setLnCloneOwnerId1000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      parms1000.setLnCloneOwnerId1000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LnCloneOwnerId1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLnCloneOwnerId1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parms1000.setLnCloneOwnerId1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LnCloneOwnerId1000 with another Field
	 *	@param value
	 */
   public void setLnCloneOwnerId1000(Field source) {
      parms1000.setLnCloneOwnerId1000(source);
   }  
   
     /**
	 * 	Update LnCloneOwnerId1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLnCloneOwnerId1000(Field source, int sourceIndex,int sourceLen) {
      parms1000.setLnCloneOwnerId1000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LnCloneOwnerId1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLnCloneOwnerId1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parms1000.setLnCloneOwnerId1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "G" for isIp02015HostPaGlobal88()
	 *	@return  Returns true if isIp02015HostPaGlobal88() is "G"
	 */
   public boolean isIp02015HostPaGlobal88() throws CFException {
      return ip02015PrcssAgrmtTable.isIp02015HostPaGlobal88();
   }

	/**
	*  set values "G"
	*/
   	public void setIp02015HostPaGlobal88True()  throws CFException{  			
    	ip02015PrcssAgrmtTable.setIp02015HostPaGlobal88True();
   	}
	/**
	 *	Returns the value of ip7052f4TargetQmgrName
	 *	@return ip7052f4TargetQmgrName
	 */
   public char[] getIp7052f4TargetQmgrName() throws CFException  {              
   		return ip7052f4MqApiLayout.getIp7052f4TargetQmgrName();
   }

  
	/**
	*  set variable ip7052f4TargetQmgrName
	*  @param value
	**/
   public void setIp7052f4TargetQmgrName(char[] value) throws CFException {
      ip7052f4MqApiLayout.setIp7052f4TargetQmgrName(value);
   } 

     /**
	 * 	Update Ip7052f4TargetQmgrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052f4TargetQmgrName(char[] source, int sourceIndex) throws CFException {
      ip7052f4MqApiLayout.setIp7052f4TargetQmgrName(source, sourceIndex);
   	
   }
   
   public void setIp7052f4TargetQmgrName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip7052f4MqApiLayout.setIp7052f4TargetQmgrName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip7052f4TargetQmgrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4TargetQmgrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip7052f4MqApiLayout.setIp7052f4TargetQmgrName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip7052f4TargetQmgrName with another Field
	 *	@param value
	 */
   public void setIp7052f4TargetQmgrName(Field source) {
      ip7052f4MqApiLayout.setIp7052f4TargetQmgrName(source);
   }  
   
     /**
	 * 	Update Ip7052f4TargetQmgrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052f4TargetQmgrName(Field source, int sourceIndex,int sourceLen) {
      ip7052f4MqApiLayout.setIp7052f4TargetQmgrName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip7052f4TargetQmgrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4TargetQmgrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip7052f4MqApiLayout.setIp7052f4TargetQmgrName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip7052f4QmgrName
	 *	@return ip7052f4QmgrName
	 */
   public char[] getIp7052f4QmgrName() throws CFException  {              
   		return ip7052f4MqApiLayout.getIp7052f4QmgrName();
   }

  
	/**
	*  set variable ip7052f4QmgrName
	*  @param value
	**/
   public void setIp7052f4QmgrName(char[] value) throws CFException {
      ip7052f4MqApiLayout.setIp7052f4QmgrName(value);
   } 

     /**
	 * 	Update Ip7052f4QmgrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052f4QmgrName(char[] source, int sourceIndex) throws CFException {
      ip7052f4MqApiLayout.setIp7052f4QmgrName(source, sourceIndex);
   	
   }
   
   public void setIp7052f4QmgrName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip7052f4MqApiLayout.setIp7052f4QmgrName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip7052f4QmgrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4QmgrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip7052f4MqApiLayout.setIp7052f4QmgrName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip7052f4QmgrName with another Field
	 *	@param value
	 */
   public void setIp7052f4QmgrName(Field source) {
      ip7052f4MqApiLayout.setIp7052f4QmgrName(source);
   }  
   
     /**
	 * 	Update Ip7052f4QmgrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052f4QmgrName(Field source, int sourceIndex,int sourceLen) {
      ip7052f4MqApiLayout.setIp7052f4QmgrName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip7052f4QmgrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4QmgrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip7052f4MqApiLayout.setIp7052f4QmgrName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ptrIp703020800
	 *	@return ptrIp703020800
	 */
   public char[] getPtrIp703020800() throws CFException  {              
   		return work.getPtrIp703020800();
   }

  
	/**
	*  set variable ptrIp703020800
	*  @param value
	**/
   public void setPtrIp703020800(char[] value) throws CFException {
      work.setPtrIp703020800(value);
   } 

	/**
	 *	Returns the value of ip89011Environment
	 *	@return ip89011Environment
	 */
   public char[] getIp89011Environment() throws CFException  {              
   		return ip89011EnvironmentIndArea.getIp89011Environment();
   }

  
	/**
	*  set variable ip89011Environment
	*  @param value
	**/
   public void setIp89011Environment(char[] value) throws CFException {
      ip89011EnvironmentIndArea.setIp89011Environment(value);
   } 

     /**
	 * 	Update Ip89011Environment 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp89011Environment(char[] source, int sourceIndex) throws CFException {
      ip89011EnvironmentIndArea.setIp89011Environment(source, sourceIndex);
   	
   }
   
   public void setIp89011Environment(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip89011EnvironmentIndArea.setIp89011Environment(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip89011Environment 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp89011Environment(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip89011EnvironmentIndArea.setIp89011Environment(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip89011Environment with another Field
	 *	@param value
	 */
   public void setIp89011Environment(Field source) {
      ip89011EnvironmentIndArea.setIp89011Environment(source);
   }  
   
     /**
	 * 	Update Ip89011Environment 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp89011Environment(Field source, int sourceIndex,int sourceLen) {
      ip89011EnvironmentIndArea.setIp89011Environment(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip89011Environment 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp89011Environment(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip89011EnvironmentIndArea.setIp89011Environment(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lnFacreqJobgrpName1000
	 *	@return lnFacreqJobgrpName1000
	 */
   public char[] getLnFacreqJobgrpName1000() throws CFException  {              
   		return parms1000.getLnFacreqJobgrpName1000();
   }

  
	/**
	*  set variable lnFacreqJobgrpName1000
	*  @param value
	**/
   public void setLnFacreqJobgrpName1000(char[] value) throws CFException {
      parms1000.setLnFacreqJobgrpName1000(value);
   } 

     /**
	 * 	Update LnFacreqJobgrpName1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(char[] source, int sourceIndex) throws CFException {
      parms1000.setLnFacreqJobgrpName1000(source, sourceIndex);
   	
   }
   
   public void setLnFacreqJobgrpName1000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      parms1000.setLnFacreqJobgrpName1000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LnFacreqJobgrpName1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parms1000.setLnFacreqJobgrpName1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LnFacreqJobgrpName1000 with another Field
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(Field source) {
      parms1000.setLnFacreqJobgrpName1000(source);
   }  
   
     /**
	 * 	Update LnFacreqJobgrpName1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(Field source, int sourceIndex,int sourceLen) {
      parms1000.setLnFacreqJobgrpName1000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LnFacreqJobgrpName1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parms1000.setLnFacreqJobgrpName1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip7052f4TargetQName
	 *	@return ip7052f4TargetQName
	 */
   public char[] getIp7052f4TargetQName() throws CFException  {              
   		return ip7052f4MqApiLayout.getIp7052f4TargetQName();
   }

  
	/**
	*  set variable ip7052f4TargetQName
	*  @param value
	**/
   public void setIp7052f4TargetQName(char[] value) throws CFException {
      ip7052f4MqApiLayout.setIp7052f4TargetQName(value);
   } 

     /**
	 * 	Update Ip7052f4TargetQName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052f4TargetQName(char[] source, int sourceIndex) throws CFException {
      ip7052f4MqApiLayout.setIp7052f4TargetQName(source, sourceIndex);
   	
   }
   
   public void setIp7052f4TargetQName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip7052f4MqApiLayout.setIp7052f4TargetQName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip7052f4TargetQName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4TargetQName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip7052f4MqApiLayout.setIp7052f4TargetQName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip7052f4TargetQName with another Field
	 *	@param value
	 */
   public void setIp7052f4TargetQName(Field source) {
      ip7052f4MqApiLayout.setIp7052f4TargetQName(source);
   }  
   
     /**
	 * 	Update Ip7052f4TargetQName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052f4TargetQName(Field source, int sourceIndex,int sourceLen) {
      ip7052f4MqApiLayout.setIp7052f4TargetQName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip7052f4TargetQName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4TargetQName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip7052f4MqApiLayout.setIp7052f4TargetQName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip7052f4Hobj
	 *	@return ip7052f4Hobj
	 */
	public int getIp7052f4Hobj() throws CFException {        
   		return ip7052f4MqApiLayout.getIp7052f4Hobj();
	}
	
	/**
	 * 	Update Ip7052f4Hobj with the passed value
	 *	@param number
	 */
	public void setIp7052f4Hobj(int number)  throws CFException{
		ip7052f4MqApiLayout.setIp7052f4Hobj(number);
	}


	public void setIp7052f4Hobj(long number)  throws CFException{
		ip7052f4MqApiLayout.setIp7052f4Hobj((int)number);
	}



        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public ConnectMqOutCtx getConnectMqOutCtx() {
            return new ConnectMqOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip89011EnvironmentIndArea.hashCode();
        str += ip7052f4MqApiLayout.hashCode();
        str += queueVars800.hashCode();
        str += ip57901Tipaqpr.hashCode();
        str += parms1000.hashCode();
        str += ip34051MqProcessParameters.hashCode();
        str += linkVariable800.hashCode();
        str += ip70511Table.hashCode();
        str += work.hashCode();
        str += ip02015PrcssAgrmtTable.hashCode();
       return str.hashCode();
    }

    public ConnectMqInCtx clone() {
        ConnectMqInCtx cloneObj = new ConnectMqInCtx();
        cloneObj.ip89011EnvironmentIndArea = new Ip89011EnvironmentIndArea();
        cloneObj.ip89011EnvironmentIndArea.set(ip89011EnvironmentIndArea.getClonedField());
        cloneObj.ip7052f4MqApiLayout = new Ip7052f4MqApiLayout();
        cloneObj.ip7052f4MqApiLayout.set(ip7052f4MqApiLayout.getClonedField());
        cloneObj.queueVars800 = new QueueVars800();
        cloneObj.queueVars800.set(queueVars800.getClonedField());
        cloneObj.ip57901Tipaqpr = new Ip57901Tipaqpr();
        cloneObj.ip57901Tipaqpr.set(ip57901Tipaqpr.getClonedField());
        cloneObj.parms1000 = new Parms1000();
        cloneObj.parms1000.set(parms1000.getClonedField());
        cloneObj.ip34051MqProcessParameters = new Ip34051MqProcessParameters();
        cloneObj.ip34051MqProcessParameters.set(ip34051MqProcessParameters.getClonedField());
        cloneObj.linkVariable800 = new LinkVariable800();
        cloneObj.linkVariable800.set(linkVariable800.getClonedField());
        cloneObj.ip70511Table = new Ip70511Table();
        cloneObj.ip70511Table.set(ip70511Table.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        return cloneObj;
    }

    }

    public ConnectMqInCtx getConnectMqInCtx() {
            return new ConnectMqInCtx();
    }
     public class ConnectMqOutCtx implements Cloneable {
     Ip89011EnvironmentIndArea ip89011EnvironmentIndArea = Ip829010Ctx.this.getIp89011EnvironmentIndArea();
     Ip7052f4MqApiLayout ip7052f4MqApiLayout = Ip829010Ctx.this.getIp7052f4MqApiLayout();
     QueueVars800 queueVars800 = Ip829010Ctx.this.getQueueVars800();
     Ip57901Tipaqpr ip57901Tipaqpr = Ip829010Ctx.this.getIp57901Tipaqpr();
     Parms1000 parms1000 = Ip829010Ctx.this.getParms1000();
     Ip34051MqProcessParameters ip34051MqProcessParameters = Ip829010Ctx.this.getIp34051MqProcessParameters();
     LinkVariable800 linkVariable800 = Ip829010Ctx.this.getLinkVariable800();
     Ip70511Table ip70511Table = Ip829010Ctx.this.getIp70511Table();
     Work work = Ip829010Ctx.this.getWork();
     Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable = Ip829010Ctx.this.getIp02015PrcssAgrmtTable();

	/**
	 *	Returns the value of ip7052f4QmgrName
	 *	@return ip7052f4QmgrName
	 */
   public char[] getIp7052f4QmgrName() throws CFException  {              
   		return ip7052f4MqApiLayout.getIp7052f4QmgrName();
   }

  
	/**
	*  set variable ip7052f4QmgrName
	*  @param value
	**/
   public void setIp7052f4QmgrName(char[] value) throws CFException {
      ip7052f4MqApiLayout.setIp7052f4QmgrName(value);
   } 

     /**
	 * 	Update Ip7052f4QmgrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052f4QmgrName(char[] source, int sourceIndex) throws CFException {
      ip7052f4MqApiLayout.setIp7052f4QmgrName(source, sourceIndex);
   	
   }
   
   public void setIp7052f4QmgrName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip7052f4MqApiLayout.setIp7052f4QmgrName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip7052f4QmgrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4QmgrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip7052f4MqApiLayout.setIp7052f4QmgrName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip7052f4QmgrName with another Field
	 *	@param value
	 */
   public void setIp7052f4QmgrName(Field source) {
      ip7052f4MqApiLayout.setIp7052f4QmgrName(source);
   }  
   
     /**
	 * 	Update Ip7052f4QmgrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052f4QmgrName(Field source, int sourceIndex,int sourceLen) {
      ip7052f4MqApiLayout.setIp7052f4QmgrName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip7052f4QmgrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4QmgrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip7052f4MqApiLayout.setIp7052f4QmgrName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "S" for isIp34051RespnseQ88()
	 *	@return  Returns true if isIp34051RespnseQ88() is "S"
	 */
   public boolean isIp34051RespnseQ88() throws CFException {
      return ip34051MqProcessParameters.isIp34051RespnseQ88();
   }

	/**
	*  set values "S"
	*/
   	public void setIp34051RespnseQ88True()  throws CFException{  			
    	ip34051MqProcessParameters.setIp34051RespnseQ88True();
   	}
	/**
	 *	Returns the value of ip7052f4TargetQName
	 *	@return ip7052f4TargetQName
	 */
   public char[] getIp7052f4TargetQName() throws CFException  {              
   		return ip7052f4MqApiLayout.getIp7052f4TargetQName();
   }

  
	/**
	*  set variable ip7052f4TargetQName
	*  @param value
	**/
   public void setIp7052f4TargetQName(char[] value) throws CFException {
      ip7052f4MqApiLayout.setIp7052f4TargetQName(value);
   } 

     /**
	 * 	Update Ip7052f4TargetQName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052f4TargetQName(char[] source, int sourceIndex) throws CFException {
      ip7052f4MqApiLayout.setIp7052f4TargetQName(source, sourceIndex);
   	
   }
   
   public void setIp7052f4TargetQName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip7052f4MqApiLayout.setIp7052f4TargetQName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip7052f4TargetQName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4TargetQName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip7052f4MqApiLayout.setIp7052f4TargetQName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip7052f4TargetQName with another Field
	 *	@param value
	 */
   public void setIp7052f4TargetQName(Field source) {
      ip7052f4MqApiLayout.setIp7052f4TargetQName(source);
   }  
   
     /**
	 * 	Update Ip7052f4TargetQName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052f4TargetQName(Field source, int sourceIndex,int sourceLen) {
      ip7052f4MqApiLayout.setIp7052f4TargetQName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip7052f4TargetQName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4TargetQName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip7052f4MqApiLayout.setIp7052f4TargetQName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of resHobj800
	 *	@return resHobj800
	 */
	public int getResHobj800() throws CFException {        
   		return queueVars800.getResHobj800();
	}
	
	/**
	 * 	Update ResHobj800 with the passed value
	 *	@param number
	 */
	public void setResHobj800(int number)  throws CFException{
		queueVars800.setResHobj800(number);
	}


	public void setResHobj800(long number)  throws CFException{
		queueVars800.setResHobj800((int)number);
	}


	/**
	 *	Returns the value of lnCloneOwnerId800
	 *	@return lnCloneOwnerId800
	 */
   public char[] getLnCloneOwnerId800() throws CFException  {              
   		return linkVariable800.getLnCloneOwnerId800();
   }

  
	/**
	*  set variable lnCloneOwnerId800
	*  @param value
	**/
   public void setLnCloneOwnerId800(char[] value) throws CFException {
      linkVariable800.setLnCloneOwnerId800(value);
   } 

     /**
	 * 	Update LnCloneOwnerId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLnCloneOwnerId800(char[] source, int sourceIndex) throws CFException {
      linkVariable800.setLnCloneOwnerId800(source, sourceIndex);
   	
   }
   
   public void setLnCloneOwnerId800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      linkVariable800.setLnCloneOwnerId800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LnCloneOwnerId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLnCloneOwnerId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      linkVariable800.setLnCloneOwnerId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LnCloneOwnerId800 with another Field
	 *	@param value
	 */
   public void setLnCloneOwnerId800(Field source) {
      linkVariable800.setLnCloneOwnerId800(source);
   }  
   
     /**
	 * 	Update LnCloneOwnerId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLnCloneOwnerId800(Field source, int sourceIndex,int sourceLen) {
      linkVariable800.setLnCloneOwnerId800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LnCloneOwnerId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLnCloneOwnerId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      linkVariable800.setLnCloneOwnerId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip70511EnvCd
	 *	@return ip70511EnvCd
	 */
   public char[] getIp70511EnvCd() throws CFException  {              
   		return ip70511Table.getIp70511TableKey().getIp70511EnvCd();
   }

  
	/**
	*  set variable ip70511EnvCd
	*  @param value
	**/
   public void setIp70511EnvCd(char[] value) throws CFException {
      ip70511Table.getIp70511TableKey().setIp70511EnvCd(value);
   } 

     /**
	 * 	Update Ip70511EnvCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70511EnvCd(char[] source, int sourceIndex) throws CFException {
      ip70511Table.getIp70511TableKey().setIp70511EnvCd(source, sourceIndex);
   	
   }
   
   public void setIp70511EnvCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70511Table.getIp70511TableKey().setIp70511EnvCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70511EnvCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70511EnvCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70511Table.getIp70511TableKey().setIp70511EnvCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70511EnvCd with another Field
	 *	@param value
	 */
   public void setIp70511EnvCd(Field source) {
      ip70511Table.getIp70511TableKey().setIp70511EnvCd(source);
   }  
   
     /**
	 * 	Update Ip70511EnvCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70511EnvCd(Field source, int sourceIndex,int sourceLen) {
      ip70511Table.getIp70511TableKey().setIp70511EnvCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70511EnvCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70511EnvCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70511Table.getIp70511TableKey().setIp70511EnvCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lnFacreqJobgrpNum1000
	 *	@return lnFacreqJobgrpNum1000
	 */
	public int getLnFacreqJobgrpNum1000() throws CFException {
   		return parms1000.getLnFacreqJobgrpNum1000();
	}


	/**
	 *	Returns String value of lnFacreqJobgrpNum1000
	 *	@return lnFacreqJobgrpNum1000
	 */
	public char[]  getLnFacreqJobgrpNum1000String() throws CFException {
	     return String.valueOf(parms1000.getLnFacreqJobgrpNum1000String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lnFacreqJobgrpNum1000IsNumeric()  throws CFException{
	    return parms1000.lnFacreqJobgrpNum1000IsNumeric();
	}

	/**
	 * 	Update LnFacreqJobgrpNum1000 with the passed value
	 *	@param number
	 */
	public void setLnFacreqJobgrpNum1000(int number)  throws CFException{
		parms1000.setLnFacreqJobgrpNum1000(number);
	}
	

	public void setLnFacreqJobgrpNum1000(long number)  throws CFException{
	    parms1000.setLnFacreqJobgrpNum1000(number);
	}
	
	
	/**
	 * 	Update LnFacreqJobgrpNum1000 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLnFacreqJobgrpNum1000(char[] value)  throws CFException {
		parms1000.setLnFacreqJobgrpNum1000(value);
	}
	
	/**
	 * 	Update LnFacreqJobgrpNum1000 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLnFacreqJobgrpNum1000String(char[] value)  throws CFException{
		parms1000.setLnFacreqJobgrpNum1000(value);
	}	

	/**
	 *	Returns the value of resHconn800
	 *	@return resHconn800
	 */
	public int getResHconn800() throws CFException {        
   		return queueVars800.getResHconn800();
	}
	
	/**
	 * 	Update ResHconn800 with the passed value
	 *	@param number
	 */
	public void setResHconn800(int number)  throws CFException{
		queueVars800.setResHconn800(number);
	}


	public void setResHconn800(long number)  throws CFException{
		queueVars800.setResHconn800((int)number);
	}


	/**
	 *	Returns the value of ip7052f4Hconn
	 *	@return ip7052f4Hconn
	 */
	public int getIp7052f4Hconn() throws CFException {        
   		return ip7052f4MqApiLayout.getIp7052f4Hconn();
	}
	
	/**
	 * 	Update Ip7052f4Hconn with the passed value
	 *	@param number
	 */
	public void setIp7052f4Hconn(int number)  throws CFException{
		ip7052f4MqApiLayout.setIp7052f4Hconn(number);
	}


	public void setIp7052f4Hconn(long number)  throws CFException{
		ip7052f4MqApiLayout.setIp7052f4Hconn((int)number);
	}


	/**
	 *	Test condition "0007" for isIp34051ServCdFra88()
	 *	@return  Returns true if isIp34051ServCdFra88() is "0007"
	 */
   public boolean isIp34051ServCdFra88() throws CFException {
      return ip34051MqProcessParameters.isIp34051ServCdFra88();
   }

	/**
	*  set values "0007"
	*/
   	public void setIp34051ServCdFra88True()  throws CFException{  			
    	ip34051MqProcessParameters.setIp34051ServCdFra88True();
   	}
	/**
	 *	Test condition "0002" for isIp34051FuncCdCha88()
	 *	@return  Returns true if isIp34051FuncCdCha88() is "0002"
	 */
   public boolean isIp34051FuncCdCha88() throws CFException {
      return ip34051MqProcessParameters.isIp34051FuncCdCha88();
   }

	/**
	*  set values "0002"
	*/
   	public void setIp34051FuncCdCha88True()  throws CFException{  			
    	ip34051MqProcessParameters.setIp34051FuncCdCha88True();
   	}
	/**
	 *	Returns the value of ip7052f4TargetQmgrName
	 *	@return ip7052f4TargetQmgrName
	 */
   public char[] getIp7052f4TargetQmgrName() throws CFException  {              
   		return ip7052f4MqApiLayout.getIp7052f4TargetQmgrName();
   }

  
	/**
	*  set variable ip7052f4TargetQmgrName
	*  @param value
	**/
   public void setIp7052f4TargetQmgrName(char[] value) throws CFException {
      ip7052f4MqApiLayout.setIp7052f4TargetQmgrName(value);
   } 

     /**
	 * 	Update Ip7052f4TargetQmgrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052f4TargetQmgrName(char[] source, int sourceIndex) throws CFException {
      ip7052f4MqApiLayout.setIp7052f4TargetQmgrName(source, sourceIndex);
   	
   }
   
   public void setIp7052f4TargetQmgrName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip7052f4MqApiLayout.setIp7052f4TargetQmgrName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip7052f4TargetQmgrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4TargetQmgrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip7052f4MqApiLayout.setIp7052f4TargetQmgrName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip7052f4TargetQmgrName with another Field
	 *	@param value
	 */
   public void setIp7052f4TargetQmgrName(Field source) {
      ip7052f4MqApiLayout.setIp7052f4TargetQmgrName(source);
   }  
   
     /**
	 * 	Update Ip7052f4TargetQmgrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052f4TargetQmgrName(Field source, int sourceIndex,int sourceLen) {
      ip7052f4MqApiLayout.setIp7052f4TargetQmgrName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip7052f4TargetQmgrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4TargetQmgrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip7052f4MqApiLayout.setIp7052f4TargetQmgrName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip89011Environment
	 *	@return ip89011Environment
	 */
   public char[] getIp89011Environment() throws CFException  {              
   		return ip89011EnvironmentIndArea.getIp89011Environment();
   }

  
	/**
	*  set variable ip89011Environment
	*  @param value
	**/
   public void setIp89011Environment(char[] value) throws CFException {
      ip89011EnvironmentIndArea.setIp89011Environment(value);
   } 

     /**
	 * 	Update Ip89011Environment 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp89011Environment(char[] source, int sourceIndex) throws CFException {
      ip89011EnvironmentIndArea.setIp89011Environment(source, sourceIndex);
   	
   }
   
   public void setIp89011Environment(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip89011EnvironmentIndArea.setIp89011Environment(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip89011Environment 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp89011Environment(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip89011EnvironmentIndArea.setIp89011Environment(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip89011Environment with another Field
	 *	@param value
	 */
   public void setIp89011Environment(Field source) {
      ip89011EnvironmentIndArea.setIp89011Environment(source);
   }  
   
     /**
	 * 	Update Ip89011Environment 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp89011Environment(Field source, int sourceIndex,int sourceLen) {
      ip89011EnvironmentIndArea.setIp89011Environment(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip89011Environment 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp89011Environment(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip89011EnvironmentIndArea.setIp89011Environment(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of resQmgrName800
	 *	@return resQmgrName800
	 */
   public char[] getResQmgrName800() throws CFException  {              
   		return queueVars800.getResQmgrName800();
   }

  
	/**
	*  set variable resQmgrName800
	*  @param value
	**/
   public void setResQmgrName800(char[] value) throws CFException {
      queueVars800.setResQmgrName800(value);
   } 

     /**
	 * 	Update ResQmgrName800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResQmgrName800(char[] source, int sourceIndex) throws CFException {
      queueVars800.setResQmgrName800(source, sourceIndex);
   	
   }
   
   public void setResQmgrName800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      queueVars800.setResQmgrName800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ResQmgrName800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResQmgrName800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      queueVars800.setResQmgrName800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ResQmgrName800 with another Field
	 *	@param value
	 */
   public void setResQmgrName800(Field source) {
      queueVars800.setResQmgrName800(source);
   }  
   
     /**
	 * 	Update ResQmgrName800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResQmgrName800(Field source, int sourceIndex,int sourceLen) {
      queueVars800.setResQmgrName800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ResQmgrName800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResQmgrName800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      queueVars800.setResQmgrName800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lnFacreqJobgrpName800
	 *	@return lnFacreqJobgrpName800
	 */
   public char[] getLnFacreqJobgrpName800() throws CFException  {              
   		return linkVariable800.getLnFacreqJobgrpName800();
   }

  
	/**
	*  set variable lnFacreqJobgrpName800
	*  @param value
	**/
   public void setLnFacreqJobgrpName800(char[] value) throws CFException {
      linkVariable800.setLnFacreqJobgrpName800(value);
   } 

     /**
	 * 	Update LnFacreqJobgrpName800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLnFacreqJobgrpName800(char[] source, int sourceIndex) throws CFException {
      linkVariable800.setLnFacreqJobgrpName800(source, sourceIndex);
   	
   }
   
   public void setLnFacreqJobgrpName800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      linkVariable800.setLnFacreqJobgrpName800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LnFacreqJobgrpName800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLnFacreqJobgrpName800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      linkVariable800.setLnFacreqJobgrpName800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LnFacreqJobgrpName800 with another Field
	 *	@param value
	 */
   public void setLnFacreqJobgrpName800(Field source) {
      linkVariable800.setLnFacreqJobgrpName800(source);
   }  
   
     /**
	 * 	Update LnFacreqJobgrpName800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLnFacreqJobgrpName800(Field source, int sourceIndex,int sourceLen) {
      linkVariable800.setLnFacreqJobgrpName800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LnFacreqJobgrpName800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLnFacreqJobgrpName800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      linkVariable800.setLnFacreqJobgrpName800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "Y" for isIp34051TipasvcActiveY88()
	 *	@return  Returns true if isIp34051TipasvcActiveY88() is "Y"
	 */
   public boolean isIp34051TipasvcActiveY88() throws CFException {
      return ip34051MqProcessParameters.isIp34051TipasvcActiveY88();
   }

	/**
	*  set values "Y"
	*/
   	public void setIp34051TipasvcActiveY88True()  throws CFException{  			
    	ip34051MqProcessParameters.setIp34051TipasvcActiveY88True();
   	}
	/**
	 *	Test condition "S" for isIp34051RequestStart88()
	 *	@return  Returns true if isIp34051RequestStart88() is "S"
	 */
   public boolean isIp34051RequestStart88() throws CFException {
      return ip34051MqProcessParameters.isIp34051RequestStart88();
   }

	/**
	*  set values "S"
	*/
   	public void setIp34051RequestStart88True()  throws CFException{  			
    	ip34051MqProcessParameters.setIp34051RequestStart88True();
   	}
	/**
	 *	Returns the value of queueVars800
	 *	@return queueVars800
	 */   
	 public QueueVars800 getQueueVars800() {
   	return queueVars800;
   }


	/**
	 *	Test condition "Q" for isIp34051RequestQ88()
	 *	@return  Returns true if isIp34051RequestQ88() is "Q"
	 */
   public boolean isIp34051RequestQ88() throws CFException {
      return ip34051MqProcessParameters.isIp34051RequestQ88();
   }

	/**
	*  set values "Q"
	*/
   	public void setIp34051RequestQ88True()  throws CFException{  			
    	ip34051MqProcessParameters.setIp34051RequestQ88True();
   	}
	/**
	 *	Returns the value of ip70511CloneOwnerId
	 *	@return ip70511CloneOwnerId
	 */
   public char[] getIp70511CloneOwnerId() throws CFException  {              
   		return ip70511Table.getIp70511TableKey().getIp70511CloneOwnerId();
   }

  
	/**
	*  set variable ip70511CloneOwnerId
	*  @param value
	**/
   public void setIp70511CloneOwnerId(char[] value) throws CFException {
      ip70511Table.getIp70511TableKey().setIp70511CloneOwnerId(value);
   } 

     /**
	 * 	Update Ip70511CloneOwnerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70511CloneOwnerId(char[] source, int sourceIndex) throws CFException {
      ip70511Table.getIp70511TableKey().setIp70511CloneOwnerId(source, sourceIndex);
   	
   }
   
   public void setIp70511CloneOwnerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70511Table.getIp70511TableKey().setIp70511CloneOwnerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70511CloneOwnerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70511CloneOwnerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70511Table.getIp70511TableKey().setIp70511CloneOwnerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70511CloneOwnerId with another Field
	 *	@param value
	 */
   public void setIp70511CloneOwnerId(Field source) {
      ip70511Table.getIp70511TableKey().setIp70511CloneOwnerId(source);
   }  
   
     /**
	 * 	Update Ip70511CloneOwnerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70511CloneOwnerId(Field source, int sourceIndex,int sourceLen) {
      ip70511Table.getIp70511TableKey().setIp70511CloneOwnerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70511CloneOwnerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70511CloneOwnerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70511Table.getIp70511TableKey().setIp70511CloneOwnerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of resQName800
	 *	@return resQName800
	 */
   public char[] getResQName800() throws CFException  {              
   		return queueVars800.getResQName800();
   }

  
	/**
	*  set variable resQName800
	*  @param value
	**/
   public void setResQName800(char[] value) throws CFException {
      queueVars800.setResQName800(value);
   } 

     /**
	 * 	Update ResQName800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResQName800(char[] source, int sourceIndex) throws CFException {
      queueVars800.setResQName800(source, sourceIndex);
   	
   }
   
   public void setResQName800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      queueVars800.setResQName800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ResQName800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResQName800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      queueVars800.setResQName800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ResQName800 with another Field
	 *	@param value
	 */
   public void setResQName800(Field source) {
      queueVars800.setResQName800(source);
   }  
   
     /**
	 * 	Update ResQName800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResQName800(Field source, int sourceIndex,int sourceLen) {
      queueVars800.setResQName800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ResQName800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResQName800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      queueVars800.setResQName800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip7052f4QName
	 *	@return ip7052f4QName
	 */
   public char[] getIp7052f4QName() throws CFException  {              
   		return ip7052f4MqApiLayout.getIp7052f4QName();
   }

  
	/**
	*  set variable ip7052f4QName
	*  @param value
	**/
   public void setIp7052f4QName(char[] value) throws CFException {
      ip7052f4MqApiLayout.setIp7052f4QName(value);
   } 

     /**
	 * 	Update Ip7052f4QName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052f4QName(char[] source, int sourceIndex) throws CFException {
      ip7052f4MqApiLayout.setIp7052f4QName(source, sourceIndex);
   	
   }
   
   public void setIp7052f4QName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip7052f4MqApiLayout.setIp7052f4QName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip7052f4QName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4QName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip7052f4MqApiLayout.setIp7052f4QName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip7052f4QName with another Field
	 *	@param value
	 */
   public void setIp7052f4QName(Field source) {
      ip7052f4MqApiLayout.setIp7052f4QName(source);
   }  
   
     /**
	 * 	Update Ip7052f4QName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052f4QName(Field source, int sourceIndex,int sourceLen) {
      ip7052f4MqApiLayout.setIp7052f4QName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip7052f4QName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4QName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip7052f4MqApiLayout.setIp7052f4QName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "Y" for isIp34051TipacliActiveY88()
	 *	@return  Returns true if isIp34051TipacliActiveY88() is "Y"
	 */
   public boolean isIp34051TipacliActiveY88() throws CFException {
      return ip34051MqProcessParameters.isIp34051TipacliActiveY88();
   }

	/**
	*  set values "Y"
	*/
   	public void setIp34051TipacliActiveY88True()  throws CFException{  			
    	ip34051MqProcessParameters.setIp34051TipacliActiveY88True();
   	}
	/**
	 *	Returns the value of lnFacreqJobgrpNum800
	 *	@return lnFacreqJobgrpNum800
	 */
   public char[] getLnFacreqJobgrpNum800() throws CFException  {              
   		return linkVariable800.getLnFacreqJobgrpNum800();
   }

  
	/**
	*  set variable lnFacreqJobgrpNum800
	*  @param value
	**/
   public void setLnFacreqJobgrpNum800(char[] value) throws CFException {
      linkVariable800.setLnFacreqJobgrpNum800(value);
   } 

     /**
	 * 	Update LnFacreqJobgrpNum800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLnFacreqJobgrpNum800(char[] source, int sourceIndex) throws CFException {
      linkVariable800.setLnFacreqJobgrpNum800(source, sourceIndex);
   	
   }
   
   public void setLnFacreqJobgrpNum800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      linkVariable800.setLnFacreqJobgrpNum800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LnFacreqJobgrpNum800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLnFacreqJobgrpNum800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      linkVariable800.setLnFacreqJobgrpNum800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LnFacreqJobgrpNum800 with another Field
	 *	@param value
	 */
   public void setLnFacreqJobgrpNum800(Field source) {
      linkVariable800.setLnFacreqJobgrpNum800(source);
   }  
   
     /**
	 * 	Update LnFacreqJobgrpNum800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLnFacreqJobgrpNum800(Field source, int sourceIndex,int sourceLen) {
      linkVariable800.setLnFacreqJobgrpNum800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LnFacreqJobgrpNum800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLnFacreqJobgrpNum800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      linkVariable800.setLnFacreqJobgrpNum800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip57901JobGroup
	 *	@return ip57901JobGroup
	 */
   public char[] getIp57901JobGroup() throws CFException  {              
   		return ip57901Tipaqpr.getIp57901TipaqprEntries().getIp57901JobGroup();
   }

  
	/**
	*  set variable ip57901JobGroup
	*  @param value
	**/
   public void setIp57901JobGroup(char[] value) throws CFException {
      ip57901Tipaqpr.getIp57901TipaqprEntries().setIp57901JobGroup(value);
   } 

     /**
	 * 	Update Ip57901JobGroup 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp57901JobGroup(char[] source, int sourceIndex) throws CFException {
      ip57901Tipaqpr.getIp57901TipaqprEntries().setIp57901JobGroup(source, sourceIndex);
   	
   }
   
   public void setIp57901JobGroup(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip57901Tipaqpr.getIp57901TipaqprEntries().setIp57901JobGroup(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip57901JobGroup 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp57901JobGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip57901Tipaqpr.getIp57901TipaqprEntries().setIp57901JobGroup(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip57901JobGroup with another Field
	 *	@param value
	 */
   public void setIp57901JobGroup(Field source) {
      ip57901Tipaqpr.getIp57901TipaqprEntries().setIp57901JobGroup(source);
   }  
   
     /**
	 * 	Update Ip57901JobGroup 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp57901JobGroup(Field source, int sourceIndex,int sourceLen) {
      ip57901Tipaqpr.getIp57901TipaqprEntries().setIp57901JobGroup(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip57901JobGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp57901JobGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip57901Tipaqpr.getIp57901TipaqprEntries().setIp57901JobGroup(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lnCloneOwnerId1000
	 *	@return lnCloneOwnerId1000
	 */
   public char[] getLnCloneOwnerId1000() throws CFException  {              
   		return parms1000.getLnCloneOwnerId1000();
   }

  
	/**
	*  set variable lnCloneOwnerId1000
	*  @param value
	**/
   public void setLnCloneOwnerId1000(char[] value) throws CFException {
      parms1000.setLnCloneOwnerId1000(value);
   } 

     /**
	 * 	Update LnCloneOwnerId1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLnCloneOwnerId1000(char[] source, int sourceIndex) throws CFException {
      parms1000.setLnCloneOwnerId1000(source, sourceIndex);
   	
   }
   
   public void setLnCloneOwnerId1000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      parms1000.setLnCloneOwnerId1000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LnCloneOwnerId1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLnCloneOwnerId1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parms1000.setLnCloneOwnerId1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LnCloneOwnerId1000 with another Field
	 *	@param value
	 */
   public void setLnCloneOwnerId1000(Field source) {
      parms1000.setLnCloneOwnerId1000(source);
   }  
   
     /**
	 * 	Update LnCloneOwnerId1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLnCloneOwnerId1000(Field source, int sourceIndex,int sourceLen) {
      parms1000.setLnCloneOwnerId1000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LnCloneOwnerId1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLnCloneOwnerId1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parms1000.setLnCloneOwnerId1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "N" for isIp34051Ip545110N88()
	 *	@return  Returns true if isIp34051Ip545110N88() is "N"
	 */
   public boolean isIp34051Ip545110N88() throws CFException {
      return ip34051MqProcessParameters.isIp34051Ip545110N88();
   }

	/**
	*  set values "N"
	*/
   	public void setIp34051Ip545110N88True()  throws CFException{  			
    	ip34051MqProcessParameters.setIp34051Ip545110N88True();
   	}
	/**
	 *	Returns the value of reqHobj800
	 *	@return reqHobj800
	 */
	public int getReqHobj800() throws CFException {        
   		return queueVars800.getReqHobj800();
	}
	
	/**
	 * 	Update ReqHobj800 with the passed value
	 *	@param number
	 */
	public void setReqHobj800(int number)  throws CFException{
		queueVars800.setReqHobj800(number);
	}


	public void setReqHobj800(long number)  throws CFException{
		queueVars800.setReqHobj800((int)number);
	}


	/**
	 *	Returns the value of reqHconn800
	 *	@return reqHconn800
	 */
	public int getReqHconn800() throws CFException {        
   		return queueVars800.getReqHconn800();
	}
	
	/**
	 * 	Update ReqHconn800 with the passed value
	 *	@param number
	 */
	public void setReqHconn800(int number)  throws CFException{
		queueVars800.setReqHconn800(number);
	}


	public void setReqHconn800(long number)  throws CFException{
		queueVars800.setReqHconn800((int)number);
	}


	/**
	 *	Returns the value of reqQmgrName800
	 *	@return reqQmgrName800
	 */
   public char[] getReqQmgrName800() throws CFException  {              
   		return queueVars800.getReqQmgrName800();
   }

  
	/**
	*  set variable reqQmgrName800
	*  @param value
	**/
   public void setReqQmgrName800(char[] value) throws CFException {
      queueVars800.setReqQmgrName800(value);
   } 

     /**
	 * 	Update ReqQmgrName800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setReqQmgrName800(char[] source, int sourceIndex) throws CFException {
      queueVars800.setReqQmgrName800(source, sourceIndex);
   	
   }
   
   public void setReqQmgrName800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      queueVars800.setReqQmgrName800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ReqQmgrName800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReqQmgrName800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      queueVars800.setReqQmgrName800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ReqQmgrName800 with another Field
	 *	@param value
	 */
   public void setReqQmgrName800(Field source) {
      queueVars800.setReqQmgrName800(source);
   }  
   
     /**
	 * 	Update ReqQmgrName800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setReqQmgrName800(Field source, int sourceIndex,int sourceLen) {
      queueVars800.setReqQmgrName800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ReqQmgrName800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReqQmgrName800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      queueVars800.setReqQmgrName800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of reqQName800
	 *	@return reqQName800
	 */
   public char[] getReqQName800() throws CFException  {              
   		return queueVars800.getReqQName800();
   }

  
	/**
	*  set variable reqQName800
	*  @param value
	**/
   public void setReqQName800(char[] value) throws CFException {
      queueVars800.setReqQName800(value);
   } 

     /**
	 * 	Update ReqQName800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setReqQName800(char[] source, int sourceIndex) throws CFException {
      queueVars800.setReqQName800(source, sourceIndex);
   	
   }
   
   public void setReqQName800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      queueVars800.setReqQName800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ReqQName800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReqQName800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      queueVars800.setReqQName800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ReqQName800 with another Field
	 *	@param value
	 */
   public void setReqQName800(Field source) {
      queueVars800.setReqQName800(source);
   }  
   
     /**
	 * 	Update ReqQName800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setReqQName800(Field source, int sourceIndex,int sourceLen) {
      queueVars800.setReqQName800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ReqQName800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReqQName800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      queueVars800.setReqQName800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lnFacreqJobgrpName1000
	 *	@return lnFacreqJobgrpName1000
	 */
   public char[] getLnFacreqJobgrpName1000() throws CFException  {              
   		return parms1000.getLnFacreqJobgrpName1000();
   }

  
	/**
	*  set variable lnFacreqJobgrpName1000
	*  @param value
	**/
   public void setLnFacreqJobgrpName1000(char[] value) throws CFException {
      parms1000.setLnFacreqJobgrpName1000(value);
   } 

     /**
	 * 	Update LnFacreqJobgrpName1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(char[] source, int sourceIndex) throws CFException {
      parms1000.setLnFacreqJobgrpName1000(source, sourceIndex);
   	
   }
   
   public void setLnFacreqJobgrpName1000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      parms1000.setLnFacreqJobgrpName1000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LnFacreqJobgrpName1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parms1000.setLnFacreqJobgrpName1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LnFacreqJobgrpName1000 with another Field
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(Field source) {
      parms1000.setLnFacreqJobgrpName1000(source);
   }  
   
     /**
	 * 	Update LnFacreqJobgrpName1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(Field source, int sourceIndex,int sourceLen) {
      parms1000.setLnFacreqJobgrpName1000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LnFacreqJobgrpName1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLnFacreqJobgrpName1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parms1000.setLnFacreqJobgrpName1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public short getIp57901JobGrpNum() throws CFException {  
        return ip57901Tipaqpr.getIp57901TipaqprEntries().getIp57901JobGrpNum();
}
	/**
	 * 	Update Ip57901JobGrpNum with the passed value
	 *	@param number
	 */
	public void setIp57901JobGrpNum(short number)  throws CFException{
		ip57901Tipaqpr.getIp57901TipaqprEntries().setIp57901JobGrpNum(number);
	}

	public void setIp57901JobGrpNum(int number)  throws CFException{
	   ip57901Tipaqpr.getIp57901TipaqprEntries().setIp57901JobGrpNum(number);
	}
	public void setIp57901JobGrpNum(long number)  throws CFException {
	    ip57901Tipaqpr.getIp57901TipaqprEntries().setIp57901JobGrpNum(number);
	}
	


	/**
	 *	Returns the value of ip7052f4Hobj
	 *	@return ip7052f4Hobj
	 */
	public int getIp7052f4Hobj() throws CFException {        
   		return ip7052f4MqApiLayout.getIp7052f4Hobj();
	}
	
	/**
	 * 	Update Ip7052f4Hobj with the passed value
	 *	@param number
	 */
	public void setIp7052f4Hobj(int number)  throws CFException{
		ip7052f4MqApiLayout.setIp7052f4Hobj(number);
	}


	public void setIp7052f4Hobj(long number)  throws CFException{
		ip7052f4MqApiLayout.setIp7052f4Hobj((int)number);
	}



        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip89011EnvironmentIndArea.hashCode();
        str += ip7052f4MqApiLayout.hashCode();
        str += queueVars800.hashCode();
        str += ip57901Tipaqpr.hashCode();
        str += parms1000.hashCode();
        str += ip34051MqProcessParameters.hashCode();
        str += linkVariable800.hashCode();
        str += ip70511Table.hashCode();
        str += work.hashCode();
        str += ip02015PrcssAgrmtTable.hashCode();
       return str.hashCode();
    }

    public ConnectMqOutCtx clone() {
        ConnectMqOutCtx cloneObj = new ConnectMqOutCtx();
        cloneObj.ip89011EnvironmentIndArea = new Ip89011EnvironmentIndArea();
        cloneObj.ip89011EnvironmentIndArea.set(ip89011EnvironmentIndArea.getClonedField());
        cloneObj.ip7052f4MqApiLayout = new Ip7052f4MqApiLayout();
        cloneObj.ip7052f4MqApiLayout.set(ip7052f4MqApiLayout.getClonedField());
        cloneObj.queueVars800 = new QueueVars800();
        cloneObj.queueVars800.set(queueVars800.getClonedField());
        cloneObj.ip57901Tipaqpr = new Ip57901Tipaqpr();
        cloneObj.ip57901Tipaqpr.set(ip57901Tipaqpr.getClonedField());
        cloneObj.parms1000 = new Parms1000();
        cloneObj.parms1000.set(parms1000.getClonedField());
        cloneObj.ip34051MqProcessParameters = new Ip34051MqProcessParameters();
        cloneObj.ip34051MqProcessParameters.set(ip34051MqProcessParameters.getClonedField());
        cloneObj.linkVariable800 = new LinkVariable800();
        cloneObj.linkVariable800.set(linkVariable800.getClonedField());
        cloneObj.ip70511Table = new Ip70511Table();
        cloneObj.ip70511Table.set(ip70511Table.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        return cloneObj;
    }

    }

    public ConnectMqOutCtx getConnectMqOutCtx() {
            return new ConnectMqOutCtx();
    }
     public class OpenErrFileSys201InCtx implements Cloneable {
     ErrorMsg6003010 errorMsg6003010 = Ip829010Ctx.this.getErrorMsg6003010();
     AbendPara900 abendPara900 = Ip829010Ctx.this.getAbendPara900();
     Work work = Ip829010Ctx.this.getWork();
     Sys201ErrMsgOut sys201ErrMsgOut = Ip829010Ctx.this.getSys201ErrMsgOut();
     AbendMessage900 abendMessage900 = Ip829010Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of errorMsg6003010
	 *	@return errorMsg6003010
	 */   
	 public ErrorMsg6003010 getErrorMsg6003010() {
   	return errorMsg6003010;
   }


	/**
	 *	Returns the value of abendCode3003010
	 *	@return abendCode3003010
	 */
   public char[] getAbendCode3003010() throws CFException  {              
   		return work.getAbendCode3003010();
   }

  
	/**
	*  set variable abendCode3003010
	*  @param value
	**/
   public void setAbendCode3003010(char[] value) throws CFException {
      work.setAbendCode3003010(value);
   } 

	/**
	 *	Returns the value of sys201300
	 *	@return sys201300
	 */
   public char[] getSys201300() throws CFException  {              
   		return work.getSys201300();
   }

  
	/**
	*  set variable sys201300
	*  @param value
	**/
   public void setSys201300(char[] value) throws CFException {
      work.setSys201300(value);
   } 

	/**
	 *	Returns the value of paraName1900300
	 *	@return paraName1900300
	 */
   public char[] getParaName1900300() throws CFException  {              
   		return work.getParaName1900300();
   }

  
	/**
	*  set variable paraName1900300
	*  @param value
	**/
   public void setParaName1900300(char[] value) throws CFException {
      work.setParaName1900300(value);
   } 

	/**
	 *	Returns the value of sys201ErrMsgOut
	 *	@return sys201ErrMsgOut
	 */   
	 public Sys201ErrMsgOut getSys201ErrMsgOut() {
   	return sys201ErrMsgOut;
   }



        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public OpenErrFileSys201OutCtx getOpenErrFileSys201OutCtx() {
            return new OpenErrFileSys201OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += errorMsg6003010.hashCode();
        str += abendPara900.hashCode();
        str += work.hashCode();
        str += sys201ErrMsgOut.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public OpenErrFileSys201InCtx clone() {
        OpenErrFileSys201InCtx cloneObj = new OpenErrFileSys201InCtx();
        cloneObj.errorMsg6003010 = new ErrorMsg6003010();
        cloneObj.errorMsg6003010.set(errorMsg6003010.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys201ErrMsgOut = new Sys201ErrMsgOut();
        cloneObj.sys201ErrMsgOut.set(sys201ErrMsgOut.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public OpenErrFileSys201InCtx getOpenErrFileSys201InCtx() {
            return new OpenErrFileSys201InCtx();
    }
     public class OpenErrFileSys201OutCtx implements Cloneable {
     ErrorMsg6003010 errorMsg6003010 = Ip829010Ctx.this.getErrorMsg6003010();
     AbendPara900 abendPara900 = Ip829010Ctx.this.getAbendPara900();
     Work work = Ip829010Ctx.this.getWork();
     Sys201ErrMsgOut sys201ErrMsgOut = Ip829010Ctx.this.getSys201ErrMsgOut();
     AbendMessage900 abendMessage900 = Ip829010Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return abendMessage900.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      abendMessage900.setAbendText900(value);
   } 

     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendText900(source, sourceIndex);
   	
   }
   
   public void setAbendText900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendText900 with another Field
	 *	@param value
	 */
   public void setAbendText900(Field source) {
      abendMessage900.setAbendText900(source);
   }  
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of errorMsg6003010
	 *	@return errorMsg6003010
	 */   
	 public ErrorMsg6003010 getErrorMsg6003010() {
   	return errorMsg6003010;
   }


	/**
	 *	Returns the value of abendCode3003010
	 *	@return abendCode3003010
	 */
   public char[] getAbendCode3003010() throws CFException  {              
   		return work.getAbendCode3003010();
   }

  
	/**
	*  set variable abendCode3003010
	*  @param value
	**/
   public void setAbendCode3003010(char[] value) throws CFException {
      work.setAbendCode3003010(value);
   } 

	/**
	 *	Returns the value of fileStat6003010
	 *	@return fileStat6003010
	 */
   public char[] getFileStat6003010() throws CFException  {              
   		return errorMsg6003010.getFileStat6003010();
   }

  
	/**
	*  set variable fileStat6003010
	*  @param value
	**/
   public void setFileStat6003010(char[] value) throws CFException {
      errorMsg6003010.setFileStat6003010(value);
   } 

     /**
	 * 	Update FileStat6003010 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileStat6003010(char[] source, int sourceIndex) throws CFException {
      errorMsg6003010.setFileStat6003010(source, sourceIndex);
   	
   }
   
   public void setFileStat6003010(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      errorMsg6003010.setFileStat6003010(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FileStat6003010 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileStat6003010(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      errorMsg6003010.setFileStat6003010(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FileStat6003010 with another Field
	 *	@param value
	 */
   public void setFileStat6003010(Field source) {
      errorMsg6003010.setFileStat6003010(source);
   }  
   
     /**
	 * 	Update FileStat6003010 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileStat6003010(Field source, int sourceIndex,int sourceLen) {
      errorMsg6003010.setFileStat6003010(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FileStat6003010 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileStat6003010(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      errorMsg6003010.setFileStat6003010(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "00" for isSys201IoGood80088()
	 *	@return  Returns true if isSys201IoGood80088() is "00"
	 */
   public boolean isSys201IoGood80088() throws CFException {
      return work.isSys201IoGood80088();
   }

	/**
	*  set values "00"
	*/
   	public void setSys201IoGood80088True()  throws CFException{  			
    	work.setSys201IoGood80088True();
   	}
	/**
	 *	Returns the value of fileDd6003010
	 *	@return fileDd6003010
	 */
   public char[] getFileDd6003010() throws CFException  {              
   		return errorMsg6003010.getFileDd6003010();
   }

  
	/**
	*  set variable fileDd6003010
	*  @param value
	**/
   public void setFileDd6003010(char[] value) throws CFException {
      errorMsg6003010.setFileDd6003010(value);
   } 

     /**
	 * 	Update FileDd6003010 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileDd6003010(char[] source, int sourceIndex) throws CFException {
      errorMsg6003010.setFileDd6003010(source, sourceIndex);
   	
   }
   
   public void setFileDd6003010(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      errorMsg6003010.setFileDd6003010(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FileDd6003010 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileDd6003010(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      errorMsg6003010.setFileDd6003010(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FileDd6003010 with another Field
	 *	@param value
	 */
   public void setFileDd6003010(Field source) {
      errorMsg6003010.setFileDd6003010(source);
   }  
   
     /**
	 * 	Update FileDd6003010 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileDd6003010(Field source, int sourceIndex,int sourceLen) {
      errorMsg6003010.setFileDd6003010(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FileDd6003010 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileDd6003010(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      errorMsg6003010.setFileDd6003010(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys201300
	 *	@return sys201300
	 */
   public char[] getSys201300() throws CFException  {              
   		return work.getSys201300();
   }

  
	/**
	*  set variable sys201300
	*  @param value
	**/
   public void setSys201300(char[] value) throws CFException {
      work.setSys201300(value);
   } 

	/**
	 *	Returns the value of abendParaName900
	 *	@return abendParaName900
	 */
   public char[] getAbendParaName900() throws CFException  {              
   		return abendPara900.getAbendParaName900();
   }

  
	/**
	*  set variable abendParaName900
	*  @param value
	**/
   public void setAbendParaName900(char[] value) throws CFException {
      abendPara900.setAbendParaName900(value);
   } 

     /**
	 * 	Update AbendParaName900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendParaName900(char[] source, int sourceIndex) throws CFException {
      abendPara900.setAbendParaName900(source, sourceIndex);
   	
   }
   
   public void setAbendParaName900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendParaName900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendParaName900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendParaName900 with another Field
	 *	@param value
	 */
   public void setAbendParaName900(Field source) {
      abendPara900.setAbendParaName900(source);
   }  
   
     /**
	 * 	Update AbendParaName900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendParaName900(Field source, int sourceIndex,int sourceLen) {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendParaName900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendParaName900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of paraName1900300
	 *	@return paraName1900300
	 */
   public char[] getParaName1900300() throws CFException  {              
   		return work.getParaName1900300();
   }

  
	/**
	*  set variable paraName1900300
	*  @param value
	**/
   public void setParaName1900300(char[] value) throws CFException {
      work.setParaName1900300(value);
   } 

	/**
	 *	Returns the value of sys201Status800
	 *	@return sys201Status800
	 */
   public char[] getSys201Status800() throws CFException  {              
   		return work.getSys201Status800();
   }

  
	/**
	*  set variable sys201Status800
	*  @param value
	**/
   public void setSys201Status800(char[] value) throws CFException {
      work.setSys201Status800(value);
   } 

	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += errorMsg6003010.hashCode();
        str += abendPara900.hashCode();
        str += work.hashCode();
        str += sys201ErrMsgOut.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public OpenErrFileSys201OutCtx clone() {
        OpenErrFileSys201OutCtx cloneObj = new OpenErrFileSys201OutCtx();
        cloneObj.errorMsg6003010 = new ErrorMsg6003010();
        cloneObj.errorMsg6003010.set(errorMsg6003010.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys201ErrMsgOut = new Sys201ErrMsgOut();
        cloneObj.sys201ErrMsgOut.set(sys201ErrMsgOut.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public OpenErrFileSys201OutCtx getOpenErrFileSys201OutCtx() {
            return new OpenErrFileSys201OutCtx();
    }
     public class GetQueueMessagesInCtx implements Cloneable {
     Ip7051f4Table ip7051f4Table = Ip829010Ctx.this.getIp7051f4Table();
     Ip64801LrmCommBlock ip64801LrmCommBlock = Ip829010Ctx.this.getIp64801LrmCommBlock();
     Ip70301IsFraudMqSrvActiveGroup ip70301IsFraudMqSrvActiveGroup = Ip829010Ctx.this.getIp70301IsFraudMqSrvActiveGroup();
     Ip70511Table ip70511Table = Ip829010Ctx.this.getIp70511Table();

	/**
	 *	Test condition "AOK" for isIp6480188LrmStatAok()
	 *	@return  Returns true if isIp6480188LrmStatAok() is "AOK"
	 */
   public boolean isIp6480188LrmStatAok() throws CFException {
      return ip64801LrmCommBlock.isIp6480188LrmStatAok();
   }

	/**
	*  set values "AOK"
	*/
   	public void setIp6480188LrmStatAokTrue()  throws CFException{  			
    	ip64801LrmCommBlock.setIp6480188LrmStatAokTrue();
   	}
	/**
	 *	Test condition "Y" for isIp70301FraudMqActiveY88()
	 *	@return  Returns true if isIp70301FraudMqActiveY88() is "Y"
	 */
   public boolean isIp70301FraudMqActiveY88() throws CFException {
      return ip70301IsFraudMqSrvActiveGroup.isIp70301FraudMqActiveY88();
   }

	/**
	*  set values "Y"
	*/
   	public void setIp70301FraudMqActiveY88True()  throws CFException{  			
    	ip70301IsFraudMqSrvActiveGroup.setIp70301FraudMqActiveY88True();
   	}
	/**
	 *	Returns the value of ip7051f4MqBypassSw
	 *	@return ip7051f4MqBypassSw
	 */
   public char[] getIp7051f4MqBypassSw() throws CFException  {              
   		return ip7051f4Table.getIp7051f4MqBypassSw();
   }

  
	/**
	*  set variable ip7051f4MqBypassSw
	*  @param value
	**/
   public void setIp7051f4MqBypassSw(char[] value) throws CFException {
      ip7051f4Table.setIp7051f4MqBypassSw(value);
   } 

     /**
	 * 	Update Ip7051f4MqBypassSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051f4MqBypassSw(char[] source, int sourceIndex) throws CFException {
      ip7051f4Table.setIp7051f4MqBypassSw(source, sourceIndex);
   	
   }
   
   public void setIp7051f4MqBypassSw(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip7051f4Table.setIp7051f4MqBypassSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip7051f4MqBypassSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4MqBypassSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip7051f4Table.setIp7051f4MqBypassSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip7051f4MqBypassSw with another Field
	 *	@param value
	 */
   public void setIp7051f4MqBypassSw(Field source) {
      ip7051f4Table.setIp7051f4MqBypassSw(source);
   }  
   
     /**
	 * 	Update Ip7051f4MqBypassSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051f4MqBypassSw(Field source, int sourceIndex,int sourceLen) {
      ip7051f4Table.setIp7051f4MqBypassSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip7051f4MqBypassSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4MqBypassSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip7051f4Table.setIp7051f4MqBypassSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public GetQueueMessagesOutCtx getGetQueueMessagesOutCtx() {
            return new GetQueueMessagesOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip7051f4Table.hashCode();
        str += ip64801LrmCommBlock.hashCode();
        str += ip70301IsFraudMqSrvActiveGroup.hashCode();
        str += ip70511Table.hashCode();
       return str.hashCode();
    }

    public GetQueueMessagesInCtx clone() {
        GetQueueMessagesInCtx cloneObj = new GetQueueMessagesInCtx();
        cloneObj.ip7051f4Table = new Ip7051f4Table();
        cloneObj.ip7051f4Table.set(ip7051f4Table.getClonedField());
        cloneObj.ip64801LrmCommBlock = new Ip64801LrmCommBlock();
        cloneObj.ip64801LrmCommBlock.set(ip64801LrmCommBlock.getClonedField());
        cloneObj.ip70301IsFraudMqSrvActiveGroup = new Ip70301IsFraudMqSrvActiveGroup();
        cloneObj.ip70301IsFraudMqSrvActiveGroup.set(ip70301IsFraudMqSrvActiveGroup.getClonedField());
        cloneObj.ip70511Table = new Ip70511Table();
        cloneObj.ip70511Table.set(ip70511Table.getClonedField());
        return cloneObj;
    }

    }

    public GetQueueMessagesInCtx getGetQueueMessagesInCtx() {
            return new GetQueueMessagesInCtx();
    }
     public class GetQueueMessagesOutCtx implements Cloneable {
     Ip7051f4Table ip7051f4Table = Ip829010Ctx.this.getIp7051f4Table();
     Ip64801LrmCommBlock ip64801LrmCommBlock = Ip829010Ctx.this.getIp64801LrmCommBlock();
     Ip70301IsFraudMqSrvActiveGroup ip70301IsFraudMqSrvActiveGroup = Ip829010Ctx.this.getIp70301IsFraudMqSrvActiveGroup();
     Ip70511Table ip70511Table = Ip829010Ctx.this.getIp70511Table();

	/**
	 *	Returns the value of ip7051f4MqBypassSw
	 *	@return ip7051f4MqBypassSw
	 */
   public char[] getIp7051f4MqBypassSw() throws CFException  {              
   		return ip7051f4Table.getIp7051f4MqBypassSw();
   }

  
	/**
	*  set variable ip7051f4MqBypassSw
	*  @param value
	**/
   public void setIp7051f4MqBypassSw(char[] value) throws CFException {
      ip7051f4Table.setIp7051f4MqBypassSw(value);
   } 

     /**
	 * 	Update Ip7051f4MqBypassSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051f4MqBypassSw(char[] source, int sourceIndex) throws CFException {
      ip7051f4Table.setIp7051f4MqBypassSw(source, sourceIndex);
   	
   }
   
   public void setIp7051f4MqBypassSw(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip7051f4Table.setIp7051f4MqBypassSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip7051f4MqBypassSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4MqBypassSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip7051f4Table.setIp7051f4MqBypassSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip7051f4MqBypassSw with another Field
	 *	@param value
	 */
   public void setIp7051f4MqBypassSw(Field source) {
      ip7051f4Table.setIp7051f4MqBypassSw(source);
   }  
   
     /**
	 * 	Update Ip7051f4MqBypassSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051f4MqBypassSw(Field source, int sourceIndex,int sourceLen) {
      ip7051f4Table.setIp7051f4MqBypassSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip7051f4MqBypassSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4MqBypassSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip7051f4Table.setIp7051f4MqBypassSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "N" for isIp70511MqBypassN()
	 *	@return  Returns true if isIp70511MqBypassN() is "N"
	 */
   public boolean isIp70511MqBypassN() throws CFException {
      return ip70511Table.isIp70511MqBypassN();
   }

	/**
	*  set values "N"
	*/
   	public void setIp70511MqBypassNTrue()  throws CFException{  			
    	ip70511Table.setIp70511MqBypassNTrue();
   	}
	/**
	 *	Returns the value of ip70511MqBypassSw
	 *	@return ip70511MqBypassSw
	 */
   public char[] getIp70511MqBypassSw() throws CFException  {              
   		return ip70511Table.getIp70511MqBypassSw();
   }

  
	/**
	*  set variable ip70511MqBypassSw
	*  @param value
	**/
   public void setIp70511MqBypassSw(char[] value) throws CFException {
      ip70511Table.setIp70511MqBypassSw(value);
   } 

     /**
	 * 	Update Ip70511MqBypassSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70511MqBypassSw(char[] source, int sourceIndex) throws CFException {
      ip70511Table.setIp70511MqBypassSw(source, sourceIndex);
   	
   }
   
   public void setIp70511MqBypassSw(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70511Table.setIp70511MqBypassSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70511MqBypassSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70511MqBypassSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70511Table.setIp70511MqBypassSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70511MqBypassSw with another Field
	 *	@param value
	 */
   public void setIp70511MqBypassSw(Field source) {
      ip70511Table.setIp70511MqBypassSw(source);
   }  
   
     /**
	 * 	Update Ip70511MqBypassSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70511MqBypassSw(Field source, int sourceIndex,int sourceLen) {
      ip70511Table.setIp70511MqBypassSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70511MqBypassSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70511MqBypassSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70511Table.setIp70511MqBypassSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip7051f4Table.hashCode();
        str += ip64801LrmCommBlock.hashCode();
        str += ip70301IsFraudMqSrvActiveGroup.hashCode();
        str += ip70511Table.hashCode();
       return str.hashCode();
    }

    public GetQueueMessagesOutCtx clone() {
        GetQueueMessagesOutCtx cloneObj = new GetQueueMessagesOutCtx();
        cloneObj.ip7051f4Table = new Ip7051f4Table();
        cloneObj.ip7051f4Table.set(ip7051f4Table.getClonedField());
        cloneObj.ip64801LrmCommBlock = new Ip64801LrmCommBlock();
        cloneObj.ip64801LrmCommBlock.set(ip64801LrmCommBlock.getClonedField());
        cloneObj.ip70301IsFraudMqSrvActiveGroup = new Ip70301IsFraudMqSrvActiveGroup();
        cloneObj.ip70301IsFraudMqSrvActiveGroup.set(ip70301IsFraudMqSrvActiveGroup.getClonedField());
        cloneObj.ip70511Table = new Ip70511Table();
        cloneObj.ip70511Table.set(ip70511Table.getClonedField());
        return cloneObj;
    }

    }

    public GetQueueMessagesOutCtx getGetQueueMessagesOutCtx() {
            return new GetQueueMessagesOutCtx();
    }
     public class ProcessFnsTxnsInCtx implements Cloneable {
     CheckGetQueueGroup100 checkGetQueueGroup100 = Ip829010Ctx.this.getCheckGetQueueGroup100();
     Ip70521MqApiLayout ip70521MqApiLayout = Ip829010Ctx.this.getIp70521MqApiLayout();
     FnsPayload fnsPayload = Ip829010Ctx.this.getFnsPayload();
     GetBrowseCallsGroup100 getBrowseCallsGroup100 = Ip829010Ctx.this.getGetBrowseCallsGroup100();
     Work work = Ip829010Ctx.this.getWork();
     Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable = Ip829010Ctx.this.getIp02015PrcssAgrmtTable();

	/**
	 *	Test condition "N" for isIp70521MqReturnN88()
	 *	@return  Returns true if isIp70521MqReturnN88() is "N"
	 */
   public boolean isIp70521MqReturnN88() throws CFException {
      return ip70521MqApiLayout.isIp70521MqReturnN88();
   }

	/**
	*  set values "N"
	*/
   	public void setIp70521MqReturnN88True()  throws CFException{  			
    	ip70521MqApiLayout.setIp70521MqReturnN88True();
   	}
	/**
	 *	Test condition 2033 for isIp70521NoMsgAvailable88()
	 *	@return  Returns true if isIp70521NoMsgAvailable88() is 2033
	 */
   public boolean isIp70521NoMsgAvailable88() throws CFException {
      return ip70521MqApiLayout.isIp70521NoMsgAvailable88();
   }

	/**
	*  set values 2033
	*/
   	public void setIp70521NoMsgAvailable88True()  throws CFException{  			
    	ip70521MqApiLayout.setIp70521NoMsgAvailable88True();
   	}
	/**
	 *	Returns the value of mqFailCodeOne300
	 *	@return mqFailCodeOne300
	 */
	public int getMqFailCodeOne300() throws CFException {        
   		return work.getMqFailCodeOne300();
	}
	
	/**
	 * 	Update MqFailCodeOne300 with the passed value
	 *	@param number
	 */
	public void setMqFailCodeOne300(int number)  throws CFException{
		work.setMqFailCodeOne300(number);
	}


	public void setMqFailCodeOne300(long number)  throws CFException{
		work.setMqFailCodeOne300((int)number);
	}


	/**
	 *	Test condition "G" for isIp02015HostPaGlobal88()
	 *	@return  Returns true if isIp02015HostPaGlobal88() is "G"
	 */
   public boolean isIp02015HostPaGlobal88() throws CFException {
      return ip02015PrcssAgrmtTable.isIp02015HostPaGlobal88();
   }

	/**
	*  set values "G"
	*/
   	public void setIp02015HostPaGlobal88True()  throws CFException{  			
    	ip02015PrcssAgrmtTable.setIp02015HostPaGlobal88True();
   	}
	/**
	 *	Returns the value of ptrIp599810800
	 *	@return ptrIp599810800
	 */
   public char[] getPtrIp599810800() throws CFException  {              
   		return work.getPtrIp599810800();
   }

  
	/**
	*  set variable ptrIp599810800
	*  @param value
	**/
   public void setPtrIp599810800(char[] value) throws CFException {
      work.setPtrIp599810800(value);
   } 

	/**
	 *	Returns the value of tipamrsSkipCount800
	 *	@return tipamrsSkipCount800
	 */
	public int getTipamrsSkipCount800() throws CFException {        
   		return work.getTipamrsSkipCount800();
	}
	
	/**
	 * 	Update TipamrsSkipCount800 with the passed value
	 *	@param number
	 */
	public void setTipamrsSkipCount800(int number)  throws CFException{
		work.setTipamrsSkipCount800(number);
	}


	public void setTipamrsSkipCount800(long number)  throws CFException{
		work.setTipamrsSkipCount800((int)number);
	}


	/**
	 *	Returns the value of mqputSkipCount800
	 *	@return mqputSkipCount800
	 */
	public int getMqputSkipCount800() throws CFException {        
   		return work.getMqputSkipCount800();
	}
	
	/**
	 * 	Update MqputSkipCount800 with the passed value
	 *	@param number
	 */
	public void setMqputSkipCount800(int number)  throws CFException{
		work.setMqputSkipCount800(number);
	}


	public void setMqputSkipCount800(long number)  throws CFException{
		work.setMqputSkipCount800((int)number);
	}


	/**
	 *	Returns the value of fnsPayload
	 *	@return fnsPayload
	 */   
	 public FnsPayload getFnsPayload() {
   	return fnsPayload;
   }


	/**
	 *	Test condition "N" for isSkipFlagN88800()
	 *	@return  Returns true if isSkipFlagN88800() is "N"
	 */
   public boolean isSkipFlagN88800() throws CFException {
      return work.isSkipFlagN88800();
   }

	/**
	*  set values "N"
	*/
   	public void setSkipFlagN88800True()  throws CFException{  			
    	work.setSkipFlagN88800True();
   	}
	/**
	 *	Returns the value of ip70521CompCd
	 *	@return ip70521CompCd
	 */
	public int getIp70521CompCd() throws CFException {        
   		return ip70521MqApiLayout.getIp70521CompCd();
	}
	
	/**
	 * 	Update Ip70521CompCd with the passed value
	 *	@param number
	 */
	public void setIp70521CompCd(int number)  throws CFException{
		ip70521MqApiLayout.setIp70521CompCd(number);
	}


	public void setIp70521CompCd(long number)  throws CFException{
		ip70521MqApiLayout.setIp70521CompCd((int)number);
	}



        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public ProcessFnsTxnsOutCtx getProcessFnsTxnsOutCtx() {
            return new ProcessFnsTxnsOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += checkGetQueueGroup100.hashCode();
        str += ip70521MqApiLayout.hashCode();
        str += fnsPayload.hashCode();
        str += getBrowseCallsGroup100.hashCode();
        str += work.hashCode();
        str += ip02015PrcssAgrmtTable.hashCode();
       return str.hashCode();
    }

    public ProcessFnsTxnsInCtx clone() {
        ProcessFnsTxnsInCtx cloneObj = new ProcessFnsTxnsInCtx();
        cloneObj.checkGetQueueGroup100 = new CheckGetQueueGroup100();
        cloneObj.checkGetQueueGroup100.set(checkGetQueueGroup100.getClonedField());
        cloneObj.ip70521MqApiLayout = new Ip70521MqApiLayout();
        cloneObj.ip70521MqApiLayout.set(ip70521MqApiLayout.getClonedField());
        cloneObj.fnsPayload = new FnsPayload();
        cloneObj.fnsPayload.set(fnsPayload.getClonedField());
        cloneObj.getBrowseCallsGroup100 = new GetBrowseCallsGroup100();
        cloneObj.getBrowseCallsGroup100.set(getBrowseCallsGroup100.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        return cloneObj;
    }

    }

    public ProcessFnsTxnsInCtx getProcessFnsTxnsInCtx() {
            return new ProcessFnsTxnsInCtx();
    }
     public class ProcessFnsTxnsOutCtx implements Cloneable {
     CheckGetQueueGroup100 checkGetQueueGroup100 = Ip829010Ctx.this.getCheckGetQueueGroup100();
     Ip70521MqApiLayout ip70521MqApiLayout = Ip829010Ctx.this.getIp70521MqApiLayout();
     GetBrowseCallsGroup100 getBrowseCallsGroup100 = Ip829010Ctx.this.getGetBrowseCallsGroup100();
     Work work = Ip829010Ctx.this.getWork();
     Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable = Ip829010Ctx.this.getIp02015PrcssAgrmtTable();

	/**
	 *	Test condition "F" for isGetFaaFac88100()
	 *	@return  Returns true if isGetFaaFac88100() is "F"
	 */
   public boolean isGetFaaFac88100() throws CFException {
      return checkGetQueueGroup100.isGetFaaFac88100();
   }

	/**
	*  set values "F"
	*/
   	public void setGetFaaFac88100True()  throws CFException{  			
    	checkGetQueueGroup100.setGetFaaFac88100True();
   	}
	/**
	 *	Test condition "Y" for isMqRespY88100()
	 *	@return  Returns true if isMqRespY88100() is "Y"
	 */
   public boolean isMqRespY88100() throws CFException {
      return work.isMqRespY88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setMqRespY88100True()  throws CFException{  			
    	work.setMqRespY88100True();
   	}
	/**
	 *	Returns the value of tipamrsSkipCount800
	 *	@return tipamrsSkipCount800
	 */
	public int getTipamrsSkipCount800() throws CFException {        
   		return work.getTipamrsSkipCount800();
	}
	
	/**
	 * 	Update TipamrsSkipCount800 with the passed value
	 *	@param number
	 */
	public void setTipamrsSkipCount800(int number)  throws CFException{
		work.setTipamrsSkipCount800(number);
	}


	public void setTipamrsSkipCount800(long number)  throws CFException{
		work.setTipamrsSkipCount800((int)number);
	}


	/**
	 *	Returns the value of mqputSkipCount800
	 *	@return mqputSkipCount800
	 */
	public int getMqputSkipCount800() throws CFException {        
   		return work.getMqputSkipCount800();
	}
	
	/**
	 * 	Update MqputSkipCount800 with the passed value
	 *	@param number
	 */
	public void setMqputSkipCount800(int number)  throws CFException{
		work.setMqputSkipCount800(number);
	}


	public void setMqputSkipCount800(long number)  throws CFException{
		work.setMqputSkipCount800((int)number);
	}


	/**
	 *	Test condition "S" for isStartBrowse88100()
	 *	@return  Returns true if isStartBrowse88100() is "S"
	 */
   public boolean isStartBrowse88100() throws CFException {
      return getBrowseCallsGroup100.isStartBrowse88100();
   }

	/**
	*  set values "S"
	*/
   	public void setStartBrowse88100True()  throws CFException{  			
    	getBrowseCallsGroup100.setStartBrowse88100True();
   	}
	/**
	 *	Returns the value of end800
	 *	@return end800
	 */
	public int getEnd800() throws CFException {        
   		return work.getEnd800();
	}
	
	/**
	 * 	Update End800 with the passed value
	 *	@param number
	 */
	public void setEnd800(int number)  throws CFException{
		work.setEnd800(number);
	}


	public void setEnd800(long number)  throws CFException{
		work.setEnd800((int)number);
	}


	/**
	 *	Test condition "GET " for isIp70521Get88()
	 *	@return  Returns true if isIp70521Get88() is "GET "
	 */
   public boolean isIp70521Get88() throws CFException {
      return ip70521MqApiLayout.isIp70521Get88();
   }

	/**
	*  set values "GET "
	*/
   	public void setIp70521Get88True()  throws CFException{  			
    	ip70521MqApiLayout.setIp70521Get88True();
   	}
	/**
	 *	Test condition "N" for isMqRespN88100()
	 *	@return  Returns true if isMqRespN88100() is "N"
	 */
   public boolean isMqRespN88100() throws CFException {
      return work.isMqRespN88100();
   }

	/**
	*  set values "N"
	*/
   	public void setMqRespN88100True()  throws CFException{  			
    	work.setMqRespN88100True();
   	}

        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += checkGetQueueGroup100.hashCode();
        str += ip70521MqApiLayout.hashCode();
        str += getBrowseCallsGroup100.hashCode();
        str += work.hashCode();
        str += ip02015PrcssAgrmtTable.hashCode();
       return str.hashCode();
    }

    public ProcessFnsTxnsOutCtx clone() {
        ProcessFnsTxnsOutCtx cloneObj = new ProcessFnsTxnsOutCtx();
        cloneObj.checkGetQueueGroup100 = new CheckGetQueueGroup100();
        cloneObj.checkGetQueueGroup100.set(checkGetQueueGroup100.getClonedField());
        cloneObj.ip70521MqApiLayout = new Ip70521MqApiLayout();
        cloneObj.ip70521MqApiLayout.set(ip70521MqApiLayout.getClonedField());
        cloneObj.getBrowseCallsGroup100 = new GetBrowseCallsGroup100();
        cloneObj.getBrowseCallsGroup100.set(getBrowseCallsGroup100.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        return cloneObj;
    }

    }

    public ProcessFnsTxnsOutCtx getProcessFnsTxnsOutCtx() {
            return new ProcessFnsTxnsOutCtx();
    }
     public class SetupQParmsFraudInCtx implements Cloneable {
     QueueVars800 queueVars800 = Ip829010Ctx.this.getQueueVars800();
     Ip70521MqApiLayout ip70521MqApiLayout = Ip829010Ctx.this.getIp70521MqApiLayout();
     FnsPldRd fnsPldRd = Ip829010Ctx.this.getFnsPldRd();
     Ip70511Table ip70511Table = Ip829010Ctx.this.getIp70511Table();

	/**
	 *	Returns the value of resQmgrName800
	 *	@return resQmgrName800
	 */
   public char[] getResQmgrName800() throws CFException  {              
   		return queueVars800.getResQmgrName800();
   }

  
	/**
	*  set variable resQmgrName800
	*  @param value
	**/
   public void setResQmgrName800(char[] value) throws CFException {
      queueVars800.setResQmgrName800(value);
   } 

     /**
	 * 	Update ResQmgrName800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResQmgrName800(char[] source, int sourceIndex) throws CFException {
      queueVars800.setResQmgrName800(source, sourceIndex);
   	
   }
   
   public void setResQmgrName800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      queueVars800.setResQmgrName800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ResQmgrName800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResQmgrName800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      queueVars800.setResQmgrName800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ResQmgrName800 with another Field
	 *	@param value
	 */
   public void setResQmgrName800(Field source) {
      queueVars800.setResQmgrName800(source);
   }  
   
     /**
	 * 	Update ResQmgrName800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResQmgrName800(Field source, int sourceIndex,int sourceLen) {
      queueVars800.setResQmgrName800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ResQmgrName800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResQmgrName800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      queueVars800.setResQmgrName800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of resHconn800
	 *	@return resHconn800
	 */
	public int getResHconn800() throws CFException {        
   		return queueVars800.getResHconn800();
	}
	
	/**
	 * 	Update ResHconn800 with the passed value
	 *	@param number
	 */
	public void setResHconn800(int number)  throws CFException{
		queueVars800.setResHconn800(number);
	}


	public void setResHconn800(long number)  throws CFException{
		queueVars800.setResHconn800((int)number);
	}


	/**
	 *	Returns the value of resQName800
	 *	@return resQName800
	 */
   public char[] getResQName800() throws CFException  {              
   		return queueVars800.getResQName800();
   }

  
	/**
	*  set variable resQName800
	*  @param value
	**/
   public void setResQName800(char[] value) throws CFException {
      queueVars800.setResQName800(value);
   } 

     /**
	 * 	Update ResQName800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResQName800(char[] source, int sourceIndex) throws CFException {
      queueVars800.setResQName800(source, sourceIndex);
   	
   }
   
   public void setResQName800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      queueVars800.setResQName800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ResQName800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResQName800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      queueVars800.setResQName800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ResQName800 with another Field
	 *	@param value
	 */
   public void setResQName800(Field source) {
      queueVars800.setResQName800(source);
   }  
   
     /**
	 * 	Update ResQName800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResQName800(Field source, int sourceIndex,int sourceLen) {
      queueVars800.setResQName800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ResQName800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResQName800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      queueVars800.setResQName800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fnsPldRd
	 *	@return fnsPldRd
	 */   
	 public FnsPldRd getFnsPldRd() {
   	return fnsPldRd;
   }


	/**
	 *	Returns the value of resHobj800
	 *	@return resHobj800
	 */
	public int getResHobj800() throws CFException {        
   		return queueVars800.getResHobj800();
	}
	
	/**
	 * 	Update ResHobj800 with the passed value
	 *	@param number
	 */
	public void setResHobj800(int number)  throws CFException{
		queueVars800.setResHobj800(number);
	}


	public void setResHobj800(long number)  throws CFException{
		queueVars800.setResHobj800((int)number);
	}


	/**
	 *	Returns the value of ip70511MqBypassSw
	 *	@return ip70511MqBypassSw
	 */
   public char[] getIp70511MqBypassSw() throws CFException  {              
   		return ip70511Table.getIp70511MqBypassSw();
   }

  
	/**
	*  set variable ip70511MqBypassSw
	*  @param value
	**/
   public void setIp70511MqBypassSw(char[] value) throws CFException {
      ip70511Table.setIp70511MqBypassSw(value);
   } 

     /**
	 * 	Update Ip70511MqBypassSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70511MqBypassSw(char[] source, int sourceIndex) throws CFException {
      ip70511Table.setIp70511MqBypassSw(source, sourceIndex);
   	
   }
   
   public void setIp70511MqBypassSw(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70511Table.setIp70511MqBypassSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70511MqBypassSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70511MqBypassSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70511Table.setIp70511MqBypassSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70511MqBypassSw with another Field
	 *	@param value
	 */
   public void setIp70511MqBypassSw(Field source) {
      ip70511Table.setIp70511MqBypassSw(source);
   }  
   
     /**
	 * 	Update Ip70511MqBypassSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70511MqBypassSw(Field source, int sourceIndex,int sourceLen) {
      ip70511Table.setIp70511MqBypassSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70511MqBypassSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70511MqBypassSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70511Table.setIp70511MqBypassSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public SetupQParmsFraudOutCtx getSetupQParmsFraudOutCtx() {
            return new SetupQParmsFraudOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += queueVars800.hashCode();
        str += ip70521MqApiLayout.hashCode();
        str += fnsPldRd.hashCode();
        str += ip70511Table.hashCode();
       return str.hashCode();
    }

    public SetupQParmsFraudInCtx clone() {
        SetupQParmsFraudInCtx cloneObj = new SetupQParmsFraudInCtx();
        cloneObj.queueVars800 = new QueueVars800();
        cloneObj.queueVars800.set(queueVars800.getClonedField());
        cloneObj.ip70521MqApiLayout = new Ip70521MqApiLayout();
        cloneObj.ip70521MqApiLayout.set(ip70521MqApiLayout.getClonedField());
        cloneObj.fnsPldRd = new FnsPldRd();
        cloneObj.fnsPldRd.set(fnsPldRd.getClonedField());
        cloneObj.ip70511Table = new Ip70511Table();
        cloneObj.ip70511Table.set(ip70511Table.getClonedField());
        return cloneObj;
    }

    }

    public SetupQParmsFraudInCtx getSetupQParmsFraudInCtx() {
            return new SetupQParmsFraudInCtx();
    }
     public class SetupQParmsFraudOutCtx implements Cloneable {
     QueueVars800 queueVars800 = Ip829010Ctx.this.getQueueVars800();
     Ip70521MqApiLayout ip70521MqApiLayout = Ip829010Ctx.this.getIp70521MqApiLayout();
     Ip70511Table ip70511Table = Ip829010Ctx.this.getIp70511Table();

	/**
	 *	Returns the value of ip70521MsgBuffer
	 *	@return ip70521MsgBuffer
	 */
   public char[] getIp70521MsgBuffer() throws CFException  {              
   		return ip70521MqApiLayout.getIp70521MsgBuffer();
   }

  
	/**
	*  set variable ip70521MsgBuffer
	*  @param value
	**/
   public void setIp70521MsgBuffer(char[] value) throws CFException {
      ip70521MqApiLayout.setIp70521MsgBuffer(value);
   } 

     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521MsgBuffer(char[] source, int sourceIndex) throws CFException {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex);
   	
   }
   
   public void setIp70521MsgBuffer(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MsgBuffer(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70521MsgBuffer with another Field
	 *	@param value
	 */
   public void setIp70521MsgBuffer(Field source) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source);
   }  
   
     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521MsgBuffer(Field source, int sourceIndex,int sourceLen) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MsgBuffer(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of resQmgrName800
	 *	@return resQmgrName800
	 */
   public char[] getResQmgrName800() throws CFException  {              
   		return queueVars800.getResQmgrName800();
   }

  
	/**
	*  set variable resQmgrName800
	*  @param value
	**/
   public void setResQmgrName800(char[] value) throws CFException {
      queueVars800.setResQmgrName800(value);
   } 

     /**
	 * 	Update ResQmgrName800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResQmgrName800(char[] source, int sourceIndex) throws CFException {
      queueVars800.setResQmgrName800(source, sourceIndex);
   	
   }
   
   public void setResQmgrName800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      queueVars800.setResQmgrName800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ResQmgrName800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResQmgrName800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      queueVars800.setResQmgrName800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ResQmgrName800 with another Field
	 *	@param value
	 */
   public void setResQmgrName800(Field source) {
      queueVars800.setResQmgrName800(source);
   }  
   
     /**
	 * 	Update ResQmgrName800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResQmgrName800(Field source, int sourceIndex,int sourceLen) {
      queueVars800.setResQmgrName800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ResQmgrName800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResQmgrName800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      queueVars800.setResQmgrName800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip70521TargetQName
	 *	@return ip70521TargetQName
	 */
   public char[] getIp70521TargetQName() throws CFException  {              
   		return ip70521MqApiLayout.getIp70521TargetQName();
   }

  
	/**
	*  set variable ip70521TargetQName
	*  @param value
	**/
   public void setIp70521TargetQName(char[] value) throws CFException {
      ip70521MqApiLayout.setIp70521TargetQName(value);
   } 

     /**
	 * 	Update Ip70521TargetQName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521TargetQName(char[] source, int sourceIndex) throws CFException {
      ip70521MqApiLayout.setIp70521TargetQName(source, sourceIndex);
   	
   }
   
   public void setIp70521TargetQName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70521MqApiLayout.setIp70521TargetQName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70521TargetQName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521TargetQName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521TargetQName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70521TargetQName with another Field
	 *	@param value
	 */
   public void setIp70521TargetQName(Field source) {
      ip70521MqApiLayout.setIp70521TargetQName(source);
   }  
   
     /**
	 * 	Update Ip70521TargetQName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521TargetQName(Field source, int sourceIndex,int sourceLen) {
      ip70521MqApiLayout.setIp70521TargetQName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70521TargetQName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521TargetQName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521TargetQName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of resHconn800
	 *	@return resHconn800
	 */
	public int getResHconn800() throws CFException {        
   		return queueVars800.getResHconn800();
	}
	
	/**
	 * 	Update ResHconn800 with the passed value
	 *	@param number
	 */
	public void setResHconn800(int number)  throws CFException{
		queueVars800.setResHconn800(number);
	}


	public void setResHconn800(long number)  throws CFException{
		queueVars800.setResHconn800((int)number);
	}


	/**
	 *	Returns the value of ip70521MqBypassSw
	 *	@return ip70521MqBypassSw
	 */
   public char[] getIp70521MqBypassSw() throws CFException  {              
   		return ip70521MqApiLayout.getIp70521MqBypassSw();
   }

  
	/**
	*  set variable ip70521MqBypassSw
	*  @param value
	**/
   public void setIp70521MqBypassSw(char[] value) throws CFException {
      ip70521MqApiLayout.setIp70521MqBypassSw(value);
   } 

     /**
	 * 	Update Ip70521MqBypassSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521MqBypassSw(char[] source, int sourceIndex) throws CFException {
      ip70521MqApiLayout.setIp70521MqBypassSw(source, sourceIndex);
   	
   }
   
   public void setIp70521MqBypassSw(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70521MqApiLayout.setIp70521MqBypassSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70521MqBypassSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MqBypassSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521MqBypassSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70521MqBypassSw with another Field
	 *	@param value
	 */
   public void setIp70521MqBypassSw(Field source) {
      ip70521MqApiLayout.setIp70521MqBypassSw(source);
   }  
   
     /**
	 * 	Update Ip70521MqBypassSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521MqBypassSw(Field source, int sourceIndex,int sourceLen) {
      ip70521MqApiLayout.setIp70521MqBypassSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70521MqBypassSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MqBypassSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521MqBypassSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip70521TargetQmgrName
	 *	@return ip70521TargetQmgrName
	 */
   public char[] getIp70521TargetQmgrName() throws CFException  {              
   		return ip70521MqApiLayout.getIp70521TargetQmgrName();
   }

  
	/**
	*  set variable ip70521TargetQmgrName
	*  @param value
	**/
   public void setIp70521TargetQmgrName(char[] value) throws CFException {
      ip70521MqApiLayout.setIp70521TargetQmgrName(value);
   } 

     /**
	 * 	Update Ip70521TargetQmgrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521TargetQmgrName(char[] source, int sourceIndex) throws CFException {
      ip70521MqApiLayout.setIp70521TargetQmgrName(source, sourceIndex);
   	
   }
   
   public void setIp70521TargetQmgrName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70521MqApiLayout.setIp70521TargetQmgrName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70521TargetQmgrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521TargetQmgrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521TargetQmgrName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70521TargetQmgrName with another Field
	 *	@param value
	 */
   public void setIp70521TargetQmgrName(Field source) {
      ip70521MqApiLayout.setIp70521TargetQmgrName(source);
   }  
   
     /**
	 * 	Update Ip70521TargetQmgrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521TargetQmgrName(Field source, int sourceIndex,int sourceLen) {
      ip70521MqApiLayout.setIp70521TargetQmgrName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70521TargetQmgrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521TargetQmgrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521TargetQmgrName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip70521MsgBufferLen
	 *	@return ip70521MsgBufferLen
	 */
	public int getIp70521MsgBufferLen() throws CFException {        
   		return ip70521MqApiLayout.getIp70521MsgBufferLen();
	}
	
	/**
	 * 	Update Ip70521MsgBufferLen with the passed value
	 *	@param number
	 */
	public void setIp70521MsgBufferLen(int number)  throws CFException{
		ip70521MqApiLayout.setIp70521MsgBufferLen(number);
	}


	public void setIp70521MsgBufferLen(long number)  throws CFException{
		ip70521MqApiLayout.setIp70521MsgBufferLen((int)number);
	}


	/**
	 *	Returns the value of resQName800
	 *	@return resQName800
	 */
   public char[] getResQName800() throws CFException  {              
   		return queueVars800.getResQName800();
   }

  
	/**
	*  set variable resQName800
	*  @param value
	**/
   public void setResQName800(char[] value) throws CFException {
      queueVars800.setResQName800(value);
   } 

     /**
	 * 	Update ResQName800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResQName800(char[] source, int sourceIndex) throws CFException {
      queueVars800.setResQName800(source, sourceIndex);
   	
   }
   
   public void setResQName800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      queueVars800.setResQName800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ResQName800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResQName800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      queueVars800.setResQName800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ResQName800 with another Field
	 *	@param value
	 */
   public void setResQName800(Field source) {
      queueVars800.setResQName800(source);
   }  
   
     /**
	 * 	Update ResQName800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResQName800(Field source, int sourceIndex,int sourceLen) {
      queueVars800.setResQName800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ResQName800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResQName800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      queueVars800.setResQName800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip70521Hobj
	 *	@return ip70521Hobj
	 */
	public int getIp70521Hobj() throws CFException {        
   		return ip70521MqApiLayout.getIp70521Hobj();
	}
	
	/**
	 * 	Update Ip70521Hobj with the passed value
	 *	@param number
	 */
	public void setIp70521Hobj(int number)  throws CFException{
		ip70521MqApiLayout.setIp70521Hobj(number);
	}


	public void setIp70521Hobj(long number)  throws CFException{
		ip70521MqApiLayout.setIp70521Hobj((int)number);
	}


	/**
	 *	Returns the value of ip70521Hconn
	 *	@return ip70521Hconn
	 */
	public int getIp70521Hconn() throws CFException {        
   		return ip70521MqApiLayout.getIp70521Hconn();
	}
	
	/**
	 * 	Update Ip70521Hconn with the passed value
	 *	@param number
	 */
	public void setIp70521Hconn(int number)  throws CFException{
		ip70521MqApiLayout.setIp70521Hconn(number);
	}


	public void setIp70521Hconn(long number)  throws CFException{
		ip70521MqApiLayout.setIp70521Hconn((int)number);
	}


	/**
	 *	Returns the value of resHobj800
	 *	@return resHobj800
	 */
	public int getResHobj800() throws CFException {        
   		return queueVars800.getResHobj800();
	}
	
	/**
	 * 	Update ResHobj800 with the passed value
	 *	@param number
	 */
	public void setResHobj800(int number)  throws CFException{
		queueVars800.setResHobj800(number);
	}


	public void setResHobj800(long number)  throws CFException{
		queueVars800.setResHobj800((int)number);
	}


	/**
	 *	Returns the value of ip70511MqBypassSw
	 *	@return ip70511MqBypassSw
	 */
   public char[] getIp70511MqBypassSw() throws CFException  {              
   		return ip70511Table.getIp70511MqBypassSw();
   }

  
	/**
	*  set variable ip70511MqBypassSw
	*  @param value
	**/
   public void setIp70511MqBypassSw(char[] value) throws CFException {
      ip70511Table.setIp70511MqBypassSw(value);
   } 

     /**
	 * 	Update Ip70511MqBypassSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70511MqBypassSw(char[] source, int sourceIndex) throws CFException {
      ip70511Table.setIp70511MqBypassSw(source, sourceIndex);
   	
   }
   
   public void setIp70511MqBypassSw(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70511Table.setIp70511MqBypassSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70511MqBypassSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70511MqBypassSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70511Table.setIp70511MqBypassSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70511MqBypassSw with another Field
	 *	@param value
	 */
   public void setIp70511MqBypassSw(Field source) {
      ip70511Table.setIp70511MqBypassSw(source);
   }  
   
     /**
	 * 	Update Ip70511MqBypassSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70511MqBypassSw(Field source, int sourceIndex,int sourceLen) {
      ip70511Table.setIp70511MqBypassSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70511MqBypassSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70511MqBypassSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70511Table.setIp70511MqBypassSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += queueVars800.hashCode();
        str += ip70521MqApiLayout.hashCode();
        str += ip70511Table.hashCode();
       return str.hashCode();
    }

    public SetupQParmsFraudOutCtx clone() {
        SetupQParmsFraudOutCtx cloneObj = new SetupQParmsFraudOutCtx();
        cloneObj.queueVars800 = new QueueVars800();
        cloneObj.queueVars800.set(queueVars800.getClonedField());
        cloneObj.ip70521MqApiLayout = new Ip70521MqApiLayout();
        cloneObj.ip70521MqApiLayout.set(ip70521MqApiLayout.getClonedField());
        cloneObj.ip70511Table = new Ip70511Table();
        cloneObj.ip70511Table.set(ip70511Table.getClonedField());
        return cloneObj;
    }

    }

    public SetupQParmsFraudOutCtx getSetupQParmsFraudOutCtx() {
            return new SetupQParmsFraudOutCtx();
    }
     public class CallMqgetapiForReadInCtx implements Cloneable {
     CheckGetQueueGroup100 checkGetQueueGroup100 = Ip829010Ctx.this.getCheckGetQueueGroup100();
     QueueErrorMsg611 queueErrorMsg611 = Ip829010Ctx.this.getQueueErrorMsg611();
     Ip82921ErrMsgOut ip82921ErrMsgOut = Ip829010Ctx.this.getIp82921ErrMsgOut();
     Ip70521MqApiLayout ip70521MqApiLayout = Ip829010Ctx.this.getIp70521MqApiLayout();
     FnsPldRd fnsPldRd = Ip829010Ctx.this.getFnsPldRd();
     AbendPara900 abendPara900 = Ip829010Ctx.this.getAbendPara900();
     Work work = Ip829010Ctx.this.getWork();
     Ip08101RunControlRecord ip08101RunControlRecord = Ip829010Ctx.this.getIp08101RunControlRecord();
     AbendMessage900 abendMessage900 = Ip829010Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of ip70521MsgBuffer
	 *	@return ip70521MsgBuffer
	 */
   public char[] getIp70521MsgBuffer() throws CFException  {              
   		return ip70521MqApiLayout.getIp70521MsgBuffer();
   }

  
	/**
	*  set variable ip70521MsgBuffer
	*  @param value
	**/
   public void setIp70521MsgBuffer(char[] value) throws CFException {
      ip70521MqApiLayout.setIp70521MsgBuffer(value);
   } 

     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521MsgBuffer(char[] source, int sourceIndex) throws CFException {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex);
   	
   }
   
   public void setIp70521MsgBuffer(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MsgBuffer(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70521MsgBuffer with another Field
	 *	@param value
	 */
   public void setIp70521MsgBuffer(Field source) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source);
   }  
   
     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521MsgBuffer(Field source, int sourceIndex,int sourceLen) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MsgBuffer(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of queueErrorMsg611
	 *	@return queueErrorMsg611
	 */   
	 public QueueErrorMsg611 getQueueErrorMsg611() {
   	return queueErrorMsg611;
   }


	/**
	 *	Returns the value of valueTest300
	 *	@return valueTest300
	 */
   public char[] getValueTest300() throws CFException  {              
   		return work.getValueTest300();
   }

  
	/**
	*  set variable valueTest300
	*  @param value
	**/
   public void setValueTest300(char[] value) throws CFException {
      work.setValueTest300(value);
   } 

	/**
	 *	Test condition "Y" for isRespDebugIndY88800()
	 *	@return  Returns true if isRespDebugIndY88800() is "Y"
	 */
   public boolean isRespDebugIndY88800() throws CFException {
      return work.isRespDebugIndY88800();
   }

	/**
	*  set values "Y"
	*/
   	public void setRespDebugIndY88800True()  throws CFException{  			
    	work.setRespDebugIndY88800True();
   	}
	/**
	 *	Returns the value of ptrIp708020800
	 *	@return ptrIp708020800
	 */
   public char[] getPtrIp708020800() throws CFException  {              
   		return work.getPtrIp708020800();
   }

  
	/**
	*  set variable ptrIp708020800
	*  @param value
	**/
   public void setPtrIp708020800(char[] value) throws CFException {
      work.setPtrIp708020800(value);
   } 

	/**
	 *	Returns the value of value1300
	 *	@return value1300
	 */
	public short getValue1300() throws CFException {        
   		return work.getValue1300();
	}
	
	/**
	 * 	Update Value1300 with the passed value
	 *	@param number
	 */
	public void setValue1300(short number)  throws CFException{
		work.setValue1300(number);
	}

	public void setValue1300(int number)  throws CFException{
		work.setValue1300((short)number);
	}

	public void setValue1300(long number)  throws CFException{
		work.setValue1300((short)number);
	}



	/**
	 *	Returns the value of ip70521ResnCd
	 *	@return ip70521ResnCd
	 */
	public int getIp70521ResnCd() throws CFException {        
   		return ip70521MqApiLayout.getIp70521ResnCd();
	}
	
	/**
	 * 	Update Ip70521ResnCd with the passed value
	 *	@param number
	 */
	public void setIp70521ResnCd(int number)  throws CFException{
		ip70521MqApiLayout.setIp70521ResnCd(number);
	}


	public void setIp70521ResnCd(long number)  throws CFException{
		ip70521MqApiLayout.setIp70521ResnCd((int)number);
	}


	/**
	 *	Returns the value of end800
	 *	@return end800
	 */
	public int getEnd800() throws CFException {        
   		return work.getEnd800();
	}
	
	/**
	 * 	Update End800 with the passed value
	 *	@param number
	 */
	public void setEnd800(int number)  throws CFException{
		work.setEnd800(number);
	}


	public void setEnd800(long number)  throws CFException{
		work.setEnd800((int)number);
	}


	/**
	 *	Returns the value of fnsPldRd
	 *	@return fnsPldRd
	 */   
	 public FnsPldRd getFnsPldRd() {
   	return fnsPldRd;
   }


	/**
	 *	Returns the value of mqgetFailMsg300
	 *	@return mqgetFailMsg300
	 */
   public char[] getMqgetFailMsg300() throws CFException  {              
   		return work.getMqgetFailMsg300();
   }

  
	/**
	*  set variable mqgetFailMsg300
	*  @param value
	**/
   public void setMqgetFailMsg300(char[] value) throws CFException {
      work.setMqgetFailMsg300(value);
   } 

	/**
	 *	Returns the value of ip08101RunIndicator
	 *	@return ip08101RunIndicator
	 */
   public char[] getIp08101RunIndicator() throws CFException  {              
   		return ip08101RunControlRecord.getIp08101RptInds().getIp08101RunIndicator();
   }

  
	/**
	*  set variable ip08101RunIndicator
	*  @param value
	**/
   public void setIp08101RunIndicator(char[] value) throws CFException {
      ip08101RunControlRecord.getIp08101RptInds().setIp08101RunIndicator(value);
   } 

     /**
	 * 	Update Ip08101RunIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101RunIndicator(char[] source, int sourceIndex) throws CFException {
      ip08101RunControlRecord.getIp08101RptInds().setIp08101RunIndicator(source, sourceIndex);
   	
   }
   
   public void setIp08101RunIndicator(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip08101RunControlRecord.getIp08101RptInds().setIp08101RunIndicator(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip08101RunIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RunIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip08101RunControlRecord.getIp08101RptInds().setIp08101RunIndicator(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip08101RunIndicator with another Field
	 *	@param value
	 */
   public void setIp08101RunIndicator(Field source) {
      ip08101RunControlRecord.getIp08101RptInds().setIp08101RunIndicator(source);
   }  
   
     /**
	 * 	Update Ip08101RunIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101RunIndicator(Field source, int sourceIndex,int sourceLen) {
      ip08101RunControlRecord.getIp08101RptInds().setIp08101RunIndicator(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip08101RunIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RunIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip08101RunControlRecord.getIp08101RptInds().setIp08101RunIndicator(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of getQAbendCode300
	 *	@return getQAbendCode300
	 */
   public char[] getGetQAbendCode300() throws CFException  {              
   		return work.getGetQAbendCode300();
   }

  
	/**
	*  set variable getQAbendCode300
	*  @param value
	**/
   public void setGetQAbendCode300(char[] value) throws CFException {
      work.setGetQAbendCode300(value);
   } 

	/**
	 *	Test condition 2033 for isIp70521NoMsgAvailable88()
	 *	@return  Returns true if isIp70521NoMsgAvailable88() is 2033
	 */
   public boolean isIp70521NoMsgAvailable88() throws CFException {
      return ip70521MqApiLayout.isIp70521NoMsgAvailable88();
   }

	/**
	*  set values 2033
	*/
   	public void setIp70521NoMsgAvailable88True()  throws CFException{  			
    	ip70521MqApiLayout.setIp70521NoMsgAvailable88True();
   	}
	/**
	 *	Returns the value of mqFailCode300
	 *	@return mqFailCode300
	 */
	public int getMqFailCode300() throws CFException {        
   		return work.getMqFailCode300();
	}
	
	/**
	 * 	Update MqFailCode300 with the passed value
	 *	@param number
	 */
	public void setMqFailCode300(int number)  throws CFException{
		work.setMqFailCode300(number);
	}


	public void setMqFailCode300(long number)  throws CFException{
		work.setMqFailCode300((int)number);
	}


	/**
	 *	Returns the value of mqgetFailCount800
	 *	@return mqgetFailCount800
	 */
	public int getMqgetFailCount800() throws CFException {        
   		return work.getMqgetFailCount800();
	}
	
	/**
	 * 	Update MqgetFailCount800 with the passed value
	 *	@param number
	 */
	public void setMqgetFailCount800(int number)  throws CFException{
		work.setMqgetFailCount800(number);
	}


	public void setMqgetFailCount800(long number)  throws CFException{
		work.setMqgetFailCount800((int)number);
	}


	/**
	 *	Returns the value of paraName2410300
	 *	@return paraName2410300
	 */
   public char[] getParaName2410300() throws CFException  {              
   		return work.getParaName2410300();
   }

  
	/**
	*  set variable paraName2410300
	*  @param value
	**/
   public void setParaName2410300(char[] value) throws CFException {
      work.setParaName2410300(value);
   } 

	/**
	 *	Returns the value of ip70521MqApiLayout
	 *	@return ip70521MqApiLayout
	 */   
	 public Ip70521MqApiLayout getIp70521MqApiLayout() {
   	return ip70521MqApiLayout;
   }


	/**
	 *	Returns the value of ip70521CompCd
	 *	@return ip70521CompCd
	 */
	public int getIp70521CompCd() throws CFException {        
   		return ip70521MqApiLayout.getIp70521CompCd();
	}
	
	/**
	 * 	Update Ip70521CompCd with the passed value
	 *	@param number
	 */
	public void setIp70521CompCd(int number)  throws CFException{
		ip70521MqApiLayout.setIp70521CompCd(number);
	}


	public void setIp70521CompCd(long number)  throws CFException{
		ip70521MqApiLayout.setIp70521CompCd((int)number);
	}



        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public CallMqgetapiForReadOutCtx getCallMqgetapiForReadOutCtx() {
            return new CallMqgetapiForReadOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += checkGetQueueGroup100.hashCode();
        str += queueErrorMsg611.hashCode();
        str += ip82921ErrMsgOut.hashCode();
        str += ip70521MqApiLayout.hashCode();
        str += fnsPldRd.hashCode();
        str += abendPara900.hashCode();
        str += work.hashCode();
        str += ip08101RunControlRecord.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public CallMqgetapiForReadInCtx clone() {
        CallMqgetapiForReadInCtx cloneObj = new CallMqgetapiForReadInCtx();
        cloneObj.checkGetQueueGroup100 = new CheckGetQueueGroup100();
        cloneObj.checkGetQueueGroup100.set(checkGetQueueGroup100.getClonedField());
        cloneObj.queueErrorMsg611 = new QueueErrorMsg611();
        cloneObj.queueErrorMsg611.set(queueErrorMsg611.getClonedField());
        cloneObj.ip82921ErrMsgOut = new Ip82921ErrMsgOut();
        cloneObj.ip82921ErrMsgOut.set(ip82921ErrMsgOut.getClonedField());
        cloneObj.ip70521MqApiLayout = new Ip70521MqApiLayout();
        cloneObj.ip70521MqApiLayout.set(ip70521MqApiLayout.getClonedField());
        cloneObj.fnsPldRd = new FnsPldRd();
        cloneObj.fnsPldRd.set(fnsPldRd.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip08101RunControlRecord = new Ip08101RunControlRecord();
        cloneObj.ip08101RunControlRecord.set(ip08101RunControlRecord.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public CallMqgetapiForReadInCtx getCallMqgetapiForReadInCtx() {
            return new CallMqgetapiForReadInCtx();
    }
     public class CallMqgetapiForReadOutCtx implements Cloneable {
     CheckGetQueueGroup100 checkGetQueueGroup100 = Ip829010Ctx.this.getCheckGetQueueGroup100();
     QueueErrorMsg611 queueErrorMsg611 = Ip829010Ctx.this.getQueueErrorMsg611();
     Ip82921ErrMsgOut ip82921ErrMsgOut = Ip829010Ctx.this.getIp82921ErrMsgOut();
     Ip70521MqApiLayout ip70521MqApiLayout = Ip829010Ctx.this.getIp70521MqApiLayout();
     FnsPldRd fnsPldRd = Ip829010Ctx.this.getFnsPldRd();
     AbendPara900 abendPara900 = Ip829010Ctx.this.getAbendPara900();
     Work work = Ip829010Ctx.this.getWork();
     Ip08101RunControlRecord ip08101RunControlRecord = Ip829010Ctx.this.getIp08101RunControlRecord();
     AbendMessage900 abendMessage900 = Ip829010Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of ip70521MsgBuffer
	 *	@return ip70521MsgBuffer
	 */
   public char[] getIp70521MsgBuffer() throws CFException  {              
   		return ip70521MqApiLayout.getIp70521MsgBuffer();
   }

  
	/**
	*  set variable ip70521MsgBuffer
	*  @param value
	**/
   public void setIp70521MsgBuffer(char[] value) throws CFException {
      ip70521MqApiLayout.setIp70521MsgBuffer(value);
   } 

     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521MsgBuffer(char[] source, int sourceIndex) throws CFException {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex);
   	
   }
   
   public void setIp70521MsgBuffer(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MsgBuffer(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70521MsgBuffer with another Field
	 *	@param value
	 */
   public void setIp70521MsgBuffer(Field source) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source);
   }  
   
     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521MsgBuffer(Field source, int sourceIndex,int sourceLen) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MsgBuffer(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of queueErrorMsg611
	 *	@return queueErrorMsg611
	 */   
	 public QueueErrorMsg611 getQueueErrorMsg611() {
   	return queueErrorMsg611;
   }


	/**
	 *	Returns the value of value1300
	 *	@return value1300
	 */
	public short getValue1300() throws CFException {        
   		return work.getValue1300();
	}
	
	/**
	 * 	Update Value1300 with the passed value
	 *	@param number
	 */
	public void setValue1300(short number)  throws CFException{
		work.setValue1300(number);
	}

	public void setValue1300(int number)  throws CFException{
		work.setValue1300((short)number);
	}

	public void setValue1300(long number)  throws CFException{
		work.setValue1300((short)number);
	}



	/**
	 *	Returns the value of ip70521ResnCd
	 *	@return ip70521ResnCd
	 */
	public int getIp70521ResnCd() throws CFException {        
   		return ip70521MqApiLayout.getIp70521ResnCd();
	}
	
	/**
	 * 	Update Ip70521ResnCd with the passed value
	 *	@param number
	 */
	public void setIp70521ResnCd(int number)  throws CFException{
		ip70521MqApiLayout.setIp70521ResnCd(number);
	}


	public void setIp70521ResnCd(long number)  throws CFException{
		ip70521MqApiLayout.setIp70521ResnCd((int)number);
	}


	/**
	 *	Returns the value of ip82921ErrMsg
	 *	@return ip82921ErrMsg
	 */
   public char[] getIp82921ErrMsg() throws CFException  {              
   		return ip82921ErrMsgOut.getIp82921ErrMsg();
   }

  
	/**
	*  set variable ip82921ErrMsg
	*  @param value
	**/
   public void setIp82921ErrMsg(char[] value) throws CFException {
      ip82921ErrMsgOut.setIp82921ErrMsg(value);
   } 

     /**
	 * 	Update Ip82921ErrMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921ErrMsg(char[] source, int sourceIndex) throws CFException {
      ip82921ErrMsgOut.setIp82921ErrMsg(source, sourceIndex);
   	
   }
   
   public void setIp82921ErrMsg(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip82921ErrMsgOut.setIp82921ErrMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip82921ErrMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ErrMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip82921ErrMsgOut.setIp82921ErrMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip82921ErrMsg with another Field
	 *	@param value
	 */
   public void setIp82921ErrMsg(Field source) {
      ip82921ErrMsgOut.setIp82921ErrMsg(source);
   }  
   
     /**
	 * 	Update Ip82921ErrMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921ErrMsg(Field source, int sourceIndex,int sourceLen) {
      ip82921ErrMsgOut.setIp82921ErrMsg(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip82921ErrMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ErrMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip82921ErrMsgOut.setIp82921ErrMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of badReasonCode611
	 *	@return badReasonCode611
	 */
	public long getBadReasonCode611() throws CFException {
   		return queueErrorMsg611.getBadReasonCode611();
	}


	/**
	 *	Returns String value of badReasonCode611
	 *	@return badReasonCode611
	 */
	public char[]  getBadReasonCode611String() throws CFException {
	     return String.valueOf(queueErrorMsg611.getBadReasonCode611String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean badReasonCode611IsNumeric()  throws CFException{
	    return queueErrorMsg611.badReasonCode611IsNumeric();
	}

	/**
	 * 	Update BadReasonCode611 with the passed value
	 *	@param number
	 */
	public void setBadReasonCode611(long number)  throws CFException{
		queueErrorMsg611.setBadReasonCode611(number);
	}
	

	
	/**
	 * 	Update BadReasonCode611 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBadReasonCode611(char[] value)  throws CFException {
		queueErrorMsg611.setBadReasonCode611(value);
	}
	
	/**
	 * 	Update BadReasonCode611 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBadReasonCode611String(char[] value)  throws CFException{
		queueErrorMsg611.setBadReasonCode611(value);
	}	

	/**
	 *	Returns the value of end800
	 *	@return end800
	 */
	public int getEnd800() throws CFException {        
   		return work.getEnd800();
	}
	
	/**
	 * 	Update End800 with the passed value
	 *	@param number
	 */
	public void setEnd800(int number)  throws CFException{
		work.setEnd800(number);
	}


	public void setEnd800(long number)  throws CFException{
		work.setEnd800((int)number);
	}


	/**
	 *	Test condition "GET " for isIp70521Get88()
	 *	@return  Returns true if isIp70521Get88() is "GET "
	 */
   public boolean isIp70521Get88() throws CFException {
      return ip70521MqApiLayout.isIp70521Get88();
   }

	/**
	*  set values "GET "
	*/
   	public void setIp70521Get88True()  throws CFException{  			
    	ip70521MqApiLayout.setIp70521Get88True();
   	}
	/**
	 *	Returns the value of fnsPldRd
	 *	@return fnsPldRd
	 */   
	 public FnsPldRd getFnsPldRd() {
   	return fnsPldRd;
   }


	/**
	 *	Returns the value of mqgetFailMsg300
	 *	@return mqgetFailMsg300
	 */
   public char[] getMqgetFailMsg300() throws CFException  {              
   		return work.getMqgetFailMsg300();
   }

  
	/**
	*  set variable mqgetFailMsg300
	*  @param value
	**/
   public void setMqgetFailMsg300(char[] value) throws CFException {
      work.setMqgetFailMsg300(value);
   } 

	/**
	 *	Returns the value of getQAbendCode300
	 *	@return getQAbendCode300
	 */
   public char[] getGetQAbendCode300() throws CFException  {              
   		return work.getGetQAbendCode300();
   }

  
	/**
	*  set variable getQAbendCode300
	*  @param value
	**/
   public void setGetQAbendCode300(char[] value) throws CFException {
      work.setGetQAbendCode300(value);
   } 

	/**
	 *	Test condition "F" for isGetFaaFac88100()
	 *	@return  Returns true if isGetFaaFac88100() is "F"
	 */
   public boolean isGetFaaFac88100() throws CFException {
      return checkGetQueueGroup100.isGetFaaFac88100();
   }

	/**
	*  set values "F"
	*/
   	public void setGetFaaFac88100True()  throws CFException{  			
    	checkGetQueueGroup100.setGetFaaFac88100True();
   	}
	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return abendMessage900.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      abendMessage900.setAbendText900(value);
   } 

     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendText900(source, sourceIndex);
   	
   }
   
   public void setAbendText900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendText900 with another Field
	 *	@param value
	 */
   public void setAbendText900(Field source) {
      abendMessage900.setAbendText900(source);
   }  
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "Y" for isIp70521MqReturnY88()
	 *	@return  Returns true if isIp70521MqReturnY88() is "Y"
	 */
   public boolean isIp70521MqReturnY88() throws CFException {
      return ip70521MqApiLayout.isIp70521MqReturnY88();
   }

	/**
	*  set values "Y"
	*/
   	public void setIp70521MqReturnY88True()  throws CFException{  			
    	ip70521MqApiLayout.setIp70521MqReturnY88True();
   	}
	/**
	 *	Returns the value of mqgetFailCount800
	 *	@return mqgetFailCount800
	 */
	public int getMqgetFailCount800() throws CFException {        
   		return work.getMqgetFailCount800();
	}
	
	/**
	 * 	Update MqgetFailCount800 with the passed value
	 *	@param number
	 */
	public void setMqgetFailCount800(int number)  throws CFException{
		work.setMqgetFailCount800(number);
	}


	public void setMqgetFailCount800(long number)  throws CFException{
		work.setMqgetFailCount800((int)number);
	}


	/**
	 *	Test condition "ERROR GETTING MESSAGE FROM QUEUE " for isErrGet88611()
	 *	@return  Returns true if isErrGet88611() is "ERROR GETTING MESSAGE FROM QUEUE "
	 */
   public boolean isErrGet88611() throws CFException {
      return queueErrorMsg611.isErrGet88611();
   }

	/**
	*  set values "ERROR GETTING MESSAGE FROM QUEUE "
	*/
   	public void setErrGet88611True()  throws CFException{  			
    	queueErrorMsg611.setErrGet88611True();
   	}
	/**
	 *	Returns the value of paraName2410300
	 *	@return paraName2410300
	 */
   public char[] getParaName2410300() throws CFException  {              
   		return work.getParaName2410300();
   }

  
	/**
	*  set variable paraName2410300
	*  @param value
	**/
   public void setParaName2410300(char[] value) throws CFException {
      work.setParaName2410300(value);
   } 

	/**
	 *	Returns the value of abendParaName900
	 *	@return abendParaName900
	 */
   public char[] getAbendParaName900() throws CFException  {              
   		return abendPara900.getAbendParaName900();
   }

  
	/**
	*  set variable abendParaName900
	*  @param value
	**/
   public void setAbendParaName900(char[] value) throws CFException {
      abendPara900.setAbendParaName900(value);
   } 

     /**
	 * 	Update AbendParaName900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendParaName900(char[] source, int sourceIndex) throws CFException {
      abendPara900.setAbendParaName900(source, sourceIndex);
   	
   }
   
   public void setAbendParaName900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendParaName900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendParaName900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendParaName900 with another Field
	 *	@param value
	 */
   public void setAbendParaName900(Field source) {
      abendPara900.setAbendParaName900(source);
   }  
   
     /**
	 * 	Update AbendParaName900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendParaName900(Field source, int sourceIndex,int sourceLen) {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendParaName900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendParaName900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "N" for isMqRespN88100()
	 *	@return  Returns true if isMqRespN88100() is "N"
	 */
   public boolean isMqRespN88100() throws CFException {
      return work.isMqRespN88100();
   }

	/**
	*  set values "N"
	*/
   	public void setMqRespN88100True()  throws CFException{  			
    	work.setMqRespN88100True();
   	}
	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += checkGetQueueGroup100.hashCode();
        str += queueErrorMsg611.hashCode();
        str += ip82921ErrMsgOut.hashCode();
        str += ip70521MqApiLayout.hashCode();
        str += fnsPldRd.hashCode();
        str += abendPara900.hashCode();
        str += work.hashCode();
        str += ip08101RunControlRecord.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public CallMqgetapiForReadOutCtx clone() {
        CallMqgetapiForReadOutCtx cloneObj = new CallMqgetapiForReadOutCtx();
        cloneObj.checkGetQueueGroup100 = new CheckGetQueueGroup100();
        cloneObj.checkGetQueueGroup100.set(checkGetQueueGroup100.getClonedField());
        cloneObj.queueErrorMsg611 = new QueueErrorMsg611();
        cloneObj.queueErrorMsg611.set(queueErrorMsg611.getClonedField());
        cloneObj.ip82921ErrMsgOut = new Ip82921ErrMsgOut();
        cloneObj.ip82921ErrMsgOut.set(ip82921ErrMsgOut.getClonedField());
        cloneObj.ip70521MqApiLayout = new Ip70521MqApiLayout();
        cloneObj.ip70521MqApiLayout.set(ip70521MqApiLayout.getClonedField());
        cloneObj.fnsPldRd = new FnsPldRd();
        cloneObj.fnsPldRd.set(fnsPldRd.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip08101RunControlRecord = new Ip08101RunControlRecord();
        cloneObj.ip08101RunControlRecord.set(ip08101RunControlRecord.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public CallMqgetapiForReadOutCtx getCallMqgetapiForReadOutCtx() {
            return new CallMqgetapiForReadOutCtx();
    }
     public class PrepTipamrsInsertInCtx implements Cloneable {
     Ip64801LrmCommBlock ip64801LrmCommBlock = Ip829010Ctx.this.getIp64801LrmCommBlock();
     Ip34051MqProcessParameters ip34051MqProcessParameters = Ip829010Ctx.this.getIp34051MqProcessParameters();
     Ip70711TipamrsEntries ip70711TipamrsEntries = Ip829010Ctx.this.getIp70711TipamrsEntries();
     Ip70521MqApiLayout ip70521MqApiLayout = Ip829010Ctx.this.getIp70521MqApiLayout();
     FnsPldRd fnsPldRd = Ip829010Ctx.this.getFnsPldRd();
     Work work = Ip829010Ctx.this.getWork();

	/**
	 *	Returns the value of ip70521MsgBuffer
	 *	@return ip70521MsgBuffer
	 */
   public char[] getIp70521MsgBuffer() throws CFException  {              
   		return ip70521MqApiLayout.getIp70521MsgBuffer();
   }

  
	/**
	*  set variable ip70521MsgBuffer
	*  @param value
	**/
   public void setIp70521MsgBuffer(char[] value) throws CFException {
      ip70521MqApiLayout.setIp70521MsgBuffer(value);
   } 

     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521MsgBuffer(char[] source, int sourceIndex) throws CFException {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex);
   	
   }
   
   public void setIp70521MsgBuffer(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MsgBuffer(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70521MsgBuffer with another Field
	 *	@param value
	 */
   public void setIp70521MsgBuffer(Field source) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source);
   }  
   
     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521MsgBuffer(Field source, int sourceIndex,int sourceLen) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MsgBuffer(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getFnsPldRdTxnNum() throws CFException {  
        return fnsPldRd.getFnsPldRdTxnNum();
}
	/**
	 * 	Update FnsPldRdTxnNum with the passed value
	 *	@param number
	 */
	public void setFnsPldRdTxnNum(int number)  throws CFException{
		fnsPldRd.setFnsPldRdTxnNum(number);
	}


	public void setFnsPldRdTxnNum(long number)  throws CFException{
	    fnsPldRd.setFnsPldRdTxnNum(number);
	}
	

	/**
	 *	Returns the value of fnsPldRdLogicalSeq
	 *	@return fnsPldRdLogicalSeq
	 */
	public int getFnsPldRdLogicalSeq() throws CFException {        
   		return fnsPldRd.getFnsPldRdLogicalSeq();
	}
	
	/**
	 * 	Update FnsPldRdLogicalSeq with the passed value
	 *	@param number
	 */
	public void setFnsPldRdLogicalSeq(int number)  throws CFException{
		fnsPldRd.setFnsPldRdLogicalSeq(number);
	}


	public void setFnsPldRdLogicalSeq(long number)  throws CFException{
		fnsPldRd.setFnsPldRdLogicalSeq((int)number);
	}


	/**
	 *	Returns the value of ip70521MsgBufferLen
	 *	@return ip70521MsgBufferLen
	 */
	public int getIp70521MsgBufferLen() throws CFException {        
   		return ip70521MqApiLayout.getIp70521MsgBufferLen();
	}
	
	/**
	 * 	Update Ip70521MsgBufferLen with the passed value
	 *	@param number
	 */
	public void setIp70521MsgBufferLen(int number)  throws CFException{
		ip70521MqApiLayout.setIp70521MsgBufferLen(number);
	}


	public void setIp70521MsgBufferLen(long number)  throws CFException{
		ip70521MqApiLayout.setIp70521MsgBufferLen((int)number);
	}


	/**
	 *	Returns the value of value1300
	 *	@return value1300
	 */
	public short getValue1300() throws CFException {        
   		return work.getValue1300();
	}
	
	/**
	 * 	Update Value1300 with the passed value
	 *	@param number
	 */
	public void setValue1300(short number)  throws CFException{
		work.setValue1300(number);
	}

	public void setValue1300(int number)  throws CFException{
		work.setValue1300((short)number);
	}

	public void setValue1300(long number)  throws CFException{
		work.setValue1300((short)number);
	}



	/**
	 *	Returns the value of ip70711TipamrsEntries
	 *	@return ip70711TipamrsEntries
	 */   
	 public Ip70711TipamrsEntries getIp70711TipamrsEntries() {
   	return ip70711TipamrsEntries;
   }


	/**
	 *	Returns the value of valueC300
	 *	@return valueC300
	 */
   public char[] getValueC300() throws CFException  {              
   		return work.getValueC300();
   }

  
	/**
	*  set variable valueC300
	*  @param value
	**/
   public void setValueC300(char[] value) throws CFException {
      work.setValueC300(value);
   } 

	/**
	 *	Returns the value of fnsPldRdGftDsn
	 *	@return fnsPldRdGftDsn
	 */
   public char[] getFnsPldRdGftDsn() throws CFException  {              
   		return fnsPldRd.getFnsPldRdGftDsn();
   }

  
	/**
	*  set variable fnsPldRdGftDsn
	*  @param value
	**/
   public void setFnsPldRdGftDsn(char[] value) throws CFException {
      fnsPldRd.setFnsPldRdGftDsn(value);
   } 

     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(char[] source, int sourceIndex) throws CFException {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex);
   	
   }
   
   public void setFnsPldRdGftDsn(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPldRdGftDsn with another Field
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(Field source) {
      fnsPldRd.setFnsPldRdGftDsn(source);
   }  
   
     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(Field source, int sourceIndex,int sourceLen) {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of end800
	 *	@return end800
	 */
	public int getEnd800() throws CFException {        
   		return work.getEnd800();
	}
	
	/**
	 * 	Update End800 with the passed value
	 *	@param number
	 */
	public void setEnd800(int number)  throws CFException{
		work.setEnd800(number);
	}


	public void setEnd800(long number)  throws CFException{
		work.setEnd800((int)number);
	}


	/**
	 *	Returns the value of ip70521MqTimestamp
	 *	@return ip70521MqTimestamp
	 */
   public char[] getIp70521MqTimestamp() throws CFException  {              
   		return ip70521MqApiLayout.getIp70521MqTimestamp();
   }

  
	/**
	*  set variable ip70521MqTimestamp
	*  @param value
	**/
   public void setIp70521MqTimestamp(char[] value) throws CFException {
      ip70521MqApiLayout.setIp70521MqTimestamp(value);
   } 

     /**
	 * 	Update Ip70521MqTimestamp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521MqTimestamp(char[] source, int sourceIndex) throws CFException {
      ip70521MqApiLayout.setIp70521MqTimestamp(source, sourceIndex);
   	
   }
   
   public void setIp70521MqTimestamp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70521MqApiLayout.setIp70521MqTimestamp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70521MqTimestamp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MqTimestamp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521MqTimestamp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70521MqTimestamp with another Field
	 *	@param value
	 */
   public void setIp70521MqTimestamp(Field source) {
      ip70521MqApiLayout.setIp70521MqTimestamp(source);
   }  
   
     /**
	 * 	Update Ip70521MqTimestamp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521MqTimestamp(Field source, int sourceIndex,int sourceLen) {
      ip70521MqApiLayout.setIp70521MqTimestamp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70521MqTimestamp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MqTimestamp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521MqTimestamp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip64801LrmJobgrpNum
	 *	@return ip64801LrmJobgrpNum
	 */
	public int getIp64801LrmJobgrpNum() throws CFException {
   		return ip64801LrmCommBlock.getIp64801LrmJobgrpNum();
	}


	/**
	 *	Returns String value of ip64801LrmJobgrpNum
	 *	@return ip64801LrmJobgrpNum
	 */
	public char[]  getIp64801LrmJobgrpNumString() throws CFException {
	     return String.valueOf(ip64801LrmCommBlock.getIp64801LrmJobgrpNumString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip64801LrmJobgrpNumIsNumeric()  throws CFException{
	    return ip64801LrmCommBlock.ip64801LrmJobgrpNumIsNumeric();
	}

	/**
	 * 	Update Ip64801LrmJobgrpNum with the passed value
	 *	@param number
	 */
	public void setIp64801LrmJobgrpNum(int number)  throws CFException{
		ip64801LrmCommBlock.setIp64801LrmJobgrpNum(number);
	}
	

	public void setIp64801LrmJobgrpNum(long number)  throws CFException{
	    ip64801LrmCommBlock.setIp64801LrmJobgrpNum(number);
	}
	
	
	/**
	 * 	Update Ip64801LrmJobgrpNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp64801LrmJobgrpNum(char[] value)  throws CFException {
		ip64801LrmCommBlock.setIp64801LrmJobgrpNum(value);
	}
	
	/**
	 * 	Update Ip64801LrmJobgrpNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp64801LrmJobgrpNumString(char[] value)  throws CFException{
		ip64801LrmCommBlock.setIp64801LrmJobgrpNum(value);
	}	

	/**
	 *	Returns the value of ip70521MqApiLayout
	 *	@return ip70521MqApiLayout
	 */   
	 public Ip70521MqApiLayout getIp70521MqApiLayout() {
   	return ip70521MqApiLayout;
   }


	/**
	 *	Returns the value of ip34051ServCd
	 *	@return ip34051ServCd
	 */
   public char[] getIp34051ServCd() throws CFException  {              
   		return ip34051MqProcessParameters.getIp34051ServCd();
   }

  
	/**
	*  set variable ip34051ServCd
	*  @param value
	**/
   public void setIp34051ServCd(char[] value) throws CFException {
      ip34051MqProcessParameters.setIp34051ServCd(value);
   } 

     /**
	 * 	Update Ip34051ServCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp34051ServCd(char[] source, int sourceIndex) throws CFException {
      ip34051MqProcessParameters.setIp34051ServCd(source, sourceIndex);
   	
   }
   
   public void setIp34051ServCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip34051MqProcessParameters.setIp34051ServCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip34051ServCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp34051ServCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip34051MqProcessParameters.setIp34051ServCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip34051ServCd with another Field
	 *	@param value
	 */
   public void setIp34051ServCd(Field source) {
      ip34051MqProcessParameters.setIp34051ServCd(source);
   }  
   
     /**
	 * 	Update Ip34051ServCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp34051ServCd(Field source, int sourceIndex,int sourceLen) {
      ip34051MqProcessParameters.setIp34051ServCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip34051ServCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp34051ServCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip34051MqProcessParameters.setIp34051ServCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of mqRespCd800
	 *	@return mqRespCd800
	 */
   public char[] getMqRespCd800() throws CFException  {              
   		return work.getMqRespCd800();
   }

  
	/**
	*  set variable mqRespCd800
	*  @param value
	**/
   public void setMqRespCd800(char[] value) throws CFException {
      work.setMqRespCd800(value);
   } 

	/**
	 *	Returns the value of ip64801LrmJobgrpName
	 *	@return ip64801LrmJobgrpName
	 */
   public char[] getIp64801LrmJobgrpName() throws CFException  {              
   		return ip64801LrmCommBlock.getIp64801LrmJobgrpName();
   }

  
	/**
	*  set variable ip64801LrmJobgrpName
	*  @param value
	**/
   public void setIp64801LrmJobgrpName(char[] value) throws CFException {
      ip64801LrmCommBlock.setIp64801LrmJobgrpName(value);
   } 

     /**
	 * 	Update Ip64801LrmJobgrpName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp64801LrmJobgrpName(char[] source, int sourceIndex) throws CFException {
      ip64801LrmCommBlock.setIp64801LrmJobgrpName(source, sourceIndex);
   	
   }
   
   public void setIp64801LrmJobgrpName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip64801LrmCommBlock.setIp64801LrmJobgrpName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip64801LrmJobgrpName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp64801LrmJobgrpName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip64801LrmCommBlock.setIp64801LrmJobgrpName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip64801LrmJobgrpName with another Field
	 *	@param value
	 */
   public void setIp64801LrmJobgrpName(Field source) {
      ip64801LrmCommBlock.setIp64801LrmJobgrpName(source);
   }  
   
     /**
	 * 	Update Ip64801LrmJobgrpName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp64801LrmJobgrpName(Field source, int sourceIndex,int sourceLen) {
      ip64801LrmCommBlock.setIp64801LrmJobgrpName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip64801LrmJobgrpName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp64801LrmJobgrpName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip64801LrmCommBlock.setIp64801LrmJobgrpName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public PrepTipamrsInsertOutCtx getPrepTipamrsInsertOutCtx() {
            return new PrepTipamrsInsertOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip64801LrmCommBlock.hashCode();
        str += ip34051MqProcessParameters.hashCode();
        str += ip70711TipamrsEntries.hashCode();
        str += ip70521MqApiLayout.hashCode();
        str += fnsPldRd.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public PrepTipamrsInsertInCtx clone() {
        PrepTipamrsInsertInCtx cloneObj = new PrepTipamrsInsertInCtx();
        cloneObj.ip64801LrmCommBlock = new Ip64801LrmCommBlock();
        cloneObj.ip64801LrmCommBlock.set(ip64801LrmCommBlock.getClonedField());
        cloneObj.ip34051MqProcessParameters = new Ip34051MqProcessParameters();
        cloneObj.ip34051MqProcessParameters.set(ip34051MqProcessParameters.getClonedField());
        cloneObj.ip70711TipamrsEntries = new Ip70711TipamrsEntries();
        cloneObj.ip70711TipamrsEntries.set(ip70711TipamrsEntries.getClonedField());
        cloneObj.ip70521MqApiLayout = new Ip70521MqApiLayout();
        cloneObj.ip70521MqApiLayout.set(ip70521MqApiLayout.getClonedField());
        cloneObj.fnsPldRd = new FnsPldRd();
        cloneObj.fnsPldRd.set(fnsPldRd.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public PrepTipamrsInsertInCtx getPrepTipamrsInsertInCtx() {
            return new PrepTipamrsInsertInCtx();
    }
     public class PrepTipamrsInsertOutCtx implements Cloneable {
     Ip64801LrmCommBlock ip64801LrmCommBlock = Ip829010Ctx.this.getIp64801LrmCommBlock();
     Ip34051MqProcessParameters ip34051MqProcessParameters = Ip829010Ctx.this.getIp34051MqProcessParameters();
     Ip70711TipamrsEntries ip70711TipamrsEntries = Ip829010Ctx.this.getIp70711TipamrsEntries();
     Ip70521MqApiLayout ip70521MqApiLayout = Ip829010Ctx.this.getIp70521MqApiLayout();
     FnsPldRd fnsPldRd = Ip829010Ctx.this.getFnsPldRd();
     Work work = Ip829010Ctx.this.getWork();

public int getFnsPldRdTxnNum() throws CFException {  
        return fnsPldRd.getFnsPldRdTxnNum();
}
	/**
	 * 	Update FnsPldRdTxnNum with the passed value
	 *	@param number
	 */
	public void setFnsPldRdTxnNum(int number)  throws CFException{
		fnsPldRd.setFnsPldRdTxnNum(number);
	}


	public void setFnsPldRdTxnNum(long number)  throws CFException{
	    fnsPldRd.setFnsPldRdTxnNum(number);
	}
	

	/**
	 *	Returns the value of ip70521MsgBufferLen
	 *	@return ip70521MsgBufferLen
	 */
	public int getIp70521MsgBufferLen() throws CFException {        
   		return ip70521MqApiLayout.getIp70521MsgBufferLen();
	}
	
	/**
	 * 	Update Ip70521MsgBufferLen with the passed value
	 *	@param number
	 */
	public void setIp70521MsgBufferLen(int number)  throws CFException{
		ip70521MqApiLayout.setIp70521MsgBufferLen(number);
	}


	public void setIp70521MsgBufferLen(long number)  throws CFException{
		ip70521MqApiLayout.setIp70521MsgBufferLen((int)number);
	}


	/**
	 *	Returns the value of value1300
	 *	@return value1300
	 */
	public short getValue1300() throws CFException {        
   		return work.getValue1300();
	}
	
	/**
	 * 	Update Value1300 with the passed value
	 *	@param number
	 */
	public void setValue1300(short number)  throws CFException{
		work.setValue1300(number);
	}

	public void setValue1300(int number)  throws CFException{
		work.setValue1300((short)number);
	}

	public void setValue1300(long number)  throws CFException{
		work.setValue1300((short)number);
	}



	/**
	 *	Returns the value of fnsPldRdGftDsn
	 *	@return fnsPldRdGftDsn
	 */
   public char[] getFnsPldRdGftDsn() throws CFException  {              
   		return fnsPldRd.getFnsPldRdGftDsn();
   }

  
	/**
	*  set variable fnsPldRdGftDsn
	*  @param value
	**/
   public void setFnsPldRdGftDsn(char[] value) throws CFException {
      fnsPldRd.setFnsPldRdGftDsn(value);
   } 

     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(char[] source, int sourceIndex) throws CFException {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex);
   	
   }
   
   public void setFnsPldRdGftDsn(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPldRdGftDsn with another Field
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(Field source) {
      fnsPldRd.setFnsPldRdGftDsn(source);
   }  
   
     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(Field source, int sourceIndex,int sourceLen) {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of end800
	 *	@return end800
	 */
	public int getEnd800() throws CFException {        
   		return work.getEnd800();
	}
	
	/**
	 * 	Update End800 with the passed value
	 *	@param number
	 */
	public void setEnd800(int number)  throws CFException{
		work.setEnd800(number);
	}


	public void setEnd800(long number)  throws CFException{
		work.setEnd800((int)number);
	}


	/**
	 *	Returns the value of ip70711JobGrpNum
	 *	@return ip70711JobGrpNum
	 */
	public int getIp70711JobGrpNum() throws CFException {
   		return ip70711TipamrsEntries.getIp70711ResponseData().getIp70711JobGrpNum();
	}


	/**
	 *	Returns String value of ip70711JobGrpNum
	 *	@return ip70711JobGrpNum
	 */
	public char[]  getIp70711JobGrpNumString() throws CFException {
	     return String.valueOf(ip70711TipamrsEntries.getIp70711ResponseData().getIp70711JobGrpNumString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip70711JobGrpNumIsNumeric()  throws CFException{
	    return ip70711TipamrsEntries.getIp70711ResponseData().ip70711JobGrpNumIsNumeric();
	}

	/**
	 * 	Update Ip70711JobGrpNum with the passed value
	 *	@param number
	 */
	public void setIp70711JobGrpNum(int number)  throws CFException{
		ip70711TipamrsEntries.getIp70711ResponseData().setIp70711JobGrpNum(number);
	}
	

	public void setIp70711JobGrpNum(long number)  throws CFException{
	    ip70711TipamrsEntries.getIp70711ResponseData().setIp70711JobGrpNum(number);
	}
	
	
	/**
	 * 	Update Ip70711JobGrpNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp70711JobGrpNum(char[] value)  throws CFException {
		ip70711TipamrsEntries.getIp70711ResponseData().setIp70711JobGrpNum(value);
	}
	
	/**
	 * 	Update Ip70711JobGrpNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp70711JobGrpNumString(char[] value)  throws CFException{
		ip70711TipamrsEntries.getIp70711ResponseData().setIp70711JobGrpNum(value);
	}	

	/**
	 *	Returns the value of ip70711FileSeqNum
	 *	@return ip70711FileSeqNum
	 */
	public int getIp70711FileSeqNum() throws CFException {        
   		return ip70711TipamrsEntries.getIp70711TipamrsKey().getIp70711FileSeqNum();
	}
	
	/**
	 * 	Update Ip70711FileSeqNum with the passed value
	 *	@param number
	 */
	public void setIp70711FileSeqNum(int number)  throws CFException{
		ip70711TipamrsEntries.getIp70711TipamrsKey().setIp70711FileSeqNum(number);
	}


	public void setIp70711FileSeqNum(long number)  throws CFException{
		ip70711TipamrsEntries.getIp70711TipamrsKey().setIp70711FileSeqNum((int)number);
	}


	/**
	 *	Returns the value of ip70711JobGrpId
	 *	@return ip70711JobGrpId
	 */
   public char[] getIp70711JobGrpId() throws CFException  {              
   		return ip70711TipamrsEntries.getIp70711ResponseData().getIp70711JobGrpId();
   }

  
	/**
	*  set variable ip70711JobGrpId
	*  @param value
	**/
   public void setIp70711JobGrpId(char[] value) throws CFException {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711JobGrpId(value);
   } 

     /**
	 * 	Update Ip70711JobGrpId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70711JobGrpId(char[] source, int sourceIndex) throws CFException {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711JobGrpId(source, sourceIndex);
   	
   }
   
   public void setIp70711JobGrpId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711JobGrpId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70711JobGrpId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70711JobGrpId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711JobGrpId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70711JobGrpId with another Field
	 *	@param value
	 */
   public void setIp70711JobGrpId(Field source) {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711JobGrpId(source);
   }  
   
     /**
	 * 	Update Ip70711JobGrpId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70711JobGrpId(Field source, int sourceIndex,int sourceLen) {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711JobGrpId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70711JobGrpId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70711JobGrpId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711JobGrpId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip34051ServCd
	 *	@return ip34051ServCd
	 */
   public char[] getIp34051ServCd() throws CFException  {              
   		return ip34051MqProcessParameters.getIp34051ServCd();
   }

  
	/**
	*  set variable ip34051ServCd
	*  @param value
	**/
   public void setIp34051ServCd(char[] value) throws CFException {
      ip34051MqProcessParameters.setIp34051ServCd(value);
   } 

     /**
	 * 	Update Ip34051ServCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp34051ServCd(char[] source, int sourceIndex) throws CFException {
      ip34051MqProcessParameters.setIp34051ServCd(source, sourceIndex);
   	
   }
   
   public void setIp34051ServCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip34051MqProcessParameters.setIp34051ServCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip34051ServCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp34051ServCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip34051MqProcessParameters.setIp34051ServCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip34051ServCd with another Field
	 *	@param value
	 */
   public void setIp34051ServCd(Field source) {
      ip34051MqProcessParameters.setIp34051ServCd(source);
   }  
   
     /**
	 * 	Update Ip34051ServCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp34051ServCd(Field source, int sourceIndex,int sourceLen) {
      ip34051MqProcessParameters.setIp34051ServCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip34051ServCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp34051ServCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip34051MqProcessParameters.setIp34051ServCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of mqRespCd800
	 *	@return mqRespCd800
	 */
   public char[] getMqRespCd800() throws CFException  {              
   		return work.getMqRespCd800();
   }

  
	/**
	*  set variable mqRespCd800
	*  @param value
	**/
   public void setMqRespCd800(char[] value) throws CFException {
      work.setMqRespCd800(value);
   } 

public int getIp70711TxnNum() throws CFException {  
        return ip70711TipamrsEntries.getIp70711TipamrsKey().getIp70711TxnNum();
}
	/**
	 * 	Update Ip70711TxnNum with the passed value
	 *	@param number
	 */
	public void setIp70711TxnNum(int number)  throws CFException{
		ip70711TipamrsEntries.getIp70711TipamrsKey().setIp70711TxnNum(number);
	}


	public void setIp70711TxnNum(long number)  throws CFException{
	    ip70711TipamrsEntries.getIp70711TipamrsKey().setIp70711TxnNum(number);
	}
	

	/**
	 *	Returns the value of ip70711StrtJobNum
	 *	@return ip70711StrtJobNum
	 */
   public char[] getIp70711StrtJobNum() throws CFException  {              
   		return ip70711TipamrsEntries.getIp70711ResponseData().getIp70711StrtJobNum();
   }

  
	/**
	*  set variable ip70711StrtJobNum
	*  @param value
	**/
   public void setIp70711StrtJobNum(char[] value) throws CFException {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711StrtJobNum(value);
   } 

     /**
	 * 	Update Ip70711StrtJobNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70711StrtJobNum(char[] source, int sourceIndex) throws CFException {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711StrtJobNum(source, sourceIndex);
   	
   }
   
   public void setIp70711StrtJobNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711StrtJobNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70711StrtJobNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70711StrtJobNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711StrtJobNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70711StrtJobNum with another Field
	 *	@param value
	 */
   public void setIp70711StrtJobNum(Field source) {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711StrtJobNum(source);
   }  
   
     /**
	 * 	Update Ip70711StrtJobNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70711StrtJobNum(Field source, int sourceIndex,int sourceLen) {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711StrtJobNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70711StrtJobNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70711StrtJobNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711StrtJobNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip64801LrmJobgrpName
	 *	@return ip64801LrmJobgrpName
	 */
   public char[] getIp64801LrmJobgrpName() throws CFException  {              
   		return ip64801LrmCommBlock.getIp64801LrmJobgrpName();
   }

  
	/**
	*  set variable ip64801LrmJobgrpName
	*  @param value
	**/
   public void setIp64801LrmJobgrpName(char[] value) throws CFException {
      ip64801LrmCommBlock.setIp64801LrmJobgrpName(value);
   } 

     /**
	 * 	Update Ip64801LrmJobgrpName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp64801LrmJobgrpName(char[] source, int sourceIndex) throws CFException {
      ip64801LrmCommBlock.setIp64801LrmJobgrpName(source, sourceIndex);
   	
   }
   
   public void setIp64801LrmJobgrpName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip64801LrmCommBlock.setIp64801LrmJobgrpName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip64801LrmJobgrpName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp64801LrmJobgrpName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip64801LrmCommBlock.setIp64801LrmJobgrpName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip64801LrmJobgrpName with another Field
	 *	@param value
	 */
   public void setIp64801LrmJobgrpName(Field source) {
      ip64801LrmCommBlock.setIp64801LrmJobgrpName(source);
   }  
   
     /**
	 * 	Update Ip64801LrmJobgrpName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp64801LrmJobgrpName(Field source, int sourceIndex,int sourceLen) {
      ip64801LrmCommBlock.setIp64801LrmJobgrpName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip64801LrmJobgrpName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp64801LrmJobgrpName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip64801LrmCommBlock.setIp64801LrmJobgrpName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip70711ServCd
	 *	@return ip70711ServCd
	 */
   public char[] getIp70711ServCd() throws CFException  {              
   		return ip70711TipamrsEntries.getIp70711TipamrsKey().getIp70711ServCd();
   }

  
	/**
	*  set variable ip70711ServCd
	*  @param value
	**/
   public void setIp70711ServCd(char[] value) throws CFException {
      ip70711TipamrsEntries.getIp70711TipamrsKey().setIp70711ServCd(value);
   } 

     /**
	 * 	Update Ip70711ServCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70711ServCd(char[] source, int sourceIndex) throws CFException {
      ip70711TipamrsEntries.getIp70711TipamrsKey().setIp70711ServCd(source, sourceIndex);
   	
   }
   
   public void setIp70711ServCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70711TipamrsEntries.getIp70711TipamrsKey().setIp70711ServCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70711ServCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70711ServCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70711TipamrsEntries.getIp70711TipamrsKey().setIp70711ServCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70711ServCd with another Field
	 *	@param value
	 */
   public void setIp70711ServCd(Field source) {
      ip70711TipamrsEntries.getIp70711TipamrsKey().setIp70711ServCd(source);
   }  
   
     /**
	 * 	Update Ip70711ServCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70711ServCd(Field source, int sourceIndex,int sourceLen) {
      ip70711TipamrsEntries.getIp70711TipamrsKey().setIp70711ServCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70711ServCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70711ServCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70711TipamrsEntries.getIp70711TipamrsKey().setIp70711ServCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip70521MsgBuffer
	 *	@return ip70521MsgBuffer
	 */
   public char[] getIp70521MsgBuffer() throws CFException  {              
   		return ip70521MqApiLayout.getIp70521MsgBuffer();
   }

  
	/**
	*  set variable ip70521MsgBuffer
	*  @param value
	**/
   public void setIp70521MsgBuffer(char[] value) throws CFException {
      ip70521MqApiLayout.setIp70521MsgBuffer(value);
   } 

     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521MsgBuffer(char[] source, int sourceIndex) throws CFException {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex);
   	
   }
   
   public void setIp70521MsgBuffer(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MsgBuffer(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70521MsgBuffer with another Field
	 *	@param value
	 */
   public void setIp70521MsgBuffer(Field source) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source);
   }  
   
     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521MsgBuffer(Field source, int sourceIndex,int sourceLen) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MsgBuffer(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip70711StatCd
	 *	@return ip70711StatCd
	 */
   public char[] getIp70711StatCd() throws CFException  {              
   		return ip70711TipamrsEntries.getIp70711ResponseData().getIp70711StatCd();
   }

  
	/**
	*  set variable ip70711StatCd
	*  @param value
	**/
   public void setIp70711StatCd(char[] value) throws CFException {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711StatCd(value);
   } 

     /**
	 * 	Update Ip70711StatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70711StatCd(char[] source, int sourceIndex) throws CFException {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711StatCd(source, sourceIndex);
   	
   }
   
   public void setIp70711StatCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711StatCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70711StatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70711StatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711StatCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70711StatCd with another Field
	 *	@param value
	 */
   public void setIp70711StatCd(Field source) {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711StatCd(source);
   }  
   
     /**
	 * 	Update Ip70711StatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70711StatCd(Field source, int sourceIndex,int sourceLen) {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711StatCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70711StatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70711StatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711StatCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip70711MqRespCd
	 *	@return ip70711MqRespCd
	 */
   public char[] getIp70711MqRespCd() throws CFException  {              
   		return ip70711TipamrsEntries.getIp70711ResponseData().getIp70711MqRespCd();
   }

  
	/**
	*  set variable ip70711MqRespCd
	*  @param value
	**/
   public void setIp70711MqRespCd(char[] value) throws CFException {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711MqRespCd(value);
   } 

     /**
	 * 	Update Ip70711MqRespCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70711MqRespCd(char[] source, int sourceIndex) throws CFException {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711MqRespCd(source, sourceIndex);
   	
   }
   
   public void setIp70711MqRespCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711MqRespCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70711MqRespCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70711MqRespCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711MqRespCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70711MqRespCd with another Field
	 *	@param value
	 */
   public void setIp70711MqRespCd(Field source) {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711MqRespCd(source);
   }  
   
     /**
	 * 	Update Ip70711MqRespCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70711MqRespCd(Field source, int sourceIndex,int sourceLen) {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711MqRespCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70711MqRespCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70711MqRespCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711MqRespCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fnsPldRdLogicalSeq
	 *	@return fnsPldRdLogicalSeq
	 */
	public int getFnsPldRdLogicalSeq() throws CFException {        
   		return fnsPldRd.getFnsPldRdLogicalSeq();
	}
	
	/**
	 * 	Update FnsPldRdLogicalSeq with the passed value
	 *	@param number
	 */
	public void setFnsPldRdLogicalSeq(int number)  throws CFException{
		fnsPldRd.setFnsPldRdLogicalSeq(number);
	}


	public void setFnsPldRdLogicalSeq(long number)  throws CFException{
		fnsPldRd.setFnsPldRdLogicalSeq((int)number);
	}


	/**
	 *	Returns the value of ip70711TipamrsEntries
	 *	@return ip70711TipamrsEntries
	 */   
	 public Ip70711TipamrsEntries getIp70711TipamrsEntries() {
   	return ip70711TipamrsEntries;
   }


	/**
	 *	Returns the value of valueC300
	 *	@return valueC300
	 */
   public char[] getValueC300() throws CFException  {              
   		return work.getValueC300();
   }

  
	/**
	*  set variable valueC300
	*  @param value
	**/
   public void setValueC300(char[] value) throws CFException {
      work.setValueC300(value);
   } 

	/**
	 *	Returns the value of ip70521MqTimestamp
	 *	@return ip70521MqTimestamp
	 */
   public char[] getIp70521MqTimestamp() throws CFException  {              
   		return ip70521MqApiLayout.getIp70521MqTimestamp();
   }

  
	/**
	*  set variable ip70521MqTimestamp
	*  @param value
	**/
   public void setIp70521MqTimestamp(char[] value) throws CFException {
      ip70521MqApiLayout.setIp70521MqTimestamp(value);
   } 

     /**
	 * 	Update Ip70521MqTimestamp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521MqTimestamp(char[] source, int sourceIndex) throws CFException {
      ip70521MqApiLayout.setIp70521MqTimestamp(source, sourceIndex);
   	
   }
   
   public void setIp70521MqTimestamp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70521MqApiLayout.setIp70521MqTimestamp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70521MqTimestamp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MqTimestamp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521MqTimestamp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70521MqTimestamp with another Field
	 *	@param value
	 */
   public void setIp70521MqTimestamp(Field source) {
      ip70521MqApiLayout.setIp70521MqTimestamp(source);
   }  
   
     /**
	 * 	Update Ip70521MqTimestamp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521MqTimestamp(Field source, int sourceIndex,int sourceLen) {
      ip70521MqApiLayout.setIp70521MqTimestamp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70521MqTimestamp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MqTimestamp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521MqTimestamp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip70711RespDataTxtLen
	 *	@return ip70711RespDataTxtLen
	 */
	public short getIp70711RespDataTxtLen() throws CFException {        
   		return ip70711TipamrsEntries.getIp70711ResponseData().getIp70711RespDataTxtLen();
	}
	
	/**
	 * 	Update Ip70711RespDataTxtLen with the passed value
	 *	@param number
	 */
	public void setIp70711RespDataTxtLen(short number)  throws CFException{
		ip70711TipamrsEntries.getIp70711ResponseData().setIp70711RespDataTxtLen(number);
	}

	public void setIp70711RespDataTxtLen(int number)  throws CFException{
		ip70711TipamrsEntries.getIp70711ResponseData().setIp70711RespDataTxtLen((short)number);
	}

	public void setIp70711RespDataTxtLen(long number)  throws CFException{
		ip70711TipamrsEntries.getIp70711ResponseData().setIp70711RespDataTxtLen((short)number);
	}



	/**
	 *	Returns the value of ip70711GftDasetNam
	 *	@return ip70711GftDasetNam
	 */
   public char[] getIp70711GftDasetNam() throws CFException  {              
   		return ip70711TipamrsEntries.getIp70711TipamrsKey().getIp70711GftDasetNam();
   }

  
	/**
	*  set variable ip70711GftDasetNam
	*  @param value
	**/
   public void setIp70711GftDasetNam(char[] value) throws CFException {
      ip70711TipamrsEntries.getIp70711TipamrsKey().setIp70711GftDasetNam(value);
   } 

     /**
	 * 	Update Ip70711GftDasetNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70711GftDasetNam(char[] source, int sourceIndex) throws CFException {
      ip70711TipamrsEntries.getIp70711TipamrsKey().setIp70711GftDasetNam(source, sourceIndex);
   	
   }
   
   public void setIp70711GftDasetNam(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70711TipamrsEntries.getIp70711TipamrsKey().setIp70711GftDasetNam(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70711GftDasetNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70711GftDasetNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70711TipamrsEntries.getIp70711TipamrsKey().setIp70711GftDasetNam(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70711GftDasetNam with another Field
	 *	@param value
	 */
   public void setIp70711GftDasetNam(Field source) {
      ip70711TipamrsEntries.getIp70711TipamrsKey().setIp70711GftDasetNam(source);
   }  
   
     /**
	 * 	Update Ip70711GftDasetNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70711GftDasetNam(Field source, int sourceIndex,int sourceLen) {
      ip70711TipamrsEntries.getIp70711TipamrsKey().setIp70711GftDasetNam(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70711GftDasetNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70711GftDasetNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70711TipamrsEntries.getIp70711TipamrsKey().setIp70711GftDasetNam(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip64801LrmJobgrpNum
	 *	@return ip64801LrmJobgrpNum
	 */
	public int getIp64801LrmJobgrpNum() throws CFException {
   		return ip64801LrmCommBlock.getIp64801LrmJobgrpNum();
	}


	/**
	 *	Returns String value of ip64801LrmJobgrpNum
	 *	@return ip64801LrmJobgrpNum
	 */
	public char[]  getIp64801LrmJobgrpNumString() throws CFException {
	     return String.valueOf(ip64801LrmCommBlock.getIp64801LrmJobgrpNumString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip64801LrmJobgrpNumIsNumeric()  throws CFException{
	    return ip64801LrmCommBlock.ip64801LrmJobgrpNumIsNumeric();
	}

	/**
	 * 	Update Ip64801LrmJobgrpNum with the passed value
	 *	@param number
	 */
	public void setIp64801LrmJobgrpNum(int number)  throws CFException{
		ip64801LrmCommBlock.setIp64801LrmJobgrpNum(number);
	}
	

	public void setIp64801LrmJobgrpNum(long number)  throws CFException{
	    ip64801LrmCommBlock.setIp64801LrmJobgrpNum(number);
	}
	
	
	/**
	 * 	Update Ip64801LrmJobgrpNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp64801LrmJobgrpNum(char[] value)  throws CFException {
		ip64801LrmCommBlock.setIp64801LrmJobgrpNum(value);
	}
	
	/**
	 * 	Update Ip64801LrmJobgrpNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp64801LrmJobgrpNumString(char[] value)  throws CFException{
		ip64801LrmCommBlock.setIp64801LrmJobgrpNum(value);
	}	

	/**
	 *	Returns the value of ip70711RespDataTxt
	 *	@return ip70711RespDataTxt
	 */
   public char[] getIp70711RespDataTxt() throws CFException  {              
   		return ip70711TipamrsEntries.getIp70711ResponseData().getIp70711RespDataTxt();
   }

  
	/**
	*  set variable ip70711RespDataTxt
	*  @param value
	**/
   public void setIp70711RespDataTxt(char[] value) throws CFException {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711RespDataTxt(value);
   } 

     /**
	 * 	Update Ip70711RespDataTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70711RespDataTxt(char[] source, int sourceIndex) throws CFException {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711RespDataTxt(source, sourceIndex);
   	
   }
   
   public void setIp70711RespDataTxt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711RespDataTxt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70711RespDataTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70711RespDataTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711RespDataTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70711RespDataTxt with another Field
	 *	@param value
	 */
   public void setIp70711RespDataTxt(Field source) {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711RespDataTxt(source);
   }  
   
     /**
	 * 	Update Ip70711RespDataTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70711RespDataTxt(Field source, int sourceIndex,int sourceLen) {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711RespDataTxt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70711RespDataTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70711RespDataTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711RespDataTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip70711StrtTs
	 *	@return ip70711StrtTs
	 */
   public char[] getIp70711StrtTs() throws CFException  {              
   		return ip70711TipamrsEntries.getIp70711ResponseData().getIp70711StrtTs();
   }

  
	/**
	*  set variable ip70711StrtTs
	*  @param value
	**/
   public void setIp70711StrtTs(char[] value) throws CFException {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711StrtTs(value);
   } 

     /**
	 * 	Update Ip70711StrtTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70711StrtTs(char[] source, int sourceIndex) throws CFException {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711StrtTs(source, sourceIndex);
   	
   }
   
   public void setIp70711StrtTs(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711StrtTs(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70711StrtTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70711StrtTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711StrtTs(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70711StrtTs with another Field
	 *	@param value
	 */
   public void setIp70711StrtTs(Field source) {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711StrtTs(source);
   }  
   
     /**
	 * 	Update Ip70711StrtTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70711StrtTs(Field source, int sourceIndex,int sourceLen) {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711StrtTs(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70711StrtTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70711StrtTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70711TipamrsEntries.getIp70711ResponseData().setIp70711StrtTs(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip64801LrmCommBlock.hashCode();
        str += ip34051MqProcessParameters.hashCode();
        str += ip70711TipamrsEntries.hashCode();
        str += ip70521MqApiLayout.hashCode();
        str += fnsPldRd.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public PrepTipamrsInsertOutCtx clone() {
        PrepTipamrsInsertOutCtx cloneObj = new PrepTipamrsInsertOutCtx();
        cloneObj.ip64801LrmCommBlock = new Ip64801LrmCommBlock();
        cloneObj.ip64801LrmCommBlock.set(ip64801LrmCommBlock.getClonedField());
        cloneObj.ip34051MqProcessParameters = new Ip34051MqProcessParameters();
        cloneObj.ip34051MqProcessParameters.set(ip34051MqProcessParameters.getClonedField());
        cloneObj.ip70711TipamrsEntries = new Ip70711TipamrsEntries();
        cloneObj.ip70711TipamrsEntries.set(ip70711TipamrsEntries.getClonedField());
        cloneObj.ip70521MqApiLayout = new Ip70521MqApiLayout();
        cloneObj.ip70521MqApiLayout.set(ip70521MqApiLayout.getClonedField());
        cloneObj.fnsPldRd = new FnsPldRd();
        cloneObj.fnsPldRd.set(fnsPldRd.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public PrepTipamrsInsertOutCtx getPrepTipamrsInsertOutCtx() {
            return new PrepTipamrsInsertOutCtx();
    }
     public class GetMqRespCdInCtx implements Cloneable {
     Ip30781TipaccdTable ip30781TipaccdTable = Ip829010Ctx.this.getIp30781TipaccdTable();
     ApiLayout apiLayout = Ip829010Ctx.this.getApiLayout();
     Ip30771TipacliTable ip30771TipacliTable = Ip829010Ctx.this.getIp30771TipacliTable();
     AbendPara900 abendPara900 = Ip829010Ctx.this.getAbendPara900();
     Work work = Ip829010Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip829010Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of value7300
	 *	@return value7300
	 */
	public int getValue7300() throws CFException {
   		return work.getValue7300();
	}


	/**
	 *	Returns String value of value7300
	 *	@return value7300
	 */
	public char[]  getValue7300String() throws CFException {
	     return String.valueOf(work.getValue7300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value7300IsNumeric()  throws CFException{
	    return work.value7300IsNumeric();
	}

	/**
	 * 	Update Value7300 with the passed value
	 *	@param number
	 */
	public void setValue7300(int number)  throws CFException{
		work.setValue7300(number);
	}
	

	public void setValue7300(long number)  throws CFException{
	    work.setValue7300(number);
	}
	
	
	/**
	 * 	Update Value7300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue7300(char[] value)  throws CFException {
		work.setValue7300(value);
	}
	
	/**
	 * 	Update Value7300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue7300String(char[] value)  throws CFException{
		work.setValue7300(value);
	}	

	/**
	 *	Returns the value of prevClrCyclId800
	 *	@return prevClrCyclId800
	 */
	public int getPrevClrCyclId800() throws CFException {
   		return work.getPrevClrCyclId800();
	}


	/**
	 *	Returns String value of prevClrCyclId800
	 *	@return prevClrCyclId800
	 */
	public char[]  getPrevClrCyclId800String() throws CFException {
	     return String.valueOf(work.getPrevClrCyclId800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean prevClrCyclId800IsNumeric()  throws CFException{
	    return work.prevClrCyclId800IsNumeric();
	}

	/**
	 * 	Update PrevClrCyclId800 with the passed value
	 *	@param number
	 */
	public void setPrevClrCyclId800(int number)  throws CFException{
		work.setPrevClrCyclId800(number);
	}
	

	public void setPrevClrCyclId800(long number)  throws CFException{
	    work.setPrevClrCyclId800(number);
	}
	
	
	/**
	 * 	Update PrevClrCyclId800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPrevClrCyclId800(char[] value)  throws CFException {
		work.setPrevClrCyclId800(value);
	}
	
	/**
	 * 	Update PrevClrCyclId800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPrevClrCyclId800String(char[] value)  throws CFException{
		work.setPrevClrCyclId800(value);
	}	

	/**
	 *	Returns the value of paraName2426300
	 *	@return paraName2426300
	 */
   public char[] getParaName2426300() throws CFException  {              
   		return work.getParaName2426300();
   }

  
	/**
	*  set variable paraName2426300
	*  @param value
	**/
   public void setParaName2426300(char[] value) throws CFException {
      work.setParaName2426300(value);
   } 

	/**
	 *	Returns the value of getMqRspCdAbendCode300
	 *	@return getMqRspCdAbendCode300
	 */
   public char[] getGetMqRspCdAbendCode300() throws CFException  {              
   		return work.getGetMqRspCdAbendCode300();
   }

  
	/**
	*  set variable getMqRspCdAbendCode300
	*  @param value
	**/
   public void setGetMqRspCdAbendCode300(char[] value) throws CFException {
      work.setGetMqRspCdAbendCode300(value);
   } 

	/**
	 *	Returns the value of queryNoSeven300
	 *	@return queryNoSeven300
	 */
	public short getQueryNoSeven300() throws CFException {        
   		return work.getQueryNoSeven300();
	}
	
	/**
	 * 	Update QueryNoSeven300 with the passed value
	 *	@param number
	 */
	public void setQueryNoSeven300(short number)  throws CFException{
		work.setQueryNoSeven300(number);
	}

	public void setQueryNoSeven300(int number)  throws CFException{
		work.setQueryNoSeven300((short)number);
	}

	public void setQueryNoSeven300(long number)  throws CFException{
		work.setQueryNoSeven300((short)number);
	}



	/**
	 *	Returns the value of ptrIp595210800
	 *	@return ptrIp595210800
	 */
   public char[] getPtrIp595210800() throws CFException  {              
   		return work.getPtrIp595210800();
   }

  
	/**
	*  set variable ptrIp595210800
	*  @param value
	**/
   public void setPtrIp595210800(char[] value) throws CFException {
      work.setPtrIp595210800(value);
   } 

public short getIp30781ClrCyclId() throws CFException {  
        return ip30781TipaccdTable.getIp30781ClrCyclId();
}
	/**
	 * 	Update Ip30781ClrCyclId with the passed value
	 *	@param number
	 */
	public void setIp30781ClrCyclId(short number)  throws CFException{
		ip30781TipaccdTable.setIp30781ClrCyclId(number);
	}

	public void setIp30781ClrCyclId(int number)  throws CFException{
	   ip30781TipaccdTable.setIp30781ClrCyclId(number);
	}
	public void setIp30781ClrCyclId(long number)  throws CFException {
	    ip30781TipaccdTable.setIp30781ClrCyclId(number);
	}
	


public short getIp30771ClrCyclId() throws CFException {  
        return ip30771TipacliTable.getIp30771ClrCyclId();
}
	/**
	 * 	Update Ip30771ClrCyclId with the passed value
	 *	@param number
	 */
	public void setIp30771ClrCyclId(short number)  throws CFException{
		ip30771TipacliTable.setIp30771ClrCyclId(number);
	}

	public void setIp30771ClrCyclId(int number)  throws CFException{
	   ip30771TipacliTable.setIp30771ClrCyclId(number);
	}
	public void setIp30771ClrCyclId(long number)  throws CFException {
	    ip30771TipacliTable.setIp30771ClrCyclId(number);
	}
	


	/**
	 *	Returns the value of clrCyclId800
	 *	@return clrCyclId800
	 */
	public int getClrCyclId800() throws CFException {
   		return work.getClrCyclId800();
	}


	/**
	 *	Returns String value of clrCyclId800
	 *	@return clrCyclId800
	 */
	public char[]  getClrCyclId800String() throws CFException {
	     return String.valueOf(work.getClrCyclId800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean clrCyclId800IsNumeric()  throws CFException{
	    return work.clrCyclId800IsNumeric();
	}

	/**
	 * 	Update ClrCyclId800 with the passed value
	 *	@param number
	 */
	public void setClrCyclId800(int number)  throws CFException{
		work.setClrCyclId800(number);
	}
	

	public void setClrCyclId800(long number)  throws CFException{
	    work.setClrCyclId800(number);
	}
	
	
	/**
	 * 	Update ClrCyclId800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setClrCyclId800(char[] value)  throws CFException {
		work.setClrCyclId800(value);
	}
	
	/**
	 * 	Update ClrCyclId800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setClrCyclId800String(char[] value)  throws CFException{
		work.setClrCyclId800(value);
	}	

	/**
	 *	Returns the value of ip30781MqRespCd
	 *	@return ip30781MqRespCd
	 */
   public char[] getIp30781MqRespCd() throws CFException  {              
   		return ip30781TipaccdTable.getIp30781MqRespCd();
   }

  
	/**
	*  set variable ip30781MqRespCd
	*  @param value
	**/
   public void setIp30781MqRespCd(char[] value) throws CFException {
      ip30781TipaccdTable.setIp30781MqRespCd(value);
   } 

     /**
	 * 	Update Ip30781MqRespCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp30781MqRespCd(char[] source, int sourceIndex) throws CFException {
      ip30781TipaccdTable.setIp30781MqRespCd(source, sourceIndex);
   	
   }
   
   public void setIp30781MqRespCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip30781TipaccdTable.setIp30781MqRespCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip30781MqRespCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp30781MqRespCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip30781TipaccdTable.setIp30781MqRespCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip30781MqRespCd with another Field
	 *	@param value
	 */
   public void setIp30781MqRespCd(Field source) {
      ip30781TipaccdTable.setIp30781MqRespCd(source);
   }  
   
     /**
	 * 	Update Ip30781MqRespCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp30781MqRespCd(Field source, int sourceIndex,int sourceLen) {
      ip30781TipaccdTable.setIp30781MqRespCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip30781MqRespCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp30781MqRespCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip30781TipaccdTable.setIp30781MqRespCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of rowsNotFoundErrMsgTxt604
	 *	@return rowsNotFoundErrMsgTxt604
	 */
   public char[] getRowsNotFoundErrMsgTxt604() throws CFException  {              
   		return work.getRowsNotFoundErrMsgTxt604();
   }

  
	/**
	*  set variable rowsNotFoundErrMsgTxt604
	*  @param value
	**/
   public void setRowsNotFoundErrMsgTxt604(char[] value) throws CFException {
      work.setRowsNotFoundErrMsgTxt604(value);
   } 

	/**
	 *	Returns the value of value99300
	 *	@return value99300
	 */
	public int getValue99300() throws CFException {
   		return work.getValue99300();
	}


	/**
	 *	Returns String value of value99300
	 *	@return value99300
	 */
	public char[]  getValue99300String() throws CFException {
	     return String.valueOf(work.getValue99300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value99300IsNumeric()  throws CFException{
	    return work.value99300IsNumeric();
	}

	/**
	 * 	Update Value99300 with the passed value
	 *	@param number
	 */
	public void setValue99300(int number)  throws CFException{
		work.setValue99300(number);
	}
	

	public void setValue99300(long number)  throws CFException{
	    work.setValue99300(number);
	}
	
	
	/**
	 * 	Update Value99300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue99300(char[] value)  throws CFException {
		work.setValue99300(value);
	}
	
	/**
	 * 	Update Value99300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue99300String(char[] value)  throws CFException{
		work.setValue99300(value);
	}	


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public GetMqRespCdOutCtx getGetMqRespCdOutCtx() {
            return new GetMqRespCdOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip30781TipaccdTable.hashCode();
        str += apiLayout.hashCode();
        str += ip30771TipacliTable.hashCode();
        str += abendPara900.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public GetMqRespCdInCtx clone() {
        GetMqRespCdInCtx cloneObj = new GetMqRespCdInCtx();
        cloneObj.ip30781TipaccdTable = new Ip30781TipaccdTable();
        cloneObj.ip30781TipaccdTable.set(ip30781TipaccdTable.getClonedField());
        cloneObj.apiLayout = new ApiLayout();
        cloneObj.apiLayout.set(apiLayout.getClonedField());
        cloneObj.ip30771TipacliTable = new Ip30771TipacliTable();
        cloneObj.ip30771TipacliTable.set(ip30771TipacliTable.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public GetMqRespCdInCtx getGetMqRespCdInCtx() {
            return new GetMqRespCdInCtx();
    }
     public class GetMqRespCdOutCtx implements Cloneable {
     Ip30781TipaccdTable ip30781TipaccdTable = Ip829010Ctx.this.getIp30781TipaccdTable();
     ApiLayout apiLayout = Ip829010Ctx.this.getApiLayout();
     Ip30771TipacliTable ip30771TipacliTable = Ip829010Ctx.this.getIp30771TipacliTable();
     AbendPara900 abendPara900 = Ip829010Ctx.this.getAbendPara900();
     Work work = Ip829010Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip829010Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of prevClrCyclId800
	 *	@return prevClrCyclId800
	 */
	public int getPrevClrCyclId800() throws CFException {
   		return work.getPrevClrCyclId800();
	}


	/**
	 *	Returns String value of prevClrCyclId800
	 *	@return prevClrCyclId800
	 */
	public char[]  getPrevClrCyclId800String() throws CFException {
	     return String.valueOf(work.getPrevClrCyclId800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean prevClrCyclId800IsNumeric()  throws CFException{
	    return work.prevClrCyclId800IsNumeric();
	}

	/**
	 * 	Update PrevClrCyclId800 with the passed value
	 *	@param number
	 */
	public void setPrevClrCyclId800(int number)  throws CFException{
		work.setPrevClrCyclId800(number);
	}
	

	public void setPrevClrCyclId800(long number)  throws CFException{
	    work.setPrevClrCyclId800(number);
	}
	
	
	/**
	 * 	Update PrevClrCyclId800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPrevClrCyclId800(char[] value)  throws CFException {
		work.setPrevClrCyclId800(value);
	}
	
	/**
	 * 	Update PrevClrCyclId800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPrevClrCyclId800String(char[] value)  throws CFException{
		work.setPrevClrCyclId800(value);
	}	

	/**
	 *	Returns the value of rowsNotFoundErrMsgTxt604
	 *	@return rowsNotFoundErrMsgTxt604
	 */
   public char[] getRowsNotFoundErrMsgTxt604() throws CFException  {              
   		return work.getRowsNotFoundErrMsgTxt604();
   }

  
	/**
	*  set variable rowsNotFoundErrMsgTxt604
	*  @param value
	**/
   public void setRowsNotFoundErrMsgTxt604(char[] value) throws CFException {
      work.setRowsNotFoundErrMsgTxt604(value);
   } 

	/**
	 *	Test condition "N" for isItIsNotAbend88100()
	 *	@return  Returns true if isItIsNotAbend88100() is "N"
	 */
   public boolean isItIsNotAbend88100() throws CFException {
      return apiLayout.isItIsNotAbend88100();
   }

	/**
	*  set values "N"
	*/
   	public void setItIsNotAbend88100True()  throws CFException{  			
    	apiLayout.setItIsNotAbend88100True();
   	}
	/**
	 *	Returns the value of value7300
	 *	@return value7300
	 */
	public int getValue7300() throws CFException {
   		return work.getValue7300();
	}


	/**
	 *	Returns String value of value7300
	 *	@return value7300
	 */
	public char[]  getValue7300String() throws CFException {
	     return String.valueOf(work.getValue7300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value7300IsNumeric()  throws CFException{
	    return work.value7300IsNumeric();
	}

	/**
	 * 	Update Value7300 with the passed value
	 *	@param number
	 */
	public void setValue7300(int number)  throws CFException{
		work.setValue7300(number);
	}
	

	public void setValue7300(long number)  throws CFException{
	    work.setValue7300(number);
	}
	
	
	/**
	 * 	Update Value7300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue7300(char[] value)  throws CFException {
		work.setValue7300(value);
	}
	
	/**
	 * 	Update Value7300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue7300String(char[] value)  throws CFException{
		work.setValue7300(value);
	}	

	/**
	 *	Returns the value of paraName2426300
	 *	@return paraName2426300
	 */
   public char[] getParaName2426300() throws CFException  {              
   		return work.getParaName2426300();
   }

  
	/**
	*  set variable paraName2426300
	*  @param value
	**/
   public void setParaName2426300(char[] value) throws CFException {
      work.setParaName2426300(value);
   } 

	/**
	 *	Returns the value of getMqRspCdAbendCode300
	 *	@return getMqRspCdAbendCode300
	 */
   public char[] getGetMqRspCdAbendCode300() throws CFException  {              
   		return work.getGetMqRspCdAbendCode300();
   }

  
	/**
	*  set variable getMqRspCdAbendCode300
	*  @param value
	**/
   public void setGetMqRspCdAbendCode300(char[] value) throws CFException {
      work.setGetMqRspCdAbendCode300(value);
   } 

	/**
	 *	Returns the value of queryNoSeven300
	 *	@return queryNoSeven300
	 */
	public short getQueryNoSeven300() throws CFException {        
   		return work.getQueryNoSeven300();
	}
	
	/**
	 * 	Update QueryNoSeven300 with the passed value
	 *	@param number
	 */
	public void setQueryNoSeven300(short number)  throws CFException{
		work.setQueryNoSeven300(number);
	}

	public void setQueryNoSeven300(int number)  throws CFException{
		work.setQueryNoSeven300((short)number);
	}

	public void setQueryNoSeven300(long number)  throws CFException{
		work.setQueryNoSeven300((short)number);
	}



	/**
	 *	Test condition "Y" for isOpenFirstTime88100()
	 *	@return  Returns true if isOpenFirstTime88100() is "Y"
	 */
   public boolean isOpenFirstTime88100() throws CFException {
      return apiLayout.isOpenFirstTime88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setOpenFirstTime88100True()  throws CFException{  			
    	apiLayout.setOpenFirstTime88100True();
   	}
	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return abendMessage900.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      abendMessage900.setAbendText900(value);
   } 

     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendText900(source, sourceIndex);
   	
   }
   
   public void setAbendText900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendText900 with another Field
	 *	@param value
	 */
   public void setAbendText900(Field source) {
      abendMessage900.setAbendText900(source);
   }  
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of queryNo
	 *	@return queryNo
	 */
	public short getQueryNo() throws CFException {        
   		return apiLayout.getQueryNo();
	}
	
	/**
	 * 	Update QueryNo with the passed value
	 *	@param number
	 */
	public void setQueryNo(short number)  throws CFException{
		apiLayout.setQueryNo(number);
	}

	public void setQueryNo(int number)  throws CFException{
		apiLayout.setQueryNo((short)number);
	}

	public void setQueryNo(long number)  throws CFException{
		apiLayout.setQueryNo((short)number);
	}



public short getIp30781ClrCyclId() throws CFException {  
        return ip30781TipaccdTable.getIp30781ClrCyclId();
}
	/**
	 * 	Update Ip30781ClrCyclId with the passed value
	 *	@param number
	 */
	public void setIp30781ClrCyclId(short number)  throws CFException{
		ip30781TipaccdTable.setIp30781ClrCyclId(number);
	}

	public void setIp30781ClrCyclId(int number)  throws CFException{
	   ip30781TipaccdTable.setIp30781ClrCyclId(number);
	}
	public void setIp30781ClrCyclId(long number)  throws CFException {
	    ip30781TipaccdTable.setIp30781ClrCyclId(number);
	}
	


	/**
	 *	Test condition "S" for isSelectRtn88100()
	 *	@return  Returns true if isSelectRtn88100() is "S"
	 */
   public boolean isSelectRtn88100() throws CFException {
      return apiLayout.isSelectRtn88100();
   }

	/**
	*  set values "S"
	*/
   	public void setSelectRtn88100True()  throws CFException{  			
    	apiLayout.setSelectRtn88100True();
   	}
public short getIp30771ClrCyclId() throws CFException {  
        return ip30771TipacliTable.getIp30771ClrCyclId();
}
	/**
	 * 	Update Ip30771ClrCyclId with the passed value
	 *	@param number
	 */
	public void setIp30771ClrCyclId(short number)  throws CFException{
		ip30771TipacliTable.setIp30771ClrCyclId(number);
	}

	public void setIp30771ClrCyclId(int number)  throws CFException{
	   ip30771TipacliTable.setIp30771ClrCyclId(number);
	}
	public void setIp30771ClrCyclId(long number)  throws CFException {
	    ip30771TipacliTable.setIp30771ClrCyclId(number);
	}
	


	/**
	 *	Test condition "G" for isRowsFound88100()
	 *	@return  Returns true if isRowsFound88100() is "G"
	 */
   public boolean isRowsFound88100() throws CFException {
      return apiLayout.isRowsFound88100();
   }

	/**
	*  set values "G"
	*/
   	public void setRowsFound88100True()  throws CFException{  			
    	apiLayout.setRowsFound88100True();
   	}
	/**
	 *	Returns the value of mqRespCd800
	 *	@return mqRespCd800
	 */
   public char[] getMqRespCd800() throws CFException  {              
   		return work.getMqRespCd800();
   }

  
	/**
	*  set variable mqRespCd800
	*  @param value
	**/
   public void setMqRespCd800(char[] value) throws CFException {
      work.setMqRespCd800(value);
   } 

	/**
	 *	Returns the value of clrCyclId800
	 *	@return clrCyclId800
	 */
	public int getClrCyclId800() throws CFException {
   		return work.getClrCyclId800();
	}


	/**
	 *	Returns String value of clrCyclId800
	 *	@return clrCyclId800
	 */
	public char[]  getClrCyclId800String() throws CFException {
	     return String.valueOf(work.getClrCyclId800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean clrCyclId800IsNumeric()  throws CFException{
	    return work.clrCyclId800IsNumeric();
	}

	/**
	 * 	Update ClrCyclId800 with the passed value
	 *	@param number
	 */
	public void setClrCyclId800(int number)  throws CFException{
		work.setClrCyclId800(number);
	}
	

	public void setClrCyclId800(long number)  throws CFException{
	    work.setClrCyclId800(number);
	}
	
	
	/**
	 * 	Update ClrCyclId800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setClrCyclId800(char[] value)  throws CFException {
		work.setClrCyclId800(value);
	}
	
	/**
	 * 	Update ClrCyclId800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setClrCyclId800String(char[] value)  throws CFException{
		work.setClrCyclId800(value);
	}	

	/**
	 *	Returns the value of ip30781MqRespCd
	 *	@return ip30781MqRespCd
	 */
   public char[] getIp30781MqRespCd() throws CFException  {              
   		return ip30781TipaccdTable.getIp30781MqRespCd();
   }

  
	/**
	*  set variable ip30781MqRespCd
	*  @param value
	**/
   public void setIp30781MqRespCd(char[] value) throws CFException {
      ip30781TipaccdTable.setIp30781MqRespCd(value);
   } 

     /**
	 * 	Update Ip30781MqRespCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp30781MqRespCd(char[] source, int sourceIndex) throws CFException {
      ip30781TipaccdTable.setIp30781MqRespCd(source, sourceIndex);
   	
   }
   
   public void setIp30781MqRespCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip30781TipaccdTable.setIp30781MqRespCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip30781MqRespCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp30781MqRespCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip30781TipaccdTable.setIp30781MqRespCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip30781MqRespCd with another Field
	 *	@param value
	 */
   public void setIp30781MqRespCd(Field source) {
      ip30781TipaccdTable.setIp30781MqRespCd(source);
   }  
   
     /**
	 * 	Update Ip30781MqRespCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp30781MqRespCd(Field source, int sourceIndex,int sourceLen) {
      ip30781TipaccdTable.setIp30781MqRespCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip30781MqRespCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp30781MqRespCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip30781TipaccdTable.setIp30781MqRespCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendPara900
	 *	@return abendPara900
	 */   
	 public AbendPara900 getAbendPara900() {
   	return abendPara900;
   }


	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip30781TipaccdTable.hashCode();
        str += apiLayout.hashCode();
        str += ip30771TipacliTable.hashCode();
        str += abendPara900.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public GetMqRespCdOutCtx clone() {
        GetMqRespCdOutCtx cloneObj = new GetMqRespCdOutCtx();
        cloneObj.ip30781TipaccdTable = new Ip30781TipaccdTable();
        cloneObj.ip30781TipaccdTable.set(ip30781TipaccdTable.getClonedField());
        cloneObj.apiLayout = new ApiLayout();
        cloneObj.apiLayout.set(apiLayout.getClonedField());
        cloneObj.ip30771TipacliTable = new Ip30771TipacliTable();
        cloneObj.ip30771TipacliTable.set(ip30771TipacliTable.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public GetMqRespCdOutCtx getGetMqRespCdOutCtx() {
            return new GetMqRespCdOutCtx();
    }
     public class TipamrsInsertInCtx implements Cloneable {
     Ip82921ErrMsgOut ip82921ErrMsgOut = Ip829010Ctx.this.getIp82921ErrMsgOut();
     ApiLayout apiLayout = Ip829010Ctx.this.getApiLayout();
     AbendPara900 abendPara900 = Ip829010Ctx.this.getAbendPara900();
     Work work = Ip829010Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip829010Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of insertMrsAbendCode300
	 *	@return insertMrsAbendCode300
	 */
   public char[] getInsertMrsAbendCode300() throws CFException  {              
   		return work.getInsertMrsAbendCode300();
   }

  
	/**
	*  set variable insertMrsAbendCode300
	*  @param value
	**/
   public void setInsertMrsAbendCode300(char[] value) throws CFException {
      work.setInsertMrsAbendCode300(value);
   } 

	/**
	 *	Test condition "D" for isDuplicateCode88100()
	 *	@return  Returns true if isDuplicateCode88100() is "D"
	 */
   public boolean isDuplicateCode88100() throws CFException {
      return apiLayout.isDuplicateCode88100();
   }

	/**
	*  set values "D"
	*/
   	public void setDuplicateCode88100True()  throws CFException{  			
    	apiLayout.setDuplicateCode88100True();
   	}
	/**
	 *	Returns the value of tipamrsSkipCount800
	 *	@return tipamrsSkipCount800
	 */
	public int getTipamrsSkipCount800() throws CFException {        
   		return work.getTipamrsSkipCount800();
	}
	
	/**
	 * 	Update TipamrsSkipCount800 with the passed value
	 *	@param number
	 */
	public void setTipamrsSkipCount800(int number)  throws CFException{
		work.setTipamrsSkipCount800(number);
	}


	public void setTipamrsSkipCount800(long number)  throws CFException{
		work.setTipamrsSkipCount800((int)number);
	}


	/**
	 *	Returns the value of paraName24301300
	 *	@return paraName24301300
	 */
   public char[] getParaName24301300() throws CFException  {              
   		return work.getParaName24301300();
   }

  
	/**
	*  set variable paraName24301300
	*  @param value
	**/
   public void setParaName24301300(char[] value) throws CFException {
      work.setParaName24301300(value);
   } 

	/**
	 *	Returns the value of value1300
	 *	@return value1300
	 */
	public short getValue1300() throws CFException {        
   		return work.getValue1300();
	}
	
	/**
	 * 	Update Value1300 with the passed value
	 *	@param number
	 */
	public void setValue1300(short number)  throws CFException{
		work.setValue1300(number);
	}

	public void setValue1300(int number)  throws CFException{
		work.setValue1300((short)number);
	}

	public void setValue1300(long number)  throws CFException{
		work.setValue1300((short)number);
	}



	/**
	 *	Returns the value of tipmrsDuplMsg300
	 *	@return tipmrsDuplMsg300
	 */
   public char[] getTipmrsDuplMsg300() throws CFException  {              
   		return work.getTipmrsDuplMsg300();
   }

  
	/**
	*  set variable tipmrsDuplMsg300
	*  @param value
	**/
   public void setTipmrsDuplMsg300(char[] value) throws CFException {
      work.setTipmrsDuplMsg300(value);
   } 

	/**
	 *	Returns the value of mrsIsrtCount800
	 *	@return mrsIsrtCount800
	 */
	public int getMrsIsrtCount800() throws CFException {        
   		return work.getMrsIsrtCount800();
	}
	
	/**
	 * 	Update MrsIsrtCount800 with the passed value
	 *	@param number
	 */
	public void setMrsIsrtCount800(int number)  throws CFException{
		work.setMrsIsrtCount800(number);
	}


	public void setMrsIsrtCount800(long number)  throws CFException{
		work.setMrsIsrtCount800((int)number);
	}


	/**
	 *	Returns the value of tipamrsInsertFailure605
	 *	@return tipamrsInsertFailure605
	 */
   public char[] getTipamrsInsertFailure605() throws CFException  {              
   		return work.getTipamrsInsertFailure605();
   }

  
	/**
	*  set variable tipamrsInsertFailure605
	*  @param value
	**/
   public void setTipamrsInsertFailure605(char[] value) throws CFException {
      work.setTipamrsInsertFailure605(value);
   } 

	/**
	 *	Returns the value of ptrIp586010800
	 *	@return ptrIp586010800
	 */
   public char[] getPtrIp586010800() throws CFException  {              
   		return work.getPtrIp586010800();
   }

  
	/**
	*  set variable ptrIp586010800
	*  @param value
	**/
   public void setPtrIp586010800(char[] value) throws CFException {
      work.setPtrIp586010800(value);
   } 

	/**
	 *	Test condition "G" for isRowsFound88100()
	 *	@return  Returns true if isRowsFound88100() is "G"
	 */
   public boolean isRowsFound88100() throws CFException {
      return apiLayout.isRowsFound88100();
   }

	/**
	*  set values "G"
	*/
   	public void setRowsFound88100True()  throws CFException{  			
    	apiLayout.setRowsFound88100True();
   	}
	/**
	 *	Returns the value of tipmrsFailMsg300
	 *	@return tipmrsFailMsg300
	 */
   public char[] getTipmrsFailMsg300() throws CFException  {              
   		return work.getTipmrsFailMsg300();
   }

  
	/**
	*  set variable tipmrsFailMsg300
	*  @param value
	**/
   public void setTipmrsFailMsg300(char[] value) throws CFException {
      work.setTipmrsFailMsg300(value);
   } 


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public TipamrsInsertOutCtx getTipamrsInsertOutCtx() {
            return new TipamrsInsertOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip82921ErrMsgOut.hashCode();
        str += apiLayout.hashCode();
        str += abendPara900.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public TipamrsInsertInCtx clone() {
        TipamrsInsertInCtx cloneObj = new TipamrsInsertInCtx();
        cloneObj.ip82921ErrMsgOut = new Ip82921ErrMsgOut();
        cloneObj.ip82921ErrMsgOut.set(ip82921ErrMsgOut.getClonedField());
        cloneObj.apiLayout = new ApiLayout();
        cloneObj.apiLayout.set(apiLayout.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public TipamrsInsertInCtx getTipamrsInsertInCtx() {
            return new TipamrsInsertInCtx();
    }
     public class TipamrsInsertOutCtx implements Cloneable {
     Ip82921ErrMsgOut ip82921ErrMsgOut = Ip829010Ctx.this.getIp82921ErrMsgOut();
     ApiLayout apiLayout = Ip829010Ctx.this.getApiLayout();
     AbendPara900 abendPara900 = Ip829010Ctx.this.getAbendPara900();
     Work work = Ip829010Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip829010Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of insertMrsAbendCode300
	 *	@return insertMrsAbendCode300
	 */
   public char[] getInsertMrsAbendCode300() throws CFException  {              
   		return work.getInsertMrsAbendCode300();
   }

  
	/**
	*  set variable insertMrsAbendCode300
	*  @param value
	**/
   public void setInsertMrsAbendCode300(char[] value) throws CFException {
      work.setInsertMrsAbendCode300(value);
   } 

	/**
	 *	Returns the value of tipamrsSkipCount800
	 *	@return tipamrsSkipCount800
	 */
	public int getTipamrsSkipCount800() throws CFException {        
   		return work.getTipamrsSkipCount800();
	}
	
	/**
	 * 	Update TipamrsSkipCount800 with the passed value
	 *	@param number
	 */
	public void setTipamrsSkipCount800(int number)  throws CFException{
		work.setTipamrsSkipCount800(number);
	}


	public void setTipamrsSkipCount800(long number)  throws CFException{
		work.setTipamrsSkipCount800((int)number);
	}


	/**
	 *	Returns the value of paraName24301300
	 *	@return paraName24301300
	 */
   public char[] getParaName24301300() throws CFException  {              
   		return work.getParaName24301300();
   }

  
	/**
	*  set variable paraName24301300
	*  @param value
	**/
   public void setParaName24301300(char[] value) throws CFException {
      work.setParaName24301300(value);
   } 

	/**
	 *	Returns the value of value1300
	 *	@return value1300
	 */
	public short getValue1300() throws CFException {        
   		return work.getValue1300();
	}
	
	/**
	 * 	Update Value1300 with the passed value
	 *	@param number
	 */
	public void setValue1300(short number)  throws CFException{
		work.setValue1300(number);
	}

	public void setValue1300(int number)  throws CFException{
		work.setValue1300((short)number);
	}

	public void setValue1300(long number)  throws CFException{
		work.setValue1300((short)number);
	}



	/**
	 *	Returns the value of ip82921ErrMsg
	 *	@return ip82921ErrMsg
	 */
   public char[] getIp82921ErrMsg() throws CFException  {              
   		return ip82921ErrMsgOut.getIp82921ErrMsg();
   }

  
	/**
	*  set variable ip82921ErrMsg
	*  @param value
	**/
   public void setIp82921ErrMsg(char[] value) throws CFException {
      ip82921ErrMsgOut.setIp82921ErrMsg(value);
   } 

     /**
	 * 	Update Ip82921ErrMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921ErrMsg(char[] source, int sourceIndex) throws CFException {
      ip82921ErrMsgOut.setIp82921ErrMsg(source, sourceIndex);
   	
   }
   
   public void setIp82921ErrMsg(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip82921ErrMsgOut.setIp82921ErrMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip82921ErrMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ErrMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip82921ErrMsgOut.setIp82921ErrMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip82921ErrMsg with another Field
	 *	@param value
	 */
   public void setIp82921ErrMsg(Field source) {
      ip82921ErrMsgOut.setIp82921ErrMsg(source);
   }  
   
     /**
	 * 	Update Ip82921ErrMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921ErrMsg(Field source, int sourceIndex,int sourceLen) {
      ip82921ErrMsgOut.setIp82921ErrMsg(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip82921ErrMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ErrMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip82921ErrMsgOut.setIp82921ErrMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tipmrsDuplMsg300
	 *	@return tipmrsDuplMsg300
	 */
   public char[] getTipmrsDuplMsg300() throws CFException  {              
   		return work.getTipmrsDuplMsg300();
   }

  
	/**
	*  set variable tipmrsDuplMsg300
	*  @param value
	**/
   public void setTipmrsDuplMsg300(char[] value) throws CFException {
      work.setTipmrsDuplMsg300(value);
   } 

	/**
	 *	Test condition "N" for isItIsNotAbend88100()
	 *	@return  Returns true if isItIsNotAbend88100() is "N"
	 */
   public boolean isItIsNotAbend88100() throws CFException {
      return apiLayout.isItIsNotAbend88100();
   }

	/**
	*  set values "N"
	*/
   	public void setItIsNotAbend88100True()  throws CFException{  			
    	apiLayout.setItIsNotAbend88100True();
   	}
	/**
	 *	Returns the value of tipmrsFailMsg300
	 *	@return tipmrsFailMsg300
	 */
   public char[] getTipmrsFailMsg300() throws CFException  {              
   		return work.getTipmrsFailMsg300();
   }

  
	/**
	*  set variable tipmrsFailMsg300
	*  @param value
	**/
   public void setTipmrsFailMsg300(char[] value) throws CFException {
      work.setTipmrsFailMsg300(value);
   } 

	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return abendMessage900.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      abendMessage900.setAbendText900(value);
   } 

     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendText900(source, sourceIndex);
   	
   }
   
   public void setAbendText900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendText900 with another Field
	 *	@param value
	 */
   public void setAbendText900(Field source) {
      abendMessage900.setAbendText900(source);
   }  
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of queryNo
	 *	@return queryNo
	 */
	public short getQueryNo() throws CFException {        
   		return apiLayout.getQueryNo();
	}
	
	/**
	 * 	Update QueryNo with the passed value
	 *	@param number
	 */
	public void setQueryNo(short number)  throws CFException{
		apiLayout.setQueryNo(number);
	}

	public void setQueryNo(int number)  throws CFException{
		apiLayout.setQueryNo((short)number);
	}

	public void setQueryNo(long number)  throws CFException{
		apiLayout.setQueryNo((short)number);
	}



	/**
	 *	Test condition "I" for isInsertRtn88100()
	 *	@return  Returns true if isInsertRtn88100() is "I"
	 */
   public boolean isInsertRtn88100() throws CFException {
      return apiLayout.isInsertRtn88100();
   }

	/**
	*  set values "I"
	*/
   	public void setInsertRtn88100True()  throws CFException{  			
    	apiLayout.setInsertRtn88100True();
   	}
	/**
	 *	Returns the value of mrsIsrtCount800
	 *	@return mrsIsrtCount800
	 */
	public int getMrsIsrtCount800() throws CFException {        
   		return work.getMrsIsrtCount800();
	}
	
	/**
	 * 	Update MrsIsrtCount800 with the passed value
	 *	@param number
	 */
	public void setMrsIsrtCount800(int number)  throws CFException{
		work.setMrsIsrtCount800(number);
	}


	public void setMrsIsrtCount800(long number)  throws CFException{
		work.setMrsIsrtCount800((int)number);
	}


	/**
	 *	Returns the value of tipamrsInsertFailure605
	 *	@return tipamrsInsertFailure605
	 */
   public char[] getTipamrsInsertFailure605() throws CFException  {              
   		return work.getTipamrsInsertFailure605();
   }

  
	/**
	*  set variable tipamrsInsertFailure605
	*  @param value
	**/
   public void setTipamrsInsertFailure605(char[] value) throws CFException {
      work.setTipamrsInsertFailure605(value);
   } 

	/**
	 *	Returns the value of abendParaName900
	 *	@return abendParaName900
	 */
   public char[] getAbendParaName900() throws CFException  {              
   		return abendPara900.getAbendParaName900();
   }

  
	/**
	*  set variable abendParaName900
	*  @param value
	**/
   public void setAbendParaName900(char[] value) throws CFException {
      abendPara900.setAbendParaName900(value);
   } 

     /**
	 * 	Update AbendParaName900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendParaName900(char[] source, int sourceIndex) throws CFException {
      abendPara900.setAbendParaName900(source, sourceIndex);
   	
   }
   
   public void setAbendParaName900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendParaName900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendParaName900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendParaName900 with another Field
	 *	@param value
	 */
   public void setAbendParaName900(Field source) {
      abendPara900.setAbendParaName900(source);
   }  
   
     /**
	 * 	Update AbendParaName900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendParaName900(Field source, int sourceIndex,int sourceLen) {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendParaName900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendParaName900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip82921ErrMsgOut.hashCode();
        str += apiLayout.hashCode();
        str += abendPara900.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public TipamrsInsertOutCtx clone() {
        TipamrsInsertOutCtx cloneObj = new TipamrsInsertOutCtx();
        cloneObj.ip82921ErrMsgOut = new Ip82921ErrMsgOut();
        cloneObj.ip82921ErrMsgOut.set(ip82921ErrMsgOut.getClonedField());
        cloneObj.apiLayout = new ApiLayout();
        cloneObj.apiLayout.set(apiLayout.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public TipamrsInsertOutCtx getTipamrsInsertOutCtx() {
            return new TipamrsInsertOutCtx();
    }
     public class ValidateQueueDataInCtx implements Cloneable {
     Ip82921ErrMsgOut ip82921ErrMsgOut = Ip829010Ctx.this.getIp82921ErrMsgOut();
     FnsPldRd fnsPldRd = Ip829010Ctx.this.getFnsPldRd();
     Work work = Ip829010Ctx.this.getWork();

	/**
	 *	Returns the value of panInvalidMsg300
	 *	@return panInvalidMsg300
	 */
   public char[] getPanInvalidMsg300() throws CFException  {              
   		return work.getPanInvalidMsg300();
   }

  
	/**
	*  set variable panInvalidMsg300
	*  @param value
	**/
   public void setPanInvalidMsg300(char[] value) throws CFException {
      work.setPanInvalidMsg300(value);
   } 

	/**
	 *	Returns the value of fnsPldRdPrimaryAcctNbr
	 *	@return fnsPldRdPrimaryAcctNbr
	 */
   public char[] getFnsPldRdPrimaryAcctNbr() throws CFException  {              
   		return fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().getFnsPldRdPrimaryAcctNbr();
   }

  
	/**
	*  set variable fnsPldRdPrimaryAcctNbr
	*  @param value
	**/
   public void setFnsPldRdPrimaryAcctNbr(char[] value) throws CFException {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(value);
   } 

     /**
	 * 	Update FnsPldRdPrimaryAcctNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(char[] source, int sourceIndex) throws CFException {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source, sourceIndex);
   	
   }
   
   public void setFnsPldRdPrimaryAcctNbr(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPldRdPrimaryAcctNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPldRdPrimaryAcctNbr with another Field
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(Field source) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source);
   }  
   
     /**
	 * 	Update FnsPldRdPrimaryAcctNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(Field source, int sourceIndex,int sourceLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FnsPldRdPrimaryAcctNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of expInvalidMsg300
	 *	@return expInvalidMsg300
	 */
   public char[] getExpInvalidMsg300() throws CFException  {              
   		return work.getExpInvalidMsg300();
   }

  
	/**
	*  set variable expInvalidMsg300
	*  @param value
	**/
   public void setExpInvalidMsg300(char[] value) throws CFException {
      work.setExpInvalidMsg300(value);
   } 

public int getFnsPldRdTxnNum() throws CFException {  
        return fnsPldRd.getFnsPldRdTxnNum();
}
	/**
	 * 	Update FnsPldRdTxnNum with the passed value
	 *	@param number
	 */
	public void setFnsPldRdTxnNum(int number)  throws CFException{
		fnsPldRd.setFnsPldRdTxnNum(number);
	}


	public void setFnsPldRdTxnNum(long number)  throws CFException{
	    fnsPldRd.setFnsPldRdTxnNum(number);
	}
	

	/**
	 *	Returns the value of txnInvalidMsg300
	 *	@return txnInvalidMsg300
	 */
   public char[] getTxnInvalidMsg300() throws CFException  {              
   		return work.getTxnInvalidMsg300();
   }

  
	/**
	*  set variable txnInvalidMsg300
	*  @param value
	**/
   public void setTxnInvalidMsg300(char[] value) throws CFException {
      work.setTxnInvalidMsg300(value);
   } 

	/**
	 *	Returns the value of vanInvalidMsg300
	 *	@return vanInvalidMsg300
	 */
   public char[] getVanInvalidMsg300() throws CFException  {              
   		return work.getVanInvalidMsg300();
   }

  
	/**
	*  set variable vanInvalidMsg300
	*  @param value
	**/
   public void setVanInvalidMsg300(char[] value) throws CFException {
      work.setVanInvalidMsg300(value);
   } 

	/**
	 *	Returns the value of gftInvalidMsg300
	 *	@return gftInvalidMsg300
	 */
   public char[] getGftInvalidMsg300() throws CFException  {              
   		return work.getGftInvalidMsg300();
   }

  
	/**
	*  set variable gftInvalidMsg300
	*  @param value
	**/
   public void setGftInvalidMsg300(char[] value) throws CFException {
      work.setGftInvalidMsg300(value);
   } 

	/**
	 *	Returns the value of fnsPldRdExpirationDate
	 *	@return fnsPldRdExpirationDate
	 */   
	 public FnsPldRdExpirationDate getFnsPldRdExpirationDate() {
   	return fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().getFnsPldRdExpirationDate();
   }

   /**
	* 	Update FnsPldRdExpirationDate with the passed value
	*	@param value
	*/
   public void setFnsPldRdExpirationDate(char[] value) throws CFException {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(value);
   }   

     /**
	 * 	Update FnsPldRdExpirationDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPldRdExpirationDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPldRdExpirationDate with another Field
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(Field source) {
   	fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(source);
   }  
   
     /**
	 * 	Update FnsPldRdExpirationDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(Field source, int sourceIndex,int sourceLen) {
   	fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPldRdExpirationDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fnsPldRdGftDsn
	 *	@return fnsPldRdGftDsn
	 */
   public char[] getFnsPldRdGftDsn() throws CFException  {              
   		return fnsPldRd.getFnsPldRdGftDsn();
   }

  
	/**
	*  set variable fnsPldRdGftDsn
	*  @param value
	**/
   public void setFnsPldRdGftDsn(char[] value) throws CFException {
      fnsPldRd.setFnsPldRdGftDsn(value);
   } 

     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(char[] source, int sourceIndex) throws CFException {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex);
   	
   }
   
   public void setFnsPldRdGftDsn(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPldRdGftDsn with another Field
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(Field source) {
      fnsPldRd.setFnsPldRdGftDsn(source);
   }  
   
     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(Field source, int sourceIndex,int sourceLen) {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fnsPldRd
	 *	@return fnsPldRd
	 */   
	 public FnsPldRd getFnsPldRd() {
   	return fnsPldRd;
   }


	/**
	 *	Returns the value of fnsPldRdVrtlAcctNum
	 *	@return fnsPldRdVrtlAcctNum
	 */
   public char[] getFnsPldRdVrtlAcctNum() throws CFException  {              
   		return fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().getFnsPldRdVrtlAcctNum();
   }

  
	/**
	*  set variable fnsPldRdVrtlAcctNum
	*  @param value
	**/
   public void setFnsPldRdVrtlAcctNum(char[] value) throws CFException {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(value);
   } 

     /**
	 * 	Update FnsPldRdVrtlAcctNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(char[] source, int sourceIndex) throws CFException {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source, sourceIndex);
   	
   }
   
   public void setFnsPldRdVrtlAcctNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPldRdVrtlAcctNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPldRdVrtlAcctNum with another Field
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(Field source) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source);
   }  
   
     /**
	 * 	Update FnsPldRdVrtlAcctNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(Field source, int sourceIndex,int sourceLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FnsPldRdVrtlAcctNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public ValidateQueueDataOutCtx getValidateQueueDataOutCtx() {
            return new ValidateQueueDataOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip82921ErrMsgOut.hashCode();
        str += fnsPldRd.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ValidateQueueDataInCtx clone() {
        ValidateQueueDataInCtx cloneObj = new ValidateQueueDataInCtx();
        cloneObj.ip82921ErrMsgOut = new Ip82921ErrMsgOut();
        cloneObj.ip82921ErrMsgOut.set(ip82921ErrMsgOut.getClonedField());
        cloneObj.fnsPldRd = new FnsPldRd();
        cloneObj.fnsPldRd.set(fnsPldRd.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ValidateQueueDataInCtx getValidateQueueDataInCtx() {
            return new ValidateQueueDataInCtx();
    }
     public class ValidateQueueDataOutCtx implements Cloneable {
     Ip82921ErrMsgOut ip82921ErrMsgOut = Ip829010Ctx.this.getIp82921ErrMsgOut();
     FnsPldRd fnsPldRd = Ip829010Ctx.this.getFnsPldRd();
     Work work = Ip829010Ctx.this.getWork();

	/**
	 *	Returns the value of panInvalidMsg300
	 *	@return panInvalidMsg300
	 */
   public char[] getPanInvalidMsg300() throws CFException  {              
   		return work.getPanInvalidMsg300();
   }

  
	/**
	*  set variable panInvalidMsg300
	*  @param value
	**/
   public void setPanInvalidMsg300(char[] value) throws CFException {
      work.setPanInvalidMsg300(value);
   } 

	/**
	 *	Returns the value of ip82921ErrMsgOut
	 *	@return ip82921ErrMsgOut
	 */   
	 public Ip82921ErrMsgOut getIp82921ErrMsgOut() {
   	return ip82921ErrMsgOut;
   }


	/**
	 *	Returns the value of expInvalidMsg300
	 *	@return expInvalidMsg300
	 */
   public char[] getExpInvalidMsg300() throws CFException  {              
   		return work.getExpInvalidMsg300();
   }

  
	/**
	*  set variable expInvalidMsg300
	*  @param value
	**/
   public void setExpInvalidMsg300(char[] value) throws CFException {
      work.setExpInvalidMsg300(value);
   } 

	/**
	 *	Returns the value of txnInvalidMsg300
	 *	@return txnInvalidMsg300
	 */
   public char[] getTxnInvalidMsg300() throws CFException  {              
   		return work.getTxnInvalidMsg300();
   }

  
	/**
	*  set variable txnInvalidMsg300
	*  @param value
	**/
   public void setTxnInvalidMsg300(char[] value) throws CFException {
      work.setTxnInvalidMsg300(value);
   } 

	/**
	 *	Returns the value of vanInvalidMsg300
	 *	@return vanInvalidMsg300
	 */
   public char[] getVanInvalidMsg300() throws CFException  {              
   		return work.getVanInvalidMsg300();
   }

  
	/**
	*  set variable vanInvalidMsg300
	*  @param value
	**/
   public void setVanInvalidMsg300(char[] value) throws CFException {
      work.setVanInvalidMsg300(value);
   } 

	/**
	 *	Returns the value of gftInvalidMsg300
	 *	@return gftInvalidMsg300
	 */
   public char[] getGftInvalidMsg300() throws CFException  {              
   		return work.getGftInvalidMsg300();
   }

  
	/**
	*  set variable gftInvalidMsg300
	*  @param value
	**/
   public void setGftInvalidMsg300(char[] value) throws CFException {
      work.setGftInvalidMsg300(value);
   } 

	/**
	 *	Test condition "Y" for isSkipFlagY88800()
	 *	@return  Returns true if isSkipFlagY88800() is "Y"
	 */
   public boolean isSkipFlagY88800() throws CFException {
      return work.isSkipFlagY88800();
   }

	/**
	*  set values "Y"
	*/
   	public void setSkipFlagY88800True()  throws CFException{  			
    	work.setSkipFlagY88800True();
   	}
	/**
	 *	Returns the value of ip82921ErrMsg
	 *	@return ip82921ErrMsg
	 */
   public char[] getIp82921ErrMsg() throws CFException  {              
   		return ip82921ErrMsgOut.getIp82921ErrMsg();
   }

  
	/**
	*  set variable ip82921ErrMsg
	*  @param value
	**/
   public void setIp82921ErrMsg(char[] value) throws CFException {
      ip82921ErrMsgOut.setIp82921ErrMsg(value);
   } 

     /**
	 * 	Update Ip82921ErrMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921ErrMsg(char[] source, int sourceIndex) throws CFException {
      ip82921ErrMsgOut.setIp82921ErrMsg(source, sourceIndex);
   	
   }
   
   public void setIp82921ErrMsg(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip82921ErrMsgOut.setIp82921ErrMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip82921ErrMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ErrMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip82921ErrMsgOut.setIp82921ErrMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip82921ErrMsg with another Field
	 *	@param value
	 */
   public void setIp82921ErrMsg(Field source) {
      ip82921ErrMsgOut.setIp82921ErrMsg(source);
   }  
   
     /**
	 * 	Update Ip82921ErrMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921ErrMsg(Field source, int sourceIndex,int sourceLen) {
      ip82921ErrMsgOut.setIp82921ErrMsg(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip82921ErrMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ErrMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip82921ErrMsgOut.setIp82921ErrMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "N" for isSkipFlagN88800()
	 *	@return  Returns true if isSkipFlagN88800() is "N"
	 */
   public boolean isSkipFlagN88800() throws CFException {
      return work.isSkipFlagN88800();
   }

	/**
	*  set values "N"
	*/
   	public void setSkipFlagN88800True()  throws CFException{  			
    	work.setSkipFlagN88800True();
   	}

        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip82921ErrMsgOut.hashCode();
        str += fnsPldRd.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ValidateQueueDataOutCtx clone() {
        ValidateQueueDataOutCtx cloneObj = new ValidateQueueDataOutCtx();
        cloneObj.ip82921ErrMsgOut = new Ip82921ErrMsgOut();
        cloneObj.ip82921ErrMsgOut.set(ip82921ErrMsgOut.getClonedField());
        cloneObj.fnsPldRd = new FnsPldRd();
        cloneObj.fnsPldRd.set(fnsPldRd.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ValidateQueueDataOutCtx getValidateQueueDataOutCtx() {
            return new ValidateQueueDataOutCtx();
    }
     public class IndiaFraudTableLookupInCtx implements Cloneable {
     Ip82921ErrMsgOut ip82921ErrMsgOut = Ip829010Ctx.this.getIp82921ErrMsgOut();
     ApiLayout apiLayout = Ip829010Ctx.this.getApiLayout();
     FnsPayload fnsPayload = Ip829010Ctx.this.getFnsPayload();
     FnsPldRd fnsPldRd = Ip829010Ctx.this.getFnsPldRd();
     Work work = Ip829010Ctx.this.getWork();
     Ip50201Tipafaa ip50201Tipafaa = Ip829010Ctx.this.getIp50201Tipafaa();

public int getFnsPldRdTxnNum() throws CFException {  
        return fnsPldRd.getFnsPldRdTxnNum();
}
	/**
	 * 	Update FnsPldRdTxnNum with the passed value
	 *	@param number
	 */
	public void setFnsPldRdTxnNum(int number)  throws CFException{
		fnsPldRd.setFnsPldRdTxnNum(number);
	}


	public void setFnsPldRdTxnNum(long number)  throws CFException{
	    fnsPldRd.setFnsPldRdTxnNum(number);
	}
	

	/**
	 *	Returns the value of fnsPldRdLogicalSeq
	 *	@return fnsPldRdLogicalSeq
	 */
	public int getFnsPldRdLogicalSeq() throws CFException {        
   		return fnsPldRd.getFnsPldRdLogicalSeq();
	}
	
	/**
	 * 	Update FnsPldRdLogicalSeq with the passed value
	 *	@param number
	 */
	public void setFnsPldRdLogicalSeq(int number)  throws CFException{
		fnsPldRd.setFnsPldRdLogicalSeq(number);
	}


	public void setFnsPldRdLogicalSeq(long number)  throws CFException{
		fnsPldRd.setFnsPldRdLogicalSeq((int)number);
	}


	/**
	 *	Returns the value of fnsPldRdExpirationDate
	 *	@return fnsPldRdExpirationDate
	 */   
	 public FnsPldRdExpirationDate getFnsPldRdExpirationDate() {
   	return fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().getFnsPldRdExpirationDate();
   }

   /**
	* 	Update FnsPldRdExpirationDate with the passed value
	*	@param value
	*/
   public void setFnsPldRdExpirationDate(char[] value) throws CFException {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(value);
   }   

     /**
	 * 	Update FnsPldRdExpirationDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPldRdExpirationDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPldRdExpirationDate with another Field
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(Field source) {
   	fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(source);
   }  
   
     /**
	 * 	Update FnsPldRdExpirationDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(Field source, int sourceIndex,int sourceLen) {
   	fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPldRdExpirationDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fnsPldRdGftDsn
	 *	@return fnsPldRdGftDsn
	 */
   public char[] getFnsPldRdGftDsn() throws CFException  {              
   		return fnsPldRd.getFnsPldRdGftDsn();
   }

  
	/**
	*  set variable fnsPldRdGftDsn
	*  @param value
	**/
   public void setFnsPldRdGftDsn(char[] value) throws CFException {
      fnsPldRd.setFnsPldRdGftDsn(value);
   } 

     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(char[] source, int sourceIndex) throws CFException {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex);
   	
   }
   
   public void setFnsPldRdGftDsn(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPldRdGftDsn with another Field
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(Field source) {
      fnsPldRd.setFnsPldRdGftDsn(source);
   }  
   
     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(Field source, int sourceIndex,int sourceLen) {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of valueClosed300
	 *	@return valueClosed300
	 */
   public char[] getValueClosed300() throws CFException  {              
   		return work.getValueClosed300();
   }

  
	/**
	*  set variable valueClosed300
	*  @param value
	**/
   public void setValueClosed300(char[] value) throws CFException {
      work.setValueClosed300(value);
   } 

	/**
	 *	Returns the value of ip50201AccntStatus
	 *	@return ip50201AccntStatus
	 */
   public char[] getIp50201AccntStatus() throws CFException  {              
   		return ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().getIp50201AccntStatus();
   }

  
	/**
	*  set variable ip50201AccntStatus
	*  @param value
	**/
   public void setIp50201AccntStatus(char[] value) throws CFException {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201AccntStatus(value);
   } 

     /**
	 * 	Update Ip50201AccntStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50201AccntStatus(char[] source, int sourceIndex) throws CFException {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201AccntStatus(source, sourceIndex);
   	
   }
   
   public void setIp50201AccntStatus(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201AccntStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50201AccntStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50201AccntStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201AccntStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50201AccntStatus with another Field
	 *	@param value
	 */
   public void setIp50201AccntStatus(Field source) {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201AccntStatus(source);
   }  
   
     /**
	 * 	Update Ip50201AccntStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50201AccntStatus(Field source, int sourceIndex,int sourceLen) {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201AccntStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip50201AccntStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50201AccntStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201AccntStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip50201ExpirationDate
	 *	@return ip50201ExpirationDate
	 */   
	 public Ip50201ExpirationDate getIp50201ExpirationDate() {
   	return ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().getIp50201ExpirationDate();
   }

   /**
	* 	Update Ip50201ExpirationDate with the passed value
	*	@param value
	*/
   public void setIp50201ExpirationDate(char[] value) throws CFException {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201ExpirationDate(value);
   }   

     /**
	 * 	Update Ip50201ExpirationDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50201ExpirationDate(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201ExpirationDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50201ExpirationDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50201ExpirationDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201ExpirationDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50201ExpirationDate with another Field
	 *	@param value
	 */
   public void setIp50201ExpirationDate(Field source) {
   	ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201ExpirationDate(source);
   }  
   
     /**
	 * 	Update Ip50201ExpirationDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50201ExpirationDate(Field source, int sourceIndex,int sourceLen) {
   	ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201ExpirationDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50201ExpirationDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50201ExpirationDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201ExpirationDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of facNotFoundMsg300
	 *	@return facNotFoundMsg300
	 */
   public char[] getFacNotFoundMsg300() throws CFException  {              
   		return work.getFacNotFoundMsg300();
   }

  
	/**
	*  set variable facNotFoundMsg300
	*  @param value
	**/
   public void setFacNotFoundMsg300(char[] value) throws CFException {
      work.setFacNotFoundMsg300(value);
   } 

	/**
	 *	Returns the value of fnsPldRdPrimaryAcctNbr
	 *	@return fnsPldRdPrimaryAcctNbr
	 */
   public char[] getFnsPldRdPrimaryAcctNbr() throws CFException  {              
   		return fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().getFnsPldRdPrimaryAcctNbr();
   }

  
	/**
	*  set variable fnsPldRdPrimaryAcctNbr
	*  @param value
	**/
   public void setFnsPldRdPrimaryAcctNbr(char[] value) throws CFException {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(value);
   } 

     /**
	 * 	Update FnsPldRdPrimaryAcctNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(char[] source, int sourceIndex) throws CFException {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source, sourceIndex);
   	
   }
   
   public void setFnsPldRdPrimaryAcctNbr(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPldRdPrimaryAcctNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPldRdPrimaryAcctNbr with another Field
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(Field source) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source);
   }  
   
     /**
	 * 	Update FnsPldRdPrimaryAcctNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(Field source, int sourceIndex,int sourceLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FnsPldRdPrimaryAcctNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of noOfRows
	 *	@return noOfRows
	 */
	public long getNoOfRows() throws CFException {
   		return apiLayout.getNoOfRows();
	}


	/**
	 *	Returns String value of noOfRows
	 *	@return noOfRows
	 */
	public char[]  getNoOfRowsString() throws CFException {
	     return String.valueOf(apiLayout.getNoOfRowsString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean noOfRowsIsNumeric()  throws CFException{
	    return apiLayout.noOfRowsIsNumeric();
	}

	/**
	 * 	Update NoOfRows with the passed value
	 *	@param number
	 */
	public void setNoOfRows(long number)  throws CFException{
		apiLayout.setNoOfRows(number);
	}
	

	
	/**
	 * 	Update NoOfRows with the passed value
	 *	@param value (String or char[])
	 */
	public void setNoOfRows(char[] value)  throws CFException {
		apiLayout.setNoOfRows(value);
	}
	
	/**
	 * 	Update NoOfRows with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNoOfRowsString(char[] value)  throws CFException{
		apiLayout.setNoOfRows(value);
	}	

	/**
	 *	Returns the value of ptrIp521010800
	 *	@return ptrIp521010800
	 */
   public char[] getPtrIp521010800() throws CFException  {              
   		return work.getPtrIp521010800();
   }

  
	/**
	*  set variable ptrIp521010800
	*  @param value
	**/
   public void setPtrIp521010800(char[] value) throws CFException {
      work.setPtrIp521010800(value);
   } 

	/**
	 *	Returns the value of fnsPldRdQueryNo
	 *	@return fnsPldRdQueryNo
	 */
	public short getFnsPldRdQueryNo() throws CFException {        
   		return fnsPldRd.getFnsPldRdQueryNo();
	}
	
	/**
	 * 	Update FnsPldRdQueryNo with the passed value
	 *	@param number
	 */
	public void setFnsPldRdQueryNo(short number)  throws CFException{
		fnsPldRd.setFnsPldRdQueryNo(number);
	}

	public void setFnsPldRdQueryNo(int number)  throws CFException{
		fnsPldRd.setFnsPldRdQueryNo((short)number);
	}

	public void setFnsPldRdQueryNo(long number)  throws CFException{
		fnsPldRd.setFnsPldRdQueryNo((short)number);
	}



	/**
	 *	Returns the value of fnsPayloadExpirationDate
	 *	@return fnsPayloadExpirationDate
	 */   
	 public FnsPayloadExpirationDate getFnsPayloadExpirationDate() {
   	return fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacDataKey().getFnsPayloadExpirationDate();
   }

   /**
	* 	Update FnsPayloadExpirationDate with the passed value
	*	@param value
	*/
   public void setFnsPayloadExpirationDate(char[] value) throws CFException {
      fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacDataKey().setFnsPayloadExpirationDate(value);
   }   

     /**
	 * 	Update FnsPayloadExpirationDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadExpirationDate(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacDataKey().setFnsPayloadExpirationDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPayloadExpirationDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadExpirationDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacDataKey().setFnsPayloadExpirationDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPayloadExpirationDate with another Field
	 *	@param value
	 */
   public void setFnsPayloadExpirationDate(Field source) {
   	fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacDataKey().setFnsPayloadExpirationDate(source);
   }  
   
     /**
	 * 	Update FnsPayloadExpirationDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadExpirationDate(Field source, int sourceIndex,int sourceLen) {
   	fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacDataKey().setFnsPayloadExpirationDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPayloadExpirationDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadExpirationDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacDataKey().setFnsPayloadExpirationDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of faaFacNotFndCnt800
	 *	@return faaFacNotFndCnt800
	 */
	public int getFaaFacNotFndCnt800() throws CFException {        
   		return work.getFaaFacNotFndCnt800();
	}
	
	/**
	 * 	Update FaaFacNotFndCnt800 with the passed value
	 *	@param number
	 */
	public void setFaaFacNotFndCnt800(int number)  throws CFException{
		work.setFaaFacNotFndCnt800(number);
	}


	public void setFaaFacNotFndCnt800(long number)  throws CFException{
		work.setFaaFacNotFndCnt800((int)number);
	}


	/**
	 *	Returns the value of ip50201ClosedDate
	 *	@return ip50201ClosedDate
	 */   
	 public Ip50201ClosedDate getIp50201ClosedDate() {
   	return ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().getIp50201ClosedDate();
   }

   /**
	* 	Update Ip50201ClosedDate with the passed value
	*	@param value
	*/
   public void setIp50201ClosedDate(char[] value) throws CFException {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201ClosedDate(value);
   }   

     /**
	 * 	Update Ip50201ClosedDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50201ClosedDate(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201ClosedDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50201ClosedDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50201ClosedDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201ClosedDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50201ClosedDate with another Field
	 *	@param value
	 */
   public void setIp50201ClosedDate(Field source) {
   	ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201ClosedDate(source);
   }  
   
     /**
	 * 	Update Ip50201ClosedDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50201ClosedDate(Field source, int sourceIndex,int sourceLen) {
   	ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201ClosedDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50201ClosedDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50201ClosedDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201ClosedDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fnsPldRdVrtlAcctNum
	 *	@return fnsPldRdVrtlAcctNum
	 */
   public char[] getFnsPldRdVrtlAcctNum() throws CFException  {              
   		return fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().getFnsPldRdVrtlAcctNum();
   }

  
	/**
	*  set variable fnsPldRdVrtlAcctNum
	*  @param value
	**/
   public void setFnsPldRdVrtlAcctNum(char[] value) throws CFException {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(value);
   } 

     /**
	 * 	Update FnsPldRdVrtlAcctNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(char[] source, int sourceIndex) throws CFException {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source, sourceIndex);
   	
   }
   
   public void setFnsPldRdVrtlAcctNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPldRdVrtlAcctNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPldRdVrtlAcctNum with another Field
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(Field source) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source);
   }  
   
     /**
	 * 	Update FnsPldRdVrtlAcctNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(Field source, int sourceIndex,int sourceLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FnsPldRdVrtlAcctNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public IndiaFraudTableLookupOutCtx getIndiaFraudTableLookupOutCtx() {
            return new IndiaFraudTableLookupOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip82921ErrMsgOut.hashCode();
        str += apiLayout.hashCode();
        str += fnsPayload.hashCode();
        str += fnsPldRd.hashCode();
        str += work.hashCode();
        str += ip50201Tipafaa.hashCode();
       return str.hashCode();
    }

    public IndiaFraudTableLookupInCtx clone() {
        IndiaFraudTableLookupInCtx cloneObj = new IndiaFraudTableLookupInCtx();
        cloneObj.ip82921ErrMsgOut = new Ip82921ErrMsgOut();
        cloneObj.ip82921ErrMsgOut.set(ip82921ErrMsgOut.getClonedField());
        cloneObj.apiLayout = new ApiLayout();
        cloneObj.apiLayout.set(apiLayout.getClonedField());
        cloneObj.fnsPayload = new FnsPayload();
        cloneObj.fnsPayload.set(fnsPayload.getClonedField());
        cloneObj.fnsPldRd = new FnsPldRd();
        cloneObj.fnsPldRd.set(fnsPldRd.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50201Tipafaa = new Ip50201Tipafaa();
        cloneObj.ip50201Tipafaa.set(ip50201Tipafaa.getClonedField());
        return cloneObj;
    }

    }

    public IndiaFraudTableLookupInCtx getIndiaFraudTableLookupInCtx() {
            return new IndiaFraudTableLookupInCtx();
    }
     public class IndiaFraudTableLookupOutCtx implements Cloneable {
     Ip82921ErrMsgOut ip82921ErrMsgOut = Ip829010Ctx.this.getIp82921ErrMsgOut();
     ApiLayout apiLayout = Ip829010Ctx.this.getApiLayout();
     FnsPayload fnsPayload = Ip829010Ctx.this.getFnsPayload();
     FnsPldRd fnsPldRd = Ip829010Ctx.this.getFnsPldRd();
     Work work = Ip829010Ctx.this.getWork();
     Ip50201Tipafaa ip50201Tipafaa = Ip829010Ctx.this.getIp50201Tipafaa();

public int getFnsPldRdTxnNum() throws CFException {  
        return fnsPldRd.getFnsPldRdTxnNum();
}
	/**
	 * 	Update FnsPldRdTxnNum with the passed value
	 *	@param number
	 */
	public void setFnsPldRdTxnNum(int number)  throws CFException{
		fnsPldRd.setFnsPldRdTxnNum(number);
	}


	public void setFnsPldRdTxnNum(long number)  throws CFException{
	    fnsPldRd.setFnsPldRdTxnNum(number);
	}
	

	/**
	 *	Returns the value of ip82921ErrMsg
	 *	@return ip82921ErrMsg
	 */
   public char[] getIp82921ErrMsg() throws CFException  {              
   		return ip82921ErrMsgOut.getIp82921ErrMsg();
   }

  
	/**
	*  set variable ip82921ErrMsg
	*  @param value
	**/
   public void setIp82921ErrMsg(char[] value) throws CFException {
      ip82921ErrMsgOut.setIp82921ErrMsg(value);
   } 

     /**
	 * 	Update Ip82921ErrMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921ErrMsg(char[] source, int sourceIndex) throws CFException {
      ip82921ErrMsgOut.setIp82921ErrMsg(source, sourceIndex);
   	
   }
   
   public void setIp82921ErrMsg(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip82921ErrMsgOut.setIp82921ErrMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip82921ErrMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ErrMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip82921ErrMsgOut.setIp82921ErrMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip82921ErrMsg with another Field
	 *	@param value
	 */
   public void setIp82921ErrMsg(Field source) {
      ip82921ErrMsgOut.setIp82921ErrMsg(source);
   }  
   
     /**
	 * 	Update Ip82921ErrMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921ErrMsg(Field source, int sourceIndex,int sourceLen) {
      ip82921ErrMsgOut.setIp82921ErrMsg(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip82921ErrMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ErrMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip82921ErrMsgOut.setIp82921ErrMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fnsPayloadPrimaryAcctNbr
	 *	@return fnsPayloadPrimaryAcctNbr
	 */
   public char[] getFnsPayloadPrimaryAcctNbr() throws CFException  {              
   		return fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacDataKey().getFnsPayloadPrimaryAcctNbr();
   }

  
	/**
	*  set variable fnsPayloadPrimaryAcctNbr
	*  @param value
	**/
   public void setFnsPayloadPrimaryAcctNbr(char[] value) throws CFException {
      fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacDataKey().setFnsPayloadPrimaryAcctNbr(value);
   } 

     /**
	 * 	Update FnsPayloadPrimaryAcctNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadPrimaryAcctNbr(char[] source, int sourceIndex) throws CFException {
      fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacDataKey().setFnsPayloadPrimaryAcctNbr(source, sourceIndex);
   	
   }
   
   public void setFnsPayloadPrimaryAcctNbr(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacDataKey().setFnsPayloadPrimaryAcctNbr(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPayloadPrimaryAcctNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadPrimaryAcctNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacDataKey().setFnsPayloadPrimaryAcctNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPayloadPrimaryAcctNbr with another Field
	 *	@param value
	 */
   public void setFnsPayloadPrimaryAcctNbr(Field source) {
      fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacDataKey().setFnsPayloadPrimaryAcctNbr(source);
   }  
   
     /**
	 * 	Update FnsPayloadPrimaryAcctNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadPrimaryAcctNbr(Field source, int sourceIndex,int sourceLen) {
      fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacDataKey().setFnsPayloadPrimaryAcctNbr(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FnsPayloadPrimaryAcctNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadPrimaryAcctNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacDataKey().setFnsPayloadPrimaryAcctNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getFnsPayloadTxnNum() throws CFException {  
        return fnsPayload.getFnsPayloadTxnNum();
}
	/**
	 * 	Update FnsPayloadTxnNum with the passed value
	 *	@param number
	 */
	public void setFnsPayloadTxnNum(int number)  throws CFException{
		fnsPayload.setFnsPayloadTxnNum(number);
	}


	public void setFnsPayloadTxnNum(long number)  throws CFException{
	    fnsPayload.setFnsPayloadTxnNum(number);
	}
	

	/**
	 *	Returns the value of fnsPayloadQueryNo
	 *	@return fnsPayloadQueryNo
	 */
	public short getFnsPayloadQueryNo() throws CFException {        
   		return fnsPayload.getFnsPayloadQueryNo();
	}
	
	/**
	 * 	Update FnsPayloadQueryNo with the passed value
	 *	@param number
	 */
	public void setFnsPayloadQueryNo(short number)  throws CFException{
		fnsPayload.setFnsPayloadQueryNo(number);
	}

	public void setFnsPayloadQueryNo(int number)  throws CFException{
		fnsPayload.setFnsPayloadQueryNo((short)number);
	}

	public void setFnsPayloadQueryNo(long number)  throws CFException{
		fnsPayload.setFnsPayloadQueryNo((short)number);
	}



	/**
	 *	Returns the value of fnsPldRdGftDsn
	 *	@return fnsPldRdGftDsn
	 */
   public char[] getFnsPldRdGftDsn() throws CFException  {              
   		return fnsPldRd.getFnsPldRdGftDsn();
   }

  
	/**
	*  set variable fnsPldRdGftDsn
	*  @param value
	**/
   public void setFnsPldRdGftDsn(char[] value) throws CFException {
      fnsPldRd.setFnsPldRdGftDsn(value);
   } 

     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(char[] source, int sourceIndex) throws CFException {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex);
   	
   }
   
   public void setFnsPldRdGftDsn(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPldRdGftDsn with another Field
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(Field source) {
      fnsPldRd.setFnsPldRdGftDsn(source);
   }  
   
     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(Field source, int sourceIndex,int sourceLen) {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip50201ExpirationDate
	 *	@return ip50201ExpirationDate
	 */   
	 public Ip50201ExpirationDate getIp50201ExpirationDate() {
   	return ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().getIp50201ExpirationDate();
   }

   /**
	* 	Update Ip50201ExpirationDate with the passed value
	*	@param value
	*/
   public void setIp50201ExpirationDate(char[] value) throws CFException {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201ExpirationDate(value);
   }   

     /**
	 * 	Update Ip50201ExpirationDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50201ExpirationDate(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201ExpirationDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50201ExpirationDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50201ExpirationDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201ExpirationDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50201ExpirationDate with another Field
	 *	@param value
	 */
   public void setIp50201ExpirationDate(Field source) {
   	ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201ExpirationDate(source);
   }  
   
     /**
	 * 	Update Ip50201ExpirationDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50201ExpirationDate(Field source, int sourceIndex,int sourceLen) {
   	ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201ExpirationDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50201ExpirationDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50201ExpirationDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201ExpirationDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fnsPldRdPrimaryAcctNbr
	 *	@return fnsPldRdPrimaryAcctNbr
	 */
   public char[] getFnsPldRdPrimaryAcctNbr() throws CFException  {              
   		return fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().getFnsPldRdPrimaryAcctNbr();
   }

  
	/**
	*  set variable fnsPldRdPrimaryAcctNbr
	*  @param value
	**/
   public void setFnsPldRdPrimaryAcctNbr(char[] value) throws CFException {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(value);
   } 

     /**
	 * 	Update FnsPldRdPrimaryAcctNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(char[] source, int sourceIndex) throws CFException {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source, sourceIndex);
   	
   }
   
   public void setFnsPldRdPrimaryAcctNbr(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPldRdPrimaryAcctNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPldRdPrimaryAcctNbr with another Field
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(Field source) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source);
   }  
   
     /**
	 * 	Update FnsPldRdPrimaryAcctNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(Field source, int sourceIndex,int sourceLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FnsPldRdPrimaryAcctNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of noOfRows
	 *	@return noOfRows
	 */
	public long getNoOfRows() throws CFException {
   		return apiLayout.getNoOfRows();
	}


	/**
	 *	Returns String value of noOfRows
	 *	@return noOfRows
	 */
	public char[]  getNoOfRowsString() throws CFException {
	     return String.valueOf(apiLayout.getNoOfRowsString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean noOfRowsIsNumeric()  throws CFException{
	    return apiLayout.noOfRowsIsNumeric();
	}

	/**
	 * 	Update NoOfRows with the passed value
	 *	@param number
	 */
	public void setNoOfRows(long number)  throws CFException{
		apiLayout.setNoOfRows(number);
	}
	

	
	/**
	 * 	Update NoOfRows with the passed value
	 *	@param value (String or char[])
	 */
	public void setNoOfRows(char[] value)  throws CFException {
		apiLayout.setNoOfRows(value);
	}
	
	/**
	 * 	Update NoOfRows with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNoOfRowsString(char[] value)  throws CFException{
		apiLayout.setNoOfRows(value);
	}	

	/**
	 *	Returns the value of fnsPayloadFaaPanStatCd
	 *	@return fnsPayloadFaaPanStatCd
	 */
   public char[] getFnsPayloadFaaPanStatCd() throws CFException  {              
   		return fnsPayload.getFnsPayloadFaaPanStatCd();
   }

  
	/**
	*  set variable fnsPayloadFaaPanStatCd
	*  @param value
	**/
   public void setFnsPayloadFaaPanStatCd(char[] value) throws CFException {
      fnsPayload.setFnsPayloadFaaPanStatCd(value);
   } 

     /**
	 * 	Update FnsPayloadFaaPanStatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadFaaPanStatCd(char[] source, int sourceIndex) throws CFException {
      fnsPayload.setFnsPayloadFaaPanStatCd(source, sourceIndex);
   	
   }
   
   public void setFnsPayloadFaaPanStatCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fnsPayload.setFnsPayloadFaaPanStatCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPayloadFaaPanStatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadFaaPanStatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPayload.setFnsPayloadFaaPanStatCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPayloadFaaPanStatCd with another Field
	 *	@param value
	 */
   public void setFnsPayloadFaaPanStatCd(Field source) {
      fnsPayload.setFnsPayloadFaaPanStatCd(source);
   }  
   
     /**
	 * 	Update FnsPayloadFaaPanStatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadFaaPanStatCd(Field source, int sourceIndex,int sourceLen) {
      fnsPayload.setFnsPayloadFaaPanStatCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FnsPayloadFaaPanStatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadFaaPanStatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPayload.setFnsPayloadFaaPanStatCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fnsPldRdQueryNo
	 *	@return fnsPldRdQueryNo
	 */
	public short getFnsPldRdQueryNo() throws CFException {        
   		return fnsPldRd.getFnsPldRdQueryNo();
	}
	
	/**
	 * 	Update FnsPldRdQueryNo with the passed value
	 *	@param number
	 */
	public void setFnsPldRdQueryNo(short number)  throws CFException{
		fnsPldRd.setFnsPldRdQueryNo(number);
	}

	public void setFnsPldRdQueryNo(int number)  throws CFException{
		fnsPldRd.setFnsPldRdQueryNo((short)number);
	}

	public void setFnsPldRdQueryNo(long number)  throws CFException{
		fnsPldRd.setFnsPldRdQueryNo((short)number);
	}



	/**
	 *	Returns the value of fnsPayloadExpirationDate
	 *	@return fnsPayloadExpirationDate
	 */   
	 public FnsPayloadExpirationDate getFnsPayloadExpirationDate() {
   	return fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacDataKey().getFnsPayloadExpirationDate();
   }

   /**
	* 	Update FnsPayloadExpirationDate with the passed value
	*	@param value
	*/
   public void setFnsPayloadExpirationDate(char[] value) throws CFException {
      fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacDataKey().setFnsPayloadExpirationDate(value);
   }   

     /**
	 * 	Update FnsPayloadExpirationDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadExpirationDate(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacDataKey().setFnsPayloadExpirationDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPayloadExpirationDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadExpirationDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacDataKey().setFnsPayloadExpirationDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPayloadExpirationDate with another Field
	 *	@param value
	 */
   public void setFnsPayloadExpirationDate(Field source) {
   	fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacDataKey().setFnsPayloadExpirationDate(source);
   }  
   
     /**
	 * 	Update FnsPayloadExpirationDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadExpirationDate(Field source, int sourceIndex,int sourceLen) {
   	fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacDataKey().setFnsPayloadExpirationDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPayloadExpirationDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadExpirationDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacDataKey().setFnsPayloadExpirationDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "S" for isSelectRtn88100()
	 *	@return  Returns true if isSelectRtn88100() is "S"
	 */
   public boolean isSelectRtn88100() throws CFException {
      return apiLayout.isSelectRtn88100();
   }

	/**
	*  set values "S"
	*/
   	public void setSelectRtn88100True()  throws CFException{  			
    	apiLayout.setSelectRtn88100True();
   	}
	/**
	 *	Returns the value of faaFacNotFndCnt800
	 *	@return faaFacNotFndCnt800
	 */
	public int getFaaFacNotFndCnt800() throws CFException {        
   		return work.getFaaFacNotFndCnt800();
	}
	
	/**
	 * 	Update FaaFacNotFndCnt800 with the passed value
	 *	@param number
	 */
	public void setFaaFacNotFndCnt800(int number)  throws CFException{
		work.setFaaFacNotFndCnt800(number);
	}


	public void setFaaFacNotFndCnt800(long number)  throws CFException{
		work.setFaaFacNotFndCnt800((int)number);
	}


	/**
	 *	Returns the value of fnsPayloadLogicalSeq
	 *	@return fnsPayloadLogicalSeq
	 */
	public int getFnsPayloadLogicalSeq() throws CFException {        
   		return fnsPayload.getFnsPayloadLogicalSeq();
	}
	
	/**
	 * 	Update FnsPayloadLogicalSeq with the passed value
	 *	@param number
	 */
	public void setFnsPayloadLogicalSeq(int number)  throws CFException{
		fnsPayload.setFnsPayloadLogicalSeq(number);
	}


	public void setFnsPayloadLogicalSeq(long number)  throws CFException{
		fnsPayload.setFnsPayloadLogicalSeq((int)number);
	}


	/**
	 *	Returns the value of ip50201ClosedDate
	 *	@return ip50201ClosedDate
	 */   
	 public Ip50201ClosedDate getIp50201ClosedDate() {
   	return ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().getIp50201ClosedDate();
   }

   /**
	* 	Update Ip50201ClosedDate with the passed value
	*	@param value
	*/
   public void setIp50201ClosedDate(char[] value) throws CFException {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201ClosedDate(value);
   }   

     /**
	 * 	Update Ip50201ClosedDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50201ClosedDate(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201ClosedDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50201ClosedDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50201ClosedDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201ClosedDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50201ClosedDate with another Field
	 *	@param value
	 */
   public void setIp50201ClosedDate(Field source) {
   	ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201ClosedDate(source);
   }  
   
     /**
	 * 	Update Ip50201ClosedDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50201ClosedDate(Field source, int sourceIndex,int sourceLen) {
   	ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201ClosedDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50201ClosedDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50201ClosedDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201ClosedDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "G" for isRowsFound88100()
	 *	@return  Returns true if isRowsFound88100() is "G"
	 */
   public boolean isRowsFound88100() throws CFException {
      return apiLayout.isRowsFound88100();
   }

	/**
	*  set values "G"
	*/
   	public void setRowsFound88100True()  throws CFException{  			
    	apiLayout.setRowsFound88100True();
   	}
	/**
	 *	Returns the value of fnsPayloadFacCount
	 *	@return fnsPayloadFacCount
	 */
	public short getFnsPayloadFacCount() throws CFException {        
   		return fnsPayload.getFnsPayloadFacCount();
	}
	
	/**
	 * 	Update FnsPayloadFacCount with the passed value
	 *	@param number
	 */
	public void setFnsPayloadFacCount(short number)  throws CFException{
		fnsPayload.setFnsPayloadFacCount(number);
	}

	public void setFnsPayloadFacCount(int number)  throws CFException{
		fnsPayload.setFnsPayloadFacCount((short)number);
	}

	public void setFnsPayloadFacCount(long number)  throws CFException{
		fnsPayload.setFnsPayloadFacCount((short)number);
	}



	/**
	 *	Returns the value of ip50201VrtlAcctNum
	 *	@return ip50201VrtlAcctNum
	 */
   public char[] getIp50201VrtlAcctNum() throws CFException  {              
   		return ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().getIp50201VrtlAcctNum();
   }

  
	/**
	*  set variable ip50201VrtlAcctNum
	*  @param value
	**/
   public void setIp50201VrtlAcctNum(char[] value) throws CFException {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201VrtlAcctNum(value);
   } 

     /**
	 * 	Update Ip50201VrtlAcctNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50201VrtlAcctNum(char[] source, int sourceIndex) throws CFException {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201VrtlAcctNum(source, sourceIndex);
   	
   }
   
   public void setIp50201VrtlAcctNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201VrtlAcctNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50201VrtlAcctNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50201VrtlAcctNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201VrtlAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50201VrtlAcctNum with another Field
	 *	@param value
	 */
   public void setIp50201VrtlAcctNum(Field source) {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201VrtlAcctNum(source);
   }  
   
     /**
	 * 	Update Ip50201VrtlAcctNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50201VrtlAcctNum(Field source, int sourceIndex,int sourceLen) {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201VrtlAcctNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip50201VrtlAcctNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50201VrtlAcctNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201VrtlAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fnsPldRdLogicalSeq
	 *	@return fnsPldRdLogicalSeq
	 */
	public int getFnsPldRdLogicalSeq() throws CFException {        
   		return fnsPldRd.getFnsPldRdLogicalSeq();
	}
	
	/**
	 * 	Update FnsPldRdLogicalSeq with the passed value
	 *	@param number
	 */
	public void setFnsPldRdLogicalSeq(int number)  throws CFException{
		fnsPldRd.setFnsPldRdLogicalSeq(number);
	}


	public void setFnsPldRdLogicalSeq(long number)  throws CFException{
		fnsPldRd.setFnsPldRdLogicalSeq((int)number);
	}


	/**
	 *	Returns the value of fnsPayloadGftDsn
	 *	@return fnsPayloadGftDsn
	 */
   public char[] getFnsPayloadGftDsn() throws CFException  {              
   		return fnsPayload.getFnsPayloadGftDsn();
   }

  
	/**
	*  set variable fnsPayloadGftDsn
	*  @param value
	**/
   public void setFnsPayloadGftDsn(char[] value) throws CFException {
      fnsPayload.setFnsPayloadGftDsn(value);
   } 

     /**
	 * 	Update FnsPayloadGftDsn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadGftDsn(char[] source, int sourceIndex) throws CFException {
      fnsPayload.setFnsPayloadGftDsn(source, sourceIndex);
   	
   }
   
   public void setFnsPayloadGftDsn(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fnsPayload.setFnsPayloadGftDsn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPayloadGftDsn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadGftDsn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPayload.setFnsPayloadGftDsn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPayloadGftDsn with another Field
	 *	@param value
	 */
   public void setFnsPayloadGftDsn(Field source) {
      fnsPayload.setFnsPayloadGftDsn(source);
   }  
   
     /**
	 * 	Update FnsPayloadGftDsn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadGftDsn(Field source, int sourceIndex,int sourceLen) {
      fnsPayload.setFnsPayloadGftDsn(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FnsPayloadGftDsn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadGftDsn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPayload.setFnsPayloadGftDsn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fnsPldRdExpirationDate
	 *	@return fnsPldRdExpirationDate
	 */   
	 public FnsPldRdExpirationDate getFnsPldRdExpirationDate() {
   	return fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().getFnsPldRdExpirationDate();
   }

   /**
	* 	Update FnsPldRdExpirationDate with the passed value
	*	@param value
	*/
   public void setFnsPldRdExpirationDate(char[] value) throws CFException {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(value);
   }   

     /**
	 * 	Update FnsPldRdExpirationDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPldRdExpirationDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPldRdExpirationDate with another Field
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(Field source) {
   	fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(source);
   }  
   
     /**
	 * 	Update FnsPldRdExpirationDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(Field source, int sourceIndex,int sourceLen) {
   	fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPldRdExpirationDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fnsPayload
	 *	@return fnsPayload
	 */   
	 public FnsPayload getFnsPayload() {
   	return fnsPayload;
   }


	/**
	 *	Returns the value of fnsPayloadFaaCloseDt
	 *	@return fnsPayloadFaaCloseDt
	 */
   public char[] getFnsPayloadFaaCloseDt() throws CFException  {              
   		return fnsPayload.getFnsPayloadFaaCloseDt();
   }

  
	/**
	*  set variable fnsPayloadFaaCloseDt
	*  @param value
	**/
   public void setFnsPayloadFaaCloseDt(char[] value) throws CFException {
      fnsPayload.setFnsPayloadFaaCloseDt(value);
   } 

     /**
	 * 	Update FnsPayloadFaaCloseDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadFaaCloseDt(char[] source, int sourceIndex) throws CFException {
      fnsPayload.setFnsPayloadFaaCloseDt(source, sourceIndex);
   	
   }
   
   public void setFnsPayloadFaaCloseDt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fnsPayload.setFnsPayloadFaaCloseDt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPayloadFaaCloseDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadFaaCloseDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPayload.setFnsPayloadFaaCloseDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPayloadFaaCloseDt with another Field
	 *	@param value
	 */
   public void setFnsPayloadFaaCloseDt(Field source) {
      fnsPayload.setFnsPayloadFaaCloseDt(source);
   }  
   
     /**
	 * 	Update FnsPayloadFaaCloseDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadFaaCloseDt(Field source, int sourceIndex,int sourceLen) {
      fnsPayload.setFnsPayloadFaaCloseDt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FnsPayloadFaaCloseDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadFaaCloseDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPayload.setFnsPayloadFaaCloseDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip50201AccntStatus
	 *	@return ip50201AccntStatus
	 */
   public char[] getIp50201AccntStatus() throws CFException  {              
   		return ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().getIp50201AccntStatus();
   }

  
	/**
	*  set variable ip50201AccntStatus
	*  @param value
	**/
   public void setIp50201AccntStatus(char[] value) throws CFException {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201AccntStatus(value);
   } 

     /**
	 * 	Update Ip50201AccntStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50201AccntStatus(char[] source, int sourceIndex) throws CFException {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201AccntStatus(source, sourceIndex);
   	
   }
   
   public void setIp50201AccntStatus(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201AccntStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50201AccntStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50201AccntStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201AccntStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50201AccntStatus with another Field
	 *	@param value
	 */
   public void setIp50201AccntStatus(Field source) {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201AccntStatus(source);
   }  
   
     /**
	 * 	Update Ip50201AccntStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50201AccntStatus(Field source, int sourceIndex,int sourceLen) {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201AccntStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip50201AccntStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50201AccntStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201AccntStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip50201PrimaryAcctNbr
	 *	@return ip50201PrimaryAcctNbr
	 */
   public char[] getIp50201PrimaryAcctNbr() throws CFException  {              
   		return ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().getIp50201PrimaryAcctNbr();
   }

  
	/**
	*  set variable ip50201PrimaryAcctNbr
	*  @param value
	**/
   public void setIp50201PrimaryAcctNbr(char[] value) throws CFException {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201PrimaryAcctNbr(value);
   } 

     /**
	 * 	Update Ip50201PrimaryAcctNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50201PrimaryAcctNbr(char[] source, int sourceIndex) throws CFException {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201PrimaryAcctNbr(source, sourceIndex);
   	
   }
   
   public void setIp50201PrimaryAcctNbr(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201PrimaryAcctNbr(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50201PrimaryAcctNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50201PrimaryAcctNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201PrimaryAcctNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50201PrimaryAcctNbr with another Field
	 *	@param value
	 */
   public void setIp50201PrimaryAcctNbr(Field source) {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201PrimaryAcctNbr(source);
   }  
   
     /**
	 * 	Update Ip50201PrimaryAcctNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50201PrimaryAcctNbr(Field source, int sourceIndex,int sourceLen) {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201PrimaryAcctNbr(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip50201PrimaryAcctNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50201PrimaryAcctNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip50201Tipafaa.getIp50201FnsDataFields().getIp50201FaaData().setIp50201PrimaryAcctNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of facNotFoundMsg300
	 *	@return facNotFoundMsg300
	 */
   public char[] getFacNotFoundMsg300() throws CFException  {              
   		return work.getFacNotFoundMsg300();
   }

  
	/**
	*  set variable facNotFoundMsg300
	*  @param value
	**/
   public void setFacNotFoundMsg300(char[] value) throws CFException {
      work.setFacNotFoundMsg300(value);
   } 

	/**
	 *	Returns the value of queryNo
	 *	@return queryNo
	 */
	public short getQueryNo() throws CFException {        
   		return apiLayout.getQueryNo();
	}
	
	/**
	 * 	Update QueryNo with the passed value
	 *	@param number
	 */
	public void setQueryNo(short number)  throws CFException{
		apiLayout.setQueryNo(number);
	}

	public void setQueryNo(int number)  throws CFException{
		apiLayout.setQueryNo((short)number);
	}

	public void setQueryNo(long number)  throws CFException{
		apiLayout.setQueryNo((short)number);
	}



	/**
	 *	Returns the value of fnsPayloadVrtlAcctNum
	 *	@return fnsPayloadVrtlAcctNum
	 */
   public char[] getFnsPayloadVrtlAcctNum() throws CFException  {              
   		return fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacData().getFnsPayloadVrtlAcctNum();
   }

  
	/**
	*  set variable fnsPayloadVrtlAcctNum
	*  @param value
	**/
   public void setFnsPayloadVrtlAcctNum(char[] value) throws CFException {
      fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacData().setFnsPayloadVrtlAcctNum(value);
   } 

     /**
	 * 	Update FnsPayloadVrtlAcctNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadVrtlAcctNum(char[] source, int sourceIndex) throws CFException {
      fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacData().setFnsPayloadVrtlAcctNum(source, sourceIndex);
   	
   }
   
   public void setFnsPayloadVrtlAcctNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacData().setFnsPayloadVrtlAcctNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPayloadVrtlAcctNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadVrtlAcctNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacData().setFnsPayloadVrtlAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPayloadVrtlAcctNum with another Field
	 *	@param value
	 */
   public void setFnsPayloadVrtlAcctNum(Field source) {
      fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacData().setFnsPayloadVrtlAcctNum(source);
   }  
   
     /**
	 * 	Update FnsPayloadVrtlAcctNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadVrtlAcctNum(Field source, int sourceIndex,int sourceLen) {
      fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacData().setFnsPayloadVrtlAcctNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FnsPayloadVrtlAcctNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadVrtlAcctNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPayload.getFnsPayloadFnsDataFields().getFnsPayloadFacData().setFnsPayloadVrtlAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fnsPldRdVrtlAcctNum
	 *	@return fnsPldRdVrtlAcctNum
	 */
   public char[] getFnsPldRdVrtlAcctNum() throws CFException  {              
   		return fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().getFnsPldRdVrtlAcctNum();
   }

  
	/**
	*  set variable fnsPldRdVrtlAcctNum
	*  @param value
	**/
   public void setFnsPldRdVrtlAcctNum(char[] value) throws CFException {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(value);
   } 

     /**
	 * 	Update FnsPldRdVrtlAcctNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(char[] source, int sourceIndex) throws CFException {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source, sourceIndex);
   	
   }
   
   public void setFnsPldRdVrtlAcctNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPldRdVrtlAcctNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPldRdVrtlAcctNum with another Field
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(Field source) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source);
   }  
   
     /**
	 * 	Update FnsPldRdVrtlAcctNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(Field source, int sourceIndex,int sourceLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FnsPldRdVrtlAcctNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip82921ErrMsgOut.hashCode();
        str += apiLayout.hashCode();
        str += fnsPayload.hashCode();
        str += fnsPldRd.hashCode();
        str += work.hashCode();
        str += ip50201Tipafaa.hashCode();
       return str.hashCode();
    }

    public IndiaFraudTableLookupOutCtx clone() {
        IndiaFraudTableLookupOutCtx cloneObj = new IndiaFraudTableLookupOutCtx();
        cloneObj.ip82921ErrMsgOut = new Ip82921ErrMsgOut();
        cloneObj.ip82921ErrMsgOut.set(ip82921ErrMsgOut.getClonedField());
        cloneObj.apiLayout = new ApiLayout();
        cloneObj.apiLayout.set(apiLayout.getClonedField());
        cloneObj.fnsPayload = new FnsPayload();
        cloneObj.fnsPayload.set(fnsPayload.getClonedField());
        cloneObj.fnsPldRd = new FnsPldRd();
        cloneObj.fnsPldRd.set(fnsPldRd.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50201Tipafaa = new Ip50201Tipafaa();
        cloneObj.ip50201Tipafaa.set(ip50201Tipafaa.getClonedField());
        return cloneObj;
    }

    }

    public IndiaFraudTableLookupOutCtx getIndiaFraudTableLookupOutCtx() {
            return new IndiaFraudTableLookupOutCtx();
    }
     public class PopulateMqputFieldsInCtx implements Cloneable {
     Ip7052f4MqApiLayout ip7052f4MqApiLayout = Ip829010Ctx.this.getIp7052f4MqApiLayout();
     Ip7051f4Table ip7051f4Table = Ip829010Ctx.this.getIp7051f4Table();
     QueueVars800 queueVars800 = Ip829010Ctx.this.getQueueVars800();
     Ip70521MqApiLayout ip70521MqApiLayout = Ip829010Ctx.this.getIp70521MqApiLayout();
     FnsPayload fnsPayload = Ip829010Ctx.this.getFnsPayload();
     Work work = Ip829010Ctx.this.getWork();

	/**
	 *	Returns the value of reqHobj800
	 *	@return reqHobj800
	 */
	public int getReqHobj800() throws CFException {        
   		return queueVars800.getReqHobj800();
	}
	
	/**
	 * 	Update ReqHobj800 with the passed value
	 *	@param number
	 */
	public void setReqHobj800(int number)  throws CFException{
		queueVars800.setReqHobj800(number);
	}


	public void setReqHobj800(long number)  throws CFException{
		queueVars800.setReqHobj800((int)number);
	}


	/**
	 *	Returns the value of ip7052f4TimeDelay
	 *	@return ip7052f4TimeDelay
	 */
   public char[] getIp7052f4TimeDelay() throws CFException  {              
   		return ip7052f4MqApiLayout.getIp7052f4ProcDelay().getIp7052f4TimeDelay();
   }

  
	/**
	*  set variable ip7052f4TimeDelay
	*  @param value
	**/
   public void setIp7052f4TimeDelay(char[] value) throws CFException {
      ip7052f4MqApiLayout.getIp7052f4ProcDelay().setIp7052f4TimeDelay(value);
   } 

     /**
	 * 	Update Ip7052f4TimeDelay 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052f4TimeDelay(char[] source, int sourceIndex) throws CFException {
      ip7052f4MqApiLayout.getIp7052f4ProcDelay().setIp7052f4TimeDelay(source, sourceIndex);
   	
   }
   
   public void setIp7052f4TimeDelay(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip7052f4MqApiLayout.getIp7052f4ProcDelay().setIp7052f4TimeDelay(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip7052f4TimeDelay 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4TimeDelay(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip7052f4MqApiLayout.getIp7052f4ProcDelay().setIp7052f4TimeDelay(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip7052f4TimeDelay with another Field
	 *	@param value
	 */
   public void setIp7052f4TimeDelay(Field source) {
      ip7052f4MqApiLayout.getIp7052f4ProcDelay().setIp7052f4TimeDelay(source);
   }  
   
     /**
	 * 	Update Ip7052f4TimeDelay 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052f4TimeDelay(Field source, int sourceIndex,int sourceLen) {
      ip7052f4MqApiLayout.getIp7052f4ProcDelay().setIp7052f4TimeDelay(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip7052f4TimeDelay 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4TimeDelay(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip7052f4MqApiLayout.getIp7052f4ProcDelay().setIp7052f4TimeDelay(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of start800
	 *	@return start800
	 */
	public int getStart800() throws CFException {        
   		return work.getStart800();
	}
	
	/**
	 * 	Update Start800 with the passed value
	 *	@param number
	 */
	public void setStart800(int number)  throws CFException{
		work.setStart800(number);
	}


	public void setStart800(long number)  throws CFException{
		work.setStart800((int)number);
	}


	/**
	 *	Returns the value of ip7052f4NoOfTrans
	 *	@return ip7052f4NoOfTrans
	 */
	public long getIp7052f4NoOfTrans() throws CFException {
   		return ip7052f4MqApiLayout.getIp7052f4ProcDelay().getIp7052f4NoOfTrans();
	}


	/**
	 *	Returns String value of ip7052f4NoOfTrans
	 *	@return ip7052f4NoOfTrans
	 */
	public char[]  getIp7052f4NoOfTransString() throws CFException {
	     return String.valueOf(ip7052f4MqApiLayout.getIp7052f4ProcDelay().getIp7052f4NoOfTransString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip7052f4NoOfTransIsNumeric()  throws CFException{
	    return ip7052f4MqApiLayout.getIp7052f4ProcDelay().ip7052f4NoOfTransIsNumeric();
	}

	/**
	 * 	Update Ip7052f4NoOfTrans with the passed value
	 *	@param number
	 */
	public void setIp7052f4NoOfTrans(long number)  throws CFException{
		ip7052f4MqApiLayout.getIp7052f4ProcDelay().setIp7052f4NoOfTrans(number);
	}
	

	
	/**
	 * 	Update Ip7052f4NoOfTrans with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp7052f4NoOfTrans(char[] value)  throws CFException {
		ip7052f4MqApiLayout.getIp7052f4ProcDelay().setIp7052f4NoOfTrans(value);
	}
	
	/**
	 * 	Update Ip7052f4NoOfTrans with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp7052f4NoOfTransString(char[] value)  throws CFException{
		ip7052f4MqApiLayout.getIp7052f4ProcDelay().setIp7052f4NoOfTrans(value);
	}	

	/**
	 *	Returns the value of reqHconn800
	 *	@return reqHconn800
	 */
	public int getReqHconn800() throws CFException {        
   		return queueVars800.getReqHconn800();
	}
	
	/**
	 * 	Update ReqHconn800 with the passed value
	 *	@param number
	 */
	public void setReqHconn800(int number)  throws CFException{
		queueVars800.setReqHconn800(number);
	}


	public void setReqHconn800(long number)  throws CFException{
		queueVars800.setReqHconn800((int)number);
	}


	/**
	 *	Returns the value of end800
	 *	@return end800
	 */
	public int getEnd800() throws CFException {        
   		return work.getEnd800();
	}
	
	/**
	 * 	Update End800 with the passed value
	 *	@param number
	 */
	public void setEnd800(int number)  throws CFException{
		work.setEnd800(number);
	}


	public void setEnd800(long number)  throws CFException{
		work.setEnd800((int)number);
	}


	/**
	 *	Returns the value of fnsPayload
	 *	@return fnsPayload
	 */   
	 public FnsPayload getFnsPayload() {
   	return fnsPayload;
   }


	/**
	 *	Returns the value of ip7051f4MqBypassSw
	 *	@return ip7051f4MqBypassSw
	 */
   public char[] getIp7051f4MqBypassSw() throws CFException  {              
   		return ip7051f4Table.getIp7051f4MqBypassSw();
   }

  
	/**
	*  set variable ip7051f4MqBypassSw
	*  @param value
	**/
   public void setIp7051f4MqBypassSw(char[] value) throws CFException {
      ip7051f4Table.setIp7051f4MqBypassSw(value);
   } 

     /**
	 * 	Update Ip7051f4MqBypassSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051f4MqBypassSw(char[] source, int sourceIndex) throws CFException {
      ip7051f4Table.setIp7051f4MqBypassSw(source, sourceIndex);
   	
   }
   
   public void setIp7051f4MqBypassSw(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip7051f4Table.setIp7051f4MqBypassSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip7051f4MqBypassSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4MqBypassSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip7051f4Table.setIp7051f4MqBypassSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip7051f4MqBypassSw with another Field
	 *	@param value
	 */
   public void setIp7051f4MqBypassSw(Field source) {
      ip7051f4Table.setIp7051f4MqBypassSw(source);
   }  
   
     /**
	 * 	Update Ip7051f4MqBypassSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051f4MqBypassSw(Field source, int sourceIndex,int sourceLen) {
      ip7051f4Table.setIp7051f4MqBypassSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip7051f4MqBypassSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4MqBypassSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip7051f4Table.setIp7051f4MqBypassSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of reqQmgrName800
	 *	@return reqQmgrName800
	 */
   public char[] getReqQmgrName800() throws CFException  {              
   		return queueVars800.getReqQmgrName800();
   }

  
	/**
	*  set variable reqQmgrName800
	*  @param value
	**/
   public void setReqQmgrName800(char[] value) throws CFException {
      queueVars800.setReqQmgrName800(value);
   } 

     /**
	 * 	Update ReqQmgrName800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setReqQmgrName800(char[] source, int sourceIndex) throws CFException {
      queueVars800.setReqQmgrName800(source, sourceIndex);
   	
   }
   
   public void setReqQmgrName800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      queueVars800.setReqQmgrName800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ReqQmgrName800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReqQmgrName800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      queueVars800.setReqQmgrName800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ReqQmgrName800 with another Field
	 *	@param value
	 */
   public void setReqQmgrName800(Field source) {
      queueVars800.setReqQmgrName800(source);
   }  
   
     /**
	 * 	Update ReqQmgrName800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setReqQmgrName800(Field source, int sourceIndex,int sourceLen) {
      queueVars800.setReqQmgrName800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ReqQmgrName800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReqQmgrName800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      queueVars800.setReqQmgrName800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of reqQName800
	 *	@return reqQName800
	 */
   public char[] getReqQName800() throws CFException  {              
   		return queueVars800.getReqQName800();
   }

  
	/**
	*  set variable reqQName800
	*  @param value
	**/
   public void setReqQName800(char[] value) throws CFException {
      queueVars800.setReqQName800(value);
   } 

     /**
	 * 	Update ReqQName800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setReqQName800(char[] source, int sourceIndex) throws CFException {
      queueVars800.setReqQName800(source, sourceIndex);
   	
   }
   
   public void setReqQName800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      queueVars800.setReqQName800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ReqQName800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReqQName800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      queueVars800.setReqQName800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ReqQName800 with another Field
	 *	@param value
	 */
   public void setReqQName800(Field source) {
      queueVars800.setReqQName800(source);
   }  
   
     /**
	 * 	Update ReqQName800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setReqQName800(Field source, int sourceIndex,int sourceLen) {
      queueVars800.setReqQName800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ReqQName800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReqQName800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      queueVars800.setReqQName800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public PopulateMqputFieldsOutCtx getPopulateMqputFieldsOutCtx() {
            return new PopulateMqputFieldsOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip7052f4MqApiLayout.hashCode();
        str += ip7051f4Table.hashCode();
        str += queueVars800.hashCode();
        str += ip70521MqApiLayout.hashCode();
        str += fnsPayload.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public PopulateMqputFieldsInCtx clone() {
        PopulateMqputFieldsInCtx cloneObj = new PopulateMqputFieldsInCtx();
        cloneObj.ip7052f4MqApiLayout = new Ip7052f4MqApiLayout();
        cloneObj.ip7052f4MqApiLayout.set(ip7052f4MqApiLayout.getClonedField());
        cloneObj.ip7051f4Table = new Ip7051f4Table();
        cloneObj.ip7051f4Table.set(ip7051f4Table.getClonedField());
        cloneObj.queueVars800 = new QueueVars800();
        cloneObj.queueVars800.set(queueVars800.getClonedField());
        cloneObj.ip70521MqApiLayout = new Ip70521MqApiLayout();
        cloneObj.ip70521MqApiLayout.set(ip70521MqApiLayout.getClonedField());
        cloneObj.fnsPayload = new FnsPayload();
        cloneObj.fnsPayload.set(fnsPayload.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public PopulateMqputFieldsInCtx getPopulateMqputFieldsInCtx() {
            return new PopulateMqputFieldsInCtx();
    }
     public class PopulateMqputFieldsOutCtx implements Cloneable {
     Ip7052f4MqApiLayout ip7052f4MqApiLayout = Ip829010Ctx.this.getIp7052f4MqApiLayout();
     Ip7051f4Table ip7051f4Table = Ip829010Ctx.this.getIp7051f4Table();
     QueueVars800 queueVars800 = Ip829010Ctx.this.getQueueVars800();
     Ip70521MqApiLayout ip70521MqApiLayout = Ip829010Ctx.this.getIp70521MqApiLayout();
     FnsPayload fnsPayload = Ip829010Ctx.this.getFnsPayload();
     Work work = Ip829010Ctx.this.getWork();

	/**
	 *	Returns the value of ip70521MsgBuffer
	 *	@return ip70521MsgBuffer
	 */
   public char[] getIp70521MsgBuffer() throws CFException  {              
   		return ip70521MqApiLayout.getIp70521MsgBuffer();
   }

  
	/**
	*  set variable ip70521MsgBuffer
	*  @param value
	**/
   public void setIp70521MsgBuffer(char[] value) throws CFException {
      ip70521MqApiLayout.setIp70521MsgBuffer(value);
   } 

     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521MsgBuffer(char[] source, int sourceIndex) throws CFException {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex);
   	
   }
   
   public void setIp70521MsgBuffer(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MsgBuffer(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70521MsgBuffer with another Field
	 *	@param value
	 */
   public void setIp70521MsgBuffer(Field source) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source);
   }  
   
     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521MsgBuffer(Field source, int sourceIndex,int sourceLen) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MsgBuffer(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip70521NoOfTrans
	 *	@return ip70521NoOfTrans
	 */
	public long getIp70521NoOfTrans() throws CFException {
   		return ip70521MqApiLayout.getIp70521ProcDelay().getIp70521NoOfTrans();
	}


	/**
	 *	Returns String value of ip70521NoOfTrans
	 *	@return ip70521NoOfTrans
	 */
	public char[]  getIp70521NoOfTransString() throws CFException {
	     return String.valueOf(ip70521MqApiLayout.getIp70521ProcDelay().getIp70521NoOfTransString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip70521NoOfTransIsNumeric()  throws CFException{
	    return ip70521MqApiLayout.getIp70521ProcDelay().ip70521NoOfTransIsNumeric();
	}

	/**
	 * 	Update Ip70521NoOfTrans with the passed value
	 *	@param number
	 */
	public void setIp70521NoOfTrans(long number)  throws CFException{
		ip70521MqApiLayout.getIp70521ProcDelay().setIp70521NoOfTrans(number);
	}
	

	
	/**
	 * 	Update Ip70521NoOfTrans with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp70521NoOfTrans(char[] value)  throws CFException {
		ip70521MqApiLayout.getIp70521ProcDelay().setIp70521NoOfTrans(value);
	}
	
	/**
	 * 	Update Ip70521NoOfTrans with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp70521NoOfTransString(char[] value)  throws CFException{
		ip70521MqApiLayout.getIp70521ProcDelay().setIp70521NoOfTrans(value);
	}	

	/**
	 *	Returns the value of start800
	 *	@return start800
	 */
	public int getStart800() throws CFException {        
   		return work.getStart800();
	}
	
	/**
	 * 	Update Start800 with the passed value
	 *	@param number
	 */
	public void setStart800(int number)  throws CFException{
		work.setStart800(number);
	}


	public void setStart800(long number)  throws CFException{
		work.setStart800((int)number);
	}


	/**
	 *	Returns the value of ip70521TimeDelay
	 *	@return ip70521TimeDelay
	 */
   public char[] getIp70521TimeDelay() throws CFException  {              
   		return ip70521MqApiLayout.getIp70521ProcDelay().getIp70521TimeDelay();
   }

  
	/**
	*  set variable ip70521TimeDelay
	*  @param value
	**/
   public void setIp70521TimeDelay(char[] value) throws CFException {
      ip70521MqApiLayout.getIp70521ProcDelay().setIp70521TimeDelay(value);
   } 

     /**
	 * 	Update Ip70521TimeDelay 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521TimeDelay(char[] source, int sourceIndex) throws CFException {
      ip70521MqApiLayout.getIp70521ProcDelay().setIp70521TimeDelay(source, sourceIndex);
   	
   }
   
   public void setIp70521TimeDelay(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70521MqApiLayout.getIp70521ProcDelay().setIp70521TimeDelay(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70521TimeDelay 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521TimeDelay(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.getIp70521ProcDelay().setIp70521TimeDelay(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70521TimeDelay with another Field
	 *	@param value
	 */
   public void setIp70521TimeDelay(Field source) {
      ip70521MqApiLayout.getIp70521ProcDelay().setIp70521TimeDelay(source);
   }  
   
     /**
	 * 	Update Ip70521TimeDelay 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521TimeDelay(Field source, int sourceIndex,int sourceLen) {
      ip70521MqApiLayout.getIp70521ProcDelay().setIp70521TimeDelay(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70521TimeDelay 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521TimeDelay(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.getIp70521ProcDelay().setIp70521TimeDelay(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip70521MsgBufferLen
	 *	@return ip70521MsgBufferLen
	 */
	public int getIp70521MsgBufferLen() throws CFException {        
   		return ip70521MqApiLayout.getIp70521MsgBufferLen();
	}
	
	/**
	 * 	Update Ip70521MsgBufferLen with the passed value
	 *	@param number
	 */
	public void setIp70521MsgBufferLen(int number)  throws CFException{
		ip70521MqApiLayout.setIp70521MsgBufferLen(number);
	}


	public void setIp70521MsgBufferLen(long number)  throws CFException{
		ip70521MqApiLayout.setIp70521MsgBufferLen((int)number);
	}


	/**
	 *	Returns the value of end800
	 *	@return end800
	 */
	public int getEnd800() throws CFException {        
   		return work.getEnd800();
	}
	
	/**
	 * 	Update End800 with the passed value
	 *	@param number
	 */
	public void setEnd800(int number)  throws CFException{
		work.setEnd800(number);
	}


	public void setEnd800(long number)  throws CFException{
		work.setEnd800((int)number);
	}


	/**
	 *	Returns the value of fnsPayload
	 *	@return fnsPayload
	 */   
	 public FnsPayload getFnsPayload() {
   	return fnsPayload;
   }


	/**
	 *	Returns the value of ip7051f4MqBypassSw
	 *	@return ip7051f4MqBypassSw
	 */
   public char[] getIp7051f4MqBypassSw() throws CFException  {              
   		return ip7051f4Table.getIp7051f4MqBypassSw();
   }

  
	/**
	*  set variable ip7051f4MqBypassSw
	*  @param value
	**/
   public void setIp7051f4MqBypassSw(char[] value) throws CFException {
      ip7051f4Table.setIp7051f4MqBypassSw(value);
   } 

     /**
	 * 	Update Ip7051f4MqBypassSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051f4MqBypassSw(char[] source, int sourceIndex) throws CFException {
      ip7051f4Table.setIp7051f4MqBypassSw(source, sourceIndex);
   	
   }
   
   public void setIp7051f4MqBypassSw(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip7051f4Table.setIp7051f4MqBypassSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip7051f4MqBypassSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4MqBypassSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip7051f4Table.setIp7051f4MqBypassSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip7051f4MqBypassSw with another Field
	 *	@param value
	 */
   public void setIp7051f4MqBypassSw(Field source) {
      ip7051f4Table.setIp7051f4MqBypassSw(source);
   }  
   
     /**
	 * 	Update Ip7051f4MqBypassSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051f4MqBypassSw(Field source, int sourceIndex,int sourceLen) {
      ip7051f4Table.setIp7051f4MqBypassSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip7051f4MqBypassSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4MqBypassSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip7051f4Table.setIp7051f4MqBypassSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip70521Hconn
	 *	@return ip70521Hconn
	 */
	public int getIp70521Hconn() throws CFException {        
   		return ip70521MqApiLayout.getIp70521Hconn();
	}
	
	/**
	 * 	Update Ip70521Hconn with the passed value
	 *	@param number
	 */
	public void setIp70521Hconn(int number)  throws CFException{
		ip70521MqApiLayout.setIp70521Hconn(number);
	}


	public void setIp70521Hconn(long number)  throws CFException{
		ip70521MqApiLayout.setIp70521Hconn((int)number);
	}


	/**
	 *	Returns the value of ip70521QmgrName
	 *	@return ip70521QmgrName
	 */
   public char[] getIp70521QmgrName() throws CFException  {              
   		return ip70521MqApiLayout.getIp70521QmgrName();
   }

  
	/**
	*  set variable ip70521QmgrName
	*  @param value
	**/
   public void setIp70521QmgrName(char[] value) throws CFException {
      ip70521MqApiLayout.setIp70521QmgrName(value);
   } 

     /**
	 * 	Update Ip70521QmgrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521QmgrName(char[] source, int sourceIndex) throws CFException {
      ip70521MqApiLayout.setIp70521QmgrName(source, sourceIndex);
   	
   }
   
   public void setIp70521QmgrName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70521MqApiLayout.setIp70521QmgrName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70521QmgrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521QmgrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521QmgrName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70521QmgrName with another Field
	 *	@param value
	 */
   public void setIp70521QmgrName(Field source) {
      ip70521MqApiLayout.setIp70521QmgrName(source);
   }  
   
     /**
	 * 	Update Ip70521QmgrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521QmgrName(Field source, int sourceIndex,int sourceLen) {
      ip70521MqApiLayout.setIp70521QmgrName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70521QmgrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521QmgrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521QmgrName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip70521MqBypassSw
	 *	@return ip70521MqBypassSw
	 */
   public char[] getIp70521MqBypassSw() throws CFException  {              
   		return ip70521MqApiLayout.getIp70521MqBypassSw();
   }

  
	/**
	*  set variable ip70521MqBypassSw
	*  @param value
	**/
   public void setIp70521MqBypassSw(char[] value) throws CFException {
      ip70521MqApiLayout.setIp70521MqBypassSw(value);
   } 

     /**
	 * 	Update Ip70521MqBypassSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521MqBypassSw(char[] source, int sourceIndex) throws CFException {
      ip70521MqApiLayout.setIp70521MqBypassSw(source, sourceIndex);
   	
   }
   
   public void setIp70521MqBypassSw(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70521MqApiLayout.setIp70521MqBypassSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70521MqBypassSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MqBypassSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521MqBypassSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70521MqBypassSw with another Field
	 *	@param value
	 */
   public void setIp70521MqBypassSw(Field source) {
      ip70521MqApiLayout.setIp70521MqBypassSw(source);
   }  
   
     /**
	 * 	Update Ip70521MqBypassSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521MqBypassSw(Field source, int sourceIndex,int sourceLen) {
      ip70521MqApiLayout.setIp70521MqBypassSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70521MqBypassSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MqBypassSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521MqBypassSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of reqHobj800
	 *	@return reqHobj800
	 */
	public int getReqHobj800() throws CFException {        
   		return queueVars800.getReqHobj800();
	}
	
	/**
	 * 	Update ReqHobj800 with the passed value
	 *	@param number
	 */
	public void setReqHobj800(int number)  throws CFException{
		queueVars800.setReqHobj800(number);
	}


	public void setReqHobj800(long number)  throws CFException{
		queueVars800.setReqHobj800((int)number);
	}


	/**
	 *	Returns the value of ip7052f4TimeDelay
	 *	@return ip7052f4TimeDelay
	 */
   public char[] getIp7052f4TimeDelay() throws CFException  {              
   		return ip7052f4MqApiLayout.getIp7052f4ProcDelay().getIp7052f4TimeDelay();
   }

  
	/**
	*  set variable ip7052f4TimeDelay
	*  @param value
	**/
   public void setIp7052f4TimeDelay(char[] value) throws CFException {
      ip7052f4MqApiLayout.getIp7052f4ProcDelay().setIp7052f4TimeDelay(value);
   } 

     /**
	 * 	Update Ip7052f4TimeDelay 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7052f4TimeDelay(char[] source, int sourceIndex) throws CFException {
      ip7052f4MqApiLayout.getIp7052f4ProcDelay().setIp7052f4TimeDelay(source, sourceIndex);
   	
   }
   
   public void setIp7052f4TimeDelay(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip7052f4MqApiLayout.getIp7052f4ProcDelay().setIp7052f4TimeDelay(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip7052f4TimeDelay 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4TimeDelay(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip7052f4MqApiLayout.getIp7052f4ProcDelay().setIp7052f4TimeDelay(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip7052f4TimeDelay with another Field
	 *	@param value
	 */
   public void setIp7052f4TimeDelay(Field source) {
      ip7052f4MqApiLayout.getIp7052f4ProcDelay().setIp7052f4TimeDelay(source);
   }  
   
     /**
	 * 	Update Ip7052f4TimeDelay 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7052f4TimeDelay(Field source, int sourceIndex,int sourceLen) {
      ip7052f4MqApiLayout.getIp7052f4ProcDelay().setIp7052f4TimeDelay(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip7052f4TimeDelay 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7052f4TimeDelay(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip7052f4MqApiLayout.getIp7052f4ProcDelay().setIp7052f4TimeDelay(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip7052f4NoOfTrans
	 *	@return ip7052f4NoOfTrans
	 */
	public long getIp7052f4NoOfTrans() throws CFException {
   		return ip7052f4MqApiLayout.getIp7052f4ProcDelay().getIp7052f4NoOfTrans();
	}


	/**
	 *	Returns String value of ip7052f4NoOfTrans
	 *	@return ip7052f4NoOfTrans
	 */
	public char[]  getIp7052f4NoOfTransString() throws CFException {
	     return String.valueOf(ip7052f4MqApiLayout.getIp7052f4ProcDelay().getIp7052f4NoOfTransString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip7052f4NoOfTransIsNumeric()  throws CFException{
	    return ip7052f4MqApiLayout.getIp7052f4ProcDelay().ip7052f4NoOfTransIsNumeric();
	}

	/**
	 * 	Update Ip7052f4NoOfTrans with the passed value
	 *	@param number
	 */
	public void setIp7052f4NoOfTrans(long number)  throws CFException{
		ip7052f4MqApiLayout.getIp7052f4ProcDelay().setIp7052f4NoOfTrans(number);
	}
	

	
	/**
	 * 	Update Ip7052f4NoOfTrans with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp7052f4NoOfTrans(char[] value)  throws CFException {
		ip7052f4MqApiLayout.getIp7052f4ProcDelay().setIp7052f4NoOfTrans(value);
	}
	
	/**
	 * 	Update Ip7052f4NoOfTrans with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp7052f4NoOfTransString(char[] value)  throws CFException{
		ip7052f4MqApiLayout.getIp7052f4ProcDelay().setIp7052f4NoOfTrans(value);
	}	

	/**
	 *	Returns the value of reqHconn800
	 *	@return reqHconn800
	 */
	public int getReqHconn800() throws CFException {        
   		return queueVars800.getReqHconn800();
	}
	
	/**
	 * 	Update ReqHconn800 with the passed value
	 *	@param number
	 */
	public void setReqHconn800(int number)  throws CFException{
		queueVars800.setReqHconn800(number);
	}


	public void setReqHconn800(long number)  throws CFException{
		queueVars800.setReqHconn800((int)number);
	}


	/**
	 *	Returns the value of reqQmgrName800
	 *	@return reqQmgrName800
	 */
   public char[] getReqQmgrName800() throws CFException  {              
   		return queueVars800.getReqQmgrName800();
   }

  
	/**
	*  set variable reqQmgrName800
	*  @param value
	**/
   public void setReqQmgrName800(char[] value) throws CFException {
      queueVars800.setReqQmgrName800(value);
   } 

     /**
	 * 	Update ReqQmgrName800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setReqQmgrName800(char[] source, int sourceIndex) throws CFException {
      queueVars800.setReqQmgrName800(source, sourceIndex);
   	
   }
   
   public void setReqQmgrName800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      queueVars800.setReqQmgrName800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ReqQmgrName800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReqQmgrName800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      queueVars800.setReqQmgrName800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ReqQmgrName800 with another Field
	 *	@param value
	 */
   public void setReqQmgrName800(Field source) {
      queueVars800.setReqQmgrName800(source);
   }  
   
     /**
	 * 	Update ReqQmgrName800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setReqQmgrName800(Field source, int sourceIndex,int sourceLen) {
      queueVars800.setReqQmgrName800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ReqQmgrName800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReqQmgrName800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      queueVars800.setReqQmgrName800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of reqQName800
	 *	@return reqQName800
	 */
   public char[] getReqQName800() throws CFException  {              
   		return queueVars800.getReqQName800();
   }

  
	/**
	*  set variable reqQName800
	*  @param value
	**/
   public void setReqQName800(char[] value) throws CFException {
      queueVars800.setReqQName800(value);
   } 

     /**
	 * 	Update ReqQName800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setReqQName800(char[] source, int sourceIndex) throws CFException {
      queueVars800.setReqQName800(source, sourceIndex);
   	
   }
   
   public void setReqQName800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      queueVars800.setReqQName800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ReqQName800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReqQName800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      queueVars800.setReqQName800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ReqQName800 with another Field
	 *	@param value
	 */
   public void setReqQName800(Field source) {
      queueVars800.setReqQName800(source);
   }  
   
     /**
	 * 	Update ReqQName800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setReqQName800(Field source, int sourceIndex,int sourceLen) {
      queueVars800.setReqQName800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ReqQName800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReqQName800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      queueVars800.setReqQName800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip70521QName
	 *	@return ip70521QName
	 */
   public char[] getIp70521QName() throws CFException  {              
   		return ip70521MqApiLayout.getIp70521QName();
   }

  
	/**
	*  set variable ip70521QName
	*  @param value
	**/
   public void setIp70521QName(char[] value) throws CFException {
      ip70521MqApiLayout.setIp70521QName(value);
   } 

     /**
	 * 	Update Ip70521QName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521QName(char[] source, int sourceIndex) throws CFException {
      ip70521MqApiLayout.setIp70521QName(source, sourceIndex);
   	
   }
   
   public void setIp70521QName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70521MqApiLayout.setIp70521QName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70521QName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521QName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521QName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70521QName with another Field
	 *	@param value
	 */
   public void setIp70521QName(Field source) {
      ip70521MqApiLayout.setIp70521QName(source);
   }  
   
     /**
	 * 	Update Ip70521QName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521QName(Field source, int sourceIndex,int sourceLen) {
      ip70521MqApiLayout.setIp70521QName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70521QName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521QName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521QName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip70521Hobj
	 *	@return ip70521Hobj
	 */
	public int getIp70521Hobj() throws CFException {        
   		return ip70521MqApiLayout.getIp70521Hobj();
	}
	
	/**
	 * 	Update Ip70521Hobj with the passed value
	 *	@param number
	 */
	public void setIp70521Hobj(int number)  throws CFException{
		ip70521MqApiLayout.setIp70521Hobj(number);
	}


	public void setIp70521Hobj(long number)  throws CFException{
		ip70521MqApiLayout.setIp70521Hobj((int)number);
	}



        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip7052f4MqApiLayout.hashCode();
        str += ip7051f4Table.hashCode();
        str += queueVars800.hashCode();
        str += ip70521MqApiLayout.hashCode();
        str += fnsPayload.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public PopulateMqputFieldsOutCtx clone() {
        PopulateMqputFieldsOutCtx cloneObj = new PopulateMqputFieldsOutCtx();
        cloneObj.ip7052f4MqApiLayout = new Ip7052f4MqApiLayout();
        cloneObj.ip7052f4MqApiLayout.set(ip7052f4MqApiLayout.getClonedField());
        cloneObj.ip7051f4Table = new Ip7051f4Table();
        cloneObj.ip7051f4Table.set(ip7051f4Table.getClonedField());
        cloneObj.queueVars800 = new QueueVars800();
        cloneObj.queueVars800.set(queueVars800.getClonedField());
        cloneObj.ip70521MqApiLayout = new Ip70521MqApiLayout();
        cloneObj.ip70521MqApiLayout.set(ip70521MqApiLayout.getClonedField());
        cloneObj.fnsPayload = new FnsPayload();
        cloneObj.fnsPayload.set(fnsPayload.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public PopulateMqputFieldsOutCtx getPopulateMqputFieldsOutCtx() {
            return new PopulateMqputFieldsOutCtx();
    }
     public class MqputFraudTransInCtx implements Cloneable {
     QueueErrorMsg611 queueErrorMsg611 = Ip829010Ctx.this.getQueueErrorMsg611();
     CheckPutQueueGroup100 checkPutQueueGroup100 = Ip829010Ctx.this.getCheckPutQueueGroup100();
     Ip82921ErrMsgOut ip82921ErrMsgOut = Ip829010Ctx.this.getIp82921ErrMsgOut();
     Ip70521MqApiLayout ip70521MqApiLayout = Ip829010Ctx.this.getIp70521MqApiLayout();
     Ip70301IsFraudMqSrvActiveGroup ip70301IsFraudMqSrvActiveGroup = Ip829010Ctx.this.getIp70301IsFraudMqSrvActiveGroup();
     AbendPara900 abendPara900 = Ip829010Ctx.this.getAbendPara900();
     Work work = Ip829010Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip829010Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of queueErrorMsg611
	 *	@return queueErrorMsg611
	 */   
	 public QueueErrorMsg611 getQueueErrorMsg611() {
   	return queueErrorMsg611;
   }


	/**
	 *	Returns the value of ip70521ResnCd
	 *	@return ip70521ResnCd
	 */
	public int getIp70521ResnCd() throws CFException {        
   		return ip70521MqApiLayout.getIp70521ResnCd();
	}
	
	/**
	 * 	Update Ip70521ResnCd with the passed value
	 *	@param number
	 */
	public void setIp70521ResnCd(int number)  throws CFException{
		ip70521MqApiLayout.setIp70521ResnCd(number);
	}


	public void setIp70521ResnCd(long number)  throws CFException{
		ip70521MqApiLayout.setIp70521ResnCd((int)number);
	}


	/**
	 *	Returns the value of putQAbendCode300
	 *	@return putQAbendCode300
	 */
   public char[] getPutQAbendCode300() throws CFException  {              
   		return work.getPutQAbendCode300();
   }

  
	/**
	*  set variable putQAbendCode300
	*  @param value
	**/
   public void setPutQAbendCode300(char[] value) throws CFException {
      work.setPutQAbendCode300(value);
   } 

	/**
	 *	Test condition "Y" for isIp70301FraudMqActiveY88()
	 *	@return  Returns true if isIp70301FraudMqActiveY88() is "Y"
	 */
   public boolean isIp70301FraudMqActiveY88() throws CFException {
      return ip70301IsFraudMqSrvActiveGroup.isIp70301FraudMqActiveY88();
   }

	/**
	*  set values "Y"
	*/
   	public void setIp70301FraudMqActiveY88True()  throws CFException{  			
    	ip70301IsFraudMqSrvActiveGroup.setIp70301FraudMqActiveY88True();
   	}
	/**
	 *	Returns the value of paraName2610300
	 *	@return paraName2610300
	 */
   public char[] getParaName2610300() throws CFException  {              
   		return work.getParaName2610300();
   }

  
	/**
	*  set variable paraName2610300
	*  @param value
	**/
   public void setParaName2610300(char[] value) throws CFException {
      work.setParaName2610300(value);
   } 

	/**
	 *	Returns the value of ptrIp708010800
	 *	@return ptrIp708010800
	 */
   public char[] getPtrIp708010800() throws CFException  {              
   		return work.getPtrIp708010800();
   }

  
	/**
	*  set variable ptrIp708010800
	*  @param value
	**/
   public void setPtrIp708010800(char[] value) throws CFException {
      work.setPtrIp708010800(value);
   } 

	/**
	 *	Returns the value of mqputFailCount800
	 *	@return mqputFailCount800
	 */
	public int getMqputFailCount800() throws CFException {        
   		return work.getMqputFailCount800();
	}
	
	/**
	 * 	Update MqputFailCount800 with the passed value
	 *	@param number
	 */
	public void setMqputFailCount800(int number)  throws CFException{
		work.setMqputFailCount800(number);
	}


	public void setMqputFailCount800(long number)  throws CFException{
		work.setMqputFailCount800((int)number);
	}


	/**
	 *	Returns the value of mqputFailMsg300
	 *	@return mqputFailMsg300
	 */
   public char[] getMqputFailMsg300() throws CFException  {              
   		return work.getMqputFailMsg300();
   }

  
	/**
	*  set variable mqputFailMsg300
	*  @param value
	**/
   public void setMqputFailMsg300(char[] value) throws CFException {
      work.setMqputFailMsg300(value);
   } 

	/**
	 *	Returns the value of ip70521MqBypassSw
	 *	@return ip70521MqBypassSw
	 */
   public char[] getIp70521MqBypassSw() throws CFException  {              
   		return ip70521MqApiLayout.getIp70521MqBypassSw();
   }

  
	/**
	*  set variable ip70521MqBypassSw
	*  @param value
	**/
   public void setIp70521MqBypassSw(char[] value) throws CFException {
      ip70521MqApiLayout.setIp70521MqBypassSw(value);
   } 

     /**
	 * 	Update Ip70521MqBypassSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521MqBypassSw(char[] source, int sourceIndex) throws CFException {
      ip70521MqApiLayout.setIp70521MqBypassSw(source, sourceIndex);
   	
   }
   
   public void setIp70521MqBypassSw(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70521MqApiLayout.setIp70521MqBypassSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70521MqBypassSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MqBypassSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521MqBypassSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70521MqBypassSw with another Field
	 *	@param value
	 */
   public void setIp70521MqBypassSw(Field source) {
      ip70521MqApiLayout.setIp70521MqBypassSw(source);
   }  
   
     /**
	 * 	Update Ip70521MqBypassSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521MqBypassSw(Field source, int sourceIndex,int sourceLen) {
      ip70521MqApiLayout.setIp70521MqBypassSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70521MqBypassSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MqBypassSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521MqBypassSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of mqFailCode300
	 *	@return mqFailCode300
	 */
	public int getMqFailCode300() throws CFException {        
   		return work.getMqFailCode300();
	}
	
	/**
	 * 	Update MqFailCode300 with the passed value
	 *	@param number
	 */
	public void setMqFailCode300(int number)  throws CFException{
		work.setMqFailCode300(number);
	}


	public void setMqFailCode300(long number)  throws CFException{
		work.setMqFailCode300((int)number);
	}


	/**
	 *	Test condition "Y" for isIp70521MqReturnY88()
	 *	@return  Returns true if isIp70521MqReturnY88() is "Y"
	 */
   public boolean isIp70521MqReturnY88() throws CFException {
      return ip70521MqApiLayout.isIp70521MqReturnY88();
   }

	/**
	*  set values "Y"
	*/
   	public void setIp70521MqReturnY88True()  throws CFException{  			
    	ip70521MqApiLayout.setIp70521MqReturnY88True();
   	}
	/**
	 *	Returns the value of valueN300
	 *	@return valueN300
	 */
   public char[] getValueN300() throws CFException  {              
   		return work.getValueN300();
   }

  
	/**
	*  set variable valueN300
	*  @param value
	**/
   public void setValueN300(char[] value) throws CFException {
      work.setValueN300(value);
   } 

	/**
	 *	Returns the value of ip70521CompCd
	 *	@return ip70521CompCd
	 */
	public int getIp70521CompCd() throws CFException {        
   		return ip70521MqApiLayout.getIp70521CompCd();
	}
	
	/**
	 * 	Update Ip70521CompCd with the passed value
	 *	@param number
	 */
	public void setIp70521CompCd(int number)  throws CFException{
		ip70521MqApiLayout.setIp70521CompCd(number);
	}


	public void setIp70521CompCd(long number)  throws CFException{
		ip70521MqApiLayout.setIp70521CompCd((int)number);
	}



        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public MqputFraudTransOutCtx getMqputFraudTransOutCtx() {
            return new MqputFraudTransOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += queueErrorMsg611.hashCode();
        str += checkPutQueueGroup100.hashCode();
        str += ip82921ErrMsgOut.hashCode();
        str += ip70521MqApiLayout.hashCode();
        str += ip70301IsFraudMqSrvActiveGroup.hashCode();
        str += abendPara900.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public MqputFraudTransInCtx clone() {
        MqputFraudTransInCtx cloneObj = new MqputFraudTransInCtx();
        cloneObj.queueErrorMsg611 = new QueueErrorMsg611();
        cloneObj.queueErrorMsg611.set(queueErrorMsg611.getClonedField());
        cloneObj.checkPutQueueGroup100 = new CheckPutQueueGroup100();
        cloneObj.checkPutQueueGroup100.set(checkPutQueueGroup100.getClonedField());
        cloneObj.ip82921ErrMsgOut = new Ip82921ErrMsgOut();
        cloneObj.ip82921ErrMsgOut.set(ip82921ErrMsgOut.getClonedField());
        cloneObj.ip70521MqApiLayout = new Ip70521MqApiLayout();
        cloneObj.ip70521MqApiLayout.set(ip70521MqApiLayout.getClonedField());
        cloneObj.ip70301IsFraudMqSrvActiveGroup = new Ip70301IsFraudMqSrvActiveGroup();
        cloneObj.ip70301IsFraudMqSrvActiveGroup.set(ip70301IsFraudMqSrvActiveGroup.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public MqputFraudTransInCtx getMqputFraudTransInCtx() {
            return new MqputFraudTransInCtx();
    }
     public class MqputFraudTransOutCtx implements Cloneable {
     QueueErrorMsg611 queueErrorMsg611 = Ip829010Ctx.this.getQueueErrorMsg611();
     CheckPutQueueGroup100 checkPutQueueGroup100 = Ip829010Ctx.this.getCheckPutQueueGroup100();
     Ip82921ErrMsgOut ip82921ErrMsgOut = Ip829010Ctx.this.getIp82921ErrMsgOut();
     Ip70521MqApiLayout ip70521MqApiLayout = Ip829010Ctx.this.getIp70521MqApiLayout();
     Ip70301IsFraudMqSrvActiveGroup ip70301IsFraudMqSrvActiveGroup = Ip829010Ctx.this.getIp70301IsFraudMqSrvActiveGroup();
     AbendPara900 abendPara900 = Ip829010Ctx.this.getAbendPara900();
     Work work = Ip829010Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip829010Ctx.this.getAbendMessage900();

	/**
	 *	Test condition "ERROR PUTTING MESSAGE INTO QUEUE " for isErrPut88611()
	 *	@return  Returns true if isErrPut88611() is "ERROR PUTTING MESSAGE INTO QUEUE "
	 */
   public boolean isErrPut88611() throws CFException {
      return queueErrorMsg611.isErrPut88611();
   }

	/**
	*  set values "ERROR PUTTING MESSAGE INTO QUEUE "
	*/
   	public void setErrPut88611True()  throws CFException{  			
    	queueErrorMsg611.setErrPut88611True();
   	}
	/**
	 *	Returns the value of queueErrorMsg611
	 *	@return queueErrorMsg611
	 */   
	 public QueueErrorMsg611 getQueueErrorMsg611() {
   	return queueErrorMsg611;
   }


	/**
	 *	Returns the value of ip70521ResnCd
	 *	@return ip70521ResnCd
	 */
	public int getIp70521ResnCd() throws CFException {        
   		return ip70521MqApiLayout.getIp70521ResnCd();
	}
	
	/**
	 * 	Update Ip70521ResnCd with the passed value
	 *	@param number
	 */
	public void setIp70521ResnCd(int number)  throws CFException{
		ip70521MqApiLayout.setIp70521ResnCd(number);
	}


	public void setIp70521ResnCd(long number)  throws CFException{
		ip70521MqApiLayout.setIp70521ResnCd((int)number);
	}


	/**
	 *	Returns the value of ip82921ErrMsg
	 *	@return ip82921ErrMsg
	 */
   public char[] getIp82921ErrMsg() throws CFException  {              
   		return ip82921ErrMsgOut.getIp82921ErrMsg();
   }

  
	/**
	*  set variable ip82921ErrMsg
	*  @param value
	**/
   public void setIp82921ErrMsg(char[] value) throws CFException {
      ip82921ErrMsgOut.setIp82921ErrMsg(value);
   } 

     /**
	 * 	Update Ip82921ErrMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921ErrMsg(char[] source, int sourceIndex) throws CFException {
      ip82921ErrMsgOut.setIp82921ErrMsg(source, sourceIndex);
   	
   }
   
   public void setIp82921ErrMsg(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip82921ErrMsgOut.setIp82921ErrMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip82921ErrMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ErrMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip82921ErrMsgOut.setIp82921ErrMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip82921ErrMsg with another Field
	 *	@param value
	 */
   public void setIp82921ErrMsg(Field source) {
      ip82921ErrMsgOut.setIp82921ErrMsg(source);
   }  
   
     /**
	 * 	Update Ip82921ErrMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921ErrMsg(Field source, int sourceIndex,int sourceLen) {
      ip82921ErrMsgOut.setIp82921ErrMsg(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip82921ErrMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ErrMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip82921ErrMsgOut.setIp82921ErrMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of badReasonCode611
	 *	@return badReasonCode611
	 */
	public long getBadReasonCode611() throws CFException {
   		return queueErrorMsg611.getBadReasonCode611();
	}


	/**
	 *	Returns String value of badReasonCode611
	 *	@return badReasonCode611
	 */
	public char[]  getBadReasonCode611String() throws CFException {
	     return String.valueOf(queueErrorMsg611.getBadReasonCode611String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean badReasonCode611IsNumeric()  throws CFException{
	    return queueErrorMsg611.badReasonCode611IsNumeric();
	}

	/**
	 * 	Update BadReasonCode611 with the passed value
	 *	@param number
	 */
	public void setBadReasonCode611(long number)  throws CFException{
		queueErrorMsg611.setBadReasonCode611(number);
	}
	

	
	/**
	 * 	Update BadReasonCode611 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBadReasonCode611(char[] value)  throws CFException {
		queueErrorMsg611.setBadReasonCode611(value);
	}
	
	/**
	 * 	Update BadReasonCode611 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBadReasonCode611String(char[] value)  throws CFException{
		queueErrorMsg611.setBadReasonCode611(value);
	}	

	/**
	 *	Returns the value of putQAbendCode300
	 *	@return putQAbendCode300
	 */
   public char[] getPutQAbendCode300() throws CFException  {              
   		return work.getPutQAbendCode300();
   }

  
	/**
	*  set variable putQAbendCode300
	*  @param value
	**/
   public void setPutQAbendCode300(char[] value) throws CFException {
      work.setPutQAbendCode300(value);
   } 

	/**
	 *	Test condition "PUT " for isIp70521Put88()
	 *	@return  Returns true if isIp70521Put88() is "PUT "
	 */
   public boolean isIp70521Put88() throws CFException {
      return ip70521MqApiLayout.isIp70521Put88();
   }

	/**
	*  set values "PUT "
	*/
   	public void setIp70521Put88True()  throws CFException{  			
    	ip70521MqApiLayout.setIp70521Put88True();
   	}
	/**
	 *	Returns the value of paraName2610300
	 *	@return paraName2610300
	 */
   public char[] getParaName2610300() throws CFException  {              
   		return work.getParaName2610300();
   }

  
	/**
	*  set variable paraName2610300
	*  @param value
	**/
   public void setParaName2610300(char[] value) throws CFException {
      work.setParaName2610300(value);
   } 

	/**
	 *	Returns the value of mqputFailCount800
	 *	@return mqputFailCount800
	 */
	public int getMqputFailCount800() throws CFException {        
   		return work.getMqputFailCount800();
	}
	
	/**
	 * 	Update MqputFailCount800 with the passed value
	 *	@param number
	 */
	public void setMqputFailCount800(int number)  throws CFException{
		work.setMqputFailCount800(number);
	}


	public void setMqputFailCount800(long number)  throws CFException{
		work.setMqputFailCount800((int)number);
	}


	/**
	 *	Returns the value of mqputFailMsg300
	 *	@return mqputFailMsg300
	 */
   public char[] getMqputFailMsg300() throws CFException  {              
   		return work.getMqputFailMsg300();
   }

  
	/**
	*  set variable mqputFailMsg300
	*  @param value
	**/
   public void setMqputFailMsg300(char[] value) throws CFException {
      work.setMqputFailMsg300(value);
   } 

	/**
	 *	Test condition "W" for isPutFaaFac488100()
	 *	@return  Returns true if isPutFaaFac488100() is "W"
	 */
   public boolean isPutFaaFac488100() throws CFException {
      return checkPutQueueGroup100.isPutFaaFac488100();
   }

	/**
	*  set values "W"
	*/
   	public void setPutFaaFac488100True()  throws CFException{  			
    	checkPutQueueGroup100.setPutFaaFac488100True();
   	}
	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return abendMessage900.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      abendMessage900.setAbendText900(value);
   } 

     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendText900(source, sourceIndex);
   	
   }
   
   public void setAbendText900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendText900 with another Field
	 *	@param value
	 */
   public void setAbendText900(Field source) {
      abendMessage900.setAbendText900(source);
   }  
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendParaName900
	 *	@return abendParaName900
	 */
   public char[] getAbendParaName900() throws CFException  {              
   		return abendPara900.getAbendParaName900();
   }

  
	/**
	*  set variable abendParaName900
	*  @param value
	**/
   public void setAbendParaName900(char[] value) throws CFException {
      abendPara900.setAbendParaName900(value);
   } 

     /**
	 * 	Update AbendParaName900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendParaName900(char[] source, int sourceIndex) throws CFException {
      abendPara900.setAbendParaName900(source, sourceIndex);
   	
   }
   
   public void setAbendParaName900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendParaName900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendParaName900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendParaName900 with another Field
	 *	@param value
	 */
   public void setAbendParaName900(Field source) {
      abendPara900.setAbendParaName900(source);
   }  
   
     /**
	 * 	Update AbendParaName900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendParaName900(Field source, int sourceIndex,int sourceLen) {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendParaName900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendParaName900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += queueErrorMsg611.hashCode();
        str += checkPutQueueGroup100.hashCode();
        str += ip82921ErrMsgOut.hashCode();
        str += ip70521MqApiLayout.hashCode();
        str += ip70301IsFraudMqSrvActiveGroup.hashCode();
        str += abendPara900.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public MqputFraudTransOutCtx clone() {
        MqputFraudTransOutCtx cloneObj = new MqputFraudTransOutCtx();
        cloneObj.queueErrorMsg611 = new QueueErrorMsg611();
        cloneObj.queueErrorMsg611.set(queueErrorMsg611.getClonedField());
        cloneObj.checkPutQueueGroup100 = new CheckPutQueueGroup100();
        cloneObj.checkPutQueueGroup100.set(checkPutQueueGroup100.getClonedField());
        cloneObj.ip82921ErrMsgOut = new Ip82921ErrMsgOut();
        cloneObj.ip82921ErrMsgOut.set(ip82921ErrMsgOut.getClonedField());
        cloneObj.ip70521MqApiLayout = new Ip70521MqApiLayout();
        cloneObj.ip70521MqApiLayout.set(ip70521MqApiLayout.getClonedField());
        cloneObj.ip70301IsFraudMqSrvActiveGroup = new Ip70301IsFraudMqSrvActiveGroup();
        cloneObj.ip70301IsFraudMqSrvActiveGroup.set(ip70301IsFraudMqSrvActiveGroup.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public MqputFraudTransOutCtx getMqputFraudTransOutCtx() {
            return new MqputFraudTransOutCtx();
    }
     public class SetMqGetOutCtx implements Cloneable {
     GetBrowseCallsGroup100 getBrowseCallsGroup100 = Ip829010Ctx.this.getGetBrowseCallsGroup100();

	/**
	 *	Test condition "B" for isNextBrowse88100()
	 *	@return  Returns true if isNextBrowse88100() is "B"
	 */
   public boolean isNextBrowse88100() throws CFException {
      return getBrowseCallsGroup100.isNextBrowse88100();
   }

	/**
	*  set values "B"
	*/
   	public void setNextBrowse88100True()  throws CFException{  			
    	getBrowseCallsGroup100.setNextBrowse88100True();
   	}

        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += getBrowseCallsGroup100.hashCode();
       return str.hashCode();
    }

    public SetMqGetOutCtx clone() {
        SetMqGetOutCtx cloneObj = new SetMqGetOutCtx();
        cloneObj.getBrowseCallsGroup100 = new GetBrowseCallsGroup100();
        cloneObj.getBrowseCallsGroup100.set(getBrowseCallsGroup100.getClonedField());
        return cloneObj;
    }

    }

    public SetMqGetOutCtx getSetMqGetOutCtx() {
            return new SetMqGetOutCtx();
    }
     public class WriteErrFileSys201InCtx implements Cloneable {
     Ip82921ErrMsgOut ip82921ErrMsgOut = Ip829010Ctx.this.getIp82921ErrMsgOut();
     Ip70521MqApiLayout ip70521MqApiLayout = Ip829010Ctx.this.getIp70521MqApiLayout();
     AbendPara900 abendPara900 = Ip829010Ctx.this.getAbendPara900();
     ErrorMsg6003011 errorMsg6003011 = Ip829010Ctx.this.getErrorMsg6003011();
     Work work = Ip829010Ctx.this.getWork();
     Sys201ErrMsgOut sys201ErrMsgOut = Ip829010Ctx.this.getSys201ErrMsgOut();
     AbendMessage900 abendMessage900 = Ip829010Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of ip70521MsgBuffer
	 *	@return ip70521MsgBuffer
	 */
   public char[] getIp70521MsgBuffer() throws CFException  {              
   		return ip70521MqApiLayout.getIp70521MsgBuffer();
   }

  
	/**
	*  set variable ip70521MsgBuffer
	*  @param value
	**/
   public void setIp70521MsgBuffer(char[] value) throws CFException {
      ip70521MqApiLayout.setIp70521MsgBuffer(value);
   } 

     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521MsgBuffer(char[] source, int sourceIndex) throws CFException {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex);
   	
   }
   
   public void setIp70521MsgBuffer(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MsgBuffer(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70521MsgBuffer with another Field
	 *	@param value
	 */
   public void setIp70521MsgBuffer(Field source) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source);
   }  
   
     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521MsgBuffer(Field source, int sourceIndex,int sourceLen) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MsgBuffer(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of paraName2800300
	 *	@return paraName2800300
	 */
   public char[] getParaName2800300() throws CFException  {              
   		return work.getParaName2800300();
   }

  
	/**
	*  set variable paraName2800300
	*  @param value
	**/
   public void setParaName2800300(char[] value) throws CFException {
      work.setParaName2800300(value);
   } 

	/**
	 *	Returns the value of ip70521TargetQName
	 *	@return ip70521TargetQName
	 */
   public char[] getIp70521TargetQName() throws CFException  {              
   		return ip70521MqApiLayout.getIp70521TargetQName();
   }

  
	/**
	*  set variable ip70521TargetQName
	*  @param value
	**/
   public void setIp70521TargetQName(char[] value) throws CFException {
      ip70521MqApiLayout.setIp70521TargetQName(value);
   } 

     /**
	 * 	Update Ip70521TargetQName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521TargetQName(char[] source, int sourceIndex) throws CFException {
      ip70521MqApiLayout.setIp70521TargetQName(source, sourceIndex);
   	
   }
   
   public void setIp70521TargetQName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70521MqApiLayout.setIp70521TargetQName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70521TargetQName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521TargetQName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521TargetQName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70521TargetQName with another Field
	 *	@param value
	 */
   public void setIp70521TargetQName(Field source) {
      ip70521MqApiLayout.setIp70521TargetQName(source);
   }  
   
     /**
	 * 	Update Ip70521TargetQName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521TargetQName(Field source, int sourceIndex,int sourceLen) {
      ip70521MqApiLayout.setIp70521TargetQName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70521TargetQName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521TargetQName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521TargetQName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip82921ErrMsgOut
	 *	@return ip82921ErrMsgOut
	 */   
	 public Ip82921ErrMsgOut getIp82921ErrMsgOut() {
   	return ip82921ErrMsgOut;
   }


	/**
	 *	Returns the value of ip70521TargetQmgrName
	 *	@return ip70521TargetQmgrName
	 */
   public char[] getIp70521TargetQmgrName() throws CFException  {              
   		return ip70521MqApiLayout.getIp70521TargetQmgrName();
   }

  
	/**
	*  set variable ip70521TargetQmgrName
	*  @param value
	**/
   public void setIp70521TargetQmgrName(char[] value) throws CFException {
      ip70521MqApiLayout.setIp70521TargetQmgrName(value);
   } 

     /**
	 * 	Update Ip70521TargetQmgrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521TargetQmgrName(char[] source, int sourceIndex) throws CFException {
      ip70521MqApiLayout.setIp70521TargetQmgrName(source, sourceIndex);
   	
   }
   
   public void setIp70521TargetQmgrName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70521MqApiLayout.setIp70521TargetQmgrName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70521TargetQmgrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521TargetQmgrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521TargetQmgrName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70521TargetQmgrName with another Field
	 *	@param value
	 */
   public void setIp70521TargetQmgrName(Field source) {
      ip70521MqApiLayout.setIp70521TargetQmgrName(source);
   }  
   
     /**
	 * 	Update Ip70521TargetQmgrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521TargetQmgrName(Field source, int sourceIndex,int sourceLen) {
      ip70521MqApiLayout.setIp70521TargetQmgrName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70521TargetQmgrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521TargetQmgrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521TargetQmgrName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of value1300
	 *	@return value1300
	 */
	public short getValue1300() throws CFException {        
   		return work.getValue1300();
	}
	
	/**
	 * 	Update Value1300 with the passed value
	 *	@param number
	 */
	public void setValue1300(short number)  throws CFException{
		work.setValue1300(number);
	}

	public void setValue1300(int number)  throws CFException{
		work.setValue1300((short)number);
	}

	public void setValue1300(long number)  throws CFException{
		work.setValue1300((short)number);
	}



	/**
	 *	Returns the value of ip70521ResnCd
	 *	@return ip70521ResnCd
	 */
	public int getIp70521ResnCd() throws CFException {        
   		return ip70521MqApiLayout.getIp70521ResnCd();
	}
	
	/**
	 * 	Update Ip70521ResnCd with the passed value
	 *	@param number
	 */
	public void setIp70521ResnCd(int number)  throws CFException{
		ip70521MqApiLayout.setIp70521ResnCd(number);
	}


	public void setIp70521ResnCd(long number)  throws CFException{
		ip70521MqApiLayout.setIp70521ResnCd((int)number);
	}


	/**
	 *	Returns the value of end800
	 *	@return end800
	 */
	public int getEnd800() throws CFException {        
   		return work.getEnd800();
	}
	
	/**
	 * 	Update End800 with the passed value
	 *	@param number
	 */
	public void setEnd800(int number)  throws CFException{
		work.setEnd800(number);
	}


	public void setEnd800(long number)  throws CFException{
		work.setEnd800((int)number);
	}


	/**
	 *	Returns the value of ip70521RequestCd
	 *	@return ip70521RequestCd
	 */
   public char[] getIp70521RequestCd() throws CFException  {              
   		return ip70521MqApiLayout.getIp70521RequestCd();
   }

  
	/**
	*  set variable ip70521RequestCd
	*  @param value
	**/
   public void setIp70521RequestCd(char[] value) throws CFException {
      ip70521MqApiLayout.setIp70521RequestCd(value);
   } 

     /**
	 * 	Update Ip70521RequestCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521RequestCd(char[] source, int sourceIndex) throws CFException {
      ip70521MqApiLayout.setIp70521RequestCd(source, sourceIndex);
   	
   }
   
   public void setIp70521RequestCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70521MqApiLayout.setIp70521RequestCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70521RequestCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521RequestCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521RequestCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70521RequestCd with another Field
	 *	@param value
	 */
   public void setIp70521RequestCd(Field source) {
      ip70521MqApiLayout.setIp70521RequestCd(source);
   }  
   
     /**
	 * 	Update Ip70521RequestCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521RequestCd(Field source, int sourceIndex,int sourceLen) {
      ip70521MqApiLayout.setIp70521RequestCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70521RequestCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521RequestCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521RequestCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of errorMsg6003011
	 *	@return errorMsg6003011
	 */   
	 public ErrorMsg6003011 getErrorMsg6003011() {
   	return errorMsg6003011;
   }


	/**
	 *	Returns the value of ip70521MqApiLayout
	 *	@return ip70521MqApiLayout
	 */   
	 public Ip70521MqApiLayout getIp70521MqApiLayout() {
   	return ip70521MqApiLayout;
   }


	/**
	 *	Returns the value of abendCode3003011
	 *	@return abendCode3003011
	 */
   public char[] getAbendCode3003011() throws CFException  {              
   		return work.getAbendCode3003011();
   }

  
	/**
	*  set variable abendCode3003011
	*  @param value
	**/
   public void setAbendCode3003011(char[] value) throws CFException {
      work.setAbendCode3003011(value);
   } 

	/**
	 *	Returns the value of sys201300
	 *	@return sys201300
	 */
   public char[] getSys201300() throws CFException  {              
   		return work.getSys201300();
   }

  
	/**
	*  set variable sys201300
	*  @param value
	**/
   public void setSys201300(char[] value) throws CFException {
      work.setSys201300(value);
   } 

	/**
	 *	Returns the value of sys201ErrMsgOut
	 *	@return sys201ErrMsgOut
	 */   
	 public Sys201ErrMsgOut getSys201ErrMsgOut() {
   	return sys201ErrMsgOut;
   }


	/**
	 *	Returns the value of ip70521CompCd
	 *	@return ip70521CompCd
	 */
	public int getIp70521CompCd() throws CFException {        
   		return ip70521MqApiLayout.getIp70521CompCd();
	}
	
	/**
	 * 	Update Ip70521CompCd with the passed value
	 *	@param number
	 */
	public void setIp70521CompCd(int number)  throws CFException{
		ip70521MqApiLayout.setIp70521CompCd(number);
	}


	public void setIp70521CompCd(long number)  throws CFException{
		ip70521MqApiLayout.setIp70521CompCd((int)number);
	}



        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public WriteErrFileSys201OutCtx getWriteErrFileSys201OutCtx() {
            return new WriteErrFileSys201OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip82921ErrMsgOut.hashCode();
        str += ip70521MqApiLayout.hashCode();
        str += abendPara900.hashCode();
        str += errorMsg6003011.hashCode();
        str += work.hashCode();
        str += sys201ErrMsgOut.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public WriteErrFileSys201InCtx clone() {
        WriteErrFileSys201InCtx cloneObj = new WriteErrFileSys201InCtx();
        cloneObj.ip82921ErrMsgOut = new Ip82921ErrMsgOut();
        cloneObj.ip82921ErrMsgOut.set(ip82921ErrMsgOut.getClonedField());
        cloneObj.ip70521MqApiLayout = new Ip70521MqApiLayout();
        cloneObj.ip70521MqApiLayout.set(ip70521MqApiLayout.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.errorMsg6003011 = new ErrorMsg6003011();
        cloneObj.errorMsg6003011.set(errorMsg6003011.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys201ErrMsgOut = new Sys201ErrMsgOut();
        cloneObj.sys201ErrMsgOut.set(sys201ErrMsgOut.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public WriteErrFileSys201InCtx getWriteErrFileSys201InCtx() {
            return new WriteErrFileSys201InCtx();
    }
     public class WriteErrFileSys201OutCtx implements Cloneable {
     Ip82921ErrMsgOut ip82921ErrMsgOut = Ip829010Ctx.this.getIp82921ErrMsgOut();
     Ip70521MqApiLayout ip70521MqApiLayout = Ip829010Ctx.this.getIp70521MqApiLayout();
     AbendPara900 abendPara900 = Ip829010Ctx.this.getAbendPara900();
     ErrorMsg6003011 errorMsg6003011 = Ip829010Ctx.this.getErrorMsg6003011();
     Work work = Ip829010Ctx.this.getWork();
     Sys201ErrMsgOut sys201ErrMsgOut = Ip829010Ctx.this.getSys201ErrMsgOut();
     AbendMessage900 abendMessage900 = Ip829010Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of ip70521TargetQName
	 *	@return ip70521TargetQName
	 */
   public char[] getIp70521TargetQName() throws CFException  {              
   		return ip70521MqApiLayout.getIp70521TargetQName();
   }

  
	/**
	*  set variable ip70521TargetQName
	*  @param value
	**/
   public void setIp70521TargetQName(char[] value) throws CFException {
      ip70521MqApiLayout.setIp70521TargetQName(value);
   } 

     /**
	 * 	Update Ip70521TargetQName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521TargetQName(char[] source, int sourceIndex) throws CFException {
      ip70521MqApiLayout.setIp70521TargetQName(source, sourceIndex);
   	
   }
   
   public void setIp70521TargetQName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70521MqApiLayout.setIp70521TargetQName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70521TargetQName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521TargetQName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521TargetQName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70521TargetQName with another Field
	 *	@param value
	 */
   public void setIp70521TargetQName(Field source) {
      ip70521MqApiLayout.setIp70521TargetQName(source);
   }  
   
     /**
	 * 	Update Ip70521TargetQName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521TargetQName(Field source, int sourceIndex,int sourceLen) {
      ip70521MqApiLayout.setIp70521TargetQName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70521TargetQName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521TargetQName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521TargetQName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of value1300
	 *	@return value1300
	 */
	public short getValue1300() throws CFException {        
   		return work.getValue1300();
	}
	
	/**
	 * 	Update Value1300 with the passed value
	 *	@param number
	 */
	public void setValue1300(short number)  throws CFException{
		work.setValue1300(number);
	}

	public void setValue1300(int number)  throws CFException{
		work.setValue1300((short)number);
	}

	public void setValue1300(long number)  throws CFException{
		work.setValue1300((short)number);
	}



	/**
	 *	Returns the value of end800
	 *	@return end800
	 */
	public int getEnd800() throws CFException {        
   		return work.getEnd800();
	}
	
	/**
	 * 	Update End800 with the passed value
	 *	@param number
	 */
	public void setEnd800(int number)  throws CFException{
		work.setEnd800(number);
	}


	public void setEnd800(long number)  throws CFException{
		work.setEnd800((int)number);
	}


	/**
	 *	Returns the value of fileDd6003011
	 *	@return fileDd6003011
	 */
   public char[] getFileDd6003011() throws CFException  {              
   		return errorMsg6003011.getFileDd6003011();
   }

  
	/**
	*  set variable fileDd6003011
	*  @param value
	**/
   public void setFileDd6003011(char[] value) throws CFException {
      errorMsg6003011.setFileDd6003011(value);
   } 

     /**
	 * 	Update FileDd6003011 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileDd6003011(char[] source, int sourceIndex) throws CFException {
      errorMsg6003011.setFileDd6003011(source, sourceIndex);
   	
   }
   
   public void setFileDd6003011(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      errorMsg6003011.setFileDd6003011(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FileDd6003011 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileDd6003011(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      errorMsg6003011.setFileDd6003011(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FileDd6003011 with another Field
	 *	@param value
	 */
   public void setFileDd6003011(Field source) {
      errorMsg6003011.setFileDd6003011(source);
   }  
   
     /**
	 * 	Update FileDd6003011 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileDd6003011(Field source, int sourceIndex,int sourceLen) {
      errorMsg6003011.setFileDd6003011(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FileDd6003011 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileDd6003011(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      errorMsg6003011.setFileDd6003011(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of errorMsg6003011
	 *	@return errorMsg6003011
	 */   
	 public ErrorMsg6003011 getErrorMsg6003011() {
   	return errorMsg6003011;
   }


	/**
	 *	Returns the value of sys201Status800
	 *	@return sys201Status800
	 */
   public char[] getSys201Status800() throws CFException  {              
   		return work.getSys201Status800();
   }

  
	/**
	*  set variable sys201Status800
	*  @param value
	**/
   public void setSys201Status800(char[] value) throws CFException {
      work.setSys201Status800(value);
   } 

	/**
	 *	Returns the value of ip82921ErrTargetQmgrName
	 *	@return ip82921ErrTargetQmgrName
	 */
   public char[] getIp82921ErrTargetQmgrName() throws CFException  {              
   		return ip82921ErrMsgOut.getIp82921ErrTargetQmgrName();
   }

  
	/**
	*  set variable ip82921ErrTargetQmgrName
	*  @param value
	**/
   public void setIp82921ErrTargetQmgrName(char[] value) throws CFException {
      ip82921ErrMsgOut.setIp82921ErrTargetQmgrName(value);
   } 

     /**
	 * 	Update Ip82921ErrTargetQmgrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921ErrTargetQmgrName(char[] source, int sourceIndex) throws CFException {
      ip82921ErrMsgOut.setIp82921ErrTargetQmgrName(source, sourceIndex);
   	
   }
   
   public void setIp82921ErrTargetQmgrName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip82921ErrMsgOut.setIp82921ErrTargetQmgrName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip82921ErrTargetQmgrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ErrTargetQmgrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip82921ErrMsgOut.setIp82921ErrTargetQmgrName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip82921ErrTargetQmgrName with another Field
	 *	@param value
	 */
   public void setIp82921ErrTargetQmgrName(Field source) {
      ip82921ErrMsgOut.setIp82921ErrTargetQmgrName(source);
   }  
   
     /**
	 * 	Update Ip82921ErrTargetQmgrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921ErrTargetQmgrName(Field source, int sourceIndex,int sourceLen) {
      ip82921ErrMsgOut.setIp82921ErrTargetQmgrName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip82921ErrTargetQmgrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ErrTargetQmgrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip82921ErrMsgOut.setIp82921ErrTargetQmgrName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip82921ErrTargetQName
	 *	@return ip82921ErrTargetQName
	 */
   public char[] getIp82921ErrTargetQName() throws CFException  {              
   		return ip82921ErrMsgOut.getIp82921ErrTargetQName();
   }

  
	/**
	*  set variable ip82921ErrTargetQName
	*  @param value
	**/
   public void setIp82921ErrTargetQName(char[] value) throws CFException {
      ip82921ErrMsgOut.setIp82921ErrTargetQName(value);
   } 

     /**
	 * 	Update Ip82921ErrTargetQName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921ErrTargetQName(char[] source, int sourceIndex) throws CFException {
      ip82921ErrMsgOut.setIp82921ErrTargetQName(source, sourceIndex);
   	
   }
   
   public void setIp82921ErrTargetQName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip82921ErrMsgOut.setIp82921ErrTargetQName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip82921ErrTargetQName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ErrTargetQName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip82921ErrMsgOut.setIp82921ErrTargetQName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip82921ErrTargetQName with another Field
	 *	@param value
	 */
   public void setIp82921ErrTargetQName(Field source) {
      ip82921ErrMsgOut.setIp82921ErrTargetQName(source);
   }  
   
     /**
	 * 	Update Ip82921ErrTargetQName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921ErrTargetQName(Field source, int sourceIndex,int sourceLen) {
      ip82921ErrMsgOut.setIp82921ErrTargetQName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip82921ErrTargetQName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ErrTargetQName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip82921ErrMsgOut.setIp82921ErrTargetQName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fileStat6003011
	 *	@return fileStat6003011
	 */
   public char[] getFileStat6003011() throws CFException  {              
   		return errorMsg6003011.getFileStat6003011();
   }

  
	/**
	*  set variable fileStat6003011
	*  @param value
	**/
   public void setFileStat6003011(char[] value) throws CFException {
      errorMsg6003011.setFileStat6003011(value);
   } 

     /**
	 * 	Update FileStat6003011 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileStat6003011(char[] source, int sourceIndex) throws CFException {
      errorMsg6003011.setFileStat6003011(source, sourceIndex);
   	
   }
   
   public void setFileStat6003011(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      errorMsg6003011.setFileStat6003011(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FileStat6003011 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileStat6003011(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      errorMsg6003011.setFileStat6003011(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FileStat6003011 with another Field
	 *	@param value
	 */
   public void setFileStat6003011(Field source) {
      errorMsg6003011.setFileStat6003011(source);
   }  
   
     /**
	 * 	Update FileStat6003011 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileStat6003011(Field source, int sourceIndex,int sourceLen) {
      errorMsg6003011.setFileStat6003011(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FileStat6003011 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileStat6003011(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      errorMsg6003011.setFileStat6003011(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendParaName900
	 *	@return abendParaName900
	 */
   public char[] getAbendParaName900() throws CFException  {              
   		return abendPara900.getAbendParaName900();
   }

  
	/**
	*  set variable abendParaName900
	*  @param value
	**/
   public void setAbendParaName900(char[] value) throws CFException {
      abendPara900.setAbendParaName900(value);
   } 

     /**
	 * 	Update AbendParaName900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendParaName900(char[] source, int sourceIndex) throws CFException {
      abendPara900.setAbendParaName900(source, sourceIndex);
   	
   }
   
   public void setAbendParaName900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendParaName900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendParaName900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendParaName900 with another Field
	 *	@param value
	 */
   public void setAbendParaName900(Field source) {
      abendPara900.setAbendParaName900(source);
   }  
   
     /**
	 * 	Update AbendParaName900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendParaName900(Field source, int sourceIndex,int sourceLen) {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendParaName900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendParaName900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys201ErrMsgOut
	 *	@return sys201ErrMsgOut
	 */   
	 public Sys201ErrMsgOut getSys201ErrMsgOut() {
   	return sys201ErrMsgOut;
   }


	/**
	 *	Returns the value of ip70521CompCd
	 *	@return ip70521CompCd
	 */
	public int getIp70521CompCd() throws CFException {        
   		return ip70521MqApiLayout.getIp70521CompCd();
	}
	
	/**
	 * 	Update Ip70521CompCd with the passed value
	 *	@param number
	 */
	public void setIp70521CompCd(int number)  throws CFException{
		ip70521MqApiLayout.setIp70521CompCd(number);
	}


	public void setIp70521CompCd(long number)  throws CFException{
		ip70521MqApiLayout.setIp70521CompCd((int)number);
	}


	/**
	 *	Returns the value of ip70521MsgBuffer
	 *	@return ip70521MsgBuffer
	 */
   public char[] getIp70521MsgBuffer() throws CFException  {              
   		return ip70521MqApiLayout.getIp70521MsgBuffer();
   }

  
	/**
	*  set variable ip70521MsgBuffer
	*  @param value
	**/
   public void setIp70521MsgBuffer(char[] value) throws CFException {
      ip70521MqApiLayout.setIp70521MsgBuffer(value);
   } 

     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521MsgBuffer(char[] source, int sourceIndex) throws CFException {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex);
   	
   }
   
   public void setIp70521MsgBuffer(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MsgBuffer(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70521MsgBuffer with another Field
	 *	@param value
	 */
   public void setIp70521MsgBuffer(Field source) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source);
   }  
   
     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521MsgBuffer(Field source, int sourceIndex,int sourceLen) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70521MsgBuffer 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521MsgBuffer(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521MsgBuffer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of paraName2800300
	 *	@return paraName2800300
	 */
   public char[] getParaName2800300() throws CFException  {              
   		return work.getParaName2800300();
   }

  
	/**
	*  set variable paraName2800300
	*  @param value
	**/
   public void setParaName2800300(char[] value) throws CFException {
      work.setParaName2800300(value);
   } 

	/**
	 *	Returns the value of ip82921ErrMsgOut
	 *	@return ip82921ErrMsgOut
	 */   
	 public Ip82921ErrMsgOut getIp82921ErrMsgOut() {
   	return ip82921ErrMsgOut;
   }


	/**
	 *	Returns the value of ip70521TargetQmgrName
	 *	@return ip70521TargetQmgrName
	 */
   public char[] getIp70521TargetQmgrName() throws CFException  {              
   		return ip70521MqApiLayout.getIp70521TargetQmgrName();
   }

  
	/**
	*  set variable ip70521TargetQmgrName
	*  @param value
	**/
   public void setIp70521TargetQmgrName(char[] value) throws CFException {
      ip70521MqApiLayout.setIp70521TargetQmgrName(value);
   } 

     /**
	 * 	Update Ip70521TargetQmgrName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521TargetQmgrName(char[] source, int sourceIndex) throws CFException {
      ip70521MqApiLayout.setIp70521TargetQmgrName(source, sourceIndex);
   	
   }
   
   public void setIp70521TargetQmgrName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70521MqApiLayout.setIp70521TargetQmgrName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70521TargetQmgrName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521TargetQmgrName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521TargetQmgrName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70521TargetQmgrName with another Field
	 *	@param value
	 */
   public void setIp70521TargetQmgrName(Field source) {
      ip70521MqApiLayout.setIp70521TargetQmgrName(source);
   }  
   
     /**
	 * 	Update Ip70521TargetQmgrName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521TargetQmgrName(Field source, int sourceIndex,int sourceLen) {
      ip70521MqApiLayout.setIp70521TargetQmgrName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70521TargetQmgrName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521TargetQmgrName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521TargetQmgrName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip70521ResnCd
	 *	@return ip70521ResnCd
	 */
	public int getIp70521ResnCd() throws CFException {        
   		return ip70521MqApiLayout.getIp70521ResnCd();
	}
	
	/**
	 * 	Update Ip70521ResnCd with the passed value
	 *	@param number
	 */
	public void setIp70521ResnCd(int number)  throws CFException{
		ip70521MqApiLayout.setIp70521ResnCd(number);
	}


	public void setIp70521ResnCd(long number)  throws CFException{
		ip70521MqApiLayout.setIp70521ResnCd((int)number);
	}


	/**
	 *	Returns the value of ip82921ErrCompCd
	 *	@return ip82921ErrCompCd
	 */
	public long getIp82921ErrCompCd() throws CFException {
   		return ip82921ErrMsgOut.getIp82921ErrCompCd();
	}


	/**
	 *	Returns String value of ip82921ErrCompCd
	 *	@return ip82921ErrCompCd
	 */
	public char[]  getIp82921ErrCompCdString() throws CFException {
	     return String.valueOf(ip82921ErrMsgOut.getIp82921ErrCompCdString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip82921ErrCompCdIsNumeric()  throws CFException{
	    return ip82921ErrMsgOut.ip82921ErrCompCdIsNumeric();
	}

	/**
	 * 	Update Ip82921ErrCompCd with the passed value
	 *	@param number
	 */
	public void setIp82921ErrCompCd(long number)  throws CFException{
		ip82921ErrMsgOut.setIp82921ErrCompCd(number);
	}
	

	
	/**
	 * 	Update Ip82921ErrCompCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp82921ErrCompCd(char[] value)  throws CFException {
		ip82921ErrMsgOut.setIp82921ErrCompCd(value);
	}
	
	/**
	 * 	Update Ip82921ErrCompCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp82921ErrCompCdString(char[] value)  throws CFException{
		ip82921ErrMsgOut.setIp82921ErrCompCd(value);
	}	

	/**
	 *	Returns the value of ip82921ErrRequestCd
	 *	@return ip82921ErrRequestCd
	 */
   public char[] getIp82921ErrRequestCd() throws CFException  {              
   		return ip82921ErrMsgOut.getIp82921ErrRequestCd();
   }

  
	/**
	*  set variable ip82921ErrRequestCd
	*  @param value
	**/
   public void setIp82921ErrRequestCd(char[] value) throws CFException {
      ip82921ErrMsgOut.setIp82921ErrRequestCd(value);
   } 

     /**
	 * 	Update Ip82921ErrRequestCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921ErrRequestCd(char[] source, int sourceIndex) throws CFException {
      ip82921ErrMsgOut.setIp82921ErrRequestCd(source, sourceIndex);
   	
   }
   
   public void setIp82921ErrRequestCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip82921ErrMsgOut.setIp82921ErrRequestCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip82921ErrRequestCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ErrRequestCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip82921ErrMsgOut.setIp82921ErrRequestCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip82921ErrRequestCd with another Field
	 *	@param value
	 */
   public void setIp82921ErrRequestCd(Field source) {
      ip82921ErrMsgOut.setIp82921ErrRequestCd(source);
   }  
   
     /**
	 * 	Update Ip82921ErrRequestCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921ErrRequestCd(Field source, int sourceIndex,int sourceLen) {
      ip82921ErrMsgOut.setIp82921ErrRequestCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip82921ErrRequestCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ErrRequestCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip82921ErrMsgOut.setIp82921ErrRequestCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip70521RequestCd
	 *	@return ip70521RequestCd
	 */
   public char[] getIp70521RequestCd() throws CFException  {              
   		return ip70521MqApiLayout.getIp70521RequestCd();
   }

  
	/**
	*  set variable ip70521RequestCd
	*  @param value
	**/
   public void setIp70521RequestCd(char[] value) throws CFException {
      ip70521MqApiLayout.setIp70521RequestCd(value);
   } 

     /**
	 * 	Update Ip70521RequestCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp70521RequestCd(char[] source, int sourceIndex) throws CFException {
      ip70521MqApiLayout.setIp70521RequestCd(source, sourceIndex);
   	
   }
   
   public void setIp70521RequestCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip70521MqApiLayout.setIp70521RequestCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip70521RequestCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70521RequestCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521RequestCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip70521RequestCd with another Field
	 *	@param value
	 */
   public void setIp70521RequestCd(Field source) {
      ip70521MqApiLayout.setIp70521RequestCd(source);
   }  
   
     /**
	 * 	Update Ip70521RequestCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp70521RequestCd(Field source, int sourceIndex,int sourceLen) {
      ip70521MqApiLayout.setIp70521RequestCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip70521RequestCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70521RequestCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip70521MqApiLayout.setIp70521RequestCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "00" for isSys201IoGood80088()
	 *	@return  Returns true if isSys201IoGood80088() is "00"
	 */
   public boolean isSys201IoGood80088() throws CFException {
      return work.isSys201IoGood80088();
   }

	/**
	*  set values "00"
	*/
   	public void setSys201IoGood80088True()  throws CFException{  			
    	work.setSys201IoGood80088True();
   	}
	/**
	 *	Returns the value of ip82921ErrResnCd
	 *	@return ip82921ErrResnCd
	 */
	public long getIp82921ErrResnCd() throws CFException {
   		return ip82921ErrMsgOut.getIp82921ErrResnCd();
	}


	/**
	 *	Returns String value of ip82921ErrResnCd
	 *	@return ip82921ErrResnCd
	 */
	public char[]  getIp82921ErrResnCdString() throws CFException {
	     return String.valueOf(ip82921ErrMsgOut.getIp82921ErrResnCdString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip82921ErrResnCdIsNumeric()  throws CFException{
	    return ip82921ErrMsgOut.ip82921ErrResnCdIsNumeric();
	}

	/**
	 * 	Update Ip82921ErrResnCd with the passed value
	 *	@param number
	 */
	public void setIp82921ErrResnCd(long number)  throws CFException{
		ip82921ErrMsgOut.setIp82921ErrResnCd(number);
	}
	

	
	/**
	 * 	Update Ip82921ErrResnCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp82921ErrResnCd(char[] value)  throws CFException {
		ip82921ErrMsgOut.setIp82921ErrResnCd(value);
	}
	
	/**
	 * 	Update Ip82921ErrResnCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp82921ErrResnCdString(char[] value)  throws CFException{
		ip82921ErrMsgOut.setIp82921ErrResnCd(value);
	}	

	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return abendMessage900.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      abendMessage900.setAbendText900(value);
   } 

     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendText900(source, sourceIndex);
   	
   }
   
   public void setAbendText900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendText900 with another Field
	 *	@param value
	 */
   public void setAbendText900(Field source) {
      abendMessage900.setAbendText900(source);
   }  
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip82921ErrPayloadMsg
	 *	@return ip82921ErrPayloadMsg
	 */   
	 public Ip82921ErrPayloadMsg getIp82921ErrPayloadMsg() {
   	return ip82921ErrMsgOut.getIp82921ErrPayloadMsg();
   }

   /**
	* 	Update Ip82921ErrPayloadMsg with the passed value
	*	@param value
	*/
   public void setIp82921ErrPayloadMsg(char[] value) throws CFException {
      ip82921ErrMsgOut.setIp82921ErrPayloadMsg(value);
   }   

     /**
	 * 	Update Ip82921ErrPayloadMsg 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp82921ErrPayloadMsg(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip82921ErrMsgOut.setIp82921ErrPayloadMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip82921ErrPayloadMsg 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ErrPayloadMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip82921ErrMsgOut.setIp82921ErrPayloadMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip82921ErrPayloadMsg with another Field
	 *	@param value
	 */
   public void setIp82921ErrPayloadMsg(Field source) {
   	ip82921ErrMsgOut.setIp82921ErrPayloadMsg(source);
   }  
   
     /**
	 * 	Update Ip82921ErrPayloadMsg 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp82921ErrPayloadMsg(Field source, int sourceIndex,int sourceLen) {
   	ip82921ErrMsgOut.setIp82921ErrPayloadMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip82921ErrPayloadMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ErrPayloadMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip82921ErrMsgOut.setIp82921ErrPayloadMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendCode3003011
	 *	@return abendCode3003011
	 */
   public char[] getAbendCode3003011() throws CFException  {              
   		return work.getAbendCode3003011();
   }

  
	/**
	*  set variable abendCode3003011
	*  @param value
	**/
   public void setAbendCode3003011(char[] value) throws CFException {
      work.setAbendCode3003011(value);
   } 

	/**
	 *	Returns the value of sys201300
	 *	@return sys201300
	 */
   public char[] getSys201300() throws CFException  {              
   		return work.getSys201300();
   }

  
	/**
	*  set variable sys201300
	*  @param value
	**/
   public void setSys201300(char[] value) throws CFException {
      work.setSys201300(value);
   } 

	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip82921ErrMsgOut.hashCode();
        str += ip70521MqApiLayout.hashCode();
        str += abendPara900.hashCode();
        str += errorMsg6003011.hashCode();
        str += work.hashCode();
        str += sys201ErrMsgOut.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public WriteErrFileSys201OutCtx clone() {
        WriteErrFileSys201OutCtx cloneObj = new WriteErrFileSys201OutCtx();
        cloneObj.ip82921ErrMsgOut = new Ip82921ErrMsgOut();
        cloneObj.ip82921ErrMsgOut.set(ip82921ErrMsgOut.getClonedField());
        cloneObj.ip70521MqApiLayout = new Ip70521MqApiLayout();
        cloneObj.ip70521MqApiLayout.set(ip70521MqApiLayout.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.errorMsg6003011 = new ErrorMsg6003011();
        cloneObj.errorMsg6003011.set(errorMsg6003011.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys201ErrMsgOut = new Sys201ErrMsgOut();
        cloneObj.sys201ErrMsgOut.set(sys201ErrMsgOut.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public WriteErrFileSys201OutCtx getWriteErrFileSys201OutCtx() {
            return new WriteErrFileSys201OutCtx();
    }
     public class CloseQueueInCtx implements Cloneable {
     MqgetFailCnt612 mqgetFailCnt612 = Ip829010Ctx.this.getMqgetFailCnt612();
     FaaFacNotFndCnt614 faaFacNotFndCnt614 = Ip829010Ctx.this.getFaaFacNotFndCnt614();
     Ip7052f4MqApiLayout ip7052f4MqApiLayout = Ip829010Ctx.this.getIp7052f4MqApiLayout();
     QueueVars800 queueVars800 = Ip829010Ctx.this.getQueueVars800();
     Ip34051MqProcessParameters ip34051MqProcessParameters = Ip829010Ctx.this.getIp34051MqProcessParameters();
     MqputSkipCnt610 mqputSkipCnt610 = Ip829010Ctx.this.getMqputSkipCnt610();
     MqputFailCnt613 mqputFailCnt613 = Ip829010Ctx.this.getMqputFailCnt613();
     TipamrsSkipCnt611 tipamrsSkipCnt611 = Ip829010Ctx.this.getTipamrsSkipCnt611();
     Work work = Ip829010Ctx.this.getWork();
     MrsRowCnt608 mrsRowCnt608 = Ip829010Ctx.this.getMrsRowCnt608();
     Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable = Ip829010Ctx.this.getIp02015PrcssAgrmtTable();

	/**
	 *	Returns the value of mqgetFailCnt612
	 *	@return mqgetFailCnt612
	 */   
	 public MqgetFailCnt612 getMqgetFailCnt612() {
   	return mqgetFailCnt612;
   }


	/**
	 *	Returns the value of faaFacNotFndCnt614
	 *	@return faaFacNotFndCnt614
	 */   
	 public FaaFacNotFndCnt614 getFaaFacNotFndCnt614() {
   	return faaFacNotFndCnt614;
   }


	/**
	 *	Returns the value of tipamrsSkipCount800
	 *	@return tipamrsSkipCount800
	 */
	public int getTipamrsSkipCount800() throws CFException {        
   		return work.getTipamrsSkipCount800();
	}
	
	/**
	 * 	Update TipamrsSkipCount800 with the passed value
	 *	@param number
	 */
	public void setTipamrsSkipCount800(int number)  throws CFException{
		work.setTipamrsSkipCount800(number);
	}


	public void setTipamrsSkipCount800(long number)  throws CFException{
		work.setTipamrsSkipCount800((int)number);
	}


	/**
	 *	Returns the value of mqputSkipCount800
	 *	@return mqputSkipCount800
	 */
	public int getMqputSkipCount800() throws CFException {        
   		return work.getMqputSkipCount800();
	}
	
	/**
	 * 	Update MqputSkipCount800 with the passed value
	 *	@param number
	 */
	public void setMqputSkipCount800(int number)  throws CFException{
		work.setMqputSkipCount800(number);
	}


	public void setMqputSkipCount800(long number)  throws CFException{
		work.setMqputSkipCount800((int)number);
	}


	/**
	 *	Returns the value of mqputFailCnt613
	 *	@return mqputFailCnt613
	 */   
	 public MqputFailCnt613 getMqputFailCnt613() {
   	return mqputFailCnt613;
   }


	/**
	 *	Returns the value of mqputFailCount800
	 *	@return mqputFailCount800
	 */
	public int getMqputFailCount800() throws CFException {        
   		return work.getMqputFailCount800();
	}
	
	/**
	 * 	Update MqputFailCount800 with the passed value
	 *	@param number
	 */
	public void setMqputFailCount800(int number)  throws CFException{
		work.setMqputFailCount800(number);
	}


	public void setMqputFailCount800(long number)  throws CFException{
		work.setMqputFailCount800((int)number);
	}


	/**
	 *	Returns the value of resHobj800
	 *	@return resHobj800
	 */
	public int getResHobj800() throws CFException {        
   		return queueVars800.getResHobj800();
	}
	
	/**
	 * 	Update ResHobj800 with the passed value
	 *	@param number
	 */
	public void setResHobj800(int number)  throws CFException{
		queueVars800.setResHobj800(number);
	}


	public void setResHobj800(long number)  throws CFException{
		queueVars800.setResHobj800((int)number);
	}


	/**
	 *	Returns the value of mrsRowCnt608
	 *	@return mrsRowCnt608
	 */   
	 public MrsRowCnt608 getMrsRowCnt608() {
   	return mrsRowCnt608;
   }


	/**
	 *	Returns the value of resHconn800
	 *	@return resHconn800
	 */
	public int getResHconn800() throws CFException {        
   		return queueVars800.getResHconn800();
	}
	
	/**
	 * 	Update ResHconn800 with the passed value
	 *	@param number
	 */
	public void setResHconn800(int number)  throws CFException{
		queueVars800.setResHconn800(number);
	}


	public void setResHconn800(long number)  throws CFException{
		queueVars800.setResHconn800((int)number);
	}


	/**
	 *	Returns the value of reqHobj800
	 *	@return reqHobj800
	 */
	public int getReqHobj800() throws CFException {        
   		return queueVars800.getReqHobj800();
	}
	
	/**
	 * 	Update ReqHobj800 with the passed value
	 *	@param number
	 */
	public void setReqHobj800(int number)  throws CFException{
		queueVars800.setReqHobj800(number);
	}


	public void setReqHobj800(long number)  throws CFException{
		queueVars800.setReqHobj800((int)number);
	}


	/**
	 *	Test condition "G" for isIp02015HostPaGlobal88()
	 *	@return  Returns true if isIp02015HostPaGlobal88() is "G"
	 */
   public boolean isIp02015HostPaGlobal88() throws CFException {
      return ip02015PrcssAgrmtTable.isIp02015HostPaGlobal88();
   }

	/**
	*  set values "G"
	*/
   	public void setIp02015HostPaGlobal88True()  throws CFException{  			
    	ip02015PrcssAgrmtTable.setIp02015HostPaGlobal88True();
   	}
	/**
	 *	Returns the value of mqgetFailCount800
	 *	@return mqgetFailCount800
	 */
	public int getMqgetFailCount800() throws CFException {        
   		return work.getMqgetFailCount800();
	}
	
	/**
	 * 	Update MqgetFailCount800 with the passed value
	 *	@param number
	 */
	public void setMqgetFailCount800(int number)  throws CFException{
		work.setMqgetFailCount800(number);
	}


	public void setMqgetFailCount800(long number)  throws CFException{
		work.setMqgetFailCount800((int)number);
	}


	/**
	 *	Returns the value of ptrIp703020800
	 *	@return ptrIp703020800
	 */
   public char[] getPtrIp703020800() throws CFException  {              
   		return work.getPtrIp703020800();
   }

  
	/**
	*  set variable ptrIp703020800
	*  @param value
	**/
   public void setPtrIp703020800(char[] value) throws CFException {
      work.setPtrIp703020800(value);
   } 

	/**
	 *	Returns the value of faaFacNotFndCnt800
	 *	@return faaFacNotFndCnt800
	 */
	public int getFaaFacNotFndCnt800() throws CFException {        
   		return work.getFaaFacNotFndCnt800();
	}
	
	/**
	 * 	Update FaaFacNotFndCnt800 with the passed value
	 *	@param number
	 */
	public void setFaaFacNotFndCnt800(int number)  throws CFException{
		work.setFaaFacNotFndCnt800(number);
	}


	public void setFaaFacNotFndCnt800(long number)  throws CFException{
		work.setFaaFacNotFndCnt800((int)number);
	}


	/**
	 *	Returns the value of mqputSkipCnt610
	 *	@return mqputSkipCnt610
	 */   
	 public MqputSkipCnt610 getMqputSkipCnt610() {
   	return mqputSkipCnt610;
   }


	/**
	 *	Returns the value of mrsIsrtCount800
	 *	@return mrsIsrtCount800
	 */
	public int getMrsIsrtCount800() throws CFException {        
   		return work.getMrsIsrtCount800();
	}
	
	/**
	 * 	Update MrsIsrtCount800 with the passed value
	 *	@param number
	 */
	public void setMrsIsrtCount800(int number)  throws CFException{
		work.setMrsIsrtCount800(number);
	}


	public void setMrsIsrtCount800(long number)  throws CFException{
		work.setMrsIsrtCount800((int)number);
	}


	/**
	 *	Returns the value of reqHconn800
	 *	@return reqHconn800
	 */
	public int getReqHconn800() throws CFException {        
   		return queueVars800.getReqHconn800();
	}
	
	/**
	 * 	Update ReqHconn800 with the passed value
	 *	@param number
	 */
	public void setReqHconn800(int number)  throws CFException{
		queueVars800.setReqHconn800(number);
	}


	public void setReqHconn800(long number)  throws CFException{
		queueVars800.setReqHconn800((int)number);
	}


	/**
	 *	Returns the value of tipamrsSkipCnt611
	 *	@return tipamrsSkipCnt611
	 */   
	 public TipamrsSkipCnt611 getTipamrsSkipCnt611() {
   	return tipamrsSkipCnt611;
   }



        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public CloseQueueOutCtx getCloseQueueOutCtx() {
            return new CloseQueueOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += mqgetFailCnt612.hashCode();
        str += faaFacNotFndCnt614.hashCode();
        str += ip7052f4MqApiLayout.hashCode();
        str += queueVars800.hashCode();
        str += ip34051MqProcessParameters.hashCode();
        str += mqputSkipCnt610.hashCode();
        str += mqputFailCnt613.hashCode();
        str += tipamrsSkipCnt611.hashCode();
        str += work.hashCode();
        str += mrsRowCnt608.hashCode();
        str += ip02015PrcssAgrmtTable.hashCode();
       return str.hashCode();
    }

    public CloseQueueInCtx clone() {
        CloseQueueInCtx cloneObj = new CloseQueueInCtx();
        cloneObj.mqgetFailCnt612 = new MqgetFailCnt612();
        cloneObj.mqgetFailCnt612.set(mqgetFailCnt612.getClonedField());
        cloneObj.faaFacNotFndCnt614 = new FaaFacNotFndCnt614();
        cloneObj.faaFacNotFndCnt614.set(faaFacNotFndCnt614.getClonedField());
        cloneObj.ip7052f4MqApiLayout = new Ip7052f4MqApiLayout();
        cloneObj.ip7052f4MqApiLayout.set(ip7052f4MqApiLayout.getClonedField());
        cloneObj.queueVars800 = new QueueVars800();
        cloneObj.queueVars800.set(queueVars800.getClonedField());
        cloneObj.ip34051MqProcessParameters = new Ip34051MqProcessParameters();
        cloneObj.ip34051MqProcessParameters.set(ip34051MqProcessParameters.getClonedField());
        cloneObj.mqputSkipCnt610 = new MqputSkipCnt610();
        cloneObj.mqputSkipCnt610.set(mqputSkipCnt610.getClonedField());
        cloneObj.mqputFailCnt613 = new MqputFailCnt613();
        cloneObj.mqputFailCnt613.set(mqputFailCnt613.getClonedField());
        cloneObj.tipamrsSkipCnt611 = new TipamrsSkipCnt611();
        cloneObj.tipamrsSkipCnt611.set(tipamrsSkipCnt611.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.mrsRowCnt608 = new MrsRowCnt608();
        cloneObj.mrsRowCnt608.set(mrsRowCnt608.getClonedField());
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        return cloneObj;
    }

    }

    public CloseQueueInCtx getCloseQueueInCtx() {
            return new CloseQueueInCtx();
    }
     public class CloseQueueOutCtx implements Cloneable {
     MqgetFailCnt612 mqgetFailCnt612 = Ip829010Ctx.this.getMqgetFailCnt612();
     FaaFacNotFndCnt614 faaFacNotFndCnt614 = Ip829010Ctx.this.getFaaFacNotFndCnt614();
     Ip7052f4MqApiLayout ip7052f4MqApiLayout = Ip829010Ctx.this.getIp7052f4MqApiLayout();
     QueueVars800 queueVars800 = Ip829010Ctx.this.getQueueVars800();
     Ip34051MqProcessParameters ip34051MqProcessParameters = Ip829010Ctx.this.getIp34051MqProcessParameters();
     MqputSkipCnt610 mqputSkipCnt610 = Ip829010Ctx.this.getMqputSkipCnt610();
     MqputFailCnt613 mqputFailCnt613 = Ip829010Ctx.this.getMqputFailCnt613();
     TipamrsSkipCnt611 tipamrsSkipCnt611 = Ip829010Ctx.this.getTipamrsSkipCnt611();
     Work work = Ip829010Ctx.this.getWork();
     MrsRowCnt608 mrsRowCnt608 = Ip829010Ctx.this.getMrsRowCnt608();
     Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable = Ip829010Ctx.this.getIp02015PrcssAgrmtTable();

	/**
	 *	Test condition "D" for isIp34051RequestDiscnct88()
	 *	@return  Returns true if isIp34051RequestDiscnct88() is "D"
	 */
   public boolean isIp34051RequestDiscnct88() throws CFException {
      return ip34051MqProcessParameters.isIp34051RequestDiscnct88();
   }

	/**
	*  set values "D"
	*/
   	public void setIp34051RequestDiscnct88True()  throws CFException{  			
    	ip34051MqProcessParameters.setIp34051RequestDiscnct88True();
   	}
	/**
	 *	Returns the value of mqputSkipCount800
	 *	@return mqputSkipCount800
	 */
	public int getMqputSkipCount800() throws CFException {        
   		return work.getMqputSkipCount800();
	}
	
	/**
	 * 	Update MqputSkipCount800 with the passed value
	 *	@param number
	 */
	public void setMqputSkipCount800(int number)  throws CFException{
		work.setMqputSkipCount800(number);
	}


	public void setMqputSkipCount800(long number)  throws CFException{
		work.setMqputSkipCount800((int)number);
	}


	/**
	 *	Test condition "S" for isIp34051RespnseQ88()
	 *	@return  Returns true if isIp34051RespnseQ88() is "S"
	 */
   public boolean isIp34051RespnseQ88() throws CFException {
      return ip34051MqProcessParameters.isIp34051RespnseQ88();
   }

	/**
	*  set values "S"
	*/
   	public void setIp34051RespnseQ88True()  throws CFException{  			
    	ip34051MqProcessParameters.setIp34051RespnseQ88True();
   	}
	/**
	 *	Returns the value of resHobj800
	 *	@return resHobj800
	 */
	public int getResHobj800() throws CFException {        
   		return queueVars800.getResHobj800();
	}
	
	/**
	 * 	Update ResHobj800 with the passed value
	 *	@param number
	 */
	public void setResHobj800(int number)  throws CFException{
		queueVars800.setResHobj800(number);
	}


	public void setResHobj800(long number)  throws CFException{
		queueVars800.setResHobj800((int)number);
	}


	/**
	 *	Returns the value of mrsIsrtCnt608
	 *	@return mrsIsrtCnt608
	 */
	public long getMrsIsrtCnt608() throws CFException {
   		return mrsRowCnt608.getMrsIsrtCnt608();
	}


	/**
	 *	Returns String value of mrsIsrtCnt608
	 *	@return mrsIsrtCnt608
	 */
	public char[]  getMrsIsrtCnt608String() throws CFException {
	     return String.valueOf(mrsRowCnt608.getMrsIsrtCnt608String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mrsIsrtCnt608IsNumeric()  throws CFException{
	    return mrsRowCnt608.mrsIsrtCnt608IsNumeric();
	}

	/**
	 * 	Update MrsIsrtCnt608 with the passed value
	 *	@param number
	 */
	public void setMrsIsrtCnt608(long number)  throws CFException{
		mrsRowCnt608.setMrsIsrtCnt608(number);
	}
	

	
	/**
	 * 	Update MrsIsrtCnt608 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMrsIsrtCnt608(char[] value)  throws CFException {
		mrsRowCnt608.setMrsIsrtCnt608(value);
	}
	
	/**
	 * 	Update MrsIsrtCnt608 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMrsIsrtCnt608String(char[] value)  throws CFException{
		mrsRowCnt608.setMrsIsrtCnt608(value);
	}	

	/**
	 *	Returns the value of ip7052f4Hconn
	 *	@return ip7052f4Hconn
	 */
	public int getIp7052f4Hconn() throws CFException {        
   		return ip7052f4MqApiLayout.getIp7052f4Hconn();
	}
	
	/**
	 * 	Update Ip7052f4Hconn with the passed value
	 *	@param number
	 */
	public void setIp7052f4Hconn(int number)  throws CFException{
		ip7052f4MqApiLayout.setIp7052f4Hconn(number);
	}


	public void setIp7052f4Hconn(long number)  throws CFException{
		ip7052f4MqApiLayout.setIp7052f4Hconn((int)number);
	}


	/**
	 *	Returns the value of resHconn800
	 *	@return resHconn800
	 */
	public int getResHconn800() throws CFException {        
   		return queueVars800.getResHconn800();
	}
	
	/**
	 * 	Update ResHconn800 with the passed value
	 *	@param number
	 */
	public void setResHconn800(int number)  throws CFException{
		queueVars800.setResHconn800(number);
	}


	public void setResHconn800(long number)  throws CFException{
		queueVars800.setResHconn800((int)number);
	}


	/**
	 *	Test condition "0007" for isIp34051ServCdFra88()
	 *	@return  Returns true if isIp34051ServCdFra88() is "0007"
	 */
   public boolean isIp34051ServCdFra88() throws CFException {
      return ip34051MqProcessParameters.isIp34051ServCdFra88();
   }

	/**
	*  set values "0007"
	*/
   	public void setIp34051ServCdFra88True()  throws CFException{  			
    	ip34051MqProcessParameters.setIp34051ServCdFra88True();
   	}
	/**
	 *	Test condition "0002" for isIp34051FuncCdCha88()
	 *	@return  Returns true if isIp34051FuncCdCha88() is "0002"
	 */
   public boolean isIp34051FuncCdCha88() throws CFException {
      return ip34051MqProcessParameters.isIp34051FuncCdCha88();
   }

	/**
	*  set values "0002"
	*/
   	public void setIp34051FuncCdCha88True()  throws CFException{  			
    	ip34051MqProcessParameters.setIp34051FuncCdCha88True();
   	}
	/**
	 *	Returns the value of faaFacNotFndCnt800
	 *	@return faaFacNotFndCnt800
	 */
	public int getFaaFacNotFndCnt800() throws CFException {        
   		return work.getFaaFacNotFndCnt800();
	}
	
	/**
	 * 	Update FaaFacNotFndCnt800 with the passed value
	 *	@param number
	 */
	public void setFaaFacNotFndCnt800(int number)  throws CFException{
		work.setFaaFacNotFndCnt800(number);
	}


	public void setFaaFacNotFndCnt800(long number)  throws CFException{
		work.setFaaFacNotFndCnt800((int)number);
	}


	/**
	 *	Returns the value of getFailCnt612
	 *	@return getFailCnt612
	 */
	public long getGetFailCnt612() throws CFException {
   		return mqgetFailCnt612.getGetFailCnt612();
	}


	/**
	 *	Returns String value of getFailCnt612
	 *	@return getFailCnt612
	 */
	public char[]  getGetFailCnt612String() throws CFException {
	     return String.valueOf(mqgetFailCnt612.getGetFailCnt612String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean getFailCnt612IsNumeric()  throws CFException{
	    return mqgetFailCnt612.getFailCnt612IsNumeric();
	}

	/**
	 * 	Update GetFailCnt612 with the passed value
	 *	@param number
	 */
	public void setGetFailCnt612(long number)  throws CFException{
		mqgetFailCnt612.setGetFailCnt612(number);
	}
	

	
	/**
	 * 	Update GetFailCnt612 with the passed value
	 *	@param value (String or char[])
	 */
	public void setGetFailCnt612(char[] value)  throws CFException {
		mqgetFailCnt612.setGetFailCnt612(value);
	}
	
	/**
	 * 	Update GetFailCnt612 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setGetFailCnt612String(char[] value)  throws CFException{
		mqgetFailCnt612.setGetFailCnt612(value);
	}	

	/**
	 *	Returns the value of tipamrsSkipCount800
	 *	@return tipamrsSkipCount800
	 */
	public int getTipamrsSkipCount800() throws CFException {        
   		return work.getTipamrsSkipCount800();
	}
	
	/**
	 * 	Update TipamrsSkipCount800 with the passed value
	 *	@param number
	 */
	public void setTipamrsSkipCount800(int number)  throws CFException{
		work.setTipamrsSkipCount800(number);
	}


	public void setTipamrsSkipCount800(long number)  throws CFException{
		work.setTipamrsSkipCount800((int)number);
	}


	/**
	 *	Test condition "Q" for isIp34051RequestQ88()
	 *	@return  Returns true if isIp34051RequestQ88() is "Q"
	 */
   public boolean isIp34051RequestQ88() throws CFException {
      return ip34051MqProcessParameters.isIp34051RequestQ88();
   }

	/**
	*  set values "Q"
	*/
   	public void setIp34051RequestQ88True()  throws CFException{  			
    	ip34051MqProcessParameters.setIp34051RequestQ88True();
   	}
	/**
	 *	Returns the value of facNotFndCnt614
	 *	@return facNotFndCnt614
	 */
	public long getFacNotFndCnt614() throws CFException {
   		return faaFacNotFndCnt614.getFacNotFndCnt614();
	}


	/**
	 *	Returns String value of facNotFndCnt614
	 *	@return facNotFndCnt614
	 */
	public char[]  getFacNotFndCnt614String() throws CFException {
	     return String.valueOf(faaFacNotFndCnt614.getFacNotFndCnt614String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean facNotFndCnt614IsNumeric()  throws CFException{
	    return faaFacNotFndCnt614.facNotFndCnt614IsNumeric();
	}

	/**
	 * 	Update FacNotFndCnt614 with the passed value
	 *	@param number
	 */
	public void setFacNotFndCnt614(long number)  throws CFException{
		faaFacNotFndCnt614.setFacNotFndCnt614(number);
	}
	

	
	/**
	 * 	Update FacNotFndCnt614 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFacNotFndCnt614(char[] value)  throws CFException {
		faaFacNotFndCnt614.setFacNotFndCnt614(value);
	}
	
	/**
	 * 	Update FacNotFndCnt614 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFacNotFndCnt614String(char[] value)  throws CFException{
		faaFacNotFndCnt614.setFacNotFndCnt614(value);
	}	

	/**
	 *	Returns the value of putSkipCnt610
	 *	@return putSkipCnt610
	 */
	public long getPutSkipCnt610() throws CFException {
   		return mqputSkipCnt610.getPutSkipCnt610();
	}


	/**
	 *	Returns String value of putSkipCnt610
	 *	@return putSkipCnt610
	 */
	public char[]  getPutSkipCnt610String() throws CFException {
	     return String.valueOf(mqputSkipCnt610.getPutSkipCnt610String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean putSkipCnt610IsNumeric()  throws CFException{
	    return mqputSkipCnt610.putSkipCnt610IsNumeric();
	}

	/**
	 * 	Update PutSkipCnt610 with the passed value
	 *	@param number
	 */
	public void setPutSkipCnt610(long number)  throws CFException{
		mqputSkipCnt610.setPutSkipCnt610(number);
	}
	

	
	/**
	 * 	Update PutSkipCnt610 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPutSkipCnt610(char[] value)  throws CFException {
		mqputSkipCnt610.setPutSkipCnt610(value);
	}
	
	/**
	 * 	Update PutSkipCnt610 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPutSkipCnt610String(char[] value)  throws CFException{
		mqputSkipCnt610.setPutSkipCnt610(value);
	}	

	/**
	 *	Returns the value of mqputFailCount800
	 *	@return mqputFailCount800
	 */
	public int getMqputFailCount800() throws CFException {        
   		return work.getMqputFailCount800();
	}
	
	/**
	 * 	Update MqputFailCount800 with the passed value
	 *	@param number
	 */
	public void setMqputFailCount800(int number)  throws CFException{
		work.setMqputFailCount800(number);
	}


	public void setMqputFailCount800(long number)  throws CFException{
		work.setMqputFailCount800((int)number);
	}


	/**
	 *	Returns the value of putFailCnt613
	 *	@return putFailCnt613
	 */
	public long getPutFailCnt613() throws CFException {
   		return mqputFailCnt613.getPutFailCnt613();
	}


	/**
	 *	Returns String value of putFailCnt613
	 *	@return putFailCnt613
	 */
	public char[]  getPutFailCnt613String() throws CFException {
	     return String.valueOf(mqputFailCnt613.getPutFailCnt613String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean putFailCnt613IsNumeric()  throws CFException{
	    return mqputFailCnt613.putFailCnt613IsNumeric();
	}

	/**
	 * 	Update PutFailCnt613 with the passed value
	 *	@param number
	 */
	public void setPutFailCnt613(long number)  throws CFException{
		mqputFailCnt613.setPutFailCnt613(number);
	}
	

	
	/**
	 * 	Update PutFailCnt613 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPutFailCnt613(char[] value)  throws CFException {
		mqputFailCnt613.setPutFailCnt613(value);
	}
	
	/**
	 * 	Update PutFailCnt613 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPutFailCnt613String(char[] value)  throws CFException{
		mqputFailCnt613.setPutFailCnt613(value);
	}	

	/**
	 *	Returns the value of reqHobj800
	 *	@return reqHobj800
	 */
	public int getReqHobj800() throws CFException {        
   		return queueVars800.getReqHobj800();
	}
	
	/**
	 * 	Update ReqHobj800 with the passed value
	 *	@param number
	 */
	public void setReqHobj800(int number)  throws CFException{
		queueVars800.setReqHobj800(number);
	}


	public void setReqHobj800(long number)  throws CFException{
		queueVars800.setReqHobj800((int)number);
	}


	/**
	 *	Returns the value of mqgetFailCount800
	 *	@return mqgetFailCount800
	 */
	public int getMqgetFailCount800() throws CFException {        
   		return work.getMqgetFailCount800();
	}
	
	/**
	 * 	Update MqgetFailCount800 with the passed value
	 *	@param number
	 */
	public void setMqgetFailCount800(int number)  throws CFException{
		work.setMqgetFailCount800(number);
	}


	public void setMqgetFailCount800(long number)  throws CFException{
		work.setMqgetFailCount800((int)number);
	}


	/**
	 *	Test condition "E" for isIp34051RequestEnd88()
	 *	@return  Returns true if isIp34051RequestEnd88() is "E"
	 */
   public boolean isIp34051RequestEnd88() throws CFException {
      return ip34051MqProcessParameters.isIp34051RequestEnd88();
   }

	/**
	*  set values "E"
	*/
   	public void setIp34051RequestEnd88True()  throws CFException{  			
    	ip34051MqProcessParameters.setIp34051RequestEnd88True();
   	}
	/**
	 *	Test condition "N" for isIp34051TipacliActiveN88()
	 *	@return  Returns true if isIp34051TipacliActiveN88() is "N"
	 */
   public boolean isIp34051TipacliActiveN88() throws CFException {
      return ip34051MqProcessParameters.isIp34051TipacliActiveN88();
   }

	/**
	*  set values "N"
	*/
   	public void setIp34051TipacliActiveN88True()  throws CFException{  			
    	ip34051MqProcessParameters.setIp34051TipacliActiveN88True();
   	}
	/**
	 *	Test condition "N" for isIp34051TipasvcActiveN88()
	 *	@return  Returns true if isIp34051TipasvcActiveN88() is "N"
	 */
   public boolean isIp34051TipasvcActiveN88() throws CFException {
      return ip34051MqProcessParameters.isIp34051TipasvcActiveN88();
   }

	/**
	*  set values "N"
	*/
   	public void setIp34051TipasvcActiveN88True()  throws CFException{  			
    	ip34051MqProcessParameters.setIp34051TipasvcActiveN88True();
   	}
	/**
	 *	Returns the value of mrsIsrtCount800
	 *	@return mrsIsrtCount800
	 */
	public int getMrsIsrtCount800() throws CFException {        
   		return work.getMrsIsrtCount800();
	}
	
	/**
	 * 	Update MrsIsrtCount800 with the passed value
	 *	@param number
	 */
	public void setMrsIsrtCount800(int number)  throws CFException{
		work.setMrsIsrtCount800(number);
	}


	public void setMrsIsrtCount800(long number)  throws CFException{
		work.setMrsIsrtCount800((int)number);
	}


	/**
	 *	Returns the value of reqHconn800
	 *	@return reqHconn800
	 */
	public int getReqHconn800() throws CFException {        
   		return queueVars800.getReqHconn800();
	}
	
	/**
	 * 	Update ReqHconn800 with the passed value
	 *	@param number
	 */
	public void setReqHconn800(int number)  throws CFException{
		queueVars800.setReqHconn800(number);
	}


	public void setReqHconn800(long number)  throws CFException{
		queueVars800.setReqHconn800((int)number);
	}


	/**
	 *	Returns the value of mrsSkipCnt611
	 *	@return mrsSkipCnt611
	 */
	public long getMrsSkipCnt611() throws CFException {
   		return tipamrsSkipCnt611.getMrsSkipCnt611();
	}


	/**
	 *	Returns String value of mrsSkipCnt611
	 *	@return mrsSkipCnt611
	 */
	public char[]  getMrsSkipCnt611String() throws CFException {
	     return String.valueOf(tipamrsSkipCnt611.getMrsSkipCnt611String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mrsSkipCnt611IsNumeric()  throws CFException{
	    return tipamrsSkipCnt611.mrsSkipCnt611IsNumeric();
	}

	/**
	 * 	Update MrsSkipCnt611 with the passed value
	 *	@param number
	 */
	public void setMrsSkipCnt611(long number)  throws CFException{
		tipamrsSkipCnt611.setMrsSkipCnt611(number);
	}
	

	
	/**
	 * 	Update MrsSkipCnt611 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMrsSkipCnt611(char[] value)  throws CFException {
		tipamrsSkipCnt611.setMrsSkipCnt611(value);
	}
	
	/**
	 * 	Update MrsSkipCnt611 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMrsSkipCnt611String(char[] value)  throws CFException{
		tipamrsSkipCnt611.setMrsSkipCnt611(value);
	}	

	/**
	 *	Returns the value of ip7052f4Hobj
	 *	@return ip7052f4Hobj
	 */
	public int getIp7052f4Hobj() throws CFException {        
   		return ip7052f4MqApiLayout.getIp7052f4Hobj();
	}
	
	/**
	 * 	Update Ip7052f4Hobj with the passed value
	 *	@param number
	 */
	public void setIp7052f4Hobj(int number)  throws CFException{
		ip7052f4MqApiLayout.setIp7052f4Hobj(number);
	}


	public void setIp7052f4Hobj(long number)  throws CFException{
		ip7052f4MqApiLayout.setIp7052f4Hobj((int)number);
	}



        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += mqgetFailCnt612.hashCode();
        str += faaFacNotFndCnt614.hashCode();
        str += ip7052f4MqApiLayout.hashCode();
        str += queueVars800.hashCode();
        str += ip34051MqProcessParameters.hashCode();
        str += mqputSkipCnt610.hashCode();
        str += mqputFailCnt613.hashCode();
        str += tipamrsSkipCnt611.hashCode();
        str += work.hashCode();
        str += mrsRowCnt608.hashCode();
        str += ip02015PrcssAgrmtTable.hashCode();
       return str.hashCode();
    }

    public CloseQueueOutCtx clone() {
        CloseQueueOutCtx cloneObj = new CloseQueueOutCtx();
        cloneObj.mqgetFailCnt612 = new MqgetFailCnt612();
        cloneObj.mqgetFailCnt612.set(mqgetFailCnt612.getClonedField());
        cloneObj.faaFacNotFndCnt614 = new FaaFacNotFndCnt614();
        cloneObj.faaFacNotFndCnt614.set(faaFacNotFndCnt614.getClonedField());
        cloneObj.ip7052f4MqApiLayout = new Ip7052f4MqApiLayout();
        cloneObj.ip7052f4MqApiLayout.set(ip7052f4MqApiLayout.getClonedField());
        cloneObj.queueVars800 = new QueueVars800();
        cloneObj.queueVars800.set(queueVars800.getClonedField());
        cloneObj.ip34051MqProcessParameters = new Ip34051MqProcessParameters();
        cloneObj.ip34051MqProcessParameters.set(ip34051MqProcessParameters.getClonedField());
        cloneObj.mqputSkipCnt610 = new MqputSkipCnt610();
        cloneObj.mqputSkipCnt610.set(mqputSkipCnt610.getClonedField());
        cloneObj.mqputFailCnt613 = new MqputFailCnt613();
        cloneObj.mqputFailCnt613.set(mqputFailCnt613.getClonedField());
        cloneObj.tipamrsSkipCnt611 = new TipamrsSkipCnt611();
        cloneObj.tipamrsSkipCnt611.set(tipamrsSkipCnt611.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.mrsRowCnt608 = new MrsRowCnt608();
        cloneObj.mrsRowCnt608.set(mrsRowCnt608.getClonedField());
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        return cloneObj;
    }

    }

    public CloseQueueOutCtx getCloseQueueOutCtx() {
            return new CloseQueueOutCtx();
    }
     public class CloseErrFileSys201InCtx implements Cloneable {
     AbendPara900 abendPara900 = Ip829010Ctx.this.getAbendPara900();
     Work work = Ip829010Ctx.this.getWork();
     ErrorMsg6003012 errorMsg6003012 = Ip829010Ctx.this.getErrorMsg6003012();
     AbendMessage900 abendMessage900 = Ip829010Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of abendCode3003012
	 *	@return abendCode3003012
	 */
   public char[] getAbendCode3003012() throws CFException  {              
   		return work.getAbendCode3003012();
   }

  
	/**
	*  set variable abendCode3003012
	*  @param value
	**/
   public void setAbendCode3003012(char[] value) throws CFException {
      work.setAbendCode3003012(value);
   } 

	/**
	 *	Returns the value of sys201300
	 *	@return sys201300
	 */
   public char[] getSys201300() throws CFException  {              
   		return work.getSys201300();
   }

  
	/**
	*  set variable sys201300
	*  @param value
	**/
   public void setSys201300(char[] value) throws CFException {
      work.setSys201300(value);
   } 

	/**
	 *	Returns the value of sys201Status800
	 *	@return sys201Status800
	 */
   public char[] getSys201Status800() throws CFException  {              
   		return work.getSys201Status800();
   }

  
	/**
	*  set variable sys201Status800
	*  @param value
	**/
   public void setSys201Status800(char[] value) throws CFException {
      work.setSys201Status800(value);
   } 

	/**
	 *	Returns the value of errorMsg6003012
	 *	@return errorMsg6003012
	 */   
	 public ErrorMsg6003012 getErrorMsg6003012() {
   	return errorMsg6003012;
   }


	/**
	 *	Returns the value of paraName3100300
	 *	@return paraName3100300
	 */
   public char[] getParaName3100300() throws CFException  {              
   		return work.getParaName3100300();
   }

  
	/**
	*  set variable paraName3100300
	*  @param value
	**/
   public void setParaName3100300(char[] value) throws CFException {
      work.setParaName3100300(value);
   } 


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public CloseErrFileSys201OutCtx getCloseErrFileSys201OutCtx() {
            return new CloseErrFileSys201OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendPara900.hashCode();
        str += work.hashCode();
        str += errorMsg6003012.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public CloseErrFileSys201InCtx clone() {
        CloseErrFileSys201InCtx cloneObj = new CloseErrFileSys201InCtx();
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.errorMsg6003012 = new ErrorMsg6003012();
        cloneObj.errorMsg6003012.set(errorMsg6003012.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public CloseErrFileSys201InCtx getCloseErrFileSys201InCtx() {
            return new CloseErrFileSys201InCtx();
    }
     public class CloseErrFileSys201OutCtx implements Cloneable {
     AbendPara900 abendPara900 = Ip829010Ctx.this.getAbendPara900();
     Work work = Ip829010Ctx.this.getWork();
     ErrorMsg6003012 errorMsg6003012 = Ip829010Ctx.this.getErrorMsg6003012();
     AbendMessage900 abendMessage900 = Ip829010Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return abendMessage900.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      abendMessage900.setAbendText900(value);
   } 

     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendText900(source, sourceIndex);
   	
   }
   
   public void setAbendText900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendText900 with another Field
	 *	@param value
	 */
   public void setAbendText900(Field source) {
      abendMessage900.setAbendText900(source);
   }  
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendCode3003012
	 *	@return abendCode3003012
	 */
   public char[] getAbendCode3003012() throws CFException  {              
   		return work.getAbendCode3003012();
   }

  
	/**
	*  set variable abendCode3003012
	*  @param value
	**/
   public void setAbendCode3003012(char[] value) throws CFException {
      work.setAbendCode3003012(value);
   } 

	/**
	 *	Returns the value of fileDd6003012
	 *	@return fileDd6003012
	 */
   public char[] getFileDd6003012() throws CFException  {              
   		return errorMsg6003012.getFileDd6003012();
   }

  
	/**
	*  set variable fileDd6003012
	*  @param value
	**/
   public void setFileDd6003012(char[] value) throws CFException {
      errorMsg6003012.setFileDd6003012(value);
   } 

     /**
	 * 	Update FileDd6003012 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileDd6003012(char[] source, int sourceIndex) throws CFException {
      errorMsg6003012.setFileDd6003012(source, sourceIndex);
   	
   }
   
   public void setFileDd6003012(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      errorMsg6003012.setFileDd6003012(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FileDd6003012 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileDd6003012(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      errorMsg6003012.setFileDd6003012(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FileDd6003012 with another Field
	 *	@param value
	 */
   public void setFileDd6003012(Field source) {
      errorMsg6003012.setFileDd6003012(source);
   }  
   
     /**
	 * 	Update FileDd6003012 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileDd6003012(Field source, int sourceIndex,int sourceLen) {
      errorMsg6003012.setFileDd6003012(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FileDd6003012 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileDd6003012(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      errorMsg6003012.setFileDd6003012(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fileStat6003012
	 *	@return fileStat6003012
	 */
   public char[] getFileStat6003012() throws CFException  {              
   		return errorMsg6003012.getFileStat6003012();
   }

  
	/**
	*  set variable fileStat6003012
	*  @param value
	**/
   public void setFileStat6003012(char[] value) throws CFException {
      errorMsg6003012.setFileStat6003012(value);
   } 

     /**
	 * 	Update FileStat6003012 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileStat6003012(char[] source, int sourceIndex) throws CFException {
      errorMsg6003012.setFileStat6003012(source, sourceIndex);
   	
   }
   
   public void setFileStat6003012(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      errorMsg6003012.setFileStat6003012(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FileStat6003012 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileStat6003012(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      errorMsg6003012.setFileStat6003012(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FileStat6003012 with another Field
	 *	@param value
	 */
   public void setFileStat6003012(Field source) {
      errorMsg6003012.setFileStat6003012(source);
   }  
   
     /**
	 * 	Update FileStat6003012 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileStat6003012(Field source, int sourceIndex,int sourceLen) {
      errorMsg6003012.setFileStat6003012(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FileStat6003012 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileStat6003012(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      errorMsg6003012.setFileStat6003012(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys201300
	 *	@return sys201300
	 */
   public char[] getSys201300() throws CFException  {              
   		return work.getSys201300();
   }

  
	/**
	*  set variable sys201300
	*  @param value
	**/
   public void setSys201300(char[] value) throws CFException {
      work.setSys201300(value);
   } 

	/**
	 *	Returns the value of abendParaName900
	 *	@return abendParaName900
	 */
   public char[] getAbendParaName900() throws CFException  {              
   		return abendPara900.getAbendParaName900();
   }

  
	/**
	*  set variable abendParaName900
	*  @param value
	**/
   public void setAbendParaName900(char[] value) throws CFException {
      abendPara900.setAbendParaName900(value);
   } 

     /**
	 * 	Update AbendParaName900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendParaName900(char[] source, int sourceIndex) throws CFException {
      abendPara900.setAbendParaName900(source, sourceIndex);
   	
   }
   
   public void setAbendParaName900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendParaName900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendParaName900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendParaName900 with another Field
	 *	@param value
	 */
   public void setAbendParaName900(Field source) {
      abendPara900.setAbendParaName900(source);
   }  
   
     /**
	 * 	Update AbendParaName900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendParaName900(Field source, int sourceIndex,int sourceLen) {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendParaName900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendParaName900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys201Status800
	 *	@return sys201Status800
	 */
   public char[] getSys201Status800() throws CFException  {              
   		return work.getSys201Status800();
   }

  
	/**
	*  set variable sys201Status800
	*  @param value
	**/
   public void setSys201Status800(char[] value) throws CFException {
      work.setSys201Status800(value);
   } 

	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of errorMsg6003012
	 *	@return errorMsg6003012
	 */   
	 public ErrorMsg6003012 getErrorMsg6003012() {
   	return errorMsg6003012;
   }


	/**
	 *	Returns the value of paraName3100300
	 *	@return paraName3100300
	 */
   public char[] getParaName3100300() throws CFException  {              
   		return work.getParaName3100300();
   }

  
	/**
	*  set variable paraName3100300
	*  @param value
	**/
   public void setParaName3100300(char[] value) throws CFException {
      work.setParaName3100300(value);
   } 


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendPara900.hashCode();
        str += work.hashCode();
        str += errorMsg6003012.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public CloseErrFileSys201OutCtx clone() {
        CloseErrFileSys201OutCtx cloneObj = new CloseErrFileSys201OutCtx();
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.errorMsg6003012 = new ErrorMsg6003012();
        cloneObj.errorMsg6003012.set(errorMsg6003012.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public CloseErrFileSys201OutCtx getCloseErrFileSys201OutCtx() {
            return new CloseErrFileSys201OutCtx();
    }
     public class DisplayMqInfoInCtx implements Cloneable {
     FraudMqDebugDisp600 fraudMqDebugDisp600 = Ip829010Ctx.this.getFraudMqDebugDisp600();
     FnsPayload fnsPayload = Ip829010Ctx.this.getFnsPayload();
     FnsPldRd fnsPldRd = Ip829010Ctx.this.getFnsPldRd();
     Work work = Ip829010Ctx.this.getWork();

	/**
	 *	Returns the value of fnsPldRdPrimaryAcctNbr
	 *	@return fnsPldRdPrimaryAcctNbr
	 */
   public char[] getFnsPldRdPrimaryAcctNbr() throws CFException  {              
   		return fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().getFnsPldRdPrimaryAcctNbr();
   }

  
	/**
	*  set variable fnsPldRdPrimaryAcctNbr
	*  @param value
	**/
   public void setFnsPldRdPrimaryAcctNbr(char[] value) throws CFException {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(value);
   } 

     /**
	 * 	Update FnsPldRdPrimaryAcctNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(char[] source, int sourceIndex) throws CFException {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source, sourceIndex);
   	
   }
   
   public void setFnsPldRdPrimaryAcctNbr(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPldRdPrimaryAcctNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPldRdPrimaryAcctNbr with another Field
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(Field source) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source);
   }  
   
     /**
	 * 	Update FnsPldRdPrimaryAcctNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(Field source, int sourceIndex,int sourceLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FnsPldRdPrimaryAcctNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fnsPayloadFaaPanStatCd
	 *	@return fnsPayloadFaaPanStatCd
	 */
   public char[] getFnsPayloadFaaPanStatCd() throws CFException  {              
   		return fnsPayload.getFnsPayloadFaaPanStatCd();
   }

  
	/**
	*  set variable fnsPayloadFaaPanStatCd
	*  @param value
	**/
   public void setFnsPayloadFaaPanStatCd(char[] value) throws CFException {
      fnsPayload.setFnsPayloadFaaPanStatCd(value);
   } 

     /**
	 * 	Update FnsPayloadFaaPanStatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadFaaPanStatCd(char[] source, int sourceIndex) throws CFException {
      fnsPayload.setFnsPayloadFaaPanStatCd(source, sourceIndex);
   	
   }
   
   public void setFnsPayloadFaaPanStatCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fnsPayload.setFnsPayloadFaaPanStatCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPayloadFaaPanStatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadFaaPanStatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPayload.setFnsPayloadFaaPanStatCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPayloadFaaPanStatCd with another Field
	 *	@param value
	 */
   public void setFnsPayloadFaaPanStatCd(Field source) {
      fnsPayload.setFnsPayloadFaaPanStatCd(source);
   }  
   
     /**
	 * 	Update FnsPayloadFaaPanStatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadFaaPanStatCd(Field source, int sourceIndex,int sourceLen) {
      fnsPayload.setFnsPayloadFaaPanStatCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FnsPayloadFaaPanStatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadFaaPanStatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPayload.setFnsPayloadFaaPanStatCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getFnsPldRdTxnNum() throws CFException {  
        return fnsPldRd.getFnsPldRdTxnNum();
}
	/**
	 * 	Update FnsPldRdTxnNum with the passed value
	 *	@param number
	 */
	public void setFnsPldRdTxnNum(int number)  throws CFException{
		fnsPldRd.setFnsPldRdTxnNum(number);
	}


	public void setFnsPldRdTxnNum(long number)  throws CFException{
	    fnsPldRd.setFnsPldRdTxnNum(number);
	}
	

	/**
	 *	Returns the value of fnsPldRdQueryNo
	 *	@return fnsPldRdQueryNo
	 */
	public short getFnsPldRdQueryNo() throws CFException {        
   		return fnsPldRd.getFnsPldRdQueryNo();
	}
	
	/**
	 * 	Update FnsPldRdQueryNo with the passed value
	 *	@param number
	 */
	public void setFnsPldRdQueryNo(short number)  throws CFException{
		fnsPldRd.setFnsPldRdQueryNo(number);
	}

	public void setFnsPldRdQueryNo(int number)  throws CFException{
		fnsPldRd.setFnsPldRdQueryNo((short)number);
	}

	public void setFnsPldRdQueryNo(long number)  throws CFException{
		fnsPldRd.setFnsPldRdQueryNo((short)number);
	}



	/**
	 *	Returns the value of fnsPldRdLogicalSeq
	 *	@return fnsPldRdLogicalSeq
	 */
	public int getFnsPldRdLogicalSeq() throws CFException {        
   		return fnsPldRd.getFnsPldRdLogicalSeq();
	}
	
	/**
	 * 	Update FnsPldRdLogicalSeq with the passed value
	 *	@param number
	 */
	public void setFnsPldRdLogicalSeq(int number)  throws CFException{
		fnsPldRd.setFnsPldRdLogicalSeq(number);
	}


	public void setFnsPldRdLogicalSeq(long number)  throws CFException{
		fnsPldRd.setFnsPldRdLogicalSeq((int)number);
	}


	/**
	 *	Returns the value of fnsPldRdExpirationDate
	 *	@return fnsPldRdExpirationDate
	 */   
	 public FnsPldRdExpirationDate getFnsPldRdExpirationDate() {
   	return fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().getFnsPldRdExpirationDate();
   }

   /**
	* 	Update FnsPldRdExpirationDate with the passed value
	*	@param value
	*/
   public void setFnsPldRdExpirationDate(char[] value) throws CFException {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(value);
   }   

     /**
	 * 	Update FnsPldRdExpirationDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPldRdExpirationDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPldRdExpirationDate with another Field
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(Field source) {
   	fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(source);
   }  
   
     /**
	 * 	Update FnsPldRdExpirationDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(Field source, int sourceIndex,int sourceLen) {
   	fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPldRdExpirationDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fnsPldRdGftDsn
	 *	@return fnsPldRdGftDsn
	 */
   public char[] getFnsPldRdGftDsn() throws CFException  {              
   		return fnsPldRd.getFnsPldRdGftDsn();
   }

  
	/**
	*  set variable fnsPldRdGftDsn
	*  @param value
	**/
   public void setFnsPldRdGftDsn(char[] value) throws CFException {
      fnsPldRd.setFnsPldRdGftDsn(value);
   } 

     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(char[] source, int sourceIndex) throws CFException {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex);
   	
   }
   
   public void setFnsPldRdGftDsn(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPldRdGftDsn with another Field
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(Field source) {
      fnsPldRd.setFnsPldRdGftDsn(source);
   }  
   
     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(Field source, int sourceIndex,int sourceLen) {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fnsPayloadFaaCloseDt
	 *	@return fnsPayloadFaaCloseDt
	 */
   public char[] getFnsPayloadFaaCloseDt() throws CFException  {              
   		return fnsPayload.getFnsPayloadFaaCloseDt();
   }

  
	/**
	*  set variable fnsPayloadFaaCloseDt
	*  @param value
	**/
   public void setFnsPayloadFaaCloseDt(char[] value) throws CFException {
      fnsPayload.setFnsPayloadFaaCloseDt(value);
   } 

     /**
	 * 	Update FnsPayloadFaaCloseDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadFaaCloseDt(char[] source, int sourceIndex) throws CFException {
      fnsPayload.setFnsPayloadFaaCloseDt(source, sourceIndex);
   	
   }
   
   public void setFnsPayloadFaaCloseDt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fnsPayload.setFnsPayloadFaaCloseDt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPayloadFaaCloseDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadFaaCloseDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPayload.setFnsPayloadFaaCloseDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPayloadFaaCloseDt with another Field
	 *	@param value
	 */
   public void setFnsPayloadFaaCloseDt(Field source) {
      fnsPayload.setFnsPayloadFaaCloseDt(source);
   }  
   
     /**
	 * 	Update FnsPayloadFaaCloseDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadFaaCloseDt(Field source, int sourceIndex,int sourceLen) {
      fnsPayload.setFnsPayloadFaaCloseDt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FnsPayloadFaaCloseDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadFaaCloseDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPayload.setFnsPayloadFaaCloseDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of valuePipe300
	 *	@return valuePipe300
	 */
   public char[] getValuePipe300() throws CFException  {              
   		return work.getValuePipe300();
   }

  
	/**
	*  set variable valuePipe300
	*  @param value
	**/
   public void setValuePipe300(char[] value) throws CFException {
      work.setValuePipe300(value);
   } 

	/**
	 *	Returns the value of fnsPldRdVrtlAcctNum
	 *	@return fnsPldRdVrtlAcctNum
	 */
   public char[] getFnsPldRdVrtlAcctNum() throws CFException  {              
   		return fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().getFnsPldRdVrtlAcctNum();
   }

  
	/**
	*  set variable fnsPldRdVrtlAcctNum
	*  @param value
	**/
   public void setFnsPldRdVrtlAcctNum(char[] value) throws CFException {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(value);
   } 

     /**
	 * 	Update FnsPldRdVrtlAcctNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(char[] source, int sourceIndex) throws CFException {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source, sourceIndex);
   	
   }
   
   public void setFnsPldRdVrtlAcctNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPldRdVrtlAcctNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPldRdVrtlAcctNum with another Field
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(Field source) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source);
   }  
   
     /**
	 * 	Update FnsPldRdVrtlAcctNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(Field source, int sourceIndex,int sourceLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FnsPldRdVrtlAcctNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public DisplayMqInfoOutCtx getDisplayMqInfoOutCtx() {
            return new DisplayMqInfoOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += fraudMqDebugDisp600.hashCode();
        str += fnsPayload.hashCode();
        str += fnsPldRd.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DisplayMqInfoInCtx clone() {
        DisplayMqInfoInCtx cloneObj = new DisplayMqInfoInCtx();
        cloneObj.fraudMqDebugDisp600 = new FraudMqDebugDisp600();
        cloneObj.fraudMqDebugDisp600.set(fraudMqDebugDisp600.getClonedField());
        cloneObj.fnsPayload = new FnsPayload();
        cloneObj.fnsPayload.set(fnsPayload.getClonedField());
        cloneObj.fnsPldRd = new FnsPldRd();
        cloneObj.fnsPldRd.set(fnsPldRd.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayMqInfoInCtx getDisplayMqInfoInCtx() {
            return new DisplayMqInfoInCtx();
    }
     public class DisplayMqInfoOutCtx implements Cloneable {
     FraudMqDebugDisp600 fraudMqDebugDisp600 = Ip829010Ctx.this.getFraudMqDebugDisp600();
     FnsPayload fnsPayload = Ip829010Ctx.this.getFnsPayload();
     FnsPldRd fnsPldRd = Ip829010Ctx.this.getFnsPldRd();
     Work work = Ip829010Ctx.this.getWork();

	/**
	 *	Returns the value of logicalSeq600
	 *	@return logicalSeq600
	 */
	public long getLogicalSeq600() throws CFException {
   		return fraudMqDebugDisp600.getLogicalSeq600();
	}


	/**
	 *	Returns String value of logicalSeq600
	 *	@return logicalSeq600
	 */
	public char[]  getLogicalSeq600String() throws CFException {
	     return String.valueOf(fraudMqDebugDisp600.getLogicalSeq600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean logicalSeq600IsNumeric()  throws CFException{
	    return fraudMqDebugDisp600.logicalSeq600IsNumeric();
	}

	/**
	 * 	Update LogicalSeq600 with the passed value
	 *	@param number
	 */
	public void setLogicalSeq600(long number)  throws CFException{
		fraudMqDebugDisp600.setLogicalSeq600(number);
	}
	

	
	/**
	 * 	Update LogicalSeq600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLogicalSeq600(char[] value)  throws CFException {
		fraudMqDebugDisp600.setLogicalSeq600(value);
	}
	
	/**
	 * 	Update LogicalSeq600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLogicalSeq600String(char[] value)  throws CFException{
		fraudMqDebugDisp600.setLogicalSeq600(value);
	}	

	/**
	 *	Returns the value of virtualAcctNo600
	 *	@return virtualAcctNo600
	 */
   public char[] getVirtualAcctNo600() throws CFException  {              
   		return fraudMqDebugDisp600.getVirtualAcctNo600();
   }

  
	/**
	*  set variable virtualAcctNo600
	*  @param value
	**/
   public void setVirtualAcctNo600(char[] value) throws CFException {
      fraudMqDebugDisp600.setVirtualAcctNo600(value);
   } 

     /**
	 * 	Update VirtualAcctNo600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVirtualAcctNo600(char[] source, int sourceIndex) throws CFException {
      fraudMqDebugDisp600.setVirtualAcctNo600(source, sourceIndex);
   	
   }
   
   public void setVirtualAcctNo600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fraudMqDebugDisp600.setVirtualAcctNo600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update VirtualAcctNo600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVirtualAcctNo600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fraudMqDebugDisp600.setVirtualAcctNo600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update VirtualAcctNo600 with another Field
	 *	@param value
	 */
   public void setVirtualAcctNo600(Field source) {
      fraudMqDebugDisp600.setVirtualAcctNo600(source);
   }  
   
     /**
	 * 	Update VirtualAcctNo600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVirtualAcctNo600(Field source, int sourceIndex,int sourceLen) {
      fraudMqDebugDisp600.setVirtualAcctNo600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update VirtualAcctNo600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVirtualAcctNo600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fraudMqDebugDisp600.setVirtualAcctNo600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of primaryAcctNo600
	 *	@return primaryAcctNo600
	 */
   public char[] getPrimaryAcctNo600() throws CFException  {              
   		return fraudMqDebugDisp600.getPrimaryAcctNo600();
   }

  
	/**
	*  set variable primaryAcctNo600
	*  @param value
	**/
   public void setPrimaryAcctNo600(char[] value) throws CFException {
      fraudMqDebugDisp600.setPrimaryAcctNo600(value);
   } 

     /**
	 * 	Update PrimaryAcctNo600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrimaryAcctNo600(char[] source, int sourceIndex) throws CFException {
      fraudMqDebugDisp600.setPrimaryAcctNo600(source, sourceIndex);
   	
   }
   
   public void setPrimaryAcctNo600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fraudMqDebugDisp600.setPrimaryAcctNo600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PrimaryAcctNo600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrimaryAcctNo600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fraudMqDebugDisp600.setPrimaryAcctNo600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PrimaryAcctNo600 with another Field
	 *	@param value
	 */
   public void setPrimaryAcctNo600(Field source) {
      fraudMqDebugDisp600.setPrimaryAcctNo600(source);
   }  
   
     /**
	 * 	Update PrimaryAcctNo600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrimaryAcctNo600(Field source, int sourceIndex,int sourceLen) {
      fraudMqDebugDisp600.setPrimaryAcctNo600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PrimaryAcctNo600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrimaryAcctNo600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fraudMqDebugDisp600.setPrimaryAcctNo600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of faaClsDt600
	 *	@return faaClsDt600
	 */
   public char[] getFaaClsDt600() throws CFException  {              
   		return fraudMqDebugDisp600.getFaaClsDt600();
   }

  
	/**
	*  set variable faaClsDt600
	*  @param value
	**/
   public void setFaaClsDt600(char[] value) throws CFException {
      fraudMqDebugDisp600.setFaaClsDt600(value);
   } 

     /**
	 * 	Update FaaClsDt600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFaaClsDt600(char[] source, int sourceIndex) throws CFException {
      fraudMqDebugDisp600.setFaaClsDt600(source, sourceIndex);
   	
   }
   
   public void setFaaClsDt600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fraudMqDebugDisp600.setFaaClsDt600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FaaClsDt600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFaaClsDt600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fraudMqDebugDisp600.setFaaClsDt600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FaaClsDt600 with another Field
	 *	@param value
	 */
   public void setFaaClsDt600(Field source) {
      fraudMqDebugDisp600.setFaaClsDt600(source);
   }  
   
     /**
	 * 	Update FaaClsDt600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFaaClsDt600(Field source, int sourceIndex,int sourceLen) {
      fraudMqDebugDisp600.setFaaClsDt600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FaaClsDt600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFaaClsDt600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fraudMqDebugDisp600.setFaaClsDt600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getFnsPldRdTxnNum() throws CFException {  
        return fnsPldRd.getFnsPldRdTxnNum();
}
	/**
	 * 	Update FnsPldRdTxnNum with the passed value
	 *	@param number
	 */
	public void setFnsPldRdTxnNum(int number)  throws CFException{
		fnsPldRd.setFnsPldRdTxnNum(number);
	}


	public void setFnsPldRdTxnNum(long number)  throws CFException{
	    fnsPldRd.setFnsPldRdTxnNum(number);
	}
	

	/**
	 *	Returns the value of facCount600
	 *	@return facCount600
	 */
	public long getFacCount600() throws CFException {
   		return fraudMqDebugDisp600.getFacCount600();
	}


	/**
	 *	Returns String value of facCount600
	 *	@return facCount600
	 */
	public char[]  getFacCount600String() throws CFException {
	     return String.valueOf(fraudMqDebugDisp600.getFacCount600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean facCount600IsNumeric()  throws CFException{
	    return fraudMqDebugDisp600.facCount600IsNumeric();
	}

	/**
	 * 	Update FacCount600 with the passed value
	 *	@param number
	 */
	public void setFacCount600(long number)  throws CFException{
		fraudMqDebugDisp600.setFacCount600(number);
	}
	

	
	/**
	 * 	Update FacCount600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFacCount600(char[] value)  throws CFException {
		fraudMqDebugDisp600.setFacCount600(value);
	}
	
	/**
	 * 	Update FacCount600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFacCount600String(char[] value)  throws CFException{
		fraudMqDebugDisp600.setFacCount600(value);
	}	

	/**
	 *	Returns the value of fraudMqDebugDisp600
	 *	@return fraudMqDebugDisp600
	 */   
	 public FraudMqDebugDisp600 getFraudMqDebugDisp600() {
   	return fraudMqDebugDisp600;
   }


	/**
	 *	Returns the value of fnsPldRdLogicalSeq
	 *	@return fnsPldRdLogicalSeq
	 */
	public int getFnsPldRdLogicalSeq() throws CFException {        
   		return fnsPldRd.getFnsPldRdLogicalSeq();
	}
	
	/**
	 * 	Update FnsPldRdLogicalSeq with the passed value
	 *	@param number
	 */
	public void setFnsPldRdLogicalSeq(int number)  throws CFException{
		fnsPldRd.setFnsPldRdLogicalSeq(number);
	}


	public void setFnsPldRdLogicalSeq(long number)  throws CFException{
		fnsPldRd.setFnsPldRdLogicalSeq((int)number);
	}


	/**
	 *	Returns the value of fnsPldRdExpirationDate
	 *	@return fnsPldRdExpirationDate
	 */   
	 public FnsPldRdExpirationDate getFnsPldRdExpirationDate() {
   	return fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().getFnsPldRdExpirationDate();
   }

   /**
	* 	Update FnsPldRdExpirationDate with the passed value
	*	@param value
	*/
   public void setFnsPldRdExpirationDate(char[] value) throws CFException {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(value);
   }   

     /**
	 * 	Update FnsPldRdExpirationDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPldRdExpirationDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPldRdExpirationDate with another Field
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(Field source) {
   	fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(source);
   }  
   
     /**
	 * 	Update FnsPldRdExpirationDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(Field source, int sourceIndex,int sourceLen) {
   	fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPldRdExpirationDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdExpirationDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fnsPldRdGftDsn
	 *	@return fnsPldRdGftDsn
	 */
   public char[] getFnsPldRdGftDsn() throws CFException  {              
   		return fnsPldRd.getFnsPldRdGftDsn();
   }

  
	/**
	*  set variable fnsPldRdGftDsn
	*  @param value
	**/
   public void setFnsPldRdGftDsn(char[] value) throws CFException {
      fnsPldRd.setFnsPldRdGftDsn(value);
   } 

     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(char[] source, int sourceIndex) throws CFException {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex);
   	
   }
   
   public void setFnsPldRdGftDsn(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPldRdGftDsn with another Field
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(Field source) {
      fnsPldRd.setFnsPldRdGftDsn(source);
   }  
   
     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(Field source, int sourceIndex,int sourceLen) {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FnsPldRdGftDsn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdGftDsn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.setFnsPldRdGftDsn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fnsPayloadFaaCloseDt
	 *	@return fnsPayloadFaaCloseDt
	 */
   public char[] getFnsPayloadFaaCloseDt() throws CFException  {              
   		return fnsPayload.getFnsPayloadFaaCloseDt();
   }

  
	/**
	*  set variable fnsPayloadFaaCloseDt
	*  @param value
	**/
   public void setFnsPayloadFaaCloseDt(char[] value) throws CFException {
      fnsPayload.setFnsPayloadFaaCloseDt(value);
   } 

     /**
	 * 	Update FnsPayloadFaaCloseDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadFaaCloseDt(char[] source, int sourceIndex) throws CFException {
      fnsPayload.setFnsPayloadFaaCloseDt(source, sourceIndex);
   	
   }
   
   public void setFnsPayloadFaaCloseDt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fnsPayload.setFnsPayloadFaaCloseDt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPayloadFaaCloseDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadFaaCloseDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPayload.setFnsPayloadFaaCloseDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPayloadFaaCloseDt with another Field
	 *	@param value
	 */
   public void setFnsPayloadFaaCloseDt(Field source) {
      fnsPayload.setFnsPayloadFaaCloseDt(source);
   }  
   
     /**
	 * 	Update FnsPayloadFaaCloseDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadFaaCloseDt(Field source, int sourceIndex,int sourceLen) {
      fnsPayload.setFnsPayloadFaaCloseDt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FnsPayloadFaaCloseDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadFaaCloseDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPayload.setFnsPayloadFaaCloseDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of queryNum600
	 *	@return queryNum600
	 */
	public int getQueryNum600() throws CFException {
   		return fraudMqDebugDisp600.getQueryNum600();
	}


	/**
	 *	Returns String value of queryNum600
	 *	@return queryNum600
	 */
	public char[]  getQueryNum600String() throws CFException {
	     return String.valueOf(fraudMqDebugDisp600.getQueryNum600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean queryNum600IsNumeric()  throws CFException{
	    return fraudMqDebugDisp600.queryNum600IsNumeric();
	}

	/**
	 * 	Update QueryNum600 with the passed value
	 *	@param number
	 */
	public void setQueryNum600(int number)  throws CFException{
		fraudMqDebugDisp600.setQueryNum600(number);
	}
	

	public void setQueryNum600(long number)  throws CFException{
	    fraudMqDebugDisp600.setQueryNum600(number);
	}
	
	
	/**
	 * 	Update QueryNum600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setQueryNum600(char[] value)  throws CFException {
		fraudMqDebugDisp600.setQueryNum600(value);
	}
	
	/**
	 * 	Update QueryNum600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setQueryNum600String(char[] value)  throws CFException{
		fraudMqDebugDisp600.setQueryNum600(value);
	}	

	/**
	 *	Returns the value of expirDate600
	 *	@return expirDate600
	 */
   public char[] getExpirDate600() throws CFException  {              
   		return fraudMqDebugDisp600.getExpirDate600();
   }

  
	/**
	*  set variable expirDate600
	*  @param value
	**/
   public void setExpirDate600(char[] value) throws CFException {
      fraudMqDebugDisp600.setExpirDate600(value);
   } 

     /**
	 * 	Update ExpirDate600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExpirDate600(char[] source, int sourceIndex) throws CFException {
      fraudMqDebugDisp600.setExpirDate600(source, sourceIndex);
   	
   }
   
   public void setExpirDate600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fraudMqDebugDisp600.setExpirDate600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ExpirDate600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExpirDate600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fraudMqDebugDisp600.setExpirDate600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ExpirDate600 with another Field
	 *	@param value
	 */
   public void setExpirDate600(Field source) {
      fraudMqDebugDisp600.setExpirDate600(source);
   }  
   
     /**
	 * 	Update ExpirDate600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExpirDate600(Field source, int sourceIndex,int sourceLen) {
      fraudMqDebugDisp600.setExpirDate600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ExpirDate600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExpirDate600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fraudMqDebugDisp600.setExpirDate600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fnsPldRdPrimaryAcctNbr
	 *	@return fnsPldRdPrimaryAcctNbr
	 */
   public char[] getFnsPldRdPrimaryAcctNbr() throws CFException  {              
   		return fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().getFnsPldRdPrimaryAcctNbr();
   }

  
	/**
	*  set variable fnsPldRdPrimaryAcctNbr
	*  @param value
	**/
   public void setFnsPldRdPrimaryAcctNbr(char[] value) throws CFException {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(value);
   } 

     /**
	 * 	Update FnsPldRdPrimaryAcctNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(char[] source, int sourceIndex) throws CFException {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source, sourceIndex);
   	
   }
   
   public void setFnsPldRdPrimaryAcctNbr(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPldRdPrimaryAcctNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPldRdPrimaryAcctNbr with another Field
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(Field source) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source);
   }  
   
     /**
	 * 	Update FnsPldRdPrimaryAcctNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(Field source, int sourceIndex,int sourceLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FnsPldRdPrimaryAcctNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacDataKey().setFnsPldRdPrimaryAcctNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fnsPayloadFaaPanStatCd
	 *	@return fnsPayloadFaaPanStatCd
	 */
   public char[] getFnsPayloadFaaPanStatCd() throws CFException  {              
   		return fnsPayload.getFnsPayloadFaaPanStatCd();
   }

  
	/**
	*  set variable fnsPayloadFaaPanStatCd
	*  @param value
	**/
   public void setFnsPayloadFaaPanStatCd(char[] value) throws CFException {
      fnsPayload.setFnsPayloadFaaPanStatCd(value);
   } 

     /**
	 * 	Update FnsPayloadFaaPanStatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadFaaPanStatCd(char[] source, int sourceIndex) throws CFException {
      fnsPayload.setFnsPayloadFaaPanStatCd(source, sourceIndex);
   	
   }
   
   public void setFnsPayloadFaaPanStatCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fnsPayload.setFnsPayloadFaaPanStatCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPayloadFaaPanStatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadFaaPanStatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPayload.setFnsPayloadFaaPanStatCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPayloadFaaPanStatCd with another Field
	 *	@param value
	 */
   public void setFnsPayloadFaaPanStatCd(Field source) {
      fnsPayload.setFnsPayloadFaaPanStatCd(source);
   }  
   
     /**
	 * 	Update FnsPayloadFaaPanStatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadFaaPanStatCd(Field source, int sourceIndex,int sourceLen) {
      fnsPayload.setFnsPayloadFaaPanStatCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FnsPayloadFaaPanStatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadFaaPanStatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPayload.setFnsPayloadFaaPanStatCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of txnNo600
	 *	@return txnNo600
	 */
	public long getTxnNo600() throws CFException {
   		return fraudMqDebugDisp600.getTxnNo600();
	}


	/**
	 *	Returns String value of txnNo600
	 *	@return txnNo600
	 */
	public char[]  getTxnNo600String() throws CFException {
	     return String.valueOf(fraudMqDebugDisp600.getTxnNo600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean txnNo600IsNumeric()  throws CFException{
	    return fraudMqDebugDisp600.txnNo600IsNumeric();
	}

	/**
	 * 	Update TxnNo600 with the passed value
	 *	@param number
	 */
	public void setTxnNo600(long number)  throws CFException{
		fraudMqDebugDisp600.setTxnNo600(number);
	}
	

	
	/**
	 * 	Update TxnNo600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTxnNo600(char[] value)  throws CFException {
		fraudMqDebugDisp600.setTxnNo600(value);
	}
	
	/**
	 * 	Update TxnNo600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTxnNo600String(char[] value)  throws CFException{
		fraudMqDebugDisp600.setTxnNo600(value);
	}	

	/**
	 *	Returns the value of fnsPldRdQueryNo
	 *	@return fnsPldRdQueryNo
	 */
	public short getFnsPldRdQueryNo() throws CFException {        
   		return fnsPldRd.getFnsPldRdQueryNo();
	}
	
	/**
	 * 	Update FnsPldRdQueryNo with the passed value
	 *	@param number
	 */
	public void setFnsPldRdQueryNo(short number)  throws CFException{
		fnsPldRd.setFnsPldRdQueryNo(number);
	}

	public void setFnsPldRdQueryNo(int number)  throws CFException{
		fnsPldRd.setFnsPldRdQueryNo((short)number);
	}

	public void setFnsPldRdQueryNo(long number)  throws CFException{
		fnsPldRd.setFnsPldRdQueryNo((short)number);
	}



	/**
	 *	Returns the value of faaPanStatCd600
	 *	@return faaPanStatCd600
	 */
   public char[] getFaaPanStatCd600() throws CFException  {              
   		return fraudMqDebugDisp600.getFaaPanStatCd600();
   }

  
	/**
	*  set variable faaPanStatCd600
	*  @param value
	**/
   public void setFaaPanStatCd600(char[] value) throws CFException {
      fraudMqDebugDisp600.setFaaPanStatCd600(value);
   } 

     /**
	 * 	Update FaaPanStatCd600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFaaPanStatCd600(char[] source, int sourceIndex) throws CFException {
      fraudMqDebugDisp600.setFaaPanStatCd600(source, sourceIndex);
   	
   }
   
   public void setFaaPanStatCd600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fraudMqDebugDisp600.setFaaPanStatCd600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FaaPanStatCd600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFaaPanStatCd600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fraudMqDebugDisp600.setFaaPanStatCd600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FaaPanStatCd600 with another Field
	 *	@param value
	 */
   public void setFaaPanStatCd600(Field source) {
      fraudMqDebugDisp600.setFaaPanStatCd600(source);
   }  
   
     /**
	 * 	Update FaaPanStatCd600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFaaPanStatCd600(Field source, int sourceIndex,int sourceLen) {
      fraudMqDebugDisp600.setFaaPanStatCd600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FaaPanStatCd600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFaaPanStatCd600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fraudMqDebugDisp600.setFaaPanStatCd600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of gftDsn600
	 *	@return gftDsn600
	 */
   public char[] getGftDsn600() throws CFException  {              
   		return fraudMqDebugDisp600.getGftDsn600();
   }

  
	/**
	*  set variable gftDsn600
	*  @param value
	**/
   public void setGftDsn600(char[] value) throws CFException {
      fraudMqDebugDisp600.setGftDsn600(value);
   } 

     /**
	 * 	Update GftDsn600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGftDsn600(char[] source, int sourceIndex) throws CFException {
      fraudMqDebugDisp600.setGftDsn600(source, sourceIndex);
   	
   }
   
   public void setGftDsn600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fraudMqDebugDisp600.setGftDsn600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update GftDsn600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGftDsn600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fraudMqDebugDisp600.setGftDsn600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update GftDsn600 with another Field
	 *	@param value
	 */
   public void setGftDsn600(Field source) {
      fraudMqDebugDisp600.setGftDsn600(source);
   }  
   
     /**
	 * 	Update GftDsn600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGftDsn600(Field source, int sourceIndex,int sourceLen) {
      fraudMqDebugDisp600.setGftDsn600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update GftDsn600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGftDsn600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fraudMqDebugDisp600.setGftDsn600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fraudMqDebugDispStr600
	 *	@return fraudMqDebugDispStr600
	 */
   public char[] getFraudMqDebugDispStr600() throws CFException  {              
   		return work.getFraudMqDebugDispStr600();
   }

  
	/**
	*  set variable fraudMqDebugDispStr600
	*  @param value
	**/
   public void setFraudMqDebugDispStr600(char[] value) throws CFException {
      work.setFraudMqDebugDispStr600(value);
   } 

	/**
	 *	Returns the value of fnsPldRdVrtlAcctNum
	 *	@return fnsPldRdVrtlAcctNum
	 */
   public char[] getFnsPldRdVrtlAcctNum() throws CFException  {              
   		return fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().getFnsPldRdVrtlAcctNum();
   }

  
	/**
	*  set variable fnsPldRdVrtlAcctNum
	*  @param value
	**/
   public void setFnsPldRdVrtlAcctNum(char[] value) throws CFException {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(value);
   } 

     /**
	 * 	Update FnsPldRdVrtlAcctNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(char[] source, int sourceIndex) throws CFException {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source, sourceIndex);
   	
   }
   
   public void setFnsPldRdVrtlAcctNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FnsPldRdVrtlAcctNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FnsPldRdVrtlAcctNum with another Field
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(Field source) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source);
   }  
   
     /**
	 * 	Update FnsPldRdVrtlAcctNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(Field source, int sourceIndex,int sourceLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FnsPldRdVrtlAcctNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdVrtlAcctNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      fnsPldRd.getFnsPldRdFnsDataFields().getFnsPldRdFacData().setFnsPldRdVrtlAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += fraudMqDebugDisp600.hashCode();
        str += fnsPayload.hashCode();
        str += fnsPldRd.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DisplayMqInfoOutCtx clone() {
        DisplayMqInfoOutCtx cloneObj = new DisplayMqInfoOutCtx();
        cloneObj.fraudMqDebugDisp600 = new FraudMqDebugDisp600();
        cloneObj.fraudMqDebugDisp600.set(fraudMqDebugDisp600.getClonedField());
        cloneObj.fnsPayload = new FnsPayload();
        cloneObj.fnsPayload.set(fnsPayload.getClonedField());
        cloneObj.fnsPldRd = new FnsPldRd();
        cloneObj.fnsPldRd.set(fnsPldRd.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayMqInfoOutCtx getDisplayMqInfoOutCtx() {
            return new DisplayMqInfoOutCtx();
    }
     public class CallLrmIp648010InCtx implements Cloneable {
     Ip64801LrmCommBlock ip64801LrmCommBlock = Ip829010Ctx.this.getIp64801LrmCommBlock();
     AbendPara900 abendPara900 = Ip829010Ctx.this.getAbendPara900();
     Work work = Ip829010Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip829010Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of paraName8500300
	 *	@return paraName8500300
	 */
   public char[] getParaName8500300() throws CFException  {              
   		return work.getParaName8500300();
   }

  
	/**
	*  set variable paraName8500300
	*  @param value
	**/
   public void setParaName8500300(char[] value) throws CFException {
      work.setParaName8500300(value);
   } 

	/**
	 *	Returns the value of invalidRcLrm300
	 *	@return invalidRcLrm300
	 */
   public char[] getInvalidRcLrm300() throws CFException  {              
   		return work.getInvalidRcLrm300();
   }

  
	/**
	*  set variable invalidRcLrm300
	*  @param value
	**/
   public void setInvalidRcLrm300(char[] value) throws CFException {
      work.setInvalidRcLrm300(value);
   } 

	/**
	 *	Returns the value of lrmIoAbendMsg609
	 *	@return lrmIoAbendMsg609
	 */
   public char[] getLrmIoAbendMsg609() throws CFException  {              
   		return work.getLrmIoAbendMsg609();
   }

  
	/**
	*  set variable lrmIoAbendMsg609
	*  @param value
	**/
   public void setLrmIoAbendMsg609(char[] value) throws CFException {
      work.setLrmIoAbendMsg609(value);
   } 

	/**
	 *	Returns the value of ptrIp648010800
	 *	@return ptrIp648010800
	 */
   public char[] getPtrIp648010800() throws CFException  {              
   		return work.getPtrIp648010800();
   }

  
	/**
	*  set variable ptrIp648010800
	*  @param value
	**/
   public void setPtrIp648010800(char[] value) throws CFException {
      work.setPtrIp648010800(value);
   } 

	/**
	 *	Test condition "BAD" for isIp6480188LrmStatBad()
	 *	@return  Returns true if isIp6480188LrmStatBad() is "BAD"
	 */
   public boolean isIp6480188LrmStatBad() throws CFException {
      return ip64801LrmCommBlock.isIp6480188LrmStatBad();
   }

	/**
	*  set values "BAD"
	*/
   	public void setIp6480188LrmStatBadTrue()  throws CFException{  			
    	ip64801LrmCommBlock.setIp6480188LrmStatBadTrue();
   	}

        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public CallLrmIp648010OutCtx getCallLrmIp648010OutCtx() {
            return new CallLrmIp648010OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip64801LrmCommBlock.hashCode();
        str += abendPara900.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public CallLrmIp648010InCtx clone() {
        CallLrmIp648010InCtx cloneObj = new CallLrmIp648010InCtx();
        cloneObj.ip64801LrmCommBlock = new Ip64801LrmCommBlock();
        cloneObj.ip64801LrmCommBlock.set(ip64801LrmCommBlock.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public CallLrmIp648010InCtx getCallLrmIp648010InCtx() {
            return new CallLrmIp648010InCtx();
    }
     public class CallLrmIp648010OutCtx implements Cloneable {
     Ip64801LrmCommBlock ip64801LrmCommBlock = Ip829010Ctx.this.getIp64801LrmCommBlock();
     AbendPara900 abendPara900 = Ip829010Ctx.this.getAbendPara900();
     Work work = Ip829010Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip829010Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of paraName8500300
	 *	@return paraName8500300
	 */
   public char[] getParaName8500300() throws CFException  {              
   		return work.getParaName8500300();
   }

  
	/**
	*  set variable paraName8500300
	*  @param value
	**/
   public void setParaName8500300(char[] value) throws CFException {
      work.setParaName8500300(value);
   } 

	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return abendMessage900.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      abendMessage900.setAbendText900(value);
   } 

     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendText900(source, sourceIndex);
   	
   }
   
   public void setAbendText900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendText900 with another Field
	 *	@param value
	 */
   public void setAbendText900(Field source) {
      abendMessage900.setAbendText900(source);
   }  
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of invalidRcLrm300
	 *	@return invalidRcLrm300
	 */
   public char[] getInvalidRcLrm300() throws CFException  {              
   		return work.getInvalidRcLrm300();
   }

  
	/**
	*  set variable invalidRcLrm300
	*  @param value
	**/
   public void setInvalidRcLrm300(char[] value) throws CFException {
      work.setInvalidRcLrm300(value);
   } 

	/**
	 *	Returns the value of lrmIoAbendMsg609
	 *	@return lrmIoAbendMsg609
	 */
   public char[] getLrmIoAbendMsg609() throws CFException  {              
   		return work.getLrmIoAbendMsg609();
   }

  
	/**
	*  set variable lrmIoAbendMsg609
	*  @param value
	**/
   public void setLrmIoAbendMsg609(char[] value) throws CFException {
      work.setLrmIoAbendMsg609(value);
   } 

	/**
	 *	Returns the value of abendParaName900
	 *	@return abendParaName900
	 */
   public char[] getAbendParaName900() throws CFException  {              
   		return abendPara900.getAbendParaName900();
   }

  
	/**
	*  set variable abendParaName900
	*  @param value
	**/
   public void setAbendParaName900(char[] value) throws CFException {
      abendPara900.setAbendParaName900(value);
   } 

     /**
	 * 	Update AbendParaName900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendParaName900(char[] source, int sourceIndex) throws CFException {
      abendPara900.setAbendParaName900(source, sourceIndex);
   	
   }
   
   public void setAbendParaName900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendParaName900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendParaName900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendParaName900 with another Field
	 *	@param value
	 */
   public void setAbendParaName900(Field source) {
      abendPara900.setAbendParaName900(source);
   }  
   
     /**
	 * 	Update AbendParaName900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendParaName900(Field source, int sourceIndex,int sourceLen) {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendParaName900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendParaName900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendPara900.setAbendParaName900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip64801LrmCommBlock.hashCode();
        str += abendPara900.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public CallLrmIp648010OutCtx clone() {
        CallLrmIp648010OutCtx cloneObj = new CallLrmIp648010OutCtx();
        cloneObj.ip64801LrmCommBlock = new Ip64801LrmCommBlock();
        cloneObj.ip64801LrmCommBlock.set(ip64801LrmCommBlock.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public CallLrmIp648010OutCtx getCallLrmIp648010OutCtx() {
            return new CallLrmIp648010OutCtx();
    }
     public class TerminateOnErrorInCtx implements Cloneable {
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip829010Ctx.this.getIp60001EventLogWorkArea();
     AbendPara900 abendPara900 = Ip829010Ctx.this.getAbendPara900();
     Work work = Ip829010Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip829010Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of asterisks300
	 *	@return asterisks300
	 */
   public char[] getAsterisks300() throws CFException  {              
   		return work.getAsterisks300();
   }

  
	/**
	*  set variable asterisks300
	*  @param value
	**/
   public void setAsterisks300(char[] value) throws CFException {
      work.setAsterisks300(value);
   } 

	/**
	 *	Returns the value of abendTxt300
	 *	@return abendTxt300
	 */
   public char[] getAbendTxt300() throws CFException  {              
   		return work.getAbendTxt300();
   }

  
	/**
	*  set variable abendTxt300
	*  @param value
	**/
   public void setAbendTxt300(char[] value) throws CFException {
      work.setAbendTxt300(value);
   } 

	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return abendMessage900.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      abendMessage900.setAbendText900(value);
   } 

     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendText900(source, sourceIndex);
   	
   }
   
   public void setAbendText900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendText900 with another Field
	 *	@param value
	 */
   public void setAbendText900(Field source) {
      abendMessage900.setAbendText900(source);
   }  
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendPgmTxt300
	 *	@return abendPgmTxt300
	 */
   public char[] getAbendPgmTxt300() throws CFException  {              
   		return work.getAbendPgmTxt300();
   }

  
	/**
	*  set variable abendPgmTxt300
	*  @param value
	**/
   public void setAbendPgmTxt300(char[] value) throws CFException {
      work.setAbendPgmTxt300(value);
   } 

	/**
	 *	Returns the value of abendPara900
	 *	@return abendPara900
	 */   
	 public AbendPara900 getAbendPara900() {
   	return abendPara900;
   }


	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendMessage900
	 *	@return abendMessage900
	 */   
	 public AbendMessage900 getAbendMessage900() {
   	return abendMessage900;
   }


	/**
	 *	Returns the value of abendPtr800
	 *	@return abendPtr800
	 */
   public char[] getAbendPtr800() throws CFException  {              
   		return work.getAbendPtr800();
   }

  
	/**
	*  set variable abendPtr800
	*  @param value
	**/
   public void setAbendPtr800(char[] value) throws CFException {
      work.setAbendPtr800(value);
   } 


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public TerminateOnErrorOutCtx getTerminateOnErrorOutCtx() {
            return new TerminateOnErrorOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip60001EventLogWorkArea.hashCode();
        str += abendPara900.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public TerminateOnErrorInCtx clone() {
        TerminateOnErrorInCtx cloneObj = new TerminateOnErrorInCtx();
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public TerminateOnErrorInCtx getTerminateOnErrorInCtx() {
            return new TerminateOnErrorInCtx();
    }
     public class TerminateOnErrorOutCtx implements Cloneable {
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip829010Ctx.this.getIp60001EventLogWorkArea();
     AbendPara900 abendPara900 = Ip829010Ctx.this.getAbendPara900();
     Work work = Ip829010Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip829010Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return abendMessage900.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      abendMessage900.setAbendText900(value);
   } 

     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendText900(source, sourceIndex);
   	
   }
   
   public void setAbendText900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendText900 with another Field
	 *	@param value
	 */
   public void setAbendText900(Field source) {
      abendMessage900.setAbendText900(source);
   }  
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip60001EventErrorMsg
	 *	@return ip60001EventErrorMsg
	 */
   public char[] getIp60001EventErrorMsg() throws CFException  {              
   		return ip60001EventLogWorkArea.getIp60001EventErrorMsg();
   }

  
	/**
	*  set variable ip60001EventErrorMsg
	*  @param value
	**/
   public void setIp60001EventErrorMsg(char[] value) throws CFException {
      ip60001EventLogWorkArea.setIp60001EventErrorMsg(value);
   } 

     /**
	 * 	Update Ip60001EventErrorMsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001EventErrorMsg(char[] source, int sourceIndex) throws CFException {
      ip60001EventLogWorkArea.setIp60001EventErrorMsg(source, sourceIndex);
   	
   }
   
   public void setIp60001EventErrorMsg(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip60001EventLogWorkArea.setIp60001EventErrorMsg(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip60001EventErrorMsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001EventErrorMsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001EventErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip60001EventErrorMsg with another Field
	 *	@param value
	 */
   public void setIp60001EventErrorMsg(Field source) {
      ip60001EventLogWorkArea.setIp60001EventErrorMsg(source);
   }  
   
     /**
	 * 	Update Ip60001EventErrorMsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001EventErrorMsg(Field source, int sourceIndex,int sourceLen) {
      ip60001EventLogWorkArea.setIp60001EventErrorMsg(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip60001EventErrorMsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001EventErrorMsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001EventErrorMsg(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip60001EventErrorCode
	 *	@return ip60001EventErrorCode
	 */
   public char[] getIp60001EventErrorCode() throws CFException  {              
   		return ip60001EventLogWorkArea.getIp60001EventErrorCode();
   }

  
	/**
	*  set variable ip60001EventErrorCode
	*  @param value
	**/
   public void setIp60001EventErrorCode(char[] value) throws CFException {
      ip60001EventLogWorkArea.setIp60001EventErrorCode(value);
   } 

     /**
	 * 	Update Ip60001EventErrorCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001EventErrorCode(char[] source, int sourceIndex) throws CFException {
      ip60001EventLogWorkArea.setIp60001EventErrorCode(source, sourceIndex);
   	
   }
   
   public void setIp60001EventErrorCode(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip60001EventLogWorkArea.setIp60001EventErrorCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip60001EventErrorCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001EventErrorCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001EventErrorCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip60001EventErrorCode with another Field
	 *	@param value
	 */
   public void setIp60001EventErrorCode(Field source) {
      ip60001EventLogWorkArea.setIp60001EventErrorCode(source);
   }  
   
     /**
	 * 	Update Ip60001EventErrorCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001EventErrorCode(Field source, int sourceIndex,int sourceLen) {
      ip60001EventLogWorkArea.setIp60001EventErrorCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip60001EventErrorCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001EventErrorCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001EventErrorCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip60001EventLogWorkArea.hashCode();
        str += abendPara900.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public TerminateOnErrorOutCtx clone() {
        TerminateOnErrorOutCtx cloneObj = new TerminateOnErrorOutCtx();
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public TerminateOnErrorOutCtx getTerminateOnErrorOutCtx() {
            return new TerminateOnErrorOutCtx();
    }
     public class UpdateEventLogInCtx implements Cloneable {
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip829010Ctx.this.getIp60001EventLogWorkArea();

	/**
	 *	Test condition "T" for isIp60001LogEvent88()
	 *	@return  Returns true if isIp60001LogEvent88() is "T"
	 */
   public boolean isIp60001LogEvent88() throws CFException {
      return ip60001EventLogWorkArea.isIp60001LogEvent88();
   }

	/**
	*  set values "T"
	*/
   	public void setIp60001LogEvent88True()  throws CFException{  			
    	ip60001EventLogWorkArea.setIp60001LogEvent88True();
   	}
	/**
	 *	Returns the value of ip60001Subscript
	 *	@return ip60001Subscript
	 */
	public long getIp60001Subscript() throws CFException {        
   		return ip60001EventLogWorkArea.getIp60001Subscript();
	}
	
	/**
	 * 	Update Ip60001Subscript with the passed value
	 *	@param number
	 */
	public void setIp60001Subscript(long number)  throws CFException{
		ip60001EventLogWorkArea.setIp60001Subscript(number);
	}



	/**
	 *	Returns the value of ip60001HoldPgmName
	 *	@return ip60001HoldPgmName
	 */
   public char[] getIp60001HoldPgmName() throws CFException  {              
   		return ip60001EventLogWorkArea.getIp60001HoldPgmName();
   }

  
	/**
	*  set variable ip60001HoldPgmName
	*  @param value
	**/
   public void setIp60001HoldPgmName(char[] value) throws CFException {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(value);
   } 

     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001HoldPgmName(char[] source, int sourceIndex) throws CFException {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex);
   	
   }
   
   public void setIp60001HoldPgmName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001HoldPgmName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip60001HoldPgmName with another Field
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source);
   }  
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source, int sourceIndex,int sourceLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }

        public UpdateEventLogOutCtx getUpdateEventLogOutCtx() {
            return new UpdateEventLogOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public UpdateEventLogInCtx clone() {
        UpdateEventLogInCtx cloneObj = new UpdateEventLogInCtx();
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public UpdateEventLogInCtx getUpdateEventLogInCtx() {
            return new UpdateEventLogInCtx();
    }
     public class UpdateEventLogOutCtx implements Cloneable {
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip829010Ctx.this.getIp60001EventLogWorkArea();

	/**
	 *	Returns the value of ip60001Subscript
	 *	@return ip60001Subscript
	 */
	public long getIp60001Subscript() throws CFException {        
   		return ip60001EventLogWorkArea.getIp60001Subscript();
	}
	
	/**
	 * 	Update Ip60001Subscript with the passed value
	 *	@param number
	 */
	public void setIp60001Subscript(long number)  throws CFException{
		ip60001EventLogWorkArea.setIp60001Subscript(number);
	}



	/**
	 *	Returns the value of ip60001PgmName
	 *	@return ip60001PgmName
	 */
   public char[] getIp60001PgmName(int index) throws CFException  {              
   		return ip60001EventLogWorkArea.getIp60001EventEntry(index).getIp60001PgmName();
   }

  
	/**
	*  set variable ip60001PgmName
	*  @param value
	**/
   public void setIp60001PgmName(int index,char[] value) throws CFException {
      ip60001EventLogWorkArea.getIp60001EventEntry(index).setIp60001PgmName(value);
   } 

     /**
	 * 	Update Ip60001PgmName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001PgmName(int index,char[] source, int sourceIndex) throws CFException {
      ip60001EventLogWorkArea.getIp60001EventEntry(index).setIp60001PgmName(source, sourceIndex);
   	
   }
   
   public void setIp60001PgmName(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip60001EventLogWorkArea.getIp60001EventEntry(index).setIp60001PgmName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip60001PgmName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001PgmName(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.getIp60001EventEntry(index).setIp60001PgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip60001PgmName with another Field
	 *	@param value
	 */
   public void setIp60001PgmName(int index,Field source) {
      ip60001EventLogWorkArea.getIp60001EventEntry(index).setIp60001PgmName(source);
   }  
   
     /**
	 * 	Update Ip60001PgmName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001PgmName(int index,Field source, int sourceIndex,int sourceLen) {
      ip60001EventLogWorkArea.getIp60001EventEntry(index).setIp60001PgmName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip60001PgmName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001PgmName(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.getIp60001EventEntry(index).setIp60001PgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip60001HoldPgmName
	 *	@return ip60001HoldPgmName
	 */
   public char[] getIp60001HoldPgmName() throws CFException  {              
   		return ip60001EventLogWorkArea.getIp60001HoldPgmName();
   }

  
	/**
	*  set variable ip60001HoldPgmName
	*  @param value
	**/
   public void setIp60001HoldPgmName(char[] value) throws CFException {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(value);
   } 

     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001HoldPgmName(char[] source, int sourceIndex) throws CFException {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex);
   	
   }
   
   public void setIp60001HoldPgmName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001HoldPgmName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip60001HoldPgmName with another Field
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source);
   }  
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source, int sourceIndex,int sourceLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip60001HoldPgmName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001HoldPgmName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip60001EventLogWorkArea.setIp60001HoldPgmName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip829010Ctx getIp829010Ctx() {
            return Ip829010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public UpdateEventLogOutCtx clone() {
        UpdateEventLogOutCtx cloneObj = new UpdateEventLogOutCtx();
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public UpdateEventLogOutCtx getUpdateEventLogOutCtx() {
            return new UpdateEventLogOutCtx();
    }
}
