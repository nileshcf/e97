package com.cloudframe.app.sorttbl;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.sorttbl.dto.Ip00854wTableData;
import com.cloudframe.app.global.sharedvar.Ip66601UserTagInformation;
import com.cloudframe.app.sorttbl.dto.Work;
import com.cloudframe.app.sorttbl.dto.Ip00854wEntry;


@Context
public class SorttblCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Ip00854wTableData ip00854wTableData;
    Ip66601UserTagInformation ip66601UserTagInformation;
    Work work;

    int ip00854wIdx;
    int ip66601UserEnd;
    int ip66601UserT;
    int userEnd800;

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


    public Ip00854wTableData getIp00854wTableData() {
        if (ip00854wTableData == null) {
            ip00854wTableData = new Ip00854wTableData();
        }

        return ip00854wTableData;
    }

    public void setIp00854wTableData(Ip00854wTableData ip00854wTableData) {
        this.ip00854wTableData = ip00854wTableData;
    }
    public Ip66601UserTagInformation getIp66601UserTagInformation() {
        if (ip66601UserTagInformation == null) {
            ip66601UserTagInformation = globalCtx.getGlobalDto(Ip66601UserTagInformation.class);
        }

        return ip66601UserTagInformation;
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

    public int getIp00854wIdx() {
        return ip00854wIdx;
    }

    public void setIp00854wIdx(int ip00854wIdx) {
        this.ip00854wIdx = ip00854wIdx;
    }
    public int getIp66601UserEnd() {
        return ip66601UserEnd;
    }

    public void setIp66601UserEnd(int ip66601UserEnd) {
        this.ip66601UserEnd = ip66601UserEnd;
    }
    public int getIp66601UserT() {
        return ip66601UserT;
    }

    public void setIp66601UserT(int ip66601UserT) {
        this.ip66601UserT = ip66601UserT;
    }
    public int getUserEnd800() {
        return userEnd800;
    }

    public void setUserEnd800(int userEnd800) {
        this.userEnd800 = userEnd800;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip00854wTableData.hashCode();
        str += ip66601UserTagInformation.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public SorttblCtx clone() {
        SorttblCtx cloneObj = new SorttblCtx();
        cloneObj.ip00854wTableData = new Ip00854wTableData();
        cloneObj.ip00854wTableData.set(ip00854wTableData.getClonedField());
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineSplit0InCtx implements Cloneable {
     Ip00854wTableData ip00854wTableData = SorttblCtx.this.getIp00854wTableData();
     Ip66601UserTagInformation ip66601UserTagInformation = SorttblCtx.this.getIp66601UserTagInformation();
     Work work = SorttblCtx.this.getWork();


public void setIp66601UserT(int ip66601UserT) { 
    SorttblCtx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return SorttblCtx.this.ip66601UserT;
}
	/**
	 *	Returns the value of ip00854wEntriesMax
	 *	@return ip00854wEntriesMax
	 */
	public int getIp00854wEntriesMax() throws CFException {        
   		return work.getIp00854wEntriesMax();
	}
	
	/**
	 * 	Update Ip00854wEntriesMax with the passed value
	 *	@param number
	 */
	public void setIp00854wEntriesMax(int number)  throws CFException{
		work.setIp00854wEntriesMax(number);
	}


	public void setIp00854wEntriesMax(long number)  throws CFException{
		work.setIp00854wEntriesMax((int)number);
	}


	/**
	 *	Returns the value of idx
	 *	@return idx
	 */
	public short getIdx() throws CFException {        
   		return work.getIdx();
	}
	
	/**
	 * 	Update Idx with the passed value
	 *	@param number
	 */
	public void setIdx(short number)  throws CFException{
		work.setIdx(number);
	}

	public void setIdx(int number)  throws CFException{
		work.setIdx((short)number);
	}

	public void setIdx(long number)  throws CFException{
		work.setIdx((short)number);
	}



	/**
	 *	Returns the value of ip00854wRuleEffDate
	 *	@return ip00854wRuleEffDate
	 */
	public long getIp00854wRuleEffDate(int index) throws CFException {
   		return ip00854wTableData.getIp00854wTable().getIp00854wEntry(index).getIp00854wTableData01().getIp00854wRuleEffDate();
	}


	/**
	 *	Returns String value of ip00854wRuleEffDate
	 *	@return ip00854wRuleEffDate
	 */
	public char[]  getIp00854wRuleEffDateString(int index) throws CFException {
	     return String.valueOf(ip00854wTableData.getIp00854wTable().getIp00854wEntry(index).getIp00854wTableData01().getIp00854wRuleEffDateString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00854wRuleEffDateIsNumeric(int index)  throws CFException{
	    return ip00854wTableData.getIp00854wTable().getIp00854wEntry(index - 1).getIp00854wTableData01().ip00854wRuleEffDateIsNumeric();
	}

	/**
	 * 	Update Ip00854wRuleEffDate with the passed value
	 *	@param number
	 */
	public void setIp00854wRuleEffDate(int index,long number)  throws CFException{
		ip00854wTableData.getIp00854wTable().getIp00854wEntry(index).getIp00854wTableData01().setIp00854wRuleEffDate(number);
	}
	

	
	/**
	 * 	Update Ip00854wRuleEffDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00854wRuleEffDate(int index,char[] value)  throws CFException {
		ip00854wTableData.getIp00854wTable().getIp00854wEntry(index).getIp00854wTableData01().setIp00854wRuleEffDate(value);
	}
	
	/**
	 * 	Update Ip00854wRuleEffDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00854wRuleEffDateString(int index,char[] value)  throws CFException{
		ip00854wTableData.getIp00854wTable().getIp00854wEntry(index).getIp00854wTableData01().setIp00854wRuleEffDate(value);
	}	

	/**
	 *	Returns the value of ip00854wTxnCurrCdX
	 *	@return ip00854wTxnCurrCdX
	 */
   public char[] getIp00854wTxnCurrCdX(int index) throws CFException  {              
   		return ip00854wTableData.getIp00854wTable().getIp00854wEntry(index).getIp00854wTableData01().getIp00854wTxnCurrCdX();
   }

  
	/**
	*  set variable ip00854wTxnCurrCdX
	*  @param value
	**/
   public void setIp00854wTxnCurrCdX(int index,char[] value) throws CFException {
      ip00854wTableData.getIp00854wTable().getIp00854wEntry(index).getIp00854wTableData01().setIp00854wTxnCurrCdX(value);
   } 

     /**
	 * 	Update Ip00854wTxnCurrCdX 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00854wTxnCurrCdX(int index,char[] source, int sourceIndex) throws CFException {
      ip00854wTableData.getIp00854wTable().getIp00854wEntry(index).getIp00854wTableData01().setIp00854wTxnCurrCdX(source, sourceIndex);
   	
   }
   
   public void setIp00854wTxnCurrCdX(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00854wTableData.getIp00854wTable().getIp00854wEntry(index).getIp00854wTableData01().setIp00854wTxnCurrCdX(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00854wTxnCurrCdX 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00854wTxnCurrCdX(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00854wTableData.getIp00854wTable().getIp00854wEntry(index).getIp00854wTableData01().setIp00854wTxnCurrCdX(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00854wTxnCurrCdX with another Field
	 *	@param value
	 */
   public void setIp00854wTxnCurrCdX(int index,Field source) {
      ip00854wTableData.getIp00854wTable().getIp00854wEntry(index).getIp00854wTableData01().setIp00854wTxnCurrCdX(source);
   }  
   
     /**
	 * 	Update Ip00854wTxnCurrCdX 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00854wTxnCurrCdX(int index,Field source, int sourceIndex,int sourceLen) {
      ip00854wTableData.getIp00854wTable().getIp00854wEntry(index).getIp00854wTableData01().setIp00854wTxnCurrCdX(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00854wTxnCurrCdX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00854wTxnCurrCdX(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00854wTableData.getIp00854wTable().getIp00854wEntry(index).getIp00854wTableData01().setIp00854wTxnCurrCdX(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of recordsLoaded400
	 *	@return recordsLoaded400
	 */
	public int getRecordsLoaded400() throws CFException {        
   		return work.getRecordsLoaded400();
	}
	
	/**
	 * 	Update RecordsLoaded400 with the passed value
	 *	@param number
	 */
	public void setRecordsLoaded400(int number)  throws CFException{
		work.setRecordsLoaded400(number);
	}


	public void setRecordsLoaded400(long number)  throws CFException{
		work.setRecordsLoaded400((int)number);
	}


	/**
	 *	Returns the value of ip00854wReconCurrCdX
	 *	@return ip00854wReconCurrCdX
	 */
   public char[] getIp00854wReconCurrCdX(int index) throws CFException  {              
   		return ip00854wTableData.getIp00854wTable().getIp00854wEntry(index).getIp00854wTableData01().getIp00854wReconCurrCdX();
   }

  
	/**
	*  set variable ip00854wReconCurrCdX
	*  @param value
	**/
   public void setIp00854wReconCurrCdX(int index,char[] value) throws CFException {
      ip00854wTableData.getIp00854wTable().getIp00854wEntry(index).getIp00854wTableData01().setIp00854wReconCurrCdX(value);
   } 

     /**
	 * 	Update Ip00854wReconCurrCdX 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00854wReconCurrCdX(int index,char[] source, int sourceIndex) throws CFException {
      ip00854wTableData.getIp00854wTable().getIp00854wEntry(index).getIp00854wTableData01().setIp00854wReconCurrCdX(source, sourceIndex);
   	
   }
   
   public void setIp00854wReconCurrCdX(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip00854wTableData.getIp00854wTable().getIp00854wEntry(index).getIp00854wTableData01().setIp00854wReconCurrCdX(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip00854wReconCurrCdX 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00854wReconCurrCdX(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00854wTableData.getIp00854wTable().getIp00854wEntry(index).getIp00854wTableData01().setIp00854wReconCurrCdX(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip00854wReconCurrCdX with another Field
	 *	@param value
	 */
   public void setIp00854wReconCurrCdX(int index,Field source) {
      ip00854wTableData.getIp00854wTable().getIp00854wEntry(index).getIp00854wTableData01().setIp00854wReconCurrCdX(source);
   }  
   
     /**
	 * 	Update Ip00854wReconCurrCdX 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00854wReconCurrCdX(int index,Field source, int sourceIndex,int sourceLen) {
      ip00854wTableData.getIp00854wTable().getIp00854wEntry(index).getIp00854wTableData01().setIp00854wReconCurrCdX(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip00854wReconCurrCdX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00854wReconCurrCdX(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip00854wTableData.getIp00854wTable().getIp00854wEntry(index).getIp00854wTableData01().setIp00854wReconCurrCdX(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setIp00854wIdx(int ip00854wIdx) { 
    SorttblCtx.this.ip00854wIdx = ip00854wIdx;
}

public int getIp00854wIdx() { 
    return SorttblCtx.this.ip00854wIdx;
}

        public SorttblCtx getSorttblCtx() {
            return SorttblCtx.this;
        }

        public MainlineSplit0OutCtx getMainlineSplit0OutCtx() {
            return new MainlineSplit0OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip00854wTableData.hashCode();
        str += ip66601UserTagInformation.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineSplit0InCtx clone() {
        MainlineSplit0InCtx cloneObj = new MainlineSplit0InCtx();
        cloneObj.ip00854wTableData = new Ip00854wTableData();
        cloneObj.ip00854wTableData.set(ip00854wTableData.getClonedField());
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineSplit0InCtx getMainlineSplit0InCtx() {
            return new MainlineSplit0InCtx();
    }
     public class MainlineSplit0OutCtx implements Cloneable {
     Ip00854wTableData ip00854wTableData = SorttblCtx.this.getIp00854wTableData();
     Ip66601UserTagInformation ip66601UserTagInformation = SorttblCtx.this.getIp66601UserTagInformation();
     Work work = SorttblCtx.this.getWork();

	/**
	 *	Returns the value of ip66601UserTagStatus
	 *	@return ip66601UserTagStatus
	 */
   public char[] getIp66601UserTagStatus(int index) throws CFException  {              
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagStatus();
   }

  
	/**
	*  set variable ip66601UserTagStatus
	*  @param value
	**/
   public void setIp66601UserTagStatus(int index,char[] value) throws CFException {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(value);
   } 

     /**
	 * 	Update Ip66601UserTagStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66601UserTagStatus(int index,char[] source, int sourceIndex) throws CFException {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source, sourceIndex);
   	
   }
   
   public void setIp66601UserTagStatus(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66601UserTagStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66601UserTagStatus(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66601UserTagStatus with another Field
	 *	@param value
	 */
   public void setIp66601UserTagStatus(int index,Field source) {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source);
   }  
   
     /**
	 * 	Update Ip66601UserTagStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66601UserTagStatus(int index,Field source, int sourceIndex,int sourceLen) {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66601UserTagStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66601UserTagStatus(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66601UserTagLngth
	 *	@return ip66601UserTagLngth
	 */
	public short getIp66601UserTagLngth(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagLngth();
	}
	
	/**
	 * 	Update Ip66601UserTagLngth with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagLngth(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagLngth(number);
	}

	public void setIp66601UserTagLngth(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagLngth((short)number);
	}

	public void setIp66601UserTagLngth(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagLngth((short)number);
	}



	/**
	 *	Returns the value of acceptInput
	 *	@return acceptInput
	 */
   public char[] getAcceptInput() throws CFException  {              
   		return work.getAcceptInput();
   }

  
	/**
	*  set variable acceptInput
	*  @param value
	**/
   public void setAcceptInput(char[] value) throws CFException {
      work.setAcceptInput(value);
   } 

	/**
	 *	Returns the value of ip66601UserTagOccurrence
	 *	@return ip66601UserTagOccurrence
	 */
	public short getIp66601UserTagOccurrence(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserTagOccurrence();
	}
	
	/**
	 * 	Update Ip66601UserTagOccurrence with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagOccurrence(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagOccurrence(number);
	}

	public void setIp66601UserTagOccurrence(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagOccurrence((short)number);
	}

	public void setIp66601UserTagOccurrence(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagOccurrence((short)number);
	}



	/**
	 *	Returns the value of ip00854wEntry
	 *	@return ip00854wEntry
	 */   
	 public Ip00854wEntry getIp00854wEntry(int index) {
   	return ip00854wTableData.getIp00854wTable().getIp00854wEntry(index);
   }

    public List<Ip00854wEntry> getIp00854wEntry() {
        return ip00854wTableData.getIp00854wTable().getIp00854wEntry();
    }
   /**
	* 	Update Ip00854wEntry with the passed value
	*	@param value
	*/
   public void setIp00854wEntry(int index,char[] value) throws CFException {
      ip00854wTableData.getIp00854wTable().setIp00854wEntry((index),value);
   }   



public void setIp00854wIdx(int ip00854wIdx) { 
    SorttblCtx.this.ip00854wIdx = ip00854wIdx;
}

public int getIp00854wIdx() { 
    return SorttblCtx.this.ip00854wIdx;
}
	/**
	 *	Returns the value of idx
	 *	@return idx
	 */
	public short getIdx() throws CFException {        
   		return work.getIdx();
	}
	
	/**
	 * 	Update Idx with the passed value
	 *	@param number
	 */
	public void setIdx(short number)  throws CFException{
		work.setIdx(number);
	}

	public void setIdx(int number)  throws CFException{
		work.setIdx((short)number);
	}

	public void setIdx(long number)  throws CFException{
		work.setIdx((short)number);
	}



	/**
	 *	Returns the value of ip66601UserTagStart
	 *	@return ip66601UserTagStart
	 */
	public short getIp66601UserTagStart(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagStart();
	}
	
	/**
	 * 	Update Ip66601UserTagStart with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagStart(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStart(number);
	}

	public void setIp66601UserTagStart(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStart((short)number);
	}

	public void setIp66601UserTagStart(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStart((short)number);
	}



	/**
	 *	Returns the value of ip66601UserTagType
	 *	@return ip66601UserTagType
	 */
	public short getIp66601UserTagType(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType();
	}
	
	/**
	 * 	Update Ip66601UserTagType with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagType(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagType(number);
	}

	public void setIp66601UserTagType(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagType((short)number);
	}

	public void setIp66601UserTagType(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagType((short)number);
	}



	/**
	 *	Returns the value of recordsLoaded400
	 *	@return recordsLoaded400
	 */
	public int getRecordsLoaded400() throws CFException {        
   		return work.getRecordsLoaded400();
	}
	
	/**
	 * 	Update RecordsLoaded400 with the passed value
	 *	@param number
	 */
	public void setRecordsLoaded400(int number)  throws CFException{
		work.setRecordsLoaded400(number);
	}


	public void setRecordsLoaded400(long number)  throws CFException{
		work.setRecordsLoaded400((int)number);
	}


	/**
	 *	Returns the value of ip66601UserTagInformation
	 *	@return ip66601UserTagInformation
	 */   
	 public Ip66601UserTagInformation getIp66601UserTagInformation() {
   	return ip66601UserTagInformation;
   }


	/**
	 *	Returns the value of ip66601UserTcnt
	 *	@return ip66601UserTcnt
	 */
	public short getIp66601UserTcnt() throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTcnt();
	}
	
	/**
	 * 	Update Ip66601UserTcnt with the passed value
	 *	@param number
	 */
	public void setIp66601UserTcnt(short number)  throws CFException{
		ip66601UserTagInformation.setIp66601UserTcnt(number);
	}

	public void setIp66601UserTcnt(int number)  throws CFException{
		ip66601UserTagInformation.setIp66601UserTcnt((short)number);
	}

	public void setIp66601UserTcnt(long number)  throws CFException{
		ip66601UserTagInformation.setIp66601UserTcnt((short)number);
	}



	/**
	 *	Returns the value of ip66601UserTagNo
	 *	@return ip66601UserTagNo
	 */
	public short getIp66601UserTagNo(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo();
	}
	
	/**
	 * 	Update Ip66601UserTagNo with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagNo(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo(number);
	}

	public void setIp66601UserTagNo(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo((short)number);
	}

	public void setIp66601UserTagNo(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo((short)number);
	}



	/**
	 *	Returns the value of ip66601UserTagSubfldNo
	 *	@return ip66601UserTagSubfldNo
	 */
	public short getIp66601UserTagSubfldNo(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserTagSubfldNo();
	}
	
	/**
	 * 	Update Ip66601UserTagSubfldNo with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagSubfldNo(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagSubfldNo(number);
	}

	public void setIp66601UserTagSubfldNo(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagSubfldNo((short)number);
	}

	public void setIp66601UserTagSubfldNo(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagSubfldNo((short)number);
	}




        public SorttblCtx getSorttblCtx() {
            return SorttblCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip00854wTableData.hashCode();
        str += ip66601UserTagInformation.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineSplit0OutCtx clone() {
        MainlineSplit0OutCtx cloneObj = new MainlineSplit0OutCtx();
        cloneObj.ip00854wTableData = new Ip00854wTableData();
        cloneObj.ip00854wTableData.set(ip00854wTableData.getClonedField());
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineSplit0OutCtx getMainlineSplit0OutCtx() {
            return new MainlineSplit0OutCtx();
    }
     public class MainlineSplit1InCtx implements Cloneable {
     Ip66601UserTagInformation ip66601UserTagInformation = SorttblCtx.this.getIp66601UserTagInformation();
     Work work = SorttblCtx.this.getWork();


public void setIp66601UserT(int ip66601UserT) { 
    SorttblCtx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return SorttblCtx.this.ip66601UserT;
}
	/**
	 *	Returns the value of idx
	 *	@return idx
	 */
	public short getIdx() throws CFException {        
   		return work.getIdx();
	}
	
	/**
	 * 	Update Idx with the passed value
	 *	@param number
	 */
	public void setIdx(short number)  throws CFException{
		work.setIdx(number);
	}

	public void setIdx(int number)  throws CFException{
		work.setIdx((short)number);
	}

	public void setIdx(long number)  throws CFException{
		work.setIdx((short)number);
	}




        public SorttblCtx getSorttblCtx() {
            return SorttblCtx.this;
        }

        public MainlineSplit1OutCtx getMainlineSplit1OutCtx() {
            return new MainlineSplit1OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66601UserTagInformation.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineSplit1InCtx clone() {
        MainlineSplit1InCtx cloneObj = new MainlineSplit1InCtx();
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineSplit1InCtx getMainlineSplit1InCtx() {
            return new MainlineSplit1InCtx();
    }
     public class MainlineSplit1OutCtx implements Cloneable {
     Ip66601UserTagInformation ip66601UserTagInformation = SorttblCtx.this.getIp66601UserTagInformation();
     Work work = SorttblCtx.this.getWork();

	/**
	 *	Returns the value of idx
	 *	@return idx
	 */
	public short getIdx() throws CFException {        
   		return work.getIdx();
	}
	
	/**
	 * 	Update Idx with the passed value
	 *	@param number
	 */
	public void setIdx(short number)  throws CFException{
		work.setIdx(number);
	}

	public void setIdx(int number)  throws CFException{
		work.setIdx((short)number);
	}

	public void setIdx(long number)  throws CFException{
		work.setIdx((short)number);
	}



	/**
	 *	Returns the value of ip66601UserTagStatus
	 *	@return ip66601UserTagStatus
	 */
   public char[] getIp66601UserTagStatus(int index) throws CFException  {              
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagStatus();
   }

  
	/**
	*  set variable ip66601UserTagStatus
	*  @param value
	**/
   public void setIp66601UserTagStatus(int index,char[] value) throws CFException {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(value);
   } 

     /**
	 * 	Update Ip66601UserTagStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66601UserTagStatus(int index,char[] source, int sourceIndex) throws CFException {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source, sourceIndex);
   	
   }
   
   public void setIp66601UserTagStatus(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66601UserTagStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66601UserTagStatus(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66601UserTagStatus with another Field
	 *	@param value
	 */
   public void setIp66601UserTagStatus(int index,Field source) {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source);
   }  
   
     /**
	 * 	Update Ip66601UserTagStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66601UserTagStatus(int index,Field source, int sourceIndex,int sourceLen) {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66601UserTagStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66601UserTagStatus(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66601UserTagStart
	 *	@return ip66601UserTagStart
	 */
	public short getIp66601UserTagStart(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagStart();
	}
	
	/**
	 * 	Update Ip66601UserTagStart with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagStart(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStart(number);
	}

	public void setIp66601UserTagStart(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStart((short)number);
	}

	public void setIp66601UserTagStart(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStart((short)number);
	}



	/**
	 *	Returns the value of ip66601UserTagLngth
	 *	@return ip66601UserTagLngth
	 */
	public short getIp66601UserTagLngth(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagLngth();
	}
	
	/**
	 * 	Update Ip66601UserTagLngth with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagLngth(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagLngth(number);
	}

	public void setIp66601UserTagLngth(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagLngth((short)number);
	}

	public void setIp66601UserTagLngth(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagLngth((short)number);
	}



	/**
	 *	Returns the value of ip66601UserTagType
	 *	@return ip66601UserTagType
	 */
	public short getIp66601UserTagType(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType();
	}
	
	/**
	 * 	Update Ip66601UserTagType with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagType(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagType(number);
	}

	public void setIp66601UserTagType(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagType((short)number);
	}

	public void setIp66601UserTagType(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagType((short)number);
	}



	/**
	 *	Returns the value of ip66601UserTagOccurrence
	 *	@return ip66601UserTagOccurrence
	 */
	public short getIp66601UserTagOccurrence(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserTagOccurrence();
	}
	
	/**
	 * 	Update Ip66601UserTagOccurrence with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagOccurrence(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagOccurrence(number);
	}

	public void setIp66601UserTagOccurrence(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagOccurrence((short)number);
	}

	public void setIp66601UserTagOccurrence(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagOccurrence((short)number);
	}



	/**
	 *	Returns the value of ip66601UserTagNo
	 *	@return ip66601UserTagNo
	 */
	public short getIp66601UserTagNo(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo();
	}
	
	/**
	 * 	Update Ip66601UserTagNo with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagNo(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo(number);
	}

	public void setIp66601UserTagNo(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo((short)number);
	}

	public void setIp66601UserTagNo(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo((short)number);
	}



	/**
	 *	Returns the value of ip66601UserTagSubfldNo
	 *	@return ip66601UserTagSubfldNo
	 */
	public short getIp66601UserTagSubfldNo(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserTagSubfldNo();
	}
	
	/**
	 * 	Update Ip66601UserTagSubfldNo with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagSubfldNo(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagSubfldNo(number);
	}

	public void setIp66601UserTagSubfldNo(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagSubfldNo((short)number);
	}

	public void setIp66601UserTagSubfldNo(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagSubfldNo((short)number);
	}




        public SorttblCtx getSorttblCtx() {
            return SorttblCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66601UserTagInformation.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineSplit1OutCtx clone() {
        MainlineSplit1OutCtx cloneObj = new MainlineSplit1OutCtx();
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineSplit1OutCtx getMainlineSplit1OutCtx() {
            return new MainlineSplit1OutCtx();
    }
     public class MainlineSplit2InCtx implements Cloneable {
     Ip66601UserTagInformation ip66601UserTagInformation = SorttblCtx.this.getIp66601UserTagInformation();
     Work work = SorttblCtx.this.getWork();


public void setIp66601UserT(int ip66601UserT) { 
    SorttblCtx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return SorttblCtx.this.ip66601UserT;
}
	/**
	 *	Returns the value of idx
	 *	@return idx
	 */
	public short getIdx() throws CFException {        
   		return work.getIdx();
	}
	
	/**
	 * 	Update Idx with the passed value
	 *	@param number
	 */
	public void setIdx(short number)  throws CFException{
		work.setIdx(number);
	}

	public void setIdx(int number)  throws CFException{
		work.setIdx((short)number);
	}

	public void setIdx(long number)  throws CFException{
		work.setIdx((short)number);
	}



	/**
	 *	Returns the value of quicksort300
	 *	@return quicksort300
	 */
   public char[] getQuicksort300() throws CFException  {              
   		return work.getQuicksort300();
   }

  
	/**
	*  set variable quicksort300
	*  @param value
	**/
   public void setQuicksort300(char[] value) throws CFException {
      work.setQuicksort300(value);
   } 

	/**
	 *	Returns the value of ip66601UserTagType
	 *	@return ip66601UserTagType
	 */
	public short getIp66601UserTagType(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagType();
	}
	
	/**
	 * 	Update Ip66601UserTagType with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagType(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagType(number);
	}

	public void setIp66601UserTagType(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagType((short)number);
	}

	public void setIp66601UserTagType(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagType((short)number);
	}



	/**
	 *	Returns the value of ip66601UserTcnt
	 *	@return ip66601UserTcnt
	 */
	public short getIp66601UserTcnt() throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTcnt();
	}
	
	/**
	 * 	Update Ip66601UserTcnt with the passed value
	 *	@param number
	 */
	public void setIp66601UserTcnt(short number)  throws CFException{
		ip66601UserTagInformation.setIp66601UserTcnt(number);
	}

	public void setIp66601UserTcnt(int number)  throws CFException{
		ip66601UserTagInformation.setIp66601UserTcnt((short)number);
	}

	public void setIp66601UserTcnt(long number)  throws CFException{
		ip66601UserTagInformation.setIp66601UserTcnt((short)number);
	}



	/**
	 *	Returns the value of ip66601UserTagOccurrence
	 *	@return ip66601UserTagOccurrence
	 */
	public short getIp66601UserTagOccurrence(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserTagOccurrence();
	}
	
	/**
	 * 	Update Ip66601UserTagOccurrence with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagOccurrence(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagOccurrence(number);
	}

	public void setIp66601UserTagOccurrence(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagOccurrence((short)number);
	}

	public void setIp66601UserTagOccurrence(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagOccurrence((short)number);
	}



	/**
	 *	Returns the value of ip66601UserTagNo
	 *	@return ip66601UserTagNo
	 */
	public short getIp66601UserTagNo(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().getIp66601UserTagNo();
	}
	
	/**
	 * 	Update Ip66601UserTagNo with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagNo(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo(number);
	}

	public void setIp66601UserTagNo(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo((short)number);
	}

	public void setIp66601UserTagNo(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserElementId().setIp66601UserTagNo((short)number);
	}




        public SorttblCtx getSorttblCtx() {
            return SorttblCtx.this;
        }

        public MainlineSplit2OutCtx getMainlineSplit2OutCtx() {
            return new MainlineSplit2OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66601UserTagInformation.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineSplit2InCtx clone() {
        MainlineSplit2InCtx cloneObj = new MainlineSplit2InCtx();
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineSplit2InCtx getMainlineSplit2InCtx() {
            return new MainlineSplit2InCtx();
    }
     public class MainlineSplit2OutCtx implements Cloneable {
     Ip66601UserTagInformation ip66601UserTagInformation = SorttblCtx.this.getIp66601UserTagInformation();
     Work work = SorttblCtx.this.getWork();


public void setIp66601UserT(int ip66601UserT) { 
    SorttblCtx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return SorttblCtx.this.ip66601UserT;
}
	/**
	 *	Returns the value of userEnd800
	 *	@return userEnd800
	 */
	public int getUserEnd800() throws CFException {        
   		return userEnd800;
	}
	
	/**
	 * 	Update UserEnd800 with the passed value
	 *	@param number
	 */
	public void setUserEnd800(int number)  throws CFException{
		SorttblCtx.this.setUserEnd800(number);
	}


	public void setUserEnd800(long number)  throws CFException{
		SorttblCtx.this.setUserEnd800((int)number);
	}


	/**
	 *	Returns the value of ip66601UserTagStatus
	 *	@return ip66601UserTagStatus
	 */
   public char[] getIp66601UserTagStatus(int index) throws CFException  {              
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagStatus();
   }

  
	/**
	*  set variable ip66601UserTagStatus
	*  @param value
	**/
   public void setIp66601UserTagStatus(int index,char[] value) throws CFException {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(value);
   } 

     /**
	 * 	Update Ip66601UserTagStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66601UserTagStatus(int index,char[] source, int sourceIndex) throws CFException {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source, sourceIndex);
   	
   }
   
   public void setIp66601UserTagStatus(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66601UserTagStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66601UserTagStatus(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66601UserTagStatus with another Field
	 *	@param value
	 */
   public void setIp66601UserTagStatus(int index,Field source) {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source);
   }  
   
     /**
	 * 	Update Ip66601UserTagStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66601UserTagStatus(int index,Field source, int sourceIndex,int sourceLen) {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ip66601UserTagStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66601UserTagStatus(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStatus(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66601UserTagStart
	 *	@return ip66601UserTagStart
	 */
	public short getIp66601UserTagStart(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagStart();
	}
	
	/**
	 * 	Update Ip66601UserTagStart with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagStart(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStart(number);
	}

	public void setIp66601UserTagStart(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStart((short)number);
	}

	public void setIp66601UserTagStart(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagStart((short)number);
	}



	/**
	 *	Returns the value of ip66601UserTagLngth
	 *	@return ip66601UserTagLngth
	 */
	public short getIp66601UserTagLngth(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagLngth();
	}
	
	/**
	 * 	Update Ip66601UserTagLngth with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagLngth(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagLngth(number);
	}

	public void setIp66601UserTagLngth(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagLngth((short)number);
	}

	public void setIp66601UserTagLngth(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagLngth((short)number);
	}



	/**
	 *	Returns the value of ptrIp666040800
	 *	@return ptrIp666040800
	 */
   public char[] getPtrIp666040800() throws CFException  {              
   		return work.getPtrIp666040800();
   }

  
	/**
	*  set variable ptrIp666040800
	*  @param value
	**/
   public void setPtrIp666040800(char[] value) throws CFException {
      work.setPtrIp666040800(value);
   } 


public void setIp66601UserEnd(int ip66601UserEnd) { 
    SorttblCtx.this.ip66601UserEnd = ip66601UserEnd;
}

public int getIp66601UserEnd() { 
    return SorttblCtx.this.ip66601UserEnd;
}
	/**
	 *	Returns the value of ip66601UserTagSubfldNo
	 *	@return ip66601UserTagSubfldNo
	 */
	public short getIp66601UserTagSubfldNo(int index) throws CFException {        
   		return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().getIp66601UserTagSubfldNo();
	}
	
	/**
	 * 	Update Ip66601UserTagSubfldNo with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagSubfldNo(int index,short number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagSubfldNo(number);
	}

	public void setIp66601UserTagSubfldNo(int index,int number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagSubfldNo((short)number);
	}

	public void setIp66601UserTagSubfldNo(int index,long number)  throws CFException{
		ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId().setIp66601UserTagSubfldNo((short)number);
	}




        public SorttblCtx getSorttblCtx() {
            return SorttblCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66601UserTagInformation.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineSplit2OutCtx clone() {
        MainlineSplit2OutCtx cloneObj = new MainlineSplit2OutCtx();
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineSplit2OutCtx getMainlineSplit2OutCtx() {
            return new MainlineSplit2OutCtx();
    }
}
