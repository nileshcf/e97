package com.cloudframe.app.asaprnt;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.asaprnt.file.records.Reprec;
import com.cloudframe.app.asaprnt.dto.Trailer1700;
import com.cloudframe.app.asaprnt.dto.Work;
import com.cloudframe.app.asaprnt.dto.Header2a700;


@Context
public class AsaprntCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Trailer1700 trailer1700;
    Reprec reprec;
    Header2a700 header2a700;
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


    public Trailer1700 getTrailer1700() {
        if (trailer1700 == null) {
            trailer1700 = new Trailer1700();
        }

        return trailer1700;
    }

    public void setTrailer1700(Trailer1700 trailer1700) {
        this.trailer1700 = trailer1700;
    }
    public Reprec getReprec() {
        if (reprec == null) {
            reprec = new Reprec();
        }

        return reprec;
    }

    public void setReprec(Reprec reprec) {
        this.reprec = reprec;
    }
    public Header2a700 getHeader2a700() {
        if (header2a700 == null) {
            header2a700 = new Header2a700();
        }

        return header2a700;
    }

    public void setHeader2a700(Header2a700 header2a700) {
        this.header2a700 = header2a700;
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
        str += trailer1700.hashCode();
        str += reprec.hashCode();
        str += header2a700.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public AsaprntCtx clone() {
        AsaprntCtx cloneObj = new AsaprntCtx();
        cloneObj.trailer1700 = new Trailer1700();
        cloneObj.trailer1700.set(trailer1700.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.header2a700 = new Header2a700();
        cloneObj.header2a700.set(header2a700.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Reprec reprec = AsaprntCtx.this.getReprec();

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }



        public AsaprntCtx getAsaprntCtx() {
            return AsaprntCtx.this;
        }

        public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessOutCtx implements Cloneable {
     Reprec reprec = AsaprntCtx.this.getReprec();

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }



        public AsaprntCtx getAsaprntCtx() {
            return AsaprntCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec.hashCode();
       return str.hashCode();
    }

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
     public class Process1Split3InCtx implements Cloneable {
     Reprec reprec = AsaprntCtx.this.getReprec();

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }



        public AsaprntCtx getAsaprntCtx() {
            return AsaprntCtx.this;
        }

        public Process1Split3OutCtx getProcess1Split3OutCtx() {
            return new Process1Split3OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec.hashCode();
       return str.hashCode();
    }

    public Process1Split3InCtx clone() {
        Process1Split3InCtx cloneObj = new Process1Split3InCtx();
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        return cloneObj;
    }

    }

    public Process1Split3InCtx getProcess1Split3InCtx() {
            return new Process1Split3InCtx();
    }
     public class Process1Split3OutCtx implements Cloneable {
     Reprec reprec = AsaprntCtx.this.getReprec();

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }



        public AsaprntCtx getAsaprntCtx() {
            return AsaprntCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec.hashCode();
       return str.hashCode();
    }

    public Process1Split3OutCtx clone() {
        Process1Split3OutCtx cloneObj = new Process1Split3OutCtx();
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        return cloneObj;
    }

    }

    public Process1Split3OutCtx getProcess1Split3OutCtx() {
            return new Process1Split3OutCtx();
    }
     public class Process2Split5InCtx implements Cloneable {
     Reprec reprec = AsaprntCtx.this.getReprec();
     Work work = AsaprntCtx.this.getWork();

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }



        public AsaprntCtx getAsaprntCtx() {
            return AsaprntCtx.this;
        }

        public Process2Split5OutCtx getProcess2Split5OutCtx() {
            return new Process2Split5OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Process2Split5InCtx clone() {
        Process2Split5InCtx cloneObj = new Process2Split5InCtx();
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process2Split5InCtx getProcess2Split5InCtx() {
            return new Process2Split5InCtx();
    }
     public class Process2Split5OutCtx implements Cloneable {
     Reprec reprec = AsaprntCtx.this.getReprec();
     Work work = AsaprntCtx.this.getWork();

	/**
	 *	Returns the value of lineSpace
	 *	@return lineSpace
	 */
	public short getLineSpace() throws CFException {        
   		return work.getLineSpace();
	}
	
	/**
	 * 	Update LineSpace with the passed value
	 *	@param number
	 */
	public void setLineSpace(short number)  throws CFException{
		work.setLineSpace(number);
	}

	public void setLineSpace(int number)  throws CFException{
		work.setLineSpace((short)number);
	}

	public void setLineSpace(long number)  throws CFException{
		work.setLineSpace((short)number);
	}



	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }



        public AsaprntCtx getAsaprntCtx() {
            return AsaprntCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += reprec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Process2Split5OutCtx clone() {
        Process2Split5OutCtx cloneObj = new Process2Split5OutCtx();
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process2Split5OutCtx getProcess2Split5OutCtx() {
            return new Process2Split5OutCtx();
    }
     public class Process3InCtx implements Cloneable {
     Trailer1700 trailer1700 = AsaprntCtx.this.getTrailer1700();
     Reprec reprec = AsaprntCtx.this.getReprec();
     Header2a700 header2a700 = AsaprntCtx.this.getHeader2a700();

	/**
	 *	Returns the value of trailer1700
	 *	@return trailer1700
	 */   
	 public Trailer1700 getTrailer1700() {
   	return trailer1700;
   }


	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of header2a700
	 *	@return header2a700
	 */   
	 public Header2a700 getHeader2a700() {
   	return header2a700;
   }



        public AsaprntCtx getAsaprntCtx() {
            return AsaprntCtx.this;
        }

        public Process3OutCtx getProcess3OutCtx() {
            return new Process3OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += trailer1700.hashCode();
        str += reprec.hashCode();
        str += header2a700.hashCode();
       return str.hashCode();
    }

    public Process3InCtx clone() {
        Process3InCtx cloneObj = new Process3InCtx();
        cloneObj.trailer1700 = new Trailer1700();
        cloneObj.trailer1700.set(trailer1700.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.header2a700 = new Header2a700();
        cloneObj.header2a700.set(header2a700.getClonedField());
        return cloneObj;
    }

    }

    public Process3InCtx getProcess3InCtx() {
            return new Process3InCtx();
    }
     public class Process3OutCtx implements Cloneable {
     Trailer1700 trailer1700 = AsaprntCtx.this.getTrailer1700();
     Reprec reprec = AsaprntCtx.this.getReprec();
     Header2a700 header2a700 = AsaprntCtx.this.getHeader2a700();

	/**
	 *	Returns the value of t1TotLen700
	 *	@return t1TotLen700
	 */
   public char[] getT1TotLen700() throws CFException  {              
   		return trailer1700.getT1TotLen700();
   }

  
	/**
	*  set variable t1TotLen700
	*  @param value
	**/
   public void setT1TotLen700(char[] value) throws CFException {
      trailer1700.setT1TotLen700(value);
   } 

     /**
	 * 	Update T1TotLen700 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setT1TotLen700(char[] source, int sourceIndex) throws CFException {
      trailer1700.setT1TotLen700(source, sourceIndex);
   	
   }
   
   public void setT1TotLen700(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      trailer1700.setT1TotLen700(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update T1TotLen700 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setT1TotLen700(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trailer1700.setT1TotLen700(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update T1TotLen700 with another Field
	 *	@param value
	 */
   public void setT1TotLen700(Field source) {
      trailer1700.setT1TotLen700(source);
   }  
   
     /**
	 * 	Update T1TotLen700 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setT1TotLen700(Field source, int sourceIndex,int sourceLen) {
      trailer1700.setT1TotLen700(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update T1TotLen700 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setT1TotLen700(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      trailer1700.setT1TotLen700(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of reprec
	 *	@return reprec
	 */   
	 public Reprec getReprec() {
   	return reprec;
   }


	/**
	 *	Returns the value of h2aTimeRun700
	 *	@return h2aTimeRun700
	 */
   public char[] getH2aTimeRun700() throws CFException  {              
   		return header2a700.getH2aTimeRun700();
   }

  
	/**
	*  set variable h2aTimeRun700
	*  @param value
	**/
   public void setH2aTimeRun700(char[] value) throws CFException {
      header2a700.setH2aTimeRun700(value);
   } 

     /**
	 * 	Update H2aTimeRun700 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setH2aTimeRun700(char[] source, int sourceIndex) throws CFException {
      header2a700.setH2aTimeRun700(source, sourceIndex);
   	
   }
   
   public void setH2aTimeRun700(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      header2a700.setH2aTimeRun700(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update H2aTimeRun700 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setH2aTimeRun700(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      header2a700.setH2aTimeRun700(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update H2aTimeRun700 with another Field
	 *	@param value
	 */
   public void setH2aTimeRun700(Field source) {
      header2a700.setH2aTimeRun700(source);
   }  
   
     /**
	 * 	Update H2aTimeRun700 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setH2aTimeRun700(Field source, int sourceIndex,int sourceLen) {
      header2a700.setH2aTimeRun700(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update H2aTimeRun700 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setH2aTimeRun700(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      header2a700.setH2aTimeRun700(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public AsaprntCtx getAsaprntCtx() {
            return AsaprntCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += trailer1700.hashCode();
        str += reprec.hashCode();
        str += header2a700.hashCode();
       return str.hashCode();
    }

    public Process3OutCtx clone() {
        Process3OutCtx cloneObj = new Process3OutCtx();
        cloneObj.trailer1700 = new Trailer1700();
        cloneObj.trailer1700.set(trailer1700.getClonedField());
        cloneObj.reprec = new Reprec();
        cloneObj.reprec.set(reprec.getClonedField());
        cloneObj.header2a700 = new Header2a700();
        cloneObj.header2a700.set(header2a700.getClonedField());
        return cloneObj;
    }

    }

    public Process3OutCtx getProcess3OutCtx() {
            return new Process3OutCtx();
    }
}
