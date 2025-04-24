package com.cloudframe.app.search3;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.search3.dto.Table;
import com.cloudframe.app.search3.dto.AccGrp500;
import com.cloudframe.app.search3.dto.Work;
import com.cloudframe.app.search3.dto.Ip66601UserTagInformation;
import com.cloudframe.app.search3.dto.TableGroup;
import com.cloudframe.app.search3.dto.Ip66601UserTag;
import com.cloudframe.app.search3.dto.Ip66601UserTagTable;
import com.cloudframe.app.search3.dto.TableEntry;
import com.cloudframe.app.search3.dto.SrchVar;


@Context
public class Search3Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;
    Ip66601UserTagInformation ip66601UserTagInformation;
    AccGrp500 accGrp500;
    TableGroup tableGroup;
    SrchVar srchVar;

    int ip66601UserP;
    int ip66601UserStart;
    int ip66601UserEnd;
    int tableIndex;
    int ip66601UserT;
    int finNfCurrCdIdx500;
    int ip66601UserRight;
    int ip66601UserLeft;
    int ip66601UserMedian;

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


    public Work getWork() {
        if (work == null) {
            work = new Work();
        }

        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }
    public Ip66601UserTagInformation getIp66601UserTagInformation() {
        if (ip66601UserTagInformation == null) {
            ip66601UserTagInformation = new Ip66601UserTagInformation();
        }

        return ip66601UserTagInformation;
    }

    public void setIp66601UserTagInformation(Ip66601UserTagInformation ip66601UserTagInformation) {
        this.ip66601UserTagInformation = ip66601UserTagInformation;
    }
    public AccGrp500 getAccGrp500() {
        if (accGrp500 == null) {
            accGrp500 = new AccGrp500();
        }

        return accGrp500;
    }

    public void setAccGrp500(AccGrp500 accGrp500) {
        this.accGrp500 = accGrp500;
    }
    public TableGroup getTableGroup() {
        if (tableGroup == null) {
            tableGroup = new TableGroup();
        }

        return tableGroup;
    }

    public void setTableGroup(TableGroup tableGroup) {
        this.tableGroup = tableGroup;
    }
    public SrchVar getSrchVar() {
        if (srchVar == null) {
            srchVar = new SrchVar();
        }

        return srchVar;
    }

    public void setSrchVar(SrchVar srchVar) {
        this.srchVar = srchVar;
    }

    public int getIp66601UserP() {
        return ip66601UserP;
    }

    public void setIp66601UserP(int ip66601UserP) {
        this.ip66601UserP = ip66601UserP;
    }
    public int getIp66601UserStart() {
        return ip66601UserStart;
    }

    public void setIp66601UserStart(int ip66601UserStart) {
        this.ip66601UserStart = ip66601UserStart;
    }
    public int getIp66601UserEnd() {
        return ip66601UserEnd;
    }

    public void setIp66601UserEnd(int ip66601UserEnd) {
        this.ip66601UserEnd = ip66601UserEnd;
    }
    public int getTableIndex() {
        return tableIndex;
    }

    public void setTableIndex(int tableIndex) {
        this.tableIndex = tableIndex;
    }
    public int getIp66601UserT() {
        return ip66601UserT;
    }

    public void setIp66601UserT(int ip66601UserT) {
        this.ip66601UserT = ip66601UserT;
    }
    public int getFinNfCurrCdIdx500() {
        return finNfCurrCdIdx500;
    }

    public void setFinNfCurrCdIdx500(int finNfCurrCdIdx500) {
        this.finNfCurrCdIdx500 = finNfCurrCdIdx500;
    }
    public int getIp66601UserRight() {
        return ip66601UserRight;
    }

    public void setIp66601UserRight(int ip66601UserRight) {
        this.ip66601UserRight = ip66601UserRight;
    }
    public int getIp66601UserLeft() {
        return ip66601UserLeft;
    }

    public void setIp66601UserLeft(int ip66601UserLeft) {
        this.ip66601UserLeft = ip66601UserLeft;
    }
    public int getIp66601UserMedian() {
        return ip66601UserMedian;
    }

    public void setIp66601UserMedian(int ip66601UserMedian) {
        this.ip66601UserMedian = ip66601UserMedian;
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
        str += ip66601UserTagInformation.hashCode();
        str += accGrp500.hashCode();
        str += tableGroup.hashCode();
        str += srchVar.hashCode();
       return str.hashCode();
    }

    public Search3Ctx clone() {
        Search3Ctx cloneObj = new Search3Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        cloneObj.accGrp500 = new AccGrp500();
        cloneObj.accGrp500.set(accGrp500.getClonedField());
        cloneObj.tableGroup = new TableGroup();
        cloneObj.tableGroup.set(tableGroup.getClonedField());
        cloneObj.srchVar = new SrchVar();
        cloneObj.srchVar.set(srchVar.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainLineInCtx implements Cloneable {
     Work work = Search3Ctx.this.getWork();
     Ip66601UserTagInformation ip66601UserTagInformation = Search3Ctx.this.getIp66601UserTagInformation();

	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public short getI() throws CFException {        
   		return work.getI();
	}
	
	/**
	 * 	Update I with the passed value
	 *	@param number
	 */
	public void setI(short number)  throws CFException{
		work.setI(number);
	}

	public void setI(int number)  throws CFException{
		work.setI((short)number);
	}

	public void setI(long number)  throws CFException{
		work.setI((short)number);
	}




        public Search3Ctx getSearch3Ctx() {
            return Search3Ctx.this;
        }

        public MainLineOutCtx getMainLineOutCtx() {
            return new MainLineOutCtx();
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
        str += ip66601UserTagInformation.hashCode();
       return str.hashCode();
    }

    public MainLineInCtx clone() {
        MainLineInCtx cloneObj = new MainLineInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        return cloneObj;
    }

    }

    public MainLineInCtx getMainLineInCtx() {
            return new MainLineInCtx();
    }
     public class MainLineOutCtx implements Cloneable {
     Work work = Search3Ctx.this.getWork();
     Ip66601UserTagInformation ip66601UserTagInformation = Search3Ctx.this.getIp66601UserTagInformation();

	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public short getI() throws CFException {        
   		return work.getI();
	}
	
	/**
	 * 	Update I with the passed value
	 *	@param number
	 */
	public void setI(short number)  throws CFException{
		work.setI(number);
	}

	public void setI(int number)  throws CFException{
		work.setI((short)number);
	}

	public void setI(long number)  throws CFException{
		work.setI((short)number);
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




public void setIp66601UserT(int ip66601UserT) { 
    Search3Ctx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return Search3Ctx.this.ip66601UserT;
}
	/**
	 *	Returns the value of srchval
	 *	@return srchval
	 */
	public int getSrchval() throws CFException {
   		return work.getSrchval();
	}


	/**
	 *	Returns String value of srchval
	 *	@return srchval
	 */
	public char[]  getSrchvalString() throws CFException {
	     return String.valueOf(work.getSrchvalString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean srchvalIsNumeric()  throws CFException{
	    return work.srchvalIsNumeric();
	}

	/**
	 * 	Update Srchval with the passed value
	 *	@param number
	 */
	public void setSrchval(int number)  throws CFException{
		work.setSrchval(number);
	}
	

	public void setSrchval(long number)  throws CFException{
	    work.setSrchval(number);
	}
	
	
	/**
	 * 	Update Srchval with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrchval(char[] value)  throws CFException {
		work.setSrchval(value);
	}
	
	/**
	 * 	Update Srchval with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrchvalString(char[] value)  throws CFException{
		work.setSrchval(value);
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




public void setIp66601UserRight(int ip66601UserRight) { 
    Search3Ctx.this.ip66601UserRight = ip66601UserRight;
}

public int getIp66601UserRight() { 
    return Search3Ctx.this.ip66601UserRight;
}

public void setIp66601UserStart(int ip66601UserStart) { 
    Search3Ctx.this.ip66601UserStart = ip66601UserStart;
}

public int getIp66601UserStart() { 
    return Search3Ctx.this.ip66601UserStart;
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




public void setIp66601UserLeft(int ip66601UserLeft) { 
    Search3Ctx.this.ip66601UserLeft = ip66601UserLeft;
}

public int getIp66601UserLeft() { 
    return Search3Ctx.this.ip66601UserLeft;
}

public void setIp66601UserMedian(int ip66601UserMedian) { 
    Search3Ctx.this.ip66601UserMedian = ip66601UserMedian;
}

public int getIp66601UserMedian() { 
    return Search3Ctx.this.ip66601UserMedian;
}

public void setIp66601UserEnd(int ip66601UserEnd) { 
    Search3Ctx.this.ip66601UserEnd = ip66601UserEnd;
}

public int getIp66601UserEnd() { 
    return Search3Ctx.this.ip66601UserEnd;
}

public void setIp66601UserP(int ip66601UserP) { 
    Search3Ctx.this.ip66601UserP = ip66601UserP;
}

public int getIp66601UserP() { 
    return Search3Ctx.this.ip66601UserP;
}

        public Search3Ctx getSearch3Ctx() {
            return Search3Ctx.this;
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
        str += ip66601UserTagInformation.hashCode();
       return str.hashCode();
    }

    public MainLineOutCtx clone() {
        MainLineOutCtx cloneObj = new MainLineOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        return cloneObj;
    }

    }

    public MainLineOutCtx getMainLineOutCtx() {
            return new MainLineOutCtx();
    }
     public class SearchInCtx implements Cloneable {
     Work work = Search3Ctx.this.getWork();
     Ip66601UserTagInformation ip66601UserTagInformation = Search3Ctx.this.getIp66601UserTagInformation();


public void setIp66601UserT(int ip66601UserT) { 
    Search3Ctx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return Search3Ctx.this.ip66601UserT;
}
	/**
	 *	Returns the value of srchval
	 *	@return srchval
	 */
	public int getSrchval() throws CFException {
   		return work.getSrchval();
	}


	/**
	 *	Returns String value of srchval
	 *	@return srchval
	 */
	public char[]  getSrchvalString() throws CFException {
	     return String.valueOf(work.getSrchvalString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean srchvalIsNumeric()  throws CFException{
	    return work.srchvalIsNumeric();
	}

	/**
	 * 	Update Srchval with the passed value
	 *	@param number
	 */
	public void setSrchval(int number)  throws CFException{
		work.setSrchval(number);
	}
	

	public void setSrchval(long number)  throws CFException{
	    work.setSrchval(number);
	}
	
	
	/**
	 * 	Update Srchval with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrchval(char[] value)  throws CFException {
		work.setSrchval(value);
	}
	
	/**
	 * 	Update Srchval with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrchvalString(char[] value)  throws CFException{
		work.setSrchval(value);
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




public void setIp66601UserRight(int ip66601UserRight) { 
    Search3Ctx.this.ip66601UserRight = ip66601UserRight;
}

public int getIp66601UserRight() { 
    return Search3Ctx.this.ip66601UserRight;
}

public void setIp66601UserStart(int ip66601UserStart) { 
    Search3Ctx.this.ip66601UserStart = ip66601UserStart;
}

public int getIp66601UserStart() { 
    return Search3Ctx.this.ip66601UserStart;
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




public void setIp66601UserLeft(int ip66601UserLeft) { 
    Search3Ctx.this.ip66601UserLeft = ip66601UserLeft;
}

public int getIp66601UserLeft() { 
    return Search3Ctx.this.ip66601UserLeft;
}
	/**
	 *	Returns the value of ip66601UserTag
	 *	@return ip66601UserTag
	 */   
	 public Ip66601UserTag getIp66601UserTag(int index) {
   	return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index);
   }

    public List<Ip66601UserTag> getIp66601UserTag() {
        return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag();
    }
   /**
	* 	Update Ip66601UserTag with the passed value
	*	@param value
	*/
   public void setIp66601UserTag(int index,char[] value) throws CFException {
      ip66601UserTagInformation.getIp66601UserTagTable().setIp66601UserTag((index),value);
   }   



public void setIp66601UserMedian(int ip66601UserMedian) { 
    Search3Ctx.this.ip66601UserMedian = ip66601UserMedian;
}

public int getIp66601UserMedian() { 
    return Search3Ctx.this.ip66601UserMedian;
}

public void setIp66601UserEnd(int ip66601UserEnd) { 
    Search3Ctx.this.ip66601UserEnd = ip66601UserEnd;
}

public int getIp66601UserEnd() { 
    return Search3Ctx.this.ip66601UserEnd;
}

public void setIp66601UserP(int ip66601UserP) { 
    Search3Ctx.this.ip66601UserP = ip66601UserP;
}

public int getIp66601UserP() { 
    return Search3Ctx.this.ip66601UserP;
}
	/**
	 *	Returns the value of ip66601UserTagTable
	 *	@return ip66601UserTagTable
	 */   
	 public Ip66601UserTagTable getIp66601UserTagTable() {
   	return ip66601UserTagInformation.getIp66601UserTagTable();
   }

   /**
	* 	Update Ip66601UserTagTable with the passed value
	*	@param value
	*/
   public void setIp66601UserTagTable(char[] value) throws CFException {
      ip66601UserTagInformation.setIp66601UserTagTable(value);
   }   

     /**
	 * 	Update Ip66601UserTagTable 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp66601UserTagTable(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip66601UserTagInformation.setIp66601UserTagTable(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66601UserTagTable 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66601UserTagTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip66601UserTagInformation.setIp66601UserTagTable(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66601UserTagTable with another Field
	 *	@param value
	 */
   public void setIp66601UserTagTable(Field source) {
   	ip66601UserTagInformation.setIp66601UserTagTable(source);
   }  
   
     /**
	 * 	Update Ip66601UserTagTable 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp66601UserTagTable(Field source, int sourceIndex,int sourceLen) {
   	ip66601UserTagInformation.setIp66601UserTagTable(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66601UserTagTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66601UserTagTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip66601UserTagInformation.setIp66601UserTagTable(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Search3Ctx getSearch3Ctx() {
            return Search3Ctx.this;
        }

        public SearchOutCtx getSearchOutCtx() {
            return new SearchOutCtx();
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
        str += ip66601UserTagInformation.hashCode();
       return str.hashCode();
    }

    public SearchInCtx clone() {
        SearchInCtx cloneObj = new SearchInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        return cloneObj;
    }

    }

    public SearchInCtx getSearchInCtx() {
            return new SearchInCtx();
    }
     public class SearchOutCtx implements Cloneable {
     Work work = Search3Ctx.this.getWork();
     Ip66601UserTagInformation ip66601UserTagInformation = Search3Ctx.this.getIp66601UserTagInformation();

	/**
	 *	Returns the value of lastDeTag800
	 *	@return lastDeTag800
	 */
	public int getLastDeTag800() throws CFException {        
   		return work.getLastDeTag800();
	}
	
	/**
	 * 	Update LastDeTag800 with the passed value
	 *	@param number
	 */
	public void setLastDeTag800(int number)  throws CFException{
		work.setLastDeTag800(number);
	}


	public void setLastDeTag800(long number)  throws CFException{
		work.setLastDeTag800((int)number);
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




public void setIp66601UserP(int ip66601UserP) { 
    Search3Ctx.this.ip66601UserP = ip66601UserP;
}

public int getIp66601UserP() { 
    return Search3Ctx.this.ip66601UserP;
}

        public Search3Ctx getSearch3Ctx() {
            return Search3Ctx.this;
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
        str += ip66601UserTagInformation.hashCode();
       return str.hashCode();
    }

    public SearchOutCtx clone() {
        SearchOutCtx cloneObj = new SearchOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        return cloneObj;
    }

    }

    public SearchOutCtx getSearchOutCtx() {
            return new SearchOutCtx();
    }
     public class Search0300InCtx implements Cloneable {
     Work work = Search3Ctx.this.getWork();
     Ip66601UserTagInformation ip66601UserTagInformation = Search3Ctx.this.getIp66601UserTagInformation();


public void setIp66601UserT(int ip66601UserT) { 
    Search3Ctx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return Search3Ctx.this.ip66601UserT;
}
	/**
	 *	Returns the value of srchval
	 *	@return srchval
	 */
	public int getSrchval() throws CFException {
   		return work.getSrchval();
	}


	/**
	 *	Returns String value of srchval
	 *	@return srchval
	 */
	public char[]  getSrchvalString() throws CFException {
	     return String.valueOf(work.getSrchvalString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean srchvalIsNumeric()  throws CFException{
	    return work.srchvalIsNumeric();
	}

	/**
	 * 	Update Srchval with the passed value
	 *	@param number
	 */
	public void setSrchval(int number)  throws CFException{
		work.setSrchval(number);
	}
	

	public void setSrchval(long number)  throws CFException{
	    work.setSrchval(number);
	}
	
	
	/**
	 * 	Update Srchval with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrchval(char[] value)  throws CFException {
		work.setSrchval(value);
	}
	
	/**
	 * 	Update Srchval with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrchvalString(char[] value)  throws CFException{
		work.setSrchval(value);
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




public void setIp66601UserRight(int ip66601UserRight) { 
    Search3Ctx.this.ip66601UserRight = ip66601UserRight;
}

public int getIp66601UserRight() { 
    return Search3Ctx.this.ip66601UserRight;
}

public void setIp66601UserStart(int ip66601UserStart) { 
    Search3Ctx.this.ip66601UserStart = ip66601UserStart;
}

public int getIp66601UserStart() { 
    return Search3Ctx.this.ip66601UserStart;
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




public void setIp66601UserLeft(int ip66601UserLeft) { 
    Search3Ctx.this.ip66601UserLeft = ip66601UserLeft;
}

public int getIp66601UserLeft() { 
    return Search3Ctx.this.ip66601UserLeft;
}
	/**
	 *	Returns the value of ip66601UserTag
	 *	@return ip66601UserTag
	 */   
	 public Ip66601UserTag getIp66601UserTag(int index) {
   	return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index);
   }

    public List<Ip66601UserTag> getIp66601UserTag() {
        return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag();
    }
   /**
	* 	Update Ip66601UserTag with the passed value
	*	@param value
	*/
   public void setIp66601UserTag(int index,char[] value) throws CFException {
      ip66601UserTagInformation.getIp66601UserTagTable().setIp66601UserTag((index),value);
   }   



public void setIp66601UserMedian(int ip66601UserMedian) { 
    Search3Ctx.this.ip66601UserMedian = ip66601UserMedian;
}

public int getIp66601UserMedian() { 
    return Search3Ctx.this.ip66601UserMedian;
}

public void setIp66601UserEnd(int ip66601UserEnd) { 
    Search3Ctx.this.ip66601UserEnd = ip66601UserEnd;
}

public int getIp66601UserEnd() { 
    return Search3Ctx.this.ip66601UserEnd;
}

public void setIp66601UserP(int ip66601UserP) { 
    Search3Ctx.this.ip66601UserP = ip66601UserP;
}

public int getIp66601UserP() { 
    return Search3Ctx.this.ip66601UserP;
}
	/**
	 *	Returns the value of ip66601UserTagTable
	 *	@return ip66601UserTagTable
	 */   
	 public Ip66601UserTagTable getIp66601UserTagTable() {
   	return ip66601UserTagInformation.getIp66601UserTagTable();
   }

   /**
	* 	Update Ip66601UserTagTable with the passed value
	*	@param value
	*/
   public void setIp66601UserTagTable(char[] value) throws CFException {
      ip66601UserTagInformation.setIp66601UserTagTable(value);
   }   

     /**
	 * 	Update Ip66601UserTagTable 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp66601UserTagTable(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip66601UserTagInformation.setIp66601UserTagTable(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66601UserTagTable 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66601UserTagTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip66601UserTagInformation.setIp66601UserTagTable(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66601UserTagTable with another Field
	 *	@param value
	 */
   public void setIp66601UserTagTable(Field source) {
   	ip66601UserTagInformation.setIp66601UserTagTable(source);
   }  
   
     /**
	 * 	Update Ip66601UserTagTable 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp66601UserTagTable(Field source, int sourceIndex,int sourceLen) {
   	ip66601UserTagInformation.setIp66601UserTagTable(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66601UserTagTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66601UserTagTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip66601UserTagInformation.setIp66601UserTagTable(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Search3Ctx getSearch3Ctx() {
            return Search3Ctx.this;
        }

        public Search0300OutCtx getSearch0300OutCtx() {
            return new Search0300OutCtx();
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
        str += ip66601UserTagInformation.hashCode();
       return str.hashCode();
    }

    public Search0300InCtx clone() {
        Search0300InCtx cloneObj = new Search0300InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        return cloneObj;
    }

    }

    public Search0300InCtx getSearch0300InCtx() {
            return new Search0300InCtx();
    }
     public class Search0300OutCtx implements Cloneable {
     Work work = Search3Ctx.this.getWork();
     Ip66601UserTagInformation ip66601UserTagInformation = Search3Ctx.this.getIp66601UserTagInformation();

	/**
	 *	Returns the value of lastDeTag800
	 *	@return lastDeTag800
	 */
	public int getLastDeTag800() throws CFException {        
   		return work.getLastDeTag800();
	}
	
	/**
	 * 	Update LastDeTag800 with the passed value
	 *	@param number
	 */
	public void setLastDeTag800(int number)  throws CFException{
		work.setLastDeTag800(number);
	}


	public void setLastDeTag800(long number)  throws CFException{
		work.setLastDeTag800((int)number);
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




public void setIp66601UserEnd(int ip66601UserEnd) { 
    Search3Ctx.this.ip66601UserEnd = ip66601UserEnd;
}

public int getIp66601UserEnd() { 
    return Search3Ctx.this.ip66601UserEnd;
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




        public Search3Ctx getSearch3Ctx() {
            return Search3Ctx.this;
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
        str += ip66601UserTagInformation.hashCode();
       return str.hashCode();
    }

    public Search0300OutCtx clone() {
        Search0300OutCtx cloneObj = new Search0300OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        return cloneObj;
    }

    }

    public Search0300OutCtx getSearch0300OutCtx() {
            return new Search0300OutCtx();
    }
     public class Search0400InCtx implements Cloneable {
     Work work = Search3Ctx.this.getWork();
     Ip66601UserTagInformation ip66601UserTagInformation = Search3Ctx.this.getIp66601UserTagInformation();
     AccGrp500 accGrp500 = Search3Ctx.this.getAccGrp500();


public void setIp66601UserT(int ip66601UserT) { 
    Search3Ctx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return Search3Ctx.this.ip66601UserT;
}
	/**
	 *	Returns the value of srchval
	 *	@return srchval
	 */
	public int getSrchval() throws CFException {
   		return work.getSrchval();
	}


	/**
	 *	Returns String value of srchval
	 *	@return srchval
	 */
	public char[]  getSrchvalString() throws CFException {
	     return String.valueOf(work.getSrchvalString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean srchvalIsNumeric()  throws CFException{
	    return work.srchvalIsNumeric();
	}

	/**
	 * 	Update Srchval with the passed value
	 *	@param number
	 */
	public void setSrchval(int number)  throws CFException{
		work.setSrchval(number);
	}
	

	public void setSrchval(long number)  throws CFException{
	    work.setSrchval(number);
	}
	
	
	/**
	 * 	Update Srchval with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrchval(char[] value)  throws CFException {
		work.setSrchval(value);
	}
	
	/**
	 * 	Update Srchval with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrchvalString(char[] value)  throws CFException{
		work.setSrchval(value);
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
	 *	Returns the value of accFinNfAmt500
	 *	@return accFinNfAmt500
	 */
	public int getAccFinNfAmt500(int index) throws CFException {        
   		return accGrp500.getAccFinTbl500(index).getAccFinNfAmt500();
	}
	
	/**
	 * 	Update AccFinNfAmt500 with the passed value
	 *	@param number
	 */
	public void setAccFinNfAmt500(int index,int number)  throws CFException{
		accGrp500.getAccFinTbl500(index).setAccFinNfAmt500(number);
	}


	public void setAccFinNfAmt500(int index,long number)  throws CFException{
		accGrp500.getAccFinTbl500(index).setAccFinNfAmt500((int)number);
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


public void setFinNfCurrCdIdx500(int finNfCurrCdIdx500) { 
    Search3Ctx.this.finNfCurrCdIdx500 = finNfCurrCdIdx500;
}

public int getFinNfCurrCdIdx500() { 
    return Search3Ctx.this.finNfCurrCdIdx500;
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




public void setIp66601UserRight(int ip66601UserRight) { 
    Search3Ctx.this.ip66601UserRight = ip66601UserRight;
}

public int getIp66601UserRight() { 
    return Search3Ctx.this.ip66601UserRight;
}

public void setIp66601UserStart(int ip66601UserStart) { 
    Search3Ctx.this.ip66601UserStart = ip66601UserStart;
}

public int getIp66601UserStart() { 
    return Search3Ctx.this.ip66601UserStart;
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




public void setIp66601UserLeft(int ip66601UserLeft) { 
    Search3Ctx.this.ip66601UserLeft = ip66601UserLeft;
}

public int getIp66601UserLeft() { 
    return Search3Ctx.this.ip66601UserLeft;
}

public void setIp66601UserMedian(int ip66601UserMedian) { 
    Search3Ctx.this.ip66601UserMedian = ip66601UserMedian;
}

public int getIp66601UserMedian() { 
    return Search3Ctx.this.ip66601UserMedian;
}
	/**
	 *	Returns the value of ip66601UserTag
	 *	@return ip66601UserTag
	 */   
	 public Ip66601UserTag getIp66601UserTag(int index) {
   	return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index);
   }

    public List<Ip66601UserTag> getIp66601UserTag() {
        return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag();
    }
   /**
	* 	Update Ip66601UserTag with the passed value
	*	@param value
	*/
   public void setIp66601UserTag(int index,char[] value) throws CFException {
      ip66601UserTagInformation.getIp66601UserTagTable().setIp66601UserTag((index),value);
   }   


	/**
	 *	Returns the value of accAmount801
	 *	@return accAmount801
	 */
	public short getAccAmount801() throws CFException {        
   		return work.getAccAmount801();
	}
	
	/**
	 * 	Update AccAmount801 with the passed value
	 *	@param number
	 */
	public void setAccAmount801(short number)  throws CFException{
		work.setAccAmount801(number);
	}

	public void setAccAmount801(int number)  throws CFException{
		work.setAccAmount801((short)number);
	}

	public void setAccAmount801(long number)  throws CFException{
		work.setAccAmount801((short)number);
	}




public void setIp66601UserEnd(int ip66601UserEnd) { 
    Search3Ctx.this.ip66601UserEnd = ip66601UserEnd;
}

public int getIp66601UserEnd() { 
    return Search3Ctx.this.ip66601UserEnd;
}
	/**
	 *	Returns the value of accFinNonFinAmt400
	 *	@return accFinNonFinAmt400
	 */
	public short getAccFinNonFinAmt400() throws CFException {        
   		return work.getAccFinNonFinAmt400();
	}
	
	/**
	 * 	Update AccFinNonFinAmt400 with the passed value
	 *	@param number
	 */
	public void setAccFinNonFinAmt400(short number)  throws CFException{
		work.setAccFinNonFinAmt400(number);
	}

	public void setAccFinNonFinAmt400(int number)  throws CFException{
		work.setAccFinNonFinAmt400((short)number);
	}

	public void setAccFinNonFinAmt400(long number)  throws CFException{
		work.setAccFinNonFinAmt400((short)number);
	}



	/**
	 *	Returns the value of valueDr300
	 *	@return valueDr300
	 */
   public char[] getValueDr300() throws CFException  {              
   		return work.getValueDr300();
   }

  
	/**
	*  set variable valueDr300
	*  @param value
	**/
   public void setValueDr300(char[] value) throws CFException {
      work.setValueDr300(value);
   } 

	/**
	 *	Returns the value of ip66601UserTagTable
	 *	@return ip66601UserTagTable
	 */   
	 public Ip66601UserTagTable getIp66601UserTagTable() {
   	return ip66601UserTagInformation.getIp66601UserTagTable();
   }

   /**
	* 	Update Ip66601UserTagTable with the passed value
	*	@param value
	*/
   public void setIp66601UserTagTable(char[] value) throws CFException {
      ip66601UserTagInformation.setIp66601UserTagTable(value);
   }   

     /**
	 * 	Update Ip66601UserTagTable 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp66601UserTagTable(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip66601UserTagInformation.setIp66601UserTagTable(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66601UserTagTable 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66601UserTagTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip66601UserTagInformation.setIp66601UserTagTable(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66601UserTagTable with another Field
	 *	@param value
	 */
   public void setIp66601UserTagTable(Field source) {
   	ip66601UserTagInformation.setIp66601UserTagTable(source);
   }  
   
     /**
	 * 	Update Ip66601UserTagTable 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp66601UserTagTable(Field source, int sourceIndex,int sourceLen) {
   	ip66601UserTagInformation.setIp66601UserTagTable(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66601UserTagTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66601UserTagTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip66601UserTagInformation.setIp66601UserTagTable(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of valueCr300
	 *	@return valueCr300
	 */
   public char[] getValueCr300() throws CFException  {              
   		return work.getValueCr300();
   }

  
	/**
	*  set variable valueCr300
	*  @param value
	**/
   public void setValueCr300(char[] value) throws CFException {
      work.setValueCr300(value);
   } 


        public Search3Ctx getSearch3Ctx() {
            return Search3Ctx.this;
        }

        public Search0400OutCtx getSearch0400OutCtx() {
            return new Search0400OutCtx();
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
        str += ip66601UserTagInformation.hashCode();
        str += accGrp500.hashCode();
       return str.hashCode();
    }

    public Search0400InCtx clone() {
        Search0400InCtx cloneObj = new Search0400InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        cloneObj.accGrp500 = new AccGrp500();
        cloneObj.accGrp500.set(accGrp500.getClonedField());
        return cloneObj;
    }

    }

    public Search0400InCtx getSearch0400InCtx() {
            return new Search0400InCtx();
    }
     public class Search0400OutCtx implements Cloneable {
     Work work = Search3Ctx.this.getWork();
     Ip66601UserTagInformation ip66601UserTagInformation = Search3Ctx.this.getIp66601UserTagInformation();
     AccGrp500 accGrp500 = Search3Ctx.this.getAccGrp500();

	/**
	 *	Returns the value of lastDeTag800
	 *	@return lastDeTag800
	 */
	public int getLastDeTag800() throws CFException {        
   		return work.getLastDeTag800();
	}
	
	/**
	 * 	Update LastDeTag800 with the passed value
	 *	@param number
	 */
	public void setLastDeTag800(int number)  throws CFException{
		work.setLastDeTag800(number);
	}


	public void setLastDeTag800(long number)  throws CFException{
		work.setLastDeTag800((int)number);
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
	 *	Returns the value of accFinNonFinInd400
	 *	@return accFinNonFinInd400
	 */
   public char[] getAccFinNonFinInd400() throws CFException  {              
   		return work.getAccFinNonFinInd400();
   }

  
	/**
	*  set variable accFinNonFinInd400
	*  @param value
	**/
   public void setAccFinNonFinInd400(char[] value) throws CFException {
      work.setAccFinNonFinInd400(value);
   } 


public void setIp66601UserMedian(int ip66601UserMedian) { 
    Search3Ctx.this.ip66601UserMedian = ip66601UserMedian;
}

public int getIp66601UserMedian() { 
    return Search3Ctx.this.ip66601UserMedian;
}
	/**
	 *	Returns the value of accFinNfAmt500
	 *	@return accFinNfAmt500
	 */
	public int getAccFinNfAmt500(int index) throws CFException {        
   		return accGrp500.getAccFinTbl500(index).getAccFinNfAmt500();
	}
	
	/**
	 * 	Update AccFinNfAmt500 with the passed value
	 *	@param number
	 */
	public void setAccFinNfAmt500(int index,int number)  throws CFException{
		accGrp500.getAccFinTbl500(index).setAccFinNfAmt500(number);
	}


	public void setAccFinNfAmt500(int index,long number)  throws CFException{
		accGrp500.getAccFinTbl500(index).setAccFinNfAmt500((int)number);
	}


	/**
	 *	Returns the value of accAmount801
	 *	@return accAmount801
	 */
	public short getAccAmount801() throws CFException {        
   		return work.getAccAmount801();
	}
	
	/**
	 * 	Update AccAmount801 with the passed value
	 *	@param number
	 */
	public void setAccAmount801(short number)  throws CFException{
		work.setAccAmount801(number);
	}

	public void setAccAmount801(int number)  throws CFException{
		work.setAccAmount801((short)number);
	}

	public void setAccAmount801(long number)  throws CFException{
		work.setAccAmount801((short)number);
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




public void setFinNfCurrCdIdx500(int finNfCurrCdIdx500) { 
    Search3Ctx.this.finNfCurrCdIdx500 = finNfCurrCdIdx500;
}

public int getFinNfCurrCdIdx500() { 
    return Search3Ctx.this.finNfCurrCdIdx500;
}
	/**
	 *	Returns the value of accFinNfInd500
	 *	@return accFinNfInd500
	 */
   public char[] getAccFinNfInd500(int index) throws CFException  {              
   		return accGrp500.getAccFinTbl500(index).getAccFinNfInd500();
   }

  
	/**
	*  set variable accFinNfInd500
	*  @param value
	**/
   public void setAccFinNfInd500(int index,char[] value) throws CFException {
      accGrp500.getAccFinTbl500(index).setAccFinNfInd500(value);
   } 

     /**
	 * 	Update AccFinNfInd500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAccFinNfInd500(int index,char[] source, int sourceIndex) throws CFException {
      accGrp500.getAccFinTbl500(index).setAccFinNfInd500(source, sourceIndex);
   	
   }
   
   public void setAccFinNfInd500(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      accGrp500.getAccFinTbl500(index).setAccFinNfInd500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AccFinNfInd500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAccFinNfInd500(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      accGrp500.getAccFinTbl500(index).setAccFinNfInd500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AccFinNfInd500 with another Field
	 *	@param value
	 */
   public void setAccFinNfInd500(int index,Field source) {
      accGrp500.getAccFinTbl500(index).setAccFinNfInd500(source);
   }  
   
     /**
	 * 	Update AccFinNfInd500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAccFinNfInd500(int index,Field source, int sourceIndex,int sourceLen) {
      accGrp500.getAccFinTbl500(index).setAccFinNfInd500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AccFinNfInd500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAccFinNfInd500(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      accGrp500.getAccFinTbl500(index).setAccFinNfInd500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of accFinNonFinAmt400
	 *	@return accFinNonFinAmt400
	 */
	public short getAccFinNonFinAmt400() throws CFException {        
   		return work.getAccFinNonFinAmt400();
	}
	
	/**
	 * 	Update AccFinNonFinAmt400 with the passed value
	 *	@param number
	 */
	public void setAccFinNonFinAmt400(short number)  throws CFException{
		work.setAccFinNonFinAmt400(number);
	}

	public void setAccFinNonFinAmt400(int number)  throws CFException{
		work.setAccFinNonFinAmt400((short)number);
	}

	public void setAccFinNonFinAmt400(long number)  throws CFException{
		work.setAccFinNonFinAmt400((short)number);
	}



	/**
	 *	Returns the value of valueCr300
	 *	@return valueCr300
	 */
   public char[] getValueCr300() throws CFException  {              
   		return work.getValueCr300();
   }

  
	/**
	*  set variable valueCr300
	*  @param value
	**/
   public void setValueCr300(char[] value) throws CFException {
      work.setValueCr300(value);
   } 


        public Search3Ctx getSearch3Ctx() {
            return Search3Ctx.this;
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
        str += ip66601UserTagInformation.hashCode();
        str += accGrp500.hashCode();
       return str.hashCode();
    }

    public Search0400OutCtx clone() {
        Search0400OutCtx cloneObj = new Search0400OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        cloneObj.accGrp500 = new AccGrp500();
        cloneObj.accGrp500.set(accGrp500.getClonedField());
        return cloneObj;
    }

    }

    public Search0400OutCtx getSearch0400OutCtx() {
            return new Search0400OutCtx();
    }
     public class Search0500InCtx implements Cloneable {
     Work work = Search3Ctx.this.getWork();
     Ip66601UserTagInformation ip66601UserTagInformation = Search3Ctx.this.getIp66601UserTagInformation();
     TableGroup tableGroup = Search3Ctx.this.getTableGroup();
     SrchVar srchVar = Search3Ctx.this.getSrchVar();

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
	 *	Returns the value of srchVar
	 *	@return srchVar
	 */   
	 public SrchVar getSrchVar() {
   	return srchVar;
   }


	/**
	 *	Returns the value of ip66601UserTagOccurrence01
	 *	@return ip66601UserTagOccurrence01
	 */
	public short getIp66601UserTagOccurrence01() throws CFException {
   		return work.getIp66601UserTagOccurrence01();
	}

    /**
	 *	Returns the String value of ip66601UserTagOccurrence01
	 *	@return ip66601UserTagOccurrence01
	 */
	public char[]  getIp66601UserTagOccurrence01ActualString() {
		return work.getIp66601UserTagOccurrence01ActualString();
	}

	/**
	 *	Returns String value of ip66601UserTagOccurrence01
	 *	@return ip66601UserTagOccurrence01
	 */
	public char[]  getIp66601UserTagOccurrence01String() throws CFException {
	     return String.valueOf(work.getIp66601UserTagOccurrence01String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip66601UserTagOccurrence01IsNumeric()  throws CFException{
	    return work.ip66601UserTagOccurrence01IsNumeric();
	}

	/**
	 * 	Update Ip66601UserTagOccurrence01 with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagOccurrence01(short number)  throws CFException{
		work.setIp66601UserTagOccurrence01(number);
	}
	
	public void setIp66601UserTagOccurrence01(int number)  throws CFException{
	    work.setIp66601UserTagOccurrence01(number);
	}
	public void setIp66601UserTagOccurrence01(long number)  throws CFException{
	    work.setIp66601UserTagOccurrence01(number);
	}
	

	
	/**
	 * 	Update Ip66601UserTagOccurrence01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp66601UserTagOccurrence01(char[] value)  throws CFException {
		work.setIp66601UserTagOccurrence01(value);
	}
	
	/**
	 * 	Update Ip66601UserTagOccurrence01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp66601UserTagOccurrence01String(char[] value)  throws CFException{
		work.setIp66601UserTagOccurrence01(value);
	}	

	/**
	 *	Returns the value of var2
	 *	@return var2
	 */
	public int getVar2(int index) throws CFException {
   		return tableGroup.getTable().getTableEntry(index).getVar2();
	}


	/**
	 *	Returns String value of var2
	 *	@return var2
	 */
	public char[]  getVar2String(int index) throws CFException {
	     return String.valueOf(tableGroup.getTable().getTableEntry(index).getVar2String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean var2IsNumeric(int index)  throws CFException{
	    return tableGroup.getTable().getTableEntry(index - 1).var2IsNumeric();
	}

	/**
	 * 	Update Var2 with the passed value
	 *	@param number
	 */
	public void setVar2(int index,int number)  throws CFException{
		tableGroup.getTable().getTableEntry(index).setVar2(number);
	}
	

	public void setVar2(int index,long number)  throws CFException{
	    tableGroup.getTable().getTableEntry(index).setVar2(number);
	}
	
	
	/**
	 * 	Update Var2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setVar2(int index,char[] value)  throws CFException {
		tableGroup.getTable().getTableEntry(index).setVar2(value);
	}
	
	/**
	 * 	Update Var2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVar2String(int index,char[] value)  throws CFException{
		tableGroup.getTable().getTableEntry(index).setVar2(value);
	}	

	/**
	 *	Returns the value of ip66601UserTagSubfldNo01
	 *	@return ip66601UserTagSubfldNo01
	 */
	public short getIp66601UserTagSubfldNo01() throws CFException {
   		return work.getIp66601UserTagSubfldNo01();
	}

    /**
	 *	Returns the String value of ip66601UserTagSubfldNo01
	 *	@return ip66601UserTagSubfldNo01
	 */
	public char[]  getIp66601UserTagSubfldNo01ActualString() {
		return work.getIp66601UserTagSubfldNo01ActualString();
	}

	/**
	 *	Returns String value of ip66601UserTagSubfldNo01
	 *	@return ip66601UserTagSubfldNo01
	 */
	public char[]  getIp66601UserTagSubfldNo01String() throws CFException {
	     return String.valueOf(work.getIp66601UserTagSubfldNo01String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip66601UserTagSubfldNo01IsNumeric()  throws CFException{
	    return work.ip66601UserTagSubfldNo01IsNumeric();
	}

	/**
	 * 	Update Ip66601UserTagSubfldNo01 with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagSubfldNo01(short number)  throws CFException{
		work.setIp66601UserTagSubfldNo01(number);
	}
	
	public void setIp66601UserTagSubfldNo01(int number)  throws CFException{
	    work.setIp66601UserTagSubfldNo01(number);
	}
	public void setIp66601UserTagSubfldNo01(long number)  throws CFException{
	    work.setIp66601UserTagSubfldNo01(number);
	}
	

	
	/**
	 * 	Update Ip66601UserTagSubfldNo01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp66601UserTagSubfldNo01(char[] value)  throws CFException {
		work.setIp66601UserTagSubfldNo01(value);
	}
	
	/**
	 * 	Update Ip66601UserTagSubfldNo01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp66601UserTagSubfldNo01String(char[] value)  throws CFException{
		work.setIp66601UserTagSubfldNo01(value);
	}	

	/**
	 *	Returns the value of start
	 *	@return start
	 */
	public short getStart() throws CFException {        
   		return work.getStart();
	}
	
	/**
	 * 	Update Start with the passed value
	 *	@param number
	 */
	public void setStart(short number)  throws CFException{
		work.setStart(number);
	}

	public void setStart(int number)  throws CFException{
		work.setStart((short)number);
	}

	public void setStart(long number)  throws CFException{
		work.setStart((short)number);
	}



	/**
	 *	Returns the value of table
	 *	@return table
	 */   
	 public Table getTable() {
   	return tableGroup.getTable();
   }

   /**
	* 	Update Table with the passed value
	*	@param value
	*/
   public void setTable(char[] value) throws CFException {
      tableGroup.setTable(value);
   }   

     /**
	 * 	Update Table 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTable(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	tableGroup.setTable(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Table 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	tableGroup.setTable(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Table with another Field
	 *	@param value
	 */
   public void setTable(Field source) {
   	tableGroup.setTable(source);
   }  
   
     /**
	 * 	Update Table 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTable(Field source, int sourceIndex,int sourceLen) {
   	tableGroup.setTable(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Table 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	tableGroup.setTable(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setIp66601UserEnd(int ip66601UserEnd) { 
    Search3Ctx.this.ip66601UserEnd = ip66601UserEnd;
}

public int getIp66601UserEnd() { 
    return Search3Ctx.this.ip66601UserEnd;
}

public void setIp66601UserP(int ip66601UserP) { 
    Search3Ctx.this.ip66601UserP = ip66601UserP;
}

public int getIp66601UserP() { 
    return Search3Ctx.this.ip66601UserP;
}
	/**
	 *	Returns the value of ip66601UserTagNo01
	 *	@return ip66601UserTagNo01
	 */
	public short getIp66601UserTagNo01() throws CFException {
   		return work.getIp66601UserTagNo01();
	}

    /**
	 *	Returns the String value of ip66601UserTagNo01
	 *	@return ip66601UserTagNo01
	 */
	public char[]  getIp66601UserTagNo01ActualString() {
		return work.getIp66601UserTagNo01ActualString();
	}

	/**
	 *	Returns String value of ip66601UserTagNo01
	 *	@return ip66601UserTagNo01
	 */
	public char[]  getIp66601UserTagNo01String() throws CFException {
	     return String.valueOf(work.getIp66601UserTagNo01String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip66601UserTagNo01IsNumeric()  throws CFException{
	    return work.ip66601UserTagNo01IsNumeric();
	}

	/**
	 * 	Update Ip66601UserTagNo01 with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagNo01(short number)  throws CFException{
		work.setIp66601UserTagNo01(number);
	}
	
	public void setIp66601UserTagNo01(int number)  throws CFException{
	    work.setIp66601UserTagNo01(number);
	}
	public void setIp66601UserTagNo01(long number)  throws CFException{
	    work.setIp66601UserTagNo01(number);
	}
	

	
	/**
	 * 	Update Ip66601UserTagNo01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp66601UserTagNo01(char[] value)  throws CFException {
		work.setIp66601UserTagNo01(value);
	}
	
	/**
	 * 	Update Ip66601UserTagNo01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp66601UserTagNo01String(char[] value)  throws CFException{
		work.setIp66601UserTagNo01(value);
	}	

	/**
	 *	Returns the value of tableGroup
	 *	@return tableGroup
	 */   
	 public TableGroup getTableGroup() {
   	return tableGroup;
   }


	/**
	 *	Returns the value of ip66601UserTagTable
	 *	@return ip66601UserTagTable
	 */   
	 public Ip66601UserTagTable getIp66601UserTagTable() {
   	return ip66601UserTagInformation.getIp66601UserTagTable();
   }

   /**
	* 	Update Ip66601UserTagTable with the passed value
	*	@param value
	*/
   public void setIp66601UserTagTable(char[] value) throws CFException {
      ip66601UserTagInformation.setIp66601UserTagTable(value);
   }   

     /**
	 * 	Update Ip66601UserTagTable 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp66601UserTagTable(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip66601UserTagInformation.setIp66601UserTagTable(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66601UserTagTable 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66601UserTagTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip66601UserTagInformation.setIp66601UserTagTable(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66601UserTagTable with another Field
	 *	@param value
	 */
   public void setIp66601UserTagTable(Field source) {
   	ip66601UserTagInformation.setIp66601UserTagTable(source);
   }  
   
     /**
	 * 	Update Ip66601UserTagTable 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp66601UserTagTable(Field source, int sourceIndex,int sourceLen) {
   	ip66601UserTagInformation.setIp66601UserTagTable(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66601UserTagTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66601UserTagTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip66601UserTagInformation.setIp66601UserTagTable(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of srchVar2
	 *	@return srchVar2
	 */
	public int getSrchVar2() throws CFException {
   		return srchVar.getSrchVar2();
	}


	/**
	 *	Returns String value of srchVar2
	 *	@return srchVar2
	 */
	public char[]  getSrchVar2String() throws CFException {
	     return String.valueOf(srchVar.getSrchVar2String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean srchVar2IsNumeric()  throws CFException{
	    return srchVar.srchVar2IsNumeric();
	}

	/**
	 * 	Update SrchVar2 with the passed value
	 *	@param number
	 */
	public void setSrchVar2(int number)  throws CFException{
		srchVar.setSrchVar2(number);
	}
	

	public void setSrchVar2(long number)  throws CFException{
	    srchVar.setSrchVar2(number);
	}
	
	
	/**
	 * 	Update SrchVar2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrchVar2(char[] value)  throws CFException {
		srchVar.setSrchVar2(value);
	}
	
	/**
	 * 	Update SrchVar2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrchVar2String(char[] value)  throws CFException{
		srchVar.setSrchVar2(value);
	}	

	/**
	 *	Returns the value of len
	 *	@return len
	 */
	public short getLen() throws CFException {        
   		return work.getLen();
	}
	
	/**
	 * 	Update Len with the passed value
	 *	@param number
	 */
	public void setLen(short number)  throws CFException{
		work.setLen(number);
	}

	public void setLen(int number)  throws CFException{
		work.setLen((short)number);
	}

	public void setLen(long number)  throws CFException{
		work.setLen((short)number);
	}



	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public short getI() throws CFException {        
   		return work.getI();
	}
	
	/**
	 * 	Update I with the passed value
	 *	@param number
	 */
	public void setI(short number)  throws CFException{
		work.setI(number);
	}

	public void setI(int number)  throws CFException{
		work.setI((short)number);
	}

	public void setI(long number)  throws CFException{
		work.setI((short)number);
	}



	/**
	 *	Returns the value of ip66601UserTagLngth01
	 *	@return ip66601UserTagLngth01
	 */
	public short getIp66601UserTagLngth01() throws CFException {        
   		return work.getIp66601UserTagLngth01();
	}
	
	/**
	 * 	Update Ip66601UserTagLngth01 with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagLngth01(short number)  throws CFException{
		work.setIp66601UserTagLngth01(number);
	}

	public void setIp66601UserTagLngth01(int number)  throws CFException{
		work.setIp66601UserTagLngth01((short)number);
	}

	public void setIp66601UserTagLngth01(long number)  throws CFException{
		work.setIp66601UserTagLngth01((short)number);
	}




public void setIp66601UserT(int ip66601UserT) { 
    Search3Ctx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return Search3Ctx.this.ip66601UserT;
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




public void setIp66601UserRight(int ip66601UserRight) { 
    Search3Ctx.this.ip66601UserRight = ip66601UserRight;
}

public int getIp66601UserRight() { 
    return Search3Ctx.this.ip66601UserRight;
}

public void setIp66601UserStart(int ip66601UserStart) { 
    Search3Ctx.this.ip66601UserStart = ip66601UserStart;
}

public int getIp66601UserStart() { 
    return Search3Ctx.this.ip66601UserStart;
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
	 *	Returns the value of ip66601UserTagStart01
	 *	@return ip66601UserTagStart01
	 */
	public short getIp66601UserTagStart01() throws CFException {        
   		return work.getIp66601UserTagStart01();
	}
	
	/**
	 * 	Update Ip66601UserTagStart01 with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagStart01(short number)  throws CFException{
		work.setIp66601UserTagStart01(number);
	}

	public void setIp66601UserTagStart01(int number)  throws CFException{
		work.setIp66601UserTagStart01((short)number);
	}

	public void setIp66601UserTagStart01(long number)  throws CFException{
		work.setIp66601UserTagStart01((short)number);
	}




public void setIp66601UserLeft(int ip66601UserLeft) { 
    Search3Ctx.this.ip66601UserLeft = ip66601UserLeft;
}

public int getIp66601UserLeft() { 
    return Search3Ctx.this.ip66601UserLeft;
}
	/**
	 *	Returns the value of ip66601UserTagType01
	 *	@return ip66601UserTagType01
	 */
	public short getIp66601UserTagType01() throws CFException {
   		return work.getIp66601UserTagType01();
	}

    /**
	 *	Returns the String value of ip66601UserTagType01
	 *	@return ip66601UserTagType01
	 */
	public char[]  getIp66601UserTagType01ActualString() {
		return work.getIp66601UserTagType01ActualString();
	}

	/**
	 *	Returns String value of ip66601UserTagType01
	 *	@return ip66601UserTagType01
	 */
	public char[]  getIp66601UserTagType01String() throws CFException {
	     return String.valueOf(work.getIp66601UserTagType01String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip66601UserTagType01IsNumeric()  throws CFException{
	    return work.ip66601UserTagType01IsNumeric();
	}

	/**
	 * 	Update Ip66601UserTagType01 with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagType01(short number)  throws CFException{
		work.setIp66601UserTagType01(number);
	}
	
	public void setIp66601UserTagType01(int number)  throws CFException{
	    work.setIp66601UserTagType01(number);
	}
	public void setIp66601UserTagType01(long number)  throws CFException{
	    work.setIp66601UserTagType01(number);
	}
	

	
	/**
	 * 	Update Ip66601UserTagType01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp66601UserTagType01(char[] value)  throws CFException {
		work.setIp66601UserTagType01(value);
	}
	
	/**
	 * 	Update Ip66601UserTagType01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp66601UserTagType01String(char[] value)  throws CFException{
		work.setIp66601UserTagType01(value);
	}	

	/**
	 *	Returns the value of ip66601UserTag
	 *	@return ip66601UserTag
	 */   
	 public Ip66601UserTag getIp66601UserTag(int index) {
   	return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index);
   }

    public List<Ip66601UserTag> getIp66601UserTag() {
        return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag();
    }
   /**
	* 	Update Ip66601UserTag with the passed value
	*	@param value
	*/
   public void setIp66601UserTag(int index,char[] value) throws CFException {
      ip66601UserTagInformation.getIp66601UserTagTable().setIp66601UserTag((index),value);
   }   



public void setIp66601UserMedian(int ip66601UserMedian) { 
    Search3Ctx.this.ip66601UserMedian = ip66601UserMedian;
}

public int getIp66601UserMedian() { 
    return Search3Ctx.this.ip66601UserMedian;
}

        public Search3Ctx getSearch3Ctx() {
            return Search3Ctx.this;
        }

        public Search0500OutCtx getSearch0500OutCtx() {
            return new Search0500OutCtx();
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
        str += ip66601UserTagInformation.hashCode();
        str += tableGroup.hashCode();
        str += srchVar.hashCode();
       return str.hashCode();
    }

    public Search0500InCtx clone() {
        Search0500InCtx cloneObj = new Search0500InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        cloneObj.tableGroup = new TableGroup();
        cloneObj.tableGroup.set(tableGroup.getClonedField());
        cloneObj.srchVar = new SrchVar();
        cloneObj.srchVar.set(srchVar.getClonedField());
        return cloneObj;
    }

    }

    public Search0500InCtx getSearch0500InCtx() {
            return new Search0500InCtx();
    }
     public class Search0500OutCtx implements Cloneable {
     Work work = Search3Ctx.this.getWork();
     Ip66601UserTagInformation ip66601UserTagInformation = Search3Ctx.this.getIp66601UserTagInformation();
     TableGroup tableGroup = Search3Ctx.this.getTableGroup();
     SrchVar srchVar = Search3Ctx.this.getSrchVar();

	/**
	 *	Test condition "N" for isEntryNotFoundN()
	 *	@return  Returns true if isEntryNotFoundN() is "N"
	 */
   public boolean isEntryNotFoundN() throws CFException {
      return work.isEntryNotFoundN();
   }

	/**
	*  set values "N"
	*/
   	public void setEntryNotFoundNTrue()  throws CFException{  			
    	work.setEntryNotFoundNTrue();
   	}
	/**
	 *	Returns the value of len
	 *	@return len
	 */
	public short getLen() throws CFException {        
   		return work.getLen();
	}
	
	/**
	 * 	Update Len with the passed value
	 *	@param number
	 */
	public void setLen(short number)  throws CFException{
		work.setLen(number);
	}

	public void setLen(int number)  throws CFException{
		work.setLen((short)number);
	}

	public void setLen(long number)  throws CFException{
		work.setLen((short)number);
	}



	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public short getI() throws CFException {        
   		return work.getI();
	}
	
	/**
	 * 	Update I with the passed value
	 *	@param number
	 */
	public void setI(short number)  throws CFException{
		work.setI(number);
	}

	public void setI(int number)  throws CFException{
		work.setI((short)number);
	}

	public void setI(long number)  throws CFException{
		work.setI((short)number);
	}



	/**
	 *	Returns the value of ip66601UserTagLngth01
	 *	@return ip66601UserTagLngth01
	 */
	public short getIp66601UserTagLngth01() throws CFException {        
   		return work.getIp66601UserTagLngth01();
	}
	
	/**
	 * 	Update Ip66601UserTagLngth01 with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagLngth01(short number)  throws CFException{
		work.setIp66601UserTagLngth01(number);
	}

	public void setIp66601UserTagLngth01(int number)  throws CFException{
		work.setIp66601UserTagLngth01((short)number);
	}

	public void setIp66601UserTagLngth01(long number)  throws CFException{
		work.setIp66601UserTagLngth01((short)number);
	}




public void setIp66601UserT(int ip66601UserT) { 
    Search3Ctx.this.ip66601UserT = ip66601UserT;
}

public int getIp66601UserT() { 
    return Search3Ctx.this.ip66601UserT;
}
	/**
	 *	Test condition "Y" for isEntryFoundY()
	 *	@return  Returns true if isEntryFoundY() is "Y"
	 */
   public boolean isEntryFoundY() throws CFException {
      return work.isEntryFoundY();
   }

	/**
	*  set values "Y"
	*/
   	public void setEntryFoundYTrue()  throws CFException{  			
    	work.setEntryFoundYTrue();
   	}
	/**
	 *	Returns the value of var1
	 *	@return var1
	 */
   public char[] getVar1(int index) throws CFException  {              
   		return tableGroup.getTable().getTableEntry(index).getVar1();
   }

  
	/**
	*  set variable var1
	*  @param value
	**/
   public void setVar1(int index,char[] value) throws CFException {
      tableGroup.getTable().getTableEntry(index).setVar1(value);
   } 

     /**
	 * 	Update Var1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVar1(int index,char[] source, int sourceIndex) throws CFException {
      tableGroup.getTable().getTableEntry(index).setVar1(source, sourceIndex);
   	
   }
   
   public void setVar1(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      tableGroup.getTable().getTableEntry(index).setVar1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Var1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVar1(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableGroup.getTable().getTableEntry(index).setVar1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Var1 with another Field
	 *	@param value
	 */
   public void setVar1(int index,Field source) {
      tableGroup.getTable().getTableEntry(index).setVar1(source);
   }  
   
     /**
	 * 	Update Var1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVar1(int index,Field source, int sourceIndex,int sourceLen) {
      tableGroup.getTable().getTableEntry(index).setVar1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Var1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVar1(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      tableGroup.getTable().getTableEntry(index).setVar1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of srchVar
	 *	@return srchVar
	 */   
	 public SrchVar getSrchVar() {
   	return srchVar;
   }


	/**
	 *	Returns the value of ip66601UserTagOccurrence01
	 *	@return ip66601UserTagOccurrence01
	 */
	public short getIp66601UserTagOccurrence01() throws CFException {
   		return work.getIp66601UserTagOccurrence01();
	}

    /**
	 *	Returns the String value of ip66601UserTagOccurrence01
	 *	@return ip66601UserTagOccurrence01
	 */
	public char[]  getIp66601UserTagOccurrence01ActualString() {
		return work.getIp66601UserTagOccurrence01ActualString();
	}

	/**
	 *	Returns String value of ip66601UserTagOccurrence01
	 *	@return ip66601UserTagOccurrence01
	 */
	public char[]  getIp66601UserTagOccurrence01String() throws CFException {
	     return String.valueOf(work.getIp66601UserTagOccurrence01String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip66601UserTagOccurrence01IsNumeric()  throws CFException{
	    return work.ip66601UserTagOccurrence01IsNumeric();
	}

	/**
	 * 	Update Ip66601UserTagOccurrence01 with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagOccurrence01(short number)  throws CFException{
		work.setIp66601UserTagOccurrence01(number);
	}
	
	public void setIp66601UserTagOccurrence01(int number)  throws CFException{
	    work.setIp66601UserTagOccurrence01(number);
	}
	public void setIp66601UserTagOccurrence01(long number)  throws CFException{
	    work.setIp66601UserTagOccurrence01(number);
	}
	

	
	/**
	 * 	Update Ip66601UserTagOccurrence01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp66601UserTagOccurrence01(char[] value)  throws CFException {
		work.setIp66601UserTagOccurrence01(value);
	}
	
	/**
	 * 	Update Ip66601UserTagOccurrence01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp66601UserTagOccurrence01String(char[] value)  throws CFException{
		work.setIp66601UserTagOccurrence01(value);
	}	

	/**
	 *	Returns the value of ip66601UserTagStart01
	 *	@return ip66601UserTagStart01
	 */
	public short getIp66601UserTagStart01() throws CFException {        
   		return work.getIp66601UserTagStart01();
	}
	
	/**
	 * 	Update Ip66601UserTagStart01 with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagStart01(short number)  throws CFException{
		work.setIp66601UserTagStart01(number);
	}

	public void setIp66601UserTagStart01(int number)  throws CFException{
		work.setIp66601UserTagStart01((short)number);
	}

	public void setIp66601UserTagStart01(long number)  throws CFException{
		work.setIp66601UserTagStart01((short)number);
	}



	/**
	 *	Returns the value of var2
	 *	@return var2
	 */
	public int getVar2(int index) throws CFException {
   		return tableGroup.getTable().getTableEntry(index).getVar2();
	}


	/**
	 *	Returns String value of var2
	 *	@return var2
	 */
	public char[]  getVar2String(int index) throws CFException {
	     return String.valueOf(tableGroup.getTable().getTableEntry(index).getVar2String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean var2IsNumeric(int index)  throws CFException{
	    return tableGroup.getTable().getTableEntry(index - 1).var2IsNumeric();
	}

	/**
	 * 	Update Var2 with the passed value
	 *	@param number
	 */
	public void setVar2(int index,int number)  throws CFException{
		tableGroup.getTable().getTableEntry(index).setVar2(number);
	}
	

	public void setVar2(int index,long number)  throws CFException{
	    tableGroup.getTable().getTableEntry(index).setVar2(number);
	}
	
	
	/**
	 * 	Update Var2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setVar2(int index,char[] value)  throws CFException {
		tableGroup.getTable().getTableEntry(index).setVar2(value);
	}
	
	/**
	 * 	Update Var2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVar2String(int index,char[] value)  throws CFException{
		tableGroup.getTable().getTableEntry(index).setVar2(value);
	}	

	/**
	 *	Returns the value of ip66601UserTagSubfldNo01
	 *	@return ip66601UserTagSubfldNo01
	 */
	public short getIp66601UserTagSubfldNo01() throws CFException {
   		return work.getIp66601UserTagSubfldNo01();
	}

    /**
	 *	Returns the String value of ip66601UserTagSubfldNo01
	 *	@return ip66601UserTagSubfldNo01
	 */
	public char[]  getIp66601UserTagSubfldNo01ActualString() {
		return work.getIp66601UserTagSubfldNo01ActualString();
	}

	/**
	 *	Returns String value of ip66601UserTagSubfldNo01
	 *	@return ip66601UserTagSubfldNo01
	 */
	public char[]  getIp66601UserTagSubfldNo01String() throws CFException {
	     return String.valueOf(work.getIp66601UserTagSubfldNo01String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip66601UserTagSubfldNo01IsNumeric()  throws CFException{
	    return work.ip66601UserTagSubfldNo01IsNumeric();
	}

	/**
	 * 	Update Ip66601UserTagSubfldNo01 with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagSubfldNo01(short number)  throws CFException{
		work.setIp66601UserTagSubfldNo01(number);
	}
	
	public void setIp66601UserTagSubfldNo01(int number)  throws CFException{
	    work.setIp66601UserTagSubfldNo01(number);
	}
	public void setIp66601UserTagSubfldNo01(long number)  throws CFException{
	    work.setIp66601UserTagSubfldNo01(number);
	}
	

	
	/**
	 * 	Update Ip66601UserTagSubfldNo01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp66601UserTagSubfldNo01(char[] value)  throws CFException {
		work.setIp66601UserTagSubfldNo01(value);
	}
	
	/**
	 * 	Update Ip66601UserTagSubfldNo01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp66601UserTagSubfldNo01String(char[] value)  throws CFException{
		work.setIp66601UserTagSubfldNo01(value);
	}	

	/**
	 *	Returns the value of tableEntry
	 *	@return tableEntry
	 */   
	 public TableEntry getTableEntry(int index) {
   	return tableGroup.getTable().getTableEntry(index);
   }

    public List<TableEntry> getTableEntry() {
        return tableGroup.getTable().getTableEntry();
    }
   /**
	* 	Update TableEntry with the passed value
	*	@param value
	*/
   public void setTableEntry(int index,char[] value) throws CFException {
      tableGroup.getTable().setTableEntry((index),value);
   }   


	/**
	 *	Returns the value of ip66601UserTagStatus01
	 *	@return ip66601UserTagStatus01
	 */
   public char[] getIp66601UserTagStatus01() throws CFException  {              
   		return work.getIp66601UserTagStatus01();
   }

  
	/**
	*  set variable ip66601UserTagStatus01
	*  @param value
	**/
   public void setIp66601UserTagStatus01(char[] value) throws CFException {
      work.setIp66601UserTagStatus01(value);
   } 

	/**
	 *	Returns the value of start
	 *	@return start
	 */
	public short getStart() throws CFException {        
   		return work.getStart();
	}
	
	/**
	 * 	Update Start with the passed value
	 *	@param number
	 */
	public void setStart(short number)  throws CFException{
		work.setStart(number);
	}

	public void setStart(int number)  throws CFException{
		work.setStart((short)number);
	}

	public void setStart(long number)  throws CFException{
		work.setStart((short)number);
	}



	/**
	 *	Returns the value of table
	 *	@return table
	 */   
	 public Table getTable() {
   	return tableGroup.getTable();
   }

   /**
	* 	Update Table with the passed value
	*	@param value
	*/
   public void setTable(char[] value) throws CFException {
      tableGroup.setTable(value);
   }   

     /**
	 * 	Update Table 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTable(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	tableGroup.setTable(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Table 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	tableGroup.setTable(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Table with another Field
	 *	@param value
	 */
   public void setTable(Field source) {
   	tableGroup.setTable(source);
   }  
   
     /**
	 * 	Update Table 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTable(Field source, int sourceIndex,int sourceLen) {
   	tableGroup.setTable(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Table 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	tableGroup.setTable(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of srchVar1
	 *	@return srchVar1
	 */
   public char[] getSrchVar1() throws CFException  {              
   		return srchVar.getSrchVar1();
   }

  
	/**
	*  set variable srchVar1
	*  @param value
	**/
   public void setSrchVar1(char[] value) throws CFException {
      srchVar.setSrchVar1(value);
   } 

     /**
	 * 	Update SrchVar1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrchVar1(char[] source, int sourceIndex) throws CFException {
      srchVar.setSrchVar1(source, sourceIndex);
   	
   }
   
   public void setSrchVar1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      srchVar.setSrchVar1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SrchVar1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrchVar1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      srchVar.setSrchVar1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SrchVar1 with another Field
	 *	@param value
	 */
   public void setSrchVar1(Field source) {
      srchVar.setSrchVar1(source);
   }  
   
     /**
	 * 	Update SrchVar1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrchVar1(Field source, int sourceIndex,int sourceLen) {
      srchVar.setSrchVar1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SrchVar1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrchVar1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      srchVar.setSrchVar1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip66601UserTagType01
	 *	@return ip66601UserTagType01
	 */
	public short getIp66601UserTagType01() throws CFException {
   		return work.getIp66601UserTagType01();
	}

    /**
	 *	Returns the String value of ip66601UserTagType01
	 *	@return ip66601UserTagType01
	 */
	public char[]  getIp66601UserTagType01ActualString() {
		return work.getIp66601UserTagType01ActualString();
	}

	/**
	 *	Returns String value of ip66601UserTagType01
	 *	@return ip66601UserTagType01
	 */
	public char[]  getIp66601UserTagType01String() throws CFException {
	     return String.valueOf(work.getIp66601UserTagType01String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip66601UserTagType01IsNumeric()  throws CFException{
	    return work.ip66601UserTagType01IsNumeric();
	}

	/**
	 * 	Update Ip66601UserTagType01 with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagType01(short number)  throws CFException{
		work.setIp66601UserTagType01(number);
	}
	
	public void setIp66601UserTagType01(int number)  throws CFException{
	    work.setIp66601UserTagType01(number);
	}
	public void setIp66601UserTagType01(long number)  throws CFException{
	    work.setIp66601UserTagType01(number);
	}
	

	
	/**
	 * 	Update Ip66601UserTagType01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp66601UserTagType01(char[] value)  throws CFException {
		work.setIp66601UserTagType01(value);
	}
	
	/**
	 * 	Update Ip66601UserTagType01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp66601UserTagType01String(char[] value)  throws CFException{
		work.setIp66601UserTagType01(value);
	}	


public void setTableIndex(int tableIndex) { 
    Search3Ctx.this.tableIndex = tableIndex;
}

public int getTableIndex() { 
    return Search3Ctx.this.tableIndex;
}
	/**
	 *	Returns the value of ip66601UserTagNo01
	 *	@return ip66601UserTagNo01
	 */
	public short getIp66601UserTagNo01() throws CFException {
   		return work.getIp66601UserTagNo01();
	}

    /**
	 *	Returns the String value of ip66601UserTagNo01
	 *	@return ip66601UserTagNo01
	 */
	public char[]  getIp66601UserTagNo01ActualString() {
		return work.getIp66601UserTagNo01ActualString();
	}

	/**
	 *	Returns String value of ip66601UserTagNo01
	 *	@return ip66601UserTagNo01
	 */
	public char[]  getIp66601UserTagNo01String() throws CFException {
	     return String.valueOf(work.getIp66601UserTagNo01String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip66601UserTagNo01IsNumeric()  throws CFException{
	    return work.ip66601UserTagNo01IsNumeric();
	}

	/**
	 * 	Update Ip66601UserTagNo01 with the passed value
	 *	@param number
	 */
	public void setIp66601UserTagNo01(short number)  throws CFException{
		work.setIp66601UserTagNo01(number);
	}
	
	public void setIp66601UserTagNo01(int number)  throws CFException{
	    work.setIp66601UserTagNo01(number);
	}
	public void setIp66601UserTagNo01(long number)  throws CFException{
	    work.setIp66601UserTagNo01(number);
	}
	

	
	/**
	 * 	Update Ip66601UserTagNo01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp66601UserTagNo01(char[] value)  throws CFException {
		work.setIp66601UserTagNo01(value);
	}
	
	/**
	 * 	Update Ip66601UserTagNo01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp66601UserTagNo01String(char[] value)  throws CFException{
		work.setIp66601UserTagNo01(value);
	}	

	/**
	 *	Returns the value of tableGroup
	 *	@return tableGroup
	 */   
	 public TableGroup getTableGroup() {
   	return tableGroup;
   }


	/**
	 *	Returns the value of srchVar2
	 *	@return srchVar2
	 */
	public int getSrchVar2() throws CFException {
   		return srchVar.getSrchVar2();
	}


	/**
	 *	Returns String value of srchVar2
	 *	@return srchVar2
	 */
	public char[]  getSrchVar2String() throws CFException {
	     return String.valueOf(srchVar.getSrchVar2String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean srchVar2IsNumeric()  throws CFException{
	    return srchVar.srchVar2IsNumeric();
	}

	/**
	 * 	Update SrchVar2 with the passed value
	 *	@param number
	 */
	public void setSrchVar2(int number)  throws CFException{
		srchVar.setSrchVar2(number);
	}
	

	public void setSrchVar2(long number)  throws CFException{
	    srchVar.setSrchVar2(number);
	}
	
	
	/**
	 * 	Update SrchVar2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrchVar2(char[] value)  throws CFException {
		srchVar.setSrchVar2(value);
	}
	
	/**
	 * 	Update SrchVar2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrchVar2String(char[] value)  throws CFException{
		srchVar.setSrchVar2(value);
	}	


        public Search3Ctx getSearch3Ctx() {
            return Search3Ctx.this;
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
        str += ip66601UserTagInformation.hashCode();
        str += tableGroup.hashCode();
        str += srchVar.hashCode();
       return str.hashCode();
    }

    public Search0500OutCtx clone() {
        Search0500OutCtx cloneObj = new Search0500OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        cloneObj.tableGroup = new TableGroup();
        cloneObj.tableGroup.set(tableGroup.getClonedField());
        cloneObj.srchVar = new SrchVar();
        cloneObj.srchVar.set(srchVar.getClonedField());
        return cloneObj;
    }

    }

    public Search0500OutCtx getSearch0500OutCtx() {
            return new Search0500OutCtx();
    }
}
