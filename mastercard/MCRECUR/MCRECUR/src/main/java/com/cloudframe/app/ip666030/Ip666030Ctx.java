package com.cloudframe.app.ip666030;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.ip666030.dto.Work;
import com.cloudframe.app.global.sharedvar.Ip66601UserTag;
import com.cloudframe.app.global.sharedvar.Ip66601UserTagId;
import com.cloudframe.app.global.sharedvar.Ip66601UserTagInformation;
import com.cloudframe.app.ip666030.dto.StartGroup800;
import com.cloudframe.app.global.sharedvar.Ip66607SortInfo;


@Context
public class Ip666030Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    StartGroup800 startGroup800;
    Ip66601UserTagInformation ip66601UserTagInformation;
    Ip66607SortInfo ip66607SortInfo;
    Work work;

    int end800;
    int median800;
    int ip66601UserStart;
    int ip66601UserRight;
    int left800;
    int ip66601UserMedian;
    int right800;
    int ip66601UserLeft;
    int ip66601UserEnd;

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


    public StartGroup800 getStartGroup800() {
        if (startGroup800 == null) {
            startGroup800 = new StartGroup800();
        }

        return startGroup800;
    }

    public void setStartGroup800(StartGroup800 startGroup800) {
        this.startGroup800 = startGroup800;
    }
    public Ip66601UserTagInformation getIp66601UserTagInformation() {
        if (ip66601UserTagInformation == null) {
            ip66601UserTagInformation = globalCtx.getGlobalDto(Ip66601UserTagInformation.class);
        }

        return ip66601UserTagInformation;
    }

    public Ip66607SortInfo getIp66607SortInfo() {
        if (ip66607SortInfo == null) {
            ip66607SortInfo = globalCtx.getGlobalDto(Ip66607SortInfo.class);
        }

        return ip66607SortInfo;
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

    public int getEnd800() {
        return end800;
    }

    public void setEnd800(int end800) {
        this.end800 = end800;
    }
    public int getMedian800() {
        return median800;
    }

    public void setMedian800(int median800) {
        this.median800 = median800;
    }
    public int getIp66601UserStart() {
        return ip66601UserStart;
    }

    public void setIp66601UserStart(int ip66601UserStart) {
        this.ip66601UserStart = ip66601UserStart;
    }
    public int getIp66601UserRight() {
        return ip66601UserRight;
    }

    public void setIp66601UserRight(int ip66601UserRight) {
        this.ip66601UserRight = ip66601UserRight;
    }
    public int getLeft800() {
        return left800;
    }

    public void setLeft800(int left800) {
        this.left800 = left800;
    }
    public int getIp66601UserMedian() {
        return ip66601UserMedian;
    }

    public void setIp66601UserMedian(int ip66601UserMedian) {
        this.ip66601UserMedian = ip66601UserMedian;
    }
    public int getRight800() {
        return right800;
    }

    public void setRight800(int right800) {
        this.right800 = right800;
    }
    public int getIp66601UserLeft() {
        return ip66601UserLeft;
    }

    public void setIp66601UserLeft(int ip66601UserLeft) {
        this.ip66601UserLeft = ip66601UserLeft;
    }
    public int getIp66601UserEnd() {
        return ip66601UserEnd;
    }

    public void setIp66601UserEnd(int ip66601UserEnd) {
        this.ip66601UserEnd = ip66601UserEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += startGroup800.hashCode();
        str += ip66601UserTagInformation.hashCode();
        str += ip66607SortInfo.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public Ip666030Ctx clone() {
        Ip666030Ctx cloneObj = new Ip666030Ctx();
        cloneObj.startGroup800 = new StartGroup800();
        cloneObj.startGroup800.set(startGroup800.getClonedField());
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        cloneObj.ip66607SortInfo = new Ip66607SortInfo();
        cloneObj.ip66607SortInfo.set(ip66607SortInfo.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Ip66601UserTagInformation ip66601UserTagInformation = Ip666030Ctx.this.getIp66601UserTagInformation();
     StartGroup800 startGroup800 = Ip666030Ctx.this.getStartGroup800();
     Ip66607SortInfo ip66607SortInfo = Ip666030Ctx.this.getIp66607SortInfo();
     Work work = Ip666030Ctx.this.getWork();


public void setIp66601UserRight(int ip66601UserRight) { 
    Ip666030Ctx.this.ip66601UserRight = ip66601UserRight;
}

public int getIp66601UserRight() { 
    return Ip666030Ctx.this.ip66601UserRight;
}
	/**
	 *	Returns the value of left800
	 *	@return left800
	 */
	public int getLeft800() throws CFException {        
   		return left800;
	}
	
	/**
	 * 	Update Left800 with the passed value
	 *	@param number
	 */
	public void setLeft800(int number)  throws CFException{
		Ip666030Ctx.this.setLeft800(number);
	}


	public void setLeft800(long number)  throws CFException{
		Ip666030Ctx.this.setLeft800((int)number);
	}



public void setIp66601UserMedian(int ip66601UserMedian) { 
    Ip666030Ctx.this.ip66601UserMedian = ip66601UserMedian;
}

public int getIp66601UserMedian() { 
    return Ip666030Ctx.this.ip66601UserMedian;
}
	/**
	 *	Returns the value of startR800
	 *	@return startR800
	 */
	public int getStartR800() throws CFException {        
   		return startGroup800.getStartR800();
	}
	
	/**
	 * 	Update StartR800 with the passed value
	 *	@param number
	 */
	public void setStartR800(int number)  throws CFException{
		startGroup800.setStartR800(number);
	}


	public void setStartR800(long number)  throws CFException{
		startGroup800.setStartR800((int)number);
	}


	/**
	 *	Returns the value of ip66607End
	 *	@return ip66607End
	 */
	public int getIp66607End() throws CFException {        
   		return ip66607SortInfo.getIp66607End();
	}
	
	/**
	 * 	Update Ip66607End with the passed value
	 *	@param number
	 */
	public void setIp66607End(int number)  throws CFException{
		ip66607SortInfo.setIp66607End(number);
	}


	public void setIp66607End(long number)  throws CFException{
		ip66607SortInfo.setIp66607End((int)number);
	}


	/**
	 *	Returns the value of right800
	 *	@return right800
	 */
	public int getRight800() throws CFException {        
   		return right800;
	}
	
	/**
	 * 	Update Right800 with the passed value
	 *	@param number
	 */
	public void setRight800(int number)  throws CFException{
		Ip666030Ctx.this.setRight800(number);
	}


	public void setRight800(long number)  throws CFException{
		Ip666030Ctx.this.setRight800((int)number);
	}



public void setIp66601UserLeft(int ip66601UserLeft) { 
    Ip666030Ctx.this.ip66601UserLeft = ip66601UserLeft;
}

public int getIp66601UserLeft() { 
    return Ip666030Ctx.this.ip66601UserLeft;
}
	/**
	 *	Test condition "Y" for isItIsTheFirstTime100()
	 *	@return  Returns true if isItIsTheFirstTime100() is "Y"
	 */
   public boolean isItIsTheFirstTime100() throws CFException {
      return work.isItIsTheFirstTime100();
   }

	/**
	*  set values "Y"
	*/
   	public void setItIsTheFirstTime100True()  throws CFException{  			
    	work.setItIsTheFirstTime100True();
   	}
	/**
	 *	Returns the value of ip66607Start
	 *	@return ip66607Start
	 */
	public int getIp66607Start() throws CFException {        
   		return ip66607SortInfo.getIp66607Start();
	}
	
	/**
	 * 	Update Ip66607Start with the passed value
	 *	@param number
	 */
	public void setIp66607Start(int number)  throws CFException{
		ip66607SortInfo.setIp66607Start(number);
	}


	public void setIp66607Start(long number)  throws CFException{
		ip66607SortInfo.setIp66607Start((int)number);
	}


	/**
	 *	Returns the value of isItTheFirstTime100
	 *	@return isItTheFirstTime100
	 */
   public char[] getIsItTheFirstTime100() throws CFException  {              
   		return work.getIsItTheFirstTime100();
   }

  
	/**
	*  set variable isItTheFirstTime100
	*  @param value
	**/
   public void setIsItTheFirstTime100(char[] value) throws CFException {
      work.setIsItTheFirstTime100(value);
   } 


public void setIp66601UserEnd(int ip66601UserEnd) { 
    Ip666030Ctx.this.ip66601UserEnd = ip66601UserEnd;
}

public int getIp66601UserEnd() { 
    return Ip666030Ctx.this.ip66601UserEnd;
}
	/**
	 *	Returns the value of ip66601UserTagId
	 *	@return ip66601UserTagId
	 */   
	 public Ip66601UserTagId getIp66601UserTagId(int index) {
   	return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).getIp66601UserTagId();
   }

   /**
	* 	Update Ip66601UserTagId with the passed value
	*	@param value
	*/
   public void setIp66601UserTagId(int index,char[] value) throws CFException {
      ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagId(value);
   }   

     /**
	 * 	Update Ip66601UserTagId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp66601UserTagId(int index,char[] source, int sourceIndex,int sourceLen) throws CFException {
   	ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66601UserTagId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66601UserTagId(int index,char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Ip66601UserTagId with another Field
	 *	@param value
	 */
   public void setIp66601UserTagId(int index,Field source) {
   	ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagId(source);
   }  
   
     /**
	 * 	Update Ip66601UserTagId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp66601UserTagId(int index,Field source, int sourceIndex,int sourceLen) {
   	ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagId(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Ip66601UserTagId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66601UserTagId(int index,Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index).setIp66601UserTagId(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of pgmIp666030300
	 *	@return pgmIp666030300
	 */
   public char[] getPgmIp666030300() throws CFException  {              
   		return work.getPgmIp666030300();
   }

  
	/**
	*  set variable pgmIp666030300
	*  @param value
	**/
   public void setPgmIp666030300(char[] value) throws CFException {
      work.setPgmIp666030300(value);
   } 

	/**
	 *	Returns the value of ip66601UserTag
	 *	@return ip66601UserTag
	 */   
	 public Ip66601UserTag getIp66601UserTag(int index) {
   	return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index);
   }

    public List<Ip66601UserTag> getIp66601UserTag() {
        return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag();
    }
   /**
	* 	Update Ip66601UserTag with the passed value
	*	@param value
	*/
   public void setIp66601UserTag(int index,char[] value) throws CFException {
      ip66601UserTagInformation.getIp66601UserTagTable().setIp66601UserTag((index),value);
   }   


	/**
	 *	Returns the value of start800
	 *	@return start800
	 */
	public int getStart800() throws CFException {        
   		return startGroup800.getStart800();
	}
	
	/**
	 * 	Update Start800 with the passed value
	 *	@param number
	 */
	public void setStart800(int number)  throws CFException{
		startGroup800.setStart800(number);
	}


	public void setStart800(long number)  throws CFException{
		startGroup800.setStart800((int)number);
	}



public void setIp66601UserStart(int ip66601UserStart) { 
    Ip666030Ctx.this.ip66601UserStart = ip66601UserStart;
}

public int getIp66601UserStart() { 
    return Ip666030Ctx.this.ip66601UserStart;
}

        public Ip666030Ctx getIp666030Ctx() {
            return Ip666030Ctx.this;
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
        str += ip66601UserTagInformation.hashCode();
        str += startGroup800.hashCode();
        str += ip66607SortInfo.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        cloneObj.startGroup800 = new StartGroup800();
        cloneObj.startGroup800.set(startGroup800.getClonedField());
        cloneObj.ip66607SortInfo = new Ip66607SortInfo();
        cloneObj.ip66607SortInfo.set(ip66607SortInfo.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessOutCtx implements Cloneable {
     Ip66601UserTagInformation ip66601UserTagInformation = Ip666030Ctx.this.getIp66601UserTagInformation();
     StartGroup800 startGroup800 = Ip666030Ctx.this.getStartGroup800();
     Ip66607SortInfo ip66607SortInfo = Ip666030Ctx.this.getIp66607SortInfo();
     Work work = Ip666030Ctx.this.getWork();

	/**
	 *	Returns the value of start400
	 *	@return start400
	 */
	public int getStart400() throws CFException {        
   		return work.getStart400();
	}
	
	/**
	 * 	Update Start400 with the passed value
	 *	@param number
	 */
	public void setStart400(int number)  throws CFException{
		work.setStart400(number);
	}


	public void setStart400(long number)  throws CFException{
		work.setStart400((int)number);
	}


	/**
	 *	Returns the value of median400
	 *	@return median400
	 */
	public int getMedian400() throws CFException {        
   		return work.getMedian400();
	}
	
	/**
	 * 	Update Median400 with the passed value
	 *	@param number
	 */
	public void setMedian400(int number)  throws CFException{
		work.setMedian400(number);
	}


	public void setMedian400(long number)  throws CFException{
		work.setMedian400((int)number);
	}


	/**
	 *	Returns the value of startR800
	 *	@return startR800
	 */
	public int getStartR800() throws CFException {        
   		return startGroup800.getStartR800();
	}
	
	/**
	 * 	Update StartR800 with the passed value
	 *	@param number
	 */
	public void setStartR800(int number)  throws CFException{
		startGroup800.setStartR800(number);
	}


	public void setStartR800(long number)  throws CFException{
		startGroup800.setStartR800((int)number);
	}


	/**
	 *	Returns the value of ip66607End
	 *	@return ip66607End
	 */
	public int getIp66607End() throws CFException {        
   		return ip66607SortInfo.getIp66607End();
	}
	
	/**
	 * 	Update Ip66607End with the passed value
	 *	@param number
	 */
	public void setIp66607End(int number)  throws CFException{
		ip66607SortInfo.setIp66607End(number);
	}


	public void setIp66607End(long number)  throws CFException{
		ip66607SortInfo.setIp66607End((int)number);
	}


	/**
	 *	Returns the value of ptrIp666030800
	 *	@return ptrIp666030800
	 */
   public char[] getPtrIp666030800() throws CFException  {              
   		return work.getPtrIp666030800();
   }

  
	/**
	*  set variable ptrIp666030800
	*  @param value
	**/
   public void setPtrIp666030800(char[] value) throws CFException {
      work.setPtrIp666030800(value);
   } 

	/**
	 *	Returns the value of tagTemp800
	 *	@return tagTemp800
	 */
   public char[] getTagTemp800() throws CFException  {              
   		return work.getTagTemp800();
   }

  
	/**
	*  set variable tagTemp800
	*  @param value
	**/
   public void setTagTemp800(char[] value) throws CFException {
      work.setTagTemp800(value);
   } 

	/**
	 *	Returns the value of isItTheFirstTime100
	 *	@return isItTheFirstTime100
	 */
   public char[] getIsItTheFirstTime100() throws CFException  {              
   		return work.getIsItTheFirstTime100();
   }

  
	/**
	*  set variable isItTheFirstTime100
	*  @param value
	**/
   public void setIsItTheFirstTime100(char[] value) throws CFException {
      work.setIsItTheFirstTime100(value);
   } 

	/**
	 *	Returns the value of end800
	 *	@return end800
	 */
	public int getEnd800() throws CFException {        
   		return end800;
	}
	
	/**
	 * 	Update End800 with the passed value
	 *	@param number
	 */
	public void setEnd800(int number)  throws CFException{
		Ip666030Ctx.this.setEnd800(number);
	}


	public void setEnd800(long number)  throws CFException{
		Ip666030Ctx.this.setEnd800((int)number);
	}


	/**
	 *	Returns the value of median800
	 *	@return median800
	 */
	public int getMedian800() throws CFException {        
   		return median800;
	}
	
	/**
	 * 	Update Median800 with the passed value
	 *	@param number
	 */
	public void setMedian800(int number)  throws CFException{
		Ip666030Ctx.this.setMedian800(number);
	}


	public void setMedian800(long number)  throws CFException{
		Ip666030Ctx.this.setMedian800((int)number);
	}


	/**
	 *	Returns the value of start800
	 *	@return start800
	 */
	public int getStart800() throws CFException {        
   		return startGroup800.getStart800();
	}
	
	/**
	 * 	Update Start800 with the passed value
	 *	@param number
	 */
	public void setStart800(int number)  throws CFException{
		startGroup800.setStart800(number);
	}


	public void setStart800(long number)  throws CFException{
		startGroup800.setStart800((int)number);
	}



public void setIp66601UserStart(int ip66601UserStart) { 
    Ip666030Ctx.this.ip66601UserStart = ip66601UserStart;
}

public int getIp66601UserStart() { 
    return Ip666030Ctx.this.ip66601UserStart;
}
	/**
	 *	Returns the value of leftCf800
	 *	@return leftCf800
	 */
	public int getLeftCf800() throws CFException {
   		return work.getLeftCf800();
	}


	/**
	 *	Returns String value of leftCf800
	 *	@return leftCf800
	 */
	public char[]  getLeftCf800String() throws CFException {
	     return String.valueOf(work.getLeftCf800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean leftCf800IsNumeric()  throws CFException{
	    return work.leftCf800IsNumeric();
	}

	/**
	 * 	Update LeftCf800 with the passed value
	 *	@param number
	 */
	public void setLeftCf800(int number)  throws CFException{
		work.setLeftCf800(number);
	}
	

	public void setLeftCf800(long number)  throws CFException{
	    work.setLeftCf800(number);
	}
	
	
	/**
	 * 	Update LeftCf800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLeftCf800(char[] value)  throws CFException {
		work.setLeftCf800(value);
	}
	
	/**
	 * 	Update LeftCf800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLeftCf800String(char[] value)  throws CFException{
		work.setLeftCf800(value);
	}	

	/**
	 *	Returns the value of endCf800
	 *	@return endCf800
	 */
	public int getEndCf800() throws CFException {
   		return work.getEndCf800();
	}


	/**
	 *	Returns String value of endCf800
	 *	@return endCf800
	 */
	public char[]  getEndCf800String() throws CFException {
	     return String.valueOf(work.getEndCf800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean endCf800IsNumeric()  throws CFException{
	    return work.endCf800IsNumeric();
	}

	/**
	 * 	Update EndCf800 with the passed value
	 *	@param number
	 */
	public void setEndCf800(int number)  throws CFException{
		work.setEndCf800(number);
	}
	

	public void setEndCf800(long number)  throws CFException{
	    work.setEndCf800(number);
	}
	
	
	/**
	 * 	Update EndCf800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setEndCf800(char[] value)  throws CFException {
		work.setEndCf800(value);
	}
	
	/**
	 * 	Update EndCf800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEndCf800String(char[] value)  throws CFException{
		work.setEndCf800(value);
	}	

	/**
	 *	Returns the value of end400
	 *	@return end400
	 */
	public int getEnd400() throws CFException {        
   		return work.getEnd400();
	}
	
	/**
	 * 	Update End400 with the passed value
	 *	@param number
	 */
	public void setEnd400(int number)  throws CFException{
		work.setEnd400(number);
	}


	public void setEnd400(long number)  throws CFException{
		work.setEnd400((int)number);
	}



public void setIp66601UserRight(int ip66601UserRight) { 
    Ip666030Ctx.this.ip66601UserRight = ip66601UserRight;
}

public int getIp66601UserRight() { 
    return Ip666030Ctx.this.ip66601UserRight;
}
	/**
	 *	Returns the value of left800
	 *	@return left800
	 */
	public int getLeft800() throws CFException {        
   		return left800;
	}
	
	/**
	 * 	Update Left800 with the passed value
	 *	@param number
	 */
	public void setLeft800(int number)  throws CFException{
		Ip666030Ctx.this.setLeft800(number);
	}


	public void setLeft800(long number)  throws CFException{
		Ip666030Ctx.this.setLeft800((int)number);
	}


	/**
	 *	Returns the value of rightCf800
	 *	@return rightCf800
	 */
	public int getRightCf800() throws CFException {
   		return work.getRightCf800();
	}


	/**
	 *	Returns String value of rightCf800
	 *	@return rightCf800
	 */
	public char[]  getRightCf800String() throws CFException {
	     return String.valueOf(work.getRightCf800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean rightCf800IsNumeric()  throws CFException{
	    return work.rightCf800IsNumeric();
	}

	/**
	 * 	Update RightCf800 with the passed value
	 *	@param number
	 */
	public void setRightCf800(int number)  throws CFException{
		work.setRightCf800(number);
	}
	

	public void setRightCf800(long number)  throws CFException{
	    work.setRightCf800(number);
	}
	
	
	/**
	 * 	Update RightCf800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setRightCf800(char[] value)  throws CFException {
		work.setRightCf800(value);
	}
	
	/**
	 * 	Update RightCf800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRightCf800String(char[] value)  throws CFException{
		work.setRightCf800(value);
	}	


public void setIp66601UserMedian(int ip66601UserMedian) { 
    Ip666030Ctx.this.ip66601UserMedian = ip66601UserMedian;
}

public int getIp66601UserMedian() { 
    return Ip666030Ctx.this.ip66601UserMedian;
}
	/**
	 *	Returns the value of right800
	 *	@return right800
	 */
	public int getRight800() throws CFException {        
   		return right800;
	}
	
	/**
	 * 	Update Right800 with the passed value
	 *	@param number
	 */
	public void setRight800(int number)  throws CFException{
		Ip666030Ctx.this.setRight800(number);
	}


	public void setRight800(long number)  throws CFException{
		Ip666030Ctx.this.setRight800((int)number);
	}



public void setIp66601UserLeft(int ip66601UserLeft) { 
    Ip666030Ctx.this.ip66601UserLeft = ip66601UserLeft;
}

public int getIp66601UserLeft() { 
    return Ip666030Ctx.this.ip66601UserLeft;
}
	/**
	 *	Returns the value of ip66607Start
	 *	@return ip66607Start
	 */
	public int getIp66607Start() throws CFException {        
   		return ip66607SortInfo.getIp66607Start();
	}
	
	/**
	 * 	Update Ip66607Start with the passed value
	 *	@param number
	 */
	public void setIp66607Start(int number)  throws CFException{
		ip66607SortInfo.setIp66607Start(number);
	}


	public void setIp66607Start(long number)  throws CFException{
		ip66607SortInfo.setIp66607Start((int)number);
	}



public void setIp66601UserEnd(int ip66601UserEnd) { 
    Ip666030Ctx.this.ip66601UserEnd = ip66601UserEnd;
}

public int getIp66601UserEnd() { 
    return Ip666030Ctx.this.ip66601UserEnd;
}
	/**
	 *	Returns the value of startCf800
	 *	@return startCf800
	 */
	public int getStartCf800() throws CFException {
   		return work.getStartCf800();
	}


	/**
	 *	Returns String value of startCf800
	 *	@return startCf800
	 */
	public char[]  getStartCf800String() throws CFException {
	     return String.valueOf(work.getStartCf800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean startCf800IsNumeric()  throws CFException{
	    return work.startCf800IsNumeric();
	}

	/**
	 * 	Update StartCf800 with the passed value
	 *	@param number
	 */
	public void setStartCf800(int number)  throws CFException{
		work.setStartCf800(number);
	}
	

	public void setStartCf800(long number)  throws CFException{
	    work.setStartCf800(number);
	}
	
	
	/**
	 * 	Update StartCf800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setStartCf800(char[] value)  throws CFException {
		work.setStartCf800(value);
	}
	
	/**
	 * 	Update StartCf800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStartCf800String(char[] value)  throws CFException{
		work.setStartCf800(value);
	}	

	/**
	 *	Returns the value of ip66601UserTag
	 *	@return ip66601UserTag
	 */   
	 public Ip66601UserTag getIp66601UserTag(int index) {
   	return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag(index);
   }

    public List<Ip66601UserTag> getIp66601UserTag() {
        return ip66601UserTagInformation.getIp66601UserTagTable().getIp66601UserTag();
    }
   /**
	* 	Update Ip66601UserTag with the passed value
	*	@param value
	*/
   public void setIp66601UserTag(int index,char[] value) throws CFException {
      ip66601UserTagInformation.getIp66601UserTagTable().setIp66601UserTag((index),value);
   }   


	/**
	 *	Returns the value of medianCf800
	 *	@return medianCf800
	 */
	public int getMedianCf800() throws CFException {
   		return work.getMedianCf800();
	}


	/**
	 *	Returns String value of medianCf800
	 *	@return medianCf800
	 */
	public char[]  getMedianCf800String() throws CFException {
	     return String.valueOf(work.getMedianCf800String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean medianCf800IsNumeric()  throws CFException{
	    return work.medianCf800IsNumeric();
	}

	/**
	 * 	Update MedianCf800 with the passed value
	 *	@param number
	 */
	public void setMedianCf800(int number)  throws CFException{
		work.setMedianCf800(number);
	}
	

	public void setMedianCf800(long number)  throws CFException{
	    work.setMedianCf800(number);
	}
	
	
	/**
	 * 	Update MedianCf800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMedianCf800(char[] value)  throws CFException {
		work.setMedianCf800(value);
	}
	
	/**
	 * 	Update MedianCf800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMedianCf800String(char[] value)  throws CFException{
		work.setMedianCf800(value);
	}	


        public Ip666030Ctx getIp666030Ctx() {
            return Ip666030Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += ip66601UserTagInformation.hashCode();
        str += startGroup800.hashCode();
        str += ip66607SortInfo.hashCode();
        str += work.hashCode();
       return str.hashCode();
    }

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.ip66601UserTagInformation = new Ip66601UserTagInformation();
        cloneObj.ip66601UserTagInformation.set(ip66601UserTagInformation.getClonedField());
        cloneObj.startGroup800 = new StartGroup800();
        cloneObj.startGroup800.set(startGroup800.getClonedField());
        cloneObj.ip66607SortInfo = new Ip66607SortInfo();
        cloneObj.ip66607SortInfo.set(ip66607SortInfo.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
}
