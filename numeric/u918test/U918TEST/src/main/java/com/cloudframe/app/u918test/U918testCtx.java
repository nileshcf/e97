package com.cloudframe.app.u918test;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.u918test.dto.Work;


@Context
public class U918testCtx implements ProgramContext, Cloneable {
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

    public U918testCtx clone() {
        U918testCtx cloneObj = new U918testCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Work work = U918testCtx.this.getWork();

	/**
	 *	Returns the value of src6
	 *	@return src6
	 */
	public long getSrc6() throws CFException {        
   		return work.getSrc6();
	}
	
	/**
	 * 	Update Src6 with the passed value
	 *	@param number
	 */
	public void setSrc6(long number)  throws CFException{
		work.setSrc6(number);
	}



	/**
	 *	Returns the value of src3
	 *	@return src3
	 */
	public long getSrc3() throws CFException {        
   		return work.getSrc3();
	}
	
	/**
	 * 	Update Src3 with the passed value
	 *	@param number
	 */
	public void setSrc3(long number)  throws CFException{
		work.setSrc3(number);
	}




        public U918testCtx getU918testCtx() {
            return U918testCtx.this;
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
     Work work = U918testCtx.this.getWork();

	/**
	 *	Returns the value of tgt3
	 *	@return tgt3
	 */
	public int getTgt3() throws CFException {        
   		return work.getTgt3();
	}
	
	/**
	 * 	Update Tgt3 with the passed value
	 *	@param number
	 */
	public void setTgt3(int number)  throws CFException{
		work.setTgt3(number);
	}


	public void setTgt3(long number)  throws CFException{
		work.setTgt3((int)number);
	}


	/**
	 *	Returns the value of tgt5
	 *	@return tgt5
	 */
	public BigDecimal getTgt5() throws CFException {           
   		return work.getTgt5();
	}
	
	
	/**
	 * 	Update Tgt5 with the passed value
	 *	@param number
	 */
	public void setTgt5(BigDecimal number)  throws CFException{
		work.setTgt5(number);
   }
              

	/**
	 *	Returns the value of tgt7
	 *	@return tgt7
	 */
	public long getTgt7() throws CFException {        
   		return work.getTgt7();
	}
	
	/**
	 * 	Update Tgt7 with the passed value
	 *	@param number
	 */
	public void setTgt7(long number)  throws CFException{
		work.setTgt7(number);
	}



	/**
	 *	Returns the value of tgt4
	 *	@return tgt4
	 */
	public long getTgt4() throws CFException {        
   		return work.getTgt4();
	}
	
	/**
	 * 	Update Tgt4 with the passed value
	 *	@param number
	 */
	public void setTgt4(long number)  throws CFException{
		work.setTgt4(number);
	}



	/**
	 *	Returns the value of tgt6
	 *	@return tgt6
	 */
	public long getTgt6() throws CFException {        
   		return work.getTgt6();
	}
	
	/**
	 * 	Update Tgt6 with the passed value
	 *	@param number
	 */
	public void setTgt6(long number)  throws CFException{
		work.setTgt6(number);
	}



	/**
	 *	Returns the value of src4
	 *	@return src4
	 */
	public long getSrc4() throws CFException {        
   		return work.getSrc4();
	}
	
	/**
	 * 	Update Src4 with the passed value
	 *	@param number
	 */
	public void setSrc4(long number)  throws CFException{
		work.setSrc4(number);
	}



	/**
	 *	Returns the value of src7
	 *	@return src7
	 */
	public long getSrc7() throws CFException {        
   		return work.getSrc7();
	}
	
	/**
	 * 	Update Src7 with the passed value
	 *	@param number
	 */
	public void setSrc7(long number)  throws CFException{
		work.setSrc7(number);
	}



	/**
	 *	Returns the value of src6
	 *	@return src6
	 */
	public long getSrc6() throws CFException {        
   		return work.getSrc6();
	}
	
	/**
	 * 	Update Src6 with the passed value
	 *	@param number
	 */
	public void setSrc6(long number)  throws CFException{
		work.setSrc6(number);
	}



	/**
	 *	Returns the value of src5
	 *	@return src5
	 */
	public long getSrc5() throws CFException {        
   		return work.getSrc5();
	}
	
	/**
	 * 	Update Src5 with the passed value
	 *	@param number
	 */
	public void setSrc5(long number)  throws CFException{
		work.setSrc5(number);
	}



	/**
	 *	Returns the value of src3
	 *	@return src3
	 */
	public long getSrc3() throws CFException {        
   		return work.getSrc3();
	}
	
	/**
	 * 	Update Src3 with the passed value
	 *	@param number
	 */
	public void setSrc3(long number)  throws CFException{
		work.setSrc3(number);
	}




        public U918testCtx getU918testCtx() {
            return U918testCtx.this;
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
     public class Process1Split6OutCtx implements Cloneable {
     Work work = U918testCtx.this.getWork();

	/**
	 *	Returns the value of src12
	 *	@return src12
	 */
	public long getSrc12() throws CFException {        
   		return work.getSrc12();
	}
	
	/**
	 * 	Update Src12 with the passed value
	 *	@param number
	 */
	public void setSrc12(long number)  throws CFException{
		work.setSrc12(number);
	}



	/**
	 *	Returns the value of tgt8
	 *	@return tgt8
	 */
	public short getTgt8() throws CFException {        
   		return work.getTgt8();
	}
	
	/**
	 * 	Update Tgt8 with the passed value
	 *	@param number
	 */
	public void setTgt8(short number)  throws CFException{
		work.setTgt8(number);
	}

	public void setTgt8(int number)  throws CFException{
		work.setTgt8((short)number);
	}

	public void setTgt8(long number)  throws CFException{
		work.setTgt8((short)number);
	}



	/**
	 *	Returns the value of tgt10
	 *	@return tgt10
	 */
   public char[] getTgt10() throws CFException  {              
   		return work.getTgt10();
   }

  
	/**
	*  set variable tgt10
	*  @param value
	**/
   public void setTgt10(char[] value) throws CFException {
      work.setTgt10(value);
   } 

     /**
	 * 	Update Tgt10 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt10(char[] source, int sourceIndex) throws CFException {
      work.setTgt10(source, sourceIndex);
   	
   }
   
   public void setTgt10(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt10(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt10 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt10(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt10(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt10 with another Field
	 *	@param value
	 */
   public void setTgt10(Field source) {
      work.setTgt10(source);
   }  
   
     /**
	 * 	Update Tgt10 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt10(Field source, int sourceIndex,int sourceLen) {
      work.setTgt10(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt10 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt10(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt10(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getTgt12() throws CFException{      
   		return work.getTgt12();
	}

    public char[] getTgt12String() throws CFException {
          return  work.getTgt12().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt12 with the passed number
	 *	@param number
	 */
	public void setTgt12(BigDecimal number)  throws CFException{
		work.setTgt12(number);
   }

	/**
	 *	Returns the value of tgt7
	 *	@return tgt7
	 */
	public long getTgt7() throws CFException {        
   		return work.getTgt7();
	}
	
	/**
	 * 	Update Tgt7 with the passed value
	 *	@param number
	 */
	public void setTgt7(long number)  throws CFException{
		work.setTgt7(number);
	}



	/**
	 *	Returns the value of src10
	 *	@return src10
	 */
	public long getSrc10() throws CFException {        
   		return work.getSrc10();
	}
	
	/**
	 * 	Update Src10 with the passed value
	 *	@param number
	 */
	public void setSrc10(long number)  throws CFException{
		work.setSrc10(number);
	}



	/**
	 *	Returns the value of tgt11
	 *	@return tgt11
	 */
   public char[] getTgt11() throws CFException  {              
   		return work.getTgt11();
   }

  
	/**
	*  set variable tgt11
	*  @param value
	**/
   public void setTgt11(char[] value) throws CFException {
      work.setTgt11(value);
   } 

	/**
	 *	Returns the value of src7
	 *	@return src7
	 */
	public long getSrc7() throws CFException {        
   		return work.getSrc7();
	}
	
	/**
	 * 	Update Src7 with the passed value
	 *	@param number
	 */
	public void setSrc7(long number)  throws CFException{
		work.setSrc7(number);
	}



	/**
	 *	Returns the value of src11
	 *	@return src11
	 */
	public long getSrc11() throws CFException {        
   		return work.getSrc11();
	}
	
	/**
	 * 	Update Src11 with the passed value
	 *	@param number
	 */
	public void setSrc11(long number)  throws CFException{
		work.setSrc11(number);
	}



	/**
	 *	Returns the value of tgt9
	 *	@return tgt9
	 */
	public int getTgt9() throws CFException {        
   		return work.getTgt9();
	}
	
	/**
	 * 	Update Tgt9 with the passed value
	 *	@param number
	 */
	public void setTgt9(int number)  throws CFException{
		work.setTgt9(number);
	}


	public void setTgt9(long number)  throws CFException{
		work.setTgt9((int)number);
	}


	/**
	 *	Returns the value of src8
	 *	@return src8
	 */
	public long getSrc8() throws CFException {        
   		return work.getSrc8();
	}
	
	/**
	 * 	Update Src8 with the passed value
	 *	@param number
	 */
	public void setSrc8(long number)  throws CFException{
		work.setSrc8(number);
	}



	/**
	 *	Returns the value of src9
	 *	@return src9
	 */
	public long getSrc9() throws CFException {        
   		return work.getSrc9();
	}
	
	/**
	 * 	Update Src9 with the passed value
	 *	@param number
	 */
	public void setSrc9(long number)  throws CFException{
		work.setSrc9(number);
	}




        public U918testCtx getU918testCtx() {
            return U918testCtx.this;
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

    public Process1Split6OutCtx clone() {
        Process1Split6OutCtx cloneObj = new Process1Split6OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process1Split6OutCtx getProcess1Split6OutCtx() {
            return new Process1Split6OutCtx();
    }
     public class Process2Split8OutCtx implements Cloneable {
     Work work = U918testCtx.this.getWork();

	public BigDecimal getTgt13() throws CFException{      
   		return work.getTgt13();
	}

    public char[] getTgt13String() throws CFException {
          return  work.getTgt13().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt13 with the passed number
	 *	@param number
	 */
	public void setTgt13(BigDecimal number)  throws CFException{
		work.setTgt13(number);
   }

	/**
	 *	Returns the value of src14
	 *	@return src14
	 */
	public long getSrc14() throws CFException {        
   		return work.getSrc14();
	}
	
	/**
	 * 	Update Src14 with the passed value
	 *	@param number
	 */
	public void setSrc14(long number)  throws CFException{
		work.setSrc14(number);
	}



	/**
	 *	Returns the value of src12
	 *	@return src12
	 */
	public long getSrc12() throws CFException {        
   		return work.getSrc12();
	}
	
	/**
	 * 	Update Src12 with the passed value
	 *	@param number
	 */
	public void setSrc12(long number)  throws CFException{
		work.setSrc12(number);
	}



	/**
	 *	Returns the value of tgt16
	 *	@return tgt16
	 */
	public long getTgt16() throws CFException {
   		return work.getTgt16();
	}


	/**
	 *	Returns String value of tgt16
	 *	@return tgt16
	 */
	public char[]  getTgt16String() throws CFException {
	     return String.valueOf(work.getTgt16String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt16IsNumeric()  throws CFException{
	    return work.tgt16IsNumeric();
	}

	/**
	 * 	Update Tgt16 with the passed value
	 *	@param number
	 */
	public void setTgt16(long number)  throws CFException{
		work.setTgt16(number);
	}
	

	
	/**
	 * 	Update Tgt16 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt16(char[] value)  throws CFException {
		work.setTgt16(value);
	}
	
	/**
	 * 	Update Tgt16 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt16String(char[] value)  throws CFException{
		work.setTgt16(value);
	}	

	public BigDecimal getTgt12() throws CFException{      
   		return work.getTgt12();
	}

    public char[] getTgt12String() throws CFException {
          return  work.getTgt12().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt12 with the passed number
	 *	@param number
	 */
	public void setTgt12(BigDecimal number)  throws CFException{
		work.setTgt12(number);
   }

	/**
	 *	Returns the value of src16
	 *	@return src16
	 */
	public long getSrc16() throws CFException {        
   		return work.getSrc16();
	}
	
	/**
	 * 	Update Src16 with the passed value
	 *	@param number
	 */
	public void setSrc16(long number)  throws CFException{
		work.setSrc16(number);
	}



	public BigDecimal getTgt15() throws CFException{      
   		return work.getTgt15();
	}

    public char[] getTgt15String() throws CFException {
          return  work.getTgt15().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt15 with the passed number
	 *	@param number
	 */
	public void setTgt15(BigDecimal number)  throws CFException{
		work.setTgt15(number);
   }

	/**
	 *	Returns the value of src13
	 *	@return src13
	 */
	public long getSrc13() throws CFException {        
   		return work.getSrc13();
	}
	
	/**
	 * 	Update Src13 with the passed value
	 *	@param number
	 */
	public void setSrc13(long number)  throws CFException{
		work.setSrc13(number);
	}



	public BigDecimal getTgt14() throws CFException{      
   		return work.getTgt14();
	}

    public char[] getTgt14String() throws CFException {
          return  work.getTgt14().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt14 with the passed number
	 *	@param number
	 */
	public void setTgt14(BigDecimal number)  throws CFException{
		work.setTgt14(number);
   }

	/**
	 *	Returns the value of src15
	 *	@return src15
	 */
	public long getSrc15() throws CFException {        
   		return work.getSrc15();
	}
	
	/**
	 * 	Update Src15 with the passed value
	 *	@param number
	 */
	public void setSrc15(long number)  throws CFException{
		work.setSrc15(number);
	}




        public U918testCtx getU918testCtx() {
            return U918testCtx.this;
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

    public Process2Split8OutCtx clone() {
        Process2Split8OutCtx cloneObj = new Process2Split8OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process2Split8OutCtx getProcess2Split8OutCtx() {
            return new Process2Split8OutCtx();
    }
     public class Process3Split10InCtx implements Cloneable {
     Work work = U918testCtx.this.getWork();

	/**
	 *	Returns the value of src18
	 *	@return src18
	 */
	public long getSrc18() throws CFException {        
   		return work.getSrc18();
	}
	
	/**
	 * 	Update Src18 with the passed value
	 *	@param number
	 */
	public void setSrc18(long number)  throws CFException{
		work.setSrc18(number);
	}



	/**
	 *	Returns the value of src21
	 *	@return src21
	 */
	public long getSrc21() throws CFException {        
   		return work.getSrc21();
	}
	
	/**
	 * 	Update Src21 with the passed value
	 *	@param number
	 */
	public void setSrc21(long number)  throws CFException{
		work.setSrc21(number);
	}




        public U918testCtx getU918testCtx() {
            return U918testCtx.this;
        }

        public Process3Split10OutCtx getProcess3Split10OutCtx() {
            return new Process3Split10OutCtx();
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

    public Process3Split10InCtx clone() {
        Process3Split10InCtx cloneObj = new Process3Split10InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process3Split10InCtx getProcess3Split10InCtx() {
            return new Process3Split10InCtx();
    }
     public class Process3Split10OutCtx implements Cloneable {
     Work work = U918testCtx.this.getWork();

	/**
	 *	Returns the value of tgt16
	 *	@return tgt16
	 */
	public long getTgt16() throws CFException {
   		return work.getTgt16();
	}


	/**
	 *	Returns String value of tgt16
	 *	@return tgt16
	 */
	public char[]  getTgt16String() throws CFException {
	     return String.valueOf(work.getTgt16String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt16IsNumeric()  throws CFException{
	    return work.tgt16IsNumeric();
	}

	/**
	 * 	Update Tgt16 with the passed value
	 *	@param number
	 */
	public void setTgt16(long number)  throws CFException{
		work.setTgt16(number);
	}
	

	
	/**
	 * 	Update Tgt16 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt16(char[] value)  throws CFException {
		work.setTgt16(value);
	}
	
	/**
	 * 	Update Tgt16 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt16String(char[] value)  throws CFException{
		work.setTgt16(value);
	}	

	/**
	 *	Returns the value of src17
	 *	@return src17
	 */
	public long getSrc17() throws CFException {        
   		return work.getSrc17();
	}
	
	/**
	 * 	Update Src17 with the passed value
	 *	@param number
	 */
	public void setSrc17(long number)  throws CFException{
		work.setSrc17(number);
	}



	/**
	 *	Returns the value of tgt17
	 *	@return tgt17
	 */
	public long getTgt17() throws CFException {
   		return work.getTgt17();
	}

    /**
	 *	Returns the String value of tgt17
	 *	@return tgt17
	 */
	public char[]  getTgt17ActualString() {
		return work.getTgt17ActualString();
	}

	/**
	 *	Returns String value of tgt17
	 *	@return tgt17
	 */
	public char[]  getTgt17String() throws CFException {
	     return String.valueOf(work.getTgt17String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt17IsNumeric()  throws CFException{
	    return work.tgt17IsNumeric();
	}

	/**
	 * 	Update Tgt17 with the passed value
	 *	@param number
	 */
	public void setTgt17(long number)  throws CFException{
		work.setTgt17(number);
	}
	

	
	/**
	 * 	Update Tgt17 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt17(char[] value)  throws CFException {
		work.setTgt17(value);
	}
	
	/**
	 * 	Update Tgt17 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt17String(char[] value)  throws CFException{
		work.setTgt17(value);
	}	

	/**
	 *	Returns the value of src19
	 *	@return src19
	 */
	public long getSrc19() throws CFException {        
   		return work.getSrc19();
	}
	
	/**
	 * 	Update Src19 with the passed value
	 *	@param number
	 */
	public void setSrc19(long number)  throws CFException{
		work.setSrc19(number);
	}



	/**
	 *	Returns the value of tgt21
	 *	@return tgt21
	 */
	public long getTgt21() throws CFException {        
   		return work.getTgt21();
	}
	
	/**
	 * 	Update Tgt21 with the passed value
	 *	@param number
	 */
	public void setTgt21(long number)  throws CFException{
		work.setTgt21(number);
	}



	/**
	 *	Returns the value of src16
	 *	@return src16
	 */
	public long getSrc16() throws CFException {        
   		return work.getSrc16();
	}
	
	/**
	 * 	Update Src16 with the passed value
	 *	@param number
	 */
	public void setSrc16(long number)  throws CFException{
		work.setSrc16(number);
	}



	/**
	 *	Returns the value of src20
	 *	@return src20
	 */
	public long getSrc20() throws CFException {        
   		return work.getSrc20();
	}
	
	/**
	 * 	Update Src20 with the passed value
	 *	@param number
	 */
	public void setSrc20(long number)  throws CFException{
		work.setSrc20(number);
	}



	/**
	 *	Returns the value of tgt20
	 *	@return tgt20
	 */
	public BigDecimal getTgt20() throws CFException {           
   		return work.getTgt20();
	}
	
	
	/**
	 * 	Update Tgt20 with the passed value
	 *	@param number
	 */
	public void setTgt20(BigDecimal number)  throws CFException{
		work.setTgt20(number);
   }
              

	/**
	 *	Returns the value of src18
	 *	@return src18
	 */
	public long getSrc18() throws CFException {        
   		return work.getSrc18();
	}
	
	/**
	 * 	Update Src18 with the passed value
	 *	@param number
	 */
	public void setSrc18(long number)  throws CFException{
		work.setSrc18(number);
	}



	/**
	 *	Returns the value of tgt19
	 *	@return tgt19
	 */
	public long getTgt19() throws CFException {        
   		return work.getTgt19();
	}
	
	/**
	 * 	Update Tgt19 with the passed value
	 *	@param number
	 */
	public void setTgt19(long number)  throws CFException{
		work.setTgt19(number);
	}



	/**
	 *	Returns the value of src21
	 *	@return src21
	 */
	public long getSrc21() throws CFException {        
   		return work.getSrc21();
	}
	
	/**
	 * 	Update Src21 with the passed value
	 *	@param number
	 */
	public void setSrc21(long number)  throws CFException{
		work.setSrc21(number);
	}



	/**
	 *	Returns the value of tgt18
	 *	@return tgt18
	 */
	public int getTgt18() throws CFException {        
   		return work.getTgt18();
	}
	
	/**
	 * 	Update Tgt18 with the passed value
	 *	@param number
	 */
	public void setTgt18(int number)  throws CFException{
		work.setTgt18(number);
	}


	public void setTgt18(long number)  throws CFException{
		work.setTgt18((int)number);
	}



        public U918testCtx getU918testCtx() {
            return U918testCtx.this;
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

    public Process3Split10OutCtx clone() {
        Process3Split10OutCtx cloneObj = new Process3Split10OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process3Split10OutCtx getProcess3Split10OutCtx() {
            return new Process3Split10OutCtx();
    }
     public class Process4Split12InCtx implements Cloneable {
     Work work = U918testCtx.this.getWork();

	/**
	 *	Returns the value of src21
	 *	@return src21
	 */
	public long getSrc21() throws CFException {        
   		return work.getSrc21();
	}
	
	/**
	 * 	Update Src21 with the passed value
	 *	@param number
	 */
	public void setSrc21(long number)  throws CFException{
		work.setSrc21(number);
	}




        public U918testCtx getU918testCtx() {
            return U918testCtx.this;
        }

        public Process4Split12OutCtx getProcess4Split12OutCtx() {
            return new Process4Split12OutCtx();
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

    public Process4Split12InCtx clone() {
        Process4Split12InCtx cloneObj = new Process4Split12InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process4Split12InCtx getProcess4Split12InCtx() {
            return new Process4Split12InCtx();
    }
     public class Process4Split12OutCtx implements Cloneable {
     Work work = U918testCtx.this.getWork();

	/**
	 *	Returns the value of tgt23
	 *	@return tgt23
	 */
	public short getTgt23() throws CFException {        
   		return work.getTgt23();
	}
	
	/**
	 * 	Update Tgt23 with the passed value
	 *	@param number
	 */
	public void setTgt23(short number)  throws CFException{
		work.setTgt23(number);
	}

	public void setTgt23(int number)  throws CFException{
		work.setTgt23((short)number);
	}

	public void setTgt23(long number)  throws CFException{
		work.setTgt23((short)number);
	}



	/**
	 *	Returns the value of tgt21
	 *	@return tgt21
	 */
	public long getTgt21() throws CFException {        
   		return work.getTgt21();
	}
	
	/**
	 * 	Update Tgt21 with the passed value
	 *	@param number
	 */
	public void setTgt21(long number)  throws CFException{
		work.setTgt21(number);
	}



	/**
	 *	Returns the value of src23
	 *	@return src23
	 */
	public long getSrc23() throws CFException {        
   		return work.getSrc23();
	}
	
	/**
	 * 	Update Src23 with the passed value
	 *	@param number
	 */
	public void setSrc23(long number)  throws CFException{
		work.setSrc23(number);
	}



	/**
	 *	Returns the value of src24
	 *	@return src24
	 */
	public long getSrc24() throws CFException {        
   		return work.getSrc24();
	}
	
	/**
	 * 	Update Src24 with the passed value
	 *	@param number
	 */
	public void setSrc24(long number)  throws CFException{
		work.setSrc24(number);
	}



	/**
	 *	Returns the value of src22
	 *	@return src22
	 */
	public long getSrc22() throws CFException {        
   		return work.getSrc22();
	}
	
	/**
	 * 	Update Src22 with the passed value
	 *	@param number
	 */
	public void setSrc22(long number)  throws CFException{
		work.setSrc22(number);
	}



	/**
	 *	Returns the value of tgt25
	 *	@return tgt25
	 */
   public char[] getTgt25() throws CFException  {              
   		return work.getTgt25();
   }

  
	/**
	*  set variable tgt25
	*  @param value
	**/
   public void setTgt25(char[] value) throws CFException {
      work.setTgt25(value);
   } 

     /**
	 * 	Update Tgt25 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTgt25(char[] source, int sourceIndex) throws CFException {
      work.setTgt25(source, sourceIndex);
   	
   }
   
   public void setTgt25(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setTgt25(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Tgt25 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTgt25(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt25(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Tgt25 with another Field
	 *	@param value
	 */
   public void setTgt25(Field source) {
      work.setTgt25(source);
   }  
   
     /**
	 * 	Update Tgt25 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTgt25(Field source, int sourceIndex,int sourceLen) {
      work.setTgt25(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Tgt25 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTgt25(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setTgt25(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of tgt24
	 *	@return tgt24
	 */
	public int getTgt24() throws CFException {        
   		return work.getTgt24();
	}
	
	/**
	 * 	Update Tgt24 with the passed value
	 *	@param number
	 */
	public void setTgt24(int number)  throws CFException{
		work.setTgt24(number);
	}


	public void setTgt24(long number)  throws CFException{
		work.setTgt24((int)number);
	}


	/**
	 *	Returns the value of src21
	 *	@return src21
	 */
	public long getSrc21() throws CFException {        
   		return work.getSrc21();
	}
	
	/**
	 * 	Update Src21 with the passed value
	 *	@param number
	 */
	public void setSrc21(long number)  throws CFException{
		work.setSrc21(number);
	}



	/**
	 *	Returns the value of src25
	 *	@return src25
	 */
	public long getSrc25() throws CFException {        
   		return work.getSrc25();
	}
	
	/**
	 * 	Update Src25 with the passed value
	 *	@param number
	 */
	public void setSrc25(long number)  throws CFException{
		work.setSrc25(number);
	}



	/**
	 *	Returns the value of tgt22
	 *	@return tgt22
	 */
	public long getTgt22() throws CFException {        
   		return work.getTgt22();
	}
	
	/**
	 * 	Update Tgt22 with the passed value
	 *	@param number
	 */
	public void setTgt22(long number)  throws CFException{
		work.setTgt22(number);
	}




        public U918testCtx getU918testCtx() {
            return U918testCtx.this;
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

    public Process4Split12OutCtx clone() {
        Process4Split12OutCtx cloneObj = new Process4Split12OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process4Split12OutCtx getProcess4Split12OutCtx() {
            return new Process4Split12OutCtx();
    }
     public class Process5Split14OutCtx implements Cloneable {
     Work work = U918testCtx.this.getWork();

	public BigDecimal getTgt28() throws CFException{      
   		return work.getTgt28();
	}

    public char[] getTgt28String() throws CFException {
          return  work.getTgt28().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt28 with the passed number
	 *	@param number
	 */
	public void setTgt28(BigDecimal number)  throws CFException{
		work.setTgt28(number);
   }

	/**
	 *	Returns the value of src28
	 *	@return src28
	 */
	public long getSrc28() throws CFException {        
   		return work.getSrc28();
	}
	
	/**
	 * 	Update Src28 with the passed value
	 *	@param number
	 */
	public void setSrc28(long number)  throws CFException{
		work.setSrc28(number);
	}



	/**
	 *	Returns the value of src27
	 *	@return src27
	 */
	public long getSrc27() throws CFException {        
   		return work.getSrc27();
	}
	
	/**
	 * 	Update Src27 with the passed value
	 *	@param number
	 */
	public void setSrc27(long number)  throws CFException{
		work.setSrc27(number);
	}



	/**
	 *	Returns the value of src30
	 *	@return src30
	 */
	public long getSrc30() throws CFException {        
   		return work.getSrc30();
	}
	
	/**
	 * 	Update Src30 with the passed value
	 *	@param number
	 */
	public void setSrc30(long number)  throws CFException{
		work.setSrc30(number);
	}



	public BigDecimal getTgt30() throws CFException{      
   		return work.getTgt30();
	}

    public char[] getTgt30String() throws CFException {
          return  work.getTgt30().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt30 with the passed number
	 *	@param number
	 */
	public void setTgt30(BigDecimal number)  throws CFException{
		work.setTgt30(number);
   }

	/**
	 *	Returns the value of src26
	 *	@return src26
	 */
	public long getSrc26() throws CFException {        
   		return work.getSrc26();
	}
	
	/**
	 * 	Update Src26 with the passed value
	 *	@param number
	 */
	public void setSrc26(long number)  throws CFException{
		work.setSrc26(number);
	}



	public BigDecimal getTgt27() throws CFException{      
   		return work.getTgt27();
	}

    public char[] getTgt27String() throws CFException {
          return  work.getTgt27().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt27 with the passed number
	 *	@param number
	 */
	public void setTgt27(BigDecimal number)  throws CFException{
		work.setTgt27(number);
   }

	/**
	 *	Returns the value of src29
	 *	@return src29
	 */
	public long getSrc29() throws CFException {        
   		return work.getSrc29();
	}
	
	/**
	 * 	Update Src29 with the passed value
	 *	@param number
	 */
	public void setSrc29(long number)  throws CFException{
		work.setSrc29(number);
	}



	public BigDecimal getTgt29() throws CFException{      
   		return work.getTgt29();
	}

    public char[] getTgt29String() throws CFException {
          return  work.getTgt29().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tgt29 with the passed number
	 *	@param number
	 */
	public void setTgt29(BigDecimal number)  throws CFException{
		work.setTgt29(number);
   }

	/**
	 *	Returns the value of tgt26
	 *	@return tgt26
	 */
   public char[] getTgt26() throws CFException  {              
   		return work.getTgt26();
   }

  
	/**
	*  set variable tgt26
	*  @param value
	**/
   public void setTgt26(char[] value) throws CFException {
      work.setTgt26(value);
   } 


        public U918testCtx getU918testCtx() {
            return U918testCtx.this;
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

    public Process5Split14OutCtx clone() {
        Process5Split14OutCtx cloneObj = new Process5Split14OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process5Split14OutCtx getProcess5Split14OutCtx() {
            return new Process5Split14OutCtx();
    }
     public class Process6OutCtx implements Cloneable {
     Work work = U918testCtx.this.getWork();

	/**
	 *	Returns the value of src31
	 *	@return src31
	 */
	public long getSrc31() throws CFException {        
   		return work.getSrc31();
	}
	
	/**
	 * 	Update Src31 with the passed value
	 *	@param number
	 */
	public void setSrc31(long number)  throws CFException{
		work.setSrc31(number);
	}



	/**
	 *	Returns the value of tgt32
	 *	@return tgt32
	 */
	public long getTgt32() throws CFException {
   		return work.getTgt32();
	}

    /**
	 *	Returns the String value of tgt32
	 *	@return tgt32
	 */
	public char[]  getTgt32ActualString() {
		return work.getTgt32ActualString();
	}

	/**
	 *	Returns String value of tgt32
	 *	@return tgt32
	 */
	public char[]  getTgt32String() throws CFException {
	     return String.valueOf(work.getTgt32String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt32IsNumeric()  throws CFException{
	    return work.tgt32IsNumeric();
	}

	/**
	 * 	Update Tgt32 with the passed value
	 *	@param number
	 */
	public void setTgt32(long number)  throws CFException{
		work.setTgt32(number);
	}
	

	
	/**
	 * 	Update Tgt32 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt32(char[] value)  throws CFException {
		work.setTgt32(value);
	}
	
	/**
	 * 	Update Tgt32 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt32String(char[] value)  throws CFException{
		work.setTgt32(value);
	}	

	/**
	 *	Returns the value of tgt31
	 *	@return tgt31
	 */
	public long getTgt31() throws CFException {
   		return work.getTgt31();
	}


	/**
	 *	Returns String value of tgt31
	 *	@return tgt31
	 */
	public char[]  getTgt31String() throws CFException {
	     return String.valueOf(work.getTgt31String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tgt31IsNumeric()  throws CFException{
	    return work.tgt31IsNumeric();
	}

	/**
	 * 	Update Tgt31 with the passed value
	 *	@param number
	 */
	public void setTgt31(long number)  throws CFException{
		work.setTgt31(number);
	}
	

	
	/**
	 * 	Update Tgt31 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTgt31(char[] value)  throws CFException {
		work.setTgt31(value);
	}
	
	/**
	 * 	Update Tgt31 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTgt31String(char[] value)  throws CFException{
		work.setTgt31(value);
	}	

	/**
	 *	Returns the value of src32
	 *	@return src32
	 */
	public long getSrc32() throws CFException {        
   		return work.getSrc32();
	}
	
	/**
	 * 	Update Src32 with the passed value
	 *	@param number
	 */
	public void setSrc32(long number)  throws CFException{
		work.setSrc32(number);
	}




        public U918testCtx getU918testCtx() {
            return U918testCtx.this;
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

    public Process6OutCtx clone() {
        Process6OutCtx cloneObj = new Process6OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process6OutCtx getProcess6OutCtx() {
            return new Process6OutCtx();
    }
}
