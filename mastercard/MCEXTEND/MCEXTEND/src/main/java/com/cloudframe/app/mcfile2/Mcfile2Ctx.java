package com.cloudframe.app.mcfile2;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.mcfile2.dto.Work;
import com.cloudframe.app.global.sharedvar.Output;
import com.cloudframe.app.mcfile2.file.records.WfOutput;


@Context
public class Mcfile2Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Output output;
    Work work;
    WfOutput wfOutput;


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


    public Output getOutput() {
        if (output == null) {
            output = globalCtx.getGlobalDto(Output.class);
        }

        return output;
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
    public WfOutput getWfOutput() {
        if (wfOutput == null) {
            wfOutput = new WfOutput();
        }

        return wfOutput;
    }

    public void setWfOutput(WfOutput wfOutput) {
        this.wfOutput = wfOutput;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += output.hashCode();
        str += work.hashCode();
        str += wfOutput.hashCode();
       return str.hashCode();
    }

    public Mcfile2Ctx clone() {
        Mcfile2Ctx cloneObj = new Mcfile2Ctx();
        cloneObj.output = new Output();
        cloneObj.output.set(output.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wfOutput = new WfOutput();
        cloneObj.wfOutput.set(wfOutput.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class InitializeInCtx implements Cloneable {
     Work work = Mcfile2Ctx.this.getWork();
     WfOutput wfOutput = Mcfile2Ctx.this.getWfOutput();

	/**
	 *	Returns the value of wfOutput
	 *	@return wfOutput
	 */   
	 public WfOutput getWfOutput() {
   	return wfOutput;
   }



        public Mcfile2Ctx getMcfile2Ctx() {
            return Mcfile2Ctx.this;
        }

        public InitializeOutCtx getInitializeOutCtx() {
            return new InitializeOutCtx();
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
        str += wfOutput.hashCode();
       return str.hashCode();
    }

    public InitializeInCtx clone() {
        InitializeInCtx cloneObj = new InitializeInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wfOutput = new WfOutput();
        cloneObj.wfOutput.set(wfOutput.getClonedField());
        return cloneObj;
    }

    }

    public InitializeInCtx getInitializeInCtx() {
            return new InitializeInCtx();
    }
     public class InitializeOutCtx implements Cloneable {
     Work work = Mcfile2Ctx.this.getWork();
     WfOutput wfOutput = Mcfile2Ctx.this.getWfOutput();

	/**
	 *	Returns the value of outpStatus
	 *	@return outpStatus
	 */
   public char[] getOutpStatus() throws CFException  {              
   		return work.getOutpStatus();
   }

  
	/**
	*  set variable outpStatus
	*  @param value
	**/
   public void setOutpStatus(char[] value) throws CFException {
      work.setOutpStatus(value);
   } 


        public Mcfile2Ctx getMcfile2Ctx() {
            return Mcfile2Ctx.this;
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
        str += wfOutput.hashCode();
       return str.hashCode();
    }

    public InitializeOutCtx clone() {
        InitializeOutCtx cloneObj = new InitializeOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wfOutput = new WfOutput();
        cloneObj.wfOutput.set(wfOutput.getClonedField());
        return cloneObj;
    }

    }

    public InitializeOutCtx getInitializeOutCtx() {
            return new InitializeOutCtx();
    }
     public class WriteRecordInCtx implements Cloneable {
     Output output = Mcfile2Ctx.this.getOutput();
     Work work = Mcfile2Ctx.this.getWork();
     WfOutput wfOutput = Mcfile2Ctx.this.getWfOutput();

	/**
	 *	Returns the value of outCardNumber
	 *	@return outCardNumber
	 */
   public char[] getOutCardNumber() throws CFException  {              
   		return output.getOutCardNumber();
   }

  
	/**
	*  set variable outCardNumber
	*  @param value
	**/
   public void setOutCardNumber(char[] value) throws CFException {
      output.setOutCardNumber(value);
   } 

     /**
	 * 	Update OutCardNumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOutCardNumber(char[] source, int sourceIndex) throws CFException {
      output.setOutCardNumber(source, sourceIndex);
   	
   }
   
   public void setOutCardNumber(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      output.setOutCardNumber(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OutCardNumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOutCardNumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      output.setOutCardNumber(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OutCardNumber with another Field
	 *	@param value
	 */
   public void setOutCardNumber(Field source) {
      output.setOutCardNumber(source);
   }  
   
     /**
	 * 	Update OutCardNumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOutCardNumber(Field source, int sourceIndex,int sourceLen) {
      output.setOutCardNumber(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OutCardNumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOutCardNumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      output.setOutCardNumber(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of outServiceMm
	 *	@return outServiceMm
	 */
	public int getOutServiceMm() throws CFException {
   		return output.getOutServiceMm();
	}


	/**
	 *	Returns String value of outServiceMm
	 *	@return outServiceMm
	 */
	public char[]  getOutServiceMmString() throws CFException {
	     return String.valueOf(output.getOutServiceMmString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outServiceMmIsNumeric()  throws CFException{
	    return output.outServiceMmIsNumeric();
	}

	/**
	 * 	Update OutServiceMm with the passed value
	 *	@param number
	 */
	public void setOutServiceMm(int number)  throws CFException{
		output.setOutServiceMm(number);
	}
	

	public void setOutServiceMm(long number)  throws CFException{
	    output.setOutServiceMm(number);
	}
	
	
	/**
	 * 	Update OutServiceMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutServiceMm(char[] value)  throws CFException {
		output.setOutServiceMm(value);
	}
	
	/**
	 * 	Update OutServiceMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutServiceMmString(char[] value)  throws CFException{
		output.setOutServiceMm(value);
	}	

	/**
	 *	Returns the value of outTotal
	 *	@return outTotal
	 */
	public BigDecimal getOutTotal() throws CFException {
   		return output.getOutTotal();
	}


	 /**
     *	Returns String value of outTotal
     *	@return outTotal
     */
    public char[]  getOutTotalString() throws CFException {
         return output.getOutTotalString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean outTotalIsNumeric() {
        return output.outTotalIsNumeric();
    }
	/**
	 * 	Update OutTotal with the passed number
	 *	@param number
	 */
	public void setOutTotal(BigDecimal number)  throws CFException{
		output.setOutTotal(number);
   }

	/**
	 * 	Update OutTotal with the passed value
	 *	@param value (String or char[]);
	 */
	public void setOutTotal(char[] value)  throws CFException{
		output.setOutTotal(value);
	}   

	/**
	 *	Returns the value of wfOutput
	 *	@return wfOutput
	 */   
	 public WfOutput getWfOutput() {
   	return wfOutput;
   }



        public Mcfile2Ctx getMcfile2Ctx() {
            return Mcfile2Ctx.this;
        }

        public WriteRecordOutCtx getWriteRecordOutCtx() {
            return new WriteRecordOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += output.hashCode();
        str += work.hashCode();
        str += wfOutput.hashCode();
       return str.hashCode();
    }

    public WriteRecordInCtx clone() {
        WriteRecordInCtx cloneObj = new WriteRecordInCtx();
        cloneObj.output = new Output();
        cloneObj.output.set(output.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wfOutput = new WfOutput();
        cloneObj.wfOutput.set(wfOutput.getClonedField());
        return cloneObj;
    }

    }

    public WriteRecordInCtx getWriteRecordInCtx() {
            return new WriteRecordInCtx();
    }
     public class WriteRecordOutCtx implements Cloneable {
     Output output = Mcfile2Ctx.this.getOutput();
     Work work = Mcfile2Ctx.this.getWork();
     WfOutput wfOutput = Mcfile2Ctx.this.getWfOutput();

	/**
	 *	Returns the value of outCardNumber
	 *	@return outCardNumber
	 */
   public char[] getOutCardNumber() throws CFException  {              
   		return output.getOutCardNumber();
   }

  
	/**
	*  set variable outCardNumber
	*  @param value
	**/
   public void setOutCardNumber(char[] value) throws CFException {
      output.setOutCardNumber(value);
   } 

     /**
	 * 	Update OutCardNumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOutCardNumber(char[] source, int sourceIndex) throws CFException {
      output.setOutCardNumber(source, sourceIndex);
   	
   }
   
   public void setOutCardNumber(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      output.setOutCardNumber(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update OutCardNumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOutCardNumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      output.setOutCardNumber(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update OutCardNumber with another Field
	 *	@param value
	 */
   public void setOutCardNumber(Field source) {
      output.setOutCardNumber(source);
   }  
   
     /**
	 * 	Update OutCardNumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOutCardNumber(Field source, int sourceIndex,int sourceLen) {
      output.setOutCardNumber(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update OutCardNumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOutCardNumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      output.setOutCardNumber(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of outpStatus
	 *	@return outpStatus
	 */
   public char[] getOutpStatus() throws CFException  {              
   		return work.getOutpStatus();
   }

  
	/**
	*  set variable outpStatus
	*  @param value
	**/
   public void setOutpStatus(char[] value) throws CFException {
      work.setOutpStatus(value);
   } 

	/**
	 *	Returns the value of wfOutCardNumber
	 *	@return wfOutCardNumber
	 */
   public char[] getWfOutCardNumber() throws CFException  {              
   		return wfOutput.getWfOutCardNumber();
   }

  
	/**
	*  set variable wfOutCardNumber
	*  @param value
	**/
   public void setWfOutCardNumber(char[] value) throws CFException {
      wfOutput.setWfOutCardNumber(value);
   } 

     /**
	 * 	Update WfOutCardNumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWfOutCardNumber(char[] source, int sourceIndex) throws CFException {
      wfOutput.setWfOutCardNumber(source, sourceIndex);
   	
   }
   
   public void setWfOutCardNumber(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wfOutput.setWfOutCardNumber(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WfOutCardNumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWfOutCardNumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wfOutput.setWfOutCardNumber(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WfOutCardNumber with another Field
	 *	@param value
	 */
   public void setWfOutCardNumber(Field source) {
      wfOutput.setWfOutCardNumber(source);
   }  
   
     /**
	 * 	Update WfOutCardNumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWfOutCardNumber(Field source, int sourceIndex,int sourceLen) {
      wfOutput.setWfOutCardNumber(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WfOutCardNumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWfOutCardNumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wfOutput.setWfOutCardNumber(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wfOutServiceMm
	 *	@return wfOutServiceMm
	 */
	public int getWfOutServiceMm() throws CFException {
   		return wfOutput.getWfOutServiceMm();
	}


	/**
	 *	Returns String value of wfOutServiceMm
	 *	@return wfOutServiceMm
	 */
	public char[]  getWfOutServiceMmString() throws CFException {
	     return String.valueOf(wfOutput.getWfOutServiceMmString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wfOutServiceMmIsNumeric()  throws CFException{
	    return wfOutput.wfOutServiceMmIsNumeric();
	}

	/**
	 * 	Update WfOutServiceMm with the passed value
	 *	@param number
	 */
	public void setWfOutServiceMm(int number)  throws CFException{
		wfOutput.setWfOutServiceMm(number);
	}
	

	public void setWfOutServiceMm(long number)  throws CFException{
	    wfOutput.setWfOutServiceMm(number);
	}
	
	
	/**
	 * 	Update WfOutServiceMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setWfOutServiceMm(char[] value)  throws CFException {
		wfOutput.setWfOutServiceMm(value);
	}
	
	/**
	 * 	Update WfOutServiceMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWfOutServiceMmString(char[] value)  throws CFException{
		wfOutput.setWfOutServiceMm(value);
	}	

	/**
	 *	Returns the value of outServiceMm
	 *	@return outServiceMm
	 */
	public int getOutServiceMm() throws CFException {
   		return output.getOutServiceMm();
	}


	/**
	 *	Returns String value of outServiceMm
	 *	@return outServiceMm
	 */
	public char[]  getOutServiceMmString() throws CFException {
	     return String.valueOf(output.getOutServiceMmString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outServiceMmIsNumeric()  throws CFException{
	    return output.outServiceMmIsNumeric();
	}

	/**
	 * 	Update OutServiceMm with the passed value
	 *	@param number
	 */
	public void setOutServiceMm(int number)  throws CFException{
		output.setOutServiceMm(number);
	}
	

	public void setOutServiceMm(long number)  throws CFException{
	    output.setOutServiceMm(number);
	}
	
	
	/**
	 * 	Update OutServiceMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutServiceMm(char[] value)  throws CFException {
		output.setOutServiceMm(value);
	}
	
	/**
	 * 	Update OutServiceMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutServiceMmString(char[] value)  throws CFException{
		output.setOutServiceMm(value);
	}	

	/**
	 *	Returns the value of outTotal
	 *	@return outTotal
	 */
	public BigDecimal getOutTotal() throws CFException {
   		return output.getOutTotal();
	}


	 /**
     *	Returns String value of outTotal
     *	@return outTotal
     */
    public char[]  getOutTotalString() throws CFException {
         return output.getOutTotalString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean outTotalIsNumeric() {
        return output.outTotalIsNumeric();
    }
	/**
	 * 	Update OutTotal with the passed number
	 *	@param number
	 */
	public void setOutTotal(BigDecimal number)  throws CFException{
		output.setOutTotal(number);
   }

	/**
	 * 	Update OutTotal with the passed value
	 *	@param value (String or char[]);
	 */
	public void setOutTotal(char[] value)  throws CFException{
		output.setOutTotal(value);
	}   

	/**
	 *	Returns the value of wfOutput
	 *	@return wfOutput
	 */   
	 public WfOutput getWfOutput() {
   	return wfOutput;
   }


	/**
	 *	Returns the value of wfOutTotal
	 *	@return wfOutTotal
	 */
	public BigDecimal getWfOutTotal() throws CFException {
   		return wfOutput.getWfOutTotal();
	}


	 /**
     *	Returns String value of wfOutTotal
     *	@return wfOutTotal
     */
    public char[]  getWfOutTotalString() throws CFException {
         return wfOutput.getWfOutTotalString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean wfOutTotalIsNumeric() {
        return wfOutput.wfOutTotalIsNumeric();
    }
	/**
	 * 	Update WfOutTotal with the passed number
	 *	@param number
	 */
	public void setWfOutTotal(BigDecimal number)  throws CFException{
		wfOutput.setWfOutTotal(number);
   }

	/**
	 * 	Update WfOutTotal with the passed value
	 *	@param value (String or char[]);
	 */
	public void setWfOutTotal(char[] value)  throws CFException{
		wfOutput.setWfOutTotal(value);
	}   


        public Mcfile2Ctx getMcfile2Ctx() {
            return Mcfile2Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += output.hashCode();
        str += work.hashCode();
        str += wfOutput.hashCode();
       return str.hashCode();
    }

    public WriteRecordOutCtx clone() {
        WriteRecordOutCtx cloneObj = new WriteRecordOutCtx();
        cloneObj.output = new Output();
        cloneObj.output.set(output.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wfOutput = new WfOutput();
        cloneObj.wfOutput.set(wfOutput.getClonedField());
        return cloneObj;
    }

    }

    public WriteRecordOutCtx getWriteRecordOutCtx() {
            return new WriteRecordOutCtx();
    }
     public class TerminateInCtx implements Cloneable {
     Work work = Mcfile2Ctx.this.getWork();

	/**
	 *	Returns the value of outpStatus
	 *	@return outpStatus
	 */
   public char[] getOutpStatus() throws CFException  {              
   		return work.getOutpStatus();
   }

  
	/**
	*  set variable outpStatus
	*  @param value
	**/
   public void setOutpStatus(char[] value) throws CFException {
      work.setOutpStatus(value);
   } 


        public Mcfile2Ctx getMcfile2Ctx() {
            return Mcfile2Ctx.this;
        }

        public TerminateOutCtx getTerminateOutCtx() {
            return new TerminateOutCtx();
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

    public TerminateInCtx clone() {
        TerminateInCtx cloneObj = new TerminateInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public TerminateInCtx getTerminateInCtx() {
            return new TerminateInCtx();
    }
     public class TerminateOutCtx implements Cloneable {
     Work work = Mcfile2Ctx.this.getWork();

	/**
	 *	Returns the value of outpStatus
	 *	@return outpStatus
	 */
   public char[] getOutpStatus() throws CFException  {              
   		return work.getOutpStatus();
   }

  
	/**
	*  set variable outpStatus
	*  @param value
	**/
   public void setOutpStatus(char[] value) throws CFException {
      work.setOutpStatus(value);
   } 


        public Mcfile2Ctx getMcfile2Ctx() {
            return Mcfile2Ctx.this;
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

    public TerminateOutCtx clone() {
        TerminateOutCtx cloneObj = new TerminateOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public TerminateOutCtx getTerminateOutCtx() {
            return new TerminateOutCtx();
    }
     public class AbendOutCtx implements Cloneable {


        public Mcfile2Ctx getMcfile2Ctx() {
            return Mcfile2Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
       return str.hashCode();
    }

    public AbendOutCtx clone() {
        AbendOutCtx cloneObj = new AbendOutCtx();
        return cloneObj;
    }

    }

    public AbendOutCtx getAbendOutCtx() {
            return new AbendOutCtx();
    }
}
