package com.cloudframe.app.sf326010;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.sf326010.dto.Sys001MiplogRecordGroup800;
import com.cloudframe.app.sf326010.dto.CompileInfoMsg600;
import com.cloudframe.app.sf326010.dto.BinDecoderGroup800;
import com.cloudframe.app.sf326010.dto.Work;
import com.cloudframe.app.sf326010.dto.Z9Int32Group800;
import com.cloudframe.app.sf326010.file.records.Sys001MiplogRecord;
import com.cloudframe.app.sf326010.dto.Message6008003;
import com.cloudframe.app.sf326010.dto.Message6008002;
import com.cloudframe.app.sf326010.dto.FuncWhenCompiled800;
import com.cloudframe.app.sf326010.dto.Message6008001;
import com.cloudframe.app.sf326010.dto.Sf539Sf305020ControlBlock;
import com.cloudframe.app.sf326010.dto.Sf539ServiceTable;
import com.cloudframe.app.sf326010.dto.Sf528ExtractZLogRec;
import com.cloudframe.app.sf326010.dto.FuncCurrentDate800;
import com.cloudframe.app.sf326010.file.records.Sys201ZLogRec;
import com.cloudframe.app.sf326010.dto.X86Int32Group800;
import com.cloudframe.app.sf326010.dto.X86Int32X800;


