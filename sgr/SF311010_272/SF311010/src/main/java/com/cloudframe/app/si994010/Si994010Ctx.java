package com.cloudframe.app.si994010;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.si994010.dto.ParsingPatternValuesGroup500;
import com.cloudframe.app.si994010.dto.Si520DeAndLengthsGroup;
import com.cloudframe.app.si994010.dto.ElementTable800;
import com.cloudframe.app.global.sharedvar.Si583DataElementWorkArea1;
import com.cloudframe.app.global.sharedvar.Si583DataElementWorkArea2;
import com.cloudframe.app.si994010.dto.IdxGroup400;
import com.cloudframe.app.si994010.dto.Si530DataElementMaskArea;
import com.cloudframe.app.si994010.dto.BitMap2800;
import com.cloudframe.app.si994010.dto.Work;
import com.cloudframe.app.global.sharedvar.Si583ParserArea;
import com.cloudframe.app.si994010.dto.BitMap1800;
import com.cloudframe.app.si994010.dto.DataGroup1000;


@Context
public class Si994010Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Si520DeAndLengthsGroup si520DeAndLengthsGroup;
    BitMap1800 bitMap1800;
    ParsingPatternValuesGroup500 parsingPatternValuesGroup500;
    Work work;
    DataGroup1000 dataGroup1000;
    ElementTable800 elementTable800;
    BitMap2800 bitMap2800;
    Si530DataElementMaskArea si530DataElementMaskArea;
    Si583ParserArea si583ParserArea;
    IdxGroup400 idxGroup400;

    int si583I1;
    int si520Idx;
    int idx800;
    int idx500;
    int si583I2;

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


    public Si520DeAndLengthsGroup getSi520DeAndLengthsGroup() {
        if (si520DeAndLengthsGroup == null) {
            si520DeAndLengthsGroup = new Si520DeAndLengthsGroup();
        }

        return si520DeAndLengthsGroup;
    }

    public void setSi520DeAndLengthsGroup(Si520DeAndLengthsGroup si520DeAndLengthsGroup) {
        this.si520DeAndLengthsGroup = si520DeAndLengthsGroup;
    }
    public BitMap1800 getBitMap1800() {
        if (bitMap1800 == null) {
            bitMap1800 = new BitMap1800();
        }

        return bitMap1800;
    }

    public void setBitMap1800(BitMap1800 bitMap1800) {
        this.bitMap1800 = bitMap1800;
    }
    public ParsingPatternValuesGroup500 getParsingPatternValuesGroup500() {
        if (parsingPatternValuesGroup500 == null) {
            parsingPatternValuesGroup500 = new ParsingPatternValuesGroup500();
        }

        return parsingPatternValuesGroup500;
    }

    public void setParsingPatternValuesGroup500(ParsingPatternValuesGroup500 parsingPatternValuesGroup500) {
        this.parsingPatternValuesGroup500 = parsingPatternValuesGroup500;
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
    public DataGroup1000 getDataGroup1000() {
        if (dataGroup1000 == null) {
            dataGroup1000 = new DataGroup1000();
        }

        return dataGroup1000;
    }

    public void setDataGroup1000(DataGroup1000 dataGroup1000) {
        this.dataGroup1000 = dataGroup1000;
    }
    public ElementTable800 getElementTable800() {
        if (elementTable800 == null) {
            elementTable800 = new ElementTable800();
        }

        return elementTable800;
    }

    public void setElementTable800(ElementTable800 elementTable800) {
        this.elementTable800 = elementTable800;
    }
    public BitMap2800 getBitMap2800() {
        if (bitMap2800 == null) {
            bitMap2800 = new BitMap2800();
        }

        return bitMap2800;
    }

    public void setBitMap2800(BitMap2800 bitMap2800) {
        this.bitMap2800 = bitMap2800;
    }
    public Si530DataElementMaskArea getSi530DataElementMaskArea() {
        if (si530DataElementMaskArea == null) {
            si530DataElementMaskArea = new Si530DataElementMaskArea();
        }

        return si530DataElementMaskArea;
    }

    public void setSi530DataElementMaskArea(Si530DataElementMaskArea si530DataElementMaskArea) {
        this.si530DataElementMaskArea = si530DataElementMaskArea;
    }
    public Si583ParserArea getSi583ParserArea() {
        if (si583ParserArea == null) {
            si583ParserArea = globalCtx.getGlobalDto(Si583ParserArea.class);
        }

        return si583ParserArea;
    }

    public IdxGroup400 getIdxGroup400() {
        if (idxGroup400 == null) {
            idxGroup400 = new IdxGroup400();
        }

        return idxGroup400;
    }

    public void setIdxGroup400(IdxGroup400 idxGroup400) {
        this.idxGroup400 = idxGroup400;
    }

    public int getSi583I1() {
        return si583I1;
    }

    public void setSi583I1(int si583I1) {
        this.si583I1 = si583I1;
    }
    public int getSi520Idx() {
        return si520Idx;
    }

    public void setSi520Idx(int si520Idx) {
        this.si520Idx = si520Idx;
    }
    public int getIdx800() {
        return idx800;
    }

    public void setIdx800(int idx800) {
        this.idx800 = idx800;
    }
    public int getIdx500() {
        return idx500;
    }

    public void setIdx500(int idx500) {
        this.idx500 = idx500;
    }
    public int getSi583I2() {
        return si583I2;
    }

    public void setSi583I2(int si583I2) {
        this.si583I2 = si583I2;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += si520DeAndLengthsGroup.hashCode();
        str += bitMap1800.hashCode();
        str += parsingPatternValuesGroup500.hashCode();
        str += work.hashCode();
        str += dataGroup1000.hashCode();
        str += elementTable800.hashCode();
        str += bitMap2800.hashCode();
        str += si530DataElementMaskArea.hashCode();
        str += si583ParserArea.hashCode();
        str += idxGroup400.hashCode();
       return str.hashCode();
    }

    public Si994010Ctx clone() {
        Si994010Ctx cloneObj = new Si994010Ctx();
        cloneObj.si520DeAndLengthsGroup = new Si520DeAndLengthsGroup();
        cloneObj.si520DeAndLengthsGroup.set(si520DeAndLengthsGroup.getClonedField());
        cloneObj.bitMap1800 = new BitMap1800();
        cloneObj.bitMap1800.set(bitMap1800.getClonedField());
        cloneObj.parsingPatternValuesGroup500 = new ParsingPatternValuesGroup500();
        cloneObj.parsingPatternValuesGroup500.set(parsingPatternValuesGroup500.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dataGroup1000 = new DataGroup1000();
        cloneObj.dataGroup1000.set(dataGroup1000.getClonedField());
        cloneObj.elementTable800 = new ElementTable800();
        cloneObj.elementTable800.set(elementTable800.getClonedField());
        cloneObj.bitMap2800 = new BitMap2800();
        cloneObj.bitMap2800.set(bitMap2800.getClonedField());
        cloneObj.si530DataElementMaskArea = new Si530DataElementMaskArea();
        cloneObj.si530DataElementMaskArea.set(si530DataElementMaskArea.getClonedField());
        cloneObj.si583ParserArea = new Si583ParserArea();
        cloneObj.si583ParserArea.set(si583ParserArea.getClonedField());
        cloneObj.idxGroup400 = new IdxGroup400();
        cloneObj.idxGroup400.set(idxGroup400.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     DataGroup1000 dataGroup1000 = Si994010Ctx.this.getDataGroup1000();


        public Si994010Ctx getSi994010Ctx() {
            return Si994010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dataGroup1000.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.dataGroup1000 = new DataGroup1000();
        cloneObj.dataGroup1000.set(dataGroup1000.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class MainlineInCtx implements Cloneable {
     Work work = Si994010Ctx.this.getWork();
     Si583ParserArea si583ParserArea = Si994010Ctx.this.getSi583ParserArea();

	/**
	 *	Returns the value of sub800
	 *	@return sub800
	 */
	public short getSub800() throws CFException {        
   		return work.getSub800();
	}
	
	/**
	 * 	Update Sub800 with the passed value
	 *	@param number
	 */
	public void setSub800(short number)  throws CFException{
		work.setSub800(number);
	}

	public void setSub800(int number)  throws CFException{
		work.setSub800((short)number);
	}

	public void setSub800(long number)  throws CFException{
		work.setSub800((short)number);
	}



	/**
	 *	Returns the value of maxMessage300
	 *	@return maxMessage300
	 */
	public int getMaxMessage300() throws CFException {        
   		return work.getMaxMessage300();
	}
	
	/**
	 * 	Update MaxMessage300 with the passed value
	 *	@param number
	 */
	public void setMaxMessage300(int number)  throws CFException{
		work.setMaxMessage300(number);
	}


	public void setMaxMessage300(long number)  throws CFException{
		work.setMaxMessage300((int)number);
	}


	/**
	 *	Returns the value of binaryZeros300
	 *	@return binaryZeros300
	 */
	public short getBinaryZeros300() throws CFException {        
   		return work.getBinaryZeros300();
	}
	
	/**
	 * 	Update BinaryZeros300 with the passed value
	 *	@param number
	 */
	public void setBinaryZeros300(short number)  throws CFException{
		work.setBinaryZeros300(number);
	}

	public void setBinaryZeros300(int number)  throws CFException{
		work.setBinaryZeros300((short)number);
	}

	public void setBinaryZeros300(long number)  throws CFException{
		work.setBinaryZeros300((short)number);
	}



	/**
	 *	Returns the value of si583Mti2
	 *	@return si583Mti2
	 */
   public char[] getSi583Mti2() throws CFException  {              
   		return si583ParserArea.getSi583Mti2();
   }

  
	/**
	*  set variable si583Mti2
	*  @param value
	**/
   public void setSi583Mti2(char[] value) throws CFException {
      si583ParserArea.setSi583Mti2(value);
   } 

     /**
	 * 	Update Si583Mti2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSi583Mti2(char[] source, int sourceIndex) throws CFException {
      si583ParserArea.setSi583Mti2(source, sourceIndex);
   	
   }
   
   public void setSi583Mti2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      si583ParserArea.setSi583Mti2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Si583Mti2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi583Mti2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      si583ParserArea.setSi583Mti2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Si583Mti2 with another Field
	 *	@param value
	 */
   public void setSi583Mti2(Field source) {
      si583ParserArea.setSi583Mti2(source);
   }  
   
     /**
	 * 	Update Si583Mti2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSi583Mti2(Field source, int sourceIndex,int sourceLen) {
      si583ParserArea.setSi583Mti2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Si583Mti2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi583Mti2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      si583ParserArea.setSi583Mti2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of si583ReturnCode
	 *	@return si583ReturnCode
	 */
	public short getSi583ReturnCode() throws CFException {        
   		return si583ParserArea.getSi583ReturnCode();
	}
	
	/**
	 * 	Update Si583ReturnCode with the passed value
	 *	@param number
	 */
	public void setSi583ReturnCode(short number)  throws CFException{
		si583ParserArea.setSi583ReturnCode(number);
	}

	public void setSi583ReturnCode(int number)  throws CFException{
		si583ParserArea.setSi583ReturnCode((short)number);
	}

	public void setSi583ReturnCode(long number)  throws CFException{
		si583ParserArea.setSi583ReturnCode((short)number);
	}




        public Si994010Ctx getSi994010Ctx() {
            return Si994010Ctx.this;
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
        str += si583ParserArea.hashCode();
       return str.hashCode();
    }

    public MainlineInCtx clone() {
        MainlineInCtx cloneObj = new MainlineInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.si583ParserArea = new Si583ParserArea();
        cloneObj.si583ParserArea.set(si583ParserArea.getClonedField());
        return cloneObj;
    }

    }

    public MainlineInCtx getMainlineInCtx() {
            return new MainlineInCtx();
    }
     public class InitializeWorkAreasInCtx implements Cloneable {
     Work work = Si994010Ctx.this.getWork();
     DataGroup1000 dataGroup1000 = Si994010Ctx.this.getDataGroup1000();
     Si583ParserArea si583ParserArea = Si994010Ctx.this.getSi583ParserArea();
     Si530DataElementMaskArea si530DataElementMaskArea = Si994010Ctx.this.getSi530DataElementMaskArea();

	/**
	 *	Returns the value of errMsg8600
	 *	@return errMsg8600
	 */
   public char[] getErrMsg8600() throws CFException  {              
   		return work.getErrMsg8600();
   }

  
	/**
	*  set variable errMsg8600
	*  @param value
	**/
   public void setErrMsg8600(char[] value) throws CFException {
      work.setErrMsg8600(value);
   } 

	/**
	 *	Returns the value of si583DataElementWorkArea1
	 *	@return si583DataElementWorkArea1
	 */   
	 public Si583DataElementWorkArea1 getSi583DataElementWorkArea1() {
   	return si583ParserArea.getSi583DataElementWorkArea1();
   }

   /**
	* 	Update Si583DataElementWorkArea1 with the passed value
	*	@param value
	*/
   public void setSi583DataElementWorkArea1(char[] value) throws CFException {
      si583ParserArea.setSi583DataElementWorkArea1(value);
   }   

     /**
	 * 	Update Si583DataElementWorkArea1 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSi583DataElementWorkArea1(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	si583ParserArea.setSi583DataElementWorkArea1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Si583DataElementWorkArea1 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi583DataElementWorkArea1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	si583ParserArea.setSi583DataElementWorkArea1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Si583DataElementWorkArea1 with another Field
	 *	@param value
	 */
   public void setSi583DataElementWorkArea1(Field source) {
   	si583ParserArea.setSi583DataElementWorkArea1(source);
   }  
   
     /**
	 * 	Update Si583DataElementWorkArea1 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSi583DataElementWorkArea1(Field source, int sourceIndex,int sourceLen) {
   	si583ParserArea.setSi583DataElementWorkArea1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Si583DataElementWorkArea1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi583DataElementWorkArea1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	si583ParserArea.setSi583DataElementWorkArea1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of binary1300
	 *	@return binary1300
	 */
	public short getBinary1300() throws CFException {        
   		return work.getBinary1300();
	}
	
	/**
	 * 	Update Binary1300 with the passed value
	 *	@param number
	 */
	public void setBinary1300(short number)  throws CFException{
		work.setBinary1300(number);
	}

	public void setBinary1300(int number)  throws CFException{
		work.setBinary1300((short)number);
	}

	public void setBinary1300(long number)  throws CFException{
		work.setBinary1300((short)number);
	}



	/**
	 *	Returns the value of si583DataLength
	 *	@return si583DataLength
	 */
	public int getSi583DataLength() throws CFException {        
   		return si583ParserArea.getSi583DataLength();
	}
	
	/**
	 * 	Update Si583DataLength with the passed value
	 *	@param number
	 */
	public void setSi583DataLength(int number)  throws CFException{
		si583ParserArea.setSi583DataLength(number);
	}


	public void setSi583DataLength(long number)  throws CFException{
		si583ParserArea.setSi583DataLength((int)number);
	}


	/**
	 *	Returns the value of binaryZeros300
	 *	@return binaryZeros300
	 */
	public short getBinaryZeros300() throws CFException {        
   		return work.getBinaryZeros300();
	}
	
	/**
	 * 	Update BinaryZeros300 with the passed value
	 *	@param number
	 */
	public void setBinaryZeros300(short number)  throws CFException{
		work.setBinaryZeros300(number);
	}

	public void setBinaryZeros300(int number)  throws CFException{
		work.setBinaryZeros300((short)number);
	}

	public void setBinaryZeros300(long number)  throws CFException{
		work.setBinaryZeros300((short)number);
	}



	/**
	 *	Returns the value of si583DataElementWorkArea2
	 *	@return si583DataElementWorkArea2
	 */   
	 public Si583DataElementWorkArea2 getSi583DataElementWorkArea2() {
   	return si583ParserArea.getSi583DataElementWorkArea2();
   }

   /**
	* 	Update Si583DataElementWorkArea2 with the passed value
	*	@param value
	*/
   public void setSi583DataElementWorkArea2(char[] value) throws CFException {
      si583ParserArea.setSi583DataElementWorkArea2(value);
   }   

     /**
	 * 	Update Si583DataElementWorkArea2 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSi583DataElementWorkArea2(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	si583ParserArea.setSi583DataElementWorkArea2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Si583DataElementWorkArea2 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi583DataElementWorkArea2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	si583ParserArea.setSi583DataElementWorkArea2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Si583DataElementWorkArea2 with another Field
	 *	@param value
	 */
   public void setSi583DataElementWorkArea2(Field source) {
   	si583ParserArea.setSi583DataElementWorkArea2(source);
   }  
   
     /**
	 * 	Update Si583DataElementWorkArea2 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSi583DataElementWorkArea2(Field source, int sourceIndex,int sourceLen) {
   	si583ParserArea.setSi583DataElementWorkArea2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Si583DataElementWorkArea2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi583DataElementWorkArea2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	si583ParserArea.setSi583DataElementWorkArea2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of dataGroup1000
	 *	@return dataGroup1000
	 */   
	 public DataGroup1000 getDataGroup1000() {
   	return dataGroup1000;
   }


	/**
	 *	Returns the value of si583DataPtr
	 *	@return si583DataPtr
	 */
	public int getSi583DataPtr() throws CFException {        
   		return si583ParserArea.getSi583DataPtr();
	}
	
	/**
	 * 	Update Si583DataPtr with the passed value
	 *	@param number
	 */
	public void setSi583DataPtr(int number)  throws CFException{
		si583ParserArea.setSi583DataPtr(number);
	}


	public void setSi583DataPtr(long number)  throws CFException{
		si583ParserArea.setSi583DataPtr((int)number);
	}


	/**
	 *	Returns the value of si530DataElementMaskArea
	 *	@return si530DataElementMaskArea
	 */   
	 public Si530DataElementMaskArea getSi530DataElementMaskArea() {
   	return si530DataElementMaskArea;
   }



        public Si994010Ctx getSi994010Ctx() {
            return Si994010Ctx.this;
        }

        public InitializeWorkAreasOutCtx getInitializeWorkAreasOutCtx() {
            return new InitializeWorkAreasOutCtx();
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
        str += dataGroup1000.hashCode();
        str += si583ParserArea.hashCode();
        str += si530DataElementMaskArea.hashCode();
       return str.hashCode();
    }

    public InitializeWorkAreasInCtx clone() {
        InitializeWorkAreasInCtx cloneObj = new InitializeWorkAreasInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dataGroup1000 = new DataGroup1000();
        cloneObj.dataGroup1000.set(dataGroup1000.getClonedField());
        cloneObj.si583ParserArea = new Si583ParserArea();
        cloneObj.si583ParserArea.set(si583ParserArea.getClonedField());
        cloneObj.si530DataElementMaskArea = new Si530DataElementMaskArea();
        cloneObj.si530DataElementMaskArea.set(si530DataElementMaskArea.getClonedField());
        return cloneObj;
    }

    }

    public InitializeWorkAreasInCtx getInitializeWorkAreasInCtx() {
            return new InitializeWorkAreasInCtx();
    }
     public class InitializeWorkAreasOutCtx implements Cloneable {
     Work work = Si994010Ctx.this.getWork();
     DataGroup1000 dataGroup1000 = Si994010Ctx.this.getDataGroup1000();
     Si583ParserArea si583ParserArea = Si994010Ctx.this.getSi583ParserArea();
     Si530DataElementMaskArea si530DataElementMaskArea = Si994010Ctx.this.getSi530DataElementMaskArea();

	/**
	 *	Returns the value of si583DataElementWorkArea1
	 *	@return si583DataElementWorkArea1
	 */   
	 public Si583DataElementWorkArea1 getSi583DataElementWorkArea1() {
   	return si583ParserArea.getSi583DataElementWorkArea1();
   }

   /**
	* 	Update Si583DataElementWorkArea1 with the passed value
	*	@param value
	*/
   public void setSi583DataElementWorkArea1(char[] value) throws CFException {
      si583ParserArea.setSi583DataElementWorkArea1(value);
   }   

     /**
	 * 	Update Si583DataElementWorkArea1 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSi583DataElementWorkArea1(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	si583ParserArea.setSi583DataElementWorkArea1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Si583DataElementWorkArea1 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi583DataElementWorkArea1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	si583ParserArea.setSi583DataElementWorkArea1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Si583DataElementWorkArea1 with another Field
	 *	@param value
	 */
   public void setSi583DataElementWorkArea1(Field source) {
   	si583ParserArea.setSi583DataElementWorkArea1(source);
   }  
   
     /**
	 * 	Update Si583DataElementWorkArea1 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSi583DataElementWorkArea1(Field source, int sourceIndex,int sourceLen) {
   	si583ParserArea.setSi583DataElementWorkArea1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Si583DataElementWorkArea1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi583DataElementWorkArea1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	si583ParserArea.setSi583DataElementWorkArea1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of maxMessage300
	 *	@return maxMessage300
	 */
	public int getMaxMessage300() throws CFException {        
   		return work.getMaxMessage300();
	}
	
	/**
	 * 	Update MaxMessage300 with the passed value
	 *	@param number
	 */
	public void setMaxMessage300(int number)  throws CFException{
		work.setMaxMessage300(number);
	}


	public void setMaxMessage300(long number)  throws CFException{
		work.setMaxMessage300((int)number);
	}


	/**
	 *	Returns the value of binaryZeros300
	 *	@return binaryZeros300
	 */
	public short getBinaryZeros300() throws CFException {        
   		return work.getBinaryZeros300();
	}
	
	/**
	 * 	Update BinaryZeros300 with the passed value
	 *	@param number
	 */
	public void setBinaryZeros300(short number)  throws CFException{
		work.setBinaryZeros300(number);
	}

	public void setBinaryZeros300(int number)  throws CFException{
		work.setBinaryZeros300((short)number);
	}

	public void setBinaryZeros300(long number)  throws CFException{
		work.setBinaryZeros300((short)number);
	}



	/**
	 *	Returns the value of si583DataElementInError
	 *	@return si583DataElementInError
	 */
	public short getSi583DataElementInError() throws CFException {        
   		return si583ParserArea.getSi583DataElementInError();
	}
	
	/**
	 * 	Update Si583DataElementInError with the passed value
	 *	@param number
	 */
	public void setSi583DataElementInError(short number)  throws CFException{
		si583ParserArea.setSi583DataElementInError(number);
	}

	public void setSi583DataElementInError(int number)  throws CFException{
		si583ParserArea.setSi583DataElementInError((short)number);
	}

	public void setSi583DataElementInError(long number)  throws CFException{
		si583ParserArea.setSi583DataElementInError((short)number);
	}



	/**
	 *	Returns the value of si583ReturnCode
	 *	@return si583ReturnCode
	 */
	public short getSi583ReturnCode() throws CFException {        
   		return si583ParserArea.getSi583ReturnCode();
	}
	
	/**
	 * 	Update Si583ReturnCode with the passed value
	 *	@param number
	 */
	public void setSi583ReturnCode(short number)  throws CFException{
		si583ParserArea.setSi583ReturnCode(number);
	}

	public void setSi583ReturnCode(int number)  throws CFException{
		si583ParserArea.setSi583ReturnCode((short)number);
	}

	public void setSi583ReturnCode(long number)  throws CFException{
		si583ParserArea.setSi583ReturnCode((short)number);
	}



	/**
	 *	Returns the value of si530DataElementMaskArea
	 *	@return si530DataElementMaskArea
	 */   
	 public Si530DataElementMaskArea getSi530DataElementMaskArea() {
   	return si530DataElementMaskArea;
   }


	/**
	 *	Returns the value of data1000
	 *	@return data1000
	 */
   public char[] getData1000() throws CFException  {              
   		return dataGroup1000.getData1000();
   }

  
	/**
	*  set variable data1000
	*  @param value
	**/
   public void setData1000(char[] value) throws CFException {
      dataGroup1000.setData1000(value);
   } 

     /**
	 * 	Update Data1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setData1000(char[] source, int sourceIndex) throws CFException {
      dataGroup1000.setData1000(source, sourceIndex);
   	
   }
   
   public void setData1000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Data1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setData1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Data1000 with another Field
	 *	@param value
	 */
   public void setData1000(Field source) {
      dataGroup1000.setData1000(source);
   }  
   
     /**
	 * 	Update Data1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setData1000(Field source, int sourceIndex,int sourceLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Data1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setData1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of errMsg8600
	 *	@return errMsg8600
	 */
   public char[] getErrMsg8600() throws CFException  {              
   		return work.getErrMsg8600();
   }

  
	/**
	*  set variable errMsg8600
	*  @param value
	**/
   public void setErrMsg8600(char[] value) throws CFException {
      work.setErrMsg8600(value);
   } 

	/**
	 *	Returns the value of si583ReturnMessage
	 *	@return si583ReturnMessage
	 */
   public char[] getSi583ReturnMessage() throws CFException  {              
   		return si583ParserArea.getSi583ReturnMessage();
   }

  
	/**
	*  set variable si583ReturnMessage
	*  @param value
	**/
   public void setSi583ReturnMessage(char[] value) throws CFException {
      si583ParserArea.setSi583ReturnMessage(value);
   } 

     /**
	 * 	Update Si583ReturnMessage 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSi583ReturnMessage(char[] source, int sourceIndex) throws CFException {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex);
   	
   }
   
   public void setSi583ReturnMessage(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi583ReturnMessage(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Si583ReturnMessage with another Field
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source) {
      si583ParserArea.setSi583ReturnMessage(source);
   }  
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source, int sourceIndex,int sourceLen) {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of si583DataElementWorkArea2
	 *	@return si583DataElementWorkArea2
	 */   
	 public Si583DataElementWorkArea2 getSi583DataElementWorkArea2() {
   	return si583ParserArea.getSi583DataElementWorkArea2();
   }

   /**
	* 	Update Si583DataElementWorkArea2 with the passed value
	*	@param value
	*/
   public void setSi583DataElementWorkArea2(char[] value) throws CFException {
      si583ParserArea.setSi583DataElementWorkArea2(value);
   }   

     /**
	 * 	Update Si583DataElementWorkArea2 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSi583DataElementWorkArea2(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	si583ParserArea.setSi583DataElementWorkArea2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Si583DataElementWorkArea2 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi583DataElementWorkArea2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	si583ParserArea.setSi583DataElementWorkArea2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Si583DataElementWorkArea2 with another Field
	 *	@param value
	 */
   public void setSi583DataElementWorkArea2(Field source) {
   	si583ParserArea.setSi583DataElementWorkArea2(source);
   }  
   
     /**
	 * 	Update Si583DataElementWorkArea2 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSi583DataElementWorkArea2(Field source, int sourceIndex,int sourceLen) {
   	si583ParserArea.setSi583DataElementWorkArea2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Si583DataElementWorkArea2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi583DataElementWorkArea2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	si583ParserArea.setSi583DataElementWorkArea2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of si583Mti2
	 *	@return si583Mti2
	 */
   public char[] getSi583Mti2() throws CFException  {              
   		return si583ParserArea.getSi583Mti2();
   }

  
	/**
	*  set variable si583Mti2
	*  @param value
	**/
   public void setSi583Mti2(char[] value) throws CFException {
      si583ParserArea.setSi583Mti2(value);
   } 

     /**
	 * 	Update Si583Mti2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSi583Mti2(char[] source, int sourceIndex) throws CFException {
      si583ParserArea.setSi583Mti2(source, sourceIndex);
   	
   }
   
   public void setSi583Mti2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      si583ParserArea.setSi583Mti2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Si583Mti2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi583Mti2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      si583ParserArea.setSi583Mti2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Si583Mti2 with another Field
	 *	@param value
	 */
   public void setSi583Mti2(Field source) {
      si583ParserArea.setSi583Mti2(source);
   }  
   
     /**
	 * 	Update Si583Mti2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSi583Mti2(Field source, int sourceIndex,int sourceLen) {
      si583ParserArea.setSi583Mti2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Si583Mti2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi583Mti2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      si583ParserArea.setSi583Mti2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition 999 for isSi583InvalidPtr88()
	 *	@return  Returns true if isSi583InvalidPtr88() is 999
	 */
   public boolean isSi583InvalidPtr88() throws CFException {
      return si583ParserArea.isSi583InvalidPtr88();
   }

	/**
	*  set values 999
	*/
   	public void setSi583InvalidPtr88True()  throws CFException{  			
    	si583ParserArea.setSi583InvalidPtr88True();
   	}
	/**
	 *	Returns the value of si583Mti1
	 *	@return si583Mti1
	 */
   public char[] getSi583Mti1() throws CFException  {              
   		return si583ParserArea.getSi583Mti1();
   }

  
	/**
	*  set variable si583Mti1
	*  @param value
	**/
   public void setSi583Mti1(char[] value) throws CFException {
      si583ParserArea.setSi583Mti1(value);
   } 

     /**
	 * 	Update Si583Mti1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSi583Mti1(char[] source, int sourceIndex) throws CFException {
      si583ParserArea.setSi583Mti1(source, sourceIndex);
   	
   }
   
   public void setSi583Mti1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      si583ParserArea.setSi583Mti1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Si583Mti1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi583Mti1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      si583ParserArea.setSi583Mti1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Si583Mti1 with another Field
	 *	@param value
	 */
   public void setSi583Mti1(Field source) {
      si583ParserArea.setSi583Mti1(source);
   }  
   
     /**
	 * 	Update Si583Mti1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSi583Mti1(Field source, int sourceIndex,int sourceLen) {
      si583ParserArea.setSi583Mti1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Si583Mti1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi583Mti1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      si583ParserArea.setSi583Mti1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Si994010Ctx getSi994010Ctx() {
            return Si994010Ctx.this;
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
        str += dataGroup1000.hashCode();
        str += si583ParserArea.hashCode();
        str += si530DataElementMaskArea.hashCode();
       return str.hashCode();
    }

    public InitializeWorkAreasOutCtx clone() {
        InitializeWorkAreasOutCtx cloneObj = new InitializeWorkAreasOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dataGroup1000 = new DataGroup1000();
        cloneObj.dataGroup1000.set(dataGroup1000.getClonedField());
        cloneObj.si583ParserArea = new Si583ParserArea();
        cloneObj.si583ParserArea.set(si583ParserArea.getClonedField());
        cloneObj.si530DataElementMaskArea = new Si530DataElementMaskArea();
        cloneObj.si530DataElementMaskArea.set(si530DataElementMaskArea.getClonedField());
        return cloneObj;
    }

    }

    public InitializeWorkAreasOutCtx getInitializeWorkAreasOutCtx() {
            return new InitializeWorkAreasOutCtx();
    }
     public class GetFirstMessageInCtx implements Cloneable {
     BitMap1800 bitMap1800 = Si994010Ctx.this.getBitMap1800();
     Work work = Si994010Ctx.this.getWork();
     DataGroup1000 dataGroup1000 = Si994010Ctx.this.getDataGroup1000();
     ElementTable800 elementTable800 = Si994010Ctx.this.getElementTable800();
     Si583ParserArea si583ParserArea = Si994010Ctx.this.getSi583ParserArea();

	/**
	 *	Returns the value of bitMap1800
	 *	@return bitMap1800
	 */   
	 public BitMap1800 getBitMap1800() {
   	return bitMap1800;
   }


	/**
	 *	Returns the value of binary13300
	 *	@return binary13300
	 */
	public short getBinary13300() throws CFException {        
   		return work.getBinary13300();
	}
	
	/**
	 * 	Update Binary13300 with the passed value
	 *	@param number
	 */
	public void setBinary13300(short number)  throws CFException{
		work.setBinary13300(number);
	}

	public void setBinary13300(int number)  throws CFException{
		work.setBinary13300((short)number);
	}

	public void setBinary13300(long number)  throws CFException{
		work.setBinary13300((short)number);
	}



	/**
	 *	Returns the value of errMsg3600
	 *	@return errMsg3600
	 */
   public char[] getErrMsg3600() throws CFException  {              
   		return work.getErrMsg3600();
   }

  
	/**
	*  set variable errMsg3600
	*  @param value
	**/
   public void setErrMsg3600(char[] value) throws CFException {
      work.setErrMsg3600(value);
   } 

	/**
	 *	Returns the value of dataGroup1000
	 *	@return dataGroup1000
	 */   
	 public DataGroup1000 getDataGroup1000() {
   	return dataGroup1000;
   }


	/**
	 *	Returns the value of element800
	 *	@return element800
	 */
   public char[] getElement800(int index) throws CFException  {              
   		return elementTable800.getElement800(index);
   }

  
	/**
	*  set variable element800
	*  @param value
	**/
   public void setElement800(int index,char[] value) throws CFException {
      elementTable800.setElement800((index),value);
   } 

	/**
	 *	Returns the value of data1000
	 *	@return data1000
	 */
   public char[] getData1000() throws CFException  {              
   		return dataGroup1000.getData1000();
   }

  
	/**
	*  set variable data1000
	*  @param value
	**/
   public void setData1000(char[] value) throws CFException {
      dataGroup1000.setData1000(value);
   } 

     /**
	 * 	Update Data1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setData1000(char[] source, int sourceIndex) throws CFException {
      dataGroup1000.setData1000(source, sourceIndex);
   	
   }
   
   public void setData1000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Data1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setData1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Data1000 with another Field
	 *	@param value
	 */
   public void setData1000(Field source) {
      dataGroup1000.setData1000(source);
   }  
   
     /**
	 * 	Update Data1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setData1000(Field source, int sourceIndex,int sourceLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Data1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setData1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of charX300
	 *	@return charX300
	 */
   public char[] getCharX300() throws CFException  {              
   		return work.getCharX300();
   }

  
	/**
	*  set variable charX300
	*  @param value
	**/
   public void setCharX300(char[] value) throws CFException {
      work.setCharX300(value);
   } 

	/**
	 *	Returns the value of asterisks300
	 *	@return asterisks300
	 */
   public char[] getAsterisks300() throws CFException  {              
   		return work.getAsterisks300();
   }

  
	/**
	*  set variable asterisks300
	*  @param value
	**/
   public void setAsterisks300(char[] value) throws CFException {
      work.setAsterisks300(value);
   } 


        public Si994010Ctx getSi994010Ctx() {
            return Si994010Ctx.this;
        }

        public GetFirstMessageOutCtx getGetFirstMessageOutCtx() {
            return new GetFirstMessageOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += bitMap1800.hashCode();
        str += work.hashCode();
        str += dataGroup1000.hashCode();
        str += elementTable800.hashCode();
        str += si583ParserArea.hashCode();
       return str.hashCode();
    }

    public GetFirstMessageInCtx clone() {
        GetFirstMessageInCtx cloneObj = new GetFirstMessageInCtx();
        cloneObj.bitMap1800 = new BitMap1800();
        cloneObj.bitMap1800.set(bitMap1800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dataGroup1000 = new DataGroup1000();
        cloneObj.dataGroup1000.set(dataGroup1000.getClonedField());
        cloneObj.elementTable800 = new ElementTable800();
        cloneObj.elementTable800.set(elementTable800.getClonedField());
        cloneObj.si583ParserArea = new Si583ParserArea();
        cloneObj.si583ParserArea.set(si583ParserArea.getClonedField());
        return cloneObj;
    }

    }

    public GetFirstMessageInCtx getGetFirstMessageInCtx() {
            return new GetFirstMessageInCtx();
    }
     public class GetFirstMessageOutCtx implements Cloneable {
     BitMap1800 bitMap1800 = Si994010Ctx.this.getBitMap1800();
     Work work = Si994010Ctx.this.getWork();
     DataGroup1000 dataGroup1000 = Si994010Ctx.this.getDataGroup1000();
     ElementTable800 elementTable800 = Si994010Ctx.this.getElementTable800();
     Si583ParserArea si583ParserArea = Si994010Ctx.this.getSi583ParserArea();

	/**
	 *	Returns the value of bitMap1800
	 *	@return bitMap1800
	 */   
	 public BitMap1800 getBitMap1800() {
   	return bitMap1800;
   }


	/**
	 *	Returns the value of sub800
	 *	@return sub800
	 */
	public short getSub800() throws CFException {        
   		return work.getSub800();
	}
	
	/**
	 * 	Update Sub800 with the passed value
	 *	@param number
	 */
	public void setSub800(short number)  throws CFException{
		work.setSub800(number);
	}

	public void setSub800(int number)  throws CFException{
		work.setSub800((short)number);
	}

	public void setSub800(long number)  throws CFException{
		work.setSub800((short)number);
	}



	/**
	 *	Returns the value of binary13300
	 *	@return binary13300
	 */
	public short getBinary13300() throws CFException {        
   		return work.getBinary13300();
	}
	
	/**
	 * 	Update Binary13300 with the passed value
	 *	@param number
	 */
	public void setBinary13300(short number)  throws CFException{
		work.setBinary13300(number);
	}

	public void setBinary13300(int number)  throws CFException{
		work.setBinary13300((short)number);
	}

	public void setBinary13300(long number)  throws CFException{
		work.setBinary13300((short)number);
	}



	/**
	 *	Returns the value of errMsg3600
	 *	@return errMsg3600
	 */
   public char[] getErrMsg3600() throws CFException  {              
   		return work.getErrMsg3600();
   }

  
	/**
	*  set variable errMsg3600
	*  @param value
	**/
   public void setErrMsg3600(char[] value) throws CFException {
      work.setErrMsg3600(value);
   } 

	/**
	 *	Returns the value of si583ReturnMessage
	 *	@return si583ReturnMessage
	 */
   public char[] getSi583ReturnMessage() throws CFException  {              
   		return si583ParserArea.getSi583ReturnMessage();
   }

  
	/**
	*  set variable si583ReturnMessage
	*  @param value
	**/
   public void setSi583ReturnMessage(char[] value) throws CFException {
      si583ParserArea.setSi583ReturnMessage(value);
   } 

     /**
	 * 	Update Si583ReturnMessage 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSi583ReturnMessage(char[] source, int sourceIndex) throws CFException {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex);
   	
   }
   
   public void setSi583ReturnMessage(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi583ReturnMessage(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Si583ReturnMessage with another Field
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source) {
      si583ParserArea.setSi583ReturnMessage(source);
   }  
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source, int sourceIndex,int sourceLen) {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "1" for isSi583DePresent188()
	 *	@return  Returns true if isSi583DePresent188() is "1"
	 */
   public boolean isSi583DePresent188(int index) throws CFException {
      return si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(index).isSi583DePresent188();
   }

	/**
	*  set values "1"
	*/
   	public void setSi583DePresent188True(int index)  throws CFException{  			
    	si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(index).setSi583DePresent188True();
   	}
	/**
	 *	Returns the value of si583Mti1
	 *	@return si583Mti1
	 */
   public char[] getSi583Mti1() throws CFException  {              
   		return si583ParserArea.getSi583Mti1();
   }

  
	/**
	*  set variable si583Mti1
	*  @param value
	**/
   public void setSi583Mti1(char[] value) throws CFException {
      si583ParserArea.setSi583Mti1(value);
   } 

     /**
	 * 	Update Si583Mti1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSi583Mti1(char[] source, int sourceIndex) throws CFException {
      si583ParserArea.setSi583Mti1(source, sourceIndex);
   	
   }
   
   public void setSi583Mti1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      si583ParserArea.setSi583Mti1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Si583Mti1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi583Mti1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      si583ParserArea.setSi583Mti1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Si583Mti1 with another Field
	 *	@param value
	 */
   public void setSi583Mti1(Field source) {
      si583ParserArea.setSi583Mti1(source);
   }  
   
     /**
	 * 	Update Si583Mti1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSi583Mti1(Field source, int sourceIndex,int sourceLen) {
      si583ParserArea.setSi583Mti1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Si583Mti1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi583Mti1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      si583ParserArea.setSi583Mti1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition 1 for isSi583Mti1Error88()
	 *	@return  Returns true if isSi583Mti1Error88() is 1
	 */
   public boolean isSi583Mti1Error88() throws CFException {
      return si583ParserArea.isSi583Mti1Error88();
   }

	/**
	*  set values 1
	*/
   	public void setSi583Mti1Error88True()  throws CFException{  			
    	si583ParserArea.setSi583Mti1Error88True();
   	}
	/**
	 *	Returns the value of data1000
	 *	@return data1000
	 */
   public char[] getData1000() throws CFException  {              
   		return dataGroup1000.getData1000();
   }

  
	/**
	*  set variable data1000
	*  @param value
	**/
   public void setData1000(char[] value) throws CFException {
      dataGroup1000.setData1000(value);
   } 

     /**
	 * 	Update Data1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setData1000(char[] source, int sourceIndex) throws CFException {
      dataGroup1000.setData1000(source, sourceIndex);
   	
   }
   
   public void setData1000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Data1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setData1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Data1000 with another Field
	 *	@param value
	 */
   public void setData1000(Field source) {
      dataGroup1000.setData1000(source);
   }  
   
     /**
	 * 	Update Data1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setData1000(Field source, int sourceIndex,int sourceLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Data1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setData1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Si994010Ctx getSi994010Ctx() {
            return Si994010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += bitMap1800.hashCode();
        str += work.hashCode();
        str += dataGroup1000.hashCode();
        str += elementTable800.hashCode();
        str += si583ParserArea.hashCode();
       return str.hashCode();
    }

    public GetFirstMessageOutCtx clone() {
        GetFirstMessageOutCtx cloneObj = new GetFirstMessageOutCtx();
        cloneObj.bitMap1800 = new BitMap1800();
        cloneObj.bitMap1800.set(bitMap1800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dataGroup1000 = new DataGroup1000();
        cloneObj.dataGroup1000.set(dataGroup1000.getClonedField());
        cloneObj.elementTable800 = new ElementTable800();
        cloneObj.elementTable800.set(elementTable800.getClonedField());
        cloneObj.si583ParserArea = new Si583ParserArea();
        cloneObj.si583ParserArea.set(si583ParserArea.getClonedField());
        return cloneObj;
    }

    }

    public GetFirstMessageOutCtx getGetFirstMessageOutCtx() {
            return new GetFirstMessageOutCtx();
    }
     public class ParseFirstMessageInCtx implements Cloneable {
     Si520DeAndLengthsGroup si520DeAndLengthsGroup = Si994010Ctx.this.getSi520DeAndLengthsGroup();
     Work work = Si994010Ctx.this.getWork();
     ElementTable800 elementTable800 = Si994010Ctx.this.getElementTable800();
     Si583ParserArea si583ParserArea = Si994010Ctx.this.getSi583ParserArea();

	/**
	 *	Returns the value of sub800
	 *	@return sub800
	 */
	public short getSub800() throws CFException {        
   		return work.getSub800();
	}
	
	/**
	 * 	Update Sub800 with the passed value
	 *	@param number
	 */
	public void setSub800(short number)  throws CFException{
		work.setSub800(number);
	}

	public void setSub800(int number)  throws CFException{
		work.setSub800((short)number);
	}

	public void setSub800(long number)  throws CFException{
		work.setSub800((short)number);
	}



	/**
	 *	Returns the value of maxMessage300
	 *	@return maxMessage300
	 */
	public int getMaxMessage300() throws CFException {        
   		return work.getMaxMessage300();
	}
	
	/**
	 * 	Update MaxMessage300 with the passed value
	 *	@param number
	 */
	public void setMaxMessage300(int number)  throws CFException{
		work.setMaxMessage300(number);
	}


	public void setMaxMessage300(long number)  throws CFException{
		work.setMaxMessage300((int)number);
	}


	/**
	 *	Returns the value of binaryZeros300
	 *	@return binaryZeros300
	 */
	public short getBinaryZeros300() throws CFException {        
   		return work.getBinaryZeros300();
	}
	
	/**
	 * 	Update BinaryZeros300 with the passed value
	 *	@param number
	 */
	public void setBinaryZeros300(short number)  throws CFException{
		work.setBinaryZeros300(number);
	}

	public void setBinaryZeros300(int number)  throws CFException{
		work.setBinaryZeros300((short)number);
	}

	public void setBinaryZeros300(long number)  throws CFException{
		work.setBinaryZeros300((short)number);
	}



	/**
	 *	Returns the value of binary128300
	 *	@return binary128300
	 */
	public short getBinary128300() throws CFException {        
   		return work.getBinary128300();
	}
	
	/**
	 * 	Update Binary128300 with the passed value
	 *	@param number
	 */
	public void setBinary128300(short number)  throws CFException{
		work.setBinary128300(number);
	}

	public void setBinary128300(int number)  throws CFException{
		work.setBinary128300((short)number);
	}

	public void setBinary128300(long number)  throws CFException{
		work.setBinary128300((short)number);
	}




public void setSi520Idx(int si520Idx) { 
    Si994010Ctx.this.si520Idx = si520Idx;
}

public int getSi520Idx() { 
    return Si994010Ctx.this.si520Idx;
}
	/**
	 *	Returns the value of element800
	 *	@return element800
	 */
   public char[] getElement800(int index) throws CFException  {              
   		return elementTable800.getElement800(index);
   }

  
	/**
	*  set variable element800
	*  @param value
	**/
   public void setElement800(int index,char[] value) throws CFException {
      elementTable800.setElement800((index),value);
   } 

	/**
	 *	Test condition "F" for isSi520FixedFormat88()
	 *	@return  Returns true if isSi520FixedFormat88() is "F"
	 */
   public boolean isSi520FixedFormat88(int index) throws CFException {
      return si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).isSi520FixedFormat88();
   }

	/**
	*  set values "F"
	*/
   	public void setSi520FixedFormat88True(int index)  throws CFException{  			
    	si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).setSi520FixedFormat88True();
   	}
	/**
	 *	Returns the value of binary64300
	 *	@return binary64300
	 */
	public short getBinary64300() throws CFException {        
   		return work.getBinary64300();
	}
	
	/**
	 * 	Update Binary64300 with the passed value
	 *	@param number
	 */
	public void setBinary64300(short number)  throws CFException{
		work.setBinary64300(number);
	}

	public void setBinary64300(int number)  throws CFException{
		work.setBinary64300((short)number);
	}

	public void setBinary64300(long number)  throws CFException{
		work.setBinary64300((short)number);
	}



	/**
	 *	Returns the value of si583ReturnCode
	 *	@return si583ReturnCode
	 */
	public short getSi583ReturnCode() throws CFException {        
   		return si583ParserArea.getSi583ReturnCode();
	}
	
	/**
	 * 	Update Si583ReturnCode with the passed value
	 *	@param number
	 */
	public void setSi583ReturnCode(short number)  throws CFException{
		si583ParserArea.setSi583ReturnCode(number);
	}

	public void setSi583ReturnCode(int number)  throws CFException{
		si583ParserArea.setSi583ReturnCode((short)number);
	}

	public void setSi583ReturnCode(long number)  throws CFException{
		si583ParserArea.setSi583ReturnCode((short)number);
	}




public void setIdx800(int idx800) { 
    Si994010Ctx.this.idx800 = idx800;
}

public int getIdx800() { 
    return Si994010Ctx.this.idx800;
}
	/**
	 *	Returns the value of binary1300
	 *	@return binary1300
	 */
	public short getBinary1300() throws CFException {        
   		return work.getBinary1300();
	}
	
	/**
	 * 	Update Binary1300 with the passed value
	 *	@param number
	 */
	public void setBinary1300(short number)  throws CFException{
		work.setBinary1300(number);
	}

	public void setBinary1300(int number)  throws CFException{
		work.setBinary1300((short)number);
	}

	public void setBinary1300(long number)  throws CFException{
		work.setBinary1300((short)number);
	}




public void setSi583I1(int si583I1) { 
    Si994010Ctx.this.si583I1 = si583I1;
}

public int getSi583I1() { 
    return Si994010Ctx.this.si583I1;
}
	/**
	 *	Returns the value of binary2300
	 *	@return binary2300
	 */
	public short getBinary2300() throws CFException {        
   		return work.getBinary2300();
	}
	
	/**
	 * 	Update Binary2300 with the passed value
	 *	@param number
	 */
	public void setBinary2300(short number)  throws CFException{
		work.setBinary2300(number);
	}

	public void setBinary2300(int number)  throws CFException{
		work.setBinary2300((short)number);
	}

	public void setBinary2300(long number)  throws CFException{
		work.setBinary2300((short)number);
	}



	/**
	 *	Returns the value of deMax300
	 *	@return deMax300
	 */
	public short getDeMax300() throws CFException {        
   		return work.getDeMax300();
	}
	
	/**
	 * 	Update DeMax300 with the passed value
	 *	@param number
	 */
	public void setDeMax300(short number)  throws CFException{
		work.setDeMax300(number);
	}

	public void setDeMax300(int number)  throws CFException{
		work.setDeMax300((short)number);
	}

	public void setDeMax300(long number)  throws CFException{
		work.setDeMax300((short)number);
	}



	/**
	 *	Test condition "V" for isSi520VarFormat88()
	 *	@return  Returns true if isSi520VarFormat88() is "V"
	 */
   public boolean isSi520VarFormat88(int index) throws CFException {
      return si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).isSi520VarFormat88();
   }

	/**
	*  set values "V"
	*/
   	public void setSi520VarFormat88True(int index)  throws CFException{  			
    	si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).setSi520VarFormat88True();
   	}
	/**
	 *	Returns the value of charX300
	 *	@return charX300
	 */
   public char[] getCharX300() throws CFException  {              
   		return work.getCharX300();
   }

  
	/**
	*  set variable charX300
	*  @param value
	**/
   public void setCharX300(char[] value) throws CFException {
      work.setCharX300(value);
   } 

	/**
	 *	Returns the value of errMsg7600
	 *	@return errMsg7600
	 */
   public char[] getErrMsg7600() throws CFException  {              
   		return work.getErrMsg7600();
   }

  
	/**
	*  set variable errMsg7600
	*  @param value
	**/
   public void setErrMsg7600(char[] value) throws CFException {
      work.setErrMsg7600(value);
   } 


        public Si994010Ctx getSi994010Ctx() {
            return Si994010Ctx.this;
        }

        public ParseFirstMessageOutCtx getParseFirstMessageOutCtx() {
            return new ParseFirstMessageOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += si520DeAndLengthsGroup.hashCode();
        str += work.hashCode();
        str += elementTable800.hashCode();
        str += si583ParserArea.hashCode();
       return str.hashCode();
    }

    public ParseFirstMessageInCtx clone() {
        ParseFirstMessageInCtx cloneObj = new ParseFirstMessageInCtx();
        cloneObj.si520DeAndLengthsGroup = new Si520DeAndLengthsGroup();
        cloneObj.si520DeAndLengthsGroup.set(si520DeAndLengthsGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.elementTable800 = new ElementTable800();
        cloneObj.elementTable800.set(elementTable800.getClonedField());
        cloneObj.si583ParserArea = new Si583ParserArea();
        cloneObj.si583ParserArea.set(si583ParserArea.getClonedField());
        return cloneObj;
    }

    }

    public ParseFirstMessageInCtx getParseFirstMessageInCtx() {
            return new ParseFirstMessageInCtx();
    }
     public class ParseFirstMessageOutCtx implements Cloneable {
     Si520DeAndLengthsGroup si520DeAndLengthsGroup = Si994010Ctx.this.getSi520DeAndLengthsGroup();
     Work work = Si994010Ctx.this.getWork();
     ElementTable800 elementTable800 = Si994010Ctx.this.getElementTable800();
     Si583ParserArea si583ParserArea = Si994010Ctx.this.getSi583ParserArea();


public void setSi583I1(int si583I1) { 
    Si994010Ctx.this.si583I1 = si583I1;
}

public int getSi583I1() { 
    return Si994010Ctx.this.si583I1;
}
	/**
	 *	Returns the value of si583ReturnMessage
	 *	@return si583ReturnMessage
	 */
   public char[] getSi583ReturnMessage() throws CFException  {              
   		return si583ParserArea.getSi583ReturnMessage();
   }

  
	/**
	*  set variable si583ReturnMessage
	*  @param value
	**/
   public void setSi583ReturnMessage(char[] value) throws CFException {
      si583ParserArea.setSi583ReturnMessage(value);
   } 

     /**
	 * 	Update Si583ReturnMessage 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSi583ReturnMessage(char[] source, int sourceIndex) throws CFException {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex);
   	
   }
   
   public void setSi583ReturnMessage(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi583ReturnMessage(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Si583ReturnMessage with another Field
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source) {
      si583ParserArea.setSi583ReturnMessage(source);
   }  
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source, int sourceIndex,int sourceLen) {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of binary128300
	 *	@return binary128300
	 */
	public short getBinary128300() throws CFException {        
   		return work.getBinary128300();
	}
	
	/**
	 * 	Update Binary128300 with the passed value
	 *	@param number
	 */
	public void setBinary128300(short number)  throws CFException{
		work.setBinary128300(number);
	}

	public void setBinary128300(int number)  throws CFException{
		work.setBinary128300((short)number);
	}

	public void setBinary128300(long number)  throws CFException{
		work.setBinary128300((short)number);
	}




public void setSi520Idx(int si520Idx) { 
    Si994010Ctx.this.si520Idx = si520Idx;
}

public int getSi520Idx() { 
    return Si994010Ctx.this.si520Idx;
}
	/**
	 *	Test condition "1" for isSi583DePresent188()
	 *	@return  Returns true if isSi583DePresent188() is "1"
	 */
   public boolean isSi583DePresent188(int index) throws CFException {
      return si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(index).isSi583DePresent188();
   }

	/**
	*  set values "1"
	*/
   	public void setSi583DePresent188True(int index)  throws CFException{  			
    	si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(index).setSi583DePresent188True();
   	}
	/**
	 *	Returns the value of si583DataElementInError
	 *	@return si583DataElementInError
	 */
	public short getSi583DataElementInError() throws CFException {        
   		return si583ParserArea.getSi583DataElementInError();
	}
	
	/**
	 * 	Update Si583DataElementInError with the passed value
	 *	@param number
	 */
	public void setSi583DataElementInError(short number)  throws CFException{
		si583ParserArea.setSi583DataElementInError(number);
	}

	public void setSi583DataElementInError(int number)  throws CFException{
		si583ParserArea.setSi583DataElementInError((short)number);
	}

	public void setSi583DataElementInError(long number)  throws CFException{
		si583ParserArea.setSi583DataElementInError((short)number);
	}



	/**
	 *	Returns the value of deMax300
	 *	@return deMax300
	 */
	public short getDeMax300() throws CFException {        
   		return work.getDeMax300();
	}
	
	/**
	 * 	Update DeMax300 with the passed value
	 *	@param number
	 */
	public void setDeMax300(short number)  throws CFException{
		work.setDeMax300(number);
	}

	public void setDeMax300(int number)  throws CFException{
		work.setDeMax300((short)number);
	}

	public void setDeMax300(long number)  throws CFException{
		work.setDeMax300((short)number);
	}



	/**
	 *	Returns the value of binary64300
	 *	@return binary64300
	 */
	public short getBinary64300() throws CFException {        
   		return work.getBinary64300();
	}
	
	/**
	 * 	Update Binary64300 with the passed value
	 *	@param number
	 */
	public void setBinary64300(short number)  throws CFException{
		work.setBinary64300(number);
	}

	public void setBinary64300(int number)  throws CFException{
		work.setBinary64300((short)number);
	}

	public void setBinary64300(long number)  throws CFException{
		work.setBinary64300((short)number);
	}



	/**
	 *	Returns the value of si583ReturnCode
	 *	@return si583ReturnCode
	 */
	public short getSi583ReturnCode() throws CFException {        
   		return si583ParserArea.getSi583ReturnCode();
	}
	
	/**
	 * 	Update Si583ReturnCode with the passed value
	 *	@param number
	 */
	public void setSi583ReturnCode(short number)  throws CFException{
		si583ParserArea.setSi583ReturnCode(number);
	}

	public void setSi583ReturnCode(int number)  throws CFException{
		si583ParserArea.setSi583ReturnCode((short)number);
	}

	public void setSi583ReturnCode(long number)  throws CFException{
		si583ParserArea.setSi583ReturnCode((short)number);
	}




public void setIdx800(int idx800) { 
    Si994010Ctx.this.idx800 = idx800;
}

public int getIdx800() { 
    return Si994010Ctx.this.idx800;
}
	/**
	 *	Test condition 101 for isSi583Lth1Error88()
	 *	@return  Returns true if isSi583Lth1Error88() is 101
	 */
   public boolean isSi583Lth1Error88() throws CFException {
      return si583ParserArea.isSi583Lth1Error88();
   }

	/**
	*  set values 101
	*/
   	public void setSi583Lth1Error88True()  throws CFException{  			
    	si583ParserArea.setSi583Lth1Error88True();
   	}
	/**
	 *	Returns the value of errMsg7600
	 *	@return errMsg7600
	 */
   public char[] getErrMsg7600() throws CFException  {              
   		return work.getErrMsg7600();
   }

  
	/**
	*  set variable errMsg7600
	*  @param value
	**/
   public void setErrMsg7600(char[] value) throws CFException {
      work.setErrMsg7600(value);
   } 


        public Si994010Ctx getSi994010Ctx() {
            return Si994010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += si520DeAndLengthsGroup.hashCode();
        str += work.hashCode();
        str += elementTable800.hashCode();
        str += si583ParserArea.hashCode();
       return str.hashCode();
    }

    public ParseFirstMessageOutCtx clone() {
        ParseFirstMessageOutCtx cloneObj = new ParseFirstMessageOutCtx();
        cloneObj.si520DeAndLengthsGroup = new Si520DeAndLengthsGroup();
        cloneObj.si520DeAndLengthsGroup.set(si520DeAndLengthsGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.elementTable800 = new ElementTable800();
        cloneObj.elementTable800.set(elementTable800.getClonedField());
        cloneObj.si583ParserArea = new Si583ParserArea();
        cloneObj.si583ParserArea.set(si583ParserArea.getClonedField());
        return cloneObj;
    }

    }

    public ParseFirstMessageOutCtx getParseFirstMessageOutCtx() {
            return new ParseFirstMessageOutCtx();
    }
     public class SetupFixedInCtx implements Cloneable {
     Si520DeAndLengthsGroup si520DeAndLengthsGroup = Si994010Ctx.this.getSi520DeAndLengthsGroup();
     Work work = Si994010Ctx.this.getWork();
     Si583ParserArea si583ParserArea = Si994010Ctx.this.getSi583ParserArea();

	/**
	 *	Returns the value of sub800
	 *	@return sub800
	 */
	public short getSub800() throws CFException {        
   		return work.getSub800();
	}
	
	/**
	 * 	Update Sub800 with the passed value
	 *	@param number
	 */
	public void setSub800(short number)  throws CFException{
		work.setSub800(number);
	}

	public void setSub800(int number)  throws CFException{
		work.setSub800((short)number);
	}

	public void setSub800(long number)  throws CFException{
		work.setSub800((short)number);
	}




public void setSi583I1(int si583I1) { 
    Si994010Ctx.this.si583I1 = si583I1;
}

public int getSi583I1() { 
    return Si994010Ctx.this.si583I1;
}
	/**
	 *	Returns the value of si520TblLength
	 *	@return si520TblLength
	 */
	public short getSi520TblLength(int index) throws CFException {        
   		return si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).getSi520TblLength();
	}
	
	/**
	 * 	Update Si520TblLength with the passed value
	 *	@param number
	 */
	public void setSi520TblLength(int index,short number)  throws CFException{
		si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).setSi520TblLength(number);
	}

	public void setSi520TblLength(int index,int number)  throws CFException{
		si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).setSi520TblLength((short)number);
	}

	public void setSi520TblLength(int index,long number)  throws CFException{
		si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).setSi520TblLength((short)number);
	}




public void setSi520Idx(int si520Idx) { 
    Si994010Ctx.this.si520Idx = si520Idx;
}

public int getSi520Idx() { 
    return Si994010Ctx.this.si520Idx;
}

        public Si994010Ctx getSi994010Ctx() {
            return Si994010Ctx.this;
        }

        public SetupFixedOutCtx getSetupFixedOutCtx() {
            return new SetupFixedOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += si520DeAndLengthsGroup.hashCode();
        str += work.hashCode();
        str += si583ParserArea.hashCode();
       return str.hashCode();
    }

    public SetupFixedInCtx clone() {
        SetupFixedInCtx cloneObj = new SetupFixedInCtx();
        cloneObj.si520DeAndLengthsGroup = new Si520DeAndLengthsGroup();
        cloneObj.si520DeAndLengthsGroup.set(si520DeAndLengthsGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.si583ParserArea = new Si583ParserArea();
        cloneObj.si583ParserArea.set(si583ParserArea.getClonedField());
        return cloneObj;
    }

    }

    public SetupFixedInCtx getSetupFixedInCtx() {
            return new SetupFixedInCtx();
    }
     public class SetupFixedOutCtx implements Cloneable {
     Si520DeAndLengthsGroup si520DeAndLengthsGroup = Si994010Ctx.this.getSi520DeAndLengthsGroup();
     Work work = Si994010Ctx.this.getWork();
     Si583ParserArea si583ParserArea = Si994010Ctx.this.getSi583ParserArea();

	/**
	 *	Returns the value of si583DeLength1
	 *	@return si583DeLength1
	 */
	public short getSi583DeLength1(int index) throws CFException {        
   		return si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(index).getSi583DeLength1();
	}
	
	/**
	 * 	Update Si583DeLength1 with the passed value
	 *	@param number
	 */
	public void setSi583DeLength1(int index,short number)  throws CFException{
		si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(index).setSi583DeLength1(number);
	}

	public void setSi583DeLength1(int index,int number)  throws CFException{
		si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(index).setSi583DeLength1((short)number);
	}

	public void setSi583DeLength1(int index,long number)  throws CFException{
		si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(index).setSi583DeLength1((short)number);
	}



	/**
	 *	Returns the value of sub800
	 *	@return sub800
	 */
	public short getSub800() throws CFException {        
   		return work.getSub800();
	}
	
	/**
	 * 	Update Sub800 with the passed value
	 *	@param number
	 */
	public void setSub800(short number)  throws CFException{
		work.setSub800(number);
	}

	public void setSub800(int number)  throws CFException{
		work.setSub800((short)number);
	}

	public void setSub800(long number)  throws CFException{
		work.setSub800((short)number);
	}



	/**
	 *	Returns the value of si583DeStartingPos1
	 *	@return si583DeStartingPos1
	 */
	public short getSi583DeStartingPos1(int index) throws CFException {        
   		return si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(index).getSi583DeStartingPos1();
	}
	
	/**
	 * 	Update Si583DeStartingPos1 with the passed value
	 *	@param number
	 */
	public void setSi583DeStartingPos1(int index,short number)  throws CFException{
		si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(index).setSi583DeStartingPos1(number);
	}

	public void setSi583DeStartingPos1(int index,int number)  throws CFException{
		si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(index).setSi583DeStartingPos1((short)number);
	}

	public void setSi583DeStartingPos1(int index,long number)  throws CFException{
		si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(index).setSi583DeStartingPos1((short)number);
	}



	/**
	 *	Returns the value of si520TblLength
	 *	@return si520TblLength
	 */
	public short getSi520TblLength(int index) throws CFException {        
   		return si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).getSi520TblLength();
	}
	
	/**
	 * 	Update Si520TblLength with the passed value
	 *	@param number
	 */
	public void setSi520TblLength(int index,short number)  throws CFException{
		si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).setSi520TblLength(number);
	}

	public void setSi520TblLength(int index,int number)  throws CFException{
		si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).setSi520TblLength((short)number);
	}

	public void setSi520TblLength(int index,long number)  throws CFException{
		si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).setSi520TblLength((short)number);
	}




        public Si994010Ctx getSi994010Ctx() {
            return Si994010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += si520DeAndLengthsGroup.hashCode();
        str += work.hashCode();
        str += si583ParserArea.hashCode();
       return str.hashCode();
    }

    public SetupFixedOutCtx clone() {
        SetupFixedOutCtx cloneObj = new SetupFixedOutCtx();
        cloneObj.si520DeAndLengthsGroup = new Si520DeAndLengthsGroup();
        cloneObj.si520DeAndLengthsGroup.set(si520DeAndLengthsGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.si583ParserArea = new Si583ParserArea();
        cloneObj.si583ParserArea.set(si583ParserArea.getClonedField());
        return cloneObj;
    }

    }

    public SetupFixedOutCtx getSetupFixedOutCtx() {
            return new SetupFixedOutCtx();
    }
     public class SetupVarInCtx implements Cloneable {
     Si520DeAndLengthsGroup si520DeAndLengthsGroup = Si994010Ctx.this.getSi520DeAndLengthsGroup();
     Work work = Si994010Ctx.this.getWork();
     DataGroup1000 dataGroup1000 = Si994010Ctx.this.getDataGroup1000();
     Si583ParserArea si583ParserArea = Si994010Ctx.this.getSi583ParserArea();

	/**
	 *	Returns the value of sub800
	 *	@return sub800
	 */
	public short getSub800() throws CFException {        
   		return work.getSub800();
	}
	
	/**
	 * 	Update Sub800 with the passed value
	 *	@param number
	 */
	public void setSub800(short number)  throws CFException{
		work.setSub800(number);
	}

	public void setSub800(int number)  throws CFException{
		work.setSub800((short)number);
	}

	public void setSub800(long number)  throws CFException{
		work.setSub800((short)number);
	}




public void setSi583I1(int si583I1) { 
    Si994010Ctx.this.si583I1 = si583I1;
}

public int getSi583I1() { 
    return Si994010Ctx.this.si583I1;
}
	/**
	 *	Returns the value of si520TblLength
	 *	@return si520TblLength
	 */
	public short getSi520TblLength(int index) throws CFException {        
   		return si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).getSi520TblLength();
	}
	
	/**
	 * 	Update Si520TblLength with the passed value
	 *	@param number
	 */
	public void setSi520TblLength(int index,short number)  throws CFException{
		si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).setSi520TblLength(number);
	}

	public void setSi520TblLength(int index,int number)  throws CFException{
		si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).setSi520TblLength((short)number);
	}

	public void setSi520TblLength(int index,long number)  throws CFException{
		si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).setSi520TblLength((short)number);
	}




