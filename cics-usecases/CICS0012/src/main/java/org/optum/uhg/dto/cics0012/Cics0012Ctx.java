package org.optum.uhg.dto.cics0012;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.cics.CICSSession;
 
 
 


@Context
public class Cics0012Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Dfhcommarea dfhcommarea;
    SecurityRecord securityRecord;
    Work work;


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


    public Dfhcommarea getDfhcommarea() {
        if (dfhcommarea == null) {
            dfhcommarea = new Dfhcommarea();
        }

        return dfhcommarea;
    }

    public void setDfhcommarea(Dfhcommarea dfhcommarea) {
        this.dfhcommarea = dfhcommarea;
    }
    public SecurityRecord getSecurityRecord() {
        if (securityRecord == null) {
            securityRecord = new SecurityRecord();
        }

        return securityRecord;
    }

    public void setSecurityRecord(SecurityRecord securityRecord) {
        this.securityRecord = securityRecord;
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


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dfhcommarea.hashCode();
        str += securityRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Cics0012Ctx clone() {
        Cics0012Ctx cloneObj = new Cics0012Ctx();
        cloneObj.dfhcommarea = new Dfhcommarea();
        cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
        cloneObj.securityRecord = new SecurityRecord();
        cloneObj.securityRecord.set(securityRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Dfhcommarea dfhcommarea = Cics0012Ctx.this.getDfhcommarea();


        public Cics0012Ctx getCics0012Ctx() {
            return Cics0012Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dfhcommarea.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.dfhcommarea = new Dfhcommarea();
        cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class MainlineInCtx implements Cloneable {
     Dfhcommarea dfhcommarea = Cics0012Ctx.this.getDfhcommarea();

	/**
	 *	Test condition "S" for isSectorBased()
	 *	@return  Returns true if isSectorBased() is "S"
	 */
   public boolean isSectorBased() throws CFException {
      return dfhcommarea.isSectorBased();
   }

	/**
	*  set values "S"
	*/
   	public void setSectorBasedTrue()  throws CFException{  			
    	dfhcommarea.setSectorBasedTrue();
   	}
	/**
	 *	Test condition "U" for isCurrencyCodeBased()
	 *	@return  Returns true if isCurrencyCodeBased() is "U"
	 */
   public boolean isCurrencyCodeBased() throws CFException {
      return dfhcommarea.isCurrencyCodeBased();
   }

	/**
	*  set values "U"
	*/
   	public void setCurrencyCodeBasedTrue()  throws CFException{  			
    	dfhcommarea.setCurrencyCodeBasedTrue();
   	}
	/**
	 *	Test condition "I" for isIsinBased()
	 *	@return  Returns true if isIsinBased() is "I"
	 */
   public boolean isIsinBased() throws CFException {
      return dfhcommarea.isIsinBased();
   }

	/**
	*  set values "I"
	*/
   	public void setIsinBasedTrue()  throws CFException{  			
    	dfhcommarea.setIsinBasedTrue();
   	}
	/**
	 *	Test condition "C" for isCountryCodeBased()
	 *	@return  Returns true if isCountryCodeBased() is "C"
	 */
   public boolean isCountryCodeBased() throws CFException {
      return dfhcommarea.isCountryCodeBased();
   }

	/**
	*  set values "C"
	*/
   	public void setCountryCodeBasedTrue()  throws CFException{  			
    	dfhcommarea.setCountryCodeBasedTrue();
   	}
	/**
	 *	Test condition "N" for isIndustryBased()
	 *	@return  Returns true if isIndustryBased() is "N"
	 */
   public boolean isIndustryBased() throws CFException {
      return dfhcommarea.isIndustryBased();
   }

	/**
	*  set values "N"
	*/
   	public void setIndustryBasedTrue()  throws CFException{  			
    	dfhcommarea.setIndustryBasedTrue();
   	}

        public Cics0012Ctx getCics0012Ctx() {
            return Cics0012Ctx.this;
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
        str += dfhcommarea.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.dfhcommarea = new Dfhcommarea();
        cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     Dfhcommarea dfhcommarea = Cics0012Ctx.this.getDfhcommarea();

	/**
	 *	Returns the value of lsOutputCount
	 *	@return lsOutputCount
	 */
	public int getLsOutputCount() throws CFException {
   		return dfhcommarea.getLsOutputCount();
	}


	/**
	 *	Returns String value of lsOutputCount
	 *	@return lsOutputCount
	 */
	public char[]  getLsOutputCountString() throws CFException {
	     return String.valueOf(dfhcommarea.getLsOutputCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsOutputCountIsNumeric()  throws CFException{
	    return dfhcommarea.lsOutputCountIsNumeric();
	}

	/**
	 * 	Update LsOutputCount with the passed value
	 *	@param number
	 */
	public void setLsOutputCount(int number)  throws CFException{
		dfhcommarea.setLsOutputCount(number);
	}
	

	public void setLsOutputCount(long number)  throws CFException{
	    dfhcommarea.setLsOutputCount(number);
	}
	
	
	/**
	 * 	Update LsOutputCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsOutputCount(char[] value)  throws CFException {
		dfhcommarea.setLsOutputCount(value);
	}
	
	/**
	 * 	Update LsOutputCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsOutputCountString(char[] value)  throws CFException{
		dfhcommarea.setLsOutputCount(value);
	}	


        public Cics0012Ctx getCics0012Ctx() {
            return Cics0012Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dfhcommarea.hashCode();
       return str.hashCode();
    }

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.dfhcommarea = new Dfhcommarea();
        cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class IsinRequestInCtx implements Cloneable {
     Dfhcommarea dfhcommarea = Cics0012Ctx.this.getDfhcommarea();
     SecurityRecord securityRecord = Cics0012Ctx.this.getSecurityRecord();
     Work work = Cics0012Ctx.this.getWork();

	/**
	 *	Returns the value of country
	 *	@return country
	 */
   public char[] getCountry() throws CFException  {              
   		return securityRecord.getCountry();
   }

  
	/**
	*  set variable country
	*  @param value
	**/
   public void setCountry(char[] value) throws CFException {
      securityRecord.setCountry(value);
   } 

     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex) throws CFException {
      securityRecord.setCountry(source, sourceIndex);
   	
   }
   
   public void setCountry(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setCountry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Country with another Field
	 *	@param value
	 */
   public void setCountry(Field source) {
      securityRecord.setCountry(source);
   }  
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setCountry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of securityRecord
	 *	@return securityRecord
	 */   
	 public SecurityRecord getSecurityRecord() {
   	return securityRecord;
   }


	/**
	 *	Returns the value of intlkey
	 *	@return intlkey
	 */
   public char[] getIntlkey() throws CFException  {              
   		return securityRecord.getIntlkey();
   }

  
	/**
	*  set variable intlkey
	*  @param value
	**/
   public void setIntlkey(char[] value) throws CFException {
      securityRecord.setIntlkey(value);
   } 

     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIntlkey(source, sourceIndex);
   	
   }
   
   public void setIntlkey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Intlkey with another Field
	 *	@param value
	 */
   public void setIntlkey(Field source) {
      securityRecord.setIntlkey(source);
   }  
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsIsinKey
	 *	@return lsIsinKey
	 */
   public char[] getLsIsinKey() throws CFException  {              
   		return dfhcommarea.getLsIsinKey();
   }

  
	/**
	*  set variable lsIsinKey
	*  @param value
	**/
   public void setLsIsinKey(char[] value) throws CFException {
      dfhcommarea.setLsIsinKey(value);
   } 

     /**
	 * 	Update LsIsinKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsIsinKey(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setLsIsinKey(source, sourceIndex);
   	
   }
   
   public void setLsIsinKey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setLsIsinKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsIsinKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsIsinKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setLsIsinKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsIsinKey with another Field
	 *	@param value
	 */
   public void setLsIsinKey(Field source) {
      dfhcommarea.setLsIsinKey(source);
   }  
   
     /**
	 * 	Update LsIsinKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsIsinKey(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setLsIsinKey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsIsinKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsIsinKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setLsIsinKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of company
	 *	@return company
	 */
   public char[] getCompany() throws CFException  {              
   		return securityRecord.getCompany();
   }

  
	/**
	*  set variable company
	*  @param value
	**/
   public void setCompany(char[] value) throws CFException {
      securityRecord.setCompany(value);
   } 

     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex) throws CFException {
      securityRecord.setCompany(source, sourceIndex);
   	
   }
   
   public void setCompany(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setCompany(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Company with another Field
	 *	@param value
	 */
   public void setCompany(Field source) {
      securityRecord.setCompany(source);
   }  
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currencycd
	 *	@return currencycd
	 */
   public char[] getCurrencycd() throws CFException  {              
   		return securityRecord.getCurrencycd();
   }

  
	/**
	*  set variable currencycd
	*  @param value
	**/
   public void setCurrencycd(char[] value) throws CFException {
      securityRecord.setCurrencycd(value);
   } 

     /**
	 * 	Update Currencycd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrencycd(char[] source, int sourceIndex) throws CFException {
      securityRecord.setCurrencycd(source, sourceIndex);
   	
   }
   
   public void setCurrencycd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Currencycd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Currencycd with another Field
	 *	@param value
	 */
   public void setCurrencycd(Field source) {
      securityRecord.setCurrencycd(source);
   }  
   
     /**
	 * 	Update Currencycd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrencycd(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Currencycd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of isin
	 *	@return isin
	 */
   public char[] getIsin() throws CFException  {              
   		return securityRecord.getIsin();
   }

  
	/**
	*  set variable isin
	*  @param value
	**/
   public void setIsin(char[] value) throws CFException {
      securityRecord.setIsin(value);
   } 

     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIsin(source, sourceIndex);
   	
   }
   
   public void setIsin(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIsin(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Isin with another Field
	 *	@param value
	 */
   public void setIsin(Field source) {
      securityRecord.setIsin(source);
   }  
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sectorweight
	 *	@return sectorweight
	 */
   public char[] getSectorweight() throws CFException  {              
   		return securityRecord.getSectorweight();
   }

  
	/**
	*  set variable sectorweight
	*  @param value
	**/
   public void setSectorweight(char[] value) throws CFException {
      securityRecord.setSectorweight(value);
   } 

     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSectorweight(source, sourceIndex);
   	
   }
   
   public void setSectorweight(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sectorweight with another Field
	 *	@param value
	 */
   public void setSectorweight(Field source) {
      securityRecord.setSectorweight(source);
   }  
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ric
	 *	@return ric
	 */
   public char[] getRic() throws CFException  {              
   		return securityRecord.getRic();
   }

  
	/**
	*  set variable ric
	*  @param value
	**/
   public void setRic(char[] value) throws CFException {
      securityRecord.setRic(value);
   } 

     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex) throws CFException {
      securityRecord.setRic(source, sourceIndex);
   	
   }
   
   public void setRic(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setRic(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ric with another Field
	 *	@param value
	 */
   public void setRic(Field source) {
      securityRecord.setRic(source);
   }  
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ffmcapmilusd
	 *	@return ffmcapmilusd
	 */
	public int getFfmcapmilusd() throws CFException {        
   		return securityRecord.getFfmcapmilusd();
	}
	
	/**
	 * 	Update Ffmcapmilusd with the passed value
	 *	@param number
	 */
	public void setFfmcapmilusd(int number)  throws CFException{
		securityRecord.setFfmcapmilusd(number);
	}


	public void setFfmcapmilusd(long number)  throws CFException{
		securityRecord.setFfmcapmilusd((int)number);
	}


	/**
	 *	Returns the value of industry
	 *	@return industry
	 */
   public char[] getIndustry() throws CFException  {              
   		return securityRecord.getIndustry();
   }

  
	/**
	*  set variable industry
	*  @param value
	**/
   public void setIndustry(char[] value) throws CFException {
      securityRecord.setIndustry(value);
   } 

     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIndustry(source, sourceIndex);
   	
   }
   
   public void setIndustry(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIndustry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIndustry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Industry with another Field
	 *	@param value
	 */
   public void setIndustry(Field source) {
      securityRecord.setIndustry(source);
   }  
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIndustry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIndustry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sedol
	 *	@return sedol
	 */
   public char[] getSedol() throws CFException  {              
   		return securityRecord.getSedol();
   }

  
	/**
	*  set variable sedol
	*  @param value
	**/
   public void setSedol(char[] value) throws CFException {
      securityRecord.setSedol(value);
   } 

     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSedol(source, sourceIndex);
   	
   }
   
   public void setSedol(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSedol(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sedol with another Field
	 *	@param value
	 */
   public void setSedol(Field source) {
      securityRecord.setSedol(source);
   }  
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of vssecu00
	 *	@return vssecu00
	 */
   public char[] getVssecu00() throws CFException  {              
   		return work.getVssecu00();
   }

  
	/**
	*  set variable vssecu00
	*  @param value
	**/
   public void setVssecu00(char[] value) throws CFException {
      work.setVssecu00(value);
   } 

	/**
	 *	Returns the value of sector
	 *	@return sector
	 */
   public char[] getSector() throws CFException  {              
   		return securityRecord.getSector();
   }

  
	/**
	*  set variable sector
	*  @param value
	**/
   public void setSector(char[] value) throws CFException {
      securityRecord.setSector(value);
   } 

     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSector(source, sourceIndex);
   	
   }
   
   public void setSector(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSector(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSector(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sector with another Field
	 *	@param value
	 */
   public void setSector(Field source) {
      securityRecord.setSector(source);
   }  
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSector(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSector(source, sourceIndex, sourceLen, targetIndex, targetLen);
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




        public Cics0012Ctx getCics0012Ctx() {
            return Cics0012Ctx.this;
        }

        public IsinRequestOutCtx getIsinRequestOutCtx() {
            return new IsinRequestOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dfhcommarea.hashCode();
        str += securityRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public IsinRequestInCtx clone() {
        IsinRequestInCtx cloneObj = new IsinRequestInCtx();
        cloneObj.dfhcommarea = new Dfhcommarea();
        cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
        cloneObj.securityRecord = new SecurityRecord();
        cloneObj.securityRecord.set(securityRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public IsinRequestInCtx getIsinRequestInCtx() {
            return new IsinRequestInCtx();
    }
     public class IsinRequestOutCtx implements Cloneable {
     Dfhcommarea dfhcommarea = Cics0012Ctx.this.getDfhcommarea();
     SecurityRecord securityRecord = Cics0012Ctx.this.getSecurityRecord();
     Work work = Cics0012Ctx.this.getWork();

	/**
	 *	Returns the value of sedol01
	 *	@return sedol01
	 */
   public char[] getSedol01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getSedol01();
   }

  
	/**
	*  set variable sedol01
	*  @param value
	**/
   public void setSedol01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setSedol01(value);
   } 

     /**
	 * 	Update Sedol01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSedol01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setSedol01(source, sourceIndex);
   	
   }
   
   public void setSedol01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setSedol01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sedol01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSedol01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSedol01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sedol01 with another Field
	 *	@param value
	 */
   public void setSedol01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setSedol01(source);
   }  
   
     /**
	 * 	Update Sedol01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSedol01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setSedol01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sedol01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSedol01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSedol01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of country
	 *	@return country
	 */
   public char[] getCountry() throws CFException  {              
   		return securityRecord.getCountry();
   }

  
	/**
	*  set variable country
	*  @param value
	**/
   public void setCountry(char[] value) throws CFException {
      securityRecord.setCountry(value);
   } 

     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex) throws CFException {
      securityRecord.setCountry(source, sourceIndex);
   	
   }
   
   public void setCountry(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setCountry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Country with another Field
	 *	@param value
	 */
   public void setCountry(Field source) {
      securityRecord.setCountry(source);
   }  
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setCountry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of industry01
	 *	@return industry01
	 */
   public char[] getIndustry01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getIndustry01();
   }

  
	/**
	*  set variable industry01
	*  @param value
	**/
   public void setIndustry01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setIndustry01(value);
   } 

     /**
	 * 	Update Industry01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIndustry01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setIndustry01(source, sourceIndex);
   	
   }
   
   public void setIndustry01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setIndustry01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Industry01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIndustry01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIndustry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Industry01 with another Field
	 *	@param value
	 */
   public void setIndustry01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setIndustry01(source);
   }  
   
     /**
	 * 	Update Industry01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIndustry01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setIndustry01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Industry01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIndustry01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIndustry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sectorweight01
	 *	@return sectorweight01
	 */
   public char[] getSectorweight01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getSectorweight01();
   }

  
	/**
	*  set variable sectorweight01
	*  @param value
	**/
   public void setSectorweight01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setSectorweight01(value);
   } 

     /**
	 * 	Update Sectorweight01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSectorweight01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source, sourceIndex);
   	
   }
   
   public void setSectorweight01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sectorweight01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sectorweight01 with another Field
	 *	@param value
	 */
   public void setSectorweight01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source);
   }  
   
     /**
	 * 	Update Sectorweight01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSectorweight01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sectorweight01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ric01
	 *	@return ric01
	 */
   public char[] getRic01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getRic01();
   }

  
	/**
	*  set variable ric01
	*  @param value
	**/
   public void setRic01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setRic01(value);
   } 

     /**
	 * 	Update Ric01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRic01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setRic01(source, sourceIndex);
   	
   }
   
   public void setRic01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setRic01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ric01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRic01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setRic01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ric01 with another Field
	 *	@param value
	 */
   public void setRic01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setRic01(source);
   }  
   
     /**
	 * 	Update Ric01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRic01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setRic01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ric01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRic01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setRic01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currencycd
	 *	@return currencycd
	 */
   public char[] getCurrencycd() throws CFException  {              
   		return securityRecord.getCurrencycd();
   }

  
	/**
	*  set variable currencycd
	*  @param value
	**/
   public void setCurrencycd(char[] value) throws CFException {
      securityRecord.setCurrencycd(value);
   } 

     /**
	 * 	Update Currencycd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrencycd(char[] source, int sourceIndex) throws CFException {
      securityRecord.setCurrencycd(source, sourceIndex);
   	
   }
   
   public void setCurrencycd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Currencycd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Currencycd with another Field
	 *	@param value
	 */
   public void setCurrencycd(Field source) {
      securityRecord.setCurrencycd(source);
   }  
   
     /**
	 * 	Update Currencycd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrencycd(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Currencycd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of isin
	 *	@return isin
	 */
   public char[] getIsin() throws CFException  {              
   		return securityRecord.getIsin();
   }

  
	/**
	*  set variable isin
	*  @param value
	**/
   public void setIsin(char[] value) throws CFException {
      securityRecord.setIsin(value);
   } 

     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIsin(source, sourceIndex);
   	
   }
   
   public void setIsin(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIsin(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Isin with another Field
	 *	@param value
	 */
   public void setIsin(Field source) {
      securityRecord.setIsin(source);
   }  
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sectorweight
	 *	@return sectorweight
	 */
   public char[] getSectorweight() throws CFException  {              
   		return securityRecord.getSectorweight();
   }

  
	/**
	*  set variable sectorweight
	*  @param value
	**/
   public void setSectorweight(char[] value) throws CFException {
      securityRecord.setSectorweight(value);
   } 

     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSectorweight(source, sourceIndex);
   	
   }
   
   public void setSectorweight(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sectorweight with another Field
	 *	@param value
	 */
   public void setSectorweight(Field source) {
      securityRecord.setSectorweight(source);
   }  
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ric
	 *	@return ric
	 */
   public char[] getRic() throws CFException  {              
   		return securityRecord.getRic();
   }

  
	/**
	*  set variable ric
	*  @param value
	**/
   public void setRic(char[] value) throws CFException {
      securityRecord.setRic(value);
   } 

     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex) throws CFException {
      securityRecord.setRic(source, sourceIndex);
   	
   }
   
   public void setRic(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setRic(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ric with another Field
	 *	@param value
	 */
   public void setRic(Field source) {
      securityRecord.setRic(source);
   }  
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsEibresp2
	 *	@return lsEibresp2
	 */
	public long getLsEibresp2() throws CFException {
   		return dfhcommarea.getLsEibresp2();
	}


	/**
	 *	Returns String value of lsEibresp2
	 *	@return lsEibresp2
	 */
	public char[]  getLsEibresp2String() throws CFException {
	     return String.valueOf(dfhcommarea.getLsEibresp2String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsEibresp2IsNumeric()  throws CFException{
	    return dfhcommarea.lsEibresp2IsNumeric();
	}

	/**
	 * 	Update LsEibresp2 with the passed value
	 *	@param number
	 */
	public void setLsEibresp2(long number)  throws CFException{
		dfhcommarea.setLsEibresp2(number);
	}
	

	
	/**
	 * 	Update LsEibresp2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsEibresp2(char[] value)  throws CFException {
		dfhcommarea.setLsEibresp2(value);
	}
	
	/**
	 * 	Update LsEibresp2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsEibresp2String(char[] value)  throws CFException{
		dfhcommarea.setLsEibresp2(value);
	}	

	/**
	 *	Returns the value of sector01
	 *	@return sector01
	 */
   public char[] getSector01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getSector01();
   }

  
	/**
	*  set variable sector01
	*  @param value
	**/
   public void setSector01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setSector01(value);
   } 

     /**
	 * 	Update Sector01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSector01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setSector01(source, sourceIndex);
   	
   }
   
   public void setSector01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setSector01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sector01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSector01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSector01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sector01 with another Field
	 *	@param value
	 */
   public void setSector01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setSector01(source);
   }  
   
     /**
	 * 	Update Sector01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSector01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setSector01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sector01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSector01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSector01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currencycd01
	 *	@return currencycd01
	 */
   public char[] getCurrencycd01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getCurrencycd01();
   }

  
	/**
	*  set variable currencycd01
	*  @param value
	**/
   public void setCurrencycd01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(value);
   } 

     /**
	 * 	Update Currencycd01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrencycd01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source, sourceIndex);
   	
   }
   
   public void setCurrencycd01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Currencycd01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Currencycd01 with another Field
	 *	@param value
	 */
   public void setCurrencycd01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source);
   }  
   
     /**
	 * 	Update Currencycd01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrencycd01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Currencycd01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of isin01
	 *	@return isin01
	 */
   public char[] getIsin01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getIsin01();
   }

  
	/**
	*  set variable isin01
	*  @param value
	**/
   public void setIsin01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setIsin01(value);
   } 

     /**
	 * 	Update Isin01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsin01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setIsin01(source, sourceIndex);
   	
   }
   
   public void setIsin01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setIsin01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Isin01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsin01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIsin01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Isin01 with another Field
	 *	@param value
	 */
   public void setIsin01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setIsin01(source);
   }  
   
     /**
	 * 	Update Isin01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsin01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setIsin01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Isin01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsin01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIsin01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsEibresp
	 *	@return lsEibresp
	 */
	public long getLsEibresp() throws CFException {
   		return dfhcommarea.getLsEibresp();
	}


	/**
	 *	Returns String value of lsEibresp
	 *	@return lsEibresp
	 */
	public char[]  getLsEibrespString() throws CFException {
	     return String.valueOf(dfhcommarea.getLsEibrespString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsEibrespIsNumeric()  throws CFException{
	    return dfhcommarea.lsEibrespIsNumeric();
	}

	/**
	 * 	Update LsEibresp with the passed value
	 *	@param number
	 */
	public void setLsEibresp(long number)  throws CFException{
		dfhcommarea.setLsEibresp(number);
	}
	

	
	/**
	 * 	Update LsEibresp with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsEibresp(char[] value)  throws CFException {
		dfhcommarea.setLsEibresp(value);
	}
	
	/**
	 * 	Update LsEibresp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsEibrespString(char[] value)  throws CFException{
		dfhcommarea.setLsEibresp(value);
	}	

	/**
	 *	Returns the value of intlkey
	 *	@return intlkey
	 */
   public char[] getIntlkey() throws CFException  {              
   		return securityRecord.getIntlkey();
   }

  
	/**
	*  set variable intlkey
	*  @param value
	**/
   public void setIntlkey(char[] value) throws CFException {
      securityRecord.setIntlkey(value);
   } 

     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIntlkey(source, sourceIndex);
   	
   }
   
   public void setIntlkey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Intlkey with another Field
	 *	@param value
	 */
   public void setIntlkey(Field source) {
      securityRecord.setIntlkey(source);
   }  
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of intlkey01
	 *	@return intlkey01
	 */
   public char[] getIntlkey01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getIntlkey01();
   }

  
	/**
	*  set variable intlkey01
	*  @param value
	**/
   public void setIntlkey01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setIntlkey01(value);
   } 

     /**
	 * 	Update Intlkey01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIntlkey01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source, sourceIndex);
   	
   }
   
   public void setIntlkey01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Intlkey01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Intlkey01 with another Field
	 *	@param value
	 */
   public void setIntlkey01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source);
   }  
   
     /**
	 * 	Update Intlkey01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIntlkey01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Intlkey01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of company
	 *	@return company
	 */
   public char[] getCompany() throws CFException  {              
   		return securityRecord.getCompany();
   }

  
	/**
	*  set variable company
	*  @param value
	**/
   public void setCompany(char[] value) throws CFException {
      securityRecord.setCompany(value);
   } 

     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex) throws CFException {
      securityRecord.setCompany(source, sourceIndex);
   	
   }
   
   public void setCompany(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setCompany(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Company with another Field
	 *	@param value
	 */
   public void setCompany(Field source) {
      securityRecord.setCompany(source);
   }  
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ffmcapmilusd01
	 *	@return ffmcapmilusd01
	 */
	public int getFfmcapmilusd01(int index) throws CFException {        
   		return dfhcommarea.getLsOutputData(index).getFfmcapmilusd01();
	}
	
	/**
	 * 	Update Ffmcapmilusd01 with the passed value
	 *	@param number
	 */
	public void setFfmcapmilusd01(int index,int number)  throws CFException{
		dfhcommarea.getLsOutputData(index).setFfmcapmilusd01(number);
	}


	public void setFfmcapmilusd01(int index,long number)  throws CFException{
		dfhcommarea.getLsOutputData(index).setFfmcapmilusd01((int)number);
	}


	/**
	 *	Returns the value of lsOutputCount
	 *	@return lsOutputCount
	 */
	public int getLsOutputCount() throws CFException {
   		return dfhcommarea.getLsOutputCount();
	}


	/**
	 *	Returns String value of lsOutputCount
	 *	@return lsOutputCount
	 */
	public char[]  getLsOutputCountString() throws CFException {
	     return String.valueOf(dfhcommarea.getLsOutputCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsOutputCountIsNumeric()  throws CFException{
	    return dfhcommarea.lsOutputCountIsNumeric();
	}

	/**
	 * 	Update LsOutputCount with the passed value
	 *	@param number
	 */
	public void setLsOutputCount(int number)  throws CFException{
		dfhcommarea.setLsOutputCount(number);
	}
	

	public void setLsOutputCount(long number)  throws CFException{
	    dfhcommarea.setLsOutputCount(number);
	}
	
	
	/**
	 * 	Update LsOutputCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsOutputCount(char[] value)  throws CFException {
		dfhcommarea.setLsOutputCount(value);
	}
	
	/**
	 * 	Update LsOutputCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsOutputCountString(char[] value)  throws CFException{
		dfhcommarea.setLsOutputCount(value);
	}	

	/**
	 *	Returns the value of ffmcapmilusd
	 *	@return ffmcapmilusd
	 */
	public int getFfmcapmilusd() throws CFException {        
   		return securityRecord.getFfmcapmilusd();
	}
	
	/**
	 * 	Update Ffmcapmilusd with the passed value
	 *	@param number
	 */
	public void setFfmcapmilusd(int number)  throws CFException{
		securityRecord.setFfmcapmilusd(number);
	}


	public void setFfmcapmilusd(long number)  throws CFException{
		securityRecord.setFfmcapmilusd((int)number);
	}


	/**
	 *	Returns the value of industry
	 *	@return industry
	 */
   public char[] getIndustry() throws CFException  {              
   		return securityRecord.getIndustry();
   }

  
	/**
	*  set variable industry
	*  @param value
	**/
   public void setIndustry(char[] value) throws CFException {
      securityRecord.setIndustry(value);
   } 

     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIndustry(source, sourceIndex);
   	
   }
   
   public void setIndustry(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIndustry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIndustry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Industry with another Field
	 *	@param value
	 */
   public void setIndustry(Field source) {
      securityRecord.setIndustry(source);
   }  
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIndustry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIndustry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sedol
	 *	@return sedol
	 */
   public char[] getSedol() throws CFException  {              
   		return securityRecord.getSedol();
   }

  
	/**
	*  set variable sedol
	*  @param value
	**/
   public void setSedol(char[] value) throws CFException {
      securityRecord.setSedol(value);
   } 

     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSedol(source, sourceIndex);
   	
   }
   
   public void setSedol(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSedol(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sedol with another Field
	 *	@param value
	 */
   public void setSedol(Field source) {
      securityRecord.setSedol(source);
   }  
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of company01
	 *	@return company01
	 */
   public char[] getCompany01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getCompany01();
   }

  
	/**
	*  set variable company01
	*  @param value
	**/
   public void setCompany01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setCompany01(value);
   } 

     /**
	 * 	Update Company01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompany01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setCompany01(source, sourceIndex);
   	
   }
   
   public void setCompany01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setCompany01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Company01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompany01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCompany01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Company01 with another Field
	 *	@param value
	 */
   public void setCompany01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setCompany01(source);
   }  
   
     /**
	 * 	Update Company01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompany01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setCompany01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Company01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompany01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCompany01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of country01
	 *	@return country01
	 */
   public char[] getCountry01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getCountry01();
   }

  
	/**
	*  set variable country01
	*  @param value
	**/
   public void setCountry01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setCountry01(value);
   } 

     /**
	 * 	Update Country01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setCountry01(source, sourceIndex);
   	
   }
   
   public void setCountry01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setCountry01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Country01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCountry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Country01 with another Field
	 *	@param value
	 */
   public void setCountry01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setCountry01(source);
   }  
   
     /**
	 * 	Update Country01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setCountry01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Country01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCountry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sector
	 *	@return sector
	 */
   public char[] getSector() throws CFException  {              
   		return securityRecord.getSector();
   }

  
	/**
	*  set variable sector
	*  @param value
	**/
   public void setSector(char[] value) throws CFException {
      securityRecord.setSector(value);
   } 

     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSector(source, sourceIndex);
   	
   }
   
   public void setSector(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSector(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSector(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sector with another Field
	 *	@param value
	 */
   public void setSector(Field source) {
      securityRecord.setSector(source);
   }  
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSector(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSector(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsReturnCode
	 *	@return lsReturnCode
	 */
	public short getLsReturnCode() throws CFException {        
   		return dfhcommarea.getLsReturnCode();
	}
	
	/**
	 * 	Update LsReturnCode with the passed value
	 *	@param number
	 */
	public void setLsReturnCode(short number)  throws CFException{
		dfhcommarea.setLsReturnCode(number);
	}

	public void setLsReturnCode(int number)  throws CFException{
		dfhcommarea.setLsReturnCode((short)number);
	}

	public void setLsReturnCode(long number)  throws CFException{
		dfhcommarea.setLsReturnCode((short)number);
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




        public Cics0012Ctx getCics0012Ctx() {
            return Cics0012Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dfhcommarea.hashCode();
        str += securityRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public IsinRequestOutCtx clone() {
        IsinRequestOutCtx cloneObj = new IsinRequestOutCtx();
        cloneObj.dfhcommarea = new Dfhcommarea();
        cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
        cloneObj.securityRecord = new SecurityRecord();
        cloneObj.securityRecord.set(securityRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public IsinRequestOutCtx getIsinRequestOutCtx() {
            return new IsinRequestOutCtx();
    }
     public class CountryRequestInCtx implements Cloneable {
     Dfhcommarea dfhcommarea = Cics0012Ctx.this.getDfhcommarea();
     SecurityRecord securityRecord = Cics0012Ctx.this.getSecurityRecord();
     Work work = Cics0012Ctx.this.getWork();

	/**
	 *	Returns the value of securityRecord
	 *	@return securityRecord
	 */   
	 public SecurityRecord getSecurityRecord() {
   	return securityRecord;
   }


	/**
	 *	Returns the value of intlkey
	 *	@return intlkey
	 */
   public char[] getIntlkey() throws CFException  {              
   		return securityRecord.getIntlkey();
   }

  
	/**
	*  set variable intlkey
	*  @param value
	**/
   public void setIntlkey(char[] value) throws CFException {
      securityRecord.setIntlkey(value);
   } 

     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIntlkey(source, sourceIndex);
   	
   }
   
   public void setIntlkey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Intlkey with another Field
	 *	@param value
	 */
   public void setIntlkey(Field source) {
      securityRecord.setIntlkey(source);
   }  
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of company
	 *	@return company
	 */
   public char[] getCompany() throws CFException  {              
   		return securityRecord.getCompany();
   }

  
	/**
	*  set variable company
	*  @param value
	**/
   public void setCompany(char[] value) throws CFException {
      securityRecord.setCompany(value);
   } 

     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex) throws CFException {
      securityRecord.setCompany(source, sourceIndex);
   	
   }
   
   public void setCompany(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setCompany(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Company with another Field
	 *	@param value
	 */
   public void setCompany(Field source) {
      securityRecord.setCompany(source);
   }  
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of vssecu01
	 *	@return vssecu01
	 */
   public char[] getVssecu01() throws CFException  {              
   		return work.getVssecu01();
   }

  
	/**
	*  set variable vssecu01
	*  @param value
	**/
   public void setVssecu01(char[] value) throws CFException {
      work.setVssecu01(value);
   } 

	/**
	 *	Returns the value of currencycd
	 *	@return currencycd
	 */
   public char[] getCurrencycd() throws CFException  {              
   		return securityRecord.getCurrencycd();
   }

  
	/**
	*  set variable currencycd
	*  @param value
	**/
   public void setCurrencycd(char[] value) throws CFException {
      securityRecord.setCurrencycd(value);
   } 

     /**
	 * 	Update Currencycd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrencycd(char[] source, int sourceIndex) throws CFException {
      securityRecord.setCurrencycd(source, sourceIndex);
   	
   }
   
   public void setCurrencycd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Currencycd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Currencycd with another Field
	 *	@param value
	 */
   public void setCurrencycd(Field source) {
      securityRecord.setCurrencycd(source);
   }  
   
     /**
	 * 	Update Currencycd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrencycd(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Currencycd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of isin
	 *	@return isin
	 */
   public char[] getIsin() throws CFException  {              
   		return securityRecord.getIsin();
   }

  
	/**
	*  set variable isin
	*  @param value
	**/
   public void setIsin(char[] value) throws CFException {
      securityRecord.setIsin(value);
   } 

     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIsin(source, sourceIndex);
   	
   }
   
   public void setIsin(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIsin(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Isin with another Field
	 *	@param value
	 */
   public void setIsin(Field source) {
      securityRecord.setIsin(source);
   }  
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sectorweight
	 *	@return sectorweight
	 */
   public char[] getSectorweight() throws CFException  {              
   		return securityRecord.getSectorweight();
   }

  
	/**
	*  set variable sectorweight
	*  @param value
	**/
   public void setSectorweight(char[] value) throws CFException {
      securityRecord.setSectorweight(value);
   } 

     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSectorweight(source, sourceIndex);
   	
   }
   
   public void setSectorweight(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sectorweight with another Field
	 *	@param value
	 */
   public void setSectorweight(Field source) {
      securityRecord.setSectorweight(source);
   }  
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ric
	 *	@return ric
	 */
   public char[] getRic() throws CFException  {              
   		return securityRecord.getRic();
   }

  
	/**
	*  set variable ric
	*  @param value
	**/
   public void setRic(char[] value) throws CFException {
      securityRecord.setRic(value);
   } 

     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex) throws CFException {
      securityRecord.setRic(source, sourceIndex);
   	
   }
   
   public void setRic(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setRic(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ric with another Field
	 *	@param value
	 */
   public void setRic(Field source) {
      securityRecord.setRic(source);
   }  
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsCountryCodeKey
	 *	@return lsCountryCodeKey
	 */
   public char[] getLsCountryCodeKey() throws CFException  {              
   		return dfhcommarea.getLsCountryCodeKey();
   }

  
	/**
	*  set variable lsCountryCodeKey
	*  @param value
	**/
   public void setLsCountryCodeKey(char[] value) throws CFException {
      dfhcommarea.setLsCountryCodeKey(value);
   } 

     /**
	 * 	Update LsCountryCodeKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsCountryCodeKey(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setLsCountryCodeKey(source, sourceIndex);
   	
   }
   
   public void setLsCountryCodeKey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setLsCountryCodeKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsCountryCodeKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsCountryCodeKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setLsCountryCodeKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsCountryCodeKey with another Field
	 *	@param value
	 */
   public void setLsCountryCodeKey(Field source) {
      dfhcommarea.setLsCountryCodeKey(source);
   }  
   
     /**
	 * 	Update LsCountryCodeKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsCountryCodeKey(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setLsCountryCodeKey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsCountryCodeKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsCountryCodeKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setLsCountryCodeKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsOutputCount
	 *	@return lsOutputCount
	 */
	public int getLsOutputCount() throws CFException {
   		return dfhcommarea.getLsOutputCount();
	}


	/**
	 *	Returns String value of lsOutputCount
	 *	@return lsOutputCount
	 */
	public char[]  getLsOutputCountString() throws CFException {
	     return String.valueOf(dfhcommarea.getLsOutputCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsOutputCountIsNumeric()  throws CFException{
	    return dfhcommarea.lsOutputCountIsNumeric();
	}

	/**
	 * 	Update LsOutputCount with the passed value
	 *	@param number
	 */
	public void setLsOutputCount(int number)  throws CFException{
		dfhcommarea.setLsOutputCount(number);
	}
	

	public void setLsOutputCount(long number)  throws CFException{
	    dfhcommarea.setLsOutputCount(number);
	}
	
	
	/**
	 * 	Update LsOutputCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsOutputCount(char[] value)  throws CFException {
		dfhcommarea.setLsOutputCount(value);
	}
	
	/**
	 * 	Update LsOutputCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsOutputCountString(char[] value)  throws CFException{
		dfhcommarea.setLsOutputCount(value);
	}	

	/**
	 *	Returns the value of ffmcapmilusd
	 *	@return ffmcapmilusd
	 */
	public int getFfmcapmilusd() throws CFException {        
   		return securityRecord.getFfmcapmilusd();
	}
	
	/**
	 * 	Update Ffmcapmilusd with the passed value
	 *	@param number
	 */
	public void setFfmcapmilusd(int number)  throws CFException{
		securityRecord.setFfmcapmilusd(number);
	}


	public void setFfmcapmilusd(long number)  throws CFException{
		securityRecord.setFfmcapmilusd((int)number);
	}


	/**
	 *	Returns the value of industry
	 *	@return industry
	 */
   public char[] getIndustry() throws CFException  {              
   		return securityRecord.getIndustry();
   }

  
	/**
	*  set variable industry
	*  @param value
	**/
   public void setIndustry(char[] value) throws CFException {
      securityRecord.setIndustry(value);
   } 

     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIndustry(source, sourceIndex);
   	
   }
   
   public void setIndustry(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIndustry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIndustry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Industry with another Field
	 *	@param value
	 */
   public void setIndustry(Field source) {
      securityRecord.setIndustry(source);
   }  
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIndustry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIndustry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sedol
	 *	@return sedol
	 */
   public char[] getSedol() throws CFException  {              
   		return securityRecord.getSedol();
   }

  
	/**
	*  set variable sedol
	*  @param value
	**/
   public void setSedol(char[] value) throws CFException {
      securityRecord.setSedol(value);
   } 

     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSedol(source, sourceIndex);
   	
   }
   
   public void setSedol(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSedol(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sedol with another Field
	 *	@param value
	 */
   public void setSedol(Field source) {
      securityRecord.setSedol(source);
   }  
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sector
	 *	@return sector
	 */
   public char[] getSector() throws CFException  {              
   		return securityRecord.getSector();
   }

  
	/**
	*  set variable sector
	*  @param value
	**/
   public void setSector(char[] value) throws CFException {
      securityRecord.setSector(value);
   } 

     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSector(source, sourceIndex);
   	
   }
   
   public void setSector(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSector(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSector(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sector with another Field
	 *	@param value
	 */
   public void setSector(Field source) {
      securityRecord.setSector(source);
   }  
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSector(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSector(source, sourceIndex, sourceLen, targetIndex, targetLen);
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




        public Cics0012Ctx getCics0012Ctx() {
            return Cics0012Ctx.this;
        }

        public CountryRequestOutCtx getCountryRequestOutCtx() {
            return new CountryRequestOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dfhcommarea.hashCode();
        str += securityRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public CountryRequestInCtx clone() {
        CountryRequestInCtx cloneObj = new CountryRequestInCtx();
        cloneObj.dfhcommarea = new Dfhcommarea();
        cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
        cloneObj.securityRecord = new SecurityRecord();
        cloneObj.securityRecord.set(securityRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CountryRequestInCtx getCountryRequestInCtx() {
            return new CountryRequestInCtx();
    }
     public class CountryRequestOutCtx implements Cloneable {
     Dfhcommarea dfhcommarea = Cics0012Ctx.this.getDfhcommarea();
     SecurityRecord securityRecord = Cics0012Ctx.this.getSecurityRecord();
     Work work = Cics0012Ctx.this.getWork();

	/**
	 *	Returns the value of sedol01
	 *	@return sedol01
	 */
   public char[] getSedol01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getSedol01();
   }

  
	/**
	*  set variable sedol01
	*  @param value
	**/
   public void setSedol01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setSedol01(value);
   } 

     /**
	 * 	Update Sedol01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSedol01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setSedol01(source, sourceIndex);
   	
   }
   
   public void setSedol01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setSedol01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sedol01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSedol01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSedol01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sedol01 with another Field
	 *	@param value
	 */
   public void setSedol01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setSedol01(source);
   }  
   
     /**
	 * 	Update Sedol01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSedol01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setSedol01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sedol01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSedol01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSedol01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of country
	 *	@return country
	 */
   public char[] getCountry() throws CFException  {              
   		return securityRecord.getCountry();
   }

  
	/**
	*  set variable country
	*  @param value
	**/
   public void setCountry(char[] value) throws CFException {
      securityRecord.setCountry(value);
   } 

     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex) throws CFException {
      securityRecord.setCountry(source, sourceIndex);
   	
   }
   
   public void setCountry(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setCountry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Country with another Field
	 *	@param value
	 */
   public void setCountry(Field source) {
      securityRecord.setCountry(source);
   }  
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setCountry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of industry01
	 *	@return industry01
	 */
   public char[] getIndustry01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getIndustry01();
   }

  
	/**
	*  set variable industry01
	*  @param value
	**/
   public void setIndustry01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setIndustry01(value);
   } 

     /**
	 * 	Update Industry01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIndustry01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setIndustry01(source, sourceIndex);
   	
   }
   
   public void setIndustry01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setIndustry01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Industry01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIndustry01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIndustry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Industry01 with another Field
	 *	@param value
	 */
   public void setIndustry01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setIndustry01(source);
   }  
   
     /**
	 * 	Update Industry01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIndustry01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setIndustry01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Industry01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIndustry01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIndustry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sectorweight01
	 *	@return sectorweight01
	 */
   public char[] getSectorweight01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getSectorweight01();
   }

  
	/**
	*  set variable sectorweight01
	*  @param value
	**/
   public void setSectorweight01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setSectorweight01(value);
   } 

     /**
	 * 	Update Sectorweight01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSectorweight01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source, sourceIndex);
   	
   }
   
   public void setSectorweight01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sectorweight01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sectorweight01 with another Field
	 *	@param value
	 */
   public void setSectorweight01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source);
   }  
   
     /**
	 * 	Update Sectorweight01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSectorweight01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sectorweight01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ric01
	 *	@return ric01
	 */
   public char[] getRic01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getRic01();
   }

  
	/**
	*  set variable ric01
	*  @param value
	**/
   public void setRic01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setRic01(value);
   } 

     /**
	 * 	Update Ric01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRic01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setRic01(source, sourceIndex);
   	
   }
   
   public void setRic01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setRic01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ric01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRic01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setRic01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ric01 with another Field
	 *	@param value
	 */
   public void setRic01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setRic01(source);
   }  
   
     /**
	 * 	Update Ric01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRic01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setRic01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ric01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRic01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setRic01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "Y" for isEndOfFile()
	 *	@return  Returns true if isEndOfFile() is "Y"
	 */
   public boolean isEndOfFile() throws CFException {
      return work.isEndOfFile();
   }

	/**
	*  set values "Y"
	*/
   	public void setEndOfFileTrue()  throws CFException{  			
    	work.setEndOfFileTrue();
   	}
	/**
	 *	Returns the value of currencycd
	 *	@return currencycd
	 */
   public char[] getCurrencycd() throws CFException  {              
   		return securityRecord.getCurrencycd();
   }

  
	/**
	*  set variable currencycd
	*  @param value
	**/
   public void setCurrencycd(char[] value) throws CFException {
      securityRecord.setCurrencycd(value);
   } 

     /**
	 * 	Update Currencycd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrencycd(char[] source, int sourceIndex) throws CFException {
      securityRecord.setCurrencycd(source, sourceIndex);
   	
   }
   
   public void setCurrencycd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Currencycd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Currencycd with another Field
	 *	@param value
	 */
   public void setCurrencycd(Field source) {
      securityRecord.setCurrencycd(source);
   }  
   
     /**
	 * 	Update Currencycd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrencycd(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Currencycd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of isin
	 *	@return isin
	 */
   public char[] getIsin() throws CFException  {              
   		return securityRecord.getIsin();
   }

  
	/**
	*  set variable isin
	*  @param value
	**/
   public void setIsin(char[] value) throws CFException {
      securityRecord.setIsin(value);
   } 

     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIsin(source, sourceIndex);
   	
   }
   
   public void setIsin(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIsin(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Isin with another Field
	 *	@param value
	 */
   public void setIsin(Field source) {
      securityRecord.setIsin(source);
   }  
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sectorweight
	 *	@return sectorweight
	 */
   public char[] getSectorweight() throws CFException  {              
   		return securityRecord.getSectorweight();
   }

  
	/**
	*  set variable sectorweight
	*  @param value
	**/
   public void setSectorweight(char[] value) throws CFException {
      securityRecord.setSectorweight(value);
   } 

     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSectorweight(source, sourceIndex);
   	
   }
   
   public void setSectorweight(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sectorweight with another Field
	 *	@param value
	 */
   public void setSectorweight(Field source) {
      securityRecord.setSectorweight(source);
   }  
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsEibresp2
	 *	@return lsEibresp2
	 */
	public long getLsEibresp2() throws CFException {
   		return dfhcommarea.getLsEibresp2();
	}


	/**
	 *	Returns String value of lsEibresp2
	 *	@return lsEibresp2
	 */
	public char[]  getLsEibresp2String() throws CFException {
	     return String.valueOf(dfhcommarea.getLsEibresp2String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsEibresp2IsNumeric()  throws CFException{
	    return dfhcommarea.lsEibresp2IsNumeric();
	}

	/**
	 * 	Update LsEibresp2 with the passed value
	 *	@param number
	 */
	public void setLsEibresp2(long number)  throws CFException{
		dfhcommarea.setLsEibresp2(number);
	}
	

	
	/**
	 * 	Update LsEibresp2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsEibresp2(char[] value)  throws CFException {
		dfhcommarea.setLsEibresp2(value);
	}
	
	/**
	 * 	Update LsEibresp2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsEibresp2String(char[] value)  throws CFException{
		dfhcommarea.setLsEibresp2(value);
	}	

	/**
	 *	Returns the value of ric
	 *	@return ric
	 */
   public char[] getRic() throws CFException  {              
   		return securityRecord.getRic();
   }

  
	/**
	*  set variable ric
	*  @param value
	**/
   public void setRic(char[] value) throws CFException {
      securityRecord.setRic(value);
   } 

     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex) throws CFException {
      securityRecord.setRic(source, sourceIndex);
   	
   }
   
   public void setRic(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setRic(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ric with another Field
	 *	@param value
	 */
   public void setRic(Field source) {
      securityRecord.setRic(source);
   }  
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sector01
	 *	@return sector01
	 */
   public char[] getSector01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getSector01();
   }

  
	/**
	*  set variable sector01
	*  @param value
	**/
   public void setSector01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setSector01(value);
   } 

     /**
	 * 	Update Sector01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSector01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setSector01(source, sourceIndex);
   	
   }
   
   public void setSector01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setSector01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sector01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSector01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSector01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sector01 with another Field
	 *	@param value
	 */
   public void setSector01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setSector01(source);
   }  
   
     /**
	 * 	Update Sector01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSector01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setSector01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sector01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSector01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSector01(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of currencycd01
	 *	@return currencycd01
	 */
   public char[] getCurrencycd01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getCurrencycd01();
   }

  
	/**
	*  set variable currencycd01
	*  @param value
	**/
   public void setCurrencycd01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(value);
   } 

     /**
	 * 	Update Currencycd01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrencycd01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source, sourceIndex);
   	
   }
   
   public void setCurrencycd01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Currencycd01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Currencycd01 with another Field
	 *	@param value
	 */
   public void setCurrencycd01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source);
   }  
   
     /**
	 * 	Update Currencycd01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrencycd01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Currencycd01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of isin01
	 *	@return isin01
	 */
   public char[] getIsin01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getIsin01();
   }

  
	/**
	*  set variable isin01
	*  @param value
	**/
   public void setIsin01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setIsin01(value);
   } 

     /**
	 * 	Update Isin01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsin01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setIsin01(source, sourceIndex);
   	
   }
   
   public void setIsin01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setIsin01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Isin01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsin01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIsin01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Isin01 with another Field
	 *	@param value
	 */
   public void setIsin01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setIsin01(source);
   }  
   
     /**
	 * 	Update Isin01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsin01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setIsin01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Isin01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsin01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIsin01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsEibresp
	 *	@return lsEibresp
	 */
	public long getLsEibresp() throws CFException {
   		return dfhcommarea.getLsEibresp();
	}


	/**
	 *	Returns String value of lsEibresp
	 *	@return lsEibresp
	 */
	public char[]  getLsEibrespString() throws CFException {
	     return String.valueOf(dfhcommarea.getLsEibrespString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsEibrespIsNumeric()  throws CFException{
	    return dfhcommarea.lsEibrespIsNumeric();
	}

	/**
	 * 	Update LsEibresp with the passed value
	 *	@param number
	 */
	public void setLsEibresp(long number)  throws CFException{
		dfhcommarea.setLsEibresp(number);
	}
	

	
	/**
	 * 	Update LsEibresp with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsEibresp(char[] value)  throws CFException {
		dfhcommarea.setLsEibresp(value);
	}
	
	/**
	 * 	Update LsEibresp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsEibrespString(char[] value)  throws CFException{
		dfhcommarea.setLsEibresp(value);
	}	

	/**
	 *	Returns the value of intlkey
	 *	@return intlkey
	 */
   public char[] getIntlkey() throws CFException  {              
   		return securityRecord.getIntlkey();
   }

  
	/**
	*  set variable intlkey
	*  @param value
	**/
   public void setIntlkey(char[] value) throws CFException {
      securityRecord.setIntlkey(value);
   } 

     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIntlkey(source, sourceIndex);
   	
   }
   
   public void setIntlkey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Intlkey with another Field
	 *	@param value
	 */
   public void setIntlkey(Field source) {
      securityRecord.setIntlkey(source);
   }  
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of intlkey01
	 *	@return intlkey01
	 */
   public char[] getIntlkey01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getIntlkey01();
   }

  
	/**
	*  set variable intlkey01
	*  @param value
	**/
   public void setIntlkey01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setIntlkey01(value);
   } 

     /**
	 * 	Update Intlkey01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIntlkey01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source, sourceIndex);
   	
   }
   
   public void setIntlkey01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Intlkey01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Intlkey01 with another Field
	 *	@param value
	 */
   public void setIntlkey01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source);
   }  
   
     /**
	 * 	Update Intlkey01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIntlkey01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Intlkey01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of company
	 *	@return company
	 */
   public char[] getCompany() throws CFException  {              
   		return securityRecord.getCompany();
   }

  
	/**
	*  set variable company
	*  @param value
	**/
   public void setCompany(char[] value) throws CFException {
      securityRecord.setCompany(value);
   } 

     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex) throws CFException {
      securityRecord.setCompany(source, sourceIndex);
   	
   }
   
   public void setCompany(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setCompany(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Company with another Field
	 *	@param value
	 */
   public void setCompany(Field source) {
      securityRecord.setCompany(source);
   }  
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ffmcapmilusd01
	 *	@return ffmcapmilusd01
	 */
	public int getFfmcapmilusd01(int index) throws CFException {        
   		return dfhcommarea.getLsOutputData(index).getFfmcapmilusd01();
	}
	
	/**
	 * 	Update Ffmcapmilusd01 with the passed value
	 *	@param number
	 */
	public void setFfmcapmilusd01(int index,int number)  throws CFException{
		dfhcommarea.getLsOutputData(index).setFfmcapmilusd01(number);
	}


	public void setFfmcapmilusd01(int index,long number)  throws CFException{
		dfhcommarea.getLsOutputData(index).setFfmcapmilusd01((int)number);
	}


	/**
	 *	Returns the value of lsOutputCount
	 *	@return lsOutputCount
	 */
	public int getLsOutputCount() throws CFException {
   		return dfhcommarea.getLsOutputCount();
	}


	/**
	 *	Returns String value of lsOutputCount
	 *	@return lsOutputCount
	 */
	public char[]  getLsOutputCountString() throws CFException {
	     return String.valueOf(dfhcommarea.getLsOutputCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsOutputCountIsNumeric()  throws CFException{
	    return dfhcommarea.lsOutputCountIsNumeric();
	}

	/**
	 * 	Update LsOutputCount with the passed value
	 *	@param number
	 */
	public void setLsOutputCount(int number)  throws CFException{
		dfhcommarea.setLsOutputCount(number);
	}
	

	public void setLsOutputCount(long number)  throws CFException{
	    dfhcommarea.setLsOutputCount(number);
	}
	
	
	/**
	 * 	Update LsOutputCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsOutputCount(char[] value)  throws CFException {
		dfhcommarea.setLsOutputCount(value);
	}
	
	/**
	 * 	Update LsOutputCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsOutputCountString(char[] value)  throws CFException{
		dfhcommarea.setLsOutputCount(value);
	}	

	/**
	 *	Returns the value of ffmcapmilusd
	 *	@return ffmcapmilusd
	 */
	public int getFfmcapmilusd() throws CFException {        
   		return securityRecord.getFfmcapmilusd();
	}
	
	/**
	 * 	Update Ffmcapmilusd with the passed value
	 *	@param number
	 */
	public void setFfmcapmilusd(int number)  throws CFException{
		securityRecord.setFfmcapmilusd(number);
	}


	public void setFfmcapmilusd(long number)  throws CFException{
		securityRecord.setFfmcapmilusd((int)number);
	}


	/**
	 *	Returns the value of industry
	 *	@return industry
	 */
   public char[] getIndustry() throws CFException  {              
   		return securityRecord.getIndustry();
   }

  
	/**
	*  set variable industry
	*  @param value
	**/
   public void setIndustry(char[] value) throws CFException {
      securityRecord.setIndustry(value);
   } 

     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIndustry(source, sourceIndex);
   	
   }
   
   public void setIndustry(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIndustry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIndustry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Industry with another Field
	 *	@param value
	 */
   public void setIndustry(Field source) {
      securityRecord.setIndustry(source);
   }  
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIndustry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIndustry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sedol
	 *	@return sedol
	 */
   public char[] getSedol() throws CFException  {              
   		return securityRecord.getSedol();
   }

  
	/**
	*  set variable sedol
	*  @param value
	**/
   public void setSedol(char[] value) throws CFException {
      securityRecord.setSedol(value);
   } 

     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSedol(source, sourceIndex);
   	
   }
   
   public void setSedol(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSedol(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sedol with another Field
	 *	@param value
	 */
   public void setSedol(Field source) {
      securityRecord.setSedol(source);
   }  
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of company01
	 *	@return company01
	 */
   public char[] getCompany01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getCompany01();
   }

  
	/**
	*  set variable company01
	*  @param value
	**/
   public void setCompany01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setCompany01(value);
   } 

     /**
	 * 	Update Company01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompany01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setCompany01(source, sourceIndex);
   	
   }
   
   public void setCompany01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setCompany01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Company01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompany01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCompany01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Company01 with another Field
	 *	@param value
	 */
   public void setCompany01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setCompany01(source);
   }  
   
     /**
	 * 	Update Company01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompany01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setCompany01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Company01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompany01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCompany01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of country01
	 *	@return country01
	 */
   public char[] getCountry01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getCountry01();
   }

  
	/**
	*  set variable country01
	*  @param value
	**/
   public void setCountry01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setCountry01(value);
   } 

     /**
	 * 	Update Country01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setCountry01(source, sourceIndex);
   	
   }
   
   public void setCountry01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setCountry01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Country01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCountry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Country01 with another Field
	 *	@param value
	 */
   public void setCountry01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setCountry01(source);
   }  
   
     /**
	 * 	Update Country01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setCountry01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Country01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCountry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sector
	 *	@return sector
	 */
   public char[] getSector() throws CFException  {              
   		return securityRecord.getSector();
   }

  
	/**
	*  set variable sector
	*  @param value
	**/
   public void setSector(char[] value) throws CFException {
      securityRecord.setSector(value);
   } 

     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSector(source, sourceIndex);
   	
   }
   
   public void setSector(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSector(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSector(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sector with another Field
	 *	@param value
	 */
   public void setSector(Field source) {
      securityRecord.setSector(source);
   }  
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSector(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSector(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsReturnCode
	 *	@return lsReturnCode
	 */
	public short getLsReturnCode() throws CFException {        
   		return dfhcommarea.getLsReturnCode();
	}
	
	/**
	 * 	Update LsReturnCode with the passed value
	 *	@param number
	 */
	public void setLsReturnCode(short number)  throws CFException{
		dfhcommarea.setLsReturnCode(number);
	}

	public void setLsReturnCode(int number)  throws CFException{
		dfhcommarea.setLsReturnCode((short)number);
	}

	public void setLsReturnCode(long number)  throws CFException{
		dfhcommarea.setLsReturnCode((short)number);
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




        public Cics0012Ctx getCics0012Ctx() {
            return Cics0012Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dfhcommarea.hashCode();
        str += securityRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public CountryRequestOutCtx clone() {
        CountryRequestOutCtx cloneObj = new CountryRequestOutCtx();
        cloneObj.dfhcommarea = new Dfhcommarea();
        cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
        cloneObj.securityRecord = new SecurityRecord();
        cloneObj.securityRecord.set(securityRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CountryRequestOutCtx getCountryRequestOutCtx() {
            return new CountryRequestOutCtx();
    }
     public class CurrencyRequestInCtx implements Cloneable {
     Dfhcommarea dfhcommarea = Cics0012Ctx.this.getDfhcommarea();
     SecurityRecord securityRecord = Cics0012Ctx.this.getSecurityRecord();
     Work work = Cics0012Ctx.this.getWork();

	/**
	 *	Returns the value of lsCurrencyCodeKey
	 *	@return lsCurrencyCodeKey
	 */
   public char[] getLsCurrencyCodeKey() throws CFException  {              
   		return dfhcommarea.getLsCurrencyCodeKey();
   }

  
	/**
	*  set variable lsCurrencyCodeKey
	*  @param value
	**/
   public void setLsCurrencyCodeKey(char[] value) throws CFException {
      dfhcommarea.setLsCurrencyCodeKey(value);
   } 

     /**
	 * 	Update LsCurrencyCodeKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsCurrencyCodeKey(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setLsCurrencyCodeKey(source, sourceIndex);
   	
   }
   
   public void setLsCurrencyCodeKey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setLsCurrencyCodeKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsCurrencyCodeKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsCurrencyCodeKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setLsCurrencyCodeKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsCurrencyCodeKey with another Field
	 *	@param value
	 */
   public void setLsCurrencyCodeKey(Field source) {
      dfhcommarea.setLsCurrencyCodeKey(source);
   }  
   
     /**
	 * 	Update LsCurrencyCodeKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsCurrencyCodeKey(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setLsCurrencyCodeKey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsCurrencyCodeKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsCurrencyCodeKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setLsCurrencyCodeKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of country
	 *	@return country
	 */
   public char[] getCountry() throws CFException  {              
   		return securityRecord.getCountry();
   }

  
	/**
	*  set variable country
	*  @param value
	**/
   public void setCountry(char[] value) throws CFException {
      securityRecord.setCountry(value);
   } 

     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex) throws CFException {
      securityRecord.setCountry(source, sourceIndex);
   	
   }
   
   public void setCountry(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setCountry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Country with another Field
	 *	@param value
	 */
   public void setCountry(Field source) {
      securityRecord.setCountry(source);
   }  
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setCountry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of securityRecord
	 *	@return securityRecord
	 */   
	 public SecurityRecord getSecurityRecord() {
   	return securityRecord;
   }


	/**
	 *	Returns the value of intlkey
	 *	@return intlkey
	 */
   public char[] getIntlkey() throws CFException  {              
   		return securityRecord.getIntlkey();
   }

  
	/**
	*  set variable intlkey
	*  @param value
	**/
   public void setIntlkey(char[] value) throws CFException {
      securityRecord.setIntlkey(value);
   } 

     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIntlkey(source, sourceIndex);
   	
   }
   
   public void setIntlkey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Intlkey with another Field
	 *	@param value
	 */
   public void setIntlkey(Field source) {
      securityRecord.setIntlkey(source);
   }  
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of company
	 *	@return company
	 */
   public char[] getCompany() throws CFException  {              
   		return securityRecord.getCompany();
   }

  
	/**
	*  set variable company
	*  @param value
	**/
   public void setCompany(char[] value) throws CFException {
      securityRecord.setCompany(value);
   } 

     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex) throws CFException {
      securityRecord.setCompany(source, sourceIndex);
   	
   }
   
   public void setCompany(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setCompany(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Company with another Field
	 *	@param value
	 */
   public void setCompany(Field source) {
      securityRecord.setCompany(source);
   }  
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of vssecu01
	 *	@return vssecu01
	 */
   public char[] getVssecu01() throws CFException  {              
   		return work.getVssecu01();
   }

  
	/**
	*  set variable vssecu01
	*  @param value
	**/
   public void setVssecu01(char[] value) throws CFException {
      work.setVssecu01(value);
   } 

	/**
	 *	Returns the value of isin
	 *	@return isin
	 */
   public char[] getIsin() throws CFException  {              
   		return securityRecord.getIsin();
   }

  
	/**
	*  set variable isin
	*  @param value
	**/
   public void setIsin(char[] value) throws CFException {
      securityRecord.setIsin(value);
   } 

     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIsin(source, sourceIndex);
   	
   }
   
   public void setIsin(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIsin(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Isin with another Field
	 *	@param value
	 */
   public void setIsin(Field source) {
      securityRecord.setIsin(source);
   }  
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sectorweight
	 *	@return sectorweight
	 */
   public char[] getSectorweight() throws CFException  {              
   		return securityRecord.getSectorweight();
   }

  
	/**
	*  set variable sectorweight
	*  @param value
	**/
   public void setSectorweight(char[] value) throws CFException {
      securityRecord.setSectorweight(value);
   } 

     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSectorweight(source, sourceIndex);
   	
   }
   
   public void setSectorweight(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sectorweight with another Field
	 *	@param value
	 */
   public void setSectorweight(Field source) {
      securityRecord.setSectorweight(source);
   }  
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ric
	 *	@return ric
	 */
   public char[] getRic() throws CFException  {              
   		return securityRecord.getRic();
   }

  
	/**
	*  set variable ric
	*  @param value
	**/
   public void setRic(char[] value) throws CFException {
      securityRecord.setRic(value);
   } 

     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex) throws CFException {
      securityRecord.setRic(source, sourceIndex);
   	
   }
   
   public void setRic(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setRic(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ric with another Field
	 *	@param value
	 */
   public void setRic(Field source) {
      securityRecord.setRic(source);
   }  
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsOutputCount
	 *	@return lsOutputCount
	 */
	public int getLsOutputCount() throws CFException {
   		return dfhcommarea.getLsOutputCount();
	}


	/**
	 *	Returns String value of lsOutputCount
	 *	@return lsOutputCount
	 */
	public char[]  getLsOutputCountString() throws CFException {
	     return String.valueOf(dfhcommarea.getLsOutputCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsOutputCountIsNumeric()  throws CFException{
	    return dfhcommarea.lsOutputCountIsNumeric();
	}

	/**
	 * 	Update LsOutputCount with the passed value
	 *	@param number
	 */
	public void setLsOutputCount(int number)  throws CFException{
		dfhcommarea.setLsOutputCount(number);
	}
	

	public void setLsOutputCount(long number)  throws CFException{
	    dfhcommarea.setLsOutputCount(number);
	}
	
	
	/**
	 * 	Update LsOutputCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsOutputCount(char[] value)  throws CFException {
		dfhcommarea.setLsOutputCount(value);
	}
	
	/**
	 * 	Update LsOutputCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsOutputCountString(char[] value)  throws CFException{
		dfhcommarea.setLsOutputCount(value);
	}	

	/**
	 *	Returns the value of ffmcapmilusd
	 *	@return ffmcapmilusd
	 */
	public int getFfmcapmilusd() throws CFException {        
   		return securityRecord.getFfmcapmilusd();
	}
	
	/**
	 * 	Update Ffmcapmilusd with the passed value
	 *	@param number
	 */
	public void setFfmcapmilusd(int number)  throws CFException{
		securityRecord.setFfmcapmilusd(number);
	}


	public void setFfmcapmilusd(long number)  throws CFException{
		securityRecord.setFfmcapmilusd((int)number);
	}


	/**
	 *	Returns the value of vssecu02
	 *	@return vssecu02
	 */
   public char[] getVssecu02() throws CFException  {              
   		return work.getVssecu02();
   }

  
	/**
	*  set variable vssecu02
	*  @param value
	**/
   public void setVssecu02(char[] value) throws CFException {
      work.setVssecu02(value);
   } 

	/**
	 *	Returns the value of industry
	 *	@return industry
	 */
   public char[] getIndustry() throws CFException  {              
   		return securityRecord.getIndustry();
   }

  
	/**
	*  set variable industry
	*  @param value
	**/
   public void setIndustry(char[] value) throws CFException {
      securityRecord.setIndustry(value);
   } 

     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIndustry(source, sourceIndex);
   	
   }
   
   public void setIndustry(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIndustry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIndustry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Industry with another Field
	 *	@param value
	 */
   public void setIndustry(Field source) {
      securityRecord.setIndustry(source);
   }  
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIndustry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIndustry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sedol
	 *	@return sedol
	 */
   public char[] getSedol() throws CFException  {              
   		return securityRecord.getSedol();
   }

  
	/**
	*  set variable sedol
	*  @param value
	**/
   public void setSedol(char[] value) throws CFException {
      securityRecord.setSedol(value);
   } 

     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSedol(source, sourceIndex);
   	
   }
   
   public void setSedol(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSedol(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sedol with another Field
	 *	@param value
	 */
   public void setSedol(Field source) {
      securityRecord.setSedol(source);
   }  
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sector
	 *	@return sector
	 */
   public char[] getSector() throws CFException  {              
   		return securityRecord.getSector();
   }

  
	/**
	*  set variable sector
	*  @param value
	**/
   public void setSector(char[] value) throws CFException {
      securityRecord.setSector(value);
   } 

     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSector(source, sourceIndex);
   	
   }
   
   public void setSector(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSector(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSector(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sector with another Field
	 *	@param value
	 */
   public void setSector(Field source) {
      securityRecord.setSector(source);
   }  
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSector(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSector(source, sourceIndex, sourceLen, targetIndex, targetLen);
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




        public Cics0012Ctx getCics0012Ctx() {
            return Cics0012Ctx.this;
        }

        public CurrencyRequestOutCtx getCurrencyRequestOutCtx() {
            return new CurrencyRequestOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dfhcommarea.hashCode();
        str += securityRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public CurrencyRequestInCtx clone() {
        CurrencyRequestInCtx cloneObj = new CurrencyRequestInCtx();
        cloneObj.dfhcommarea = new Dfhcommarea();
        cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
        cloneObj.securityRecord = new SecurityRecord();
        cloneObj.securityRecord.set(securityRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CurrencyRequestInCtx getCurrencyRequestInCtx() {
            return new CurrencyRequestInCtx();
    }
     public class CurrencyRequestOutCtx implements Cloneable {
     Dfhcommarea dfhcommarea = Cics0012Ctx.this.getDfhcommarea();
     SecurityRecord securityRecord = Cics0012Ctx.this.getSecurityRecord();
     Work work = Cics0012Ctx.this.getWork();

	/**
	 *	Returns the value of sedol01
	 *	@return sedol01
	 */
   public char[] getSedol01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getSedol01();
   }

  
	/**
	*  set variable sedol01
	*  @param value
	**/
   public void setSedol01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setSedol01(value);
   } 

     /**
	 * 	Update Sedol01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSedol01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setSedol01(source, sourceIndex);
   	
   }
   
   public void setSedol01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setSedol01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sedol01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSedol01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSedol01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sedol01 with another Field
	 *	@param value
	 */
   public void setSedol01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setSedol01(source);
   }  
   
     /**
	 * 	Update Sedol01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSedol01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setSedol01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sedol01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSedol01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSedol01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of country
	 *	@return country
	 */
   public char[] getCountry() throws CFException  {              
   		return securityRecord.getCountry();
   }

  
	/**
	*  set variable country
	*  @param value
	**/
   public void setCountry(char[] value) throws CFException {
      securityRecord.setCountry(value);
   } 

     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex) throws CFException {
      securityRecord.setCountry(source, sourceIndex);
   	
   }
   
   public void setCountry(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setCountry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Country with another Field
	 *	@param value
	 */
   public void setCountry(Field source) {
      securityRecord.setCountry(source);
   }  
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setCountry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of industry01
	 *	@return industry01
	 */
   public char[] getIndustry01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getIndustry01();
   }

  
	/**
	*  set variable industry01
	*  @param value
	**/
   public void setIndustry01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setIndustry01(value);
   } 

     /**
	 * 	Update Industry01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIndustry01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setIndustry01(source, sourceIndex);
   	
   }
   
   public void setIndustry01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setIndustry01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Industry01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIndustry01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIndustry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Industry01 with another Field
	 *	@param value
	 */
   public void setIndustry01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setIndustry01(source);
   }  
   
     /**
	 * 	Update Industry01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIndustry01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setIndustry01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Industry01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIndustry01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIndustry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sectorweight01
	 *	@return sectorweight01
	 */
   public char[] getSectorweight01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getSectorweight01();
   }

  
	/**
	*  set variable sectorweight01
	*  @param value
	**/
   public void setSectorweight01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setSectorweight01(value);
   } 

     /**
	 * 	Update Sectorweight01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSectorweight01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source, sourceIndex);
   	
   }
   
   public void setSectorweight01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sectorweight01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sectorweight01 with another Field
	 *	@param value
	 */
   public void setSectorweight01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source);
   }  
   
     /**
	 * 	Update Sectorweight01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSectorweight01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sectorweight01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ric01
	 *	@return ric01
	 */
   public char[] getRic01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getRic01();
   }

  
	/**
	*  set variable ric01
	*  @param value
	**/
   public void setRic01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setRic01(value);
   } 

     /**
	 * 	Update Ric01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRic01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setRic01(source, sourceIndex);
   	
   }
   
   public void setRic01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setRic01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ric01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRic01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setRic01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ric01 with another Field
	 *	@param value
	 */
   public void setRic01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setRic01(source);
   }  
   
     /**
	 * 	Update Ric01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRic01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setRic01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ric01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRic01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setRic01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "Y" for isEndOfFile()
	 *	@return  Returns true if isEndOfFile() is "Y"
	 */
   public boolean isEndOfFile() throws CFException {
      return work.isEndOfFile();
   }

	/**
	*  set values "Y"
	*/
   	public void setEndOfFileTrue()  throws CFException{  			
    	work.setEndOfFileTrue();
   	}
	/**
	 *	Returns the value of currencycd
	 *	@return currencycd
	 */
   public char[] getCurrencycd() throws CFException  {              
   		return securityRecord.getCurrencycd();
   }

  
	/**
	*  set variable currencycd
	*  @param value
	**/
   public void setCurrencycd(char[] value) throws CFException {
      securityRecord.setCurrencycd(value);
   } 

     /**
	 * 	Update Currencycd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrencycd(char[] source, int sourceIndex) throws CFException {
      securityRecord.setCurrencycd(source, sourceIndex);
   	
   }
   
   public void setCurrencycd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Currencycd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Currencycd with another Field
	 *	@param value
	 */
   public void setCurrencycd(Field source) {
      securityRecord.setCurrencycd(source);
   }  
   
     /**
	 * 	Update Currencycd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrencycd(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Currencycd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of isin
	 *	@return isin
	 */
   public char[] getIsin() throws CFException  {              
   		return securityRecord.getIsin();
   }

  
	/**
	*  set variable isin
	*  @param value
	**/
   public void setIsin(char[] value) throws CFException {
      securityRecord.setIsin(value);
   } 

     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIsin(source, sourceIndex);
   	
   }
   
   public void setIsin(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIsin(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Isin with another Field
	 *	@param value
	 */
   public void setIsin(Field source) {
      securityRecord.setIsin(source);
   }  
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sectorweight
	 *	@return sectorweight
	 */
   public char[] getSectorweight() throws CFException  {              
   		return securityRecord.getSectorweight();
   }

  
	/**
	*  set variable sectorweight
	*  @param value
	**/
   public void setSectorweight(char[] value) throws CFException {
      securityRecord.setSectorweight(value);
   } 

     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSectorweight(source, sourceIndex);
   	
   }
   
   public void setSectorweight(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sectorweight with another Field
	 *	@param value
	 */
   public void setSectorweight(Field source) {
      securityRecord.setSectorweight(source);
   }  
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsEibresp2
	 *	@return lsEibresp2
	 */
	public long getLsEibresp2() throws CFException {
   		return dfhcommarea.getLsEibresp2();
	}


	/**
	 *	Returns String value of lsEibresp2
	 *	@return lsEibresp2
	 */
	public char[]  getLsEibresp2String() throws CFException {
	     return String.valueOf(dfhcommarea.getLsEibresp2String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsEibresp2IsNumeric()  throws CFException{
	    return dfhcommarea.lsEibresp2IsNumeric();
	}

	/**
	 * 	Update LsEibresp2 with the passed value
	 *	@param number
	 */
	public void setLsEibresp2(long number)  throws CFException{
		dfhcommarea.setLsEibresp2(number);
	}
	

	
	/**
	 * 	Update LsEibresp2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsEibresp2(char[] value)  throws CFException {
		dfhcommarea.setLsEibresp2(value);
	}
	
	/**
	 * 	Update LsEibresp2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsEibresp2String(char[] value)  throws CFException{
		dfhcommarea.setLsEibresp2(value);
	}	

	/**
	 *	Returns the value of ric
	 *	@return ric
	 */
   public char[] getRic() throws CFException  {              
   		return securityRecord.getRic();
   }

  
	/**
	*  set variable ric
	*  @param value
	**/
   public void setRic(char[] value) throws CFException {
      securityRecord.setRic(value);
   } 

     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex) throws CFException {
      securityRecord.setRic(source, sourceIndex);
   	
   }
   
   public void setRic(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setRic(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ric with another Field
	 *	@param value
	 */
   public void setRic(Field source) {
      securityRecord.setRic(source);
   }  
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sector01
	 *	@return sector01
	 */
   public char[] getSector01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getSector01();
   }

  
	/**
	*  set variable sector01
	*  @param value
	**/
   public void setSector01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setSector01(value);
   } 

     /**
	 * 	Update Sector01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSector01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setSector01(source, sourceIndex);
   	
   }
   
   public void setSector01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setSector01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sector01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSector01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSector01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sector01 with another Field
	 *	@param value
	 */
   public void setSector01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setSector01(source);
   }  
   
     /**
	 * 	Update Sector01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSector01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setSector01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sector01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSector01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSector01(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of currencycd01
	 *	@return currencycd01
	 */
   public char[] getCurrencycd01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getCurrencycd01();
   }

  
	/**
	*  set variable currencycd01
	*  @param value
	**/
   public void setCurrencycd01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(value);
   } 

     /**
	 * 	Update Currencycd01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrencycd01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source, sourceIndex);
   	
   }
   
   public void setCurrencycd01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Currencycd01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Currencycd01 with another Field
	 *	@param value
	 */
   public void setCurrencycd01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source);
   }  
   
     /**
	 * 	Update Currencycd01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrencycd01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Currencycd01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of isin01
	 *	@return isin01
	 */
   public char[] getIsin01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getIsin01();
   }

  
	/**
	*  set variable isin01
	*  @param value
	**/
   public void setIsin01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setIsin01(value);
   } 

     /**
	 * 	Update Isin01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsin01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setIsin01(source, sourceIndex);
   	
   }
   
   public void setIsin01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setIsin01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Isin01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsin01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIsin01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Isin01 with another Field
	 *	@param value
	 */
   public void setIsin01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setIsin01(source);
   }  
   
     /**
	 * 	Update Isin01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsin01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setIsin01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Isin01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsin01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIsin01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsEibresp
	 *	@return lsEibresp
	 */
	public long getLsEibresp() throws CFException {
   		return dfhcommarea.getLsEibresp();
	}


	/**
	 *	Returns String value of lsEibresp
	 *	@return lsEibresp
	 */
	public char[]  getLsEibrespString() throws CFException {
	     return String.valueOf(dfhcommarea.getLsEibrespString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsEibrespIsNumeric()  throws CFException{
	    return dfhcommarea.lsEibrespIsNumeric();
	}

	/**
	 * 	Update LsEibresp with the passed value
	 *	@param number
	 */
	public void setLsEibresp(long number)  throws CFException{
		dfhcommarea.setLsEibresp(number);
	}
	

	
	/**
	 * 	Update LsEibresp with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsEibresp(char[] value)  throws CFException {
		dfhcommarea.setLsEibresp(value);
	}
	
	/**
	 * 	Update LsEibresp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsEibrespString(char[] value)  throws CFException{
		dfhcommarea.setLsEibresp(value);
	}	

	/**
	 *	Returns the value of intlkey
	 *	@return intlkey
	 */
   public char[] getIntlkey() throws CFException  {              
   		return securityRecord.getIntlkey();
   }

  
	/**
	*  set variable intlkey
	*  @param value
	**/
   public void setIntlkey(char[] value) throws CFException {
      securityRecord.setIntlkey(value);
   } 

     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIntlkey(source, sourceIndex);
   	
   }
   
   public void setIntlkey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Intlkey with another Field
	 *	@param value
	 */
   public void setIntlkey(Field source) {
      securityRecord.setIntlkey(source);
   }  
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of intlkey01
	 *	@return intlkey01
	 */
   public char[] getIntlkey01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getIntlkey01();
   }

  
	/**
	*  set variable intlkey01
	*  @param value
	**/
   public void setIntlkey01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setIntlkey01(value);
   } 

     /**
	 * 	Update Intlkey01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIntlkey01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source, sourceIndex);
   	
   }
   
   public void setIntlkey01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Intlkey01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Intlkey01 with another Field
	 *	@param value
	 */
   public void setIntlkey01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source);
   }  
   
     /**
	 * 	Update Intlkey01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIntlkey01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Intlkey01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of company
	 *	@return company
	 */
   public char[] getCompany() throws CFException  {              
   		return securityRecord.getCompany();
   }

  
	/**
	*  set variable company
	*  @param value
	**/
   public void setCompany(char[] value) throws CFException {
      securityRecord.setCompany(value);
   } 

     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex) throws CFException {
      securityRecord.setCompany(source, sourceIndex);
   	
   }
   
   public void setCompany(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setCompany(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Company with another Field
	 *	@param value
	 */
   public void setCompany(Field source) {
      securityRecord.setCompany(source);
   }  
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ffmcapmilusd01
	 *	@return ffmcapmilusd01
	 */
	public int getFfmcapmilusd01(int index) throws CFException {        
   		return dfhcommarea.getLsOutputData(index).getFfmcapmilusd01();
	}
	
	/**
	 * 	Update Ffmcapmilusd01 with the passed value
	 *	@param number
	 */
	public void setFfmcapmilusd01(int index,int number)  throws CFException{
		dfhcommarea.getLsOutputData(index).setFfmcapmilusd01(number);
	}


	public void setFfmcapmilusd01(int index,long number)  throws CFException{
		dfhcommarea.getLsOutputData(index).setFfmcapmilusd01((int)number);
	}


	/**
	 *	Returns the value of lsOutputCount
	 *	@return lsOutputCount
	 */
	public int getLsOutputCount() throws CFException {
   		return dfhcommarea.getLsOutputCount();
	}


	/**
	 *	Returns String value of lsOutputCount
	 *	@return lsOutputCount
	 */
	public char[]  getLsOutputCountString() throws CFException {
	     return String.valueOf(dfhcommarea.getLsOutputCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsOutputCountIsNumeric()  throws CFException{
	    return dfhcommarea.lsOutputCountIsNumeric();
	}

	/**
	 * 	Update LsOutputCount with the passed value
	 *	@param number
	 */
	public void setLsOutputCount(int number)  throws CFException{
		dfhcommarea.setLsOutputCount(number);
	}
	

	public void setLsOutputCount(long number)  throws CFException{
	    dfhcommarea.setLsOutputCount(number);
	}
	
	
	/**
	 * 	Update LsOutputCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsOutputCount(char[] value)  throws CFException {
		dfhcommarea.setLsOutputCount(value);
	}
	
	/**
	 * 	Update LsOutputCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsOutputCountString(char[] value)  throws CFException{
		dfhcommarea.setLsOutputCount(value);
	}	

	/**
	 *	Returns the value of ffmcapmilusd
	 *	@return ffmcapmilusd
	 */
	public int getFfmcapmilusd() throws CFException {        
   		return securityRecord.getFfmcapmilusd();
	}
	
	/**
	 * 	Update Ffmcapmilusd with the passed value
	 *	@param number
	 */
	public void setFfmcapmilusd(int number)  throws CFException{
		securityRecord.setFfmcapmilusd(number);
	}


	public void setFfmcapmilusd(long number)  throws CFException{
		securityRecord.setFfmcapmilusd((int)number);
	}


	/**
	 *	Returns the value of industry
	 *	@return industry
	 */
   public char[] getIndustry() throws CFException  {              
   		return securityRecord.getIndustry();
   }

  
	/**
	*  set variable industry
	*  @param value
	**/
   public void setIndustry(char[] value) throws CFException {
      securityRecord.setIndustry(value);
   } 

     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIndustry(source, sourceIndex);
   	
   }
   
   public void setIndustry(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIndustry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIndustry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Industry with another Field
	 *	@param value
	 */
   public void setIndustry(Field source) {
      securityRecord.setIndustry(source);
   }  
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIndustry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIndustry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sedol
	 *	@return sedol
	 */
   public char[] getSedol() throws CFException  {              
   		return securityRecord.getSedol();
   }

  
	/**
	*  set variable sedol
	*  @param value
	**/
   public void setSedol(char[] value) throws CFException {
      securityRecord.setSedol(value);
   } 

     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSedol(source, sourceIndex);
   	
   }
   
   public void setSedol(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSedol(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sedol with another Field
	 *	@param value
	 */
   public void setSedol(Field source) {
      securityRecord.setSedol(source);
   }  
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of company01
	 *	@return company01
	 */
   public char[] getCompany01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getCompany01();
   }

  
	/**
	*  set variable company01
	*  @param value
	**/
   public void setCompany01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setCompany01(value);
   } 

     /**
	 * 	Update Company01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompany01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setCompany01(source, sourceIndex);
   	
   }
   
   public void setCompany01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setCompany01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Company01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompany01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCompany01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Company01 with another Field
	 *	@param value
	 */
   public void setCompany01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setCompany01(source);
   }  
   
     /**
	 * 	Update Company01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompany01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setCompany01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Company01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompany01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCompany01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of country01
	 *	@return country01
	 */
   public char[] getCountry01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getCountry01();
   }

  
	/**
	*  set variable country01
	*  @param value
	**/
   public void setCountry01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setCountry01(value);
   } 

     /**
	 * 	Update Country01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setCountry01(source, sourceIndex);
   	
   }
   
   public void setCountry01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setCountry01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Country01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCountry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Country01 with another Field
	 *	@param value
	 */
   public void setCountry01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setCountry01(source);
   }  
   
     /**
	 * 	Update Country01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setCountry01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Country01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCountry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sector
	 *	@return sector
	 */
   public char[] getSector() throws CFException  {              
   		return securityRecord.getSector();
   }

  
	/**
	*  set variable sector
	*  @param value
	**/
   public void setSector(char[] value) throws CFException {
      securityRecord.setSector(value);
   } 

     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSector(source, sourceIndex);
   	
   }
   
   public void setSector(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSector(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSector(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sector with another Field
	 *	@param value
	 */
   public void setSector(Field source) {
      securityRecord.setSector(source);
   }  
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSector(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSector(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsReturnCode
	 *	@return lsReturnCode
	 */
	public short getLsReturnCode() throws CFException {        
   		return dfhcommarea.getLsReturnCode();
	}
	
	/**
	 * 	Update LsReturnCode with the passed value
	 *	@param number
	 */
	public void setLsReturnCode(short number)  throws CFException{
		dfhcommarea.setLsReturnCode(number);
	}

	public void setLsReturnCode(int number)  throws CFException{
		dfhcommarea.setLsReturnCode((short)number);
	}

	public void setLsReturnCode(long number)  throws CFException{
		dfhcommarea.setLsReturnCode((short)number);
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




        public Cics0012Ctx getCics0012Ctx() {
            return Cics0012Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dfhcommarea.hashCode();
        str += securityRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public CurrencyRequestOutCtx clone() {
        CurrencyRequestOutCtx cloneObj = new CurrencyRequestOutCtx();
        cloneObj.dfhcommarea = new Dfhcommarea();
        cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
        cloneObj.securityRecord = new SecurityRecord();
        cloneObj.securityRecord.set(securityRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CurrencyRequestOutCtx getCurrencyRequestOutCtx() {
            return new CurrencyRequestOutCtx();
    }
     public class IndustryRequestInCtx implements Cloneable {
     Dfhcommarea dfhcommarea = Cics0012Ctx.this.getDfhcommarea();
     SecurityRecord securityRecord = Cics0012Ctx.this.getSecurityRecord();
     Work work = Cics0012Ctx.this.getWork();

	/**
	 *	Returns the value of country
	 *	@return country
	 */
   public char[] getCountry() throws CFException  {              
   		return securityRecord.getCountry();
   }

  
	/**
	*  set variable country
	*  @param value
	**/
   public void setCountry(char[] value) throws CFException {
      securityRecord.setCountry(value);
   } 

     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex) throws CFException {
      securityRecord.setCountry(source, sourceIndex);
   	
   }
   
   public void setCountry(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setCountry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Country with another Field
	 *	@param value
	 */
   public void setCountry(Field source) {
      securityRecord.setCountry(source);
   }  
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setCountry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of securityRecord
	 *	@return securityRecord
	 */   
	 public SecurityRecord getSecurityRecord() {
   	return securityRecord;
   }


	/**
	 *	Returns the value of intlkey
	 *	@return intlkey
	 */
   public char[] getIntlkey() throws CFException  {              
   		return securityRecord.getIntlkey();
   }

  
	/**
	*  set variable intlkey
	*  @param value
	**/
   public void setIntlkey(char[] value) throws CFException {
      securityRecord.setIntlkey(value);
   } 

     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIntlkey(source, sourceIndex);
   	
   }
   
   public void setIntlkey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Intlkey with another Field
	 *	@param value
	 */
   public void setIntlkey(Field source) {
      securityRecord.setIntlkey(source);
   }  
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of company
	 *	@return company
	 */
   public char[] getCompany() throws CFException  {              
   		return securityRecord.getCompany();
   }

  
	/**
	*  set variable company
	*  @param value
	**/
   public void setCompany(char[] value) throws CFException {
      securityRecord.setCompany(value);
   } 

     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex) throws CFException {
      securityRecord.setCompany(source, sourceIndex);
   	
   }
   
   public void setCompany(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setCompany(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Company with another Field
	 *	@param value
	 */
   public void setCompany(Field source) {
      securityRecord.setCompany(source);
   }  
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of vssecu03
	 *	@return vssecu03
	 */
   public char[] getVssecu03() throws CFException  {              
   		return work.getVssecu03();
   }

  
	/**
	*  set variable vssecu03
	*  @param value
	**/
   public void setVssecu03(char[] value) throws CFException {
      work.setVssecu03(value);
   } 

	/**
	 *	Returns the value of currencycd
	 *	@return currencycd
	 */
   public char[] getCurrencycd() throws CFException  {              
   		return securityRecord.getCurrencycd();
   }

  
	/**
	*  set variable currencycd
	*  @param value
	**/
   public void setCurrencycd(char[] value) throws CFException {
      securityRecord.setCurrencycd(value);
   } 

     /**
	 * 	Update Currencycd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrencycd(char[] source, int sourceIndex) throws CFException {
      securityRecord.setCurrencycd(source, sourceIndex);
   	
   }
   
   public void setCurrencycd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Currencycd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Currencycd with another Field
	 *	@param value
	 */
   public void setCurrencycd(Field source) {
      securityRecord.setCurrencycd(source);
   }  
   
     /**
	 * 	Update Currencycd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrencycd(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Currencycd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of vssecu01
	 *	@return vssecu01
	 */
   public char[] getVssecu01() throws CFException  {              
   		return work.getVssecu01();
   }

  
	/**
	*  set variable vssecu01
	*  @param value
	**/
   public void setVssecu01(char[] value) throws CFException {
      work.setVssecu01(value);
   } 

	/**
	 *	Returns the value of isin
	 *	@return isin
	 */
   public char[] getIsin() throws CFException  {              
   		return securityRecord.getIsin();
   }

  
	/**
	*  set variable isin
	*  @param value
	**/
   public void setIsin(char[] value) throws CFException {
      securityRecord.setIsin(value);
   } 

     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIsin(source, sourceIndex);
   	
   }
   
   public void setIsin(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIsin(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Isin with another Field
	 *	@param value
	 */
   public void setIsin(Field source) {
      securityRecord.setIsin(source);
   }  
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sectorweight
	 *	@return sectorweight
	 */
   public char[] getSectorweight() throws CFException  {              
   		return securityRecord.getSectorweight();
   }

  
	/**
	*  set variable sectorweight
	*  @param value
	**/
   public void setSectorweight(char[] value) throws CFException {
      securityRecord.setSectorweight(value);
   } 

     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSectorweight(source, sourceIndex);
   	
   }
   
   public void setSectorweight(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sectorweight with another Field
	 *	@param value
	 */
   public void setSectorweight(Field source) {
      securityRecord.setSectorweight(source);
   }  
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ric
	 *	@return ric
	 */
   public char[] getRic() throws CFException  {              
   		return securityRecord.getRic();
   }

  
	/**
	*  set variable ric
	*  @param value
	**/
   public void setRic(char[] value) throws CFException {
      securityRecord.setRic(value);
   } 

     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex) throws CFException {
      securityRecord.setRic(source, sourceIndex);
   	
   }
   
   public void setRic(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setRic(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ric with another Field
	 *	@param value
	 */
   public void setRic(Field source) {
      securityRecord.setRic(source);
   }  
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsOutputCount
	 *	@return lsOutputCount
	 */
	public int getLsOutputCount() throws CFException {
   		return dfhcommarea.getLsOutputCount();
	}


	/**
	 *	Returns String value of lsOutputCount
	 *	@return lsOutputCount
	 */
	public char[]  getLsOutputCountString() throws CFException {
	     return String.valueOf(dfhcommarea.getLsOutputCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsOutputCountIsNumeric()  throws CFException{
	    return dfhcommarea.lsOutputCountIsNumeric();
	}

	/**
	 * 	Update LsOutputCount with the passed value
	 *	@param number
	 */
	public void setLsOutputCount(int number)  throws CFException{
		dfhcommarea.setLsOutputCount(number);
	}
	

	public void setLsOutputCount(long number)  throws CFException{
	    dfhcommarea.setLsOutputCount(number);
	}
	
	
	/**
	 * 	Update LsOutputCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsOutputCount(char[] value)  throws CFException {
		dfhcommarea.setLsOutputCount(value);
	}
	
	/**
	 * 	Update LsOutputCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsOutputCountString(char[] value)  throws CFException{
		dfhcommarea.setLsOutputCount(value);
	}	

	/**
	 *	Returns the value of ffmcapmilusd
	 *	@return ffmcapmilusd
	 */
	public int getFfmcapmilusd() throws CFException {        
   		return securityRecord.getFfmcapmilusd();
	}
	
	/**
	 * 	Update Ffmcapmilusd with the passed value
	 *	@param number
	 */
	public void setFfmcapmilusd(int number)  throws CFException{
		securityRecord.setFfmcapmilusd(number);
	}


	public void setFfmcapmilusd(long number)  throws CFException{
		securityRecord.setFfmcapmilusd((int)number);
	}


	/**
	 *	Returns the value of sedol
	 *	@return sedol
	 */
   public char[] getSedol() throws CFException  {              
   		return securityRecord.getSedol();
   }

  
	/**
	*  set variable sedol
	*  @param value
	**/
   public void setSedol(char[] value) throws CFException {
      securityRecord.setSedol(value);
   } 

     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSedol(source, sourceIndex);
   	
   }
   
   public void setSedol(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSedol(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sedol with another Field
	 *	@param value
	 */
   public void setSedol(Field source) {
      securityRecord.setSedol(source);
   }  
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsIndustryKey
	 *	@return lsIndustryKey
	 */
   public char[] getLsIndustryKey() throws CFException  {              
   		return dfhcommarea.getLsIndustryKey();
   }

  
	/**
	*  set variable lsIndustryKey
	*  @param value
	**/
   public void setLsIndustryKey(char[] value) throws CFException {
      dfhcommarea.setLsIndustryKey(value);
   } 

     /**
	 * 	Update LsIndustryKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsIndustryKey(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setLsIndustryKey(source, sourceIndex);
   	
   }
   
   public void setLsIndustryKey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setLsIndustryKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsIndustryKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsIndustryKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setLsIndustryKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsIndustryKey with another Field
	 *	@param value
	 */
   public void setLsIndustryKey(Field source) {
      dfhcommarea.setLsIndustryKey(source);
   }  
   
     /**
	 * 	Update LsIndustryKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsIndustryKey(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setLsIndustryKey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsIndustryKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsIndustryKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setLsIndustryKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sector
	 *	@return sector
	 */
   public char[] getSector() throws CFException  {              
   		return securityRecord.getSector();
   }

  
	/**
	*  set variable sector
	*  @param value
	**/
   public void setSector(char[] value) throws CFException {
      securityRecord.setSector(value);
   } 

     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSector(source, sourceIndex);
   	
   }
   
   public void setSector(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSector(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSector(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sector with another Field
	 *	@param value
	 */
   public void setSector(Field source) {
      securityRecord.setSector(source);
   }  
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSector(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSector(source, sourceIndex, sourceLen, targetIndex, targetLen);
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




        public Cics0012Ctx getCics0012Ctx() {
            return Cics0012Ctx.this;
        }

        public IndustryRequestOutCtx getIndustryRequestOutCtx() {
            return new IndustryRequestOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dfhcommarea.hashCode();
        str += securityRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public IndustryRequestInCtx clone() {
        IndustryRequestInCtx cloneObj = new IndustryRequestInCtx();
        cloneObj.dfhcommarea = new Dfhcommarea();
        cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
        cloneObj.securityRecord = new SecurityRecord();
        cloneObj.securityRecord.set(securityRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public IndustryRequestInCtx getIndustryRequestInCtx() {
            return new IndustryRequestInCtx();
    }
     public class IndustryRequestOutCtx implements Cloneable {
     Dfhcommarea dfhcommarea = Cics0012Ctx.this.getDfhcommarea();
     SecurityRecord securityRecord = Cics0012Ctx.this.getSecurityRecord();
     Work work = Cics0012Ctx.this.getWork();

	/**
	 *	Returns the value of sedol01
	 *	@return sedol01
	 */
   public char[] getSedol01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getSedol01();
   }

  
	/**
	*  set variable sedol01
	*  @param value
	**/
   public void setSedol01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setSedol01(value);
   } 

     /**
	 * 	Update Sedol01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSedol01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setSedol01(source, sourceIndex);
   	
   }
   
   public void setSedol01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setSedol01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sedol01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSedol01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSedol01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sedol01 with another Field
	 *	@param value
	 */
   public void setSedol01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setSedol01(source);
   }  
   
     /**
	 * 	Update Sedol01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSedol01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setSedol01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sedol01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSedol01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSedol01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of country
	 *	@return country
	 */
   public char[] getCountry() throws CFException  {              
   		return securityRecord.getCountry();
   }

  
	/**
	*  set variable country
	*  @param value
	**/
   public void setCountry(char[] value) throws CFException {
      securityRecord.setCountry(value);
   } 

     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex) throws CFException {
      securityRecord.setCountry(source, sourceIndex);
   	
   }
   
   public void setCountry(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setCountry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Country with another Field
	 *	@param value
	 */
   public void setCountry(Field source) {
      securityRecord.setCountry(source);
   }  
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setCountry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of industry01
	 *	@return industry01
	 */
   public char[] getIndustry01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getIndustry01();
   }

  
	/**
	*  set variable industry01
	*  @param value
	**/
   public void setIndustry01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setIndustry01(value);
   } 

     /**
	 * 	Update Industry01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIndustry01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setIndustry01(source, sourceIndex);
   	
   }
   
   public void setIndustry01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setIndustry01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Industry01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIndustry01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIndustry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Industry01 with another Field
	 *	@param value
	 */
   public void setIndustry01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setIndustry01(source);
   }  
   
     /**
	 * 	Update Industry01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIndustry01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setIndustry01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Industry01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIndustry01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIndustry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sectorweight01
	 *	@return sectorweight01
	 */
   public char[] getSectorweight01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getSectorweight01();
   }

  
	/**
	*  set variable sectorweight01
	*  @param value
	**/
   public void setSectorweight01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setSectorweight01(value);
   } 

     /**
	 * 	Update Sectorweight01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSectorweight01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source, sourceIndex);
   	
   }
   
   public void setSectorweight01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sectorweight01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sectorweight01 with another Field
	 *	@param value
	 */
   public void setSectorweight01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source);
   }  
   
     /**
	 * 	Update Sectorweight01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSectorweight01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sectorweight01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ric01
	 *	@return ric01
	 */
   public char[] getRic01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getRic01();
   }

  
	/**
	*  set variable ric01
	*  @param value
	**/
   public void setRic01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setRic01(value);
   } 

     /**
	 * 	Update Ric01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRic01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setRic01(source, sourceIndex);
   	
   }
   
   public void setRic01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setRic01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ric01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRic01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setRic01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ric01 with another Field
	 *	@param value
	 */
   public void setRic01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setRic01(source);
   }  
   
     /**
	 * 	Update Ric01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRic01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setRic01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ric01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRic01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setRic01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "Y" for isEndOfFile()
	 *	@return  Returns true if isEndOfFile() is "Y"
	 */
   public boolean isEndOfFile() throws CFException {
      return work.isEndOfFile();
   }

	/**
	*  set values "Y"
	*/
   	public void setEndOfFileTrue()  throws CFException{  			
    	work.setEndOfFileTrue();
   	}
	/**
	 *	Returns the value of currencycd
	 *	@return currencycd
	 */
   public char[] getCurrencycd() throws CFException  {              
   		return securityRecord.getCurrencycd();
   }

  
	/**
	*  set variable currencycd
	*  @param value
	**/
   public void setCurrencycd(char[] value) throws CFException {
      securityRecord.setCurrencycd(value);
   } 

     /**
	 * 	Update Currencycd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrencycd(char[] source, int sourceIndex) throws CFException {
      securityRecord.setCurrencycd(source, sourceIndex);
   	
   }
   
   public void setCurrencycd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Currencycd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Currencycd with another Field
	 *	@param value
	 */
   public void setCurrencycd(Field source) {
      securityRecord.setCurrencycd(source);
   }  
   
     /**
	 * 	Update Currencycd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrencycd(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Currencycd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of isin
	 *	@return isin
	 */
   public char[] getIsin() throws CFException  {              
   		return securityRecord.getIsin();
   }

  
	/**
	*  set variable isin
	*  @param value
	**/
   public void setIsin(char[] value) throws CFException {
      securityRecord.setIsin(value);
   } 

     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIsin(source, sourceIndex);
   	
   }
   
   public void setIsin(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIsin(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Isin with another Field
	 *	@param value
	 */
   public void setIsin(Field source) {
      securityRecord.setIsin(source);
   }  
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sectorweight
	 *	@return sectorweight
	 */
   public char[] getSectorweight() throws CFException  {              
   		return securityRecord.getSectorweight();
   }

  
	/**
	*  set variable sectorweight
	*  @param value
	**/
   public void setSectorweight(char[] value) throws CFException {
      securityRecord.setSectorweight(value);
   } 

     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSectorweight(source, sourceIndex);
   	
   }
   
   public void setSectorweight(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sectorweight with another Field
	 *	@param value
	 */
   public void setSectorweight(Field source) {
      securityRecord.setSectorweight(source);
   }  
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsEibresp2
	 *	@return lsEibresp2
	 */
	public long getLsEibresp2() throws CFException {
   		return dfhcommarea.getLsEibresp2();
	}


	/**
	 *	Returns String value of lsEibresp2
	 *	@return lsEibresp2
	 */
	public char[]  getLsEibresp2String() throws CFException {
	     return String.valueOf(dfhcommarea.getLsEibresp2String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsEibresp2IsNumeric()  throws CFException{
	    return dfhcommarea.lsEibresp2IsNumeric();
	}

	/**
	 * 	Update LsEibresp2 with the passed value
	 *	@param number
	 */
	public void setLsEibresp2(long number)  throws CFException{
		dfhcommarea.setLsEibresp2(number);
	}
	

	
	/**
	 * 	Update LsEibresp2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsEibresp2(char[] value)  throws CFException {
		dfhcommarea.setLsEibresp2(value);
	}
	
	/**
	 * 	Update LsEibresp2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsEibresp2String(char[] value)  throws CFException{
		dfhcommarea.setLsEibresp2(value);
	}	

	/**
	 *	Returns the value of ric
	 *	@return ric
	 */
   public char[] getRic() throws CFException  {              
   		return securityRecord.getRic();
   }

  
	/**
	*  set variable ric
	*  @param value
	**/
   public void setRic(char[] value) throws CFException {
      securityRecord.setRic(value);
   } 

     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex) throws CFException {
      securityRecord.setRic(source, sourceIndex);
   	
   }
   
   public void setRic(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setRic(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ric with another Field
	 *	@param value
	 */
   public void setRic(Field source) {
      securityRecord.setRic(source);
   }  
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sector01
	 *	@return sector01
	 */
   public char[] getSector01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getSector01();
   }

  
	/**
	*  set variable sector01
	*  @param value
	**/
   public void setSector01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setSector01(value);
   } 

     /**
	 * 	Update Sector01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSector01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setSector01(source, sourceIndex);
   	
   }
   
   public void setSector01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setSector01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sector01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSector01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSector01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sector01 with another Field
	 *	@param value
	 */
   public void setSector01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setSector01(source);
   }  
   
     /**
	 * 	Update Sector01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSector01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setSector01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sector01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSector01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSector01(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of currencycd01
	 *	@return currencycd01
	 */
   public char[] getCurrencycd01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getCurrencycd01();
   }

  
	/**
	*  set variable currencycd01
	*  @param value
	**/
   public void setCurrencycd01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(value);
   } 

     /**
	 * 	Update Currencycd01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrencycd01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source, sourceIndex);
   	
   }
   
   public void setCurrencycd01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Currencycd01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Currencycd01 with another Field
	 *	@param value
	 */
   public void setCurrencycd01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source);
   }  
   
     /**
	 * 	Update Currencycd01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrencycd01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Currencycd01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of isin01
	 *	@return isin01
	 */
   public char[] getIsin01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getIsin01();
   }

  
	/**
	*  set variable isin01
	*  @param value
	**/
   public void setIsin01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setIsin01(value);
   } 

     /**
	 * 	Update Isin01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsin01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setIsin01(source, sourceIndex);
   	
   }
   
   public void setIsin01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setIsin01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Isin01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsin01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIsin01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Isin01 with another Field
	 *	@param value
	 */
   public void setIsin01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setIsin01(source);
   }  
   
     /**
	 * 	Update Isin01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsin01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setIsin01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Isin01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsin01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIsin01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsEibresp
	 *	@return lsEibresp
	 */
	public long getLsEibresp() throws CFException {
   		return dfhcommarea.getLsEibresp();
	}


	/**
	 *	Returns String value of lsEibresp
	 *	@return lsEibresp
	 */
	public char[]  getLsEibrespString() throws CFException {
	     return String.valueOf(dfhcommarea.getLsEibrespString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsEibrespIsNumeric()  throws CFException{
	    return dfhcommarea.lsEibrespIsNumeric();
	}

	/**
	 * 	Update LsEibresp with the passed value
	 *	@param number
	 */
	public void setLsEibresp(long number)  throws CFException{
		dfhcommarea.setLsEibresp(number);
	}
	

	
	/**
	 * 	Update LsEibresp with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsEibresp(char[] value)  throws CFException {
		dfhcommarea.setLsEibresp(value);
	}
	
	/**
	 * 	Update LsEibresp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsEibrespString(char[] value)  throws CFException{
		dfhcommarea.setLsEibresp(value);
	}	

	/**
	 *	Returns the value of intlkey
	 *	@return intlkey
	 */
   public char[] getIntlkey() throws CFException  {              
   		return securityRecord.getIntlkey();
   }

  
	/**
	*  set variable intlkey
	*  @param value
	**/
   public void setIntlkey(char[] value) throws CFException {
      securityRecord.setIntlkey(value);
   } 

     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIntlkey(source, sourceIndex);
   	
   }
   
   public void setIntlkey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Intlkey with another Field
	 *	@param value
	 */
   public void setIntlkey(Field source) {
      securityRecord.setIntlkey(source);
   }  
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of intlkey01
	 *	@return intlkey01
	 */
   public char[] getIntlkey01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getIntlkey01();
   }

  
	/**
	*  set variable intlkey01
	*  @param value
	**/
   public void setIntlkey01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setIntlkey01(value);
   } 

     /**
	 * 	Update Intlkey01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIntlkey01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source, sourceIndex);
   	
   }
   
   public void setIntlkey01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Intlkey01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Intlkey01 with another Field
	 *	@param value
	 */
   public void setIntlkey01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source);
   }  
   
     /**
	 * 	Update Intlkey01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIntlkey01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Intlkey01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of company
	 *	@return company
	 */
   public char[] getCompany() throws CFException  {              
   		return securityRecord.getCompany();
   }

  
	/**
	*  set variable company
	*  @param value
	**/
   public void setCompany(char[] value) throws CFException {
      securityRecord.setCompany(value);
   } 

     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex) throws CFException {
      securityRecord.setCompany(source, sourceIndex);
   	
   }
   
   public void setCompany(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setCompany(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Company with another Field
	 *	@param value
	 */
   public void setCompany(Field source) {
      securityRecord.setCompany(source);
   }  
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ffmcapmilusd01
	 *	@return ffmcapmilusd01
	 */
	public int getFfmcapmilusd01(int index) throws CFException {        
   		return dfhcommarea.getLsOutputData(index).getFfmcapmilusd01();
	}
	
	/**
	 * 	Update Ffmcapmilusd01 with the passed value
	 *	@param number
	 */
	public void setFfmcapmilusd01(int index,int number)  throws CFException{
		dfhcommarea.getLsOutputData(index).setFfmcapmilusd01(number);
	}


	public void setFfmcapmilusd01(int index,long number)  throws CFException{
		dfhcommarea.getLsOutputData(index).setFfmcapmilusd01((int)number);
	}


	/**
	 *	Returns the value of lsOutputCount
	 *	@return lsOutputCount
	 */
	public int getLsOutputCount() throws CFException {
   		return dfhcommarea.getLsOutputCount();
	}


	/**
	 *	Returns String value of lsOutputCount
	 *	@return lsOutputCount
	 */
	public char[]  getLsOutputCountString() throws CFException {
	     return String.valueOf(dfhcommarea.getLsOutputCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsOutputCountIsNumeric()  throws CFException{
	    return dfhcommarea.lsOutputCountIsNumeric();
	}

	/**
	 * 	Update LsOutputCount with the passed value
	 *	@param number
	 */
	public void setLsOutputCount(int number)  throws CFException{
		dfhcommarea.setLsOutputCount(number);
	}
	

	public void setLsOutputCount(long number)  throws CFException{
	    dfhcommarea.setLsOutputCount(number);
	}
	
	
	/**
	 * 	Update LsOutputCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsOutputCount(char[] value)  throws CFException {
		dfhcommarea.setLsOutputCount(value);
	}
	
	/**
	 * 	Update LsOutputCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsOutputCountString(char[] value)  throws CFException{
		dfhcommarea.setLsOutputCount(value);
	}	

	/**
	 *	Returns the value of ffmcapmilusd
	 *	@return ffmcapmilusd
	 */
	public int getFfmcapmilusd() throws CFException {        
   		return securityRecord.getFfmcapmilusd();
	}
	
	/**
	 * 	Update Ffmcapmilusd with the passed value
	 *	@param number
	 */
	public void setFfmcapmilusd(int number)  throws CFException{
		securityRecord.setFfmcapmilusd(number);
	}


	public void setFfmcapmilusd(long number)  throws CFException{
		securityRecord.setFfmcapmilusd((int)number);
	}


	/**
	 *	Returns the value of industry
	 *	@return industry
	 */
   public char[] getIndustry() throws CFException  {              
   		return securityRecord.getIndustry();
   }

  
	/**
	*  set variable industry
	*  @param value
	**/
   public void setIndustry(char[] value) throws CFException {
      securityRecord.setIndustry(value);
   } 

     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIndustry(source, sourceIndex);
   	
   }
   
   public void setIndustry(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIndustry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIndustry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Industry with another Field
	 *	@param value
	 */
   public void setIndustry(Field source) {
      securityRecord.setIndustry(source);
   }  
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIndustry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIndustry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sedol
	 *	@return sedol
	 */
   public char[] getSedol() throws CFException  {              
   		return securityRecord.getSedol();
   }

  
	/**
	*  set variable sedol
	*  @param value
	**/
   public void setSedol(char[] value) throws CFException {
      securityRecord.setSedol(value);
   } 

     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSedol(source, sourceIndex);
   	
   }
   
   public void setSedol(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSedol(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sedol with another Field
	 *	@param value
	 */
   public void setSedol(Field source) {
      securityRecord.setSedol(source);
   }  
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of company01
	 *	@return company01
	 */
   public char[] getCompany01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getCompany01();
   }

  
	/**
	*  set variable company01
	*  @param value
	**/
   public void setCompany01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setCompany01(value);
   } 

     /**
	 * 	Update Company01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompany01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setCompany01(source, sourceIndex);
   	
   }
   
   public void setCompany01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setCompany01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Company01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompany01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCompany01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Company01 with another Field
	 *	@param value
	 */
   public void setCompany01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setCompany01(source);
   }  
   
     /**
	 * 	Update Company01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompany01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setCompany01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Company01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompany01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCompany01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of country01
	 *	@return country01
	 */
   public char[] getCountry01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getCountry01();
   }

  
	/**
	*  set variable country01
	*  @param value
	**/
   public void setCountry01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setCountry01(value);
   } 

     /**
	 * 	Update Country01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setCountry01(source, sourceIndex);
   	
   }
   
   public void setCountry01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setCountry01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Country01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCountry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Country01 with another Field
	 *	@param value
	 */
   public void setCountry01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setCountry01(source);
   }  
   
     /**
	 * 	Update Country01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setCountry01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Country01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCountry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sector
	 *	@return sector
	 */
   public char[] getSector() throws CFException  {              
   		return securityRecord.getSector();
   }

  
	/**
	*  set variable sector
	*  @param value
	**/
   public void setSector(char[] value) throws CFException {
      securityRecord.setSector(value);
   } 

     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSector(source, sourceIndex);
   	
   }
   
   public void setSector(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSector(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSector(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sector with another Field
	 *	@param value
	 */
   public void setSector(Field source) {
      securityRecord.setSector(source);
   }  
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSector(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSector(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsReturnCode
	 *	@return lsReturnCode
	 */
	public short getLsReturnCode() throws CFException {        
   		return dfhcommarea.getLsReturnCode();
	}
	
	/**
	 * 	Update LsReturnCode with the passed value
	 *	@param number
	 */
	public void setLsReturnCode(short number)  throws CFException{
		dfhcommarea.setLsReturnCode(number);
	}

	public void setLsReturnCode(int number)  throws CFException{
		dfhcommarea.setLsReturnCode((short)number);
	}

	public void setLsReturnCode(long number)  throws CFException{
		dfhcommarea.setLsReturnCode((short)number);
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




        public Cics0012Ctx getCics0012Ctx() {
            return Cics0012Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dfhcommarea.hashCode();
        str += securityRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public IndustryRequestOutCtx clone() {
        IndustryRequestOutCtx cloneObj = new IndustryRequestOutCtx();
        cloneObj.dfhcommarea = new Dfhcommarea();
        cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
        cloneObj.securityRecord = new SecurityRecord();
        cloneObj.securityRecord.set(securityRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public IndustryRequestOutCtx getIndustryRequestOutCtx() {
            return new IndustryRequestOutCtx();
    }
     public class SectorRequestInCtx implements Cloneable {
     Dfhcommarea dfhcommarea = Cics0012Ctx.this.getDfhcommarea();
     SecurityRecord securityRecord = Cics0012Ctx.this.getSecurityRecord();
     Work work = Cics0012Ctx.this.getWork();

	/**
	 *	Returns the value of vssecu04
	 *	@return vssecu04
	 */
   public char[] getVssecu04() throws CFException  {              
   		return work.getVssecu04();
   }

  
	/**
	*  set variable vssecu04
	*  @param value
	**/
   public void setVssecu04(char[] value) throws CFException {
      work.setVssecu04(value);
   } 

	/**
	 *	Returns the value of country
	 *	@return country
	 */
   public char[] getCountry() throws CFException  {              
   		return securityRecord.getCountry();
   }

  
	/**
	*  set variable country
	*  @param value
	**/
   public void setCountry(char[] value) throws CFException {
      securityRecord.setCountry(value);
   } 

     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex) throws CFException {
      securityRecord.setCountry(source, sourceIndex);
   	
   }
   
   public void setCountry(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setCountry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Country with another Field
	 *	@param value
	 */
   public void setCountry(Field source) {
      securityRecord.setCountry(source);
   }  
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setCountry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of securityRecord
	 *	@return securityRecord
	 */   
	 public SecurityRecord getSecurityRecord() {
   	return securityRecord;
   }


	/**
	 *	Returns the value of intlkey
	 *	@return intlkey
	 */
   public char[] getIntlkey() throws CFException  {              
   		return securityRecord.getIntlkey();
   }

  
	/**
	*  set variable intlkey
	*  @param value
	**/
   public void setIntlkey(char[] value) throws CFException {
      securityRecord.setIntlkey(value);
   } 

     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIntlkey(source, sourceIndex);
   	
   }
   
   public void setIntlkey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Intlkey with another Field
	 *	@param value
	 */
   public void setIntlkey(Field source) {
      securityRecord.setIntlkey(source);
   }  
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsSectorKey
	 *	@return lsSectorKey
	 */
   public char[] getLsSectorKey() throws CFException  {              
   		return dfhcommarea.getLsSectorKey();
   }

  
	/**
	*  set variable lsSectorKey
	*  @param value
	**/
   public void setLsSectorKey(char[] value) throws CFException {
      dfhcommarea.setLsSectorKey(value);
   } 

     /**
	 * 	Update LsSectorKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsSectorKey(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setLsSectorKey(source, sourceIndex);
   	
   }
   
   public void setLsSectorKey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setLsSectorKey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsSectorKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsSectorKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setLsSectorKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsSectorKey with another Field
	 *	@param value
	 */
   public void setLsSectorKey(Field source) {
      dfhcommarea.setLsSectorKey(source);
   }  
   
     /**
	 * 	Update LsSectorKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsSectorKey(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setLsSectorKey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsSectorKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsSectorKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setLsSectorKey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of company
	 *	@return company
	 */
   public char[] getCompany() throws CFException  {              
   		return securityRecord.getCompany();
   }

  
	/**
	*  set variable company
	*  @param value
	**/
   public void setCompany(char[] value) throws CFException {
      securityRecord.setCompany(value);
   } 

     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex) throws CFException {
      securityRecord.setCompany(source, sourceIndex);
   	
   }
   
   public void setCompany(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setCompany(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Company with another Field
	 *	@param value
	 */
   public void setCompany(Field source) {
      securityRecord.setCompany(source);
   }  
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currencycd
	 *	@return currencycd
	 */
   public char[] getCurrencycd() throws CFException  {              
   		return securityRecord.getCurrencycd();
   }

  
	/**
	*  set variable currencycd
	*  @param value
	**/
   public void setCurrencycd(char[] value) throws CFException {
      securityRecord.setCurrencycd(value);
   } 

     /**
	 * 	Update Currencycd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrencycd(char[] source, int sourceIndex) throws CFException {
      securityRecord.setCurrencycd(source, sourceIndex);
   	
   }
   
   public void setCurrencycd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Currencycd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Currencycd with another Field
	 *	@param value
	 */
   public void setCurrencycd(Field source) {
      securityRecord.setCurrencycd(source);
   }  
   
     /**
	 * 	Update Currencycd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrencycd(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Currencycd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of vssecu01
	 *	@return vssecu01
	 */
   public char[] getVssecu01() throws CFException  {              
   		return work.getVssecu01();
   }

  
	/**
	*  set variable vssecu01
	*  @param value
	**/
   public void setVssecu01(char[] value) throws CFException {
      work.setVssecu01(value);
   } 

	/**
	 *	Returns the value of keylen
	 *	@return keylen
	 */
	public int getKeylen() throws CFException {        
   		return work.getKeylen();
	}
	
	/**
	 * 	Update Keylen with the passed value
	 *	@param number
	 */
	public void setKeylen(int number)  throws CFException{
		work.setKeylen(number);
	}


	public void setKeylen(long number)  throws CFException{
		work.setKeylen((int)number);
	}


	/**
	 *	Returns the value of isin
	 *	@return isin
	 */
   public char[] getIsin() throws CFException  {              
   		return securityRecord.getIsin();
   }

  
	/**
	*  set variable isin
	*  @param value
	**/
   public void setIsin(char[] value) throws CFException {
      securityRecord.setIsin(value);
   } 

     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIsin(source, sourceIndex);
   	
   }
   
   public void setIsin(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIsin(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Isin with another Field
	 *	@param value
	 */
   public void setIsin(Field source) {
      securityRecord.setIsin(source);
   }  
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sectorweight
	 *	@return sectorweight
	 */
   public char[] getSectorweight() throws CFException  {              
   		return securityRecord.getSectorweight();
   }

  
	/**
	*  set variable sectorweight
	*  @param value
	**/
   public void setSectorweight(char[] value) throws CFException {
      securityRecord.setSectorweight(value);
   } 

     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSectorweight(source, sourceIndex);
   	
   }
   
   public void setSectorweight(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sectorweight with another Field
	 *	@param value
	 */
   public void setSectorweight(Field source) {
      securityRecord.setSectorweight(source);
   }  
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ric
	 *	@return ric
	 */
   public char[] getRic() throws CFException  {              
   		return securityRecord.getRic();
   }

  
	/**
	*  set variable ric
	*  @param value
	**/
   public void setRic(char[] value) throws CFException {
      securityRecord.setRic(value);
   } 

     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex) throws CFException {
      securityRecord.setRic(source, sourceIndex);
   	
   }
   
   public void setRic(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setRic(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ric with another Field
	 *	@param value
	 */
   public void setRic(Field source) {
      securityRecord.setRic(source);
   }  
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsOutputCount
	 *	@return lsOutputCount
	 */
	public int getLsOutputCount() throws CFException {
   		return dfhcommarea.getLsOutputCount();
	}


	/**
	 *	Returns String value of lsOutputCount
	 *	@return lsOutputCount
	 */
	public char[]  getLsOutputCountString() throws CFException {
	     return String.valueOf(dfhcommarea.getLsOutputCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsOutputCountIsNumeric()  throws CFException{
	    return dfhcommarea.lsOutputCountIsNumeric();
	}

	/**
	 * 	Update LsOutputCount with the passed value
	 *	@param number
	 */
	public void setLsOutputCount(int number)  throws CFException{
		dfhcommarea.setLsOutputCount(number);
	}
	

	public void setLsOutputCount(long number)  throws CFException{
	    dfhcommarea.setLsOutputCount(number);
	}
	
	
	/**
	 * 	Update LsOutputCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsOutputCount(char[] value)  throws CFException {
		dfhcommarea.setLsOutputCount(value);
	}
	
	/**
	 * 	Update LsOutputCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsOutputCountString(char[] value)  throws CFException{
		dfhcommarea.setLsOutputCount(value);
	}	

	/**
	 *	Returns the value of ffmcapmilusd
	 *	@return ffmcapmilusd
	 */
	public int getFfmcapmilusd() throws CFException {        
   		return securityRecord.getFfmcapmilusd();
	}
	
	/**
	 * 	Update Ffmcapmilusd with the passed value
	 *	@param number
	 */
	public void setFfmcapmilusd(int number)  throws CFException{
		securityRecord.setFfmcapmilusd(number);
	}


	public void setFfmcapmilusd(long number)  throws CFException{
		securityRecord.setFfmcapmilusd((int)number);
	}


	/**
	 *	Returns the value of industry
	 *	@return industry
	 */
   public char[] getIndustry() throws CFException  {              
   		return securityRecord.getIndustry();
   }

  
	/**
	*  set variable industry
	*  @param value
	**/
   public void setIndustry(char[] value) throws CFException {
      securityRecord.setIndustry(value);
   } 

     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIndustry(source, sourceIndex);
   	
   }
   
   public void setIndustry(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIndustry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIndustry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Industry with another Field
	 *	@param value
	 */
   public void setIndustry(Field source) {
      securityRecord.setIndustry(source);
   }  
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIndustry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIndustry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sedol
	 *	@return sedol
	 */
   public char[] getSedol() throws CFException  {              
   		return securityRecord.getSedol();
   }

  
	/**
	*  set variable sedol
	*  @param value
	**/
   public void setSedol(char[] value) throws CFException {
      securityRecord.setSedol(value);
   } 

     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSedol(source, sourceIndex);
   	
   }
   
   public void setSedol(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSedol(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sedol with another Field
	 *	@param value
	 */
   public void setSedol(Field source) {
      securityRecord.setSedol(source);
   }  
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen, targetIndex, targetLen);
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




        public Cics0012Ctx getCics0012Ctx() {
            return Cics0012Ctx.this;
        }

        public SectorRequestOutCtx getSectorRequestOutCtx() {
            return new SectorRequestOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dfhcommarea.hashCode();
        str += securityRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public SectorRequestInCtx clone() {
        SectorRequestInCtx cloneObj = new SectorRequestInCtx();
        cloneObj.dfhcommarea = new Dfhcommarea();
        cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
        cloneObj.securityRecord = new SecurityRecord();
        cloneObj.securityRecord.set(securityRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SectorRequestInCtx getSectorRequestInCtx() {
            return new SectorRequestInCtx();
    }
     public class SectorRequestOutCtx implements Cloneable {
     Dfhcommarea dfhcommarea = Cics0012Ctx.this.getDfhcommarea();
     SecurityRecord securityRecord = Cics0012Ctx.this.getSecurityRecord();
     Work work = Cics0012Ctx.this.getWork();

	/**
	 *	Returns the value of sedol01
	 *	@return sedol01
	 */
   public char[] getSedol01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getSedol01();
   }

  
	/**
	*  set variable sedol01
	*  @param value
	**/
   public void setSedol01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setSedol01(value);
   } 

     /**
	 * 	Update Sedol01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSedol01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setSedol01(source, sourceIndex);
   	
   }
   
   public void setSedol01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setSedol01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sedol01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSedol01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSedol01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sedol01 with another Field
	 *	@param value
	 */
   public void setSedol01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setSedol01(source);
   }  
   
     /**
	 * 	Update Sedol01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSedol01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setSedol01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sedol01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSedol01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSedol01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of country
	 *	@return country
	 */
   public char[] getCountry() throws CFException  {              
   		return securityRecord.getCountry();
   }

  
	/**
	*  set variable country
	*  @param value
	**/
   public void setCountry(char[] value) throws CFException {
      securityRecord.setCountry(value);
   } 

     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex) throws CFException {
      securityRecord.setCountry(source, sourceIndex);
   	
   }
   
   public void setCountry(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setCountry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Country with another Field
	 *	@param value
	 */
   public void setCountry(Field source) {
      securityRecord.setCountry(source);
   }  
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setCountry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of industry01
	 *	@return industry01
	 */
   public char[] getIndustry01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getIndustry01();
   }

  
	/**
	*  set variable industry01
	*  @param value
	**/
   public void setIndustry01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setIndustry01(value);
   } 

     /**
	 * 	Update Industry01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIndustry01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setIndustry01(source, sourceIndex);
   	
   }
   
   public void setIndustry01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setIndustry01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Industry01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIndustry01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIndustry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Industry01 with another Field
	 *	@param value
	 */
   public void setIndustry01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setIndustry01(source);
   }  
   
     /**
	 * 	Update Industry01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIndustry01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setIndustry01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Industry01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIndustry01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIndustry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sectorweight01
	 *	@return sectorweight01
	 */
   public char[] getSectorweight01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getSectorweight01();
   }

  
	/**
	*  set variable sectorweight01
	*  @param value
	**/
   public void setSectorweight01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setSectorweight01(value);
   } 

     /**
	 * 	Update Sectorweight01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSectorweight01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source, sourceIndex);
   	
   }
   
   public void setSectorweight01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sectorweight01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sectorweight01 with another Field
	 *	@param value
	 */
   public void setSectorweight01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source);
   }  
   
     /**
	 * 	Update Sectorweight01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSectorweight01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sectorweight01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSectorweight01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ric01
	 *	@return ric01
	 */
   public char[] getRic01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getRic01();
   }

  
	/**
	*  set variable ric01
	*  @param value
	**/
   public void setRic01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setRic01(value);
   } 

     /**
	 * 	Update Ric01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRic01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setRic01(source, sourceIndex);
   	
   }
   
   public void setRic01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setRic01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ric01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRic01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setRic01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ric01 with another Field
	 *	@param value
	 */
   public void setRic01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setRic01(source);
   }  
   
     /**
	 * 	Update Ric01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRic01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setRic01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ric01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRic01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setRic01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "Y" for isEndOfFile()
	 *	@return  Returns true if isEndOfFile() is "Y"
	 */
   public boolean isEndOfFile() throws CFException {
      return work.isEndOfFile();
   }

	/**
	*  set values "Y"
	*/
   	public void setEndOfFileTrue()  throws CFException{  			
    	work.setEndOfFileTrue();
   	}
	/**
	 *	Returns the value of currencycd
	 *	@return currencycd
	 */
   public char[] getCurrencycd() throws CFException  {              
   		return securityRecord.getCurrencycd();
   }

  
	/**
	*  set variable currencycd
	*  @param value
	**/
   public void setCurrencycd(char[] value) throws CFException {
      securityRecord.setCurrencycd(value);
   } 

     /**
	 * 	Update Currencycd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrencycd(char[] source, int sourceIndex) throws CFException {
      securityRecord.setCurrencycd(source, sourceIndex);
   	
   }
   
   public void setCurrencycd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Currencycd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Currencycd with another Field
	 *	@param value
	 */
   public void setCurrencycd(Field source) {
      securityRecord.setCurrencycd(source);
   }  
   
     /**
	 * 	Update Currencycd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrencycd(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Currencycd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCurrencycd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of keylen
	 *	@return keylen
	 */
	public int getKeylen() throws CFException {        
   		return work.getKeylen();
	}
	
	/**
	 * 	Update Keylen with the passed value
	 *	@param number
	 */
	public void setKeylen(int number)  throws CFException{
		work.setKeylen(number);
	}


	public void setKeylen(long number)  throws CFException{
		work.setKeylen((int)number);
	}


	/**
	 *	Returns the value of isin
	 *	@return isin
	 */
   public char[] getIsin() throws CFException  {              
   		return securityRecord.getIsin();
   }

  
	/**
	*  set variable isin
	*  @param value
	**/
   public void setIsin(char[] value) throws CFException {
      securityRecord.setIsin(value);
   } 

     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIsin(source, sourceIndex);
   	
   }
   
   public void setIsin(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIsin(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Isin 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsin(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Isin with another Field
	 *	@param value
	 */
   public void setIsin(Field source) {
      securityRecord.setIsin(source);
   }  
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Isin 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsin(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIsin(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sectorweight
	 *	@return sectorweight
	 */
   public char[] getSectorweight() throws CFException  {              
   		return securityRecord.getSectorweight();
   }

  
	/**
	*  set variable sectorweight
	*  @param value
	**/
   public void setSectorweight(char[] value) throws CFException {
      securityRecord.setSectorweight(value);
   } 

     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSectorweight(source, sourceIndex);
   	
   }
   
   public void setSectorweight(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sectorweight with another Field
	 *	@param value
	 */
   public void setSectorweight(Field source) {
      securityRecord.setSectorweight(source);
   }  
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sectorweight 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSectorweight(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSectorweight(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsEibresp2
	 *	@return lsEibresp2
	 */
	public long getLsEibresp2() throws CFException {
   		return dfhcommarea.getLsEibresp2();
	}


	/**
	 *	Returns String value of lsEibresp2
	 *	@return lsEibresp2
	 */
	public char[]  getLsEibresp2String() throws CFException {
	     return String.valueOf(dfhcommarea.getLsEibresp2String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsEibresp2IsNumeric()  throws CFException{
	    return dfhcommarea.lsEibresp2IsNumeric();
	}

	/**
	 * 	Update LsEibresp2 with the passed value
	 *	@param number
	 */
	public void setLsEibresp2(long number)  throws CFException{
		dfhcommarea.setLsEibresp2(number);
	}
	

	
	/**
	 * 	Update LsEibresp2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsEibresp2(char[] value)  throws CFException {
		dfhcommarea.setLsEibresp2(value);
	}
	
	/**
	 * 	Update LsEibresp2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsEibresp2String(char[] value)  throws CFException{
		dfhcommarea.setLsEibresp2(value);
	}	

	/**
	 *	Returns the value of ric
	 *	@return ric
	 */
   public char[] getRic() throws CFException  {              
   		return securityRecord.getRic();
   }

  
	/**
	*  set variable ric
	*  @param value
	**/
   public void setRic(char[] value) throws CFException {
      securityRecord.setRic(value);
   } 

     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex) throws CFException {
      securityRecord.setRic(source, sourceIndex);
   	
   }
   
   public void setRic(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setRic(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ric 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRic(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ric with another Field
	 *	@param value
	 */
   public void setRic(Field source) {
      securityRecord.setRic(source);
   }  
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Ric 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRic(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setRic(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sector01
	 *	@return sector01
	 */
   public char[] getSector01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getSector01();
   }

  
	/**
	*  set variable sector01
	*  @param value
	**/
   public void setSector01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setSector01(value);
   } 

     /**
	 * 	Update Sector01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSector01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setSector01(source, sourceIndex);
   	
   }
   
   public void setSector01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setSector01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sector01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSector01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSector01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sector01 with another Field
	 *	@param value
	 */
   public void setSector01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setSector01(source);
   }  
   
     /**
	 * 	Update Sector01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSector01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setSector01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sector01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSector01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setSector01(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of currencycd01
	 *	@return currencycd01
	 */
   public char[] getCurrencycd01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getCurrencycd01();
   }

  
	/**
	*  set variable currencycd01
	*  @param value
	**/
   public void setCurrencycd01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(value);
   } 

     /**
	 * 	Update Currencycd01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurrencycd01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source, sourceIndex);
   	
   }
   
   public void setCurrencycd01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Currencycd01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Currencycd01 with another Field
	 *	@param value
	 */
   public void setCurrencycd01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source);
   }  
   
     /**
	 * 	Update Currencycd01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurrencycd01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Currencycd01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrencycd01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCurrencycd01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of isin01
	 *	@return isin01
	 */
   public char[] getIsin01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getIsin01();
   }

  
	/**
	*  set variable isin01
	*  @param value
	**/
   public void setIsin01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setIsin01(value);
   } 

     /**
	 * 	Update Isin01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsin01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setIsin01(source, sourceIndex);
   	
   }
   
   public void setIsin01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setIsin01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Isin01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsin01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIsin01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Isin01 with another Field
	 *	@param value
	 */
   public void setIsin01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setIsin01(source);
   }  
   
     /**
	 * 	Update Isin01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsin01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setIsin01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Isin01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsin01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIsin01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsEibresp
	 *	@return lsEibresp
	 */
	public long getLsEibresp() throws CFException {
   		return dfhcommarea.getLsEibresp();
	}


	/**
	 *	Returns String value of lsEibresp
	 *	@return lsEibresp
	 */
	public char[]  getLsEibrespString() throws CFException {
	     return String.valueOf(dfhcommarea.getLsEibrespString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsEibrespIsNumeric()  throws CFException{
	    return dfhcommarea.lsEibrespIsNumeric();
	}

	/**
	 * 	Update LsEibresp with the passed value
	 *	@param number
	 */
	public void setLsEibresp(long number)  throws CFException{
		dfhcommarea.setLsEibresp(number);
	}
	

	
	/**
	 * 	Update LsEibresp with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsEibresp(char[] value)  throws CFException {
		dfhcommarea.setLsEibresp(value);
	}
	
	/**
	 * 	Update LsEibresp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsEibrespString(char[] value)  throws CFException{
		dfhcommarea.setLsEibresp(value);
	}	

	/**
	 *	Returns the value of intlkey
	 *	@return intlkey
	 */
   public char[] getIntlkey() throws CFException  {              
   		return securityRecord.getIntlkey();
   }

  
	/**
	*  set variable intlkey
	*  @param value
	**/
   public void setIntlkey(char[] value) throws CFException {
      securityRecord.setIntlkey(value);
   } 

     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIntlkey(source, sourceIndex);
   	
   }
   
   public void setIntlkey(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Intlkey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Intlkey with another Field
	 *	@param value
	 */
   public void setIntlkey(Field source) {
      securityRecord.setIntlkey(source);
   }  
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Intlkey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIntlkey(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of intlkey01
	 *	@return intlkey01
	 */
   public char[] getIntlkey01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getIntlkey01();
   }

  
	/**
	*  set variable intlkey01
	*  @param value
	**/
   public void setIntlkey01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setIntlkey01(value);
   } 

     /**
	 * 	Update Intlkey01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIntlkey01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source, sourceIndex);
   	
   }
   
   public void setIntlkey01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Intlkey01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Intlkey01 with another Field
	 *	@param value
	 */
   public void setIntlkey01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source);
   }  
   
     /**
	 * 	Update Intlkey01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIntlkey01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Intlkey01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntlkey01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setIntlkey01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of company
	 *	@return company
	 */
   public char[] getCompany() throws CFException  {              
   		return securityRecord.getCompany();
   }

  
	/**
	*  set variable company
	*  @param value
	**/
   public void setCompany(char[] value) throws CFException {
      securityRecord.setCompany(value);
   } 

     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex) throws CFException {
      securityRecord.setCompany(source, sourceIndex);
   	
   }
   
   public void setCompany(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setCompany(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Company 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompany(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Company with another Field
	 *	@param value
	 */
   public void setCompany(Field source) {
      securityRecord.setCompany(source);
   }  
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Company 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompany(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setCompany(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ffmcapmilusd01
	 *	@return ffmcapmilusd01
	 */
	public int getFfmcapmilusd01(int index) throws CFException {        
   		return dfhcommarea.getLsOutputData(index).getFfmcapmilusd01();
	}
	
	/**
	 * 	Update Ffmcapmilusd01 with the passed value
	 *	@param number
	 */
	public void setFfmcapmilusd01(int index,int number)  throws CFException{
		dfhcommarea.getLsOutputData(index).setFfmcapmilusd01(number);
	}


	public void setFfmcapmilusd01(int index,long number)  throws CFException{
		dfhcommarea.getLsOutputData(index).setFfmcapmilusd01((int)number);
	}


	/**
	 *	Returns the value of lsOutputCount
	 *	@return lsOutputCount
	 */
	public int getLsOutputCount() throws CFException {
   		return dfhcommarea.getLsOutputCount();
	}


	/**
	 *	Returns String value of lsOutputCount
	 *	@return lsOutputCount
	 */
	public char[]  getLsOutputCountString() throws CFException {
	     return String.valueOf(dfhcommarea.getLsOutputCountString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsOutputCountIsNumeric()  throws CFException{
	    return dfhcommarea.lsOutputCountIsNumeric();
	}

	/**
	 * 	Update LsOutputCount with the passed value
	 *	@param number
	 */
	public void setLsOutputCount(int number)  throws CFException{
		dfhcommarea.setLsOutputCount(number);
	}
	

	public void setLsOutputCount(long number)  throws CFException{
	    dfhcommarea.setLsOutputCount(number);
	}
	
	
	/**
	 * 	Update LsOutputCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsOutputCount(char[] value)  throws CFException {
		dfhcommarea.setLsOutputCount(value);
	}
	
	/**
	 * 	Update LsOutputCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsOutputCountString(char[] value)  throws CFException{
		dfhcommarea.setLsOutputCount(value);
	}	

	/**
	 *	Returns the value of ffmcapmilusd
	 *	@return ffmcapmilusd
	 */
	public int getFfmcapmilusd() throws CFException {        
   		return securityRecord.getFfmcapmilusd();
	}
	
	/**
	 * 	Update Ffmcapmilusd with the passed value
	 *	@param number
	 */
	public void setFfmcapmilusd(int number)  throws CFException{
		securityRecord.setFfmcapmilusd(number);
	}


	public void setFfmcapmilusd(long number)  throws CFException{
		securityRecord.setFfmcapmilusd((int)number);
	}


	/**
	 *	Returns the value of industry
	 *	@return industry
	 */
   public char[] getIndustry() throws CFException  {              
   		return securityRecord.getIndustry();
   }

  
	/**
	*  set variable industry
	*  @param value
	**/
   public void setIndustry(char[] value) throws CFException {
      securityRecord.setIndustry(value);
   } 

     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex) throws CFException {
      securityRecord.setIndustry(source, sourceIndex);
   	
   }
   
   public void setIndustry(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setIndustry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Industry 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIndustry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Industry with another Field
	 *	@param value
	 */
   public void setIndustry(Field source) {
      securityRecord.setIndustry(source);
   }  
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setIndustry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Industry 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIndustry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setIndustry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sedol
	 *	@return sedol
	 */
   public char[] getSedol() throws CFException  {              
   		return securityRecord.getSedol();
   }

  
	/**
	*  set variable sedol
	*  @param value
	**/
   public void setSedol(char[] value) throws CFException {
      securityRecord.setSedol(value);
   } 

     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSedol(source, sourceIndex);
   	
   }
   
   public void setSedol(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSedol(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sedol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSedol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sedol with another Field
	 *	@param value
	 */
   public void setSedol(Field source) {
      securityRecord.setSedol(source);
   }  
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sedol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSedol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSedol(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of company01
	 *	@return company01
	 */
   public char[] getCompany01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getCompany01();
   }

  
	/**
	*  set variable company01
	*  @param value
	**/
   public void setCompany01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setCompany01(value);
   } 

     /**
	 * 	Update Company01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCompany01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setCompany01(source, sourceIndex);
   	
   }
   
   public void setCompany01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setCompany01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Company01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCompany01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCompany01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Company01 with another Field
	 *	@param value
	 */
   public void setCompany01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setCompany01(source);
   }  
   
     /**
	 * 	Update Company01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCompany01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setCompany01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Company01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCompany01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCompany01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of country01
	 *	@return country01
	 */
   public char[] getCountry01(int index) throws CFException  {              
   		return dfhcommarea.getLsOutputData(index).getCountry01();
   }

  
	/**
	*  set variable country01
	*  @param value
	**/
   public void setCountry01(int index,char[] value) throws CFException {
      dfhcommarea.getLsOutputData(index).setCountry01(value);
   } 

     /**
	 * 	Update Country01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry01(int index,char[] source, int sourceIndex) throws CFException {
      dfhcommarea.getLsOutputData(index).setCountry01(source, sourceIndex);
   	
   }
   
   public void setCountry01(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.getLsOutputData(index).setCountry01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Country01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry01(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCountry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Country01 with another Field
	 *	@param value
	 */
   public void setCountry01(int index,Field source) {
      dfhcommarea.getLsOutputData(index).setCountry01(source);
   }  
   
     /**
	 * 	Update Country01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry01(int index,Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.getLsOutputData(index).setCountry01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Country01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry01(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.getLsOutputData(index).setCountry01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sector
	 *	@return sector
	 */
   public char[] getSector() throws CFException  {              
   		return securityRecord.getSector();
   }

  
	/**
	*  set variable sector
	*  @param value
	**/
   public void setSector(char[] value) throws CFException {
      securityRecord.setSector(value);
   } 

     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex) throws CFException {
      securityRecord.setSector(source, sourceIndex);
   	
   }
   
   public void setSector(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      securityRecord.setSector(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Sector 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSector(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSector(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Sector with another Field
	 *	@param value
	 */
   public void setSector(Field source) {
      securityRecord.setSector(source);
   }  
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen) {
      securityRecord.setSector(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Sector 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSector(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      securityRecord.setSector(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsReturnCode
	 *	@return lsReturnCode
	 */
	public short getLsReturnCode() throws CFException {        
   		return dfhcommarea.getLsReturnCode();
	}
	
	/**
	 * 	Update LsReturnCode with the passed value
	 *	@param number
	 */
	public void setLsReturnCode(short number)  throws CFException{
		dfhcommarea.setLsReturnCode(number);
	}

	public void setLsReturnCode(int number)  throws CFException{
		dfhcommarea.setLsReturnCode((short)number);
	}

	public void setLsReturnCode(long number)  throws CFException{
		dfhcommarea.setLsReturnCode((short)number);
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




        public Cics0012Ctx getCics0012Ctx() {
            return Cics0012Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dfhcommarea.hashCode();
        str += securityRecord.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public SectorRequestOutCtx clone() {
        SectorRequestOutCtx cloneObj = new SectorRequestOutCtx();
        cloneObj.dfhcommarea = new Dfhcommarea();
        cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
        cloneObj.securityRecord = new SecurityRecord();
        cloneObj.securityRecord.set(securityRecord.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SectorRequestOutCtx getSectorRequestOutCtx() {
            return new SectorRequestOutCtx();
    }
}
