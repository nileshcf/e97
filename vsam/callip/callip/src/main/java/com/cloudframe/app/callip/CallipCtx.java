package com.cloudframe.app.callip;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.global.sharedvar.Ip50005TableId;
import com.cloudframe.app.global.sharedvar.Ip65504SelElemEntriesAll;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRecLthGroup;
import com.cloudframe.app.global.sharedvar.Ip65504TcntGroup;
import com.cloudframe.app.global.sharedvar.Ip65504CurrentTagTable;
import com.cloudframe.app.callip.dto.Work;
import com.cloudframe.app.global.sharedvar.Ip66102IpmFileInformation;
import com.cloudframe.app.global.sharedvar.Ip65504TaggedRecordInfo;
import com.cloudframe.app.global.sharedvar.Ip65504MessageStatusGroup;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayRec;
import com.cloudframe.app.global.sharedvar.CurrentTableKey800;
import com.cloudframe.app.global.sharedvar.Ip50005OneDayReadStatusGroup;
import com.cloudframe.app.global.sharedvar.Ip50005ClearingDtTm;


@Context
public class CallipCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Ip66102IpmFileInformation ip66102IpmFileInformation;
    Ip50005OneDayRecLthGroup ip50005OneDayRecLthGroup;
    Ip65504MessageStatusGroup ip65504MessageStatusGroup;
    Ip50005OneDayReadStatusGroup ip50005OneDayReadStatusGroup;
    Ip50005ClearingDtTm ip50005ClearingDtTm;
    CurrentTableKey800 currentTableKey800;
    Ip65504CurrentTagTable ip65504CurrentTagTable;
    Ip65504SelElemEntriesAll ip65504SelElemEntriesAll;
    Ip50005OneDayRec ip50005OneDayRec;
    Work work;
    Ip65504TaggedRecordInfo ip65504TaggedRecordInfo;
    Ip65504TcntGroup ip65504TcntGroup;


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


    public Ip66102IpmFileInformation getIp66102IpmFileInformation() {
        if (ip66102IpmFileInformation == null) {
            ip66102IpmFileInformation = globalCtx.getGlobalDto(Ip66102IpmFileInformation.class);
        }

        return ip66102IpmFileInformation;
    }

    public Ip50005OneDayRecLthGroup getIp50005OneDayRecLthGroup() {
        if (ip50005OneDayRecLthGroup == null) {
            ip50005OneDayRecLthGroup = globalCtx.getGlobalDto(Ip50005OneDayRecLthGroup.class);
        }

        return ip50005OneDayRecLthGroup;
    }

    public Ip65504MessageStatusGroup getIp65504MessageStatusGroup() {
        if (ip65504MessageStatusGroup == null) {
            ip65504MessageStatusGroup = globalCtx.getGlobalDto(Ip65504MessageStatusGroup.class);
        }

        return ip65504MessageStatusGroup;
    }

    public Ip50005OneDayReadStatusGroup getIp50005OneDayReadStatusGroup() {
        if (ip50005OneDayReadStatusGroup == null) {
            ip50005OneDayReadStatusGroup = globalCtx.getGlobalDto(Ip50005OneDayReadStatusGroup.class);
        }

        return ip50005OneDayReadStatusGroup;
    }

    public Ip50005ClearingDtTm getIp50005ClearingDtTm() {
        if (ip50005ClearingDtTm == null) {
            ip50005ClearingDtTm = globalCtx.getGlobalDto(Ip50005ClearingDtTm.class);
        }

        return ip50005ClearingDtTm;
    }

    public CurrentTableKey800 getCurrentTableKey800() {
        if (currentTableKey800 == null) {
            currentTableKey800 = globalCtx.getGlobalDto(CurrentTableKey800.class);
        }

        return currentTableKey800;
    }

    public Ip65504CurrentTagTable getIp65504CurrentTagTable() {
        if (ip65504CurrentTagTable == null) {
            ip65504CurrentTagTable = globalCtx.getGlobalDto(Ip65504CurrentTagTable.class);
        }

        return ip65504CurrentTagTable;
    }

    public Ip65504SelElemEntriesAll getIp65504SelElemEntriesAll() {
        if (ip65504SelElemEntriesAll == null) {
            ip65504SelElemEntriesAll = globalCtx.getGlobalDto(Ip65504SelElemEntriesAll.class);
        }

        return ip65504SelElemEntriesAll;
    }

    public Ip50005OneDayRec getIp50005OneDayRec() {
        if (ip50005OneDayRec == null) {
            ip50005OneDayRec = globalCtx.getGlobalDto(Ip50005OneDayRec.class);
        }

        return ip50005OneDayRec;
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
    public Ip65504TaggedRecordInfo getIp65504TaggedRecordInfo() {
        if (ip65504TaggedRecordInfo == null) {
            ip65504TaggedRecordInfo = globalCtx.getGlobalDto(Ip65504TaggedRecordInfo.class);
        }

        return ip65504TaggedRecordInfo;
    }

    public Ip65504TcntGroup getIp65504TcntGroup() {
        if (ip65504TcntGroup == null) {
            ip65504TcntGroup = globalCtx.getGlobalDto(Ip65504TcntGroup.class);
        }

        return ip65504TcntGroup;
    }



    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66102IpmFileInformation.hashCode();
        str += ip50005OneDayRecLthGroup.hashCode();
        str += ip65504MessageStatusGroup.hashCode();
        str += ip50005OneDayReadStatusGroup.hashCode();
        str += ip50005ClearingDtTm.hashCode();
        str += currentTableKey800.hashCode();
        str += ip65504CurrentTagTable.hashCode();
        str += ip65504SelElemEntriesAll.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += work.hashCode();
        str += ip65504TaggedRecordInfo.hashCode();
        str += ip65504TcntGroup.hashCode();
       return str.hashCode();
    }

    public CallipCtx clone() {
        CallipCtx cloneObj = new CallipCtx();
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.ip50005OneDayRecLthGroup = new Ip50005OneDayRecLthGroup();
        cloneObj.ip50005OneDayRecLthGroup.set(ip50005OneDayRecLthGroup.getClonedField());
        cloneObj.ip65504MessageStatusGroup = new Ip65504MessageStatusGroup();
        cloneObj.ip65504MessageStatusGroup.set(ip65504MessageStatusGroup.getClonedField());
        cloneObj.ip50005OneDayReadStatusGroup = new Ip50005OneDayReadStatusGroup();
        cloneObj.ip50005OneDayReadStatusGroup.set(ip50005OneDayReadStatusGroup.getClonedField());
        cloneObj.ip50005ClearingDtTm = new Ip50005ClearingDtTm();
        cloneObj.ip50005ClearingDtTm.set(ip50005ClearingDtTm.getClonedField());
        cloneObj.currentTableKey800 = new CurrentTableKey800();
        cloneObj.currentTableKey800.set(currentTableKey800.getClonedField());
        cloneObj.ip65504CurrentTagTable = new Ip65504CurrentTagTable();
        cloneObj.ip65504CurrentTagTable.set(ip65504CurrentTagTable.getClonedField());
        cloneObj.ip65504SelElemEntriesAll = new Ip65504SelElemEntriesAll();
        cloneObj.ip65504SelElemEntriesAll.set(ip65504SelElemEntriesAll.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip65504TaggedRecordInfo = new Ip65504TaggedRecordInfo();
        cloneObj.ip65504TaggedRecordInfo.set(ip65504TaggedRecordInfo.getClonedField());
        cloneObj.ip65504TcntGroup = new Ip65504TcntGroup();
        cloneObj.ip65504TcntGroup.set(ip65504TcntGroup.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Ip66102IpmFileInformation ip66102IpmFileInformation = CallipCtx.this.getIp66102IpmFileInformation();
     CurrentTableKey800 currentTableKey800 = CallipCtx.this.getCurrentTableKey800();
     Work work = CallipCtx.this.getWork();
     Ip50005OneDayRec ip50005OneDayRec = CallipCtx.this.getIp50005OneDayRec();

	/**
	 *	Returns the value of ip66201001
	 *	@return ip66201001
	 */
   public char[] getIp66201001() throws CFException  {              
   		return work.getIp66201001();
   }

  
	/**
	*  set variable ip66201001
	*  @param value
	**/
   public void setIp66201001(char[] value) throws CFException {
      work.setIp66201001(value);
   } 

	/**
	 *	Test condition "Y" for isIp66102IpmFileIsFinished()
	 *	@return  Returns true if isIp66102IpmFileIsFinished() is "Y"
	 */
   public boolean isIp66102IpmFileIsFinished() throws CFException {
      return ip66102IpmFileInformation.isIp66102IpmFileIsFinished();
   }

	/**
	*  set values "Y"
	*/
   	public void setIp66102IpmFileIsFinishedTrue()  throws CFException{  			
    	ip66102IpmFileInformation.setIp66102IpmFileIsFinishedTrue();
   	}
	/**
	 *	Returns the value of ip65001001
	 *	@return ip65001001
	 */
   public char[] getIp65001001() throws CFException  {              
   		return work.getIp65001001();
   }

  
	/**
	*  set variable ip65001001
	*  @param value
	**/
   public void setIp65001001(char[] value) throws CFException {
      work.setIp65001001(value);
   } 


        public CallipCtx getCallipCtx() {
            return CallipCtx.this;
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
        str += ip66102IpmFileInformation.hashCode();
        str += currentTableKey800.hashCode();
        str += work.hashCode();
        str += ip50005OneDayRec.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.currentTableKey800 = new CurrentTableKey800();
        cloneObj.currentTableKey800.set(currentTableKey800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessOutCtx implements Cloneable {
     Ip66102IpmFileInformation ip66102IpmFileInformation = CallipCtx.this.getIp66102IpmFileInformation();
     CurrentTableKey800 currentTableKey800 = CallipCtx.this.getCurrentTableKey800();
     Ip50005OneDayRec ip50005OneDayRec = CallipCtx.this.getIp50005OneDayRec();
     Work work = CallipCtx.this.getWork();

	/**
	 *	Returns the value of ip50005TableId
	 *	@return ip50005TableId
	 */   
	 public Ip50005TableId getIp50005TableId() {
   	return ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().getIp50005TableId();
   }

   /**
	* 	Update Ip50005TableId with the passed value
	*	@param value
	*/
   public void setIp50005TableId(char[] value) throws CFException {
      ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().setIp50005TableId(value);
   }   

     /**
	 * 	Update Ip50005TableId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50005TableId(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().setIp50005TableId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50005TableId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50005TableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().setIp50005TableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip50005TableId with another Field
	 *	@param value
	 */
   public void setIp50005TableId(Field source) {
   	ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().setIp50005TableId(source);
   }  
   
     /**
	 * 	Update Ip50005TableId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50005TableId(Field source, int sourceIndex,int sourceLen) {
   	ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().setIp50005TableId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip50005TableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50005TableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().setIp50005TableId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currentTableKey800
	 *	@return currentTableKey800
	 */   
	 public CurrentTableKey800 getCurrentTableKey800() {
   	return currentTableKey800;
   }


	/**
	 *	Returns the value of ip50005Seq
	 *	@return ip50005Seq
	 */
	public long getIp50005Seq() throws CFException {        
   		return ip50005OneDayRec.getIp50005TableKeyAll().getIp50005Seq();
	}
	
	/**
	 * 	Update Ip50005Seq with the passed value
	 *	@param number
	 */
	public void setIp50005Seq(long number)  throws CFException{
		ip50005OneDayRec.getIp50005TableKeyAll().setIp50005Seq(number);
	}



	/**
	 *	Returns the value of ip50005EffDate
	 *	@return ip50005EffDate
	 */
	public long getIp50005EffDate() throws CFException {
   		return ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().getIp50005EffDate();
	}


	/**
	 *	Returns String value of ip50005EffDate
	 *	@return ip50005EffDate
	 */
	public char[]  getIp50005EffDateString() throws CFException {
	     return String.valueOf(ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().getIp50005EffDateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip50005EffDateIsNumeric()  throws CFException{
	    return ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().ip50005EffDateIsNumeric();
	}

	/**
	 * 	Update Ip50005EffDate with the passed value
	 *	@param number
	 */
	public void setIp50005EffDate(long number)  throws CFException{
		ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().setIp50005EffDate(number);
	}
	

	
	/**
	 * 	Update Ip50005EffDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp50005EffDate(char[] value)  throws CFException {
		ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().setIp50005EffDate(value);
	}
	
	/**
	 * 	Update Ip50005EffDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp50005EffDateString(char[] value)  throws CFException{
		ip50005OneDayRec.getIp50005TableKeyAll().getIp50005TableKey().setIp50005EffDate(value);
	}	


        public CallipCtx getCallipCtx() {
            return CallipCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66102IpmFileInformation.hashCode();
        str += currentTableKey800.hashCode();
        str += ip50005OneDayRec.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.ip66102IpmFileInformation = new Ip66102IpmFileInformation();
        cloneObj.ip66102IpmFileInformation.set(ip66102IpmFileInformation.getClonedField());
        cloneObj.currentTableKey800 = new CurrentTableKey800();
        cloneObj.currentTableKey800.set(currentTableKey800.getClonedField());
        cloneObj.ip50005OneDayRec = new Ip50005OneDayRec();
        cloneObj.ip50005OneDayRec.set(ip50005OneDayRec.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
}