public void setSi520Idx(int si520Idx) { 
    Si994010Ctx.this.si520Idx = si520Idx;
}

public int getSi520Idx() { 
    return Si994010Ctx.this.si520Idx;
}
	/**
	 *	Returns the value of errMsg5600
	 *	@return errMsg5600
	 */
   public char[] getErrMsg5600() throws CFException  {              
   		return work.getErrMsg5600();
   }

  
	/**
	*  set variable errMsg5600
	*  @param value
	**/
   public void setErrMsg5600(char[] value) throws CFException {
      work.setErrMsg5600(value);
   } 

	/**
	 *	Returns the value of data1000
	 *	@return data1000
	 */
   public char[] getData1000() throws CFException  {              
   		return dataGroup1000.getData1000();
   }

  
	/**
	*  set variable data1000
	*  @param value
	**/
   public void setData1000(char[] value) throws CFException {
      dataGroup1000.setData1000(value);
   } 

     /**
	 * 	Update Data1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setData1000(char[] source, int sourceIndex) throws CFException {
      dataGroup1000.setData1000(source, sourceIndex);
   	
   }
   
   public void setData1000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Data1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setData1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Data1000 with another Field
	 *	@param value
	 */
   public void setData1000(Field source) {
      dataGroup1000.setData1000(source);
   }  
   
     /**
	 * 	Update Data1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setData1000(Field source, int sourceIndex,int sourceLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Data1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setData1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Si994010Ctx getSi994010Ctx() {
            return Si994010Ctx.this;
        }

        public SetupVarOutCtx getSetupVarOutCtx() {
            return new SetupVarOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += si520DeAndLengthsGroup.hashCode();
        str += work.hashCode();
        str += dataGroup1000.hashCode();
        str += si583ParserArea.hashCode();
       return str.hashCode();
    }

    public SetupVarInCtx clone() {
        SetupVarInCtx cloneObj = new SetupVarInCtx();
        cloneObj.si520DeAndLengthsGroup = new Si520DeAndLengthsGroup();
        cloneObj.si520DeAndLengthsGroup.set(si520DeAndLengthsGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dataGroup1000 = new DataGroup1000();
        cloneObj.dataGroup1000.set(dataGroup1000.getClonedField());
        cloneObj.si583ParserArea = new Si583ParserArea();
        cloneObj.si583ParserArea.set(si583ParserArea.getClonedField());
        return cloneObj;
    }

    }

    public SetupVarInCtx getSetupVarInCtx() {
            return new SetupVarInCtx();
    }
     public class SetupVarOutCtx implements Cloneable {
     Si520DeAndLengthsGroup si520DeAndLengthsGroup = Si994010Ctx.this.getSi520DeAndLengthsGroup();
     Work work = Si994010Ctx.this.getWork();
     DataGroup1000 dataGroup1000 = Si994010Ctx.this.getDataGroup1000();
     Si583ParserArea si583ParserArea = Si994010Ctx.this.getSi583ParserArea();

	/**
	 *	Returns the value of si583DeLength1
	 *	@return si583DeLength1
	 */
	public short getSi583DeLength1(int index) throws CFException {        
   		return si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(index).getSi583DeLength1();
	}
	
	/**
	 * 	Update Si583DeLength1 with the passed value
	 *	@param number
	 */
	public void setSi583DeLength1(int index,short number)  throws CFException{
		si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(index).setSi583DeLength1(number);
	}

	public void setSi583DeLength1(int index,int number)  throws CFException{
		si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(index).setSi583DeLength1((short)number);
	}

	public void setSi583DeLength1(int index,long number)  throws CFException{
		si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(index).setSi583DeLength1((short)number);
	}



	/**
	 *	Returns the value of sub800
	 *	@return sub800
	 */
	public short getSub800() throws CFException {        
   		return work.getSub800();
	}
	
	/**
	 * 	Update Sub800 with the passed value
	 *	@param number
	 */
	public void setSub800(short number)  throws CFException{
		work.setSub800(number);
	}

	public void setSub800(int number)  throws CFException{
		work.setSub800((short)number);
	}

	public void setSub800(long number)  throws CFException{
		work.setSub800((short)number);
	}



	/**
	 *	Returns the value of si583DeStartingPos1
	 *	@return si583DeStartingPos1
	 */
	public short getSi583DeStartingPos1(int index) throws CFException {        
   		return si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(index).getSi583DeStartingPos1();
	}
	
	/**
	 * 	Update Si583DeStartingPos1 with the passed value
	 *	@param number
	 */
	public void setSi583DeStartingPos1(int index,short number)  throws CFException{
		si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(index).setSi583DeStartingPos1(number);
	}

	public void setSi583DeStartingPos1(int index,int number)  throws CFException{
		si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(index).setSi583DeStartingPos1((short)number);
	}

	public void setSi583DeStartingPos1(int index,long number)  throws CFException{
		si583ParserArea.getSi583DataElementWorkArea1().getSi583Filler1(index).setSi583DeStartingPos1((short)number);
	}



	/**
	 *	Returns the value of si520TblLength
	 *	@return si520TblLength
	 */
	public short getSi520TblLength(int index) throws CFException {        
   		return si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).getSi520TblLength();
	}
	
	/**
	 * 	Update Si520TblLength with the passed value
	 *	@param number
	 */
	public void setSi520TblLength(int index,short number)  throws CFException{
		si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).setSi520TblLength(number);
	}

	public void setSi520TblLength(int index,int number)  throws CFException{
		si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).setSi520TblLength((short)number);
	}

	public void setSi520TblLength(int index,long number)  throws CFException{
		si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).setSi520TblLength((short)number);
	}



	/**
	 *	Returns the value of si583ReturnMessage
	 *	@return si583ReturnMessage
	 */
   public char[] getSi583ReturnMessage() throws CFException  {              
   		return si583ParserArea.getSi583ReturnMessage();
   }

  
	/**
	*  set variable si583ReturnMessage
	*  @param value
	**/
   public void setSi583ReturnMessage(char[] value) throws CFException {
      si583ParserArea.setSi583ReturnMessage(value);
   } 

     /**
	 * 	Update Si583ReturnMessage 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSi583ReturnMessage(char[] source, int sourceIndex) throws CFException {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex);
   	
   }
   
   public void setSi583ReturnMessage(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi583ReturnMessage(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Si583ReturnMessage with another Field
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source) {
      si583ParserArea.setSi583ReturnMessage(source);
   }  
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source, int sourceIndex,int sourceLen) {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of si583DataElementInError
	 *	@return si583DataElementInError
	 */
	public short getSi583DataElementInError() throws CFException {        
   		return si583ParserArea.getSi583DataElementInError();
	}
	
	/**
	 * 	Update Si583DataElementInError with the passed value
	 *	@param number
	 */
	public void setSi583DataElementInError(short number)  throws CFException{
		si583ParserArea.setSi583DataElementInError(number);
	}

	public void setSi583DataElementInError(int number)  throws CFException{
		si583ParserArea.setSi583DataElementInError((short)number);
	}

	public void setSi583DataElementInError(long number)  throws CFException{
		si583ParserArea.setSi583DataElementInError((short)number);
	}



	/**
	 *	Test condition 101 for isSi583Lth1Error88()
	 *	@return  Returns true if isSi583Lth1Error88() is 101
	 */
   public boolean isSi583Lth1Error88() throws CFException {
      return si583ParserArea.isSi583Lth1Error88();
   }

	/**
	*  set values 101
	*/
   	public void setSi583Lth1Error88True()  throws CFException{  			
    	si583ParserArea.setSi583Lth1Error88True();
   	}
	/**
	 *	Returns the value of errMsg5600
	 *	@return errMsg5600
	 */
   public char[] getErrMsg5600() throws CFException  {              
   		return work.getErrMsg5600();
   }

  
	/**
	*  set variable errMsg5600
	*  @param value
	**/
   public void setErrMsg5600(char[] value) throws CFException {
      work.setErrMsg5600(value);
   } 

	/**
	 *	Returns the value of data1000
	 *	@return data1000
	 */
   public char[] getData1000() throws CFException  {              
   		return dataGroup1000.getData1000();
   }

  
	/**
	*  set variable data1000
	*  @param value
	**/
   public void setData1000(char[] value) throws CFException {
      dataGroup1000.setData1000(value);
   } 

     /**
	 * 	Update Data1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setData1000(char[] source, int sourceIndex) throws CFException {
      dataGroup1000.setData1000(source, sourceIndex);
   	
   }
   
   public void setData1000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Data1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setData1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Data1000 with another Field
	 *	@param value
	 */
   public void setData1000(Field source) {
      dataGroup1000.setData1000(source);
   }  
   
     /**
	 * 	Update Data1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setData1000(Field source, int sourceIndex,int sourceLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Data1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setData1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Si994010Ctx getSi994010Ctx() {
            return Si994010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += si520DeAndLengthsGroup.hashCode();
        str += work.hashCode();
        str += dataGroup1000.hashCode();
        str += si583ParserArea.hashCode();
       return str.hashCode();
    }

    public SetupVarOutCtx clone() {
        SetupVarOutCtx cloneObj = new SetupVarOutCtx();
        cloneObj.si520DeAndLengthsGroup = new Si520DeAndLengthsGroup();
        cloneObj.si520DeAndLengthsGroup.set(si520DeAndLengthsGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dataGroup1000 = new DataGroup1000();
        cloneObj.dataGroup1000.set(dataGroup1000.getClonedField());
        cloneObj.si583ParserArea = new Si583ParserArea();
        cloneObj.si583ParserArea.set(si583ParserArea.getClonedField());
        return cloneObj;
    }

    }

    public SetupVarOutCtx getSetupVarOutCtx() {
            return new SetupVarOutCtx();
    }
     public class SetupUnusedErrorInCtx implements Cloneable {
     Work work = Si994010Ctx.this.getWork();
     Si583ParserArea si583ParserArea = Si994010Ctx.this.getSi583ParserArea();

	/**
	 *	Returns the value of errMsg1600
	 *	@return errMsg1600
	 */
   public char[] getErrMsg1600() throws CFException  {              
   		return work.getErrMsg1600();
   }

  
	/**
	*  set variable errMsg1600
	*  @param value
	**/
   public void setErrMsg1600(char[] value) throws CFException {
      work.setErrMsg1600(value);
   } 


