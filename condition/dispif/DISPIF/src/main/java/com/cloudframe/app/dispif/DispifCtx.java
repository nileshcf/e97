package com.cloudframe.app.dispif;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.dispif.dto.IntGroup;
import com.cloudframe.app.dispif.dto.ShortGroup;
import com.cloudframe.app.dispif.dto.LongX;
import com.cloudframe.app.dispif.dto.ShortX;
import com.cloudframe.app.dispif.dto.IntX;
import com.cloudframe.app.dispif.dto.Work;
import com.cloudframe.app.dispif.dto.LongGroup;


@Context
public class DispifCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    IntGroup intGroup;
    Work work;
    ShortGroup shortGroup;
    LongGroup longGroup;


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


    public IntGroup getIntGroup() {
        if (intGroup == null) {
            intGroup = new IntGroup();
        }

        return intGroup;
    }

    public void setIntGroup(IntGroup intGroup) {
        this.intGroup = intGroup;
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
    public ShortGroup getShortGroup() {
        if (shortGroup == null) {
            shortGroup = new ShortGroup();
        }

        return shortGroup;
    }

    public void setShortGroup(ShortGroup shortGroup) {
        this.shortGroup = shortGroup;
    }
    public LongGroup getLongGroup() {
        if (longGroup == null) {
            longGroup = new LongGroup();
        }

        return longGroup;
    }

    public void setLongGroup(LongGroup longGroup) {
        this.longGroup = longGroup;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += intGroup.hashCode();
        str += work.hashCode();
        str += shortGroup.hashCode();
        str += longGroup.hashCode();
       return str.hashCode();
    }

    public DispifCtx clone() {
        DispifCtx cloneObj = new DispifCtx();
        cloneObj.intGroup = new IntGroup();
        cloneObj.intGroup.set(intGroup.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.shortGroup = new ShortGroup();
        cloneObj.shortGroup.set(shortGroup.getClonedField());
        cloneObj.longGroup = new LongGroup();
        cloneObj.longGroup.set(longGroup.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ShortCompareInCtx implements Cloneable {
     ShortGroup shortGroup = DispifCtx.this.getShortGroup();

	/**
	 *	Returns the value of shortX
	 *	@return shortX
	 */   
	 public ShortX getShortX() {
   	return shortGroup.getShortX();
   }

   /**
	* 	Update ShortX with the passed value
	*	@param value
	*/
   public void setShortX(char[] value) throws CFException {
      shortGroup.setShortX(value);
   }   

     /**
	 * 	Update ShortX 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setShortX(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	shortGroup.setShortX(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ShortX 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setShortX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	shortGroup.setShortX(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ShortX with another Field
	 *	@param value
	 */
   public void setShortX(Field source) {
   	shortGroup.setShortX(source);
   }  
   
     /**
	 * 	Update ShortX 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setShortX(Field source, int sourceIndex,int sourceLen) {
   	shortGroup.setShortX(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ShortX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setShortX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	shortGroup.setShortX(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of shortWs
	 *	@return shortWs
	 */
	public int getShortWs() throws CFException {
   		return shortGroup.getShortWs();
	}


	/**
	 *	Returns String value of shortWs
	 *	@return shortWs
	 */
	public char[]  getShortWsString() throws CFException {
	     return String.valueOf(shortGroup.getShortWsString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean shortWsIsNumeric()  throws CFException{
	    return shortGroup.shortWsIsNumeric();
	}

	/**
	 * 	Update ShortWs with the passed value
	 *	@param number
	 */
	public void setShortWs(int number)  throws CFException{
		shortGroup.setShortWs(number);
	}
	

	public void setShortWs(long number)  throws CFException{
	    shortGroup.setShortWs(number);
	}
	
	
	/**
	 * 	Update ShortWs with the passed value
	 *	@param value (String or char[])
	 */
	public void setShortWs(char[] value)  throws CFException {
		shortGroup.setShortWs(value);
	}
	
	/**
	 * 	Update ShortWs with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setShortWsString(char[] value)  throws CFException{
		shortGroup.setShortWs(value);
	}	


        public DispifCtx getDispifCtx() {
            return DispifCtx.this;
        }

        public ShortCompareOutCtx getShortCompareOutCtx() {
            return new ShortCompareOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += shortGroup.hashCode();
       return str.hashCode();
    }

    public ShortCompareInCtx clone() {
        ShortCompareInCtx cloneObj = new ShortCompareInCtx();
        cloneObj.shortGroup = new ShortGroup();
        cloneObj.shortGroup.set(shortGroup.getClonedField());
        return cloneObj;
    }

    }

    public ShortCompareInCtx getShortCompareInCtx() {
            return new ShortCompareInCtx();
    }
     public class ShortCompareOutCtx implements Cloneable {
     ShortGroup shortGroup = DispifCtx.this.getShortGroup();

	/**
	 *	Returns the value of shortX
	 *	@return shortX
	 */   
	 public ShortX getShortX() {
   	return shortGroup.getShortX();
   }

   /**
	* 	Update ShortX with the passed value
	*	@param value
	*/
   public void setShortX(char[] value) throws CFException {
      shortGroup.setShortX(value);
   }   

     /**
	 * 	Update ShortX 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setShortX(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	shortGroup.setShortX(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ShortX 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setShortX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	shortGroup.setShortX(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update ShortX with another Field
	 *	@param value
	 */
   public void setShortX(Field source) {
   	shortGroup.setShortX(source);
   }  
   
     /**
	 * 	Update ShortX 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setShortX(Field source, int sourceIndex,int sourceLen) {
   	shortGroup.setShortX(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update ShortX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setShortX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	shortGroup.setShortX(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of shortWs
	 *	@return shortWs
	 */
	public int getShortWs() throws CFException {
   		return shortGroup.getShortWs();
	}


	/**
	 *	Returns String value of shortWs
	 *	@return shortWs
	 */
	public char[]  getShortWsString() throws CFException {
	     return String.valueOf(shortGroup.getShortWsString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean shortWsIsNumeric()  throws CFException{
	    return shortGroup.shortWsIsNumeric();
	}

	/**
	 * 	Update ShortWs with the passed value
	 *	@param number
	 */
	public void setShortWs(int number)  throws CFException{
		shortGroup.setShortWs(number);
	}
	

	public void setShortWs(long number)  throws CFException{
	    shortGroup.setShortWs(number);
	}
	
	
	/**
	 * 	Update ShortWs with the passed value
	 *	@param value (String or char[])
	 */
	public void setShortWs(char[] value)  throws CFException {
		shortGroup.setShortWs(value);
	}
	
	/**
	 * 	Update ShortWs with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setShortWsString(char[] value)  throws CFException{
		shortGroup.setShortWs(value);
	}	


        public DispifCtx getDispifCtx() {
            return DispifCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += shortGroup.hashCode();
       return str.hashCode();
    }

    public ShortCompareOutCtx clone() {
        ShortCompareOutCtx cloneObj = new ShortCompareOutCtx();
        cloneObj.shortGroup = new ShortGroup();
        cloneObj.shortGroup.set(shortGroup.getClonedField());
        return cloneObj;
    }

    }

    public ShortCompareOutCtx getShortCompareOutCtx() {
            return new ShortCompareOutCtx();
    }
     public class IntCompareInCtx implements Cloneable {
     IntGroup intGroup = DispifCtx.this.getIntGroup();

	/**
	 *	Returns the value of intX
	 *	@return intX
	 */   
	 public IntX getIntX() {
   	return intGroup.getIntX();
   }

   /**
	* 	Update IntX with the passed value
	*	@param value
	*/
   public void setIntX(char[] value) throws CFException {
      intGroup.setIntX(value);
   }   

     /**
	 * 	Update IntX 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIntX(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	intGroup.setIntX(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IntX 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	intGroup.setIntX(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IntX with another Field
	 *	@param value
	 */
   public void setIntX(Field source) {
   	intGroup.setIntX(source);
   }  
   
     /**
	 * 	Update IntX 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIntX(Field source, int sourceIndex,int sourceLen) {
   	intGroup.setIntX(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IntX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	intGroup.setIntX(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of intWs
	 *	@return intWs
	 */
	public long getIntWs() throws CFException {
   		return intGroup.getIntWs();
	}


	/**
	 *	Returns String value of intWs
	 *	@return intWs
	 */
	public char[]  getIntWsString() throws CFException {
	     return String.valueOf(intGroup.getIntWsString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean intWsIsNumeric()  throws CFException{
	    return intGroup.intWsIsNumeric();
	}

	/**
	 * 	Update IntWs with the passed value
	 *	@param number
	 */
	public void setIntWs(long number)  throws CFException{
		intGroup.setIntWs(number);
	}
	

	
	/**
	 * 	Update IntWs with the passed value
	 *	@param value (String or char[])
	 */
	public void setIntWs(char[] value)  throws CFException {
		intGroup.setIntWs(value);
	}
	
	/**
	 * 	Update IntWs with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIntWsString(char[] value)  throws CFException{
		intGroup.setIntWs(value);
	}	


        public DispifCtx getDispifCtx() {
            return DispifCtx.this;
        }

        public IntCompareOutCtx getIntCompareOutCtx() {
            return new IntCompareOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += intGroup.hashCode();
       return str.hashCode();
    }

    public IntCompareInCtx clone() {
        IntCompareInCtx cloneObj = new IntCompareInCtx();
        cloneObj.intGroup = new IntGroup();
        cloneObj.intGroup.set(intGroup.getClonedField());
        return cloneObj;
    }

    }

    public IntCompareInCtx getIntCompareInCtx() {
            return new IntCompareInCtx();
    }
     public class IntCompareOutCtx implements Cloneable {
     IntGroup intGroup = DispifCtx.this.getIntGroup();

	/**
	 *	Returns the value of intX
	 *	@return intX
	 */   
	 public IntX getIntX() {
   	return intGroup.getIntX();
   }

   /**
	* 	Update IntX with the passed value
	*	@param value
	*/
   public void setIntX(char[] value) throws CFException {
      intGroup.setIntX(value);
   }   

     /**
	 * 	Update IntX 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIntX(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	intGroup.setIntX(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IntX 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	intGroup.setIntX(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update IntX with another Field
	 *	@param value
	 */
   public void setIntX(Field source) {
   	intGroup.setIntX(source);
   }  
   
     /**
	 * 	Update IntX 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIntX(Field source, int sourceIndex,int sourceLen) {
   	intGroup.setIntX(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update IntX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	intGroup.setIntX(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of intWs
	 *	@return intWs
	 */
	public long getIntWs() throws CFException {
   		return intGroup.getIntWs();
	}


	/**
	 *	Returns String value of intWs
	 *	@return intWs
	 */
	public char[]  getIntWsString() throws CFException {
	     return String.valueOf(intGroup.getIntWsString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean intWsIsNumeric()  throws CFException{
	    return intGroup.intWsIsNumeric();
	}

	/**
	 * 	Update IntWs with the passed value
	 *	@param number
	 */
	public void setIntWs(long number)  throws CFException{
		intGroup.setIntWs(number);
	}
	

	
	/**
	 * 	Update IntWs with the passed value
	 *	@param value (String or char[])
	 */
	public void setIntWs(char[] value)  throws CFException {
		intGroup.setIntWs(value);
	}
	
	/**
	 * 	Update IntWs with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIntWsString(char[] value)  throws CFException{
		intGroup.setIntWs(value);
	}	


        public DispifCtx getDispifCtx() {
            return DispifCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += intGroup.hashCode();
       return str.hashCode();
    }

    public IntCompareOutCtx clone() {
        IntCompareOutCtx cloneObj = new IntCompareOutCtx();
        cloneObj.intGroup = new IntGroup();
        cloneObj.intGroup.set(intGroup.getClonedField());
        return cloneObj;
    }

    }

    public IntCompareOutCtx getIntCompareOutCtx() {
            return new IntCompareOutCtx();
    }
     public class LongCompareInCtx implements Cloneable {
     IntGroup intGroup = DispifCtx.this.getIntGroup();
     LongGroup longGroup = DispifCtx.this.getLongGroup();

	/**
	 *	Returns the value of intWs
	 *	@return intWs
	 */
	public long getIntWs() throws CFException {
   		return intGroup.getIntWs();
	}


	/**
	 *	Returns String value of intWs
	 *	@return intWs
	 */
	public char[]  getIntWsString() throws CFException {
	     return String.valueOf(intGroup.getIntWsString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean intWsIsNumeric()  throws CFException{
	    return intGroup.intWsIsNumeric();
	}

	/**
	 * 	Update IntWs with the passed value
	 *	@param number
	 */
	public void setIntWs(long number)  throws CFException{
		intGroup.setIntWs(number);
	}
	

	
	/**
	 * 	Update IntWs with the passed value
	 *	@param value (String or char[])
	 */
	public void setIntWs(char[] value)  throws CFException {
		intGroup.setIntWs(value);
	}
	
	/**
	 * 	Update IntWs with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIntWsString(char[] value)  throws CFException{
		intGroup.setIntWs(value);
	}	

	/**
	 *	Returns the value of longX
	 *	@return longX
	 */   
	 public LongX getLongX() {
   	return longGroup.getLongX();
   }

   /**
	* 	Update LongX with the passed value
	*	@param value
	*/
   public void setLongX(char[] value) throws CFException {
      longGroup.setLongX(value);
   }   

     /**
	 * 	Update LongX 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setLongX(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	longGroup.setLongX(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LongX 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLongX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	longGroup.setLongX(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LongX with another Field
	 *	@param value
	 */
   public void setLongX(Field source) {
   	longGroup.setLongX(source);
   }  
   
     /**
	 * 	Update LongX 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setLongX(Field source, int sourceIndex,int sourceLen) {
   	longGroup.setLongX(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LongX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLongX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	longGroup.setLongX(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public DispifCtx getDispifCtx() {
            return DispifCtx.this;
        }

        public LongCompareOutCtx getLongCompareOutCtx() {
            return new LongCompareOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += intGroup.hashCode();
        str += longGroup.hashCode();
       return str.hashCode();
    }

    public LongCompareInCtx clone() {
        LongCompareInCtx cloneObj = new LongCompareInCtx();
        cloneObj.intGroup = new IntGroup();
        cloneObj.intGroup.set(intGroup.getClonedField());
        cloneObj.longGroup = new LongGroup();
        cloneObj.longGroup.set(longGroup.getClonedField());
        return cloneObj;
    }

    }

    public LongCompareInCtx getLongCompareInCtx() {
            return new LongCompareInCtx();
    }
     public class LongCompareOutCtx implements Cloneable {
     IntGroup intGroup = DispifCtx.this.getIntGroup();
     LongGroup longGroup = DispifCtx.this.getLongGroup();

	/**
	 *	Returns the value of intWs
	 *	@return intWs
	 */
	public long getIntWs() throws CFException {
   		return intGroup.getIntWs();
	}


	/**
	 *	Returns String value of intWs
	 *	@return intWs
	 */
	public char[]  getIntWsString() throws CFException {
	     return String.valueOf(intGroup.getIntWsString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean intWsIsNumeric()  throws CFException{
	    return intGroup.intWsIsNumeric();
	}

	/**
	 * 	Update IntWs with the passed value
	 *	@param number
	 */
	public void setIntWs(long number)  throws CFException{
		intGroup.setIntWs(number);
	}
	

	
	/**
	 * 	Update IntWs with the passed value
	 *	@param value (String or char[])
	 */
	public void setIntWs(char[] value)  throws CFException {
		intGroup.setIntWs(value);
	}
	
	/**
	 * 	Update IntWs with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIntWsString(char[] value)  throws CFException{
		intGroup.setIntWs(value);
	}	

	/**
	 *	Returns the value of longX
	 *	@return longX
	 */   
	 public LongX getLongX() {
   	return longGroup.getLongX();
   }

   /**
	* 	Update LongX with the passed value
	*	@param value
	*/
   public void setLongX(char[] value) throws CFException {
      longGroup.setLongX(value);
   }   

     /**
	 * 	Update LongX 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setLongX(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	longGroup.setLongX(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LongX 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLongX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	longGroup.setLongX(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update LongX with another Field
	 *	@param value
	 */
   public void setLongX(Field source) {
   	longGroup.setLongX(source);
   }  
   
     /**
	 * 	Update LongX 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setLongX(Field source, int sourceIndex,int sourceLen) {
   	longGroup.setLongX(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update LongX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLongX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	longGroup.setLongX(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }


        public DispifCtx getDispifCtx() {
            return DispifCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += intGroup.hashCode();
        str += longGroup.hashCode();
       return str.hashCode();
    }

    public LongCompareOutCtx clone() {
        LongCompareOutCtx cloneObj = new LongCompareOutCtx();
        cloneObj.intGroup = new IntGroup();
        cloneObj.intGroup.set(intGroup.getClonedField());
        cloneObj.longGroup = new LongGroup();
        cloneObj.longGroup.set(longGroup.getClonedField());
        return cloneObj;
    }

    }

    public LongCompareOutCtx getLongCompareOutCtx() {
            return new LongCompareOutCtx();
    }
}
