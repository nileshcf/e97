package com.cloudframe.app.casecb01;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.casecb01.dto.Work;
import com.cloudframe.app.casecb01.dto.Inventoryrequested;
import com.cloudframe.app.casecb01.dto.Xmlpc103Linkage;
import com.cloudframe.app.data.Field;


@Context
public class Casecb01Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Xmlpc103Linkage xmlpc103Linkage;
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



    boolean programEnded = false;

    public boolean isProgramEnded() {
        return this.programEnded;
    }

    public void setProgramEnded(boolean programEnded) {
        this.programEnded = programEnded;
    }

    boolean doNotSkipInitialize = true;

    public boolean getDoNotSkipInitialize() {
        return this.doNotSkipInitialize;
    }

    public void setDoNotSkipInitialize(boolean doNotSkipInitialize) {
            this.doNotSkipInitialize = doNotSkipInitialize;
        }
    boolean doNotSkipFillInputData = true;

    public boolean getDoNotSkipFillInputData() {
        return this.doNotSkipFillInputData;
    }

    public void setDoNotSkipFillInputData(boolean doNotSkipFillInputData) {
            this.doNotSkipFillInputData = doNotSkipFillInputData;
        }
    boolean doNotSkipFillInputDataSplit0 = true;

    public boolean getDoNotSkipFillInputDataSplit0() {
        return this.doNotSkipFillInputDataSplit0;
    }

    public void setDoNotSkipFillInputDataSplit0(boolean doNotSkipFillInputDataSplit0) {
            this.doNotSkipFillInputDataSplit0 = doNotSkipFillInputDataSplit0;
        }
    boolean doNotSkipFillInputDataSplit1 = true;

    public boolean getDoNotSkipFillInputDataSplit1() {
        return this.doNotSkipFillInputDataSplit1;
    }

    public void setDoNotSkipFillInputDataSplit1(boolean doNotSkipFillInputDataSplit1) {
            this.doNotSkipFillInputDataSplit1 = doNotSkipFillInputDataSplit1;
        }
    boolean doNotSkipFillInputDataSplit2 = true;

    public boolean getDoNotSkipFillInputDataSplit2() {
        return this.doNotSkipFillInputDataSplit2;
    }

    public void setDoNotSkipFillInputDataSplit2(boolean doNotSkipFillInputDataSplit2) {
            this.doNotSkipFillInputDataSplit2 = doNotSkipFillInputDataSplit2;
        }
    boolean doNotSkipDisplayResults = true;

    public boolean getDoNotSkipDisplayResults() {
        return this.doNotSkipDisplayResults;
    }

    public void setDoNotSkipDisplayResults(boolean doNotSkipDisplayResults) {
            this.doNotSkipDisplayResults = doNotSkipDisplayResults;
        }
    boolean doNotSkipDisplayDealers = true;

    public boolean getDoNotSkipDisplayDealers() {
        return this.doNotSkipDisplayDealers;
    }

    public void setDoNotSkipDisplayDealers(boolean doNotSkipDisplayDealers) {
            this.doNotSkipDisplayDealers = doNotSkipDisplayDealers;
        }
    boolean doNotSkipDisplayManufacturers = true;

    public boolean getDoNotSkipDisplayManufacturers() {
        return this.doNotSkipDisplayManufacturers;
    }

    public void setDoNotSkipDisplayManufacturers(boolean doNotSkipDisplayManufacturers) {
            this.doNotSkipDisplayManufacturers = doNotSkipDisplayManufacturers;
        }
    boolean doNotSkipDisplayModels = true;

    public boolean getDoNotSkipDisplayModels() {
        return this.doNotSkipDisplayModels;
    }

    public void setDoNotSkipDisplayModels(boolean doNotSkipDisplayModels) {
            this.doNotSkipDisplayModels = doNotSkipDisplayModels;
        }
    boolean doNotSkipDisplayColors = true;

    public boolean getDoNotSkipDisplayColors() {
        return this.doNotSkipDisplayColors;
    }

    public void setDoNotSkipDisplayColors(boolean doNotSkipDisplayColors) {
            this.doNotSkipDisplayColors = doNotSkipDisplayColors;
        }
    boolean doNotSkipDisplayAccessories = true;

    public boolean getDoNotSkipDisplayAccessories() {
        return this.doNotSkipDisplayAccessories;
    }

    public void setDoNotSkipDisplayAccessories(boolean doNotSkipDisplayAccessories) {
            this.doNotSkipDisplayAccessories = doNotSkipDisplayAccessories;
        }
    long xmlCode = 0;

    public long getXmlCode() {
        return this.xmlCode;
    }

    public void setXmlCode(long xmlCode) {
            this.xmlCode = xmlCode;
        }

    public Xmlpc103Linkage getXmlpc103Linkage() {
        if (xmlpc103Linkage == null) {
            xmlpc103Linkage = new Xmlpc103Linkage();
        }

        return xmlpc103Linkage;
    }

    public void setXmlpc103Linkage(Xmlpc103Linkage xmlpc103Linkage) {
        this.xmlpc103Linkage = xmlpc103Linkage;
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
        str += xmlpc103Linkage.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Casecb01Ctx clone() {
        Casecb01Ctx cloneObj = new Casecb01Ctx();
        cloneObj.xmlpc103Linkage = new Xmlpc103Linkage();
        cloneObj.xmlpc103Linkage.set(xmlpc103Linkage.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainParagraphInCtx implements Cloneable {
     Xmlpc103Linkage xmlpc103Linkage = Casecb01Ctx.this.getXmlpc103Linkage();
     Work work = Casecb01Ctx.this.getWork();

	/**
	 *	Returns the value of xmlpc103Linkage
	 *	@return xmlpc103Linkage
	 */   
	 public Xmlpc103Linkage getXmlpc103Linkage() {
   	return xmlpc103Linkage;
   }



        public Casecb01Ctx getCasecb01Ctx() {
            return Casecb01Ctx.this;
        }

        public MainParagraphOutCtx getMainParagraphOutCtx() {
            return new MainParagraphOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += xmlpc103Linkage.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainParagraphInCtx clone() {
        MainParagraphInCtx cloneObj = new MainParagraphInCtx();
        cloneObj.xmlpc103Linkage = new Xmlpc103Linkage();
        cloneObj.xmlpc103Linkage.set(xmlpc103Linkage.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainParagraphInCtx getMainParagraphInCtx() {
            return new MainParagraphInCtx();
    }
     public class MainParagraphOutCtx implements Cloneable {
     Xmlpc103Linkage xmlpc103Linkage = Casecb01Ctx.this.getXmlpc103Linkage();
     Work work = Casecb01Ctx.this.getWork();

	/**
	 *	Returns the value of xml
	 *	@return xml
	 */
   public char[] getXml() throws CFException  {              
   		return work.getXml();
   }

  
	/**
	*  set variable xml
	*  @param value
	**/
   public void setXml(char[] value) throws CFException {
      work.setXml(value);
   } 


        public Casecb01Ctx getCasecb01Ctx() {
            return Casecb01Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += xmlpc103Linkage.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MainParagraphOutCtx clone() {
        MainParagraphOutCtx cloneObj = new MainParagraphOutCtx();
        cloneObj.xmlpc103Linkage = new Xmlpc103Linkage();
        cloneObj.xmlpc103Linkage.set(xmlpc103Linkage.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainParagraphOutCtx getMainParagraphOutCtx() {
            return new MainParagraphOutCtx();
    }
     public class InitializeOutCtx implements Cloneable {
     Xmlpc103Linkage xmlpc103Linkage = Casecb01Ctx.this.getXmlpc103Linkage();

	/**
	 *	Returns the value of inventoryrequested
	 *	@return inventoryrequested
	 */   
	 public Inventoryrequested getInventoryrequested() {
   	return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested();
   }

   /**
	* 	Update Inventoryrequested with the passed value
	*	@param value
	*/
   public void setInventoryrequested(char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().setInventoryrequested(value);
   }   

     /**
	 * 	Update Inventoryrequested 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setInventoryrequested(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	xmlpc103Linkage.getInputRequest().getGetinventory().setInventoryrequested(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Inventoryrequested 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInventoryrequested(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	xmlpc103Linkage.getInputRequest().getGetinventory().setInventoryrequested(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Inventoryrequested with another Field
	 *	@param value
	 */
   public void setInventoryrequested(Field source) {
   	xmlpc103Linkage.getInputRequest().getGetinventory().setInventoryrequested(source);
   }  
   
     /**
	 * 	Update Inventoryrequested 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setInventoryrequested(Field source, int sourceIndex,int sourceLen) {
   	xmlpc103Linkage.getInputRequest().getGetinventory().setInventoryrequested(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Inventoryrequested 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInventoryrequested(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	xmlpc103Linkage.getInputRequest().getGetinventory().setInventoryrequested(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Casecb01Ctx getCasecb01Ctx() {
            return Casecb01Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += xmlpc103Linkage.hashCode();
       return str.hashCode();
    }

    public InitializeOutCtx clone() {
        InitializeOutCtx cloneObj = new InitializeOutCtx();
        cloneObj.xmlpc103Linkage = new Xmlpc103Linkage();
        cloneObj.xmlpc103Linkage.set(xmlpc103Linkage.getClonedField());
        return cloneObj;
    }

    }

    public InitializeOutCtx getInitializeOutCtx() {
            return new InitializeOutCtx();
    }
     public class FillInputDataSplit0OutCtx implements Cloneable {
     Xmlpc103Linkage xmlpc103Linkage = Casecb01Ctx.this.getXmlpc103Linkage();

	/**
	 *	Returns the value of state
	 *	@return state
	 */
   public char[] getState(int index,int index2) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).getState();
   }

  
	/**
	*  set variable state
	*  @param value
	**/
   public void setState(int index,int index2,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).setState(value);
   } 

     /**
	 * 	Update State 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setState(int index,int index2,char[] source, int sourceIndex) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).setState(source, sourceIndex);
   	
   }
   
   public void setState(int index,int index2,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).setState(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update State 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setState(int index,int index2,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).setState(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update State with another Field
	 *	@param value
	 */
   public void setState(int index,int index2,Field source) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).setState(source);
   }  
   
     /**
	 * 	Update State 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setState(int index,int index2,Field source, int sourceIndex,int sourceLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).setState(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update State 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setState(int index,int index2,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).setState(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of dealername
	 *	@return dealername
	 */
   public char[] getDealername(int index) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getDealername();
   }

  
	/**
	*  set variable dealername
	*  @param value
	**/
   public void setDealername(int index,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).setDealername(value);
   } 

     /**
	 * 	Update Dealername 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDealername(int index,char[] source, int sourceIndex) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).setDealername(source, sourceIndex);
   	
   }
   
   public void setDealername(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).setDealername(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Dealername 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDealername(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).setDealername(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Dealername with another Field
	 *	@param value
	 */
   public void setDealername(int index,Field source) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).setDealername(source);
   }  
   
     /**
	 * 	Update Dealername 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDealername(int index,Field source, int sourceIndex,int sourceLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).setDealername(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Dealername 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDealername(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).setDealername(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of country
	 *	@return country
	 */
   public char[] getCountry(int index,int index2) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getCountry();
   }

  
	/**
	*  set variable country
	*  @param value
	**/
   public void setCountry(int index,int index2,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setCountry(value);
   } 

     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry(int index,int index2,char[] source, int sourceIndex) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setCountry(source, sourceIndex);
   	
   }
   
   public void setCountry(int index,int index2,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setCountry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry(int index,int index2,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Country with another Field
	 *	@param value
	 */
   public void setCountry(int index,int index2,Field source) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setCountry(source);
   }  
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry(int index,int index2,Field source, int sourceIndex,int sourceLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setCountry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry(int index,int index2,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getLevel1NumIn(int index,int index2) throws CFException{      
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getLevel1NumIn();
	}

    public char[] getLevel1NumInString(int index,int index2) throws CFException {
          return  xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getLevel1NumIn().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Level1NumIn with the passed number
	 *	@param number
	 */
	public void setLevel1NumIn(int index,int index2,BigDecimal number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setLevel1NumIn(number);
   }

	/**
	 *	Returns the value of colorcounter
	 *	@return colorcounter
	 */
	public short getColorcounter(int index,int index2,int index3) throws CFException {        
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getColorcounter();
	}
	
	/**
	 * 	Update Colorcounter with the passed value
	 *	@param number
	 */
	public void setColorcounter(int index,int index2,int index3,short number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setColorcounter(number);
	}

	public void setColorcounter(int index,int index2,int index3,int number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setColorcounter((short)number);
	}

	public void setColorcounter(int index,int index2,int index3,long number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setColorcounter((short)number);
	}



	/**
	 *	Returns the value of makecounter
	 *	@return makecounter
	 */
	public short getMakecounter(int index) throws CFException {        
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getMakecounter();
	}
	
	/**
	 * 	Update Makecounter with the passed value
	 *	@param number
	 */
	public void setMakecounter(int index,short number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).setMakecounter(number);
	}

	public void setMakecounter(int index,int number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).setMakecounter((short)number);
	}

	public void setMakecounter(int index,long number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).setMakecounter((short)number);
	}



	/**
	 *	Returns the value of enginesizecc
	 *	@return enginesizecc
	 */
	public short getEnginesizecc(int index,int index2,int index3) throws CFException {        
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getEnginesizecc();
	}
	
	/**
	 * 	Update Enginesizecc with the passed value
	 *	@param number
	 */
	public void setEnginesizecc(int index,int index2,int index3,short number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setEnginesizecc(number);
	}

	public void setEnginesizecc(int index,int index2,int index3,int number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setEnginesizecc((short)number);
	}

	public void setEnginesizecc(int index,int index2,int index3,long number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setEnginesizecc((short)number);
	}



	public BigDecimal getLevel2NumIn(int index,int index2,int index3) throws CFException{      
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getLevel2NumIn();
	}

    public char[] getLevel2NumInString(int index,int index2,int index3) throws CFException {
          return  xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getLevel2NumIn().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Level2NumIn with the passed number
	 *	@param number
	 */
	public void setLevel2NumIn(int index,int index2,int index3,BigDecimal number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setLevel2NumIn(number);
   }

	/**
	 *	Returns the value of streetaddress
	 *	@return streetaddress
	 */
   public char[] getStreetaddress(int index,int index2) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).getStreetaddress();
   }

  
	/**
	*  set variable streetaddress
	*  @param value
	**/
   public void setStreetaddress(int index,int index2,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).setStreetaddress(value);
   } 

     /**
	 * 	Update Streetaddress 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStreetaddress(int index,int index2,char[] source, int sourceIndex) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).setStreetaddress(source, sourceIndex);
   	
   }
   
   public void setStreetaddress(int index,int index2,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).setStreetaddress(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Streetaddress 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStreetaddress(int index,int index2,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).setStreetaddress(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Streetaddress with another Field
	 *	@param value
	 */
   public void setStreetaddress(int index,int index2,Field source) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).setStreetaddress(source);
   }  
   
     /**
	 * 	Update Streetaddress 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStreetaddress(int index,int index2,Field source, int sourceIndex,int sourceLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).setStreetaddress(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Streetaddress 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStreetaddress(int index,int index2,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).setStreetaddress(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of requesttime
	 *	@return requesttime
	 */
   public char[] getRequesttime() throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getRequesttime();
   }

  
	/**
	*  set variable requesttime
	*  @param value
	**/
   public void setRequesttime(char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().setRequesttime(value);
   } 

     /**
	 * 	Update Requesttime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRequesttime(char[] source, int sourceIndex) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().setRequesttime(source, sourceIndex);
   	
   }
   
   public void setRequesttime(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().setRequesttime(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Requesttime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRequesttime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().setRequesttime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Requesttime with another Field
	 *	@param value
	 */
   public void setRequesttime(Field source) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().setRequesttime(source);
   }  
   
     /**
	 * 	Update Requesttime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRequesttime(Field source, int sourceIndex,int sourceLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().setRequesttime(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Requesttime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRequesttime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().setRequesttime(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of accessory
	 *	@return accessory
	 */
   public char[] getAccessory(int index,int index2,int index3,int index4) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getAccessory(index4);
   }

  
	/**
	*  set variable accessory
	*  @param value
	**/
   public void setAccessory(int index,int index2,int index3,int index4,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setAccessory((index4),value);
   } 

	/**
	 *	Returns the value of modelcounter
	 *	@return modelcounter
	 */
	public short getModelcounter(int index,int index2) throws CFException {        
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelcounter();
	}
	
	/**
	 * 	Update Modelcounter with the passed value
	 *	@param number
	 */
	public void setModelcounter(int index,int index2,short number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setModelcounter(number);
	}

	public void setModelcounter(int index,int index2,int number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setModelcounter((short)number);
	}

	public void setModelcounter(int index,int index2,long number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setModelcounter((short)number);
	}



	/**
	 *	Returns the value of color
	 *	@return color
	 */
   public char[] getColor(int index,int index2,int index3,int index4) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getAvailablecolors().getColor(index4);
   }

  
	/**
	*  set variable color
	*  @param value
	**/
   public void setColor(int index,int index2,int index3,int index4,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getAvailablecolors().setColor((index4),value);
   } 

	/**
	 *	Returns the value of manufacturer
	 *	@return manufacturer
	 */
   public char[] getManufacturer(int index,int index2) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getManufacturer();
   }

  
	/**
	*  set variable manufacturer
	*  @param value
	**/
   public void setManufacturer(int index,int index2,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setManufacturer(value);
   } 

     /**
	 * 	Update Manufacturer 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setManufacturer(int index,int index2,char[] source, int sourceIndex) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setManufacturer(source, sourceIndex);
   	
   }
   
   public void setManufacturer(int index,int index2,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setManufacturer(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Manufacturer 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setManufacturer(int index,int index2,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setManufacturer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Manufacturer with another Field
	 *	@param value
	 */
   public void setManufacturer(int index,int index2,Field source) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setManufacturer(source);
   }  
   
     /**
	 * 	Update Manufacturer 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setManufacturer(int index,int index2,Field source, int sourceIndex,int sourceLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setManufacturer(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Manufacturer 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setManufacturer(int index,int index2,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setManufacturer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of modelname
	 *	@return modelname
	 */
   public char[] getModelname(int index,int index2,int index3) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getModelname();
   }

  
	/**
	*  set variable modelname
	*  @param value
	**/
   public void setModelname(int index,int index2,int index3,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(value);
   } 

     /**
	 * 	Update Modelname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setModelname(int index,int index2,int index3,char[] source, int sourceIndex) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source, sourceIndex);
   	
   }
   
   public void setModelname(int index,int index2,int index3,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Modelname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setModelname(int index,int index2,int index3,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Modelname with another Field
	 *	@param value
	 */
   public void setModelname(int index,int index2,int index3,Field source) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source);
   }  
   
     /**
	 * 	Update Modelname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setModelname(int index,int index2,int index3,Field source, int sourceIndex,int sourceLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Modelname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setModelname(int index,int index2,int index3,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of requestdate
	 *	@return requestdate
	 */
   public char[] getRequestdate() throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getRequestdate();
   }

  
	/**
	*  set variable requestdate
	*  @param value
	**/
   public void setRequestdate(char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().setRequestdate(value);
   } 

     /**
	 * 	Update Requestdate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRequestdate(char[] source, int sourceIndex) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().setRequestdate(source, sourceIndex);
   	
   }
   
   public void setRequestdate(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().setRequestdate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Requestdate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRequestdate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().setRequestdate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Requestdate with another Field
	 *	@param value
	 */
   public void setRequestdate(Field source) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().setRequestdate(source);
   }  
   
     /**
	 * 	Update Requestdate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRequestdate(Field source, int sourceIndex,int sourceLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().setRequestdate(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Requestdate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRequestdate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().setRequestdate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Casecb01Ctx getCasecb01Ctx() {
            return Casecb01Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += xmlpc103Linkage.hashCode();
       return str.hashCode();
    }

    public FillInputDataSplit0OutCtx clone() {
        FillInputDataSplit0OutCtx cloneObj = new FillInputDataSplit0OutCtx();
        cloneObj.xmlpc103Linkage = new Xmlpc103Linkage();
        cloneObj.xmlpc103Linkage.set(xmlpc103Linkage.getClonedField());
        return cloneObj;
    }

    }

    public FillInputDataSplit0OutCtx getFillInputDataSplit0OutCtx() {
            return new FillInputDataSplit0OutCtx();
    }
     public class FillInputDataSplit1OutCtx implements Cloneable {
     Xmlpc103Linkage xmlpc103Linkage = Casecb01Ctx.this.getXmlpc103Linkage();

	/**
	 *	Returns the value of accessory
	 *	@return accessory
	 */
   public char[] getAccessory(int index,int index2,int index3,int index4) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getAccessory(index4);
   }

  
	/**
	*  set variable accessory
	*  @param value
	**/
   public void setAccessory(int index,int index2,int index3,int index4,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setAccessory((index4),value);
   } 

	/**
	 *	Returns the value of color
	 *	@return color
	 */
   public char[] getColor(int index,int index2,int index3,int index4) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getAvailablecolors().getColor(index4);
   }

  
	/**
	*  set variable color
	*  @param value
	**/
   public void setColor(int index,int index2,int index3,int index4,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getAvailablecolors().setColor((index4),value);
   } 

	/**
	 *	Returns the value of modelcounter
	 *	@return modelcounter
	 */
	public short getModelcounter(int index,int index2) throws CFException {        
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelcounter();
	}
	
	/**
	 * 	Update Modelcounter with the passed value
	 *	@param number
	 */
	public void setModelcounter(int index,int index2,short number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setModelcounter(number);
	}

	public void setModelcounter(int index,int index2,int number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setModelcounter((short)number);
	}

	public void setModelcounter(int index,int index2,long number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setModelcounter((short)number);
	}



	/**
	 *	Returns the value of country
	 *	@return country
	 */
   public char[] getCountry(int index,int index2) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getCountry();
   }

  
	/**
	*  set variable country
	*  @param value
	**/
   public void setCountry(int index,int index2,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setCountry(value);
   } 

     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry(int index,int index2,char[] source, int sourceIndex) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setCountry(source, sourceIndex);
   	
   }
   
   public void setCountry(int index,int index2,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setCountry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry(int index,int index2,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Country with another Field
	 *	@param value
	 */
   public void setCountry(int index,int index2,Field source) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setCountry(source);
   }  
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry(int index,int index2,Field source, int sourceIndex,int sourceLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setCountry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry(int index,int index2,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getLevel1NumIn(int index,int index2) throws CFException{      
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getLevel1NumIn();
	}

    public char[] getLevel1NumInString(int index,int index2) throws CFException {
          return  xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getLevel1NumIn().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Level1NumIn with the passed number
	 *	@param number
	 */
	public void setLevel1NumIn(int index,int index2,BigDecimal number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setLevel1NumIn(number);
   }

	/**
	 *	Returns the value of colorcounter
	 *	@return colorcounter
	 */
	public short getColorcounter(int index,int index2,int index3) throws CFException {        
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getColorcounter();
	}
	
	/**
	 * 	Update Colorcounter with the passed value
	 *	@param number
	 */
	public void setColorcounter(int index,int index2,int index3,short number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setColorcounter(number);
	}

	public void setColorcounter(int index,int index2,int index3,int number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setColorcounter((short)number);
	}

	public void setColorcounter(int index,int index2,int index3,long number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setColorcounter((short)number);
	}



	/**
	 *	Returns the value of manufacturer
	 *	@return manufacturer
	 */
   public char[] getManufacturer(int index,int index2) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getManufacturer();
   }

  
	/**
	*  set variable manufacturer
	*  @param value
	**/
   public void setManufacturer(int index,int index2,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setManufacturer(value);
   } 

     /**
	 * 	Update Manufacturer 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setManufacturer(int index,int index2,char[] source, int sourceIndex) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setManufacturer(source, sourceIndex);
   	
   }
   
   public void setManufacturer(int index,int index2,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setManufacturer(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Manufacturer 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setManufacturer(int index,int index2,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setManufacturer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Manufacturer with another Field
	 *	@param value
	 */
   public void setManufacturer(int index,int index2,Field source) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setManufacturer(source);
   }  
   
     /**
	 * 	Update Manufacturer 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setManufacturer(int index,int index2,Field source, int sourceIndex,int sourceLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setManufacturer(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Manufacturer 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setManufacturer(int index,int index2,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setManufacturer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of modelname
	 *	@return modelname
	 */
   public char[] getModelname(int index,int index2,int index3) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getModelname();
   }

  
	/**
	*  set variable modelname
	*  @param value
	**/
   public void setModelname(int index,int index2,int index3,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(value);
   } 

     /**
	 * 	Update Modelname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setModelname(int index,int index2,int index3,char[] source, int sourceIndex) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source, sourceIndex);
   	
   }
   
   public void setModelname(int index,int index2,int index3,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Modelname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setModelname(int index,int index2,int index3,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Modelname with another Field
	 *	@param value
	 */
   public void setModelname(int index,int index2,int index3,Field source) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source);
   }  
   
     /**
	 * 	Update Modelname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setModelname(int index,int index2,int index3,Field source, int sourceIndex,int sourceLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Modelname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setModelname(int index,int index2,int index3,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of enginesizecc
	 *	@return enginesizecc
	 */
	public short getEnginesizecc(int index,int index2,int index3) throws CFException {        
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getEnginesizecc();
	}
	
	/**
	 * 	Update Enginesizecc with the passed value
	 *	@param number
	 */
	public void setEnginesizecc(int index,int index2,int index3,short number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setEnginesizecc(number);
	}

	public void setEnginesizecc(int index,int index2,int index3,int number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setEnginesizecc((short)number);
	}

	public void setEnginesizecc(int index,int index2,int index3,long number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setEnginesizecc((short)number);
	}



	public BigDecimal getLevel2NumIn(int index,int index2,int index3) throws CFException{      
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getLevel2NumIn();
	}

    public char[] getLevel2NumInString(int index,int index2,int index3) throws CFException {
          return  xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getLevel2NumIn().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Level2NumIn with the passed number
	 *	@param number
	 */
	public void setLevel2NumIn(int index,int index2,int index3,BigDecimal number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setLevel2NumIn(number);
   }


        public Casecb01Ctx getCasecb01Ctx() {
            return Casecb01Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += xmlpc103Linkage.hashCode();
       return str.hashCode();
    }

    public FillInputDataSplit1OutCtx clone() {
        FillInputDataSplit1OutCtx cloneObj = new FillInputDataSplit1OutCtx();
        cloneObj.xmlpc103Linkage = new Xmlpc103Linkage();
        cloneObj.xmlpc103Linkage.set(xmlpc103Linkage.getClonedField());
        return cloneObj;
    }

    }

    public FillInputDataSplit1OutCtx getFillInputDataSplit1OutCtx() {
            return new FillInputDataSplit1OutCtx();
    }
     public class FillInputDataSplit2OutCtx implements Cloneable {
     Xmlpc103Linkage xmlpc103Linkage = Casecb01Ctx.this.getXmlpc103Linkage();

	/**
	 *	Returns the value of accessory
	 *	@return accessory
	 */
   public char[] getAccessory(int index,int index2,int index3,int index4) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getAccessory(index4);
   }

  
	/**
	*  set variable accessory
	*  @param value
	**/
   public void setAccessory(int index,int index2,int index3,int index4,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setAccessory((index4),value);
   } 

	/**
	 *	Returns the value of color
	 *	@return color
	 */
   public char[] getColor(int index,int index2,int index3,int index4) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getAvailablecolors().getColor(index4);
   }

  
	/**
	*  set variable color
	*  @param value
	**/
   public void setColor(int index,int index2,int index3,int index4,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getAvailablecolors().setColor((index4),value);
   } 

	/**
	 *	Returns the value of modelcounter
	 *	@return modelcounter
	 */
	public short getModelcounter(int index,int index2) throws CFException {        
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelcounter();
	}
	
	/**
	 * 	Update Modelcounter with the passed value
	 *	@param number
	 */
	public void setModelcounter(int index,int index2,short number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setModelcounter(number);
	}

	public void setModelcounter(int index,int index2,int number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setModelcounter((short)number);
	}

	public void setModelcounter(int index,int index2,long number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setModelcounter((short)number);
	}



	/**
	 *	Returns the value of country
	 *	@return country
	 */
   public char[] getCountry(int index,int index2) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getCountry();
   }

  
	/**
	*  set variable country
	*  @param value
	**/
   public void setCountry(int index,int index2,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setCountry(value);
   } 

     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry(int index,int index2,char[] source, int sourceIndex) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setCountry(source, sourceIndex);
   	
   }
   
   public void setCountry(int index,int index2,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setCountry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry(int index,int index2,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Country with another Field
	 *	@param value
	 */
   public void setCountry(int index,int index2,Field source) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setCountry(source);
   }  
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry(int index,int index2,Field source, int sourceIndex,int sourceLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setCountry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry(int index,int index2,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getLevel1NumIn(int index,int index2) throws CFException{      
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getLevel1NumIn();
	}

    public char[] getLevel1NumInString(int index,int index2) throws CFException {
          return  xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getLevel1NumIn().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Level1NumIn with the passed number
	 *	@param number
	 */
	public void setLevel1NumIn(int index,int index2,BigDecimal number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setLevel1NumIn(number);
   }

	/**
	 *	Returns the value of colorcounter
	 *	@return colorcounter
	 */
	public short getColorcounter(int index,int index2,int index3) throws CFException {        
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getColorcounter();
	}
	
	/**
	 * 	Update Colorcounter with the passed value
	 *	@param number
	 */
	public void setColorcounter(int index,int index2,int index3,short number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setColorcounter(number);
	}

	public void setColorcounter(int index,int index2,int index3,int number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setColorcounter((short)number);
	}

	public void setColorcounter(int index,int index2,int index3,long number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setColorcounter((short)number);
	}



	/**
	 *	Returns the value of manufacturer
	 *	@return manufacturer
	 */
   public char[] getManufacturer(int index,int index2) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getManufacturer();
   }

  
	/**
	*  set variable manufacturer
	*  @param value
	**/
   public void setManufacturer(int index,int index2,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setManufacturer(value);
   } 

     /**
	 * 	Update Manufacturer 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setManufacturer(int index,int index2,char[] source, int sourceIndex) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setManufacturer(source, sourceIndex);
   	
   }
   
   public void setManufacturer(int index,int index2,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setManufacturer(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Manufacturer 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setManufacturer(int index,int index2,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setManufacturer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Manufacturer with another Field
	 *	@param value
	 */
   public void setManufacturer(int index,int index2,Field source) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setManufacturer(source);
   }  
   
     /**
	 * 	Update Manufacturer 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setManufacturer(int index,int index2,Field source, int sourceIndex,int sourceLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setManufacturer(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Manufacturer 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setManufacturer(int index,int index2,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setManufacturer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of modelname
	 *	@return modelname
	 */
   public char[] getModelname(int index,int index2,int index3) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getModelname();
   }

  
	/**
	*  set variable modelname
	*  @param value
	**/
   public void setModelname(int index,int index2,int index3,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(value);
   } 

     /**
	 * 	Update Modelname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setModelname(int index,int index2,int index3,char[] source, int sourceIndex) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source, sourceIndex);
   	
   }
   
   public void setModelname(int index,int index2,int index3,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Modelname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setModelname(int index,int index2,int index3,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Modelname with another Field
	 *	@param value
	 */
   public void setModelname(int index,int index2,int index3,Field source) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source);
   }  
   
     /**
	 * 	Update Modelname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setModelname(int index,int index2,int index3,Field source, int sourceIndex,int sourceLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Modelname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setModelname(int index,int index2,int index3,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of enginesizecc
	 *	@return enginesizecc
	 */
	public short getEnginesizecc(int index,int index2,int index3) throws CFException {        
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getEnginesizecc();
	}
	
	/**
	 * 	Update Enginesizecc with the passed value
	 *	@param number
	 */
	public void setEnginesizecc(int index,int index2,int index3,short number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setEnginesizecc(number);
	}

	public void setEnginesizecc(int index,int index2,int index3,int number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setEnginesizecc((short)number);
	}

	public void setEnginesizecc(int index,int index2,int index3,long number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setEnginesizecc((short)number);
	}



	public BigDecimal getLevel2NumIn(int index,int index2,int index3) throws CFException{      
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getLevel2NumIn();
	}

    public char[] getLevel2NumInString(int index,int index2,int index3) throws CFException {
          return  xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getLevel2NumIn().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Level2NumIn with the passed number
	 *	@param number
	 */
	public void setLevel2NumIn(int index,int index2,int index3,BigDecimal number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setLevel2NumIn(number);
   }


        public Casecb01Ctx getCasecb01Ctx() {
            return Casecb01Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += xmlpc103Linkage.hashCode();
       return str.hashCode();
    }

    public FillInputDataSplit2OutCtx clone() {
        FillInputDataSplit2OutCtx cloneObj = new FillInputDataSplit2OutCtx();
        cloneObj.xmlpc103Linkage = new Xmlpc103Linkage();
        cloneObj.xmlpc103Linkage.set(xmlpc103Linkage.getClonedField());
        return cloneObj;
    }

    }

    public FillInputDataSplit2OutCtx getFillInputDataSplit2OutCtx() {
            return new FillInputDataSplit2OutCtx();
    }
     public class DisplayResultsInCtx implements Cloneable {
     Xmlpc103Linkage xmlpc103Linkage = Casecb01Ctx.this.getXmlpc103Linkage();
     Work work = Casecb01Ctx.this.getWork();

	/**
	 *	Returns the value of dealername
	 *	@return dealername
	 */
   public char[] getDealername(int index) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getDealername();
   }

  
	/**
	*  set variable dealername
	*  @param value
	**/
   public void setDealername(int index,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).setDealername(value);
   } 

     /**
	 * 	Update Dealername 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDealername(int index,char[] source, int sourceIndex) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).setDealername(source, sourceIndex);
   	
   }
   
   public void setDealername(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).setDealername(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Dealername 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDealername(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).setDealername(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Dealername with another Field
	 *	@param value
	 */
   public void setDealername(int index,Field source) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).setDealername(source);
   }  
   
     /**
	 * 	Update Dealername 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDealername(int index,Field source, int sourceIndex,int sourceLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).setDealername(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Dealername 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDealername(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).setDealername(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of s1
	 *	@return s1
	 */
	public short getS1() throws CFException {        
   		return work.getS1();
	}
	
	/**
	 * 	Update S1 with the passed value
	 *	@param number
	 */
	public void setS1(short number)  throws CFException{
		work.setS1(number);
	}

	public void setS1(int number)  throws CFException{
		work.setS1((short)number);
	}

	public void setS1(long number)  throws CFException{
		work.setS1((short)number);
	}




        public Casecb01Ctx getCasecb01Ctx() {
            return Casecb01Ctx.this;
        }

        public DisplayResultsOutCtx getDisplayResultsOutCtx() {
            return new DisplayResultsOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += xmlpc103Linkage.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DisplayResultsInCtx clone() {
        DisplayResultsInCtx cloneObj = new DisplayResultsInCtx();
        cloneObj.xmlpc103Linkage = new Xmlpc103Linkage();
        cloneObj.xmlpc103Linkage.set(xmlpc103Linkage.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayResultsInCtx getDisplayResultsInCtx() {
            return new DisplayResultsInCtx();
    }
     public class DisplayResultsOutCtx implements Cloneable {
     Xmlpc103Linkage xmlpc103Linkage = Casecb01Ctx.this.getXmlpc103Linkage();
     Work work = Casecb01Ctx.this.getWork();

	/**
	 *	Returns the value of s1
	 *	@return s1
	 */
	public short getS1() throws CFException {        
   		return work.getS1();
	}
	
	/**
	 * 	Update S1 with the passed value
	 *	@param number
	 */
	public void setS1(short number)  throws CFException{
		work.setS1(number);
	}

	public void setS1(int number)  throws CFException{
		work.setS1((short)number);
	}

	public void setS1(long number)  throws CFException{
		work.setS1((short)number);
	}




        public Casecb01Ctx getCasecb01Ctx() {
            return Casecb01Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += xmlpc103Linkage.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DisplayResultsOutCtx clone() {
        DisplayResultsOutCtx cloneObj = new DisplayResultsOutCtx();
        cloneObj.xmlpc103Linkage = new Xmlpc103Linkage();
        cloneObj.xmlpc103Linkage.set(xmlpc103Linkage.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayResultsOutCtx getDisplayResultsOutCtx() {
            return new DisplayResultsOutCtx();
    }
     public class DisplayDealersInCtx implements Cloneable {
     Xmlpc103Linkage xmlpc103Linkage = Casecb01Ctx.this.getXmlpc103Linkage();
     Work work = Casecb01Ctx.this.getWork();

	/**
	 *	Returns the value of streetaddress
	 *	@return streetaddress
	 */
   public char[] getStreetaddress(int index,int index2) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).getStreetaddress();
   }

  
	/**
	*  set variable streetaddress
	*  @param value
	**/
   public void setStreetaddress(int index,int index2,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).setStreetaddress(value);
   } 

     /**
	 * 	Update Streetaddress 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStreetaddress(int index,int index2,char[] source, int sourceIndex) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).setStreetaddress(source, sourceIndex);
   	
   }
   
   public void setStreetaddress(int index,int index2,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).setStreetaddress(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Streetaddress 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStreetaddress(int index,int index2,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).setStreetaddress(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Streetaddress with another Field
	 *	@param value
	 */
   public void setStreetaddress(int index,int index2,Field source) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).setStreetaddress(source);
   }  
   
     /**
	 * 	Update Streetaddress 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStreetaddress(int index,int index2,Field source, int sourceIndex,int sourceLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).setStreetaddress(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Streetaddress 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStreetaddress(int index,int index2,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).setStreetaddress(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of state
	 *	@return state
	 */
   public char[] getState(int index,int index2) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).getState();
   }

  
	/**
	*  set variable state
	*  @param value
	**/
   public void setState(int index,int index2,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).setState(value);
   } 

     /**
	 * 	Update State 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setState(int index,int index2,char[] source, int sourceIndex) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).setState(source, sourceIndex);
   	
   }
   
   public void setState(int index,int index2,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).setState(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update State 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setState(int index,int index2,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).setState(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update State with another Field
	 *	@param value
	 */
   public void setState(int index,int index2,Field source) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).setState(source);
   }  
   
     /**
	 * 	Update State 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setState(int index,int index2,Field source, int sourceIndex,int sourceLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).setState(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update State 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setState(int index,int index2,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getLocations(index2).setState(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of dealername
	 *	@return dealername
	 */
   public char[] getDealername(int index) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getDealername();
   }

  
	/**
	*  set variable dealername
	*  @param value
	**/
   public void setDealername(int index,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).setDealername(value);
   } 

     /**
	 * 	Update Dealername 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDealername(int index,char[] source, int sourceIndex) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).setDealername(source, sourceIndex);
   	
   }
   
   public void setDealername(int index,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).setDealername(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Dealername 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDealername(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).setDealername(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Dealername with another Field
	 *	@param value
	 */
   public void setDealername(int index,Field source) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).setDealername(source);
   }  
   
     /**
	 * 	Update Dealername 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDealername(int index,Field source, int sourceIndex,int sourceLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).setDealername(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Dealername 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDealername(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).setDealername(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of s2
	 *	@return s2
	 */
	public short getS2() throws CFException {        
   		return work.getS2();
	}
	
	/**
	 * 	Update S2 with the passed value
	 *	@param number
	 */
	public void setS2(short number)  throws CFException{
		work.setS2(number);
	}

	public void setS2(int number)  throws CFException{
		work.setS2((short)number);
	}

	public void setS2(long number)  throws CFException{
		work.setS2((short)number);
	}



	/**
	 *	Returns the value of makecounter
	 *	@return makecounter
	 */
	public short getMakecounter(int index) throws CFException {        
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getMakecounter();
	}
	
	/**
	 * 	Update Makecounter with the passed value
	 *	@param number
	 */
	public void setMakecounter(int index,short number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).setMakecounter(number);
	}

	public void setMakecounter(int index,int number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).setMakecounter((short)number);
	}

	public void setMakecounter(int index,long number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).setMakecounter((short)number);
	}



	/**
	 *	Returns the value of s1
	 *	@return s1
	 */
	public short getS1() throws CFException {        
   		return work.getS1();
	}
	
	/**
	 * 	Update S1 with the passed value
	 *	@param number
	 */
	public void setS1(short number)  throws CFException{
		work.setS1(number);
	}

	public void setS1(int number)  throws CFException{
		work.setS1((short)number);
	}

	public void setS1(long number)  throws CFException{
		work.setS1((short)number);
	}




        public Casecb01Ctx getCasecb01Ctx() {
            return Casecb01Ctx.this;
        }

        public DisplayDealersOutCtx getDisplayDealersOutCtx() {
            return new DisplayDealersOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += xmlpc103Linkage.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DisplayDealersInCtx clone() {
        DisplayDealersInCtx cloneObj = new DisplayDealersInCtx();
        cloneObj.xmlpc103Linkage = new Xmlpc103Linkage();
        cloneObj.xmlpc103Linkage.set(xmlpc103Linkage.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayDealersInCtx getDisplayDealersInCtx() {
            return new DisplayDealersInCtx();
    }
     public class DisplayDealersOutCtx implements Cloneable {
     Xmlpc103Linkage xmlpc103Linkage = Casecb01Ctx.this.getXmlpc103Linkage();
     Work work = Casecb01Ctx.this.getWork();

	/**
	 *	Returns the value of s2
	 *	@return s2
	 */
	public short getS2() throws CFException {        
   		return work.getS2();
	}
	
	/**
	 * 	Update S2 with the passed value
	 *	@param number
	 */
	public void setS2(short number)  throws CFException{
		work.setS2(number);
	}

	public void setS2(int number)  throws CFException{
		work.setS2((short)number);
	}

	public void setS2(long number)  throws CFException{
		work.setS2((short)number);
	}




        public Casecb01Ctx getCasecb01Ctx() {
            return Casecb01Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += xmlpc103Linkage.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DisplayDealersOutCtx clone() {
        DisplayDealersOutCtx cloneObj = new DisplayDealersOutCtx();
        cloneObj.xmlpc103Linkage = new Xmlpc103Linkage();
        cloneObj.xmlpc103Linkage.set(xmlpc103Linkage.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayDealersOutCtx getDisplayDealersOutCtx() {
            return new DisplayDealersOutCtx();
    }
     public class DisplayManufacturersInCtx implements Cloneable {
     Xmlpc103Linkage xmlpc103Linkage = Casecb01Ctx.this.getXmlpc103Linkage();
     Work work = Casecb01Ctx.this.getWork();

	/**
	 *	Returns the value of s2
	 *	@return s2
	 */
	public short getS2() throws CFException {        
   		return work.getS2();
	}
	
	/**
	 * 	Update S2 with the passed value
	 *	@param number
	 */
	public void setS2(short number)  throws CFException{
		work.setS2(number);
	}

	public void setS2(int number)  throws CFException{
		work.setS2((short)number);
	}

	public void setS2(long number)  throws CFException{
		work.setS2((short)number);
	}



	/**
	 *	Returns the value of modelcounter
	 *	@return modelcounter
	 */
	public short getModelcounter(int index,int index2) throws CFException {        
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelcounter();
	}
	
	/**
	 * 	Update Modelcounter with the passed value
	 *	@param number
	 */
	public void setModelcounter(int index,int index2,short number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setModelcounter(number);
	}

	public void setModelcounter(int index,int index2,int number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setModelcounter((short)number);
	}

	public void setModelcounter(int index,int index2,long number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setModelcounter((short)number);
	}



	/**
	 *	Returns the value of country
	 *	@return country
	 */
   public char[] getCountry(int index,int index2) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getCountry();
   }

  
	/**
	*  set variable country
	*  @param value
	**/
   public void setCountry(int index,int index2,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setCountry(value);
   } 

     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountry(int index,int index2,char[] source, int sourceIndex) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setCountry(source, sourceIndex);
   	
   }
   
   public void setCountry(int index,int index2,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setCountry(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Country 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountry(int index,int index2,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Country with another Field
	 *	@param value
	 */
   public void setCountry(int index,int index2,Field source) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setCountry(source);
   }  
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountry(int index,int index2,Field source, int sourceIndex,int sourceLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setCountry(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Country 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountry(int index,int index2,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setCountry(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getLevel1NumIn(int index,int index2) throws CFException{      
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getLevel1NumIn();
	}

    public char[] getLevel1NumInString(int index,int index2) throws CFException {
          return  xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getLevel1NumIn().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Level1NumIn with the passed number
	 *	@param number
	 */
	public void setLevel1NumIn(int index,int index2,BigDecimal number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setLevel1NumIn(number);
   }

	/**
	 *	Returns the value of manufacturer
	 *	@return manufacturer
	 */
   public char[] getManufacturer(int index,int index2) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getManufacturer();
   }

  
	/**
	*  set variable manufacturer
	*  @param value
	**/
   public void setManufacturer(int index,int index2,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setManufacturer(value);
   } 

     /**
	 * 	Update Manufacturer 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setManufacturer(int index,int index2,char[] source, int sourceIndex) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setManufacturer(source, sourceIndex);
   	
   }
   
   public void setManufacturer(int index,int index2,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setManufacturer(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Manufacturer 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setManufacturer(int index,int index2,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setManufacturer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Manufacturer with another Field
	 *	@param value
	 */
   public void setManufacturer(int index,int index2,Field source) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setManufacturer(source);
   }  
   
     /**
	 * 	Update Manufacturer 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setManufacturer(int index,int index2,Field source, int sourceIndex,int sourceLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setManufacturer(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Manufacturer 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setManufacturer(int index,int index2,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setManufacturer(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of modelname
	 *	@return modelname
	 */
   public char[] getModelname(int index,int index2,int index3) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getModelname();
   }

  
	/**
	*  set variable modelname
	*  @param value
	**/
   public void setModelname(int index,int index2,int index3,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(value);
   } 

     /**
	 * 	Update Modelname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setModelname(int index,int index2,int index3,char[] source, int sourceIndex) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source, sourceIndex);
   	
   }
   
   public void setModelname(int index,int index2,int index3,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Modelname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setModelname(int index,int index2,int index3,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Modelname with another Field
	 *	@param value
	 */
   public void setModelname(int index,int index2,int index3,Field source) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source);
   }  
   
     /**
	 * 	Update Modelname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setModelname(int index,int index2,int index3,Field source, int sourceIndex,int sourceLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Modelname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setModelname(int index,int index2,int index3,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of s3
	 *	@return s3
	 */
	public short getS3() throws CFException {        
   		return work.getS3();
	}
	
	/**
	 * 	Update S3 with the passed value
	 *	@param number
	 */
	public void setS3(short number)  throws CFException{
		work.setS3(number);
	}

	public void setS3(int number)  throws CFException{
		work.setS3((short)number);
	}

	public void setS3(long number)  throws CFException{
		work.setS3((short)number);
	}



	/**
	 *	Returns the value of s1
	 *	@return s1
	 */
	public short getS1() throws CFException {        
   		return work.getS1();
	}
	
	/**
	 * 	Update S1 with the passed value
	 *	@param number
	 */
	public void setS1(short number)  throws CFException{
		work.setS1(number);
	}

	public void setS1(int number)  throws CFException{
		work.setS1((short)number);
	}

	public void setS1(long number)  throws CFException{
		work.setS1((short)number);
	}




        public Casecb01Ctx getCasecb01Ctx() {
            return Casecb01Ctx.this;
        }

        public DisplayManufacturersOutCtx getDisplayManufacturersOutCtx() {
            return new DisplayManufacturersOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += xmlpc103Linkage.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DisplayManufacturersInCtx clone() {
        DisplayManufacturersInCtx cloneObj = new DisplayManufacturersInCtx();
        cloneObj.xmlpc103Linkage = new Xmlpc103Linkage();
        cloneObj.xmlpc103Linkage.set(xmlpc103Linkage.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayManufacturersInCtx getDisplayManufacturersInCtx() {
            return new DisplayManufacturersInCtx();
    }
     public class DisplayManufacturersOutCtx implements Cloneable {
     Xmlpc103Linkage xmlpc103Linkage = Casecb01Ctx.this.getXmlpc103Linkage();
     Work work = Casecb01Ctx.this.getWork();

	/**
	 *	Returns the value of edit
	 *	@return edit
	 */
   public char[] getEdit() throws CFException  {              
   		return work.getEdit();
   }

  
	/**
	*  set variable edit
	*  @param value
	**/
   public void setEdit(char[] value) throws CFException {
      work.setEdit(value);
   } 

     /**
	 * 	Update Edit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEdit(char[] source, int sourceIndex) throws CFException {
      work.setEdit(source, sourceIndex);
   	
   }
   
   public void setEdit(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setEdit(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Edit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEdit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setEdit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Edit with another Field
	 *	@param value
	 */
   public void setEdit(Field source) {
      work.setEdit(source);
   }  
   
     /**
	 * 	Update Edit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEdit(Field source, int sourceIndex,int sourceLen) {
      work.setEdit(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Edit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEdit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setEdit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of modelcounter
	 *	@return modelcounter
	 */
	public short getModelcounter(int index,int index2) throws CFException {        
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelcounter();
	}
	
	/**
	 * 	Update Modelcounter with the passed value
	 *	@param number
	 */
	public void setModelcounter(int index,int index2,short number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setModelcounter(number);
	}

	public void setModelcounter(int index,int index2,int number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setModelcounter((short)number);
	}

	public void setModelcounter(int index,int index2,long number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setModelcounter((short)number);
	}



	public BigDecimal getLevel1NumIn(int index,int index2) throws CFException{      
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getLevel1NumIn();
	}

    public char[] getLevel1NumInString(int index,int index2) throws CFException {
          return  xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getLevel1NumIn().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Level1NumIn with the passed number
	 *	@param number
	 */
	public void setLevel1NumIn(int index,int index2,BigDecimal number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).setLevel1NumIn(number);
   }

	/**
	 *	Returns the value of s3
	 *	@return s3
	 */
	public short getS3() throws CFException {        
   		return work.getS3();
	}
	
	/**
	 * 	Update S3 with the passed value
	 *	@param number
	 */
	public void setS3(short number)  throws CFException{
		work.setS3(number);
	}

	public void setS3(int number)  throws CFException{
		work.setS3((short)number);
	}

	public void setS3(long number)  throws CFException{
		work.setS3((short)number);
	}




        public Casecb01Ctx getCasecb01Ctx() {
            return Casecb01Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += xmlpc103Linkage.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DisplayManufacturersOutCtx clone() {
        DisplayManufacturersOutCtx cloneObj = new DisplayManufacturersOutCtx();
        cloneObj.xmlpc103Linkage = new Xmlpc103Linkage();
        cloneObj.xmlpc103Linkage.set(xmlpc103Linkage.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayManufacturersOutCtx getDisplayManufacturersOutCtx() {
            return new DisplayManufacturersOutCtx();
    }
     public class DisplayModelsInCtx implements Cloneable {
     Xmlpc103Linkage xmlpc103Linkage = Casecb01Ctx.this.getXmlpc103Linkage();
     Work work = Casecb01Ctx.this.getWork();

	/**
	 *	Returns the value of accessory
	 *	@return accessory
	 */
   public char[] getAccessory(int index,int index2,int index3,int index4) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getAccessory(index4);
   }

  
	/**
	*  set variable accessory
	*  @param value
	**/
   public void setAccessory(int index,int index2,int index3,int index4,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setAccessory((index4),value);
   } 

	/**
	 *	Returns the value of s2
	 *	@return s2
	 */
	public short getS2() throws CFException {        
   		return work.getS2();
	}
	
	/**
	 * 	Update S2 with the passed value
	 *	@param number
	 */
	public void setS2(short number)  throws CFException{
		work.setS2(number);
	}

	public void setS2(int number)  throws CFException{
		work.setS2((short)number);
	}

	public void setS2(long number)  throws CFException{
		work.setS2((short)number);
	}



	/**
	 *	Returns the value of color
	 *	@return color
	 */
   public char[] getColor(int index,int index2,int index3,int index4) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getAvailablecolors().getColor(index4);
   }

  
	/**
	*  set variable color
	*  @param value
	**/
   public void setColor(int index,int index2,int index3,int index4,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getAvailablecolors().setColor((index4),value);
   } 

	/**
	 *	Returns the value of colorcounter
	 *	@return colorcounter
	 */
	public short getColorcounter(int index,int index2,int index3) throws CFException {        
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getColorcounter();
	}
	
	/**
	 * 	Update Colorcounter with the passed value
	 *	@param number
	 */
	public void setColorcounter(int index,int index2,int index3,short number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setColorcounter(number);
	}

	public void setColorcounter(int index,int index2,int index3,int number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setColorcounter((short)number);
	}

	public void setColorcounter(int index,int index2,int index3,long number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setColorcounter((short)number);
	}



	/**
	 *	Returns the value of modelname
	 *	@return modelname
	 */
   public char[] getModelname(int index,int index2,int index3) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getModelname();
   }

  
	/**
	*  set variable modelname
	*  @param value
	**/
   public void setModelname(int index,int index2,int index3,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(value);
   } 

     /**
	 * 	Update Modelname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setModelname(int index,int index2,int index3,char[] source, int sourceIndex) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source, sourceIndex);
   	
   }
   
   public void setModelname(int index,int index2,int index3,char[] source, int sourceIndex , int sourceLen) throws CFException  {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Modelname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setModelname(int index,int index2,int index3,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Modelname with another Field
	 *	@param value
	 */
   public void setModelname(int index,int index2,int index3,Field source) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source);
   }  
   
     /**
	 * 	Update Modelname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setModelname(int index,int index2,int index3,Field source, int sourceIndex,int sourceLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Modelname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setModelname(int index,int index2,int index3,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setModelname(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of s4
	 *	@return s4
	 */
	public short getS4() throws CFException {        
   		return work.getS4();
	}
	
	/**
	 * 	Update S4 with the passed value
	 *	@param number
	 */
	public void setS4(short number)  throws CFException{
		work.setS4(number);
	}

	public void setS4(int number)  throws CFException{
		work.setS4((short)number);
	}

	public void setS4(long number)  throws CFException{
		work.setS4((short)number);
	}



	/**
	 *	Returns the value of s3
	 *	@return s3
	 */
	public short getS3() throws CFException {        
   		return work.getS3();
	}
	
	/**
	 * 	Update S3 with the passed value
	 *	@param number
	 */
	public void setS3(short number)  throws CFException{
		work.setS3(number);
	}

	public void setS3(int number)  throws CFException{
		work.setS3((short)number);
	}

	public void setS3(long number)  throws CFException{
		work.setS3((short)number);
	}



	/**
	 *	Returns the value of enginesizecc
	 *	@return enginesizecc
	 */
	public short getEnginesizecc(int index,int index2,int index3) throws CFException {        
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getEnginesizecc();
	}
	
	/**
	 * 	Update Enginesizecc with the passed value
	 *	@param number
	 */
	public void setEnginesizecc(int index,int index2,int index3,short number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setEnginesizecc(number);
	}

	public void setEnginesizecc(int index,int index2,int index3,int number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setEnginesizecc((short)number);
	}

	public void setEnginesizecc(int index,int index2,int index3,long number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setEnginesizecc((short)number);
	}



	public BigDecimal getLevel2NumIn(int index,int index2,int index3) throws CFException{      
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getLevel2NumIn();
	}

    public char[] getLevel2NumInString(int index,int index2,int index3) throws CFException {
          return  xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getLevel2NumIn().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Level2NumIn with the passed number
	 *	@param number
	 */
	public void setLevel2NumIn(int index,int index2,int index3,BigDecimal number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setLevel2NumIn(number);
   }

	/**
	 *	Returns the value of s1
	 *	@return s1
	 */
	public short getS1() throws CFException {        
   		return work.getS1();
	}
	
	/**
	 * 	Update S1 with the passed value
	 *	@param number
	 */
	public void setS1(short number)  throws CFException{
		work.setS1(number);
	}

	public void setS1(int number)  throws CFException{
		work.setS1((short)number);
	}

	public void setS1(long number)  throws CFException{
		work.setS1((short)number);
	}




        public Casecb01Ctx getCasecb01Ctx() {
            return Casecb01Ctx.this;
        }

        public DisplayModelsOutCtx getDisplayModelsOutCtx() {
            return new DisplayModelsOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += xmlpc103Linkage.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DisplayModelsInCtx clone() {
        DisplayModelsInCtx cloneObj = new DisplayModelsInCtx();
        cloneObj.xmlpc103Linkage = new Xmlpc103Linkage();
        cloneObj.xmlpc103Linkage.set(xmlpc103Linkage.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayModelsInCtx getDisplayModelsInCtx() {
            return new DisplayModelsInCtx();
    }
     public class DisplayModelsOutCtx implements Cloneable {
     Xmlpc103Linkage xmlpc103Linkage = Casecb01Ctx.this.getXmlpc103Linkage();
     Work work = Casecb01Ctx.this.getWork();

	/**
	 *	Returns the value of edit
	 *	@return edit
	 */
   public char[] getEdit() throws CFException  {              
   		return work.getEdit();
   }

  
	/**
	*  set variable edit
	*  @param value
	**/
   public void setEdit(char[] value) throws CFException {
      work.setEdit(value);
   } 

     /**
	 * 	Update Edit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEdit(char[] source, int sourceIndex) throws CFException {
      work.setEdit(source, sourceIndex);
   	
   }
   
   public void setEdit(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setEdit(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Edit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEdit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setEdit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Edit with another Field
	 *	@param value
	 */
   public void setEdit(Field source) {
      work.setEdit(source);
   }  
   
     /**
	 * 	Update Edit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEdit(Field source, int sourceIndex,int sourceLen) {
      work.setEdit(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Edit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEdit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setEdit(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of colorcounter
	 *	@return colorcounter
	 */
	public short getColorcounter(int index,int index2,int index3) throws CFException {        
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getColorcounter();
	}
	
	/**
	 * 	Update Colorcounter with the passed value
	 *	@param number
	 */
	public void setColorcounter(int index,int index2,int index3,short number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setColorcounter(number);
	}

	public void setColorcounter(int index,int index2,int index3,int number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setColorcounter((short)number);
	}

	public void setColorcounter(int index,int index2,int index3,long number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setColorcounter((short)number);
	}



	/**
	 *	Returns the value of s4
	 *	@return s4
	 */
	public short getS4() throws CFException {        
   		return work.getS4();
	}
	
	/**
	 * 	Update S4 with the passed value
	 *	@param number
	 */
	public void setS4(short number)  throws CFException{
		work.setS4(number);
	}

	public void setS4(int number)  throws CFException{
		work.setS4((short)number);
	}

	public void setS4(long number)  throws CFException{
		work.setS4((short)number);
	}



	public BigDecimal getLevel2NumIn(int index,int index2,int index3) throws CFException{      
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getLevel2NumIn();
	}

    public char[] getLevel2NumInString(int index,int index2,int index3) throws CFException {
          return  xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getLevel2NumIn().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Level2NumIn with the passed number
	 *	@param number
	 */
	public void setLevel2NumIn(int index,int index2,int index3,BigDecimal number)  throws CFException{
		xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setLevel2NumIn(number);
   }


        public Casecb01Ctx getCasecb01Ctx() {
            return Casecb01Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += xmlpc103Linkage.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DisplayModelsOutCtx clone() {
        DisplayModelsOutCtx cloneObj = new DisplayModelsOutCtx();
        cloneObj.xmlpc103Linkage = new Xmlpc103Linkage();
        cloneObj.xmlpc103Linkage.set(xmlpc103Linkage.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayModelsOutCtx getDisplayModelsOutCtx() {
            return new DisplayModelsOutCtx();
    }
     public class DisplayColorsInCtx implements Cloneable {
     Xmlpc103Linkage xmlpc103Linkage = Casecb01Ctx.this.getXmlpc103Linkage();
     Work work = Casecb01Ctx.this.getWork();

	/**
	 *	Returns the value of color
	 *	@return color
	 */
   public char[] getColor(int index,int index2,int index3,int index4) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getAvailablecolors().getColor(index4);
   }

  
	/**
	*  set variable color
	*  @param value
	**/
   public void setColor(int index,int index2,int index3,int index4,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getAvailablecolors().setColor((index4),value);
   } 

	/**
	 *	Returns the value of s2
	 *	@return s2
	 */
	public short getS2() throws CFException {        
   		return work.getS2();
	}
	
	/**
	 * 	Update S2 with the passed value
	 *	@param number
	 */
	public void setS2(short number)  throws CFException{
		work.setS2(number);
	}

	public void setS2(int number)  throws CFException{
		work.setS2((short)number);
	}

	public void setS2(long number)  throws CFException{
		work.setS2((short)number);
	}



	/**
	 *	Returns the value of s4
	 *	@return s4
	 */
	public short getS4() throws CFException {        
   		return work.getS4();
	}
	
	/**
	 * 	Update S4 with the passed value
	 *	@param number
	 */
	public void setS4(short number)  throws CFException{
		work.setS4(number);
	}

	public void setS4(int number)  throws CFException{
		work.setS4((short)number);
	}

	public void setS4(long number)  throws CFException{
		work.setS4((short)number);
	}



	/**
	 *	Returns the value of s3
	 *	@return s3
	 */
	public short getS3() throws CFException {        
   		return work.getS3();
	}
	
	/**
	 * 	Update S3 with the passed value
	 *	@param number
	 */
	public void setS3(short number)  throws CFException{
		work.setS3(number);
	}

	public void setS3(int number)  throws CFException{
		work.setS3((short)number);
	}

	public void setS3(long number)  throws CFException{
		work.setS3((short)number);
	}



	/**
	 *	Returns the value of s1
	 *	@return s1
	 */
	public short getS1() throws CFException {        
   		return work.getS1();
	}
	
	/**
	 * 	Update S1 with the passed value
	 *	@param number
	 */
	public void setS1(short number)  throws CFException{
		work.setS1(number);
	}

	public void setS1(int number)  throws CFException{
		work.setS1((short)number);
	}

	public void setS1(long number)  throws CFException{
		work.setS1((short)number);
	}




        public Casecb01Ctx getCasecb01Ctx() {
            return Casecb01Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += xmlpc103Linkage.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DisplayColorsInCtx clone() {
        DisplayColorsInCtx cloneObj = new DisplayColorsInCtx();
        cloneObj.xmlpc103Linkage = new Xmlpc103Linkage();
        cloneObj.xmlpc103Linkage.set(xmlpc103Linkage.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayColorsInCtx getDisplayColorsInCtx() {
            return new DisplayColorsInCtx();
    }
     public class DisplayAccessoriesInCtx implements Cloneable {
     Xmlpc103Linkage xmlpc103Linkage = Casecb01Ctx.this.getXmlpc103Linkage();
     Work work = Casecb01Ctx.this.getWork();

	/**
	 *	Returns the value of accessory
	 *	@return accessory
	 */
   public char[] getAccessory(int index,int index2,int index3,int index4) throws CFException  {              
   		return xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).getAccessory(index4);
   }

  
	/**
	*  set variable accessory
	*  @param value
	**/
   public void setAccessory(int index,int index2,int index3,int index4,char[] value) throws CFException {
      xmlpc103Linkage.getInputRequest().getGetinventory().getInventoryrequested().getDealers(index).getManufacturers(index2).getModelsin(index3).setAccessory((index4),value);
   } 

	/**
	 *	Returns the value of s2
	 *	@return s2
	 */
	public short getS2() throws CFException {        
   		return work.getS2();
	}
	
	/**
	 * 	Update S2 with the passed value
	 *	@param number
	 */
	public void setS2(short number)  throws CFException{
		work.setS2(number);
	}

	public void setS2(int number)  throws CFException{
		work.setS2((short)number);
	}

	public void setS2(long number)  throws CFException{
		work.setS2((short)number);
	}



	/**
	 *	Returns the value of s4
	 *	@return s4
	 */
	public short getS4() throws CFException {        
   		return work.getS4();
	}
	
	/**
	 * 	Update S4 with the passed value
	 *	@param number
	 */
	public void setS4(short number)  throws CFException{
		work.setS4(number);
	}

	public void setS4(int number)  throws CFException{
		work.setS4((short)number);
	}

	public void setS4(long number)  throws CFException{
		work.setS4((short)number);
	}



	/**
	 *	Returns the value of s3
	 *	@return s3
	 */
	public short getS3() throws CFException {        
   		return work.getS3();
	}
	
	/**
	 * 	Update S3 with the passed value
	 *	@param number
	 */
	public void setS3(short number)  throws CFException{
		work.setS3(number);
	}

	public void setS3(int number)  throws CFException{
		work.setS3((short)number);
	}

	public void setS3(long number)  throws CFException{
		work.setS3((short)number);
	}



	/**
	 *	Returns the value of s1
	 *	@return s1
	 */
	public short getS1() throws CFException {        
   		return work.getS1();
	}
	
	/**
	 * 	Update S1 with the passed value
	 *	@param number
	 */
	public void setS1(short number)  throws CFException{
		work.setS1(number);
	}

	public void setS1(int number)  throws CFException{
		work.setS1((short)number);
	}

	public void setS1(long number)  throws CFException{
		work.setS1((short)number);
	}




        public Casecb01Ctx getCasecb01Ctx() {
            return Casecb01Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += xmlpc103Linkage.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public DisplayAccessoriesInCtx clone() {
        DisplayAccessoriesInCtx cloneObj = new DisplayAccessoriesInCtx();
        cloneObj.xmlpc103Linkage = new Xmlpc103Linkage();
        cloneObj.xmlpc103Linkage.set(xmlpc103Linkage.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public DisplayAccessoriesInCtx getDisplayAccessoriesInCtx() {
            return new DisplayAccessoriesInCtx();
    }
}