public void setSi520Idx(int si520Idx) { 
    Si994010Ctx.this.si520Idx = si520Idx;
}

public int getSi520Idx() { 
    return Si994010Ctx.this.si520Idx;
}

        public Si994010Ctx getSi994010Ctx() {
            return Si994010Ctx.this;
        }

        public SetupUnusedErrorOutCtx getSetupUnusedErrorOutCtx() {
            return new SetupUnusedErrorOutCtx();
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
        str += si583ParserArea.hashCode();
       return str.hashCode();
    }

    public SetupUnusedErrorInCtx clone() {
        SetupUnusedErrorInCtx cloneObj = new SetupUnusedErrorInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.si583ParserArea = new Si583ParserArea();
        cloneObj.si583ParserArea.set(si583ParserArea.getClonedField());
        return cloneObj;
    }

    }

    public SetupUnusedErrorInCtx getSetupUnusedErrorInCtx() {
            return new SetupUnusedErrorInCtx();
    }
     public class SetupUnusedErrorOutCtx implements Cloneable {
     Work work = Si994010Ctx.this.getWork();
     Si583ParserArea si583ParserArea = Si994010Ctx.this.getSi583ParserArea();

	/**
	 *	Returns the value of errMsg1600
	 *	@return errMsg1600
	 */
   public char[] getErrMsg1600() throws CFException  {              
   		return work.getErrMsg1600();
   }

  
	/**
	*  set variable errMsg1600
	*  @param value
	**/
   public void setErrMsg1600(char[] value) throws CFException {
      work.setErrMsg1600(value);
   } 

	/**
	 *	Returns the value of si583ReturnMessage
	 *	@return si583ReturnMessage
	 */
   public char[] getSi583ReturnMessage() throws CFException  {              
   		return si583ParserArea.getSi583ReturnMessage();
   }

  
	/**
	*  set variable si583ReturnMessage
	*  @param value
	**/
   public void setSi583ReturnMessage(char[] value) throws CFException {
      si583ParserArea.setSi583ReturnMessage(value);
   } 

     /**
	 * 	Update Si583ReturnMessage 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSi583ReturnMessage(char[] source, int sourceIndex) throws CFException {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex);
   	
   }
   
   public void setSi583ReturnMessage(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi583ReturnMessage(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Si583ReturnMessage with another Field
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source) {
      si583ParserArea.setSi583ReturnMessage(source);
   }  
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source, int sourceIndex,int sourceLen) {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of si583DataElementInError
	 *	@return si583DataElementInError
	 */
	public short getSi583DataElementInError() throws CFException {        
   		return si583ParserArea.getSi583DataElementInError();
	}
	
	/**
	 * 	Update Si583DataElementInError with the passed value
	 *	@param number
	 */
	public void setSi583DataElementInError(short number)  throws CFException{
		si583ParserArea.setSi583DataElementInError(number);
	}

	public void setSi583DataElementInError(int number)  throws CFException{
		si583ParserArea.setSi583DataElementInError((short)number);
	}

	public void setSi583DataElementInError(long number)  throws CFException{
		si583ParserArea.setSi583DataElementInError((short)number);
	}



	/**
	 *	Test condition 201 for isSi583Def1Error88()
	 *	@return  Returns true if isSi583Def1Error88() is 201
	 */
   public boolean isSi583Def1Error88() throws CFException {
      return si583ParserArea.isSi583Def1Error88();
   }

	/**
	*  set values 201
	*/
   	public void setSi583Def1Error88True()  throws CFException{  			
    	si583ParserArea.setSi583Def1Error88True();
   	}

        public Si994010Ctx getSi994010Ctx() {
            return Si994010Ctx.this;
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
        str += si583ParserArea.hashCode();
       return str.hashCode();
    }

    public SetupUnusedErrorOutCtx clone() {
        SetupUnusedErrorOutCtx cloneObj = new SetupUnusedErrorOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.si583ParserArea = new Si583ParserArea();
        cloneObj.si583ParserArea.set(si583ParserArea.getClonedField());
        return cloneObj;
    }

    }

    public SetupUnusedErrorOutCtx getSetupUnusedErrorOutCtx() {
            return new SetupUnusedErrorOutCtx();
    }
     public class GetSecondMessageInCtx implements Cloneable {
     BitMap1800 bitMap1800 = Si994010Ctx.this.getBitMap1800();
     Work work = Si994010Ctx.this.getWork();
     DataGroup1000 dataGroup1000 = Si994010Ctx.this.getDataGroup1000();
     ElementTable800 elementTable800 = Si994010Ctx.this.getElementTable800();
     Si583ParserArea si583ParserArea = Si994010Ctx.this.getSi583ParserArea();

	/**
	 *	Returns the value of sub800
	 *	@return sub800
	 */
	public short getSub800() throws CFException {        
   		return work.getSub800();
	}
	
	/**
	 * 	Update Sub800 with the passed value
	 *	@param number
	 */
	public void setSub800(short number)  throws CFException{
		work.setSub800(number);
	}

	public void setSub800(int number)  throws CFException{
		work.setSub800((short)number);
	}

	public void setSub800(long number)  throws CFException{
		work.setSub800((short)number);
	}



	/**
	 *	Returns the value of bitMap1800
	 *	@return bitMap1800
	 */   
	 public BitMap1800 getBitMap1800() {
   	return bitMap1800;
   }


	/**
	 *	Returns the value of binary4300
	 *	@return binary4300
	 */
	public short getBinary4300() throws CFException {        
   		return work.getBinary4300();
	}
	
	/**
	 * 	Update Binary4300 with the passed value
	 *	@param number
	 */
	public void setBinary4300(short number)  throws CFException{
		work.setBinary4300(number);
	}

	public void setBinary4300(int number)  throws CFException{
		work.setBinary4300((short)number);
	}

	public void setBinary4300(long number)  throws CFException{
		work.setBinary4300((short)number);
	}



	/**
	 *	Returns the value of dataGroup1000
	 *	@return dataGroup1000
	 */   
	 public DataGroup1000 getDataGroup1000() {
   	return dataGroup1000;
   }



public void setSi520Idx(int si520Idx) { 
    Si994010Ctx.this.si520Idx = si520Idx;
}

public int getSi520Idx() { 
    return Si994010Ctx.this.si520Idx;
}
	/**
	 *	Returns the value of element800
	 *	@return element800
	 */
   public char[] getElement800(int index) throws CFException  {              
   		return elementTable800.getElement800(index);
   }

  
	/**
	*  set variable element800
	*  @param value
	**/
   public void setElement800(int index,char[] value) throws CFException {
      elementTable800.setElement800((index),value);
   } 

	/**
	 *	Returns the value of errMsg4600
	 *	@return errMsg4600
	 */
   public char[] getErrMsg4600() throws CFException  {              
   		return work.getErrMsg4600();
   }

  
	/**
	*  set variable errMsg4600
	*  @param value
	**/
   public void setErrMsg4600(char[] value) throws CFException {
      work.setErrMsg4600(value);
   } 

	/**
	 *	Returns the value of si583ParserArea
	 *	@return si583ParserArea
	 */   
	 public Si583ParserArea getSi583ParserArea() {
   	return si583ParserArea;
   }


	/**
	 *	Returns the value of data1000
	 *	@return data1000
	 */
   public char[] getData1000() throws CFException  {              
   		return dataGroup1000.getData1000();
   }

  
	/**
	*  set variable data1000
	*  @param value
	**/
   public void setData1000(char[] value) throws CFException {
      dataGroup1000.setData1000(value);
   } 

     /**
	 * 	Update Data1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setData1000(char[] source, int sourceIndex) throws CFException {
      dataGroup1000.setData1000(source, sourceIndex);
   	
   }
   
   public void setData1000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Data1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setData1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Data1000 with another Field
	 *	@param value
	 */
   public void setData1000(Field source) {
      dataGroup1000.setData1000(source);
   }  
   
     /**
	 * 	Update Data1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setData1000(Field source, int sourceIndex,int sourceLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Data1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setData1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of binary8300
	 *	@return binary8300
	 */
	public short getBinary8300() throws CFException {        
   		return work.getBinary8300();
	}
	
	/**
	 * 	Update Binary8300 with the passed value
	 *	@param number
	 */
	public void setBinary8300(short number)  throws CFException{
		work.setBinary8300(number);
	}

	public void setBinary8300(int number)  throws CFException{
		work.setBinary8300((short)number);
	}

	public void setBinary8300(long number)  throws CFException{
		work.setBinary8300((short)number);
	}



	/**
	 *	Returns the value of charX300
	 *	@return charX300
	 */
   public char[] getCharX300() throws CFException  {              
   		return work.getCharX300();
   }

  
	/**
	*  set variable charX300
	*  @param value
	**/
   public void setCharX300(char[] value) throws CFException {
      work.setCharX300(value);
   } 

	/**
	 *	Returns the value of asterisks300
	 *	@return asterisks300
	 */
   public char[] getAsterisks300() throws CFException  {              
   		return work.getAsterisks300();
   }

  
	/**
	*  set variable asterisks300
	*  @param value
	**/
   public void setAsterisks300(char[] value) throws CFException {
      work.setAsterisks300(value);
   } 


        public Si994010Ctx getSi994010Ctx() {
            return Si994010Ctx.this;
        }

        public GetSecondMessageOutCtx getGetSecondMessageOutCtx() {
            return new GetSecondMessageOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += bitMap1800.hashCode();
        str += work.hashCode();
        str += dataGroup1000.hashCode();
        str += elementTable800.hashCode();
        str += si583ParserArea.hashCode();
       return str.hashCode();
    }

    public GetSecondMessageInCtx clone() {
        GetSecondMessageInCtx cloneObj = new GetSecondMessageInCtx();
        cloneObj.bitMap1800 = new BitMap1800();
        cloneObj.bitMap1800.set(bitMap1800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dataGroup1000 = new DataGroup1000();
        cloneObj.dataGroup1000.set(dataGroup1000.getClonedField());
        cloneObj.elementTable800 = new ElementTable800();
        cloneObj.elementTable800.set(elementTable800.getClonedField());
        cloneObj.si583ParserArea = new Si583ParserArea();
        cloneObj.si583ParserArea.set(si583ParserArea.getClonedField());
        return cloneObj;
    }

    }

    public GetSecondMessageInCtx getGetSecondMessageInCtx() {
            return new GetSecondMessageInCtx();
    }
     public class GetSecondMessageOutCtx implements Cloneable {
     BitMap1800 bitMap1800 = Si994010Ctx.this.getBitMap1800();
     Work work = Si994010Ctx.this.getWork();
     DataGroup1000 dataGroup1000 = Si994010Ctx.this.getDataGroup1000();
     ElementTable800 elementTable800 = Si994010Ctx.this.getElementTable800();
     Si583ParserArea si583ParserArea = Si994010Ctx.this.getSi583ParserArea();

	/**
	 *	Returns the value of sub800
	 *	@return sub800
	 */
	public short getSub800() throws CFException {        
   		return work.getSub800();
	}
	
	/**
	 * 	Update Sub800 with the passed value
	 *	@param number
	 */
	public void setSub800(short number)  throws CFException{
		work.setSub800(number);
	}

	public void setSub800(int number)  throws CFException{
		work.setSub800((short)number);
	}

	public void setSub800(long number)  throws CFException{
		work.setSub800((short)number);
	}



	/**
	 *	Returns the value of bitMap1800
	 *	@return bitMap1800
	 */   
	 public BitMap1800 getBitMap1800() {
   	return bitMap1800;
   }


	/**
	 *	Test condition "1" for isSi583DePresent288()
	 *	@return  Returns true if isSi583DePresent288() is "1"
	 */
   public boolean isSi583DePresent288(int index) throws CFException {
      return si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(index).isSi583DePresent288();
   }

	/**
	*  set values "1"
	*/
   	public void setSi583DePresent288True(int index)  throws CFException{  			
    	si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(index).setSi583DePresent288True();
   	}
	/**
	 *	Returns the value of si583ReturnMessage
	 *	@return si583ReturnMessage
	 */
   public char[] getSi583ReturnMessage() throws CFException  {              
   		return si583ParserArea.getSi583ReturnMessage();
   }

  
	/**
	*  set variable si583ReturnMessage
	*  @param value
	**/
   public void setSi583ReturnMessage(char[] value) throws CFException {
      si583ParserArea.setSi583ReturnMessage(value);
   } 

     /**
	 * 	Update Si583ReturnMessage 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSi583ReturnMessage(char[] source, int sourceIndex) throws CFException {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex);
   	
   }
   
   public void setSi583ReturnMessage(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi583ReturnMessage(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Si583ReturnMessage with another Field
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source) {
      si583ParserArea.setSi583ReturnMessage(source);
   }  
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source, int sourceIndex,int sourceLen) {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of si583Mti2
	 *	@return si583Mti2
	 */
   public char[] getSi583Mti2() throws CFException  {              
   		return si583ParserArea.getSi583Mti2();
   }

  
	/**
	*  set variable si583Mti2
	*  @param value
	**/
   public void setSi583Mti2(char[] value) throws CFException {
      si583ParserArea.setSi583Mti2(value);
   } 

     /**
	 * 	Update Si583Mti2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSi583Mti2(char[] source, int sourceIndex) throws CFException {
      si583ParserArea.setSi583Mti2(source, sourceIndex);
   	
   }
   
   public void setSi583Mti2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      si583ParserArea.setSi583Mti2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Si583Mti2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi583Mti2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      si583ParserArea.setSi583Mti2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Si583Mti2 with another Field
	 *	@param value
	 */
   public void setSi583Mti2(Field source) {
      si583ParserArea.setSi583Mti2(source);
   }  
   
     /**
	 * 	Update Si583Mti2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSi583Mti2(Field source, int sourceIndex,int sourceLen) {
      si583ParserArea.setSi583Mti2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Si583Mti2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi583Mti2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      si583ParserArea.setSi583Mti2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of si583DataElementInError
	 *	@return si583DataElementInError
	 */
	public short getSi583DataElementInError() throws CFException {        
   		return si583ParserArea.getSi583DataElementInError();
	}
	
	/**
	 * 	Update Si583DataElementInError with the passed value
	 *	@param number
	 */
	public void setSi583DataElementInError(short number)  throws CFException{
		si583ParserArea.setSi583DataElementInError(number);
	}

	public void setSi583DataElementInError(int number)  throws CFException{
		si583ParserArea.setSi583DataElementInError((short)number);
	}

	public void setSi583DataElementInError(long number)  throws CFException{
		si583ParserArea.setSi583DataElementInError((short)number);
	}



	/**
	 *	Returns the value of errMsg4600
	 *	@return errMsg4600
	 */
   public char[] getErrMsg4600() throws CFException  {              
   		return work.getErrMsg4600();
   }

  
	/**
	*  set variable errMsg4600
	*  @param value
	**/
   public void setErrMsg4600(char[] value) throws CFException {
      work.setErrMsg4600(value);
   } 

	/**
	 *	Test condition 2 for isSi583Mti2Error88()
	 *	@return  Returns true if isSi583Mti2Error88() is 2
	 */
   public boolean isSi583Mti2Error88() throws CFException {
      return si583ParserArea.isSi583Mti2Error88();
   }

	/**
	*  set values 2
	*/
   	public void setSi583Mti2Error88True()  throws CFException{  			
    	si583ParserArea.setSi583Mti2Error88True();
   	}
	/**
	 *	Returns the value of data1000
	 *	@return data1000
	 */
   public char[] getData1000() throws CFException  {              
   		return dataGroup1000.getData1000();
   }

  
	/**
	*  set variable data1000
	*  @param value
	**/
   public void setData1000(char[] value) throws CFException {
      dataGroup1000.setData1000(value);
   } 

     /**
	 * 	Update Data1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setData1000(char[] source, int sourceIndex) throws CFException {
      dataGroup1000.setData1000(source, sourceIndex);
   	
   }
   
   public void setData1000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Data1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setData1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Data1000 with another Field
	 *	@param value
	 */
   public void setData1000(Field source) {
      dataGroup1000.setData1000(source);
   }  
   
     /**
	 * 	Update Data1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setData1000(Field source, int sourceIndex,int sourceLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Data1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setData1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Si994010Ctx getSi994010Ctx() {
            return Si994010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += bitMap1800.hashCode();
        str += work.hashCode();
        str += dataGroup1000.hashCode();
        str += elementTable800.hashCode();
        str += si583ParserArea.hashCode();
       return str.hashCode();
    }

    public GetSecondMessageOutCtx clone() {
        GetSecondMessageOutCtx cloneObj = new GetSecondMessageOutCtx();
        cloneObj.bitMap1800 = new BitMap1800();
        cloneObj.bitMap1800.set(bitMap1800.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dataGroup1000 = new DataGroup1000();
        cloneObj.dataGroup1000.set(dataGroup1000.getClonedField());
        cloneObj.elementTable800 = new ElementTable800();
        cloneObj.elementTable800.set(elementTable800.getClonedField());
        cloneObj.si583ParserArea = new Si583ParserArea();
        cloneObj.si583ParserArea.set(si583ParserArea.getClonedField());
        return cloneObj;
    }

    }

    public GetSecondMessageOutCtx getGetSecondMessageOutCtx() {
            return new GetSecondMessageOutCtx();
    }
     public class ParseSecondMessageInCtx implements Cloneable {
     Si520DeAndLengthsGroup si520DeAndLengthsGroup = Si994010Ctx.this.getSi520DeAndLengthsGroup();
     Work work = Si994010Ctx.this.getWork();
     ElementTable800 elementTable800 = Si994010Ctx.this.getElementTable800();
     Si583ParserArea si583ParserArea = Si994010Ctx.this.getSi583ParserArea();

	/**
	 *	Returns the value of sub800
	 *	@return sub800
	 */
	public short getSub800() throws CFException {        
   		return work.getSub800();
	}
	
	/**
	 * 	Update Sub800 with the passed value
	 *	@param number
	 */
	public void setSub800(short number)  throws CFException{
		work.setSub800(number);
	}

	public void setSub800(int number)  throws CFException{
		work.setSub800((short)number);
	}

	public void setSub800(long number)  throws CFException{
		work.setSub800((short)number);
	}



	/**
	 *	Returns the value of maxMessage300
	 *	@return maxMessage300
	 */
	public int getMaxMessage300() throws CFException {        
   		return work.getMaxMessage300();
	}
	
	/**
	 * 	Update MaxMessage300 with the passed value
	 *	@param number
	 */
	public void setMaxMessage300(int number)  throws CFException{
		work.setMaxMessage300(number);
	}


	public void setMaxMessage300(long number)  throws CFException{
		work.setMaxMessage300((int)number);
	}


	/**
	 *	Returns the value of binaryZeros300
	 *	@return binaryZeros300
	 */
	public short getBinaryZeros300() throws CFException {        
   		return work.getBinaryZeros300();
	}
	
	/**
	 * 	Update BinaryZeros300 with the passed value
	 *	@param number
	 */
	public void setBinaryZeros300(short number)  throws CFException{
		work.setBinaryZeros300(number);
	}

	public void setBinaryZeros300(int number)  throws CFException{
		work.setBinaryZeros300((short)number);
	}

	public void setBinaryZeros300(long number)  throws CFException{
		work.setBinaryZeros300((short)number);
	}



	/**
	 *	Returns the value of binary128300
	 *	@return binary128300
	 */
	public short getBinary128300() throws CFException {        
   		return work.getBinary128300();
	}
	
	/**
	 * 	Update Binary128300 with the passed value
	 *	@param number
	 */
	public void setBinary128300(short number)  throws CFException{
		work.setBinary128300(number);
	}

	public void setBinary128300(int number)  throws CFException{
		work.setBinary128300((short)number);
	}

	public void setBinary128300(long number)  throws CFException{
		work.setBinary128300((short)number);
	}




public void setSi583I2(int si583I2) { 
    Si994010Ctx.this.si583I2 = si583I2;
}

public int getSi583I2() { 
    return Si994010Ctx.this.si583I2;
}

public void setSi520Idx(int si520Idx) { 
    Si994010Ctx.this.si520Idx = si520Idx;
}

public int getSi520Idx() { 
    return Si994010Ctx.this.si520Idx;
}
	/**
	 *	Returns the value of element800
	 *	@return element800
	 */
   public char[] getElement800(int index) throws CFException  {              
   		return elementTable800.getElement800(index);
   }

  
	/**
	*  set variable element800
	*  @param value
	**/
   public void setElement800(int index,char[] value) throws CFException {
      elementTable800.setElement800((index),value);
   } 

	/**
	 *	Test condition "F" for isSi520FixedFormat88()
	 *	@return  Returns true if isSi520FixedFormat88() is "F"
	 */
   public boolean isSi520FixedFormat88(int index) throws CFException {
      return si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).isSi520FixedFormat88();
   }

	/**
	*  set values "F"
	*/
   	public void setSi520FixedFormat88True(int index)  throws CFException{  			
    	si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).setSi520FixedFormat88True();
   	}
	/**
	 *	Returns the value of binary64300
	 *	@return binary64300
	 */
	public short getBinary64300() throws CFException {        
   		return work.getBinary64300();
	}
	
	/**
	 * 	Update Binary64300 with the passed value
	 *	@param number
	 */
	public void setBinary64300(short number)  throws CFException{
		work.setBinary64300(number);
	}

	public void setBinary64300(int number)  throws CFException{
		work.setBinary64300((short)number);
	}

	public void setBinary64300(long number)  throws CFException{
		work.setBinary64300((short)number);
	}



	/**
	 *	Returns the value of si583ReturnCode
	 *	@return si583ReturnCode
	 */
	public short getSi583ReturnCode() throws CFException {        
   		return si583ParserArea.getSi583ReturnCode();
	}
	
	/**
	 * 	Update Si583ReturnCode with the passed value
	 *	@param number
	 */
	public void setSi583ReturnCode(short number)  throws CFException{
		si583ParserArea.setSi583ReturnCode(number);
	}

	public void setSi583ReturnCode(int number)  throws CFException{
		si583ParserArea.setSi583ReturnCode((short)number);
	}

	public void setSi583ReturnCode(long number)  throws CFException{
		si583ParserArea.setSi583ReturnCode((short)number);
	}




