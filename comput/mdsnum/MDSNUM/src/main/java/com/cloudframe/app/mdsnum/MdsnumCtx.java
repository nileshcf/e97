package com.cloudframe.app.mdsnum;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.mdsnum.dto.Work;
import com.cloudframe.app.mdsnum.dto.MiscAreas;
import com.cloudframe.app.mdsnum.dto.Amtdt4Group;
import com.cloudframe.app.mdsnum.dto.AmteGroup;


@Context
public class MdsnumCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Amtdt4Group amtdt4Group;
    AmteGroup amteGroup;
    MiscAreas miscAreas;
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


    public Amtdt4Group getAmtdt4Group() {
        if (amtdt4Group == null) {
            amtdt4Group = new Amtdt4Group();
        }

        return amtdt4Group;
    }

    public void setAmtdt4Group(Amtdt4Group amtdt4Group) {
        this.amtdt4Group = amtdt4Group;
    }
    public AmteGroup getAmteGroup() {
        if (amteGroup == null) {
            amteGroup = new AmteGroup();
        }

        return amteGroup;
    }

    public void setAmteGroup(AmteGroup amteGroup) {
        this.amteGroup = amteGroup;
    }
    public MiscAreas getMiscAreas() {
        if (miscAreas == null) {
            miscAreas = new MiscAreas();
        }

        return miscAreas;
    }

    public void setMiscAreas(MiscAreas miscAreas) {
        this.miscAreas = miscAreas;
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
        str += amtdt4Group.hashCode();
        str += amteGroup.hashCode();
        str += miscAreas.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public MdsnumCtx clone() {
        MdsnumCtx cloneObj = new MdsnumCtx();
        cloneObj.amtdt4Group = new Amtdt4Group();
        cloneObj.amtdt4Group.set(amtdt4Group.getClonedField());
        cloneObj.amteGroup = new AmteGroup();
        cloneObj.amteGroup.set(amteGroup.getClonedField());
        cloneObj.miscAreas = new MiscAreas();
        cloneObj.miscAreas.set(miscAreas.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Amtdt4Group amtdt4Group = MdsnumCtx.this.getAmtdt4Group();
     AmteGroup amteGroup = MdsnumCtx.this.getAmteGroup();
     MiscAreas miscAreas = MdsnumCtx.this.getMiscAreas();
     Work work = MdsnumCtx.this.getWork();

	/**
	 *	Returns the value of impDec
	 *	@return impDec
	 */
	public int getImpDec() throws CFException {
   		return work.getImpDec();
	}


	/**
	 *	Returns String value of impDec
	 *	@return impDec
	 */
	public char[]  getImpDecString() throws CFException {
	     return String.valueOf(work.getImpDecString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean impDecIsNumeric()  throws CFException{
	    return work.impDecIsNumeric();
	}

	/**
	 * 	Update ImpDec with the passed value
	 *	@param number
	 */
	public void setImpDec(int number)  throws CFException{
		work.setImpDec(number);
	}
	

	public void setImpDec(long number)  throws CFException{
	    work.setImpDec(number);
	}
	
	
	/**
	 * 	Update ImpDec with the passed value
	 *	@param value (String or char[])
	 */
	public void setImpDec(char[] value)  throws CFException {
		work.setImpDec(value);
	}
	
	/**
	 * 	Update ImpDec with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setImpDecString(char[] value)  throws CFException{
		work.setImpDec(value);
	}	


        public MdsnumCtx getMdsnumCtx() {
            return MdsnumCtx.this;
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
        str += amtdt4Group.hashCode();
        str += amteGroup.hashCode();
        str += miscAreas.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.amtdt4Group = new Amtdt4Group();
        cloneObj.amtdt4Group.set(amtdt4Group.getClonedField());
        cloneObj.amteGroup = new AmteGroup();
        cloneObj.amteGroup.set(amteGroup.getClonedField());
        cloneObj.miscAreas = new MiscAreas();
        cloneObj.miscAreas.set(miscAreas.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessOutCtx implements Cloneable {
     Amtdt4Group amtdt4Group = MdsnumCtx.this.getAmtdt4Group();
     AmteGroup amteGroup = MdsnumCtx.this.getAmteGroup();
     MiscAreas miscAreas = MdsnumCtx.this.getMiscAreas();
     Work work = MdsnumCtx.this.getWork();

	/**
	 *	Returns the value of amtd6
	 *	@return amtd6
	 */
   public char[] getAmtd6() throws CFException  {              
   		return miscAreas.getAmtd6();
   }

  
	/**
	*  set variable amtd6
	*  @param value
	**/
   public void setAmtd6(char[] value) throws CFException {
      miscAreas.setAmtd6(value);
   } 

     /**
	 * 	Update Amtd6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtd6(char[] source, int sourceIndex) throws CFException {
      miscAreas.setAmtd6(source, sourceIndex);
   	
   }
   
   public void setAmtd6(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      miscAreas.setAmtd6(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Amtd6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtd6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      miscAreas.setAmtd6(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Amtd6 with another Field
	 *	@param value
	 */
   public void setAmtd6(Field source) {
      miscAreas.setAmtd6(source);
   }  
   
     /**
	 * 	Update Amtd6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtd6(Field source, int sourceIndex,int sourceLen) {
      miscAreas.setAmtd6(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Amtd6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtd6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      miscAreas.setAmtd6(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of amtd7
	 *	@return amtd7
	 */
   public char[] getAmtd7() throws CFException  {              
   		return miscAreas.getAmtd7();
   }

  
	/**
	*  set variable amtd7
	*  @param value
	**/
   public void setAmtd7(char[] value) throws CFException {
      miscAreas.setAmtd7(value);
   } 

     /**
	 * 	Update Amtd7 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtd7(char[] source, int sourceIndex) throws CFException {
      miscAreas.setAmtd7(source, sourceIndex);
   	
   }
   
   public void setAmtd7(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      miscAreas.setAmtd7(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Amtd7 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtd7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      miscAreas.setAmtd7(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Amtd7 with another Field
	 *	@param value
	 */
   public void setAmtd7(Field source) {
      miscAreas.setAmtd7(source);
   }  
   
     /**
	 * 	Update Amtd7 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtd7(Field source, int sourceIndex,int sourceLen) {
      miscAreas.setAmtd7(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Amtd7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtd7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      miscAreas.setAmtd7(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of amtd0
	 *	@return amtd0
	 */
   public char[] getAmtd0() throws CFException  {              
   		return miscAreas.getAmtd0();
   }

  
	/**
	*  set variable amtd0
	*  @param value
	**/
   public void setAmtd0(char[] value) throws CFException {
      miscAreas.setAmtd0(value);
   } 

     /**
	 * 	Update Amtd0 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtd0(char[] source, int sourceIndex) throws CFException {
      miscAreas.setAmtd0(source, sourceIndex);
   	
   }
   
   public void setAmtd0(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      miscAreas.setAmtd0(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Amtd0 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtd0(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      miscAreas.setAmtd0(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Amtd0 with another Field
	 *	@param value
	 */
   public void setAmtd0(Field source) {
      miscAreas.setAmtd0(source);
   }  
   
     /**
	 * 	Update Amtd0 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtd0(Field source, int sourceIndex,int sourceLen) {
      miscAreas.setAmtd0(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Amtd0 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtd0(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      miscAreas.setAmtd0(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of impAmtT4
	 *	@return impAmtT4
	 */
	public long getImpAmtT4() throws CFException {
   		return work.getImpAmtT4();
	}

    /**
	 *	Returns the String value of impAmtT4
	 *	@return impAmtT4
	 */
	public char[]  getImpAmtT4ActualString() {
		return work.getImpAmtT4ActualString();
	}

	/**
	 *	Returns String value of impAmtT4
	 *	@return impAmtT4
	 */
	public char[]  getImpAmtT4String() throws CFException {
	     return String.valueOf(work.getImpAmtT4String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean impAmtT4IsNumeric()  throws CFException{
	    return work.impAmtT4IsNumeric();
	}

	/**
	 * 	Update ImpAmtT4 with the passed value
	 *	@param number
	 */
	public void setImpAmtT4(long number)  throws CFException{
		work.setImpAmtT4(number);
	}
	

	
	/**
	 * 	Update ImpAmtT4 with the passed value
	 *	@param value (String or char[])
	 */
	public void setImpAmtT4(char[] value)  throws CFException {
		work.setImpAmtT4(value);
	}
	
	/**
	 * 	Update ImpAmtT4 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setImpAmtT4String(char[] value)  throws CFException{
		work.setImpAmtT4(value);
	}	

	/**
	 *	Returns the value of impDec
	 *	@return impDec
	 */
	public int getImpDec() throws CFException {
   		return work.getImpDec();
	}


	/**
	 *	Returns String value of impDec
	 *	@return impDec
	 */
	public char[]  getImpDecString() throws CFException {
	     return String.valueOf(work.getImpDecString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean impDecIsNumeric()  throws CFException{
	    return work.impDecIsNumeric();
	}

	/**
	 * 	Update ImpDec with the passed value
	 *	@param number
	 */
	public void setImpDec(int number)  throws CFException{
		work.setImpDec(number);
	}
	

	public void setImpDec(long number)  throws CFException{
	    work.setImpDec(number);
	}
	
	
	/**
	 * 	Update ImpDec with the passed value
	 *	@param value (String or char[])
	 */
	public void setImpDec(char[] value)  throws CFException {
		work.setImpDec(value);
	}
	
	/**
	 * 	Update ImpDec with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setImpDecString(char[] value)  throws CFException{
		work.setImpDec(value);
	}	

	/**
	 *	Returns the value of amtd5
	 *	@return amtd5
	 */
   public char[] getAmtd5() throws CFException  {              
   		return miscAreas.getAmtd5();
   }

  
	/**
	*  set variable amtd5
	*  @param value
	**/
   public void setAmtd5(char[] value) throws CFException {
      miscAreas.setAmtd5(value);
   } 

     /**
	 * 	Update Amtd5 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtd5(char[] source, int sourceIndex) throws CFException {
      miscAreas.setAmtd5(source, sourceIndex);
   	
   }
   
   public void setAmtd5(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      miscAreas.setAmtd5(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Amtd5 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtd5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      miscAreas.setAmtd5(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Amtd5 with another Field
	 *	@param value
	 */
   public void setAmtd5(Field source) {
      miscAreas.setAmtd5(source);
   }  
   
     /**
	 * 	Update Amtd5 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtd5(Field source, int sourceIndex,int sourceLen) {
      miscAreas.setAmtd5(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Amtd5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtd5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      miscAreas.setAmtd5(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of amtd2
	 *	@return amtd2
	 */
   public char[] getAmtd2() throws CFException  {              
   		return miscAreas.getAmtd2();
   }

  
	/**
	*  set variable amtd2
	*  @param value
	**/
   public void setAmtd2(char[] value) throws CFException {
      miscAreas.setAmtd2(value);
   } 

     /**
	 * 	Update Amtd2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtd2(char[] source, int sourceIndex) throws CFException {
      miscAreas.setAmtd2(source, sourceIndex);
   	
   }
   
   public void setAmtd2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      miscAreas.setAmtd2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Amtd2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtd2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      miscAreas.setAmtd2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Amtd2 with another Field
	 *	@param value
	 */
   public void setAmtd2(Field source) {
      miscAreas.setAmtd2(source);
   }  
   
     /**
	 * 	Update Amtd2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtd2(Field source, int sourceIndex,int sourceLen) {
      miscAreas.setAmtd2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Amtd2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtd2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      miscAreas.setAmtd2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of amtd4
	 *	@return amtd4
	 */
   public char[] getAmtd4() throws CFException  {              
   		return miscAreas.getAmtd4();
   }

  
	/**
	*  set variable amtd4
	*  @param value
	**/
   public void setAmtd4(char[] value) throws CFException {
      miscAreas.setAmtd4(value);
   } 

     /**
	 * 	Update Amtd4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtd4(char[] source, int sourceIndex) throws CFException {
      miscAreas.setAmtd4(source, sourceIndex);
   	
   }
   
   public void setAmtd4(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      miscAreas.setAmtd4(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Amtd4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtd4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      miscAreas.setAmtd4(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Amtd4 with another Field
	 *	@param value
	 */
   public void setAmtd4(Field source) {
      miscAreas.setAmtd4(source);
   }  
   
     /**
	 * 	Update Amtd4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtd4(Field source, int sourceIndex,int sourceLen) {
      miscAreas.setAmtd4(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Amtd4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtd4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      miscAreas.setAmtd4(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of amte6
	 *	@return amte6
	 */
   public char[] getAmte6() throws CFException  {              
   		return amteGroup.getAmte6();
   }

  
	/**
	*  set variable amte6
	*  @param value
	**/
   public void setAmte6(char[] value) throws CFException {
      amteGroup.setAmte6(value);
   } 

     /**
	 * 	Update Amte6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmte6(char[] source, int sourceIndex) throws CFException {
      amteGroup.setAmte6(source, sourceIndex);
   	
   }
   
   public void setAmte6(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      amteGroup.setAmte6(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Amte6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmte6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      amteGroup.setAmte6(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Amte6 with another Field
	 *	@param value
	 */
   public void setAmte6(Field source) {
      amteGroup.setAmte6(source);
   }  
   
     /**
	 * 	Update Amte6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmte6(Field source, int sourceIndex,int sourceLen) {
      amteGroup.setAmte6(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Amte6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmte6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      amteGroup.setAmte6(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of amtd
	 *	@return amtd
	 */
   public char[] getAmtd() throws CFException  {              
   		return miscAreas.getAmtd();
   }

  
	/**
	*  set variable amtd
	*  @param value
	**/
   public void setAmtd(char[] value) throws CFException {
      miscAreas.setAmtd(value);
   } 

     /**
	 * 	Update Amtd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtd(char[] source, int sourceIndex) throws CFException {
      miscAreas.setAmtd(source, sourceIndex);
   	
   }
   
   public void setAmtd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      miscAreas.setAmtd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Amtd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      miscAreas.setAmtd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Amtd with another Field
	 *	@param value
	 */
   public void setAmtd(Field source) {
      miscAreas.setAmtd(source);
   }  
   
     /**
	 * 	Update Amtd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtd(Field source, int sourceIndex,int sourceLen) {
      miscAreas.setAmtd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Amtd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      miscAreas.setAmtd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of miscAreas
	 *	@return miscAreas
	 */   
	 public MiscAreas getMiscAreas() {
   	return miscAreas;
   }


	/**
	 *	Returns the value of amtdt46
	 *	@return amtdt46
	 */
   public char[] getAmtdt46() throws CFException  {              
   		return amtdt4Group.getAmtdt46();
   }

  
	/**
	*  set variable amtdt46
	*  @param value
	**/
   public void setAmtdt46(char[] value) throws CFException {
      amtdt4Group.setAmtdt46(value);
   } 

     /**
	 * 	Update Amtdt46 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtdt46(char[] source, int sourceIndex) throws CFException {
      amtdt4Group.setAmtdt46(source, sourceIndex);
   	
   }
   
   public void setAmtdt46(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      amtdt4Group.setAmtdt46(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Amtdt46 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtdt46(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      amtdt4Group.setAmtdt46(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Amtdt46 with another Field
	 *	@param value
	 */
   public void setAmtdt46(Field source) {
      amtdt4Group.setAmtdt46(source);
   }  
   
     /**
	 * 	Update Amtdt46 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtdt46(Field source, int sourceIndex,int sourceLen) {
      amtdt4Group.setAmtdt46(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Amtdt46 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtdt46(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      amtdt4Group.setAmtdt46(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of amtd1
	 *	@return amtd1
	 */
   public char[] getAmtd1() throws CFException  {              
   		return miscAreas.getAmtd1();
   }

  
	/**
	*  set variable amtd1
	*  @param value
	**/
   public void setAmtd1(char[] value) throws CFException {
      miscAreas.setAmtd1(value);
   } 

     /**
	 * 	Update Amtd1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtd1(char[] source, int sourceIndex) throws CFException {
      miscAreas.setAmtd1(source, sourceIndex);
   	
   }
   
   public void setAmtd1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      miscAreas.setAmtd1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Amtd1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtd1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      miscAreas.setAmtd1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Amtd1 with another Field
	 *	@param value
	 */
   public void setAmtd1(Field source) {
      miscAreas.setAmtd1(source);
   }  
   
     /**
	 * 	Update Amtd1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtd1(Field source, int sourceIndex,int sourceLen) {
      miscAreas.setAmtd1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Amtd1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtd1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      miscAreas.setAmtd1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of impAmt
	 *	@return impAmt
	 */
	public long getImpAmt() throws CFException {
   		return work.getImpAmt();
	}

    /**
	 *	Returns the String value of impAmt
	 *	@return impAmt
	 */
	public char[]  getImpAmtActualString() {
		return work.getImpAmtActualString();
	}

	/**
	 *	Returns String value of impAmt
	 *	@return impAmt
	 */
	public char[]  getImpAmtString() throws CFException {
	     return String.valueOf(work.getImpAmtString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean impAmtIsNumeric()  throws CFException{
	    return work.impAmtIsNumeric();
	}

	/**
	 * 	Update ImpAmt with the passed value
	 *	@param number
	 */
	public void setImpAmt(long number)  throws CFException{
		work.setImpAmt(number);
	}
	

	
	/**
	 * 	Update ImpAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setImpAmt(char[] value)  throws CFException {
		work.setImpAmt(value);
	}
	
	/**
	 * 	Update ImpAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setImpAmtString(char[] value)  throws CFException{
		work.setImpAmt(value);
	}	

	/**
	 *	Returns the value of amtd3
	 *	@return amtd3
	 */
   public char[] getAmtd3() throws CFException  {              
   		return miscAreas.getAmtd3();
   }

  
	/**
	*  set variable amtd3
	*  @param value
	**/
   public void setAmtd3(char[] value) throws CFException {
      miscAreas.setAmtd3(value);
   } 

     /**
	 * 	Update Amtd3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAmtd3(char[] source, int sourceIndex) throws CFException {
      miscAreas.setAmtd3(source, sourceIndex);
   	
   }
   
   public void setAmtd3(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      miscAreas.setAmtd3(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Amtd3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAmtd3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      miscAreas.setAmtd3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Amtd3 with another Field
	 *	@param value
	 */
   public void setAmtd3(Field source) {
      miscAreas.setAmtd3(source);
   }  
   
     /**
	 * 	Update Amtd3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAmtd3(Field source, int sourceIndex,int sourceLen) {
      miscAreas.setAmtd3(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Amtd3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAmtd3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      miscAreas.setAmtd3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of impAmte
	 *	@return impAmte
	 */
	public long getImpAmte() throws CFException {
   		return work.getImpAmte();
	}

    /**
	 *	Returns the String value of impAmte
	 *	@return impAmte
	 */
	public char[]  getImpAmteActualString() {
		return work.getImpAmteActualString();
	}

	/**
	 *	Returns String value of impAmte
	 *	@return impAmte
	 */
	public char[]  getImpAmteString() throws CFException {
	     return String.valueOf(work.getImpAmteString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean impAmteIsNumeric()  throws CFException{
	    return work.impAmteIsNumeric();
	}

	/**
	 * 	Update ImpAmte with the passed value
	 *	@param number
	 */
	public void setImpAmte(long number)  throws CFException{
		work.setImpAmte(number);
	}
	

	
	/**
	 * 	Update ImpAmte with the passed value
	 *	@param value (String or char[])
	 */
	public void setImpAmte(char[] value)  throws CFException {
		work.setImpAmte(value);
	}
	
	/**
	 * 	Update ImpAmte with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setImpAmteString(char[] value)  throws CFException{
		work.setImpAmte(value);
	}	


        public MdsnumCtx getMdsnumCtx() {
            return MdsnumCtx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += amtdt4Group.hashCode();
        str += amteGroup.hashCode();
        str += miscAreas.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.amtdt4Group = new Amtdt4Group();
        cloneObj.amtdt4Group.set(amtdt4Group.getClonedField());
        cloneObj.amteGroup = new AmteGroup();
        cloneObj.amteGroup.set(amteGroup.getClonedField());
        cloneObj.miscAreas = new MiscAreas();
        cloneObj.miscAreas.set(miscAreas.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
}
