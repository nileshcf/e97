package com.cloudframe.app.cfsort02;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.cfsort02.file.records.InputStudent;
import com.cloudframe.app.cfsort02.dto.Work;
import com.cloudframe.app.cfsort02.file.records.OutputStudent;
import com.cloudframe.app.cfsort02.file.records.WorkStudent;


@Context
public class Cfsort02Ctx implements ProgramContext, Cloneable {
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

    public Cfsort02Ctx clone() {
        Cfsort02Ctx cloneObj = new Cfsort02Ctx();
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
     OutputStudent outputStudent = Cfsort02Ctx.this.getOutputStudent();
     WorkStudent workStudent = Cfsort02Ctx.this.getWorkStudent();

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
	 *	Returns the value of outputStudent
	 *	@return outputStudent
	 */   
	 public OutputStudent getOutputStudent() {
   	return outputStudent;
   }


	/**
	 *	Returns the value of workStudent
	 *	@return workStudent
	 */   
	 public WorkStudent getWorkStudent() {
   	return workStudent;
   }



        public Cfsort02Ctx getCfsort02Ctx() {
            return Cfsort02Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += outputStudent.hashCode();
        str += workStudent.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.outputStudent = new OutputStudent();
        cloneObj.outputStudent.set(outputStudent.getClonedField());
        cloneObj.workStudent = new WorkStudent();
        cloneObj.workStudent.set(workStudent.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ReleaseRecordsInCtx implements Cloneable {
     InputStudent inputStudent = Cfsort02Ctx.this.getInputStudent();
     Work work = Cfsort02Ctx.this.getWork();
     WorkStudent workStudent = Cfsort02Ctx.this.getWorkStudent();

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
	 *	Returns the value of studentIdI
	 *	@return studentIdI
	 */
	public long getStudentIdI() throws CFException {
   		return inputStudent.getStudentIdI();
	}


	/**
	 *	Returns String value of studentIdI
	 *	@return studentIdI
	 */
	public char[]  getStudentIdIString() throws CFException {
	     return String.valueOf(inputStudent.getStudentIdIString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean studentIdIIsNumeric()  throws CFException{
	    return inputStudent.studentIdIIsNumeric();
	}

	/**
	 * 	Update StudentIdI with the passed value
	 *	@param number
	 */
	public void setStudentIdI(long number)  throws CFException{
		inputStudent.setStudentIdI(number);
	}
	

	
	/**
	 * 	Update StudentIdI with the passed value
	 *	@param value (String or char[])
	 */
	public void setStudentIdI(char[] value)  throws CFException {
		inputStudent.setStudentIdI(value);
	}
	
	/**
	 * 	Update StudentIdI with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStudentIdIString(char[] value)  throws CFException{
		inputStudent.setStudentIdI(value);
	}	


        public Cfsort02Ctx getCfsort02Ctx() {
            return Cfsort02Ctx.this;
        }

        public ReleaseRecordsOutCtx getReleaseRecordsOutCtx() {
            return new ReleaseRecordsOutCtx();
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
        str += workStudent.hashCode();
       return str.hashCode();
    }

    public ReleaseRecordsInCtx clone() {
        ReleaseRecordsInCtx cloneObj = new ReleaseRecordsInCtx();
        cloneObj.inputStudent = new InputStudent();
        cloneObj.inputStudent.set(inputStudent.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.workStudent = new WorkStudent();
        cloneObj.workStudent.set(workStudent.getClonedField());
        return cloneObj;
    }

    }

    public ReleaseRecordsInCtx getReleaseRecordsInCtx() {
            return new ReleaseRecordsInCtx();
    }
     public class ReleaseRecordsOutCtx implements Cloneable {
     InputStudent inputStudent = Cfsort02Ctx.this.getInputStudent();
     Work work = Cfsort02Ctx.this.getWork();
     WorkStudent workStudent = Cfsort02Ctx.this.getWorkStudent();

	/**
	 *	Returns the value of inputStudent
	 *	@return inputStudent
	 */   
	 public InputStudent getInputStudent() {
   	return inputStudent;
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
	 *	Returns the value of studentSeqNo01
	 *	@return studentSeqNo01
	 */
	public int getStudentSeqNo01() throws CFException {
   		return inputStudent.getStudentNameIRedefined().getStudentSeqNo01();
	}


	/**
	 *	Returns String value of studentSeqNo01
	 *	@return studentSeqNo01
	 */
	public char[]  getStudentSeqNo01String() throws CFException {
	     return String.valueOf(inputStudent.getStudentNameIRedefined().getStudentSeqNo01String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean studentSeqNo01IsNumeric()  throws CFException{
	    return inputStudent.getStudentNameIRedefined().studentSeqNo01IsNumeric();
	}

	/**
	 * 	Update StudentSeqNo01 with the passed value
	 *	@param number
	 */
	public void setStudentSeqNo01(int number)  throws CFException{
		inputStudent.getStudentNameIRedefined().setStudentSeqNo01(number);
	}
	

	public void setStudentSeqNo01(long number)  throws CFException{
	    inputStudent.getStudentNameIRedefined().setStudentSeqNo01(number);
	}
	
	
	/**
	 * 	Update StudentSeqNo01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setStudentSeqNo01(char[] value)  throws CFException {
		inputStudent.getStudentNameIRedefined().setStudentSeqNo01(value);
	}
	
	/**
	 * 	Update StudentSeqNo01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStudentSeqNo01String(char[] value)  throws CFException{
		inputStudent.getStudentNameIRedefined().setStudentSeqNo01(value);
	}	

	/**
	 *	Returns the value of workStudent
	 *	@return workStudent
	 */   
	 public WorkStudent getWorkStudent() {
   	return workStudent;
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
	 *	Returns the value of studentIdI
	 *	@return studentIdI
	 */
	public long getStudentIdI() throws CFException {
   		return inputStudent.getStudentIdI();
	}


	/**
	 *	Returns String value of studentIdI
	 *	@return studentIdI
	 */
	public char[]  getStudentIdIString() throws CFException {
	     return String.valueOf(inputStudent.getStudentIdIString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean studentIdIIsNumeric()  throws CFException{
	    return inputStudent.studentIdIIsNumeric();
	}

	/**
	 * 	Update StudentIdI with the passed value
	 *	@param number
	 */
	public void setStudentIdI(long number)  throws CFException{
		inputStudent.setStudentIdI(number);
	}
	

	
	/**
	 * 	Update StudentIdI with the passed value
	 *	@param value (String or char[])
	 */
	public void setStudentIdI(char[] value)  throws CFException {
		inputStudent.setStudentIdI(value);
	}
	
	/**
	 * 	Update StudentIdI with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStudentIdIString(char[] value)  throws CFException{
		inputStudent.setStudentIdI(value);
	}	

	/**
	 *	Returns the value of studentNameI
	 *	@return studentNameI
	 */
   public char[] getStudentNameI() throws CFException  {              
   		return inputStudent.getStudentNameI();
   }

  
	/**
	*  set variable studentNameI
	*  @param value
	**/
   public void setStudentNameI(char[] value) throws CFException {
      inputStudent.setStudentNameI(value);
   } 

     /**
	 * 	Update StudentNameI 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStudentNameI(char[] source, int sourceIndex) throws CFException {
      inputStudent.setStudentNameI(source, sourceIndex);
   	
   }
   
   public void setStudentNameI(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      inputStudent.setStudentNameI(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update StudentNameI 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStudentNameI(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      inputStudent.setStudentNameI(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update StudentNameI with another Field
	 *	@param value
	 */
   public void setStudentNameI(Field source) {
      inputStudent.setStudentNameI(source);
   }  
   
     /**
	 * 	Update StudentNameI 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStudentNameI(Field source, int sourceIndex,int sourceLen) {
      inputStudent.setStudentNameI(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update StudentNameI 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStudentNameI(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      inputStudent.setStudentNameI(source, sourceIndex, sourceLen, targetIndex, targetLen);
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

        public Cfsort02Ctx getCfsort02Ctx() {
            return Cfsort02Ctx.this;
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
        str += workStudent.hashCode();
       return str.hashCode();
    }

    public ReleaseRecordsOutCtx clone() {
        ReleaseRecordsOutCtx cloneObj = new ReleaseRecordsOutCtx();
        cloneObj.inputStudent = new InputStudent();
        cloneObj.inputStudent.set(inputStudent.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.workStudent = new WorkStudent();
        cloneObj.workStudent.set(workStudent.getClonedField());
        return cloneObj;
    }

    }

    public ReleaseRecordsOutCtx getReleaseRecordsOutCtx() {
            return new ReleaseRecordsOutCtx();
    }
}