public void setIdx800(int idx800) { 
    Si994010Ctx.this.idx800 = idx800;
}

public int getIdx800() { 
    return Si994010Ctx.this.idx800;
}
	/**
	 *	Returns the value of binary1300
	 *	@return binary1300
	 */
	public short getBinary1300() throws CFException {        
   		return work.getBinary1300();
	}
	
	/**
	 * 	Update Binary1300 with the passed value
	 *	@param number
	 */
	public void setBinary1300(short number)  throws CFException{
		work.setBinary1300(number);
	}

	public void setBinary1300(int number)  throws CFException{
		work.setBinary1300((short)number);
	}

	public void setBinary1300(long number)  throws CFException{
		work.setBinary1300((short)number);
	}



	/**
	 *	Returns the value of binary2300
	 *	@return binary2300
	 */
	public short getBinary2300() throws CFException {        
   		return work.getBinary2300();
	}
	
	/**
	 * 	Update Binary2300 with the passed value
	 *	@param number
	 */
	public void setBinary2300(short number)  throws CFException{
		work.setBinary2300(number);
	}

	public void setBinary2300(int number)  throws CFException{
		work.setBinary2300((short)number);
	}

	public void setBinary2300(long number)  throws CFException{
		work.setBinary2300((short)number);
	}



	/**
	 *	Returns the value of deMax300
	 *	@return deMax300
	 */
	public short getDeMax300() throws CFException {        
   		return work.getDeMax300();
	}
	
	/**
	 * 	Update DeMax300 with the passed value
	 *	@param number
	 */
	public void setDeMax300(short number)  throws CFException{
		work.setDeMax300(number);
	}

	public void setDeMax300(int number)  throws CFException{
		work.setDeMax300((short)number);
	}

	public void setDeMax300(long number)  throws CFException{
		work.setDeMax300((short)number);
	}



	/**
	 *	Test condition "V" for isSi520VarFormat88()
	 *	@return  Returns true if isSi520VarFormat88() is "V"
	 */
   public boolean isSi520VarFormat88(int index) throws CFException {
      return si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).isSi520VarFormat88();
   }

	/**
	*  set values "V"
	*/
   	public void setSi520VarFormat88True(int index)  throws CFException{  			
    	si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).setSi520VarFormat88True();
   	}
	/**
	 *	Returns the value of charX300
	 *	@return charX300
	 */
   public char[] getCharX300() throws CFException  {              
   		return work.getCharX300();
   }

  
	/**
	*  set variable charX300
	*  @param value
	**/
   public void setCharX300(char[] value) throws CFException {
      work.setCharX300(value);
   } 

	/**
	 *	Returns the value of errMsg7600
	 *	@return errMsg7600
	 */
   public char[] getErrMsg7600() throws CFException  {              
   		return work.getErrMsg7600();
   }

  
	/**
	*  set variable errMsg7600
	*  @param value
	**/
   public void setErrMsg7600(char[] value) throws CFException {
      work.setErrMsg7600(value);
   } 


        public Si994010Ctx getSi994010Ctx() {
            return Si994010Ctx.this;
        }

        public ParseSecondMessageOutCtx getParseSecondMessageOutCtx() {
            return new ParseSecondMessageOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += si520DeAndLengthsGroup.hashCode();
        str += work.hashCode();
        str += elementTable800.hashCode();
        str += si583ParserArea.hashCode();
       return str.hashCode();
    }

    public ParseSecondMessageInCtx clone() {
        ParseSecondMessageInCtx cloneObj = new ParseSecondMessageInCtx();
        cloneObj.si520DeAndLengthsGroup = new Si520DeAndLengthsGroup();
        cloneObj.si520DeAndLengthsGroup.set(si520DeAndLengthsGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.elementTable800 = new ElementTable800();
        cloneObj.elementTable800.set(elementTable800.getClonedField());
        cloneObj.si583ParserArea = new Si583ParserArea();
        cloneObj.si583ParserArea.set(si583ParserArea.getClonedField());
        return cloneObj;
    }

    }

    public ParseSecondMessageInCtx getParseSecondMessageInCtx() {
            return new ParseSecondMessageInCtx();
    }
     public class ParseSecondMessageOutCtx implements Cloneable {
     Si520DeAndLengthsGroup si520DeAndLengthsGroup = Si994010Ctx.this.getSi520DeAndLengthsGroup();
     Work work = Si994010Ctx.this.getWork();
     ElementTable800 elementTable800 = Si994010Ctx.this.getElementTable800();
     Si583ParserArea si583ParserArea = Si994010Ctx.this.getSi583ParserArea();

	/**
	 *	Test condition "1" for isSi583DePresent288()
	 *	@return  Returns true if isSi583DePresent288() is "1"
	 */
   public boolean isSi583DePresent288(int index) throws CFException {
      return si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(index).isSi583DePresent288();
   }

	/**
	*  set values "1"
	*/
   	public void setSi583DePresent288True(int index)  throws CFException{  			
    	si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(index).setSi583DePresent288True();
   	}
	/**
	 *	Returns the value of si583ReturnMessage
	 *	@return si583ReturnMessage
	 */
   public char[] getSi583ReturnMessage() throws CFException  {              
   		return si583ParserArea.getSi583ReturnMessage();
   }

  
	/**
	*  set variable si583ReturnMessage
	*  @param value
	**/
   public void setSi583ReturnMessage(char[] value) throws CFException {
      si583ParserArea.setSi583ReturnMessage(value);
   } 

     /**
	 * 	Update Si583ReturnMessage 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSi583ReturnMessage(char[] source, int sourceIndex) throws CFException {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex);
   	
   }
   
   public void setSi583ReturnMessage(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi583ReturnMessage(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Si583ReturnMessage with another Field
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source) {
      si583ParserArea.setSi583ReturnMessage(source);
   }  
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source, int sourceIndex,int sourceLen) {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of binary128300
	 *	@return binary128300
	 */
	public short getBinary128300() throws CFException {        
   		return work.getBinary128300();
	}
	
	/**
	 * 	Update Binary128300 with the passed value
	 *	@param number
	 */
	public void setBinary128300(short number)  throws CFException{
		work.setBinary128300(number);
	}

	public void setBinary128300(int number)  throws CFException{
		work.setBinary128300((short)number);
	}

	public void setBinary128300(long number)  throws CFException{
		work.setBinary128300((short)number);
	}




public void setSi583I2(int si583I2) { 
    Si994010Ctx.this.si583I2 = si583I2;
}

public int getSi583I2() { 
    return Si994010Ctx.this.si583I2;
}

public void setSi520Idx(int si520Idx) { 
    Si994010Ctx.this.si520Idx = si520Idx;
}

public int getSi520Idx() { 
    return Si994010Ctx.this.si520Idx;
}
	/**
	 *	Returns the value of si583DataElementInError
	 *	@return si583DataElementInError
	 */
	public short getSi583DataElementInError() throws CFException {        
   		return si583ParserArea.getSi583DataElementInError();
	}
	
	/**
	 * 	Update Si583DataElementInError with the passed value
	 *	@param number
	 */
	public void setSi583DataElementInError(short number)  throws CFException{
		si583ParserArea.setSi583DataElementInError(number);
	}

	public void setSi583DataElementInError(int number)  throws CFException{
		si583ParserArea.setSi583DataElementInError((short)number);
	}

	public void setSi583DataElementInError(long number)  throws CFException{
		si583ParserArea.setSi583DataElementInError((short)number);
	}



	/**
	 *	Returns the value of deMax300
	 *	@return deMax300
	 */
	public short getDeMax300() throws CFException {        
   		return work.getDeMax300();
	}
	
	/**
	 * 	Update DeMax300 with the passed value
	 *	@param number
	 */
	public void setDeMax300(short number)  throws CFException{
		work.setDeMax300(number);
	}

	public void setDeMax300(int number)  throws CFException{
		work.setDeMax300((short)number);
	}

	public void setDeMax300(long number)  throws CFException{
		work.setDeMax300((short)number);
	}



	/**
	 *	Returns the value of binary64300
	 *	@return binary64300
	 */
	public short getBinary64300() throws CFException {        
   		return work.getBinary64300();
	}
	
	/**
	 * 	Update Binary64300 with the passed value
	 *	@param number
	 */
	public void setBinary64300(short number)  throws CFException{
		work.setBinary64300(number);
	}

	public void setBinary64300(int number)  throws CFException{
		work.setBinary64300((short)number);
	}

	public void setBinary64300(long number)  throws CFException{
		work.setBinary64300((short)number);
	}



	/**
	 *	Returns the value of si583ReturnCode
	 *	@return si583ReturnCode
	 */
	public short getSi583ReturnCode() throws CFException {        
   		return si583ParserArea.getSi583ReturnCode();
	}
	
	/**
	 * 	Update Si583ReturnCode with the passed value
	 *	@param number
	 */
	public void setSi583ReturnCode(short number)  throws CFException{
		si583ParserArea.setSi583ReturnCode(number);
	}

	public void setSi583ReturnCode(int number)  throws CFException{
		si583ParserArea.setSi583ReturnCode((short)number);
	}

	public void setSi583ReturnCode(long number)  throws CFException{
		si583ParserArea.setSi583ReturnCode((short)number);
	}




public void setIdx800(int idx800) { 
    Si994010Ctx.this.idx800 = idx800;
}

public int getIdx800() { 
    return Si994010Ctx.this.idx800;
}
	/**
	 *	Test condition 102 for isSi583Lth2Error88()
	 *	@return  Returns true if isSi583Lth2Error88() is 102
	 */
   public boolean isSi583Lth2Error88() throws CFException {
      return si583ParserArea.isSi583Lth2Error88();
   }

	/**
	*  set values 102
	*/
   	public void setSi583Lth2Error88True()  throws CFException{  			
    	si583ParserArea.setSi583Lth2Error88True();
   	}
	/**
	 *	Returns the value of errMsg7600
	 *	@return errMsg7600
	 */
   public char[] getErrMsg7600() throws CFException  {              
   		return work.getErrMsg7600();
   }

  
	/**
	*  set variable errMsg7600
	*  @param value
	**/
   public void setErrMsg7600(char[] value) throws CFException {
      work.setErrMsg7600(value);
   } 


        public Si994010Ctx getSi994010Ctx() {
            return Si994010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += si520DeAndLengthsGroup.hashCode();
        str += work.hashCode();
        str += elementTable800.hashCode();
        str += si583ParserArea.hashCode();
       return str.hashCode();
    }

    public ParseSecondMessageOutCtx clone() {
        ParseSecondMessageOutCtx cloneObj = new ParseSecondMessageOutCtx();
        cloneObj.si520DeAndLengthsGroup = new Si520DeAndLengthsGroup();
        cloneObj.si520DeAndLengthsGroup.set(si520DeAndLengthsGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.elementTable800 = new ElementTable800();
        cloneObj.elementTable800.set(elementTable800.getClonedField());
        cloneObj.si583ParserArea = new Si583ParserArea();
        cloneObj.si583ParserArea.set(si583ParserArea.getClonedField());
        return cloneObj;
    }

    }

    public ParseSecondMessageOutCtx getParseSecondMessageOutCtx() {
            return new ParseSecondMessageOutCtx();
    }
     public class SetupFixed5010InCtx implements Cloneable {
     Si520DeAndLengthsGroup si520DeAndLengthsGroup = Si994010Ctx.this.getSi520DeAndLengthsGroup();
     Work work = Si994010Ctx.this.getWork();
     Si583ParserArea si583ParserArea = Si994010Ctx.this.getSi583ParserArea();

	/**
	 *	Returns the value of sub800
	 *	@return sub800
	 */
	public short getSub800() throws CFException {        
   		return work.getSub800();
	}
	
	/**
	 * 	Update Sub800 with the passed value
	 *	@param number
	 */
	public void setSub800(short number)  throws CFException{
		work.setSub800(number);
	}

	public void setSub800(int number)  throws CFException{
		work.setSub800((short)number);
	}

	public void setSub800(long number)  throws CFException{
		work.setSub800((short)number);
	}



	/**
	 *	Returns the value of si520TblLength
	 *	@return si520TblLength
	 */
	public short getSi520TblLength(int index) throws CFException {        
   		return si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).getSi520TblLength();
	}
	
	/**
	 * 	Update Si520TblLength with the passed value
	 *	@param number
	 */
	public void setSi520TblLength(int index,short number)  throws CFException{
		si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).setSi520TblLength(number);
	}

	public void setSi520TblLength(int index,int number)  throws CFException{
		si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).setSi520TblLength((short)number);
	}

	public void setSi520TblLength(int index,long number)  throws CFException{
		si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).setSi520TblLength((short)number);
	}




