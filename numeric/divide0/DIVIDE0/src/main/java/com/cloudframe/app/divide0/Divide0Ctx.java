package com.cloudframe.app.divide0;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.divide0.dto.DaReportTable;
import com.cloudframe.app.divide0.dto.Work;
import com.cloudframe.app.divide0.dto.BaPrefixVolumeTable;


@Context
public class Divide0Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    DaReportTable daReportTable;
    Work work;
    BaPrefixVolumeTable baPrefixVolumeTable;


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


    public DaReportTable getDaReportTable() {
        if (daReportTable == null) {
            daReportTable = new DaReportTable();
        }

        return daReportTable;
    }

    public void setDaReportTable(DaReportTable daReportTable) {
        this.daReportTable = daReportTable;
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
    public BaPrefixVolumeTable getBaPrefixVolumeTable() {
        if (baPrefixVolumeTable == null) {
            baPrefixVolumeTable = new BaPrefixVolumeTable();
        }

        return baPrefixVolumeTable;
    }

    public void setBaPrefixVolumeTable(BaPrefixVolumeTable baPrefixVolumeTable) {
        this.baPrefixVolumeTable = baPrefixVolumeTable;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += daReportTable.hashCode();
        str += work.hashCode();
        str += baPrefixVolumeTable.hashCode();
       return str.hashCode();
    }

    public Divide0Ctx clone() {
        Divide0Ctx cloneObj = new Divide0Ctx();
        cloneObj.daReportTable = new DaReportTable();
        cloneObj.daReportTable.set(daReportTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.baPrefixVolumeTable = new BaPrefixVolumeTable();
        cloneObj.baPrefixVolumeTable.set(baPrefixVolumeTable.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineSplit0InCtx implements Cloneable {
     Work work = Divide0Ctx.this.getWork();
     DaReportTable daReportTable = Divide0Ctx.this.getDaReportTable();
     BaPrefixVolumeTable baPrefixVolumeTable = Divide0Ctx.this.getBaPrefixVolumeTable();

	/**
	 *	Returns the value of daIx
	 *	@return daIx
	 */
	public int getDaIx() throws CFException {
   		return daReportTable.getDaIx();
	}


	/**
	 *	Returns String value of daIx
	 *	@return daIx
	 */
	public char[]  getDaIxString() throws CFException {
	     return String.valueOf(daReportTable.getDaIxString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean daIxIsNumeric()  throws CFException{
	    return daReportTable.daIxIsNumeric();
	}

	/**
	 * 	Update DaIx with the passed value
	 *	@param number
	 */
	public void setDaIx(int number)  throws CFException{
		daReportTable.setDaIx(number);
	}
	

	public void setDaIx(long number)  throws CFException{
	    daReportTable.setDaIx(number);
	}
	
	
	/**
	 * 	Update DaIx with the passed value
	 *	@param value (String or char[])
	 */
	public void setDaIx(char[] value)  throws CFException {
		daReportTable.setDaIx(value);
	}
	
	/**
	 * 	Update DaIx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDaIxString(char[] value)  throws CFException{
		daReportTable.setDaIx(value);
	}	

	/**
	 *	Returns the value of daSub
	 *	@return daSub
	 */
	public int getDaSub() throws CFException {
   		return daReportTable.getDaSub();
	}


	/**
	 *	Returns String value of daSub
	 *	@return daSub
	 */
	public char[]  getDaSubString() throws CFException {
	     return String.valueOf(daReportTable.getDaSubString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean daSubIsNumeric()  throws CFException{
	    return daReportTable.daSubIsNumeric();
	}

	/**
	 * 	Update DaSub with the passed value
	 *	@param number
	 */
	public void setDaSub(int number)  throws CFException{
		daReportTable.setDaSub(number);
	}
	

	public void setDaSub(long number)  throws CFException{
	    daReportTable.setDaSub(number);
	}
	
	
	/**
	 * 	Update DaSub with the passed value
	 *	@param value (String or char[])
	 */
	public void setDaSub(char[] value)  throws CFException {
		daReportTable.setDaSub(value);
	}
	
	/**
	 * 	Update DaSub with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDaSubString(char[] value)  throws CFException{
		daReportTable.setDaSub(value);
	}	


        public Divide0Ctx getDivide0Ctx() {
            return Divide0Ctx.this;
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
        str += work.hashCode();
        str += daReportTable.hashCode();
        str += baPrefixVolumeTable.hashCode();
       return str.hashCode();
    }

    public MainlineSplit0InCtx clone() {
        MainlineSplit0InCtx cloneObj = new MainlineSplit0InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.daReportTable = new DaReportTable();
        cloneObj.daReportTable.set(daReportTable.getClonedField());
        cloneObj.baPrefixVolumeTable = new BaPrefixVolumeTable();
        cloneObj.baPrefixVolumeTable.set(baPrefixVolumeTable.getClonedField());
        return cloneObj;
    }

    }

    public MainlineSplit0InCtx getMainlineSplit0InCtx() {
            return new MainlineSplit0InCtx();
    }
     public class MainlineSplit0OutCtx implements Cloneable {
     Work work = Divide0Ctx.this.getWork();
     DaReportTable daReportTable = Divide0Ctx.this.getDaReportTable();
     BaPrefixVolumeTable baPrefixVolumeTable = Divide0Ctx.this.getBaPrefixVolumeTable();

	/**
	 *	Returns the value of daPercentDisp
	 *	@return daPercentDisp
	 */
   public char[] getDaPercentDisp() throws CFException  {              
   		return work.getDaPercentDisp();
   }

  
	/**
	*  set variable daPercentDisp
	*  @param value
	**/
   public void setDaPercentDisp(char[] value) throws CFException {
      work.setDaPercentDisp(value);
   } 

     /**
	 * 	Update DaPercentDisp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDaPercentDisp(char[] source, int sourceIndex) throws CFException {
      work.setDaPercentDisp(source, sourceIndex);
   	
   }
   
   public void setDaPercentDisp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setDaPercentDisp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DaPercentDisp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDaPercentDisp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setDaPercentDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DaPercentDisp with another Field
	 *	@param value
	 */
   public void setDaPercentDisp(Field source) {
      work.setDaPercentDisp(source);
   }  
   
     /**
	 * 	Update DaPercentDisp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDaPercentDisp(Field source, int sourceIndex,int sourceLen) {
      work.setDaPercentDisp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DaPercentDisp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDaPercentDisp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setDaPercentDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of baVolEntry
	 *	@return baVolEntry
	 */
	public long getBaVolEntry(int index) throws CFException {
   		return baPrefixVolumeTable.getBaVolumeEntry(index).getBaVolEntry();
	}


	/**
	 *	Returns String value of baVolEntry
	 *	@return baVolEntry
	 */
	public char[]  getBaVolEntryString(int index) throws CFException {
	     return String.valueOf(baPrefixVolumeTable.getBaVolumeEntry(index).getBaVolEntryString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean baVolEntryIsNumeric(int index)  throws CFException{
	    return baPrefixVolumeTable.getBaVolumeEntry(index - 1).baVolEntryIsNumeric();
	}

	/**
	 * 	Update BaVolEntry with the passed value
	 *	@param number
	 */
	public void setBaVolEntry(int index,long number)  throws CFException{
		baPrefixVolumeTable.getBaVolumeEntry(index).setBaVolEntry(number);
	}
	

	
	/**
	 * 	Update BaVolEntry with the passed value
	 *	@param value (String or char[])
	 */
	public void setBaVolEntry(int index,char[] value)  throws CFException {
		baPrefixVolumeTable.getBaVolumeEntry(index).setBaVolEntry(value);
	}
	
	/**
	 * 	Update BaVolEntry with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBaVolEntryString(int index,char[] value)  throws CFException{
		baPrefixVolumeTable.getBaVolumeEntry(index).setBaVolEntry(value);
	}	

	/**
	 *	Returns the value of editFld2
	 *	@return editFld2
	 */
   public char[] getEditFld2() throws CFException  {              
   		return work.getEditFld2();
   }

  
	/**
	*  set variable editFld2
	*  @param value
	**/
   public void setEditFld2(char[] value) throws CFException {
      work.setEditFld2(value);
   } 

     /**
	 * 	Update EditFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEditFld2(char[] source, int sourceIndex) throws CFException {
      work.setEditFld2(source, sourceIndex);
   	
   }
   
   public void setEditFld2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setEditFld2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EditFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEditFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setEditFld2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EditFld2 with another Field
	 *	@param value
	 */
   public void setEditFld2(Field source) {
      work.setEditFld2(source);
   }  
   
     /**
	 * 	Update EditFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEditFld2(Field source, int sourceIndex,int sourceLen) {
      work.setEditFld2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EditFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEditFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setEditFld2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of daIx
	 *	@return daIx
	 */
	public int getDaIx() throws CFException {
   		return daReportTable.getDaIx();
	}


	/**
	 *	Returns String value of daIx
	 *	@return daIx
	 */
	public char[]  getDaIxString() throws CFException {
	     return String.valueOf(daReportTable.getDaIxString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean daIxIsNumeric()  throws CFException{
	    return daReportTable.daIxIsNumeric();
	}

	/**
	 * 	Update DaIx with the passed value
	 *	@param number
	 */
	public void setDaIx(int number)  throws CFException{
		daReportTable.setDaIx(number);
	}
	

	public void setDaIx(long number)  throws CFException{
	    daReportTable.setDaIx(number);
	}
	
	
	/**
	 * 	Update DaIx with the passed value
	 *	@param value (String or char[])
	 */
	public void setDaIx(char[] value)  throws CFException {
		daReportTable.setDaIx(value);
	}
	
	/**
	 * 	Update DaIx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDaIxString(char[] value)  throws CFException{
		daReportTable.setDaIx(value);
	}	

	/**
	 *	Returns the value of daPcntHoldDisp
	 *	@return daPcntHoldDisp
	 */
   public char[] getDaPcntHoldDisp() throws CFException  {              
   		return work.getDaPcntHoldDisp();
   }

  
	/**
	*  set variable daPcntHoldDisp
	*  @param value
	**/
   public void setDaPcntHoldDisp(char[] value) throws CFException {
      work.setDaPcntHoldDisp(value);
   } 

     /**
	 * 	Update DaPcntHoldDisp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDaPcntHoldDisp(char[] source, int sourceIndex) throws CFException {
      work.setDaPcntHoldDisp(source, sourceIndex);
   	
   }
   
   public void setDaPcntHoldDisp(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setDaPcntHoldDisp(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DaPcntHoldDisp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDaPcntHoldDisp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setDaPcntHoldDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DaPcntHoldDisp with another Field
	 *	@param value
	 */
   public void setDaPcntHoldDisp(Field source) {
      work.setDaPcntHoldDisp(source);
   }  
   
     /**
	 * 	Update DaPcntHoldDisp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDaPcntHoldDisp(Field source, int sourceIndex,int sourceLen) {
      work.setDaPcntHoldDisp(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DaPcntHoldDisp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDaPcntHoldDisp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setDaPcntHoldDisp(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ip20004ItemLength
	 *	@return ip20004ItemLength
	 */
	public short getIp20004ItemLength() throws CFException {        
   		return work.getIp20004ItemLength();
	}
	
	/**
	 * 	Update Ip20004ItemLength with the passed value
	 *	@param number
	 */
	public void setIp20004ItemLength(short number)  throws CFException{
		work.setIp20004ItemLength(number);
	}

	public void setIp20004ItemLength(int number)  throws CFException{
		work.setIp20004ItemLength((short)number);
	}

	public void setIp20004ItemLength(long number)  throws CFException{
		work.setIp20004ItemLength((short)number);
	}



	/**
	 *	Returns the value of tmpLth800
	 *	@return tmpLth800
	 */
	public short getTmpLth800() throws CFException {        
   		return work.getTmpLth800();
	}
	
	/**
	 * 	Update TmpLth800 with the passed value
	 *	@param number
	 */
	public void setTmpLth800(short number)  throws CFException{
		work.setTmpLth800(number);
	}

	public void setTmpLth800(int number)  throws CFException{
		work.setTmpLth800((short)number);
	}

	public void setTmpLth800(long number)  throws CFException{
		work.setTmpLth800((short)number);
	}



	/**
	 *	Returns the value of editFld1
	 *	@return editFld1
	 */
   public char[] getEditFld1() throws CFException  {              
   		return work.getEditFld1();
   }

  
	/**
	*  set variable editFld1
	*  @param value
	**/
   public void setEditFld1(char[] value) throws CFException {
      work.setEditFld1(value);
   } 

     /**
	 * 	Update EditFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEditFld1(char[] source, int sourceIndex) throws CFException {
      work.setEditFld1(source, sourceIndex);
   	
   }
   
   public void setEditFld1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setEditFld1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EditFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEditFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setEditFld1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EditFld1 with another Field
	 *	@param value
	 */
   public void setEditFld1(Field source) {
      work.setEditFld1(source);
   }  
   
     /**
	 * 	Update EditFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEditFld1(Field source, int sourceIndex,int sourceLen) {
      work.setEditFld1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EditFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEditFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setEditFld1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of daPcntHold
	 *	@return daPcntHold
	 */
	public BigDecimal getDaPcntHold() throws CFException {
   		return daReportTable.getDaPcntHold();
	}


	 /**
     *	Returns String value of daPcntHold
     *	@return daPcntHold
     */
    public char[]  getDaPcntHoldString() throws CFException {
         return daReportTable.getDaPcntHoldString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean daPcntHoldIsNumeric() {
        return daReportTable.daPcntHoldIsNumeric();
    }
	/**
	 * 	Update DaPcntHold with the passed number
	 *	@param number
	 */
	public void setDaPcntHold(BigDecimal number)  throws CFException{
		daReportTable.setDaPcntHold(number);
   }

	/**
	 * 	Update DaPcntHold with the passed value
	 *	@param value (String or char[]);
	 */
	public void setDaPcntHold(char[] value)  throws CFException{
		daReportTable.setDaPcntHold(value);
	}   

	/**
	 *	Returns the value of daPercent
	 *	@return daPercent
	 */
	public BigDecimal getDaPercent(int index) throws CFException {
   		return daReportTable.getDaTblEntries(index).getDaPercent();
	}


	 /**
     *	Returns String value of daPercent
     *	@return daPercent
     */
    public char[]  getDaPercentString(int index) throws CFException {
         return daReportTable.getDaTblEntries(index).getDaPercentString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean daPercentIsNumeric(int index) {
        return daReportTable.getDaTblEntries(index - 1).daPercentIsNumeric();
    }
	/**
	 * 	Update DaPercent with the passed number
	 *	@param number
	 */
	public void setDaPercent(int index,BigDecimal number)  throws CFException{
		daReportTable.getDaTblEntries(index).setDaPercent(number);
   }

	/**
	 * 	Update DaPercent with the passed value
	 *	@param value (String or char[]);
	 */
	public void setDaPercent(int index,char[] value)  throws CFException{
		daReportTable.getDaTblEntries(index).setDaPercent(value);
	}   

	/**
	 *	Returns the value of daSub
	 *	@return daSub
	 */
	public int getDaSub() throws CFException {
   		return daReportTable.getDaSub();
	}


	/**
	 *	Returns String value of daSub
	 *	@return daSub
	 */
	public char[]  getDaSubString() throws CFException {
	     return String.valueOf(daReportTable.getDaSubString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean daSubIsNumeric()  throws CFException{
	    return daReportTable.daSubIsNumeric();
	}

	/**
	 * 	Update DaSub with the passed value
	 *	@param number
	 */
	public void setDaSub(int number)  throws CFException{
		daReportTable.setDaSub(number);
	}
	

	public void setDaSub(long number)  throws CFException{
	    daReportTable.setDaSub(number);
	}
	
	
	/**
	 * 	Update DaSub with the passed value
	 *	@param value (String or char[])
	 */
	public void setDaSub(char[] value)  throws CFException {
		daReportTable.setDaSub(value);
	}
	
	/**
	 * 	Update DaSub with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDaSubString(char[] value)  throws CFException{
		daReportTable.setDaSub(value);
	}	

	/**
	 *	Returns the value of fbTotalVolume
	 *	@return fbTotalVolume
	 */
	public long getFbTotalVolume() throws CFException {
   		return work.getFbTotalVolume();
	}


	/**
	 *	Returns String value of fbTotalVolume
	 *	@return fbTotalVolume
	 */
	public char[]  getFbTotalVolumeString() throws CFException {
	     return String.valueOf(work.getFbTotalVolumeString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean fbTotalVolumeIsNumeric()  throws CFException{
	    return work.fbTotalVolumeIsNumeric();
	}

	/**
	 * 	Update FbTotalVolume with the passed value
	 *	@param number
	 */
	public void setFbTotalVolume(long number)  throws CFException{
		work.setFbTotalVolume(number);
	}
	

	
	/**
	 * 	Update FbTotalVolume with the passed value
	 *	@param value (String or char[])
	 */
	public void setFbTotalVolume(char[] value)  throws CFException {
		work.setFbTotalVolume(value);
	}
	
	/**
	 * 	Update FbTotalVolume with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFbTotalVolumeString(char[] value)  throws CFException{
		work.setFbTotalVolume(value);
	}	

	public BigDecimal getDecimal() throws CFException{      
   		return work.getDecimal();
	}

    public char[] getDecimalString() throws CFException {
          return  work.getDecimal().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Decimal with the passed number
	 *	@param number
	 */
	public void setDecimal(BigDecimal number)  throws CFException{
		work.setDecimal(number);
   }


        public Divide0Ctx getDivide0Ctx() {
            return Divide0Ctx.this;
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
        str += daReportTable.hashCode();
        str += baPrefixVolumeTable.hashCode();
       return str.hashCode();
    }

    public MainlineSplit0OutCtx clone() {
        MainlineSplit0OutCtx cloneObj = new MainlineSplit0OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.daReportTable = new DaReportTable();
        cloneObj.daReportTable.set(daReportTable.getClonedField());
        cloneObj.baPrefixVolumeTable = new BaPrefixVolumeTable();
        cloneObj.baPrefixVolumeTable.set(baPrefixVolumeTable.getClonedField());
        return cloneObj;
    }

    }

    public MainlineSplit0OutCtx getMainlineSplit0OutCtx() {
            return new MainlineSplit0OutCtx();
    }
     public class MainlineSplit1OutCtx implements Cloneable {
     Work work = Divide0Ctx.this.getWork();

	/**
	 *	Returns the value of editFld2
	 *	@return editFld2
	 */
   public char[] getEditFld2() throws CFException  {              
   		return work.getEditFld2();
   }

  
	/**
	*  set variable editFld2
	*  @param value
	**/
   public void setEditFld2(char[] value) throws CFException {
      work.setEditFld2(value);
   } 

     /**
	 * 	Update EditFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEditFld2(char[] source, int sourceIndex) throws CFException {
      work.setEditFld2(source, sourceIndex);
   	
   }
   
   public void setEditFld2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setEditFld2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update EditFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEditFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setEditFld2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update EditFld2 with another Field
	 *	@param value
	 */
   public void setEditFld2(Field source) {
      work.setEditFld2(source);
   }  
   
     /**
	 * 	Update EditFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEditFld2(Field source, int sourceIndex,int sourceLen) {
      work.setEditFld2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update EditFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEditFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setEditFld2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getDecimal() throws CFException{      
   		return work.getDecimal();
	}

    public char[] getDecimalString() throws CFException {
          return  work.getDecimal().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Decimal with the passed number
	 *	@param number
	 */
	public void setDecimal(BigDecimal number)  throws CFException{
		work.setDecimal(number);
   }


        public Divide0Ctx getDivide0Ctx() {
            return Divide0Ctx.this;
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
       return str.hashCode();
    }

    public MainlineSplit1OutCtx clone() {
        MainlineSplit1OutCtx cloneObj = new MainlineSplit1OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineSplit1OutCtx getMainlineSplit1OutCtx() {
            return new MainlineSplit1OutCtx();
    }
}
