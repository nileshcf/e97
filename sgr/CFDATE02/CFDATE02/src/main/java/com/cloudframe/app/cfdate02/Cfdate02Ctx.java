package com.cloudframe.app.cfdate02;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.cfdate02.dto.TSpoProdTableInit;
import com.cloudframe.app.cfdate02.dto.TGlbProdTableInit;
import com.cloudframe.app.cfdate02.dto.LCpduTableInit;
import com.cloudframe.app.cfdate02.dto.TM2mPromoTableInit;
import com.cloudframe.app.cfdate02.dto.TLnshrgrpTableInit;
import com.cloudframe.app.cfdate02.file.records.RlatuRec;
import com.cloudframe.app.cfdate02.file.records.IldcrLnShrGrpRemData;
import com.cloudframe.app.cfdate02.file.records.RlcbmBillMsgRecord;
import com.cloudframe.app.cfdate02.file.records.OldclLnShrBcActvData;
import com.cloudframe.app.cfdate02.file.records.RlhzaRcCycleData;
import com.cloudframe.app.cfdate02.dto.Sqlca;
import com.cloudframe.app.cfdate02.dto.TMtnStatTableInit;
import com.cloudframe.app.cfdate02.dto.TDataAlpTableInit;
import com.cloudframe.app.cfdate02.file.records.RldusInEocRefBlData;
import com.cloudframe.app.cfdate02.file.records.IldclLnShrBcActvData;
import com.cloudframe.app.cfdate02.file.records.FlgusInEocRefBlData;
import com.cloudframe.app.cfdate02.file.records.FlguuInEocUsgBlData;
import com.cloudframe.app.cfdate02.dto.BmdCdrInfo;
import com.cloudframe.app.cfdate02.dto.CmnErrorMessages;
import com.cloudframe.app.cfdate02.file.records.OldcrLnShrGrpRemData;
import com.cloudframe.app.global.sharedvar.ReturnJobNameGroup;
import com.cloudframe.app.cfdate02.file.records.RlduuInEocUsgBlData;
import com.cloudframe.app.cfdate02.dto.WscdlCalDate;
import com.cloudframe.app.cfdate02.dto.RcCycleDateInit;
import com.cloudframe.app.cfdate02.dto.TRevoTableInit;
import com.cloudframe.app.cfdate02.file.records.RlatdRec;
import com.cloudframe.app.cfdate02.dto.TSvcProdTableInit;
import com.cloudframe.app.cfdate02.dto.CmnAcmn009pParms;
import com.cloudframe.app.cfdate02.dto.TSpoAlwTableInit;
import com.cloudframe.app.cfdate02.dto.Work;
import com.cloudframe.app.cfdate02.dto.TCpduTableInit;
import com.cloudframe.app.cfdate02.dto.TDataSfoTableInit;
import com.cloudframe.app.cfdate02.file.records.Rl001CycleInputData;


