package com.cloudframe.app.ip343900;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.global.sharedvar.Ip34051MqProcessParameters;
import com.cloudframe.app.ip343900.dto.Parms;
import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
import com.cloudframe.app.global.sharedvar.Ip02015PrcssAgrmtTable;
import com.cloudframe.app.global.sharedvar.ApiLayout;
import com.cloudframe.app.global.sharedvar.Ip34631Tipapim;
import com.cloudframe.app.global.sharedvar.Ip75081MqSwitches;
import com.cloudframe.app.ip343900.dto.Work;
import com.cloudframe.app.ip343900.dto.AbendParaName900;
import com.cloudframe.app.global.sharedvar.Ip57901Tipaqpr;
import com.cloudframe.app.ip343900.dto.Ip28221PaTableRestart;
import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
import com.cloudframe.app.global.sharedvar.Ip996021JobInformation;
import com.cloudframe.app.ip343900.dto.EnvrmentFileData800;
import com.cloudframe.app.ip343900.file.records.Sys001PimLoadRec;
import com.cloudframe.app.ip343900.file.records.Sys067EnvrmentRecord;
import com.cloudframe.app.global.sharedvar.Ip70511EntryFoundGroup;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
import com.cloudframe.app.global.sharedvar.Ip08101RunControlRecord;
import com.cloudframe.app.ip343900.dto.IoErrorType600;
import com.cloudframe.app.ip343900.dto.AbendMessage900;
import com.cloudframe.app.global.sharedvar.Ip02014PrcssAgrmtTable;
import com.cloudframe.app.ip343900.dto.IoErrorSys067601;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
import com.cloudframe.app.global.sharedvar.CheckFirstPutPimGroup100;
import com.cloudframe.app.global.sharedvar.Ip70511Table;


