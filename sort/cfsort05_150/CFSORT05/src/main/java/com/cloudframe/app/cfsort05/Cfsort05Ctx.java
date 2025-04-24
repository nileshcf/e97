package com.cloudframe.app.cfsort05;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.cfsort05.file.records.InputStudent;
import com.cloudframe.app.cfsort05.file.records.OutputStudent;
import com.cloudframe.app.cfsort05.file.records.WorkStudent;
import com.cloudframe.app.cfsort05.dto.Work;


@Context
public class Cfsort05Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    InputStudent inputStudent;
    Work work;
    OutputStudent outputStudent;
    WorkStudent workStudent;


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


    public InputStudent getInputStudent() {
        if (inputStudent == null) {
            inputStudent = new InputStudent();
        }

        return inputStudent;
    }

    public void setInputStudent(InputStudent inputStudent) {
        this.inputStudent = inputStudent;
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
    public OutputStudent getOutputStudent() {
        if (outputStudent == null) {
            outputStudent = new OutputStudent();
        }

        return outputStudent;
    }

    public void setOutputStudent(OutputStudent outputStudent) {
        this.outputStudent = outputStudent;
    }
    public WorkStudent getWorkStudent() {
        if (workStudent == null) {
            workStudent = new WorkStudent();
        }

        return workStudent;
    }

    public void setWorkStudent(WorkStudent workStudent) {
        this.workStudent = workStudent;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += inputStudent.hashCode();
        str += work.hashCode();
        str += outputStudent.hashCode();
        str += workStudent.hashCode();
       return str.hashCode();
    }

    public Cfsort05Ctx clone() {
        Cfsort05Ctx cloneObj = new Cfsort05Ctx();
        cloneObj.inputStudent = new InputStudent();
        cloneObj.inputStudent.set(inputStudent.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.outputStudent = new OutputStudent();
        cloneObj.outputStudent.set(outputStudent.getClonedField());
        cloneObj.workStudent = new WorkStudent();
        cloneObj.workStudent.set(workStudent.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     InputStudent inputStudent = Cfsort05Ctx.this.getInputStudent();
     WorkStudent workStudent = Cfsort05Ctx.this.getWorkStudent();

	/**
	 *	Returns the value of inputStudent
	 *	@return inputStudent
	 */   
	 public InputStudent getInputStudent() {
   	return inputStudent;
   }


	/**
	 *	Returns the value of workStudent
	 *	@return workStudent
	 */   
	 public WorkStudent getWorkStudent() {
   	return workStudent;
   }


	/**
	 *	Returns the value of studentIdW
	 *	@return studentIdW
	 */
	public long getStudentIdW() throws CFException {
   		return workStudent.getStudentIdW();
	}


	/**
	 *	Returns String value of studentIdW
	 *	@return studentIdW
	 */
	public char[]  getStudentIdWString() throws CFException {
	     return String.valueOf(workStudent.getStudentIdWString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean studentIdWIsNumeric()  throws CFException{
	    return workStudent.studentIdWIsNumeric();
	}

	/**
	 * 	Update StudentIdW with the passed value
	 *	@param number
	 */
	public void setStudentIdW(long number)  throws CFException{
		workStudent.setStudentIdW(number);
	}
	

	
	/**
	 * 	Update StudentIdW with the passed value
	 *	@param value (String or char[])
	 */
	public void setStudentIdW(char[] value)  throws CFException {
		workStudent.setStudentIdW(value);
	}
	
	/**
	 * 	Update StudentIdW with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStudentIdWString(char[] value)  throws CFException{
		workStudent.setStudentIdW(value);
	}	


        public Cfsort05Ctx getCfsort05Ctx() {
            return Cfsort05Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += inputStudent.hashCode();
        str += workStudent.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.inputStudent = new InputStudent();
        cloneObj.inputStudent.set(inputStudent.getClonedField());
        cloneObj.workStudent = new WorkStudent();
        cloneObj.workStudent.set(workStudent.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ReturnRecordsInCtx implements Cloneable {
     Work work = Cfsort05Ctx.this.getWork();
     OutputStudent outputStudent = Cfsort05Ctx.this.getOutputStudent();
     WorkStudent workStudent = Cfsort05Ctx.this.getWorkStudent();

	/**
	 *	Returns the value of outputStudent
	 *	@return outputStudent
	 */   
	 public OutputStudent getOutputStudent() {
   	return outputStudent;
   }


	/**
	 *	Returns the value of studentNameW
	 *	@return studentNameW
	 */
   public char[] getStudentNameW() throws CFException  {              
   		return workStudent.getStudentNameW();
   }

  
	/**
	*  set variable studentNameW
	*  @param value
	**/
   public void setStudentNameW(char[] value) throws CFException {
      workStudent.setStudentNameW(value);
   } 

     /**
	 * 	Update StudentNameW 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStudentNameW(char[] source, int sourceIndex) throws CFException {
      workStudent.setStudentNameW(source, sourceIndex);
   	
   }
   
   public void setStudentNameW(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      workStudent.setStudentNameW(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update StudentNameW 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStudentNameW(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      workStudent.setStudentNameW(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update StudentNameW with another Field
	 *	@param value
	 */
   public void setStudentNameW(Field source) {
      workStudent.setStudentNameW(source);
   }  
   
     /**
	 * 	Update StudentNameW 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStudentNameW(Field source, int sourceIndex,int sourceLen) {
      workStudent.setStudentNameW(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update StudentNameW 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStudentNameW(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      workStudent.setStudentNameW(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of studentSeqNo
	 *	@return studentSeqNo
	 */
	public short getStudentSeqNo() throws CFException {        
   		return work.getStudentSeqNo();
	}
	
	/**
	 * 	Update StudentSeqNo with the passed value
	 *	@param number
	 */
	public void setStudentSeqNo(short number)  throws CFException{
		work.setStudentSeqNo(number);
	}

	public void setStudentSeqNo(int number)  throws CFException{
		work.setStudentSeqNo((short)number);
	}

	public void setStudentSeqNo(long number)  throws CFException{
		work.setStudentSeqNo((short)number);
	}



	/**
	 *	Returns the value of studentIdW
	 *	@return studentIdW
	 */
	public long getStudentIdW() throws CFException {
   		return workStudent.getStudentIdW();
	}


	/**
	 *	Returns String value of studentIdW
	 *	@return studentIdW
	 */
	public char[]  getStudentIdWString() throws CFException {
	     return String.valueOf(workStudent.getStudentIdWString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean studentIdWIsNumeric()  throws CFException{
	    return workStudent.studentIdWIsNumeric();
	}

	/**
	 * 	Update StudentIdW with the passed value
	 *	@param number
	 */
	public void setStudentIdW(long number)  throws CFException{
		workStudent.setStudentIdW(number);
	}
	

	
	/**
	 * 	Update StudentIdW with the passed value
	 *	@param value (String or char[])
	 */
	public void setStudentIdW(char[] value)  throws CFException {
		workStudent.setStudentIdW(value);
	}
	
	/**
	 * 	Update StudentIdW with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStudentIdWString(char[] value)  throws CFException{
		workStudent.setStudentIdW(value);
	}	


        public Cfsort05Ctx getCfsort05Ctx() {
            return Cfsort05Ctx.this;
        }

        public ReturnRecordsOutCtx getReturnRecordsOutCtx() {
            return new ReturnRecordsOutCtx();
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
        str += outputStudent.hashCode();
        str += workStudent.hashCode();
       return str.hashCode();
    }

    public ReturnRecordsInCtx clone() {
        ReturnRecordsInCtx cloneObj = new ReturnRecordsInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.outputStudent = new OutputStudent();
        cloneObj.outputStudent.set(outputStudent.getClonedField());
        cloneObj.workStudent = new WorkStudent();
        cloneObj.workStudent.set(workStudent.getClonedField());
        return cloneObj;
    }

    }

    public ReturnRecordsInCtx getReturnRecordsInCtx() {
            return new ReturnRecordsInCtx();
    }
     public class ReturnRecordsOutCtx implements Cloneable {
     Work work = Cfsort05Ctx.this.getWork();
     OutputStudent outputStudent = Cfsort05Ctx.this.getOutputStudent();
     WorkStudent workStudent = Cfsort05Ctx.this.getWorkStudent();

	/**
	 *	Returns the value of studentNameO
	 *	@return studentNameO
	 */
   public char[] getStudentNameO() throws CFException  {              
   		return outputStudent.getStudentNameO();
   }

  
	/**
	*  set variable studentNameO
	*  @param value
	**/
   public void setStudentNameO(char[] value) throws CFException {
      outputStudent.setStudentNameO(value);
   } 

     /**
	 * 	Update StudentNameO 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStudentNameO(char[] source, int sourceIndex) throws CFException {
      outputStudent.setStudentNameO(source, sourceIndex);
   	
   }
   
   public void setStudentNameO(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      outputStudent.setStudentNameO(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update StudentNameO 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStudentNameO(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      outputStudent.setStudentNameO(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update StudentNameO with another Field
	 *	@param value
	 */
   public void setStudentNameO(Field source) {
      outputStudent.setStudentNameO(source);
   }  
   
     /**
	 * 	Update StudentNameO 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStudentNameO(Field source, int sourceIndex,int sourceLen) {
      outputStudent.setStudentNameO(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update StudentNameO 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStudentNameO(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      outputStudent.setStudentNameO(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of outputStudent
	 *	@return outputStudent
	 */   
	 public OutputStudent getOutputStudent() {
   	return outputStudent;
   }


	/**
	 *	Returns the value of noMoreRecordsSw
	 *	@return noMoreRecordsSw
	 */
	public short getNoMoreRecordsSw() throws CFException {        
   		return work.getNoMoreRecordsSw();
	}
	
	/**
	 * 	Update NoMoreRecordsSw with the passed value
	 *	@param number
	 */
	public void setNoMoreRecordsSw(short number)  throws CFException{
		work.setNoMoreRecordsSw(number);
	}

	public void setNoMoreRecordsSw(int number)  throws CFException{
		work.setNoMoreRecordsSw((short)number);
	}

	public void setNoMoreRecordsSw(long number)  throws CFException{
		work.setNoMoreRecordsSw((short)number);
	}



	/**
	 *	Returns the value of studentSeqNo01
	 *	@return studentSeqNo01
	 */
	public int getStudentSeqNo01() throws CFException {
   		return outputStudent.getStudentNameORedefined().getStudentSeqNo01();
	}


	/**
	 *	Returns String value of studentSeqNo01
	 *	@return studentSeqNo01
	 */
	public char[]  getStudentSeqNo01String() throws CFException {
	     return String.valueOf(outputStudent.getStudentNameORedefined().getStudentSeqNo01String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean studentSeqNo01IsNumeric()  throws CFException{
	    return outputStudent.getStudentNameORedefined().studentSeqNo01IsNumeric();
	}

	/**
	 * 	Update StudentSeqNo01 with the passed value
	 *	@param number
	 */
	public void setStudentSeqNo01(int number)  throws CFException{
		outputStudent.getStudentNameORedefined().setStudentSeqNo01(number);
	}
	

	public void setStudentSeqNo01(long number)  throws CFException{
	    outputStudent.getStudentNameORedefined().setStudentSeqNo01(number);
	}
	
	
	/**
	 * 	Update StudentSeqNo01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setStudentSeqNo01(char[] value)  throws CFException {
		outputStudent.getStudentNameORedefined().setStudentSeqNo01(value);
	}
	
	/**
	 * 	Update StudentSeqNo01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStudentSeqNo01String(char[] value)  throws CFException{
		outputStudent.getStudentNameORedefined().setStudentSeqNo01(value);
	}	

	/**
	 *	Returns the value of studentNameW
	 *	@return studentNameW
	 */
   public char[] getStudentNameW() throws CFException  {              
   		return workStudent.getStudentNameW();
   }

  
	/**
	*  set variable studentNameW
	*  @param value
	**/
   public void setStudentNameW(char[] value) throws CFException {
      workStudent.setStudentNameW(value);
   } 

     /**
	 * 	Update StudentNameW 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStudentNameW(char[] source, int sourceIndex) throws CFException {
      workStudent.setStudentNameW(source, sourceIndex);
   	
   }
   
   public void setStudentNameW(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      workStudent.setStudentNameW(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update StudentNameW 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStudentNameW(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      workStudent.setStudentNameW(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update StudentNameW with another Field
	 *	@param value
	 */
   public void setStudentNameW(Field source) {
      workStudent.setStudentNameW(source);
   }  
   
     /**
	 * 	Update StudentNameW 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStudentNameW(Field source, int sourceIndex,int sourceLen) {
      workStudent.setStudentNameW(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update StudentNameW 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStudentNameW(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      workStudent.setStudentNameW(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of studentSeqNo
	 *	@return studentSeqNo
	 */
	public short getStudentSeqNo() throws CFException {        
   		return work.getStudentSeqNo();
	}
	
	/**
	 * 	Update StudentSeqNo with the passed value
	 *	@param number
	 */
	public void setStudentSeqNo(short number)  throws CFException{
		work.setStudentSeqNo(number);
	}

	public void setStudentSeqNo(int number)  throws CFException{
		work.setStudentSeqNo((short)number);
	}

	public void setStudentSeqNo(long number)  throws CFException{
		work.setStudentSeqNo((short)number);
	}



	/**
	 *	Returns the value of workStudent
	 *	@return workStudent
	 */   
	 public WorkStudent getWorkStudent() {
   	return workStudent;
   }


	/**
	 *	Returns the value of studentIdW
	 *	@return studentIdW
	 */
	public long getStudentIdW() throws CFException {
   		return workStudent.getStudentIdW();
	}


	/**
	 *	Returns String value of studentIdW
	 *	@return studentIdW
	 */
	public char[]  getStudentIdWString() throws CFException {
	     return String.valueOf(workStudent.getStudentIdWString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean studentIdWIsNumeric()  throws CFException{
	    return workStudent.studentIdWIsNumeric();
	}

	/**
	 * 	Update StudentIdW with the passed value
	 *	@param number
	 */
	public void setStudentIdW(long number)  throws CFException{
		workStudent.setStudentIdW(number);
	}
	

	
	/**
	 * 	Update StudentIdW with the passed value
	 *	@param value (String or char[])
	 */
	public void setStudentIdW(char[] value)  throws CFException {
		workStudent.setStudentIdW(value);
	}
	
	/**
	 * 	Update StudentIdW with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStudentIdWString(char[] value)  throws CFException{
		workStudent.setStudentIdW(value);
	}	

	/**
	 *	Returns the value of studentIdO
	 *	@return studentIdO
	 */
	public long getStudentIdO() throws CFException {
   		return outputStudent.getStudentIdO();
	}


	/**
	 *	Returns String value of studentIdO
	 *	@return studentIdO
	 */
	public char[]  getStudentIdOString() throws CFException {
	     return String.valueOf(outputStudent.getStudentIdOString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean studentIdOIsNumeric()  throws CFException{
	    return outputStudent.studentIdOIsNumeric();
	}

	/**
	 * 	Update StudentIdO with the passed value
	 *	@param number
	 */
	public void setStudentIdO(long number)  throws CFException{
		outputStudent.setStudentIdO(number);
	}
	

	
	/**
	 * 	Update StudentIdO with the passed value
	 *	@param value (String or char[])
	 */
	public void setStudentIdO(char[] value)  throws CFException {
		outputStudent.setStudentIdO(value);
	}
	
	/**
	 * 	Update StudentIdO with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStudentIdOString(char[] value)  throws CFException{
		outputStudent.setStudentIdO(value);
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

        public Cfsort05Ctx getCfsort05Ctx() {
            return Cfsort05Ctx.this;
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
        str += outputStudent.hashCode();
        str += workStudent.hashCode();
       return str.hashCode();
    }

    public ReturnRecordsOutCtx clone() {
        ReturnRecordsOutCtx cloneObj = new ReturnRecordsOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.outputStudent = new OutputStudent();
        cloneObj.outputStudent.set(outputStudent.getClonedField());
        cloneObj.workStudent = new WorkStudent();
        cloneObj.workStudent.set(workStudent.getClonedField());
        return cloneObj;
    }

    }

    public ReturnRecordsOutCtx getReturnRecordsOutCtx() {
            return new ReturnRecordsOutCtx();
    }
}
