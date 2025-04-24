package com.cloudframe.app.cfsort03;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.cfsort03.file.records.ClientsOut;
import com.cloudframe.app.cfsort03.file.records.ClientsIn;
import com.cloudframe.app.cfsort03.file.records.WorkClient;
import com.cloudframe.app.cfsort03.dto.Work;


@Context
public class Cfsort03Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    WorkClient workClient;
    Work work;
    ClientsOut clientsOut;
    ClientsIn clientsIn;


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


    public WorkClient getWorkClient() {
        if (workClient == null) {
            workClient = new WorkClient();
        }

        return workClient;
    }

    public void setWorkClient(WorkClient workClient) {
        this.workClient = workClient;
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
    public ClientsOut getClientsOut() {
        if (clientsOut == null) {
            clientsOut = new ClientsOut();
        }

        return clientsOut;
    }

    public void setClientsOut(ClientsOut clientsOut) {
        this.clientsOut = clientsOut;
    }
    public ClientsIn getClientsIn() {
        if (clientsIn == null) {
            clientsIn = new ClientsIn();
        }

        return clientsIn;
    }

    public void setClientsIn(ClientsIn clientsIn) {
        this.clientsIn = clientsIn;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += workClient.hashCode();
        str += work.hashCode();
        str += clientsOut.hashCode();
        str += clientsIn.hashCode();
       return str.hashCode();
    }

    public Cfsort03Ctx clone() {
        Cfsort03Ctx cloneObj = new Cfsort03Ctx();
        cloneObj.workClient = new WorkClient();
        cloneObj.workClient.set(workClient.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.clientsOut = new ClientsOut();
        cloneObj.clientsOut.set(clientsOut.getClonedField());
        cloneObj.clientsIn = new ClientsIn();
        cloneObj.clientsIn.set(clientsIn.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     WorkClient workClient = Cfsort03Ctx.this.getWorkClient();
     Work work = Cfsort03Ctx.this.getWork();
     ClientsOut clientsOut = Cfsort03Ctx.this.getClientsOut();
     ClientsIn clientsIn = Cfsort03Ctx.this.getClientsIn();

	/**
	 *	Returns the value of workClient
	 *	@return workClient
	 */   
	 public WorkClient getWorkClient() {
   	return workClient;
   }


	/**
	 *	Returns the value of clientsOut
	 *	@return clientsOut
	 */   
	 public ClientsOut getClientsOut() {
   	return clientsOut;
   }


	/**
	 *	Returns the value of cfoutStat
	 *	@return cfoutStat
	 */
	public int getCfoutStat() throws CFException {
   		return work.getCfoutStat();
	}


	/**
	 *	Returns String value of cfoutStat
	 *	@return cfoutStat
	 */
	public char[]  getCfoutStatString() throws CFException {
	     return String.valueOf(work.getCfoutStatString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cfoutStatIsNumeric()  throws CFException{
	    return work.cfoutStatIsNumeric();
	}

	/**
	 * 	Update CfoutStat with the passed value
	 *	@param number
	 */
	public void setCfoutStat(int number)  throws CFException{
		work.setCfoutStat(number);
	}
	

	public void setCfoutStat(long number)  throws CFException{
	    work.setCfoutStat(number);
	}
	
	
	/**
	 * 	Update CfoutStat with the passed value
	 *	@param value (String or char[])
	 */
	public void setCfoutStat(char[] value)  throws CFException {
		work.setCfoutStat(value);
	}
	
	/**
	 * 	Update CfoutStat with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCfoutStatString(char[] value)  throws CFException{
		work.setCfoutStat(value);
	}	

	/**
	 *	Returns the value of cfinStat
	 *	@return cfinStat
	 */
	public int getCfinStat() throws CFException {
   		return work.getCfinStat();
	}


	/**
	 *	Returns String value of cfinStat
	 *	@return cfinStat
	 */
	public char[]  getCfinStatString() throws CFException {
	     return String.valueOf(work.getCfinStatString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cfinStatIsNumeric()  throws CFException{
	    return work.cfinStatIsNumeric();
	}

	/**
	 * 	Update CfinStat with the passed value
	 *	@param number
	 */
	public void setCfinStat(int number)  throws CFException{
		work.setCfinStat(number);
	}
	

	public void setCfinStat(long number)  throws CFException{
	    work.setCfinStat(number);
	}
	
	
	/**
	 * 	Update CfinStat with the passed value
	 *	@param value (String or char[])
	 */
	public void setCfinStat(char[] value)  throws CFException {
		work.setCfinStat(value);
	}
	
	/**
	 * 	Update CfinStat with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCfinStatString(char[] value)  throws CFException{
		work.setCfinStat(value);
	}	

	/**
	 *	Returns the value of clientsIn
	 *	@return clientsIn
	 */   
	 public ClientsIn getClientsIn() {
   	return clientsIn;
   }


	/**
	 *	Returns the value of clientNumberWk
	 *	@return clientNumberWk
	 */
   public char[] getClientNumberWk() throws CFException  {              
   		return workClient.getClientNumberWk();
   }

  
	/**
	*  set variable clientNumberWk
	*  @param value
	**/
   public void setClientNumberWk(char[] value) throws CFException {
      workClient.setClientNumberWk(value);
   } 

     /**
	 * 	Update ClientNumberWk 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClientNumberWk(char[] source, int sourceIndex) throws CFException {
      workClient.setClientNumberWk(source, sourceIndex);
   	
   }
   
   public void setClientNumberWk(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      workClient.setClientNumberWk(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ClientNumberWk 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClientNumberWk(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      workClient.setClientNumberWk(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ClientNumberWk with another Field
	 *	@param value
	 */
   public void setClientNumberWk(Field source) {
      workClient.setClientNumberWk(source);
   }  
   
     /**
	 * 	Update ClientNumberWk 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClientNumberWk(Field source, int sourceIndex,int sourceLen) {
      workClient.setClientNumberWk(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ClientNumberWk 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClientNumberWk(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      workClient.setClientNumberWk(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Cfsort03Ctx getCfsort03Ctx() {
            return Cfsort03Ctx.this;
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
        str += workClient.hashCode();
        str += work.hashCode();
        str += clientsOut.hashCode();
        str += clientsIn.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.workClient = new WorkClient();
        cloneObj.workClient.set(workClient.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.clientsOut = new ClientsOut();
        cloneObj.clientsOut.set(clientsOut.getClonedField());
        cloneObj.clientsIn = new ClientsIn();
        cloneObj.clientsIn.set(clientsIn.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessOutCtx implements Cloneable {
     Work work = Cfsort03Ctx.this.getWork();
     WorkClient workClient = Cfsort03Ctx.this.getWorkClient();
     ClientsOut clientsOut = Cfsort03Ctx.this.getClientsOut();
     ClientsIn clientsIn = Cfsort03Ctx.this.getClientsIn();

	/**
	 *	Returns the value of cfoutStat
	 *	@return cfoutStat
	 */
	public int getCfoutStat() throws CFException {
   		return work.getCfoutStat();
	}


	/**
	 *	Returns String value of cfoutStat
	 *	@return cfoutStat
	 */
	public char[]  getCfoutStatString() throws CFException {
	     return String.valueOf(work.getCfoutStatString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cfoutStatIsNumeric()  throws CFException{
	    return work.cfoutStatIsNumeric();
	}

	/**
	 * 	Update CfoutStat with the passed value
	 *	@param number
	 */
	public void setCfoutStat(int number)  throws CFException{
		work.setCfoutStat(number);
	}
	

	public void setCfoutStat(long number)  throws CFException{
	    work.setCfoutStat(number);
	}
	
	
	/**
	 * 	Update CfoutStat with the passed value
	 *	@param value (String or char[])
	 */
	public void setCfoutStat(char[] value)  throws CFException {
		work.setCfoutStat(value);
	}
	
	/**
	 * 	Update CfoutStat with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCfoutStatString(char[] value)  throws CFException{
		work.setCfoutStat(value);
	}	

	/**
	 *	Returns the value of cfinStat
	 *	@return cfinStat
	 */
	public int getCfinStat() throws CFException {
   		return work.getCfinStat();
	}


	/**
	 *	Returns String value of cfinStat
	 *	@return cfinStat
	 */
	public char[]  getCfinStatString() throws CFException {
	     return String.valueOf(work.getCfinStatString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cfinStatIsNumeric()  throws CFException{
	    return work.cfinStatIsNumeric();
	}

	/**
	 * 	Update CfinStat with the passed value
	 *	@param number
	 */
	public void setCfinStat(int number)  throws CFException{
		work.setCfinStat(number);
	}
	

	public void setCfinStat(long number)  throws CFException{
	    work.setCfinStat(number);
	}
	
	
	/**
	 * 	Update CfinStat with the passed value
	 *	@param value (String or char[])
	 */
	public void setCfinStat(char[] value)  throws CFException {
		work.setCfinStat(value);
	}
	
	/**
	 * 	Update CfinStat with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCfinStatString(char[] value)  throws CFException{
		work.setCfinStat(value);
	}	


        public Cfsort03Ctx getCfsort03Ctx() {
            return Cfsort03Ctx.this;
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
        str += workClient.hashCode();
        str += clientsOut.hashCode();
        str += clientsIn.hashCode();
       return str.hashCode();
    }

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.workClient = new WorkClient();
        cloneObj.workClient.set(workClient.getClonedField());
        cloneObj.clientsOut = new ClientsOut();
        cloneObj.clientsOut.set(clientsOut.getClonedField());
        cloneObj.clientsIn = new ClientsIn();
        cloneObj.clientsIn.set(clientsIn.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
     public class SortClientsInCtx implements Cloneable {
     WorkClient workClient = Cfsort03Ctx.this.getWorkClient();
     Work work = Cfsort03Ctx.this.getWork();
     ClientsIn clientsIn = Cfsort03Ctx.this.getClientsIn();

	/**
	 *	Returns the value of workClient
	 *	@return workClient
	 */   
	 public WorkClient getWorkClient() {
   	return workClient;
   }


	/**
	 *	Returns the value of clientsIn
	 *	@return clientsIn
	 */   
	 public ClientsIn getClientsIn() {
   	return clientsIn;
   }



        public Cfsort03Ctx getCfsort03Ctx() {
            return Cfsort03Ctx.this;
        }

        public SortClientsOutCtx getSortClientsOutCtx() {
            return new SortClientsOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += workClient.hashCode();
        str += work.hashCode();
        str += clientsIn.hashCode();
       return str.hashCode();
    }

    public SortClientsInCtx clone() {
        SortClientsInCtx cloneObj = new SortClientsInCtx();
        cloneObj.workClient = new WorkClient();
        cloneObj.workClient.set(workClient.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.clientsIn = new ClientsIn();
        cloneObj.clientsIn.set(clientsIn.getClonedField());
        return cloneObj;
    }

    }

    public SortClientsInCtx getSortClientsInCtx() {
            return new SortClientsInCtx();
    }
     public class SortClientsOutCtx implements Cloneable {
     WorkClient workClient = Cfsort03Ctx.this.getWorkClient();
     Work work = Cfsort03Ctx.this.getWork();
     ClientsIn clientsIn = Cfsort03Ctx.this.getClientsIn();

	/**
	 *	Returns the value of workClient
	 *	@return workClient
	 */   
	 public WorkClient getWorkClient() {
   	return workClient;
   }


	/**
	 *	Returns the value of cfinStat
	 *	@return cfinStat
	 */
	public int getCfinStat() throws CFException {
   		return work.getCfinStat();
	}


	/**
	 *	Returns String value of cfinStat
	 *	@return cfinStat
	 */
	public char[]  getCfinStatString() throws CFException {
	     return String.valueOf(work.getCfinStatString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cfinStatIsNumeric()  throws CFException{
	    return work.cfinStatIsNumeric();
	}

	/**
	 * 	Update CfinStat with the passed value
	 *	@param number
	 */
	public void setCfinStat(int number)  throws CFException{
		work.setCfinStat(number);
	}
	

	public void setCfinStat(long number)  throws CFException{
	    work.setCfinStat(number);
	}
	
	
	/**
	 * 	Update CfinStat with the passed value
	 *	@param value (String or char[])
	 */
	public void setCfinStat(char[] value)  throws CFException {
		work.setCfinStat(value);
	}
	
	/**
	 * 	Update CfinStat with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCfinStatString(char[] value)  throws CFException{
		work.setCfinStat(value);
	}	

	/**
	 *	Test condition "Y" for isEndOfClientData()
	 *	@return  Returns true if isEndOfClientData() is "Y"
	 */
   public boolean isEndOfClientData() throws CFException {
      return work.isEndOfClientData();
   }

	/**
	*  set values "Y"
	*/
   	public void setEndOfClientDataTrue()  throws CFException{  			
    	work.setEndOfClientDataTrue();
   	}
	/**
	 *	Returns the value of eofSw
	 *	@return eofSw
	 */
   public char[] getEofSw() throws CFException  {              
   		return work.getEofSw();
   }

  
	/**
	*  set variable eofSw
	*  @param value
	**/
   public void setEofSw(char[] value) throws CFException {
      work.setEofSw(value);
   } 

	/**
	 *	Returns the value of clientsIn
	 *	@return clientsIn
	 */   
	 public ClientsIn getClientsIn() {
   	return clientsIn;
   }



        public Cfsort03Ctx getCfsort03Ctx() {
            return Cfsort03Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += workClient.hashCode();
        str += work.hashCode();
        str += clientsIn.hashCode();
       return str.hashCode();
    }

    public SortClientsOutCtx clone() {
        SortClientsOutCtx cloneObj = new SortClientsOutCtx();
        cloneObj.workClient = new WorkClient();
        cloneObj.workClient.set(workClient.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.clientsIn = new ClientsIn();
        cloneObj.clientsIn.set(clientsIn.getClonedField());
        return cloneObj;
    }

    }

    public SortClientsOutCtx getSortClientsOutCtx() {
            return new SortClientsOutCtx();
    }
     public class WriteClientsInCtx implements Cloneable {
     WorkClient workClient = Cfsort03Ctx.this.getWorkClient();
     Work work = Cfsort03Ctx.this.getWork();
     ClientsOut clientsOut = Cfsort03Ctx.this.getClientsOut();

	/**
	 *	Returns the value of workClient
	 *	@return workClient
	 */   
	 public WorkClient getWorkClient() {
   	return workClient;
   }


	/**
	 *	Returns the value of clientsOut
	 *	@return clientsOut
	 */   
	 public ClientsOut getClientsOut() {
   	return clientsOut;
   }



        public Cfsort03Ctx getCfsort03Ctx() {
            return Cfsort03Ctx.this;
        }

        public WriteClientsOutCtx getWriteClientsOutCtx() {
            return new WriteClientsOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += workClient.hashCode();
        str += work.hashCode();
        str += clientsOut.hashCode();
       return str.hashCode();
    }

    public WriteClientsInCtx clone() {
        WriteClientsInCtx cloneObj = new WriteClientsInCtx();
        cloneObj.workClient = new WorkClient();
        cloneObj.workClient.set(workClient.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.clientsOut = new ClientsOut();
        cloneObj.clientsOut.set(clientsOut.getClonedField());
        return cloneObj;
    }

    }

    public WriteClientsInCtx getWriteClientsInCtx() {
            return new WriteClientsInCtx();
    }
     public class WriteClientsOutCtx implements Cloneable {
     Work work = Cfsort03Ctx.this.getWork();
     WorkClient workClient = Cfsort03Ctx.this.getWorkClient();
     ClientsOut clientsOut = Cfsort03Ctx.this.getClientsOut();

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
	/**
	 *	Returns the value of workClient
	 *	@return workClient
	 */   
	 public WorkClient getWorkClient() {
   	return workClient;
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
	 *	Returns the value of clientsOut
	 *	@return clientsOut
	 */   
	 public ClientsOut getClientsOut() {
   	return clientsOut;
   }


	/**
	 *	Returns the value of cfoutStat
	 *	@return cfoutStat
	 */
	public int getCfoutStat() throws CFException {
   		return work.getCfoutStat();
	}


	/**
	 *	Returns String value of cfoutStat
	 *	@return cfoutStat
	 */
	public char[]  getCfoutStatString() throws CFException {
	     return String.valueOf(work.getCfoutStatString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cfoutStatIsNumeric()  throws CFException{
	    return work.cfoutStatIsNumeric();
	}

	/**
	 * 	Update CfoutStat with the passed value
	 *	@param number
	 */
	public void setCfoutStat(int number)  throws CFException{
		work.setCfoutStat(number);
	}
	

	public void setCfoutStat(long number)  throws CFException{
	    work.setCfoutStat(number);
	}
	
	
	/**
	 * 	Update CfoutStat with the passed value
	 *	@param value (String or char[])
	 */
	public void setCfoutStat(char[] value)  throws CFException {
		work.setCfoutStat(value);
	}
	
	/**
	 * 	Update CfoutStat with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCfoutStatString(char[] value)  throws CFException{
		work.setCfoutStat(value);
	}	


        public Cfsort03Ctx getCfsort03Ctx() {
            return Cfsort03Ctx.this;
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
        str += workClient.hashCode();
        str += clientsOut.hashCode();
       return str.hashCode();
    }

    public WriteClientsOutCtx clone() {
        WriteClientsOutCtx cloneObj = new WriteClientsOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.workClient = new WorkClient();
        cloneObj.workClient.set(workClient.getClonedField());
        cloneObj.clientsOut = new ClientsOut();
        cloneObj.clientsOut.set(clientsOut.getClonedField());
        return cloneObj;
    }

    }

    public WriteClientsOutCtx getWriteClientsOutCtx() {
            return new WriteClientsOutCtx();
    }
}
