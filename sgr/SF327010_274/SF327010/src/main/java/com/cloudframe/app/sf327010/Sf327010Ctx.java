package com.cloudframe.app.sf327010;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.sf327010.file.records.Sys201AsaServerRec;
import com.cloudframe.app.sf327010.dto.EojMessage6009999;
import com.cloudframe.app.sf327010.dto.Work;
import com.cloudframe.app.sf327010.dto.DtlLine1205;
import com.cloudframe.app.sf327010.dto.Sf535ZlogServicesGroup;
import com.cloudframe.app.sf327010.dto.Sf528ExtractZLogRec;
import com.cloudframe.app.sf327010.dto.DtlLine2205;
import com.cloudframe.app.sf327010.dto.Sf535ZlogServiceTable;
import com.cloudframe.app.sf327010.file.records.Group1;
import com.cloudframe.app.sf327010.dto.CompileMsg600;
import com.cloudframe.app.sf327010.dto.FuncCurrentDate800;
import com.cloudframe.app.sf327010.dto.Sf535ZlogServiceEntry;
import com.cloudframe.app.sf327010.dto.DetailData3205;
import com.cloudframe.app.sf327010.dto.TotWriteCountMsg600;
import com.cloudframe.app.sf327010.dto.HighServiceTime800;
import com.cloudframe.app.sf327010.dto.FuncWhenCompiled800;
import com.cloudframe.app.sf327010.dto.CurrentRunMsg600;
import com.cloudframe.app.sf327010.dto.HdrLine2202;
import com.cloudframe.app.sf327010.dto.HdrLine1201;
import com.cloudframe.app.sf327010.dto.TotReadCountMsg600;
import com.cloudframe.app.sf327010.dto.LowServiceTime800;


