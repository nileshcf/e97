package com.cloudframe.app.ip343690;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.ip343690.dto.Parms1000;
import com.cloudframe.app.global.sharedvar.Ip996011ProgramStartMessage;
import com.cloudframe.app.ip343690.dto.Db2Workarea800;
import com.cloudframe.app.ip343690.dto.AbendParaName900;
import com.cloudframe.app.global.sharedvar.Ip00404Table;
import com.cloudframe.app.ip343690.dto.Tipapma;
import com.cloudframe.app.global.sharedvar.Db85102dWorkFields;
import com.cloudframe.app.global.sharedvar.ApiLayout;
import com.cloudframe.app.ip343690.dto.Work;
import com.cloudframe.app.global.sharedvar.Ip60001EventLogWorkArea;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
import java.sql.ResultSet;
import com.cloudframe.app.ip343690.dto.DbConnectError8023005;
import com.cloudframe.app.ip343690.dto.SleepTimeGroup800;
import com.cloudframe.app.ip343690.dto.DbUpdateError8023010;
import com.cloudframe.app.ip343690.dto.Db85102dDb2cloneRec;
import com.cloudframe.app.ip343690.dto.Msg3001a600;
import com.cloudframe.app.global.sharedvar.Ip30881Db2McwaitInputValue;
import com.cloudframe.app.ip343690.dto.AbendMessage900;
import com.cloudframe.app.ip343690.file.records.Db2cloneRec;
import com.cloudframe.app.ip343690.dto.AbendCode800;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
import com.cloudframe.app.ip343690.dto.Sys001ErrMsgTxt600;
import com.cloudframe.app.global.sharedvar.Ip08101RunControlRecord;
import com.cloudframe.app.ip343690.dto.Sqlwarn;
import com.cloudframe.app.ip343690.dto.PgmIp343690Group300;
import com.cloudframe.app.ip343690.dto.DbSelectError8023006;
import com.cloudframe.app.ip343690.file.records.Sys001InputPmaUnldRec;
import com.cloudframe.app.ip343690.dto.Sqlca;
import com.cloudframe.app.ip343690.dto.SleepMessage600;
import com.cloudframe.app.ip343690.dto.Constants300;
import com.cloudframe.app.ip343690.dto.SqlAbendMsg900;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;
import com.cloudframe.app.ip343690.dto.TipapmaLayout800;
import com.cloudframe.app.ip343690.dto.Itipapma;


