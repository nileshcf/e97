package com.cloudframe.app.cfsort10;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.cfsort10.file.records.WorkClient;
import com.cloudframe.app.cfsort10.file.records.ClientsOut;
import com.cloudframe.app.cfsort10.file.records.ClientsIn;
import com.cloudframe.app.cfsort10.dto.Work;


@Context
public class Cfsort10Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    ClientsOut clientsOut;
    ClientsIn clientsIn;
    Work work;
    WorkClient workClient;


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
    public Work getWork() {
        if (work == null) {
            work = new Work();
        }

        return work;
    }

    public void setWork(Work work) {
        this.work = work;
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


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += clientsOut.hashCode();
        str += clientsIn.hashCode();
        str += work.hashCode();
        str += workClient.hashCode();
       return str.hashCode();
    }

    public Cfsort10Ctx clone() {
        Cfsort10Ctx cloneObj = new Cfsort10Ctx();
        cloneObj.clientsOut = new ClientsOut();
        cloneObj.clientsOut.set(clientsOut.getClonedField());
        cloneObj.clientsIn = new ClientsIn();
        cloneObj.clientsIn.set(clientsIn.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.workClient = new WorkClient();
        cloneObj.workClient.set(workClient.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineRoutineInCtx implements Cloneable {
     ClientsOut clientsOut = Cfsort10Ctx.this.getClientsOut();
     ClientsIn clientsIn = Cfsort10Ctx.this.getClientsIn();
     Work work = Cfsort10Ctx.this.getWork();
     WorkClient workClient = Cfsort10Ctx.this.getWorkClient();

	/**
	 *	Returns the value of clientsOut
	 *	@return clientsOut
	 */   
	 public ClientsOut getClientsOut() {
   	return clientsOut;
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

	/**
	 *	Returns the value of workClient
	 *	@return workClient
	 */   
	 public WorkClient getWorkClient() {
   	return workClient;
   }



        public Cfsort10Ctx getCfsort10Ctx() {
            return Cfsort10Ctx.this;
        }

        public MainlineRoutineOutCtx getMainlineRoutineOutCtx() {
            return new MainlineRoutineOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += clientsOut.hashCode();
        str += clientsIn.hashCode();
        str += work.hashCode();
        str += workClient.hashCode();
       return str.hashCode();
    }

    public MainlineRoutineInCtx clone() {
        MainlineRoutineInCtx cloneObj = new MainlineRoutineInCtx();
        cloneObj.clientsOut = new ClientsOut();
        cloneObj.clientsOut.set(clientsOut.getClonedField());
        cloneObj.clientsIn = new ClientsIn();
        cloneObj.clientsIn.set(clientsIn.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.workClient = new WorkClient();
        cloneObj.workClient.set(workClient.getClonedField());
        return cloneObj;
    }

    }

    public MainlineRoutineInCtx getMainlineRoutineInCtx() {
            return new MainlineRoutineInCtx();
    }
     public class MainlineRoutineOutCtx implements Cloneable {
     ClientsOut clientsOut = Cfsort10Ctx.this.getClientsOut();
     ClientsIn clientsIn = Cfsort10Ctx.this.getClientsIn();
     Work work = Cfsort10Ctx.this.getWork();
     WorkClient workClient = Cfsort10Ctx.this.getWorkClient();

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


        public Cfsort10Ctx getCfsort10Ctx() {
            return Cfsort10Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += clientsOut.hashCode();
        str += clientsIn.hashCode();
        str += work.hashCode();
        str += workClient.hashCode();
       return str.hashCode();
    }

    public MainlineRoutineOutCtx clone() {
        MainlineRoutineOutCtx cloneObj = new MainlineRoutineOutCtx();
        cloneObj.clientsOut = new ClientsOut();
        cloneObj.clientsOut.set(clientsOut.getClonedField());
        cloneObj.clientsIn = new ClientsIn();
        cloneObj.clientsIn.set(clientsIn.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.workClient = new WorkClient();
        cloneObj.workClient.set(workClient.getClonedField());
        return cloneObj;
    }

    }

    public MainlineRoutineOutCtx getMainlineRoutineOutCtx() {
            return new MainlineRoutineOutCtx();
    }
     public class SortClientsMainInCtx implements Cloneable {
     ClientsIn clientsIn = Cfsort10Ctx.this.getClientsIn();
     Work work = Cfsort10Ctx.this.getWork();
     WorkClient workClient = Cfsort10Ctx.this.getWorkClient();

	/**
	 *	Returns the value of clientsIn
	 *	@return clientsIn
	 */   
	 public ClientsIn getClientsIn() {
   	return clientsIn;
   }


	/**
	 *	Returns the value of workClient
	 *	@return workClient
	 */   
	 public WorkClient getWorkClient() {
   	return workClient;
   }



        public Cfsort10Ctx getCfsort10Ctx() {
            return Cfsort10Ctx.this;
        }

        public SortClientsMainOutCtx getSortClientsMainOutCtx() {
            return new SortClientsMainOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += clientsIn.hashCode();
        str += work.hashCode();
        str += workClient.hashCode();
       return str.hashCode();
    }

    public SortClientsMainInCtx clone() {
        SortClientsMainInCtx cloneObj = new SortClientsMainInCtx();
        cloneObj.clientsIn = new ClientsIn();
        cloneObj.clientsIn.set(clientsIn.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.workClient = new WorkClient();
        cloneObj.workClient.set(workClient.getClonedField());
        return cloneObj;
    }

    }

    public SortClientsMainInCtx getSortClientsMainInCtx() {
            return new SortClientsMainInCtx();
    }
     public class SortClientsMainOutCtx implements Cloneable {
     ClientsIn clientsIn = Cfsort10Ctx.this.getClientsIn();
     Work work = Cfsort10Ctx.this.getWork();
     WorkClient workClient = Cfsort10Ctx.this.getWorkClient();

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
	 *	Returns the value of clientsIn
	 *	@return clientsIn
	 */   
	 public ClientsIn getClientsIn() {
   	return clientsIn;
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
	 *	Returns the value of workClient
	 *	@return workClient
	 */   
	 public WorkClient getWorkClient() {
   	return workClient;
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


        public Cfsort10Ctx getCfsort10Ctx() {
            return Cfsort10Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += clientsIn.hashCode();
        str += work.hashCode();
        str += workClient.hashCode();
       return str.hashCode();
    }

    public SortClientsMainOutCtx clone() {
        SortClientsMainOutCtx cloneObj = new SortClientsMainOutCtx();
        cloneObj.clientsIn = new ClientsIn();
        cloneObj.clientsIn.set(clientsIn.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.workClient = new WorkClient();
        cloneObj.workClient.set(workClient.getClonedField());
        return cloneObj;
    }

    }

    public SortClientsMainOutCtx getSortClientsMainOutCtx() {
            return new SortClientsMainOutCtx();
    }
     public class WriteClientsMainInCtx implements Cloneable {
     ClientsOut clientsOut = Cfsort10Ctx.this.getClientsOut();
     Work work = Cfsort10Ctx.this.getWork();
     WorkClient workClient = Cfsort10Ctx.this.getWorkClient();

	/**
	 *	Returns the value of clientsOut
	 *	@return clientsOut
	 */   
	 public ClientsOut getClientsOut() {
   	return clientsOut;
   }


	/**
	 *	Returns the value of workClient
	 *	@return workClient
	 */   
	 public WorkClient getWorkClient() {
   	return workClient;
   }



        public Cfsort10Ctx getCfsort10Ctx() {
            return Cfsort10Ctx.this;
        }

        public WriteClientsMainOutCtx getWriteClientsMainOutCtx() {
            return new WriteClientsMainOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += clientsOut.hashCode();
        str += work.hashCode();
        str += workClient.hashCode();
       return str.hashCode();
    }

    public WriteClientsMainInCtx clone() {
        WriteClientsMainInCtx cloneObj = new WriteClientsMainInCtx();
        cloneObj.clientsOut = new ClientsOut();
        cloneObj.clientsOut.set(clientsOut.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.workClient = new WorkClient();
        cloneObj.workClient.set(workClient.getClonedField());
        return cloneObj;
    }

    }

    public WriteClientsMainInCtx getWriteClientsMainInCtx() {
            return new WriteClientsMainInCtx();
    }
     public class WriteClientsMainOutCtx implements Cloneable {
     ClientsOut clientsOut = Cfsort10Ctx.this.getClientsOut();
     Work work = Cfsort10Ctx.this.getWork();
     WorkClient workClient = Cfsort10Ctx.this.getWorkClient();

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
	 *	Returns the value of workClient
	 *	@return workClient
	 */   
	 public WorkClient getWorkClient() {
   	return workClient;
   }



        public Cfsort10Ctx getCfsort10Ctx() {
            return Cfsort10Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += clientsOut.hashCode();
        str += work.hashCode();
        str += workClient.hashCode();
       return str.hashCode();
    }

    public WriteClientsMainOutCtx clone() {
        WriteClientsMainOutCtx cloneObj = new WriteClientsMainOutCtx();
        cloneObj.clientsOut = new ClientsOut();
        cloneObj.clientsOut.set(clientsOut.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.workClient = new WorkClient();
        cloneObj.workClient.set(workClient.getClonedField());
        return cloneObj;
    }

    }

    public WriteClientsMainOutCtx getWriteClientsMainOutCtx() {
            return new WriteClientsMainOutCtx();
    }
     public class AndParaInCtx implements Cloneable {
     WorkClient workClient = Cfsort10Ctx.this.getWorkClient();

	/**
	 *	Returns the value of clientNameWk
	 *	@return clientNameWk
	 */
   public char[] getClientNameWk() throws CFException  {              
   		return workClient.getClientNameWk();
   }

  
	/**
	*  set variable clientNameWk
	*  @param value
	**/
   public void setClientNameWk(char[] value) throws CFException {
      workClient.setClientNameWk(value);
   } 

     /**
	 * 	Update ClientNameWk 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClientNameWk(char[] source, int sourceIndex) throws CFException {
      workClient.setClientNameWk(source, sourceIndex);
   	
   }
   
   public void setClientNameWk(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      workClient.setClientNameWk(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ClientNameWk 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClientNameWk(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      workClient.setClientNameWk(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ClientNameWk with another Field
	 *	@param value
	 */
   public void setClientNameWk(Field source) {
      workClient.setClientNameWk(source);
   }  
   
     /**
	 * 	Update ClientNameWk 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClientNameWk(Field source, int sourceIndex,int sourceLen) {
      workClient.setClientNameWk(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ClientNameWk 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClientNameWk(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      workClient.setClientNameWk(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Cfsort10Ctx getCfsort10Ctx() {
            return Cfsort10Ctx.this;
        }

        public AndParaOutCtx getAndParaOutCtx() {
            return new AndParaOutCtx();
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
       return str.hashCode();
    }

    public AndParaInCtx clone() {
        AndParaInCtx cloneObj = new AndParaInCtx();
        cloneObj.workClient = new WorkClient();
        cloneObj.workClient.set(workClient.getClonedField());
        return cloneObj;
    }

    }

    public AndParaInCtx getAndParaInCtx() {
            return new AndParaInCtx();
    }
     public class AndParaOutCtx implements Cloneable {
     WorkClient workClient = Cfsort10Ctx.this.getWorkClient();

	/**
	 *	Returns the value of clientPhNoWk
	 *	@return clientPhNoWk
	 */
   public char[] getClientPhNoWk() throws CFException  {              
   		return workClient.getClientPhNoWk();
   }

  
	/**
	*  set variable clientPhNoWk
	*  @param value
	**/
   public void setClientPhNoWk(char[] value) throws CFException {
      workClient.setClientPhNoWk(value);
   } 

     /**
	 * 	Update ClientPhNoWk 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClientPhNoWk(char[] source, int sourceIndex) throws CFException {
      workClient.setClientPhNoWk(source, sourceIndex);
   	
   }
   
   public void setClientPhNoWk(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      workClient.setClientPhNoWk(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ClientPhNoWk 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClientPhNoWk(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      workClient.setClientPhNoWk(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ClientPhNoWk with another Field
	 *	@param value
	 */
   public void setClientPhNoWk(Field source) {
      workClient.setClientPhNoWk(source);
   }  
   
     /**
	 * 	Update ClientPhNoWk 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClientPhNoWk(Field source, int sourceIndex,int sourceLen) {
      workClient.setClientPhNoWk(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ClientPhNoWk 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClientPhNoWk(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      workClient.setClientPhNoWk(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Cfsort10Ctx getCfsort10Ctx() {
            return Cfsort10Ctx.this;
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
       return str.hashCode();
    }

    public AndParaOutCtx clone() {
        AndParaOutCtx cloneObj = new AndParaOutCtx();
        cloneObj.workClient = new WorkClient();
        cloneObj.workClient.set(workClient.getClonedField());
        return cloneObj;
    }

    }

    public AndParaOutCtx getAndParaOutCtx() {
            return new AndParaOutCtx();
    }
     public class MarParaInCtx implements Cloneable {
     WorkClient workClient = Cfsort10Ctx.this.getWorkClient();

	/**
	 *	Returns the value of clientNameWk
	 *	@return clientNameWk
	 */
   public char[] getClientNameWk() throws CFException  {              
   		return workClient.getClientNameWk();
   }

  
	/**
	*  set variable clientNameWk
	*  @param value
	**/
   public void setClientNameWk(char[] value) throws CFException {
      workClient.setClientNameWk(value);
   } 

     /**
	 * 	Update ClientNameWk 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClientNameWk(char[] source, int sourceIndex) throws CFException {
      workClient.setClientNameWk(source, sourceIndex);
   	
   }
   
   public void setClientNameWk(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      workClient.setClientNameWk(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ClientNameWk 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClientNameWk(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      workClient.setClientNameWk(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ClientNameWk with another Field
	 *	@param value
	 */
   public void setClientNameWk(Field source) {
      workClient.setClientNameWk(source);
   }  
   
     /**
	 * 	Update ClientNameWk 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClientNameWk(Field source, int sourceIndex,int sourceLen) {
      workClient.setClientNameWk(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ClientNameWk 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClientNameWk(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      workClient.setClientNameWk(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Cfsort10Ctx getCfsort10Ctx() {
            return Cfsort10Ctx.this;
        }

        public MarParaOutCtx getMarParaOutCtx() {
            return new MarParaOutCtx();
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
       return str.hashCode();
    }

    public MarParaInCtx clone() {
        MarParaInCtx cloneObj = new MarParaInCtx();
        cloneObj.workClient = new WorkClient();
        cloneObj.workClient.set(workClient.getClonedField());
        return cloneObj;
    }

    }

    public MarParaInCtx getMarParaInCtx() {
            return new MarParaInCtx();
    }
     public class MarParaOutCtx implements Cloneable {
     WorkClient workClient = Cfsort10Ctx.this.getWorkClient();

	/**
	 *	Returns the value of clientPhNoWk
	 *	@return clientPhNoWk
	 */
   public char[] getClientPhNoWk() throws CFException  {              
   		return workClient.getClientPhNoWk();
   }

  
	/**
	*  set variable clientPhNoWk
	*  @param value
	**/
   public void setClientPhNoWk(char[] value) throws CFException {
      workClient.setClientPhNoWk(value);
   } 

     /**
	 * 	Update ClientPhNoWk 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClientPhNoWk(char[] source, int sourceIndex) throws CFException {
      workClient.setClientPhNoWk(source, sourceIndex);
   	
   }
   
   public void setClientPhNoWk(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      workClient.setClientPhNoWk(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ClientPhNoWk 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClientPhNoWk(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      workClient.setClientPhNoWk(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ClientPhNoWk with another Field
	 *	@param value
	 */
   public void setClientPhNoWk(Field source) {
      workClient.setClientPhNoWk(source);
   }  
   
     /**
	 * 	Update ClientPhNoWk 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClientPhNoWk(Field source, int sourceIndex,int sourceLen) {
      workClient.setClientPhNoWk(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update ClientPhNoWk 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClientPhNoWk(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      workClient.setClientPhNoWk(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Cfsort10Ctx getCfsort10Ctx() {
            return Cfsort10Ctx.this;
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
       return str.hashCode();
    }

    public MarParaOutCtx clone() {
        MarParaOutCtx cloneObj = new MarParaOutCtx();
        cloneObj.workClient = new WorkClient();
        cloneObj.workClient.set(workClient.getClonedField());
        return cloneObj;
    }

    }

    public MarParaOutCtx getMarParaOutCtx() {
            return new MarParaOutCtx();
    }
}
