package com.cloudframe.app.unstrng0;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.unstrng0.dto.Work;


@Context
public class Unstrng0Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

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
        str += work.hashCode();
       return str.hashCode();
    }

    public Unstrng0Ctx clone() {
        Unstrng0Ctx cloneObj = new Unstrng0Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Work work = Unstrng0Ctx.this.getWork();

	/**
	 *	Returns the value of inputRecOverflw3
	 *	@return inputRecOverflw3
	 */
   public char[] getInputRecOverflw3() throws CFException  {              
   		return work.getInputRecOverflw3();
   }

  
	/**
	*  set variable inputRecOverflw3
	*  @param value
	**/
   public void setInputRecOverflw3(char[] value) throws CFException {
      work.setInputRecOverflw3(value);
   } 

	/**
	 *	Returns the value of data0
	 *	@return data0
	 */
   public char[] getData0() throws CFException  {              
   		return work.getData0();
   }

  
	/**
	*  set variable data0
	*  @param value
	**/
   public void setData0(char[] value) throws CFException {
      work.setData0(value);
   } 

	/**
	 *	Returns the value of inputRecOverflw1
	 *	@return inputRecOverflw1
	 */
   public char[] getInputRecOverflw1() throws CFException  {              
   		return work.getInputRecOverflw1();
   }

  
	/**
	*  set variable inputRecOverflw1
	*  @param value
	**/
   public void setInputRecOverflw1(char[] value) throws CFException {
      work.setInputRecOverflw1(value);
   } 

	/**
	 *	Returns the value of data0Len
	 *	@return data0Len
	 */
	public short getData0Len() throws CFException {        
   		return work.getData0Len();
	}
	
	/**
	 * 	Update Data0Len with the passed value
	 *	@param number
	 */
	public void setData0Len(short number)  throws CFException{
		work.setData0Len(number);
	}

	public void setData0Len(int number)  throws CFException{
		work.setData0Len((short)number);
	}

	public void setData0Len(long number)  throws CFException{
		work.setData0Len((short)number);
	}



	/**
	 *	Returns the value of inputRec
	 *	@return inputRec
	 */
   public char[] getInputRec() throws CFException  {              
   		return work.getInputRec();
   }

  
	/**
	*  set variable inputRec
	*  @param value
	**/
   public void setInputRec(char[] value) throws CFException {
      work.setInputRec(value);
   } 

	/**
	 *	Returns the value of delim4
	 *	@return delim4
	 */
   public char[] getDelim4() throws CFException  {              
   		return work.getDelim4();
   }

  
	/**
	*  set variable delim4
	*  @param value
	**/
   public void setDelim4(char[] value) throws CFException {
      work.setDelim4(value);
   } 

	/**
	 *	Returns the value of delim3
	 *	@return delim3
	 */
   public char[] getDelim3() throws CFException  {              
   		return work.getDelim3();
   }

  
	/**
	*  set variable delim3
	*  @param value
	**/
   public void setDelim3(char[] value) throws CFException {
      work.setDelim3(value);
   } 

	/**
	 *	Returns the value of valc
	 *	@return valc
	 */
   public char[] getValc() throws CFException  {              
   		return work.getValc();
   }

  
	/**
	*  set variable valc
	*  @param value
	**/
   public void setValc(char[] value) throws CFException {
      work.setValc(value);
   } 

	/**
	 *	Returns the value of tally
	 *	@return tally
	 */
	public long getTally() throws CFException {
   		return work.getTally();
	}


	/**
	 *	Returns String value of tally
	 *	@return tally
	 */
	public char[]  getTallyString() throws CFException {
	     return String.valueOf(work.getTallyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tallyIsNumeric()  throws CFException{
	    return work.tallyIsNumeric();
	}

	/**
	 * 	Update Tally with the passed value
	 *	@param number
	 */
	public void setTally(long number)  throws CFException{
		work.setTally(number);
	}
	

	
	/**
	 * 	Update Tally with the passed value
	 *	@param value (String or char[])
	 */
	public void setTally(char[] value)  throws CFException {
		work.setTally(value);
	}
	
	/**
	 * 	Update Tally with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTallyString(char[] value)  throws CFException{
		work.setTally(value);
	}	

	/**
	 *	Returns the value of delim1
	 *	@return delim1
	 */
   public char[] getDelim1() throws CFException  {              
   		return work.getDelim1();
   }

  
	/**
	*  set variable delim1
	*  @param value
	**/
   public void setDelim1(char[] value) throws CFException {
      work.setDelim1(value);
   } 

	/**
	 *	Returns the value of inputRecOverflw2
	 *	@return inputRecOverflw2
	 */
   public char[] getInputRecOverflw2() throws CFException  {              
   		return work.getInputRecOverflw2();
   }

  
	/**
	*  set variable inputRecOverflw2
	*  @param value
	**/
   public void setInputRecOverflw2(char[] value) throws CFException {
      work.setInputRecOverflw2(value);
   } 

	/**
	 *	Returns the value of data
	 *	@return data
	 */
   public char[] getData() throws CFException  {              
   		return work.getData();
   }

  
	/**
	*  set variable data
	*  @param value
	**/
   public void setData(char[] value) throws CFException {
      work.setData(value);
   } 


        public Unstrng0Ctx getUnstrng0Ctx() {
            return Unstrng0Ctx.this;
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
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessOutCtx implements Cloneable {
     Work work = Unstrng0Ctx.this.getWork();

	/**
	 *	Returns the value of val5
	 *	@return val5
	 */
   public char[] getVal5() throws CFException  {              
   		return work.getVal5();
   }

  
	/**
	*  set variable val5
	*  @param value
	**/
   public void setVal5(char[] value) throws CFException {
      work.setVal5(value);
   } 

	/**
	 *	Returns the value of val8
	 *	@return val8
	 */
   public char[] getVal8() throws CFException  {              
   		return work.getVal8();
   }

  
	/**
	*  set variable val8
	*  @param value
	**/
   public void setVal8(char[] value) throws CFException {
      work.setVal8(value);
   } 

	/**
	 *	Returns the value of val3
	 *	@return val3
	 */
   public char[] getVal3() throws CFException  {              
   		return work.getVal3();
   }

  
	/**
	*  set variable val3
	*  @param value
	**/
   public void setVal3(char[] value) throws CFException {
      work.setVal3(value);
   } 

	/**
	 *	Returns the value of data0Len
	 *	@return data0Len
	 */
	public short getData0Len() throws CFException {        
   		return work.getData0Len();
	}
	
	/**
	 * 	Update Data0Len with the passed value
	 *	@param number
	 */
	public void setData0Len(short number)  throws CFException{
		work.setData0Len(number);
	}

	public void setData0Len(int number)  throws CFException{
		work.setData0Len((short)number);
	}

	public void setData0Len(long number)  throws CFException{
		work.setData0Len((short)number);
	}



	/**
	 *	Returns the value of count4
	 *	@return count4
	 */
	public long getCount4() throws CFException {
   		return work.getCount4();
	}


	/**
	 *	Returns String value of count4
	 *	@return count4
	 */
	public char[]  getCount4String() throws CFException {
	     return String.valueOf(work.getCount4String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean count4IsNumeric()  throws CFException{
	    return work.count4IsNumeric();
	}

	/**
	 * 	Update Count4 with the passed value
	 *	@param number
	 */
	public void setCount4(long number)  throws CFException{
		work.setCount4(number);
	}
	

	
	/**
	 * 	Update Count4 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCount4(char[] value)  throws CFException {
		work.setCount4(value);
	}
	
	/**
	 * 	Update Count4 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCount4String(char[] value)  throws CFException{
		work.setCount4(value);
	}	

	/**
	 *	Returns the value of val1
	 *	@return val1
	 */
   public char[] getVal1() throws CFException  {              
   		return work.getVal1();
   }

  
	/**
	*  set variable val1
	*  @param value
	**/
   public void setVal1(char[] value) throws CFException {
      work.setVal1(value);
   } 

	/**
	 *	Returns the value of field1
	 *	@return field1
	 */
   public char[] getField1() throws CFException  {              
   		return work.getField1();
   }

  
	/**
	*  set variable field1
	*  @param value
	**/
   public void setField1(char[] value) throws CFException {
      work.setField1(value);
   } 

	/**
	 *	Returns the value of field4
	 *	@return field4
	 */
   public char[] getField4() throws CFException  {              
   		return work.getField4();
   }

  
	/**
	*  set variable field4
	*  @param value
	**/
   public void setField4(char[] value) throws CFException {
      work.setField4(value);
   } 

public int getCount5() throws CFException {  
        return work.getCount5();
}
	/**
	 * 	Update Count5 with the passed value
	 *	@param number
	 */
	public void setCount5(int number)  throws CFException{
		work.setCount5(number);
	}


	public void setCount5(long number)  throws CFException{
	    work.setCount5(number);
	}
	

	/**
	 *	Returns the value of val2
	 *	@return val2
	 */
   public char[] getVal2() throws CFException  {              
   		return work.getVal2();
   }

  
	/**
	*  set variable val2
	*  @param value
	**/
   public void setVal2(char[] value) throws CFException {
      work.setVal2(value);
   } 

	/**
	 *	Returns the value of vala
	 *	@return vala
	 */
   public char[] getVala() throws CFException  {              
   		return work.getVala();
   }

  
	/**
	*  set variable vala
	*  @param value
	**/
   public void setVala(char[] value) throws CFException {
      work.setVala(value);
   } 

	/**
	 *	Returns the value of count
	 *	@return count
	 */
	public int getCount() throws CFException {        
   		return work.getCount();
	}
	
	/**
	 * 	Update Count with the passed value
	 *	@param number
	 */
	public void setCount(int number)  throws CFException{
		work.setCount(number);
	}


	public void setCount(long number)  throws CFException{
		work.setCount((int)number);
	}


	/**
	 *	Returns the value of retain
	 *	@return retain
	 */
   public char[] getRetain() throws CFException  {              
   		return work.getRetain();
   }

  
	/**
	*  set variable retain
	*  @param value
	**/
   public void setRetain(char[] value) throws CFException {
      work.setRetain(value);
   } 

	/**
	 *	Returns the value of field3
	 *	@return field3
	 */
   public char[] getField3() throws CFException  {              
   		return work.getField3();
   }

  
	/**
	*  set variable field3
	*  @param value
	**/
   public void setField3(char[] value) throws CFException {
      work.setField3(value);
   } 

	/**
	 *	Returns the value of val7
	 *	@return val7
	 */
   public char[] getVal7() throws CFException  {              
   		return work.getVal7();
   }

  
	/**
	*  set variable val7
	*  @param value
	**/
   public void setVal7(char[] value) throws CFException {
      work.setVal7(value);
   } 

	/**
	 *	Returns the value of val9
	 *	@return val9
	 */
   public char[] getVal9() throws CFException  {              
   		return work.getVal9();
   }

  
	/**
	*  set variable val9
	*  @param value
	**/
   public void setVal9(char[] value) throws CFException {
      work.setVal9(value);
   } 

	/**
	 *	Returns the value of valb
	 *	@return valb
	 */
   public char[] getValb() throws CFException  {              
   		return work.getValb();
   }

  
	/**
	*  set variable valb
	*  @param value
	**/
   public void setValb(char[] value) throws CFException {
      work.setValb(value);
   } 

	/**
	 *	Returns the value of field5
	 *	@return field5
	 */
   public char[] getField5() throws CFException  {              
   		return work.getField5();
   }

  
	/**
	*  set variable field5
	*  @param value
	**/
   public void setField5(char[] value) throws CFException {
      work.setField5(value);
   } 

	/**
	 *	Returns the value of count2
	 *	@return count2
	 */
	public long getCount2() throws CFException {
   		return work.getCount2();
	}


	/**
	 *	Returns String value of count2
	 *	@return count2
	 */
	public char[]  getCount2String() throws CFException {
	     return String.valueOf(work.getCount2String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean count2IsNumeric()  throws CFException{
	    return work.count2IsNumeric();
	}

	/**
	 * 	Update Count2 with the passed value
	 *	@param number
	 */
	public void setCount2(long number)  throws CFException{
		work.setCount2(number);
	}
	

	
	/**
	 * 	Update Count2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCount2(char[] value)  throws CFException {
		work.setCount2(value);
	}
	
	/**
	 * 	Update Count2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCount2String(char[] value)  throws CFException{
		work.setCount2(value);
	}	

	/**
	 *	Returns the value of count1
	 *	@return count1
	 */
	public int getCount1() throws CFException {        
   		return work.getCount1();
	}
	
	/**
	 * 	Update Count1 with the passed value
	 *	@param number
	 */
	public void setCount1(int number)  throws CFException{
		work.setCount1(number);
	}


	public void setCount1(long number)  throws CFException{
		work.setCount1((int)number);
	}


	/**
	 *	Returns the value of pointer
	 *	@return pointer
	 */
	public long getPointer() throws CFException {
   		return work.getPointer();
	}


	/**
	 *	Returns String value of pointer
	 *	@return pointer
	 */
	public char[]  getPointerString() throws CFException {
	     return String.valueOf(work.getPointerString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean pointerIsNumeric()  throws CFException{
	    return work.pointerIsNumeric();
	}

	/**
	 * 	Update Pointer with the passed value
	 *	@param number
	 */
	public void setPointer(long number)  throws CFException{
		work.setPointer(number);
	}
	

	
	/**
	 * 	Update Pointer with the passed value
	 *	@param value (String or char[])
	 */
	public void setPointer(char[] value)  throws CFException {
		work.setPointer(value);
	}
	
	/**
	 * 	Update Pointer with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPointerString(char[] value)  throws CFException{
		work.setPointer(value);
	}	

	/**
	 *	Returns the value of field2
	 *	@return field2
	 */
   public char[] getField2() throws CFException  {              
   		return work.getField2();
   }

  
	/**
	*  set variable field2
	*  @param value
	**/
   public void setField2(char[] value) throws CFException {
      work.setField2(value);
   } 

	/**
	 *	Returns the value of val6
	 *	@return val6
	 */
   public char[] getVal6() throws CFException  {              
   		return work.getVal6();
   }

  
	/**
	*  set variable val6
	*  @param value
	**/
   public void setVal6(char[] value) throws CFException {
      work.setVal6(value);
   } 

	/**
	 *	Returns the value of val4
	 *	@return val4
	 */
   public char[] getVal4() throws CFException  {              
   		return work.getVal4();
   }

  
	/**
	*  set variable val4
	*  @param value
	**/
   public void setVal4(char[] value) throws CFException {
      work.setVal4(value);
   } 

public int getCount3() throws CFException {  
        return work.getCount3();
}
	/**
	 * 	Update Count3 with the passed value
	 *	@param number
	 */
	public void setCount3(int number)  throws CFException{
		work.setCount3(number);
	}


	public void setCount3(long number)  throws CFException{
	    work.setCount3(number);
	}
	


        public Unstrng0Ctx getUnstrng0Ctx() {
            return Unstrng0Ctx.this;
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

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
}