@Context
public class Ip343690Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    DbConnectError8023005 dbConnectError8023005;
    Db2cloneRec db2cloneRec;
    Db85102dDb2cloneRec db85102dDb2cloneRec;
    ApiLayout apiLayout;
    Sqlca sqlca;
    Msg3001a600 msg3001a600;
    Ip08101RunControlRecord ip08101RunControlRecord;
    Ip50005OneDayRec ip50005OneDayRec;
    Tipapma tipapma;
    Parms1000 parms1000;
    Ip996011ProgramStartMessage ip996011ProgramStartMessage;
    Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup;
    Ip60001EventLogWorkArea ip60001EventLogWorkArea;
    SqlAbendMsg900 sqlAbendMsg900;
    Db2Workarea800 db2Workarea800;
    Ip00404Table ip00404Table;
    DbUpdateError8023010 dbUpdateError8023010;
    Sys001ErrMsgTxt600 sys001ErrMsgTxt600;
    AbendParaName900 abendParaName900;
    Ip50005ClearingDtTm ip50005ClearingDtTm;
    DbSelectError8023006 dbSelectError8023006;
    Ip30881Db2McwaitInputValue ip30881Db2McwaitInputValue;
    Itipapma itipapma;
    AbendMessage900 abendMessage900;
    Sys001InputPmaUnldRec sys001InputPmaUnldRec;
    Work work;
    Constants300 constants300;
    SleepMessage600 sleepMessage600;
    Db85102dWorkFields db85102dWorkFields;
    Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup;
    TipapmaLayout800 tipapmaLayout800;

    int ip00404AcctRngIndex;

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


    ResultSet pmaCursorResultSet;

    public ResultSet getPmaCursorResultSet() {
        return this.pmaCursorResultSet;
    }

    public void setPmaCursorResultSet(ResultSet pmaCursorResultSet) {
        this.pmaCursorResultSet = pmaCursorResultSet;
    }

    boolean programEnded = false;

    public boolean isProgramEnded() {
        return this.programEnded;
    }

    public void setProgramEnded(boolean programEnded) {
        this.programEnded = programEnded;
    }


    public DbConnectError8023005 getDbConnectError8023005() {
        if (dbConnectError8023005 == null) {
            dbConnectError8023005 = new DbConnectError8023005();
        }

        return dbConnectError8023005;
    }

    public void setDbConnectError8023005(DbConnectError8023005 dbConnectError8023005) {
        this.dbConnectError8023005 = dbConnectError8023005;
    }
    public Db2cloneRec getDb2cloneRec() {
        if (db2cloneRec == null) {
            db2cloneRec = new Db2cloneRec();
        }

        return db2cloneRec;
    }

    public void setDb2cloneRec(Db2cloneRec db2cloneRec) {
        this.db2cloneRec = db2cloneRec;
    }
    public Db85102dDb2cloneRec getDb85102dDb2cloneRec() {
        if (db85102dDb2cloneRec == null) {
            db85102dDb2cloneRec = new Db85102dDb2cloneRec();
        }

        return db85102dDb2cloneRec;
    }

    public void setDb85102dDb2cloneRec(Db85102dDb2cloneRec db85102dDb2cloneRec) {
        this.db85102dDb2cloneRec = db85102dDb2cloneRec;
    }
    public ApiLayout getApiLayout() {
        if (apiLayout == null) {
            apiLayout = globalCtx.getGlobalDto(ApiLayout.class);
        }

        return apiLayout;
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
    public Msg3001a600 getMsg3001a600() {
        if (msg3001a600 == null) {
            msg3001a600 = new Msg3001a600();
        }

        return msg3001a600;
    }

    public void setMsg3001a600(Msg3001a600 msg3001a600) {
        this.msg3001a600 = msg3001a600;
    }
    public Ip08101RunControlRecord getIp08101RunControlRecord() {
        if (ip08101RunControlRecord == null) {
            ip08101RunControlRecord = globalCtx.getGlobalDto(Ip08101RunControlRecord.class);
        }

        return ip08101RunControlRecord;
    }

    public Ip50005OneDayRec getIp50005OneDayRec() {
        if (ip50005OneDayRec == null) {
            ip50005OneDayRec = globalCtx.getGlobalDto(Ip50005OneDayRec.class);
        }

        return ip50005OneDayRec;
    }

    public Tipapma getTipapma() {
        if (tipapma == null) {
            tipapma = new Tipapma();
        }

        return tipapma;
    }

    public void setTipapma(Tipapma tipapma) {
        this.tipapma = tipapma;
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
    public Ip996011ProgramStartMessage getIp996011ProgramStartMessage() {
        if (ip996011ProgramStartMessage == null) {
            ip996011ProgramStartMessage = globalCtx.getGlobalDto(Ip996011ProgramStartMessage.class);
        }

        return ip996011ProgramStartMessage;
    }

    public Ip50005OneDayReadStatusGroup getIp50005OneDayReadStatusGroup() {
        if (ip50005OneDayReadStatusGroup == null) {
            ip50005OneDayReadStatusGroup = globalCtx.getGlobalDto(Ip50005OneDayReadStatusGroup.class);
        }

        return ip50005OneDayReadStatusGroup;
    }

    public Ip60001EventLogWorkArea getIp60001EventLogWorkArea() {
        if (ip60001EventLogWorkArea == null) {
            ip60001EventLogWorkArea = globalCtx.getGlobalDto(Ip60001EventLogWorkArea.class);
        }

        return ip60001EventLogWorkArea;
    }

    public SqlAbendMsg900 getSqlAbendMsg900() {
        if (sqlAbendMsg900 == null) {
            sqlAbendMsg900 = new SqlAbendMsg900();
        }

        return sqlAbendMsg900;
    }

    public void setSqlAbendMsg900(SqlAbendMsg900 sqlAbendMsg900) {
        this.sqlAbendMsg900 = sqlAbendMsg900;
    }
    public Db2Workarea800 getDb2Workarea800() {
        if (db2Workarea800 == null) {
            db2Workarea800 = new Db2Workarea800();
        }

        return db2Workarea800;
    }

    public void setDb2Workarea800(Db2Workarea800 db2Workarea800) {
        this.db2Workarea800 = db2Workarea800;
    }
    public Ip00404Table getIp00404Table() {
        if (ip00404Table == null) {
            ip00404Table = globalCtx.getGlobalDto(Ip00404Table.class);
        }

        return ip00404Table;
    }

    public DbUpdateError8023010 getDbUpdateError8023010() {
        if (dbUpdateError8023010 == null) {
            dbUpdateError8023010 = new DbUpdateError8023010();
        }

        return dbUpdateError8023010;
    }

    public void setDbUpdateError8023010(DbUpdateError8023010 dbUpdateError8023010) {
        this.dbUpdateError8023010 = dbUpdateError8023010;
    }
    public Sys001ErrMsgTxt600 getSys001ErrMsgTxt600() {
        if (sys001ErrMsgTxt600 == null) {
            sys001ErrMsgTxt600 = new Sys001ErrMsgTxt600();
        }

        return sys001ErrMsgTxt600;
    }

    public void setSys001ErrMsgTxt600(Sys001ErrMsgTxt600 sys001ErrMsgTxt600) {
        this.sys001ErrMsgTxt600 = sys001ErrMsgTxt600;
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
    public Ip50005ClearingDtTm getIp50005ClearingDtTm() {
        if (ip50005ClearingDtTm == null) {
            ip50005ClearingDtTm = globalCtx.getGlobalDto(Ip50005ClearingDtTm.class);
        }

        return ip50005ClearingDtTm;
    }

    public DbSelectError8023006 getDbSelectError8023006() {
        if (dbSelectError8023006 == null) {
            dbSelectError8023006 = new DbSelectError8023006();
        }

        return dbSelectError8023006;
    }

    public void setDbSelectError8023006(DbSelectError8023006 dbSelectError8023006) {
        this.dbSelectError8023006 = dbSelectError8023006;
    }
    public Ip30881Db2McwaitInputValue getIp30881Db2McwaitInputValue() {
        if (ip30881Db2McwaitInputValue == null) {
            ip30881Db2McwaitInputValue = globalCtx.getGlobalDto(Ip30881Db2McwaitInputValue.class);
        }

        return ip30881Db2McwaitInputValue;
    }

    public Itipapma getItipapma() {
        if (itipapma == null) {
            itipapma = new Itipapma();
        }

        return itipapma;
    }

    public void setItipapma(Itipapma itipapma) {
        this.itipapma = itipapma;
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
    public Sys001InputPmaUnldRec getSys001InputPmaUnldRec() {
        if (sys001InputPmaUnldRec == null) {
            sys001InputPmaUnldRec = new Sys001InputPmaUnldRec();
        }

        return sys001InputPmaUnldRec;
    }

    public void setSys001InputPmaUnldRec(Sys001InputPmaUnldRec sys001InputPmaUnldRec) {
        this.sys001InputPmaUnldRec = sys001InputPmaUnldRec;
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
    public Constants300 getConstants300() {
        if (constants300 == null) {
            constants300 = new Constants300();
        }

        return constants300;
    }

    public void setConstants300(Constants300 constants300) {
        this.constants300 = constants300;
    }
    public SleepMessage600 getSleepMessage600() {
        if (sleepMessage600 == null) {
            sleepMessage600 = new SleepMessage600();
        }

        return sleepMessage600;
    }

    public void setSleepMessage600(SleepMessage600 sleepMessage600) {
        this.sleepMessage600 = sleepMessage600;
    }
    public Db85102dWorkFields getDb85102dWorkFields() {
        if (db85102dWorkFields == null) {
            db85102dWorkFields = globalCtx.getGlobalDto(Db85102dWorkFields.class);
        }

        return db85102dWorkFields;
    }

    public Ip50005OneDayRecLthGroup getIp50005OneDayRecLthGroup() {
        if (ip50005OneDayRecLthGroup == null) {
            ip50005OneDayRecLthGroup = globalCtx.getGlobalDto(Ip50005OneDayRecLthGroup.class);
        }

        return ip50005OneDayRecLthGroup;
    }

    public TipapmaLayout800 getTipapmaLayout800() {
        if (tipapmaLayout800 == null) {
            tipapmaLayout800 = new TipapmaLayout800();
        }

        return tipapmaLayout800;
    }

    public void setTipapmaLayout800(TipapmaLayout800 tipapmaLayout800) {
        this.tipapmaLayout800 = tipapmaLayout800;
    }

    public int getIp00404AcctRngIndex() {
        return ip00404AcctRngIndex;
    }

    public void setIp00404AcctRngIndex(int ip00404AcctRngIndex) {
        this.ip00404AcctRngIndex = ip00404AcctRngIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dbConnectError8023005.hashCode();
        str += db2cloneRec.hashCode();
        str += db85102dDb2cloneRec.hashCode();
        str += apiLayout.hashCode();
        str += sqlca.hashCode();
        str += msg3001a600.hashCode();
        str += ip08101RunControlRecord.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += tipapma.hashCode();
        str += parms1000.hashCode();
        str += ip996011ProgramStartMessage.hashCode();
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
        str += sqlAbendMsg900.hashCode();
        str += db2Workarea800.hashCode();
        str += ip00404Table.hashCode();
        str += dbUpdateError8023010.hashCode();
        str += sys001ErrMsgTxt600.hashCode();
        str += abendParaName900.hashCode();
        str += ip50005ClearingDtTm.hashCode();
        str += dbSelectError8023006.hashCode();
        str += ip30881Db2McwaitInputValue.hashCode();
        str += itipapma.hashCode();
        str += abendMessage900.hashCode();
        str += sys001InputPmaUnldRec.hashCode();
        str += work.hashCode();
        str += constants300.hashCode();
        str += sleepMessage600.hashCode();
        str += db85102dWorkFields.hashCode();
        str += ip50005OneDayRecLthGroup.hashCode();
        str += tipapmaLayout800.hashCode();
       return str.hashCode();
    }

    public Ip343690Ctx clone() {
        Ip343690Ctx cloneObj = new Ip343690Ctx();
        cloneObj.dbConnectError8023005 = new DbConnectError8023005();
        cloneObj.dbConnectError8023005.set(dbConnectError8023005.getClonedField());
        cloneObj.db2cloneRec = new Db2cloneRec();
        cloneObj.db2cloneRec.set(db2cloneRec.getClonedField());
        cloneObj.db85102dDb2cloneRec = new Db85102dDb2cloneRec();
        cloneObj.db85102dDb2cloneRec.set(db85102dDb2cloneRec.getClonedField());
        cloneObj.apiLayout = new ApiLayout();
        cloneObj.apiLayout.set(apiLayout.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.msg3001a600 = new Msg3001a600();
        cloneObj.msg3001a600.set(msg3001a600.getClonedField());
        cloneObj.ip08101RunControlRecord = new Ip08101RunControlRecord();
        cloneObj.ip08101RunControlRecord.set(ip08101RunControlRecord.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.tipapma = new Tipapma();
        cloneObj.tipapma.set(tipapma.getClonedField());
        cloneObj.parms1000 = new Parms1000();
        cloneObj.parms1000.set(parms1000.getClonedField());
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        cloneObj.sqlAbendMsg900 = new SqlAbendMsg900();
        cloneObj.sqlAbendMsg900.set(sqlAbendMsg900.getClonedField());
        cloneObj.db2Workarea800 = new Db2Workarea800();
        cloneObj.db2Workarea800.set(db2Workarea800.getClonedField());
        cloneObj.ip00404Table = new Ip00404Table();
        cloneObj.ip00404Table.set(ip00404Table.getClonedField());
        cloneObj.dbUpdateError8023010 = new DbUpdateError8023010();
        cloneObj.dbUpdateError8023010.set(dbUpdateError8023010.getClonedField());
        cloneObj.sys001ErrMsgTxt600 = new Sys001ErrMsgTxt600();
        cloneObj.sys001ErrMsgTxt600.set(sys001ErrMsgTxt600.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.ip50005ClearingDtTm = new Ip50005ClearingDtTm();
        cloneObj.ip50005ClearingDtTm.set(ip50005ClearingDtTm.getClonedField());
        cloneObj.dbSelectError8023006 = new DbSelectError8023006();
        cloneObj.dbSelectError8023006.set(dbSelectError8023006.getClonedField());
        cloneObj.ip30881Db2McwaitInputValue = new Ip30881Db2McwaitInputValue();
        cloneObj.ip30881Db2McwaitInputValue.set(ip30881Db2McwaitInputValue.getClonedField());
        cloneObj.itipapma = new Itipapma();
        cloneObj.itipapma.set(itipapma.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.sys001InputPmaUnldRec = new Sys001InputPmaUnldRec();
        cloneObj.sys001InputPmaUnldRec.set(sys001InputPmaUnldRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.sleepMessage600 = new SleepMessage600();
        cloneObj.sleepMessage600.set(sleepMessage600.getClonedField());
        cloneObj.db85102dWorkFields = new Db85102dWorkFields();
        cloneObj.db85102dWorkFields.set(db85102dWorkFields.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.tipapmaLayout800 = new TipapmaLayout800();
        cloneObj.tipapmaLayout800.set(tipapmaLayout800.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Parms1000 parms1000 = Ip343690Ctx.this.getParms1000();


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
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
     public class BeginProcessInCtx implements Cloneable {
     Work work = Ip343690Ctx.this.getWork();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip343690Ctx.this.getIp60001EventLogWorkArea();

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
	/**
	 *	Returns the value of pgmIp343690300
	 *	@return pgmIp343690300
	 */
   public char[] getPgmIp343690300() throws CFException  {              
   		return constants300.getPgmIp343690Group300().getPgmIp343690300();
   }

  
	/**
	*  set variable pgmIp343690300
	*  @param value
	**/
   public void setPgmIp343690300(char[] value) throws CFException {
      constants300.getPgmIp343690Group300().setPgmIp343690300(value);
   } 

     /**
	 * 	Update PgmIp343690300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPgmIp343690300(char[] source, int sourceIndex) throws CFException {
      constants300.getPgmIp343690Group300().setPgmIp343690300(source, sourceIndex);
   	
   }
   
   public void setPgmIp343690300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      constants300.getPgmIp343690Group300().setPgmIp343690300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PgmIp343690300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp343690300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.getPgmIp343690Group300().setPgmIp343690300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PgmIp343690300 with another Field
	 *	@param value
	 */
   public void setPgmIp343690300(Field source) {
      constants300.getPgmIp343690Group300().setPgmIp343690300(source);
   }  
   
     /**
	 * 	Update PgmIp343690300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPgmIp343690300(Field source, int sourceIndex,int sourceLen) {
      constants300.getPgmIp343690Group300().setPgmIp343690300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PgmIp343690300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp343690300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.getPgmIp343690Group300().setPgmIp343690300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }

        public BeginProcessOutCtx getBeginProcessOutCtx() {
            return new BeginProcessOutCtx();
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
        str += constants300.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public BeginProcessInCtx clone() {
        BeginProcessInCtx cloneObj = new BeginProcessInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public BeginProcessInCtx getBeginProcessInCtx() {
            return new BeginProcessInCtx();
    }
     public class BeginProcessOutCtx implements Cloneable {
     Work work = Ip343690Ctx.this.getWork();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip343690Ctx.this.getIp60001EventLogWorkArea();

	/**
	 *	Returns the value of pgmIp343690300
	 *	@return pgmIp343690300
	 */
   public char[] getPgmIp343690300() throws CFException  {              
   		return constants300.getPgmIp343690Group300().getPgmIp343690300();
   }

  
	/**
	*  set variable pgmIp343690300
	*  @param value
	**/
   public void setPgmIp343690300(char[] value) throws CFException {
      constants300.getPgmIp343690Group300().setPgmIp343690300(value);
   } 

     /**
	 * 	Update PgmIp343690300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPgmIp343690300(char[] source, int sourceIndex) throws CFException {
      constants300.getPgmIp343690Group300().setPgmIp343690300(source, sourceIndex);
   	
   }
   
   public void setPgmIp343690300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      constants300.getPgmIp343690Group300().setPgmIp343690300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PgmIp343690300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp343690300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.getPgmIp343690Group300().setPgmIp343690300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PgmIp343690300 with another Field
	 *	@param value
	 */
   public void setPgmIp343690300(Field source) {
      constants300.getPgmIp343690Group300().setPgmIp343690300(source);
   }  
   
     /**
	 * 	Update PgmIp343690300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPgmIp343690300(Field source, int sourceIndex,int sourceLen) {
      constants300.getPgmIp343690Group300().setPgmIp343690300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PgmIp343690300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp343690300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.getPgmIp343690Group300().setPgmIp343690300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

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
	/**
	 *	Returns the value of isItSqlError100
	 *	@return isItSqlError100
	 */
   public char[] getIsItSqlError100() throws CFException  {              
   		return work.getIsItSqlError100();
   }

  
	/**
	*  set variable isItSqlError100
	*  @param value
	**/
   public void setIsItSqlError100(char[] value) throws CFException {
      work.setIsItSqlError100(value);
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


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
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
        str += constants300.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public BeginProcessOutCtx clone() {
        BeginProcessOutCtx cloneObj = new BeginProcessOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public BeginProcessOutCtx getBeginProcessOutCtx() {
            return new BeginProcessOutCtx();
    }
     public class DisplayExecMsgsInCtx implements Cloneable {
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = Ip343690Ctx.this.getIp996011ProgramStartMessage();
     Work work = Ip343690Ctx.this.getWork();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();

	/**
	 *	Returns the value of pgmIp343690300
	 *	@return pgmIp343690300
	 */
   public char[] getPgmIp343690300() throws CFException  {              
   		return constants300.getPgmIp343690Group300().getPgmIp343690300();
   }

  
	/**
	*  set variable pgmIp343690300
	*  @param value
	**/
   public void setPgmIp343690300(char[] value) throws CFException {
      constants300.getPgmIp343690Group300().setPgmIp343690300(value);
   } 

     /**
	 * 	Update PgmIp343690300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPgmIp343690300(char[] source, int sourceIndex) throws CFException {
      constants300.getPgmIp343690Group300().setPgmIp343690300(source, sourceIndex);
   	
   }
   
   public void setPgmIp343690300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      constants300.getPgmIp343690Group300().setPgmIp343690300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PgmIp343690300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp343690300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.getPgmIp343690Group300().setPgmIp343690300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PgmIp343690300 with another Field
	 *	@param value
	 */
   public void setPgmIp343690300(Field source) {
      constants300.getPgmIp343690Group300().setPgmIp343690300(source);
   }  
   
     /**
	 * 	Update PgmIp343690300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPgmIp343690300(Field source, int sourceIndex,int sourceLen) {
      constants300.getPgmIp343690Group300().setPgmIp343690300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PgmIp343690300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp343690300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.getPgmIp343690Group300().setPgmIp343690300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pgmVersion300
	 *	@return pgmVersion300
	 */
   public char[] getPgmVersion300() throws CFException  {              
   		return constants300.getPgmVersion300();
   }

  
	/**
	*  set variable pgmVersion300
	*  @param value
	**/
   public void setPgmVersion300(char[] value) throws CFException {
      constants300.setPgmVersion300(value);
   } 

     /**
	 * 	Update PgmVersion300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPgmVersion300(char[] source, int sourceIndex) throws CFException {
      constants300.setPgmVersion300(source, sourceIndex);
   	
   }
   
   public void setPgmVersion300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      constants300.setPgmVersion300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PgmVersion300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmVersion300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setPgmVersion300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PgmVersion300 with another Field
	 *	@param value
	 */
   public void setPgmVersion300(Field source) {
      constants300.setPgmVersion300(source);
   }  
   
     /**
	 * 	Update PgmVersion300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPgmVersion300(Field source, int sourceIndex,int sourceLen) {
      constants300.setPgmVersion300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PgmVersion300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmVersion300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setPgmVersion300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pgmIp996010300
	 *	@return pgmIp996010300
	 */
   public char[] getPgmIp996010300() throws CFException  {              
   		return constants300.getPgmIp996010300();
   }

  
	/**
	*  set variable pgmIp996010300
	*  @param value
	**/
   public void setPgmIp996010300(char[] value) throws CFException {
      constants300.setPgmIp996010300(value);
   } 

     /**
	 * 	Update PgmIp996010300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPgmIp996010300(char[] source, int sourceIndex) throws CFException {
      constants300.setPgmIp996010300(source, sourceIndex);
   	
   }
   
   public void setPgmIp996010300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      constants300.setPgmIp996010300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PgmIp996010300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp996010300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setPgmIp996010300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PgmIp996010300 with another Field
	 *	@param value
	 */
   public void setPgmIp996010300(Field source) {
      constants300.setPgmIp996010300(source);
   }  
   
     /**
	 * 	Update PgmIp996010300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPgmIp996010300(Field source, int sourceIndex,int sourceLen) {
      constants300.setPgmIp996010300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PgmIp996010300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp996010300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setPgmIp996010300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
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
        str += constants300.hashCode();
       return str.hashCode();
    }

    public DisplayExecMsgsInCtx clone() {
        DisplayExecMsgsInCtx cloneObj = new DisplayExecMsgsInCtx();
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        return cloneObj;
    }

    }

    public DisplayExecMsgsInCtx getDisplayExecMsgsInCtx() {
            return new DisplayExecMsgsInCtx();
    }
     public class DisplayExecMsgsOutCtx implements Cloneable {
     Ip996011ProgramStartMessage ip996011ProgramStartMessage = Ip343690Ctx.this.getIp996011ProgramStartMessage();
     Work work = Ip343690Ctx.this.getWork();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();

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
	 *	Returns the value of pgmIp343690300
	 *	@return pgmIp343690300
	 */
   public char[] getPgmIp343690300() throws CFException  {              
   		return constants300.getPgmIp343690Group300().getPgmIp343690300();
   }

  
	/**
	*  set variable pgmIp343690300
	*  @param value
	**/
   public void setPgmIp343690300(char[] value) throws CFException {
      constants300.getPgmIp343690Group300().setPgmIp343690300(value);
   } 

     /**
	 * 	Update PgmIp343690300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPgmIp343690300(char[] source, int sourceIndex) throws CFException {
      constants300.getPgmIp343690Group300().setPgmIp343690300(source, sourceIndex);
   	
   }
   
   public void setPgmIp343690300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      constants300.getPgmIp343690Group300().setPgmIp343690300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PgmIp343690300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp343690300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.getPgmIp343690Group300().setPgmIp343690300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PgmIp343690300 with another Field
	 *	@param value
	 */
   public void setPgmIp343690300(Field source) {
      constants300.getPgmIp343690Group300().setPgmIp343690300(source);
   }  
   
     /**
	 * 	Update PgmIp343690300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPgmIp343690300(Field source, int sourceIndex,int sourceLen) {
      constants300.getPgmIp343690Group300().setPgmIp343690300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PgmIp343690300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp343690300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.getPgmIp343690Group300().setPgmIp343690300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pgmVersion300
	 *	@return pgmVersion300
	 */
   public char[] getPgmVersion300() throws CFException  {              
   		return constants300.getPgmVersion300();
   }

  
	/**
	*  set variable pgmVersion300
	*  @param value
	**/
   public void setPgmVersion300(char[] value) throws CFException {
      constants300.setPgmVersion300(value);
   } 

     /**
	 * 	Update PgmVersion300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPgmVersion300(char[] source, int sourceIndex) throws CFException {
      constants300.setPgmVersion300(source, sourceIndex);
   	
   }
   
   public void setPgmVersion300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      constants300.setPgmVersion300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PgmVersion300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmVersion300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setPgmVersion300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PgmVersion300 with another Field
	 *	@param value
	 */
   public void setPgmVersion300(Field source) {
      constants300.setPgmVersion300(source);
   }  
   
     /**
	 * 	Update PgmVersion300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPgmVersion300(Field source, int sourceIndex,int sourceLen) {
      constants300.setPgmVersion300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PgmVersion300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmVersion300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setPgmVersion300(source, sourceIndex, sourceLen, targetIndex, targetLen);
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


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
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
        str += constants300.hashCode();
       return str.hashCode();
    }

    public DisplayExecMsgsOutCtx clone() {
        DisplayExecMsgsOutCtx cloneObj = new DisplayExecMsgsOutCtx();
        cloneObj.ip996011ProgramStartMessage = new Ip996011ProgramStartMessage();
        cloneObj.ip996011ProgramStartMessage.set(ip996011ProgramStartMessage.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        return cloneObj;
    }

    }

    public DisplayExecMsgsOutCtx getDisplayExecMsgsOutCtx() {
            return new DisplayExecMsgsOutCtx();
    }
     public class SetProcedurePointersInCtx implements Cloneable {
     Work work = Ip343690Ctx.this.getWork();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();

	/**
	 *	Returns the value of pgmIp280010300
	 *	@return pgmIp280010300
	 */
   public char[] getPgmIp280010300() throws CFException  {              
   		return constants300.getPgmIp280010300();
   }

  
	/**
	*  set variable pgmIp280010300
	*  @param value
	**/
   public void setPgmIp280010300(char[] value) throws CFException {
      constants300.setPgmIp280010300(value);
   } 

     /**
	 * 	Update PgmIp280010300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPgmIp280010300(char[] source, int sourceIndex) throws CFException {
      constants300.setPgmIp280010300(source, sourceIndex);
   	
   }
   
   public void setPgmIp280010300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      constants300.setPgmIp280010300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PgmIp280010300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp280010300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setPgmIp280010300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PgmIp280010300 with another Field
	 *	@param value
	 */
   public void setPgmIp280010300(Field source) {
      constants300.setPgmIp280010300(source);
   }  
   
     /**
	 * 	Update PgmIp280010300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPgmIp280010300(Field source, int sourceIndex,int sourceLen) {
      constants300.setPgmIp280010300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PgmIp280010300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp280010300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setPgmIp280010300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pgmIp081110300
	 *	@return pgmIp081110300
	 */
   public char[] getPgmIp081110300() throws CFException  {              
   		return constants300.getPgmIp081110300();
   }

  
	/**
	*  set variable pgmIp081110300
	*  @param value
	**/
   public void setPgmIp081110300(char[] value) throws CFException {
      constants300.setPgmIp081110300(value);
   } 

     /**
	 * 	Update PgmIp081110300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPgmIp081110300(char[] source, int sourceIndex) throws CFException {
      constants300.setPgmIp081110300(source, sourceIndex);
   	
   }
   
   public void setPgmIp081110300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      constants300.setPgmIp081110300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PgmIp081110300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp081110300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setPgmIp081110300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PgmIp081110300 with another Field
	 *	@param value
	 */
   public void setPgmIp081110300(Field source) {
      constants300.setPgmIp081110300(source);
   }  
   
     /**
	 * 	Update PgmIp081110300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPgmIp081110300(Field source, int sourceIndex,int sourceLen) {
      constants300.setPgmIp081110300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PgmIp081110300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp081110300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setPgmIp081110300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pgmIp599810300
	 *	@return pgmIp599810300
	 */
   public char[] getPgmIp599810300() throws CFException  {              
   		return constants300.getPgmIp599810300();
   }

  
	/**
	*  set variable pgmIp599810300
	*  @param value
	**/
   public void setPgmIp599810300(char[] value) throws CFException {
      constants300.setPgmIp599810300(value);
   } 

     /**
	 * 	Update PgmIp599810300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPgmIp599810300(char[] source, int sourceIndex) throws CFException {
      constants300.setPgmIp599810300(source, sourceIndex);
   	
   }
   
   public void setPgmIp599810300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      constants300.setPgmIp599810300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PgmIp599810300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp599810300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setPgmIp599810300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PgmIp599810300 with another Field
	 *	@param value
	 */
   public void setPgmIp599810300(Field source) {
      constants300.setPgmIp599810300(source);
   }  
   
     /**
	 * 	Update PgmIp599810300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPgmIp599810300(Field source, int sourceIndex,int sourceLen) {
      constants300.setPgmIp599810300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PgmIp599810300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp599810300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setPgmIp599810300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pgmIp610010300
	 *	@return pgmIp610010300
	 */
   public char[] getPgmIp610010300() throws CFException  {              
   		return constants300.getPgmIp610010300();
   }

  
	/**
	*  set variable pgmIp610010300
	*  @param value
	**/
   public void setPgmIp610010300(char[] value) throws CFException {
      constants300.setPgmIp610010300(value);
   } 

     /**
	 * 	Update PgmIp610010300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPgmIp610010300(char[] source, int sourceIndex) throws CFException {
      constants300.setPgmIp610010300(source, sourceIndex);
   	
   }
   
   public void setPgmIp610010300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      constants300.setPgmIp610010300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PgmIp610010300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp610010300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setPgmIp610010300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PgmIp610010300 with another Field
	 *	@param value
	 */
   public void setPgmIp610010300(Field source) {
      constants300.setPgmIp610010300(source);
   }  
   
     /**
	 * 	Update PgmIp610010300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPgmIp610010300(Field source, int sourceIndex,int sourceLen) {
      constants300.setPgmIp610010300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PgmIp610010300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp610010300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setPgmIp610010300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pgmMcwait300
	 *	@return pgmMcwait300
	 */
   public char[] getPgmMcwait300() throws CFException  {              
   		return constants300.getPgmMcwait300();
   }

  
	/**
	*  set variable pgmMcwait300
	*  @param value
	**/
   public void setPgmMcwait300(char[] value) throws CFException {
      constants300.setPgmMcwait300(value);
   } 

     /**
	 * 	Update PgmMcwait300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPgmMcwait300(char[] source, int sourceIndex) throws CFException {
      constants300.setPgmMcwait300(source, sourceIndex);
   	
   }
   
   public void setPgmMcwait300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      constants300.setPgmMcwait300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PgmMcwait300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmMcwait300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setPgmMcwait300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PgmMcwait300 with another Field
	 *	@param value
	 */
   public void setPgmMcwait300(Field source) {
      constants300.setPgmMcwait300(source);
   }  
   
     /**
	 * 	Update PgmMcwait300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPgmMcwait300(Field source, int sourceIndex,int sourceLen) {
      constants300.setPgmMcwait300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PgmMcwait300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmMcwait300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setPgmMcwait300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
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
        str += constants300.hashCode();
       return str.hashCode();
    }

    public SetProcedurePointersInCtx clone() {
        SetProcedurePointersInCtx cloneObj = new SetProcedurePointersInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        return cloneObj;
    }

    }

    public SetProcedurePointersInCtx getSetProcedurePointersInCtx() {
            return new SetProcedurePointersInCtx();
    }
     public class SetProcedurePointersOutCtx implements Cloneable {
     Work work = Ip343690Ctx.this.getWork();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();

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
	 *	Returns the value of ptrMcwait800
	 *	@return ptrMcwait800
	 */
   public char[] getPtrMcwait800() throws CFException  {              
   		return work.getPtrMcwait800();
   }

  
	/**
	*  set variable ptrMcwait800
	*  @param value
	**/
   public void setPtrMcwait800(char[] value) throws CFException {
      work.setPtrMcwait800(value);
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


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
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
        str += constants300.hashCode();
       return str.hashCode();
    }

    public SetProcedurePointersOutCtx clone() {
        SetProcedurePointersOutCtx cloneObj = new SetProcedurePointersOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        return cloneObj;
    }

    }

    public SetProcedurePointersOutCtx getSetProcedurePointersOutCtx() {
            return new SetProcedurePointersOutCtx();
    }
     public class ProcessRuncntlFileInCtx implements Cloneable {
     Work work = Ip343690Ctx.this.getWork();
     Ip50005ClearingDtTm ip50005ClearingDtTm = Ip343690Ctx.this.getIp50005ClearingDtTm();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();
     Ip08101RunControlRecord ip08101RunControlRecord = Ip343690Ctx.this.getIp08101RunControlRecord();

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
	 *	Returns the value of value14300
	 *	@return value14300
	 */
	public int getValue14300() throws CFException {
   		return constants300.getValue14300();
	}


	/**
	 *	Returns String value of value14300
	 *	@return value14300
	 */
	public char[]  getValue14300String() throws CFException {
	     return String.valueOf(constants300.getValue14300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value14300IsNumeric()  throws CFException{
	    return constants300.value14300IsNumeric();
	}

	/**
	 * 	Update Value14300 with the passed value
	 *	@param number
	 */
	public void setValue14300(int number)  throws CFException{
		constants300.setValue14300(number);
	}
	

	public void setValue14300(long number)  throws CFException{
	    constants300.setValue14300(number);
	}
	
	
	/**
	 * 	Update Value14300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue14300(char[] value)  throws CFException {
		constants300.setValue14300(value);
	}
	
	/**
	 * 	Update Value14300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue14300String(char[] value)  throws CFException{
		constants300.setValue14300(value);
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
	 *	Returns the value of ip08101RunControlRecord
	 *	@return ip08101RunControlRecord
	 */   
	 public Ip08101RunControlRecord getIp08101RunControlRecord() {
   	return ip08101RunControlRecord;
   }



        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
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
        str += work.hashCode();
        str += ip50005ClearingDtTm.hashCode();
        str += constants300.hashCode();
        str += ip08101RunControlRecord.hashCode();
       return str.hashCode();
    }

    public ProcessRuncntlFileInCtx clone() {
        ProcessRuncntlFileInCtx cloneObj = new ProcessRuncntlFileInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50005ClearingDtTm = new Ip50005ClearingDtTm();
        cloneObj.ip50005ClearingDtTm.set(ip50005ClearingDtTm.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.ip08101RunControlRecord = new Ip08101RunControlRecord();
        cloneObj.ip08101RunControlRecord.set(ip08101RunControlRecord.getClonedField());
        return cloneObj;
    }

    }

    public ProcessRuncntlFileInCtx getProcessRuncntlFileInCtx() {
            return new ProcessRuncntlFileInCtx();
    }
     public class ProcessRuncntlFileOutCtx implements Cloneable {
     Work work = Ip343690Ctx.this.getWork();
     Ip50005ClearingDtTm ip50005ClearingDtTm = Ip343690Ctx.this.getIp50005ClearingDtTm();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();
     Ip08101RunControlRecord ip08101RunControlRecord = Ip343690Ctx.this.getIp08101RunControlRecord();

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
	 *	Returns the value of value14300
	 *	@return value14300
	 */
	public int getValue14300() throws CFException {
   		return constants300.getValue14300();
	}


	/**
	 *	Returns String value of value14300
	 *	@return value14300
	 */
	public char[]  getValue14300String() throws CFException {
	     return String.valueOf(constants300.getValue14300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value14300IsNumeric()  throws CFException{
	    return constants300.value14300IsNumeric();
	}

	/**
	 * 	Update Value14300 with the passed value
	 *	@param number
	 */
	public void setValue14300(int number)  throws CFException{
		constants300.setValue14300(number);
	}
	

	public void setValue14300(long number)  throws CFException{
	    constants300.setValue14300(number);
	}
	
	
	/**
	 * 	Update Value14300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue14300(char[] value)  throws CFException {
		constants300.setValue14300(value);
	}
	
	/**
	 * 	Update Value14300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue14300String(char[] value)  throws CFException{
		constants300.setValue14300(value);
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
	 *	Returns the value of ip50005ClearingDtTm
	 *	@return ip50005ClearingDtTm
	 */   
	 public Ip50005ClearingDtTm getIp50005ClearingDtTm() {
   	return ip50005ClearingDtTm;
   }



        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
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
        str += ip50005ClearingDtTm.hashCode();
        str += constants300.hashCode();
        str += ip08101RunControlRecord.hashCode();
       return str.hashCode();
    }

    public ProcessRuncntlFileOutCtx clone() {
        ProcessRuncntlFileOutCtx cloneObj = new ProcessRuncntlFileOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50005ClearingDtTm = new Ip50005ClearingDtTm();
        cloneObj.ip50005ClearingDtTm.set(ip50005ClearingDtTm.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.ip08101RunControlRecord = new Ip08101RunControlRecord();
        cloneObj.ip08101RunControlRecord.set(ip08101RunControlRecord.getClonedField());
        return cloneObj;
    }

    }

    public ProcessRuncntlFileOutCtx getProcessRuncntlFileOutCtx() {
            return new ProcessRuncntlFileOutCtx();
    }
     public class OpenInputSys001InCtx implements Cloneable {
     Sys001ErrMsgTxt600 sys001ErrMsgTxt600 = Ip343690Ctx.this.getSys001ErrMsgTxt600();
     AbendMessage900 abendMessage900 = Ip343690Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip343690Ctx.this.getAbendParaName900();
     Sys001InputPmaUnldRec sys001InputPmaUnldRec = Ip343690Ctx.this.getSys001InputPmaUnldRec();
     Work work = Ip343690Ctx.this.getWork();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();
     Db85102dWorkFields db85102dWorkFields = Ip343690Ctx.this.getDb85102dWorkFields();

	/**
	 *	Returns the value of sys001ErrMsgTxt600
	 *	@return sys001ErrMsgTxt600
	 */   
	 public Sys001ErrMsgTxt600 getSys001ErrMsgTxt600() {
   	return sys001ErrMsgTxt600;
   }


	/**
	 *	Returns the value of sys001OpAbendCode300
	 *	@return sys001OpAbendCode300
	 */
   public char[] getSys001OpAbendCode300() throws CFException  {              
   		return constants300.getSys001OpAbendCode300();
   }

  
	/**
	*  set variable sys001OpAbendCode300
	*  @param value
	**/
   public void setSys001OpAbendCode300(char[] value) throws CFException {
      constants300.setSys001OpAbendCode300(value);
   } 

     /**
	 * 	Update Sys001OpAbendCode300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001OpAbendCode300(char[] source, int sourceIndex) throws CFException {
      constants300.setSys001OpAbendCode300(source, sourceIndex);
   	
   }
   
   public void setSys001OpAbendCode300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      constants300.setSys001OpAbendCode300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001OpAbendCode300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001OpAbendCode300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setSys001OpAbendCode300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001OpAbendCode300 with another Field
	 *	@param value
	 */
   public void setSys001OpAbendCode300(Field source) {
      constants300.setSys001OpAbendCode300(source);
   }  
   
     /**
	 * 	Update Sys001OpAbendCode300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001OpAbendCode300(Field source, int sourceIndex,int sourceLen) {
      constants300.setSys001OpAbendCode300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001OpAbendCode300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001OpAbendCode300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setSys001OpAbendCode300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys001InputPmaUnldRec
	 *	@return sys001InputPmaUnldRec
	 */   
	 public Sys001InputPmaUnldRec getSys001InputPmaUnldRec() {
   	return sys001InputPmaUnldRec;
   }


	/**
	 *	Returns the value of para1400300
	 *	@return para1400300
	 */
   public char[] getPara1400300() throws CFException  {              
   		return work.getPara1400300();
   }

  
	/**
	*  set variable para1400300
	*  @param value
	**/
   public void setPara1400300(char[] value) throws CFException {
      work.setPara1400300(value);
   } 


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
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
        str += sys001ErrMsgTxt600.hashCode();
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += sys001InputPmaUnldRec.hashCode();
        str += work.hashCode();
        str += constants300.hashCode();
        str += db85102dWorkFields.hashCode();
       return str.hashCode();
    }

    public OpenInputSys001InCtx clone() {
        OpenInputSys001InCtx cloneObj = new OpenInputSys001InCtx();
        cloneObj.sys001ErrMsgTxt600 = new Sys001ErrMsgTxt600();
        cloneObj.sys001ErrMsgTxt600.set(sys001ErrMsgTxt600.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.sys001InputPmaUnldRec = new Sys001InputPmaUnldRec();
        cloneObj.sys001InputPmaUnldRec.set(sys001InputPmaUnldRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.db85102dWorkFields = new Db85102dWorkFields();
        cloneObj.db85102dWorkFields.set(db85102dWorkFields.getClonedField());
        return cloneObj;
    }

    }

    public OpenInputSys001InCtx getOpenInputSys001InCtx() {
            return new OpenInputSys001InCtx();
    }
     public class OpenInputSys001OutCtx implements Cloneable {
     Sys001ErrMsgTxt600 sys001ErrMsgTxt600 = Ip343690Ctx.this.getSys001ErrMsgTxt600();
     AbendMessage900 abendMessage900 = Ip343690Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip343690Ctx.this.getAbendParaName900();
     Sys001InputPmaUnldRec sys001InputPmaUnldRec = Ip343690Ctx.this.getSys001InputPmaUnldRec();
     Work work = Ip343690Ctx.this.getWork();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();
     Db85102dWorkFields db85102dWorkFields = Ip343690Ctx.this.getDb85102dWorkFields();

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
	 *	Returns the value of db85102dDb2cloneStatus
	 *	@return db85102dDb2cloneStatus
	 */
   public char[] getDb85102dDb2cloneStatus() throws CFException  {              
   		return db85102dWorkFields.getDb85102dDb2cloneStatus();
   }

  
	/**
	*  set variable db85102dDb2cloneStatus
	*  @param value
	**/
   public void setDb85102dDb2cloneStatus(char[] value) throws CFException {
      db85102dWorkFields.setDb85102dDb2cloneStatus(value);
   } 

     /**
	 * 	Update Db85102dDb2cloneStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb85102dDb2cloneStatus(char[] source, int sourceIndex) throws CFException {
      db85102dWorkFields.setDb85102dDb2cloneStatus(source, sourceIndex);
   	
   }
   
   public void setDb85102dDb2cloneStatus(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      db85102dWorkFields.setDb85102dDb2cloneStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Db85102dDb2cloneStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dDb2cloneStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dWorkFields.setDb85102dDb2cloneStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Db85102dDb2cloneStatus with another Field
	 *	@param value
	 */
   public void setDb85102dDb2cloneStatus(Field source) {
      db85102dWorkFields.setDb85102dDb2cloneStatus(source);
   }  
   
     /**
	 * 	Update Db85102dDb2cloneStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb85102dDb2cloneStatus(Field source, int sourceIndex,int sourceLen) {
      db85102dWorkFields.setDb85102dDb2cloneStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Db85102dDb2cloneStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dDb2cloneStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dWorkFields.setDb85102dDb2cloneStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys001ErrMsgTxt600
	 *	@return sys001ErrMsgTxt600
	 */   
	 public Sys001ErrMsgTxt600 getSys001ErrMsgTxt600() {
   	return sys001ErrMsgTxt600;
   }


	/**
	 *	Returns the value of sys001OpAbendCode300
	 *	@return sys001OpAbendCode300
	 */
   public char[] getSys001OpAbendCode300() throws CFException  {              
   		return constants300.getSys001OpAbendCode300();
   }

  
	/**
	*  set variable sys001OpAbendCode300
	*  @param value
	**/
   public void setSys001OpAbendCode300(char[] value) throws CFException {
      constants300.setSys001OpAbendCode300(value);
   } 

     /**
	 * 	Update Sys001OpAbendCode300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001OpAbendCode300(char[] source, int sourceIndex) throws CFException {
      constants300.setSys001OpAbendCode300(source, sourceIndex);
   	
   }
   
   public void setSys001OpAbendCode300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      constants300.setSys001OpAbendCode300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001OpAbendCode300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001OpAbendCode300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setSys001OpAbendCode300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001OpAbendCode300 with another Field
	 *	@param value
	 */
   public void setSys001OpAbendCode300(Field source) {
      constants300.setSys001OpAbendCode300(source);
   }  
   
     /**
	 * 	Update Sys001OpAbendCode300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001OpAbendCode300(Field source, int sourceIndex,int sourceLen) {
      constants300.setSys001OpAbendCode300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001OpAbendCode300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001OpAbendCode300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setSys001OpAbendCode300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "00" for isSys001StatusGood88200()
	 *	@return  Returns true if isSys001StatusGood88200() is "00"
	 */
   public boolean isSys001StatusGood88200() throws CFException {
      return work.isSys001StatusGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys001StatusGood88200True()  throws CFException{  			
    	work.setSys001StatusGood88200True();
   	}
	/**
	 *	Test condition "ERROR OPENING INPUT SYS001  " for isSys001OpenErrTxt88600()
	 *	@return  Returns true if isSys001OpenErrTxt88600() is "ERROR OPENING INPUT SYS001  "
	 */
   public boolean isSys001OpenErrTxt88600() throws CFException {
      return sys001ErrMsgTxt600.isSys001OpenErrTxt88600();
   }

	/**
	*  set values "ERROR OPENING INPUT SYS001  "
	*/
   	public void setSys001OpenErrTxt88600True()  throws CFException{  			
    	sys001ErrMsgTxt600.setSys001OpenErrTxt88600True();
   	}
	/**
	 *	Returns the value of sys001Status600
	 *	@return sys001Status600
	 */
   public char[] getSys001Status600() throws CFException  {              
   		return sys001ErrMsgTxt600.getSys001Status600();
   }

  
	/**
	*  set variable sys001Status600
	*  @param value
	**/
   public void setSys001Status600(char[] value) throws CFException {
      sys001ErrMsgTxt600.setSys001Status600(value);
   } 

     /**
	 * 	Update Sys001Status600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001Status600(char[] source, int sourceIndex) throws CFException {
      sys001ErrMsgTxt600.setSys001Status600(source, sourceIndex);
   	
   }
   
   public void setSys001Status600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001ErrMsgTxt600.setSys001Status600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001Status600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001Status600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001ErrMsgTxt600.setSys001Status600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001Status600 with another Field
	 *	@param value
	 */
   public void setSys001Status600(Field source) {
      sys001ErrMsgTxt600.setSys001Status600(source);
   }  
   
     /**
	 * 	Update Sys001Status600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001Status600(Field source, int sourceIndex,int sourceLen) {
      sys001ErrMsgTxt600.setSys001Status600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001Status600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001Status600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001ErrMsgTxt600.setSys001Status600(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of para1400300
	 *	@return para1400300
	 */
   public char[] getPara1400300() throws CFException  {              
   		return work.getPara1400300();
   }

  
	/**
	*  set variable para1400300
	*  @param value
	**/
   public void setPara1400300(char[] value) throws CFException {
      work.setPara1400300(value);
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


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001ErrMsgTxt600.hashCode();
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += sys001InputPmaUnldRec.hashCode();
        str += work.hashCode();
        str += constants300.hashCode();
        str += db85102dWorkFields.hashCode();
       return str.hashCode();
    }

    public OpenInputSys001OutCtx clone() {
        OpenInputSys001OutCtx cloneObj = new OpenInputSys001OutCtx();
        cloneObj.sys001ErrMsgTxt600 = new Sys001ErrMsgTxt600();
        cloneObj.sys001ErrMsgTxt600.set(sys001ErrMsgTxt600.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.sys001InputPmaUnldRec = new Sys001InputPmaUnldRec();
        cloneObj.sys001InputPmaUnldRec.set(sys001InputPmaUnldRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.db85102dWorkFields = new Db85102dWorkFields();
        cloneObj.db85102dWorkFields.set(db85102dWorkFields.getClonedField());
        return cloneObj;
    }

    }

    public OpenInputSys001OutCtx getOpenInputSys001OutCtx() {
            return new OpenInputSys001OutCtx();
    }
     public class ConnectToDb2InCtx implements Cloneable {
     Db2Workarea800 db2Workarea800 = Ip343690Ctx.this.getDb2Workarea800();
     AbendParaName900 abendParaName900 = Ip343690Ctx.this.getAbendParaName900();
     AbendMessage900 abendMessage900 = Ip343690Ctx.this.getAbendMessage900();
     Work work = Ip343690Ctx.this.getWork();
     ApiLayout apiLayout = Ip343690Ctx.this.getApiLayout();

	/**
	 *	Test condition "Y" for isItIsAbend88100()
	 *	@return  Returns true if isItIsAbend88100() is "Y"
	 */
   public boolean isItIsAbend88100() throws CFException {
      return apiLayout.isItIsAbend88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsAbend88100True()  throws CFException{  			
    	apiLayout.setItIsAbend88100True();
   	}

        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }

        public ConnectToDb2OutCtx getConnectToDb2OutCtx() {
            return new ConnectToDb2OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += db2Workarea800.hashCode();
        str += abendParaName900.hashCode();
        str += abendMessage900.hashCode();
        str += work.hashCode();
        str += apiLayout.hashCode();
       return str.hashCode();
    }

    public ConnectToDb2InCtx clone() {
        ConnectToDb2InCtx cloneObj = new ConnectToDb2InCtx();
        cloneObj.db2Workarea800 = new Db2Workarea800();
        cloneObj.db2Workarea800.set(db2Workarea800.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.apiLayout = new ApiLayout();
        cloneObj.apiLayout.set(apiLayout.getClonedField());
        return cloneObj;
    }

    }

    public ConnectToDb2InCtx getConnectToDb2InCtx() {
            return new ConnectToDb2InCtx();
    }
     public class ConnectToDb2OutCtx implements Cloneable {
     Db2Workarea800 db2Workarea800 = Ip343690Ctx.this.getDb2Workarea800();
     AbendParaName900 abendParaName900 = Ip343690Ctx.this.getAbendParaName900();
     AbendMessage900 abendMessage900 = Ip343690Ctx.this.getAbendMessage900();
     Work work = Ip343690Ctx.this.getWork();
     ApiLayout apiLayout = Ip343690Ctx.this.getApiLayout();

	/**
	 *	Test condition "2000-CONNECT-TO-DB2       " for isDb2Abend2000Para88300()
	 *	@return  Returns true if isDb2Abend2000Para88300() is "2000-CONNECT-TO-DB2       "
	 */
   public boolean isDb2Abend2000Para88300() throws CFException {
      return work.isDb2Abend2000Para88300();
   }

	/**
	*  set values "2000-CONNECT-TO-DB2       "
	*/
   	public void setDb2Abend2000Para88300True()  throws CFException{  			
    	work.setDb2Abend2000Para88300True();
   	}
	/**
	 *	Test condition "B" for isNegativeCode88100()
	 *	@return  Returns true if isNegativeCode88100() is "B"
	 */
   public boolean isNegativeCode88100() throws CFException {
      return apiLayout.isNegativeCode88100();
   }

	/**
	*  set values "B"
	*/
   	public void setNegativeCode88100True()  throws CFException{  			
    	apiLayout.setNegativeCode88100True();
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
	 *	Returns the value of abendCode800
	 *	@return abendCode800
	 */   
	 public AbendCode800 getAbendCode800() {
   	return db2Workarea800.getAbendCode800();
   }

   /**
	* 	Update AbendCode800 with the passed value
	*	@param value
	*/
   public void setAbendCode800(char[] value) throws CFException {
      db2Workarea800.setAbendCode800(value);
   }   

     /**
	 * 	Update AbendCode800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAbendCode800(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	db2Workarea800.setAbendCode800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	db2Workarea800.setAbendCode800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode800 with another Field
	 *	@param value
	 */
   public void setAbendCode800(Field source) {
   	db2Workarea800.setAbendCode800(source);
   }  
   
     /**
	 * 	Update AbendCode800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAbendCode800(Field source, int sourceIndex,int sourceLen) {
   	db2Workarea800.setAbendCode800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	db2Workarea800.setAbendCode800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendMessage600
	 *	@return abendMessage600
	 */
   public char[] getAbendMessage600() throws CFException  {              
   		return work.getAbendMessage600();
   }

  
	/**
	*  set variable abendMessage600
	*  @param value
	**/
   public void setAbendMessage600(char[] value) throws CFException {
      work.setAbendMessage600(value);
   } 

	/**
	 *	Test condition "ERROR IN CONNECTING TO DB2" for isAbendDb2ConnError88600()
	 *	@return  Returns true if isAbendDb2ConnError88600() is "ERROR IN CONNECTING TO DB2"
	 */
   public boolean isAbendDb2ConnError88600() throws CFException {
      return work.isAbendDb2ConnError88600();
   }

	/**
	*  set values "ERROR IN CONNECTING TO DB2"
	*/
   	public void setAbendDb2ConnError88600True()  throws CFException{  			
    	work.setAbendDb2ConnError88600True();
   	}
	/**
	 *	Returns the value of abendPara300
	 *	@return abendPara300
	 */
   public char[] getAbendPara300() throws CFException  {              
   		return work.getAbendPara300();
   }

  
	/**
	*  set variable abendPara300
	*  @param value
	**/
   public void setAbendPara300(char[] value) throws CFException {
      work.setAbendPara300(value);
   } 

	/**
	 *	Test condition "3014" for isDb2UnsucessConnect88300()
	 *	@return  Returns true if isDb2UnsucessConnect88300() is "3014"
	 */
   public boolean isDb2UnsucessConnect88300() throws CFException {
      return work.isDb2UnsucessConnect88300();
   }

	/**
	*  set values "3014"
	*/
   	public void setDb2UnsucessConnect88300True()  throws CFException{  			
    	work.setDb2UnsucessConnect88300True();
   	}
	/**
	 *	Test condition "Y" for isItIsSqlError88100()
	 *	@return  Returns true if isItIsSqlError88100() is "Y"
	 */
   public boolean isItIsSqlError88100() throws CFException {
      return work.isItIsSqlError88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsSqlError88100True()  throws CFException{  			
    	work.setItIsSqlError88100True();
   	}
	/**
	 *	Returns the value of abendCode300
	 *	@return abendCode300
	 */
   public char[] getAbendCode300() throws CFException  {              
   		return work.getAbendCode300();
   }

  
	/**
	*  set variable abendCode300
	*  @param value
	**/
   public void setAbendCode300(char[] value) throws CFException {
      work.setAbendCode300(value);
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


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += db2Workarea800.hashCode();
        str += abendParaName900.hashCode();
        str += abendMessage900.hashCode();
        str += work.hashCode();
        str += apiLayout.hashCode();
       return str.hashCode();
    }

    public ConnectToDb2OutCtx clone() {
        ConnectToDb2OutCtx cloneObj = new ConnectToDb2OutCtx();
        cloneObj.db2Workarea800 = new Db2Workarea800();
        cloneObj.db2Workarea800.set(db2Workarea800.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.apiLayout = new ApiLayout();
        cloneObj.apiLayout.set(apiLayout.getClonedField());
        return cloneObj;
    }

    }

    public ConnectToDb2OutCtx getConnectToDb2OutCtx() {
            return new ConnectToDb2OutCtx();
    }
     public class ProcessInputSys001InCtx implements Cloneable {
     Work work = Ip343690Ctx.this.getWork();

	/**
	 *	Test condition "10" for isSys001StatusEof88200()
	 *	@return  Returns true if isSys001StatusEof88200() is "10"
	 */
   public boolean isSys001StatusEof88200() throws CFException {
      return work.isSys001StatusEof88200();
   }

	/**
	*  set values "10"
	*/
   	public void setSys001StatusEof88200True()  throws CFException{  			
    	work.setSys001StatusEof88200True();
   	}

        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
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

    public ProcessInputSys001InCtx clone() {
        ProcessInputSys001InCtx cloneObj = new ProcessInputSys001InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInputSys001InCtx getProcessInputSys001InCtx() {
            return new ProcessInputSys001InCtx();
    }
     public class ProcessTable40LookupInCtx implements Cloneable {
     Ip00404Table ip00404Table = Ip343690Ctx.this.getIp00404Table();
     Work work = Ip343690Ctx.this.getWork();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();
     TipapmaLayout800 tipapmaLayout800 = Ip343690Ctx.this.getTipapmaLayout800();

	/**
	 *	Returns the value of value19300
	 *	@return value19300
	 */
	public int getValue19300() throws CFException {
   		return constants300.getValue19300();
	}


	/**
	 *	Returns String value of value19300
	 *	@return value19300
	 */
	public char[]  getValue19300String() throws CFException {
	     return String.valueOf(constants300.getValue19300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value19300IsNumeric()  throws CFException{
	    return constants300.value19300IsNumeric();
	}

	/**
	 * 	Update Value19300 with the passed value
	 *	@param number
	 */
	public void setValue19300(int number)  throws CFException{
		constants300.setValue19300(number);
	}
	

	public void setValue19300(long number)  throws CFException{
	    constants300.setValue19300(number);
	}
	
	
	/**
	 * 	Update Value19300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue19300(char[] value)  throws CFException {
		constants300.setValue19300(value);
	}
	
	/**
	 * 	Update Value19300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue19300String(char[] value)  throws CFException{
		constants300.setValue19300(value);
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
	 *	Returns the value of actualLen800
	 *	@return actualLen800
	 */
	public short getActualLen800() throws CFException {        
   		return work.getActualLen800();
	}
	
	/**
	 * 	Update ActualLen800 with the passed value
	 *	@param number
	 */
	public void setActualLen800(short number)  throws CFException{
		work.setActualLen800(number);
	}

	public void setActualLen800(int number)  throws CFException{
		work.setActualLen800((short)number);
	}

	public void setActualLen800(long number)  throws CFException{
		work.setActualLen800((short)number);
	}



	/**
	 *	Returns the value of value01300
	 *	@return value01300
	 */
	public short getValue01300() throws CFException {        
   		return constants300.getValue01300();
	}
	
	/**
	 * 	Update Value01300 with the passed value
	 *	@param number
	 */
	public void setValue01300(short number)  throws CFException{
		constants300.setValue01300(number);
	}

	public void setValue01300(int number)  throws CFException{
		constants300.setValue01300((short)number);
	}

	public void setValue01300(long number)  throws CFException{
		constants300.setValue01300((short)number);
	}



	/**
	 *	Returns the value of virtualAccountNbr800
	 *	@return virtualAccountNbr800
	 */
   public char[] getVirtualAccountNbr800() throws CFException  {              
   		return tipapmaLayout800.getVirtualAccountNbr800();
   }

  
	/**
	*  set variable virtualAccountNbr800
	*  @param value
	**/
   public void setVirtualAccountNbr800(char[] value) throws CFException {
      tipapmaLayout800.setVirtualAccountNbr800(value);
   } 

     /**
	 * 	Update VirtualAccountNbr800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVirtualAccountNbr800(char[] source, int sourceIndex) throws CFException {
      tipapmaLayout800.setVirtualAccountNbr800(source, sourceIndex);
   	
   }
   
   public void setVirtualAccountNbr800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tipapmaLayout800.setVirtualAccountNbr800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update VirtualAccountNbr800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVirtualAccountNbr800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapmaLayout800.setVirtualAccountNbr800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update VirtualAccountNbr800 with another Field
	 *	@param value
	 */
   public void setVirtualAccountNbr800(Field source) {
      tipapmaLayout800.setVirtualAccountNbr800(source);
   }  
   
     /**
	 * 	Update VirtualAccountNbr800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVirtualAccountNbr800(Field source, int sourceIndex,int sourceLen) {
      tipapmaLayout800.setVirtualAccountNbr800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update VirtualAccountNbr800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVirtualAccountNbr800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapmaLayout800.setVirtualAccountNbr800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of justifyIn800
	 *	@return justifyIn800
	 */
   public char[] getJustifyIn800() throws CFException  {              
   		return work.getJustifyIn800();
   }

  
	/**
	*  set variable justifyIn800
	*  @param value
	**/
   public void setJustifyIn800(char[] value) throws CFException {
      work.setJustifyIn800(value);
   } 

	/**
	 *	Test condition "Y" for isIp00404SeqOptIn88()
	 *	@return  Returns true if isIp00404SeqOptIn88() is "Y"
	 */
   public boolean isIp00404SeqOptIn88(int index) throws CFException {
      return ip00404Table.getIp00404ArRangeEntries().getIp00404Entry(index).getIp00404MpePeRecDataCs().isIp00404SeqOptIn88();
   }

	/**
	*  set values "Y"
	*/
   	public void setIp00404SeqOptIn88True(int index)  throws CFException{  			
    	ip00404Table.getIp00404ArRangeEntries().getIp00404Entry(index).getIp00404MpePeRecDataCs().setIp00404SeqOptIn88True();
   	}
	/**
	 *	Returns the value of justifyOut800
	 *	@return justifyOut800
	 */
   public char[] getJustifyOut800() throws CFException  {              
   		return work.getJustifyOut800();
   }

  
	/**
	*  set variable justifyOut800
	*  @param value
	**/
   public void setJustifyOut800(char[] value) throws CFException {
      work.setJustifyOut800(value);
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


public void setIp00404AcctRngIndex(int ip00404AcctRngIndex) { 
    Ip343690Ctx.this.ip00404AcctRngIndex = ip00404AcctRngIndex;
}

public int getIp00404AcctRngIndex() { 
    return Ip343690Ctx.this.ip00404AcctRngIndex;
}

        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }

        public ProcessTable40LookupOutCtx getProcessTable40LookupOutCtx() {
            return new ProcessTable40LookupOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip00404Table.hashCode();
        str += work.hashCode();
        str += constants300.hashCode();
        str += tipapmaLayout800.hashCode();
       return str.hashCode();
    }

    public ProcessTable40LookupInCtx clone() {
        ProcessTable40LookupInCtx cloneObj = new ProcessTable40LookupInCtx();
        cloneObj.ip00404Table = new Ip00404Table();
        cloneObj.ip00404Table.set(ip00404Table.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.tipapmaLayout800 = new TipapmaLayout800();
        cloneObj.tipapmaLayout800.set(tipapmaLayout800.getClonedField());
        return cloneObj;
    }

    }

    public ProcessTable40LookupInCtx getProcessTable40LookupInCtx() {
            return new ProcessTable40LookupInCtx();
    }
     public class ProcessTable40LookupOutCtx implements Cloneable {
     Ip00404Table ip00404Table = Ip343690Ctx.this.getIp00404Table();
     Work work = Ip343690Ctx.this.getWork();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();
     TipapmaLayout800 tipapmaLayout800 = Ip343690Ctx.this.getTipapmaLayout800();

	/**
	 *	Returns the value of value19300
	 *	@return value19300
	 */
	public int getValue19300() throws CFException {
   		return constants300.getValue19300();
	}


	/**
	 *	Returns String value of value19300
	 *	@return value19300
	 */
	public char[]  getValue19300String() throws CFException {
	     return String.valueOf(constants300.getValue19300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value19300IsNumeric()  throws CFException{
	    return constants300.value19300IsNumeric();
	}

	/**
	 * 	Update Value19300 with the passed value
	 *	@param number
	 */
	public void setValue19300(int number)  throws CFException{
		constants300.setValue19300(number);
	}
	

	public void setValue19300(long number)  throws CFException{
	    constants300.setValue19300(number);
	}
	
	
	/**
	 * 	Update Value19300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue19300(char[] value)  throws CFException {
		constants300.setValue19300(value);
	}
	
	/**
	 * 	Update Value19300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue19300String(char[] value)  throws CFException{
		constants300.setValue19300(value);
	}	

	/**
	 *	Test condition "N" for isSeqOptOut88100()
	 *	@return  Returns true if isSeqOptOut88100() is "N"
	 */
   public boolean isSeqOptOut88100() throws CFException {
      return work.isSeqOptOut88100();
   }

	/**
	*  set values "N"
	*/
   	public void setSeqOptOut88100True()  throws CFException{  			
    	work.setSeqOptOut88100True();
   	}
	/**
	 *	Returns the value of actualLen800
	 *	@return actualLen800
	 */
	public short getActualLen800() throws CFException {        
   		return work.getActualLen800();
	}
	
	/**
	 * 	Update ActualLen800 with the passed value
	 *	@param number
	 */
	public void setActualLen800(short number)  throws CFException{
		work.setActualLen800(number);
	}

	public void setActualLen800(int number)  throws CFException{
		work.setActualLen800((short)number);
	}

	public void setActualLen800(long number)  throws CFException{
		work.setActualLen800((short)number);
	}



	/**
	 *	Returns the value of virtualAccountNbr800
	 *	@return virtualAccountNbr800
	 */
   public char[] getVirtualAccountNbr800() throws CFException  {              
   		return tipapmaLayout800.getVirtualAccountNbr800();
   }

  
	/**
	*  set variable virtualAccountNbr800
	*  @param value
	**/
   public void setVirtualAccountNbr800(char[] value) throws CFException {
      tipapmaLayout800.setVirtualAccountNbr800(value);
   } 

     /**
	 * 	Update VirtualAccountNbr800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVirtualAccountNbr800(char[] source, int sourceIndex) throws CFException {
      tipapmaLayout800.setVirtualAccountNbr800(source, sourceIndex);
   	
   }
   
   public void setVirtualAccountNbr800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tipapmaLayout800.setVirtualAccountNbr800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update VirtualAccountNbr800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVirtualAccountNbr800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapmaLayout800.setVirtualAccountNbr800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update VirtualAccountNbr800 with another Field
	 *	@param value
	 */
   public void setVirtualAccountNbr800(Field source) {
      tipapmaLayout800.setVirtualAccountNbr800(source);
   }  
   
     /**
	 * 	Update VirtualAccountNbr800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVirtualAccountNbr800(Field source, int sourceIndex,int sourceLen) {
      tipapmaLayout800.setVirtualAccountNbr800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update VirtualAccountNbr800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVirtualAccountNbr800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapmaLayout800.setVirtualAccountNbr800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "Y" for isNonSpaceFoundY88800()
	 *	@return  Returns true if isNonSpaceFoundY88800() is "Y"
	 */
   public boolean isNonSpaceFoundY88800() throws CFException {
      return work.isNonSpaceFoundY88800();
   }

	/**
	*  set values "Y"
	*/
   	public void setNonSpaceFoundY88800True()  throws CFException{  			
    	work.setNonSpaceFoundY88800True();
   	}
	/**
	 *	Returns the value of justifyIn800
	 *	@return justifyIn800
	 */
   public char[] getJustifyIn800() throws CFException  {              
   		return work.getJustifyIn800();
   }

  
	/**
	*  set variable justifyIn800
	*  @param value
	**/
   public void setJustifyIn800(char[] value) throws CFException {
      work.setJustifyIn800(value);
   } 

	/**
	 *	Test condition "N" for isNonSpaceFoundN88800()
	 *	@return  Returns true if isNonSpaceFoundN88800() is "N"
	 */
   public boolean isNonSpaceFoundN88800() throws CFException {
      return work.isNonSpaceFoundN88800();
   }

	/**
	*  set values "N"
	*/
   	public void setNonSpaceFoundN88800True()  throws CFException{  			
    	work.setNonSpaceFoundN88800True();
   	}
	/**
	 *	Test condition "Y" for isSeqOptIn88100()
	 *	@return  Returns true if isSeqOptIn88100() is "Y"
	 */
   public boolean isSeqOptIn88100() throws CFException {
      return work.isSeqOptIn88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setSeqOptIn88100True()  throws CFException{  			
    	work.setSeqOptIn88100True();
   	}
	/**
	 *	Returns the value of justifyOut800
	 *	@return justifyOut800
	 */
   public char[] getJustifyOut800() throws CFException  {              
   		return work.getJustifyOut800();
   }

  
	/**
	*  set variable justifyOut800
	*  @param value
	**/
   public void setJustifyOut800(char[] value) throws CFException {
      work.setJustifyOut800(value);
   } 


public void setIp00404AcctRngIndex(int ip00404AcctRngIndex) { 
    Ip343690Ctx.this.ip00404AcctRngIndex = ip00404AcctRngIndex;
}

public int getIp00404AcctRngIndex() { 
    return Ip343690Ctx.this.ip00404AcctRngIndex;
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


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip00404Table.hashCode();
        str += work.hashCode();
        str += constants300.hashCode();
        str += tipapmaLayout800.hashCode();
       return str.hashCode();
    }

    public ProcessTable40LookupOutCtx clone() {
        ProcessTable40LookupOutCtx cloneObj = new ProcessTable40LookupOutCtx();
        cloneObj.ip00404Table = new Ip00404Table();
        cloneObj.ip00404Table.set(ip00404Table.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.tipapmaLayout800 = new TipapmaLayout800();
        cloneObj.tipapmaLayout800.set(tipapmaLayout800.getClonedField());
        return cloneObj;
    }

    }

    public ProcessTable40LookupOutCtx getProcessTable40LookupOutCtx() {
            return new ProcessTable40LookupOutCtx();
    }
     public class UpdateTipapmaInCtx implements Cloneable {
     Tipapma tipapma = Ip343690Ctx.this.getTipapma();
     Itipapma itipapma = Ip343690Ctx.this.getItipapma();
     Work work = Ip343690Ctx.this.getWork();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();
     TipapmaLayout800 tipapmaLayout800 = Ip343690Ctx.this.getTipapmaLayout800();

	/**
	 *	Returns the value of virtualAccountNbr800
	 *	@return virtualAccountNbr800
	 */
   public char[] getVirtualAccountNbr800() throws CFException  {              
   		return tipapmaLayout800.getVirtualAccountNbr800();
   }

  
	/**
	*  set variable virtualAccountNbr800
	*  @param value
	**/
   public void setVirtualAccountNbr800(char[] value) throws CFException {
      tipapmaLayout800.setVirtualAccountNbr800(value);
   } 

     /**
	 * 	Update VirtualAccountNbr800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVirtualAccountNbr800(char[] source, int sourceIndex) throws CFException {
      tipapmaLayout800.setVirtualAccountNbr800(source, sourceIndex);
   	
   }
   
   public void setVirtualAccountNbr800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tipapmaLayout800.setVirtualAccountNbr800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update VirtualAccountNbr800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVirtualAccountNbr800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapmaLayout800.setVirtualAccountNbr800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update VirtualAccountNbr800 with another Field
	 *	@param value
	 */
   public void setVirtualAccountNbr800(Field source) {
      tipapmaLayout800.setVirtualAccountNbr800(source);
   }  
   
     /**
	 * 	Update VirtualAccountNbr800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVirtualAccountNbr800(Field source, int sourceIndex,int sourceLen) {
      tipapmaLayout800.setVirtualAccountNbr800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update VirtualAccountNbr800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVirtualAccountNbr800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapmaLayout800.setVirtualAccountNbr800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of primAccountNbr800
	 *	@return primAccountNbr800
	 */
   public char[] getPrimAccountNbr800() throws CFException  {              
   		return tipapmaLayout800.getPrimAccountNbr800();
   }

  
	/**
	*  set variable primAccountNbr800
	*  @param value
	**/
   public void setPrimAccountNbr800(char[] value) throws CFException {
      tipapmaLayout800.setPrimAccountNbr800(value);
   } 

     /**
	 * 	Update PrimAccountNbr800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrimAccountNbr800(char[] source, int sourceIndex) throws CFException {
      tipapmaLayout800.setPrimAccountNbr800(source, sourceIndex);
   	
   }
   
   public void setPrimAccountNbr800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tipapmaLayout800.setPrimAccountNbr800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PrimAccountNbr800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrimAccountNbr800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapmaLayout800.setPrimAccountNbr800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PrimAccountNbr800 with another Field
	 *	@param value
	 */
   public void setPrimAccountNbr800(Field source) {
      tipapmaLayout800.setPrimAccountNbr800(source);
   }  
   
     /**
	 * 	Update PrimAccountNbr800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrimAccountNbr800(Field source, int sourceIndex,int sourceLen) {
      tipapmaLayout800.setPrimAccountNbr800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PrimAccountNbr800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrimAccountNbr800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapmaLayout800.setPrimAccountNbr800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "Y" for isSeqOptIn88100()
	 *	@return  Returns true if isSeqOptIn88100() is "Y"
	 */
   public boolean isSeqOptIn88100() throws CFException {
      return work.isSeqOptIn88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setSeqOptIn88100True()  throws CFException{  			
    	work.setSeqOptIn88100True();
   	}
	/**
	 *	Test condition "Y" for isEofPmaCursor88100()
	 *	@return  Returns true if isEofPmaCursor88100() is "Y"
	 */
   public boolean isEofPmaCursor88100() throws CFException {
      return work.isEofPmaCursor88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setEofPmaCursor88100True()  throws CFException{  			
    	work.setEofPmaCursor88100True();
   	}
	/**
	 *	Returns the value of nullValue300
	 *	@return nullValue300
	 */
	public short getNullValue300() throws CFException {        
   		return constants300.getNullValue300();
	}
	
	/**
	 * 	Update NullValue300 with the passed value
	 *	@param number
	 */
	public void setNullValue300(short number)  throws CFException{
		constants300.setNullValue300(number);
	}

	public void setNullValue300(int number)  throws CFException{
		constants300.setNullValue300((short)number);
	}

	public void setNullValue300(long number)  throws CFException{
		constants300.setNullValue300((short)number);
	}




        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }

        public UpdateTipapmaOutCtx getUpdateTipapmaOutCtx() {
            return new UpdateTipapmaOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tipapma.hashCode();
        str += itipapma.hashCode();
        str += work.hashCode();
        str += constants300.hashCode();
        str += tipapmaLayout800.hashCode();
       return str.hashCode();
    }

    public UpdateTipapmaInCtx clone() {
        UpdateTipapmaInCtx cloneObj = new UpdateTipapmaInCtx();
        cloneObj.tipapma = new Tipapma();
        cloneObj.tipapma.set(tipapma.getClonedField());
        cloneObj.itipapma = new Itipapma();
        cloneObj.itipapma.set(itipapma.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.tipapmaLayout800 = new TipapmaLayout800();
        cloneObj.tipapmaLayout800.set(tipapmaLayout800.getClonedField());
        return cloneObj;
    }

    }

    public UpdateTipapmaInCtx getUpdateTipapmaInCtx() {
            return new UpdateTipapmaInCtx();
    }
     public class UpdateTipapmaOutCtx implements Cloneable {
     Tipapma tipapma = Ip343690Ctx.this.getTipapma();
     Itipapma itipapma = Ip343690Ctx.this.getItipapma();
     Work work = Ip343690Ctx.this.getWork();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();
     TipapmaLayout800 tipapmaLayout800 = Ip343690Ctx.this.getTipapmaLayout800();

	/**
	 *	Returns the value of tipapmaPrimAcctNum
	 *	@return tipapmaPrimAcctNum
	 */
   public char[] getTipapmaPrimAcctNum() throws CFException  {              
   		return tipapma.getTipapmaPrimAcctNum();
   }

  
	/**
	*  set variable tipapmaPrimAcctNum
	*  @param value
	**/
   public void setTipapmaPrimAcctNum(char[] value) throws CFException {
      tipapma.setTipapmaPrimAcctNum(value);
   } 

     /**
	 * 	Update TipapmaPrimAcctNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTipapmaPrimAcctNum(char[] source, int sourceIndex) throws CFException {
      tipapma.setTipapmaPrimAcctNum(source, sourceIndex);
   	
   }
   
   public void setTipapmaPrimAcctNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tipapma.setTipapmaPrimAcctNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TipapmaPrimAcctNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTipapmaPrimAcctNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapma.setTipapmaPrimAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TipapmaPrimAcctNum with another Field
	 *	@param value
	 */
   public void setTipapmaPrimAcctNum(Field source) {
      tipapma.setTipapmaPrimAcctNum(source);
   }  
   
     /**
	 * 	Update TipapmaPrimAcctNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTipapmaPrimAcctNum(Field source, int sourceIndex,int sourceLen) {
      tipapma.setTipapmaPrimAcctNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TipapmaPrimAcctNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTipapmaPrimAcctNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapma.setTipapmaPrimAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tipapmaPrimAcctSeqNum
	 *	@return tipapmaPrimAcctSeqNum
	 */
   public char[] getTipapmaPrimAcctSeqNum() throws CFException  {              
   		return tipapma.getTipapmaPrimAcctSeqNum();
   }

  
	/**
	*  set variable tipapmaPrimAcctSeqNum
	*  @param value
	**/
   public void setTipapmaPrimAcctSeqNum(char[] value) throws CFException {
      tipapma.setTipapmaPrimAcctSeqNum(value);
   } 

     /**
	 * 	Update TipapmaPrimAcctSeqNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTipapmaPrimAcctSeqNum(char[] source, int sourceIndex) throws CFException {
      tipapma.setTipapmaPrimAcctSeqNum(source, sourceIndex);
   	
   }
   
   public void setTipapmaPrimAcctSeqNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tipapma.setTipapmaPrimAcctSeqNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TipapmaPrimAcctSeqNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTipapmaPrimAcctSeqNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapma.setTipapmaPrimAcctSeqNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TipapmaPrimAcctSeqNum with another Field
	 *	@param value
	 */
   public void setTipapmaPrimAcctSeqNum(Field source) {
      tipapma.setTipapmaPrimAcctSeqNum(source);
   }  
   
     /**
	 * 	Update TipapmaPrimAcctSeqNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTipapmaPrimAcctSeqNum(Field source, int sourceIndex,int sourceLen) {
      tipapma.setTipapmaPrimAcctSeqNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TipapmaPrimAcctSeqNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTipapmaPrimAcctSeqNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapma.setTipapmaPrimAcctSeqNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tipapmaVrtlAcctNum
	 *	@return tipapmaVrtlAcctNum
	 */
   public char[] getTipapmaVrtlAcctNum() throws CFException  {              
   		return tipapma.getTipapmaVrtlAcctNum();
   }

  
	/**
	*  set variable tipapmaVrtlAcctNum
	*  @param value
	**/
   public void setTipapmaVrtlAcctNum(char[] value) throws CFException {
      tipapma.setTipapmaVrtlAcctNum(value);
   } 

     /**
	 * 	Update TipapmaVrtlAcctNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTipapmaVrtlAcctNum(char[] source, int sourceIndex) throws CFException {
      tipapma.setTipapmaVrtlAcctNum(source, sourceIndex);
   	
   }
   
   public void setTipapmaVrtlAcctNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tipapma.setTipapmaVrtlAcctNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TipapmaVrtlAcctNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTipapmaVrtlAcctNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapma.setTipapmaVrtlAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TipapmaVrtlAcctNum with another Field
	 *	@param value
	 */
   public void setTipapmaVrtlAcctNum(Field source) {
      tipapma.setTipapmaVrtlAcctNum(source);
   }  
   
     /**
	 * 	Update TipapmaVrtlAcctNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTipapmaVrtlAcctNum(Field source, int sourceIndex,int sourceLen) {
      tipapma.setTipapmaVrtlAcctNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TipapmaVrtlAcctNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTipapmaVrtlAcctNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapma.setTipapmaVrtlAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of virtualAccountNbr800
	 *	@return virtualAccountNbr800
	 */
   public char[] getVirtualAccountNbr800() throws CFException  {              
   		return tipapmaLayout800.getVirtualAccountNbr800();
   }

  
	/**
	*  set variable virtualAccountNbr800
	*  @param value
	**/
   public void setVirtualAccountNbr800(char[] value) throws CFException {
      tipapmaLayout800.setVirtualAccountNbr800(value);
   } 

     /**
	 * 	Update VirtualAccountNbr800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVirtualAccountNbr800(char[] source, int sourceIndex) throws CFException {
      tipapmaLayout800.setVirtualAccountNbr800(source, sourceIndex);
   	
   }
   
   public void setVirtualAccountNbr800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tipapmaLayout800.setVirtualAccountNbr800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update VirtualAccountNbr800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVirtualAccountNbr800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapmaLayout800.setVirtualAccountNbr800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update VirtualAccountNbr800 with another Field
	 *	@param value
	 */
   public void setVirtualAccountNbr800(Field source) {
      tipapmaLayout800.setVirtualAccountNbr800(source);
   }  
   
     /**
	 * 	Update VirtualAccountNbr800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVirtualAccountNbr800(Field source, int sourceIndex,int sourceLen) {
      tipapmaLayout800.setVirtualAccountNbr800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update VirtualAccountNbr800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVirtualAccountNbr800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapmaLayout800.setVirtualAccountNbr800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of primAccountNbr800
	 *	@return primAccountNbr800
	 */
   public char[] getPrimAccountNbr800() throws CFException  {              
   		return tipapmaLayout800.getPrimAccountNbr800();
   }

  
	/**
	*  set variable primAccountNbr800
	*  @param value
	**/
   public void setPrimAccountNbr800(char[] value) throws CFException {
      tipapmaLayout800.setPrimAccountNbr800(value);
   } 

     /**
	 * 	Update PrimAccountNbr800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrimAccountNbr800(char[] source, int sourceIndex) throws CFException {
      tipapmaLayout800.setPrimAccountNbr800(source, sourceIndex);
   	
   }
   
   public void setPrimAccountNbr800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tipapmaLayout800.setPrimAccountNbr800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PrimAccountNbr800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrimAccountNbr800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapmaLayout800.setPrimAccountNbr800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PrimAccountNbr800 with another Field
	 *	@param value
	 */
   public void setPrimAccountNbr800(Field source) {
      tipapmaLayout800.setPrimAccountNbr800(source);
   }  
   
     /**
	 * 	Update PrimAccountNbr800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrimAccountNbr800(Field source, int sourceIndex,int sourceLen) {
      tipapmaLayout800.setPrimAccountNbr800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PrimAccountNbr800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrimAccountNbr800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapmaLayout800.setPrimAccountNbr800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tipapmaPrimAcctSeqNumN
	 *	@return tipapmaPrimAcctSeqNumN
	 */
	public short getTipapmaPrimAcctSeqNumN() throws CFException {        
   		return itipapma.getTipapmaPrimAcctSeqNumN();
	}
	
	/**
	 * 	Update TipapmaPrimAcctSeqNumN with the passed value
	 *	@param number
	 */
	public void setTipapmaPrimAcctSeqNumN(short number)  throws CFException{
		itipapma.setTipapmaPrimAcctSeqNumN(number);
	}

	public void setTipapmaPrimAcctSeqNumN(int number)  throws CFException{
		itipapma.setTipapmaPrimAcctSeqNumN((short)number);
	}

	public void setTipapmaPrimAcctSeqNumN(long number)  throws CFException{
		itipapma.setTipapmaPrimAcctSeqNumN((short)number);
	}



	/**
	 *	Returns the value of nullValue300
	 *	@return nullValue300
	 */
	public short getNullValue300() throws CFException {        
   		return constants300.getNullValue300();
	}
	
	/**
	 * 	Update NullValue300 with the passed value
	 *	@param number
	 */
	public void setNullValue300(short number)  throws CFException{
		constants300.setNullValue300(number);
	}

	public void setNullValue300(int number)  throws CFException{
		constants300.setNullValue300((short)number);
	}

	public void setNullValue300(long number)  throws CFException{
		constants300.setNullValue300((short)number);
	}




        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += tipapma.hashCode();
        str += itipapma.hashCode();
        str += work.hashCode();
        str += constants300.hashCode();
        str += tipapmaLayout800.hashCode();
       return str.hashCode();
    }

    public UpdateTipapmaOutCtx clone() {
        UpdateTipapmaOutCtx cloneObj = new UpdateTipapmaOutCtx();
        cloneObj.tipapma = new Tipapma();
        cloneObj.tipapma.set(tipapma.getClonedField());
        cloneObj.itipapma = new Itipapma();
        cloneObj.itipapma.set(itipapma.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.tipapmaLayout800 = new TipapmaLayout800();
        cloneObj.tipapmaLayout800.set(tipapmaLayout800.getClonedField());
        return cloneObj;
    }

    }

    public UpdateTipapmaOutCtx getUpdateTipapmaOutCtx() {
            return new UpdateTipapmaOutCtx();
    }
     public class OpenPmaCursorInCtx implements Cloneable {
     SqlAbendMsg900 sqlAbendMsg900 = Ip343690Ctx.this.getSqlAbendMsg900();
     Tipapma tipapma = Ip343690Ctx.this.getTipapma();
     AbendMessage900 abendMessage900 = Ip343690Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip343690Ctx.this.getAbendParaName900();
     Work work = Ip343690Ctx.this.getWork();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();
     Sqlca sqlca = Ip343690Ctx.this.getSqlca();

	/**
	 *	Returns the value of tipapmaPrimAcctNum
	 *	@return tipapmaPrimAcctNum
	 */
   public char[] getTipapmaPrimAcctNum() throws CFException  {              
   		return tipapma.getTipapmaPrimAcctNum();
   }

  
	/**
	*  set variable tipapmaPrimAcctNum
	*  @param value
	**/
   public void setTipapmaPrimAcctNum(char[] value) throws CFException {
      tipapma.setTipapmaPrimAcctNum(value);
   } 

     /**
	 * 	Update TipapmaPrimAcctNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTipapmaPrimAcctNum(char[] source, int sourceIndex) throws CFException {
      tipapma.setTipapmaPrimAcctNum(source, sourceIndex);
   	
   }
   
   public void setTipapmaPrimAcctNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tipapma.setTipapmaPrimAcctNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TipapmaPrimAcctNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTipapmaPrimAcctNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapma.setTipapmaPrimAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TipapmaPrimAcctNum with another Field
	 *	@param value
	 */
   public void setTipapmaPrimAcctNum(Field source) {
      tipapma.setTipapmaPrimAcctNum(source);
   }  
   
     /**
	 * 	Update TipapmaPrimAcctNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTipapmaPrimAcctNum(Field source, int sourceIndex,int sourceLen) {
      tipapma.setTipapmaPrimAcctNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TipapmaPrimAcctNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTipapmaPrimAcctNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapma.setTipapmaPrimAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlwarn
	 *	@return sqlwarn
	 */   
	 public Sqlwarn getSqlwarn() {
   	return sqlca.getSqlwarn();
   }

   /**
	* 	Update Sqlwarn with the passed value
	*	@param value
	*/
   public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
   }   

     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlwarn with another Field
	 *	@param value
	 */
   public void setSqlwarn(Field source) {
   	sqlca.setSqlwarn(source);
   }  
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tipapma
	 *	@return tipapma
	 */   
	 public Tipapma getTipapma() {
   	return tipapma;
   }


	/**
	 *	Returns the value of para3210300
	 *	@return para3210300
	 */
   public char[] getPara3210300() throws CFException  {              
   		return work.getPara3210300();
   }

  
	/**
	*  set variable para3210300
	*  @param value
	**/
   public void setPara3210300(char[] value) throws CFException {
      work.setPara3210300(value);
   } 

	/**
	 *	Returns the value of tipapmaVrtlAcctNum
	 *	@return tipapmaVrtlAcctNum
	 */
   public char[] getTipapmaVrtlAcctNum() throws CFException  {              
   		return tipapma.getTipapmaVrtlAcctNum();
   }

  
	/**
	*  set variable tipapmaVrtlAcctNum
	*  @param value
	**/
   public void setTipapmaVrtlAcctNum(char[] value) throws CFException {
      tipapma.setTipapmaVrtlAcctNum(value);
   } 

     /**
	 * 	Update TipapmaVrtlAcctNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTipapmaVrtlAcctNum(char[] source, int sourceIndex) throws CFException {
      tipapma.setTipapmaVrtlAcctNum(source, sourceIndex);
   	
   }
   
   public void setTipapmaVrtlAcctNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tipapma.setTipapmaVrtlAcctNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TipapmaVrtlAcctNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTipapmaVrtlAcctNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapma.setTipapmaVrtlAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TipapmaVrtlAcctNum with another Field
	 *	@param value
	 */
   public void setTipapmaVrtlAcctNum(Field source) {
      tipapma.setTipapmaVrtlAcctNum(source);
   }  
   
     /**
	 * 	Update TipapmaVrtlAcctNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTipapmaVrtlAcctNum(Field source, int sourceIndex,int sourceLen) {
      tipapma.setTipapmaVrtlAcctNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TipapmaVrtlAcctNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTipapmaVrtlAcctNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapma.setTipapmaVrtlAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of openTipapmaCursor300
	 *	@return openTipapmaCursor300
	 */
   public char[] getOpenTipapmaCursor300() throws CFException  {              
   		return constants300.getOpenTipapmaCursor300();
   }

  
	/**
	*  set variable openTipapmaCursor300
	*  @param value
	**/
   public void setOpenTipapmaCursor300(char[] value) throws CFException {
      constants300.setOpenTipapmaCursor300(value);
   } 

     /**
	 * 	Update OpenTipapmaCursor300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOpenTipapmaCursor300(char[] source, int sourceIndex) throws CFException {
      constants300.setOpenTipapmaCursor300(source, sourceIndex);
   	
   }
   
   public void setOpenTipapmaCursor300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      constants300.setOpenTipapmaCursor300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OpenTipapmaCursor300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOpenTipapmaCursor300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setOpenTipapmaCursor300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OpenTipapmaCursor300 with another Field
	 *	@param value
	 */
   public void setOpenTipapmaCursor300(Field source) {
      constants300.setOpenTipapmaCursor300(source);
   }  
   
     /**
	 * 	Update OpenTipapmaCursor300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOpenTipapmaCursor300(Field source, int sourceIndex,int sourceLen) {
      constants300.setOpenTipapmaCursor300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OpenTipapmaCursor300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOpenTipapmaCursor300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setOpenTipapmaCursor300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlerrd
	 *	@return sqlerrd
	 */
	public int getSqlerrd(int index) throws CFException {        
   		return sqlca.getSqlerrd((index));
	}
	
	/**
	 * 	Update Sqlerrd with the passed value
	 *	@param number
	 */
	public void setSqlerrd(int index,int number)  throws CFException{
		sqlca.setSqlerrd((index),number);
	}


	public void setSqlerrd(int index,long number)  throws CFException{
		sqlca.setSqlerrd((index),(int)number);
	}


	/**
	 *	Returns the value of valueZero300
	 *	@return valueZero300
	 */
	public short getValueZero300() throws CFException {        
   		return constants300.getValueZero300();
	}
	
	/**
	 * 	Update ValueZero300 with the passed value
	 *	@param number
	 */
	public void setValueZero300(short number)  throws CFException{
		constants300.setValueZero300(number);
	}

	public void setValueZero300(int number)  throws CFException{
		constants300.setValueZero300((short)number);
	}

	public void setValueZero300(long number)  throws CFException{
		constants300.setValueZero300((short)number);
	}



	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of sqlerrmc
	 *	@return sqlerrmc
	 */
   public char[] getSqlerrmc() throws CFException  {              
   		return sqlca.getSqlerrm().getSqlerrmc();
   }

  
	/**
	*  set variable sqlerrmc
	*  @param value
	**/
   public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
   } 

     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
   	
   }
   
   public void setSqlerrmc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlerrmc with another Field
	 *	@param value
	 */
   public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
   }  
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }

        public OpenPmaCursorOutCtx getOpenPmaCursorOutCtx() {
            return new OpenPmaCursorOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlAbendMsg900.hashCode();
        str += tipapma.hashCode();
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += work.hashCode();
        str += constants300.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public OpenPmaCursorInCtx clone() {
        OpenPmaCursorInCtx cloneObj = new OpenPmaCursorInCtx();
        cloneObj.sqlAbendMsg900 = new SqlAbendMsg900();
        cloneObj.sqlAbendMsg900.set(sqlAbendMsg900.getClonedField());
        cloneObj.tipapma = new Tipapma();
        cloneObj.tipapma.set(tipapma.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public OpenPmaCursorInCtx getOpenPmaCursorInCtx() {
            return new OpenPmaCursorInCtx();
    }
     public class OpenPmaCursorOutCtx implements Cloneable {
     SqlAbendMsg900 sqlAbendMsg900 = Ip343690Ctx.this.getSqlAbendMsg900();
     Tipapma tipapma = Ip343690Ctx.this.getTipapma();
     AbendMessage900 abendMessage900 = Ip343690Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip343690Ctx.this.getAbendParaName900();
     Work work = Ip343690Ctx.this.getWork();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();
     Sqlca sqlca = Ip343690Ctx.this.getSqlca();

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
	 *	Returns the value of para3210300
	 *	@return para3210300
	 */
   public char[] getPara3210300() throws CFException  {              
   		return work.getPara3210300();
   }

  
	/**
	*  set variable para3210300
	*  @param value
	**/
   public void setPara3210300(char[] value) throws CFException {
      work.setPara3210300(value);
   } 

	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of openTipapmaCursor300
	 *	@return openTipapmaCursor300
	 */
   public char[] getOpenTipapmaCursor300() throws CFException  {              
   		return constants300.getOpenTipapmaCursor300();
   }

  
	/**
	*  set variable openTipapmaCursor300
	*  @param value
	**/
   public void setOpenTipapmaCursor300(char[] value) throws CFException {
      constants300.setOpenTipapmaCursor300(value);
   } 

     /**
	 * 	Update OpenTipapmaCursor300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOpenTipapmaCursor300(char[] source, int sourceIndex) throws CFException {
      constants300.setOpenTipapmaCursor300(source, sourceIndex);
   	
   }
   
   public void setOpenTipapmaCursor300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      constants300.setOpenTipapmaCursor300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OpenTipapmaCursor300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOpenTipapmaCursor300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setOpenTipapmaCursor300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OpenTipapmaCursor300 with another Field
	 *	@param value
	 */
   public void setOpenTipapmaCursor300(Field source) {
      constants300.setOpenTipapmaCursor300(source);
   }  
   
     /**
	 * 	Update OpenTipapmaCursor300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOpenTipapmaCursor300(Field source, int sourceIndex,int sourceLen) {
      constants300.setOpenTipapmaCursor300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OpenTipapmaCursor300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOpenTipapmaCursor300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setOpenTipapmaCursor300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendSqlerrmc900
	 *	@return abendSqlerrmc900
	 */
   public char[] getAbendSqlerrmc900() throws CFException  {              
   		return sqlAbendMsg900.getAbendSqlerrmc900();
   }

  
	/**
	*  set variable abendSqlerrmc900
	*  @param value
	**/
   public void setAbendSqlerrmc900(char[] value) throws CFException {
      sqlAbendMsg900.setAbendSqlerrmc900(value);
   } 

     /**
	 * 	Update AbendSqlerrmc900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendSqlerrmc900(char[] source, int sourceIndex) throws CFException {
      sqlAbendMsg900.setAbendSqlerrmc900(source, sourceIndex);
   	
   }
   
   public void setAbendSqlerrmc900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlAbendMsg900.setAbendSqlerrmc900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendSqlerrmc900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendSqlerrmc900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlAbendMsg900.setAbendSqlerrmc900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendSqlerrmc900 with another Field
	 *	@param value
	 */
   public void setAbendSqlerrmc900(Field source) {
      sqlAbendMsg900.setAbendSqlerrmc900(source);
   }  
   
     /**
	 * 	Update AbendSqlerrmc900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendSqlerrmc900(Field source, int sourceIndex,int sourceLen) {
      sqlAbendMsg900.setAbendSqlerrmc900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendSqlerrmc900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendSqlerrmc900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlAbendMsg900.setAbendSqlerrmc900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendSqlCode900
	 *	@return abendSqlCode900
	 */
   public char[] getAbendSqlCode900() throws CFException  {              
   		return sqlAbendMsg900.getAbendSqlCode900();
   }

  
	/**
	*  set variable abendSqlCode900
	*  @param value
	**/
   public void setAbendSqlCode900(char[] value) throws CFException {
      sqlAbendMsg900.setAbendSqlCode900(value);
   } 

     /**
	 * 	Update AbendSqlCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendSqlCode900(char[] source, int sourceIndex) throws CFException {
      sqlAbendMsg900.setAbendSqlCode900(source, sourceIndex);
   	
   }
   
   public void setAbendSqlCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlAbendMsg900.setAbendSqlCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendSqlCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendSqlCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlAbendMsg900.setAbendSqlCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendSqlCode900 with another Field
	 *	@param value
	 */
   public void setAbendSqlCode900(Field source) {
      sqlAbendMsg900.setAbendSqlCode900(source);
   }  
   
     /**
	 * 	Update AbendSqlCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendSqlCode900(Field source, int sourceIndex,int sourceLen) {
      sqlAbendMsg900.setAbendSqlCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendSqlCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendSqlCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlAbendMsg900.setAbendSqlCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of eofPmaCursor100
	 *	@return eofPmaCursor100
	 */
   public char[] getEofPmaCursor100() throws CFException  {              
   		return work.getEofPmaCursor100();
   }

  
	/**
	*  set variable eofPmaCursor100
	*  @param value
	**/
   public void setEofPmaCursor100(char[] value) throws CFException {
      work.setEofPmaCursor100(value);
   } 

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Test condition "Y" for isItIsSqlError88100()
	 *	@return  Returns true if isItIsSqlError88100() is "Y"
	 */
   public boolean isItIsSqlError88100() throws CFException {
      return work.isItIsSqlError88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsSqlError88100True()  throws CFException{  			
    	work.setItIsSqlError88100True();
   	}
	/**
	 *	Returns the value of sqlerrmc
	 *	@return sqlerrmc
	 */
   public char[] getSqlerrmc() throws CFException  {              
   		return sqlca.getSqlerrm().getSqlerrmc();
   }

  
	/**
	*  set variable sqlerrmc
	*  @param value
	**/
   public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
   } 

     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
   	
   }
   
   public void setSqlerrmc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlerrmc with another Field
	 *	@param value
	 */
   public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
   }  
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlAbendMsg900.hashCode();
        str += tipapma.hashCode();
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += work.hashCode();
        str += constants300.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public OpenPmaCursorOutCtx clone() {
        OpenPmaCursorOutCtx cloneObj = new OpenPmaCursorOutCtx();
        cloneObj.sqlAbendMsg900 = new SqlAbendMsg900();
        cloneObj.sqlAbendMsg900.set(sqlAbendMsg900.getClonedField());
        cloneObj.tipapma = new Tipapma();
        cloneObj.tipapma.set(tipapma.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public OpenPmaCursorOutCtx getOpenPmaCursorOutCtx() {
            return new OpenPmaCursorOutCtx();
    }
     public class FetchUpdatePmaCursorInCtx implements Cloneable {
     SqlAbendMsg900 sqlAbendMsg900 = Ip343690Ctx.this.getSqlAbendMsg900();
     Tipapma tipapma = Ip343690Ctx.this.getTipapma();
     AbendMessage900 abendMessage900 = Ip343690Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip343690Ctx.this.getAbendParaName900();
     Work work = Ip343690Ctx.this.getWork();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();
     Sqlca sqlca = Ip343690Ctx.this.getSqlca();

	/**
	 *	Returns the value of tipapmaPrimAcctNum
	 *	@return tipapmaPrimAcctNum
	 */
   public char[] getTipapmaPrimAcctNum() throws CFException  {              
   		return tipapma.getTipapmaPrimAcctNum();
   }

  
	/**
	*  set variable tipapmaPrimAcctNum
	*  @param value
	**/
   public void setTipapmaPrimAcctNum(char[] value) throws CFException {
      tipapma.setTipapmaPrimAcctNum(value);
   } 

     /**
	 * 	Update TipapmaPrimAcctNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTipapmaPrimAcctNum(char[] source, int sourceIndex) throws CFException {
      tipapma.setTipapmaPrimAcctNum(source, sourceIndex);
   	
   }
   
   public void setTipapmaPrimAcctNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tipapma.setTipapmaPrimAcctNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TipapmaPrimAcctNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTipapmaPrimAcctNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapma.setTipapmaPrimAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TipapmaPrimAcctNum with another Field
	 *	@param value
	 */
   public void setTipapmaPrimAcctNum(Field source) {
      tipapma.setTipapmaPrimAcctNum(source);
   }  
   
     /**
	 * 	Update TipapmaPrimAcctNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTipapmaPrimAcctNum(Field source, int sourceIndex,int sourceLen) {
      tipapma.setTipapmaPrimAcctNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TipapmaPrimAcctNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTipapmaPrimAcctNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapma.setTipapmaPrimAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlwarn
	 *	@return sqlwarn
	 */   
	 public Sqlwarn getSqlwarn() {
   	return sqlca.getSqlwarn();
   }

   /**
	* 	Update Sqlwarn with the passed value
	*	@param value
	*/
   public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
   }   

     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlwarn with another Field
	 *	@param value
	 */
   public void setSqlwarn(Field source) {
   	sqlca.setSqlwarn(source);
   }  
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tipapma
	 *	@return tipapma
	 */   
	 public Tipapma getTipapma() {
   	return tipapma;
   }


	/**
	 *	Returns the value of value100300
	 *	@return value100300
	 */
	public short getValue100300() throws CFException {        
   		return constants300.getValue100300();
	}
	
	/**
	 * 	Update Value100300 with the passed value
	 *	@param number
	 */
	public void setValue100300(short number)  throws CFException{
		constants300.setValue100300(number);
	}

	public void setValue100300(int number)  throws CFException{
		constants300.setValue100300((short)number);
	}

	public void setValue100300(long number)  throws CFException{
		constants300.setValue100300((short)number);
	}



	/**
	 *	Returns the value of fetchPmaAbendCode300
	 *	@return fetchPmaAbendCode300
	 */
   public char[] getFetchPmaAbendCode300() throws CFException  {              
   		return constants300.getFetchPmaAbendCode300();
   }

  
	/**
	*  set variable fetchPmaAbendCode300
	*  @param value
	**/
   public void setFetchPmaAbendCode300(char[] value) throws CFException {
      constants300.setFetchPmaAbendCode300(value);
   } 

     /**
	 * 	Update FetchPmaAbendCode300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFetchPmaAbendCode300(char[] source, int sourceIndex) throws CFException {
      constants300.setFetchPmaAbendCode300(source, sourceIndex);
   	
   }
   
   public void setFetchPmaAbendCode300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      constants300.setFetchPmaAbendCode300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FetchPmaAbendCode300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFetchPmaAbendCode300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setFetchPmaAbendCode300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FetchPmaAbendCode300 with another Field
	 *	@param value
	 */
   public void setFetchPmaAbendCode300(Field source) {
      constants300.setFetchPmaAbendCode300(source);
   }  
   
     /**
	 * 	Update FetchPmaAbendCode300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFetchPmaAbendCode300(Field source, int sourceIndex,int sourceLen) {
      constants300.setFetchPmaAbendCode300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FetchPmaAbendCode300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFetchPmaAbendCode300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setFetchPmaAbendCode300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tipapmaVrtlAcctNum
	 *	@return tipapmaVrtlAcctNum
	 */
   public char[] getTipapmaVrtlAcctNum() throws CFException  {              
   		return tipapma.getTipapmaVrtlAcctNum();
   }

  
	/**
	*  set variable tipapmaVrtlAcctNum
	*  @param value
	**/
   public void setTipapmaVrtlAcctNum(char[] value) throws CFException {
      tipapma.setTipapmaVrtlAcctNum(value);
   } 

     /**
	 * 	Update TipapmaVrtlAcctNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTipapmaVrtlAcctNum(char[] source, int sourceIndex) throws CFException {
      tipapma.setTipapmaVrtlAcctNum(source, sourceIndex);
   	
   }
   
   public void setTipapmaVrtlAcctNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tipapma.setTipapmaVrtlAcctNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TipapmaVrtlAcctNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTipapmaVrtlAcctNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapma.setTipapmaVrtlAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TipapmaVrtlAcctNum with another Field
	 *	@param value
	 */
   public void setTipapmaVrtlAcctNum(Field source) {
      tipapma.setTipapmaVrtlAcctNum(source);
   }  
   
     /**
	 * 	Update TipapmaVrtlAcctNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTipapmaVrtlAcctNum(Field source, int sourceIndex,int sourceLen) {
      tipapma.setTipapmaVrtlAcctNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TipapmaVrtlAcctNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTipapmaVrtlAcctNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapma.setTipapmaVrtlAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of sqlerrd
	 *	@return sqlerrd
	 */
	public int getSqlerrd(int index) throws CFException {        
   		return sqlca.getSqlerrd((index));
	}
	
	/**
	 * 	Update Sqlerrd with the passed value
	 *	@param number
	 */
	public void setSqlerrd(int index,int number)  throws CFException{
		sqlca.setSqlerrd((index),number);
	}


	public void setSqlerrd(int index,long number)  throws CFException{
		sqlca.setSqlerrd((index),(int)number);
	}


	/**
	 *	Returns the value of valueZero300
	 *	@return valueZero300
	 */
	public short getValueZero300() throws CFException {        
   		return constants300.getValueZero300();
	}
	
	/**
	 * 	Update ValueZero300 with the passed value
	 *	@param number
	 */
	public void setValueZero300(short number)  throws CFException{
		constants300.setValueZero300(number);
	}

	public void setValueZero300(int number)  throws CFException{
		constants300.setValueZero300((short)number);
	}

	public void setValueZero300(long number)  throws CFException{
		constants300.setValueZero300((short)number);
	}



	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of para3220300
	 *	@return para3220300
	 */
   public char[] getPara3220300() throws CFException  {              
   		return work.getPara3220300();
   }

  
	/**
	*  set variable para3220300
	*  @param value
	**/
   public void setPara3220300(char[] value) throws CFException {
      work.setPara3220300(value);
   } 

	/**
	 *	Returns the value of sqlerrmc
	 *	@return sqlerrmc
	 */
   public char[] getSqlerrmc() throws CFException  {              
   		return sqlca.getSqlerrm().getSqlerrmc();
   }

  
	/**
	*  set variable sqlerrmc
	*  @param value
	**/
   public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
   } 

     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
   	
   }
   
   public void setSqlerrmc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlerrmc with another Field
	 *	@param value
	 */
   public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
   }  
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }

        public FetchUpdatePmaCursorOutCtx getFetchUpdatePmaCursorOutCtx() {
            return new FetchUpdatePmaCursorOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlAbendMsg900.hashCode();
        str += tipapma.hashCode();
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += work.hashCode();
        str += constants300.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public FetchUpdatePmaCursorInCtx clone() {
        FetchUpdatePmaCursorInCtx cloneObj = new FetchUpdatePmaCursorInCtx();
        cloneObj.sqlAbendMsg900 = new SqlAbendMsg900();
        cloneObj.sqlAbendMsg900.set(sqlAbendMsg900.getClonedField());
        cloneObj.tipapma = new Tipapma();
        cloneObj.tipapma.set(tipapma.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public FetchUpdatePmaCursorInCtx getFetchUpdatePmaCursorInCtx() {
            return new FetchUpdatePmaCursorInCtx();
    }
     public class FetchUpdatePmaCursorOutCtx implements Cloneable {
     SqlAbendMsg900 sqlAbendMsg900 = Ip343690Ctx.this.getSqlAbendMsg900();
     Tipapma tipapma = Ip343690Ctx.this.getTipapma();
     AbendMessage900 abendMessage900 = Ip343690Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip343690Ctx.this.getAbendParaName900();
     Work work = Ip343690Ctx.this.getWork();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();
     Sqlca sqlca = Ip343690Ctx.this.getSqlca();

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
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of abendSqlCode900
	 *	@return abendSqlCode900
	 */
   public char[] getAbendSqlCode900() throws CFException  {              
   		return sqlAbendMsg900.getAbendSqlCode900();
   }

  
	/**
	*  set variable abendSqlCode900
	*  @param value
	**/
   public void setAbendSqlCode900(char[] value) throws CFException {
      sqlAbendMsg900.setAbendSqlCode900(value);
   } 

     /**
	 * 	Update AbendSqlCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendSqlCode900(char[] source, int sourceIndex) throws CFException {
      sqlAbendMsg900.setAbendSqlCode900(source, sourceIndex);
   	
   }
   
   public void setAbendSqlCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlAbendMsg900.setAbendSqlCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendSqlCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendSqlCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlAbendMsg900.setAbendSqlCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendSqlCode900 with another Field
	 *	@param value
	 */
   public void setAbendSqlCode900(Field source) {
      sqlAbendMsg900.setAbendSqlCode900(source);
   }  
   
     /**
	 * 	Update AbendSqlCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendSqlCode900(Field source, int sourceIndex,int sourceLen) {
      sqlAbendMsg900.setAbendSqlCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendSqlCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendSqlCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlAbendMsg900.setAbendSqlCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of para3220300
	 *	@return para3220300
	 */
   public char[] getPara3220300() throws CFException  {              
   		return work.getPara3220300();
   }

  
	/**
	*  set variable para3220300
	*  @param value
	**/
   public void setPara3220300(char[] value) throws CFException {
      work.setPara3220300(value);
   } 

	/**
	 *	Test condition "Y" for isItIsSqlError88100()
	 *	@return  Returns true if isItIsSqlError88100() is "Y"
	 */
   public boolean isItIsSqlError88100() throws CFException {
      return work.isItIsSqlError88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsSqlError88100True()  throws CFException{  			
    	work.setItIsSqlError88100True();
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
	 *	Returns the value of tipapma
	 *	@return tipapma
	 */   
	 public Tipapma getTipapma() {
   	return tipapma;
   }


	/**
	 *	Returns the value of fetchPmaAbendCode300
	 *	@return fetchPmaAbendCode300
	 */
   public char[] getFetchPmaAbendCode300() throws CFException  {              
   		return constants300.getFetchPmaAbendCode300();
   }

  
	/**
	*  set variable fetchPmaAbendCode300
	*  @param value
	**/
   public void setFetchPmaAbendCode300(char[] value) throws CFException {
      constants300.setFetchPmaAbendCode300(value);
   } 

     /**
	 * 	Update FetchPmaAbendCode300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFetchPmaAbendCode300(char[] source, int sourceIndex) throws CFException {
      constants300.setFetchPmaAbendCode300(source, sourceIndex);
   	
   }
   
   public void setFetchPmaAbendCode300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      constants300.setFetchPmaAbendCode300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update FetchPmaAbendCode300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFetchPmaAbendCode300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setFetchPmaAbendCode300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update FetchPmaAbendCode300 with another Field
	 *	@param value
	 */
   public void setFetchPmaAbendCode300(Field source) {
      constants300.setFetchPmaAbendCode300(source);
   }  
   
     /**
	 * 	Update FetchPmaAbendCode300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFetchPmaAbendCode300(Field source, int sourceIndex,int sourceLen) {
      constants300.setFetchPmaAbendCode300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update FetchPmaAbendCode300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFetchPmaAbendCode300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setFetchPmaAbendCode300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendSqlerrmc900
	 *	@return abendSqlerrmc900
	 */
   public char[] getAbendSqlerrmc900() throws CFException  {              
   		return sqlAbendMsg900.getAbendSqlerrmc900();
   }

  
	/**
	*  set variable abendSqlerrmc900
	*  @param value
	**/
   public void setAbendSqlerrmc900(char[] value) throws CFException {
      sqlAbendMsg900.setAbendSqlerrmc900(value);
   } 

     /**
	 * 	Update AbendSqlerrmc900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendSqlerrmc900(char[] source, int sourceIndex) throws CFException {
      sqlAbendMsg900.setAbendSqlerrmc900(source, sourceIndex);
   	
   }
   
   public void setAbendSqlerrmc900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlAbendMsg900.setAbendSqlerrmc900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendSqlerrmc900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendSqlerrmc900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlAbendMsg900.setAbendSqlerrmc900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendSqlerrmc900 with another Field
	 *	@param value
	 */
   public void setAbendSqlerrmc900(Field source) {
      sqlAbendMsg900.setAbendSqlerrmc900(source);
   }  
   
     /**
	 * 	Update AbendSqlerrmc900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendSqlerrmc900(Field source, int sourceIndex,int sourceLen) {
      sqlAbendMsg900.setAbendSqlerrmc900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendSqlerrmc900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendSqlerrmc900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlAbendMsg900.setAbendSqlerrmc900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "Y" for isItIsDeadLockY88()
	 *	@return  Returns true if isItIsDeadLockY88() is "Y"
	 */
   public boolean isItIsDeadLockY88() throws CFException {
      return work.isItIsDeadLockY88();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsDeadLockY88True()  throws CFException{  			
    	work.setItIsDeadLockY88True();
   	}
	/**
	 *	Returns the value of sqlerrmc
	 *	@return sqlerrmc
	 */
   public char[] getSqlerrmc() throws CFException  {              
   		return sqlca.getSqlerrm().getSqlerrmc();
   }

  
	/**
	*  set variable sqlerrmc
	*  @param value
	**/
   public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
   } 

     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
   	
   }
   
   public void setSqlerrmc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlerrmc with another Field
	 *	@param value
	 */
   public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
   }  
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "Y" for isEofPmaCursor88100()
	 *	@return  Returns true if isEofPmaCursor88100() is "Y"
	 */
   public boolean isEofPmaCursor88100() throws CFException {
      return work.isEofPmaCursor88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setEofPmaCursor88100True()  throws CFException{  			
    	work.setEofPmaCursor88100True();
   	}
	/**
	 *	Test condition "N" for isItIsDeadLockN88()
	 *	@return  Returns true if isItIsDeadLockN88() is "N"
	 */
   public boolean isItIsDeadLockN88() throws CFException {
      return work.isItIsDeadLockN88();
   }

	/**
	*  set values "N"
	*/
   	public void setItIsDeadLockN88True()  throws CFException{  			
    	work.setItIsDeadLockN88True();
   	}

        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlAbendMsg900.hashCode();
        str += tipapma.hashCode();
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += work.hashCode();
        str += constants300.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public FetchUpdatePmaCursorOutCtx clone() {
        FetchUpdatePmaCursorOutCtx cloneObj = new FetchUpdatePmaCursorOutCtx();
        cloneObj.sqlAbendMsg900 = new SqlAbendMsg900();
        cloneObj.sqlAbendMsg900.set(sqlAbendMsg900.getClonedField());
        cloneObj.tipapma = new Tipapma();
        cloneObj.tipapma.set(tipapma.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public FetchUpdatePmaCursorOutCtx getFetchUpdatePmaCursorOutCtx() {
            return new FetchUpdatePmaCursorOutCtx();
    }
     public class ClosePmaCursorInCtx implements Cloneable {
     SqlAbendMsg900 sqlAbendMsg900 = Ip343690Ctx.this.getSqlAbendMsg900();
     AbendMessage900 abendMessage900 = Ip343690Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip343690Ctx.this.getAbendParaName900();
     Work work = Ip343690Ctx.this.getWork();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();
     Sqlca sqlca = Ip343690Ctx.this.getSqlca();

	/**
	 *	Returns the value of sqlwarn
	 *	@return sqlwarn
	 */   
	 public Sqlwarn getSqlwarn() {
   	return sqlca.getSqlwarn();
   }

   /**
	* 	Update Sqlwarn with the passed value
	*	@param value
	*/
   public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
   }   

     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlwarn with another Field
	 *	@param value
	 */
   public void setSqlwarn(Field source) {
   	sqlca.setSqlwarn(source);
   }  
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of closeTipapmaCursor300
	 *	@return closeTipapmaCursor300
	 */
   public char[] getCloseTipapmaCursor300() throws CFException  {              
   		return constants300.getCloseTipapmaCursor300();
   }

  
	/**
	*  set variable closeTipapmaCursor300
	*  @param value
	**/
   public void setCloseTipapmaCursor300(char[] value) throws CFException {
      constants300.setCloseTipapmaCursor300(value);
   } 

     /**
	 * 	Update CloseTipapmaCursor300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCloseTipapmaCursor300(char[] source, int sourceIndex) throws CFException {
      constants300.setCloseTipapmaCursor300(source, sourceIndex);
   	
   }
   
   public void setCloseTipapmaCursor300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      constants300.setCloseTipapmaCursor300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CloseTipapmaCursor300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCloseTipapmaCursor300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setCloseTipapmaCursor300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CloseTipapmaCursor300 with another Field
	 *	@param value
	 */
   public void setCloseTipapmaCursor300(Field source) {
      constants300.setCloseTipapmaCursor300(source);
   }  
   
     /**
	 * 	Update CloseTipapmaCursor300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCloseTipapmaCursor300(Field source, int sourceIndex,int sourceLen) {
      constants300.setCloseTipapmaCursor300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CloseTipapmaCursor300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCloseTipapmaCursor300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setCloseTipapmaCursor300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of sqlerrd
	 *	@return sqlerrd
	 */
	public int getSqlerrd(int index) throws CFException {        
   		return sqlca.getSqlerrd((index));
	}
	
	/**
	 * 	Update Sqlerrd with the passed value
	 *	@param number
	 */
	public void setSqlerrd(int index,int number)  throws CFException{
		sqlca.setSqlerrd((index),number);
	}


	public void setSqlerrd(int index,long number)  throws CFException{
		sqlca.setSqlerrd((index),(int)number);
	}


	/**
	 *	Returns the value of valueZero300
	 *	@return valueZero300
	 */
	public short getValueZero300() throws CFException {        
   		return constants300.getValueZero300();
	}
	
	/**
	 * 	Update ValueZero300 with the passed value
	 *	@param number
	 */
	public void setValueZero300(short number)  throws CFException{
		constants300.setValueZero300(number);
	}

	public void setValueZero300(int number)  throws CFException{
		constants300.setValueZero300((short)number);
	}

	public void setValueZero300(long number)  throws CFException{
		constants300.setValueZero300((short)number);
	}



	/**
	 *	Returns the value of para3230300
	 *	@return para3230300
	 */
   public char[] getPara3230300() throws CFException  {              
   		return work.getPara3230300();
   }

  
	/**
	*  set variable para3230300
	*  @param value
	**/
   public void setPara3230300(char[] value) throws CFException {
      work.setPara3230300(value);
   } 

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of sqlerrmc
	 *	@return sqlerrmc
	 */
   public char[] getSqlerrmc() throws CFException  {              
   		return sqlca.getSqlerrm().getSqlerrmc();
   }

  
	/**
	*  set variable sqlerrmc
	*  @param value
	**/
   public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
   } 

     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
   	
   }
   
   public void setSqlerrmc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlerrmc with another Field
	 *	@param value
	 */
   public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
   }  
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }

        public ClosePmaCursorOutCtx getClosePmaCursorOutCtx() {
            return new ClosePmaCursorOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlAbendMsg900.hashCode();
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += work.hashCode();
        str += constants300.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public ClosePmaCursorInCtx clone() {
        ClosePmaCursorInCtx cloneObj = new ClosePmaCursorInCtx();
        cloneObj.sqlAbendMsg900 = new SqlAbendMsg900();
        cloneObj.sqlAbendMsg900.set(sqlAbendMsg900.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public ClosePmaCursorInCtx getClosePmaCursorInCtx() {
            return new ClosePmaCursorInCtx();
    }
     public class ClosePmaCursorOutCtx implements Cloneable {
     SqlAbendMsg900 sqlAbendMsg900 = Ip343690Ctx.this.getSqlAbendMsg900();
     AbendMessage900 abendMessage900 = Ip343690Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip343690Ctx.this.getAbendParaName900();
     Work work = Ip343690Ctx.this.getWork();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();
     Sqlca sqlca = Ip343690Ctx.this.getSqlca();

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
	 *	Returns the value of closeTipapmaCursor300
	 *	@return closeTipapmaCursor300
	 */
   public char[] getCloseTipapmaCursor300() throws CFException  {              
   		return constants300.getCloseTipapmaCursor300();
   }

  
	/**
	*  set variable closeTipapmaCursor300
	*  @param value
	**/
   public void setCloseTipapmaCursor300(char[] value) throws CFException {
      constants300.setCloseTipapmaCursor300(value);
   } 

     /**
	 * 	Update CloseTipapmaCursor300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCloseTipapmaCursor300(char[] source, int sourceIndex) throws CFException {
      constants300.setCloseTipapmaCursor300(source, sourceIndex);
   	
   }
   
   public void setCloseTipapmaCursor300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      constants300.setCloseTipapmaCursor300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CloseTipapmaCursor300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCloseTipapmaCursor300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setCloseTipapmaCursor300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CloseTipapmaCursor300 with another Field
	 *	@param value
	 */
   public void setCloseTipapmaCursor300(Field source) {
      constants300.setCloseTipapmaCursor300(source);
   }  
   
     /**
	 * 	Update CloseTipapmaCursor300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCloseTipapmaCursor300(Field source, int sourceIndex,int sourceLen) {
      constants300.setCloseTipapmaCursor300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CloseTipapmaCursor300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCloseTipapmaCursor300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setCloseTipapmaCursor300(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of abendSqlerrmc900
	 *	@return abendSqlerrmc900
	 */
   public char[] getAbendSqlerrmc900() throws CFException  {              
   		return sqlAbendMsg900.getAbendSqlerrmc900();
   }

  
	/**
	*  set variable abendSqlerrmc900
	*  @param value
	**/
   public void setAbendSqlerrmc900(char[] value) throws CFException {
      sqlAbendMsg900.setAbendSqlerrmc900(value);
   } 

     /**
	 * 	Update AbendSqlerrmc900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendSqlerrmc900(char[] source, int sourceIndex) throws CFException {
      sqlAbendMsg900.setAbendSqlerrmc900(source, sourceIndex);
   	
   }
   
   public void setAbendSqlerrmc900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlAbendMsg900.setAbendSqlerrmc900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendSqlerrmc900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendSqlerrmc900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlAbendMsg900.setAbendSqlerrmc900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendSqlerrmc900 with another Field
	 *	@param value
	 */
   public void setAbendSqlerrmc900(Field source) {
      sqlAbendMsg900.setAbendSqlerrmc900(source);
   }  
   
     /**
	 * 	Update AbendSqlerrmc900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendSqlerrmc900(Field source, int sourceIndex,int sourceLen) {
      sqlAbendMsg900.setAbendSqlerrmc900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendSqlerrmc900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendSqlerrmc900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlAbendMsg900.setAbendSqlerrmc900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of para3230300
	 *	@return para3230300
	 */
   public char[] getPara3230300() throws CFException  {              
   		return work.getPara3230300();
   }

  
	/**
	*  set variable para3230300
	*  @param value
	**/
   public void setPara3230300(char[] value) throws CFException {
      work.setPara3230300(value);
   } 

	/**
	 *	Returns the value of abendSqlCode900
	 *	@return abendSqlCode900
	 */
   public char[] getAbendSqlCode900() throws CFException  {              
   		return sqlAbendMsg900.getAbendSqlCode900();
   }

  
	/**
	*  set variable abendSqlCode900
	*  @param value
	**/
   public void setAbendSqlCode900(char[] value) throws CFException {
      sqlAbendMsg900.setAbendSqlCode900(value);
   } 

     /**
	 * 	Update AbendSqlCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendSqlCode900(char[] source, int sourceIndex) throws CFException {
      sqlAbendMsg900.setAbendSqlCode900(source, sourceIndex);
   	
   }
   
   public void setAbendSqlCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlAbendMsg900.setAbendSqlCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendSqlCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendSqlCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlAbendMsg900.setAbendSqlCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendSqlCode900 with another Field
	 *	@param value
	 */
   public void setAbendSqlCode900(Field source) {
      sqlAbendMsg900.setAbendSqlCode900(source);
   }  
   
     /**
	 * 	Update AbendSqlCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendSqlCode900(Field source, int sourceIndex,int sourceLen) {
      sqlAbendMsg900.setAbendSqlCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendSqlCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendSqlCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlAbendMsg900.setAbendSqlCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Test condition "Y" for isItIsSqlError88100()
	 *	@return  Returns true if isItIsSqlError88100() is "Y"
	 */
   public boolean isItIsSqlError88100() throws CFException {
      return work.isItIsSqlError88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsSqlError88100True()  throws CFException{  			
    	work.setItIsSqlError88100True();
   	}
	/**
	 *	Returns the value of sqlerrmc
	 *	@return sqlerrmc
	 */
   public char[] getSqlerrmc() throws CFException  {              
   		return sqlca.getSqlerrm().getSqlerrmc();
   }

  
	/**
	*  set variable sqlerrmc
	*  @param value
	**/
   public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
   } 

     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
   	
   }
   
   public void setSqlerrmc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlerrmc with another Field
	 *	@param value
	 */
   public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
   }  
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlAbendMsg900.hashCode();
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += work.hashCode();
        str += constants300.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public ClosePmaCursorOutCtx clone() {
        ClosePmaCursorOutCtx cloneObj = new ClosePmaCursorOutCtx();
        cloneObj.sqlAbendMsg900 = new SqlAbendMsg900();
        cloneObj.sqlAbendMsg900.set(sqlAbendMsg900.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public ClosePmaCursorOutCtx getClosePmaCursorOutCtx() {
            return new ClosePmaCursorOutCtx();
    }
     public class DoEndProcessInCtx implements Cloneable {
     Work work = Ip343690Ctx.this.getWork();

	/**
	 *	Returns the value of recsUpdatedMsg600
	 *	@return recsUpdatedMsg600
	 */
   public char[] getRecsUpdatedMsg600() throws CFException  {              
   		return work.getRecsUpdatedMsg600();
   }

  
	/**
	*  set variable recsUpdatedMsg600
	*  @param value
	**/
   public void setRecsUpdatedMsg600(char[] value) throws CFException {
      work.setRecsUpdatedMsg600(value);
   } 

	/**
	 *	Returns the value of recsReadMsg600
	 *	@return recsReadMsg600
	 */
   public char[] getRecsReadMsg600() throws CFException  {              
   		return work.getRecsReadMsg600();
   }

  
	/**
	*  set variable recsReadMsg600
	*  @param value
	**/
   public void setRecsReadMsg600(char[] value) throws CFException {
      work.setRecsReadMsg600(value);
   } 

	/**
	 *	Returns the value of recsRead400
	 *	@return recsRead400
	 */
	public long getRecsRead400() throws CFException {        
   		return work.getRecsRead400();
	}
	
	/**
	 * 	Update RecsRead400 with the passed value
	 *	@param number
	 */
	public void setRecsRead400(long number)  throws CFException{
		work.setRecsRead400(number);
	}



	/**
	 *	Returns the value of noOfRows800
	 *	@return noOfRows800
	 */
	public long getNoOfRows800() throws CFException {        
   		return work.getNoOfRows800();
	}
	
	/**
	 * 	Update NoOfRows800 with the passed value
	 *	@param number
	 */
	public void setNoOfRows800(long number)  throws CFException{
		work.setNoOfRows800(number);
	}




        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }

        public DoEndProcessOutCtx getDoEndProcessOutCtx() {
            return new DoEndProcessOutCtx();
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

    public DoEndProcessInCtx clone() {
        DoEndProcessInCtx cloneObj = new DoEndProcessInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DoEndProcessInCtx getDoEndProcessInCtx() {
            return new DoEndProcessInCtx();
    }
     public class DoEndProcessOutCtx implements Cloneable {
     Work work = Ip343690Ctx.this.getWork();

	/**
	 *	Test condition "Y" for isEndOfProcess88100()
	 *	@return  Returns true if isEndOfProcess88100() is "Y"
	 */
   public boolean isEndOfProcess88100() throws CFException {
      return work.isEndOfProcess88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setEndOfProcess88100True()  throws CFException{  			
    	work.setEndOfProcess88100True();
   	}

        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
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

    public DoEndProcessOutCtx clone() {
        DoEndProcessOutCtx cloneObj = new DoEndProcessOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DoEndProcessOutCtx getDoEndProcessOutCtx() {
            return new DoEndProcessOutCtx();
    }
     public class CheckDb2ConnectionInCtx implements Cloneable {
     Db2cloneRec db2cloneRec = Ip343690Ctx.this.getDb2cloneRec();
     Db85102dDb2cloneRec db85102dDb2cloneRec = Ip343690Ctx.this.getDb85102dDb2cloneRec();
     Work work = Ip343690Ctx.this.getWork();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();
     Sqlca sqlca = Ip343690Ctx.this.getSqlca();
     Db85102dWorkFields db85102dWorkFields = Ip343690Ctx.this.getDb85102dWorkFields();

	/**
	 *	Returns the value of db85102dCurrCollId
	 *	@return db85102dCurrCollId
	 */
   public char[] getDb85102dCurrCollId() throws CFException  {              
   		return db85102dWorkFields.getDb85102dCurrCollId();
   }

  
	/**
	*  set variable db85102dCurrCollId
	*  @param value
	**/
   public void setDb85102dCurrCollId(char[] value) throws CFException {
      db85102dWorkFields.setDb85102dCurrCollId(value);
   } 

     /**
	 * 	Update Db85102dCurrCollId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb85102dCurrCollId(char[] source, int sourceIndex) throws CFException {
      db85102dWorkFields.setDb85102dCurrCollId(source, sourceIndex);
   	
   }
   
   public void setDb85102dCurrCollId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      db85102dWorkFields.setDb85102dCurrCollId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Db85102dCurrCollId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dCurrCollId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dWorkFields.setDb85102dCurrCollId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Db85102dCurrCollId with another Field
	 *	@param value
	 */
   public void setDb85102dCurrCollId(Field source) {
      db85102dWorkFields.setDb85102dCurrCollId(source);
   }  
   
     /**
	 * 	Update Db85102dCurrCollId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb85102dCurrCollId(Field source, int sourceIndex,int sourceLen) {
      db85102dWorkFields.setDb85102dCurrCollId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Db85102dCurrCollId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dCurrCollId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dWorkFields.setDb85102dCurrCollId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of db85102dDb2CloneNum
	 *	@return db85102dDb2CloneNum
	 */
   public char[] getDb85102dDb2CloneNum() throws CFException  {              
   		return db85102dDb2cloneRec.getDb85102dDb2CloneNum();
   }

  
	/**
	*  set variable db85102dDb2CloneNum
	*  @param value
	**/
   public void setDb85102dDb2CloneNum(char[] value) throws CFException {
      db85102dDb2cloneRec.setDb85102dDb2CloneNum(value);
   } 

     /**
	 * 	Update Db85102dDb2CloneNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb85102dDb2CloneNum(char[] source, int sourceIndex) throws CFException {
      db85102dDb2cloneRec.setDb85102dDb2CloneNum(source, sourceIndex);
   	
   }
   
   public void setDb85102dDb2CloneNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      db85102dDb2cloneRec.setDb85102dDb2CloneNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Db85102dDb2CloneNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dDb2CloneNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dDb2cloneRec.setDb85102dDb2CloneNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Db85102dDb2CloneNum with another Field
	 *	@param value
	 */
   public void setDb85102dDb2CloneNum(Field source) {
      db85102dDb2cloneRec.setDb85102dDb2CloneNum(source);
   }  
   
     /**
	 * 	Update Db85102dDb2CloneNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb85102dDb2CloneNum(Field source, int sourceIndex,int sourceLen) {
      db85102dDb2cloneRec.setDb85102dDb2CloneNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Db85102dDb2CloneNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dDb2CloneNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dDb2cloneRec.setDb85102dDb2CloneNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of sqlerrd
	 *	@return sqlerrd
	 */
	public int getSqlerrd(int index) throws CFException {        
   		return sqlca.getSqlerrd((index));
	}
	
	/**
	 * 	Update Sqlerrd with the passed value
	 *	@param number
	 */
	public void setSqlerrd(int index,int number)  throws CFException{
		sqlca.setSqlerrd((index),number);
	}


	public void setSqlerrd(int index,long number)  throws CFException{
		sqlca.setSqlerrd((index),(int)number);
	}


	/**
	 *	Returns the value of db85102dDb2cloneRec
	 *	@return db85102dDb2cloneRec
	 */   
	 public Db85102dDb2cloneRec getDb85102dDb2cloneRec() {
   	return db85102dDb2cloneRec;
   }


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of db85102dDb2CurrServer
	 *	@return db85102dDb2CurrServer
	 */
   public char[] getDb85102dDb2CurrServer() throws CFException  {              
   		return db85102dWorkFields.getDb85102dDb2CurrServer();
   }

  
	/**
	*  set variable db85102dDb2CurrServer
	*  @param value
	**/
   public void setDb85102dDb2CurrServer(char[] value) throws CFException {
      db85102dWorkFields.setDb85102dDb2CurrServer(value);
   } 

     /**
	 * 	Update Db85102dDb2CurrServer 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb85102dDb2CurrServer(char[] source, int sourceIndex) throws CFException {
      db85102dWorkFields.setDb85102dDb2CurrServer(source, sourceIndex);
   	
   }
   
   public void setDb85102dDb2CurrServer(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      db85102dWorkFields.setDb85102dDb2CurrServer(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Db85102dDb2CurrServer 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dDb2CurrServer(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dWorkFields.setDb85102dDb2CurrServer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Db85102dDb2CurrServer with another Field
	 *	@param value
	 */
   public void setDb85102dDb2CurrServer(Field source) {
      db85102dWorkFields.setDb85102dDb2CurrServer(source);
   }  
   
     /**
	 * 	Update Db85102dDb2CurrServer 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb85102dDb2CurrServer(Field source, int sourceIndex,int sourceLen) {
      db85102dWorkFields.setDb85102dDb2CurrServer(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Db85102dDb2CurrServer 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dDb2CurrServer(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dWorkFields.setDb85102dDb2CurrServer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of db85102dConnectStatusMap
	 *	@return db85102dConnectStatusMap
	 */
   public char[] getDb85102dConnectStatusMap() throws CFException  {              
   		return db85102dWorkFields.getDb85102dConnectStatusMap();
   }

  
	/**
	*  set variable db85102dConnectStatusMap
	*  @param value
	**/
   public void setDb85102dConnectStatusMap(char[] value) throws CFException {
      db85102dWorkFields.setDb85102dConnectStatusMap(value);
   } 

     /**
	 * 	Update Db85102dConnectStatusMap 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb85102dConnectStatusMap(char[] source, int sourceIndex) throws CFException {
      db85102dWorkFields.setDb85102dConnectStatusMap(source, sourceIndex);
   	
   }
   
   public void setDb85102dConnectStatusMap(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      db85102dWorkFields.setDb85102dConnectStatusMap(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Db85102dConnectStatusMap 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dConnectStatusMap(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dWorkFields.setDb85102dConnectStatusMap(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Db85102dConnectStatusMap with another Field
	 *	@param value
	 */
   public void setDb85102dConnectStatusMap(Field source) {
      db85102dWorkFields.setDb85102dConnectStatusMap(source);
   }  
   
     /**
	 * 	Update Db85102dConnectStatusMap 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb85102dConnectStatusMap(Field source, int sourceIndex,int sourceLen) {
      db85102dWorkFields.setDb85102dConnectStatusMap(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Db85102dConnectStatusMap 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dConnectStatusMap(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dWorkFields.setDb85102dConnectStatusMap(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlwarn
	 *	@return sqlwarn
	 */   
	 public Sqlwarn getSqlwarn() {
   	return sqlca.getSqlwarn();
   }

   /**
	* 	Update Sqlwarn with the passed value
	*	@param value
	*/
   public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
   }   

     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlwarn with another Field
	 *	@param value
	 */
   public void setSqlwarn(Field source) {
   	sqlca.setSqlwarn(source);
   }  
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of db85102dDb2User
	 *	@return db85102dDb2User
	 */
   public char[] getDb85102dDb2User() throws CFException  {              
   		return db85102dWorkFields.getDb85102dDb2User();
   }

  
	/**
	*  set variable db85102dDb2User
	*  @param value
	**/
   public void setDb85102dDb2User(char[] value) throws CFException {
      db85102dWorkFields.setDb85102dDb2User(value);
   } 

     /**
	 * 	Update Db85102dDb2User 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb85102dDb2User(char[] source, int sourceIndex) throws CFException {
      db85102dWorkFields.setDb85102dDb2User(source, sourceIndex);
   	
   }
   
   public void setDb85102dDb2User(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      db85102dWorkFields.setDb85102dDb2User(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Db85102dDb2User 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dDb2User(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dWorkFields.setDb85102dDb2User(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Db85102dDb2User with another Field
	 *	@param value
	 */
   public void setDb85102dDb2User(Field source) {
      db85102dWorkFields.setDb85102dDb2User(source);
   }  
   
     /**
	 * 	Update Db85102dDb2User 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb85102dDb2User(Field source, int sourceIndex,int sourceLen) {
      db85102dWorkFields.setDb85102dDb2User(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Db85102dDb2User 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dDb2User(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dWorkFields.setDb85102dDb2User(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of constants300
	 *	@return constants300
	 */   
	 public Constants300 getConstants300() {
   	return constants300;
   }


	/**
	 *	Returns the value of db85102dDb2CurrSqlid
	 *	@return db85102dDb2CurrSqlid
	 */
   public char[] getDb85102dDb2CurrSqlid() throws CFException  {              
   		return db85102dWorkFields.getDb85102dDb2CurrSqlid();
   }

  
	/**
	*  set variable db85102dDb2CurrSqlid
	*  @param value
	**/
   public void setDb85102dDb2CurrSqlid(char[] value) throws CFException {
      db85102dWorkFields.setDb85102dDb2CurrSqlid(value);
   } 

     /**
	 * 	Update Db85102dDb2CurrSqlid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb85102dDb2CurrSqlid(char[] source, int sourceIndex) throws CFException {
      db85102dWorkFields.setDb85102dDb2CurrSqlid(source, sourceIndex);
   	
   }
   
   public void setDb85102dDb2CurrSqlid(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      db85102dWorkFields.setDb85102dDb2CurrSqlid(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Db85102dDb2CurrSqlid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dDb2CurrSqlid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dWorkFields.setDb85102dDb2CurrSqlid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Db85102dDb2CurrSqlid with another Field
	 *	@param value
	 */
   public void setDb85102dDb2CurrSqlid(Field source) {
      db85102dWorkFields.setDb85102dDb2CurrSqlid(source);
   }  
   
     /**
	 * 	Update Db85102dDb2CurrSqlid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb85102dDb2CurrSqlid(Field source, int sourceIndex,int sourceLen) {
      db85102dWorkFields.setDb85102dDb2CurrSqlid(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Db85102dDb2CurrSqlid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dDb2CurrSqlid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dWorkFields.setDb85102dDb2CurrSqlid(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of thisPgmDb2CollIdBase300
	 *	@return thisPgmDb2CollIdBase300
	 */
   public char[] getThisPgmDb2CollIdBase300() throws CFException  {              
   		return constants300.getThisPgmDb2CollIdBase300();
   }

  
	/**
	*  set variable thisPgmDb2CollIdBase300
	*  @param value
	**/
   public void setThisPgmDb2CollIdBase300(char[] value) throws CFException {
      constants300.setThisPgmDb2CollIdBase300(value);
   } 

     /**
	 * 	Update ThisPgmDb2CollIdBase300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setThisPgmDb2CollIdBase300(char[] source, int sourceIndex) throws CFException {
      constants300.setThisPgmDb2CollIdBase300(source, sourceIndex);
   	
   }
   
   public void setThisPgmDb2CollIdBase300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      constants300.setThisPgmDb2CollIdBase300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ThisPgmDb2CollIdBase300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setThisPgmDb2CollIdBase300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setThisPgmDb2CollIdBase300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ThisPgmDb2CollIdBase300 with another Field
	 *	@param value
	 */
   public void setThisPgmDb2CollIdBase300(Field source) {
      constants300.setThisPgmDb2CollIdBase300(source);
   }  
   
     /**
	 * 	Update ThisPgmDb2CollIdBase300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setThisPgmDb2CollIdBase300(Field source, int sourceIndex,int sourceLen) {
      constants300.setThisPgmDb2CollIdBase300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ThisPgmDb2CollIdBase300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setThisPgmDb2CollIdBase300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setThisPgmDb2CollIdBase300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of db85102dWorkFields
	 *	@return db85102dWorkFields
	 */   
	 public Db85102dWorkFields getDb85102dWorkFields() {
   	return db85102dWorkFields;
   }


	/**
	 *	Returns the value of sqlerrmc
	 *	@return sqlerrmc
	 */
   public char[] getSqlerrmc() throws CFException  {              
   		return sqlca.getSqlerrm().getSqlerrmc();
   }

  
	/**
	*  set variable sqlerrmc
	*  @param value
	**/
   public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
   } 

     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
   	
   }
   
   public void setSqlerrmc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlerrmc with another Field
	 *	@param value
	 */
   public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
   }  
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }

        public CheckDb2ConnectionOutCtx getCheckDb2ConnectionOutCtx() {
            return new CheckDb2ConnectionOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += db2cloneRec.hashCode();
        str += db85102dDb2cloneRec.hashCode();
        str += work.hashCode();
        str += constants300.hashCode();
        str += sqlca.hashCode();
        str += db85102dWorkFields.hashCode();
       return str.hashCode();
    }

    public CheckDb2ConnectionInCtx clone() {
        CheckDb2ConnectionInCtx cloneObj = new CheckDb2ConnectionInCtx();
        cloneObj.db2cloneRec = new Db2cloneRec();
        cloneObj.db2cloneRec.set(db2cloneRec.getClonedField());
        cloneObj.db85102dDb2cloneRec = new Db85102dDb2cloneRec();
        cloneObj.db85102dDb2cloneRec.set(db85102dDb2cloneRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.db85102dWorkFields = new Db85102dWorkFields();
        cloneObj.db85102dWorkFields.set(db85102dWorkFields.getClonedField());
        return cloneObj;
    }

    }

    public CheckDb2ConnectionInCtx getCheckDb2ConnectionInCtx() {
            return new CheckDb2ConnectionInCtx();
    }
     public class CheckDb2ConnectionOutCtx implements Cloneable {
     Db2cloneRec db2cloneRec = Ip343690Ctx.this.getDb2cloneRec();
     Work work = Ip343690Ctx.this.getWork();
     Db85102dDb2cloneRec db85102dDb2cloneRec = Ip343690Ctx.this.getDb85102dDb2cloneRec();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();
     Sqlca sqlca = Ip343690Ctx.this.getSqlca();
     Db85102dWorkFields db85102dWorkFields = Ip343690Ctx.this.getDb85102dWorkFields();

	/**
	 *	Returns the value of db85102dCurrCollId
	 *	@return db85102dCurrCollId
	 */
   public char[] getDb85102dCurrCollId() throws CFException  {              
   		return db85102dWorkFields.getDb85102dCurrCollId();
   }

  
	/**
	*  set variable db85102dCurrCollId
	*  @param value
	**/
   public void setDb85102dCurrCollId(char[] value) throws CFException {
      db85102dWorkFields.setDb85102dCurrCollId(value);
   } 

     /**
	 * 	Update Db85102dCurrCollId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb85102dCurrCollId(char[] source, int sourceIndex) throws CFException {
      db85102dWorkFields.setDb85102dCurrCollId(source, sourceIndex);
   	
   }
   
   public void setDb85102dCurrCollId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      db85102dWorkFields.setDb85102dCurrCollId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Db85102dCurrCollId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dCurrCollId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dWorkFields.setDb85102dCurrCollId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Db85102dCurrCollId with another Field
	 *	@param value
	 */
   public void setDb85102dCurrCollId(Field source) {
      db85102dWorkFields.setDb85102dCurrCollId(source);
   }  
   
     /**
	 * 	Update Db85102dCurrCollId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb85102dCurrCollId(Field source, int sourceIndex,int sourceLen) {
      db85102dWorkFields.setDb85102dCurrCollId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Db85102dCurrCollId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dCurrCollId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dWorkFields.setDb85102dCurrCollId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of db85102dDb2CloneNum
	 *	@return db85102dDb2CloneNum
	 */
   public char[] getDb85102dDb2CloneNum() throws CFException  {              
   		return db85102dDb2cloneRec.getDb85102dDb2CloneNum();
   }

  
	/**
	*  set variable db85102dDb2CloneNum
	*  @param value
	**/
   public void setDb85102dDb2CloneNum(char[] value) throws CFException {
      db85102dDb2cloneRec.setDb85102dDb2CloneNum(value);
   } 

     /**
	 * 	Update Db85102dDb2CloneNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb85102dDb2CloneNum(char[] source, int sourceIndex) throws CFException {
      db85102dDb2cloneRec.setDb85102dDb2CloneNum(source, sourceIndex);
   	
   }
   
   public void setDb85102dDb2CloneNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      db85102dDb2cloneRec.setDb85102dDb2CloneNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Db85102dDb2CloneNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dDb2CloneNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dDb2cloneRec.setDb85102dDb2CloneNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Db85102dDb2CloneNum with another Field
	 *	@param value
	 */
   public void setDb85102dDb2CloneNum(Field source) {
      db85102dDb2cloneRec.setDb85102dDb2CloneNum(source);
   }  
   
     /**
	 * 	Update Db85102dDb2CloneNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb85102dDb2CloneNum(Field source, int sourceIndex,int sourceLen) {
      db85102dDb2cloneRec.setDb85102dDb2CloneNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Db85102dDb2CloneNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dDb2CloneNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dDb2cloneRec.setDb85102dDb2CloneNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlTemp
	 *	@return sqlTemp
	 */
   public char[] getSqlTemp() throws CFException  {              
   		return work.getSqlTemp();
   }

  
	/**
	*  set variable sqlTemp
	*  @param value
	**/
   public void setSqlTemp(char[] value) throws CFException {
      work.setSqlTemp(value);
   } 

	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of db2cloneRec
	 *	@return db2cloneRec
	 */   
	 public Db2cloneRec getDb2cloneRec() {
   	return db2cloneRec;
   }


	/**
	 *	Test condition "00" for isDb85102dDb2cloneIoGood88()
	 *	@return  Returns true if isDb85102dDb2cloneIoGood88() is "00"
	 */
   public boolean isDb85102dDb2cloneIoGood88() throws CFException {
      return db85102dWorkFields.isDb85102dDb2cloneIoGood88();
   }

	/**
	*  set values "00"
	*/
   	public void setDb85102dDb2cloneIoGood88True()  throws CFException{  			
    	db85102dWorkFields.setDb85102dDb2cloneIoGood88True();
   	}
	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of db85102dConnectStatusMap
	 *	@return db85102dConnectStatusMap
	 */
   public char[] getDb85102dConnectStatusMap() throws CFException  {              
   		return db85102dWorkFields.getDb85102dConnectStatusMap();
   }

  
	/**
	*  set variable db85102dConnectStatusMap
	*  @param value
	**/
   public void setDb85102dConnectStatusMap(char[] value) throws CFException {
      db85102dWorkFields.setDb85102dConnectStatusMap(value);
   } 

     /**
	 * 	Update Db85102dConnectStatusMap 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb85102dConnectStatusMap(char[] source, int sourceIndex) throws CFException {
      db85102dWorkFields.setDb85102dConnectStatusMap(source, sourceIndex);
   	
   }
   
   public void setDb85102dConnectStatusMap(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      db85102dWorkFields.setDb85102dConnectStatusMap(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Db85102dConnectStatusMap 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dConnectStatusMap(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dWorkFields.setDb85102dConnectStatusMap(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Db85102dConnectStatusMap with another Field
	 *	@param value
	 */
   public void setDb85102dConnectStatusMap(Field source) {
      db85102dWorkFields.setDb85102dConnectStatusMap(source);
   }  
   
     /**
	 * 	Update Db85102dConnectStatusMap 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb85102dConnectStatusMap(Field source, int sourceIndex,int sourceLen) {
      db85102dWorkFields.setDb85102dConnectStatusMap(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Db85102dConnectStatusMap 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dConnectStatusMap(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dWorkFields.setDb85102dConnectStatusMap(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of db85102dDb2cloneStatus
	 *	@return db85102dDb2cloneStatus
	 */
   public char[] getDb85102dDb2cloneStatus() throws CFException  {              
   		return db85102dWorkFields.getDb85102dDb2cloneStatus();
   }

  
	/**
	*  set variable db85102dDb2cloneStatus
	*  @param value
	**/
   public void setDb85102dDb2cloneStatus(char[] value) throws CFException {
      db85102dWorkFields.setDb85102dDb2cloneStatus(value);
   } 

     /**
	 * 	Update Db85102dDb2cloneStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb85102dDb2cloneStatus(char[] source, int sourceIndex) throws CFException {
      db85102dWorkFields.setDb85102dDb2cloneStatus(source, sourceIndex);
   	
   }
   
   public void setDb85102dDb2cloneStatus(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      db85102dWorkFields.setDb85102dDb2cloneStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Db85102dDb2cloneStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dDb2cloneStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dWorkFields.setDb85102dDb2cloneStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Db85102dDb2cloneStatus with another Field
	 *	@param value
	 */
   public void setDb85102dDb2cloneStatus(Field source) {
      db85102dWorkFields.setDb85102dDb2cloneStatus(source);
   }  
   
     /**
	 * 	Update Db85102dDb2cloneStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb85102dDb2cloneStatus(Field source, int sourceIndex,int sourceLen) {
      db85102dWorkFields.setDb85102dDb2cloneStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Db85102dDb2cloneStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dDb2cloneStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dWorkFields.setDb85102dDb2cloneStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of db85102dTempCollId
	 *	@return db85102dTempCollId
	 */
   public char[] getDb85102dTempCollId() throws CFException  {              
   		return db85102dWorkFields.getDb85102dTempCollId();
   }

  
	/**
	*  set variable db85102dTempCollId
	*  @param value
	**/
   public void setDb85102dTempCollId(char[] value) throws CFException {
      db85102dWorkFields.setDb85102dTempCollId(value);
   } 

     /**
	 * 	Update Db85102dTempCollId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb85102dTempCollId(char[] source, int sourceIndex) throws CFException {
      db85102dWorkFields.setDb85102dTempCollId(source, sourceIndex);
   	
   }
   
   public void setDb85102dTempCollId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      db85102dWorkFields.setDb85102dTempCollId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Db85102dTempCollId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dTempCollId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dWorkFields.setDb85102dTempCollId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Db85102dTempCollId with another Field
	 *	@param value
	 */
   public void setDb85102dTempCollId(Field source) {
      db85102dWorkFields.setDb85102dTempCollId(source);
   }  
   
     /**
	 * 	Update Db85102dTempCollId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb85102dTempCollId(Field source, int sourceIndex,int sourceLen) {
      db85102dWorkFields.setDb85102dTempCollId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Db85102dTempCollId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dTempCollId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dWorkFields.setDb85102dTempCollId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of thisPgmDb2CollIdBase300
	 *	@return thisPgmDb2CollIdBase300
	 */
   public char[] getThisPgmDb2CollIdBase300() throws CFException  {              
   		return constants300.getThisPgmDb2CollIdBase300();
   }

  
	/**
	*  set variable thisPgmDb2CollIdBase300
	*  @param value
	**/
   public void setThisPgmDb2CollIdBase300(char[] value) throws CFException {
      constants300.setThisPgmDb2CollIdBase300(value);
   } 

     /**
	 * 	Update ThisPgmDb2CollIdBase300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setThisPgmDb2CollIdBase300(char[] source, int sourceIndex) throws CFException {
      constants300.setThisPgmDb2CollIdBase300(source, sourceIndex);
   	
   }
   
   public void setThisPgmDb2CollIdBase300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      constants300.setThisPgmDb2CollIdBase300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ThisPgmDb2CollIdBase300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setThisPgmDb2CollIdBase300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setThisPgmDb2CollIdBase300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ThisPgmDb2CollIdBase300 with another Field
	 *	@param value
	 */
   public void setThisPgmDb2CollIdBase300(Field source) {
      constants300.setThisPgmDb2CollIdBase300(source);
   }  
   
     /**
	 * 	Update ThisPgmDb2CollIdBase300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setThisPgmDb2CollIdBase300(Field source, int sourceIndex,int sourceLen) {
      constants300.setThisPgmDb2CollIdBase300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ThisPgmDb2CollIdBase300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setThisPgmDb2CollIdBase300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setThisPgmDb2CollIdBase300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of db85102dWorkFields
	 *	@return db85102dWorkFields
	 */   
	 public Db85102dWorkFields getDb85102dWorkFields() {
   	return db85102dWorkFields;
   }


	/**
	 *	Returns the value of db85102dPrevCollId
	 *	@return db85102dPrevCollId
	 */
   public char[] getDb85102dPrevCollId() throws CFException  {              
   		return db85102dWorkFields.getDb85102dPrevCollId();
   }

  
	/**
	*  set variable db85102dPrevCollId
	*  @param value
	**/
   public void setDb85102dPrevCollId(char[] value) throws CFException {
      db85102dWorkFields.setDb85102dPrevCollId(value);
   } 

     /**
	 * 	Update Db85102dPrevCollId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb85102dPrevCollId(char[] source, int sourceIndex) throws CFException {
      db85102dWorkFields.setDb85102dPrevCollId(source, sourceIndex);
   	
   }
   
   public void setDb85102dPrevCollId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      db85102dWorkFields.setDb85102dPrevCollId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Db85102dPrevCollId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dPrevCollId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dWorkFields.setDb85102dPrevCollId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Db85102dPrevCollId with another Field
	 *	@param value
	 */
   public void setDb85102dPrevCollId(Field source) {
      db85102dWorkFields.setDb85102dPrevCollId(source);
   }  
   
     /**
	 * 	Update Db85102dPrevCollId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb85102dPrevCollId(Field source, int sourceIndex,int sourceLen) {
      db85102dWorkFields.setDb85102dPrevCollId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Db85102dPrevCollId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dPrevCollId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dWorkFields.setDb85102dPrevCollId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += db2cloneRec.hashCode();
        str += work.hashCode();
        str += db85102dDb2cloneRec.hashCode();
        str += constants300.hashCode();
        str += sqlca.hashCode();
        str += db85102dWorkFields.hashCode();
       return str.hashCode();
    }

    public CheckDb2ConnectionOutCtx clone() {
        CheckDb2ConnectionOutCtx cloneObj = new CheckDb2ConnectionOutCtx();
        cloneObj.db2cloneRec = new Db2cloneRec();
        cloneObj.db2cloneRec.set(db2cloneRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.db85102dDb2cloneRec = new Db85102dDb2cloneRec();
        cloneObj.db85102dDb2cloneRec.set(db85102dDb2cloneRec.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.db85102dWorkFields = new Db85102dWorkFields();
        cloneObj.db85102dWorkFields.set(db85102dWorkFields.getClonedField());
        return cloneObj;
    }

    }

    public CheckDb2ConnectionOutCtx getCheckDb2ConnectionOutCtx() {
            return new CheckDb2ConnectionOutCtx();
    }
     public class CheckStatusMapInCtx implements Cloneable {
     Db2Workarea800 db2Workarea800 = Ip343690Ctx.this.getDb2Workarea800();
     AbendParaName900 abendParaName900 = Ip343690Ctx.this.getAbendParaName900();
     AbendMessage900 abendMessage900 = Ip343690Ctx.this.getAbendMessage900();
     DbConnectError8023005 dbConnectError8023005 = Ip343690Ctx.this.getDbConnectError8023005();
     Work work = Ip343690Ctx.this.getWork();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();
     ApiLayout apiLayout = Ip343690Ctx.this.getApiLayout();
     Msg3001a600 msg3001a600 = Ip343690Ctx.this.getMsg3001a600();
     Db85102dWorkFields db85102dWorkFields = Ip343690Ctx.this.getDb85102dWorkFields();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip343690Ctx.this.getIp60001EventLogWorkArea();

	/**
	 *	Returns the value of msg3005d600
	 *	@return msg3005d600
	 */
   public char[] getMsg3005d600() throws CFException  {              
   		return work.getMsg3005d600();
   }

  
	/**
	*  set variable msg3005d600
	*  @param value
	**/
   public void setMsg3005d600(char[] value) throws CFException {
      work.setMsg3005d600(value);
   } 

	/**
	 *	Returns the value of db85102dConnectStatusMap
	 *	@return db85102dConnectStatusMap
	 */
   public char[] getDb85102dConnectStatusMap() throws CFException  {              
   		return db85102dWorkFields.getDb85102dConnectStatusMap();
   }

  
	/**
	*  set variable db85102dConnectStatusMap
	*  @param value
	**/
   public void setDb85102dConnectStatusMap(char[] value) throws CFException {
      db85102dWorkFields.setDb85102dConnectStatusMap(value);
   } 

     /**
	 * 	Update Db85102dConnectStatusMap 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb85102dConnectStatusMap(char[] source, int sourceIndex) throws CFException {
      db85102dWorkFields.setDb85102dConnectStatusMap(source, sourceIndex);
   	
   }
   
   public void setDb85102dConnectStatusMap(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      db85102dWorkFields.setDb85102dConnectStatusMap(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Db85102dConnectStatusMap 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dConnectStatusMap(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dWorkFields.setDb85102dConnectStatusMap(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Db85102dConnectStatusMap with another Field
	 *	@param value
	 */
   public void setDb85102dConnectStatusMap(Field source) {
      db85102dWorkFields.setDb85102dConnectStatusMap(source);
   }  
   
     /**
	 * 	Update Db85102dConnectStatusMap 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb85102dConnectStatusMap(Field source, int sourceIndex,int sourceLen) {
      db85102dWorkFields.setDb85102dConnectStatusMap(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Db85102dConnectStatusMap 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dConnectStatusMap(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dWorkFields.setDb85102dConnectStatusMap(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of msg3005b600
	 *	@return msg3005b600
	 */
   public char[] getMsg3005b600() throws CFException  {              
   		return work.getMsg3005b600();
   }

  
	/**
	*  set variable msg3005b600
	*  @param value
	**/
   public void setMsg3005b600(char[] value) throws CFException {
      work.setMsg3005b600(value);
   } 

	/**
	 *	Returns the value of abendCode800
	 *	@return abendCode800
	 */   
	 public AbendCode800 getAbendCode800() {
   	return db2Workarea800.getAbendCode800();
   }

   /**
	* 	Update AbendCode800 with the passed value
	*	@param value
	*/
   public void setAbendCode800(char[] value) throws CFException {
      db2Workarea800.setAbendCode800(value);
   }   

     /**
	 * 	Update AbendCode800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAbendCode800(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	db2Workarea800.setAbendCode800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	db2Workarea800.setAbendCode800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode800 with another Field
	 *	@param value
	 */
   public void setAbendCode800(Field source) {
   	db2Workarea800.setAbendCode800(source);
   }  
   
     /**
	 * 	Update AbendCode800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAbendCode800(Field source, int sourceIndex,int sourceLen) {
   	db2Workarea800.setAbendCode800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	db2Workarea800.setAbendCode800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of db85102dDb2cloneStatus
	 *	@return db85102dDb2cloneStatus
	 */
   public char[] getDb85102dDb2cloneStatus() throws CFException  {              
   		return db85102dWorkFields.getDb85102dDb2cloneStatus();
   }

  
	/**
	*  set variable db85102dDb2cloneStatus
	*  @param value
	**/
   public void setDb85102dDb2cloneStatus(char[] value) throws CFException {
      db85102dWorkFields.setDb85102dDb2cloneStatus(value);
   } 

     /**
	 * 	Update Db85102dDb2cloneStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb85102dDb2cloneStatus(char[] source, int sourceIndex) throws CFException {
      db85102dWorkFields.setDb85102dDb2cloneStatus(source, sourceIndex);
   	
   }
   
   public void setDb85102dDb2cloneStatus(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      db85102dWorkFields.setDb85102dDb2cloneStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Db85102dDb2cloneStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dDb2cloneStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dWorkFields.setDb85102dDb2cloneStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Db85102dDb2cloneStatus with another Field
	 *	@param value
	 */
   public void setDb85102dDb2cloneStatus(Field source) {
      db85102dWorkFields.setDb85102dDb2cloneStatus(source);
   }  
   
     /**
	 * 	Update Db85102dDb2cloneStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb85102dDb2cloneStatus(Field source, int sourceIndex,int sourceLen) {
      db85102dWorkFields.setDb85102dDb2cloneStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Db85102dDb2cloneStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dDb2cloneStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dWorkFields.setDb85102dDb2cloneStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of msg3005c600
	 *	@return msg3005c600
	 */
   public char[] getMsg3005c600() throws CFException  {              
   		return work.getMsg3005c600();
   }

  
	/**
	*  set variable msg3005c600
	*  @param value
	**/
   public void setMsg3005c600(char[] value) throws CFException {
      work.setMsg3005c600(value);
   } 

	/**
	 *	Returns the value of dbConnectError8023005
	 *	@return dbConnectError8023005
	 */   
	 public DbConnectError8023005 getDbConnectError8023005() {
   	return dbConnectError8023005;
   }


	/**
	 *	Returns the value of errorValue300
	 *	@return errorValue300
	 */
   public char[] getErrorValue300() throws CFException  {              
   		return constants300.getErrorValue300();
   }

  
	/**
	*  set variable errorValue300
	*  @param value
	**/
   public void setErrorValue300(char[] value) throws CFException {
      constants300.setErrorValue300(value);
   } 

     /**
	 * 	Update ErrorValue300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorValue300(char[] source, int sourceIndex) throws CFException {
      constants300.setErrorValue300(source, sourceIndex);
   	
   }
   
   public void setErrorValue300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      constants300.setErrorValue300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ErrorValue300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorValue300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setErrorValue300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ErrorValue300 with another Field
	 *	@param value
	 */
   public void setErrorValue300(Field source) {
      constants300.setErrorValue300(source);
   }  
   
     /**
	 * 	Update ErrorValue300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorValue300(Field source, int sourceIndex,int sourceLen) {
      constants300.setErrorValue300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ErrorValue300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorValue300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setErrorValue300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of msg3001a600
	 *	@return msg3001a600
	 */   
	 public Msg3001a600 getMsg3001a600() {
   	return msg3001a600;
   }


	/**
	 *	Returns the value of para8100300
	 *	@return para8100300
	 */
   public char[] getPara8100300() throws CFException  {              
   		return work.getPara8100300();
   }

  
	/**
	*  set variable para8100300
	*  @param value
	**/
   public void setPara8100300(char[] value) throws CFException {
      work.setPara8100300(value);
   } 

	/**
	 *	Returns the value of msg3005e600
	 *	@return msg3005e600
	 */
   public char[] getMsg3005e600() throws CFException  {              
   		return work.getMsg3005e600();
   }

  
	/**
	*  set variable msg3005e600
	*  @param value
	**/
   public void setMsg3005e600(char[] value) throws CFException {
      work.setMsg3005e600(value);
   } 


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }

        public CheckStatusMapOutCtx getCheckStatusMapOutCtx() {
            return new CheckStatusMapOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += db2Workarea800.hashCode();
        str += abendParaName900.hashCode();
        str += abendMessage900.hashCode();
        str += dbConnectError8023005.hashCode();
        str += work.hashCode();
        str += constants300.hashCode();
        str += apiLayout.hashCode();
        str += msg3001a600.hashCode();
        str += db85102dWorkFields.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public CheckStatusMapInCtx clone() {
        CheckStatusMapInCtx cloneObj = new CheckStatusMapInCtx();
        cloneObj.db2Workarea800 = new Db2Workarea800();
        cloneObj.db2Workarea800.set(db2Workarea800.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.dbConnectError8023005 = new DbConnectError8023005();
        cloneObj.dbConnectError8023005.set(dbConnectError8023005.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.apiLayout = new ApiLayout();
        cloneObj.apiLayout.set(apiLayout.getClonedField());
        cloneObj.msg3001a600 = new Msg3001a600();
        cloneObj.msg3001a600.set(msg3001a600.getClonedField());
        cloneObj.db85102dWorkFields = new Db85102dWorkFields();
        cloneObj.db85102dWorkFields.set(db85102dWorkFields.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public CheckStatusMapInCtx getCheckStatusMapInCtx() {
            return new CheckStatusMapInCtx();
    }
     public class CheckStatusMapOutCtx implements Cloneable {
     Db2Workarea800 db2Workarea800 = Ip343690Ctx.this.getDb2Workarea800();
     AbendParaName900 abendParaName900 = Ip343690Ctx.this.getAbendParaName900();
     AbendMessage900 abendMessage900 = Ip343690Ctx.this.getAbendMessage900();
     DbConnectError8023005 dbConnectError8023005 = Ip343690Ctx.this.getDbConnectError8023005();
     Work work = Ip343690Ctx.this.getWork();
     ApiLayout apiLayout = Ip343690Ctx.this.getApiLayout();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();
     Msg3001a600 msg3001a600 = Ip343690Ctx.this.getMsg3001a600();
     Db85102dWorkFields db85102dWorkFields = Ip343690Ctx.this.getDb85102dWorkFields();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip343690Ctx.this.getIp60001EventLogWorkArea();

	/**
	 *	Returns the value of msg3005d600
	 *	@return msg3005d600
	 */
   public char[] getMsg3005d600() throws CFException  {              
   		return work.getMsg3005d600();
   }

  
	/**
	*  set variable msg3005d600
	*  @param value
	**/
   public void setMsg3005d600(char[] value) throws CFException {
      work.setMsg3005d600(value);
   } 

	/**
	 *	Returns the value of msg3005b600
	 *	@return msg3005b600
	 */
   public char[] getMsg3005b600() throws CFException  {              
   		return work.getMsg3005b600();
   }

  
	/**
	*  set variable msg3005b600
	*  @param value
	**/
   public void setMsg3005b600(char[] value) throws CFException {
      work.setMsg3005b600(value);
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
	 *	Returns the value of abendCode800
	 *	@return abendCode800
	 */   
	 public AbendCode800 getAbendCode800() {
   	return db2Workarea800.getAbendCode800();
   }

   /**
	* 	Update AbendCode800 with the passed value
	*	@param value
	*/
   public void setAbendCode800(char[] value) throws CFException {
      db2Workarea800.setAbendCode800(value);
   }   

     /**
	 * 	Update AbendCode800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAbendCode800(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	db2Workarea800.setAbendCode800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	db2Workarea800.setAbendCode800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode800 with another Field
	 *	@param value
	 */
   public void setAbendCode800(Field source) {
   	db2Workarea800.setAbendCode800(source);
   }  
   
     /**
	 * 	Update AbendCode800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAbendCode800(Field source, int sourceIndex,int sourceLen) {
   	db2Workarea800.setAbendCode800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	db2Workarea800.setAbendCode800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of msg3005c600
	 *	@return msg3005c600
	 */
   public char[] getMsg3005c600() throws CFException  {              
   		return work.getMsg3005c600();
   }

  
	/**
	*  set variable msg3005c600
	*  @param value
	**/
   public void setMsg3005c600(char[] value) throws CFException {
      work.setMsg3005c600(value);
   } 

	/**
	 *	Returns the value of dbConnectError8023005
	 *	@return dbConnectError8023005
	 */   
	 public DbConnectError8023005 getDbConnectError8023005() {
   	return dbConnectError8023005;
   }


	/**
	 *	Returns the value of msg3001aFileStatus600
	 *	@return msg3001aFileStatus600
	 */
   public char[] getMsg3001aFileStatus600() throws CFException  {              
   		return msg3001a600.getMsg3001aFileStatus600();
   }

  
	/**
	*  set variable msg3001aFileStatus600
	*  @param value
	**/
   public void setMsg3001aFileStatus600(char[] value) throws CFException {
      msg3001a600.setMsg3001aFileStatus600(value);
   } 

     /**
	 * 	Update Msg3001aFileStatus600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsg3001aFileStatus600(char[] source, int sourceIndex) throws CFException {
      msg3001a600.setMsg3001aFileStatus600(source, sourceIndex);
   	
   }
   
   public void setMsg3001aFileStatus600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      msg3001a600.setMsg3001aFileStatus600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Msg3001aFileStatus600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsg3001aFileStatus600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      msg3001a600.setMsg3001aFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Msg3001aFileStatus600 with another Field
	 *	@param value
	 */
   public void setMsg3001aFileStatus600(Field source) {
      msg3001a600.setMsg3001aFileStatus600(source);
   }  
   
     /**
	 * 	Update Msg3001aFileStatus600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsg3001aFileStatus600(Field source, int sourceIndex,int sourceLen) {
      msg3001a600.setMsg3001aFileStatus600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Msg3001aFileStatus600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsg3001aFileStatus600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      msg3001a600.setMsg3001aFileStatus600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of msg3001a600
	 *	@return msg3001a600
	 */   
	 public Msg3001a600 getMsg3001a600() {
   	return msg3001a600;
   }


	/**
	 *	Test condition "Y" for isItIsSqlError88100()
	 *	@return  Returns true if isItIsSqlError88100() is "Y"
	 */
   public boolean isItIsSqlError88100() throws CFException {
      return work.isItIsSqlError88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsSqlError88100True()  throws CFException{  			
    	work.setItIsSqlError88100True();
   	}
	/**
	 *	Returns the value of para8100300
	 *	@return para8100300
	 */
   public char[] getPara8100300() throws CFException  {              
   		return work.getPara8100300();
   }

  
	/**
	*  set variable para8100300
	*  @param value
	**/
   public void setPara8100300(char[] value) throws CFException {
      work.setPara8100300(value);
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
	 *	Returns the value of db85102dDb2cloneStatus
	 *	@return db85102dDb2cloneStatus
	 */
   public char[] getDb85102dDb2cloneStatus() throws CFException  {              
   		return db85102dWorkFields.getDb85102dDb2cloneStatus();
   }

  
	/**
	*  set variable db85102dDb2cloneStatus
	*  @param value
	**/
   public void setDb85102dDb2cloneStatus(char[] value) throws CFException {
      db85102dWorkFields.setDb85102dDb2cloneStatus(value);
   } 

     /**
	 * 	Update Db85102dDb2cloneStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb85102dDb2cloneStatus(char[] source, int sourceIndex) throws CFException {
      db85102dWorkFields.setDb85102dDb2cloneStatus(source, sourceIndex);
   	
   }
   
   public void setDb85102dDb2cloneStatus(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      db85102dWorkFields.setDb85102dDb2cloneStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Db85102dDb2cloneStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dDb2cloneStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dWorkFields.setDb85102dDb2cloneStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Db85102dDb2cloneStatus with another Field
	 *	@param value
	 */
   public void setDb85102dDb2cloneStatus(Field source) {
      db85102dWorkFields.setDb85102dDb2cloneStatus(source);
   }  
   
     /**
	 * 	Update Db85102dDb2cloneStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb85102dDb2cloneStatus(Field source, int sourceIndex,int sourceLen) {
      db85102dWorkFields.setDb85102dDb2cloneStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Db85102dDb2cloneStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dDb2cloneStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db85102dWorkFields.setDb85102dDb2cloneStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "Y" for isItIsConnectedToDb288100()
	 *	@return  Returns true if isItIsConnectedToDb288100() is "Y"
	 */
   public boolean isItIsConnectedToDb288100() throws CFException {
      return apiLayout.isItIsConnectedToDb288100();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsConnectedToDb288100True()  throws CFException{  			
    	apiLayout.setItIsConnectedToDb288100True();
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
	 *	Returns the value of msg3005e600
	 *	@return msg3005e600
	 */
   public char[] getMsg3005e600() throws CFException  {              
   		return work.getMsg3005e600();
   }

  
	/**
	*  set variable msg3005e600
	*  @param value
	**/
   public void setMsg3005e600(char[] value) throws CFException {
      work.setMsg3005e600(value);
   } 


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += db2Workarea800.hashCode();
        str += abendParaName900.hashCode();
        str += abendMessage900.hashCode();
        str += dbConnectError8023005.hashCode();
        str += work.hashCode();
        str += apiLayout.hashCode();
        str += constants300.hashCode();
        str += msg3001a600.hashCode();
        str += db85102dWorkFields.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public CheckStatusMapOutCtx clone() {
        CheckStatusMapOutCtx cloneObj = new CheckStatusMapOutCtx();
        cloneObj.db2Workarea800 = new Db2Workarea800();
        cloneObj.db2Workarea800.set(db2Workarea800.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.dbConnectError8023005 = new DbConnectError8023005();
        cloneObj.dbConnectError8023005.set(dbConnectError8023005.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.apiLayout = new ApiLayout();
        cloneObj.apiLayout.set(apiLayout.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.msg3001a600 = new Msg3001a600();
        cloneObj.msg3001a600.set(msg3001a600.getClonedField());
        cloneObj.db85102dWorkFields = new Db85102dWorkFields();
        cloneObj.db85102dWorkFields.set(db85102dWorkFields.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public CheckStatusMapOutCtx getCheckStatusMapOutCtx() {
            return new CheckStatusMapOutCtx();
    }
     public class ReadInputSys001InCtx implements Cloneable {
     Sys001ErrMsgTxt600 sys001ErrMsgTxt600 = Ip343690Ctx.this.getSys001ErrMsgTxt600();
     AbendMessage900 abendMessage900 = Ip343690Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip343690Ctx.this.getAbendParaName900();
     Sys001InputPmaUnldRec sys001InputPmaUnldRec = Ip343690Ctx.this.getSys001InputPmaUnldRec();
     Work work = Ip343690Ctx.this.getWork();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();
     TipapmaLayout800 tipapmaLayout800 = Ip343690Ctx.this.getTipapmaLayout800();

	/**
	 *	Returns the value of para8200300
	 *	@return para8200300
	 */
   public char[] getPara8200300() throws CFException  {              
   		return work.getPara8200300();
   }

  
	/**
	*  set variable para8200300
	*  @param value
	**/
   public void setPara8200300(char[] value) throws CFException {
      work.setPara8200300(value);
   } 

	/**
	 *	Returns the value of sys001ErrMsgTxt600
	 *	@return sys001ErrMsgTxt600
	 */   
	 public Sys001ErrMsgTxt600 getSys001ErrMsgTxt600() {
   	return sys001ErrMsgTxt600;
   }


	/**
	 *	Returns the value of recsRead400
	 *	@return recsRead400
	 */
	public long getRecsRead400() throws CFException {        
   		return work.getRecsRead400();
	}
	
	/**
	 * 	Update RecsRead400 with the passed value
	 *	@param number
	 */
	public void setRecsRead400(long number)  throws CFException{
		work.setRecsRead400(number);
	}



	/**
	 *	Returns the value of sys001RdAbendCode300
	 *	@return sys001RdAbendCode300
	 */
   public char[] getSys001RdAbendCode300() throws CFException  {              
   		return constants300.getSys001RdAbendCode300();
   }

  
	/**
	*  set variable sys001RdAbendCode300
	*  @param value
	**/
   public void setSys001RdAbendCode300(char[] value) throws CFException {
      constants300.setSys001RdAbendCode300(value);
   } 

     /**
	 * 	Update Sys001RdAbendCode300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001RdAbendCode300(char[] source, int sourceIndex) throws CFException {
      constants300.setSys001RdAbendCode300(source, sourceIndex);
   	
   }
   
   public void setSys001RdAbendCode300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      constants300.setSys001RdAbendCode300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001RdAbendCode300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001RdAbendCode300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setSys001RdAbendCode300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001RdAbendCode300 with another Field
	 *	@param value
	 */
   public void setSys001RdAbendCode300(Field source) {
      constants300.setSys001RdAbendCode300(source);
   }  
   
     /**
	 * 	Update Sys001RdAbendCode300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001RdAbendCode300(Field source, int sourceIndex,int sourceLen) {
      constants300.setSys001RdAbendCode300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001RdAbendCode300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001RdAbendCode300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setSys001RdAbendCode300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tipapmaLayout800
	 *	@return tipapmaLayout800
	 */   
	 public TipapmaLayout800 getTipapmaLayout800() {
   	return tipapmaLayout800;
   }



        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }

        public ReadInputSys001OutCtx getReadInputSys001OutCtx() {
            return new ReadInputSys001OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001ErrMsgTxt600.hashCode();
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += sys001InputPmaUnldRec.hashCode();
        str += work.hashCode();
        str += constants300.hashCode();
        str += tipapmaLayout800.hashCode();
       return str.hashCode();
    }

    public ReadInputSys001InCtx clone() {
        ReadInputSys001InCtx cloneObj = new ReadInputSys001InCtx();
        cloneObj.sys001ErrMsgTxt600 = new Sys001ErrMsgTxt600();
        cloneObj.sys001ErrMsgTxt600.set(sys001ErrMsgTxt600.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.sys001InputPmaUnldRec = new Sys001InputPmaUnldRec();
        cloneObj.sys001InputPmaUnldRec.set(sys001InputPmaUnldRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.tipapmaLayout800 = new TipapmaLayout800();
        cloneObj.tipapmaLayout800.set(tipapmaLayout800.getClonedField());
        return cloneObj;
    }

    }

    public ReadInputSys001InCtx getReadInputSys001InCtx() {
            return new ReadInputSys001InCtx();
    }
     public class ReadInputSys001OutCtx implements Cloneable {
     Sys001ErrMsgTxt600 sys001ErrMsgTxt600 = Ip343690Ctx.this.getSys001ErrMsgTxt600();
     AbendMessage900 abendMessage900 = Ip343690Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip343690Ctx.this.getAbendParaName900();
     Sys001InputPmaUnldRec sys001InputPmaUnldRec = Ip343690Ctx.this.getSys001InputPmaUnldRec();
     Work work = Ip343690Ctx.this.getWork();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();
     TipapmaLayout800 tipapmaLayout800 = Ip343690Ctx.this.getTipapmaLayout800();

	/**
	 *	Returns the value of para8200300
	 *	@return para8200300
	 */
   public char[] getPara8200300() throws CFException  {              
   		return work.getPara8200300();
   }

  
	/**
	*  set variable para8200300
	*  @param value
	**/
   public void setPara8200300(char[] value) throws CFException {
      work.setPara8200300(value);
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
	 *	Returns the value of sys001ErrMsgTxt600
	 *	@return sys001ErrMsgTxt600
	 */   
	 public Sys001ErrMsgTxt600 getSys001ErrMsgTxt600() {
   	return sys001ErrMsgTxt600;
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
	 *	Test condition "ERROR READING INPUT SYS001  " for isSys001ReadErrTxt88600()
	 *	@return  Returns true if isSys001ReadErrTxt88600() is "ERROR READING INPUT SYS001  "
	 */
   public boolean isSys001ReadErrTxt88600() throws CFException {
      return sys001ErrMsgTxt600.isSys001ReadErrTxt88600();
   }

	/**
	*  set values "ERROR READING INPUT SYS001  "
	*/
   	public void setSys001ReadErrTxt88600True()  throws CFException{  			
    	sys001ErrMsgTxt600.setSys001ReadErrTxt88600True();
   	}
	/**
	 *	Test condition "10" for isSys001StatusEof88200()
	 *	@return  Returns true if isSys001StatusEof88200() is "10"
	 */
   public boolean isSys001StatusEof88200() throws CFException {
      return work.isSys001StatusEof88200();
   }

	/**
	*  set values "10"
	*/
   	public void setSys001StatusEof88200True()  throws CFException{  			
    	work.setSys001StatusEof88200True();
   	}
	/**
	 *	Returns the value of sys001InputPmaUnldRec
	 *	@return sys001InputPmaUnldRec
	 */   
	 public Sys001InputPmaUnldRec getSys001InputPmaUnldRec() {
   	return sys001InputPmaUnldRec;
   }


	/**
	 *	Test condition "00" for isSys001StatusGood88200()
	 *	@return  Returns true if isSys001StatusGood88200() is "00"
	 */
   public boolean isSys001StatusGood88200() throws CFException {
      return work.isSys001StatusGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys001StatusGood88200True()  throws CFException{  			
    	work.setSys001StatusGood88200True();
   	}
	/**
	 *	Returns the value of recsRead400
	 *	@return recsRead400
	 */
	public long getRecsRead400() throws CFException {        
   		return work.getRecsRead400();
	}
	
	/**
	 * 	Update RecsRead400 with the passed value
	 *	@param number
	 */
	public void setRecsRead400(long number)  throws CFException{
		work.setRecsRead400(number);
	}



	/**
	 *	Returns the value of sys001Status600
	 *	@return sys001Status600
	 */
   public char[] getSys001Status600() throws CFException  {              
   		return sys001ErrMsgTxt600.getSys001Status600();
   }

  
	/**
	*  set variable sys001Status600
	*  @param value
	**/
   public void setSys001Status600(char[] value) throws CFException {
      sys001ErrMsgTxt600.setSys001Status600(value);
   } 

     /**
	 * 	Update Sys001Status600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001Status600(char[] source, int sourceIndex) throws CFException {
      sys001ErrMsgTxt600.setSys001Status600(source, sourceIndex);
   	
   }
   
   public void setSys001Status600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001ErrMsgTxt600.setSys001Status600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001Status600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001Status600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001ErrMsgTxt600.setSys001Status600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001Status600 with another Field
	 *	@param value
	 */
   public void setSys001Status600(Field source) {
      sys001ErrMsgTxt600.setSys001Status600(source);
   }  
   
     /**
	 * 	Update Sys001Status600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001Status600(Field source, int sourceIndex,int sourceLen) {
      sys001ErrMsgTxt600.setSys001Status600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001Status600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001Status600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001ErrMsgTxt600.setSys001Status600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys001RdAbendCode300
	 *	@return sys001RdAbendCode300
	 */
   public char[] getSys001RdAbendCode300() throws CFException  {              
   		return constants300.getSys001RdAbendCode300();
   }

  
	/**
	*  set variable sys001RdAbendCode300
	*  @param value
	**/
   public void setSys001RdAbendCode300(char[] value) throws CFException {
      constants300.setSys001RdAbendCode300(value);
   } 

     /**
	 * 	Update Sys001RdAbendCode300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001RdAbendCode300(char[] source, int sourceIndex) throws CFException {
      constants300.setSys001RdAbendCode300(source, sourceIndex);
   	
   }
   
   public void setSys001RdAbendCode300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      constants300.setSys001RdAbendCode300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001RdAbendCode300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001RdAbendCode300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setSys001RdAbendCode300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001RdAbendCode300 with another Field
	 *	@param value
	 */
   public void setSys001RdAbendCode300(Field source) {
      constants300.setSys001RdAbendCode300(source);
   }  
   
     /**
	 * 	Update Sys001RdAbendCode300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001RdAbendCode300(Field source, int sourceIndex,int sourceLen) {
      constants300.setSys001RdAbendCode300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001RdAbendCode300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001RdAbendCode300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setSys001RdAbendCode300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001ErrMsgTxt600.hashCode();
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += sys001InputPmaUnldRec.hashCode();
        str += work.hashCode();
        str += constants300.hashCode();
        str += tipapmaLayout800.hashCode();
       return str.hashCode();
    }

    public ReadInputSys001OutCtx clone() {
        ReadInputSys001OutCtx cloneObj = new ReadInputSys001OutCtx();
        cloneObj.sys001ErrMsgTxt600 = new Sys001ErrMsgTxt600();
        cloneObj.sys001ErrMsgTxt600.set(sys001ErrMsgTxt600.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.sys001InputPmaUnldRec = new Sys001InputPmaUnldRec();
        cloneObj.sys001InputPmaUnldRec.set(sys001InputPmaUnldRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.tipapmaLayout800 = new TipapmaLayout800();
        cloneObj.tipapmaLayout800.set(tipapmaLayout800.getClonedField());
        return cloneObj;
    }

    }

    public ReadInputSys001OutCtx getReadInputSys001OutCtx() {
            return new ReadInputSys001OutCtx();
    }
     public class CloseInputSys001InCtx implements Cloneable {
     Sys001ErrMsgTxt600 sys001ErrMsgTxt600 = Ip343690Ctx.this.getSys001ErrMsgTxt600();
     AbendParaName900 abendParaName900 = Ip343690Ctx.this.getAbendParaName900();
     AbendMessage900 abendMessage900 = Ip343690Ctx.this.getAbendMessage900();
     Work work = Ip343690Ctx.this.getWork();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();

	/**
	 *	Returns the value of sys001ClAbendCode300
	 *	@return sys001ClAbendCode300
	 */
   public char[] getSys001ClAbendCode300() throws CFException  {              
   		return constants300.getSys001ClAbendCode300();
   }

  
	/**
	*  set variable sys001ClAbendCode300
	*  @param value
	**/
   public void setSys001ClAbendCode300(char[] value) throws CFException {
      constants300.setSys001ClAbendCode300(value);
   } 

     /**
	 * 	Update Sys001ClAbendCode300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001ClAbendCode300(char[] source, int sourceIndex) throws CFException {
      constants300.setSys001ClAbendCode300(source, sourceIndex);
   	
   }
   
   public void setSys001ClAbendCode300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      constants300.setSys001ClAbendCode300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001ClAbendCode300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001ClAbendCode300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setSys001ClAbendCode300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001ClAbendCode300 with another Field
	 *	@param value
	 */
   public void setSys001ClAbendCode300(Field source) {
      constants300.setSys001ClAbendCode300(source);
   }  
   
     /**
	 * 	Update Sys001ClAbendCode300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001ClAbendCode300(Field source, int sourceIndex,int sourceLen) {
      constants300.setSys001ClAbendCode300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001ClAbendCode300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001ClAbendCode300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setSys001ClAbendCode300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys001ErrMsgTxt600
	 *	@return sys001ErrMsgTxt600
	 */   
	 public Sys001ErrMsgTxt600 getSys001ErrMsgTxt600() {
   	return sys001ErrMsgTxt600;
   }


	/**
	 *	Test condition "00" for isSys001StatusGood88200()
	 *	@return  Returns true if isSys001StatusGood88200() is "00"
	 */
   public boolean isSys001StatusGood88200() throws CFException {
      return work.isSys001StatusGood88200();
   }

	/**
	*  set values "00"
	*/
   	public void setSys001StatusGood88200True()  throws CFException{  			
    	work.setSys001StatusGood88200True();
   	}
	/**
	 *	Returns the value of para8210300
	 *	@return para8210300
	 */
   public char[] getPara8210300() throws CFException  {              
   		return work.getPara8210300();
   }

  
	/**
	*  set variable para8210300
	*  @param value
	**/
   public void setPara8210300(char[] value) throws CFException {
      work.setPara8210300(value);
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


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }

        public CloseInputSys001OutCtx getCloseInputSys001OutCtx() {
            return new CloseInputSys001OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001ErrMsgTxt600.hashCode();
        str += abendParaName900.hashCode();
        str += abendMessage900.hashCode();
        str += work.hashCode();
        str += constants300.hashCode();
       return str.hashCode();
    }

    public CloseInputSys001InCtx clone() {
        CloseInputSys001InCtx cloneObj = new CloseInputSys001InCtx();
        cloneObj.sys001ErrMsgTxt600 = new Sys001ErrMsgTxt600();
        cloneObj.sys001ErrMsgTxt600.set(sys001ErrMsgTxt600.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        return cloneObj;
    }

    }

    public CloseInputSys001InCtx getCloseInputSys001InCtx() {
            return new CloseInputSys001InCtx();
    }
     public class CloseInputSys001OutCtx implements Cloneable {
     Sys001ErrMsgTxt600 sys001ErrMsgTxt600 = Ip343690Ctx.this.getSys001ErrMsgTxt600();
     AbendParaName900 abendParaName900 = Ip343690Ctx.this.getAbendParaName900();
     AbendMessage900 abendMessage900 = Ip343690Ctx.this.getAbendMessage900();
     Work work = Ip343690Ctx.this.getWork();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();

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
	 *	Test condition "ERROR CLOSING INPUT SYS001  " for isSys001CloseErrTxt88600()
	 *	@return  Returns true if isSys001CloseErrTxt88600() is "ERROR CLOSING INPUT SYS001  "
	 */
   public boolean isSys001CloseErrTxt88600() throws CFException {
      return sys001ErrMsgTxt600.isSys001CloseErrTxt88600();
   }

	/**
	*  set values "ERROR CLOSING INPUT SYS001  "
	*/
   	public void setSys001CloseErrTxt88600True()  throws CFException{  			
    	sys001ErrMsgTxt600.setSys001CloseErrTxt88600True();
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
	 *	Returns the value of sys001ClAbendCode300
	 *	@return sys001ClAbendCode300
	 */
   public char[] getSys001ClAbendCode300() throws CFException  {              
   		return constants300.getSys001ClAbendCode300();
   }

  
	/**
	*  set variable sys001ClAbendCode300
	*  @param value
	**/
   public void setSys001ClAbendCode300(char[] value) throws CFException {
      constants300.setSys001ClAbendCode300(value);
   } 

     /**
	 * 	Update Sys001ClAbendCode300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001ClAbendCode300(char[] source, int sourceIndex) throws CFException {
      constants300.setSys001ClAbendCode300(source, sourceIndex);
   	
   }
   
   public void setSys001ClAbendCode300(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      constants300.setSys001ClAbendCode300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001ClAbendCode300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001ClAbendCode300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setSys001ClAbendCode300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001ClAbendCode300 with another Field
	 *	@param value
	 */
   public void setSys001ClAbendCode300(Field source) {
      constants300.setSys001ClAbendCode300(source);
   }  
   
     /**
	 * 	Update Sys001ClAbendCode300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001ClAbendCode300(Field source, int sourceIndex,int sourceLen) {
      constants300.setSys001ClAbendCode300(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001ClAbendCode300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001ClAbendCode300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      constants300.setSys001ClAbendCode300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys001ErrMsgTxt600
	 *	@return sys001ErrMsgTxt600
	 */   
	 public Sys001ErrMsgTxt600 getSys001ErrMsgTxt600() {
   	return sys001ErrMsgTxt600;
   }


	/**
	 *	Returns the value of para8210300
	 *	@return para8210300
	 */
   public char[] getPara8210300() throws CFException  {              
   		return work.getPara8210300();
   }

  
	/**
	*  set variable para8210300
	*  @param value
	**/
   public void setPara8210300(char[] value) throws CFException {
      work.setPara8210300(value);
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


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001ErrMsgTxt600.hashCode();
        str += abendParaName900.hashCode();
        str += abendMessage900.hashCode();
        str += work.hashCode();
        str += constants300.hashCode();
       return str.hashCode();
    }

    public CloseInputSys001OutCtx clone() {
        CloseInputSys001OutCtx cloneObj = new CloseInputSys001OutCtx();
        cloneObj.sys001ErrMsgTxt600 = new Sys001ErrMsgTxt600();
        cloneObj.sys001ErrMsgTxt600.set(sys001ErrMsgTxt600.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        return cloneObj;
    }

    }

    public CloseInputSys001OutCtx getCloseInputSys001OutCtx() {
            return new CloseInputSys001OutCtx();
    }
     public class UpdatePmaCursorInCtx implements Cloneable {
     Db2Workarea800 db2Workarea800 = Ip343690Ctx.this.getDb2Workarea800();
     DbUpdateError8023010 dbUpdateError8023010 = Ip343690Ctx.this.getDbUpdateError8023010();
     Tipapma tipapma = Ip343690Ctx.this.getTipapma();
     Itipapma itipapma = Ip343690Ctx.this.getItipapma();
     AbendParaName900 abendParaName900 = Ip343690Ctx.this.getAbendParaName900();
     AbendMessage900 abendMessage900 = Ip343690Ctx.this.getAbendMessage900();
     Work work = Ip343690Ctx.this.getWork();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();
     ApiLayout apiLayout = Ip343690Ctx.this.getApiLayout();
     Sqlca sqlca = Ip343690Ctx.this.getSqlca();

	/**
	 *	Returns the value of dbUpdateError8023010
	 *	@return dbUpdateError8023010
	 */   
	 public DbUpdateError8023010 getDbUpdateError8023010() {
   	return dbUpdateError8023010;
   }


	/**
	 *	Returns the value of db2DeadlockRel600
	 *	@return db2DeadlockRel600
	 */
   public char[] getDb2DeadlockRel600() throws CFException  {              
   		return work.getDb2DeadlockRel600();
   }

  
	/**
	*  set variable db2DeadlockRel600
	*  @param value
	**/
   public void setDb2DeadlockRel600(char[] value) throws CFException {
      work.setDb2DeadlockRel600(value);
   } 

	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of abendCode800
	 *	@return abendCode800
	 */   
	 public AbendCode800 getAbendCode800() {
   	return db2Workarea800.getAbendCode800();
   }

   /**
	* 	Update AbendCode800 with the passed value
	*	@param value
	*/
   public void setAbendCode800(char[] value) throws CFException {
      db2Workarea800.setAbendCode800(value);
   }   

     /**
	 * 	Update AbendCode800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAbendCode800(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	db2Workarea800.setAbendCode800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	db2Workarea800.setAbendCode800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode800 with another Field
	 *	@param value
	 */
   public void setAbendCode800(Field source) {
   	db2Workarea800.setAbendCode800(source);
   }  
   
     /**
	 * 	Update AbendCode800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAbendCode800(Field source, int sourceIndex,int sourceLen) {
   	db2Workarea800.setAbendCode800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	db2Workarea800.setAbendCode800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlerrd
	 *	@return sqlerrd
	 */
	public int getSqlerrd(int index) throws CFException {        
   		return sqlca.getSqlerrd((index));
	}
	
	/**
	 * 	Update Sqlerrd with the passed value
	 *	@param number
	 */
	public void setSqlerrd(int index,int number)  throws CFException{
		sqlca.setSqlerrd((index),number);
	}


	public void setSqlerrd(int index,long number)  throws CFException{
		sqlca.setSqlerrd((index),(int)number);
	}


	/**
	 *	Returns the value of sql911300
	 *	@return sql911300
	 */
	public int getSql911300() throws CFException {        
   		return constants300.getSql911300();
	}
	
	/**
	 * 	Update Sql911300 with the passed value
	 *	@param number
	 */
	public void setSql911300(int number)  throws CFException{
		constants300.setSql911300(number);
	}


	public void setSql911300(long number)  throws CFException{
		constants300.setSql911300((int)number);
	}


	/**
	 *	Returns the value of valueRetry300
	 *	@return valueRetry300
	 */
	public int getValueRetry300() throws CFException {        
   		return constants300.getValueRetry300();
	}
	
	/**
	 * 	Update ValueRetry300 with the passed value
	 *	@param number
	 */
	public void setValueRetry300(int number)  throws CFException{
		constants300.setValueRetry300(number);
	}


	public void setValueRetry300(long number)  throws CFException{
		constants300.setValueRetry300((int)number);
	}


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of tipapmaPrimAcctSeqNumN
	 *	@return tipapmaPrimAcctSeqNumN
	 */
	public short getTipapmaPrimAcctSeqNumN() throws CFException {        
   		return itipapma.getTipapmaPrimAcctSeqNumN();
	}
	
	/**
	 * 	Update TipapmaPrimAcctSeqNumN with the passed value
	 *	@param number
	 */
	public void setTipapmaPrimAcctSeqNumN(short number)  throws CFException{
		itipapma.setTipapmaPrimAcctSeqNumN(number);
	}

	public void setTipapmaPrimAcctSeqNumN(int number)  throws CFException{
		itipapma.setTipapmaPrimAcctSeqNumN((short)number);
	}

	public void setTipapmaPrimAcctSeqNumN(long number)  throws CFException{
		itipapma.setTipapmaPrimAcctSeqNumN((short)number);
	}



	/**
	 *	Returns the value of sql904300
	 *	@return sql904300
	 */
	public int getSql904300() throws CFException {        
   		return constants300.getSql904300();
	}
	
	/**
	 * 	Update Sql904300 with the passed value
	 *	@param number
	 */
	public void setSql904300(int number)  throws CFException{
		constants300.setSql904300(number);
	}


	public void setSql904300(long number)  throws CFException{
		constants300.setSql904300((int)number);
	}


	/**
	 *	Returns the value of tipapmaCrteUpdtTs
	 *	@return tipapmaCrteUpdtTs
	 */
   public char[] getTipapmaCrteUpdtTs() throws CFException  {              
   		return tipapma.getTipapmaCrteUpdtTs();
   }

  
	/**
	*  set variable tipapmaCrteUpdtTs
	*  @param value
	**/
   public void setTipapmaCrteUpdtTs(char[] value) throws CFException {
      tipapma.setTipapmaCrteUpdtTs(value);
   } 

     /**
	 * 	Update TipapmaCrteUpdtTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTipapmaCrteUpdtTs(char[] source, int sourceIndex) throws CFException {
      tipapma.setTipapmaCrteUpdtTs(source, sourceIndex);
   	
   }
   
   public void setTipapmaCrteUpdtTs(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tipapma.setTipapmaCrteUpdtTs(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TipapmaCrteUpdtTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTipapmaCrteUpdtTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapma.setTipapmaCrteUpdtTs(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TipapmaCrteUpdtTs with another Field
	 *	@param value
	 */
   public void setTipapmaCrteUpdtTs(Field source) {
      tipapma.setTipapmaCrteUpdtTs(source);
   }  
   
     /**
	 * 	Update TipapmaCrteUpdtTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTipapmaCrteUpdtTs(Field source, int sourceIndex,int sourceLen) {
      tipapma.setTipapmaCrteUpdtTs(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TipapmaCrteUpdtTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTipapmaCrteUpdtTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapma.setTipapmaCrteUpdtTs(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlwarn
	 *	@return sqlwarn
	 */   
	 public Sqlwarn getSqlwarn() {
   	return sqlca.getSqlwarn();
   }

   /**
	* 	Update Sqlwarn with the passed value
	*	@param value
	*/
   public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
   }   

     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlwarn with another Field
	 *	@param value
	 */
   public void setSqlwarn(Field source) {
   	sqlca.setSqlwarn(source);
   }  
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tipapmaPrimAcctNum
	 *	@return tipapmaPrimAcctNum
	 */
   public char[] getTipapmaPrimAcctNum() throws CFException  {              
   		return tipapma.getTipapmaPrimAcctNum();
   }

  
	/**
	*  set variable tipapmaPrimAcctNum
	*  @param value
	**/
   public void setTipapmaPrimAcctNum(char[] value) throws CFException {
      tipapma.setTipapmaPrimAcctNum(value);
   } 

     /**
	 * 	Update TipapmaPrimAcctNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTipapmaPrimAcctNum(char[] source, int sourceIndex) throws CFException {
      tipapma.setTipapmaPrimAcctNum(source, sourceIndex);
   	
   }
   
   public void setTipapmaPrimAcctNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tipapma.setTipapmaPrimAcctNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TipapmaPrimAcctNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTipapmaPrimAcctNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapma.setTipapmaPrimAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TipapmaPrimAcctNum with another Field
	 *	@param value
	 */
   public void setTipapmaPrimAcctNum(Field source) {
      tipapma.setTipapmaPrimAcctNum(source);
   }  
   
     /**
	 * 	Update TipapmaPrimAcctNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTipapmaPrimAcctNum(Field source, int sourceIndex,int sourceLen) {
      tipapma.setTipapmaPrimAcctNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TipapmaPrimAcctNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTipapmaPrimAcctNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapma.setTipapmaPrimAcctNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tipapma
	 *	@return tipapma
	 */   
	 public Tipapma getTipapma() {
   	return tipapma;
   }


	/**
	 *	Returns the value of tipapmaPrimAcctSeqNum
	 *	@return tipapmaPrimAcctSeqNum
	 */
   public char[] getTipapmaPrimAcctSeqNum() throws CFException  {              
   		return tipapma.getTipapmaPrimAcctSeqNum();
   }

  
	/**
	*  set variable tipapmaPrimAcctSeqNum
	*  @param value
	**/
   public void setTipapmaPrimAcctSeqNum(char[] value) throws CFException {
      tipapma.setTipapmaPrimAcctSeqNum(value);
   } 

     /**
	 * 	Update TipapmaPrimAcctSeqNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTipapmaPrimAcctSeqNum(char[] source, int sourceIndex) throws CFException {
      tipapma.setTipapmaPrimAcctSeqNum(source, sourceIndex);
   	
   }
   
   public void setTipapmaPrimAcctSeqNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tipapma.setTipapmaPrimAcctSeqNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TipapmaPrimAcctSeqNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTipapmaPrimAcctSeqNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapma.setTipapmaPrimAcctSeqNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TipapmaPrimAcctSeqNum with another Field
	 *	@param value
	 */
   public void setTipapmaPrimAcctSeqNum(Field source) {
      tipapma.setTipapmaPrimAcctSeqNum(source);
   }  
   
     /**
	 * 	Update TipapmaPrimAcctSeqNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTipapmaPrimAcctSeqNum(Field source, int sourceIndex,int sourceLen) {
      tipapma.setTipapmaPrimAcctSeqNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TipapmaPrimAcctSeqNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTipapmaPrimAcctSeqNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tipapma.setTipapmaPrimAcctSeqNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of itipapma
	 *	@return itipapma
	 */   
	 public Itipapma getItipapma() {
   	return itipapma;
   }


	/**
	 *	Returns the value of msg3010600
	 *	@return msg3010600
	 */
   public char[] getMsg3010600() throws CFException  {              
   		return work.getMsg3010600();
   }

  
	/**
	*  set variable msg3010600
	*  @param value
	**/
   public void setMsg3010600(char[] value) throws CFException {
      work.setMsg3010600(value);
   } 

	/**
	 *	Returns the value of sqlerrmc
	 *	@return sqlerrmc
	 */
   public char[] getSqlerrmc() throws CFException  {              
   		return sqlca.getSqlerrm().getSqlerrmc();
   }

  
	/**
	*  set variable sqlerrmc
	*  @param value
	**/
   public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
   } 

     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
   	
   }
   
   public void setSqlerrmc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlerrmc with another Field
	 *	@param value
	 */
   public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
   }  
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sql100300
	 *	@return sql100300
	 */
	public int getSql100300() throws CFException {        
   		return constants300.getSql100300();
	}
	
	/**
	 * 	Update Sql100300 with the passed value
	 *	@param number
	 */
	public void setSql100300(int number)  throws CFException{
		constants300.setSql100300(number);
	}


	public void setSql100300(long number)  throws CFException{
		constants300.setSql100300((int)number);
	}


	/**
	 *	Returns the value of noOfRows800
	 *	@return noOfRows800
	 */
	public long getNoOfRows800() throws CFException {        
   		return work.getNoOfRows800();
	}
	
	/**
	 * 	Update NoOfRows800 with the passed value
	 *	@param number
	 */
	public void setNoOfRows800(long number)  throws CFException{
		work.setNoOfRows800(number);
	}



	/**
	 *	Returns the value of commitRows800
	 *	@return commitRows800
	 */
	public long getCommitRows800() throws CFException {        
   		return work.getCommitRows800();
	}
	
	/**
	 * 	Update CommitRows800 with the passed value
	 *	@param number
	 */
	public void setCommitRows800(long number)  throws CFException{
		work.setCommitRows800(number);
	}



	/**
	 *	Returns the value of noTimes911Try800
	 *	@return noTimes911Try800
	 */
	public int getNoTimes911Try800() throws CFException {
   		return db2Workarea800.getNoTimes911Try800();
	}


	/**
	 *	Returns String value of noTimes911Try800
	 *	@return noTimes911Try800
	 */
	public char[]  getNoTimes911Try800String() throws CFException {
	     return String.valueOf(db2Workarea800.getNoTimes911Try800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean noTimes911Try800IsNumeric()  throws CFException{
	    return db2Workarea800.noTimes911Try800IsNumeric();
	}

	/**
	 * 	Update NoTimes911Try800 with the passed value
	 *	@param number
	 */
	public void setNoTimes911Try800(int number)  throws CFException{
		db2Workarea800.setNoTimes911Try800(number);
	}
	

	public void setNoTimes911Try800(long number)  throws CFException{
	    db2Workarea800.setNoTimes911Try800(number);
	}
	
	
	/**
	 * 	Update NoTimes911Try800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNoTimes911Try800(char[] value)  throws CFException {
		db2Workarea800.setNoTimes911Try800(value);
	}
	
	/**
	 * 	Update NoTimes911Try800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNoTimes911Try800String(char[] value)  throws CFException{
		db2Workarea800.setNoTimes911Try800(value);
	}	


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }

        public UpdatePmaCursorOutCtx getUpdatePmaCursorOutCtx() {
            return new UpdatePmaCursorOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += db2Workarea800.hashCode();
        str += dbUpdateError8023010.hashCode();
        str += tipapma.hashCode();
        str += itipapma.hashCode();
        str += abendParaName900.hashCode();
        str += abendMessage900.hashCode();
        str += work.hashCode();
        str += constants300.hashCode();
        str += apiLayout.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public UpdatePmaCursorInCtx clone() {
        UpdatePmaCursorInCtx cloneObj = new UpdatePmaCursorInCtx();
        cloneObj.db2Workarea800 = new Db2Workarea800();
        cloneObj.db2Workarea800.set(db2Workarea800.getClonedField());
        cloneObj.dbUpdateError8023010 = new DbUpdateError8023010();
        cloneObj.dbUpdateError8023010.set(dbUpdateError8023010.getClonedField());
        cloneObj.tipapma = new Tipapma();
        cloneObj.tipapma.set(tipapma.getClonedField());
        cloneObj.itipapma = new Itipapma();
        cloneObj.itipapma.set(itipapma.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.apiLayout = new ApiLayout();
        cloneObj.apiLayout.set(apiLayout.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public UpdatePmaCursorInCtx getUpdatePmaCursorInCtx() {
            return new UpdatePmaCursorInCtx();
    }
     public class UpdatePmaCursorOutCtx implements Cloneable {
     Db2Workarea800 db2Workarea800 = Ip343690Ctx.this.getDb2Workarea800();
     DbUpdateError8023010 dbUpdateError8023010 = Ip343690Ctx.this.getDbUpdateError8023010();
     Tipapma tipapma = Ip343690Ctx.this.getTipapma();
     Itipapma itipapma = Ip343690Ctx.this.getItipapma();
     AbendParaName900 abendParaName900 = Ip343690Ctx.this.getAbendParaName900();
     AbendMessage900 abendMessage900 = Ip343690Ctx.this.getAbendMessage900();
     Work work = Ip343690Ctx.this.getWork();
     ApiLayout apiLayout = Ip343690Ctx.this.getApiLayout();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();
     Sqlca sqlca = Ip343690Ctx.this.getSqlca();

	/**
	 *	Test condition "B" for isNegativeCode88100()
	 *	@return  Returns true if isNegativeCode88100() is "B"
	 */
   public boolean isNegativeCode88100() throws CFException {
      return apiLayout.isNegativeCode88100();
   }

	/**
	*  set values "B"
	*/
   	public void setNegativeCode88100True()  throws CFException{  			
    	apiLayout.setNegativeCode88100True();
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
	 *	Returns the value of dbUpdateError8023010
	 *	@return dbUpdateError8023010
	 */   
	 public DbUpdateError8023010 getDbUpdateError8023010() {
   	return dbUpdateError8023010;
   }


	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Test condition "N" for isRowsNotFnd88100()
	 *	@return  Returns true if isRowsNotFnd88100() is "N"
	 */
   public boolean isRowsNotFnd88100() throws CFException {
      return apiLayout.isRowsNotFnd88100();
   }

	/**
	*  set values "N"
	*/
   	public void setRowsNotFnd88100True()  throws CFException{  			
    	apiLayout.setRowsNotFnd88100True();
   	}
	/**
	 *	Returns the value of abendCode800
	 *	@return abendCode800
	 */   
	 public AbendCode800 getAbendCode800() {
   	return db2Workarea800.getAbendCode800();
   }

   /**
	* 	Update AbendCode800 with the passed value
	*	@param value
	*/
   public void setAbendCode800(char[] value) throws CFException {
      db2Workarea800.setAbendCode800(value);
   }   

     /**
	 * 	Update AbendCode800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAbendCode800(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	db2Workarea800.setAbendCode800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	db2Workarea800.setAbendCode800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode800 with another Field
	 *	@param value
	 */
   public void setAbendCode800(Field source) {
   	db2Workarea800.setAbendCode800(source);
   }  
   
     /**
	 * 	Update AbendCode800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAbendCode800(Field source, int sourceIndex,int sourceLen) {
   	db2Workarea800.setAbendCode800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	db2Workarea800.setAbendCode800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendPara300
	 *	@return abendPara300
	 */
   public char[] getAbendPara300() throws CFException  {              
   		return work.getAbendPara300();
   }

  
	/**
	*  set variable abendPara300
	*  @param value
	**/
   public void setAbendPara300(char[] value) throws CFException {
      work.setAbendPara300(value);
   } 

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Test condition "Y" for isItIsSqlError88100()
	 *	@return  Returns true if isItIsSqlError88100() is "Y"
	 */
   public boolean isItIsSqlError88100() throws CFException {
      return work.isItIsSqlError88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsSqlError88100True()  throws CFException{  			
    	work.setItIsSqlError88100True();
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
	 *	Test condition "8300-UPDATE-PMA-CURSOR    " for isDb2UpdatePara88300()
	 *	@return  Returns true if isDb2UpdatePara88300() is "8300-UPDATE-PMA-CURSOR    "
	 */
   public boolean isDb2UpdatePara88300() throws CFException {
      return work.isDb2UpdatePara88300();
   }

	/**
	*  set values "8300-UPDATE-PMA-CURSOR    "
	*/
   	public void setDb2UpdatePara88300True()  throws CFException{  			
    	work.setDb2UpdatePara88300True();
   	}
	/**
	 *	Returns the value of itipapma
	 *	@return itipapma
	 */   
	 public Itipapma getItipapma() {
   	return itipapma;
   }


	/**
	 *	Returns the value of msg3010600
	 *	@return msg3010600
	 */
   public char[] getMsg3010600() throws CFException  {              
   		return work.getMsg3010600();
   }

  
	/**
	*  set variable msg3010600
	*  @param value
	**/
   public void setMsg3010600(char[] value) throws CFException {
      work.setMsg3010600(value);
   } 

	/**
	 *	Returns the value of noOfRows800
	 *	@return noOfRows800
	 */
	public long getNoOfRows800() throws CFException {        
   		return work.getNoOfRows800();
	}
	
	/**
	 * 	Update NoOfRows800 with the passed value
	 *	@param number
	 */
	public void setNoOfRows800(long number)  throws CFException{
		work.setNoOfRows800(number);
	}



	/**
	 *	Returns the value of commitRows800
	 *	@return commitRows800
	 */
	public long getCommitRows800() throws CFException {        
   		return work.getCommitRows800();
	}
	
	/**
	 * 	Update CommitRows800 with the passed value
	 *	@param number
	 */
	public void setCommitRows800(long number)  throws CFException{
		work.setCommitRows800(number);
	}



	/**
	 *	Returns the value of noTimes911Try800
	 *	@return noTimes911Try800
	 */
	public int getNoTimes911Try800() throws CFException {
   		return db2Workarea800.getNoTimes911Try800();
	}


	/**
	 *	Returns String value of noTimes911Try800
	 *	@return noTimes911Try800
	 */
	public char[]  getNoTimes911Try800String() throws CFException {
	     return String.valueOf(db2Workarea800.getNoTimes911Try800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean noTimes911Try800IsNumeric()  throws CFException{
	    return db2Workarea800.noTimes911Try800IsNumeric();
	}

	/**
	 * 	Update NoTimes911Try800 with the passed value
	 *	@param number
	 */
	public void setNoTimes911Try800(int number)  throws CFException{
		db2Workarea800.setNoTimes911Try800(number);
	}
	

	public void setNoTimes911Try800(long number)  throws CFException{
	    db2Workarea800.setNoTimes911Try800(number);
	}
	
	
	/**
	 * 	Update NoTimes911Try800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNoTimes911Try800(char[] value)  throws CFException {
		db2Workarea800.setNoTimes911Try800(value);
	}
	
	/**
	 * 	Update NoTimes911Try800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNoTimes911Try800String(char[] value)  throws CFException{
		db2Workarea800.setNoTimes911Try800(value);
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
	 *	Test condition "N" for isItIsDeadLockN88()
	 *	@return  Returns true if isItIsDeadLockN88() is "N"
	 */
   public boolean isItIsDeadLockN88() throws CFException {
      return work.isItIsDeadLockN88();
   }

	/**
	*  set values "N"
	*/
   	public void setItIsDeadLockN88True()  throws CFException{  			
    	work.setItIsDeadLockN88True();
   	}

        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += db2Workarea800.hashCode();
        str += dbUpdateError8023010.hashCode();
        str += tipapma.hashCode();
        str += itipapma.hashCode();
        str += abendParaName900.hashCode();
        str += abendMessage900.hashCode();
        str += work.hashCode();
        str += apiLayout.hashCode();
        str += constants300.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public UpdatePmaCursorOutCtx clone() {
        UpdatePmaCursorOutCtx cloneObj = new UpdatePmaCursorOutCtx();
        cloneObj.db2Workarea800 = new Db2Workarea800();
        cloneObj.db2Workarea800.set(db2Workarea800.getClonedField());
        cloneObj.dbUpdateError8023010 = new DbUpdateError8023010();
        cloneObj.dbUpdateError8023010.set(dbUpdateError8023010.getClonedField());
        cloneObj.tipapma = new Tipapma();
        cloneObj.tipapma.set(tipapma.getClonedField());
        cloneObj.itipapma = new Itipapma();
        cloneObj.itipapma.set(itipapma.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.apiLayout = new ApiLayout();
        cloneObj.apiLayout.set(apiLayout.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public UpdatePmaCursorOutCtx getUpdatePmaCursorOutCtx() {
            return new UpdatePmaCursorOutCtx();
    }
     public class DoCommitInCtx implements Cloneable {
     Parms1000 parms1000 = Ip343690Ctx.this.getParms1000();
     Work work = Ip343690Ctx.this.getWork();

	/**
	 *	Returns the value of commitFreq1000
	 *	@return commitFreq1000
	 */
	public long getCommitFreq1000() throws CFException {
   		return parms1000.getCommitFreq1000();
	}


	/**
	 *	Returns String value of commitFreq1000
	 *	@return commitFreq1000
	 */
	public char[]  getCommitFreq1000String() throws CFException {
	     return String.valueOf(parms1000.getCommitFreq1000String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean commitFreq1000IsNumeric()  throws CFException{
	    return parms1000.commitFreq1000IsNumeric();
	}

	/**
	 * 	Update CommitFreq1000 with the passed value
	 *	@param number
	 */
	public void setCommitFreq1000(long number)  throws CFException{
		parms1000.setCommitFreq1000(number);
	}
	

	
	/**
	 * 	Update CommitFreq1000 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCommitFreq1000(char[] value)  throws CFException {
		parms1000.setCommitFreq1000(value);
	}
	
	/**
	 * 	Update CommitFreq1000 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCommitFreq1000String(char[] value)  throws CFException{
		parms1000.setCommitFreq1000(value);
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
	 *	Returns the value of commitRows800
	 *	@return commitRows800
	 */
	public long getCommitRows800() throws CFException {        
   		return work.getCommitRows800();
	}
	
	/**
	 * 	Update CommitRows800 with the passed value
	 *	@param number
	 */
	public void setCommitRows800(long number)  throws CFException{
		work.setCommitRows800(number);
	}



	/**
	 *	Test condition "Y" for isEndOfProcess88100()
	 *	@return  Returns true if isEndOfProcess88100() is "Y"
	 */
   public boolean isEndOfProcess88100() throws CFException {
      return work.isEndOfProcess88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setEndOfProcess88100True()  throws CFException{  			
    	work.setEndOfProcess88100True();
   	}

        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }

        public DoCommitOutCtx getDoCommitOutCtx() {
            return new DoCommitOutCtx();
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
        str += work.hashCode();
       return str.hashCode();
    }

    public DoCommitInCtx clone() {
        DoCommitInCtx cloneObj = new DoCommitInCtx();
        cloneObj.parms1000 = new Parms1000();
        cloneObj.parms1000.set(parms1000.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DoCommitInCtx getDoCommitInCtx() {
            return new DoCommitInCtx();
    }
     public class DoCommitOutCtx implements Cloneable {
     Parms1000 parms1000 = Ip343690Ctx.this.getParms1000();
     Work work = Ip343690Ctx.this.getWork();

	/**
	 *	Returns the value of commitRows800
	 *	@return commitRows800
	 */
	public long getCommitRows800() throws CFException {        
   		return work.getCommitRows800();
	}
	
	/**
	 * 	Update CommitRows800 with the passed value
	 *	@param number
	 */
	public void setCommitRows800(long number)  throws CFException{
		work.setCommitRows800(number);
	}




        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
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
        str += work.hashCode();
       return str.hashCode();
    }

    public DoCommitOutCtx clone() {
        DoCommitOutCtx cloneObj = new DoCommitOutCtx();
        cloneObj.parms1000 = new Parms1000();
        cloneObj.parms1000.set(parms1000.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DoCommitOutCtx getDoCommitOutCtx() {
            return new DoCommitOutCtx();
    }
     public class DeadLockInCtx implements Cloneable {
     Db2Workarea800 db2Workarea800 = Ip343690Ctx.this.getDb2Workarea800();
     AbendParaName900 abendParaName900 = Ip343690Ctx.this.getAbendParaName900();
     AbendMessage900 abendMessage900 = Ip343690Ctx.this.getAbendMessage900();
     Work work = Ip343690Ctx.this.getWork();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();
     ApiLayout apiLayout = Ip343690Ctx.this.getApiLayout();
     Sqlca sqlca = Ip343690Ctx.this.getSqlca();
     DbSelectError8023006 dbSelectError8023006 = Ip343690Ctx.this.getDbSelectError8023006();

	/**
	 *	Returns the value of db2Deadlock600
	 *	@return db2Deadlock600
	 */
   public char[] getDb2Deadlock600() throws CFException  {              
   		return work.getDb2Deadlock600();
   }

  
	/**
	*  set variable db2Deadlock600
	*  @param value
	**/
   public void setDb2Deadlock600(char[] value) throws CFException {
      work.setDb2Deadlock600(value);
   } 

	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of abendCode800
	 *	@return abendCode800
	 */   
	 public AbendCode800 getAbendCode800() {
   	return db2Workarea800.getAbendCode800();
   }

   /**
	* 	Update AbendCode800 with the passed value
	*	@param value
	*/
   public void setAbendCode800(char[] value) throws CFException {
      db2Workarea800.setAbendCode800(value);
   }   

     /**
	 * 	Update AbendCode800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAbendCode800(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	db2Workarea800.setAbendCode800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	db2Workarea800.setAbendCode800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode800 with another Field
	 *	@param value
	 */
   public void setAbendCode800(Field source) {
   	db2Workarea800.setAbendCode800(source);
   }  
   
     /**
	 * 	Update AbendCode800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAbendCode800(Field source, int sourceIndex,int sourceLen) {
   	db2Workarea800.setAbendCode800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	db2Workarea800.setAbendCode800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sql911300
	 *	@return sql911300
	 */
	public int getSql911300() throws CFException {        
   		return constants300.getSql911300();
	}
	
	/**
	 * 	Update Sql911300 with the passed value
	 *	@param number
	 */
	public void setSql911300(int number)  throws CFException{
		constants300.setSql911300(number);
	}


	public void setSql911300(long number)  throws CFException{
		constants300.setSql911300((int)number);
	}


	/**
	 *	Test condition "Y" for isItIsDeadLockY88()
	 *	@return  Returns true if isItIsDeadLockY88() is "Y"
	 */
   public boolean isItIsDeadLockY88() throws CFException {
      return work.isItIsDeadLockY88();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsDeadLockY88True()  throws CFException{  			
    	work.setItIsDeadLockY88True();
   	}
	/**
	 *	Returns the value of value1300
	 *	@return value1300
	 */
	public int getValue1300() throws CFException {
   		return constants300.getValue1300();
	}


	/**
	 *	Returns String value of value1300
	 *	@return value1300
	 */
	public char[]  getValue1300String() throws CFException {
	     return String.valueOf(constants300.getValue1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value1300IsNumeric()  throws CFException{
	    return constants300.value1300IsNumeric();
	}

	/**
	 * 	Update Value1300 with the passed value
	 *	@param number
	 */
	public void setValue1300(int number)  throws CFException{
		constants300.setValue1300(number);
	}
	

	public void setValue1300(long number)  throws CFException{
	    constants300.setValue1300(number);
	}
	
	
	/**
	 * 	Update Value1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue1300(char[] value)  throws CFException {
		constants300.setValue1300(value);
	}
	
	/**
	 * 	Update Value1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue1300String(char[] value)  throws CFException{
		constants300.setValue1300(value);
	}	

	/**
	 *	Returns the value of noTimes911Try800
	 *	@return noTimes911Try800
	 */
	public int getNoTimes911Try800() throws CFException {
   		return db2Workarea800.getNoTimes911Try800();
	}


	/**
	 *	Returns String value of noTimes911Try800
	 *	@return noTimes911Try800
	 */
	public char[]  getNoTimes911Try800String() throws CFException {
	     return String.valueOf(db2Workarea800.getNoTimes911Try800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean noTimes911Try800IsNumeric()  throws CFException{
	    return db2Workarea800.noTimes911Try800IsNumeric();
	}

	/**
	 * 	Update NoTimes911Try800 with the passed value
	 *	@param number
	 */
	public void setNoTimes911Try800(int number)  throws CFException{
		db2Workarea800.setNoTimes911Try800(number);
	}
	

	public void setNoTimes911Try800(long number)  throws CFException{
	    db2Workarea800.setNoTimes911Try800(number);
	}
	
	
	/**
	 * 	Update NoTimes911Try800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNoTimes911Try800(char[] value)  throws CFException {
		db2Workarea800.setNoTimes911Try800(value);
	}
	
	/**
	 * 	Update NoTimes911Try800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNoTimes911Try800String(char[] value)  throws CFException{
		db2Workarea800.setNoTimes911Try800(value);
	}	

	/**
	 *	Returns the value of dbSelectError8023006
	 *	@return dbSelectError8023006
	 */   
	 public DbSelectError8023006 getDbSelectError8023006() {
   	return dbSelectError8023006;
   }


	/**
	 *	Returns the value of sql904300
	 *	@return sql904300
	 */
	public int getSql904300() throws CFException {        
   		return constants300.getSql904300();
	}
	
	/**
	 * 	Update Sql904300 with the passed value
	 *	@param number
	 */
	public void setSql904300(int number)  throws CFException{
		constants300.setSql904300(number);
	}


	public void setSql904300(long number)  throws CFException{
		constants300.setSql904300((int)number);
	}



        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }

        public DeadLockOutCtx getDeadLockOutCtx() {
            return new DeadLockOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += db2Workarea800.hashCode();
        str += abendParaName900.hashCode();
        str += abendMessage900.hashCode();
        str += work.hashCode();
        str += constants300.hashCode();
        str += apiLayout.hashCode();
        str += sqlca.hashCode();
        str += dbSelectError8023006.hashCode();
       return str.hashCode();
    }

    public DeadLockInCtx clone() {
        DeadLockInCtx cloneObj = new DeadLockInCtx();
        cloneObj.db2Workarea800 = new Db2Workarea800();
        cloneObj.db2Workarea800.set(db2Workarea800.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.apiLayout = new ApiLayout();
        cloneObj.apiLayout.set(apiLayout.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.dbSelectError8023006 = new DbSelectError8023006();
        cloneObj.dbSelectError8023006.set(dbSelectError8023006.getClonedField());
        return cloneObj;
    }

    }

    public DeadLockInCtx getDeadLockInCtx() {
            return new DeadLockInCtx();
    }
     public class DeadLockOutCtx implements Cloneable {
     Db2Workarea800 db2Workarea800 = Ip343690Ctx.this.getDb2Workarea800();
     AbendParaName900 abendParaName900 = Ip343690Ctx.this.getAbendParaName900();
     AbendMessage900 abendMessage900 = Ip343690Ctx.this.getAbendMessage900();
     Work work = Ip343690Ctx.this.getWork();
     ApiLayout apiLayout = Ip343690Ctx.this.getApiLayout();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();
     Sqlca sqlca = Ip343690Ctx.this.getSqlca();
     DbSelectError8023006 dbSelectError8023006 = Ip343690Ctx.this.getDbSelectError8023006();

	/**
	 *	Test condition "B" for isNegativeCode88100()
	 *	@return  Returns true if isNegativeCode88100() is "B"
	 */
   public boolean isNegativeCode88100() throws CFException {
      return apiLayout.isNegativeCode88100();
   }

	/**
	*  set values "B"
	*/
   	public void setNegativeCode88100True()  throws CFException{  			
    	apiLayout.setNegativeCode88100True();
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
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of abendMessage600
	 *	@return abendMessage600
	 */
   public char[] getAbendMessage600() throws CFException  {              
   		return work.getAbendMessage600();
   }

  
	/**
	*  set variable abendMessage600
	*  @param value
	**/
   public void setAbendMessage600(char[] value) throws CFException {
      work.setAbendMessage600(value);
   } 

	/**
	 *	Returns the value of abendCode800
	 *	@return abendCode800
	 */   
	 public AbendCode800 getAbendCode800() {
   	return db2Workarea800.getAbendCode800();
   }

   /**
	* 	Update AbendCode800 with the passed value
	*	@param value
	*/
   public void setAbendCode800(char[] value) throws CFException {
      db2Workarea800.setAbendCode800(value);
   }   

     /**
	 * 	Update AbendCode800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAbendCode800(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	db2Workarea800.setAbendCode800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	db2Workarea800.setAbendCode800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode800 with another Field
	 *	@param value
	 */
   public void setAbendCode800(Field source) {
   	db2Workarea800.setAbendCode800(source);
   }  
   
     /**
	 * 	Update AbendCode800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAbendCode800(Field source, int sourceIndex,int sourceLen) {
   	db2Workarea800.setAbendCode800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	db2Workarea800.setAbendCode800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendPara300
	 *	@return abendPara300
	 */
   public char[] getAbendPara300() throws CFException  {              
   		return work.getAbendPara300();
   }

  
	/**
	*  set variable abendPara300
	*  @param value
	**/
   public void setAbendPara300(char[] value) throws CFException {
      work.setAbendPara300(value);
   } 

	/**
	 *	Test condition "9100-DEAD-LOCK            " for isDb2DeadLockPara88300()
	 *	@return  Returns true if isDb2DeadLockPara88300() is "9100-DEAD-LOCK            "
	 */
   public boolean isDb2DeadLockPara88300() throws CFException {
      return work.isDb2DeadLockPara88300();
   }

	/**
	*  set values "9100-DEAD-LOCK            "
	*/
   	public void setDb2DeadLockPara88300True()  throws CFException{  			
    	work.setDb2DeadLockPara88300True();
   	}
	/**
	 *	Test condition "Y" for isItIsSqlError88100()
	 *	@return  Returns true if isItIsSqlError88100() is "Y"
	 */
   public boolean isItIsSqlError88100() throws CFException {
      return work.isItIsSqlError88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsSqlError88100True()  throws CFException{  			
    	work.setItIsSqlError88100True();
   	}
	/**
	 *	Returns the value of noTimes911Try800
	 *	@return noTimes911Try800
	 */
	public int getNoTimes911Try800() throws CFException {
   		return db2Workarea800.getNoTimes911Try800();
	}


	/**
	 *	Returns String value of noTimes911Try800
	 *	@return noTimes911Try800
	 */
	public char[]  getNoTimes911Try800String() throws CFException {
	     return String.valueOf(db2Workarea800.getNoTimes911Try800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean noTimes911Try800IsNumeric()  throws CFException{
	    return db2Workarea800.noTimes911Try800IsNumeric();
	}

	/**
	 * 	Update NoTimes911Try800 with the passed value
	 *	@param number
	 */
	public void setNoTimes911Try800(int number)  throws CFException{
		db2Workarea800.setNoTimes911Try800(number);
	}
	

	public void setNoTimes911Try800(long number)  throws CFException{
	    db2Workarea800.setNoTimes911Try800(number);
	}
	
	
	/**
	 * 	Update NoTimes911Try800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNoTimes911Try800(char[] value)  throws CFException {
		db2Workarea800.setNoTimes911Try800(value);
	}
	
	/**
	 * 	Update NoTimes911Try800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNoTimes911Try800String(char[] value)  throws CFException{
		db2Workarea800.setNoTimes911Try800(value);
	}	

	/**
	 *	Test condition "-904 OR -911 CONDN EXCEEDED PARM COUNT" for isAbendDb2911Error88600()
	 *	@return  Returns true if isAbendDb2911Error88600() is "-904 OR -911 CONDN EXCEEDED PARM COUNT"
	 */
   public boolean isAbendDb2911Error88600() throws CFException {
      return work.isAbendDb2911Error88600();
   }

	/**
	*  set values "-904 OR -911 CONDN EXCEEDED PARM COUNT"
	*/
   	public void setAbendDb2911Error88600True()  throws CFException{  			
    	work.setAbendDb2911Error88600True();
   	}
	/**
	 *	Returns the value of dbSelectError8023006
	 *	@return dbSelectError8023006
	 */   
	 public DbSelectError8023006 getDbSelectError8023006() {
   	return dbSelectError8023006;
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


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += db2Workarea800.hashCode();
        str += abendParaName900.hashCode();
        str += abendMessage900.hashCode();
        str += work.hashCode();
        str += apiLayout.hashCode();
        str += constants300.hashCode();
        str += sqlca.hashCode();
        str += dbSelectError8023006.hashCode();
       return str.hashCode();
    }

    public DeadLockOutCtx clone() {
        DeadLockOutCtx cloneObj = new DeadLockOutCtx();
        cloneObj.db2Workarea800 = new Db2Workarea800();
        cloneObj.db2Workarea800.set(db2Workarea800.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.apiLayout = new ApiLayout();
        cloneObj.apiLayout.set(apiLayout.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.dbSelectError8023006 = new DbSelectError8023006();
        cloneObj.dbSelectError8023006.set(dbSelectError8023006.getClonedField());
        return cloneObj;
    }

    }

    public DeadLockOutCtx getDeadLockOutCtx() {
            return new DeadLockOutCtx();
    }
     public class CallMcwaitForSleepInCtx implements Cloneable {
     Db2Workarea800 db2Workarea800 = Ip343690Ctx.this.getDb2Workarea800();
     Work work = Ip343690Ctx.this.getWork();
     SleepMessage600 sleepMessage600 = Ip343690Ctx.this.getSleepMessage600();

	/**
	 *	Returns the value of sleepTimeGroup800
	 *	@return sleepTimeGroup800
	 */   
	 public SleepTimeGroup800 getSleepTimeGroup800() {
   	return db2Workarea800.getSleepTimeGroup800();
   }

   /**
	* 	Update SleepTimeGroup800 with the passed value
	*	@param value
	*/
   public void setSleepTimeGroup800(char[] value) throws CFException {
      db2Workarea800.setSleepTimeGroup800(value);
   }   

     /**
	 * 	Update SleepTimeGroup800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSleepTimeGroup800(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	db2Workarea800.setSleepTimeGroup800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SleepTimeGroup800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSleepTimeGroup800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	db2Workarea800.setSleepTimeGroup800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SleepTimeGroup800 with another Field
	 *	@param value
	 */
   public void setSleepTimeGroup800(Field source) {
   	db2Workarea800.setSleepTimeGroup800(source);
   }  
   
     /**
	 * 	Update SleepTimeGroup800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSleepTimeGroup800(Field source, int sourceIndex,int sourceLen) {
   	db2Workarea800.setSleepTimeGroup800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SleepTimeGroup800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSleepTimeGroup800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	db2Workarea800.setSleepTimeGroup800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sleepTime800
	 *	@return sleepTime800
	 */
	public long getSleepTime800() throws CFException {
   		return db2Workarea800.getSleepTimeGroup800().getSleepTime800();
	}


	/**
	 *	Returns String value of sleepTime800
	 *	@return sleepTime800
	 */
	public char[]  getSleepTime800String() throws CFException {
	     return String.valueOf(db2Workarea800.getSleepTimeGroup800().getSleepTime800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sleepTime800IsNumeric()  throws CFException{
	    return db2Workarea800.getSleepTimeGroup800().sleepTime800IsNumeric();
	}

	/**
	 * 	Update SleepTime800 with the passed value
	 *	@param number
	 */
	public void setSleepTime800(long number)  throws CFException{
		db2Workarea800.getSleepTimeGroup800().setSleepTime800(number);
	}
	

	
	/**
	 * 	Update SleepTime800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSleepTime800(char[] value)  throws CFException {
		db2Workarea800.getSleepTimeGroup800().setSleepTime800(value);
	}
	
	/**
	 * 	Update SleepTime800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSleepTime800String(char[] value)  throws CFException{
		db2Workarea800.getSleepTimeGroup800().setSleepTime800(value);
	}	

	/**
	 *	Returns the value of sleepMessage600
	 *	@return sleepMessage600
	 */   
	 public SleepMessage600 getSleepMessage600() {
   	return sleepMessage600;
   }


	/**
	 *	Returns the value of ptrMcwait800
	 *	@return ptrMcwait800
	 */
   public char[] getPtrMcwait800() throws CFException  {              
   		return work.getPtrMcwait800();
   }

  
	/**
	*  set variable ptrMcwait800
	*  @param value
	**/
   public void setPtrMcwait800(char[] value) throws CFException {
      work.setPtrMcwait800(value);
   } 


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }

        public CallMcwaitForSleepOutCtx getCallMcwaitForSleepOutCtx() {
            return new CallMcwaitForSleepOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += db2Workarea800.hashCode();
        str += work.hashCode();
        str += sleepMessage600.hashCode();
       return str.hashCode();
    }

    public CallMcwaitForSleepInCtx clone() {
        CallMcwaitForSleepInCtx cloneObj = new CallMcwaitForSleepInCtx();
        cloneObj.db2Workarea800 = new Db2Workarea800();
        cloneObj.db2Workarea800.set(db2Workarea800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sleepMessage600 = new SleepMessage600();
        cloneObj.sleepMessage600.set(sleepMessage600.getClonedField());
        return cloneObj;
    }

    }

    public CallMcwaitForSleepInCtx getCallMcwaitForSleepInCtx() {
            return new CallMcwaitForSleepInCtx();
    }
     public class CallMcwaitForSleepOutCtx implements Cloneable {
     Db2Workarea800 db2Workarea800 = Ip343690Ctx.this.getDb2Workarea800();
     Work work = Ip343690Ctx.this.getWork();
     SleepMessage600 sleepMessage600 = Ip343690Ctx.this.getSleepMessage600();

	/**
	 *	Returns the value of sleepTimeGroup800
	 *	@return sleepTimeGroup800
	 */   
	 public SleepTimeGroup800 getSleepTimeGroup800() {
   	return db2Workarea800.getSleepTimeGroup800();
   }

   /**
	* 	Update SleepTimeGroup800 with the passed value
	*	@param value
	*/
   public void setSleepTimeGroup800(char[] value) throws CFException {
      db2Workarea800.setSleepTimeGroup800(value);
   }   

     /**
	 * 	Update SleepTimeGroup800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSleepTimeGroup800(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	db2Workarea800.setSleepTimeGroup800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SleepTimeGroup800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSleepTimeGroup800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	db2Workarea800.setSleepTimeGroup800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SleepTimeGroup800 with another Field
	 *	@param value
	 */
   public void setSleepTimeGroup800(Field source) {
   	db2Workarea800.setSleepTimeGroup800(source);
   }  
   
     /**
	 * 	Update SleepTimeGroup800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSleepTimeGroup800(Field source, int sourceIndex,int sourceLen) {
   	db2Workarea800.setSleepTimeGroup800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SleepTimeGroup800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSleepTimeGroup800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	db2Workarea800.setSleepTimeGroup800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currTime800
	 *	@return currTime800
	 */
   public char[] getCurrTime800() throws CFException  {              
   		return db2Workarea800.getCurrTime800();
   }

  
	/**
	*  set variable currTime800
	*  @param value
	**/
   public void setCurrTime800(char[] value) throws CFException {
      db2Workarea800.setCurrTime800(value);
   } 

     /**
	 * 	Update CurrTime800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrTime800(char[] source, int sourceIndex) throws CFException {
      db2Workarea800.setCurrTime800(source, sourceIndex);
   	
   }
   
   public void setCurrTime800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      db2Workarea800.setCurrTime800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrTime800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrTime800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db2Workarea800.setCurrTime800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrTime800 with another Field
	 *	@param value
	 */
   public void setCurrTime800(Field source) {
      db2Workarea800.setCurrTime800(source);
   }  
   
     /**
	 * 	Update CurrTime800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrTime800(Field source, int sourceIndex,int sourceLen) {
      db2Workarea800.setCurrTime800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrTime800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrTime800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      db2Workarea800.setCurrTime800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sleepTime800
	 *	@return sleepTime800
	 */
	public long getSleepTime800() throws CFException {
   		return db2Workarea800.getSleepTimeGroup800().getSleepTime800();
	}


	/**
	 *	Returns String value of sleepTime800
	 *	@return sleepTime800
	 */
	public char[]  getSleepTime800String() throws CFException {
	     return String.valueOf(db2Workarea800.getSleepTimeGroup800().getSleepTime800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sleepTime800IsNumeric()  throws CFException{
	    return db2Workarea800.getSleepTimeGroup800().sleepTime800IsNumeric();
	}

	/**
	 * 	Update SleepTime800 with the passed value
	 *	@param number
	 */
	public void setSleepTime800(long number)  throws CFException{
		db2Workarea800.getSleepTimeGroup800().setSleepTime800(number);
	}
	

	
	/**
	 * 	Update SleepTime800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSleepTime800(char[] value)  throws CFException {
		db2Workarea800.getSleepTimeGroup800().setSleepTime800(value);
	}
	
	/**
	 * 	Update SleepTime800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSleepTime800String(char[] value)  throws CFException{
		db2Workarea800.getSleepTimeGroup800().setSleepTime800(value);
	}	

	/**
	 *	Returns the value of currTime600
	 *	@return currTime600
	 */
   public char[] getCurrTime600() throws CFException  {              
   		return sleepMessage600.getCurrTime600();
   }

  
	/**
	*  set variable currTime600
	*  @param value
	**/
   public void setCurrTime600(char[] value) throws CFException {
      sleepMessage600.setCurrTime600(value);
   } 

     /**
	 * 	Update CurrTime600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrTime600(char[] source, int sourceIndex) throws CFException {
      sleepMessage600.setCurrTime600(source, sourceIndex);
   	
   }
   
   public void setCurrTime600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sleepMessage600.setCurrTime600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrTime600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrTime600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sleepMessage600.setCurrTime600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrTime600 with another Field
	 *	@param value
	 */
   public void setCurrTime600(Field source) {
      sleepMessage600.setCurrTime600(source);
   }  
   
     /**
	 * 	Update CurrTime600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrTime600(Field source, int sourceIndex,int sourceLen) {
      sleepMessage600.setCurrTime600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrTime600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrTime600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sleepMessage600.setCurrTime600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sleepTime600
	 *	@return sleepTime600
	 */
	public long getSleepTime600() throws CFException {
   		return sleepMessage600.getSleepTime600();
	}


	/**
	 *	Returns String value of sleepTime600
	 *	@return sleepTime600
	 */
	public char[]  getSleepTime600String() throws CFException {
	     return String.valueOf(sleepMessage600.getSleepTime600String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sleepTime600IsNumeric()  throws CFException{
	    return sleepMessage600.sleepTime600IsNumeric();
	}

	/**
	 * 	Update SleepTime600 with the passed value
	 *	@param number
	 */
	public void setSleepTime600(long number)  throws CFException{
		sleepMessage600.setSleepTime600(number);
	}
	

	
	/**
	 * 	Update SleepTime600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSleepTime600(char[] value)  throws CFException {
		sleepMessage600.setSleepTime600(value);
	}
	
	/**
	 * 	Update SleepTime600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSleepTime600String(char[] value)  throws CFException{
		sleepMessage600.setSleepTime600(value);
	}	


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += db2Workarea800.hashCode();
        str += work.hashCode();
        str += sleepMessage600.hashCode();
       return str.hashCode();
    }

    public CallMcwaitForSleepOutCtx clone() {
        CallMcwaitForSleepOutCtx cloneObj = new CallMcwaitForSleepOutCtx();
        cloneObj.db2Workarea800 = new Db2Workarea800();
        cloneObj.db2Workarea800.set(db2Workarea800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sleepMessage600 = new SleepMessage600();
        cloneObj.sleepMessage600.set(sleepMessage600.getClonedField());
        return cloneObj;
    }

    }

    public CallMcwaitForSleepOutCtx getCallMcwaitForSleepOutCtx() {
            return new CallMcwaitForSleepOutCtx();
    }
     public class AbendTheProgramInCtx implements Cloneable {
     SqlAbendMsg900 sqlAbendMsg900 = Ip343690Ctx.this.getSqlAbendMsg900();
     Db2Workarea800 db2Workarea800 = Ip343690Ctx.this.getDb2Workarea800();
     AbendParaName900 abendParaName900 = Ip343690Ctx.this.getAbendParaName900();
     AbendMessage900 abendMessage900 = Ip343690Ctx.this.getAbendMessage900();
     Work work = Ip343690Ctx.this.getWork();
     ApiLayout apiLayout = Ip343690Ctx.this.getApiLayout();
     Sqlca sqlca = Ip343690Ctx.this.getSqlca();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip343690Ctx.this.getIp60001EventLogWorkArea();

	/**
	 *	Returns the value of sqlAbendMsg900
	 *	@return sqlAbendMsg900
	 */   
	 public SqlAbendMsg900 getSqlAbendMsg900() {
   	return sqlAbendMsg900;
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

	/**
	 *	Returns the value of abendParaName900
	 *	@return abendParaName900
	 */   
	 public AbendParaName900 getAbendParaName900() {
   	return abendParaName900;
   }


	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of sqlerrd
	 *	@return sqlerrd
	 */
	public int getSqlerrd(int index) throws CFException {        
   		return sqlca.getSqlerrd((index));
	}
	
	/**
	 * 	Update Sqlerrd with the passed value
	 *	@param number
	 */
	public void setSqlerrd(int index,int number)  throws CFException{
		sqlca.setSqlerrd((index),number);
	}


	public void setSqlerrd(int index,long number)  throws CFException{
		sqlca.setSqlerrd((index),(int)number);
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

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
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
	 *	Test condition "Y" for isItIsSqlError88100()
	 *	@return  Returns true if isItIsSqlError88100() is "Y"
	 */
   public boolean isItIsSqlError88100() throws CFException {
      return work.isItIsSqlError88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsSqlError88100True()  throws CFException{  			
    	work.setItIsSqlError88100True();
   	}
	/**
	 *	Returns the value of abend800
	 *	@return abend800
	 */
	public short getAbend800() throws CFException {        
   		return db2Workarea800.getAbendCode800().getAbend800();
	}
	
	/**
	 * 	Update Abend800 with the passed value
	 *	@param number
	 */
	public void setAbend800(short number)  throws CFException{
		db2Workarea800.getAbendCode800().setAbend800(number);
	}

	public void setAbend800(int number)  throws CFException{
		db2Workarea800.getAbendCode800().setAbend800((short)number);
	}

	public void setAbend800(long number)  throws CFException{
		db2Workarea800.getAbendCode800().setAbend800((short)number);
	}



	/**
	 *	Returns the value of sqlwarn
	 *	@return sqlwarn
	 */   
	 public Sqlwarn getSqlwarn() {
   	return sqlca.getSqlwarn();
   }

   /**
	* 	Update Sqlwarn with the passed value
	*	@param value
	*/
   public void setSqlwarn(char[] value) throws CFException {
      sqlca.setSqlwarn(value);
   }   

     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlwarn with another Field
	 *	@param value
	 */
   public void setSqlwarn(Field source) {
   	sqlca.setSqlwarn(source);
   }  
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlwarn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlwarn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sqlca.setSqlwarn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of abendMessage900
	 *	@return abendMessage900
	 */   
	 public AbendMessage900 getAbendMessage900() {
   	return abendMessage900;
   }


	/**
	 *	Test condition "Y" for isItIsConnectedToDb288100()
	 *	@return  Returns true if isItIsConnectedToDb288100() is "Y"
	 */
   public boolean isItIsConnectedToDb288100() throws CFException {
      return apiLayout.isItIsConnectedToDb288100();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsConnectedToDb288100True()  throws CFException{  			
    	apiLayout.setItIsConnectedToDb288100True();
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
	 *	Returns the value of sqlerrmc
	 *	@return sqlerrmc
	 */
   public char[] getSqlerrmc() throws CFException  {              
   		return sqlca.getSqlerrm().getSqlerrmc();
   }

  
	/**
	*  set variable sqlerrmc
	*  @param value
	**/
   public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
   } 

     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
   	
   }
   
   public void setSqlerrmc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlerrmc with another Field
	 *	@param value
	 */
   public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
   }  
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }

        public AbendTheProgramOutCtx getAbendTheProgramOutCtx() {
            return new AbendTheProgramOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlAbendMsg900.hashCode();
        str += db2Workarea800.hashCode();
        str += abendParaName900.hashCode();
        str += abendMessage900.hashCode();
        str += work.hashCode();
        str += apiLayout.hashCode();
        str += sqlca.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public AbendTheProgramInCtx clone() {
        AbendTheProgramInCtx cloneObj = new AbendTheProgramInCtx();
        cloneObj.sqlAbendMsg900 = new SqlAbendMsg900();
        cloneObj.sqlAbendMsg900.set(sqlAbendMsg900.getClonedField());
        cloneObj.db2Workarea800 = new Db2Workarea800();
        cloneObj.db2Workarea800.set(db2Workarea800.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.apiLayout = new ApiLayout();
        cloneObj.apiLayout.set(apiLayout.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public AbendTheProgramInCtx getAbendTheProgramInCtx() {
            return new AbendTheProgramInCtx();
    }
     public class AbendTheProgramOutCtx implements Cloneable {
     SqlAbendMsg900 sqlAbendMsg900 = Ip343690Ctx.this.getSqlAbendMsg900();
     Db2Workarea800 db2Workarea800 = Ip343690Ctx.this.getDb2Workarea800();
     AbendMessage900 abendMessage900 = Ip343690Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip343690Ctx.this.getAbendParaName900();
     Work work = Ip343690Ctx.this.getWork();
     ApiLayout apiLayout = Ip343690Ctx.this.getApiLayout();
     Sqlca sqlca = Ip343690Ctx.this.getSqlca();
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip343690Ctx.this.getIp60001EventLogWorkArea();

	/**
	 *	Returns the value of sqlcode
	 *	@return sqlcode
	 */
	public int getSqlcode() throws CFException {        
   		return sqlca.getSqlcode();
	}
	
	/**
	 * 	Update Sqlcode with the passed value
	 *	@param number
	 */
	public void setSqlcode(int number)  throws CFException{
		sqlca.setSqlcode(number);
	}


	public void setSqlcode(long number)  throws CFException{
		sqlca.setSqlcode((int)number);
	}


	/**
	 *	Returns the value of abendCd800
	 *	@return abendCd800
	 */
	public int getAbendCd800() throws CFException {
   		return db2Workarea800.getAbendCd800();
	}


	/**
	 *	Returns String value of abendCd800
	 *	@return abendCd800
	 */
	public char[]  getAbendCd800String() throws CFException {
	     return String.valueOf(db2Workarea800.getAbendCd800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean abendCd800IsNumeric()  throws CFException{
	    return db2Workarea800.abendCd800IsNumeric();
	}

	/**
	 * 	Update AbendCd800 with the passed value
	 *	@param number
	 */
	public void setAbendCd800(int number)  throws CFException{
		db2Workarea800.setAbendCd800(number);
	}
	

	public void setAbendCd800(long number)  throws CFException{
	    db2Workarea800.setAbendCd800(number);
	}
	
	
	/**
	 * 	Update AbendCd800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCd800(char[] value)  throws CFException {
		db2Workarea800.setAbendCd800(value);
	}
	
	/**
	 * 	Update AbendCd800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCd800String(char[] value)  throws CFException{
		db2Workarea800.setAbendCd800(value);
	}	

	/**
	 *	Returns the value of abendSqlCode900
	 *	@return abendSqlCode900
	 */
   public char[] getAbendSqlCode900() throws CFException  {              
   		return sqlAbendMsg900.getAbendSqlCode900();
   }

  
	/**
	*  set variable abendSqlCode900
	*  @param value
	**/
   public void setAbendSqlCode900(char[] value) throws CFException {
      sqlAbendMsg900.setAbendSqlCode900(value);
   } 

     /**
	 * 	Update AbendSqlCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendSqlCode900(char[] source, int sourceIndex) throws CFException {
      sqlAbendMsg900.setAbendSqlCode900(source, sourceIndex);
   	
   }
   
   public void setAbendSqlCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlAbendMsg900.setAbendSqlCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendSqlCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendSqlCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlAbendMsg900.setAbendSqlCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendSqlCode900 with another Field
	 *	@param value
	 */
   public void setAbendSqlCode900(Field source) {
      sqlAbendMsg900.setAbendSqlCode900(source);
   }  
   
     /**
	 * 	Update AbendSqlCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendSqlCode900(Field source, int sourceIndex,int sourceLen) {
      sqlAbendMsg900.setAbendSqlCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendSqlCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendSqlCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlAbendMsg900.setAbendSqlCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of abend800
	 *	@return abend800
	 */
	public short getAbend800() throws CFException {        
   		return db2Workarea800.getAbendCode800().getAbend800();
	}
	
	/**
	 * 	Update Abend800 with the passed value
	 *	@param number
	 */
	public void setAbend800(short number)  throws CFException{
		db2Workarea800.getAbendCode800().setAbend800(number);
	}

	public void setAbend800(int number)  throws CFException{
		db2Workarea800.getAbendCode800().setAbend800((short)number);
	}

	public void setAbend800(long number)  throws CFException{
		db2Workarea800.getAbendCode800().setAbend800((short)number);
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
	 *	Returns the value of abendMessage900
	 *	@return abendMessage900
	 */   
	 public AbendMessage900 getAbendMessage900() {
   	return abendMessage900;
   }


	/**
	 *	Returns the value of abendSqlerrmc900
	 *	@return abendSqlerrmc900
	 */
   public char[] getAbendSqlerrmc900() throws CFException  {              
   		return sqlAbendMsg900.getAbendSqlerrmc900();
   }

  
	/**
	*  set variable abendSqlerrmc900
	*  @param value
	**/
   public void setAbendSqlerrmc900(char[] value) throws CFException {
      sqlAbendMsg900.setAbendSqlerrmc900(value);
   } 

     /**
	 * 	Update AbendSqlerrmc900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendSqlerrmc900(char[] source, int sourceIndex) throws CFException {
      sqlAbendMsg900.setAbendSqlerrmc900(source, sourceIndex);
   	
   }
   
   public void setAbendSqlerrmc900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlAbendMsg900.setAbendSqlerrmc900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendSqlerrmc900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendSqlerrmc900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlAbendMsg900.setAbendSqlerrmc900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendSqlerrmc900 with another Field
	 *	@param value
	 */
   public void setAbendSqlerrmc900(Field source) {
      sqlAbendMsg900.setAbendSqlerrmc900(source);
   }  
   
     /**
	 * 	Update AbendSqlerrmc900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendSqlerrmc900(Field source, int sourceIndex,int sourceLen) {
      sqlAbendMsg900.setAbendSqlerrmc900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendSqlerrmc900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendSqlerrmc900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlAbendMsg900.setAbendSqlerrmc900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "3013" for isDb2UnsucessRollback88300()
	 *	@return  Returns true if isDb2UnsucessRollback88300() is "3013"
	 */
   public boolean isDb2UnsucessRollback88300() throws CFException {
      return work.isDb2UnsucessRollback88300();
   }

	/**
	*  set values "3013"
	*/
   	public void setDb2UnsucessRollback88300True()  throws CFException{  			
    	work.setDb2UnsucessRollback88300True();
   	}
	/**
	 *	Returns the value of abendMessage600
	 *	@return abendMessage600
	 */
   public char[] getAbendMessage600() throws CFException  {              
   		return work.getAbendMessage600();
   }

  
	/**
	*  set variable abendMessage600
	*  @param value
	**/
   public void setAbendMessage600(char[] value) throws CFException {
      work.setAbendMessage600(value);
   } 

	/**
	 *	Test condition "DB2-DATABASE ERROR-UNSUCCESSFUL ROLLBACK" for isAbendDb2RbackError88600()
	 *	@return  Returns true if isAbendDb2RbackError88600() is "DB2-DATABASE ERROR-UNSUCCESSFUL ROLLBACK"
	 */
   public boolean isAbendDb2RbackError88600() throws CFException {
      return work.isAbendDb2RbackError88600();
   }

	/**
	*  set values "DB2-DATABASE ERROR-UNSUCCESSFUL ROLLBACK"
	*/
   	public void setAbendDb2RbackError88600True()  throws CFException{  			
    	work.setAbendDb2RbackError88600True();
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
	 *	Returns the value of sqlerrmc
	 *	@return sqlerrmc
	 */
   public char[] getSqlerrmc() throws CFException  {              
   		return sqlca.getSqlerrm().getSqlerrmc();
   }

  
	/**
	*  set variable sqlerrmc
	*  @param value
	**/
   public void setSqlerrmc(char[] value) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(value);
   } 

     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex) throws CFException {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex);
   	
   }
   
   public void setSqlerrmc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sqlerrmc with another Field
	 *	@param value
	 */
   public void setSqlerrmc(Field source) {
      sqlca.getSqlerrm().setSqlerrmc(source);
   }  
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sqlerrmc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlerrmc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sqlca.getSqlerrm().setSqlerrmc(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of abendCode300
	 *	@return abendCode300
	 */
   public char[] getAbendCode300() throws CFException  {              
   		return work.getAbendCode300();
   }

  
	/**
	*  set variable abendCode300
	*  @param value
	**/
   public void setAbendCode300(char[] value) throws CFException {
      work.setAbendCode300(value);
   } 


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlAbendMsg900.hashCode();
        str += db2Workarea800.hashCode();
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += work.hashCode();
        str += apiLayout.hashCode();
        str += sqlca.hashCode();
        str += ip60001EventLogWorkArea.hashCode();
       return str.hashCode();
    }

    public AbendTheProgramOutCtx clone() {
        AbendTheProgramOutCtx cloneObj = new AbendTheProgramOutCtx();
        cloneObj.sqlAbendMsg900 = new SqlAbendMsg900();
        cloneObj.sqlAbendMsg900.set(sqlAbendMsg900.getClonedField());
        cloneObj.db2Workarea800 = new Db2Workarea800();
        cloneObj.db2Workarea800.set(db2Workarea800.getClonedField());
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.apiLayout = new ApiLayout();
        cloneObj.apiLayout.set(apiLayout.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.ip60001EventLogWorkArea = new Ip60001EventLogWorkArea();
        cloneObj.ip60001EventLogWorkArea.set(ip60001EventLogWorkArea.getClonedField());
        return cloneObj;
    }

    }

    public AbendTheProgramOutCtx getAbendTheProgramOutCtx() {
            return new AbendTheProgramOutCtx();
    }
     public class ExecuteDb2errRotuineInCtx implements Cloneable {
     Work work = Ip343690Ctx.this.getWork();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();
     Sqlca sqlca = Ip343690Ctx.this.getSqlca();

	/**
	 *	Returns the value of blankSpace600
	 *	@return blankSpace600
	 */
   public char[] getBlankSpace600() throws CFException  {              
   		return work.getBlankSpace600();
   }

  
	/**
	*  set variable blankSpace600
	*  @param value
	**/
   public void setBlankSpace600(char[] value) throws CFException {
      work.setBlankSpace600(value);
   } 

	/**
	 *	Returns the value of asteriskLine600
	 *	@return asteriskLine600
	 */
   public char[] getAsteriskLine600() throws CFException  {              
   		return work.getAsteriskLine600();
   }

  
	/**
	*  set variable asteriskLine600
	*  @param value
	**/
   public void setAsteriskLine600(char[] value) throws CFException {
      work.setAsteriskLine600(value);
   } 

	/**
	 *	Returns the value of pgmIp343690Group300
	 *	@return pgmIp343690Group300
	 */   
	 public PgmIp343690Group300 getPgmIp343690Group300() {
   	return constants300.getPgmIp343690Group300();
   }

   /**
	* 	Update PgmIp343690Group300 with the passed value
	*	@param value
	*/
   public void setPgmIp343690Group300(char[] value) throws CFException {
      constants300.setPgmIp343690Group300(value);
   }   

     /**
	 * 	Update PgmIp343690Group300 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPgmIp343690Group300(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	constants300.setPgmIp343690Group300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PgmIp343690Group300 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp343690Group300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	constants300.setPgmIp343690Group300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PgmIp343690Group300 with another Field
	 *	@param value
	 */
   public void setPgmIp343690Group300(Field source) {
   	constants300.setPgmIp343690Group300(source);
   }  
   
     /**
	 * 	Update PgmIp343690Group300 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPgmIp343690Group300(Field source, int sourceIndex,int sourceLen) {
   	constants300.setPgmIp343690Group300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PgmIp343690Group300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp343690Group300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	constants300.setPgmIp343690Group300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of db85102cDb2BatchErrorRtn
	 *	@return db85102cDb2BatchErrorRtn
	 */
   public char[] getDb85102cDb2BatchErrorRtn() throws CFException  {              
   		return work.getDb85102cDb2BatchErrorRtn();
   }

  
	/**
	*  set variable db85102cDb2BatchErrorRtn
	*  @param value
	**/
   public void setDb85102cDb2BatchErrorRtn(char[] value) throws CFException {
      work.setDb85102cDb2BatchErrorRtn(value);
   } 

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of db2ErrModuleMsg600
	 *	@return db2ErrModuleMsg600
	 */
   public char[] getDb2ErrModuleMsg600() throws CFException  {              
   		return work.getDb2ErrModuleMsg600();
   }

  
	/**
	*  set variable db2ErrModuleMsg600
	*  @param value
	**/
   public void setDb2ErrModuleMsg600(char[] value) throws CFException {
      work.setDb2ErrModuleMsg600(value);
   } 

	/**
	 *	Returns the value of cond0000300
	 *	@return cond0000300
	 */
	public short getCond0000300() throws CFException {
   		return constants300.getCond0000300();
	}

    /**
	 *	Returns the String value of cond0000300
	 *	@return cond0000300
	 */
	public char[]  getCond0000300ActualString() {
		return constants300.getCond0000300ActualString();
	}

	/**
	 *	Returns String value of cond0000300
	 *	@return cond0000300
	 */
	public char[]  getCond0000300String() throws CFException {
	     return String.valueOf(constants300.getCond0000300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cond0000300IsNumeric()  throws CFException{
	    return constants300.cond0000300IsNumeric();
	}

	/**
	 * 	Update Cond0000300 with the passed value
	 *	@param number
	 */
	public void setCond0000300(short number)  throws CFException{
		constants300.setCond0000300(number);
	}
	
	public void setCond0000300(int number)  throws CFException{
	    constants300.setCond0000300(number);
	}
	public void setCond0000300(long number)  throws CFException{
	    constants300.setCond0000300(number);
	}
	

	
	/**
	 * 	Update Cond0000300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCond0000300(char[] value)  throws CFException {
		constants300.setCond0000300(value);
	}
	
	/**
	 * 	Update Cond0000300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCond0000300String(char[] value)  throws CFException{
		constants300.setCond0000300(value);
	}	


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
        }

        public ExecuteDb2errRotuineOutCtx getExecuteDb2errRotuineOutCtx() {
            return new ExecuteDb2errRotuineOutCtx();
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
        str += constants300.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public ExecuteDb2errRotuineInCtx clone() {
        ExecuteDb2errRotuineInCtx cloneObj = new ExecuteDb2errRotuineInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public ExecuteDb2errRotuineInCtx getExecuteDb2errRotuineInCtx() {
            return new ExecuteDb2errRotuineInCtx();
    }
     public class ExecuteDb2errRotuineOutCtx implements Cloneable {
     Work work = Ip343690Ctx.this.getWork();
     Constants300 constants300 = Ip343690Ctx.this.getConstants300();
     Sqlca sqlca = Ip343690Ctx.this.getSqlca();

	/**
	 *	Returns the value of pgmIp343690Group300
	 *	@return pgmIp343690Group300
	 */   
	 public PgmIp343690Group300 getPgmIp343690Group300() {
   	return constants300.getPgmIp343690Group300();
   }

   /**
	* 	Update PgmIp343690Group300 with the passed value
	*	@param value
	*/
   public void setPgmIp343690Group300(char[] value) throws CFException {
      constants300.setPgmIp343690Group300(value);
   }   

     /**
	 * 	Update PgmIp343690Group300 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPgmIp343690Group300(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	constants300.setPgmIp343690Group300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PgmIp343690Group300 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp343690Group300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	constants300.setPgmIp343690Group300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PgmIp343690Group300 with another Field
	 *	@param value
	 */
   public void setPgmIp343690Group300(Field source) {
   	constants300.setPgmIp343690Group300(source);
   }  
   
     /**
	 * 	Update PgmIp343690Group300 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPgmIp343690Group300(Field source, int sourceIndex,int sourceLen) {
   	constants300.setPgmIp343690Group300(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PgmIp343690Group300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp343690Group300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	constants300.setPgmIp343690Group300(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }



        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
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
        str += constants300.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public ExecuteDb2errRotuineOutCtx clone() {
        ExecuteDb2errRotuineOutCtx cloneObj = new ExecuteDb2errRotuineOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.constants300 = new Constants300();
        cloneObj.constants300.set(constants300.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public ExecuteDb2errRotuineOutCtx getExecuteDb2errRotuineOutCtx() {
            return new ExecuteDb2errRotuineOutCtx();
    }
     public class UpdateEventLogInCtx implements Cloneable {
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip343690Ctx.this.getIp60001EventLogWorkArea();

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


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
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
     Ip60001EventLogWorkArea ip60001EventLogWorkArea = Ip343690Ctx.this.getIp60001EventLogWorkArea();

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


        public Ip343690Ctx getIp343690Ctx() {
            return Ip343690Ctx.this;
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
