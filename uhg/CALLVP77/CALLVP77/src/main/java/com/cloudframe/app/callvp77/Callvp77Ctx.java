package com.cloudframe.app.callvp77;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.callvp77.dto.SrpSortRequestParameters;
import com.cloudframe.app.callvp77.dto.Dt1SrtArray;
import com.cloudframe.app.callvp77.dto.InSrtArray;
import com.cloudframe.app.callvp77.dto.Dt1SrtContainer;
import com.cloudframe.app.callvp77.dto.Work;
import com.cloudframe.app.callvp77.dto.Dt1SrtItem;
import com.cloudframe.app.callvp77.file.records.InputRec;
import com.cloudframe.app.callvp77.file.records.OutputRec;


@Context
public class Callvp77Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    OutputRec outputRec;
    Dt1SrtContainer dt1SrtContainer;
    SrpSortRequestParameters srpSortRequestParameters;
    InputRec inputRec;
    Work work;
    InSrtArray inSrtArray;


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


    public OutputRec getOutputRec() {
        if (outputRec == null) {
            outputRec = new OutputRec();
        }

        return outputRec;
    }

    public void setOutputRec(OutputRec outputRec) {
        this.outputRec = outputRec;
    }
    public Dt1SrtContainer getDt1SrtContainer() {
        if (dt1SrtContainer == null) {
            dt1SrtContainer = new Dt1SrtContainer();
        }

        return dt1SrtContainer;
    }

    public void setDt1SrtContainer(Dt1SrtContainer dt1SrtContainer) {
        this.dt1SrtContainer = dt1SrtContainer;
    }
    public SrpSortRequestParameters getSrpSortRequestParameters() {
        if (srpSortRequestParameters == null) {
            srpSortRequestParameters = new SrpSortRequestParameters();
        }

        return srpSortRequestParameters;
    }

    public void setSrpSortRequestParameters(SrpSortRequestParameters srpSortRequestParameters) {
        this.srpSortRequestParameters = srpSortRequestParameters;
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
    public Work getWork() {
        if (work == null) {
            work = new Work();
        }

        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }
    public InSrtArray getInSrtArray() {
        if (inSrtArray == null) {
            inSrtArray = new InSrtArray();
        }

        return inSrtArray;
    }

    public void setInSrtArray(InSrtArray inSrtArray) {
        this.inSrtArray = inSrtArray;
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
        str += dt1SrtContainer.hashCode();
        str += srpSortRequestParameters.hashCode();
        str += inputRec.hashCode();
        str += work.hashCode();
        str += inSrtArray.hashCode();
       return str.hashCode();
    }

    public Callvp77Ctx clone() {
        Callvp77Ctx cloneObj = new Callvp77Ctx();
        cloneObj.outputRec = new OutputRec();
        cloneObj.outputRec.set(outputRec.getClonedField());
        cloneObj.dt1SrtContainer = new Dt1SrtContainer();
        cloneObj.dt1SrtContainer.set(dt1SrtContainer.getClonedField());
        cloneObj.srpSortRequestParameters = new SrpSortRequestParameters();
        cloneObj.srpSortRequestParameters.set(srpSortRequestParameters.getClonedField());
        cloneObj.inputRec = new InputRec();
        cloneObj.inputRec.set(inputRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.inSrtArray = new InSrtArray();
        cloneObj.inSrtArray.set(inSrtArray.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineInCtx implements Cloneable {
     Work work = Callvp77Ctx.this.getWork();

	/**
	 *	Returns the value of noItemsTobeSorted
	 *	@return noItemsTobeSorted
	 */
	public int getNoItemsTobeSorted() throws CFException {
   		return work.getNoItemsTobeSorted();
	}


	/**
	 *	Returns String value of noItemsTobeSorted
	 *	@return noItemsTobeSorted
	 */
	public char[]  getNoItemsTobeSortedString() throws CFException {
	     return String.valueOf(work.getNoItemsTobeSortedString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean noItemsTobeSortedIsNumeric()  throws CFException{
	    return work.noItemsTobeSortedIsNumeric();
	}

	/**
	 * 	Update NoItemsTobeSorted with the passed value
	 *	@param number
	 */
	public void setNoItemsTobeSorted(int number)  throws CFException{
		work.setNoItemsTobeSorted(number);
	}
	

	public void setNoItemsTobeSorted(long number)  throws CFException{
	    work.setNoItemsTobeSorted(number);
	}
	
	
	/**
	 * 	Update NoItemsTobeSorted with the passed value
	 *	@param value (String or char[])
	 */
	public void setNoItemsTobeSorted(char[] value)  throws CFException {
		work.setNoItemsTobeSorted(value);
	}
	
	/**
	 * 	Update NoItemsTobeSorted with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNoItemsTobeSortedString(char[] value)  throws CFException{
		work.setNoItemsTobeSorted(value);
	}	


        public Callvp77Ctx getCallvp77Ctx() {
            return Callvp77Ctx.this;
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
     public class MainlineOutCtx implements Cloneable {
     Work work = Callvp77Ctx.this.getWork();

	/**
	 *	Returns the value of noItemsTobeSorted
	 *	@return noItemsTobeSorted
	 */
	public int getNoItemsTobeSorted() throws CFException {
   		return work.getNoItemsTobeSorted();
	}


	/**
	 *	Returns String value of noItemsTobeSorted
	 *	@return noItemsTobeSorted
	 */
	public char[]  getNoItemsTobeSortedString() throws CFException {
	     return String.valueOf(work.getNoItemsTobeSortedString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean noItemsTobeSortedIsNumeric()  throws CFException{
	    return work.noItemsTobeSortedIsNumeric();
	}

	/**
	 * 	Update NoItemsTobeSorted with the passed value
	 *	@param number
	 */
	public void setNoItemsTobeSorted(int number)  throws CFException{
		work.setNoItemsTobeSorted(number);
	}
	

	public void setNoItemsTobeSorted(long number)  throws CFException{
	    work.setNoItemsTobeSorted(number);
	}
	
	
	/**
	 * 	Update NoItemsTobeSorted with the passed value
	 *	@param value (String or char[])
	 */
	public void setNoItemsTobeSorted(char[] value)  throws CFException {
		work.setNoItemsTobeSorted(value);
	}
	
	/**
	 * 	Update NoItemsTobeSorted with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNoItemsTobeSortedString(char[] value)  throws CFException{
		work.setNoItemsTobeSorted(value);
	}	

	/**
	 *	Returns the value of outputStatus
	 *	@return outputStatus
	 */
	public int getOutputStatus() throws CFException {
   		return work.getOutputStatus();
	}


	/**
	 *	Returns String value of outputStatus
	 *	@return outputStatus
	 */
	public char[]  getOutputStatusString() throws CFException {
	     return String.valueOf(work.getOutputStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outputStatusIsNumeric()  throws CFException{
	    return work.outputStatusIsNumeric();
	}

	/**
	 * 	Update OutputStatus with the passed value
	 *	@param number
	 */
	public void setOutputStatus(int number)  throws CFException{
		work.setOutputStatus(number);
	}
	

	public void setOutputStatus(long number)  throws CFException{
	    work.setOutputStatus(number);
	}
	
	
	/**
	 * 	Update OutputStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutputStatus(char[] value)  throws CFException {
		work.setOutputStatus(value);
	}
	
	/**
	 * 	Update OutputStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutputStatusString(char[] value)  throws CFException{
		work.setOutputStatus(value);
	}	


        public Callvp77Ctx getCallvp77Ctx() {
            return Callvp77Ctx.this;
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

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class PopulateInSrtArrayInCtx implements Cloneable {
     OutputRec outputRec = Callvp77Ctx.this.getOutputRec();
     InputRec inputRec = Callvp77Ctx.this.getInputRec();
     Work work = Callvp77Ctx.this.getWork();
     InSrtArray inSrtArray = Callvp77Ctx.this.getInSrtArray();

	/**
	 *	Returns the value of inputStatus
	 *	@return inputStatus
	 */
	public int getInputStatus() throws CFException {
   		return work.getInputStatus();
	}


	/**
	 *	Returns String value of inputStatus
	 *	@return inputStatus
	 */
	public char[]  getInputStatusString() throws CFException {
	     return String.valueOf(work.getInputStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inputStatusIsNumeric()  throws CFException{
	    return work.inputStatusIsNumeric();
	}

	/**
	 * 	Update InputStatus with the passed value
	 *	@param number
	 */
	public void setInputStatus(int number)  throws CFException{
		work.setInputStatus(number);
	}
	

	public void setInputStatus(long number)  throws CFException{
	    work.setInputStatus(number);
	}
	
	
	/**
	 * 	Update InputStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setInputStatus(char[] value)  throws CFException {
		work.setInputStatus(value);
	}
	
	/**
	 * 	Update InputStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInputStatusString(char[] value)  throws CFException{
		work.setInputStatus(value);
	}	

	/**
	 *	Returns the value of outputRec
	 *	@return outputRec
	 */   
	 public OutputRec getOutputRec() {
   	return outputRec;
   }


	/**
	 *	Returns the value of outputStatus
	 *	@return outputStatus
	 */
	public int getOutputStatus() throws CFException {
   		return work.getOutputStatus();
	}


	/**
	 *	Returns String value of outputStatus
	 *	@return outputStatus
	 */
	public char[]  getOutputStatusString() throws CFException {
	     return String.valueOf(work.getOutputStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outputStatusIsNumeric()  throws CFException{
	    return work.outputStatusIsNumeric();
	}

	/**
	 * 	Update OutputStatus with the passed value
	 *	@param number
	 */
	public void setOutputStatus(int number)  throws CFException{
		work.setOutputStatus(number);
	}
	

	public void setOutputStatus(long number)  throws CFException{
	    work.setOutputStatus(number);
	}
	
	
	/**
	 * 	Update OutputStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutputStatus(char[] value)  throws CFException {
		work.setOutputStatus(value);
	}
	
	/**
	 * 	Update OutputStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutputStatusString(char[] value)  throws CFException{
		work.setOutputStatus(value);
	}	

	/**
	 *	Returns the value of inSrtCnt
	 *	@return inSrtCnt
	 */
	public int getInSrtCnt() throws CFException {
   		return work.getInSrtCnt();
	}


	/**
	 *	Returns String value of inSrtCnt
	 *	@return inSrtCnt
	 */
	public char[]  getInSrtCntString() throws CFException {
	     return String.valueOf(work.getInSrtCntString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inSrtCntIsNumeric()  throws CFException{
	    return work.inSrtCntIsNumeric();
	}

	/**
	 * 	Update InSrtCnt with the passed value
	 *	@param number
	 */
	public void setInSrtCnt(int number)  throws CFException{
		work.setInSrtCnt(number);
	}
	

	public void setInSrtCnt(long number)  throws CFException{
	    work.setInSrtCnt(number);
	}
	
	
	/**
	 * 	Update InSrtCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setInSrtCnt(char[] value)  throws CFException {
		work.setInSrtCnt(value);
	}
	
	/**
	 * 	Update InSrtCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInSrtCntString(char[] value)  throws CFException{
		work.setInSrtCnt(value);
	}	


        public Callvp77Ctx getCallvp77Ctx() {
            return Callvp77Ctx.this;
        }

        public PopulateInSrtArrayOutCtx getPopulateInSrtArrayOutCtx() {
            return new PopulateInSrtArrayOutCtx();
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
        str += inputRec.hashCode();
        str += work.hashCode();
        str += inSrtArray.hashCode();
       return str.hashCode();
    }

    public PopulateInSrtArrayInCtx clone() {
        PopulateInSrtArrayInCtx cloneObj = new PopulateInSrtArrayInCtx();
        cloneObj.outputRec = new OutputRec();
        cloneObj.outputRec.set(outputRec.getClonedField());
        cloneObj.inputRec = new InputRec();
        cloneObj.inputRec.set(inputRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.inSrtArray = new InSrtArray();
        cloneObj.inSrtArray.set(inSrtArray.getClonedField());
        return cloneObj;
    }

    }

    public PopulateInSrtArrayInCtx getPopulateInSrtArrayInCtx() {
            return new PopulateInSrtArrayInCtx();
    }
     public class PopulateInSrtArrayOutCtx implements Cloneable {
     OutputRec outputRec = Callvp77Ctx.this.getOutputRec();
     InputRec inputRec = Callvp77Ctx.this.getInputRec();
     Work work = Callvp77Ctx.this.getWork();
     InSrtArray inSrtArray = Callvp77Ctx.this.getInSrtArray();

	/**
	 *	Returns the value of inputStatus
	 *	@return inputStatus
	 */
	public int getInputStatus() throws CFException {
   		return work.getInputStatus();
	}


	/**
	 *	Returns String value of inputStatus
	 *	@return inputStatus
	 */
	public char[]  getInputStatusString() throws CFException {
	     return String.valueOf(work.getInputStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inputStatusIsNumeric()  throws CFException{
	    return work.inputStatusIsNumeric();
	}

	/**
	 * 	Update InputStatus with the passed value
	 *	@param number
	 */
	public void setInputStatus(int number)  throws CFException{
		work.setInputStatus(number);
	}
	

	public void setInputStatus(long number)  throws CFException{
	    work.setInputStatus(number);
	}
	
	
	/**
	 * 	Update InputStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setInputStatus(char[] value)  throws CFException {
		work.setInputStatus(value);
	}
	
	/**
	 * 	Update InputStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInputStatusString(char[] value)  throws CFException{
		work.setInputStatus(value);
	}	

	/**
	 *	Returns the value of inSrtItem
	 *	@return inSrtItem
	 */
   public char[] getInSrtItem(int index) throws CFException  {              
   		return inSrtArray.getInSrtItem(index);
   }

  
	/**
	*  set variable inSrtItem
	*  @param value
	**/
   public void setInSrtItem(int index,char[] value) throws CFException {
      inSrtArray.setInSrtItem((index),value);
   } 

	/**
	 *	Returns the value of eofFlag
	 *	@return eofFlag
	 */
	public short getEofFlag() throws CFException {        
   		return work.getEofFlag();
	}
	
	/**
	 * 	Update EofFlag with the passed value
	 *	@param number
	 */
	public void setEofFlag(short number)  throws CFException{
		work.setEofFlag(number);
	}

	public void setEofFlag(int number)  throws CFException{
		work.setEofFlag((short)number);
	}

	public void setEofFlag(long number)  throws CFException{
		work.setEofFlag((short)number);
	}



	/**
	 *	Returns the value of inputRec
	 *	@return inputRec
	 */   
	 public InputRec getInputRec() {
   	return inputRec;
   }


	/**
	 *	Returns the value of outputStatus
	 *	@return outputStatus
	 */
	public int getOutputStatus() throws CFException {
   		return work.getOutputStatus();
	}


	/**
	 *	Returns String value of outputStatus
	 *	@return outputStatus
	 */
	public char[]  getOutputStatusString() throws CFException {
	     return String.valueOf(work.getOutputStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outputStatusIsNumeric()  throws CFException{
	    return work.outputStatusIsNumeric();
	}

	/**
	 * 	Update OutputStatus with the passed value
	 *	@param number
	 */
	public void setOutputStatus(int number)  throws CFException{
		work.setOutputStatus(number);
	}
	

	public void setOutputStatus(long number)  throws CFException{
	    work.setOutputStatus(number);
	}
	
	
	/**
	 * 	Update OutputStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutputStatus(char[] value)  throws CFException {
		work.setOutputStatus(value);
	}
	
	/**
	 * 	Update OutputStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutputStatusString(char[] value)  throws CFException{
		work.setOutputStatus(value);
	}	

	/**
	 *	Returns the value of inSrtCnt
	 *	@return inSrtCnt
	 */
	public int getInSrtCnt() throws CFException {
   		return work.getInSrtCnt();
	}


	/**
	 *	Returns String value of inSrtCnt
	 *	@return inSrtCnt
	 */
	public char[]  getInSrtCntString() throws CFException {
	     return String.valueOf(work.getInSrtCntString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inSrtCntIsNumeric()  throws CFException{
	    return work.inSrtCntIsNumeric();
	}

	/**
	 * 	Update InSrtCnt with the passed value
	 *	@param number
	 */
	public void setInSrtCnt(int number)  throws CFException{
		work.setInSrtCnt(number);
	}
	

	public void setInSrtCnt(long number)  throws CFException{
	    work.setInSrtCnt(number);
	}
	
	
	/**
	 * 	Update InSrtCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setInSrtCnt(char[] value)  throws CFException {
		work.setInSrtCnt(value);
	}
	
	/**
	 * 	Update InSrtCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInSrtCntString(char[] value)  throws CFException{
		work.setInSrtCnt(value);
	}	

	/**
	 *	Test condition 1 for isNoMoreRecords()
	 *	@return  Returns true if isNoMoreRecords() is 1
	 */
   public boolean isNoMoreRecords() throws CFException {
      return work.isNoMoreRecords();
   }

	/**
	*  set values 1
	*/
   	public void setNoMoreRecordsTrue()  throws CFException{  			
    	work.setNoMoreRecordsTrue();
   	}

        public Callvp77Ctx getCallvp77Ctx() {
            return Callvp77Ctx.this;
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
        str += inputRec.hashCode();
        str += work.hashCode();
        str += inSrtArray.hashCode();
       return str.hashCode();
    }

    public PopulateInSrtArrayOutCtx clone() {
        PopulateInSrtArrayOutCtx cloneObj = new PopulateInSrtArrayOutCtx();
        cloneObj.outputRec = new OutputRec();
        cloneObj.outputRec.set(outputRec.getClonedField());
        cloneObj.inputRec = new InputRec();
        cloneObj.inputRec.set(inputRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.inSrtArray = new InSrtArray();
        cloneObj.inSrtArray.set(inSrtArray.getClonedField());
        return cloneObj;
    }

    }

    public PopulateInSrtArrayOutCtx getPopulateInSrtArrayOutCtx() {
            return new PopulateInSrtArrayOutCtx();
    }
     public class SortArrayInCtx implements Cloneable {
     OutputRec outputRec = Callvp77Ctx.this.getOutputRec();
     Dt1SrtContainer dt1SrtContainer = Callvp77Ctx.this.getDt1SrtContainer();
     SrpSortRequestParameters srpSortRequestParameters = Callvp77Ctx.this.getSrpSortRequestParameters();
     Work work = Callvp77Ctx.this.getWork();
     InSrtArray inSrtArray = Callvp77Ctx.this.getInSrtArray();

	/**
	 *	Returns the value of noItemsTobeSorted
	 *	@return noItemsTobeSorted
	 */
	public int getNoItemsTobeSorted() throws CFException {
   		return work.getNoItemsTobeSorted();
	}


	/**
	 *	Returns String value of noItemsTobeSorted
	 *	@return noItemsTobeSorted
	 */
	public char[]  getNoItemsTobeSortedString() throws CFException {
	     return String.valueOf(work.getNoItemsTobeSortedString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean noItemsTobeSortedIsNumeric()  throws CFException{
	    return work.noItemsTobeSortedIsNumeric();
	}

	/**
	 * 	Update NoItemsTobeSorted with the passed value
	 *	@param number
	 */
	public void setNoItemsTobeSorted(int number)  throws CFException{
		work.setNoItemsTobeSorted(number);
	}
	

	public void setNoItemsTobeSorted(long number)  throws CFException{
	    work.setNoItemsTobeSorted(number);
	}
	
	
	/**
	 * 	Update NoItemsTobeSorted with the passed value
	 *	@param value (String or char[])
	 */
	public void setNoItemsTobeSorted(char[] value)  throws CFException {
		work.setNoItemsTobeSorted(value);
	}
	
	/**
	 * 	Update NoItemsTobeSorted with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNoItemsTobeSortedString(char[] value)  throws CFException{
		work.setNoItemsTobeSorted(value);
	}	

	/**
	 *	Returns the value of inSrtItem
	 *	@return inSrtItem
	 */
   public char[] getInSrtItem(int index) throws CFException  {              
   		return inSrtArray.getInSrtItem(index);
   }

  
	/**
	*  set variable inSrtItem
	*  @param value
	**/
   public void setInSrtItem(int index,char[] value) throws CFException {
      inSrtArray.setInSrtItem((index),value);
   } 

	/**
	 *	Returns the value of vp776a0001
	 *	@return vp776a0001
	 */
   public char[] getVp776a0001() throws CFException  {              
   		return work.getVp776a0001();
   }

  
	/**
	*  set variable vp776a0001
	*  @param value
	**/
   public void setVp776a0001(char[] value) throws CFException {
      work.setVp776a0001(value);
   } 

	/**
	 *	Returns the value of j
	 *	@return j
	 */
	public int getJ() throws CFException {
   		return work.getJ();
	}


	/**
	 *	Returns String value of j
	 *	@return j
	 */
	public char[]  getJString() throws CFException {
	     return String.valueOf(work.getJString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean jIsNumeric()  throws CFException{
	    return work.jIsNumeric();
	}

	/**
	 * 	Update J with the passed value
	 *	@param number
	 */
	public void setJ(int number)  throws CFException{
		work.setJ(number);
	}
	

	public void setJ(long number)  throws CFException{
	    work.setJ(number);
	}
	
	
	/**
	 * 	Update J with the passed value
	 *	@param value (String or char[])
	 */
	public void setJ(char[] value)  throws CFException {
		work.setJ(value);
	}
	
	/**
	 * 	Update J with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setJString(char[] value)  throws CFException{
		work.setJ(value);
	}	

	/**
	 *	Returns the value of outputRec
	 *	@return outputRec
	 */   
	 public OutputRec getOutputRec() {
   	return outputRec;
   }


	/**
	 *	Returns the value of srpSortRequestParameters
	 *	@return srpSortRequestParameters
	 */   
	 public SrpSortRequestParameters getSrpSortRequestParameters() {
   	return srpSortRequestParameters;
   }


	/**
	 *	Returns the value of dt1SrtItem
	 *	@return dt1SrtItem
	 */   
	 public Dt1SrtItem getDt1SrtItem(int index) {
   	return dt1SrtContainer.getDt1SrtFixedArea().getDt1SrtArray().getDt1SrtItem(index);
   }

    public List<Dt1SrtItem> getDt1SrtItem() {
        return dt1SrtContainer.getDt1SrtFixedArea().getDt1SrtArray().getDt1SrtItem();
    }
   /**
	* 	Update Dt1SrtItem with the passed value
	*	@param value
	*/
   public void setDt1SrtItem(int index,char[] value) throws CFException {
      dt1SrtContainer.getDt1SrtFixedArea().getDt1SrtArray().setDt1SrtItem((index),value);
   }   


	/**
	 *	Returns the value of dt1SrtArray
	 *	@return dt1SrtArray
	 */   
	 public Dt1SrtArray getDt1SrtArray() {
   	return dt1SrtContainer.getDt1SrtFixedArea().getDt1SrtArray();
   }

   /**
	* 	Update Dt1SrtArray with the passed value
	*	@param value
	*/
   public void setDt1SrtArray(char[] value) throws CFException {
      dt1SrtContainer.getDt1SrtFixedArea().setDt1SrtArray(value);
   }   

     /**
	 * 	Update Dt1SrtArray 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDt1SrtArray(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	dt1SrtContainer.getDt1SrtFixedArea().setDt1SrtArray(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Dt1SrtArray 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1SrtArray(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	dt1SrtContainer.getDt1SrtFixedArea().setDt1SrtArray(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Dt1SrtArray with another Field
	 *	@param value
	 */
   public void setDt1SrtArray(Field source) {
   	dt1SrtContainer.getDt1SrtFixedArea().setDt1SrtArray(source);
   }  
   
     /**
	 * 	Update Dt1SrtArray 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDt1SrtArray(Field source, int sourceIndex,int sourceLen) {
   	dt1SrtContainer.getDt1SrtFixedArea().setDt1SrtArray(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Dt1SrtArray 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1SrtArray(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	dt1SrtContainer.getDt1SrtFixedArea().setDt1SrtArray(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Callvp77Ctx getCallvp77Ctx() {
            return Callvp77Ctx.this;
        }

        public SortArrayOutCtx getSortArrayOutCtx() {
            return new SortArrayOutCtx();
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
        str += dt1SrtContainer.hashCode();
        str += srpSortRequestParameters.hashCode();
        str += work.hashCode();
        str += inSrtArray.hashCode();
       return str.hashCode();
    }

    public SortArrayInCtx clone() {
        SortArrayInCtx cloneObj = new SortArrayInCtx();
        cloneObj.outputRec = new OutputRec();
        cloneObj.outputRec.set(outputRec.getClonedField());
        cloneObj.dt1SrtContainer = new Dt1SrtContainer();
        cloneObj.dt1SrtContainer.set(dt1SrtContainer.getClonedField());
        cloneObj.srpSortRequestParameters = new SrpSortRequestParameters();
        cloneObj.srpSortRequestParameters.set(srpSortRequestParameters.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.inSrtArray = new InSrtArray();
        cloneObj.inSrtArray.set(inSrtArray.getClonedField());
        return cloneObj;
    }

    }

    public SortArrayInCtx getSortArrayInCtx() {
            return new SortArrayInCtx();
    }
     public class SortArrayOutCtx implements Cloneable {
     OutputRec outputRec = Callvp77Ctx.this.getOutputRec();
     Dt1SrtContainer dt1SrtContainer = Callvp77Ctx.this.getDt1SrtContainer();
     SrpSortRequestParameters srpSortRequestParameters = Callvp77Ctx.this.getSrpSortRequestParameters();
     Work work = Callvp77Ctx.this.getWork();
     InSrtArray inSrtArray = Callvp77Ctx.this.getInSrtArray();

	/**
	 *	Returns the value of inSrtItem
	 *	@return inSrtItem
	 */
   public char[] getInSrtItem(int index) throws CFException  {              
   		return inSrtArray.getInSrtItem(index);
   }

  
	/**
	*  set variable inSrtItem
	*  @param value
	**/
   public void setInSrtItem(int index,char[] value) throws CFException {
      inSrtArray.setInSrtItem((index),value);
   } 

	/**
	 *	Returns the value of j
	 *	@return j
	 */
	public int getJ() throws CFException {
   		return work.getJ();
	}


	/**
	 *	Returns String value of j
	 *	@return j
	 */
	public char[]  getJString() throws CFException {
	     return String.valueOf(work.getJString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean jIsNumeric()  throws CFException{
	    return work.jIsNumeric();
	}

	/**
	 * 	Update J with the passed value
	 *	@param number
	 */
	public void setJ(int number)  throws CFException{
		work.setJ(number);
	}
	

	public void setJ(long number)  throws CFException{
	    work.setJ(number);
	}
	
	
	/**
	 * 	Update J with the passed value
	 *	@param value (String or char[])
	 */
	public void setJ(char[] value)  throws CFException {
		work.setJ(value);
	}
	
	/**
	 * 	Update J with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setJString(char[] value)  throws CFException{
		work.setJ(value);
	}	

	/**
	 *	Test condition "D" for isSrpDescendingSort()
	 *	@return  Returns true if isSrpDescendingSort() is "D"
	 */
   public boolean isSrpDescendingSort() throws CFException {
      return srpSortRequestParameters.isSrpDescendingSort();
   }

	/**
	*  set values "D"
	*/
   	public void setSrpDescendingSortTrue()  throws CFException{  			
    	srpSortRequestParameters.setSrpDescendingSortTrue();
   	}
	/**
	 *	Returns the value of srpReturnCode
	 *	@return srpReturnCode
	 */
   public char[] getSrpReturnCode() throws CFException  {              
   		return srpSortRequestParameters.getSrpReturnCode();
   }

  
	/**
	*  set variable srpReturnCode
	*  @param value
	**/
   public void setSrpReturnCode(char[] value) throws CFException {
      srpSortRequestParameters.setSrpReturnCode(value);
   } 

     /**
	 * 	Update SrpReturnCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrpReturnCode(char[] source, int sourceIndex) throws CFException {
      srpSortRequestParameters.setSrpReturnCode(source, sourceIndex);
   	
   }
   
   public void setSrpReturnCode(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      srpSortRequestParameters.setSrpReturnCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SrpReturnCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrpReturnCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      srpSortRequestParameters.setSrpReturnCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SrpReturnCode with another Field
	 *	@param value
	 */
   public void setSrpReturnCode(Field source) {
      srpSortRequestParameters.setSrpReturnCode(source);
   }  
   
     /**
	 * 	Update SrpReturnCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrpReturnCode(Field source, int sourceIndex,int sourceLen) {
      srpSortRequestParameters.setSrpReturnCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SrpReturnCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrpReturnCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      srpSortRequestParameters.setSrpReturnCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

public int getSrpKeyStart() throws CFException {  
        return srpSortRequestParameters.getSrpKeyStart();
}
	/**
	 * 	Update SrpKeyStart with the passed value
	 *	@param number
	 */
	public void setSrpKeyStart(int number)  throws CFException{
		srpSortRequestParameters.setSrpKeyStart(number);
	}


	public void setSrpKeyStart(long number)  throws CFException{
	    srpSortRequestParameters.setSrpKeyStart(number);
	}
	

	/**
	 *	Test condition "00" for isSrpGoodReturn()
	 *	@return  Returns true if isSrpGoodReturn() is "00"
	 */
   public boolean isSrpGoodReturn() throws CFException {
      return srpSortRequestParameters.isSrpGoodReturn();
   }

	/**
	*  set values "00"
	*/
   	public void setSrpGoodReturnTrue()  throws CFException{  			
    	srpSortRequestParameters.setSrpGoodReturnTrue();
   	}
public int getSrpKeyLength() throws CFException {  
        return srpSortRequestParameters.getSrpKeyLength();
}
	/**
	 * 	Update SrpKeyLength with the passed value
	 *	@param number
	 */
	public void setSrpKeyLength(int number)  throws CFException{
		srpSortRequestParameters.setSrpKeyLength(number);
	}


	public void setSrpKeyLength(long number)  throws CFException{
	    srpSortRequestParameters.setSrpKeyLength(number);
	}
	

	/**
	 *	Returns the value of dt1SrtArray
	 *	@return dt1SrtArray
	 */   
	 public Dt1SrtArray getDt1SrtArray() {
   	return dt1SrtContainer.getDt1SrtFixedArea().getDt1SrtArray();
   }

   /**
	* 	Update Dt1SrtArray with the passed value
	*	@param value
	*/
   public void setDt1SrtArray(char[] value) throws CFException {
      dt1SrtContainer.getDt1SrtFixedArea().setDt1SrtArray(value);
   }   

     /**
	 * 	Update Dt1SrtArray 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDt1SrtArray(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	dt1SrtContainer.getDt1SrtFixedArea().setDt1SrtArray(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Dt1SrtArray 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDt1SrtArray(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	dt1SrtContainer.getDt1SrtFixedArea().setDt1SrtArray(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Dt1SrtArray with another Field
	 *	@param value
	 */
   public void setDt1SrtArray(Field source) {
   	dt1SrtContainer.getDt1SrtFixedArea().setDt1SrtArray(source);
   }  
   
     /**
	 * 	Update Dt1SrtArray 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDt1SrtArray(Field source, int sourceIndex,int sourceLen) {
   	dt1SrtContainer.getDt1SrtFixedArea().setDt1SrtArray(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Dt1SrtArray 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDt1SrtArray(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	dt1SrtContainer.getDt1SrtFixedArea().setDt1SrtArray(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of noItemsTobeSorted
	 *	@return noItemsTobeSorted
	 */
	public int getNoItemsTobeSorted() throws CFException {
   		return work.getNoItemsTobeSorted();
	}


	/**
	 *	Returns String value of noItemsTobeSorted
	 *	@return noItemsTobeSorted
	 */
	public char[]  getNoItemsTobeSortedString() throws CFException {
	     return String.valueOf(work.getNoItemsTobeSortedString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean noItemsTobeSortedIsNumeric()  throws CFException{
	    return work.noItemsTobeSortedIsNumeric();
	}

	/**
	 * 	Update NoItemsTobeSorted with the passed value
	 *	@param number
	 */
	public void setNoItemsTobeSorted(int number)  throws CFException{
		work.setNoItemsTobeSorted(number);
	}
	

	public void setNoItemsTobeSorted(long number)  throws CFException{
	    work.setNoItemsTobeSorted(number);
	}
	
	
	/**
	 * 	Update NoItemsTobeSorted with the passed value
	 *	@param value (String or char[])
	 */
	public void setNoItemsTobeSorted(char[] value)  throws CFException {
		work.setNoItemsTobeSorted(value);
	}
	
	/**
	 * 	Update NoItemsTobeSorted with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNoItemsTobeSortedString(char[] value)  throws CFException{
		work.setNoItemsTobeSorted(value);
	}	

	/**
	 *	Returns the value of dt1SrtItemCnt
	 *	@return dt1SrtItemCnt
	 */
	public int getDt1SrtItemCnt() throws CFException {
   		return dt1SrtContainer.getDt1SrtFixedArea().getDt1SrtItemCnt();
	}


	/**
	 *	Returns String value of dt1SrtItemCnt
	 *	@return dt1SrtItemCnt
	 */
	public char[]  getDt1SrtItemCntString() throws CFException {
	     return String.valueOf(dt1SrtContainer.getDt1SrtFixedArea().getDt1SrtItemCntString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dt1SrtItemCntIsNumeric()  throws CFException{
	    return dt1SrtContainer.getDt1SrtFixedArea().dt1SrtItemCntIsNumeric();
	}

	/**
	 * 	Update Dt1SrtItemCnt with the passed value
	 *	@param number
	 */
	public void setDt1SrtItemCnt(int number)  throws CFException{
		dt1SrtContainer.getDt1SrtFixedArea().setDt1SrtItemCnt(number);
	}
	

	public void setDt1SrtItemCnt(long number)  throws CFException{
	    dt1SrtContainer.getDt1SrtFixedArea().setDt1SrtItemCnt(number);
	}
	
	
	/**
	 * 	Update Dt1SrtItemCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setDt1SrtItemCnt(char[] value)  throws CFException {
		dt1SrtContainer.getDt1SrtFixedArea().setDt1SrtItemCnt(value);
	}
	
	/**
	 * 	Update Dt1SrtItemCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDt1SrtItemCntString(char[] value)  throws CFException{
		dt1SrtContainer.getDt1SrtFixedArea().setDt1SrtItemCnt(value);
	}	

	/**
	 *	Returns the value of outputRec
	 *	@return outputRec
	 */   
	 public OutputRec getOutputRec() {
   	return outputRec;
   }


public int getSrpEntryCount() throws CFException {  
        return srpSortRequestParameters.getSrpEntryCount();
}
	/**
	 * 	Update SrpEntryCount with the passed value
	 *	@param number
	 */
	public void setSrpEntryCount(int number)  throws CFException{
		srpSortRequestParameters.setSrpEntryCount(number);
	}


	public void setSrpEntryCount(long number)  throws CFException{
	    srpSortRequestParameters.setSrpEntryCount(number);
	}
	

	/**
	 *	Returns the value of srpSortRequestParameters
	 *	@return srpSortRequestParameters
	 */   
	 public SrpSortRequestParameters getSrpSortRequestParameters() {
   	return srpSortRequestParameters;
   }


	/**
	 *	Returns the value of dt1SrtItem
	 *	@return dt1SrtItem
	 */   
	 public Dt1SrtItem getDt1SrtItem(int index) {
   	return dt1SrtContainer.getDt1SrtFixedArea().getDt1SrtArray().getDt1SrtItem(index);
   }

    public List<Dt1SrtItem> getDt1SrtItem() {
        return dt1SrtContainer.getDt1SrtFixedArea().getDt1SrtArray().getDt1SrtItem();
    }
   /**
	* 	Update Dt1SrtItem with the passed value
	*	@param value
	*/
   public void setDt1SrtItem(int index,char[] value) throws CFException {
      dt1SrtContainer.getDt1SrtFixedArea().getDt1SrtArray().setDt1SrtItem((index),value);
   }   


public int getSrpEntryLength() throws CFException {  
        return srpSortRequestParameters.getSrpEntryLength();
}
	/**
	 * 	Update SrpEntryLength with the passed value
	 *	@param number
	 */
	public void setSrpEntryLength(int number)  throws CFException{
		srpSortRequestParameters.setSrpEntryLength(number);
	}


	public void setSrpEntryLength(long number)  throws CFException{
	    srpSortRequestParameters.setSrpEntryLength(number);
	}
	


        public Callvp77Ctx getCallvp77Ctx() {
            return Callvp77Ctx.this;
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
        str += dt1SrtContainer.hashCode();
        str += srpSortRequestParameters.hashCode();
        str += work.hashCode();
        str += inSrtArray.hashCode();
       return str.hashCode();
    }

    public SortArrayOutCtx clone() {
        SortArrayOutCtx cloneObj = new SortArrayOutCtx();
        cloneObj.outputRec = new OutputRec();
        cloneObj.outputRec.set(outputRec.getClonedField());
        cloneObj.dt1SrtContainer = new Dt1SrtContainer();
        cloneObj.dt1SrtContainer.set(dt1SrtContainer.getClonedField());
        cloneObj.srpSortRequestParameters = new SrpSortRequestParameters();
        cloneObj.srpSortRequestParameters.set(srpSortRequestParameters.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.inSrtArray = new InSrtArray();
        cloneObj.inSrtArray.set(inSrtArray.getClonedField());
        return cloneObj;
    }

    }

    public SortArrayOutCtx getSortArrayOutCtx() {
            return new SortArrayOutCtx();
    }
     public class WriteOutputInCtx implements Cloneable {
     OutputRec outputRec = Callvp77Ctx.this.getOutputRec();
     Work work = Callvp77Ctx.this.getWork();

	/**
	 *	Returns the value of outputRec
	 *	@return outputRec
	 */   
	 public OutputRec getOutputRec() {
   	return outputRec;
   }


	/**
	 *	Returns the value of outputStatus
	 *	@return outputStatus
	 */
	public int getOutputStatus() throws CFException {
   		return work.getOutputStatus();
	}


	/**
	 *	Returns String value of outputStatus
	 *	@return outputStatus
	 */
	public char[]  getOutputStatusString() throws CFException {
	     return String.valueOf(work.getOutputStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outputStatusIsNumeric()  throws CFException{
	    return work.outputStatusIsNumeric();
	}

	/**
	 * 	Update OutputStatus with the passed value
	 *	@param number
	 */
	public void setOutputStatus(int number)  throws CFException{
		work.setOutputStatus(number);
	}
	

	public void setOutputStatus(long number)  throws CFException{
	    work.setOutputStatus(number);
	}
	
	
	/**
	 * 	Update OutputStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutputStatus(char[] value)  throws CFException {
		work.setOutputStatus(value);
	}
	
	/**
	 * 	Update OutputStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutputStatusString(char[] value)  throws CFException{
		work.setOutputStatus(value);
	}	


        public Callvp77Ctx getCallvp77Ctx() {
            return Callvp77Ctx.this;
        }

        public WriteOutputOutCtx getWriteOutputOutCtx() {
            return new WriteOutputOutCtx();
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
        str += work.hashCode();
       return str.hashCode();
    }

    public WriteOutputInCtx clone() {
        WriteOutputInCtx cloneObj = new WriteOutputInCtx();
        cloneObj.outputRec = new OutputRec();
        cloneObj.outputRec.set(outputRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public WriteOutputInCtx getWriteOutputInCtx() {
            return new WriteOutputInCtx();
    }
     public class WriteOutputOutCtx implements Cloneable {
     OutputRec outputRec = Callvp77Ctx.this.getOutputRec();
     Work work = Callvp77Ctx.this.getWork();

	/**
	 *	Returns the value of outputRec
	 *	@return outputRec
	 */   
	 public OutputRec getOutputRec() {
   	return outputRec;
   }


	/**
	 *	Returns the value of outputStatus
	 *	@return outputStatus
	 */
	public int getOutputStatus() throws CFException {
   		return work.getOutputStatus();
	}


	/**
	 *	Returns String value of outputStatus
	 *	@return outputStatus
	 */
	public char[]  getOutputStatusString() throws CFException {
	     return String.valueOf(work.getOutputStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outputStatusIsNumeric()  throws CFException{
	    return work.outputStatusIsNumeric();
	}

	/**
	 * 	Update OutputStatus with the passed value
	 *	@param number
	 */
	public void setOutputStatus(int number)  throws CFException{
		work.setOutputStatus(number);
	}
	

	public void setOutputStatus(long number)  throws CFException{
	    work.setOutputStatus(number);
	}
	
	
	/**
	 * 	Update OutputStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutputStatus(char[] value)  throws CFException {
		work.setOutputStatus(value);
	}
	
	/**
	 * 	Update OutputStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutputStatusString(char[] value)  throws CFException{
		work.setOutputStatus(value);
	}	


        public Callvp77Ctx getCallvp77Ctx() {
            return Callvp77Ctx.this;
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
        str += work.hashCode();
       return str.hashCode();
    }

    public WriteOutputOutCtx clone() {
        WriteOutputOutCtx cloneObj = new WriteOutputOutCtx();
        cloneObj.outputRec = new OutputRec();
        cloneObj.outputRec.set(outputRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public WriteOutputOutCtx getWriteOutputOutCtx() {
            return new WriteOutputOutCtx();
    }
}
