package com.cloudframe.app.db2funci;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.db2funci.dto.DateFields;
import com.cloudframe.app.db2funci.dto.Db2Indicators;
import com.cloudframe.app.db2funci.dto.MsdSecurityDesc1;
import com.cloudframe.app.db2funci.dto.MsdAddedCcyymmdd;
import com.cloudframe.app.db2funci.dto.Dclvmsdxrfk;
import com.cloudframe.app.db2funci.dto.ApplicationCodeListGroup;
import com.cloudframe.app.db2funci.dto.Work;
import com.cloudframe.app.db2funci.dto.Sqlwarn;
import com.cloudframe.app.db2funci.dto.MsdSecTypeCodes;
import com.cloudframe.app.db2funci.dto.Dclscpsectb;
import java.sql.ResultSet;
import com.cloudframe.app.db2funci.dto.Bdms01CallParameters;
import com.cloudframe.app.db2funci.dto.AcceptInput;
import com.cloudframe.app.db2funci.dto.C1Dtl;
import com.cloudframe.app.db2funci.dto.Dclvcrrexrt;
import com.cloudframe.app.db2funci.dto.Dclvbsscrdt;
import com.cloudframe.app.db2funci.dto.HostVariables;
import com.cloudframe.app.db2funci.dto.Loc1;
import com.cloudframe.app.db2funci.dto.Dclvmstranb;
import com.cloudframe.app.db2funci.dto.Parm;
import com.cloudframe.app.db2funci.dto.Sdms01Parm;
import com.cloudframe.app.db2funci.dto.Dcltbdemsec;
import com.cloudframe.app.db2funci.dto.HostAppCodeTbl;
import com.cloudframe.app.db2funci.dto.ParmlstGroup;
import com.cloudframe.app.db2funci.dto.Sqlca;
import com.cloudframe.app.db2funci.dto.Parmlst;


