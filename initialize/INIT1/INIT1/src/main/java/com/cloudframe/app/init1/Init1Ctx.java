package com.cloudframe.app.init1;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.init1.dto.FillerBeginEnd;
import com.cloudframe.app.init1.dto.TMtnStatTableInit;
import com.cloudframe.app.init1.dto.BillPeriodDates;
import com.cloudframe.app.init1.dto.WsrevRevoStatRecord;
import com.cloudframe.app.init1.dto.ErrAcctRecord;
import com.cloudframe.app.init1.dto.BmdCdrInfo;
import com.cloudframe.app.init1.dto.TCpduTableInit;
import com.cloudframe.app.init1.dto.TRevoTableInit;
import com.cloudframe.app.init1.dto.Work;
import com.cloudframe.app.init1.dto.WcdloDateTable;
import com.cloudframe.app.init1.dto.WscdlCalDate;
import com.cloudframe.app.init1.dto.RcCycleDateInit;
import com.cloudframe.app.init1.dto.TLnshrgrpTableInit;
import com.cloudframe.app.init1.dto.WcdloCycEndDt;
import com.cloudframe.app.init1.dto.Test1;
import com.cloudframe.app.init1.dto.TSvcProdTableInit;
import com.cloudframe.app.init1.dto.TSpoAlwTableInit;
import com.cloudframe.app.global.sharedvar.ReturnJobNameGroup;
import com.cloudframe.app.init1.dto.FillerBeginEndMid1;
import com.cloudframe.app.init1.dto.WcdloDateChar;
import com.cloudframe.app.init1.dto.LCpduTableInit;
import com.cloudframe.app.init1.dto.NoFiller;
import com.cloudframe.app.init1.dto.CycdateInfo;
import com.cloudframe.app.init1.dto.FillerBeginEnd1;
import com.cloudframe.app.init1.dto.WcdloCycStartDt;
import com.cloudframe.app.init1.dto.IypData6;
import com.cloudframe.app.init1.dto.SaveInfoArea;
import com.cloudframe.app.init1.dto.RlcbmBillMsgDtlGroup;
import com.cloudframe.app.init1.dto.TGlbProdTableInit;
import com.cloudframe.app.init1.dto.Xcprs01;
import com.cloudframe.app.init1.dto.CmnAcmn009pParms;
import com.cloudframe.app.init1.dto.TSpoProdTableInit;
import com.cloudframe.app.init1.dto.FlguuInEocUsgBlData;
import com.cloudframe.app.init1.dto.Bilrlu5f;
import com.cloudframe.app.init1.dto.Rl001CycleInputData;
import com.cloudframe.app.init1.dto.KeyUsgPrev;
import com.cloudframe.app.init1.dto.Rlm2tPromoCustMtnRec;
import com.cloudframe.app.init1.dto.TV20Table;
import com.cloudframe.app.init1.dto.CmnErrorMessages;
import com.cloudframe.app.init1.dto.TDataAlpTableInit;
import com.cloudframe.app.init1.dto.FillerBeginEndMid;
import com.cloudframe.app.init1.dto.Messages;
import com.cloudframe.app.init1.dto.CycleInfo;
import com.cloudframe.app.init1.dto.TDataSfoTableInit;
import com.cloudframe.app.init1.dto.InputRec;
import com.cloudframe.app.init1.dto.Counters;
import com.cloudframe.app.init1.dto.DclWipBlCycPhaseAudit;
import com.cloudframe.app.init1.dto.RlhzaRcCycleData;
import com.cloudframe.app.init1.dto.WvExtrDetails;
import com.cloudframe.app.init1.dto.Sqlca;
import com.cloudframe.app.init1.dto.TM2mPromoTableInit;
import com.cloudframe.app.init1.dto.WvExtrRecord;
import com.cloudframe.app.init1.dto.DclBlAcctSvcProd;
import com.cloudframe.app.init1.dto.RlduuInEocUsgBlData;


