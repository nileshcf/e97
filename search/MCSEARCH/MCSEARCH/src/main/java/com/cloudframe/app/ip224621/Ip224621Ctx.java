package com.cloudframe.app.ip224621;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.ip224621.dto.AbendParaName900;
import com.cloudframe.app.ip224621.dto.Pds501S1s2s3Table500;
import com.cloudframe.app.ip224621.dto.Pds501S1s2s3Entries500;
import com.cloudframe.app.ip224621.dto.AbendMessage900;
import com.cloudframe.app.ip224621.dto.Pds501Value800;
import com.cloudframe.app.global.sharedvar.McIpmMsg;
import com.cloudframe.app.global.sharedvar.Ip30331FinAddndmEntries;
import com.cloudframe.app.ip224621.dto.Work;


@Context
public class Ip224621Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    AbendMessage900 abendMessage900;
    Ip30331FinAddndmEntries ip30331FinAddndmEntries;
    Pds501S1s2s3Entries500 pds501S1s2s3Entries500;
    Pds501Value800 pds501Value800;
    AbendParaName900 abendParaName900;
    McIpmMsg mcIpmMsg;
    Work work;

    int pds501TblIdx500;

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


    public AbendMessage900 getAbendMessage900() {
        if (abendMessage900 == null) {
            abendMessage900 = new AbendMessage900();
        }

        return abendMessage900;
    }

    public void setAbendMessage900(AbendMessage900 abendMessage900) {
        this.abendMessage900 = abendMessage900;
    }
    public Ip30331FinAddndmEntries getIp30331FinAddndmEntries() {
        if (ip30331FinAddndmEntries == null) {
            ip30331FinAddndmEntries = globalCtx.getGlobalDto(Ip30331FinAddndmEntries.class);
        }

        return ip30331FinAddndmEntries;
    }

    public Pds501S1s2s3Entries500 getPds501S1s2s3Entries500() {
        if (pds501S1s2s3Entries500 == null) {
            pds501S1s2s3Entries500 = new Pds501S1s2s3Entries500();
        }

        return pds501S1s2s3Entries500;
    }

    public void setPds501S1s2s3Entries500(Pds501S1s2s3Entries500 pds501S1s2s3Entries500) {
        this.pds501S1s2s3Entries500 = pds501S1s2s3Entries500;
    }
    public Pds501Value800 getPds501Value800() {
        if (pds501Value800 == null) {
            pds501Value800 = new Pds501Value800();
        }

        return pds501Value800;
    }

    public void setPds501Value800(Pds501Value800 pds501Value800) {
        this.pds501Value800 = pds501Value800;
    }
    public AbendParaName900 getAbendParaName900() {
        if (abendParaName900 == null) {
            abendParaName900 = new AbendParaName900();
        }

        return abendParaName900;
    }

    public void setAbendParaName900(AbendParaName900 abendParaName900) {
        this.abendParaName900 = abendParaName900;
    }
    public McIpmMsg getMcIpmMsg() {
        if (mcIpmMsg == null) {
            mcIpmMsg = globalCtx.getGlobalDto(McIpmMsg.class);
        }

        return mcIpmMsg;
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

    public int getPds501TblIdx500() {
        return pds501TblIdx500;
    }

    public void setPds501TblIdx500(int pds501TblIdx500) {
        this.pds501TblIdx500 = pds501TblIdx500;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendMessage900.hashCode();
        str += ip30331FinAddndmEntries.hashCode();
        str += pds501S1s2s3Entries500.hashCode();
        str += pds501Value800.hashCode();
        str += abendParaName900.hashCode();
        str += mcIpmMsg.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Ip224621Ctx clone() {
        Ip224621Ctx cloneObj = new Ip224621Ctx();
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.ip30331FinAddndmEntries = new Ip30331FinAddndmEntries();
        cloneObj.ip30331FinAddndmEntries.set(ip30331FinAddndmEntries.getClonedField());
        cloneObj.pds501S1s2s3Entries500 = new Pds501S1s2s3Entries500();
        cloneObj.pds501S1s2s3Entries500.set(pds501S1s2s3Entries500.getClonedField());
        cloneObj.pds501Value800 = new Pds501Value800();
        cloneObj.pds501Value800.set(pds501Value800.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.mcIpmMsg = new McIpmMsg();
        cloneObj.mcIpmMsg.set(mcIpmMsg.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class PerformInitializationInCtx implements Cloneable {
     Pds501S1s2s3Entries500 pds501S1s2s3Entries500 = Ip224621Ctx.this.getPds501S1s2s3Entries500();
     Work work = Ip224621Ctx.this.getWork();

	/**
	 *	Test condition "Y" for isItIsTheFirstTime88100()
	 *	@return  Returns true if isItIsTheFirstTime88100() is "Y"
	 */
   public boolean isItIsTheFirstTime88100() throws CFException {
      return work.isItIsTheFirstTime88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsTheFirstTime88100True()  throws CFException{  			
    	work.setItIsTheFirstTime88100True();
   	}

        public Ip224621Ctx getIp224621Ctx() {
            return Ip224621Ctx.this;
        }

        public PerformInitializationOutCtx getPerformInitializationOutCtx() {
            return new PerformInitializationOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += pds501S1s2s3Entries500.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public PerformInitializationInCtx clone() {
        PerformInitializationInCtx cloneObj = new PerformInitializationInCtx();
        cloneObj.pds501S1s2s3Entries500 = new Pds501S1s2s3Entries500();
        cloneObj.pds501S1s2s3Entries500.set(pds501S1s2s3Entries500.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public PerformInitializationInCtx getPerformInitializationInCtx() {
            return new PerformInitializationInCtx();
    }
     public class PerformInitializationOutCtx implements Cloneable {
     Pds501S1s2s3Entries500 pds501S1s2s3Entries500 = Ip224621Ctx.this.getPds501S1s2s3Entries500();
     Work work = Ip224621Ctx.this.getWork();

	/**
	 *	Test condition "N" for isItIsNotFirstTime88100()
	 *	@return  Returns true if isItIsNotFirstTime88100() is "N"
	 */
   public boolean isItIsNotFirstTime88100() throws CFException {
      return work.isItIsNotFirstTime88100();
   }

	/**
	*  set values "N"
	*/
   	public void setItIsNotFirstTime88100True()  throws CFException{  			
    	work.setItIsNotFirstTime88100True();
   	}
	/**
	 *	Test condition "Y" for isOccurrenceIsValid88100()
	 *	@return  Returns true if isOccurrenceIsValid88100() is "Y"
	 */
   public boolean isOccurrenceIsValid88100() throws CFException {
      return work.isOccurrenceIsValid88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setOccurrenceIsValid88100True()  throws CFException{  			
    	work.setOccurrenceIsValid88100True();
   	}
	/**
	 *	Returns the value of pds501S1s2s3Tcnt500
	 *	@return pds501S1s2s3Tcnt500
	 */
	public short getPds501S1s2s3Tcnt500() throws CFException {        
   		return pds501S1s2s3Entries500.getPds501S1s2s3Tcnt500();
	}
	
	/**
	 * 	Update Pds501S1s2s3Tcnt500 with the passed value
	 *	@param number
	 */
	public void setPds501S1s2s3Tcnt500(short number)  throws CFException{
		pds501S1s2s3Entries500.setPds501S1s2s3Tcnt500(number);
	}

	public void setPds501S1s2s3Tcnt500(int number)  throws CFException{
		pds501S1s2s3Entries500.setPds501S1s2s3Tcnt500((short)number);
	}

	public void setPds501S1s2s3Tcnt500(long number)  throws CFException{
		pds501S1s2s3Entries500.setPds501S1s2s3Tcnt500((short)number);
	}



	/**
	 *	Test condition "Y" for isCombinationFound88100()
	 *	@return  Returns true if isCombinationFound88100() is "Y"
	 */
   public boolean isCombinationFound88100() throws CFException {
      return work.isCombinationFound88100();
   }

	/**
	*  set values "Y"
	*/
   	public void setCombinationFound88100True()  throws CFException{  			
    	work.setCombinationFound88100True();
   	}

        public Ip224621Ctx getIp224621Ctx() {
            return Ip224621Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += pds501S1s2s3Entries500.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public PerformInitializationOutCtx clone() {
        PerformInitializationOutCtx cloneObj = new PerformInitializationOutCtx();
        cloneObj.pds501S1s2s3Entries500 = new Pds501S1s2s3Entries500();
        cloneObj.pds501S1s2s3Entries500.set(pds501S1s2s3Entries500.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public PerformInitializationOutCtx getPerformInitializationOutCtx() {
            return new PerformInitializationOutCtx();
    }
     public class PerformEditInCtx implements Cloneable {
     Pds501Value800 pds501Value800 = Ip224621Ctx.this.getPds501Value800();
     Work work = Ip224621Ctx.this.getWork();
     McIpmMsg mcIpmMsg = Ip224621Ctx.this.getMcIpmMsg();

	/**
	 *	Returns the value of mcIpmMsgTxt
	 *	@return mcIpmMsgTxt
	 */
   public char[] getMcIpmMsgTxt() throws CFException  {              
   		return mcIpmMsg.getMcIpmMsgTxt();
   }

  
	/**
	*  set variable mcIpmMsgTxt
	*  @param value
	**/
   public void setMcIpmMsgTxt(char[] value) throws CFException {
      mcIpmMsg.setMcIpmMsgTxt(value);
   } 

     /**
	 * 	Update McIpmMsgTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMcIpmMsgTxt(char[] source, int sourceIndex) throws CFException {
      mcIpmMsg.setMcIpmMsgTxt(source, sourceIndex);
   	
   }
   
   public void setMcIpmMsgTxt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      mcIpmMsg.setMcIpmMsgTxt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update McIpmMsgTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMcIpmMsgTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      mcIpmMsg.setMcIpmMsgTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update McIpmMsgTxt with another Field
	 *	@param value
	 */
   public void setMcIpmMsgTxt(Field source) {
      mcIpmMsg.setMcIpmMsgTxt(source);
   }  
   
     /**
	 * 	Update McIpmMsgTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMcIpmMsgTxt(Field source, int sourceIndex,int sourceLen) {
      mcIpmMsg.setMcIpmMsgTxt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update McIpmMsgTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMcIpmMsgTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      mcIpmMsg.setMcIpmMsgTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "N" for isOccurrenceIsInvalid88100()
	 *	@return  Returns true if isOccurrenceIsInvalid88100() is "N"
	 */
   public boolean isOccurrenceIsInvalid88100() throws CFException {
      return work.isOccurrenceIsInvalid88100();
   }

	/**
	*  set values "N"
	*/
   	public void setOccurrenceIsInvalid88100True()  throws CFException{  			
    	work.setOccurrenceIsInvalid88100True();
   	}

        public Ip224621Ctx getIp224621Ctx() {
            return Ip224621Ctx.this;
        }

        public PerformEditOutCtx getPerformEditOutCtx() {
            return new PerformEditOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += pds501Value800.hashCode();
        str += work.hashCode();
        str += mcIpmMsg.hashCode();
       return str.hashCode();
    }

    public PerformEditInCtx clone() {
        PerformEditInCtx cloneObj = new PerformEditInCtx();
        cloneObj.pds501Value800 = new Pds501Value800();
        cloneObj.pds501Value800.set(pds501Value800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.mcIpmMsg = new McIpmMsg();
        cloneObj.mcIpmMsg.set(mcIpmMsg.getClonedField());
        return cloneObj;
    }

    }

    public PerformEditInCtx getPerformEditInCtx() {
            return new PerformEditInCtx();
    }
     public class PerformEditOutCtx implements Cloneable {
     Pds501Value800 pds501Value800 = Ip224621Ctx.this.getPds501Value800();
     McIpmMsg mcIpmMsg = Ip224621Ctx.this.getMcIpmMsg();
     Work work = Ip224621Ctx.this.getWork();

	/**
	 *	Returns the value of mcIpmMsgTxt
	 *	@return mcIpmMsgTxt
	 */
   public char[] getMcIpmMsgTxt() throws CFException  {              
   		return mcIpmMsg.getMcIpmMsgTxt();
   }

  
	/**
	*  set variable mcIpmMsgTxt
	*  @param value
	**/
   public void setMcIpmMsgTxt(char[] value) throws CFException {
      mcIpmMsg.setMcIpmMsgTxt(value);
   } 

     /**
	 * 	Update McIpmMsgTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMcIpmMsgTxt(char[] source, int sourceIndex) throws CFException {
      mcIpmMsg.setMcIpmMsgTxt(source, sourceIndex);
   	
   }
   
   public void setMcIpmMsgTxt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      mcIpmMsg.setMcIpmMsgTxt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update McIpmMsgTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMcIpmMsgTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      mcIpmMsg.setMcIpmMsgTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update McIpmMsgTxt with another Field
	 *	@param value
	 */
   public void setMcIpmMsgTxt(Field source) {
      mcIpmMsg.setMcIpmMsgTxt(source);
   }  
   
     /**
	 * 	Update McIpmMsgTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMcIpmMsgTxt(Field source, int sourceIndex,int sourceLen) {
      mcIpmMsg.setMcIpmMsgTxt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update McIpmMsgTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMcIpmMsgTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      mcIpmMsg.setMcIpmMsgTxt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pds501Value800
	 *	@return pds501Value800
	 */   
	 public Pds501Value800 getPds501Value800() {
   	return pds501Value800;
   }



        public Ip224621Ctx getIp224621Ctx() {
            return Ip224621Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += pds501Value800.hashCode();
        str += mcIpmMsg.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public PerformEditOutCtx clone() {
        PerformEditOutCtx cloneObj = new PerformEditOutCtx();
        cloneObj.pds501Value800 = new Pds501Value800();
        cloneObj.pds501Value800.set(pds501Value800.getClonedField());
        cloneObj.mcIpmMsg = new McIpmMsg();
        cloneObj.mcIpmMsg.set(mcIpmMsg.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public PerformEditOutCtx getPerformEditOutCtx() {
            return new PerformEditOutCtx();
    }
     public class SearchCombinationInCtx implements Cloneable {
     Pds501S1s2s3Entries500 pds501S1s2s3Entries500 = Ip224621Ctx.this.getPds501S1s2s3Entries500();
     Pds501Value800 pds501Value800 = Ip224621Ctx.this.getPds501Value800();
     Work work = Ip224621Ctx.this.getWork();

	/**
	 *	Returns the value of pds501S1s2s3Table500
	 *	@return pds501S1s2s3Table500
	 */   
	 public Pds501S1s2s3Table500 getPds501S1s2s3Table500(int index) {
   	return pds501S1s2s3Entries500.getPds501S1s2s3Table500(index);
   }

    public List<Pds501S1s2s3Table500> getPds501S1s2s3Table500() {
        return pds501S1s2s3Entries500.getPds501S1s2s3Table500();
    }
   /**
	* 	Update Pds501S1s2s3Table500 with the passed value
	*	@param value
	*/
   public void setPds501S1s2s3Table500(int index,char[] value) throws CFException {
      pds501S1s2s3Entries500.setPds501S1s2s3Table500((index),value);
   }   


	/**
	 *	Returns the value of pds501S1s2s3Entries500
	 *	@return pds501S1s2s3Entries500
	 */   
	 public Pds501S1s2s3Entries500 getPds501S1s2s3Entries500() {
   	return pds501S1s2s3Entries500;
   }


	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public int getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300(number);
	}


	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((int)number);
	}


	/**
	 *	Returns the value of pds501s2Value800
	 *	@return pds501s2Value800
	 */
   public char[] getPds501s2Value800() throws CFException  {              
   		return pds501Value800.getPds501s2Value800();
   }

  
	/**
	*  set variable pds501s2Value800
	*  @param value
	**/
   public void setPds501s2Value800(char[] value) throws CFException {
      pds501Value800.setPds501s2Value800(value);
   } 

     /**
	 * 	Update Pds501s2Value800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPds501s2Value800(char[] source, int sourceIndex) throws CFException {
      pds501Value800.setPds501s2Value800(source, sourceIndex);
   	
   }
   
   public void setPds501s2Value800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      pds501Value800.setPds501s2Value800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Pds501s2Value800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPds501s2Value800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501Value800.setPds501s2Value800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Pds501s2Value800 with another Field
	 *	@param value
	 */
   public void setPds501s2Value800(Field source) {
      pds501Value800.setPds501s2Value800(source);
   }  
   
     /**
	 * 	Update Pds501s2Value800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPds501s2Value800(Field source, int sourceIndex,int sourceLen) {
      pds501Value800.setPds501s2Value800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Pds501s2Value800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPds501s2Value800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501Value800.setPds501s2Value800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of subfld3Value500
	 *	@return subfld3Value500
	 */
   public char[] getSubfld3Value500(int index) throws CFException  {              
   		return pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).getSubfld3Value500();
   }

  
	/**
	*  set variable subfld3Value500
	*  @param value
	**/
   public void setSubfld3Value500(int index,char[] value) throws CFException {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld3Value500(value);
   } 

     /**
	 * 	Update Subfld3Value500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSubfld3Value500(int index,char[] source, int sourceIndex) throws CFException {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld3Value500(source, sourceIndex);
   	
   }
   
   public void setSubfld3Value500(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld3Value500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Subfld3Value500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSubfld3Value500(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld3Value500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Subfld3Value500 with another Field
	 *	@param value
	 */
   public void setSubfld3Value500(int index,Field source) {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld3Value500(source);
   }  
   
     /**
	 * 	Update Subfld3Value500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSubfld3Value500(int index,Field source, int sourceIndex,int sourceLen) {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld3Value500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Subfld3Value500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSubfld3Value500(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld3Value500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pds501s3Value800
	 *	@return pds501s3Value800
	 */
   public char[] getPds501s3Value800() throws CFException  {              
   		return pds501Value800.getPds501s3Value800();
   }

  
	/**
	*  set variable pds501s3Value800
	*  @param value
	**/
   public void setPds501s3Value800(char[] value) throws CFException {
      pds501Value800.setPds501s3Value800(value);
   } 

     /**
	 * 	Update Pds501s3Value800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPds501s3Value800(char[] source, int sourceIndex) throws CFException {
      pds501Value800.setPds501s3Value800(source, sourceIndex);
   	
   }
   
   public void setPds501s3Value800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      pds501Value800.setPds501s3Value800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Pds501s3Value800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPds501s3Value800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501Value800.setPds501s3Value800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Pds501s3Value800 with another Field
	 *	@param value
	 */
   public void setPds501s3Value800(Field source) {
      pds501Value800.setPds501s3Value800(source);
   }  
   
     /**
	 * 	Update Pds501s3Value800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPds501s3Value800(Field source, int sourceIndex,int sourceLen) {
      pds501Value800.setPds501s3Value800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Pds501s3Value800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPds501s3Value800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501Value800.setPds501s3Value800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setPds501TblIdx500(int pds501TblIdx500) { 
    Ip224621Ctx.this.pds501TblIdx500 = pds501TblIdx500;
}

public int getPds501TblIdx500() { 
    return Ip224621Ctx.this.pds501TblIdx500;
}
	/**
	 *	Returns the value of subfld1Value500
	 *	@return subfld1Value500
	 */
   public char[] getSubfld1Value500(int index) throws CFException  {              
   		return pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).getSubfld1Value500();
   }

  
	/**
	*  set variable subfld1Value500
	*  @param value
	**/
   public void setSubfld1Value500(int index,char[] value) throws CFException {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld1Value500(value);
   } 

     /**
	 * 	Update Subfld1Value500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSubfld1Value500(int index,char[] source, int sourceIndex) throws CFException {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld1Value500(source, sourceIndex);
   	
   }
   
   public void setSubfld1Value500(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld1Value500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Subfld1Value500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSubfld1Value500(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld1Value500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Subfld1Value500 with another Field
	 *	@param value
	 */
   public void setSubfld1Value500(int index,Field source) {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld1Value500(source);
   }  
   
     /**
	 * 	Update Subfld1Value500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSubfld1Value500(int index,Field source, int sourceIndex,int sourceLen) {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld1Value500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Subfld1Value500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSubfld1Value500(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld1Value500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pds501s1Value800
	 *	@return pds501s1Value800
	 */
   public char[] getPds501s1Value800() throws CFException  {              
   		return pds501Value800.getPds501s1Value800();
   }

  
	/**
	*  set variable pds501s1Value800
	*  @param value
	**/
   public void setPds501s1Value800(char[] value) throws CFException {
      pds501Value800.setPds501s1Value800(value);
   } 

     /**
	 * 	Update Pds501s1Value800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPds501s1Value800(char[] source, int sourceIndex) throws CFException {
      pds501Value800.setPds501s1Value800(source, sourceIndex);
   	
   }
   
   public void setPds501s1Value800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      pds501Value800.setPds501s1Value800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Pds501s1Value800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPds501s1Value800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501Value800.setPds501s1Value800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Pds501s1Value800 with another Field
	 *	@param value
	 */
   public void setPds501s1Value800(Field source) {
      pds501Value800.setPds501s1Value800(source);
   }  
   
     /**
	 * 	Update Pds501s1Value800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPds501s1Value800(Field source, int sourceIndex,int sourceLen) {
      pds501Value800.setPds501s1Value800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Pds501s1Value800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPds501s1Value800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501Value800.setPds501s1Value800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of subfld2Value500
	 *	@return subfld2Value500
	 */
   public char[] getSubfld2Value500(int index) throws CFException  {              
   		return pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).getSubfld2Value500();
   }

  
	/**
	*  set variable subfld2Value500
	*  @param value
	**/
   public void setSubfld2Value500(int index,char[] value) throws CFException {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld2Value500(value);
   } 

     /**
	 * 	Update Subfld2Value500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSubfld2Value500(int index,char[] source, int sourceIndex) throws CFException {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld2Value500(source, sourceIndex);
   	
   }
   
   public void setSubfld2Value500(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld2Value500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Subfld2Value500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSubfld2Value500(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld2Value500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Subfld2Value500 with another Field
	 *	@param value
	 */
   public void setSubfld2Value500(int index,Field source) {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld2Value500(source);
   }  
   
     /**
	 * 	Update Subfld2Value500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSubfld2Value500(int index,Field source, int sourceIndex,int sourceLen) {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld2Value500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Subfld2Value500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSubfld2Value500(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld2Value500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip224621Ctx getIp224621Ctx() {
            return Ip224621Ctx.this;
        }

        public SearchCombinationOutCtx getSearchCombinationOutCtx() {
            return new SearchCombinationOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += pds501S1s2s3Entries500.hashCode();
        str += pds501Value800.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public SearchCombinationInCtx clone() {
        SearchCombinationInCtx cloneObj = new SearchCombinationInCtx();
        cloneObj.pds501S1s2s3Entries500 = new Pds501S1s2s3Entries500();
        cloneObj.pds501S1s2s3Entries500.set(pds501S1s2s3Entries500.getClonedField());
        cloneObj.pds501Value800 = new Pds501Value800();
        cloneObj.pds501Value800.set(pds501Value800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SearchCombinationInCtx getSearchCombinationInCtx() {
            return new SearchCombinationInCtx();
    }
     public class SearchCombinationOutCtx implements Cloneable {
     Pds501S1s2s3Entries500 pds501S1s2s3Entries500 = Ip224621Ctx.this.getPds501S1s2s3Entries500();
     Pds501Value800 pds501Value800 = Ip224621Ctx.this.getPds501Value800();
     Work work = Ip224621Ctx.this.getWork();

	/**
	 *	Returns the value of subfld3Value500
	 *	@return subfld3Value500
	 */
   public char[] getSubfld3Value500(int index) throws CFException  {              
   		return pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).getSubfld3Value500();
   }

  
	/**
	*  set variable subfld3Value500
	*  @param value
	**/
   public void setSubfld3Value500(int index,char[] value) throws CFException {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld3Value500(value);
   } 

     /**
	 * 	Update Subfld3Value500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSubfld3Value500(int index,char[] source, int sourceIndex) throws CFException {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld3Value500(source, sourceIndex);
   	
   }
   
   public void setSubfld3Value500(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld3Value500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Subfld3Value500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSubfld3Value500(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld3Value500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Subfld3Value500 with another Field
	 *	@param value
	 */
   public void setSubfld3Value500(int index,Field source) {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld3Value500(source);
   }  
   
     /**
	 * 	Update Subfld3Value500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSubfld3Value500(int index,Field source, int sourceIndex,int sourceLen) {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld3Value500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Subfld3Value500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSubfld3Value500(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld3Value500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pds501s3Value800
	 *	@return pds501s3Value800
	 */
   public char[] getPds501s3Value800() throws CFException  {              
   		return pds501Value800.getPds501s3Value800();
   }

  
	/**
	*  set variable pds501s3Value800
	*  @param value
	**/
   public void setPds501s3Value800(char[] value) throws CFException {
      pds501Value800.setPds501s3Value800(value);
   } 

     /**
	 * 	Update Pds501s3Value800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPds501s3Value800(char[] source, int sourceIndex) throws CFException {
      pds501Value800.setPds501s3Value800(source, sourceIndex);
   	
   }
   
   public void setPds501s3Value800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      pds501Value800.setPds501s3Value800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Pds501s3Value800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPds501s3Value800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501Value800.setPds501s3Value800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Pds501s3Value800 with another Field
	 *	@param value
	 */
   public void setPds501s3Value800(Field source) {
      pds501Value800.setPds501s3Value800(source);
   }  
   
     /**
	 * 	Update Pds501s3Value800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPds501s3Value800(Field source, int sourceIndex,int sourceLen) {
      pds501Value800.setPds501s3Value800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Pds501s3Value800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPds501s3Value800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501Value800.setPds501s3Value800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "N" for isOccurrenceIsInvalid88100()
	 *	@return  Returns true if isOccurrenceIsInvalid88100() is "N"
	 */
   public boolean isOccurrenceIsInvalid88100() throws CFException {
      return work.isOccurrenceIsInvalid88100();
   }

	/**
	*  set values "N"
	*/
   	public void setOccurrenceIsInvalid88100True()  throws CFException{  			
    	work.setOccurrenceIsInvalid88100True();
   	}

public void setPds501TblIdx500(int pds501TblIdx500) { 
    Ip224621Ctx.this.pds501TblIdx500 = pds501TblIdx500;
}

public int getPds501TblIdx500() { 
    return Ip224621Ctx.this.pds501TblIdx500;
}

        public Ip224621Ctx getIp224621Ctx() {
            return Ip224621Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += pds501S1s2s3Entries500.hashCode();
        str += pds501Value800.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public SearchCombinationOutCtx clone() {
        SearchCombinationOutCtx cloneObj = new SearchCombinationOutCtx();
        cloneObj.pds501S1s2s3Entries500 = new Pds501S1s2s3Entries500();
        cloneObj.pds501S1s2s3Entries500.set(pds501S1s2s3Entries500.getClonedField());
        cloneObj.pds501Value800 = new Pds501Value800();
        cloneObj.pds501Value800.set(pds501Value800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public SearchCombinationOutCtx getSearchCombinationOutCtx() {
            return new SearchCombinationOutCtx();
    }
     public class EnterNewCombinationInCtx implements Cloneable {
     Pds501S1s2s3Entries500 pds501S1s2s3Entries500 = Ip224621Ctx.this.getPds501S1s2s3Entries500();
     Pds501Value800 pds501Value800 = Ip224621Ctx.this.getPds501Value800();
     Work work = Ip224621Ctx.this.getWork();

	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public int getValueOne300() throws CFException {        
   		return work.getValueOne300();
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param number
	 */
	public void setValueOne300(int number)  throws CFException{
		work.setValueOne300(number);
	}


	public void setValueOne300(long number)  throws CFException{
		work.setValueOne300((int)number);
	}


	/**
	 *	Returns the value of pds501s2Value800
	 *	@return pds501s2Value800
	 */
   public char[] getPds501s2Value800() throws CFException  {              
   		return pds501Value800.getPds501s2Value800();
   }

  
	/**
	*  set variable pds501s2Value800
	*  @param value
	**/
   public void setPds501s2Value800(char[] value) throws CFException {
      pds501Value800.setPds501s2Value800(value);
   } 

     /**
	 * 	Update Pds501s2Value800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPds501s2Value800(char[] source, int sourceIndex) throws CFException {
      pds501Value800.setPds501s2Value800(source, sourceIndex);
   	
   }
   
   public void setPds501s2Value800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      pds501Value800.setPds501s2Value800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Pds501s2Value800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPds501s2Value800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501Value800.setPds501s2Value800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Pds501s2Value800 with another Field
	 *	@param value
	 */
   public void setPds501s2Value800(Field source) {
      pds501Value800.setPds501s2Value800(source);
   }  
   
     /**
	 * 	Update Pds501s2Value800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPds501s2Value800(Field source, int sourceIndex,int sourceLen) {
      pds501Value800.setPds501s2Value800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Pds501s2Value800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPds501s2Value800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501Value800.setPds501s2Value800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pds501s3Value800
	 *	@return pds501s3Value800
	 */
   public char[] getPds501s3Value800() throws CFException  {              
   		return pds501Value800.getPds501s3Value800();
   }

  
	/**
	*  set variable pds501s3Value800
	*  @param value
	**/
   public void setPds501s3Value800(char[] value) throws CFException {
      pds501Value800.setPds501s3Value800(value);
   } 

     /**
	 * 	Update Pds501s3Value800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPds501s3Value800(char[] source, int sourceIndex) throws CFException {
      pds501Value800.setPds501s3Value800(source, sourceIndex);
   	
   }
   
   public void setPds501s3Value800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      pds501Value800.setPds501s3Value800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Pds501s3Value800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPds501s3Value800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501Value800.setPds501s3Value800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Pds501s3Value800 with another Field
	 *	@param value
	 */
   public void setPds501s3Value800(Field source) {
      pds501Value800.setPds501s3Value800(source);
   }  
   
     /**
	 * 	Update Pds501s3Value800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPds501s3Value800(Field source, int sourceIndex,int sourceLen) {
      pds501Value800.setPds501s3Value800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Pds501s3Value800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPds501s3Value800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501Value800.setPds501s3Value800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pds501S1s2s3Tcnt500
	 *	@return pds501S1s2s3Tcnt500
	 */
	public short getPds501S1s2s3Tcnt500() throws CFException {        
   		return pds501S1s2s3Entries500.getPds501S1s2s3Tcnt500();
	}
	
	/**
	 * 	Update Pds501S1s2s3Tcnt500 with the passed value
	 *	@param number
	 */
	public void setPds501S1s2s3Tcnt500(short number)  throws CFException{
		pds501S1s2s3Entries500.setPds501S1s2s3Tcnt500(number);
	}

	public void setPds501S1s2s3Tcnt500(int number)  throws CFException{
		pds501S1s2s3Entries500.setPds501S1s2s3Tcnt500((short)number);
	}

	public void setPds501S1s2s3Tcnt500(long number)  throws CFException{
		pds501S1s2s3Entries500.setPds501S1s2s3Tcnt500((short)number);
	}



	/**
	 *	Returns the value of pds501Value800
	 *	@return pds501Value800
	 */   
	 public Pds501Value800 getPds501Value800() {
   	return pds501Value800;
   }



public void setPds501TblIdx500(int pds501TblIdx500) { 
    Ip224621Ctx.this.pds501TblIdx500 = pds501TblIdx500;
}

public int getPds501TblIdx500() { 
    return Ip224621Ctx.this.pds501TblIdx500;
}
	/**
	 *	Returns the value of pds501s1Value800
	 *	@return pds501s1Value800
	 */
   public char[] getPds501s1Value800() throws CFException  {              
   		return pds501Value800.getPds501s1Value800();
   }

  
	/**
	*  set variable pds501s1Value800
	*  @param value
	**/
   public void setPds501s1Value800(char[] value) throws CFException {
      pds501Value800.setPds501s1Value800(value);
   } 

     /**
	 * 	Update Pds501s1Value800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPds501s1Value800(char[] source, int sourceIndex) throws CFException {
      pds501Value800.setPds501s1Value800(source, sourceIndex);
   	
   }
   
   public void setPds501s1Value800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      pds501Value800.setPds501s1Value800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Pds501s1Value800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPds501s1Value800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501Value800.setPds501s1Value800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Pds501s1Value800 with another Field
	 *	@param value
	 */
   public void setPds501s1Value800(Field source) {
      pds501Value800.setPds501s1Value800(source);
   }  
   
     /**
	 * 	Update Pds501s1Value800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPds501s1Value800(Field source, int sourceIndex,int sourceLen) {
      pds501Value800.setPds501s1Value800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Pds501s1Value800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPds501s1Value800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501Value800.setPds501s1Value800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of valueFifty300
	 *	@return valueFifty300
	 */
	public int getValueFifty300() throws CFException {        
   		return work.getValueFifty300();
	}
	
	/**
	 * 	Update ValueFifty300 with the passed value
	 *	@param number
	 */
	public void setValueFifty300(int number)  throws CFException{
		work.setValueFifty300(number);
	}


	public void setValueFifty300(long number)  throws CFException{
		work.setValueFifty300((int)number);
	}



        public Ip224621Ctx getIp224621Ctx() {
            return Ip224621Ctx.this;
        }

        public EnterNewCombinationOutCtx getEnterNewCombinationOutCtx() {
            return new EnterNewCombinationOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += pds501S1s2s3Entries500.hashCode();
        str += pds501Value800.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public EnterNewCombinationInCtx clone() {
        EnterNewCombinationInCtx cloneObj = new EnterNewCombinationInCtx();
        cloneObj.pds501S1s2s3Entries500 = new Pds501S1s2s3Entries500();
        cloneObj.pds501S1s2s3Entries500.set(pds501S1s2s3Entries500.getClonedField());
        cloneObj.pds501Value800 = new Pds501Value800();
        cloneObj.pds501Value800.set(pds501Value800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public EnterNewCombinationInCtx getEnterNewCombinationInCtx() {
            return new EnterNewCombinationInCtx();
    }
     public class EnterNewCombinationOutCtx implements Cloneable {
     Pds501S1s2s3Entries500 pds501S1s2s3Entries500 = Ip224621Ctx.this.getPds501S1s2s3Entries500();
     Pds501Value800 pds501Value800 = Ip224621Ctx.this.getPds501Value800();
     Work work = Ip224621Ctx.this.getWork();

	/**
	 *	Returns the value of pds501s2Value800
	 *	@return pds501s2Value800
	 */
   public char[] getPds501s2Value800() throws CFException  {              
   		return pds501Value800.getPds501s2Value800();
   }

  
	/**
	*  set variable pds501s2Value800
	*  @param value
	**/
   public void setPds501s2Value800(char[] value) throws CFException {
      pds501Value800.setPds501s2Value800(value);
   } 

     /**
	 * 	Update Pds501s2Value800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPds501s2Value800(char[] source, int sourceIndex) throws CFException {
      pds501Value800.setPds501s2Value800(source, sourceIndex);
   	
   }
   
   public void setPds501s2Value800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      pds501Value800.setPds501s2Value800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Pds501s2Value800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPds501s2Value800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501Value800.setPds501s2Value800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Pds501s2Value800 with another Field
	 *	@param value
	 */
   public void setPds501s2Value800(Field source) {
      pds501Value800.setPds501s2Value800(source);
   }  
   
     /**
	 * 	Update Pds501s2Value800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPds501s2Value800(Field source, int sourceIndex,int sourceLen) {
      pds501Value800.setPds501s2Value800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Pds501s2Value800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPds501s2Value800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501Value800.setPds501s2Value800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of subfld3Value500
	 *	@return subfld3Value500
	 */
   public char[] getSubfld3Value500(int index) throws CFException  {              
   		return pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).getSubfld3Value500();
   }

  
	/**
	*  set variable subfld3Value500
	*  @param value
	**/
   public void setSubfld3Value500(int index,char[] value) throws CFException {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld3Value500(value);
   } 

     /**
	 * 	Update Subfld3Value500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSubfld3Value500(int index,char[] source, int sourceIndex) throws CFException {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld3Value500(source, sourceIndex);
   	
   }
   
   public void setSubfld3Value500(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld3Value500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Subfld3Value500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSubfld3Value500(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld3Value500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Subfld3Value500 with another Field
	 *	@param value
	 */
   public void setSubfld3Value500(int index,Field source) {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld3Value500(source);
   }  
   
     /**
	 * 	Update Subfld3Value500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSubfld3Value500(int index,Field source, int sourceIndex,int sourceLen) {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld3Value500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Subfld3Value500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSubfld3Value500(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld3Value500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pds501s3Value800
	 *	@return pds501s3Value800
	 */
   public char[] getPds501s3Value800() throws CFException  {              
   		return pds501Value800.getPds501s3Value800();
   }

  
	/**
	*  set variable pds501s3Value800
	*  @param value
	**/
   public void setPds501s3Value800(char[] value) throws CFException {
      pds501Value800.setPds501s3Value800(value);
   } 

     /**
	 * 	Update Pds501s3Value800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPds501s3Value800(char[] source, int sourceIndex) throws CFException {
      pds501Value800.setPds501s3Value800(source, sourceIndex);
   	
   }
   
   public void setPds501s3Value800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      pds501Value800.setPds501s3Value800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Pds501s3Value800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPds501s3Value800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501Value800.setPds501s3Value800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Pds501s3Value800 with another Field
	 *	@param value
	 */
   public void setPds501s3Value800(Field source) {
      pds501Value800.setPds501s3Value800(source);
   }  
   
     /**
	 * 	Update Pds501s3Value800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPds501s3Value800(Field source, int sourceIndex,int sourceLen) {
      pds501Value800.setPds501s3Value800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Pds501s3Value800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPds501s3Value800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501Value800.setPds501s3Value800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pds501S1s2s3Tcnt500
	 *	@return pds501S1s2s3Tcnt500
	 */
	public short getPds501S1s2s3Tcnt500() throws CFException {        
   		return pds501S1s2s3Entries500.getPds501S1s2s3Tcnt500();
	}
	
	/**
	 * 	Update Pds501S1s2s3Tcnt500 with the passed value
	 *	@param number
	 */
	public void setPds501S1s2s3Tcnt500(short number)  throws CFException{
		pds501S1s2s3Entries500.setPds501S1s2s3Tcnt500(number);
	}

	public void setPds501S1s2s3Tcnt500(int number)  throws CFException{
		pds501S1s2s3Entries500.setPds501S1s2s3Tcnt500((short)number);
	}

	public void setPds501S1s2s3Tcnt500(long number)  throws CFException{
		pds501S1s2s3Entries500.setPds501S1s2s3Tcnt500((short)number);
	}




public void setPds501TblIdx500(int pds501TblIdx500) { 
    Ip224621Ctx.this.pds501TblIdx500 = pds501TblIdx500;
}

public int getPds501TblIdx500() { 
    return Ip224621Ctx.this.pds501TblIdx500;
}
	/**
	 *	Returns the value of subfld1Value500
	 *	@return subfld1Value500
	 */
   public char[] getSubfld1Value500(int index) throws CFException  {              
   		return pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).getSubfld1Value500();
   }

  
	/**
	*  set variable subfld1Value500
	*  @param value
	**/
   public void setSubfld1Value500(int index,char[] value) throws CFException {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld1Value500(value);
   } 

     /**
	 * 	Update Subfld1Value500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSubfld1Value500(int index,char[] source, int sourceIndex) throws CFException {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld1Value500(source, sourceIndex);
   	
   }
   
   public void setSubfld1Value500(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld1Value500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Subfld1Value500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSubfld1Value500(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld1Value500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Subfld1Value500 with another Field
	 *	@param value
	 */
   public void setSubfld1Value500(int index,Field source) {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld1Value500(source);
   }  
   
     /**
	 * 	Update Subfld1Value500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSubfld1Value500(int index,Field source, int sourceIndex,int sourceLen) {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld1Value500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Subfld1Value500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSubfld1Value500(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld1Value500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pds501s1Value800
	 *	@return pds501s1Value800
	 */
   public char[] getPds501s1Value800() throws CFException  {              
   		return pds501Value800.getPds501s1Value800();
   }

  
	/**
	*  set variable pds501s1Value800
	*  @param value
	**/
   public void setPds501s1Value800(char[] value) throws CFException {
      pds501Value800.setPds501s1Value800(value);
   } 

     /**
	 * 	Update Pds501s1Value800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPds501s1Value800(char[] source, int sourceIndex) throws CFException {
      pds501Value800.setPds501s1Value800(source, sourceIndex);
   	
   }
   
   public void setPds501s1Value800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      pds501Value800.setPds501s1Value800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Pds501s1Value800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPds501s1Value800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501Value800.setPds501s1Value800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Pds501s1Value800 with another Field
	 *	@param value
	 */
   public void setPds501s1Value800(Field source) {
      pds501Value800.setPds501s1Value800(source);
   }  
   
     /**
	 * 	Update Pds501s1Value800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPds501s1Value800(Field source, int sourceIndex,int sourceLen) {
      pds501Value800.setPds501s1Value800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Pds501s1Value800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPds501s1Value800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501Value800.setPds501s1Value800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of subfld2Value500
	 *	@return subfld2Value500
	 */
   public char[] getSubfld2Value500(int index) throws CFException  {              
   		return pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).getSubfld2Value500();
   }

  
	/**
	*  set variable subfld2Value500
	*  @param value
	**/
   public void setSubfld2Value500(int index,char[] value) throws CFException {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld2Value500(value);
   } 

     /**
	 * 	Update Subfld2Value500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSubfld2Value500(int index,char[] source, int sourceIndex) throws CFException {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld2Value500(source, sourceIndex);
   	
   }
   
   public void setSubfld2Value500(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld2Value500(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Subfld2Value500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSubfld2Value500(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld2Value500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Subfld2Value500 with another Field
	 *	@param value
	 */
   public void setSubfld2Value500(int index,Field source) {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld2Value500(source);
   }  
   
     /**
	 * 	Update Subfld2Value500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSubfld2Value500(int index,Field source, int sourceIndex,int sourceLen) {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld2Value500(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Subfld2Value500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSubfld2Value500(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      pds501S1s2s3Entries500.getPds501S1s2s3Table500(index).setSubfld2Value500(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip224621Ctx getIp224621Ctx() {
            return Ip224621Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += pds501S1s2s3Entries500.hashCode();
        str += pds501Value800.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public EnterNewCombinationOutCtx clone() {
        EnterNewCombinationOutCtx cloneObj = new EnterNewCombinationOutCtx();
        cloneObj.pds501S1s2s3Entries500 = new Pds501S1s2s3Entries500();
        cloneObj.pds501S1s2s3Entries500.set(pds501S1s2s3Entries500.getClonedField());
        cloneObj.pds501Value800 = new Pds501Value800();
        cloneObj.pds501Value800.set(pds501Value800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public EnterNewCombinationOutCtx getEnterNewCombinationOutCtx() {
            return new EnterNewCombinationOutCtx();
    }
     public class AbendOnTblOverflowInCtx implements Cloneable {
     AbendMessage900 abendMessage900 = Ip224621Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip224621Ctx.this.getAbendParaName900();
     Work work = Ip224621Ctx.this.getWork();

	/**
	 *	Returns the value of tblOverflowAbendCode300
	 *	@return tblOverflowAbendCode300
	 */
   public char[] getTblOverflowAbendCode300() throws CFException  {              
   		return work.getTblOverflowAbendCode300();
   }

  
	/**
	*  set variable tblOverflowAbendCode300
	*  @param value
	**/
   public void setTblOverflowAbendCode300(char[] value) throws CFException {
      work.setTblOverflowAbendCode300(value);
   } 

	/**
	 *	Returns the value of para2111300
	 *	@return para2111300
	 */
   public char[] getPara2111300() throws CFException  {              
   		return work.getPara2111300();
   }

  
	/**
	*  set variable para2111300
	*  @param value
	**/
   public void setPara2111300(char[] value) throws CFException {
      work.setPara2111300(value);
   } 

	/**
	 *	Returns the value of tableOverflowError600
	 *	@return tableOverflowError600
	 */
   public char[] getTableOverflowError600() throws CFException  {              
   		return work.getTableOverflowError600();
   }

  
	/**
	*  set variable tableOverflowError600
	*  @param value
	**/
   public void setTableOverflowError600(char[] value) throws CFException {
      work.setTableOverflowError600(value);
   } 


        public Ip224621Ctx getIp224621Ctx() {
            return Ip224621Ctx.this;
        }

        public AbendOnTblOverflowOutCtx getAbendOnTblOverflowOutCtx() {
            return new AbendOnTblOverflowOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public AbendOnTblOverflowInCtx clone() {
        AbendOnTblOverflowInCtx cloneObj = new AbendOnTblOverflowInCtx();
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public AbendOnTblOverflowInCtx getAbendOnTblOverflowInCtx() {
            return new AbendOnTblOverflowInCtx();
    }
     public class AbendOnTblOverflowOutCtx implements Cloneable {
     AbendMessage900 abendMessage900 = Ip224621Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip224621Ctx.this.getAbendParaName900();
     Work work = Ip224621Ctx.this.getWork();

	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException  {              
   		return abendMessage900.getAbendCode900();
   }

  
	/**
	*  set variable abendCode900
	*  @param value
	**/
   public void setAbendCode900(char[] value) throws CFException {
      abendMessage900.setAbendCode900(value);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendCode900(source, sourceIndex);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
      abendMessage900.setAbendCode900(source);
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendCode900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tblOverflowAbendCode300
	 *	@return tblOverflowAbendCode300
	 */
   public char[] getTblOverflowAbendCode300() throws CFException  {              
   		return work.getTblOverflowAbendCode300();
   }

  
	/**
	*  set variable tblOverflowAbendCode300
	*  @param value
	**/
   public void setTblOverflowAbendCode300(char[] value) throws CFException {
      work.setTblOverflowAbendCode300(value);
   } 

	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException  {              
   		return abendMessage900.getAbendText900();
   }

  
	/**
	*  set variable abendText900
	*  @param value
	**/
   public void setAbendText900(char[] value) throws CFException {
      abendMessage900.setAbendText900(value);
   } 

     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex) throws CFException {
      abendMessage900.setAbendText900(source, sourceIndex);
   	
   }
   
   public void setAbendText900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendText900 with another Field
	 *	@param value
	 */
   public void setAbendText900(Field source) {
      abendMessage900.setAbendText900(source);
   }  
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendMessage900.setAbendText900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of para2111300
	 *	@return para2111300
	 */
   public char[] getPara2111300() throws CFException  {              
   		return work.getPara2111300();
   }

  
	/**
	*  set variable para2111300
	*  @param value
	**/
   public void setPara2111300(char[] value) throws CFException {
      work.setPara2111300(value);
   } 

	/**
	 *	Returns the value of tableOverflowError600
	 *	@return tableOverflowError600
	 */
   public char[] getTableOverflowError600() throws CFException  {              
   		return work.getTableOverflowError600();
   }

  
	/**
	*  set variable tableOverflowError600
	*  @param value
	**/
   public void setTableOverflowError600(char[] value) throws CFException {
      work.setTableOverflowError600(value);
   } 

	/**
	 *	Returns the value of abendPara900
	 *	@return abendPara900
	 */
   public char[] getAbendPara900() throws CFException  {              
   		return abendParaName900.getAbendPara900();
   }

  
	/**
	*  set variable abendPara900
	*  @param value
	**/
   public void setAbendPara900(char[] value) throws CFException {
      abendParaName900.setAbendPara900(value);
   } 

     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex) throws CFException {
      abendParaName900.setAbendPara900(source, sourceIndex);
   	
   }
   
   public void setAbendPara900(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AbendPara900 with another Field
	 *	@param value
	 */
   public void setAbendPara900(Field source) {
      abendParaName900.setAbendPara900(source);
   }  
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      abendParaName900.setAbendPara900(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Ip224621Ctx getIp224621Ctx() {
            return Ip224621Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public AbendOnTblOverflowOutCtx clone() {
        AbendOnTblOverflowOutCtx cloneObj = new AbendOnTblOverflowOutCtx();
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public AbendOnTblOverflowOutCtx getAbendOnTblOverflowOutCtx() {
            return new AbendOnTblOverflowOutCtx();
    }
     public class TerminateOnErrorInCtx implements Cloneable {
     AbendMessage900 abendMessage900 = Ip224621Ctx.this.getAbendMessage900();
     AbendParaName900 abendParaName900 = Ip224621Ctx.this.getAbendParaName900();

	/**
	 *	Returns the value of abendMessage900
	 *	@return abendMessage900
	 */   
	 public AbendMessage900 getAbendMessage900() {
   	return abendMessage900;
   }


	/**
	 *	Returns the value of abendParaName900
	 *	@return abendParaName900
	 */   
	 public AbendParaName900 getAbendParaName900() {
   	return abendParaName900;
   }



        public Ip224621Ctx getIp224621Ctx() {
            return Ip224621Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += abendMessage900.hashCode();
        str += abendParaName900.hashCode();
       return str.hashCode();
    }

    public TerminateOnErrorInCtx clone() {
        TerminateOnErrorInCtx cloneObj = new TerminateOnErrorInCtx();
        cloneObj.abendMessage900 = new AbendMessage900();
        cloneObj.abendMessage900.set(abendMessage900.getClonedField());
        cloneObj.abendParaName900 = new AbendParaName900();
        cloneObj.abendParaName900.set(abendParaName900.getClonedField());
        return cloneObj;
    }

    }

    public TerminateOnErrorInCtx getTerminateOnErrorInCtx() {
            return new TerminateOnErrorInCtx();
    }
}
