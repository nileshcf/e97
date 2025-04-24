package com.cloudframe.app.callfd01;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.callfd01.file.records.OutputRec;
import com.cloudframe.app.callfd01.dto.ParmData;
import com.cloudframe.app.callfd01.file.records.InputRec;
import com.cloudframe.app.callfd01.dto.Work;
import com.cloudframe.app.callfd01.dto.MiscData;


@Context
public class Callfd01Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;
    MiscData miscData;
    InputRec inputRec;
    ParmData parmData;
    OutputRec outputRec;


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


    public Work getWork() {
        if (work == null) {
            work = new Work();
        }

        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }
    public MiscData getMiscData() {
        if (miscData == null) {
            miscData = new MiscData();
        }

        return miscData;
    }

    public void setMiscData(MiscData miscData) {
        this.miscData = miscData;
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
    public ParmData getParmData() {
        if (parmData == null) {
            parmData = new ParmData();
        }

        return parmData;
    }

    public void setParmData(ParmData parmData) {
        this.parmData = parmData;
    }
    public OutputRec getOutputRec() {
        if (outputRec == null) {
            outputRec = new OutputRec();
        }

        return outputRec;
    }

    public void setOutputRec(OutputRec outputRec) {
        this.outputRec = outputRec;
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
        str += miscData.hashCode();
        str += inputRec.hashCode();
        str += parmData.hashCode();
        str += outputRec.hashCode();
       return str.hashCode();
    }

    public Callfd01Ctx clone() {
        Callfd01Ctx cloneObj = new Callfd01Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.miscData = new MiscData();
        cloneObj.miscData.set(miscData.getClonedField());
        cloneObj.inputRec = new InputRec();
        cloneObj.inputRec.set(inputRec.getClonedField());
        cloneObj.parmData = new ParmData();
        cloneObj.parmData.set(parmData.getClonedField());
        cloneObj.outputRec = new OutputRec();
        cloneObj.outputRec.set(outputRec.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineInCtx implements Cloneable {
     Work work = Callfd01Ctx.this.getWork();
     MiscData miscData = Callfd01Ctx.this.getMiscData();
     InputRec inputRec = Callfd01Ctx.this.getInputRec();
     ParmData parmData = Callfd01Ctx.this.getParmData();
     OutputRec outputRec = Callfd01Ctx.this.getOutputRec();

	/**
	 *	Returns the value of outputStatus
	 *	@return outputStatus
	 */
	public int getOutputStatus() throws CFException {
   		return miscData.getOutputStatus();
	}


	/**
	 *	Returns String value of outputStatus
	 *	@return outputStatus
	 */
	public char[]  getOutputStatusString() throws CFException {
	     return String.valueOf(miscData.getOutputStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outputStatusIsNumeric()  throws CFException{
	    return miscData.outputStatusIsNumeric();
	}

	/**
	 * 	Update OutputStatus with the passed value
	 *	@param number
	 */
	public void setOutputStatus(int number)  throws CFException{
		miscData.setOutputStatus(number);
	}
	

	public void setOutputStatus(long number)  throws CFException{
	    miscData.setOutputStatus(number);
	}
	
	
	/**
	 * 	Update OutputStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutputStatus(char[] value)  throws CFException {
		miscData.setOutputStatus(value);
	}
	
	/**
	 * 	Update OutputStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutputStatusString(char[] value)  throws CFException{
		miscData.setOutputStatus(value);
	}	

	/**
	 *	Returns the value of callfd0201
	 *	@return callfd0201
	 */
   public char[] getCallfd0201() throws CFException  {              
   		return work.getCallfd0201();
   }

  
	/**
	*  set variable callfd0201
	*  @param value
	**/
   public void setCallfd0201(char[] value) throws CFException {
      work.setCallfd0201(value);
   } 

	/**
	 *	Returns the value of inputRec
	 *	@return inputRec
	 */   
	 public InputRec getInputRec() {
   	return inputRec;
   }


	/**
	 *	Returns the value of inputStatus
	 *	@return inputStatus
	 */
	public int getInputStatus() throws CFException {
   		return miscData.getInputStatus();
	}


	/**
	 *	Returns String value of inputStatus
	 *	@return inputStatus
	 */
	public char[]  getInputStatusString() throws CFException {
	     return String.valueOf(miscData.getInputStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inputStatusIsNumeric()  throws CFException{
	    return miscData.inputStatusIsNumeric();
	}

	/**
	 * 	Update InputStatus with the passed value
	 *	@param number
	 */
	public void setInputStatus(int number)  throws CFException{
		miscData.setInputStatus(number);
	}
	

	public void setInputStatus(long number)  throws CFException{
	    miscData.setInputStatus(number);
	}
	
	
	/**
	 * 	Update InputStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setInputStatus(char[] value)  throws CFException {
		miscData.setInputStatus(value);
	}
	
	/**
	 * 	Update InputStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInputStatusString(char[] value)  throws CFException{
		miscData.setInputStatus(value);
	}	

	/**
	 *	Returns the value of parmData
	 *	@return parmData
	 */   
	 public ParmData getParmData() {
   	return parmData;
   }


	/**
	 *	Returns the value of outputRec
	 *	@return outputRec
	 */   
	 public OutputRec getOutputRec() {
   	return outputRec;
   }



        public Callfd01Ctx getCallfd01Ctx() {
            return Callfd01Ctx.this;
        }

        public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
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
        str += miscData.hashCode();
        str += inputRec.hashCode();
        str += parmData.hashCode();
        str += outputRec.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.miscData = new MiscData();
        cloneObj.miscData.set(miscData.getClonedField());
        cloneObj.inputRec = new InputRec();
        cloneObj.inputRec.set(inputRec.getClonedField());
        cloneObj.parmData = new ParmData();
        cloneObj.parmData.set(parmData.getClonedField());
        cloneObj.outputRec = new OutputRec();
        cloneObj.outputRec.set(outputRec.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     Work work = Callfd01Ctx.this.getWork();
     MiscData miscData = Callfd01Ctx.this.getMiscData();
     InputRec inputRec = Callfd01Ctx.this.getInputRec();
     ParmData parmData = Callfd01Ctx.this.getParmData();
     OutputRec outputRec = Callfd01Ctx.this.getOutputRec();

	/**
	 *	Returns the value of outputStatus
	 *	@return outputStatus
	 */
	public int getOutputStatus() throws CFException {
   		return miscData.getOutputStatus();
	}


	/**
	 *	Returns String value of outputStatus
	 *	@return outputStatus
	 */
	public char[]  getOutputStatusString() throws CFException {
	     return String.valueOf(miscData.getOutputStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outputStatusIsNumeric()  throws CFException{
	    return miscData.outputStatusIsNumeric();
	}

	/**
	 * 	Update OutputStatus with the passed value
	 *	@param number
	 */
	public void setOutputStatus(int number)  throws CFException{
		miscData.setOutputStatus(number);
	}
	

	public void setOutputStatus(long number)  throws CFException{
	    miscData.setOutputStatus(number);
	}
	
	
	/**
	 * 	Update OutputStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutputStatus(char[] value)  throws CFException {
		miscData.setOutputStatus(value);
	}
	
	/**
	 * 	Update OutputStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutputStatusString(char[] value)  throws CFException{
		miscData.setOutputStatus(value);
	}	

	/**
	 *	Returns the value of parmMarker
	 *	@return parmMarker
	 */
   public char[] getParmMarker() throws CFException  {              
   		return parmData.getParmMarker();
   }

  
	/**
	*  set variable parmMarker
	*  @param value
	**/
   public void setParmMarker(char[] value) throws CFException {
      parmData.setParmMarker(value);
   } 

     /**
	 * 	Update ParmMarker 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParmMarker(char[] source, int sourceIndex) throws CFException {
      parmData.setParmMarker(source, sourceIndex);
   	
   }
   
   public void setParmMarker(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      parmData.setParmMarker(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ParmMarker 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParmMarker(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parmData.setParmMarker(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ParmMarker with another Field
	 *	@param value
	 */
   public void setParmMarker(Field source) {
      parmData.setParmMarker(source);
   }  
   
     /**
	 * 	Update ParmMarker 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParmMarker(Field source, int sourceIndex,int sourceLen) {
      parmData.setParmMarker(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ParmMarker 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParmMarker(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      parmData.setParmMarker(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition 1 for isNoMoreRecords()
	 *	@return  Returns true if isNoMoreRecords() is 1
	 */
   public boolean isNoMoreRecords() throws CFException {
      return miscData.isNoMoreRecords();
   }

	/**
	*  set values 1
	*/
   	public void setNoMoreRecordsTrue()  throws CFException{  			
    	miscData.setNoMoreRecordsTrue();
   	}
	/**
	 *	Returns the value of miscData
	 *	@return miscData
	 */   
	 public MiscData getMiscData() {
   	return miscData;
   }


	/**
	 *	Returns the value of inputRec
	 *	@return inputRec
	 */   
	 public InputRec getInputRec() {
   	return inputRec;
   }


	/**
	 *	Returns the value of inputStatus
	 *	@return inputStatus
	 */
	public int getInputStatus() throws CFException {
   		return miscData.getInputStatus();
	}


	/**
	 *	Returns String value of inputStatus
	 *	@return inputStatus
	 */
	public char[]  getInputStatusString() throws CFException {
	     return String.valueOf(miscData.getInputStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inputStatusIsNumeric()  throws CFException{
	    return miscData.inputStatusIsNumeric();
	}

	/**
	 * 	Update InputStatus with the passed value
	 *	@param number
	 */
	public void setInputStatus(int number)  throws CFException{
		miscData.setInputStatus(number);
	}
	

	public void setInputStatus(long number)  throws CFException{
	    miscData.setInputStatus(number);
	}
	
	
	/**
	 * 	Update InputStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setInputStatus(char[] value)  throws CFException {
		miscData.setInputStatus(value);
	}
	
	/**
	 * 	Update InputStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInputStatusString(char[] value)  throws CFException{
		miscData.setInputStatus(value);
	}	

	/**
	 *	Returns the value of parmData
	 *	@return parmData
	 */   
	 public ParmData getParmData() {
   	return parmData;
   }


	/**
	 *	Returns the value of outputRec
	 *	@return outputRec
	 */   
	 public OutputRec getOutputRec() {
   	return outputRec;
   }


	/**
	 *	Returns the value of eofFlag
	 *	@return eofFlag
	 */
	public short getEofFlag() throws CFException {        
   		return miscData.getEofFlag();
	}
	
	/**
	 * 	Update EofFlag with the passed value
	 *	@param number
	 */
	public void setEofFlag(short number)  throws CFException{
		miscData.setEofFlag(number);
	}

	public void setEofFlag(int number)  throws CFException{
		miscData.setEofFlag((short)number);
	}

	public void setEofFlag(long number)  throws CFException{
		miscData.setEofFlag((short)number);
	}




        public Callfd01Ctx getCallfd01Ctx() {
            return Callfd01Ctx.this;
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
        str += miscData.hashCode();
        str += inputRec.hashCode();
        str += parmData.hashCode();
        str += outputRec.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.miscData = new MiscData();
        cloneObj.miscData.set(miscData.getClonedField());
        cloneObj.inputRec = new InputRec();
        cloneObj.inputRec.set(inputRec.getClonedField());
        cloneObj.parmData = new ParmData();
        cloneObj.parmData.set(parmData.getClonedField());
        cloneObj.outputRec = new OutputRec();
        cloneObj.outputRec.set(outputRec.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
}