public void setSi583I2(int si583I2) { 
    Si994010Ctx.this.si583I2 = si583I2;
}

public int getSi583I2() { 
    return Si994010Ctx.this.si583I2;
}

public void setSi520Idx(int si520Idx) { 
    Si994010Ctx.this.si520Idx = si520Idx;
}

public int getSi520Idx() { 
    return Si994010Ctx.this.si520Idx;
}

        public Si994010Ctx getSi994010Ctx() {
            return Si994010Ctx.this;
        }

        public SetupFixed5010OutCtx getSetupFixed5010OutCtx() {
            return new SetupFixed5010OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += si520DeAndLengthsGroup.hashCode();
        str += work.hashCode();
        str += si583ParserArea.hashCode();
       return str.hashCode();
    }

    public SetupFixed5010InCtx clone() {
        SetupFixed5010InCtx cloneObj = new SetupFixed5010InCtx();
        cloneObj.si520DeAndLengthsGroup = new Si520DeAndLengthsGroup();
        cloneObj.si520DeAndLengthsGroup.set(si520DeAndLengthsGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.si583ParserArea = new Si583ParserArea();
        cloneObj.si583ParserArea.set(si583ParserArea.getClonedField());
        return cloneObj;
    }

    }

    public SetupFixed5010InCtx getSetupFixed5010InCtx() {
            return new SetupFixed5010InCtx();
    }
     public class SetupFixed5010OutCtx implements Cloneable {
     Si520DeAndLengthsGroup si520DeAndLengthsGroup = Si994010Ctx.this.getSi520DeAndLengthsGroup();
     Work work = Si994010Ctx.this.getWork();
     Si583ParserArea si583ParserArea = Si994010Ctx.this.getSi583ParserArea();

	/**
	 *	Returns the value of sub800
	 *	@return sub800
	 */
	public short getSub800() throws CFException {        
   		return work.getSub800();
	}
	
	/**
	 * 	Update Sub800 with the passed value
	 *	@param number
	 */
	public void setSub800(short number)  throws CFException{
		work.setSub800(number);
	}

	public void setSub800(int number)  throws CFException{
		work.setSub800((short)number);
	}

	public void setSub800(long number)  throws CFException{
		work.setSub800((short)number);
	}



	/**
	 *	Returns the value of si520TblLength
	 *	@return si520TblLength
	 */
	public short getSi520TblLength(int index) throws CFException {        
   		return si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).getSi520TblLength();
	}
	
	/**
	 * 	Update Si520TblLength with the passed value
	 *	@param number
	 */
	public void setSi520TblLength(int index,short number)  throws CFException{
		si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).setSi520TblLength(number);
	}

	public void setSi520TblLength(int index,int number)  throws CFException{
		si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).setSi520TblLength((short)number);
	}

	public void setSi520TblLength(int index,long number)  throws CFException{
		si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).setSi520TblLength((short)number);
	}



	/**
	 *	Returns the value of si583DeStartingPos2
	 *	@return si583DeStartingPos2
	 */
	public short getSi583DeStartingPos2(int index) throws CFException {        
   		return si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(index).getSi583DeStartingPos2();
	}
	
	/**
	 * 	Update Si583DeStartingPos2 with the passed value
	 *	@param number
	 */
	public void setSi583DeStartingPos2(int index,short number)  throws CFException{
		si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(index).setSi583DeStartingPos2(number);
	}

	public void setSi583DeStartingPos2(int index,int number)  throws CFException{
		si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(index).setSi583DeStartingPos2((short)number);
	}

	public void setSi583DeStartingPos2(int index,long number)  throws CFException{
		si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(index).setSi583DeStartingPos2((short)number);
	}



	/**
	 *	Returns the value of si583DeLength2
	 *	@return si583DeLength2
	 */
	public short getSi583DeLength2(int index) throws CFException {        
   		return si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(index).getSi583DeLength2();
	}
	
	/**
	 * 	Update Si583DeLength2 with the passed value
	 *	@param number
	 */
	public void setSi583DeLength2(int index,short number)  throws CFException{
		si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(index).setSi583DeLength2(number);
	}

	public void setSi583DeLength2(int index,int number)  throws CFException{
		si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(index).setSi583DeLength2((short)number);
	}

	public void setSi583DeLength2(int index,long number)  throws CFException{
		si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(index).setSi583DeLength2((short)number);
	}




        public Si994010Ctx getSi994010Ctx() {
            return Si994010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += si520DeAndLengthsGroup.hashCode();
        str += work.hashCode();
        str += si583ParserArea.hashCode();
       return str.hashCode();
    }

    public SetupFixed5010OutCtx clone() {
        SetupFixed5010OutCtx cloneObj = new SetupFixed5010OutCtx();
        cloneObj.si520DeAndLengthsGroup = new Si520DeAndLengthsGroup();
        cloneObj.si520DeAndLengthsGroup.set(si520DeAndLengthsGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.si583ParserArea = new Si583ParserArea();
        cloneObj.si583ParserArea.set(si583ParserArea.getClonedField());
        return cloneObj;
    }

    }

    public SetupFixed5010OutCtx getSetupFixed5010OutCtx() {
            return new SetupFixed5010OutCtx();
    }
     public class SetupVar5020InCtx implements Cloneable {
     Si520DeAndLengthsGroup si520DeAndLengthsGroup = Si994010Ctx.this.getSi520DeAndLengthsGroup();
     Work work = Si994010Ctx.this.getWork();
     DataGroup1000 dataGroup1000 = Si994010Ctx.this.getDataGroup1000();
     Si583ParserArea si583ParserArea = Si994010Ctx.this.getSi583ParserArea();

	/**
	 *	Returns the value of sub800
	 *	@return sub800
	 */
	public short getSub800() throws CFException {        
   		return work.getSub800();
	}
	
	/**
	 * 	Update Sub800 with the passed value
	 *	@param number
	 */
	public void setSub800(short number)  throws CFException{
		work.setSub800(number);
	}

	public void setSub800(int number)  throws CFException{
		work.setSub800((short)number);
	}

	public void setSub800(long number)  throws CFException{
		work.setSub800((short)number);
	}



	/**
	 *	Returns the value of si520TblLength
	 *	@return si520TblLength
	 */
	public short getSi520TblLength(int index) throws CFException {        
   		return si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).getSi520TblLength();
	}
	
	/**
	 * 	Update Si520TblLength with the passed value
	 *	@param number
	 */
	public void setSi520TblLength(int index,short number)  throws CFException{
		si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).setSi520TblLength(number);
	}

	public void setSi520TblLength(int index,int number)  throws CFException{
		si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).setSi520TblLength((short)number);
	}

	public void setSi520TblLength(int index,long number)  throws CFException{
		si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).setSi520TblLength((short)number);
	}




