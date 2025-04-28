package com.cloudframe.app.iovb32k;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.iovb32k.dto.OutRec;
import com.cloudframe.app.iovb32k.dto.DataValues;
import com.cloudframe.app.iovb32k.file.records.OutRecMax;
import com.cloudframe.app.iovb32k.file.records.InRecMax;
import com.cloudframe.app.iovb32k.dto.LsParmG;
import com.cloudframe.app.iovb32k.dto.Work;
import com.cloudframe.app.iovb32k.dto.LsParm;
import com.cloudframe.app.iovb32k.dto.InRec;


@Context
public class Iovb32kCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;
    InRecMax inRecMax;
    InRec inRec;
    DataValues dataValues;
    LsParm lsParm;
    OutRec outRec;
    OutRecMax outRecMax;


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
    public InRecMax getInRecMax() {
        if (inRecMax == null) {
            inRecMax = new InRecMax();
        }

        return inRecMax;
    }

    public void setInRecMax(InRecMax inRecMax) {
        this.inRecMax = inRecMax;
    }
    public InRec getInRec() {
        if (inRec == null) {
            inRec = new InRec();
        }

        return inRec;
    }

    public void setInRec(InRec inRec) {
        this.inRec = inRec;
    }
    public DataValues getDataValues() {
        if (dataValues == null) {
            dataValues = new DataValues();
        }

        return dataValues;
    }

    public void setDataValues(DataValues dataValues) {
        this.dataValues = dataValues;
    }
    public LsParm getLsParm() {
        if (lsParm == null) {
            lsParm = new LsParm();
        }

        return lsParm;
    }

    public void setLsParm(LsParm lsParm) {
        this.lsParm = lsParm;
    }
    public OutRec getOutRec() {
        if (outRec == null) {
            outRec = new OutRec();
        }

        return outRec;
    }

    public void setOutRec(OutRec outRec) {
        this.outRec = outRec;
    }
    public OutRecMax getOutRecMax() {
        if (outRecMax == null) {
            outRecMax = new OutRecMax();
        }

        return outRecMax;
    }

    public void setOutRecMax(OutRecMax outRecMax) {
        this.outRecMax = outRecMax;
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
        str += inRecMax.hashCode();
        str += inRec.hashCode();
        str += dataValues.hashCode();
        str += lsParm.hashCode();
        str += outRec.hashCode();
        str += outRecMax.hashCode();
       return str.hashCode();
    }

    public Iovb32kCtx clone() {
        Iovb32kCtx cloneObj = new Iovb32kCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.inRecMax = new InRecMax();
        cloneObj.inRecMax.set(inRecMax.getClonedField());
        cloneObj.inRec = new InRec();
        cloneObj.inRec.set(inRec.getClonedField());
        cloneObj.dataValues = new DataValues();
        cloneObj.dataValues.set(dataValues.getClonedField());
        cloneObj.lsParm = new LsParm();
        cloneObj.lsParm.set(lsParm.getClonedField());
        cloneObj.outRec = new OutRec();
        cloneObj.outRec.set(outRec.getClonedField());
        cloneObj.outRecMax = new OutRecMax();
        cloneObj.outRecMax.set(outRecMax.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     LsParm lsParm = Iovb32kCtx.this.getLsParm();


        public Iovb32kCtx getIovb32kCtx() {
            return Iovb32kCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += lsParm.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.lsParm = new LsParm();
        cloneObj.lsParm.set(lsParm.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class MainlineInCtx implements Cloneable {
     Work work = Iovb32kCtx.this.getWork();

	/**
	 *	Returns the value of dataLenMax
	 *	@return dataLenMax
	 */
	public short getDataLenMax() throws CFException {        
   		return work.getDataLenMax();
	}
	
	/**
	 * 	Update DataLenMax with the passed value
	 *	@param number
	 */
	public void setDataLenMax(short number)  throws CFException{
		work.setDataLenMax(number);
	}

	public void setDataLenMax(int number)  throws CFException{
		work.setDataLenMax((short)number);
	}

	public void setDataLenMax(long number)  throws CFException{
		work.setDataLenMax((short)number);
	}



	/**
	 *	Test condition "R" "B" for isModeRead()
	 *	@return  Returns true if isModeRead() is "R" "B"
	 */
   public boolean isModeRead() throws CFException {
      return work.isModeRead();
   }

	/**
	*  set values "R" "B"
	*/
   	public void setModeReadTrue()  throws CFException{  			
    	work.setModeReadTrue();
   	}
	/**
	 *	Test condition 1 for isNoMoreRecords()
	 *	@return  Returns true if isNoMoreRecords() is 1
	 */
   public boolean isNoMoreRecords() throws CFException {
      return work.isNoMoreRecords();
   }

	/**
	*  set values 1
	*/
   	public void setNoMoreRecordsTrue()  throws CFException{  			
    	work.setNoMoreRecordsTrue();
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
	 *	Returns the value of dataLenMin
	 *	@return dataLenMin
	 */
	public short getDataLenMin() throws CFException {        
   		return work.getDataLenMin();
	}
	
	/**
	 * 	Update DataLenMin with the passed value
	 *	@param number
	 */
	public void setDataLenMin(short number)  throws CFException{
		work.setDataLenMin(number);
	}

	public void setDataLenMin(int number)  throws CFException{
		work.setDataLenMin((short)number);
	}

	public void setDataLenMin(long number)  throws CFException{
		work.setDataLenMin((short)number);
	}



	/**
	 *	Returns the value of recInCtr
	 *	@return recInCtr
	 */
	public short getRecInCtr() throws CFException {        
   		return work.getRecInCtr();
	}
	
	/**
	 * 	Update RecInCtr with the passed value
	 *	@param number
	 */
	public void setRecInCtr(short number)  throws CFException{
		work.setRecInCtr(number);
	}

	public void setRecInCtr(int number)  throws CFException{
		work.setRecInCtr((short)number);
	}

	public void setRecInCtr(long number)  throws CFException{
		work.setRecInCtr((short)number);
	}



	/**
	 *	Test condition "W" "B" for isModeWrite()
	 *	@return  Returns true if isModeWrite() is "W" "B"
	 */
   public boolean isModeWrite() throws CFException {
      return work.isModeWrite();
   }

	/**
	*  set values "W" "B"
	*/
   	public void setModeWriteTrue()  throws CFException{  			
    	work.setModeWriteTrue();
   	}
	/**
	 *	Returns the value of recOutCtr
	 *	@return recOutCtr
	 */
	public short getRecOutCtr() throws CFException {        
   		return work.getRecOutCtr();
	}
	
	/**
	 * 	Update RecOutCtr with the passed value
	 *	@param number
	 */
	public void setRecOutCtr(short number)  throws CFException{
		work.setRecOutCtr(number);
	}

	public void setRecOutCtr(int number)  throws CFException{
		work.setRecOutCtr((short)number);
	}

	public void setRecOutCtr(long number)  throws CFException{
		work.setRecOutCtr((short)number);
	}




        public Iovb32kCtx getIovb32kCtx() {
            return Iovb32kCtx.this;
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
        str += work.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class MainlineOutCtx implements Cloneable {
     Work work = Iovb32kCtx.this.getWork();

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
	 *	Returns the value of displayNum1
	 *	@return displayNum1
	 */
   public char[] getDisplayNum1() throws CFException  {              
   		return work.getDisplayNum1();
   }

  
	/**
	*  set variable displayNum1
	*  @param value
	**/
   public void setDisplayNum1(char[] value) throws CFException {
      work.setDisplayNum1(value);
   } 

     /**
	 * 	Update DisplayNum1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDisplayNum1(char[] source, int sourceIndex) throws CFException {
      work.setDisplayNum1(source, sourceIndex);
   	
   }
   
   public void setDisplayNum1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setDisplayNum1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DisplayNum1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDisplayNum1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setDisplayNum1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DisplayNum1 with another Field
	 *	@param value
	 */
   public void setDisplayNum1(Field source) {
      work.setDisplayNum1(source);
   }  
   
     /**
	 * 	Update DisplayNum1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDisplayNum1(Field source, int sourceIndex,int sourceLen) {
      work.setDisplayNum1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DisplayNum1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDisplayNum1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setDisplayNum1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of recInCtr
	 *	@return recInCtr
	 */
	public short getRecInCtr() throws CFException {        
   		return work.getRecInCtr();
	}
	
	/**
	 * 	Update RecInCtr with the passed value
	 *	@param number
	 */
	public void setRecInCtr(short number)  throws CFException{
		work.setRecInCtr(number);
	}

	public void setRecInCtr(int number)  throws CFException{
		work.setRecInCtr((short)number);
	}

	public void setRecInCtr(long number)  throws CFException{
		work.setRecInCtr((short)number);
	}



	/**
	 *	Returns the value of recOutCtr
	 *	@return recOutCtr
	 */
	public short getRecOutCtr() throws CFException {        
   		return work.getRecOutCtr();
	}
	
	/**
	 * 	Update RecOutCtr with the passed value
	 *	@param number
	 */
	public void setRecOutCtr(short number)  throws CFException{
		work.setRecOutCtr(number);
	}

	public void setRecOutCtr(int number)  throws CFException{
		work.setRecOutCtr((short)number);
	}

	public void setRecOutCtr(long number)  throws CFException{
		work.setRecOutCtr((short)number);
	}




        public Iovb32kCtx getIovb32kCtx() {
            return Iovb32kCtx.this;
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

    public MainlineOutCtx clone() {
        MainlineOutCtx cloneObj = new MainlineOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public MainlineOutCtx getMainlineOutCtx() {
            return new MainlineOutCtx();
    }
     public class ValidateInputParmInCtx implements Cloneable {
     Work work = Iovb32kCtx.this.getWork();
     LsParm lsParm = Iovb32kCtx.this.getLsParm();

	/**
	 *	Returns the value of lsParmLen
	 *	@return lsParmLen
	 */
	public short getLsParmLen() throws CFException {        
   		return lsParm.getLsParmLen();
	}
	
	/**
	 * 	Update LsParmLen with the passed value
	 *	@param number
	 */
	public void setLsParmLen(short number)  throws CFException{
		lsParm.setLsParmLen(number);
	}

	public void setLsParmLen(int number)  throws CFException{
		lsParm.setLsParmLen((short)number);
	}

	public void setLsParmLen(long number)  throws CFException{
		lsParm.setLsParmLen((short)number);
	}



	/**
	 *	Returns the value of dataLenMax
	 *	@return dataLenMax
	 */
	public short getDataLenMax() throws CFException {        
   		return work.getDataLenMax();
	}
	
	/**
	 * 	Update DataLenMax with the passed value
	 *	@param number
	 */
	public void setDataLenMax(short number)  throws CFException{
		work.setDataLenMax(number);
	}

	public void setDataLenMax(int number)  throws CFException{
		work.setDataLenMax((short)number);
	}

	public void setDataLenMax(long number)  throws CFException{
		work.setDataLenMax((short)number);
	}



	/**
	 *	Returns the value of lsParmDataLenMin
	 *	@return lsParmDataLenMin
	 */
	public long getLsParmDataLenMin() throws CFException {
   		return lsParm.getLsParmG().getLsParmDataLenMin();
	}


	/**
	 *	Returns String value of lsParmDataLenMin
	 *	@return lsParmDataLenMin
	 */
	public char[]  getLsParmDataLenMinString() throws CFException {
	     return String.valueOf(lsParm.getLsParmG().getLsParmDataLenMinString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsParmDataLenMinIsNumeric()  throws CFException{
	    return lsParm.getLsParmG().lsParmDataLenMinIsNumeric();
	}

	/**
	 * 	Update LsParmDataLenMin with the passed value
	 *	@param number
	 */
	public void setLsParmDataLenMin(long number)  throws CFException{
		lsParm.getLsParmG().setLsParmDataLenMin(number);
	}
	

	
	/**
	 * 	Update LsParmDataLenMin with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsParmDataLenMin(char[] value)  throws CFException {
		lsParm.getLsParmG().setLsParmDataLenMin(value);
	}
	
	/**
	 * 	Update LsParmDataLenMin with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsParmDataLenMinString(char[] value)  throws CFException{
		lsParm.getLsParmG().setLsParmDataLenMin(value);
	}	

	/**
	 *	Returns the value of dataLenMin
	 *	@return dataLenMin
	 */
	public short getDataLenMin() throws CFException {        
   		return work.getDataLenMin();
	}
	
	/**
	 * 	Update DataLenMin with the passed value
	 *	@param number
	 */
	public void setDataLenMin(short number)  throws CFException{
		work.setDataLenMin(number);
	}

	public void setDataLenMin(int number)  throws CFException{
		work.setDataLenMin((short)number);
	}

	public void setDataLenMin(long number)  throws CFException{
		work.setDataLenMin((short)number);
	}



	/**
	 *	Test condition "B" "R" "W" for isLsParmModeValid()
	 *	@return  Returns true if isLsParmModeValid() is "B" "R" "W"
	 */
   public boolean isLsParmModeValid() throws CFException {
      return lsParm.getLsParmG().isLsParmModeValid();
   }

	/**
	*  set values "B" "R" "W"
	*/
   	public void setLsParmModeValidTrue()  throws CFException{  			
    	lsParm.getLsParmG().setLsParmModeValidTrue();
   	}
	/**
	 *	Returns the value of lsParmDataLenMax
	 *	@return lsParmDataLenMax
	 */
	public long getLsParmDataLenMax() throws CFException {
   		return lsParm.getLsParmG().getLsParmDataLenMax();
	}


	/**
	 *	Returns String value of lsParmDataLenMax
	 *	@return lsParmDataLenMax
	 */
	public char[]  getLsParmDataLenMaxString() throws CFException {
	     return String.valueOf(lsParm.getLsParmG().getLsParmDataLenMaxString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsParmDataLenMaxIsNumeric()  throws CFException{
	    return lsParm.getLsParmG().lsParmDataLenMaxIsNumeric();
	}

	/**
	 * 	Update LsParmDataLenMax with the passed value
	 *	@param number
	 */
	public void setLsParmDataLenMax(long number)  throws CFException{
		lsParm.getLsParmG().setLsParmDataLenMax(number);
	}
	

	
	/**
	 * 	Update LsParmDataLenMax with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsParmDataLenMax(char[] value)  throws CFException {
		lsParm.getLsParmG().setLsParmDataLenMax(value);
	}
	
	/**
	 * 	Update LsParmDataLenMax with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsParmDataLenMaxString(char[] value)  throws CFException{
		lsParm.getLsParmG().setLsParmDataLenMax(value);
	}	

	/**
	 *	Returns the value of lsParmG
	 *	@return lsParmG
	 */   
	 public LsParmG getLsParmG() {
   	return lsParm.getLsParmG();
   }

   /**
	* 	Update LsParmG with the passed value
	*	@param value
	*/
   public void setLsParmG(char[] value) throws CFException {
      lsParm.setLsParmG(value);
   }   

     /**
	 * 	Update LsParmG 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setLsParmG(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	lsParm.setLsParmG(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsParmG 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsParmG(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	lsParm.setLsParmG(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsParmG with another Field
	 *	@param value
	 */
   public void setLsParmG(Field source) {
   	lsParm.setLsParmG(source);
   }  
   
     /**
	 * 	Update LsParmG 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setLsParmG(Field source, int sourceIndex,int sourceLen) {
   	lsParm.setLsParmG(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsParmG 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsParmG(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	lsParm.setLsParmG(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsParmMode
	 *	@return lsParmMode
	 */
   public char[] getLsParmMode() throws CFException  {              
   		return lsParm.getLsParmG().getLsParmMode();
   }

  
	/**
	*  set variable lsParmMode
	*  @param value
	**/
   public void setLsParmMode(char[] value) throws CFException {
      lsParm.getLsParmG().setLsParmMode(value);
   } 

     /**
	 * 	Update LsParmMode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsParmMode(char[] source, int sourceIndex) throws CFException {
      lsParm.getLsParmG().setLsParmMode(source, sourceIndex);
   	
   }
   
   public void setLsParmMode(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lsParm.getLsParmG().setLsParmMode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsParmMode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsParmMode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsParm.getLsParmG().setLsParmMode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsParmMode with another Field
	 *	@param value
	 */
   public void setLsParmMode(Field source) {
      lsParm.getLsParmG().setLsParmMode(source);
   }  
   
     /**
	 * 	Update LsParmMode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsParmMode(Field source, int sourceIndex,int sourceLen) {
      lsParm.getLsParmG().setLsParmMode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsParmMode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsParmMode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsParm.getLsParmG().setLsParmMode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lreclMax
	 *	@return lreclMax
	 */
	public short getLreclMax() throws CFException {        
   		return work.getLreclMax();
	}
	
	/**
	 * 	Update LreclMax with the passed value
	 *	@param number
	 */
	public void setLreclMax(short number)  throws CFException{
		work.setLreclMax(number);
	}

	public void setLreclMax(int number)  throws CFException{
		work.setLreclMax((short)number);
	}

	public void setLreclMax(long number)  throws CFException{
		work.setLreclMax((short)number);
	}




        public Iovb32kCtx getIovb32kCtx() {
            return Iovb32kCtx.this;
        }

        public ValidateInputParmOutCtx getValidateInputParmOutCtx() {
            return new ValidateInputParmOutCtx();
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
        str += lsParm.hashCode();
       return str.hashCode();
    }

    public ValidateInputParmInCtx clone() {
        ValidateInputParmInCtx cloneObj = new ValidateInputParmInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.lsParm = new LsParm();
        cloneObj.lsParm.set(lsParm.getClonedField());
        return cloneObj;
    }

    }

    public ValidateInputParmInCtx getValidateInputParmInCtx() {
            return new ValidateInputParmInCtx();
    }
     public class ValidateInputParmOutCtx implements Cloneable {
     Work work = Iovb32kCtx.this.getWork();
     LsParm lsParm = Iovb32kCtx.this.getLsParm();

	/**
	 *	Returns the value of dataLenMax
	 *	@return dataLenMax
	 */
	public short getDataLenMax() throws CFException {        
   		return work.getDataLenMax();
	}
	
	/**
	 * 	Update DataLenMax with the passed value
	 *	@param number
	 */
	public void setDataLenMax(short number)  throws CFException{
		work.setDataLenMax(number);
	}

	public void setDataLenMax(int number)  throws CFException{
		work.setDataLenMax((short)number);
	}

	public void setDataLenMax(long number)  throws CFException{
		work.setDataLenMax((short)number);
	}



	/**
	 *	Returns the value of mode
	 *	@return mode
	 */
   public char[] getMode() throws CFException  {              
   		return work.getMode();
   }

  
	/**
	*  set variable mode
	*  @param value
	**/
   public void setMode(char[] value) throws CFException {
      work.setMode(value);
   } 

	/**
	 *	Returns the value of displayNum2
	 *	@return displayNum2
	 */
   public char[] getDisplayNum2() throws CFException  {              
   		return work.getDisplayNum2();
   }

  
	/**
	*  set variable displayNum2
	*  @param value
	**/
   public void setDisplayNum2(char[] value) throws CFException {
      work.setDisplayNum2(value);
   } 

     /**
	 * 	Update DisplayNum2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDisplayNum2(char[] source, int sourceIndex) throws CFException {
      work.setDisplayNum2(source, sourceIndex);
   	
   }
   
   public void setDisplayNum2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setDisplayNum2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DisplayNum2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDisplayNum2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setDisplayNum2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DisplayNum2 with another Field
	 *	@param value
	 */
   public void setDisplayNum2(Field source) {
      work.setDisplayNum2(source);
   }  
   
     /**
	 * 	Update DisplayNum2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDisplayNum2(Field source, int sourceIndex,int sourceLen) {
      work.setDisplayNum2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DisplayNum2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDisplayNum2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setDisplayNum2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lsParmDataLenMin
	 *	@return lsParmDataLenMin
	 */
	public long getLsParmDataLenMin() throws CFException {
   		return lsParm.getLsParmG().getLsParmDataLenMin();
	}


	/**
	 *	Returns String value of lsParmDataLenMin
	 *	@return lsParmDataLenMin
	 */
	public char[]  getLsParmDataLenMinString() throws CFException {
	     return String.valueOf(lsParm.getLsParmG().getLsParmDataLenMinString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsParmDataLenMinIsNumeric()  throws CFException{
	    return lsParm.getLsParmG().lsParmDataLenMinIsNumeric();
	}

	/**
	 * 	Update LsParmDataLenMin with the passed value
	 *	@param number
	 */
	public void setLsParmDataLenMin(long number)  throws CFException{
		lsParm.getLsParmG().setLsParmDataLenMin(number);
	}
	

	
	/**
	 * 	Update LsParmDataLenMin with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsParmDataLenMin(char[] value)  throws CFException {
		lsParm.getLsParmG().setLsParmDataLenMin(value);
	}
	
	/**
	 * 	Update LsParmDataLenMin with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsParmDataLenMinString(char[] value)  throws CFException{
		lsParm.getLsParmG().setLsParmDataLenMin(value);
	}	

	/**
	 *	Returns the value of dataLenMin
	 *	@return dataLenMin
	 */
	public short getDataLenMin() throws CFException {        
   		return work.getDataLenMin();
	}
	
	/**
	 * 	Update DataLenMin with the passed value
	 *	@param number
	 */
	public void setDataLenMin(short number)  throws CFException{
		work.setDataLenMin(number);
	}

	public void setDataLenMin(int number)  throws CFException{
		work.setDataLenMin((short)number);
	}

	public void setDataLenMin(long number)  throws CFException{
		work.setDataLenMin((short)number);
	}



	/**
	 *	Test condition "B" for isModeBoth()
	 *	@return  Returns true if isModeBoth() is "B"
	 */
   public boolean isModeBoth() throws CFException {
      return work.isModeBoth();
   }

	/**
	*  set values "B"
	*/
   	public void setModeBothTrue()  throws CFException{  			
    	work.setModeBothTrue();
   	}
	/**
	 *	Returns the value of lsParmDataLenMax
	 *	@return lsParmDataLenMax
	 */
	public long getLsParmDataLenMax() throws CFException {
   		return lsParm.getLsParmG().getLsParmDataLenMax();
	}


	/**
	 *	Returns String value of lsParmDataLenMax
	 *	@return lsParmDataLenMax
	 */
	public char[]  getLsParmDataLenMaxString() throws CFException {
	     return String.valueOf(lsParm.getLsParmG().getLsParmDataLenMaxString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean lsParmDataLenMaxIsNumeric()  throws CFException{
	    return lsParm.getLsParmG().lsParmDataLenMaxIsNumeric();
	}

	/**
	 * 	Update LsParmDataLenMax with the passed value
	 *	@param number
	 */
	public void setLsParmDataLenMax(long number)  throws CFException{
		lsParm.getLsParmG().setLsParmDataLenMax(number);
	}
	

	
	/**
	 * 	Update LsParmDataLenMax with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsParmDataLenMax(char[] value)  throws CFException {
		lsParm.getLsParmG().setLsParmDataLenMax(value);
	}
	
	/**
	 * 	Update LsParmDataLenMax with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsParmDataLenMaxString(char[] value)  throws CFException{
		lsParm.getLsParmG().setLsParmDataLenMax(value);
	}	

	/**
	 *	Returns the value of lsParmMode
	 *	@return lsParmMode
	 */
   public char[] getLsParmMode() throws CFException  {              
   		return lsParm.getLsParmG().getLsParmMode();
   }

  
	/**
	*  set variable lsParmMode
	*  @param value
	**/
   public void setLsParmMode(char[] value) throws CFException {
      lsParm.getLsParmG().setLsParmMode(value);
   } 

     /**
	 * 	Update LsParmMode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsParmMode(char[] source, int sourceIndex) throws CFException {
      lsParm.getLsParmG().setLsParmMode(source, sourceIndex);
   	
   }
   
   public void setLsParmMode(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      lsParm.getLsParmG().setLsParmMode(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LsParmMode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsParmMode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsParm.getLsParmG().setLsParmMode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LsParmMode with another Field
	 *	@param value
	 */
   public void setLsParmMode(Field source) {
      lsParm.getLsParmG().setLsParmMode(source);
   }  
   
     /**
	 * 	Update LsParmMode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsParmMode(Field source, int sourceIndex,int sourceLen) {
      lsParm.getLsParmG().setLsParmMode(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update LsParmMode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsParmMode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      lsParm.getLsParmG().setLsParmMode(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of displayNum1
	 *	@return displayNum1
	 */
   public char[] getDisplayNum1() throws CFException  {              
   		return work.getDisplayNum1();
   }

  
	/**
	*  set variable displayNum1
	*  @param value
	**/
   public void setDisplayNum1(char[] value) throws CFException {
      work.setDisplayNum1(value);
   } 

     /**
	 * 	Update DisplayNum1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDisplayNum1(char[] source, int sourceIndex) throws CFException {
      work.setDisplayNum1(source, sourceIndex);
   	
   }
   
   public void setDisplayNum1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setDisplayNum1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DisplayNum1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDisplayNum1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setDisplayNum1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DisplayNum1 with another Field
	 *	@param value
	 */
   public void setDisplayNum1(Field source) {
      work.setDisplayNum1(source);
   }  
   
     /**
	 * 	Update DisplayNum1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDisplayNum1(Field source, int sourceIndex,int sourceLen) {
      work.setDisplayNum1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DisplayNum1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDisplayNum1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setDisplayNum1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of lreclMax
	 *	@return lreclMax
	 */
	public short getLreclMax() throws CFException {        
   		return work.getLreclMax();
	}
	
	/**
	 * 	Update LreclMax with the passed value
	 *	@param number
	 */
	public void setLreclMax(short number)  throws CFException{
		work.setLreclMax(number);
	}

	public void setLreclMax(int number)  throws CFException{
		work.setLreclMax((short)number);
	}

	public void setLreclMax(long number)  throws CFException{
		work.setLreclMax((short)number);
	}




        public Iovb32kCtx getIovb32kCtx() {
            return Iovb32kCtx.this;
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
        str += lsParm.hashCode();
       return str.hashCode();
    }

    public ValidateInputParmOutCtx clone() {
        ValidateInputParmOutCtx cloneObj = new ValidateInputParmOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.lsParm = new LsParm();
        cloneObj.lsParm.set(lsParm.getClonedField());
        return cloneObj;
    }

    }

    public ValidateInputParmOutCtx getValidateInputParmOutCtx() {
            return new ValidateInputParmOutCtx();
    }
     public class OpenInFileInCtx implements Cloneable {
     Work work = Iovb32kCtx.this.getWork();
     InRecMax inRecMax = Iovb32kCtx.this.getInRecMax();

	/**
	 *	Returns the value of inRecMax
	 *	@return inRecMax
	 */   
	 public InRecMax getInRecMax() {
   	return inRecMax;
   }


	/**
	 *	Returns the value of inFileStatus
	 *	@return inFileStatus
	 */
	public int getInFileStatus() throws CFException {
   		return work.getInFileStatus();
	}


	/**
	 *	Returns String value of inFileStatus
	 *	@return inFileStatus
	 */
	public char[]  getInFileStatusString() throws CFException {
	     return String.valueOf(work.getInFileStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inFileStatusIsNumeric()  throws CFException{
	    return work.inFileStatusIsNumeric();
	}

	/**
	 * 	Update InFileStatus with the passed value
	 *	@param number
	 */
	public void setInFileStatus(int number)  throws CFException{
		work.setInFileStatus(number);
	}
	

	public void setInFileStatus(long number)  throws CFException{
	    work.setInFileStatus(number);
	}
	
	
	/**
	 * 	Update InFileStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setInFileStatus(char[] value)  throws CFException {
		work.setInFileStatus(value);
	}
	
	/**
	 * 	Update InFileStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInFileStatusString(char[] value)  throws CFException{
		work.setInFileStatus(value);
	}	


        public Iovb32kCtx getIovb32kCtx() {
            return Iovb32kCtx.this;
        }

        public OpenInFileOutCtx getOpenInFileOutCtx() {
            return new OpenInFileOutCtx();
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
        str += inRecMax.hashCode();
       return str.hashCode();
    }

    public OpenInFileInCtx clone() {
        OpenInFileInCtx cloneObj = new OpenInFileInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.inRecMax = new InRecMax();
        cloneObj.inRecMax.set(inRecMax.getClonedField());
        return cloneObj;
    }

    }

    public OpenInFileInCtx getOpenInFileInCtx() {
            return new OpenInFileInCtx();
    }
     public class OpenInFileOutCtx implements Cloneable {
     Work work = Iovb32kCtx.this.getWork();
     InRecMax inRecMax = Iovb32kCtx.this.getInRecMax();

	/**
	 *	Returns the value of inFileStatus
	 *	@return inFileStatus
	 */
	public int getInFileStatus() throws CFException {
   		return work.getInFileStatus();
	}


	/**
	 *	Returns String value of inFileStatus
	 *	@return inFileStatus
	 */
	public char[]  getInFileStatusString() throws CFException {
	     return String.valueOf(work.getInFileStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inFileStatusIsNumeric()  throws CFException{
	    return work.inFileStatusIsNumeric();
	}

	/**
	 * 	Update InFileStatus with the passed value
	 *	@param number
	 */
	public void setInFileStatus(int number)  throws CFException{
		work.setInFileStatus(number);
	}
	

	public void setInFileStatus(long number)  throws CFException{
	    work.setInFileStatus(number);
	}
	
	
	/**
	 * 	Update InFileStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setInFileStatus(char[] value)  throws CFException {
		work.setInFileStatus(value);
	}
	
	/**
	 * 	Update InFileStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInFileStatusString(char[] value)  throws CFException{
		work.setInFileStatus(value);
	}	


        public Iovb32kCtx getIovb32kCtx() {
            return Iovb32kCtx.this;
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
        str += inRecMax.hashCode();
       return str.hashCode();
    }

    public OpenInFileOutCtx clone() {
        OpenInFileOutCtx cloneObj = new OpenInFileOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.inRecMax = new InRecMax();
        cloneObj.inRecMax.set(inRecMax.getClonedField());
        return cloneObj;
    }

    }

    public OpenInFileOutCtx getOpenInFileOutCtx() {
            return new OpenInFileOutCtx();
    }
     public class OpenOutFileInCtx implements Cloneable {
     Work work = Iovb32kCtx.this.getWork();
     OutRecMax outRecMax = Iovb32kCtx.this.getOutRecMax();

	/**
	 *	Returns the value of outRecMax
	 *	@return outRecMax
	 */   
	 public OutRecMax getOutRecMax() {
   	return outRecMax;
   }


	/**
	 *	Returns the value of outFileStatus
	 *	@return outFileStatus
	 */
	public int getOutFileStatus() throws CFException {
   		return work.getOutFileStatus();
	}


	/**
	 *	Returns String value of outFileStatus
	 *	@return outFileStatus
	 */
	public char[]  getOutFileStatusString() throws CFException {
	     return String.valueOf(work.getOutFileStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outFileStatusIsNumeric()  throws CFException{
	    return work.outFileStatusIsNumeric();
	}

	/**
	 * 	Update OutFileStatus with the passed value
	 *	@param number
	 */
	public void setOutFileStatus(int number)  throws CFException{
		work.setOutFileStatus(number);
	}
	

	public void setOutFileStatus(long number)  throws CFException{
	    work.setOutFileStatus(number);
	}
	
	
	/**
	 * 	Update OutFileStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutFileStatus(char[] value)  throws CFException {
		work.setOutFileStatus(value);
	}
	
	/**
	 * 	Update OutFileStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutFileStatusString(char[] value)  throws CFException{
		work.setOutFileStatus(value);
	}	


        public Iovb32kCtx getIovb32kCtx() {
            return Iovb32kCtx.this;
        }

        public OpenOutFileOutCtx getOpenOutFileOutCtx() {
            return new OpenOutFileOutCtx();
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
        str += outRecMax.hashCode();
       return str.hashCode();
    }

    public OpenOutFileInCtx clone() {
        OpenOutFileInCtx cloneObj = new OpenOutFileInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.outRecMax = new OutRecMax();
        cloneObj.outRecMax.set(outRecMax.getClonedField());
        return cloneObj;
    }

    }

    public OpenOutFileInCtx getOpenOutFileInCtx() {
            return new OpenOutFileInCtx();
    }
     public class OpenOutFileOutCtx implements Cloneable {
     Work work = Iovb32kCtx.this.getWork();
     OutRecMax outRecMax = Iovb32kCtx.this.getOutRecMax();

	/**
	 *	Returns the value of outFileStatus
	 *	@return outFileStatus
	 */
	public int getOutFileStatus() throws CFException {
   		return work.getOutFileStatus();
	}


	/**
	 *	Returns String value of outFileStatus
	 *	@return outFileStatus
	 */
	public char[]  getOutFileStatusString() throws CFException {
	     return String.valueOf(work.getOutFileStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outFileStatusIsNumeric()  throws CFException{
	    return work.outFileStatusIsNumeric();
	}

	/**
	 * 	Update OutFileStatus with the passed value
	 *	@param number
	 */
	public void setOutFileStatus(int number)  throws CFException{
		work.setOutFileStatus(number);
	}
	

	public void setOutFileStatus(long number)  throws CFException{
	    work.setOutFileStatus(number);
	}
	
	
	/**
	 * 	Update OutFileStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutFileStatus(char[] value)  throws CFException {
		work.setOutFileStatus(value);
	}
	
	/**
	 * 	Update OutFileStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutFileStatusString(char[] value)  throws CFException{
		work.setOutFileStatus(value);
	}	

	/**
	 *	Returns the value of inFileStatus
	 *	@return inFileStatus
	 */
	public int getInFileStatus() throws CFException {
   		return work.getInFileStatus();
	}


	/**
	 *	Returns String value of inFileStatus
	 *	@return inFileStatus
	 */
	public char[]  getInFileStatusString() throws CFException {
	     return String.valueOf(work.getInFileStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inFileStatusIsNumeric()  throws CFException{
	    return work.inFileStatusIsNumeric();
	}

	/**
	 * 	Update InFileStatus with the passed value
	 *	@param number
	 */
	public void setInFileStatus(int number)  throws CFException{
		work.setInFileStatus(number);
	}
	

	public void setInFileStatus(long number)  throws CFException{
	    work.setInFileStatus(number);
	}
	
	
	/**
	 * 	Update InFileStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setInFileStatus(char[] value)  throws CFException {
		work.setInFileStatus(value);
	}
	
	/**
	 * 	Update InFileStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInFileStatusString(char[] value)  throws CFException{
		work.setInFileStatus(value);
	}	


        public Iovb32kCtx getIovb32kCtx() {
            return Iovb32kCtx.this;
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
        str += outRecMax.hashCode();
       return str.hashCode();
    }

    public OpenOutFileOutCtx clone() {
        OpenOutFileOutCtx cloneObj = new OpenOutFileOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.outRecMax = new OutRecMax();
        cloneObj.outRecMax.set(outRecMax.getClonedField());
        return cloneObj;
    }

    }

    public OpenOutFileOutCtx getOpenOutFileOutCtx() {
            return new OpenOutFileOutCtx();
    }
     public class ReadInFileInCtx implements Cloneable {
     Work work = Iovb32kCtx.this.getWork();
     InRecMax inRecMax = Iovb32kCtx.this.getInRecMax();
     InRec inRec = Iovb32kCtx.this.getInRec();

	/**
	 *	Returns the value of inRec
	 *	@return inRec
	 */   
	 public InRec getInRec() {
   	return inRec;
   }


	/**
	 *	Returns the value of recInCtr
	 *	@return recInCtr
	 */
	public short getRecInCtr() throws CFException {        
   		return work.getRecInCtr();
	}
	
	/**
	 * 	Update RecInCtr with the passed value
	 *	@param number
	 */
	public void setRecInCtr(short number)  throws CFException{
		work.setRecInCtr(number);
	}

	public void setRecInCtr(int number)  throws CFException{
		work.setRecInCtr((short)number);
	}

	public void setRecInCtr(long number)  throws CFException{
		work.setRecInCtr((short)number);
	}




        public Iovb32kCtx getIovb32kCtx() {
            return Iovb32kCtx.this;
        }

        public ReadInFileOutCtx getReadInFileOutCtx() {
            return new ReadInFileOutCtx();
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
        str += inRecMax.hashCode();
        str += inRec.hashCode();
       return str.hashCode();
    }

    public ReadInFileInCtx clone() {
        ReadInFileInCtx cloneObj = new ReadInFileInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.inRecMax = new InRecMax();
        cloneObj.inRecMax.set(inRecMax.getClonedField());
        cloneObj.inRec = new InRec();
        cloneObj.inRec.set(inRec.getClonedField());
        return cloneObj;
    }

    }

    public ReadInFileInCtx getReadInFileInCtx() {
            return new ReadInFileInCtx();
    }
     public class ReadInFileOutCtx implements Cloneable {
     Work work = Iovb32kCtx.this.getWork();
     InRecMax inRecMax = Iovb32kCtx.this.getInRecMax();
     InRec inRec = Iovb32kCtx.this.getInRec();

	/**
	 *	Returns the value of inRecMax
	 *	@return inRecMax
	 */   
	 public InRecMax getInRecMax() {
   	return inRecMax;
   }


	/**
	 *	Test condition 1 for isNoMoreRecords()
	 *	@return  Returns true if isNoMoreRecords() is 1
	 */
   public boolean isNoMoreRecords() throws CFException {
      return work.isNoMoreRecords();
   }

	/**
	*  set values 1
	*/
   	public void setNoMoreRecordsTrue()  throws CFException{  			
    	work.setNoMoreRecordsTrue();
   	}
	/**
	 *	Returns the value of inRecLen
	 *	@return inRecLen
	 */
	public int getInRecLen() throws CFException {        
   		return work.getInRecLen();
	}
	
	/**
	 * 	Update InRecLen with the passed value
	 *	@param number
	 */
	public void setInRecLen(int number)  throws CFException{
		work.setInRecLen(number);
	}


	public void setInRecLen(long number)  throws CFException{
		work.setInRecLen((int)number);
	}


	/**
	 *	Returns the value of recInCtr
	 *	@return recInCtr
	 */
	public short getRecInCtr() throws CFException {        
   		return work.getRecInCtr();
	}
	
	/**
	 * 	Update RecInCtr with the passed value
	 *	@param number
	 */
	public void setRecInCtr(short number)  throws CFException{
		work.setRecInCtr(number);
	}

	public void setRecInCtr(int number)  throws CFException{
		work.setRecInCtr((short)number);
	}

	public void setRecInCtr(long number)  throws CFException{
		work.setRecInCtr((short)number);
	}



	/**
	 *	Returns the value of inFileStatus
	 *	@return inFileStatus
	 */
	public int getInFileStatus() throws CFException {
   		return work.getInFileStatus();
	}


	/**
	 *	Returns String value of inFileStatus
	 *	@return inFileStatus
	 */
	public char[]  getInFileStatusString() throws CFException {
	     return String.valueOf(work.getInFileStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inFileStatusIsNumeric()  throws CFException{
	    return work.inFileStatusIsNumeric();
	}

	/**
	 * 	Update InFileStatus with the passed value
	 *	@param number
	 */
	public void setInFileStatus(int number)  throws CFException{
		work.setInFileStatus(number);
	}
	

	public void setInFileStatus(long number)  throws CFException{
	    work.setInFileStatus(number);
	}
	
	
	/**
	 * 	Update InFileStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setInFileStatus(char[] value)  throws CFException {
		work.setInFileStatus(value);
	}
	
	/**
	 * 	Update InFileStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInFileStatusString(char[] value)  throws CFException{
		work.setInFileStatus(value);
	}	


        public Iovb32kCtx getIovb32kCtx() {
            return Iovb32kCtx.this;
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
        str += inRecMax.hashCode();
        str += inRec.hashCode();
       return str.hashCode();
    }

    public ReadInFileOutCtx clone() {
        ReadInFileOutCtx cloneObj = new ReadInFileOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.inRecMax = new InRecMax();
        cloneObj.inRecMax.set(inRecMax.getClonedField());
        cloneObj.inRec = new InRec();
        cloneObj.inRec.set(inRec.getClonedField());
        return cloneObj;
    }

    }

    public ReadInFileOutCtx getReadInFileOutCtx() {
            return new ReadInFileOutCtx();
    }
     public class ValidateInRecDataInCtx implements Cloneable {
     Work work = Iovb32kCtx.this.getWork();
     DataValues dataValues = Iovb32kCtx.this.getDataValues();
     InRec inRec = Iovb32kCtx.this.getInRec();

	/**
	 *	Returns the value of j
	 *	@return j
	 */
	public short getJ() throws CFException {        
   		return work.getJ();
	}
	
	/**
	 * 	Update J with the passed value
	 *	@param number
	 */
	public void setJ(short number)  throws CFException{
		work.setJ(number);
	}

	public void setJ(int number)  throws CFException{
		work.setJ((short)number);
	}

	public void setJ(long number)  throws CFException{
		work.setJ((short)number);
	}



	/**
	 *	Returns the value of dataLenMax
	 *	@return dataLenMax
	 */
	public short getDataLenMax() throws CFException {        
   		return work.getDataLenMax();
	}
	
	/**
	 * 	Update DataLenMax with the passed value
	 *	@param number
	 */
	public void setDataLenMax(short number)  throws CFException{
		work.setDataLenMax(number);
	}

	public void setDataLenMax(int number)  throws CFException{
		work.setDataLenMax((short)number);
	}

	public void setDataLenMax(long number)  throws CFException{
		work.setDataLenMax((short)number);
	}



	/**
	 *	Returns the value of dataValues
	 *	@return dataValues
	 */   
	 public DataValues getDataValues() {
   	return dataValues;
   }


	/**
	 *	Returns the value of k
	 *	@return k
	 */
	public short getK() throws CFException {        
   		return work.getK();
	}
	
	/**
	 * 	Update K with the passed value
	 *	@param number
	 */
	public void setK(short number)  throws CFException{
		work.setK(number);
	}

	public void setK(int number)  throws CFException{
		work.setK((short)number);
	}

	public void setK(long number)  throws CFException{
		work.setK((short)number);
	}



	/**
	 *	Returns the value of inRecLen
	 *	@return inRecLen
	 */
	public int getInRecLen() throws CFException {        
   		return work.getInRecLen();
	}
	
	/**
	 * 	Update InRecLen with the passed value
	 *	@param number
	 */
	public void setInRecLen(int number)  throws CFException{
		work.setInRecLen(number);
	}


	public void setInRecLen(long number)  throws CFException{
		work.setInRecLen((int)number);
	}


	/**
	 *	Returns the value of inRecDataLen
	 *	@return inRecDataLen
	 */
	public int getInRecDataLen() throws CFException {        
   		return inRec.getInRecDataLen();
	}
	
	/**
	 * 	Update InRecDataLen with the passed value
	 *	@param number
	 */
	public void setInRecDataLen(int number)  throws CFException{
		inRec.setInRecDataLen(number);
	}


	public void setInRecDataLen(long number)  throws CFException{
		inRec.setInRecDataLen((int)number);
	}


	/**
	 *	Returns the value of inRecByte
	 *	@return inRecByte
	 */
   public char[] getInRecByte(int index) throws CFException  {              
   		return inRec.getInRecData().getInRecByte(index);
   }

  
	/**
	*  set variable inRecByte
	*  @param value
	**/
   public void setInRecByte(int index,char[] value) throws CFException {
      inRec.getInRecData().setInRecByte((index),value);
   } 

	/**
	 *	Returns the value of recInCtr
	 *	@return recInCtr
	 */
	public short getRecInCtr() throws CFException {        
   		return work.getRecInCtr();
	}
	
	/**
	 * 	Update RecInCtr with the passed value
	 *	@param number
	 */
	public void setRecInCtr(short number)  throws CFException{
		work.setRecInCtr(number);
	}

	public void setRecInCtr(int number)  throws CFException{
		work.setRecInCtr((short)number);
	}

	public void setRecInCtr(long number)  throws CFException{
		work.setRecInCtr((short)number);
	}




        public Iovb32kCtx getIovb32kCtx() {
            return Iovb32kCtx.this;
        }

        public ValidateInRecDataOutCtx getValidateInRecDataOutCtx() {
            return new ValidateInRecDataOutCtx();
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
        str += dataValues.hashCode();
        str += inRec.hashCode();
       return str.hashCode();
    }

    public ValidateInRecDataInCtx clone() {
        ValidateInRecDataInCtx cloneObj = new ValidateInRecDataInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dataValues = new DataValues();
        cloneObj.dataValues.set(dataValues.getClonedField());
        cloneObj.inRec = new InRec();
        cloneObj.inRec.set(inRec.getClonedField());
        return cloneObj;
    }

    }

    public ValidateInRecDataInCtx getValidateInRecDataInCtx() {
            return new ValidateInRecDataInCtx();
    }
     public class ValidateInRecDataOutCtx implements Cloneable {
     Work work = Iovb32kCtx.this.getWork();
     InRec inRec = Iovb32kCtx.this.getInRec();
     DataValues dataValues = Iovb32kCtx.this.getDataValues();

	/**
	 *	Returns the value of j
	 *	@return j
	 */
	public short getJ() throws CFException {        
   		return work.getJ();
	}
	
	/**
	 * 	Update J with the passed value
	 *	@param number
	 */
	public void setJ(short number)  throws CFException{
		work.setJ(number);
	}

	public void setJ(int number)  throws CFException{
		work.setJ((short)number);
	}

	public void setJ(long number)  throws CFException{
		work.setJ((short)number);
	}



	/**
	 *	Returns the value of displayNum2
	 *	@return displayNum2
	 */
   public char[] getDisplayNum2() throws CFException  {              
   		return work.getDisplayNum2();
   }

  
	/**
	*  set variable displayNum2
	*  @param value
	**/
   public void setDisplayNum2(char[] value) throws CFException {
      work.setDisplayNum2(value);
   } 

     /**
	 * 	Update DisplayNum2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDisplayNum2(char[] source, int sourceIndex) throws CFException {
      work.setDisplayNum2(source, sourceIndex);
   	
   }
   
   public void setDisplayNum2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setDisplayNum2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DisplayNum2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDisplayNum2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setDisplayNum2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DisplayNum2 with another Field
	 *	@param value
	 */
   public void setDisplayNum2(Field source) {
      work.setDisplayNum2(source);
   }  
   
     /**
	 * 	Update DisplayNum2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDisplayNum2(Field source, int sourceIndex,int sourceLen) {
      work.setDisplayNum2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DisplayNum2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDisplayNum2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setDisplayNum2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of displayNum3
	 *	@return displayNum3
	 */
   public char[] getDisplayNum3() throws CFException  {              
   		return work.getDisplayNum3();
   }

  
	/**
	*  set variable displayNum3
	*  @param value
	**/
   public void setDisplayNum3(char[] value) throws CFException {
      work.setDisplayNum3(value);
   } 

     /**
	 * 	Update DisplayNum3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDisplayNum3(char[] source, int sourceIndex) throws CFException {
      work.setDisplayNum3(source, sourceIndex);
   	
   }
   
   public void setDisplayNum3(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setDisplayNum3(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DisplayNum3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDisplayNum3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setDisplayNum3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DisplayNum3 with another Field
	 *	@param value
	 */
   public void setDisplayNum3(Field source) {
      work.setDisplayNum3(source);
   }  
   
     /**
	 * 	Update DisplayNum3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDisplayNum3(Field source, int sourceIndex,int sourceLen) {
      work.setDisplayNum3(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DisplayNum3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDisplayNum3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setDisplayNum3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of k
	 *	@return k
	 */
	public short getK() throws CFException {        
   		return work.getK();
	}
	
	/**
	 * 	Update K with the passed value
	 *	@param number
	 */
	public void setK(short number)  throws CFException{
		work.setK(number);
	}

	public void setK(int number)  throws CFException{
		work.setK((short)number);
	}

	public void setK(long number)  throws CFException{
		work.setK((short)number);
	}



	/**
	 *	Returns the value of inRecLen
	 *	@return inRecLen
	 */
	public int getInRecLen() throws CFException {        
   		return work.getInRecLen();
	}
	
	/**
	 * 	Update InRecLen with the passed value
	 *	@param number
	 */
	public void setInRecLen(int number)  throws CFException{
		work.setInRecLen(number);
	}


	public void setInRecLen(long number)  throws CFException{
		work.setInRecLen((int)number);
	}


	/**
	 *	Returns the value of inRecDataLen
	 *	@return inRecDataLen
	 */
	public int getInRecDataLen() throws CFException {        
   		return inRec.getInRecDataLen();
	}
	
	/**
	 * 	Update InRecDataLen with the passed value
	 *	@param number
	 */
	public void setInRecDataLen(int number)  throws CFException{
		inRec.setInRecDataLen(number);
	}


	public void setInRecDataLen(long number)  throws CFException{
		inRec.setInRecDataLen((int)number);
	}


	/**
	 *	Returns the value of displayNum1
	 *	@return displayNum1
	 */
   public char[] getDisplayNum1() throws CFException  {              
   		return work.getDisplayNum1();
   }

  
	/**
	*  set variable displayNum1
	*  @param value
	**/
   public void setDisplayNum1(char[] value) throws CFException {
      work.setDisplayNum1(value);
   } 

     /**
	 * 	Update DisplayNum1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDisplayNum1(char[] source, int sourceIndex) throws CFException {
      work.setDisplayNum1(source, sourceIndex);
   	
   }
   
   public void setDisplayNum1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setDisplayNum1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update DisplayNum1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDisplayNum1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setDisplayNum1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update DisplayNum1 with another Field
	 *	@param value
	 */
   public void setDisplayNum1(Field source) {
      work.setDisplayNum1(source);
   }  
   
     /**
	 * 	Update DisplayNum1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDisplayNum1(Field source, int sourceIndex,int sourceLen) {
      work.setDisplayNum1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update DisplayNum1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDisplayNum1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setDisplayNum1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of recInCtr
	 *	@return recInCtr
	 */
	public short getRecInCtr() throws CFException {        
   		return work.getRecInCtr();
	}
	
	/**
	 * 	Update RecInCtr with the passed value
	 *	@param number
	 */
	public void setRecInCtr(short number)  throws CFException{
		work.setRecInCtr(number);
	}

	public void setRecInCtr(int number)  throws CFException{
		work.setRecInCtr((short)number);
	}

	public void setRecInCtr(long number)  throws CFException{
		work.setRecInCtr((short)number);
	}




        public Iovb32kCtx getIovb32kCtx() {
            return Iovb32kCtx.this;
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
        str += inRec.hashCode();
        str += dataValues.hashCode();
       return str.hashCode();
    }

    public ValidateInRecDataOutCtx clone() {
        ValidateInRecDataOutCtx cloneObj = new ValidateInRecDataOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.inRec = new InRec();
        cloneObj.inRec.set(inRec.getClonedField());
        cloneObj.dataValues = new DataValues();
        cloneObj.dataValues.set(dataValues.getClonedField());
        return cloneObj;
    }

    }

    public ValidateInRecDataOutCtx getValidateInRecDataOutCtx() {
            return new ValidateInRecDataOutCtx();
    }
     public class WriteOutFileInCtx implements Cloneable {
     Work work = Iovb32kCtx.this.getWork();
     OutRec outRec = Iovb32kCtx.this.getOutRec();
     OutRecMax outRecMax = Iovb32kCtx.this.getOutRecMax();

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
	 *	Returns the value of outRecLen
	 *	@return outRecLen
	 */
	public int getOutRecLen() throws CFException {        
   		return work.getOutRecLen();
	}
	
	/**
	 * 	Update OutRecLen with the passed value
	 *	@param number
	 */
	public void setOutRecLen(int number)  throws CFException{
		work.setOutRecLen(number);
	}


	public void setOutRecLen(long number)  throws CFException{
		work.setOutRecLen((int)number);
	}


	/**
	 *	Returns the value of outRec
	 *	@return outRec
	 */   
	 public OutRec getOutRec() {
   	return outRec;
   }


	/**
	 *	Returns the value of outRecMax
	 *	@return outRecMax
	 */   
	 public OutRecMax getOutRecMax() {
   	return outRecMax;
   }


	/**
	 *	Returns the value of outFileStatus
	 *	@return outFileStatus
	 */
	public int getOutFileStatus() throws CFException {
   		return work.getOutFileStatus();
	}


	/**
	 *	Returns String value of outFileStatus
	 *	@return outFileStatus
	 */
	public char[]  getOutFileStatusString() throws CFException {
	     return String.valueOf(work.getOutFileStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outFileStatusIsNumeric()  throws CFException{
	    return work.outFileStatusIsNumeric();
	}

	/**
	 * 	Update OutFileStatus with the passed value
	 *	@param number
	 */
	public void setOutFileStatus(int number)  throws CFException{
		work.setOutFileStatus(number);
	}
	

	public void setOutFileStatus(long number)  throws CFException{
	    work.setOutFileStatus(number);
	}
	
	
	/**
	 * 	Update OutFileStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutFileStatus(char[] value)  throws CFException {
		work.setOutFileStatus(value);
	}
	
	/**
	 * 	Update OutFileStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutFileStatusString(char[] value)  throws CFException{
		work.setOutFileStatus(value);
	}	

	/**
	 *	Returns the value of recOutCtr
	 *	@return recOutCtr
	 */
	public short getRecOutCtr() throws CFException {        
   		return work.getRecOutCtr();
	}
	
	/**
	 * 	Update RecOutCtr with the passed value
	 *	@param number
	 */
	public void setRecOutCtr(short number)  throws CFException{
		work.setRecOutCtr(number);
	}

	public void setRecOutCtr(int number)  throws CFException{
		work.setRecOutCtr((short)number);
	}

	public void setRecOutCtr(long number)  throws CFException{
		work.setRecOutCtr((short)number);
	}




        public Iovb32kCtx getIovb32kCtx() {
            return Iovb32kCtx.this;
        }

        public WriteOutFileOutCtx getWriteOutFileOutCtx() {
            return new WriteOutFileOutCtx();
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
        str += outRec.hashCode();
        str += outRecMax.hashCode();
       return str.hashCode();
    }

    public WriteOutFileInCtx clone() {
        WriteOutFileInCtx cloneObj = new WriteOutFileInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.outRec = new OutRec();
        cloneObj.outRec.set(outRec.getClonedField());
        cloneObj.outRecMax = new OutRecMax();
        cloneObj.outRecMax.set(outRecMax.getClonedField());
        return cloneObj;
    }

    }

    public WriteOutFileInCtx getWriteOutFileInCtx() {
            return new WriteOutFileInCtx();
    }
     public class WriteOutFileOutCtx implements Cloneable {
     Work work = Iovb32kCtx.this.getWork();
     OutRec outRec = Iovb32kCtx.this.getOutRec();
     OutRecMax outRecMax = Iovb32kCtx.this.getOutRecMax();

	/**
	 *	Returns the value of outRecDataLen
	 *	@return outRecDataLen
	 */
	public int getOutRecDataLen() throws CFException {        
   		return outRec.getOutRecDataLen();
	}
	
	/**
	 * 	Update OutRecDataLen with the passed value
	 *	@param number
	 */
	public void setOutRecDataLen(int number)  throws CFException{
		outRec.setOutRecDataLen(number);
	}


	public void setOutRecDataLen(long number)  throws CFException{
		outRec.setOutRecDataLen((int)number);
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
	 *	Returns the value of outRecLen
	 *	@return outRecLen
	 */
	public int getOutRecLen() throws CFException {        
   		return work.getOutRecLen();
	}
	
	/**
	 * 	Update OutRecLen with the passed value
	 *	@param number
	 */
	public void setOutRecLen(int number)  throws CFException{
		work.setOutRecLen(number);
	}


	public void setOutRecLen(long number)  throws CFException{
		work.setOutRecLen((int)number);
	}


	/**
	 *	Returns the value of outRecMax
	 *	@return outRecMax
	 */   
	 public OutRecMax getOutRecMax() {
   	return outRecMax;
   }


	/**
	 *	Returns the value of outFileStatus
	 *	@return outFileStatus
	 */
	public int getOutFileStatus() throws CFException {
   		return work.getOutFileStatus();
	}


	/**
	 *	Returns String value of outFileStatus
	 *	@return outFileStatus
	 */
	public char[]  getOutFileStatusString() throws CFException {
	     return String.valueOf(work.getOutFileStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outFileStatusIsNumeric()  throws CFException{
	    return work.outFileStatusIsNumeric();
	}

	/**
	 * 	Update OutFileStatus with the passed value
	 *	@param number
	 */
	public void setOutFileStatus(int number)  throws CFException{
		work.setOutFileStatus(number);
	}
	

	public void setOutFileStatus(long number)  throws CFException{
	    work.setOutFileStatus(number);
	}
	
	
	/**
	 * 	Update OutFileStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutFileStatus(char[] value)  throws CFException {
		work.setOutFileStatus(value);
	}
	
	/**
	 * 	Update OutFileStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutFileStatusString(char[] value)  throws CFException{
		work.setOutFileStatus(value);
	}	

	/**
	 *	Returns the value of recOutCtr
	 *	@return recOutCtr
	 */
	public short getRecOutCtr() throws CFException {        
   		return work.getRecOutCtr();
	}
	
	/**
	 * 	Update RecOutCtr with the passed value
	 *	@param number
	 */
	public void setRecOutCtr(short number)  throws CFException{
		work.setRecOutCtr(number);
	}

	public void setRecOutCtr(int number)  throws CFException{
		work.setRecOutCtr((short)number);
	}

	public void setRecOutCtr(long number)  throws CFException{
		work.setRecOutCtr((short)number);
	}




        public Iovb32kCtx getIovb32kCtx() {
            return Iovb32kCtx.this;
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
        str += outRec.hashCode();
        str += outRecMax.hashCode();
       return str.hashCode();
    }

    public WriteOutFileOutCtx clone() {
        WriteOutFileOutCtx cloneObj = new WriteOutFileOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.outRec = new OutRec();
        cloneObj.outRec.set(outRec.getClonedField());
        cloneObj.outRecMax = new OutRecMax();
        cloneObj.outRecMax.set(outRecMax.getClonedField());
        return cloneObj;
    }

    }

    public WriteOutFileOutCtx getWriteOutFileOutCtx() {
            return new WriteOutFileOutCtx();
    }
     public class InitializeOutRecInCtx implements Cloneable {
     Work work = Iovb32kCtx.this.getWork();
     DataValues dataValues = Iovb32kCtx.this.getDataValues();
     OutRec outRec = Iovb32kCtx.this.getOutRec();

	/**
	 *	Returns the value of j
	 *	@return j
	 */
	public short getJ() throws CFException {        
   		return work.getJ();
	}
	
	/**
	 * 	Update J with the passed value
	 *	@param number
	 */
	public void setJ(short number)  throws CFException{
		work.setJ(number);
	}

	public void setJ(int number)  throws CFException{
		work.setJ((short)number);
	}

	public void setJ(long number)  throws CFException{
		work.setJ((short)number);
	}



	/**
	 *	Returns the value of dataLenMax
	 *	@return dataLenMax
	 */
	public short getDataLenMax() throws CFException {        
   		return work.getDataLenMax();
	}
	
	/**
	 * 	Update DataLenMax with the passed value
	 *	@param number
	 */
	public void setDataLenMax(short number)  throws CFException{
		work.setDataLenMax(number);
	}

	public void setDataLenMax(int number)  throws CFException{
		work.setDataLenMax((short)number);
	}

	public void setDataLenMax(long number)  throws CFException{
		work.setDataLenMax((short)number);
	}



	/**
	 *	Returns the value of dataValues
	 *	@return dataValues
	 */   
	 public DataValues getDataValues() {
   	return dataValues;
   }


	/**
	 *	Returns the value of k
	 *	@return k
	 */
	public short getK() throws CFException {        
   		return work.getK();
	}
	
	/**
	 * 	Update K with the passed value
	 *	@param number
	 */
	public void setK(short number)  throws CFException{
		work.setK(number);
	}

	public void setK(int number)  throws CFException{
		work.setK((short)number);
	}

	public void setK(long number)  throws CFException{
		work.setK((short)number);
	}




        public Iovb32kCtx getIovb32kCtx() {
            return Iovb32kCtx.this;
        }

        public InitializeOutRecOutCtx getInitializeOutRecOutCtx() {
            return new InitializeOutRecOutCtx();
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
        str += dataValues.hashCode();
        str += outRec.hashCode();
       return str.hashCode();
    }

    public InitializeOutRecInCtx clone() {
        InitializeOutRecInCtx cloneObj = new InitializeOutRecInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dataValues = new DataValues();
        cloneObj.dataValues.set(dataValues.getClonedField());
        cloneObj.outRec = new OutRec();
        cloneObj.outRec.set(outRec.getClonedField());
        return cloneObj;
    }

    }

    public InitializeOutRecInCtx getInitializeOutRecInCtx() {
            return new InitializeOutRecInCtx();
    }
     public class InitializeOutRecOutCtx implements Cloneable {
     Work work = Iovb32kCtx.this.getWork();
     DataValues dataValues = Iovb32kCtx.this.getDataValues();
     OutRec outRec = Iovb32kCtx.this.getOutRec();

	/**
	 *	Returns the value of j
	 *	@return j
	 */
	public short getJ() throws CFException {        
   		return work.getJ();
	}
	
	/**
	 * 	Update J with the passed value
	 *	@param number
	 */
	public void setJ(short number)  throws CFException{
		work.setJ(number);
	}

	public void setJ(int number)  throws CFException{
		work.setJ((short)number);
	}

	public void setJ(long number)  throws CFException{
		work.setJ((short)number);
	}



	/**
	 *	Returns the value of outRecDataLen
	 *	@return outRecDataLen
	 */
	public int getOutRecDataLen() throws CFException {        
   		return outRec.getOutRecDataLen();
	}
	
	/**
	 * 	Update OutRecDataLen with the passed value
	 *	@param number
	 */
	public void setOutRecDataLen(int number)  throws CFException{
		outRec.setOutRecDataLen(number);
	}


	public void setOutRecDataLen(long number)  throws CFException{
		outRec.setOutRecDataLen((int)number);
	}


	/**
	 *	Returns the value of dataLenMax
	 *	@return dataLenMax
	 */
	public short getDataLenMax() throws CFException {        
   		return work.getDataLenMax();
	}
	
	/**
	 * 	Update DataLenMax with the passed value
	 *	@param number
	 */
	public void setDataLenMax(short number)  throws CFException{
		work.setDataLenMax(number);
	}

	public void setDataLenMax(int number)  throws CFException{
		work.setDataLenMax((short)number);
	}

	public void setDataLenMax(long number)  throws CFException{
		work.setDataLenMax((short)number);
	}



	/**
	 *	Returns the value of dataValues
	 *	@return dataValues
	 */   
	 public DataValues getDataValues() {
   	return dataValues;
   }


	/**
	 *	Returns the value of k
	 *	@return k
	 */
	public short getK() throws CFException {        
   		return work.getK();
	}
	
	/**
	 * 	Update K with the passed value
	 *	@param number
	 */
	public void setK(short number)  throws CFException{
		work.setK(number);
	}

	public void setK(int number)  throws CFException{
		work.setK((short)number);
	}

	public void setK(long number)  throws CFException{
		work.setK((short)number);
	}



	/**
	 *	Returns the value of outRecByte
	 *	@return outRecByte
	 */
   public char[] getOutRecByte(int index) throws CFException  {              
   		return outRec.getOutRecData().getOutRecByte(index);
   }

  
	/**
	*  set variable outRecByte
	*  @param value
	**/
   public void setOutRecByte(int index,char[] value) throws CFException {
      outRec.getOutRecData().setOutRecByte((index),value);
   } 


        public Iovb32kCtx getIovb32kCtx() {
            return Iovb32kCtx.this;
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
        str += dataValues.hashCode();
        str += outRec.hashCode();
       return str.hashCode();
    }

    public InitializeOutRecOutCtx clone() {
        InitializeOutRecOutCtx cloneObj = new InitializeOutRecOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dataValues = new DataValues();
        cloneObj.dataValues.set(dataValues.getClonedField());
        cloneObj.outRec = new OutRec();
        cloneObj.outRec.set(outRec.getClonedField());
        return cloneObj;
    }

    }

    public InitializeOutRecOutCtx getInitializeOutRecOutCtx() {
            return new InitializeOutRecOutCtx();
    }
     public class CloseInFileOutCtx implements Cloneable {
     Work work = Iovb32kCtx.this.getWork();

	/**
	 *	Returns the value of inFileStatus
	 *	@return inFileStatus
	 */
	public int getInFileStatus() throws CFException {
   		return work.getInFileStatus();
	}


	/**
	 *	Returns String value of inFileStatus
	 *	@return inFileStatus
	 */
	public char[]  getInFileStatusString() throws CFException {
	     return String.valueOf(work.getInFileStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inFileStatusIsNumeric()  throws CFException{
	    return work.inFileStatusIsNumeric();
	}

	/**
	 * 	Update InFileStatus with the passed value
	 *	@param number
	 */
	public void setInFileStatus(int number)  throws CFException{
		work.setInFileStatus(number);
	}
	

	public void setInFileStatus(long number)  throws CFException{
	    work.setInFileStatus(number);
	}
	
	
	/**
	 * 	Update InFileStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setInFileStatus(char[] value)  throws CFException {
		work.setInFileStatus(value);
	}
	
	/**
	 * 	Update InFileStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInFileStatusString(char[] value)  throws CFException{
		work.setInFileStatus(value);
	}	


        public Iovb32kCtx getIovb32kCtx() {
            return Iovb32kCtx.this;
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

    public CloseInFileOutCtx clone() {
        CloseInFileOutCtx cloneObj = new CloseInFileOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CloseInFileOutCtx getCloseInFileOutCtx() {
            return new CloseInFileOutCtx();
    }
     public class CloseOutFileOutCtx implements Cloneable {
     Work work = Iovb32kCtx.this.getWork();

	/**
	 *	Returns the value of outFileStatus
	 *	@return outFileStatus
	 */
	public int getOutFileStatus() throws CFException {
   		return work.getOutFileStatus();
	}


	/**
	 *	Returns String value of outFileStatus
	 *	@return outFileStatus
	 */
	public char[]  getOutFileStatusString() throws CFException {
	     return String.valueOf(work.getOutFileStatusString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outFileStatusIsNumeric()  throws CFException{
	    return work.outFileStatusIsNumeric();
	}

	/**
	 * 	Update OutFileStatus with the passed value
	 *	@param number
	 */
	public void setOutFileStatus(int number)  throws CFException{
		work.setOutFileStatus(number);
	}
	

	public void setOutFileStatus(long number)  throws CFException{
	    work.setOutFileStatus(number);
	}
	
	
	/**
	 * 	Update OutFileStatus with the passed value
	 *	@param value (String or char[])
	 */
	public void setOutFileStatus(char[] value)  throws CFException {
		work.setOutFileStatus(value);
	}
	
	/**
	 * 	Update OutFileStatus with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOutFileStatusString(char[] value)  throws CFException{
		work.setOutFileStatus(value);
	}	


        public Iovb32kCtx getIovb32kCtx() {
            return Iovb32kCtx.this;
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

    public CloseOutFileOutCtx clone() {
        CloseOutFileOutCtx cloneObj = new CloseOutFileOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public CloseOutFileOutCtx getCloseOutFileOutCtx() {
            return new CloseOutFileOutCtx();
    }
}