@Context
public class Sf326010Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Message6008002 message6008002;
    Message6008003 message6008003;
    Sys001MiplogRecordGroup800 sys001MiplogRecordGroup800;
    FuncCurrentDate800 funcCurrentDate800;
    Work work;
    Sf528ExtractZLogRec sf528ExtractZLogRec;
    FuncWhenCompiled800 funcWhenCompiled800;
    X86Int32Group800 x86Int32Group800;
    CompileInfoMsg600 compileInfoMsg600;
    Z9Int32Group800 z9Int32Group800;
    BinDecoderGroup800 binDecoderGroup800;
    Message6008001 message6008001;
    Sys201ZLogRec sys201ZLogRec;
    Sys001MiplogRecord sys001MiplogRecord;
    Sf539Sf305020ControlBlock sf539Sf305020ControlBlock;


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


    public Message6008002 getMessage6008002() {
        if (message6008002 == null) {
            message6008002 = new Message6008002();
        }

        return message6008002;
    }

    public void setMessage6008002(Message6008002 message6008002) {
        this.message6008002 = message6008002;
    }
    public Message6008003 getMessage6008003() {
        if (message6008003 == null) {
            message6008003 = new Message6008003();
        }

        return message6008003;
    }

    public void setMessage6008003(Message6008003 message6008003) {
        this.message6008003 = message6008003;
    }
    public Sys001MiplogRecordGroup800 getSys001MiplogRecordGroup800() {
        if (sys001MiplogRecordGroup800 == null) {
            sys001MiplogRecordGroup800 = new Sys001MiplogRecordGroup800();
        }

        return sys001MiplogRecordGroup800;
    }

    public void setSys001MiplogRecordGroup800(Sys001MiplogRecordGroup800 sys001MiplogRecordGroup800) {
        this.sys001MiplogRecordGroup800 = sys001MiplogRecordGroup800;
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
    public Work getWork() {
        if (work == null) {
            work = new Work();
        }

        return work;
    }

    public void setWork(Work work) {
        this.work = work;
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
    public FuncWhenCompiled800 getFuncWhenCompiled800() {
        if (funcWhenCompiled800 == null) {
            funcWhenCompiled800 = new FuncWhenCompiled800();
        }

        return funcWhenCompiled800;
    }

    public void setFuncWhenCompiled800(FuncWhenCompiled800 funcWhenCompiled800) {
        this.funcWhenCompiled800 = funcWhenCompiled800;
    }
    public X86Int32Group800 getX86Int32Group800() {
        if (x86Int32Group800 == null) {
            x86Int32Group800 = new X86Int32Group800();
        }

        return x86Int32Group800;
    }

    public void setX86Int32Group800(X86Int32Group800 x86Int32Group800) {
        this.x86Int32Group800 = x86Int32Group800;
    }
    public CompileInfoMsg600 getCompileInfoMsg600() {
        if (compileInfoMsg600 == null) {
            compileInfoMsg600 = new CompileInfoMsg600();
        }

        return compileInfoMsg600;
    }

    public void setCompileInfoMsg600(CompileInfoMsg600 compileInfoMsg600) {
        this.compileInfoMsg600 = compileInfoMsg600;
    }
    public Z9Int32Group800 getZ9Int32Group800() {
        if (z9Int32Group800 == null) {
            z9Int32Group800 = new Z9Int32Group800();
        }

        return z9Int32Group800;
    }

    public void setZ9Int32Group800(Z9Int32Group800 z9Int32Group800) {
        this.z9Int32Group800 = z9Int32Group800;
    }
    public BinDecoderGroup800 getBinDecoderGroup800() {
        if (binDecoderGroup800 == null) {
            binDecoderGroup800 = new BinDecoderGroup800();
        }

        return binDecoderGroup800;
    }

    public void setBinDecoderGroup800(BinDecoderGroup800 binDecoderGroup800) {
        this.binDecoderGroup800 = binDecoderGroup800;
    }
    public Message6008001 getMessage6008001() {
        if (message6008001 == null) {
            message6008001 = new Message6008001();
        }

        return message6008001;
    }

    public void setMessage6008001(Message6008001 message6008001) {
        this.message6008001 = message6008001;
    }
    public Sys201ZLogRec getSys201ZLogRec() {
        if (sys201ZLogRec == null) {
            sys201ZLogRec = new Sys201ZLogRec();
        }

        return sys201ZLogRec;
    }

    public void setSys201ZLogRec(Sys201ZLogRec sys201ZLogRec) {
        this.sys201ZLogRec = sys201ZLogRec;
    }
    public Sys001MiplogRecord getSys001MiplogRecord() {
        if (sys001MiplogRecord == null) {
            sys001MiplogRecord = new Sys001MiplogRecord();
        }

        return sys001MiplogRecord;
    }

    public void setSys001MiplogRecord(Sys001MiplogRecord sys001MiplogRecord) {
        this.sys001MiplogRecord = sys001MiplogRecord;
    }
    public Sf539Sf305020ControlBlock getSf539Sf305020ControlBlock() {
        if (sf539Sf305020ControlBlock == null) {
            sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        }

        return sf539Sf305020ControlBlock;
    }

    public void setSf539Sf305020ControlBlock(Sf539Sf305020ControlBlock sf539Sf305020ControlBlock) {
        this.sf539Sf305020ControlBlock = sf539Sf305020ControlBlock;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += message6008002.hashCode();
        str += message6008003.hashCode();
        str += sys001MiplogRecordGroup800.hashCode();
        str += funcCurrentDate800.hashCode();
        str += work.hashCode();
        str += sf528ExtractZLogRec.hashCode();
        str += funcWhenCompiled800.hashCode();
        str += x86Int32Group800.hashCode();
        str += compileInfoMsg600.hashCode();
        str += z9Int32Group800.hashCode();
        str += binDecoderGroup800.hashCode();
        str += message6008001.hashCode();
        str += sys201ZLogRec.hashCode();
        str += sys001MiplogRecord.hashCode();
        str += sf539Sf305020ControlBlock.hashCode();
       return str.hashCode();
    }

    public Sf326010Ctx clone() {
        Sf326010Ctx cloneObj = new Sf326010Ctx();
        cloneObj.message6008002 = new Message6008002();
        cloneObj.message6008002.set(message6008002.getClonedField());
        cloneObj.message6008003 = new Message6008003();
        cloneObj.message6008003.set(message6008003.getClonedField());
        cloneObj.sys001MiplogRecordGroup800 = new Sys001MiplogRecordGroup800();
        cloneObj.sys001MiplogRecordGroup800.set(sys001MiplogRecordGroup800.getClonedField());
        cloneObj.funcCurrentDate800 = new FuncCurrentDate800();
        cloneObj.funcCurrentDate800.set(funcCurrentDate800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        cloneObj.funcWhenCompiled800 = new FuncWhenCompiled800();
        cloneObj.funcWhenCompiled800.set(funcWhenCompiled800.getClonedField());
        cloneObj.x86Int32Group800 = new X86Int32Group800();
        cloneObj.x86Int32Group800.set(x86Int32Group800.getClonedField());
        cloneObj.compileInfoMsg600 = new CompileInfoMsg600();
        cloneObj.compileInfoMsg600.set(compileInfoMsg600.getClonedField());
        cloneObj.z9Int32Group800 = new Z9Int32Group800();
        cloneObj.z9Int32Group800.set(z9Int32Group800.getClonedField());
        cloneObj.binDecoderGroup800 = new BinDecoderGroup800();
        cloneObj.binDecoderGroup800.set(binDecoderGroup800.getClonedField());
        cloneObj.message6008001 = new Message6008001();
        cloneObj.message6008001.set(message6008001.getClonedField());
        cloneObj.sys201ZLogRec = new Sys201ZLogRec();
        cloneObj.sys201ZLogRec.set(sys201ZLogRec.getClonedField());
        cloneObj.sys001MiplogRecord = new Sys001MiplogRecord();
        cloneObj.sys001MiplogRecord.set(sys001MiplogRecord.getClonedField());
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineInCtx implements Cloneable {
     Work work = Sf326010Ctx.this.getWork();

	/**
	 *	Test condition "Y" for isMipLogEof88100()
	 *	@return  Returns true if isMipLogEof88100() is "Y"
	 */
   public boolean isMipLogEof88100() throws CFException {
      return work.isMipLogEof88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setMipLogEof88100True()  throws CFException{  			
    	work.setMipLogEof88100True();
   	}

        public Sf326010Ctx getSf326010Ctx() {
            return Sf326010Ctx.this;
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
     public class BuildBegJobMsgsInCtx implements Cloneable {
     FuncCurrentDate800 funcCurrentDate800 = Sf326010Ctx.this.getFuncCurrentDate800();
     Work work = Sf326010Ctx.this.getWork();
     FuncWhenCompiled800 funcWhenCompiled800 = Sf326010Ctx.this.getFuncWhenCompiled800();
     CompileInfoMsg600 compileInfoMsg600 = Sf326010Ctx.this.getCompileInfoMsg600();

	/**
	 *	Returns the value of currTimeMm800
	 *	@return currTimeMm800
	 */
   public char[] getCurrTimeMm800() throws CFException  {              
   		return funcCurrentDate800.getFuncCurrTime800().getCurrTimeMm800();
   }

  
	/**
	*  set variable currTimeMm800
	*  @param value
	**/
   public void setCurrTimeMm800(char[] value) throws CFException {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeMm800(value);
   } 

     /**
	 * 	Update CurrTimeMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrTimeMm800(char[] source, int sourceIndex) throws CFException {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeMm800(source, sourceIndex);
   	
   }
   
   public void setCurrTimeMm800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeMm800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrTimeMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrTimeMm800 with another Field
	 *	@param value
	 */
   public void setCurrTimeMm800(Field source) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeMm800(source);
   }  
   
     /**
	 * 	Update CurrTimeMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrTimeMm800(Field source, int sourceIndex,int sourceLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeMm800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrTimeMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of currTimeSs800
	 *	@return currTimeSs800
	 */
   public char[] getCurrTimeSs800() throws CFException  {              
   		return funcCurrentDate800.getFuncCurrTime800().getCurrTimeSs800();
   }

  
	/**
	*  set variable currTimeSs800
	*  @param value
	**/
   public void setCurrTimeSs800(char[] value) throws CFException {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeSs800(value);
   } 

     /**
	 * 	Update CurrTimeSs800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrTimeSs800(char[] source, int sourceIndex) throws CFException {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeSs800(source, sourceIndex);
   	
   }
   
   public void setCurrTimeSs800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeSs800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrTimeSs800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeSs800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeSs800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrTimeSs800 with another Field
	 *	@param value
	 */
   public void setCurrTimeSs800(Field source) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeSs800(source);
   }  
   
     /**
	 * 	Update CurrTimeSs800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrTimeSs800(Field source, int sourceIndex,int sourceLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeSs800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrTimeSs800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeSs800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeSs800(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of currTimeHh800
	 *	@return currTimeHh800
	 */
   public char[] getCurrTimeHh800() throws CFException  {              
   		return funcCurrentDate800.getFuncCurrTime800().getCurrTimeHh800();
   }

  
	/**
	*  set variable currTimeHh800
	*  @param value
	**/
   public void setCurrTimeHh800(char[] value) throws CFException {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeHh800(value);
   } 

     /**
	 * 	Update CurrTimeHh800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrTimeHh800(char[] source, int sourceIndex) throws CFException {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeHh800(source, sourceIndex);
   	
   }
   
   public void setCurrTimeHh800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeHh800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrTimeHh800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeHh800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrTimeHh800 with another Field
	 *	@param value
	 */
   public void setCurrTimeHh800(Field source) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeHh800(source);
   }  
   
     /**
	 * 	Update CurrTimeHh800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrTimeHh800(Field source, int sourceIndex,int sourceLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeHh800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrTimeHh800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeHh800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of execStartMsg600
	 *	@return execStartMsg600
	 */
   public char[] getExecStartMsg600() throws CFException  {              
   		return work.getExecStartMsg600();
   }

  
	/**
	*  set variable execStartMsg600
	*  @param value
	**/
   public void setExecStartMsg600(char[] value) throws CFException {
      work.setExecStartMsg600(value);
   } 

	/**
	 *	Returns the value of compileInfoMsg600
	 *	@return compileInfoMsg600
	 */   
	 public CompileInfoMsg600 getCompileInfoMsg600() {
   	return compileInfoMsg600;
   }



        public Sf326010Ctx getSf326010Ctx() {
            return Sf326010Ctx.this;
        }

        public BuildBegJobMsgsOutCtx getBuildBegJobMsgsOutCtx() {
            return new BuildBegJobMsgsOutCtx();
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
        str += work.hashCode();
        str += funcWhenCompiled800.hashCode();
        str += compileInfoMsg600.hashCode();
       return str.hashCode();
    }

    public BuildBegJobMsgsInCtx clone() {
        BuildBegJobMsgsInCtx cloneObj = new BuildBegJobMsgsInCtx();
        cloneObj.funcCurrentDate800 = new FuncCurrentDate800();
        cloneObj.funcCurrentDate800.set(funcCurrentDate800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.funcWhenCompiled800 = new FuncWhenCompiled800();
        cloneObj.funcWhenCompiled800.set(funcWhenCompiled800.getClonedField());
        cloneObj.compileInfoMsg600 = new CompileInfoMsg600();
        cloneObj.compileInfoMsg600.set(compileInfoMsg600.getClonedField());
        return cloneObj;
    }

    }

    public BuildBegJobMsgsInCtx getBuildBegJobMsgsInCtx() {
            return new BuildBegJobMsgsInCtx();
    }
     public class BuildBegJobMsgsOutCtx implements Cloneable {
     FuncCurrentDate800 funcCurrentDate800 = Sf326010Ctx.this.getFuncCurrentDate800();
     Work work = Sf326010Ctx.this.getWork();
     FuncWhenCompiled800 funcWhenCompiled800 = Sf326010Ctx.this.getFuncWhenCompiled800();
     CompileInfoMsg600 compileInfoMsg600 = Sf326010Ctx.this.getCompileInfoMsg600();

	/**
	 *	Returns the value of currDateYyyy600
	 *	@return currDateYyyy600
	 */
   public char[] getCurrDateYyyy600() throws CFException  {              
   		return work.getCurrDateYyyy600();
   }

  
	/**
	*  set variable currDateYyyy600
	*  @param value
	**/
   public void setCurrDateYyyy600(char[] value) throws CFException {
      work.setCurrDateYyyy600(value);
   } 

	/**
	 *	Returns the value of compDateMm600
	 *	@return compDateMm600
	 */
   public char[] getCompDateMm600() throws CFException  {              
   		return compileInfoMsg600.getCompileDate600().getCompDateMm600();
   }

  
	/**
	*  set variable compDateMm600
	*  @param value
	**/
   public void setCompDateMm600(char[] value) throws CFException {
      compileInfoMsg600.getCompileDate600().setCompDateMm600(value);
   } 

     /**
	 * 	Update CompDateMm600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompDateMm600(char[] source, int sourceIndex) throws CFException {
      compileInfoMsg600.getCompileDate600().setCompDateMm600(source, sourceIndex);
   	
   }
   
   public void setCompDateMm600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      compileInfoMsg600.getCompileDate600().setCompDateMm600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CompDateMm600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompDateMm600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileInfoMsg600.getCompileDate600().setCompDateMm600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CompDateMm600 with another Field
	 *	@param value
	 */
   public void setCompDateMm600(Field source) {
      compileInfoMsg600.getCompileDate600().setCompDateMm600(source);
   }  
   
     /**
	 * 	Update CompDateMm600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompDateMm600(Field source, int sourceIndex,int sourceLen) {
      compileInfoMsg600.getCompileDate600().setCompDateMm600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CompDateMm600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompDateMm600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileInfoMsg600.getCompileDate600().setCompDateMm600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currTimeHh800
	 *	@return currTimeHh800
	 */
   public char[] getCurrTimeHh800() throws CFException  {              
   		return funcCurrentDate800.getFuncCurrTime800().getCurrTimeHh800();
   }

  
	/**
	*  set variable currTimeHh800
	*  @param value
	**/
   public void setCurrTimeHh800(char[] value) throws CFException {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeHh800(value);
   } 

     /**
	 * 	Update CurrTimeHh800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrTimeHh800(char[] source, int sourceIndex) throws CFException {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeHh800(source, sourceIndex);
   	
   }
   
   public void setCurrTimeHh800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeHh800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrTimeHh800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeHh800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrTimeHh800 with another Field
	 *	@param value
	 */
   public void setCurrTimeHh800(Field source) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeHh800(source);
   }  
   
     /**
	 * 	Update CurrTimeHh800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrTimeHh800(Field source, int sourceIndex,int sourceLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeHh800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrTimeHh800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeHh800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeHh800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of compTimeMm600
	 *	@return compTimeMm600
	 */
   public char[] getCompTimeMm600() throws CFException  {              
   		return compileInfoMsg600.getCompileTime600().getCompTimeMm600();
   }

  
	/**
	*  set variable compTimeMm600
	*  @param value
	**/
   public void setCompTimeMm600(char[] value) throws CFException {
      compileInfoMsg600.getCompileTime600().setCompTimeMm600(value);
   } 

     /**
	 * 	Update CompTimeMm600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompTimeMm600(char[] source, int sourceIndex) throws CFException {
      compileInfoMsg600.getCompileTime600().setCompTimeMm600(source, sourceIndex);
   	
   }
   
   public void setCompTimeMm600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      compileInfoMsg600.getCompileTime600().setCompTimeMm600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CompTimeMm600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeMm600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileInfoMsg600.getCompileTime600().setCompTimeMm600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CompTimeMm600 with another Field
	 *	@param value
	 */
   public void setCompTimeMm600(Field source) {
      compileInfoMsg600.getCompileTime600().setCompTimeMm600(source);
   }  
   
     /**
	 * 	Update CompTimeMm600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompTimeMm600(Field source, int sourceIndex,int sourceLen) {
      compileInfoMsg600.getCompileTime600().setCompTimeMm600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CompTimeMm600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeMm600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileInfoMsg600.getCompileTime600().setCompTimeMm600(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of compDateDd600
	 *	@return compDateDd600
	 */
   public char[] getCompDateDd600() throws CFException  {              
   		return compileInfoMsg600.getCompileDate600().getCompDateDd600();
   }

  
	/**
	*  set variable compDateDd600
	*  @param value
	**/
   public void setCompDateDd600(char[] value) throws CFException {
      compileInfoMsg600.getCompileDate600().setCompDateDd600(value);
   } 

     /**
	 * 	Update CompDateDd600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompDateDd600(char[] source, int sourceIndex) throws CFException {
      compileInfoMsg600.getCompileDate600().setCompDateDd600(source, sourceIndex);
   	
   }
   
   public void setCompDateDd600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      compileInfoMsg600.getCompileDate600().setCompDateDd600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CompDateDd600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompDateDd600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileInfoMsg600.getCompileDate600().setCompDateDd600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CompDateDd600 with another Field
	 *	@param value
	 */
   public void setCompDateDd600(Field source) {
      compileInfoMsg600.getCompileDate600().setCompDateDd600(source);
   }  
   
     /**
	 * 	Update CompDateDd600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompDateDd600(Field source, int sourceIndex,int sourceLen) {
      compileInfoMsg600.getCompileDate600().setCompDateDd600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CompDateDd600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompDateDd600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileInfoMsg600.getCompileDate600().setCompDateDd600(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of currTimeMm600
	 *	@return currTimeMm600
	 */
   public char[] getCurrTimeMm600() throws CFException  {              
   		return work.getCurrTimeMm600();
   }

  
	/**
	*  set variable currTimeMm600
	*  @param value
	**/
   public void setCurrTimeMm600(char[] value) throws CFException {
      work.setCurrTimeMm600(value);
   } 

	/**
	 *	Returns the value of compTimeSs600
	 *	@return compTimeSs600
	 */
   public char[] getCompTimeSs600() throws CFException  {              
   		return compileInfoMsg600.getCompileTime600().getCompTimeSs600();
   }

  
	/**
	*  set variable compTimeSs600
	*  @param value
	**/
   public void setCompTimeSs600(char[] value) throws CFException {
      compileInfoMsg600.getCompileTime600().setCompTimeSs600(value);
   } 

     /**
	 * 	Update CompTimeSs600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompTimeSs600(char[] source, int sourceIndex) throws CFException {
      compileInfoMsg600.getCompileTime600().setCompTimeSs600(source, sourceIndex);
   	
   }
   
   public void setCompTimeSs600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      compileInfoMsg600.getCompileTime600().setCompTimeSs600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CompTimeSs600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeSs600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileInfoMsg600.getCompileTime600().setCompTimeSs600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CompTimeSs600 with another Field
	 *	@param value
	 */
   public void setCompTimeSs600(Field source) {
      compileInfoMsg600.getCompileTime600().setCompTimeSs600(source);
   }  
   
     /**
	 * 	Update CompTimeSs600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompTimeSs600(Field source, int sourceIndex,int sourceLen) {
      compileInfoMsg600.getCompileTime600().setCompTimeSs600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CompTimeSs600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeSs600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileInfoMsg600.getCompileTime600().setCompTimeSs600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of funcCurrentDate800
	 *	@return funcCurrentDate800
	 */   
	 public FuncCurrentDate800 getFuncCurrentDate800() {
   	return funcCurrentDate800;
   }


	/**
	 *	Returns the value of currDateMm600
	 *	@return currDateMm600
	 */
   public char[] getCurrDateMm600() throws CFException  {              
   		return work.getCurrDateMm600();
   }

  
	/**
	*  set variable currDateMm600
	*  @param value
	**/
   public void setCurrDateMm600(char[] value) throws CFException {
      work.setCurrDateMm600(value);
   } 

	/**
	 *	Returns the value of funcWhenCompiled800
	 *	@return funcWhenCompiled800
	 */   
	 public FuncWhenCompiled800 getFuncWhenCompiled800() {
   	return funcWhenCompiled800;
   }


	/**
	 *	Returns the value of currTimeHh600
	 *	@return currTimeHh600
	 */
   public char[] getCurrTimeHh600() throws CFException  {              
   		return work.getCurrTimeHh600();
   }

  
	/**
	*  set variable currTimeHh600
	*  @param value
	**/
   public void setCurrTimeHh600(char[] value) throws CFException {
      work.setCurrTimeHh600(value);
   } 

	/**
	 *	Returns the value of compDateYyyy600
	 *	@return compDateYyyy600
	 */
   public char[] getCompDateYyyy600() throws CFException  {              
   		return compileInfoMsg600.getCompileDate600().getCompDateYyyy600();
   }

  
	/**
	*  set variable compDateYyyy600
	*  @param value
	**/
   public void setCompDateYyyy600(char[] value) throws CFException {
      compileInfoMsg600.getCompileDate600().setCompDateYyyy600(value);
   } 

     /**
	 * 	Update CompDateYyyy600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompDateYyyy600(char[] source, int sourceIndex) throws CFException {
      compileInfoMsg600.getCompileDate600().setCompDateYyyy600(source, sourceIndex);
   	
   }
   
   public void setCompDateYyyy600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      compileInfoMsg600.getCompileDate600().setCompDateYyyy600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CompDateYyyy600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompDateYyyy600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileInfoMsg600.getCompileDate600().setCompDateYyyy600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CompDateYyyy600 with another Field
	 *	@param value
	 */
   public void setCompDateYyyy600(Field source) {
      compileInfoMsg600.getCompileDate600().setCompDateYyyy600(source);
   }  
   
     /**
	 * 	Update CompDateYyyy600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompDateYyyy600(Field source, int sourceIndex,int sourceLen) {
      compileInfoMsg600.getCompileDate600().setCompDateYyyy600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CompDateYyyy600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompDateYyyy600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileInfoMsg600.getCompileDate600().setCompDateYyyy600(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of currTimeMm800
	 *	@return currTimeMm800
	 */
   public char[] getCurrTimeMm800() throws CFException  {              
   		return funcCurrentDate800.getFuncCurrTime800().getCurrTimeMm800();
   }

  
	/**
	*  set variable currTimeMm800
	*  @param value
	**/
   public void setCurrTimeMm800(char[] value) throws CFException {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeMm800(value);
   } 

     /**
	 * 	Update CurrTimeMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrTimeMm800(char[] source, int sourceIndex) throws CFException {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeMm800(source, sourceIndex);
   	
   }
   
   public void setCurrTimeMm800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeMm800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrTimeMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrTimeMm800 with another Field
	 *	@param value
	 */
   public void setCurrTimeMm800(Field source) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeMm800(source);
   }  
   
     /**
	 * 	Update CurrTimeMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrTimeMm800(Field source, int sourceIndex,int sourceLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeMm800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrTimeMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeMm800(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of currTimeSs800
	 *	@return currTimeSs800
	 */
   public char[] getCurrTimeSs800() throws CFException  {              
   		return funcCurrentDate800.getFuncCurrTime800().getCurrTimeSs800();
   }

  
	/**
	*  set variable currTimeSs800
	*  @param value
	**/
   public void setCurrTimeSs800(char[] value) throws CFException {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeSs800(value);
   } 

     /**
	 * 	Update CurrTimeSs800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrTimeSs800(char[] source, int sourceIndex) throws CFException {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeSs800(source, sourceIndex);
   	
   }
   
   public void setCurrTimeSs800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeSs800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrTimeSs800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeSs800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeSs800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrTimeSs800 with another Field
	 *	@param value
	 */
   public void setCurrTimeSs800(Field source) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeSs800(source);
   }  
   
     /**
	 * 	Update CurrTimeSs800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrTimeSs800(Field source, int sourceIndex,int sourceLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeSs800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CurrTimeSs800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrTimeSs800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      funcCurrentDate800.getFuncCurrTime800().setCurrTimeSs800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of compTimeHh600
	 *	@return compTimeHh600
	 */
   public char[] getCompTimeHh600() throws CFException  {              
   		return compileInfoMsg600.getCompileTime600().getCompTimeHh600();
   }

  
	/**
	*  set variable compTimeHh600
	*  @param value
	**/
   public void setCompTimeHh600(char[] value) throws CFException {
      compileInfoMsg600.getCompileTime600().setCompTimeHh600(value);
   } 

     /**
	 * 	Update CompTimeHh600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompTimeHh600(char[] source, int sourceIndex) throws CFException {
      compileInfoMsg600.getCompileTime600().setCompTimeHh600(source, sourceIndex);
   	
   }
   
   public void setCompTimeHh600(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      compileInfoMsg600.getCompileTime600().setCompTimeHh600(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CompTimeHh600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeHh600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileInfoMsg600.getCompileTime600().setCompTimeHh600(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CompTimeHh600 with another Field
	 *	@param value
	 */
   public void setCompTimeHh600(Field source) {
      compileInfoMsg600.getCompileTime600().setCompTimeHh600(source);
   }  
   
     /**
	 * 	Update CompTimeHh600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompTimeHh600(Field source, int sourceIndex,int sourceLen) {
      compileInfoMsg600.getCompileTime600().setCompTimeHh600(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CompTimeHh600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompTimeHh600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      compileInfoMsg600.getCompileTime600().setCompTimeHh600(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of currTimeSs600
	 *	@return currTimeSs600
	 */
   public char[] getCurrTimeSs600() throws CFException  {              
   		return work.getCurrTimeSs600();
   }

  
	/**
	*  set variable currTimeSs600
	*  @param value
	**/
   public void setCurrTimeSs600(char[] value) throws CFException {
      work.setCurrTimeSs600(value);
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
	 *	Returns the value of currDateDd600
	 *	@return currDateDd600
	 */
   public char[] getCurrDateDd600() throws CFException  {              
   		return work.getCurrDateDd600();
   }

  
	/**
	*  set variable currDateDd600
	*  @param value
	**/
   public void setCurrDateDd600(char[] value) throws CFException {
      work.setCurrDateDd600(value);
   } 


        public Sf326010Ctx getSf326010Ctx() {
            return Sf326010Ctx.this;
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
        str += work.hashCode();
        str += funcWhenCompiled800.hashCode();
        str += compileInfoMsg600.hashCode();
       return str.hashCode();
    }

    public BuildBegJobMsgsOutCtx clone() {
        BuildBegJobMsgsOutCtx cloneObj = new BuildBegJobMsgsOutCtx();
        cloneObj.funcCurrentDate800 = new FuncCurrentDate800();
        cloneObj.funcCurrentDate800.set(funcCurrentDate800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.funcWhenCompiled800 = new FuncWhenCompiled800();
        cloneObj.funcWhenCompiled800.set(funcWhenCompiled800.getClonedField());
        cloneObj.compileInfoMsg600 = new CompileInfoMsg600();
        cloneObj.compileInfoMsg600.set(compileInfoMsg600.getClonedField());
        return cloneObj;
    }

    }

    public BuildBegJobMsgsOutCtx getBuildBegJobMsgsOutCtx() {
            return new BuildBegJobMsgsOutCtx();
    }
     public class OpenFilesInCtx implements Cloneable {
     Sys201ZLogRec sys201ZLogRec = Sf326010Ctx.this.getSys201ZLogRec();
     Sys001MiplogRecord sys001MiplogRecord = Sf326010Ctx.this.getSys001MiplogRecord();

	/**
	 *	Returns the value of sys201ZLogRec
	 *	@return sys201ZLogRec
	 */   
	 public Sys201ZLogRec getSys201ZLogRec() {
   	return sys201ZLogRec;
   }


	/**
	 *	Returns the value of sys001MiplogRecord
	 *	@return sys001MiplogRecord
	 */   
	 public Sys001MiplogRecord getSys001MiplogRecord() {
   	return sys001MiplogRecord;
   }



        public Sf326010Ctx getSf326010Ctx() {
            return Sf326010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys201ZLogRec.hashCode();
        str += sys001MiplogRecord.hashCode();
       return str.hashCode();
    }

    public OpenFilesInCtx clone() {
        OpenFilesInCtx cloneObj = new OpenFilesInCtx();
        cloneObj.sys201ZLogRec = new Sys201ZLogRec();
        cloneObj.sys201ZLogRec.set(sys201ZLogRec.getClonedField());
        cloneObj.sys001MiplogRecord = new Sys001MiplogRecord();
        cloneObj.sys001MiplogRecord.set(sys001MiplogRecord.getClonedField());
        return cloneObj;
    }

    }

    public OpenFilesInCtx getOpenFilesInCtx() {
            return new OpenFilesInCtx();
    }
     public class ProcessMiplogInCtx implements Cloneable {
     Sys001MiplogRecordGroup800 sys001MiplogRecordGroup800 = Sf326010Ctx.this.getSys001MiplogRecordGroup800();
     Work work = Sf326010Ctx.this.getWork();
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf326010Ctx.this.getSf528ExtractZLogRec();
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf326010Ctx.this.getSf539Sf305020ControlBlock();

	/**
	 *	Returns the value of zLogBypass400
	 *	@return zLogBypass400
	 */
	public int getZLogBypass400() throws CFException {
   		return work.getZLogBypass400();
	}

    /**
	 *	Returns the String value of zLogBypass400
	 *	@return zLogBypass400
	 */
	public char[]  getZLogBypass400ActualString() {
		return work.getZLogBypass400ActualString();
	}

	/**
	 *	Returns String value of zLogBypass400
	 *	@return zLogBypass400
	 */
	public char[]  getZLogBypass400String() throws CFException {
	     return String.valueOf(work.getZLogBypass400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean zLogBypass400IsNumeric()  throws CFException{
	    return work.zLogBypass400IsNumeric();
	}

	/**
	 * 	Update ZLogBypass400 with the passed value
	 *	@param number
	 */
	public void setZLogBypass400(int number)  throws CFException{
		work.setZLogBypass400(number);
	}
	

	public void setZLogBypass400(long number)  throws CFException{
	    work.setZLogBypass400(number);
	}
	
	
	/**
	 * 	Update ZLogBypass400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setZLogBypass400(char[] value)  throws CFException {
		work.setZLogBypass400(value);
	}
	
	/**
	 * 	Update ZLogBypass400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setZLogBypass400String(char[] value)  throws CFException{
		work.setZLogBypass400(value);
	}	

	/**
	 *	Returns the value of sf539ServiceCode
	 *	@return sf539ServiceCode
	 */
   public char[] getSf539ServiceCode(int index) throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceCode();
   }

  
	/**
	*  set variable sf539ServiceCode
	*  @param value
	**/
   public void setSf539ServiceCode(int index,char[] value) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(value);
   } 

     /**
	 * 	Update Sf539ServiceCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex);
   	
   }
   
   public void setSf539ServiceCode(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539ServiceCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539ServiceCode with another Field
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,Field source) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source);
   }  
   
     /**
	 * 	Update Sf539ServiceCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539ServiceCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of halfword8300
	 *	@return halfword8300
	 */
	public short getHalfword8300() throws CFException {        
   		return work.getHalfword8300();
	}
	
	/**
	 * 	Update Halfword8300 with the passed value
	 *	@param number
	 */
	public void setHalfword8300(short number)  throws CFException{
		work.setHalfword8300(number);
	}

	public void setHalfword8300(int number)  throws CFException{
		work.setHalfword8300((short)number);
	}

	public void setHalfword8300(long number)  throws CFException{
		work.setHalfword8300((short)number);
	}



	/**
	 *	Returns the value of sys001MiplogBoxId801
	 *	@return sys001MiplogBoxId801
	 */
   public char[] getSys001MiplogBoxId801() throws CFException  {              
   		return sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogBoxId801();
   }

  
	/**
	*  set variable sys001MiplogBoxId801
	*  @param value
	**/
   public void setSys001MiplogBoxId801(char[] value) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogBoxId801(value);
   } 

     /**
	 * 	Update Sys001MiplogBoxId801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogBoxId801(char[] source, int sourceIndex) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogBoxId801(source, sourceIndex);
   	
   }
   
   public void setSys001MiplogBoxId801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogBoxId801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001MiplogBoxId801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogBoxId801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogBoxId801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001MiplogBoxId801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogBoxId801(Field source) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogBoxId801(source);
   }  
   
     /**
	 * 	Update Sys001MiplogBoxId801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogBoxId801(Field source, int sourceIndex,int sourceLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogBoxId801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001MiplogBoxId801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogBoxId801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogBoxId801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sub400
	 *	@return sub400
	 */
	public short getSub400() throws CFException {        
   		return work.getSub400();
	}
	
	/**
	 * 	Update Sub400 with the passed value
	 *	@param number
	 */
	public void setSub400(short number)  throws CFException{
		work.setSub400(number);
	}

	public void setSub400(int number)  throws CFException{
		work.setSub400((short)number);
	}

	public void setSub400(long number)  throws CFException{
		work.setSub400((short)number);
	}



	/**
	 *	Returns the value of charB300
	 *	@return charB300
	 */
   public char[] getCharB300() throws CFException  {              
   		return work.getCharB300();
   }

  
	/**
	*  set variable charB300
	*  @param value
	**/
   public void setCharB300(char[] value) throws CFException {
      work.setCharB300(value);
   } 

	/**
	 *	Returns the value of sys001MiplogClass801
	 *	@return sys001MiplogClass801
	 */
   public char[] getSys001MiplogClass801() throws CFException  {              
   		return sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogClass801();
   }

  
	/**
	*  set variable sys001MiplogClass801
	*  @param value
	**/
   public void setSys001MiplogClass801(char[] value) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogClass801(value);
   } 

     /**
	 * 	Update Sys001MiplogClass801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogClass801(char[] source, int sourceIndex) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogClass801(source, sourceIndex);
   	
   }
   
   public void setSys001MiplogClass801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogClass801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001MiplogClass801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogClass801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogClass801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001MiplogClass801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogClass801(Field source) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogClass801(source);
   }  
   
     /**
	 * 	Update Sys001MiplogClass801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogClass801(Field source, int sourceIndex,int sourceLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogClass801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001MiplogClass801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogClass801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogClass801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of zLog300
	 *	@return zLog300
	 */
   public char[] getZLog300() throws CFException  {              
   		return work.getZLog300();
   }

  
	/**
	*  set variable zLog300
	*  @param value
	**/
   public void setZLog300(char[] value) throws CFException {
      work.setZLog300(value);
   } 

	/**
	 *	Returns the value of sys001MiplogTyp801
	 *	@return sys001MiplogTyp801
	 */
   public char[] getSys001MiplogTyp801() throws CFException  {              
   		return sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTyp801();
   }

  
	/**
	*  set variable sys001MiplogTyp801
	*  @param value
	**/
   public void setSys001MiplogTyp801(char[] value) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogTyp801(value);
   } 

     /**
	 * 	Update Sys001MiplogTyp801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogTyp801(char[] source, int sourceIndex) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogTyp801(source, sourceIndex);
   	
   }
   
   public void setSys001MiplogTyp801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogTyp801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001MiplogTyp801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogTyp801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogTyp801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001MiplogTyp801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogTyp801(Field source) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogTyp801(source);
   }  
   
     /**
	 * 	Update Sys001MiplogTyp801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogTyp801(Field source, int sourceIndex,int sourceLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogTyp801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001MiplogTyp801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogTyp801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogTyp801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of one300
	 *	@return one300
	 */
	public short getOne300() throws CFException {
   		return work.getOne300();
	}

    /**
	 *	Returns the String value of one300
	 *	@return one300
	 */
	public char[]  getOne300ActualString() {
		return work.getOne300ActualString();
	}

	/**
	 *	Returns String value of one300
	 *	@return one300
	 */
	public char[]  getOne300String() throws CFException {
	     return String.valueOf(work.getOne300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean one300IsNumeric()  throws CFException{
	    return work.one300IsNumeric();
	}

	/**
	 * 	Update One300 with the passed value
	 *	@param number
	 */
	public void setOne300(short number)  throws CFException{
		work.setOne300(number);
	}
	
	public void setOne300(int number)  throws CFException{
	    work.setOne300(number);
	}
	public void setOne300(long number)  throws CFException{
	    work.setOne300(number);
	}
	

	
	/**
	 * 	Update One300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setOne300(char[] value)  throws CFException {
		work.setOne300(value);
	}
	
	/**
	 * 	Update One300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOne300String(char[] value)  throws CFException{
		work.setOne300(value);
	}	

	/**
	 *	Returns the value of charA300
	 *	@return charA300
	 */
   public char[] getCharA300() throws CFException  {              
   		return work.getCharA300();
   }

  
	/**
	*  set variable charA300
	*  @param value
	**/
   public void setCharA300(char[] value) throws CFException {
      work.setCharA300(value);
   } 

	/**
	 *	Returns the value of charN300
	 *	@return charN300
	 */
   public char[] getCharN300() throws CFException  {              
   		return work.getCharN300();
   }

  
	/**
	*  set variable charN300
	*  @param value
	**/
   public void setCharN300(char[] value) throws CFException {
      work.setCharN300(value);
   } 


        public Sf326010Ctx getSf326010Ctx() {
            return Sf326010Ctx.this;
        }

        public ProcessMiplogOutCtx getProcessMiplogOutCtx() {
            return new ProcessMiplogOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001MiplogRecordGroup800.hashCode();
        str += work.hashCode();
        str += sf528ExtractZLogRec.hashCode();
        str += sf539Sf305020ControlBlock.hashCode();
       return str.hashCode();
    }

    public ProcessMiplogInCtx clone() {
        ProcessMiplogInCtx cloneObj = new ProcessMiplogInCtx();
        cloneObj.sys001MiplogRecordGroup800 = new Sys001MiplogRecordGroup800();
        cloneObj.sys001MiplogRecordGroup800.set(sys001MiplogRecordGroup800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        return cloneObj;
    }

    }

    public ProcessMiplogInCtx getProcessMiplogInCtx() {
            return new ProcessMiplogInCtx();
    }
     public class ProcessMiplogOutCtx implements Cloneable {
     Sys001MiplogRecordGroup800 sys001MiplogRecordGroup800 = Sf326010Ctx.this.getSys001MiplogRecordGroup800();
     Work work = Sf326010Ctx.this.getWork();
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf326010Ctx.this.getSf528ExtractZLogRec();
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf326010Ctx.this.getSf539Sf305020ControlBlock();

	/**
	 *	Returns the value of zLogBypass400
	 *	@return zLogBypass400
	 */
	public int getZLogBypass400() throws CFException {
   		return work.getZLogBypass400();
	}

    /**
	 *	Returns the String value of zLogBypass400
	 *	@return zLogBypass400
	 */
	public char[]  getZLogBypass400ActualString() {
		return work.getZLogBypass400ActualString();
	}

	/**
	 *	Returns String value of zLogBypass400
	 *	@return zLogBypass400
	 */
	public char[]  getZLogBypass400String() throws CFException {
	     return String.valueOf(work.getZLogBypass400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean zLogBypass400IsNumeric()  throws CFException{
	    return work.zLogBypass400IsNumeric();
	}

	/**
	 * 	Update ZLogBypass400 with the passed value
	 *	@param number
	 */
	public void setZLogBypass400(int number)  throws CFException{
		work.setZLogBypass400(number);
	}
	

	public void setZLogBypass400(long number)  throws CFException{
	    work.setZLogBypass400(number);
	}
	
	
	/**
	 * 	Update ZLogBypass400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setZLogBypass400(char[] value)  throws CFException {
		work.setZLogBypass400(value);
	}
	
	/**
	 * 	Update ZLogBypass400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setZLogBypass400String(char[] value)  throws CFException{
		work.setZLogBypass400(value);
	}	

	/**
	 *	Returns the value of sys001MiplogBoxId801
	 *	@return sys001MiplogBoxId801
	 */
   public char[] getSys001MiplogBoxId801() throws CFException  {              
   		return sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogBoxId801();
   }

  
	/**
	*  set variable sys001MiplogBoxId801
	*  @param value
	**/
   public void setSys001MiplogBoxId801(char[] value) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogBoxId801(value);
   } 

     /**
	 * 	Update Sys001MiplogBoxId801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogBoxId801(char[] source, int sourceIndex) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogBoxId801(source, sourceIndex);
   	
   }
   
   public void setSys001MiplogBoxId801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogBoxId801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001MiplogBoxId801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogBoxId801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogBoxId801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001MiplogBoxId801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogBoxId801(Field source) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogBoxId801(source);
   }  
   
     /**
	 * 	Update Sys001MiplogBoxId801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogBoxId801(Field source, int sourceIndex,int sourceLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogBoxId801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001MiplogBoxId801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogBoxId801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogBoxId801(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of sub400
	 *	@return sub400
	 */
	public short getSub400() throws CFException {        
   		return work.getSub400();
	}
	
	/**
	 * 	Update Sub400 with the passed value
	 *	@param number
	 */
	public void setSub400(short number)  throws CFException{
		work.setSub400(number);
	}

	public void setSub400(int number)  throws CFException{
		work.setSub400((short)number);
	}

	public void setSub400(long number)  throws CFException{
		work.setSub400((short)number);
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
	 *	Returns the value of sys001MiplogClass801
	 *	@return sys001MiplogClass801
	 */
   public char[] getSys001MiplogClass801() throws CFException  {              
   		return sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogClass801();
   }

  
	/**
	*  set variable sys001MiplogClass801
	*  @param value
	**/
   public void setSys001MiplogClass801(char[] value) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogClass801(value);
   } 

     /**
	 * 	Update Sys001MiplogClass801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogClass801(char[] source, int sourceIndex) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogClass801(source, sourceIndex);
   	
   }
   
   public void setSys001MiplogClass801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogClass801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001MiplogClass801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogClass801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogClass801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001MiplogClass801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogClass801(Field source) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogClass801(source);
   }  
   
     /**
	 * 	Update Sys001MiplogClass801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogClass801(Field source, int sourceIndex,int sourceLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogClass801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001MiplogClass801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogClass801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogClass801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys001MiplogTyp801
	 *	@return sys001MiplogTyp801
	 */
   public char[] getSys001MiplogTyp801() throws CFException  {              
   		return sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTyp801();
   }

  
	/**
	*  set variable sys001MiplogTyp801
	*  @param value
	**/
   public void setSys001MiplogTyp801(char[] value) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogTyp801(value);
   } 

     /**
	 * 	Update Sys001MiplogTyp801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogTyp801(char[] source, int sourceIndex) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogTyp801(source, sourceIndex);
   	
   }
   
   public void setSys001MiplogTyp801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogTyp801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001MiplogTyp801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogTyp801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogTyp801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001MiplogTyp801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogTyp801(Field source) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogTyp801(source);
   }  
   
     /**
	 * 	Update Sys001MiplogTyp801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogTyp801(Field source, int sourceIndex,int sourceLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogTyp801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001MiplogTyp801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogTyp801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogTyp801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf528LogClass
	 *	@return sf528LogClass
	 */
   public char[] getSf528LogClass() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528LogClass();
   }

  
	/**
	*  set variable sf528LogClass
	*  @param value
	**/
   public void setSf528LogClass(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528LogClass(value);
   } 

     /**
	 * 	Update Sf528LogClass 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528LogClass(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528LogClass(source, sourceIndex);
   	
   }
   
   public void setSf528LogClass(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528LogClass(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528LogClass 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528LogClass(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528LogClass(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528LogClass with another Field
	 *	@param value
	 */
   public void setSf528LogClass(Field source) {
      sf528ExtractZLogRec.setSf528LogClass(source);
   }  
   
     /**
	 * 	Update Sf528LogClass 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528LogClass(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528LogClass(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528LogClass 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528LogClass(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528LogClass(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf326010Ctx getSf326010Ctx() {
            return Sf326010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001MiplogRecordGroup800.hashCode();
        str += work.hashCode();
        str += sf528ExtractZLogRec.hashCode();
        str += sf539Sf305020ControlBlock.hashCode();
       return str.hashCode();
    }

    public ProcessMiplogOutCtx clone() {
        ProcessMiplogOutCtx cloneObj = new ProcessMiplogOutCtx();
        cloneObj.sys001MiplogRecordGroup800 = new Sys001MiplogRecordGroup800();
        cloneObj.sys001MiplogRecordGroup800.set(sys001MiplogRecordGroup800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        return cloneObj;
    }

    }

    public ProcessMiplogOutCtx getProcessMiplogOutCtx() {
            return new ProcessMiplogOutCtx();
    }
     public class ParseZlogHeadersInCtx implements Cloneable {
     Sys001MiplogRecordGroup800 sys001MiplogRecordGroup800 = Sf326010Ctx.this.getSys001MiplogRecordGroup800();
     Work work = Sf326010Ctx.this.getWork();
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf326010Ctx.this.getSf539Sf305020ControlBlock();

	/**
	 *	Returns the value of sys001MiplogRecordGroup800
	 *	@return sys001MiplogRecordGroup800
	 */   
	 public Sys001MiplogRecordGroup800 getSys001MiplogRecordGroup800() {
   	return sys001MiplogRecordGroup800;
   }


	/**
	 *	Returns the value of halfword13300
	 *	@return halfword13300
	 */
	public short getHalfword13300() throws CFException {        
   		return work.getHalfword13300();
	}
	
	/**
	 * 	Update Halfword13300 with the passed value
	 *	@param number
	 */
	public void setHalfword13300(short number)  throws CFException{
		work.setHalfword13300(number);
	}

	public void setHalfword13300(int number)  throws CFException{
		work.setHalfword13300((short)number);
	}

	public void setHalfword13300(long number)  throws CFException{
		work.setHalfword13300((short)number);
	}



	/**
	 *	Returns the value of twenty300
	 *	@return twenty300
	 */
	public short getTwenty300() throws CFException {
   		return work.getTwenty300();
	}

    /**
	 *	Returns the String value of twenty300
	 *	@return twenty300
	 */
	public char[]  getTwenty300ActualString() {
		return work.getTwenty300ActualString();
	}

	/**
	 *	Returns String value of twenty300
	 *	@return twenty300
	 */
	public char[]  getTwenty300String() throws CFException {
	     return String.valueOf(work.getTwenty300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean twenty300IsNumeric()  throws CFException{
	    return work.twenty300IsNumeric();
	}

	/**
	 * 	Update Twenty300 with the passed value
	 *	@param number
	 */
	public void setTwenty300(short number)  throws CFException{
		work.setTwenty300(number);
	}
	
	public void setTwenty300(int number)  throws CFException{
	    work.setTwenty300(number);
	}
	public void setTwenty300(long number)  throws CFException{
	    work.setTwenty300(number);
	}
	

	
	/**
	 * 	Update Twenty300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTwenty300(char[] value)  throws CFException {
		work.setTwenty300(value);
	}
	
	/**
	 * 	Update Twenty300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTwenty300String(char[] value)  throws CFException{
		work.setTwenty300(value);
	}	

	/**
	 *	Returns the value of sf539ServiceTable
	 *	@return sf539ServiceTable
	 */   
	 public Sf539ServiceTable getSf539ServiceTable(int index) {
   	return sf539Sf305020ControlBlock.getSf539ServiceTable(index);
   }

    public List<Sf539ServiceTable> getSf539ServiceTable() {
        return sf539Sf305020ControlBlock.getSf539ServiceTable();
    }
   /**
	* 	Update Sf539ServiceTable with the passed value
	*	@param value
	*/
   public void setSf539ServiceTable(int index,char[] value) throws CFException {
      sf539Sf305020ControlBlock.setSf539ServiceTable((index),value);
   }   


	/**
	 *	Returns the value of sys001Lrecl400
	 *	@return sys001Lrecl400
	 */
	public long getSys001Lrecl400() throws CFException {        
   		return work.getSys001Lrecl400();
	}
	
	/**
	 * 	Update Sys001Lrecl400 with the passed value
	 *	@param number
	 */
	public void setSys001Lrecl400(long number)  throws CFException{
		work.setSys001Lrecl400(number);
	}



	/**
	 *	Returns the value of sf305120300
	 *	@return sf305120300
	 */
   public char[] getSf305120300() throws CFException  {              
   		return work.getSf305120300();
   }

  
	/**
	*  set variable sf305120300
	*  @param value
	**/
   public void setSf305120300(char[] value) throws CFException {
      work.setSf305120300(value);
   } 

	/**
	 *	Returns the value of assert1400
	 *	@return assert1400
	 */
	public int getAssert1400() throws CFException {
   		return work.getAssert1400();
	}

    /**
	 *	Returns the String value of assert1400
	 *	@return assert1400
	 */
	public char[]  getAssert1400ActualString() {
		return work.getAssert1400ActualString();
	}

	/**
	 *	Returns String value of assert1400
	 *	@return assert1400
	 */
	public char[]  getAssert1400String() throws CFException {
	     return String.valueOf(work.getAssert1400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean assert1400IsNumeric()  throws CFException{
	    return work.assert1400IsNumeric();
	}

	/**
	 * 	Update Assert1400 with the passed value
	 *	@param number
	 */
	public void setAssert1400(int number)  throws CFException{
		work.setAssert1400(number);
	}
	

	public void setAssert1400(long number)  throws CFException{
	    work.setAssert1400(number);
	}
	
	
	/**
	 * 	Update Assert1400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAssert1400(char[] value)  throws CFException {
		work.setAssert1400(value);
	}
	
	/**
	 * 	Update Assert1400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAssert1400String(char[] value)  throws CFException{
		work.setAssert1400(value);
	}	

	/**
	 *	Returns the value of sys001MiplogRefNum801
	 *	@return sys001MiplogRefNum801
	 */
   public char[] getSys001MiplogRefNum801() throws CFException  {              
   		return sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogRefNum801();
   }

  
	/**
	*  set variable sys001MiplogRefNum801
	*  @param value
	**/
   public void setSys001MiplogRefNum801(char[] value) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogRefNum801(value);
   } 

     /**
	 * 	Update Sys001MiplogRefNum801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogRefNum801(char[] source, int sourceIndex) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogRefNum801(source, sourceIndex);
   	
   }
   
   public void setSys001MiplogRefNum801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogRefNum801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001MiplogRefNum801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogRefNum801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogRefNum801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001MiplogRefNum801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogRefNum801(Field source) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogRefNum801(source);
   }  
   
     /**
	 * 	Update Sys001MiplogRefNum801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogRefNum801(Field source, int sourceIndex,int sourceLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogRefNum801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001MiplogRefNum801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogRefNum801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogRefNum801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys001MiplogRecord800
	 *	@return sys001MiplogRecord800
	 */
   public char[] getSys001MiplogRecord800() throws CFException  {              
   		return sys001MiplogRecordGroup800.getSys001MiplogRecord800();
   }

  
	/**
	*  set variable sys001MiplogRecord800
	*  @param value
	**/
   public void setSys001MiplogRecord800(char[] value) throws CFException {
      sys001MiplogRecordGroup800.setSys001MiplogRecord800(value);
   } 

     /**
	 * 	Update Sys001MiplogRecord800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogRecord800(char[] source, int sourceIndex) throws CFException {
      sys001MiplogRecordGroup800.setSys001MiplogRecord800(source, sourceIndex);
   	
   }
   
   public void setSys001MiplogRecord800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001MiplogRecordGroup800.setSys001MiplogRecord800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001MiplogRecord800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogRecord800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.setSys001MiplogRecord800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001MiplogRecord800 with another Field
	 *	@param value
	 */
   public void setSys001MiplogRecord800(Field source) {
      sys001MiplogRecordGroup800.setSys001MiplogRecord800(source);
   }  
   
     /**
	 * 	Update Sys001MiplogRecord800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogRecord800(Field source, int sourceIndex,int sourceLen) {
      sys001MiplogRecordGroup800.setSys001MiplogRecord800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001MiplogRecord800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogRecord800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.setSys001MiplogRecord800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf539Sf305020ControlBlock
	 *	@return sf539Sf305020ControlBlock
	 */   
	 public Sf539Sf305020ControlBlock getSf539Sf305020ControlBlock() {
   	return sf539Sf305020ControlBlock;
   }



        public Sf326010Ctx getSf326010Ctx() {
            return Sf326010Ctx.this;
        }

        public ParseZlogHeadersOutCtx getParseZlogHeadersOutCtx() {
            return new ParseZlogHeadersOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001MiplogRecordGroup800.hashCode();
        str += work.hashCode();
        str += sf539Sf305020ControlBlock.hashCode();
       return str.hashCode();
    }

    public ParseZlogHeadersInCtx clone() {
        ParseZlogHeadersInCtx cloneObj = new ParseZlogHeadersInCtx();
        cloneObj.sys001MiplogRecordGroup800 = new Sys001MiplogRecordGroup800();
        cloneObj.sys001MiplogRecordGroup800.set(sys001MiplogRecordGroup800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        return cloneObj;
    }

    }

    public ParseZlogHeadersInCtx getParseZlogHeadersInCtx() {
            return new ParseZlogHeadersInCtx();
    }
     public class ParseZlogHeadersOutCtx implements Cloneable {
     Sys001MiplogRecordGroup800 sys001MiplogRecordGroup800 = Sf326010Ctx.this.getSys001MiplogRecordGroup800();
     Work work = Sf326010Ctx.this.getWork();
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf326010Ctx.this.getSf539Sf305020ControlBlock();

	/**
	 *	Returns the value of sf539ZlogRecordPtr
	 *	@return sf539ZlogRecordPtr
	 */
	public int getSf539ZlogRecordPtr() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539ZlogRecordPtr();
	}
	
	/**
	 * 	Update Sf539ZlogRecordPtr with the passed value
	 *	@param number
	 */
	public void setSf539ZlogRecordPtr(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539ZlogRecordPtr(number);
	}


	public void setSf539ZlogRecordPtr(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539ZlogRecordPtr((int)number);
	}


	/**
	 *	Returns the value of sf539ZlogRecordLnth
	 *	@return sf539ZlogRecordLnth
	 */
	public int getSf539ZlogRecordLnth() throws CFException {        
   		return sf539Sf305020ControlBlock.getSf539ZlogRecordLnth();
	}
	
	/**
	 * 	Update Sf539ZlogRecordLnth with the passed value
	 *	@param number
	 */
	public void setSf539ZlogRecordLnth(int number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539ZlogRecordLnth(number);
	}


	public void setSf539ZlogRecordLnth(long number)  throws CFException{
		sf539Sf305020ControlBlock.setSf539ZlogRecordLnth((int)number);
	}


	/**
	 *	Returns the value of assert1400
	 *	@return assert1400
	 */
	public int getAssert1400() throws CFException {
   		return work.getAssert1400();
	}

    /**
	 *	Returns the String value of assert1400
	 *	@return assert1400
	 */
	public char[]  getAssert1400ActualString() {
		return work.getAssert1400ActualString();
	}

	/**
	 *	Returns String value of assert1400
	 *	@return assert1400
	 */
	public char[]  getAssert1400String() throws CFException {
	     return String.valueOf(work.getAssert1400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean assert1400IsNumeric()  throws CFException{
	    return work.assert1400IsNumeric();
	}

	/**
	 * 	Update Assert1400 with the passed value
	 *	@param number
	 */
	public void setAssert1400(int number)  throws CFException{
		work.setAssert1400(number);
	}
	

	public void setAssert1400(long number)  throws CFException{
	    work.setAssert1400(number);
	}
	
	
	/**
	 * 	Update Assert1400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAssert1400(char[] value)  throws CFException {
		work.setAssert1400(value);
	}
	
	/**
	 * 	Update Assert1400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAssert1400String(char[] value)  throws CFException{
		work.setAssert1400(value);
	}	

	/**
	 *	Returns the value of sf539Sf305020ControlBlock
	 *	@return sf539Sf305020ControlBlock
	 */   
	 public Sf539Sf305020ControlBlock getSf539Sf305020ControlBlock() {
   	return sf539Sf305020ControlBlock;
   }



        public Sf326010Ctx getSf326010Ctx() {
            return Sf326010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001MiplogRecordGroup800.hashCode();
        str += work.hashCode();
        str += sf539Sf305020ControlBlock.hashCode();
       return str.hashCode();
    }

    public ParseZlogHeadersOutCtx clone() {
        ParseZlogHeadersOutCtx cloneObj = new ParseZlogHeadersOutCtx();
        cloneObj.sys001MiplogRecordGroup800 = new Sys001MiplogRecordGroup800();
        cloneObj.sys001MiplogRecordGroup800.set(sys001MiplogRecordGroup800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        return cloneObj;
    }

    }

    public ParseZlogHeadersOutCtx getParseZlogHeadersOutCtx() {
            return new ParseZlogHeadersOutCtx();
    }
     public class WriteSys201ZlogRecInCtx implements Cloneable {
     Work work = Sf326010Ctx.this.getWork();
     Sys201ZLogRec sys201ZLogRec = Sf326010Ctx.this.getSys201ZLogRec();
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf326010Ctx.this.getSf528ExtractZLogRec();
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf326010Ctx.this.getSf539Sf305020ControlBlock();

	/**
	 *	Returns the value of sf539ServiceCode
	 *	@return sf539ServiceCode
	 */
   public char[] getSf539ServiceCode(int index) throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceCode();
   }

  
	/**
	*  set variable sf539ServiceCode
	*  @param value
	**/
   public void setSf539ServiceCode(int index,char[] value) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(value);
   } 

     /**
	 * 	Update Sf539ServiceCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex);
   	
   }
   
   public void setSf539ServiceCode(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539ServiceCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539ServiceCode with another Field
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,Field source) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source);
   }  
   
     /**
	 * 	Update Sf539ServiceCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539ServiceCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of sub400
	 *	@return sub400
	 */
	public short getSub400() throws CFException {        
   		return work.getSub400();
	}
	
	/**
	 * 	Update Sub400 with the passed value
	 *	@param number
	 */
	public void setSub400(short number)  throws CFException{
		work.setSub400(number);
	}

	public void setSub400(int number)  throws CFException{
		work.setSub400((short)number);
	}

	public void setSub400(long number)  throws CFException{
		work.setSub400((short)number);
	}



	/**
	 *	Returns the value of sf539ServiceStatus
	 *	@return sf539ServiceStatus
	 */
   public char[] getSf539ServiceStatus(int index) throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceStatus();
   }

  
	/**
	*  set variable sf539ServiceStatus
	*  @param value
	**/
   public void setSf539ServiceStatus(int index,char[] value) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(value);
   } 

     /**
	 * 	Update Sf539ServiceStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceStatus(int index,char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source, sourceIndex);
   	
   }
   
   public void setSf539ServiceStatus(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539ServiceStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceStatus(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539ServiceStatus with another Field
	 *	@param value
	 */
   public void setSf539ServiceStatus(int index,Field source) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source);
   }  
   
     /**
	 * 	Update Sf539ServiceStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceStatus(int index,Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539ServiceStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceStatus(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys201ZLogRec
	 *	@return sys201ZLogRec
	 */   
	 public Sys201ZLogRec getSys201ZLogRec() {
   	return sys201ZLogRec;
   }


	/**
	 *	Returns the value of zLogCnt400
	 *	@return zLogCnt400
	 */
	public int getZLogCnt400() throws CFException {
   		return work.getZLogCnt400();
	}

    /**
	 *	Returns the String value of zLogCnt400
	 *	@return zLogCnt400
	 */
	public char[]  getZLogCnt400ActualString() {
		return work.getZLogCnt400ActualString();
	}

	/**
	 *	Returns String value of zLogCnt400
	 *	@return zLogCnt400
	 */
	public char[]  getZLogCnt400String() throws CFException {
	     return String.valueOf(work.getZLogCnt400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean zLogCnt400IsNumeric()  throws CFException{
	    return work.zLogCnt400IsNumeric();
	}

	/**
	 * 	Update ZLogCnt400 with the passed value
	 *	@param number
	 */
	public void setZLogCnt400(int number)  throws CFException{
		work.setZLogCnt400(number);
	}
	

	public void setZLogCnt400(long number)  throws CFException{
	    work.setZLogCnt400(number);
	}
	
	
	/**
	 * 	Update ZLogCnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setZLogCnt400(char[] value)  throws CFException {
		work.setZLogCnt400(value);
	}
	
	/**
	 * 	Update ZLogCnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setZLogCnt400String(char[] value)  throws CFException{
		work.setZLogCnt400(value);
	}	

	/**
	 *	Returns the value of sf528ExtractZLogRec
	 *	@return sf528ExtractZLogRec
	 */   
	 public Sf528ExtractZLogRec getSf528ExtractZLogRec() {
   	return sf528ExtractZLogRec;
   }


	/**
	 *	Returns the value of one300
	 *	@return one300
	 */
	public short getOne300() throws CFException {
   		return work.getOne300();
	}

    /**
	 *	Returns the String value of one300
	 *	@return one300
	 */
	public char[]  getOne300ActualString() {
		return work.getOne300ActualString();
	}

	/**
	 *	Returns String value of one300
	 *	@return one300
	 */
	public char[]  getOne300String() throws CFException {
	     return String.valueOf(work.getOne300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean one300IsNumeric()  throws CFException{
	    return work.one300IsNumeric();
	}

	/**
	 * 	Update One300 with the passed value
	 *	@param number
	 */
	public void setOne300(short number)  throws CFException{
		work.setOne300(number);
	}
	
	public void setOne300(int number)  throws CFException{
	    work.setOne300(number);
	}
	public void setOne300(long number)  throws CFException{
	    work.setOne300(number);
	}
	

	
	/**
	 * 	Update One300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setOne300(char[] value)  throws CFException {
		work.setOne300(value);
	}
	
	/**
	 * 	Update One300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOne300String(char[] value)  throws CFException{
		work.setOne300(value);
	}	

	/**
	 *	Returns the value of charE300
	 *	@return charE300
	 */
   public char[] getCharE300() throws CFException  {              
   		return work.getCharE300();
   }

  
	/**
	*  set variable charE300
	*  @param value
	**/
   public void setCharE300(char[] value) throws CFException {
      work.setCharE300(value);
   } 


        public Sf326010Ctx getSf326010Ctx() {
            return Sf326010Ctx.this;
        }

        public WriteSys201ZlogRecOutCtx getWriteSys201ZlogRecOutCtx() {
            return new WriteSys201ZlogRecOutCtx();
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
        str += sys201ZLogRec.hashCode();
        str += sf528ExtractZLogRec.hashCode();
        str += sf539Sf305020ControlBlock.hashCode();
       return str.hashCode();
    }

    public WriteSys201ZlogRecInCtx clone() {
        WriteSys201ZlogRecInCtx cloneObj = new WriteSys201ZlogRecInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys201ZLogRec = new Sys201ZLogRec();
        cloneObj.sys201ZLogRec.set(sys201ZLogRec.getClonedField());
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        return cloneObj;
    }

    }

    public WriteSys201ZlogRecInCtx getWriteSys201ZlogRecInCtx() {
            return new WriteSys201ZlogRecInCtx();
    }
     public class WriteSys201ZlogRecOutCtx implements Cloneable {
     Work work = Sf326010Ctx.this.getWork();
     Sys201ZLogRec sys201ZLogRec = Sf326010Ctx.this.getSys201ZLogRec();
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf326010Ctx.this.getSf528ExtractZLogRec();
     Sf539Sf305020ControlBlock sf539Sf305020ControlBlock = Sf326010Ctx.this.getSf539Sf305020ControlBlock();

	/**
	 *	Returns the value of sf539ServiceCode
	 *	@return sf539ServiceCode
	 */
   public char[] getSf539ServiceCode(int index) throws CFException  {              
   		return sf539Sf305020ControlBlock.getSf539ServiceTable(index).getSf539ServiceCode();
   }

  
	/**
	*  set variable sf539ServiceCode
	*  @param value
	**/
   public void setSf539ServiceCode(int index,char[] value) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(value);
   } 

     /**
	 * 	Update Sf539ServiceCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,char[] source, int sourceIndex) throws CFException {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex);
   	
   }
   
   public void setSf539ServiceCode(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf539ServiceCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf539ServiceCode with another Field
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,Field source) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source);
   }  
   
     /**
	 * 	Update Sf539ServiceCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,Field source, int sourceIndex,int sourceLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf539ServiceCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf539ServiceCode(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf539Sf305020ControlBlock.getSf539ServiceTable(index).setSf539ServiceCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of sys201ZLogRec
	 *	@return sys201ZLogRec
	 */   
	 public Sys201ZLogRec getSys201ZLogRec() {
   	return sys201ZLogRec;
   }


	/**
	 *	Returns the value of zLogCnt400
	 *	@return zLogCnt400
	 */
	public int getZLogCnt400() throws CFException {
   		return work.getZLogCnt400();
	}

    /**
	 *	Returns the String value of zLogCnt400
	 *	@return zLogCnt400
	 */
	public char[]  getZLogCnt400ActualString() {
		return work.getZLogCnt400ActualString();
	}

	/**
	 *	Returns String value of zLogCnt400
	 *	@return zLogCnt400
	 */
	public char[]  getZLogCnt400String() throws CFException {
	     return String.valueOf(work.getZLogCnt400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean zLogCnt400IsNumeric()  throws CFException{
	    return work.zLogCnt400IsNumeric();
	}

	/**
	 * 	Update ZLogCnt400 with the passed value
	 *	@param number
	 */
	public void setZLogCnt400(int number)  throws CFException{
		work.setZLogCnt400(number);
	}
	

	public void setZLogCnt400(long number)  throws CFException{
	    work.setZLogCnt400(number);
	}
	
	
	/**
	 * 	Update ZLogCnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setZLogCnt400(char[] value)  throws CFException {
		work.setZLogCnt400(value);
	}
	
	/**
	 * 	Update ZLogCnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setZLogCnt400String(char[] value)  throws CFException{
		work.setZLogCnt400(value);
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
	 *	Returns the value of charE300
	 *	@return charE300
	 */
   public char[] getCharE300() throws CFException  {              
   		return work.getCharE300();
   }

  
	/**
	*  set variable charE300
	*  @param value
	**/
   public void setCharE300(char[] value) throws CFException {
      work.setCharE300(value);
   } 


        public Sf326010Ctx getSf326010Ctx() {
            return Sf326010Ctx.this;
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
        str += sys201ZLogRec.hashCode();
        str += sf528ExtractZLogRec.hashCode();
        str += sf539Sf305020ControlBlock.hashCode();
       return str.hashCode();
    }

    public WriteSys201ZlogRecOutCtx clone() {
        WriteSys201ZlogRecOutCtx cloneObj = new WriteSys201ZlogRecOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys201ZLogRec = new Sys201ZLogRec();
        cloneObj.sys201ZLogRec.set(sys201ZLogRec.getClonedField());
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        cloneObj.sf539Sf305020ControlBlock = new Sf539Sf305020ControlBlock();
        cloneObj.sf539Sf305020ControlBlock.set(sf539Sf305020ControlBlock.getClonedField());
        return cloneObj;
    }

    }

    public WriteSys201ZlogRecOutCtx getWriteSys201ZlogRecOutCtx() {
            return new WriteSys201ZlogRecOutCtx();
    }
     public class BuildPDateTimeInCtx implements Cloneable {
     BinDecoderGroup800 binDecoderGroup800 = Sf326010Ctx.this.getBinDecoderGroup800();
     Sys001MiplogRecordGroup800 sys001MiplogRecordGroup800 = Sf326010Ctx.this.getSys001MiplogRecordGroup800();
     Work work = Sf326010Ctx.this.getWork();
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf326010Ctx.this.getSf528ExtractZLogRec();
     X86Int32Group800 x86Int32Group800 = Sf326010Ctx.this.getX86Int32Group800();
     Z9Int32Group800 z9Int32Group800 = Sf326010Ctx.this.getZ9Int32Group800();

	/**
	 *	Returns the value of sys001MiplogTimeMm801
	 *	@return sys001MiplogTimeMm801
	 */
   public char[] getSys001MiplogTimeMm801() throws CFException  {              
   		return sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().getSys001MiplogTimeMm801();
   }

  
	/**
	*  set variable sys001MiplogTimeMm801
	*  @param value
	**/
   public void setSys001MiplogTimeMm801(char[] value) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeMm801(value);
   } 

     /**
	 * 	Update Sys001MiplogTimeMm801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogTimeMm801(char[] source, int sourceIndex) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeMm801(source, sourceIndex);
   	
   }
   
   public void setSys001MiplogTimeMm801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeMm801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001MiplogTimeMm801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogTimeMm801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeMm801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001MiplogTimeMm801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogTimeMm801(Field source) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeMm801(source);
   }  
   
     /**
	 * 	Update Sys001MiplogTimeMm801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogTimeMm801(Field source, int sourceIndex,int sourceLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeMm801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001MiplogTimeMm801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogTimeMm801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeMm801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys001MiplogDateYy801
	 *	@return sys001MiplogDateYy801
	 */
   public char[] getSys001MiplogDateYy801() throws CFException  {              
   		return sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().getSys001MiplogDateYy801();
   }

  
	/**
	*  set variable sys001MiplogDateYy801
	*  @param value
	**/
   public void setSys001MiplogDateYy801(char[] value) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateYy801(value);
   } 

     /**
	 * 	Update Sys001MiplogDateYy801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogDateYy801(char[] source, int sourceIndex) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateYy801(source, sourceIndex);
   	
   }
   
   public void setSys001MiplogDateYy801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateYy801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001MiplogDateYy801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogDateYy801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateYy801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001MiplogDateYy801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogDateYy801(Field source) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateYy801(source);
   }  
   
     /**
	 * 	Update Sys001MiplogDateYy801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogDateYy801(Field source, int sourceIndex,int sourceLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateYy801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001MiplogDateYy801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogDateYy801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateYy801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys001MiplogElaTimX801
	 *	@return sys001MiplogElaTimX801
	 */
   public char[] getSys001MiplogElaTimX801() throws CFException  {              
   		return sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogElaTimX801();
   }

  
	/**
	*  set variable sys001MiplogElaTimX801
	*  @param value
	**/
   public void setSys001MiplogElaTimX801(char[] value) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogElaTimX801(value);
   } 

     /**
	 * 	Update Sys001MiplogElaTimX801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogElaTimX801(char[] source, int sourceIndex) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogElaTimX801(source, sourceIndex);
   	
   }
   
   public void setSys001MiplogElaTimX801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogElaTimX801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001MiplogElaTimX801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogElaTimX801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogElaTimX801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001MiplogElaTimX801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogElaTimX801(Field source) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogElaTimX801(source);
   }  
   
     /**
	 * 	Update Sys001MiplogElaTimX801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogElaTimX801(Field source, int sourceIndex,int sourceLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogElaTimX801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001MiplogElaTimX801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogElaTimX801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogElaTimX801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of z9Int32800
	 *	@return z9Int32800
	 */
	public int getZ9Int32800() throws CFException {        
   		return z9Int32Group800.getZ9Int32800();
	}
	
	/**
	 * 	Update Z9Int32800 with the passed value
	 *	@param number
	 */
	public void setZ9Int32800(int number)  throws CFException{
		z9Int32Group800.setZ9Int32800(number);
	}


	public void setZ9Int32800(long number)  throws CFException{
		z9Int32Group800.setZ9Int32800((int)number);
	}


	/**
	 *	Returns the value of twenty300
	 *	@return twenty300
	 */
	public short getTwenty300() throws CFException {
   		return work.getTwenty300();
	}

    /**
	 *	Returns the String value of twenty300
	 *	@return twenty300
	 */
	public char[]  getTwenty300ActualString() {
		return work.getTwenty300ActualString();
	}

	/**
	 *	Returns String value of twenty300
	 *	@return twenty300
	 */
	public char[]  getTwenty300String() throws CFException {
	     return String.valueOf(work.getTwenty300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean twenty300IsNumeric()  throws CFException{
	    return work.twenty300IsNumeric();
	}

	/**
	 * 	Update Twenty300 with the passed value
	 *	@param number
	 */
	public void setTwenty300(short number)  throws CFException{
		work.setTwenty300(number);
	}
	
	public void setTwenty300(int number)  throws CFException{
	    work.setTwenty300(number);
	}
	public void setTwenty300(long number)  throws CFException{
	    work.setTwenty300(number);
	}
	

	
	/**
	 * 	Update Twenty300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTwenty300(char[] value)  throws CFException {
		work.setTwenty300(value);
	}
	
	/**
	 * 	Update Twenty300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTwenty300String(char[] value)  throws CFException{
		work.setTwenty300(value);
	}	

	/**
	 *	Returns the value of sys001MiplogDateMm801
	 *	@return sys001MiplogDateMm801
	 */
   public char[] getSys001MiplogDateMm801() throws CFException  {              
   		return sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().getSys001MiplogDateMm801();
   }

  
	/**
	*  set variable sys001MiplogDateMm801
	*  @param value
	**/
   public void setSys001MiplogDateMm801(char[] value) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateMm801(value);
   } 

     /**
	 * 	Update Sys001MiplogDateMm801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogDateMm801(char[] source, int sourceIndex) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateMm801(source, sourceIndex);
   	
   }
   
   public void setSys001MiplogDateMm801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateMm801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001MiplogDateMm801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogDateMm801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateMm801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001MiplogDateMm801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogDateMm801(Field source) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateMm801(source);
   }  
   
     /**
	 * 	Update Sys001MiplogDateMm801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogDateMm801(Field source, int sourceIndex,int sourceLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateMm801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001MiplogDateMm801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogDateMm801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateMm801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys001MiplogDateDd801
	 *	@return sys001MiplogDateDd801
	 */
   public char[] getSys001MiplogDateDd801() throws CFException  {              
   		return sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().getSys001MiplogDateDd801();
   }

  
	/**
	*  set variable sys001MiplogDateDd801
	*  @param value
	**/
   public void setSys001MiplogDateDd801(char[] value) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateDd801(value);
   } 

     /**
	 * 	Update Sys001MiplogDateDd801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogDateDd801(char[] source, int sourceIndex) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateDd801(source, sourceIndex);
   	
   }
   
   public void setSys001MiplogDateDd801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateDd801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001MiplogDateDd801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogDateDd801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateDd801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001MiplogDateDd801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogDateDd801(Field source) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateDd801(source);
   }  
   
     /**
	 * 	Update Sys001MiplogDateDd801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogDateDd801(Field source, int sourceIndex,int sourceLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateDd801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001MiplogDateDd801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogDateDd801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateDd801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys001MiplogTimeHh801
	 *	@return sys001MiplogTimeHh801
	 */
   public char[] getSys001MiplogTimeHh801() throws CFException  {              
   		return sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().getSys001MiplogTimeHh801();
   }

  
	/**
	*  set variable sys001MiplogTimeHh801
	*  @param value
	**/
   public void setSys001MiplogTimeHh801(char[] value) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeHh801(value);
   } 

     /**
	 * 	Update Sys001MiplogTimeHh801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogTimeHh801(char[] source, int sourceIndex) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeHh801(source, sourceIndex);
   	
   }
   
   public void setSys001MiplogTimeHh801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeHh801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001MiplogTimeHh801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogTimeHh801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeHh801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001MiplogTimeHh801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogTimeHh801(Field source) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeHh801(source);
   }  
   
     /**
	 * 	Update Sys001MiplogTimeHh801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogTimeHh801(Field source, int sourceIndex,int sourceLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeHh801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001MiplogTimeHh801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogTimeHh801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeHh801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys001MiplogRefNum801
	 *	@return sys001MiplogRefNum801
	 */
   public char[] getSys001MiplogRefNum801() throws CFException  {              
   		return sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogRefNum801();
   }

  
	/**
	*  set variable sys001MiplogRefNum801
	*  @param value
	**/
   public void setSys001MiplogRefNum801(char[] value) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogRefNum801(value);
   } 

     /**
	 * 	Update Sys001MiplogRefNum801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogRefNum801(char[] source, int sourceIndex) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogRefNum801(source, sourceIndex);
   	
   }
   
   public void setSys001MiplogRefNum801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogRefNum801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001MiplogRefNum801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogRefNum801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogRefNum801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001MiplogRefNum801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogRefNum801(Field source) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogRefNum801(source);
   }  
   
     /**
	 * 	Update Sys001MiplogRefNum801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogRefNum801(Field source, int sourceIndex,int sourceLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogRefNum801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001MiplogRefNum801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogRefNum801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogRefNum801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys001MiplogTimeSs801
	 *	@return sys001MiplogTimeSs801
	 */
   public char[] getSys001MiplogTimeSs801() throws CFException  {              
   		return sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().getSys001MiplogTimeSs801();
   }

  
	/**
	*  set variable sys001MiplogTimeSs801
	*  @param value
	**/
   public void setSys001MiplogTimeSs801(char[] value) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeSs801(value);
   } 

     /**
	 * 	Update Sys001MiplogTimeSs801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogTimeSs801(char[] source, int sourceIndex) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeSs801(source, sourceIndex);
   	
   }
   
   public void setSys001MiplogTimeSs801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeSs801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001MiplogTimeSs801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogTimeSs801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeSs801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001MiplogTimeSs801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogTimeSs801(Field source) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeSs801(source);
   }  
   
     /**
	 * 	Update Sys001MiplogTimeSs801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogTimeSs801(Field source, int sourceIndex,int sourceLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeSs801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001MiplogTimeSs801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogTimeSs801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeSs801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf326010Ctx getSf326010Ctx() {
            return Sf326010Ctx.this;
        }

        public BuildPDateTimeOutCtx getBuildPDateTimeOutCtx() {
            return new BuildPDateTimeOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += binDecoderGroup800.hashCode();
        str += sys001MiplogRecordGroup800.hashCode();
        str += work.hashCode();
        str += sf528ExtractZLogRec.hashCode();
        str += x86Int32Group800.hashCode();
        str += z9Int32Group800.hashCode();
       return str.hashCode();
    }

    public BuildPDateTimeInCtx clone() {
        BuildPDateTimeInCtx cloneObj = new BuildPDateTimeInCtx();
        cloneObj.binDecoderGroup800 = new BinDecoderGroup800();
        cloneObj.binDecoderGroup800.set(binDecoderGroup800.getClonedField());
        cloneObj.sys001MiplogRecordGroup800 = new Sys001MiplogRecordGroup800();
        cloneObj.sys001MiplogRecordGroup800.set(sys001MiplogRecordGroup800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        cloneObj.x86Int32Group800 = new X86Int32Group800();
        cloneObj.x86Int32Group800.set(x86Int32Group800.getClonedField());
        cloneObj.z9Int32Group800 = new Z9Int32Group800();
        cloneObj.z9Int32Group800.set(z9Int32Group800.getClonedField());
        return cloneObj;
    }

    }

    public BuildPDateTimeInCtx getBuildPDateTimeInCtx() {
            return new BuildPDateTimeInCtx();
    }
     public class BuildPDateTimeOutCtx implements Cloneable {
     BinDecoderGroup800 binDecoderGroup800 = Sf326010Ctx.this.getBinDecoderGroup800();
     Sys001MiplogRecordGroup800 sys001MiplogRecordGroup800 = Sf326010Ctx.this.getSys001MiplogRecordGroup800();
     Work work = Sf326010Ctx.this.getWork();
     Sf528ExtractZLogRec sf528ExtractZLogRec = Sf326010Ctx.this.getSf528ExtractZLogRec();
     X86Int32Group800 x86Int32Group800 = Sf326010Ctx.this.getX86Int32Group800();
     Z9Int32Group800 z9Int32Group800 = Sf326010Ctx.this.getZ9Int32Group800();

	/**
	 *	Returns the value of sf528ServiceMn
	 *	@return sf528ServiceMn
	 */
   public char[] getSf528ServiceMn() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceTime().getSf528ServiceMn();
   }

  
	/**
	*  set variable sf528ServiceMn
	*  @param value
	**/
   public void setSf528ServiceMn(char[] value) throws CFException {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceTime().setSf528ServiceMn(value);
   } 

     /**
	 * 	Update Sf528ServiceMn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceMn(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceTime().setSf528ServiceMn(source, sourceIndex);
   	
   }
   
   public void setSf528ServiceMn(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceTime().setSf528ServiceMn(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServiceMn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceMn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceTime().setSf528ServiceMn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServiceMn with another Field
	 *	@param value
	 */
   public void setSf528ServiceMn(Field source) {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceTime().setSf528ServiceMn(source);
   }  
   
     /**
	 * 	Update Sf528ServiceMn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceMn(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceTime().setSf528ServiceMn(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServiceMn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceMn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceTime().setSf528ServiceMn(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of x86Int32B4800
	 *	@return x86Int32B4800
	 */
   public char[] getX86Int32B4800() throws CFException  {              
   		return x86Int32Group800.getX86Int32X800().getX86Int32B4800();
   }

  
	/**
	*  set variable x86Int32B4800
	*  @param value
	**/
   public void setX86Int32B4800(char[] value) throws CFException {
      x86Int32Group800.getX86Int32X800().setX86Int32B4800(value);
   } 

     /**
	 * 	Update X86Int32B4800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX86Int32B4800(char[] source, int sourceIndex) throws CFException {
      x86Int32Group800.getX86Int32X800().setX86Int32B4800(source, sourceIndex);
   	
   }
   
   public void setX86Int32B4800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      x86Int32Group800.getX86Int32X800().setX86Int32B4800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update X86Int32B4800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32B4800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      x86Int32Group800.getX86Int32X800().setX86Int32B4800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update X86Int32B4800 with another Field
	 *	@param value
	 */
   public void setX86Int32B4800(Field source) {
      x86Int32Group800.getX86Int32X800().setX86Int32B4800(source);
   }  
   
     /**
	 * 	Update X86Int32B4800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX86Int32B4800(Field source, int sourceIndex,int sourceLen) {
      x86Int32Group800.getX86Int32X800().setX86Int32B4800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update X86Int32B4800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32B4800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      x86Int32Group800.getX86Int32X800().setX86Int32B4800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tranlogDateCc800
	 *	@return tranlogDateCc800
	 */
	public int getTranlogDateCc800() throws CFException {
   		return work.getTranlogDateCc800();
	}


	/**
	 *	Returns String value of tranlogDateCc800
	 *	@return tranlogDateCc800
	 */
	public char[]  getTranlogDateCc800String() throws CFException {
	     return String.valueOf(work.getTranlogDateCc800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranlogDateCc800IsNumeric()  throws CFException{
	    return work.tranlogDateCc800IsNumeric();
	}

	/**
	 * 	Update TranlogDateCc800 with the passed value
	 *	@param number
	 */
	public void setTranlogDateCc800(int number)  throws CFException{
		work.setTranlogDateCc800(number);
	}
	

	public void setTranlogDateCc800(long number)  throws CFException{
	    work.setTranlogDateCc800(number);
	}
	
	
	/**
	 * 	Update TranlogDateCc800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranlogDateCc800(char[] value)  throws CFException {
		work.setTranlogDateCc800(value);
	}
	
	/**
	 * 	Update TranlogDateCc800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranlogDateCc800String(char[] value)  throws CFException{
		work.setTranlogDateCc800(value);
	}	

	/**
	 *	Returns the value of sys001MiplogDateMm801
	 *	@return sys001MiplogDateMm801
	 */
   public char[] getSys001MiplogDateMm801() throws CFException  {              
   		return sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().getSys001MiplogDateMm801();
   }

  
	/**
	*  set variable sys001MiplogDateMm801
	*  @param value
	**/
   public void setSys001MiplogDateMm801(char[] value) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateMm801(value);
   } 

     /**
	 * 	Update Sys001MiplogDateMm801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogDateMm801(char[] source, int sourceIndex) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateMm801(source, sourceIndex);
   	
   }
   
   public void setSys001MiplogDateMm801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateMm801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001MiplogDateMm801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogDateMm801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateMm801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001MiplogDateMm801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogDateMm801(Field source) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateMm801(source);
   }  
   
     /**
	 * 	Update Sys001MiplogDateMm801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogDateMm801(Field source, int sourceIndex,int sourceLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateMm801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001MiplogDateMm801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogDateMm801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateMm801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys001MiplogDateDd801
	 *	@return sys001MiplogDateDd801
	 */
   public char[] getSys001MiplogDateDd801() throws CFException  {              
   		return sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().getSys001MiplogDateDd801();
   }

  
	/**
	*  set variable sys001MiplogDateDd801
	*  @param value
	**/
   public void setSys001MiplogDateDd801(char[] value) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateDd801(value);
   } 

     /**
	 * 	Update Sys001MiplogDateDd801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogDateDd801(char[] source, int sourceIndex) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateDd801(source, sourceIndex);
   	
   }
   
   public void setSys001MiplogDateDd801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateDd801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001MiplogDateDd801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogDateDd801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateDd801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001MiplogDateDd801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogDateDd801(Field source) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateDd801(source);
   }  
   
     /**
	 * 	Update Sys001MiplogDateDd801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogDateDd801(Field source, int sourceIndex,int sourceLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateDd801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001MiplogDateDd801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogDateDd801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateDd801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tranlogDateDd800
	 *	@return tranlogDateDd800
	 */
	public int getTranlogDateDd800() throws CFException {
   		return work.getTranlogDateDd800();
	}


	/**
	 *	Returns String value of tranlogDateDd800
	 *	@return tranlogDateDd800
	 */
	public char[]  getTranlogDateDd800String() throws CFException {
	     return String.valueOf(work.getTranlogDateDd800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranlogDateDd800IsNumeric()  throws CFException{
	    return work.tranlogDateDd800IsNumeric();
	}

	/**
	 * 	Update TranlogDateDd800 with the passed value
	 *	@param number
	 */
	public void setTranlogDateDd800(int number)  throws CFException{
		work.setTranlogDateDd800(number);
	}
	

	public void setTranlogDateDd800(long number)  throws CFException{
	    work.setTranlogDateDd800(number);
	}
	
	
	/**
	 * 	Update TranlogDateDd800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranlogDateDd800(char[] value)  throws CFException {
		work.setTranlogDateDd800(value);
	}
	
	/**
	 * 	Update TranlogDateDd800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranlogDateDd800String(char[] value)  throws CFException{
		work.setTranlogDateDd800(value);
	}	

	/**
	 *	Returns the value of sf528ServiceMm
	 *	@return sf528ServiceMm
	 */
   public char[] getSf528ServiceMm() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().getSf528ServiceMm();
   }

  
	/**
	*  set variable sf528ServiceMm
	*  @param value
	**/
   public void setSf528ServiceMm(char[] value) throws CFException {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().setSf528ServiceMm(value);
   } 

     /**
	 * 	Update Sf528ServiceMm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceMm(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().setSf528ServiceMm(source, sourceIndex);
   	
   }
   
   public void setSf528ServiceMm(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().setSf528ServiceMm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServiceMm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().setSf528ServiceMm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServiceMm with another Field
	 *	@param value
	 */
   public void setSf528ServiceMm(Field source) {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().setSf528ServiceMm(source);
   }  
   
     /**
	 * 	Update Sf528ServiceMm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceMm(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().setSf528ServiceMm(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServiceMm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().setSf528ServiceMm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf528ServiceDd
	 *	@return sf528ServiceDd
	 */
   public char[] getSf528ServiceDd() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().getSf528ServiceDd();
   }

  
	/**
	*  set variable sf528ServiceDd
	*  @param value
	**/
   public void setSf528ServiceDd(char[] value) throws CFException {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().setSf528ServiceDd(value);
   } 

     /**
	 * 	Update Sf528ServiceDd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceDd(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().setSf528ServiceDd(source, sourceIndex);
   	
   }
   
   public void setSf528ServiceDd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().setSf528ServiceDd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServiceDd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().setSf528ServiceDd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServiceDd with another Field
	 *	@param value
	 */
   public void setSf528ServiceDd(Field source) {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().setSf528ServiceDd(source);
   }  
   
     /**
	 * 	Update Sf528ServiceDd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceDd(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().setSf528ServiceDd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServiceDd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().setSf528ServiceDd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of x86Int32X800
	 *	@return x86Int32X800
	 */   
	 public X86Int32X800 getX86Int32X800() {
   	return x86Int32Group800.getX86Int32X800();
   }

   /**
	* 	Update X86Int32X800 with the passed value
	*	@param value
	*/
   public void setX86Int32X800(char[] value) throws CFException {
      x86Int32Group800.setX86Int32X800(value);
   }   

     /**
	 * 	Update X86Int32X800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX86Int32X800(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	x86Int32Group800.setX86Int32X800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update X86Int32X800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32X800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	x86Int32Group800.setX86Int32X800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update X86Int32X800 with another Field
	 *	@param value
	 */
   public void setX86Int32X800(Field source) {
   	x86Int32Group800.setX86Int32X800(source);
   }  
   
     /**
	 * 	Update X86Int32X800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX86Int32X800(Field source, int sourceIndex,int sourceLen) {
   	x86Int32Group800.setX86Int32X800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update X86Int32X800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32X800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	x86Int32Group800.setX86Int32X800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tranlogDateMm800
	 *	@return tranlogDateMm800
	 */
	public int getTranlogDateMm800() throws CFException {
   		return work.getTranlogDateMm800();
	}


	/**
	 *	Returns String value of tranlogDateMm800
	 *	@return tranlogDateMm800
	 */
	public char[]  getTranlogDateMm800String() throws CFException {
	     return String.valueOf(work.getTranlogDateMm800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranlogDateMm800IsNumeric()  throws CFException{
	    return work.tranlogDateMm800IsNumeric();
	}

	/**
	 * 	Update TranlogDateMm800 with the passed value
	 *	@param number
	 */
	public void setTranlogDateMm800(int number)  throws CFException{
		work.setTranlogDateMm800(number);
	}
	

	public void setTranlogDateMm800(long number)  throws CFException{
	    work.setTranlogDateMm800(number);
	}
	
	
	/**
	 * 	Update TranlogDateMm800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranlogDateMm800(char[] value)  throws CFException {
		work.setTranlogDateMm800(value);
	}
	
	/**
	 * 	Update TranlogDateMm800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranlogDateMm800String(char[] value)  throws CFException{
		work.setTranlogDateMm800(value);
	}	

	/**
	 *	Returns the value of sys001MiplogTimeHh801
	 *	@return sys001MiplogTimeHh801
	 */
   public char[] getSys001MiplogTimeHh801() throws CFException  {              
   		return sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().getSys001MiplogTimeHh801();
   }

  
	/**
	*  set variable sys001MiplogTimeHh801
	*  @param value
	**/
   public void setSys001MiplogTimeHh801(char[] value) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeHh801(value);
   } 

     /**
	 * 	Update Sys001MiplogTimeHh801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogTimeHh801(char[] source, int sourceIndex) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeHh801(source, sourceIndex);
   	
   }
   
   public void setSys001MiplogTimeHh801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeHh801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001MiplogTimeHh801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogTimeHh801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeHh801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001MiplogTimeHh801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogTimeHh801(Field source) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeHh801(source);
   }  
   
     /**
	 * 	Update Sys001MiplogTimeHh801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogTimeHh801(Field source, int sourceIndex,int sourceLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeHh801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001MiplogTimeHh801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogTimeHh801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeHh801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys001MiplogRefNum801
	 *	@return sys001MiplogRefNum801
	 */
   public char[] getSys001MiplogRefNum801() throws CFException  {              
   		return sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogRefNum801();
   }

  
	/**
	*  set variable sys001MiplogRefNum801
	*  @param value
	**/
   public void setSys001MiplogRefNum801(char[] value) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogRefNum801(value);
   } 

     /**
	 * 	Update Sys001MiplogRefNum801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogRefNum801(char[] source, int sourceIndex) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogRefNum801(source, sourceIndex);
   	
   }
   
   public void setSys001MiplogRefNum801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogRefNum801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001MiplogRefNum801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogRefNum801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogRefNum801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001MiplogRefNum801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogRefNum801(Field source) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogRefNum801(source);
   }  
   
     /**
	 * 	Update Sys001MiplogRefNum801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogRefNum801(Field source, int sourceIndex,int sourceLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogRefNum801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001MiplogRefNum801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogRefNum801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogRefNum801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of z9Int32B1800
	 *	@return z9Int32B1800
	 */
   public char[] getZ9Int32B1800() throws CFException  {              
   		return z9Int32Group800.getZ9Int32X800().getZ9Int32B1800();
   }

  
	/**
	*  set variable z9Int32B1800
	*  @param value
	**/
   public void setZ9Int32B1800(char[] value) throws CFException {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B1800(value);
   } 

     /**
	 * 	Update Z9Int32B1800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZ9Int32B1800(char[] source, int sourceIndex) throws CFException {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B1800(source, sourceIndex);
   	
   }
   
   public void setZ9Int32B1800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B1800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Z9Int32B1800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int32B1800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B1800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Z9Int32B1800 with another Field
	 *	@param value
	 */
   public void setZ9Int32B1800(Field source) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B1800(source);
   }  
   
     /**
	 * 	Update Z9Int32B1800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZ9Int32B1800(Field source, int sourceIndex,int sourceLen) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B1800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Z9Int32B1800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int32B1800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B1800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys001MiplogTimeSs801
	 *	@return sys001MiplogTimeSs801
	 */
   public char[] getSys001MiplogTimeSs801() throws CFException  {              
   		return sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().getSys001MiplogTimeSs801();
   }

  
	/**
	*  set variable sys001MiplogTimeSs801
	*  @param value
	**/
   public void setSys001MiplogTimeSs801(char[] value) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeSs801(value);
   } 

     /**
	 * 	Update Sys001MiplogTimeSs801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogTimeSs801(char[] source, int sourceIndex) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeSs801(source, sourceIndex);
   	
   }
   
   public void setSys001MiplogTimeSs801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeSs801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001MiplogTimeSs801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogTimeSs801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeSs801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001MiplogTimeSs801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogTimeSs801(Field source) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeSs801(source);
   }  
   
     /**
	 * 	Update Sys001MiplogTimeSs801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogTimeSs801(Field source, int sourceIndex,int sourceLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeSs801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001MiplogTimeSs801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogTimeSs801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeSs801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys001MiplogTimeMm801
	 *	@return sys001MiplogTimeMm801
	 */
   public char[] getSys001MiplogTimeMm801() throws CFException  {              
   		return sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().getSys001MiplogTimeMm801();
   }

  
	/**
	*  set variable sys001MiplogTimeMm801
	*  @param value
	**/
   public void setSys001MiplogTimeMm801(char[] value) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeMm801(value);
   } 

     /**
	 * 	Update Sys001MiplogTimeMm801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogTimeMm801(char[] source, int sourceIndex) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeMm801(source, sourceIndex);
   	
   }
   
   public void setSys001MiplogTimeMm801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeMm801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001MiplogTimeMm801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogTimeMm801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeMm801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001MiplogTimeMm801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogTimeMm801(Field source) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeMm801(source);
   }  
   
     /**
	 * 	Update Sys001MiplogTimeMm801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogTimeMm801(Field source, int sourceIndex,int sourceLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeMm801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001MiplogTimeMm801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogTimeMm801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogTime801().setSys001MiplogTimeMm801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf528ServiceHr
	 *	@return sf528ServiceHr
	 */
   public char[] getSf528ServiceHr() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceTime().getSf528ServiceHr();
   }

  
	/**
	*  set variable sf528ServiceHr
	*  @param value
	**/
   public void setSf528ServiceHr(char[] value) throws CFException {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceTime().setSf528ServiceHr(value);
   } 

     /**
	 * 	Update Sf528ServiceHr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceHr(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceTime().setSf528ServiceHr(source, sourceIndex);
   	
   }
   
   public void setSf528ServiceHr(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceTime().setSf528ServiceHr(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServiceHr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceHr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceTime().setSf528ServiceHr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServiceHr with another Field
	 *	@param value
	 */
   public void setSf528ServiceHr(Field source) {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceTime().setSf528ServiceHr(source);
   }  
   
     /**
	 * 	Update Sf528ServiceHr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceHr(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceTime().setSf528ServiceHr(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServiceHr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceHr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceTime().setSf528ServiceHr(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of z9Int32800
	 *	@return z9Int32800
	 */
	public int getZ9Int32800() throws CFException {        
   		return z9Int32Group800.getZ9Int32800();
	}
	
	/**
	 * 	Update Z9Int32800 with the passed value
	 *	@param number
	 */
	public void setZ9Int32800(int number)  throws CFException{
		z9Int32Group800.setZ9Int32800(number);
	}


	public void setZ9Int32800(long number)  throws CFException{
		z9Int32Group800.setZ9Int32800((int)number);
	}


	/**
	 *	Returns the value of binDecoder800
	 *	@return binDecoder800
	 */
	public short getBinDecoder800() throws CFException {        
   		return binDecoderGroup800.getBinDecoder800();
	}
	
	/**
	 * 	Update BinDecoder800 with the passed value
	 *	@param number
	 */
	public void setBinDecoder800(short number)  throws CFException{
		binDecoderGroup800.setBinDecoder800(number);
	}

	public void setBinDecoder800(int number)  throws CFException{
		binDecoderGroup800.setBinDecoder800((short)number);
	}

	public void setBinDecoder800(long number)  throws CFException{
		binDecoderGroup800.setBinDecoder800((short)number);
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
	 *	Returns the value of x86Int32B1800
	 *	@return x86Int32B1800
	 */
   public char[] getX86Int32B1800() throws CFException  {              
   		return x86Int32Group800.getX86Int32X800().getX86Int32B1800();
   }

  
	/**
	*  set variable x86Int32B1800
	*  @param value
	**/
   public void setX86Int32B1800(char[] value) throws CFException {
      x86Int32Group800.getX86Int32X800().setX86Int32B1800(value);
   } 

     /**
	 * 	Update X86Int32B1800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX86Int32B1800(char[] source, int sourceIndex) throws CFException {
      x86Int32Group800.getX86Int32X800().setX86Int32B1800(source, sourceIndex);
   	
   }
   
   public void setX86Int32B1800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      x86Int32Group800.getX86Int32X800().setX86Int32B1800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update X86Int32B1800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32B1800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      x86Int32Group800.getX86Int32X800().setX86Int32B1800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update X86Int32B1800 with another Field
	 *	@param value
	 */
   public void setX86Int32B1800(Field source) {
      x86Int32Group800.getX86Int32X800().setX86Int32B1800(source);
   }  
   
     /**
	 * 	Update X86Int32B1800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX86Int32B1800(Field source, int sourceIndex,int sourceLen) {
      x86Int32Group800.getX86Int32X800().setX86Int32B1800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update X86Int32B1800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32B1800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      x86Int32Group800.getX86Int32X800().setX86Int32B1800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tranlogTimeMm800
	 *	@return tranlogTimeMm800
	 */
	public int getTranlogTimeMm800() throws CFException {
   		return work.getTranlogTimeMm800();
	}


	/**
	 *	Returns String value of tranlogTimeMm800
	 *	@return tranlogTimeMm800
	 */
	public char[]  getTranlogTimeMm800String() throws CFException {
	     return String.valueOf(work.getTranlogTimeMm800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranlogTimeMm800IsNumeric()  throws CFException{
	    return work.tranlogTimeMm800IsNumeric();
	}

	/**
	 * 	Update TranlogTimeMm800 with the passed value
	 *	@param number
	 */
	public void setTranlogTimeMm800(int number)  throws CFException{
		work.setTranlogTimeMm800(number);
	}
	

	public void setTranlogTimeMm800(long number)  throws CFException{
	    work.setTranlogTimeMm800(number);
	}
	
	
	/**
	 * 	Update TranlogTimeMm800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranlogTimeMm800(char[] value)  throws CFException {
		work.setTranlogTimeMm800(value);
	}
	
	/**
	 * 	Update TranlogTimeMm800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranlogTimeMm800String(char[] value)  throws CFException{
		work.setTranlogTimeMm800(value);
	}	

	/**
	 *	Returns the value of sf528ServiceSc
	 *	@return sf528ServiceSc
	 */
   public char[] getSf528ServiceSc() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceTime().getSf528ServiceSc();
   }

  
	/**
	*  set variable sf528ServiceSc
	*  @param value
	**/
   public void setSf528ServiceSc(char[] value) throws CFException {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceTime().setSf528ServiceSc(value);
   } 

     /**
	 * 	Update Sf528ServiceSc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceSc(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceTime().setSf528ServiceSc(source, sourceIndex);
   	
   }
   
   public void setSf528ServiceSc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceTime().setSf528ServiceSc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServiceSc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceSc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceTime().setSf528ServiceSc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServiceSc with another Field
	 *	@param value
	 */
   public void setSf528ServiceSc(Field source) {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceTime().setSf528ServiceSc(source);
   }  
   
     /**
	 * 	Update Sf528ServiceSc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceSc(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceTime().setSf528ServiceSc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServiceSc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceSc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceTime().setSf528ServiceSc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf528MipLogRefNum
	 *	@return sf528MipLogRefNum
	 */
   public char[] getSf528MipLogRefNum() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528MipLogRefNum();
   }

  
	/**
	*  set variable sf528MipLogRefNum
	*  @param value
	**/
   public void setSf528MipLogRefNum(char[] value) throws CFException {
      sf528ExtractZLogRec.setSf528MipLogRefNum(value);
   } 

     /**
	 * 	Update Sf528MipLogRefNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528MipLogRefNum(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.setSf528MipLogRefNum(source, sourceIndex);
   	
   }
   
   public void setSf528MipLogRefNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.setSf528MipLogRefNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528MipLogRefNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528MipLogRefNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528MipLogRefNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528MipLogRefNum with another Field
	 *	@param value
	 */
   public void setSf528MipLogRefNum(Field source) {
      sf528ExtractZLogRec.setSf528MipLogRefNum(source);
   }  
   
     /**
	 * 	Update Sf528MipLogRefNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528MipLogRefNum(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.setSf528MipLogRefNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528MipLogRefNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528MipLogRefNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.setSf528MipLogRefNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of binDecoderByt2800
	 *	@return binDecoderByt2800
	 */
   public char[] getBinDecoderByt2800() throws CFException  {              
   		return binDecoderGroup800.getBinDecoder800Redefined().getBinDecoderByt2800();
   }

  
	/**
	*  set variable binDecoderByt2800
	*  @param value
	**/
   public void setBinDecoderByt2800(char[] value) throws CFException {
      binDecoderGroup800.getBinDecoder800Redefined().setBinDecoderByt2800(value);
   } 

     /**
	 * 	Update BinDecoderByt2800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBinDecoderByt2800(char[] source, int sourceIndex) throws CFException {
      binDecoderGroup800.getBinDecoder800Redefined().setBinDecoderByt2800(source, sourceIndex);
   	
   }
   
   public void setBinDecoderByt2800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      binDecoderGroup800.getBinDecoder800Redefined().setBinDecoderByt2800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BinDecoderByt2800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBinDecoderByt2800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      binDecoderGroup800.getBinDecoder800Redefined().setBinDecoderByt2800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BinDecoderByt2800 with another Field
	 *	@param value
	 */
   public void setBinDecoderByt2800(Field source) {
      binDecoderGroup800.getBinDecoder800Redefined().setBinDecoderByt2800(source);
   }  
   
     /**
	 * 	Update BinDecoderByt2800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBinDecoderByt2800(Field source, int sourceIndex,int sourceLen) {
      binDecoderGroup800.getBinDecoder800Redefined().setBinDecoderByt2800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BinDecoderByt2800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBinDecoderByt2800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      binDecoderGroup800.getBinDecoder800Redefined().setBinDecoderByt2800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of x86Int32B2800
	 *	@return x86Int32B2800
	 */
   public char[] getX86Int32B2800() throws CFException  {              
   		return x86Int32Group800.getX86Int32X800().getX86Int32B2800();
   }

  
	/**
	*  set variable x86Int32B2800
	*  @param value
	**/
   public void setX86Int32B2800(char[] value) throws CFException {
      x86Int32Group800.getX86Int32X800().setX86Int32B2800(value);
   } 

     /**
	 * 	Update X86Int32B2800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX86Int32B2800(char[] source, int sourceIndex) throws CFException {
      x86Int32Group800.getX86Int32X800().setX86Int32B2800(source, sourceIndex);
   	
   }
   
   public void setX86Int32B2800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      x86Int32Group800.getX86Int32X800().setX86Int32B2800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update X86Int32B2800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32B2800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      x86Int32Group800.getX86Int32X800().setX86Int32B2800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update X86Int32B2800 with another Field
	 *	@param value
	 */
   public void setX86Int32B2800(Field source) {
      x86Int32Group800.getX86Int32X800().setX86Int32B2800(source);
   }  
   
     /**
	 * 	Update X86Int32B2800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX86Int32B2800(Field source, int sourceIndex,int sourceLen) {
      x86Int32Group800.getX86Int32X800().setX86Int32B2800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update X86Int32B2800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32B2800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      x86Int32Group800.getX86Int32X800().setX86Int32B2800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of z9Int32B3800
	 *	@return z9Int32B3800
	 */
   public char[] getZ9Int32B3800() throws CFException  {              
   		return z9Int32Group800.getZ9Int32X800().getZ9Int32B3800();
   }

  
	/**
	*  set variable z9Int32B3800
	*  @param value
	**/
   public void setZ9Int32B3800(char[] value) throws CFException {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B3800(value);
   } 

     /**
	 * 	Update Z9Int32B3800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZ9Int32B3800(char[] source, int sourceIndex) throws CFException {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B3800(source, sourceIndex);
   	
   }
   
   public void setZ9Int32B3800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B3800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Z9Int32B3800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int32B3800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B3800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Z9Int32B3800 with another Field
	 *	@param value
	 */
   public void setZ9Int32B3800(Field source) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B3800(source);
   }  
   
     /**
	 * 	Update Z9Int32B3800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZ9Int32B3800(Field source, int sourceIndex,int sourceLen) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B3800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Z9Int32B3800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int32B3800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B3800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys001MiplogDateYy801
	 *	@return sys001MiplogDateYy801
	 */
   public char[] getSys001MiplogDateYy801() throws CFException  {              
   		return sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().getSys001MiplogDateYy801();
   }

  
	/**
	*  set variable sys001MiplogDateYy801
	*  @param value
	**/
   public void setSys001MiplogDateYy801(char[] value) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateYy801(value);
   } 

     /**
	 * 	Update Sys001MiplogDateYy801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogDateYy801(char[] source, int sourceIndex) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateYy801(source, sourceIndex);
   	
   }
   
   public void setSys001MiplogDateYy801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateYy801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001MiplogDateYy801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogDateYy801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateYy801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001MiplogDateYy801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogDateYy801(Field source) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateYy801(source);
   }  
   
     /**
	 * 	Update Sys001MiplogDateYy801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogDateYy801(Field source, int sourceIndex,int sourceLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateYy801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001MiplogDateYy801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogDateYy801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogDate801().setSys001MiplogDateYy801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys001MiplogElaTimX801
	 *	@return sys001MiplogElaTimX801
	 */
   public char[] getSys001MiplogElaTimX801() throws CFException  {              
   		return sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().getSys001MiplogElaTimX801();
   }

  
	/**
	*  set variable sys001MiplogElaTimX801
	*  @param value
	**/
   public void setSys001MiplogElaTimX801(char[] value) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogElaTimX801(value);
   } 

     /**
	 * 	Update Sys001MiplogElaTimX801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogElaTimX801(char[] source, int sourceIndex) throws CFException {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogElaTimX801(source, sourceIndex);
   	
   }
   
   public void setSys001MiplogElaTimX801(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogElaTimX801(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001MiplogElaTimX801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogElaTimX801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogElaTimX801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001MiplogElaTimX801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogElaTimX801(Field source) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogElaTimX801(source);
   }  
   
     /**
	 * 	Update Sys001MiplogElaTimX801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogElaTimX801(Field source, int sourceIndex,int sourceLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogElaTimX801(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001MiplogElaTimX801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogElaTimX801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.getZlogRecord801().getFixedHeader801().setSys001MiplogElaTimX801(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of twenty300
	 *	@return twenty300
	 */
	public short getTwenty300() throws CFException {
   		return work.getTwenty300();
	}

    /**
	 *	Returns the String value of twenty300
	 *	@return twenty300
	 */
	public char[]  getTwenty300ActualString() {
		return work.getTwenty300ActualString();
	}

	/**
	 *	Returns String value of twenty300
	 *	@return twenty300
	 */
	public char[]  getTwenty300String() throws CFException {
	     return String.valueOf(work.getTwenty300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean twenty300IsNumeric()  throws CFException{
	    return work.twenty300IsNumeric();
	}

	/**
	 * 	Update Twenty300 with the passed value
	 *	@param number
	 */
	public void setTwenty300(short number)  throws CFException{
		work.setTwenty300(number);
	}
	
	public void setTwenty300(int number)  throws CFException{
	    work.setTwenty300(number);
	}
	public void setTwenty300(long number)  throws CFException{
	    work.setTwenty300(number);
	}
	

	
	/**
	 * 	Update Twenty300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTwenty300(char[] value)  throws CFException {
		work.setTwenty300(value);
	}
	
	/**
	 * 	Update Twenty300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTwenty300String(char[] value)  throws CFException{
		work.setTwenty300(value);
	}	

	/**
	 *	Returns the value of tranlogTimeSs800
	 *	@return tranlogTimeSs800
	 */
	public int getTranlogTimeSs800() throws CFException {
   		return work.getTranlogTimeSs800();
	}


	/**
	 *	Returns String value of tranlogTimeSs800
	 *	@return tranlogTimeSs800
	 */
	public char[]  getTranlogTimeSs800String() throws CFException {
	     return String.valueOf(work.getTranlogTimeSs800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranlogTimeSs800IsNumeric()  throws CFException{
	    return work.tranlogTimeSs800IsNumeric();
	}

	/**
	 * 	Update TranlogTimeSs800 with the passed value
	 *	@param number
	 */
	public void setTranlogTimeSs800(int number)  throws CFException{
		work.setTranlogTimeSs800(number);
	}
	

	public void setTranlogTimeSs800(long number)  throws CFException{
	    work.setTranlogTimeSs800(number);
	}
	
	
	/**
	 * 	Update TranlogTimeSs800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranlogTimeSs800(char[] value)  throws CFException {
		work.setTranlogTimeSs800(value);
	}
	
	/**
	 * 	Update TranlogTimeSs800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranlogTimeSs800String(char[] value)  throws CFException{
		work.setTranlogTimeSs800(value);
	}	

	/**
	 *	Returns the value of x86Int32B3800
	 *	@return x86Int32B3800
	 */
   public char[] getX86Int32B3800() throws CFException  {              
   		return x86Int32Group800.getX86Int32X800().getX86Int32B3800();
   }

  
	/**
	*  set variable x86Int32B3800
	*  @param value
	**/
   public void setX86Int32B3800(char[] value) throws CFException {
      x86Int32Group800.getX86Int32X800().setX86Int32B3800(value);
   } 

     /**
	 * 	Update X86Int32B3800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX86Int32B3800(char[] source, int sourceIndex) throws CFException {
      x86Int32Group800.getX86Int32X800().setX86Int32B3800(source, sourceIndex);
   	
   }
   
   public void setX86Int32B3800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      x86Int32Group800.getX86Int32X800().setX86Int32B3800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update X86Int32B3800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32B3800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      x86Int32Group800.getX86Int32X800().setX86Int32B3800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update X86Int32B3800 with another Field
	 *	@param value
	 */
   public void setX86Int32B3800(Field source) {
      x86Int32Group800.getX86Int32X800().setX86Int32B3800(source);
   }  
   
     /**
	 * 	Update X86Int32B3800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX86Int32B3800(Field source, int sourceIndex,int sourceLen) {
      x86Int32Group800.getX86Int32X800().setX86Int32B3800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update X86Int32B3800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX86Int32B3800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      x86Int32Group800.getX86Int32X800().setX86Int32B3800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf528ServiceCc
	 *	@return sf528ServiceCc
	 */
   public char[] getSf528ServiceCc() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().getSf528ServiceCc();
   }

  
	/**
	*  set variable sf528ServiceCc
	*  @param value
	**/
   public void setSf528ServiceCc(char[] value) throws CFException {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().setSf528ServiceCc(value);
   } 

     /**
	 * 	Update Sf528ServiceCc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceCc(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().setSf528ServiceCc(source, sourceIndex);
   	
   }
   
   public void setSf528ServiceCc(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().setSf528ServiceCc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServiceCc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceCc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().setSf528ServiceCc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServiceCc with another Field
	 *	@param value
	 */
   public void setSf528ServiceCc(Field source) {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().setSf528ServiceCc(source);
   }  
   
     /**
	 * 	Update Sf528ServiceCc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceCc(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().setSf528ServiceCc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServiceCc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceCc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().setSf528ServiceCc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tranlogDateYy800
	 *	@return tranlogDateYy800
	 */
	public int getTranlogDateYy800() throws CFException {
   		return work.getTranlogDateYy800();
	}


	/**
	 *	Returns String value of tranlogDateYy800
	 *	@return tranlogDateYy800
	 */
	public char[]  getTranlogDateYy800String() throws CFException {
	     return String.valueOf(work.getTranlogDateYy800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranlogDateYy800IsNumeric()  throws CFException{
	    return work.tranlogDateYy800IsNumeric();
	}

	/**
	 * 	Update TranlogDateYy800 with the passed value
	 *	@param number
	 */
	public void setTranlogDateYy800(int number)  throws CFException{
		work.setTranlogDateYy800(number);
	}
	

	public void setTranlogDateYy800(long number)  throws CFException{
	    work.setTranlogDateYy800(number);
	}
	
	
	/**
	 * 	Update TranlogDateYy800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranlogDateYy800(char[] value)  throws CFException {
		work.setTranlogDateYy800(value);
	}
	
	/**
	 * 	Update TranlogDateYy800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranlogDateYy800String(char[] value)  throws CFException{
		work.setTranlogDateYy800(value);
	}	

	/**
	 *	Returns the value of z9Int32B4800
	 *	@return z9Int32B4800
	 */
   public char[] getZ9Int32B4800() throws CFException  {              
   		return z9Int32Group800.getZ9Int32X800().getZ9Int32B4800();
   }

  
	/**
	*  set variable z9Int32B4800
	*  @param value
	**/
   public void setZ9Int32B4800(char[] value) throws CFException {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B4800(value);
   } 

     /**
	 * 	Update Z9Int32B4800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZ9Int32B4800(char[] source, int sourceIndex) throws CFException {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B4800(source, sourceIndex);
   	
   }
   
   public void setZ9Int32B4800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B4800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Z9Int32B4800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int32B4800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B4800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Z9Int32B4800 with another Field
	 *	@param value
	 */
   public void setZ9Int32B4800(Field source) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B4800(source);
   }  
   
     /**
	 * 	Update Z9Int32B4800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZ9Int32B4800(Field source, int sourceIndex,int sourceLen) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B4800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Z9Int32B4800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int32B4800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B4800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sf528ServiceYy
	 *	@return sf528ServiceYy
	 */
   public char[] getSf528ServiceYy() throws CFException  {              
   		return sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().getSf528ServiceYy();
   }

  
	/**
	*  set variable sf528ServiceYy
	*  @param value
	**/
   public void setSf528ServiceYy(char[] value) throws CFException {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().setSf528ServiceYy(value);
   } 

     /**
	 * 	Update Sf528ServiceYy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf528ServiceYy(char[] source, int sourceIndex) throws CFException {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().setSf528ServiceYy(source, sourceIndex);
   	
   }
   
   public void setSf528ServiceYy(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().setSf528ServiceYy(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sf528ServiceYy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceYy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().setSf528ServiceYy(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sf528ServiceYy with another Field
	 *	@param value
	 */
   public void setSf528ServiceYy(Field source) {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().setSf528ServiceYy(source);
   }  
   
     /**
	 * 	Update Sf528ServiceYy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf528ServiceYy(Field source, int sourceIndex,int sourceLen) {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().setSf528ServiceYy(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sf528ServiceYy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf528ServiceYy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sf528ExtractZLogRec.getSf528ServiceDateTime().getSf528ServiceDate().setSf528ServiceYy(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tranlogTimeHh800
	 *	@return tranlogTimeHh800
	 */
	public int getTranlogTimeHh800() throws CFException {
   		return work.getTranlogTimeHh800();
	}


	/**
	 *	Returns String value of tranlogTimeHh800
	 *	@return tranlogTimeHh800
	 */
	public char[]  getTranlogTimeHh800String() throws CFException {
	     return String.valueOf(work.getTranlogTimeHh800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tranlogTimeHh800IsNumeric()  throws CFException{
	    return work.tranlogTimeHh800IsNumeric();
	}

	/**
	 * 	Update TranlogTimeHh800 with the passed value
	 *	@param number
	 */
	public void setTranlogTimeHh800(int number)  throws CFException{
		work.setTranlogTimeHh800(number);
	}
	

	public void setTranlogTimeHh800(long number)  throws CFException{
	    work.setTranlogTimeHh800(number);
	}
	
	
	/**
	 * 	Update TranlogTimeHh800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTranlogTimeHh800(char[] value)  throws CFException {
		work.setTranlogTimeHh800(value);
	}
	
	/**
	 * 	Update TranlogTimeHh800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTranlogTimeHh800String(char[] value)  throws CFException{
		work.setTranlogTimeHh800(value);
	}	

	/**
	 *	Returns the value of z9Int32B2800
	 *	@return z9Int32B2800
	 */
   public char[] getZ9Int32B2800() throws CFException  {              
   		return z9Int32Group800.getZ9Int32X800().getZ9Int32B2800();
   }

  
	/**
	*  set variable z9Int32B2800
	*  @param value
	**/
   public void setZ9Int32B2800(char[] value) throws CFException {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B2800(value);
   } 

     /**
	 * 	Update Z9Int32B2800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZ9Int32B2800(char[] source, int sourceIndex) throws CFException {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B2800(source, sourceIndex);
   	
   }
   
   public void setZ9Int32B2800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B2800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Z9Int32B2800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int32B2800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B2800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Z9Int32B2800 with another Field
	 *	@param value
	 */
   public void setZ9Int32B2800(Field source) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B2800(source);
   }  
   
     /**
	 * 	Update Z9Int32B2800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZ9Int32B2800(Field source, int sourceIndex,int sourceLen) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B2800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Z9Int32B2800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZ9Int32B2800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      z9Int32Group800.getZ9Int32X800().setZ9Int32B2800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf326010Ctx getSf326010Ctx() {
            return Sf326010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += binDecoderGroup800.hashCode();
        str += sys001MiplogRecordGroup800.hashCode();
        str += work.hashCode();
        str += sf528ExtractZLogRec.hashCode();
        str += x86Int32Group800.hashCode();
        str += z9Int32Group800.hashCode();
       return str.hashCode();
    }

    public BuildPDateTimeOutCtx clone() {
        BuildPDateTimeOutCtx cloneObj = new BuildPDateTimeOutCtx();
        cloneObj.binDecoderGroup800 = new BinDecoderGroup800();
        cloneObj.binDecoderGroup800.set(binDecoderGroup800.getClonedField());
        cloneObj.sys001MiplogRecordGroup800 = new Sys001MiplogRecordGroup800();
        cloneObj.sys001MiplogRecordGroup800.set(sys001MiplogRecordGroup800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sf528ExtractZLogRec = new Sf528ExtractZLogRec();
        cloneObj.sf528ExtractZLogRec.set(sf528ExtractZLogRec.getClonedField());
        cloneObj.x86Int32Group800 = new X86Int32Group800();
        cloneObj.x86Int32Group800.set(x86Int32Group800.getClonedField());
        cloneObj.z9Int32Group800 = new Z9Int32Group800();
        cloneObj.z9Int32Group800.set(z9Int32Group800.getClonedField());
        return cloneObj;
    }

    }

    public BuildPDateTimeOutCtx getBuildPDateTimeOutCtx() {
            return new BuildPDateTimeOutCtx();
    }
     public class ReadSys001FileInCtx implements Cloneable {
     Sys001MiplogRecordGroup800 sys001MiplogRecordGroup800 = Sf326010Ctx.this.getSys001MiplogRecordGroup800();
     Work work = Sf326010Ctx.this.getWork();
     Sys001MiplogRecord sys001MiplogRecord = Sf326010Ctx.this.getSys001MiplogRecord();

	/**
	 *	Returns the value of mipLogCnt400
	 *	@return mipLogCnt400
	 */
	public int getMipLogCnt400() throws CFException {
   		return work.getMipLogCnt400();
	}

    /**
	 *	Returns the String value of mipLogCnt400
	 *	@return mipLogCnt400
	 */
	public char[]  getMipLogCnt400ActualString() {
		return work.getMipLogCnt400ActualString();
	}

	/**
	 *	Returns String value of mipLogCnt400
	 *	@return mipLogCnt400
	 */
	public char[]  getMipLogCnt400String() throws CFException {
	     return String.valueOf(work.getMipLogCnt400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mipLogCnt400IsNumeric()  throws CFException{
	    return work.mipLogCnt400IsNumeric();
	}

	/**
	 * 	Update MipLogCnt400 with the passed value
	 *	@param number
	 */
	public void setMipLogCnt400(int number)  throws CFException{
		work.setMipLogCnt400(number);
	}
	

	public void setMipLogCnt400(long number)  throws CFException{
	    work.setMipLogCnt400(number);
	}
	
	
	/**
	 * 	Update MipLogCnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMipLogCnt400(char[] value)  throws CFException {
		work.setMipLogCnt400(value);
	}
	
	/**
	 * 	Update MipLogCnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMipLogCnt400String(char[] value)  throws CFException{
		work.setMipLogCnt400(value);
	}	

	/**
	 *	Returns the value of one300
	 *	@return one300
	 */
	public short getOne300() throws CFException {
   		return work.getOne300();
	}

    /**
	 *	Returns the String value of one300
	 *	@return one300
	 */
	public char[]  getOne300ActualString() {
		return work.getOne300ActualString();
	}

	/**
	 *	Returns String value of one300
	 *	@return one300
	 */
	public char[]  getOne300String() throws CFException {
	     return String.valueOf(work.getOne300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean one300IsNumeric()  throws CFException{
	    return work.one300IsNumeric();
	}

	/**
	 * 	Update One300 with the passed value
	 *	@param number
	 */
	public void setOne300(short number)  throws CFException{
		work.setOne300(number);
	}
	
	public void setOne300(int number)  throws CFException{
	    work.setOne300(number);
	}
	public void setOne300(long number)  throws CFException{
	    work.setOne300(number);
	}
	

	
	/**
	 * 	Update One300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setOne300(char[] value)  throws CFException {
		work.setOne300(value);
	}
	
	/**
	 * 	Update One300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOne300String(char[] value)  throws CFException{
		work.setOne300(value);
	}	

	/**
	 *	Returns the value of sys001Lrecl400
	 *	@return sys001Lrecl400
	 */
	public long getSys001Lrecl400() throws CFException {        
   		return work.getSys001Lrecl400();
	}
	
	/**
	 * 	Update Sys001Lrecl400 with the passed value
	 *	@param number
	 */
	public void setSys001Lrecl400(long number)  throws CFException{
		work.setSys001Lrecl400(number);
	}




        public Sf326010Ctx getSf326010Ctx() {
            return Sf326010Ctx.this;
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
        str += sys001MiplogRecordGroup800.hashCode();
        str += work.hashCode();
        str += sys001MiplogRecord.hashCode();
       return str.hashCode();
    }

    public ReadSys001FileInCtx clone() {
        ReadSys001FileInCtx cloneObj = new ReadSys001FileInCtx();
        cloneObj.sys001MiplogRecordGroup800 = new Sys001MiplogRecordGroup800();
        cloneObj.sys001MiplogRecordGroup800.set(sys001MiplogRecordGroup800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys001MiplogRecord = new Sys001MiplogRecord();
        cloneObj.sys001MiplogRecord.set(sys001MiplogRecord.getClonedField());
        return cloneObj;
    }

    }

    public ReadSys001FileInCtx getReadSys001FileInCtx() {
            return new ReadSys001FileInCtx();
    }
     public class ReadSys001FileOutCtx implements Cloneable {
     Sys001MiplogRecordGroup800 sys001MiplogRecordGroup800 = Sf326010Ctx.this.getSys001MiplogRecordGroup800();
     Work work = Sf326010Ctx.this.getWork();
     Sys001MiplogRecord sys001MiplogRecord = Sf326010Ctx.this.getSys001MiplogRecord();

	/**
	 *	Returns the value of mipLogCnt400
	 *	@return mipLogCnt400
	 */
	public int getMipLogCnt400() throws CFException {
   		return work.getMipLogCnt400();
	}

    /**
	 *	Returns the String value of mipLogCnt400
	 *	@return mipLogCnt400
	 */
	public char[]  getMipLogCnt400ActualString() {
		return work.getMipLogCnt400ActualString();
	}

	/**
	 *	Returns String value of mipLogCnt400
	 *	@return mipLogCnt400
	 */
	public char[]  getMipLogCnt400String() throws CFException {
	     return String.valueOf(work.getMipLogCnt400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mipLogCnt400IsNumeric()  throws CFException{
	    return work.mipLogCnt400IsNumeric();
	}

	/**
	 * 	Update MipLogCnt400 with the passed value
	 *	@param number
	 */
	public void setMipLogCnt400(int number)  throws CFException{
		work.setMipLogCnt400(number);
	}
	

	public void setMipLogCnt400(long number)  throws CFException{
	    work.setMipLogCnt400(number);
	}
	
	
	/**
	 * 	Update MipLogCnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMipLogCnt400(char[] value)  throws CFException {
		work.setMipLogCnt400(value);
	}
	
	/**
	 * 	Update MipLogCnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMipLogCnt400String(char[] value)  throws CFException{
		work.setMipLogCnt400(value);
	}	

	/**
	 *	Test condition "Y" for isMipLogEof88100()
	 *	@return  Returns true if isMipLogEof88100() is "Y"
	 */
   public boolean isMipLogEof88100() throws CFException {
      return work.isMipLogEof88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setMipLogEof88100True()  throws CFException{  			
    	work.setMipLogEof88100True();
   	}
	/**
	 *	Returns the value of sys001MiplogRecord
	 *	@return sys001MiplogRecord
	 */   
	 public Sys001MiplogRecord getSys001MiplogRecord() {
   	return sys001MiplogRecord;
   }


	/**
	 *	Returns the value of sys001Lrecl400
	 *	@return sys001Lrecl400
	 */
	public long getSys001Lrecl400() throws CFException {        
   		return work.getSys001Lrecl400();
	}
	
	/**
	 * 	Update Sys001Lrecl400 with the passed value
	 *	@param number
	 */
	public void setSys001Lrecl400(long number)  throws CFException{
		work.setSys001Lrecl400(number);
	}



	/**
	 *	Returns the value of sys001MiplogRecord800
	 *	@return sys001MiplogRecord800
	 */
   public char[] getSys001MiplogRecord800() throws CFException  {              
   		return sys001MiplogRecordGroup800.getSys001MiplogRecord800();
   }

  
	/**
	*  set variable sys001MiplogRecord800
	*  @param value
	**/
   public void setSys001MiplogRecord800(char[] value) throws CFException {
      sys001MiplogRecordGroup800.setSys001MiplogRecord800(value);
   } 

     /**
	 * 	Update Sys001MiplogRecord800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogRecord800(char[] source, int sourceIndex) throws CFException {
      sys001MiplogRecordGroup800.setSys001MiplogRecord800(source, sourceIndex);
   	
   }
   
   public void setSys001MiplogRecord800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sys001MiplogRecordGroup800.setSys001MiplogRecord800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001MiplogRecord800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogRecord800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.setSys001MiplogRecord800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001MiplogRecord800 with another Field
	 *	@param value
	 */
   public void setSys001MiplogRecord800(Field source) {
      sys001MiplogRecordGroup800.setSys001MiplogRecord800(source);
   }  
   
     /**
	 * 	Update Sys001MiplogRecord800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogRecord800(Field source, int sourceIndex,int sourceLen) {
      sys001MiplogRecordGroup800.setSys001MiplogRecord800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001MiplogRecord800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogRecord800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sys001MiplogRecordGroup800.setSys001MiplogRecord800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf326010Ctx getSf326010Ctx() {
            return Sf326010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += sys001MiplogRecordGroup800.hashCode();
        str += work.hashCode();
        str += sys001MiplogRecord.hashCode();
       return str.hashCode();
    }

    public ReadSys001FileOutCtx clone() {
        ReadSys001FileOutCtx cloneObj = new ReadSys001FileOutCtx();
        cloneObj.sys001MiplogRecordGroup800 = new Sys001MiplogRecordGroup800();
        cloneObj.sys001MiplogRecordGroup800.set(sys001MiplogRecordGroup800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sys001MiplogRecord = new Sys001MiplogRecord();
        cloneObj.sys001MiplogRecord.set(sys001MiplogRecord.getClonedField());
        return cloneObj;
    }

    }

    public ReadSys001FileOutCtx getReadSys001FileOutCtx() {
            return new ReadSys001FileOutCtx();
    }
     public class TerminateProgramInCtx implements Cloneable {
     Message6008002 message6008002 = Sf326010Ctx.this.getMessage6008002();
     Message6008003 message6008003 = Sf326010Ctx.this.getMessage6008003();
     Message6008001 message6008001 = Sf326010Ctx.this.getMessage6008001();
     Work work = Sf326010Ctx.this.getWork();

	/**
	 *	Returns the value of zLogBypass400
	 *	@return zLogBypass400
	 */
	public int getZLogBypass400() throws CFException {
   		return work.getZLogBypass400();
	}

    /**
	 *	Returns the String value of zLogBypass400
	 *	@return zLogBypass400
	 */
	public char[]  getZLogBypass400ActualString() {
		return work.getZLogBypass400ActualString();
	}

	/**
	 *	Returns String value of zLogBypass400
	 *	@return zLogBypass400
	 */
	public char[]  getZLogBypass400String() throws CFException {
	     return String.valueOf(work.getZLogBypass400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean zLogBypass400IsNumeric()  throws CFException{
	    return work.zLogBypass400IsNumeric();
	}

	/**
	 * 	Update ZLogBypass400 with the passed value
	 *	@param number
	 */
	public void setZLogBypass400(int number)  throws CFException{
		work.setZLogBypass400(number);
	}
	

	public void setZLogBypass400(long number)  throws CFException{
	    work.setZLogBypass400(number);
	}
	
	
	/**
	 * 	Update ZLogBypass400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setZLogBypass400(char[] value)  throws CFException {
		work.setZLogBypass400(value);
	}
	
	/**
	 * 	Update ZLogBypass400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setZLogBypass400String(char[] value)  throws CFException{
		work.setZLogBypass400(value);
	}	

	/**
	 *	Returns the value of message6008002
	 *	@return message6008002
	 */   
	 public Message6008002 getMessage6008002() {
   	return message6008002;
   }


	/**
	 *	Returns the value of mipLogCnt400
	 *	@return mipLogCnt400
	 */
	public int getMipLogCnt400() throws CFException {
   		return work.getMipLogCnt400();
	}

    /**
	 *	Returns the String value of mipLogCnt400
	 *	@return mipLogCnt400
	 */
	public char[]  getMipLogCnt400ActualString() {
		return work.getMipLogCnt400ActualString();
	}

	/**
	 *	Returns String value of mipLogCnt400
	 *	@return mipLogCnt400
	 */
	public char[]  getMipLogCnt400String() throws CFException {
	     return String.valueOf(work.getMipLogCnt400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mipLogCnt400IsNumeric()  throws CFException{
	    return work.mipLogCnt400IsNumeric();
	}

	/**
	 * 	Update MipLogCnt400 with the passed value
	 *	@param number
	 */
	public void setMipLogCnt400(int number)  throws CFException{
		work.setMipLogCnt400(number);
	}
	

	public void setMipLogCnt400(long number)  throws CFException{
	    work.setMipLogCnt400(number);
	}
	
	
	/**
	 * 	Update MipLogCnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMipLogCnt400(char[] value)  throws CFException {
		work.setMipLogCnt400(value);
	}
	
	/**
	 * 	Update MipLogCnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMipLogCnt400String(char[] value)  throws CFException{
		work.setMipLogCnt400(value);
	}	

	/**
	 *	Returns the value of message6008003
	 *	@return message6008003
	 */   
	 public Message6008003 getMessage6008003() {
   	return message6008003;
   }


	/**
	 *	Returns the value of message6008001
	 *	@return message6008001
	 */   
	 public Message6008001 getMessage6008001() {
   	return message6008001;
   }


	/**
	 *	Returns the value of zLogCnt400
	 *	@return zLogCnt400
	 */
	public int getZLogCnt400() throws CFException {
   		return work.getZLogCnt400();
	}

    /**
	 *	Returns the String value of zLogCnt400
	 *	@return zLogCnt400
	 */
	public char[]  getZLogCnt400ActualString() {
		return work.getZLogCnt400ActualString();
	}

	/**
	 *	Returns String value of zLogCnt400
	 *	@return zLogCnt400
	 */
	public char[]  getZLogCnt400String() throws CFException {
	     return String.valueOf(work.getZLogCnt400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean zLogCnt400IsNumeric()  throws CFException{
	    return work.zLogCnt400IsNumeric();
	}

	/**
	 * 	Update ZLogCnt400 with the passed value
	 *	@param number
	 */
	public void setZLogCnt400(int number)  throws CFException{
		work.setZLogCnt400(number);
	}
	

	public void setZLogCnt400(long number)  throws CFException{
	    work.setZLogCnt400(number);
	}
	
	
	/**
	 * 	Update ZLogCnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setZLogCnt400(char[] value)  throws CFException {
		work.setZLogCnt400(value);
	}
	
	/**
	 * 	Update ZLogCnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setZLogCnt400String(char[] value)  throws CFException{
		work.setZLogCnt400(value);
	}	

	/**
	 *	Returns the value of message6008000
	 *	@return message6008000
	 */
   public char[] getMessage6008000() throws CFException  {              
   		return work.getMessage6008000();
   }

  
	/**
	*  set variable message6008000
	*  @param value
	**/
   public void setMessage6008000(char[] value) throws CFException {
      work.setMessage6008000(value);
   } 

	/**
	 *	Returns the value of message6008999
	 *	@return message6008999
	 */
   public char[] getMessage6008999() throws CFException  {              
   		return work.getMessage6008999();
   }

  
	/**
	*  set variable message6008999
	*  @param value
	**/
   public void setMessage6008999(char[] value) throws CFException {
      work.setMessage6008999(value);
   } 

	/**
	 *	Returns the value of eojMessage6009400
	 *	@return eojMessage6009400
	 */
   public char[] getEojMessage6009400() throws CFException  {              
   		return work.getEojMessage6009400();
   }

  
	/**
	*  set variable eojMessage6009400
	*  @param value
	**/
   public void setEojMessage6009400(char[] value) throws CFException {
      work.setEojMessage6009400(value);
   } 


        public Sf326010Ctx getSf326010Ctx() {
            return Sf326010Ctx.this;
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
        str += message6008002.hashCode();
        str += message6008003.hashCode();
        str += message6008001.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public TerminateProgramInCtx clone() {
        TerminateProgramInCtx cloneObj = new TerminateProgramInCtx();
        cloneObj.message6008002 = new Message6008002();
        cloneObj.message6008002.set(message6008002.getClonedField());
        cloneObj.message6008003 = new Message6008003();
        cloneObj.message6008003.set(message6008003.getClonedField());
        cloneObj.message6008001 = new Message6008001();
        cloneObj.message6008001.set(message6008001.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public TerminateProgramInCtx getTerminateProgramInCtx() {
            return new TerminateProgramInCtx();
    }
     public class TerminateProgramOutCtx implements Cloneable {
     Message6008002 message6008002 = Sf326010Ctx.this.getMessage6008002();
     Message6008003 message6008003 = Sf326010Ctx.this.getMessage6008003();
     Message6008001 message6008001 = Sf326010Ctx.this.getMessage6008001();
     Work work = Sf326010Ctx.this.getWork();

	/**
	 *	Returns the value of zLogBypass400
	 *	@return zLogBypass400
	 */
	public int getZLogBypass400() throws CFException {
   		return work.getZLogBypass400();
	}

    /**
	 *	Returns the String value of zLogBypass400
	 *	@return zLogBypass400
	 */
	public char[]  getZLogBypass400ActualString() {
		return work.getZLogBypass400ActualString();
	}

	/**
	 *	Returns String value of zLogBypass400
	 *	@return zLogBypass400
	 */
	public char[]  getZLogBypass400String() throws CFException {
	     return String.valueOf(work.getZLogBypass400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean zLogBypass400IsNumeric()  throws CFException{
	    return work.zLogBypass400IsNumeric();
	}

	/**
	 * 	Update ZLogBypass400 with the passed value
	 *	@param number
	 */
	public void setZLogBypass400(int number)  throws CFException{
		work.setZLogBypass400(number);
	}
	

	public void setZLogBypass400(long number)  throws CFException{
	    work.setZLogBypass400(number);
	}
	
	
	/**
	 * 	Update ZLogBypass400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setZLogBypass400(char[] value)  throws CFException {
		work.setZLogBypass400(value);
	}
	
	/**
	 * 	Update ZLogBypass400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setZLogBypass400String(char[] value)  throws CFException{
		work.setZLogBypass400(value);
	}	

	/**
	 *	Returns the value of mipLogCnt400
	 *	@return mipLogCnt400
	 */
	public int getMipLogCnt400() throws CFException {
   		return work.getMipLogCnt400();
	}

    /**
	 *	Returns the String value of mipLogCnt400
	 *	@return mipLogCnt400
	 */
	public char[]  getMipLogCnt400ActualString() {
		return work.getMipLogCnt400ActualString();
	}

	/**
	 *	Returns String value of mipLogCnt400
	 *	@return mipLogCnt400
	 */
	public char[]  getMipLogCnt400String() throws CFException {
	     return String.valueOf(work.getMipLogCnt400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mipLogCnt400IsNumeric()  throws CFException{
	    return work.mipLogCnt400IsNumeric();
	}

	/**
	 * 	Update MipLogCnt400 with the passed value
	 *	@param number
	 */
	public void setMipLogCnt400(int number)  throws CFException{
		work.setMipLogCnt400(number);
	}
	

	public void setMipLogCnt400(long number)  throws CFException{
	    work.setMipLogCnt400(number);
	}
	
	
	/**
	 * 	Update MipLogCnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMipLogCnt400(char[] value)  throws CFException {
		work.setMipLogCnt400(value);
	}
	
	/**
	 * 	Update MipLogCnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMipLogCnt400String(char[] value)  throws CFException{
		work.setMipLogCnt400(value);
	}	

	/**
	 *	Returns the value of sys001MipLogCnt6008001
	 *	@return sys001MipLogCnt6008001
	 */
   public char[] getSys001MipLogCnt6008001() throws CFException  {              
   		return message6008001.getSys001MipLogCnt6008001();
   }

  
	/**
	*  set variable sys001MipLogCnt6008001
	*  @param value
	**/
   public void setSys001MipLogCnt6008001(char[] value) throws CFException {
      message6008001.setSys001MipLogCnt6008001(value);
   } 

     /**
	 * 	Update Sys001MipLogCnt6008001 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MipLogCnt6008001(char[] source, int sourceIndex) throws CFException {
      message6008001.setSys001MipLogCnt6008001(source, sourceIndex);
   	
   }
   
   public void setSys001MipLogCnt6008001(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      message6008001.setSys001MipLogCnt6008001(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys001MipLogCnt6008001 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MipLogCnt6008001(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      message6008001.setSys001MipLogCnt6008001(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys001MipLogCnt6008001 with another Field
	 *	@param value
	 */
   public void setSys001MipLogCnt6008001(Field source) {
      message6008001.setSys001MipLogCnt6008001(source);
   }  
   
     /**
	 * 	Update Sys001MipLogCnt6008001 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MipLogCnt6008001(Field source, int sourceIndex,int sourceLen) {
      message6008001.setSys001MipLogCnt6008001(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys001MipLogCnt6008001 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MipLogCnt6008001(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      message6008001.setSys001MipLogCnt6008001(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sys201ZLogCnt6008003
	 *	@return sys201ZLogCnt6008003
	 */
   public char[] getSys201ZLogCnt6008003() throws CFException  {              
   		return message6008003.getSys201ZLogCnt6008003();
   }

  
	/**
	*  set variable sys201ZLogCnt6008003
	*  @param value
	**/
   public void setSys201ZLogCnt6008003(char[] value) throws CFException {
      message6008003.setSys201ZLogCnt6008003(value);
   } 

     /**
	 * 	Update Sys201ZLogCnt6008003 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys201ZLogCnt6008003(char[] source, int sourceIndex) throws CFException {
      message6008003.setSys201ZLogCnt6008003(source, sourceIndex);
   	
   }
   
   public void setSys201ZLogCnt6008003(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      message6008003.setSys201ZLogCnt6008003(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys201ZLogCnt6008003 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys201ZLogCnt6008003(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      message6008003.setSys201ZLogCnt6008003(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys201ZLogCnt6008003 with another Field
	 *	@param value
	 */
   public void setSys201ZLogCnt6008003(Field source) {
      message6008003.setSys201ZLogCnt6008003(source);
   }  
   
     /**
	 * 	Update Sys201ZLogCnt6008003 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys201ZLogCnt6008003(Field source, int sourceIndex,int sourceLen) {
      message6008003.setSys201ZLogCnt6008003(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys201ZLogCnt6008003 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys201ZLogCnt6008003(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      message6008003.setSys201ZLogCnt6008003(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of zLogCnt400
	 *	@return zLogCnt400
	 */
	public int getZLogCnt400() throws CFException {
   		return work.getZLogCnt400();
	}

    /**
	 *	Returns the String value of zLogCnt400
	 *	@return zLogCnt400
	 */
	public char[]  getZLogCnt400ActualString() {
		return work.getZLogCnt400ActualString();
	}

	/**
	 *	Returns String value of zLogCnt400
	 *	@return zLogCnt400
	 */
	public char[]  getZLogCnt400String() throws CFException {
	     return String.valueOf(work.getZLogCnt400String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean zLogCnt400IsNumeric()  throws CFException{
	    return work.zLogCnt400IsNumeric();
	}

	/**
	 * 	Update ZLogCnt400 with the passed value
	 *	@param number
	 */
	public void setZLogCnt400(int number)  throws CFException{
		work.setZLogCnt400(number);
	}
	

	public void setZLogCnt400(long number)  throws CFException{
	    work.setZLogCnt400(number);
	}
	
	
	/**
	 * 	Update ZLogCnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setZLogCnt400(char[] value)  throws CFException {
		work.setZLogCnt400(value);
	}
	
	/**
	 * 	Update ZLogCnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setZLogCnt400String(char[] value)  throws CFException{
		work.setZLogCnt400(value);
	}	

	/**
	 *	Returns the value of sys201ZLogCnt6008002
	 *	@return sys201ZLogCnt6008002
	 */
   public char[] getSys201ZLogCnt6008002() throws CFException  {              
   		return message6008002.getSys201ZLogCnt6008002();
   }

  
	/**
	*  set variable sys201ZLogCnt6008002
	*  @param value
	**/
   public void setSys201ZLogCnt6008002(char[] value) throws CFException {
      message6008002.setSys201ZLogCnt6008002(value);
   } 

     /**
	 * 	Update Sys201ZLogCnt6008002 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys201ZLogCnt6008002(char[] source, int sourceIndex) throws CFException {
      message6008002.setSys201ZLogCnt6008002(source, sourceIndex);
   	
   }
   
   public void setSys201ZLogCnt6008002(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      message6008002.setSys201ZLogCnt6008002(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sys201ZLogCnt6008002 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys201ZLogCnt6008002(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      message6008002.setSys201ZLogCnt6008002(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sys201ZLogCnt6008002 with another Field
	 *	@param value
	 */
   public void setSys201ZLogCnt6008002(Field source) {
      message6008002.setSys201ZLogCnt6008002(source);
   }  
   
     /**
	 * 	Update Sys201ZLogCnt6008002 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys201ZLogCnt6008002(Field source, int sourceIndex,int sourceLen) {
      message6008002.setSys201ZLogCnt6008002(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sys201ZLogCnt6008002 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys201ZLogCnt6008002(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      message6008002.setSys201ZLogCnt6008002(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf326010Ctx getSf326010Ctx() {
            return Sf326010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += message6008002.hashCode();
        str += message6008003.hashCode();
        str += message6008001.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public TerminateProgramOutCtx clone() {
        TerminateProgramOutCtx cloneObj = new TerminateProgramOutCtx();
        cloneObj.message6008002 = new Message6008002();
        cloneObj.message6008002.set(message6008002.getClonedField());
        cloneObj.message6008003 = new Message6008003();
        cloneObj.message6008003.set(message6008003.getClonedField());
        cloneObj.message6008001 = new Message6008001();
        cloneObj.message6008001.set(message6008001.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public TerminateProgramOutCtx getTerminateProgramOutCtx() {
            return new TerminateProgramOutCtx();
    }
}
