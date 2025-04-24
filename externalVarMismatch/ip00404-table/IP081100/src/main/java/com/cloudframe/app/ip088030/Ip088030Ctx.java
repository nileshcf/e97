package com.cloudframe.app.ip088030;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.ip088030.dto.MsgsWrite600;
import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
import com.cloudframe.app.global.sharedvar.Ip00404Table;
import com.cloudframe.app.ip088030.dto.SrceTrgCurExpErr0rMsg600;
import com.cloudframe.app.ip088030.dto.IchgEntry500;
import com.cloudframe.app.ip088030.file.records.Sys001TjfIp370Rec;
import com.cloudframe.app.global.sharedvar.Ip00404Entry;
import com.cloudframe.app.ip088030.dto.IchgCalcVars800;
import com.cloudframe.app.ip088030.dto.IchgFeeRecords500;
import com.cloudframe.app.global.sharedvar.Ip00174EntryFoundGroup;
import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
import com.cloudframe.app.ip088030.dto.AbendMessage600;
import com.cloudframe.app.ip088030.dto.InternalTblCnt600;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
import com.cloudframe.app.ip088030.dto.AbendMessage900;
import com.cloudframe.app.ip088030.dto.Work;
import com.cloudframe.app.ip088030.dto.MsgsRead600;
import com.cloudframe.app.ip088030.file.records.Ip98152RecordPart2;
import com.cloudframe.app.global.sharedvar.Ip00174CurrCdKey;
import com.cloudframe.app.global.sharedvar.Ip33701CurrConvInterface;
import com.cloudframe.app.global.sharedvar.Ip00164EntryFoundGroup;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
import com.cloudframe.app.global.sharedvar.Ip0040iAccountRangeInfo;
import com.cloudframe.app.global.sharedvar.Ip00164TableEntry;
import com.cloudframe.app.ip088030.dto.HoldVariables800;
import com.cloudframe.app.global.sharedvar.Ip08101RunControlRecord;
import com.cloudframe.app.ip088030.file.records.Sys201OutputRecord;
import com.cloudframe.app.ip088030.file.records.Ip98151RecordPart1;
import com.cloudframe.app.global.sharedvar.Ip00754EntryFoundGroup;
import com.cloudframe.app.global.sharedvar.Ip00754TableEntry;
import com.cloudframe.app.global.sharedvar.Ip00754SearchCriteriaGroup;
import com.cloudframe.app.ip088030.dto.AbendPara900;
import com.cloudframe.app.ip088030.file.records.Sys002CntlIchgRec;
import com.cloudframe.app.global.sharedvar.Ip00174TableEntry;
import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
import com.cloudframe.app.ip088030.file.records.Sys201RecordPart2;


@Context
public class Ip088030Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    AbendMessage600 abendMessage600;
    Ip50005OneDayRec ip50005OneDayRec;
    Work work;
    SrceTrgCurExpErr0rMsg600 srceTrgCurExpErr0rMsg600;
    Ip00754SearchCriteriaGroup ip00754SearchCriteriaGroup;
    IchgFeeRecords500 ichgFeeRecords500;
    MsgsWrite600 msgsWrite600;
    Ip00164TableEntry ip00164TableEntry;
    Ip00174TableEntry ip00174TableEntry;
    Sys001TjfIp370Rec sys001TjfIp370Rec;
    HoldVariables800 holdVariables800;
    AbendPara900 abendPara900;
    Ip08101RunControlRecord ip08101RunControlRecord;
    Ip60001EventLogWorkArea ip60001EventLogWorkArea;
    IchgCalcVars800 ichgCalcVars800;
    Ip00174EntryFoundGroup ip00174EntryFoundGroup;
    Ip996011ProgramStartMessage ip996011ProgramStartMessage;
    Ip50005ClearingDtTm ip50005ClearingDtTm;
    Ip00754TableEntry ip00754TableEntry;
    Sys002CntlIchgRec sys002CntlIchgRec;
    AbendMessage900 abendMessage900;
    Ip0040iAccountRangeInfo ip0040iAccountRangeInfo;
    Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup;
    MsgsRead600 msgsRead600;
    Ip00164EntryFoundGroup ip00164EntryFoundGroup;
    Ip00404Table ip00404Table;
    Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup;
    Sys201OutputRecord sys201OutputRecord;
    Ip33701CurrConvInterface ip33701CurrConvInterface;
    Ip00754EntryFoundGroup ip00754EntryFoundGroup;
    InternalTblCnt600 internalTblCnt600;

    int ip00404AcctRngIndex;
    int sys201CalcFIdx;
    int ichgIdx500;

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


    public AbendMessage600 getAbendMessage600() {
        if (abendMessage600 == null) {
            abendMessage600 = new AbendMessage600();
        }

        return abendMessage600;
    }

    public void setAbendMessage600(AbendMessage600 abendMessage600) {
        this.abendMessage600 = abendMessage600;
    }
    public Ip50005OneDayRec getIp50005OneDayRec() {
        if (ip50005OneDayRec == null) {
            ip50005OneDayRec = globalCtx.getGlobalDto(Ip50005OneDayRec.class);
        }

        return ip50005OneDayRec;
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
    public SrceTrgCurExpErr0rMsg600 getSrceTrgCurExpErr0rMsg600() {
        if (srceTrgCurExpErr0rMsg600 == null) {
            srceTrgCurExpErr0rMsg600 = new SrceTrgCurExpErr0rMsg600();
        }

        return srceTrgCurExpErr0rMsg600;
    }

    public void setSrceTrgCurExpErr0rMsg600(SrceTrgCurExpErr0rMsg600 srceTrgCurExpErr0rMsg600) {
        this.srceTrgCurExpErr0rMsg600 = srceTrgCurExpErr0rMsg600;
    }
    public Ip00754SearchCriteriaGroup getIp00754SearchCriteriaGroup() {
        if (ip00754SearchCriteriaGroup == null) {
            ip00754SearchCriteriaGroup = globalCtx.getGlobalDto(Ip00754SearchCriteriaGroup.class);
        }

        return ip00754SearchCriteriaGroup;
    }

    public IchgFeeRecords500 getIchgFeeRecords500() {
        if (ichgFeeRecords500 == null) {
            ichgFeeRecords500 = new IchgFeeRecords500();
        }

        return ichgFeeRecords500;
    }

    public void setIchgFeeRecords500(IchgFeeRecords500 ichgFeeRecords500) {
        this.ichgFeeRecords500 = ichgFeeRecords500;
    }
    public MsgsWrite600 getMsgsWrite600() {
        if (msgsWrite600 == null) {
            msgsWrite600 = new MsgsWrite600();
        }

        return msgsWrite600;
    }

    public void setMsgsWrite600(MsgsWrite600 msgsWrite600) {
        this.msgsWrite600 = msgsWrite600;
    }
    public Ip00164TableEntry getIp00164TableEntry() {
        if (ip00164TableEntry == null) {
            ip00164TableEntry = globalCtx.getGlobalDto(Ip00164TableEntry.class);
        }

        return ip00164TableEntry;
    }

    public Ip00174TableEntry getIp00174TableEntry() {
        if (ip00174TableEntry == null) {
            ip00174TableEntry = globalCtx.getGlobalDto(Ip00174TableEntry.class);
        }

        return ip00174TableEntry;
    }

    public Sys001TjfIp370Rec getSys001TjfIp370Rec() {
        if (sys001TjfIp370Rec == null) {
            sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        }

        return sys001TjfIp370Rec;
    }

    public void setSys001TjfIp370Rec(Sys001TjfIp370Rec sys001TjfIp370Rec) {
        this.sys001TjfIp370Rec = sys001TjfIp370Rec;
    }
    public HoldVariables800 getHoldVariables800() {
        if (holdVariables800 == null) {
            holdVariables800 = new HoldVariables800();
        }

        return holdVariables800;
    }

    public void setHoldVariables800(HoldVariables800 holdVariables800) {
        this.holdVariables800 = holdVariables800;
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
    public Ip08101RunControlRecord getIp08101RunControlRecord() {
        if (ip08101RunControlRecord == null) {
            ip08101RunControlRecord = globalCtx.getGlobalDto(Ip08101RunControlRecord.class);
        }

        return ip08101RunControlRecord;
    }

    public Ip60001EventLogWorkArea getIp60001EventLogWorkArea() {
        if (ip60001EventLogWorkArea == null) {
            ip60001EventLogWorkArea = globalCtx.getGlobalDto(Ip60001EventLogWorkArea.class);
        }

        return ip60001EventLogWorkArea;
    }

    public IchgCalcVars800 getIchgCalcVars800() {
        if (ichgCalcVars800 == null) {
            ichgCalcVars800 = new IchgCalcVars800();
        }

        return ichgCalcVars800;
    }

    public void setIchgCalcVars800(IchgCalcVars800 ichgCalcVars800) {
        this.ichgCalcVars800 = ichgCalcVars800;
    }
    public Ip00174EntryFoundGroup getIp00174EntryFoundGroup() {
        if (ip00174EntryFoundGroup == null) {
            ip00174EntryFoundGroup = globalCtx.getGlobalDto(Ip00174EntryFoundGroup.class);
        }

        return ip00174EntryFoundGroup;
    }

    public Ip996011ProgramStartMessage getIp996011ProgramStartMessage() {
        if (ip996011ProgramStartMessage == null) {
            ip996011ProgramStartMessage = globalCtx.getGlobalDto(Ip996011ProgramStartMessage.class);
        }

        return ip996011ProgramStartMessage;
    }

    public Ip50005ClearingDtTm getIp50005ClearingDtTm() {
        if (ip50005ClearingDtTm == null) {
            ip50005ClearingDtTm = globalCtx.getGlobalDto(Ip50005ClearingDtTm.class);
        }

        return ip50005ClearingDtTm;
    }

    public Ip00754TableEntry getIp00754TableEntry() {
        if (ip00754TableEntry == null) {
            ip00754TableEntry = globalCtx.getGlobalDto(Ip00754TableEntry.class);
        }

        return ip00754TableEntry;
    }

    public Sys002CntlIchgRec getSys002CntlIchgRec() {
        if (sys002CntlIchgRec == null) {
            sys002CntlIchgRec = new Sys002CntlIchgRec();
        }

        return sys002CntlIchgRec;
    }

    public void setSys002CntlIchgRec(Sys002CntlIchgRec sys002CntlIchgRec) {
        this.sys002CntlIchgRec = sys002CntlIchgRec;
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
    public Ip0040iAccountRangeInfo getIp0040iAccountRangeInfo() {
        if (ip0040iAccountRangeInfo == null) {
            ip0040iAccountRangeInfo = globalCtx.getGlobalDto(Ip0040iAccountRangeInfo.class);
        }

        return ip0040iAccountRangeInfo;
    }

    public Ip50005OneDayReadStatusGroup getIp50005OneDayReadStatusGroup() {
        if (ip50005OneDayReadStatusGroup == null) {
            ip50005OneDayReadStatusGroup = globalCtx.getGlobalDto(Ip50005OneDayReadStatusGroup.class);
        }

        return ip50005OneDayReadStatusGroup;
    }

    public MsgsRead600 getMsgsRead600() {
        if (msgsRead600 == null) {
            msgsRead600 = new MsgsRead600();
        }

        return msgsRead600;
    }

    public void setMsgsRead600(MsgsRead600 msgsRead600) {
        this.msgsRead600 = msgsRead600;
    }
    public Ip00164EntryFoundGroup getIp00164EntryFoundGroup() {
        if (ip00164EntryFoundGroup == null) {
            ip00164EntryFoundGroup = globalCtx.getGlobalDto(Ip00164EntryFoundGroup.class);
        }

        return ip00164EntryFoundGroup;
    }

    public Ip00404Table getIp00404Table() {
        if (ip00404Table == null) {
            ip00404Table = globalCtx.getGlobalDto(Ip00404Table.class);
        }

        return ip00404Table;
    }

    public Ip50005OneDayRecLthGroup getIp50005OneDayRecLthGroup() {
        if (ip50005OneDayRecLthGroup == null) {
            ip50005OneDayRecLthGroup = globalCtx.getGlobalDto(Ip50005OneDayRecLthGroup.class);
        }

        return ip50005OneDayRecLthGroup;
    }

    public Sys201OutputRecord getSys201OutputRecord() {
        if (sys201OutputRecord == null) {
            sys201OutputRecord = new Sys201OutputRecord();
        }

        return sys201OutputRecord;
    }

    public void setSys201OutputRecord(Sys201OutputRecord sys201OutputRecord) {
        this.sys201OutputRecord = sys201OutputRecord;
    }
    public Ip33701CurrConvInterface getIp33701CurrConvInterface() {
        if (ip33701CurrConvInterface == null) {
            ip33701CurrConvInterface = globalCtx.getGlobalDto(Ip33701CurrConvInterface.class);
        }

        return ip33701CurrConvInterface;
    }

    public Ip00754EntryFoundGroup getIp00754EntryFoundGroup() {
        if (ip00754EntryFoundGroup == null) {
            ip00754EntryFoundGroup = globalCtx.getGlobalDto(Ip00754EntryFoundGroup.class);
        }

        return ip00754EntryFoundGroup;
    }

    public InternalTblCnt600 getInternalTblCnt600() {
        if (internalTblCnt600 == null) {
            internalTblCnt600 = new InternalTblCnt600();
        }

        return internalTblCnt600;
    }

    public void setInternalTblCnt600(InternalTblCnt600 internalTblCnt600) {
        this.internalTblCnt600 = internalTblCnt600;
    }

    public int getIp00404AcctRngIndex() {
        return ip00404AcctRngIndex;
    }

    public void setIp00404AcctRngIndex(int ip00404AcctRngIndex) {
        this.ip00404AcctRngIndex = ip00404AcctRngIndex;
    }
    public int getSys201CalcFIdx() {
        return sys201CalcFIdx;
    }

    public void setSys201CalcFIdx(int sys201CalcFIdx) {
        this.sys201CalcFIdx = sys201CalcFIdx;
    }
    public int getIchgIdx500() {
        return ichgIdx500;
    }

    public void setIchgIdx500(int ichgIdx500) {
        this.ichgIdx500 = ichgIdx500;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendMessage600.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += work.hashCode();
        str += srceTrgCurExpErr0rMsg600.hashCode();
        str += ip00754SearchCriteriaGroup.hashCode();
        str += ichgFeeRecords500.hashCode();
        str += msgsWrite600.hashCode();
        str += ip00164TableEntry.hashCode();
        str += ip00174TableEntry.hashCode();
        str += sys001TjfIp370Rec.hashCode();
        str += holdVariables800.hashCode();
        str += abendPara900.hashCode();
        str += ip08101RunControlRecord.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += ichgCalcVars800.hashCode();
        str += ip00174EntryFoundGroup.hashCode();
        str += ip996011ProgramStartMessage.hashCode();
        str += ip50005ClearingDtTm.hashCode();
        str += ip00754TableEntry.hashCode();
        str += sys002CntlIchgRec.hashCode();
        str += abendMessage900.hashCode();
        str += ip0040iAccountRangeInfo.hashCode();
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += msgsRead600.hashCode();
        str += ip00164EntryFoundGroup.hashCode();
        str += ip00404Table.hashCode();
        str += ip50005OneDayRecLthGroup.hashCode();
        str += sys201OutputRecord.hashCode();
        str += ip33701CurrConvInterface.hashCode();
        str += ip00754EntryFoundGroup.hashCode();
        str += internalTblCnt600.hashCode();
       return str.hashCode();
    }

    public Ip088030Ctx clone() {
        Ip088030Ctx cloneObj = new Ip088030Ctx();
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.srceTrgCurExpErr0rMsg600 = new SrceTrgCurExpErr0rMsg600();
        cloneObj.srceTrgCurExpErr0rMsg600.set(srceTrgCurExpErr0rMsg600.getClonedField());
        cloneObj.ip00754SearchCriteriaGroup = new Ip00754SearchCriteriaGroup();
        cloneObj.ip00754SearchCriteriaGroup.set(ip00754SearchCriteriaGroup.getClonedField());
        cloneObj.ichgFeeRecords500 = new IchgFeeRecords500();
        cloneObj.ichgFeeRecords500.set(ichgFeeRecords500.getClonedField());
        cloneObj.msgsWrite600 = new MsgsWrite600();
        cloneObj.msgsWrite600.set(msgsWrite600.getClonedField());
        cloneObj.ip00164TableEntry = new Ip00164TableEntry();
        cloneObj.ip00164TableEntry.set(ip00164TableEntry.getClonedField());
        cloneObj.ip00174TableEntry = new Ip00174TableEntry();
        cloneObj.ip00174TableEntry.set(ip00174TableEntry.getClonedField());
        cloneObj.sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        cloneObj.sys001TjfIp370Rec.set(sys001TjfIp370Rec.getClonedField());
        cloneObj.holdVariables800 = new HoldVariables800();
        cloneObj.holdVariables800.set(holdVariables800.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.ip08101RunControlRecord = new Ip08101RunControlRecord();
        cloneObj.ip08101RunControlRecord.set(ip08101RunControlRecord.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.ichgCalcVars800 = new IchgCalcVars800();
        cloneObj.ichgCalcVars800.set(ichgCalcVars800.getClonedField());
        cloneObj.ip00174EntryFoundGroup = new Ip00174EntryFoundGroup();
        cloneObj.ip00174EntryFoundGroup.set(ip00174EntryFoundGroup.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.ip50005ClearingDtTm = new Ip50005ClearingDtTm();
        cloneObj.ip50005ClearingDtTm.set(ip50005ClearingDtTm.getClonedField());
        cloneObj.ip00754TableEntry = new Ip00754TableEntry();
        cloneObj.ip00754TableEntry.set(ip00754TableEntry.getClonedField());
        cloneObj.sys002CntlIchgRec = new Sys002CntlIchgRec();
        cloneObj.sys002CntlIchgRec.set(sys002CntlIchgRec.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.ip0040iAccountRangeInfo = new Ip0040iAccountRangeInfo();
        cloneObj.ip0040iAccountRangeInfo.set(ip0040iAccountRangeInfo.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.msgsRead600 = new MsgsRead600();
        cloneObj.msgsRead600.set(msgsRead600.getClonedField());
        cloneObj.ip00164EntryFoundGroup = new Ip00164EntryFoundGroup();
        cloneObj.ip00164EntryFoundGroup.set(ip00164EntryFoundGroup.getClonedField());
        cloneObj.ip00404Table = new Ip00404Table();
        cloneObj.ip00404Table.set(ip00404Table.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.sys201OutputRecord = new Sys201OutputRecord();
        cloneObj.sys201OutputRecord.set(sys201OutputRecord.getClonedField());
        cloneObj.ip33701CurrConvInterface = new Ip33701CurrConvInterface();
        cloneObj.ip33701CurrConvInterface.set(ip33701CurrConvInterface.getClonedField());
        cloneObj.ip00754EntryFoundGroup = new Ip00754EntryFoundGroup();
        cloneObj.ip00754EntryFoundGroup.set(ip00754EntryFoundGroup.getClonedField());
        cloneObj.internalTblCnt600 = new InternalTblCnt600();
        cloneObj.internalTblCnt600.set(internalTblCnt600.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Work work = Ip088030Ctx.this.getWork();

	/**
	 *	Test condition "10" for isSys001Eof88200()
	 *	@return  Returns true if isSys001Eof88200() is "10"
	 */
   public boolean isSys001Eof88200() throws CFException {
      return work.isSys001Eof88200();
   }

	/**
	*  set values "10"
	*/
   	public void setSys001Eof88200True()  throws CFException{  			
    	work.setSys001Eof88200True();
   	}

        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
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
     public class DoInitializationInCtx implements Cloneable {
     Work work = Ip088030Ctx.this.getWork();
     IchgFeeRecords500 ichgFeeRecords500 = Ip088030Ctx.this.getIchgFeeRecords500();

	/**
	 *	Test condition "10" for isSys002Eof88200()
	 *	@return  Returns true if isSys002Eof88200() is "10"
	 */
   public boolean isSys002Eof88200() throws CFException {
      return work.isSys002Eof88200();
   }

	/**
	*  set values "10"
	*/
   	public void setSys002Eof88200True()  throws CFException{  			
    	work.setSys002Eof88200True();
   	}

        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public DoInitializationOutCtx getDoInitializationOutCtx() {
            return new DoInitializationOutCtx();
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
        str += ichgFeeRecords500.hashCode();
       return str.hashCode();
    }

    public DoInitializationInCtx clone() {
        DoInitializationInCtx cloneObj = new DoInitializationInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ichgFeeRecords500 = new IchgFeeRecords500();
        cloneObj.ichgFeeRecords500.set(ichgFeeRecords500.getClonedField());
        return cloneObj;
    }

    }

    public DoInitializationInCtx getDoInitializationInCtx() {
            return new DoInitializationInCtx();
    }
     public class DoInitializationOutCtx implements Cloneable {
     Work work = Ip088030Ctx.this.getWork();
     IchgFeeRecords500 ichgFeeRecords500 = Ip088030Ctx.this.getIchgFeeRecords500();

	/**
	 *	Returns the value of ichgEntriesCnt500
	 *	@return ichgEntriesCnt500
	 */
	public short getIchgEntriesCnt500() throws CFException {        
   		return ichgFeeRecords500.getIchgEntriesCnt500();
	}
	
	/**
	 * 	Update IchgEntriesCnt500 with the passed value
	 *	@param number
	 */
	public void setIchgEntriesCnt500(short number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesCnt500(number);
	}

	public void setIchgEntriesCnt500(int number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesCnt500((short)number);
	}

	public void setIchgEntriesCnt500(long number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesCnt500((short)number);
	}




        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
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
        str += ichgFeeRecords500.hashCode();
       return str.hashCode();
    }

    public DoInitializationOutCtx clone() {
        DoInitializationOutCtx cloneObj = new DoInitializationOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ichgFeeRecords500 = new IchgFeeRecords500();
        cloneObj.ichgFeeRecords500.set(ichgFeeRecords500.getClonedField());
        return cloneObj;
    }

    }

    public DoInitializationOutCtx getDoInitializationOutCtx() {
            return new DoInitializationOutCtx();
    }
     public class DisplayExecMsgsInCtx implements Cloneable {
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = Ip088030Ctx.this.getIp996011ProgramStartMessage();
     Work work = Ip088030Ctx.this.getWork();

	/**
	 *	Returns the value of pgmId300
	 *	@return pgmId300
	 */
   public char[] getPgmId300() throws CFException  {              
   		return work.getPgmId300();
   }

  
	/**
	*  set variable pgmId300
	*  @param value
	**/
   public void setPgmId300(char[] value) throws CFException {
      work.setPgmId300(value);
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


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
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
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = Ip088030Ctx.this.getIp996011ProgramStartMessage();
     Work work = Ip088030Ctx.this.getWork();

	/**
	 *	Returns the value of pgmId300
	 *	@return pgmId300
	 */
   public char[] getPgmId300() throws CFException  {              
   		return work.getPgmId300();
   }

  
	/**
	*  set variable pgmId300
	*  @param value
	**/
   public void setPgmId300(char[] value) throws CFException {
      work.setPgmId300(value);
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


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
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
     Work work = Ip088030Ctx.this.getWork();

	/**
	 *	Returns the value of pgmIp282010300
	 *	@return pgmIp282010300
	 */
   public char[] getPgmIp282010300() throws CFException  {              
   		return work.getPgmIp282010300();
   }

  
	/**
	*  set variable pgmIp282010300
	*  @param value
	**/
   public void setPgmIp282010300(char[] value) throws CFException {
      work.setPgmIp282010300(value);
   } 

	/**
	 *	Returns the value of pgmIp783510300
	 *	@return pgmIp783510300
	 */
   public char[] getPgmIp783510300() throws CFException  {              
   		return work.getPgmIp783510300();
   }

  
	/**
	*  set variable pgmIp783510300
	*  @param value
	**/
   public void setPgmIp783510300(char[] value) throws CFException {
      work.setPgmIp783510300(value);
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
	 *	Returns the value of pgmIp610010300
	 *	@return pgmIp610010300
	 */
   public char[] getPgmIp610010300() throws CFException  {              
   		return work.getPgmIp610010300();
   }

  
	/**
	*  set variable pgmIp610010300
	*  @param value
	**/
   public void setPgmIp610010300(char[] value) throws CFException {
      work.setPgmIp610010300(value);
   } 

	/**
	 *	Returns the value of pgmIp280510300
	 *	@return pgmIp280510300
	 */
   public char[] getPgmIp280510300() throws CFException  {              
   		return work.getPgmIp280510300();
   }

  
	/**
	*  set variable pgmIp280510300
	*  @param value
	**/
   public void setPgmIp280510300(char[] value) throws CFException {
      work.setPgmIp280510300(value);
   } 

	/**
	 *	Returns the value of pgmIp288010300
	 *	@return pgmIp288010300
	 */
   public char[] getPgmIp288010300() throws CFException  {              
   		return work.getPgmIp288010300();
   }

  
	/**
	*  set variable pgmIp288010300
	*  @param value
	**/
   public void setPgmIp288010300(char[] value) throws CFException {
      work.setPgmIp288010300(value);
   } 

	/**
	 *	Returns the value of pgmIp280010300
	 *	@return pgmIp280010300
	 */
   public char[] getPgmIp280010300() throws CFException  {              
   		return work.getPgmIp280010300();
   }

  
	/**
	*  set variable pgmIp280010300
	*  @param value
	**/
   public void setPgmIp280010300(char[] value) throws CFException {
      work.setPgmIp280010300(value);
   } 


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
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
     Work work = Ip088030Ctx.this.getWork();

	/**
	 *	Returns the value of ptrIp783510800
	 *	@return ptrIp783510800
	 */
   public char[] getPtrIp783510800() throws CFException  {              
   		return work.getPtrIp783510800();
   }

  
	/**
	*  set variable ptrIp783510800
	*  @param value
	**/
   public void setPtrIp783510800(char[] value) throws CFException {
      work.setPtrIp783510800(value);
   } 

	/**
	 *	Returns the value of ptrIp280010800
	 *	@return ptrIp280010800
	 */
   public char[] getPtrIp280010800() throws CFException  {              
   		return work.getPtrIp280010800();
   }

  
	/**
	*  set variable ptrIp280010800
	*  @param value
	**/
   public void setPtrIp280010800(char[] value) throws CFException {
      work.setPtrIp280010800(value);
   } 

	/**
	 *	Returns the value of ptrIp280510800
	 *	@return ptrIp280510800
	 */
   public char[] getPtrIp280510800() throws CFException  {              
   		return work.getPtrIp280510800();
   }

  
	/**
	*  set variable ptrIp280510800
	*  @param value
	**/
   public void setPtrIp280510800(char[] value) throws CFException {
      work.setPtrIp280510800(value);
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
	 *	Returns the value of ptrIp282010800
	 *	@return ptrIp282010800
	 */
   public char[] getPtrIp282010800() throws CFException  {              
   		return work.getPtrIp282010800();
   }

  
	/**
	*  set variable ptrIp282010800
	*  @param value
	**/
   public void setPtrIp282010800(char[] value) throws CFException {
      work.setPtrIp282010800(value);
   } 

	/**
	 *	Returns the value of ptrIp288010800
	 *	@return ptrIp288010800
	 */
   public char[] getPtrIp288010800() throws CFException  {              
   		return work.getPtrIp288010800();
   }

  
	/**
	*  set variable ptrIp288010800
	*  @param value
	**/
   public void setPtrIp288010800(char[] value) throws CFException {
      work.setPtrIp288010800(value);
   } 

	/**
	 *	Returns the value of ptrIp610010800
	 *	@return ptrIp610010800
	 */
   public char[] getPtrIp610010800() throws CFException  {              
   		return work.getPtrIp610010800();
   }

  
	/**
	*  set variable ptrIp610010800
	*  @param value
	**/
   public void setPtrIp610010800(char[] value) throws CFException {
      work.setPtrIp610010800(value);
   } 


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
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
     public class OpenInputSys001InCtx implements Cloneable {
     Sys001TjfIp370Rec sys001TjfIp370Rec = Ip088030Ctx.this.getSys001TjfIp370Rec();
     AbendMessage900 abendMessage900 = Ip088030Ctx.this.getAbendMessage900();
     AbendMessage600 abendMessage600 = Ip088030Ctx.this.getAbendMessage600();
     Work work = Ip088030Ctx.this.getWork();
     AbendPara900 abendPara900 = Ip088030Ctx.this.getAbendPara900();

	/**
	 *	Returns the value of sys001TjfIp370Rec
	 *	@return sys001TjfIp370Rec
	 */   
	 public Sys001TjfIp370Rec getSys001TjfIp370Rec() {
   	return sys001TjfIp370Rec;
   }


	/**
	 *	Returns the value of abendMessage600
	 *	@return abendMessage600
	 */   
	 public AbendMessage600 getAbendMessage600() {
   	return abendMessage600;
   }



        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public OpenInputSys001OutCtx getOpenInputSys001OutCtx() {
            return new OpenInputSys001OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001TjfIp370Rec.hashCode();
        str += abendMessage900.hashCode();
        str += abendMessage600.hashCode();
        str += work.hashCode();
        str += abendPara900.hashCode();
       return str.hashCode();
    }

    public OpenInputSys001InCtx clone() {
        OpenInputSys001InCtx cloneObj = new OpenInputSys001InCtx();
        cloneObj.sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        cloneObj.sys001TjfIp370Rec.set(sys001TjfIp370Rec.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        return cloneObj;
    }

    }

    public OpenInputSys001InCtx getOpenInputSys001InCtx() {
            return new OpenInputSys001InCtx();
    }
     public class OpenInputSys001OutCtx implements Cloneable {
     Sys001TjfIp370Rec sys001TjfIp370Rec = Ip088030Ctx.this.getSys001TjfIp370Rec();
     AbendMessage900 abendMessage900 = Ip088030Ctx.this.getAbendMessage900();
     AbendMessage600 abendMessage600 = Ip088030Ctx.this.getAbendMessage600();
     Work work = Ip088030Ctx.this.getWork();
     AbendPara900 abendPara900 = Ip088030Ctx.this.getAbendPara900();

	/**
	 *	Test condition "00" for isSys001IoGood88200()
	 *	@return  Returns true if isSys001IoGood88200() is "00"
	 */
   public boolean isSys001IoGood88200() throws CFException {
      return work.isSys001IoGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys001IoGood88200True()  throws CFException{  			
    	work.setSys001IoGood88200True();
   	}
	/**
	 *	Test condition "1310-OPEN-INPUT-SYS001" for isAbendPara131088300()
	 *	@return  Returns true if isAbendPara131088300() is "1310-OPEN-INPUT-SYS001"
	 */
   public boolean isAbendPara131088300() throws CFException {
      return work.isAbendPara131088300();
   }

	/**
	*  set values "1310-OPEN-INPUT-SYS001"
	*/
   	public void setAbendPara131088300True()  throws CFException{  			
    	work.setAbendPara131088300True();
   	}
	/**
	 *	Returns the value of fileStatus600
	 *	@return fileStatus600
	 */
   public char[] getFileStatus600() throws CFException  {              
   		return abendMessage600.getFileStatus600();
   }

  
	/**
	*  set variable fileStatus600
	*  @param value
	**/
   public void setFileStatus600(char[] value) throws CFException {
      abendMessage600.setFileStatus600(value);
   } 

     /**
	 * 	Update FileStatus600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileStatus600(char[] source, int sourceIndex) throws CFException {
      abendMessage600.setFileStatus600(source, sourceIndex);
   	
   }
   
   public void setFileStatus600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FileStatus600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileStatus600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FileStatus600 with another Field
	 *	@param value
	 */
   public void setFileStatus600(Field source) {
      abendMessage600.setFileStatus600(source);
   }  
   
     /**
	 * 	Update FileStatus600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileStatus600(Field source, int sourceIndex,int sourceLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FileStatus600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileStatus600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of sys201FileStatus200
	 *	@return sys201FileStatus200
	 */
   public char[] getSys201FileStatus200() throws CFException  {              
   		return work.getSys201FileStatus200();
   }

  
	/**
	*  set variable sys201FileStatus200
	*  @param value
	**/
   public void setSys201FileStatus200(char[] value) throws CFException {
      work.setSys201FileStatus200(value);
   } 

	/**
	 *	Returns the value of abendMessage600
	 *	@return abendMessage600
	 */   
	 public AbendMessage600 getAbendMessage600() {
   	return abendMessage600;
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
	 *	Returns the value of sys001FileStatus200
	 *	@return sys001FileStatus200
	 */
   public char[] getSys001FileStatus200() throws CFException  {              
   		return work.getSys001FileStatus200();
   }

  
	/**
	*  set variable sys001FileStatus200
	*  @param value
	**/
   public void setSys001FileStatus200(char[] value) throws CFException {
      work.setSys001FileStatus200(value);
   } 

	/**
	 *	Test condition 3001 for isOpenAbendCode88300()
	 *	@return  Returns true if isOpenAbendCode88300() is 3001
	 */
   public boolean isOpenAbendCode88300() throws CFException {
      return work.isOpenAbendCode88300();
   }

	/**
	*  set values 3001
	*/
   	public void setOpenAbendCode88300True()  throws CFException{  			
    	work.setOpenAbendCode88300True();
   	}
	/**
	 *	Returns the value of abendParaName300
	 *	@return abendParaName300
	 */
   public char[] getAbendParaName300() throws CFException  {              
   		return work.getAbendParaName300();
   }

  
	/**
	*  set variable abendParaName300
	*  @param value
	**/
   public void setAbendParaName300(char[] value) throws CFException {
      work.setAbendParaName300(value);
   } 

	/**
	 *	Returns the value of abendCode300
	 *	@return abendCode300
	 */
	public int getAbendCode300() throws CFException {
   		return work.getAbendCode300();
	}


	/**
	 *	Returns String value of abendCode300
	 *	@return abendCode300
	 */
	public char[]  getAbendCode300String() throws CFException {
	     return String.valueOf(work.getAbendCode300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode300IsNumeric()  throws CFException{
	    return work.abendCode300IsNumeric();
	}

	/**
	 * 	Update AbendCode300 with the passed value
	 *	@param number
	 */
	public void setAbendCode300(int number)  throws CFException{
		work.setAbendCode300(number);
	}
	

	public void setAbendCode300(long number)  throws CFException{
	    work.setAbendCode300(number);
	}
	
	
	/**
	 * 	Update AbendCode300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode300(char[] value)  throws CFException {
		work.setAbendCode300(value);
	}
	
	/**
	 * 	Update AbendCode300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode300String(char[] value)  throws CFException{
		work.setAbendCode300(value);
	}	

	/**
	 *	Test condition "ERROR OPENING SYS001-FILE" for isAbendOpenSys00188600()
	 *	@return  Returns true if isAbendOpenSys00188600() is "ERROR OPENING SYS001-FILE"
	 */
   public boolean isAbendOpenSys00188600() throws CFException {
      return abendMessage600.isAbendOpenSys00188600();
   }

	/**
	*  set values "ERROR OPENING SYS001-FILE"
	*/
   	public void setAbendOpenSys00188600True()  throws CFException{  			
    	abendMessage600.setAbendOpenSys00188600True();
   	}

        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001TjfIp370Rec.hashCode();
        str += abendMessage900.hashCode();
        str += abendMessage600.hashCode();
        str += work.hashCode();
        str += abendPara900.hashCode();
       return str.hashCode();
    }

    public OpenInputSys001OutCtx clone() {
        OpenInputSys001OutCtx cloneObj = new OpenInputSys001OutCtx();
        cloneObj.sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        cloneObj.sys001TjfIp370Rec.set(sys001TjfIp370Rec.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        return cloneObj;
    }

    }

    public OpenInputSys001OutCtx getOpenInputSys001OutCtx() {
            return new OpenInputSys001OutCtx();
    }
     public class OpenInputSys002InCtx implements Cloneable {
     Sys002CntlIchgRec sys002CntlIchgRec = Ip088030Ctx.this.getSys002CntlIchgRec();
     AbendMessage900 abendMessage900 = Ip088030Ctx.this.getAbendMessage900();
     AbendMessage600 abendMessage600 = Ip088030Ctx.this.getAbendMessage600();
     Work work = Ip088030Ctx.this.getWork();
     AbendPara900 abendPara900 = Ip088030Ctx.this.getAbendPara900();

	/**
	 *	Returns the value of sys002CntlIchgRec
	 *	@return sys002CntlIchgRec
	 */   
	 public Sys002CntlIchgRec getSys002CntlIchgRec() {
   	return sys002CntlIchgRec;
   }


	/**
	 *	Returns the value of abendMessage600
	 *	@return abendMessage600
	 */   
	 public AbendMessage600 getAbendMessage600() {
   	return abendMessage600;
   }



        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public OpenInputSys002OutCtx getOpenInputSys002OutCtx() {
            return new OpenInputSys002OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys002CntlIchgRec.hashCode();
        str += abendMessage900.hashCode();
        str += abendMessage600.hashCode();
        str += work.hashCode();
        str += abendPara900.hashCode();
       return str.hashCode();
    }

    public OpenInputSys002InCtx clone() {
        OpenInputSys002InCtx cloneObj = new OpenInputSys002InCtx();
        cloneObj.sys002CntlIchgRec = new Sys002CntlIchgRec();
        cloneObj.sys002CntlIchgRec.set(sys002CntlIchgRec.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        return cloneObj;
    }

    }

    public OpenInputSys002InCtx getOpenInputSys002InCtx() {
            return new OpenInputSys002InCtx();
    }
     public class OpenInputSys002OutCtx implements Cloneable {
     Sys002CntlIchgRec sys002CntlIchgRec = Ip088030Ctx.this.getSys002CntlIchgRec();
     AbendMessage900 abendMessage900 = Ip088030Ctx.this.getAbendMessage900();
     AbendMessage600 abendMessage600 = Ip088030Ctx.this.getAbendMessage600();
     Work work = Ip088030Ctx.this.getWork();
     AbendPara900 abendPara900 = Ip088030Ctx.this.getAbendPara900();

	/**
	 *	Returns the value of fileStatus600
	 *	@return fileStatus600
	 */
   public char[] getFileStatus600() throws CFException  {              
   		return abendMessage600.getFileStatus600();
   }

  
	/**
	*  set variable fileStatus600
	*  @param value
	**/
   public void setFileStatus600(char[] value) throws CFException {
      abendMessage600.setFileStatus600(value);
   } 

     /**
	 * 	Update FileStatus600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileStatus600(char[] source, int sourceIndex) throws CFException {
      abendMessage600.setFileStatus600(source, sourceIndex);
   	
   }
   
   public void setFileStatus600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FileStatus600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileStatus600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FileStatus600 with another Field
	 *	@param value
	 */
   public void setFileStatus600(Field source) {
      abendMessage600.setFileStatus600(source);
   }  
   
     /**
	 * 	Update FileStatus600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileStatus600(Field source, int sourceIndex,int sourceLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FileStatus600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileStatus600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of sys002FileStatus200
	 *	@return sys002FileStatus200
	 */
   public char[] getSys002FileStatus200() throws CFException  {              
   		return work.getSys002FileStatus200();
   }

  
	/**
	*  set variable sys002FileStatus200
	*  @param value
	**/
   public void setSys002FileStatus200(char[] value) throws CFException {
      work.setSys002FileStatus200(value);
   } 

	/**
	 *	Returns the value of sys201FileStatus200
	 *	@return sys201FileStatus200
	 */
   public char[] getSys201FileStatus200() throws CFException  {              
   		return work.getSys201FileStatus200();
   }

  
	/**
	*  set variable sys201FileStatus200
	*  @param value
	**/
   public void setSys201FileStatus200(char[] value) throws CFException {
      work.setSys201FileStatus200(value);
   } 

	/**
	 *	Returns the value of abendMessage600
	 *	@return abendMessage600
	 */   
	 public AbendMessage600 getAbendMessage600() {
   	return abendMessage600;
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
	 *	Test condition 3001 for isOpenAbendCode88300()
	 *	@return  Returns true if isOpenAbendCode88300() is 3001
	 */
   public boolean isOpenAbendCode88300() throws CFException {
      return work.isOpenAbendCode88300();
   }

	/**
	*  set values 3001
	*/
   	public void setOpenAbendCode88300True()  throws CFException{  			
    	work.setOpenAbendCode88300True();
   	}
	/**
	 *	Test condition "ERROR OPENING SYS002-FILE" for isAbendOpenSys00288600()
	 *	@return  Returns true if isAbendOpenSys00288600() is "ERROR OPENING SYS002-FILE"
	 */
   public boolean isAbendOpenSys00288600() throws CFException {
      return abendMessage600.isAbendOpenSys00288600();
   }

	/**
	*  set values "ERROR OPENING SYS002-FILE"
	*/
   	public void setAbendOpenSys00288600True()  throws CFException{  			
    	abendMessage600.setAbendOpenSys00288600True();
   	}
	/**
	 *	Returns the value of abendParaName300
	 *	@return abendParaName300
	 */
   public char[] getAbendParaName300() throws CFException  {              
   		return work.getAbendParaName300();
   }

  
	/**
	*  set variable abendParaName300
	*  @param value
	**/
   public void setAbendParaName300(char[] value) throws CFException {
      work.setAbendParaName300(value);
   } 

	/**
	 *	Returns the value of abendCode300
	 *	@return abendCode300
	 */
	public int getAbendCode300() throws CFException {
   		return work.getAbendCode300();
	}


	/**
	 *	Returns String value of abendCode300
	 *	@return abendCode300
	 */
	public char[]  getAbendCode300String() throws CFException {
	     return String.valueOf(work.getAbendCode300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode300IsNumeric()  throws CFException{
	    return work.abendCode300IsNumeric();
	}

	/**
	 * 	Update AbendCode300 with the passed value
	 *	@param number
	 */
	public void setAbendCode300(int number)  throws CFException{
		work.setAbendCode300(number);
	}
	

	public void setAbendCode300(long number)  throws CFException{
	    work.setAbendCode300(number);
	}
	
	
	/**
	 * 	Update AbendCode300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode300(char[] value)  throws CFException {
		work.setAbendCode300(value);
	}
	
	/**
	 * 	Update AbendCode300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode300String(char[] value)  throws CFException{
		work.setAbendCode300(value);
	}	

	/**
	 *	Test condition "00" for isSys002IoGood88200()
	 *	@return  Returns true if isSys002IoGood88200() is "00"
	 */
   public boolean isSys002IoGood88200() throws CFException {
      return work.isSys002IoGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys002IoGood88200True()  throws CFException{  			
    	work.setSys002IoGood88200True();
   	}
	/**
	 *	Test condition "1320-OPEN-INPUT-SYS002" for isAbendPara132088300()
	 *	@return  Returns true if isAbendPara132088300() is "1320-OPEN-INPUT-SYS002"
	 */
   public boolean isAbendPara132088300() throws CFException {
      return work.isAbendPara132088300();
   }

	/**
	*  set values "1320-OPEN-INPUT-SYS002"
	*/
   	public void setAbendPara132088300True()  throws CFException{  			
    	work.setAbendPara132088300True();
   	}

        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys002CntlIchgRec.hashCode();
        str += abendMessage900.hashCode();
        str += abendMessage600.hashCode();
        str += work.hashCode();
        str += abendPara900.hashCode();
       return str.hashCode();
    }

    public OpenInputSys002OutCtx clone() {
        OpenInputSys002OutCtx cloneObj = new OpenInputSys002OutCtx();
        cloneObj.sys002CntlIchgRec = new Sys002CntlIchgRec();
        cloneObj.sys002CntlIchgRec.set(sys002CntlIchgRec.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        return cloneObj;
    }

    }

    public OpenInputSys002OutCtx getOpenInputSys002OutCtx() {
            return new OpenInputSys002OutCtx();
    }
     public class OpenOutputSys201InCtx implements Cloneable {
     AbendMessage900 abendMessage900 = Ip088030Ctx.this.getAbendMessage900();
     AbendMessage600 abendMessage600 = Ip088030Ctx.this.getAbendMessage600();
     Work work = Ip088030Ctx.this.getWork();
     AbendPara900 abendPara900 = Ip088030Ctx.this.getAbendPara900();
     Sys201OutputRecord sys201OutputRecord = Ip088030Ctx.this.getSys201OutputRecord();

	/**
	 *	Returns the value of abendMessage600
	 *	@return abendMessage600
	 */   
	 public AbendMessage600 getAbendMessage600() {
   	return abendMessage600;
   }


	/**
	 *	Returns the value of sys201OutputRecord
	 *	@return sys201OutputRecord
	 */   
	 public Sys201OutputRecord getSys201OutputRecord() {
   	return sys201OutputRecord;
   }



        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public OpenOutputSys201OutCtx getOpenOutputSys201OutCtx() {
            return new OpenOutputSys201OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendMessage900.hashCode();
        str += abendMessage600.hashCode();
        str += work.hashCode();
        str += abendPara900.hashCode();
        str += sys201OutputRecord.hashCode();
       return str.hashCode();
    }

    public OpenOutputSys201InCtx clone() {
        OpenOutputSys201InCtx cloneObj = new OpenOutputSys201InCtx();
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.sys201OutputRecord = new Sys201OutputRecord();
        cloneObj.sys201OutputRecord.set(sys201OutputRecord.getClonedField());
        return cloneObj;
    }

    }

    public OpenOutputSys201InCtx getOpenOutputSys201InCtx() {
            return new OpenOutputSys201InCtx();
    }
     public class OpenOutputSys201OutCtx implements Cloneable {
     AbendMessage900 abendMessage900 = Ip088030Ctx.this.getAbendMessage900();
     AbendMessage600 abendMessage600 = Ip088030Ctx.this.getAbendMessage600();
     Work work = Ip088030Ctx.this.getWork();
     AbendPara900 abendPara900 = Ip088030Ctx.this.getAbendPara900();
     Sys201OutputRecord sys201OutputRecord = Ip088030Ctx.this.getSys201OutputRecord();

	/**
	 *	Returns the value of fileStatus600
	 *	@return fileStatus600
	 */
   public char[] getFileStatus600() throws CFException  {              
   		return abendMessage600.getFileStatus600();
   }

  
	/**
	*  set variable fileStatus600
	*  @param value
	**/
   public void setFileStatus600(char[] value) throws CFException {
      abendMessage600.setFileStatus600(value);
   } 

     /**
	 * 	Update FileStatus600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileStatus600(char[] source, int sourceIndex) throws CFException {
      abendMessage600.setFileStatus600(source, sourceIndex);
   	
   }
   
   public void setFileStatus600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FileStatus600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileStatus600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FileStatus600 with another Field
	 *	@param value
	 */
   public void setFileStatus600(Field source) {
      abendMessage600.setFileStatus600(source);
   }  
   
     /**
	 * 	Update FileStatus600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileStatus600(Field source, int sourceIndex,int sourceLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FileStatus600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileStatus600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of sys201FileStatus200
	 *	@return sys201FileStatus200
	 */
   public char[] getSys201FileStatus200() throws CFException  {              
   		return work.getSys201FileStatus200();
   }

  
	/**
	*  set variable sys201FileStatus200
	*  @param value
	**/
   public void setSys201FileStatus200(char[] value) throws CFException {
      work.setSys201FileStatus200(value);
   } 

	/**
	 *	Returns the value of abendMessage600
	 *	@return abendMessage600
	 */   
	 public AbendMessage600 getAbendMessage600() {
   	return abendMessage600;
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
	 *	Test condition 3001 for isOpenAbendCode88300()
	 *	@return  Returns true if isOpenAbendCode88300() is 3001
	 */
   public boolean isOpenAbendCode88300() throws CFException {
      return work.isOpenAbendCode88300();
   }

	/**
	*  set values 3001
	*/
   	public void setOpenAbendCode88300True()  throws CFException{  			
    	work.setOpenAbendCode88300True();
   	}
	/**
	 *	Returns the value of abendCode300
	 *	@return abendCode300
	 */
	public int getAbendCode300() throws CFException {
   		return work.getAbendCode300();
	}


	/**
	 *	Returns String value of abendCode300
	 *	@return abendCode300
	 */
	public char[]  getAbendCode300String() throws CFException {
	     return String.valueOf(work.getAbendCode300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode300IsNumeric()  throws CFException{
	    return work.abendCode300IsNumeric();
	}

	/**
	 * 	Update AbendCode300 with the passed value
	 *	@param number
	 */
	public void setAbendCode300(int number)  throws CFException{
		work.setAbendCode300(number);
	}
	

	public void setAbendCode300(long number)  throws CFException{
	    work.setAbendCode300(number);
	}
	
	
	/**
	 * 	Update AbendCode300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode300(char[] value)  throws CFException {
		work.setAbendCode300(value);
	}
	
	/**
	 * 	Update AbendCode300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode300String(char[] value)  throws CFException{
		work.setAbendCode300(value);
	}	

	/**
	 *	Test condition "1330-OPEN-OUTPUT-SYS201" for isAbendPara133088300()
	 *	@return  Returns true if isAbendPara133088300() is "1330-OPEN-OUTPUT-SYS201"
	 */
   public boolean isAbendPara133088300() throws CFException {
      return work.isAbendPara133088300();
   }

	/**
	*  set values "1330-OPEN-OUTPUT-SYS201"
	*/
   	public void setAbendPara133088300True()  throws CFException{  			
    	work.setAbendPara133088300True();
   	}
	/**
	 *	Test condition "ERROR OPENING SYS201-FILE" for isAbendOpenSys20188600()
	 *	@return  Returns true if isAbendOpenSys20188600() is "ERROR OPENING SYS201-FILE"
	 */
   public boolean isAbendOpenSys20188600() throws CFException {
      return abendMessage600.isAbendOpenSys20188600();
   }

	/**
	*  set values "ERROR OPENING SYS201-FILE"
	*/
   	public void setAbendOpenSys20188600True()  throws CFException{  			
    	abendMessage600.setAbendOpenSys20188600True();
   	}
	/**
	 *	Test condition "00" for isSys201IoGood88200()
	 *	@return  Returns true if isSys201IoGood88200() is "00"
	 */
   public boolean isSys201IoGood88200() throws CFException {
      return work.isSys201IoGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys201IoGood88200True()  throws CFException{  			
    	work.setSys201IoGood88200True();
   	}
	/**
	 *	Returns the value of abendParaName300
	 *	@return abendParaName300
	 */
   public char[] getAbendParaName300() throws CFException  {              
   		return work.getAbendParaName300();
   }

  
	/**
	*  set variable abendParaName300
	*  @param value
	**/
   public void setAbendParaName300(char[] value) throws CFException {
      work.setAbendParaName300(value);
   } 


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendMessage900.hashCode();
        str += abendMessage600.hashCode();
        str += work.hashCode();
        str += abendPara900.hashCode();
        str += sys201OutputRecord.hashCode();
       return str.hashCode();
    }

    public OpenOutputSys201OutCtx clone() {
        OpenOutputSys201OutCtx cloneObj = new OpenOutputSys201OutCtx();
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.sys201OutputRecord = new Sys201OutputRecord();
        cloneObj.sys201OutputRecord.set(sys201OutputRecord.getClonedField());
        return cloneObj;
    }

    }

    public OpenOutputSys201OutCtx getOpenOutputSys201OutCtx() {
            return new OpenOutputSys201OutCtx();
    }
     public class CallRuncntlApiInCtx implements Cloneable {
     Work work = Ip088030Ctx.this.getWork();
     Ip08101RunControlRecord ip08101RunControlRecord = Ip088030Ctx.this.getIp08101RunControlRecord();
     Ip50005ClearingDtTm ip50005ClearingDtTm = Ip088030Ctx.this.getIp50005ClearingDtTm();

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


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public CallRuncntlApiOutCtx getCallRuncntlApiOutCtx() {
            return new CallRuncntlApiOutCtx();
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
        str += ip08101RunControlRecord.hashCode();
        str += ip50005ClearingDtTm.hashCode();
       return str.hashCode();
    }

    public CallRuncntlApiInCtx clone() {
        CallRuncntlApiInCtx cloneObj = new CallRuncntlApiInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip08101RunControlRecord = new Ip08101RunControlRecord();
        cloneObj.ip08101RunControlRecord.set(ip08101RunControlRecord.getClonedField());
        cloneObj.ip50005ClearingDtTm = new Ip50005ClearingDtTm();
        cloneObj.ip50005ClearingDtTm.set(ip50005ClearingDtTm.getClonedField());
        return cloneObj;
    }

    }

    public CallRuncntlApiInCtx getCallRuncntlApiInCtx() {
            return new CallRuncntlApiInCtx();
    }
     public class CallRuncntlApiOutCtx implements Cloneable {
     Work work = Ip088030Ctx.this.getWork();
     Ip08101RunControlRecord ip08101RunControlRecord = Ip088030Ctx.this.getIp08101RunControlRecord();
     Ip50005ClearingDtTm ip50005ClearingDtTm = Ip088030Ctx.this.getIp50005ClearingDtTm();

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


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
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
        str += ip08101RunControlRecord.hashCode();
        str += ip50005ClearingDtTm.hashCode();
       return str.hashCode();
    }

    public CallRuncntlApiOutCtx clone() {
        CallRuncntlApiOutCtx cloneObj = new CallRuncntlApiOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip08101RunControlRecord = new Ip08101RunControlRecord();
        cloneObj.ip08101RunControlRecord.set(ip08101RunControlRecord.getClonedField());
        cloneObj.ip50005ClearingDtTm = new Ip50005ClearingDtTm();
        cloneObj.ip50005ClearingDtTm.set(ip50005ClearingDtTm.getClonedField());
        return cloneObj;
    }

    }

    public CallRuncntlApiOutCtx getCallRuncntlApiOutCtx() {
            return new CallRuncntlApiOutCtx();
    }
     public class LoadIchgFeeTableInCtx implements Cloneable {
     Sys002CntlIchgRec sys002CntlIchgRec = Ip088030Ctx.this.getSys002CntlIchgRec();
     AbendMessage900 abendMessage900 = Ip088030Ctx.this.getAbendMessage900();
     Work work = Ip088030Ctx.this.getWork();
     AbendPara900 abendPara900 = Ip088030Ctx.this.getAbendPara900();
     IchgFeeRecords500 ichgFeeRecords500 = Ip088030Ctx.this.getIchgFeeRecords500();

	/**
	 *	Test condition "C" "D" for isIp9815388ValidRecType()
	 *	@return  Returns true if isIp9815388ValidRecType() is "C" "D"
	 */
   public boolean isIp9815388ValidRecType() throws CFException {
      return sys002CntlIchgRec.isIp9815388ValidRecType();
   }

	/**
	*  set values "C" "D"
	*/
   	public void setIp9815388ValidRecTypeTrue()  throws CFException{  			
    	sys002CntlIchgRec.setIp9815388ValidRecTypeTrue();
   	}
	/**
	 *	Returns the value of sys002CntlIchgRec
	 *	@return sys002CntlIchgRec
	 */   
	 public Sys002CntlIchgRec getSys002CntlIchgRec() {
   	return sys002CntlIchgRec;
   }


	/**
	 *	Returns the value of ichgEntriesCnt500
	 *	@return ichgEntriesCnt500
	 */
	public short getIchgEntriesCnt500() throws CFException {        
   		return ichgFeeRecords500.getIchgEntriesCnt500();
	}
	
	/**
	 * 	Update IchgEntriesCnt500 with the passed value
	 *	@param number
	 */
	public void setIchgEntriesCnt500(short number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesCnt500(number);
	}

	public void setIchgEntriesCnt500(int number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesCnt500((short)number);
	}

	public void setIchgEntriesCnt500(long number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesCnt500((short)number);
	}




public void setIchgIdx500(int ichgIdx500) { 
    Ip088030Ctx.this.ichgIdx500 = ichgIdx500;
}

public int getIchgIdx500() { 
    return Ip088030Ctx.this.ichgIdx500;
}
	/**
	 *	Returns the value of abendMsgTblErr600
	 *	@return abendMsgTblErr600
	 */
   public char[] getAbendMsgTblErr600() throws CFException  {              
   		return work.getAbendMsgTblErr600();
   }

  
	/**
	*  set variable abendMsgTblErr600
	*  @param value
	**/
   public void setAbendMsgTblErr600(char[] value) throws CFException {
      work.setAbendMsgTblErr600(value);
   } 

	/**
	 *	Returns the value of ichgEntriesMax500
	 *	@return ichgEntriesMax500
	 */
	public short getIchgEntriesMax500() throws CFException {        
   		return ichgFeeRecords500.getIchgEntriesMax500();
	}
	
	/**
	 * 	Update IchgEntriesMax500 with the passed value
	 *	@param number
	 */
	public void setIchgEntriesMax500(short number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesMax500(number);
	}

	public void setIchgEntriesMax500(int number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesMax500((short)number);
	}

	public void setIchgEntriesMax500(long number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesMax500((short)number);
	}




        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public LoadIchgFeeTableOutCtx getLoadIchgFeeTableOutCtx() {
            return new LoadIchgFeeTableOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys002CntlIchgRec.hashCode();
        str += abendMessage900.hashCode();
        str += work.hashCode();
        str += abendPara900.hashCode();
        str += ichgFeeRecords500.hashCode();
       return str.hashCode();
    }

    public LoadIchgFeeTableInCtx clone() {
        LoadIchgFeeTableInCtx cloneObj = new LoadIchgFeeTableInCtx();
        cloneObj.sys002CntlIchgRec = new Sys002CntlIchgRec();
        cloneObj.sys002CntlIchgRec.set(sys002CntlIchgRec.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.ichgFeeRecords500 = new IchgFeeRecords500();
        cloneObj.ichgFeeRecords500.set(ichgFeeRecords500.getClonedField());
        return cloneObj;
    }

    }

    public LoadIchgFeeTableInCtx getLoadIchgFeeTableInCtx() {
            return new LoadIchgFeeTableInCtx();
    }
     public class LoadIchgFeeTableOutCtx implements Cloneable {
     Sys002CntlIchgRec sys002CntlIchgRec = Ip088030Ctx.this.getSys002CntlIchgRec();
     AbendMessage900 abendMessage900 = Ip088030Ctx.this.getAbendMessage900();
     Work work = Ip088030Ctx.this.getWork();
     AbendPara900 abendPara900 = Ip088030Ctx.this.getAbendPara900();
     IchgFeeRecords500 ichgFeeRecords500 = Ip088030Ctx.this.getIchgFeeRecords500();

	/**
	 *	Returns the value of ichgEntry500
	 *	@return ichgEntry500
	 */   
	 public IchgEntry500 getIchgEntry500(int index) {
   	return ichgFeeRecords500.getIchgEntry500(index);
   }

    public List<IchgEntry500> getIchgEntry500() {
        return ichgFeeRecords500.getIchgEntry500();
    }
   /**
	* 	Update IchgEntry500 with the passed value
	*	@param value
	*/
   public void setIchgEntry500(int index,char[] value) throws CFException {
      ichgFeeRecords500.setIchgEntry500((index),value);
   }   


	/**
	 *	Returns the value of sys002CntlIchgRec
	 *	@return sys002CntlIchgRec
	 */   
	 public Sys002CntlIchgRec getSys002CntlIchgRec() {
   	return sys002CntlIchgRec;
   }


	/**
	 *	Test condition "1500-LOAD-ICHG-FEE-TABLE" for isAbendPara150088300()
	 *	@return  Returns true if isAbendPara150088300() is "1500-LOAD-ICHG-FEE-TABLE"
	 */
   public boolean isAbendPara150088300() throws CFException {
      return work.isAbendPara150088300();
   }

	/**
	*  set values "1500-LOAD-ICHG-FEE-TABLE"
	*/
   	public void setAbendPara150088300True()  throws CFException{  			
    	work.setAbendPara150088300True();
   	}
	/**
	 *	Returns the value of ichgEntriesCnt500
	 *	@return ichgEntriesCnt500
	 */
	public short getIchgEntriesCnt500() throws CFException {        
   		return ichgFeeRecords500.getIchgEntriesCnt500();
	}
	
	/**
	 * 	Update IchgEntriesCnt500 with the passed value
	 *	@param number
	 */
	public void setIchgEntriesCnt500(short number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesCnt500(number);
	}

	public void setIchgEntriesCnt500(int number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesCnt500((short)number);
	}

	public void setIchgEntriesCnt500(long number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesCnt500((short)number);
	}




public void setIchgIdx500(int ichgIdx500) { 
    Ip088030Ctx.this.ichgIdx500 = ichgIdx500;
}

public int getIchgIdx500() { 
    return Ip088030Ctx.this.ichgIdx500;
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
	 *	Returns the value of abendCode300
	 *	@return abendCode300
	 */
	public int getAbendCode300() throws CFException {
   		return work.getAbendCode300();
	}


	/**
	 *	Returns String value of abendCode300
	 *	@return abendCode300
	 */
	public char[]  getAbendCode300String() throws CFException {
	     return String.valueOf(work.getAbendCode300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode300IsNumeric()  throws CFException{
	    return work.abendCode300IsNumeric();
	}

	/**
	 * 	Update AbendCode300 with the passed value
	 *	@param number
	 */
	public void setAbendCode300(int number)  throws CFException{
		work.setAbendCode300(number);
	}
	

	public void setAbendCode300(long number)  throws CFException{
	    work.setAbendCode300(number);
	}
	
	
	/**
	 * 	Update AbendCode300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode300(char[] value)  throws CFException {
		work.setAbendCode300(value);
	}
	
	/**
	 * 	Update AbendCode300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode300String(char[] value)  throws CFException{
		work.setAbendCode300(value);
	}	

	/**
	 *	Returns the value of abendParaName300
	 *	@return abendParaName300
	 */
   public char[] getAbendParaName300() throws CFException  {              
   		return work.getAbendParaName300();
   }

  
	/**
	*  set variable abendParaName300
	*  @param value
	**/
   public void setAbendParaName300(char[] value) throws CFException {
      work.setAbendParaName300(value);
   } 

	/**
	 *	Returns the value of abendMsgTblErr600
	 *	@return abendMsgTblErr600
	 */
   public char[] getAbendMsgTblErr600() throws CFException  {              
   		return work.getAbendMsgTblErr600();
   }

  
	/**
	*  set variable abendMsgTblErr600
	*  @param value
	**/
   public void setAbendMsgTblErr600(char[] value) throws CFException {
      work.setAbendMsgTblErr600(value);
   } 

	/**
	 *	Test condition 3005 for isTblAbendCode88300()
	 *	@return  Returns true if isTblAbendCode88300() is 3005
	 */
   public boolean isTblAbendCode88300() throws CFException {
      return work.isTblAbendCode88300();
   }

	/**
	*  set values 3005
	*/
   	public void setTblAbendCode88300True()  throws CFException{  			
    	work.setTblAbendCode88300True();
   	}

        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys002CntlIchgRec.hashCode();
        str += abendMessage900.hashCode();
        str += work.hashCode();
        str += abendPara900.hashCode();
        str += ichgFeeRecords500.hashCode();
       return str.hashCode();
    }

    public LoadIchgFeeTableOutCtx clone() {
        LoadIchgFeeTableOutCtx cloneObj = new LoadIchgFeeTableOutCtx();
        cloneObj.sys002CntlIchgRec = new Sys002CntlIchgRec();
        cloneObj.sys002CntlIchgRec.set(sys002CntlIchgRec.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.ichgFeeRecords500 = new IchgFeeRecords500();
        cloneObj.ichgFeeRecords500.set(ichgFeeRecords500.getClonedField());
        return cloneObj;
    }

    }

    public LoadIchgFeeTableOutCtx getLoadIchgFeeTableOutCtx() {
            return new LoadIchgFeeTableOutCtx();
    }
     public class ProcessInputFileInCtx implements Cloneable {
     Sys001TjfIp370Rec sys001TjfIp370Rec = Ip088030Ctx.this.getSys001TjfIp370Rec();
     HoldVariables800 holdVariables800 = Ip088030Ctx.this.getHoldVariables800();
     Work work = Ip088030Ctx.this.getWork();
     IchgCalcVars800 ichgCalcVars800 = Ip088030Ctx.this.getIchgCalcVars800();
     Ip00164TableEntry ip00164TableEntry = Ip088030Ctx.this.getIp00164TableEntry();

	/**
	 *	Returns the value of sys001TjfIp370Rec
	 *	@return sys001TjfIp370Rec
	 */   
	 public Sys001TjfIp370Rec getSys001TjfIp370Rec() {
   	return sys001TjfIp370Rec;
   }


	/**
	 *	Returns the value of ip98151TjfMrchAddr
	 *	@return ip98151TjfMrchAddr
	 */
   public char[] getIp98151TjfMrchAddr() throws CFException  {              
   		return sys001TjfIp370Rec.getIp98151RecordPart1().getIp98151TjfMrchAddr();
   }

  
	/**
	*  set variable ip98151TjfMrchAddr
	*  @param value
	**/
   public void setIp98151TjfMrchAddr(char[] value) throws CFException {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfMrchAddr(value);
   } 

     /**
	 * 	Update Ip98151TjfMrchAddr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98151TjfMrchAddr(char[] source, int sourceIndex) throws CFException {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfMrchAddr(source, sourceIndex);
   	
   }
   
   public void setIp98151TjfMrchAddr(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfMrchAddr(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98151TjfMrchAddr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98151TjfMrchAddr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfMrchAddr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98151TjfMrchAddr with another Field
	 *	@param value
	 */
   public void setIp98151TjfMrchAddr(Field source) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfMrchAddr(source);
   }  
   
     /**
	 * 	Update Ip98151TjfMrchAddr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98151TjfMrchAddr(Field source, int sourceIndex,int sourceLen) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfMrchAddr(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip98151TjfMrchAddr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98151TjfMrchAddr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfMrchAddr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of holdVariables800
	 *	@return holdVariables800
	 */   
	 public HoldVariables800 getHoldVariables800() {
   	return holdVariables800;
   }


	/**
	 *	Returns the value of valueD300
	 *	@return valueD300
	 */
   public char[] getValueD300() throws CFException  {              
   		return work.getValueD300();
   }

  
	/**
	*  set variable valueD300
	*  @param value
	**/
   public void setValueD300(char[] value) throws CFException {
      work.setValueD300(value);
   } 


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public ProcessInputFileOutCtx getProcessInputFileOutCtx() {
            return new ProcessInputFileOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001TjfIp370Rec.hashCode();
        str += holdVariables800.hashCode();
        str += work.hashCode();
        str += ichgCalcVars800.hashCode();
        str += ip00164TableEntry.hashCode();
       return str.hashCode();
    }

    public ProcessInputFileInCtx clone() {
        ProcessInputFileInCtx cloneObj = new ProcessInputFileInCtx();
        cloneObj.sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        cloneObj.sys001TjfIp370Rec.set(sys001TjfIp370Rec.getClonedField());
        cloneObj.holdVariables800 = new HoldVariables800();
        cloneObj.holdVariables800.set(holdVariables800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ichgCalcVars800 = new IchgCalcVars800();
        cloneObj.ichgCalcVars800.set(ichgCalcVars800.getClonedField());
        cloneObj.ip00164TableEntry = new Ip00164TableEntry();
        cloneObj.ip00164TableEntry.set(ip00164TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInputFileInCtx getProcessInputFileInCtx() {
            return new ProcessInputFileInCtx();
    }
     public class ProcessInputFileOutCtx implements Cloneable {
     Sys001TjfIp370Rec sys001TjfIp370Rec = Ip088030Ctx.this.getSys001TjfIp370Rec();
     Work work = Ip088030Ctx.this.getWork();
     HoldVariables800 holdVariables800 = Ip088030Ctx.this.getHoldVariables800();
     IchgCalcVars800 ichgCalcVars800 = Ip088030Ctx.this.getIchgCalcVars800();
     Ip00164TableEntry ip00164TableEntry = Ip088030Ctx.this.getIp00164TableEntry();

	/**
	 *	Test condition "N" for isArRecNotFound88100()
	 *	@return  Returns true if isArRecNotFound88100() is "N"
	 */
   public boolean isArRecNotFound88100() throws CFException {
      return work.isArRecNotFound88100();
   }

	/**
	*  set values "N"
	*/
   	public void setArRecNotFound88100True()  throws CFException{  			
    	work.setArRecNotFound88100True();
   	}
	/**
	 *	Test condition "N" for isIchgCalculatedN88100()
	 *	@return  Returns true if isIchgCalculatedN88100() is "N"
	 */
   public boolean isIchgCalculatedN88100() throws CFException {
      return work.isIchgCalculatedN88100();
   }

	/**
	*  set values "N"
	*/
   	public void setIchgCalculatedN88100True()  throws CFException{  			
    	work.setIchgCalculatedN88100True();
   	}
	/**
	 *	Returns the value of maid800
	 *	@return maid800
	 */
   public char[] getMaid800() throws CFException  {              
   		return holdVariables800.getMaid800();
   }

  
	/**
	*  set variable maid800
	*  @param value
	**/
   public void setMaid800(char[] value) throws CFException {
      holdVariables800.setMaid800(value);
   } 

     /**
	 * 	Update Maid800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMaid800(char[] source, int sourceIndex) throws CFException {
      holdVariables800.setMaid800(source, sourceIndex);
   	
   }
   
   public void setMaid800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      holdVariables800.setMaid800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Maid800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMaid800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setMaid800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Maid800 with another Field
	 *	@param value
	 */
   public void setMaid800(Field source) {
      holdVariables800.setMaid800(source);
   }  
   
     /**
	 * 	Update Maid800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMaid800(Field source, int sourceIndex,int sourceLen) {
      holdVariables800.setMaid800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Maid800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMaid800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setMaid800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fundPan800
	 *	@return fundPan800
	 */
   public char[] getFundPan800() throws CFException  {              
   		return holdVariables800.getFundPan800();
   }

  
	/**
	*  set variable fundPan800
	*  @param value
	**/
   public void setFundPan800(char[] value) throws CFException {
      holdVariables800.setFundPan800(value);
   } 

     /**
	 * 	Update FundPan800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFundPan800(char[] source, int sourceIndex) throws CFException {
      holdVariables800.setFundPan800(source, sourceIndex);
   	
   }
   
   public void setFundPan800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      holdVariables800.setFundPan800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FundPan800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFundPan800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setFundPan800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FundPan800 with another Field
	 *	@param value
	 */
   public void setFundPan800(Field source) {
      holdVariables800.setFundPan800(source);
   }  
   
     /**
	 * 	Update FundPan800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFundPan800(Field source, int sourceIndex,int sourceLen) {
      holdVariables800.setFundPan800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FundPan800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFundPan800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setFundPan800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "N" for isTxnQualifyN88100()
	 *	@return  Returns true if isTxnQualifyN88100() is "N"
	 */
   public boolean isTxnQualifyN88100() throws CFException {
      return work.isTxnQualifyN88100();
   }

	/**
	*  set values "N"
	*/
   	public void setTxnQualifyN88100True()  throws CFException{  			
    	work.setTxnQualifyN88100True();
   	}
	/**
	 *	Returns the value of ip98151TjfMrchAddr
	 *	@return ip98151TjfMrchAddr
	 */
   public char[] getIp98151TjfMrchAddr() throws CFException  {              
   		return sys001TjfIp370Rec.getIp98151RecordPart1().getIp98151TjfMrchAddr();
   }

  
	/**
	*  set variable ip98151TjfMrchAddr
	*  @param value
	**/
   public void setIp98151TjfMrchAddr(char[] value) throws CFException {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfMrchAddr(value);
   } 

     /**
	 * 	Update Ip98151TjfMrchAddr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98151TjfMrchAddr(char[] source, int sourceIndex) throws CFException {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfMrchAddr(source, sourceIndex);
   	
   }
   
   public void setIp98151TjfMrchAddr(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfMrchAddr(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98151TjfMrchAddr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98151TjfMrchAddr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfMrchAddr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98151TjfMrchAddr with another Field
	 *	@param value
	 */
   public void setIp98151TjfMrchAddr(Field source) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfMrchAddr(source);
   }  
   
     /**
	 * 	Update Ip98151TjfMrchAddr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98151TjfMrchAddr(Field source, int sourceIndex,int sourceLen) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfMrchAddr(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip98151TjfMrchAddr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98151TjfMrchAddr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfMrchAddr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of holdVariables800
	 *	@return holdVariables800
	 */   
	 public HoldVariables800 getHoldVariables800() {
   	return holdVariables800;
   }


	/**
	 *	Returns the value of mccCodeX800
	 *	@return mccCodeX800
	 */
   public char[] getMccCodeX800() throws CFException  {              
   		return holdVariables800.getMccCodeX800();
   }

  
	/**
	*  set variable mccCodeX800
	*  @param value
	**/
   public void setMccCodeX800(char[] value) throws CFException {
      holdVariables800.setMccCodeX800(value);
   } 

     /**
	 * 	Update MccCodeX800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMccCodeX800(char[] source, int sourceIndex) throws CFException {
      holdVariables800.setMccCodeX800(source, sourceIndex);
   	
   }
   
   public void setMccCodeX800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      holdVariables800.setMccCodeX800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MccCodeX800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMccCodeX800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setMccCodeX800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MccCodeX800 with another Field
	 *	@param value
	 */
   public void setMccCodeX800(Field source) {
      holdVariables800.setMccCodeX800(source);
   }  
   
     /**
	 * 	Update MccCodeX800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMccCodeX800(Field source, int sourceIndex,int sourceLen) {
      holdVariables800.setMccCodeX800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MccCodeX800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMccCodeX800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setMccCodeX800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of valueD300
	 *	@return valueD300
	 */
   public char[] getValueD300() throws CFException  {              
   		return work.getValueD300();
   }

  
	/**
	*  set variable valueD300
	*  @param value
	**/
   public void setValueD300(char[] value) throws CFException {
      work.setValueD300(value);
   } 

	/**
	 *	Returns the value of mccCode800
	 *	@return mccCode800
	 */
   public char[] getMccCode800() throws CFException  {              
   		return holdVariables800.getMccCode800();
   }

  
	/**
	*  set variable mccCode800
	*  @param value
	**/
   public void setMccCode800(char[] value) throws CFException {
      holdVariables800.setMccCode800(value);
   } 

     /**
	 * 	Update MccCode800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMccCode800(char[] source, int sourceIndex) throws CFException {
      holdVariables800.setMccCode800(source, sourceIndex);
   	
   }
   
   public void setMccCode800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      holdVariables800.setMccCode800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MccCode800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMccCode800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setMccCode800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MccCode800 with another Field
	 *	@param value
	 */
   public void setMccCode800(Field source) {
      holdVariables800.setMccCode800(source);
   }  
   
     /**
	 * 	Update MccCode800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMccCode800(Field source, int sourceIndex,int sourceLen) {
      holdVariables800.setMccCode800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MccCode800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMccCode800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setMccCode800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip00164ProdCatCd
	 *	@return ip00164ProdCatCd
	 */
   public char[] getIp00164ProdCatCd() throws CFException  {              
   		return ip00164TableEntry.getIp00164TableData().getIp00164ProdCatCd();
   }

  
	/**
	*  set variable ip00164ProdCatCd
	*  @param value
	**/
   public void setIp00164ProdCatCd(char[] value) throws CFException {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(value);
   } 

     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00164ProdCatCd(char[] source, int sourceIndex) throws CFException {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex);
   	
   }
   
   public void setIp00164ProdCatCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00164ProdCatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00164ProdCatCd with another Field
	 *	@param value
	 */
   public void setIp00164ProdCatCd(Field source) {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source);
   }  
   
     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00164ProdCatCd(Field source, int sourceIndex,int sourceLen) {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00164ProdCatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ichgCalcVars800
	 *	@return ichgCalcVars800
	 */   
	 public IchgCalcVars800 getIchgCalcVars800() {
   	return ichgCalcVars800;
   }



        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001TjfIp370Rec.hashCode();
        str += work.hashCode();
        str += holdVariables800.hashCode();
        str += ichgCalcVars800.hashCode();
        str += ip00164TableEntry.hashCode();
       return str.hashCode();
    }

    public ProcessInputFileOutCtx clone() {
        ProcessInputFileOutCtx cloneObj = new ProcessInputFileOutCtx();
        cloneObj.sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        cloneObj.sys001TjfIp370Rec.set(sys001TjfIp370Rec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.holdVariables800 = new HoldVariables800();
        cloneObj.holdVariables800.set(holdVariables800.getClonedField());
        cloneObj.ichgCalcVars800 = new IchgCalcVars800();
        cloneObj.ichgCalcVars800.set(ichgCalcVars800.getClonedField());
        cloneObj.ip00164TableEntry = new Ip00164TableEntry();
        cloneObj.ip00164TableEntry.set(ip00164TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInputFileOutCtx getProcessInputFileOutCtx() {
            return new ProcessInputFileOutCtx();
    }
     public class WriteSys201InCtx implements Cloneable {
     Sys001TjfIp370Rec sys001TjfIp370Rec = Ip088030Ctx.this.getSys001TjfIp370Rec();
     HoldVariables800 holdVariables800 = Ip088030Ctx.this.getHoldVariables800();

	/**
	 *	Returns the value of fundProdId800
	 *	@return fundProdId800
	 */
   public char[] getFundProdId800() throws CFException  {              
   		return holdVariables800.getFundProdId800();
   }

  
	/**
	*  set variable fundProdId800
	*  @param value
	**/
   public void setFundProdId800(char[] value) throws CFException {
      holdVariables800.setFundProdId800(value);
   } 

     /**
	 * 	Update FundProdId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFundProdId800(char[] source, int sourceIndex) throws CFException {
      holdVariables800.setFundProdId800(source, sourceIndex);
   	
   }
   
   public void setFundProdId800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      holdVariables800.setFundProdId800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FundProdId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFundProdId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setFundProdId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FundProdId800 with another Field
	 *	@param value
	 */
   public void setFundProdId800(Field source) {
      holdVariables800.setFundProdId800(source);
   }  
   
     /**
	 * 	Update FundProdId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFundProdId800(Field source, int sourceIndex,int sourceLen) {
      holdVariables800.setFundProdId800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FundProdId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFundProdId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setFundProdId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fundPan800
	 *	@return fundPan800
	 */
   public char[] getFundPan800() throws CFException  {              
   		return holdVariables800.getFundPan800();
   }

  
	/**
	*  set variable fundPan800
	*  @param value
	**/
   public void setFundPan800(char[] value) throws CFException {
      holdVariables800.setFundPan800(value);
   } 

     /**
	 * 	Update FundPan800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFundPan800(char[] source, int sourceIndex) throws CFException {
      holdVariables800.setFundPan800(source, sourceIndex);
   	
   }
   
   public void setFundPan800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      holdVariables800.setFundPan800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FundPan800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFundPan800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setFundPan800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FundPan800 with another Field
	 *	@param value
	 */
   public void setFundPan800(Field source) {
      holdVariables800.setFundPan800(source);
   }  
   
     /**
	 * 	Update FundPan800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFundPan800(Field source, int sourceIndex,int sourceLen) {
      holdVariables800.setFundPan800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FundPan800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFundPan800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setFundPan800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of mccCodeX800
	 *	@return mccCodeX800
	 */
   public char[] getMccCodeX800() throws CFException  {              
   		return holdVariables800.getMccCodeX800();
   }

  
	/**
	*  set variable mccCodeX800
	*  @param value
	**/
   public void setMccCodeX800(char[] value) throws CFException {
      holdVariables800.setMccCodeX800(value);
   } 

     /**
	 * 	Update MccCodeX800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMccCodeX800(char[] source, int sourceIndex) throws CFException {
      holdVariables800.setMccCodeX800(source, sourceIndex);
   	
   }
   
   public void setMccCodeX800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      holdVariables800.setMccCodeX800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MccCodeX800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMccCodeX800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setMccCodeX800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MccCodeX800 with another Field
	 *	@param value
	 */
   public void setMccCodeX800(Field source) {
      holdVariables800.setMccCodeX800(source);
   }  
   
     /**
	 * 	Update MccCodeX800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMccCodeX800(Field source, int sourceIndex,int sourceLen) {
      holdVariables800.setMccCodeX800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MccCodeX800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMccCodeX800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setMccCodeX800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public WriteSys201OutCtx getWriteSys201OutCtx() {
            return new WriteSys201OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001TjfIp370Rec.hashCode();
        str += holdVariables800.hashCode();
       return str.hashCode();
    }

    public WriteSys201InCtx clone() {
        WriteSys201InCtx cloneObj = new WriteSys201InCtx();
        cloneObj.sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        cloneObj.sys001TjfIp370Rec.set(sys001TjfIp370Rec.getClonedField());
        cloneObj.holdVariables800 = new HoldVariables800();
        cloneObj.holdVariables800.set(holdVariables800.getClonedField());
        return cloneObj;
    }

    }

    public WriteSys201InCtx getWriteSys201InCtx() {
            return new WriteSys201InCtx();
    }
     public class WriteSys201OutCtx implements Cloneable {
     Sys001TjfIp370Rec sys001TjfIp370Rec = Ip088030Ctx.this.getSys001TjfIp370Rec();
     HoldVariables800 holdVariables800 = Ip088030Ctx.this.getHoldVariables800();

	/**
	 *	Returns the value of fundProdId800
	 *	@return fundProdId800
	 */
   public char[] getFundProdId800() throws CFException  {              
   		return holdVariables800.getFundProdId800();
   }

  
	/**
	*  set variable fundProdId800
	*  @param value
	**/
   public void setFundProdId800(char[] value) throws CFException {
      holdVariables800.setFundProdId800(value);
   } 

     /**
	 * 	Update FundProdId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFundProdId800(char[] source, int sourceIndex) throws CFException {
      holdVariables800.setFundProdId800(source, sourceIndex);
   	
   }
   
   public void setFundProdId800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      holdVariables800.setFundProdId800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FundProdId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFundProdId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setFundProdId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FundProdId800 with another Field
	 *	@param value
	 */
   public void setFundProdId800(Field source) {
      holdVariables800.setFundProdId800(source);
   }  
   
     /**
	 * 	Update FundProdId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFundProdId800(Field source, int sourceIndex,int sourceLen) {
      holdVariables800.setFundProdId800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FundProdId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFundProdId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setFundProdId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fundPan800
	 *	@return fundPan800
	 */
   public char[] getFundPan800() throws CFException  {              
   		return holdVariables800.getFundPan800();
   }

  
	/**
	*  set variable fundPan800
	*  @param value
	**/
   public void setFundPan800(char[] value) throws CFException {
      holdVariables800.setFundPan800(value);
   } 

     /**
	 * 	Update FundPan800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFundPan800(char[] source, int sourceIndex) throws CFException {
      holdVariables800.setFundPan800(source, sourceIndex);
   	
   }
   
   public void setFundPan800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      holdVariables800.setFundPan800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FundPan800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFundPan800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setFundPan800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FundPan800 with another Field
	 *	@param value
	 */
   public void setFundPan800(Field source) {
      holdVariables800.setFundPan800(source);
   }  
   
     /**
	 * 	Update FundPan800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFundPan800(Field source, int sourceIndex,int sourceLen) {
      holdVariables800.setFundPan800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FundPan800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFundPan800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setFundPan800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip98152FundProdId
	 *	@return ip98152FundProdId
	 */
   public char[] getIp98152FundProdId() throws CFException  {              
   		return sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152FundProdId();
   }

  
	/**
	*  set variable ip98152FundProdId
	*  @param value
	**/
   public void setIp98152FundProdId(char[] value) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152FundProdId(value);
   } 

     /**
	 * 	Update Ip98152FundProdId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98152FundProdId(char[] source, int sourceIndex) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152FundProdId(source, sourceIndex);
   	
   }
   
   public void setIp98152FundProdId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152FundProdId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98152FundProdId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98152FundProdId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152FundProdId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98152FundProdId with another Field
	 *	@param value
	 */
   public void setIp98152FundProdId(Field source) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152FundProdId(source);
   }  
   
     /**
	 * 	Update Ip98152FundProdId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98152FundProdId(Field source, int sourceIndex,int sourceLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152FundProdId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip98152FundProdId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98152FundProdId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152FundProdId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of mccCodeX800
	 *	@return mccCodeX800
	 */
   public char[] getMccCodeX800() throws CFException  {              
   		return holdVariables800.getMccCodeX800();
   }

  
	/**
	*  set variable mccCodeX800
	*  @param value
	**/
   public void setMccCodeX800(char[] value) throws CFException {
      holdVariables800.setMccCodeX800(value);
   } 

     /**
	 * 	Update MccCodeX800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMccCodeX800(char[] source, int sourceIndex) throws CFException {
      holdVariables800.setMccCodeX800(source, sourceIndex);
   	
   }
   
   public void setMccCodeX800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      holdVariables800.setMccCodeX800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MccCodeX800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMccCodeX800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setMccCodeX800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MccCodeX800 with another Field
	 *	@param value
	 */
   public void setMccCodeX800(Field source) {
      holdVariables800.setMccCodeX800(source);
   }  
   
     /**
	 * 	Update MccCodeX800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMccCodeX800(Field source, int sourceIndex,int sourceLen) {
      holdVariables800.setMccCodeX800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MccCodeX800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMccCodeX800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setMccCodeX800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip98152FundAcctNum
	 *	@return ip98152FundAcctNum
	 */
   public char[] getIp98152FundAcctNum() throws CFException  {              
   		return sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152FundAcctNum();
   }

  
	/**
	*  set variable ip98152FundAcctNum
	*  @param value
	**/
   public void setIp98152FundAcctNum(char[] value) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152FundAcctNum(value);
   } 

     /**
	 * 	Update Ip98152FundAcctNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98152FundAcctNum(char[] source, int sourceIndex) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152FundAcctNum(source, sourceIndex);
   	
   }
   
   public void setIp98152FundAcctNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152FundAcctNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98152FundAcctNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98152FundAcctNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152FundAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98152FundAcctNum with another Field
	 *	@param value
	 */
   public void setIp98152FundAcctNum(Field source) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152FundAcctNum(source);
   }  
   
     /**
	 * 	Update Ip98152FundAcctNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98152FundAcctNum(Field source, int sourceIndex,int sourceLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152FundAcctNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip98152FundAcctNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98152FundAcctNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152FundAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip98152ActualMcc
	 *	@return ip98152ActualMcc
	 */
   public char[] getIp98152ActualMcc() throws CFException  {              
   		return sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ActualMcc();
   }

  
	/**
	*  set variable ip98152ActualMcc
	*  @param value
	**/
   public void setIp98152ActualMcc(char[] value) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ActualMcc(value);
   } 

     /**
	 * 	Update Ip98152ActualMcc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98152ActualMcc(char[] source, int sourceIndex) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ActualMcc(source, sourceIndex);
   	
   }
   
   public void setIp98152ActualMcc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ActualMcc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98152ActualMcc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ActualMcc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ActualMcc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98152ActualMcc with another Field
	 *	@param value
	 */
   public void setIp98152ActualMcc(Field source) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ActualMcc(source);
   }  
   
     /**
	 * 	Update Ip98152ActualMcc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98152ActualMcc(Field source, int sourceIndex,int sourceLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ActualMcc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip98152ActualMcc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ActualMcc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ActualMcc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001TjfIp370Rec.hashCode();
        str += holdVariables800.hashCode();
       return str.hashCode();
    }

    public WriteSys201OutCtx clone() {
        WriteSys201OutCtx cloneObj = new WriteSys201OutCtx();
        cloneObj.sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        cloneObj.sys001TjfIp370Rec.set(sys001TjfIp370Rec.getClonedField());
        cloneObj.holdVariables800 = new HoldVariables800();
        cloneObj.holdVariables800.set(holdVariables800.getClonedField());
        return cloneObj;
    }

    }

    public WriteSys201OutCtx getWriteSys201OutCtx() {
            return new WriteSys201OutCtx();
    }
     public class DetermineFeeAcqInCtx implements Cloneable {
     Sys001TjfIp370Rec sys001TjfIp370Rec = Ip088030Ctx.this.getSys001TjfIp370Rec();
     Work work = Ip088030Ctx.this.getWork();
     Sys201OutputRecord sys201OutputRecord = Ip088030Ctx.this.getSys201OutputRecord();
     IchgCalcVars800 ichgCalcVars800 = Ip088030Ctx.this.getIchgCalcVars800();
     Ip33701CurrConvInterface ip33701CurrConvInterface = Ip088030Ctx.this.getIp33701CurrConvInterface();
     Ip00174TableEntry ip00174TableEntry = Ip088030Ctx.this.getIp00174TableEntry();

	/**
	 *	Returns the value of ip98152ClrMbrCurCd
	 *	@return ip98152ClrMbrCurCd
	 */
   public char[] getIp98152ClrMbrCurCd(int index) throws CFException  {              
   		return sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).getIp98152ClrMbrCurCd();
   }

  
	/**
	*  set variable ip98152ClrMbrCurCd
	*  @param value
	**/
   public void setIp98152ClrMbrCurCd(int index,char[] value) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurCd(value);
   } 

     /**
	 * 	Update Ip98152ClrMbrCurCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98152ClrMbrCurCd(int index,char[] source, int sourceIndex) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurCd(source, sourceIndex);
   	
   }
   
   public void setIp98152ClrMbrCurCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98152ClrMbrCurCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrMbrCurCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98152ClrMbrCurCd with another Field
	 *	@param value
	 */
   public void setIp98152ClrMbrCurCd(int index,Field source) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurCd(source);
   }  
   
     /**
	 * 	Update Ip98152ClrMbrCurCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98152ClrMbrCurCd(int index,Field source, int sourceIndex,int sourceLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip98152ClrMbrCurCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrMbrCurCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip33701TargetAmount
	 *	@return ip33701TargetAmount
	 */
	public long getIp33701TargetAmount() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmount();
	}

    /**
	 *	Returns the String value of ip33701TargetAmount
	 *	@return ip33701TargetAmount
	 */
	public char[]  getIp33701TargetAmountActualString() {
		return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmountActualString();
	}

	/**
	 *	Returns String value of ip33701TargetAmount
	 *	@return ip33701TargetAmount
	 */
	public char[]  getIp33701TargetAmountString() throws CFException {
	     return String.valueOf(ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701TargetAmountIsNumeric()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvOutput().ip33701TargetAmountIsNumeric();
	}

	/**
	 * 	Update Ip33701TargetAmount with the passed value
	 *	@param number
	 */
	public void setIp33701TargetAmount(long number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount(number);
	}
	

	
	/**
	 * 	Update Ip33701TargetAmount with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetAmount(char[] value)  throws CFException {
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount(value);
	}
	
	/**
	 * 	Update Ip33701TargetAmount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetAmountString(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount(value);
	}	

	/**
	 *	Returns the value of netAmt800
	 *	@return netAmt800
	 */
	public BigDecimal getNetAmt800() throws CFException {
   		return ichgCalcVars800.getNetAmt800();
	}


	 /**
     *	Returns String value of netAmt800
     *	@return netAmt800
     */
    public char[]  getNetAmt800String() throws CFException {
         return ichgCalcVars800.getNetAmt800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean netAmt800IsNumeric() {
        return ichgCalcVars800.netAmt800IsNumeric();
    }
	/**
	 * 	Update NetAmt800 with the passed number
	 *	@param number
	 */
	public void setNetAmt800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setNetAmt800(number);
   }

	/**
	 * 	Update NetAmt800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setNetAmt800(char[] value)  throws CFException{
		ichgCalcVars800.setNetAmt800(value);
	}   

	/**
	 *	Returns the value of ip98152ClrMbrCurExp
	 *	@return ip98152ClrMbrCurExp
	 */
   public char[] getIp98152ClrMbrCurExp(int index) throws CFException  {              
   		return sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).getIp98152ClrMbrCurExp();
   }

  
	/**
	*  set variable ip98152ClrMbrCurExp
	*  @param value
	**/
   public void setIp98152ClrMbrCurExp(int index,char[] value) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurExp(value);
   } 

     /**
	 * 	Update Ip98152ClrMbrCurExp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98152ClrMbrCurExp(int index,char[] source, int sourceIndex) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurExp(source, sourceIndex);
   	
   }
   
   public void setIp98152ClrMbrCurExp(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurExp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98152ClrMbrCurExp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrMbrCurExp(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98152ClrMbrCurExp with another Field
	 *	@param value
	 */
   public void setIp98152ClrMbrCurExp(int index,Field source) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurExp(source);
   }  
   
     /**
	 * 	Update Ip98152ClrMbrCurExp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98152ClrMbrCurExp(int index,Field source, int sourceIndex,int sourceLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurExp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip98152ClrMbrCurExp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrMbrCurExp(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setSys201CalcFIdx(int sys201CalcFIdx) { 
    Ip088030Ctx.this.sys201CalcFIdx = sys201CalcFIdx;
}

public int getSys201CalcFIdx() { 
    return Ip088030Ctx.this.sys201CalcFIdx;
}
	/**
	 *	Returns the value of ptrIp288010800
	 *	@return ptrIp288010800
	 */
   public char[] getPtrIp288010800() throws CFException  {              
   		return work.getPtrIp288010800();
   }

  
	/**
	*  set variable ptrIp288010800
	*  @param value
	**/
   public void setPtrIp288010800(char[] value) throws CFException {
      work.setPtrIp288010800(value);
   } 

	/**
	 *	Returns the value of ip98152ClrTxnCurrCd
	 *	@return ip98152ClrTxnCurrCd
	 */
   public char[] getIp98152ClrTxnCurrCd() throws CFException  {              
   		return sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrTxnCurrCd();
   }

  
	/**
	*  set variable ip98152ClrTxnCurrCd
	*  @param value
	**/
   public void setIp98152ClrTxnCurrCd(char[] value) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(value);
   } 

     /**
	 * 	Update Ip98152ClrTxnCurrCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(char[] source, int sourceIndex) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex);
   	
   }
   
   public void setIp98152ClrTxnCurrCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98152ClrTxnCurrCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98152ClrTxnCurrCd with another Field
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(Field source) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source);
   }  
   
     /**
	 * 	Update Ip98152ClrTxnCurrCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(Field source, int sourceIndex,int sourceLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip98152ClrTxnCurrCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip00174CurExpCode
	 *	@return ip00174CurExpCode
	 */
	public int getIp00174CurExpCode() throws CFException {
   		return ip00174TableEntry.getIp00174CurExpCode();
	}


	/**
	 *	Returns String value of ip00174CurExpCode
	 *	@return ip00174CurExpCode
	 */
	public char[]  getIp00174CurExpCodeString() throws CFException {
	     return String.valueOf(ip00174TableEntry.getIp00174CurExpCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00174CurExpCodeIsNumeric()  throws CFException{
	    return ip00174TableEntry.ip00174CurExpCodeIsNumeric();
	}

	/**
	 * 	Update Ip00174CurExpCode with the passed value
	 *	@param number
	 */
	public void setIp00174CurExpCode(int number)  throws CFException{
		ip00174TableEntry.setIp00174CurExpCode(number);
	}
	

	public void setIp00174CurExpCode(long number)  throws CFException{
	    ip00174TableEntry.setIp00174CurExpCode(number);
	}
	
	
	/**
	 * 	Update Ip00174CurExpCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00174CurExpCode(char[] value)  throws CFException {
		ip00174TableEntry.setIp00174CurExpCode(value);
	}
	
	/**
	 * 	Update Ip00174CurExpCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00174CurExpCodeString(char[] value)  throws CFException{
		ip00174TableEntry.setIp00174CurExpCode(value);
	}	

	/**
	 *	Returns the value of minus1300
	 *	@return minus1300
	 */
	public short getMinus1300() throws CFException {        
   		return work.getMinus1300();
	}
	
	/**
	 * 	Update Minus1300 with the passed value
	 *	@param number
	 */
	public void setMinus1300(short number)  throws CFException{
		work.setMinus1300(number);
	}

	public void setMinus1300(int number)  throws CFException{
		work.setMinus1300((short)number);
	}

	public void setMinus1300(long number)  throws CFException{
		work.setMinus1300((short)number);
	}




        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public DetermineFeeAcqOutCtx getDetermineFeeAcqOutCtx() {
            return new DetermineFeeAcqOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001TjfIp370Rec.hashCode();
        str += work.hashCode();
        str += sys201OutputRecord.hashCode();
        str += ichgCalcVars800.hashCode();
        str += ip33701CurrConvInterface.hashCode();
        str += ip00174TableEntry.hashCode();
       return str.hashCode();
    }

    public DetermineFeeAcqInCtx clone() {
        DetermineFeeAcqInCtx cloneObj = new DetermineFeeAcqInCtx();
        cloneObj.sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        cloneObj.sys001TjfIp370Rec.set(sys001TjfIp370Rec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys201OutputRecord = new Sys201OutputRecord();
        cloneObj.sys201OutputRecord.set(sys201OutputRecord.getClonedField());
        cloneObj.ichgCalcVars800 = new IchgCalcVars800();
        cloneObj.ichgCalcVars800.set(ichgCalcVars800.getClonedField());
        cloneObj.ip33701CurrConvInterface = new Ip33701CurrConvInterface();
        cloneObj.ip33701CurrConvInterface.set(ip33701CurrConvInterface.getClonedField());
        cloneObj.ip00174TableEntry = new Ip00174TableEntry();
        cloneObj.ip00174TableEntry.set(ip00174TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public DetermineFeeAcqInCtx getDetermineFeeAcqInCtx() {
            return new DetermineFeeAcqInCtx();
    }
     public class DetermineFeeAcqOutCtx implements Cloneable {
     Sys001TjfIp370Rec sys001TjfIp370Rec = Ip088030Ctx.this.getSys001TjfIp370Rec();
     Work work = Ip088030Ctx.this.getWork();
     Sys201OutputRecord sys201OutputRecord = Ip088030Ctx.this.getSys201OutputRecord();
     IchgCalcVars800 ichgCalcVars800 = Ip088030Ctx.this.getIchgCalcVars800();
     Ip33701CurrConvInterface ip33701CurrConvInterface = Ip088030Ctx.this.getIp33701CurrConvInterface();
     Ip00174TableEntry ip00174TableEntry = Ip088030Ctx.this.getIp00174TableEntry();

	/**
	 *	Returns the value of ip98152ClrMbrCurCd
	 *	@return ip98152ClrMbrCurCd
	 */
   public char[] getIp98152ClrMbrCurCd(int index) throws CFException  {              
   		return sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).getIp98152ClrMbrCurCd();
   }

  
	/**
	*  set variable ip98152ClrMbrCurCd
	*  @param value
	**/
   public void setIp98152ClrMbrCurCd(int index,char[] value) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurCd(value);
   } 

     /**
	 * 	Update Ip98152ClrMbrCurCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98152ClrMbrCurCd(int index,char[] source, int sourceIndex) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurCd(source, sourceIndex);
   	
   }
   
   public void setIp98152ClrMbrCurCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98152ClrMbrCurCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrMbrCurCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98152ClrMbrCurCd with another Field
	 *	@param value
	 */
   public void setIp98152ClrMbrCurCd(int index,Field source) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurCd(source);
   }  
   
     /**
	 * 	Update Ip98152ClrMbrCurCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98152ClrMbrCurCd(int index,Field source, int sourceIndex,int sourceLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip98152ClrMbrCurCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrMbrCurCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys201CalcFeeSetlAmt
	 *	@return sys201CalcFeeSetlAmt
	 */
	public long getSys201CalcFeeSetlAmt(int index) throws CFException {
   		return sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).getSys201CalcFeeSetlAmt();
	}

    /**
	 *	Returns the String value of sys201CalcFeeSetlAmt
	 *	@return sys201CalcFeeSetlAmt
	 */
	public char[]  getSys201CalcFeeSetlAmtActualString(int index) {
		return sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index - 1).getSys201CalcFeeSetlAmtActualString();
	}

	/**
	 *	Returns String value of sys201CalcFeeSetlAmt
	 *	@return sys201CalcFeeSetlAmt
	 */
	public char[]  getSys201CalcFeeSetlAmtString(int index) throws CFException {
	     return String.valueOf(sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).getSys201CalcFeeSetlAmtString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys201CalcFeeSetlAmtIsNumeric(int index)  throws CFException{
	    return sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index - 1).sys201CalcFeeSetlAmtIsNumeric();
	}

	/**
	 * 	Update Sys201CalcFeeSetlAmt with the passed value
	 *	@param number
	 */
	public void setSys201CalcFeeSetlAmt(int index,long number)  throws CFException{
		sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).setSys201CalcFeeSetlAmt(number);
	}
	

	
	/**
	 * 	Update Sys201CalcFeeSetlAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setSys201CalcFeeSetlAmt(int index,char[] value)  throws CFException {
		sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).setSys201CalcFeeSetlAmt(value);
	}
	
	/**
	 * 	Update Sys201CalcFeeSetlAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSys201CalcFeeSetlAmtString(int index,char[] value)  throws CFException{
		sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).setSys201CalcFeeSetlAmt(value);
	}	

	/**
	 *	Test condition "DR" for isSys20188FeeIndDr()
	 *	@return  Returns true if isSys20188FeeIndDr() is "DR"
	 */
   public boolean isSys20188FeeIndDr(int index) throws CFException {
      return sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).isSys20188FeeIndDr();
   }

	/**
	*  set values "DR"
	*/
   	public void setSys20188FeeIndDrTrue(int index)  throws CFException{  			
    	sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).setSys20188FeeIndDrTrue();
   	}
	/**
	 *	Returns the value of netAmt800
	 *	@return netAmt800
	 */
	public BigDecimal getNetAmt800() throws CFException {
   		return ichgCalcVars800.getNetAmt800();
	}


	 /**
     *	Returns String value of netAmt800
     *	@return netAmt800
     */
    public char[]  getNetAmt800String() throws CFException {
         return ichgCalcVars800.getNetAmt800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean netAmt800IsNumeric() {
        return ichgCalcVars800.netAmt800IsNumeric();
    }
	/**
	 * 	Update NetAmt800 with the passed number
	 *	@param number
	 */
	public void setNetAmt800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setNetAmt800(number);
   }

	/**
	 * 	Update NetAmt800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setNetAmt800(char[] value)  throws CFException{
		ichgCalcVars800.setNetAmt800(value);
	}   

	/**
	 *	Returns the value of ip98152ClrMbrCurExp
	 *	@return ip98152ClrMbrCurExp
	 */
   public char[] getIp98152ClrMbrCurExp(int index) throws CFException  {              
   		return sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).getIp98152ClrMbrCurExp();
   }

  
	/**
	*  set variable ip98152ClrMbrCurExp
	*  @param value
	**/
   public void setIp98152ClrMbrCurExp(int index,char[] value) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurExp(value);
   } 

     /**
	 * 	Update Ip98152ClrMbrCurExp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98152ClrMbrCurExp(int index,char[] source, int sourceIndex) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurExp(source, sourceIndex);
   	
   }
   
   public void setIp98152ClrMbrCurExp(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurExp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98152ClrMbrCurExp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrMbrCurExp(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98152ClrMbrCurExp with another Field
	 *	@param value
	 */
   public void setIp98152ClrMbrCurExp(int index,Field source) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurExp(source);
   }  
   
     /**
	 * 	Update Ip98152ClrMbrCurExp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98152ClrMbrCurExp(int index,Field source, int sourceIndex,int sourceLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurExp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip98152ClrMbrCurExp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrMbrCurExp(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip33701TargetCurCode
	 *	@return ip33701TargetCurCode
	 */
	public int getIp33701TargetCurCode() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701TargetCurCode();
	}


	/**
	 *	Returns String value of ip33701TargetCurCode
	 *	@return ip33701TargetCurCode
	 */
	public char[]  getIp33701TargetCurCodeString() throws CFException {
	     return String.valueOf(ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701TargetCurCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701TargetCurCodeIsNumeric()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvInput().ip33701TargetCurCodeIsNumeric();
	}

	/**
	 * 	Update Ip33701TargetCurCode with the passed value
	 *	@param number
	 */
	public void setIp33701TargetCurCode(int number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurCode(number);
	}
	

	public void setIp33701TargetCurCode(long number)  throws CFException{
	    ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurCode(number);
	}
	
	
	/**
	 * 	Update Ip33701TargetCurCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetCurCode(char[] value)  throws CFException {
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurCode(value);
	}
	
	/**
	 * 	Update Ip33701TargetCurCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetCurCodeString(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurCode(value);
	}	

	/**
	 *	Returns the value of ip00174CurrCdKey
	 *	@return ip00174CurrCdKey
	 */   
	 public Ip00174CurrCdKey getIp00174CurrCdKey() {
   	return ip00174TableEntry.getIp00174CurrCdKey();
   }

   /**
	* 	Update Ip00174CurrCdKey with the passed value
	*	@param value
	*/
   public void setIp00174CurrCdKey(char[] value) throws CFException {
      ip00174TableEntry.setIp00174CurrCdKey(value);
   }   

     /**
	 * 	Update Ip00174CurrCdKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00174CurrCdKey(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip00174TableEntry.setIp00174CurrCdKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00174CurrCdKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00174CurrCdKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip00174TableEntry.setIp00174CurrCdKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00174CurrCdKey with another Field
	 *	@param value
	 */
   public void setIp00174CurrCdKey(Field source) {
   	ip00174TableEntry.setIp00174CurrCdKey(source);
   }  
   
     /**
	 * 	Update Ip00174CurrCdKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00174CurrCdKey(Field source, int sourceIndex,int sourceLen) {
   	ip00174TableEntry.setIp00174CurrCdKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00174CurrCdKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00174CurrCdKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip00174TableEntry.setIp00174CurrCdKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "ACQ" for isSys20188PayPartyAcq()
	 *	@return  Returns true if isSys20188PayPartyAcq() is "ACQ"
	 */
   public boolean isSys20188PayPartyAcq(int index) throws CFException {
      return sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).isSys20188PayPartyAcq();
   }

	/**
	*  set values "ACQ"
	*/
   	public void setSys20188PayPartyAcqTrue(int index)  throws CFException{  			
    	sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).setSys20188PayPartyAcqTrue();
   	}
	/**
	 *	Returns the value of ip33701SourceAmount
	 *	@return ip33701SourceAmount
	 */
	public long getIp33701SourceAmount() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701SourceAmount();
	}

    /**
	 *	Returns the String value of ip33701SourceAmount
	 *	@return ip33701SourceAmount
	 */
	public char[]  getIp33701SourceAmountActualString() {
		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701SourceAmountActualString();
	}

	/**
	 *	Returns String value of ip33701SourceAmount
	 *	@return ip33701SourceAmount
	 */
	public char[]  getIp33701SourceAmountString() throws CFException {
	     return String.valueOf(ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701SourceAmountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701SourceAmountIsNumeric()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvInput().ip33701SourceAmountIsNumeric();
	}

	/**
	 * 	Update Ip33701SourceAmount with the passed value
	 *	@param number
	 */
	public void setIp33701SourceAmount(long number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceAmount(number);
	}
	

	
	/**
	 * 	Update Ip33701SourceAmount with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701SourceAmount(char[] value)  throws CFException {
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceAmount(value);
	}
	
	/**
	 * 	Update Ip33701SourceAmount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701SourceAmountString(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceAmount(value);
	}	

	/**
	 *	Returns the value of ip98152ClrTxnCurrCd
	 *	@return ip98152ClrTxnCurrCd
	 */
   public char[] getIp98152ClrTxnCurrCd() throws CFException  {              
   		return sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrTxnCurrCd();
   }

  
	/**
	*  set variable ip98152ClrTxnCurrCd
	*  @param value
	**/
   public void setIp98152ClrTxnCurrCd(char[] value) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(value);
   } 

     /**
	 * 	Update Ip98152ClrTxnCurrCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(char[] source, int sourceIndex) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex);
   	
   }
   
   public void setIp98152ClrTxnCurrCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98152ClrTxnCurrCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98152ClrTxnCurrCd with another Field
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(Field source) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source);
   }  
   
     /**
	 * 	Update Ip98152ClrTxnCurrCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(Field source, int sourceIndex,int sourceLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip98152ClrTxnCurrCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip33701SourceCurCode
	 *	@return ip33701SourceCurCode
	 */
	public int getIp33701SourceCurCode() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701SourceCurCode();
	}


	/**
	 *	Returns String value of ip33701SourceCurCode
	 *	@return ip33701SourceCurCode
	 */
	public char[]  getIp33701SourceCurCodeString() throws CFException {
	     return String.valueOf(ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701SourceCurCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701SourceCurCodeIsNumeric()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvInput().ip33701SourceCurCodeIsNumeric();
	}

	/**
	 * 	Update Ip33701SourceCurCode with the passed value
	 *	@param number
	 */
	public void setIp33701SourceCurCode(int number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurCode(number);
	}
	

	public void setIp33701SourceCurCode(long number)  throws CFException{
	    ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurCode(number);
	}
	
	
	/**
	 * 	Update Ip33701SourceCurCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701SourceCurCode(char[] value)  throws CFException {
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurCode(value);
	}
	
	/**
	 * 	Update Ip33701SourceCurCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701SourceCurCodeString(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurCode(value);
	}	

	/**
	 *	Returns the value of ip33701SrcAmt6Decimals
	 *	@return ip33701SrcAmt6Decimals
	 */
	public BigDecimal getIp33701SrcAmt6Decimals() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701SrcAmt6Decimals();
	}

    /**
	 *	Returns the String value of ip33701SrcAmt6Decimals
	 *	@return ip33701SrcAmt6Decimals
	 */
	public char[]  getIp33701SrcAmt6DecimalsActualString()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701SrcAmt6DecimalsActualString();
	}

	 /**
     *	Returns String value of ip33701SrcAmt6Decimals
     *	@return ip33701SrcAmt6Decimals
     */
    public char[]  getIp33701SrcAmt6DecimalsString() throws CFException {
         return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701SrcAmt6DecimalsString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean ip33701SrcAmt6DecimalsIsNumeric() {
        return ip33701CurrConvInterface.getIp33701CurrConvOutput().ip33701SrcAmt6DecimalsIsNumeric();
    }
	/**
	 * 	Update Ip33701SrcAmt6Decimals with the passed number
	 *	@param number
	 */
	public void setIp33701SrcAmt6Decimals(BigDecimal number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701SrcAmt6Decimals(number);
   }

	/**
	 * 	Update Ip33701SrcAmt6Decimals with the passed value
	 *	@param value (String or char[]);
	 */
	public void setIp33701SrcAmt6Decimals(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701SrcAmt6Decimals(value);
	}   

	/**
	 *	Returns the value of ip33701SourceCurExp
	 *	@return ip33701SourceCurExp
	 */
   public char[] getIp33701SourceCurExp() throws CFException  {              
   		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701SourceCurExp();
   }

  
	/**
	*  set variable ip33701SourceCurExp
	*  @param value
	**/
   public void setIp33701SourceCurExp(char[] value) throws CFException {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(value);
   } 

     /**
	 * 	Update Ip33701SourceCurExp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp33701SourceCurExp(char[] source, int sourceIndex) throws CFException {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source, sourceIndex);
   	
   }
   
   public void setIp33701SourceCurExp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip33701SourceCurExp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp33701SourceCurExp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip33701SourceCurExp with another Field
	 *	@param value
	 */
   public void setIp33701SourceCurExp(Field source) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source);
   }  
   
     /**
	 * 	Update Ip33701SourceCurExp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp33701SourceCurExp(Field source, int sourceIndex,int sourceLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip33701SourceCurExp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp33701SourceCurExp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setSys201CalcFIdx(int sys201CalcFIdx) { 
    Ip088030Ctx.this.sys201CalcFIdx = sys201CalcFIdx;
}

public int getSys201CalcFIdx() { 
    return Ip088030Ctx.this.sys201CalcFIdx;
}
	/**
	 *	Returns the value of sys201CalcFeeSetlCur
	 *	@return sys201CalcFeeSetlCur
	 */
	public int getSys201CalcFeeSetlCur(int index) throws CFException {
   		return sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).getSys201CalcFeeSetlCur();
	}


	/**
	 *	Returns String value of sys201CalcFeeSetlCur
	 *	@return sys201CalcFeeSetlCur
	 */
	public char[]  getSys201CalcFeeSetlCurString(int index) throws CFException {
	     return String.valueOf(sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).getSys201CalcFeeSetlCurString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys201CalcFeeSetlCurIsNumeric(int index)  throws CFException{
	    return sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index - 1).sys201CalcFeeSetlCurIsNumeric();
	}

	/**
	 * 	Update Sys201CalcFeeSetlCur with the passed value
	 *	@param number
	 */
	public void setSys201CalcFeeSetlCur(int index,int number)  throws CFException{
		sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).setSys201CalcFeeSetlCur(number);
	}
	

	public void setSys201CalcFeeSetlCur(int index,long number)  throws CFException{
	    sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).setSys201CalcFeeSetlCur(number);
	}
	
	
	/**
	 * 	Update Sys201CalcFeeSetlCur with the passed value
	 *	@param value (String or char[])
	 */
	public void setSys201CalcFeeSetlCur(int index,char[] value)  throws CFException {
		sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).setSys201CalcFeeSetlCur(value);
	}
	
	/**
	 * 	Update Sys201CalcFeeSetlCur with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSys201CalcFeeSetlCurString(int index,char[] value)  throws CFException{
		sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).setSys201CalcFeeSetlCur(value);
	}	

	/**
	 *	Returns the value of ip00174CurExpCode
	 *	@return ip00174CurExpCode
	 */
	public int getIp00174CurExpCode() throws CFException {
   		return ip00174TableEntry.getIp00174CurExpCode();
	}


	/**
	 *	Returns String value of ip00174CurExpCode
	 *	@return ip00174CurExpCode
	 */
	public char[]  getIp00174CurExpCodeString() throws CFException {
	     return String.valueOf(ip00174TableEntry.getIp00174CurExpCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00174CurExpCodeIsNumeric()  throws CFException{
	    return ip00174TableEntry.ip00174CurExpCodeIsNumeric();
	}

	/**
	 * 	Update Ip00174CurExpCode with the passed value
	 *	@param number
	 */
	public void setIp00174CurExpCode(int number)  throws CFException{
		ip00174TableEntry.setIp00174CurExpCode(number);
	}
	

	public void setIp00174CurExpCode(long number)  throws CFException{
	    ip00174TableEntry.setIp00174CurExpCode(number);
	}
	
	
	/**
	 * 	Update Ip00174CurExpCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00174CurExpCode(char[] value)  throws CFException {
		ip00174TableEntry.setIp00174CurExpCode(value);
	}
	
	/**
	 * 	Update Ip00174CurExpCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00174CurExpCodeString(char[] value)  throws CFException{
		ip00174TableEntry.setIp00174CurExpCode(value);
	}	

	/**
	 *	Returns the value of ip33701TargetCurExp
	 *	@return ip33701TargetCurExp
	 */
   public char[] getIp33701TargetCurExp() throws CFException  {              
   		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701TargetCurExp();
   }

  
	/**
	*  set variable ip33701TargetCurExp
	*  @param value
	**/
   public void setIp33701TargetCurExp(char[] value) throws CFException {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(value);
   } 

     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp33701TargetCurExp(char[] source, int sourceIndex) throws CFException {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex);
   	
   }
   
   public void setIp33701TargetCurExp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp33701TargetCurExp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip33701TargetCurExp with another Field
	 *	@param value
	 */
   public void setIp33701TargetCurExp(Field source) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source);
   }  
   
     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp33701TargetCurExp(Field source, int sourceIndex,int sourceLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp33701TargetCurExp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001TjfIp370Rec.hashCode();
        str += work.hashCode();
        str += sys201OutputRecord.hashCode();
        str += ichgCalcVars800.hashCode();
        str += ip33701CurrConvInterface.hashCode();
        str += ip00174TableEntry.hashCode();
       return str.hashCode();
    }

    public DetermineFeeAcqOutCtx clone() {
        DetermineFeeAcqOutCtx cloneObj = new DetermineFeeAcqOutCtx();
        cloneObj.sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        cloneObj.sys001TjfIp370Rec.set(sys001TjfIp370Rec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys201OutputRecord = new Sys201OutputRecord();
        cloneObj.sys201OutputRecord.set(sys201OutputRecord.getClonedField());
        cloneObj.ichgCalcVars800 = new IchgCalcVars800();
        cloneObj.ichgCalcVars800.set(ichgCalcVars800.getClonedField());
        cloneObj.ip33701CurrConvInterface = new Ip33701CurrConvInterface();
        cloneObj.ip33701CurrConvInterface.set(ip33701CurrConvInterface.getClonedField());
        cloneObj.ip00174TableEntry = new Ip00174TableEntry();
        cloneObj.ip00174TableEntry.set(ip00174TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public DetermineFeeAcqOutCtx getDetermineFeeAcqOutCtx() {
            return new DetermineFeeAcqOutCtx();
    }
     public class DetermineFeeIssInCtx implements Cloneable {
     Sys001TjfIp370Rec sys001TjfIp370Rec = Ip088030Ctx.this.getSys001TjfIp370Rec();
     Work work = Ip088030Ctx.this.getWork();
     Sys201OutputRecord sys201OutputRecord = Ip088030Ctx.this.getSys201OutputRecord();
     IchgCalcVars800 ichgCalcVars800 = Ip088030Ctx.this.getIchgCalcVars800();
     Ip33701CurrConvInterface ip33701CurrConvInterface = Ip088030Ctx.this.getIp33701CurrConvInterface();
     Ip00174TableEntry ip00174TableEntry = Ip088030Ctx.this.getIp00174TableEntry();

	/**
	 *	Returns the value of ip98152ClrMbrCurCd
	 *	@return ip98152ClrMbrCurCd
	 */
   public char[] getIp98152ClrMbrCurCd(int index) throws CFException  {              
   		return sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).getIp98152ClrMbrCurCd();
   }

  
	/**
	*  set variable ip98152ClrMbrCurCd
	*  @param value
	**/
   public void setIp98152ClrMbrCurCd(int index,char[] value) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurCd(value);
   } 

     /**
	 * 	Update Ip98152ClrMbrCurCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98152ClrMbrCurCd(int index,char[] source, int sourceIndex) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurCd(source, sourceIndex);
   	
   }
   
   public void setIp98152ClrMbrCurCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98152ClrMbrCurCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrMbrCurCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98152ClrMbrCurCd with another Field
	 *	@param value
	 */
   public void setIp98152ClrMbrCurCd(int index,Field source) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurCd(source);
   }  
   
     /**
	 * 	Update Ip98152ClrMbrCurCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98152ClrMbrCurCd(int index,Field source, int sourceIndex,int sourceLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip98152ClrMbrCurCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrMbrCurCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip33701TargetAmount
	 *	@return ip33701TargetAmount
	 */
	public long getIp33701TargetAmount() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmount();
	}

    /**
	 *	Returns the String value of ip33701TargetAmount
	 *	@return ip33701TargetAmount
	 */
	public char[]  getIp33701TargetAmountActualString() {
		return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmountActualString();
	}

	/**
	 *	Returns String value of ip33701TargetAmount
	 *	@return ip33701TargetAmount
	 */
	public char[]  getIp33701TargetAmountString() throws CFException {
	     return String.valueOf(ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701TargetAmountIsNumeric()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvOutput().ip33701TargetAmountIsNumeric();
	}

	/**
	 * 	Update Ip33701TargetAmount with the passed value
	 *	@param number
	 */
	public void setIp33701TargetAmount(long number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount(number);
	}
	

	
	/**
	 * 	Update Ip33701TargetAmount with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetAmount(char[] value)  throws CFException {
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount(value);
	}
	
	/**
	 * 	Update Ip33701TargetAmount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetAmountString(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount(value);
	}	

	/**
	 *	Returns the value of netAmt800
	 *	@return netAmt800
	 */
	public BigDecimal getNetAmt800() throws CFException {
   		return ichgCalcVars800.getNetAmt800();
	}


	 /**
     *	Returns String value of netAmt800
     *	@return netAmt800
     */
    public char[]  getNetAmt800String() throws CFException {
         return ichgCalcVars800.getNetAmt800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean netAmt800IsNumeric() {
        return ichgCalcVars800.netAmt800IsNumeric();
    }
	/**
	 * 	Update NetAmt800 with the passed number
	 *	@param number
	 */
	public void setNetAmt800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setNetAmt800(number);
   }

	/**
	 * 	Update NetAmt800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setNetAmt800(char[] value)  throws CFException{
		ichgCalcVars800.setNetAmt800(value);
	}   

	/**
	 *	Returns the value of ip98152ClrMbrCurExp
	 *	@return ip98152ClrMbrCurExp
	 */
   public char[] getIp98152ClrMbrCurExp(int index) throws CFException  {              
   		return sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).getIp98152ClrMbrCurExp();
   }

  
	/**
	*  set variable ip98152ClrMbrCurExp
	*  @param value
	**/
   public void setIp98152ClrMbrCurExp(int index,char[] value) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurExp(value);
   } 

     /**
	 * 	Update Ip98152ClrMbrCurExp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98152ClrMbrCurExp(int index,char[] source, int sourceIndex) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurExp(source, sourceIndex);
   	
   }
   
   public void setIp98152ClrMbrCurExp(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurExp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98152ClrMbrCurExp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrMbrCurExp(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98152ClrMbrCurExp with another Field
	 *	@param value
	 */
   public void setIp98152ClrMbrCurExp(int index,Field source) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurExp(source);
   }  
   
     /**
	 * 	Update Ip98152ClrMbrCurExp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98152ClrMbrCurExp(int index,Field source, int sourceIndex,int sourceLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurExp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip98152ClrMbrCurExp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrMbrCurExp(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setSys201CalcFIdx(int sys201CalcFIdx) { 
    Ip088030Ctx.this.sys201CalcFIdx = sys201CalcFIdx;
}

public int getSys201CalcFIdx() { 
    return Ip088030Ctx.this.sys201CalcFIdx;
}
	/**
	 *	Returns the value of ptrIp288010800
	 *	@return ptrIp288010800
	 */
   public char[] getPtrIp288010800() throws CFException  {              
   		return work.getPtrIp288010800();
   }

  
	/**
	*  set variable ptrIp288010800
	*  @param value
	**/
   public void setPtrIp288010800(char[] value) throws CFException {
      work.setPtrIp288010800(value);
   } 

	/**
	 *	Returns the value of ip98152ClrTxnCurrCd
	 *	@return ip98152ClrTxnCurrCd
	 */
   public char[] getIp98152ClrTxnCurrCd() throws CFException  {              
   		return sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrTxnCurrCd();
   }

  
	/**
	*  set variable ip98152ClrTxnCurrCd
	*  @param value
	**/
   public void setIp98152ClrTxnCurrCd(char[] value) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(value);
   } 

     /**
	 * 	Update Ip98152ClrTxnCurrCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(char[] source, int sourceIndex) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex);
   	
   }
   
   public void setIp98152ClrTxnCurrCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98152ClrTxnCurrCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98152ClrTxnCurrCd with another Field
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(Field source) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source);
   }  
   
     /**
	 * 	Update Ip98152ClrTxnCurrCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(Field source, int sourceIndex,int sourceLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip98152ClrTxnCurrCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of val1300
	 *	@return val1300
	 */
	public short getVal1300() throws CFException {        
   		return work.getVal1300();
	}
	
	/**
	 * 	Update Val1300 with the passed value
	 *	@param number
	 */
	public void setVal1300(short number)  throws CFException{
		work.setVal1300(number);
	}

	public void setVal1300(int number)  throws CFException{
		work.setVal1300((short)number);
	}

	public void setVal1300(long number)  throws CFException{
		work.setVal1300((short)number);
	}



	/**
	 *	Returns the value of ip00174CurExpCode
	 *	@return ip00174CurExpCode
	 */
	public int getIp00174CurExpCode() throws CFException {
   		return ip00174TableEntry.getIp00174CurExpCode();
	}


	/**
	 *	Returns String value of ip00174CurExpCode
	 *	@return ip00174CurExpCode
	 */
	public char[]  getIp00174CurExpCodeString() throws CFException {
	     return String.valueOf(ip00174TableEntry.getIp00174CurExpCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00174CurExpCodeIsNumeric()  throws CFException{
	    return ip00174TableEntry.ip00174CurExpCodeIsNumeric();
	}

	/**
	 * 	Update Ip00174CurExpCode with the passed value
	 *	@param number
	 */
	public void setIp00174CurExpCode(int number)  throws CFException{
		ip00174TableEntry.setIp00174CurExpCode(number);
	}
	

	public void setIp00174CurExpCode(long number)  throws CFException{
	    ip00174TableEntry.setIp00174CurExpCode(number);
	}
	
	
	/**
	 * 	Update Ip00174CurExpCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00174CurExpCode(char[] value)  throws CFException {
		ip00174TableEntry.setIp00174CurExpCode(value);
	}
	
	/**
	 * 	Update Ip00174CurExpCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00174CurExpCodeString(char[] value)  throws CFException{
		ip00174TableEntry.setIp00174CurExpCode(value);
	}	


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public DetermineFeeIssOutCtx getDetermineFeeIssOutCtx() {
            return new DetermineFeeIssOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001TjfIp370Rec.hashCode();
        str += work.hashCode();
        str += sys201OutputRecord.hashCode();
        str += ichgCalcVars800.hashCode();
        str += ip33701CurrConvInterface.hashCode();
        str += ip00174TableEntry.hashCode();
       return str.hashCode();
    }

    public DetermineFeeIssInCtx clone() {
        DetermineFeeIssInCtx cloneObj = new DetermineFeeIssInCtx();
        cloneObj.sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        cloneObj.sys001TjfIp370Rec.set(sys001TjfIp370Rec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys201OutputRecord = new Sys201OutputRecord();
        cloneObj.sys201OutputRecord.set(sys201OutputRecord.getClonedField());
        cloneObj.ichgCalcVars800 = new IchgCalcVars800();
        cloneObj.ichgCalcVars800.set(ichgCalcVars800.getClonedField());
        cloneObj.ip33701CurrConvInterface = new Ip33701CurrConvInterface();
        cloneObj.ip33701CurrConvInterface.set(ip33701CurrConvInterface.getClonedField());
        cloneObj.ip00174TableEntry = new Ip00174TableEntry();
        cloneObj.ip00174TableEntry.set(ip00174TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public DetermineFeeIssInCtx getDetermineFeeIssInCtx() {
            return new DetermineFeeIssInCtx();
    }
     public class DetermineFeeIssOutCtx implements Cloneable {
     Sys001TjfIp370Rec sys001TjfIp370Rec = Ip088030Ctx.this.getSys001TjfIp370Rec();
     Work work = Ip088030Ctx.this.getWork();
     Sys201OutputRecord sys201OutputRecord = Ip088030Ctx.this.getSys201OutputRecord();
     IchgCalcVars800 ichgCalcVars800 = Ip088030Ctx.this.getIchgCalcVars800();
     Ip33701CurrConvInterface ip33701CurrConvInterface = Ip088030Ctx.this.getIp33701CurrConvInterface();
     Ip00174TableEntry ip00174TableEntry = Ip088030Ctx.this.getIp00174TableEntry();

	/**
	 *	Returns the value of ip98152ClrMbrCurCd
	 *	@return ip98152ClrMbrCurCd
	 */
   public char[] getIp98152ClrMbrCurCd(int index) throws CFException  {              
   		return sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).getIp98152ClrMbrCurCd();
   }

  
	/**
	*  set variable ip98152ClrMbrCurCd
	*  @param value
	**/
   public void setIp98152ClrMbrCurCd(int index,char[] value) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurCd(value);
   } 

     /**
	 * 	Update Ip98152ClrMbrCurCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98152ClrMbrCurCd(int index,char[] source, int sourceIndex) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurCd(source, sourceIndex);
   	
   }
   
   public void setIp98152ClrMbrCurCd(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98152ClrMbrCurCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrMbrCurCd(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98152ClrMbrCurCd with another Field
	 *	@param value
	 */
   public void setIp98152ClrMbrCurCd(int index,Field source) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurCd(source);
   }  
   
     /**
	 * 	Update Ip98152ClrMbrCurCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98152ClrMbrCurCd(int index,Field source, int sourceIndex,int sourceLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip98152ClrMbrCurCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrMbrCurCd(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys201CalcFeeSetlAmt
	 *	@return sys201CalcFeeSetlAmt
	 */
	public long getSys201CalcFeeSetlAmt(int index) throws CFException {
   		return sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).getSys201CalcFeeSetlAmt();
	}

    /**
	 *	Returns the String value of sys201CalcFeeSetlAmt
	 *	@return sys201CalcFeeSetlAmt
	 */
	public char[]  getSys201CalcFeeSetlAmtActualString(int index) {
		return sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index - 1).getSys201CalcFeeSetlAmtActualString();
	}

	/**
	 *	Returns String value of sys201CalcFeeSetlAmt
	 *	@return sys201CalcFeeSetlAmt
	 */
	public char[]  getSys201CalcFeeSetlAmtString(int index) throws CFException {
	     return String.valueOf(sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).getSys201CalcFeeSetlAmtString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys201CalcFeeSetlAmtIsNumeric(int index)  throws CFException{
	    return sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index - 1).sys201CalcFeeSetlAmtIsNumeric();
	}

	/**
	 * 	Update Sys201CalcFeeSetlAmt with the passed value
	 *	@param number
	 */
	public void setSys201CalcFeeSetlAmt(int index,long number)  throws CFException{
		sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).setSys201CalcFeeSetlAmt(number);
	}
	

	
	/**
	 * 	Update Sys201CalcFeeSetlAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setSys201CalcFeeSetlAmt(int index,char[] value)  throws CFException {
		sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).setSys201CalcFeeSetlAmt(value);
	}
	
	/**
	 * 	Update Sys201CalcFeeSetlAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSys201CalcFeeSetlAmtString(int index,char[] value)  throws CFException{
		sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).setSys201CalcFeeSetlAmt(value);
	}	

	/**
	 *	Returns the value of netAmt800
	 *	@return netAmt800
	 */
	public BigDecimal getNetAmt800() throws CFException {
   		return ichgCalcVars800.getNetAmt800();
	}


	 /**
     *	Returns String value of netAmt800
     *	@return netAmt800
     */
    public char[]  getNetAmt800String() throws CFException {
         return ichgCalcVars800.getNetAmt800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean netAmt800IsNumeric() {
        return ichgCalcVars800.netAmt800IsNumeric();
    }
	/**
	 * 	Update NetAmt800 with the passed number
	 *	@param number
	 */
	public void setNetAmt800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setNetAmt800(number);
   }

	/**
	 * 	Update NetAmt800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setNetAmt800(char[] value)  throws CFException{
		ichgCalcVars800.setNetAmt800(value);
	}   

	/**
	 *	Returns the value of ip98152ClrMbrCurExp
	 *	@return ip98152ClrMbrCurExp
	 */
   public char[] getIp98152ClrMbrCurExp(int index) throws CFException  {              
   		return sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).getIp98152ClrMbrCurExp();
   }

  
	/**
	*  set variable ip98152ClrMbrCurExp
	*  @param value
	**/
   public void setIp98152ClrMbrCurExp(int index,char[] value) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurExp(value);
   } 

     /**
	 * 	Update Ip98152ClrMbrCurExp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98152ClrMbrCurExp(int index,char[] source, int sourceIndex) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurExp(source, sourceIndex);
   	
   }
   
   public void setIp98152ClrMbrCurExp(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurExp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98152ClrMbrCurExp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrMbrCurExp(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98152ClrMbrCurExp with another Field
	 *	@param value
	 */
   public void setIp98152ClrMbrCurExp(int index,Field source) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurExp(source);
   }  
   
     /**
	 * 	Update Ip98152ClrMbrCurExp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98152ClrMbrCurExp(int index,Field source, int sourceIndex,int sourceLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurExp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip98152ClrMbrCurExp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrMbrCurExp(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrSetlInfo(index).setIp98152ClrMbrCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip33701TargetCurCode
	 *	@return ip33701TargetCurCode
	 */
	public int getIp33701TargetCurCode() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701TargetCurCode();
	}


	/**
	 *	Returns String value of ip33701TargetCurCode
	 *	@return ip33701TargetCurCode
	 */
	public char[]  getIp33701TargetCurCodeString() throws CFException {
	     return String.valueOf(ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701TargetCurCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701TargetCurCodeIsNumeric()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvInput().ip33701TargetCurCodeIsNumeric();
	}

	/**
	 * 	Update Ip33701TargetCurCode with the passed value
	 *	@param number
	 */
	public void setIp33701TargetCurCode(int number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurCode(number);
	}
	

	public void setIp33701TargetCurCode(long number)  throws CFException{
	    ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurCode(number);
	}
	
	
	/**
	 * 	Update Ip33701TargetCurCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetCurCode(char[] value)  throws CFException {
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurCode(value);
	}
	
	/**
	 * 	Update Ip33701TargetCurCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetCurCodeString(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurCode(value);
	}	

	/**
	 *	Returns the value of ip00174CurrCdKey
	 *	@return ip00174CurrCdKey
	 */   
	 public Ip00174CurrCdKey getIp00174CurrCdKey() {
   	return ip00174TableEntry.getIp00174CurrCdKey();
   }

   /**
	* 	Update Ip00174CurrCdKey with the passed value
	*	@param value
	*/
   public void setIp00174CurrCdKey(char[] value) throws CFException {
      ip00174TableEntry.setIp00174CurrCdKey(value);
   }   

     /**
	 * 	Update Ip00174CurrCdKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00174CurrCdKey(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip00174TableEntry.setIp00174CurrCdKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00174CurrCdKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00174CurrCdKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip00174TableEntry.setIp00174CurrCdKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00174CurrCdKey with another Field
	 *	@param value
	 */
   public void setIp00174CurrCdKey(Field source) {
   	ip00174TableEntry.setIp00174CurrCdKey(source);
   }  
   
     /**
	 * 	Update Ip00174CurrCdKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00174CurrCdKey(Field source, int sourceIndex,int sourceLen) {
   	ip00174TableEntry.setIp00174CurrCdKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00174CurrCdKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00174CurrCdKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip00174TableEntry.setIp00174CurrCdKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "ISS" for isSys20188PayPartyIss()
	 *	@return  Returns true if isSys20188PayPartyIss() is "ISS"
	 */
   public boolean isSys20188PayPartyIss(int index) throws CFException {
      return sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).isSys20188PayPartyIss();
   }

	/**
	*  set values "ISS"
	*/
   	public void setSys20188PayPartyIssTrue(int index)  throws CFException{  			
    	sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).setSys20188PayPartyIssTrue();
   	}
	/**
	 *	Returns the value of ip33701SourceAmount
	 *	@return ip33701SourceAmount
	 */
	public long getIp33701SourceAmount() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701SourceAmount();
	}

    /**
	 *	Returns the String value of ip33701SourceAmount
	 *	@return ip33701SourceAmount
	 */
	public char[]  getIp33701SourceAmountActualString() {
		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701SourceAmountActualString();
	}

	/**
	 *	Returns String value of ip33701SourceAmount
	 *	@return ip33701SourceAmount
	 */
	public char[]  getIp33701SourceAmountString() throws CFException {
	     return String.valueOf(ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701SourceAmountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701SourceAmountIsNumeric()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvInput().ip33701SourceAmountIsNumeric();
	}

	/**
	 * 	Update Ip33701SourceAmount with the passed value
	 *	@param number
	 */
	public void setIp33701SourceAmount(long number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceAmount(number);
	}
	

	
	/**
	 * 	Update Ip33701SourceAmount with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701SourceAmount(char[] value)  throws CFException {
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceAmount(value);
	}
	
	/**
	 * 	Update Ip33701SourceAmount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701SourceAmountString(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceAmount(value);
	}	

	/**
	 *	Returns the value of ip98152ClrTxnCurrCd
	 *	@return ip98152ClrTxnCurrCd
	 */
   public char[] getIp98152ClrTxnCurrCd() throws CFException  {              
   		return sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrTxnCurrCd();
   }

  
	/**
	*  set variable ip98152ClrTxnCurrCd
	*  @param value
	**/
   public void setIp98152ClrTxnCurrCd(char[] value) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(value);
   } 

     /**
	 * 	Update Ip98152ClrTxnCurrCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(char[] source, int sourceIndex) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex);
   	
   }
   
   public void setIp98152ClrTxnCurrCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98152ClrTxnCurrCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98152ClrTxnCurrCd with another Field
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(Field source) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source);
   }  
   
     /**
	 * 	Update Ip98152ClrTxnCurrCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(Field source, int sourceIndex,int sourceLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip98152ClrTxnCurrCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip33701SourceCurCode
	 *	@return ip33701SourceCurCode
	 */
	public int getIp33701SourceCurCode() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701SourceCurCode();
	}


	/**
	 *	Returns String value of ip33701SourceCurCode
	 *	@return ip33701SourceCurCode
	 */
	public char[]  getIp33701SourceCurCodeString() throws CFException {
	     return String.valueOf(ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701SourceCurCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701SourceCurCodeIsNumeric()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvInput().ip33701SourceCurCodeIsNumeric();
	}

	/**
	 * 	Update Ip33701SourceCurCode with the passed value
	 *	@param number
	 */
	public void setIp33701SourceCurCode(int number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurCode(number);
	}
	

	public void setIp33701SourceCurCode(long number)  throws CFException{
	    ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurCode(number);
	}
	
	
	/**
	 * 	Update Ip33701SourceCurCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701SourceCurCode(char[] value)  throws CFException {
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurCode(value);
	}
	
	/**
	 * 	Update Ip33701SourceCurCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701SourceCurCodeString(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurCode(value);
	}	

	/**
	 *	Returns the value of ip33701SrcAmt6Decimals
	 *	@return ip33701SrcAmt6Decimals
	 */
	public BigDecimal getIp33701SrcAmt6Decimals() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701SrcAmt6Decimals();
	}

    /**
	 *	Returns the String value of ip33701SrcAmt6Decimals
	 *	@return ip33701SrcAmt6Decimals
	 */
	public char[]  getIp33701SrcAmt6DecimalsActualString()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701SrcAmt6DecimalsActualString();
	}

	 /**
     *	Returns String value of ip33701SrcAmt6Decimals
     *	@return ip33701SrcAmt6Decimals
     */
    public char[]  getIp33701SrcAmt6DecimalsString() throws CFException {
         return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701SrcAmt6DecimalsString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean ip33701SrcAmt6DecimalsIsNumeric() {
        return ip33701CurrConvInterface.getIp33701CurrConvOutput().ip33701SrcAmt6DecimalsIsNumeric();
    }
	/**
	 * 	Update Ip33701SrcAmt6Decimals with the passed number
	 *	@param number
	 */
	public void setIp33701SrcAmt6Decimals(BigDecimal number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701SrcAmt6Decimals(number);
   }

	/**
	 * 	Update Ip33701SrcAmt6Decimals with the passed value
	 *	@param value (String or char[]);
	 */
	public void setIp33701SrcAmt6Decimals(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701SrcAmt6Decimals(value);
	}   

	/**
	 *	Returns the value of ip33701SourceCurExp
	 *	@return ip33701SourceCurExp
	 */
   public char[] getIp33701SourceCurExp() throws CFException  {              
   		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701SourceCurExp();
   }

  
	/**
	*  set variable ip33701SourceCurExp
	*  @param value
	**/
   public void setIp33701SourceCurExp(char[] value) throws CFException {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(value);
   } 

     /**
	 * 	Update Ip33701SourceCurExp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp33701SourceCurExp(char[] source, int sourceIndex) throws CFException {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source, sourceIndex);
   	
   }
   
   public void setIp33701SourceCurExp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip33701SourceCurExp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp33701SourceCurExp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip33701SourceCurExp with another Field
	 *	@param value
	 */
   public void setIp33701SourceCurExp(Field source) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source);
   }  
   
     /**
	 * 	Update Ip33701SourceCurExp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp33701SourceCurExp(Field source, int sourceIndex,int sourceLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip33701SourceCurExp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp33701SourceCurExp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setSys201CalcFIdx(int sys201CalcFIdx) { 
    Ip088030Ctx.this.sys201CalcFIdx = sys201CalcFIdx;
}

public int getSys201CalcFIdx() { 
    return Ip088030Ctx.this.sys201CalcFIdx;
}
	/**
	 *	Test condition "CR" for isSys20188FeeIndCr()
	 *	@return  Returns true if isSys20188FeeIndCr() is "CR"
	 */
   public boolean isSys20188FeeIndCr(int index) throws CFException {
      return sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).isSys20188FeeIndCr();
   }

	/**
	*  set values "CR"
	*/
   	public void setSys20188FeeIndCrTrue(int index)  throws CFException{  			
    	sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).setSys20188FeeIndCrTrue();
   	}
	/**
	 *	Returns the value of sys201CalcFeeSetlCur
	 *	@return sys201CalcFeeSetlCur
	 */
	public int getSys201CalcFeeSetlCur(int index) throws CFException {
   		return sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).getSys201CalcFeeSetlCur();
	}


	/**
	 *	Returns String value of sys201CalcFeeSetlCur
	 *	@return sys201CalcFeeSetlCur
	 */
	public char[]  getSys201CalcFeeSetlCurString(int index) throws CFException {
	     return String.valueOf(sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).getSys201CalcFeeSetlCurString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys201CalcFeeSetlCurIsNumeric(int index)  throws CFException{
	    return sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index - 1).sys201CalcFeeSetlCurIsNumeric();
	}

	/**
	 * 	Update Sys201CalcFeeSetlCur with the passed value
	 *	@param number
	 */
	public void setSys201CalcFeeSetlCur(int index,int number)  throws CFException{
		sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).setSys201CalcFeeSetlCur(number);
	}
	

	public void setSys201CalcFeeSetlCur(int index,long number)  throws CFException{
	    sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).setSys201CalcFeeSetlCur(number);
	}
	
	
	/**
	 * 	Update Sys201CalcFeeSetlCur with the passed value
	 *	@param value (String or char[])
	 */
	public void setSys201CalcFeeSetlCur(int index,char[] value)  throws CFException {
		sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).setSys201CalcFeeSetlCur(value);
	}
	
	/**
	 * 	Update Sys201CalcFeeSetlCur with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSys201CalcFeeSetlCurString(int index,char[] value)  throws CFException{
		sys201OutputRecord.getSys201RecordPart3().getSys201CalcFeeInfo(index).setSys201CalcFeeSetlCur(value);
	}	

	/**
	 *	Returns the value of ip00174CurExpCode
	 *	@return ip00174CurExpCode
	 */
	public int getIp00174CurExpCode() throws CFException {
   		return ip00174TableEntry.getIp00174CurExpCode();
	}


	/**
	 *	Returns String value of ip00174CurExpCode
	 *	@return ip00174CurExpCode
	 */
	public char[]  getIp00174CurExpCodeString() throws CFException {
	     return String.valueOf(ip00174TableEntry.getIp00174CurExpCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00174CurExpCodeIsNumeric()  throws CFException{
	    return ip00174TableEntry.ip00174CurExpCodeIsNumeric();
	}

	/**
	 * 	Update Ip00174CurExpCode with the passed value
	 *	@param number
	 */
	public void setIp00174CurExpCode(int number)  throws CFException{
		ip00174TableEntry.setIp00174CurExpCode(number);
	}
	

	public void setIp00174CurExpCode(long number)  throws CFException{
	    ip00174TableEntry.setIp00174CurExpCode(number);
	}
	
	
	/**
	 * 	Update Ip00174CurExpCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00174CurExpCode(char[] value)  throws CFException {
		ip00174TableEntry.setIp00174CurExpCode(value);
	}
	
	/**
	 * 	Update Ip00174CurExpCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00174CurExpCodeString(char[] value)  throws CFException{
		ip00174TableEntry.setIp00174CurExpCode(value);
	}	

	/**
	 *	Returns the value of ip33701TargetCurExp
	 *	@return ip33701TargetCurExp
	 */
   public char[] getIp33701TargetCurExp() throws CFException  {              
   		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701TargetCurExp();
   }

  
	/**
	*  set variable ip33701TargetCurExp
	*  @param value
	**/
   public void setIp33701TargetCurExp(char[] value) throws CFException {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(value);
   } 

     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp33701TargetCurExp(char[] source, int sourceIndex) throws CFException {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex);
   	
   }
   
   public void setIp33701TargetCurExp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp33701TargetCurExp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip33701TargetCurExp with another Field
	 *	@param value
	 */
   public void setIp33701TargetCurExp(Field source) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source);
   }  
   
     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp33701TargetCurExp(Field source, int sourceIndex,int sourceLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp33701TargetCurExp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001TjfIp370Rec.hashCode();
        str += work.hashCode();
        str += sys201OutputRecord.hashCode();
        str += ichgCalcVars800.hashCode();
        str += ip33701CurrConvInterface.hashCode();
        str += ip00174TableEntry.hashCode();
       return str.hashCode();
    }

    public DetermineFeeIssOutCtx clone() {
        DetermineFeeIssOutCtx cloneObj = new DetermineFeeIssOutCtx();
        cloneObj.sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        cloneObj.sys001TjfIp370Rec.set(sys001TjfIp370Rec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys201OutputRecord = new Sys201OutputRecord();
        cloneObj.sys201OutputRecord.set(sys201OutputRecord.getClonedField());
        cloneObj.ichgCalcVars800 = new IchgCalcVars800();
        cloneObj.ichgCalcVars800.set(ichgCalcVars800.getClonedField());
        cloneObj.ip33701CurrConvInterface = new Ip33701CurrConvInterface();
        cloneObj.ip33701CurrConvInterface.set(ip33701CurrConvInterface.getClonedField());
        cloneObj.ip00174TableEntry = new Ip00174TableEntry();
        cloneObj.ip00174TableEntry.set(ip00174TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public DetermineFeeIssOutCtx getDetermineFeeIssOutCtx() {
            return new DetermineFeeIssOutCtx();
    }
     public class WriteOutputSys201InCtx implements Cloneable {
     Sys001TjfIp370Rec sys001TjfIp370Rec = Ip088030Ctx.this.getSys001TjfIp370Rec();
     AbendMessage900 abendMessage900 = Ip088030Ctx.this.getAbendMessage900();
     AbendMessage600 abendMessage600 = Ip088030Ctx.this.getAbendMessage600();
     HoldVariables800 holdVariables800 = Ip088030Ctx.this.getHoldVariables800();
     Work work = Ip088030Ctx.this.getWork();
     AbendPara900 abendPara900 = Ip088030Ctx.this.getAbendPara900();
     Sys201OutputRecord sys201OutputRecord = Ip088030Ctx.this.getSys201OutputRecord();

	/**
	 *	Returns the value of maid800
	 *	@return maid800
	 */
   public char[] getMaid800() throws CFException  {              
   		return holdVariables800.getMaid800();
   }

  
	/**
	*  set variable maid800
	*  @param value
	**/
   public void setMaid800(char[] value) throws CFException {
      holdVariables800.setMaid800(value);
   } 

     /**
	 * 	Update Maid800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMaid800(char[] source, int sourceIndex) throws CFException {
      holdVariables800.setMaid800(source, sourceIndex);
   	
   }
   
   public void setMaid800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      holdVariables800.setMaid800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Maid800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMaid800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setMaid800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Maid800 with another Field
	 *	@param value
	 */
   public void setMaid800(Field source) {
      holdVariables800.setMaid800(source);
   }  
   
     /**
	 * 	Update Maid800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMaid800(Field source, int sourceIndex,int sourceLen) {
      holdVariables800.setMaid800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Maid800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMaid800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setMaid800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys201RecordPart2
	 *	@return sys201RecordPart2
	 */   
	 public Sys201RecordPart2 getSys201RecordPart2() {
   	return sys201OutputRecord.getSys201RecordPart2();
   }

   /**
	* 	Update Sys201RecordPart2 with the passed value
	*	@param value
	*/
   public void setSys201RecordPart2(char[] value) throws CFException {
      sys201OutputRecord.setSys201RecordPart2(value);
   }   

     /**
	 * 	Update Sys201RecordPart2 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSys201RecordPart2(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sys201OutputRecord.setSys201RecordPart2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys201RecordPart2 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys201RecordPart2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys201OutputRecord.setSys201RecordPart2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys201RecordPart2 with another Field
	 *	@param value
	 */
   public void setSys201RecordPart2(Field source) {
   	sys201OutputRecord.setSys201RecordPart2(source);
   }  
   
     /**
	 * 	Update Sys201RecordPart2 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSys201RecordPart2(Field source, int sourceIndex,int sourceLen) {
   	sys201OutputRecord.setSys201RecordPart2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys201RecordPart2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys201RecordPart2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys201OutputRecord.setSys201RecordPart2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip98151RecordPart1
	 *	@return ip98151RecordPart1
	 */   
	 public Ip98151RecordPart1 getIp98151RecordPart1() {
   	return sys001TjfIp370Rec.getIp98151RecordPart1();
   }

   /**
	* 	Update Ip98151RecordPart1 with the passed value
	*	@param value
	*/
   public void setIp98151RecordPart1(char[] value) throws CFException {
      sys001TjfIp370Rec.setIp98151RecordPart1(value);
   }   

     /**
	 * 	Update Ip98151RecordPart1 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp98151RecordPart1(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sys001TjfIp370Rec.setIp98151RecordPart1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98151RecordPart1 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98151RecordPart1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys001TjfIp370Rec.setIp98151RecordPart1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98151RecordPart1 with another Field
	 *	@param value
	 */
   public void setIp98151RecordPart1(Field source) {
   	sys001TjfIp370Rec.setIp98151RecordPart1(source);
   }  
   
     /**
	 * 	Update Ip98151RecordPart1 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp98151RecordPart1(Field source, int sourceIndex,int sourceLen) {
   	sys001TjfIp370Rec.setIp98151RecordPart1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98151RecordPart1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98151RecordPart1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys001TjfIp370Rec.setIp98151RecordPart1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendMessage600
	 *	@return abendMessage600
	 */   
	 public AbendMessage600 getAbendMessage600() {
   	return abendMessage600;
   }


	/**
	 *	Returns the value of ip98152RecordPart2
	 *	@return ip98152RecordPart2
	 */   
	 public Ip98152RecordPart2 getIp98152RecordPart2() {
   	return sys001TjfIp370Rec.getIp98152RecordPart2();
   }

   /**
	* 	Update Ip98152RecordPart2 with the passed value
	*	@param value
	*/
   public void setIp98152RecordPart2(char[] value) throws CFException {
      sys001TjfIp370Rec.setIp98152RecordPart2(value);
   }   

     /**
	 * 	Update Ip98152RecordPart2 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp98152RecordPart2(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sys001TjfIp370Rec.setIp98152RecordPart2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98152RecordPart2 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98152RecordPart2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys001TjfIp370Rec.setIp98152RecordPart2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98152RecordPart2 with another Field
	 *	@param value
	 */
   public void setIp98152RecordPart2(Field source) {
   	sys001TjfIp370Rec.setIp98152RecordPart2(source);
   }  
   
     /**
	 * 	Update Ip98152RecordPart2 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp98152RecordPart2(Field source, int sourceIndex,int sourceLen) {
   	sys001TjfIp370Rec.setIp98152RecordPart2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98152RecordPart2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98152RecordPart2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys001TjfIp370Rec.setIp98152RecordPart2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys201OutputRecord
	 *	@return sys201OutputRecord
	 */   
	 public Sys201OutputRecord getSys201OutputRecord() {
   	return sys201OutputRecord;
   }


	/**
	 *	Returns the value of writeCnt400
	 *	@return writeCnt400
	 */
	public long getWriteCnt400() throws CFException {
   		return work.getWriteCnt400();
	}


	/**
	 *	Returns String value of writeCnt400
	 *	@return writeCnt400
	 */
	public char[]  getWriteCnt400String() throws CFException {
	     return String.valueOf(work.getWriteCnt400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean writeCnt400IsNumeric()  throws CFException{
	    return work.writeCnt400IsNumeric();
	}

	/**
	 * 	Update WriteCnt400 with the passed value
	 *	@param number
	 */
	public void setWriteCnt400(long number)  throws CFException{
		work.setWriteCnt400(number);
	}
	

	
	/**
	 * 	Update WriteCnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWriteCnt400(char[] value)  throws CFException {
		work.setWriteCnt400(value);
	}
	
	/**
	 * 	Update WriteCnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWriteCnt400String(char[] value)  throws CFException{
		work.setWriteCnt400(value);
	}	


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public WriteOutputSys201OutCtx getWriteOutputSys201OutCtx() {
            return new WriteOutputSys201OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001TjfIp370Rec.hashCode();
        str += abendMessage900.hashCode();
        str += abendMessage600.hashCode();
        str += holdVariables800.hashCode();
        str += work.hashCode();
        str += abendPara900.hashCode();
        str += sys201OutputRecord.hashCode();
       return str.hashCode();
    }

    public WriteOutputSys201InCtx clone() {
        WriteOutputSys201InCtx cloneObj = new WriteOutputSys201InCtx();
        cloneObj.sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        cloneObj.sys001TjfIp370Rec.set(sys001TjfIp370Rec.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        cloneObj.holdVariables800 = new HoldVariables800();
        cloneObj.holdVariables800.set(holdVariables800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.sys201OutputRecord = new Sys201OutputRecord();
        cloneObj.sys201OutputRecord.set(sys201OutputRecord.getClonedField());
        return cloneObj;
    }

    }

    public WriteOutputSys201InCtx getWriteOutputSys201InCtx() {
            return new WriteOutputSys201InCtx();
    }
     public class WriteOutputSys201OutCtx implements Cloneable {
     Sys001TjfIp370Rec sys001TjfIp370Rec = Ip088030Ctx.this.getSys001TjfIp370Rec();
     AbendMessage900 abendMessage900 = Ip088030Ctx.this.getAbendMessage900();
     AbendMessage600 abendMessage600 = Ip088030Ctx.this.getAbendMessage600();
     Work work = Ip088030Ctx.this.getWork();
     HoldVariables800 holdVariables800 = Ip088030Ctx.this.getHoldVariables800();
     AbendPara900 abendPara900 = Ip088030Ctx.this.getAbendPara900();
     Sys201OutputRecord sys201OutputRecord = Ip088030Ctx.this.getSys201OutputRecord();

	/**
	 *	Returns the value of fileStatus600
	 *	@return fileStatus600
	 */
   public char[] getFileStatus600() throws CFException  {              
   		return abendMessage600.getFileStatus600();
   }

  
	/**
	*  set variable fileStatus600
	*  @param value
	**/
   public void setFileStatus600(char[] value) throws CFException {
      abendMessage600.setFileStatus600(value);
   } 

     /**
	 * 	Update FileStatus600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileStatus600(char[] source, int sourceIndex) throws CFException {
      abendMessage600.setFileStatus600(source, sourceIndex);
   	
   }
   
   public void setFileStatus600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FileStatus600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileStatus600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FileStatus600 with another Field
	 *	@param value
	 */
   public void setFileStatus600(Field source) {
      abendMessage600.setFileStatus600(source);
   }  
   
     /**
	 * 	Update FileStatus600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileStatus600(Field source, int sourceIndex,int sourceLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FileStatus600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileStatus600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition 3003 for isWriteAbendCode88300()
	 *	@return  Returns true if isWriteAbendCode88300() is 3003
	 */
   public boolean isWriteAbendCode88300() throws CFException {
      return work.isWriteAbendCode88300();
   }

	/**
	*  set values 3003
	*/
   	public void setWriteAbendCode88300True()  throws CFException{  			
    	work.setWriteAbendCode88300True();
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
	 *	Returns the value of sys201FileStatus200
	 *	@return sys201FileStatus200
	 */
   public char[] getSys201FileStatus200() throws CFException  {              
   		return work.getSys201FileStatus200();
   }

  
	/**
	*  set variable sys201FileStatus200
	*  @param value
	**/
   public void setSys201FileStatus200(char[] value) throws CFException {
      work.setSys201FileStatus200(value);
   } 

	/**
	 *	Returns the value of abendMessage600
	 *	@return abendMessage600
	 */   
	 public AbendMessage600 getAbendMessage600() {
   	return abendMessage600;
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
	 *	Returns the value of sys201RecordPart1
	 *	@return sys201RecordPart1
	 */
   public char[] getSys201RecordPart1() throws CFException  {              
   		return sys201OutputRecord.getSys201RecordPart1();
   }

  
	/**
	*  set variable sys201RecordPart1
	*  @param value
	**/
   public void setSys201RecordPart1(char[] value) throws CFException {
      sys201OutputRecord.setSys201RecordPart1(value);
   } 

     /**
	 * 	Update Sys201RecordPart1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys201RecordPart1(char[] source, int sourceIndex) throws CFException {
      sys201OutputRecord.setSys201RecordPart1(source, sourceIndex);
   	
   }
   
   public void setSys201RecordPart1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys201OutputRecord.setSys201RecordPart1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys201RecordPart1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys201RecordPart1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys201OutputRecord.setSys201RecordPart1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys201RecordPart1 with another Field
	 *	@param value
	 */
   public void setSys201RecordPart1(Field source) {
      sys201OutputRecord.setSys201RecordPart1(source);
   }  
   
     /**
	 * 	Update Sys201RecordPart1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys201RecordPart1(Field source, int sourceIndex,int sourceLen) {
      sys201OutputRecord.setSys201RecordPart1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys201RecordPart1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys201RecordPart1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys201OutputRecord.setSys201RecordPart1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendParaName300
	 *	@return abendParaName300
	 */
   public char[] getAbendParaName300() throws CFException  {              
   		return work.getAbendParaName300();
   }

  
	/**
	*  set variable abendParaName300
	*  @param value
	**/
   public void setAbendParaName300(char[] value) throws CFException {
      work.setAbendParaName300(value);
   } 

	/**
	 *	Test condition "ERROR WRITING SYS201-FILE" for isAbendWriteSys20188600()
	 *	@return  Returns true if isAbendWriteSys20188600() is "ERROR WRITING SYS201-FILE"
	 */
   public boolean isAbendWriteSys20188600() throws CFException {
      return abendMessage600.isAbendWriteSys20188600();
   }

	/**
	*  set values "ERROR WRITING SYS201-FILE"
	*/
   	public void setAbendWriteSys20188600True()  throws CFException{  			
    	abendMessage600.setAbendWriteSys20188600True();
   	}
	/**
	 *	Returns the value of maid800
	 *	@return maid800
	 */
   public char[] getMaid800() throws CFException  {              
   		return holdVariables800.getMaid800();
   }

  
	/**
	*  set variable maid800
	*  @param value
	**/
   public void setMaid800(char[] value) throws CFException {
      holdVariables800.setMaid800(value);
   } 

     /**
	 * 	Update Maid800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMaid800(char[] source, int sourceIndex) throws CFException {
      holdVariables800.setMaid800(source, sourceIndex);
   	
   }
   
   public void setMaid800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      holdVariables800.setMaid800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Maid800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMaid800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setMaid800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Maid800 with another Field
	 *	@param value
	 */
   public void setMaid800(Field source) {
      holdVariables800.setMaid800(source);
   }  
   
     /**
	 * 	Update Maid800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMaid800(Field source, int sourceIndex,int sourceLen) {
      holdVariables800.setMaid800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Maid800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMaid800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setMaid800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys201RecordPart2
	 *	@return sys201RecordPart2
	 */   
	 public Sys201RecordPart2 getSys201RecordPart2() {
   	return sys201OutputRecord.getSys201RecordPart2();
   }

   /**
	* 	Update Sys201RecordPart2 with the passed value
	*	@param value
	*/
   public void setSys201RecordPart2(char[] value) throws CFException {
      sys201OutputRecord.setSys201RecordPart2(value);
   }   

     /**
	 * 	Update Sys201RecordPart2 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSys201RecordPart2(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sys201OutputRecord.setSys201RecordPart2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys201RecordPart2 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys201RecordPart2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys201OutputRecord.setSys201RecordPart2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys201RecordPart2 with another Field
	 *	@param value
	 */
   public void setSys201RecordPart2(Field source) {
   	sys201OutputRecord.setSys201RecordPart2(source);
   }  
   
     /**
	 * 	Update Sys201RecordPart2 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSys201RecordPart2(Field source, int sourceIndex,int sourceLen) {
   	sys201OutputRecord.setSys201RecordPart2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys201RecordPart2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys201RecordPart2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys201OutputRecord.setSys201RecordPart2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip98151RecordPart1
	 *	@return ip98151RecordPart1
	 */   
	 public Ip98151RecordPart1 getIp98151RecordPart1() {
   	return sys001TjfIp370Rec.getIp98151RecordPart1();
   }

   /**
	* 	Update Ip98151RecordPart1 with the passed value
	*	@param value
	*/
   public void setIp98151RecordPart1(char[] value) throws CFException {
      sys001TjfIp370Rec.setIp98151RecordPart1(value);
   }   

     /**
	 * 	Update Ip98151RecordPart1 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp98151RecordPart1(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sys001TjfIp370Rec.setIp98151RecordPart1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98151RecordPart1 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98151RecordPart1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys001TjfIp370Rec.setIp98151RecordPart1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98151RecordPart1 with another Field
	 *	@param value
	 */
   public void setIp98151RecordPart1(Field source) {
   	sys001TjfIp370Rec.setIp98151RecordPart1(source);
   }  
   
     /**
	 * 	Update Ip98151RecordPart1 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp98151RecordPart1(Field source, int sourceIndex,int sourceLen) {
   	sys001TjfIp370Rec.setIp98151RecordPart1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98151RecordPart1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98151RecordPart1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys001TjfIp370Rec.setIp98151RecordPart1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendCode300
	 *	@return abendCode300
	 */
	public int getAbendCode300() throws CFException {
   		return work.getAbendCode300();
	}


	/**
	 *	Returns String value of abendCode300
	 *	@return abendCode300
	 */
	public char[]  getAbendCode300String() throws CFException {
	     return String.valueOf(work.getAbendCode300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode300IsNumeric()  throws CFException{
	    return work.abendCode300IsNumeric();
	}

	/**
	 * 	Update AbendCode300 with the passed value
	 *	@param number
	 */
	public void setAbendCode300(int number)  throws CFException{
		work.setAbendCode300(number);
	}
	

	public void setAbendCode300(long number)  throws CFException{
	    work.setAbendCode300(number);
	}
	
	
	/**
	 * 	Update AbendCode300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode300(char[] value)  throws CFException {
		work.setAbendCode300(value);
	}
	
	/**
	 * 	Update AbendCode300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode300String(char[] value)  throws CFException{
		work.setAbendCode300(value);
	}	

	/**
	 *	Returns the value of ip98152RecordPart2
	 *	@return ip98152RecordPart2
	 */   
	 public Ip98152RecordPart2 getIp98152RecordPart2() {
   	return sys001TjfIp370Rec.getIp98152RecordPart2();
   }

   /**
	* 	Update Ip98152RecordPart2 with the passed value
	*	@param value
	*/
   public void setIp98152RecordPart2(char[] value) throws CFException {
      sys001TjfIp370Rec.setIp98152RecordPart2(value);
   }   

     /**
	 * 	Update Ip98152RecordPart2 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp98152RecordPart2(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sys001TjfIp370Rec.setIp98152RecordPart2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98152RecordPart2 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98152RecordPart2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys001TjfIp370Rec.setIp98152RecordPart2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98152RecordPart2 with another Field
	 *	@param value
	 */
   public void setIp98152RecordPart2(Field source) {
   	sys001TjfIp370Rec.setIp98152RecordPart2(source);
   }  
   
     /**
	 * 	Update Ip98152RecordPart2 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp98152RecordPart2(Field source, int sourceIndex,int sourceLen) {
   	sys001TjfIp370Rec.setIp98152RecordPart2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98152RecordPart2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98152RecordPart2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sys001TjfIp370Rec.setIp98152RecordPart2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys201Maid
	 *	@return sys201Maid
	 */
   public char[] getSys201Maid() throws CFException  {              
   		return sys201OutputRecord.getSys201RecordPart2().getSys201Maid();
   }

  
	/**
	*  set variable sys201Maid
	*  @param value
	**/
   public void setSys201Maid(char[] value) throws CFException {
      sys201OutputRecord.getSys201RecordPart2().setSys201Maid(value);
   } 

     /**
	 * 	Update Sys201Maid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys201Maid(char[] source, int sourceIndex) throws CFException {
      sys201OutputRecord.getSys201RecordPart2().setSys201Maid(source, sourceIndex);
   	
   }
   
   public void setSys201Maid(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys201OutputRecord.getSys201RecordPart2().setSys201Maid(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys201Maid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys201Maid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys201OutputRecord.getSys201RecordPart2().setSys201Maid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys201Maid with another Field
	 *	@param value
	 */
   public void setSys201Maid(Field source) {
      sys201OutputRecord.getSys201RecordPart2().setSys201Maid(source);
   }  
   
     /**
	 * 	Update Sys201Maid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys201Maid(Field source, int sourceIndex,int sourceLen) {
      sys201OutputRecord.getSys201RecordPart2().setSys201Maid(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys201Maid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys201Maid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys201OutputRecord.getSys201RecordPart2().setSys201Maid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "00" for isSys201IoGood88200()
	 *	@return  Returns true if isSys201IoGood88200() is "00"
	 */
   public boolean isSys201IoGood88200() throws CFException {
      return work.isSys201IoGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys201IoGood88200True()  throws CFException{  			
    	work.setSys201IoGood88200True();
   	}
	/**
	 *	Returns the value of sys201OutputRecord
	 *	@return sys201OutputRecord
	 */   
	 public Sys201OutputRecord getSys201OutputRecord() {
   	return sys201OutputRecord;
   }


	/**
	 *	Returns the value of writeCnt400
	 *	@return writeCnt400
	 */
	public long getWriteCnt400() throws CFException {
   		return work.getWriteCnt400();
	}


	/**
	 *	Returns String value of writeCnt400
	 *	@return writeCnt400
	 */
	public char[]  getWriteCnt400String() throws CFException {
	     return String.valueOf(work.getWriteCnt400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean writeCnt400IsNumeric()  throws CFException{
	    return work.writeCnt400IsNumeric();
	}

	/**
	 * 	Update WriteCnt400 with the passed value
	 *	@param number
	 */
	public void setWriteCnt400(long number)  throws CFException{
		work.setWriteCnt400(number);
	}
	

	
	/**
	 * 	Update WriteCnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWriteCnt400(char[] value)  throws CFException {
		work.setWriteCnt400(value);
	}
	
	/**
	 * 	Update WriteCnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWriteCnt400String(char[] value)  throws CFException{
		work.setWriteCnt400(value);
	}	

	/**
	 *	Test condition "2120-WRITE-OUTPUT-SYS201" for isAbendPara212088300()
	 *	@return  Returns true if isAbendPara212088300() is "2120-WRITE-OUTPUT-SYS201"
	 */
   public boolean isAbendPara212088300() throws CFException {
      return work.isAbendPara212088300();
   }

	/**
	*  set values "2120-WRITE-OUTPUT-SYS201"
	*/
   	public void setAbendPara212088300True()  throws CFException{  			
    	work.setAbendPara212088300True();
   	}

        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001TjfIp370Rec.hashCode();
        str += abendMessage900.hashCode();
        str += abendMessage600.hashCode();
        str += work.hashCode();
        str += holdVariables800.hashCode();
        str += abendPara900.hashCode();
        str += sys201OutputRecord.hashCode();
       return str.hashCode();
    }

    public WriteOutputSys201OutCtx clone() {
        WriteOutputSys201OutCtx cloneObj = new WriteOutputSys201OutCtx();
        cloneObj.sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        cloneObj.sys001TjfIp370Rec.set(sys001TjfIp370Rec.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.holdVariables800 = new HoldVariables800();
        cloneObj.holdVariables800.set(holdVariables800.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.sys201OutputRecord = new Sys201OutputRecord();
        cloneObj.sys201OutputRecord.set(sys201OutputRecord.getClonedField());
        return cloneObj;
    }

    }

    public WriteOutputSys201OutCtx getWriteOutputSys201OutCtx() {
            return new WriteOutputSys201OutCtx();
    }
     public class SearchDefaultRateInCtx implements Cloneable {
     Work work = Ip088030Ctx.this.getWork();
     IchgFeeRecords500 ichgFeeRecords500 = Ip088030Ctx.this.getIchgFeeRecords500();
     IchgCalcVars800 ichgCalcVars800 = Ip088030Ctx.this.getIchgCalcVars800();
     Ip00164TableEntry ip00164TableEntry = Ip088030Ctx.this.getIp00164TableEntry();

	/**
	 *	Returns the value of recType500
	 *	@return recType500
	 */
   public char[] getRecType500(int index) throws CFException  {              
   		return ichgFeeRecords500.getIchgEntry500(index).getRecType500();
   }

  
	/**
	*  set variable recType500
	*  @param value
	**/
   public void setRecType500(int index,char[] value) throws CFException {
      ichgFeeRecords500.getIchgEntry500(index).setRecType500(value);
   } 

     /**
	 * 	Update RecType500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecType500(int index,char[] source, int sourceIndex) throws CFException {
      ichgFeeRecords500.getIchgEntry500(index).setRecType500(source, sourceIndex);
   	
   }
   
   public void setRecType500(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ichgFeeRecords500.getIchgEntry500(index).setRecType500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RecType500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecType500(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ichgFeeRecords500.getIchgEntry500(index).setRecType500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RecType500 with another Field
	 *	@param value
	 */
   public void setRecType500(int index,Field source) {
      ichgFeeRecords500.getIchgEntry500(index).setRecType500(source);
   }  
   
     /**
	 * 	Update RecType500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecType500(int index,Field source, int sourceIndex,int sourceLen) {
      ichgFeeRecords500.getIchgEntry500(index).setRecType500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RecType500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecType500(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ichgFeeRecords500.getIchgEntry500(index).setRecType500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setIchgIdx500(int ichgIdx500) { 
    Ip088030Ctx.this.ichgIdx500 = ichgIdx500;
}

public int getIchgIdx500() { 
    return Ip088030Ctx.this.ichgIdx500;
}
	/**
	 *	Returns the value of ichgEntriesCnt500
	 *	@return ichgEntriesCnt500
	 */
	public short getIchgEntriesCnt500() throws CFException {        
   		return ichgFeeRecords500.getIchgEntriesCnt500();
	}
	
	/**
	 * 	Update IchgEntriesCnt500 with the passed value
	 *	@param number
	 */
	public void setIchgEntriesCnt500(short number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesCnt500(number);
	}

	public void setIchgEntriesCnt500(int number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesCnt500((short)number);
	}

	public void setIchgEntriesCnt500(long number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesCnt500((short)number);
	}



	/**
	 *	Returns the value of txnLowAmtU500
	 *	@return txnLowAmtU500
	 */
	public long getTxnLowAmtU500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getTxnLowAmtU500();
	}


	/**
	 *	Returns String value of txnLowAmtU500
	 *	@return txnLowAmtU500
	 */
	public char[]  getTxnLowAmtU500String(int index) throws CFException {
	     return String.valueOf(ichgFeeRecords500.getIchgEntry500(index).getTxnLowAmtU500String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean txnLowAmtU500IsNumeric(int index)  throws CFException{
	    return ichgFeeRecords500.getIchgEntry500(index - 1).txnLowAmtU500IsNumeric();
	}

	/**
	 * 	Update TxnLowAmtU500 with the passed value
	 *	@param number
	 */
	public void setTxnLowAmtU500(int index,long number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setTxnLowAmtU500(number);
	}
	

	
	/**
	 * 	Update TxnLowAmtU500 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTxnLowAmtU500(int index,char[] value)  throws CFException {
		ichgFeeRecords500.getIchgEntry500(index).setTxnLowAmtU500(value);
	}
	
	/**
	 * 	Update TxnLowAmtU500 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTxnLowAmtU500String(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setTxnLowAmtU500(value);
	}	

	/**
	 *	Returns the value of maid500
	 *	@return maid500
	 */
   public char[] getMaid500(int index) throws CFException  {              
   		return ichgFeeRecords500.getIchgEntry500(index).getMaid500();
   }

  
	/**
	*  set variable maid500
	*  @param value
	**/
   public void setMaid500(int index,char[] value) throws CFException {
      ichgFeeRecords500.getIchgEntry500(index).setMaid500(value);
   } 

     /**
	 * 	Update Maid500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMaid500(int index,char[] source, int sourceIndex) throws CFException {
      ichgFeeRecords500.getIchgEntry500(index).setMaid500(source, sourceIndex);
   	
   }
   
   public void setMaid500(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ichgFeeRecords500.getIchgEntry500(index).setMaid500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Maid500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMaid500(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ichgFeeRecords500.getIchgEntry500(index).setMaid500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Maid500 with another Field
	 *	@param value
	 */
   public void setMaid500(int index,Field source) {
      ichgFeeRecords500.getIchgEntry500(index).setMaid500(source);
   }  
   
     /**
	 * 	Update Maid500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMaid500(int index,Field source, int sourceIndex,int sourceLen) {
      ichgFeeRecords500.getIchgEntry500(index).setMaid500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Maid500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMaid500(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ichgFeeRecords500.getIchgEntry500(index).setMaid500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip00164ProdCatCd
	 *	@return ip00164ProdCatCd
	 */
   public char[] getIp00164ProdCatCd() throws CFException  {              
   		return ip00164TableEntry.getIp00164TableData().getIp00164ProdCatCd();
   }

  
	/**
	*  set variable ip00164ProdCatCd
	*  @param value
	**/
   public void setIp00164ProdCatCd(char[] value) throws CFException {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(value);
   } 

     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00164ProdCatCd(char[] source, int sourceIndex) throws CFException {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex);
   	
   }
   
   public void setIp00164ProdCatCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00164ProdCatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00164ProdCatCd with another Field
	 *	@param value
	 */
   public void setIp00164ProdCatCd(Field source) {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source);
   }  
   
     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00164ProdCatCd(Field source, int sourceIndex,int sourceLen) {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00164ProdCatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of minAmt500
	 *	@return minAmt500
	 */
	public BigDecimal getMinAmt500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getMinAmt500();
	}


	 /**
     *	Returns String value of minAmt500
     *	@return minAmt500
     */
    public char[]  getMinAmt500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getMinAmt500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean minAmt500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).minAmt500IsNumeric();
    }
	/**
	 * 	Update MinAmt500 with the passed number
	 *	@param number
	 */
	public void setMinAmt500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMinAmt500(number);
   }

	/**
	 * 	Update MinAmt500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMinAmt500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMinAmt500(value);
	}   

	/**
	 *	Returns the value of fiaAmt500
	 *	@return fiaAmt500
	 */
	public BigDecimal getFiaAmt500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getFiaAmt500();
	}


	 /**
     *	Returns String value of fiaAmt500
     *	@return fiaAmt500
     */
    public char[]  getFiaAmt500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getFiaAmt500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean fiaAmt500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).fiaAmt500IsNumeric();
    }
	/**
	 * 	Update FiaAmt500 with the passed number
	 *	@param number
	 */
	public void setFiaAmt500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setFiaAmt500(number);
   }

	/**
	 * 	Update FiaAmt500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setFiaAmt500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setFiaAmt500(value);
	}   

	/**
	 *	Returns the value of txnHighAmtU500
	 *	@return txnHighAmtU500
	 */
	public long getTxnHighAmtU500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getTxnHighAmtU500();
	}


	/**
	 *	Returns String value of txnHighAmtU500
	 *	@return txnHighAmtU500
	 */
	public char[]  getTxnHighAmtU500String(int index) throws CFException {
	     return String.valueOf(ichgFeeRecords500.getIchgEntry500(index).getTxnHighAmtU500String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean txnHighAmtU500IsNumeric(int index)  throws CFException{
	    return ichgFeeRecords500.getIchgEntry500(index - 1).txnHighAmtU500IsNumeric();
	}

	/**
	 * 	Update TxnHighAmtU500 with the passed value
	 *	@param number
	 */
	public void setTxnHighAmtU500(int index,long number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setTxnHighAmtU500(number);
	}
	

	
	/**
	 * 	Update TxnHighAmtU500 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTxnHighAmtU500(int index,char[] value)  throws CFException {
		ichgFeeRecords500.getIchgEntry500(index).setTxnHighAmtU500(value);
	}
	
	/**
	 * 	Update TxnHighAmtU500 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTxnHighAmtU500String(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setTxnHighAmtU500(value);
	}	

	/**
	 *	Returns the value of viaRate500
	 *	@return viaRate500
	 */
	public BigDecimal getViaRate500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getViaRate500();
	}


	 /**
     *	Returns String value of viaRate500
     *	@return viaRate500
     */
    public char[]  getViaRate500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getViaRate500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean viaRate500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).viaRate500IsNumeric();
    }
	/**
	 * 	Update ViaRate500 with the passed number
	 *	@param number
	 */
	public void setViaRate500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setViaRate500(number);
   }

	/**
	 * 	Update ViaRate500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setViaRate500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setViaRate500(value);
	}   

	/**
	 *	Returns the value of maxAmt500
	 *	@return maxAmt500
	 */
	public BigDecimal getMaxAmt500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getMaxAmt500();
	}


	 /**
     *	Returns String value of maxAmt500
     *	@return maxAmt500
     */
    public char[]  getMaxAmt500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getMaxAmt500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean maxAmt500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).maxAmt500IsNumeric();
    }
	/**
	 * 	Update MaxAmt500 with the passed number
	 *	@param number
	 */
	public void setMaxAmt500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMaxAmt500(number);
   }

	/**
	 * 	Update MaxAmt500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMaxAmt500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMaxAmt500(value);
	}   


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public SearchDefaultRateOutCtx getSearchDefaultRateOutCtx() {
            return new SearchDefaultRateOutCtx();
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
        str += ichgFeeRecords500.hashCode();
        str += ichgCalcVars800.hashCode();
        str += ip00164TableEntry.hashCode();
       return str.hashCode();
    }

    public SearchDefaultRateInCtx clone() {
        SearchDefaultRateInCtx cloneObj = new SearchDefaultRateInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ichgFeeRecords500 = new IchgFeeRecords500();
        cloneObj.ichgFeeRecords500.set(ichgFeeRecords500.getClonedField());
        cloneObj.ichgCalcVars800 = new IchgCalcVars800();
        cloneObj.ichgCalcVars800.set(ichgCalcVars800.getClonedField());
        cloneObj.ip00164TableEntry = new Ip00164TableEntry();
        cloneObj.ip00164TableEntry.set(ip00164TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public SearchDefaultRateInCtx getSearchDefaultRateInCtx() {
            return new SearchDefaultRateInCtx();
    }
     public class SearchDefaultRateOutCtx implements Cloneable {
     Work work = Ip088030Ctx.this.getWork();
     IchgFeeRecords500 ichgFeeRecords500 = Ip088030Ctx.this.getIchgFeeRecords500();
     IchgCalcVars800 ichgCalcVars800 = Ip088030Ctx.this.getIchgCalcVars800();
     Ip00164TableEntry ip00164TableEntry = Ip088030Ctx.this.getIp00164TableEntry();


public void setIchgIdx500(int ichgIdx500) { 
    Ip088030Ctx.this.ichgIdx500 = ichgIdx500;
}

public int getIchgIdx500() { 
    return Ip088030Ctx.this.ichgIdx500;
}
	/**
	 *	Returns the value of minAmt800
	 *	@return minAmt800
	 */
	public BigDecimal getMinAmt800() throws CFException {
   		return ichgCalcVars800.getMinAmt800();
	}


	 /**
     *	Returns String value of minAmt800
     *	@return minAmt800
     */
    public char[]  getMinAmt800String() throws CFException {
         return ichgCalcVars800.getMinAmt800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean minAmt800IsNumeric() {
        return ichgCalcVars800.minAmt800IsNumeric();
    }
	/**
	 * 	Update MinAmt800 with the passed number
	 *	@param number
	 */
	public void setMinAmt800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setMinAmt800(number);
   }

	/**
	 * 	Update MinAmt800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMinAmt800(char[] value)  throws CFException{
		ichgCalcVars800.setMinAmt800(value);
	}   

	/**
	 *	Returns the value of minAmt500
	 *	@return minAmt500
	 */
	public BigDecimal getMinAmt500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getMinAmt500();
	}


	 /**
     *	Returns String value of minAmt500
     *	@return minAmt500
     */
    public char[]  getMinAmt500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getMinAmt500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean minAmt500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).minAmt500IsNumeric();
    }
	/**
	 * 	Update MinAmt500 with the passed number
	 *	@param number
	 */
	public void setMinAmt500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMinAmt500(number);
   }

	/**
	 * 	Update MinAmt500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMinAmt500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMinAmt500(value);
	}   

	/**
	 *	Test condition "N" for isItIsNotEndLoop88100()
	 *	@return  Returns true if isItIsNotEndLoop88100() is "N"
	 */
   public boolean isItIsNotEndLoop88100() throws CFException {
      return work.isItIsNotEndLoop88100();
   }

	/**
	*  set values "N"
	*/
   	public void setItIsNotEndLoop88100True()  throws CFException{  			
    	work.setItIsNotEndLoop88100True();
   	}
	/**
	 *	Returns the value of viaRate800
	 *	@return viaRate800
	 */
	public BigDecimal getViaRate800() throws CFException {
   		return ichgCalcVars800.getViaRate800();
	}


	 /**
     *	Returns String value of viaRate800
     *	@return viaRate800
     */
    public char[]  getViaRate800String() throws CFException {
         return ichgCalcVars800.getViaRate800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean viaRate800IsNumeric() {
        return ichgCalcVars800.viaRate800IsNumeric();
    }
	/**
	 * 	Update ViaRate800 with the passed number
	 *	@param number
	 */
	public void setViaRate800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setViaRate800(number);
   }

	/**
	 * 	Update ViaRate800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setViaRate800(char[] value)  throws CFException{
		ichgCalcVars800.setViaRate800(value);
	}   

	/**
	 *	Returns the value of maxAmt800
	 *	@return maxAmt800
	 */
	public BigDecimal getMaxAmt800() throws CFException {
   		return ichgCalcVars800.getMaxAmt800();
	}


	 /**
     *	Returns String value of maxAmt800
     *	@return maxAmt800
     */
    public char[]  getMaxAmt800String() throws CFException {
         return ichgCalcVars800.getMaxAmt800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean maxAmt800IsNumeric() {
        return ichgCalcVars800.maxAmt800IsNumeric();
    }
	/**
	 * 	Update MaxAmt800 with the passed number
	 *	@param number
	 */
	public void setMaxAmt800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setMaxAmt800(number);
   }

	/**
	 * 	Update MaxAmt800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMaxAmt800(char[] value)  throws CFException{
		ichgCalcVars800.setMaxAmt800(value);
	}   

	/**
	 *	Returns the value of fiaAmt500
	 *	@return fiaAmt500
	 */
	public BigDecimal getFiaAmt500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getFiaAmt500();
	}


	 /**
     *	Returns String value of fiaAmt500
     *	@return fiaAmt500
     */
    public char[]  getFiaAmt500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getFiaAmt500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean fiaAmt500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).fiaAmt500IsNumeric();
    }
	/**
	 * 	Update FiaAmt500 with the passed number
	 *	@param number
	 */
	public void setFiaAmt500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setFiaAmt500(number);
   }

	/**
	 * 	Update FiaAmt500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setFiaAmt500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setFiaAmt500(value);
	}   

	/**
	 *	Test condition "Y" for isItIsEndOfLoop88100()
	 *	@return  Returns true if isItIsEndOfLoop88100() is "Y"
	 */
   public boolean isItIsEndOfLoop88100() throws CFException {
      return work.isItIsEndOfLoop88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsEndOfLoop88100True()  throws CFException{  			
    	work.setItIsEndOfLoop88100True();
   	}
	/**
	 *	Returns the value of viaRate500
	 *	@return viaRate500
	 */
	public BigDecimal getViaRate500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getViaRate500();
	}


	 /**
     *	Returns String value of viaRate500
     *	@return viaRate500
     */
    public char[]  getViaRate500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getViaRate500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean viaRate500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).viaRate500IsNumeric();
    }
	/**
	 * 	Update ViaRate500 with the passed number
	 *	@param number
	 */
	public void setViaRate500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setViaRate500(number);
   }

	/**
	 * 	Update ViaRate500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setViaRate500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setViaRate500(value);
	}   

	/**
	 *	Returns the value of maxAmt500
	 *	@return maxAmt500
	 */
	public BigDecimal getMaxAmt500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getMaxAmt500();
	}


	 /**
     *	Returns String value of maxAmt500
     *	@return maxAmt500
     */
    public char[]  getMaxAmt500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getMaxAmt500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean maxAmt500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).maxAmt500IsNumeric();
    }
	/**
	 * 	Update MaxAmt500 with the passed number
	 *	@param number
	 */
	public void setMaxAmt500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMaxAmt500(number);
   }

	/**
	 * 	Update MaxAmt500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMaxAmt500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMaxAmt500(value);
	}   

	/**
	 *	Returns the value of fiaAmt800
	 *	@return fiaAmt800
	 */
	public BigDecimal getFiaAmt800() throws CFException {
   		return ichgCalcVars800.getFiaAmt800();
	}


	 /**
     *	Returns String value of fiaAmt800
     *	@return fiaAmt800
     */
    public char[]  getFiaAmt800String() throws CFException {
         return ichgCalcVars800.getFiaAmt800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean fiaAmt800IsNumeric() {
        return ichgCalcVars800.fiaAmt800IsNumeric();
    }
	/**
	 * 	Update FiaAmt800 with the passed number
	 *	@param number
	 */
	public void setFiaAmt800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setFiaAmt800(number);
   }

	/**
	 * 	Update FiaAmt800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setFiaAmt800(char[] value)  throws CFException{
		ichgCalcVars800.setFiaAmt800(value);
	}   


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
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
        str += ichgFeeRecords500.hashCode();
        str += ichgCalcVars800.hashCode();
        str += ip00164TableEntry.hashCode();
       return str.hashCode();
    }

    public SearchDefaultRateOutCtx clone() {
        SearchDefaultRateOutCtx cloneObj = new SearchDefaultRateOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ichgFeeRecords500 = new IchgFeeRecords500();
        cloneObj.ichgFeeRecords500.set(ichgFeeRecords500.getClonedField());
        cloneObj.ichgCalcVars800 = new IchgCalcVars800();
        cloneObj.ichgCalcVars800.set(ichgCalcVars800.getClonedField());
        cloneObj.ip00164TableEntry = new Ip00164TableEntry();
        cloneObj.ip00164TableEntry.set(ip00164TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public SearchDefaultRateOutCtx getSearchDefaultRateOutCtx() {
            return new SearchDefaultRateOutCtx();
    }
     public class CloseFilesInCtx implements Cloneable {
     MsgsRead600 msgsRead600 = Ip088030Ctx.this.getMsgsRead600();
     Work work = Ip088030Ctx.this.getWork();
     IchgFeeRecords500 ichgFeeRecords500 = Ip088030Ctx.this.getIchgFeeRecords500();
     MsgsWrite600 msgsWrite600 = Ip088030Ctx.this.getMsgsWrite600();
     InternalTblCnt600 internalTblCnt600 = Ip088030Ctx.this.getInternalTblCnt600();

	/**
	 *	Returns the value of ichgEntriesCnt500
	 *	@return ichgEntriesCnt500
	 */
	public short getIchgEntriesCnt500() throws CFException {        
   		return ichgFeeRecords500.getIchgEntriesCnt500();
	}
	
	/**
	 * 	Update IchgEntriesCnt500 with the passed value
	 *	@param number
	 */
	public void setIchgEntriesCnt500(short number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesCnt500(number);
	}

	public void setIchgEntriesCnt500(int number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesCnt500((short)number);
	}

	public void setIchgEntriesCnt500(long number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesCnt500((short)number);
	}



	/**
	 *	Returns the value of msgsRead600
	 *	@return msgsRead600
	 */   
	 public MsgsRead600 getMsgsRead600() {
   	return msgsRead600;
   }


	/**
	 *	Returns the value of writeCnt400
	 *	@return writeCnt400
	 */
	public long getWriteCnt400() throws CFException {
   		return work.getWriteCnt400();
	}


	/**
	 *	Returns String value of writeCnt400
	 *	@return writeCnt400
	 */
	public char[]  getWriteCnt400String() throws CFException {
	     return String.valueOf(work.getWriteCnt400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean writeCnt400IsNumeric()  throws CFException{
	    return work.writeCnt400IsNumeric();
	}

	/**
	 * 	Update WriteCnt400 with the passed value
	 *	@param number
	 */
	public void setWriteCnt400(long number)  throws CFException{
		work.setWriteCnt400(number);
	}
	

	
	/**
	 * 	Update WriteCnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWriteCnt400(char[] value)  throws CFException {
		work.setWriteCnt400(value);
	}
	
	/**
	 * 	Update WriteCnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWriteCnt400String(char[] value)  throws CFException{
		work.setWriteCnt400(value);
	}	

	/**
	 *	Returns the value of readCnt400
	 *	@return readCnt400
	 */
	public long getReadCnt400() throws CFException {
   		return work.getReadCnt400();
	}


	/**
	 *	Returns String value of readCnt400
	 *	@return readCnt400
	 */
	public char[]  getReadCnt400String() throws CFException {
	     return String.valueOf(work.getReadCnt400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean readCnt400IsNumeric()  throws CFException{
	    return work.readCnt400IsNumeric();
	}

	/**
	 * 	Update ReadCnt400 with the passed value
	 *	@param number
	 */
	public void setReadCnt400(long number)  throws CFException{
		work.setReadCnt400(number);
	}
	

	
	/**
	 * 	Update ReadCnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setReadCnt400(char[] value)  throws CFException {
		work.setReadCnt400(value);
	}
	
	/**
	 * 	Update ReadCnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setReadCnt400String(char[] value)  throws CFException{
		work.setReadCnt400(value);
	}	

	/**
	 *	Returns the value of msgsWrite600
	 *	@return msgsWrite600
	 */   
	 public MsgsWrite600 getMsgsWrite600() {
   	return msgsWrite600;
   }


	/**
	 *	Returns the value of internalTblCnt600
	 *	@return internalTblCnt600
	 */   
	 public InternalTblCnt600 getInternalTblCnt600() {
   	return internalTblCnt600;
   }



        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public CloseFilesOutCtx getCloseFilesOutCtx() {
            return new CloseFilesOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += msgsRead600.hashCode();
        str += work.hashCode();
        str += ichgFeeRecords500.hashCode();
        str += msgsWrite600.hashCode();
        str += internalTblCnt600.hashCode();
       return str.hashCode();
    }

    public CloseFilesInCtx clone() {
        CloseFilesInCtx cloneObj = new CloseFilesInCtx();
        cloneObj.msgsRead600 = new MsgsRead600();
        cloneObj.msgsRead600.set(msgsRead600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ichgFeeRecords500 = new IchgFeeRecords500();
        cloneObj.ichgFeeRecords500.set(ichgFeeRecords500.getClonedField());
        cloneObj.msgsWrite600 = new MsgsWrite600();
        cloneObj.msgsWrite600.set(msgsWrite600.getClonedField());
        cloneObj.internalTblCnt600 = new InternalTblCnt600();
        cloneObj.internalTblCnt600.set(internalTblCnt600.getClonedField());
        return cloneObj;
    }

    }

    public CloseFilesInCtx getCloseFilesInCtx() {
            return new CloseFilesInCtx();
    }
     public class CloseFilesOutCtx implements Cloneable {
     Work work = Ip088030Ctx.this.getWork();
     MsgsRead600 msgsRead600 = Ip088030Ctx.this.getMsgsRead600();
     IchgFeeRecords500 ichgFeeRecords500 = Ip088030Ctx.this.getIchgFeeRecords500();
     MsgsWrite600 msgsWrite600 = Ip088030Ctx.this.getMsgsWrite600();
     InternalTblCnt600 internalTblCnt600 = Ip088030Ctx.this.getInternalTblCnt600();

	/**
	 *	Returns the value of readCnt600
	 *	@return readCnt600
	 */
   public char[] getReadCnt600() throws CFException  {              
   		return msgsRead600.getReadCnt600();
   }

  
	/**
	*  set variable readCnt600
	*  @param value
	**/
   public void setReadCnt600(char[] value) throws CFException {
      msgsRead600.setReadCnt600(value);
   } 

     /**
	 * 	Update ReadCnt600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setReadCnt600(char[] source, int sourceIndex) throws CFException {
      msgsRead600.setReadCnt600(source, sourceIndex);
   	
   }
   
   public void setReadCnt600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      msgsRead600.setReadCnt600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ReadCnt600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReadCnt600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      msgsRead600.setReadCnt600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ReadCnt600 with another Field
	 *	@param value
	 */
   public void setReadCnt600(Field source) {
      msgsRead600.setReadCnt600(source);
   }  
   
     /**
	 * 	Update ReadCnt600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setReadCnt600(Field source, int sourceIndex,int sourceLen) {
      msgsRead600.setReadCnt600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ReadCnt600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReadCnt600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      msgsRead600.setReadCnt600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ichgEntriesCnt500
	 *	@return ichgEntriesCnt500
	 */
	public short getIchgEntriesCnt500() throws CFException {        
   		return ichgFeeRecords500.getIchgEntriesCnt500();
	}
	
	/**
	 * 	Update IchgEntriesCnt500 with the passed value
	 *	@param number
	 */
	public void setIchgEntriesCnt500(short number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesCnt500(number);
	}

	public void setIchgEntriesCnt500(int number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesCnt500((short)number);
	}

	public void setIchgEntriesCnt500(long number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesCnt500((short)number);
	}



	/**
	 *	Returns the value of ichgFeeCnt600
	 *	@return ichgFeeCnt600
	 */
   public char[] getIchgFeeCnt600() throws CFException  {              
   		return internalTblCnt600.getIchgFeeCnt600();
   }

  
	/**
	*  set variable ichgFeeCnt600
	*  @param value
	**/
   public void setIchgFeeCnt600(char[] value) throws CFException {
      internalTblCnt600.setIchgFeeCnt600(value);
   } 

     /**
	 * 	Update IchgFeeCnt600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIchgFeeCnt600(char[] source, int sourceIndex) throws CFException {
      internalTblCnt600.setIchgFeeCnt600(source, sourceIndex);
   	
   }
   
   public void setIchgFeeCnt600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      internalTblCnt600.setIchgFeeCnt600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IchgFeeCnt600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIchgFeeCnt600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      internalTblCnt600.setIchgFeeCnt600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IchgFeeCnt600 with another Field
	 *	@param value
	 */
   public void setIchgFeeCnt600(Field source) {
      internalTblCnt600.setIchgFeeCnt600(source);
   }  
   
     /**
	 * 	Update IchgFeeCnt600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIchgFeeCnt600(Field source, int sourceIndex,int sourceLen) {
      internalTblCnt600.setIchgFeeCnt600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IchgFeeCnt600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIchgFeeCnt600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      internalTblCnt600.setIchgFeeCnt600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of writeCnt400
	 *	@return writeCnt400
	 */
	public long getWriteCnt400() throws CFException {
   		return work.getWriteCnt400();
	}


	/**
	 *	Returns String value of writeCnt400
	 *	@return writeCnt400
	 */
	public char[]  getWriteCnt400String() throws CFException {
	     return String.valueOf(work.getWriteCnt400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean writeCnt400IsNumeric()  throws CFException{
	    return work.writeCnt400IsNumeric();
	}

	/**
	 * 	Update WriteCnt400 with the passed value
	 *	@param number
	 */
	public void setWriteCnt400(long number)  throws CFException{
		work.setWriteCnt400(number);
	}
	

	
	/**
	 * 	Update WriteCnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWriteCnt400(char[] value)  throws CFException {
		work.setWriteCnt400(value);
	}
	
	/**
	 * 	Update WriteCnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWriteCnt400String(char[] value)  throws CFException{
		work.setWriteCnt400(value);
	}	

	/**
	 *	Returns the value of writeCnt600
	 *	@return writeCnt600
	 */
   public char[] getWriteCnt600() throws CFException  {              
   		return msgsWrite600.getWriteCnt600();
   }

  
	/**
	*  set variable writeCnt600
	*  @param value
	**/
   public void setWriteCnt600(char[] value) throws CFException {
      msgsWrite600.setWriteCnt600(value);
   } 

     /**
	 * 	Update WriteCnt600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWriteCnt600(char[] source, int sourceIndex) throws CFException {
      msgsWrite600.setWriteCnt600(source, sourceIndex);
   	
   }
   
   public void setWriteCnt600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      msgsWrite600.setWriteCnt600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WriteCnt600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWriteCnt600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      msgsWrite600.setWriteCnt600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WriteCnt600 with another Field
	 *	@param value
	 */
   public void setWriteCnt600(Field source) {
      msgsWrite600.setWriteCnt600(source);
   }  
   
     /**
	 * 	Update WriteCnt600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWriteCnt600(Field source, int sourceIndex,int sourceLen) {
      msgsWrite600.setWriteCnt600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WriteCnt600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWriteCnt600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      msgsWrite600.setWriteCnt600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of readCnt400
	 *	@return readCnt400
	 */
	public long getReadCnt400() throws CFException {
   		return work.getReadCnt400();
	}


	/**
	 *	Returns String value of readCnt400
	 *	@return readCnt400
	 */
	public char[]  getReadCnt400String() throws CFException {
	     return String.valueOf(work.getReadCnt400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean readCnt400IsNumeric()  throws CFException{
	    return work.readCnt400IsNumeric();
	}

	/**
	 * 	Update ReadCnt400 with the passed value
	 *	@param number
	 */
	public void setReadCnt400(long number)  throws CFException{
		work.setReadCnt400(number);
	}
	

	
	/**
	 * 	Update ReadCnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setReadCnt400(char[] value)  throws CFException {
		work.setReadCnt400(value);
	}
	
	/**
	 * 	Update ReadCnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setReadCnt400String(char[] value)  throws CFException{
		work.setReadCnt400(value);
	}	


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
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
        str += msgsRead600.hashCode();
        str += ichgFeeRecords500.hashCode();
        str += msgsWrite600.hashCode();
        str += internalTblCnt600.hashCode();
       return str.hashCode();
    }

    public CloseFilesOutCtx clone() {
        CloseFilesOutCtx cloneObj = new CloseFilesOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.msgsRead600 = new MsgsRead600();
        cloneObj.msgsRead600.set(msgsRead600.getClonedField());
        cloneObj.ichgFeeRecords500 = new IchgFeeRecords500();
        cloneObj.ichgFeeRecords500.set(ichgFeeRecords500.getClonedField());
        cloneObj.msgsWrite600 = new MsgsWrite600();
        cloneObj.msgsWrite600.set(msgsWrite600.getClonedField());
        cloneObj.internalTblCnt600 = new InternalTblCnt600();
        cloneObj.internalTblCnt600.set(internalTblCnt600.getClonedField());
        return cloneObj;
    }

    }

    public CloseFilesOutCtx getCloseFilesOutCtx() {
            return new CloseFilesOutCtx();
    }
     public class CloseSys001InCtx implements Cloneable {
     AbendMessage900 abendMessage900 = Ip088030Ctx.this.getAbendMessage900();
     AbendMessage600 abendMessage600 = Ip088030Ctx.this.getAbendMessage600();
     Work work = Ip088030Ctx.this.getWork();
     AbendPara900 abendPara900 = Ip088030Ctx.this.getAbendPara900();

	/**
	 *	Test condition "00" for isSys001IoGood88200()
	 *	@return  Returns true if isSys001IoGood88200() is "00"
	 */
   public boolean isSys001IoGood88200() throws CFException {
      return work.isSys001IoGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys001IoGood88200True()  throws CFException{  			
    	work.setSys001IoGood88200True();
   	}
	/**
	 *	Returns the value of abendMessage600
	 *	@return abendMessage600
	 */   
	 public AbendMessage600 getAbendMessage600() {
   	return abendMessage600;
   }


	/**
	 *	Returns the value of sys001FileStatus200
	 *	@return sys001FileStatus200
	 */
   public char[] getSys001FileStatus200() throws CFException  {              
   		return work.getSys001FileStatus200();
   }

  
	/**
	*  set variable sys001FileStatus200
	*  @param value
	**/
   public void setSys001FileStatus200(char[] value) throws CFException {
      work.setSys001FileStatus200(value);
   } 


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public CloseSys001OutCtx getCloseSys001OutCtx() {
            return new CloseSys001OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendMessage900.hashCode();
        str += abendMessage600.hashCode();
        str += work.hashCode();
        str += abendPara900.hashCode();
       return str.hashCode();
    }

    public CloseSys001InCtx clone() {
        CloseSys001InCtx cloneObj = new CloseSys001InCtx();
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        return cloneObj;
    }

    }

    public CloseSys001InCtx getCloseSys001InCtx() {
            return new CloseSys001InCtx();
    }
     public class CloseSys001OutCtx implements Cloneable {
     AbendMessage900 abendMessage900 = Ip088030Ctx.this.getAbendMessage900();
     AbendMessage600 abendMessage600 = Ip088030Ctx.this.getAbendMessage600();
     Work work = Ip088030Ctx.this.getWork();
     AbendPara900 abendPara900 = Ip088030Ctx.this.getAbendPara900();

	/**
	 *	Returns the value of fileStatus600
	 *	@return fileStatus600
	 */
   public char[] getFileStatus600() throws CFException  {              
   		return abendMessage600.getFileStatus600();
   }

  
	/**
	*  set variable fileStatus600
	*  @param value
	**/
   public void setFileStatus600(char[] value) throws CFException {
      abendMessage600.setFileStatus600(value);
   } 

     /**
	 * 	Update FileStatus600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileStatus600(char[] source, int sourceIndex) throws CFException {
      abendMessage600.setFileStatus600(source, sourceIndex);
   	
   }
   
   public void setFileStatus600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FileStatus600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileStatus600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FileStatus600 with another Field
	 *	@param value
	 */
   public void setFileStatus600(Field source) {
      abendMessage600.setFileStatus600(source);
   }  
   
     /**
	 * 	Update FileStatus600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileStatus600(Field source, int sourceIndex,int sourceLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FileStatus600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileStatus600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Test condition "3100-CLOSE-SYS001" for isAbendPara310088300()
	 *	@return  Returns true if isAbendPara310088300() is "3100-CLOSE-SYS001"
	 */
   public boolean isAbendPara310088300() throws CFException {
      return work.isAbendPara310088300();
   }

	/**
	*  set values "3100-CLOSE-SYS001"
	*/
   	public void setAbendPara310088300True()  throws CFException{  			
    	work.setAbendPara310088300True();
   	}
	/**
	 *	Returns the value of abendMessage600
	 *	@return abendMessage600
	 */   
	 public AbendMessage600 getAbendMessage600() {
   	return abendMessage600;
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
	 *	Returns the value of sys001FileStatus200
	 *	@return sys001FileStatus200
	 */
   public char[] getSys001FileStatus200() throws CFException  {              
   		return work.getSys001FileStatus200();
   }

  
	/**
	*  set variable sys001FileStatus200
	*  @param value
	**/
   public void setSys001FileStatus200(char[] value) throws CFException {
      work.setSys001FileStatus200(value);
   } 

	/**
	 *	Returns the value of abendCode300
	 *	@return abendCode300
	 */
	public int getAbendCode300() throws CFException {
   		return work.getAbendCode300();
	}


	/**
	 *	Returns String value of abendCode300
	 *	@return abendCode300
	 */
	public char[]  getAbendCode300String() throws CFException {
	     return String.valueOf(work.getAbendCode300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode300IsNumeric()  throws CFException{
	    return work.abendCode300IsNumeric();
	}

	/**
	 * 	Update AbendCode300 with the passed value
	 *	@param number
	 */
	public void setAbendCode300(int number)  throws CFException{
		work.setAbendCode300(number);
	}
	

	public void setAbendCode300(long number)  throws CFException{
	    work.setAbendCode300(number);
	}
	
	
	/**
	 * 	Update AbendCode300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode300(char[] value)  throws CFException {
		work.setAbendCode300(value);
	}
	
	/**
	 * 	Update AbendCode300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode300String(char[] value)  throws CFException{
		work.setAbendCode300(value);
	}	

	/**
	 *	Test condition "ERROR CLOSING SYS001-FILE" for isAbendCloseSys00188600()
	 *	@return  Returns true if isAbendCloseSys00188600() is "ERROR CLOSING SYS001-FILE"
	 */
   public boolean isAbendCloseSys00188600() throws CFException {
      return abendMessage600.isAbendCloseSys00188600();
   }

	/**
	*  set values "ERROR CLOSING SYS001-FILE"
	*/
   	public void setAbendCloseSys00188600True()  throws CFException{  			
    	abendMessage600.setAbendCloseSys00188600True();
   	}
	/**
	 *	Returns the value of abendParaName300
	 *	@return abendParaName300
	 */
   public char[] getAbendParaName300() throws CFException  {              
   		return work.getAbendParaName300();
   }

  
	/**
	*  set variable abendParaName300
	*  @param value
	**/
   public void setAbendParaName300(char[] value) throws CFException {
      work.setAbendParaName300(value);
   } 

	/**
	 *	Test condition 3004 for isCloseAbendCode88300()
	 *	@return  Returns true if isCloseAbendCode88300() is 3004
	 */
   public boolean isCloseAbendCode88300() throws CFException {
      return work.isCloseAbendCode88300();
   }

	/**
	*  set values 3004
	*/
   	public void setCloseAbendCode88300True()  throws CFException{  			
    	work.setCloseAbendCode88300True();
   	}

        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendMessage900.hashCode();
        str += abendMessage600.hashCode();
        str += work.hashCode();
        str += abendPara900.hashCode();
       return str.hashCode();
    }

    public CloseSys001OutCtx clone() {
        CloseSys001OutCtx cloneObj = new CloseSys001OutCtx();
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        return cloneObj;
    }

    }

    public CloseSys001OutCtx getCloseSys001OutCtx() {
            return new CloseSys001OutCtx();
    }
     public class CloseSys002InCtx implements Cloneable {
     AbendMessage900 abendMessage900 = Ip088030Ctx.this.getAbendMessage900();
     AbendMessage600 abendMessage600 = Ip088030Ctx.this.getAbendMessage600();
     Work work = Ip088030Ctx.this.getWork();
     AbendPara900 abendPara900 = Ip088030Ctx.this.getAbendPara900();

	/**
	 *	Returns the value of sys002FileStatus200
	 *	@return sys002FileStatus200
	 */
   public char[] getSys002FileStatus200() throws CFException  {              
   		return work.getSys002FileStatus200();
   }

  
	/**
	*  set variable sys002FileStatus200
	*  @param value
	**/
   public void setSys002FileStatus200(char[] value) throws CFException {
      work.setSys002FileStatus200(value);
   } 

	/**
	 *	Returns the value of abendMessage600
	 *	@return abendMessage600
	 */   
	 public AbendMessage600 getAbendMessage600() {
   	return abendMessage600;
   }


	/**
	 *	Test condition "00" for isSys002IoGood88200()
	 *	@return  Returns true if isSys002IoGood88200() is "00"
	 */
   public boolean isSys002IoGood88200() throws CFException {
      return work.isSys002IoGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys002IoGood88200True()  throws CFException{  			
    	work.setSys002IoGood88200True();
   	}

        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public CloseSys002OutCtx getCloseSys002OutCtx() {
            return new CloseSys002OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendMessage900.hashCode();
        str += abendMessage600.hashCode();
        str += work.hashCode();
        str += abendPara900.hashCode();
       return str.hashCode();
    }

    public CloseSys002InCtx clone() {
        CloseSys002InCtx cloneObj = new CloseSys002InCtx();
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        return cloneObj;
    }

    }

    public CloseSys002InCtx getCloseSys002InCtx() {
            return new CloseSys002InCtx();
    }
     public class CloseSys002OutCtx implements Cloneable {
     AbendMessage900 abendMessage900 = Ip088030Ctx.this.getAbendMessage900();
     AbendMessage600 abendMessage600 = Ip088030Ctx.this.getAbendMessage600();
     Work work = Ip088030Ctx.this.getWork();
     AbendPara900 abendPara900 = Ip088030Ctx.this.getAbendPara900();

	/**
	 *	Returns the value of fileStatus600
	 *	@return fileStatus600
	 */
   public char[] getFileStatus600() throws CFException  {              
   		return abendMessage600.getFileStatus600();
   }

  
	/**
	*  set variable fileStatus600
	*  @param value
	**/
   public void setFileStatus600(char[] value) throws CFException {
      abendMessage600.setFileStatus600(value);
   } 

     /**
	 * 	Update FileStatus600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileStatus600(char[] source, int sourceIndex) throws CFException {
      abendMessage600.setFileStatus600(source, sourceIndex);
   	
   }
   
   public void setFileStatus600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FileStatus600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileStatus600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FileStatus600 with another Field
	 *	@param value
	 */
   public void setFileStatus600(Field source) {
      abendMessage600.setFileStatus600(source);
   }  
   
     /**
	 * 	Update FileStatus600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileStatus600(Field source, int sourceIndex,int sourceLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FileStatus600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileStatus600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of sys002FileStatus200
	 *	@return sys002FileStatus200
	 */
   public char[] getSys002FileStatus200() throws CFException  {              
   		return work.getSys002FileStatus200();
   }

  
	/**
	*  set variable sys002FileStatus200
	*  @param value
	**/
   public void setSys002FileStatus200(char[] value) throws CFException {
      work.setSys002FileStatus200(value);
   } 

	/**
	 *	Returns the value of abendMessage600
	 *	@return abendMessage600
	 */   
	 public AbendMessage600 getAbendMessage600() {
   	return abendMessage600;
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
	 *	Returns the value of abendCode300
	 *	@return abendCode300
	 */
	public int getAbendCode300() throws CFException {
   		return work.getAbendCode300();
	}


	/**
	 *	Returns String value of abendCode300
	 *	@return abendCode300
	 */
	public char[]  getAbendCode300String() throws CFException {
	     return String.valueOf(work.getAbendCode300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode300IsNumeric()  throws CFException{
	    return work.abendCode300IsNumeric();
	}

	/**
	 * 	Update AbendCode300 with the passed value
	 *	@param number
	 */
	public void setAbendCode300(int number)  throws CFException{
		work.setAbendCode300(number);
	}
	

	public void setAbendCode300(long number)  throws CFException{
	    work.setAbendCode300(number);
	}
	
	
	/**
	 * 	Update AbendCode300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode300(char[] value)  throws CFException {
		work.setAbendCode300(value);
	}
	
	/**
	 * 	Update AbendCode300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode300String(char[] value)  throws CFException{
		work.setAbendCode300(value);
	}	

	/**
	 *	Test condition "ERROR CLOSING SYS002-FILE" for isAbendCloseSys00288600()
	 *	@return  Returns true if isAbendCloseSys00288600() is "ERROR CLOSING SYS002-FILE"
	 */
   public boolean isAbendCloseSys00288600() throws CFException {
      return abendMessage600.isAbendCloseSys00288600();
   }

	/**
	*  set values "ERROR CLOSING SYS002-FILE"
	*/
   	public void setAbendCloseSys00288600True()  throws CFException{  			
    	abendMessage600.setAbendCloseSys00288600True();
   	}
	/**
	 *	Returns the value of abendParaName300
	 *	@return abendParaName300
	 */
   public char[] getAbendParaName300() throws CFException  {              
   		return work.getAbendParaName300();
   }

  
	/**
	*  set variable abendParaName300
	*  @param value
	**/
   public void setAbendParaName300(char[] value) throws CFException {
      work.setAbendParaName300(value);
   } 

	/**
	 *	Test condition "3200-CLOSE-SYS002" for isAbendPara320088300()
	 *	@return  Returns true if isAbendPara320088300() is "3200-CLOSE-SYS002"
	 */
   public boolean isAbendPara320088300() throws CFException {
      return work.isAbendPara320088300();
   }

	/**
	*  set values "3200-CLOSE-SYS002"
	*/
   	public void setAbendPara320088300True()  throws CFException{  			
    	work.setAbendPara320088300True();
   	}
	/**
	 *	Test condition 3004 for isCloseAbendCode88300()
	 *	@return  Returns true if isCloseAbendCode88300() is 3004
	 */
   public boolean isCloseAbendCode88300() throws CFException {
      return work.isCloseAbendCode88300();
   }

	/**
	*  set values 3004
	*/
   	public void setCloseAbendCode88300True()  throws CFException{  			
    	work.setCloseAbendCode88300True();
   	}

        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendMessage900.hashCode();
        str += abendMessage600.hashCode();
        str += work.hashCode();
        str += abendPara900.hashCode();
       return str.hashCode();
    }

    public CloseSys002OutCtx clone() {
        CloseSys002OutCtx cloneObj = new CloseSys002OutCtx();
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        return cloneObj;
    }

    }

    public CloseSys002OutCtx getCloseSys002OutCtx() {
            return new CloseSys002OutCtx();
    }
     public class CloseSys201InCtx implements Cloneable {
     AbendMessage900 abendMessage900 = Ip088030Ctx.this.getAbendMessage900();
     AbendMessage600 abendMessage600 = Ip088030Ctx.this.getAbendMessage600();
     Work work = Ip088030Ctx.this.getWork();
     AbendPara900 abendPara900 = Ip088030Ctx.this.getAbendPara900();

	/**
	 *	Returns the value of sys201FileStatus200
	 *	@return sys201FileStatus200
	 */
   public char[] getSys201FileStatus200() throws CFException  {              
   		return work.getSys201FileStatus200();
   }

  
	/**
	*  set variable sys201FileStatus200
	*  @param value
	**/
   public void setSys201FileStatus200(char[] value) throws CFException {
      work.setSys201FileStatus200(value);
   } 

	/**
	 *	Returns the value of abendMessage600
	 *	@return abendMessage600
	 */   
	 public AbendMessage600 getAbendMessage600() {
   	return abendMessage600;
   }


	/**
	 *	Test condition "00" for isSys201IoGood88200()
	 *	@return  Returns true if isSys201IoGood88200() is "00"
	 */
   public boolean isSys201IoGood88200() throws CFException {
      return work.isSys201IoGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys201IoGood88200True()  throws CFException{  			
    	work.setSys201IoGood88200True();
   	}

        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public CloseSys201OutCtx getCloseSys201OutCtx() {
            return new CloseSys201OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendMessage900.hashCode();
        str += abendMessage600.hashCode();
        str += work.hashCode();
        str += abendPara900.hashCode();
       return str.hashCode();
    }

    public CloseSys201InCtx clone() {
        CloseSys201InCtx cloneObj = new CloseSys201InCtx();
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        return cloneObj;
    }

    }

    public CloseSys201InCtx getCloseSys201InCtx() {
            return new CloseSys201InCtx();
    }
     public class CloseSys201OutCtx implements Cloneable {
     AbendMessage900 abendMessage900 = Ip088030Ctx.this.getAbendMessage900();
     AbendMessage600 abendMessage600 = Ip088030Ctx.this.getAbendMessage600();
     Work work = Ip088030Ctx.this.getWork();
     AbendPara900 abendPara900 = Ip088030Ctx.this.getAbendPara900();

	/**
	 *	Returns the value of fileStatus600
	 *	@return fileStatus600
	 */
   public char[] getFileStatus600() throws CFException  {              
   		return abendMessage600.getFileStatus600();
   }

  
	/**
	*  set variable fileStatus600
	*  @param value
	**/
   public void setFileStatus600(char[] value) throws CFException {
      abendMessage600.setFileStatus600(value);
   } 

     /**
	 * 	Update FileStatus600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileStatus600(char[] source, int sourceIndex) throws CFException {
      abendMessage600.setFileStatus600(source, sourceIndex);
   	
   }
   
   public void setFileStatus600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FileStatus600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileStatus600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FileStatus600 with another Field
	 *	@param value
	 */
   public void setFileStatus600(Field source) {
      abendMessage600.setFileStatus600(source);
   }  
   
     /**
	 * 	Update FileStatus600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileStatus600(Field source, int sourceIndex,int sourceLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FileStatus600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileStatus600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of sys201FileStatus200
	 *	@return sys201FileStatus200
	 */
   public char[] getSys201FileStatus200() throws CFException  {              
   		return work.getSys201FileStatus200();
   }

  
	/**
	*  set variable sys201FileStatus200
	*  @param value
	**/
   public void setSys201FileStatus200(char[] value) throws CFException {
      work.setSys201FileStatus200(value);
   } 

	/**
	 *	Returns the value of abendMessage600
	 *	@return abendMessage600
	 */   
	 public AbendMessage600 getAbendMessage600() {
   	return abendMessage600;
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
	 *	Returns the value of abendCode300
	 *	@return abendCode300
	 */
	public int getAbendCode300() throws CFException {
   		return work.getAbendCode300();
	}


	/**
	 *	Returns String value of abendCode300
	 *	@return abendCode300
	 */
	public char[]  getAbendCode300String() throws CFException {
	     return String.valueOf(work.getAbendCode300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode300IsNumeric()  throws CFException{
	    return work.abendCode300IsNumeric();
	}

	/**
	 * 	Update AbendCode300 with the passed value
	 *	@param number
	 */
	public void setAbendCode300(int number)  throws CFException{
		work.setAbendCode300(number);
	}
	

	public void setAbendCode300(long number)  throws CFException{
	    work.setAbendCode300(number);
	}
	
	
	/**
	 * 	Update AbendCode300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode300(char[] value)  throws CFException {
		work.setAbendCode300(value);
	}
	
	/**
	 * 	Update AbendCode300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode300String(char[] value)  throws CFException{
		work.setAbendCode300(value);
	}	

	/**
	 *	Test condition "3300-CLOSE-SYS201" for isAbendPara330088300()
	 *	@return  Returns true if isAbendPara330088300() is "3300-CLOSE-SYS201"
	 */
   public boolean isAbendPara330088300() throws CFException {
      return work.isAbendPara330088300();
   }

	/**
	*  set values "3300-CLOSE-SYS201"
	*/
   	public void setAbendPara330088300True()  throws CFException{  			
    	work.setAbendPara330088300True();
   	}
	/**
	 *	Returns the value of abendParaName300
	 *	@return abendParaName300
	 */
   public char[] getAbendParaName300() throws CFException  {              
   		return work.getAbendParaName300();
   }

  
	/**
	*  set variable abendParaName300
	*  @param value
	**/
   public void setAbendParaName300(char[] value) throws CFException {
      work.setAbendParaName300(value);
   } 

	/**
	 *	Test condition "ERROR CLOSING SYS201-FILE" for isAbendCloseSys20188600()
	 *	@return  Returns true if isAbendCloseSys20188600() is "ERROR CLOSING SYS201-FILE"
	 */
   public boolean isAbendCloseSys20188600() throws CFException {
      return abendMessage600.isAbendCloseSys20188600();
   }

	/**
	*  set values "ERROR CLOSING SYS201-FILE"
	*/
   	public void setAbendCloseSys20188600True()  throws CFException{  			
    	abendMessage600.setAbendCloseSys20188600True();
   	}
	/**
	 *	Test condition 3004 for isCloseAbendCode88300()
	 *	@return  Returns true if isCloseAbendCode88300() is 3004
	 */
   public boolean isCloseAbendCode88300() throws CFException {
      return work.isCloseAbendCode88300();
   }

	/**
	*  set values 3004
	*/
   	public void setCloseAbendCode88300True()  throws CFException{  			
    	work.setCloseAbendCode88300True();
   	}

        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendMessage900.hashCode();
        str += abendMessage600.hashCode();
        str += work.hashCode();
        str += abendPara900.hashCode();
       return str.hashCode();
    }

    public CloseSys201OutCtx clone() {
        CloseSys201OutCtx cloneObj = new CloseSys201OutCtx();
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        return cloneObj;
    }

    }

    public CloseSys201OutCtx getCloseSys201OutCtx() {
            return new CloseSys201OutCtx();
    }
     public class ReadSys001FileInCtx implements Cloneable {
     Sys001TjfIp370Rec sys001TjfIp370Rec = Ip088030Ctx.this.getSys001TjfIp370Rec();
     AbendMessage900 abendMessage900 = Ip088030Ctx.this.getAbendMessage900();
     AbendMessage600 abendMessage600 = Ip088030Ctx.this.getAbendMessage600();
     Work work = Ip088030Ctx.this.getWork();
     AbendPara900 abendPara900 = Ip088030Ctx.this.getAbendPara900();

	/**
	 *	Returns the value of abendMessage600
	 *	@return abendMessage600
	 */   
	 public AbendMessage600 getAbendMessage600() {
   	return abendMessage600;
   }


	/**
	 *	Returns the value of readCnt400
	 *	@return readCnt400
	 */
	public long getReadCnt400() throws CFException {
   		return work.getReadCnt400();
	}


	/**
	 *	Returns String value of readCnt400
	 *	@return readCnt400
	 */
	public char[]  getReadCnt400String() throws CFException {
	     return String.valueOf(work.getReadCnt400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean readCnt400IsNumeric()  throws CFException{
	    return work.readCnt400IsNumeric();
	}

	/**
	 * 	Update ReadCnt400 with the passed value
	 *	@param number
	 */
	public void setReadCnt400(long number)  throws CFException{
		work.setReadCnt400(number);
	}
	

	
	/**
	 * 	Update ReadCnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setReadCnt400(char[] value)  throws CFException {
		work.setReadCnt400(value);
	}
	
	/**
	 * 	Update ReadCnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setReadCnt400String(char[] value)  throws CFException{
		work.setReadCnt400(value);
	}	


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public ReadSys001FileOutCtx getReadSys001FileOutCtx() {
            return new ReadSys001FileOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001TjfIp370Rec.hashCode();
        str += abendMessage900.hashCode();
        str += abendMessage600.hashCode();
        str += work.hashCode();
        str += abendPara900.hashCode();
       return str.hashCode();
    }

    public ReadSys001FileInCtx clone() {
        ReadSys001FileInCtx cloneObj = new ReadSys001FileInCtx();
        cloneObj.sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        cloneObj.sys001TjfIp370Rec.set(sys001TjfIp370Rec.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        return cloneObj;
    }

    }

    public ReadSys001FileInCtx getReadSys001FileInCtx() {
            return new ReadSys001FileInCtx();
    }
     public class ReadSys001FileOutCtx implements Cloneable {
     Sys001TjfIp370Rec sys001TjfIp370Rec = Ip088030Ctx.this.getSys001TjfIp370Rec();
     AbendMessage900 abendMessage900 = Ip088030Ctx.this.getAbendMessage900();
     AbendMessage600 abendMessage600 = Ip088030Ctx.this.getAbendMessage600();
     Work work = Ip088030Ctx.this.getWork();
     AbendPara900 abendPara900 = Ip088030Ctx.this.getAbendPara900();

	/**
	 *	Test condition "00" for isSys001IoGood88200()
	 *	@return  Returns true if isSys001IoGood88200() is "00"
	 */
   public boolean isSys001IoGood88200() throws CFException {
      return work.isSys001IoGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys001IoGood88200True()  throws CFException{  			
    	work.setSys001IoGood88200True();
   	}
	/**
	 *	Returns the value of fileStatus600
	 *	@return fileStatus600
	 */
   public char[] getFileStatus600() throws CFException  {              
   		return abendMessage600.getFileStatus600();
   }

  
	/**
	*  set variable fileStatus600
	*  @param value
	**/
   public void setFileStatus600(char[] value) throws CFException {
      abendMessage600.setFileStatus600(value);
   } 

     /**
	 * 	Update FileStatus600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileStatus600(char[] source, int sourceIndex) throws CFException {
      abendMessage600.setFileStatus600(source, sourceIndex);
   	
   }
   
   public void setFileStatus600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FileStatus600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileStatus600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FileStatus600 with another Field
	 *	@param value
	 */
   public void setFileStatus600(Field source) {
      abendMessage600.setFileStatus600(source);
   }  
   
     /**
	 * 	Update FileStatus600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileStatus600(Field source, int sourceIndex,int sourceLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FileStatus600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileStatus600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Test condition "10" for isSys001Eof88200()
	 *	@return  Returns true if isSys001Eof88200() is "10"
	 */
   public boolean isSys001Eof88200() throws CFException {
      return work.isSys001Eof88200();
   }

	/**
	*  set values "10"
	*/
   	public void setSys001Eof88200True()  throws CFException{  			
    	work.setSys001Eof88200True();
   	}
	/**
	 *	Returns the value of abendMessage600
	 *	@return abendMessage600
	 */   
	 public AbendMessage600 getAbendMessage600() {
   	return abendMessage600;
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
	 *	Returns the value of sys001FileStatus200
	 *	@return sys001FileStatus200
	 */
   public char[] getSys001FileStatus200() throws CFException  {              
   		return work.getSys001FileStatus200();
   }

  
	/**
	*  set variable sys001FileStatus200
	*  @param value
	**/
   public void setSys001FileStatus200(char[] value) throws CFException {
      work.setSys001FileStatus200(value);
   } 

	/**
	 *	Test condition "8000-READ-SYS001-FILE" for isAbendPara800088300()
	 *	@return  Returns true if isAbendPara800088300() is "8000-READ-SYS001-FILE"
	 */
   public boolean isAbendPara800088300() throws CFException {
      return work.isAbendPara800088300();
   }

	/**
	*  set values "8000-READ-SYS001-FILE"
	*/
   	public void setAbendPara800088300True()  throws CFException{  			
    	work.setAbendPara800088300True();
   	}
	/**
	 *	Test condition "ERROR READING SYS001-FILE" for isAbendReadSys00188600()
	 *	@return  Returns true if isAbendReadSys00188600() is "ERROR READING SYS001-FILE"
	 */
   public boolean isAbendReadSys00188600() throws CFException {
      return abendMessage600.isAbendReadSys00188600();
   }

	/**
	*  set values "ERROR READING SYS001-FILE"
	*/
   	public void setAbendReadSys00188600True()  throws CFException{  			
    	abendMessage600.setAbendReadSys00188600True();
   	}
	/**
	 *	Test condition 3002 for isReadAbendCode88300()
	 *	@return  Returns true if isReadAbendCode88300() is 3002
	 */
   public boolean isReadAbendCode88300() throws CFException {
      return work.isReadAbendCode88300();
   }

	/**
	*  set values 3002
	*/
   	public void setReadAbendCode88300True()  throws CFException{  			
    	work.setReadAbendCode88300True();
   	}
	/**
	 *	Returns the value of abendParaName300
	 *	@return abendParaName300
	 */
   public char[] getAbendParaName300() throws CFException  {              
   		return work.getAbendParaName300();
   }

  
	/**
	*  set variable abendParaName300
	*  @param value
	**/
   public void setAbendParaName300(char[] value) throws CFException {
      work.setAbendParaName300(value);
   } 

	/**
	 *	Returns the value of sys001TjfIp370Rec
	 *	@return sys001TjfIp370Rec
	 */   
	 public Sys001TjfIp370Rec getSys001TjfIp370Rec() {
   	return sys001TjfIp370Rec;
   }


	/**
	 *	Returns the value of abendCode300
	 *	@return abendCode300
	 */
	public int getAbendCode300() throws CFException {
   		return work.getAbendCode300();
	}


	/**
	 *	Returns String value of abendCode300
	 *	@return abendCode300
	 */
	public char[]  getAbendCode300String() throws CFException {
	     return String.valueOf(work.getAbendCode300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode300IsNumeric()  throws CFException{
	    return work.abendCode300IsNumeric();
	}

	/**
	 * 	Update AbendCode300 with the passed value
	 *	@param number
	 */
	public void setAbendCode300(int number)  throws CFException{
		work.setAbendCode300(number);
	}
	

	public void setAbendCode300(long number)  throws CFException{
	    work.setAbendCode300(number);
	}
	
	
	/**
	 * 	Update AbendCode300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode300(char[] value)  throws CFException {
		work.setAbendCode300(value);
	}
	
	/**
	 * 	Update AbendCode300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode300String(char[] value)  throws CFException{
		work.setAbendCode300(value);
	}	

	/**
	 *	Returns the value of readCnt400
	 *	@return readCnt400
	 */
	public long getReadCnt400() throws CFException {
   		return work.getReadCnt400();
	}


	/**
	 *	Returns String value of readCnt400
	 *	@return readCnt400
	 */
	public char[]  getReadCnt400String() throws CFException {
	     return String.valueOf(work.getReadCnt400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean readCnt400IsNumeric()  throws CFException{
	    return work.readCnt400IsNumeric();
	}

	/**
	 * 	Update ReadCnt400 with the passed value
	 *	@param number
	 */
	public void setReadCnt400(long number)  throws CFException{
		work.setReadCnt400(number);
	}
	

	
	/**
	 * 	Update ReadCnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setReadCnt400(char[] value)  throws CFException {
		work.setReadCnt400(value);
	}
	
	/**
	 * 	Update ReadCnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setReadCnt400String(char[] value)  throws CFException{
		work.setReadCnt400(value);
	}	


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001TjfIp370Rec.hashCode();
        str += abendMessage900.hashCode();
        str += abendMessage600.hashCode();
        str += work.hashCode();
        str += abendPara900.hashCode();
       return str.hashCode();
    }

    public ReadSys001FileOutCtx clone() {
        ReadSys001FileOutCtx cloneObj = new ReadSys001FileOutCtx();
        cloneObj.sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        cloneObj.sys001TjfIp370Rec.set(sys001TjfIp370Rec.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        return cloneObj;
    }

    }

    public ReadSys001FileOutCtx getReadSys001FileOutCtx() {
            return new ReadSys001FileOutCtx();
    }
     public class ReadSys002FileInCtx implements Cloneable {
     Sys002CntlIchgRec sys002CntlIchgRec = Ip088030Ctx.this.getSys002CntlIchgRec();
     AbendMessage900 abendMessage900 = Ip088030Ctx.this.getAbendMessage900();
     AbendMessage600 abendMessage600 = Ip088030Ctx.this.getAbendMessage600();
     Work work = Ip088030Ctx.this.getWork();
     AbendPara900 abendPara900 = Ip088030Ctx.this.getAbendPara900();

	/**
	 *	Returns the value of abendMessage600
	 *	@return abendMessage600
	 */   
	 public AbendMessage600 getAbendMessage600() {
   	return abendMessage600;
   }



        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public ReadSys002FileOutCtx getReadSys002FileOutCtx() {
            return new ReadSys002FileOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys002CntlIchgRec.hashCode();
        str += abendMessage900.hashCode();
        str += abendMessage600.hashCode();
        str += work.hashCode();
        str += abendPara900.hashCode();
       return str.hashCode();
    }

    public ReadSys002FileInCtx clone() {
        ReadSys002FileInCtx cloneObj = new ReadSys002FileInCtx();
        cloneObj.sys002CntlIchgRec = new Sys002CntlIchgRec();
        cloneObj.sys002CntlIchgRec.set(sys002CntlIchgRec.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        return cloneObj;
    }

    }

    public ReadSys002FileInCtx getReadSys002FileInCtx() {
            return new ReadSys002FileInCtx();
    }
     public class ReadSys002FileOutCtx implements Cloneable {
     Sys002CntlIchgRec sys002CntlIchgRec = Ip088030Ctx.this.getSys002CntlIchgRec();
     AbendMessage900 abendMessage900 = Ip088030Ctx.this.getAbendMessage900();
     AbendMessage600 abendMessage600 = Ip088030Ctx.this.getAbendMessage600();
     Work work = Ip088030Ctx.this.getWork();
     AbendPara900 abendPara900 = Ip088030Ctx.this.getAbendPara900();

	/**
	 *	Returns the value of fileStatus600
	 *	@return fileStatus600
	 */
   public char[] getFileStatus600() throws CFException  {              
   		return abendMessage600.getFileStatus600();
   }

  
	/**
	*  set variable fileStatus600
	*  @param value
	**/
   public void setFileStatus600(char[] value) throws CFException {
      abendMessage600.setFileStatus600(value);
   } 

     /**
	 * 	Update FileStatus600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileStatus600(char[] source, int sourceIndex) throws CFException {
      abendMessage600.setFileStatus600(source, sourceIndex);
   	
   }
   
   public void setFileStatus600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FileStatus600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileStatus600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FileStatus600 with another Field
	 *	@param value
	 */
   public void setFileStatus600(Field source) {
      abendMessage600.setFileStatus600(source);
   }  
   
     /**
	 * 	Update FileStatus600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileStatus600(Field source, int sourceIndex,int sourceLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FileStatus600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileStatus600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage600.setFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of sys002FileStatus200
	 *	@return sys002FileStatus200
	 */
   public char[] getSys002FileStatus200() throws CFException  {              
   		return work.getSys002FileStatus200();
   }

  
	/**
	*  set variable sys002FileStatus200
	*  @param value
	**/
   public void setSys002FileStatus200(char[] value) throws CFException {
      work.setSys002FileStatus200(value);
   } 

	/**
	 *	Returns the value of abendMessage600
	 *	@return abendMessage600
	 */   
	 public AbendMessage600 getAbendMessage600() {
   	return abendMessage600;
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
	 *	Test condition "8100-READ-SYS002-FILE" for isAbendPara810088300()
	 *	@return  Returns true if isAbendPara810088300() is "8100-READ-SYS002-FILE"
	 */
   public boolean isAbendPara810088300() throws CFException {
      return work.isAbendPara810088300();
   }

	/**
	*  set values "8100-READ-SYS002-FILE"
	*/
   	public void setAbendPara810088300True()  throws CFException{  			
    	work.setAbendPara810088300True();
   	}
	/**
	 *	Test condition 3002 for isReadAbendCode88300()
	 *	@return  Returns true if isReadAbendCode88300() is 3002
	 */
   public boolean isReadAbendCode88300() throws CFException {
      return work.isReadAbendCode88300();
   }

	/**
	*  set values 3002
	*/
   	public void setReadAbendCode88300True()  throws CFException{  			
    	work.setReadAbendCode88300True();
   	}
	/**
	 *	Returns the value of abendParaName300
	 *	@return abendParaName300
	 */
   public char[] getAbendParaName300() throws CFException  {              
   		return work.getAbendParaName300();
   }

  
	/**
	*  set variable abendParaName300
	*  @param value
	**/
   public void setAbendParaName300(char[] value) throws CFException {
      work.setAbendParaName300(value);
   } 

	/**
	 *	Test condition "ERROR READING SYS002-FILE" for isAbendReadSys00288600()
	 *	@return  Returns true if isAbendReadSys00288600() is "ERROR READING SYS002-FILE"
	 */
   public boolean isAbendReadSys00288600() throws CFException {
      return abendMessage600.isAbendReadSys00288600();
   }

	/**
	*  set values "ERROR READING SYS002-FILE"
	*/
   	public void setAbendReadSys00288600True()  throws CFException{  			
    	abendMessage600.setAbendReadSys00288600True();
   	}
	/**
	 *	Test condition "10" for isSys002Eof88200()
	 *	@return  Returns true if isSys002Eof88200() is "10"
	 */
   public boolean isSys002Eof88200() throws CFException {
      return work.isSys002Eof88200();
   }

	/**
	*  set values "10"
	*/
   	public void setSys002Eof88200True()  throws CFException{  			
    	work.setSys002Eof88200True();
   	}
	/**
	 *	Returns the value of sys002CntlIchgRec
	 *	@return sys002CntlIchgRec
	 */   
	 public Sys002CntlIchgRec getSys002CntlIchgRec() {
   	return sys002CntlIchgRec;
   }


	/**
	 *	Returns the value of abendCode300
	 *	@return abendCode300
	 */
	public int getAbendCode300() throws CFException {
   		return work.getAbendCode300();
	}


	/**
	 *	Returns String value of abendCode300
	 *	@return abendCode300
	 */
	public char[]  getAbendCode300String() throws CFException {
	     return String.valueOf(work.getAbendCode300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode300IsNumeric()  throws CFException{
	    return work.abendCode300IsNumeric();
	}

	/**
	 * 	Update AbendCode300 with the passed value
	 *	@param number
	 */
	public void setAbendCode300(int number)  throws CFException{
		work.setAbendCode300(number);
	}
	

	public void setAbendCode300(long number)  throws CFException{
	    work.setAbendCode300(number);
	}
	
	
	/**
	 * 	Update AbendCode300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode300(char[] value)  throws CFException {
		work.setAbendCode300(value);
	}
	
	/**
	 * 	Update AbendCode300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode300String(char[] value)  throws CFException{
		work.setAbendCode300(value);
	}	

	/**
	 *	Test condition "00" for isSys002IoGood88200()
	 *	@return  Returns true if isSys002IoGood88200() is "00"
	 */
   public boolean isSys002IoGood88200() throws CFException {
      return work.isSys002IoGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys002IoGood88200True()  throws CFException{  			
    	work.setSys002IoGood88200True();
   	}

        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys002CntlIchgRec.hashCode();
        str += abendMessage900.hashCode();
        str += abendMessage600.hashCode();
        str += work.hashCode();
        str += abendPara900.hashCode();
       return str.hashCode();
    }

    public ReadSys002FileOutCtx clone() {
        ReadSys002FileOutCtx cloneObj = new ReadSys002FileOutCtx();
        cloneObj.sys002CntlIchgRec = new Sys002CntlIchgRec();
        cloneObj.sys002CntlIchgRec.set(sys002CntlIchgRec.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendMessage600 = new AbendMessage600();
        cloneObj.abendMessage600.set(abendMessage600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        return cloneObj;
    }

    }

    public ReadSys002FileOutCtx getReadSys002FileOutCtx() {
            return new ReadSys002FileOutCtx();
    }
     public class DetermineTxnTypeInCtx implements Cloneable {
     Work work = Ip088030Ctx.this.getWork();
     HoldVariables800 holdVariables800 = Ip088030Ctx.this.getHoldVariables800();
     Ip00404Table ip00404Table = Ip088030Ctx.this.getIp00404Table();

	/**
	 *	Test condition "Y" for isTxnQualifyY88100()
	 *	@return  Returns true if isTxnQualifyY88100() is "Y"
	 */
   public boolean isTxnQualifyY88100() throws CFException {
      return work.isTxnQualifyY88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setTxnQualifyY88100True()  throws CFException{  			
    	work.setTxnQualifyY88100True();
   	}
	/**
	 *	Returns the value of fundPan800
	 *	@return fundPan800
	 */
   public char[] getFundPan800() throws CFException  {              
   		return holdVariables800.getFundPan800();
   }

  
	/**
	*  set variable fundPan800
	*  @param value
	**/
   public void setFundPan800(char[] value) throws CFException {
      holdVariables800.setFundPan800(value);
   } 

     /**
	 * 	Update FundPan800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFundPan800(char[] source, int sourceIndex) throws CFException {
      holdVariables800.setFundPan800(source, sourceIndex);
   	
   }
   
   public void setFundPan800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      holdVariables800.setFundPan800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FundPan800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFundPan800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setFundPan800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FundPan800 with another Field
	 *	@param value
	 */
   public void setFundPan800(Field source) {
      holdVariables800.setFundPan800(source);
   }  
   
     /**
	 * 	Update FundPan800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFundPan800(Field source, int sourceIndex,int sourceLen) {
      holdVariables800.setFundPan800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FundPan800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFundPan800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setFundPan800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of holdVariables800
	 *	@return holdVariables800
	 */   
	 public HoldVariables800 getHoldVariables800() {
   	return holdVariables800;
   }


	/**
	 *	Returns the value of ip00404Table
	 *	@return ip00404Table
	 */   
	 public Ip00404Table getIp00404Table() {
   	return ip00404Table;
   }


	/**
	 *	Test condition "Y" for isArRecFound88100()
	 *	@return  Returns true if isArRecFound88100() is "Y"
	 */
   public boolean isArRecFound88100() throws CFException {
      return work.isArRecFound88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setArRecFound88100True()  throws CFException{  			
    	work.setArRecFound88100True();
   	}

        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public DetermineTxnTypeOutCtx getDetermineTxnTypeOutCtx() {
            return new DetermineTxnTypeOutCtx();
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
        str += holdVariables800.hashCode();
        str += ip00404Table.hashCode();
       return str.hashCode();
    }

    public DetermineTxnTypeInCtx clone() {
        DetermineTxnTypeInCtx cloneObj = new DetermineTxnTypeInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.holdVariables800 = new HoldVariables800();
        cloneObj.holdVariables800.set(holdVariables800.getClonedField());
        cloneObj.ip00404Table = new Ip00404Table();
        cloneObj.ip00404Table.set(ip00404Table.getClonedField());
        return cloneObj;
    }

    }

    public DetermineTxnTypeInCtx getDetermineTxnTypeInCtx() {
            return new DetermineTxnTypeInCtx();
    }
     public class DetermineTxnTypeOutCtx implements Cloneable {
     HoldVariables800 holdVariables800 = Ip088030Ctx.this.getHoldVariables800();
     Work work = Ip088030Ctx.this.getWork();
     Ip00404Table ip00404Table = Ip088030Ctx.this.getIp00404Table();

	/**
	 *	Returns the value of fundPan800
	 *	@return fundPan800
	 */
   public char[] getFundPan800() throws CFException  {              
   		return holdVariables800.getFundPan800();
   }

  
	/**
	*  set variable fundPan800
	*  @param value
	**/
   public void setFundPan800(char[] value) throws CFException {
      holdVariables800.setFundPan800(value);
   } 

     /**
	 * 	Update FundPan800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFundPan800(char[] source, int sourceIndex) throws CFException {
      holdVariables800.setFundPan800(source, sourceIndex);
   	
   }
   
   public void setFundPan800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      holdVariables800.setFundPan800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FundPan800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFundPan800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setFundPan800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FundPan800 with another Field
	 *	@param value
	 */
   public void setFundPan800(Field source) {
      holdVariables800.setFundPan800(source);
   }  
   
     /**
	 * 	Update FundPan800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFundPan800(Field source, int sourceIndex,int sourceLen) {
      holdVariables800.setFundPan800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FundPan800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFundPan800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setFundPan800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prodId800
	 *	@return prodId800
	 */
   public char[] getProdId800() throws CFException  {              
   		return holdVariables800.getProdId800();
   }

  
	/**
	*  set variable prodId800
	*  @param value
	**/
   public void setProdId800(char[] value) throws CFException {
      holdVariables800.setProdId800(value);
   } 

     /**
	 * 	Update ProdId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProdId800(char[] source, int sourceIndex) throws CFException {
      holdVariables800.setProdId800(source, sourceIndex);
   	
   }
   
   public void setProdId800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      holdVariables800.setProdId800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ProdId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProdId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setProdId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ProdId800 with another Field
	 *	@param value
	 */
   public void setProdId800(Field source) {
      holdVariables800.setProdId800(source);
   }  
   
     /**
	 * 	Update ProdId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProdId800(Field source, int sourceIndex,int sourceLen) {
      holdVariables800.setProdId800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ProdId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProdId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setProdId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip00404Tbl40ArH
	 *	@return ip00404Tbl40ArH
	 */
   public char[] getIp00404Tbl40ArH() throws CFException  {              
   		return ip00404Table.getIp00404ArRangeGrp().getIp00404Tbl40ArH();
   }

  
	/**
	*  set variable ip00404Tbl40ArH
	*  @param value
	**/
   public void setIp00404Tbl40ArH(char[] value) throws CFException {
      ip00404Table.getIp00404ArRangeGrp().setIp00404Tbl40ArH(value);
   } 

     /**
	 * 	Update Ip00404Tbl40ArH 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404Tbl40ArH(char[] source, int sourceIndex) throws CFException {
      ip00404Table.getIp00404ArRangeGrp().setIp00404Tbl40ArH(source, sourceIndex);
   	
   }
   
   public void setIp00404Tbl40ArH(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00404Table.getIp00404ArRangeGrp().setIp00404Tbl40ArH(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00404Tbl40ArH 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404Tbl40ArH(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00404Table.getIp00404ArRangeGrp().setIp00404Tbl40ArH(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00404Tbl40ArH with another Field
	 *	@param value
	 */
   public void setIp00404Tbl40ArH(Field source) {
      ip00404Table.getIp00404ArRangeGrp().setIp00404Tbl40ArH(source);
   }  
   
     /**
	 * 	Update Ip00404Tbl40ArH 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404Tbl40ArH(Field source, int sourceIndex,int sourceLen) {
      ip00404Table.getIp00404ArRangeGrp().setIp00404Tbl40ArH(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00404Tbl40ArH 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404Tbl40ArH(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00404Table.getIp00404ArRangeGrp().setIp00404Tbl40ArH(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip00404Table
	 *	@return ip00404Table
	 */   
	 public Ip00404Table getIp00404Table() {
   	return ip00404Table;
   }



        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += holdVariables800.hashCode();
        str += work.hashCode();
        str += ip00404Table.hashCode();
       return str.hashCode();
    }

    public DetermineTxnTypeOutCtx clone() {
        DetermineTxnTypeOutCtx cloneObj = new DetermineTxnTypeOutCtx();
        cloneObj.holdVariables800 = new HoldVariables800();
        cloneObj.holdVariables800.set(holdVariables800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip00404Table = new Ip00404Table();
        cloneObj.ip00404Table.set(ip00404Table.getClonedField());
        return cloneObj;
    }

    }

    public DetermineTxnTypeOutCtx getDetermineTxnTypeOutCtx() {
            return new DetermineTxnTypeOutCtx();
    }
     public class CallTbl40ApiInCtx implements Cloneable {
     Ip0040iAccountRangeInfo ip0040iAccountRangeInfo = Ip088030Ctx.this.getIp0040iAccountRangeInfo();
     Work work = Ip088030Ctx.this.getWork();
     HoldVariables800 holdVariables800 = Ip088030Ctx.this.getHoldVariables800();
     Ip00404Table ip00404Table = Ip088030Ctx.this.getIp00404Table();

	/**
	 *	Returns the value of ptrIp280010800
	 *	@return ptrIp280010800
	 */
   public char[] getPtrIp280010800() throws CFException  {              
   		return work.getPtrIp280010800();
   }

  
	/**
	*  set variable ptrIp280010800
	*  @param value
	**/
   public void setPtrIp280010800(char[] value) throws CFException {
      work.setPtrIp280010800(value);
   } 

	/**
	 *	Returns the value of ip00404EntriesFoundCount
	 *	@return ip00404EntriesFoundCount
	 */
	public int getIp00404EntriesFoundCount() throws CFException {        
   		return ip00404Table.getIp00404EntriesFoundCount();
	}
	
	/**
	 * 	Update Ip00404EntriesFoundCount with the passed value
	 *	@param number
	 */
	public void setIp00404EntriesFoundCount(int number)  throws CFException{
		ip00404Table.setIp00404EntriesFoundCount(number);
	}


	public void setIp00404EntriesFoundCount(long number)  throws CFException{
		ip00404Table.setIp00404EntriesFoundCount((int)number);
	}


	/**
	 *	Returns the value of ip00404Entry
	 *	@return ip00404Entry
	 */   
	 public Ip00404Entry getIp00404Entry(int index) {
   	return ip00404Table.getIp00404ArRangeEntries().getIp00404Entry(index);
   }

    public List<Ip00404Entry> getIp00404Entry() {
        return ip00404Table.getIp00404ArRangeEntries().getIp00404Entry();
    }
   /**
	* 	Update Ip00404Entry with the passed value
	*	@param value
	*/
   public void setIp00404Entry(int index,char[] value) throws CFException {
      ip00404Table.getIp00404ArRangeEntries().setIp00404Entry((index),value);
   }   



public void setIp00404AcctRngIndex(int ip00404AcctRngIndex) { 
    Ip088030Ctx.this.ip00404AcctRngIndex = ip00404AcctRngIndex;
}

public int getIp00404AcctRngIndex() { 
    return Ip088030Ctx.this.ip00404AcctRngIndex;
}
	/**
	 *	Returns the value of ip00404Ab
	 *	@return ip00404Ab
	 */
   public char[] getIp00404Ab(int index) throws CFException  {              
   		return ip00404Table.getIp00404ArRangeEntries().getIp00404Entry(index).getIp00404MpePeRecData().getIp00404Ab();
   }

  
	/**
	*  set variable ip00404Ab
	*  @param value
	**/
   public void setIp00404Ab(int index,char[] value) throws CFException {
      ip00404Table.getIp00404ArRangeEntries().getIp00404Entry(index).getIp00404MpePeRecData().setIp00404Ab(value);
   } 

     /**
	 * 	Update Ip00404Ab 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00404Ab(int index,char[] source, int sourceIndex) throws CFException {
      ip00404Table.getIp00404ArRangeEntries().getIp00404Entry(index).getIp00404MpePeRecData().setIp00404Ab(source, sourceIndex);
   	
   }
   
   public void setIp00404Ab(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00404Table.getIp00404ArRangeEntries().getIp00404Entry(index).getIp00404MpePeRecData().setIp00404Ab(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00404Ab 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00404Ab(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00404Table.getIp00404ArRangeEntries().getIp00404Entry(index).getIp00404MpePeRecData().setIp00404Ab(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00404Ab with another Field
	 *	@param value
	 */
   public void setIp00404Ab(int index,Field source) {
      ip00404Table.getIp00404ArRangeEntries().getIp00404Entry(index).getIp00404MpePeRecData().setIp00404Ab(source);
   }  
   
     /**
	 * 	Update Ip00404Ab 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00404Ab(int index,Field source, int sourceIndex,int sourceLen) {
      ip00404Table.getIp00404ArRangeEntries().getIp00404Entry(index).getIp00404MpePeRecData().setIp00404Ab(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00404Ab 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00404Ab(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00404Table.getIp00404ArRangeEntries().getIp00404Entry(index).getIp00404MpePeRecData().setIp00404Ab(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public CallTbl40ApiOutCtx getCallTbl40ApiOutCtx() {
            return new CallTbl40ApiOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip0040iAccountRangeInfo.hashCode();
        str += work.hashCode();
        str += holdVariables800.hashCode();
        str += ip00404Table.hashCode();
       return str.hashCode();
    }

    public CallTbl40ApiInCtx clone() {
        CallTbl40ApiInCtx cloneObj = new CallTbl40ApiInCtx();
        cloneObj.ip0040iAccountRangeInfo = new Ip0040iAccountRangeInfo();
        cloneObj.ip0040iAccountRangeInfo.set(ip0040iAccountRangeInfo.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.holdVariables800 = new HoldVariables800();
        cloneObj.holdVariables800.set(holdVariables800.getClonedField());
        cloneObj.ip00404Table = new Ip00404Table();
        cloneObj.ip00404Table.set(ip00404Table.getClonedField());
        return cloneObj;
    }

    }

    public CallTbl40ApiInCtx getCallTbl40ApiInCtx() {
            return new CallTbl40ApiInCtx();
    }
     public class CallTbl40ApiOutCtx implements Cloneable {
     Ip0040iAccountRangeInfo ip0040iAccountRangeInfo = Ip088030Ctx.this.getIp0040iAccountRangeInfo();
     Work work = Ip088030Ctx.this.getWork();
     HoldVariables800 holdVariables800 = Ip088030Ctx.this.getHoldVariables800();
     Ip00404Table ip00404Table = Ip088030Ctx.this.getIp00404Table();

	/**
	 *	Returns the value of fundProdId800
	 *	@return fundProdId800
	 */
   public char[] getFundProdId800() throws CFException  {              
   		return holdVariables800.getFundProdId800();
   }

  
	/**
	*  set variable fundProdId800
	*  @param value
	**/
   public void setFundProdId800(char[] value) throws CFException {
      holdVariables800.setFundProdId800(value);
   } 

     /**
	 * 	Update FundProdId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFundProdId800(char[] source, int sourceIndex) throws CFException {
      holdVariables800.setFundProdId800(source, sourceIndex);
   	
   }
   
   public void setFundProdId800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      holdVariables800.setFundProdId800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FundProdId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFundProdId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setFundProdId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FundProdId800 with another Field
	 *	@param value
	 */
   public void setFundProdId800(Field source) {
      holdVariables800.setFundProdId800(source);
   }  
   
     /**
	 * 	Update FundProdId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFundProdId800(Field source, int sourceIndex,int sourceLen) {
      holdVariables800.setFundProdId800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FundProdId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFundProdId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setFundProdId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prodId800
	 *	@return prodId800
	 */
   public char[] getProdId800() throws CFException  {              
   		return holdVariables800.getProdId800();
   }

  
	/**
	*  set variable prodId800
	*  @param value
	**/
   public void setProdId800(char[] value) throws CFException {
      holdVariables800.setProdId800(value);
   } 

     /**
	 * 	Update ProdId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProdId800(char[] source, int sourceIndex) throws CFException {
      holdVariables800.setProdId800(source, sourceIndex);
   	
   }
   
   public void setProdId800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      holdVariables800.setProdId800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ProdId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProdId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setProdId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ProdId800 with another Field
	 *	@param value
	 */
   public void setProdId800(Field source) {
      holdVariables800.setProdId800(source);
   }  
   
     /**
	 * 	Update ProdId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProdId800(Field source, int sourceIndex,int sourceLen) {
      holdVariables800.setProdId800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ProdId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProdId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setProdId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip0040iAccountRangeInfo
	 *	@return ip0040iAccountRangeInfo
	 */   
	 public Ip0040iAccountRangeInfo getIp0040iAccountRangeInfo() {
   	return ip0040iAccountRangeInfo;
   }


	/**
	 *	Returns the value of ip00404Entry
	 *	@return ip00404Entry
	 */   
	 public Ip00404Entry getIp00404Entry(int index) {
   	return ip00404Table.getIp00404ArRangeEntries().getIp00404Entry(index);
   }

    public List<Ip00404Entry> getIp00404Entry() {
        return ip00404Table.getIp00404ArRangeEntries().getIp00404Entry();
    }
   /**
	* 	Update Ip00404Entry with the passed value
	*	@param value
	*/
   public void setIp00404Entry(int index,char[] value) throws CFException {
      ip00404Table.getIp00404ArRangeEntries().setIp00404Entry((index),value);
   }   



public void setIp00404AcctRngIndex(int ip00404AcctRngIndex) { 
    Ip088030Ctx.this.ip00404AcctRngIndex = ip00404AcctRngIndex;
}

public int getIp00404AcctRngIndex() { 
    return Ip088030Ctx.this.ip00404AcctRngIndex;
}
	/**
	 *	Test condition "Y" for isArRecFound88100()
	 *	@return  Returns true if isArRecFound88100() is "Y"
	 */
   public boolean isArRecFound88100() throws CFException {
      return work.isArRecFound88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setArRecFound88100True()  throws CFException{  			
    	work.setArRecFound88100True();
   	}
	/**
	 *	Returns the value of ip0040iProdId
	 *	@return ip0040iProdId
	 */
   public char[] getIp0040iProdId() throws CFException  {              
   		return ip0040iAccountRangeInfo.getIp0040iMpePeRecData().getIp0040iProdId();
   }

  
	/**
	*  set variable ip0040iProdId
	*  @param value
	**/
   public void setIp0040iProdId(char[] value) throws CFException {
      ip0040iAccountRangeInfo.getIp0040iMpePeRecData().setIp0040iProdId(value);
   } 

     /**
	 * 	Update Ip0040iProdId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iProdId(char[] source, int sourceIndex) throws CFException {
      ip0040iAccountRangeInfo.getIp0040iMpePeRecData().setIp0040iProdId(source, sourceIndex);
   	
   }
   
   public void setIp0040iProdId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip0040iAccountRangeInfo.getIp0040iMpePeRecData().setIp0040iProdId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip0040iProdId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iProdId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip0040iAccountRangeInfo.getIp0040iMpePeRecData().setIp0040iProdId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip0040iProdId with another Field
	 *	@param value
	 */
   public void setIp0040iProdId(Field source) {
      ip0040iAccountRangeInfo.getIp0040iMpePeRecData().setIp0040iProdId(source);
   }  
   
     /**
	 * 	Update Ip0040iProdId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iProdId(Field source, int sourceIndex,int sourceLen) {
      ip0040iAccountRangeInfo.getIp0040iMpePeRecData().setIp0040iProdId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip0040iProdId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iProdId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip0040iAccountRangeInfo.getIp0040iMpePeRecData().setIp0040iProdId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip0040iAccountRangeInfo.hashCode();
        str += work.hashCode();
        str += holdVariables800.hashCode();
        str += ip00404Table.hashCode();
       return str.hashCode();
    }

    public CallTbl40ApiOutCtx clone() {
        CallTbl40ApiOutCtx cloneObj = new CallTbl40ApiOutCtx();
        cloneObj.ip0040iAccountRangeInfo = new Ip0040iAccountRangeInfo();
        cloneObj.ip0040iAccountRangeInfo.set(ip0040iAccountRangeInfo.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.holdVariables800 = new HoldVariables800();
        cloneObj.holdVariables800.set(holdVariables800.getClonedField());
        cloneObj.ip00404Table = new Ip00404Table();
        cloneObj.ip00404Table.set(ip00404Table.getClonedField());
        return cloneObj;
    }

    }

    public CallTbl40ApiOutCtx getCallTbl40ApiOutCtx() {
            return new CallTbl40ApiOutCtx();
    }
     public class CallTbl16ApiInCtx implements Cloneable {
     Sys001TjfIp370Rec sys001TjfIp370Rec = Ip088030Ctx.this.getSys001TjfIp370Rec();
     Ip0040iAccountRangeInfo ip0040iAccountRangeInfo = Ip088030Ctx.this.getIp0040iAccountRangeInfo();
     Ip00164EntryFoundGroup ip00164EntryFoundGroup = Ip088030Ctx.this.getIp00164EntryFoundGroup();
     Work work = Ip088030Ctx.this.getWork();
     HoldVariables800 holdVariables800 = Ip088030Ctx.this.getHoldVariables800();
     Ip00164TableEntry ip00164TableEntry = Ip088030Ctx.this.getIp00164TableEntry();

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
	 *	Returns the value of ptrIp280510800
	 *	@return ptrIp280510800
	 */
   public char[] getPtrIp280510800() throws CFException  {              
   		return work.getPtrIp280510800();
   }

  
	/**
	*  set variable ptrIp280510800
	*  @param value
	**/
   public void setPtrIp280510800(char[] value) throws CFException {
      work.setPtrIp280510800(value);
   } 

	/**
	 *	Returns the value of valueD300
	 *	@return valueD300
	 */
   public char[] getValueD300() throws CFException  {              
   		return work.getValueD300();
   }

  
	/**
	*  set variable valueD300
	*  @param value
	**/
   public void setValueD300(char[] value) throws CFException {
      work.setValueD300(value);
   } 

	/**
	 *	Returns the value of ip00164ProdCatCd
	 *	@return ip00164ProdCatCd
	 */
   public char[] getIp00164ProdCatCd() throws CFException  {              
   		return ip00164TableEntry.getIp00164TableData().getIp00164ProdCatCd();
   }

  
	/**
	*  set variable ip00164ProdCatCd
	*  @param value
	**/
   public void setIp00164ProdCatCd(char[] value) throws CFException {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(value);
   } 

     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00164ProdCatCd(char[] source, int sourceIndex) throws CFException {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex);
   	
   }
   
   public void setIp00164ProdCatCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00164ProdCatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00164ProdCatCd with another Field
	 *	@param value
	 */
   public void setIp00164ProdCatCd(Field source) {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source);
   }  
   
     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00164ProdCatCd(Field source, int sourceIndex,int sourceLen) {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00164ProdCatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip0040iLicensedProdId
	 *	@return ip0040iLicensedProdId
	 */
   public char[] getIp0040iLicensedProdId() throws CFException  {              
   		return ip0040iAccountRangeInfo.getIp0040iMpePeRecDataCs().getIp0040iLicensedProdId();
   }

  
	/**
	*  set variable ip0040iLicensedProdId
	*  @param value
	**/
   public void setIp0040iLicensedProdId(char[] value) throws CFException {
      ip0040iAccountRangeInfo.getIp0040iMpePeRecDataCs().setIp0040iLicensedProdId(value);
   } 

     /**
	 * 	Update Ip0040iLicensedProdId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iLicensedProdId(char[] source, int sourceIndex) throws CFException {
      ip0040iAccountRangeInfo.getIp0040iMpePeRecDataCs().setIp0040iLicensedProdId(source, sourceIndex);
   	
   }
   
   public void setIp0040iLicensedProdId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip0040iAccountRangeInfo.getIp0040iMpePeRecDataCs().setIp0040iLicensedProdId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip0040iLicensedProdId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iLicensedProdId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip0040iAccountRangeInfo.getIp0040iMpePeRecDataCs().setIp0040iLicensedProdId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip0040iLicensedProdId with another Field
	 *	@param value
	 */
   public void setIp0040iLicensedProdId(Field source) {
      ip0040iAccountRangeInfo.getIp0040iMpePeRecDataCs().setIp0040iLicensedProdId(source);
   }  
   
     /**
	 * 	Update Ip0040iLicensedProdId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iLicensedProdId(Field source, int sourceIndex,int sourceLen) {
      ip0040iAccountRangeInfo.getIp0040iMpePeRecDataCs().setIp0040iLicensedProdId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip0040iLicensedProdId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iLicensedProdId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip0040iAccountRangeInfo.getIp0040iMpePeRecDataCs().setIp0040iLicensedProdId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "Y" for isIp00164EntryFoundY88()
	 *	@return  Returns true if isIp00164EntryFoundY88() is "Y"
	 */
   public boolean isIp00164EntryFoundY88() throws CFException {
      return ip00164EntryFoundGroup.isIp00164EntryFoundY88();
   }

	/**
	*  set values "Y"
	*/
   	public void setIp00164EntryFoundY88True()  throws CFException{  			
    	ip00164EntryFoundGroup.setIp00164EntryFoundY88True();
   	}

        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public CallTbl16ApiOutCtx getCallTbl16ApiOutCtx() {
            return new CallTbl16ApiOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001TjfIp370Rec.hashCode();
        str += ip0040iAccountRangeInfo.hashCode();
        str += ip00164EntryFoundGroup.hashCode();
        str += work.hashCode();
        str += holdVariables800.hashCode();
        str += ip00164TableEntry.hashCode();
       return str.hashCode();
    }

    public CallTbl16ApiInCtx clone() {
        CallTbl16ApiInCtx cloneObj = new CallTbl16ApiInCtx();
        cloneObj.sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        cloneObj.sys001TjfIp370Rec.set(sys001TjfIp370Rec.getClonedField());
        cloneObj.ip0040iAccountRangeInfo = new Ip0040iAccountRangeInfo();
        cloneObj.ip0040iAccountRangeInfo.set(ip0040iAccountRangeInfo.getClonedField());
        cloneObj.ip00164EntryFoundGroup = new Ip00164EntryFoundGroup();
        cloneObj.ip00164EntryFoundGroup.set(ip00164EntryFoundGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.holdVariables800 = new HoldVariables800();
        cloneObj.holdVariables800.set(holdVariables800.getClonedField());
        cloneObj.ip00164TableEntry = new Ip00164TableEntry();
        cloneObj.ip00164TableEntry.set(ip00164TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public CallTbl16ApiInCtx getCallTbl16ApiInCtx() {
            return new CallTbl16ApiInCtx();
    }
     public class CallTbl16ApiOutCtx implements Cloneable {
     Sys001TjfIp370Rec sys001TjfIp370Rec = Ip088030Ctx.this.getSys001TjfIp370Rec();
     Ip0040iAccountRangeInfo ip0040iAccountRangeInfo = Ip088030Ctx.this.getIp0040iAccountRangeInfo();
     Work work = Ip088030Ctx.this.getWork();
     Ip00164EntryFoundGroup ip00164EntryFoundGroup = Ip088030Ctx.this.getIp00164EntryFoundGroup();
     HoldVariables800 holdVariables800 = Ip088030Ctx.this.getHoldVariables800();
     Ip00164TableEntry ip00164TableEntry = Ip088030Ctx.this.getIp00164TableEntry();

	/**
	 *	Test condition "Y" for isTxnQualifyY88100()
	 *	@return  Returns true if isTxnQualifyY88100() is "Y"
	 */
   public boolean isTxnQualifyY88100() throws CFException {
      return work.isTxnQualifyY88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setTxnQualifyY88100True()  throws CFException{  			
    	work.setTxnQualifyY88100True();
   	}
	/**
	 *	Returns the value of ip98152FundProdType
	 *	@return ip98152FundProdType
	 */
   public char[] getIp98152FundProdType() throws CFException  {              
   		return sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152FundProdType();
   }

  
	/**
	*  set variable ip98152FundProdType
	*  @param value
	**/
   public void setIp98152FundProdType(char[] value) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152FundProdType(value);
   } 

     /**
	 * 	Update Ip98152FundProdType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98152FundProdType(char[] source, int sourceIndex) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152FundProdType(source, sourceIndex);
   	
   }
   
   public void setIp98152FundProdType(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152FundProdType(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98152FundProdType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98152FundProdType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152FundProdType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98152FundProdType with another Field
	 *	@param value
	 */
   public void setIp98152FundProdType(Field source) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152FundProdType(source);
   }  
   
     /**
	 * 	Update Ip98152FundProdType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98152FundProdType(Field source, int sourceIndex,int sourceLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152FundProdType(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip98152FundProdType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98152FundProdType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152FundProdType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prodId800
	 *	@return prodId800
	 */
   public char[] getProdId800() throws CFException  {              
   		return holdVariables800.getProdId800();
   }

  
	/**
	*  set variable prodId800
	*  @param value
	**/
   public void setProdId800(char[] value) throws CFException {
      holdVariables800.setProdId800(value);
   } 

     /**
	 * 	Update ProdId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProdId800(char[] source, int sourceIndex) throws CFException {
      holdVariables800.setProdId800(source, sourceIndex);
   	
   }
   
   public void setProdId800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      holdVariables800.setProdId800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ProdId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProdId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setProdId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ProdId800 with another Field
	 *	@param value
	 */
   public void setProdId800(Field source) {
      holdVariables800.setProdId800(source);
   }  
   
     /**
	 * 	Update ProdId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProdId800(Field source, int sourceIndex,int sourceLen) {
      holdVariables800.setProdId800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ProdId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProdId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setProdId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip00164ProdCatCd
	 *	@return ip00164ProdCatCd
	 */
   public char[] getIp00164ProdCatCd() throws CFException  {              
   		return ip00164TableEntry.getIp00164TableData().getIp00164ProdCatCd();
   }

  
	/**
	*  set variable ip00164ProdCatCd
	*  @param value
	**/
   public void setIp00164ProdCatCd(char[] value) throws CFException {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(value);
   } 

     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00164ProdCatCd(char[] source, int sourceIndex) throws CFException {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex);
   	
   }
   
   public void setIp00164ProdCatCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00164ProdCatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00164ProdCatCd with another Field
	 *	@param value
	 */
   public void setIp00164ProdCatCd(Field source) {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source);
   }  
   
     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00164ProdCatCd(Field source, int sourceIndex,int sourceLen) {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00164ProdCatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip0040iLicensedProdId
	 *	@return ip0040iLicensedProdId
	 */
   public char[] getIp0040iLicensedProdId() throws CFException  {              
   		return ip0040iAccountRangeInfo.getIp0040iMpePeRecDataCs().getIp0040iLicensedProdId();
   }

  
	/**
	*  set variable ip0040iLicensedProdId
	*  @param value
	**/
   public void setIp0040iLicensedProdId(char[] value) throws CFException {
      ip0040iAccountRangeInfo.getIp0040iMpePeRecDataCs().setIp0040iLicensedProdId(value);
   } 

     /**
	 * 	Update Ip0040iLicensedProdId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0040iLicensedProdId(char[] source, int sourceIndex) throws CFException {
      ip0040iAccountRangeInfo.getIp0040iMpePeRecDataCs().setIp0040iLicensedProdId(source, sourceIndex);
   	
   }
   
   public void setIp0040iLicensedProdId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip0040iAccountRangeInfo.getIp0040iMpePeRecDataCs().setIp0040iLicensedProdId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip0040iLicensedProdId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iLicensedProdId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip0040iAccountRangeInfo.getIp0040iMpePeRecDataCs().setIp0040iLicensedProdId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip0040iLicensedProdId with another Field
	 *	@param value
	 */
   public void setIp0040iLicensedProdId(Field source) {
      ip0040iAccountRangeInfo.getIp0040iMpePeRecDataCs().setIp0040iLicensedProdId(source);
   }  
   
     /**
	 * 	Update Ip0040iLicensedProdId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0040iLicensedProdId(Field source, int sourceIndex,int sourceLen) {
      ip0040iAccountRangeInfo.getIp0040iMpePeRecDataCs().setIp0040iLicensedProdId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip0040iLicensedProdId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040iLicensedProdId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip0040iAccountRangeInfo.getIp0040iMpePeRecDataCs().setIp0040iLicensedProdId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip00164LicensedProdId
	 *	@return ip00164LicensedProdId
	 */
   public char[] getIp00164LicensedProdId() throws CFException  {              
   		return ip00164TableEntry.getIp00164TableData().getIp00164LicensedProdId();
   }

  
	/**
	*  set variable ip00164LicensedProdId
	*  @param value
	**/
   public void setIp00164LicensedProdId(char[] value) throws CFException {
      ip00164TableEntry.getIp00164TableData().setIp00164LicensedProdId(value);
   } 

     /**
	 * 	Update Ip00164LicensedProdId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00164LicensedProdId(char[] source, int sourceIndex) throws CFException {
      ip00164TableEntry.getIp00164TableData().setIp00164LicensedProdId(source, sourceIndex);
   	
   }
   
   public void setIp00164LicensedProdId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00164TableEntry.getIp00164TableData().setIp00164LicensedProdId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00164LicensedProdId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00164LicensedProdId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00164TableEntry.getIp00164TableData().setIp00164LicensedProdId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00164LicensedProdId with another Field
	 *	@param value
	 */
   public void setIp00164LicensedProdId(Field source) {
      ip00164TableEntry.getIp00164TableData().setIp00164LicensedProdId(source);
   }  
   
     /**
	 * 	Update Ip00164LicensedProdId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00164LicensedProdId(Field source, int sourceIndex,int sourceLen) {
      ip00164TableEntry.getIp00164TableData().setIp00164LicensedProdId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00164LicensedProdId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00164LicensedProdId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00164TableEntry.getIp00164TableData().setIp00164LicensedProdId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001TjfIp370Rec.hashCode();
        str += ip0040iAccountRangeInfo.hashCode();
        str += work.hashCode();
        str += ip00164EntryFoundGroup.hashCode();
        str += holdVariables800.hashCode();
        str += ip00164TableEntry.hashCode();
       return str.hashCode();
    }

    public CallTbl16ApiOutCtx clone() {
        CallTbl16ApiOutCtx cloneObj = new CallTbl16ApiOutCtx();
        cloneObj.sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        cloneObj.sys001TjfIp370Rec.set(sys001TjfIp370Rec.getClonedField());
        cloneObj.ip0040iAccountRangeInfo = new Ip0040iAccountRangeInfo();
        cloneObj.ip0040iAccountRangeInfo.set(ip0040iAccountRangeInfo.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip00164EntryFoundGroup = new Ip00164EntryFoundGroup();
        cloneObj.ip00164EntryFoundGroup.set(ip00164EntryFoundGroup.getClonedField());
        cloneObj.holdVariables800 = new HoldVariables800();
        cloneObj.holdVariables800.set(holdVariables800.getClonedField());
        cloneObj.ip00164TableEntry = new Ip00164TableEntry();
        cloneObj.ip00164TableEntry.set(ip00164TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public CallTbl16ApiOutCtx getCallTbl16ApiOutCtx() {
            return new CallTbl16ApiOutCtx();
    }
     public class CallCurrConvApiInCtx implements Cloneable {
     Sys001TjfIp370Rec sys001TjfIp370Rec = Ip088030Ctx.this.getSys001TjfIp370Rec();
     AbendMessage900 abendMessage900 = Ip088030Ctx.this.getAbendMessage900();
     Work work = Ip088030Ctx.this.getWork();
     AbendPara900 abendPara900 = Ip088030Ctx.this.getAbendPara900();
     SrceTrgCurExpErr0rMsg600 srceTrgCurExpErr0rMsg600 = Ip088030Ctx.this.getSrceTrgCurExpErr0rMsg600();
     Ip33701CurrConvInterface ip33701CurrConvInterface = Ip088030Ctx.this.getIp33701CurrConvInterface();

	/**
	 *	Returns the value of ip98152ClrFxDate
	 *	@return ip98152ClrFxDate
	 */
	public long getIp98152ClrFxDate() throws CFException {
   		return sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrFxDate();
	}


	/**
	 *	Returns String value of ip98152ClrFxDate
	 *	@return ip98152ClrFxDate
	 */
	public char[]  getIp98152ClrFxDateString() throws CFException {
	     return String.valueOf(sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrFxDateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip98152ClrFxDateIsNumeric()  throws CFException{
	    return sys001TjfIp370Rec.getIp98152RecordPart2().ip98152ClrFxDateIsNumeric();
	}

	/**
	 * 	Update Ip98152ClrFxDate with the passed value
	 *	@param number
	 */
	public void setIp98152ClrFxDate(long number)  throws CFException{
		sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrFxDate(number);
	}
	

	
	/**
	 * 	Update Ip98152ClrFxDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp98152ClrFxDate(char[] value)  throws CFException {
		sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrFxDate(value);
	}
	
	/**
	 * 	Update Ip98152ClrFxDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp98152ClrFxDateString(char[] value)  throws CFException{
		sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrFxDate(value);
	}	

	/**
	 *	Returns the value of ptrIp783510800
	 *	@return ptrIp783510800
	 */
   public char[] getPtrIp783510800() throws CFException  {              
   		return work.getPtrIp783510800();
   }

  
	/**
	*  set variable ptrIp783510800
	*  @param value
	**/
   public void setPtrIp783510800(char[] value) throws CFException {
      work.setPtrIp783510800(value);
   } 

	/**
	 *	Returns the value of ip33701ReturnCode
	 *	@return ip33701ReturnCode
	 */
	public short getIp33701ReturnCode() throws CFException {        
   		return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701ReturnCode();
	}
	
	/**
	 * 	Update Ip33701ReturnCode with the passed value
	 *	@param number
	 */
	public void setIp33701ReturnCode(short number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701ReturnCode(number);
	}

	public void setIp33701ReturnCode(int number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701ReturnCode((short)number);
	}

	public void setIp33701ReturnCode(long number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701ReturnCode((short)number);
	}



	/**
	 *	Returns the value of ip33701SourceCurCode
	 *	@return ip33701SourceCurCode
	 */
	public int getIp33701SourceCurCode() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701SourceCurCode();
	}


	/**
	 *	Returns String value of ip33701SourceCurCode
	 *	@return ip33701SourceCurCode
	 */
	public char[]  getIp33701SourceCurCodeString() throws CFException {
	     return String.valueOf(ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701SourceCurCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701SourceCurCodeIsNumeric()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvInput().ip33701SourceCurCodeIsNumeric();
	}

	/**
	 * 	Update Ip33701SourceCurCode with the passed value
	 *	@param number
	 */
	public void setIp33701SourceCurCode(int number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurCode(number);
	}
	

	public void setIp33701SourceCurCode(long number)  throws CFException{
	    ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurCode(number);
	}
	
	
	/**
	 * 	Update Ip33701SourceCurCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701SourceCurCode(char[] value)  throws CFException {
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurCode(value);
	}
	
	/**
	 * 	Update Ip33701SourceCurCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701SourceCurCodeString(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurCode(value);
	}	

	/**
	 *	Returns the value of ip33701TargetCurCode
	 *	@return ip33701TargetCurCode
	 */
	public int getIp33701TargetCurCode() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701TargetCurCode();
	}


	/**
	 *	Returns String value of ip33701TargetCurCode
	 *	@return ip33701TargetCurCode
	 */
	public char[]  getIp33701TargetCurCodeString() throws CFException {
	     return String.valueOf(ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701TargetCurCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701TargetCurCodeIsNumeric()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvInput().ip33701TargetCurCodeIsNumeric();
	}

	/**
	 * 	Update Ip33701TargetCurCode with the passed value
	 *	@param number
	 */
	public void setIp33701TargetCurCode(int number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurCode(number);
	}
	

	public void setIp33701TargetCurCode(long number)  throws CFException{
	    ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurCode(number);
	}
	
	
	/**
	 * 	Update Ip33701TargetCurCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetCurCode(char[] value)  throws CFException {
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurCode(value);
	}
	
	/**
	 * 	Update Ip33701TargetCurCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetCurCodeString(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurCode(value);
	}	

	/**
	 *	Returns the value of srceTrgCurExpErr0rMsg600
	 *	@return srceTrgCurExpErr0rMsg600
	 */   
	 public SrceTrgCurExpErr0rMsg600 getSrceTrgCurExpErr0rMsg600() {
   	return srceTrgCurExpErr0rMsg600;
   }


	/**
	 *	Returns the value of ip33701SourceCurExp
	 *	@return ip33701SourceCurExp
	 */
   public char[] getIp33701SourceCurExp() throws CFException  {              
   		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701SourceCurExp();
   }

  
	/**
	*  set variable ip33701SourceCurExp
	*  @param value
	**/
   public void setIp33701SourceCurExp(char[] value) throws CFException {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(value);
   } 

     /**
	 * 	Update Ip33701SourceCurExp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp33701SourceCurExp(char[] source, int sourceIndex) throws CFException {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source, sourceIndex);
   	
   }
   
   public void setIp33701SourceCurExp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip33701SourceCurExp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp33701SourceCurExp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip33701SourceCurExp with another Field
	 *	@param value
	 */
   public void setIp33701SourceCurExp(Field source) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source);
   }  
   
     /**
	 * 	Update Ip33701SourceCurExp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp33701SourceCurExp(Field source, int sourceIndex,int sourceLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip33701SourceCurExp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp33701SourceCurExp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip33701TargetCurExp
	 *	@return ip33701TargetCurExp
	 */
   public char[] getIp33701TargetCurExp() throws CFException  {              
   		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701TargetCurExp();
   }

  
	/**
	*  set variable ip33701TargetCurExp
	*  @param value
	**/
   public void setIp33701TargetCurExp(char[] value) throws CFException {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(value);
   } 

     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp33701TargetCurExp(char[] source, int sourceIndex) throws CFException {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex);
   	
   }
   
   public void setIp33701TargetCurExp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp33701TargetCurExp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip33701TargetCurExp with another Field
	 *	@param value
	 */
   public void setIp33701TargetCurExp(Field source) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source);
   }  
   
     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp33701TargetCurExp(Field source, int sourceIndex,int sourceLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp33701TargetCurExp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public CallCurrConvApiOutCtx getCallCurrConvApiOutCtx() {
            return new CallCurrConvApiOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001TjfIp370Rec.hashCode();
        str += abendMessage900.hashCode();
        str += work.hashCode();
        str += abendPara900.hashCode();
        str += srceTrgCurExpErr0rMsg600.hashCode();
        str += ip33701CurrConvInterface.hashCode();
       return str.hashCode();
    }

    public CallCurrConvApiInCtx clone() {
        CallCurrConvApiInCtx cloneObj = new CallCurrConvApiInCtx();
        cloneObj.sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        cloneObj.sys001TjfIp370Rec.set(sys001TjfIp370Rec.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.srceTrgCurExpErr0rMsg600 = new SrceTrgCurExpErr0rMsg600();
        cloneObj.srceTrgCurExpErr0rMsg600.set(srceTrgCurExpErr0rMsg600.getClonedField());
        cloneObj.ip33701CurrConvInterface = new Ip33701CurrConvInterface();
        cloneObj.ip33701CurrConvInterface.set(ip33701CurrConvInterface.getClonedField());
        return cloneObj;
    }

    }

    public CallCurrConvApiInCtx getCallCurrConvApiInCtx() {
            return new CallCurrConvApiInCtx();
    }
     public class CallCurrConvApiOutCtx implements Cloneable {
     Sys001TjfIp370Rec sys001TjfIp370Rec = Ip088030Ctx.this.getSys001TjfIp370Rec();
     AbendMessage900 abendMessage900 = Ip088030Ctx.this.getAbendMessage900();
     Work work = Ip088030Ctx.this.getWork();
     AbendPara900 abendPara900 = Ip088030Ctx.this.getAbendPara900();
     SrceTrgCurExpErr0rMsg600 srceTrgCurExpErr0rMsg600 = Ip088030Ctx.this.getSrceTrgCurExpErr0rMsg600();
     Ip33701CurrConvInterface ip33701CurrConvInterface = Ip088030Ctx.this.getIp33701CurrConvInterface();

	/**
	 *	Returns the value of ip98152ClrFxDate
	 *	@return ip98152ClrFxDate
	 */
	public long getIp98152ClrFxDate() throws CFException {
   		return sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrFxDate();
	}


	/**
	 *	Returns String value of ip98152ClrFxDate
	 *	@return ip98152ClrFxDate
	 */
	public char[]  getIp98152ClrFxDateString() throws CFException {
	     return String.valueOf(sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrFxDateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip98152ClrFxDateIsNumeric()  throws CFException{
	    return sys001TjfIp370Rec.getIp98152RecordPart2().ip98152ClrFxDateIsNumeric();
	}

	/**
	 * 	Update Ip98152ClrFxDate with the passed value
	 *	@param number
	 */
	public void setIp98152ClrFxDate(long number)  throws CFException{
		sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrFxDate(number);
	}
	

	
	/**
	 * 	Update Ip98152ClrFxDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp98152ClrFxDate(char[] value)  throws CFException {
		sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrFxDate(value);
	}
	
	/**
	 * 	Update Ip98152ClrFxDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp98152ClrFxDateString(char[] value)  throws CFException{
		sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrFxDate(value);
	}	

	/**
	 *	Returns the value of trgCurrValue600
	 *	@return trgCurrValue600
	 */
   public char[] getTrgCurrValue600() throws CFException  {              
   		return srceTrgCurExpErr0rMsg600.getTrgCurrValue600();
   }

  
	/**
	*  set variable trgCurrValue600
	*  @param value
	**/
   public void setTrgCurrValue600(char[] value) throws CFException {
      srceTrgCurExpErr0rMsg600.setTrgCurrValue600(value);
   } 

     /**
	 * 	Update TrgCurrValue600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrgCurrValue600(char[] source, int sourceIndex) throws CFException {
      srceTrgCurExpErr0rMsg600.setTrgCurrValue600(source, sourceIndex);
   	
   }
   
   public void setTrgCurrValue600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      srceTrgCurExpErr0rMsg600.setTrgCurrValue600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TrgCurrValue600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrgCurrValue600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      srceTrgCurExpErr0rMsg600.setTrgCurrValue600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TrgCurrValue600 with another Field
	 *	@param value
	 */
   public void setTrgCurrValue600(Field source) {
      srceTrgCurExpErr0rMsg600.setTrgCurrValue600(source);
   }  
   
     /**
	 * 	Update TrgCurrValue600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrgCurrValue600(Field source, int sourceIndex,int sourceLen) {
      srceTrgCurExpErr0rMsg600.setTrgCurrValue600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TrgCurrValue600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrgCurrValue600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      srceTrgCurExpErr0rMsg600.setTrgCurrValue600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "3" for isIp33701Xrate2MidRt88()
	 *	@return  Returns true if isIp33701Xrate2MidRt88() is "3"
	 */
   public boolean isIp33701Xrate2MidRt88() throws CFException {
      return ip33701CurrConvInterface.getIp33701CurrConvInput().isIp33701Xrate2MidRt88();
   }

	/**
	*  set values "3"
	*/
   	public void setIp33701Xrate2MidRt88True()  throws CFException{  			
    	ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701Xrate2MidRt88True();
   	}
	/**
	 *	Test condition 3006 for isConvAbendCode88300()
	 *	@return  Returns true if isConvAbendCode88300() is 3006
	 */
   public boolean isConvAbendCode88300() throws CFException {
      return work.isConvAbendCode88300();
   }

	/**
	*  set values 3006
	*/
   	public void setConvAbendCode88300True()  throws CFException{  			
    	work.setConvAbendCode88300True();
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
	 *	Returns the value of ip33701TargetCurCode
	 *	@return ip33701TargetCurCode
	 */
	public int getIp33701TargetCurCode() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701TargetCurCode();
	}


	/**
	 *	Returns String value of ip33701TargetCurCode
	 *	@return ip33701TargetCurCode
	 */
	public char[]  getIp33701TargetCurCodeString() throws CFException {
	     return String.valueOf(ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701TargetCurCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701TargetCurCodeIsNumeric()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvInput().ip33701TargetCurCodeIsNumeric();
	}

	/**
	 * 	Update Ip33701TargetCurCode with the passed value
	 *	@param number
	 */
	public void setIp33701TargetCurCode(int number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurCode(number);
	}
	

	public void setIp33701TargetCurCode(long number)  throws CFException{
	    ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurCode(number);
	}
	
	
	/**
	 * 	Update Ip33701TargetCurCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetCurCode(char[] value)  throws CFException {
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurCode(value);
	}
	
	/**
	 * 	Update Ip33701TargetCurCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetCurCodeString(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurCode(value);
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
	 *	Returns the value of srceTrgCurExpErr0rMsg600
	 *	@return srceTrgCurExpErr0rMsg600
	 */   
	 public SrceTrgCurExpErr0rMsg600 getSrceTrgCurExpErr0rMsg600() {
   	return srceTrgCurExpErr0rMsg600;
   }


	/**
	 *	Returns the value of srceExpValue600
	 *	@return srceExpValue600
	 */
   public char[] getSrceExpValue600() throws CFException  {              
   		return srceTrgCurExpErr0rMsg600.getSrceExpValue600();
   }

  
	/**
	*  set variable srceExpValue600
	*  @param value
	**/
   public void setSrceExpValue600(char[] value) throws CFException {
      srceTrgCurExpErr0rMsg600.setSrceExpValue600(value);
   } 

     /**
	 * 	Update SrceExpValue600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrceExpValue600(char[] source, int sourceIndex) throws CFException {
      srceTrgCurExpErr0rMsg600.setSrceExpValue600(source, sourceIndex);
   	
   }
   
   public void setSrceExpValue600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      srceTrgCurExpErr0rMsg600.setSrceExpValue600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SrceExpValue600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrceExpValue600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      srceTrgCurExpErr0rMsg600.setSrceExpValue600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SrceExpValue600 with another Field
	 *	@param value
	 */
   public void setSrceExpValue600(Field source) {
      srceTrgCurExpErr0rMsg600.setSrceExpValue600(source);
   }  
   
     /**
	 * 	Update SrceExpValue600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrceExpValue600(Field source, int sourceIndex,int sourceLen) {
      srceTrgCurExpErr0rMsg600.setSrceExpValue600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SrceExpValue600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrceExpValue600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      srceTrgCurExpErr0rMsg600.setSrceExpValue600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of trgExpValue600
	 *	@return trgExpValue600
	 */
   public char[] getTrgExpValue600() throws CFException  {              
   		return srceTrgCurExpErr0rMsg600.getTrgExpValue600();
   }

  
	/**
	*  set variable trgExpValue600
	*  @param value
	**/
   public void setTrgExpValue600(char[] value) throws CFException {
      srceTrgCurExpErr0rMsg600.setTrgExpValue600(value);
   } 

     /**
	 * 	Update TrgExpValue600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrgExpValue600(char[] source, int sourceIndex) throws CFException {
      srceTrgCurExpErr0rMsg600.setTrgExpValue600(source, sourceIndex);
   	
   }
   
   public void setTrgExpValue600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      srceTrgCurExpErr0rMsg600.setTrgExpValue600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TrgExpValue600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrgExpValue600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      srceTrgCurExpErr0rMsg600.setTrgExpValue600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TrgExpValue600 with another Field
	 *	@param value
	 */
   public void setTrgExpValue600(Field source) {
      srceTrgCurExpErr0rMsg600.setTrgExpValue600(source);
   }  
   
     /**
	 * 	Update TrgExpValue600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrgExpValue600(Field source, int sourceIndex,int sourceLen) {
      srceTrgCurExpErr0rMsg600.setTrgExpValue600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TrgExpValue600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrgExpValue600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      srceTrgCurExpErr0rMsg600.setTrgExpValue600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendParaName300
	 *	@return abendParaName300
	 */
   public char[] getAbendParaName300() throws CFException  {              
   		return work.getAbendParaName300();
   }

  
	/**
	*  set variable abendParaName300
	*  @param value
	**/
   public void setAbendParaName300(char[] value) throws CFException {
      work.setAbendParaName300(value);
   } 

	/**
	 *	Test condition "N" for isIp33701NoCrossRate88()
	 *	@return  Returns true if isIp33701NoCrossRate88() is "N"
	 */
   public boolean isIp33701NoCrossRate88() throws CFException {
      return ip33701CurrConvInterface.getIp33701CurrConvInput().isIp33701NoCrossRate88();
   }

	/**
	*  set values "N"
	*/
   	public void setIp33701NoCrossRate88True()  throws CFException{  			
    	ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701NoCrossRate88True();
   	}
	/**
	 *	Test condition "M" for isIp33701SToBMidRt88()
	 *	@return  Returns true if isIp33701SToBMidRt88() is "M"
	 */
   public boolean isIp33701SToBMidRt88() throws CFException {
      return ip33701CurrConvInterface.getIp33701CurrConvInput().isIp33701SToBMidRt88();
   }

	/**
	*  set values "M"
	*/
   	public void setIp33701SToBMidRt88True()  throws CFException{  			
    	ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SToBMidRt88True();
   	}
	/**
	 *	Test condition "M" for isIp33701TToBMidRt88()
	 *	@return  Returns true if isIp33701TToBMidRt88() is "M"
	 */
   public boolean isIp33701TToBMidRt88() throws CFException {
      return ip33701CurrConvInterface.getIp33701CurrConvInput().isIp33701TToBMidRt88();
   }

	/**
	*  set values "M"
	*/
   	public void setIp33701TToBMidRt88True()  throws CFException{  			
    	ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TToBMidRt88True();
   	}
	/**
	 *	Returns the value of srceCurrValue600
	 *	@return srceCurrValue600
	 */
   public char[] getSrceCurrValue600() throws CFException  {              
   		return srceTrgCurExpErr0rMsg600.getSrceCurrValue600();
   }

  
	/**
	*  set variable srceCurrValue600
	*  @param value
	**/
   public void setSrceCurrValue600(char[] value) throws CFException {
      srceTrgCurExpErr0rMsg600.setSrceCurrValue600(value);
   } 

     /**
	 * 	Update SrceCurrValue600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrceCurrValue600(char[] source, int sourceIndex) throws CFException {
      srceTrgCurExpErr0rMsg600.setSrceCurrValue600(source, sourceIndex);
   	
   }
   
   public void setSrceCurrValue600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      srceTrgCurExpErr0rMsg600.setSrceCurrValue600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SrceCurrValue600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrceCurrValue600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      srceTrgCurExpErr0rMsg600.setSrceCurrValue600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SrceCurrValue600 with another Field
	 *	@param value
	 */
   public void setSrceCurrValue600(Field source) {
      srceTrgCurExpErr0rMsg600.setSrceCurrValue600(source);
   }  
   
     /**
	 * 	Update SrceCurrValue600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrceCurrValue600(Field source, int sourceIndex,int sourceLen) {
      srceTrgCurExpErr0rMsg600.setSrceCurrValue600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SrceCurrValue600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrceCurrValue600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      srceTrgCurExpErr0rMsg600.setSrceCurrValue600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip33701SourceCurCode
	 *	@return ip33701SourceCurCode
	 */
	public int getIp33701SourceCurCode() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701SourceCurCode();
	}


	/**
	 *	Returns String value of ip33701SourceCurCode
	 *	@return ip33701SourceCurCode
	 */
	public char[]  getIp33701SourceCurCodeString() throws CFException {
	     return String.valueOf(ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701SourceCurCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701SourceCurCodeIsNumeric()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvInput().ip33701SourceCurCodeIsNumeric();
	}

	/**
	 * 	Update Ip33701SourceCurCode with the passed value
	 *	@param number
	 */
	public void setIp33701SourceCurCode(int number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurCode(number);
	}
	

	public void setIp33701SourceCurCode(long number)  throws CFException{
	    ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurCode(number);
	}
	
	
	/**
	 * 	Update Ip33701SourceCurCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701SourceCurCode(char[] value)  throws CFException {
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurCode(value);
	}
	
	/**
	 * 	Update Ip33701SourceCurCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701SourceCurCodeString(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurCode(value);
	}	

	/**
	 *	Test condition "M" for isIp33701MultiplyByRate88()
	 *	@return  Returns true if isIp33701MultiplyByRate88() is "M"
	 */
   public boolean isIp33701MultiplyByRate88() throws CFException {
      return ip33701CurrConvInterface.getIp33701CurrConvInput().isIp33701MultiplyByRate88();
   }

	/**
	*  set values "M"
	*/
   	public void setIp33701MultiplyByRate88True()  throws CFException{  			
    	ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701MultiplyByRate88True();
   	}
	/**
	 *	Returns the value of abendCode300
	 *	@return abendCode300
	 */
	public int getAbendCode300() throws CFException {
   		return work.getAbendCode300();
	}


	/**
	 *	Returns String value of abendCode300
	 *	@return abendCode300
	 */
	public char[]  getAbendCode300String() throws CFException {
	     return String.valueOf(work.getAbendCode300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCode300IsNumeric()  throws CFException{
	    return work.abendCode300IsNumeric();
	}

	/**
	 * 	Update AbendCode300 with the passed value
	 *	@param number
	 */
	public void setAbendCode300(int number)  throws CFException{
		work.setAbendCode300(number);
	}
	

	public void setAbendCode300(long number)  throws CFException{
	    work.setAbendCode300(number);
	}
	
	
	/**
	 * 	Update AbendCode300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode300(char[] value)  throws CFException {
		work.setAbendCode300(value);
	}
	
	/**
	 * 	Update AbendCode300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode300String(char[] value)  throws CFException{
		work.setAbendCode300(value);
	}	

	/**
	 *	Returns the value of ip33701SourceCurExp
	 *	@return ip33701SourceCurExp
	 */
   public char[] getIp33701SourceCurExp() throws CFException  {              
   		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701SourceCurExp();
   }

  
	/**
	*  set variable ip33701SourceCurExp
	*  @param value
	**/
   public void setIp33701SourceCurExp(char[] value) throws CFException {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(value);
   } 

     /**
	 * 	Update Ip33701SourceCurExp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp33701SourceCurExp(char[] source, int sourceIndex) throws CFException {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source, sourceIndex);
   	
   }
   
   public void setIp33701SourceCurExp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip33701SourceCurExp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp33701SourceCurExp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip33701SourceCurExp with another Field
	 *	@param value
	 */
   public void setIp33701SourceCurExp(Field source) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source);
   }  
   
     /**
	 * 	Update Ip33701SourceCurExp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp33701SourceCurExp(Field source, int sourceIndex,int sourceLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip33701SourceCurExp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp33701SourceCurExp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701SourceCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip33701FxDateYyddd
	 *	@return ip33701FxDateYyddd
	 */
	public long getIp33701FxDateYyddd() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701FxDateYyddd();
	}


	/**
	 *	Returns String value of ip33701FxDateYyddd
	 *	@return ip33701FxDateYyddd
	 */
	public char[]  getIp33701FxDateYydddString() throws CFException {
	     return String.valueOf(ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701FxDateYydddString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701FxDateYydddIsNumeric()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvInput().ip33701FxDateYydddIsNumeric();
	}

	/**
	 * 	Update Ip33701FxDateYyddd with the passed value
	 *	@param number
	 */
	public void setIp33701FxDateYyddd(long number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701FxDateYyddd(number);
	}
	

	
	/**
	 * 	Update Ip33701FxDateYyddd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701FxDateYyddd(char[] value)  throws CFException {
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701FxDateYyddd(value);
	}
	
	/**
	 * 	Update Ip33701FxDateYyddd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701FxDateYydddString(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701FxDateYyddd(value);
	}	

	/**
	 *	Test condition "4" for isIp33701Xrate1MidRtInv88()
	 *	@return  Returns true if isIp33701Xrate1MidRtInv88() is "4"
	 */
   public boolean isIp33701Xrate1MidRtInv88() throws CFException {
      return ip33701CurrConvInterface.getIp33701CurrConvInput().isIp33701Xrate1MidRtInv88();
   }

	/**
	*  set values "4"
	*/
   	public void setIp33701Xrate1MidRtInv88True()  throws CFException{  			
    	ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701Xrate1MidRtInv88True();
   	}
	/**
	 *	Test condition "8300-CALL-CURR-CONV-API" for isAbendPara830088300()
	 *	@return  Returns true if isAbendPara830088300() is "8300-CALL-CURR-CONV-API"
	 */
   public boolean isAbendPara830088300() throws CFException {
      return work.isAbendPara830088300();
   }

	/**
	*  set values "8300-CALL-CURR-CONV-API"
	*/
   	public void setAbendPara830088300True()  throws CFException{  			
    	work.setAbendPara830088300True();
   	}
	/**
	 *	Returns the value of ip33701TargetCurExp
	 *	@return ip33701TargetCurExp
	 */
   public char[] getIp33701TargetCurExp() throws CFException  {              
   		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701TargetCurExp();
   }

  
	/**
	*  set variable ip33701TargetCurExp
	*  @param value
	**/
   public void setIp33701TargetCurExp(char[] value) throws CFException {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(value);
   } 

     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp33701TargetCurExp(char[] source, int sourceIndex) throws CFException {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex);
   	
   }
   
   public void setIp33701TargetCurExp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp33701TargetCurExp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip33701TargetCurExp with another Field
	 *	@param value
	 */
   public void setIp33701TargetCurExp(Field source) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source);
   }  
   
     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp33701TargetCurExp(Field source, int sourceIndex,int sourceLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp33701TargetCurExp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001TjfIp370Rec.hashCode();
        str += abendMessage900.hashCode();
        str += work.hashCode();
        str += abendPara900.hashCode();
        str += srceTrgCurExpErr0rMsg600.hashCode();
        str += ip33701CurrConvInterface.hashCode();
       return str.hashCode();
    }

    public CallCurrConvApiOutCtx clone() {
        CallCurrConvApiOutCtx cloneObj = new CallCurrConvApiOutCtx();
        cloneObj.sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        cloneObj.sys001TjfIp370Rec.set(sys001TjfIp370Rec.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.srceTrgCurExpErr0rMsg600 = new SrceTrgCurExpErr0rMsg600();
        cloneObj.srceTrgCurExpErr0rMsg600.set(srceTrgCurExpErr0rMsg600.getClonedField());
        cloneObj.ip33701CurrConvInterface = new Ip33701CurrConvInterface();
        cloneObj.ip33701CurrConvInterface.set(ip33701CurrConvInterface.getClonedField());
        return cloneObj;
    }

    }

    public CallCurrConvApiOutCtx getCallCurrConvApiOutCtx() {
            return new CallCurrConvApiOutCtx();
    }
     public class AlignAmtToExpInCtx implements Cloneable {
     Ip33701CurrConvInterface ip33701CurrConvInterface = Ip088030Ctx.this.getIp33701CurrConvInterface();

	/**
	 *	Returns the value of ip33701SrcAmt6Decimals
	 *	@return ip33701SrcAmt6Decimals
	 */
	public BigDecimal getIp33701SrcAmt6Decimals() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701SrcAmt6Decimals();
	}

    /**
	 *	Returns the String value of ip33701SrcAmt6Decimals
	 *	@return ip33701SrcAmt6Decimals
	 */
	public char[]  getIp33701SrcAmt6DecimalsActualString()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701SrcAmt6DecimalsActualString();
	}

	 /**
     *	Returns String value of ip33701SrcAmt6Decimals
     *	@return ip33701SrcAmt6Decimals
     */
    public char[]  getIp33701SrcAmt6DecimalsString() throws CFException {
         return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701SrcAmt6DecimalsString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean ip33701SrcAmt6DecimalsIsNumeric() {
        return ip33701CurrConvInterface.getIp33701CurrConvOutput().ip33701SrcAmt6DecimalsIsNumeric();
    }
	/**
	 * 	Update Ip33701SrcAmt6Decimals with the passed number
	 *	@param number
	 */
	public void setIp33701SrcAmt6Decimals(BigDecimal number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701SrcAmt6Decimals(number);
   }

	/**
	 * 	Update Ip33701SrcAmt6Decimals with the passed value
	 *	@param value (String or char[]);
	 */
	public void setIp33701SrcAmt6Decimals(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701SrcAmt6Decimals(value);
	}   

	/**
	 *	Returns the value of ip33701TargetCurExp
	 *	@return ip33701TargetCurExp
	 */
   public char[] getIp33701TargetCurExp() throws CFException  {              
   		return ip33701CurrConvInterface.getIp33701CurrConvInput().getIp33701TargetCurExp();
   }

  
	/**
	*  set variable ip33701TargetCurExp
	*  @param value
	**/
   public void setIp33701TargetCurExp(char[] value) throws CFException {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(value);
   } 

     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp33701TargetCurExp(char[] source, int sourceIndex) throws CFException {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex);
   	
   }
   
   public void setIp33701TargetCurExp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp33701TargetCurExp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip33701TargetCurExp with another Field
	 *	@param value
	 */
   public void setIp33701TargetCurExp(Field source) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source);
   }  
   
     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp33701TargetCurExp(Field source, int sourceIndex,int sourceLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip33701TargetCurExp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp33701TargetCurExp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip33701CurrConvInterface.getIp33701CurrConvInput().setIp33701TargetCurExp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public AlignAmtToExpOutCtx getAlignAmtToExpOutCtx() {
            return new AlignAmtToExpOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip33701CurrConvInterface.hashCode();
       return str.hashCode();
    }

    public AlignAmtToExpInCtx clone() {
        AlignAmtToExpInCtx cloneObj = new AlignAmtToExpInCtx();
        cloneObj.ip33701CurrConvInterface = new Ip33701CurrConvInterface();
        cloneObj.ip33701CurrConvInterface.set(ip33701CurrConvInterface.getClonedField());
        return cloneObj;
    }

    }

    public AlignAmtToExpInCtx getAlignAmtToExpInCtx() {
            return new AlignAmtToExpInCtx();
    }
     public class AlignAmtToExpOutCtx implements Cloneable {
     Ip33701CurrConvInterface ip33701CurrConvInterface = Ip088030Ctx.this.getIp33701CurrConvInterface();

	/**
	 *	Returns the value of ip33701TargetAmount
	 *	@return ip33701TargetAmount
	 */
	public long getIp33701TargetAmount() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmount();
	}

    /**
	 *	Returns the String value of ip33701TargetAmount
	 *	@return ip33701TargetAmount
	 */
	public char[]  getIp33701TargetAmountActualString() {
		return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmountActualString();
	}

	/**
	 *	Returns String value of ip33701TargetAmount
	 *	@return ip33701TargetAmount
	 */
	public char[]  getIp33701TargetAmountString() throws CFException {
	     return String.valueOf(ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701TargetAmountIsNumeric()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvOutput().ip33701TargetAmountIsNumeric();
	}

	/**
	 * 	Update Ip33701TargetAmount with the passed value
	 *	@param number
	 */
	public void setIp33701TargetAmount(long number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount(number);
	}
	

	
	/**
	 * 	Update Ip33701TargetAmount with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetAmount(char[] value)  throws CFException {
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount(value);
	}
	
	/**
	 * 	Update Ip33701TargetAmount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetAmountString(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount(value);
	}	


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip33701CurrConvInterface.hashCode();
       return str.hashCode();
    }

    public AlignAmtToExpOutCtx clone() {
        AlignAmtToExpOutCtx cloneObj = new AlignAmtToExpOutCtx();
        cloneObj.ip33701CurrConvInterface = new Ip33701CurrConvInterface();
        cloneObj.ip33701CurrConvInterface.set(ip33701CurrConvInterface.getClonedField());
        return cloneObj;
    }

    }

    public AlignAmtToExpOutCtx getAlignAmtToExpOutCtx() {
            return new AlignAmtToExpOutCtx();
    }
     public class DetermineInterchangeInCtx implements Cloneable {
     Sys001TjfIp370Rec sys001TjfIp370Rec = Ip088030Ctx.this.getSys001TjfIp370Rec();
     Work work = Ip088030Ctx.this.getWork();
     HoldVariables800 holdVariables800 = Ip088030Ctx.this.getHoldVariables800();

	/**
	 *	Test condition "N" for isIchgCalculatedN88100()
	 *	@return  Returns true if isIchgCalculatedN88100() is "N"
	 */
   public boolean isIchgCalculatedN88100() throws CFException {
      return work.isIchgCalculatedN88100();
   }

	/**
	*  set values "N"
	*/
   	public void setIchgCalculatedN88100True()  throws CFException{  			
    	work.setIchgCalculatedN88100True();
   	}
	/**
	 *	Returns the value of maid800
	 *	@return maid800
	 */
   public char[] getMaid800() throws CFException  {              
   		return holdVariables800.getMaid800();
   }

  
	/**
	*  set variable maid800
	*  @param value
	**/
   public void setMaid800(char[] value) throws CFException {
      holdVariables800.setMaid800(value);
   } 

     /**
	 * 	Update Maid800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMaid800(char[] source, int sourceIndex) throws CFException {
      holdVariables800.setMaid800(source, sourceIndex);
   	
   }
   
   public void setMaid800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      holdVariables800.setMaid800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Maid800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMaid800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setMaid800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Maid800 with another Field
	 *	@param value
	 */
   public void setMaid800(Field source) {
      holdVariables800.setMaid800(source);
   }  
   
     /**
	 * 	Update Maid800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMaid800(Field source, int sourceIndex,int sourceLen) {
      holdVariables800.setMaid800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Maid800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMaid800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setMaid800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip98151TjfTlrMrchId
	 *	@return ip98151TjfTlrMrchId
	 */
   public char[] getIp98151TjfTlrMrchId() throws CFException  {              
   		return sys001TjfIp370Rec.getIp98151RecordPart1().getIp98151TjfTlrMrchId();
   }

  
	/**
	*  set variable ip98151TjfTlrMrchId
	*  @param value
	**/
   public void setIp98151TjfTlrMrchId(char[] value) throws CFException {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfTlrMrchId(value);
   } 

     /**
	 * 	Update Ip98151TjfTlrMrchId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98151TjfTlrMrchId(char[] source, int sourceIndex) throws CFException {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfTlrMrchId(source, sourceIndex);
   	
   }
   
   public void setIp98151TjfTlrMrchId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfTlrMrchId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98151TjfTlrMrchId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98151TjfTlrMrchId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfTlrMrchId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98151TjfTlrMrchId with another Field
	 *	@param value
	 */
   public void setIp98151TjfTlrMrchId(Field source) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfTlrMrchId(source);
   }  
   
     /**
	 * 	Update Ip98151TjfTlrMrchId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98151TjfTlrMrchId(Field source, int sourceIndex,int sourceLen) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfTlrMrchId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip98151TjfTlrMrchId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98151TjfTlrMrchId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfTlrMrchId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip98151TjfTlrP176Id
	 *	@return ip98151TjfTlrP176Id
	 */
   public char[] getIp98151TjfTlrP176Id() throws CFException  {              
   		return sys001TjfIp370Rec.getIp98151RecordPart1().getIp98151TjfTlrP176Id();
   }

  
	/**
	*  set variable ip98151TjfTlrP176Id
	*  @param value
	**/
   public void setIp98151TjfTlrP176Id(char[] value) throws CFException {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfTlrP176Id(value);
   } 

     /**
	 * 	Update Ip98151TjfTlrP176Id 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98151TjfTlrP176Id(char[] source, int sourceIndex) throws CFException {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfTlrP176Id(source, sourceIndex);
   	
   }
   
   public void setIp98151TjfTlrP176Id(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfTlrP176Id(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98151TjfTlrP176Id 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98151TjfTlrP176Id(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfTlrP176Id(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98151TjfTlrP176Id with another Field
	 *	@param value
	 */
   public void setIp98151TjfTlrP176Id(Field source) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfTlrP176Id(source);
   }  
   
     /**
	 * 	Update Ip98151TjfTlrP176Id 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98151TjfTlrP176Id(Field source, int sourceIndex,int sourceLen) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfTlrP176Id(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip98151TjfTlrP176Id 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98151TjfTlrP176Id(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfTlrP176Id(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip98151TjfDe48se32
	 *	@return ip98151TjfDe48se32
	 */
   public char[] getIp98151TjfDe48se32() throws CFException  {              
   		return sys001TjfIp370Rec.getIp98151RecordPart1().getIp98151TjfDe48se32();
   }

  
	/**
	*  set variable ip98151TjfDe48se32
	*  @param value
	**/
   public void setIp98151TjfDe48se32(char[] value) throws CFException {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfDe48se32(value);
   } 

     /**
	 * 	Update Ip98151TjfDe48se32 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98151TjfDe48se32(char[] source, int sourceIndex) throws CFException {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfDe48se32(source, sourceIndex);
   	
   }
   
   public void setIp98151TjfDe48se32(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfDe48se32(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98151TjfDe48se32 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98151TjfDe48se32(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfDe48se32(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98151TjfDe48se32 with another Field
	 *	@param value
	 */
   public void setIp98151TjfDe48se32(Field source) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfDe48se32(source);
   }  
   
     /**
	 * 	Update Ip98151TjfDe48se32 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98151TjfDe48se32(Field source, int sourceIndex,int sourceLen) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfDe48se32(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip98151TjfDe48se32 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98151TjfDe48se32(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfDe48se32(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "N" for isItIsMaidFndN88100()
	 *	@return  Returns true if isItIsMaidFndN88100() is "N"
	 */
   public boolean isItIsMaidFndN88100() throws CFException {
      return work.isItIsMaidFndN88100();
   }

	/**
	*  set values "N"
	*/
   	public void setItIsMaidFndN88100True()  throws CFException{  			
    	work.setItIsMaidFndN88100True();
   	}

        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001TjfIp370Rec.hashCode();
        str += work.hashCode();
        str += holdVariables800.hashCode();
       return str.hashCode();
    }

    public DetermineInterchangeInCtx clone() {
        DetermineInterchangeInCtx cloneObj = new DetermineInterchangeInCtx();
        cloneObj.sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        cloneObj.sys001TjfIp370Rec.set(sys001TjfIp370Rec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.holdVariables800 = new HoldVariables800();
        cloneObj.holdVariables800.set(holdVariables800.getClonedField());
        return cloneObj;
    }

    }

    public DetermineInterchangeInCtx getDetermineInterchangeInCtx() {
            return new DetermineInterchangeInCtx();
    }
     public class SearchMaidIdInCtx implements Cloneable {
     Sys001TjfIp370Rec sys001TjfIp370Rec = Ip088030Ctx.this.getSys001TjfIp370Rec();
     Work work = Ip088030Ctx.this.getWork();
     HoldVariables800 holdVariables800 = Ip088030Ctx.this.getHoldVariables800();
     IchgFeeRecords500 ichgFeeRecords500 = Ip088030Ctx.this.getIchgFeeRecords500();
     IchgCalcVars800 ichgCalcVars800 = Ip088030Ctx.this.getIchgCalcVars800();
     Ip00164TableEntry ip00164TableEntry = Ip088030Ctx.this.getIp00164TableEntry();

	/**
	 *	Returns the value of recType500
	 *	@return recType500
	 */
   public char[] getRecType500(int index) throws CFException  {              
   		return ichgFeeRecords500.getIchgEntry500(index).getRecType500();
   }

  
	/**
	*  set variable recType500
	*  @param value
	**/
   public void setRecType500(int index,char[] value) throws CFException {
      ichgFeeRecords500.getIchgEntry500(index).setRecType500(value);
   } 

     /**
	 * 	Update RecType500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecType500(int index,char[] source, int sourceIndex) throws CFException {
      ichgFeeRecords500.getIchgEntry500(index).setRecType500(source, sourceIndex);
   	
   }
   
   public void setRecType500(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ichgFeeRecords500.getIchgEntry500(index).setRecType500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RecType500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecType500(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ichgFeeRecords500.getIchgEntry500(index).setRecType500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RecType500 with another Field
	 *	@param value
	 */
   public void setRecType500(int index,Field source) {
      ichgFeeRecords500.getIchgEntry500(index).setRecType500(source);
   }  
   
     /**
	 * 	Update RecType500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecType500(int index,Field source, int sourceIndex,int sourceLen) {
      ichgFeeRecords500.getIchgEntry500(index).setRecType500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RecType500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecType500(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ichgFeeRecords500.getIchgEntry500(index).setRecType500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public long getIp98152ClrTxnAmt() throws CFException {  
        return sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrTxnAmt();
}
	/**
	 * 	Update Ip98152ClrTxnAmt with the passed value
	 *	@param number
	 */
	public void setIp98152ClrTxnAmt(long number)  throws CFException{
		sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnAmt(number);
	}




public void setIchgIdx500(int ichgIdx500) { 
    Ip088030Ctx.this.ichgIdx500 = ichgIdx500;
}

public int getIchgIdx500() { 
    return Ip088030Ctx.this.ichgIdx500;
}
	/**
	 *	Returns the value of ichgEntriesCnt500
	 *	@return ichgEntriesCnt500
	 */
	public short getIchgEntriesCnt500() throws CFException {        
   		return ichgFeeRecords500.getIchgEntriesCnt500();
	}
	
	/**
	 * 	Update IchgEntriesCnt500 with the passed value
	 *	@param number
	 */
	public void setIchgEntriesCnt500(short number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesCnt500(number);
	}

	public void setIchgEntriesCnt500(int number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesCnt500((short)number);
	}

	public void setIchgEntriesCnt500(long number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesCnt500((short)number);
	}



	/**
	 *	Returns the value of txnLowAmtU500
	 *	@return txnLowAmtU500
	 */
	public long getTxnLowAmtU500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getTxnLowAmtU500();
	}


	/**
	 *	Returns String value of txnLowAmtU500
	 *	@return txnLowAmtU500
	 */
	public char[]  getTxnLowAmtU500String(int index) throws CFException {
	     return String.valueOf(ichgFeeRecords500.getIchgEntry500(index).getTxnLowAmtU500String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean txnLowAmtU500IsNumeric(int index)  throws CFException{
	    return ichgFeeRecords500.getIchgEntry500(index - 1).txnLowAmtU500IsNumeric();
	}

	/**
	 * 	Update TxnLowAmtU500 with the passed value
	 *	@param number
	 */
	public void setTxnLowAmtU500(int index,long number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setTxnLowAmtU500(number);
	}
	

	
	/**
	 * 	Update TxnLowAmtU500 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTxnLowAmtU500(int index,char[] value)  throws CFException {
		ichgFeeRecords500.getIchgEntry500(index).setTxnLowAmtU500(value);
	}
	
	/**
	 * 	Update TxnLowAmtU500 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTxnLowAmtU500String(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setTxnLowAmtU500(value);
	}	

	/**
	 *	Returns the value of maid500
	 *	@return maid500
	 */
   public char[] getMaid500(int index) throws CFException  {              
   		return ichgFeeRecords500.getIchgEntry500(index).getMaid500();
   }

  
	/**
	*  set variable maid500
	*  @param value
	**/
   public void setMaid500(int index,char[] value) throws CFException {
      ichgFeeRecords500.getIchgEntry500(index).setMaid500(value);
   } 

     /**
	 * 	Update Maid500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMaid500(int index,char[] source, int sourceIndex) throws CFException {
      ichgFeeRecords500.getIchgEntry500(index).setMaid500(source, sourceIndex);
   	
   }
   
   public void setMaid500(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ichgFeeRecords500.getIchgEntry500(index).setMaid500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Maid500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMaid500(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ichgFeeRecords500.getIchgEntry500(index).setMaid500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Maid500 with another Field
	 *	@param value
	 */
   public void setMaid500(int index,Field source) {
      ichgFeeRecords500.getIchgEntry500(index).setMaid500(source);
   }  
   
     /**
	 * 	Update Maid500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMaid500(int index,Field source, int sourceIndex,int sourceLen) {
      ichgFeeRecords500.getIchgEntry500(index).setMaid500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Maid500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMaid500(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ichgFeeRecords500.getIchgEntry500(index).setMaid500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip98151TjfTlrMrchId
	 *	@return ip98151TjfTlrMrchId
	 */
   public char[] getIp98151TjfTlrMrchId() throws CFException  {              
   		return sys001TjfIp370Rec.getIp98151RecordPart1().getIp98151TjfTlrMrchId();
   }

  
	/**
	*  set variable ip98151TjfTlrMrchId
	*  @param value
	**/
   public void setIp98151TjfTlrMrchId(char[] value) throws CFException {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfTlrMrchId(value);
   } 

     /**
	 * 	Update Ip98151TjfTlrMrchId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98151TjfTlrMrchId(char[] source, int sourceIndex) throws CFException {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfTlrMrchId(source, sourceIndex);
   	
   }
   
   public void setIp98151TjfTlrMrchId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfTlrMrchId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98151TjfTlrMrchId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98151TjfTlrMrchId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfTlrMrchId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98151TjfTlrMrchId with another Field
	 *	@param value
	 */
   public void setIp98151TjfTlrMrchId(Field source) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfTlrMrchId(source);
   }  
   
     /**
	 * 	Update Ip98151TjfTlrMrchId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98151TjfTlrMrchId(Field source, int sourceIndex,int sourceLen) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfTlrMrchId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip98151TjfTlrMrchId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98151TjfTlrMrchId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfTlrMrchId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip98151TjfDe48se32
	 *	@return ip98151TjfDe48se32
	 */
   public char[] getIp98151TjfDe48se32() throws CFException  {              
   		return sys001TjfIp370Rec.getIp98151RecordPart1().getIp98151TjfDe48se32();
   }

  
	/**
	*  set variable ip98151TjfDe48se32
	*  @param value
	**/
   public void setIp98151TjfDe48se32(char[] value) throws CFException {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfDe48se32(value);
   } 

     /**
	 * 	Update Ip98151TjfDe48se32 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98151TjfDe48se32(char[] source, int sourceIndex) throws CFException {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfDe48se32(source, sourceIndex);
   	
   }
   
   public void setIp98151TjfDe48se32(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfDe48se32(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98151TjfDe48se32 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98151TjfDe48se32(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfDe48se32(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98151TjfDe48se32 with another Field
	 *	@param value
	 */
   public void setIp98151TjfDe48se32(Field source) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfDe48se32(source);
   }  
   
     /**
	 * 	Update Ip98151TjfDe48se32 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98151TjfDe48se32(Field source, int sourceIndex,int sourceLen) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfDe48se32(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip98151TjfDe48se32 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98151TjfDe48se32(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfDe48se32(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fiaAmt500
	 *	@return fiaAmt500
	 */
	public BigDecimal getFiaAmt500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getFiaAmt500();
	}


	 /**
     *	Returns String value of fiaAmt500
     *	@return fiaAmt500
     */
    public char[]  getFiaAmt500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getFiaAmt500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean fiaAmt500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).fiaAmt500IsNumeric();
    }
	/**
	 * 	Update FiaAmt500 with the passed number
	 *	@param number
	 */
	public void setFiaAmt500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setFiaAmt500(number);
   }

	/**
	 * 	Update FiaAmt500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setFiaAmt500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setFiaAmt500(value);
	}   

	/**
	 *	Returns the value of txnHighAmtU500
	 *	@return txnHighAmtU500
	 */
	public long getTxnHighAmtU500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getTxnHighAmtU500();
	}


	/**
	 *	Returns String value of txnHighAmtU500
	 *	@return txnHighAmtU500
	 */
	public char[]  getTxnHighAmtU500String(int index) throws CFException {
	     return String.valueOf(ichgFeeRecords500.getIchgEntry500(index).getTxnHighAmtU500String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean txnHighAmtU500IsNumeric(int index)  throws CFException{
	    return ichgFeeRecords500.getIchgEntry500(index - 1).txnHighAmtU500IsNumeric();
	}

	/**
	 * 	Update TxnHighAmtU500 with the passed value
	 *	@param number
	 */
	public void setTxnHighAmtU500(int index,long number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setTxnHighAmtU500(number);
	}
	

	
	/**
	 * 	Update TxnHighAmtU500 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTxnHighAmtU500(int index,char[] value)  throws CFException {
		ichgFeeRecords500.getIchgEntry500(index).setTxnHighAmtU500(value);
	}
	
	/**
	 * 	Update TxnHighAmtU500 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTxnHighAmtU500String(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setTxnHighAmtU500(value);
	}	

	/**
	 *	Returns the value of maid800
	 *	@return maid800
	 */
   public char[] getMaid800() throws CFException  {              
   		return holdVariables800.getMaid800();
   }

  
	/**
	*  set variable maid800
	*  @param value
	**/
   public void setMaid800(char[] value) throws CFException {
      holdVariables800.setMaid800(value);
   } 

     /**
	 * 	Update Maid800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMaid800(char[] source, int sourceIndex) throws CFException {
      holdVariables800.setMaid800(source, sourceIndex);
   	
   }
   
   public void setMaid800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      holdVariables800.setMaid800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Maid800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMaid800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setMaid800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Maid800 with another Field
	 *	@param value
	 */
   public void setMaid800(Field source) {
      holdVariables800.setMaid800(source);
   }  
   
     /**
	 * 	Update Maid800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMaid800(Field source, int sourceIndex,int sourceLen) {
      holdVariables800.setMaid800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Maid800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMaid800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setMaid800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip98151TjfTlrP176Id
	 *	@return ip98151TjfTlrP176Id
	 */
   public char[] getIp98151TjfTlrP176Id() throws CFException  {              
   		return sys001TjfIp370Rec.getIp98151RecordPart1().getIp98151TjfTlrP176Id();
   }

  
	/**
	*  set variable ip98151TjfTlrP176Id
	*  @param value
	**/
   public void setIp98151TjfTlrP176Id(char[] value) throws CFException {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfTlrP176Id(value);
   } 

     /**
	 * 	Update Ip98151TjfTlrP176Id 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98151TjfTlrP176Id(char[] source, int sourceIndex) throws CFException {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfTlrP176Id(source, sourceIndex);
   	
   }
   
   public void setIp98151TjfTlrP176Id(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfTlrP176Id(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98151TjfTlrP176Id 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98151TjfTlrP176Id(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfTlrP176Id(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98151TjfTlrP176Id with another Field
	 *	@param value
	 */
   public void setIp98151TjfTlrP176Id(Field source) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfTlrP176Id(source);
   }  
   
     /**
	 * 	Update Ip98151TjfTlrP176Id 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98151TjfTlrP176Id(Field source, int sourceIndex,int sourceLen) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfTlrP176Id(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip98151TjfTlrP176Id 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98151TjfTlrP176Id(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98151RecordPart1().setIp98151TjfTlrP176Id(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip00164ProdCatCd
	 *	@return ip00164ProdCatCd
	 */
   public char[] getIp00164ProdCatCd() throws CFException  {              
   		return ip00164TableEntry.getIp00164TableData().getIp00164ProdCatCd();
   }

  
	/**
	*  set variable ip00164ProdCatCd
	*  @param value
	**/
   public void setIp00164ProdCatCd(char[] value) throws CFException {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(value);
   } 

     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00164ProdCatCd(char[] source, int sourceIndex) throws CFException {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex);
   	
   }
   
   public void setIp00164ProdCatCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00164ProdCatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00164ProdCatCd with another Field
	 *	@param value
	 */
   public void setIp00164ProdCatCd(Field source) {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source);
   }  
   
     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00164ProdCatCd(Field source, int sourceIndex,int sourceLen) {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00164ProdCatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of minAmt500
	 *	@return minAmt500
	 */
	public BigDecimal getMinAmt500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getMinAmt500();
	}


	 /**
     *	Returns String value of minAmt500
     *	@return minAmt500
     */
    public char[]  getMinAmt500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getMinAmt500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean minAmt500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).minAmt500IsNumeric();
    }
	/**
	 * 	Update MinAmt500 with the passed number
	 *	@param number
	 */
	public void setMinAmt500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMinAmt500(number);
   }

	/**
	 * 	Update MinAmt500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMinAmt500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMinAmt500(value);
	}   

	/**
	 *	Returns the value of viaRate500
	 *	@return viaRate500
	 */
	public BigDecimal getViaRate500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getViaRate500();
	}


	 /**
     *	Returns String value of viaRate500
     *	@return viaRate500
     */
    public char[]  getViaRate500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getViaRate500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean viaRate500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).viaRate500IsNumeric();
    }
	/**
	 * 	Update ViaRate500 with the passed number
	 *	@param number
	 */
	public void setViaRate500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setViaRate500(number);
   }

	/**
	 * 	Update ViaRate500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setViaRate500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setViaRate500(value);
	}   

	/**
	 *	Returns the value of maxAmt500
	 *	@return maxAmt500
	 */
	public BigDecimal getMaxAmt500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getMaxAmt500();
	}


	 /**
     *	Returns String value of maxAmt500
     *	@return maxAmt500
     */
    public char[]  getMaxAmt500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getMaxAmt500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean maxAmt500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).maxAmt500IsNumeric();
    }
	/**
	 * 	Update MaxAmt500 with the passed number
	 *	@param number
	 */
	public void setMaxAmt500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMaxAmt500(number);
   }

	/**
	 * 	Update MaxAmt500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMaxAmt500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMaxAmt500(value);
	}   


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public SearchMaidIdOutCtx getSearchMaidIdOutCtx() {
            return new SearchMaidIdOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001TjfIp370Rec.hashCode();
        str += work.hashCode();
        str += holdVariables800.hashCode();
        str += ichgFeeRecords500.hashCode();
        str += ichgCalcVars800.hashCode();
        str += ip00164TableEntry.hashCode();
       return str.hashCode();
    }

    public SearchMaidIdInCtx clone() {
        SearchMaidIdInCtx cloneObj = new SearchMaidIdInCtx();
        cloneObj.sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        cloneObj.sys001TjfIp370Rec.set(sys001TjfIp370Rec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.holdVariables800 = new HoldVariables800();
        cloneObj.holdVariables800.set(holdVariables800.getClonedField());
        cloneObj.ichgFeeRecords500 = new IchgFeeRecords500();
        cloneObj.ichgFeeRecords500.set(ichgFeeRecords500.getClonedField());
        cloneObj.ichgCalcVars800 = new IchgCalcVars800();
        cloneObj.ichgCalcVars800.set(ichgCalcVars800.getClonedField());
        cloneObj.ip00164TableEntry = new Ip00164TableEntry();
        cloneObj.ip00164TableEntry.set(ip00164TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public SearchMaidIdInCtx getSearchMaidIdInCtx() {
            return new SearchMaidIdInCtx();
    }
     public class SearchMaidIdOutCtx implements Cloneable {
     Sys001TjfIp370Rec sys001TjfIp370Rec = Ip088030Ctx.this.getSys001TjfIp370Rec();
     Work work = Ip088030Ctx.this.getWork();
     HoldVariables800 holdVariables800 = Ip088030Ctx.this.getHoldVariables800();
     IchgFeeRecords500 ichgFeeRecords500 = Ip088030Ctx.this.getIchgFeeRecords500();
     IchgCalcVars800 ichgCalcVars800 = Ip088030Ctx.this.getIchgCalcVars800();
     Ip00164TableEntry ip00164TableEntry = Ip088030Ctx.this.getIp00164TableEntry();


public void setIchgIdx500(int ichgIdx500) { 
    Ip088030Ctx.this.ichgIdx500 = ichgIdx500;
}

public int getIchgIdx500() { 
    return Ip088030Ctx.this.ichgIdx500;
}
	/**
	 *	Returns the value of minAmt800
	 *	@return minAmt800
	 */
	public BigDecimal getMinAmt800() throws CFException {
   		return ichgCalcVars800.getMinAmt800();
	}


	 /**
     *	Returns String value of minAmt800
     *	@return minAmt800
     */
    public char[]  getMinAmt800String() throws CFException {
         return ichgCalcVars800.getMinAmt800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean minAmt800IsNumeric() {
        return ichgCalcVars800.minAmt800IsNumeric();
    }
	/**
	 * 	Update MinAmt800 with the passed number
	 *	@param number
	 */
	public void setMinAmt800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setMinAmt800(number);
   }

	/**
	 * 	Update MinAmt800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMinAmt800(char[] value)  throws CFException{
		ichgCalcVars800.setMinAmt800(value);
	}   

	/**
	 *	Returns the value of maxAmt800
	 *	@return maxAmt800
	 */
	public BigDecimal getMaxAmt800() throws CFException {
   		return ichgCalcVars800.getMaxAmt800();
	}


	 /**
     *	Returns String value of maxAmt800
     *	@return maxAmt800
     */
    public char[]  getMaxAmt800String() throws CFException {
         return ichgCalcVars800.getMaxAmt800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean maxAmt800IsNumeric() {
        return ichgCalcVars800.maxAmt800IsNumeric();
    }
	/**
	 * 	Update MaxAmt800 with the passed number
	 *	@param number
	 */
	public void setMaxAmt800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setMaxAmt800(number);
   }

	/**
	 * 	Update MaxAmt800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMaxAmt800(char[] value)  throws CFException{
		ichgCalcVars800.setMaxAmt800(value);
	}   

	/**
	 *	Returns the value of fiaAmt500
	 *	@return fiaAmt500
	 */
	public BigDecimal getFiaAmt500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getFiaAmt500();
	}


	 /**
     *	Returns String value of fiaAmt500
     *	@return fiaAmt500
     */
    public char[]  getFiaAmt500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getFiaAmt500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean fiaAmt500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).fiaAmt500IsNumeric();
    }
	/**
	 * 	Update FiaAmt500 with the passed number
	 *	@param number
	 */
	public void setFiaAmt500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setFiaAmt500(number);
   }

	/**
	 * 	Update FiaAmt500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setFiaAmt500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setFiaAmt500(value);
	}   

	/**
	 *	Test condition "Y" for isItIsEndOfLoop88100()
	 *	@return  Returns true if isItIsEndOfLoop88100() is "Y"
	 */
   public boolean isItIsEndOfLoop88100() throws CFException {
      return work.isItIsEndOfLoop88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsEndOfLoop88100True()  throws CFException{  			
    	work.setItIsEndOfLoop88100True();
   	}
	/**
	 *	Test condition "Y" for isItIsMaidFndY88100()
	 *	@return  Returns true if isItIsMaidFndY88100() is "Y"
	 */
   public boolean isItIsMaidFndY88100() throws CFException {
      return work.isItIsMaidFndY88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsMaidFndY88100True()  throws CFException{  			
    	work.setItIsMaidFndY88100True();
   	}
	/**
	 *	Returns the value of minAmt500
	 *	@return minAmt500
	 */
	public BigDecimal getMinAmt500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getMinAmt500();
	}


	 /**
     *	Returns String value of minAmt500
     *	@return minAmt500
     */
    public char[]  getMinAmt500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getMinAmt500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean minAmt500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).minAmt500IsNumeric();
    }
	/**
	 * 	Update MinAmt500 with the passed number
	 *	@param number
	 */
	public void setMinAmt500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMinAmt500(number);
   }

	/**
	 * 	Update MinAmt500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMinAmt500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMinAmt500(value);
	}   

	/**
	 *	Test condition "N" for isItIsNotEndLoop88100()
	 *	@return  Returns true if isItIsNotEndLoop88100() is "N"
	 */
   public boolean isItIsNotEndLoop88100() throws CFException {
      return work.isItIsNotEndLoop88100();
   }

	/**
	*  set values "N"
	*/
   	public void setItIsNotEndLoop88100True()  throws CFException{  			
    	work.setItIsNotEndLoop88100True();
   	}
	/**
	 *	Returns the value of viaRate800
	 *	@return viaRate800
	 */
	public BigDecimal getViaRate800() throws CFException {
   		return ichgCalcVars800.getViaRate800();
	}


	 /**
     *	Returns String value of viaRate800
     *	@return viaRate800
     */
    public char[]  getViaRate800String() throws CFException {
         return ichgCalcVars800.getViaRate800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean viaRate800IsNumeric() {
        return ichgCalcVars800.viaRate800IsNumeric();
    }
	/**
	 * 	Update ViaRate800 with the passed number
	 *	@param number
	 */
	public void setViaRate800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setViaRate800(number);
   }

	/**
	 * 	Update ViaRate800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setViaRate800(char[] value)  throws CFException{
		ichgCalcVars800.setViaRate800(value);
	}   

	/**
	 *	Test condition "N" for isItIsMaidFndN88100()
	 *	@return  Returns true if isItIsMaidFndN88100() is "N"
	 */
   public boolean isItIsMaidFndN88100() throws CFException {
      return work.isItIsMaidFndN88100();
   }

	/**
	*  set values "N"
	*/
   	public void setItIsMaidFndN88100True()  throws CFException{  			
    	work.setItIsMaidFndN88100True();
   	}
	/**
	 *	Returns the value of viaRate500
	 *	@return viaRate500
	 */
	public BigDecimal getViaRate500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getViaRate500();
	}


	 /**
     *	Returns String value of viaRate500
     *	@return viaRate500
     */
    public char[]  getViaRate500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getViaRate500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean viaRate500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).viaRate500IsNumeric();
    }
	/**
	 * 	Update ViaRate500 with the passed number
	 *	@param number
	 */
	public void setViaRate500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setViaRate500(number);
   }

	/**
	 * 	Update ViaRate500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setViaRate500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setViaRate500(value);
	}   

	/**
	 *	Returns the value of maxAmt500
	 *	@return maxAmt500
	 */
	public BigDecimal getMaxAmt500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getMaxAmt500();
	}


	 /**
     *	Returns String value of maxAmt500
     *	@return maxAmt500
     */
    public char[]  getMaxAmt500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getMaxAmt500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean maxAmt500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).maxAmt500IsNumeric();
    }
	/**
	 * 	Update MaxAmt500 with the passed number
	 *	@param number
	 */
	public void setMaxAmt500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMaxAmt500(number);
   }

	/**
	 * 	Update MaxAmt500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMaxAmt500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMaxAmt500(value);
	}   

	/**
	 *	Returns the value of fiaAmt800
	 *	@return fiaAmt800
	 */
	public BigDecimal getFiaAmt800() throws CFException {
   		return ichgCalcVars800.getFiaAmt800();
	}


	 /**
     *	Returns String value of fiaAmt800
     *	@return fiaAmt800
     */
    public char[]  getFiaAmt800String() throws CFException {
         return ichgCalcVars800.getFiaAmt800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean fiaAmt800IsNumeric() {
        return ichgCalcVars800.fiaAmt800IsNumeric();
    }
	/**
	 * 	Update FiaAmt800 with the passed number
	 *	@param number
	 */
	public void setFiaAmt800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setFiaAmt800(number);
   }

	/**
	 * 	Update FiaAmt800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setFiaAmt800(char[] value)  throws CFException{
		ichgCalcVars800.setFiaAmt800(value);
	}   


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001TjfIp370Rec.hashCode();
        str += work.hashCode();
        str += holdVariables800.hashCode();
        str += ichgFeeRecords500.hashCode();
        str += ichgCalcVars800.hashCode();
        str += ip00164TableEntry.hashCode();
       return str.hashCode();
    }

    public SearchMaidIdOutCtx clone() {
        SearchMaidIdOutCtx cloneObj = new SearchMaidIdOutCtx();
        cloneObj.sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        cloneObj.sys001TjfIp370Rec.set(sys001TjfIp370Rec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.holdVariables800 = new HoldVariables800();
        cloneObj.holdVariables800.set(holdVariables800.getClonedField());
        cloneObj.ichgFeeRecords500 = new IchgFeeRecords500();
        cloneObj.ichgFeeRecords500.set(ichgFeeRecords500.getClonedField());
        cloneObj.ichgCalcVars800 = new IchgCalcVars800();
        cloneObj.ichgCalcVars800.set(ichgCalcVars800.getClonedField());
        cloneObj.ip00164TableEntry = new Ip00164TableEntry();
        cloneObj.ip00164TableEntry.set(ip00164TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public SearchMaidIdOutCtx getSearchMaidIdOutCtx() {
            return new SearchMaidIdOutCtx();
    }
     public class CheckMccCodeInCtx implements Cloneable {
     HoldVariables800 holdVariables800 = Ip088030Ctx.this.getHoldVariables800();
     Work work = Ip088030Ctx.this.getWork();
     Ip00754EntryFoundGroup ip00754EntryFoundGroup = Ip088030Ctx.this.getIp00754EntryFoundGroup();
     Ip00754TableEntry ip00754TableEntry = Ip088030Ctx.this.getIp00754TableEntry();

	/**
	 *	Returns the value of ptrIp282010800
	 *	@return ptrIp282010800
	 */
   public char[] getPtrIp282010800() throws CFException  {              
   		return work.getPtrIp282010800();
   }

  
	/**
	*  set variable ptrIp282010800
	*  @param value
	**/
   public void setPtrIp282010800(char[] value) throws CFException {
      work.setPtrIp282010800(value);
   } 

	/**
	 *	Returns the value of mccCode800
	 *	@return mccCode800
	 */
   public char[] getMccCode800() throws CFException  {              
   		return holdVariables800.getMccCode800();
   }

  
	/**
	*  set variable mccCode800
	*  @param value
	**/
   public void setMccCode800(char[] value) throws CFException {
      holdVariables800.setMccCode800(value);
   } 

     /**
	 * 	Update MccCode800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMccCode800(char[] source, int sourceIndex) throws CFException {
      holdVariables800.setMccCode800(source, sourceIndex);
   	
   }
   
   public void setMccCode800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      holdVariables800.setMccCode800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MccCode800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMccCode800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setMccCode800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MccCode800 with another Field
	 *	@param value
	 */
   public void setMccCode800(Field source) {
      holdVariables800.setMccCode800(source);
   }  
   
     /**
	 * 	Update MccCode800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMccCode800(Field source, int sourceIndex,int sourceLen) {
      holdVariables800.setMccCode800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MccCode800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMccCode800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setMccCode800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public CheckMccCodeOutCtx getCheckMccCodeOutCtx() {
            return new CheckMccCodeOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += holdVariables800.hashCode();
        str += work.hashCode();
        str += ip00754EntryFoundGroup.hashCode();
        str += ip00754TableEntry.hashCode();
       return str.hashCode();
    }

    public CheckMccCodeInCtx clone() {
        CheckMccCodeInCtx cloneObj = new CheckMccCodeInCtx();
        cloneObj.holdVariables800 = new HoldVariables800();
        cloneObj.holdVariables800.set(holdVariables800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip00754EntryFoundGroup = new Ip00754EntryFoundGroup();
        cloneObj.ip00754EntryFoundGroup.set(ip00754EntryFoundGroup.getClonedField());
        cloneObj.ip00754TableEntry = new Ip00754TableEntry();
        cloneObj.ip00754TableEntry.set(ip00754TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public CheckMccCodeInCtx getCheckMccCodeInCtx() {
            return new CheckMccCodeInCtx();
    }
     public class CheckMccCodeOutCtx implements Cloneable {
     HoldVariables800 holdVariables800 = Ip088030Ctx.this.getHoldVariables800();
     Work work = Ip088030Ctx.this.getWork();
     Ip00754EntryFoundGroup ip00754EntryFoundGroup = Ip088030Ctx.this.getIp00754EntryFoundGroup();
     Ip00754TableEntry ip00754TableEntry = Ip088030Ctx.this.getIp00754TableEntry();

	/**
	 *	Test condition "N" for isIp00754EntryFoundN88()
	 *	@return  Returns true if isIp00754EntryFoundN88() is "N"
	 */
   public boolean isIp00754EntryFoundN88() throws CFException {
      return ip00754EntryFoundGroup.isIp00754EntryFoundN88();
   }

	/**
	*  set values "N"
	*/
   	public void setIp00754EntryFoundN88True()  throws CFException{  			
    	ip00754EntryFoundGroup.setIp00754EntryFoundN88True();
   	}
	/**
	 *	Returns the value of ip00754MccVals
	 *	@return ip00754MccVals
	 */
	public int getIp00754MccVals() throws CFException {
   		return ip00754TableEntry.getIp00754MccValsKey().getIp00754MccVals();
	}


	/**
	 *	Returns String value of ip00754MccVals
	 *	@return ip00754MccVals
	 */
	public char[]  getIp00754MccValsString() throws CFException {
	     return String.valueOf(ip00754TableEntry.getIp00754MccValsKey().getIp00754MccValsString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00754MccValsIsNumeric()  throws CFException{
	    return ip00754TableEntry.getIp00754MccValsKey().ip00754MccValsIsNumeric();
	}

	/**
	 * 	Update Ip00754MccVals with the passed value
	 *	@param number
	 */
	public void setIp00754MccVals(int number)  throws CFException{
		ip00754TableEntry.getIp00754MccValsKey().setIp00754MccVals(number);
	}
	

	public void setIp00754MccVals(long number)  throws CFException{
	    ip00754TableEntry.getIp00754MccValsKey().setIp00754MccVals(number);
	}
	
	
	/**
	 * 	Update Ip00754MccVals with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00754MccVals(char[] value)  throws CFException {
		ip00754TableEntry.getIp00754MccValsKey().setIp00754MccVals(value);
	}
	
	/**
	 * 	Update Ip00754MccVals with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00754MccValsString(char[] value)  throws CFException{
		ip00754TableEntry.getIp00754MccValsKey().setIp00754MccVals(value);
	}	

	/**
	 *	Returns the value of mccCode800
	 *	@return mccCode800
	 */
   public char[] getMccCode800() throws CFException  {              
   		return holdVariables800.getMccCode800();
   }

  
	/**
	*  set variable mccCode800
	*  @param value
	**/
   public void setMccCode800(char[] value) throws CFException {
      holdVariables800.setMccCode800(value);
   } 

     /**
	 * 	Update MccCode800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMccCode800(char[] source, int sourceIndex) throws CFException {
      holdVariables800.setMccCode800(source, sourceIndex);
   	
   }
   
   public void setMccCode800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      holdVariables800.setMccCode800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MccCode800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMccCode800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setMccCode800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MccCode800 with another Field
	 *	@param value
	 */
   public void setMccCode800(Field source) {
      holdVariables800.setMccCode800(source);
   }  
   
     /**
	 * 	Update MccCode800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMccCode800(Field source, int sourceIndex,int sourceLen) {
      holdVariables800.setMccCode800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MccCode800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMccCode800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setMccCode800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "9999" for isInvalidMcc88800()
	 *	@return  Returns true if isInvalidMcc88800() is "9999"
	 */
   public boolean isInvalidMcc88800() throws CFException {
      return holdVariables800.isInvalidMcc88800();
   }

	/**
	*  set values "9999"
	*/
   	public void setInvalidMcc88800True()  throws CFException{  			
    	holdVariables800.setInvalidMcc88800True();
   	}

        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += holdVariables800.hashCode();
        str += work.hashCode();
        str += ip00754EntryFoundGroup.hashCode();
        str += ip00754TableEntry.hashCode();
       return str.hashCode();
    }

    public CheckMccCodeOutCtx clone() {
        CheckMccCodeOutCtx cloneObj = new CheckMccCodeOutCtx();
        cloneObj.holdVariables800 = new HoldVariables800();
        cloneObj.holdVariables800.set(holdVariables800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip00754EntryFoundGroup = new Ip00754EntryFoundGroup();
        cloneObj.ip00754EntryFoundGroup.set(ip00754EntryFoundGroup.getClonedField());
        cloneObj.ip00754TableEntry = new Ip00754TableEntry();
        cloneObj.ip00754TableEntry.set(ip00754TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public CheckMccCodeOutCtx getCheckMccCodeOutCtx() {
            return new CheckMccCodeOutCtx();
    }
     public class SearchTxnMccAmtInCtx implements Cloneable {
     Sys001TjfIp370Rec sys001TjfIp370Rec = Ip088030Ctx.this.getSys001TjfIp370Rec();
     Work work = Ip088030Ctx.this.getWork();
     HoldVariables800 holdVariables800 = Ip088030Ctx.this.getHoldVariables800();
     IchgFeeRecords500 ichgFeeRecords500 = Ip088030Ctx.this.getIchgFeeRecords500();
     IchgCalcVars800 ichgCalcVars800 = Ip088030Ctx.this.getIchgCalcVars800();
     Ip00164TableEntry ip00164TableEntry = Ip088030Ctx.this.getIp00164TableEntry();

	/**
	 *	Returns the value of recType500
	 *	@return recType500
	 */
   public char[] getRecType500(int index) throws CFException  {              
   		return ichgFeeRecords500.getIchgEntry500(index).getRecType500();
   }

  
	/**
	*  set variable recType500
	*  @param value
	**/
   public void setRecType500(int index,char[] value) throws CFException {
      ichgFeeRecords500.getIchgEntry500(index).setRecType500(value);
   } 

     /**
	 * 	Update RecType500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecType500(int index,char[] source, int sourceIndex) throws CFException {
      ichgFeeRecords500.getIchgEntry500(index).setRecType500(source, sourceIndex);
   	
   }
   
   public void setRecType500(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ichgFeeRecords500.getIchgEntry500(index).setRecType500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RecType500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecType500(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ichgFeeRecords500.getIchgEntry500(index).setRecType500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RecType500 with another Field
	 *	@param value
	 */
   public void setRecType500(int index,Field source) {
      ichgFeeRecords500.getIchgEntry500(index).setRecType500(source);
   }  
   
     /**
	 * 	Update RecType500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecType500(int index,Field source, int sourceIndex,int sourceLen) {
      ichgFeeRecords500.getIchgEntry500(index).setRecType500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RecType500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecType500(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ichgFeeRecords500.getIchgEntry500(index).setRecType500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public long getIp98152ClrTxnAmt() throws CFException {  
        return sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrTxnAmt();
}
	/**
	 * 	Update Ip98152ClrTxnAmt with the passed value
	 *	@param number
	 */
	public void setIp98152ClrTxnAmt(long number)  throws CFException{
		sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnAmt(number);
	}



	/**
	 *	Returns the value of mcc500
	 *	@return mcc500
	 */
   public char[] getMcc500(int index) throws CFException  {              
   		return ichgFeeRecords500.getIchgEntry500(index).getMcc500();
   }

  
	/**
	*  set variable mcc500
	*  @param value
	**/
   public void setMcc500(int index,char[] value) throws CFException {
      ichgFeeRecords500.getIchgEntry500(index).setMcc500(value);
   } 

     /**
	 * 	Update Mcc500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMcc500(int index,char[] source, int sourceIndex) throws CFException {
      ichgFeeRecords500.getIchgEntry500(index).setMcc500(source, sourceIndex);
   	
   }
   
   public void setMcc500(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ichgFeeRecords500.getIchgEntry500(index).setMcc500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Mcc500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMcc500(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ichgFeeRecords500.getIchgEntry500(index).setMcc500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Mcc500 with another Field
	 *	@param value
	 */
   public void setMcc500(int index,Field source) {
      ichgFeeRecords500.getIchgEntry500(index).setMcc500(source);
   }  
   
     /**
	 * 	Update Mcc500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMcc500(int index,Field source, int sourceIndex,int sourceLen) {
      ichgFeeRecords500.getIchgEntry500(index).setMcc500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Mcc500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMcc500(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ichgFeeRecords500.getIchgEntry500(index).setMcc500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setIchgIdx500(int ichgIdx500) { 
    Ip088030Ctx.this.ichgIdx500 = ichgIdx500;
}

public int getIchgIdx500() { 
    return Ip088030Ctx.this.ichgIdx500;
}
	/**
	 *	Returns the value of ichgEntriesCnt500
	 *	@return ichgEntriesCnt500
	 */
	public short getIchgEntriesCnt500() throws CFException {        
   		return ichgFeeRecords500.getIchgEntriesCnt500();
	}
	
	/**
	 * 	Update IchgEntriesCnt500 with the passed value
	 *	@param number
	 */
	public void setIchgEntriesCnt500(short number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesCnt500(number);
	}

	public void setIchgEntriesCnt500(int number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesCnt500((short)number);
	}

	public void setIchgEntriesCnt500(long number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesCnt500((short)number);
	}



	/**
	 *	Returns the value of txnLowAmtU500
	 *	@return txnLowAmtU500
	 */
	public long getTxnLowAmtU500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getTxnLowAmtU500();
	}


	/**
	 *	Returns String value of txnLowAmtU500
	 *	@return txnLowAmtU500
	 */
	public char[]  getTxnLowAmtU500String(int index) throws CFException {
	     return String.valueOf(ichgFeeRecords500.getIchgEntry500(index).getTxnLowAmtU500String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean txnLowAmtU500IsNumeric(int index)  throws CFException{
	    return ichgFeeRecords500.getIchgEntry500(index - 1).txnLowAmtU500IsNumeric();
	}

	/**
	 * 	Update TxnLowAmtU500 with the passed value
	 *	@param number
	 */
	public void setTxnLowAmtU500(int index,long number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setTxnLowAmtU500(number);
	}
	

	
	/**
	 * 	Update TxnLowAmtU500 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTxnLowAmtU500(int index,char[] value)  throws CFException {
		ichgFeeRecords500.getIchgEntry500(index).setTxnLowAmtU500(value);
	}
	
	/**
	 * 	Update TxnLowAmtU500 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTxnLowAmtU500String(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setTxnLowAmtU500(value);
	}	

	/**
	 *	Returns the value of maid500
	 *	@return maid500
	 */
   public char[] getMaid500(int index) throws CFException  {              
   		return ichgFeeRecords500.getIchgEntry500(index).getMaid500();
   }

  
	/**
	*  set variable maid500
	*  @param value
	**/
   public void setMaid500(int index,char[] value) throws CFException {
      ichgFeeRecords500.getIchgEntry500(index).setMaid500(value);
   } 

     /**
	 * 	Update Maid500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMaid500(int index,char[] source, int sourceIndex) throws CFException {
      ichgFeeRecords500.getIchgEntry500(index).setMaid500(source, sourceIndex);
   	
   }
   
   public void setMaid500(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ichgFeeRecords500.getIchgEntry500(index).setMaid500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Maid500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMaid500(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ichgFeeRecords500.getIchgEntry500(index).setMaid500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Maid500 with another Field
	 *	@param value
	 */
   public void setMaid500(int index,Field source) {
      ichgFeeRecords500.getIchgEntry500(index).setMaid500(source);
   }  
   
     /**
	 * 	Update Maid500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMaid500(int index,Field source, int sourceIndex,int sourceLen) {
      ichgFeeRecords500.getIchgEntry500(index).setMaid500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Maid500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMaid500(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ichgFeeRecords500.getIchgEntry500(index).setMaid500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fiaAmt500
	 *	@return fiaAmt500
	 */
	public BigDecimal getFiaAmt500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getFiaAmt500();
	}


	 /**
     *	Returns String value of fiaAmt500
     *	@return fiaAmt500
     */
    public char[]  getFiaAmt500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getFiaAmt500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean fiaAmt500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).fiaAmt500IsNumeric();
    }
	/**
	 * 	Update FiaAmt500 with the passed number
	 *	@param number
	 */
	public void setFiaAmt500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setFiaAmt500(number);
   }

	/**
	 * 	Update FiaAmt500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setFiaAmt500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setFiaAmt500(value);
	}   

	/**
	 *	Returns the value of txnHighAmtU500
	 *	@return txnHighAmtU500
	 */
	public long getTxnHighAmtU500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getTxnHighAmtU500();
	}


	/**
	 *	Returns String value of txnHighAmtU500
	 *	@return txnHighAmtU500
	 */
	public char[]  getTxnHighAmtU500String(int index) throws CFException {
	     return String.valueOf(ichgFeeRecords500.getIchgEntry500(index).getTxnHighAmtU500String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean txnHighAmtU500IsNumeric(int index)  throws CFException{
	    return ichgFeeRecords500.getIchgEntry500(index - 1).txnHighAmtU500IsNumeric();
	}

	/**
	 * 	Update TxnHighAmtU500 with the passed value
	 *	@param number
	 */
	public void setTxnHighAmtU500(int index,long number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setTxnHighAmtU500(number);
	}
	

	
	/**
	 * 	Update TxnHighAmtU500 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTxnHighAmtU500(int index,char[] value)  throws CFException {
		ichgFeeRecords500.getIchgEntry500(index).setTxnHighAmtU500(value);
	}
	
	/**
	 * 	Update TxnHighAmtU500 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTxnHighAmtU500String(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setTxnHighAmtU500(value);
	}	

	/**
	 *	Returns the value of mccCode800
	 *	@return mccCode800
	 */
   public char[] getMccCode800() throws CFException  {              
   		return holdVariables800.getMccCode800();
   }

  
	/**
	*  set variable mccCode800
	*  @param value
	**/
   public void setMccCode800(char[] value) throws CFException {
      holdVariables800.setMccCode800(value);
   } 

     /**
	 * 	Update MccCode800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMccCode800(char[] source, int sourceIndex) throws CFException {
      holdVariables800.setMccCode800(source, sourceIndex);
   	
   }
   
   public void setMccCode800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      holdVariables800.setMccCode800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MccCode800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMccCode800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setMccCode800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MccCode800 with another Field
	 *	@param value
	 */
   public void setMccCode800(Field source) {
      holdVariables800.setMccCode800(source);
   }  
   
     /**
	 * 	Update MccCode800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMccCode800(Field source, int sourceIndex,int sourceLen) {
      holdVariables800.setMccCode800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MccCode800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMccCode800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setMccCode800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip00164ProdCatCd
	 *	@return ip00164ProdCatCd
	 */
   public char[] getIp00164ProdCatCd() throws CFException  {              
   		return ip00164TableEntry.getIp00164TableData().getIp00164ProdCatCd();
   }

  
	/**
	*  set variable ip00164ProdCatCd
	*  @param value
	**/
   public void setIp00164ProdCatCd(char[] value) throws CFException {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(value);
   } 

     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00164ProdCatCd(char[] source, int sourceIndex) throws CFException {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex);
   	
   }
   
   public void setIp00164ProdCatCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00164ProdCatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00164ProdCatCd with another Field
	 *	@param value
	 */
   public void setIp00164ProdCatCd(Field source) {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source);
   }  
   
     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00164ProdCatCd(Field source, int sourceIndex,int sourceLen) {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00164ProdCatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of minAmt500
	 *	@return minAmt500
	 */
	public BigDecimal getMinAmt500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getMinAmt500();
	}


	 /**
     *	Returns String value of minAmt500
     *	@return minAmt500
     */
    public char[]  getMinAmt500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getMinAmt500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean minAmt500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).minAmt500IsNumeric();
    }
	/**
	 * 	Update MinAmt500 with the passed number
	 *	@param number
	 */
	public void setMinAmt500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMinAmt500(number);
   }

	/**
	 * 	Update MinAmt500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMinAmt500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMinAmt500(value);
	}   

	/**
	 *	Returns the value of viaRate500
	 *	@return viaRate500
	 */
	public BigDecimal getViaRate500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getViaRate500();
	}


	 /**
     *	Returns String value of viaRate500
     *	@return viaRate500
     */
    public char[]  getViaRate500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getViaRate500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean viaRate500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).viaRate500IsNumeric();
    }
	/**
	 * 	Update ViaRate500 with the passed number
	 *	@param number
	 */
	public void setViaRate500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setViaRate500(number);
   }

	/**
	 * 	Update ViaRate500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setViaRate500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setViaRate500(value);
	}   

	/**
	 *	Returns the value of maxAmt500
	 *	@return maxAmt500
	 */
	public BigDecimal getMaxAmt500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getMaxAmt500();
	}


	 /**
     *	Returns String value of maxAmt500
     *	@return maxAmt500
     */
    public char[]  getMaxAmt500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getMaxAmt500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean maxAmt500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).maxAmt500IsNumeric();
    }
	/**
	 * 	Update MaxAmt500 with the passed number
	 *	@param number
	 */
	public void setMaxAmt500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMaxAmt500(number);
   }

	/**
	 * 	Update MaxAmt500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMaxAmt500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMaxAmt500(value);
	}   


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public SearchTxnMccAmtOutCtx getSearchTxnMccAmtOutCtx() {
            return new SearchTxnMccAmtOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001TjfIp370Rec.hashCode();
        str += work.hashCode();
        str += holdVariables800.hashCode();
        str += ichgFeeRecords500.hashCode();
        str += ichgCalcVars800.hashCode();
        str += ip00164TableEntry.hashCode();
       return str.hashCode();
    }

    public SearchTxnMccAmtInCtx clone() {
        SearchTxnMccAmtInCtx cloneObj = new SearchTxnMccAmtInCtx();
        cloneObj.sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        cloneObj.sys001TjfIp370Rec.set(sys001TjfIp370Rec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.holdVariables800 = new HoldVariables800();
        cloneObj.holdVariables800.set(holdVariables800.getClonedField());
        cloneObj.ichgFeeRecords500 = new IchgFeeRecords500();
        cloneObj.ichgFeeRecords500.set(ichgFeeRecords500.getClonedField());
        cloneObj.ichgCalcVars800 = new IchgCalcVars800();
        cloneObj.ichgCalcVars800.set(ichgCalcVars800.getClonedField());
        cloneObj.ip00164TableEntry = new Ip00164TableEntry();
        cloneObj.ip00164TableEntry.set(ip00164TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public SearchTxnMccAmtInCtx getSearchTxnMccAmtInCtx() {
            return new SearchTxnMccAmtInCtx();
    }
     public class SearchTxnMccAmtOutCtx implements Cloneable {
     Sys001TjfIp370Rec sys001TjfIp370Rec = Ip088030Ctx.this.getSys001TjfIp370Rec();
     Work work = Ip088030Ctx.this.getWork();
     HoldVariables800 holdVariables800 = Ip088030Ctx.this.getHoldVariables800();
     IchgFeeRecords500 ichgFeeRecords500 = Ip088030Ctx.this.getIchgFeeRecords500();
     IchgCalcVars800 ichgCalcVars800 = Ip088030Ctx.this.getIchgCalcVars800();
     Ip00164TableEntry ip00164TableEntry = Ip088030Ctx.this.getIp00164TableEntry();


public void setIchgIdx500(int ichgIdx500) { 
    Ip088030Ctx.this.ichgIdx500 = ichgIdx500;
}

public int getIchgIdx500() { 
    return Ip088030Ctx.this.ichgIdx500;
}
	/**
	 *	Test condition "N" for isItIsMccFndN88100()
	 *	@return  Returns true if isItIsMccFndN88100() is "N"
	 */
   public boolean isItIsMccFndN88100() throws CFException {
      return work.isItIsMccFndN88100();
   }

	/**
	*  set values "N"
	*/
   	public void setItIsMccFndN88100True()  throws CFException{  			
    	work.setItIsMccFndN88100True();
   	}
	/**
	 *	Returns the value of minAmt800
	 *	@return minAmt800
	 */
	public BigDecimal getMinAmt800() throws CFException {
   		return ichgCalcVars800.getMinAmt800();
	}


	 /**
     *	Returns String value of minAmt800
     *	@return minAmt800
     */
    public char[]  getMinAmt800String() throws CFException {
         return ichgCalcVars800.getMinAmt800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean minAmt800IsNumeric() {
        return ichgCalcVars800.minAmt800IsNumeric();
    }
	/**
	 * 	Update MinAmt800 with the passed number
	 *	@param number
	 */
	public void setMinAmt800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setMinAmt800(number);
   }

	/**
	 * 	Update MinAmt800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMinAmt800(char[] value)  throws CFException{
		ichgCalcVars800.setMinAmt800(value);
	}   

	/**
	 *	Returns the value of maxAmt800
	 *	@return maxAmt800
	 */
	public BigDecimal getMaxAmt800() throws CFException {
   		return ichgCalcVars800.getMaxAmt800();
	}


	 /**
     *	Returns String value of maxAmt800
     *	@return maxAmt800
     */
    public char[]  getMaxAmt800String() throws CFException {
         return ichgCalcVars800.getMaxAmt800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean maxAmt800IsNumeric() {
        return ichgCalcVars800.maxAmt800IsNumeric();
    }
	/**
	 * 	Update MaxAmt800 with the passed number
	 *	@param number
	 */
	public void setMaxAmt800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setMaxAmt800(number);
   }

	/**
	 * 	Update MaxAmt800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMaxAmt800(char[] value)  throws CFException{
		ichgCalcVars800.setMaxAmt800(value);
	}   

	/**
	 *	Returns the value of fiaAmt500
	 *	@return fiaAmt500
	 */
	public BigDecimal getFiaAmt500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getFiaAmt500();
	}


	 /**
     *	Returns String value of fiaAmt500
     *	@return fiaAmt500
     */
    public char[]  getFiaAmt500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getFiaAmt500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean fiaAmt500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).fiaAmt500IsNumeric();
    }
	/**
	 * 	Update FiaAmt500 with the passed number
	 *	@param number
	 */
	public void setFiaAmt500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setFiaAmt500(number);
   }

	/**
	 * 	Update FiaAmt500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setFiaAmt500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setFiaAmt500(value);
	}   

	/**
	 *	Test condition "Y" for isItIsEndOfLoop88100()
	 *	@return  Returns true if isItIsEndOfLoop88100() is "Y"
	 */
   public boolean isItIsEndOfLoop88100() throws CFException {
      return work.isItIsEndOfLoop88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsEndOfLoop88100True()  throws CFException{  			
    	work.setItIsEndOfLoop88100True();
   	}
	/**
	 *	Test condition "Y" for isItIsMccFndY88100()
	 *	@return  Returns true if isItIsMccFndY88100() is "Y"
	 */
   public boolean isItIsMccFndY88100() throws CFException {
      return work.isItIsMccFndY88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsMccFndY88100True()  throws CFException{  			
    	work.setItIsMccFndY88100True();
   	}
	/**
	 *	Returns the value of minAmt500
	 *	@return minAmt500
	 */
	public BigDecimal getMinAmt500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getMinAmt500();
	}


	 /**
     *	Returns String value of minAmt500
     *	@return minAmt500
     */
    public char[]  getMinAmt500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getMinAmt500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean minAmt500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).minAmt500IsNumeric();
    }
	/**
	 * 	Update MinAmt500 with the passed number
	 *	@param number
	 */
	public void setMinAmt500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMinAmt500(number);
   }

	/**
	 * 	Update MinAmt500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMinAmt500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMinAmt500(value);
	}   

	/**
	 *	Test condition "N" for isItIsNotEndLoop88100()
	 *	@return  Returns true if isItIsNotEndLoop88100() is "N"
	 */
   public boolean isItIsNotEndLoop88100() throws CFException {
      return work.isItIsNotEndLoop88100();
   }

	/**
	*  set values "N"
	*/
   	public void setItIsNotEndLoop88100True()  throws CFException{  			
    	work.setItIsNotEndLoop88100True();
   	}
	/**
	 *	Returns the value of viaRate800
	 *	@return viaRate800
	 */
	public BigDecimal getViaRate800() throws CFException {
   		return ichgCalcVars800.getViaRate800();
	}


	 /**
     *	Returns String value of viaRate800
     *	@return viaRate800
     */
    public char[]  getViaRate800String() throws CFException {
         return ichgCalcVars800.getViaRate800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean viaRate800IsNumeric() {
        return ichgCalcVars800.viaRate800IsNumeric();
    }
	/**
	 * 	Update ViaRate800 with the passed number
	 *	@param number
	 */
	public void setViaRate800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setViaRate800(number);
   }

	/**
	 * 	Update ViaRate800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setViaRate800(char[] value)  throws CFException{
		ichgCalcVars800.setViaRate800(value);
	}   

	/**
	 *	Returns the value of viaRate500
	 *	@return viaRate500
	 */
	public BigDecimal getViaRate500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getViaRate500();
	}


	 /**
     *	Returns String value of viaRate500
     *	@return viaRate500
     */
    public char[]  getViaRate500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getViaRate500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean viaRate500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).viaRate500IsNumeric();
    }
	/**
	 * 	Update ViaRate500 with the passed number
	 *	@param number
	 */
	public void setViaRate500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setViaRate500(number);
   }

	/**
	 * 	Update ViaRate500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setViaRate500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setViaRate500(value);
	}   

	/**
	 *	Returns the value of maxAmt500
	 *	@return maxAmt500
	 */
	public BigDecimal getMaxAmt500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getMaxAmt500();
	}


	 /**
     *	Returns String value of maxAmt500
     *	@return maxAmt500
     */
    public char[]  getMaxAmt500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getMaxAmt500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean maxAmt500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).maxAmt500IsNumeric();
    }
	/**
	 * 	Update MaxAmt500 with the passed number
	 *	@param number
	 */
	public void setMaxAmt500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMaxAmt500(number);
   }

	/**
	 * 	Update MaxAmt500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMaxAmt500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMaxAmt500(value);
	}   

	/**
	 *	Returns the value of fiaAmt800
	 *	@return fiaAmt800
	 */
	public BigDecimal getFiaAmt800() throws CFException {
   		return ichgCalcVars800.getFiaAmt800();
	}


	 /**
     *	Returns String value of fiaAmt800
     *	@return fiaAmt800
     */
    public char[]  getFiaAmt800String() throws CFException {
         return ichgCalcVars800.getFiaAmt800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean fiaAmt800IsNumeric() {
        return ichgCalcVars800.fiaAmt800IsNumeric();
    }
	/**
	 * 	Update FiaAmt800 with the passed number
	 *	@param number
	 */
	public void setFiaAmt800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setFiaAmt800(number);
   }

	/**
	 * 	Update FiaAmt800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setFiaAmt800(char[] value)  throws CFException{
		ichgCalcVars800.setFiaAmt800(value);
	}   


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001TjfIp370Rec.hashCode();
        str += work.hashCode();
        str += holdVariables800.hashCode();
        str += ichgFeeRecords500.hashCode();
        str += ichgCalcVars800.hashCode();
        str += ip00164TableEntry.hashCode();
       return str.hashCode();
    }

    public SearchTxnMccAmtOutCtx clone() {
        SearchTxnMccAmtOutCtx cloneObj = new SearchTxnMccAmtOutCtx();
        cloneObj.sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        cloneObj.sys001TjfIp370Rec.set(sys001TjfIp370Rec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.holdVariables800 = new HoldVariables800();
        cloneObj.holdVariables800.set(holdVariables800.getClonedField());
        cloneObj.ichgFeeRecords500 = new IchgFeeRecords500();
        cloneObj.ichgFeeRecords500.set(ichgFeeRecords500.getClonedField());
        cloneObj.ichgCalcVars800 = new IchgCalcVars800();
        cloneObj.ichgCalcVars800.set(ichgCalcVars800.getClonedField());
        cloneObj.ip00164TableEntry = new Ip00164TableEntry();
        cloneObj.ip00164TableEntry.set(ip00164TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public SearchTxnMccAmtOutCtx getSearchTxnMccAmtOutCtx() {
            return new SearchTxnMccAmtOutCtx();
    }
     public class SearchOthersGrpInCtx implements Cloneable {
     Sys001TjfIp370Rec sys001TjfIp370Rec = Ip088030Ctx.this.getSys001TjfIp370Rec();
     Work work = Ip088030Ctx.this.getWork();
     HoldVariables800 holdVariables800 = Ip088030Ctx.this.getHoldVariables800();
     IchgFeeRecords500 ichgFeeRecords500 = Ip088030Ctx.this.getIchgFeeRecords500();
     IchgCalcVars800 ichgCalcVars800 = Ip088030Ctx.this.getIchgCalcVars800();
     Ip00164TableEntry ip00164TableEntry = Ip088030Ctx.this.getIp00164TableEntry();

	/**
	 *	Returns the value of recType500
	 *	@return recType500
	 */
   public char[] getRecType500(int index) throws CFException  {              
   		return ichgFeeRecords500.getIchgEntry500(index).getRecType500();
   }

  
	/**
	*  set variable recType500
	*  @param value
	**/
   public void setRecType500(int index,char[] value) throws CFException {
      ichgFeeRecords500.getIchgEntry500(index).setRecType500(value);
   } 

     /**
	 * 	Update RecType500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecType500(int index,char[] source, int sourceIndex) throws CFException {
      ichgFeeRecords500.getIchgEntry500(index).setRecType500(source, sourceIndex);
   	
   }
   
   public void setRecType500(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ichgFeeRecords500.getIchgEntry500(index).setRecType500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RecType500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecType500(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ichgFeeRecords500.getIchgEntry500(index).setRecType500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RecType500 with another Field
	 *	@param value
	 */
   public void setRecType500(int index,Field source) {
      ichgFeeRecords500.getIchgEntry500(index).setRecType500(source);
   }  
   
     /**
	 * 	Update RecType500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecType500(int index,Field source, int sourceIndex,int sourceLen) {
      ichgFeeRecords500.getIchgEntry500(index).setRecType500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RecType500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecType500(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ichgFeeRecords500.getIchgEntry500(index).setRecType500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public long getIp98152ClrTxnAmt() throws CFException {  
        return sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrTxnAmt();
}
	/**
	 * 	Update Ip98152ClrTxnAmt with the passed value
	 *	@param number
	 */
	public void setIp98152ClrTxnAmt(long number)  throws CFException{
		sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnAmt(number);
	}



	/**
	 *	Returns the value of mcc500
	 *	@return mcc500
	 */
   public char[] getMcc500(int index) throws CFException  {              
   		return ichgFeeRecords500.getIchgEntry500(index).getMcc500();
   }

  
	/**
	*  set variable mcc500
	*  @param value
	**/
   public void setMcc500(int index,char[] value) throws CFException {
      ichgFeeRecords500.getIchgEntry500(index).setMcc500(value);
   } 

     /**
	 * 	Update Mcc500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMcc500(int index,char[] source, int sourceIndex) throws CFException {
      ichgFeeRecords500.getIchgEntry500(index).setMcc500(source, sourceIndex);
   	
   }
   
   public void setMcc500(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ichgFeeRecords500.getIchgEntry500(index).setMcc500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Mcc500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMcc500(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ichgFeeRecords500.getIchgEntry500(index).setMcc500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Mcc500 with another Field
	 *	@param value
	 */
   public void setMcc500(int index,Field source) {
      ichgFeeRecords500.getIchgEntry500(index).setMcc500(source);
   }  
   
     /**
	 * 	Update Mcc500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMcc500(int index,Field source, int sourceIndex,int sourceLen) {
      ichgFeeRecords500.getIchgEntry500(index).setMcc500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Mcc500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMcc500(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ichgFeeRecords500.getIchgEntry500(index).setMcc500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setIchgIdx500(int ichgIdx500) { 
    Ip088030Ctx.this.ichgIdx500 = ichgIdx500;
}

public int getIchgIdx500() { 
    return Ip088030Ctx.this.ichgIdx500;
}
	/**
	 *	Returns the value of ichgEntriesCnt500
	 *	@return ichgEntriesCnt500
	 */
	public short getIchgEntriesCnt500() throws CFException {        
   		return ichgFeeRecords500.getIchgEntriesCnt500();
	}
	
	/**
	 * 	Update IchgEntriesCnt500 with the passed value
	 *	@param number
	 */
	public void setIchgEntriesCnt500(short number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesCnt500(number);
	}

	public void setIchgEntriesCnt500(int number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesCnt500((short)number);
	}

	public void setIchgEntriesCnt500(long number)  throws CFException{
		ichgFeeRecords500.setIchgEntriesCnt500((short)number);
	}



	/**
	 *	Returns the value of txnLowAmtU500
	 *	@return txnLowAmtU500
	 */
	public long getTxnLowAmtU500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getTxnLowAmtU500();
	}


	/**
	 *	Returns String value of txnLowAmtU500
	 *	@return txnLowAmtU500
	 */
	public char[]  getTxnLowAmtU500String(int index) throws CFException {
	     return String.valueOf(ichgFeeRecords500.getIchgEntry500(index).getTxnLowAmtU500String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean txnLowAmtU500IsNumeric(int index)  throws CFException{
	    return ichgFeeRecords500.getIchgEntry500(index - 1).txnLowAmtU500IsNumeric();
	}

	/**
	 * 	Update TxnLowAmtU500 with the passed value
	 *	@param number
	 */
	public void setTxnLowAmtU500(int index,long number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setTxnLowAmtU500(number);
	}
	

	
	/**
	 * 	Update TxnLowAmtU500 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTxnLowAmtU500(int index,char[] value)  throws CFException {
		ichgFeeRecords500.getIchgEntry500(index).setTxnLowAmtU500(value);
	}
	
	/**
	 * 	Update TxnLowAmtU500 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTxnLowAmtU500String(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setTxnLowAmtU500(value);
	}	

	/**
	 *	Returns the value of prodId800
	 *	@return prodId800
	 */
   public char[] getProdId800() throws CFException  {              
   		return holdVariables800.getProdId800();
   }

  
	/**
	*  set variable prodId800
	*  @param value
	**/
   public void setProdId800(char[] value) throws CFException {
      holdVariables800.setProdId800(value);
   } 

     /**
	 * 	Update ProdId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProdId800(char[] source, int sourceIndex) throws CFException {
      holdVariables800.setProdId800(source, sourceIndex);
   	
   }
   
   public void setProdId800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      holdVariables800.setProdId800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ProdId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProdId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setProdId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ProdId800 with another Field
	 *	@param value
	 */
   public void setProdId800(Field source) {
      holdVariables800.setProdId800(source);
   }  
   
     /**
	 * 	Update ProdId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProdId800(Field source, int sourceIndex,int sourceLen) {
      holdVariables800.setProdId800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ProdId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProdId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      holdVariables800.setProdId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of maid500
	 *	@return maid500
	 */
   public char[] getMaid500(int index) throws CFException  {              
   		return ichgFeeRecords500.getIchgEntry500(index).getMaid500();
   }

  
	/**
	*  set variable maid500
	*  @param value
	**/
   public void setMaid500(int index,char[] value) throws CFException {
      ichgFeeRecords500.getIchgEntry500(index).setMaid500(value);
   } 

     /**
	 * 	Update Maid500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMaid500(int index,char[] source, int sourceIndex) throws CFException {
      ichgFeeRecords500.getIchgEntry500(index).setMaid500(source, sourceIndex);
   	
   }
   
   public void setMaid500(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ichgFeeRecords500.getIchgEntry500(index).setMaid500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Maid500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMaid500(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ichgFeeRecords500.getIchgEntry500(index).setMaid500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Maid500 with another Field
	 *	@param value
	 */
   public void setMaid500(int index,Field source) {
      ichgFeeRecords500.getIchgEntry500(index).setMaid500(source);
   }  
   
     /**
	 * 	Update Maid500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMaid500(int index,Field source, int sourceIndex,int sourceLen) {
      ichgFeeRecords500.getIchgEntry500(index).setMaid500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Maid500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMaid500(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ichgFeeRecords500.getIchgEntry500(index).setMaid500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prodId500
	 *	@return prodId500
	 */
   public char[] getProdId500(int index) throws CFException  {              
   		return ichgFeeRecords500.getIchgEntry500(index).getProdId500();
   }

  
	/**
	*  set variable prodId500
	*  @param value
	**/
   public void setProdId500(int index,char[] value) throws CFException {
      ichgFeeRecords500.getIchgEntry500(index).setProdId500(value);
   } 

     /**
	 * 	Update ProdId500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProdId500(int index,char[] source, int sourceIndex) throws CFException {
      ichgFeeRecords500.getIchgEntry500(index).setProdId500(source, sourceIndex);
   	
   }
   
   public void setProdId500(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ichgFeeRecords500.getIchgEntry500(index).setProdId500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ProdId500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProdId500(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ichgFeeRecords500.getIchgEntry500(index).setProdId500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ProdId500 with another Field
	 *	@param value
	 */
   public void setProdId500(int index,Field source) {
      ichgFeeRecords500.getIchgEntry500(index).setProdId500(source);
   }  
   
     /**
	 * 	Update ProdId500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProdId500(int index,Field source, int sourceIndex,int sourceLen) {
      ichgFeeRecords500.getIchgEntry500(index).setProdId500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ProdId500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProdId500(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ichgFeeRecords500.getIchgEntry500(index).setProdId500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of fiaAmt500
	 *	@return fiaAmt500
	 */
	public BigDecimal getFiaAmt500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getFiaAmt500();
	}


	 /**
     *	Returns String value of fiaAmt500
     *	@return fiaAmt500
     */
    public char[]  getFiaAmt500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getFiaAmt500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean fiaAmt500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).fiaAmt500IsNumeric();
    }
	/**
	 * 	Update FiaAmt500 with the passed number
	 *	@param number
	 */
	public void setFiaAmt500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setFiaAmt500(number);
   }

	/**
	 * 	Update FiaAmt500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setFiaAmt500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setFiaAmt500(value);
	}   

	/**
	 *	Returns the value of txnHighAmtU500
	 *	@return txnHighAmtU500
	 */
	public long getTxnHighAmtU500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getTxnHighAmtU500();
	}


	/**
	 *	Returns String value of txnHighAmtU500
	 *	@return txnHighAmtU500
	 */
	public char[]  getTxnHighAmtU500String(int index) throws CFException {
	     return String.valueOf(ichgFeeRecords500.getIchgEntry500(index).getTxnHighAmtU500String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean txnHighAmtU500IsNumeric(int index)  throws CFException{
	    return ichgFeeRecords500.getIchgEntry500(index - 1).txnHighAmtU500IsNumeric();
	}

	/**
	 * 	Update TxnHighAmtU500 with the passed value
	 *	@param number
	 */
	public void setTxnHighAmtU500(int index,long number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setTxnHighAmtU500(number);
	}
	

	
	/**
	 * 	Update TxnHighAmtU500 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTxnHighAmtU500(int index,char[] value)  throws CFException {
		ichgFeeRecords500.getIchgEntry500(index).setTxnHighAmtU500(value);
	}
	
	/**
	 * 	Update TxnHighAmtU500 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTxnHighAmtU500String(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setTxnHighAmtU500(value);
	}	

	/**
	 *	Returns the value of ip00164ProdCatCd
	 *	@return ip00164ProdCatCd
	 */
   public char[] getIp00164ProdCatCd() throws CFException  {              
   		return ip00164TableEntry.getIp00164TableData().getIp00164ProdCatCd();
   }

  
	/**
	*  set variable ip00164ProdCatCd
	*  @param value
	**/
   public void setIp00164ProdCatCd(char[] value) throws CFException {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(value);
   } 

     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00164ProdCatCd(char[] source, int sourceIndex) throws CFException {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex);
   	
   }
   
   public void setIp00164ProdCatCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00164ProdCatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00164ProdCatCd with another Field
	 *	@param value
	 */
   public void setIp00164ProdCatCd(Field source) {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source);
   }  
   
     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00164ProdCatCd(Field source, int sourceIndex,int sourceLen) {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00164ProdCatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00164ProdCatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00164TableEntry.getIp00164TableData().setIp00164ProdCatCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of minAmt500
	 *	@return minAmt500
	 */
	public BigDecimal getMinAmt500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getMinAmt500();
	}


	 /**
     *	Returns String value of minAmt500
     *	@return minAmt500
     */
    public char[]  getMinAmt500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getMinAmt500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean minAmt500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).minAmt500IsNumeric();
    }
	/**
	 * 	Update MinAmt500 with the passed number
	 *	@param number
	 */
	public void setMinAmt500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMinAmt500(number);
   }

	/**
	 * 	Update MinAmt500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMinAmt500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMinAmt500(value);
	}   

	/**
	 *	Returns the value of viaRate500
	 *	@return viaRate500
	 */
	public BigDecimal getViaRate500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getViaRate500();
	}


	 /**
     *	Returns String value of viaRate500
     *	@return viaRate500
     */
    public char[]  getViaRate500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getViaRate500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean viaRate500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).viaRate500IsNumeric();
    }
	/**
	 * 	Update ViaRate500 with the passed number
	 *	@param number
	 */
	public void setViaRate500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setViaRate500(number);
   }

	/**
	 * 	Update ViaRate500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setViaRate500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setViaRate500(value);
	}   

	/**
	 *	Returns the value of maxAmt500
	 *	@return maxAmt500
	 */
	public BigDecimal getMaxAmt500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getMaxAmt500();
	}


	 /**
     *	Returns String value of maxAmt500
     *	@return maxAmt500
     */
    public char[]  getMaxAmt500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getMaxAmt500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean maxAmt500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).maxAmt500IsNumeric();
    }
	/**
	 * 	Update MaxAmt500 with the passed number
	 *	@param number
	 */
	public void setMaxAmt500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMaxAmt500(number);
   }

	/**
	 * 	Update MaxAmt500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMaxAmt500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMaxAmt500(value);
	}   


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public SearchOthersGrpOutCtx getSearchOthersGrpOutCtx() {
            return new SearchOthersGrpOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001TjfIp370Rec.hashCode();
        str += work.hashCode();
        str += holdVariables800.hashCode();
        str += ichgFeeRecords500.hashCode();
        str += ichgCalcVars800.hashCode();
        str += ip00164TableEntry.hashCode();
       return str.hashCode();
    }

    public SearchOthersGrpInCtx clone() {
        SearchOthersGrpInCtx cloneObj = new SearchOthersGrpInCtx();
        cloneObj.sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        cloneObj.sys001TjfIp370Rec.set(sys001TjfIp370Rec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.holdVariables800 = new HoldVariables800();
        cloneObj.holdVariables800.set(holdVariables800.getClonedField());
        cloneObj.ichgFeeRecords500 = new IchgFeeRecords500();
        cloneObj.ichgFeeRecords500.set(ichgFeeRecords500.getClonedField());
        cloneObj.ichgCalcVars800 = new IchgCalcVars800();
        cloneObj.ichgCalcVars800.set(ichgCalcVars800.getClonedField());
        cloneObj.ip00164TableEntry = new Ip00164TableEntry();
        cloneObj.ip00164TableEntry.set(ip00164TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public SearchOthersGrpInCtx getSearchOthersGrpInCtx() {
            return new SearchOthersGrpInCtx();
    }
     public class SearchOthersGrpOutCtx implements Cloneable {
     Sys001TjfIp370Rec sys001TjfIp370Rec = Ip088030Ctx.this.getSys001TjfIp370Rec();
     Work work = Ip088030Ctx.this.getWork();
     HoldVariables800 holdVariables800 = Ip088030Ctx.this.getHoldVariables800();
     IchgFeeRecords500 ichgFeeRecords500 = Ip088030Ctx.this.getIchgFeeRecords500();
     IchgCalcVars800 ichgCalcVars800 = Ip088030Ctx.this.getIchgCalcVars800();
     Ip00164TableEntry ip00164TableEntry = Ip088030Ctx.this.getIp00164TableEntry();


public void setIchgIdx500(int ichgIdx500) { 
    Ip088030Ctx.this.ichgIdx500 = ichgIdx500;
}

public int getIchgIdx500() { 
    return Ip088030Ctx.this.ichgIdx500;
}
	/**
	 *	Returns the value of minAmt800
	 *	@return minAmt800
	 */
	public BigDecimal getMinAmt800() throws CFException {
   		return ichgCalcVars800.getMinAmt800();
	}


	 /**
     *	Returns String value of minAmt800
     *	@return minAmt800
     */
    public char[]  getMinAmt800String() throws CFException {
         return ichgCalcVars800.getMinAmt800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean minAmt800IsNumeric() {
        return ichgCalcVars800.minAmt800IsNumeric();
    }
	/**
	 * 	Update MinAmt800 with the passed number
	 *	@param number
	 */
	public void setMinAmt800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setMinAmt800(number);
   }

	/**
	 * 	Update MinAmt800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMinAmt800(char[] value)  throws CFException{
		ichgCalcVars800.setMinAmt800(value);
	}   

	/**
	 *	Returns the value of minAmt500
	 *	@return minAmt500
	 */
	public BigDecimal getMinAmt500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getMinAmt500();
	}


	 /**
     *	Returns String value of minAmt500
     *	@return minAmt500
     */
    public char[]  getMinAmt500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getMinAmt500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean minAmt500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).minAmt500IsNumeric();
    }
	/**
	 * 	Update MinAmt500 with the passed number
	 *	@param number
	 */
	public void setMinAmt500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMinAmt500(number);
   }

	/**
	 * 	Update MinAmt500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMinAmt500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMinAmt500(value);
	}   

	/**
	 *	Test condition "N" for isItIsNotEndLoop88100()
	 *	@return  Returns true if isItIsNotEndLoop88100() is "N"
	 */
   public boolean isItIsNotEndLoop88100() throws CFException {
      return work.isItIsNotEndLoop88100();
   }

	/**
	*  set values "N"
	*/
   	public void setItIsNotEndLoop88100True()  throws CFException{  			
    	work.setItIsNotEndLoop88100True();
   	}
	/**
	 *	Returns the value of viaRate800
	 *	@return viaRate800
	 */
	public BigDecimal getViaRate800() throws CFException {
   		return ichgCalcVars800.getViaRate800();
	}


	 /**
     *	Returns String value of viaRate800
     *	@return viaRate800
     */
    public char[]  getViaRate800String() throws CFException {
         return ichgCalcVars800.getViaRate800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean viaRate800IsNumeric() {
        return ichgCalcVars800.viaRate800IsNumeric();
    }
	/**
	 * 	Update ViaRate800 with the passed number
	 *	@param number
	 */
	public void setViaRate800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setViaRate800(number);
   }

	/**
	 * 	Update ViaRate800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setViaRate800(char[] value)  throws CFException{
		ichgCalcVars800.setViaRate800(value);
	}   

	/**
	 *	Returns the value of maxAmt800
	 *	@return maxAmt800
	 */
	public BigDecimal getMaxAmt800() throws CFException {
   		return ichgCalcVars800.getMaxAmt800();
	}


	 /**
     *	Returns String value of maxAmt800
     *	@return maxAmt800
     */
    public char[]  getMaxAmt800String() throws CFException {
         return ichgCalcVars800.getMaxAmt800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean maxAmt800IsNumeric() {
        return ichgCalcVars800.maxAmt800IsNumeric();
    }
	/**
	 * 	Update MaxAmt800 with the passed number
	 *	@param number
	 */
	public void setMaxAmt800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setMaxAmt800(number);
   }

	/**
	 * 	Update MaxAmt800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMaxAmt800(char[] value)  throws CFException{
		ichgCalcVars800.setMaxAmt800(value);
	}   

	/**
	 *	Returns the value of fiaAmt500
	 *	@return fiaAmt500
	 */
	public BigDecimal getFiaAmt500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getFiaAmt500();
	}


	 /**
     *	Returns String value of fiaAmt500
     *	@return fiaAmt500
     */
    public char[]  getFiaAmt500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getFiaAmt500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean fiaAmt500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).fiaAmt500IsNumeric();
    }
	/**
	 * 	Update FiaAmt500 with the passed number
	 *	@param number
	 */
	public void setFiaAmt500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setFiaAmt500(number);
   }

	/**
	 * 	Update FiaAmt500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setFiaAmt500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setFiaAmt500(value);
	}   

	/**
	 *	Test condition "Y" for isItIsEndOfLoop88100()
	 *	@return  Returns true if isItIsEndOfLoop88100() is "Y"
	 */
   public boolean isItIsEndOfLoop88100() throws CFException {
      return work.isItIsEndOfLoop88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsEndOfLoop88100True()  throws CFException{  			
    	work.setItIsEndOfLoop88100True();
   	}
	/**
	 *	Returns the value of viaRate500
	 *	@return viaRate500
	 */
	public BigDecimal getViaRate500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getViaRate500();
	}


	 /**
     *	Returns String value of viaRate500
     *	@return viaRate500
     */
    public char[]  getViaRate500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getViaRate500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean viaRate500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).viaRate500IsNumeric();
    }
	/**
	 * 	Update ViaRate500 with the passed number
	 *	@param number
	 */
	public void setViaRate500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setViaRate500(number);
   }

	/**
	 * 	Update ViaRate500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setViaRate500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setViaRate500(value);
	}   

	/**
	 *	Returns the value of maxAmt500
	 *	@return maxAmt500
	 */
	public BigDecimal getMaxAmt500(int index) throws CFException {
   		return ichgFeeRecords500.getIchgEntry500(index).getMaxAmt500();
	}


	 /**
     *	Returns String value of maxAmt500
     *	@return maxAmt500
     */
    public char[]  getMaxAmt500String(int index) throws CFException {
         return ichgFeeRecords500.getIchgEntry500(index).getMaxAmt500String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean maxAmt500IsNumeric(int index) {
        return ichgFeeRecords500.getIchgEntry500(index - 1).maxAmt500IsNumeric();
    }
	/**
	 * 	Update MaxAmt500 with the passed number
	 *	@param number
	 */
	public void setMaxAmt500(int index,BigDecimal number)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMaxAmt500(number);
   }

	/**
	 * 	Update MaxAmt500 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMaxAmt500(int index,char[] value)  throws CFException{
		ichgFeeRecords500.getIchgEntry500(index).setMaxAmt500(value);
	}   

	/**
	 *	Returns the value of fiaAmt800
	 *	@return fiaAmt800
	 */
	public BigDecimal getFiaAmt800() throws CFException {
   		return ichgCalcVars800.getFiaAmt800();
	}


	 /**
     *	Returns String value of fiaAmt800
     *	@return fiaAmt800
     */
    public char[]  getFiaAmt800String() throws CFException {
         return ichgCalcVars800.getFiaAmt800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean fiaAmt800IsNumeric() {
        return ichgCalcVars800.fiaAmt800IsNumeric();
    }
	/**
	 * 	Update FiaAmt800 with the passed number
	 *	@param number
	 */
	public void setFiaAmt800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setFiaAmt800(number);
   }

	/**
	 * 	Update FiaAmt800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setFiaAmt800(char[] value)  throws CFException{
		ichgCalcVars800.setFiaAmt800(value);
	}   


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001TjfIp370Rec.hashCode();
        str += work.hashCode();
        str += holdVariables800.hashCode();
        str += ichgFeeRecords500.hashCode();
        str += ichgCalcVars800.hashCode();
        str += ip00164TableEntry.hashCode();
       return str.hashCode();
    }

    public SearchOthersGrpOutCtx clone() {
        SearchOthersGrpOutCtx cloneObj = new SearchOthersGrpOutCtx();
        cloneObj.sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        cloneObj.sys001TjfIp370Rec.set(sys001TjfIp370Rec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.holdVariables800 = new HoldVariables800();
        cloneObj.holdVariables800.set(holdVariables800.getClonedField());
        cloneObj.ichgFeeRecords500 = new IchgFeeRecords500();
        cloneObj.ichgFeeRecords500.set(ichgFeeRecords500.getClonedField());
        cloneObj.ichgCalcVars800 = new IchgCalcVars800();
        cloneObj.ichgCalcVars800.set(ichgCalcVars800.getClonedField());
        cloneObj.ip00164TableEntry = new Ip00164TableEntry();
        cloneObj.ip00164TableEntry.set(ip00164TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public SearchOthersGrpOutCtx getSearchOthersGrpOutCtx() {
            return new SearchOthersGrpOutCtx();
    }
     public class CalculateIchgAmtInCtx implements Cloneable {
     Work work = Ip088030Ctx.this.getWork();
     IchgCalcVars800 ichgCalcVars800 = Ip088030Ctx.this.getIchgCalcVars800();

	/**
	 *	Returns the value of clrTxnAmt6800
	 *	@return clrTxnAmt6800
	 */
	public BigDecimal getClrTxnAmt6800() throws CFException {
   		return ichgCalcVars800.getClrTxnAmt6800();
	}


	 /**
     *	Returns String value of clrTxnAmt6800
     *	@return clrTxnAmt6800
     */
    public char[]  getClrTxnAmt6800String() throws CFException {
         return ichgCalcVars800.getClrTxnAmt6800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean clrTxnAmt6800IsNumeric() {
        return ichgCalcVars800.clrTxnAmt6800IsNumeric();
    }
	/**
	 * 	Update ClrTxnAmt6800 with the passed number
	 *	@param number
	 */
	public void setClrTxnAmt6800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setClrTxnAmt6800(number);
   }

	/**
	 * 	Update ClrTxnAmt6800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setClrTxnAmt6800(char[] value)  throws CFException{
		ichgCalcVars800.setClrTxnAmt6800(value);
	}   

	/**
	 *	Returns the value of netAmt800
	 *	@return netAmt800
	 */
	public BigDecimal getNetAmt800() throws CFException {
   		return ichgCalcVars800.getNetAmt800();
	}


	 /**
     *	Returns String value of netAmt800
     *	@return netAmt800
     */
    public char[]  getNetAmt800String() throws CFException {
         return ichgCalcVars800.getNetAmt800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean netAmt800IsNumeric() {
        return ichgCalcVars800.netAmt800IsNumeric();
    }
	/**
	 * 	Update NetAmt800 with the passed number
	 *	@param number
	 */
	public void setNetAmt800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setNetAmt800(number);
   }

	/**
	 * 	Update NetAmt800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setNetAmt800(char[] value)  throws CFException{
		ichgCalcVars800.setNetAmt800(value);
	}   

	/**
	 *	Returns the value of viaRate800
	 *	@return viaRate800
	 */
	public BigDecimal getViaRate800() throws CFException {
   		return ichgCalcVars800.getViaRate800();
	}


	 /**
     *	Returns String value of viaRate800
     *	@return viaRate800
     */
    public char[]  getViaRate800String() throws CFException {
         return ichgCalcVars800.getViaRate800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean viaRate800IsNumeric() {
        return ichgCalcVars800.viaRate800IsNumeric();
    }
	/**
	 * 	Update ViaRate800 with the passed number
	 *	@param number
	 */
	public void setViaRate800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setViaRate800(number);
   }

	/**
	 * 	Update ViaRate800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setViaRate800(char[] value)  throws CFException{
		ichgCalcVars800.setViaRate800(value);
	}   

	/**
	 *	Returns the value of maxAmt800
	 *	@return maxAmt800
	 */
	public BigDecimal getMaxAmt800() throws CFException {
   		return ichgCalcVars800.getMaxAmt800();
	}


	 /**
     *	Returns String value of maxAmt800
     *	@return maxAmt800
     */
    public char[]  getMaxAmt800String() throws CFException {
         return ichgCalcVars800.getMaxAmt800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean maxAmt800IsNumeric() {
        return ichgCalcVars800.maxAmt800IsNumeric();
    }
	/**
	 * 	Update MaxAmt800 with the passed number
	 *	@param number
	 */
	public void setMaxAmt800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setMaxAmt800(number);
   }

	/**
	 * 	Update MaxAmt800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMaxAmt800(char[] value)  throws CFException{
		ichgCalcVars800.setMaxAmt800(value);
	}   

	/**
	 *	Returns the value of fiaAmt800
	 *	@return fiaAmt800
	 */
	public BigDecimal getFiaAmt800() throws CFException {
   		return ichgCalcVars800.getFiaAmt800();
	}


	 /**
     *	Returns String value of fiaAmt800
     *	@return fiaAmt800
     */
    public char[]  getFiaAmt800String() throws CFException {
         return ichgCalcVars800.getFiaAmt800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean fiaAmt800IsNumeric() {
        return ichgCalcVars800.fiaAmt800IsNumeric();
    }
	/**
	 * 	Update FiaAmt800 with the passed number
	 *	@param number
	 */
	public void setFiaAmt800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setFiaAmt800(number);
   }

	/**
	 * 	Update FiaAmt800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setFiaAmt800(char[] value)  throws CFException{
		ichgCalcVars800.setFiaAmt800(value);
	}   


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public CalculateIchgAmtOutCtx getCalculateIchgAmtOutCtx() {
            return new CalculateIchgAmtOutCtx();
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
        str += ichgCalcVars800.hashCode();
       return str.hashCode();
    }

    public CalculateIchgAmtInCtx clone() {
        CalculateIchgAmtInCtx cloneObj = new CalculateIchgAmtInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ichgCalcVars800 = new IchgCalcVars800();
        cloneObj.ichgCalcVars800.set(ichgCalcVars800.getClonedField());
        return cloneObj;
    }

    }

    public CalculateIchgAmtInCtx getCalculateIchgAmtInCtx() {
            return new CalculateIchgAmtInCtx();
    }
     public class CalculateIchgAmtOutCtx implements Cloneable {
     Work work = Ip088030Ctx.this.getWork();
     IchgCalcVars800 ichgCalcVars800 = Ip088030Ctx.this.getIchgCalcVars800();

	/**
	 *	Test condition "Y" for isIchgCalculatedY88100()
	 *	@return  Returns true if isIchgCalculatedY88100() is "Y"
	 */
   public boolean isIchgCalculatedY88100() throws CFException {
      return work.isIchgCalculatedY88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setIchgCalculatedY88100True()  throws CFException{  			
    	work.setIchgCalculatedY88100True();
   	}
	/**
	 *	Returns the value of netAmt800
	 *	@return netAmt800
	 */
	public BigDecimal getNetAmt800() throws CFException {
   		return ichgCalcVars800.getNetAmt800();
	}


	 /**
     *	Returns String value of netAmt800
     *	@return netAmt800
     */
    public char[]  getNetAmt800String() throws CFException {
         return ichgCalcVars800.getNetAmt800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean netAmt800IsNumeric() {
        return ichgCalcVars800.netAmt800IsNumeric();
    }
	/**
	 * 	Update NetAmt800 with the passed number
	 *	@param number
	 */
	public void setNetAmt800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setNetAmt800(number);
   }

	/**
	 * 	Update NetAmt800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setNetAmt800(char[] value)  throws CFException{
		ichgCalcVars800.setNetAmt800(value);
	}   

	/**
	 *	Returns the value of viaAmt800
	 *	@return viaAmt800
	 */
	public BigDecimal getViaAmt800() throws CFException {
   		return ichgCalcVars800.getViaAmt800();
	}


	 /**
     *	Returns String value of viaAmt800
     *	@return viaAmt800
     */
    public char[]  getViaAmt800String() throws CFException {
         return ichgCalcVars800.getViaAmt800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean viaAmt800IsNumeric() {
        return ichgCalcVars800.viaAmt800IsNumeric();
    }
	/**
	 * 	Update ViaAmt800 with the passed number
	 *	@param number
	 */
	public void setViaAmt800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setViaAmt800(number);
   }

	/**
	 * 	Update ViaAmt800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setViaAmt800(char[] value)  throws CFException{
		ichgCalcVars800.setViaAmt800(value);
	}   

	/**
	 *	Returns the value of maxAmt800
	 *	@return maxAmt800
	 */
	public BigDecimal getMaxAmt800() throws CFException {
   		return ichgCalcVars800.getMaxAmt800();
	}


	 /**
     *	Returns String value of maxAmt800
     *	@return maxAmt800
     */
    public char[]  getMaxAmt800String() throws CFException {
         return ichgCalcVars800.getMaxAmt800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean maxAmt800IsNumeric() {
        return ichgCalcVars800.maxAmt800IsNumeric();
    }
	/**
	 * 	Update MaxAmt800 with the passed number
	 *	@param number
	 */
	public void setMaxAmt800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setMaxAmt800(number);
   }

	/**
	 * 	Update MaxAmt800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setMaxAmt800(char[] value)  throws CFException{
		ichgCalcVars800.setMaxAmt800(value);
	}   


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
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
        str += ichgCalcVars800.hashCode();
       return str.hashCode();
    }

    public CalculateIchgAmtOutCtx clone() {
        CalculateIchgAmtOutCtx cloneObj = new CalculateIchgAmtOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ichgCalcVars800 = new IchgCalcVars800();
        cloneObj.ichgCalcVars800.set(ichgCalcVars800.getClonedField());
        return cloneObj;
    }

    }

    public CalculateIchgAmtOutCtx getCalculateIchgAmtOutCtx() {
            return new CalculateIchgAmtOutCtx();
    }
     public class AlignTxnAmtDecimalInCtx implements Cloneable {
     Sys001TjfIp370Rec sys001TjfIp370Rec = Ip088030Ctx.this.getSys001TjfIp370Rec();
     Work work = Ip088030Ctx.this.getWork();
     IchgCalcVars800 ichgCalcVars800 = Ip088030Ctx.this.getIchgCalcVars800();
     Ip00174TableEntry ip00174TableEntry = Ip088030Ctx.this.getIp00174TableEntry();

public long getIp98152ClrTxnAmt() throws CFException {  
        return sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrTxnAmt();
}
	/**
	 * 	Update Ip98152ClrTxnAmt with the passed value
	 *	@param number
	 */
	public void setIp98152ClrTxnAmt(long number)  throws CFException{
		sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnAmt(number);
	}



	/**
	 *	Returns the value of ptrIp288010800
	 *	@return ptrIp288010800
	 */
   public char[] getPtrIp288010800() throws CFException  {              
   		return work.getPtrIp288010800();
   }

  
	/**
	*  set variable ptrIp288010800
	*  @param value
	**/
   public void setPtrIp288010800(char[] value) throws CFException {
      work.setPtrIp288010800(value);
   } 

	/**
	 *	Returns the value of ip98152ClrTxnCurrCd
	 *	@return ip98152ClrTxnCurrCd
	 */
   public char[] getIp98152ClrTxnCurrCd() throws CFException  {              
   		return sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrTxnCurrCd();
   }

  
	/**
	*  set variable ip98152ClrTxnCurrCd
	*  @param value
	**/
   public void setIp98152ClrTxnCurrCd(char[] value) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(value);
   } 

     /**
	 * 	Update Ip98152ClrTxnCurrCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(char[] source, int sourceIndex) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex);
   	
   }
   
   public void setIp98152ClrTxnCurrCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98152ClrTxnCurrCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98152ClrTxnCurrCd with another Field
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(Field source) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source);
   }  
   
     /**
	 * 	Update Ip98152ClrTxnCurrCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(Field source, int sourceIndex,int sourceLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip98152ClrTxnCurrCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip00174CurExpCode
	 *	@return ip00174CurExpCode
	 */
	public int getIp00174CurExpCode() throws CFException {
   		return ip00174TableEntry.getIp00174CurExpCode();
	}


	/**
	 *	Returns String value of ip00174CurExpCode
	 *	@return ip00174CurExpCode
	 */
	public char[]  getIp00174CurExpCodeString() throws CFException {
	     return String.valueOf(ip00174TableEntry.getIp00174CurExpCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00174CurExpCodeIsNumeric()  throws CFException{
	    return ip00174TableEntry.ip00174CurExpCodeIsNumeric();
	}

	/**
	 * 	Update Ip00174CurExpCode with the passed value
	 *	@param number
	 */
	public void setIp00174CurExpCode(int number)  throws CFException{
		ip00174TableEntry.setIp00174CurExpCode(number);
	}
	

	public void setIp00174CurExpCode(long number)  throws CFException{
	    ip00174TableEntry.setIp00174CurExpCode(number);
	}
	
	
	/**
	 * 	Update Ip00174CurExpCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00174CurExpCode(char[] value)  throws CFException {
		ip00174TableEntry.setIp00174CurExpCode(value);
	}
	
	/**
	 * 	Update Ip00174CurExpCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00174CurExpCodeString(char[] value)  throws CFException{
		ip00174TableEntry.setIp00174CurExpCode(value);
	}	


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public AlignTxnAmtDecimalOutCtx getAlignTxnAmtDecimalOutCtx() {
            return new AlignTxnAmtDecimalOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001TjfIp370Rec.hashCode();
        str += work.hashCode();
        str += ichgCalcVars800.hashCode();
        str += ip00174TableEntry.hashCode();
       return str.hashCode();
    }

    public AlignTxnAmtDecimalInCtx clone() {
        AlignTxnAmtDecimalInCtx cloneObj = new AlignTxnAmtDecimalInCtx();
        cloneObj.sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        cloneObj.sys001TjfIp370Rec.set(sys001TjfIp370Rec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ichgCalcVars800 = new IchgCalcVars800();
        cloneObj.ichgCalcVars800.set(ichgCalcVars800.getClonedField());
        cloneObj.ip00174TableEntry = new Ip00174TableEntry();
        cloneObj.ip00174TableEntry.set(ip00174TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public AlignTxnAmtDecimalInCtx getAlignTxnAmtDecimalInCtx() {
            return new AlignTxnAmtDecimalInCtx();
    }
     public class AlignTxnAmtDecimalOutCtx implements Cloneable {
     Sys001TjfIp370Rec sys001TjfIp370Rec = Ip088030Ctx.this.getSys001TjfIp370Rec();
     Work work = Ip088030Ctx.this.getWork();
     IchgCalcVars800 ichgCalcVars800 = Ip088030Ctx.this.getIchgCalcVars800();
     Ip00174TableEntry ip00174TableEntry = Ip088030Ctx.this.getIp00174TableEntry();

	/**
	 *	Returns the value of clrTxnAmt6800
	 *	@return clrTxnAmt6800
	 */
	public BigDecimal getClrTxnAmt6800() throws CFException {
   		return ichgCalcVars800.getClrTxnAmt6800();
	}


	 /**
     *	Returns String value of clrTxnAmt6800
     *	@return clrTxnAmt6800
     */
    public char[]  getClrTxnAmt6800String() throws CFException {
         return ichgCalcVars800.getClrTxnAmt6800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean clrTxnAmt6800IsNumeric() {
        return ichgCalcVars800.clrTxnAmt6800IsNumeric();
    }
	/**
	 * 	Update ClrTxnAmt6800 with the passed number
	 *	@param number
	 */
	public void setClrTxnAmt6800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setClrTxnAmt6800(number);
   }

	/**
	 * 	Update ClrTxnAmt6800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setClrTxnAmt6800(char[] value)  throws CFException{
		ichgCalcVars800.setClrTxnAmt6800(value);
	}   

	/**
	 *	Returns the value of ip00174CurrCdKey
	 *	@return ip00174CurrCdKey
	 */   
	 public Ip00174CurrCdKey getIp00174CurrCdKey() {
   	return ip00174TableEntry.getIp00174CurrCdKey();
   }

   /**
	* 	Update Ip00174CurrCdKey with the passed value
	*	@param value
	*/
   public void setIp00174CurrCdKey(char[] value) throws CFException {
      ip00174TableEntry.setIp00174CurrCdKey(value);
   }   

     /**
	 * 	Update Ip00174CurrCdKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00174CurrCdKey(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip00174TableEntry.setIp00174CurrCdKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00174CurrCdKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00174CurrCdKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip00174TableEntry.setIp00174CurrCdKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00174CurrCdKey with another Field
	 *	@param value
	 */
   public void setIp00174CurrCdKey(Field source) {
   	ip00174TableEntry.setIp00174CurrCdKey(source);
   }  
   
     /**
	 * 	Update Ip00174CurrCdKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00174CurrCdKey(Field source, int sourceIndex,int sourceLen) {
   	ip00174TableEntry.setIp00174CurrCdKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00174CurrCdKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00174CurrCdKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip00174TableEntry.setIp00174CurrCdKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip98152ClrTxnCurrCd
	 *	@return ip98152ClrTxnCurrCd
	 */
   public char[] getIp98152ClrTxnCurrCd() throws CFException  {              
   		return sys001TjfIp370Rec.getIp98152RecordPart2().getIp98152ClrTxnCurrCd();
   }

  
	/**
	*  set variable ip98152ClrTxnCurrCd
	*  @param value
	**/
   public void setIp98152ClrTxnCurrCd(char[] value) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(value);
   } 

     /**
	 * 	Update Ip98152ClrTxnCurrCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(char[] source, int sourceIndex) throws CFException {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex);
   	
   }
   
   public void setIp98152ClrTxnCurrCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip98152ClrTxnCurrCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip98152ClrTxnCurrCd with another Field
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(Field source) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source);
   }  
   
     /**
	 * 	Update Ip98152ClrTxnCurrCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(Field source, int sourceIndex,int sourceLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip98152ClrTxnCurrCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001TjfIp370Rec.getIp98152RecordPart2().setIp98152ClrTxnCurrCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001TjfIp370Rec.hashCode();
        str += work.hashCode();
        str += ichgCalcVars800.hashCode();
        str += ip00174TableEntry.hashCode();
       return str.hashCode();
    }

    public AlignTxnAmtDecimalOutCtx clone() {
        AlignTxnAmtDecimalOutCtx cloneObj = new AlignTxnAmtDecimalOutCtx();
        cloneObj.sys001TjfIp370Rec = new Sys001TjfIp370Rec();
        cloneObj.sys001TjfIp370Rec.set(sys001TjfIp370Rec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ichgCalcVars800 = new IchgCalcVars800();
        cloneObj.ichgCalcVars800.set(ichgCalcVars800.getClonedField());
        cloneObj.ip00174TableEntry = new Ip00174TableEntry();
        cloneObj.ip00174TableEntry.set(ip00174TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public AlignTxnAmtDecimalOutCtx getAlignTxnAmtDecimalOutCtx() {
            return new AlignTxnAmtDecimalOutCtx();
    }
     public class AlignIchgFeeAmtInCtx implements Cloneable {
     Ip33701CurrConvInterface ip33701CurrConvInterface = Ip088030Ctx.this.getIp33701CurrConvInterface();
     IchgCalcVars800 ichgCalcVars800 = Ip088030Ctx.this.getIchgCalcVars800();
     Ip00174TableEntry ip00174TableEntry = Ip088030Ctx.this.getIp00174TableEntry();

	/**
	 *	Returns the value of netAmt800
	 *	@return netAmt800
	 */
	public BigDecimal getNetAmt800() throws CFException {
   		return ichgCalcVars800.getNetAmt800();
	}


	 /**
     *	Returns String value of netAmt800
     *	@return netAmt800
     */
    public char[]  getNetAmt800String() throws CFException {
         return ichgCalcVars800.getNetAmt800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean netAmt800IsNumeric() {
        return ichgCalcVars800.netAmt800IsNumeric();
    }
	/**
	 * 	Update NetAmt800 with the passed number
	 *	@param number
	 */
	public void setNetAmt800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setNetAmt800(number);
   }

	/**
	 * 	Update NetAmt800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setNetAmt800(char[] value)  throws CFException{
		ichgCalcVars800.setNetAmt800(value);
	}   

	/**
	 *	Returns the value of ip00174CurExpCode
	 *	@return ip00174CurExpCode
	 */
	public int getIp00174CurExpCode() throws CFException {
   		return ip00174TableEntry.getIp00174CurExpCode();
	}


	/**
	 *	Returns String value of ip00174CurExpCode
	 *	@return ip00174CurExpCode
	 */
	public char[]  getIp00174CurExpCodeString() throws CFException {
	     return String.valueOf(ip00174TableEntry.getIp00174CurExpCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00174CurExpCodeIsNumeric()  throws CFException{
	    return ip00174TableEntry.ip00174CurExpCodeIsNumeric();
	}

	/**
	 * 	Update Ip00174CurExpCode with the passed value
	 *	@param number
	 */
	public void setIp00174CurExpCode(int number)  throws CFException{
		ip00174TableEntry.setIp00174CurExpCode(number);
	}
	

	public void setIp00174CurExpCode(long number)  throws CFException{
	    ip00174TableEntry.setIp00174CurExpCode(number);
	}
	
	
	/**
	 * 	Update Ip00174CurExpCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00174CurExpCode(char[] value)  throws CFException {
		ip00174TableEntry.setIp00174CurExpCode(value);
	}
	
	/**
	 * 	Update Ip00174CurExpCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00174CurExpCodeString(char[] value)  throws CFException{
		ip00174TableEntry.setIp00174CurExpCode(value);
	}	


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public AlignIchgFeeAmtOutCtx getAlignIchgFeeAmtOutCtx() {
            return new AlignIchgFeeAmtOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip33701CurrConvInterface.hashCode();
        str += ichgCalcVars800.hashCode();
        str += ip00174TableEntry.hashCode();
       return str.hashCode();
    }

    public AlignIchgFeeAmtInCtx clone() {
        AlignIchgFeeAmtInCtx cloneObj = new AlignIchgFeeAmtInCtx();
        cloneObj.ip33701CurrConvInterface = new Ip33701CurrConvInterface();
        cloneObj.ip33701CurrConvInterface.set(ip33701CurrConvInterface.getClonedField());
        cloneObj.ichgCalcVars800 = new IchgCalcVars800();
        cloneObj.ichgCalcVars800.set(ichgCalcVars800.getClonedField());
        cloneObj.ip00174TableEntry = new Ip00174TableEntry();
        cloneObj.ip00174TableEntry.set(ip00174TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public AlignIchgFeeAmtInCtx getAlignIchgFeeAmtInCtx() {
            return new AlignIchgFeeAmtInCtx();
    }
     public class AlignIchgFeeAmtOutCtx implements Cloneable {
     Ip33701CurrConvInterface ip33701CurrConvInterface = Ip088030Ctx.this.getIp33701CurrConvInterface();
     IchgCalcVars800 ichgCalcVars800 = Ip088030Ctx.this.getIchgCalcVars800();
     Ip00174TableEntry ip00174TableEntry = Ip088030Ctx.this.getIp00174TableEntry();

	/**
	 *	Returns the value of ip33701TargetAmount
	 *	@return ip33701TargetAmount
	 */
	public long getIp33701TargetAmount() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmount();
	}

    /**
	 *	Returns the String value of ip33701TargetAmount
	 *	@return ip33701TargetAmount
	 */
	public char[]  getIp33701TargetAmountActualString() {
		return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmountActualString();
	}

	/**
	 *	Returns String value of ip33701TargetAmount
	 *	@return ip33701TargetAmount
	 */
	public char[]  getIp33701TargetAmountString() throws CFException {
	     return String.valueOf(ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip33701TargetAmountIsNumeric()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvOutput().ip33701TargetAmountIsNumeric();
	}

	/**
	 * 	Update Ip33701TargetAmount with the passed value
	 *	@param number
	 */
	public void setIp33701TargetAmount(long number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount(number);
	}
	

	
	/**
	 * 	Update Ip33701TargetAmount with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetAmount(char[] value)  throws CFException {
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount(value);
	}
	
	/**
	 * 	Update Ip33701TargetAmount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp33701TargetAmountString(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount(value);
	}	

	/**
	 *	Returns the value of netAmt800
	 *	@return netAmt800
	 */
	public BigDecimal getNetAmt800() throws CFException {
   		return ichgCalcVars800.getNetAmt800();
	}


	 /**
     *	Returns String value of netAmt800
     *	@return netAmt800
     */
    public char[]  getNetAmt800String() throws CFException {
         return ichgCalcVars800.getNetAmt800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean netAmt800IsNumeric() {
        return ichgCalcVars800.netAmt800IsNumeric();
    }
	/**
	 * 	Update NetAmt800 with the passed number
	 *	@param number
	 */
	public void setNetAmt800(BigDecimal number)  throws CFException{
		ichgCalcVars800.setNetAmt800(number);
   }

	/**
	 * 	Update NetAmt800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setNetAmt800(char[] value)  throws CFException{
		ichgCalcVars800.setNetAmt800(value);
	}   

	/**
	 *	Returns the value of ip33701TargetAmount4
	 *	@return ip33701TargetAmount4
	 */
	public BigDecimal getIp33701TargetAmount4() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmount4();
	}

    /**
	 *	Returns the String value of ip33701TargetAmount4
	 *	@return ip33701TargetAmount4
	 */
	public char[]  getIp33701TargetAmount4ActualString()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmount4ActualString();
	}

	 /**
     *	Returns String value of ip33701TargetAmount4
     *	@return ip33701TargetAmount4
     */
    public char[]  getIp33701TargetAmount4String() throws CFException {
         return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmount4String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean ip33701TargetAmount4IsNumeric() {
        return ip33701CurrConvInterface.getIp33701CurrConvOutput().ip33701TargetAmount4IsNumeric();
    }
	/**
	 * 	Update Ip33701TargetAmount4 with the passed number
	 *	@param number
	 */
	public void setIp33701TargetAmount4(BigDecimal number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount4(number);
   }

	/**
	 * 	Update Ip33701TargetAmount4 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setIp33701TargetAmount4(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount4(value);
	}   

	/**
	 *	Returns the value of ip33701TargetAmount3
	 *	@return ip33701TargetAmount3
	 */
	public BigDecimal getIp33701TargetAmount3() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmount3();
	}

    /**
	 *	Returns the String value of ip33701TargetAmount3
	 *	@return ip33701TargetAmount3
	 */
	public char[]  getIp33701TargetAmount3ActualString()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmount3ActualString();
	}

	 /**
     *	Returns String value of ip33701TargetAmount3
     *	@return ip33701TargetAmount3
     */
    public char[]  getIp33701TargetAmount3String() throws CFException {
         return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmount3String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean ip33701TargetAmount3IsNumeric() {
        return ip33701CurrConvInterface.getIp33701CurrConvOutput().ip33701TargetAmount3IsNumeric();
    }
	/**
	 * 	Update Ip33701TargetAmount3 with the passed number
	 *	@param number
	 */
	public void setIp33701TargetAmount3(BigDecimal number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount3(number);
   }

	/**
	 * 	Update Ip33701TargetAmount3 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setIp33701TargetAmount3(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount3(value);
	}   

	/**
	 *	Returns the value of ip33701TargetAmount1
	 *	@return ip33701TargetAmount1
	 */
	public BigDecimal getIp33701TargetAmount1() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmount1();
	}

    /**
	 *	Returns the String value of ip33701TargetAmount1
	 *	@return ip33701TargetAmount1
	 */
	public char[]  getIp33701TargetAmount1ActualString()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmount1ActualString();
	}

	 /**
     *	Returns String value of ip33701TargetAmount1
     *	@return ip33701TargetAmount1
     */
    public char[]  getIp33701TargetAmount1String() throws CFException {
         return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmount1String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean ip33701TargetAmount1IsNumeric() {
        return ip33701CurrConvInterface.getIp33701CurrConvOutput().ip33701TargetAmount1IsNumeric();
    }
	/**
	 * 	Update Ip33701TargetAmount1 with the passed number
	 *	@param number
	 */
	public void setIp33701TargetAmount1(BigDecimal number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount1(number);
   }

	/**
	 * 	Update Ip33701TargetAmount1 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setIp33701TargetAmount1(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount1(value);
	}   

	/**
	 *	Returns the value of ip33701TargetAmount6
	 *	@return ip33701TargetAmount6
	 */
	public BigDecimal getIp33701TargetAmount6() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmount6();
	}

    /**
	 *	Returns the String value of ip33701TargetAmount6
	 *	@return ip33701TargetAmount6
	 */
	public char[]  getIp33701TargetAmount6ActualString()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmount6ActualString();
	}

	 /**
     *	Returns String value of ip33701TargetAmount6
     *	@return ip33701TargetAmount6
     */
    public char[]  getIp33701TargetAmount6String() throws CFException {
         return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmount6String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean ip33701TargetAmount6IsNumeric() {
        return ip33701CurrConvInterface.getIp33701CurrConvOutput().ip33701TargetAmount6IsNumeric();
    }
	/**
	 * 	Update Ip33701TargetAmount6 with the passed number
	 *	@param number
	 */
	public void setIp33701TargetAmount6(BigDecimal number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount6(number);
   }

	/**
	 * 	Update Ip33701TargetAmount6 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setIp33701TargetAmount6(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount6(value);
	}   

	/**
	 *	Returns the value of ip33701TargetAmount2
	 *	@return ip33701TargetAmount2
	 */
	public BigDecimal getIp33701TargetAmount2() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmount2();
	}

    /**
	 *	Returns the String value of ip33701TargetAmount2
	 *	@return ip33701TargetAmount2
	 */
	public char[]  getIp33701TargetAmount2ActualString()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmount2ActualString();
	}

	 /**
     *	Returns String value of ip33701TargetAmount2
     *	@return ip33701TargetAmount2
     */
    public char[]  getIp33701TargetAmount2String() throws CFException {
         return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmount2String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean ip33701TargetAmount2IsNumeric() {
        return ip33701CurrConvInterface.getIp33701CurrConvOutput().ip33701TargetAmount2IsNumeric();
    }
	/**
	 * 	Update Ip33701TargetAmount2 with the passed number
	 *	@param number
	 */
	public void setIp33701TargetAmount2(BigDecimal number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount2(number);
   }

	/**
	 * 	Update Ip33701TargetAmount2 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setIp33701TargetAmount2(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount2(value);
	}   

	/**
	 *	Returns the value of ip33701TargetAmount5
	 *	@return ip33701TargetAmount5
	 */
	public BigDecimal getIp33701TargetAmount5() throws CFException {
   		return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmount5();
	}

    /**
	 *	Returns the String value of ip33701TargetAmount5
	 *	@return ip33701TargetAmount5
	 */
	public char[]  getIp33701TargetAmount5ActualString()  throws CFException{
	    return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmount5ActualString();
	}

	 /**
     *	Returns String value of ip33701TargetAmount5
     *	@return ip33701TargetAmount5
     */
    public char[]  getIp33701TargetAmount5String() throws CFException {
         return ip33701CurrConvInterface.getIp33701CurrConvOutput().getIp33701TargetAmount5String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean ip33701TargetAmount5IsNumeric() {
        return ip33701CurrConvInterface.getIp33701CurrConvOutput().ip33701TargetAmount5IsNumeric();
    }
	/**
	 * 	Update Ip33701TargetAmount5 with the passed number
	 *	@param number
	 */
	public void setIp33701TargetAmount5(BigDecimal number)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount5(number);
   }

	/**
	 * 	Update Ip33701TargetAmount5 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setIp33701TargetAmount5(char[] value)  throws CFException{
		ip33701CurrConvInterface.getIp33701CurrConvOutput().setIp33701TargetAmount5(value);
	}   


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip33701CurrConvInterface.hashCode();
        str += ichgCalcVars800.hashCode();
        str += ip00174TableEntry.hashCode();
       return str.hashCode();
    }

    public AlignIchgFeeAmtOutCtx clone() {
        AlignIchgFeeAmtOutCtx cloneObj = new AlignIchgFeeAmtOutCtx();
        cloneObj.ip33701CurrConvInterface = new Ip33701CurrConvInterface();
        cloneObj.ip33701CurrConvInterface.set(ip33701CurrConvInterface.getClonedField());
        cloneObj.ichgCalcVars800 = new IchgCalcVars800();
        cloneObj.ichgCalcVars800.set(ichgCalcVars800.getClonedField());
        cloneObj.ip00174TableEntry = new Ip00174TableEntry();
        cloneObj.ip00174TableEntry.set(ip00174TableEntry.getClonedField());
        return cloneObj;
    }

    }

    public AlignIchgFeeAmtOutCtx getAlignIchgFeeAmtOutCtx() {
            return new AlignIchgFeeAmtOutCtx();
    }
     public class AbendProgramInCtx implements Cloneable {
     AbendMessage900 abendMessage900 = Ip088030Ctx.this.getAbendMessage900();
     AbendPara900 abendPara900 = Ip088030Ctx.this.getAbendPara900();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip088030Ctx.this.getIp60001EventLogWorkArea();
     Work work = Ip088030Ctx.this.getWork();

	/**
	 *	Returns the value of abendMessage900
	 *	@return abendMessage900
	 */   
	 public AbendMessage900 getAbendMessage900() {
   	return abendMessage900;
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
	 *	Returns the value of abendPara900
	 *	@return abendPara900
	 */   
	 public AbendPara900 getAbendPara900() {
   	return abendPara900;
   }


	/**
	 *	Returns the value of pgmIp610010300
	 *	@return pgmIp610010300
	 */
   public char[] getPgmIp610010300() throws CFException  {              
   		return work.getPgmIp610010300();
   }

  
	/**
	*  set variable pgmIp610010300
	*  @param value
	**/
   public void setPgmIp610010300(char[] value) throws CFException {
      work.setPgmIp610010300(value);
   } 


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }

        public AbendProgramOutCtx getAbendProgramOutCtx() {
            return new AbendProgramOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendMessage900.hashCode();
        str += abendPara900.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public AbendProgramInCtx clone() {
        AbendProgramInCtx cloneObj = new AbendProgramInCtx();
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public AbendProgramInCtx getAbendProgramInCtx() {
            return new AbendProgramInCtx();
    }
     public class AbendProgramOutCtx implements Cloneable {
     AbendMessage900 abendMessage900 = Ip088030Ctx.this.getAbendMessage900();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip088030Ctx.this.getIp60001EventLogWorkArea();
     AbendPara900 abendPara900 = Ip088030Ctx.this.getAbendPara900();
     Work work = Ip088030Ctx.this.getWork();

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


        public Ip088030Ctx getIp088030Ctx() {
            return Ip088030Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendMessage900.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += abendPara900.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public AbendProgramOutCtx clone() {
        AbendProgramOutCtx cloneObj = new AbendProgramOutCtx();
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.abendPara900 = new AbendPara900();
        cloneObj.abendPara900.set(abendPara900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public AbendProgramOutCtx getAbendProgramOutCtx() {
            return new AbendProgramOutCtx();
    }
}
