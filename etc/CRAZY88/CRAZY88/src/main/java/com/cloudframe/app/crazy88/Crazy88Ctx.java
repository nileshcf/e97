package com.cloudframe.app.crazy88;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.crazy88.dto.WCharG;
import com.cloudframe.app.crazy88.dto.WI;
import com.cloudframe.app.crazy88.dto.Work;


@Context
public class Crazy88Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;
    WI wI;
    WCharG wCharG;


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
    public WI getWI() {
        if (wI == null) {
            wI = new WI();
        }

        return wI;
    }

    public void setWI(WI wI) {
        this.wI = wI;
    }
    public WCharG getWCharG() {
        if (wCharG == null) {
            wCharG = new WCharG();
        }

        return wCharG;
    }

    public void setWCharG(WCharG wCharG) {
        this.wCharG = wCharG;
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
        str += wI.hashCode();
        str += wCharG.hashCode();
       return str.hashCode();
    }

    public Crazy88Ctx clone() {
        Crazy88Ctx cloneObj = new Crazy88Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wI = new WI();
        cloneObj.wI.set(wI.getClonedField());
        cloneObj.wCharG = new WCharG();
        cloneObj.wCharG.set(wCharG.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class MainInCtx implements Cloneable {
     Work work = Crazy88Ctx.this.getWork();
     WI wI = Crazy88Ctx.this.getWI();
     WCharG wCharG = Crazy88Ctx.this.getWCharG();

	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public short getI() throws CFException {        
   		return wI.getI();
	}
	
	/**
	 * 	Update I with the passed value
	 *	@param number
	 */
	public void setI(short number)  throws CFException{
		wI.setI(number);
	}

	public void setI(int number)  throws CFException{
		wI.setI((short)number);
	}

	public void setI(long number)  throws CFException{
		wI.setI((short)number);
	}



	/**
	 *	Returns the value of wI
	 *	@return wI
	 */   
	 public WI getWI() {
   	return wI;
   }


	/**
	 *	Returns the value of wCharG
	 *	@return wCharG
	 */   
	 public WCharG getWCharG() {
   	return wCharG;
   }



        public Crazy88Ctx getCrazy88Ctx() {
            return Crazy88Ctx.this;
        }

        public MainOutCtx getMainOutCtx() {
            return new MainOutCtx();
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
        str += wI.hashCode();
        str += wCharG.hashCode();
       return str.hashCode();
    }

    public MainInCtx clone() {
        MainInCtx cloneObj = new MainInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wI = new WI();
        cloneObj.wI.set(wI.getClonedField());
        cloneObj.wCharG = new WCharG();
        cloneObj.wCharG.set(wCharG.getClonedField());
        return cloneObj;
    }

    }

    public MainInCtx getMainInCtx() {
            return new MainInCtx();
    }
     public class MainOutCtx implements Cloneable {
     Work work = Crazy88Ctx.this.getWork();
     WI wI = Crazy88Ctx.this.getWI();
     WCharG wCharG = Crazy88Ctx.this.getWCharG();

	/**
	 *	Test condition "B" for isEvalCharB300()
	 *	@return  Returns true if isEvalCharB300() is "B"
	 */
   public boolean isEvalCharB300() throws CFException {
      return work.isEvalCharB300();
   }

	/**
	*  set values "B"
	*/
   	public void setEvalCharB300True()  throws CFException{  			
    	work.setEvalCharB300True();
   	}
	/**
	 *	Test condition "0" for isEvalChar0300()
	 *	@return  Returns true if isEvalChar0300() is "0"
	 */
   public boolean isEvalChar0300() throws CFException {
      return work.isEvalChar0300();
   }

	/**
	*  set values "0"
	*/
   	public void setEvalChar0300True()  throws CFException{  			
    	work.setEvalChar0300True();
   	}
	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public short getI() throws CFException {        
   		return wI.getI();
	}
	
	/**
	 * 	Update I with the passed value
	 *	@param number
	 */
	public void setI(short number)  throws CFException{
		wI.setI(number);
	}

	public void setI(int number)  throws CFException{
		wI.setI((short)number);
	}

	public void setI(long number)  throws CFException{
		wI.setI((short)number);
	}



	/**
	 *	Test condition "C" for isEvalCharC300()
	 *	@return  Returns true if isEvalCharC300() is "C"
	 */
   public boolean isEvalCharC300() throws CFException {
      return work.isEvalCharC300();
   }

	/**
	*  set values "C"
	*/
   	public void setEvalCharC300True()  throws CFException{  			
    	work.setEvalCharC300True();
   	}
	/**
	 *	Test condition "A" "B" "C" "D" "E" "F" "G" "H" "I" "J" "K" "L" "M" "N" "O" "P" "Q" "R" "S" "T" "U" "V" "W" "X" "Y" "Z" "0" "1" "2" "3" "4" "5" "6" "7" "8" "9" "-" "." "," "/" "\\" for isEvalChar300()
	 *	@return  Returns true if isEvalChar300() is "A" "B" "C" "D" "E" "F" "G" "H" "I" "J" "K" "L" "M" "N" "O" "P" "Q" "R" "S" "T" "U" "V" "W" "X" "Y" "Z" "0" "1" "2" "3" "4" "5" "6" "7" "8" "9" "-" "." "," "/" "\\"
	 */
   public boolean isEvalChar300() throws CFException {
      return work.isEvalChar300();
   }

	/**
	*  set values "A" "B" "C" "D" "E" "F" "G" "H" "I" "J" "K" "L" "M" "N" "O" "P" "Q" "R" "S" "T" "U" "V" "W" "X" "Y" "Z" "0" "1" "2" "3" "4" "5" "6" "7" "8" "9" "-" "." "," "/" "\\"
	*/
   	public void setEvalChar300True()  throws CFException{  			
    	work.setEvalChar300True();
   	}
	/**
	 *	Test condition "U" for isEvalCharU300()
	 *	@return  Returns true if isEvalCharU300() is "U"
	 */
   public boolean isEvalCharU300() throws CFException {
      return work.isEvalCharU300();
   }

	/**
	*  set values "U"
	*/
   	public void setEvalCharU300True()  throws CFException{  			
    	work.setEvalCharU300True();
   	}
	/**
	 *	Test condition "L" for isEvalCharL300()
	 *	@return  Returns true if isEvalCharL300() is "L"
	 */
   public boolean isEvalCharL300() throws CFException {
      return work.isEvalCharL300();
   }

	/**
	*  set values "L"
	*/
   	public void setEvalCharL300True()  throws CFException{  			
    	work.setEvalCharL300True();
   	}
	/**
	 *	Returns the value of wI
	 *	@return wI
	 */   
	 public WI getWI() {
   	return wI;
   }


	/**
	 *	Test condition "H" for isEvalCharH300()
	 *	@return  Returns true if isEvalCharH300() is "H"
	 */
   public boolean isEvalCharH300() throws CFException {
      return work.isEvalCharH300();
   }

	/**
	*  set values "H"
	*/
   	public void setEvalCharH300True()  throws CFException{  			
    	work.setEvalCharH300True();
   	}
	/**
	 *	Test condition "T" for isEvalCharT300()
	 *	@return  Returns true if isEvalCharT300() is "T"
	 */
   public boolean isEvalCharT300() throws CFException {
      return work.isEvalCharT300();
   }

	/**
	*  set values "T"
	*/
   	public void setEvalCharT300True()  throws CFException{  			
    	work.setEvalCharT300True();
   	}
	/**
	 *	Test condition "D" for isEvalCharD300()
	 *	@return  Returns true if isEvalCharD300() is "D"
	 */
   public boolean isEvalCharD300() throws CFException {
      return work.isEvalCharD300();
   }

	/**
	*  set values "D"
	*/
   	public void setEvalCharD300True()  throws CFException{  			
    	work.setEvalCharD300True();
   	}
	/**
	 *	Test condition "P" for isEvalCharP300()
	 *	@return  Returns true if isEvalCharP300() is "P"
	 */
   public boolean isEvalCharP300() throws CFException {
      return work.isEvalCharP300();
   }

	/**
	*  set values "P"
	*/
   	public void setEvalCharP300True()  throws CFException{  			
    	work.setEvalCharP300True();
   	}
	/**
	 *	Test condition "O" for isEvalCharO300()
	 *	@return  Returns true if isEvalCharO300() is "O"
	 */
   public boolean isEvalCharO300() throws CFException {
      return work.isEvalCharO300();
   }

	/**
	*  set values "O"
	*/
   	public void setEvalCharO300True()  throws CFException{  			
    	work.setEvalCharO300True();
   	}
	/**
	 *	Test condition "9" for isEvalChar9300()
	 *	@return  Returns true if isEvalChar9300() is "9"
	 */
   public boolean isEvalChar9300() throws CFException {
      return work.isEvalChar9300();
   }

	/**
	*  set values "9"
	*/
   	public void setEvalChar9300True()  throws CFException{  			
    	work.setEvalChar9300True();
   	}
	/**
	 *	Test condition "M" for isEvalCharM300()
	 *	@return  Returns true if isEvalCharM300() is "M"
	 */
   public boolean isEvalCharM300() throws CFException {
      return work.isEvalCharM300();
   }

	/**
	*  set values "M"
	*/
   	public void setEvalCharM300True()  throws CFException{  			
    	work.setEvalCharM300True();
   	}
	/**
	 *	Test condition "3" for isEvalChar2300()
	 *	@return  Returns true if isEvalChar2300() is "3"
	 */
   public boolean isEvalChar2300() throws CFException {
      return work.isEvalChar2300();
   }

	/**
	*  set values "3"
	*/
   	public void setEvalChar2300True()  throws CFException{  			
    	work.setEvalChar2300True();
   	}
	/**
	 *	Test condition "G" for isEvalCharG300()
	 *	@return  Returns true if isEvalCharG300() is "G"
	 */
   public boolean isEvalCharG300() throws CFException {
      return work.isEvalCharG300();
   }

	/**
	*  set values "G"
	*/
   	public void setEvalCharG300True()  throws CFException{  			
    	work.setEvalCharG300True();
   	}
	/**
	 *	Test condition "V" for isEvalCharV300()
	 *	@return  Returns true if isEvalCharV300() is "V"
	 */
   public boolean isEvalCharV300() throws CFException {
      return work.isEvalCharV300();
   }

	/**
	*  set values "V"
	*/
   	public void setEvalCharV300True()  throws CFException{  			
    	work.setEvalCharV300True();
   	}
	/**
	 *	Test condition "Y" for isEvalCharY300()
	 *	@return  Returns true if isEvalCharY300() is "Y"
	 */
   public boolean isEvalCharY300() throws CFException {
      return work.isEvalCharY300();
   }

	/**
	*  set values "Y"
	*/
   	public void setEvalCharY300True()  throws CFException{  			
    	work.setEvalCharY300True();
   	}
	/**
	 *	Test condition "1" for isEvalChar1300()
	 *	@return  Returns true if isEvalChar1300() is "1"
	 */
   public boolean isEvalChar1300() throws CFException {
      return work.isEvalChar1300();
   }

	/**
	*  set values "1"
	*/
   	public void setEvalChar1300True()  throws CFException{  			
    	work.setEvalChar1300True();
   	}
	/**
	 *	Test condition "K" for isEvalCharK300()
	 *	@return  Returns true if isEvalCharK300() is "K"
	 */
   public boolean isEvalCharK300() throws CFException {
      return work.isEvalCharK300();
   }

	/**
	*  set values "K"
	*/
   	public void setEvalCharK300True()  throws CFException{  			
    	work.setEvalCharK300True();
   	}
	/**
	 *	Test condition "/" for isEvalCharSlashF300()
	 *	@return  Returns true if isEvalCharSlashF300() is "/"
	 */
   public boolean isEvalCharSlashF300() throws CFException {
      return work.isEvalCharSlashF300();
   }

	/**
	*  set values "/"
	*/
   	public void setEvalCharSlashF300True()  throws CFException{  			
    	work.setEvalCharSlashF300True();
   	}
	/**
	 *	Test condition "A" for isEvalCharA300()
	 *	@return  Returns true if isEvalCharA300() is "A"
	 */
   public boolean isEvalCharA300() throws CFException {
      return work.isEvalCharA300();
   }

	/**
	*  set values "A"
	*/
   	public void setEvalCharA300True()  throws CFException{  			
    	work.setEvalCharA300True();
   	}
	/**
	 *	Test condition "R" for isEvalCharR300()
	 *	@return  Returns true if isEvalCharR300() is "R"
	 */
   public boolean isEvalCharR300() throws CFException {
      return work.isEvalCharR300();
   }

	/**
	*  set values "R"
	*/
   	public void setEvalCharR300True()  throws CFException{  			
    	work.setEvalCharR300True();
   	}
	/**
	 *	Test condition "X" for isEvalCharX300()
	 *	@return  Returns true if isEvalCharX300() is "X"
	 */
   public boolean isEvalCharX300() throws CFException {
      return work.isEvalCharX300();
   }

	/**
	*  set values "X"
	*/
   	public void setEvalCharX300True()  throws CFException{  			
    	work.setEvalCharX300True();
   	}
	/**
	 *	Test condition "Q" for isEvalCharQ300()
	 *	@return  Returns true if isEvalCharQ300() is "Q"
	 */
   public boolean isEvalCharQ300() throws CFException {
      return work.isEvalCharQ300();
   }

	/**
	*  set values "Q"
	*/
   	public void setEvalCharQ300True()  throws CFException{  			
    	work.setEvalCharQ300True();
   	}
	/**
	 *	Test condition "A" THRU "Z" for isEvalCharLetter300()
	 *	@return  Returns true if isEvalCharLetter300() is "A" THRU "Z"
	 */
   public boolean isEvalCharLetter300() throws CFException {
      return work.isEvalCharLetter300();
   }

	/**
	*  set values "A" THRU "Z"
	*/
   	public void setEvalCharLetter300True()  throws CFException{  			
    	work.setEvalCharLetter300True();
   	}
	/**
	 *	Test condition "S" for isEvalCharS300()
	 *	@return  Returns true if isEvalCharS300() is "S"
	 */
   public boolean isEvalCharS300() throws CFException {
      return work.isEvalCharS300();
   }

	/**
	*  set values "S"
	*/
   	public void setEvalCharS300True()  throws CFException{  			
    	work.setEvalCharS300True();
   	}
	/**
	 *	Test condition "Z" for isEvalCharZ300()
	 *	@return  Returns true if isEvalCharZ300() is "Z"
	 */
   public boolean isEvalCharZ300() throws CFException {
      return work.isEvalCharZ300();
   }

	/**
	*  set values "Z"
	*/
   	public void setEvalCharZ300True()  throws CFException{  			
    	work.setEvalCharZ300True();
   	}
	/**
	 *	Test condition "F" for isEvalCharF300()
	 *	@return  Returns true if isEvalCharF300() is "F"
	 */
   public boolean isEvalCharF300() throws CFException {
      return work.isEvalCharF300();
   }

	/**
	*  set values "F"
	*/
   	public void setEvalCharF300True()  throws CFException{  			
    	work.setEvalCharF300True();
   	}
	/**
	 *	Test condition "8" for isEvalChar8300()
	 *	@return  Returns true if isEvalChar8300() is "8"
	 */
   public boolean isEvalChar8300() throws CFException {
      return work.isEvalChar8300();
   }

	/**
	*  set values "8"
	*/
   	public void setEvalChar8300True()  throws CFException{  			
    	work.setEvalChar8300True();
   	}
	/**
	 *	Test condition "I" for isEvalCharI300()
	 *	@return  Returns true if isEvalCharI300() is "I"
	 */
   public boolean isEvalCharI300() throws CFException {
      return work.isEvalCharI300();
   }

	/**
	*  set values "I"
	*/
   	public void setEvalCharI300True()  throws CFException{  			
    	work.setEvalCharI300True();
   	}
	/**
	 *	Test condition "E" for isEvalCharE300()
	 *	@return  Returns true if isEvalCharE300() is "E"
	 */
   public boolean isEvalCharE300() throws CFException {
      return work.isEvalCharE300();
   }

	/**
	*  set values "E"
	*/
   	public void setEvalCharE300True()  throws CFException{  			
    	work.setEvalCharE300True();
   	}
	/**
	 *	Returns the value of wCharTestData
	 *	@return wCharTestData
	 */
   public char[] getWCharTestData() throws CFException  {              
   		return wCharG.getWCharTestData();
   }

  
	/**
	*  set variable wCharTestData
	*  @param value
	**/
   public void setWCharTestData(char[] value) throws CFException {
      wCharG.setWCharTestData(value);
   } 

     /**
	 * 	Update WCharTestData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWCharTestData(char[] source, int sourceIndex) throws CFException {
      wCharG.setWCharTestData(source, sourceIndex);
   	
   }
   
   public void setWCharTestData(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      wCharG.setWCharTestData(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WCharTestData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWCharTestData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wCharG.setWCharTestData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WCharTestData with another Field
	 *	@param value
	 */
   public void setWCharTestData(Field source) {
      wCharG.setWCharTestData(source);
   }  
   
     /**
	 * 	Update WCharTestData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWCharTestData(Field source, int sourceIndex,int sourceLen) {
      wCharG.setWCharTestData(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WCharTestData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWCharTestData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      wCharG.setWCharTestData(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "J" for isEvalCharJ300()
	 *	@return  Returns true if isEvalCharJ300() is "J"
	 */
   public boolean isEvalCharJ300() throws CFException {
      return work.isEvalCharJ300();
   }

	/**
	*  set values "J"
	*/
   	public void setEvalCharJ300True()  throws CFException{  			
    	work.setEvalCharJ300True();
   	}
	/**
	 *	Test condition "3" for isEvalChar3300()
	 *	@return  Returns true if isEvalChar3300() is "3"
	 */
   public boolean isEvalChar3300() throws CFException {
      return work.isEvalChar3300();
   }

	/**
	*  set values "3"
	*/
   	public void setEvalChar3300True()  throws CFException{  			
    	work.setEvalChar3300True();
   	}
	/**
	 *	Test condition "7" for isEvalChar7300()
	 *	@return  Returns true if isEvalChar7300() is "7"
	 */
   public boolean isEvalChar7300() throws CFException {
      return work.isEvalChar7300();
   }

	/**
	*  set values "7"
	*/
   	public void setEvalChar7300True()  throws CFException{  			
    	work.setEvalChar7300True();
   	}
	/**
	 *	Test condition "." for isEvalCharPeriod300()
	 *	@return  Returns true if isEvalCharPeriod300() is "."
	 */
   public boolean isEvalCharPeriod300() throws CFException {
      return work.isEvalCharPeriod300();
   }

	/**
	*  set values "."
	*/
   	public void setEvalCharPeriod300True()  throws CFException{  			
    	work.setEvalCharPeriod300True();
   	}
	/**
	 *	Test condition "\\" for isEvalCharSlashB300()
	 *	@return  Returns true if isEvalCharSlashB300() is "\\"
	 */
   public boolean isEvalCharSlashB300() throws CFException {
      return work.isEvalCharSlashB300();
   }

	/**
	*  set values "\\"
	*/
   	public void setEvalCharSlashB300True()  throws CFException{  			
    	work.setEvalCharSlashB300True();
   	}
	/**
	 *	Test condition "W" for isEvalCharW300()
	 *	@return  Returns true if isEvalCharW300() is "W"
	 */
   public boolean isEvalCharW300() throws CFException {
      return work.isEvalCharW300();
   }

	/**
	*  set values "W"
	*/
   	public void setEvalCharW300True()  throws CFException{  			
    	work.setEvalCharW300True();
   	}
	/**
	 *	Test condition "-" for isEvalCharHyphen300()
	 *	@return  Returns true if isEvalCharHyphen300() is "-"
	 */
   public boolean isEvalCharHyphen300() throws CFException {
      return work.isEvalCharHyphen300();
   }

	/**
	*  set values "-"
	*/
   	public void setEvalCharHyphen300True()  throws CFException{  			
    	work.setEvalCharHyphen300True();
   	}
	/**
	 *	Test condition "," for isEvalCharComma300()
	 *	@return  Returns true if isEvalCharComma300() is ","
	 */
   public boolean isEvalCharComma300() throws CFException {
      return work.isEvalCharComma300();
   }

	/**
	*  set values ","
	*/
   	public void setEvalCharComma300True()  throws CFException{  			
    	work.setEvalCharComma300True();
   	}
	/**
	 *	Returns the value of w300EvalChar
	 *	@return w300EvalChar
	 */
   public char[] getW300EvalChar() throws CFException  {              
   		return work.getW300EvalChar();
   }

  
	/**
	*  set variable w300EvalChar
	*  @param value
	**/
   public void setW300EvalChar(char[] value) throws CFException {
      work.setW300EvalChar(value);
   } 

	/**
	 *	Test condition "4" for isEvalChar4300()
	 *	@return  Returns true if isEvalChar4300() is "4"
	 */
   public boolean isEvalChar4300() throws CFException {
      return work.isEvalChar4300();
   }

	/**
	*  set values "4"
	*/
   	public void setEvalChar4300True()  throws CFException{  			
    	work.setEvalChar4300True();
   	}
	/**
	 *	Test condition "6" for isEvalChar6300()
	 *	@return  Returns true if isEvalChar6300() is "6"
	 */
   public boolean isEvalChar6300() throws CFException {
      return work.isEvalChar6300();
   }

	/**
	*  set values "6"
	*/
   	public void setEvalChar6300True()  throws CFException{  			
    	work.setEvalChar6300True();
   	}
	/**
	 *	Returns the value of wCharG
	 *	@return wCharG
	 */   
	 public WCharG getWCharG() {
   	return wCharG;
   }


	/**
	 *	Test condition "N" for isEvalCharN300()
	 *	@return  Returns true if isEvalCharN300() is "N"
	 */
   public boolean isEvalCharN300() throws CFException {
      return work.isEvalCharN300();
   }

	/**
	*  set values "N"
	*/
   	public void setEvalCharN300True()  throws CFException{  			
    	work.setEvalCharN300True();
   	}
	/**
	 *	Test condition "5" for isEvalChar5300()
	 *	@return  Returns true if isEvalChar5300() is "5"
	 */
   public boolean isEvalChar5300() throws CFException {
      return work.isEvalChar5300();
   }

	/**
	*  set values "5"
	*/
   	public void setEvalChar5300True()  throws CFException{  			
    	work.setEvalChar5300True();
   	}

        public Crazy88Ctx getCrazy88Ctx() {
            return Crazy88Ctx.this;
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
        str += wI.hashCode();
        str += wCharG.hashCode();
       return str.hashCode();
    }

    public MainOutCtx clone() {
        MainOutCtx cloneObj = new MainOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.wI = new WI();
        cloneObj.wI.set(wI.getClonedField());
        cloneObj.wCharG = new WCharG();
        cloneObj.wCharG.set(wCharG.getClonedField());
        return cloneObj;
    }

    }

    public MainOutCtx getMainOutCtx() {
            return new MainOutCtx();
    }
     public class EndOutCtx implements Cloneable {


        public Crazy88Ctx getCrazy88Ctx() {
            return Crazy88Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
       return str.hashCode();
    }

    public EndOutCtx clone() {
        EndOutCtx cloneObj = new EndOutCtx();
        return cloneObj;
    }

    }

    public EndOutCtx getEndOutCtx() {
            return new EndOutCtx();
    }
}
