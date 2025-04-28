package com.cloudframe.app.sf910020;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.sf910020.dto.IdxGroup800;
import com.cloudframe.app.sf910020.dto.Dfhcommarea;
import com.cloudframe.app.sf910020.dto.Work;
import com.cloudframe.app.sf910020.dto.ParsingPatternValuesGroup500;


@Context
public class Sf910020Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Dfhcommarea dfhcommarea;
    Work work;
    ParsingPatternValuesGroup500 parsingPatternValuesGroup500;
    IdxGroup800 idxGroup800;

    int idx500;

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


    public Dfhcommarea getDfhcommarea() {
        if (dfhcommarea == null) {
            dfhcommarea = new Dfhcommarea();
        }

        return dfhcommarea;
    }

    public void setDfhcommarea(Dfhcommarea dfhcommarea) {
        this.dfhcommarea = dfhcommarea;
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
    public ParsingPatternValuesGroup500 getParsingPatternValuesGroup500() {
        if (parsingPatternValuesGroup500 == null) {
            parsingPatternValuesGroup500 = new ParsingPatternValuesGroup500();
        }

        return parsingPatternValuesGroup500;
    }

    public void setParsingPatternValuesGroup500(ParsingPatternValuesGroup500 parsingPatternValuesGroup500) {
        this.parsingPatternValuesGroup500 = parsingPatternValuesGroup500;
    }
    public IdxGroup800 getIdxGroup800() {
        if (idxGroup800 == null) {
            idxGroup800 = new IdxGroup800();
        }

        return idxGroup800;
    }

    public void setIdxGroup800(IdxGroup800 idxGroup800) {
        this.idxGroup800 = idxGroup800;
    }

    public int getIdx500() {
        return idx500;
    }

    public void setIdx500(int idx500) {
        this.idx500 = idx500;
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
        str += work.hashCode();
        str += parsingPatternValuesGroup500.hashCode();
        str += idxGroup800.hashCode();
       return str.hashCode();
    }

    public Sf910020Ctx clone() {
        Sf910020Ctx cloneObj = new Sf910020Ctx();
        cloneObj.dfhcommarea = new Dfhcommarea();
        cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.parsingPatternValuesGroup500 = new ParsingPatternValuesGroup500();
        cloneObj.parsingPatternValuesGroup500.set(parsingPatternValuesGroup500.getClonedField());
        cloneObj.idxGroup800 = new IdxGroup800();
        cloneObj.idxGroup800.set(idxGroup800.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Dfhcommarea dfhcommarea = Sf910020Ctx.this.getDfhcommarea();


        public Sf910020Ctx getSf910020Ctx() {
            return Sf910020Ctx.this;
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
     public class InitializeProgramOutCtx implements Cloneable {
     IdxGroup800 idxGroup800 = Sf910020Ctx.this.getIdxGroup800();

	/**
	 *	Returns the value of idxX800
	 *	@return idxX800
	 */
   public char[] getIdxX800() throws CFException  {              
   		return idxGroup800.getIdx800Redefined().getIdxX800();
   }

  
	/**
	*  set variable idxX800
	*  @param value
	**/
   public void setIdxX800(char[] value) throws CFException {
      idxGroup800.getIdx800Redefined().setIdxX800(value);
   } 

     /**
	 * 	Update IdxX800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIdxX800(char[] source, int sourceIndex) throws CFException {
      idxGroup800.getIdx800Redefined().setIdxX800(source, sourceIndex);
   	
   }
   
   public void setIdxX800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      idxGroup800.getIdx800Redefined().setIdxX800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IdxX800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIdxX800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      idxGroup800.getIdx800Redefined().setIdxX800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IdxX800 with another Field
	 *	@param value
	 */
   public void setIdxX800(Field source) {
      idxGroup800.getIdx800Redefined().setIdxX800(source);
   }  
   
     /**
	 * 	Update IdxX800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIdxX800(Field source, int sourceIndex,int sourceLen) {
      idxGroup800.getIdx800Redefined().setIdxX800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IdxX800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIdxX800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      idxGroup800.getIdx800Redefined().setIdxX800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf910020Ctx getSf910020Ctx() {
            return Sf910020Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += idxGroup800.hashCode();
       return str.hashCode();
    }

    public InitializeProgramOutCtx clone() {
        InitializeProgramOutCtx cloneObj = new InitializeProgramOutCtx();
        cloneObj.idxGroup800 = new IdxGroup800();
        cloneObj.idxGroup800.set(idxGroup800.getClonedField());
        return cloneObj;
    }

    }

    public InitializeProgramOutCtx getInitializeProgramOutCtx() {
            return new InitializeProgramOutCtx();
    }
     public class ConvertBitsToBytesInCtx implements Cloneable {
     Dfhcommarea dfhcommarea = Sf910020Ctx.this.getDfhcommarea();
     Work work = Sf910020Ctx.this.getWork();
     IdxGroup800 idxGroup800 = Sf910020Ctx.this.getIdxGroup800();
     ParsingPatternValuesGroup500 parsingPatternValuesGroup500 = Sf910020Ctx.this.getParsingPatternValuesGroup500();

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
	 *	Returns the value of bitValue32000
	 *	@return bitValue32000
	 */
   public char[] getBitValue32000() throws CFException  {              
   		return dfhcommarea.getBitValue32000();
   }

  
	/**
	*  set variable bitValue32000
	*  @param value
	**/
   public void setBitValue32000(char[] value) throws CFException {
      dfhcommarea.setBitValue32000(value);
   } 

     /**
	 * 	Update BitValue32000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitValue32000(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setBitValue32000(source, sourceIndex);
   	
   }
   
   public void setBitValue32000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setBitValue32000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitValue32000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitValue32000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue32000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitValue32000 with another Field
	 *	@param value
	 */
   public void setBitValue32000(Field source) {
      dfhcommarea.setBitValue32000(source);
   }  
   
     /**
	 * 	Update BitValue32000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitValue32000(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setBitValue32000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitValue32000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitValue32000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue32000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bitValue02000
	 *	@return bitValue02000
	 */
   public char[] getBitValue02000() throws CFException  {              
   		return dfhcommarea.getBitValue02000();
   }

  
	/**
	*  set variable bitValue02000
	*  @param value
	**/
   public void setBitValue02000(char[] value) throws CFException {
      dfhcommarea.setBitValue02000(value);
   } 

     /**
	 * 	Update BitValue02000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitValue02000(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setBitValue02000(source, sourceIndex);
   	
   }
   
   public void setBitValue02000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setBitValue02000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitValue02000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitValue02000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue02000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitValue02000 with another Field
	 *	@param value
	 */
   public void setBitValue02000(Field source) {
      dfhcommarea.setBitValue02000(source);
   }  
   
     /**
	 * 	Update BitValue02000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitValue02000(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setBitValue02000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitValue02000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitValue02000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue02000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bitValue52000
	 *	@return bitValue52000
	 */
   public char[] getBitValue52000() throws CFException  {              
   		return dfhcommarea.getBitValue52000();
   }

  
	/**
	*  set variable bitValue52000
	*  @param value
	**/
   public void setBitValue52000(char[] value) throws CFException {
      dfhcommarea.setBitValue52000(value);
   } 

     /**
	 * 	Update BitValue52000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitValue52000(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setBitValue52000(source, sourceIndex);
   	
   }
   
   public void setBitValue52000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setBitValue52000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitValue52000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitValue52000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue52000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitValue52000 with another Field
	 *	@param value
	 */
   public void setBitValue52000(Field source) {
      dfhcommarea.setBitValue52000(source);
   }  
   
     /**
	 * 	Update BitValue52000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitValue52000(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setBitValue52000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitValue52000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitValue52000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue52000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bitValue22000
	 *	@return bitValue22000
	 */
   public char[] getBitValue22000() throws CFException  {              
   		return dfhcommarea.getBitValue22000();
   }

  
	/**
	*  set variable bitValue22000
	*  @param value
	**/
   public void setBitValue22000(char[] value) throws CFException {
      dfhcommarea.setBitValue22000(value);
   } 

     /**
	 * 	Update BitValue22000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitValue22000(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setBitValue22000(source, sourceIndex);
   	
   }
   
   public void setBitValue22000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setBitValue22000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitValue22000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitValue22000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue22000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitValue22000 with another Field
	 *	@param value
	 */
   public void setBitValue22000(Field source) {
      dfhcommarea.setBitValue22000(source);
   }  
   
     /**
	 * 	Update BitValue22000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitValue22000(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setBitValue22000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitValue22000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitValue22000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue22000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bitValue62000
	 *	@return bitValue62000
	 */
   public char[] getBitValue62000() throws CFException  {              
   		return dfhcommarea.getBitValue62000();
   }

  
	/**
	*  set variable bitValue62000
	*  @param value
	**/
   public void setBitValue62000(char[] value) throws CFException {
      dfhcommarea.setBitValue62000(value);
   } 

     /**
	 * 	Update BitValue62000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitValue62000(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setBitValue62000(source, sourceIndex);
   	
   }
   
   public void setBitValue62000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setBitValue62000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitValue62000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitValue62000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue62000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitValue62000 with another Field
	 *	@param value
	 */
   public void setBitValue62000(Field source) {
      dfhcommarea.setBitValue62000(source);
   }  
   
     /**
	 * 	Update BitValue62000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitValue62000(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setBitValue62000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitValue62000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitValue62000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue62000(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of char1300
	 *	@return char1300
	 */
   public char[] getChar1300() throws CFException  {              
   		return work.getChar1300();
   }

  
	/**
	*  set variable char1300
	*  @param value
	**/
   public void setChar1300(char[] value) throws CFException {
      work.setChar1300(value);
   } 

	/**
	 *	Returns the value of idx800
	 *	@return idx800
	 */
	public short getIdx800() throws CFException {        
   		return idxGroup800.getIdx800();
	}
	
	/**
	 * 	Update Idx800 with the passed value
	 *	@param number
	 */
	public void setIdx800(short number)  throws CFException{
		idxGroup800.setIdx800(number);
	}

	public void setIdx800(int number)  throws CFException{
		idxGroup800.setIdx800((short)number);
	}

	public void setIdx800(long number)  throws CFException{
		idxGroup800.setIdx800((short)number);
	}



	/**
	 *	Returns the value of bitValue12000
	 *	@return bitValue12000
	 */
   public char[] getBitValue12000() throws CFException  {              
   		return dfhcommarea.getBitValue12000();
   }

  
	/**
	*  set variable bitValue12000
	*  @param value
	**/
   public void setBitValue12000(char[] value) throws CFException {
      dfhcommarea.setBitValue12000(value);
   } 

     /**
	 * 	Update BitValue12000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitValue12000(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setBitValue12000(source, sourceIndex);
   	
   }
   
   public void setBitValue12000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setBitValue12000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitValue12000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitValue12000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue12000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitValue12000 with another Field
	 *	@param value
	 */
   public void setBitValue12000(Field source) {
      dfhcommarea.setBitValue12000(source);
   }  
   
     /**
	 * 	Update BitValue12000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitValue12000(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setBitValue12000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitValue12000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitValue12000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue12000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of byteTable800
	 *	@return byteTable800
	 */
   public char[] getByteTable800() throws CFException  {              
   		return work.getByteTable800();
   }

  
	/**
	*  set variable byteTable800
	*  @param value
	**/
   public void setByteTable800(char[] value) throws CFException {
      work.setByteTable800(value);
   } 

	/**
	 *	Returns the value of bitValue72000
	 *	@return bitValue72000
	 */
   public char[] getBitValue72000() throws CFException  {              
   		return dfhcommarea.getBitValue72000();
   }

  
	/**
	*  set variable bitValue72000
	*  @param value
	**/
   public void setBitValue72000(char[] value) throws CFException {
      dfhcommarea.setBitValue72000(value);
   } 

     /**
	 * 	Update BitValue72000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitValue72000(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setBitValue72000(source, sourceIndex);
   	
   }
   
   public void setBitValue72000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setBitValue72000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitValue72000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitValue72000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue72000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitValue72000 with another Field
	 *	@param value
	 */
   public void setBitValue72000(Field source) {
      dfhcommarea.setBitValue72000(source);
   }  
   
     /**
	 * 	Update BitValue72000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitValue72000(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setBitValue72000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitValue72000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitValue72000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue72000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setIdx500(int idx500) { 
    Sf910020Ctx.this.idx500 = idx500;
}

public int getIdx500() { 
    return Sf910020Ctx.this.idx500;
}
	/**
	 *	Returns the value of bytePassed2000
	 *	@return bytePassed2000
	 */
   public char[] getBytePassed2000() throws CFException  {              
   		return dfhcommarea.getBytePassed2000();
   }

  
	/**
	*  set variable bytePassed2000
	*  @param value
	**/
   public void setBytePassed2000(char[] value) throws CFException {
      dfhcommarea.setBytePassed2000(value);
   } 

     /**
	 * 	Update BytePassed2000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBytePassed2000(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setBytePassed2000(source, sourceIndex);
   	
   }
   
   public void setBytePassed2000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setBytePassed2000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BytePassed2000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBytePassed2000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBytePassed2000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BytePassed2000 with another Field
	 *	@param value
	 */
   public void setBytePassed2000(Field source) {
      dfhcommarea.setBytePassed2000(source);
   }  
   
     /**
	 * 	Update BytePassed2000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBytePassed2000(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setBytePassed2000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BytePassed2000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBytePassed2000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBytePassed2000(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of bitValue42000
	 *	@return bitValue42000
	 */
   public char[] getBitValue42000() throws CFException  {              
   		return dfhcommarea.getBitValue42000();
   }

  
	/**
	*  set variable bitValue42000
	*  @param value
	**/
   public void setBitValue42000(char[] value) throws CFException {
      dfhcommarea.setBitValue42000(value);
   } 

     /**
	 * 	Update BitValue42000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitValue42000(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setBitValue42000(source, sourceIndex);
   	
   }
   
   public void setBitValue42000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setBitValue42000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitValue42000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitValue42000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue42000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitValue42000 with another Field
	 *	@param value
	 */
   public void setBitValue42000(Field source) {
      dfhcommarea.setBitValue42000(source);
   }  
   
     /**
	 * 	Update BitValue42000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitValue42000(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setBitValue42000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitValue42000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitValue42000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue42000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf910020Ctx getSf910020Ctx() {
            return Sf910020Ctx.this;
        }

        public ConvertBitsToBytesOutCtx getConvertBitsToBytesOutCtx() {
            return new ConvertBitsToBytesOutCtx();
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
        str += work.hashCode();
        str += idxGroup800.hashCode();
        str += parsingPatternValuesGroup500.hashCode();
       return str.hashCode();
    }

    public ConvertBitsToBytesInCtx clone() {
        ConvertBitsToBytesInCtx cloneObj = new ConvertBitsToBytesInCtx();
        cloneObj.dfhcommarea = new Dfhcommarea();
        cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.idxGroup800 = new IdxGroup800();
        cloneObj.idxGroup800.set(idxGroup800.getClonedField());
        cloneObj.parsingPatternValuesGroup500 = new ParsingPatternValuesGroup500();
        cloneObj.parsingPatternValuesGroup500.set(parsingPatternValuesGroup500.getClonedField());
        return cloneObj;
    }

    }

    public ConvertBitsToBytesInCtx getConvertBitsToBytesInCtx() {
            return new ConvertBitsToBytesInCtx();
    }
     public class ConvertBitsToBytesOutCtx implements Cloneable {
     Dfhcommarea dfhcommarea = Sf910020Ctx.this.getDfhcommarea();
     Work work = Sf910020Ctx.this.getWork();
     IdxGroup800 idxGroup800 = Sf910020Ctx.this.getIdxGroup800();
     ParsingPatternValuesGroup500 parsingPatternValuesGroup500 = Sf910020Ctx.this.getParsingPatternValuesGroup500();

	/**
	 *	Returns the value of bitValue32000
	 *	@return bitValue32000
	 */
   public char[] getBitValue32000() throws CFException  {              
   		return dfhcommarea.getBitValue32000();
   }

  
	/**
	*  set variable bitValue32000
	*  @param value
	**/
   public void setBitValue32000(char[] value) throws CFException {
      dfhcommarea.setBitValue32000(value);
   } 

     /**
	 * 	Update BitValue32000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitValue32000(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setBitValue32000(source, sourceIndex);
   	
   }
   
   public void setBitValue32000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setBitValue32000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitValue32000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitValue32000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue32000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitValue32000 with another Field
	 *	@param value
	 */
   public void setBitValue32000(Field source) {
      dfhcommarea.setBitValue32000(source);
   }  
   
     /**
	 * 	Update BitValue32000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitValue32000(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setBitValue32000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitValue32000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitValue32000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue32000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bitValue02000
	 *	@return bitValue02000
	 */
   public char[] getBitValue02000() throws CFException  {              
   		return dfhcommarea.getBitValue02000();
   }

  
	/**
	*  set variable bitValue02000
	*  @param value
	**/
   public void setBitValue02000(char[] value) throws CFException {
      dfhcommarea.setBitValue02000(value);
   } 

     /**
	 * 	Update BitValue02000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitValue02000(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setBitValue02000(source, sourceIndex);
   	
   }
   
   public void setBitValue02000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setBitValue02000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitValue02000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitValue02000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue02000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitValue02000 with another Field
	 *	@param value
	 */
   public void setBitValue02000(Field source) {
      dfhcommarea.setBitValue02000(source);
   }  
   
     /**
	 * 	Update BitValue02000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitValue02000(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setBitValue02000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitValue02000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitValue02000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue02000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bitValue52000
	 *	@return bitValue52000
	 */
   public char[] getBitValue52000() throws CFException  {              
   		return dfhcommarea.getBitValue52000();
   }

  
	/**
	*  set variable bitValue52000
	*  @param value
	**/
   public void setBitValue52000(char[] value) throws CFException {
      dfhcommarea.setBitValue52000(value);
   } 

     /**
	 * 	Update BitValue52000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitValue52000(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setBitValue52000(source, sourceIndex);
   	
   }
   
   public void setBitValue52000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setBitValue52000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitValue52000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitValue52000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue52000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitValue52000 with another Field
	 *	@param value
	 */
   public void setBitValue52000(Field source) {
      dfhcommarea.setBitValue52000(source);
   }  
   
     /**
	 * 	Update BitValue52000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitValue52000(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setBitValue52000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitValue52000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitValue52000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue52000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bitValue22000
	 *	@return bitValue22000
	 */
   public char[] getBitValue22000() throws CFException  {              
   		return dfhcommarea.getBitValue22000();
   }

  
	/**
	*  set variable bitValue22000
	*  @param value
	**/
   public void setBitValue22000(char[] value) throws CFException {
      dfhcommarea.setBitValue22000(value);
   } 

     /**
	 * 	Update BitValue22000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitValue22000(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setBitValue22000(source, sourceIndex);
   	
   }
   
   public void setBitValue22000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setBitValue22000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitValue22000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitValue22000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue22000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitValue22000 with another Field
	 *	@param value
	 */
   public void setBitValue22000(Field source) {
      dfhcommarea.setBitValue22000(source);
   }  
   
     /**
	 * 	Update BitValue22000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitValue22000(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setBitValue22000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitValue22000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitValue22000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue22000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bitValue62000
	 *	@return bitValue62000
	 */
   public char[] getBitValue62000() throws CFException  {              
   		return dfhcommarea.getBitValue62000();
   }

  
	/**
	*  set variable bitValue62000
	*  @param value
	**/
   public void setBitValue62000(char[] value) throws CFException {
      dfhcommarea.setBitValue62000(value);
   } 

     /**
	 * 	Update BitValue62000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitValue62000(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setBitValue62000(source, sourceIndex);
   	
   }
   
   public void setBitValue62000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setBitValue62000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitValue62000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitValue62000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue62000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitValue62000 with another Field
	 *	@param value
	 */
   public void setBitValue62000(Field source) {
      dfhcommarea.setBitValue62000(source);
   }  
   
     /**
	 * 	Update BitValue62000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitValue62000(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setBitValue62000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitValue62000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitValue62000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue62000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of bitValue12000
	 *	@return bitValue12000
	 */
   public char[] getBitValue12000() throws CFException  {              
   		return dfhcommarea.getBitValue12000();
   }

  
	/**
	*  set variable bitValue12000
	*  @param value
	**/
   public void setBitValue12000(char[] value) throws CFException {
      dfhcommarea.setBitValue12000(value);
   } 

     /**
	 * 	Update BitValue12000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitValue12000(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setBitValue12000(source, sourceIndex);
   	
   }
   
   public void setBitValue12000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setBitValue12000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitValue12000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitValue12000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue12000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitValue12000 with another Field
	 *	@param value
	 */
   public void setBitValue12000(Field source) {
      dfhcommarea.setBitValue12000(source);
   }  
   
     /**
	 * 	Update BitValue12000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitValue12000(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setBitValue12000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitValue12000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitValue12000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue12000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of byteTable800
	 *	@return byteTable800
	 */
   public char[] getByteTable800() throws CFException  {              
   		return work.getByteTable800();
   }

  
	/**
	*  set variable byteTable800
	*  @param value
	**/
   public void setByteTable800(char[] value) throws CFException {
      work.setByteTable800(value);
   } 

	/**
	 *	Returns the value of bitValue72000
	 *	@return bitValue72000
	 */
   public char[] getBitValue72000() throws CFException  {              
   		return dfhcommarea.getBitValue72000();
   }

  
	/**
	*  set variable bitValue72000
	*  @param value
	**/
   public void setBitValue72000(char[] value) throws CFException {
      dfhcommarea.setBitValue72000(value);
   } 

     /**
	 * 	Update BitValue72000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitValue72000(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setBitValue72000(source, sourceIndex);
   	
   }
   
   public void setBitValue72000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setBitValue72000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitValue72000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitValue72000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue72000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitValue72000 with another Field
	 *	@param value
	 */
   public void setBitValue72000(Field source) {
      dfhcommarea.setBitValue72000(source);
   }  
   
     /**
	 * 	Update BitValue72000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitValue72000(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setBitValue72000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitValue72000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitValue72000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue72000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


public void setIdx500(int idx500) { 
    Sf910020Ctx.this.idx500 = idx500;
}

public int getIdx500() { 
    return Sf910020Ctx.this.idx500;
}
	/**
	 *	Returns the value of bytePassed2000
	 *	@return bytePassed2000
	 */
   public char[] getBytePassed2000() throws CFException  {              
   		return dfhcommarea.getBytePassed2000();
   }

  
	/**
	*  set variable bytePassed2000
	*  @param value
	**/
   public void setBytePassed2000(char[] value) throws CFException {
      dfhcommarea.setBytePassed2000(value);
   } 

     /**
	 * 	Update BytePassed2000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBytePassed2000(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setBytePassed2000(source, sourceIndex);
   	
   }
   
   public void setBytePassed2000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setBytePassed2000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BytePassed2000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBytePassed2000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBytePassed2000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BytePassed2000 with another Field
	 *	@param value
	 */
   public void setBytePassed2000(Field source) {
      dfhcommarea.setBytePassed2000(source);
   }  
   
     /**
	 * 	Update BytePassed2000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBytePassed2000(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setBytePassed2000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BytePassed2000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBytePassed2000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBytePassed2000(source, sourceIndex, sourceLen, targetIndex, targetLen);
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
	 *	Returns the value of bitValue42000
	 *	@return bitValue42000
	 */
   public char[] getBitValue42000() throws CFException  {              
   		return dfhcommarea.getBitValue42000();
   }

  
	/**
	*  set variable bitValue42000
	*  @param value
	**/
   public void setBitValue42000(char[] value) throws CFException {
      dfhcommarea.setBitValue42000(value);
   } 

     /**
	 * 	Update BitValue42000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBitValue42000(char[] source, int sourceIndex) throws CFException {
      dfhcommarea.setBitValue42000(source, sourceIndex);
   	
   }
   
   public void setBitValue42000(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      dfhcommarea.setBitValue42000(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BitValue42000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBitValue42000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue42000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BitValue42000 with another Field
	 *	@param value
	 */
   public void setBitValue42000(Field source) {
      dfhcommarea.setBitValue42000(source);
   }  
   
     /**
	 * 	Update BitValue42000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBitValue42000(Field source, int sourceIndex,int sourceLen) {
      dfhcommarea.setBitValue42000(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BitValue42000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBitValue42000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      dfhcommarea.setBitValue42000(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of idxX800
	 *	@return idxX800
	 */
   public char[] getIdxX800() throws CFException  {              
   		return idxGroup800.getIdx800Redefined().getIdxX800();
   }

  
	/**
	*  set variable idxX800
	*  @param value
	**/
   public void setIdxX800(char[] value) throws CFException {
      idxGroup800.getIdx800Redefined().setIdxX800(value);
   } 

     /**
	 * 	Update IdxX800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIdxX800(char[] source, int sourceIndex) throws CFException {
      idxGroup800.getIdx800Redefined().setIdxX800(source, sourceIndex);
   	
   }
   
   public void setIdxX800(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      idxGroup800.getIdx800Redefined().setIdxX800(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IdxX800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIdxX800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      idxGroup800.getIdx800Redefined().setIdxX800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IdxX800 with another Field
	 *	@param value
	 */
   public void setIdxX800(Field source) {
      idxGroup800.getIdx800Redefined().setIdxX800(source);
   }  
   
     /**
	 * 	Update IdxX800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIdxX800(Field source, int sourceIndex,int sourceLen) {
      idxGroup800.getIdx800Redefined().setIdxX800(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update IdxX800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIdxX800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      idxGroup800.getIdx800Redefined().setIdxX800(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public Sf910020Ctx getSf910020Ctx() {
            return Sf910020Ctx.this;
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
        str += work.hashCode();
        str += idxGroup800.hashCode();
        str += parsingPatternValuesGroup500.hashCode();
       return str.hashCode();
    }

    public ConvertBitsToBytesOutCtx clone() {
        ConvertBitsToBytesOutCtx cloneObj = new ConvertBitsToBytesOutCtx();
        cloneObj.dfhcommarea = new Dfhcommarea();
        cloneObj.dfhcommarea.set(dfhcommarea.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.idxGroup800 = new IdxGroup800();
        cloneObj.idxGroup800.set(idxGroup800.getClonedField());
        cloneObj.parsingPatternValuesGroup500 = new ParsingPatternValuesGroup500();
        cloneObj.parsingPatternValuesGroup500.set(parsingPatternValuesGroup500.getClonedField());
        return cloneObj;
    }

    }

    public ConvertBitsToBytesOutCtx getConvertBitsToBytesOutCtx() {
            return new ConvertBitsToBytesOutCtx();
    }
}
