package org.optum.uhg.dto.cics0009;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.cics.CICSSession;
 
 
 
 
 


@Context
public class Cics0009Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    DfhcommareaGroup dfhcommareaGroup;
    LsDfhcommarea lsDfhcommarea;
    Work work;
    Ls003RequestDataGroup ls003RequestDataGroup;


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

    CICSSession cicsSession = new CICSSession();

    public CICSSession getCicsSession() {
        return this.cicsSession;
    }

    public void setCicsSession(CICSSession cicsSession) {
        this.cicsSession = cicsSession;
    }


    boolean programEnded = false;

    public boolean isProgramEnded() {
        return this.programEnded;
    }

    public void setProgramEnded(boolean programEnded) {
        this.programEnded = programEnded;
    }


    public DfhcommareaGroup getDfhcommareaGroup() {
        if (dfhcommareaGroup == null) {
            dfhcommareaGroup = new DfhcommareaGroup();
        }

        return dfhcommareaGroup;
    }

    public void setDfhcommareaGroup(DfhcommareaGroup dfhcommareaGroup) {
        this.dfhcommareaGroup = dfhcommareaGroup;
    }
    public LsDfhcommarea getLsDfhcommarea() {
        if (lsDfhcommarea == null) {
            lsDfhcommarea = new LsDfhcommarea();
        }

        return lsDfhcommarea;
    }

    public void setLsDfhcommarea(LsDfhcommarea lsDfhcommarea) {
        this.lsDfhcommarea = lsDfhcommarea;
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
    public Ls003RequestDataGroup getLs003RequestDataGroup() {
        if (ls003RequestDataGroup == null) {
            ls003RequestDataGroup = new Ls003RequestDataGroup();
        }

        return ls003RequestDataGroup;
    }

    public void setLs003RequestDataGroup(Ls003RequestDataGroup ls003RequestDataGroup) {
        this.ls003RequestDataGroup = ls003RequestDataGroup;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dfhcommareaGroup.hashCode();
        str += lsDfhcommarea.hashCode();
        str += work.hashCode();
        str += ls003RequestDataGroup.hashCode();
       return str.hashCode();
    }

    public Cics0009Ctx clone() {
        Cics0009Ctx cloneObj = new Cics0009Ctx();
        cloneObj.dfhcommareaGroup = new DfhcommareaGroup();
        cloneObj.dfhcommareaGroup.set(dfhcommareaGroup.getClonedField());
        cloneObj.lsDfhcommarea = new LsDfhcommarea();
        cloneObj.lsDfhcommarea.set(lsDfhcommarea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ls003RequestDataGroup = new Ls003RequestDataGroup();
        cloneObj.ls003RequestDataGroup.set(ls003RequestDataGroup.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     DfhcommareaGroup dfhcommareaGroup = Cics0009Ctx.this.getDfhcommareaGroup();


        public Cics0009Ctx getCics0009Ctx() {
            return Cics0009Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dfhcommareaGroup.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.dfhcommareaGroup = new DfhcommareaGroup();
        cloneObj.dfhcommareaGroup.set(dfhcommareaGroup.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class MainlineInCtx implements Cloneable {
     LsDfhcommarea lsDfhcommarea = Cics0009Ctx.this.getLsDfhcommarea();
     Work work = Cics0009Ctx.this.getWork();

	/**
	 *	Returns the value of cicsresp2
	 *	@return cicsresp2
	 */
	public int getCicsresp2() throws CFException {        
   		return work.getCicsresp2();
	}
	
	/**
	 * 	Update Cicsresp2 with the passed value
	 *	@param number
	 */
	public void setCicsresp2(int number)  throws CFException{
		work.setCicsresp2(number);
	}


	public void setCicsresp2(long number)  throws CFException{
		work.setCicsresp2((int)number);
	}


	/**
	 *	Returns the value of cicsresp
	 *	@return cicsresp
	 */
	public int getCicsresp() throws CFException {        
   		return work.getCicsresp();
	}
	
	/**
	 * 	Update Cicsresp with the passed value
	 *	@param number
	 */
	public void setCicsresp(int number)  throws CFException{
		work.setCicsresp(number);
	}


	public void setCicsresp(long number)  throws CFException{
		work.setCicsresp((int)number);
	}


	/**
	 *	Returns the value of lsDfhcommarea
	 *	@return lsDfhcommarea
	 */   
	 public LsDfhcommarea getLsDfhcommarea() {
   	return lsDfhcommarea;
   }


	/**
	 *	Returns the value of lsRequestType
	 *	@return lsRequestType
	 */
	public int getLsRequestType() throws CFException {        
   		return lsDfhcommarea.getLsRequestType();
	}
	
	/**
	 * 	Update LsRequestType with the passed value
	 *	@param number
	 */
	public void setLsRequestType(int number)  throws CFException{
		lsDfhcommarea.setLsRequestType(number);
	}


	public void setLsRequestType(long number)  throws CFException{
		lsDfhcommarea.setLsRequestType((int)number);
	}



        public Cics0009Ctx getCics0009Ctx() {
            return Cics0009Ctx.this;
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
        str += lsDfhcommarea.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.lsDfhcommarea = new LsDfhcommarea();
        cloneObj.lsDfhcommarea.set(lsDfhcommarea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     LsDfhcommarea lsDfhcommarea = Cics0009Ctx.this.getLsDfhcommarea();
     Work work = Cics0009Ctx.this.getWork();

	/**
	 *	Returns the value of lsReturnEibresp2
	 *	@return lsReturnEibresp2
	 */
	public long getLsReturnEibresp2() throws CFException {
   		return lsDfhcommarea.getLsReturnEibresp2();
	}


	/**
	 *	Returns String value of lsReturnEibresp2
	 *	@return lsReturnEibresp2
	 */
	public char[]  getLsReturnEibresp2String() throws CFException {
	     return String.valueOf(lsDfhcommarea.getLsReturnEibresp2String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsReturnEibresp2IsNumeric()  throws CFException{
	    return lsDfhcommarea.lsReturnEibresp2IsNumeric();
	}

	/**
	 * 	Update LsReturnEibresp2 with the passed value
	 *	@param number
	 */
	public void setLsReturnEibresp2(long number)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp2(number);
	}
	

	
	/**
	 * 	Update LsReturnEibresp2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp2(char[] value)  throws CFException {
		lsDfhcommarea.setLsReturnEibresp2(value);
	}
	
	/**
	 * 	Update LsReturnEibresp2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp2String(char[] value)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp2(value);
	}	

	/**
	 *	Returns the value of lsReturnCode
	 *	@return lsReturnCode
	 */
	public int getLsReturnCode() throws CFException {
   		return lsDfhcommarea.getLsReturnCode();
	}


	/**
	 *	Returns String value of lsReturnCode
	 *	@return lsReturnCode
	 */
	public char[]  getLsReturnCodeString() throws CFException {
	     return String.valueOf(lsDfhcommarea.getLsReturnCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsReturnCodeIsNumeric()  throws CFException{
	    return lsDfhcommarea.lsReturnCodeIsNumeric();
	}

	/**
	 * 	Update LsReturnCode with the passed value
	 *	@param number
	 */
	public void setLsReturnCode(int number)  throws CFException{
		lsDfhcommarea.setLsReturnCode(number);
	}
	

	public void setLsReturnCode(long number)  throws CFException{
	    lsDfhcommarea.setLsReturnCode(number);
	}
	
	
	/**
	 * 	Update LsReturnCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnCode(char[] value)  throws CFException {
		lsDfhcommarea.setLsReturnCode(value);
	}
	
	/**
	 * 	Update LsReturnCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnCodeString(char[] value)  throws CFException{
		lsDfhcommarea.setLsReturnCode(value);
	}	

	/**
	 *	Returns the value of lsReturnEibresp
	 *	@return lsReturnEibresp
	 */
	public long getLsReturnEibresp() throws CFException {
   		return lsDfhcommarea.getLsReturnEibresp();
	}


	/**
	 *	Returns String value of lsReturnEibresp
	 *	@return lsReturnEibresp
	 */
	public char[]  getLsReturnEibrespString() throws CFException {
	     return String.valueOf(lsDfhcommarea.getLsReturnEibrespString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsReturnEibrespIsNumeric()  throws CFException{
	    return lsDfhcommarea.lsReturnEibrespIsNumeric();
	}

	/**
	 * 	Update LsReturnEibresp with the passed value
	 *	@param number
	 */
	public void setLsReturnEibresp(long number)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp(number);
	}
	

	
	/**
	 * 	Update LsReturnEibresp with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp(char[] value)  throws CFException {
		lsDfhcommarea.setLsReturnEibresp(value);
	}
	
	/**
	 * 	Update LsReturnEibresp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibrespString(char[] value)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp(value);
	}	


        public Cics0009Ctx getCics0009Ctx() {
            return Cics0009Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += lsDfhcommarea.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.lsDfhcommarea = new LsDfhcommarea();
        cloneObj.lsDfhcommarea.set(lsDfhcommarea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class PutRequestInCtx implements Cloneable {
     LsDfhcommarea lsDfhcommarea = Cics0009Ctx.this.getLsDfhcommarea();
     Work work = Cics0009Ctx.this.getWork();

	/**
	 *	Returns the value of channelName
	 *	@return channelName
	 */
   public char[] getChannelName() throws CFException  {              
   		return work.getChannelName();
   }

  
	/**
	*  set variable channelName
	*  @param value
	**/
   public void setChannelName(char[] value) throws CFException {
      work.setChannelName(value);
   } 

	/**
	 *	Returns the value of cicsresp2
	 *	@return cicsresp2
	 */
	public int getCicsresp2() throws CFException {        
   		return work.getCicsresp2();
	}
	
	/**
	 * 	Update Cicsresp2 with the passed value
	 *	@param number
	 */
	public void setCicsresp2(int number)  throws CFException{
		work.setCicsresp2(number);
	}


	public void setCicsresp2(long number)  throws CFException{
		work.setCicsresp2((int)number);
	}


	/**
	 *	Returns the value of cicsresp
	 *	@return cicsresp
	 */
	public int getCicsresp() throws CFException {        
   		return work.getCicsresp();
	}
	
	/**
	 * 	Update Cicsresp with the passed value
	 *	@param number
	 */
	public void setCicsresp(int number)  throws CFException{
		work.setCicsresp(number);
	}


	public void setCicsresp(long number)  throws CFException{
		work.setCicsresp((int)number);
	}


	/**
	 *	Returns the value of lsRequestData
	 *	@return lsRequestData
	 */
   public char[] getLsRequestData() throws CFException  {              
   		return lsDfhcommarea.getLsRequestDataGroup().getLsRequestData();
   }

  
	/**
	*  set variable lsRequestData
	*  @param value
	**/
   public void setLsRequestData(char[] value) throws CFException {
      lsDfhcommarea.getLsRequestDataGroup().setLsRequestData(value);
   } 

     /**
	 * 	Update LsRequestData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsRequestData(char[] source, int sourceIndex) throws CFException {
      lsDfhcommarea.getLsRequestDataGroup().setLsRequestData(source, sourceIndex);
   	
   }
   
   public void setLsRequestData(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lsDfhcommarea.getLsRequestDataGroup().setLsRequestData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsRequestData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsRequestData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsDfhcommarea.getLsRequestDataGroup().setLsRequestData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsRequestData with another Field
	 *	@param value
	 */
   public void setLsRequestData(Field source) {
      lsDfhcommarea.getLsRequestDataGroup().setLsRequestData(source);
   }  
   
     /**
	 * 	Update LsRequestData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsRequestData(Field source, int sourceIndex,int sourceLen) {
      lsDfhcommarea.getLsRequestDataGroup().setLsRequestData(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsRequestData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsRequestData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsDfhcommarea.getLsRequestDataGroup().setLsRequestData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of containerName
	 *	@return containerName
	 */
   public char[] getContainerName() throws CFException  {              
   		return work.getContainerName();
   }

  
	/**
	*  set variable containerName
	*  @param value
	**/
   public void setContainerName(char[] value) throws CFException {
      work.setContainerName(value);
   } 


        public Cics0009Ctx getCics0009Ctx() {
            return Cics0009Ctx.this;
        }

        public PutRequestOutCtx getPutRequestOutCtx() {
            return new PutRequestOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += lsDfhcommarea.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public PutRequestInCtx clone() {
        PutRequestInCtx cloneObj = new PutRequestInCtx();
        cloneObj.lsDfhcommarea = new LsDfhcommarea();
        cloneObj.lsDfhcommarea.set(lsDfhcommarea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public PutRequestInCtx getPutRequestInCtx() {
            return new PutRequestInCtx();
    }
     public class PutRequestOutCtx implements Cloneable {
     LsDfhcommarea lsDfhcommarea = Cics0009Ctx.this.getLsDfhcommarea();
     Work work = Cics0009Ctx.this.getWork();

	/**
	 *	Returns the value of cicsresp2
	 *	@return cicsresp2
	 */
	public int getCicsresp2() throws CFException {        
   		return work.getCicsresp2();
	}
	
	/**
	 * 	Update Cicsresp2 with the passed value
	 *	@param number
	 */
	public void setCicsresp2(int number)  throws CFException{
		work.setCicsresp2(number);
	}


	public void setCicsresp2(long number)  throws CFException{
		work.setCicsresp2((int)number);
	}


	/**
	 *	Returns the value of cicsresp
	 *	@return cicsresp
	 */
	public int getCicsresp() throws CFException {        
   		return work.getCicsresp();
	}
	
	/**
	 * 	Update Cicsresp with the passed value
	 *	@param number
	 */
	public void setCicsresp(int number)  throws CFException{
		work.setCicsresp(number);
	}


	public void setCicsresp(long number)  throws CFException{
		work.setCicsresp((int)number);
	}


	/**
	 *	Returns the value of lsReturnEibresp2
	 *	@return lsReturnEibresp2
	 */
	public long getLsReturnEibresp2() throws CFException {
   		return lsDfhcommarea.getLsReturnEibresp2();
	}


	/**
	 *	Returns String value of lsReturnEibresp2
	 *	@return lsReturnEibresp2
	 */
	public char[]  getLsReturnEibresp2String() throws CFException {
	     return String.valueOf(lsDfhcommarea.getLsReturnEibresp2String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsReturnEibresp2IsNumeric()  throws CFException{
	    return lsDfhcommarea.lsReturnEibresp2IsNumeric();
	}

	/**
	 * 	Update LsReturnEibresp2 with the passed value
	 *	@param number
	 */
	public void setLsReturnEibresp2(long number)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp2(number);
	}
	

	
	/**
	 * 	Update LsReturnEibresp2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp2(char[] value)  throws CFException {
		lsDfhcommarea.setLsReturnEibresp2(value);
	}
	
	/**
	 * 	Update LsReturnEibresp2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp2String(char[] value)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp2(value);
	}	

	/**
	 *	Returns the value of lsReturnCode
	 *	@return lsReturnCode
	 */
	public int getLsReturnCode() throws CFException {
   		return lsDfhcommarea.getLsReturnCode();
	}


	/**
	 *	Returns String value of lsReturnCode
	 *	@return lsReturnCode
	 */
	public char[]  getLsReturnCodeString() throws CFException {
	     return String.valueOf(lsDfhcommarea.getLsReturnCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsReturnCodeIsNumeric()  throws CFException{
	    return lsDfhcommarea.lsReturnCodeIsNumeric();
	}

	/**
	 * 	Update LsReturnCode with the passed value
	 *	@param number
	 */
	public void setLsReturnCode(int number)  throws CFException{
		lsDfhcommarea.setLsReturnCode(number);
	}
	

	public void setLsReturnCode(long number)  throws CFException{
	    lsDfhcommarea.setLsReturnCode(number);
	}
	
	
	/**
	 * 	Update LsReturnCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnCode(char[] value)  throws CFException {
		lsDfhcommarea.setLsReturnCode(value);
	}
	
	/**
	 * 	Update LsReturnCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnCodeString(char[] value)  throws CFException{
		lsDfhcommarea.setLsReturnCode(value);
	}	

	/**
	 *	Returns the value of lsReturnEibresp
	 *	@return lsReturnEibresp
	 */
	public long getLsReturnEibresp() throws CFException {
   		return lsDfhcommarea.getLsReturnEibresp();
	}


	/**
	 *	Returns String value of lsReturnEibresp
	 *	@return lsReturnEibresp
	 */
	public char[]  getLsReturnEibrespString() throws CFException {
	     return String.valueOf(lsDfhcommarea.getLsReturnEibrespString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsReturnEibrespIsNumeric()  throws CFException{
	    return lsDfhcommarea.lsReturnEibrespIsNumeric();
	}

	/**
	 * 	Update LsReturnEibresp with the passed value
	 *	@param number
	 */
	public void setLsReturnEibresp(long number)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp(number);
	}
	

	
	/**
	 * 	Update LsReturnEibresp with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp(char[] value)  throws CFException {
		lsDfhcommarea.setLsReturnEibresp(value);
	}
	
	/**
	 * 	Update LsReturnEibresp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibrespString(char[] value)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp(value);
	}	


        public Cics0009Ctx getCics0009Ctx() {
            return Cics0009Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += lsDfhcommarea.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public PutRequestOutCtx clone() {
        PutRequestOutCtx cloneObj = new PutRequestOutCtx();
        cloneObj.lsDfhcommarea = new LsDfhcommarea();
        cloneObj.lsDfhcommarea.set(lsDfhcommarea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public PutRequestOutCtx getPutRequestOutCtx() {
            return new PutRequestOutCtx();
    }
     public class PutRequest0002InCtx implements Cloneable {
     LsDfhcommarea lsDfhcommarea = Cics0009Ctx.this.getLsDfhcommarea();
     Work work = Cics0009Ctx.this.getWork();

	/**
	 *	Returns the value of channelName
	 *	@return channelName
	 */
   public char[] getChannelName() throws CFException  {              
   		return work.getChannelName();
   }

  
	/**
	*  set variable channelName
	*  @param value
	**/
   public void setChannelName(char[] value) throws CFException {
      work.setChannelName(value);
   } 

	/**
	 *	Returns the value of cicsresp2
	 *	@return cicsresp2
	 */
	public int getCicsresp2() throws CFException {        
   		return work.getCicsresp2();
	}
	
	/**
	 * 	Update Cicsresp2 with the passed value
	 *	@param number
	 */
	public void setCicsresp2(int number)  throws CFException{
		work.setCicsresp2(number);
	}


	public void setCicsresp2(long number)  throws CFException{
		work.setCicsresp2((int)number);
	}


	/**
	 *	Returns the value of cicsresp
	 *	@return cicsresp
	 */
	public int getCicsresp() throws CFException {        
   		return work.getCicsresp();
	}
	
	/**
	 * 	Update Cicsresp with the passed value
	 *	@param number
	 */
	public void setCicsresp(int number)  throws CFException{
		work.setCicsresp(number);
	}


	public void setCicsresp(long number)  throws CFException{
		work.setCicsresp((int)number);
	}


	/**
	 *	Returns the value of lsRequestData
	 *	@return lsRequestData
	 */
   public char[] getLsRequestData() throws CFException  {              
   		return lsDfhcommarea.getLsRequestDataGroup().getLsRequestData();
   }

  
	/**
	*  set variable lsRequestData
	*  @param value
	**/
   public void setLsRequestData(char[] value) throws CFException {
      lsDfhcommarea.getLsRequestDataGroup().setLsRequestData(value);
   } 

     /**
	 * 	Update LsRequestData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsRequestData(char[] source, int sourceIndex) throws CFException {
      lsDfhcommarea.getLsRequestDataGroup().setLsRequestData(source, sourceIndex);
   	
   }
   
   public void setLsRequestData(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lsDfhcommarea.getLsRequestDataGroup().setLsRequestData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsRequestData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsRequestData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsDfhcommarea.getLsRequestDataGroup().setLsRequestData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsRequestData with another Field
	 *	@param value
	 */
   public void setLsRequestData(Field source) {
      lsDfhcommarea.getLsRequestDataGroup().setLsRequestData(source);
   }  
   
     /**
	 * 	Update LsRequestData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsRequestData(Field source, int sourceIndex,int sourceLen) {
      lsDfhcommarea.getLsRequestDataGroup().setLsRequestData(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsRequestData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsRequestData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsDfhcommarea.getLsRequestDataGroup().setLsRequestData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of requestData002
	 *	@return requestData002
	 */
   public char[] getRequestData002() throws CFException  {              
   		return work.getRequestData002();
   }

  
	/**
	*  set variable requestData002
	*  @param value
	**/
   public void setRequestData002(char[] value) throws CFException {
      work.setRequestData002(value);
   } 

	/**
	 *	Returns the value of containerName
	 *	@return containerName
	 */
   public char[] getContainerName() throws CFException  {              
   		return work.getContainerName();
   }

  
	/**
	*  set variable containerName
	*  @param value
	**/
   public void setContainerName(char[] value) throws CFException {
      work.setContainerName(value);
   } 


        public Cics0009Ctx getCics0009Ctx() {
            return Cics0009Ctx.this;
        }

        public PutRequest0002OutCtx getPutRequest0002OutCtx() {
            return new PutRequest0002OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += lsDfhcommarea.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public PutRequest0002InCtx clone() {
        PutRequest0002InCtx cloneObj = new PutRequest0002InCtx();
        cloneObj.lsDfhcommarea = new LsDfhcommarea();
        cloneObj.lsDfhcommarea.set(lsDfhcommarea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public PutRequest0002InCtx getPutRequest0002InCtx() {
            return new PutRequest0002InCtx();
    }
     public class PutRequest0002OutCtx implements Cloneable {
     LsDfhcommarea lsDfhcommarea = Cics0009Ctx.this.getLsDfhcommarea();
     Work work = Cics0009Ctx.this.getWork();

	/**
	 *	Returns the value of cicsresp2
	 *	@return cicsresp2
	 */
	public int getCicsresp2() throws CFException {        
   		return work.getCicsresp2();
	}
	
	/**
	 * 	Update Cicsresp2 with the passed value
	 *	@param number
	 */
	public void setCicsresp2(int number)  throws CFException{
		work.setCicsresp2(number);
	}


	public void setCicsresp2(long number)  throws CFException{
		work.setCicsresp2((int)number);
	}


	/**
	 *	Returns the value of cicsresp
	 *	@return cicsresp
	 */
	public int getCicsresp() throws CFException {        
   		return work.getCicsresp();
	}
	
	/**
	 * 	Update Cicsresp with the passed value
	 *	@param number
	 */
	public void setCicsresp(int number)  throws CFException{
		work.setCicsresp(number);
	}


	public void setCicsresp(long number)  throws CFException{
		work.setCicsresp((int)number);
	}


	/**
	 *	Returns the value of lsReturnEibresp2
	 *	@return lsReturnEibresp2
	 */
	public long getLsReturnEibresp2() throws CFException {
   		return lsDfhcommarea.getLsReturnEibresp2();
	}


	/**
	 *	Returns String value of lsReturnEibresp2
	 *	@return lsReturnEibresp2
	 */
	public char[]  getLsReturnEibresp2String() throws CFException {
	     return String.valueOf(lsDfhcommarea.getLsReturnEibresp2String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsReturnEibresp2IsNumeric()  throws CFException{
	    return lsDfhcommarea.lsReturnEibresp2IsNumeric();
	}

	/**
	 * 	Update LsReturnEibresp2 with the passed value
	 *	@param number
	 */
	public void setLsReturnEibresp2(long number)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp2(number);
	}
	

	
	/**
	 * 	Update LsReturnEibresp2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp2(char[] value)  throws CFException {
		lsDfhcommarea.setLsReturnEibresp2(value);
	}
	
	/**
	 * 	Update LsReturnEibresp2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp2String(char[] value)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp2(value);
	}	

	/**
	 *	Returns the value of lsRequestData
	 *	@return lsRequestData
	 */
   public char[] getLsRequestData() throws CFException  {              
   		return lsDfhcommarea.getLsRequestDataGroup().getLsRequestData();
   }

  
	/**
	*  set variable lsRequestData
	*  @param value
	**/
   public void setLsRequestData(char[] value) throws CFException {
      lsDfhcommarea.getLsRequestDataGroup().setLsRequestData(value);
   } 

     /**
	 * 	Update LsRequestData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsRequestData(char[] source, int sourceIndex) throws CFException {
      lsDfhcommarea.getLsRequestDataGroup().setLsRequestData(source, sourceIndex);
   	
   }
   
   public void setLsRequestData(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lsDfhcommarea.getLsRequestDataGroup().setLsRequestData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsRequestData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsRequestData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsDfhcommarea.getLsRequestDataGroup().setLsRequestData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsRequestData with another Field
	 *	@param value
	 */
   public void setLsRequestData(Field source) {
      lsDfhcommarea.getLsRequestDataGroup().setLsRequestData(source);
   }  
   
     /**
	 * 	Update LsRequestData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsRequestData(Field source, int sourceIndex,int sourceLen) {
      lsDfhcommarea.getLsRequestDataGroup().setLsRequestData(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsRequestData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsRequestData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsDfhcommarea.getLsRequestDataGroup().setLsRequestData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of requestData002
	 *	@return requestData002
	 */
   public char[] getRequestData002() throws CFException  {              
   		return work.getRequestData002();
   }

  
	/**
	*  set variable requestData002
	*  @param value
	**/
   public void setRequestData002(char[] value) throws CFException {
      work.setRequestData002(value);
   } 

	/**
	 *	Returns the value of lsReturnCode
	 *	@return lsReturnCode
	 */
	public int getLsReturnCode() throws CFException {
   		return lsDfhcommarea.getLsReturnCode();
	}


	/**
	 *	Returns String value of lsReturnCode
	 *	@return lsReturnCode
	 */
	public char[]  getLsReturnCodeString() throws CFException {
	     return String.valueOf(lsDfhcommarea.getLsReturnCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsReturnCodeIsNumeric()  throws CFException{
	    return lsDfhcommarea.lsReturnCodeIsNumeric();
	}

	/**
	 * 	Update LsReturnCode with the passed value
	 *	@param number
	 */
	public void setLsReturnCode(int number)  throws CFException{
		lsDfhcommarea.setLsReturnCode(number);
	}
	

	public void setLsReturnCode(long number)  throws CFException{
	    lsDfhcommarea.setLsReturnCode(number);
	}
	
	
	/**
	 * 	Update LsReturnCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnCode(char[] value)  throws CFException {
		lsDfhcommarea.setLsReturnCode(value);
	}
	
	/**
	 * 	Update LsReturnCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnCodeString(char[] value)  throws CFException{
		lsDfhcommarea.setLsReturnCode(value);
	}	

	/**
	 *	Returns the value of containerLength
	 *	@return containerLength
	 */
	public int getContainerLength() throws CFException {        
   		return work.getContainerLength();
	}
	
	/**
	 * 	Update ContainerLength with the passed value
	 *	@param number
	 */
	public void setContainerLength(int number)  throws CFException{
		work.setContainerLength(number);
	}


	public void setContainerLength(long number)  throws CFException{
		work.setContainerLength((int)number);
	}


	/**
	 *	Returns the value of lsReturnEibresp
	 *	@return lsReturnEibresp
	 */
	public long getLsReturnEibresp() throws CFException {
   		return lsDfhcommarea.getLsReturnEibresp();
	}


	/**
	 *	Returns String value of lsReturnEibresp
	 *	@return lsReturnEibresp
	 */
	public char[]  getLsReturnEibrespString() throws CFException {
	     return String.valueOf(lsDfhcommarea.getLsReturnEibrespString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsReturnEibrespIsNumeric()  throws CFException{
	    return lsDfhcommarea.lsReturnEibrespIsNumeric();
	}

	/**
	 * 	Update LsReturnEibresp with the passed value
	 *	@param number
	 */
	public void setLsReturnEibresp(long number)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp(number);
	}
	

	
	/**
	 * 	Update LsReturnEibresp with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp(char[] value)  throws CFException {
		lsDfhcommarea.setLsReturnEibresp(value);
	}
	
	/**
	 * 	Update LsReturnEibresp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibrespString(char[] value)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp(value);
	}	


        public Cics0009Ctx getCics0009Ctx() {
            return Cics0009Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += lsDfhcommarea.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public PutRequest0002OutCtx clone() {
        PutRequest0002OutCtx cloneObj = new PutRequest0002OutCtx();
        cloneObj.lsDfhcommarea = new LsDfhcommarea();
        cloneObj.lsDfhcommarea.set(lsDfhcommarea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public PutRequest0002OutCtx getPutRequest0002OutCtx() {
            return new PutRequest0002OutCtx();
    }
     public class PutRequest0003InCtx implements Cloneable {
     LsDfhcommarea lsDfhcommarea = Cics0009Ctx.this.getLsDfhcommarea();
     Work work = Cics0009Ctx.this.getWork();
     Ls003RequestDataGroup ls003RequestDataGroup = Cics0009Ctx.this.getLs003RequestDataGroup();

	/**
	 *	Returns the value of channelName
	 *	@return channelName
	 */
   public char[] getChannelName() throws CFException  {              
   		return work.getChannelName();
   }

  
	/**
	*  set variable channelName
	*  @param value
	**/
   public void setChannelName(char[] value) throws CFException {
      work.setChannelName(value);
   } 

	/**
	 *	Returns the value of cicsresp2
	 *	@return cicsresp2
	 */
	public int getCicsresp2() throws CFException {        
   		return work.getCicsresp2();
	}
	
	/**
	 * 	Update Cicsresp2 with the passed value
	 *	@param number
	 */
	public void setCicsresp2(int number)  throws CFException{
		work.setCicsresp2(number);
	}


	public void setCicsresp2(long number)  throws CFException{
		work.setCicsresp2((int)number);
	}


	/**
	 *	Returns the value of lsRequestDataGroup
	 *	@return lsRequestDataGroup
	 */   
	 public LsRequestDataGroup getLsRequestDataGroup() {
   	return lsDfhcommarea.getLsRequestDataGroup();
   }

   /**
	* 	Update LsRequestDataGroup with the passed value
	*	@param value
	*/
   public void setLsRequestDataGroup(char[] value) throws CFException {
      lsDfhcommarea.setLsRequestDataGroup(value);
   }   

     /**
	 * 	Update LsRequestDataGroup 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setLsRequestDataGroup(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	lsDfhcommarea.setLsRequestDataGroup(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsRequestDataGroup 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsRequestDataGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	lsDfhcommarea.setLsRequestDataGroup(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsRequestDataGroup with another Field
	 *	@param value
	 */
   public void setLsRequestDataGroup(Field source) {
   	lsDfhcommarea.setLsRequestDataGroup(source);
   }  
   
     /**
	 * 	Update LsRequestDataGroup 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setLsRequestDataGroup(Field source, int sourceIndex,int sourceLen) {
   	lsDfhcommarea.setLsRequestDataGroup(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsRequestDataGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsRequestDataGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	lsDfhcommarea.setLsRequestDataGroup(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of cicsresp
	 *	@return cicsresp
	 */
	public int getCicsresp() throws CFException {        
   		return work.getCicsresp();
	}
	
	/**
	 * 	Update Cicsresp with the passed value
	 *	@param number
	 */
	public void setCicsresp(int number)  throws CFException{
		work.setCicsresp(number);
	}


	public void setCicsresp(long number)  throws CFException{
		work.setCicsresp((int)number);
	}


	/**
	 *	Returns the value of ls003RequestDataGroup
	 *	@return ls003RequestDataGroup
	 */   
	 public Ls003RequestDataGroup getLs003RequestDataGroup() {
   	return ls003RequestDataGroup;
   }


	/**
	 *	Returns the value of lsRequestData
	 *	@return lsRequestData
	 */
   public char[] getLsRequestData() throws CFException  {              
   		return lsDfhcommarea.getLsRequestDataGroup().getLsRequestData();
   }

  
	/**
	*  set variable lsRequestData
	*  @param value
	**/
   public void setLsRequestData(char[] value) throws CFException {
      lsDfhcommarea.getLsRequestDataGroup().setLsRequestData(value);
   } 

     /**
	 * 	Update LsRequestData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsRequestData(char[] source, int sourceIndex) throws CFException {
      lsDfhcommarea.getLsRequestDataGroup().setLsRequestData(source, sourceIndex);
   	
   }
   
   public void setLsRequestData(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lsDfhcommarea.getLsRequestDataGroup().setLsRequestData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsRequestData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsRequestData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsDfhcommarea.getLsRequestDataGroup().setLsRequestData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsRequestData with another Field
	 *	@param value
	 */
   public void setLsRequestData(Field source) {
      lsDfhcommarea.getLsRequestDataGroup().setLsRequestData(source);
   }  
   
     /**
	 * 	Update LsRequestData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsRequestData(Field source, int sourceIndex,int sourceLen) {
      lsDfhcommarea.getLsRequestDataGroup().setLsRequestData(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsRequestData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsRequestData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsDfhcommarea.getLsRequestDataGroup().setLsRequestData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of containerName
	 *	@return containerName
	 */
   public char[] getContainerName() throws CFException  {              
   		return work.getContainerName();
   }

  
	/**
	*  set variable containerName
	*  @param value
	**/
   public void setContainerName(char[] value) throws CFException {
      work.setContainerName(value);
   } 


        public Cics0009Ctx getCics0009Ctx() {
            return Cics0009Ctx.this;
        }

        public PutRequest0003OutCtx getPutRequest0003OutCtx() {
            return new PutRequest0003OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += lsDfhcommarea.hashCode();
        str += work.hashCode();
        str += ls003RequestDataGroup.hashCode();
       return str.hashCode();
    }

    public PutRequest0003InCtx clone() {
        PutRequest0003InCtx cloneObj = new PutRequest0003InCtx();
        cloneObj.lsDfhcommarea = new LsDfhcommarea();
        cloneObj.lsDfhcommarea.set(lsDfhcommarea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ls003RequestDataGroup = new Ls003RequestDataGroup();
        cloneObj.ls003RequestDataGroup.set(ls003RequestDataGroup.getClonedField());
        return cloneObj;
    }

    }

    public PutRequest0003InCtx getPutRequest0003InCtx() {
            return new PutRequest0003InCtx();
    }
     public class PutRequest0003OutCtx implements Cloneable {
     LsDfhcommarea lsDfhcommarea = Cics0009Ctx.this.getLsDfhcommarea();
     Work work = Cics0009Ctx.this.getWork();
     Ls003RequestDataGroup ls003RequestDataGroup = Cics0009Ctx.this.getLs003RequestDataGroup();

	/**
	 *	Returns the value of requestPtr
	 *	@return requestPtr
	 */
	public int getRequestPtr() throws CFException {        
   		return work.getRequestPtr();
	}
	
	/**
	 * 	Update RequestPtr with the passed value
	 *	@param number
	 */
	public void setRequestPtr(int number)  throws CFException{
		work.setRequestPtr(number);
	}


	public void setRequestPtr(long number)  throws CFException{
		work.setRequestPtr((int)number);
	}


	/**
	 *	Returns the value of cicsresp2
	 *	@return cicsresp2
	 */
	public int getCicsresp2() throws CFException {        
   		return work.getCicsresp2();
	}
	
	/**
	 * 	Update Cicsresp2 with the passed value
	 *	@param number
	 */
	public void setCicsresp2(int number)  throws CFException{
		work.setCicsresp2(number);
	}


	public void setCicsresp2(long number)  throws CFException{
		work.setCicsresp2((int)number);
	}


	/**
	 *	Returns the value of cicsresp
	 *	@return cicsresp
	 */
	public int getCicsresp() throws CFException {        
   		return work.getCicsresp();
	}
	
	/**
	 * 	Update Cicsresp with the passed value
	 *	@param number
	 */
	public void setCicsresp(int number)  throws CFException{
		work.setCicsresp(number);
	}


	public void setCicsresp(long number)  throws CFException{
		work.setCicsresp((int)number);
	}


	/**
	 *	Returns the value of ls003RequestData
	 *	@return ls003RequestData
	 */
   public char[] getLs003RequestData() throws CFException  {              
   		return ls003RequestDataGroup.getLs003RequestData();
   }

  
	/**
	*  set variable ls003RequestData
	*  @param value
	**/
   public void setLs003RequestData(char[] value) throws CFException {
      ls003RequestDataGroup.setLs003RequestData(value);
   } 

     /**
	 * 	Update Ls003RequestData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLs003RequestData(char[] source, int sourceIndex) throws CFException {
      ls003RequestDataGroup.setLs003RequestData(source, sourceIndex);
   	
   }
   
   public void setLs003RequestData(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ls003RequestDataGroup.setLs003RequestData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ls003RequestData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLs003RequestData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ls003RequestDataGroup.setLs003RequestData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ls003RequestData with another Field
	 *	@param value
	 */
   public void setLs003RequestData(Field source) {
      ls003RequestDataGroup.setLs003RequestData(source);
   }  
   
     /**
	 * 	Update Ls003RequestData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLs003RequestData(Field source, int sourceIndex,int sourceLen) {
      ls003RequestDataGroup.setLs003RequestData(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ls003RequestData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLs003RequestData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ls003RequestDataGroup.setLs003RequestData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsReturnEibresp2
	 *	@return lsReturnEibresp2
	 */
	public long getLsReturnEibresp2() throws CFException {
   		return lsDfhcommarea.getLsReturnEibresp2();
	}


	/**
	 *	Returns String value of lsReturnEibresp2
	 *	@return lsReturnEibresp2
	 */
	public char[]  getLsReturnEibresp2String() throws CFException {
	     return String.valueOf(lsDfhcommarea.getLsReturnEibresp2String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsReturnEibresp2IsNumeric()  throws CFException{
	    return lsDfhcommarea.lsReturnEibresp2IsNumeric();
	}

	/**
	 * 	Update LsReturnEibresp2 with the passed value
	 *	@param number
	 */
	public void setLsReturnEibresp2(long number)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp2(number);
	}
	

	
	/**
	 * 	Update LsReturnEibresp2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp2(char[] value)  throws CFException {
		lsDfhcommarea.setLsReturnEibresp2(value);
	}
	
	/**
	 * 	Update LsReturnEibresp2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp2String(char[] value)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp2(value);
	}	

	/**
	 *	Returns the value of lsReturnCode
	 *	@return lsReturnCode
	 */
	public int getLsReturnCode() throws CFException {
   		return lsDfhcommarea.getLsReturnCode();
	}


	/**
	 *	Returns String value of lsReturnCode
	 *	@return lsReturnCode
	 */
	public char[]  getLsReturnCodeString() throws CFException {
	     return String.valueOf(lsDfhcommarea.getLsReturnCodeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsReturnCodeIsNumeric()  throws CFException{
	    return lsDfhcommarea.lsReturnCodeIsNumeric();
	}

	/**
	 * 	Update LsReturnCode with the passed value
	 *	@param number
	 */
	public void setLsReturnCode(int number)  throws CFException{
		lsDfhcommarea.setLsReturnCode(number);
	}
	

	public void setLsReturnCode(long number)  throws CFException{
	    lsDfhcommarea.setLsReturnCode(number);
	}
	
	
	/**
	 * 	Update LsReturnCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnCode(char[] value)  throws CFException {
		lsDfhcommarea.setLsReturnCode(value);
	}
	
	/**
	 * 	Update LsReturnCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnCodeString(char[] value)  throws CFException{
		lsDfhcommarea.setLsReturnCode(value);
	}	

	/**
	 *	Returns the value of containerLength
	 *	@return containerLength
	 */
	public int getContainerLength() throws CFException {        
   		return work.getContainerLength();
	}
	
	/**
	 * 	Update ContainerLength with the passed value
	 *	@param number
	 */
	public void setContainerLength(int number)  throws CFException{
		work.setContainerLength(number);
	}


	public void setContainerLength(long number)  throws CFException{
		work.setContainerLength((int)number);
	}


	/**
	 *	Returns the value of lsReturnEibresp
	 *	@return lsReturnEibresp
	 */
	public long getLsReturnEibresp() throws CFException {
   		return lsDfhcommarea.getLsReturnEibresp();
	}


	/**
	 *	Returns String value of lsReturnEibresp
	 *	@return lsReturnEibresp
	 */
	public char[]  getLsReturnEibrespString() throws CFException {
	     return String.valueOf(lsDfhcommarea.getLsReturnEibrespString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsReturnEibrespIsNumeric()  throws CFException{
	    return lsDfhcommarea.lsReturnEibrespIsNumeric();
	}

	/**
	 * 	Update LsReturnEibresp with the passed value
	 *	@param number
	 */
	public void setLsReturnEibresp(long number)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp(number);
	}
	

	
	/**
	 * 	Update LsReturnEibresp with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibresp(char[] value)  throws CFException {
		lsDfhcommarea.setLsReturnEibresp(value);
	}
	
	/**
	 * 	Update LsReturnEibresp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsReturnEibrespString(char[] value)  throws CFException{
		lsDfhcommarea.setLsReturnEibresp(value);
	}	


        public Cics0009Ctx getCics0009Ctx() {
            return Cics0009Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += lsDfhcommarea.hashCode();
        str += work.hashCode();
        str += ls003RequestDataGroup.hashCode();
       return str.hashCode();
    }

    public PutRequest0003OutCtx clone() {
        PutRequest0003OutCtx cloneObj = new PutRequest0003OutCtx();
        cloneObj.lsDfhcommarea = new LsDfhcommarea();
        cloneObj.lsDfhcommarea.set(lsDfhcommarea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ls003RequestDataGroup = new Ls003RequestDataGroup();
        cloneObj.ls003RequestDataGroup.set(ls003RequestDataGroup.getClonedField());
        return cloneObj;
    }

    }

    public PutRequest0003OutCtx getPutRequest0003OutCtx() {
            return new PutRequest0003OutCtx();
    }
}