@Context
public class Ip343900Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Ip34631Tipapim ip34631Tipapim;
    Ip02014PrcssAgrmtTable ip02014PrcssAgrmtTable;
    EnvrmentFileData800 envrmentFileData800;
    CheckFirstPutPimGroup100 checkFirstPutPimGroup100;
    AbendMessage900 abendMessage900;
    Ip60001EventLogWorkArea ip60001EventLogWorkArea;
    IoErrorSys067601 ioErrorSys067601;
    Ip57901Tipaqpr ip57901Tipaqpr;
    Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup;
    Ip70511EntryFoundGroup ip70511EntryFoundGroup;
    Ip50005OneDayRec ip50005OneDayRec;
    Ip28221PaTableRestart ip28221PaTableRestart;
    IoErrorType600 ioErrorType600;
    Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup;
    Work work;
    Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable;
    Ip70511Table ip70511Table;
    Ip08101RunControlRecord ip08101RunControlRecord;
    Ip50005ClearingDtTm ip50005ClearingDtTm;
    Parms parms;
    ApiLayout apiLayout;
    Ip996021JobInformation ip996021JobInformation;
    AbendParaName900 abendParaName900;
    Ip34051MqProcessParameters ip34051MqProcessParameters;
    Sys001PimLoadRec sys001PimLoadRec;
    Sys067EnvrmentRecord sys067EnvrmentRecord;
    Ip996011ProgramStartMessage ip996011ProgramStartMessage;
    Ip75081MqSwitches ip75081MqSwitches;


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


    public Ip34631Tipapim getIp34631Tipapim() {
        if (ip34631Tipapim == null) {
            ip34631Tipapim = globalCtx.getGlobalDto(Ip34631Tipapim.class);
        }

        return ip34631Tipapim;
    }

    public Ip02014PrcssAgrmtTable getIp02014PrcssAgrmtTable() {
        if (ip02014PrcssAgrmtTable == null) {
            ip02014PrcssAgrmtTable = globalCtx.getGlobalDto(Ip02014PrcssAgrmtTable.class);
        }

        return ip02014PrcssAgrmtTable;
    }

    public EnvrmentFileData800 getEnvrmentFileData800() {
        if (envrmentFileData800 == null) {
            envrmentFileData800 = new EnvrmentFileData800();
        }

        return envrmentFileData800;
    }

    public void setEnvrmentFileData800(EnvrmentFileData800 envrmentFileData800) {
        this.envrmentFileData800 = envrmentFileData800;
    }
    public CheckFirstPutPimGroup100 getCheckFirstPutPimGroup100() {
        if (checkFirstPutPimGroup100 == null) {
            checkFirstPutPimGroup100 = globalCtx.getGlobalDto(CheckFirstPutPimGroup100.class);
        }

        return checkFirstPutPimGroup100;
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
    public Ip60001EventLogWorkArea getIp60001EventLogWorkArea() {
        if (ip60001EventLogWorkArea == null) {
            ip60001EventLogWorkArea = globalCtx.getGlobalDto(Ip60001EventLogWorkArea.class);
        }

        return ip60001EventLogWorkArea;
    }

    public IoErrorSys067601 getIoErrorSys067601() {
        if (ioErrorSys067601 == null) {
            ioErrorSys067601 = new IoErrorSys067601();
        }

        return ioErrorSys067601;
    }

    public void setIoErrorSys067601(IoErrorSys067601 ioErrorSys067601) {
        this.ioErrorSys067601 = ioErrorSys067601;
    }
    public Ip57901Tipaqpr getIp57901Tipaqpr() {
        if (ip57901Tipaqpr == null) {
            ip57901Tipaqpr = globalCtx.getGlobalDto(Ip57901Tipaqpr.class);
        }

        return ip57901Tipaqpr;
    }

    public Ip50005OneDayRecLthGroup getIp50005OneDayRecLthGroup() {
        if (ip50005OneDayRecLthGroup == null) {
            ip50005OneDayRecLthGroup = globalCtx.getGlobalDto(Ip50005OneDayRecLthGroup.class);
        }

        return ip50005OneDayRecLthGroup;
    }

    public Ip70511EntryFoundGroup getIp70511EntryFoundGroup() {
        if (ip70511EntryFoundGroup == null) {
            ip70511EntryFoundGroup = globalCtx.getGlobalDto(Ip70511EntryFoundGroup.class);
        }

        return ip70511EntryFoundGroup;
    }

    public Ip50005OneDayRec getIp50005OneDayRec() {
        if (ip50005OneDayRec == null) {
            ip50005OneDayRec = globalCtx.getGlobalDto(Ip50005OneDayRec.class);
        }

        return ip50005OneDayRec;
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
    public IoErrorType600 getIoErrorType600() {
        if (ioErrorType600 == null) {
            ioErrorType600 = new IoErrorType600();
        }

        return ioErrorType600;
    }

    public void setIoErrorType600(IoErrorType600 ioErrorType600) {
        this.ioErrorType600 = ioErrorType600;
    }
    public Ip50005OneDayReadStatusGroup getIp50005OneDayReadStatusGroup() {
        if (ip50005OneDayReadStatusGroup == null) {
            ip50005OneDayReadStatusGroup = globalCtx.getGlobalDto(Ip50005OneDayReadStatusGroup.class);
        }

        return ip50005OneDayReadStatusGroup;
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
    public Ip02015PrcssAgrmtTable getIp02015PrcssAgrmtTable() {
        if (ip02015PrcssAgrmtTable == null) {
            ip02015PrcssAgrmtTable = globalCtx.getGlobalDto(Ip02015PrcssAgrmtTable.class);
        }

        return ip02015PrcssAgrmtTable;
    }

    public Ip70511Table getIp70511Table() {
        if (ip70511Table == null) {
            ip70511Table = globalCtx.getGlobalDto(Ip70511Table.class);
        }

        return ip70511Table;
    }

    public Ip08101RunControlRecord getIp08101RunControlRecord() {
        if (ip08101RunControlRecord == null) {
            ip08101RunControlRecord = globalCtx.getGlobalDto(Ip08101RunControlRecord.class);
        }

        return ip08101RunControlRecord;
    }

    public Ip50005ClearingDtTm getIp50005ClearingDtTm() {
        if (ip50005ClearingDtTm == null) {
            ip50005ClearingDtTm = globalCtx.getGlobalDto(Ip50005ClearingDtTm.class);
        }

        return ip50005ClearingDtTm;
    }

    public Parms getParms() {
        if (parms == null) {
            parms = new Parms();
        }

        return parms;
    }

    public void setParms(Parms parms) {
        this.parms = parms;
    }
    public ApiLayout getApiLayout() {
        if (apiLayout == null) {
            apiLayout = globalCtx.getGlobalDto(ApiLayout.class);
        }

        return apiLayout;
    }

    public Ip996021JobInformation getIp996021JobInformation() {
        if (ip996021JobInformation == null) {
            ip996021JobInformation = globalCtx.getGlobalDto(Ip996021JobInformation.class);
        }

        return ip996021JobInformation;
    }

    public AbendParaName900 getAbendParaName900() {
        if (abendParaName900 == null) {
            abendParaName900 = new AbendParaName900();
        }

        return abendParaName900;
    }

    public void setAbendParaName900(AbendParaName900 abendParaName900) {
        this.abendParaName900 = abendParaName900;
    }
    public Ip34051MqProcessParameters getIp34051MqProcessParameters() {
        if (ip34051MqProcessParameters == null) {
            ip34051MqProcessParameters = globalCtx.getGlobalDto(Ip34051MqProcessParameters.class);
        }

        return ip34051MqProcessParameters;
    }

    public Sys001PimLoadRec getSys001PimLoadRec() {
        if (sys001PimLoadRec == null) {
            sys001PimLoadRec = new Sys001PimLoadRec();
        }

        return sys001PimLoadRec;
    }

    public void setSys001PimLoadRec(Sys001PimLoadRec sys001PimLoadRec) {
        this.sys001PimLoadRec = sys001PimLoadRec;
    }
    public Sys067EnvrmentRecord getSys067EnvrmentRecord() {
        if (sys067EnvrmentRecord == null) {
            sys067EnvrmentRecord = new Sys067EnvrmentRecord();
        }

        return sys067EnvrmentRecord;
    }

    public void setSys067EnvrmentRecord(Sys067EnvrmentRecord sys067EnvrmentRecord) {
        this.sys067EnvrmentRecord = sys067EnvrmentRecord;
    }
    public Ip996011ProgramStartMessage getIp996011ProgramStartMessage() {
        if (ip996011ProgramStartMessage == null) {
            ip996011ProgramStartMessage = globalCtx.getGlobalDto(Ip996011ProgramStartMessage.class);
        }

        return ip996011ProgramStartMessage;
    }

    public Ip75081MqSwitches getIp75081MqSwitches() {
        if (ip75081MqSwitches == null) {
            ip75081MqSwitches = globalCtx.getGlobalDto(Ip75081MqSwitches.class);
        }

        return ip75081MqSwitches;
    }



    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip34631Tipapim.hashCode();
        str += ip02014PrcssAgrmtTable.hashCode();
        str += envrmentFileData800.hashCode();
        str += checkFirstPutPimGroup100.hashCode();
        str += abendMessage900.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += ioErrorSys067601.hashCode();
        str += ip57901Tipaqpr.hashCode();
        str += ip50005OneDayRecLthGroup.hashCode();
        str += ip70511EntryFoundGroup.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += ip28221PaTableRestart.hashCode();
        str += ioErrorType600.hashCode();
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += work.hashCode();
        str += ip02015PrcssAgrmtTable.hashCode();
        str += ip70511Table.hashCode();
        str += ip08101RunControlRecord.hashCode();
        str += ip50005ClearingDtTm.hashCode();
        str += parms.hashCode();
        str += apiLayout.hashCode();
        str += ip996021JobInformation.hashCode();
        str += abendParaName900.hashCode();
        str += ip34051MqProcessParameters.hashCode();
        str += sys001PimLoadRec.hashCode();
        str += sys067EnvrmentRecord.hashCode();
        str += ip996011ProgramStartMessage.hashCode();
        str += ip75081MqSwitches.hashCode();
       return str.hashCode();
    }

    public Ip343900Ctx clone() {
        Ip343900Ctx cloneObj = new Ip343900Ctx();
        cloneObj.ip34631Tipapim = new Ip34631Tipapim();
        cloneObj.ip34631Tipapim.set(ip34631Tipapim.getClonedField());
        cloneObj.ip02014PrcssAgrmtTable = new Ip02014PrcssAgrmtTable();
        cloneObj.ip02014PrcssAgrmtTable.set(ip02014PrcssAgrmtTable.getClonedField());
        cloneObj.envrmentFileData800 = new EnvrmentFileData800();
        cloneObj.envrmentFileData800.set(envrmentFileData800.getClonedField());
        cloneObj.checkFirstPutPimGroup100 = new CheckFirstPutPimGroup100();
        cloneObj.checkFirstPutPimGroup100.set(checkFirstPutPimGroup100.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.ioErrorSys067601 = new IoErrorSys067601();
        cloneObj.ioErrorSys067601.set(ioErrorSys067601.getClonedField());
        cloneObj.ip57901Tipaqpr = new Ip57901Tipaqpr();
        cloneObj.ip57901Tipaqpr.set(ip57901Tipaqpr.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.ip70511EntryFoundGroup = new Ip70511EntryFoundGroup();
        cloneObj.ip70511EntryFoundGroup.set(ip70511EntryFoundGroup.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.ip28221PaTableRestart = new Ip28221PaTableRestart();
        cloneObj.ip28221PaTableRestart.set(ip28221PaTableRestart.getClonedField());
        cloneObj.ioErrorType600 = new IoErrorType600();
        cloneObj.ioErrorType600.set(ioErrorType600.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        cloneObj.ip70511Table = new Ip70511Table();
        cloneObj.ip70511Table.set(ip70511Table.getClonedField());
        cloneObj.ip08101RunControlRecord = new Ip08101RunControlRecord();
        cloneObj.ip08101RunControlRecord.set(ip08101RunControlRecord.getClonedField());
        cloneObj.ip50005ClearingDtTm = new Ip50005ClearingDtTm();
        cloneObj.ip50005ClearingDtTm.set(ip50005ClearingDtTm.getClonedField());
        cloneObj.parms = new Parms();
        cloneObj.parms.set(parms.getClonedField());
        cloneObj.apiLayout = new ApiLayout();
        cloneObj.apiLayout.set(apiLayout.getClonedField());
        cloneObj.ip996021JobInformation = new Ip996021JobInformation();
        cloneObj.ip996021JobInformation.set(ip996021JobInformation.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ip34051MqProcessParameters = new Ip34051MqProcessParameters();
        cloneObj.ip34051MqProcessParameters.set(ip34051MqProcessParameters.getClonedField());
        cloneObj.sys001PimLoadRec = new Sys001PimLoadRec();
        cloneObj.sys001PimLoadRec.set(sys001PimLoadRec.getClonedField());
        cloneObj.sys067EnvrmentRecord = new Sys067EnvrmentRecord();
        cloneObj.sys067EnvrmentRecord.set(sys067EnvrmentRecord.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.ip75081MqSwitches = new Ip75081MqSwitches();
        cloneObj.ip75081MqSwitches.set(ip75081MqSwitches.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Parms parms = Ip343900Ctx.this.getParms();


        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += parms.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.parms = new Parms();
        cloneObj.parms.set(parms.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessMainlineInCtx implements Cloneable {
     Work work = Ip343900Ctx.this.getWork();
     Ip75081MqSwitches ip75081MqSwitches = Ip343900Ctx.this.getIp75081MqSwitches();

	/**
	 *	Test condition "Y" for isItIsGlobal88100()
	 *	@return  Returns true if isItIsGlobal88100() is "Y"
	 */
   public boolean isItIsGlobal88100() throws CFException {
      return work.isItIsGlobal88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsGlobal88100True()  throws CFException{  			
    	work.setItIsGlobal88100True();
   	}
	/**
	 *	Returns the value of ptrIp750080800
	 *	@return ptrIp750080800
	 */
   public char[] getPtrIp750080800() throws CFException  {              
   		return work.getPtrIp750080800();
   }

  
	/**
	*  set variable ptrIp750080800
	*  @param value
	**/
   public void setPtrIp750080800(char[] value) throws CFException {
      work.setPtrIp750080800(value);
   } 


        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }

        public ProcessMainlineOutCtx getProcessMainlineOutCtx() {
            return new ProcessMainlineOutCtx();
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
        str += ip75081MqSwitches.hashCode();
       return str.hashCode();
    }

    public ProcessMainlineInCtx clone() {
        ProcessMainlineInCtx cloneObj = new ProcessMainlineInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip75081MqSwitches = new Ip75081MqSwitches();
        cloneObj.ip75081MqSwitches.set(ip75081MqSwitches.getClonedField());
        return cloneObj;
    }

    }

    public ProcessMainlineInCtx getProcessMainlineInCtx() {
            return new ProcessMainlineInCtx();
    }
     public class ProcessMainlineOutCtx implements Cloneable {
     Ip75081MqSwitches ip75081MqSwitches = Ip343900Ctx.this.getIp75081MqSwitches();
     Work work = Ip343900Ctx.this.getWork();

	/**
	 *	Test condition "Y" for isIp75081EndOfProcess88()
	 *	@return  Returns true if isIp75081EndOfProcess88() is "Y"
	 */
   public boolean isIp75081EndOfProcess88() throws CFException {
      return ip75081MqSwitches.isIp75081EndOfProcess88();
   }

	/**
	*  set values "Y"
	*/
   	public void setIp75081EndOfProcess88True()  throws CFException{  			
    	ip75081MqSwitches.setIp75081EndOfProcess88True();
   	}

        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip75081MqSwitches.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessMainlineOutCtx clone() {
        ProcessMainlineOutCtx cloneObj = new ProcessMainlineOutCtx();
        cloneObj.ip75081MqSwitches = new Ip75081MqSwitches();
        cloneObj.ip75081MqSwitches.set(ip75081MqSwitches.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessMainlineOutCtx getProcessMainlineOutCtx() {
            return new ProcessMainlineOutCtx();
    }
     public class DoInitializeInCtx implements Cloneable {
     Ip02014PrcssAgrmtTable ip02014PrcssAgrmtTable = Ip343900Ctx.this.getIp02014PrcssAgrmtTable();
     CheckFirstPutPimGroup100 checkFirstPutPimGroup100 = Ip343900Ctx.this.getCheckFirstPutPimGroup100();
     Work work = Ip343900Ctx.this.getWork();
     Ip75081MqSwitches ip75081MqSwitches = Ip343900Ctx.this.getIp75081MqSwitches();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip343900Ctx.this.getIp60001EventLogWorkArea();

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
	 *	Returns the value of pgmIp532010300
	 *	@return pgmIp532010300
	 */
   public char[] getPgmIp532010300() throws CFException  {              
   		return work.getPgmIp532010300();
   }

  
	/**
	*  set variable pgmIp532010300
	*  @param value
	**/
   public void setPgmIp532010300(char[] value) throws CFException {
      work.setPgmIp532010300(value);
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
	 *	Returns the value of programId300
	 *	@return programId300
	 */
   public char[] getProgramId300() throws CFException  {              
   		return work.getProgramId300();
   }

  
	/**
	*  set variable programId300
	*  @param value
	**/
   public void setProgramId300(char[] value) throws CFException {
      work.setProgramId300(value);
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
	 *	Returns the value of valueGlobal300
	 *	@return valueGlobal300
	 */
   public char[] getValueGlobal300() throws CFException  {              
   		return work.getValueGlobal300();
   }

  
	/**
	*  set variable valueGlobal300
	*  @param value
	**/
   public void setValueGlobal300(char[] value) throws CFException {
      work.setValueGlobal300(value);
   } 

	/**
	 *	Returns the value of pgmIp750080300
	 *	@return pgmIp750080300
	 */
   public char[] getPgmIp750080300() throws CFException  {              
   		return work.getPgmIp750080300();
   }

  
	/**
	*  set variable pgmIp750080300
	*  @param value
	**/
   public void setPgmIp750080300(char[] value) throws CFException {
      work.setPgmIp750080300(value);
   } 

	/**
	 *	Returns the value of ip02014PrcssAgrmtId
	 *	@return ip02014PrcssAgrmtId
	 */
   public char[] getIp02014PrcssAgrmtId() throws CFException  {              
   		return ip02014PrcssAgrmtTable.getIp02014TableDataKey().getIp02014PrcssAgrmtId();
   }

  
	/**
	*  set variable ip02014PrcssAgrmtId
	*  @param value
	**/
   public void setIp02014PrcssAgrmtId(char[] value) throws CFException {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(value);
   } 

     /**
	 * 	Update Ip02014PrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(char[] source, int sourceIndex) throws CFException {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source, sourceIndex);
   	
   }
   
   public void setIp02014PrcssAgrmtId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014PrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014PrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(Field source) {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source);
   }  
   
     /**
	 * 	Update Ip02014PrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(Field source, int sourceIndex,int sourceLen) {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014PrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }

        public DoInitializeOutCtx getDoInitializeOutCtx() {
            return new DoInitializeOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip02014PrcssAgrmtTable.hashCode();
        str += checkFirstPutPimGroup100.hashCode();
        str += work.hashCode();
        str += ip75081MqSwitches.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public DoInitializeInCtx clone() {
        DoInitializeInCtx cloneObj = new DoInitializeInCtx();
        cloneObj.ip02014PrcssAgrmtTable = new Ip02014PrcssAgrmtTable();
        cloneObj.ip02014PrcssAgrmtTable.set(ip02014PrcssAgrmtTable.getClonedField());
        cloneObj.checkFirstPutPimGroup100 = new CheckFirstPutPimGroup100();
        cloneObj.checkFirstPutPimGroup100.set(checkFirstPutPimGroup100.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip75081MqSwitches = new Ip75081MqSwitches();
        cloneObj.ip75081MqSwitches.set(ip75081MqSwitches.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public DoInitializeInCtx getDoInitializeInCtx() {
            return new DoInitializeInCtx();
    }
     public class DoInitializeOutCtx implements Cloneable {
     Ip02014PrcssAgrmtTable ip02014PrcssAgrmtTable = Ip343900Ctx.this.getIp02014PrcssAgrmtTable();
     CheckFirstPutPimGroup100 checkFirstPutPimGroup100 = Ip343900Ctx.this.getCheckFirstPutPimGroup100();
     Ip75081MqSwitches ip75081MqSwitches = Ip343900Ctx.this.getIp75081MqSwitches();
     Work work = Ip343900Ctx.this.getWork();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip343900Ctx.this.getIp60001EventLogWorkArea();

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
	 *	Test condition "N" for isIp75081NtEndOfProcess88()
	 *	@return  Returns true if isIp75081NtEndOfProcess88() is "N"
	 */
   public boolean isIp75081NtEndOfProcess88() throws CFException {
      return ip75081MqSwitches.isIp75081NtEndOfProcess88();
   }

	/**
	*  set values "N"
	*/
   	public void setIp75081NtEndOfProcess88True()  throws CFException{  			
    	ip75081MqSwitches.setIp75081NtEndOfProcess88True();
   	}
	/**
	 *	Returns the value of programId300
	 *	@return programId300
	 */
   public char[] getProgramId300() throws CFException  {              
   		return work.getProgramId300();
   }

  
	/**
	*  set variable programId300
	*  @param value
	**/
   public void setProgramId300(char[] value) throws CFException {
      work.setProgramId300(value);
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
	 *	Test condition "Y" for isFirstPutPim88100()
	 *	@return  Returns true if isFirstPutPim88100() is "Y"
	 */
   public boolean isFirstPutPim88100() throws CFException {
      return checkFirstPutPimGroup100.isFirstPutPim88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setFirstPutPim88100True()  throws CFException{  			
    	checkFirstPutPimGroup100.setFirstPutPim88100True();
   	}
	/**
	 *	Returns the value of ptrIp532010800
	 *	@return ptrIp532010800
	 */
   public char[] getPtrIp532010800() throws CFException  {              
   		return work.getPtrIp532010800();
   }

  
	/**
	*  set variable ptrIp532010800
	*  @param value
	**/
   public void setPtrIp532010800(char[] value) throws CFException {
      work.setPtrIp532010800(value);
   } 

	/**
	 *	Returns the value of ptrIp750080800
	 *	@return ptrIp750080800
	 */
   public char[] getPtrIp750080800() throws CFException  {              
   		return work.getPtrIp750080800();
   }

  
	/**
	*  set variable ptrIp750080800
	*  @param value
	**/
   public void setPtrIp750080800(char[] value) throws CFException {
      work.setPtrIp750080800(value);
   } 

	/**
	 *	Test condition "3" for isIp75081IsFromPim88()
	 *	@return  Returns true if isIp75081IsFromPim88() is "3"
	 */
   public boolean isIp75081IsFromPim88() throws CFException {
      return ip75081MqSwitches.isIp75081IsFromPim88();
   }

	/**
	*  set values "3"
	*/
   	public void setIp75081IsFromPim88True()  throws CFException{  			
    	ip75081MqSwitches.setIp75081IsFromPim88True();
   	}

        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip02014PrcssAgrmtTable.hashCode();
        str += checkFirstPutPimGroup100.hashCode();
        str += ip75081MqSwitches.hashCode();
        str += work.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public DoInitializeOutCtx clone() {
        DoInitializeOutCtx cloneObj = new DoInitializeOutCtx();
        cloneObj.ip02014PrcssAgrmtTable = new Ip02014PrcssAgrmtTable();
        cloneObj.ip02014PrcssAgrmtTable.set(ip02014PrcssAgrmtTable.getClonedField());
        cloneObj.checkFirstPutPimGroup100 = new CheckFirstPutPimGroup100();
        cloneObj.checkFirstPutPimGroup100.set(checkFirstPutPimGroup100.getClonedField());
        cloneObj.ip75081MqSwitches = new Ip75081MqSwitches();
        cloneObj.ip75081MqSwitches.set(ip75081MqSwitches.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public DoInitializeOutCtx getDoInitializeOutCtx() {
            return new DoInitializeOutCtx();
    }
     public class DisplayExecMsgsInCtx implements Cloneable {
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = Ip343900Ctx.this.getIp996011ProgramStartMessage();
     Work work = Ip343900Ctx.this.getWork();

	/**
	 *	Returns the value of programId300
	 *	@return programId300
	 */
   public char[] getProgramId300() throws CFException  {              
   		return work.getProgramId300();
   }

  
	/**
	*  set variable programId300
	*  @param value
	**/
   public void setProgramId300(char[] value) throws CFException {
      work.setProgramId300(value);
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


        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
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
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = Ip343900Ctx.this.getIp996011ProgramStartMessage();
     Work work = Ip343900Ctx.this.getWork();

	/**
	 *	Returns the value of programId300
	 *	@return programId300
	 */
   public char[] getProgramId300() throws CFException  {              
   		return work.getProgramId300();
   }

  
	/**
	*  set variable programId300
	*  @param value
	**/
   public void setProgramId300(char[] value) throws CFException {
      work.setProgramId300(value);
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


        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
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
     public class OpenPmmFixUnloadFileInCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip343900Ctx.this.getAbendParaName900();
     Sys001PimLoadRec sys001PimLoadRec = Ip343900Ctx.this.getSys001PimLoadRec();
     IoErrorType600 ioErrorType600 = Ip343900Ctx.this.getIoErrorType600();
     Work work = Ip343900Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip343900Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of openAbendCode300
	 *	@return openAbendCode300
	 */
   public char[] getOpenAbendCode300() throws CFException  {              
   		return work.getOpenAbendCode300();
   }

  
	/**
	*  set variable openAbendCode300
	*  @param value
	**/
   public void setOpenAbendCode300(char[] value) throws CFException {
      work.setOpenAbendCode300(value);
   } 

	/**
	 *	Returns the value of sys001PimLoadRec
	 *	@return sys001PimLoadRec
	 */   
	 public Sys001PimLoadRec getSys001PimLoadRec() {
   	return sys001PimLoadRec;
   }


	/**
	 *	Returns the value of ioErrorType600
	 *	@return ioErrorType600
	 */   
	 public IoErrorType600 getIoErrorType600() {
   	return ioErrorType600;
   }



        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }

        public OpenPmmFixUnloadFileOutCtx getOpenPmmFixUnloadFileOutCtx() {
            return new OpenPmmFixUnloadFileOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendParaName900.hashCode();
        str += sys001PimLoadRec.hashCode();
        str += ioErrorType600.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public OpenPmmFixUnloadFileInCtx clone() {
        OpenPmmFixUnloadFileInCtx cloneObj = new OpenPmmFixUnloadFileInCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.sys001PimLoadRec = new Sys001PimLoadRec();
        cloneObj.sys001PimLoadRec.set(sys001PimLoadRec.getClonedField());
        cloneObj.ioErrorType600 = new IoErrorType600();
        cloneObj.ioErrorType600.set(ioErrorType600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public OpenPmmFixUnloadFileInCtx getOpenPmmFixUnloadFileInCtx() {
            return new OpenPmmFixUnloadFileInCtx();
    }
     public class OpenPmmFixUnloadFileOutCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip343900Ctx.this.getAbendParaName900();
     Sys001PimLoadRec sys001PimLoadRec = Ip343900Ctx.this.getSys001PimLoadRec();
     IoErrorType600 ioErrorType600 = Ip343900Ctx.this.getIoErrorType600();
     Work work = Ip343900Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip343900Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of openAbendCode300
	 *	@return openAbendCode300
	 */
   public char[] getOpenAbendCode300() throws CFException  {              
   		return work.getOpenAbendCode300();
   }

  
	/**
	*  set variable openAbendCode300
	*  @param value
	**/
   public void setOpenAbendCode300(char[] value) throws CFException {
      work.setOpenAbendCode300(value);
   } 

	/**
	 *	Returns the value of paraName300
	 *	@return paraName300
	 */
   public char[] getParaName300() throws CFException  {              
   		return work.getParaName300();
   }

  
	/**
	*  set variable paraName300
	*  @param value
	**/
   public void setParaName300(char[] value) throws CFException {
      work.setParaName300(value);
   } 

	/**
	 *	Test condition "1200-OPEN-PMM-FIX-UNLOAD-FILE" for isPara120088300()
	 *	@return  Returns true if isPara120088300() is "1200-OPEN-PMM-FIX-UNLOAD-FILE"
	 */
   public boolean isPara120088300() throws CFException {
      return work.isPara120088300();
   }

	/**
	*  set values "1200-OPEN-PMM-FIX-UNLOAD-FILE"
	*/
   	public void setPara120088300True()  throws CFException{  			
    	work.setPara120088300True();
   	}
	/**
	 *	Returns the value of sys001FileStat600
	 *	@return sys001FileStat600
	 */
	public int getSys001FileStat600() throws CFException {
   		return ioErrorType600.getSys001FileStat600();
	}


	/**
	 *	Returns String value of sys001FileStat600
	 *	@return sys001FileStat600
	 */
	public char[]  getSys001FileStat600String() throws CFException {
	     return String.valueOf(ioErrorType600.getSys001FileStat600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys001FileStat600IsNumeric()  throws CFException{
	    return ioErrorType600.sys001FileStat600IsNumeric();
	}

	/**
	 * 	Update Sys001FileStat600 with the passed value
	 *	@param number
	 */
	public void setSys001FileStat600(int number)  throws CFException{
		ioErrorType600.setSys001FileStat600(number);
	}
	

	public void setSys001FileStat600(long number)  throws CFException{
	    ioErrorType600.setSys001FileStat600(number);
	}
	
	
	/**
	 * 	Update Sys001FileStat600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSys001FileStat600(char[] value)  throws CFException {
		ioErrorType600.setSys001FileStat600(value);
	}
	
	/**
	 * 	Update Sys001FileStat600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSys001FileStat600String(char[] value)  throws CFException{
		ioErrorType600.setSys001FileStat600(value);
	}	

	/**
	 *	Returns the value of abendPara900
	 *	@return abendPara900
	 */
   public char[] getAbendPara900() throws CFException  {              
   		return abendParaName900.getAbendPara900();
   }

  
	/**
	*  set variable abendPara900
	*  @param value
	**/
   public void setAbendPara900(char[] value) throws CFException {
      abendParaName900.setAbendPara900(value);
   } 

     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex) throws CFException {
      abendParaName900.setAbendPara900(source, sourceIndex);
   	
   }
   
   public void setAbendPara900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendPara900 with another Field
	 *	@param value
	 */
   public void setAbendPara900(Field source) {
      abendParaName900.setAbendPara900(source);
   }  
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "ERROR OPENING SYS001 FILE.  " for isOpenError88600()
	 *	@return  Returns true if isOpenError88600() is "ERROR OPENING SYS001 FILE.  "
	 */
   public boolean isOpenError88600() throws CFException {
      return ioErrorType600.isOpenError88600();
   }

	/**
	*  set values "ERROR OPENING SYS001 FILE.  "
	*/
   	public void setOpenError88600True()  throws CFException{  			
    	ioErrorType600.setOpenError88600True();
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
	 *	Returns the value of ioErrorType600
	 *	@return ioErrorType600
	 */   
	 public IoErrorType600 getIoErrorType600() {
   	return ioErrorType600;
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
	 *	Returns the value of sys067Status200
	 *	@return sys067Status200
	 */
   public char[] getSys067Status200() throws CFException  {              
   		return work.getSys067Status200();
   }

  
	/**
	*  set variable sys067Status200
	*  @param value
	**/
   public void setSys067Status200(char[] value) throws CFException {
      work.setSys067Status200(value);
   } 

	/**
	 *	Returns the value of sys001Status200
	 *	@return sys001Status200
	 */
	public int getSys001Status200() throws CFException {
   		return work.getSys001Status200();
	}


	/**
	 *	Returns String value of sys001Status200
	 *	@return sys001Status200
	 */
	public char[]  getSys001Status200String() throws CFException {
	     return String.valueOf(work.getSys001Status200String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys001Status200IsNumeric()  throws CFException{
	    return work.sys001Status200IsNumeric();
	}

	/**
	 * 	Update Sys001Status200 with the passed value
	 *	@param number
	 */
	public void setSys001Status200(int number)  throws CFException{
		work.setSys001Status200(number);
	}
	

	public void setSys001Status200(long number)  throws CFException{
	    work.setSys001Status200(number);
	}
	
	
	/**
	 * 	Update Sys001Status200 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSys001Status200(char[] value)  throws CFException {
		work.setSys001Status200(value);
	}
	
	/**
	 * 	Update Sys001Status200 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSys001Status200String(char[] value)  throws CFException{
		work.setSys001Status200(value);
	}	

	/**
	 *	Test condition 0 for isSys001Good88200()
	 *	@return  Returns true if isSys001Good88200() is 0
	 */
   public boolean isSys001Good88200() throws CFException {
      return work.isSys001Good88200();
   }

	/**
	*  set values 0
	*/
   	public void setSys001Good88200True()  throws CFException{  			
    	work.setSys001Good88200True();
   	}

        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendParaName900.hashCode();
        str += sys001PimLoadRec.hashCode();
        str += ioErrorType600.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public OpenPmmFixUnloadFileOutCtx clone() {
        OpenPmmFixUnloadFileOutCtx cloneObj = new OpenPmmFixUnloadFileOutCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.sys001PimLoadRec = new Sys001PimLoadRec();
        cloneObj.sys001PimLoadRec.set(sys001PimLoadRec.getClonedField());
        cloneObj.ioErrorType600 = new IoErrorType600();
        cloneObj.ioErrorType600.set(ioErrorType600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public OpenPmmFixUnloadFileOutCtx getOpenPmmFixUnloadFileOutCtx() {
            return new OpenPmmFixUnloadFileOutCtx();
    }
     public class GetRunCntrlFileInCtx implements Cloneable {
     Ip50005ClearingDtTm ip50005ClearingDtTm = Ip343900Ctx.this.getIp50005ClearingDtTm();
     Work work = Ip343900Ctx.this.getWork();
     Ip08101RunControlRecord ip08101RunControlRecord = Ip343900Ctx.this.getIp08101RunControlRecord();

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



        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }

        public GetRunCntrlFileOutCtx getGetRunCntrlFileOutCtx() {
            return new GetRunCntrlFileOutCtx();
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
        str += work.hashCode();
        str += ip08101RunControlRecord.hashCode();
       return str.hashCode();
    }

    public GetRunCntrlFileInCtx clone() {
        GetRunCntrlFileInCtx cloneObj = new GetRunCntrlFileInCtx();
        cloneObj.ip50005ClearingDtTm = new Ip50005ClearingDtTm();
        cloneObj.ip50005ClearingDtTm.set(ip50005ClearingDtTm.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip08101RunControlRecord = new Ip08101RunControlRecord();
        cloneObj.ip08101RunControlRecord.set(ip08101RunControlRecord.getClonedField());
        return cloneObj;
    }

    }

    public GetRunCntrlFileInCtx getGetRunCntrlFileInCtx() {
            return new GetRunCntrlFileInCtx();
    }
     public class GetRunCntrlFileOutCtx implements Cloneable {
     Ip50005ClearingDtTm ip50005ClearingDtTm = Ip343900Ctx.this.getIp50005ClearingDtTm();
     Work work = Ip343900Ctx.this.getWork();
     Ip08101RunControlRecord ip08101RunControlRecord = Ip343900Ctx.this.getIp08101RunControlRecord();

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


        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
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
        str += work.hashCode();
        str += ip08101RunControlRecord.hashCode();
       return str.hashCode();
    }

    public GetRunCntrlFileOutCtx clone() {
        GetRunCntrlFileOutCtx cloneObj = new GetRunCntrlFileOutCtx();
        cloneObj.ip50005ClearingDtTm = new Ip50005ClearingDtTm();
        cloneObj.ip50005ClearingDtTm.set(ip50005ClearingDtTm.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip08101RunControlRecord = new Ip08101RunControlRecord();
        cloneObj.ip08101RunControlRecord.set(ip08101RunControlRecord.getClonedField());
        return cloneObj;
    }

    }

    public GetRunCntrlFileOutCtx getGetRunCntrlFileOutCtx() {
            return new GetRunCntrlFileOutCtx();
    }
     public class OpenInputSys067InCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip343900Ctx.this.getAbendParaName900();
     IoErrorSys067601 ioErrorSys067601 = Ip343900Ctx.this.getIoErrorSys067601();
     Sys067EnvrmentRecord sys067EnvrmentRecord = Ip343900Ctx.this.getSys067EnvrmentRecord();
     IoErrorType600 ioErrorType600 = Ip343900Ctx.this.getIoErrorType600();
     Work work = Ip343900Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip343900Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of openAbendCode300
	 *	@return openAbendCode300
	 */
   public char[] getOpenAbendCode300() throws CFException  {              
   		return work.getOpenAbendCode300();
   }

  
	/**
	*  set variable openAbendCode300
	*  @param value
	**/
   public void setOpenAbendCode300(char[] value) throws CFException {
      work.setOpenAbendCode300(value);
   } 

	/**
	 *	Returns the value of ioErrorSys067601
	 *	@return ioErrorSys067601
	 */   
	 public IoErrorSys067601 getIoErrorSys067601() {
   	return ioErrorSys067601;
   }


	/**
	 *	Returns the value of sys067EnvrmentRecord
	 *	@return sys067EnvrmentRecord
	 */   
	 public Sys067EnvrmentRecord getSys067EnvrmentRecord() {
   	return sys067EnvrmentRecord;
   }



        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }

        public OpenInputSys067OutCtx getOpenInputSys067OutCtx() {
            return new OpenInputSys067OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendParaName900.hashCode();
        str += ioErrorSys067601.hashCode();
        str += sys067EnvrmentRecord.hashCode();
        str += ioErrorType600.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public OpenInputSys067InCtx clone() {
        OpenInputSys067InCtx cloneObj = new OpenInputSys067InCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ioErrorSys067601 = new IoErrorSys067601();
        cloneObj.ioErrorSys067601.set(ioErrorSys067601.getClonedField());
        cloneObj.sys067EnvrmentRecord = new Sys067EnvrmentRecord();
        cloneObj.sys067EnvrmentRecord.set(sys067EnvrmentRecord.getClonedField());
        cloneObj.ioErrorType600 = new IoErrorType600();
        cloneObj.ioErrorType600.set(ioErrorType600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public OpenInputSys067InCtx getOpenInputSys067InCtx() {
            return new OpenInputSys067InCtx();
    }
     public class OpenInputSys067OutCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip343900Ctx.this.getAbendParaName900();
     IoErrorSys067601 ioErrorSys067601 = Ip343900Ctx.this.getIoErrorSys067601();
     Sys067EnvrmentRecord sys067EnvrmentRecord = Ip343900Ctx.this.getSys067EnvrmentRecord();
     IoErrorType600 ioErrorType600 = Ip343900Ctx.this.getIoErrorType600();
     Work work = Ip343900Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip343900Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of openAbendCode300
	 *	@return openAbendCode300
	 */
   public char[] getOpenAbendCode300() throws CFException  {              
   		return work.getOpenAbendCode300();
   }

  
	/**
	*  set variable openAbendCode300
	*  @param value
	**/
   public void setOpenAbendCode300(char[] value) throws CFException {
      work.setOpenAbendCode300(value);
   } 

	/**
	 *	Returns the value of ioErrorSys067601
	 *	@return ioErrorSys067601
	 */   
	 public IoErrorSys067601 getIoErrorSys067601() {
   	return ioErrorSys067601;
   }


	/**
	 *	Returns the value of paraName300
	 *	@return paraName300
	 */
   public char[] getParaName300() throws CFException  {              
   		return work.getParaName300();
   }

  
	/**
	*  set variable paraName300
	*  @param value
	**/
   public void setParaName300(char[] value) throws CFException {
      work.setParaName300(value);
   } 

	/**
	 *	Returns the value of sys001FileStat600
	 *	@return sys001FileStat600
	 */
	public int getSys001FileStat600() throws CFException {
   		return ioErrorType600.getSys001FileStat600();
	}


	/**
	 *	Returns String value of sys001FileStat600
	 *	@return sys001FileStat600
	 */
	public char[]  getSys001FileStat600String() throws CFException {
	     return String.valueOf(ioErrorType600.getSys001FileStat600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys001FileStat600IsNumeric()  throws CFException{
	    return ioErrorType600.sys001FileStat600IsNumeric();
	}

	/**
	 * 	Update Sys001FileStat600 with the passed value
	 *	@param number
	 */
	public void setSys001FileStat600(int number)  throws CFException{
		ioErrorType600.setSys001FileStat600(number);
	}
	

	public void setSys001FileStat600(long number)  throws CFException{
	    ioErrorType600.setSys001FileStat600(number);
	}
	
	
	/**
	 * 	Update Sys001FileStat600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSys001FileStat600(char[] value)  throws CFException {
		ioErrorType600.setSys001FileStat600(value);
	}
	
	/**
	 * 	Update Sys001FileStat600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSys001FileStat600String(char[] value)  throws CFException{
		ioErrorType600.setSys001FileStat600(value);
	}	

	/**
	 *	Returns the value of abendPara900
	 *	@return abendPara900
	 */
   public char[] getAbendPara900() throws CFException  {              
   		return abendParaName900.getAbendPara900();
   }

  
	/**
	*  set variable abendPara900
	*  @param value
	**/
   public void setAbendPara900(char[] value) throws CFException {
      abendParaName900.setAbendPara900(value);
   } 

     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex) throws CFException {
      abendParaName900.setAbendPara900(source, sourceIndex);
   	
   }
   
   public void setAbendPara900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendPara900 with another Field
	 *	@param value
	 */
   public void setAbendPara900(Field source) {
      abendParaName900.setAbendPara900(source);
   }  
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of sys067Status200
	 *	@return sys067Status200
	 */
   public char[] getSys067Status200() throws CFException  {              
   		return work.getSys067Status200();
   }

  
	/**
	*  set variable sys067Status200
	*  @param value
	**/
   public void setSys067Status200(char[] value) throws CFException {
      work.setSys067Status200(value);
   } 

	/**
	 *	Test condition "1351-OPEN-INPUT-SYS067." for isPara135188300()
	 *	@return  Returns true if isPara135188300() is "1351-OPEN-INPUT-SYS067."
	 */
   public boolean isPara135188300() throws CFException {
      return work.isPara135188300();
   }

	/**
	*  set values "1351-OPEN-INPUT-SYS067."
	*/
   	public void setPara135188300True()  throws CFException{  			
    	work.setPara135188300True();
   	}
	/**
	 *	Test condition "ERROR OPENING SYS067 FILE.  " for isOpenError88601()
	 *	@return  Returns true if isOpenError88601() is "ERROR OPENING SYS067 FILE.  "
	 */
   public boolean isOpenError88601() throws CFException {
      return ioErrorSys067601.isOpenError88601();
   }

	/**
	*  set values "ERROR OPENING SYS067 FILE.  "
	*/
   	public void setOpenError88601True()  throws CFException{  			
    	ioErrorSys067601.setOpenError88601True();
   	}
	/**
	 *	Test condition "00" for isSys067IoGood88200()
	 *	@return  Returns true if isSys067IoGood88200() is "00"
	 */
   public boolean isSys067IoGood88200() throws CFException {
      return work.isSys067IoGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys067IoGood88200True()  throws CFException{  			
    	work.setSys067IoGood88200True();
   	}

        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendParaName900.hashCode();
        str += ioErrorSys067601.hashCode();
        str += sys067EnvrmentRecord.hashCode();
        str += ioErrorType600.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public OpenInputSys067OutCtx clone() {
        OpenInputSys067OutCtx cloneObj = new OpenInputSys067OutCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ioErrorSys067601 = new IoErrorSys067601();
        cloneObj.ioErrorSys067601.set(ioErrorSys067601.getClonedField());
        cloneObj.sys067EnvrmentRecord = new Sys067EnvrmentRecord();
        cloneObj.sys067EnvrmentRecord.set(sys067EnvrmentRecord.getClonedField());
        cloneObj.ioErrorType600 = new IoErrorType600();
        cloneObj.ioErrorType600.set(ioErrorType600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public OpenInputSys067OutCtx getOpenInputSys067OutCtx() {
            return new OpenInputSys067OutCtx();
    }
     public class ReadInputSys067InCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip343900Ctx.this.getAbendParaName900();
     IoErrorSys067601 ioErrorSys067601 = Ip343900Ctx.this.getIoErrorSys067601();
     EnvrmentFileData800 envrmentFileData800 = Ip343900Ctx.this.getEnvrmentFileData800();
     Sys067EnvrmentRecord sys067EnvrmentRecord = Ip343900Ctx.this.getSys067EnvrmentRecord();
     IoErrorType600 ioErrorType600 = Ip343900Ctx.this.getIoErrorType600();
     Work work = Ip343900Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip343900Ctx.this.getAbendMessage900();
     Ip70511Table ip70511Table = Ip343900Ctx.this.getIp70511Table();

	/**
	 *	Returns the value of readAbendCode300
	 *	@return readAbendCode300
	 */
   public char[] getReadAbendCode300() throws CFException  {              
   		return work.getReadAbendCode300();
   }

  
	/**
	*  set variable readAbendCode300
	*  @param value
	**/
   public void setReadAbendCode300(char[] value) throws CFException {
      work.setReadAbendCode300(value);
   } 

	/**
	 *	Returns the value of ioErrorSys067601
	 *	@return ioErrorSys067601
	 */   
	 public IoErrorSys067601 getIoErrorSys067601() {
   	return ioErrorSys067601;
   }


	/**
	 *	Returns the value of parmEnvIdentifier800
	 *	@return parmEnvIdentifier800
	 */
   public char[] getParmEnvIdentifier800() throws CFException  {              
   		return envrmentFileData800.getParmEnvIdentifier800();
   }

  
	/**
	*  set variable parmEnvIdentifier800
	*  @param value
	**/
   public void setParmEnvIdentifier800(char[] value) throws CFException {
      envrmentFileData800.setParmEnvIdentifier800(value);
   } 

     /**
	 * 	Update ParmEnvIdentifier800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParmEnvIdentifier800(char[] source, int sourceIndex) throws CFException {
      envrmentFileData800.setParmEnvIdentifier800(source, sourceIndex);
   	
   }
   
   public void setParmEnvIdentifier800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      envrmentFileData800.setParmEnvIdentifier800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ParmEnvIdentifier800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParmEnvIdentifier800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      envrmentFileData800.setParmEnvIdentifier800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ParmEnvIdentifier800 with another Field
	 *	@param value
	 */
   public void setParmEnvIdentifier800(Field source) {
      envrmentFileData800.setParmEnvIdentifier800(source);
   }  
   
     /**
	 * 	Update ParmEnvIdentifier800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParmEnvIdentifier800(Field source, int sourceIndex,int sourceLen) {
      envrmentFileData800.setParmEnvIdentifier800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ParmEnvIdentifier800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParmEnvIdentifier800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      envrmentFileData800.setParmEnvIdentifier800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of envrmentFileData800
	 *	@return envrmentFileData800
	 */   
	 public EnvrmentFileData800 getEnvrmentFileData800() {
   	return envrmentFileData800;
   }



        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }

        public ReadInputSys067OutCtx getReadInputSys067OutCtx() {
            return new ReadInputSys067OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendParaName900.hashCode();
        str += ioErrorSys067601.hashCode();
        str += envrmentFileData800.hashCode();
        str += sys067EnvrmentRecord.hashCode();
        str += ioErrorType600.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
        str += ip70511Table.hashCode();
       return str.hashCode();
    }

    public ReadInputSys067InCtx clone() {
        ReadInputSys067InCtx cloneObj = new ReadInputSys067InCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ioErrorSys067601 = new IoErrorSys067601();
        cloneObj.ioErrorSys067601.set(ioErrorSys067601.getClonedField());
        cloneObj.envrmentFileData800 = new EnvrmentFileData800();
        cloneObj.envrmentFileData800.set(envrmentFileData800.getClonedField());
        cloneObj.sys067EnvrmentRecord = new Sys067EnvrmentRecord();
        cloneObj.sys067EnvrmentRecord.set(sys067EnvrmentRecord.getClonedField());
        cloneObj.ioErrorType600 = new IoErrorType600();
        cloneObj.ioErrorType600.set(ioErrorType600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.ip70511Table = new Ip70511Table();
        cloneObj.ip70511Table.set(ip70511Table.getClonedField());
        return cloneObj;
    }

    }

    public ReadInputSys067InCtx getReadInputSys067InCtx() {
            return new ReadInputSys067InCtx();
    }
     public class ReadInputSys067OutCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip343900Ctx.this.getAbendParaName900();
     IoErrorSys067601 ioErrorSys067601 = Ip343900Ctx.this.getIoErrorSys067601();
     EnvrmentFileData800 envrmentFileData800 = Ip343900Ctx.this.getEnvrmentFileData800();
     Sys067EnvrmentRecord sys067EnvrmentRecord = Ip343900Ctx.this.getSys067EnvrmentRecord();
     IoErrorType600 ioErrorType600 = Ip343900Ctx.this.getIoErrorType600();
     Work work = Ip343900Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip343900Ctx.this.getAbendMessage900();
     Ip70511Table ip70511Table = Ip343900Ctx.this.getIp70511Table();

	/**
	 *	Returns the value of readAbendCode300
	 *	@return readAbendCode300
	 */
   public char[] getReadAbendCode300() throws CFException  {              
   		return work.getReadAbendCode300();
   }

  
	/**
	*  set variable readAbendCode300
	*  @param value
	**/
   public void setReadAbendCode300(char[] value) throws CFException {
      work.setReadAbendCode300(value);
   } 

	/**
	 *	Returns the value of paraName300
	 *	@return paraName300
	 */
   public char[] getParaName300() throws CFException  {              
   		return work.getParaName300();
   }

  
	/**
	*  set variable paraName300
	*  @param value
	**/
   public void setParaName300(char[] value) throws CFException {
      work.setParaName300(value);
   } 

	/**
	 *	Returns the value of sys001FileStat600
	 *	@return sys001FileStat600
	 */
	public int getSys001FileStat600() throws CFException {
   		return ioErrorType600.getSys001FileStat600();
	}


	/**
	 *	Returns String value of sys001FileStat600
	 *	@return sys001FileStat600
	 */
	public char[]  getSys001FileStat600String() throws CFException {
	     return String.valueOf(ioErrorType600.getSys001FileStat600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys001FileStat600IsNumeric()  throws CFException{
	    return ioErrorType600.sys001FileStat600IsNumeric();
	}

	/**
	 * 	Update Sys001FileStat600 with the passed value
	 *	@param number
	 */
	public void setSys001FileStat600(int number)  throws CFException{
		ioErrorType600.setSys001FileStat600(number);
	}
	

	public void setSys001FileStat600(long number)  throws CFException{
	    ioErrorType600.setSys001FileStat600(number);
	}
	
	
	/**
	 * 	Update Sys001FileStat600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSys001FileStat600(char[] value)  throws CFException {
		ioErrorType600.setSys001FileStat600(value);
	}
	
	/**
	 * 	Update Sys001FileStat600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSys001FileStat600String(char[] value)  throws CFException{
		ioErrorType600.setSys001FileStat600(value);
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
	 *	Test condition "ERROR READING SYS067 FILE.  " for isReadError88601()
	 *	@return  Returns true if isReadError88601() is "ERROR READING SYS067 FILE.  "
	 */
   public boolean isReadError88601() throws CFException {
      return ioErrorSys067601.isReadError88601();
   }

	/**
	*  set values "ERROR READING SYS067 FILE.  "
	*/
   	public void setReadError88601True()  throws CFException{  			
    	ioErrorSys067601.setReadError88601True();
   	}
	/**
	 *	Returns the value of ioErrorSys067601
	 *	@return ioErrorSys067601
	 */   
	 public IoErrorSys067601 getIoErrorSys067601() {
   	return ioErrorSys067601;
   }


	/**
	 *	Returns the value of parmEnvIdentifier800
	 *	@return parmEnvIdentifier800
	 */
   public char[] getParmEnvIdentifier800() throws CFException  {              
   		return envrmentFileData800.getParmEnvIdentifier800();
   }

  
	/**
	*  set variable parmEnvIdentifier800
	*  @param value
	**/
   public void setParmEnvIdentifier800(char[] value) throws CFException {
      envrmentFileData800.setParmEnvIdentifier800(value);
   } 

     /**
	 * 	Update ParmEnvIdentifier800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParmEnvIdentifier800(char[] source, int sourceIndex) throws CFException {
      envrmentFileData800.setParmEnvIdentifier800(source, sourceIndex);
   	
   }
   
   public void setParmEnvIdentifier800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      envrmentFileData800.setParmEnvIdentifier800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ParmEnvIdentifier800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParmEnvIdentifier800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      envrmentFileData800.setParmEnvIdentifier800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ParmEnvIdentifier800 with another Field
	 *	@param value
	 */
   public void setParmEnvIdentifier800(Field source) {
      envrmentFileData800.setParmEnvIdentifier800(source);
   }  
   
     /**
	 * 	Update ParmEnvIdentifier800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParmEnvIdentifier800(Field source, int sourceIndex,int sourceLen) {
      envrmentFileData800.setParmEnvIdentifier800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ParmEnvIdentifier800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParmEnvIdentifier800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      envrmentFileData800.setParmEnvIdentifier800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendPara900
	 *	@return abendPara900
	 */
   public char[] getAbendPara900() throws CFException  {              
   		return abendParaName900.getAbendPara900();
   }

  
	/**
	*  set variable abendPara900
	*  @param value
	**/
   public void setAbendPara900(char[] value) throws CFException {
      abendParaName900.setAbendPara900(value);
   } 

     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex) throws CFException {
      abendParaName900.setAbendPara900(source, sourceIndex);
   	
   }
   
   public void setAbendPara900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendPara900 with another Field
	 *	@param value
	 */
   public void setAbendPara900(Field source) {
      abendParaName900.setAbendPara900(source);
   }  
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys067EnvrmentRecord
	 *	@return sys067EnvrmentRecord
	 */   
	 public Sys067EnvrmentRecord getSys067EnvrmentRecord() {
   	return sys067EnvrmentRecord;
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
	 *	Returns the value of sys067Status200
	 *	@return sys067Status200
	 */
   public char[] getSys067Status200() throws CFException  {              
   		return work.getSys067Status200();
   }

  
	/**
	*  set variable sys067Status200
	*  @param value
	**/
   public void setSys067Status200(char[] value) throws CFException {
      work.setSys067Status200(value);
   } 

	/**
	 *	Test condition "1352-READ-INPUT-SYS067." for isPara135288300()
	 *	@return  Returns true if isPara135288300() is "1352-READ-INPUT-SYS067."
	 */
   public boolean isPara135288300() throws CFException {
      return work.isPara135288300();
   }

	/**
	*  set values "1352-READ-INPUT-SYS067."
	*/
   	public void setPara135288300True()  throws CFException{  			
    	work.setPara135288300True();
   	}
	/**
	 *	Test condition "00" for isSys067IoGood88200()
	 *	@return  Returns true if isSys067IoGood88200() is "00"
	 */
   public boolean isSys067IoGood88200() throws CFException {
      return work.isSys067IoGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys067IoGood88200True()  throws CFException{  			
    	work.setSys067IoGood88200True();
   	}

        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendParaName900.hashCode();
        str += ioErrorSys067601.hashCode();
        str += envrmentFileData800.hashCode();
        str += sys067EnvrmentRecord.hashCode();
        str += ioErrorType600.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
        str += ip70511Table.hashCode();
       return str.hashCode();
    }

    public ReadInputSys067OutCtx clone() {
        ReadInputSys067OutCtx cloneObj = new ReadInputSys067OutCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ioErrorSys067601 = new IoErrorSys067601();
        cloneObj.ioErrorSys067601.set(ioErrorSys067601.getClonedField());
        cloneObj.envrmentFileData800 = new EnvrmentFileData800();
        cloneObj.envrmentFileData800.set(envrmentFileData800.getClonedField());
        cloneObj.sys067EnvrmentRecord = new Sys067EnvrmentRecord();
        cloneObj.sys067EnvrmentRecord.set(sys067EnvrmentRecord.getClonedField());
        cloneObj.ioErrorType600 = new IoErrorType600();
        cloneObj.ioErrorType600.set(ioErrorType600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.ip70511Table = new Ip70511Table();
        cloneObj.ip70511Table.set(ip70511Table.getClonedField());
        return cloneObj;
    }

    }

    public ReadInputSys067OutCtx getReadInputSys067OutCtx() {
            return new ReadInputSys067OutCtx();
    }
     public class CloseInputSys067InCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip343900Ctx.this.getAbendParaName900();
     IoErrorSys067601 ioErrorSys067601 = Ip343900Ctx.this.getIoErrorSys067601();
     IoErrorType600 ioErrorType600 = Ip343900Ctx.this.getIoErrorType600();
     Work work = Ip343900Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip343900Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of ioErrorSys067601
	 *	@return ioErrorSys067601
	 */   
	 public IoErrorSys067601 getIoErrorSys067601() {
   	return ioErrorSys067601;
   }


	/**
	 *	Returns the value of closeAbendCode300
	 *	@return closeAbendCode300
	 */
   public char[] getCloseAbendCode300() throws CFException  {              
   		return work.getCloseAbendCode300();
   }

  
	/**
	*  set variable closeAbendCode300
	*  @param value
	**/
   public void setCloseAbendCode300(char[] value) throws CFException {
      work.setCloseAbendCode300(value);
   } 

	/**
	 *	Returns the value of sys067Status200
	 *	@return sys067Status200
	 */
   public char[] getSys067Status200() throws CFException  {              
   		return work.getSys067Status200();
   }

  
	/**
	*  set variable sys067Status200
	*  @param value
	**/
   public void setSys067Status200(char[] value) throws CFException {
      work.setSys067Status200(value);
   } 

	/**
	 *	Test condition "00" for isSys067IoGood88200()
	 *	@return  Returns true if isSys067IoGood88200() is "00"
	 */
   public boolean isSys067IoGood88200() throws CFException {
      return work.isSys067IoGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys067IoGood88200True()  throws CFException{  			
    	work.setSys067IoGood88200True();
   	}

        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }

        public CloseInputSys067OutCtx getCloseInputSys067OutCtx() {
            return new CloseInputSys067OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendParaName900.hashCode();
        str += ioErrorSys067601.hashCode();
        str += ioErrorType600.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public CloseInputSys067InCtx clone() {
        CloseInputSys067InCtx cloneObj = new CloseInputSys067InCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ioErrorSys067601 = new IoErrorSys067601();
        cloneObj.ioErrorSys067601.set(ioErrorSys067601.getClonedField());
        cloneObj.ioErrorType600 = new IoErrorType600();
        cloneObj.ioErrorType600.set(ioErrorType600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public CloseInputSys067InCtx getCloseInputSys067InCtx() {
            return new CloseInputSys067InCtx();
    }
     public class CloseInputSys067OutCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip343900Ctx.this.getAbendParaName900();
     IoErrorSys067601 ioErrorSys067601 = Ip343900Ctx.this.getIoErrorSys067601();
     IoErrorType600 ioErrorType600 = Ip343900Ctx.this.getIoErrorType600();
     Work work = Ip343900Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip343900Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of ioErrorSys067601
	 *	@return ioErrorSys067601
	 */   
	 public IoErrorSys067601 getIoErrorSys067601() {
   	return ioErrorSys067601;
   }


	/**
	 *	Returns the value of paraName300
	 *	@return paraName300
	 */
   public char[] getParaName300() throws CFException  {              
   		return work.getParaName300();
   }

  
	/**
	*  set variable paraName300
	*  @param value
	**/
   public void setParaName300(char[] value) throws CFException {
      work.setParaName300(value);
   } 

	/**
	 *	Returns the value of sys001FileStat600
	 *	@return sys001FileStat600
	 */
	public int getSys001FileStat600() throws CFException {
   		return ioErrorType600.getSys001FileStat600();
	}


	/**
	 *	Returns String value of sys001FileStat600
	 *	@return sys001FileStat600
	 */
	public char[]  getSys001FileStat600String() throws CFException {
	     return String.valueOf(ioErrorType600.getSys001FileStat600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys001FileStat600IsNumeric()  throws CFException{
	    return ioErrorType600.sys001FileStat600IsNumeric();
	}

	/**
	 * 	Update Sys001FileStat600 with the passed value
	 *	@param number
	 */
	public void setSys001FileStat600(int number)  throws CFException{
		ioErrorType600.setSys001FileStat600(number);
	}
	

	public void setSys001FileStat600(long number)  throws CFException{
	    ioErrorType600.setSys001FileStat600(number);
	}
	
	
	/**
	 * 	Update Sys001FileStat600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSys001FileStat600(char[] value)  throws CFException {
		ioErrorType600.setSys001FileStat600(value);
	}
	
	/**
	 * 	Update Sys001FileStat600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSys001FileStat600String(char[] value)  throws CFException{
		ioErrorType600.setSys001FileStat600(value);
	}	

	/**
	 *	Returns the value of abendPara900
	 *	@return abendPara900
	 */
   public char[] getAbendPara900() throws CFException  {              
   		return abendParaName900.getAbendPara900();
   }

  
	/**
	*  set variable abendPara900
	*  @param value
	**/
   public void setAbendPara900(char[] value) throws CFException {
      abendParaName900.setAbendPara900(value);
   } 

     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex) throws CFException {
      abendParaName900.setAbendPara900(source, sourceIndex);
   	
   }
   
   public void setAbendPara900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendPara900 with another Field
	 *	@param value
	 */
   public void setAbendPara900(Field source) {
      abendParaName900.setAbendPara900(source);
   }  
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "ERROR CLOSING SYS067 FILE.  " for isCloseError88601()
	 *	@return  Returns true if isCloseError88601() is "ERROR CLOSING SYS067 FILE.  "
	 */
   public boolean isCloseError88601() throws CFException {
      return ioErrorSys067601.isCloseError88601();
   }

	/**
	*  set values "ERROR CLOSING SYS067 FILE.  "
	*/
   	public void setCloseError88601True()  throws CFException{  			
    	ioErrorSys067601.setCloseError88601True();
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
	 *	Test condition "1353-CLOSE-INPUT-SYS067." for isPara135388300()
	 *	@return  Returns true if isPara135388300() is "1353-CLOSE-INPUT-SYS067."
	 */
   public boolean isPara135388300() throws CFException {
      return work.isPara135388300();
   }

	/**
	*  set values "1353-CLOSE-INPUT-SYS067."
	*/
   	public void setPara135388300True()  throws CFException{  			
    	work.setPara135388300True();
   	}
	/**
	 *	Returns the value of closeAbendCode300
	 *	@return closeAbendCode300
	 */
   public char[] getCloseAbendCode300() throws CFException  {              
   		return work.getCloseAbendCode300();
   }

  
	/**
	*  set variable closeAbendCode300
	*  @param value
	**/
   public void setCloseAbendCode300(char[] value) throws CFException {
      work.setCloseAbendCode300(value);
   } 

	/**
	 *	Returns the value of sys067Status200
	 *	@return sys067Status200
	 */
   public char[] getSys067Status200() throws CFException  {              
   		return work.getSys067Status200();
   }

  
	/**
	*  set variable sys067Status200
	*  @param value
	**/
   public void setSys067Status200(char[] value) throws CFException {
      work.setSys067Status200(value);
   } 


        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendParaName900.hashCode();
        str += ioErrorSys067601.hashCode();
        str += ioErrorType600.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public CloseInputSys067OutCtx clone() {
        CloseInputSys067OutCtx cloneObj = new CloseInputSys067OutCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ioErrorSys067601 = new IoErrorSys067601();
        cloneObj.ioErrorSys067601.set(ioErrorSys067601.getClonedField());
        cloneObj.ioErrorType600 = new IoErrorType600();
        cloneObj.ioErrorType600.set(ioErrorType600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public CloseInputSys067OutCtx getCloseInputSys067OutCtx() {
            return new CloseInputSys067OutCtx();
    }
     public class GetPaInfoInCtx implements Cloneable {
     Ip02014PrcssAgrmtTable ip02014PrcssAgrmtTable = Ip343900Ctx.this.getIp02014PrcssAgrmtTable();
     Ip28221PaTableRestart ip28221PaTableRestart = Ip343900Ctx.this.getIp28221PaTableRestart();
     Work work = Ip343900Ctx.this.getWork();
     Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable = Ip343900Ctx.this.getIp02015PrcssAgrmtTable();

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
	 *	Returns the value of ip28221PaTableRestart
	 *	@return ip28221PaTableRestart
	 */   
	 public Ip28221PaTableRestart getIp28221PaTableRestart() {
   	return ip28221PaTableRestart;
   }


	/**
	 *	Returns the value of valueGlobal300
	 *	@return valueGlobal300
	 */
   public char[] getValueGlobal300() throws CFException  {              
   		return work.getValueGlobal300();
   }

  
	/**
	*  set variable valueGlobal300
	*  @param value
	**/
   public void setValueGlobal300(char[] value) throws CFException {
      work.setValueGlobal300(value);
   } 


        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }

        public GetPaInfoOutCtx getGetPaInfoOutCtx() {
            return new GetPaInfoOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip02014PrcssAgrmtTable.hashCode();
        str += ip28221PaTableRestart.hashCode();
        str += work.hashCode();
        str += ip02015PrcssAgrmtTable.hashCode();
       return str.hashCode();
    }

    public GetPaInfoInCtx clone() {
        GetPaInfoInCtx cloneObj = new GetPaInfoInCtx();
        cloneObj.ip02014PrcssAgrmtTable = new Ip02014PrcssAgrmtTable();
        cloneObj.ip02014PrcssAgrmtTable.set(ip02014PrcssAgrmtTable.getClonedField());
        cloneObj.ip28221PaTableRestart = new Ip28221PaTableRestart();
        cloneObj.ip28221PaTableRestart.set(ip28221PaTableRestart.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        return cloneObj;
    }

    }

    public GetPaInfoInCtx getGetPaInfoInCtx() {
            return new GetPaInfoInCtx();
    }
     public class GetPaInfoOutCtx implements Cloneable {
     Ip02014PrcssAgrmtTable ip02014PrcssAgrmtTable = Ip343900Ctx.this.getIp02014PrcssAgrmtTable();
     Ip28221PaTableRestart ip28221PaTableRestart = Ip343900Ctx.this.getIp28221PaTableRestart();
     Work work = Ip343900Ctx.this.getWork();
     Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable = Ip343900Ctx.this.getIp02015PrcssAgrmtTable();

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
	 *	Test condition "Y" for isItIsGlobal88100()
	 *	@return  Returns true if isItIsGlobal88100() is "Y"
	 */
   public boolean isItIsGlobal88100() throws CFException {
      return work.isItIsGlobal88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsGlobal88100True()  throws CFException{  			
    	work.setItIsGlobal88100True();
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

	/**
	 *	Returns the value of ip02015PrcssAgrmtTable
	 *	@return ip02015PrcssAgrmtTable
	 */   
	 public Ip02015PrcssAgrmtTable getIp02015PrcssAgrmtTable() {
   	return ip02015PrcssAgrmtTable;
   }


	/**
	 *	Returns the value of ip02014PrcssAgrmtId
	 *	@return ip02014PrcssAgrmtId
	 */
   public char[] getIp02014PrcssAgrmtId() throws CFException  {              
   		return ip02014PrcssAgrmtTable.getIp02014TableDataKey().getIp02014PrcssAgrmtId();
   }

  
	/**
	*  set variable ip02014PrcssAgrmtId
	*  @param value
	**/
   public void setIp02014PrcssAgrmtId(char[] value) throws CFException {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(value);
   } 

     /**
	 * 	Update Ip02014PrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(char[] source, int sourceIndex) throws CFException {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source, sourceIndex);
   	
   }
   
   public void setIp02014PrcssAgrmtId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014PrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014PrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(Field source) {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source);
   }  
   
     /**
	 * 	Update Ip02014PrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(Field source, int sourceIndex,int sourceLen) {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014PrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip02014PrcssAgrmtTable.hashCode();
        str += ip28221PaTableRestart.hashCode();
        str += work.hashCode();
        str += ip02015PrcssAgrmtTable.hashCode();
       return str.hashCode();
    }

    public GetPaInfoOutCtx clone() {
        GetPaInfoOutCtx cloneObj = new GetPaInfoOutCtx();
        cloneObj.ip02014PrcssAgrmtTable = new Ip02014PrcssAgrmtTable();
        cloneObj.ip02014PrcssAgrmtTable.set(ip02014PrcssAgrmtTable.getClonedField());
        cloneObj.ip28221PaTableRestart = new Ip28221PaTableRestart();
        cloneObj.ip28221PaTableRestart.set(ip28221PaTableRestart.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        return cloneObj;
    }

    }

    public GetPaInfoOutCtx getGetPaInfoOutCtx() {
            return new GetPaInfoOutCtx();
    }
     public class EstablishMqConnectionInCtx implements Cloneable {
     Ip57901Tipaqpr ip57901Tipaqpr = Ip343900Ctx.this.getIp57901Tipaqpr();
     Ip34051MqProcessParameters ip34051MqProcessParameters = Ip343900Ctx.this.getIp34051MqProcessParameters();
     Ip02014PrcssAgrmtTable ip02014PrcssAgrmtTable = Ip343900Ctx.this.getIp02014PrcssAgrmtTable();
     Parms parms = Ip343900Ctx.this.getParms();
     Ip28221PaTableRestart ip28221PaTableRestart = Ip343900Ctx.this.getIp28221PaTableRestart();
     Ip996021JobInformation ip996021JobInformation = Ip343900Ctx.this.getIp996021JobInformation();
     Work work = Ip343900Ctx.this.getWork();
     Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable = Ip343900Ctx.this.getIp02015PrcssAgrmtTable();
     Ip70511Table ip70511Table = Ip343900Ctx.this.getIp70511Table();

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

	/**
	 *	Returns the value of ip02014AmsOnsoilSw
	 *	@return ip02014AmsOnsoilSw
	 */
   public char[] getIp02014AmsOnsoilSw() throws CFException  {              
   		return ip02014PrcssAgrmtTable.getIp02014TableDataFields().getIp02014AmsOnsoilSw();
   }

  
	/**
	*  set variable ip02014AmsOnsoilSw
	*  @param value
	**/
   public void setIp02014AmsOnsoilSw(char[] value) throws CFException {
      ip02014PrcssAgrmtTable.getIp02014TableDataFields().setIp02014AmsOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014AmsOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014AmsOnsoilSw(char[] source, int sourceIndex) throws CFException {
      ip02014PrcssAgrmtTable.getIp02014TableDataFields().setIp02014AmsOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014AmsOnsoilSw(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014PrcssAgrmtTable.getIp02014TableDataFields().setIp02014AmsOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014AmsOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014AmsOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014PrcssAgrmtTable.getIp02014TableDataFields().setIp02014AmsOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014AmsOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014AmsOnsoilSw(Field source) {
      ip02014PrcssAgrmtTable.getIp02014TableDataFields().setIp02014AmsOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014AmsOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014AmsOnsoilSw(Field source, int sourceIndex,int sourceLen) {
      ip02014PrcssAgrmtTable.getIp02014TableDataFields().setIp02014AmsOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014AmsOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014AmsOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014PrcssAgrmtTable.getIp02014TableDataFields().setIp02014AmsOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of parmJobgrpNum800
	 *	@return parmJobgrpNum800
	 */
	public int getParmJobgrpNum800() throws CFException {
   		return parms.getParmJobgrpNum800();
	}


	/**
	 *	Returns String value of parmJobgrpNum800
	 *	@return parmJobgrpNum800
	 */
	public char[]  getParmJobgrpNum800String() throws CFException {
	     return String.valueOf(parms.getParmJobgrpNum800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean parmJobgrpNum800IsNumeric()  throws CFException{
	    return parms.parmJobgrpNum800IsNumeric();
	}

	/**
	 * 	Update ParmJobgrpNum800 with the passed value
	 *	@param number
	 */
	public void setParmJobgrpNum800(int number)  throws CFException{
		parms.setParmJobgrpNum800(number);
	}
	

	public void setParmJobgrpNum800(long number)  throws CFException{
	    parms.setParmJobgrpNum800(number);
	}
	
	
	/**
	 * 	Update ParmJobgrpNum800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setParmJobgrpNum800(char[] value)  throws CFException {
		parms.setParmJobgrpNum800(value);
	}
	
	/**
	 * 	Update ParmJobgrpNum800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setParmJobgrpNum800String(char[] value)  throws CFException{
		parms.setParmJobgrpNum800(value);
	}	

	/**
	 *	Returns the value of ip28221PaTableRestart
	 *	@return ip28221PaTableRestart
	 */   
	 public Ip28221PaTableRestart getIp28221PaTableRestart() {
   	return ip28221PaTableRestart;
   }


	/**
	 *	Returns the value of parmJobgroup800
	 *	@return parmJobgroup800
	 */
   public char[] getParmJobgroup800() throws CFException  {              
   		return parms.getParmJobgroup800();
   }

  
	/**
	*  set variable parmJobgroup800
	*  @param value
	**/
   public void setParmJobgroup800(char[] value) throws CFException {
      parms.setParmJobgroup800(value);
   } 

     /**
	 * 	Update ParmJobgroup800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParmJobgroup800(char[] source, int sourceIndex) throws CFException {
      parms.setParmJobgroup800(source, sourceIndex);
   	
   }
   
   public void setParmJobgroup800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      parms.setParmJobgroup800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ParmJobgroup800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParmJobgroup800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parms.setParmJobgroup800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ParmJobgroup800 with another Field
	 *	@param value
	 */
   public void setParmJobgroup800(Field source) {
      parms.setParmJobgroup800(source);
   }  
   
     /**
	 * 	Update ParmJobgroup800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParmJobgroup800(Field source, int sourceIndex,int sourceLen) {
      parms.setParmJobgroup800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ParmJobgroup800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParmJobgroup800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parms.setParmJobgroup800(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of valueLpidn300
	 *	@return valueLpidn300
	 */
   public char[] getValueLpidn300() throws CFException  {              
   		return work.getValueLpidn300();
   }

  
	/**
	*  set variable valueLpidn300
	*  @param value
	**/
   public void setValueLpidn300(char[] value) throws CFException {
      work.setValueLpidn300(value);
   } 

	/**
	 *	Returns the value of cloneOwnerId800
	 *	@return cloneOwnerId800
	 */
   public char[] getCloneOwnerId800() throws CFException  {              
   		return parms.getCloneOwnerId800();
   }

  
	/**
	*  set variable cloneOwnerId800
	*  @param value
	**/
   public void setCloneOwnerId800(char[] value) throws CFException {
      parms.setCloneOwnerId800(value);
   } 

     /**
	 * 	Update CloneOwnerId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCloneOwnerId800(char[] source, int sourceIndex) throws CFException {
      parms.setCloneOwnerId800(source, sourceIndex);
   	
   }
   
   public void setCloneOwnerId800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      parms.setCloneOwnerId800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CloneOwnerId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCloneOwnerId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parms.setCloneOwnerId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CloneOwnerId800 with another Field
	 *	@param value
	 */
   public void setCloneOwnerId800(Field source) {
      parms.setCloneOwnerId800(source);
   }  
   
     /**
	 * 	Update CloneOwnerId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCloneOwnerId800(Field source, int sourceIndex,int sourceLen) {
      parms.setCloneOwnerId800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CloneOwnerId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCloneOwnerId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parms.setCloneOwnerId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
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


        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }

        public EstablishMqConnectionOutCtx getEstablishMqConnectionOutCtx() {
            return new EstablishMqConnectionOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip57901Tipaqpr.hashCode();
        str += ip34051MqProcessParameters.hashCode();
        str += ip02014PrcssAgrmtTable.hashCode();
        str += parms.hashCode();
        str += ip28221PaTableRestart.hashCode();
        str += ip996021JobInformation.hashCode();
        str += work.hashCode();
        str += ip02015PrcssAgrmtTable.hashCode();
        str += ip70511Table.hashCode();
       return str.hashCode();
    }

    public EstablishMqConnectionInCtx clone() {
        EstablishMqConnectionInCtx cloneObj = new EstablishMqConnectionInCtx();
        cloneObj.ip57901Tipaqpr = new Ip57901Tipaqpr();
        cloneObj.ip57901Tipaqpr.set(ip57901Tipaqpr.getClonedField());
        cloneObj.ip34051MqProcessParameters = new Ip34051MqProcessParameters();
        cloneObj.ip34051MqProcessParameters.set(ip34051MqProcessParameters.getClonedField());
        cloneObj.ip02014PrcssAgrmtTable = new Ip02014PrcssAgrmtTable();
        cloneObj.ip02014PrcssAgrmtTable.set(ip02014PrcssAgrmtTable.getClonedField());
        cloneObj.parms = new Parms();
        cloneObj.parms.set(parms.getClonedField());
        cloneObj.ip28221PaTableRestart = new Ip28221PaTableRestart();
        cloneObj.ip28221PaTableRestart.set(ip28221PaTableRestart.getClonedField());
        cloneObj.ip996021JobInformation = new Ip996021JobInformation();
        cloneObj.ip996021JobInformation.set(ip996021JobInformation.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        cloneObj.ip70511Table = new Ip70511Table();
        cloneObj.ip70511Table.set(ip70511Table.getClonedField());
        return cloneObj;
    }

    }

    public EstablishMqConnectionInCtx getEstablishMqConnectionInCtx() {
            return new EstablishMqConnectionInCtx();
    }
     public class EstablishMqConnectionOutCtx implements Cloneable {
     Ip34051MqProcessParameters ip34051MqProcessParameters = Ip343900Ctx.this.getIp34051MqProcessParameters();
     Ip57901Tipaqpr ip57901Tipaqpr = Ip343900Ctx.this.getIp57901Tipaqpr();
     Ip02014PrcssAgrmtTable ip02014PrcssAgrmtTable = Ip343900Ctx.this.getIp02014PrcssAgrmtTable();
     Parms parms = Ip343900Ctx.this.getParms();
     Ip28221PaTableRestart ip28221PaTableRestart = Ip343900Ctx.this.getIp28221PaTableRestart();
     Ip996021JobInformation ip996021JobInformation = Ip343900Ctx.this.getIp996021JobInformation();
     Work work = Ip343900Ctx.this.getWork();
     Ip02015PrcssAgrmtTable ip02015PrcssAgrmtTable = Ip343900Ctx.this.getIp02015PrcssAgrmtTable();
     Ip70511Table ip70511Table = Ip343900Ctx.this.getIp70511Table();

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
	 *	Test condition "0000" for isIp34051FuncCdGeneral88()
	 *	@return  Returns true if isIp34051FuncCdGeneral88() is "0000"
	 */
   public boolean isIp34051FuncCdGeneral88() throws CFException {
      return ip34051MqProcessParameters.isIp34051FuncCdGeneral88();
   }

	/**
	*  set values "0000"
	*/
   	public void setIp34051FuncCdGeneral88True()  throws CFException{  			
    	ip34051MqProcessParameters.setIp34051FuncCdGeneral88True();
   	}
	/**
	 *	Returns the value of parmJobgroup800
	 *	@return parmJobgroup800
	 */
   public char[] getParmJobgroup800() throws CFException  {              
   		return parms.getParmJobgroup800();
   }

  
	/**
	*  set variable parmJobgroup800
	*  @param value
	**/
   public void setParmJobgroup800(char[] value) throws CFException {
      parms.setParmJobgroup800(value);
   } 

     /**
	 * 	Update ParmJobgroup800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParmJobgroup800(char[] source, int sourceIndex) throws CFException {
      parms.setParmJobgroup800(source, sourceIndex);
   	
   }
   
   public void setParmJobgroup800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      parms.setParmJobgroup800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ParmJobgroup800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParmJobgroup800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parms.setParmJobgroup800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ParmJobgroup800 with another Field
	 *	@param value
	 */
   public void setParmJobgroup800(Field source) {
      parms.setParmJobgroup800(source);
   }  
   
     /**
	 * 	Update ParmJobgroup800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParmJobgroup800(Field source, int sourceIndex,int sourceLen) {
      parms.setParmJobgroup800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ParmJobgroup800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParmJobgroup800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parms.setParmJobgroup800(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of ip02014AmsOnsoilSw
	 *	@return ip02014AmsOnsoilSw
	 */
   public char[] getIp02014AmsOnsoilSw() throws CFException  {              
   		return ip02014PrcssAgrmtTable.getIp02014TableDataFields().getIp02014AmsOnsoilSw();
   }

  
	/**
	*  set variable ip02014AmsOnsoilSw
	*  @param value
	**/
   public void setIp02014AmsOnsoilSw(char[] value) throws CFException {
      ip02014PrcssAgrmtTable.getIp02014TableDataFields().setIp02014AmsOnsoilSw(value);
   } 

     /**
	 * 	Update Ip02014AmsOnsoilSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014AmsOnsoilSw(char[] source, int sourceIndex) throws CFException {
      ip02014PrcssAgrmtTable.getIp02014TableDataFields().setIp02014AmsOnsoilSw(source, sourceIndex);
   	
   }
   
   public void setIp02014AmsOnsoilSw(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014PrcssAgrmtTable.getIp02014TableDataFields().setIp02014AmsOnsoilSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014AmsOnsoilSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014AmsOnsoilSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014PrcssAgrmtTable.getIp02014TableDataFields().setIp02014AmsOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014AmsOnsoilSw with another Field
	 *	@param value
	 */
   public void setIp02014AmsOnsoilSw(Field source) {
      ip02014PrcssAgrmtTable.getIp02014TableDataFields().setIp02014AmsOnsoilSw(source);
   }  
   
     /**
	 * 	Update Ip02014AmsOnsoilSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014AmsOnsoilSw(Field source, int sourceIndex,int sourceLen) {
      ip02014PrcssAgrmtTable.getIp02014TableDataFields().setIp02014AmsOnsoilSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014AmsOnsoilSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014AmsOnsoilSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014PrcssAgrmtTable.getIp02014TableDataFields().setIp02014AmsOnsoilSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of parmJobgrpNum800
	 *	@return parmJobgrpNum800
	 */
	public int getParmJobgrpNum800() throws CFException {
   		return parms.getParmJobgrpNum800();
	}


	/**
	 *	Returns String value of parmJobgrpNum800
	 *	@return parmJobgrpNum800
	 */
	public char[]  getParmJobgrpNum800String() throws CFException {
	     return String.valueOf(parms.getParmJobgrpNum800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean parmJobgrpNum800IsNumeric()  throws CFException{
	    return parms.parmJobgrpNum800IsNumeric();
	}

	/**
	 * 	Update ParmJobgrpNum800 with the passed value
	 *	@param number
	 */
	public void setParmJobgrpNum800(int number)  throws CFException{
		parms.setParmJobgrpNum800(number);
	}
	

	public void setParmJobgrpNum800(long number)  throws CFException{
	    parms.setParmJobgrpNum800(number);
	}
	
	
	/**
	 * 	Update ParmJobgrpNum800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setParmJobgrpNum800(char[] value)  throws CFException {
		parms.setParmJobgrpNum800(value);
	}
	
	/**
	 * 	Update ParmJobgrpNum800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setParmJobgrpNum800String(char[] value)  throws CFException{
		parms.setParmJobgrpNum800(value);
	}	

	/**
	 *	Returns the value of ip28221PaTableRestart
	 *	@return ip28221PaTableRestart
	 */   
	 public Ip28221PaTableRestart getIp28221PaTableRestart() {
   	return ip28221PaTableRestart;
   }


	/**
	 *	Returns the value of valueLpidn300
	 *	@return valueLpidn300
	 */
   public char[] getValueLpidn300() throws CFException  {              
   		return work.getValueLpidn300();
   }

  
	/**
	*  set variable valueLpidn300
	*  @param value
	**/
   public void setValueLpidn300(char[] value) throws CFException {
      work.setValueLpidn300(value);
   } 

	/**
	 *	Returns the value of cloneOwnerId800
	 *	@return cloneOwnerId800
	 */
   public char[] getCloneOwnerId800() throws CFException  {              
   		return parms.getCloneOwnerId800();
   }

  
	/**
	*  set variable cloneOwnerId800
	*  @param value
	**/
   public void setCloneOwnerId800(char[] value) throws CFException {
      parms.setCloneOwnerId800(value);
   } 

     /**
	 * 	Update CloneOwnerId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCloneOwnerId800(char[] source, int sourceIndex) throws CFException {
      parms.setCloneOwnerId800(source, sourceIndex);
   	
   }
   
   public void setCloneOwnerId800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      parms.setCloneOwnerId800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CloneOwnerId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCloneOwnerId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parms.setCloneOwnerId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CloneOwnerId800 with another Field
	 *	@param value
	 */
   public void setCloneOwnerId800(Field source) {
      parms.setCloneOwnerId800(source);
   }  
   
     /**
	 * 	Update CloneOwnerId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCloneOwnerId800(Field source, int sourceIndex,int sourceLen) {
      parms.setCloneOwnerId800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CloneOwnerId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCloneOwnerId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parms.setCloneOwnerId800(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of ip02014PrcssAgrmtId
	 *	@return ip02014PrcssAgrmtId
	 */
   public char[] getIp02014PrcssAgrmtId() throws CFException  {              
   		return ip02014PrcssAgrmtTable.getIp02014TableDataKey().getIp02014PrcssAgrmtId();
   }

  
	/**
	*  set variable ip02014PrcssAgrmtId
	*  @param value
	**/
   public void setIp02014PrcssAgrmtId(char[] value) throws CFException {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(value);
   } 

     /**
	 * 	Update Ip02014PrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(char[] source, int sourceIndex) throws CFException {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source, sourceIndex);
   	
   }
   
   public void setIp02014PrcssAgrmtId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip02014PrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip02014PrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(Field source) {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source);
   }  
   
     /**
	 * 	Update Ip02014PrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(Field source, int sourceIndex,int sourceLen) {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip02014PrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014PrcssAgrmtId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip02014PrcssAgrmtTable.getIp02014TableDataKey().setIp02014PrcssAgrmtId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of amsOnsoilSw800
	 *	@return amsOnsoilSw800
	 */
   public char[] getAmsOnsoilSw800() throws CFException  {              
   		return work.getAmsOnsoilSw800();
   }

  
	/**
	*  set variable amsOnsoilSw800
	*  @param value
	**/
   public void setAmsOnsoilSw800(char[] value) throws CFException {
      work.setAmsOnsoilSw800(value);
   } 

	/**
	 *	Test condition "0003" for isIp34051ServCdPimmap88()
	 *	@return  Returns true if isIp34051ServCdPimmap88() is "0003"
	 */
   public boolean isIp34051ServCdPimmap88() throws CFException {
      return ip34051MqProcessParameters.isIp34051ServCdPimmap88();
   }

	/**
	*  set values "0003"
	*/
   	public void setIp34051ServCdPimmap88True()  throws CFException{  			
    	ip34051MqProcessParameters.setIp34051ServCdPimmap88True();
   	}

        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip34051MqProcessParameters.hashCode();
        str += ip57901Tipaqpr.hashCode();
        str += ip02014PrcssAgrmtTable.hashCode();
        str += parms.hashCode();
        str += ip28221PaTableRestart.hashCode();
        str += ip996021JobInformation.hashCode();
        str += work.hashCode();
        str += ip02015PrcssAgrmtTable.hashCode();
        str += ip70511Table.hashCode();
       return str.hashCode();
    }

    public EstablishMqConnectionOutCtx clone() {
        EstablishMqConnectionOutCtx cloneObj = new EstablishMqConnectionOutCtx();
        cloneObj.ip34051MqProcessParameters = new Ip34051MqProcessParameters();
        cloneObj.ip34051MqProcessParameters.set(ip34051MqProcessParameters.getClonedField());
        cloneObj.ip57901Tipaqpr = new Ip57901Tipaqpr();
        cloneObj.ip57901Tipaqpr.set(ip57901Tipaqpr.getClonedField());
        cloneObj.ip02014PrcssAgrmtTable = new Ip02014PrcssAgrmtTable();
        cloneObj.ip02014PrcssAgrmtTable.set(ip02014PrcssAgrmtTable.getClonedField());
        cloneObj.parms = new Parms();
        cloneObj.parms.set(parms.getClonedField());
        cloneObj.ip28221PaTableRestart = new Ip28221PaTableRestart();
        cloneObj.ip28221PaTableRestart.set(ip28221PaTableRestart.getClonedField());
        cloneObj.ip996021JobInformation = new Ip996021JobInformation();
        cloneObj.ip996021JobInformation.set(ip996021JobInformation.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip02015PrcssAgrmtTable = new Ip02015PrcssAgrmtTable();
        cloneObj.ip02015PrcssAgrmtTable.set(ip02015PrcssAgrmtTable.getClonedField());
        cloneObj.ip70511Table = new Ip70511Table();
        cloneObj.ip70511Table.set(ip70511Table.getClonedField());
        return cloneObj;
    }

    }

    public EstablishMqConnectionOutCtx getEstablishMqConnectionOutCtx() {
            return new EstablishMqConnectionOutCtx();
    }
     public class DoProcessInCtx implements Cloneable {
     Work work = Ip343900Ctx.this.getWork();
     Ip75081MqSwitches ip75081MqSwitches = Ip343900Ctx.this.getIp75081MqSwitches();

	/**
	 *	Test condition 10 for isSys001Eof88200()
	 *	@return  Returns true if isSys001Eof88200() is 10
	 */
   public boolean isSys001Eof88200() throws CFException {
      return work.isSys001Eof88200();
   }

	/**
	*  set values 10
	*/
   	public void setSys001Eof88200True()  throws CFException{  			
    	work.setSys001Eof88200True();
   	}
	/**
	 *	Returns the value of ptrIp750080800
	 *	@return ptrIp750080800
	 */
   public char[] getPtrIp750080800() throws CFException  {              
   		return work.getPtrIp750080800();
   }

  
	/**
	*  set variable ptrIp750080800
	*  @param value
	**/
   public void setPtrIp750080800(char[] value) throws CFException {
      work.setPtrIp750080800(value);
   } 


        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }

        public DoProcessOutCtx getDoProcessOutCtx() {
            return new DoProcessOutCtx();
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
        str += ip75081MqSwitches.hashCode();
       return str.hashCode();
    }

    public DoProcessInCtx clone() {
        DoProcessInCtx cloneObj = new DoProcessInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip75081MqSwitches = new Ip75081MqSwitches();
        cloneObj.ip75081MqSwitches.set(ip75081MqSwitches.getClonedField());
        return cloneObj;
    }

    }

    public DoProcessInCtx getDoProcessInCtx() {
            return new DoProcessInCtx();
    }
     public class DoProcessOutCtx implements Cloneable {
     Ip75081MqSwitches ip75081MqSwitches = Ip343900Ctx.this.getIp75081MqSwitches();
     Work work = Ip343900Ctx.this.getWork();

	/**
	 *	Test condition "S" for isIp75081MqSend88()
	 *	@return  Returns true if isIp75081MqSend88() is "S"
	 */
   public boolean isIp75081MqSend88() throws CFException {
      return ip75081MqSwitches.isIp75081MqSend88();
   }

	/**
	*  set values "S"
	*/
   	public void setIp75081MqSend88True()  throws CFException{  			
    	ip75081MqSwitches.setIp75081MqSend88True();
   	}

        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip75081MqSwitches.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DoProcessOutCtx clone() {
        DoProcessOutCtx cloneObj = new DoProcessOutCtx();
        cloneObj.ip75081MqSwitches = new Ip75081MqSwitches();
        cloneObj.ip75081MqSwitches.set(ip75081MqSwitches.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DoProcessOutCtx getDoProcessOutCtx() {
            return new DoProcessOutCtx();
    }
     public class InsertTipapimTblInCtx implements Cloneable {
     Parms parms = Ip343900Ctx.this.getParms();
     ApiLayout apiLayout = Ip343900Ctx.this.getApiLayout();
     Work work = Ip343900Ctx.this.getWork();

	/**
	 *	Returns the value of value4300
	 *	@return value4300
	 */
	public int getValue4300() throws CFException {
   		return work.getValue4300();
	}


	/**
	 *	Returns String value of value4300
	 *	@return value4300
	 */
	public char[]  getValue4300String() throws CFException {
	     return String.valueOf(work.getValue4300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value4300IsNumeric()  throws CFException{
	    return work.value4300IsNumeric();
	}

	/**
	 * 	Update Value4300 with the passed value
	 *	@param number
	 */
	public void setValue4300(int number)  throws CFException{
		work.setValue4300(number);
	}
	

	public void setValue4300(long number)  throws CFException{
	    work.setValue4300(number);
	}
	
	
	/**
	 * 	Update Value4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue4300(char[] value)  throws CFException {
		work.setValue4300(value);
	}
	
	/**
	 * 	Update Value4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue4300String(char[] value)  throws CFException{
		work.setValue4300(value);
	}	

	/**
	 *	Returns the value of value1300
	 *	@return value1300
	 */
	public int getValue1300() throws CFException {
   		return work.getValue1300();
	}


	/**
	 *	Returns String value of value1300
	 *	@return value1300
	 */
	public char[]  getValue1300String() throws CFException {
	     return String.valueOf(work.getValue1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value1300IsNumeric()  throws CFException{
	    return work.value1300IsNumeric();
	}

	/**
	 * 	Update Value1300 with the passed value
	 *	@param number
	 */
	public void setValue1300(int number)  throws CFException{
		work.setValue1300(number);
	}
	

	public void setValue1300(long number)  throws CFException{
	    work.setValue1300(number);
	}
	
	
	/**
	 * 	Update Value1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue1300(char[] value)  throws CFException {
		work.setValue1300(value);
	}
	
	/**
	 * 	Update Value1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue1300String(char[] value)  throws CFException{
		work.setValue1300(value);
	}	

	/**
	 *	Returns the value of commitCnt800
	 *	@return commitCnt800
	 */
	public int getCommitCnt800() throws CFException {
   		return parms.getCommitCnt800();
	}


	/**
	 *	Returns String value of commitCnt800
	 *	@return commitCnt800
	 */
	public char[]  getCommitCnt800String() throws CFException {
	     return String.valueOf(parms.getCommitCnt800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean commitCnt800IsNumeric()  throws CFException{
	    return parms.commitCnt800IsNumeric();
	}

	/**
	 * 	Update CommitCnt800 with the passed value
	 *	@param number
	 */
	public void setCommitCnt800(int number)  throws CFException{
		parms.setCommitCnt800(number);
	}
	

	public void setCommitCnt800(long number)  throws CFException{
	    parms.setCommitCnt800(number);
	}
	
	
	/**
	 * 	Update CommitCnt800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCommitCnt800(char[] value)  throws CFException {
		parms.setCommitCnt800(value);
	}
	
	/**
	 * 	Update CommitCnt800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCommitCnt800String(char[] value)  throws CFException{
		parms.setCommitCnt800(value);
	}	

	/**
	 *	Returns the value of insRecCnt400
	 *	@return insRecCnt400
	 */
	public long getInsRecCnt400() throws CFException {
   		return work.getInsRecCnt400();
	}


	/**
	 *	Returns String value of insRecCnt400
	 *	@return insRecCnt400
	 */
	public char[]  getInsRecCnt400String() throws CFException {
	     return String.valueOf(work.getInsRecCnt400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean insRecCnt400IsNumeric()  throws CFException{
	    return work.insRecCnt400IsNumeric();
	}

	/**
	 * 	Update InsRecCnt400 with the passed value
	 *	@param number
	 */
	public void setInsRecCnt400(long number)  throws CFException{
		work.setInsRecCnt400(number);
	}
	

	
	/**
	 * 	Update InsRecCnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setInsRecCnt400(char[] value)  throws CFException {
		work.setInsRecCnt400(value);
	}
	
	/**
	 * 	Update InsRecCnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInsRecCnt400String(char[] value)  throws CFException{
		work.setInsRecCnt400(value);
	}	

	/**
	 *	Returns the value of ptrIp532010800
	 *	@return ptrIp532010800
	 */
   public char[] getPtrIp532010800() throws CFException  {              
   		return work.getPtrIp532010800();
   }

  
	/**
	*  set variable ptrIp532010800
	*  @param value
	**/
   public void setPtrIp532010800(char[] value) throws CFException {
      work.setPtrIp532010800(value);
   } 

	/**
	 *	Returns the value of insCmtCnt400
	 *	@return insCmtCnt400
	 */
	public int getInsCmtCnt400() throws CFException {
   		return work.getInsCmtCnt400();
	}


	/**
	 *	Returns String value of insCmtCnt400
	 *	@return insCmtCnt400
	 */
	public char[]  getInsCmtCnt400String() throws CFException {
	     return String.valueOf(work.getInsCmtCnt400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean insCmtCnt400IsNumeric()  throws CFException{
	    return work.insCmtCnt400IsNumeric();
	}

	/**
	 * 	Update InsCmtCnt400 with the passed value
	 *	@param number
	 */
	public void setInsCmtCnt400(int number)  throws CFException{
		work.setInsCmtCnt400(number);
	}
	

	public void setInsCmtCnt400(long number)  throws CFException{
	    work.setInsCmtCnt400(number);
	}
	
	
	/**
	 * 	Update InsCmtCnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setInsCmtCnt400(char[] value)  throws CFException {
		work.setInsCmtCnt400(value);
	}
	
	/**
	 * 	Update InsCmtCnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInsCmtCnt400String(char[] value)  throws CFException{
		work.setInsCmtCnt400(value);
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
	 *	Test condition 0 for isSys001Good88200()
	 *	@return  Returns true if isSys001Good88200() is 0
	 */
   public boolean isSys001Good88200() throws CFException {
      return work.isSys001Good88200();
   }

	/**
	*  set values 0
	*/
   	public void setSys001Good88200True()  throws CFException{  			
    	work.setSys001Good88200True();
   	}

        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }

        public InsertTipapimTblOutCtx getInsertTipapimTblOutCtx() {
            return new InsertTipapimTblOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += parms.hashCode();
        str += apiLayout.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public InsertTipapimTblInCtx clone() {
        InsertTipapimTblInCtx cloneObj = new InsertTipapimTblInCtx();
        cloneObj.parms = new Parms();
        cloneObj.parms.set(parms.getClonedField());
        cloneObj.apiLayout = new ApiLayout();
        cloneObj.apiLayout.set(apiLayout.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InsertTipapimTblInCtx getInsertTipapimTblInCtx() {
            return new InsertTipapimTblInCtx();
    }
     public class InsertTipapimTblOutCtx implements Cloneable {
     Parms parms = Ip343900Ctx.this.getParms();
     ApiLayout apiLayout = Ip343900Ctx.this.getApiLayout();
     Work work = Ip343900Ctx.this.getWork();

	/**
	 *	Returns the value of value4300
	 *	@return value4300
	 */
	public int getValue4300() throws CFException {
   		return work.getValue4300();
	}


	/**
	 *	Returns String value of value4300
	 *	@return value4300
	 */
	public char[]  getValue4300String() throws CFException {
	     return String.valueOf(work.getValue4300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value4300IsNumeric()  throws CFException{
	    return work.value4300IsNumeric();
	}

	/**
	 * 	Update Value4300 with the passed value
	 *	@param number
	 */
	public void setValue4300(int number)  throws CFException{
		work.setValue4300(number);
	}
	

	public void setValue4300(long number)  throws CFException{
	    work.setValue4300(number);
	}
	
	
	/**
	 * 	Update Value4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue4300(char[] value)  throws CFException {
		work.setValue4300(value);
	}
	
	/**
	 * 	Update Value4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue4300String(char[] value)  throws CFException{
		work.setValue4300(value);
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
	 *	Returns the value of insRecCnt400
	 *	@return insRecCnt400
	 */
	public long getInsRecCnt400() throws CFException {
   		return work.getInsRecCnt400();
	}


	/**
	 *	Returns String value of insRecCnt400
	 *	@return insRecCnt400
	 */
	public char[]  getInsRecCnt400String() throws CFException {
	     return String.valueOf(work.getInsRecCnt400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean insRecCnt400IsNumeric()  throws CFException{
	    return work.insRecCnt400IsNumeric();
	}

	/**
	 * 	Update InsRecCnt400 with the passed value
	 *	@param number
	 */
	public void setInsRecCnt400(long number)  throws CFException{
		work.setInsRecCnt400(number);
	}
	

	
	/**
	 * 	Update InsRecCnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setInsRecCnt400(char[] value)  throws CFException {
		work.setInsRecCnt400(value);
	}
	
	/**
	 * 	Update InsRecCnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInsRecCnt400String(char[] value)  throws CFException{
		work.setInsRecCnt400(value);
	}	

	/**
	 *	Test condition "C" for isCommitRtn88100()
	 *	@return  Returns true if isCommitRtn88100() is "C"
	 */
   public boolean isCommitRtn88100() throws CFException {
      return apiLayout.isCommitRtn88100();
   }

	/**
	*  set values "C"
	*/
   	public void setCommitRtn88100True()  throws CFException{  			
    	apiLayout.setCommitRtn88100True();
   	}
	/**
	 *	Returns the value of insCmtCnt400
	 *	@return insCmtCnt400
	 */
	public int getInsCmtCnt400() throws CFException {
   		return work.getInsCmtCnt400();
	}


	/**
	 *	Returns String value of insCmtCnt400
	 *	@return insCmtCnt400
	 */
	public char[]  getInsCmtCnt400String() throws CFException {
	     return String.valueOf(work.getInsCmtCnt400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean insCmtCnt400IsNumeric()  throws CFException{
	    return work.insCmtCnt400IsNumeric();
	}

	/**
	 * 	Update InsCmtCnt400 with the passed value
	 *	@param number
	 */
	public void setInsCmtCnt400(int number)  throws CFException{
		work.setInsCmtCnt400(number);
	}
	

	public void setInsCmtCnt400(long number)  throws CFException{
	    work.setInsCmtCnt400(number);
	}
	
	
	/**
	 * 	Update InsCmtCnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setInsCmtCnt400(char[] value)  throws CFException {
		work.setInsCmtCnt400(value);
	}
	
	/**
	 * 	Update InsCmtCnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInsCmtCnt400String(char[] value)  throws CFException{
		work.setInsCmtCnt400(value);
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




        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += parms.hashCode();
        str += apiLayout.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public InsertTipapimTblOutCtx clone() {
        InsertTipapimTblOutCtx cloneObj = new InsertTipapimTblOutCtx();
        cloneObj.parms = new Parms();
        cloneObj.parms.set(parms.getClonedField());
        cloneObj.apiLayout = new ApiLayout();
        cloneObj.apiLayout.set(apiLayout.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InsertTipapimTblOutCtx getInsertTipapimTblOutCtx() {
            return new InsertTipapimTblOutCtx();
    }
     public class OnsoilProcessInCtx implements Cloneable {
     Ip34631Tipapim ip34631Tipapim = Ip343900Ctx.this.getIp34631Tipapim();
     Work work = Ip343900Ctx.this.getWork();
     Ip75081MqSwitches ip75081MqSwitches = Ip343900Ctx.this.getIp75081MqSwitches();

	/**
	 *	Returns the value of ip34631VirtualAccountNbr
	 *	@return ip34631VirtualAccountNbr
	 */
   public char[] getIp34631VirtualAccountNbr() throws CFException  {              
   		return ip34631Tipapim.getIp34631VirtualAccountNbr();
   }

  
	/**
	*  set variable ip34631VirtualAccountNbr
	*  @param value
	**/
   public void setIp34631VirtualAccountNbr(char[] value) throws CFException {
      ip34631Tipapim.setIp34631VirtualAccountNbr(value);
   } 

     /**
	 * 	Update Ip34631VirtualAccountNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp34631VirtualAccountNbr(char[] source, int sourceIndex) throws CFException {
      ip34631Tipapim.setIp34631VirtualAccountNbr(source, sourceIndex);
   	
   }
   
   public void setIp34631VirtualAccountNbr(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip34631Tipapim.setIp34631VirtualAccountNbr(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip34631VirtualAccountNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp34631VirtualAccountNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip34631Tipapim.setIp34631VirtualAccountNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip34631VirtualAccountNbr with another Field
	 *	@param value
	 */
   public void setIp34631VirtualAccountNbr(Field source) {
      ip34631Tipapim.setIp34631VirtualAccountNbr(source);
   }  
   
     /**
	 * 	Update Ip34631VirtualAccountNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp34631VirtualAccountNbr(Field source, int sourceIndex,int sourceLen) {
      ip34631Tipapim.setIp34631VirtualAccountNbr(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip34631VirtualAccountNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp34631VirtualAccountNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip34631Tipapim.setIp34631VirtualAccountNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "N" for isAmsOnsoilSwN88800()
	 *	@return  Returns true if isAmsOnsoilSwN88800() is "N"
	 */
   public boolean isAmsOnsoilSwN88800() throws CFException {
      return work.isAmsOnsoilSwN88800();
   }

	/**
	*  set values "N"
	*/
   	public void setAmsOnsoilSwN88800True()  throws CFException{  			
    	work.setAmsOnsoilSwN88800True();
   	}
	/**
	 *	Returns the value of ptrIp750080800
	 *	@return ptrIp750080800
	 */
   public char[] getPtrIp750080800() throws CFException  {              
   		return work.getPtrIp750080800();
   }

  
	/**
	*  set variable ptrIp750080800
	*  @param value
	**/
   public void setPtrIp750080800(char[] value) throws CFException {
      work.setPtrIp750080800(value);
   } 


        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }

        public OnsoilProcessOutCtx getOnsoilProcessOutCtx() {
            return new OnsoilProcessOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip34631Tipapim.hashCode();
        str += work.hashCode();
        str += ip75081MqSwitches.hashCode();
       return str.hashCode();
    }

    public OnsoilProcessInCtx clone() {
        OnsoilProcessInCtx cloneObj = new OnsoilProcessInCtx();
        cloneObj.ip34631Tipapim = new Ip34631Tipapim();
        cloneObj.ip34631Tipapim.set(ip34631Tipapim.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip75081MqSwitches = new Ip75081MqSwitches();
        cloneObj.ip75081MqSwitches.set(ip75081MqSwitches.getClonedField());
        return cloneObj;
    }

    }

    public OnsoilProcessInCtx getOnsoilProcessInCtx() {
            return new OnsoilProcessInCtx();
    }
     public class OnsoilProcessOutCtx implements Cloneable {
     Ip34631Tipapim ip34631Tipapim = Ip343900Ctx.this.getIp34631Tipapim();
     Ip75081MqSwitches ip75081MqSwitches = Ip343900Ctx.this.getIp75081MqSwitches();
     Work work = Ip343900Ctx.this.getWork();

	/**
	 *	Test condition "P" for isIp75081MqPut88()
	 *	@return  Returns true if isIp75081MqPut88() is "P"
	 */
   public boolean isIp75081MqPut88() throws CFException {
      return ip75081MqSwitches.isIp75081MqPut88();
   }

	/**
	*  set values "P"
	*/
   	public void setIp75081MqPut88True()  throws CFException{  			
    	ip75081MqSwitches.setIp75081MqPut88True();
   	}
	/**
	 *	Returns the value of ip75081AccntNum
	 *	@return ip75081AccntNum
	 */
   public char[] getIp75081AccntNum() throws CFException  {              
   		return ip75081MqSwitches.getIp75081AccntNum();
   }

  
	/**
	*  set variable ip75081AccntNum
	*  @param value
	**/
   public void setIp75081AccntNum(char[] value) throws CFException {
      ip75081MqSwitches.setIp75081AccntNum(value);
   } 

     /**
	 * 	Update Ip75081AccntNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp75081AccntNum(char[] source, int sourceIndex) throws CFException {
      ip75081MqSwitches.setIp75081AccntNum(source, sourceIndex);
   	
   }
   
   public void setIp75081AccntNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip75081MqSwitches.setIp75081AccntNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip75081AccntNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp75081AccntNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip75081MqSwitches.setIp75081AccntNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip75081AccntNum with another Field
	 *	@param value
	 */
   public void setIp75081AccntNum(Field source) {
      ip75081MqSwitches.setIp75081AccntNum(source);
   }  
   
     /**
	 * 	Update Ip75081AccntNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp75081AccntNum(Field source, int sourceIndex,int sourceLen) {
      ip75081MqSwitches.setIp75081AccntNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip75081AccntNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp75081AccntNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip75081MqSwitches.setIp75081AccntNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "M" for isIp75081IsForPim88()
	 *	@return  Returns true if isIp75081IsForPim88() is "M"
	 */
   public boolean isIp75081IsForPim88() throws CFException {
      return ip75081MqSwitches.isIp75081IsForPim88();
   }

	/**
	*  set values "M"
	*/
   	public void setIp75081IsForPim88True()  throws CFException{  			
    	ip75081MqSwitches.setIp75081IsForPim88True();
   	}
	/**
	 *	Returns the value of ip34631VirtualAccountNbr
	 *	@return ip34631VirtualAccountNbr
	 */
   public char[] getIp34631VirtualAccountNbr() throws CFException  {              
   		return ip34631Tipapim.getIp34631VirtualAccountNbr();
   }

  
	/**
	*  set variable ip34631VirtualAccountNbr
	*  @param value
	**/
   public void setIp34631VirtualAccountNbr(char[] value) throws CFException {
      ip34631Tipapim.setIp34631VirtualAccountNbr(value);
   } 

     /**
	 * 	Update Ip34631VirtualAccountNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp34631VirtualAccountNbr(char[] source, int sourceIndex) throws CFException {
      ip34631Tipapim.setIp34631VirtualAccountNbr(source, sourceIndex);
   	
   }
   
   public void setIp34631VirtualAccountNbr(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip34631Tipapim.setIp34631VirtualAccountNbr(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip34631VirtualAccountNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp34631VirtualAccountNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip34631Tipapim.setIp34631VirtualAccountNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip34631VirtualAccountNbr with another Field
	 *	@param value
	 */
   public void setIp34631VirtualAccountNbr(Field source) {
      ip34631Tipapim.setIp34631VirtualAccountNbr(source);
   }  
   
     /**
	 * 	Update Ip34631VirtualAccountNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp34631VirtualAccountNbr(Field source, int sourceIndex,int sourceLen) {
      ip34631Tipapim.setIp34631VirtualAccountNbr(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip34631VirtualAccountNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp34631VirtualAccountNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip34631Tipapim.setIp34631VirtualAccountNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip34631Tipapim.hashCode();
        str += ip75081MqSwitches.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public OnsoilProcessOutCtx clone() {
        OnsoilProcessOutCtx cloneObj = new OnsoilProcessOutCtx();
        cloneObj.ip34631Tipapim = new Ip34631Tipapim();
        cloneObj.ip34631Tipapim.set(ip34631Tipapim.getClonedField());
        cloneObj.ip75081MqSwitches = new Ip75081MqSwitches();
        cloneObj.ip75081MqSwitches.set(ip75081MqSwitches.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public OnsoilProcessOutCtx getOnsoilProcessOutCtx() {
            return new OnsoilProcessOutCtx();
    }
     public class ClosePmmFixUnloadFileInCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip343900Ctx.this.getAbendParaName900();
     IoErrorType600 ioErrorType600 = Ip343900Ctx.this.getIoErrorType600();
     Work work = Ip343900Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip343900Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of noOfRecords600
	 *	@return noOfRecords600
	 */
   public char[] getNoOfRecords600() throws CFException  {              
   		return ioErrorType600.getNoOfRecords600();
   }

  
	/**
	*  set variable noOfRecords600
	*  @param value
	**/
   public void setNoOfRecords600(char[] value) throws CFException {
      ioErrorType600.setNoOfRecords600(value);
   } 

     /**
	 * 	Update NoOfRecords600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNoOfRecords600(char[] source, int sourceIndex) throws CFException {
      ioErrorType600.setNoOfRecords600(source, sourceIndex);
   	
   }
   
   public void setNoOfRecords600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ioErrorType600.setNoOfRecords600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update NoOfRecords600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNoOfRecords600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioErrorType600.setNoOfRecords600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update NoOfRecords600 with another Field
	 *	@param value
	 */
   public void setNoOfRecords600(Field source) {
      ioErrorType600.setNoOfRecords600(source);
   }  
   
     /**
	 * 	Update NoOfRecords600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNoOfRecords600(Field source, int sourceIndex,int sourceLen) {
      ioErrorType600.setNoOfRecords600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update NoOfRecords600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNoOfRecords600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ioErrorType600.setNoOfRecords600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ioErrorType600
	 *	@return ioErrorType600
	 */   
	 public IoErrorType600 getIoErrorType600() {
   	return ioErrorType600;
   }


	/**
	 *	Returns the value of insRecCnt400
	 *	@return insRecCnt400
	 */
	public long getInsRecCnt400() throws CFException {
   		return work.getInsRecCnt400();
	}


	/**
	 *	Returns String value of insRecCnt400
	 *	@return insRecCnt400
	 */
	public char[]  getInsRecCnt400String() throws CFException {
	     return String.valueOf(work.getInsRecCnt400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean insRecCnt400IsNumeric()  throws CFException{
	    return work.insRecCnt400IsNumeric();
	}

	/**
	 * 	Update InsRecCnt400 with the passed value
	 *	@param number
	 */
	public void setInsRecCnt400(long number)  throws CFException{
		work.setInsRecCnt400(number);
	}
	

	
	/**
	 * 	Update InsRecCnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setInsRecCnt400(char[] value)  throws CFException {
		work.setInsRecCnt400(value);
	}
	
	/**
	 * 	Update InsRecCnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInsRecCnt400String(char[] value)  throws CFException{
		work.setInsRecCnt400(value);
	}	

	/**
	 *	Returns the value of closeAbendCode300
	 *	@return closeAbendCode300
	 */
   public char[] getCloseAbendCode300() throws CFException  {              
   		return work.getCloseAbendCode300();
   }

  
	/**
	*  set variable closeAbendCode300
	*  @param value
	**/
   public void setCloseAbendCode300(char[] value) throws CFException {
      work.setCloseAbendCode300(value);
   } 

	/**
	 *	Returns the value of sys001Status200
	 *	@return sys001Status200
	 */
	public int getSys001Status200() throws CFException {
   		return work.getSys001Status200();
	}


	/**
	 *	Returns String value of sys001Status200
	 *	@return sys001Status200
	 */
	public char[]  getSys001Status200String() throws CFException {
	     return String.valueOf(work.getSys001Status200String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys001Status200IsNumeric()  throws CFException{
	    return work.sys001Status200IsNumeric();
	}

	/**
	 * 	Update Sys001Status200 with the passed value
	 *	@param number
	 */
	public void setSys001Status200(int number)  throws CFException{
		work.setSys001Status200(number);
	}
	

	public void setSys001Status200(long number)  throws CFException{
	    work.setSys001Status200(number);
	}
	
	
	/**
	 * 	Update Sys001Status200 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSys001Status200(char[] value)  throws CFException {
		work.setSys001Status200(value);
	}
	
	/**
	 * 	Update Sys001Status200 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSys001Status200String(char[] value)  throws CFException{
		work.setSys001Status200(value);
	}	

	/**
	 *	Test condition 0 for isSys001Good88200()
	 *	@return  Returns true if isSys001Good88200() is 0
	 */
   public boolean isSys001Good88200() throws CFException {
      return work.isSys001Good88200();
   }

	/**
	*  set values 0
	*/
   	public void setSys001Good88200True()  throws CFException{  			
    	work.setSys001Good88200True();
   	}

        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }

        public ClosePmmFixUnloadFileOutCtx getClosePmmFixUnloadFileOutCtx() {
            return new ClosePmmFixUnloadFileOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendParaName900.hashCode();
        str += ioErrorType600.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public ClosePmmFixUnloadFileInCtx clone() {
        ClosePmmFixUnloadFileInCtx cloneObj = new ClosePmmFixUnloadFileInCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ioErrorType600 = new IoErrorType600();
        cloneObj.ioErrorType600.set(ioErrorType600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public ClosePmmFixUnloadFileInCtx getClosePmmFixUnloadFileInCtx() {
            return new ClosePmmFixUnloadFileInCtx();
    }
     public class ClosePmmFixUnloadFileOutCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip343900Ctx.this.getAbendParaName900();
     IoErrorType600 ioErrorType600 = Ip343900Ctx.this.getIoErrorType600();
     Work work = Ip343900Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip343900Ctx.this.getAbendMessage900();

	/**
	 *	Test condition "3000-CLOSE-PMM-FIX-UNLOAD-FILE" for isPara300088300()
	 *	@return  Returns true if isPara300088300() is "3000-CLOSE-PMM-FIX-UNLOAD-FILE"
	 */
   public boolean isPara300088300() throws CFException {
      return work.isPara300088300();
   }

	/**
	*  set values "3000-CLOSE-PMM-FIX-UNLOAD-FILE"
	*/
   	public void setPara300088300True()  throws CFException{  			
    	work.setPara300088300True();
   	}
	/**
	 *	Returns the value of paraName300
	 *	@return paraName300
	 */
   public char[] getParaName300() throws CFException  {              
   		return work.getParaName300();
   }

  
	/**
	*  set variable paraName300
	*  @param value
	**/
   public void setParaName300(char[] value) throws CFException {
      work.setParaName300(value);
   } 

	/**
	 *	Returns the value of sys001FileStat600
	 *	@return sys001FileStat600
	 */
	public int getSys001FileStat600() throws CFException {
   		return ioErrorType600.getSys001FileStat600();
	}


	/**
	 *	Returns String value of sys001FileStat600
	 *	@return sys001FileStat600
	 */
	public char[]  getSys001FileStat600String() throws CFException {
	     return String.valueOf(ioErrorType600.getSys001FileStat600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys001FileStat600IsNumeric()  throws CFException{
	    return ioErrorType600.sys001FileStat600IsNumeric();
	}

	/**
	 * 	Update Sys001FileStat600 with the passed value
	 *	@param number
	 */
	public void setSys001FileStat600(int number)  throws CFException{
		ioErrorType600.setSys001FileStat600(number);
	}
	

	public void setSys001FileStat600(long number)  throws CFException{
	    ioErrorType600.setSys001FileStat600(number);
	}
	
	
	/**
	 * 	Update Sys001FileStat600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSys001FileStat600(char[] value)  throws CFException {
		ioErrorType600.setSys001FileStat600(value);
	}
	
	/**
	 * 	Update Sys001FileStat600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSys001FileStat600String(char[] value)  throws CFException{
		ioErrorType600.setSys001FileStat600(value);
	}	

	/**
	 *	Returns the value of abendPara900
	 *	@return abendPara900
	 */
   public char[] getAbendPara900() throws CFException  {              
   		return abendParaName900.getAbendPara900();
   }

  
	/**
	*  set variable abendPara900
	*  @param value
	**/
   public void setAbendPara900(char[] value) throws CFException {
      abendParaName900.setAbendPara900(value);
   } 

     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex) throws CFException {
      abendParaName900.setAbendPara900(source, sourceIndex);
   	
   }
   
   public void setAbendPara900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendPara900 with another Field
	 *	@param value
	 */
   public void setAbendPara900(Field source) {
      abendParaName900.setAbendPara900(source);
   }  
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of ioErrorType600
	 *	@return ioErrorType600
	 */   
	 public IoErrorType600 getIoErrorType600() {
   	return ioErrorType600;
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
	 *	Returns the value of closeAbendCode300
	 *	@return closeAbendCode300
	 */
   public char[] getCloseAbendCode300() throws CFException  {              
   		return work.getCloseAbendCode300();
   }

  
	/**
	*  set variable closeAbendCode300
	*  @param value
	**/
   public void setCloseAbendCode300(char[] value) throws CFException {
      work.setCloseAbendCode300(value);
   } 

	/**
	 *	Test condition "ERROR CLOSING SYS001 FILE.  " for isCloseError88600()
	 *	@return  Returns true if isCloseError88600() is "ERROR CLOSING SYS001 FILE.  "
	 */
   public boolean isCloseError88600() throws CFException {
      return ioErrorType600.isCloseError88600();
   }

	/**
	*  set values "ERROR CLOSING SYS001 FILE.  "
	*/
   	public void setCloseError88600True()  throws CFException{  			
    	ioErrorType600.setCloseError88600True();
   	}
	/**
	 *	Returns the value of sys001Status200
	 *	@return sys001Status200
	 */
	public int getSys001Status200() throws CFException {
   		return work.getSys001Status200();
	}


	/**
	 *	Returns String value of sys001Status200
	 *	@return sys001Status200
	 */
	public char[]  getSys001Status200String() throws CFException {
	     return String.valueOf(work.getSys001Status200String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys001Status200IsNumeric()  throws CFException{
	    return work.sys001Status200IsNumeric();
	}

	/**
	 * 	Update Sys001Status200 with the passed value
	 *	@param number
	 */
	public void setSys001Status200(int number)  throws CFException{
		work.setSys001Status200(number);
	}
	

	public void setSys001Status200(long number)  throws CFException{
	    work.setSys001Status200(number);
	}
	
	
	/**
	 * 	Update Sys001Status200 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSys001Status200(char[] value)  throws CFException {
		work.setSys001Status200(value);
	}
	
	/**
	 * 	Update Sys001Status200 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSys001Status200String(char[] value)  throws CFException{
		work.setSys001Status200(value);
	}	


        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendParaName900.hashCode();
        str += ioErrorType600.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public ClosePmmFixUnloadFileOutCtx clone() {
        ClosePmmFixUnloadFileOutCtx cloneObj = new ClosePmmFixUnloadFileOutCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ioErrorType600 = new IoErrorType600();
        cloneObj.ioErrorType600.set(ioErrorType600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public ClosePmmFixUnloadFileOutCtx getClosePmmFixUnloadFileOutCtx() {
            return new ClosePmmFixUnloadFileOutCtx();
    }
     public class CloseDisconnectQInCtx implements Cloneable {
     Ip34051MqProcessParameters ip34051MqProcessParameters = Ip343900Ctx.this.getIp34051MqProcessParameters();
     Work work = Ip343900Ctx.this.getWork();

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


        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }

        public CloseDisconnectQOutCtx getCloseDisconnectQOutCtx() {
            return new CloseDisconnectQOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip34051MqProcessParameters.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public CloseDisconnectQInCtx clone() {
        CloseDisconnectQInCtx cloneObj = new CloseDisconnectQInCtx();
        cloneObj.ip34051MqProcessParameters = new Ip34051MqProcessParameters();
        cloneObj.ip34051MqProcessParameters.set(ip34051MqProcessParameters.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CloseDisconnectQInCtx getCloseDisconnectQInCtx() {
            return new CloseDisconnectQInCtx();
    }
     public class CloseDisconnectQOutCtx implements Cloneable {
     Ip34051MqProcessParameters ip34051MqProcessParameters = Ip343900Ctx.this.getIp34051MqProcessParameters();
     Work work = Ip343900Ctx.this.getWork();

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
	 *	Test condition "0000" for isIp34051FuncCdGeneral88()
	 *	@return  Returns true if isIp34051FuncCdGeneral88() is "0000"
	 */
   public boolean isIp34051FuncCdGeneral88() throws CFException {
      return ip34051MqProcessParameters.isIp34051FuncCdGeneral88();
   }

	/**
	*  set values "0000"
	*/
   	public void setIp34051FuncCdGeneral88True()  throws CFException{  			
    	ip34051MqProcessParameters.setIp34051FuncCdGeneral88True();
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
	 *	Test condition "0003" for isIp34051ServCdPimmap88()
	 *	@return  Returns true if isIp34051ServCdPimmap88() is "0003"
	 */
   public boolean isIp34051ServCdPimmap88() throws CFException {
      return ip34051MqProcessParameters.isIp34051ServCdPimmap88();
   }

	/**
	*  set values "0003"
	*/
   	public void setIp34051ServCdPimmap88True()  throws CFException{  			
    	ip34051MqProcessParameters.setIp34051ServCdPimmap88True();
   	}

        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip34051MqProcessParameters.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public CloseDisconnectQOutCtx clone() {
        CloseDisconnectQOutCtx cloneObj = new CloseDisconnectQOutCtx();
        cloneObj.ip34051MqProcessParameters = new Ip34051MqProcessParameters();
        cloneObj.ip34051MqProcessParameters.set(ip34051MqProcessParameters.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CloseDisconnectQOutCtx getCloseDisconnectQOutCtx() {
            return new CloseDisconnectQOutCtx();
    }
     public class ReadPmmFixUnloadFileInCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip343900Ctx.this.getAbendParaName900();
     Ip34631Tipapim ip34631Tipapim = Ip343900Ctx.this.getIp34631Tipapim();
     Sys001PimLoadRec sys001PimLoadRec = Ip343900Ctx.this.getSys001PimLoadRec();
     IoErrorType600 ioErrorType600 = Ip343900Ctx.this.getIoErrorType600();
     Work work = Ip343900Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip343900Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of readAbendCode300
	 *	@return readAbendCode300
	 */
   public char[] getReadAbendCode300() throws CFException  {              
   		return work.getReadAbendCode300();
   }

  
	/**
	*  set variable readAbendCode300
	*  @param value
	**/
   public void setReadAbendCode300(char[] value) throws CFException {
      work.setReadAbendCode300(value);
   } 

	/**
	 *	Returns the value of ip34631Tipapim
	 *	@return ip34631Tipapim
	 */   
	 public Ip34631Tipapim getIp34631Tipapim() {
   	return ip34631Tipapim;
   }


	/**
	 *	Returns the value of sys001PimLoadRec
	 *	@return sys001PimLoadRec
	 */   
	 public Sys001PimLoadRec getSys001PimLoadRec() {
   	return sys001PimLoadRec;
   }


	/**
	 *	Returns the value of ioErrorType600
	 *	@return ioErrorType600
	 */   
	 public IoErrorType600 getIoErrorType600() {
   	return ioErrorType600;
   }



        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }

        public ReadPmmFixUnloadFileOutCtx getReadPmmFixUnloadFileOutCtx() {
            return new ReadPmmFixUnloadFileOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendParaName900.hashCode();
        str += ip34631Tipapim.hashCode();
        str += sys001PimLoadRec.hashCode();
        str += ioErrorType600.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public ReadPmmFixUnloadFileInCtx clone() {
        ReadPmmFixUnloadFileInCtx cloneObj = new ReadPmmFixUnloadFileInCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ip34631Tipapim = new Ip34631Tipapim();
        cloneObj.ip34631Tipapim.set(ip34631Tipapim.getClonedField());
        cloneObj.sys001PimLoadRec = new Sys001PimLoadRec();
        cloneObj.sys001PimLoadRec.set(sys001PimLoadRec.getClonedField());
        cloneObj.ioErrorType600 = new IoErrorType600();
        cloneObj.ioErrorType600.set(ioErrorType600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public ReadPmmFixUnloadFileInCtx getReadPmmFixUnloadFileInCtx() {
            return new ReadPmmFixUnloadFileInCtx();
    }
     public class ReadPmmFixUnloadFileOutCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip343900Ctx.this.getAbendParaName900();
     Ip34631Tipapim ip34631Tipapim = Ip343900Ctx.this.getIp34631Tipapim();
     Sys001PimLoadRec sys001PimLoadRec = Ip343900Ctx.this.getSys001PimLoadRec();
     IoErrorType600 ioErrorType600 = Ip343900Ctx.this.getIoErrorType600();
     Work work = Ip343900Ctx.this.getWork();
     AbendMessage900 abendMessage900 = Ip343900Ctx.this.getAbendMessage900();

	/**
	 *	Returns the value of readAbendCode300
	 *	@return readAbendCode300
	 */
   public char[] getReadAbendCode300() throws CFException  {              
   		return work.getReadAbendCode300();
   }

  
	/**
	*  set variable readAbendCode300
	*  @param value
	**/
   public void setReadAbendCode300(char[] value) throws CFException {
      work.setReadAbendCode300(value);
   } 

	/**
	 *	Returns the value of ip34631Tipapim
	 *	@return ip34631Tipapim
	 */   
	 public Ip34631Tipapim getIp34631Tipapim() {
   	return ip34631Tipapim;
   }


	/**
	 *	Returns the value of paraName300
	 *	@return paraName300
	 */
   public char[] getParaName300() throws CFException  {              
   		return work.getParaName300();
   }

  
	/**
	*  set variable paraName300
	*  @param value
	**/
   public void setParaName300(char[] value) throws CFException {
      work.setParaName300(value);
   } 

	/**
	 *	Test condition "ERROR READING SYS001 FILE.  " for isReadError88600()
	 *	@return  Returns true if isReadError88600() is "ERROR READING SYS001 FILE.  "
	 */
   public boolean isReadError88600() throws CFException {
      return ioErrorType600.isReadError88600();
   }

	/**
	*  set values "ERROR READING SYS001 FILE.  "
	*/
   	public void setReadError88600True()  throws CFException{  			
    	ioErrorType600.setReadError88600True();
   	}
	/**
	 *	Returns the value of sys001FileStat600
	 *	@return sys001FileStat600
	 */
	public int getSys001FileStat600() throws CFException {
   		return ioErrorType600.getSys001FileStat600();
	}


	/**
	 *	Returns String value of sys001FileStat600
	 *	@return sys001FileStat600
	 */
	public char[]  getSys001FileStat600String() throws CFException {
	     return String.valueOf(ioErrorType600.getSys001FileStat600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys001FileStat600IsNumeric()  throws CFException{
	    return ioErrorType600.sys001FileStat600IsNumeric();
	}

	/**
	 * 	Update Sys001FileStat600 with the passed value
	 *	@param number
	 */
	public void setSys001FileStat600(int number)  throws CFException{
		ioErrorType600.setSys001FileStat600(number);
	}
	

	public void setSys001FileStat600(long number)  throws CFException{
	    ioErrorType600.setSys001FileStat600(number);
	}
	
	
	/**
	 * 	Update Sys001FileStat600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSys001FileStat600(char[] value)  throws CFException {
		ioErrorType600.setSys001FileStat600(value);
	}
	
	/**
	 * 	Update Sys001FileStat600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSys001FileStat600String(char[] value)  throws CFException{
		ioErrorType600.setSys001FileStat600(value);
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
	 *	Returns the value of sys001PimLoadRec
	 *	@return sys001PimLoadRec
	 */   
	 public Sys001PimLoadRec getSys001PimLoadRec() {
   	return sys001PimLoadRec;
   }


	/**
	 *	Returns the value of abendPara900
	 *	@return abendPara900
	 */
   public char[] getAbendPara900() throws CFException  {              
   		return abendParaName900.getAbendPara900();
   }

  
	/**
	*  set variable abendPara900
	*  @param value
	**/
   public void setAbendPara900(char[] value) throws CFException {
      abendParaName900.setAbendPara900(value);
   } 

     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex) throws CFException {
      abendParaName900.setAbendPara900(source, sourceIndex);
   	
   }
   
   public void setAbendPara900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendPara900 with another Field
	 *	@param value
	 */
   public void setAbendPara900(Field source) {
      abendParaName900.setAbendPara900(source);
   }  
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ioErrorType600
	 *	@return ioErrorType600
	 */   
	 public IoErrorType600 getIoErrorType600() {
   	return ioErrorType600;
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
	 *	Test condition 10 for isSys001Eof88200()
	 *	@return  Returns true if isSys001Eof88200() is 10
	 */
   public boolean isSys001Eof88200() throws CFException {
      return work.isSys001Eof88200();
   }

	/**
	*  set values 10
	*/
   	public void setSys001Eof88200True()  throws CFException{  			
    	work.setSys001Eof88200True();
   	}
	/**
	 *	Test condition "8000-READ-PMM-FIX-UNLOAD-FILE" for isPara800088300()
	 *	@return  Returns true if isPara800088300() is "8000-READ-PMM-FIX-UNLOAD-FILE"
	 */
   public boolean isPara800088300() throws CFException {
      return work.isPara800088300();
   }

	/**
	*  set values "8000-READ-PMM-FIX-UNLOAD-FILE"
	*/
   	public void setPara800088300True()  throws CFException{  			
    	work.setPara800088300True();
   	}
	/**
	 *	Returns the value of sys001Status200
	 *	@return sys001Status200
	 */
	public int getSys001Status200() throws CFException {
   		return work.getSys001Status200();
	}


	/**
	 *	Returns String value of sys001Status200
	 *	@return sys001Status200
	 */
	public char[]  getSys001Status200String() throws CFException {
	     return String.valueOf(work.getSys001Status200String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys001Status200IsNumeric()  throws CFException{
	    return work.sys001Status200IsNumeric();
	}

	/**
	 * 	Update Sys001Status200 with the passed value
	 *	@param number
	 */
	public void setSys001Status200(int number)  throws CFException{
		work.setSys001Status200(number);
	}
	

	public void setSys001Status200(long number)  throws CFException{
	    work.setSys001Status200(number);
	}
	
	
	/**
	 * 	Update Sys001Status200 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSys001Status200(char[] value)  throws CFException {
		work.setSys001Status200(value);
	}
	
	/**
	 * 	Update Sys001Status200 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSys001Status200String(char[] value)  throws CFException{
		work.setSys001Status200(value);
	}	

	/**
	 *	Test condition 0 for isSys001Good88200()
	 *	@return  Returns true if isSys001Good88200() is 0
	 */
   public boolean isSys001Good88200() throws CFException {
      return work.isSys001Good88200();
   }

	/**
	*  set values 0
	*/
   	public void setSys001Good88200True()  throws CFException{  			
    	work.setSys001Good88200True();
   	}

        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendParaName900.hashCode();
        str += ip34631Tipapim.hashCode();
        str += sys001PimLoadRec.hashCode();
        str += ioErrorType600.hashCode();
        str += work.hashCode();
        str += abendMessage900.hashCode();
       return str.hashCode();
    }

    public ReadPmmFixUnloadFileOutCtx clone() {
        ReadPmmFixUnloadFileOutCtx cloneObj = new ReadPmmFixUnloadFileOutCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ip34631Tipapim = new Ip34631Tipapim();
        cloneObj.ip34631Tipapim.set(ip34631Tipapim.getClonedField());
        cloneObj.sys001PimLoadRec = new Sys001PimLoadRec();
        cloneObj.sys001PimLoadRec.set(sys001PimLoadRec.getClonedField());
        cloneObj.ioErrorType600 = new IoErrorType600();
        cloneObj.ioErrorType600.set(ioErrorType600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        return cloneObj;
    }

    }

    public ReadPmmFixUnloadFileOutCtx getReadPmmFixUnloadFileOutCtx() {
            return new ReadPmmFixUnloadFileOutCtx();
    }
     public class TerminateOnErrorInCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip343900Ctx.this.getAbendParaName900();
     AbendMessage900 abendMessage900 = Ip343900Ctx.this.getAbendMessage900();
     Work work = Ip343900Ctx.this.getWork();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip343900Ctx.this.getIp60001EventLogWorkArea();

	/**
	 *	Returns the value of abendParaName900
	 *	@return abendParaName900
	 */   
	 public AbendParaName900 getAbendParaName900() {
   	return abendParaName900;
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
	 *	Returns the value of abendAbendPgm900
	 *	@return abendAbendPgm900
	 */
   public char[] getAbendAbendPgm900() throws CFException  {              
   		return work.getAbendAbendPgm900();
   }

  
	/**
	*  set variable abendAbendPgm900
	*  @param value
	**/
   public void setAbendAbendPgm900(char[] value) throws CFException {
      work.setAbendAbendPgm900(value);
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
	 *	Returns the value of abendAbend900
	 *	@return abendAbend900
	 */
   public char[] getAbendAbend900() throws CFException  {              
   		return work.getAbendAbend900();
   }

  
	/**
	*  set variable abendAbend900
	*  @param value
	**/
   public void setAbendAbend900(char[] value) throws CFException {
      work.setAbendAbend900(value);
   } 

	/**
	 *	Returns the value of abendMessage900
	 *	@return abendMessage900
	 */   
	 public AbendMessage900 getAbendMessage900() {
   	return abendMessage900;
   }


	/**
	 *	Returns the value of astriskLine900
	 *	@return astriskLine900
	 */
   public char[] getAstriskLine900() throws CFException  {              
   		return work.getAstriskLine900();
   }

  
	/**
	*  set variable astriskLine900
	*  @param value
	**/
   public void setAstriskLine900(char[] value) throws CFException {
      work.setAstriskLine900(value);
   } 


        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
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
        str += abendParaName900.hashCode();
        str += abendMessage900.hashCode();
        str += work.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public TerminateOnErrorInCtx clone() {
        TerminateOnErrorInCtx cloneObj = new TerminateOnErrorInCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public TerminateOnErrorInCtx getTerminateOnErrorInCtx() {
            return new TerminateOnErrorInCtx();
    }
     public class TerminateOnErrorOutCtx implements Cloneable {
     AbendParaName900 abendParaName900 = Ip343900Ctx.this.getAbendParaName900();
     AbendMessage900 abendMessage900 = Ip343900Ctx.this.getAbendMessage900();
     Work work = Ip343900Ctx.this.getWork();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip343900Ctx.this.getIp60001EventLogWorkArea();

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

	/**
	 *	Returns the value of abendMessage900
	 *	@return abendMessage900
	 */   
	 public AbendMessage900 getAbendMessage900() {
   	return abendMessage900;
   }



        public Ip343900Ctx getIp343900Ctx() {
            return Ip343900Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendParaName900.hashCode();
        str += abendMessage900.hashCode();
        str += work.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public TerminateOnErrorOutCtx clone() {
        TerminateOnErrorOutCtx cloneObj = new TerminateOnErrorOutCtx();
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public TerminateOnErrorOutCtx getTerminateOnErrorOutCtx() {
            return new TerminateOnErrorOutCtx();
    }
}
