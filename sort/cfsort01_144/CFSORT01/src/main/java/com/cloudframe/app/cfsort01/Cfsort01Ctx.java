package com.cloudframe.app.cfsort01;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.cfsort01.file.records.InputStudent;
import com.cloudframe.app.cfsort01.file.records.WorkStudent;
import com.cloudframe.app.cfsort01.file.records.OutputStudent;
import com.cloudframe.app.cfsort01.dto.Work;


@Context
public class Cfsort01Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    WorkStudent workStudent;
    OutputStudent outputStudent;
    InputStudent inputStudent;
    Work work;


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


    public WorkStudent getWorkStudent() {
        if (workStudent == null) {
            workStudent = new WorkStudent();
        }

        return workStudent;
    }

    public void setWorkStudent(WorkStudent workStudent) {
        this.workStudent = workStudent;
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


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += workStudent.hashCode();
        str += outputStudent.hashCode();
        str += inputStudent.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Cfsort01Ctx clone() {
        Cfsort01Ctx cloneObj = new Cfsort01Ctx();
        cloneObj.workStudent = new WorkStudent();
        cloneObj.workStudent.set(workStudent.getClonedField());
        cloneObj.outputStudent = new OutputStudent();
        cloneObj.outputStudent.set(outputStudent.getClonedField());
        cloneObj.inputStudent = new InputStudent();
        cloneObj.inputStudent.set(inputStudent.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     WorkStudent workStudent = Cfsort01Ctx.this.getWorkStudent();
     OutputStudent outputStudent = Cfsort01Ctx.this.getOutputStudent();
     InputStudent inputStudent = Cfsort01Ctx.this.getInputStudent();

	/**
	 *	Returns the value of workStudent
	 *	@return workStudent
	 */   
	 public WorkStudent getWorkStudent() {
   	return workStudent;
   }


	/**
	 *	Returns the value of outputStudent
	 *	@return outputStudent
	 */   
	 public OutputStudent getOutputStudent() {
   	return outputStudent;
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
	 *	Returns the value of inputStudent
	 *	@return inputStudent
	 */   
	 public InputStudent getInputStudent() {
   	return inputStudent;
   }



        public Cfsort01Ctx getCfsort01Ctx() {
            return Cfsort01Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += workStudent.hashCode();
        str += outputStudent.hashCode();
        str += inputStudent.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.workStudent = new WorkStudent();
        cloneObj.workStudent.set(workStudent.getClonedField());
        cloneObj.outputStudent = new OutputStudent();
        cloneObj.outputStudent.set(outputStudent.getClonedField());
        cloneObj.inputStudent = new InputStudent();
        cloneObj.inputStudent.set(inputStudent.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
}