@Context
public class Sf327010Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    FuncCurrentDate800 funcCurrentDate800;
    CompileMsg600 compileMsg600;
    Sf535ZlogServicesGroup sf535ZlogServicesGroup;
    FuncWhenCompiled800 funcWhenCompiled800;
    CurrentRunMsg600 currentRunMsg600;
    Work work;
    HighServiceTime800 highServiceTime800;
    TotWriteCountMsg600 totWriteCountMsg600;
    TotReadCountMsg600 totReadCountMsg600;
    LowServiceTime800 lowServiceTime800;
    Group1 group1;
    Sys201AsaServerRec sys201AsaServerRec;
    Sf528ExtractZLogRec sf528ExtractZLogRec;
    HdrLine1201 hdrLine1201;
    EojMessage6009999 eojMessage6009999;
    DtlLine2205 dtlLine2205;
    HdrLine2202 hdrLine2202;
    DetailData3205 detailData3205;
    DtlLine1205 dtlLine1205;

    int sf535X;

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


    public FuncCurrentDate800 getFuncCurrentDate800() {
        if (funcCurrentDate800 == null) {
            funcCurrentDate800 = new FuncCurrentDate800();
        }

        return funcCurrentDate800;
    }

    public void setFuncCurrentDate800(FuncCurrentDate800 funcCurrentDate800) {
        this.funcCurrentDate800 = funcCurrentDate800;
    }
    public CompileMsg600 getCompileMsg600() {
        if (compileMsg600 == null) {
            compileMsg600 = new CompileMsg600();
        }

        return compileMsg600;
    }

    public void setCompileMsg600(CompileMsg600 compileMsg600) {
        this.compileMsg600 = compileMsg600;
    }
    public Sf535ZlogServicesGroup getSf535ZlogServicesGroup() {
        if (sf535ZlogServicesGroup == null) {
            sf535ZlogServicesGroup = new Sf535ZlogServicesGroup();
        }

        return sf535ZlogServicesGroup;
    }

    public void setSf535ZlogServicesGroup(Sf535ZlogServicesGroup sf535ZlogServicesGroup) {
        this.sf535ZlogServicesGroup = sf535ZlogServicesGroup;
    }
    public FuncWhenCompiled800 getFuncWhenCompiled800() {
        if (funcWhenCompiled800 == null) {
            funcWhenCompiled800 = new FuncWhenCompiled800();
        }

        return funcWhenCompiled800;
    }

    public void setFuncWhenCompiled800(FuncWhenCompiled800 funcWhenCompiled800) {
        this.funcWhenCompiled800 = funcWhenCompiled800;
    }
    public CurrentRunMsg600 getCurrentRunMsg600() {
        if (currentRunMsg600 == null) {
            currentRunMsg600 = new CurrentRunMsg600();
        }

        return currentRunMsg600;
    }

    public void setCurrentRunMsg600(CurrentRunMsg600 currentRunMsg600) {
        this.currentRunMsg600 = currentRunMsg600;
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
    public HighServiceTime800 getHighServiceTime800() {
        if (highServiceTime800 == null) {
            highServiceTime800 = new HighServiceTime800();
        }

        return highServiceTime800;
    }

    public void setHighServiceTime800(HighServiceTime800 highServiceTime800) {
        this.highServiceTime800 = highServiceTime800;
    }
    public TotWriteCountMsg600 getTotWriteCountMsg600() {
        if (totWriteCountMsg600 == null) {
            totWriteCountMsg600 = new TotWriteCountMsg600();
        }

        return totWriteCountMsg600;
    }

    public void setTotWriteCountMsg600(TotWriteCountMsg600 totWriteCountMsg600) {
        this.totWriteCountMsg600 = totWriteCountMsg600;
    }
    public TotReadCountMsg600 getTotReadCountMsg600() {
        if (totReadCountMsg600 == null) {
            totReadCountMsg600 = new TotReadCountMsg600();
        }

        return totReadCountMsg600;
    }

    public void setTotReadCountMsg600(TotReadCountMsg600 totReadCountMsg600) {
        this.totReadCountMsg600 = totReadCountMsg600;
    }
    public LowServiceTime800 getLowServiceTime800() {
        if (lowServiceTime800 == null) {
            lowServiceTime800 = new LowServiceTime800();
        }

        return lowServiceTime800;
    }

    public void setLowServiceTime800(LowServiceTime800 lowServiceTime800) {
        this.lowServiceTime800 = lowServiceTime800;
    }
    public Group1 getGroup1() {
        if (group1 == null) {
            group1 = new Group1();
        }

        return group1;
    }

    public void setGroup1(Group1 group1) {
        this.group1 = group1;
    }
    public Sys201AsaServerRec getSys201AsaServerRec() {
        if (sys201AsaServerRec == null) {
            sys201AsaServerRec = new Sys201AsaServerRec();
        }

        return sys201AsaServerRec;
    }

    public void setSys201AsaServerRec(Sys201AsaServerRec sys201AsaServerRec) {
        this.sys201AsaServerRec = sys201AsaServerRec;
    }
    public Sf528ExtractZLogRec getSf528ExtractZLogRec() {
        if (sf528ExtractZLogRec == null) {
            sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        }

        return sf528ExtractZLogRec;
    }

    public void setSf528ExtractZLogRec(Sf528ExtractZLogRec sf528ExtractZLogRec) {
        this.sf528ExtractZLogRec = sf528ExtractZLogRec;
    }
    public HdrLine1201 getHdrLine1201() {
        if (hdrLine1201 == null) {
            hdrLine1201 = new HdrLine1201();
        }

        return hdrLine1201;
    }

    public void setHdrLine1201(HdrLine1201 hdrLine1201) {
        this.hdrLine1201 = hdrLine1201;
    }
    public EojMessage6009999 getEojMessage6009999() {
        if (eojMessage6009999 == null) {
            eojMessage6009999 = new EojMessage6009999();
        }

        return eojMessage6009999;
    }

    public void setEojMessage6009999(EojMessage6009999 eojMessage6009999) {
        this.eojMessage6009999 = eojMessage6009999;
    }
    public DtlLine2205 getDtlLine2205() {
        if (dtlLine2205 == null) {
            dtlLine2205 = new DtlLine2205();
        }

        return dtlLine2205;
    }

    public void setDtlLine2205(DtlLine2205 dtlLine2205) {
        this.dtlLine2205 = dtlLine2205;
    }
    public HdrLine2202 getHdrLine2202() {
        if (hdrLine2202 == null) {
            hdrLine2202 = new HdrLine2202();
        }

        return hdrLine2202;
    }

    public void setHdrLine2202(HdrLine2202 hdrLine2202) {
        this.hdrLine2202 = hdrLine2202;
    }
    public DetailData3205 getDetailData3205() {
        if (detailData3205 == null) {
            detailData3205 = new DetailData3205();
        }

        return detailData3205;
    }

    public void setDetailData3205(DetailData3205 detailData3205) {
        this.detailData3205 = detailData3205;
    }
    public DtlLine1205 getDtlLine1205() {
        if (dtlLine1205 == null) {
            dtlLine1205 = new DtlLine1205();
        }

        return dtlLine1205;
    }

    public void setDtlLine1205(DtlLine1205 dtlLine1205) {
        this.dtlLine1205 = dtlLine1205;
    }

    public int getSf535X() {
        return sf535X;
    }

    public void setSf535X(int sf535X) {
        this.sf535X = sf535X;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += funcCurrentDate800.hashCode();
        str += compileMsg600.hashCode();
        str += sf535ZlogServicesGroup.hashCode();
        str += funcWhenCompiled800.hashCode();
        str += currentRunMsg600.hashCode();
        str += work.hashCode();
        str += highServiceTime800.hashCode();
        str += totWriteCountMsg600.hashCode();
        str += totReadCountMsg600.hashCode();
        str += lowServiceTime800.hashCode();
        str += group1.hashCode();
        str += sys201AsaServerRec.hashCode();
        str += sf528ExtractZLogRec.hashCode();
        str += hdrLine1201.hashCode();
        str += eojMessage6009999.hashCode();
        str += dtlLine2205.hashCode();
        str += hdrLine2202.hashCode();
        str += detailData3205.hashCode();
        str += dtlLine1205.hashCode();
       return str.hashCode();
    }

    public Sf327010Ctx clone() {
        Sf327010Ctx cloneObj = new Sf327010Ctx();
        cloneObj.funcCurrentDate800 = new FuncCurrentDate800();
        cloneObj.funcCurrentDate800.set(funcCurrentDate800.getClonedField());
        cloneObj.compileMsg600 = new CompileMsg600();
        cloneObj.compileMsg600.set(compileMsg600.getClonedField());
        cloneObj.sf535ZlogServicesGroup = new Sf535ZlogServicesGroup();
        cloneObj.sf535ZlogServicesGroup.set(sf535ZlogServicesGroup.getClonedField());
        cloneObj.funcWhenCompiled800 = new FuncWhenCompiled800();
        cloneObj.funcWhenCompiled800.set(funcWhenCompiled800.getClonedField());
        cloneObj.currentRunMsg600 = new CurrentRunMsg600();
        cloneObj.currentRunMsg600.set(currentRunMsg600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.highServiceTime800 = new HighServiceTime800();
        cloneObj.highServiceTime800.set(highServiceTime800.getClonedField());
        cloneObj.totWriteCountMsg600 = new TotWriteCountMsg600();
        cloneObj.totWriteCountMsg600.set(totWriteCountMsg600.getClonedField());
        cloneObj.totReadCountMsg600 = new TotReadCountMsg600();
        cloneObj.totReadCountMsg600.set(totReadCountMsg600.getClonedField());
        cloneObj.lowServiceTime800 = new LowServiceTime800();
        cloneObj.lowServiceTime800.set(lowServiceTime800.getClonedField());
        cloneObj.group1 = new Group1();
        cloneObj.group1.set(group1.getClonedField());
        cloneObj.sys201AsaServerRec = new Sys201AsaServerRec();
        cloneObj.sys201AsaServerRec.set(sys201AsaServerRec.getClonedField());
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        cloneObj.hdrLine1201 = new HdrLine1201();
        cloneObj.hdrLine1201.set(hdrLine1201.getClonedField());
        cloneObj.eojMessage6009999 = new EojMessage6009999();
        cloneObj.eojMessage6009999.set(eojMessage6009999.getClonedField());
        cloneObj.dtlLine2205 = new DtlLine2205();
        cloneObj.dtlLine2205.set(dtlLine2205.getClonedField());
        cloneObj.hdrLine2202 = new HdrLine2202();
        cloneObj.hdrLine2202.set(hdrLine2202.getClonedField());
        cloneObj.detailData3205 = new DetailData3205();
        cloneObj.detailData3205.set(detailData3205.getClonedField());
        cloneObj.dtlLine1205 = new DtlLine1205();
        cloneObj.dtlLine1205.set(dtlLine1205.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineInCtx implements Cloneable {
     Work work = Sf327010Ctx.this.getWork();

	/**
	 *	Test condition "Y" for isZLogEof88100()
	 *	@return  Returns true if isZLogEof88100() is "Y"
	 */
   public boolean isZLogEof88100() throws CFException {
      return work.isZLogEof88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setZLogEof88100True()  throws CFException{  			
    	work.setZLogEof88100True();
   	}

        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
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

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class InitializeProgramInCtx implements Cloneable {
     HdrLine2202 hdrLine2202 = Sf327010Ctx.this.getHdrLine2202();
     Work work = Sf327010Ctx.this.getWork();
     HighServiceTime800 highServiceTime800 = Sf327010Ctx.this.getHighServiceTime800();
     LowServiceTime800 lowServiceTime800 = Sf327010Ctx.this.getLowServiceTime800();
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf327010Ctx.this.getSf528ExtractZLogRec();
     DtlLine1205 dtlLine1205 = Sf327010Ctx.this.getDtlLine1205();

	/**
	 *	Returns the value of sf528LogType
	 *	@return sf528LogType
	 */
   public char[] getSf528LogType() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528LogType();
   }

  
	/**
	*  set variable sf528LogType
	*  @param value
	**/
   public void setSf528LogType(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528LogType(value);
   } 

     /**
	 * 	Update Sf528LogType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528LogType(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex);
   	
   }
   
   public void setSf528LogType(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528LogType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528LogType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528LogType with another Field
	 *	@param value
	 */
   public void setSf528LogType(Field source) {
      sf528ExtractZLogRec.setSf528LogType(source);
   }  
   
     /**
	 * 	Update Sf528LogType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528LogType(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528LogType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528LogType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of noRecordFoundMsg600
	 *	@return noRecordFoundMsg600
	 */
   public char[] getNoRecordFoundMsg600() throws CFException  {              
   		return work.getNoRecordFoundMsg600();
   }

  
	/**
	*  set variable noRecordFoundMsg600
	*  @param value
	**/
   public void setNoRecordFoundMsg600(char[] value) throws CFException {
      work.setNoRecordFoundMsg600(value);
   } 

	/**
	 *	Returns the value of sf528ServiceDateTime
	 *	@return sf528ServiceDateTime
	 */
   public char[] getSf528ServiceDateTime() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServiceDateTime();
   }

  
	/**
	*  set variable sf528ServiceDateTime
	*  @param value
	**/
   public void setSf528ServiceDateTime(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceDateTime(value);
   } 

     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceDateTime(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex);
   	
   }
   
   public void setSf528ServiceDateTime(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceDateTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServiceDateTime with another Field
	 *	@param value
	 */
   public void setSf528ServiceDateTime(Field source) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source);
   }  
   
     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceDateTime(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceDateTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf528ServerId
	 *	@return sf528ServerId
	 */
   public char[] getSf528ServerId() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServerId();
   }

  
	/**
	*  set variable sf528ServerId
	*  @param value
	**/
   public void setSf528ServerId(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528ServerId(value);
   } 

     /**
	 * 	Update Sf528ServerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServerId(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex);
   	
   }
   
   public void setSf528ServerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServerId with another Field
	 *	@param value
	 */
   public void setSf528ServerId(Field source) {
      sf528ExtractZLogRec.setSf528ServerId(source);
   }  
   
     /**
	 * 	Update Sf528ServerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServerId(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of plus1300
	 *	@return plus1300
	 */
	public int getPlus1300() throws CFException {
   		return work.getPlus1300();
	}


	/**
	 *	Returns String value of plus1300
	 *	@return plus1300
	 */
	public char[]  getPlus1300String() throws CFException {
	     return String.valueOf(work.getPlus1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plus1300IsNumeric()  throws CFException{
	    return work.plus1300IsNumeric();
	}

	/**
	 * 	Update Plus1300 with the passed value
	 *	@param number
	 */
	public void setPlus1300(int number)  throws CFException{
		work.setPlus1300(number);
	}
	

	public void setPlus1300(long number)  throws CFException{
	    work.setPlus1300(number);
	}
	
	
	/**
	 * 	Update Plus1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlus1300(char[] value)  throws CFException {
		work.setPlus1300(value);
	}
	
	/**
	 * 	Update Plus1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlus1300String(char[] value)  throws CFException{
		work.setPlus1300(value);
	}	

public long getPageCount400() throws CFException {  
        return work.getPageCount400();
}
	/**
	 * 	Update PageCount400 with the passed value
	 *	@param number
	 */
	public void setPageCount400(long number)  throws CFException{
		work.setPageCount400(number);
	}



	/**
	 *	Test condition "Y" for isZLogEof88100()
	 *	@return  Returns true if isZLogEof88100() is "Y"
	 */
   public boolean isZLogEof88100() throws CFException {
      return work.isZLogEof88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setZLogEof88100True()  throws CFException{  			
    	work.setZLogEof88100True();
   	}

        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
        }

        public InitializeProgramOutCtx getInitializeProgramOutCtx() {
            return new InitializeProgramOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += hdrLine2202.hashCode();
        str += work.hashCode();
        str += highServiceTime800.hashCode();
        str += lowServiceTime800.hashCode();
        str += sf528ExtractZLogRec.hashCode();
        str += dtlLine1205.hashCode();
       return str.hashCode();
    }

    public InitializeProgramInCtx clone() {
        InitializeProgramInCtx cloneObj = new InitializeProgramInCtx();
        cloneObj.hdrLine2202 = new HdrLine2202();
        cloneObj.hdrLine2202.set(hdrLine2202.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.highServiceTime800 = new HighServiceTime800();
        cloneObj.highServiceTime800.set(highServiceTime800.getClonedField());
        cloneObj.lowServiceTime800 = new LowServiceTime800();
        cloneObj.lowServiceTime800.set(lowServiceTime800.getClonedField());
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        cloneObj.dtlLine1205 = new DtlLine1205();
        cloneObj.dtlLine1205.set(dtlLine1205.getClonedField());
        return cloneObj;
    }

    }

    public InitializeProgramInCtx getInitializeProgramInCtx() {
            return new InitializeProgramInCtx();
    }
     public class InitializeProgramOutCtx implements Cloneable {
     HdrLine2202 hdrLine2202 = Sf327010Ctx.this.getHdrLine2202();
     Work work = Sf327010Ctx.this.getWork();
     HighServiceTime800 highServiceTime800 = Sf327010Ctx.this.getHighServiceTime800();
     LowServiceTime800 lowServiceTime800 = Sf327010Ctx.this.getLowServiceTime800();
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf327010Ctx.this.getSf528ExtractZLogRec();
     DtlLine1205 dtlLine1205 = Sf327010Ctx.this.getDtlLine1205();

	/**
	 *	Returns the value of pageCount202
	 *	@return pageCount202
	 */
   public char[] getPageCount202() throws CFException  {              
   		return hdrLine2202.getPageCount202();
   }

  
	/**
	*  set variable pageCount202
	*  @param value
	**/
   public void setPageCount202(char[] value) throws CFException {
      hdrLine2202.setPageCount202(value);
   } 

     /**
	 * 	Update PageCount202 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPageCount202(char[] source, int sourceIndex) throws CFException {
      hdrLine2202.setPageCount202(source, sourceIndex);
   	
   }
   
   public void setPageCount202(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hdrLine2202.setPageCount202(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PageCount202 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPageCount202(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrLine2202.setPageCount202(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PageCount202 with another Field
	 *	@param value
	 */
   public void setPageCount202(Field source) {
      hdrLine2202.setPageCount202(source);
   }  
   
     /**
	 * 	Update PageCount202 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPageCount202(Field source, int sourceIndex,int sourceLen) {
      hdrLine2202.setPageCount202(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PageCount202 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPageCount202(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrLine2202.setPageCount202(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf528LogType
	 *	@return sf528LogType
	 */
   public char[] getSf528LogType() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528LogType();
   }

  
	/**
	*  set variable sf528LogType
	*  @param value
	**/
   public void setSf528LogType(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528LogType(value);
   } 

     /**
	 * 	Update Sf528LogType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528LogType(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex);
   	
   }
   
   public void setSf528LogType(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528LogType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528LogType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528LogType with another Field
	 *	@param value
	 */
   public void setSf528LogType(Field source) {
      sf528ExtractZLogRec.setSf528LogType(source);
   }  
   
     /**
	 * 	Update Sf528LogType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528LogType(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528LogType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528LogType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of logType205
	 *	@return logType205
	 */
   public char[] getLogType205() throws CFException  {              
   		return dtlLine1205.getLogType205();
   }

  
	/**
	*  set variable logType205
	*  @param value
	**/
   public void setLogType205(char[] value) throws CFException {
      dtlLine1205.setLogType205(value);
   } 

     /**
	 * 	Update LogType205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogType205(char[] source, int sourceIndex) throws CFException {
      dtlLine1205.setLogType205(source, sourceIndex);
   	
   }
   
   public void setLogType205(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dtlLine1205.setLogType205(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LogType205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogType205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlLine1205.setLogType205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LogType205 with another Field
	 *	@param value
	 */
   public void setLogType205(Field source) {
      dtlLine1205.setLogType205(source);
   }  
   
     /**
	 * 	Update LogType205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogType205(Field source, int sourceIndex,int sourceLen) {
      dtlLine1205.setLogType205(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LogType205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogType205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlLine1205.setLogType205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf528ServiceDateTime
	 *	@return sf528ServiceDateTime
	 */
   public char[] getSf528ServiceDateTime() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServiceDateTime();
   }

  
	/**
	*  set variable sf528ServiceDateTime
	*  @param value
	**/
   public void setSf528ServiceDateTime(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceDateTime(value);
   } 

     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceDateTime(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex);
   	
   }
   
   public void setSf528ServiceDateTime(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceDateTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServiceDateTime with another Field
	 *	@param value
	 */
   public void setSf528ServiceDateTime(Field source) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source);
   }  
   
     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceDateTime(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceDateTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of serverId202
	 *	@return serverId202
	 */
   public char[] getServerId202() throws CFException  {              
   		return hdrLine2202.getServerId202();
   }

  
	/**
	*  set variable serverId202
	*  @param value
	**/
   public void setServerId202(char[] value) throws CFException {
      hdrLine2202.setServerId202(value);
   } 

     /**
	 * 	Update ServerId202 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setServerId202(char[] source, int sourceIndex) throws CFException {
      hdrLine2202.setServerId202(source, sourceIndex);
   	
   }
   
   public void setServerId202(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hdrLine2202.setServerId202(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ServerId202 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setServerId202(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrLine2202.setServerId202(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ServerId202 with another Field
	 *	@param value
	 */
   public void setServerId202(Field source) {
      hdrLine2202.setServerId202(source);
   }  
   
     /**
	 * 	Update ServerId202 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setServerId202(Field source, int sourceIndex,int sourceLen) {
      hdrLine2202.setServerId202(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ServerId202 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setServerId202(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrLine2202.setServerId202(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of highServiceTime800
	 *	@return highServiceTime800
	 */   
	 public HighServiceTime800 getHighServiceTime800() {
   	return highServiceTime800;
   }


	/**
	 *	Returns the value of sf528ServerId
	 *	@return sf528ServerId
	 */
   public char[] getSf528ServerId() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServerId();
   }

  
	/**
	*  set variable sf528ServerId
	*  @param value
	**/
   public void setSf528ServerId(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528ServerId(value);
   } 

     /**
	 * 	Update Sf528ServerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServerId(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex);
   	
   }
   
   public void setSf528ServerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServerId with another Field
	 *	@param value
	 */
   public void setSf528ServerId(Field source) {
      sf528ExtractZLogRec.setSf528ServerId(source);
   }  
   
     /**
	 * 	Update Sf528ServerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServerId(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lowServiceTime800
	 *	@return lowServiceTime800
	 */   
	 public LowServiceTime800 getLowServiceTime800() {
   	return lowServiceTime800;
   }


	/**
	 *	Returns the value of plus1300
	 *	@return plus1300
	 */
	public int getPlus1300() throws CFException {
   		return work.getPlus1300();
	}


	/**
	 *	Returns String value of plus1300
	 *	@return plus1300
	 */
	public char[]  getPlus1300String() throws CFException {
	     return String.valueOf(work.getPlus1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plus1300IsNumeric()  throws CFException{
	    return work.plus1300IsNumeric();
	}

	/**
	 * 	Update Plus1300 with the passed value
	 *	@param number
	 */
	public void setPlus1300(int number)  throws CFException{
		work.setPlus1300(number);
	}
	

	public void setPlus1300(long number)  throws CFException{
	    work.setPlus1300(number);
	}
	
	
	/**
	 * 	Update Plus1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlus1300(char[] value)  throws CFException {
		work.setPlus1300(value);
	}
	
	/**
	 * 	Update Plus1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlus1300String(char[] value)  throws CFException{
		work.setPlus1300(value);
	}	

public long getPageCount400() throws CFException {  
        return work.getPageCount400();
}
	/**
	 * 	Update PageCount400 with the passed value
	 *	@param number
	 */
	public void setPageCount400(long number)  throws CFException{
		work.setPageCount400(number);
	}




        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += hdrLine2202.hashCode();
        str += work.hashCode();
        str += highServiceTime800.hashCode();
        str += lowServiceTime800.hashCode();
        str += sf528ExtractZLogRec.hashCode();
        str += dtlLine1205.hashCode();
       return str.hashCode();
    }

    public InitializeProgramOutCtx clone() {
        InitializeProgramOutCtx cloneObj = new InitializeProgramOutCtx();
        cloneObj.hdrLine2202 = new HdrLine2202();
        cloneObj.hdrLine2202.set(hdrLine2202.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.highServiceTime800 = new HighServiceTime800();
        cloneObj.highServiceTime800.set(highServiceTime800.getClonedField());
        cloneObj.lowServiceTime800 = new LowServiceTime800();
        cloneObj.lowServiceTime800.set(lowServiceTime800.getClonedField());
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        cloneObj.dtlLine1205 = new DtlLine1205();
        cloneObj.dtlLine1205.set(dtlLine1205.getClonedField());
        return cloneObj;
    }

    }

    public InitializeProgramOutCtx getInitializeProgramOutCtx() {
            return new InitializeProgramOutCtx();
    }
     public class BuildBegMsgInCtx implements Cloneable {
     FuncCurrentDate800 funcCurrentDate800 = Sf327010Ctx.this.getFuncCurrentDate800();
     CompileMsg600 compileMsg600 = Sf327010Ctx.this.getCompileMsg600();
     FuncWhenCompiled800 funcWhenCompiled800 = Sf327010Ctx.this.getFuncWhenCompiled800();
     CurrentRunMsg600 currentRunMsg600 = Sf327010Ctx.this.getCurrentRunMsg600();
     Work work = Sf327010Ctx.this.getWork();
     HdrLine1201 hdrLine1201 = Sf327010Ctx.this.getHdrLine1201();

	/**
	 *	Returns the value of compileMsg600
	 *	@return compileMsg600
	 */   
	 public CompileMsg600 getCompileMsg600() {
   	return compileMsg600;
   }


	/**
	 *	Returns the value of currentRunMsg600
	 *	@return currentRunMsg600
	 */   
	 public CurrentRunMsg600 getCurrentRunMsg600() {
   	return currentRunMsg600;
   }


	/**
	 *	Returns the value of runMonth800
	 *	@return runMonth800
	 */
   public char[] getRunMonth800() throws CFException  {              
   		return work.getRunMonth800();
   }

  
	/**
	*  set variable runMonth800
	*  @param value
	**/
   public void setRunMonth800(char[] value) throws CFException {
      work.setRunMonth800(value);
   } 

	/**
	 *	Returns the value of startExecMsg600
	 *	@return startExecMsg600
	 */
   public char[] getStartExecMsg600() throws CFException  {              
   		return work.getStartExecMsg600();
   }

  
	/**
	*  set variable startExecMsg600
	*  @param value
	**/
   public void setStartExecMsg600(char[] value) throws CFException {
      work.setStartExecMsg600(value);
   } 


        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
        }

        public BuildBegMsgOutCtx getBuildBegMsgOutCtx() {
            return new BuildBegMsgOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += funcCurrentDate800.hashCode();
        str += compileMsg600.hashCode();
        str += funcWhenCompiled800.hashCode();
        str += currentRunMsg600.hashCode();
        str += work.hashCode();
        str += hdrLine1201.hashCode();
       return str.hashCode();
    }

    public BuildBegMsgInCtx clone() {
        BuildBegMsgInCtx cloneObj = new BuildBegMsgInCtx();
        cloneObj.funcCurrentDate800 = new FuncCurrentDate800();
        cloneObj.funcCurrentDate800.set(funcCurrentDate800.getClonedField());
        cloneObj.compileMsg600 = new CompileMsg600();
        cloneObj.compileMsg600.set(compileMsg600.getClonedField());
        cloneObj.funcWhenCompiled800 = new FuncWhenCompiled800();
        cloneObj.funcWhenCompiled800.set(funcWhenCompiled800.getClonedField());
        cloneObj.currentRunMsg600 = new CurrentRunMsg600();
        cloneObj.currentRunMsg600.set(currentRunMsg600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.hdrLine1201 = new HdrLine1201();
        cloneObj.hdrLine1201.set(hdrLine1201.getClonedField());
        return cloneObj;
    }

    }

    public BuildBegMsgInCtx getBuildBegMsgInCtx() {
            return new BuildBegMsgInCtx();
    }
     public class BuildBegMsgOutCtx implements Cloneable {
     FuncCurrentDate800 funcCurrentDate800 = Sf327010Ctx.this.getFuncCurrentDate800();
     CompileMsg600 compileMsg600 = Sf327010Ctx.this.getCompileMsg600();
     FuncWhenCompiled800 funcWhenCompiled800 = Sf327010Ctx.this.getFuncWhenCompiled800();
     CurrentRunMsg600 currentRunMsg600 = Sf327010Ctx.this.getCurrentRunMsg600();
     Work work = Sf327010Ctx.this.getWork();
     HdrLine1201 hdrLine1201 = Sf327010Ctx.this.getHdrLine1201();

	/**
	 *	Returns the value of funcCurrentDate800
	 *	@return funcCurrentDate800
	 */   
	 public FuncCurrentDate800 getFuncCurrentDate800() {
   	return funcCurrentDate800;
   }


	/**
	 *	Returns the value of whenDateYyyy800
	 *	@return whenDateYyyy800
	 */
   public char[] getWhenDateYyyy800() throws CFException  {              
   		return funcWhenCompiled800.getWhenCompDate800().getWhenDateYyyy800();
   }

  
	/**
	*  set variable whenDateYyyy800
	*  @param value
	**/
   public void setWhenDateYyyy800(char[] value) throws CFException {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateYyyy800(value);
   } 

     /**
	 * 	Update WhenDateYyyy800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWhenDateYyyy800(char[] source, int sourceIndex) throws CFException {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateYyyy800(source, sourceIndex);
   	
   }
   
   public void setWhenDateYyyy800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateYyyy800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WhenDateYyyy800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWhenDateYyyy800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateYyyy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WhenDateYyyy800 with another Field
	 *	@param value
	 */
   public void setWhenDateYyyy800(Field source) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateYyyy800(source);
   }  
   
     /**
	 * 	Update WhenDateYyyy800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWhenDateYyyy800(Field source, int sourceIndex,int sourceLen) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateYyyy800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WhenDateYyyy800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWhenDateYyyy800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateYyyy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of compDateDd600
	 *	@return compDateDd600
	 */
   public char[] getCompDateDd600() throws CFException  {              
   		return compileMsg600.getCompileDate600().getCompDateDd600();
   }

  
	/**
	*  set variable compDateDd600
	*  @param value
	**/
   public void setCompDateDd600(char[] value) throws CFException {
      compileMsg600.getCompileDate600().setCompDateDd600(value);
   } 

     /**
	 * 	Update CompDateDd600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompDateDd600(char[] source, int sourceIndex) throws CFException {
      compileMsg600.getCompileDate600().setCompDateDd600(source, sourceIndex);
   	
   }
   
   public void setCompDateDd600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      compileMsg600.getCompileDate600().setCompDateDd600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CompDateDd600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompDateDd600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileMsg600.getCompileDate600().setCompDateDd600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CompDateDd600 with another Field
	 *	@param value
	 */
   public void setCompDateDd600(Field source) {
      compileMsg600.getCompileDate600().setCompDateDd600(source);
   }  
   
     /**
	 * 	Update CompDateDd600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompDateDd600(Field source, int sourceIndex,int sourceLen) {
      compileMsg600.getCompileDate600().setCompDateDd600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CompDateDd600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompDateDd600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileMsg600.getCompileDate600().setCompDateDd600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of whenTimeHh800
	 *	@return whenTimeHh800
	 */
   public char[] getWhenTimeHh800() throws CFException  {              
   		return funcWhenCompiled800.getWhenCompTime800().getWhenTimeHh800();
   }

  
	/**
	*  set variable whenTimeHh800
	*  @param value
	**/
   public void setWhenTimeHh800(char[] value) throws CFException {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeHh800(value);
   } 

     /**
	 * 	Update WhenTimeHh800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWhenTimeHh800(char[] source, int sourceIndex) throws CFException {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeHh800(source, sourceIndex);
   	
   }
   
   public void setWhenTimeHh800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeHh800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WhenTimeHh800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWhenTimeHh800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WhenTimeHh800 with another Field
	 *	@param value
	 */
   public void setWhenTimeHh800(Field source) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeHh800(source);
   }  
   
     /**
	 * 	Update WhenTimeHh800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWhenTimeHh800(Field source, int sourceIndex,int sourceLen) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeHh800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WhenTimeHh800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWhenTimeHh800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of compTimeMm600
	 *	@return compTimeMm600
	 */
   public char[] getCompTimeMm600() throws CFException  {              
   		return compileMsg600.getCompileTime600().getCompTimeMm600();
   }

  
	/**
	*  set variable compTimeMm600
	*  @param value
	**/
   public void setCompTimeMm600(char[] value) throws CFException {
      compileMsg600.getCompileTime600().setCompTimeMm600(value);
   } 

     /**
	 * 	Update CompTimeMm600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompTimeMm600(char[] source, int sourceIndex) throws CFException {
      compileMsg600.getCompileTime600().setCompTimeMm600(source, sourceIndex);
   	
   }
   
   public void setCompTimeMm600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      compileMsg600.getCompileTime600().setCompTimeMm600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CompTimeMm600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeMm600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileMsg600.getCompileTime600().setCompTimeMm600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CompTimeMm600 with another Field
	 *	@param value
	 */
   public void setCompTimeMm600(Field source) {
      compileMsg600.getCompileTime600().setCompTimeMm600(source);
   }  
   
     /**
	 * 	Update CompTimeMm600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompTimeMm600(Field source, int sourceIndex,int sourceLen) {
      compileMsg600.getCompileTime600().setCompTimeMm600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CompTimeMm600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeMm600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileMsg600.getCompileTime600().setCompTimeMm600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currTimeHh600
	 *	@return currTimeHh600
	 */
   public char[] getCurrTimeHh600() throws CFException  {              
   		return currentRunMsg600.getCurrentTime600().getCurrTimeHh600();
   }

  
	/**
	*  set variable currTimeHh600
	*  @param value
	**/
   public void setCurrTimeHh600(char[] value) throws CFException {
      currentRunMsg600.getCurrentTime600().setCurrTimeHh600(value);
   } 

     /**
	 * 	Update CurrTimeHh600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrTimeHh600(char[] source, int sourceIndex) throws CFException {
      currentRunMsg600.getCurrentTime600().setCurrTimeHh600(source, sourceIndex);
   	
   }
   
   public void setCurrTimeHh600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      currentRunMsg600.getCurrentTime600().setCurrTimeHh600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrTimeHh600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeHh600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentRunMsg600.getCurrentTime600().setCurrTimeHh600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrTimeHh600 with another Field
	 *	@param value
	 */
   public void setCurrTimeHh600(Field source) {
      currentRunMsg600.getCurrentTime600().setCurrTimeHh600(source);
   }  
   
     /**
	 * 	Update CurrTimeHh600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrTimeHh600(Field source, int sourceIndex,int sourceLen) {
      currentRunMsg600.getCurrentTime600().setCurrTimeHh600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrTimeHh600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeHh600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentRunMsg600.getCurrentTime600().setCurrTimeHh600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currDateYyyy600
	 *	@return currDateYyyy600
	 */
   public char[] getCurrDateYyyy600() throws CFException  {              
   		return currentRunMsg600.getCurrentDate600().getCurrDateYyyy600();
   }

  
	/**
	*  set variable currDateYyyy600
	*  @param value
	**/
   public void setCurrDateYyyy600(char[] value) throws CFException {
      currentRunMsg600.getCurrentDate600().setCurrDateYyyy600(value);
   } 

     /**
	 * 	Update CurrDateYyyy600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrDateYyyy600(char[] source, int sourceIndex) throws CFException {
      currentRunMsg600.getCurrentDate600().setCurrDateYyyy600(source, sourceIndex);
   	
   }
   
   public void setCurrDateYyyy600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      currentRunMsg600.getCurrentDate600().setCurrDateYyyy600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrDateYyyy600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateYyyy600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentRunMsg600.getCurrentDate600().setCurrDateYyyy600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrDateYyyy600 with another Field
	 *	@param value
	 */
   public void setCurrDateYyyy600(Field source) {
      currentRunMsg600.getCurrentDate600().setCurrDateYyyy600(source);
   }  
   
     /**
	 * 	Update CurrDateYyyy600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrDateYyyy600(Field source, int sourceIndex,int sourceLen) {
      currentRunMsg600.getCurrentDate600().setCurrDateYyyy600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrDateYyyy600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateYyyy600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentRunMsg600.getCurrentDate600().setCurrDateYyyy600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of runDate201
	 *	@return runDate201
	 */
   public char[] getRunDate201() throws CFException  {              
   		return hdrLine1201.getRunDate201();
   }

  
	/**
	*  set variable runDate201
	*  @param value
	**/
   public void setRunDate201(char[] value) throws CFException {
      hdrLine1201.setRunDate201(value);
   } 

     /**
	 * 	Update RunDate201 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRunDate201(char[] source, int sourceIndex) throws CFException {
      hdrLine1201.setRunDate201(source, sourceIndex);
   	
   }
   
   public void setRunDate201(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hdrLine1201.setRunDate201(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RunDate201 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRunDate201(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrLine1201.setRunDate201(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RunDate201 with another Field
	 *	@param value
	 */
   public void setRunDate201(Field source) {
      hdrLine1201.setRunDate201(source);
   }  
   
     /**
	 * 	Update RunDate201 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRunDate201(Field source, int sourceIndex,int sourceLen) {
      hdrLine1201.setRunDate201(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RunDate201 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRunDate201(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrLine1201.setRunDate201(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of whenDateMm800
	 *	@return whenDateMm800
	 */
   public char[] getWhenDateMm800() throws CFException  {              
   		return funcWhenCompiled800.getWhenCompDate800().getWhenDateMm800();
   }

  
	/**
	*  set variable whenDateMm800
	*  @param value
	**/
   public void setWhenDateMm800(char[] value) throws CFException {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateMm800(value);
   } 

     /**
	 * 	Update WhenDateMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWhenDateMm800(char[] source, int sourceIndex) throws CFException {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateMm800(source, sourceIndex);
   	
   }
   
   public void setWhenDateMm800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateMm800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WhenDateMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWhenDateMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WhenDateMm800 with another Field
	 *	@param value
	 */
   public void setWhenDateMm800(Field source) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateMm800(source);
   }  
   
     /**
	 * 	Update WhenDateMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWhenDateMm800(Field source, int sourceIndex,int sourceLen) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateMm800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WhenDateMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWhenDateMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of runYear201
	 *	@return runYear201
	 */
   public char[] getRunYear201() throws CFException  {              
   		return hdrLine1201.getRunYear201();
   }

  
	/**
	*  set variable runYear201
	*  @param value
	**/
   public void setRunYear201(char[] value) throws CFException {
      hdrLine1201.setRunYear201(value);
   } 

     /**
	 * 	Update RunYear201 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRunYear201(char[] source, int sourceIndex) throws CFException {
      hdrLine1201.setRunYear201(source, sourceIndex);
   	
   }
   
   public void setRunYear201(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hdrLine1201.setRunYear201(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RunYear201 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRunYear201(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrLine1201.setRunYear201(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RunYear201 with another Field
	 *	@param value
	 */
   public void setRunYear201(Field source) {
      hdrLine1201.setRunYear201(source);
   }  
   
     /**
	 * 	Update RunYear201 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRunYear201(Field source, int sourceIndex,int sourceLen) {
      hdrLine1201.setRunYear201(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RunYear201 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRunYear201(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrLine1201.setRunYear201(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currDateMm600
	 *	@return currDateMm600
	 */
   public char[] getCurrDateMm600() throws CFException  {              
   		return currentRunMsg600.getCurrentDate600().getCurrDateMm600();
   }

  
	/**
	*  set variable currDateMm600
	*  @param value
	**/
   public void setCurrDateMm600(char[] value) throws CFException {
      currentRunMsg600.getCurrentDate600().setCurrDateMm600(value);
   } 

     /**
	 * 	Update CurrDateMm600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrDateMm600(char[] source, int sourceIndex) throws CFException {
      currentRunMsg600.getCurrentDate600().setCurrDateMm600(source, sourceIndex);
   	
   }
   
   public void setCurrDateMm600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      currentRunMsg600.getCurrentDate600().setCurrDateMm600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrDateMm600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateMm600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentRunMsg600.getCurrentDate600().setCurrDateMm600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrDateMm600 with another Field
	 *	@param value
	 */
   public void setCurrDateMm600(Field source) {
      currentRunMsg600.getCurrentDate600().setCurrDateMm600(source);
   }  
   
     /**
	 * 	Update CurrDateMm600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrDateMm600(Field source, int sourceIndex,int sourceLen) {
      currentRunMsg600.getCurrentDate600().setCurrDateMm600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrDateMm600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateMm600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentRunMsg600.getCurrentDate600().setCurrDateMm600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currDateDd600
	 *	@return currDateDd600
	 */
   public char[] getCurrDateDd600() throws CFException  {              
   		return currentRunMsg600.getCurrentDate600().getCurrDateDd600();
   }

  
	/**
	*  set variable currDateDd600
	*  @param value
	**/
   public void setCurrDateDd600(char[] value) throws CFException {
      currentRunMsg600.getCurrentDate600().setCurrDateDd600(value);
   } 

     /**
	 * 	Update CurrDateDd600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrDateDd600(char[] source, int sourceIndex) throws CFException {
      currentRunMsg600.getCurrentDate600().setCurrDateDd600(source, sourceIndex);
   	
   }
   
   public void setCurrDateDd600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      currentRunMsg600.getCurrentDate600().setCurrDateDd600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrDateDd600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateDd600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentRunMsg600.getCurrentDate600().setCurrDateDd600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrDateDd600 with another Field
	 *	@param value
	 */
   public void setCurrDateDd600(Field source) {
      currentRunMsg600.getCurrentDate600().setCurrDateDd600(source);
   }  
   
     /**
	 * 	Update CurrDateDd600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrDateDd600(Field source, int sourceIndex,int sourceLen) {
      currentRunMsg600.getCurrentDate600().setCurrDateDd600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrDateDd600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateDd600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentRunMsg600.getCurrentDate600().setCurrDateDd600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of compTimeSs600
	 *	@return compTimeSs600
	 */
   public char[] getCompTimeSs600() throws CFException  {              
   		return compileMsg600.getCompileTime600().getCompTimeSs600();
   }

  
	/**
	*  set variable compTimeSs600
	*  @param value
	**/
   public void setCompTimeSs600(char[] value) throws CFException {
      compileMsg600.getCompileTime600().setCompTimeSs600(value);
   } 

     /**
	 * 	Update CompTimeSs600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompTimeSs600(char[] source, int sourceIndex) throws CFException {
      compileMsg600.getCompileTime600().setCompTimeSs600(source, sourceIndex);
   	
   }
   
   public void setCompTimeSs600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      compileMsg600.getCompileTime600().setCompTimeSs600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CompTimeSs600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeSs600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileMsg600.getCompileTime600().setCompTimeSs600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CompTimeSs600 with another Field
	 *	@param value
	 */
   public void setCompTimeSs600(Field source) {
      compileMsg600.getCompileTime600().setCompTimeSs600(source);
   }  
   
     /**
	 * 	Update CompTimeSs600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompTimeSs600(Field source, int sourceIndex,int sourceLen) {
      compileMsg600.getCompileTime600().setCompTimeSs600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CompTimeSs600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeSs600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileMsg600.getCompileTime600().setCompTimeSs600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of whenDateDd800
	 *	@return whenDateDd800
	 */
   public char[] getWhenDateDd800() throws CFException  {              
   		return funcWhenCompiled800.getWhenCompDate800().getWhenDateDd800();
   }

  
	/**
	*  set variable whenDateDd800
	*  @param value
	**/
   public void setWhenDateDd800(char[] value) throws CFException {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateDd800(value);
   } 

     /**
	 * 	Update WhenDateDd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWhenDateDd800(char[] source, int sourceIndex) throws CFException {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateDd800(source, sourceIndex);
   	
   }
   
   public void setWhenDateDd800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateDd800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WhenDateDd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWhenDateDd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WhenDateDd800 with another Field
	 *	@param value
	 */
   public void setWhenDateDd800(Field source) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateDd800(source);
   }  
   
     /**
	 * 	Update WhenDateDd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWhenDateDd800(Field source, int sourceIndex,int sourceLen) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateDd800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WhenDateDd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWhenDateDd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompDate800().setWhenDateDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currDateMm800
	 *	@return currDateMm800
	 */
   public char[] getCurrDateMm800() throws CFException  {              
   		return funcCurrentDate800.getFuncCurrDate800().getCurrDateMm800();
   }

  
	/**
	*  set variable currDateMm800
	*  @param value
	**/
   public void setCurrDateMm800(char[] value) throws CFException {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(value);
   } 

     /**
	 * 	Update CurrDateMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrDateMm800(char[] source, int sourceIndex) throws CFException {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(source, sourceIndex);
   	
   }
   
   public void setCurrDateMm800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrDateMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrDateMm800 with another Field
	 *	@param value
	 */
   public void setCurrDateMm800(Field source) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(source);
   }  
   
     /**
	 * 	Update CurrDateMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrDateMm800(Field source, int sourceIndex,int sourceLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrDateMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of funcWhenCompiled800
	 *	@return funcWhenCompiled800
	 */   
	 public FuncWhenCompiled800 getFuncWhenCompiled800() {
   	return funcWhenCompiled800;
   }


	/**
	 *	Returns the value of compTimeHh600
	 *	@return compTimeHh600
	 */
   public char[] getCompTimeHh600() throws CFException  {              
   		return compileMsg600.getCompileTime600().getCompTimeHh600();
   }

  
	/**
	*  set variable compTimeHh600
	*  @param value
	**/
   public void setCompTimeHh600(char[] value) throws CFException {
      compileMsg600.getCompileTime600().setCompTimeHh600(value);
   } 

     /**
	 * 	Update CompTimeHh600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompTimeHh600(char[] source, int sourceIndex) throws CFException {
      compileMsg600.getCompileTime600().setCompTimeHh600(source, sourceIndex);
   	
   }
   
   public void setCompTimeHh600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      compileMsg600.getCompileTime600().setCompTimeHh600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CompTimeHh600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeHh600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileMsg600.getCompileTime600().setCompTimeHh600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CompTimeHh600 with another Field
	 *	@param value
	 */
   public void setCompTimeHh600(Field source) {
      compileMsg600.getCompileTime600().setCompTimeHh600(source);
   }  
   
     /**
	 * 	Update CompTimeHh600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompTimeHh600(Field source, int sourceIndex,int sourceLen) {
      compileMsg600.getCompileTime600().setCompTimeHh600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CompTimeHh600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeHh600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileMsg600.getCompileTime600().setCompTimeHh600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currTimeMm600
	 *	@return currTimeMm600
	 */
   public char[] getCurrTimeMm600() throws CFException  {              
   		return currentRunMsg600.getCurrentTime600().getCurrTimeMm600();
   }

  
	/**
	*  set variable currTimeMm600
	*  @param value
	**/
   public void setCurrTimeMm600(char[] value) throws CFException {
      currentRunMsg600.getCurrentTime600().setCurrTimeMm600(value);
   } 

     /**
	 * 	Update CurrTimeMm600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrTimeMm600(char[] source, int sourceIndex) throws CFException {
      currentRunMsg600.getCurrentTime600().setCurrTimeMm600(source, sourceIndex);
   	
   }
   
   public void setCurrTimeMm600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      currentRunMsg600.getCurrentTime600().setCurrTimeMm600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrTimeMm600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeMm600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentRunMsg600.getCurrentTime600().setCurrTimeMm600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrTimeMm600 with another Field
	 *	@param value
	 */
   public void setCurrTimeMm600(Field source) {
      currentRunMsg600.getCurrentTime600().setCurrTimeMm600(source);
   }  
   
     /**
	 * 	Update CurrTimeMm600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrTimeMm600(Field source, int sourceIndex,int sourceLen) {
      currentRunMsg600.getCurrentTime600().setCurrTimeMm600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrTimeMm600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeMm600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentRunMsg600.getCurrentTime600().setCurrTimeMm600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of runMonth800
	 *	@return runMonth800
	 */
   public char[] getRunMonth800() throws CFException  {              
   		return work.getRunMonth800();
   }

  
	/**
	*  set variable runMonth800
	*  @param value
	**/
   public void setRunMonth800(char[] value) throws CFException {
      work.setRunMonth800(value);
   } 

	/**
	 *	Returns the value of currDateYyyy800
	 *	@return currDateYyyy800
	 */
   public char[] getCurrDateYyyy800() throws CFException  {              
   		return funcCurrentDate800.getFuncCurrDate800().getCurrDateYyyy800();
   }

  
	/**
	*  set variable currDateYyyy800
	*  @param value
	**/
   public void setCurrDateYyyy800(char[] value) throws CFException {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(value);
   } 

     /**
	 * 	Update CurrDateYyyy800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrDateYyyy800(char[] source, int sourceIndex) throws CFException {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(source, sourceIndex);
   	
   }
   
   public void setCurrDateYyyy800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrDateYyyy800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateYyyy800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrDateYyyy800 with another Field
	 *	@param value
	 */
   public void setCurrDateYyyy800(Field source) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(source);
   }  
   
     /**
	 * 	Update CurrDateYyyy800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrDateYyyy800(Field source, int sourceIndex,int sourceLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrDateYyyy800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateYyyy800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateYyyy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currDateDd800
	 *	@return currDateDd800
	 */
   public char[] getCurrDateDd800() throws CFException  {              
   		return funcCurrentDate800.getFuncCurrDate800().getCurrDateDd800();
   }

  
	/**
	*  set variable currDateDd800
	*  @param value
	**/
   public void setCurrDateDd800(char[] value) throws CFException {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(value);
   } 

     /**
	 * 	Update CurrDateDd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrDateDd800(char[] source, int sourceIndex) throws CFException {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(source, sourceIndex);
   	
   }
   
   public void setCurrDateDd800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrDateDd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateDd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrDateDd800 with another Field
	 *	@param value
	 */
   public void setCurrDateDd800(Field source) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(source);
   }  
   
     /**
	 * 	Update CurrDateDd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrDateDd800(Field source, int sourceIndex,int sourceLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrDateDd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrDateDd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrDate800().setCurrDateDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currTimeSs600
	 *	@return currTimeSs600
	 */
   public char[] getCurrTimeSs600() throws CFException  {              
   		return currentRunMsg600.getCurrentTime600().getCurrTimeSs600();
   }

  
	/**
	*  set variable currTimeSs600
	*  @param value
	**/
   public void setCurrTimeSs600(char[] value) throws CFException {
      currentRunMsg600.getCurrentTime600().setCurrTimeSs600(value);
   } 

     /**
	 * 	Update CurrTimeSs600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrTimeSs600(char[] source, int sourceIndex) throws CFException {
      currentRunMsg600.getCurrentTime600().setCurrTimeSs600(source, sourceIndex);
   	
   }
   
   public void setCurrTimeSs600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      currentRunMsg600.getCurrentTime600().setCurrTimeSs600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrTimeSs600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeSs600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentRunMsg600.getCurrentTime600().setCurrTimeSs600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrTimeSs600 with another Field
	 *	@param value
	 */
   public void setCurrTimeSs600(Field source) {
      currentRunMsg600.getCurrentTime600().setCurrTimeSs600(source);
   }  
   
     /**
	 * 	Update CurrTimeSs600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrTimeSs600(Field source, int sourceIndex,int sourceLen) {
      currentRunMsg600.getCurrentTime600().setCurrTimeSs600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrTimeSs600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeSs600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentRunMsg600.getCurrentTime600().setCurrTimeSs600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of compDateMm600
	 *	@return compDateMm600
	 */
   public char[] getCompDateMm600() throws CFException  {              
   		return compileMsg600.getCompileDate600().getCompDateMm600();
   }

  
	/**
	*  set variable compDateMm600
	*  @param value
	**/
   public void setCompDateMm600(char[] value) throws CFException {
      compileMsg600.getCompileDate600().setCompDateMm600(value);
   } 

     /**
	 * 	Update CompDateMm600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompDateMm600(char[] source, int sourceIndex) throws CFException {
      compileMsg600.getCompileDate600().setCompDateMm600(source, sourceIndex);
   	
   }
   
   public void setCompDateMm600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      compileMsg600.getCompileDate600().setCompDateMm600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CompDateMm600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompDateMm600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileMsg600.getCompileDate600().setCompDateMm600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CompDateMm600 with another Field
	 *	@param value
	 */
   public void setCompDateMm600(Field source) {
      compileMsg600.getCompileDate600().setCompDateMm600(source);
   }  
   
     /**
	 * 	Update CompDateMm600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompDateMm600(Field source, int sourceIndex,int sourceLen) {
      compileMsg600.getCompileDate600().setCompDateMm600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CompDateMm600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompDateMm600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileMsg600.getCompileDate600().setCompDateMm600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of compDateYyyy600
	 *	@return compDateYyyy600
	 */
   public char[] getCompDateYyyy600() throws CFException  {              
   		return compileMsg600.getCompileDate600().getCompDateYyyy600();
   }

  
	/**
	*  set variable compDateYyyy600
	*  @param value
	**/
   public void setCompDateYyyy600(char[] value) throws CFException {
      compileMsg600.getCompileDate600().setCompDateYyyy600(value);
   } 

     /**
	 * 	Update CompDateYyyy600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompDateYyyy600(char[] source, int sourceIndex) throws CFException {
      compileMsg600.getCompileDate600().setCompDateYyyy600(source, sourceIndex);
   	
   }
   
   public void setCompDateYyyy600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      compileMsg600.getCompileDate600().setCompDateYyyy600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CompDateYyyy600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompDateYyyy600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileMsg600.getCompileDate600().setCompDateYyyy600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CompDateYyyy600 with another Field
	 *	@param value
	 */
   public void setCompDateYyyy600(Field source) {
      compileMsg600.getCompileDate600().setCompDateYyyy600(source);
   }  
   
     /**
	 * 	Update CompDateYyyy600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompDateYyyy600(Field source, int sourceIndex,int sourceLen) {
      compileMsg600.getCompileDate600().setCompDateYyyy600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CompDateYyyy600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompDateYyyy600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileMsg600.getCompileDate600().setCompDateYyyy600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of mnthMmNum100
	 *	@return mnthMmNum100
	 */
   public char[] getMnthMmNum100() throws CFException  {              
   		return work.getMnthMmNum100();
   }

  
	/**
	*  set variable mnthMmNum100
	*  @param value
	**/
   public void setMnthMmNum100(char[] value) throws CFException {
      work.setMnthMmNum100(value);
   } 

	/**
	 *	Returns the value of whenTimeMm800
	 *	@return whenTimeMm800
	 */
   public char[] getWhenTimeMm800() throws CFException  {              
   		return funcWhenCompiled800.getWhenCompTime800().getWhenTimeMm800();
   }

  
	/**
	*  set variable whenTimeMm800
	*  @param value
	**/
   public void setWhenTimeMm800(char[] value) throws CFException {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeMm800(value);
   } 

     /**
	 * 	Update WhenTimeMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWhenTimeMm800(char[] source, int sourceIndex) throws CFException {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeMm800(source, sourceIndex);
   	
   }
   
   public void setWhenTimeMm800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeMm800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WhenTimeMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWhenTimeMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WhenTimeMm800 with another Field
	 *	@param value
	 */
   public void setWhenTimeMm800(Field source) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeMm800(source);
   }  
   
     /**
	 * 	Update WhenTimeMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWhenTimeMm800(Field source, int sourceIndex,int sourceLen) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeMm800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WhenTimeMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWhenTimeMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of whenTimeSs800
	 *	@return whenTimeSs800
	 */
   public char[] getWhenTimeSs800() throws CFException  {              
   		return funcWhenCompiled800.getWhenCompTime800().getWhenTimeSs800();
   }

  
	/**
	*  set variable whenTimeSs800
	*  @param value
	**/
   public void setWhenTimeSs800(char[] value) throws CFException {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeSs800(value);
   } 

     /**
	 * 	Update WhenTimeSs800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWhenTimeSs800(char[] source, int sourceIndex) throws CFException {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeSs800(source, sourceIndex);
   	
   }
   
   public void setWhenTimeSs800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeSs800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WhenTimeSs800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWhenTimeSs800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeSs800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WhenTimeSs800 with another Field
	 *	@param value
	 */
   public void setWhenTimeSs800(Field source) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeSs800(source);
   }  
   
     /**
	 * 	Update WhenTimeSs800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWhenTimeSs800(Field source, int sourceIndex,int sourceLen) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeSs800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WhenTimeSs800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWhenTimeSs800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcWhenCompiled800.getWhenCompTime800().setWhenTimeSs800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of runMonth201
	 *	@return runMonth201
	 */
   public char[] getRunMonth201() throws CFException  {              
   		return hdrLine1201.getRunMonth201();
   }

  
	/**
	*  set variable runMonth201
	*  @param value
	**/
   public void setRunMonth201(char[] value) throws CFException {
      hdrLine1201.setRunMonth201(value);
   } 

     /**
	 * 	Update RunMonth201 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRunMonth201(char[] source, int sourceIndex) throws CFException {
      hdrLine1201.setRunMonth201(source, sourceIndex);
   	
   }
   
   public void setRunMonth201(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hdrLine1201.setRunMonth201(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RunMonth201 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRunMonth201(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrLine1201.setRunMonth201(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RunMonth201 with another Field
	 *	@param value
	 */
   public void setRunMonth201(Field source) {
      hdrLine1201.setRunMonth201(source);
   }  
   
     /**
	 * 	Update RunMonth201 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRunMonth201(Field source, int sourceIndex,int sourceLen) {
      hdrLine1201.setRunMonth201(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RunMonth201 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRunMonth201(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrLine1201.setRunMonth201(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += funcCurrentDate800.hashCode();
        str += compileMsg600.hashCode();
        str += funcWhenCompiled800.hashCode();
        str += currentRunMsg600.hashCode();
        str += work.hashCode();
        str += hdrLine1201.hashCode();
       return str.hashCode();
    }

    public BuildBegMsgOutCtx clone() {
        BuildBegMsgOutCtx cloneObj = new BuildBegMsgOutCtx();
        cloneObj.funcCurrentDate800 = new FuncCurrentDate800();
        cloneObj.funcCurrentDate800.set(funcCurrentDate800.getClonedField());
        cloneObj.compileMsg600 = new CompileMsg600();
        cloneObj.compileMsg600.set(compileMsg600.getClonedField());
        cloneObj.funcWhenCompiled800 = new FuncWhenCompiled800();
        cloneObj.funcWhenCompiled800.set(funcWhenCompiled800.getClonedField());
        cloneObj.currentRunMsg600 = new CurrentRunMsg600();
        cloneObj.currentRunMsg600.set(currentRunMsg600.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.hdrLine1201 = new HdrLine1201();
        cloneObj.hdrLine1201.set(hdrLine1201.getClonedField());
        return cloneObj;
    }

    }

    public BuildBegMsgOutCtx getBuildBegMsgOutCtx() {
            return new BuildBegMsgOutCtx();
    }
     public class OpenFilesInCtx implements Cloneable {
     Group1 group1 = Sf327010Ctx.this.getGroup1();
     Sys201AsaServerRec sys201AsaServerRec = Sf327010Ctx.this.getSys201AsaServerRec();

	/**
	 *	Returns the value of group1
	 *	@return group1
	 */   
	 public Group1 getGroup1() {
   	return group1;
   }


	/**
	 *	Returns the value of sys201AsaServerRec
	 *	@return sys201AsaServerRec
	 */   
	 public Sys201AsaServerRec getSys201AsaServerRec() {
   	return sys201AsaServerRec;
   }



        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += group1.hashCode();
        str += sys201AsaServerRec.hashCode();
       return str.hashCode();
    }

    public OpenFilesInCtx clone() {
        OpenFilesInCtx cloneObj = new OpenFilesInCtx();
        cloneObj.group1 = new Group1();
        cloneObj.group1.set(group1.getClonedField());
        cloneObj.sys201AsaServerRec = new Sys201AsaServerRec();
        cloneObj.sys201AsaServerRec.set(sys201AsaServerRec.getClonedField());
        return cloneObj;
    }

    }

    public OpenFilesInCtx getOpenFilesInCtx() {
            return new OpenFilesInCtx();
    }
     public class GenerateEmptyDtlInCtx implements Cloneable {
     Work work = Sf327010Ctx.this.getWork();
     Sys201AsaServerRec sys201AsaServerRec = Sf327010Ctx.this.getSys201AsaServerRec();

	/**
	 *	Returns the value of plus4300
	 *	@return plus4300
	 */
	public int getPlus4300() throws CFException {
   		return work.getPlus4300();
	}


	/**
	 *	Returns String value of plus4300
	 *	@return plus4300
	 */
	public char[]  getPlus4300String() throws CFException {
	     return String.valueOf(work.getPlus4300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plus4300IsNumeric()  throws CFException{
	    return work.plus4300IsNumeric();
	}

	/**
	 * 	Update Plus4300 with the passed value
	 *	@param number
	 */
	public void setPlus4300(int number)  throws CFException{
		work.setPlus4300(number);
	}
	

	public void setPlus4300(long number)  throws CFException{
	    work.setPlus4300(number);
	}
	
	
	/**
	 * 	Update Plus4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlus4300(char[] value)  throws CFException {
		work.setPlus4300(value);
	}
	
	/**
	 * 	Update Plus4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlus4300String(char[] value)  throws CFException{
		work.setPlus4300(value);
	}	

	/**
	 *	Returns the value of sys201AsaServerRec
	 *	@return sys201AsaServerRec
	 */   
	 public Sys201AsaServerRec getSys201AsaServerRec() {
   	return sys201AsaServerRec;
   }


	/**
	 *	Returns the value of num4300
	 *	@return num4300
	 */
	public int getNum4300() throws CFException {
   		return work.getNum4300();
	}


	/**
	 *	Returns String value of num4300
	 *	@return num4300
	 */
	public char[]  getNum4300String() throws CFException {
	     return String.valueOf(work.getNum4300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num4300IsNumeric()  throws CFException{
	    return work.num4300IsNumeric();
	}

	/**
	 * 	Update Num4300 with the passed value
	 *	@param number
	 */
	public void setNum4300(int number)  throws CFException{
		work.setNum4300(number);
	}
	

	public void setNum4300(long number)  throws CFException{
	    work.setNum4300(number);
	}
	
	
	/**
	 * 	Update Num4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum4300(char[] value)  throws CFException {
		work.setNum4300(value);
	}
	
	/**
	 * 	Update Num4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum4300String(char[] value)  throws CFException{
		work.setNum4300(value);
	}	

public long getLineCount400() throws CFException {  
        return work.getLineCount400();
}
	/**
	 * 	Update LineCount400 with the passed value
	 *	@param number
	 */
	public void setLineCount400(long number)  throws CFException{
		work.setLineCount400(number);
	}



	/**
	 *	Returns the value of dtlLine2206
	 *	@return dtlLine2206
	 */
   public char[] getDtlLine2206() throws CFException  {              
   		return work.getDtlLine2206();
   }

  
	/**
	*  set variable dtlLine2206
	*  @param value
	**/
   public void setDtlLine2206(char[] value) throws CFException {
      work.setDtlLine2206(value);
   } 


        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
        }

        public GenerateEmptyDtlOutCtx getGenerateEmptyDtlOutCtx() {
            return new GenerateEmptyDtlOutCtx();
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
        str += sys201AsaServerRec.hashCode();
       return str.hashCode();
    }

    public GenerateEmptyDtlInCtx clone() {
        GenerateEmptyDtlInCtx cloneObj = new GenerateEmptyDtlInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys201AsaServerRec = new Sys201AsaServerRec();
        cloneObj.sys201AsaServerRec.set(sys201AsaServerRec.getClonedField());
        return cloneObj;
    }

    }

    public GenerateEmptyDtlInCtx getGenerateEmptyDtlInCtx() {
            return new GenerateEmptyDtlInCtx();
    }
     public class GenerateEmptyDtlOutCtx implements Cloneable {
     Work work = Sf327010Ctx.this.getWork();
     Sys201AsaServerRec sys201AsaServerRec = Sf327010Ctx.this.getSys201AsaServerRec();

	/**
	 *	Returns the value of sys201AsaServerRec
	 *	@return sys201AsaServerRec
	 */   
	 public Sys201AsaServerRec getSys201AsaServerRec() {
   	return sys201AsaServerRec;
   }


public long getLineCount400() throws CFException {  
        return work.getLineCount400();
}
	/**
	 * 	Update LineCount400 with the passed value
	 *	@param number
	 */
	public void setLineCount400(long number)  throws CFException{
		work.setLineCount400(number);
	}




        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
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
        str += sys201AsaServerRec.hashCode();
       return str.hashCode();
    }

    public GenerateEmptyDtlOutCtx clone() {
        GenerateEmptyDtlOutCtx cloneObj = new GenerateEmptyDtlOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys201AsaServerRec = new Sys201AsaServerRec();
        cloneObj.sys201AsaServerRec.set(sys201AsaServerRec.getClonedField());
        return cloneObj;
    }

    }

    public GenerateEmptyDtlOutCtx getGenerateEmptyDtlOutCtx() {
            return new GenerateEmptyDtlOutCtx();
    }
     public class ProcessInputInCtx implements Cloneable {
     Work work = Sf327010Ctx.this.getWork();

	/**
	 *	Test condition "Y" for isZLogEof88100()
	 *	@return  Returns true if isZLogEof88100() is "Y"
	 */
   public boolean isZLogEof88100() throws CFException {
      return work.isZLogEof88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setZLogEof88100True()  throws CFException{  			
    	work.setZLogEof88100True();
   	}

        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
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

    public ProcessInputInCtx clone() {
        ProcessInputInCtx cloneObj = new ProcessInputInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInputInCtx getProcessInputInCtx() {
            return new ProcessInputInCtx();
    }
     public class CompareBackupDataInCtx implements Cloneable {
     Work work = Sf327010Ctx.this.getWork();
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf327010Ctx.this.getSf528ExtractZLogRec();
     DtlLine1205 dtlLine1205 = Sf327010Ctx.this.getDtlLine1205();

	/**
	 *	Returns the value of sf528LogType
	 *	@return sf528LogType
	 */
   public char[] getSf528LogType() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528LogType();
   }

  
	/**
	*  set variable sf528LogType
	*  @param value
	**/
   public void setSf528LogType(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528LogType(value);
   } 

     /**
	 * 	Update Sf528LogType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528LogType(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex);
   	
   }
   
   public void setSf528LogType(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528LogType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528LogType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528LogType with another Field
	 *	@param value
	 */
   public void setSf528LogType(Field source) {
      sf528ExtractZLogRec.setSf528LogType(source);
   }  
   
     /**
	 * 	Update Sf528LogType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528LogType(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528LogType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528LogType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prevServerId800
	 *	@return prevServerId800
	 */
   public char[] getPrevServerId800() throws CFException  {              
   		return work.getPrevServerId800();
   }

  
	/**
	*  set variable prevServerId800
	*  @param value
	**/
   public void setPrevServerId800(char[] value) throws CFException {
      work.setPrevServerId800(value);
   } 

	/**
	 *	Returns the value of sf528ServerId
	 *	@return sf528ServerId
	 */
   public char[] getSf528ServerId() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServerId();
   }

  
	/**
	*  set variable sf528ServerId
	*  @param value
	**/
   public void setSf528ServerId(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528ServerId(value);
   } 

     /**
	 * 	Update Sf528ServerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServerId(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex);
   	
   }
   
   public void setSf528ServerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServerId with another Field
	 *	@param value
	 */
   public void setSf528ServerId(Field source) {
      sf528ExtractZLogRec.setSf528ServerId(source);
   }  
   
     /**
	 * 	Update Sf528ServerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServerId(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prevLogType800
	 *	@return prevLogType800
	 */
   public char[] getPrevLogType800() throws CFException  {              
   		return work.getPrevLogType800();
   }

  
	/**
	*  set variable prevLogType800
	*  @param value
	**/
   public void setPrevLogType800(char[] value) throws CFException {
      work.setPrevLogType800(value);
   } 

	/**
	 *	Returns the value of sf528ServiceId
	 *	@return sf528ServiceId
	 */
   public char[] getSf528ServiceId() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServiceId();
   }

  
	/**
	*  set variable sf528ServiceId
	*  @param value
	**/
   public void setSf528ServiceId(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceId(value);
   } 

     /**
	 * 	Update Sf528ServiceId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceId(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex);
   	
   }
   
   public void setSf528ServiceId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServiceId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServiceId with another Field
	 *	@param value
	 */
   public void setSf528ServiceId(Field source) {
      sf528ExtractZLogRec.setSf528ServiceId(source);
   }  
   
     /**
	 * 	Update Sf528ServiceId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceId(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServiceId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prevServiceId800
	 *	@return prevServiceId800
	 */
   public char[] getPrevServiceId800() throws CFException  {              
   		return work.getPrevServiceId800();
   }

  
	/**
	*  set variable prevServiceId800
	*  @param value
	**/
   public void setPrevServiceId800(char[] value) throws CFException {
      work.setPrevServiceId800(value);
   } 


        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
        }

        public CompareBackupDataOutCtx getCompareBackupDataOutCtx() {
            return new CompareBackupDataOutCtx();
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
        str += sf528ExtractZLogRec.hashCode();
        str += dtlLine1205.hashCode();
       return str.hashCode();
    }

    public CompareBackupDataInCtx clone() {
        CompareBackupDataInCtx cloneObj = new CompareBackupDataInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        cloneObj.dtlLine1205 = new DtlLine1205();
        cloneObj.dtlLine1205.set(dtlLine1205.getClonedField());
        return cloneObj;
    }

    }

    public CompareBackupDataInCtx getCompareBackupDataInCtx() {
            return new CompareBackupDataInCtx();
    }
     public class CompareBackupDataOutCtx implements Cloneable {
     Work work = Sf327010Ctx.this.getWork();
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf327010Ctx.this.getSf528ExtractZLogRec();
     DtlLine1205 dtlLine1205 = Sf327010Ctx.this.getDtlLine1205();

	/**
	 *	Returns the value of sf528LogType
	 *	@return sf528LogType
	 */
   public char[] getSf528LogType() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528LogType();
   }

  
	/**
	*  set variable sf528LogType
	*  @param value
	**/
   public void setSf528LogType(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528LogType(value);
   } 

     /**
	 * 	Update Sf528LogType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528LogType(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex);
   	
   }
   
   public void setSf528LogType(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528LogType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528LogType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528LogType with another Field
	 *	@param value
	 */
   public void setSf528LogType(Field source) {
      sf528ExtractZLogRec.setSf528LogType(source);
   }  
   
     /**
	 * 	Update Sf528LogType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528LogType(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528LogType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528LogType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of logType205
	 *	@return logType205
	 */
   public char[] getLogType205() throws CFException  {              
   		return dtlLine1205.getLogType205();
   }

  
	/**
	*  set variable logType205
	*  @param value
	**/
   public void setLogType205(char[] value) throws CFException {
      dtlLine1205.setLogType205(value);
   } 

     /**
	 * 	Update LogType205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogType205(char[] source, int sourceIndex) throws CFException {
      dtlLine1205.setLogType205(source, sourceIndex);
   	
   }
   
   public void setLogType205(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dtlLine1205.setLogType205(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LogType205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogType205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlLine1205.setLogType205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LogType205 with another Field
	 *	@param value
	 */
   public void setLogType205(Field source) {
      dtlLine1205.setLogType205(source);
   }  
   
     /**
	 * 	Update LogType205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogType205(Field source, int sourceIndex,int sourceLen) {
      dtlLine1205.setLogType205(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LogType205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogType205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlLine1205.setLogType205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
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
        str += sf528ExtractZLogRec.hashCode();
        str += dtlLine1205.hashCode();
       return str.hashCode();
    }

    public CompareBackupDataOutCtx clone() {
        CompareBackupDataOutCtx cloneObj = new CompareBackupDataOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        cloneObj.dtlLine1205 = new DtlLine1205();
        cloneObj.dtlLine1205.set(dtlLine1205.getClonedField());
        return cloneObj;
    }

    }

    public CompareBackupDataOutCtx getCompareBackupDataOutCtx() {
            return new CompareBackupDataOutCtx();
    }
     public class GenerateHdrInCtx implements Cloneable {
     HdrLine2202 hdrLine2202 = Sf327010Ctx.this.getHdrLine2202();
     Work work = Sf327010Ctx.this.getWork();
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf327010Ctx.this.getSf528ExtractZLogRec();

public short getMaxLinesPerPage300() throws CFException {  
        return work.getMaxLinesPerPage300();
}
	/**
	 * 	Update MaxLinesPerPage300 with the passed value
	 *	@param number
	 */
	public void setMaxLinesPerPage300(short number)  throws CFException{
		work.setMaxLinesPerPage300(number);
	}

	public void setMaxLinesPerPage300(int number)  throws CFException{
	   work.setMaxLinesPerPage300(number);
	}
	public void setMaxLinesPerPage300(long number)  throws CFException {
	    work.setMaxLinesPerPage300(number);
	}
	


	/**
	 *	Returns the value of sf528ServerId
	 *	@return sf528ServerId
	 */
   public char[] getSf528ServerId() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServerId();
   }

  
	/**
	*  set variable sf528ServerId
	*  @param value
	**/
   public void setSf528ServerId(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528ServerId(value);
   } 

     /**
	 * 	Update Sf528ServerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServerId(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex);
   	
   }
   
   public void setSf528ServerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServerId with another Field
	 *	@param value
	 */
   public void setSf528ServerId(Field source) {
      sf528ExtractZLogRec.setSf528ServerId(source);
   }  
   
     /**
	 * 	Update Sf528ServerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServerId(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of num0300
	 *	@return num0300
	 */
	public int getNum0300() throws CFException {
   		return work.getNum0300();
	}


	/**
	 *	Returns String value of num0300
	 *	@return num0300
	 */
	public char[]  getNum0300String() throws CFException {
	     return String.valueOf(work.getNum0300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num0300IsNumeric()  throws CFException{
	    return work.num0300IsNumeric();
	}

	/**
	 * 	Update Num0300 with the passed value
	 *	@param number
	 */
	public void setNum0300(int number)  throws CFException{
		work.setNum0300(number);
	}
	

	public void setNum0300(long number)  throws CFException{
	    work.setNum0300(number);
	}
	
	
	/**
	 * 	Update Num0300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum0300(char[] value)  throws CFException {
		work.setNum0300(value);
	}
	
	/**
	 * 	Update Num0300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum0300String(char[] value)  throws CFException{
		work.setNum0300(value);
	}	

	/**
	 *	Returns the value of plus1300
	 *	@return plus1300
	 */
	public int getPlus1300() throws CFException {
   		return work.getPlus1300();
	}


	/**
	 *	Returns String value of plus1300
	 *	@return plus1300
	 */
	public char[]  getPlus1300String() throws CFException {
	     return String.valueOf(work.getPlus1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plus1300IsNumeric()  throws CFException{
	    return work.plus1300IsNumeric();
	}

	/**
	 * 	Update Plus1300 with the passed value
	 *	@param number
	 */
	public void setPlus1300(int number)  throws CFException{
		work.setPlus1300(number);
	}
	

	public void setPlus1300(long number)  throws CFException{
	    work.setPlus1300(number);
	}
	
	
	/**
	 * 	Update Plus1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlus1300(char[] value)  throws CFException {
		work.setPlus1300(value);
	}
	
	/**
	 * 	Update Plus1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlus1300String(char[] value)  throws CFException{
		work.setPlus1300(value);
	}	

public long getLineCount400() throws CFException {  
        return work.getLineCount400();
}
	/**
	 * 	Update LineCount400 with the passed value
	 *	@param number
	 */
	public void setLineCount400(long number)  throws CFException{
		work.setLineCount400(number);
	}



public long getPageCount400() throws CFException {  
        return work.getPageCount400();
}
	/**
	 * 	Update PageCount400 with the passed value
	 *	@param number
	 */
	public void setPageCount400(long number)  throws CFException{
		work.setPageCount400(number);
	}




        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
        }

        public GenerateHdrOutCtx getGenerateHdrOutCtx() {
            return new GenerateHdrOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += hdrLine2202.hashCode();
        str += work.hashCode();
        str += sf528ExtractZLogRec.hashCode();
       return str.hashCode();
    }

    public GenerateHdrInCtx clone() {
        GenerateHdrInCtx cloneObj = new GenerateHdrInCtx();
        cloneObj.hdrLine2202 = new HdrLine2202();
        cloneObj.hdrLine2202.set(hdrLine2202.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        return cloneObj;
    }

    }

    public GenerateHdrInCtx getGenerateHdrInCtx() {
            return new GenerateHdrInCtx();
    }
     public class GenerateHdrOutCtx implements Cloneable {
     HdrLine2202 hdrLine2202 = Sf327010Ctx.this.getHdrLine2202();
     Work work = Sf327010Ctx.this.getWork();
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf327010Ctx.this.getSf528ExtractZLogRec();

	/**
	 *	Returns the value of pageCount202
	 *	@return pageCount202
	 */
   public char[] getPageCount202() throws CFException  {              
   		return hdrLine2202.getPageCount202();
   }

  
	/**
	*  set variable pageCount202
	*  @param value
	**/
   public void setPageCount202(char[] value) throws CFException {
      hdrLine2202.setPageCount202(value);
   } 

     /**
	 * 	Update PageCount202 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPageCount202(char[] source, int sourceIndex) throws CFException {
      hdrLine2202.setPageCount202(source, sourceIndex);
   	
   }
   
   public void setPageCount202(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hdrLine2202.setPageCount202(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PageCount202 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPageCount202(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrLine2202.setPageCount202(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PageCount202 with another Field
	 *	@param value
	 */
   public void setPageCount202(Field source) {
      hdrLine2202.setPageCount202(source);
   }  
   
     /**
	 * 	Update PageCount202 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPageCount202(Field source, int sourceIndex,int sourceLen) {
      hdrLine2202.setPageCount202(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PageCount202 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPageCount202(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrLine2202.setPageCount202(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of serverId202
	 *	@return serverId202
	 */
   public char[] getServerId202() throws CFException  {              
   		return hdrLine2202.getServerId202();
   }

  
	/**
	*  set variable serverId202
	*  @param value
	**/
   public void setServerId202(char[] value) throws CFException {
      hdrLine2202.setServerId202(value);
   } 

     /**
	 * 	Update ServerId202 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setServerId202(char[] source, int sourceIndex) throws CFException {
      hdrLine2202.setServerId202(source, sourceIndex);
   	
   }
   
   public void setServerId202(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hdrLine2202.setServerId202(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ServerId202 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setServerId202(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrLine2202.setServerId202(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ServerId202 with another Field
	 *	@param value
	 */
   public void setServerId202(Field source) {
      hdrLine2202.setServerId202(source);
   }  
   
     /**
	 * 	Update ServerId202 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setServerId202(Field source, int sourceIndex,int sourceLen) {
      hdrLine2202.setServerId202(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ServerId202 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setServerId202(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrLine2202.setServerId202(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf528ServerId
	 *	@return sf528ServerId
	 */
   public char[] getSf528ServerId() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServerId();
   }

  
	/**
	*  set variable sf528ServerId
	*  @param value
	**/
   public void setSf528ServerId(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528ServerId(value);
   } 

     /**
	 * 	Update Sf528ServerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServerId(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex);
   	
   }
   
   public void setSf528ServerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServerId with another Field
	 *	@param value
	 */
   public void setSf528ServerId(Field source) {
      sf528ExtractZLogRec.setSf528ServerId(source);
   }  
   
     /**
	 * 	Update Sf528ServerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServerId(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of num0300
	 *	@return num0300
	 */
	public int getNum0300() throws CFException {
   		return work.getNum0300();
	}


	/**
	 *	Returns String value of num0300
	 *	@return num0300
	 */
	public char[]  getNum0300String() throws CFException {
	     return String.valueOf(work.getNum0300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num0300IsNumeric()  throws CFException{
	    return work.num0300IsNumeric();
	}

	/**
	 * 	Update Num0300 with the passed value
	 *	@param number
	 */
	public void setNum0300(int number)  throws CFException{
		work.setNum0300(number);
	}
	

	public void setNum0300(long number)  throws CFException{
	    work.setNum0300(number);
	}
	
	
	/**
	 * 	Update Num0300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum0300(char[] value)  throws CFException {
		work.setNum0300(value);
	}
	
	/**
	 * 	Update Num0300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum0300String(char[] value)  throws CFException{
		work.setNum0300(value);
	}	

public long getLineCount400() throws CFException {  
        return work.getLineCount400();
}
	/**
	 * 	Update LineCount400 with the passed value
	 *	@param number
	 */
	public void setLineCount400(long number)  throws CFException{
		work.setLineCount400(number);
	}



public long getPageCount400() throws CFException {  
        return work.getPageCount400();
}
	/**
	 * 	Update PageCount400 with the passed value
	 *	@param number
	 */
	public void setPageCount400(long number)  throws CFException{
		work.setPageCount400(number);
	}




        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += hdrLine2202.hashCode();
        str += work.hashCode();
        str += sf528ExtractZLogRec.hashCode();
       return str.hashCode();
    }

    public GenerateHdrOutCtx clone() {
        GenerateHdrOutCtx cloneObj = new GenerateHdrOutCtx();
        cloneObj.hdrLine2202 = new HdrLine2202();
        cloneObj.hdrLine2202.set(hdrLine2202.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        return cloneObj;
    }

    }

    public GenerateHdrOutCtx getGenerateHdrOutCtx() {
            return new GenerateHdrOutCtx();
    }
     public class AccumulateDataInCtx implements Cloneable {
     Work work = Sf327010Ctx.this.getWork();
     HighServiceTime800 highServiceTime800 = Sf327010Ctx.this.getHighServiceTime800();
     LowServiceTime800 lowServiceTime800 = Sf327010Ctx.this.getLowServiceTime800();
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf327010Ctx.this.getSf528ExtractZLogRec();

public long getTotMessCount400() throws CFException {  
        return work.getTotMessCount400();
}
	/**
	 * 	Update TotMessCount400 with the passed value
	 *	@param number
	 */
	public void setTotMessCount400(long number)  throws CFException{
		work.setTotMessCount400(number);
	}



	/**
	 *	Returns the value of sf528ElapsedTime
	 *	@return sf528ElapsedTime
	 */
	public int getSf528ElapsedTime() throws CFException {        
   		return sf528ExtractZLogRec.getSf528ElapsedTime();
	}
	
	/**
	 * 	Update Sf528ElapsedTime with the passed value
	 *	@param number
	 */
	public void setSf528ElapsedTime(int number)  throws CFException{
		sf528ExtractZLogRec.setSf528ElapsedTime(number);
	}


	public void setSf528ElapsedTime(long number)  throws CFException{
		sf528ExtractZLogRec.setSf528ElapsedTime((int)number);
	}


	/**
	 *	Returns the value of lowElapsed800
	 *	@return lowElapsed800
	 */
	public int getLowElapsed800() throws CFException {        
   		return work.getLowElapsed800();
	}
	
	/**
	 * 	Update LowElapsed800 with the passed value
	 *	@param number
	 */
	public void setLowElapsed800(int number)  throws CFException{
		work.setLowElapsed800(number);
	}


	public void setLowElapsed800(long number)  throws CFException{
		work.setLowElapsed800((int)number);
	}


public long getSuccessCount400() throws CFException {  
        return work.getSuccessCount400();
}
	/**
	 * 	Update SuccessCount400 with the passed value
	 *	@param number
	 */
	public void setSuccessCount400(long number)  throws CFException{
		work.setSuccessCount400(number);
	}



	/**
	 *	Returns the value of highServiceTime800
	 *	@return highServiceTime800
	 */   
	 public HighServiceTime800 getHighServiceTime800() {
   	return highServiceTime800;
   }


	/**
	 *	Returns the value of lowServiceTime800
	 *	@return lowServiceTime800
	 */   
	 public LowServiceTime800 getLowServiceTime800() {
   	return lowServiceTime800;
   }


	/**
	 *	Returns the value of plus1300
	 *	@return plus1300
	 */
	public int getPlus1300() throws CFException {
   		return work.getPlus1300();
	}


	/**
	 *	Returns String value of plus1300
	 *	@return plus1300
	 */
	public char[]  getPlus1300String() throws CFException {
	     return String.valueOf(work.getPlus1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plus1300IsNumeric()  throws CFException{
	    return work.plus1300IsNumeric();
	}

	/**
	 * 	Update Plus1300 with the passed value
	 *	@param number
	 */
	public void setPlus1300(int number)  throws CFException{
		work.setPlus1300(number);
	}
	

	public void setPlus1300(long number)  throws CFException{
	    work.setPlus1300(number);
	}
	
	
	/**
	 * 	Update Plus1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlus1300(char[] value)  throws CFException {
		work.setPlus1300(value);
	}
	
	/**
	 * 	Update Plus1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlus1300String(char[] value)  throws CFException{
		work.setPlus1300(value);
	}	

public long getErrorCount400() throws CFException {  
        return work.getErrorCount400();
}
	/**
	 * 	Update ErrorCount400 with the passed value
	 *	@param number
	 */
	public void setErrorCount400(long number)  throws CFException{
		work.setErrorCount400(number);
	}



	/**
	 *	Returns the value of sumElapsedTime800
	 *	@return sumElapsedTime800
	 */
	public long getSumElapsedTime800() throws CFException {        
   		return work.getSumElapsedTime800();
	}
	
	/**
	 * 	Update SumElapsedTime800 with the passed value
	 *	@param number
	 */
	public void setSumElapsedTime800(long number)  throws CFException{
		work.setSumElapsedTime800(number);
	}



	/**
	 *	Returns the value of sf528ServiceStatus
	 *	@return sf528ServiceStatus
	 */
   public char[] getSf528ServiceStatus() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServiceStatus();
   }

  
	/**
	*  set variable sf528ServiceStatus
	*  @param value
	**/
   public void setSf528ServiceStatus(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceStatus(value);
   } 

     /**
	 * 	Update Sf528ServiceStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceStatus(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceStatus(source, sourceIndex);
   	
   }
   
   public void setSf528ServiceStatus(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528ServiceStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServiceStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServiceStatus with another Field
	 *	@param value
	 */
   public void setSf528ServiceStatus(Field source) {
      sf528ExtractZLogRec.setSf528ServiceStatus(source);
   }  
   
     /**
	 * 	Update Sf528ServiceStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceStatus(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528ServiceStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServiceStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of charC300
	 *	@return charC300
	 */
   public char[] getCharC300() throws CFException  {              
   		return work.getCharC300();
   }

  
	/**
	*  set variable charC300
	*  @param value
	**/
   public void setCharC300(char[] value) throws CFException {
      work.setCharC300(value);
   } 

	/**
	 *	Returns the value of sf528ServiceDateTime
	 *	@return sf528ServiceDateTime
	 */
   public char[] getSf528ServiceDateTime() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServiceDateTime();
   }

  
	/**
	*  set variable sf528ServiceDateTime
	*  @param value
	**/
   public void setSf528ServiceDateTime(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceDateTime(value);
   } 

     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceDateTime(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex);
   	
   }
   
   public void setSf528ServiceDateTime(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceDateTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServiceDateTime with another Field
	 *	@param value
	 */
   public void setSf528ServiceDateTime(Field source) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source);
   }  
   
     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceDateTime(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceDateTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of highElapsed800
	 *	@return highElapsed800
	 */
	public int getHighElapsed800() throws CFException {        
   		return work.getHighElapsed800();
	}
	
	/**
	 * 	Update HighElapsed800 with the passed value
	 *	@param number
	 */
	public void setHighElapsed800(int number)  throws CFException{
		work.setHighElapsed800(number);
	}


	public void setHighElapsed800(long number)  throws CFException{
		work.setHighElapsed800((int)number);
	}



        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
        }

        public AccumulateDataOutCtx getAccumulateDataOutCtx() {
            return new AccumulateDataOutCtx();
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
        str += highServiceTime800.hashCode();
        str += lowServiceTime800.hashCode();
        str += sf528ExtractZLogRec.hashCode();
       return str.hashCode();
    }

    public AccumulateDataInCtx clone() {
        AccumulateDataInCtx cloneObj = new AccumulateDataInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.highServiceTime800 = new HighServiceTime800();
        cloneObj.highServiceTime800.set(highServiceTime800.getClonedField());
        cloneObj.lowServiceTime800 = new LowServiceTime800();
        cloneObj.lowServiceTime800.set(lowServiceTime800.getClonedField());
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        return cloneObj;
    }

    }

    public AccumulateDataInCtx getAccumulateDataInCtx() {
            return new AccumulateDataInCtx();
    }
     public class AccumulateDataOutCtx implements Cloneable {
     Work work = Sf327010Ctx.this.getWork();
     HighServiceTime800 highServiceTime800 = Sf327010Ctx.this.getHighServiceTime800();
     LowServiceTime800 lowServiceTime800 = Sf327010Ctx.this.getLowServiceTime800();
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf327010Ctx.this.getSf528ExtractZLogRec();

public long getTotMessCount400() throws CFException {  
        return work.getTotMessCount400();
}
	/**
	 * 	Update TotMessCount400 with the passed value
	 *	@param number
	 */
	public void setTotMessCount400(long number)  throws CFException{
		work.setTotMessCount400(number);
	}



	/**
	 *	Returns the value of sf528ElapsedTime
	 *	@return sf528ElapsedTime
	 */
	public int getSf528ElapsedTime() throws CFException {        
   		return sf528ExtractZLogRec.getSf528ElapsedTime();
	}
	
	/**
	 * 	Update Sf528ElapsedTime with the passed value
	 *	@param number
	 */
	public void setSf528ElapsedTime(int number)  throws CFException{
		sf528ExtractZLogRec.setSf528ElapsedTime(number);
	}


	public void setSf528ElapsedTime(long number)  throws CFException{
		sf528ExtractZLogRec.setSf528ElapsedTime((int)number);
	}


	/**
	 *	Returns the value of sf528ServiceDateTime
	 *	@return sf528ServiceDateTime
	 */
   public char[] getSf528ServiceDateTime() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServiceDateTime();
   }

  
	/**
	*  set variable sf528ServiceDateTime
	*  @param value
	**/
   public void setSf528ServiceDateTime(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceDateTime(value);
   } 

     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceDateTime(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex);
   	
   }
   
   public void setSf528ServiceDateTime(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceDateTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServiceDateTime with another Field
	 *	@param value
	 */
   public void setSf528ServiceDateTime(Field source) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source);
   }  
   
     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceDateTime(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServiceDateTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceDateTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceDateTime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lowElapsed800
	 *	@return lowElapsed800
	 */
	public int getLowElapsed800() throws CFException {        
   		return work.getLowElapsed800();
	}
	
	/**
	 * 	Update LowElapsed800 with the passed value
	 *	@param number
	 */
	public void setLowElapsed800(int number)  throws CFException{
		work.setLowElapsed800(number);
	}


	public void setLowElapsed800(long number)  throws CFException{
		work.setLowElapsed800((int)number);
	}


public long getSuccessCount400() throws CFException {  
        return work.getSuccessCount400();
}
	/**
	 * 	Update SuccessCount400 with the passed value
	 *	@param number
	 */
	public void setSuccessCount400(long number)  throws CFException{
		work.setSuccessCount400(number);
	}



	/**
	 *	Returns the value of highServiceTime800
	 *	@return highServiceTime800
	 */   
	 public HighServiceTime800 getHighServiceTime800() {
   	return highServiceTime800;
   }


	/**
	 *	Returns the value of lowServiceTime800
	 *	@return lowServiceTime800
	 */   
	 public LowServiceTime800 getLowServiceTime800() {
   	return lowServiceTime800;
   }


public long getErrorCount400() throws CFException {  
        return work.getErrorCount400();
}
	/**
	 * 	Update ErrorCount400 with the passed value
	 *	@param number
	 */
	public void setErrorCount400(long number)  throws CFException{
		work.setErrorCount400(number);
	}



	/**
	 *	Returns the value of highElapsed800
	 *	@return highElapsed800
	 */
	public int getHighElapsed800() throws CFException {        
   		return work.getHighElapsed800();
	}
	
	/**
	 * 	Update HighElapsed800 with the passed value
	 *	@param number
	 */
	public void setHighElapsed800(int number)  throws CFException{
		work.setHighElapsed800(number);
	}


	public void setHighElapsed800(long number)  throws CFException{
		work.setHighElapsed800((int)number);
	}


	/**
	 *	Returns the value of sumElapsedTime800
	 *	@return sumElapsedTime800
	 */
	public long getSumElapsedTime800() throws CFException {        
   		return work.getSumElapsedTime800();
	}
	
	/**
	 * 	Update SumElapsedTime800 with the passed value
	 *	@param number
	 */
	public void setSumElapsedTime800(long number)  throws CFException{
		work.setSumElapsedTime800(number);
	}




        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
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
        str += highServiceTime800.hashCode();
        str += lowServiceTime800.hashCode();
        str += sf528ExtractZLogRec.hashCode();
       return str.hashCode();
    }

    public AccumulateDataOutCtx clone() {
        AccumulateDataOutCtx cloneObj = new AccumulateDataOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.highServiceTime800 = new HighServiceTime800();
        cloneObj.highServiceTime800.set(highServiceTime800.getClonedField());
        cloneObj.lowServiceTime800 = new LowServiceTime800();
        cloneObj.lowServiceTime800.set(lowServiceTime800.getClonedField());
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        return cloneObj;
    }

    }

    public AccumulateDataOutCtx getAccumulateDataOutCtx() {
            return new AccumulateDataOutCtx();
    }
     public class DisplayServiceDateInCtx implements Cloneable {
     DetailData3205 detailData3205 = Sf327010Ctx.this.getDetailData3205();
     Work work = Sf327010Ctx.this.getWork();
     HighServiceTime800 highServiceTime800 = Sf327010Ctx.this.getHighServiceTime800();
     LowServiceTime800 lowServiceTime800 = Sf327010Ctx.this.getLowServiceTime800();
     Sys201AsaServerRec sys201AsaServerRec = Sf327010Ctx.this.getSys201AsaServerRec();

	/**
	 *	Returns the value of hserviceMins800
	 *	@return hserviceMins800
	 */
   public char[] getHserviceMins800() throws CFException  {              
   		return highServiceTime800.getHserviceTime800().getHserviceMins800();
   }

  
	/**
	*  set variable hserviceMins800
	*  @param value
	**/
   public void setHserviceMins800(char[] value) throws CFException {
      highServiceTime800.getHserviceTime800().setHserviceMins800(value);
   } 

     /**
	 * 	Update HserviceMins800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceMins800(char[] source, int sourceIndex) throws CFException {
      highServiceTime800.getHserviceTime800().setHserviceMins800(source, sourceIndex);
   	
   }
   
   public void setHserviceMins800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      highServiceTime800.getHserviceTime800().setHserviceMins800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceMins800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMins800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceTime800().setHserviceMins800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceMins800 with another Field
	 *	@param value
	 */
   public void setHserviceMins800(Field source) {
      highServiceTime800.getHserviceTime800().setHserviceMins800(source);
   }  
   
     /**
	 * 	Update HserviceMins800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceMins800(Field source, int sourceIndex,int sourceLen) {
      highServiceTime800.getHserviceTime800().setHserviceMins800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceMins800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMins800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceTime800().setHserviceMins800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of plus4300
	 *	@return plus4300
	 */
	public int getPlus4300() throws CFException {
   		return work.getPlus4300();
	}


	/**
	 *	Returns String value of plus4300
	 *	@return plus4300
	 */
	public char[]  getPlus4300String() throws CFException {
	     return String.valueOf(work.getPlus4300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plus4300IsNumeric()  throws CFException{
	    return work.plus4300IsNumeric();
	}

	/**
	 * 	Update Plus4300 with the passed value
	 *	@param number
	 */
	public void setPlus4300(int number)  throws CFException{
		work.setPlus4300(number);
	}
	

	public void setPlus4300(long number)  throws CFException{
	    work.setPlus4300(number);
	}
	
	
	/**
	 * 	Update Plus4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlus4300(char[] value)  throws CFException {
		work.setPlus4300(value);
	}
	
	/**
	 * 	Update Plus4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlus4300String(char[] value)  throws CFException{
		work.setPlus4300(value);
	}	

	/**
	 *	Returns the value of hserviceHh800
	 *	@return hserviceHh800
	 */
   public char[] getHserviceHh800() throws CFException  {              
   		return highServiceTime800.getHserviceTime800().getHserviceHh800();
   }

  
	/**
	*  set variable hserviceHh800
	*  @param value
	**/
   public void setHserviceHh800(char[] value) throws CFException {
      highServiceTime800.getHserviceTime800().setHserviceHh800(value);
   } 

     /**
	 * 	Update HserviceHh800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceHh800(char[] source, int sourceIndex) throws CFException {
      highServiceTime800.getHserviceTime800().setHserviceHh800(source, sourceIndex);
   	
   }
   
   public void setHserviceHh800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      highServiceTime800.getHserviceTime800().setHserviceHh800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceHh800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceHh800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceTime800().setHserviceHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceHh800 with another Field
	 *	@param value
	 */
   public void setHserviceHh800(Field source) {
      highServiceTime800.getHserviceTime800().setHserviceHh800(source);
   }  
   
     /**
	 * 	Update HserviceHh800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceHh800(Field source, int sourceIndex,int sourceLen) {
      highServiceTime800.getHserviceTime800().setHserviceHh800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceHh800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceHh800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceTime800().setHserviceHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceDd800
	 *	@return lserviceDd800
	 */
   public char[] getLserviceDd800() throws CFException  {              
   		return lowServiceTime800.getLserviceDate800().getLserviceDd800();
   }

  
	/**
	*  set variable lserviceDd800
	*  @param value
	**/
   public void setLserviceDd800(char[] value) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceDd800(value);
   } 

     /**
	 * 	Update LserviceDd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceDd800(char[] source, int sourceIndex) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceDd800(source, sourceIndex);
   	
   }
   
   public void setLserviceDd800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lowServiceTime800.getLserviceDate800().setLserviceDd800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceDd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceDd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceDd800 with another Field
	 *	@param value
	 */
   public void setLserviceDd800(Field source) {
      lowServiceTime800.getLserviceDate800().setLserviceDd800(source);
   }  
   
     /**
	 * 	Update LserviceDd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceDd800(Field source, int sourceIndex,int sourceLen) {
      lowServiceTime800.getLserviceDate800().setLserviceDd800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceDd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceDd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceMm800
	 *	@return hserviceMm800
	 */
   public char[] getHserviceMm800() throws CFException  {              
   		return highServiceTime800.getHserviceDate800().getHserviceMm800();
   }

  
	/**
	*  set variable hserviceMm800
	*  @param value
	**/
   public void setHserviceMm800(char[] value) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceMm800(value);
   } 

     /**
	 * 	Update HserviceMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceMm800(char[] source, int sourceIndex) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceMm800(source, sourceIndex);
   	
   }
   
   public void setHserviceMm800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      highServiceTime800.getHserviceDate800().setHserviceMm800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceMm800 with another Field
	 *	@param value
	 */
   public void setHserviceMm800(Field source) {
      highServiceTime800.getHserviceDate800().setHserviceMm800(source);
   }  
   
     /**
	 * 	Update HserviceMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceMm800(Field source, int sourceIndex,int sourceLen) {
      highServiceTime800.getHserviceDate800().setHserviceMm800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of runMonth800
	 *	@return runMonth800
	 */
   public char[] getRunMonth800() throws CFException  {              
   		return work.getRunMonth800();
   }

  
	/**
	*  set variable runMonth800
	*  @param value
	**/
   public void setRunMonth800(char[] value) throws CFException {
      work.setRunMonth800(value);
   } 

	/**
	 *	Returns the value of lserviceYy800
	 *	@return lserviceYy800
	 */
   public char[] getLserviceYy800() throws CFException  {              
   		return lowServiceTime800.getLserviceDate800().getLserviceYy800();
   }

  
	/**
	*  set variable lserviceYy800
	*  @param value
	**/
   public void setLserviceYy800(char[] value) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceYy800(value);
   } 

     /**
	 * 	Update LserviceYy800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceYy800(char[] source, int sourceIndex) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceYy800(source, sourceIndex);
   	
   }
   
   public void setLserviceYy800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lowServiceTime800.getLserviceDate800().setLserviceYy800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceYy800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceYy800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceYy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceYy800 with another Field
	 *	@param value
	 */
   public void setLserviceYy800(Field source) {
      lowServiceTime800.getLserviceDate800().setLserviceYy800(source);
   }  
   
     /**
	 * 	Update LserviceYy800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceYy800(Field source, int sourceIndex,int sourceLen) {
      lowServiceTime800.getLserviceDate800().setLserviceYy800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceYy800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceYy800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceYy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys201AsaServerRec
	 *	@return sys201AsaServerRec
	 */   
	 public Sys201AsaServerRec getSys201AsaServerRec() {
   	return sys201AsaServerRec;
   }


	/**
	 *	Returns the value of hserviceDd800
	 *	@return hserviceDd800
	 */
   public char[] getHserviceDd800() throws CFException  {              
   		return highServiceTime800.getHserviceDate800().getHserviceDd800();
   }

  
	/**
	*  set variable hserviceDd800
	*  @param value
	**/
   public void setHserviceDd800(char[] value) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceDd800(value);
   } 

     /**
	 * 	Update HserviceDd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceDd800(char[] source, int sourceIndex) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceDd800(source, sourceIndex);
   	
   }
   
   public void setHserviceDd800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      highServiceTime800.getHserviceDate800().setHserviceDd800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceDd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceDd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceDd800 with another Field
	 *	@param value
	 */
   public void setHserviceDd800(Field source) {
      highServiceTime800.getHserviceDate800().setHserviceDd800(source);
   }  
   
     /**
	 * 	Update HserviceDd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceDd800(Field source, int sourceIndex,int sourceLen) {
      highServiceTime800.getHserviceDate800().setHserviceDd800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceDd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceDd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public long getLineCount400() throws CFException {  
        return work.getLineCount400();
}
	/**
	 * 	Update LineCount400 with the passed value
	 *	@param number
	 */
	public void setLineCount400(long number)  throws CFException{
		work.setLineCount400(number);
	}



	/**
	 *	Returns the value of lserviceCc800
	 *	@return lserviceCc800
	 */
   public char[] getLserviceCc800() throws CFException  {              
   		return lowServiceTime800.getLserviceDate800().getLserviceCc800();
   }

  
	/**
	*  set variable lserviceCc800
	*  @param value
	**/
   public void setLserviceCc800(char[] value) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceCc800(value);
   } 

     /**
	 * 	Update LserviceCc800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceCc800(char[] source, int sourceIndex) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceCc800(source, sourceIndex);
   	
   }
   
   public void setLserviceCc800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lowServiceTime800.getLserviceDate800().setLserviceCc800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceCc800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceCc800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceCc800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceCc800 with another Field
	 *	@param value
	 */
   public void setLserviceCc800(Field source) {
      lowServiceTime800.getLserviceDate800().setLserviceCc800(source);
   }  
   
     /**
	 * 	Update LserviceCc800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceCc800(Field source, int sourceIndex,int sourceLen) {
      lowServiceTime800.getLserviceDate800().setLserviceCc800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceCc800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceCc800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceCc800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceCc800
	 *	@return hserviceCc800
	 */
   public char[] getHserviceCc800() throws CFException  {              
   		return highServiceTime800.getHserviceDate800().getHserviceCc800();
   }

  
	/**
	*  set variable hserviceCc800
	*  @param value
	**/
   public void setHserviceCc800(char[] value) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceCc800(value);
   } 

     /**
	 * 	Update HserviceCc800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceCc800(char[] source, int sourceIndex) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceCc800(source, sourceIndex);
   	
   }
   
   public void setHserviceCc800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      highServiceTime800.getHserviceDate800().setHserviceCc800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceCc800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceCc800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceCc800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceCc800 with another Field
	 *	@param value
	 */
   public void setHserviceCc800(Field source) {
      highServiceTime800.getHserviceDate800().setHserviceCc800(source);
   }  
   
     /**
	 * 	Update HserviceCc800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceCc800(Field source, int sourceIndex,int sourceLen) {
      highServiceTime800.getHserviceDate800().setHserviceCc800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceCc800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceCc800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceCc800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceMm800
	 *	@return lserviceMm800
	 */
   public char[] getLserviceMm800() throws CFException  {              
   		return lowServiceTime800.getLserviceDate800().getLserviceMm800();
   }

  
	/**
	*  set variable lserviceMm800
	*  @param value
	**/
   public void setLserviceMm800(char[] value) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceMm800(value);
   } 

     /**
	 * 	Update LserviceMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceMm800(char[] source, int sourceIndex) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceMm800(source, sourceIndex);
   	
   }
   
   public void setLserviceMm800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lowServiceTime800.getLserviceDate800().setLserviceMm800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceMm800 with another Field
	 *	@param value
	 */
   public void setLserviceMm800(Field source) {
      lowServiceTime800.getLserviceDate800().setLserviceMm800(source);
   }  
   
     /**
	 * 	Update LserviceMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceMm800(Field source, int sourceIndex,int sourceLen) {
      lowServiceTime800.getLserviceDate800().setLserviceMm800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of detailData3205
	 *	@return detailData3205
	 */   
	 public DetailData3205 getDetailData3205() {
   	return detailData3205;
   }


	/**
	 *	Returns the value of hserviceYy800
	 *	@return hserviceYy800
	 */
   public char[] getHserviceYy800() throws CFException  {              
   		return highServiceTime800.getHserviceDate800().getHserviceYy800();
   }

  
	/**
	*  set variable hserviceYy800
	*  @param value
	**/
   public void setHserviceYy800(char[] value) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceYy800(value);
   } 

     /**
	 * 	Update HserviceYy800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceYy800(char[] source, int sourceIndex) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceYy800(source, sourceIndex);
   	
   }
   
   public void setHserviceYy800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      highServiceTime800.getHserviceDate800().setHserviceYy800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceYy800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceYy800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceYy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceYy800 with another Field
	 *	@param value
	 */
   public void setHserviceYy800(Field source) {
      highServiceTime800.getHserviceDate800().setHserviceYy800(source);
   }  
   
     /**
	 * 	Update HserviceYy800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceYy800(Field source, int sourceIndex,int sourceLen) {
      highServiceTime800.getHserviceDate800().setHserviceYy800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceYy800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceYy800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceYy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceMins800
	 *	@return lserviceMins800
	 */
   public char[] getLserviceMins800() throws CFException  {              
   		return lowServiceTime800.getLserviceTime800().getLserviceMins800();
   }

  
	/**
	*  set variable lserviceMins800
	*  @param value
	**/
   public void setLserviceMins800(char[] value) throws CFException {
      lowServiceTime800.getLserviceTime800().setLserviceMins800(value);
   } 

     /**
	 * 	Update LserviceMins800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceMins800(char[] source, int sourceIndex) throws CFException {
      lowServiceTime800.getLserviceTime800().setLserviceMins800(source, sourceIndex);
   	
   }
   
   public void setLserviceMins800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lowServiceTime800.getLserviceTime800().setLserviceMins800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceMins800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMins800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceTime800().setLserviceMins800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceMins800 with another Field
	 *	@param value
	 */
   public void setLserviceMins800(Field source) {
      lowServiceTime800.getLserviceTime800().setLserviceMins800(source);
   }  
   
     /**
	 * 	Update LserviceMins800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceMins800(Field source, int sourceIndex,int sourceLen) {
      lowServiceTime800.getLserviceTime800().setLserviceMins800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceMins800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMins800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceTime800().setLserviceMins800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceHh800
	 *	@return lserviceHh800
	 */
   public char[] getLserviceHh800() throws CFException  {              
   		return lowServiceTime800.getLserviceTime800().getLserviceHh800();
   }

  
	/**
	*  set variable lserviceHh800
	*  @param value
	**/
   public void setLserviceHh800(char[] value) throws CFException {
      lowServiceTime800.getLserviceTime800().setLserviceHh800(value);
   } 

     /**
	 * 	Update LserviceHh800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceHh800(char[] source, int sourceIndex) throws CFException {
      lowServiceTime800.getLserviceTime800().setLserviceHh800(source, sourceIndex);
   	
   }
   
   public void setLserviceHh800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lowServiceTime800.getLserviceTime800().setLserviceHh800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceHh800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceHh800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceTime800().setLserviceHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceHh800 with another Field
	 *	@param value
	 */
   public void setLserviceHh800(Field source) {
      lowServiceTime800.getLserviceTime800().setLserviceHh800(source);
   }  
   
     /**
	 * 	Update LserviceHh800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceHh800(Field source, int sourceIndex,int sourceLen) {
      lowServiceTime800.getLserviceTime800().setLserviceHh800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceHh800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceHh800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceTime800().setLserviceHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceSec800
	 *	@return hserviceSec800
	 */
   public char[] getHserviceSec800() throws CFException  {              
   		return highServiceTime800.getHserviceTime800().getHserviceSec800();
   }

  
	/**
	*  set variable hserviceSec800
	*  @param value
	**/
   public void setHserviceSec800(char[] value) throws CFException {
      highServiceTime800.getHserviceTime800().setHserviceSec800(value);
   } 

     /**
	 * 	Update HserviceSec800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceSec800(char[] source, int sourceIndex) throws CFException {
      highServiceTime800.getHserviceTime800().setHserviceSec800(source, sourceIndex);
   	
   }
   
   public void setHserviceSec800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      highServiceTime800.getHserviceTime800().setHserviceSec800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceSec800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceSec800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceTime800().setHserviceSec800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceSec800 with another Field
	 *	@param value
	 */
   public void setHserviceSec800(Field source) {
      highServiceTime800.getHserviceTime800().setHserviceSec800(source);
   }  
   
     /**
	 * 	Update HserviceSec800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceSec800(Field source, int sourceIndex,int sourceLen) {
      highServiceTime800.getHserviceTime800().setHserviceSec800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceSec800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceSec800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceTime800().setHserviceSec800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of num4300
	 *	@return num4300
	 */
	public int getNum4300() throws CFException {
   		return work.getNum4300();
	}


	/**
	 *	Returns String value of num4300
	 *	@return num4300
	 */
	public char[]  getNum4300String() throws CFException {
	     return String.valueOf(work.getNum4300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num4300IsNumeric()  throws CFException{
	    return work.num4300IsNumeric();
	}

	/**
	 * 	Update Num4300 with the passed value
	 *	@param number
	 */
	public void setNum4300(int number)  throws CFException{
		work.setNum4300(number);
	}
	

	public void setNum4300(long number)  throws CFException{
	    work.setNum4300(number);
	}
	
	
	/**
	 * 	Update Num4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum4300(char[] value)  throws CFException {
		work.setNum4300(value);
	}
	
	/**
	 * 	Update Num4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum4300String(char[] value)  throws CFException{
		work.setNum4300(value);
	}	

	/**
	 *	Returns the value of lserviceSec800
	 *	@return lserviceSec800
	 */
   public char[] getLserviceSec800() throws CFException  {              
   		return lowServiceTime800.getLserviceTime800().getLserviceSec800();
   }

  
	/**
	*  set variable lserviceSec800
	*  @param value
	**/
   public void setLserviceSec800(char[] value) throws CFException {
      lowServiceTime800.getLserviceTime800().setLserviceSec800(value);
   } 

     /**
	 * 	Update LserviceSec800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceSec800(char[] source, int sourceIndex) throws CFException {
      lowServiceTime800.getLserviceTime800().setLserviceSec800(source, sourceIndex);
   	
   }
   
   public void setLserviceSec800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lowServiceTime800.getLserviceTime800().setLserviceSec800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceSec800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceSec800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceTime800().setLserviceSec800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceSec800 with another Field
	 *	@param value
	 */
   public void setLserviceSec800(Field source) {
      lowServiceTime800.getLserviceTime800().setLserviceSec800(source);
   }  
   
     /**
	 * 	Update LserviceSec800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceSec800(Field source, int sourceIndex,int sourceLen) {
      lowServiceTime800.getLserviceTime800().setLserviceSec800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceSec800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceSec800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceTime800().setLserviceSec800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
        }

        public DisplayServiceDateOutCtx getDisplayServiceDateOutCtx() {
            return new DisplayServiceDateOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += detailData3205.hashCode();
        str += work.hashCode();
        str += highServiceTime800.hashCode();
        str += lowServiceTime800.hashCode();
        str += sys201AsaServerRec.hashCode();
       return str.hashCode();
    }

    public DisplayServiceDateInCtx clone() {
        DisplayServiceDateInCtx cloneObj = new DisplayServiceDateInCtx();
        cloneObj.detailData3205 = new DetailData3205();
        cloneObj.detailData3205.set(detailData3205.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.highServiceTime800 = new HighServiceTime800();
        cloneObj.highServiceTime800.set(highServiceTime800.getClonedField());
        cloneObj.lowServiceTime800 = new LowServiceTime800();
        cloneObj.lowServiceTime800.set(lowServiceTime800.getClonedField());
        cloneObj.sys201AsaServerRec = new Sys201AsaServerRec();
        cloneObj.sys201AsaServerRec.set(sys201AsaServerRec.getClonedField());
        return cloneObj;
    }

    }

    public DisplayServiceDateInCtx getDisplayServiceDateInCtx() {
            return new DisplayServiceDateInCtx();
    }
     public class DisplayServiceDateOutCtx implements Cloneable {
     DetailData3205 detailData3205 = Sf327010Ctx.this.getDetailData3205();
     Work work = Sf327010Ctx.this.getWork();
     HighServiceTime800 highServiceTime800 = Sf327010Ctx.this.getHighServiceTime800();
     LowServiceTime800 lowServiceTime800 = Sf327010Ctx.this.getLowServiceTime800();
     Sys201AsaServerRec sys201AsaServerRec = Sf327010Ctx.this.getSys201AsaServerRec();

	/**
	 *	Returns the value of hserviceHh205
	 *	@return hserviceHh205
	 */
   public char[] getHserviceHh205() throws CFException  {              
   		return detailData3205.getDetail1205().getHserviceHh205();
   }

  
	/**
	*  set variable hserviceHh205
	*  @param value
	**/
   public void setHserviceHh205(char[] value) throws CFException {
      detailData3205.getDetail1205().setHserviceHh205(value);
   } 

     /**
	 * 	Update HserviceHh205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceHh205(char[] source, int sourceIndex) throws CFException {
      detailData3205.getDetail1205().setHserviceHh205(source, sourceIndex);
   	
   }
   
   public void setHserviceHh205(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData3205.getDetail1205().setHserviceHh205(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceHh205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceHh205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData3205.getDetail1205().setHserviceHh205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceHh205 with another Field
	 *	@param value
	 */
   public void setHserviceHh205(Field source) {
      detailData3205.getDetail1205().setHserviceHh205(source);
   }  
   
     /**
	 * 	Update HserviceHh205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceHh205(Field source, int sourceIndex,int sourceLen) {
      detailData3205.getDetail1205().setHserviceHh205(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceHh205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceHh205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData3205.getDetail1205().setHserviceHh205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceSec205
	 *	@return lserviceSec205
	 */
   public char[] getLserviceSec205() throws CFException  {              
   		return detailData3205.getDetail1205().getLserviceSec205();
   }

  
	/**
	*  set variable lserviceSec205
	*  @param value
	**/
   public void setLserviceSec205(char[] value) throws CFException {
      detailData3205.getDetail1205().setLserviceSec205(value);
   } 

     /**
	 * 	Update LserviceSec205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceSec205(char[] source, int sourceIndex) throws CFException {
      detailData3205.getDetail1205().setLserviceSec205(source, sourceIndex);
   	
   }
   
   public void setLserviceSec205(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData3205.getDetail1205().setLserviceSec205(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceSec205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceSec205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData3205.getDetail1205().setLserviceSec205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceSec205 with another Field
	 *	@param value
	 */
   public void setLserviceSec205(Field source) {
      detailData3205.getDetail1205().setLserviceSec205(source);
   }  
   
     /**
	 * 	Update LserviceSec205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceSec205(Field source, int sourceIndex,int sourceLen) {
      detailData3205.getDetail1205().setLserviceSec205(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceSec205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceSec205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData3205.getDetail1205().setLserviceSec205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceHh800
	 *	@return hserviceHh800
	 */
   public char[] getHserviceHh800() throws CFException  {              
   		return highServiceTime800.getHserviceTime800().getHserviceHh800();
   }

  
	/**
	*  set variable hserviceHh800
	*  @param value
	**/
   public void setHserviceHh800(char[] value) throws CFException {
      highServiceTime800.getHserviceTime800().setHserviceHh800(value);
   } 

     /**
	 * 	Update HserviceHh800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceHh800(char[] source, int sourceIndex) throws CFException {
      highServiceTime800.getHserviceTime800().setHserviceHh800(source, sourceIndex);
   	
   }
   
   public void setHserviceHh800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      highServiceTime800.getHserviceTime800().setHserviceHh800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceHh800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceHh800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceTime800().setHserviceHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceHh800 with another Field
	 *	@param value
	 */
   public void setHserviceHh800(Field source) {
      highServiceTime800.getHserviceTime800().setHserviceHh800(source);
   }  
   
     /**
	 * 	Update HserviceHh800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceHh800(Field source, int sourceIndex,int sourceLen) {
      highServiceTime800.getHserviceTime800().setHserviceHh800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceHh800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceHh800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceTime800().setHserviceHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceDd800
	 *	@return lserviceDd800
	 */
   public char[] getLserviceDd800() throws CFException  {              
   		return lowServiceTime800.getLserviceDate800().getLserviceDd800();
   }

  
	/**
	*  set variable lserviceDd800
	*  @param value
	**/
   public void setLserviceDd800(char[] value) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceDd800(value);
   } 

     /**
	 * 	Update LserviceDd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceDd800(char[] source, int sourceIndex) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceDd800(source, sourceIndex);
   	
   }
   
   public void setLserviceDd800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lowServiceTime800.getLserviceDate800().setLserviceDd800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceDd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceDd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceDd800 with another Field
	 *	@param value
	 */
   public void setLserviceDd800(Field source) {
      lowServiceTime800.getLserviceDate800().setLserviceDd800(source);
   }  
   
     /**
	 * 	Update LserviceDd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceDd800(Field source, int sourceIndex,int sourceLen) {
      lowServiceTime800.getLserviceDate800().setLserviceDd800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceDd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceDd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceMm800
	 *	@return hserviceMm800
	 */
   public char[] getHserviceMm800() throws CFException  {              
   		return highServiceTime800.getHserviceDate800().getHserviceMm800();
   }

  
	/**
	*  set variable hserviceMm800
	*  @param value
	**/
   public void setHserviceMm800(char[] value) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceMm800(value);
   } 

     /**
	 * 	Update HserviceMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceMm800(char[] source, int sourceIndex) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceMm800(source, sourceIndex);
   	
   }
   
   public void setHserviceMm800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      highServiceTime800.getHserviceDate800().setHserviceMm800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceMm800 with another Field
	 *	@param value
	 */
   public void setHserviceMm800(Field source) {
      highServiceTime800.getHserviceDate800().setHserviceMm800(source);
   }  
   
     /**
	 * 	Update HserviceMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceMm800(Field source, int sourceIndex,int sourceLen) {
      highServiceTime800.getHserviceDate800().setHserviceMm800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceMonth205
	 *	@return hserviceMonth205
	 */
   public char[] getHserviceMonth205() throws CFException  {              
   		return detailData3205.getDetail1205().getHserviceMonth205();
   }

  
	/**
	*  set variable hserviceMonth205
	*  @param value
	**/
   public void setHserviceMonth205(char[] value) throws CFException {
      detailData3205.getDetail1205().setHserviceMonth205(value);
   } 

     /**
	 * 	Update HserviceMonth205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceMonth205(char[] source, int sourceIndex) throws CFException {
      detailData3205.getDetail1205().setHserviceMonth205(source, sourceIndex);
   	
   }
   
   public void setHserviceMonth205(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData3205.getDetail1205().setHserviceMonth205(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceMonth205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMonth205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData3205.getDetail1205().setHserviceMonth205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceMonth205 with another Field
	 *	@param value
	 */
   public void setHserviceMonth205(Field source) {
      detailData3205.getDetail1205().setHserviceMonth205(source);
   }  
   
     /**
	 * 	Update HserviceMonth205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceMonth205(Field source, int sourceIndex,int sourceLen) {
      detailData3205.getDetail1205().setHserviceMonth205(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceMonth205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMonth205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData3205.getDetail1205().setHserviceMonth205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceYear205
	 *	@return lserviceYear205
	 */
   public char[] getLserviceYear205() throws CFException  {              
   		return detailData3205.getDetail1205().getLserviceYear205();
   }

  
	/**
	*  set variable lserviceYear205
	*  @param value
	**/
   public void setLserviceYear205(char[] value) throws CFException {
      detailData3205.getDetail1205().setLserviceYear205(value);
   } 

     /**
	 * 	Update LserviceYear205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceYear205(char[] source, int sourceIndex) throws CFException {
      detailData3205.getDetail1205().setLserviceYear205(source, sourceIndex);
   	
   }
   
   public void setLserviceYear205(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData3205.getDetail1205().setLserviceYear205(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceYear205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceYear205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData3205.getDetail1205().setLserviceYear205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceYear205 with another Field
	 *	@param value
	 */
   public void setLserviceYear205(Field source) {
      detailData3205.getDetail1205().setLserviceYear205(source);
   }  
   
     /**
	 * 	Update LserviceYear205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceYear205(Field source, int sourceIndex,int sourceLen) {
      detailData3205.getDetail1205().setLserviceYear205(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceYear205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceYear205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData3205.getDetail1205().setLserviceYear205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceYy800
	 *	@return lserviceYy800
	 */
   public char[] getLserviceYy800() throws CFException  {              
   		return lowServiceTime800.getLserviceDate800().getLserviceYy800();
   }

  
	/**
	*  set variable lserviceYy800
	*  @param value
	**/
   public void setLserviceYy800(char[] value) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceYy800(value);
   } 

     /**
	 * 	Update LserviceYy800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceYy800(char[] source, int sourceIndex) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceYy800(source, sourceIndex);
   	
   }
   
   public void setLserviceYy800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lowServiceTime800.getLserviceDate800().setLserviceYy800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceYy800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceYy800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceYy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceYy800 with another Field
	 *	@param value
	 */
   public void setLserviceYy800(Field source) {
      lowServiceTime800.getLserviceDate800().setLserviceYy800(source);
   }  
   
     /**
	 * 	Update LserviceYy800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceYy800(Field source, int sourceIndex,int sourceLen) {
      lowServiceTime800.getLserviceDate800().setLserviceYy800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceYy800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceYy800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceYy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceMins205
	 *	@return lserviceMins205
	 */
   public char[] getLserviceMins205() throws CFException  {              
   		return detailData3205.getDetail1205().getLserviceMins205();
   }

  
	/**
	*  set variable lserviceMins205
	*  @param value
	**/
   public void setLserviceMins205(char[] value) throws CFException {
      detailData3205.getDetail1205().setLserviceMins205(value);
   } 

     /**
	 * 	Update LserviceMins205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceMins205(char[] source, int sourceIndex) throws CFException {
      detailData3205.getDetail1205().setLserviceMins205(source, sourceIndex);
   	
   }
   
   public void setLserviceMins205(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData3205.getDetail1205().setLserviceMins205(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceMins205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMins205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData3205.getDetail1205().setLserviceMins205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceMins205 with another Field
	 *	@param value
	 */
   public void setLserviceMins205(Field source) {
      detailData3205.getDetail1205().setLserviceMins205(source);
   }  
   
     /**
	 * 	Update LserviceMins205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceMins205(Field source, int sourceIndex,int sourceLen) {
      detailData3205.getDetail1205().setLserviceMins205(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceMins205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMins205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData3205.getDetail1205().setLserviceMins205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys201AsaServerRec
	 *	@return sys201AsaServerRec
	 */   
	 public Sys201AsaServerRec getSys201AsaServerRec() {
   	return sys201AsaServerRec;
   }


	/**
	 *	Returns the value of hserviceYear205
	 *	@return hserviceYear205
	 */
   public char[] getHserviceYear205() throws CFException  {              
   		return detailData3205.getDetail1205().getHserviceYear205();
   }

  
	/**
	*  set variable hserviceYear205
	*  @param value
	**/
   public void setHserviceYear205(char[] value) throws CFException {
      detailData3205.getDetail1205().setHserviceYear205(value);
   } 

     /**
	 * 	Update HserviceYear205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceYear205(char[] source, int sourceIndex) throws CFException {
      detailData3205.getDetail1205().setHserviceYear205(source, sourceIndex);
   	
   }
   
   public void setHserviceYear205(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData3205.getDetail1205().setHserviceYear205(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceYear205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceYear205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData3205.getDetail1205().setHserviceYear205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceYear205 with another Field
	 *	@param value
	 */
   public void setHserviceYear205(Field source) {
      detailData3205.getDetail1205().setHserviceYear205(source);
   }  
   
     /**
	 * 	Update HserviceYear205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceYear205(Field source, int sourceIndex,int sourceLen) {
      detailData3205.getDetail1205().setHserviceYear205(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceYear205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceYear205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData3205.getDetail1205().setHserviceYear205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceSec205
	 *	@return hserviceSec205
	 */
   public char[] getHserviceSec205() throws CFException  {              
   		return detailData3205.getDetail1205().getHserviceSec205();
   }

  
	/**
	*  set variable hserviceSec205
	*  @param value
	**/
   public void setHserviceSec205(char[] value) throws CFException {
      detailData3205.getDetail1205().setHserviceSec205(value);
   } 

     /**
	 * 	Update HserviceSec205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceSec205(char[] source, int sourceIndex) throws CFException {
      detailData3205.getDetail1205().setHserviceSec205(source, sourceIndex);
   	
   }
   
   public void setHserviceSec205(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData3205.getDetail1205().setHserviceSec205(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceSec205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceSec205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData3205.getDetail1205().setHserviceSec205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceSec205 with another Field
	 *	@param value
	 */
   public void setHserviceSec205(Field source) {
      detailData3205.getDetail1205().setHserviceSec205(source);
   }  
   
     /**
	 * 	Update HserviceSec205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceSec205(Field source, int sourceIndex,int sourceLen) {
      detailData3205.getDetail1205().setHserviceSec205(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceSec205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceSec205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData3205.getDetail1205().setHserviceSec205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceCc800
	 *	@return hserviceCc800
	 */
   public char[] getHserviceCc800() throws CFException  {              
   		return highServiceTime800.getHserviceDate800().getHserviceCc800();
   }

  
	/**
	*  set variable hserviceCc800
	*  @param value
	**/
   public void setHserviceCc800(char[] value) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceCc800(value);
   } 

     /**
	 * 	Update HserviceCc800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceCc800(char[] source, int sourceIndex) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceCc800(source, sourceIndex);
   	
   }
   
   public void setHserviceCc800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      highServiceTime800.getHserviceDate800().setHserviceCc800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceCc800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceCc800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceCc800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceCc800 with another Field
	 *	@param value
	 */
   public void setHserviceCc800(Field source) {
      highServiceTime800.getHserviceDate800().setHserviceCc800(source);
   }  
   
     /**
	 * 	Update HserviceCc800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceCc800(Field source, int sourceIndex,int sourceLen) {
      highServiceTime800.getHserviceDate800().setHserviceCc800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceCc800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceCc800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceCc800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceMm800
	 *	@return lserviceMm800
	 */
   public char[] getLserviceMm800() throws CFException  {              
   		return lowServiceTime800.getLserviceDate800().getLserviceMm800();
   }

  
	/**
	*  set variable lserviceMm800
	*  @param value
	**/
   public void setLserviceMm800(char[] value) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceMm800(value);
   } 

     /**
	 * 	Update LserviceMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceMm800(char[] source, int sourceIndex) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceMm800(source, sourceIndex);
   	
   }
   
   public void setLserviceMm800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lowServiceTime800.getLserviceDate800().setLserviceMm800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceMm800 with another Field
	 *	@param value
	 */
   public void setLserviceMm800(Field source) {
      lowServiceTime800.getLserviceDate800().setLserviceMm800(source);
   }  
   
     /**
	 * 	Update LserviceMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceMm800(Field source, int sourceIndex,int sourceLen) {
      lowServiceTime800.getLserviceDate800().setLserviceMm800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceYy800
	 *	@return hserviceYy800
	 */
   public char[] getHserviceYy800() throws CFException  {              
   		return highServiceTime800.getHserviceDate800().getHserviceYy800();
   }

  
	/**
	*  set variable hserviceYy800
	*  @param value
	**/
   public void setHserviceYy800(char[] value) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceYy800(value);
   } 

     /**
	 * 	Update HserviceYy800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceYy800(char[] source, int sourceIndex) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceYy800(source, sourceIndex);
   	
   }
   
   public void setHserviceYy800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      highServiceTime800.getHserviceDate800().setHserviceYy800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceYy800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceYy800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceYy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceYy800 with another Field
	 *	@param value
	 */
   public void setHserviceYy800(Field source) {
      highServiceTime800.getHserviceDate800().setHserviceYy800(source);
   }  
   
     /**
	 * 	Update HserviceYy800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceYy800(Field source, int sourceIndex,int sourceLen) {
      highServiceTime800.getHserviceDate800().setHserviceYy800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceYy800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceYy800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceYy800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceMins800
	 *	@return lserviceMins800
	 */
   public char[] getLserviceMins800() throws CFException  {              
   		return lowServiceTime800.getLserviceTime800().getLserviceMins800();
   }

  
	/**
	*  set variable lserviceMins800
	*  @param value
	**/
   public void setLserviceMins800(char[] value) throws CFException {
      lowServiceTime800.getLserviceTime800().setLserviceMins800(value);
   } 

     /**
	 * 	Update LserviceMins800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceMins800(char[] source, int sourceIndex) throws CFException {
      lowServiceTime800.getLserviceTime800().setLserviceMins800(source, sourceIndex);
   	
   }
   
   public void setLserviceMins800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lowServiceTime800.getLserviceTime800().setLserviceMins800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceMins800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMins800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceTime800().setLserviceMins800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceMins800 with another Field
	 *	@param value
	 */
   public void setLserviceMins800(Field source) {
      lowServiceTime800.getLserviceTime800().setLserviceMins800(source);
   }  
   
     /**
	 * 	Update LserviceMins800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceMins800(Field source, int sourceIndex,int sourceLen) {
      lowServiceTime800.getLserviceTime800().setLserviceMins800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceMins800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMins800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceTime800().setLserviceMins800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceHh800
	 *	@return lserviceHh800
	 */
   public char[] getLserviceHh800() throws CFException  {              
   		return lowServiceTime800.getLserviceTime800().getLserviceHh800();
   }

  
	/**
	*  set variable lserviceHh800
	*  @param value
	**/
   public void setLserviceHh800(char[] value) throws CFException {
      lowServiceTime800.getLserviceTime800().setLserviceHh800(value);
   } 

     /**
	 * 	Update LserviceHh800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceHh800(char[] source, int sourceIndex) throws CFException {
      lowServiceTime800.getLserviceTime800().setLserviceHh800(source, sourceIndex);
   	
   }
   
   public void setLserviceHh800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lowServiceTime800.getLserviceTime800().setLserviceHh800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceHh800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceHh800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceTime800().setLserviceHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceHh800 with another Field
	 *	@param value
	 */
   public void setLserviceHh800(Field source) {
      lowServiceTime800.getLserviceTime800().setLserviceHh800(source);
   }  
   
     /**
	 * 	Update LserviceHh800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceHh800(Field source, int sourceIndex,int sourceLen) {
      lowServiceTime800.getLserviceTime800().setLserviceHh800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceHh800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceHh800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceTime800().setLserviceHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceSec800
	 *	@return hserviceSec800
	 */
   public char[] getHserviceSec800() throws CFException  {              
   		return highServiceTime800.getHserviceTime800().getHserviceSec800();
   }

  
	/**
	*  set variable hserviceSec800
	*  @param value
	**/
   public void setHserviceSec800(char[] value) throws CFException {
      highServiceTime800.getHserviceTime800().setHserviceSec800(value);
   } 

     /**
	 * 	Update HserviceSec800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceSec800(char[] source, int sourceIndex) throws CFException {
      highServiceTime800.getHserviceTime800().setHserviceSec800(source, sourceIndex);
   	
   }
   
   public void setHserviceSec800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      highServiceTime800.getHserviceTime800().setHserviceSec800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceSec800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceSec800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceTime800().setHserviceSec800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceSec800 with another Field
	 *	@param value
	 */
   public void setHserviceSec800(Field source) {
      highServiceTime800.getHserviceTime800().setHserviceSec800(source);
   }  
   
     /**
	 * 	Update HserviceSec800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceSec800(Field source, int sourceIndex,int sourceLen) {
      highServiceTime800.getHserviceTime800().setHserviceSec800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceSec800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceSec800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceTime800().setHserviceSec800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceMins800
	 *	@return hserviceMins800
	 */
   public char[] getHserviceMins800() throws CFException  {              
   		return highServiceTime800.getHserviceTime800().getHserviceMins800();
   }

  
	/**
	*  set variable hserviceMins800
	*  @param value
	**/
   public void setHserviceMins800(char[] value) throws CFException {
      highServiceTime800.getHserviceTime800().setHserviceMins800(value);
   } 

     /**
	 * 	Update HserviceMins800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceMins800(char[] source, int sourceIndex) throws CFException {
      highServiceTime800.getHserviceTime800().setHserviceMins800(source, sourceIndex);
   	
   }
   
   public void setHserviceMins800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      highServiceTime800.getHserviceTime800().setHserviceMins800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceMins800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMins800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceTime800().setHserviceMins800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceMins800 with another Field
	 *	@param value
	 */
   public void setHserviceMins800(Field source) {
      highServiceTime800.getHserviceTime800().setHserviceMins800(source);
   }  
   
     /**
	 * 	Update HserviceMins800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceMins800(Field source, int sourceIndex,int sourceLen) {
      highServiceTime800.getHserviceTime800().setHserviceMins800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceMins800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMins800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceTime800().setHserviceMins800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceCentury205
	 *	@return hserviceCentury205
	 */
   public char[] getHserviceCentury205() throws CFException  {              
   		return detailData3205.getDetail1205().getHserviceCentury205();
   }

  
	/**
	*  set variable hserviceCentury205
	*  @param value
	**/
   public void setHserviceCentury205(char[] value) throws CFException {
      detailData3205.getDetail1205().setHserviceCentury205(value);
   } 

     /**
	 * 	Update HserviceCentury205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceCentury205(char[] source, int sourceIndex) throws CFException {
      detailData3205.getDetail1205().setHserviceCentury205(source, sourceIndex);
   	
   }
   
   public void setHserviceCentury205(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData3205.getDetail1205().setHserviceCentury205(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceCentury205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceCentury205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData3205.getDetail1205().setHserviceCentury205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceCentury205 with another Field
	 *	@param value
	 */
   public void setHserviceCentury205(Field source) {
      detailData3205.getDetail1205().setHserviceCentury205(source);
   }  
   
     /**
	 * 	Update HserviceCentury205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceCentury205(Field source, int sourceIndex,int sourceLen) {
      detailData3205.getDetail1205().setHserviceCentury205(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceCentury205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceCentury205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData3205.getDetail1205().setHserviceCentury205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceMins205
	 *	@return hserviceMins205
	 */
   public char[] getHserviceMins205() throws CFException  {              
   		return detailData3205.getDetail1205().getHserviceMins205();
   }

  
	/**
	*  set variable hserviceMins205
	*  @param value
	**/
   public void setHserviceMins205(char[] value) throws CFException {
      detailData3205.getDetail1205().setHserviceMins205(value);
   } 

     /**
	 * 	Update HserviceMins205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceMins205(char[] source, int sourceIndex) throws CFException {
      detailData3205.getDetail1205().setHserviceMins205(source, sourceIndex);
   	
   }
   
   public void setHserviceMins205(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData3205.getDetail1205().setHserviceMins205(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceMins205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMins205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData3205.getDetail1205().setHserviceMins205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceMins205 with another Field
	 *	@param value
	 */
   public void setHserviceMins205(Field source) {
      detailData3205.getDetail1205().setHserviceMins205(source);
   }  
   
     /**
	 * 	Update HserviceMins205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceMins205(Field source, int sourceIndex,int sourceLen) {
      detailData3205.getDetail1205().setHserviceMins205(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceMins205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMins205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData3205.getDetail1205().setHserviceMins205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceDate205
	 *	@return lserviceDate205
	 */
   public char[] getLserviceDate205() throws CFException  {              
   		return detailData3205.getDetail1205().getLserviceDate205();
   }

  
	/**
	*  set variable lserviceDate205
	*  @param value
	**/
   public void setLserviceDate205(char[] value) throws CFException {
      detailData3205.getDetail1205().setLserviceDate205(value);
   } 

     /**
	 * 	Update LserviceDate205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceDate205(char[] source, int sourceIndex) throws CFException {
      detailData3205.getDetail1205().setLserviceDate205(source, sourceIndex);
   	
   }
   
   public void setLserviceDate205(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData3205.getDetail1205().setLserviceDate205(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceDate205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceDate205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData3205.getDetail1205().setLserviceDate205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceDate205 with another Field
	 *	@param value
	 */
   public void setLserviceDate205(Field source) {
      detailData3205.getDetail1205().setLserviceDate205(source);
   }  
   
     /**
	 * 	Update LserviceDate205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceDate205(Field source, int sourceIndex,int sourceLen) {
      detailData3205.getDetail1205().setLserviceDate205(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceDate205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceDate205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData3205.getDetail1205().setLserviceDate205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceCentury205
	 *	@return lserviceCentury205
	 */
   public char[] getLserviceCentury205() throws CFException  {              
   		return detailData3205.getDetail1205().getLserviceCentury205();
   }

  
	/**
	*  set variable lserviceCentury205
	*  @param value
	**/
   public void setLserviceCentury205(char[] value) throws CFException {
      detailData3205.getDetail1205().setLserviceCentury205(value);
   } 

     /**
	 * 	Update LserviceCentury205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceCentury205(char[] source, int sourceIndex) throws CFException {
      detailData3205.getDetail1205().setLserviceCentury205(source, sourceIndex);
   	
   }
   
   public void setLserviceCentury205(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData3205.getDetail1205().setLserviceCentury205(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceCentury205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceCentury205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData3205.getDetail1205().setLserviceCentury205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceCentury205 with another Field
	 *	@param value
	 */
   public void setLserviceCentury205(Field source) {
      detailData3205.getDetail1205().setLserviceCentury205(source);
   }  
   
     /**
	 * 	Update LserviceCentury205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceCentury205(Field source, int sourceIndex,int sourceLen) {
      detailData3205.getDetail1205().setLserviceCentury205(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceCentury205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceCentury205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData3205.getDetail1205().setLserviceCentury205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceHh205
	 *	@return lserviceHh205
	 */
   public char[] getLserviceHh205() throws CFException  {              
   		return detailData3205.getDetail1205().getLserviceHh205();
   }

  
	/**
	*  set variable lserviceHh205
	*  @param value
	**/
   public void setLserviceHh205(char[] value) throws CFException {
      detailData3205.getDetail1205().setLserviceHh205(value);
   } 

     /**
	 * 	Update LserviceHh205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceHh205(char[] source, int sourceIndex) throws CFException {
      detailData3205.getDetail1205().setLserviceHh205(source, sourceIndex);
   	
   }
   
   public void setLserviceHh205(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData3205.getDetail1205().setLserviceHh205(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceHh205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceHh205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData3205.getDetail1205().setLserviceHh205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceHh205 with another Field
	 *	@param value
	 */
   public void setLserviceHh205(Field source) {
      detailData3205.getDetail1205().setLserviceHh205(source);
   }  
   
     /**
	 * 	Update LserviceHh205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceHh205(Field source, int sourceIndex,int sourceLen) {
      detailData3205.getDetail1205().setLserviceHh205(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceHh205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceHh205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData3205.getDetail1205().setLserviceHh205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of runMonth800
	 *	@return runMonth800
	 */
   public char[] getRunMonth800() throws CFException  {              
   		return work.getRunMonth800();
   }

  
	/**
	*  set variable runMonth800
	*  @param value
	**/
   public void setRunMonth800(char[] value) throws CFException {
      work.setRunMonth800(value);
   } 

	/**
	 *	Returns the value of hserviceDd800
	 *	@return hserviceDd800
	 */
   public char[] getHserviceDd800() throws CFException  {              
   		return highServiceTime800.getHserviceDate800().getHserviceDd800();
   }

  
	/**
	*  set variable hserviceDd800
	*  @param value
	**/
   public void setHserviceDd800(char[] value) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceDd800(value);
   } 

     /**
	 * 	Update HserviceDd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceDd800(char[] source, int sourceIndex) throws CFException {
      highServiceTime800.getHserviceDate800().setHserviceDd800(source, sourceIndex);
   	
   }
   
   public void setHserviceDd800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      highServiceTime800.getHserviceDate800().setHserviceDd800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceDd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceDd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceDd800 with another Field
	 *	@param value
	 */
   public void setHserviceDd800(Field source) {
      highServiceTime800.getHserviceDate800().setHserviceDd800(source);
   }  
   
     /**
	 * 	Update HserviceDd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceDd800(Field source, int sourceIndex,int sourceLen) {
      highServiceTime800.getHserviceDate800().setHserviceDd800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceDd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceDd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      highServiceTime800.getHserviceDate800().setHserviceDd800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public long getLineCount400() throws CFException {  
        return work.getLineCount400();
}
	/**
	 * 	Update LineCount400 with the passed value
	 *	@param number
	 */
	public void setLineCount400(long number)  throws CFException{
		work.setLineCount400(number);
	}



	/**
	 *	Returns the value of lserviceCc800
	 *	@return lserviceCc800
	 */
   public char[] getLserviceCc800() throws CFException  {              
   		return lowServiceTime800.getLserviceDate800().getLserviceCc800();
   }

  
	/**
	*  set variable lserviceCc800
	*  @param value
	**/
   public void setLserviceCc800(char[] value) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceCc800(value);
   } 

     /**
	 * 	Update LserviceCc800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceCc800(char[] source, int sourceIndex) throws CFException {
      lowServiceTime800.getLserviceDate800().setLserviceCc800(source, sourceIndex);
   	
   }
   
   public void setLserviceCc800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lowServiceTime800.getLserviceDate800().setLserviceCc800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceCc800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceCc800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceCc800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceCc800 with another Field
	 *	@param value
	 */
   public void setLserviceCc800(Field source) {
      lowServiceTime800.getLserviceDate800().setLserviceCc800(source);
   }  
   
     /**
	 * 	Update LserviceCc800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceCc800(Field source, int sourceIndex,int sourceLen) {
      lowServiceTime800.getLserviceDate800().setLserviceCc800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceCc800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceCc800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceDate800().setLserviceCc800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of hserviceDate205
	 *	@return hserviceDate205
	 */
   public char[] getHserviceDate205() throws CFException  {              
   		return detailData3205.getDetail1205().getHserviceDate205();
   }

  
	/**
	*  set variable hserviceDate205
	*  @param value
	**/
   public void setHserviceDate205(char[] value) throws CFException {
      detailData3205.getDetail1205().setHserviceDate205(value);
   } 

     /**
	 * 	Update HserviceDate205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceDate205(char[] source, int sourceIndex) throws CFException {
      detailData3205.getDetail1205().setHserviceDate205(source, sourceIndex);
   	
   }
   
   public void setHserviceDate205(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData3205.getDetail1205().setHserviceDate205(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HserviceDate205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceDate205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData3205.getDetail1205().setHserviceDate205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HserviceDate205 with another Field
	 *	@param value
	 */
   public void setHserviceDate205(Field source) {
      detailData3205.getDetail1205().setHserviceDate205(source);
   }  
   
     /**
	 * 	Update HserviceDate205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceDate205(Field source, int sourceIndex,int sourceLen) {
      detailData3205.getDetail1205().setHserviceDate205(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HserviceDate205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceDate205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData3205.getDetail1205().setHserviceDate205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lserviceMonth205
	 *	@return lserviceMonth205
	 */
   public char[] getLserviceMonth205() throws CFException  {              
   		return detailData3205.getDetail1205().getLserviceMonth205();
   }

  
	/**
	*  set variable lserviceMonth205
	*  @param value
	**/
   public void setLserviceMonth205(char[] value) throws CFException {
      detailData3205.getDetail1205().setLserviceMonth205(value);
   } 

     /**
	 * 	Update LserviceMonth205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceMonth205(char[] source, int sourceIndex) throws CFException {
      detailData3205.getDetail1205().setLserviceMonth205(source, sourceIndex);
   	
   }
   
   public void setLserviceMonth205(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      detailData3205.getDetail1205().setLserviceMonth205(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceMonth205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMonth205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData3205.getDetail1205().setLserviceMonth205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceMonth205 with another Field
	 *	@param value
	 */
   public void setLserviceMonth205(Field source) {
      detailData3205.getDetail1205().setLserviceMonth205(source);
   }  
   
     /**
	 * 	Update LserviceMonth205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceMonth205(Field source, int sourceIndex,int sourceLen) {
      detailData3205.getDetail1205().setLserviceMonth205(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceMonth205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMonth205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      detailData3205.getDetail1205().setLserviceMonth205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of mnthMmNum100
	 *	@return mnthMmNum100
	 */
   public char[] getMnthMmNum100() throws CFException  {              
   		return work.getMnthMmNum100();
   }

  
	/**
	*  set variable mnthMmNum100
	*  @param value
	**/
   public void setMnthMmNum100(char[] value) throws CFException {
      work.setMnthMmNum100(value);
   } 

	/**
	 *	Returns the value of lserviceSec800
	 *	@return lserviceSec800
	 */
   public char[] getLserviceSec800() throws CFException  {              
   		return lowServiceTime800.getLserviceTime800().getLserviceSec800();
   }

  
	/**
	*  set variable lserviceSec800
	*  @param value
	**/
   public void setLserviceSec800(char[] value) throws CFException {
      lowServiceTime800.getLserviceTime800().setLserviceSec800(value);
   } 

     /**
	 * 	Update LserviceSec800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceSec800(char[] source, int sourceIndex) throws CFException {
      lowServiceTime800.getLserviceTime800().setLserviceSec800(source, sourceIndex);
   	
   }
   
   public void setLserviceSec800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lowServiceTime800.getLserviceTime800().setLserviceSec800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LserviceSec800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceSec800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceTime800().setLserviceSec800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LserviceSec800 with another Field
	 *	@param value
	 */
   public void setLserviceSec800(Field source) {
      lowServiceTime800.getLserviceTime800().setLserviceSec800(source);
   }  
   
     /**
	 * 	Update LserviceSec800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceSec800(Field source, int sourceIndex,int sourceLen) {
      lowServiceTime800.getLserviceTime800().setLserviceSec800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LserviceSec800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceSec800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lowServiceTime800.getLserviceTime800().setLserviceSec800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += detailData3205.hashCode();
        str += work.hashCode();
        str += highServiceTime800.hashCode();
        str += lowServiceTime800.hashCode();
        str += sys201AsaServerRec.hashCode();
       return str.hashCode();
    }

    public DisplayServiceDateOutCtx clone() {
        DisplayServiceDateOutCtx cloneObj = new DisplayServiceDateOutCtx();
        cloneObj.detailData3205 = new DetailData3205();
        cloneObj.detailData3205.set(detailData3205.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.highServiceTime800 = new HighServiceTime800();
        cloneObj.highServiceTime800.set(highServiceTime800.getClonedField());
        cloneObj.lowServiceTime800 = new LowServiceTime800();
        cloneObj.lowServiceTime800.set(lowServiceTime800.getClonedField());
        cloneObj.sys201AsaServerRec = new Sys201AsaServerRec();
        cloneObj.sys201AsaServerRec.set(sys201AsaServerRec.getClonedField());
        return cloneObj;
    }

    }

    public DisplayServiceDateOutCtx getDisplayServiceDateOutCtx() {
            return new DisplayServiceDateOutCtx();
    }
     public class ReadSys001InCtx implements Cloneable {
     Work work = Sf327010Ctx.this.getWork();
     Group1 group1 = Sf327010Ctx.this.getGroup1();
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf327010Ctx.this.getSf528ExtractZLogRec();

public long getReadCount400() throws CFException {  
        return work.getReadCount400();
}
	/**
	 * 	Update ReadCount400 with the passed value
	 *	@param number
	 */
	public void setReadCount400(long number)  throws CFException{
		work.setReadCount400(number);
	}



	/**
	 *	Returns the value of sf528ExtractZLogRec
	 *	@return sf528ExtractZLogRec
	 */   
	 public Sf528ExtractZLogRec getSf528ExtractZLogRec() {
   	return sf528ExtractZLogRec;
   }


	/**
	 *	Returns the value of plus1300
	 *	@return plus1300
	 */
	public int getPlus1300() throws CFException {
   		return work.getPlus1300();
	}


	/**
	 *	Returns String value of plus1300
	 *	@return plus1300
	 */
	public char[]  getPlus1300String() throws CFException {
	     return String.valueOf(work.getPlus1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plus1300IsNumeric()  throws CFException{
	    return work.plus1300IsNumeric();
	}

	/**
	 * 	Update Plus1300 with the passed value
	 *	@param number
	 */
	public void setPlus1300(int number)  throws CFException{
		work.setPlus1300(number);
	}
	

	public void setPlus1300(long number)  throws CFException{
	    work.setPlus1300(number);
	}
	
	
	/**
	 * 	Update Plus1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlus1300(char[] value)  throws CFException {
		work.setPlus1300(value);
	}
	
	/**
	 * 	Update Plus1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlus1300String(char[] value)  throws CFException{
		work.setPlus1300(value);
	}	


        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
        }

        public ReadSys001OutCtx getReadSys001OutCtx() {
            return new ReadSys001OutCtx();
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
        str += group1.hashCode();
        str += sf528ExtractZLogRec.hashCode();
       return str.hashCode();
    }

    public ReadSys001InCtx clone() {
        ReadSys001InCtx cloneObj = new ReadSys001InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.group1 = new Group1();
        cloneObj.group1.set(group1.getClonedField());
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        return cloneObj;
    }

    }

    public ReadSys001InCtx getReadSys001InCtx() {
            return new ReadSys001InCtx();
    }
     public class ReadSys001OutCtx implements Cloneable {
     Work work = Sf327010Ctx.this.getWork();
     Group1 group1 = Sf327010Ctx.this.getGroup1();
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf327010Ctx.this.getSf528ExtractZLogRec();

public long getReadCount400() throws CFException {  
        return work.getReadCount400();
}
	/**
	 * 	Update ReadCount400 with the passed value
	 *	@param number
	 */
	public void setReadCount400(long number)  throws CFException{
		work.setReadCount400(number);
	}



	/**
	 *	Returns the value of group1
	 *	@return group1
	 */   
	 public Group1 getGroup1() {
   	return group1;
   }


	/**
	 *	Test condition "Y" for isZLogEof88100()
	 *	@return  Returns true if isZLogEof88100() is "Y"
	 */
   public boolean isZLogEof88100() throws CFException {
      return work.isZLogEof88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setZLogEof88100True()  throws CFException{  			
    	work.setZLogEof88100True();
   	}

        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
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
        str += group1.hashCode();
        str += sf528ExtractZLogRec.hashCode();
       return str.hashCode();
    }

    public ReadSys001OutCtx clone() {
        ReadSys001OutCtx cloneObj = new ReadSys001OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.group1 = new Group1();
        cloneObj.group1.set(group1.getClonedField());
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        return cloneObj;
    }

    }

    public ReadSys001OutCtx getReadSys001OutCtx() {
            return new ReadSys001OutCtx();
    }
     public class BackupRecordDataInCtx implements Cloneable {
     Work work = Sf327010Ctx.this.getWork();
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf327010Ctx.this.getSf528ExtractZLogRec();

	/**
	 *	Returns the value of sf528LogType
	 *	@return sf528LogType
	 */
   public char[] getSf528LogType() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528LogType();
   }

  
	/**
	*  set variable sf528LogType
	*  @param value
	**/
   public void setSf528LogType(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528LogType(value);
   } 

     /**
	 * 	Update Sf528LogType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528LogType(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex);
   	
   }
   
   public void setSf528LogType(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528LogType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528LogType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528LogType with another Field
	 *	@param value
	 */
   public void setSf528LogType(Field source) {
      sf528ExtractZLogRec.setSf528LogType(source);
   }  
   
     /**
	 * 	Update Sf528LogType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528LogType(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528LogType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528LogType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf528ServerId
	 *	@return sf528ServerId
	 */
   public char[] getSf528ServerId() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServerId();
   }

  
	/**
	*  set variable sf528ServerId
	*  @param value
	**/
   public void setSf528ServerId(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528ServerId(value);
   } 

     /**
	 * 	Update Sf528ServerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServerId(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex);
   	
   }
   
   public void setSf528ServerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServerId with another Field
	 *	@param value
	 */
   public void setSf528ServerId(Field source) {
      sf528ExtractZLogRec.setSf528ServerId(source);
   }  
   
     /**
	 * 	Update Sf528ServerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServerId(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf528ServiceId
	 *	@return sf528ServiceId
	 */
   public char[] getSf528ServiceId() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServiceId();
   }

  
	/**
	*  set variable sf528ServiceId
	*  @param value
	**/
   public void setSf528ServiceId(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceId(value);
   } 

     /**
	 * 	Update Sf528ServiceId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceId(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex);
   	
   }
   
   public void setSf528ServiceId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServiceId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServiceId with another Field
	 *	@param value
	 */
   public void setSf528ServiceId(Field source) {
      sf528ExtractZLogRec.setSf528ServiceId(source);
   }  
   
     /**
	 * 	Update Sf528ServiceId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceId(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServiceId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
        }

        public BackupRecordDataOutCtx getBackupRecordDataOutCtx() {
            return new BackupRecordDataOutCtx();
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
        str += sf528ExtractZLogRec.hashCode();
       return str.hashCode();
    }

    public BackupRecordDataInCtx clone() {
        BackupRecordDataInCtx cloneObj = new BackupRecordDataInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        return cloneObj;
    }

    }

    public BackupRecordDataInCtx getBackupRecordDataInCtx() {
            return new BackupRecordDataInCtx();
    }
     public class BackupRecordDataOutCtx implements Cloneable {
     Work work = Sf327010Ctx.this.getWork();
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf327010Ctx.this.getSf528ExtractZLogRec();

	/**
	 *	Returns the value of sf528LogType
	 *	@return sf528LogType
	 */
   public char[] getSf528LogType() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528LogType();
   }

  
	/**
	*  set variable sf528LogType
	*  @param value
	**/
   public void setSf528LogType(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528LogType(value);
   } 

     /**
	 * 	Update Sf528LogType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528LogType(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex);
   	
   }
   
   public void setSf528LogType(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528LogType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528LogType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528LogType with another Field
	 *	@param value
	 */
   public void setSf528LogType(Field source) {
      sf528ExtractZLogRec.setSf528LogType(source);
   }  
   
     /**
	 * 	Update Sf528LogType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528LogType(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528LogType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528LogType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528LogType(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf528ServerId
	 *	@return sf528ServerId
	 */
   public char[] getSf528ServerId() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServerId();
   }

  
	/**
	*  set variable sf528ServerId
	*  @param value
	**/
   public void setSf528ServerId(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528ServerId(value);
   } 

     /**
	 * 	Update Sf528ServerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServerId(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex);
   	
   }
   
   public void setSf528ServerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServerId with another Field
	 *	@param value
	 */
   public void setSf528ServerId(Field source) {
      sf528ExtractZLogRec.setSf528ServerId(source);
   }  
   
     /**
	 * 	Update Sf528ServerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServerId(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prevServerId800
	 *	@return prevServerId800
	 */
   public char[] getPrevServerId800() throws CFException  {              
   		return work.getPrevServerId800();
   }

  
	/**
	*  set variable prevServerId800
	*  @param value
	**/
   public void setPrevServerId800(char[] value) throws CFException {
      work.setPrevServerId800(value);
   } 

	/**
	 *	Returns the value of prevLogType800
	 *	@return prevLogType800
	 */
   public char[] getPrevLogType800() throws CFException  {              
   		return work.getPrevLogType800();
   }

  
	/**
	*  set variable prevLogType800
	*  @param value
	**/
   public void setPrevLogType800(char[] value) throws CFException {
      work.setPrevLogType800(value);
   } 

	/**
	 *	Returns the value of sf528ServiceId
	 *	@return sf528ServiceId
	 */
   public char[] getSf528ServiceId() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServiceId();
   }

  
	/**
	*  set variable sf528ServiceId
	*  @param value
	**/
   public void setSf528ServiceId(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceId(value);
   } 

     /**
	 * 	Update Sf528ServiceId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceId(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex);
   	
   }
   
   public void setSf528ServiceId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServiceId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServiceId with another Field
	 *	@param value
	 */
   public void setSf528ServiceId(Field source) {
      sf528ExtractZLogRec.setSf528ServiceId(source);
   }  
   
     /**
	 * 	Update Sf528ServiceId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceId(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServiceId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServiceId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prevServiceId800
	 *	@return prevServiceId800
	 */
   public char[] getPrevServiceId800() throws CFException  {              
   		return work.getPrevServiceId800();
   }

  
	/**
	*  set variable prevServiceId800
	*  @param value
	**/
   public void setPrevServiceId800(char[] value) throws CFException {
      work.setPrevServiceId800(value);
   } 


        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
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
        str += sf528ExtractZLogRec.hashCode();
       return str.hashCode();
    }

    public BackupRecordDataOutCtx clone() {
        BackupRecordDataOutCtx cloneObj = new BackupRecordDataOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        return cloneObj;
    }

    }

    public BackupRecordDataOutCtx getBackupRecordDataOutCtx() {
            return new BackupRecordDataOutCtx();
    }
     public class InitializeValuesInCtx implements Cloneable {
     Work work = Sf327010Ctx.this.getWork();
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf327010Ctx.this.getSf528ExtractZLogRec();

	/**
	 *	Returns the value of sf528ElapsedTime
	 *	@return sf528ElapsedTime
	 */
	public int getSf528ElapsedTime() throws CFException {        
   		return sf528ExtractZLogRec.getSf528ElapsedTime();
	}
	
	/**
	 * 	Update Sf528ElapsedTime with the passed value
	 *	@param number
	 */
	public void setSf528ElapsedTime(int number)  throws CFException{
		sf528ExtractZLogRec.setSf528ElapsedTime(number);
	}


	public void setSf528ElapsedTime(long number)  throws CFException{
		sf528ExtractZLogRec.setSf528ElapsedTime((int)number);
	}


	/**
	 *	Returns the value of num0300
	 *	@return num0300
	 */
	public int getNum0300() throws CFException {
   		return work.getNum0300();
	}


	/**
	 *	Returns String value of num0300
	 *	@return num0300
	 */
	public char[]  getNum0300String() throws CFException {
	     return String.valueOf(work.getNum0300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num0300IsNumeric()  throws CFException{
	    return work.num0300IsNumeric();
	}

	/**
	 * 	Update Num0300 with the passed value
	 *	@param number
	 */
	public void setNum0300(int number)  throws CFException{
		work.setNum0300(number);
	}
	

	public void setNum0300(long number)  throws CFException{
	    work.setNum0300(number);
	}
	
	
	/**
	 * 	Update Num0300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum0300(char[] value)  throws CFException {
		work.setNum0300(value);
	}
	
	/**
	 * 	Update Num0300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum0300String(char[] value)  throws CFException{
		work.setNum0300(value);
	}	


        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
        }

        public InitializeValuesOutCtx getInitializeValuesOutCtx() {
            return new InitializeValuesOutCtx();
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
        str += sf528ExtractZLogRec.hashCode();
       return str.hashCode();
    }

    public InitializeValuesInCtx clone() {
        InitializeValuesInCtx cloneObj = new InitializeValuesInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        return cloneObj;
    }

    }

    public InitializeValuesInCtx getInitializeValuesInCtx() {
            return new InitializeValuesInCtx();
    }
     public class InitializeValuesOutCtx implements Cloneable {
     Work work = Sf327010Ctx.this.getWork();
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf327010Ctx.this.getSf528ExtractZLogRec();

public long getTotMessCount400() throws CFException {  
        return work.getTotMessCount400();
}
	/**
	 * 	Update TotMessCount400 with the passed value
	 *	@param number
	 */
	public void setTotMessCount400(long number)  throws CFException{
		work.setTotMessCount400(number);
	}



	/**
	 *	Returns the value of sf528ElapsedTime
	 *	@return sf528ElapsedTime
	 */
	public int getSf528ElapsedTime() throws CFException {        
   		return sf528ExtractZLogRec.getSf528ElapsedTime();
	}
	
	/**
	 * 	Update Sf528ElapsedTime with the passed value
	 *	@param number
	 */
	public void setSf528ElapsedTime(int number)  throws CFException{
		sf528ExtractZLogRec.setSf528ElapsedTime(number);
	}


	public void setSf528ElapsedTime(long number)  throws CFException{
		sf528ExtractZLogRec.setSf528ElapsedTime((int)number);
	}


	/**
	 *	Returns the value of lowElapsed800
	 *	@return lowElapsed800
	 */
	public int getLowElapsed800() throws CFException {        
   		return work.getLowElapsed800();
	}
	
	/**
	 * 	Update LowElapsed800 with the passed value
	 *	@param number
	 */
	public void setLowElapsed800(int number)  throws CFException{
		work.setLowElapsed800(number);
	}


	public void setLowElapsed800(long number)  throws CFException{
		work.setLowElapsed800((int)number);
	}


public long getSuccessCount400() throws CFException {  
        return work.getSuccessCount400();
}
	/**
	 * 	Update SuccessCount400 with the passed value
	 *	@param number
	 */
	public void setSuccessCount400(long number)  throws CFException{
		work.setSuccessCount400(number);
	}



	/**
	 *	Returns the value of num0300
	 *	@return num0300
	 */
	public int getNum0300() throws CFException {
   		return work.getNum0300();
	}


	/**
	 *	Returns String value of num0300
	 *	@return num0300
	 */
	public char[]  getNum0300String() throws CFException {
	     return String.valueOf(work.getNum0300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num0300IsNumeric()  throws CFException{
	    return work.num0300IsNumeric();
	}

	/**
	 * 	Update Num0300 with the passed value
	 *	@param number
	 */
	public void setNum0300(int number)  throws CFException{
		work.setNum0300(number);
	}
	

	public void setNum0300(long number)  throws CFException{
	    work.setNum0300(number);
	}
	
	
	/**
	 * 	Update Num0300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum0300(char[] value)  throws CFException {
		work.setNum0300(value);
	}
	
	/**
	 * 	Update Num0300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum0300String(char[] value)  throws CFException{
		work.setNum0300(value);
	}	

public long getErrorCount400() throws CFException {  
        return work.getErrorCount400();
}
	/**
	 * 	Update ErrorCount400 with the passed value
	 *	@param number
	 */
	public void setErrorCount400(long number)  throws CFException{
		work.setErrorCount400(number);
	}



	/**
	 *	Returns the value of highElapsed800
	 *	@return highElapsed800
	 */
	public int getHighElapsed800() throws CFException {        
   		return work.getHighElapsed800();
	}
	
	/**
	 * 	Update HighElapsed800 with the passed value
	 *	@param number
	 */
	public void setHighElapsed800(int number)  throws CFException{
		work.setHighElapsed800(number);
	}


	public void setHighElapsed800(long number)  throws CFException{
		work.setHighElapsed800((int)number);
	}


	/**
	 *	Returns the value of sumElapsedTime800
	 *	@return sumElapsedTime800
	 */
	public long getSumElapsedTime800() throws CFException {        
   		return work.getSumElapsedTime800();
	}
	
	/**
	 * 	Update SumElapsedTime800 with the passed value
	 *	@param number
	 */
	public void setSumElapsedTime800(long number)  throws CFException{
		work.setSumElapsedTime800(number);
	}




        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
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
        str += sf528ExtractZLogRec.hashCode();
       return str.hashCode();
    }

    public InitializeValuesOutCtx clone() {
        InitializeValuesOutCtx cloneObj = new InitializeValuesOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        return cloneObj;
    }

    }

    public InitializeValuesOutCtx getInitializeValuesOutCtx() {
            return new InitializeValuesOutCtx();
    }
     public class CalculateRepDataInCtx implements Cloneable {
     Work work = Sf327010Ctx.this.getWork();

public long getTotMessCount400() throws CFException {  
        return work.getTotMessCount400();
}
	/**
	 * 	Update TotMessCount400 with the passed value
	 *	@param number
	 */
	public void setTotMessCount400(long number)  throws CFException{
		work.setTotMessCount400(number);
	}



	/**
	 *	Returns the value of num100300
	 *	@return num100300
	 */
	public short getNum100300() throws CFException {        
   		return work.getNum100300();
	}
	
	/**
	 * 	Update Num100300 with the passed value
	 *	@param number
	 */
	public void setNum100300(short number)  throws CFException{
		work.setNum100300(number);
	}

	public void setNum100300(int number)  throws CFException{
		work.setNum100300((short)number);
	}

	public void setNum100300(long number)  throws CFException{
		work.setNum100300((short)number);
	}



public long getSuccessCount400() throws CFException {  
        return work.getSuccessCount400();
}
	/**
	 * 	Update SuccessCount400 with the passed value
	 *	@param number
	 */
	public void setSuccessCount400(long number)  throws CFException{
		work.setSuccessCount400(number);
	}



public long getErrorCount400() throws CFException {  
        return work.getErrorCount400();
}
	/**
	 * 	Update ErrorCount400 with the passed value
	 *	@param number
	 */
	public void setErrorCount400(long number)  throws CFException{
		work.setErrorCount400(number);
	}



	/**
	 *	Returns the value of sumElapsedTime800
	 *	@return sumElapsedTime800
	 */
	public long getSumElapsedTime800() throws CFException {        
   		return work.getSumElapsedTime800();
	}
	
	/**
	 * 	Update SumElapsedTime800 with the passed value
	 *	@param number
	 */
	public void setSumElapsedTime800(long number)  throws CFException{
		work.setSumElapsedTime800(number);
	}




        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
        }

        public CalculateRepDataOutCtx getCalculateRepDataOutCtx() {
            return new CalculateRepDataOutCtx();
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

    public CalculateRepDataInCtx clone() {
        CalculateRepDataInCtx cloneObj = new CalculateRepDataInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CalculateRepDataInCtx getCalculateRepDataInCtx() {
            return new CalculateRepDataInCtx();
    }
     public class CalculateRepDataOutCtx implements Cloneable {
     Work work = Sf327010Ctx.this.getWork();

	/**
	 *	Returns the value of avgElapsedN800
	 *	@return avgElapsedN800
	 */
	public BigDecimal getAvgElapsedN800() throws CFException {
   		return work.getAvgElapsedN800();
	}


	 /**
     *	Returns String value of avgElapsedN800
     *	@return avgElapsedN800
     */
    public char[]  getAvgElapsedN800String() throws CFException {
         return work.getAvgElapsedN800String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean avgElapsedN800IsNumeric() {
        return work.avgElapsedN800IsNumeric();
    }
	/**
	 * 	Update AvgElapsedN800 with the passed number
	 *	@param number
	 */
	public void setAvgElapsedN800(BigDecimal number)  throws CFException{
		work.setAvgElapsedN800(number);
   }

	/**
	 * 	Update AvgElapsedN800 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setAvgElapsedN800(char[] value)  throws CFException{
		work.setAvgElapsedN800(value);
	}   

	/**
	 *	Returns the value of avgElapsed800
	 *	@return avgElapsed800
	 */
   public char[] getAvgElapsed800() throws CFException  {              
   		return work.getAvgElapsed800();
   }

  
	/**
	*  set variable avgElapsed800
	*  @param value
	**/
   public void setAvgElapsed800(char[] value) throws CFException {
      work.setAvgElapsed800(value);
   } 

     /**
	 * 	Update AvgElapsed800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAvgElapsed800(char[] source, int sourceIndex) throws CFException {
      work.setAvgElapsed800(source, sourceIndex);
   	
   }
   
   public void setAvgElapsed800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setAvgElapsed800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AvgElapsed800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAvgElapsed800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setAvgElapsed800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AvgElapsed800 with another Field
	 *	@param value
	 */
   public void setAvgElapsed800(Field source) {
      work.setAvgElapsed800(source);
   }  
   
     /**
	 * 	Update AvgElapsed800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAvgElapsed800(Field source, int sourceIndex,int sourceLen) {
      work.setAvgElapsed800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AvgElapsed800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAvgElapsed800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setAvgElapsed800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of successPercent400
	 *	@return successPercent400
	 */
	public BigDecimal getSuccessPercent400() throws CFException {
   		return work.getSuccessPercent400();
	}


	 /**
     *	Returns String value of successPercent400
     *	@return successPercent400
     */
    public char[]  getSuccessPercent400String() throws CFException {
         return work.getSuccessPercent400String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean successPercent400IsNumeric() {
        return work.successPercent400IsNumeric();
    }
	/**
	 * 	Update SuccessPercent400 with the passed number
	 *	@param number
	 */
	public void setSuccessPercent400(BigDecimal number)  throws CFException{
		work.setSuccessPercent400(number);
   }

	/**
	 * 	Update SuccessPercent400 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setSuccessPercent400(char[] value)  throws CFException{
		work.setSuccessPercent400(value);
	}   

	/**
	 *	Returns the value of errorPercent400
	 *	@return errorPercent400
	 */
	public BigDecimal getErrorPercent400() throws CFException {
   		return work.getErrorPercent400();
	}


	 /**
     *	Returns String value of errorPercent400
     *	@return errorPercent400
     */
    public char[]  getErrorPercent400String() throws CFException {
         return work.getErrorPercent400String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean errorPercent400IsNumeric() {
        return work.errorPercent400IsNumeric();
    }
	/**
	 * 	Update ErrorPercent400 with the passed number
	 *	@param number
	 */
	public void setErrorPercent400(BigDecimal number)  throws CFException{
		work.setErrorPercent400(number);
   }

	/**
	 * 	Update ErrorPercent400 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setErrorPercent400(char[] value)  throws CFException{
		work.setErrorPercent400(value);
	}   

	/**
	 *	Returns the value of errorPercent800
	 *	@return errorPercent800
	 */
   public char[] getErrorPercent800() throws CFException  {              
   		return work.getErrorPercent800();
   }

  
	/**
	*  set variable errorPercent800
	*  @param value
	**/
   public void setErrorPercent800(char[] value) throws CFException {
      work.setErrorPercent800(value);
   } 

     /**
	 * 	Update ErrorPercent800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorPercent800(char[] source, int sourceIndex) throws CFException {
      work.setErrorPercent800(source, sourceIndex);
   	
   }
   
   public void setErrorPercent800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setErrorPercent800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ErrorPercent800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorPercent800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setErrorPercent800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ErrorPercent800 with another Field
	 *	@param value
	 */
   public void setErrorPercent800(Field source) {
      work.setErrorPercent800(source);
   }  
   
     /**
	 * 	Update ErrorPercent800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorPercent800(Field source, int sourceIndex,int sourceLen) {
      work.setErrorPercent800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ErrorPercent800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorPercent800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setErrorPercent800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of successPercent800
	 *	@return successPercent800
	 */
   public char[] getSuccessPercent800() throws CFException  {              
   		return work.getSuccessPercent800();
   }

  
	/**
	*  set variable successPercent800
	*  @param value
	**/
   public void setSuccessPercent800(char[] value) throws CFException {
      work.setSuccessPercent800(value);
   } 

     /**
	 * 	Update SuccessPercent800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSuccessPercent800(char[] source, int sourceIndex) throws CFException {
      work.setSuccessPercent800(source, sourceIndex);
   	
   }
   
   public void setSuccessPercent800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSuccessPercent800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SuccessPercent800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSuccessPercent800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSuccessPercent800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SuccessPercent800 with another Field
	 *	@param value
	 */
   public void setSuccessPercent800(Field source) {
      work.setSuccessPercent800(source);
   }  
   
     /**
	 * 	Update SuccessPercent800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSuccessPercent800(Field source, int sourceIndex,int sourceLen) {
      work.setSuccessPercent800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SuccessPercent800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSuccessPercent800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSuccessPercent800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
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

    public CalculateRepDataOutCtx clone() {
        CalculateRepDataOutCtx cloneObj = new CalculateRepDataOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CalculateRepDataOutCtx getCalculateRepDataOutCtx() {
            return new CalculateRepDataOutCtx();
    }
     public class CheckLineCountInCtx implements Cloneable {
     HdrLine2202 hdrLine2202 = Sf327010Ctx.this.getHdrLine2202();
     Work work = Sf327010Ctx.this.getWork();
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf327010Ctx.this.getSf528ExtractZLogRec();

public short getMaxLinesPerPage300() throws CFException {  
        return work.getMaxLinesPerPage300();
}
	/**
	 * 	Update MaxLinesPerPage300 with the passed value
	 *	@param number
	 */
	public void setMaxLinesPerPage300(short number)  throws CFException{
		work.setMaxLinesPerPage300(number);
	}

	public void setMaxLinesPerPage300(int number)  throws CFException{
	   work.setMaxLinesPerPage300(number);
	}
	public void setMaxLinesPerPage300(long number)  throws CFException {
	    work.setMaxLinesPerPage300(number);
	}
	


	/**
	 *	Returns the value of sf528ServerId
	 *	@return sf528ServerId
	 */
   public char[] getSf528ServerId() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServerId();
   }

  
	/**
	*  set variable sf528ServerId
	*  @param value
	**/
   public void setSf528ServerId(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528ServerId(value);
   } 

     /**
	 * 	Update Sf528ServerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServerId(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex);
   	
   }
   
   public void setSf528ServerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServerId with another Field
	 *	@param value
	 */
   public void setSf528ServerId(Field source) {
      sf528ExtractZLogRec.setSf528ServerId(source);
   }  
   
     /**
	 * 	Update Sf528ServerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServerId(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of num0300
	 *	@return num0300
	 */
	public int getNum0300() throws CFException {
   		return work.getNum0300();
	}


	/**
	 *	Returns String value of num0300
	 *	@return num0300
	 */
	public char[]  getNum0300String() throws CFException {
	     return String.valueOf(work.getNum0300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num0300IsNumeric()  throws CFException{
	    return work.num0300IsNumeric();
	}

	/**
	 * 	Update Num0300 with the passed value
	 *	@param number
	 */
	public void setNum0300(int number)  throws CFException{
		work.setNum0300(number);
	}
	

	public void setNum0300(long number)  throws CFException{
	    work.setNum0300(number);
	}
	
	
	/**
	 * 	Update Num0300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum0300(char[] value)  throws CFException {
		work.setNum0300(value);
	}
	
	/**
	 * 	Update Num0300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum0300String(char[] value)  throws CFException{
		work.setNum0300(value);
	}	

	/**
	 *	Returns the value of plus1300
	 *	@return plus1300
	 */
	public int getPlus1300() throws CFException {
   		return work.getPlus1300();
	}


	/**
	 *	Returns String value of plus1300
	 *	@return plus1300
	 */
	public char[]  getPlus1300String() throws CFException {
	     return String.valueOf(work.getPlus1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plus1300IsNumeric()  throws CFException{
	    return work.plus1300IsNumeric();
	}

	/**
	 * 	Update Plus1300 with the passed value
	 *	@param number
	 */
	public void setPlus1300(int number)  throws CFException{
		work.setPlus1300(number);
	}
	

	public void setPlus1300(long number)  throws CFException{
	    work.setPlus1300(number);
	}
	
	
	/**
	 * 	Update Plus1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlus1300(char[] value)  throws CFException {
		work.setPlus1300(value);
	}
	
	/**
	 * 	Update Plus1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlus1300String(char[] value)  throws CFException{
		work.setPlus1300(value);
	}	

public long getLineCount400() throws CFException {  
        return work.getLineCount400();
}
	/**
	 * 	Update LineCount400 with the passed value
	 *	@param number
	 */
	public void setLineCount400(long number)  throws CFException{
		work.setLineCount400(number);
	}



public long getPageCount400() throws CFException {  
        return work.getPageCount400();
}
	/**
	 * 	Update PageCount400 with the passed value
	 *	@param number
	 */
	public void setPageCount400(long number)  throws CFException{
		work.setPageCount400(number);
	}




        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
        }

        public CheckLineCountOutCtx getCheckLineCountOutCtx() {
            return new CheckLineCountOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += hdrLine2202.hashCode();
        str += work.hashCode();
        str += sf528ExtractZLogRec.hashCode();
       return str.hashCode();
    }

    public CheckLineCountInCtx clone() {
        CheckLineCountInCtx cloneObj = new CheckLineCountInCtx();
        cloneObj.hdrLine2202 = new HdrLine2202();
        cloneObj.hdrLine2202.set(hdrLine2202.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        return cloneObj;
    }

    }

    public CheckLineCountInCtx getCheckLineCountInCtx() {
            return new CheckLineCountInCtx();
    }
     public class CheckLineCountOutCtx implements Cloneable {
     HdrLine2202 hdrLine2202 = Sf327010Ctx.this.getHdrLine2202();
     Work work = Sf327010Ctx.this.getWork();
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf327010Ctx.this.getSf528ExtractZLogRec();

	/**
	 *	Returns the value of pageCount202
	 *	@return pageCount202
	 */
   public char[] getPageCount202() throws CFException  {              
   		return hdrLine2202.getPageCount202();
   }

  
	/**
	*  set variable pageCount202
	*  @param value
	**/
   public void setPageCount202(char[] value) throws CFException {
      hdrLine2202.setPageCount202(value);
   } 

     /**
	 * 	Update PageCount202 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPageCount202(char[] source, int sourceIndex) throws CFException {
      hdrLine2202.setPageCount202(source, sourceIndex);
   	
   }
   
   public void setPageCount202(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hdrLine2202.setPageCount202(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PageCount202 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPageCount202(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrLine2202.setPageCount202(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PageCount202 with another Field
	 *	@param value
	 */
   public void setPageCount202(Field source) {
      hdrLine2202.setPageCount202(source);
   }  
   
     /**
	 * 	Update PageCount202 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPageCount202(Field source, int sourceIndex,int sourceLen) {
      hdrLine2202.setPageCount202(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PageCount202 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPageCount202(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrLine2202.setPageCount202(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of serverId202
	 *	@return serverId202
	 */
   public char[] getServerId202() throws CFException  {              
   		return hdrLine2202.getServerId202();
   }

  
	/**
	*  set variable serverId202
	*  @param value
	**/
   public void setServerId202(char[] value) throws CFException {
      hdrLine2202.setServerId202(value);
   } 

     /**
	 * 	Update ServerId202 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setServerId202(char[] source, int sourceIndex) throws CFException {
      hdrLine2202.setServerId202(source, sourceIndex);
   	
   }
   
   public void setServerId202(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      hdrLine2202.setServerId202(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ServerId202 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setServerId202(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrLine2202.setServerId202(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ServerId202 with another Field
	 *	@param value
	 */
   public void setServerId202(Field source) {
      hdrLine2202.setServerId202(source);
   }  
   
     /**
	 * 	Update ServerId202 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setServerId202(Field source, int sourceIndex,int sourceLen) {
      hdrLine2202.setServerId202(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ServerId202 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setServerId202(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      hdrLine2202.setServerId202(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf528ServerId
	 *	@return sf528ServerId
	 */
   public char[] getSf528ServerId() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServerId();
   }

  
	/**
	*  set variable sf528ServerId
	*  @param value
	**/
   public void setSf528ServerId(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528ServerId(value);
   } 

     /**
	 * 	Update Sf528ServerId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServerId(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex);
   	
   }
   
   public void setSf528ServerId(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServerId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServerId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServerId with another Field
	 *	@param value
	 */
   public void setSf528ServerId(Field source) {
      sf528ExtractZLogRec.setSf528ServerId(source);
   }  
   
     /**
	 * 	Update Sf528ServerId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServerId(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServerId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServerId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528ServerId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of num0300
	 *	@return num0300
	 */
	public int getNum0300() throws CFException {
   		return work.getNum0300();
	}


	/**
	 *	Returns String value of num0300
	 *	@return num0300
	 */
	public char[]  getNum0300String() throws CFException {
	     return String.valueOf(work.getNum0300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num0300IsNumeric()  throws CFException{
	    return work.num0300IsNumeric();
	}

	/**
	 * 	Update Num0300 with the passed value
	 *	@param number
	 */
	public void setNum0300(int number)  throws CFException{
		work.setNum0300(number);
	}
	

	public void setNum0300(long number)  throws CFException{
	    work.setNum0300(number);
	}
	
	
	/**
	 * 	Update Num0300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum0300(char[] value)  throws CFException {
		work.setNum0300(value);
	}
	
	/**
	 * 	Update Num0300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum0300String(char[] value)  throws CFException{
		work.setNum0300(value);
	}	

public long getLineCount400() throws CFException {  
        return work.getLineCount400();
}
	/**
	 * 	Update LineCount400 with the passed value
	 *	@param number
	 */
	public void setLineCount400(long number)  throws CFException{
		work.setLineCount400(number);
	}



public long getPageCount400() throws CFException {  
        return work.getPageCount400();
}
	/**
	 * 	Update PageCount400 with the passed value
	 *	@param number
	 */
	public void setPageCount400(long number)  throws CFException{
		work.setPageCount400(number);
	}




        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += hdrLine2202.hashCode();
        str += work.hashCode();
        str += sf528ExtractZLogRec.hashCode();
       return str.hashCode();
    }

    public CheckLineCountOutCtx clone() {
        CheckLineCountOutCtx cloneObj = new CheckLineCountOutCtx();
        cloneObj.hdrLine2202 = new HdrLine2202();
        cloneObj.hdrLine2202.set(hdrLine2202.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        return cloneObj;
    }

    }

    public CheckLineCountOutCtx getCheckLineCountOutCtx() {
            return new CheckLineCountOutCtx();
    }
     public class MoveReportDataInCtx implements Cloneable {
     Work work = Sf327010Ctx.this.getWork();
     DtlLine1205 dtlLine1205 = Sf327010Ctx.this.getDtlLine1205();

public long getTotMessCount400() throws CFException {  
        return work.getTotMessCount400();
}
	/**
	 * 	Update TotMessCount400 with the passed value
	 *	@param number
	 */
	public void setTotMessCount400(long number)  throws CFException{
		work.setTotMessCount400(number);
	}



	/**
	 *	Returns the value of avgElapsed800
	 *	@return avgElapsed800
	 */
   public char[] getAvgElapsed800() throws CFException  {              
   		return work.getAvgElapsed800();
   }

  
	/**
	*  set variable avgElapsed800
	*  @param value
	**/
   public void setAvgElapsed800(char[] value) throws CFException {
      work.setAvgElapsed800(value);
   } 

     /**
	 * 	Update AvgElapsed800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAvgElapsed800(char[] source, int sourceIndex) throws CFException {
      work.setAvgElapsed800(source, sourceIndex);
   	
   }
   
   public void setAvgElapsed800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setAvgElapsed800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AvgElapsed800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAvgElapsed800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setAvgElapsed800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AvgElapsed800 with another Field
	 *	@param value
	 */
   public void setAvgElapsed800(Field source) {
      work.setAvgElapsed800(source);
   }  
   
     /**
	 * 	Update AvgElapsed800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAvgElapsed800(Field source, int sourceIndex,int sourceLen) {
      work.setAvgElapsed800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AvgElapsed800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAvgElapsed800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setAvgElapsed800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lowElapsed800
	 *	@return lowElapsed800
	 */
	public int getLowElapsed800() throws CFException {        
   		return work.getLowElapsed800();
	}
	
	/**
	 * 	Update LowElapsed800 with the passed value
	 *	@param number
	 */
	public void setLowElapsed800(int number)  throws CFException{
		work.setLowElapsed800(number);
	}


	public void setLowElapsed800(long number)  throws CFException{
		work.setLowElapsed800((int)number);
	}


public long getSuccessCount400() throws CFException {  
        return work.getSuccessCount400();
}
	/**
	 * 	Update SuccessCount400 with the passed value
	 *	@param number
	 */
	public void setSuccessCount400(long number)  throws CFException{
		work.setSuccessCount400(number);
	}



	/**
	 *	Returns the value of errorPercent800
	 *	@return errorPercent800
	 */
   public char[] getErrorPercent800() throws CFException  {              
   		return work.getErrorPercent800();
   }

  
	/**
	*  set variable errorPercent800
	*  @param value
	**/
   public void setErrorPercent800(char[] value) throws CFException {
      work.setErrorPercent800(value);
   } 

     /**
	 * 	Update ErrorPercent800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorPercent800(char[] source, int sourceIndex) throws CFException {
      work.setErrorPercent800(source, sourceIndex);
   	
   }
   
   public void setErrorPercent800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setErrorPercent800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ErrorPercent800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorPercent800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setErrorPercent800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ErrorPercent800 with another Field
	 *	@param value
	 */
   public void setErrorPercent800(Field source) {
      work.setErrorPercent800(source);
   }  
   
     /**
	 * 	Update ErrorPercent800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorPercent800(Field source, int sourceIndex,int sourceLen) {
      work.setErrorPercent800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ErrorPercent800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorPercent800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setErrorPercent800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public long getErrorCount400() throws CFException {  
        return work.getErrorCount400();
}
	/**
	 * 	Update ErrorCount400 with the passed value
	 *	@param number
	 */
	public void setErrorCount400(long number)  throws CFException{
		work.setErrorCount400(number);
	}



	/**
	 *	Returns the value of highElapsed800
	 *	@return highElapsed800
	 */
	public int getHighElapsed800() throws CFException {        
   		return work.getHighElapsed800();
	}
	
	/**
	 * 	Update HighElapsed800 with the passed value
	 *	@param number
	 */
	public void setHighElapsed800(int number)  throws CFException{
		work.setHighElapsed800(number);
	}


	public void setHighElapsed800(long number)  throws CFException{
		work.setHighElapsed800((int)number);
	}


	/**
	 *	Returns the value of successPercent800
	 *	@return successPercent800
	 */
   public char[] getSuccessPercent800() throws CFException  {              
   		return work.getSuccessPercent800();
   }

  
	/**
	*  set variable successPercent800
	*  @param value
	**/
   public void setSuccessPercent800(char[] value) throws CFException {
      work.setSuccessPercent800(value);
   } 

     /**
	 * 	Update SuccessPercent800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSuccessPercent800(char[] source, int sourceIndex) throws CFException {
      work.setSuccessPercent800(source, sourceIndex);
   	
   }
   
   public void setSuccessPercent800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSuccessPercent800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SuccessPercent800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSuccessPercent800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSuccessPercent800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SuccessPercent800 with another Field
	 *	@param value
	 */
   public void setSuccessPercent800(Field source) {
      work.setSuccessPercent800(source);
   }  
   
     /**
	 * 	Update SuccessPercent800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSuccessPercent800(Field source, int sourceIndex,int sourceLen) {
      work.setSuccessPercent800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SuccessPercent800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSuccessPercent800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSuccessPercent800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prevServiceId800
	 *	@return prevServiceId800
	 */
   public char[] getPrevServiceId800() throws CFException  {              
   		return work.getPrevServiceId800();
   }

  
	/**
	*  set variable prevServiceId800
	*  @param value
	**/
   public void setPrevServiceId800(char[] value) throws CFException {
      work.setPrevServiceId800(value);
   } 


        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
        }

        public MoveReportDataOutCtx getMoveReportDataOutCtx() {
            return new MoveReportDataOutCtx();
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
        str += dtlLine1205.hashCode();
       return str.hashCode();
    }

    public MoveReportDataInCtx clone() {
        MoveReportDataInCtx cloneObj = new MoveReportDataInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dtlLine1205 = new DtlLine1205();
        cloneObj.dtlLine1205.set(dtlLine1205.getClonedField());
        return cloneObj;
    }

    }

    public MoveReportDataInCtx getMoveReportDataInCtx() {
            return new MoveReportDataInCtx();
    }
     public class MoveReportDataOutCtx implements Cloneable {
     Work work = Sf327010Ctx.this.getWork();
     DtlLine1205 dtlLine1205 = Sf327010Ctx.this.getDtlLine1205();

	/**
	 *	Returns the value of lowElapsed205
	 *	@return lowElapsed205
	 */
   public char[] getLowElapsed205() throws CFException  {              
   		return dtlLine1205.getLowElapsed205();
   }

  
	/**
	*  set variable lowElapsed205
	*  @param value
	**/
   public void setLowElapsed205(char[] value) throws CFException {
      dtlLine1205.setLowElapsed205(value);
   } 

     /**
	 * 	Update LowElapsed205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLowElapsed205(char[] source, int sourceIndex) throws CFException {
      dtlLine1205.setLowElapsed205(source, sourceIndex);
   	
   }
   
   public void setLowElapsed205(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dtlLine1205.setLowElapsed205(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LowElapsed205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLowElapsed205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlLine1205.setLowElapsed205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LowElapsed205 with another Field
	 *	@param value
	 */
   public void setLowElapsed205(Field source) {
      dtlLine1205.setLowElapsed205(source);
   }  
   
     /**
	 * 	Update LowElapsed205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLowElapsed205(Field source, int sourceIndex,int sourceLen) {
      dtlLine1205.setLowElapsed205(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LowElapsed205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLowElapsed205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlLine1205.setLowElapsed205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public long getTotMessCount400() throws CFException {  
        return work.getTotMessCount400();
}
	/**
	 * 	Update TotMessCount400 with the passed value
	 *	@param number
	 */
	public void setTotMessCount400(long number)  throws CFException{
		work.setTotMessCount400(number);
	}



	/**
	 *	Returns the value of avgElapsed205
	 *	@return avgElapsed205
	 */
   public char[] getAvgElapsed205() throws CFException  {              
   		return dtlLine1205.getAvgElapsed205();
   }

  
	/**
	*  set variable avgElapsed205
	*  @param value
	**/
   public void setAvgElapsed205(char[] value) throws CFException {
      dtlLine1205.setAvgElapsed205(value);
   } 

     /**
	 * 	Update AvgElapsed205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAvgElapsed205(char[] source, int sourceIndex) throws CFException {
      dtlLine1205.setAvgElapsed205(source, sourceIndex);
   	
   }
   
   public void setAvgElapsed205(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dtlLine1205.setAvgElapsed205(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AvgElapsed205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAvgElapsed205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlLine1205.setAvgElapsed205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AvgElapsed205 with another Field
	 *	@param value
	 */
   public void setAvgElapsed205(Field source) {
      dtlLine1205.setAvgElapsed205(source);
   }  
   
     /**
	 * 	Update AvgElapsed205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAvgElapsed205(Field source, int sourceIndex,int sourceLen) {
      dtlLine1205.setAvgElapsed205(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AvgElapsed205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAvgElapsed205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlLine1205.setAvgElapsed205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of errorCount205
	 *	@return errorCount205
	 */
   public char[] getErrorCount205() throws CFException  {              
   		return dtlLine1205.getErrorCount205();
   }

  
	/**
	*  set variable errorCount205
	*  @param value
	**/
   public void setErrorCount205(char[] value) throws CFException {
      dtlLine1205.setErrorCount205(value);
   } 

     /**
	 * 	Update ErrorCount205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorCount205(char[] source, int sourceIndex) throws CFException {
      dtlLine1205.setErrorCount205(source, sourceIndex);
   	
   }
   
   public void setErrorCount205(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dtlLine1205.setErrorCount205(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ErrorCount205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorCount205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlLine1205.setErrorCount205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ErrorCount205 with another Field
	 *	@param value
	 */
   public void setErrorCount205(Field source) {
      dtlLine1205.setErrorCount205(source);
   }  
   
     /**
	 * 	Update ErrorCount205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorCount205(Field source, int sourceIndex,int sourceLen) {
      dtlLine1205.setErrorCount205(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ErrorCount205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorCount205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlLine1205.setErrorCount205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lowElapsed800
	 *	@return lowElapsed800
	 */
	public int getLowElapsed800() throws CFException {        
   		return work.getLowElapsed800();
	}
	
	/**
	 * 	Update LowElapsed800 with the passed value
	 *	@param number
	 */
	public void setLowElapsed800(int number)  throws CFException{
		work.setLowElapsed800(number);
	}


	public void setLowElapsed800(long number)  throws CFException{
		work.setLowElapsed800((int)number);
	}


public long getSuccessCount400() throws CFException {  
        return work.getSuccessCount400();
}
	/**
	 * 	Update SuccessCount400 with the passed value
	 *	@param number
	 */
	public void setSuccessCount400(long number)  throws CFException{
		work.setSuccessCount400(number);
	}



public long getErrorCount400() throws CFException {  
        return work.getErrorCount400();
}
	/**
	 * 	Update ErrorCount400 with the passed value
	 *	@param number
	 */
	public void setErrorCount400(long number)  throws CFException{
		work.setErrorCount400(number);
	}



	/**
	 *	Returns the value of prevServiceId800
	 *	@return prevServiceId800
	 */
   public char[] getPrevServiceId800() throws CFException  {              
   		return work.getPrevServiceId800();
   }

  
	/**
	*  set variable prevServiceId800
	*  @param value
	**/
   public void setPrevServiceId800(char[] value) throws CFException {
      work.setPrevServiceId800(value);
   } 

	/**
	 *	Returns the value of successfulPercnt205
	 *	@return successfulPercnt205
	 */
   public char[] getSuccessfulPercnt205() throws CFException  {              
   		return dtlLine1205.getSuccessfulPercnt205();
   }

  
	/**
	*  set variable successfulPercnt205
	*  @param value
	**/
   public void setSuccessfulPercnt205(char[] value) throws CFException {
      dtlLine1205.setSuccessfulPercnt205(value);
   } 

     /**
	 * 	Update SuccessfulPercnt205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSuccessfulPercnt205(char[] source, int sourceIndex) throws CFException {
      dtlLine1205.setSuccessfulPercnt205(source, sourceIndex);
   	
   }
   
   public void setSuccessfulPercnt205(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dtlLine1205.setSuccessfulPercnt205(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SuccessfulPercnt205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSuccessfulPercnt205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlLine1205.setSuccessfulPercnt205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SuccessfulPercnt205 with another Field
	 *	@param value
	 */
   public void setSuccessfulPercnt205(Field source) {
      dtlLine1205.setSuccessfulPercnt205(source);
   }  
   
     /**
	 * 	Update SuccessfulPercnt205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSuccessfulPercnt205(Field source, int sourceIndex,int sourceLen) {
      dtlLine1205.setSuccessfulPercnt205(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SuccessfulPercnt205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSuccessfulPercnt205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlLine1205.setSuccessfulPercnt205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of successfulCount205
	 *	@return successfulCount205
	 */
   public char[] getSuccessfulCount205() throws CFException  {              
   		return dtlLine1205.getSuccessfulCount205();
   }

  
	/**
	*  set variable successfulCount205
	*  @param value
	**/
   public void setSuccessfulCount205(char[] value) throws CFException {
      dtlLine1205.setSuccessfulCount205(value);
   } 

     /**
	 * 	Update SuccessfulCount205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSuccessfulCount205(char[] source, int sourceIndex) throws CFException {
      dtlLine1205.setSuccessfulCount205(source, sourceIndex);
   	
   }
   
   public void setSuccessfulCount205(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dtlLine1205.setSuccessfulCount205(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SuccessfulCount205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSuccessfulCount205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlLine1205.setSuccessfulCount205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SuccessfulCount205 with another Field
	 *	@param value
	 */
   public void setSuccessfulCount205(Field source) {
      dtlLine1205.setSuccessfulCount205(source);
   }  
   
     /**
	 * 	Update SuccessfulCount205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSuccessfulCount205(Field source, int sourceIndex,int sourceLen) {
      dtlLine1205.setSuccessfulCount205(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SuccessfulCount205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSuccessfulCount205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlLine1205.setSuccessfulCount205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of avgElapsed800
	 *	@return avgElapsed800
	 */
   public char[] getAvgElapsed800() throws CFException  {              
   		return work.getAvgElapsed800();
   }

  
	/**
	*  set variable avgElapsed800
	*  @param value
	**/
   public void setAvgElapsed800(char[] value) throws CFException {
      work.setAvgElapsed800(value);
   } 

     /**
	 * 	Update AvgElapsed800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAvgElapsed800(char[] source, int sourceIndex) throws CFException {
      work.setAvgElapsed800(source, sourceIndex);
   	
   }
   
   public void setAvgElapsed800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setAvgElapsed800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AvgElapsed800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAvgElapsed800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setAvgElapsed800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AvgElapsed800 with another Field
	 *	@param value
	 */
   public void setAvgElapsed800(Field source) {
      work.setAvgElapsed800(source);
   }  
   
     /**
	 * 	Update AvgElapsed800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAvgElapsed800(Field source, int sourceIndex,int sourceLen) {
      work.setAvgElapsed800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AvgElapsed800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAvgElapsed800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setAvgElapsed800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of highElapsed205
	 *	@return highElapsed205
	 */
   public char[] getHighElapsed205() throws CFException  {              
   		return dtlLine1205.getHighElapsed205();
   }

  
	/**
	*  set variable highElapsed205
	*  @param value
	**/
   public void setHighElapsed205(char[] value) throws CFException {
      dtlLine1205.setHighElapsed205(value);
   } 

     /**
	 * 	Update HighElapsed205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHighElapsed205(char[] source, int sourceIndex) throws CFException {
      dtlLine1205.setHighElapsed205(source, sourceIndex);
   	
   }
   
   public void setHighElapsed205(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dtlLine1205.setHighElapsed205(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update HighElapsed205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHighElapsed205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlLine1205.setHighElapsed205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update HighElapsed205 with another Field
	 *	@param value
	 */
   public void setHighElapsed205(Field source) {
      dtlLine1205.setHighElapsed205(source);
   }  
   
     /**
	 * 	Update HighElapsed205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHighElapsed205(Field source, int sourceIndex,int sourceLen) {
      dtlLine1205.setHighElapsed205(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update HighElapsed205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHighElapsed205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlLine1205.setHighElapsed205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of service205
	 *	@return service205
	 */
   public char[] getService205() throws CFException  {              
   		return dtlLine1205.getService205();
   }

  
	/**
	*  set variable service205
	*  @param value
	**/
   public void setService205(char[] value) throws CFException {
      dtlLine1205.setService205(value);
   } 

     /**
	 * 	Update Service205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setService205(char[] source, int sourceIndex) throws CFException {
      dtlLine1205.setService205(source, sourceIndex);
   	
   }
   
   public void setService205(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dtlLine1205.setService205(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Service205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setService205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlLine1205.setService205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Service205 with another Field
	 *	@param value
	 */
   public void setService205(Field source) {
      dtlLine1205.setService205(source);
   }  
   
     /**
	 * 	Update Service205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setService205(Field source, int sourceIndex,int sourceLen) {
      dtlLine1205.setService205(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Service205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setService205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlLine1205.setService205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of errorPercent205
	 *	@return errorPercent205
	 */
   public char[] getErrorPercent205() throws CFException  {              
   		return dtlLine1205.getErrorPercent205();
   }

  
	/**
	*  set variable errorPercent205
	*  @param value
	**/
   public void setErrorPercent205(char[] value) throws CFException {
      dtlLine1205.setErrorPercent205(value);
   } 

     /**
	 * 	Update ErrorPercent205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorPercent205(char[] source, int sourceIndex) throws CFException {
      dtlLine1205.setErrorPercent205(source, sourceIndex);
   	
   }
   
   public void setErrorPercent205(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dtlLine1205.setErrorPercent205(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ErrorPercent205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorPercent205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlLine1205.setErrorPercent205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ErrorPercent205 with another Field
	 *	@param value
	 */
   public void setErrorPercent205(Field source) {
      dtlLine1205.setErrorPercent205(source);
   }  
   
     /**
	 * 	Update ErrorPercent205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorPercent205(Field source, int sourceIndex,int sourceLen) {
      dtlLine1205.setErrorPercent205(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ErrorPercent205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorPercent205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlLine1205.setErrorPercent205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of errorPercent800
	 *	@return errorPercent800
	 */
   public char[] getErrorPercent800() throws CFException  {              
   		return work.getErrorPercent800();
   }

  
	/**
	*  set variable errorPercent800
	*  @param value
	**/
   public void setErrorPercent800(char[] value) throws CFException {
      work.setErrorPercent800(value);
   } 

     /**
	 * 	Update ErrorPercent800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorPercent800(char[] source, int sourceIndex) throws CFException {
      work.setErrorPercent800(source, sourceIndex);
   	
   }
   
   public void setErrorPercent800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setErrorPercent800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ErrorPercent800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorPercent800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setErrorPercent800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ErrorPercent800 with another Field
	 *	@param value
	 */
   public void setErrorPercent800(Field source) {
      work.setErrorPercent800(source);
   }  
   
     /**
	 * 	Update ErrorPercent800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorPercent800(Field source, int sourceIndex,int sourceLen) {
      work.setErrorPercent800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ErrorPercent800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorPercent800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setErrorPercent800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of highElapsed800
	 *	@return highElapsed800
	 */
	public int getHighElapsed800() throws CFException {        
   		return work.getHighElapsed800();
	}
	
	/**
	 * 	Update HighElapsed800 with the passed value
	 *	@param number
	 */
	public void setHighElapsed800(int number)  throws CFException{
		work.setHighElapsed800(number);
	}


	public void setHighElapsed800(long number)  throws CFException{
		work.setHighElapsed800((int)number);
	}


	/**
	 *	Returns the value of successPercent800
	 *	@return successPercent800
	 */
   public char[] getSuccessPercent800() throws CFException  {              
   		return work.getSuccessPercent800();
   }

  
	/**
	*  set variable successPercent800
	*  @param value
	**/
   public void setSuccessPercent800(char[] value) throws CFException {
      work.setSuccessPercent800(value);
   } 

     /**
	 * 	Update SuccessPercent800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSuccessPercent800(char[] source, int sourceIndex) throws CFException {
      work.setSuccessPercent800(source, sourceIndex);
   	
   }
   
   public void setSuccessPercent800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSuccessPercent800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SuccessPercent800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSuccessPercent800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSuccessPercent800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SuccessPercent800 with another Field
	 *	@param value
	 */
   public void setSuccessPercent800(Field source) {
      work.setSuccessPercent800(source);
   }  
   
     /**
	 * 	Update SuccessPercent800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSuccessPercent800(Field source, int sourceIndex,int sourceLen) {
      work.setSuccessPercent800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SuccessPercent800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSuccessPercent800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSuccessPercent800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of totMsgCount205
	 *	@return totMsgCount205
	 */
   public char[] getTotMsgCount205() throws CFException  {              
   		return dtlLine1205.getTotMsgCount205();
   }

  
	/**
	*  set variable totMsgCount205
	*  @param value
	**/
   public void setTotMsgCount205(char[] value) throws CFException {
      dtlLine1205.setTotMsgCount205(value);
   } 

     /**
	 * 	Update TotMsgCount205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTotMsgCount205(char[] source, int sourceIndex) throws CFException {
      dtlLine1205.setTotMsgCount205(source, sourceIndex);
   	
   }
   
   public void setTotMsgCount205(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dtlLine1205.setTotMsgCount205(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TotMsgCount205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTotMsgCount205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlLine1205.setTotMsgCount205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TotMsgCount205 with another Field
	 *	@param value
	 */
   public void setTotMsgCount205(Field source) {
      dtlLine1205.setTotMsgCount205(source);
   }  
   
     /**
	 * 	Update TotMsgCount205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTotMsgCount205(Field source, int sourceIndex,int sourceLen) {
      dtlLine1205.setTotMsgCount205(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TotMsgCount205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTotMsgCount205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlLine1205.setTotMsgCount205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
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
        str += dtlLine1205.hashCode();
       return str.hashCode();
    }

    public MoveReportDataOutCtx clone() {
        MoveReportDataOutCtx cloneObj = new MoveReportDataOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dtlLine1205 = new DtlLine1205();
        cloneObj.dtlLine1205.set(dtlLine1205.getClonedField());
        return cloneObj;
    }

    }

    public MoveReportDataOutCtx getMoveReportDataOutCtx() {
            return new MoveReportDataOutCtx();
    }
     public class GenerateReportInCtx implements Cloneable {
     Work work = Sf327010Ctx.this.getWork();
     Sys201AsaServerRec sys201AsaServerRec = Sf327010Ctx.this.getSys201AsaServerRec();
     DtlLine1205 dtlLine1205 = Sf327010Ctx.this.getDtlLine1205();
     DtlLine2205 dtlLine2205 = Sf327010Ctx.this.getDtlLine2205();

	/**
	 *	Returns the value of plus4300
	 *	@return plus4300
	 */
	public int getPlus4300() throws CFException {
   		return work.getPlus4300();
	}


	/**
	 *	Returns String value of plus4300
	 *	@return plus4300
	 */
	public char[]  getPlus4300String() throws CFException {
	     return String.valueOf(work.getPlus4300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plus4300IsNumeric()  throws CFException{
	    return work.plus4300IsNumeric();
	}

	/**
	 * 	Update Plus4300 with the passed value
	 *	@param number
	 */
	public void setPlus4300(int number)  throws CFException{
		work.setPlus4300(number);
	}
	

	public void setPlus4300(long number)  throws CFException{
	    work.setPlus4300(number);
	}
	
	
	/**
	 * 	Update Plus4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlus4300(char[] value)  throws CFException {
		work.setPlus4300(value);
	}
	
	/**
	 * 	Update Plus4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlus4300String(char[] value)  throws CFException{
		work.setPlus4300(value);
	}	

	/**
	 *	Returns the value of num1300
	 *	@return num1300
	 */
	public int getNum1300() throws CFException {
   		return work.getNum1300();
	}


	/**
	 *	Returns String value of num1300
	 *	@return num1300
	 */
	public char[]  getNum1300String() throws CFException {
	     return String.valueOf(work.getNum1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num1300IsNumeric()  throws CFException{
	    return work.num1300IsNumeric();
	}

	/**
	 * 	Update Num1300 with the passed value
	 *	@param number
	 */
	public void setNum1300(int number)  throws CFException{
		work.setNum1300(number);
	}
	

	public void setNum1300(long number)  throws CFException{
	    work.setNum1300(number);
	}
	
	
	/**
	 * 	Update Num1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum1300(char[] value)  throws CFException {
		work.setNum1300(value);
	}
	
	/**
	 * 	Update Num1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum1300String(char[] value)  throws CFException{
		work.setNum1300(value);
	}	

public long getWriteCount400() throws CFException {  
        return work.getWriteCount400();
}
	/**
	 * 	Update WriteCount400 with the passed value
	 *	@param number
	 */
	public void setWriteCount400(long number)  throws CFException{
		work.setWriteCount400(number);
	}



	/**
	 *	Returns the value of sys201AsaServerRec
	 *	@return sys201AsaServerRec
	 */   
	 public Sys201AsaServerRec getSys201AsaServerRec() {
   	return sys201AsaServerRec;
   }


	/**
	 *	Returns the value of plus1300
	 *	@return plus1300
	 */
	public int getPlus1300() throws CFException {
   		return work.getPlus1300();
	}


	/**
	 *	Returns String value of plus1300
	 *	@return plus1300
	 */
	public char[]  getPlus1300String() throws CFException {
	     return String.valueOf(work.getPlus1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plus1300IsNumeric()  throws CFException{
	    return work.plus1300IsNumeric();
	}

	/**
	 * 	Update Plus1300 with the passed value
	 *	@param number
	 */
	public void setPlus1300(int number)  throws CFException{
		work.setPlus1300(number);
	}
	

	public void setPlus1300(long number)  throws CFException{
	    work.setPlus1300(number);
	}
	
	
	/**
	 * 	Update Plus1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlus1300(char[] value)  throws CFException {
		work.setPlus1300(value);
	}
	
	/**
	 * 	Update Plus1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlus1300String(char[] value)  throws CFException{
		work.setPlus1300(value);
	}	

	/**
	 *	Returns the value of dtlLine1205
	 *	@return dtlLine1205
	 */   
	 public DtlLine1205 getDtlLine1205() {
   	return dtlLine1205;
   }


	/**
	 *	Returns the value of num4300
	 *	@return num4300
	 */
	public int getNum4300() throws CFException {
   		return work.getNum4300();
	}


	/**
	 *	Returns String value of num4300
	 *	@return num4300
	 */
	public char[]  getNum4300String() throws CFException {
	     return String.valueOf(work.getNum4300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num4300IsNumeric()  throws CFException{
	    return work.num4300IsNumeric();
	}

	/**
	 * 	Update Num4300 with the passed value
	 *	@param number
	 */
	public void setNum4300(int number)  throws CFException{
		work.setNum4300(number);
	}
	

	public void setNum4300(long number)  throws CFException{
	    work.setNum4300(number);
	}
	
	
	/**
	 * 	Update Num4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum4300(char[] value)  throws CFException {
		work.setNum4300(value);
	}
	
	/**
	 * 	Update Num4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum4300String(char[] value)  throws CFException{
		work.setNum4300(value);
	}	

public long getLineCount400() throws CFException {  
        return work.getLineCount400();
}
	/**
	 * 	Update LineCount400 with the passed value
	 *	@param number
	 */
	public void setLineCount400(long number)  throws CFException{
		work.setLineCount400(number);
	}



	/**
	 *	Returns the value of dtlLine2205
	 *	@return dtlLine2205
	 */   
	 public DtlLine2205 getDtlLine2205() {
   	return dtlLine2205;
   }



        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
        }

        public GenerateReportOutCtx getGenerateReportOutCtx() {
            return new GenerateReportOutCtx();
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
        str += sys201AsaServerRec.hashCode();
        str += dtlLine1205.hashCode();
        str += dtlLine2205.hashCode();
       return str.hashCode();
    }

    public GenerateReportInCtx clone() {
        GenerateReportInCtx cloneObj = new GenerateReportInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys201AsaServerRec = new Sys201AsaServerRec();
        cloneObj.sys201AsaServerRec.set(sys201AsaServerRec.getClonedField());
        cloneObj.dtlLine1205 = new DtlLine1205();
        cloneObj.dtlLine1205.set(dtlLine1205.getClonedField());
        cloneObj.dtlLine2205 = new DtlLine2205();
        cloneObj.dtlLine2205.set(dtlLine2205.getClonedField());
        return cloneObj;
    }

    }

    public GenerateReportInCtx getGenerateReportInCtx() {
            return new GenerateReportInCtx();
    }
     public class GenerateReportOutCtx implements Cloneable {
     Work work = Sf327010Ctx.this.getWork();
     Sys201AsaServerRec sys201AsaServerRec = Sf327010Ctx.this.getSys201AsaServerRec();
     DtlLine1205 dtlLine1205 = Sf327010Ctx.this.getDtlLine1205();
     DtlLine2205 dtlLine2205 = Sf327010Ctx.this.getDtlLine2205();

public long getWriteCount400() throws CFException {  
        return work.getWriteCount400();
}
	/**
	 * 	Update WriteCount400 with the passed value
	 *	@param number
	 */
	public void setWriteCount400(long number)  throws CFException{
		work.setWriteCount400(number);
	}



	/**
	 *	Returns the value of sys201AsaServerRec
	 *	@return sys201AsaServerRec
	 */   
	 public Sys201AsaServerRec getSys201AsaServerRec() {
   	return sys201AsaServerRec;
   }


public long getLineCount400() throws CFException {  
        return work.getLineCount400();
}
	/**
	 * 	Update LineCount400 with the passed value
	 *	@param number
	 */
	public void setLineCount400(long number)  throws CFException{
		work.setLineCount400(number);
	}




        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
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
        str += sys201AsaServerRec.hashCode();
        str += dtlLine1205.hashCode();
        str += dtlLine2205.hashCode();
       return str.hashCode();
    }

    public GenerateReportOutCtx clone() {
        GenerateReportOutCtx cloneObj = new GenerateReportOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys201AsaServerRec = new Sys201AsaServerRec();
        cloneObj.sys201AsaServerRec.set(sys201AsaServerRec.getClonedField());
        cloneObj.dtlLine1205 = new DtlLine1205();
        cloneObj.dtlLine1205.set(dtlLine1205.getClonedField());
        cloneObj.dtlLine2205 = new DtlLine2205();
        cloneObj.dtlLine2205.set(dtlLine2205.getClonedField());
        return cloneObj;
    }

    }

    public GenerateReportOutCtx getGenerateReportOutCtx() {
            return new GenerateReportOutCtx();
    }
     public class BuildServiceIdDescInCtx implements Cloneable {
     Sf535ZlogServicesGroup sf535ZlogServicesGroup = Sf327010Ctx.this.getSf535ZlogServicesGroup();
     Work work = Sf327010Ctx.this.getWork();
     DtlLine2205 dtlLine2205 = Sf327010Ctx.this.getDtlLine2205();

	/**
	 *	Returns the value of num1300
	 *	@return num1300
	 */
	public int getNum1300() throws CFException {
   		return work.getNum1300();
	}


	/**
	 *	Returns String value of num1300
	 *	@return num1300
	 */
	public char[]  getNum1300String() throws CFException {
	     return String.valueOf(work.getNum1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num1300IsNumeric()  throws CFException{
	    return work.num1300IsNumeric();
	}

	/**
	 * 	Update Num1300 with the passed value
	 *	@param number
	 */
	public void setNum1300(int number)  throws CFException{
		work.setNum1300(number);
	}
	

	public void setNum1300(long number)  throws CFException{
	    work.setNum1300(number);
	}
	
	
	/**
	 * 	Update Num1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum1300(char[] value)  throws CFException {
		work.setNum1300(value);
	}
	
	/**
	 * 	Update Num1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum1300String(char[] value)  throws CFException{
		work.setNum1300(value);
	}	

	/**
	 *	Returns the value of sf535ZlogServiceTable
	 *	@return sf535ZlogServiceTable
	 */   
	 public Sf535ZlogServiceTable getSf535ZlogServiceTable() {
   	return sf535ZlogServicesGroup.getSf535ZlogServiceTable();
   }

   /**
	* 	Update Sf535ZlogServiceTable with the passed value
	*	@param value
	*/
   public void setSf535ZlogServiceTable(char[] value) throws CFException {
      sf535ZlogServicesGroup.setSf535ZlogServiceTable(value);
   }   

     /**
	 * 	Update Sf535ZlogServiceTable 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf535ZlogServiceTable(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	sf535ZlogServicesGroup.setSf535ZlogServiceTable(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf535ZlogServiceTable 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf535ZlogServiceTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sf535ZlogServicesGroup.setSf535ZlogServiceTable(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf535ZlogServiceTable with another Field
	 *	@param value
	 */
   public void setSf535ZlogServiceTable(Field source) {
   	sf535ZlogServicesGroup.setSf535ZlogServiceTable(source);
   }  
   
     /**
	 * 	Update Sf535ZlogServiceTable 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf535ZlogServiceTable(Field source, int sourceIndex,int sourceLen) {
   	sf535ZlogServicesGroup.setSf535ZlogServiceTable(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf535ZlogServiceTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf535ZlogServiceTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	sf535ZlogServicesGroup.setSf535ZlogServiceTable(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of litUnknwn300
	 *	@return litUnknwn300
	 */
   public char[] getLitUnknwn300() throws CFException  {              
   		return work.getLitUnknwn300();
   }

  
	/**
	*  set variable litUnknwn300
	*  @param value
	**/
   public void setLitUnknwn300(char[] value) throws CFException {
      work.setLitUnknwn300(value);
   } 

	/**
	 *	Returns the value of sf535ZservDesc
	 *	@return sf535ZservDesc
	 */
   public char[] getSf535ZservDesc(int index) throws CFException  {              
   		return sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).getSf535ZservDesc();
   }

  
	/**
	*  set variable sf535ZservDesc
	*  @param value
	**/
   public void setSf535ZservDesc(int index,char[] value) throws CFException {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZservDesc(value);
   } 

     /**
	 * 	Update Sf535ZservDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf535ZservDesc(int index,char[] source, int sourceIndex) throws CFException {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZservDesc(source, sourceIndex);
   	
   }
   
   public void setSf535ZservDesc(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZservDesc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf535ZservDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf535ZservDesc(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZservDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf535ZservDesc with another Field
	 *	@param value
	 */
   public void setSf535ZservDesc(int index,Field source) {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZservDesc(source);
   }  
   
     /**
	 * 	Update Sf535ZservDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf535ZservDesc(int index,Field source, int sourceIndex,int sourceLen) {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZservDesc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf535ZservDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf535ZservDesc(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZservDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setSf535X(int sf535X) { 
    Sf327010Ctx.this.sf535X = sf535X;
}

public int getSf535X() { 
    return Sf327010Ctx.this.sf535X;
}
	/**
	 *	Returns the value of sf535ZlogService
	 *	@return sf535ZlogService
	 */
   public char[] getSf535ZlogService(int index) throws CFException  {              
   		return sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).getSf535ZlogService();
   }

  
	/**
	*  set variable sf535ZlogService
	*  @param value
	**/
   public void setSf535ZlogService(int index,char[] value) throws CFException {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZlogService(value);
   } 

     /**
	 * 	Update Sf535ZlogService 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf535ZlogService(int index,char[] source, int sourceIndex) throws CFException {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZlogService(source, sourceIndex);
   	
   }
   
   public void setSf535ZlogService(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZlogService(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf535ZlogService 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf535ZlogService(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZlogService(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf535ZlogService with another Field
	 *	@param value
	 */
   public void setSf535ZlogService(int index,Field source) {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZlogService(source);
   }  
   
     /**
	 * 	Update Sf535ZlogService 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf535ZlogService(int index,Field source, int sourceIndex,int sourceLen) {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZlogService(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf535ZlogService 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf535ZlogService(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZlogService(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of prevServiceId800
	 *	@return prevServiceId800
	 */
   public char[] getPrevServiceId800() throws CFException  {              
   		return work.getPrevServiceId800();
   }

  
	/**
	*  set variable prevServiceId800
	*  @param value
	**/
   public void setPrevServiceId800(char[] value) throws CFException {
      work.setPrevServiceId800(value);
   } 

	/**
	 *	Returns the value of sf535ZlogServiceEntry
	 *	@return sf535ZlogServiceEntry
	 */   
	 public Sf535ZlogServiceEntry getSf535ZlogServiceEntry(int index) {
   	return sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index);
   }

    public List<Sf535ZlogServiceEntry> getSf535ZlogServiceEntry() {
        return sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry();
    }
   /**
	* 	Update Sf535ZlogServiceEntry with the passed value
	*	@param value
	*/
   public void setSf535ZlogServiceEntry(int index,char[] value) throws CFException {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().setSf535ZlogServiceEntry((index),value);
   }   



        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
        }

        public BuildServiceIdDescOutCtx getBuildServiceIdDescOutCtx() {
            return new BuildServiceIdDescOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sf535ZlogServicesGroup.hashCode();
        str += work.hashCode();
        str += dtlLine2205.hashCode();
       return str.hashCode();
    }

    public BuildServiceIdDescInCtx clone() {
        BuildServiceIdDescInCtx cloneObj = new BuildServiceIdDescInCtx();
        cloneObj.sf535ZlogServicesGroup = new Sf535ZlogServicesGroup();
        cloneObj.sf535ZlogServicesGroup.set(sf535ZlogServicesGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dtlLine2205 = new DtlLine2205();
        cloneObj.dtlLine2205.set(dtlLine2205.getClonedField());
        return cloneObj;
    }

    }

    public BuildServiceIdDescInCtx getBuildServiceIdDescInCtx() {
            return new BuildServiceIdDescInCtx();
    }
     public class BuildServiceIdDescOutCtx implements Cloneable {
     Sf535ZlogServicesGroup sf535ZlogServicesGroup = Sf327010Ctx.this.getSf535ZlogServicesGroup();
     Work work = Sf327010Ctx.this.getWork();
     DtlLine2205 dtlLine2205 = Sf327010Ctx.this.getDtlLine2205();

	/**
	 *	Returns the value of serviceName205
	 *	@return serviceName205
	 */
   public char[] getServiceName205() throws CFException  {              
   		return dtlLine2205.getServiceName205();
   }

  
	/**
	*  set variable serviceName205
	*  @param value
	**/
   public void setServiceName205(char[] value) throws CFException {
      dtlLine2205.setServiceName205(value);
   } 

     /**
	 * 	Update ServiceName205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setServiceName205(char[] source, int sourceIndex) throws CFException {
      dtlLine2205.setServiceName205(source, sourceIndex);
   	
   }
   
   public void setServiceName205(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dtlLine2205.setServiceName205(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ServiceName205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setServiceName205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlLine2205.setServiceName205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ServiceName205 with another Field
	 *	@param value
	 */
   public void setServiceName205(Field source) {
      dtlLine2205.setServiceName205(source);
   }  
   
     /**
	 * 	Update ServiceName205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setServiceName205(Field source, int sourceIndex,int sourceLen) {
      dtlLine2205.setServiceName205(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ServiceName205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setServiceName205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dtlLine2205.setServiceName205(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of litUnknwn300
	 *	@return litUnknwn300
	 */
   public char[] getLitUnknwn300() throws CFException  {              
   		return work.getLitUnknwn300();
   }

  
	/**
	*  set variable litUnknwn300
	*  @param value
	**/
   public void setLitUnknwn300(char[] value) throws CFException {
      work.setLitUnknwn300(value);
   } 

	/**
	 *	Returns the value of sf535ZservDesc
	 *	@return sf535ZservDesc
	 */
   public char[] getSf535ZservDesc(int index) throws CFException  {              
   		return sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).getSf535ZservDesc();
   }

  
	/**
	*  set variable sf535ZservDesc
	*  @param value
	**/
   public void setSf535ZservDesc(int index,char[] value) throws CFException {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZservDesc(value);
   } 

     /**
	 * 	Update Sf535ZservDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf535ZservDesc(int index,char[] source, int sourceIndex) throws CFException {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZservDesc(source, sourceIndex);
   	
   }
   
   public void setSf535ZservDesc(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZservDesc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf535ZservDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf535ZservDesc(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZservDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf535ZservDesc with another Field
	 *	@param value
	 */
   public void setSf535ZservDesc(int index,Field source) {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZservDesc(source);
   }  
   
     /**
	 * 	Update Sf535ZservDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf535ZservDesc(int index,Field source, int sourceIndex,int sourceLen) {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZservDesc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf535ZservDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf535ZservDesc(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf535ZlogServicesGroup.getSf535ZlogServiceTable().getSf535ZlogServiceEntry(index).setSf535ZservDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setSf535X(int sf535X) { 
    Sf327010Ctx.this.sf535X = sf535X;
}

public int getSf535X() { 
    return Sf327010Ctx.this.sf535X;
}

        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sf535ZlogServicesGroup.hashCode();
        str += work.hashCode();
        str += dtlLine2205.hashCode();
       return str.hashCode();
    }

    public BuildServiceIdDescOutCtx clone() {
        BuildServiceIdDescOutCtx cloneObj = new BuildServiceIdDescOutCtx();
        cloneObj.sf535ZlogServicesGroup = new Sf535ZlogServicesGroup();
        cloneObj.sf535ZlogServicesGroup.set(sf535ZlogServicesGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dtlLine2205 = new DtlLine2205();
        cloneObj.dtlLine2205.set(dtlLine2205.getClonedField());
        return cloneObj;
    }

    }

    public BuildServiceIdDescOutCtx getBuildServiceIdDescOutCtx() {
            return new BuildServiceIdDescOutCtx();
    }
     public class WriteHdrInCtx implements Cloneable {
     HdrLine2202 hdrLine2202 = Sf327010Ctx.this.getHdrLine2202();
     Work work = Sf327010Ctx.this.getWork();
     Sys201AsaServerRec sys201AsaServerRec = Sf327010Ctx.this.getSys201AsaServerRec();
     HdrLine1201 hdrLine1201 = Sf327010Ctx.this.getHdrLine1201();

	/**
	 *	Returns the value of hdrLine2202
	 *	@return hdrLine2202
	 */   
	 public HdrLine2202 getHdrLine2202() {
   	return hdrLine2202;
   }


	/**
	 *	Returns the value of num1300
	 *	@return num1300
	 */
	public int getNum1300() throws CFException {
   		return work.getNum1300();
	}


	/**
	 *	Returns String value of num1300
	 *	@return num1300
	 */
	public char[]  getNum1300String() throws CFException {
	     return String.valueOf(work.getNum1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num1300IsNumeric()  throws CFException{
	    return work.num1300IsNumeric();
	}

	/**
	 * 	Update Num1300 with the passed value
	 *	@param number
	 */
	public void setNum1300(int number)  throws CFException{
		work.setNum1300(number);
	}
	

	public void setNum1300(long number)  throws CFException{
	    work.setNum1300(number);
	}
	
	
	/**
	 * 	Update Num1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum1300(char[] value)  throws CFException {
		work.setNum1300(value);
	}
	
	/**
	 * 	Update Num1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum1300String(char[] value)  throws CFException{
		work.setNum1300(value);
	}	

	/**
	 *	Returns the value of hdrLine4204
	 *	@return hdrLine4204
	 */
   public char[] getHdrLine4204() throws CFException  {              
   		return work.getHdrLine4204();
   }

  
	/**
	*  set variable hdrLine4204
	*  @param value
	**/
   public void setHdrLine4204(char[] value) throws CFException {
      work.setHdrLine4204(value);
   } 

	/**
	 *	Returns the value of hdrLine3203
	 *	@return hdrLine3203
	 */
   public char[] getHdrLine3203() throws CFException  {              
   		return work.getHdrLine3203();
   }

  
	/**
	*  set variable hdrLine3203
	*  @param value
	**/
   public void setHdrLine3203(char[] value) throws CFException {
      work.setHdrLine3203(value);
   } 

	/**
	 *	Returns the value of plus7300
	 *	@return plus7300
	 */
	public int getPlus7300() throws CFException {
   		return work.getPlus7300();
	}


	/**
	 *	Returns String value of plus7300
	 *	@return plus7300
	 */
	public char[]  getPlus7300String() throws CFException {
	     return String.valueOf(work.getPlus7300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plus7300IsNumeric()  throws CFException{
	    return work.plus7300IsNumeric();
	}

	/**
	 * 	Update Plus7300 with the passed value
	 *	@param number
	 */
	public void setPlus7300(int number)  throws CFException{
		work.setPlus7300(number);
	}
	

	public void setPlus7300(long number)  throws CFException{
	    work.setPlus7300(number);
	}
	
	
	/**
	 * 	Update Plus7300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlus7300(char[] value)  throws CFException {
		work.setPlus7300(value);
	}
	
	/**
	 * 	Update Plus7300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlus7300String(char[] value)  throws CFException{
		work.setPlus7300(value);
	}	

	/**
	 *	Returns the value of sys201AsaServerRec
	 *	@return sys201AsaServerRec
	 */   
	 public Sys201AsaServerRec getSys201AsaServerRec() {
   	return sys201AsaServerRec;
   }


	/**
	 *	Returns the value of hdrLine1201
	 *	@return hdrLine1201
	 */   
	 public HdrLine1201 getHdrLine1201() {
   	return hdrLine1201;
   }


	/**
	 *	Returns the value of num4300
	 *	@return num4300
	 */
	public int getNum4300() throws CFException {
   		return work.getNum4300();
	}


	/**
	 *	Returns String value of num4300
	 *	@return num4300
	 */
	public char[]  getNum4300String() throws CFException {
	     return String.valueOf(work.getNum4300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num4300IsNumeric()  throws CFException{
	    return work.num4300IsNumeric();
	}

	/**
	 * 	Update Num4300 with the passed value
	 *	@param number
	 */
	public void setNum4300(int number)  throws CFException{
		work.setNum4300(number);
	}
	

	public void setNum4300(long number)  throws CFException{
	    work.setNum4300(number);
	}
	
	
	/**
	 * 	Update Num4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum4300(char[] value)  throws CFException {
		work.setNum4300(value);
	}
	
	/**
	 * 	Update Num4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum4300String(char[] value)  throws CFException{
		work.setNum4300(value);
	}	

	/**
	 *	Returns the value of num2300
	 *	@return num2300
	 */
	public int getNum2300() throws CFException {
   		return work.getNum2300();
	}


	/**
	 *	Returns String value of num2300
	 *	@return num2300
	 */
	public char[]  getNum2300String() throws CFException {
	     return String.valueOf(work.getNum2300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean num2300IsNumeric()  throws CFException{
	    return work.num2300IsNumeric();
	}

	/**
	 * 	Update Num2300 with the passed value
	 *	@param number
	 */
	public void setNum2300(int number)  throws CFException{
		work.setNum2300(number);
	}
	

	public void setNum2300(long number)  throws CFException{
	    work.setNum2300(number);
	}
	
	
	/**
	 * 	Update Num2300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum2300(char[] value)  throws CFException {
		work.setNum2300(value);
	}
	
	/**
	 * 	Update Num2300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum2300String(char[] value)  throws CFException{
		work.setNum2300(value);
	}	


        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
        }

        public WriteHdrOutCtx getWriteHdrOutCtx() {
            return new WriteHdrOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += hdrLine2202.hashCode();
        str += work.hashCode();
        str += sys201AsaServerRec.hashCode();
        str += hdrLine1201.hashCode();
       return str.hashCode();
    }

    public WriteHdrInCtx clone() {
        WriteHdrInCtx cloneObj = new WriteHdrInCtx();
        cloneObj.hdrLine2202 = new HdrLine2202();
        cloneObj.hdrLine2202.set(hdrLine2202.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys201AsaServerRec = new Sys201AsaServerRec();
        cloneObj.sys201AsaServerRec.set(sys201AsaServerRec.getClonedField());
        cloneObj.hdrLine1201 = new HdrLine1201();
        cloneObj.hdrLine1201.set(hdrLine1201.getClonedField());
        return cloneObj;
    }

    }

    public WriteHdrInCtx getWriteHdrInCtx() {
            return new WriteHdrInCtx();
    }
     public class WriteHdrOutCtx implements Cloneable {
     HdrLine2202 hdrLine2202 = Sf327010Ctx.this.getHdrLine2202();
     Work work = Sf327010Ctx.this.getWork();
     Sys201AsaServerRec sys201AsaServerRec = Sf327010Ctx.this.getSys201AsaServerRec();
     HdrLine1201 hdrLine1201 = Sf327010Ctx.this.getHdrLine1201();

	/**
	 *	Returns the value of plus7300
	 *	@return plus7300
	 */
	public int getPlus7300() throws CFException {
   		return work.getPlus7300();
	}


	/**
	 *	Returns String value of plus7300
	 *	@return plus7300
	 */
	public char[]  getPlus7300String() throws CFException {
	     return String.valueOf(work.getPlus7300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plus7300IsNumeric()  throws CFException{
	    return work.plus7300IsNumeric();
	}

	/**
	 * 	Update Plus7300 with the passed value
	 *	@param number
	 */
	public void setPlus7300(int number)  throws CFException{
		work.setPlus7300(number);
	}
	

	public void setPlus7300(long number)  throws CFException{
	    work.setPlus7300(number);
	}
	
	
	/**
	 * 	Update Plus7300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPlus7300(char[] value)  throws CFException {
		work.setPlus7300(value);
	}
	
	/**
	 * 	Update Plus7300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPlus7300String(char[] value)  throws CFException{
		work.setPlus7300(value);
	}	

	/**
	 *	Returns the value of sys201AsaServerRec
	 *	@return sys201AsaServerRec
	 */   
	 public Sys201AsaServerRec getSys201AsaServerRec() {
   	return sys201AsaServerRec;
   }


public long getLineCount400() throws CFException {  
        return work.getLineCount400();
}
	/**
	 * 	Update LineCount400 with the passed value
	 *	@param number
	 */
	public void setLineCount400(long number)  throws CFException{
		work.setLineCount400(number);
	}




        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += hdrLine2202.hashCode();
        str += work.hashCode();
        str += sys201AsaServerRec.hashCode();
        str += hdrLine1201.hashCode();
       return str.hashCode();
    }

    public WriteHdrOutCtx clone() {
        WriteHdrOutCtx cloneObj = new WriteHdrOutCtx();
        cloneObj.hdrLine2202 = new HdrLine2202();
        cloneObj.hdrLine2202.set(hdrLine2202.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys201AsaServerRec = new Sys201AsaServerRec();
        cloneObj.sys201AsaServerRec.set(sys201AsaServerRec.getClonedField());
        cloneObj.hdrLine1201 = new HdrLine1201();
        cloneObj.hdrLine1201.set(hdrLine1201.getClonedField());
        return cloneObj;
    }

    }

    public WriteHdrOutCtx getWriteHdrOutCtx() {
            return new WriteHdrOutCtx();
    }
     public class BuildMonthInCtx implements Cloneable {
     Work work = Sf327010Ctx.this.getWork();

	/**
	 *	Test condition "07" for isMnthMmNumJul88100()
	 *	@return  Returns true if isMnthMmNumJul88100() is "07"
	 */
   public boolean isMnthMmNumJul88100() throws CFException {
      return work.isMnthMmNumJul88100();
   }

	/**
	*  set values "07"
	*/
   	public void setMnthMmNumJul88100True()  throws CFException{  			
    	work.setMnthMmNumJul88100True();
   	}
	/**
	 *	Test condition "11" for isMnthMmNumNov88100()
	 *	@return  Returns true if isMnthMmNumNov88100() is "11"
	 */
   public boolean isMnthMmNumNov88100() throws CFException {
      return work.isMnthMmNumNov88100();
   }

	/**
	*  set values "11"
	*/
   	public void setMnthMmNumNov88100True()  throws CFException{  			
    	work.setMnthMmNumNov88100True();
   	}
	/**
	 *	Returns the value of monthNov300
	 *	@return monthNov300
	 */
   public char[] getMonthNov300() throws CFException  {              
   		return work.getMonthNov300();
   }

  
	/**
	*  set variable monthNov300
	*  @param value
	**/
   public void setMonthNov300(char[] value) throws CFException {
      work.setMonthNov300(value);
   } 

	/**
	 *	Test condition "10" for isMnthMmNumOct88100()
	 *	@return  Returns true if isMnthMmNumOct88100() is "10"
	 */
   public boolean isMnthMmNumOct88100() throws CFException {
      return work.isMnthMmNumOct88100();
   }

	/**
	*  set values "10"
	*/
   	public void setMnthMmNumOct88100True()  throws CFException{  			
    	work.setMnthMmNumOct88100True();
   	}
	/**
	 *	Returns the value of monthSep300
	 *	@return monthSep300
	 */
   public char[] getMonthSep300() throws CFException  {              
   		return work.getMonthSep300();
   }

  
	/**
	*  set variable monthSep300
	*  @param value
	**/
   public void setMonthSep300(char[] value) throws CFException {
      work.setMonthSep300(value);
   } 

	/**
	 *	Returns the value of monthJul300
	 *	@return monthJul300
	 */
   public char[] getMonthJul300() throws CFException  {              
   		return work.getMonthJul300();
   }

  
	/**
	*  set variable monthJul300
	*  @param value
	**/
   public void setMonthJul300(char[] value) throws CFException {
      work.setMonthJul300(value);
   } 

	/**
	 *	Test condition "08" for isMnthMmNumAug88100()
	 *	@return  Returns true if isMnthMmNumAug88100() is "08"
	 */
   public boolean isMnthMmNumAug88100() throws CFException {
      return work.isMnthMmNumAug88100();
   }

	/**
	*  set values "08"
	*/
   	public void setMnthMmNumAug88100True()  throws CFException{  			
    	work.setMnthMmNumAug88100True();
   	}
	/**
	 *	Test condition "09" for isMnthMmNumSep88100()
	 *	@return  Returns true if isMnthMmNumSep88100() is "09"
	 */
   public boolean isMnthMmNumSep88100() throws CFException {
      return work.isMnthMmNumSep88100();
   }

	/**
	*  set values "09"
	*/
   	public void setMnthMmNumSep88100True()  throws CFException{  			
    	work.setMnthMmNumSep88100True();
   	}
	/**
	 *	Returns the value of monthJan300
	 *	@return monthJan300
	 */
   public char[] getMonthJan300() throws CFException  {              
   		return work.getMonthJan300();
   }

  
	/**
	*  set variable monthJan300
	*  @param value
	**/
   public void setMonthJan300(char[] value) throws CFException {
      work.setMonthJan300(value);
   } 

	/**
	 *	Returns the value of monthJun300
	 *	@return monthJun300
	 */
   public char[] getMonthJun300() throws CFException  {              
   		return work.getMonthJun300();
   }

  
	/**
	*  set variable monthJun300
	*  @param value
	**/
   public void setMonthJun300(char[] value) throws CFException {
      work.setMonthJun300(value);
   } 

	/**
	 *	Test condition "05" for isMnthMmNumMay88100()
	 *	@return  Returns true if isMnthMmNumMay88100() is "05"
	 */
   public boolean isMnthMmNumMay88100() throws CFException {
      return work.isMnthMmNumMay88100();
   }

	/**
	*  set values "05"
	*/
   	public void setMnthMmNumMay88100True()  throws CFException{  			
    	work.setMnthMmNumMay88100True();
   	}
	/**
	 *	Returns the value of monthFeb300
	 *	@return monthFeb300
	 */
   public char[] getMonthFeb300() throws CFException  {              
   		return work.getMonthFeb300();
   }

  
	/**
	*  set variable monthFeb300
	*  @param value
	**/
   public void setMonthFeb300(char[] value) throws CFException {
      work.setMonthFeb300(value);
   } 

	/**
	 *	Test condition "12" for isMnthMmNumDec88100()
	 *	@return  Returns true if isMnthMmNumDec88100() is "12"
	 */
   public boolean isMnthMmNumDec88100() throws CFException {
      return work.isMnthMmNumDec88100();
   }

	/**
	*  set values "12"
	*/
   	public void setMnthMmNumDec88100True()  throws CFException{  			
    	work.setMnthMmNumDec88100True();
   	}
	/**
	 *	Test condition "06" for isMnthMmNumJun88100()
	 *	@return  Returns true if isMnthMmNumJun88100() is "06"
	 */
   public boolean isMnthMmNumJun88100() throws CFException {
      return work.isMnthMmNumJun88100();
   }

	/**
	*  set values "06"
	*/
   	public void setMnthMmNumJun88100True()  throws CFException{  			
    	work.setMnthMmNumJun88100True();
   	}
	/**
	 *	Returns the value of monthMar300
	 *	@return monthMar300
	 */
   public char[] getMonthMar300() throws CFException  {              
   		return work.getMonthMar300();
   }

  
	/**
	*  set variable monthMar300
	*  @param value
	**/
   public void setMonthMar300(char[] value) throws CFException {
      work.setMonthMar300(value);
   } 

	/**
	 *	Returns the value of monthMay300
	 *	@return monthMay300
	 */
   public char[] getMonthMay300() throws CFException  {              
   		return work.getMonthMay300();
   }

  
	/**
	*  set variable monthMay300
	*  @param value
	**/
   public void setMonthMay300(char[] value) throws CFException {
      work.setMonthMay300(value);
   } 

	/**
	 *	Returns the value of monthDec300
	 *	@return monthDec300
	 */
   public char[] getMonthDec300() throws CFException  {              
   		return work.getMonthDec300();
   }

  
	/**
	*  set variable monthDec300
	*  @param value
	**/
   public void setMonthDec300(char[] value) throws CFException {
      work.setMonthDec300(value);
   } 

	/**
	 *	Test condition "01" for isMnthMmNumJan88100()
	 *	@return  Returns true if isMnthMmNumJan88100() is "01"
	 */
   public boolean isMnthMmNumJan88100() throws CFException {
      return work.isMnthMmNumJan88100();
   }

	/**
	*  set values "01"
	*/
   	public void setMnthMmNumJan88100True()  throws CFException{  			
    	work.setMnthMmNumJan88100True();
   	}
	/**
	 *	Test condition "03" for isMnthMmNumMar88100()
	 *	@return  Returns true if isMnthMmNumMar88100() is "03"
	 */
   public boolean isMnthMmNumMar88100() throws CFException {
      return work.isMnthMmNumMar88100();
   }

	/**
	*  set values "03"
	*/
   	public void setMnthMmNumMar88100True()  throws CFException{  			
    	work.setMnthMmNumMar88100True();
   	}
	/**
	 *	Test condition "02" for isMnthMmNumFeb88100()
	 *	@return  Returns true if isMnthMmNumFeb88100() is "02"
	 */
   public boolean isMnthMmNumFeb88100() throws CFException {
      return work.isMnthMmNumFeb88100();
   }

	/**
	*  set values "02"
	*/
   	public void setMnthMmNumFeb88100True()  throws CFException{  			
    	work.setMnthMmNumFeb88100True();
   	}
	/**
	 *	Returns the value of monthOct300
	 *	@return monthOct300
	 */
   public char[] getMonthOct300() throws CFException  {              
   		return work.getMonthOct300();
   }

  
	/**
	*  set variable monthOct300
	*  @param value
	**/
   public void setMonthOct300(char[] value) throws CFException {
      work.setMonthOct300(value);
   } 

	/**
	 *	Returns the value of monthApr300
	 *	@return monthApr300
	 */
   public char[] getMonthApr300() throws CFException  {              
   		return work.getMonthApr300();
   }

  
	/**
	*  set variable monthApr300
	*  @param value
	**/
   public void setMonthApr300(char[] value) throws CFException {
      work.setMonthApr300(value);
   } 

	/**
	 *	Test condition "04" for isMnthMmNumApr88100()
	 *	@return  Returns true if isMnthMmNumApr88100() is "04"
	 */
   public boolean isMnthMmNumApr88100() throws CFException {
      return work.isMnthMmNumApr88100();
   }

	/**
	*  set values "04"
	*/
   	public void setMnthMmNumApr88100True()  throws CFException{  			
    	work.setMnthMmNumApr88100True();
   	}
	/**
	 *	Returns the value of monthAug300
	 *	@return monthAug300
	 */
   public char[] getMonthAug300() throws CFException  {              
   		return work.getMonthAug300();
   }

  
	/**
	*  set variable monthAug300
	*  @param value
	**/
   public void setMonthAug300(char[] value) throws CFException {
      work.setMonthAug300(value);
   } 


        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
        }

        public BuildMonthOutCtx getBuildMonthOutCtx() {
            return new BuildMonthOutCtx();
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

    public BuildMonthInCtx clone() {
        BuildMonthInCtx cloneObj = new BuildMonthInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public BuildMonthInCtx getBuildMonthInCtx() {
            return new BuildMonthInCtx();
    }
     public class BuildMonthOutCtx implements Cloneable {
     Work work = Sf327010Ctx.this.getWork();

	/**
	 *	Returns the value of monthNov300
	 *	@return monthNov300
	 */
   public char[] getMonthNov300() throws CFException  {              
   		return work.getMonthNov300();
   }

  
	/**
	*  set variable monthNov300
	*  @param value
	**/
   public void setMonthNov300(char[] value) throws CFException {
      work.setMonthNov300(value);
   } 

	/**
	 *	Returns the value of monthSep300
	 *	@return monthSep300
	 */
   public char[] getMonthSep300() throws CFException  {              
   		return work.getMonthSep300();
   }

  
	/**
	*  set variable monthSep300
	*  @param value
	**/
   public void setMonthSep300(char[] value) throws CFException {
      work.setMonthSep300(value);
   } 

	/**
	 *	Returns the value of monthJul300
	 *	@return monthJul300
	 */
   public char[] getMonthJul300() throws CFException  {              
   		return work.getMonthJul300();
   }

  
	/**
	*  set variable monthJul300
	*  @param value
	**/
   public void setMonthJul300(char[] value) throws CFException {
      work.setMonthJul300(value);
   } 

	/**
	 *	Returns the value of runMonth800
	 *	@return runMonth800
	 */
   public char[] getRunMonth800() throws CFException  {              
   		return work.getRunMonth800();
   }

  
	/**
	*  set variable runMonth800
	*  @param value
	**/
   public void setRunMonth800(char[] value) throws CFException {
      work.setRunMonth800(value);
   } 

	/**
	 *	Returns the value of monthJan300
	 *	@return monthJan300
	 */
   public char[] getMonthJan300() throws CFException  {              
   		return work.getMonthJan300();
   }

  
	/**
	*  set variable monthJan300
	*  @param value
	**/
   public void setMonthJan300(char[] value) throws CFException {
      work.setMonthJan300(value);
   } 

	/**
	 *	Returns the value of monthJun300
	 *	@return monthJun300
	 */
   public char[] getMonthJun300() throws CFException  {              
   		return work.getMonthJun300();
   }

  
	/**
	*  set variable monthJun300
	*  @param value
	**/
   public void setMonthJun300(char[] value) throws CFException {
      work.setMonthJun300(value);
   } 

	/**
	 *	Returns the value of monthFeb300
	 *	@return monthFeb300
	 */
   public char[] getMonthFeb300() throws CFException  {              
   		return work.getMonthFeb300();
   }

  
	/**
	*  set variable monthFeb300
	*  @param value
	**/
   public void setMonthFeb300(char[] value) throws CFException {
      work.setMonthFeb300(value);
   } 

	/**
	 *	Returns the value of monthMar300
	 *	@return monthMar300
	 */
   public char[] getMonthMar300() throws CFException  {              
   		return work.getMonthMar300();
   }

  
	/**
	*  set variable monthMar300
	*  @param value
	**/
   public void setMonthMar300(char[] value) throws CFException {
      work.setMonthMar300(value);
   } 

	/**
	 *	Returns the value of monthMay300
	 *	@return monthMay300
	 */
   public char[] getMonthMay300() throws CFException  {              
   		return work.getMonthMay300();
   }

  
	/**
	*  set variable monthMay300
	*  @param value
	**/
   public void setMonthMay300(char[] value) throws CFException {
      work.setMonthMay300(value);
   } 

	/**
	 *	Returns the value of monthDec300
	 *	@return monthDec300
	 */
   public char[] getMonthDec300() throws CFException  {              
   		return work.getMonthDec300();
   }

  
	/**
	*  set variable monthDec300
	*  @param value
	**/
   public void setMonthDec300(char[] value) throws CFException {
      work.setMonthDec300(value);
   } 

	/**
	 *	Returns the value of monthOct300
	 *	@return monthOct300
	 */
   public char[] getMonthOct300() throws CFException  {              
   		return work.getMonthOct300();
   }

  
	/**
	*  set variable monthOct300
	*  @param value
	**/
   public void setMonthOct300(char[] value) throws CFException {
      work.setMonthOct300(value);
   } 

	/**
	 *	Returns the value of monthApr300
	 *	@return monthApr300
	 */
   public char[] getMonthApr300() throws CFException  {              
   		return work.getMonthApr300();
   }

  
	/**
	*  set variable monthApr300
	*  @param value
	**/
   public void setMonthApr300(char[] value) throws CFException {
      work.setMonthApr300(value);
   } 

	/**
	 *	Returns the value of monthAug300
	 *	@return monthAug300
	 */
   public char[] getMonthAug300() throws CFException  {              
   		return work.getMonthAug300();
   }

  
	/**
	*  set variable monthAug300
	*  @param value
	**/
   public void setMonthAug300(char[] value) throws CFException {
      work.setMonthAug300(value);
   } 


        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
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

    public BuildMonthOutCtx clone() {
        BuildMonthOutCtx cloneObj = new BuildMonthOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public BuildMonthOutCtx getBuildMonthOutCtx() {
            return new BuildMonthOutCtx();
    }
     public class TerminateProgramInCtx implements Cloneable {
     Work work = Sf327010Ctx.this.getWork();
     TotWriteCountMsg600 totWriteCountMsg600 = Sf327010Ctx.this.getTotWriteCountMsg600();
     TotReadCountMsg600 totReadCountMsg600 = Sf327010Ctx.this.getTotReadCountMsg600();
     EojMessage6009999 eojMessage6009999 = Sf327010Ctx.this.getEojMessage6009999();

public long getReadCount400() throws CFException {  
        return work.getReadCount400();
}
	/**
	 * 	Update ReadCount400 with the passed value
	 *	@param number
	 */
	public void setReadCount400(long number)  throws CFException{
		work.setReadCount400(number);
	}



public long getWriteCount400() throws CFException {  
        return work.getWriteCount400();
}
	/**
	 * 	Update WriteCount400 with the passed value
	 *	@param number
	 */
	public void setWriteCount400(long number)  throws CFException{
		work.setWriteCount400(number);
	}



	/**
	 *	Returns the value of eojMessage6009500
	 *	@return eojMessage6009500
	 */
   public char[] getEojMessage6009500() throws CFException  {              
   		return work.getEojMessage6009500();
   }

  
	/**
	*  set variable eojMessage6009500
	*  @param value
	**/
   public void setEojMessage6009500(char[] value) throws CFException {
      work.setEojMessage6009500(value);
   } 

	/**
	 *	Returns the value of totWriteCountMsg600
	 *	@return totWriteCountMsg600
	 */   
	 public TotWriteCountMsg600 getTotWriteCountMsg600() {
   	return totWriteCountMsg600;
   }


	/**
	 *	Returns the value of totReadCountMsg600
	 *	@return totReadCountMsg600
	 */   
	 public TotReadCountMsg600 getTotReadCountMsg600() {
   	return totReadCountMsg600;
   }


	/**
	 *	Returns the value of returnCode800
	 *	@return returnCode800
	 */
	public short getReturnCode800() throws CFException {        
   		return work.getReturnCode800();
	}
	
	/**
	 * 	Update ReturnCode800 with the passed value
	 *	@param number
	 */
	public void setReturnCode800(short number)  throws CFException{
		work.setReturnCode800(number);
	}

	public void setReturnCode800(int number)  throws CFException{
		work.setReturnCode800((short)number);
	}

	public void setReturnCode800(long number)  throws CFException{
		work.setReturnCode800((short)number);
	}



	/**
	 *	Returns the value of eojMessage6009999
	 *	@return eojMessage6009999
	 */   
	 public EojMessage6009999 getEojMessage6009999() {
   	return eojMessage6009999;
   }



        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
        }

        public TerminateProgramOutCtx getTerminateProgramOutCtx() {
            return new TerminateProgramOutCtx();
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
        str += totWriteCountMsg600.hashCode();
        str += totReadCountMsg600.hashCode();
        str += eojMessage6009999.hashCode();
       return str.hashCode();
    }

    public TerminateProgramInCtx clone() {
        TerminateProgramInCtx cloneObj = new TerminateProgramInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.totWriteCountMsg600 = new TotWriteCountMsg600();
        cloneObj.totWriteCountMsg600.set(totWriteCountMsg600.getClonedField());
        cloneObj.totReadCountMsg600 = new TotReadCountMsg600();
        cloneObj.totReadCountMsg600.set(totReadCountMsg600.getClonedField());
        cloneObj.eojMessage6009999 = new EojMessage6009999();
        cloneObj.eojMessage6009999.set(eojMessage6009999.getClonedField());
        return cloneObj;
    }

    }

    public TerminateProgramInCtx getTerminateProgramInCtx() {
            return new TerminateProgramInCtx();
    }
     public class TerminateProgramOutCtx implements Cloneable {
     Work work = Sf327010Ctx.this.getWork();
     TotWriteCountMsg600 totWriteCountMsg600 = Sf327010Ctx.this.getTotWriteCountMsg600();
     TotReadCountMsg600 totReadCountMsg600 = Sf327010Ctx.this.getTotReadCountMsg600();
     EojMessage6009999 eojMessage6009999 = Sf327010Ctx.this.getEojMessage6009999();

public long getReadCount400() throws CFException {  
        return work.getReadCount400();
}
	/**
	 * 	Update ReadCount400 with the passed value
	 *	@param number
	 */
	public void setReadCount400(long number)  throws CFException{
		work.setReadCount400(number);
	}



	/**
	 *	Returns the value of returnCode6009999
	 *	@return returnCode6009999
	 */
	public int getReturnCode6009999() throws CFException {
   		return eojMessage6009999.getReturnCode6009999();
	}


	/**
	 *	Returns String value of returnCode6009999
	 *	@return returnCode6009999
	 */
	public char[]  getReturnCode6009999String() throws CFException {
	     return String.valueOf(eojMessage6009999.getReturnCode6009999String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean returnCode6009999IsNumeric()  throws CFException{
	    return eojMessage6009999.returnCode6009999IsNumeric();
	}

	/**
	 * 	Update ReturnCode6009999 with the passed value
	 *	@param number
	 */
	public void setReturnCode6009999(int number)  throws CFException{
		eojMessage6009999.setReturnCode6009999(number);
	}
	

	public void setReturnCode6009999(long number)  throws CFException{
	    eojMessage6009999.setReturnCode6009999(number);
	}
	
	
	/**
	 * 	Update ReturnCode6009999 with the passed value
	 *	@param value (String or char[])
	 */
	public void setReturnCode6009999(char[] value)  throws CFException {
		eojMessage6009999.setReturnCode6009999(value);
	}
	
	/**
	 * 	Update ReturnCode6009999 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setReturnCode6009999String(char[] value)  throws CFException{
		eojMessage6009999.setReturnCode6009999(value);
	}	

public long getWriteCount400() throws CFException {  
        return work.getWriteCount400();
}
	/**
	 * 	Update WriteCount400 with the passed value
	 *	@param number
	 */
	public void setWriteCount400(long number)  throws CFException{
		work.setWriteCount400(number);
	}



	/**
	 *	Returns the value of totReadCount600
	 *	@return totReadCount600
	 */
   public char[] getTotReadCount600() throws CFException  {              
   		return totReadCountMsg600.getTotReadCount600();
   }

  
	/**
	*  set variable totReadCount600
	*  @param value
	**/
   public void setTotReadCount600(char[] value) throws CFException {
      totReadCountMsg600.setTotReadCount600(value);
   } 

     /**
	 * 	Update TotReadCount600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTotReadCount600(char[] source, int sourceIndex) throws CFException {
      totReadCountMsg600.setTotReadCount600(source, sourceIndex);
   	
   }
   
   public void setTotReadCount600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      totReadCountMsg600.setTotReadCount600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TotReadCount600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTotReadCount600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      totReadCountMsg600.setTotReadCount600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TotReadCount600 with another Field
	 *	@param value
	 */
   public void setTotReadCount600(Field source) {
      totReadCountMsg600.setTotReadCount600(source);
   }  
   
     /**
	 * 	Update TotReadCount600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTotReadCount600(Field source, int sourceIndex,int sourceLen) {
      totReadCountMsg600.setTotReadCount600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TotReadCount600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTotReadCount600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      totReadCountMsg600.setTotReadCount600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of writeCount600
	 *	@return writeCount600
	 */
   public char[] getWriteCount600() throws CFException  {              
   		return totWriteCountMsg600.getWriteCount600();
   }

  
	/**
	*  set variable writeCount600
	*  @param value
	**/
   public void setWriteCount600(char[] value) throws CFException {
      totWriteCountMsg600.setWriteCount600(value);
   } 

     /**
	 * 	Update WriteCount600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWriteCount600(char[] source, int sourceIndex) throws CFException {
      totWriteCountMsg600.setWriteCount600(source, sourceIndex);
   	
   }
   
   public void setWriteCount600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      totWriteCountMsg600.setWriteCount600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WriteCount600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWriteCount600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      totWriteCountMsg600.setWriteCount600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WriteCount600 with another Field
	 *	@param value
	 */
   public void setWriteCount600(Field source) {
      totWriteCountMsg600.setWriteCount600(source);
   }  
   
     /**
	 * 	Update WriteCount600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWriteCount600(Field source, int sourceIndex,int sourceLen) {
      totWriteCountMsg600.setWriteCount600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WriteCount600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWriteCount600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      totWriteCountMsg600.setWriteCount600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of returnCode800
	 *	@return returnCode800
	 */
	public short getReturnCode800() throws CFException {        
   		return work.getReturnCode800();
	}
	
	/**
	 * 	Update ReturnCode800 with the passed value
	 *	@param number
	 */
	public void setReturnCode800(short number)  throws CFException{
		work.setReturnCode800(number);
	}

	public void setReturnCode800(int number)  throws CFException{
		work.setReturnCode800((short)number);
	}

	public void setReturnCode800(long number)  throws CFException{
		work.setReturnCode800((short)number);
	}




        public Sf327010Ctx getSf327010Ctx() {
            return Sf327010Ctx.this;
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
        str += totWriteCountMsg600.hashCode();
        str += totReadCountMsg600.hashCode();
        str += eojMessage6009999.hashCode();
       return str.hashCode();
    }

    public TerminateProgramOutCtx clone() {
        TerminateProgramOutCtx cloneObj = new TerminateProgramOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.totWriteCountMsg600 = new TotWriteCountMsg600();
        cloneObj.totWriteCountMsg600.set(totWriteCountMsg600.getClonedField());
        cloneObj.totReadCountMsg600 = new TotReadCountMsg600();
        cloneObj.totReadCountMsg600.set(totReadCountMsg600.getClonedField());
        cloneObj.eojMessage6009999 = new EojMessage6009999();
        cloneObj.eojMessage6009999.set(eojMessage6009999.getClonedField());
        return cloneObj;
    }

    }

    public TerminateProgramOutCtx getTerminateProgramOutCtx() {
            return new TerminateProgramOutCtx();
    }
}
