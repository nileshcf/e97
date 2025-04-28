package com.cloudframe.app.edjaddrs;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.edjaddrs.dto.Work;
import com.cloudframe.app.edjaddrs.dto.GenericTotal;
import com.cloudframe.app.edjaddrs.dto.RecordCheckTbl;
import com.cloudframe.app.edjaddrs.dto.RctMinComp3Group;


@Context
public class EdjaddrsCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    RecordCheckTbl recordCheckTbl;
    Work work;
    GenericTotal genericTotal;


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


    public RecordCheckTbl getRecordCheckTbl() {
        if (recordCheckTbl == null) {
            recordCheckTbl = new RecordCheckTbl();
        }

        return recordCheckTbl;
    }

    public void setRecordCheckTbl(RecordCheckTbl recordCheckTbl) {
        this.recordCheckTbl = recordCheckTbl;
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
    public GenericTotal getGenericTotal() {
        if (genericTotal == null) {
            genericTotal = new GenericTotal();
        }

        return genericTotal;
    }

    public void setGenericTotal(GenericTotal genericTotal) {
        this.genericTotal = genericTotal;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += recordCheckTbl.hashCode();
        str += work.hashCode();
        str += genericTotal.hashCode();
       return str.hashCode();
    }

    public EdjaddrsCtx clone() {
        EdjaddrsCtx cloneObj = new EdjaddrsCtx();
        cloneObj.recordCheckTbl = new RecordCheckTbl();
        cloneObj.recordCheckTbl.set(recordCheckTbl.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.genericTotal = new GenericTotal();
        cloneObj.genericTotal.set(genericTotal.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainlineInCtx implements Cloneable {
     RecordCheckTbl recordCheckTbl = EdjaddrsCtx.this.getRecordCheckTbl();
     Work work = EdjaddrsCtx.this.getWork();
     GenericTotal genericTotal = EdjaddrsCtx.this.getGenericTotal();

	/**
	 *	Returns the value of rctMinComp3Group
	 *	@return rctMinComp3Group
	 */   
	 public RctMinComp3Group getRctMinComp3Group(int index) {
   	return recordCheckTbl.getRctTblEntry(index).getRctHdrOrTrlAkaHotInfo().getRctMinComp3Group();
   }

   /**
	* 	Update RctMinComp3Group with the passed value
	*	@param value
	*/
   public void setRctMinComp3Group(int index,char[] value) throws CFException {
      recordCheckTbl.getRctTblEntry(index).getRctHdrOrTrlAkaHotInfo().setRctMinComp3Group(value);
   }   

     /**
	 * 	Update RctMinComp3Group 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRctMinComp3Group(int index,char[] source, int sourceIndex,int sourceLen) throws CFException {
   	recordCheckTbl.getRctTblEntry(index).getRctHdrOrTrlAkaHotInfo().setRctMinComp3Group(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RctMinComp3Group 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRctMinComp3Group(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	recordCheckTbl.getRctTblEntry(index).getRctHdrOrTrlAkaHotInfo().setRctMinComp3Group(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RctMinComp3Group with another Field
	 *	@param value
	 */
   public void setRctMinComp3Group(int index,Field source) {
   	recordCheckTbl.getRctTblEntry(index).getRctHdrOrTrlAkaHotInfo().setRctMinComp3Group(source);
   }  
   
     /**
	 * 	Update RctMinComp3Group 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRctMinComp3Group(int index,Field source, int sourceIndex,int sourceLen) {
   	recordCheckTbl.getRctTblEntry(index).getRctHdrOrTrlAkaHotInfo().setRctMinComp3Group(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RctMinComp3Group 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRctMinComp3Group(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	recordCheckTbl.getRctTblEntry(index).getRctHdrOrTrlAkaHotInfo().setRctMinComp3Group(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of cce
	 *	@return cce
	 */
	public int getCce() throws CFException {
   		return work.getCce();
	}


	/**
	 *	Returns String value of cce
	 *	@return cce
	 */
	public char[]  getCceString() throws CFException {
	     return String.valueOf(work.getCceString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cceIsNumeric()  throws CFException{
	    return work.cceIsNumeric();
	}

	/**
	 * 	Update Cce with the passed value
	 *	@param number
	 */
	public void setCce(int number)  throws CFException{
		work.setCce(number);
	}
	

	public void setCce(long number)  throws CFException{
	    work.setCce(number);
	}
	
	
	/**
	 * 	Update Cce with the passed value
	 *	@param value (String or char[])
	 */
	public void setCce(char[] value)  throws CFException {
		work.setCce(value);
	}
	
	/**
	 * 	Update Cce with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCceString(char[] value)  throws CFException{
		work.setCce(value);
	}	

	/**
	 *	Returns the value of genericTotal
	 *	@return genericTotal
	 */   
	 public GenericTotal getGenericTotal() {
   	return genericTotal;
   }



        public EdjaddrsCtx getEdjaddrsCtx() {
            return EdjaddrsCtx.this;
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
        str += recordCheckTbl.hashCode();
        str += work.hashCode();
        str += genericTotal.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.recordCheckTbl = new RecordCheckTbl();
        cloneObj.recordCheckTbl.set(recordCheckTbl.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.genericTotal = new GenericTotal();
        cloneObj.genericTotal.set(genericTotal.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     RecordCheckTbl recordCheckTbl = EdjaddrsCtx.this.getRecordCheckTbl();
     Work work = EdjaddrsCtx.this.getWork();
     GenericTotal genericTotal = EdjaddrsCtx.this.getGenericTotal();

public long getScomp3Total() throws CFException {  
        return genericTotal.getScomp3Total();
}
	/**
	 * 	Update Scomp3Total with the passed value
	 *	@param number
	 */
	public void setScomp3Total(long number)  throws CFException{
		genericTotal.setScomp3Total(number);
	}



	/**
	 *	Returns the value of numericZs
	 *	@return numericZs
	 */
   public char[] getNumericZs() throws CFException  {              
   		return work.getNumericZs();
   }

  
	/**
	*  set variable numericZs
	*  @param value
	**/
   public void setNumericZs(char[] value) throws CFException {
      work.setNumericZs(value);
   } 

     /**
	 * 	Update NumericZs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNumericZs(char[] source, int sourceIndex) throws CFException {
      work.setNumericZs(source, sourceIndex);
   	
   }
   
   public void setNumericZs(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setNumericZs(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update NumericZs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNumericZs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setNumericZs(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update NumericZs with another Field
	 *	@param value
	 */
   public void setNumericZs(Field source) {
      work.setNumericZs(source);
   }  
   
     /**
	 * 	Update NumericZs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNumericZs(Field source, int sourceIndex,int sourceLen) {
      work.setNumericZs(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update NumericZs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNumericZs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setNumericZs(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of cce
	 *	@return cce
	 */
	public int getCce() throws CFException {
   		return work.getCce();
	}


	/**
	 *	Returns String value of cce
	 *	@return cce
	 */
	public char[]  getCceString() throws CFException {
	     return String.valueOf(work.getCceString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cceIsNumeric()  throws CFException{
	    return work.cceIsNumeric();
	}

	/**
	 * 	Update Cce with the passed value
	 *	@param number
	 */
	public void setCce(int number)  throws CFException{
		work.setCce(number);
	}
	

	public void setCce(long number)  throws CFException{
	    work.setCce(number);
	}
	
	
	/**
	 * 	Update Cce with the passed value
	 *	@param value (String or char[])
	 */
	public void setCce(char[] value)  throws CFException {
		work.setCce(value);
	}
	
	/**
	 * 	Update Cce with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCceString(char[] value)  throws CFException{
		work.setCce(value);
	}	

public long getRctMinComp3(int index) throws CFException {  
        return recordCheckTbl.getRctTblEntry(index).getRctHdrOrTrlAkaHotInfo().getRctMinComp3Group().getRctMinComp3();
}
	/**
	 * 	Update RctMinComp3 with the passed value
	 *	@param number
	 */
	public void setRctMinComp3(int index,long number)  throws CFException{
		recordCheckTbl.getRctTblEntry(index).getRctHdrOrTrlAkaHotInfo().getRctMinComp3Group().setRctMinComp3(number);
	}



	/**
	 *	Returns the value of genericTotal
	 *	@return genericTotal
	 */   
	 public GenericTotal getGenericTotal() {
   	return genericTotal;
   }



        public EdjaddrsCtx getEdjaddrsCtx() {
            return EdjaddrsCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += recordCheckTbl.hashCode();
        str += work.hashCode();
        str += genericTotal.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.recordCheckTbl = new RecordCheckTbl();
        cloneObj.recordCheckTbl.set(recordCheckTbl.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.genericTotal = new GenericTotal();
        cloneObj.genericTotal.set(genericTotal.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
}