public void setSi520Idx(int si520Idx) { 
    Si994010Ctx.this.si520Idx = si520Idx;
}

public int getSi520Idx() { 
    return Si994010Ctx.this.si520Idx;
}

public void setSi583I2(int si583I2) { 
    Si994010Ctx.this.si583I2 = si583I2;
}

public int getSi583I2() { 
    return Si994010Ctx.this.si583I2;
}
	/**
	 *	Returns the value of errMsg6600
	 *	@return errMsg6600
	 */
   public char[] getErrMsg6600() throws CFException  {              
   		return work.getErrMsg6600();
   }

  
	/**
	*  set variable errMsg6600
	*  @param value
	**/
   public void setErrMsg6600(char[] value) throws CFException {
      work.setErrMsg6600(value);
   } 

	/**
	 *	Returns the value of data1000
	 *	@return data1000
	 */
   public char[] getData1000() throws CFException  {              
   		return dataGroup1000.getData1000();
   }

  
	/**
	*  set variable data1000
	*  @param value
	**/
   public void setData1000(char[] value) throws CFException {
      dataGroup1000.setData1000(value);
   } 

     /**
	 * 	Update Data1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setData1000(char[] source, int sourceIndex) throws CFException {
      dataGroup1000.setData1000(source, sourceIndex);
   	
   }
   
   public void setData1000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Data1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setData1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Data1000 with another Field
	 *	@param value
	 */
   public void setData1000(Field source) {
      dataGroup1000.setData1000(source);
   }  
   
     /**
	 * 	Update Data1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setData1000(Field source, int sourceIndex,int sourceLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Data1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setData1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Si994010Ctx getSi994010Ctx() {
            return Si994010Ctx.this;
        }

        public SetupVar5020OutCtx getSetupVar5020OutCtx() {
            return new SetupVar5020OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += si520DeAndLengthsGroup.hashCode();
        str += work.hashCode();
        str += dataGroup1000.hashCode();
        str += si583ParserArea.hashCode();
       return str.hashCode();
    }

    public SetupVar5020InCtx clone() {
        SetupVar5020InCtx cloneObj = new SetupVar5020InCtx();
        cloneObj.si520DeAndLengthsGroup = new Si520DeAndLengthsGroup();
        cloneObj.si520DeAndLengthsGroup.set(si520DeAndLengthsGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dataGroup1000 = new DataGroup1000();
        cloneObj.dataGroup1000.set(dataGroup1000.getClonedField());
        cloneObj.si583ParserArea = new Si583ParserArea();
        cloneObj.si583ParserArea.set(si583ParserArea.getClonedField());
        return cloneObj;
    }

    }

    public SetupVar5020InCtx getSetupVar5020InCtx() {
            return new SetupVar5020InCtx();
    }
     public class SetupVar5020OutCtx implements Cloneable {
     Si520DeAndLengthsGroup si520DeAndLengthsGroup = Si994010Ctx.this.getSi520DeAndLengthsGroup();
     Work work = Si994010Ctx.this.getWork();
     DataGroup1000 dataGroup1000 = Si994010Ctx.this.getDataGroup1000();
     Si583ParserArea si583ParserArea = Si994010Ctx.this.getSi583ParserArea();

	/**
	 *	Returns the value of sub800
	 *	@return sub800
	 */
	public short getSub800() throws CFException {        
   		return work.getSub800();
	}
	
	/**
	 * 	Update Sub800 with the passed value
	 *	@param number
	 */
	public void setSub800(short number)  throws CFException{
		work.setSub800(number);
	}

	public void setSub800(int number)  throws CFException{
		work.setSub800((short)number);
	}

	public void setSub800(long number)  throws CFException{
		work.setSub800((short)number);
	}



	/**
	 *	Returns the value of si520TblLength
	 *	@return si520TblLength
	 */
	public short getSi520TblLength(int index) throws CFException {        
   		return si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).getSi520TblLength();
	}
	
	/**
	 * 	Update Si520TblLength with the passed value
	 *	@param number
	 */
	public void setSi520TblLength(int index,short number)  throws CFException{
		si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).setSi520TblLength(number);
	}

	public void setSi520TblLength(int index,int number)  throws CFException{
		si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).setSi520TblLength((short)number);
	}

	public void setSi520TblLength(int index,long number)  throws CFException{
		si520DeAndLengthsGroup.getSi520DeAndLengthsRedefined().getSi520DeAndLengthsGroupArray1(index).setSi520TblLength((short)number);
	}



	/**
	 *	Returns the value of si583ReturnMessage
	 *	@return si583ReturnMessage
	 */
   public char[] getSi583ReturnMessage() throws CFException  {              
   		return si583ParserArea.getSi583ReturnMessage();
   }

  
	/**
	*  set variable si583ReturnMessage
	*  @param value
	**/
   public void setSi583ReturnMessage(char[] value) throws CFException {
      si583ParserArea.setSi583ReturnMessage(value);
   } 

     /**
	 * 	Update Si583ReturnMessage 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSi583ReturnMessage(char[] source, int sourceIndex) throws CFException {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex);
   	
   }
   
   public void setSi583ReturnMessage(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi583ReturnMessage(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Si583ReturnMessage with another Field
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source) {
      si583ParserArea.setSi583ReturnMessage(source);
   }  
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source, int sourceIndex,int sourceLen) {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of errMsg6600
	 *	@return errMsg6600
	 */
   public char[] getErrMsg6600() throws CFException  {              
   		return work.getErrMsg6600();
   }

  
	/**
	*  set variable errMsg6600
	*  @param value
	**/
   public void setErrMsg6600(char[] value) throws CFException {
      work.setErrMsg6600(value);
   } 

	/**
	 *	Returns the value of si583DeStartingPos2
	 *	@return si583DeStartingPos2
	 */
	public short getSi583DeStartingPos2(int index) throws CFException {        
   		return si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(index).getSi583DeStartingPos2();
	}
	
	/**
	 * 	Update Si583DeStartingPos2 with the passed value
	 *	@param number
	 */
	public void setSi583DeStartingPos2(int index,short number)  throws CFException{
		si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(index).setSi583DeStartingPos2(number);
	}

	public void setSi583DeStartingPos2(int index,int number)  throws CFException{
		si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(index).setSi583DeStartingPos2((short)number);
	}

	public void setSi583DeStartingPos2(int index,long number)  throws CFException{
		si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(index).setSi583DeStartingPos2((short)number);
	}



	/**
	 *	Returns the value of si583DataElementInError
	 *	@return si583DataElementInError
	 */
	public short getSi583DataElementInError() throws CFException {        
   		return si583ParserArea.getSi583DataElementInError();
	}
	
	/**
	 * 	Update Si583DataElementInError with the passed value
	 *	@param number
	 */
	public void setSi583DataElementInError(short number)  throws CFException{
		si583ParserArea.setSi583DataElementInError(number);
	}

	public void setSi583DataElementInError(int number)  throws CFException{
		si583ParserArea.setSi583DataElementInError((short)number);
	}

	public void setSi583DataElementInError(long number)  throws CFException{
		si583ParserArea.setSi583DataElementInError((short)number);
	}



	/**
	 *	Returns the value of si583DeLength2
	 *	@return si583DeLength2
	 */
	public short getSi583DeLength2(int index) throws CFException {        
   		return si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(index).getSi583DeLength2();
	}
	
	/**
	 * 	Update Si583DeLength2 with the passed value
	 *	@param number
	 */
	public void setSi583DeLength2(int index,short number)  throws CFException{
		si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(index).setSi583DeLength2(number);
	}

	public void setSi583DeLength2(int index,int number)  throws CFException{
		si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(index).setSi583DeLength2((short)number);
	}

	public void setSi583DeLength2(int index,long number)  throws CFException{
		si583ParserArea.getSi583DataElementWorkArea2().getSi583Filler2(index).setSi583DeLength2((short)number);
	}



	/**
	 *	Returns the value of data1000
	 *	@return data1000
	 */
   public char[] getData1000() throws CFException  {              
   		return dataGroup1000.getData1000();
   }

  
	/**
	*  set variable data1000
	*  @param value
	**/
   public void setData1000(char[] value) throws CFException {
      dataGroup1000.setData1000(value);
   } 

     /**
	 * 	Update Data1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setData1000(char[] source, int sourceIndex) throws CFException {
      dataGroup1000.setData1000(source, sourceIndex);
   	
   }
   
   public void setData1000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Data1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setData1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Data1000 with another Field
	 *	@param value
	 */
   public void setData1000(Field source) {
      dataGroup1000.setData1000(source);
   }  
   
     /**
	 * 	Update Data1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setData1000(Field source, int sourceIndex,int sourceLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Data1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setData1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition 102 for isSi583Lth2Error88()
	 *	@return  Returns true if isSi583Lth2Error88() is 102
	 */
   public boolean isSi583Lth2Error88() throws CFException {
      return si583ParserArea.isSi583Lth2Error88();
   }

	/**
	*  set values 102
	*/
   	public void setSi583Lth2Error88True()  throws CFException{  			
    	si583ParserArea.setSi583Lth2Error88True();
   	}

        public Si994010Ctx getSi994010Ctx() {
            return Si994010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += si520DeAndLengthsGroup.hashCode();
        str += work.hashCode();
        str += dataGroup1000.hashCode();
        str += si583ParserArea.hashCode();
       return str.hashCode();
    }

    public SetupVar5020OutCtx clone() {
        SetupVar5020OutCtx cloneObj = new SetupVar5020OutCtx();
        cloneObj.si520DeAndLengthsGroup = new Si520DeAndLengthsGroup();
        cloneObj.si520DeAndLengthsGroup.set(si520DeAndLengthsGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dataGroup1000 = new DataGroup1000();
        cloneObj.dataGroup1000.set(dataGroup1000.getClonedField());
        cloneObj.si583ParserArea = new Si583ParserArea();
        cloneObj.si583ParserArea.set(si583ParserArea.getClonedField());
        return cloneObj;
    }

    }

    public SetupVar5020OutCtx getSetupVar5020OutCtx() {
            return new SetupVar5020OutCtx();
    }
     public class SetupUnusedError5030InCtx implements Cloneable {
     Work work = Si994010Ctx.this.getWork();
     Si583ParserArea si583ParserArea = Si994010Ctx.this.getSi583ParserArea();


public void setSi520Idx(int si520Idx) { 
    Si994010Ctx.this.si520Idx = si520Idx;
}

public int getSi520Idx() { 
    return Si994010Ctx.this.si520Idx;
}
	/**
	 *	Returns the value of errMsg2600
	 *	@return errMsg2600
	 */
   public char[] getErrMsg2600() throws CFException  {              
   		return work.getErrMsg2600();
   }

  
	/**
	*  set variable errMsg2600
	*  @param value
	**/
   public void setErrMsg2600(char[] value) throws CFException {
      work.setErrMsg2600(value);
   } 


        public Si994010Ctx getSi994010Ctx() {
            return Si994010Ctx.this;
        }

        public SetupUnusedError5030OutCtx getSetupUnusedError5030OutCtx() {
            return new SetupUnusedError5030OutCtx();
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
        str += si583ParserArea.hashCode();
       return str.hashCode();
    }

    public SetupUnusedError5030InCtx clone() {
        SetupUnusedError5030InCtx cloneObj = new SetupUnusedError5030InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.si583ParserArea = new Si583ParserArea();
        cloneObj.si583ParserArea.set(si583ParserArea.getClonedField());
        return cloneObj;
    }

    }

    public SetupUnusedError5030InCtx getSetupUnusedError5030InCtx() {
            return new SetupUnusedError5030InCtx();
    }
     public class SetupUnusedError5030OutCtx implements Cloneable {
     Work work = Si994010Ctx.this.getWork();
     Si583ParserArea si583ParserArea = Si994010Ctx.this.getSi583ParserArea();

	/**
	 *	Test condition 202 for isSi583Def2Error88()
	 *	@return  Returns true if isSi583Def2Error88() is 202
	 */
   public boolean isSi583Def2Error88() throws CFException {
      return si583ParserArea.isSi583Def2Error88();
   }

	/**
	*  set values 202
	*/
   	public void setSi583Def2Error88True()  throws CFException{  			
    	si583ParserArea.setSi583Def2Error88True();
   	}
	/**
	 *	Returns the value of si583ReturnMessage
	 *	@return si583ReturnMessage
	 */
   public char[] getSi583ReturnMessage() throws CFException  {              
   		return si583ParserArea.getSi583ReturnMessage();
   }

  
	/**
	*  set variable si583ReturnMessage
	*  @param value
	**/
   public void setSi583ReturnMessage(char[] value) throws CFException {
      si583ParserArea.setSi583ReturnMessage(value);
   } 

     /**
	 * 	Update Si583ReturnMessage 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSi583ReturnMessage(char[] source, int sourceIndex) throws CFException {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex);
   	
   }
   
   public void setSi583ReturnMessage(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi583ReturnMessage(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Si583ReturnMessage with another Field
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source) {
      si583ParserArea.setSi583ReturnMessage(source);
   }  
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source, int sourceIndex,int sourceLen) {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Si583ReturnMessage 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi583ReturnMessage(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      si583ParserArea.setSi583ReturnMessage(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of si583DataElementInError
	 *	@return si583DataElementInError
	 */
	public short getSi583DataElementInError() throws CFException {        
   		return si583ParserArea.getSi583DataElementInError();
	}
	
	/**
	 * 	Update Si583DataElementInError with the passed value
	 *	@param number
	 */
	public void setSi583DataElementInError(short number)  throws CFException{
		si583ParserArea.setSi583DataElementInError(number);
	}

	public void setSi583DataElementInError(int number)  throws CFException{
		si583ParserArea.setSi583DataElementInError((short)number);
	}

	public void setSi583DataElementInError(long number)  throws CFException{
		si583ParserArea.setSi583DataElementInError((short)number);
	}



	/**
	 *	Returns the value of errMsg2600
	 *	@return errMsg2600
	 */
   public char[] getErrMsg2600() throws CFException  {              
   		return work.getErrMsg2600();
   }

  
	/**
	*  set variable errMsg2600
	*  @param value
	**/
   public void setErrMsg2600(char[] value) throws CFException {
      work.setErrMsg2600(value);
   } 


        public Si994010Ctx getSi994010Ctx() {
            return Si994010Ctx.this;
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
        str += si583ParserArea.hashCode();
       return str.hashCode();
    }

    public SetupUnusedError5030OutCtx clone() {
        SetupUnusedError5030OutCtx cloneObj = new SetupUnusedError5030OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.si583ParserArea = new Si583ParserArea();
        cloneObj.si583ParserArea.set(si583ParserArea.getClonedField());
        return cloneObj;
    }

    }

    public SetupUnusedError5030OutCtx getSetupUnusedError5030OutCtx() {
            return new SetupUnusedError5030OutCtx();
    }
     public class ExpandTheBitMapInCtx implements Cloneable {
     BitMap1800 bitMap1800 = Si994010Ctx.this.getBitMap1800();
     ParsingPatternValuesGroup500 parsingPatternValuesGroup500 = Si994010Ctx.this.getParsingPatternValuesGroup500();
     Work work = Si994010Ctx.this.getWork();
     DataGroup1000 dataGroup1000 = Si994010Ctx.this.getDataGroup1000();
     ElementTable800 elementTable800 = Si994010Ctx.this.getElementTable800();
     BitMap2800 bitMap2800 = Si994010Ctx.this.getBitMap2800();
     IdxGroup400 idxGroup400 = Si994010Ctx.this.getIdxGroup400();

	/**
	 *	Returns the value of bitMapByte1800
	 *	@return bitMapByte1800
	 */
   public char[] getBitMapByte1800() throws CFException  {              
   		return bitMap1800.getBitMapByte1800();
   }

  
	/**
	*  set variable bitMapByte1800
	*  @param value
	**/
   public void setBitMapByte1800(char[] value) throws CFException {
      bitMap1800.setBitMapByte1800(value);
   } 

     /**
	 * 	Update BitMapByte1800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte1800(char[] source, int sourceIndex) throws CFException {
      bitMap1800.setBitMapByte1800(source, sourceIndex);
   	
   }
   
   public void setBitMapByte1800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bitMap1800.setBitMapByte1800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitMapByte1800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte1800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte1800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitMapByte1800 with another Field
	 *	@param value
	 */
   public void setBitMapByte1800(Field source) {
      bitMap1800.setBitMapByte1800(source);
   }  
   
     /**
	 * 	Update BitMapByte1800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte1800(Field source, int sourceIndex,int sourceLen) {
      bitMap1800.setBitMapByte1800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitMapByte1800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte1800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte1800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sub800
	 *	@return sub800
	 */
	public short getSub800() throws CFException {        
   		return work.getSub800();
	}
	
	/**
	 * 	Update Sub800 with the passed value
	 *	@param number
	 */
	public void setSub800(short number)  throws CFException{
		work.setSub800(number);
	}

	public void setSub800(int number)  throws CFException{
		work.setSub800((short)number);
	}

	public void setSub800(long number)  throws CFException{
		work.setSub800((short)number);
	}



	/**
	 *	Returns the value of bitMapByte4800
	 *	@return bitMapByte4800
	 */
   public char[] getBitMapByte4800() throws CFException  {              
   		return bitMap1800.getBitMapByte4800();
   }

  
	/**
	*  set variable bitMapByte4800
	*  @param value
	**/
   public void setBitMapByte4800(char[] value) throws CFException {
      bitMap1800.setBitMapByte4800(value);
   } 

     /**
	 * 	Update BitMapByte4800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte4800(char[] source, int sourceIndex) throws CFException {
      bitMap1800.setBitMapByte4800(source, sourceIndex);
   	
   }
   
   public void setBitMapByte4800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bitMap1800.setBitMapByte4800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitMapByte4800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte4800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte4800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitMapByte4800 with another Field
	 *	@param value
	 */
   public void setBitMapByte4800(Field source) {
      bitMap1800.setBitMapByte4800(source);
   }  
   
     /**
	 * 	Update BitMapByte4800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte4800(Field source, int sourceIndex,int sourceLen) {
      bitMap1800.setBitMapByte4800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitMapByte4800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte4800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte4800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of idx400
	 *	@return idx400
	 */
	public short getIdx400() throws CFException {        
   		return idxGroup400.getIdx400();
	}
	
	/**
	 * 	Update Idx400 with the passed value
	 *	@param number
	 */
	public void setIdx400(short number)  throws CFException{
		idxGroup400.setIdx400(number);
	}

	public void setIdx400(int number)  throws CFException{
		idxGroup400.setIdx400((short)number);
	}

	public void setIdx400(long number)  throws CFException{
		idxGroup400.setIdx400((short)number);
	}



	/**
	 *	Returns the value of bitMapByte7800
	 *	@return bitMapByte7800
	 */
   public char[] getBitMapByte7800() throws CFException  {              
   		return bitMap1800.getBitMapByte7800();
   }

  
	/**
	*  set variable bitMapByte7800
	*  @param value
	**/
   public void setBitMapByte7800(char[] value) throws CFException {
      bitMap1800.setBitMapByte7800(value);
   } 

     /**
	 * 	Update BitMapByte7800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte7800(char[] source, int sourceIndex) throws CFException {
      bitMap1800.setBitMapByte7800(source, sourceIndex);
   	
   }
   
   public void setBitMapByte7800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bitMap1800.setBitMapByte7800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitMapByte7800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte7800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte7800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitMapByte7800 with another Field
	 *	@param value
	 */
   public void setBitMapByte7800(Field source) {
      bitMap1800.setBitMapByte7800(source);
   }  
   
     /**
	 * 	Update BitMapByte7800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte7800(Field source, int sourceIndex,int sourceLen) {
      bitMap1800.setBitMapByte7800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitMapByte7800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte7800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte7800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of dataGroup1000
	 *	@return dataGroup1000
	 */   
	 public DataGroup1000 getDataGroup1000() {
   	return dataGroup1000;
   }


	/**
	 *	Returns the value of bitMap2800
	 *	@return bitMap2800
	 */   
	 public BitMap2800 getBitMap2800() {
   	return bitMap2800;
   }


	/**
	 *	Returns the value of bitMapByte6800
	 *	@return bitMapByte6800
	 */
   public char[] getBitMapByte6800() throws CFException  {              
   		return bitMap1800.getBitMapByte6800();
   }

  
	/**
	*  set variable bitMapByte6800
	*  @param value
	**/
   public void setBitMapByte6800(char[] value) throws CFException {
      bitMap1800.setBitMapByte6800(value);
   } 

     /**
	 * 	Update BitMapByte6800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte6800(char[] source, int sourceIndex) throws CFException {
      bitMap1800.setBitMapByte6800(source, sourceIndex);
   	
   }
   
   public void setBitMapByte6800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bitMap1800.setBitMapByte6800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitMapByte6800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte6800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte6800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitMapByte6800 with another Field
	 *	@param value
	 */
   public void setBitMapByte6800(Field source) {
      bitMap1800.setBitMapByte6800(source);
   }  
   
     /**
	 * 	Update BitMapByte6800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte6800(Field source, int sourceIndex,int sourceLen) {
      bitMap1800.setBitMapByte6800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitMapByte6800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte6800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte6800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of data1000
	 *	@return data1000
	 */
   public char[] getData1000() throws CFException  {              
   		return dataGroup1000.getData1000();
   }

  
	/**
	*  set variable data1000
	*  @param value
	**/
   public void setData1000(char[] value) throws CFException {
      dataGroup1000.setData1000(value);
   } 

     /**
	 * 	Update Data1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setData1000(char[] source, int sourceIndex) throws CFException {
      dataGroup1000.setData1000(source, sourceIndex);
   	
   }
   
   public void setData1000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Data1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setData1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Data1000 with another Field
	 *	@param value
	 */
   public void setData1000(Field source) {
      dataGroup1000.setData1000(source);
   }  
   
     /**
	 * 	Update Data1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setData1000(Field source, int sourceIndex,int sourceLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Data1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setData1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of binary8300
	 *	@return binary8300
	 */
	public short getBinary8300() throws CFException {        
   		return work.getBinary8300();
	}
	
	/**
	 * 	Update Binary8300 with the passed value
	 *	@param number
	 */
	public void setBinary8300(short number)  throws CFException{
		work.setBinary8300(number);
	}

	public void setBinary8300(int number)  throws CFException{
		work.setBinary8300((short)number);
	}

	public void setBinary8300(long number)  throws CFException{
		work.setBinary8300((short)number);
	}



	/**
	 *	Returns the value of parsingPattern500
	 *	@return parsingPattern500
	 */
   public char[] getParsingPattern500(int index) throws CFException  {              
   		return parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(index);
   }

  
	/**
	*  set variable parsingPattern500
	*  @param value
	**/
   public void setParsingPattern500(int index,char[] value) throws CFException {
      parsingPatternValuesGroup500.getParsingPatternValues500Redefined().setParsingPattern500((index),value);
   } 

	/**
	 *	Returns the value of bitMapByte3800
	 *	@return bitMapByte3800
	 */
   public char[] getBitMapByte3800() throws CFException  {              
   		return bitMap1800.getBitMapByte3800();
   }

  
	/**
	*  set variable bitMapByte3800
	*  @param value
	**/
   public void setBitMapByte3800(char[] value) throws CFException {
      bitMap1800.setBitMapByte3800(value);
   } 

     /**
	 * 	Update BitMapByte3800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte3800(char[] source, int sourceIndex) throws CFException {
      bitMap1800.setBitMapByte3800(source, sourceIndex);
   	
   }
   
   public void setBitMapByte3800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bitMap1800.setBitMapByte3800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitMapByte3800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte3800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte3800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitMapByte3800 with another Field
	 *	@param value
	 */
   public void setBitMapByte3800(Field source) {
      bitMap1800.setBitMapByte3800(source);
   }  
   
     /**
	 * 	Update BitMapByte3800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte3800(Field source, int sourceIndex,int sourceLen) {
      bitMap1800.setBitMapByte3800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitMapByte3800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte3800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte3800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bitMapByte8800
	 *	@return bitMapByte8800
	 */
   public char[] getBitMapByte8800() throws CFException  {              
   		return bitMap1800.getBitMapByte8800();
   }

  
	/**
	*  set variable bitMapByte8800
	*  @param value
	**/
   public void setBitMapByte8800(char[] value) throws CFException {
      bitMap1800.setBitMapByte8800(value);
   } 

     /**
	 * 	Update BitMapByte8800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte8800(char[] source, int sourceIndex) throws CFException {
      bitMap1800.setBitMapByte8800(source, sourceIndex);
   	
   }
   
   public void setBitMapByte8800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bitMap1800.setBitMapByte8800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitMapByte8800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte8800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte8800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitMapByte8800 with another Field
	 *	@param value
	 */
   public void setBitMapByte8800(Field source) {
      bitMap1800.setBitMapByte8800(source);
   }  
   
     /**
	 * 	Update BitMapByte8800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte8800(Field source, int sourceIndex,int sourceLen) {
      bitMap1800.setBitMapByte8800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitMapByte8800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte8800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte8800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of elementTable800
	 *	@return elementTable800
	 */   
	 public ElementTable800 getElementTable800() {
   	return elementTable800;
   }


	/**
	 *	Returns the value of bitMapByte5800
	 *	@return bitMapByte5800
	 */
   public char[] getBitMapByte5800() throws CFException  {              
   		return bitMap1800.getBitMapByte5800();
   }

  
	/**
	*  set variable bitMapByte5800
	*  @param value
	**/
   public void setBitMapByte5800(char[] value) throws CFException {
      bitMap1800.setBitMapByte5800(value);
   } 

     /**
	 * 	Update BitMapByte5800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte5800(char[] source, int sourceIndex) throws CFException {
      bitMap1800.setBitMapByte5800(source, sourceIndex);
   	
   }
   
   public void setBitMapByte5800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bitMap1800.setBitMapByte5800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitMapByte5800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte5800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte5800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitMapByte5800 with another Field
	 *	@param value
	 */
   public void setBitMapByte5800(Field source) {
      bitMap1800.setBitMapByte5800(source);
   }  
   
     /**
	 * 	Update BitMapByte5800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte5800(Field source, int sourceIndex,int sourceLen) {
      bitMap1800.setBitMapByte5800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitMapByte5800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte5800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte5800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bitMapByte2800
	 *	@return bitMapByte2800
	 */
   public char[] getBitMapByte2800() throws CFException  {              
   		return bitMap1800.getBitMapByte2800();
   }

  
	/**
	*  set variable bitMapByte2800
	*  @param value
	**/
   public void setBitMapByte2800(char[] value) throws CFException {
      bitMap1800.setBitMapByte2800(value);
   } 

     /**
	 * 	Update BitMapByte2800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte2800(char[] source, int sourceIndex) throws CFException {
      bitMap1800.setBitMapByte2800(source, sourceIndex);
   	
   }
   
   public void setBitMapByte2800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bitMap1800.setBitMapByte2800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitMapByte2800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte2800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte2800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitMapByte2800 with another Field
	 *	@param value
	 */
   public void setBitMapByte2800(Field source) {
      bitMap1800.setBitMapByte2800(source);
   }  
   
     /**
	 * 	Update BitMapByte2800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte2800(Field source, int sourceIndex,int sourceLen) {
      bitMap1800.setBitMapByte2800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitMapByte2800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte2800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte2800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of charX300
	 *	@return charX300
	 */
   public char[] getCharX300() throws CFException  {              
   		return work.getCharX300();
   }

  
	/**
	*  set variable charX300
	*  @param value
	**/
   public void setCharX300(char[] value) throws CFException {
      work.setCharX300(value);
   } 


        public Si994010Ctx getSi994010Ctx() {
            return Si994010Ctx.this;
        }

        public ExpandTheBitMapOutCtx getExpandTheBitMapOutCtx() {
            return new ExpandTheBitMapOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += bitMap1800.hashCode();
        str += parsingPatternValuesGroup500.hashCode();
        str += work.hashCode();
        str += dataGroup1000.hashCode();
        str += elementTable800.hashCode();
        str += bitMap2800.hashCode();
        str += idxGroup400.hashCode();
       return str.hashCode();
    }

    public ExpandTheBitMapInCtx clone() {
        ExpandTheBitMapInCtx cloneObj = new ExpandTheBitMapInCtx();
        cloneObj.bitMap1800 = new BitMap1800();
        cloneObj.bitMap1800.set(bitMap1800.getClonedField());
        cloneObj.parsingPatternValuesGroup500 = new ParsingPatternValuesGroup500();
        cloneObj.parsingPatternValuesGroup500.set(parsingPatternValuesGroup500.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.dataGroup1000 = new DataGroup1000();
        cloneObj.dataGroup1000.set(dataGroup1000.getClonedField());
        cloneObj.elementTable800 = new ElementTable800();
        cloneObj.elementTable800.set(elementTable800.getClonedField());
        cloneObj.bitMap2800 = new BitMap2800();
        cloneObj.bitMap2800.set(bitMap2800.getClonedField());
        cloneObj.idxGroup400 = new IdxGroup400();
        cloneObj.idxGroup400.set(idxGroup400.getClonedField());
        return cloneObj;
    }

    }

    public ExpandTheBitMapInCtx getExpandTheBitMapInCtx() {
            return new ExpandTheBitMapInCtx();
    }
     public class ExpandTheBitMapOutCtx implements Cloneable {
     BitMap1800 bitMap1800 = Si994010Ctx.this.getBitMap1800();
     ParsingPatternValuesGroup500 parsingPatternValuesGroup500 = Si994010Ctx.this.getParsingPatternValuesGroup500();
     Work work = Si994010Ctx.this.getWork();
     ElementTable800 elementTable800 = Si994010Ctx.this.getElementTable800();
     DataGroup1000 dataGroup1000 = Si994010Ctx.this.getDataGroup1000();
     BitMap2800 bitMap2800 = Si994010Ctx.this.getBitMap2800();
     IdxGroup400 idxGroup400 = Si994010Ctx.this.getIdxGroup400();

	/**
	 *	Returns the value of bitMapByte1800
	 *	@return bitMapByte1800
	 */
   public char[] getBitMapByte1800() throws CFException  {              
   		return bitMap1800.getBitMapByte1800();
   }

  
	/**
	*  set variable bitMapByte1800
	*  @param value
	**/
   public void setBitMapByte1800(char[] value) throws CFException {
      bitMap1800.setBitMapByte1800(value);
   } 

     /**
	 * 	Update BitMapByte1800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte1800(char[] source, int sourceIndex) throws CFException {
      bitMap1800.setBitMapByte1800(source, sourceIndex);
   	
   }
   
   public void setBitMapByte1800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bitMap1800.setBitMapByte1800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitMapByte1800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte1800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte1800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitMapByte1800 with another Field
	 *	@param value
	 */
   public void setBitMapByte1800(Field source) {
      bitMap1800.setBitMapByte1800(source);
   }  
   
     /**
	 * 	Update BitMapByte1800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte1800(Field source, int sourceIndex,int sourceLen) {
      bitMap1800.setBitMapByte1800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitMapByte1800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte1800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte1800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sub800
	 *	@return sub800
	 */
	public short getSub800() throws CFException {        
   		return work.getSub800();
	}
	
	/**
	 * 	Update Sub800 with the passed value
	 *	@param number
	 */
	public void setSub800(short number)  throws CFException{
		work.setSub800(number);
	}

	public void setSub800(int number)  throws CFException{
		work.setSub800((short)number);
	}

	public void setSub800(long number)  throws CFException{
		work.setSub800((short)number);
	}




public void setIdx500(int idx500) { 
    Si994010Ctx.this.idx500 = idx500;
}

public int getIdx500() { 
    return Si994010Ctx.this.idx500;
}
	/**
	 *	Returns the value of bitMapByte4800
	 *	@return bitMapByte4800
	 */
   public char[] getBitMapByte4800() throws CFException  {              
   		return bitMap1800.getBitMapByte4800();
   }

  
	/**
	*  set variable bitMapByte4800
	*  @param value
	**/
   public void setBitMapByte4800(char[] value) throws CFException {
      bitMap1800.setBitMapByte4800(value);
   } 

     /**
	 * 	Update BitMapByte4800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte4800(char[] source, int sourceIndex) throws CFException {
      bitMap1800.setBitMapByte4800(source, sourceIndex);
   	
   }
   
   public void setBitMapByte4800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bitMap1800.setBitMapByte4800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitMapByte4800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte4800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte4800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitMapByte4800 with another Field
	 *	@param value
	 */
   public void setBitMapByte4800(Field source) {
      bitMap1800.setBitMapByte4800(source);
   }  
   
     /**
	 * 	Update BitMapByte4800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte4800(Field source, int sourceIndex,int sourceLen) {
      bitMap1800.setBitMapByte4800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitMapByte4800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte4800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte4800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bitMapByte7800
	 *	@return bitMapByte7800
	 */
   public char[] getBitMapByte7800() throws CFException  {              
   		return bitMap1800.getBitMapByte7800();
   }

  
	/**
	*  set variable bitMapByte7800
	*  @param value
	**/
   public void setBitMapByte7800(char[] value) throws CFException {
      bitMap1800.setBitMapByte7800(value);
   } 

     /**
	 * 	Update BitMapByte7800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte7800(char[] source, int sourceIndex) throws CFException {
      bitMap1800.setBitMapByte7800(source, sourceIndex);
   	
   }
   
   public void setBitMapByte7800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bitMap1800.setBitMapByte7800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitMapByte7800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte7800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte7800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitMapByte7800 with another Field
	 *	@param value
	 */
   public void setBitMapByte7800(Field source) {
      bitMap1800.setBitMapByte7800(source);
   }  
   
     /**
	 * 	Update BitMapByte7800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte7800(Field source, int sourceIndex,int sourceLen) {
      bitMap1800.setBitMapByte7800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitMapByte7800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte7800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte7800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of element800
	 *	@return element800
	 */
   public char[] getElement800(int index) throws CFException  {              
   		return elementTable800.getElement800(index);
   }

  
	/**
	*  set variable element800
	*  @param value
	**/
   public void setElement800(int index,char[] value) throws CFException {
      elementTable800.setElement800((index),value);
   } 

	/**
	 *	Returns the value of bitMap2800
	 *	@return bitMap2800
	 */   
	 public BitMap2800 getBitMap2800() {
   	return bitMap2800;
   }


	/**
	 *	Returns the value of bitMapByte9800
	 *	@return bitMapByte9800
	 */
   public char[] getBitMapByte9800() throws CFException  {              
   		return bitMap2800.getBitMapByte9800();
   }

  
	/**
	*  set variable bitMapByte9800
	*  @param value
	**/
   public void setBitMapByte9800(char[] value) throws CFException {
      bitMap2800.setBitMapByte9800(value);
   } 

     /**
	 * 	Update BitMapByte9800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte9800(char[] source, int sourceIndex) throws CFException {
      bitMap2800.setBitMapByte9800(source, sourceIndex);
   	
   }
   
   public void setBitMapByte9800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bitMap2800.setBitMapByte9800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitMapByte9800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte9800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap2800.setBitMapByte9800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitMapByte9800 with another Field
	 *	@param value
	 */
   public void setBitMapByte9800(Field source) {
      bitMap2800.setBitMapByte9800(source);
   }  
   
     /**
	 * 	Update BitMapByte9800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte9800(Field source, int sourceIndex,int sourceLen) {
      bitMap2800.setBitMapByte9800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitMapByte9800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte9800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap2800.setBitMapByte9800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bitMapByte11800
	 *	@return bitMapByte11800
	 */
   public char[] getBitMapByte11800() throws CFException  {              
   		return bitMap2800.getBitMapByte11800();
   }

  
	/**
	*  set variable bitMapByte11800
	*  @param value
	**/
   public void setBitMapByte11800(char[] value) throws CFException {
      bitMap2800.setBitMapByte11800(value);
   } 

     /**
	 * 	Update BitMapByte11800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte11800(char[] source, int sourceIndex) throws CFException {
      bitMap2800.setBitMapByte11800(source, sourceIndex);
   	
   }
   
   public void setBitMapByte11800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bitMap2800.setBitMapByte11800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitMapByte11800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte11800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap2800.setBitMapByte11800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitMapByte11800 with another Field
	 *	@param value
	 */
   public void setBitMapByte11800(Field source) {
      bitMap2800.setBitMapByte11800(source);
   }  
   
     /**
	 * 	Update BitMapByte11800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte11800(Field source, int sourceIndex,int sourceLen) {
      bitMap2800.setBitMapByte11800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitMapByte11800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte11800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap2800.setBitMapByte11800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bitMapByte6800
	 *	@return bitMapByte6800
	 */
   public char[] getBitMapByte6800() throws CFException  {              
   		return bitMap1800.getBitMapByte6800();
   }

  
	/**
	*  set variable bitMapByte6800
	*  @param value
	**/
   public void setBitMapByte6800(char[] value) throws CFException {
      bitMap1800.setBitMapByte6800(value);
   } 

     /**
	 * 	Update BitMapByte6800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte6800(char[] source, int sourceIndex) throws CFException {
      bitMap1800.setBitMapByte6800(source, sourceIndex);
   	
   }
   
   public void setBitMapByte6800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bitMap1800.setBitMapByte6800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitMapByte6800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte6800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte6800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitMapByte6800 with another Field
	 *	@param value
	 */
   public void setBitMapByte6800(Field source) {
      bitMap1800.setBitMapByte6800(source);
   }  
   
     /**
	 * 	Update BitMapByte6800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte6800(Field source, int sourceIndex,int sourceLen) {
      bitMap1800.setBitMapByte6800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitMapByte6800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte6800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte6800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of data1000
	 *	@return data1000
	 */
   public char[] getData1000() throws CFException  {              
   		return dataGroup1000.getData1000();
   }

  
	/**
	*  set variable data1000
	*  @param value
	**/
   public void setData1000(char[] value) throws CFException {
      dataGroup1000.setData1000(value);
   } 

     /**
	 * 	Update Data1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setData1000(char[] source, int sourceIndex) throws CFException {
      dataGroup1000.setData1000(source, sourceIndex);
   	
   }
   
   public void setData1000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Data1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setData1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Data1000 with another Field
	 *	@param value
	 */
   public void setData1000(Field source) {
      dataGroup1000.setData1000(source);
   }  
   
     /**
	 * 	Update Data1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setData1000(Field source, int sourceIndex,int sourceLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Data1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setData1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dataGroup1000.setData1000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of parsingPattern500
	 *	@return parsingPattern500
	 */
   public char[] getParsingPattern500(int index) throws CFException  {              
   		return parsingPatternValuesGroup500.getParsingPatternValues500Redefined().getParsingPattern500(index);
   }

  
	/**
	*  set variable parsingPattern500
	*  @param value
	**/
   public void setParsingPattern500(int index,char[] value) throws CFException {
      parsingPatternValuesGroup500.getParsingPatternValues500Redefined().setParsingPattern500((index),value);
   } 

	/**
	 *	Returns the value of idxX400
	 *	@return idxX400
	 */
   public char[] getIdxX400() throws CFException  {              
   		return idxGroup400.getIdx400Redefined().getIdxX400();
   }

  
	/**
	*  set variable idxX400
	*  @param value
	**/
   public void setIdxX400(char[] value) throws CFException {
      idxGroup400.getIdx400Redefined().setIdxX400(value);
   } 

     /**
	 * 	Update IdxX400 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIdxX400(char[] source, int sourceIndex) throws CFException {
      idxGroup400.getIdx400Redefined().setIdxX400(source, sourceIndex);
   	
   }
   
   public void setIdxX400(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      idxGroup400.getIdx400Redefined().setIdxX400(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IdxX400 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIdxX400(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      idxGroup400.getIdx400Redefined().setIdxX400(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IdxX400 with another Field
	 *	@param value
	 */
   public void setIdxX400(Field source) {
      idxGroup400.getIdx400Redefined().setIdxX400(source);
   }  
   
     /**
	 * 	Update IdxX400 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIdxX400(Field source, int sourceIndex,int sourceLen) {
      idxGroup400.getIdx400Redefined().setIdxX400(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IdxX400 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIdxX400(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      idxGroup400.getIdx400Redefined().setIdxX400(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bitMapByte3800
	 *	@return bitMapByte3800
	 */
   public char[] getBitMapByte3800() throws CFException  {              
   		return bitMap1800.getBitMapByte3800();
   }

  
	/**
	*  set variable bitMapByte3800
	*  @param value
	**/
   public void setBitMapByte3800(char[] value) throws CFException {
      bitMap1800.setBitMapByte3800(value);
   } 

     /**
	 * 	Update BitMapByte3800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte3800(char[] source, int sourceIndex) throws CFException {
      bitMap1800.setBitMapByte3800(source, sourceIndex);
   	
   }
   
   public void setBitMapByte3800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bitMap1800.setBitMapByte3800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitMapByte3800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte3800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte3800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitMapByte3800 with another Field
	 *	@param value
	 */
   public void setBitMapByte3800(Field source) {
      bitMap1800.setBitMapByte3800(source);
   }  
   
     /**
	 * 	Update BitMapByte3800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte3800(Field source, int sourceIndex,int sourceLen) {
      bitMap1800.setBitMapByte3800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitMapByte3800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte3800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte3800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bitMapByte8800
	 *	@return bitMapByte8800
	 */
   public char[] getBitMapByte8800() throws CFException  {              
   		return bitMap1800.getBitMapByte8800();
   }

  
	/**
	*  set variable bitMapByte8800
	*  @param value
	**/
   public void setBitMapByte8800(char[] value) throws CFException {
      bitMap1800.setBitMapByte8800(value);
   } 

     /**
	 * 	Update BitMapByte8800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte8800(char[] source, int sourceIndex) throws CFException {
      bitMap1800.setBitMapByte8800(source, sourceIndex);
   	
   }
   
   public void setBitMapByte8800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bitMap1800.setBitMapByte8800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitMapByte8800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte8800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte8800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitMapByte8800 with another Field
	 *	@param value
	 */
   public void setBitMapByte8800(Field source) {
      bitMap1800.setBitMapByte8800(source);
   }  
   
     /**
	 * 	Update BitMapByte8800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte8800(Field source, int sourceIndex,int sourceLen) {
      bitMap1800.setBitMapByte8800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitMapByte8800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte8800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte8800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bitMapByte14800
	 *	@return bitMapByte14800
	 */
   public char[] getBitMapByte14800() throws CFException  {              
   		return bitMap2800.getBitMapByte14800();
   }

  
	/**
	*  set variable bitMapByte14800
	*  @param value
	**/
   public void setBitMapByte14800(char[] value) throws CFException {
      bitMap2800.setBitMapByte14800(value);
   } 

     /**
	 * 	Update BitMapByte14800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte14800(char[] source, int sourceIndex) throws CFException {
      bitMap2800.setBitMapByte14800(source, sourceIndex);
   	
   }
   
   public void setBitMapByte14800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bitMap2800.setBitMapByte14800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitMapByte14800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte14800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap2800.setBitMapByte14800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitMapByte14800 with another Field
	 *	@param value
	 */
   public void setBitMapByte14800(Field source) {
      bitMap2800.setBitMapByte14800(source);
   }  
   
     /**
	 * 	Update BitMapByte14800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte14800(Field source, int sourceIndex,int sourceLen) {
      bitMap2800.setBitMapByte14800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitMapByte14800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte14800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap2800.setBitMapByte14800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of elementTable800
	 *	@return elementTable800
	 */   
	 public ElementTable800 getElementTable800() {
   	return elementTable800;
   }


	/**
	 *	Returns the value of bitMapByte5800
	 *	@return bitMapByte5800
	 */
   public char[] getBitMapByte5800() throws CFException  {              
   		return bitMap1800.getBitMapByte5800();
   }

  
	/**
	*  set variable bitMapByte5800
	*  @param value
	**/
   public void setBitMapByte5800(char[] value) throws CFException {
      bitMap1800.setBitMapByte5800(value);
   } 

     /**
	 * 	Update BitMapByte5800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte5800(char[] source, int sourceIndex) throws CFException {
      bitMap1800.setBitMapByte5800(source, sourceIndex);
   	
   }
   
   public void setBitMapByte5800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bitMap1800.setBitMapByte5800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitMapByte5800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte5800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte5800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitMapByte5800 with another Field
	 *	@param value
	 */
   public void setBitMapByte5800(Field source) {
      bitMap1800.setBitMapByte5800(source);
   }  
   
     /**
	 * 	Update BitMapByte5800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte5800(Field source, int sourceIndex,int sourceLen) {
      bitMap1800.setBitMapByte5800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitMapByte5800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte5800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte5800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bitMapByte12800
	 *	@return bitMapByte12800
	 */
   public char[] getBitMapByte12800() throws CFException  {              
   		return bitMap2800.getBitMapByte12800();
   }

  
	/**
	*  set variable bitMapByte12800
	*  @param value
	**/
   public void setBitMapByte12800(char[] value) throws CFException {
      bitMap2800.setBitMapByte12800(value);
   } 

     /**
	 * 	Update BitMapByte12800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte12800(char[] source, int sourceIndex) throws CFException {
      bitMap2800.setBitMapByte12800(source, sourceIndex);
   	
   }
   
   public void setBitMapByte12800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bitMap2800.setBitMapByte12800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitMapByte12800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte12800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap2800.setBitMapByte12800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitMapByte12800 with another Field
	 *	@param value
	 */
   public void setBitMapByte12800(Field source) {
      bitMap2800.setBitMapByte12800(source);
   }  
   
     /**
	 * 	Update BitMapByte12800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte12800(Field source, int sourceIndex,int sourceLen) {
      bitMap2800.setBitMapByte12800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitMapByte12800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte12800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap2800.setBitMapByte12800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bitMapByte15800
	 *	@return bitMapByte15800
	 */
   public char[] getBitMapByte15800() throws CFException  {              
   		return bitMap2800.getBitMapByte15800();
   }

  
	/**
	*  set variable bitMapByte15800
	*  @param value
	**/
   public void setBitMapByte15800(char[] value) throws CFException {
      bitMap2800.setBitMapByte15800(value);
   } 

     /**
	 * 	Update BitMapByte15800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte15800(char[] source, int sourceIndex) throws CFException {
      bitMap2800.setBitMapByte15800(source, sourceIndex);
   	
   }
   
   public void setBitMapByte15800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bitMap2800.setBitMapByte15800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitMapByte15800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte15800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap2800.setBitMapByte15800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitMapByte15800 with another Field
	 *	@param value
	 */
   public void setBitMapByte15800(Field source) {
      bitMap2800.setBitMapByte15800(source);
   }  
   
     /**
	 * 	Update BitMapByte15800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte15800(Field source, int sourceIndex,int sourceLen) {
      bitMap2800.setBitMapByte15800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitMapByte15800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte15800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap2800.setBitMapByte15800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bitMapByte2800
	 *	@return bitMapByte2800
	 */
   public char[] getBitMapByte2800() throws CFException  {              
   		return bitMap1800.getBitMapByte2800();
   }

  
	/**
	*  set variable bitMapByte2800
	*  @param value
	**/
   public void setBitMapByte2800(char[] value) throws CFException {
      bitMap1800.setBitMapByte2800(value);
   } 

     /**
	 * 	Update BitMapByte2800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte2800(char[] source, int sourceIndex) throws CFException {
      bitMap1800.setBitMapByte2800(source, sourceIndex);
   	
   }
   
   public void setBitMapByte2800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bitMap1800.setBitMapByte2800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitMapByte2800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte2800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte2800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitMapByte2800 with another Field
	 *	@param value
	 */
   public void setBitMapByte2800(Field source) {
      bitMap1800.setBitMapByte2800(source);
   }  
   
     /**
	 * 	Update BitMapByte2800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte2800(Field source, int sourceIndex,int sourceLen) {
      bitMap1800.setBitMapByte2800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitMapByte2800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte2800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap1800.setBitMapByte2800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bitMapByte10800
	 *	@return bitMapByte10800
	 */
   public char[] getBitMapByte10800() throws CFException  {              
   		return bitMap2800.getBitMapByte10800();
   }

  
	/**
	*  set variable bitMapByte10800
	*  @param value
	**/
   public void setBitMapByte10800(char[] value) throws CFException {
      bitMap2800.setBitMapByte10800(value);
   } 

     /**
	 * 	Update BitMapByte10800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte10800(char[] source, int sourceIndex) throws CFException {
      bitMap2800.setBitMapByte10800(source, sourceIndex);
   	
   }
   
   public void setBitMapByte10800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bitMap2800.setBitMapByte10800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitMapByte10800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte10800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap2800.setBitMapByte10800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitMapByte10800 with another Field
	 *	@param value
	 */
   public void setBitMapByte10800(Field source) {
      bitMap2800.setBitMapByte10800(source);
   }  
   
     /**
	 * 	Update BitMapByte10800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte10800(Field source, int sourceIndex,int sourceLen) {
      bitMap2800.setBitMapByte10800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitMapByte10800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte10800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap2800.setBitMapByte10800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bitMapByte16800
	 *	@return bitMapByte16800
	 */
   public char[] getBitMapByte16800() throws CFException  {              
   		return bitMap2800.getBitMapByte16800();
   }

  
	/**
	*  set variable bitMapByte16800
	*  @param value
	**/
   public void setBitMapByte16800(char[] value) throws CFException {
      bitMap2800.setBitMapByte16800(value);
   } 

     /**
	 * 	Update BitMapByte16800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte16800(char[] source, int sourceIndex) throws CFException {
      bitMap2800.setBitMapByte16800(source, sourceIndex);
   	
   }
   
   public void setBitMapByte16800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bitMap2800.setBitMapByte16800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitMapByte16800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte16800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap2800.setBitMapByte16800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitMapByte16800 with another Field
	 *	@param value
	 */
   public void setBitMapByte16800(Field source) {
      bitMap2800.setBitMapByte16800(source);
   }  
   
     /**
	 * 	Update BitMapByte16800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte16800(Field source, int sourceIndex,int sourceLen) {
      bitMap2800.setBitMapByte16800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitMapByte16800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte16800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap2800.setBitMapByte16800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bitMapByte13800
	 *	@return bitMapByte13800
	 */
   public char[] getBitMapByte13800() throws CFException  {              
   		return bitMap2800.getBitMapByte13800();
   }

  
	/**
	*  set variable bitMapByte13800
	*  @param value
	**/
   public void setBitMapByte13800(char[] value) throws CFException {
      bitMap2800.setBitMapByte13800(value);
   } 

     /**
	 * 	Update BitMapByte13800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitMapByte13800(char[] source, int sourceIndex) throws CFException {
      bitMap2800.setBitMapByte13800(source, sourceIndex);
   	
   }
   
   public void setBitMapByte13800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      bitMap2800.setBitMapByte13800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitMapByte13800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte13800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap2800.setBitMapByte13800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitMapByte13800 with another Field
	 *	@param value
	 */
   public void setBitMapByte13800(Field source) {
      bitMap2800.setBitMapByte13800(source);
   }  
   
     /**
	 * 	Update BitMapByte13800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitMapByte13800(Field source, int sourceIndex,int sourceLen) {
      bitMap2800.setBitMapByte13800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitMapByte13800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitMapByte13800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      bitMap2800.setBitMapByte13800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Si994010Ctx getSi994010Ctx() {
            return Si994010Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += bitMap1800.hashCode();
        str += parsingPatternValuesGroup500.hashCode();
        str += work.hashCode();
        str += elementTable800.hashCode();
        str += dataGroup1000.hashCode();
        str += bitMap2800.hashCode();
        str += idxGroup400.hashCode();
       return str.hashCode();
    }

    public ExpandTheBitMapOutCtx clone() {
        ExpandTheBitMapOutCtx cloneObj = new ExpandTheBitMapOutCtx();
        cloneObj.bitMap1800 = new BitMap1800();
        cloneObj.bitMap1800.set(bitMap1800.getClonedField());
        cloneObj.parsingPatternValuesGroup500 = new ParsingPatternValuesGroup500();
        cloneObj.parsingPatternValuesGroup500.set(parsingPatternValuesGroup500.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.elementTable800 = new ElementTable800();
        cloneObj.elementTable800.set(elementTable800.getClonedField());
        cloneObj.dataGroup1000 = new DataGroup1000();
        cloneObj.dataGroup1000.set(dataGroup1000.getClonedField());
        cloneObj.bitMap2800 = new BitMap2800();
        cloneObj.bitMap2800.set(bitMap2800.getClonedField());
        cloneObj.idxGroup400 = new IdxGroup400();
        cloneObj.idxGroup400.set(idxGroup400.getClonedField());
        return cloneObj;
    }

    }

    public ExpandTheBitMapOutCtx getExpandTheBitMapOutCtx() {
            return new ExpandTheBitMapOutCtx();
    }
}