@Context
public class Db2funciCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    AcceptInput acceptInput;
    Work work;
    Dclvbsscrdt dclvbsscrdt;
    DateFields dateFields;
    Dclscpsectb dclscpsectb;
    Sdms01Parm sdms01Parm;
    Bdms01CallParameters bdms01CallParameters;
    Dcltbdemsec dcltbdemsec;
    Dclvmstranb dclvmstranb;
    Dclvcrrexrt dclvcrrexrt;
    HostVariables hostVariables;
    Db2Indicators db2Indicators;
    ParmlstGroup parmlstGroup;
    Parm parm;
    Sqlca sqlca;
    C1Dtl c1Dtl;
    Dclvmsdxrfk dclvmsdxrfk;
    ApplicationCodeListGroup applicationCodeListGroup;


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


    ResultSet c1ResultSet;

    public ResultSet getC1ResultSet() {
        return this.c1ResultSet;
    }

    public void setC1ResultSet(ResultSet c1ResultSet) {
        this.c1ResultSet = c1ResultSet;
    }
    ResultSet xrefCursorResultSet;

    public ResultSet getXrefCursorResultSet() {
        return this.xrefCursorResultSet;
    }

    public void setXrefCursorResultSet(ResultSet xrefCursorResultSet) {
        this.xrefCursorResultSet = xrefCursorResultSet;
    }
    ResultSet isinCursorResultSet;

    public ResultSet getIsinCursorResultSet() {
        return this.isinCursorResultSet;
    }

    public void setIsinCursorResultSet(ResultSet isinCursorResultSet) {
        this.isinCursorResultSet = isinCursorResultSet;
    }
    ResultSet positionCursorResultSet;

    public ResultSet getPositionCursorResultSet() {
        return this.positionCursorResultSet;
    }

    public void setPositionCursorResultSet(ResultSet positionCursorResultSet) {
        this.positionCursorResultSet = positionCursorResultSet;
    }

    boolean programEnded = false;

    public boolean isProgramEnded() {
        return this.programEnded;
    }

    public void setProgramEnded(boolean programEnded) {
        this.programEnded = programEnded;
    }


    public AcceptInput getAcceptInput() {
        if (acceptInput == null) {
            acceptInput = new AcceptInput();
        }

        return acceptInput;
    }

    public void setAcceptInput(AcceptInput acceptInput) {
        this.acceptInput = acceptInput;
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
    public Dclvbsscrdt getDclvbsscrdt() {
        if (dclvbsscrdt == null) {
            dclvbsscrdt = new Dclvbsscrdt();
        }

        return dclvbsscrdt;
    }

    public void setDclvbsscrdt(Dclvbsscrdt dclvbsscrdt) {
        this.dclvbsscrdt = dclvbsscrdt;
    }
    public DateFields getDateFields() {
        if (dateFields == null) {
            dateFields = new DateFields();
        }

        return dateFields;
    }

    public void setDateFields(DateFields dateFields) {
        this.dateFields = dateFields;
    }
    public Dclscpsectb getDclscpsectb() {
        if (dclscpsectb == null) {
            dclscpsectb = new Dclscpsectb();
        }

        return dclscpsectb;
    }

    public void setDclscpsectb(Dclscpsectb dclscpsectb) {
        this.dclscpsectb = dclscpsectb;
    }
    public Sdms01Parm getSdms01Parm() {
        if (sdms01Parm == null) {
            sdms01Parm = new Sdms01Parm();
        }

        return sdms01Parm;
    }

    public void setSdms01Parm(Sdms01Parm sdms01Parm) {
        this.sdms01Parm = sdms01Parm;
    }
    public Bdms01CallParameters getBdms01CallParameters() {
        if (bdms01CallParameters == null) {
            bdms01CallParameters = new Bdms01CallParameters();
        }

        return bdms01CallParameters;
    }

    public void setBdms01CallParameters(Bdms01CallParameters bdms01CallParameters) {
        this.bdms01CallParameters = bdms01CallParameters;
    }
    public Dcltbdemsec getDcltbdemsec() {
        if (dcltbdemsec == null) {
            dcltbdemsec = new Dcltbdemsec();
        }

        return dcltbdemsec;
    }

    public void setDcltbdemsec(Dcltbdemsec dcltbdemsec) {
        this.dcltbdemsec = dcltbdemsec;
    }
    public Dclvmstranb getDclvmstranb() {
        if (dclvmstranb == null) {
            dclvmstranb = new Dclvmstranb();
        }

        return dclvmstranb;
    }

    public void setDclvmstranb(Dclvmstranb dclvmstranb) {
        this.dclvmstranb = dclvmstranb;
    }
    public Dclvcrrexrt getDclvcrrexrt() {
        if (dclvcrrexrt == null) {
            dclvcrrexrt = new Dclvcrrexrt();
        }

        return dclvcrrexrt;
    }

    public void setDclvcrrexrt(Dclvcrrexrt dclvcrrexrt) {
        this.dclvcrrexrt = dclvcrrexrt;
    }
    public HostVariables getHostVariables() {
        if (hostVariables == null) {
            hostVariables = new HostVariables();
        }

        return hostVariables;
    }

    public void setHostVariables(HostVariables hostVariables) {
        this.hostVariables = hostVariables;
    }
    public Db2Indicators getDb2Indicators() {
        if (db2Indicators == null) {
            db2Indicators = new Db2Indicators();
        }

        return db2Indicators;
    }

    public void setDb2Indicators(Db2Indicators db2Indicators) {
        this.db2Indicators = db2Indicators;
    }
    public ParmlstGroup getParmlstGroup() {
        if (parmlstGroup == null) {
            parmlstGroup = new ParmlstGroup();
        }

        return parmlstGroup;
    }

    public void setParmlstGroup(ParmlstGroup parmlstGroup) {
        this.parmlstGroup = parmlstGroup;
    }
    public Parm getParm() {
        if (parm == null) {
            parm = new Parm();
        }

        return parm;
    }

    public void setParm(Parm parm) {
        this.parm = parm;
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
    public C1Dtl getC1Dtl() {
        if (c1Dtl == null) {
            c1Dtl = new C1Dtl();
        }

        return c1Dtl;
    }

    public void setC1Dtl(C1Dtl c1Dtl) {
        this.c1Dtl = c1Dtl;
    }
    public Dclvmsdxrfk getDclvmsdxrfk() {
        if (dclvmsdxrfk == null) {
            dclvmsdxrfk = new Dclvmsdxrfk();
        }

        return dclvmsdxrfk;
    }

    public void setDclvmsdxrfk(Dclvmsdxrfk dclvmsdxrfk) {
        this.dclvmsdxrfk = dclvmsdxrfk;
    }
    public ApplicationCodeListGroup getApplicationCodeListGroup() {
        if (applicationCodeListGroup == null) {
            applicationCodeListGroup = new ApplicationCodeListGroup();
        }

        return applicationCodeListGroup;
    }

    public void setApplicationCodeListGroup(ApplicationCodeListGroup applicationCodeListGroup) {
        this.applicationCodeListGroup = applicationCodeListGroup;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += acceptInput.hashCode();
        str += work.hashCode();
        str += dclvbsscrdt.hashCode();
        str += dateFields.hashCode();
        str += dclscpsectb.hashCode();
        str += sdms01Parm.hashCode();
        str += bdms01CallParameters.hashCode();
        str += dcltbdemsec.hashCode();
        str += dclvmstranb.hashCode();
        str += dclvcrrexrt.hashCode();
        str += hostVariables.hashCode();
        str += db2Indicators.hashCode();
        str += parmlstGroup.hashCode();
        str += parm.hashCode();
        str += sqlca.hashCode();
        str += c1Dtl.hashCode();
        str += dclvmsdxrfk.hashCode();
        str += applicationCodeListGroup.hashCode();
       return str.hashCode();
    }

    public Db2funciCtx clone() {
        Db2funciCtx cloneObj = new Db2funciCtx();
        cloneObj.acceptInput = new AcceptInput();
        cloneObj.acceptInput.set(acceptInput.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dclvbsscrdt = new Dclvbsscrdt();
        cloneObj.dclvbsscrdt.set(dclvbsscrdt.getClonedField());
        cloneObj.dateFields = new DateFields();
        cloneObj.dateFields.set(dateFields.getClonedField());
        cloneObj.dclscpsectb = new Dclscpsectb();
        cloneObj.dclscpsectb.set(dclscpsectb.getClonedField());
        cloneObj.sdms01Parm = new Sdms01Parm();
        cloneObj.sdms01Parm.set(sdms01Parm.getClonedField());
        cloneObj.bdms01CallParameters = new Bdms01CallParameters();
        cloneObj.bdms01CallParameters.set(bdms01CallParameters.getClonedField());
        cloneObj.dcltbdemsec = new Dcltbdemsec();
        cloneObj.dcltbdemsec.set(dcltbdemsec.getClonedField());
        cloneObj.dclvmstranb = new Dclvmstranb();
        cloneObj.dclvmstranb.set(dclvmstranb.getClonedField());
        cloneObj.dclvcrrexrt = new Dclvcrrexrt();
        cloneObj.dclvcrrexrt.set(dclvcrrexrt.getClonedField());
        cloneObj.hostVariables = new HostVariables();
        cloneObj.hostVariables.set(hostVariables.getClonedField());
        cloneObj.db2Indicators = new Db2Indicators();
        cloneObj.db2Indicators.set(db2Indicators.getClonedField());
        cloneObj.parmlstGroup = new ParmlstGroup();
        cloneObj.parmlstGroup.set(parmlstGroup.getClonedField());
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.c1Dtl = new C1Dtl();
        cloneObj.c1Dtl.set(c1Dtl.getClonedField());
        cloneObj.dclvmsdxrfk = new Dclvmsdxrfk();
        cloneObj.dclvmsdxrfk.set(dclvmsdxrfk.getClonedField());
        cloneObj.applicationCodeListGroup = new ApplicationCodeListGroup();
        cloneObj.applicationCodeListGroup.set(applicationCodeListGroup.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Parm parm = Db2funciCtx.this.getParm();


        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += parm.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class MainInCtx implements Cloneable {
     AcceptInput acceptInput = Db2funciCtx.this.getAcceptInput();
     Work work = Db2funciCtx.this.getWork();
     Parm parm = Db2funciCtx.this.getParm();
     Sqlca sqlca = Db2funciCtx.this.getSqlca();

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
	 *	Returns the value of command
	 *	@return command
	 */
   public char[] getCommand() throws CFException  {              
   		return parm.getCommand();
   }

  
	/**
	*  set variable command
	*  @param value
	**/
   public void setCommand(char[] value) throws CFException {
      parm.setCommand(value);
   } 

     /**
	 * 	Update Command 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCommand(char[] source, int sourceIndex) throws CFException {
      parm.setCommand(source, sourceIndex);
   	
   }
   
   public void setCommand(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      parm.setCommand(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Command 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCommand(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parm.setCommand(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Command with another Field
	 *	@param value
	 */
   public void setCommand(Field source) {
      parm.setCommand(source);
   }  
   
     /**
	 * 	Update Command 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCommand(Field source, int sourceIndex,int sourceLen) {
      parm.setCommand(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Command 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCommand(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parm.setCommand(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of useSysin
	 *	@return useSysin
	 */
   public char[] getUseSysin() throws CFException  {              
   		return parm.getUseSysin();
   }

  
	/**
	*  set variable useSysin
	*  @param value
	**/
   public void setUseSysin(char[] value) throws CFException {
      parm.setUseSysin(value);
   } 

     /**
	 * 	Update UseSysin 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUseSysin(char[] source, int sourceIndex) throws CFException {
      parm.setUseSysin(source, sourceIndex);
   	
   }
   
   public void setUseSysin(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      parm.setUseSysin(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update UseSysin 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUseSysin(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parm.setUseSysin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update UseSysin with another Field
	 *	@param value
	 */
   public void setUseSysin(Field source) {
      parm.setUseSysin(source);
   }  
   
     /**
	 * 	Update UseSysin 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUseSysin(Field source, int sourceIndex,int sourceLen) {
      parm.setUseSysin(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update UseSysin 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUseSysin(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parm.setUseSysin(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of parmLen01
	 *	@return parmLen01
	 */
	public short getParmLen01() throws CFException {        
   		return parm.getParmLen01();
	}
	
	/**
	 * 	Update ParmLen01 with the passed value
	 *	@param number
	 */
	public void setParmLen01(short number)  throws CFException{
		parm.setParmLen01(number);
	}

	public void setParmLen01(int number)  throws CFException{
		parm.setParmLen01((short)number);
	}

	public void setParmLen01(long number)  throws CFException{
		parm.setParmLen01((short)number);
	}




        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
        }

        public MainOutCtx getMainOutCtx() {
            return new MainOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += acceptInput.hashCode();
        str += work.hashCode();
        str += parm.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public MainInCtx clone() {
        MainInCtx cloneObj = new MainInCtx();
        cloneObj.acceptInput = new AcceptInput();
        cloneObj.acceptInput.set(acceptInput.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public MainInCtx getMainInCtx() {
            return new MainInCtx();
    }
     public class MainOutCtx implements Cloneable {
     AcceptInput acceptInput = Db2funciCtx.this.getAcceptInput();
     Work work = Db2funciCtx.this.getWork();
     Parm parm = Db2funciCtx.this.getParm();
     Sqlca sqlca = Db2funciCtx.this.getSqlca();

	/**
	 *	Returns the value of acceptInput
	 *	@return acceptInput
	 */   
	 public AcceptInput getAcceptInput() {
   	return acceptInput;
   }


	/**
	 *	Test condition "*END*" for isCTerminate()
	 *	@return  Returns true if isCTerminate() is "*END*"
	 */
   public boolean isCTerminate() throws CFException {
      return acceptInput.isCTerminate();
   }

	/**
	*  set values "*END*"
	*/
   	public void setCTerminateTrue()  throws CFException{  			
    	acceptInput.setCTerminateTrue();
   	}
	/**
	 *	Test condition "Y" for isUseSysin1()
	 *	@return  Returns true if isUseSysin1() is "Y"
	 */
   public boolean isUseSysin1() throws CFException {
      return work.isUseSysin1();
   }

	/**
	*  set values "Y"
	*/
   	public void setUseSysin1True()  throws CFException{  			
    	work.setUseSysin1True();
   	}
	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of command
	 *	@return command
	 */
   public char[] getCommand() throws CFException  {              
   		return parm.getCommand();
   }

  
	/**
	*  set variable command
	*  @param value
	**/
   public void setCommand(char[] value) throws CFException {
      parm.setCommand(value);
   } 

     /**
	 * 	Update Command 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCommand(char[] source, int sourceIndex) throws CFException {
      parm.setCommand(source, sourceIndex);
   	
   }
   
   public void setCommand(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      parm.setCommand(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Command 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCommand(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parm.setCommand(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Command with another Field
	 *	@param value
	 */
   public void setCommand(Field source) {
      parm.setCommand(source);
   }  
   
     /**
	 * 	Update Command 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCommand(Field source, int sourceIndex,int sourceLen) {
      parm.setCommand(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Command 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCommand(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parm.setCommand(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of scalarFunction
	 *	@return scalarFunction
	 */
   public char[] getScalarFunction() throws CFException  {              
   		return acceptInput.getScalarFunction();
   }

  
	/**
	*  set variable scalarFunction
	*  @param value
	**/
   public void setScalarFunction(char[] value) throws CFException {
      acceptInput.setScalarFunction(value);
   } 

     /**
	 * 	Update ScalarFunction 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setScalarFunction(char[] source, int sourceIndex) throws CFException {
      acceptInput.setScalarFunction(source, sourceIndex);
   	
   }
   
   public void setScalarFunction(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      acceptInput.setScalarFunction(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ScalarFunction 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setScalarFunction(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInput.setScalarFunction(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ScalarFunction with another Field
	 *	@param value
	 */
   public void setScalarFunction(Field source) {
      acceptInput.setScalarFunction(source);
   }  
   
     /**
	 * 	Update ScalarFunction 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setScalarFunction(Field source, int sourceIndex,int sourceLen) {
      acceptInput.setScalarFunction(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ScalarFunction 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setScalarFunction(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInput.setScalarFunction(source, sourceIndex, sourceLen, targetIndex, targetLen);
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



        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += acceptInput.hashCode();
        str += work.hashCode();
        str += parm.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public MainOutCtx clone() {
        MainOutCtx cloneObj = new MainOutCtx();
        cloneObj.acceptInput = new AcceptInput();
        cloneObj.acceptInput.set(acceptInput.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.parm = new Parm();
        cloneObj.parm.set(parm.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public MainOutCtx getMainOutCtx() {
            return new MainOutCtx();
    }
     public class ProcessCommandInCtx implements Cloneable {
     AcceptInput acceptInput = Db2funciCtx.this.getAcceptInput();

	/**
	 *	Test condition "DATE" for isCDate()
	 *	@return  Returns true if isCDate() is "DATE"
	 */
   public boolean isCDate() throws CFException {
      return acceptInput.isCDate();
   }

	/**
	*  set values "DATE"
	*/
   	public void setCDateTrue()  throws CFException{  			
    	acceptInput.setCDateTrue();
   	}
	/**
	 *	Test condition "SP-GETPRML" for isCSpGetprml()
	 *	@return  Returns true if isCSpGetprml() is "SP-GETPRML"
	 */
   public boolean isCSpGetprml() throws CFException {
      return acceptInput.isCSpGetprml();
   }

	/**
	*  set values "SP-GETPRML"
	*/
   	public void setCSpGetprmlTrue()  throws CFException{  			
    	acceptInput.setCSpGetprmlTrue();
   	}
	/**
	 *	Test condition "DATE-SUBSTRING-CHAR" for isCDateSubstringChar()
	 *	@return  Returns true if isCDateSubstringChar() is "DATE-SUBSTRING-CHAR"
	 */
   public boolean isCDateSubstringChar() throws CFException {
      return acceptInput.isCDateSubstringChar();
   }

	/**
	*  set values "DATE-SUBSTRING-CHAR"
	*/
   	public void setCDateSubstringCharTrue()  throws CFException{  			
    	acceptInput.setCDateSubstringCharTrue();
   	}
	/**
	 *	Test condition "SP-GETDATA" for isCSpGetdata()
	 *	@return  Returns true if isCSpGetdata() is "SP-GETDATA"
	 */
   public boolean isCSpGetdata() throws CFException {
      return acceptInput.isCSpGetdata();
   }

	/**
	*  set values "SP-GETDATA"
	*/
   	public void setCSpGetdataTrue()  throws CFException{  			
    	acceptInput.setCSpGetdataTrue();
   	}
	/**
	 *	Test condition "XREF-CURSOR" for isCXrefCursor()
	 *	@return  Returns true if isCXrefCursor() is "XREF-CURSOR"
	 */
   public boolean isCXrefCursor() throws CFException {
      return acceptInput.isCXrefCursor();
   }

	/**
	*  set values "XREF-CURSOR"
	*/
   	public void setCXrefCursorTrue()  throws CFException{  			
    	acceptInput.setCXrefCursorTrue();
   	}
	/**
	 *	Returns the value of scalarFunction
	 *	@return scalarFunction
	 */
   public char[] getScalarFunction() throws CFException  {              
   		return acceptInput.getScalarFunction();
   }

  
	/**
	*  set variable scalarFunction
	*  @param value
	**/
   public void setScalarFunction(char[] value) throws CFException {
      acceptInput.setScalarFunction(value);
   } 

     /**
	 * 	Update ScalarFunction 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setScalarFunction(char[] source, int sourceIndex) throws CFException {
      acceptInput.setScalarFunction(source, sourceIndex);
   	
   }
   
   public void setScalarFunction(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      acceptInput.setScalarFunction(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ScalarFunction 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setScalarFunction(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInput.setScalarFunction(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ScalarFunction with another Field
	 *	@param value
	 */
   public void setScalarFunction(Field source) {
      acceptInput.setScalarFunction(source);
   }  
   
     /**
	 * 	Update ScalarFunction 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setScalarFunction(Field source, int sourceIndex,int sourceLen) {
      acceptInput.setScalarFunction(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ScalarFunction 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setScalarFunction(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptInput.setScalarFunction(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "ISIN-CURSOR" for isCIsinCursor()
	 *	@return  Returns true if isCIsinCursor() is "ISIN-CURSOR"
	 */
   public boolean isCIsinCursor() throws CFException {
      return acceptInput.isCIsinCursor();
   }

	/**
	*  set values "ISIN-CURSOR"
	*/
   	public void setCIsinCursorTrue()  throws CFException{  			
    	acceptInput.setCIsinCursorTrue();
   	}
	/**
	 *	Test condition "DECIMAL-TO-FLOAT" for isCDecimalToFloat()
	 *	@return  Returns true if isCDecimalToFloat() is "DECIMAL-TO-FLOAT"
	 */
   public boolean isCDecimalToFloat() throws CFException {
      return acceptInput.isCDecimalToFloat();
   }

	/**
	*  set values "DECIMAL-TO-FLOAT"
	*/
   	public void setCDecimalToFloatTrue()  throws CFException{  			
    	acceptInput.setCDecimalToFloatTrue();
   	}
	/**
	 *	Test condition "CURSOR1" for isCCursor1()
	 *	@return  Returns true if isCCursor1() is "CURSOR1"
	 */
   public boolean isCCursor1() throws CFException {
      return acceptInput.isCCursor1();
   }

	/**
	*  set values "CURSOR1"
	*/
   	public void setCCursor1True()  throws CFException{  			
    	acceptInput.setCCursor1True();
   	}
	/**
	 *	Test condition "SELECT-1" for isCSelect1()
	 *	@return  Returns true if isCSelect1() is "SELECT-1"
	 */
   public boolean isCSelect1() throws CFException {
      return acceptInput.isCSelect1();
   }

	/**
	*  set values "SELECT-1"
	*/
   	public void setCSelect1True()  throws CFException{  			
    	acceptInput.setCSelect1True();
   	}
	/**
	 *	Test condition "SECURITY-LOOKUP" for isCSecurityLookup()
	 *	@return  Returns true if isCSecurityLookup() is "SECURITY-LOOKUP"
	 */
   public boolean isCSecurityLookup() throws CFException {
      return acceptInput.isCSecurityLookup();
   }

	/**
	*  set values "SECURITY-LOOKUP"
	*/
   	public void setCSecurityLookupTrue()  throws CFException{  			
    	acceptInput.setCSecurityLookupTrue();
   	}
	/**
	 *	Test condition "SELECT-COUNT" for isCSelectCount()
	 *	@return  Returns true if isCSelectCount() is "SELECT-COUNT"
	 */
   public boolean isCSelectCount() throws CFException {
      return acceptInput.isCSelectCount();
   }

	/**
	*  set values "SELECT-COUNT"
	*/
   	public void setCSelectCountTrue()  throws CFException{  			
    	acceptInput.setCSelectCountTrue();
   	}
	/**
	 *	Test condition "CURRENCY" for isCCurrency()
	 *	@return  Returns true if isCCurrency() is "CURRENCY"
	 */
   public boolean isCCurrency() throws CFException {
      return acceptInput.isCCurrency();
   }

	/**
	*  set values "CURRENCY"
	*/
   	public void setCCurrencyTrue()  throws CFException{  			
    	acceptInput.setCCurrencyTrue();
   	}

        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += acceptInput.hashCode();
       return str.hashCode();
    }

    public ProcessCommandInCtx clone() {
        ProcessCommandInCtx cloneObj = new ProcessCommandInCtx();
        cloneObj.acceptInput = new AcceptInput();
        cloneObj.acceptInput.set(acceptInput.getClonedField());
        return cloneObj;
    }

    }

    public ProcessCommandInCtx getProcessCommandInCtx() {
            return new ProcessCommandInCtx();
    }
     public class Date1000InCtx implements Cloneable {
     DateFields dateFields = Db2funciCtx.this.getDateFields();
     Sqlca sqlca = Db2funciCtx.this.getSqlca();

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
	 *	Returns the value of dateFields
	 *	@return dateFields
	 */   
	 public DateFields getDateFields() {
   	return dateFields;
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

	/**
	 *	Returns the value of mthsAgoDate18
	 *	@return mthsAgoDate18
	 */
   public char[] getMthsAgoDate18() throws CFException  {              
   		return dateFields.getMthsAgoDate18();
   }

  
	/**
	*  set variable mthsAgoDate18
	*  @param value
	**/
   public void setMthsAgoDate18(char[] value) throws CFException {
      dateFields.setMthsAgoDate18(value);
   } 

     /**
	 * 	Update MthsAgoDate18 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMthsAgoDate18(char[] source, int sourceIndex) throws CFException {
      dateFields.setMthsAgoDate18(source, sourceIndex);
   	
   }
   
   public void setMthsAgoDate18(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dateFields.setMthsAgoDate18(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MthsAgoDate18 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMthsAgoDate18(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dateFields.setMthsAgoDate18(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MthsAgoDate18 with another Field
	 *	@param value
	 */
   public void setMthsAgoDate18(Field source) {
      dateFields.setMthsAgoDate18(source);
   }  
   
     /**
	 * 	Update MthsAgoDate18 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMthsAgoDate18(Field source, int sourceIndex,int sourceLen) {
      dateFields.setMthsAgoDate18(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MthsAgoDate18 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMthsAgoDate18(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dateFields.setMthsAgoDate18(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
        }

        public Date1000OutCtx getDate1000OutCtx() {
            return new Date1000OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dateFields.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public Date1000InCtx clone() {
        Date1000InCtx cloneObj = new Date1000InCtx();
        cloneObj.dateFields = new DateFields();
        cloneObj.dateFields.set(dateFields.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public Date1000InCtx getDate1000InCtx() {
            return new Date1000InCtx();
    }
     public class Date1000OutCtx implements Cloneable {
     DateFields dateFields = Db2funciCtx.this.getDateFields();
     Sqlca sqlca = Db2funciCtx.this.getSqlca();

	/**
	 *	Returns the value of dateFields
	 *	@return dateFields
	 */   
	 public DateFields getDateFields() {
   	return dateFields;
   }


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of currentDate
	 *	@return currentDate
	 */
   public char[] getCurrentDate() throws CFException  {              
   		return dateFields.getCurrentDate();
   }

  
	/**
	*  set variable currentDate
	*  @param value
	**/
   public void setCurrentDate(char[] value) throws CFException {
      dateFields.setCurrentDate(value);
   } 

     /**
	 * 	Update CurrentDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrentDate(char[] source, int sourceIndex) throws CFException {
      dateFields.setCurrentDate(source, sourceIndex);
   	
   }
   
   public void setCurrentDate(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dateFields.setCurrentDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrentDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrentDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dateFields.setCurrentDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrentDate with another Field
	 *	@param value
	 */
   public void setCurrentDate(Field source) {
      dateFields.setCurrentDate(source);
   }  
   
     /**
	 * 	Update CurrentDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrentDate(Field source, int sourceIndex,int sourceLen) {
      dateFields.setCurrentDate(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrentDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrentDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dateFields.setCurrentDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
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



        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dateFields.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public Date1000OutCtx clone() {
        Date1000OutCtx cloneObj = new Date1000OutCtx();
        cloneObj.dateFields = new DateFields();
        cloneObj.dateFields.set(dateFields.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public Date1000OutCtx getDate1000OutCtx() {
            return new Date1000OutCtx();
    }
     public class SpGetprmlInCtx implements Cloneable {
     Work work = Db2funciCtx.this.getWork();
     ParmlstGroup parmlstGroup = Db2funciCtx.this.getParmlstGroup();
     Sqlca sqlca = Db2funciCtx.this.getSqlca();

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
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
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
	 *	Returns the value of parmlst
	 *	@return parmlst
	 */   
	 public Parmlst getParmlst() {
   	return parmlstGroup.getParmlst();
   }

   /**
	* 	Update Parmlst with the passed value
	*	@param value
	*/
   public void setParmlst(char[] value) throws CFException {
      parmlstGroup.setParmlst(value);
   }   

     /**
	 * 	Update Parmlst 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setParmlst(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	parmlstGroup.setParmlst(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Parmlst 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParmlst(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	parmlstGroup.setParmlst(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Parmlst with another Field
	 *	@param value
	 */
   public void setParmlst(Field source) {
   	parmlstGroup.setParmlst(source);
   }  
   
     /**
	 * 	Update Parmlst 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setParmlst(Field source, int sourceIndex,int sourceLen) {
   	parmlstGroup.setParmlst(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Parmlst 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParmlst(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	parmlstGroup.setParmlst(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of numCursors
	 *	@return numCursors
	 */
	public int getNumCursors() throws CFException {        
   		return work.getNumCursors();
	}
	
	/**
	 * 	Update NumCursors with the passed value
	 *	@param number
	 */
	public void setNumCursors(int number)  throws CFException{
		work.setNumCursors(number);
	}


	public void setNumCursors(long number)  throws CFException{
		work.setNumCursors((int)number);
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
	 *	Returns the value of parmlstGroup
	 *	@return parmlstGroup
	 */   
	 public ParmlstGroup getParmlstGroup() {
   	return parmlstGroup;
   }


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of parmlen
	 *	@return parmlen
	 */
	public short getParmlen() throws CFException {        
   		return parmlstGroup.getParmlst().getParmlen();
	}
	
	/**
	 * 	Update Parmlen with the passed value
	 *	@param number
	 */
	public void setParmlen(short number)  throws CFException{
		parmlstGroup.getParmlst().setParmlen(number);
	}

	public void setParmlen(int number)  throws CFException{
		parmlstGroup.getParmlst().setParmlen((short)number);
	}

	public void setParmlen(long number)  throws CFException{
		parmlstGroup.getParmlst().setParmlen((short)number);
	}



	/**
	 *	Returns the value of parmtxt
	 *	@return parmtxt
	 */
   public char[] getParmtxt() throws CFException  {              
   		return parmlstGroup.getParmlst().getParmtxt();
   }

  
	/**
	*  set variable parmtxt
	*  @param value
	**/
   public void setParmtxt(char[] value) throws CFException {
      parmlstGroup.getParmlst().setParmtxt(value);
   } 

     /**
	 * 	Update Parmtxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParmtxt(char[] source, int sourceIndex) throws CFException {
      parmlstGroup.getParmlst().setParmtxt(source, sourceIndex);
   	
   }
   
   public void setParmtxt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      parmlstGroup.getParmlst().setParmtxt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Parmtxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParmtxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parmlstGroup.getParmlst().setParmtxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Parmtxt with another Field
	 *	@param value
	 */
   public void setParmtxt(Field source) {
      parmlstGroup.getParmlst().setParmtxt(source);
   }  
   
     /**
	 * 	Update Parmtxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParmtxt(Field source, int sourceIndex,int sourceLen) {
      parmlstGroup.getParmlst().setParmtxt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Parmtxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParmtxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parmlstGroup.getParmlst().setParmtxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of loc1
	 *	@return loc1
	 */
   public char[] getLoc1() throws CFException  {              
   		return work.getLoc1();
   }

  
	/**
	*  set variable loc1
	*  @param value
	**/
   public void setLoc1(char[] value) throws CFException {
      work.setLoc1(value);
   } 

	/**
	 *	Returns the value of outCode
	 *	@return outCode
	 */
	public int getOutCode() throws CFException {        
   		return work.getOutCode();
	}
	
	/**
	 * 	Update OutCode with the passed value
	 *	@param number
	 */
	public void setOutCode(int number)  throws CFException{
		work.setOutCode(number);
	}


	public void setOutCode(long number)  throws CFException{
		work.setOutCode((int)number);
	}



        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
        }

        public SpGetprmlOutCtx getSpGetprmlOutCtx() {
            return new SpGetprmlOutCtx();
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
        str += parmlstGroup.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public SpGetprmlInCtx clone() {
        SpGetprmlInCtx cloneObj = new SpGetprmlInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.parmlstGroup = new ParmlstGroup();
        cloneObj.parmlstGroup.set(parmlstGroup.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public SpGetprmlInCtx getSpGetprmlInCtx() {
            return new SpGetprmlInCtx();
    }
     public class SpGetprmlOutCtx implements Cloneable {
     Work work = Db2funciCtx.this.getWork();
     ParmlstGroup parmlstGroup = Db2funciCtx.this.getParmlstGroup();
     Sqlca sqlca = Db2funciCtx.this.getSqlca();

	/**
	 *	Returns the value of numCursors
	 *	@return numCursors
	 */
	public int getNumCursors() throws CFException {        
   		return work.getNumCursors();
	}
	
	/**
	 * 	Update NumCursors with the passed value
	 *	@param number
	 */
	public void setNumCursors(int number)  throws CFException{
		work.setNumCursors(number);
	}


	public void setNumCursors(long number)  throws CFException{
		work.setNumCursors((int)number);
	}


	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of procnm
	 *	@return procnm
	 */
   public char[] getProcnm() throws CFException  {              
   		return work.getProcnm();
   }

  
	/**
	*  set variable procnm
	*  @param value
	**/
   public void setProcnm(char[] value) throws CFException {
      work.setProcnm(value);
   } 

	/**
	 *	Returns the value of sqlcodeDisp
	 *	@return sqlcodeDisp
	 */
   public char[] getSqlcodeDisp() throws CFException  {              
   		return work.getSqlcodeDisp();
   }

  
	/**
	*  set variable sqlcodeDisp
	*  @param value
	**/
   public void setSqlcodeDisp(char[] value) throws CFException {
      work.setSqlcodeDisp(value);
   } 

     /**
	 * 	Update SqlcodeDisp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcodeDisp(char[] source, int sourceIndex) throws CFException {
      work.setSqlcodeDisp(source, sourceIndex);
   	
   }
   
   public void setSqlcodeDisp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SqlcodeDisp with another Field
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source) {
      work.setSqlcodeDisp(source);
   }  
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source, int sourceIndex,int sourceLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of schema
	 *	@return schema
	 */
   public char[] getSchema() throws CFException  {              
   		return work.getSchema();
   }

  
	/**
	*  set variable schema
	*  @param value
	**/
   public void setSchema(char[] value) throws CFException {
      work.setSchema(value);
   } 

	/**
	 *	Returns the value of parmind
	 *	@return parmind
	 */
	public short getParmind() throws CFException {        
   		return work.getParmind();
	}
	
	/**
	 * 	Update Parmind with the passed value
	 *	@param number
	 */
	public void setParmind(short number)  throws CFException{
		work.setParmind(number);
	}

	public void setParmind(int number)  throws CFException{
		work.setParmind((short)number);
	}

	public void setParmind(long number)  throws CFException{
		work.setParmind((short)number);
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



        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
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
        str += parmlstGroup.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public SpGetprmlOutCtx clone() {
        SpGetprmlOutCtx cloneObj = new SpGetprmlOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.parmlstGroup = new ParmlstGroup();
        cloneObj.parmlstGroup.set(parmlstGroup.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public SpGetprmlOutCtx getSpGetprmlOutCtx() {
            return new SpGetprmlOutCtx();
    }
     public class GetIsinDtlsInCtx implements Cloneable {
     Work work = Db2funciCtx.this.getWork();
     Sqlca sqlca = Db2funciCtx.this.getSqlca();
     C1Dtl c1Dtl = Db2funciCtx.this.getC1Dtl();
     Dcltbdemsec dcltbdemsec = Db2funciCtx.this.getDcltbdemsec();

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
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of currency1
	 *	@return currency1
	 */
   public char[] getCurrency1() throws CFException  {              
   		return dcltbdemsec.getCurrency1();
   }

  
	/**
	*  set variable currency1
	*  @param value
	**/
   public void setCurrency1(char[] value) throws CFException {
      dcltbdemsec.setCurrency1(value);
   } 

     /**
	 * 	Update Currency1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrency1(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setCurrency1(source, sourceIndex);
   	
   }
   
   public void setCurrency1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setCurrency1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Currency1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrency1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setCurrency1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Currency1 with another Field
	 *	@param value
	 */
   public void setCurrency1(Field source) {
      dcltbdemsec.setCurrency1(source);
   }  
   
     /**
	 * 	Update Currency1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrency1(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setCurrency1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Currency1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrency1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setCurrency1(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of industry
	 *	@return industry
	 */
   public char[] getIndustry() throws CFException  {              
   		return dcltbdemsec.getIndustry();
   }

  
	/**
	*  set variable industry
	*  @param value
	**/
   public void setIndustry(char[] value) throws CFException {
      dcltbdemsec.setIndustry(value);
   } 

     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setIndustry(source, sourceIndex);
   	
   }
   
   public void setIndustry(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setIndustry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setIndustry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Industry with another Field
	 *	@param value
	 */
   public void setIndustry(Field source) {
      dcltbdemsec.setIndustry(source);
   }  
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setIndustry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setIndustry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of intlkey01
	 *	@return intlkey01
	 */
   public char[] getIntlkey01() throws CFException  {              
   		return dcltbdemsec.getIntlkey01();
   }

  
	/**
	*  set variable intlkey01
	*  @param value
	**/
   public void setIntlkey01(char[] value) throws CFException {
      dcltbdemsec.setIntlkey01(value);
   } 

     /**
	 * 	Update Intlkey01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIntlkey01(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setIntlkey01(source, sourceIndex);
   	
   }
   
   public void setIntlkey01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setIntlkey01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Intlkey01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setIntlkey01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Intlkey01 with another Field
	 *	@param value
	 */
   public void setIntlkey01(Field source) {
      dcltbdemsec.setIntlkey01(source);
   }  
   
     /**
	 * 	Update Intlkey01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIntlkey01(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setIntlkey01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Intlkey01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setIntlkey01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of dcltbdemsec
	 *	@return dcltbdemsec
	 */   
	 public Dcltbdemsec getDcltbdemsec() {
   	return dcltbdemsec;
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
	 *	Returns the value of country01
	 *	@return country01
	 */
   public char[] getCountry01() throws CFException  {              
   		return dcltbdemsec.getCountry01();
   }

  
	/**
	*  set variable country01
	*  @param value
	**/
   public void setCountry01(char[] value) throws CFException {
      dcltbdemsec.setCountry01(value);
   } 

     /**
	 * 	Update Country01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry01(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setCountry01(source, sourceIndex);
   	
   }
   
   public void setCountry01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setCountry01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Country01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setCountry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Country01 with another Field
	 *	@param value
	 */
   public void setCountry01(Field source) {
      dcltbdemsec.setCountry01(source);
   }  
   
     /**
	 * 	Update Country01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry01(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setCountry01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Country01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setCountry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of isin01
	 *	@return isin01
	 */
   public char[] getIsin01() throws CFException  {              
   		return dcltbdemsec.getIsin01();
   }

  
	/**
	*  set variable isin01
	*  @param value
	**/
   public void setIsin01(char[] value) throws CFException {
      dcltbdemsec.setIsin01(value);
   } 

     /**
	 * 	Update Isin01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsin01(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setIsin01(source, sourceIndex);
   	
   }
   
   public void setIsin01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setIsin01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Isin01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsin01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setIsin01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Isin01 with another Field
	 *	@param value
	 */
   public void setIsin01(Field source) {
      dcltbdemsec.setIsin01(source);
   }  
   
     /**
	 * 	Update Isin01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsin01(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setIsin01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Isin01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsin01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setIsin01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of loc1
	 *	@return loc1
	 */
   public char[] getLoc1() throws CFException  {              
   		return work.getLoc1();
   }

  
	/**
	*  set variable loc1
	*  @param value
	**/
   public void setLoc1(char[] value) throws CFException {
      work.setLoc1(value);
   } 

	/**
	 *	Returns the value of c1Dtl
	 *	@return c1Dtl
	 */   
	 public C1Dtl getC1Dtl() {
   	return c1Dtl;
   }


	/**
	 *	Returns the value of company01
	 *	@return company01
	 */
   public char[] getCompany01() throws CFException  {              
   		return dcltbdemsec.getCompany01();
   }

  
	/**
	*  set variable company01
	*  @param value
	**/
   public void setCompany01(char[] value) throws CFException {
      dcltbdemsec.setCompany01(value);
   } 

     /**
	 * 	Update Company01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompany01(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setCompany01(source, sourceIndex);
   	
   }
   
   public void setCompany01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setCompany01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Company01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompany01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setCompany01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Company01 with another Field
	 *	@param value
	 */
   public void setCompany01(Field source) {
      dcltbdemsec.setCompany01(source);
   }  
   
     /**
	 * 	Update Company01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompany01(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setCompany01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Company01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompany01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setCompany01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ric01
	 *	@return ric01
	 */
   public char[] getRic01() throws CFException  {              
   		return dcltbdemsec.getRic01();
   }

  
	/**
	*  set variable ric01
	*  @param value
	**/
   public void setRic01(char[] value) throws CFException {
      dcltbdemsec.setRic01(value);
   } 

     /**
	 * 	Update Ric01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRic01(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setRic01(source, sourceIndex);
   	
   }
   
   public void setRic01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setRic01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ric01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRic01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setRic01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ric01 with another Field
	 *	@param value
	 */
   public void setRic01(Field source) {
      dcltbdemsec.setRic01(source);
   }  
   
     /**
	 * 	Update Ric01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRic01(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setRic01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ric01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRic01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setRic01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sedol01
	 *	@return sedol01
	 */
   public char[] getSedol01() throws CFException  {              
   		return dcltbdemsec.getSedol01();
   }

  
	/**
	*  set variable sedol01
	*  @param value
	**/
   public void setSedol01(char[] value) throws CFException {
      dcltbdemsec.setSedol01(value);
   } 

     /**
	 * 	Update Sedol01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSedol01(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setSedol01(source, sourceIndex);
   	
   }
   
   public void setSedol01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setSedol01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sedol01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSedol01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setSedol01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sedol01 with another Field
	 *	@param value
	 */
   public void setSedol01(Field source) {
      dcltbdemsec.setSedol01(source);
   }  
   
     /**
	 * 	Update Sedol01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSedol01(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setSedol01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sedol01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSedol01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setSedol01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ffmcapmilusd
	 *	@return ffmcapmilusd
	 */
	public int getFfmcapmilusd() throws CFException {        
   		return dcltbdemsec.getFfmcapmilusd();
	}
	
	/**
	 * 	Update Ffmcapmilusd with the passed value
	 *	@param number
	 */
	public void setFfmcapmilusd(int number)  throws CFException{
		dcltbdemsec.setFfmcapmilusd(number);
	}


	public void setFfmcapmilusd(long number)  throws CFException{
		dcltbdemsec.setFfmcapmilusd((int)number);
	}


	/**
	 *	Returns the value of sector
	 *	@return sector
	 */
   public char[] getSector() throws CFException  {              
   		return dcltbdemsec.getSector();
   }

  
	/**
	*  set variable sector
	*  @param value
	**/
   public void setSector(char[] value) throws CFException {
      dcltbdemsec.setSector(value);
   } 

     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setSector(source, sourceIndex);
   	
   }
   
   public void setSector(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setSector(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setSector(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sector with another Field
	 *	@param value
	 */
   public void setSector(Field source) {
      dcltbdemsec.setSector(source);
   }  
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setSector(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setSector(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sectorweight
	 *	@return sectorweight
	 */
   public char[] getSectorweight() throws CFException  {              
   		return dcltbdemsec.getSectorweight();
   }

  
	/**
	*  set variable sectorweight
	*  @param value
	**/
   public void setSectorweight(char[] value) throws CFException {
      dcltbdemsec.setSectorweight(value);
   } 

     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setSectorweight(source, sourceIndex);
   	
   }
   
   public void setSectorweight(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setSectorweight(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setSectorweight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sectorweight with another Field
	 *	@param value
	 */
   public void setSectorweight(Field source) {
      dcltbdemsec.setSectorweight(source);
   }  
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setSectorweight(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setSectorweight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
        }

        public GetIsinDtlsOutCtx getGetIsinDtlsOutCtx() {
            return new GetIsinDtlsOutCtx();
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
        str += sqlca.hashCode();
        str += c1Dtl.hashCode();
        str += dcltbdemsec.hashCode();
       return str.hashCode();
    }

    public GetIsinDtlsInCtx clone() {
        GetIsinDtlsInCtx cloneObj = new GetIsinDtlsInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.c1Dtl = new C1Dtl();
        cloneObj.c1Dtl.set(c1Dtl.getClonedField());
        cloneObj.dcltbdemsec = new Dcltbdemsec();
        cloneObj.dcltbdemsec.set(dcltbdemsec.getClonedField());
        return cloneObj;
    }

    }

    public GetIsinDtlsInCtx getGetIsinDtlsInCtx() {
            return new GetIsinDtlsInCtx();
    }
     public class GetIsinDtlsOutCtx implements Cloneable {
     Work work = Db2funciCtx.this.getWork();
     Sqlca sqlca = Db2funciCtx.this.getSqlca();
     C1Dtl c1Dtl = Db2funciCtx.this.getC1Dtl();
     Dcltbdemsec dcltbdemsec = Db2funciCtx.this.getDcltbdemsec();

	/**
	 *	Returns the value of currency
	 *	@return currency
	 */
   public char[] getCurrency() throws CFException  {              
   		return c1Dtl.getCurrency();
   }

  
	/**
	*  set variable currency
	*  @param value
	**/
   public void setCurrency(char[] value) throws CFException {
      c1Dtl.setCurrency(value);
   } 

     /**
	 * 	Update Currency 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrency(char[] source, int sourceIndex) throws CFException {
      c1Dtl.setCurrency(source, sourceIndex);
   	
   }
   
   public void setCurrency(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      c1Dtl.setCurrency(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Currency 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrency(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      c1Dtl.setCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Currency with another Field
	 *	@param value
	 */
   public void setCurrency(Field source) {
      c1Dtl.setCurrency(source);
   }  
   
     /**
	 * 	Update Currency 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrency(Field source, int sourceIndex,int sourceLen) {
      c1Dtl.setCurrency(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Currency 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrency(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      c1Dtl.setCurrency(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currency1
	 *	@return currency1
	 */
   public char[] getCurrency1() throws CFException  {              
   		return dcltbdemsec.getCurrency1();
   }

  
	/**
	*  set variable currency1
	*  @param value
	**/
   public void setCurrency1(char[] value) throws CFException {
      dcltbdemsec.setCurrency1(value);
   } 

     /**
	 * 	Update Currency1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrency1(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setCurrency1(source, sourceIndex);
   	
   }
   
   public void setCurrency1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setCurrency1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Currency1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrency1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setCurrency1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Currency1 with another Field
	 *	@param value
	 */
   public void setCurrency1(Field source) {
      dcltbdemsec.setCurrency1(source);
   }  
   
     /**
	 * 	Update Currency1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrency1(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setCurrency1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Currency1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrency1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setCurrency1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of intlkey
	 *	@return intlkey
	 */
   public char[] getIntlkey() throws CFException  {              
   		return c1Dtl.getIntlkey();
   }

  
	/**
	*  set variable intlkey
	*  @param value
	**/
   public void setIntlkey(char[] value) throws CFException {
      c1Dtl.setIntlkey(value);
   } 

     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex) throws CFException {
      c1Dtl.setIntlkey(source, sourceIndex);
   	
   }
   
   public void setIntlkey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      c1Dtl.setIntlkey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      c1Dtl.setIntlkey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Intlkey with another Field
	 *	@param value
	 */
   public void setIntlkey(Field source) {
      c1Dtl.setIntlkey(source);
   }  
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen) {
      c1Dtl.setIntlkey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      c1Dtl.setIntlkey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sedol
	 *	@return sedol
	 */
   public char[] getSedol() throws CFException  {              
   		return c1Dtl.getSedol();
   }

  
	/**
	*  set variable sedol
	*  @param value
	**/
   public void setSedol(char[] value) throws CFException {
      c1Dtl.setSedol(value);
   } 

     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex) throws CFException {
      c1Dtl.setSedol(source, sourceIndex);
   	
   }
   
   public void setSedol(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      c1Dtl.setSedol(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      c1Dtl.setSedol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sedol with another Field
	 *	@param value
	 */
   public void setSedol(Field source) {
      c1Dtl.setSedol(source);
   }  
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen) {
      c1Dtl.setSedol(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      c1Dtl.setSedol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ric
	 *	@return ric
	 */
   public char[] getRic() throws CFException  {              
   		return c1Dtl.getRic();
   }

  
	/**
	*  set variable ric
	*  @param value
	**/
   public void setRic(char[] value) throws CFException {
      c1Dtl.setRic(value);
   } 

     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex) throws CFException {
      c1Dtl.setRic(source, sourceIndex);
   	
   }
   
   public void setRic(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      c1Dtl.setRic(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      c1Dtl.setRic(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ric with another Field
	 *	@param value
	 */
   public void setRic(Field source) {
      c1Dtl.setRic(source);
   }  
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen) {
      c1Dtl.setRic(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      c1Dtl.setRic(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of intlkey01
	 *	@return intlkey01
	 */
   public char[] getIntlkey01() throws CFException  {              
   		return dcltbdemsec.getIntlkey01();
   }

  
	/**
	*  set variable intlkey01
	*  @param value
	**/
   public void setIntlkey01(char[] value) throws CFException {
      dcltbdemsec.setIntlkey01(value);
   } 

     /**
	 * 	Update Intlkey01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIntlkey01(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setIntlkey01(source, sourceIndex);
   	
   }
   
   public void setIntlkey01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setIntlkey01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Intlkey01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setIntlkey01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Intlkey01 with another Field
	 *	@param value
	 */
   public void setIntlkey01(Field source) {
      dcltbdemsec.setIntlkey01(source);
   }  
   
     /**
	 * 	Update Intlkey01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIntlkey01(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setIntlkey01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Intlkey01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setIntlkey01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of dcltbdemsec
	 *	@return dcltbdemsec
	 */   
	 public Dcltbdemsec getDcltbdemsec() {
   	return dcltbdemsec;
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
	 *	Returns the value of country01
	 *	@return country01
	 */
   public char[] getCountry01() throws CFException  {              
   		return dcltbdemsec.getCountry01();
   }

  
	/**
	*  set variable country01
	*  @param value
	**/
   public void setCountry01(char[] value) throws CFException {
      dcltbdemsec.setCountry01(value);
   } 

     /**
	 * 	Update Country01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry01(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setCountry01(source, sourceIndex);
   	
   }
   
   public void setCountry01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setCountry01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Country01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setCountry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Country01 with another Field
	 *	@param value
	 */
   public void setCountry01(Field source) {
      dcltbdemsec.setCountry01(source);
   }  
   
     /**
	 * 	Update Country01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry01(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setCountry01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Country01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setCountry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of isin01
	 *	@return isin01
	 */
   public char[] getIsin01() throws CFException  {              
   		return dcltbdemsec.getIsin01();
   }

  
	/**
	*  set variable isin01
	*  @param value
	**/
   public void setIsin01(char[] value) throws CFException {
      dcltbdemsec.setIsin01(value);
   } 

     /**
	 * 	Update Isin01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsin01(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setIsin01(source, sourceIndex);
   	
   }
   
   public void setIsin01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setIsin01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Isin01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsin01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setIsin01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Isin01 with another Field
	 *	@param value
	 */
   public void setIsin01(Field source) {
      dcltbdemsec.setIsin01(source);
   }  
   
     /**
	 * 	Update Isin01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsin01(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setIsin01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Isin01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsin01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setIsin01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of company
	 *	@return company
	 */
   public char[] getCompany() throws CFException  {              
   		return c1Dtl.getCompany();
   }

  
	/**
	*  set variable company
	*  @param value
	**/
   public void setCompany(char[] value) throws CFException {
      c1Dtl.setCompany(value);
   } 

     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex) throws CFException {
      c1Dtl.setCompany(source, sourceIndex);
   	
   }
   
   public void setCompany(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      c1Dtl.setCompany(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      c1Dtl.setCompany(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Company with another Field
	 *	@param value
	 */
   public void setCompany(Field source) {
      c1Dtl.setCompany(source);
   }  
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen) {
      c1Dtl.setCompany(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      c1Dtl.setCompany(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of isin
	 *	@return isin
	 */
   public char[] getIsin() throws CFException  {              
   		return c1Dtl.getIsin();
   }

  
	/**
	*  set variable isin
	*  @param value
	**/
   public void setIsin(char[] value) throws CFException {
      c1Dtl.setIsin(value);
   } 

     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex) throws CFException {
      c1Dtl.setIsin(source, sourceIndex);
   	
   }
   
   public void setIsin(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      c1Dtl.setIsin(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      c1Dtl.setIsin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Isin with another Field
	 *	@param value
	 */
   public void setIsin(Field source) {
      c1Dtl.setIsin(source);
   }  
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen) {
      c1Dtl.setIsin(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      c1Dtl.setIsin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of company01
	 *	@return company01
	 */
   public char[] getCompany01() throws CFException  {              
   		return dcltbdemsec.getCompany01();
   }

  
	/**
	*  set variable company01
	*  @param value
	**/
   public void setCompany01(char[] value) throws CFException {
      dcltbdemsec.setCompany01(value);
   } 

     /**
	 * 	Update Company01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompany01(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setCompany01(source, sourceIndex);
   	
   }
   
   public void setCompany01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setCompany01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Company01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompany01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setCompany01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Company01 with another Field
	 *	@param value
	 */
   public void setCompany01(Field source) {
      dcltbdemsec.setCompany01(source);
   }  
   
     /**
	 * 	Update Company01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompany01(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setCompany01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Company01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompany01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setCompany01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ric01
	 *	@return ric01
	 */
   public char[] getRic01() throws CFException  {              
   		return dcltbdemsec.getRic01();
   }

  
	/**
	*  set variable ric01
	*  @param value
	**/
   public void setRic01(char[] value) throws CFException {
      dcltbdemsec.setRic01(value);
   } 

     /**
	 * 	Update Ric01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRic01(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setRic01(source, sourceIndex);
   	
   }
   
   public void setRic01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setRic01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ric01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRic01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setRic01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ric01 with another Field
	 *	@param value
	 */
   public void setRic01(Field source) {
      dcltbdemsec.setRic01(source);
   }  
   
     /**
	 * 	Update Ric01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRic01(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setRic01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ric01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRic01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setRic01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sedol01
	 *	@return sedol01
	 */
   public char[] getSedol01() throws CFException  {              
   		return dcltbdemsec.getSedol01();
   }

  
	/**
	*  set variable sedol01
	*  @param value
	**/
   public void setSedol01(char[] value) throws CFException {
      dcltbdemsec.setSedol01(value);
   } 

     /**
	 * 	Update Sedol01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSedol01(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setSedol01(source, sourceIndex);
   	
   }
   
   public void setSedol01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setSedol01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sedol01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSedol01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setSedol01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sedol01 with another Field
	 *	@param value
	 */
   public void setSedol01(Field source) {
      dcltbdemsec.setSedol01(source);
   }  
   
     /**
	 * 	Update Sedol01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSedol01(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setSedol01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sedol01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSedol01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setSedol01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of country
	 *	@return country
	 */
   public char[] getCountry() throws CFException  {              
   		return c1Dtl.getCountry();
   }

  
	/**
	*  set variable country
	*  @param value
	**/
   public void setCountry(char[] value) throws CFException {
      c1Dtl.setCountry(value);
   } 

     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex) throws CFException {
      c1Dtl.setCountry(source, sourceIndex);
   	
   }
   
   public void setCountry(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      c1Dtl.setCountry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      c1Dtl.setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Country with another Field
	 *	@param value
	 */
   public void setCountry(Field source) {
      c1Dtl.setCountry(source);
   }  
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen) {
      c1Dtl.setCountry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      c1Dtl.setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
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
        str += sqlca.hashCode();
        str += c1Dtl.hashCode();
        str += dcltbdemsec.hashCode();
       return str.hashCode();
    }

    public GetIsinDtlsOutCtx clone() {
        GetIsinDtlsOutCtx cloneObj = new GetIsinDtlsOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.c1Dtl = new C1Dtl();
        cloneObj.c1Dtl.set(c1Dtl.getClonedField());
        cloneObj.dcltbdemsec = new Dcltbdemsec();
        cloneObj.dcltbdemsec.set(dcltbdemsec.getClonedField());
        return cloneObj;
    }

    }

    public GetIsinDtlsOutCtx getGetIsinDtlsOutCtx() {
            return new GetIsinDtlsOutCtx();
    }
     public class SpGetdataInCtx implements Cloneable {
     Sqlca sqlca = Db2funciCtx.this.getSqlca();
     Bdms01CallParameters bdms01CallParameters = Db2funciCtx.this.getBdms01CallParameters();
     Sdms01Parm sdms01Parm = Db2funciCtx.this.getSdms01Parm();

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

	/**
	 *	Returns the value of bdms01CallParameters
	 *	@return bdms01CallParameters
	 */   
	 public Bdms01CallParameters getBdms01CallParameters() {
   	return bdms01CallParameters;
   }


	/**
	 *	Returns the value of sdms01Parm
	 *	@return sdms01Parm
	 */   
	 public Sdms01Parm getSdms01Parm() {
   	return sdms01Parm;
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



        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
        }

        public SpGetdataOutCtx getSpGetdataOutCtx() {
            return new SpGetdataOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlca.hashCode();
        str += bdms01CallParameters.hashCode();
        str += sdms01Parm.hashCode();
       return str.hashCode();
    }

    public SpGetdataInCtx clone() {
        SpGetdataInCtx cloneObj = new SpGetdataInCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.bdms01CallParameters = new Bdms01CallParameters();
        cloneObj.bdms01CallParameters.set(bdms01CallParameters.getClonedField());
        cloneObj.sdms01Parm = new Sdms01Parm();
        cloneObj.sdms01Parm.set(sdms01Parm.getClonedField());
        return cloneObj;
    }

    }

    public SpGetdataInCtx getSpGetdataInCtx() {
            return new SpGetdataInCtx();
    }
     public class SpGetdataOutCtx implements Cloneable {
     Sqlca sqlca = Db2funciCtx.this.getSqlca();
     Bdms01CallParameters bdms01CallParameters = Db2funciCtx.this.getBdms01CallParameters();
     Sdms01Parm sdms01Parm = Db2funciCtx.this.getSdms01Parm();

	/**
	 *	Returns the value of msdStkDailyVolume
	 *	@return msdStkDailyVolume
	 */
	public long getMsdStkDailyVolume() throws CFException {
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().getMsdStkDailyVolume();
	}


	/**
	 *	Returns String value of msdStkDailyVolume
	 *	@return msdStkDailyVolume
	 */
	public char[]  getMsdStkDailyVolumeString() throws CFException {
	     return String.valueOf(bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().getMsdStkDailyVolumeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdStkDailyVolumeIsNumeric()  throws CFException{
	    return bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().msdStkDailyVolumeIsNumeric();
	}

	/**
	 * 	Update MsdStkDailyVolume with the passed value
	 *	@param number
	 */
	public void setMsdStkDailyVolume(long number)  throws CFException{
		bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setMsdStkDailyVolume(number);
	}
	

	
	/**
	 * 	Update MsdStkDailyVolume with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdStkDailyVolume(char[] value)  throws CFException {
		bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setMsdStkDailyVolume(value);
	}
	
	/**
	 * 	Update MsdStkDailyVolume with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdStkDailyVolumeString(char[] value)  throws CFException{
		bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setMsdStkDailyVolume(value);
	}	

	/**
	 *	Returns the value of bdms01CallTmngCd
	 *	@return bdms01CallTmngCd
	 */
   public char[] getBdms01CallTmngCd() throws CFException  {              
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().getBdms01CallTmngCd();
   }

  
	/**
	*  set variable bdms01CallTmngCd
	*  @param value
	**/
   public void setBdms01CallTmngCd(char[] value) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01CallTmngCd(value);
   } 

     /**
	 * 	Update Bdms01CallTmngCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CallTmngCd(char[] source, int sourceIndex) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01CallTmngCd(source, sourceIndex);
   	
   }
   
   public void setBdms01CallTmngCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01CallTmngCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Bdms01CallTmngCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CallTmngCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01CallTmngCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Bdms01CallTmngCd with another Field
	 *	@param value
	 */
   public void setBdms01CallTmngCd(Field source) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01CallTmngCd(source);
   }  
   
     /**
	 * 	Update Bdms01CallTmngCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CallTmngCd(Field source, int sourceIndex,int sourceLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01CallTmngCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Bdms01CallTmngCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CallTmngCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01CallTmngCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bdms01AdpMasterSegInd
	 *	@return bdms01AdpMasterSegInd
	 */
   public char[] getBdms01AdpMasterSegInd() throws CFException  {              
   		return bdms01CallParameters.getBdms01InputData().getBdms01AdpMasterSegInd();
   }

  
	/**
	*  set variable bdms01AdpMasterSegInd
	*  @param value
	**/
   public void setBdms01AdpMasterSegInd(char[] value) throws CFException {
      bdms01CallParameters.getBdms01InputData().setBdms01AdpMasterSegInd(value);
   } 

     /**
	 * 	Update Bdms01AdpMasterSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01AdpMasterSegInd(char[] source, int sourceIndex) throws CFException {
      bdms01CallParameters.getBdms01InputData().setBdms01AdpMasterSegInd(source, sourceIndex);
   	
   }
   
   public void setBdms01AdpMasterSegInd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bdms01CallParameters.getBdms01InputData().setBdms01AdpMasterSegInd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Bdms01AdpMasterSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01AdpMasterSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01InputData().setBdms01AdpMasterSegInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Bdms01AdpMasterSegInd with another Field
	 *	@param value
	 */
   public void setBdms01AdpMasterSegInd(Field source) {
      bdms01CallParameters.getBdms01InputData().setBdms01AdpMasterSegInd(source);
   }  
   
     /**
	 * 	Update Bdms01AdpMasterSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01AdpMasterSegInd(Field source, int sourceIndex,int sourceLen) {
      bdms01CallParameters.getBdms01InputData().setBdms01AdpMasterSegInd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Bdms01AdpMasterSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01AdpMasterSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01InputData().setBdms01AdpMasterSegInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of msdSecTypeCodes
	 *	@return msdSecTypeCodes
	 */   
	 public MsdSecTypeCodes getMsdSecTypeCodes() {
   	return bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().getMsdSecTypeCodes();
   }

   /**
	* 	Update MsdSecTypeCodes with the passed value
	*	@param value
	*/
   public void setMsdSecTypeCodes(char[] value) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setMsdSecTypeCodes(value);
   }   

     /**
	 * 	Update MsdSecTypeCodes 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdSecTypeCodes(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setMsdSecTypeCodes(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MsdSecTypeCodes 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecTypeCodes(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setMsdSecTypeCodes(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MsdSecTypeCodes with another Field
	 *	@param value
	 */
   public void setMsdSecTypeCodes(Field source) {
   	bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setMsdSecTypeCodes(source);
   }  
   
     /**
	 * 	Update MsdSecTypeCodes 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdSecTypeCodes(Field source, int sourceIndex,int sourceLen) {
   	bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setMsdSecTypeCodes(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MsdSecTypeCodes 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecTypeCodes(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setMsdSecTypeCodes(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of bdms01SecurityTypeSegSqlcd
	 *	@return bdms01SecurityTypeSegSqlcd
	 */
	public int getBdms01SecurityTypeSegSqlcd() throws CFException {
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().getBdms01SecurityTypeSegSqlcd();
	}


	/**
	 *	Returns String value of bdms01SecurityTypeSegSqlcd
	 *	@return bdms01SecurityTypeSegSqlcd
	 */
	public char[]  getBdms01SecurityTypeSegSqlcdString() throws CFException {
	     return String.valueOf(bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().getBdms01SecurityTypeSegSqlcdString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01SecurityTypeSegSqlcdIsNumeric()  throws CFException{
	    return bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().bdms01SecurityTypeSegSqlcdIsNumeric();
	}

	/**
	 * 	Update Bdms01SecurityTypeSegSqlcd with the passed value
	 *	@param number
	 */
	public void setBdms01SecurityTypeSegSqlcd(int number)  throws CFException{
		bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setBdms01SecurityTypeSegSqlcd(number);
	}
	

	public void setBdms01SecurityTypeSegSqlcd(long number)  throws CFException{
	    bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setBdms01SecurityTypeSegSqlcd(number);
	}
	
	
	/**
	 * 	Update Bdms01SecurityTypeSegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01SecurityTypeSegSqlcd(char[] value)  throws CFException {
		bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setBdms01SecurityTypeSegSqlcd(value);
	}
	
	/**
	 * 	Update Bdms01SecurityTypeSegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01SecurityTypeSegSqlcdString(char[] value)  throws CFException{
		bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setBdms01SecurityTypeSegSqlcd(value);
	}	

	/**
	 *	Returns the value of bdms01McgillCd
	 *	@return bdms01McgillCd
	 */
	public long getBdms01McgillCd() throws CFException {
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().getBdms01McgillCd();
	}


	/**
	 *	Returns String value of bdms01McgillCd
	 *	@return bdms01McgillCd
	 */
	public char[]  getBdms01McgillCdString() throws CFException {
	     return String.valueOf(bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().getBdms01McgillCdString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01McgillCdIsNumeric()  throws CFException{
	    return bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().bdms01McgillCdIsNumeric();
	}

	/**
	 * 	Update Bdms01McgillCd with the passed value
	 *	@param number
	 */
	public void setBdms01McgillCd(long number)  throws CFException{
		bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01McgillCd(number);
	}
	

	
	/**
	 * 	Update Bdms01McgillCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01McgillCd(char[] value)  throws CFException {
		bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01McgillCd(value);
	}
	
	/**
	 * 	Update Bdms01McgillCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01McgillCdString(char[] value)  throws CFException{
		bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01McgillCd(value);
	}	

	/**
	 *	Returns the value of msdSecurityDesc1
	 *	@return msdSecurityDesc1
	 */   
	 public MsdSecurityDesc1 getMsdSecurityDesc1() {
   	return bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().getMsdSecurityDesc1();
   }

   /**
	* 	Update MsdSecurityDesc1 with the passed value
	*	@param value
	*/
   public void setMsdSecurityDesc1(char[] value) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdSecurityDesc1(value);
   }   

     /**
	 * 	Update MsdSecurityDesc1 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdSecurityDesc1(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdSecurityDesc1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MsdSecurityDesc1 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecurityDesc1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdSecurityDesc1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MsdSecurityDesc1 with another Field
	 *	@param value
	 */
   public void setMsdSecurityDesc1(Field source) {
   	bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdSecurityDesc1(source);
   }  
   
     /**
	 * 	Update MsdSecurityDesc1 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdSecurityDesc1(Field source, int sourceIndex,int sourceLen) {
   	bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdSecurityDesc1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MsdSecurityDesc1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecurityDesc1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdSecurityDesc1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bdms01RedenominationDt
	 *	@return bdms01RedenominationDt
	 */
   public char[] getBdms01RedenominationDt() throws CFException  {              
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().getBdms01RedenominationDt();
   }

  
	/**
	*  set variable bdms01RedenominationDt
	*  @param value
	**/
   public void setBdms01RedenominationDt(char[] value) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01RedenominationDt(value);
   } 

     /**
	 * 	Update Bdms01RedenominationDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01RedenominationDt(char[] source, int sourceIndex) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01RedenominationDt(source, sourceIndex);
   	
   }
   
   public void setBdms01RedenominationDt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01RedenominationDt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Bdms01RedenominationDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RedenominationDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01RedenominationDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Bdms01RedenominationDt with another Field
	 *	@param value
	 */
   public void setBdms01RedenominationDt(Field source) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01RedenominationDt(source);
   }  
   
     /**
	 * 	Update Bdms01RedenominationDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01RedenominationDt(Field source, int sourceIndex,int sourceLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01RedenominationDt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Bdms01RedenominationDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01RedenominationDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01RedenominationDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bdms01ClientNbr
	 *	@return bdms01ClientNbr
	 */
   public char[] getBdms01ClientNbr() throws CFException  {              
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().getBdms01ClientNbr();
   }

  
	/**
	*  set variable bdms01ClientNbr
	*  @param value
	**/
   public void setBdms01ClientNbr(char[] value) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01ClientNbr(value);
   } 

     /**
	 * 	Update Bdms01ClientNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01ClientNbr(char[] source, int sourceIndex) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01ClientNbr(source, sourceIndex);
   	
   }
   
   public void setBdms01ClientNbr(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01ClientNbr(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Bdms01ClientNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ClientNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01ClientNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Bdms01ClientNbr with another Field
	 *	@param value
	 */
   public void setBdms01ClientNbr(Field source) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01ClientNbr(source);
   }  
   
     /**
	 * 	Update Bdms01ClientNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01ClientNbr(Field source, int sourceIndex,int sourceLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01ClientNbr(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Bdms01ClientNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01ClientNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01ClientNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of msdSecPriceMultiplier
	 *	@return msdSecPriceMultiplier
	 */
   public char[] getMsdSecPriceMultiplier() throws CFException  {              
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().getMsdSecPriceMultiplier();
   }

  
	/**
	*  set variable msdSecPriceMultiplier
	*  @param value
	**/
   public void setMsdSecPriceMultiplier(char[] value) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setMsdSecPriceMultiplier(value);
   } 

     /**
	 * 	Update MsdSecPriceMultiplier 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdSecPriceMultiplier(char[] source, int sourceIndex) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setMsdSecPriceMultiplier(source, sourceIndex);
   	
   }
   
   public void setMsdSecPriceMultiplier(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setMsdSecPriceMultiplier(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MsdSecPriceMultiplier 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecPriceMultiplier(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setMsdSecPriceMultiplier(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MsdSecPriceMultiplier with another Field
	 *	@param value
	 */
   public void setMsdSecPriceMultiplier(Field source) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setMsdSecPriceMultiplier(source);
   }  
   
     /**
	 * 	Update MsdSecPriceMultiplier 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdSecPriceMultiplier(Field source, int sourceIndex,int sourceLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setMsdSecPriceMultiplier(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MsdSecPriceMultiplier 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecPriceMultiplier(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setMsdSecPriceMultiplier(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of msdAddedCcyymmdd
	 *	@return msdAddedCcyymmdd
	 */   
	 public MsdAddedCcyymmdd getMsdAddedCcyymmdd() {
   	return bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().getMsdAddedCcyymmdd();
   }

   /**
	* 	Update MsdAddedCcyymmdd with the passed value
	*	@param value
	*/
   public void setMsdAddedCcyymmdd(char[] value) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdAddedCcyymmdd(value);
   }   

     /**
	 * 	Update MsdAddedCcyymmdd 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdAddedCcyymmdd(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdAddedCcyymmdd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MsdAddedCcyymmdd 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdAddedCcyymmdd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdAddedCcyymmdd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MsdAddedCcyymmdd with another Field
	 *	@param value
	 */
   public void setMsdAddedCcyymmdd(Field source) {
   	bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdAddedCcyymmdd(source);
   }  
   
     /**
	 * 	Update MsdAddedCcyymmdd 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdAddedCcyymmdd(Field source, int sourceIndex,int sourceLen) {
   	bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdAddedCcyymmdd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MsdAddedCcyymmdd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdAddedCcyymmdd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdAddedCcyymmdd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bdms01CntryOrgnCd
	 *	@return bdms01CntryOrgnCd
	 */
   public char[] getBdms01CntryOrgnCd() throws CFException  {              
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().getBdms01CntryOrgnCd();
   }

  
	/**
	*  set variable bdms01CntryOrgnCd
	*  @param value
	**/
   public void setBdms01CntryOrgnCd(char[] value) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01CntryOrgnCd(value);
   } 

     /**
	 * 	Update Bdms01CntryOrgnCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CntryOrgnCd(char[] source, int sourceIndex) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01CntryOrgnCd(source, sourceIndex);
   	
   }
   
   public void setBdms01CntryOrgnCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01CntryOrgnCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Bdms01CntryOrgnCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CntryOrgnCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01CntryOrgnCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Bdms01CntryOrgnCd with another Field
	 *	@param value
	 */
   public void setBdms01CntryOrgnCd(Field source) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01CntryOrgnCd(source);
   }  
   
     /**
	 * 	Update Bdms01CntryOrgnCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CntryOrgnCd(Field source, int sourceIndex,int sourceLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01CntryOrgnCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Bdms01CntryOrgnCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CntryOrgnCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01CntryOrgnCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of msdCurrencyCode
	 *	@return msdCurrencyCode
	 */
   public char[] getMsdCurrencyCode() throws CFException  {              
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().getMsdCurrencyCode();
   }

  
	/**
	*  set variable msdCurrencyCode
	*  @param value
	**/
   public void setMsdCurrencyCode(char[] value) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setMsdCurrencyCode(value);
   } 

     /**
	 * 	Update MsdCurrencyCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdCurrencyCode(char[] source, int sourceIndex) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setMsdCurrencyCode(source, sourceIndex);
   	
   }
   
   public void setMsdCurrencyCode(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setMsdCurrencyCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MsdCurrencyCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdCurrencyCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setMsdCurrencyCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MsdCurrencyCode with another Field
	 *	@param value
	 */
   public void setMsdCurrencyCode(Field source) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setMsdCurrencyCode(source);
   }  
   
     /**
	 * 	Update MsdCurrencyCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdCurrencyCode(Field source, int sourceIndex,int sourceLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setMsdCurrencyCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MsdCurrencyCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdCurrencyCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setMsdCurrencyCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sdms01ParmLen
	 *	@return sdms01ParmLen
	 */
	public short getSdms01ParmLen() throws CFException {        
   		return sdms01Parm.getSdms01ParmLen();
	}
	
	/**
	 * 	Update Sdms01ParmLen with the passed value
	 *	@param number
	 */
	public void setSdms01ParmLen(short number)  throws CFException{
		sdms01Parm.setSdms01ParmLen(number);
	}

	public void setSdms01ParmLen(int number)  throws CFException{
		sdms01Parm.setSdms01ParmLen((short)number);
	}

	public void setSdms01ParmLen(long number)  throws CFException{
		sdms01Parm.setSdms01ParmLen((short)number);
	}



	/**
	 *	Returns the value of msdTypeOfRecordInd
	 *	@return msdTypeOfRecordInd
	 */
   public char[] getMsdTypeOfRecordInd() throws CFException  {              
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().getMsdTypeOfRecordInd();
   }

  
	/**
	*  set variable msdTypeOfRecordInd
	*  @param value
	**/
   public void setMsdTypeOfRecordInd(char[] value) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setMsdTypeOfRecordInd(value);
   } 

     /**
	 * 	Update MsdTypeOfRecordInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdTypeOfRecordInd(char[] source, int sourceIndex) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setMsdTypeOfRecordInd(source, sourceIndex);
   	
   }
   
   public void setMsdTypeOfRecordInd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setMsdTypeOfRecordInd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MsdTypeOfRecordInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdTypeOfRecordInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setMsdTypeOfRecordInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MsdTypeOfRecordInd with another Field
	 *	@param value
	 */
   public void setMsdTypeOfRecordInd(Field source) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setMsdTypeOfRecordInd(source);
   }  
   
     /**
	 * 	Update MsdTypeOfRecordInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdTypeOfRecordInd(Field source, int sourceIndex,int sourceLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setMsdTypeOfRecordInd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MsdTypeOfRecordInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdTypeOfRecordInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setMsdTypeOfRecordInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bdms01AdpMasterSegSqlcd
	 *	@return bdms01AdpMasterSegSqlcd
	 */
	public int getBdms01AdpMasterSegSqlcd() throws CFException {
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().getBdms01AdpMasterSegSqlcd();
	}


	/**
	 *	Returns String value of bdms01AdpMasterSegSqlcd
	 *	@return bdms01AdpMasterSegSqlcd
	 */
	public char[]  getBdms01AdpMasterSegSqlcdString() throws CFException {
	     return String.valueOf(bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().getBdms01AdpMasterSegSqlcdString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01AdpMasterSegSqlcdIsNumeric()  throws CFException{
	    return bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().bdms01AdpMasterSegSqlcdIsNumeric();
	}

	/**
	 * 	Update Bdms01AdpMasterSegSqlcd with the passed value
	 *	@param number
	 */
	public void setBdms01AdpMasterSegSqlcd(int number)  throws CFException{
		bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01AdpMasterSegSqlcd(number);
	}
	

	public void setBdms01AdpMasterSegSqlcd(long number)  throws CFException{
	    bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01AdpMasterSegSqlcd(number);
	}
	
	
	/**
	 * 	Update Bdms01AdpMasterSegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01AdpMasterSegSqlcd(char[] value)  throws CFException {
		bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01AdpMasterSegSqlcd(value);
	}
	
	/**
	 * 	Update Bdms01AdpMasterSegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01AdpMasterSegSqlcdString(char[] value)  throws CFException{
		bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01AdpMasterSegSqlcd(value);
	}	

	/**
	 *	Returns the value of bdms01PutTmngCd
	 *	@return bdms01PutTmngCd
	 */
   public char[] getBdms01PutTmngCd() throws CFException  {              
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().getBdms01PutTmngCd();
   }

  
	/**
	*  set variable bdms01PutTmngCd
	*  @param value
	**/
   public void setBdms01PutTmngCd(char[] value) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01PutTmngCd(value);
   } 

     /**
	 * 	Update Bdms01PutTmngCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PutTmngCd(char[] source, int sourceIndex) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01PutTmngCd(source, sourceIndex);
   	
   }
   
   public void setBdms01PutTmngCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01PutTmngCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Bdms01PutTmngCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PutTmngCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01PutTmngCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Bdms01PutTmngCd with another Field
	 *	@param value
	 */
   public void setBdms01PutTmngCd(Field source) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01PutTmngCd(source);
   }  
   
     /**
	 * 	Update Bdms01PutTmngCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PutTmngCd(Field source, int sourceIndex,int sourceLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01PutTmngCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Bdms01PutTmngCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PutTmngCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01PutTmngCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bdms01ReturnSqlcode
	 *	@return bdms01ReturnSqlcode
	 */
	public int getBdms01ReturnSqlcode() throws CFException {
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01ReturnSqlcode();
	}


	/**
	 *	Returns String value of bdms01ReturnSqlcode
	 *	@return bdms01ReturnSqlcode
	 */
	public char[]  getBdms01ReturnSqlcodeString() throws CFException {
	     return String.valueOf(bdms01CallParameters.getBdms01ReturnData().getBdms01ReturnSqlcodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01ReturnSqlcodeIsNumeric()  throws CFException{
	    return bdms01CallParameters.getBdms01ReturnData().bdms01ReturnSqlcodeIsNumeric();
	}

	/**
	 * 	Update Bdms01ReturnSqlcode with the passed value
	 *	@param number
	 */
	public void setBdms01ReturnSqlcode(int number)  throws CFException{
		bdms01CallParameters.getBdms01ReturnData().setBdms01ReturnSqlcode(number);
	}
	

	public void setBdms01ReturnSqlcode(long number)  throws CFException{
	    bdms01CallParameters.getBdms01ReturnData().setBdms01ReturnSqlcode(number);
	}
	
	
	/**
	 * 	Update Bdms01ReturnSqlcode with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01ReturnSqlcode(char[] value)  throws CFException {
		bdms01CallParameters.getBdms01ReturnData().setBdms01ReturnSqlcode(value);
	}
	
	/**
	 * 	Update Bdms01ReturnSqlcode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01ReturnSqlcodeString(char[] value)  throws CFException{
		bdms01CallParameters.getBdms01ReturnData().setBdms01ReturnSqlcode(value);
	}	

	/**
	 *	Returns the value of bdms01BaseSecuritySegInd
	 *	@return bdms01BaseSecuritySegInd
	 */
   public char[] getBdms01BaseSecuritySegInd() throws CFException  {              
   		return bdms01CallParameters.getBdms01InputData().getBdms01BaseSecuritySegInd();
   }

  
	/**
	*  set variable bdms01BaseSecuritySegInd
	*  @param value
	**/
   public void setBdms01BaseSecuritySegInd(char[] value) throws CFException {
      bdms01CallParameters.getBdms01InputData().setBdms01BaseSecuritySegInd(value);
   } 

     /**
	 * 	Update Bdms01BaseSecuritySegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01BaseSecuritySegInd(char[] source, int sourceIndex) throws CFException {
      bdms01CallParameters.getBdms01InputData().setBdms01BaseSecuritySegInd(source, sourceIndex);
   	
   }
   
   public void setBdms01BaseSecuritySegInd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bdms01CallParameters.getBdms01InputData().setBdms01BaseSecuritySegInd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Bdms01BaseSecuritySegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BaseSecuritySegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01InputData().setBdms01BaseSecuritySegInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Bdms01BaseSecuritySegInd with another Field
	 *	@param value
	 */
   public void setBdms01BaseSecuritySegInd(Field source) {
      bdms01CallParameters.getBdms01InputData().setBdms01BaseSecuritySegInd(source);
   }  
   
     /**
	 * 	Update Bdms01BaseSecuritySegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01BaseSecuritySegInd(Field source, int sourceIndex,int sourceLen) {
      bdms01CallParameters.getBdms01InputData().setBdms01BaseSecuritySegInd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Bdms01BaseSecuritySegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01BaseSecuritySegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01InputData().setBdms01BaseSecuritySegInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of msdIndustrialClass
	 *	@return msdIndustrialClass
	 */
   public char[] getMsdIndustrialClass() throws CFException  {              
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().getMsdIndustrialClass();
   }

  
	/**
	*  set variable msdIndustrialClass
	*  @param value
	**/
   public void setMsdIndustrialClass(char[] value) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setMsdIndustrialClass(value);
   } 

     /**
	 * 	Update MsdIndustrialClass 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdIndustrialClass(char[] source, int sourceIndex) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setMsdIndustrialClass(source, sourceIndex);
   	
   }
   
   public void setMsdIndustrialClass(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setMsdIndustrialClass(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MsdIndustrialClass 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdIndustrialClass(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setMsdIndustrialClass(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MsdIndustrialClass with another Field
	 *	@param value
	 */
   public void setMsdIndustrialClass(Field source) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setMsdIndustrialClass(source);
   }  
   
     /**
	 * 	Update MsdIndustrialClass 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdIndustrialClass(Field source, int sourceIndex,int sourceLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setMsdIndustrialClass(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MsdIndustrialClass 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdIndustrialClass(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setMsdIndustrialClass(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bdms01CallParameters
	 *	@return bdms01CallParameters
	 */   
	 public Bdms01CallParameters getBdms01CallParameters() {
   	return bdms01CallParameters;
   }


	/**
	 *	Returns the value of bdms01SecurityTypeSegInd
	 *	@return bdms01SecurityTypeSegInd
	 */
   public char[] getBdms01SecurityTypeSegInd() throws CFException  {              
   		return bdms01CallParameters.getBdms01InputData().getBdms01SecurityTypeSegInd();
   }

  
	/**
	*  set variable bdms01SecurityTypeSegInd
	*  @param value
	**/
   public void setBdms01SecurityTypeSegInd(char[] value) throws CFException {
      bdms01CallParameters.getBdms01InputData().setBdms01SecurityTypeSegInd(value);
   } 

     /**
	 * 	Update Bdms01SecurityTypeSegInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01SecurityTypeSegInd(char[] source, int sourceIndex) throws CFException {
      bdms01CallParameters.getBdms01InputData().setBdms01SecurityTypeSegInd(source, sourceIndex);
   	
   }
   
   public void setBdms01SecurityTypeSegInd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bdms01CallParameters.getBdms01InputData().setBdms01SecurityTypeSegInd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Bdms01SecurityTypeSegInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SecurityTypeSegInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01InputData().setBdms01SecurityTypeSegInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Bdms01SecurityTypeSegInd with another Field
	 *	@param value
	 */
   public void setBdms01SecurityTypeSegInd(Field source) {
      bdms01CallParameters.getBdms01InputData().setBdms01SecurityTypeSegInd(source);
   }  
   
     /**
	 * 	Update Bdms01SecurityTypeSegInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01SecurityTypeSegInd(Field source, int sourceIndex,int sourceLen) {
      bdms01CallParameters.getBdms01InputData().setBdms01SecurityTypeSegInd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Bdms01SecurityTypeSegInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01SecurityTypeSegInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01InputData().setBdms01SecurityTypeSegInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of msdClassInd
	 *	@return msdClassInd
	 */
   public char[] getMsdClassInd() throws CFException  {              
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().getMsdClassInd();
   }

  
	/**
	*  set variable msdClassInd
	*  @param value
	**/
   public void setMsdClassInd(char[] value) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdClassInd(value);
   } 

     /**
	 * 	Update MsdClassInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdClassInd(char[] source, int sourceIndex) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdClassInd(source, sourceIndex);
   	
   }
   
   public void setMsdClassInd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdClassInd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MsdClassInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdClassInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdClassInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MsdClassInd with another Field
	 *	@param value
	 */
   public void setMsdClassInd(Field source) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdClassInd(source);
   }  
   
     /**
	 * 	Update MsdClassInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdClassInd(Field source, int sourceIndex,int sourceLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdClassInd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MsdClassInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdClassInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdClassInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bdms01CusipCntraNbr
	 *	@return bdms01CusipCntraNbr
	 */
   public char[] getBdms01CusipCntraNbr() throws CFException  {              
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().getBdms01CusipCntraNbr();
   }

  
	/**
	*  set variable bdms01CusipCntraNbr
	*  @param value
	**/
   public void setBdms01CusipCntraNbr(char[] value) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01CusipCntraNbr(value);
   } 

     /**
	 * 	Update Bdms01CusipCntraNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CusipCntraNbr(char[] source, int sourceIndex) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01CusipCntraNbr(source, sourceIndex);
   	
   }
   
   public void setBdms01CusipCntraNbr(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01CusipCntraNbr(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Bdms01CusipCntraNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CusipCntraNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01CusipCntraNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Bdms01CusipCntraNbr with another Field
	 *	@param value
	 */
   public void setBdms01CusipCntraNbr(Field source) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01CusipCntraNbr(source);
   }  
   
     /**
	 * 	Update Bdms01CusipCntraNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CusipCntraNbr(Field source, int sourceIndex,int sourceLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01CusipCntraNbr(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Bdms01CusipCntraNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CusipCntraNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01CusipCntraNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bdms01BaseSecuritySegSqlcd
	 *	@return bdms01BaseSecuritySegSqlcd
	 */
	public int getBdms01BaseSecuritySegSqlcd() throws CFException {
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().getBdms01BaseSecuritySegSqlcd();
	}


	/**
	 *	Returns String value of bdms01BaseSecuritySegSqlcd
	 *	@return bdms01BaseSecuritySegSqlcd
	 */
	public char[]  getBdms01BaseSecuritySegSqlcdString() throws CFException {
	     return String.valueOf(bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().getBdms01BaseSecuritySegSqlcdString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01BaseSecuritySegSqlcdIsNumeric()  throws CFException{
	    return bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().bdms01BaseSecuritySegSqlcdIsNumeric();
	}

	/**
	 * 	Update Bdms01BaseSecuritySegSqlcd with the passed value
	 *	@param number
	 */
	public void setBdms01BaseSecuritySegSqlcd(int number)  throws CFException{
		bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01BaseSecuritySegSqlcd(number);
	}
	

	public void setBdms01BaseSecuritySegSqlcd(long number)  throws CFException{
	    bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01BaseSecuritySegSqlcd(number);
	}
	
	
	/**
	 * 	Update Bdms01BaseSecuritySegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01BaseSecuritySegSqlcd(char[] value)  throws CFException {
		bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01BaseSecuritySegSqlcd(value);
	}
	
	/**
	 * 	Update Bdms01BaseSecuritySegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01BaseSecuritySegSqlcdString(char[] value)  throws CFException{
		bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01BaseSecuritySegSqlcd(value);
	}	

	/**
	 *	Returns the value of msdCountryCode
	 *	@return msdCountryCode
	 */
   public char[] getMsdCountryCode() throws CFException  {              
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().getMsdCountryCode();
   }

  
	/**
	*  set variable msdCountryCode
	*  @param value
	**/
   public void setMsdCountryCode(char[] value) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdCountryCode(value);
   } 

     /**
	 * 	Update MsdCountryCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdCountryCode(char[] source, int sourceIndex) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdCountryCode(source, sourceIndex);
   	
   }
   
   public void setMsdCountryCode(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdCountryCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MsdCountryCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdCountryCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdCountryCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MsdCountryCode with another Field
	 *	@param value
	 */
   public void setMsdCountryCode(Field source) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdCountryCode(source);
   }  
   
     /**
	 * 	Update MsdCountryCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdCountryCode(Field source, int sourceIndex,int sourceLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdCountryCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MsdCountryCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdCountryCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdCountryCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bdms01CntryIssueCd
	 *	@return bdms01CntryIssueCd
	 */
   public char[] getBdms01CntryIssueCd() throws CFException  {              
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().getBdms01CntryIssueCd();
   }

  
	/**
	*  set variable bdms01CntryIssueCd
	*  @param value
	**/
   public void setBdms01CntryIssueCd(char[] value) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01CntryIssueCd(value);
   } 

     /**
	 * 	Update Bdms01CntryIssueCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CntryIssueCd(char[] source, int sourceIndex) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01CntryIssueCd(source, sourceIndex);
   	
   }
   
   public void setBdms01CntryIssueCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01CntryIssueCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Bdms01CntryIssueCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CntryIssueCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01CntryIssueCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Bdms01CntryIssueCd with another Field
	 *	@param value
	 */
   public void setBdms01CntryIssueCd(Field source) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01CntryIssueCd(source);
   }  
   
     /**
	 * 	Update Bdms01CntryIssueCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CntryIssueCd(Field source, int sourceIndex,int sourceLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01CntryIssueCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Bdms01CntryIssueCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CntryIssueCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setBdms01CntryIssueCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sdms01ParmData
	 *	@return sdms01ParmData
	 */
   public char[] getSdms01ParmData() throws CFException  {              
   		return sdms01Parm.getSdms01ParmData();
   }

  
	/**
	*  set variable sdms01ParmData
	*  @param value
	**/
   public void setSdms01ParmData(char[] value) throws CFException {
      sdms01Parm.setSdms01ParmData(value);
   } 

     /**
	 * 	Update Sdms01ParmData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSdms01ParmData(char[] source, int sourceIndex) throws CFException {
      sdms01Parm.setSdms01ParmData(source, sourceIndex);
   	
   }
   
   public void setSdms01ParmData(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sdms01Parm.setSdms01ParmData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sdms01ParmData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSdms01ParmData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sdms01Parm.setSdms01ParmData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sdms01ParmData with another Field
	 *	@param value
	 */
   public void setSdms01ParmData(Field source) {
      sdms01Parm.setSdms01ParmData(source);
   }  
   
     /**
	 * 	Update Sdms01ParmData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSdms01ParmData(Field source, int sourceIndex,int sourceLen) {
      sdms01Parm.setSdms01ParmData(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sdms01ParmData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSdms01ParmData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sdms01Parm.setSdms01ParmData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of bdms01OtcBlltnStkInd
	 *	@return bdms01OtcBlltnStkInd
	 */
   public char[] getBdms01OtcBlltnStkInd() throws CFException  {              
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().getBdms01OtcBlltnStkInd();
   }

  
	/**
	*  set variable bdms01OtcBlltnStkInd
	*  @param value
	**/
   public void setBdms01OtcBlltnStkInd(char[] value) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01OtcBlltnStkInd(value);
   } 

     /**
	 * 	Update Bdms01OtcBlltnStkInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01OtcBlltnStkInd(char[] source, int sourceIndex) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01OtcBlltnStkInd(source, sourceIndex);
   	
   }
   
   public void setBdms01OtcBlltnStkInd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01OtcBlltnStkInd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Bdms01OtcBlltnStkInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OtcBlltnStkInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01OtcBlltnStkInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Bdms01OtcBlltnStkInd with another Field
	 *	@param value
	 */
   public void setBdms01OtcBlltnStkInd(Field source) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01OtcBlltnStkInd(source);
   }  
   
     /**
	 * 	Update Bdms01OtcBlltnStkInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01OtcBlltnStkInd(Field source, int sourceIndex,int sourceLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01OtcBlltnStkInd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Bdms01OtcBlltnStkInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01OtcBlltnStkInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01OtcBlltnStkInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of msdAidsCode
	 *	@return msdAidsCode
	 */
   public char[] getMsdAidsCode() throws CFException  {              
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().getMsdAidsCode();
   }

  
	/**
	*  set variable msdAidsCode
	*  @param value
	**/
   public void setMsdAidsCode(char[] value) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setMsdAidsCode(value);
   } 

     /**
	 * 	Update MsdAidsCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdAidsCode(char[] source, int sourceIndex) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setMsdAidsCode(source, sourceIndex);
   	
   }
   
   public void setMsdAidsCode(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setMsdAidsCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MsdAidsCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdAidsCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setMsdAidsCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MsdAidsCode with another Field
	 *	@param value
	 */
   public void setMsdAidsCode(Field source) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setMsdAidsCode(source);
   }  
   
     /**
	 * 	Update MsdAidsCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdAidsCode(Field source, int sourceIndex,int sourceLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setMsdAidsCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MsdAidsCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdAidsCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setMsdAidsCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bdms01PutStrtDt
	 *	@return bdms01PutStrtDt
	 */
   public char[] getBdms01PutStrtDt() throws CFException  {              
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().getBdms01PutStrtDt();
   }

  
	/**
	*  set variable bdms01PutStrtDt
	*  @param value
	**/
   public void setBdms01PutStrtDt(char[] value) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01PutStrtDt(value);
   } 

     /**
	 * 	Update Bdms01PutStrtDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01PutStrtDt(char[] source, int sourceIndex) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01PutStrtDt(source, sourceIndex);
   	
   }
   
   public void setBdms01PutStrtDt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01PutStrtDt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Bdms01PutStrtDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PutStrtDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01PutStrtDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Bdms01PutStrtDt with another Field
	 *	@param value
	 */
   public void setBdms01PutStrtDt(Field source) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01PutStrtDt(source);
   }  
   
     /**
	 * 	Update Bdms01PutStrtDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01PutStrtDt(Field source, int sourceIndex,int sourceLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01PutStrtDt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Bdms01PutStrtDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01PutStrtDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecuritySegData().setBdms01PutStrtDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of msdSecurityTypePos1
	 *	@return msdSecurityTypePos1
	 */
   public char[] getMsdSecurityTypePos1() throws CFException  {              
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().getMsdSecurityTypePos1();
   }

  
	/**
	*  set variable msdSecurityTypePos1
	*  @param value
	**/
   public void setMsdSecurityTypePos1(char[] value) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setMsdSecurityTypePos1(value);
   } 

     /**
	 * 	Update MsdSecurityTypePos1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdSecurityTypePos1(char[] source, int sourceIndex) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setMsdSecurityTypePos1(source, sourceIndex);
   	
   }
   
   public void setMsdSecurityTypePos1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setMsdSecurityTypePos1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MsdSecurityTypePos1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecurityTypePos1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setMsdSecurityTypePos1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MsdSecurityTypePos1 with another Field
	 *	@param value
	 */
   public void setMsdSecurityTypePos1(Field source) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setMsdSecurityTypePos1(source);
   }  
   
     /**
	 * 	Update MsdSecurityTypePos1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdSecurityTypePos1(Field source, int sourceIndex,int sourceLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setMsdSecurityTypePos1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MsdSecurityTypePos1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdSecurityTypePos1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01SecurityTypeSegData().setMsdSecurityTypePos1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of msdCountryOfOrigin
	 *	@return msdCountryOfOrigin
	 */
   public char[] getMsdCountryOfOrigin() throws CFException  {              
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().getMsdCountryOfOrigin();
   }

  
	/**
	*  set variable msdCountryOfOrigin
	*  @param value
	**/
   public void setMsdCountryOfOrigin(char[] value) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdCountryOfOrigin(value);
   } 

     /**
	 * 	Update MsdCountryOfOrigin 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdCountryOfOrigin(char[] source, int sourceIndex) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdCountryOfOrigin(source, sourceIndex);
   	
   }
   
   public void setMsdCountryOfOrigin(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdCountryOfOrigin(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update MsdCountryOfOrigin 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdCountryOfOrigin(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdCountryOfOrigin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update MsdCountryOfOrigin with another Field
	 *	@param value
	 */
   public void setMsdCountryOfOrigin(Field source) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdCountryOfOrigin(source);
   }  
   
     /**
	 * 	Update MsdCountryOfOrigin 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdCountryOfOrigin(Field source, int sourceIndex,int sourceLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdCountryOfOrigin(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update MsdCountryOfOrigin 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdCountryOfOrigin(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterSegData().setMsdCountryOfOrigin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlca.hashCode();
        str += bdms01CallParameters.hashCode();
        str += sdms01Parm.hashCode();
       return str.hashCode();
    }

    public SpGetdataOutCtx clone() {
        SpGetdataOutCtx cloneObj = new SpGetdataOutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.bdms01CallParameters = new Bdms01CallParameters();
        cloneObj.bdms01CallParameters.set(bdms01CallParameters.getClonedField());
        cloneObj.sdms01Parm = new Sdms01Parm();
        cloneObj.sdms01Parm.set(sdms01Parm.getClonedField());
        return cloneObj;
    }

    }

    public SpGetdataOutCtx getSpGetdataOutCtx() {
            return new SpGetdataOutCtx();
    }
     public class Cursor1InCtx implements Cloneable {
     HostVariables hostVariables = Db2funciCtx.this.getHostVariables();
     Sqlca sqlca = Db2funciCtx.this.getSqlca();
     Dclscpsectb dclscpsectb = Db2funciCtx.this.getDclscpsectb();
     ApplicationCodeListGroup applicationCodeListGroup = Db2funciCtx.this.getApplicationCodeListGroup();

	/**
	 *	Returns the value of remAppCdAllowedSw
	 *	@return remAppCdAllowedSw
	 */
   public char[] getRemAppCdAllowedSw() throws CFException  {              
   		return hostVariables.getRemAppCdAllowedSw();
   }

  
	/**
	*  set variable remAppCdAllowedSw
	*  @param value
	**/
   public void setRemAppCdAllowedSw(char[] value) throws CFException {
      hostVariables.setRemAppCdAllowedSw(value);
   } 

     /**
	 * 	Update RemAppCdAllowedSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRemAppCdAllowedSw(char[] source, int sourceIndex) throws CFException {
      hostVariables.setRemAppCdAllowedSw(source, sourceIndex);
   	
   }
   
   public void setRemAppCdAllowedSw(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hostVariables.setRemAppCdAllowedSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RemAppCdAllowedSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRemAppCdAllowedSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hostVariables.setRemAppCdAllowedSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RemAppCdAllowedSw with another Field
	 *	@param value
	 */
   public void setRemAppCdAllowedSw(Field source) {
      hostVariables.setRemAppCdAllowedSw(source);
   }  
   
     /**
	 * 	Update RemAppCdAllowedSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRemAppCdAllowedSw(Field source, int sourceIndex,int sourceLen) {
      hostVariables.setRemAppCdAllowedSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RemAppCdAllowedSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRemAppCdAllowedSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hostVariables.setRemAppCdAllowedSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hostAppCode06
	 *	@return hostAppCode06
	 */
   public char[] getHostAppCode06() throws CFException  {              
   		return applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().getHostAppCode06();
   }

  
	/**
	*  set variable hostAppCode06
	*  @param value
	**/
   public void setHostAppCode06(char[] value) throws CFException {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode06(value);
   } 

     /**
	 * 	Update HostAppCode06 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHostAppCode06(char[] source, int sourceIndex) throws CFException {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode06(source, sourceIndex);
   	
   }
   
   public void setHostAppCode06(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode06(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HostAppCode06 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCode06(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode06(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HostAppCode06 with another Field
	 *	@param value
	 */
   public void setHostAppCode06(Field source) {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode06(source);
   }  
   
     /**
	 * 	Update HostAppCode06 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHostAppCode06(Field source, int sourceIndex,int sourceLen) {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode06(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HostAppCode06 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCode06(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode06(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of hostAppCode07
	 *	@return hostAppCode07
	 */
   public char[] getHostAppCode07() throws CFException  {              
   		return applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().getHostAppCode07();
   }

  
	/**
	*  set variable hostAppCode07
	*  @param value
	**/
   public void setHostAppCode07(char[] value) throws CFException {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode07(value);
   } 

     /**
	 * 	Update HostAppCode07 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHostAppCode07(char[] source, int sourceIndex) throws CFException {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode07(source, sourceIndex);
   	
   }
   
   public void setHostAppCode07(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode07(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HostAppCode07 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCode07(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode07(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HostAppCode07 with another Field
	 *	@param value
	 */
   public void setHostAppCode07(Field source) {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode07(source);
   }  
   
     /**
	 * 	Update HostAppCode07 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHostAppCode07(Field source, int sourceIndex,int sourceLen) {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode07(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HostAppCode07 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCode07(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode07(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of rtlAppCdAllowedSw
	 *	@return rtlAppCdAllowedSw
	 */
   public char[] getRtlAppCdAllowedSw() throws CFException  {              
   		return hostVariables.getRtlAppCdAllowedSw();
   }

  
	/**
	*  set variable rtlAppCdAllowedSw
	*  @param value
	**/
   public void setRtlAppCdAllowedSw(char[] value) throws CFException {
      hostVariables.setRtlAppCdAllowedSw(value);
   } 

     /**
	 * 	Update RtlAppCdAllowedSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRtlAppCdAllowedSw(char[] source, int sourceIndex) throws CFException {
      hostVariables.setRtlAppCdAllowedSw(source, sourceIndex);
   	
   }
   
   public void setRtlAppCdAllowedSw(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hostVariables.setRtlAppCdAllowedSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RtlAppCdAllowedSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRtlAppCdAllowedSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hostVariables.setRtlAppCdAllowedSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RtlAppCdAllowedSw with another Field
	 *	@param value
	 */
   public void setRtlAppCdAllowedSw(Field source) {
      hostVariables.setRtlAppCdAllowedSw(source);
   }  
   
     /**
	 * 	Update RtlAppCdAllowedSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRtlAppCdAllowedSw(Field source, int sourceIndex,int sourceLen) {
      hostVariables.setRtlAppCdAllowedSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RtlAppCdAllowedSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRtlAppCdAllowedSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hostVariables.setRtlAppCdAllowedSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of dclscpsectb
	 *	@return dclscpsectb
	 */   
	 public Dclscpsectb getDclscpsectb() {
   	return dclscpsectb;
   }


	/**
	 *	Returns the value of hostAppCode05
	 *	@return hostAppCode05
	 */
   public char[] getHostAppCode05() throws CFException  {              
   		return applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().getHostAppCode05();
   }

  
	/**
	*  set variable hostAppCode05
	*  @param value
	**/
   public void setHostAppCode05(char[] value) throws CFException {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode05(value);
   } 

     /**
	 * 	Update HostAppCode05 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHostAppCode05(char[] source, int sourceIndex) throws CFException {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode05(source, sourceIndex);
   	
   }
   
   public void setHostAppCode05(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode05(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HostAppCode05 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCode05(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode05(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HostAppCode05 with another Field
	 *	@param value
	 */
   public void setHostAppCode05(Field source) {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode05(source);
   }  
   
     /**
	 * 	Update HostAppCode05 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHostAppCode05(Field source, int sourceIndex,int sourceLen) {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode05(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HostAppCode05 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCode05(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode05(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of hostAppCodeTbl
	 *	@return hostAppCodeTbl
	 */   
	 public HostAppCodeTbl getHostAppCodeTbl() {
   	return applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl();
   }

   /**
	* 	Update HostAppCodeTbl with the passed value
	*	@param value
	*/
   public void setHostAppCodeTbl(char[] value) throws CFException {
      applicationCodeListGroup.getHostAppCodeList().setHostAppCodeTbl(value);
   }   

     /**
	 * 	Update HostAppCodeTbl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setHostAppCodeTbl(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	applicationCodeListGroup.getHostAppCodeList().setHostAppCodeTbl(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HostAppCodeTbl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCodeTbl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	applicationCodeListGroup.getHostAppCodeList().setHostAppCodeTbl(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HostAppCodeTbl with another Field
	 *	@param value
	 */
   public void setHostAppCodeTbl(Field source) {
   	applicationCodeListGroup.getHostAppCodeList().setHostAppCodeTbl(source);
   }  
   
     /**
	 * 	Update HostAppCodeTbl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setHostAppCodeTbl(Field source, int sourceIndex,int sourceLen) {
   	applicationCodeListGroup.getHostAppCodeList().setHostAppCodeTbl(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HostAppCodeTbl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCodeTbl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	applicationCodeListGroup.getHostAppCodeList().setHostAppCodeTbl(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of scpsecSourceCd
	 *	@return scpsecSourceCd
	 */
   public char[] getScpsecSourceCd() throws CFException  {              
   		return dclscpsectb.getScpsecSourceCd();
   }

  
	/**
	*  set variable scpsecSourceCd
	*  @param value
	**/
   public void setScpsecSourceCd(char[] value) throws CFException {
      dclscpsectb.setScpsecSourceCd(value);
   } 

     /**
	 * 	Update ScpsecSourceCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setScpsecSourceCd(char[] source, int sourceIndex) throws CFException {
      dclscpsectb.setScpsecSourceCd(source, sourceIndex);
   	
   }
   
   public void setScpsecSourceCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclscpsectb.setScpsecSourceCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ScpsecSourceCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setScpsecSourceCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclscpsectb.setScpsecSourceCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ScpsecSourceCd with another Field
	 *	@param value
	 */
   public void setScpsecSourceCd(Field source) {
      dclscpsectb.setScpsecSourceCd(source);
   }  
   
     /**
	 * 	Update ScpsecSourceCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setScpsecSourceCd(Field source, int sourceIndex,int sourceLen) {
      dclscpsectb.setScpsecSourceCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ScpsecSourceCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setScpsecSourceCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclscpsectb.setScpsecSourceCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of scpsecPriceCd
	 *	@return scpsecPriceCd
	 */
   public char[] getScpsecPriceCd() throws CFException  {              
   		return dclscpsectb.getScpsecPriceCd();
   }

  
	/**
	*  set variable scpsecPriceCd
	*  @param value
	**/
   public void setScpsecPriceCd(char[] value) throws CFException {
      dclscpsectb.setScpsecPriceCd(value);
   } 

     /**
	 * 	Update ScpsecPriceCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setScpsecPriceCd(char[] source, int sourceIndex) throws CFException {
      dclscpsectb.setScpsecPriceCd(source, sourceIndex);
   	
   }
   
   public void setScpsecPriceCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclscpsectb.setScpsecPriceCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ScpsecPriceCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setScpsecPriceCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclscpsectb.setScpsecPriceCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ScpsecPriceCd with another Field
	 *	@param value
	 */
   public void setScpsecPriceCd(Field source) {
      dclscpsectb.setScpsecPriceCd(source);
   }  
   
     /**
	 * 	Update ScpsecPriceCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setScpsecPriceCd(Field source, int sourceIndex,int sourceLen) {
      dclscpsectb.setScpsecPriceCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ScpsecPriceCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setScpsecPriceCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclscpsectb.setScpsecPriceCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of hostAppCode01
	 *	@return hostAppCode01
	 */
   public char[] getHostAppCode01() throws CFException  {              
   		return applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().getHostAppCode01();
   }

  
	/**
	*  set variable hostAppCode01
	*  @param value
	**/
   public void setHostAppCode01(char[] value) throws CFException {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode01(value);
   } 

     /**
	 * 	Update HostAppCode01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHostAppCode01(char[] source, int sourceIndex) throws CFException {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode01(source, sourceIndex);
   	
   }
   
   public void setHostAppCode01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HostAppCode01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCode01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HostAppCode01 with another Field
	 *	@param value
	 */
   public void setHostAppCode01(Field source) {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode01(source);
   }  
   
     /**
	 * 	Update HostAppCode01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHostAppCode01(Field source, int sourceIndex,int sourceLen) {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HostAppCode01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCode01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hostVariables
	 *	@return hostVariables
	 */   
	 public HostVariables getHostVariables() {
   	return hostVariables;
   }


	/**
	 *	Returns the value of hostAppCode04
	 *	@return hostAppCode04
	 */
   public char[] getHostAppCode04() throws CFException  {              
   		return applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().getHostAppCode04();
   }

  
	/**
	*  set variable hostAppCode04
	*  @param value
	**/
   public void setHostAppCode04(char[] value) throws CFException {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode04(value);
   } 

     /**
	 * 	Update HostAppCode04 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHostAppCode04(char[] source, int sourceIndex) throws CFException {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode04(source, sourceIndex);
   	
   }
   
   public void setHostAppCode04(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode04(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HostAppCode04 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCode04(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode04(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HostAppCode04 with another Field
	 *	@param value
	 */
   public void setHostAppCode04(Field source) {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode04(source);
   }  
   
     /**
	 * 	Update HostAppCode04 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHostAppCode04(Field source, int sourceIndex,int sourceLen) {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode04(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HostAppCode04 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCode04(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode04(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hostAppCode03
	 *	@return hostAppCode03
	 */
   public char[] getHostAppCode03() throws CFException  {              
   		return applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().getHostAppCode03();
   }

  
	/**
	*  set variable hostAppCode03
	*  @param value
	**/
   public void setHostAppCode03(char[] value) throws CFException {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode03(value);
   } 

     /**
	 * 	Update HostAppCode03 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHostAppCode03(char[] source, int sourceIndex) throws CFException {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode03(source, sourceIndex);
   	
   }
   
   public void setHostAppCode03(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode03(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HostAppCode03 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCode03(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode03(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HostAppCode03 with another Field
	 *	@param value
	 */
   public void setHostAppCode03(Field source) {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode03(source);
   }  
   
     /**
	 * 	Update HostAppCode03 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHostAppCode03(Field source, int sourceIndex,int sourceLen) {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode03(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HostAppCode03 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCode03(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode03(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of rapAppCdAllowedSw
	 *	@return rapAppCdAllowedSw
	 */
   public char[] getRapAppCdAllowedSw() throws CFException  {              
   		return hostVariables.getRapAppCdAllowedSw();
   }

  
	/**
	*  set variable rapAppCdAllowedSw
	*  @param value
	**/
   public void setRapAppCdAllowedSw(char[] value) throws CFException {
      hostVariables.setRapAppCdAllowedSw(value);
   } 

     /**
	 * 	Update RapAppCdAllowedSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRapAppCdAllowedSw(char[] source, int sourceIndex) throws CFException {
      hostVariables.setRapAppCdAllowedSw(source, sourceIndex);
   	
   }
   
   public void setRapAppCdAllowedSw(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hostVariables.setRapAppCdAllowedSw(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RapAppCdAllowedSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRapAppCdAllowedSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hostVariables.setRapAppCdAllowedSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RapAppCdAllowedSw with another Field
	 *	@param value
	 */
   public void setRapAppCdAllowedSw(Field source) {
      hostVariables.setRapAppCdAllowedSw(source);
   }  
   
     /**
	 * 	Update RapAppCdAllowedSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRapAppCdAllowedSw(Field source, int sourceIndex,int sourceLen) {
      hostVariables.setRapAppCdAllowedSw(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RapAppCdAllowedSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRapAppCdAllowedSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hostVariables.setRapAppCdAllowedSw(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hostAppCode02
	 *	@return hostAppCode02
	 */
   public char[] getHostAppCode02() throws CFException  {              
   		return applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().getHostAppCode02();
   }

  
	/**
	*  set variable hostAppCode02
	*  @param value
	**/
   public void setHostAppCode02(char[] value) throws CFException {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode02(value);
   } 

     /**
	 * 	Update HostAppCode02 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHostAppCode02(char[] source, int sourceIndex) throws CFException {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode02(source, sourceIndex);
   	
   }
   
   public void setHostAppCode02(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode02(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HostAppCode02 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCode02(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode02(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HostAppCode02 with another Field
	 *	@param value
	 */
   public void setHostAppCode02(Field source) {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode02(source);
   }  
   
     /**
	 * 	Update HostAppCode02 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHostAppCode02(Field source, int sourceIndex,int sourceLen) {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode02(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HostAppCode02 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCode02(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      applicationCodeListGroup.getHostAppCodeList().getHostAppCodeTbl().setHostAppCode02(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of applicationCodeListGroup
	 *	@return applicationCodeListGroup
	 */   
	 public ApplicationCodeListGroup getApplicationCodeListGroup() {
   	return applicationCodeListGroup;
   }


	/**
	 *	Returns the value of scpsecAdpSecurityNo
	 *	@return scpsecAdpSecurityNo
	 */
   public char[] getScpsecAdpSecurityNo() throws CFException  {              
   		return dclscpsectb.getScpsecAdpSecurityNo();
   }

  
	/**
	*  set variable scpsecAdpSecurityNo
	*  @param value
	**/
   public void setScpsecAdpSecurityNo(char[] value) throws CFException {
      dclscpsectb.setScpsecAdpSecurityNo(value);
   } 

     /**
	 * 	Update ScpsecAdpSecurityNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setScpsecAdpSecurityNo(char[] source, int sourceIndex) throws CFException {
      dclscpsectb.setScpsecAdpSecurityNo(source, sourceIndex);
   	
   }
   
   public void setScpsecAdpSecurityNo(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclscpsectb.setScpsecAdpSecurityNo(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ScpsecAdpSecurityNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setScpsecAdpSecurityNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclscpsectb.setScpsecAdpSecurityNo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ScpsecAdpSecurityNo with another Field
	 *	@param value
	 */
   public void setScpsecAdpSecurityNo(Field source) {
      dclscpsectb.setScpsecAdpSecurityNo(source);
   }  
   
     /**
	 * 	Update ScpsecAdpSecurityNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setScpsecAdpSecurityNo(Field source, int sourceIndex,int sourceLen) {
      dclscpsectb.setScpsecAdpSecurityNo(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ScpsecAdpSecurityNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setScpsecAdpSecurityNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclscpsectb.setScpsecAdpSecurityNo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
        }

        public Cursor1OutCtx getCursor1OutCtx() {
            return new Cursor1OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += hostVariables.hashCode();
        str += sqlca.hashCode();
        str += dclscpsectb.hashCode();
        str += applicationCodeListGroup.hashCode();
       return str.hashCode();
    }

    public Cursor1InCtx clone() {
        Cursor1InCtx cloneObj = new Cursor1InCtx();
        cloneObj.hostVariables = new HostVariables();
        cloneObj.hostVariables.set(hostVariables.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.dclscpsectb = new Dclscpsectb();
        cloneObj.dclscpsectb.set(dclscpsectb.getClonedField());
        cloneObj.applicationCodeListGroup = new ApplicationCodeListGroup();
        cloneObj.applicationCodeListGroup.set(applicationCodeListGroup.getClonedField());
        return cloneObj;
    }

    }

    public Cursor1InCtx getCursor1InCtx() {
            return new Cursor1InCtx();
    }
     public class Cursor1OutCtx implements Cloneable {
     HostVariables hostVariables = Db2funciCtx.this.getHostVariables();
     Sqlca sqlca = Db2funciCtx.this.getSqlca();
     Dclscpsectb dclscpsectb = Db2funciCtx.this.getDclscpsectb();
     ApplicationCodeListGroup applicationCodeListGroup = Db2funciCtx.this.getApplicationCodeListGroup();

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
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



        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += hostVariables.hashCode();
        str += sqlca.hashCode();
        str += dclscpsectb.hashCode();
        str += applicationCodeListGroup.hashCode();
       return str.hashCode();
    }

    public Cursor1OutCtx clone() {
        Cursor1OutCtx cloneObj = new Cursor1OutCtx();
        cloneObj.hostVariables = new HostVariables();
        cloneObj.hostVariables.set(hostVariables.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.dclscpsectb = new Dclscpsectb();
        cloneObj.dclscpsectb.set(dclscpsectb.getClonedField());
        cloneObj.applicationCodeListGroup = new ApplicationCodeListGroup();
        cloneObj.applicationCodeListGroup.set(applicationCodeListGroup.getClonedField());
        return cloneObj;
    }

    }

    public Cursor1OutCtx getCursor1OutCtx() {
            return new Cursor1OutCtx();
    }
     public class DateSubstringCharInCtx implements Cloneable {
     DateFields dateFields = Db2funciCtx.this.getDateFields();
     Sqlca sqlca = Db2funciCtx.this.getSqlca();

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
	 *	Returns the value of dateFields
	 *	@return dateFields
	 */   
	 public DateFields getDateFields() {
   	return dateFields;
   }


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of lastDayDt
	 *	@return lastDayDt
	 */
   public char[] getLastDayDt() throws CFException  {              
   		return dateFields.getLastDayDt();
   }

  
	/**
	*  set variable lastDayDt
	*  @param value
	**/
   public void setLastDayDt(char[] value) throws CFException {
      dateFields.setLastDayDt(value);
   } 

     /**
	 * 	Update LastDayDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLastDayDt(char[] source, int sourceIndex) throws CFException {
      dateFields.setLastDayDt(source, sourceIndex);
   	
   }
   
   public void setLastDayDt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dateFields.setLastDayDt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LastDayDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLastDayDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dateFields.setLastDayDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LastDayDt with another Field
	 *	@param value
	 */
   public void setLastDayDt(Field source) {
      dateFields.setLastDayDt(source);
   }  
   
     /**
	 * 	Update LastDayDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLastDayDt(Field source, int sourceIndex,int sourceLen) {
      dateFields.setLastDayDt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LastDayDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLastDayDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dateFields.setLastDayDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
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


        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
        }

        public DateSubstringCharOutCtx getDateSubstringCharOutCtx() {
            return new DateSubstringCharOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dateFields.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public DateSubstringCharInCtx clone() {
        DateSubstringCharInCtx cloneObj = new DateSubstringCharInCtx();
        cloneObj.dateFields = new DateFields();
        cloneObj.dateFields.set(dateFields.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public DateSubstringCharInCtx getDateSubstringCharInCtx() {
            return new DateSubstringCharInCtx();
    }
     public class DateSubstringCharOutCtx implements Cloneable {
     DateFields dateFields = Db2funciCtx.this.getDateFields();
     Sqlca sqlca = Db2funciCtx.this.getSqlca();

	/**
	 *	Returns the value of dateFields
	 *	@return dateFields
	 */   
	 public DateFields getDateFields() {
   	return dateFields;
   }


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of currentDate
	 *	@return currentDate
	 */
   public char[] getCurrentDate() throws CFException  {              
   		return dateFields.getCurrentDate();
   }

  
	/**
	*  set variable currentDate
	*  @param value
	**/
   public void setCurrentDate(char[] value) throws CFException {
      dateFields.setCurrentDate(value);
   } 

     /**
	 * 	Update CurrentDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrentDate(char[] source, int sourceIndex) throws CFException {
      dateFields.setCurrentDate(source, sourceIndex);
   	
   }
   
   public void setCurrentDate(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dateFields.setCurrentDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrentDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrentDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dateFields.setCurrentDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrentDate with another Field
	 *	@param value
	 */
   public void setCurrentDate(Field source) {
      dateFields.setCurrentDate(source);
   }  
   
     /**
	 * 	Update CurrentDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrentDate(Field source, int sourceIndex,int sourceLen) {
      dateFields.setCurrentDate(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrentDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrentDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dateFields.setCurrentDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
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



        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dateFields.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public DateSubstringCharOutCtx clone() {
        DateSubstringCharOutCtx cloneObj = new DateSubstringCharOutCtx();
        cloneObj.dateFields = new DateFields();
        cloneObj.dateFields.set(dateFields.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public DateSubstringCharOutCtx getDateSubstringCharOutCtx() {
            return new DateSubstringCharOutCtx();
    }
     public class SecurityLookupInCtx implements Cloneable {
     Db2Indicators db2Indicators = Db2funciCtx.this.getDb2Indicators();
     Sqlca sqlca = Db2funciCtx.this.getSqlca();
     Bdms01CallParameters bdms01CallParameters = Db2funciCtx.this.getBdms01CallParameters();
     Dclvmstranb dclvmstranb = Db2funciCtx.this.getDclvmstranb();

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
	 *	Returns the value of symblTrdsWhiNull
	 *	@return symblTrdsWhiNull
	 */
	public short getSymblTrdsWhiNull() throws CFException {        
   		return db2Indicators.getSymblTrdsWhiNull();
	}
	
	/**
	 * 	Update SymblTrdsWhiNull with the passed value
	 *	@param number
	 */
	public void setSymblTrdsWhiNull(short number)  throws CFException{
		db2Indicators.setSymblTrdsWhiNull(number);
	}

	public void setSymblTrdsWhiNull(int number)  throws CFException{
		db2Indicators.setSymblTrdsWhiNull((short)number);
	}

	public void setSymblTrdsWhiNull(long number)  throws CFException{
		db2Indicators.setSymblTrdsWhiNull((short)number);
	}



	/**
	 *	Returns the value of cntryOrgnCd
	 *	@return cntryOrgnCd
	 */
   public char[] getCntryOrgnCd() throws CFException  {              
   		return dclvmstranb.getCntryOrgnCd();
   }

  
	/**
	*  set variable cntryOrgnCd
	*  @param value
	**/
   public void setCntryOrgnCd(char[] value) throws CFException {
      dclvmstranb.setCntryOrgnCd(value);
   } 

     /**
	 * 	Update CntryOrgnCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCntryOrgnCd(char[] source, int sourceIndex) throws CFException {
      dclvmstranb.setCntryOrgnCd(source, sourceIndex);
   	
   }
   
   public void setCntryOrgnCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclvmstranb.setCntryOrgnCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CntryOrgnCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCntryOrgnCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setCntryOrgnCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CntryOrgnCd with another Field
	 *	@param value
	 */
   public void setCntryOrgnCd(Field source) {
      dclvmstranb.setCntryOrgnCd(source);
   }  
   
     /**
	 * 	Update CntryOrgnCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCntryOrgnCd(Field source, int sourceIndex,int sourceLen) {
      dclvmstranb.setCntryOrgnCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CntryOrgnCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCntryOrgnCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setCntryOrgnCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tranCd
	 *	@return tranCd
	 */
   public char[] getTranCd() throws CFException  {              
   		return dclvmstranb.getTranCd();
   }

  
	/**
	*  set variable tranCd
	*  @param value
	**/
   public void setTranCd(char[] value) throws CFException {
      dclvmstranb.setTranCd(value);
   } 

     /**
	 * 	Update TranCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTranCd(char[] source, int sourceIndex) throws CFException {
      dclvmstranb.setTranCd(source, sourceIndex);
   	
   }
   
   public void setTranCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclvmstranb.setTranCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TranCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTranCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setTranCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TranCd with another Field
	 *	@param value
	 */
   public void setTranCd(Field source) {
      dclvmstranb.setTranCd(source);
   }  
   
     /**
	 * 	Update TranCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTranCd(Field source, int sourceIndex,int sourceLen) {
      dclvmstranb.setTranCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TranCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTranCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setTranCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of srceSetupSecCd
	 *	@return srceSetupSecCd
	 */
   public char[] getSrceSetupSecCd() throws CFException  {              
   		return dclvmstranb.getSrceSetupSecCd();
   }

  
	/**
	*  set variable srceSetupSecCd
	*  @param value
	**/
   public void setSrceSetupSecCd(char[] value) throws CFException {
      dclvmstranb.setSrceSetupSecCd(value);
   } 

     /**
	 * 	Update SrceSetupSecCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrceSetupSecCd(char[] source, int sourceIndex) throws CFException {
      dclvmstranb.setSrceSetupSecCd(source, sourceIndex);
   	
   }
   
   public void setSrceSetupSecCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclvmstranb.setSrceSetupSecCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SrceSetupSecCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrceSetupSecCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setSrceSetupSecCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SrceSetupSecCd with another Field
	 *	@param value
	 */
   public void setSrceSetupSecCd(Field source) {
      dclvmstranb.setSrceSetupSecCd(source);
   }  
   
     /**
	 * 	Update SrceSetupSecCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrceSetupSecCd(Field source, int sourceIndex,int sourceLen) {
      dclvmstranb.setSrceSetupSecCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SrceSetupSecCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrceSetupSecCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setSrceSetupSecCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getMcgillCd() throws CFException {  
        return dclvmstranb.getMcgillCd();
}
	/**
	 * 	Update McgillCd with the passed value
	 *	@param number
	 */
	public void setMcgillCd(int number)  throws CFException{
		dclvmstranb.setMcgillCd(number);
	}


	public void setMcgillCd(long number)  throws CFException{
	    dclvmstranb.setMcgillCd(number);
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
	 *	Returns the value of symblTrdsWhiCd
	 *	@return symblTrdsWhiCd
	 */
   public char[] getSymblTrdsWhiCd() throws CFException  {              
   		return dclvmstranb.getSymblTrdsWhiCd();
   }

  
	/**
	*  set variable symblTrdsWhiCd
	*  @param value
	**/
   public void setSymblTrdsWhiCd(char[] value) throws CFException {
      dclvmstranb.setSymblTrdsWhiCd(value);
   } 

     /**
	 * 	Update SymblTrdsWhiCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSymblTrdsWhiCd(char[] source, int sourceIndex) throws CFException {
      dclvmstranb.setSymblTrdsWhiCd(source, sourceIndex);
   	
   }
   
   public void setSymblTrdsWhiCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclvmstranb.setSymblTrdsWhiCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SymblTrdsWhiCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSymblTrdsWhiCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setSymblTrdsWhiCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SymblTrdsWhiCd with another Field
	 *	@param value
	 */
   public void setSymblTrdsWhiCd(Field source) {
      dclvmstranb.setSymblTrdsWhiCd(source);
   }  
   
     /**
	 * 	Update SymblTrdsWhiCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSymblTrdsWhiCd(Field source, int sourceIndex,int sourceLen) {
      dclvmstranb.setSymblTrdsWhiCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SymblTrdsWhiCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSymblTrdsWhiCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setSymblTrdsWhiCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of mtrlMdfdDtNull
	 *	@return mtrlMdfdDtNull
	 */
	public short getMtrlMdfdDtNull() throws CFException {        
   		return db2Indicators.getMtrlMdfdDtNull();
	}
	
	/**
	 * 	Update MtrlMdfdDtNull with the passed value
	 *	@param number
	 */
	public void setMtrlMdfdDtNull(short number)  throws CFException{
		db2Indicators.setMtrlMdfdDtNull(number);
	}

	public void setMtrlMdfdDtNull(int number)  throws CFException{
		db2Indicators.setMtrlMdfdDtNull((short)number);
	}

	public void setMtrlMdfdDtNull(long number)  throws CFException{
		db2Indicators.setMtrlMdfdDtNull((short)number);
	}



	/**
	 *	Returns the value of bdms01FatcaCdCalcInd
	 *	@return bdms01FatcaCdCalcInd
	 */
   public char[] getBdms01FatcaCdCalcInd() throws CFException  {              
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().getBdms01FatcaCdCalcInd();
   }

  
	/**
	*  set variable bdms01FatcaCdCalcInd
	*  @param value
	**/
   public void setBdms01FatcaCdCalcInd(char[] value) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01FatcaCdCalcInd(value);
   } 

     /**
	 * 	Update Bdms01FatcaCdCalcInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01FatcaCdCalcInd(char[] source, int sourceIndex) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01FatcaCdCalcInd(source, sourceIndex);
   	
   }
   
   public void setBdms01FatcaCdCalcInd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01FatcaCdCalcInd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Bdms01FatcaCdCalcInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FatcaCdCalcInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01FatcaCdCalcInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Bdms01FatcaCdCalcInd with another Field
	 *	@param value
	 */
   public void setBdms01FatcaCdCalcInd(Field source) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01FatcaCdCalcInd(source);
   }  
   
     /**
	 * 	Update Bdms01FatcaCdCalcInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01FatcaCdCalcInd(Field source, int sourceIndex,int sourceLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01FatcaCdCalcInd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Bdms01FatcaCdCalcInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FatcaCdCalcInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01FatcaCdCalcInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bdms01FatcaOvrrdCd
	 *	@return bdms01FatcaOvrrdCd
	 */
   public char[] getBdms01FatcaOvrrdCd() throws CFException  {              
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().getBdms01FatcaOvrrdCd();
   }

  
	/**
	*  set variable bdms01FatcaOvrrdCd
	*  @param value
	**/
   public void setBdms01FatcaOvrrdCd(char[] value) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01FatcaOvrrdCd(value);
   } 

     /**
	 * 	Update Bdms01FatcaOvrrdCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01FatcaOvrrdCd(char[] source, int sourceIndex) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01FatcaOvrrdCd(source, sourceIndex);
   	
   }
   
   public void setBdms01FatcaOvrrdCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01FatcaOvrrdCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Bdms01FatcaOvrrdCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FatcaOvrrdCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01FatcaOvrrdCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Bdms01FatcaOvrrdCd with another Field
	 *	@param value
	 */
   public void setBdms01FatcaOvrrdCd(Field source) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01FatcaOvrrdCd(source);
   }  
   
     /**
	 * 	Update Bdms01FatcaOvrrdCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01FatcaOvrrdCd(Field source, int sourceIndex,int sourceLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01FatcaOvrrdCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Bdms01FatcaOvrrdCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FatcaOvrrdCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01FatcaOvrrdCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of descSecTxt
	 *	@return descSecTxt
	 */
   public char[] getDescSecTxt() throws CFException  {              
   		return dclvmstranb.getDescSecTxt();
   }

  
	/**
	*  set variable descSecTxt
	*  @param value
	**/
   public void setDescSecTxt(char[] value) throws CFException {
      dclvmstranb.setDescSecTxt(value);
   } 

     /**
	 * 	Update DescSecTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDescSecTxt(char[] source, int sourceIndex) throws CFException {
      dclvmstranb.setDescSecTxt(source, sourceIndex);
   	
   }
   
   public void setDescSecTxt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclvmstranb.setDescSecTxt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DescSecTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDescSecTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setDescSecTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DescSecTxt with another Field
	 *	@param value
	 */
   public void setDescSecTxt(Field source) {
      dclvmstranb.setDescSecTxt(source);
   }  
   
     /**
	 * 	Update DescSecTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDescSecTxt(Field source, int sourceIndex,int sourceLen) {
      dclvmstranb.setDescSecTxt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DescSecTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDescSecTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setDescSecTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bdms01FatcaCd
	 *	@return bdms01FatcaCd
	 */
   public char[] getBdms01FatcaCd() throws CFException  {              
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().getBdms01FatcaCd();
   }

  
	/**
	*  set variable bdms01FatcaCd
	*  @param value
	**/
   public void setBdms01FatcaCd(char[] value) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01FatcaCd(value);
   } 

     /**
	 * 	Update Bdms01FatcaCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01FatcaCd(char[] source, int sourceIndex) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01FatcaCd(source, sourceIndex);
   	
   }
   
   public void setBdms01FatcaCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01FatcaCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Bdms01FatcaCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FatcaCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01FatcaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Bdms01FatcaCd with another Field
	 *	@param value
	 */
   public void setBdms01FatcaCd(Field source) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01FatcaCd(source);
   }  
   
     /**
	 * 	Update Bdms01FatcaCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01FatcaCd(Field source, int sourceIndex,int sourceLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01FatcaCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Bdms01FatcaCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01FatcaCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01FatcaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of classInd
	 *	@return classInd
	 */
   public char[] getClassInd() throws CFException  {              
   		return dclvmstranb.getClassInd();
   }

  
	/**
	*  set variable classInd
	*  @param value
	**/
   public void setClassInd(char[] value) throws CFException {
      dclvmstranb.setClassInd(value);
   } 

     /**
	 * 	Update ClassInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClassInd(char[] source, int sourceIndex) throws CFException {
      dclvmstranb.setClassInd(source, sourceIndex);
   	
   }
   
   public void setClassInd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclvmstranb.setClassInd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ClassInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClassInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setClassInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ClassInd with another Field
	 *	@param value
	 */
   public void setClassInd(Field source) {
      dclvmstranb.setClassInd(source);
   }  
   
     /**
	 * 	Update ClassInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClassInd(Field source, int sourceIndex,int sourceLen) {
      dclvmstranb.setClassInd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ClassInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClassInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setClassInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of symblTrdsAsCdNull
	 *	@return symblTrdsAsCdNull
	 */
	public short getSymblTrdsAsCdNull() throws CFException {        
   		return db2Indicators.getSymblTrdsAsCdNull();
	}
	
	/**
	 * 	Update SymblTrdsAsCdNull with the passed value
	 *	@param number
	 */
	public void setSymblTrdsAsCdNull(short number)  throws CFException{
		db2Indicators.setSymblTrdsAsCdNull(number);
	}

	public void setSymblTrdsAsCdNull(int number)  throws CFException{
		db2Indicators.setSymblTrdsAsCdNull((short)number);
	}

	public void setSymblTrdsAsCdNull(long number)  throws CFException{
		db2Indicators.setSymblTrdsAsCdNull((short)number);
	}



	/**
	 *	Returns the value of typeSecurityCd
	 *	@return typeSecurityCd
	 */
   public char[] getTypeSecurityCd() throws CFException  {              
   		return dclvmstranb.getTypeSecurityCd();
   }

  
	/**
	*  set variable typeSecurityCd
	*  @param value
	**/
   public void setTypeSecurityCd(char[] value) throws CFException {
      dclvmstranb.setTypeSecurityCd(value);
   } 

     /**
	 * 	Update TypeSecurityCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTypeSecurityCd(char[] source, int sourceIndex) throws CFException {
      dclvmstranb.setTypeSecurityCd(source, sourceIndex);
   	
   }
   
   public void setTypeSecurityCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclvmstranb.setTypeSecurityCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TypeSecurityCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTypeSecurityCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setTypeSecurityCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TypeSecurityCd with another Field
	 *	@param value
	 */
   public void setTypeSecurityCd(Field source) {
      dclvmstranb.setTypeSecurityCd(source);
   }  
   
     /**
	 * 	Update TypeSecurityCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTypeSecurityCd(Field source, int sourceIndex,int sourceLen) {
      dclvmstranb.setTypeSecurityCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TypeSecurityCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTypeSecurityCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setTypeSecurityCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bdms01MtrlMdfdDt
	 *	@return bdms01MtrlMdfdDt
	 */
   public char[] getBdms01MtrlMdfdDt() throws CFException  {              
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().getBdms01MtrlMdfdDt();
   }

  
	/**
	*  set variable bdms01MtrlMdfdDt
	*  @param value
	**/
   public void setBdms01MtrlMdfdDt(char[] value) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01MtrlMdfdDt(value);
   } 

     /**
	 * 	Update Bdms01MtrlMdfdDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01MtrlMdfdDt(char[] source, int sourceIndex) throws CFException {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01MtrlMdfdDt(source, sourceIndex);
   	
   }
   
   public void setBdms01MtrlMdfdDt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01MtrlMdfdDt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Bdms01MtrlMdfdDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MtrlMdfdDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01MtrlMdfdDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Bdms01MtrlMdfdDt with another Field
	 *	@param value
	 */
   public void setBdms01MtrlMdfdDt(Field source) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01MtrlMdfdDt(source);
   }  
   
     /**
	 * 	Update Bdms01MtrlMdfdDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01MtrlMdfdDt(Field source, int sourceIndex,int sourceLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01MtrlMdfdDt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Bdms01MtrlMdfdDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01MtrlMdfdDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bdms01CallParameters.getBdms01ReturnData().getBdms01AdpMasterExpData().setBdms01MtrlMdfdDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of clientNbrNull
	 *	@return clientNbrNull
	 */
	public short getClientNbrNull() throws CFException {        
   		return db2Indicators.getClientNbrNull();
	}
	
	/**
	 * 	Update ClientNbrNull with the passed value
	 *	@param number
	 */
	public void setClientNbrNull(short number)  throws CFException{
		db2Indicators.setClientNbrNull(number);
	}

	public void setClientNbrNull(int number)  throws CFException{
		db2Indicators.setClientNbrNull((short)number);
	}

	public void setClientNbrNull(long number)  throws CFException{
		db2Indicators.setClientNbrNull((short)number);
	}



	/**
	 *	Returns the value of addedTmstp
	 *	@return addedTmstp
	 */
   public char[] getAddedTmstp() throws CFException  {              
   		return dclvmstranb.getAddedTmstp();
   }

  
	/**
	*  set variable addedTmstp
	*  @param value
	**/
   public void setAddedTmstp(char[] value) throws CFException {
      dclvmstranb.setAddedTmstp(value);
   } 

     /**
	 * 	Update AddedTmstp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAddedTmstp(char[] source, int sourceIndex) throws CFException {
      dclvmstranb.setAddedTmstp(source, sourceIndex);
   	
   }
   
   public void setAddedTmstp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclvmstranb.setAddedTmstp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AddedTmstp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAddedTmstp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setAddedTmstp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AddedTmstp with another Field
	 *	@param value
	 */
   public void setAddedTmstp(Field source) {
      dclvmstranb.setAddedTmstp(source);
   }  
   
     /**
	 * 	Update AddedTmstp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAddedTmstp(Field source, int sourceIndex,int sourceLen) {
      dclvmstranb.setAddedTmstp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AddedTmstp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAddedTmstp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setAddedTmstp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of doNotUseDt
	 *	@return doNotUseDt
	 */
   public char[] getDoNotUseDt() throws CFException  {              
   		return dclvmstranb.getDoNotUseDt();
   }

  
	/**
	*  set variable doNotUseDt
	*  @param value
	**/
   public void setDoNotUseDt(char[] value) throws CFException {
      dclvmstranb.setDoNotUseDt(value);
   } 

     /**
	 * 	Update DoNotUseDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDoNotUseDt(char[] source, int sourceIndex) throws CFException {
      dclvmstranb.setDoNotUseDt(source, sourceIndex);
   	
   }
   
   public void setDoNotUseDt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclvmstranb.setDoNotUseDt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DoNotUseDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDoNotUseDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setDoNotUseDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DoNotUseDt with another Field
	 *	@param value
	 */
   public void setDoNotUseDt(Field source) {
      dclvmstranb.setDoNotUseDt(source);
   }  
   
     /**
	 * 	Update DoNotUseDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDoNotUseDt(Field source, int sourceIndex,int sourceLen) {
      dclvmstranb.setDoNotUseDt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DoNotUseDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDoNotUseDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setDoNotUseDt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of doNotUseDtNull
	 *	@return doNotUseDtNull
	 */
	public short getDoNotUseDtNull() throws CFException {        
   		return db2Indicators.getDoNotUseDtNull();
	}
	
	/**
	 * 	Update DoNotUseDtNull with the passed value
	 *	@param number
	 */
	public void setDoNotUseDtNull(short number)  throws CFException{
		db2Indicators.setDoNotUseDtNull(number);
	}

	public void setDoNotUseDtNull(int number)  throws CFException{
		db2Indicators.setDoNotUseDtNull((short)number);
	}

	public void setDoNotUseDtNull(long number)  throws CFException{
		db2Indicators.setDoNotUseDtNull((short)number);
	}



	/**
	 *	Returns the value of trmlCd
	 *	@return trmlCd
	 */
   public char[] getTrmlCd() throws CFException  {              
   		return dclvmstranb.getTrmlCd();
   }

  
	/**
	*  set variable trmlCd
	*  @param value
	**/
   public void setTrmlCd(char[] value) throws CFException {
      dclvmstranb.setTrmlCd(value);
   } 

     /**
	 * 	Update TrmlCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrmlCd(char[] source, int sourceIndex) throws CFException {
      dclvmstranb.setTrmlCd(source, sourceIndex);
   	
   }
   
   public void setTrmlCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclvmstranb.setTrmlCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TrmlCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrmlCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setTrmlCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TrmlCd with another Field
	 *	@param value
	 */
   public void setTrmlCd(Field source) {
      dclvmstranb.setTrmlCd(source);
   }  
   
     /**
	 * 	Update TrmlCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrmlCd(Field source, int sourceIndex,int sourceLen) {
      dclvmstranb.setTrmlCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TrmlCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrmlCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setTrmlCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bdms01CallParameters
	 *	@return bdms01CallParameters
	 */   
	 public Bdms01CallParameters getBdms01CallParameters() {
   	return bdms01CallParameters;
   }


	/**
	 *	Returns the value of dclvmstranb
	 *	@return dclvmstranb
	 */   
	 public Dclvmstranb getDclvmstranb() {
   	return dclvmstranb;
   }


	/**
	 *	Returns the value of mcgillCdNull
	 *	@return mcgillCdNull
	 */
	public short getMcgillCdNull() throws CFException {        
   		return db2Indicators.getMcgillCdNull();
	}
	
	/**
	 * 	Update McgillCdNull with the passed value
	 *	@param number
	 */
	public void setMcgillCdNull(short number)  throws CFException{
		db2Indicators.setMcgillCdNull(number);
	}

	public void setMcgillCdNull(int number)  throws CFException{
		db2Indicators.setMcgillCdNull((short)number);
	}

	public void setMcgillCdNull(long number)  throws CFException{
		db2Indicators.setMcgillCdNull((short)number);
	}



	/**
	 *	Returns the value of securityIdaCd
	 *	@return securityIdaCd
	 */
   public char[] getSecurityIdaCd() throws CFException  {              
   		return dclvmstranb.getSecurityIdaCd();
   }

  
	/**
	*  set variable securityIdaCd
	*  @param value
	**/
   public void setSecurityIdaCd(char[] value) throws CFException {
      dclvmstranb.setSecurityIdaCd(value);
   } 

     /**
	 * 	Update SecurityIdaCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecurityIdaCd(char[] source, int sourceIndex) throws CFException {
      dclvmstranb.setSecurityIdaCd(source, sourceIndex);
   	
   }
   
   public void setSecurityIdaCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclvmstranb.setSecurityIdaCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SecurityIdaCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecurityIdaCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setSecurityIdaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SecurityIdaCd with another Field
	 *	@param value
	 */
   public void setSecurityIdaCd(Field source) {
      dclvmstranb.setSecurityIdaCd(source);
   }  
   
     /**
	 * 	Update SecurityIdaCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecurityIdaCd(Field source, int sourceIndex,int sourceLen) {
      dclvmstranb.setSecurityIdaCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SecurityIdaCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecurityIdaCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setSecurityIdaCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of db2Indicators
	 *	@return db2Indicators
	 */   
	 public Db2Indicators getDb2Indicators() {
   	return db2Indicators;
   }


	/**
	 *	Returns the value of clientNbr
	 *	@return clientNbr
	 */
   public char[] getClientNbr() throws CFException  {              
   		return dclvmstranb.getClientNbr();
   }

  
	/**
	*  set variable clientNbr
	*  @param value
	**/
   public void setClientNbr(char[] value) throws CFException {
      dclvmstranb.setClientNbr(value);
   } 

     /**
	 * 	Update ClientNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClientNbr(char[] source, int sourceIndex) throws CFException {
      dclvmstranb.setClientNbr(source, sourceIndex);
   	
   }
   
   public void setClientNbr(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclvmstranb.setClientNbr(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ClientNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClientNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setClientNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ClientNbr with another Field
	 *	@param value
	 */
   public void setClientNbr(Field source) {
      dclvmstranb.setClientNbr(source);
   }  
   
     /**
	 * 	Update ClientNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClientNbr(Field source, int sourceIndex,int sourceLen) {
      dclvmstranb.setClientNbr(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ClientNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClientNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setClientNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of cntryIssueCd
	 *	@return cntryIssueCd
	 */
   public char[] getCntryIssueCd() throws CFException  {              
   		return dclvmstranb.getCntryIssueCd();
   }

  
	/**
	*  set variable cntryIssueCd
	*  @param value
	**/
   public void setCntryIssueCd(char[] value) throws CFException {
      dclvmstranb.setCntryIssueCd(value);
   } 

     /**
	 * 	Update CntryIssueCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCntryIssueCd(char[] source, int sourceIndex) throws CFException {
      dclvmstranb.setCntryIssueCd(source, sourceIndex);
   	
   }
   
   public void setCntryIssueCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclvmstranb.setCntryIssueCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CntryIssueCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCntryIssueCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setCntryIssueCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CntryIssueCd with another Field
	 *	@param value
	 */
   public void setCntryIssueCd(Field source) {
      dclvmstranb.setCntryIssueCd(source);
   }  
   
     /**
	 * 	Update CntryIssueCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCntryIssueCd(Field source, int sourceIndex,int sourceLen) {
      dclvmstranb.setCntryIssueCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CntryIssueCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCntryIssueCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setCntryIssueCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of symblTrdsAsCd
	 *	@return symblTrdsAsCd
	 */
   public char[] getSymblTrdsAsCd() throws CFException  {              
   		return dclvmstranb.getSymblTrdsAsCd();
   }

  
	/**
	*  set variable symblTrdsAsCd
	*  @param value
	**/
   public void setSymblTrdsAsCd(char[] value) throws CFException {
      dclvmstranb.setSymblTrdsAsCd(value);
   } 

     /**
	 * 	Update SymblTrdsAsCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSymblTrdsAsCd(char[] source, int sourceIndex) throws CFException {
      dclvmstranb.setSymblTrdsAsCd(source, sourceIndex);
   	
   }
   
   public void setSymblTrdsAsCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclvmstranb.setSymblTrdsAsCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SymblTrdsAsCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSymblTrdsAsCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setSymblTrdsAsCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SymblTrdsAsCd with another Field
	 *	@param value
	 */
   public void setSymblTrdsAsCd(Field source) {
      dclvmstranb.setSymblTrdsAsCd(source);
   }  
   
     /**
	 * 	Update SymblTrdsAsCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSymblTrdsAsCd(Field source, int sourceIndex,int sourceLen) {
      dclvmstranb.setSymblTrdsAsCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SymblTrdsAsCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSymblTrdsAsCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setSymblTrdsAsCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of cusipCntraNbr
	 *	@return cusipCntraNbr
	 */
   public char[] getCusipCntraNbr() throws CFException  {              
   		return dclvmstranb.getCusipCntraNbr();
   }

  
	/**
	*  set variable cusipCntraNbr
	*  @param value
	**/
   public void setCusipCntraNbr(char[] value) throws CFException {
      dclvmstranb.setCusipCntraNbr(value);
   } 

     /**
	 * 	Update CusipCntraNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCusipCntraNbr(char[] source, int sourceIndex) throws CFException {
      dclvmstranb.setCusipCntraNbr(source, sourceIndex);
   	
   }
   
   public void setCusipCntraNbr(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclvmstranb.setCusipCntraNbr(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CusipCntraNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCusipCntraNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setCusipCntraNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CusipCntraNbr with another Field
	 *	@param value
	 */
   public void setCusipCntraNbr(Field source) {
      dclvmstranb.setCusipCntraNbr(source);
   }  
   
     /**
	 * 	Update CusipCntraNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCusipCntraNbr(Field source, int sourceIndex,int sourceLen) {
      dclvmstranb.setCusipCntraNbr(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CusipCntraNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCusipCntraNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setCusipCntraNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of secLckdInd
	 *	@return secLckdInd
	 */
   public char[] getSecLckdInd() throws CFException  {              
   		return dclvmstranb.getSecLckdInd();
   }

  
	/**
	*  set variable secLckdInd
	*  @param value
	**/
   public void setSecLckdInd(char[] value) throws CFException {
      dclvmstranb.setSecLckdInd(value);
   } 

     /**
	 * 	Update SecLckdInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecLckdInd(char[] source, int sourceIndex) throws CFException {
      dclvmstranb.setSecLckdInd(source, sourceIndex);
   	
   }
   
   public void setSecLckdInd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclvmstranb.setSecLckdInd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SecLckdInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecLckdInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setSecLckdInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SecLckdInd with another Field
	 *	@param value
	 */
   public void setSecLckdInd(Field source) {
      dclvmstranb.setSecLckdInd(source);
   }  
   
     /**
	 * 	Update SecLckdInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecLckdInd(Field source, int sourceIndex,int sourceLen) {
      dclvmstranb.setSecLckdInd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SecLckdInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecLckdInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setSecLckdInd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of cusipCntraNbrNull
	 *	@return cusipCntraNbrNull
	 */
	public short getCusipCntraNbrNull() throws CFException {        
   		return db2Indicators.getCusipCntraNbrNull();
	}
	
	/**
	 * 	Update CusipCntraNbrNull with the passed value
	 *	@param number
	 */
	public void setCusipCntraNbrNull(short number)  throws CFException{
		db2Indicators.setCusipCntraNbrNull(number);
	}

	public void setCusipCntraNbrNull(int number)  throws CFException{
		db2Indicators.setCusipCntraNbrNull((short)number);
	}

	public void setCusipCntraNbrNull(long number)  throws CFException{
		db2Indicators.setCusipCntraNbrNull((short)number);
	}




        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
        }

        public SecurityLookupOutCtx getSecurityLookupOutCtx() {
            return new SecurityLookupOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += db2Indicators.hashCode();
        str += sqlca.hashCode();
        str += bdms01CallParameters.hashCode();
        str += dclvmstranb.hashCode();
       return str.hashCode();
    }

    public SecurityLookupInCtx clone() {
        SecurityLookupInCtx cloneObj = new SecurityLookupInCtx();
        cloneObj.db2Indicators = new Db2Indicators();
        cloneObj.db2Indicators.set(db2Indicators.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.bdms01CallParameters = new Bdms01CallParameters();
        cloneObj.bdms01CallParameters.set(bdms01CallParameters.getClonedField());
        cloneObj.dclvmstranb = new Dclvmstranb();
        cloneObj.dclvmstranb.set(dclvmstranb.getClonedField());
        return cloneObj;
    }

    }

    public SecurityLookupInCtx getSecurityLookupInCtx() {
            return new SecurityLookupInCtx();
    }
     public class SecurityLookupOutCtx implements Cloneable {
     Db2Indicators db2Indicators = Db2funciCtx.this.getDb2Indicators();
     Sqlca sqlca = Db2funciCtx.this.getSqlca();
     Bdms01CallParameters bdms01CallParameters = Db2funciCtx.this.getBdms01CallParameters();
     Dclvmstranb dclvmstranb = Db2funciCtx.this.getDclvmstranb();

	/**
	 *	Returns the value of securityAdpNbr
	 *	@return securityAdpNbr
	 */
   public char[] getSecurityAdpNbr() throws CFException  {              
   		return dclvmstranb.getSecurityAdpNbr();
   }

  
	/**
	*  set variable securityAdpNbr
	*  @param value
	**/
   public void setSecurityAdpNbr(char[] value) throws CFException {
      dclvmstranb.setSecurityAdpNbr(value);
   } 

     /**
	 * 	Update SecurityAdpNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecurityAdpNbr(char[] source, int sourceIndex) throws CFException {
      dclvmstranb.setSecurityAdpNbr(source, sourceIndex);
   	
   }
   
   public void setSecurityAdpNbr(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclvmstranb.setSecurityAdpNbr(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SecurityAdpNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecurityAdpNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setSecurityAdpNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SecurityAdpNbr with another Field
	 *	@param value
	 */
   public void setSecurityAdpNbr(Field source) {
      dclvmstranb.setSecurityAdpNbr(source);
   }  
   
     /**
	 * 	Update SecurityAdpNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecurityAdpNbr(Field source, int sourceIndex,int sourceLen) {
      dclvmstranb.setSecurityAdpNbr(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SecurityAdpNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecurityAdpNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmstranb.setSecurityAdpNbr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of db2Indicators
	 *	@return db2Indicators
	 */   
	 public Db2Indicators getDb2Indicators() {
   	return db2Indicators;
   }


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of bdms01CallParameters
	 *	@return bdms01CallParameters
	 */   
	 public Bdms01CallParameters getBdms01CallParameters() {
   	return bdms01CallParameters;
   }


	/**
	 *	Returns the value of dclvmstranb
	 *	@return dclvmstranb
	 */   
	 public Dclvmstranb getDclvmstranb() {
   	return dclvmstranb;
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



        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += db2Indicators.hashCode();
        str += sqlca.hashCode();
        str += bdms01CallParameters.hashCode();
        str += dclvmstranb.hashCode();
       return str.hashCode();
    }

    public SecurityLookupOutCtx clone() {
        SecurityLookupOutCtx cloneObj = new SecurityLookupOutCtx();
        cloneObj.db2Indicators = new Db2Indicators();
        cloneObj.db2Indicators.set(db2Indicators.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.bdms01CallParameters = new Bdms01CallParameters();
        cloneObj.bdms01CallParameters.set(bdms01CallParameters.getClonedField());
        cloneObj.dclvmstranb = new Dclvmstranb();
        cloneObj.dclvmstranb.set(dclvmstranb.getClonedField());
        return cloneObj;
    }

    }

    public SecurityLookupOutCtx getSecurityLookupOutCtx() {
            return new SecurityLookupOutCtx();
    }
     public class CurrencyInCtx implements Cloneable {
     Dclvcrrexrt dclvcrrexrt = Db2funciCtx.this.getDclvcrrexrt();
     Work work = Db2funciCtx.this.getWork();
     Sqlca sqlca = Db2funciCtx.this.getSqlca();

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
	 *	Returns the value of dclvcrrexrt
	 *	@return dclvcrrexrt
	 */   
	 public Dclvcrrexrt getDclvcrrexrt() {
   	return dclvcrrexrt;
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

	/**
	 *	Returns the value of exchangeRateAmt
	 *	@return exchangeRateAmt
	 */
   public BigDecimal getExchangeRateAmt() throws CFException {
   	return dclvcrrexrt.getExchangeRateAmt();
   }

  
	/**
	*  set variable exchangeRateAmt
	*  @param value
	**/
   public void setExchangeRateAmt(BigDecimal value)  throws CFException{
	dclvcrrexrt.setExchangeRateAmt(value);
   } 
	
	


        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
        }

        public CurrencyOutCtx getCurrencyOutCtx() {
            return new CurrencyOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dclvcrrexrt.hashCode();
        str += work.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public CurrencyInCtx clone() {
        CurrencyInCtx cloneObj = new CurrencyInCtx();
        cloneObj.dclvcrrexrt = new Dclvcrrexrt();
        cloneObj.dclvcrrexrt.set(dclvcrrexrt.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public CurrencyInCtx getCurrencyInCtx() {
            return new CurrencyInCtx();
    }
     public class CurrencyOutCtx implements Cloneable {
     Dclvcrrexrt dclvcrrexrt = Db2funciCtx.this.getDclvcrrexrt();
     Work work = Db2funciCtx.this.getWork();
     Sqlca sqlca = Db2funciCtx.this.getSqlca();

	/**
	 *	Returns the value of dclvcrrexrt
	 *	@return dclvcrrexrt
	 */   
	 public Dclvcrrexrt getDclvcrrexrt() {
   	return dclvcrrexrt;
   }


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of decimalEdit
	 *	@return decimalEdit
	 */
   public char[] getDecimalEdit() throws CFException  {              
   		return work.getDecimalEdit();
   }

  
	/**
	*  set variable decimalEdit
	*  @param value
	**/
   public void setDecimalEdit(char[] value) throws CFException {
      work.setDecimalEdit(value);
   } 

     /**
	 * 	Update DecimalEdit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDecimalEdit(char[] source, int sourceIndex) throws CFException {
      work.setDecimalEdit(source, sourceIndex);
   	
   }
   
   public void setDecimalEdit(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setDecimalEdit(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DecimalEdit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDecimalEdit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setDecimalEdit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DecimalEdit with another Field
	 *	@param value
	 */
   public void setDecimalEdit(Field source) {
      work.setDecimalEdit(source);
   }  
   
     /**
	 * 	Update DecimalEdit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDecimalEdit(Field source, int sourceIndex,int sourceLen) {
      work.setDecimalEdit(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DecimalEdit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDecimalEdit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setDecimalEdit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currencyCd
	 *	@return currencyCd
	 */
   public char[] getCurrencyCd() throws CFException  {              
   		return dclvcrrexrt.getCurrencyCd();
   }

  
	/**
	*  set variable currencyCd
	*  @param value
	**/
   public void setCurrencyCd(char[] value) throws CFException {
      dclvcrrexrt.setCurrencyCd(value);
   } 

     /**
	 * 	Update CurrencyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrencyCd(char[] source, int sourceIndex) throws CFException {
      dclvcrrexrt.setCurrencyCd(source, sourceIndex);
   	
   }
   
   public void setCurrencyCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclvcrrexrt.setCurrencyCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrencyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrencyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvcrrexrt.setCurrencyCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrencyCd with another Field
	 *	@param value
	 */
   public void setCurrencyCd(Field source) {
      dclvcrrexrt.setCurrencyCd(source);
   }  
   
     /**
	 * 	Update CurrencyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrencyCd(Field source, int sourceIndex,int sourceLen) {
      dclvcrrexrt.setCurrencyCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrencyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrencyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvcrrexrt.setCurrencyCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of exchangeRateAmt
	 *	@return exchangeRateAmt
	 */
   public BigDecimal getExchangeRateAmt() throws CFException {
   	return dclvcrrexrt.getExchangeRateAmt();
   }

  
	/**
	*  set variable exchangeRateAmt
	*  @param value
	**/
   public void setExchangeRateAmt(BigDecimal value)  throws CFException{
	dclvcrrexrt.setExchangeRateAmt(value);
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



        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dclvcrrexrt.hashCode();
        str += work.hashCode();
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public CurrencyOutCtx clone() {
        CurrencyOutCtx cloneObj = new CurrencyOutCtx();
        cloneObj.dclvcrrexrt = new Dclvcrrexrt();
        cloneObj.dclvcrrexrt.set(dclvcrrexrt.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public CurrencyOutCtx getCurrencyOutCtx() {
            return new CurrencyOutCtx();
    }
     public class XrefCursorInCtx implements Cloneable {
     Sqlca sqlca = Db2funciCtx.this.getSqlca();
     Dclvmsdxrfk dclvmsdxrfk = Db2funciCtx.this.getDclvmsdxrfk();

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

	/**
	 *	Returns the value of dclvmsdxrfk
	 *	@return dclvmsdxrfk
	 */   
	 public Dclvmsdxrfk getDclvmsdxrfk() {
   	return dclvmsdxrfk;
   }


	/**
	 *	Returns the value of crossReferenceCd
	 *	@return crossReferenceCd
	 */
   public char[] getCrossReferenceCd() throws CFException  {              
   		return dclvmsdxrfk.getCrossReferenceCd();
   }

  
	/**
	*  set variable crossReferenceCd
	*  @param value
	**/
   public void setCrossReferenceCd(char[] value) throws CFException {
      dclvmsdxrfk.setCrossReferenceCd(value);
   } 

     /**
	 * 	Update CrossReferenceCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCrossReferenceCd(char[] source, int sourceIndex) throws CFException {
      dclvmsdxrfk.setCrossReferenceCd(source, sourceIndex);
   	
   }
   
   public void setCrossReferenceCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclvmsdxrfk.setCrossReferenceCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CrossReferenceCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCrossReferenceCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmsdxrfk.setCrossReferenceCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CrossReferenceCd with another Field
	 *	@param value
	 */
   public void setCrossReferenceCd(Field source) {
      dclvmsdxrfk.setCrossReferenceCd(source);
   }  
   
     /**
	 * 	Update CrossReferenceCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCrossReferenceCd(Field source, int sourceIndex,int sourceLen) {
      dclvmsdxrfk.setCrossReferenceCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CrossReferenceCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCrossReferenceCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmsdxrfk.setCrossReferenceCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of typeXrefCd
	 *	@return typeXrefCd
	 */
   public char[] getTypeXrefCd() throws CFException  {              
   		return dclvmsdxrfk.getTypeXrefCd();
   }

  
	/**
	*  set variable typeXrefCd
	*  @param value
	**/
   public void setTypeXrefCd(char[] value) throws CFException {
      dclvmsdxrfk.setTypeXrefCd(value);
   } 

     /**
	 * 	Update TypeXrefCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTypeXrefCd(char[] source, int sourceIndex) throws CFException {
      dclvmsdxrfk.setTypeXrefCd(source, sourceIndex);
   	
   }
   
   public void setTypeXrefCd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclvmsdxrfk.setTypeXrefCd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TypeXrefCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTypeXrefCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmsdxrfk.setTypeXrefCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TypeXrefCd with another Field
	 *	@param value
	 */
   public void setTypeXrefCd(Field source) {
      dclvmsdxrfk.setTypeXrefCd(source);
   }  
   
     /**
	 * 	Update TypeXrefCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTypeXrefCd(Field source, int sourceIndex,int sourceLen) {
      dclvmsdxrfk.setTypeXrefCd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TypeXrefCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTypeXrefCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmsdxrfk.setTypeXrefCd(source, sourceIndex, sourceLen, targetIndex, targetLen);
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



        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
        }

        public XrefCursorOutCtx getXrefCursorOutCtx() {
            return new XrefCursorOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlca.hashCode();
        str += dclvmsdxrfk.hashCode();
       return str.hashCode();
    }

    public XrefCursorInCtx clone() {
        XrefCursorInCtx cloneObj = new XrefCursorInCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.dclvmsdxrfk = new Dclvmsdxrfk();
        cloneObj.dclvmsdxrfk.set(dclvmsdxrfk.getClonedField());
        return cloneObj;
    }

    }

    public XrefCursorInCtx getXrefCursorInCtx() {
            return new XrefCursorInCtx();
    }
     public class XrefCursorOutCtx implements Cloneable {
     Sqlca sqlca = Db2funciCtx.this.getSqlca();
     Dclvmsdxrfk dclvmsdxrfk = Db2funciCtx.this.getDclvmsdxrfk();

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of dclvmsdxrfk
	 *	@return dclvmsdxrfk
	 */   
	 public Dclvmsdxrfk getDclvmsdxrfk() {
   	return dclvmsdxrfk;
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
	 *	Returns the value of securityAdpNbr01
	 *	@return securityAdpNbr01
	 */
   public char[] getSecurityAdpNbr01() throws CFException  {              
   		return dclvmsdxrfk.getSecurityAdpNbr01();
   }

  
	/**
	*  set variable securityAdpNbr01
	*  @param value
	**/
   public void setSecurityAdpNbr01(char[] value) throws CFException {
      dclvmsdxrfk.setSecurityAdpNbr01(value);
   } 

     /**
	 * 	Update SecurityAdpNbr01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSecurityAdpNbr01(char[] source, int sourceIndex) throws CFException {
      dclvmsdxrfk.setSecurityAdpNbr01(source, sourceIndex);
   	
   }
   
   public void setSecurityAdpNbr01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dclvmsdxrfk.setSecurityAdpNbr01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SecurityAdpNbr01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSecurityAdpNbr01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmsdxrfk.setSecurityAdpNbr01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SecurityAdpNbr01 with another Field
	 *	@param value
	 */
   public void setSecurityAdpNbr01(Field source) {
      dclvmsdxrfk.setSecurityAdpNbr01(source);
   }  
   
     /**
	 * 	Update SecurityAdpNbr01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSecurityAdpNbr01(Field source, int sourceIndex,int sourceLen) {
      dclvmsdxrfk.setSecurityAdpNbr01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SecurityAdpNbr01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSecurityAdpNbr01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dclvmsdxrfk.setSecurityAdpNbr01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sqlca.hashCode();
        str += dclvmsdxrfk.hashCode();
       return str.hashCode();
    }

    public XrefCursorOutCtx clone() {
        XrefCursorOutCtx cloneObj = new XrefCursorOutCtx();
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.dclvmsdxrfk = new Dclvmsdxrfk();
        cloneObj.dclvmsdxrfk.set(dclvmsdxrfk.getClonedField());
        return cloneObj;
    }

    }

    public XrefCursorOutCtx getXrefCursorOutCtx() {
            return new XrefCursorOutCtx();
    }
     public class IsinInCtx implements Cloneable {
     Work work = Db2funciCtx.this.getWork();
     Sqlca sqlca = Db2funciCtx.this.getSqlca();
     Dcltbdemsec dcltbdemsec = Db2funciCtx.this.getDcltbdemsec();

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
	 *	Returns the value of industry
	 *	@return industry
	 */
   public char[] getIndustry() throws CFException  {              
   		return dcltbdemsec.getIndustry();
   }

  
	/**
	*  set variable industry
	*  @param value
	**/
   public void setIndustry(char[] value) throws CFException {
      dcltbdemsec.setIndustry(value);
   } 

     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setIndustry(source, sourceIndex);
   	
   }
   
   public void setIndustry(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setIndustry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setIndustry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Industry with another Field
	 *	@param value
	 */
   public void setIndustry(Field source) {
      dcltbdemsec.setIndustry(source);
   }  
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setIndustry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setIndustry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of intlkey01
	 *	@return intlkey01
	 */
   public char[] getIntlkey01() throws CFException  {              
   		return dcltbdemsec.getIntlkey01();
   }

  
	/**
	*  set variable intlkey01
	*  @param value
	**/
   public void setIntlkey01(char[] value) throws CFException {
      dcltbdemsec.setIntlkey01(value);
   } 

     /**
	 * 	Update Intlkey01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIntlkey01(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setIntlkey01(source, sourceIndex);
   	
   }
   
   public void setIntlkey01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setIntlkey01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Intlkey01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setIntlkey01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Intlkey01 with another Field
	 *	@param value
	 */
   public void setIntlkey01(Field source) {
      dcltbdemsec.setIntlkey01(source);
   }  
   
     /**
	 * 	Update Intlkey01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIntlkey01(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setIntlkey01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Intlkey01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setIntlkey01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of dcltbdemsec
	 *	@return dcltbdemsec
	 */   
	 public Dcltbdemsec getDcltbdemsec() {
   	return dcltbdemsec;
   }


	/**
	 *	Returns the value of country01
	 *	@return country01
	 */
   public char[] getCountry01() throws CFException  {              
   		return dcltbdemsec.getCountry01();
   }

  
	/**
	*  set variable country01
	*  @param value
	**/
   public void setCountry01(char[] value) throws CFException {
      dcltbdemsec.setCountry01(value);
   } 

     /**
	 * 	Update Country01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry01(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setCountry01(source, sourceIndex);
   	
   }
   
   public void setCountry01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setCountry01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Country01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setCountry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Country01 with another Field
	 *	@param value
	 */
   public void setCountry01(Field source) {
      dcltbdemsec.setCountry01(source);
   }  
   
     /**
	 * 	Update Country01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry01(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setCountry01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Country01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setCountry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of isinCnt
	 *	@return isinCnt
	 */
	public long getIsinCnt() throws CFException {
   		return work.getIsinCnt();
	}


	/**
	 *	Returns String value of isinCnt
	 *	@return isinCnt
	 */
	public char[]  getIsinCntString() throws CFException {
	     return String.valueOf(work.getIsinCntString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean isinCntIsNumeric()  throws CFException{
	    return work.isinCntIsNumeric();
	}

	/**
	 * 	Update IsinCnt with the passed value
	 *	@param number
	 */
	public void setIsinCnt(long number)  throws CFException{
		work.setIsinCnt(number);
	}
	

	
	/**
	 * 	Update IsinCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setIsinCnt(char[] value)  throws CFException {
		work.setIsinCnt(value);
	}
	
	/**
	 * 	Update IsinCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIsinCntString(char[] value)  throws CFException{
		work.setIsinCnt(value);
	}	

	/**
	 *	Returns the value of isin01
	 *	@return isin01
	 */
   public char[] getIsin01() throws CFException  {              
   		return dcltbdemsec.getIsin01();
   }

  
	/**
	*  set variable isin01
	*  @param value
	**/
   public void setIsin01(char[] value) throws CFException {
      dcltbdemsec.setIsin01(value);
   } 

     /**
	 * 	Update Isin01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsin01(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setIsin01(source, sourceIndex);
   	
   }
   
   public void setIsin01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setIsin01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Isin01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsin01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setIsin01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Isin01 with another Field
	 *	@param value
	 */
   public void setIsin01(Field source) {
      dcltbdemsec.setIsin01(source);
   }  
   
     /**
	 * 	Update Isin01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsin01(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setIsin01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Isin01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsin01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setIsin01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of company01
	 *	@return company01
	 */
   public char[] getCompany01() throws CFException  {              
   		return dcltbdemsec.getCompany01();
   }

  
	/**
	*  set variable company01
	*  @param value
	**/
   public void setCompany01(char[] value) throws CFException {
      dcltbdemsec.setCompany01(value);
   } 

     /**
	 * 	Update Company01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompany01(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setCompany01(source, sourceIndex);
   	
   }
   
   public void setCompany01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setCompany01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Company01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompany01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setCompany01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Company01 with another Field
	 *	@param value
	 */
   public void setCompany01(Field source) {
      dcltbdemsec.setCompany01(source);
   }  
   
     /**
	 * 	Update Company01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompany01(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setCompany01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Company01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompany01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setCompany01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ric01
	 *	@return ric01
	 */
   public char[] getRic01() throws CFException  {              
   		return dcltbdemsec.getRic01();
   }

  
	/**
	*  set variable ric01
	*  @param value
	**/
   public void setRic01(char[] value) throws CFException {
      dcltbdemsec.setRic01(value);
   } 

     /**
	 * 	Update Ric01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRic01(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setRic01(source, sourceIndex);
   	
   }
   
   public void setRic01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setRic01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ric01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRic01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setRic01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ric01 with another Field
	 *	@param value
	 */
   public void setRic01(Field source) {
      dcltbdemsec.setRic01(source);
   }  
   
     /**
	 * 	Update Ric01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRic01(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setRic01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ric01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRic01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setRic01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sedol01
	 *	@return sedol01
	 */
   public char[] getSedol01() throws CFException  {              
   		return dcltbdemsec.getSedol01();
   }

  
	/**
	*  set variable sedol01
	*  @param value
	**/
   public void setSedol01(char[] value) throws CFException {
      dcltbdemsec.setSedol01(value);
   } 

     /**
	 * 	Update Sedol01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSedol01(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setSedol01(source, sourceIndex);
   	
   }
   
   public void setSedol01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setSedol01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sedol01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSedol01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setSedol01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sedol01 with another Field
	 *	@param value
	 */
   public void setSedol01(Field source) {
      dcltbdemsec.setSedol01(source);
   }  
   
     /**
	 * 	Update Sedol01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSedol01(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setSedol01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sedol01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSedol01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setSedol01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ffmcapmilusd
	 *	@return ffmcapmilusd
	 */
	public int getFfmcapmilusd() throws CFException {        
   		return dcltbdemsec.getFfmcapmilusd();
	}
	
	/**
	 * 	Update Ffmcapmilusd with the passed value
	 *	@param number
	 */
	public void setFfmcapmilusd(int number)  throws CFException{
		dcltbdemsec.setFfmcapmilusd(number);
	}


	public void setFfmcapmilusd(long number)  throws CFException{
		dcltbdemsec.setFfmcapmilusd((int)number);
	}


	/**
	 *	Returns the value of sector
	 *	@return sector
	 */
   public char[] getSector() throws CFException  {              
   		return dcltbdemsec.getSector();
   }

  
	/**
	*  set variable sector
	*  @param value
	**/
   public void setSector(char[] value) throws CFException {
      dcltbdemsec.setSector(value);
   } 

     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setSector(source, sourceIndex);
   	
   }
   
   public void setSector(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setSector(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setSector(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sector with another Field
	 *	@param value
	 */
   public void setSector(Field source) {
      dcltbdemsec.setSector(source);
   }  
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setSector(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setSector(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sectorweight
	 *	@return sectorweight
	 */
   public char[] getSectorweight() throws CFException  {              
   		return dcltbdemsec.getSectorweight();
   }

  
	/**
	*  set variable sectorweight
	*  @param value
	**/
   public void setSectorweight(char[] value) throws CFException {
      dcltbdemsec.setSectorweight(value);
   } 

     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setSectorweight(source, sourceIndex);
   	
   }
   
   public void setSectorweight(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setSectorweight(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setSectorweight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sectorweight with another Field
	 *	@param value
	 */
   public void setSectorweight(Field source) {
      dcltbdemsec.setSectorweight(source);
   }  
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setSectorweight(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setSectorweight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
        }

        public IsinOutCtx getIsinOutCtx() {
            return new IsinOutCtx();
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
        str += sqlca.hashCode();
        str += dcltbdemsec.hashCode();
       return str.hashCode();
    }

    public IsinInCtx clone() {
        IsinInCtx cloneObj = new IsinInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.dcltbdemsec = new Dcltbdemsec();
        cloneObj.dcltbdemsec.set(dcltbdemsec.getClonedField());
        return cloneObj;
    }

    }

    public IsinInCtx getIsinInCtx() {
            return new IsinInCtx();
    }
     public class IsinOutCtx implements Cloneable {
     Work work = Db2funciCtx.this.getWork();
     Sqlca sqlca = Db2funciCtx.this.getSqlca();
     Dcltbdemsec dcltbdemsec = Db2funciCtx.this.getDcltbdemsec();

	/**
	 *	Returns the value of isinCnt
	 *	@return isinCnt
	 */
	public long getIsinCnt() throws CFException {
   		return work.getIsinCnt();
	}


	/**
	 *	Returns String value of isinCnt
	 *	@return isinCnt
	 */
	public char[]  getIsinCntString() throws CFException {
	     return String.valueOf(work.getIsinCntString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean isinCntIsNumeric()  throws CFException{
	    return work.isinCntIsNumeric();
	}

	/**
	 * 	Update IsinCnt with the passed value
	 *	@param number
	 */
	public void setIsinCnt(long number)  throws CFException{
		work.setIsinCnt(number);
	}
	

	
	/**
	 * 	Update IsinCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setIsinCnt(char[] value)  throws CFException {
		work.setIsinCnt(value);
	}
	
	/**
	 * 	Update IsinCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIsinCntString(char[] value)  throws CFException{
		work.setIsinCnt(value);
	}	

	/**
	 *	Returns the value of isin01
	 *	@return isin01
	 */
   public char[] getIsin01() throws CFException  {              
   		return dcltbdemsec.getIsin01();
   }

  
	/**
	*  set variable isin01
	*  @param value
	**/
   public void setIsin01(char[] value) throws CFException {
      dcltbdemsec.setIsin01(value);
   } 

     /**
	 * 	Update Isin01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsin01(char[] source, int sourceIndex) throws CFException {
      dcltbdemsec.setIsin01(source, sourceIndex);
   	
   }
   
   public void setIsin01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dcltbdemsec.setIsin01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Isin01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsin01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setIsin01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Isin01 with another Field
	 *	@param value
	 */
   public void setIsin01(Field source) {
      dcltbdemsec.setIsin01(source);
   }  
   
     /**
	 * 	Update Isin01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsin01(Field source, int sourceIndex,int sourceLen) {
      dcltbdemsec.setIsin01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Isin01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsin01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dcltbdemsec.setIsin01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Test condition "Y" for isEocIsinCursor()
	 *	@return  Returns true if isEocIsinCursor() is "Y"
	 */
   public boolean isEocIsinCursor() throws CFException {
      return work.isEocIsinCursor();
   }

	/**
	*  set values "Y"
	*/
   	public void setEocIsinCursorTrue()  throws CFException{  			
    	work.setEocIsinCursorTrue();
   	}
	/**
	 *	Returns the value of dcltbdemsec
	 *	@return dcltbdemsec
	 */   
	 public Dcltbdemsec getDcltbdemsec() {
   	return dcltbdemsec;
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



        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
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
        str += sqlca.hashCode();
        str += dcltbdemsec.hashCode();
       return str.hashCode();
    }

    public IsinOutCtx clone() {
        IsinOutCtx cloneObj = new IsinOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.dcltbdemsec = new Dcltbdemsec();
        cloneObj.dcltbdemsec.set(dcltbdemsec.getClonedField());
        return cloneObj;
    }

    }

    public IsinOutCtx getIsinOutCtx() {
            return new IsinOutCtx();
    }
     public class DecimalToFloatInCtx implements Cloneable {
     Db2Indicators db2Indicators = Db2funciCtx.this.getDb2Indicators();
     Work work = Db2funciCtx.this.getWork();
     Dclvbsscrdt dclvbsscrdt = Db2funciCtx.this.getDclvbsscrdt();
     Sqlca sqlca = Db2funciCtx.this.getSqlca();
     Bdms01CallParameters bdms01CallParameters = Db2funciCtx.this.getBdms01CallParameters();

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
	 *	Returns the value of putNtcMinNull
	 *	@return putNtcMinNull
	 */
	public short getPutNtcMinNull() throws CFException {        
   		return db2Indicators.getPutNtcMinNull();
	}
	
	/**
	 * 	Update PutNtcMinNull with the passed value
	 *	@param number
	 */
	public void setPutNtcMinNull(short number)  throws CFException{
		db2Indicators.setPutNtcMinNull(number);
	}

	public void setPutNtcMinNull(int number)  throws CFException{
		db2Indicators.setPutNtcMinNull((short)number);
	}

	public void setPutNtcMinNull(long number)  throws CFException{
		db2Indicators.setPutNtcMinNull((short)number);
	}



	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of dclvbsscrdt
	 *	@return dclvbsscrdt
	 */   
	 public Dclvbsscrdt getDclvbsscrdt() {
   	return dclvbsscrdt;
   }


	/**
	 *	Returns the value of yieldBidPct
	 *	@return yieldBidPct
	 */
   public BigDecimal getYieldBidPct() throws CFException {
   	return dclvbsscrdt.getYieldBidPct();
   }

  
	/**
	*  set variable yieldBidPct
	*  @param value
	**/
   public void setYieldBidPct(BigDecimal value)  throws CFException{
	dclvbsscrdt.setYieldBidPct(value);
   } 
	
	

public short getPutNtcMinDyQty() throws CFException {  
        return dclvbsscrdt.getPutNtcMinDyQty();
}
	/**
	 * 	Update PutNtcMinDyQty with the passed value
	 *	@param number
	 */
	public void setPutNtcMinDyQty(short number)  throws CFException{
		dclvbsscrdt.setPutNtcMinDyQty(number);
	}

	public void setPutNtcMinDyQty(int number)  throws CFException{
	   dclvbsscrdt.setPutNtcMinDyQty(number);
	}
	public void setPutNtcMinDyQty(long number)  throws CFException {
	    dclvbsscrdt.setPutNtcMinDyQty(number);
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


public short getPutNtcMaxDyQty() throws CFException {  
        return dclvbsscrdt.getPutNtcMaxDyQty();
}
	/**
	 * 	Update PutNtcMaxDyQty with the passed value
	 *	@param number
	 */
	public void setPutNtcMaxDyQty(short number)  throws CFException{
		dclvbsscrdt.setPutNtcMaxDyQty(number);
	}

	public void setPutNtcMaxDyQty(int number)  throws CFException{
	   dclvbsscrdt.setPutNtcMaxDyQty(number);
	}
	public void setPutNtcMaxDyQty(long number)  throws CFException {
	    dclvbsscrdt.setPutNtcMaxDyQty(number);
	}
	


	/**
	 *	Returns the value of db2Indicators
	 *	@return db2Indicators
	 */   
	 public Db2Indicators getDb2Indicators() {
   	return db2Indicators;
   }


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	public BigDecimal getCntngYldRt() throws CFException{      
   		return work.getCntngYldRt();
	}

    public char[] getCntngYldRtString() throws CFException {
          return  work.getCntngYldRt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update CntngYldRt with the passed number
	 *	@param number
	 */
	public void setCntngYldRt(BigDecimal number)  throws CFException{
		work.setCntngYldRt(number);
   }

	/**
	 *	Returns the value of yieldBidNull
	 *	@return yieldBidNull
	 */
	public short getYieldBidNull() throws CFException {        
   		return db2Indicators.getYieldBidNull();
	}
	
	/**
	 * 	Update YieldBidNull with the passed value
	 *	@param number
	 */
	public void setYieldBidNull(short number)  throws CFException{
		db2Indicators.setYieldBidNull(number);
	}

	public void setYieldBidNull(int number)  throws CFException{
		db2Indicators.setYieldBidNull((short)number);
	}

	public void setYieldBidNull(long number)  throws CFException{
		db2Indicators.setYieldBidNull((short)number);
	}



	/**
	 *	Returns the value of putNtcMaxNull
	 *	@return putNtcMaxNull
	 */
	public short getPutNtcMaxNull() throws CFException {        
   		return db2Indicators.getPutNtcMaxNull();
	}
	
	/**
	 * 	Update PutNtcMaxNull with the passed value
	 *	@param number
	 */
	public void setPutNtcMaxNull(short number)  throws CFException{
		db2Indicators.setPutNtcMaxNull(number);
	}

	public void setPutNtcMaxNull(int number)  throws CFException{
		db2Indicators.setPutNtcMaxNull((short)number);
	}

	public void setPutNtcMaxNull(long number)  throws CFException{
		db2Indicators.setPutNtcMaxNull((short)number);
	}




        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
        }

        public DecimalToFloatOutCtx getDecimalToFloatOutCtx() {
            return new DecimalToFloatOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += db2Indicators.hashCode();
        str += work.hashCode();
        str += dclvbsscrdt.hashCode();
        str += sqlca.hashCode();
        str += bdms01CallParameters.hashCode();
       return str.hashCode();
    }

    public DecimalToFloatInCtx clone() {
        DecimalToFloatInCtx cloneObj = new DecimalToFloatInCtx();
        cloneObj.db2Indicators = new Db2Indicators();
        cloneObj.db2Indicators.set(db2Indicators.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dclvbsscrdt = new Dclvbsscrdt();
        cloneObj.dclvbsscrdt.set(dclvbsscrdt.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.bdms01CallParameters = new Bdms01CallParameters();
        cloneObj.bdms01CallParameters.set(bdms01CallParameters.getClonedField());
        return cloneObj;
    }

    }

    public DecimalToFloatInCtx getDecimalToFloatInCtx() {
            return new DecimalToFloatInCtx();
    }
     public class DecimalToFloatOutCtx implements Cloneable {
     Work work = Db2funciCtx.this.getWork();
     Db2Indicators db2Indicators = Db2funciCtx.this.getDb2Indicators();
     Dclvbsscrdt dclvbsscrdt = Db2funciCtx.this.getDclvbsscrdt();
     Sqlca sqlca = Db2funciCtx.this.getSqlca();
     Bdms01CallParameters bdms01CallParameters = Db2funciCtx.this.getBdms01CallParameters();

	/**
	 *	Returns the value of db2Indicators
	 *	@return db2Indicators
	 */   
	 public Db2Indicators getDb2Indicators() {
   	return db2Indicators;
   }


	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of dclvbsscrdt
	 *	@return dclvbsscrdt
	 */   
	 public Dclvbsscrdt getDclvbsscrdt() {
   	return dclvbsscrdt;
   }


	/**
	 *	Returns the value of bdms01CntngYldRtEdt
	 *	@return bdms01CntngYldRtEdt
	 */
   public char[] getBdms01CntngYldRtEdt() throws CFException  {              
   		return work.getBdms01CntngYldRtEdt();
   }

  
	/**
	*  set variable bdms01CntngYldRtEdt
	*  @param value
	**/
   public void setBdms01CntngYldRtEdt(char[] value) throws CFException {
      work.setBdms01CntngYldRtEdt(value);
   } 

     /**
	 * 	Update Bdms01CntngYldRtEdt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBdms01CntngYldRtEdt(char[] source, int sourceIndex) throws CFException {
      work.setBdms01CntngYldRtEdt(source, sourceIndex);
   	
   }
   
   public void setBdms01CntngYldRtEdt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setBdms01CntngYldRtEdt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Bdms01CntngYldRtEdt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CntngYldRtEdt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setBdms01CntngYldRtEdt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Bdms01CntngYldRtEdt with another Field
	 *	@param value
	 */
   public void setBdms01CntngYldRtEdt(Field source) {
      work.setBdms01CntngYldRtEdt(source);
   }  
   
     /**
	 * 	Update Bdms01CntngYldRtEdt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBdms01CntngYldRtEdt(Field source, int sourceIndex,int sourceLen) {
      work.setBdms01CntngYldRtEdt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Bdms01CntngYldRtEdt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBdms01CntngYldRtEdt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setBdms01CntngYldRtEdt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	public BigDecimal getCntngYldRt() throws CFException{      
   		return work.getCntngYldRt();
	}

    public char[] getCntngYldRtString() throws CFException {
          return  work.getCntngYldRt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update CntngYldRt with the passed number
	 *	@param number
	 */
	public void setCntngYldRt(BigDecimal number)  throws CFException{
		work.setCntngYldRt(number);
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
	 *	Returns the value of bdms01CntngYldRt
	 *	@return bdms01CntngYldRt
	 */
	public BigDecimal getBdms01CntngYldRt() throws CFException {
   		return bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecurityExpData().getBdms01CntngYldRt();
	}


	 /**
     *	Returns String value of bdms01CntngYldRt
     *	@return bdms01CntngYldRt
     */
    public char[]  getBdms01CntngYldRtString() throws CFException {
         return bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecurityExpData().getBdms01CntngYldRtString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean bdms01CntngYldRtIsNumeric() {
        return bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecurityExpData().bdms01CntngYldRtIsNumeric();
    }
	/**
	 * 	Update Bdms01CntngYldRt with the passed number
	 *	@param number
	 */
	public void setBdms01CntngYldRt(BigDecimal number)  throws CFException{
		bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecurityExpData().setBdms01CntngYldRt(number);
   }

	/**
	 * 	Update Bdms01CntngYldRt with the passed value
	 *	@param value (String or char[]);
	 */
	public void setBdms01CntngYldRt(char[] value)  throws CFException{
		bdms01CallParameters.getBdms01ReturnData().getBdms01BaseSecurityExpData().setBdms01CntngYldRt(value);
	}   


        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
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
        str += db2Indicators.hashCode();
        str += dclvbsscrdt.hashCode();
        str += sqlca.hashCode();
        str += bdms01CallParameters.hashCode();
       return str.hashCode();
    }

    public DecimalToFloatOutCtx clone() {
        DecimalToFloatOutCtx cloneObj = new DecimalToFloatOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.db2Indicators = new Db2Indicators();
        cloneObj.db2Indicators.set(db2Indicators.getClonedField());
        cloneObj.dclvbsscrdt = new Dclvbsscrdt();
        cloneObj.dclvbsscrdt.set(dclvbsscrdt.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        cloneObj.bdms01CallParameters = new Bdms01CallParameters();
        cloneObj.bdms01CallParameters.set(bdms01CallParameters.getClonedField());
        return cloneObj;
    }

    }

    public DecimalToFloatOutCtx getDecimalToFloatOutCtx() {
            return new DecimalToFloatOutCtx();
    }
     public class Select1InCtx implements Cloneable {
     Work work = Db2funciCtx.this.getWork();
     Sqlca sqlca = Db2funciCtx.this.getSqlca();

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
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


public int getCtryHoliCt() throws CFException {  
        return work.getCtryHoliCt();
}
	/**
	 * 	Update CtryHoliCt with the passed value
	 *	@param number
	 */
	public void setCtryHoliCt(int number)  throws CFException{
		work.setCtryHoliCt(number);
	}


	public void setCtryHoliCt(long number)  throws CFException{
	    work.setCtryHoliCt(number);
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


        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
        }

        public Select1OutCtx getSelect1OutCtx() {
            return new Select1OutCtx();
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
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public Select1InCtx clone() {
        Select1InCtx cloneObj = new Select1InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public Select1InCtx getSelect1InCtx() {
            return new Select1InCtx();
    }
     public class Select1OutCtx implements Cloneable {
     Work work = Db2funciCtx.this.getWork();
     Sqlca sqlca = Db2funciCtx.this.getSqlca();

	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
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



        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
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
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public Select1OutCtx clone() {
        Select1OutCtx cloneObj = new Select1OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public Select1OutCtx getSelect1OutCtx() {
            return new Select1OutCtx();
    }
     public class SelectCountInCtx implements Cloneable {
     Work work = Db2funciCtx.this.getWork();
     Sqlca sqlca = Db2funciCtx.this.getSqlca();

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
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


public int getCtryHoliCt() throws CFException {  
        return work.getCtryHoliCt();
}
	/**
	 * 	Update CtryHoliCt with the passed value
	 *	@param number
	 */
	public void setCtryHoliCt(int number)  throws CFException{
		work.setCtryHoliCt(number);
	}


	public void setCtryHoliCt(long number)  throws CFException{
	    work.setCtryHoliCt(number);
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


        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
        }

        public SelectCountOutCtx getSelectCountOutCtx() {
            return new SelectCountOutCtx();
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
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public SelectCountInCtx clone() {
        SelectCountInCtx cloneObj = new SelectCountInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public SelectCountInCtx getSelectCountInCtx() {
            return new SelectCountInCtx();
    }
     public class SelectCountOutCtx implements Cloneable {
     Work work = Db2funciCtx.this.getWork();
     Sqlca sqlca = Db2funciCtx.this.getSqlca();

	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
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



        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
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
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public SelectCountOutCtx clone() {
        SelectCountOutCtx cloneObj = new SelectCountOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public SelectCountOutCtx getSelectCountOutCtx() {
            return new SelectCountOutCtx();
    }
     public class CheckSqlcodeInCtx implements Cloneable {
     Work work = Db2funciCtx.this.getWork();
     Sqlca sqlca = Db2funciCtx.this.getSqlca();

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



        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
        }

        public CheckSqlcodeOutCtx getCheckSqlcodeOutCtx() {
            return new CheckSqlcodeOutCtx();
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
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public CheckSqlcodeInCtx clone() {
        CheckSqlcodeInCtx cloneObj = new CheckSqlcodeInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public CheckSqlcodeInCtx getCheckSqlcodeInCtx() {
            return new CheckSqlcodeInCtx();
    }
     public class CheckSqlcodeOutCtx implements Cloneable {
     Work work = Db2funciCtx.this.getWork();
     Sqlca sqlca = Db2funciCtx.this.getSqlca();

	/**
	 *	Returns the value of sqlca
	 *	@return sqlca
	 */   
	 public Sqlca getSqlca() {
   	return sqlca;
   }


	/**
	 *	Returns the value of sqlcodeDisp
	 *	@return sqlcodeDisp
	 */
   public char[] getSqlcodeDisp() throws CFException  {              
   		return work.getSqlcodeDisp();
   }

  
	/**
	*  set variable sqlcodeDisp
	*  @param value
	**/
   public void setSqlcodeDisp(char[] value) throws CFException {
      work.setSqlcodeDisp(value);
   } 

     /**
	 * 	Update SqlcodeDisp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSqlcodeDisp(char[] source, int sourceIndex) throws CFException {
      work.setSqlcodeDisp(source, sourceIndex);
   	
   }
   
   public void setSqlcodeDisp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SqlcodeDisp with another Field
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source) {
      work.setSqlcodeDisp(source);
   }  
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source, int sourceIndex,int sourceLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SqlcodeDisp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSqlcodeDisp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSqlcodeDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
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



        public Db2funciCtx getDb2funciCtx() {
            return Db2funciCtx.this;
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
        str += sqlca.hashCode();
       return str.hashCode();
    }

    public CheckSqlcodeOutCtx clone() {
        CheckSqlcodeOutCtx cloneObj = new CheckSqlcodeOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sqlca = new Sqlca();
        cloneObj.sqlca.set(sqlca.getClonedField());
        return cloneObj;
    }

    }

    public CheckSqlcodeOutCtx getCheckSqlcodeOutCtx() {
            return new CheckSqlcodeOutCtx();
    }
}