@Context
public class Init1Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    IypData6 iypData6;
    SaveInfoArea saveInfoArea;
    DclBlAcctSvcProd dclBlAcctSvcProd;
    TRevoTableInit tRevoTableInit;
    CycdateInfo cycdateInfo;
    WvExtrRecord wvExtrRecord;
    TM2mPromoTableInit tM2mPromoTableInit;
    WscdlCalDate wscdlCalDate;
    CmnAcmn009pParms cmnAcmn009pParms;
    WsrevRevoStatRecord wsrevRevoStatRecord;
    RlduuInEocUsgBlData rlduuInEocUsgBlData;
    TSpoProdTableInit tSpoProdTableInit;
    Counters counters;
    Work work;
    FillerBeginEnd1 fillerBeginEnd1;
    LCpduTableInit lCpduTableInit;
    TMtnStatTableInit tMtnStatTableInit;
    FillerBeginEndMid1 fillerBeginEndMid1;
    DclWipBlCycPhaseAudit dclWipBlCycPhaseAudit;
    RcCycleDateInit rcCycleDateInit;
    FillerBeginEnd fillerBeginEnd;
    TDataSfoTableInit tDataSfoTableInit;
    CycleInfo cycleInfo;
    CmnErrorMessages cmnErrorMessages;
    RlcbmBillMsgDtlGroup rlcbmBillMsgDtlGroup;
    FillerBeginEndMid fillerBeginEndMid;
    Bilrlu5f bilrlu5f;
    Xcprs01 xcprs01;
    BmdCdrInfo bmdCdrInfo;
    Rlm2tPromoCustMtnRec rlm2tPromoCustMtnRec;
    TSvcProdTableInit tSvcProdTableInit;
    FlguuInEocUsgBlData flguuInEocUsgBlData;
    TCpduTableInit tCpduTableInit;
    Rl001CycleInputData rl001CycleInputData;
    Sqlca sqlca;
    NoFiller noFiller;
    TV20Table tV20Table;
    ReturnJobNameGroup returnJobNameGroup;
    TLnshrgrpTableInit tLnshrgrpTableInit;
    TSpoAlwTableInit tSpoAlwTableInit;
    RlhzaRcCycleData rlhzaRcCycleData;
    TDataAlpTableInit tDataAlpTableInit;
    InputRec inputRec;
    Test1 test1;
    TGlbProdTableInit tGlbProdTableInit;


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


    public IypData6 getIypData6() {
        if (iypData6 == null) {
            iypData6 = new IypData6();
        }

        return iypData6;
    }

    public void setIypData6(IypData6 iypData6) {
        this.iypData6 = iypData6;
    }
    public SaveInfoArea getSaveInfoArea() {
        if (saveInfoArea == null) {
            saveInfoArea = new SaveInfoArea();
        }

        return saveInfoArea;
    }

    public void setSaveInfoArea(SaveInfoArea saveInfoArea) {
        this.saveInfoArea = saveInfoArea;
    }
    public DclBlAcctSvcProd getDclBlAcctSvcProd() {
        if (dclBlAcctSvcProd == null) {
            dclBlAcctSvcProd = new DclBlAcctSvcProd();
        }

        return dclBlAcctSvcProd;
    }

    public void setDclBlAcctSvcProd(DclBlAcctSvcProd dclBlAcctSvcProd) {
        this.dclBlAcctSvcProd = dclBlAcctSvcProd;
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
    public CycdateInfo getCycdateInfo() {
        if (cycdateInfo == null) {
            cycdateInfo = new CycdateInfo();
        }

        return cycdateInfo;
    }

    public void setCycdateInfo(CycdateInfo cycdateInfo) {
        this.cycdateInfo = cycdateInfo;
    }
    public WvExtrRecord getWvExtrRecord() {
        if (wvExtrRecord == null) {
            wvExtrRecord = new WvExtrRecord();
        }

        return wvExtrRecord;
    }

    public void setWvExtrRecord(WvExtrRecord wvExtrRecord) {
        this.wvExtrRecord = wvExtrRecord;
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
    public WscdlCalDate getWscdlCalDate() {
        if (wscdlCalDate == null) {
            wscdlCalDate = new WscdlCalDate();
        }

        return wscdlCalDate;
    }

    public void setWscdlCalDate(WscdlCalDate wscdlCalDate) {
        this.wscdlCalDate = wscdlCalDate;
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
    public WsrevRevoStatRecord getWsrevRevoStatRecord() {
        if (wsrevRevoStatRecord == null) {
            wsrevRevoStatRecord = new WsrevRevoStatRecord();
        }

        return wsrevRevoStatRecord;
    }

    public void setWsrevRevoStatRecord(WsrevRevoStatRecord wsrevRevoStatRecord) {
        this.wsrevRevoStatRecord = wsrevRevoStatRecord;
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
    public TSpoProdTableInit getTSpoProdTableInit() {
        if (tSpoProdTableInit == null) {
            tSpoProdTableInit = new TSpoProdTableInit();
        }

        return tSpoProdTableInit;
    }

    public void setTSpoProdTableInit(TSpoProdTableInit tSpoProdTableInit) {
        this.tSpoProdTableInit = tSpoProdTableInit;
    }
    public Counters getCounters() {
        if (counters == null) {
            counters = new Counters();
        }

        return counters;
    }

    public void setCounters(Counters counters) {
        this.counters = counters;
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
    public FillerBeginEnd1 getFillerBeginEnd1() {
        if (fillerBeginEnd1 == null) {
            fillerBeginEnd1 = new FillerBeginEnd1();
        }

        return fillerBeginEnd1;
    }

    public void setFillerBeginEnd1(FillerBeginEnd1 fillerBeginEnd1) {
        this.fillerBeginEnd1 = fillerBeginEnd1;
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
    public TMtnStatTableInit getTMtnStatTableInit() {
        if (tMtnStatTableInit == null) {
            tMtnStatTableInit = new TMtnStatTableInit();
        }

        return tMtnStatTableInit;
    }

    public void setTMtnStatTableInit(TMtnStatTableInit tMtnStatTableInit) {
        this.tMtnStatTableInit = tMtnStatTableInit;
    }
    public FillerBeginEndMid1 getFillerBeginEndMid1() {
        if (fillerBeginEndMid1 == null) {
            fillerBeginEndMid1 = new FillerBeginEndMid1();
        }

        return fillerBeginEndMid1;
    }

    public void setFillerBeginEndMid1(FillerBeginEndMid1 fillerBeginEndMid1) {
        this.fillerBeginEndMid1 = fillerBeginEndMid1;
    }
    public DclWipBlCycPhaseAudit getDclWipBlCycPhaseAudit() {
        if (dclWipBlCycPhaseAudit == null) {
            dclWipBlCycPhaseAudit = new DclWipBlCycPhaseAudit();
        }

        return dclWipBlCycPhaseAudit;
    }

    public void setDclWipBlCycPhaseAudit(DclWipBlCycPhaseAudit dclWipBlCycPhaseAudit) {
        this.dclWipBlCycPhaseAudit = dclWipBlCycPhaseAudit;
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
    public FillerBeginEnd getFillerBeginEnd() {
        if (fillerBeginEnd == null) {
            fillerBeginEnd = new FillerBeginEnd();
        }

        return fillerBeginEnd;
    }

    public void setFillerBeginEnd(FillerBeginEnd fillerBeginEnd) {
        this.fillerBeginEnd = fillerBeginEnd;
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
    public CycleInfo getCycleInfo() {
        if (cycleInfo == null) {
            cycleInfo = new CycleInfo();
        }

        return cycleInfo;
    }

    public void setCycleInfo(CycleInfo cycleInfo) {
        this.cycleInfo = cycleInfo;
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
    public RlcbmBillMsgDtlGroup getRlcbmBillMsgDtlGroup() {
        if (rlcbmBillMsgDtlGroup == null) {
            rlcbmBillMsgDtlGroup = new RlcbmBillMsgDtlGroup();
        }

        return rlcbmBillMsgDtlGroup;
    }

    public void setRlcbmBillMsgDtlGroup(RlcbmBillMsgDtlGroup rlcbmBillMsgDtlGroup) {
        this.rlcbmBillMsgDtlGroup = rlcbmBillMsgDtlGroup;
    }
    public FillerBeginEndMid getFillerBeginEndMid() {
        if (fillerBeginEndMid == null) {
            fillerBeginEndMid = new FillerBeginEndMid();
        }

        return fillerBeginEndMid;
    }

    public void setFillerBeginEndMid(FillerBeginEndMid fillerBeginEndMid) {
        this.fillerBeginEndMid = fillerBeginEndMid;
    }
    public Bilrlu5f getBilrlu5f() {
        if (bilrlu5f == null) {
            bilrlu5f = new Bilrlu5f();
        }

        return bilrlu5f;
    }

    public void setBilrlu5f(Bilrlu5f bilrlu5f) {
        this.bilrlu5f = bilrlu5f;
    }
    public Xcprs01 getXcprs01() {
        if (xcprs01 == null) {
            xcprs01 = new Xcprs01();
        }

        return xcprs01;
    }

    public void setXcprs01(Xcprs01 xcprs01) {
        this.xcprs01 = xcprs01;
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
    public Rlm2tPromoCustMtnRec getRlm2tPromoCustMtnRec() {
        if (rlm2tPromoCustMtnRec == null) {
            rlm2tPromoCustMtnRec = new Rlm2tPromoCustMtnRec();
        }

        return rlm2tPromoCustMtnRec;
    }

    public void setRlm2tPromoCustMtnRec(Rlm2tPromoCustMtnRec rlm2tPromoCustMtnRec) {
        this.rlm2tPromoCustMtnRec = rlm2tPromoCustMtnRec;
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
    public FlguuInEocUsgBlData getFlguuInEocUsgBlData() {
        if (flguuInEocUsgBlData == null) {
            flguuInEocUsgBlData = new FlguuInEocUsgBlData();
        }

        return flguuInEocUsgBlData;
    }

    public void setFlguuInEocUsgBlData(FlguuInEocUsgBlData flguuInEocUsgBlData) {
        this.flguuInEocUsgBlData = flguuInEocUsgBlData;
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
    public Rl001CycleInputData getRl001CycleInputData() {
        if (rl001CycleInputData == null) {
            rl001CycleInputData = new Rl001CycleInputData();
        }

        return rl001CycleInputData;
    }

    public void setRl001CycleInputData(Rl001CycleInputData rl001CycleInputData) {
        this.rl001CycleInputData = rl001CycleInputData;
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
    public NoFiller getNoFiller() {
        if (noFiller == null) {
            noFiller = new NoFiller();
        }

        return noFiller;
    }

    public void setNoFiller(NoFiller noFiller) {
        this.noFiller = noFiller;
    }
    public TV20Table getTV20Table() {
        if (tV20Table == null) {
            tV20Table = new TV20Table();
        }

        return tV20Table;
    }

    public void setTV20Table(TV20Table tV20Table) {
        this.tV20Table = tV20Table;
    }
    public ReturnJobNameGroup getReturnJobNameGroup() {
        if (returnJobNameGroup == null) {
            returnJobNameGroup = globalCtx.getGlobalDto(ReturnJobNameGroup.class);
        }

        return returnJobNameGroup;
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
    public TSpoAlwTableInit getTSpoAlwTableInit() {
        if (tSpoAlwTableInit == null) {
            tSpoAlwTableInit = new TSpoAlwTableInit();
        }

        return tSpoAlwTableInit;
    }

    public void setTSpoAlwTableInit(TSpoAlwTableInit tSpoAlwTableInit) {
        this.tSpoAlwTableInit = tSpoAlwTableInit;
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
    public TDataAlpTableInit getTDataAlpTableInit() {
        if (tDataAlpTableInit == null) {
            tDataAlpTableInit = new TDataAlpTableInit();
        }

        return tDataAlpTableInit;
    }

    public void setTDataAlpTableInit(TDataAlpTableInit tDataAlpTableInit) {
        this.tDataAlpTableInit = tDataAlpTableInit;
    }
    public InputRec getInputRec() {
        if (inputRec == null) {
            inputRec = new InputRec();
        }

        return inputRec;
    }

    public void setInputRec(InputRec inputRec) {
        this.inputRec = inputRec;
    }
    public Test1 getTest1() {
        if (test1 == null) {
            test1 = new Test1();
        }

        return test1;
    }

    public void setTest1(Test1 test1) {
        this.test1 = test1;
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


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += iypData6.hashCode();
        str += saveInfoArea.hashCode();
        str += dclBlAcctSvcProd.hashCode();
        str += tRevoTableInit.hashCode();
        str += cycdateInfo.hashCode();
        str += wvExtrRecord.hashCode();
        str += tM2mPromoTableInit.hashCode();
        str += wscdlCalDate.hashCode();
        str += cmnAcmn009pParms.hashCode();
        str += wsrevRevoStatRecord.hashCode();
        str += rlduuInEocUsgBlData.hashCode();
        str += tSpoProdTableInit.hashCode();
        str += counters.hashCode();
        str += work.hashCode();
        str += fillerBeginEnd1.hashCode();
        str += lCpduTableInit.hashCode();
        str += tMtnStatTableInit.hashCode();
        str += fillerBeginEndMid1.hashCode();
        str += dclWipBlCycPhaseAudit.hashCode();
        str += rcCycleDateInit.hashCode();
        str += fillerBeginEnd.hashCode();
        str += tDataSfoTableInit.hashCode();
        str += cycleInfo.hashCode();
        str += cmnErrorMessages.hashCode();
        str += rlcbmBillMsgDtlGroup.hashCode();
        str += fillerBeginEndMid.hashCode();
        str += bilrlu5f.hashCode();
        str += xcprs01.hashCode();
        str += bmdCdrInfo.hashCode();
        str += rlm2tPromoCustMtnRec.hashCode();
        str += tSvcProdTableInit.hashCode();
        str += flguuInEocUsgBlData.hashCode();
        str += tCpduTableInit.hashCode();
        str += rl001CycleInputData.hashCode();
        str += sqlca.hashCode();
        str += noFiller.hashCode();
        str += tV20Table.hashCode();
        str += returnJobNameGroup.hashCode();
        str += tLnshrgrpTableInit.hashCode();
        str += tSpoAlwTableInit.hashCode();
        str += rlhzaRcCycleData.hashCode();
        str += tDataAlpTableInit.hashCode();
        str += inputRec.hashCode();
        str += test1.hashCode();
        str += tGlbProdTableInit.hashCode();
       return str.hashCode();
    }

    public Init1Ctx clone() {
        Init1Ctx cloneObj = new Init1Ctx();
        cloneObj.iypData6 = new IypData6();
        cloneObj.iypData6.set(iypData6.getClonedField());
        cloneObj.saveInfoArea = new SaveInfoArea();
        cloneObj.saveInfoArea.set(saveInfoArea.getClonedField());
        cloneObj.dclBlAcctSvcProd = new DclBlAcctSvcProd();
        cloneObj.dclBlAcctSvcProd.set(dclBlAcctSvcProd.getClonedField());
        cloneObj.tRevoTableInit = new TRevoTableInit();
        cloneObj.tRevoTableInit.set(tRevoTableInit.getClonedField());
        cloneObj.cycdateInfo = new CycdateInfo();
        cloneObj.cycdateInfo.set(cycdateInfo.getClonedField());
        cloneObj.wvExtrRecord = new WvExtrRecord();
        cloneObj.wvExtrRecord.set(wvExtrRecord.getClonedField());
        cloneObj.tM2mPromoTableInit = new TM2mPromoTableInit();
        cloneObj.tM2mPromoTableInit.set(tM2mPromoTableInit.getClonedField());
        cloneObj.wscdlCalDate = new WscdlCalDate();
        cloneObj.wscdlCalDate.set(wscdlCalDate.getClonedField());
        cloneObj.cmnAcmn009pParms = new CmnAcmn009pParms();
        cloneObj.cmnAcmn009pParms.set(cmnAcmn009pParms.getClonedField());
        cloneObj.wsrevRevoStatRecord = new WsrevRevoStatRecord();
        cloneObj.wsrevRevoStatRecord.set(wsrevRevoStatRecord.getClonedField());
        cloneObj.rlduuInEocUsgBlData = new RlduuInEocUsgBlData();
        cloneObj.rlduuInEocUsgBlData.set(rlduuInEocUsgBlData.getClonedField());
        cloneObj.tSpoProdTableInit = new TSpoProdTableInit();
        cloneObj.tSpoProdTableInit.set(tSpoProdTableInit.getClonedField());
        cloneObj.counters = new Counters();
        cloneObj.counters.set(counters.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.fillerBeginEnd1 = new FillerBeginEnd1();
        cloneObj.fillerBeginEnd1.set(fillerBeginEnd1.getClonedField());
        cloneObj.lCpduTableInit = new LCpduTableInit();
        cloneObj.lCpduTableInit.set(lCpduTableInit.getClonedField());
        cloneObj.tMtnStatTableInit = new TMtnStatTableInit();
        cloneObj.tMtnStatTableInit.set(tMtnStatTableInit.getClonedField());
        cloneObj.fillerBeginEndMid1 = new FillerBeginEndMid1();
        cloneObj.fillerBeginEndMid1.set(fillerBeginEndMid1.getClonedField());
        cloneObj.dclWipBlCycPhaseAudit = new DclWipBlCycPhaseAudit();
        cloneObj.dclWipBlCycPhaseAudit.set(dclWipBlCycPhaseAudit.getClonedField());
        cloneObj.rcCycleDateInit = new RcCycleDateInit();
        cloneObj.rcCycleDateInit.set(rcCycleDateInit.getClonedField());
        cloneObj.fillerBeginEnd = new FillerBeginEnd();
        cloneObj.fillerBeginEnd.set(fillerBeginEnd.getClonedField());
        cloneObj.tDataSfoTableInit = new TDataSfoTableInit();
        cloneObj.tDataSfoTableInit.set(tDataSfoTableInit.getClonedField());
        cloneObj.cycleInfo = new CycleInfo();
        cloneObj.cycleInfo.set(cycleInfo.getClonedField());
        cloneObj.cmnErrorMessages = new CmnErrorMessages();
        cloneObj.cmnErrorMessages.set(cmnErrorMessages.getClonedField());
        cloneObj.rlcbmBillMsgDtlGroup = new RlcbmBillMsgDtlGroup();
        cloneObj.rlcbmBillMsgDtlGroup.set(rlcbmBillMsgDtlGroup.getClonedField());
        cloneObj.fillerBeginEndMid = new FillerBeginEndMid();
        cloneObj.fillerBeginEndMid.set(fillerBeginEndMid.getClonedField());
        cloneObj.bilrlu5f = new Bilrlu5f();
        cloneObj.bilrlu5f.set(bilrlu5f.getClonedField());
        cloneObj.xcprs01 = new Xcprs01();
        cloneObj.xcprs01.set(xcprs01.getClonedField());
        cloneObj.bmdCdrInfo = new BmdCdrInfo();
        cloneObj.bmdCdrInfo.set(bmdCdrInfo.getClonedField());
        cloneObj.rlm2tPromoCustMtnRec = new Rlm2tPromoCustMtnRec();
        cloneObj.rlm2tPromoCustMtnRec.set(rlm2tPromoCustMtnRec.getClonedField());
        cloneObj.tSvcProdTableInit = new TSvcProdTableInit();
        cloneObj.tSvcProdTableInit.set(tSvcProdTableInit.getClonedField());
        cloneObj.flguuInEocUsgBlData = new FlguuInEocUsgBlData();
        cloneObj.flguuInEocUsgBlData.set(flguuInEocUsgBlData.getClonedField());
        cloneObj.tCpduTableInit = new TCpduTableInit();
        cloneObj.tCpduTableInit.set(tCpduTableInit.getClonedField());
        cloneObj.rl001CycleInputData = new Rl001CycleInputData();
        cloneObj.rl001CycleInputData.set(rl001CycleInputData.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.noFiller = new NoFiller();
        cloneObj.noFiller.set(noFiller.getClonedField());
        cloneObj.tV20Table = new TV20Table();
        cloneObj.tV20Table.set(tV20Table.getClonedField());
        cloneObj.returnJobNameGroup = new ReturnJobNameGroup();
        cloneObj.returnJobNameGroup.set(returnJobNameGroup.getClonedField());
        cloneObj.tLnshrgrpTableInit = new TLnshrgrpTableInit();
        cloneObj.tLnshrgrpTableInit.set(tLnshrgrpTableInit.getClonedField());
        cloneObj.tSpoAlwTableInit = new TSpoAlwTableInit();
        cloneObj.tSpoAlwTableInit.set(tSpoAlwTableInit.getClonedField());
        cloneObj.rlhzaRcCycleData = new RlhzaRcCycleData();
        cloneObj.rlhzaRcCycleData.set(rlhzaRcCycleData.getClonedField());
        cloneObj.tDataAlpTableInit = new TDataAlpTableInit();
        cloneObj.tDataAlpTableInit.set(tDataAlpTableInit.getClonedField());
        cloneObj.inputRec = new InputRec();
        cloneObj.inputRec.set(inputRec.getClonedField());
        cloneObj.test1 = new Test1();
        cloneObj.test1.set(test1.getClonedField());
        cloneObj.tGlbProdTableInit = new TGlbProdTableInit();
        cloneObj.tGlbProdTableInit.set(tGlbProdTableInit.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessOutCtx implements Cloneable {
     SaveInfoArea saveInfoArea = Init1Ctx.this.getSaveInfoArea();
     DclBlAcctSvcProd dclBlAcctSvcProd = Init1Ctx.this.getDclBlAcctSvcProd();
     CycdateInfo cycdateInfo = Init1Ctx.this.getCycdateInfo();
     Rlm2tPromoCustMtnRec rlm2tPromoCustMtnRec = Init1Ctx.this.getRlm2tPromoCustMtnRec();
     WscdlCalDate wscdlCalDate = Init1Ctx.this.getWscdlCalDate();
     CmnAcmn009pParms cmnAcmn009pParms = Init1Ctx.this.getCmnAcmn009pParms();
     WsrevRevoStatRecord wsrevRevoStatRecord = Init1Ctx.this.getWsrevRevoStatRecord();
     Counters counters = Init1Ctx.this.getCounters();
     Work work = Init1Ctx.this.getWork();
     DclWipBlCycPhaseAudit dclWipBlCycPhaseAudit = Init1Ctx.this.getDclWipBlCycPhaseAudit();
     TV20Table tV20Table = Init1Ctx.this.getTV20Table();
     ReturnJobNameGroup returnJobNameGroup = Init1Ctx.this.getReturnJobNameGroup();
     CycleInfo cycleInfo = Init1Ctx.this.getCycleInfo();

	/**
	 *	Returns the value of billPeriodDates
	 *	@return billPeriodDates
	 */   
	 public BillPeriodDates getBillPeriodDates() {
   	return cycdateInfo.getBillPeriodDates();
   }

   /**
	* 	Update BillPeriodDates with the passed value
	*	@param value
	*/
   public void setBillPeriodDates(char[] value) throws CFException {
      cycdateInfo.setBillPeriodDates(value);
   }   

     /**
	 * 	Update BillPeriodDates 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBillPeriodDates(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	cycdateInfo.setBillPeriodDates(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BillPeriodDates 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBillPeriodDates(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	cycdateInfo.setBillPeriodDates(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BillPeriodDates with another Field
	 *	@param value
	 */
   public void setBillPeriodDates(Field source) {
   	cycdateInfo.setBillPeriodDates(source);
   }  
   
     /**
	 * 	Update BillPeriodDates 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBillPeriodDates(Field source, int sourceIndex,int sourceLen) {
   	cycdateInfo.setBillPeriodDates(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BillPeriodDates 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBillPeriodDates(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	cycdateInfo.setBillPeriodDates(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of saveInfoArea
	 *	@return saveInfoArea
	 */   
	 public SaveInfoArea getSaveInfoArea() {
   	return saveInfoArea;
   }


	/**
	 *	Returns the value of dclBlAcctSvcProd
	 *	@return dclBlAcctSvcProd
	 */   
	 public DclBlAcctSvcProd getDclBlAcctSvcProd() {
   	return dclBlAcctSvcProd;
   }


	/**
	 *	Returns the value of cmnAcmn009pParms
	 *	@return cmnAcmn009pParms
	 */   
	 public CmnAcmn009pParms getCmnAcmn009pParms() {
   	return cmnAcmn009pParms;
   }


	/**
	 *	Returns the value of wsrevRevoStatRecord
	 *	@return wsrevRevoStatRecord
	 */   
	 public WsrevRevoStatRecord getWsrevRevoStatRecord() {
   	return wsrevRevoStatRecord;
   }


	/**
	 *	Returns the value of counters
	 *	@return counters
	 */   
	 public Counters getCounters() {
   	return counters;
   }


	/**
	 *	Returns the value of keyUsgPrev
	 *	@return keyUsgPrev
	 */   
	 public KeyUsgPrev getKeyUsgPrev() {
   	return saveInfoArea.getKeyUsgPrev();
   }

   /**
	* 	Update KeyUsgPrev with the passed value
	*	@param value
	*/
   public void setKeyUsgPrev(char[] value) throws CFException {
      saveInfoArea.setKeyUsgPrev(value);
   }   

     /**
	 * 	Update KeyUsgPrev 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setKeyUsgPrev(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	saveInfoArea.setKeyUsgPrev(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update KeyUsgPrev 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setKeyUsgPrev(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	saveInfoArea.setKeyUsgPrev(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update KeyUsgPrev with another Field
	 *	@param value
	 */
   public void setKeyUsgPrev(Field source) {
   	saveInfoArea.setKeyUsgPrev(source);
   }  
   
     /**
	 * 	Update KeyUsgPrev 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setKeyUsgPrev(Field source, int sourceIndex,int sourceLen) {
   	saveInfoArea.setKeyUsgPrev(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update KeyUsgPrev 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setKeyUsgPrev(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	saveInfoArea.setKeyUsgPrev(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of delayedCpduInd
	 *	@return delayedCpduInd
	 */
   public char[] getDelayedCpduInd() throws CFException  {              
   		return work.getDelayedCpduInd();
   }

  
	/**
	*  set variable delayedCpduInd
	*  @param value
	**/
   public void setDelayedCpduInd(char[] value) throws CFException {
      work.setDelayedCpduInd(value);
   } 

	/**
	 *	Returns the value of errRejFlag
	 *	@return errRejFlag
	 */
   public char[] getErrRejFlag() throws CFException  {              
   		return work.getErrRejFlag();
   }

  
	/**
	*  set variable errRejFlag
	*  @param value
	**/
   public void setErrRejFlag(char[] value) throws CFException {
      work.setErrRejFlag(value);
   } 

	/**
	 *	Returns the value of returnJobName
	 *	@return returnJobName
	 */
   public char[] getReturnJobName() throws CFException  {              
   		return returnJobNameGroup.getReturnJobName();
   }

  
	/**
	*  set variable returnJobName
	*  @param value
	**/
   public void setReturnJobName(char[] value) throws CFException {
      returnJobNameGroup.setReturnJobName(value);
   } 

     /**
	 * 	Update ReturnJobName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setReturnJobName(char[] source, int sourceIndex) throws CFException {
      returnJobNameGroup.setReturnJobName(source, sourceIndex);
   	
   }
   
   public void setReturnJobName(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      returnJobNameGroup.setReturnJobName(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ReturnJobName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReturnJobName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      returnJobNameGroup.setReturnJobName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ReturnJobName with another Field
	 *	@param value
	 */
   public void setReturnJobName(Field source) {
      returnJobNameGroup.setReturnJobName(source);
   }  
   
     /**
	 * 	Update ReturnJobName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setReturnJobName(Field source, int sourceIndex,int sourceLen) {
      returnJobNameGroup.setReturnJobName(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ReturnJobName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReturnJobName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      returnJobNameGroup.setReturnJobName(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wcdloDateTable
	 *	@return wcdloDateTable
	 */   
	 public WcdloDateTable getWcdloDateTable() {
   	return wscdlCalDate.getWcdloDateTable();
   }

   /**
	* 	Update WcdloDateTable with the passed value
	*	@param value
	*/
   public void setWcdloDateTable(char[] value) throws CFException {
      wscdlCalDate.setWcdloDateTable(value);
   }   

     /**
	 * 	Update WcdloDateTable 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWcdloDateTable(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	wscdlCalDate.setWcdloDateTable(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WcdloDateTable 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcdloDateTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	wscdlCalDate.setWcdloDateTable(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WcdloDateTable with another Field
	 *	@param value
	 */
   public void setWcdloDateTable(Field source) {
   	wscdlCalDate.setWcdloDateTable(source);
   }  
   
     /**
	 * 	Update WcdloDateTable 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWcdloDateTable(Field source, int sourceIndex,int sourceLen) {
   	wscdlCalDate.setWcdloDateTable(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WcdloDateTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcdloDateTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	wscdlCalDate.setWcdloDateTable(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getCustFlgUsgCtr() throws CFException{      
   		return counters.getProgramCounters().getCustFlgUsgCtr();
	}

    public char[] getCustFlgUsgCtrString() throws CFException {
          return  counters.getProgramCounters().getCustFlgUsgCtr().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update CustFlgUsgCtr with the passed number
	 *	@param number
	 */
	public void setCustFlgUsgCtr(BigDecimal number)  throws CFException{
		counters.getProgramCounters().setCustFlgUsgCtr(number);
   }

	/**
	 *	Returns the value of wcdloStartDateIso
	 *	@return wcdloStartDateIso
	 */
	public long getWcdloStartDateIso() throws CFException {
   		return wscdlCalDate.getWcdloStartDateIso();
	}


	/**
	 *	Returns String value of wcdloStartDateIso
	 *	@return wcdloStartDateIso
	 */
	public char[]  getWcdloStartDateIsoString() throws CFException {
	     return String.valueOf(wscdlCalDate.getWcdloStartDateIsoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdloStartDateIsoIsNumeric()  throws CFException{
	    return wscdlCalDate.wcdloStartDateIsoIsNumeric();
	}

	/**
	 * 	Update WcdloStartDateIso with the passed value
	 *	@param number
	 */
	public void setWcdloStartDateIso(long number)  throws CFException{
		wscdlCalDate.setWcdloStartDateIso(number);
	}
	

	
	/**
	 * 	Update WcdloStartDateIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloStartDateIso(char[] value)  throws CFException {
		wscdlCalDate.setWcdloStartDateIso(value);
	}
	
	/**
	 * 	Update WcdloStartDateIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdloStartDateIsoString(char[] value)  throws CFException{
		wscdlCalDate.setWcdloStartDateIso(value);
	}	

	/**
	 *	Returns the value of wcdloCycEndDt
	 *	@return wcdloCycEndDt
	 */   
	 public WcdloCycEndDt getWcdloCycEndDt() {
   	return wscdlCalDate.getWcdloCycEndDt();
   }

   /**
	* 	Update WcdloCycEndDt with the passed value
	*	@param value
	*/
   public void setWcdloCycEndDt(char[] value) throws CFException {
      wscdlCalDate.setWcdloCycEndDt(value);
   }   

     /**
	 * 	Update WcdloCycEndDt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWcdloCycEndDt(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	wscdlCalDate.setWcdloCycEndDt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WcdloCycEndDt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcdloCycEndDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	wscdlCalDate.setWcdloCycEndDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WcdloCycEndDt with another Field
	 *	@param value
	 */
   public void setWcdloCycEndDt(Field source) {
   	wscdlCalDate.setWcdloCycEndDt(source);
   }  
   
     /**
	 * 	Update WcdloCycEndDt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWcdloCycEndDt(Field source, int sourceIndex,int sourceLen) {
   	wscdlCalDate.setWcdloCycEndDt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WcdloCycEndDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcdloCycEndDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	wscdlCalDate.setWcdloCycEndDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of dclWipBlCycPhaseAudit
	 *	@return dclWipBlCycPhaseAudit
	 */   
	 public DclWipBlCycPhaseAudit getDclWipBlCycPhaseAudit() {
   	return dclWipBlCycPhaseAudit;
   }


	/**
	 *	Returns the value of cycleInfo
	 *	@return cycleInfo
	 */   
	 public CycleInfo getCycleInfo() {
   	return cycleInfo;
   }


	/**
	 *	Returns the value of rlm2tPromoCustMtnRec
	 *	@return rlm2tPromoCustMtnRec
	 */   
	 public Rlm2tPromoCustMtnRec getRlm2tPromoCustMtnRec() {
   	return rlm2tPromoCustMtnRec;
   }


	/**
	 *	Returns the value of cDisplayJobnme
	 *	@return cDisplayJobnme
	 */
   public char[] getCDisplayJobnme() throws CFException  {              
   		return work.getCDisplayJobnme();
   }

  
	/**
	*  set variable cDisplayJobnme
	*  @param value
	**/
   public void setCDisplayJobnme(char[] value) throws CFException {
      work.setCDisplayJobnme(value);
   } 

	/**
	 *	Returns the value of wcdloEndDateIso
	 *	@return wcdloEndDateIso
	 */
	public long getWcdloEndDateIso() throws CFException {
   		return wscdlCalDate.getWcdloEndDateIso();
	}


	/**
	 *	Returns String value of wcdloEndDateIso
	 *	@return wcdloEndDateIso
	 */
	public char[]  getWcdloEndDateIsoString() throws CFException {
	     return String.valueOf(wscdlCalDate.getWcdloEndDateIsoString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdloEndDateIsoIsNumeric()  throws CFException{
	    return wscdlCalDate.wcdloEndDateIsoIsNumeric();
	}

	/**
	 * 	Update WcdloEndDateIso with the passed value
	 *	@param number
	 */
	public void setWcdloEndDateIso(long number)  throws CFException{
		wscdlCalDate.setWcdloEndDateIso(number);
	}
	

	
	/**
	 * 	Update WcdloEndDateIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloEndDateIso(char[] value)  throws CFException {
		wscdlCalDate.setWcdloEndDateIso(value);
	}
	
	/**
	 * 	Update WcdloEndDateIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdloEndDateIsoString(char[] value)  throws CFException{
		wscdlCalDate.setWcdloEndDateIso(value);
	}	

	public BigDecimal getCustUsgCtr() throws CFException{      
   		return counters.getProgramCounters().getCustUsgCtr();
	}

    public char[] getCustUsgCtrString() throws CFException {
          return  counters.getProgramCounters().getCustUsgCtr().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update CustUsgCtr with the passed number
	 *	@param number
	 */
	public void setCustUsgCtr(BigDecimal number)  throws CFException{
		counters.getProgramCounters().setCustUsgCtr(number);
   }

	/**
	 *	Returns the value of rejectCd
	 *	@return rejectCd
	 */
   public char[] getRejectCd() throws CFException  {              
   		return work.getRejectCd();
   }

  
	/**
	*  set variable rejectCd
	*  @param value
	**/
   public void setRejectCd(char[] value) throws CFException {
      work.setRejectCd(value);
   } 

	/**
	 *	Returns the value of errAcctRecord
	 *	@return errAcctRecord
	 */   
	 public ErrAcctRecord getErrAcctRecord() {
   	return saveInfoArea.getErrAcctRecord();
   }

   /**
	* 	Update ErrAcctRecord with the passed value
	*	@param value
	*/
   public void setErrAcctRecord(char[] value) throws CFException {
      saveInfoArea.setErrAcctRecord(value);
   }   

     /**
	 * 	Update ErrAcctRecord 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setErrAcctRecord(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	saveInfoArea.setErrAcctRecord(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ErrAcctRecord 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrAcctRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	saveInfoArea.setErrAcctRecord(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ErrAcctRecord with another Field
	 *	@param value
	 */
   public void setErrAcctRecord(Field source) {
   	saveInfoArea.setErrAcctRecord(source);
   }  
   
     /**
	 * 	Update ErrAcctRecord 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setErrAcctRecord(Field source, int sourceIndex,int sourceLen) {
   	saveInfoArea.setErrAcctRecord(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ErrAcctRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrAcctRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	saveInfoArea.setErrAcctRecord(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bypassAcctFlag
	 *	@return bypassAcctFlag
	 */
   public char[] getBypassAcctFlag() throws CFException  {              
   		return work.getBypassAcctFlag();
   }

  
	/**
	*  set variable bypassAcctFlag
	*  @param value
	**/
   public void setBypassAcctFlag(char[] value) throws CFException {
      work.setBypassAcctFlag(value);
   } 

	/**
	 *	Returns the value of wcdloCycStartDt
	 *	@return wcdloCycStartDt
	 */   
	 public WcdloCycStartDt getWcdloCycStartDt() {
   	return wscdlCalDate.getWcdloCycStartDt();
   }

   /**
	* 	Update WcdloCycStartDt with the passed value
	*	@param value
	*/
   public void setWcdloCycStartDt(char[] value) throws CFException {
      wscdlCalDate.setWcdloCycStartDt(value);
   }   

     /**
	 * 	Update WcdloCycStartDt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWcdloCycStartDt(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	wscdlCalDate.setWcdloCycStartDt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WcdloCycStartDt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcdloCycStartDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	wscdlCalDate.setWcdloCycStartDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WcdloCycStartDt with another Field
	 *	@param value
	 */
   public void setWcdloCycStartDt(Field source) {
   	wscdlCalDate.setWcdloCycStartDt(source);
   }  
   
     /**
	 * 	Update WcdloCycStartDt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWcdloCycStartDt(Field source, int sourceIndex,int sourceLen) {
   	wscdlCalDate.setWcdloCycStartDt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WcdloCycStartDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcdloCycStartDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	wscdlCalDate.setWcdloCycStartDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tV20Table
	 *	@return tV20Table
	 */   
	 public TV20Table getTV20Table() {
   	return tV20Table;
   }


	/**
	 *	Returns the value of wcdloDateChar
	 *	@return wcdloDateChar
	 */   
	 public WcdloDateChar getWcdloDateChar() {
   	return wscdlCalDate.getWcdloDateChar();
   }

   /**
	* 	Update WcdloDateChar with the passed value
	*	@param value
	*/
   public void setWcdloDateChar(char[] value) throws CFException {
      wscdlCalDate.setWcdloDateChar(value);
   }   

     /**
	 * 	Update WcdloDateChar 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWcdloDateChar(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	wscdlCalDate.setWcdloDateChar(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WcdloDateChar 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcdloDateChar(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	wscdlCalDate.setWcdloDateChar(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WcdloDateChar with another Field
	 *	@param value
	 */
   public void setWcdloDateChar(Field source) {
   	wscdlCalDate.setWcdloDateChar(source);
   }  
   
     /**
	 * 	Update WcdloDateChar 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWcdloDateChar(Field source, int sourceIndex,int sourceLen) {
   	wscdlCalDate.setWcdloDateChar(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WcdloDateChar 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcdloDateChar(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	wscdlCalDate.setWcdloDateChar(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Init1Ctx getInit1Ctx() {
            return Init1Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += saveInfoArea.hashCode();
        str += dclBlAcctSvcProd.hashCode();
        str += cycdateInfo.hashCode();
        str += rlm2tPromoCustMtnRec.hashCode();
        str += wscdlCalDate.hashCode();
        str += cmnAcmn009pParms.hashCode();
        str += wsrevRevoStatRecord.hashCode();
        str += counters.hashCode();
        str += work.hashCode();
        str += dclWipBlCycPhaseAudit.hashCode();
        str += tV20Table.hashCode();
        str += returnJobNameGroup.hashCode();
        str += cycleInfo.hashCode();
       return str.hashCode();
    }

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.saveInfoArea = new SaveInfoArea();
        cloneObj.saveInfoArea.set(saveInfoArea.getClonedField());
        cloneObj.dclBlAcctSvcProd = new DclBlAcctSvcProd();
        cloneObj.dclBlAcctSvcProd.set(dclBlAcctSvcProd.getClonedField());
        cloneObj.cycdateInfo = new CycdateInfo();
        cloneObj.cycdateInfo.set(cycdateInfo.getClonedField());
        cloneObj.rlm2tPromoCustMtnRec = new Rlm2tPromoCustMtnRec();
        cloneObj.rlm2tPromoCustMtnRec.set(rlm2tPromoCustMtnRec.getClonedField());
        cloneObj.wscdlCalDate = new WscdlCalDate();
        cloneObj.wscdlCalDate.set(wscdlCalDate.getClonedField());
        cloneObj.cmnAcmn009pParms = new CmnAcmn009pParms();
        cloneObj.cmnAcmn009pParms.set(cmnAcmn009pParms.getClonedField());
        cloneObj.wsrevRevoStatRecord = new WsrevRevoStatRecord();
        cloneObj.wsrevRevoStatRecord.set(wsrevRevoStatRecord.getClonedField());
        cloneObj.counters = new Counters();
        cloneObj.counters.set(counters.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dclWipBlCycPhaseAudit = new DclWipBlCycPhaseAudit();
        cloneObj.dclWipBlCycPhaseAudit.set(dclWipBlCycPhaseAudit.getClonedField());
        cloneObj.tV20Table = new TV20Table();
        cloneObj.tV20Table.set(tV20Table.getClonedField());
        cloneObj.returnJobNameGroup = new ReturnJobNameGroup();
        cloneObj.returnJobNameGroup.set(returnJobNameGroup.getClonedField());
        cloneObj.cycleInfo = new CycleInfo();
        cloneObj.cycleInfo.set(cycleInfo.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
     public class Process1InCtx implements Cloneable {
     RlcbmBillMsgDtlGroup rlcbmBillMsgDtlGroup = Init1Ctx.this.getRlcbmBillMsgDtlGroup();
     IypData6 iypData6 = Init1Ctx.this.getIypData6();
     FillerBeginEndMid fillerBeginEndMid = Init1Ctx.this.getFillerBeginEndMid();
     SaveInfoArea saveInfoArea = Init1Ctx.this.getSaveInfoArea();
     Bilrlu5f bilrlu5f = Init1Ctx.this.getBilrlu5f();
     Xcprs01 xcprs01 = Init1Ctx.this.getXcprs01();
     WvExtrRecord wvExtrRecord = Init1Ctx.this.getWvExtrRecord();
     Counters counters = Init1Ctx.this.getCounters();
     Work work = Init1Ctx.this.getWork();
     FillerBeginEnd1 fillerBeginEnd1 = Init1Ctx.this.getFillerBeginEnd1();
     FillerBeginEndMid1 fillerBeginEndMid1 = Init1Ctx.this.getFillerBeginEndMid1();
     FillerBeginEnd fillerBeginEnd = Init1Ctx.this.getFillerBeginEnd();
     Test1 test1 = Init1Ctx.this.getTest1();
     InputRec inputRec = Init1Ctx.this.getInputRec();

public short getMessageMaxCnt() throws CFException {  
        return work.getMessageMaxCnt();
}
	/**
	 * 	Update MessageMaxCnt with the passed value
	 *	@param number
	 */
	public void setMessageMaxCnt(short number)  throws CFException{
		work.setMessageMaxCnt(number);
	}

	public void setMessageMaxCnt(int number)  throws CFException{
	   work.setMessageMaxCnt(number);
	}
	public void setMessageMaxCnt(long number)  throws CFException {
	    work.setMessageMaxCnt(number);
	}
	


	/**
	 *	Returns the value of i1
	 *	@return i1
	 */
	public int getI1() throws CFException {        
   		return work.getI1();
	}
	
	/**
	 * 	Update I1 with the passed value
	 *	@param number
	 */
	public void setI1(int number)  throws CFException{
		work.setI1(number);
	}


	public void setI1(long number)  throws CFException{
		work.setI1((int)number);
	}


	/**
	 *	Returns the value of errAcctRecord
	 *	@return errAcctRecord
	 */   
	 public ErrAcctRecord getErrAcctRecord() {
   	return saveInfoArea.getErrAcctRecord();
   }

   /**
	* 	Update ErrAcctRecord with the passed value
	*	@param value
	*/
   public void setErrAcctRecord(char[] value) throws CFException {
      saveInfoArea.setErrAcctRecord(value);
   }   

     /**
	 * 	Update ErrAcctRecord 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setErrAcctRecord(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	saveInfoArea.setErrAcctRecord(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ErrAcctRecord 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrAcctRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	saveInfoArea.setErrAcctRecord(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ErrAcctRecord with another Field
	 *	@param value
	 */
   public void setErrAcctRecord(Field source) {
   	saveInfoArea.setErrAcctRecord(source);
   }  
   
     /**
	 * 	Update ErrAcctRecord 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setErrAcctRecord(Field source, int sourceIndex,int sourceLen) {
   	saveInfoArea.setErrAcctRecord(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ErrAcctRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrAcctRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	saveInfoArea.setErrAcctRecord(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Init1Ctx getInit1Ctx() {
            return Init1Ctx.this;
        }

        public Process1OutCtx getProcess1OutCtx() {
            return new Process1OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += rlcbmBillMsgDtlGroup.hashCode();
        str += iypData6.hashCode();
        str += fillerBeginEndMid.hashCode();
        str += saveInfoArea.hashCode();
        str += bilrlu5f.hashCode();
        str += xcprs01.hashCode();
        str += wvExtrRecord.hashCode();
        str += counters.hashCode();
        str += work.hashCode();
        str += fillerBeginEnd1.hashCode();
        str += fillerBeginEndMid1.hashCode();
        str += fillerBeginEnd.hashCode();
        str += test1.hashCode();
        str += inputRec.hashCode();
       return str.hashCode();
    }

    public Process1InCtx clone() {
        Process1InCtx cloneObj = new Process1InCtx();
        cloneObj.rlcbmBillMsgDtlGroup = new RlcbmBillMsgDtlGroup();
        cloneObj.rlcbmBillMsgDtlGroup.set(rlcbmBillMsgDtlGroup.getClonedField());
        cloneObj.iypData6 = new IypData6();
        cloneObj.iypData6.set(iypData6.getClonedField());
        cloneObj.fillerBeginEndMid = new FillerBeginEndMid();
        cloneObj.fillerBeginEndMid.set(fillerBeginEndMid.getClonedField());
        cloneObj.saveInfoArea = new SaveInfoArea();
        cloneObj.saveInfoArea.set(saveInfoArea.getClonedField());
        cloneObj.bilrlu5f = new Bilrlu5f();
        cloneObj.bilrlu5f.set(bilrlu5f.getClonedField());
        cloneObj.xcprs01 = new Xcprs01();
        cloneObj.xcprs01.set(xcprs01.getClonedField());
        cloneObj.wvExtrRecord = new WvExtrRecord();
        cloneObj.wvExtrRecord.set(wvExtrRecord.getClonedField());
        cloneObj.counters = new Counters();
        cloneObj.counters.set(counters.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.fillerBeginEnd1 = new FillerBeginEnd1();
        cloneObj.fillerBeginEnd1.set(fillerBeginEnd1.getClonedField());
        cloneObj.fillerBeginEndMid1 = new FillerBeginEndMid1();
        cloneObj.fillerBeginEndMid1.set(fillerBeginEndMid1.getClonedField());
        cloneObj.fillerBeginEnd = new FillerBeginEnd();
        cloneObj.fillerBeginEnd.set(fillerBeginEnd.getClonedField());
        cloneObj.test1 = new Test1();
        cloneObj.test1.set(test1.getClonedField());
        cloneObj.inputRec = new InputRec();
        cloneObj.inputRec.set(inputRec.getClonedField());
        return cloneObj;
    }

    }

    public Process1InCtx getProcess1InCtx() {
            return new Process1InCtx();
    }
     public class Process1OutCtx implements Cloneable {
     RlcbmBillMsgDtlGroup rlcbmBillMsgDtlGroup = Init1Ctx.this.getRlcbmBillMsgDtlGroup();
     IypData6 iypData6 = Init1Ctx.this.getIypData6();
     FillerBeginEndMid fillerBeginEndMid = Init1Ctx.this.getFillerBeginEndMid();
     Bilrlu5f bilrlu5f = Init1Ctx.this.getBilrlu5f();
     SaveInfoArea saveInfoArea = Init1Ctx.this.getSaveInfoArea();
     Xcprs01 xcprs01 = Init1Ctx.this.getXcprs01();
     WvExtrRecord wvExtrRecord = Init1Ctx.this.getWvExtrRecord();
     Counters counters = Init1Ctx.this.getCounters();
     Work work = Init1Ctx.this.getWork();
     FillerBeginEnd1 fillerBeginEnd1 = Init1Ctx.this.getFillerBeginEnd1();
     FillerBeginEndMid1 fillerBeginEndMid1 = Init1Ctx.this.getFillerBeginEndMid1();
     FillerBeginEnd fillerBeginEnd = Init1Ctx.this.getFillerBeginEnd();
     Test1 test1 = Init1Ctx.this.getTest1();
     InputRec inputRec = Init1Ctx.this.getInputRec();

	/**
	 *	Returns the value of iypData6
	 *	@return iypData6
	 */   
	 public IypData6 getIypData6() {
   	return iypData6;
   }


	/**
	 *	Returns the value of rlcbmEcpdProfileId
	 *	@return rlcbmEcpdProfileId
	 */
	public int getRlcbmEcpdProfileId() throws CFException {        
   		return rlcbmBillMsgDtlGroup.getRlcbmBillMsgDtl().getRlcbmBillMessageRec().getRlcbmEcpdProfileId();
	}
	
	/**
	 * 	Update RlcbmEcpdProfileId with the passed value
	 *	@param number
	 */
	public void setRlcbmEcpdProfileId(int number)  throws CFException{
		rlcbmBillMsgDtlGroup.getRlcbmBillMsgDtl().getRlcbmBillMessageRec().setRlcbmEcpdProfileId(number);
	}


	public void setRlcbmEcpdProfileId(long number)  throws CFException{
		rlcbmBillMsgDtlGroup.getRlcbmBillMsgDtl().getRlcbmBillMessageRec().setRlcbmEcpdProfileId((int)number);
	}


	/**
	 *	Returns the value of wvExtrRecord
	 *	@return wvExtrRecord
	 */   
	 public WvExtrRecord getWvExtrRecord() {
   	return wvExtrRecord;
   }


	/**
	 *	Returns the value of wvExtrLdgBbl
	 *	@return wvExtrLdgBbl
	 */
   public char[] getWvExtrLdgBbl() throws CFException  {              
   		return wvExtrRecord.getWvExtrDetails().getWvExtrLdgBblX().getWvExtrLdgBbl();
   }

  
	/**
	*  set variable wvExtrLdgBbl
	*  @param value
	**/
   public void setWvExtrLdgBbl(char[] value) throws CFException {
      wvExtrRecord.getWvExtrDetails().getWvExtrLdgBblX().setWvExtrLdgBbl(value);
   } 

     /**
	 * 	Update WvExtrLdgBbl 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLdgBbl(char[] source, int sourceIndex) throws CFException {
      wvExtrRecord.getWvExtrDetails().getWvExtrLdgBblX().setWvExtrLdgBbl(source, sourceIndex);
   	
   }
   
   public void setWvExtrLdgBbl(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wvExtrRecord.getWvExtrDetails().getWvExtrLdgBblX().setWvExtrLdgBbl(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvExtrLdgBbl 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgBbl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvExtrRecord.getWvExtrDetails().getWvExtrLdgBblX().setWvExtrLdgBbl(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WvExtrLdgBbl with another Field
	 *	@param value
	 */
   public void setWvExtrLdgBbl(Field source) {
      wvExtrRecord.getWvExtrDetails().getWvExtrLdgBblX().setWvExtrLdgBbl(source);
   }  
   
     /**
	 * 	Update WvExtrLdgBbl 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrLdgBbl(Field source, int sourceIndex,int sourceLen) {
      wvExtrRecord.getWvExtrDetails().getWvExtrLdgBblX().setWvExtrLdgBbl(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WvExtrLdgBbl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgBbl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvExtrRecord.getWvExtrDetails().getWvExtrLdgBblX().setWvExtrLdgBbl(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of messages
	 *	@return messages
	 */   
	 public Messages getMessages(int index) {
   	return xcprs01.getMessagesX().getMessages(index);
   }

    public List<Messages> getMessages() {
        return xcprs01.getMessagesX().getMessages();
    }
   /**
	* 	Update Messages with the passed value
	*	@param value
	*/
   public void setMessages(int index,char[] value) throws CFException {
      xcprs01.getMessagesX().setMessages((index),value);
   }   


	/**
	 *	Returns the value of errRejFlag
	 *	@return errRejFlag
	 */
   public char[] getErrRejFlag() throws CFException  {              
   		return work.getErrRejFlag();
   }

  
	/**
	*  set variable errRejFlag
	*  @param value
	**/
   public void setErrRejFlag(char[] value) throws CFException {
      work.setErrRejFlag(value);
   } 

	/**
	 *	Returns the value of fillerBeginEnd1
	 *	@return fillerBeginEnd1
	 */   
	 public FillerBeginEnd1 getFillerBeginEnd1() {
   	return fillerBeginEnd1;
   }


	/**
	 *	Returns the value of messageSeverity
	 *	@return messageSeverity
	 */
   public char[] getMessageSeverity(int index) throws CFException  {              
   		return xcprs01.getMessagesX().getMessages(index).getMessageSeverity();
   }

  
	/**
	*  set variable messageSeverity
	*  @param value
	**/
   public void setMessageSeverity(int index,char[] value) throws CFException {
      xcprs01.getMessagesX().getMessages(index).setMessageSeverity(value);
   } 

     /**
	 * 	Update MessageSeverity 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMessageSeverity(int index,char[] source, int sourceIndex) throws CFException {
      xcprs01.getMessagesX().getMessages(index).setMessageSeverity(source, sourceIndex);
   	
   }
   
   public void setMessageSeverity(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      xcprs01.getMessagesX().getMessages(index).setMessageSeverity(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MessageSeverity 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMessageSeverity(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xcprs01.getMessagesX().getMessages(index).setMessageSeverity(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MessageSeverity with another Field
	 *	@param value
	 */
   public void setMessageSeverity(int index,Field source) {
      xcprs01.getMessagesX().getMessages(index).setMessageSeverity(source);
   }  
   
     /**
	 * 	Update MessageSeverity 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMessageSeverity(int index,Field source, int sourceIndex,int sourceLen) {
      xcprs01.getMessagesX().getMessages(index).setMessageSeverity(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MessageSeverity 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMessageSeverity(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xcprs01.getMessagesX().getMessages(index).setMessageSeverity(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wvExtrActDensity
	 *	@return wvExtrActDensity
	 */
   public char[] getWvExtrActDensity() throws CFException  {              
   		return wvExtrRecord.getWvExtrDetails().getWvExtrActDensityX().getWvExtrActDensity();
   }

  
	/**
	*  set variable wvExtrActDensity
	*  @param value
	**/
   public void setWvExtrActDensity(char[] value) throws CFException {
      wvExtrRecord.getWvExtrDetails().getWvExtrActDensityX().setWvExtrActDensity(value);
   } 

     /**
	 * 	Update WvExtrActDensity 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrActDensity(char[] source, int sourceIndex) throws CFException {
      wvExtrRecord.getWvExtrDetails().getWvExtrActDensityX().setWvExtrActDensity(source, sourceIndex);
   	
   }
   
   public void setWvExtrActDensity(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wvExtrRecord.getWvExtrDetails().getWvExtrActDensityX().setWvExtrActDensity(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvExtrActDensity 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrActDensity(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvExtrRecord.getWvExtrDetails().getWvExtrActDensityX().setWvExtrActDensity(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WvExtrActDensity with another Field
	 *	@param value
	 */
   public void setWvExtrActDensity(Field source) {
      wvExtrRecord.getWvExtrDetails().getWvExtrActDensityX().setWvExtrActDensity(source);
   }  
   
     /**
	 * 	Update WvExtrActDensity 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrActDensity(Field source, int sourceIndex,int sourceLen) {
      wvExtrRecord.getWvExtrDetails().getWvExtrActDensityX().setWvExtrActDensity(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WvExtrActDensity 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrActDensity(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvExtrRecord.getWvExtrDetails().getWvExtrActDensityX().setWvExtrActDensity(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getCustFlgUsgCtr() throws CFException{      
   		return counters.getProgramCounters().getCustFlgUsgCtr();
	}

    public char[] getCustFlgUsgCtrString() throws CFException {
          return  counters.getProgramCounters().getCustFlgUsgCtr().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update CustFlgUsgCtr with the passed number
	 *	@param number
	 */
	public void setCustFlgUsgCtr(BigDecimal number)  throws CFException{
		counters.getProgramCounters().setCustFlgUsgCtr(number);
   }

	/**
	 *	Returns the value of wvExtrDetails
	 *	@return wvExtrDetails
	 */   
	 public WvExtrDetails getWvExtrDetails() {
   	return wvExtrRecord.getWvExtrDetails();
   }

   /**
	* 	Update WvExtrDetails with the passed value
	*	@param value
	*/
   public void setWvExtrDetails(char[] value) throws CFException {
      wvExtrRecord.setWvExtrDetails(value);
   }   

     /**
	 * 	Update WvExtrDetails 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDetails(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	wvExtrRecord.setWvExtrDetails(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvExtrDetails 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDetails(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	wvExtrRecord.setWvExtrDetails(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WvExtrDetails with another Field
	 *	@param value
	 */
   public void setWvExtrDetails(Field source) {
   	wvExtrRecord.setWvExtrDetails(source);
   }  
   
     /**
	 * 	Update WvExtrDetails 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDetails(Field source, int sourceIndex,int sourceLen) {
   	wvExtrRecord.setWvExtrDetails(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvExtrDetails 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDetails(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	wvExtrRecord.setWvExtrDetails(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fillerBeginEndMid1
	 *	@return fillerBeginEndMid1
	 */   
	 public FillerBeginEndMid1 getFillerBeginEndMid1() {
   	return fillerBeginEndMid1;
   }


	/**
	 *	Returns the value of messageDescriptionLen
	 *	@return messageDescriptionLen
	 */
	public short getMessageDescriptionLen(int index) throws CFException {        
   		return xcprs01.getMessagesX().getMessages(index).getMessageDescription().getMessageDescriptionLen();
	}
	
	/**
	 * 	Update MessageDescriptionLen with the passed value
	 *	@param number
	 */
	public void setMessageDescriptionLen(int index,short number)  throws CFException{
		xcprs01.getMessagesX().getMessages(index).getMessageDescription().setMessageDescriptionLen(number);
	}

	public void setMessageDescriptionLen(int index,int number)  throws CFException{
		xcprs01.getMessagesX().getMessages(index).getMessageDescription().setMessageDescriptionLen((short)number);
	}

	public void setMessageDescriptionLen(int index,long number)  throws CFException{
		xcprs01.getMessagesX().getMessages(index).getMessageDescription().setMessageDescriptionLen((short)number);
	}



	/**
	 *	Returns the value of rlcbmInvoiceNo
	 *	@return rlcbmInvoiceNo
	 */
	public long getRlcbmInvoiceNo() throws CFException {        
   		return rlcbmBillMsgDtlGroup.getRlcbmBillMsgDtl().getRlcbmBillMessageRec().getRlcbmInvoiceNo();
	}
	
	/**
	 * 	Update RlcbmInvoiceNo with the passed value
	 *	@param number
	 */
	public void setRlcbmInvoiceNo(long number)  throws CFException{
		rlcbmBillMsgDtlGroup.getRlcbmBillMsgDtl().getRlcbmBillMessageRec().setRlcbmInvoiceNo(number);
	}



	/**
	 *	Returns the value of fillerBeginEnd
	 *	@return fillerBeginEnd
	 */   
	 public FillerBeginEnd getFillerBeginEnd() {
   	return fillerBeginEnd;
   }


	/**
	 *	Returns the value of fillerBeginEndMid
	 *	@return fillerBeginEndMid
	 */   
	 public FillerBeginEndMid getFillerBeginEndMid() {
   	return fillerBeginEndMid;
   }


	/**
	 *	Returns the value of rlcbmActiveMtnsQty
	 *	@return rlcbmActiveMtnsQty
	 */
	public int getRlcbmActiveMtnsQty() throws CFException {        
   		return rlcbmBillMsgDtlGroup.getRlcbmBillMsgDtl().getRlcbmBillMessageRec().getRlcbmActiveMtnsQty();
	}
	
	/**
	 * 	Update RlcbmActiveMtnsQty with the passed value
	 *	@param number
	 */
	public void setRlcbmActiveMtnsQty(int number)  throws CFException{
		rlcbmBillMsgDtlGroup.getRlcbmBillMsgDtl().getRlcbmBillMessageRec().setRlcbmActiveMtnsQty(number);
	}


	public void setRlcbmActiveMtnsQty(long number)  throws CFException{
		rlcbmBillMsgDtlGroup.getRlcbmBillMsgDtl().getRlcbmBillMessageRec().setRlcbmActiveMtnsQty((int)number);
	}


	/**
	 *	Returns the value of bilrlu5f
	 *	@return bilrlu5f
	 */   
	 public Bilrlu5f getBilrlu5f() {
   	return bilrlu5f;
   }


	/**
	 *	Returns the value of rlcbmCustTypCd
	 *	@return rlcbmCustTypCd
	 */
   public char[] getRlcbmCustTypCd() throws CFException  {              
   		return rlcbmBillMsgDtlGroup.getRlcbmBillMsgDtl().getRlcbmBillMessageRec().getRlcbmCustTypCd();
   }

  
	/**
	*  set variable rlcbmCustTypCd
	*  @param value
	**/
   public void setRlcbmCustTypCd(char[] value) throws CFException {
      rlcbmBillMsgDtlGroup.getRlcbmBillMsgDtl().getRlcbmBillMessageRec().setRlcbmCustTypCd(value);
   } 

     /**
	 * 	Update RlcbmCustTypCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlcbmCustTypCd(char[] source, int sourceIndex) throws CFException {
      rlcbmBillMsgDtlGroup.getRlcbmBillMsgDtl().getRlcbmBillMessageRec().setRlcbmCustTypCd(source, sourceIndex);
   	
   }
   
   public void setRlcbmCustTypCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      rlcbmBillMsgDtlGroup.getRlcbmBillMsgDtl().getRlcbmBillMessageRec().setRlcbmCustTypCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RlcbmCustTypCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlcbmCustTypCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      rlcbmBillMsgDtlGroup.getRlcbmBillMsgDtl().getRlcbmBillMessageRec().setRlcbmCustTypCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RlcbmCustTypCd with another Field
	 *	@param value
	 */
   public void setRlcbmCustTypCd(Field source) {
      rlcbmBillMsgDtlGroup.getRlcbmBillMsgDtl().getRlcbmBillMessageRec().setRlcbmCustTypCd(source);
   }  
   
     /**
	 * 	Update RlcbmCustTypCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlcbmCustTypCd(Field source, int sourceIndex,int sourceLen) {
      rlcbmBillMsgDtlGroup.getRlcbmBillMsgDtl().getRlcbmBillMessageRec().setRlcbmCustTypCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RlcbmCustTypCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlcbmCustTypCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      rlcbmBillMsgDtlGroup.getRlcbmBillMsgDtl().getRlcbmBillMessageRec().setRlcbmCustTypCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getCustUsgCtr() throws CFException{      
   		return counters.getProgramCounters().getCustUsgCtr();
	}

    public char[] getCustUsgCtrString() throws CFException {
          return  counters.getProgramCounters().getCustUsgCtr().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update CustUsgCtr with the passed number
	 *	@param number
	 */
	public void setCustUsgCtr(BigDecimal number)  throws CFException{
		counters.getProgramCounters().setCustUsgCtr(number);
   }

	/**
	 *	Returns the value of wvExtrFrmlVers
	 *	@return wvExtrFrmlVers
	 */
   public char[] getWvExtrFrmlVers() throws CFException  {              
   		return wvExtrRecord.getWvExtrDetails().getWvExtrFrmlVers();
   }

  
	/**
	*  set variable wvExtrFrmlVers
	*  @param value
	**/
   public void setWvExtrFrmlVers(char[] value) throws CFException {
      wvExtrRecord.getWvExtrDetails().setWvExtrFrmlVers(value);
   } 

     /**
	 * 	Update WvExtrFrmlVers 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrFrmlVers(char[] source, int sourceIndex) throws CFException {
      wvExtrRecord.getWvExtrDetails().setWvExtrFrmlVers(source, sourceIndex);
   	
   }
   
   public void setWvExtrFrmlVers(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wvExtrRecord.getWvExtrDetails().setWvExtrFrmlVers(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvExtrFrmlVers 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrFrmlVers(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvExtrRecord.getWvExtrDetails().setWvExtrFrmlVers(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WvExtrFrmlVers with another Field
	 *	@param value
	 */
   public void setWvExtrFrmlVers(Field source) {
      wvExtrRecord.getWvExtrDetails().setWvExtrFrmlVers(source);
   }  
   
     /**
	 * 	Update WvExtrFrmlVers 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrFrmlVers(Field source, int sourceIndex,int sourceLen) {
      wvExtrRecord.getWvExtrDetails().setWvExtrFrmlVers(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WvExtrFrmlVers 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrFrmlVers(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvExtrRecord.getWvExtrDetails().setWvExtrFrmlVers(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of inputDeductions
	 *	@return inputDeductions
	 */
	public BigDecimal getInputDeductions(int index) throws CFException {
   		return inputRec.getInputDeductions((index));
	}


	 /**
     *	Returns String value of inputDeductions
     *	@return inputDeductions
     */
    public char[] getInputDeductionsString(int index) throws CFException {
         return inputRec.getInputDeductionsString((index));
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean inputDeductionsIsNumeric(int index) {
        return inputRec.inputDeductionsIsNumeric(index);
    }
	/**
	 * 	Update InputDeductions with the passed number
	 *	@param number
	 */
	public void setInputDeductions(int index,BigDecimal number)  throws CFException{
		inputRec.setInputDeductions((index),number);
   }


	/**
	 *	Returns the value of bypassAcctFlag
	 *	@return bypassAcctFlag
	 */
   public char[] getBypassAcctFlag() throws CFException  {              
   		return work.getBypassAcctFlag();
   }

  
	/**
	*  set variable bypassAcctFlag
	*  @param value
	**/
   public void setBypassAcctFlag(char[] value) throws CFException {
      work.setBypassAcctFlag(value);
   } 

	/**
	 *	Returns the value of wvExtrLdgM3Amb
	 *	@return wvExtrLdgM3Amb
	 */
   public char[] getWvExtrLdgM3Amb() throws CFException  {              
   		return wvExtrRecord.getWvExtrDetails().getWvExtrLdgM3AmbX().getWvExtrLdgM3Amb();
   }

  
	/**
	*  set variable wvExtrLdgM3Amb
	*  @param value
	**/
   public void setWvExtrLdgM3Amb(char[] value) throws CFException {
      wvExtrRecord.getWvExtrDetails().getWvExtrLdgM3AmbX().setWvExtrLdgM3Amb(value);
   } 

     /**
	 * 	Update WvExtrLdgM3Amb 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLdgM3Amb(char[] source, int sourceIndex) throws CFException {
      wvExtrRecord.getWvExtrDetails().getWvExtrLdgM3AmbX().setWvExtrLdgM3Amb(source, sourceIndex);
   	
   }
   
   public void setWvExtrLdgM3Amb(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wvExtrRecord.getWvExtrDetails().getWvExtrLdgM3AmbX().setWvExtrLdgM3Amb(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WvExtrLdgM3Amb 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgM3Amb(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvExtrRecord.getWvExtrDetails().getWvExtrLdgM3AmbX().setWvExtrLdgM3Amb(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WvExtrLdgM3Amb with another Field
	 *	@param value
	 */
   public void setWvExtrLdgM3Amb(Field source) {
      wvExtrRecord.getWvExtrDetails().getWvExtrLdgM3AmbX().setWvExtrLdgM3Amb(source);
   }  
   
     /**
	 * 	Update WvExtrLdgM3Amb 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrLdgM3Amb(Field source, int sourceIndex,int sourceLen) {
      wvExtrRecord.getWvExtrDetails().getWvExtrLdgM3AmbX().setWvExtrLdgM3Amb(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WvExtrLdgM3Amb 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgM3Amb(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wvExtrRecord.getWvExtrDetails().getWvExtrLdgM3AmbX().setWvExtrLdgM3Amb(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of i1
	 *	@return i1
	 */
	public int getI1() throws CFException {        
   		return work.getI1();
	}
	
	/**
	 * 	Update I1 with the passed value
	 *	@param number
	 */
	public void setI1(int number)  throws CFException{
		work.setI1(number);
	}


	public void setI1(long number)  throws CFException{
		work.setI1((int)number);
	}


	/**
	 *	Returns the value of test1
	 *	@return test1
	 */   
	 public Test1 getTest1() {
   	return test1;
   }


	/**
	 *	Returns the value of inputRec
	 *	@return inputRec
	 */   
	 public InputRec getInputRec() {
   	return inputRec;
   }



        public Init1Ctx getInit1Ctx() {
            return Init1Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += rlcbmBillMsgDtlGroup.hashCode();
        str += iypData6.hashCode();
        str += fillerBeginEndMid.hashCode();
        str += bilrlu5f.hashCode();
        str += saveInfoArea.hashCode();
        str += xcprs01.hashCode();
        str += wvExtrRecord.hashCode();
        str += counters.hashCode();
        str += work.hashCode();
        str += fillerBeginEnd1.hashCode();
        str += fillerBeginEndMid1.hashCode();
        str += fillerBeginEnd.hashCode();
        str += test1.hashCode();
        str += inputRec.hashCode();
       return str.hashCode();
    }

    public Process1OutCtx clone() {
        Process1OutCtx cloneObj = new Process1OutCtx();
        cloneObj.rlcbmBillMsgDtlGroup = new RlcbmBillMsgDtlGroup();
        cloneObj.rlcbmBillMsgDtlGroup.set(rlcbmBillMsgDtlGroup.getClonedField());
        cloneObj.iypData6 = new IypData6();
        cloneObj.iypData6.set(iypData6.getClonedField());
        cloneObj.fillerBeginEndMid = new FillerBeginEndMid();
        cloneObj.fillerBeginEndMid.set(fillerBeginEndMid.getClonedField());
        cloneObj.bilrlu5f = new Bilrlu5f();
        cloneObj.bilrlu5f.set(bilrlu5f.getClonedField());
        cloneObj.saveInfoArea = new SaveInfoArea();
        cloneObj.saveInfoArea.set(saveInfoArea.getClonedField());
        cloneObj.xcprs01 = new Xcprs01();
        cloneObj.xcprs01.set(xcprs01.getClonedField());
        cloneObj.wvExtrRecord = new WvExtrRecord();
        cloneObj.wvExtrRecord.set(wvExtrRecord.getClonedField());
        cloneObj.counters = new Counters();
        cloneObj.counters.set(counters.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.fillerBeginEnd1 = new FillerBeginEnd1();
        cloneObj.fillerBeginEnd1.set(fillerBeginEnd1.getClonedField());
        cloneObj.fillerBeginEndMid1 = new FillerBeginEndMid1();
        cloneObj.fillerBeginEndMid1.set(fillerBeginEndMid1.getClonedField());
        cloneObj.fillerBeginEnd = new FillerBeginEnd();
        cloneObj.fillerBeginEnd.set(fillerBeginEnd.getClonedField());
        cloneObj.test1 = new Test1();
        cloneObj.test1.set(test1.getClonedField());
        cloneObj.inputRec = new InputRec();
        cloneObj.inputRec.set(inputRec.getClonedField());
        return cloneObj;
    }

    }

    public Process1OutCtx getProcess1OutCtx() {
            return new Process1OutCtx();
    }
}
