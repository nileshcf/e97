package com.cloudframe.app.echoqsam;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.echoqsam.dto.Work;
import com.cloudframe.app.echoqsam.file.records.OutputRec;
import com.cloudframe.app.echoqsam.dto.MiscData;
import com.cloudframe.app.echoqsam.file.records.InputRec;


@Context
public class EchoqsamCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;
    OutputRec outputRec;
    MiscData miscData;
    InputRec inputRec;


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
    public OutputRec getOutputRec() {
        if (outputRec == null) {
            outputRec = new OutputRec();
        }

        return outputRec;
    }

    public void setOutputRec(OutputRec outputRec) {
        this.outputRec = outputRec;
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


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += work.hashCode();
        str += outputRec.hashCode();
        str += miscData.hashCode();
        str += inputRec.hashCode();
       return str.hashCode();
    }

    public EchoqsamCtx clone() {
        EchoqsamCtx cloneObj = new EchoqsamCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.outputRec = new OutputRec();
        cloneObj.outputRec.set(outputRec.getClonedField());
        cloneObj.miscData = new MiscData();
        cloneObj.miscData.set(miscData.getClonedField());
        cloneObj.inputRec = new InputRec();
        cloneObj.inputRec.set(inputRec.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineInCtx implements Cloneable {
     OutputRec outputRec = EchoqsamCtx.this.getOutputRec();
     MiscData miscData = EchoqsamCtx.this.getMiscData();
     InputRec inputRec = EchoqsamCtx.this.getInputRec();

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


        public EchoqsamCtx getEchoqsamCtx() {
            return EchoqsamCtx.this;
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
        str += outputRec.hashCode();
        str += miscData.hashCode();
        str += inputRec.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.outputRec = new OutputRec();
        cloneObj.outputRec.set(outputRec.getClonedField());
        cloneObj.miscData = new MiscData();
        cloneObj.miscData.set(miscData.getClonedField());
        cloneObj.inputRec = new InputRec();
        cloneObj.inputRec.set(inputRec.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     OutputRec outputRec = EchoqsamCtx.this.getOutputRec();
     MiscData miscData = EchoqsamCtx.this.getMiscData();
     InputRec inputRec = EchoqsamCtx.this.getInputRec();

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



	/**
	 *	Returns the value of outputRec
	 *	@return outputRec
	 */   
	 public OutputRec getOutputRec() {
   	return outputRec;
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

        public EchoqsamCtx getEchoqsamCtx() {
            return EchoqsamCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += outputRec.hashCode();
        str += miscData.hashCode();
        str += inputRec.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.outputRec = new OutputRec();
        cloneObj.outputRec.set(outputRec.getClonedField());
        cloneObj.miscData = new MiscData();
        cloneObj.miscData.set(miscData.getClonedField());
        cloneObj.inputRec = new InputRec();
        cloneObj.inputRec.set(inputRec.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
}
