package com.cloudframe.app.search0;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.search0.dto.Summary;
import com.cloudframe.app.search0.dto.WtCodeCtrl;
import com.cloudframe.app.search0.dto.SummarySubldgEntries;
import com.cloudframe.app.search0.dto.SecondNumberGroup;
import com.cloudframe.app.search0.dto.FirstNumberGroup;
import com.cloudframe.app.search0.dto.Work;
import com.cloudframe.app.search0.dto.WtFields;
import com.cloudframe.app.search0.dto.ResultNumberGroup;


@Context
public class Search0Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    SecondNumberGroup secondNumberGroup;
    WtFields wtFields;
    ResultNumberGroup resultNumberGroup;
    Work work;
    Summary summary;
    FirstNumberGroup firstNumberGroup;

    int summarySubldgIndex;
    int wtCodeCtrlIndex;

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


    public SecondNumberGroup getSecondNumberGroup() {
        if (secondNumberGroup == null) {
            secondNumberGroup = new SecondNumberGroup();
        }

        return secondNumberGroup;
    }

    public void setSecondNumberGroup(SecondNumberGroup secondNumberGroup) {
        this.secondNumberGroup = secondNumberGroup;
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
    public ResultNumberGroup getResultNumberGroup() {
        if (resultNumberGroup == null) {
            resultNumberGroup = new ResultNumberGroup();
        }

        return resultNumberGroup;
    }

    public void setResultNumberGroup(ResultNumberGroup resultNumberGroup) {
        this.resultNumberGroup = resultNumberGroup;
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
    public Summary getSummary() {
        if (summary == null) {
            summary = new Summary();
        }

        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }
    public FirstNumberGroup getFirstNumberGroup() {
        if (firstNumberGroup == null) {
            firstNumberGroup = new FirstNumberGroup();
        }

        return firstNumberGroup;
    }

    public void setFirstNumberGroup(FirstNumberGroup firstNumberGroup) {
        this.firstNumberGroup = firstNumberGroup;
    }

    public int getSummarySubldgIndex() {
        return summarySubldgIndex;
    }

    public void setSummarySubldgIndex(int summarySubldgIndex) {
        this.summarySubldgIndex = summarySubldgIndex;
    }
    public int getWtCodeCtrlIndex() {
        return wtCodeCtrlIndex;
    }

    public void setWtCodeCtrlIndex(int wtCodeCtrlIndex) {
        this.wtCodeCtrlIndex = wtCodeCtrlIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += secondNumberGroup.hashCode();
        str += wtFields.hashCode();
        str += resultNumberGroup.hashCode();
        str += work.hashCode();
        str += summary.hashCode();
        str += firstNumberGroup.hashCode();
       return str.hashCode();
    }

    public Search0Ctx clone() {
        Search0Ctx cloneObj = new Search0Ctx();
        cloneObj.secondNumberGroup = new SecondNumberGroup();
        cloneObj.secondNumberGroup.set(secondNumberGroup.getClonedField());
        cloneObj.wtFields = new WtFields();
        cloneObj.wtFields.set(wtFields.getClonedField());
        cloneObj.resultNumberGroup = new ResultNumberGroup();
        cloneObj.resultNumberGroup.set(resultNumberGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.summary = new Summary();
        cloneObj.summary.set(summary.getClonedField());
        cloneObj.firstNumberGroup = new FirstNumberGroup();
        cloneObj.firstNumberGroup.set(firstNumberGroup.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     SecondNumberGroup secondNumberGroup = Search0Ctx.this.getSecondNumberGroup();
     WtFields wtFields = Search0Ctx.this.getWtFields();
     ResultNumberGroup resultNumberGroup = Search0Ctx.this.getResultNumberGroup();
     Work work = Search0Ctx.this.getWork();
     Summary summary = Search0Ctx.this.getSummary();
     FirstNumberGroup firstNumberGroup = Search0Ctx.this.getFirstNumberGroup();


        public Search0Ctx getSearch0Ctx() {
            return Search0Ctx.this;
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
        str += secondNumberGroup.hashCode();
        str += wtFields.hashCode();
        str += resultNumberGroup.hashCode();
        str += work.hashCode();
        str += summary.hashCode();
        str += firstNumberGroup.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.secondNumberGroup = new SecondNumberGroup();
        cloneObj.secondNumberGroup.set(secondNumberGroup.getClonedField());
        cloneObj.wtFields = new WtFields();
        cloneObj.wtFields.set(wtFields.getClonedField());
        cloneObj.resultNumberGroup = new ResultNumberGroup();
        cloneObj.resultNumberGroup.set(resultNumberGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.summary = new Summary();
        cloneObj.summary.set(summary.getClonedField());
        cloneObj.firstNumberGroup = new FirstNumberGroup();
        cloneObj.firstNumberGroup.set(firstNumberGroup.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessOutCtx implements Cloneable {
     WtFields wtFields = Search0Ctx.this.getWtFields();
     Work work = Search0Ctx.this.getWork();
     Summary summary = Search0Ctx.this.getSummary();

	/**
	 *	Returns the value of summaryFinEvntNo
	 *	@return summaryFinEvntNo
	 */
	public int getSummaryFinEvntNo(int index) throws CFException {        
   		return summary.getSummarySubldgEntries(index).getSummaryFinEvntNo();
	}
	
	/**
	 * 	Update SummaryFinEvntNo with the passed value
	 *	@param number
	 */
	public void setSummaryFinEvntNo(int index,int number)  throws CFException{
		summary.getSummarySubldgEntries(index).setSummaryFinEvntNo(number);
	}


	public void setSummaryFinEvntNo(int index,long number)  throws CFException{
		summary.getSummarySubldgEntries(index).setSummaryFinEvntNo((int)number);
	}


	/**
	 *	Returns the value of finShortCategory
	 *	@return finShortCategory
	 */
	public short getFinShortCategory() throws CFException {        
   		return work.getFinShortCategory();
	}
	
	/**
	 * 	Update FinShortCategory with the passed value
	 *	@param number
	 */
	public void setFinShortCategory(short number)  throws CFException{
		work.setFinShortCategory(number);
	}

	public void setFinShortCategory(int number)  throws CFException{
		work.setFinShortCategory((short)number);
	}

	public void setFinShortCategory(long number)  throws CFException{
		work.setFinShortCategory((short)number);
	}



	/**
	 *	Returns the value of financialCategory
	 *	@return financialCategory
	 */
	public int getFinancialCategory() throws CFException {        
   		return work.getFinancialCategory();
	}
	
	/**
	 * 	Update FinancialCategory with the passed value
	 *	@param number
	 */
	public void setFinancialCategory(int number)  throws CFException{
		work.setFinancialCategory(number);
	}


	public void setFinancialCategory(long number)  throws CFException{
		work.setFinancialCategory((int)number);
	}


	/**
	 *	Returns the value of tb05323FinEvntNo
	 *	@return tb05323FinEvntNo
	 */
	public long getTb05323FinEvntNo() throws CFException {        
   		return work.getTb05323FinEvntNo();
	}
	
	/**
	 * 	Update Tb05323FinEvntNo with the passed value
	 *	@param number
	 */
	public void setTb05323FinEvntNo(long number)  throws CFException{
		work.setTb05323FinEvntNo(number);
	}



	/**
	 *	Returns the value of codeValue
	 *	@return codeValue
	 */
   public char[] getCodeValue(int index) throws CFException  {              
   		return wtFields.getWtCodeCtrl(index).getCodeValue();
   }

  
	/**
	*  set variable codeValue
	*  @param value
	**/
   public void setCodeValue(int index,char[] value) throws CFException {
      wtFields.getWtCodeCtrl(index).setCodeValue(value);
   } 

     /**
	 * 	Update CodeValue 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCodeValue(int index,char[] source, int sourceIndex) throws CFException {
      wtFields.getWtCodeCtrl(index).setCodeValue(source, sourceIndex);
   	
   }
   
   public void setCodeValue(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wtFields.getWtCodeCtrl(index).setCodeValue(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CodeValue 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCodeValue(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wtFields.getWtCodeCtrl(index).setCodeValue(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CodeValue with another Field
	 *	@param value
	 */
   public void setCodeValue(int index,Field source) {
      wtFields.getWtCodeCtrl(index).setCodeValue(source);
   }  
   
     /**
	 * 	Update CodeValue 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCodeValue(int index,Field source, int sourceIndex,int sourceLen) {
      wtFields.getWtCodeCtrl(index).setCodeValue(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CodeValue 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCodeValue(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wtFields.getWtCodeCtrl(index).setCodeValue(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of summaryFinCat
	 *	@return summaryFinCat
	 */
	public int getSummaryFinCat(int index) throws CFException {        
   		return summary.getSummarySubldgEntries(index).getSummaryFinCat();
	}
	
	/**
	 * 	Update SummaryFinCat with the passed value
	 *	@param number
	 */
	public void setSummaryFinCat(int index,int number)  throws CFException{
		summary.getSummarySubldgEntries(index).setSummaryFinCat(number);
	}


	public void setSummaryFinCat(int index,long number)  throws CFException{
		summary.getSummarySubldgEntries(index).setSummaryFinCat((int)number);
	}


	/**
	 *	Returns the value of search
	 *	@return search
	 */
   public char[] getSearch() throws CFException  {              
   		return work.getSearch();
   }

  
	/**
	*  set variable search
	*  @param value
	**/
   public void setSearch(char[] value) throws CFException {
      work.setSearch(value);
   } 

	/**
	 *	Returns the value of codeDesc
	 *	@return codeDesc
	 */
   public char[] getCodeDesc(int index) throws CFException  {              
   		return wtFields.getWtCodeCtrl(index).getCodeDesc();
   }

  
	/**
	*  set variable codeDesc
	*  @param value
	**/
   public void setCodeDesc(int index,char[] value) throws CFException {
      wtFields.getWtCodeCtrl(index).setCodeDesc(value);
   } 

     /**
	 * 	Update CodeDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCodeDesc(int index,char[] source, int sourceIndex) throws CFException {
      wtFields.getWtCodeCtrl(index).setCodeDesc(source, sourceIndex);
   	
   }
   
   public void setCodeDesc(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wtFields.getWtCodeCtrl(index).setCodeDesc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CodeDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCodeDesc(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wtFields.getWtCodeCtrl(index).setCodeDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CodeDesc with another Field
	 *	@param value
	 */
   public void setCodeDesc(int index,Field source) {
      wtFields.getWtCodeCtrl(index).setCodeDesc(source);
   }  
   
     /**
	 * 	Update CodeDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCodeDesc(int index,Field source, int sourceIndex,int sourceLen) {
      wtFields.getWtCodeCtrl(index).setCodeDesc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CodeDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCodeDesc(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wtFields.getWtCodeCtrl(index).setCodeDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tb05323FinMktId
	 *	@return tb05323FinMktId
	 */
   public char[] getTb05323FinMktId() throws CFException  {              
   		return work.getTb05323FinMktId();
   }

  
	/**
	*  set variable tb05323FinMktId
	*  @param value
	**/
   public void setTb05323FinMktId(char[] value) throws CFException {
      work.setTb05323FinMktId(value);
   } 

	/**
	 *	Returns the value of summaryFinMktId
	 *	@return summaryFinMktId
	 */
   public char[] getSummaryFinMktId(int index) throws CFException  {              
   		return summary.getSummarySubldgEntries(index).getSummaryFinMktId();
   }

  
	/**
	*  set variable summaryFinMktId
	*  @param value
	**/
   public void setSummaryFinMktId(int index,char[] value) throws CFException {
      summary.getSummarySubldgEntries(index).setSummaryFinMktId(value);
   } 

     /**
	 * 	Update SummaryFinMktId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSummaryFinMktId(int index,char[] source, int sourceIndex) throws CFException {
      summary.getSummarySubldgEntries(index).setSummaryFinMktId(source, sourceIndex);
   	
   }
   
   public void setSummaryFinMktId(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      summary.getSummarySubldgEntries(index).setSummaryFinMktId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SummaryFinMktId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSummaryFinMktId(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      summary.getSummarySubldgEntries(index).setSummaryFinMktId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SummaryFinMktId with another Field
	 *	@param value
	 */
   public void setSummaryFinMktId(int index,Field source) {
      summary.getSummarySubldgEntries(index).setSummaryFinMktId(source);
   }  
   
     /**
	 * 	Update SummaryFinMktId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSummaryFinMktId(int index,Field source, int sourceIndex,int sourceLen) {
      summary.getSummarySubldgEntries(index).setSummaryFinMktId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SummaryFinMktId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSummaryFinMktId(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      summary.getSummarySubldgEntries(index).setSummaryFinMktId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Search0Ctx getSearch0Ctx() {
            return Search0Ctx.this;
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
        str += summary.hashCode();
       return str.hashCode();
    }

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.wtFields = new WtFields();
        cloneObj.wtFields.set(wtFields.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.summary = new Summary();
        cloneObj.summary.set(summary.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
     public class SearchInCtx implements Cloneable {
     Work work = Search0Ctx.this.getWork();
     Summary summary = Search0Ctx.this.getSummary();

	/**
	 *	Returns the value of summaryFinEvntNo
	 *	@return summaryFinEvntNo
	 */
	public int getSummaryFinEvntNo(int index) throws CFException {        
   		return summary.getSummarySubldgEntries(index).getSummaryFinEvntNo();
	}
	
	/**
	 * 	Update SummaryFinEvntNo with the passed value
	 *	@param number
	 */
	public void setSummaryFinEvntNo(int index,int number)  throws CFException{
		summary.getSummarySubldgEntries(index).setSummaryFinEvntNo(number);
	}


	public void setSummaryFinEvntNo(int index,long number)  throws CFException{
		summary.getSummarySubldgEntries(index).setSummaryFinEvntNo((int)number);
	}


	/**
	 *	Returns the value of financialCategory
	 *	@return financialCategory
	 */
	public int getFinancialCategory() throws CFException {        
   		return work.getFinancialCategory();
	}
	
	/**
	 * 	Update FinancialCategory with the passed value
	 *	@param number
	 */
	public void setFinancialCategory(int number)  throws CFException{
		work.setFinancialCategory(number);
	}


	public void setFinancialCategory(long number)  throws CFException{
		work.setFinancialCategory((int)number);
	}


	/**
	 *	Returns the value of summarySubldgMaxCntr
	 *	@return summarySubldgMaxCntr
	 */
	public int getSummarySubldgMaxCntr() throws CFException {        
   		return summary.getSummarySubldgMaxCntr();
	}
	
	/**
	 * 	Update SummarySubldgMaxCntr with the passed value
	 *	@param number
	 */
	public void setSummarySubldgMaxCntr(int number)  throws CFException{
		summary.setSummarySubldgMaxCntr(number);
	}


	public void setSummarySubldgMaxCntr(long number)  throws CFException{
		summary.setSummarySubldgMaxCntr((int)number);
	}



public void setSummarySubldgIndex(int summarySubldgIndex) { 
    Search0Ctx.this.summarySubldgIndex = summarySubldgIndex;
}

public int getSummarySubldgIndex() { 
    return Search0Ctx.this.summarySubldgIndex;
}
	/**
	 *	Returns the value of tb05323FinEvntNo
	 *	@return tb05323FinEvntNo
	 */
	public long getTb05323FinEvntNo() throws CFException {        
   		return work.getTb05323FinEvntNo();
	}
	
	/**
	 * 	Update Tb05323FinEvntNo with the passed value
	 *	@param number
	 */
	public void setTb05323FinEvntNo(long number)  throws CFException{
		work.setTb05323FinEvntNo(number);
	}



	/**
	 *	Returns the value of summaryFinCat
	 *	@return summaryFinCat
	 */
	public int getSummaryFinCat(int index) throws CFException {        
   		return summary.getSummarySubldgEntries(index).getSummaryFinCat();
	}
	
	/**
	 * 	Update SummaryFinCat with the passed value
	 *	@param number
	 */
	public void setSummaryFinCat(int index,int number)  throws CFException{
		summary.getSummarySubldgEntries(index).setSummaryFinCat(number);
	}


	public void setSummaryFinCat(int index,long number)  throws CFException{
		summary.getSummarySubldgEntries(index).setSummaryFinCat((int)number);
	}


	/**
	 *	Returns the value of summary
	 *	@return summary
	 */   
	 public Summary getSummary() {
   	return summary;
   }


	/**
	 *	Returns the value of tb05323FinMktId
	 *	@return tb05323FinMktId
	 */
   public char[] getTb05323FinMktId() throws CFException  {              
   		return work.getTb05323FinMktId();
   }

  
	/**
	*  set variable tb05323FinMktId
	*  @param value
	**/
   public void setTb05323FinMktId(char[] value) throws CFException {
      work.setTb05323FinMktId(value);
   } 

	/**
	 *	Returns the value of summaryFinMktId
	 *	@return summaryFinMktId
	 */
   public char[] getSummaryFinMktId(int index) throws CFException  {              
   		return summary.getSummarySubldgEntries(index).getSummaryFinMktId();
   }

  
	/**
	*  set variable summaryFinMktId
	*  @param value
	**/
   public void setSummaryFinMktId(int index,char[] value) throws CFException {
      summary.getSummarySubldgEntries(index).setSummaryFinMktId(value);
   } 

     /**
	 * 	Update SummaryFinMktId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSummaryFinMktId(int index,char[] source, int sourceIndex) throws CFException {
      summary.getSummarySubldgEntries(index).setSummaryFinMktId(source, sourceIndex);
   	
   }
   
   public void setSummaryFinMktId(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      summary.getSummarySubldgEntries(index).setSummaryFinMktId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SummaryFinMktId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSummaryFinMktId(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      summary.getSummarySubldgEntries(index).setSummaryFinMktId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SummaryFinMktId with another Field
	 *	@param value
	 */
   public void setSummaryFinMktId(int index,Field source) {
      summary.getSummarySubldgEntries(index).setSummaryFinMktId(source);
   }  
   
     /**
	 * 	Update SummaryFinMktId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSummaryFinMktId(int index,Field source, int sourceIndex,int sourceLen) {
      summary.getSummarySubldgEntries(index).setSummaryFinMktId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SummaryFinMktId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSummaryFinMktId(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      summary.getSummarySubldgEntries(index).setSummaryFinMktId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of summarySubldgEntries
	 *	@return summarySubldgEntries
	 */   
	 public SummarySubldgEntries getSummarySubldgEntries(int index) {
   	return summary.getSummarySubldgEntries(index);
   }

    public List<SummarySubldgEntries> getSummarySubldgEntries() {
        return summary.getSummarySubldgEntries();
    }
   /**
	* 	Update SummarySubldgEntries with the passed value
	*	@param value
	*/
   public void setSummarySubldgEntries(int index,char[] value) throws CFException {
      summary.setSummarySubldgEntries((index),value);
   }   



        public Search0Ctx getSearch0Ctx() {
            return Search0Ctx.this;
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
        str += summary.hashCode();
       return str.hashCode();
    }

    public SearchInCtx clone() {
        SearchInCtx cloneObj = new SearchInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.summary = new Summary();
        cloneObj.summary.set(summary.getClonedField());
        return cloneObj;
    }

    }

    public SearchInCtx getSearchInCtx() {
            return new SearchInCtx();
    }
     public class Search0110InCtx implements Cloneable {
     Work work = Search0Ctx.this.getWork();
     Summary summary = Search0Ctx.this.getSummary();

	/**
	 *	Returns the value of summaryFinEvntNo
	 *	@return summaryFinEvntNo
	 */
	public int getSummaryFinEvntNo(int index) throws CFException {        
   		return summary.getSummarySubldgEntries(index).getSummaryFinEvntNo();
	}
	
	/**
	 * 	Update SummaryFinEvntNo with the passed value
	 *	@param number
	 */
	public void setSummaryFinEvntNo(int index,int number)  throws CFException{
		summary.getSummarySubldgEntries(index).setSummaryFinEvntNo(number);
	}


	public void setSummaryFinEvntNo(int index,long number)  throws CFException{
		summary.getSummarySubldgEntries(index).setSummaryFinEvntNo((int)number);
	}


	/**
	 *	Returns the value of finShortCategory
	 *	@return finShortCategory
	 */
	public short getFinShortCategory() throws CFException {        
   		return work.getFinShortCategory();
	}
	
	/**
	 * 	Update FinShortCategory with the passed value
	 *	@param number
	 */
	public void setFinShortCategory(short number)  throws CFException{
		work.setFinShortCategory(number);
	}

	public void setFinShortCategory(int number)  throws CFException{
		work.setFinShortCategory((short)number);
	}

	public void setFinShortCategory(long number)  throws CFException{
		work.setFinShortCategory((short)number);
	}



	/**
	 *	Returns the value of summarySubldgMaxCntr
	 *	@return summarySubldgMaxCntr
	 */
	public int getSummarySubldgMaxCntr() throws CFException {        
   		return summary.getSummarySubldgMaxCntr();
	}
	
	/**
	 * 	Update SummarySubldgMaxCntr with the passed value
	 *	@param number
	 */
	public void setSummarySubldgMaxCntr(int number)  throws CFException{
		summary.setSummarySubldgMaxCntr(number);
	}


	public void setSummarySubldgMaxCntr(long number)  throws CFException{
		summary.setSummarySubldgMaxCntr((int)number);
	}



public void setSummarySubldgIndex(int summarySubldgIndex) { 
    Search0Ctx.this.summarySubldgIndex = summarySubldgIndex;
}

public int getSummarySubldgIndex() { 
    return Search0Ctx.this.summarySubldgIndex;
}
	/**
	 *	Returns the value of tb05323FinEvntNo
	 *	@return tb05323FinEvntNo
	 */
	public long getTb05323FinEvntNo() throws CFException {        
   		return work.getTb05323FinEvntNo();
	}
	
	/**
	 * 	Update Tb05323FinEvntNo with the passed value
	 *	@param number
	 */
	public void setTb05323FinEvntNo(long number)  throws CFException{
		work.setTb05323FinEvntNo(number);
	}



	/**
	 *	Returns the value of summaryFinCat
	 *	@return summaryFinCat
	 */
	public int getSummaryFinCat(int index) throws CFException {        
   		return summary.getSummarySubldgEntries(index).getSummaryFinCat();
	}
	
	/**
	 * 	Update SummaryFinCat with the passed value
	 *	@param number
	 */
	public void setSummaryFinCat(int index,int number)  throws CFException{
		summary.getSummarySubldgEntries(index).setSummaryFinCat(number);
	}


	public void setSummaryFinCat(int index,long number)  throws CFException{
		summary.getSummarySubldgEntries(index).setSummaryFinCat((int)number);
	}


	/**
	 *	Returns the value of summary
	 *	@return summary
	 */   
	 public Summary getSummary() {
   	return summary;
   }


	/**
	 *	Returns the value of tb05323FinMktId
	 *	@return tb05323FinMktId
	 */
   public char[] getTb05323FinMktId() throws CFException  {              
   		return work.getTb05323FinMktId();
   }

  
	/**
	*  set variable tb05323FinMktId
	*  @param value
	**/
   public void setTb05323FinMktId(char[] value) throws CFException {
      work.setTb05323FinMktId(value);
   } 

	/**
	 *	Returns the value of summaryFinMktId
	 *	@return summaryFinMktId
	 */
   public char[] getSummaryFinMktId(int index) throws CFException  {              
   		return summary.getSummarySubldgEntries(index).getSummaryFinMktId();
   }

  
	/**
	*  set variable summaryFinMktId
	*  @param value
	**/
   public void setSummaryFinMktId(int index,char[] value) throws CFException {
      summary.getSummarySubldgEntries(index).setSummaryFinMktId(value);
   } 

     /**
	 * 	Update SummaryFinMktId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSummaryFinMktId(int index,char[] source, int sourceIndex) throws CFException {
      summary.getSummarySubldgEntries(index).setSummaryFinMktId(source, sourceIndex);
   	
   }
   
   public void setSummaryFinMktId(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      summary.getSummarySubldgEntries(index).setSummaryFinMktId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SummaryFinMktId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSummaryFinMktId(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      summary.getSummarySubldgEntries(index).setSummaryFinMktId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SummaryFinMktId with another Field
	 *	@param value
	 */
   public void setSummaryFinMktId(int index,Field source) {
      summary.getSummarySubldgEntries(index).setSummaryFinMktId(source);
   }  
   
     /**
	 * 	Update SummaryFinMktId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSummaryFinMktId(int index,Field source, int sourceIndex,int sourceLen) {
      summary.getSummarySubldgEntries(index).setSummaryFinMktId(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SummaryFinMktId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSummaryFinMktId(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      summary.getSummarySubldgEntries(index).setSummaryFinMktId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of summarySubldgEntries
	 *	@return summarySubldgEntries
	 */   
	 public SummarySubldgEntries getSummarySubldgEntries(int index) {
   	return summary.getSummarySubldgEntries(index);
   }

    public List<SummarySubldgEntries> getSummarySubldgEntries() {
        return summary.getSummarySubldgEntries();
    }
   /**
	* 	Update SummarySubldgEntries with the passed value
	*	@param value
	*/
   public void setSummarySubldgEntries(int index,char[] value) throws CFException {
      summary.setSummarySubldgEntries((index),value);
   }   



        public Search0Ctx getSearch0Ctx() {
            return Search0Ctx.this;
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
        str += summary.hashCode();
       return str.hashCode();
    }

    public Search0110InCtx clone() {
        Search0110InCtx cloneObj = new Search0110InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.summary = new Summary();
        cloneObj.summary.set(summary.getClonedField());
        return cloneObj;
    }

    }

    public Search0110InCtx getSearch0110InCtx() {
            return new Search0110InCtx();
    }
     public class Search0200InCtx implements Cloneable {
     WtFields wtFields = Search0Ctx.this.getWtFields();
     Work work = Search0Ctx.this.getWork();

	/**
	 *	Returns the value of wtFields
	 *	@return wtFields
	 */   
	 public WtFields getWtFields() {
   	return wtFields;
   }



public void setWtCodeCtrlIndex(int wtCodeCtrlIndex) { 
    Search0Ctx.this.wtCodeCtrlIndex = wtCodeCtrlIndex;
}

public int getWtCodeCtrlIndex() { 
    return Search0Ctx.this.wtCodeCtrlIndex;
}
	/**
	 *	Returns the value of codeValue
	 *	@return codeValue
	 */
   public char[] getCodeValue(int index) throws CFException  {              
   		return wtFields.getWtCodeCtrl(index).getCodeValue();
   }

  
	/**
	*  set variable codeValue
	*  @param value
	**/
   public void setCodeValue(int index,char[] value) throws CFException {
      wtFields.getWtCodeCtrl(index).setCodeValue(value);
   } 

     /**
	 * 	Update CodeValue 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCodeValue(int index,char[] source, int sourceIndex) throws CFException {
      wtFields.getWtCodeCtrl(index).setCodeValue(source, sourceIndex);
   	
   }
   
   public void setCodeValue(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wtFields.getWtCodeCtrl(index).setCodeValue(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CodeValue 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCodeValue(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wtFields.getWtCodeCtrl(index).setCodeValue(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CodeValue with another Field
	 *	@param value
	 */
   public void setCodeValue(int index,Field source) {
      wtFields.getWtCodeCtrl(index).setCodeValue(source);
   }  
   
     /**
	 * 	Update CodeValue 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCodeValue(int index,Field source, int sourceIndex,int sourceLen) {
      wtFields.getWtCodeCtrl(index).setCodeValue(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CodeValue 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCodeValue(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wtFields.getWtCodeCtrl(index).setCodeValue(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of search
	 *	@return search
	 */
   public char[] getSearch() throws CFException  {              
   		return work.getSearch();
   }

  
	/**
	*  set variable search
	*  @param value
	**/
   public void setSearch(char[] value) throws CFException {
      work.setSearch(value);
   } 

	/**
	 *	Returns the value of codeDesc
	 *	@return codeDesc
	 */
   public char[] getCodeDesc(int index) throws CFException  {              
   		return wtFields.getWtCodeCtrl(index).getCodeDesc();
   }

  
	/**
	*  set variable codeDesc
	*  @param value
	**/
   public void setCodeDesc(int index,char[] value) throws CFException {
      wtFields.getWtCodeCtrl(index).setCodeDesc(value);
   } 

     /**
	 * 	Update CodeDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCodeDesc(int index,char[] source, int sourceIndex) throws CFException {
      wtFields.getWtCodeCtrl(index).setCodeDesc(source, sourceIndex);
   	
   }
   
   public void setCodeDesc(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wtFields.getWtCodeCtrl(index).setCodeDesc(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CodeDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCodeDesc(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wtFields.getWtCodeCtrl(index).setCodeDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CodeDesc with another Field
	 *	@param value
	 */
   public void setCodeDesc(int index,Field source) {
      wtFields.getWtCodeCtrl(index).setCodeDesc(source);
   }  
   
     /**
	 * 	Update CodeDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCodeDesc(int index,Field source, int sourceIndex,int sourceLen) {
      wtFields.getWtCodeCtrl(index).setCodeDesc(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update CodeDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCodeDesc(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wtFields.getWtCodeCtrl(index).setCodeDesc(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wtCodeCtrl
	 *	@return wtCodeCtrl
	 */   
	 public WtCodeCtrl getWtCodeCtrl(int index) {
   	return wtFields.getWtCodeCtrl(index);
   }

    public List<WtCodeCtrl> getWtCodeCtrl() {
        return wtFields.getWtCodeCtrl();
    }
   /**
	* 	Update WtCodeCtrl with the passed value
	*	@param value
	*/
   public void setWtCodeCtrl(int index,char[] value) throws CFException {
      wtFields.setWtCodeCtrl((index),value);
   }   



        public Search0Ctx getSearch0Ctx() {
            return Search0Ctx.this;
        }

        public Search0200OutCtx getSearch0200OutCtx() {
            return new Search0200OutCtx();
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

    public Search0200InCtx clone() {
        Search0200InCtx cloneObj = new Search0200InCtx();
        cloneObj.wtFields = new WtFields();
        cloneObj.wtFields.set(wtFields.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Search0200InCtx getSearch0200InCtx() {
            return new Search0200InCtx();
    }
     public class Search0200OutCtx implements Cloneable {
     WtFields wtFields = Search0Ctx.this.getWtFields();
     Work work = Search0Ctx.this.getWork();


public void setWtCodeCtrlIndex(int wtCodeCtrlIndex) { 
    Search0Ctx.this.wtCodeCtrlIndex = wtCodeCtrlIndex;
}

public int getWtCodeCtrlIndex() { 
    return Search0Ctx.this.wtCodeCtrlIndex;
}

        public Search0Ctx getSearch0Ctx() {
            return Search0Ctx.this;
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

    public Search0200OutCtx clone() {
        Search0200OutCtx cloneObj = new Search0200OutCtx();
        cloneObj.wtFields = new WtFields();
        cloneObj.wtFields.set(wtFields.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Search0200OutCtx getSearch0200OutCtx() {
            return new Search0200OutCtx();
    }
}
