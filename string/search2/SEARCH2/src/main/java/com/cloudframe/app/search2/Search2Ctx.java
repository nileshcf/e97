package com.cloudframe.app.search2;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.search2.dto.WtFields;
import com.cloudframe.app.search2.dto.SbidGroupEntries;
import com.cloudframe.app.search2.dto.CodeCtrl;
import com.cloudframe.app.search2.dto.Work;
import com.cloudframe.app.search2.dto.MiscData;
import com.cloudframe.app.search2.dto.SbidGroupTbl;


@Context
public class Search2Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    WtFields wtFields;
    MiscData miscData;
    Work work;
    SbidGroupTbl sbidGroupTbl;

    int codeIndex;
    int sbidIndex;

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


    public WtFields getWtFields() {
        if (wtFields == null) {
            wtFields = new WtFields();
        }

        return wtFields;
    }

    public void setWtFields(WtFields wtFields) {
        this.wtFields = wtFields;
    }
    public MiscData getMiscData() {
        if (miscData == null) {
            miscData = new MiscData();
        }

        return miscData;
    }

    public void setMiscData(MiscData miscData) {
        this.miscData = miscData;
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
    public SbidGroupTbl getSbidGroupTbl() {
        if (sbidGroupTbl == null) {
            sbidGroupTbl = new SbidGroupTbl();
        }

        return sbidGroupTbl;
    }

    public void setSbidGroupTbl(SbidGroupTbl sbidGroupTbl) {
        this.sbidGroupTbl = sbidGroupTbl;
    }

    public int getCodeIndex() {
        return codeIndex;
    }

    public void setCodeIndex(int codeIndex) {
        this.codeIndex = codeIndex;
    }
    public int getSbidIndex() {
        return sbidIndex;
    }

    public void setSbidIndex(int sbidIndex) {
        this.sbidIndex = sbidIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wtFields.hashCode();
        str += miscData.hashCode();
        str += work.hashCode();
        str += sbidGroupTbl.hashCode();
       return str.hashCode();
    }

    public Search2Ctx clone() {
        Search2Ctx cloneObj = new Search2Ctx();
        cloneObj.wtFields = new WtFields();
        cloneObj.wtFields.set(wtFields.getClonedField());
        cloneObj.miscData = new MiscData();
        cloneObj.miscData.set(miscData.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.sbidGroupTbl = new SbidGroupTbl();
        cloneObj.sbidGroupTbl.set(sbidGroupTbl.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     WtFields wtFields = Search2Ctx.this.getWtFields();
     Work work = Search2Ctx.this.getWork();
     MiscData miscData = Search2Ctx.this.getMiscData();
     SbidGroupTbl sbidGroupTbl = Search2Ctx.this.getSbidGroupTbl();

	/**
	 *	Returns the value of sbidGroupEntries
	 *	@return sbidGroupEntries
	 */   
	 public SbidGroupEntries getSbidGroupEntries(int index) {
   	return sbidGroupTbl.getSbidGroupEntries(index);
   }

    public List<SbidGroupEntries> getSbidGroupEntries() {
        return sbidGroupTbl.getSbidGroupEntries();
    }
   /**
	* 	Update SbidGroupEntries with the passed value
	*	@param value
	*/
   public void setSbidGroupEntries(int index,char[] value) throws CFException {
      sbidGroupTbl.setSbidGroupEntries((index),value);
   }   


	/**
	 *	Returns the value of increment
	 *	@return increment
	 */
	public int getIncrement() throws CFException {        
   		return work.getIncrement();
	}
	
	/**
	 * 	Update Increment with the passed value
	 *	@param number
	 */
	public void setIncrement(int number)  throws CFException{
		work.setIncrement(number);
	}


	public void setIncrement(long number)  throws CFException{
		work.setIncrement((int)number);
	}


	/**
	 *	Returns the value of toggle123
	 *	@return toggle123
	 */
	public short getToggle123() throws CFException {        
   		return work.getToggle123();
	}
	
	/**
	 * 	Update Toggle123 with the passed value
	 *	@param number
	 */
	public void setToggle123(short number)  throws CFException{
		work.setToggle123(number);
	}

	public void setToggle123(int number)  throws CFException{
		work.setToggle123((short)number);
	}

	public void setToggle123(long number)  throws CFException{
		work.setToggle123((short)number);
	}



	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public short getI() throws CFException {        
   		return miscData.getI();
	}
	
	/**
	 * 	Update I with the passed value
	 *	@param number
	 */
	public void setI(short number)  throws CFException{
		miscData.setI(number);
	}

	public void setI(int number)  throws CFException{
		miscData.setI((short)number);
	}

	public void setI(long number)  throws CFException{
		miscData.setI((short)number);
	}



	/**
	 *	Returns the value of sbidCount
	 *	@return sbidCount
	 */
	public int getSbidCount() throws CFException {        
   		return work.getSbidCount();
	}
	
	/**
	 * 	Update SbidCount with the passed value
	 *	@param number
	 */
	public void setSbidCount(int number)  throws CFException{
		work.setSbidCount(number);
	}


	public void setSbidCount(long number)  throws CFException{
		work.setSbidCount((int)number);
	}


	/**
	 *	Returns the value of counter
	 *	@return counter
	 */
	public int getCounter() throws CFException {        
   		return work.getCounter();
	}
	
	/**
	 * 	Update Counter with the passed value
	 *	@param number
	 */
	public void setCounter(int number)  throws CFException{
		work.setCounter(number);
	}


	public void setCounter(long number)  throws CFException{
		work.setCounter((int)number);
	}


	/**
	 *	Returns the value of sub
	 *	@return sub
	 */
	public int getSub() throws CFException {        
   		return work.getSub();
	}
	
	/**
	 * 	Update Sub with the passed value
	 *	@param number
	 */
	public void setSub(int number)  throws CFException{
		work.setSub(number);
	}


	public void setSub(long number)  throws CFException{
		work.setSub((int)number);
	}



public void setSbidIndex(int sbidIndex) { 
    Search2Ctx.this.sbidIndex = sbidIndex;
}

public int getSbidIndex() { 
    return Search2Ctx.this.sbidIndex;
}
	/**
	 *	Returns the value of sbid
	 *	@return sbid
	 */
	public long getSbid(int index) throws CFException {
   		return miscData.getTblsRedefined(index).getSbid();
	}


	/**
	 *	Returns String value of sbid
	 *	@return sbid
	 */
	public char[]  getSbidString(int index) throws CFException {
	     return String.valueOf(miscData.getTblsRedefined(index).getSbidString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sbidIsNumeric(int index)  throws CFException{
	    return miscData.getTblsRedefined(index - 1).sbidIsNumeric();
	}

	/**
	 * 	Update Sbid with the passed value
	 *	@param number
	 */
	public void setSbid(int index,long number)  throws CFException{
		miscData.getTblsRedefined(index).setSbid(number);
	}
	

	
	/**
	 * 	Update Sbid with the passed value
	 *	@param value (String or char[])
	 */
	public void setSbid(int index,char[] value)  throws CFException {
		miscData.getTblsRedefined(index).setSbid(value);
	}
	
	/**
	 * 	Update Sbid with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSbidString(int index,char[] value)  throws CFException{
		miscData.getTblsRedefined(index).setSbid(value);
	}	

	/**
	 *	Returns the value of sbidGroupTbl
	 *	@return sbidGroupTbl
	 */   
	 public SbidGroupTbl getSbidGroupTbl() {
   	return sbidGroupTbl;
   }


	/**
	 *	Returns the value of ecp
	 *	@return ecp
	 */
   public char[] getEcp(int index) throws CFException  {              
   		return miscData.getTblsRedefined(index).getEcp();
   }

  
	/**
	*  set variable ecp
	*  @param value
	**/
   public void setEcp(int index,char[] value) throws CFException {
      miscData.getTblsRedefined(index).setEcp(value);
   } 

     /**
	 * 	Update Ecp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEcp(int index,char[] source, int sourceIndex) throws CFException {
      miscData.getTblsRedefined(index).setEcp(source, sourceIndex);
   	
   }
   
   public void setEcp(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      miscData.getTblsRedefined(index).setEcp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ecp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEcp(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      miscData.getTblsRedefined(index).setEcp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ecp with another Field
	 *	@param value
	 */
   public void setEcp(int index,Field source) {
      miscData.getTblsRedefined(index).setEcp(source);
   }  
   
     /**
	 * 	Update Ecp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEcp(int index,Field source, int sourceIndex,int sourceLen) {
      miscData.getTblsRedefined(index).setEcp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ecp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEcp(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      miscData.getTblsRedefined(index).setEcp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Search2Ctx getSearch2Ctx() {
            return Search2Ctx.this;
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
        str += wtFields.hashCode();
        str += work.hashCode();
        str += miscData.hashCode();
        str += sbidGroupTbl.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.wtFields = new WtFields();
        cloneObj.wtFields.set(wtFields.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.miscData = new MiscData();
        cloneObj.miscData.set(miscData.getClonedField());
        cloneObj.sbidGroupTbl = new SbidGroupTbl();
        cloneObj.sbidGroupTbl.set(sbidGroupTbl.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessOutCtx implements Cloneable {
     WtFields wtFields = Search2Ctx.this.getWtFields();
     Work work = Search2Ctx.this.getWork();
     MiscData miscData = Search2Ctx.this.getMiscData();
     SbidGroupTbl sbidGroupTbl = Search2Ctx.this.getSbidGroupTbl();

	/**
	 *	Returns the value of initial
	 *	@return initial
	 */
	public int getInitial() throws CFException {        
   		return work.getInitial();
	}
	
	/**
	 * 	Update Initial with the passed value
	 *	@param number
	 */
	public void setInitial(int number)  throws CFException{
		work.setInitial(number);
	}


	public void setInitial(long number)  throws CFException{
		work.setInitial((int)number);
	}


	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public short getI() throws CFException {        
   		return miscData.getI();
	}
	
	/**
	 * 	Update I with the passed value
	 *	@param number
	 */
	public void setI(short number)  throws CFException{
		miscData.setI(number);
	}

	public void setI(int number)  throws CFException{
		miscData.setI((short)number);
	}

	public void setI(long number)  throws CFException{
		miscData.setI((short)number);
	}



	/**
	 *	Returns the value of codeValue
	 *	@return codeValue
	 */
	public long getCodeValue(int index) throws CFException {        
   		return wtFields.getCodeCtrl(index).getCodeValue();
	}
	
	/**
	 * 	Update CodeValue with the passed value
	 *	@param number
	 */
	public void setCodeValue(int index,long number)  throws CFException{
		wtFields.getCodeCtrl(index).setCodeValue(number);
	}



	/**
	 *	Returns the value of cmdCaHomeSidBidCode
	 *	@return cmdCaHomeSidBidCode
	 */
   public char[] getCmdCaHomeSidBidCode() throws CFException  {              
   		return miscData.getCmdCaHomeSidBidCode();
   }

  
	/**
	*  set variable cmdCaHomeSidBidCode
	*  @param value
	**/
   public void setCmdCaHomeSidBidCode(char[] value) throws CFException {
      miscData.setCmdCaHomeSidBidCode(value);
   } 

     /**
	 * 	Update CmdCaHomeSidBidCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmdCaHomeSidBidCode(char[] source, int sourceIndex) throws CFException {
      miscData.setCmdCaHomeSidBidCode(source, sourceIndex);
   	
   }
   
   public void setCmdCaHomeSidBidCode(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      miscData.setCmdCaHomeSidBidCode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CmdCaHomeSidBidCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmdCaHomeSidBidCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      miscData.setCmdCaHomeSidBidCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CmdCaHomeSidBidCode with another Field
	 *	@param value
	 */
   public void setCmdCaHomeSidBidCode(Field source) {
      miscData.setCmdCaHomeSidBidCode(source);
   }  
   
     /**
	 * 	Update CmdCaHomeSidBidCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmdCaHomeSidBidCode(Field source, int sourceIndex,int sourceLen) {
      miscData.setCmdCaHomeSidBidCode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CmdCaHomeSidBidCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmdCaHomeSidBidCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      miscData.setCmdCaHomeSidBidCode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of codeMarker
	 *	@return codeMarker
	 */
	public long getCodeMarker(int index) throws CFException {
   		return wtFields.getCodeCtrl(index).getCodeMarker();
	}


	/**
	 *	Returns String value of codeMarker
	 *	@return codeMarker
	 */
	public char[]  getCodeMarkerString(int index) throws CFException {
	     return String.valueOf(wtFields.getCodeCtrl(index).getCodeMarkerString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean codeMarkerIsNumeric(int index)  throws CFException{
	    return wtFields.getCodeCtrl(index - 1).codeMarkerIsNumeric();
	}

	/**
	 * 	Update CodeMarker with the passed value
	 *	@param number
	 */
	public void setCodeMarker(int index,long number)  throws CFException{
		wtFields.getCodeCtrl(index).setCodeMarker(number);
	}
	

	
	/**
	 * 	Update CodeMarker with the passed value
	 *	@param value (String or char[])
	 */
	public void setCodeMarker(int index,char[] value)  throws CFException {
		wtFields.getCodeCtrl(index).setCodeMarker(value);
	}
	
	/**
	 * 	Update CodeMarker with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCodeMarkerString(int index,char[] value)  throws CFException{
		wtFields.getCodeCtrl(index).setCodeMarker(value);
	}	

	/**
	 *	Returns the value of sub
	 *	@return sub
	 */
	public int getSub() throws CFException {        
   		return work.getSub();
	}
	
	/**
	 * 	Update Sub with the passed value
	 *	@param number
	 */
	public void setSub(int number)  throws CFException{
		work.setSub(number);
	}


	public void setSub(long number)  throws CFException{
		work.setSub((int)number);
	}


	/**
	 *	Returns the value of toggle123
	 *	@return toggle123
	 */
	public short getToggle123() throws CFException {        
   		return work.getToggle123();
	}
	
	/**
	 * 	Update Toggle123 with the passed value
	 *	@param number
	 */
	public void setToggle123(short number)  throws CFException{
		work.setToggle123(number);
	}

	public void setToggle123(int number)  throws CFException{
		work.setToggle123((short)number);
	}

	public void setToggle123(long number)  throws CFException{
		work.setToggle123((short)number);
	}



	/**
	 *	Returns the value of sbidCount
	 *	@return sbidCount
	 */
	public int getSbidCount() throws CFException {        
   		return work.getSbidCount();
	}
	
	/**
	 * 	Update SbidCount with the passed value
	 *	@param number
	 */
	public void setSbidCount(int number)  throws CFException{
		work.setSbidCount(number);
	}


	public void setSbidCount(long number)  throws CFException{
		work.setSbidCount((int)number);
	}


	/**
	 *	Returns the value of codeToggle
	 *	@return codeToggle
	 */
	public int getCodeToggle(int index) throws CFException {        
   		return wtFields.getCodeCtrl(index).getCodeToggle();
	}
	
	/**
	 * 	Update CodeToggle with the passed value
	 *	@param number
	 */
	public void setCodeToggle(int index,int number)  throws CFException{
		wtFields.getCodeCtrl(index).setCodeToggle(number);
	}


	public void setCodeToggle(int index,long number)  throws CFException{
		wtFields.getCodeCtrl(index).setCodeToggle((int)number);
	}


	/**
	 *	Returns the value of counter
	 *	@return counter
	 */
	public int getCounter() throws CFException {        
   		return work.getCounter();
	}
	
	/**
	 * 	Update Counter with the passed value
	 *	@param number
	 */
	public void setCounter(int number)  throws CFException{
		work.setCounter(number);
	}


	public void setCounter(long number)  throws CFException{
		work.setCounter((int)number);
	}



public void setSbidIndex(int sbidIndex) { 
    Search2Ctx.this.sbidIndex = sbidIndex;
}

public int getSbidIndex() { 
    return Search2Ctx.this.sbidIndex;
}
	/**
	 *	Returns the value of sbid
	 *	@return sbid
	 */
	public long getSbid(int index) throws CFException {
   		return miscData.getTblsRedefined(index).getSbid();
	}


	/**
	 *	Returns String value of sbid
	 *	@return sbid
	 */
	public char[]  getSbidString(int index) throws CFException {
	     return String.valueOf(miscData.getTblsRedefined(index).getSbidString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sbidIsNumeric(int index)  throws CFException{
	    return miscData.getTblsRedefined(index - 1).sbidIsNumeric();
	}

	/**
	 * 	Update Sbid with the passed value
	 *	@param number
	 */
	public void setSbid(int index,long number)  throws CFException{
		miscData.getTblsRedefined(index).setSbid(number);
	}
	

	
	/**
	 * 	Update Sbid with the passed value
	 *	@param value (String or char[])
	 */
	public void setSbid(int index,char[] value)  throws CFException {
		miscData.getTblsRedefined(index).setSbid(value);
	}
	
	/**
	 * 	Update Sbid with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSbidString(int index,char[] value)  throws CFException{
		miscData.getTblsRedefined(index).setSbid(value);
	}	

	/**
	 *	Returns the value of tblSbid
	 *	@return tblSbid
	 */
	public long getTblSbid(int index) throws CFException {
   		return sbidGroupTbl.getSbidGroupEntries(index).getTblSbid();
	}


	/**
	 *	Returns String value of tblSbid
	 *	@return tblSbid
	 */
	public char[]  getTblSbidString(int index) throws CFException {
	     return String.valueOf(sbidGroupTbl.getSbidGroupEntries(index).getTblSbidString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tblSbidIsNumeric(int index)  throws CFException{
	    return sbidGroupTbl.getSbidGroupEntries(index - 1).tblSbidIsNumeric();
	}

	/**
	 * 	Update TblSbid with the passed value
	 *	@param number
	 */
	public void setTblSbid(int index,long number)  throws CFException{
		sbidGroupTbl.getSbidGroupEntries(index).setTblSbid(number);
	}
	

	
	/**
	 * 	Update TblSbid with the passed value
	 *	@param value (String or char[])
	 */
	public void setTblSbid(int index,char[] value)  throws CFException {
		sbidGroupTbl.getSbidGroupEntries(index).setTblSbid(value);
	}
	
	/**
	 * 	Update TblSbid with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTblSbidString(int index,char[] value)  throws CFException{
		sbidGroupTbl.getSbidGroupEntries(index).setTblSbid(value);
	}	

	/**
	 *	Returns the value of tblEcp
	 *	@return tblEcp
	 */
   public char[] getTblEcp(int index) throws CFException  {              
   		return sbidGroupTbl.getSbidGroupEntries(index).getTblEcp();
   }

  
	/**
	*  set variable tblEcp
	*  @param value
	**/
   public void setTblEcp(int index,char[] value) throws CFException {
      sbidGroupTbl.getSbidGroupEntries(index).setTblEcp(value);
   } 

     /**
	 * 	Update TblEcp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTblEcp(int index,char[] source, int sourceIndex) throws CFException {
      sbidGroupTbl.getSbidGroupEntries(index).setTblEcp(source, sourceIndex);
   	
   }
   
   public void setTblEcp(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      sbidGroupTbl.getSbidGroupEntries(index).setTblEcp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update TblEcp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTblEcp(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sbidGroupTbl.getSbidGroupEntries(index).setTblEcp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update TblEcp with another Field
	 *	@param value
	 */
   public void setTblEcp(int index,Field source) {
      sbidGroupTbl.getSbidGroupEntries(index).setTblEcp(source);
   }  
   
     /**
	 * 	Update TblEcp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTblEcp(int index,Field source, int sourceIndex,int sourceLen) {
      sbidGroupTbl.getSbidGroupEntries(index).setTblEcp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update TblEcp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTblEcp(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      sbidGroupTbl.getSbidGroupEntries(index).setTblEcp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ecp
	 *	@return ecp
	 */
   public char[] getEcp(int index) throws CFException  {              
   		return miscData.getTblsRedefined(index).getEcp();
   }

  
	/**
	*  set variable ecp
	*  @param value
	**/
   public void setEcp(int index,char[] value) throws CFException {
      miscData.getTblsRedefined(index).setEcp(value);
   } 

     /**
	 * 	Update Ecp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEcp(int index,char[] source, int sourceIndex) throws CFException {
      miscData.getTblsRedefined(index).setEcp(source, sourceIndex);
   	
   }
   
   public void setEcp(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      miscData.getTblsRedefined(index).setEcp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ecp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEcp(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      miscData.getTblsRedefined(index).setEcp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ecp with another Field
	 *	@param value
	 */
   public void setEcp(int index,Field source) {
      miscData.getTblsRedefined(index).setEcp(source);
   }  
   
     /**
	 * 	Update Ecp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEcp(int index,Field source, int sourceIndex,int sourceLen) {
      miscData.getTblsRedefined(index).setEcp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ecp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEcp(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      miscData.getTblsRedefined(index).setEcp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Search2Ctx getSearch2Ctx() {
            return Search2Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wtFields.hashCode();
        str += work.hashCode();
        str += miscData.hashCode();
        str += sbidGroupTbl.hashCode();
       return str.hashCode();
    }

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.wtFields = new WtFields();
        cloneObj.wtFields.set(wtFields.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.miscData = new MiscData();
        cloneObj.miscData.set(miscData.getClonedField());
        cloneObj.sbidGroupTbl = new SbidGroupTbl();
        cloneObj.sbidGroupTbl.set(sbidGroupTbl.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
     public class ToggleInCtx implements Cloneable {
     WtFields wtFields = Search2Ctx.this.getWtFields();
     Work work = Search2Ctx.this.getWork();

	/**
	 *	Returns the value of toggle123
	 *	@return toggle123
	 */
	public short getToggle123() throws CFException {        
   		return work.getToggle123();
	}
	
	/**
	 * 	Update Toggle123 with the passed value
	 *	@param number
	 */
	public void setToggle123(short number)  throws CFException{
		work.setToggle123(number);
	}

	public void setToggle123(int number)  throws CFException{
		work.setToggle123((short)number);
	}

	public void setToggle123(long number)  throws CFException{
		work.setToggle123((short)number);
	}



	/**
	 *	Returns the value of sub3
	 *	@return sub3
	 */
	public int getSub3() throws CFException {        
   		return work.getSub3();
	}
	
	/**
	 * 	Update Sub3 with the passed value
	 *	@param number
	 */
	public void setSub3(int number)  throws CFException{
		work.setSub3(number);
	}


	public void setSub3(long number)  throws CFException{
		work.setSub3((int)number);
	}


	/**
	 *	Returns the value of sub2
	 *	@return sub2
	 */
	public int getSub2() throws CFException {        
   		return work.getSub2();
	}
	
	/**
	 * 	Update Sub2 with the passed value
	 *	@param number
	 */
	public void setSub2(int number)  throws CFException{
		work.setSub2(number);
	}


	public void setSub2(long number)  throws CFException{
		work.setSub2((int)number);
	}


	/**
	 *	Returns the value of codeValue
	 *	@return codeValue
	 */
	public long getCodeValue(int index) throws CFException {        
   		return wtFields.getCodeCtrl(index).getCodeValue();
	}
	
	/**
	 * 	Update CodeValue with the passed value
	 *	@param number
	 */
	public void setCodeValue(int index,long number)  throws CFException{
		wtFields.getCodeCtrl(index).setCodeValue(number);
	}



	/**
	 *	Returns the value of sub
	 *	@return sub
	 */
	public int getSub() throws CFException {        
   		return work.getSub();
	}
	
	/**
	 * 	Update Sub with the passed value
	 *	@param number
	 */
	public void setSub(int number)  throws CFException{
		work.setSub(number);
	}


	public void setSub(long number)  throws CFException{
		work.setSub((int)number);
	}


	/**
	 *	Returns the value of toggleMax
	 *	@return toggleMax
	 */
	public short getToggleMax() throws CFException {        
   		return work.getToggleMax();
	}
	
	/**
	 * 	Update ToggleMax with the passed value
	 *	@param number
	 */
	public void setToggleMax(short number)  throws CFException{
		work.setToggleMax(number);
	}

	public void setToggleMax(int number)  throws CFException{
		work.setToggleMax((short)number);
	}

	public void setToggleMax(long number)  throws CFException{
		work.setToggleMax((short)number);
	}




        public Search2Ctx getSearch2Ctx() {
            return Search2Ctx.this;
        }

        public ToggleOutCtx getToggleOutCtx() {
            return new ToggleOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wtFields.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ToggleInCtx clone() {
        ToggleInCtx cloneObj = new ToggleInCtx();
        cloneObj.wtFields = new WtFields();
        cloneObj.wtFields.set(wtFields.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ToggleInCtx getToggleInCtx() {
            return new ToggleInCtx();
    }
     public class ToggleOutCtx implements Cloneable {
     WtFields wtFields = Search2Ctx.this.getWtFields();
     Work work = Search2Ctx.this.getWork();

	/**
	 *	Returns the value of toggle123
	 *	@return toggle123
	 */
	public short getToggle123() throws CFException {        
   		return work.getToggle123();
	}
	
	/**
	 * 	Update Toggle123 with the passed value
	 *	@param number
	 */
	public void setToggle123(short number)  throws CFException{
		work.setToggle123(number);
	}

	public void setToggle123(int number)  throws CFException{
		work.setToggle123((short)number);
	}

	public void setToggle123(long number)  throws CFException{
		work.setToggle123((short)number);
	}



	/**
	 *	Returns the value of sub3
	 *	@return sub3
	 */
	public int getSub3() throws CFException {        
   		return work.getSub3();
	}
	
	/**
	 * 	Update Sub3 with the passed value
	 *	@param number
	 */
	public void setSub3(int number)  throws CFException{
		work.setSub3(number);
	}


	public void setSub3(long number)  throws CFException{
		work.setSub3((int)number);
	}


	/**
	 *	Returns the value of sub2
	 *	@return sub2
	 */
	public int getSub2() throws CFException {        
   		return work.getSub2();
	}
	
	/**
	 * 	Update Sub2 with the passed value
	 *	@param number
	 */
	public void setSub2(int number)  throws CFException{
		work.setSub2(number);
	}


	public void setSub2(long number)  throws CFException{
		work.setSub2((int)number);
	}


	/**
	 *	Returns the value of codeValue
	 *	@return codeValue
	 */
	public long getCodeValue(int index) throws CFException {        
   		return wtFields.getCodeCtrl(index).getCodeValue();
	}
	
	/**
	 * 	Update CodeValue with the passed value
	 *	@param number
	 */
	public void setCodeValue(int index,long number)  throws CFException{
		wtFields.getCodeCtrl(index).setCodeValue(number);
	}



	/**
	 *	Returns the value of toggleMax
	 *	@return toggleMax
	 */
	public short getToggleMax() throws CFException {        
   		return work.getToggleMax();
	}
	
	/**
	 * 	Update ToggleMax with the passed value
	 *	@param number
	 */
	public void setToggleMax(short number)  throws CFException{
		work.setToggleMax(number);
	}

	public void setToggleMax(int number)  throws CFException{
		work.setToggleMax((short)number);
	}

	public void setToggleMax(long number)  throws CFException{
		work.setToggleMax((short)number);
	}




        public Search2Ctx getSearch2Ctx() {
            return Search2Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wtFields.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ToggleOutCtx clone() {
        ToggleOutCtx cloneObj = new ToggleOutCtx();
        cloneObj.wtFields = new WtFields();
        cloneObj.wtFields.set(wtFields.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ToggleOutCtx getToggleOutCtx() {
            return new ToggleOutCtx();
    }
     public class FillDetailInCtx implements Cloneable {
     WtFields wtFields = Search2Ctx.this.getWtFields();
     Work work = Search2Ctx.this.getWork();

	/**
	 *	Returns the value of toggle123
	 *	@return toggle123
	 */
	public short getToggle123() throws CFException {        
   		return work.getToggle123();
	}
	
	/**
	 * 	Update Toggle123 with the passed value
	 *	@param number
	 */
	public void setToggle123(short number)  throws CFException{
		work.setToggle123(number);
	}

	public void setToggle123(int number)  throws CFException{
		work.setToggle123((short)number);
	}

	public void setToggle123(long number)  throws CFException{
		work.setToggle123((short)number);
	}



	/**
	 *	Returns the value of codeValue
	 *	@return codeValue
	 */
	public long getCodeValue(int index) throws CFException {        
   		return wtFields.getCodeCtrl(index).getCodeValue();
	}
	
	/**
	 * 	Update CodeValue with the passed value
	 *	@param number
	 */
	public void setCodeValue(int index,long number)  throws CFException{
		wtFields.getCodeCtrl(index).setCodeValue(number);
	}



	/**
	 *	Returns the value of codeToggle
	 *	@return codeToggle
	 */
	public int getCodeToggle(int index) throws CFException {        
   		return wtFields.getCodeCtrl(index).getCodeToggle();
	}
	
	/**
	 * 	Update CodeToggle with the passed value
	 *	@param number
	 */
	public void setCodeToggle(int index,int number)  throws CFException{
		wtFields.getCodeCtrl(index).setCodeToggle(number);
	}


	public void setCodeToggle(int index,long number)  throws CFException{
		wtFields.getCodeCtrl(index).setCodeToggle((int)number);
	}


	/**
	 *	Returns the value of codeMarker
	 *	@return codeMarker
	 */
	public long getCodeMarker(int index) throws CFException {
   		return wtFields.getCodeCtrl(index).getCodeMarker();
	}


	/**
	 *	Returns String value of codeMarker
	 *	@return codeMarker
	 */
	public char[]  getCodeMarkerString(int index) throws CFException {
	     return String.valueOf(wtFields.getCodeCtrl(index).getCodeMarkerString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean codeMarkerIsNumeric(int index)  throws CFException{
	    return wtFields.getCodeCtrl(index - 1).codeMarkerIsNumeric();
	}

	/**
	 * 	Update CodeMarker with the passed value
	 *	@param number
	 */
	public void setCodeMarker(int index,long number)  throws CFException{
		wtFields.getCodeCtrl(index).setCodeMarker(number);
	}
	

	
	/**
	 * 	Update CodeMarker with the passed value
	 *	@param value (String or char[])
	 */
	public void setCodeMarker(int index,char[] value)  throws CFException {
		wtFields.getCodeCtrl(index).setCodeMarker(value);
	}
	
	/**
	 * 	Update CodeMarker with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCodeMarkerString(int index,char[] value)  throws CFException{
		wtFields.getCodeCtrl(index).setCodeMarker(value);
	}	

	/**
	 *	Returns the value of sub
	 *	@return sub
	 */
	public int getSub() throws CFException {        
   		return work.getSub();
	}
	
	/**
	 * 	Update Sub with the passed value
	 *	@param number
	 */
	public void setSub(int number)  throws CFException{
		work.setSub(number);
	}


	public void setSub(long number)  throws CFException{
		work.setSub((int)number);
	}


	/**
	 *	Returns the value of toggleMax
	 *	@return toggleMax
	 */
	public short getToggleMax() throws CFException {        
   		return work.getToggleMax();
	}
	
	/**
	 * 	Update ToggleMax with the passed value
	 *	@param number
	 */
	public void setToggleMax(short number)  throws CFException{
		work.setToggleMax(number);
	}

	public void setToggleMax(int number)  throws CFException{
		work.setToggleMax((short)number);
	}

	public void setToggleMax(long number)  throws CFException{
		work.setToggleMax((short)number);
	}




        public Search2Ctx getSearch2Ctx() {
            return Search2Ctx.this;
        }

        public FillDetailOutCtx getFillDetailOutCtx() {
            return new FillDetailOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wtFields.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public FillDetailInCtx clone() {
        FillDetailInCtx cloneObj = new FillDetailInCtx();
        cloneObj.wtFields = new WtFields();
        cloneObj.wtFields.set(wtFields.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public FillDetailInCtx getFillDetailInCtx() {
            return new FillDetailInCtx();
    }
     public class FillDetailOutCtx implements Cloneable {
     WtFields wtFields = Search2Ctx.this.getWtFields();
     Work work = Search2Ctx.this.getWork();

	/**
	 *	Returns the value of toggle123
	 *	@return toggle123
	 */
	public short getToggle123() throws CFException {        
   		return work.getToggle123();
	}
	
	/**
	 * 	Update Toggle123 with the passed value
	 *	@param number
	 */
	public void setToggle123(short number)  throws CFException{
		work.setToggle123(number);
	}

	public void setToggle123(int number)  throws CFException{
		work.setToggle123((short)number);
	}

	public void setToggle123(long number)  throws CFException{
		work.setToggle123((short)number);
	}



	/**
	 *	Returns the value of sub
	 *	@return sub
	 */
	public int getSub() throws CFException {        
   		return work.getSub();
	}
	
	/**
	 * 	Update Sub with the passed value
	 *	@param number
	 */
	public void setSub(int number)  throws CFException{
		work.setSub(number);
	}


	public void setSub(long number)  throws CFException{
		work.setSub((int)number);
	}


	/**
	 *	Returns the value of toggleMax
	 *	@return toggleMax
	 */
	public short getToggleMax() throws CFException {        
   		return work.getToggleMax();
	}
	
	/**
	 * 	Update ToggleMax with the passed value
	 *	@param number
	 */
	public void setToggleMax(short number)  throws CFException{
		work.setToggleMax(number);
	}

	public void setToggleMax(int number)  throws CFException{
		work.setToggleMax((short)number);
	}

	public void setToggleMax(long number)  throws CFException{
		work.setToggleMax((short)number);
	}



	/**
	 *	Returns the value of searchItem
	 *	@return searchItem
	 */
	public long getSearchItem() throws CFException {        
   		return work.getSearchItem();
	}
	
	/**
	 * 	Update SearchItem with the passed value
	 *	@param number
	 */
	public void setSearchItem(long number)  throws CFException{
		work.setSearchItem(number);
	}




        public Search2Ctx getSearch2Ctx() {
            return Search2Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wtFields.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public FillDetailOutCtx clone() {
        FillDetailOutCtx cloneObj = new FillDetailOutCtx();
        cloneObj.wtFields = new WtFields();
        cloneObj.wtFields.set(wtFields.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public FillDetailOutCtx getFillDetailOutCtx() {
            return new FillDetailOutCtx();
    }
     public class FillDetail0011InCtx implements Cloneable {
     WtFields wtFields = Search2Ctx.this.getWtFields();
     Work work = Search2Ctx.this.getWork();

	/**
	 *	Returns the value of toggle123
	 *	@return toggle123
	 */
	public short getToggle123() throws CFException {        
   		return work.getToggle123();
	}
	
	/**
	 * 	Update Toggle123 with the passed value
	 *	@param number
	 */
	public void setToggle123(short number)  throws CFException{
		work.setToggle123(number);
	}

	public void setToggle123(int number)  throws CFException{
		work.setToggle123((short)number);
	}

	public void setToggle123(long number)  throws CFException{
		work.setToggle123((short)number);
	}



	/**
	 *	Returns the value of sub
	 *	@return sub
	 */
	public int getSub() throws CFException {        
   		return work.getSub();
	}
	
	/**
	 * 	Update Sub with the passed value
	 *	@param number
	 */
	public void setSub(int number)  throws CFException{
		work.setSub(number);
	}


	public void setSub(long number)  throws CFException{
		work.setSub((int)number);
	}



        public Search2Ctx getSearch2Ctx() {
            return Search2Ctx.this;
        }

        public FillDetail0011OutCtx getFillDetail0011OutCtx() {
            return new FillDetail0011OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wtFields.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public FillDetail0011InCtx clone() {
        FillDetail0011InCtx cloneObj = new FillDetail0011InCtx();
        cloneObj.wtFields = new WtFields();
        cloneObj.wtFields.set(wtFields.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public FillDetail0011InCtx getFillDetail0011InCtx() {
            return new FillDetail0011InCtx();
    }
     public class FillDetail0011OutCtx implements Cloneable {
     WtFields wtFields = Search2Ctx.this.getWtFields();
     Work work = Search2Ctx.this.getWork();

	/**
	 *	Returns the value of toggle123
	 *	@return toggle123
	 */
	public short getToggle123() throws CFException {        
   		return work.getToggle123();
	}
	
	/**
	 * 	Update Toggle123 with the passed value
	 *	@param number
	 */
	public void setToggle123(short number)  throws CFException{
		work.setToggle123(number);
	}

	public void setToggle123(int number)  throws CFException{
		work.setToggle123((short)number);
	}

	public void setToggle123(long number)  throws CFException{
		work.setToggle123((short)number);
	}



	/**
	 *	Returns the value of codeValue
	 *	@return codeValue
	 */
	public long getCodeValue(int index) throws CFException {        
   		return wtFields.getCodeCtrl(index).getCodeValue();
	}
	
	/**
	 * 	Update CodeValue with the passed value
	 *	@param number
	 */
	public void setCodeValue(int index,long number)  throws CFException{
		wtFields.getCodeCtrl(index).setCodeValue(number);
	}



	/**
	 *	Returns the value of sub
	 *	@return sub
	 */
	public int getSub() throws CFException {        
   		return work.getSub();
	}
	
	/**
	 * 	Update Sub with the passed value
	 *	@param number
	 */
	public void setSub(int number)  throws CFException{
		work.setSub(number);
	}


	public void setSub(long number)  throws CFException{
		work.setSub((int)number);
	}


	/**
	 *	Returns the value of searchItem
	 *	@return searchItem
	 */
	public long getSearchItem() throws CFException {        
   		return work.getSearchItem();
	}
	
	/**
	 * 	Update SearchItem with the passed value
	 *	@param number
	 */
	public void setSearchItem(long number)  throws CFException{
		work.setSearchItem(number);
	}




        public Search2Ctx getSearch2Ctx() {
            return Search2Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wtFields.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public FillDetail0011OutCtx clone() {
        FillDetail0011OutCtx cloneObj = new FillDetail0011OutCtx();
        cloneObj.wtFields = new WtFields();
        cloneObj.wtFields.set(wtFields.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public FillDetail0011OutCtx getFillDetail0011OutCtx() {
            return new FillDetail0011OutCtx();
    }
     public class SearchAllInCtx implements Cloneable {
     WtFields wtFields = Search2Ctx.this.getWtFields();
     Work work = Search2Ctx.this.getWork();


public void setCodeIndex(int codeIndex) { 
    Search2Ctx.this.codeIndex = codeIndex;
}

public int getCodeIndex() { 
    return Search2Ctx.this.codeIndex;
}
	/**
	 *	Returns the value of toggle123
	 *	@return toggle123
	 */
	public short getToggle123() throws CFException {        
   		return work.getToggle123();
	}
	
	/**
	 * 	Update Toggle123 with the passed value
	 *	@param number
	 */
	public void setToggle123(short number)  throws CFException{
		work.setToggle123(number);
	}

	public void setToggle123(int number)  throws CFException{
		work.setToggle123((short)number);
	}

	public void setToggle123(long number)  throws CFException{
		work.setToggle123((short)number);
	}



	/**
	 *	Returns the value of wtFields
	 *	@return wtFields
	 */   
	 public WtFields getWtFields() {
   	return wtFields;
   }


	/**
	 *	Returns the value of codeValue
	 *	@return codeValue
	 */
	public long getCodeValue(int index) throws CFException {        
   		return wtFields.getCodeCtrl(index).getCodeValue();
	}
	
	/**
	 * 	Update CodeValue with the passed value
	 *	@param number
	 */
	public void setCodeValue(int index,long number)  throws CFException{
		wtFields.getCodeCtrl(index).setCodeValue(number);
	}



	/**
	 *	Returns the value of codeToggle
	 *	@return codeToggle
	 */
	public int getCodeToggle(int index) throws CFException {        
   		return wtFields.getCodeCtrl(index).getCodeToggle();
	}
	
	/**
	 * 	Update CodeToggle with the passed value
	 *	@param number
	 */
	public void setCodeToggle(int index,int number)  throws CFException{
		wtFields.getCodeCtrl(index).setCodeToggle(number);
	}


	public void setCodeToggle(int index,long number)  throws CFException{
		wtFields.getCodeCtrl(index).setCodeToggle((int)number);
	}


	/**
	 *	Returns the value of codeCtrl
	 *	@return codeCtrl
	 */   
	 public CodeCtrl getCodeCtrl(int index) {
   	return wtFields.getCodeCtrl(index);
   }

    public List<CodeCtrl> getCodeCtrl() {
        return wtFields.getCodeCtrl();
    }
   /**
	* 	Update CodeCtrl with the passed value
	*	@param value
	*/
   public void setCodeCtrl(int index,char[] value) throws CFException {
      wtFields.setCodeCtrl((index),value);
   }   


	/**
	 *	Returns the value of codeMarker
	 *	@return codeMarker
	 */
	public long getCodeMarker(int index) throws CFException {
   		return wtFields.getCodeCtrl(index).getCodeMarker();
	}


	/**
	 *	Returns String value of codeMarker
	 *	@return codeMarker
	 */
	public char[]  getCodeMarkerString(int index) throws CFException {
	     return String.valueOf(wtFields.getCodeCtrl(index).getCodeMarkerString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean codeMarkerIsNumeric(int index)  throws CFException{
	    return wtFields.getCodeCtrl(index - 1).codeMarkerIsNumeric();
	}

	/**
	 * 	Update CodeMarker with the passed value
	 *	@param number
	 */
	public void setCodeMarker(int index,long number)  throws CFException{
		wtFields.getCodeCtrl(index).setCodeMarker(number);
	}
	

	
	/**
	 * 	Update CodeMarker with the passed value
	 *	@param value (String or char[])
	 */
	public void setCodeMarker(int index,char[] value)  throws CFException {
		wtFields.getCodeCtrl(index).setCodeMarker(value);
	}
	
	/**
	 * 	Update CodeMarker with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCodeMarkerString(int index,char[] value)  throws CFException{
		wtFields.getCodeCtrl(index).setCodeMarker(value);
	}	

	/**
	 *	Returns the value of counter
	 *	@return counter
	 */
	public int getCounter() throws CFException {        
   		return work.getCounter();
	}
	
	/**
	 * 	Update Counter with the passed value
	 *	@param number
	 */
	public void setCounter(int number)  throws CFException{
		work.setCounter(number);
	}


	public void setCounter(long number)  throws CFException{
		work.setCounter((int)number);
	}


	/**
	 *	Returns the value of searchItem
	 *	@return searchItem
	 */
	public long getSearchItem() throws CFException {        
   		return work.getSearchItem();
	}
	
	/**
	 * 	Update SearchItem with the passed value
	 *	@param number
	 */
	public void setSearchItem(long number)  throws CFException{
		work.setSearchItem(number);
	}




        public Search2Ctx getSearch2Ctx() {
            return Search2Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += wtFields.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public SearchAllInCtx clone() {
        SearchAllInCtx cloneObj = new SearchAllInCtx();
        cloneObj.wtFields = new WtFields();
        cloneObj.wtFields.set(wtFields.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SearchAllInCtx getSearchAllInCtx() {
            return new SearchAllInCtx();
    }
}
