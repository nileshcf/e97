package com.cloudframe.app.inspct1;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.inspct1.dto.Work;


@Context
public class Inspct1Ctx implements ProgramContext, Cloneable {
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

    public Inspct1Ctx clone() {
        Inspct1Ctx cloneObj = new Inspct1Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Work work = Inspct1Ctx.this.getWork();

	/**
	 *	Returns the value of convrtPredicate
	 *	@return convrtPredicate
	 */
   public char[] getConvrtPredicate() throws CFException  {              
   		return work.getConvrtPredicate();
   }

  
	/**
	*  set variable convrtPredicate
	*  @param value
	**/
   public void setConvrtPredicate(char[] value) throws CFException {
      work.setConvrtPredicate(value);
   } 

	/**
	 *	Returns the value of replacPredicate
	 *	@return replacPredicate
	 */
   public char[] getReplacPredicate() throws CFException  {              
   		return work.getReplacPredicate();
   }

  
	/**
	*  set variable replacPredicate
	*  @param value
	**/
   public void setReplacPredicate(char[] value) throws CFException {
      work.setReplacPredicate(value);
   } 

	/**
	 *	Returns the value of sub3
	 *	@return sub3
	 */
	public int getSub3() throws CFException {        
   		return work.getSub3();
	}
	
	/**
	 * 	Update Sub3 with the passed value
	 *	@param number
	 */
	public void setSub3(int number)  throws CFException{
		work.setSub3(number);
	}


	public void setSub3(long number)  throws CFException{
		work.setSub3((int)number);
	}


	/**
	 *	Returns the value of searchPredicate
	 *	@return searchPredicate
	 */
   public char[] getSearchPredicate() throws CFException  {              
   		return work.getSearchPredicate();
   }

  
	/**
	*  set variable searchPredicate
	*  @param value
	**/
   public void setSearchPredicate(char[] value) throws CFException {
      work.setSearchPredicate(value);
   } 


        public Inspct1Ctx getInspct1Ctx() {
            return Inspct1Ctx.this;
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
     Work work = Inspct1Ctx.this.getWork();

	/**
	 *	Returns the value of subEdt
	 *	@return subEdt
	 */
   public char[] getSubEdt() throws CFException  {              
   		return work.getSubEdt();
   }

  
	/**
	*  set variable subEdt
	*  @param value
	**/
   public void setSubEdt(char[] value) throws CFException {
      work.setSubEdt(value);
   } 

     /**
	 * 	Update SubEdt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSubEdt(char[] source, int sourceIndex) throws CFException {
      work.setSubEdt(source, sourceIndex);
   	
   }
   
   public void setSubEdt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSubEdt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SubEdt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSubEdt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSubEdt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SubEdt with another Field
	 *	@param value
	 */
   public void setSubEdt(Field source) {
      work.setSubEdt(source);
   }  
   
     /**
	 * 	Update SubEdt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSubEdt(Field source, int sourceIndex,int sourceLen) {
      work.setSubEdt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SubEdt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSubEdt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSubEdt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sub3
	 *	@return sub3
	 */
	public int getSub3() throws CFException {        
   		return work.getSub3();
	}
	
	/**
	 * 	Update Sub3 with the passed value
	 *	@param number
	 */
	public void setSub3(int number)  throws CFException{
		work.setSub3(number);
	}


	public void setSub3(long number)  throws CFException{
		work.setSub3((int)number);
	}



        public Inspct1Ctx getInspct1Ctx() {
            return Inspct1Ctx.this;
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
     public class Process1Split3InCtx implements Cloneable {
     Work work = Inspct1Ctx.this.getWork();

	/**
	 *	Returns the value of subEdt
	 *	@return subEdt
	 */
   public char[] getSubEdt() throws CFException  {              
   		return work.getSubEdt();
   }

  
	/**
	*  set variable subEdt
	*  @param value
	**/
   public void setSubEdt(char[] value) throws CFException {
      work.setSubEdt(value);
   } 

     /**
	 * 	Update SubEdt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSubEdt(char[] source, int sourceIndex) throws CFException {
      work.setSubEdt(source, sourceIndex);
   	
   }
   
   public void setSubEdt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSubEdt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SubEdt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSubEdt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSubEdt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SubEdt with another Field
	 *	@param value
	 */
   public void setSubEdt(Field source) {
      work.setSubEdt(source);
   }  
   
     /**
	 * 	Update SubEdt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSubEdt(Field source, int sourceIndex,int sourceLen) {
      work.setSubEdt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SubEdt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSubEdt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSubEdt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sub3
	 *	@return sub3
	 */
	public int getSub3() throws CFException {        
   		return work.getSub3();
	}
	
	/**
	 * 	Update Sub3 with the passed value
	 *	@param number
	 */
	public void setSub3(int number)  throws CFException{
		work.setSub3(number);
	}


	public void setSub3(long number)  throws CFException{
		work.setSub3((int)number);
	}


	/**
	 *	Returns the value of searchPredicate
	 *	@return searchPredicate
	 */
   public char[] getSearchPredicate() throws CFException  {              
   		return work.getSearchPredicate();
   }

  
	/**
	*  set variable searchPredicate
	*  @param value
	**/
   public void setSearchPredicate(char[] value) throws CFException {
      work.setSearchPredicate(value);
   } 

	/**
	 *	Returns the value of searchPredicate2
	 *	@return searchPredicate2
	 */
   public char[] getSearchPredicate2() throws CFException  {              
   		return work.getSearchPredicate2();
   }

  
	/**
	*  set variable searchPredicate2
	*  @param value
	**/
   public void setSearchPredicate2(char[] value) throws CFException {
      work.setSearchPredicate2(value);
   } 


        public Inspct1Ctx getInspct1Ctx() {
            return Inspct1Ctx.this;
        }

        public Process1Split3OutCtx getProcess1Split3OutCtx() {
            return new Process1Split3OutCtx();
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

    public Process1Split3InCtx clone() {
        Process1Split3InCtx cloneObj = new Process1Split3InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process1Split3InCtx getProcess1Split3InCtx() {
            return new Process1Split3InCtx();
    }
     public class Process1Split3OutCtx implements Cloneable {
     Work work = Inspct1Ctx.this.getWork();

	/**
	 *	Returns the value of parm
	 *	@return parm
	 */
   public char[] getParm() throws CFException  {              
   		return work.getParm();
   }

  
	/**
	*  set variable parm
	*  @param value
	**/
   public void setParm(char[] value) throws CFException {
      work.setParm(value);
   } 

	/**
	 *	Returns the value of subEdt
	 *	@return subEdt
	 */
   public char[] getSubEdt() throws CFException  {              
   		return work.getSubEdt();
   }

  
	/**
	*  set variable subEdt
	*  @param value
	**/
   public void setSubEdt(char[] value) throws CFException {
      work.setSubEdt(value);
   } 

     /**
	 * 	Update SubEdt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSubEdt(char[] source, int sourceIndex) throws CFException {
      work.setSubEdt(source, sourceIndex);
   	
   }
   
   public void setSubEdt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSubEdt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SubEdt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSubEdt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSubEdt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SubEdt with another Field
	 *	@param value
	 */
   public void setSubEdt(Field source) {
      work.setSubEdt(source);
   }  
   
     /**
	 * 	Update SubEdt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSubEdt(Field source, int sourceIndex,int sourceLen) {
      work.setSubEdt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SubEdt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSubEdt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSubEdt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of sub3
	 *	@return sub3
	 */
	public int getSub3() throws CFException {        
   		return work.getSub3();
	}
	
	/**
	 * 	Update Sub3 with the passed value
	 *	@param number
	 */
	public void setSub3(int number)  throws CFException{
		work.setSub3(number);
	}


	public void setSub3(long number)  throws CFException{
		work.setSub3((int)number);
	}



        public Inspct1Ctx getInspct1Ctx() {
            return Inspct1Ctx.this;
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

    public Process1Split3OutCtx clone() {
        Process1Split3OutCtx cloneObj = new Process1Split3OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process1Split3OutCtx getProcess1Split3OutCtx() {
            return new Process1Split3OutCtx();
    }
     public class Process2Split5InCtx implements Cloneable {
     Work work = Inspct1Ctx.this.getWork();

	/**
	 *	Returns the value of sub3
	 *	@return sub3
	 */
	public int getSub3() throws CFException {        
   		return work.getSub3();
	}
	
	/**
	 * 	Update Sub3 with the passed value
	 *	@param number
	 */
	public void setSub3(int number)  throws CFException{
		work.setSub3(number);
	}


	public void setSub3(long number)  throws CFException{
		work.setSub3((int)number);
	}


	/**
	 *	Returns the value of counterLine
	 *	@return counterLine
	 */
   public char[] getCounterLine() throws CFException  {              
   		return work.getCounterLine();
   }

  
	/**
	*  set variable counterLine
	*  @param value
	**/
   public void setCounterLine(char[] value) throws CFException {
      work.setCounterLine(value);
   } 

	/**
	 *	Returns the value of ltCount
	 *	@return ltCount
	 */
	public short getLtCount() throws CFException {        
   		return work.getLtCount();
	}
	
	/**
	 * 	Update LtCount with the passed value
	 *	@param number
	 */
	public void setLtCount(short number)  throws CFException{
		work.setLtCount(number);
	}

	public void setLtCount(int number)  throws CFException{
		work.setLtCount((short)number);
	}

	public void setLtCount(long number)  throws CFException{
		work.setLtCount((short)number);
	}




        public Inspct1Ctx getInspct1Ctx() {
            return Inspct1Ctx.this;
        }

        public Process2Split5OutCtx getProcess2Split5OutCtx() {
            return new Process2Split5OutCtx();
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

    public Process2Split5InCtx clone() {
        Process2Split5InCtx cloneObj = new Process2Split5InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process2Split5InCtx getProcess2Split5InCtx() {
            return new Process2Split5InCtx();
    }
     public class Process2Split5OutCtx implements Cloneable {
     Work work = Inspct1Ctx.this.getWork();

	/**
	 *	Returns the value of sub2
	 *	@return sub2
	 */
	public short getSub2() throws CFException {        
   		return work.getSub2();
	}
	
	/**
	 * 	Update Sub2 with the passed value
	 *	@param number
	 */
	public void setSub2(short number)  throws CFException{
		work.setSub2(number);
	}

	public void setSub2(int number)  throws CFException{
		work.setSub2((short)number);
	}

	public void setSub2(long number)  throws CFException{
		work.setSub2((short)number);
	}



	/**
	 *	Returns the value of floatDollarCount
	 *	@return floatDollarCount
	 */
	public short getFloatDollarCount() throws CFException {        
   		return work.getFloatDollarCount();
	}
	
	/**
	 * 	Update FloatDollarCount with the passed value
	 *	@param number
	 */
	public void setFloatDollarCount(short number)  throws CFException{
		work.setFloatDollarCount(number);
	}

	public void setFloatDollarCount(int number)  throws CFException{
		work.setFloatDollarCount((short)number);
	}

	public void setFloatDollarCount(long number)  throws CFException{
		work.setFloatDollarCount((short)number);
	}



	/**
	 *	Returns the value of floatPlusCount
	 *	@return floatPlusCount
	 */
	public short getFloatPlusCount() throws CFException {        
   		return work.getFloatPlusCount();
	}
	
	/**
	 * 	Update FloatPlusCount with the passed value
	 *	@param number
	 */
	public void setFloatPlusCount(short number)  throws CFException{
		work.setFloatPlusCount(number);
	}

	public void setFloatPlusCount(int number)  throws CFException{
		work.setFloatPlusCount((short)number);
	}

	public void setFloatPlusCount(long number)  throws CFException{
		work.setFloatPlusCount((short)number);
	}



	/**
	 *	Returns the value of floatMinusCount
	 *	@return floatMinusCount
	 */
	public short getFloatMinusCount() throws CFException {        
   		return work.getFloatMinusCount();
	}
	
	/**
	 * 	Update FloatMinusCount with the passed value
	 *	@param number
	 */
	public void setFloatMinusCount(short number)  throws CFException{
		work.setFloatMinusCount(number);
	}

	public void setFloatMinusCount(int number)  throws CFException{
		work.setFloatMinusCount((short)number);
	}

	public void setFloatMinusCount(long number)  throws CFException{
		work.setFloatMinusCount((short)number);
	}



	/**
	 *	Returns the value of subEdt
	 *	@return subEdt
	 */
   public char[] getSubEdt() throws CFException  {              
   		return work.getSubEdt();
   }

  
	/**
	*  set variable subEdt
	*  @param value
	**/
   public void setSubEdt(char[] value) throws CFException {
      work.setSubEdt(value);
   } 

     /**
	 * 	Update SubEdt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSubEdt(char[] source, int sourceIndex) throws CFException {
      work.setSubEdt(source, sourceIndex);
   	
   }
   
   public void setSubEdt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSubEdt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SubEdt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSubEdt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSubEdt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SubEdt with another Field
	 *	@param value
	 */
   public void setSubEdt(Field source) {
      work.setSubEdt(source);
   }  
   
     /**
	 * 	Update SubEdt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSubEdt(Field source, int sourceIndex,int sourceLen) {
      work.setSubEdt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SubEdt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSubEdt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSubEdt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of htmlMLength
	 *	@return htmlMLength
	 */
	public short getHtmlMLength() throws CFException {        
   		return work.getHtmlMLength();
	}
	
	/**
	 * 	Update HtmlMLength with the passed value
	 *	@param number
	 */
	public void setHtmlMLength(short number)  throws CFException{
		work.setHtmlMLength(number);
	}

	public void setHtmlMLength(int number)  throws CFException{
		work.setHtmlMLength((short)number);
	}

	public void setHtmlMLength(long number)  throws CFException{
		work.setHtmlMLength((short)number);
	}



	/**
	 *	Returns the value of sub3
	 *	@return sub3
	 */
	public int getSub3() throws CFException {        
   		return work.getSub3();
	}
	
	/**
	 * 	Update Sub3 with the passed value
	 *	@param number
	 */
	public void setSub3(int number)  throws CFException{
		work.setSub3(number);
	}


	public void setSub3(long number)  throws CFException{
		work.setSub3((int)number);
	}


	/**
	 *	Returns the value of counterLine
	 *	@return counterLine
	 */
   public char[] getCounterLine() throws CFException  {              
   		return work.getCounterLine();
   }

  
	/**
	*  set variable counterLine
	*  @param value
	**/
   public void setCounterLine(char[] value) throws CFException {
      work.setCounterLine(value);
   } 

	/**
	 *	Returns the value of xmlSegment
	 *	@return xmlSegment
	 */
   public char[] getXmlSegment() throws CFException  {              
   		return work.getXmlSegment();
   }

  
	/**
	*  set variable xmlSegment
	*  @param value
	**/
   public void setXmlSegment(char[] value) throws CFException {
      work.setXmlSegment(value);
   } 

	/**
	 *	Returns the value of sub1
	 *	@return sub1
	 */
	public short getSub1() throws CFException {        
   		return work.getSub1();
	}
	
	/**
	 * 	Update Sub1 with the passed value
	 *	@param number
	 */
	public void setSub1(short number)  throws CFException{
		work.setSub1(number);
	}

	public void setSub1(int number)  throws CFException{
		work.setSub1((short)number);
	}

	public void setSub1(long number)  throws CFException{
		work.setSub1((short)number);
	}



	/**
	 *	Returns the value of ltCount
	 *	@return ltCount
	 */
	public short getLtCount() throws CFException {        
   		return work.getLtCount();
	}
	
	/**
	 * 	Update LtCount with the passed value
	 *	@param number
	 */
	public void setLtCount(short number)  throws CFException{
		work.setLtCount(number);
	}

	public void setLtCount(int number)  throws CFException{
		work.setLtCount((short)number);
	}

	public void setLtCount(long number)  throws CFException{
		work.setLtCount((short)number);
	}




        public Inspct1Ctx getInspct1Ctx() {
            return Inspct1Ctx.this;
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

    public Process2Split5OutCtx clone() {
        Process2Split5OutCtx cloneObj = new Process2Split5OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process2Split5OutCtx getProcess2Split5OutCtx() {
            return new Process2Split5OutCtx();
    }
     public class Process3InCtx implements Cloneable {
     Work work = Inspct1Ctx.this.getWork();

	/**
	 *	Returns the value of sub2
	 *	@return sub2
	 */
	public short getSub2() throws CFException {        
   		return work.getSub2();
	}
	
	/**
	 * 	Update Sub2 with the passed value
	 *	@param number
	 */
	public void setSub2(short number)  throws CFException{
		work.setSub2(number);
	}

	public void setSub2(int number)  throws CFException{
		work.setSub2((short)number);
	}

	public void setSub2(long number)  throws CFException{
		work.setSub2((short)number);
	}



	/**
	 *	Returns the value of subEdt
	 *	@return subEdt
	 */
   public char[] getSubEdt() throws CFException  {              
   		return work.getSubEdt();
   }

  
	/**
	*  set variable subEdt
	*  @param value
	**/
   public void setSubEdt(char[] value) throws CFException {
      work.setSubEdt(value);
   } 

     /**
	 * 	Update SubEdt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSubEdt(char[] source, int sourceIndex) throws CFException {
      work.setSubEdt(source, sourceIndex);
   	
   }
   
   public void setSubEdt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSubEdt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SubEdt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSubEdt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSubEdt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SubEdt with another Field
	 *	@param value
	 */
   public void setSubEdt(Field source) {
      work.setSubEdt(source);
   }  
   
     /**
	 * 	Update SubEdt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSubEdt(Field source, int sourceIndex,int sourceLen) {
      work.setSubEdt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SubEdt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSubEdt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSubEdt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ampersand
	 *	@return ampersand
	 */
   public char[] getAmpersand() throws CFException  {              
   		return work.getAmpersand();
   }

  
	/**
	*  set variable ampersand
	*  @param value
	**/
   public void setAmpersand(char[] value) throws CFException {
      work.setAmpersand(value);
   } 

	/**
	 *	Returns the value of doublquote
	 *	@return doublquote
	 */
   public char[] getDoublquote() throws CFException  {              
   		return work.getDoublquote();
   }

  
	/**
	*  set variable doublquote
	*  @param value
	**/
   public void setDoublquote(char[] value) throws CFException {
      work.setDoublquote(value);
   } 

	/**
	 *	Returns the value of htmlMLength
	 *	@return htmlMLength
	 */
	public short getHtmlMLength() throws CFException {        
   		return work.getHtmlMLength();
	}
	
	/**
	 * 	Update HtmlMLength with the passed value
	 *	@param number
	 */
	public void setHtmlMLength(short number)  throws CFException{
		work.setHtmlMLength(number);
	}

	public void setHtmlMLength(int number)  throws CFException{
		work.setHtmlMLength((short)number);
	}

	public void setHtmlMLength(long number)  throws CFException{
		work.setHtmlMLength((short)number);
	}



	/**
	 *	Returns the value of apostrophe
	 *	@return apostrophe
	 */
   public char[] getApostrophe() throws CFException  {              
   		return work.getApostrophe();
   }

  
	/**
	*  set variable apostrophe
	*  @param value
	**/
   public void setApostrophe(char[] value) throws CFException {
      work.setApostrophe(value);
   } 

	/**
	 *	Returns the value of sub3
	 *	@return sub3
	 */
	public int getSub3() throws CFException {        
   		return work.getSub3();
	}
	
	/**
	 * 	Update Sub3 with the passed value
	 *	@param number
	 */
	public void setSub3(int number)  throws CFException{
		work.setSub3(number);
	}


	public void setSub3(long number)  throws CFException{
		work.setSub3((int)number);
	}


	/**
	 *	Returns the value of lessthan
	 *	@return lessthan
	 */
   public char[] getLessthan() throws CFException  {              
   		return work.getLessthan();
   }

  
	/**
	*  set variable lessthan
	*  @param value
	**/
   public void setLessthan(char[] value) throws CFException {
      work.setLessthan(value);
   } 

	/**
	 *	Returns the value of greaterthan
	 *	@return greaterthan
	 */
   public char[] getGreaterthan() throws CFException  {              
   		return work.getGreaterthan();
   }

  
	/**
	*  set variable greaterthan
	*  @param value
	**/
   public void setGreaterthan(char[] value) throws CFException {
      work.setGreaterthan(value);
   } 


        public Inspct1Ctx getInspct1Ctx() {
            return Inspct1Ctx.this;
        }

        public Process3OutCtx getProcess3OutCtx() {
            return new Process3OutCtx();
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

    public Process3InCtx clone() {
        Process3InCtx cloneObj = new Process3InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process3InCtx getProcess3InCtx() {
            return new Process3InCtx();
    }
     public class Process3OutCtx implements Cloneable {
     Work work = Inspct1Ctx.this.getWork();

	/**
	 *	Returns the value of sub2
	 *	@return sub2
	 */
	public short getSub2() throws CFException {        
   		return work.getSub2();
	}
	
	/**
	 * 	Update Sub2 with the passed value
	 *	@param number
	 */
	public void setSub2(short number)  throws CFException{
		work.setSub2(number);
	}

	public void setSub2(int number)  throws CFException{
		work.setSub2((short)number);
	}

	public void setSub2(long number)  throws CFException{
		work.setSub2((short)number);
	}



	/**
	 *	Returns the value of subEdt
	 *	@return subEdt
	 */
   public char[] getSubEdt() throws CFException  {              
   		return work.getSubEdt();
   }

  
	/**
	*  set variable subEdt
	*  @param value
	**/
   public void setSubEdt(char[] value) throws CFException {
      work.setSubEdt(value);
   } 

     /**
	 * 	Update SubEdt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSubEdt(char[] source, int sourceIndex) throws CFException {
      work.setSubEdt(source, sourceIndex);
   	
   }
   
   public void setSubEdt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setSubEdt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update SubEdt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSubEdt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSubEdt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update SubEdt with another Field
	 *	@param value
	 */
   public void setSubEdt(Field source) {
      work.setSubEdt(source);
   }  
   
     /**
	 * 	Update SubEdt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSubEdt(Field source, int sourceIndex,int sourceLen) {
      work.setSubEdt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update SubEdt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSubEdt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setSubEdt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of htmlMLength
	 *	@return htmlMLength
	 */
	public short getHtmlMLength() throws CFException {        
   		return work.getHtmlMLength();
	}
	
	/**
	 * 	Update HtmlMLength with the passed value
	 *	@param number
	 */
	public void setHtmlMLength(short number)  throws CFException{
		work.setHtmlMLength(number);
	}

	public void setHtmlMLength(int number)  throws CFException{
		work.setHtmlMLength((short)number);
	}

	public void setHtmlMLength(long number)  throws CFException{
		work.setHtmlMLength((short)number);
	}



	/**
	 *	Returns the value of counterLine
	 *	@return counterLine
	 */
   public char[] getCounterLine() throws CFException  {              
   		return work.getCounterLine();
   }

  
	/**
	*  set variable counterLine
	*  @param value
	**/
   public void setCounterLine(char[] value) throws CFException {
      work.setCounterLine(value);
   } 

	/**
	 *	Returns the value of sub3
	 *	@return sub3
	 */
	public int getSub3() throws CFException {        
   		return work.getSub3();
	}
	
	/**
	 * 	Update Sub3 with the passed value
	 *	@param number
	 */
	public void setSub3(int number)  throws CFException{
		work.setSub3(number);
	}


	public void setSub3(long number)  throws CFException{
		work.setSub3((int)number);
	}


	/**
	 *	Returns the value of sub1
	 *	@return sub1
	 */
	public short getSub1() throws CFException {        
   		return work.getSub1();
	}
	
	/**
	 * 	Update Sub1 with the passed value
	 *	@param number
	 */
	public void setSub1(short number)  throws CFException{
		work.setSub1(number);
	}

	public void setSub1(int number)  throws CFException{
		work.setSub1((short)number);
	}

	public void setSub1(long number)  throws CFException{
		work.setSub1((short)number);
	}




        public Inspct1Ctx getInspct1Ctx() {
            return Inspct1Ctx.this;
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

    public Process3OutCtx clone() {
        Process3OutCtx cloneObj = new Process3OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Process3OutCtx getProcess3OutCtx() {
            return new Process3OutCtx();
    }
}
