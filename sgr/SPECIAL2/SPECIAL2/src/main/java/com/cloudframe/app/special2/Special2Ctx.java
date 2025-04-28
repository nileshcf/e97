package com.cloudframe.app.special2;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.special2.dto.Work;
import com.cloudframe.app.special2.dto.RestoTablas;


@Context
public class Special2Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;
    RestoTablas restoTablas;


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
    public RestoTablas getRestoTablas() {
        if (restoTablas == null) {
            restoTablas = new RestoTablas();
        }

        return restoTablas;
    }

    public void setRestoTablas(RestoTablas restoTablas) {
        this.restoTablas = restoTablas;
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
        str += restoTablas.hashCode();
       return str.hashCode();
    }

    public Special2Ctx clone() {
        Special2Ctx cloneObj = new Special2Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.restoTablas = new RestoTablas();
        cloneObj.restoTablas.set(restoTablas.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Work work = Special2Ctx.this.getWork();
     RestoTablas restoTablas = Special2Ctx.this.getRestoTablas();

	/**
	 *	Returns the value of tiNTot
	 *	@return tiNTot
	 */
	public int getTiNTot() throws CFException {
   		return restoTablas.getTiArbol().getTiNTot();
	}


	/**
	 *	Returns String value of tiNTot
	 *	@return tiNTot
	 */
	public char[]  getTiNTotString() throws CFException {
	     return String.valueOf(restoTablas.getTiArbol().getTiNTotString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tiNTotIsNumeric()  throws CFException{
	    return restoTablas.getTiArbol().tiNTotIsNumeric();
	}

	/**
	 * 	Update TiNTot with the passed value
	 *	@param number
	 */
	public void setTiNTot(int number)  throws CFException{
		restoTablas.getTiArbol().setTiNTot(number);
	}
	

	public void setTiNTot(long number)  throws CFException{
	    restoTablas.getTiArbol().setTiNTot(number);
	}
	
	
	/**
	 * 	Update TiNTot with the passed value
	 *	@param value (String or char[])
	 */
	public void setTiNTot(char[] value)  throws CFException {
		restoTablas.getTiArbol().setTiNTot(value);
	}
	
	/**
	 * 	Update TiNTot with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTiNTotString(char[] value)  throws CFException{
		restoTablas.getTiArbol().setTiNTot(value);
	}	

	/**
	 *	Returns the value of cnt3r
	 *	@return cnt3r
	 */
	public BigDecimal getCnt3r() throws CFException {
   		return work.getCnt3r();
	}


	 /**
     *	Returns String value of cnt3r
     *	@return cnt3r
     */
    public char[]  getCnt3rString() throws CFException {
         return work.getCnt3rString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean cnt3rIsNumeric() {
        return work.cnt3rIsNumeric();
    }
	/**
	 * 	Update Cnt3r with the passed number
	 *	@param number
	 */
	public void setCnt3r(BigDecimal number)  throws CFException{
		work.setCnt3r(number);
   }

	/**
	 * 	Update Cnt3r with the passed value
	 *	@param value (String or char[]);
	 */
	public void setCnt3r(char[] value)  throws CFException{
		work.setCnt3r(value);
	}   

	/**
	 *	Returns the value of tiNMaxheight
	 *	@return tiNMaxheight
	 */
	public int getTiNMaxheight(int index) throws CFException {
   		return restoTablas.getTiArbol().getTiArbolNodo(index).getTiNMaxheight();
	}

    /**
	 *	Returns the String value of tiNMaxheight
	 *	@return tiNMaxheight
	 */
	public char[]  getTiNMaxheightActualString(int index) {
		return restoTablas.getTiArbol().getTiArbolNodo(index - 1).getTiNMaxheightActualString();
	}

	/**
	 *	Returns String value of tiNMaxheight
	 *	@return tiNMaxheight
	 */
	public char[]  getTiNMaxheightString(int index) throws CFException {
	     return String.valueOf(restoTablas.getTiArbol().getTiArbolNodo(index).getTiNMaxheightString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tiNMaxheightIsNumeric(int index)  throws CFException{
	    return restoTablas.getTiArbol().getTiArbolNodo(index - 1).tiNMaxheightIsNumeric();
	}

	/**
	 * 	Update TiNMaxheight with the passed value
	 *	@param number
	 */
	public void setTiNMaxheight(int index,int number)  throws CFException{
		restoTablas.getTiArbol().getTiArbolNodo(index).setTiNMaxheight(number);
	}
	

	public void setTiNMaxheight(int index,long number)  throws CFException{
	    restoTablas.getTiArbol().getTiArbolNodo(index).setTiNMaxheight(number);
	}
	
	
	/**
	 * 	Update TiNMaxheight with the passed value
	 *	@param value (String or char[])
	 */
	public void setTiNMaxheight(int index,char[] value)  throws CFException {
		restoTablas.getTiArbol().getTiArbolNodo(index).setTiNMaxheight(value);
	}
	
	/**
	 * 	Update TiNMaxheight with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTiNMaxheightString(int index,char[] value)  throws CFException{
		restoTablas.getTiArbol().getTiArbolNodo(index).setTiNMaxheight(value);
	}	


        public Special2Ctx getSpecial2Ctx() {
            return Special2Ctx.this;
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
        str += work.hashCode();
        str += restoTablas.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.restoTablas = new RestoTablas();
        cloneObj.restoTablas.set(restoTablas.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessOutCtx implements Cloneable {
     Work work = Special2Ctx.this.getWork();
     RestoTablas restoTablas = Special2Ctx.this.getRestoTablas();

	/**
	 *	Returns the value of cnt3r
	 *	@return cnt3r
	 */
	public BigDecimal getCnt3r() throws CFException {
   		return work.getCnt3r();
	}


	 /**
     *	Returns String value of cnt3r
     *	@return cnt3r
     */
    public char[]  getCnt3rString() throws CFException {
         return work.getCnt3rString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean cnt3rIsNumeric() {
        return work.cnt3rIsNumeric();
    }
	/**
	 * 	Update Cnt3r with the passed number
	 *	@param number
	 */
	public void setCnt3r(BigDecimal number)  throws CFException{
		work.setCnt3r(number);
   }

	/**
	 * 	Update Cnt3r with the passed value
	 *	@param value (String or char[]);
	 */
	public void setCnt3r(char[] value)  throws CFException{
		work.setCnt3r(value);
	}   

	/**
	 *	Returns the value of tiNMaxheight
	 *	@return tiNMaxheight
	 */
	public int getTiNMaxheight(int index) throws CFException {
   		return restoTablas.getTiArbol().getTiArbolNodo(index).getTiNMaxheight();
	}

    /**
	 *	Returns the String value of tiNMaxheight
	 *	@return tiNMaxheight
	 */
	public char[]  getTiNMaxheightActualString(int index) {
		return restoTablas.getTiArbol().getTiArbolNodo(index - 1).getTiNMaxheightActualString();
	}

	/**
	 *	Returns String value of tiNMaxheight
	 *	@return tiNMaxheight
	 */
	public char[]  getTiNMaxheightString(int index) throws CFException {
	     return String.valueOf(restoTablas.getTiArbol().getTiArbolNodo(index).getTiNMaxheightString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tiNMaxheightIsNumeric(int index)  throws CFException{
	    return restoTablas.getTiArbol().getTiArbolNodo(index - 1).tiNMaxheightIsNumeric();
	}

	/**
	 * 	Update TiNMaxheight with the passed value
	 *	@param number
	 */
	public void setTiNMaxheight(int index,int number)  throws CFException{
		restoTablas.getTiArbol().getTiArbolNodo(index).setTiNMaxheight(number);
	}
	

	public void setTiNMaxheight(int index,long number)  throws CFException{
	    restoTablas.getTiArbol().getTiArbolNodo(index).setTiNMaxheight(number);
	}
	
	
	/**
	 * 	Update TiNMaxheight with the passed value
	 *	@param value (String or char[])
	 */
	public void setTiNMaxheight(int index,char[] value)  throws CFException {
		restoTablas.getTiArbol().getTiArbolNodo(index).setTiNMaxheight(value);
	}
	
	/**
	 * 	Update TiNMaxheight with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTiNMaxheightString(int index,char[] value)  throws CFException{
		restoTablas.getTiArbol().getTiArbolNodo(index).setTiNMaxheight(value);
	}	

	/**
	 *	Returns the value of numericFlag
	 *	@return numericFlag
	 */
	public BigDecimal getNumericFlag() throws CFException {
   		return work.getNumericFlag();
	}


	 /**
     *	Returns String value of numericFlag
     *	@return numericFlag
     */
    public char[]  getNumericFlagString() throws CFException {
         return work.getNumericFlagString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean numericFlagIsNumeric() {
        return work.numericFlagIsNumeric();
    }
	/**
	 * 	Update NumericFlag with the passed number
	 *	@param number
	 */
	public void setNumericFlag(BigDecimal number)  throws CFException{
		work.setNumericFlag(number);
   }

	/**
	 * 	Update NumericFlag with the passed value
	 *	@param value (String or char[]);
	 */
	public void setNumericFlag(char[] value)  throws CFException{
		work.setNumericFlag(value);
	}   

	/**
	 *	Test condition 5000.00 THRU 9999.99 for isInvalidNumeric()
	 *	@return  Returns true if isInvalidNumeric() is 5000.00 THRU 9999.99
	 */
   public boolean isInvalidNumeric() throws CFException {
      return work.isInvalidNumeric();
   }

	/**
	*  set values 5000.00 THRU 9999.99
	*/
   	public void setInvalidNumericTrue()  throws CFException{  			
    	work.setInvalidNumericTrue();
   	}
	/**
	 *	Returns the value of edit3
	 *	@return edit3
	 */
   public char[] getEdit3() throws CFException  {              
   		return work.getEdit3();
   }

  
	/**
	*  set variable edit3
	*  @param value
	**/
   public void setEdit3(char[] value) throws CFException {
      work.setEdit3(value);
   } 

     /**
	 * 	Update Edit3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEdit3(char[] source, int sourceIndex) throws CFException {
      work.setEdit3(source, sourceIndex);
   	
   }
   
   public void setEdit3(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setEdit3(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Edit3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEdit3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setEdit3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Edit3 with another Field
	 *	@param value
	 */
   public void setEdit3(Field source) {
      work.setEdit3(source);
   }  
   
     /**
	 * 	Update Edit3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEdit3(Field source, int sourceIndex,int sourceLen) {
      work.setEdit3(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Edit3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEdit3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setEdit3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tiNTot
	 *	@return tiNTot
	 */
	public int getTiNTot() throws CFException {
   		return restoTablas.getTiArbol().getTiNTot();
	}


	/**
	 *	Returns String value of tiNTot
	 *	@return tiNTot
	 */
	public char[]  getTiNTotString() throws CFException {
	     return String.valueOf(restoTablas.getTiArbol().getTiNTotString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tiNTotIsNumeric()  throws CFException{
	    return restoTablas.getTiArbol().tiNTotIsNumeric();
	}

	/**
	 * 	Update TiNTot with the passed value
	 *	@param number
	 */
	public void setTiNTot(int number)  throws CFException{
		restoTablas.getTiArbol().setTiNTot(number);
	}
	

	public void setTiNTot(long number)  throws CFException{
	    restoTablas.getTiArbol().setTiNTot(number);
	}
	
	
	/**
	 * 	Update TiNTot with the passed value
	 *	@param value (String or char[])
	 */
	public void setTiNTot(char[] value)  throws CFException {
		restoTablas.getTiArbol().setTiNTot(value);
	}
	
	/**
	 * 	Update TiNTot with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTiNTotString(char[] value)  throws CFException{
		restoTablas.getTiArbol().setTiNTot(value);
	}	

	/**
	 *	Returns the value of bhDisplay
	 *	@return bhDisplay
	 */
   public char[] getBhDisplay() throws CFException  {              
   		return work.getBhDisplay();
   }

  
	/**
	*  set variable bhDisplay
	*  @param value
	**/
   public void setBhDisplay(char[] value) throws CFException {
      work.setBhDisplay(value);
   } 

     /**
	 * 	Update BhDisplay 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBhDisplay(char[] source, int sourceIndex) throws CFException {
      work.setBhDisplay(source, sourceIndex);
   	
   }
   
   public void setBhDisplay(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setBhDisplay(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update BhDisplay 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBhDisplay(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setBhDisplay(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update BhDisplay with another Field
	 *	@param value
	 */
   public void setBhDisplay(Field source) {
      work.setBhDisplay(source);
   }  
   
     /**
	 * 	Update BhDisplay 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBhDisplay(Field source, int sourceIndex,int sourceLen) {
      work.setBhDisplay(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update BhDisplay 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBhDisplay(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setBhDisplay(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of cnt1r
	 *	@return cnt1r
	 */
	public int getCnt1r() throws CFException {        
   		return work.getCnt1r();
	}
	
	/**
	 * 	Update Cnt1r with the passed value
	 *	@param number
	 */
	public void setCnt1r(int number)  throws CFException{
		work.setCnt1r(number);
	}


	public void setCnt1r(long number)  throws CFException{
		work.setCnt1r((int)number);
	}


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
	 *	Test condition 3456.78 for isExactMatch()
	 *	@return  Returns true if isExactMatch() is 3456.78
	 */
   public boolean isExactMatch() throws CFException {
      return work.isExactMatch();
   }

	/**
	*  set values 3456.78
	*/
   	public void setExactMatchTrue()  throws CFException{  			
    	work.setExactMatchTrue();
   	}
	public BigDecimal getCnt2r() throws CFException{      
   		return work.getCnt2r();
	}

    public char[] getCnt2rString() throws CFException {
          return  work.getCnt2r().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Cnt2r with the passed number
	 *	@param number
	 */
	public void setCnt2r(BigDecimal number)  throws CFException{
		work.setCnt2r(number);
   }

	/**
	 *	Returns the value of edit2
	 *	@return edit2
	 */
   public char[] getEdit2() throws CFException  {              
   		return work.getEdit2();
   }

  
	/**
	*  set variable edit2
	*  @param value
	**/
   public void setEdit2(char[] value) throws CFException {
      work.setEdit2(value);
   } 

     /**
	 * 	Update Edit2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEdit2(char[] source, int sourceIndex) throws CFException {
      work.setEdit2(source, sourceIndex);
   	
   }
   
   public void setEdit2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setEdit2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Edit2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEdit2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setEdit2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Edit2 with another Field
	 *	@param value
	 */
   public void setEdit2(Field source) {
      work.setEdit2(source);
   }  
   
     /**
	 * 	Update Edit2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEdit2(Field source, int sourceIndex,int sourceLen) {
      work.setEdit2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Edit2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEdit2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setEdit2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition 1234.56 THRU 5000.00 for isValidNumeric()
	 *	@return  Returns true if isValidNumeric() is 1234.56 THRU 5000.00
	 */
   public boolean isValidNumeric() throws CFException {
      return work.isValidNumeric();
   }

	/**
	*  set values 1234.56 THRU 5000.00
	*/
   	public void setValidNumericTrue()  throws CFException{  			
    	work.setValidNumericTrue();
   	}
	/**
	 *	Returns the value of bodyHeight
	 *	@return bodyHeight
	 */
	public BigDecimal getBodyHeight() throws CFException {
   		return work.getBodyHeight();
	}

    /**
	 *	Returns the String value of bodyHeight
	 *	@return bodyHeight
	 */
	public char[]  getBodyHeightActualString()  throws CFException{
	    return work.getBodyHeightActualString();
	}

	 /**
     *	Returns String value of bodyHeight
     *	@return bodyHeight
     */
    public char[]  getBodyHeightString() throws CFException {
         return work.getBodyHeightString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean bodyHeightIsNumeric() {
        return work.bodyHeightIsNumeric();
    }
	/**
	 * 	Update BodyHeight with the passed number
	 *	@param number
	 */
	public void setBodyHeight(BigDecimal number)  throws CFException{
		work.setBodyHeight(number);
   }

	/**
	 * 	Update BodyHeight with the passed value
	 *	@param value (String or char[]);
	 */
	public void setBodyHeight(char[] value)  throws CFException{
		work.setBodyHeight(value);
	}   


        public Special2Ctx getSpecial2Ctx() {
            return Special2Ctx.this;
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
        str += restoTablas.hashCode();
       return str.hashCode();
    }

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.restoTablas = new RestoTablas();
        cloneObj.restoTablas.set(restoTablas.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
}