@Context
public class Cfdate02Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    CmnErrorMessages cmnErrorMessages;
    TRevoTableInit tRevoTableInit;
    RlduuInEocUsgBlData rlduuInEocUsgBlData;
    FlguuInEocUsgBlData flguuInEocUsgBlData;
    Sqlca sqlca;
    TDataAlpTableInit tDataAlpTableInit;
    WscdlCalDate wscdlCalDate;
    TSpoAlwTableInit tSpoAlwTableInit;
    TDataSfoTableInit tDataSfoTableInit;
    TCpduTableInit tCpduTableInit;
    TLnshrgrpTableInit tLnshrgrpTableInit;
    TM2mPromoTableInit tM2mPromoTableInit;
    FlgusInEocRefBlData flgusInEocRefBlData;
    RlatdRec rlatdRec;
    RlcbmBillMsgRecord rlcbmBillMsgRecord;
    TMtnStatTableInit tMtnStatTableInit;
    Work work;
    RlhzaRcCycleData rlhzaRcCycleData;
    OldcrLnShrGrpRemData oldcrLnShrGrpRemData;
    BmdCdrInfo bmdCdrInfo;
    RlatuRec rlatuRec;
    OldclLnShrBcActvData oldclLnShrBcActvData;
    RldusInEocRefBlData rldusInEocRefBlData;
    TSvcProdTableInit tSvcProdTableInit;
    TGlbProdTableInit tGlbProdTableInit;
    RcCycleDateInit rcCycleDateInit;
    ReturnJobNameGroup returnJobNameGroup;
    IldclLnShrBcActvData ildclLnShrBcActvData;
    IldcrLnShrGrpRemData ildcrLnShrGrpRemData;
    LCpduTableInit lCpduTableInit;
    Rl001CycleInputData rl001CycleInputData;
    CmnAcmn009pParms cmnAcmn009pParms;
    TSpoProdTableInit tSpoProdTableInit;


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


    public CmnErrorMessages getCmnErrorMessages() {
        if (cmnErrorMessages == null) {
            cmnErrorMessages = new CmnErrorMessages();
        }

        return cmnErrorMessages;
    }

    public void setCmnErrorMessages(CmnErrorMessages cmnErrorMessages) {
        this.cmnErrorMessages = cmnErrorMessages;
    }
    public TRevoTableInit getTRevoTableInit() {
        if (tRevoTableInit == null) {
            tRevoTableInit = new TRevoTableInit();
        }

        return tRevoTableInit;
    }

    public void setTRevoTableInit(TRevoTableInit tRevoTableInit) {
        this.tRevoTableInit = tRevoTableInit;
    }
    public RlduuInEocUsgBlData getRlduuInEocUsgBlData() {
        if (rlduuInEocUsgBlData == null) {
            rlduuInEocUsgBlData = new RlduuInEocUsgBlData();
        }

        return rlduuInEocUsgBlData;
    }

    public void setRlduuInEocUsgBlData(RlduuInEocUsgBlData rlduuInEocUsgBlData) {
        this.rlduuInEocUsgBlData = rlduuInEocUsgBlData;
    }
    public FlguuInEocUsgBlData getFlguuInEocUsgBlData() {
        if (flguuInEocUsgBlData == null) {
            flguuInEocUsgBlData = new FlguuInEocUsgBlData();
        }

        return flguuInEocUsgBlData;
    }

    public void setFlguuInEocUsgBlData(FlguuInEocUsgBlData flguuInEocUsgBlData) {
        this.flguuInEocUsgBlData = flguuInEocUsgBlData;
    }
    public Sqlca getSqlca() {
        if (sqlca == null) {
            sqlca = new Sqlca();
        }

        return sqlca;
    }

    public void setSqlca(Sqlca sqlca) {
        this.sqlca = sqlca;
    }
    public TDataAlpTableInit getTDataAlpTableInit() {
        if (tDataAlpTableInit == null) {
            tDataAlpTableInit = new TDataAlpTableInit();
        }

        return tDataAlpTableInit;
    }

    public void setTDataAlpTableInit(TDataAlpTableInit tDataAlpTableInit) {
        this.tDataAlpTableInit = tDataAlpTableInit;
    }
    public WscdlCalDate getWscdlCalDate() {
        if (wscdlCalDate == null) {
            wscdlCalDate = new WscdlCalDate();
        }

        return wscdlCalDate;
    }

    public void setWscdlCalDate(WscdlCalDate wscdlCalDate) {
        this.wscdlCalDate = wscdlCalDate;
    }
    public TSpoAlwTableInit getTSpoAlwTableInit() {
        if (tSpoAlwTableInit == null) {
            tSpoAlwTableInit = new TSpoAlwTableInit();
        }

        return tSpoAlwTableInit;
    }

    public void setTSpoAlwTableInit(TSpoAlwTableInit tSpoAlwTableInit) {
        this.tSpoAlwTableInit = tSpoAlwTableInit;
    }
    public TDataSfoTableInit getTDataSfoTableInit() {
        if (tDataSfoTableInit == null) {
            tDataSfoTableInit = new TDataSfoTableInit();
        }

        return tDataSfoTableInit;
    }

    public void setTDataSfoTableInit(TDataSfoTableInit tDataSfoTableInit) {
        this.tDataSfoTableInit = tDataSfoTableInit;
    }
    public TCpduTableInit getTCpduTableInit() {
        if (tCpduTableInit == null) {
            tCpduTableInit = new TCpduTableInit();
        }

        return tCpduTableInit;
    }

    public void setTCpduTableInit(TCpduTableInit tCpduTableInit) {
        this.tCpduTableInit = tCpduTableInit;
    }
    public TLnshrgrpTableInit getTLnshrgrpTableInit() {
        if (tLnshrgrpTableInit == null) {
            tLnshrgrpTableInit = new TLnshrgrpTableInit();
        }

        return tLnshrgrpTableInit;
    }

    public void setTLnshrgrpTableInit(TLnshrgrpTableInit tLnshrgrpTableInit) {
        this.tLnshrgrpTableInit = tLnshrgrpTableInit;
    }
    public TM2mPromoTableInit getTM2mPromoTableInit() {
        if (tM2mPromoTableInit == null) {
            tM2mPromoTableInit = new TM2mPromoTableInit();
        }

        return tM2mPromoTableInit;
    }

    public void setTM2mPromoTableInit(TM2mPromoTableInit tM2mPromoTableInit) {
        this.tM2mPromoTableInit = tM2mPromoTableInit;
    }
    public FlgusInEocRefBlData getFlgusInEocRefBlData() {
        if (flgusInEocRefBlData == null) {
            flgusInEocRefBlData = new FlgusInEocRefBlData();
        }

        return flgusInEocRefBlData;
    }

    public void setFlgusInEocRefBlData(FlgusInEocRefBlData flgusInEocRefBlData) {
        this.flgusInEocRefBlData = flgusInEocRefBlData;
    }
    public RlatdRec getRlatdRec() {
        if (rlatdRec == null) {
            rlatdRec = new RlatdRec();
        }

        return rlatdRec;
    }

    public void setRlatdRec(RlatdRec rlatdRec) {
        this.rlatdRec = rlatdRec;
    }
    public RlcbmBillMsgRecord getRlcbmBillMsgRecord() {
        if (rlcbmBillMsgRecord == null) {
            rlcbmBillMsgRecord = new RlcbmBillMsgRecord();
        }

        return rlcbmBillMsgRecord;
    }

    public void setRlcbmBillMsgRecord(RlcbmBillMsgRecord rlcbmBillMsgRecord) {
        this.rlcbmBillMsgRecord = rlcbmBillMsgRecord;
    }
    public TMtnStatTableInit getTMtnStatTableInit() {
        if (tMtnStatTableInit == null) {
            tMtnStatTableInit = new TMtnStatTableInit();
        }

        return tMtnStatTableInit;
    }

    public void setTMtnStatTableInit(TMtnStatTableInit tMtnStatTableInit) {
        this.tMtnStatTableInit = tMtnStatTableInit;
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
    public RlhzaRcCycleData getRlhzaRcCycleData() {
        if (rlhzaRcCycleData == null) {
            rlhzaRcCycleData = new RlhzaRcCycleData();
        }

        return rlhzaRcCycleData;
    }

    public void setRlhzaRcCycleData(RlhzaRcCycleData rlhzaRcCycleData) {
        this.rlhzaRcCycleData = rlhzaRcCycleData;
    }
    public OldcrLnShrGrpRemData getOldcrLnShrGrpRemData() {
        if (oldcrLnShrGrpRemData == null) {
            oldcrLnShrGrpRemData = new OldcrLnShrGrpRemData();
        }

        return oldcrLnShrGrpRemData;
    }

    public void setOldcrLnShrGrpRemData(OldcrLnShrGrpRemData oldcrLnShrGrpRemData) {
        this.oldcrLnShrGrpRemData = oldcrLnShrGrpRemData;
    }
    public BmdCdrInfo getBmdCdrInfo() {
        if (bmdCdrInfo == null) {
            bmdCdrInfo = new BmdCdrInfo();
        }

        return bmdCdrInfo;
    }

    public void setBmdCdrInfo(BmdCdrInfo bmdCdrInfo) {
        this.bmdCdrInfo = bmdCdrInfo;
    }
    public RlatuRec getRlatuRec() {
        if (rlatuRec == null) {
            rlatuRec = new RlatuRec();
        }

        return rlatuRec;
    }

    public void setRlatuRec(RlatuRec rlatuRec) {
        this.rlatuRec = rlatuRec;
    }
    public OldclLnShrBcActvData getOldclLnShrBcActvData() {
        if (oldclLnShrBcActvData == null) {
            oldclLnShrBcActvData = new OldclLnShrBcActvData();
        }

        return oldclLnShrBcActvData;
    }

    public void setOldclLnShrBcActvData(OldclLnShrBcActvData oldclLnShrBcActvData) {
        this.oldclLnShrBcActvData = oldclLnShrBcActvData;
    }
    public RldusInEocRefBlData getRldusInEocRefBlData() {
        if (rldusInEocRefBlData == null) {
            rldusInEocRefBlData = new RldusInEocRefBlData();
        }

        return rldusInEocRefBlData;
    }

    public void setRldusInEocRefBlData(RldusInEocRefBlData rldusInEocRefBlData) {
        this.rldusInEocRefBlData = rldusInEocRefBlData;
    }
    public TSvcProdTableInit getTSvcProdTableInit() {
        if (tSvcProdTableInit == null) {
            tSvcProdTableInit = new TSvcProdTableInit();
        }

        return tSvcProdTableInit;
    }

    public void setTSvcProdTableInit(TSvcProdTableInit tSvcProdTableInit) {
        this.tSvcProdTableInit = tSvcProdTableInit;
    }
    public TGlbProdTableInit getTGlbProdTableInit() {
        if (tGlbProdTableInit == null) {
            tGlbProdTableInit = new TGlbProdTableInit();
        }

        return tGlbProdTableInit;
    }

    public void setTGlbProdTableInit(TGlbProdTableInit tGlbProdTableInit) {
        this.tGlbProdTableInit = tGlbProdTableInit;
    }
    public RcCycleDateInit getRcCycleDateInit() {
        if (rcCycleDateInit == null) {
            rcCycleDateInit = new RcCycleDateInit();
        }

        return rcCycleDateInit;
    }

    public void setRcCycleDateInit(RcCycleDateInit rcCycleDateInit) {
        this.rcCycleDateInit = rcCycleDateInit;
    }
    public ReturnJobNameGroup getReturnJobNameGroup() {
        if (returnJobNameGroup == null) {
            returnJobNameGroup = globalCtx.getGlobalDto(ReturnJobNameGroup.class);
        }

        return returnJobNameGroup;
    }

    public IldclLnShrBcActvData getIldclLnShrBcActvData() {
        if (ildclLnShrBcActvData == null) {
            ildclLnShrBcActvData = new IldclLnShrBcActvData();
        }

        return ildclLnShrBcActvData;
    }

    public void setIldclLnShrBcActvData(IldclLnShrBcActvData ildclLnShrBcActvData) {
        this.ildclLnShrBcActvData = ildclLnShrBcActvData;
    }
    public IldcrLnShrGrpRemData getIldcrLnShrGrpRemData() {
        if (ildcrLnShrGrpRemData == null) {
            ildcrLnShrGrpRemData = new IldcrLnShrGrpRemData();
        }

        return ildcrLnShrGrpRemData;
    }

    public void setIldcrLnShrGrpRemData(IldcrLnShrGrpRemData ildcrLnShrGrpRemData) {
        this.ildcrLnShrGrpRemData = ildcrLnShrGrpRemData;
    }
    public LCpduTableInit getLCpduTableInit() {
        if (lCpduTableInit == null) {
            lCpduTableInit = new LCpduTableInit();
        }

        return lCpduTableInit;
    }

    public void setLCpduTableInit(LCpduTableInit lCpduTableInit) {
        this.lCpduTableInit = lCpduTableInit;
    }
    public Rl001CycleInputData getRl001CycleInputData() {
        if (rl001CycleInputData == null) {
            rl001CycleInputData = new Rl001CycleInputData();
        }

        return rl001CycleInputData;
    }

    public void setRl001CycleInputData(Rl001CycleInputData rl001CycleInputData) {
        this.rl001CycleInputData = rl001CycleInputData;
    }
    public CmnAcmn009pParms getCmnAcmn009pParms() {
        if (cmnAcmn009pParms == null) {
            cmnAcmn009pParms = new CmnAcmn009pParms();
        }

        return cmnAcmn009pParms;
    }

    public void setCmnAcmn009pParms(CmnAcmn009pParms cmnAcmn009pParms) {
        this.cmnAcmn009pParms = cmnAcmn009pParms;
    }
    public TSpoProdTableInit getTSpoProdTableInit() {
        if (tSpoProdTableInit == null) {
            tSpoProdTableInit = new TSpoProdTableInit();
        }

        return tSpoProdTableInit;
    }

    public void setTSpoProdTableInit(TSpoProdTableInit tSpoProdTableInit) {
        this.tSpoProdTableInit = tSpoProdTableInit;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += cmnErrorMessages.hashCode();
        str += tRevoTableInit.hashCode();
        str += rlduuInEocUsgBlData.hashCode();
        str += flguuInEocUsgBlData.hashCode();
        str += sqlca.hashCode();
        str += tDataAlpTableInit.hashCode();
        str += wscdlCalDate.hashCode();
        str += tSpoAlwTableInit.hashCode();
        str += tDataSfoTableInit.hashCode();
        str += tCpduTableInit.hashCode();
        str += tLnshrgrpTableInit.hashCode();
        str += tM2mPromoTableInit.hashCode();
        str += flgusInEocRefBlData.hashCode();
        str += rlatdRec.hashCode();
        str += rlcbmBillMsgRecord.hashCode();
        str += tMtnStatTableInit.hashCode();
        str += work.hashCode();
        str += rlhzaRcCycleData.hashCode();
        str += oldcrLnShrGrpRemData.hashCode();
        str += bmdCdrInfo.hashCode();
        str += rlatuRec.hashCode();
        str += oldclLnShrBcActvData.hashCode();
        str += rldusInEocRefBlData.hashCode();
        str += tSvcProdTableInit.hashCode();
        str += tGlbProdTableInit.hashCode();
        str += rcCycleDateInit.hashCode();
        str += returnJobNameGroup.hashCode();
        str += ildclLnShrBcActvData.hashCode();
        str += ildcrLnShrGrpRemData.hashCode();
        str += lCpduTableInit.hashCode();
        str += rl001CycleInputData.hashCode();
        str += cmnAcmn009pParms.hashCode();
        str += tSpoProdTableInit.hashCode();
       return str.hashCode();
    }

    public Cfdate02Ctx clone() {
        Cfdate02Ctx cloneObj = new Cfdate02Ctx();
        cloneObj.cmnErrorMessages = new CmnErrorMessages();
        cloneObj.cmnErrorMessages.set(cmnErrorMessages.getClonedField());
        cloneObj.tRevoTableInit = new TRevoTableInit();
        cloneObj.tRevoTableInit.set(tRevoTableInit.getClonedField());
        cloneObj.rlduuInEocUsgBlData = new RlduuInEocUsgBlData();
        cloneObj.rlduuInEocUsgBlData.set(rlduuInEocUsgBlData.getClonedField());
        cloneObj.flguuInEocUsgBlData = new FlguuInEocUsgBlData();
        cloneObj.flguuInEocUsgBlData.set(flguuInEocUsgBlData.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.tDataAlpTableInit = new TDataAlpTableInit();
        cloneObj.tDataAlpTableInit.set(tDataAlpTableInit.getClonedField());
        cloneObj.wscdlCalDate = new WscdlCalDate();
        cloneObj.wscdlCalDate.set(wscdlCalDate.getClonedField());
        cloneObj.tSpoAlwTableInit = new TSpoAlwTableInit();
        cloneObj.tSpoAlwTableInit.set(tSpoAlwTableInit.getClonedField());
        cloneObj.tDataSfoTableInit = new TDataSfoTableInit();
        cloneObj.tDataSfoTableInit.set(tDataSfoTableInit.getClonedField());
        cloneObj.tCpduTableInit = new TCpduTableInit();
        cloneObj.tCpduTableInit.set(tCpduTableInit.getClonedField());
        cloneObj.tLnshrgrpTableInit = new TLnshrgrpTableInit();
        cloneObj.tLnshrgrpTableInit.set(tLnshrgrpTableInit.getClonedField());
        cloneObj.tM2mPromoTableInit = new TM2mPromoTableInit();
        cloneObj.tM2mPromoTableInit.set(tM2mPromoTableInit.getClonedField());
        cloneObj.flgusInEocRefBlData = new FlgusInEocRefBlData();
        cloneObj.flgusInEocRefBlData.set(flgusInEocRefBlData.getClonedField());
        cloneObj.rlatdRec = new RlatdRec();
        cloneObj.rlatdRec.set(rlatdRec.getClonedField());
        cloneObj.rlcbmBillMsgRecord = new RlcbmBillMsgRecord();
        cloneObj.rlcbmBillMsgRecord.set(rlcbmBillMsgRecord.getClonedField());
        cloneObj.tMtnStatTableInit = new TMtnStatTableInit();
        cloneObj.tMtnStatTableInit.set(tMtnStatTableInit.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.rlhzaRcCycleData = new RlhzaRcCycleData();
        cloneObj.rlhzaRcCycleData.set(rlhzaRcCycleData.getClonedField());
        cloneObj.oldcrLnShrGrpRemData = new OldcrLnShrGrpRemData();
        cloneObj.oldcrLnShrGrpRemData.set(oldcrLnShrGrpRemData.getClonedField());
        cloneObj.bmdCdrInfo = new BmdCdrInfo();
        cloneObj.bmdCdrInfo.set(bmdCdrInfo.getClonedField());
        cloneObj.rlatuRec = new RlatuRec();
        cloneObj.rlatuRec.set(rlatuRec.getClonedField());
        cloneObj.oldclLnShrBcActvData = new OldclLnShrBcActvData();
        cloneObj.oldclLnShrBcActvData.set(oldclLnShrBcActvData.getClonedField());
        cloneObj.rldusInEocRefBlData = new RldusInEocRefBlData();
        cloneObj.rldusInEocRefBlData.set(rldusInEocRefBlData.getClonedField());
        cloneObj.tSvcProdTableInit = new TSvcProdTableInit();
        cloneObj.tSvcProdTableInit.set(tSvcProdTableInit.getClonedField());
        cloneObj.tGlbProdTableInit = new TGlbProdTableInit();
        cloneObj.tGlbProdTableInit.set(tGlbProdTableInit.getClonedField());
        cloneObj.rcCycleDateInit = new RcCycleDateInit();
        cloneObj.rcCycleDateInit.set(rcCycleDateInit.getClonedField());
        cloneObj.returnJobNameGroup = new ReturnJobNameGroup();
        cloneObj.returnJobNameGroup.set(returnJobNameGroup.getClonedField());
        cloneObj.ildclLnShrBcActvData = new IldclLnShrBcActvData();
        cloneObj.ildclLnShrBcActvData.set(ildclLnShrBcActvData.getClonedField());
        cloneObj.ildcrLnShrGrpRemData = new IldcrLnShrGrpRemData();
        cloneObj.ildcrLnShrGrpRemData.set(ildcrLnShrGrpRemData.getClonedField());
        cloneObj.lCpduTableInit = new LCpduTableInit();
        cloneObj.lCpduTableInit.set(lCpduTableInit.getClonedField());
        cloneObj.rl001CycleInputData = new Rl001CycleInputData();
        cloneObj.rl001CycleInputData.set(rl001CycleInputData.getClonedField());
        cloneObj.cmnAcmn009pParms = new CmnAcmn009pParms();
        cloneObj.cmnAcmn009pParms.set(cmnAcmn009pParms.getClonedField());
        cloneObj.tSpoProdTableInit = new TSpoProdTableInit();
        cloneObj.tSpoProdTableInit.set(tSpoProdTableInit.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Work work = Cfdate02Ctx.this.getWork();

	/**
	 *	Returns the value of bkupDtIso
	 *	@return bkupDtIso
	 */
	public long getBkupDtIso() throws CFException {
   		return work.getBkupDtIso();
	}


	/**
	 *	Returns String value of bkupDtIso
	 *	@return bkupDtIso
	 */
	public char[]  getBkupDtIsoString() throws CFException {
	     return String.valueOf(work.getBkupDtIsoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bkupDtIsoIsNumeric()  throws CFException{
	    return work.bkupDtIsoIsNumeric();
	}

	/**
	 * 	Update BkupDtIso with the passed value
	 *	@param number
	 */
	public void setBkupDtIso(long number)  throws CFException{
		work.setBkupDtIso(number);
	}
	

	
	/**
	 * 	Update BkupDtIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setBkupDtIso(char[] value)  throws CFException {
		work.setBkupDtIso(value);
	}
	
	/**
	 * 	Update BkupDtIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBkupDtIsoString(char[] value)  throws CFException{
		work.setBkupDtIso(value);
	}	

	/**
	 *	Returns the value of integerOfDate
	 *	@return integerOfDate
	 */
	public int getIntegerOfDate() throws CFException {        
   		return work.getIntegerOfDate();
	}
	
	/**
	 * 	Update IntegerOfDate with the passed value
	 *	@param number
	 */
	public void setIntegerOfDate(int number)  throws CFException{
		work.setIntegerOfDate(number);
	}


	public void setIntegerOfDate(long number)  throws CFException{
		work.setIntegerOfDate((int)number);
	}



        public Cfdate02Ctx getCfdate02Ctx() {
            return Cfdate02Ctx.this;
        }

        public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
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

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessOutCtx implements Cloneable {
     Work work = Cfdate02Ctx.this.getWork();

	/**
	 *	Returns the value of bkupDtIso
	 *	@return bkupDtIso
	 */
	public long getBkupDtIso() throws CFException {
   		return work.getBkupDtIso();
	}


	/**
	 *	Returns String value of bkupDtIso
	 *	@return bkupDtIso
	 */
	public char[]  getBkupDtIsoString() throws CFException {
	     return String.valueOf(work.getBkupDtIsoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bkupDtIsoIsNumeric()  throws CFException{
	    return work.bkupDtIsoIsNumeric();
	}

	/**
	 * 	Update BkupDtIso with the passed value
	 *	@param number
	 */
	public void setBkupDtIso(long number)  throws CFException{
		work.setBkupDtIso(number);
	}
	

	
	/**
	 * 	Update BkupDtIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setBkupDtIso(char[] value)  throws CFException {
		work.setBkupDtIso(value);
	}
	
	/**
	 * 	Update BkupDtIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBkupDtIsoString(char[] value)  throws CFException{
		work.setBkupDtIso(value);
	}	

	/**
	 *	Returns the value of integerOfDate
	 *	@return integerOfDate
	 */
	public int getIntegerOfDate() throws CFException {        
   		return work.getIntegerOfDate();
	}
	
	/**
	 * 	Update IntegerOfDate with the passed value
	 *	@param number
	 */
	public void setIntegerOfDate(int number)  throws CFException{
		work.setIntegerOfDate(number);
	}


	public void setIntegerOfDate(long number)  throws CFException{
		work.setIntegerOfDate((int)number);
	}



        public Cfdate02Ctx getCfdate02Ctx() {
            return Cfdate02Ctx.this;
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

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
}
