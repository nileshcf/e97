package com.cloudframe.app.move0;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.move0.dto.AcceptDate;
import com.cloudframe.app.move0.dto.PackedTo2;
import com.cloudframe.app.move0.dto.PackedTo1;
import com.cloudframe.app.move0.dto.CurrentDate;
import com.cloudframe.app.move0.dto.SmallParent;
import com.cloudframe.app.move0.dto.CurrentDateGroup;
import com.cloudframe.app.move0.dto.Status;
import com.cloudframe.app.move0.dto.AidUserByteGroup;
import com.cloudframe.app.move0.dto.Rl7abTableInit;
import com.cloudframe.app.move0.dto.Work;
import com.cloudframe.app.move0.dto.Rl7abTableInfo;
import com.cloudframe.app.move0.dto.GrandParent;


@Context
public class Move0Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;
    SmallParent smallParent;
    CurrentDateGroup currentDateGroup;
    Rl7abTableInit rl7abTableInit;
    Status status;
    AcceptDate acceptDate;
    PackedTo1 packedTo1;
    GrandParent grandParent;
    AidUserByteGroup aidUserByteGroup;
    PackedTo2 packedTo2;


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
    public SmallParent getSmallParent() {
        if (smallParent == null) {
            smallParent = new SmallParent();
        }

        return smallParent;
    }

    public void setSmallParent(SmallParent smallParent) {
        this.smallParent = smallParent;
    }
    public CurrentDateGroup getCurrentDateGroup() {
        if (currentDateGroup == null) {
            currentDateGroup = new CurrentDateGroup();
        }

        return currentDateGroup;
    }

    public void setCurrentDateGroup(CurrentDateGroup currentDateGroup) {
        this.currentDateGroup = currentDateGroup;
    }
    public Rl7abTableInit getRl7abTableInit() {
        if (rl7abTableInit == null) {
            rl7abTableInit = new Rl7abTableInit();
        }

        return rl7abTableInit;
    }

    public void setRl7abTableInit(Rl7abTableInit rl7abTableInit) {
        this.rl7abTableInit = rl7abTableInit;
    }
    public Status getStatus() {
        if (status == null) {
            status = new Status();
        }

        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public AcceptDate getAcceptDate() {
        if (acceptDate == null) {
            acceptDate = new AcceptDate();
        }

        return acceptDate;
    }

    public void setAcceptDate(AcceptDate acceptDate) {
        this.acceptDate = acceptDate;
    }
    public PackedTo1 getPackedTo1() {
        if (packedTo1 == null) {
            packedTo1 = new PackedTo1();
        }

        return packedTo1;
    }

    public void setPackedTo1(PackedTo1 packedTo1) {
        this.packedTo1 = packedTo1;
    }
    public GrandParent getGrandParent() {
        if (grandParent == null) {
            grandParent = new GrandParent();
        }

        return grandParent;
    }

    public void setGrandParent(GrandParent grandParent) {
        this.grandParent = grandParent;
    }
    public AidUserByteGroup getAidUserByteGroup() {
        if (aidUserByteGroup == null) {
            aidUserByteGroup = new AidUserByteGroup();
        }

        return aidUserByteGroup;
    }

    public void setAidUserByteGroup(AidUserByteGroup aidUserByteGroup) {
        this.aidUserByteGroup = aidUserByteGroup;
    }
    public PackedTo2 getPackedTo2() {
        if (packedTo2 == null) {
            packedTo2 = new PackedTo2();
        }

        return packedTo2;
    }

    public void setPackedTo2(PackedTo2 packedTo2) {
        this.packedTo2 = packedTo2;
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
        str += smallParent.hashCode();
        str += currentDateGroup.hashCode();
        str += rl7abTableInit.hashCode();
        str += status.hashCode();
        str += acceptDate.hashCode();
        str += packedTo1.hashCode();
        str += grandParent.hashCode();
        str += aidUserByteGroup.hashCode();
        str += packedTo2.hashCode();
       return str.hashCode();
    }

    public Move0Ctx clone() {
        Move0Ctx cloneObj = new Move0Ctx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.smallParent = new SmallParent();
        cloneObj.smallParent.set(smallParent.getClonedField());
        cloneObj.currentDateGroup = new CurrentDateGroup();
        cloneObj.currentDateGroup.set(currentDateGroup.getClonedField());
        cloneObj.rl7abTableInit = new Rl7abTableInit();
        cloneObj.rl7abTableInit.set(rl7abTableInit.getClonedField());
        cloneObj.status = new Status();
        cloneObj.status.set(status.getClonedField());
        cloneObj.acceptDate = new AcceptDate();
        cloneObj.acceptDate.set(acceptDate.getClonedField());
        cloneObj.packedTo1 = new PackedTo1();
        cloneObj.packedTo1.set(packedTo1.getClonedField());
        cloneObj.grandParent = new GrandParent();
        cloneObj.grandParent.set(grandParent.getClonedField());
        cloneObj.aidUserByteGroup = new AidUserByteGroup();
        cloneObj.aidUserByteGroup.set(aidUserByteGroup.getClonedField());
        cloneObj.packedTo2 = new PackedTo2();
        cloneObj.packedTo2.set(packedTo2.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Work work = Move0Ctx.this.getWork();
     Status status = Move0Ctx.this.getStatus();
     PackedTo1 packedTo1 = Move0Ctx.this.getPackedTo1();
     PackedTo2 packedTo2 = Move0Ctx.this.getPackedTo2();

	/**
	 *	Returns the value of status
	 *	@return status
	 */   
	 public Status getStatus() {
   	return status;
   }


	/**
	 *	Returns the value of packedTo1
	 *	@return packedTo1
	 */   
	 public PackedTo1 getPackedTo1() {
   	return packedTo1;
   }


	/**
	 *	Returns the value of packedTo2
	 *	@return packedTo2
	 */   
	 public PackedTo2 getPackedTo2() {
   	return packedTo2;
   }



        public Move0Ctx getMove0Ctx() {
            return Move0Ctx.this;
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
        str += status.hashCode();
        str += packedTo1.hashCode();
        str += packedTo2.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.status = new Status();
        cloneObj.status.set(status.getClonedField());
        cloneObj.packedTo1 = new PackedTo1();
        cloneObj.packedTo1.set(packedTo1.getClonedField());
        cloneObj.packedTo2 = new PackedTo2();
        cloneObj.packedTo2.set(packedTo2.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessOutCtx implements Cloneable {
     Work work = Move0Ctx.this.getWork();
     Status status = Move0Ctx.this.getStatus();
     PackedTo1 packedTo1 = Move0Ctx.this.getPackedTo1();
     PackedTo2 packedTo2 = Move0Ctx.this.getPackedTo2();

	public BigDecimal getT11() throws CFException{      
   		return packedTo2.getT11();
	}

    public char[] getT11String() throws CFException {
          return  packedTo2.getT11().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update T11 with the passed number
	 *	@param number
	 */
	public void setT11(BigDecimal number)  throws CFException{
		packedTo2.setT11(number);
   }

	/**
	 *	Returns the value of gnpHHeaderTimeSs1
	 *	@return gnpHHeaderTimeSs1
	 */
   public char[] getGnpHHeaderTimeSs1() throws CFException  {              
   		return status.getGnpHHeaderTimeSs1();
   }

  
	/**
	*  set variable gnpHHeaderTimeSs1
	*  @param value
	**/
   public void setGnpHHeaderTimeSs1(char[] value) throws CFException {
      status.setGnpHHeaderTimeSs1(value);
   } 

     /**
	 * 	Update GnpHHeaderTimeSs1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs1(char[] source, int sourceIndex) throws CFException {
      status.setGnpHHeaderTimeSs1(source, sourceIndex);
   	
   }
   
   public void setGnpHHeaderTimeSs1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      status.setGnpHHeaderTimeSs1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update GnpHHeaderTimeSs1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      status.setGnpHHeaderTimeSs1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update GnpHHeaderTimeSs1 with another Field
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs1(Field source) {
      status.setGnpHHeaderTimeSs1(source);
   }  
   
     /**
	 * 	Update GnpHHeaderTimeSs1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs1(Field source, int sourceIndex,int sourceLen) {
      status.setGnpHHeaderTimeSs1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update GnpHHeaderTimeSs1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      status.setGnpHHeaderTimeSs1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of d11
	 *	@return d11
	 */
	public BigDecimal getD11() throws CFException {
   		return work.getD11();
	}


	 /**
     *	Returns String value of d11
     *	@return d11
     */
    public char[]  getD11String() throws CFException {
         return work.getD11String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean d11IsNumeric() {
        return work.d11IsNumeric();
    }
	/**
	 * 	Update D11 with the passed number
	 *	@param number
	 */
	public void setD11(BigDecimal number)  throws CFException{
		work.setD11(number);
   }

	/**
	 * 	Update D11 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setD11(char[] value)  throws CFException{
		work.setD11(value);
	}   

	/**
	 *	Returns the value of label
	 *	@return label
	 */
   public char[] getLabel() throws CFException  {              
   		return work.getLabel();
   }

  
	/**
	*  set variable label
	*  @param value
	**/
   public void setLabel(char[] value) throws CFException {
      work.setLabel(value);
   } 

	/**
	 *	Returns the value of gnpHHeaderTimeSs2
	 *	@return gnpHHeaderTimeSs2
	 */
   public char[] getGnpHHeaderTimeSs2() throws CFException  {              
   		return status.getGnpHHeaderTimeSs2();
   }

  
	/**
	*  set variable gnpHHeaderTimeSs2
	*  @param value
	**/
   public void setGnpHHeaderTimeSs2(char[] value) throws CFException {
      status.setGnpHHeaderTimeSs2(value);
   } 

     /**
	 * 	Update GnpHHeaderTimeSs2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs2(char[] source, int sourceIndex) throws CFException {
      status.setGnpHHeaderTimeSs2(source, sourceIndex);
   	
   }
   
   public void setGnpHHeaderTimeSs2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      status.setGnpHHeaderTimeSs2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update GnpHHeaderTimeSs2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      status.setGnpHHeaderTimeSs2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update GnpHHeaderTimeSs2 with another Field
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs2(Field source) {
      status.setGnpHHeaderTimeSs2(source);
   }  
   
     /**
	 * 	Update GnpHHeaderTimeSs2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs2(Field source, int sourceIndex,int sourceLen) {
      status.setGnpHHeaderTimeSs2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update GnpHHeaderTimeSs2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      status.setGnpHHeaderTimeSs2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getT10() throws CFException{      
   		return packedTo1.getT10();
	}

    public char[] getT10String() throws CFException {
          return  packedTo1.getT10().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update T10 with the passed number
	 *	@param number
	 */
	public void setT10(BigDecimal number)  throws CFException{
		packedTo1.setT10(number);
   }

	/**
	 *	Returns the value of gnpHHeaderTimeSs3
	 *	@return gnpHHeaderTimeSs3
	 */
   public char[] getGnpHHeaderTimeSs3() throws CFException  {              
   		return status.getGnpHHeaderTimeSs3();
   }

  
	/**
	*  set variable gnpHHeaderTimeSs3
	*  @param value
	**/
   public void setGnpHHeaderTimeSs3(char[] value) throws CFException {
      status.setGnpHHeaderTimeSs3(value);
   } 

     /**
	 * 	Update GnpHHeaderTimeSs3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs3(char[] source, int sourceIndex) throws CFException {
      status.setGnpHHeaderTimeSs3(source, sourceIndex);
   	
   }
   
   public void setGnpHHeaderTimeSs3(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      status.setGnpHHeaderTimeSs3(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update GnpHHeaderTimeSs3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      status.setGnpHHeaderTimeSs3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update GnpHHeaderTimeSs3 with another Field
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs3(Field source) {
      status.setGnpHHeaderTimeSs3(source);
   }  
   
     /**
	 * 	Update GnpHHeaderTimeSs3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs3(Field source, int sourceIndex,int sourceLen) {
      status.setGnpHHeaderTimeSs3(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update GnpHHeaderTimeSs3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGnpHHeaderTimeSs3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      status.setGnpHHeaderTimeSs3(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of d20
	 *	@return d20
	 */
	public BigDecimal getD20() throws CFException {
   		return work.getD20();
	}

    /**
	 *	Returns the String value of d20
	 *	@return d20
	 */
	public char[]  getD20ActualString()  throws CFException{
	    return work.getD20ActualString();
	}

	 /**
     *	Returns String value of d20
     *	@return d20
     */
    public char[]  getD20String() throws CFException {
         return work.getD20String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean d20IsNumeric() {
        return work.d20IsNumeric();
    }
	/**
	 * 	Update D20 with the passed number
	 *	@param number
	 */
	public void setD20(BigDecimal number)  throws CFException{
		work.setD20(number);
   }

	/**
	 * 	Update D20 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setD20(char[] value)  throws CFException{
		work.setD20(value);
	}   

	/**
	 *	Returns the value of wrkaApplication
	 *	@return wrkaApplication
	 */
   public char[] getWrkaApplication() throws CFException  {              
   		return work.getWrkaApplication();
   }

  
	/**
	*  set variable wrkaApplication
	*  @param value
	**/
   public void setWrkaApplication(char[] value) throws CFException {
      work.setWrkaApplication(value);
   } 

	/**
	 *	Returns the value of d10
	 *	@return d10
	 */
	public BigDecimal getD10() throws CFException {
   		return work.getD10();
	}

    /**
	 *	Returns the String value of d10
	 *	@return d10
	 */
	public char[]  getD10ActualString()  throws CFException{
	    return work.getD10ActualString();
	}

	 /**
     *	Returns String value of d10
     *	@return d10
     */
    public char[]  getD10String() throws CFException {
         return work.getD10String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean d10IsNumeric() {
        return work.d10IsNumeric();
    }
	/**
	 * 	Update D10 with the passed number
	 *	@param number
	 */
	public void setD10(BigDecimal number)  throws CFException{
		work.setD10(number);
   }

	/**
	 * 	Update D10 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setD10(char[] value)  throws CFException{
		work.setD10(value);
	}   


        public Move0Ctx getMove0Ctx() {
            return Move0Ctx.this;
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
        str += status.hashCode();
        str += packedTo1.hashCode();
        str += packedTo2.hashCode();
       return str.hashCode();
    }

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.status = new Status();
        cloneObj.status.set(status.getClonedField());
        cloneObj.packedTo1 = new PackedTo1();
        cloneObj.packedTo1.set(packedTo1.getClonedField());
        cloneObj.packedTo2 = new PackedTo2();
        cloneObj.packedTo2.set(packedTo2.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
     public class InitNumbers1OutCtx implements Cloneable {
     Work work = Move0Ctx.this.getWork();

	/**
	 *	Returns the value of long1
	 *	@return long1
	 */
	public long getLong1() throws CFException {        
   		return work.getLong1();
	}
	
	/**
	 * 	Update Long1 with the passed value
	 *	@param number
	 */
	public void setLong1(long number)  throws CFException{
		work.setLong1(number);
	}



	/**
	 *	Returns the value of short1
	 *	@return short1
	 */
	public int getShort1() throws CFException {        
   		return work.getShort1();
	}
	
	/**
	 * 	Update Short1 with the passed value
	 *	@param number
	 */
	public void setShort1(int number)  throws CFException{
		work.setShort1(number);
	}


	public void setShort1(long number)  throws CFException{
		work.setShort1((int)number);
	}


	/**
	 *	Returns the value of numDisp1
	 *	@return numDisp1
	 */
	public BigDecimal getNumDisp1() throws CFException {
   		return work.getNumDisp1();
	}


	 /**
     *	Returns String value of numDisp1
     *	@return numDisp1
     */
    public char[]  getNumDisp1String() throws CFException {
         return work.getNumDisp1String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean numDisp1IsNumeric() {
        return work.numDisp1IsNumeric();
    }
	/**
	 * 	Update NumDisp1 with the passed number
	 *	@param number
	 */
	public void setNumDisp1(BigDecimal number)  throws CFException{
		work.setNumDisp1(number);
   }

	/**
	 * 	Update NumDisp1 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setNumDisp1(char[] value)  throws CFException{
		work.setNumDisp1(value);
	}   

	public BigDecimal getNumDec1() throws CFException{      
   		return work.getNumDec1();
	}

    public char[] getNumDec1String() throws CFException {
          return  work.getNumDec1().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update NumDec1 with the passed number
	 *	@param number
	 */
	public void setNumDec1(BigDecimal number)  throws CFException{
		work.setNumDec1(number);
   }

	/**
	 *	Returns the value of int1
	 *	@return int1
	 */
	public long getInt1() throws CFException {        
   		return work.getInt1();
	}
	
	/**
	 * 	Update Int1 with the passed value
	 *	@param number
	 */
	public void setInt1(long number)  throws CFException{
		work.setInt1(number);
	}




        public Move0Ctx getMove0Ctx() {
            return Move0Ctx.this;
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

    public InitNumbers1OutCtx clone() {
        InitNumbers1OutCtx cloneObj = new InitNumbers1OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InitNumbers1OutCtx getInitNumbers1OutCtx() {
            return new InitNumbers1OutCtx();
    }
     public class InitNumbers3OutCtx implements Cloneable {
     Work work = Move0Ctx.this.getWork();

	/**
	 *	Returns the value of short3
	 *	@return short3
	 */
	public short getShort3() throws CFException {        
   		return work.getShort3();
	}
	
	/**
	 * 	Update Short3 with the passed value
	 *	@param number
	 */
	public void setShort3(short number)  throws CFException{
		work.setShort3(number);
	}

	public void setShort3(int number)  throws CFException{
		work.setShort3((short)number);
	}

	public void setShort3(long number)  throws CFException{
		work.setShort3((short)number);
	}



	public BigDecimal getNumDec3() throws CFException{      
   		return work.getNumDec3();
	}

    public char[] getNumDec3String() throws CFException {
          return  work.getNumDec3().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update NumDec3 with the passed number
	 *	@param number
	 */
	public void setNumDec3(BigDecimal number)  throws CFException{
		work.setNumDec3(number);
   }

	/**
	 *	Returns the value of long3
	 *	@return long3
	 */
	public long getLong3() throws CFException {        
   		return work.getLong3();
	}
	
	/**
	 * 	Update Long3 with the passed value
	 *	@param number
	 */
	public void setLong3(long number)  throws CFException{
		work.setLong3(number);
	}



	/**
	 *	Returns the value of numDisp3
	 *	@return numDisp3
	 */
	public BigDecimal getNumDisp3() throws CFException {
   		return work.getNumDisp3();
	}

    /**
	 *	Returns the String value of numDisp3
	 *	@return numDisp3
	 */
	public char[]  getNumDisp3ActualString()  throws CFException{
	    return work.getNumDisp3ActualString();
	}

	 /**
     *	Returns String value of numDisp3
     *	@return numDisp3
     */
    public char[]  getNumDisp3String() throws CFException {
         return work.getNumDisp3String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean numDisp3IsNumeric() {
        return work.numDisp3IsNumeric();
    }
	/**
	 * 	Update NumDisp3 with the passed number
	 *	@param number
	 */
	public void setNumDisp3(BigDecimal number)  throws CFException{
		work.setNumDisp3(number);
   }

	/**
	 * 	Update NumDisp3 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setNumDisp3(char[] value)  throws CFException{
		work.setNumDisp3(value);
	}   

	/**
	 *	Returns the value of int3
	 *	@return int3
	 */
	public int getInt3() throws CFException {        
   		return work.getInt3();
	}
	
	/**
	 * 	Update Int3 with the passed value
	 *	@param number
	 */
	public void setInt3(int number)  throws CFException{
		work.setInt3(number);
	}


	public void setInt3(long number)  throws CFException{
		work.setInt3((int)number);
	}



        public Move0Ctx getMove0Ctx() {
            return Move0Ctx.this;
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

    public InitNumbers3OutCtx clone() {
        InitNumbers3OutCtx cloneObj = new InitNumbers3OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public InitNumbers3OutCtx getInitNumbers3OutCtx() {
            return new InitNumbers3OutCtx();
    }
     public class Split6InCtx implements Cloneable {
     Work work = Move0Ctx.this.getWork();

	/**
	 *	Returns the value of long1
	 *	@return long1
	 */
	public long getLong1() throws CFException {        
   		return work.getLong1();
	}
	
	/**
	 * 	Update Long1 with the passed value
	 *	@param number
	 */
	public void setLong1(long number)  throws CFException{
		work.setLong1(number);
	}



	/**
	 *	Returns the value of numDisp1
	 *	@return numDisp1
	 */
	public BigDecimal getNumDisp1() throws CFException {
   		return work.getNumDisp1();
	}


	 /**
     *	Returns String value of numDisp1
     *	@return numDisp1
     */
    public char[]  getNumDisp1String() throws CFException {
         return work.getNumDisp1String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean numDisp1IsNumeric() {
        return work.numDisp1IsNumeric();
    }
	/**
	 * 	Update NumDisp1 with the passed number
	 *	@param number
	 */
	public void setNumDisp1(BigDecimal number)  throws CFException{
		work.setNumDisp1(number);
   }

	/**
	 * 	Update NumDisp1 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setNumDisp1(char[] value)  throws CFException{
		work.setNumDisp1(value);
	}   

	public BigDecimal getNumDec1() throws CFException{      
   		return work.getNumDec1();
	}

    public char[] getNumDec1String() throws CFException {
          return  work.getNumDec1().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update NumDec1 with the passed number
	 *	@param number
	 */
	public void setNumDec1(BigDecimal number)  throws CFException{
		work.setNumDec1(number);
   }


        public Move0Ctx getMove0Ctx() {
            return Move0Ctx.this;
        }

        public Split6OutCtx getSplit6OutCtx() {
            return new Split6OutCtx();
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

    public Split6InCtx clone() {
        Split6InCtx cloneObj = new Split6InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Split6InCtx getSplit6InCtx() {
            return new Split6InCtx();
    }
     public class Split6OutCtx implements Cloneable {
     Work work = Move0Ctx.this.getWork();

	/**
	 *	Returns the value of long1
	 *	@return long1
	 */
	public long getLong1() throws CFException {        
   		return work.getLong1();
	}
	
	/**
	 * 	Update Long1 with the passed value
	 *	@param number
	 */
	public void setLong1(long number)  throws CFException{
		work.setLong1(number);
	}



	/**
	 *	Returns the value of numDisp2
	 *	@return numDisp2
	 */
	public BigDecimal getNumDisp2() throws CFException {
   		return work.getNumDisp2();
	}


	 /**
     *	Returns String value of numDisp2
     *	@return numDisp2
     */
    public char[]  getNumDisp2String() throws CFException {
         return work.getNumDisp2String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean numDisp2IsNumeric() {
        return work.numDisp2IsNumeric();
    }
	/**
	 * 	Update NumDisp2 with the passed number
	 *	@param number
	 */
	public void setNumDisp2(BigDecimal number)  throws CFException{
		work.setNumDisp2(number);
   }

	/**
	 * 	Update NumDisp2 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setNumDisp2(char[] value)  throws CFException{
		work.setNumDisp2(value);
	}   

	public BigDecimal getNumDec2() throws CFException{      
   		return work.getNumDec2();
	}

    public char[] getNumDec2String() throws CFException {
          return  work.getNumDec2().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update NumDec2 with the passed number
	 *	@param number
	 */
	public void setNumDec2(BigDecimal number)  throws CFException{
		work.setNumDec2(number);
   }

	/**
	 *	Returns the value of int2
	 *	@return int2
	 */
	public long getInt2() throws CFException {        
   		return work.getInt2();
	}
	
	/**
	 * 	Update Int2 with the passed value
	 *	@param number
	 */
	public void setInt2(long number)  throws CFException{
		work.setInt2(number);
	}



	/**
	 *	Returns the value of long2
	 *	@return long2
	 */
	public long getLong2() throws CFException {        
   		return work.getLong2();
	}
	
	/**
	 * 	Update Long2 with the passed value
	 *	@param number
	 */
	public void setLong2(long number)  throws CFException{
		work.setLong2(number);
	}



	/**
	 *	Returns the value of numDisp1
	 *	@return numDisp1
	 */
	public BigDecimal getNumDisp1() throws CFException {
   		return work.getNumDisp1();
	}


	 /**
     *	Returns String value of numDisp1
     *	@return numDisp1
     */
    public char[]  getNumDisp1String() throws CFException {
         return work.getNumDisp1String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean numDisp1IsNumeric() {
        return work.numDisp1IsNumeric();
    }
	/**
	 * 	Update NumDisp1 with the passed number
	 *	@param number
	 */
	public void setNumDisp1(BigDecimal number)  throws CFException{
		work.setNumDisp1(number);
   }

	/**
	 * 	Update NumDisp1 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setNumDisp1(char[] value)  throws CFException{
		work.setNumDisp1(value);
	}   

	/**
	 *	Returns the value of short2
	 *	@return short2
	 */
	public int getShort2() throws CFException {        
   		return work.getShort2();
	}
	
	/**
	 * 	Update Short2 with the passed value
	 *	@param number
	 */
	public void setShort2(int number)  throws CFException{
		work.setShort2(number);
	}


	public void setShort2(long number)  throws CFException{
		work.setShort2((int)number);
	}


	public BigDecimal getNumDec1() throws CFException{      
   		return work.getNumDec1();
	}

    public char[] getNumDec1String() throws CFException {
          return  work.getNumDec1().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update NumDec1 with the passed number
	 *	@param number
	 */
	public void setNumDec1(BigDecimal number)  throws CFException{
		work.setNumDec1(number);
   }


        public Move0Ctx getMove0Ctx() {
            return Move0Ctx.this;
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

    public Split6OutCtx clone() {
        Split6OutCtx cloneObj = new Split6OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Split6OutCtx getSplit6OutCtx() {
            return new Split6OutCtx();
    }
     public class Split7InCtx implements Cloneable {
     Work work = Move0Ctx.this.getWork();

	/**
	 *	Returns the value of long1
	 *	@return long1
	 */
	public long getLong1() throws CFException {        
   		return work.getLong1();
	}
	
	/**
	 * 	Update Long1 with the passed value
	 *	@param number
	 */
	public void setLong1(long number)  throws CFException{
		work.setLong1(number);
	}



	/**
	 *	Returns the value of short1
	 *	@return short1
	 */
	public int getShort1() throws CFException {        
   		return work.getShort1();
	}
	
	/**
	 * 	Update Short1 with the passed value
	 *	@param number
	 */
	public void setShort1(int number)  throws CFException{
		work.setShort1(number);
	}


	public void setShort1(long number)  throws CFException{
		work.setShort1((int)number);
	}


	/**
	 *	Returns the value of int1
	 *	@return int1
	 */
	public long getInt1() throws CFException {        
   		return work.getInt1();
	}
	
	/**
	 * 	Update Int1 with the passed value
	 *	@param number
	 */
	public void setInt1(long number)  throws CFException{
		work.setInt1(number);
	}




        public Move0Ctx getMove0Ctx() {
            return Move0Ctx.this;
        }

        public Split7OutCtx getSplit7OutCtx() {
            return new Split7OutCtx();
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

    public Split7InCtx clone() {
        Split7InCtx cloneObj = new Split7InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Split7InCtx getSplit7InCtx() {
            return new Split7InCtx();
    }
     public class Split7OutCtx implements Cloneable {
     Work work = Move0Ctx.this.getWork();

	/**
	 *	Returns the value of long1
	 *	@return long1
	 */
	public long getLong1() throws CFException {        
   		return work.getLong1();
	}
	
	/**
	 * 	Update Long1 with the passed value
	 *	@param number
	 */
	public void setLong1(long number)  throws CFException{
		work.setLong1(number);
	}



	/**
	 *	Returns the value of numDisp2
	 *	@return numDisp2
	 */
	public BigDecimal getNumDisp2() throws CFException {
   		return work.getNumDisp2();
	}


	 /**
     *	Returns String value of numDisp2
     *	@return numDisp2
     */
    public char[]  getNumDisp2String() throws CFException {
         return work.getNumDisp2String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean numDisp2IsNumeric() {
        return work.numDisp2IsNumeric();
    }
	/**
	 * 	Update NumDisp2 with the passed number
	 *	@param number
	 */
	public void setNumDisp2(BigDecimal number)  throws CFException{
		work.setNumDisp2(number);
   }

	/**
	 * 	Update NumDisp2 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setNumDisp2(char[] value)  throws CFException{
		work.setNumDisp2(value);
	}   

	public BigDecimal getNumDec2() throws CFException{      
   		return work.getNumDec2();
	}

    public char[] getNumDec2String() throws CFException {
          return  work.getNumDec2().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update NumDec2 with the passed number
	 *	@param number
	 */
	public void setNumDec2(BigDecimal number)  throws CFException{
		work.setNumDec2(number);
   }

	/**
	 *	Returns the value of short1
	 *	@return short1
	 */
	public int getShort1() throws CFException {        
   		return work.getShort1();
	}
	
	/**
	 * 	Update Short1 with the passed value
	 *	@param number
	 */
	public void setShort1(int number)  throws CFException{
		work.setShort1(number);
	}


	public void setShort1(long number)  throws CFException{
		work.setShort1((int)number);
	}


	/**
	 *	Returns the value of int2
	 *	@return int2
	 */
	public long getInt2() throws CFException {        
   		return work.getInt2();
	}
	
	/**
	 * 	Update Int2 with the passed value
	 *	@param number
	 */
	public void setInt2(long number)  throws CFException{
		work.setInt2(number);
	}



	/**
	 *	Returns the value of long2
	 *	@return long2
	 */
	public long getLong2() throws CFException {        
   		return work.getLong2();
	}
	
	/**
	 * 	Update Long2 with the passed value
	 *	@param number
	 */
	public void setLong2(long number)  throws CFException{
		work.setLong2(number);
	}



	/**
	 *	Returns the value of short2
	 *	@return short2
	 */
	public int getShort2() throws CFException {        
   		return work.getShort2();
	}
	
	/**
	 * 	Update Short2 with the passed value
	 *	@param number
	 */
	public void setShort2(int number)  throws CFException{
		work.setShort2(number);
	}


	public void setShort2(long number)  throws CFException{
		work.setShort2((int)number);
	}


	/**
	 *	Returns the value of int1
	 *	@return int1
	 */
	public long getInt1() throws CFException {        
   		return work.getInt1();
	}
	
	/**
	 * 	Update Int1 with the passed value
	 *	@param number
	 */
	public void setInt1(long number)  throws CFException{
		work.setInt1(number);
	}




        public Move0Ctx getMove0Ctx() {
            return Move0Ctx.this;
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

    public Split7OutCtx clone() {
        Split7OutCtx cloneObj = new Split7OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Split7OutCtx getSplit7OutCtx() {
            return new Split7OutCtx();
    }
     public class Split8InCtx implements Cloneable {
     Work work = Move0Ctx.this.getWork();

	public BigDecimal getNumDec3() throws CFException{      
   		return work.getNumDec3();
	}

    public char[] getNumDec3String() throws CFException {
          return  work.getNumDec3().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update NumDec3 with the passed number
	 *	@param number
	 */
	public void setNumDec3(BigDecimal number)  throws CFException{
		work.setNumDec3(number);
   }

	/**
	 *	Returns the value of numDisp3
	 *	@return numDisp3
	 */
	public BigDecimal getNumDisp3() throws CFException {
   		return work.getNumDisp3();
	}

    /**
	 *	Returns the String value of numDisp3
	 *	@return numDisp3
	 */
	public char[]  getNumDisp3ActualString()  throws CFException{
	    return work.getNumDisp3ActualString();
	}

	 /**
     *	Returns String value of numDisp3
     *	@return numDisp3
     */
    public char[]  getNumDisp3String() throws CFException {
         return work.getNumDisp3String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean numDisp3IsNumeric() {
        return work.numDisp3IsNumeric();
    }
	/**
	 * 	Update NumDisp3 with the passed number
	 *	@param number
	 */
	public void setNumDisp3(BigDecimal number)  throws CFException{
		work.setNumDisp3(number);
   }

	/**
	 * 	Update NumDisp3 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setNumDisp3(char[] value)  throws CFException{
		work.setNumDisp3(value);
	}   


        public Move0Ctx getMove0Ctx() {
            return Move0Ctx.this;
        }

        public Split8OutCtx getSplit8OutCtx() {
            return new Split8OutCtx();
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

    public Split8InCtx clone() {
        Split8InCtx cloneObj = new Split8InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Split8InCtx getSplit8InCtx() {
            return new Split8InCtx();
    }
     public class Split8OutCtx implements Cloneable {
     Work work = Move0Ctx.this.getWork();

	/**
	 *	Returns the value of long4
	 *	@return long4
	 */
	public long getLong4() throws CFException {        
   		return work.getLong4();
	}
	
	/**
	 * 	Update Long4 with the passed value
	 *	@param number
	 */
	public void setLong4(long number)  throws CFException{
		work.setLong4(number);
	}



	/**
	 *	Returns the value of int4
	 *	@return int4
	 */
	public int getInt4() throws CFException {        
   		return work.getInt4();
	}
	
	/**
	 * 	Update Int4 with the passed value
	 *	@param number
	 */
	public void setInt4(int number)  throws CFException{
		work.setInt4(number);
	}


	public void setInt4(long number)  throws CFException{
		work.setInt4((int)number);
	}


	public BigDecimal getNumDec3() throws CFException{      
   		return work.getNumDec3();
	}

    public char[] getNumDec3String() throws CFException {
          return  work.getNumDec3().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update NumDec3 with the passed number
	 *	@param number
	 */
	public void setNumDec3(BigDecimal number)  throws CFException{
		work.setNumDec3(number);
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
	 *	Returns the value of numDisp3
	 *	@return numDisp3
	 */
	public BigDecimal getNumDisp3() throws CFException {
   		return work.getNumDisp3();
	}

    /**
	 *	Returns the String value of numDisp3
	 *	@return numDisp3
	 */
	public char[]  getNumDisp3ActualString()  throws CFException{
	    return work.getNumDisp3ActualString();
	}

	 /**
     *	Returns String value of numDisp3
     *	@return numDisp3
     */
    public char[]  getNumDisp3String() throws CFException {
         return work.getNumDisp3String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean numDisp3IsNumeric() {
        return work.numDisp3IsNumeric();
    }
	/**
	 * 	Update NumDisp3 with the passed number
	 *	@param number
	 */
	public void setNumDisp3(BigDecimal number)  throws CFException{
		work.setNumDisp3(number);
   }

	/**
	 * 	Update NumDisp3 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setNumDisp3(char[] value)  throws CFException{
		work.setNumDisp3(value);
	}   

	/**
	 *	Returns the value of short4
	 *	@return short4
	 */
	public short getShort4() throws CFException {        
   		return work.getShort4();
	}
	
	/**
	 * 	Update Short4 with the passed value
	 *	@param number
	 */
	public void setShort4(short number)  throws CFException{
		work.setShort4(number);
	}

	public void setShort4(int number)  throws CFException{
		work.setShort4((short)number);
	}

	public void setShort4(long number)  throws CFException{
		work.setShort4((short)number);
	}



	public BigDecimal getNumDec4() throws CFException{      
   		return work.getNumDec4();
	}

    public char[] getNumDec4String() throws CFException {
          return  work.getNumDec4().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update NumDec4 with the passed number
	 *	@param number
	 */
	public void setNumDec4(BigDecimal number)  throws CFException{
		work.setNumDec4(number);
   }

	/**
	 *	Returns the value of numDisp4
	 *	@return numDisp4
	 */
	public BigDecimal getNumDisp4() throws CFException {
   		return work.getNumDisp4();
	}

    /**
	 *	Returns the String value of numDisp4
	 *	@return numDisp4
	 */
	public char[]  getNumDisp4ActualString()  throws CFException{
	    return work.getNumDisp4ActualString();
	}

	 /**
     *	Returns String value of numDisp4
     *	@return numDisp4
     */
    public char[]  getNumDisp4String() throws CFException {
         return work.getNumDisp4String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean numDisp4IsNumeric() {
        return work.numDisp4IsNumeric();
    }
	/**
	 * 	Update NumDisp4 with the passed number
	 *	@param number
	 */
	public void setNumDisp4(BigDecimal number)  throws CFException{
		work.setNumDisp4(number);
   }

	/**
	 * 	Update NumDisp4 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setNumDisp4(char[] value)  throws CFException{
		work.setNumDisp4(value);
	}   


        public Move0Ctx getMove0Ctx() {
            return Move0Ctx.this;
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

    public Split8OutCtx clone() {
        Split8OutCtx cloneObj = new Split8OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Split8OutCtx getSplit8OutCtx() {
            return new Split8OutCtx();
    }
     public class Split9InCtx implements Cloneable {
     Work work = Move0Ctx.this.getWork();

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
	 *	Returns the value of long3
	 *	@return long3
	 */
	public long getLong3() throws CFException {        
   		return work.getLong3();
	}
	
	/**
	 * 	Update Long3 with the passed value
	 *	@param number
	 */
	public void setLong3(long number)  throws CFException{
		work.setLong3(number);
	}



	/**
	 *	Returns the value of int3
	 *	@return int3
	 */
	public int getInt3() throws CFException {        
   		return work.getInt3();
	}
	
	/**
	 * 	Update Int3 with the passed value
	 *	@param number
	 */
	public void setInt3(int number)  throws CFException{
		work.setInt3(number);
	}


	public void setInt3(long number)  throws CFException{
		work.setInt3((int)number);
	}



        public Move0Ctx getMove0Ctx() {
            return Move0Ctx.this;
        }

        public Split9OutCtx getSplit9OutCtx() {
            return new Split9OutCtx();
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

    public Split9InCtx clone() {
        Split9InCtx cloneObj = new Split9InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Split9InCtx getSplit9InCtx() {
            return new Split9InCtx();
    }
     public class Split9OutCtx implements Cloneable {
     Work work = Move0Ctx.this.getWork();

	/**
	 *	Returns the value of long4
	 *	@return long4
	 */
	public long getLong4() throws CFException {        
   		return work.getLong4();
	}
	
	/**
	 * 	Update Long4 with the passed value
	 *	@param number
	 */
	public void setLong4(long number)  throws CFException{
		work.setLong4(number);
	}



	/**
	 *	Returns the value of int4
	 *	@return int4
	 */
	public int getInt4() throws CFException {        
   		return work.getInt4();
	}
	
	/**
	 * 	Update Int4 with the passed value
	 *	@param number
	 */
	public void setInt4(int number)  throws CFException{
		work.setInt4(number);
	}


	public void setInt4(long number)  throws CFException{
		work.setInt4((int)number);
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
	 *	Returns the value of long3
	 *	@return long3
	 */
	public long getLong3() throws CFException {        
   		return work.getLong3();
	}
	
	/**
	 * 	Update Long3 with the passed value
	 *	@param number
	 */
	public void setLong3(long number)  throws CFException{
		work.setLong3(number);
	}



	/**
	 *	Returns the value of short4
	 *	@return short4
	 */
	public short getShort4() throws CFException {        
   		return work.getShort4();
	}
	
	/**
	 * 	Update Short4 with the passed value
	 *	@param number
	 */
	public void setShort4(short number)  throws CFException{
		work.setShort4(number);
	}

	public void setShort4(int number)  throws CFException{
		work.setShort4((short)number);
	}

	public void setShort4(long number)  throws CFException{
		work.setShort4((short)number);
	}



	public BigDecimal getNumDec4() throws CFException{      
   		return work.getNumDec4();
	}

    public char[] getNumDec4String() throws CFException {
          return  work.getNumDec4().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update NumDec4 with the passed number
	 *	@param number
	 */
	public void setNumDec4(BigDecimal number)  throws CFException{
		work.setNumDec4(number);
   }

	/**
	 *	Returns the value of numDisp4
	 *	@return numDisp4
	 */
	public BigDecimal getNumDisp4() throws CFException {
   		return work.getNumDisp4();
	}

    /**
	 *	Returns the String value of numDisp4
	 *	@return numDisp4
	 */
	public char[]  getNumDisp4ActualString()  throws CFException{
	    return work.getNumDisp4ActualString();
	}

	 /**
     *	Returns String value of numDisp4
     *	@return numDisp4
     */
    public char[]  getNumDisp4String() throws CFException {
         return work.getNumDisp4String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean numDisp4IsNumeric() {
        return work.numDisp4IsNumeric();
    }
	/**
	 * 	Update NumDisp4 with the passed number
	 *	@param number
	 */
	public void setNumDisp4(BigDecimal number)  throws CFException{
		work.setNumDisp4(number);
   }

	/**
	 * 	Update NumDisp4 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setNumDisp4(char[] value)  throws CFException{
		work.setNumDisp4(value);
	}   

	/**
	 *	Returns the value of int3
	 *	@return int3
	 */
	public int getInt3() throws CFException {        
   		return work.getInt3();
	}
	
	/**
	 * 	Update Int3 with the passed value
	 *	@param number
	 */
	public void setInt3(int number)  throws CFException{
		work.setInt3(number);
	}


	public void setInt3(long number)  throws CFException{
		work.setInt3((int)number);
	}



        public Move0Ctx getMove0Ctx() {
            return Move0Ctx.this;
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

    public Split9OutCtx clone() {
        Split9OutCtx cloneObj = new Split9OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Split9OutCtx getSplit9OutCtx() {
            return new Split9OutCtx();
    }
     public class Split10InCtx implements Cloneable {
     Work work = Move0Ctx.this.getWork();

	/**
	 *	Returns the value of short3
	 *	@return short3
	 */
	public short getShort3() throws CFException {        
   		return work.getShort3();
	}
	
	/**
	 * 	Update Short3 with the passed value
	 *	@param number
	 */
	public void setShort3(short number)  throws CFException{
		work.setShort3(number);
	}

	public void setShort3(int number)  throws CFException{
		work.setShort3((short)number);
	}

	public void setShort3(long number)  throws CFException{
		work.setShort3((short)number);
	}




        public Move0Ctx getMove0Ctx() {
            return Move0Ctx.this;
        }

        public Split10OutCtx getSplit10OutCtx() {
            return new Split10OutCtx();
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

    public Split10InCtx clone() {
        Split10InCtx cloneObj = new Split10InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Split10InCtx getSplit10InCtx() {
            return new Split10InCtx();
    }
     public class Split10OutCtx implements Cloneable {
     Work work = Move0Ctx.this.getWork();

	/**
	 *	Returns the value of short3
	 *	@return short3
	 */
	public short getShort3() throws CFException {        
   		return work.getShort3();
	}
	
	/**
	 * 	Update Short3 with the passed value
	 *	@param number
	 */
	public void setShort3(short number)  throws CFException{
		work.setShort3(number);
	}

	public void setShort3(int number)  throws CFException{
		work.setShort3((short)number);
	}

	public void setShort3(long number)  throws CFException{
		work.setShort3((short)number);
	}



	/**
	 *	Returns the value of long4
	 *	@return long4
	 */
	public long getLong4() throws CFException {        
   		return work.getLong4();
	}
	
	/**
	 * 	Update Long4 with the passed value
	 *	@param number
	 */
	public void setLong4(long number)  throws CFException{
		work.setLong4(number);
	}



	/**
	 *	Returns the value of int4
	 *	@return int4
	 */
	public int getInt4() throws CFException {        
   		return work.getInt4();
	}
	
	/**
	 * 	Update Int4 with the passed value
	 *	@param number
	 */
	public void setInt4(int number)  throws CFException{
		work.setInt4(number);
	}


	public void setInt4(long number)  throws CFException{
		work.setInt4((int)number);
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
	 *	Returns the value of short4
	 *	@return short4
	 */
	public short getShort4() throws CFException {        
   		return work.getShort4();
	}
	
	/**
	 * 	Update Short4 with the passed value
	 *	@param number
	 */
	public void setShort4(short number)  throws CFException{
		work.setShort4(number);
	}

	public void setShort4(int number)  throws CFException{
		work.setShort4((short)number);
	}

	public void setShort4(long number)  throws CFException{
		work.setShort4((short)number);
	}



	public BigDecimal getNumDec4() throws CFException{      
   		return work.getNumDec4();
	}

    public char[] getNumDec4String() throws CFException {
          return  work.getNumDec4().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update NumDec4 with the passed number
	 *	@param number
	 */
	public void setNumDec4(BigDecimal number)  throws CFException{
		work.setNumDec4(number);
   }

	/**
	 *	Returns the value of numDisp4
	 *	@return numDisp4
	 */
	public BigDecimal getNumDisp4() throws CFException {
   		return work.getNumDisp4();
	}

    /**
	 *	Returns the String value of numDisp4
	 *	@return numDisp4
	 */
	public char[]  getNumDisp4ActualString()  throws CFException{
	    return work.getNumDisp4ActualString();
	}

	 /**
     *	Returns String value of numDisp4
     *	@return numDisp4
     */
    public char[]  getNumDisp4String() throws CFException {
         return work.getNumDisp4String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean numDisp4IsNumeric() {
        return work.numDisp4IsNumeric();
    }
	/**
	 * 	Update NumDisp4 with the passed number
	 *	@param number
	 */
	public void setNumDisp4(BigDecimal number)  throws CFException{
		work.setNumDisp4(number);
   }

	/**
	 * 	Update NumDisp4 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setNumDisp4(char[] value)  throws CFException{
		work.setNumDisp4(value);
	}   


        public Move0Ctx getMove0Ctx() {
            return Move0Ctx.this;
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

    public Split10OutCtx clone() {
        Split10OutCtx cloneObj = new Split10OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        return cloneObj;
    }

    }

    public Split10OutCtx getSplit10OutCtx() {
            return new Split10OutCtx();
    }
     public class UsbIssueInCtx implements Cloneable {
     Work work = Move0Ctx.this.getWork();
     AidUserByteGroup aidUserByteGroup = Move0Ctx.this.getAidUserByteGroup();

	/**
	 *	Returns the value of label
	 *	@return label
	 */
   public char[] getLabel() throws CFException  {              
   		return work.getLabel();
   }

  
	/**
	*  set variable label
	*  @param value
	**/
   public void setLabel(char[] value) throws CFException {
      work.setLabel(value);
   } 

	/**
	 *	Returns the value of aidAlphaApplNum
	 *	@return aidAlphaApplNum
	 */
   public char[] getAidAlphaApplNum() throws CFException  {              
   		return aidUserByteGroup.getAidUserByteRedefined().getAidAlphaApplNum();
   }

  
	/**
	*  set variable aidAlphaApplNum
	*  @param value
	**/
   public void setAidAlphaApplNum(char[] value) throws CFException {
      aidUserByteGroup.getAidUserByteRedefined().setAidAlphaApplNum(value);
   } 

     /**
	 * 	Update AidAlphaApplNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAidAlphaApplNum(char[] source, int sourceIndex) throws CFException {
      aidUserByteGroup.getAidUserByteRedefined().setAidAlphaApplNum(source, sourceIndex);
   	
   }
   
   public void setAidAlphaApplNum(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      aidUserByteGroup.getAidUserByteRedefined().setAidAlphaApplNum(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AidAlphaApplNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAidAlphaApplNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      aidUserByteGroup.getAidUserByteRedefined().setAidAlphaApplNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AidAlphaApplNum with another Field
	 *	@param value
	 */
   public void setAidAlphaApplNum(Field source) {
      aidUserByteGroup.getAidUserByteRedefined().setAidAlphaApplNum(source);
   }  
   
     /**
	 * 	Update AidAlphaApplNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAidAlphaApplNum(Field source, int sourceIndex,int sourceLen) {
      aidUserByteGroup.getAidUserByteRedefined().setAidAlphaApplNum(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AidAlphaApplNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAidAlphaApplNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      aidUserByteGroup.getAidUserByteRedefined().setAidAlphaApplNum(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of aidApplicationNum
	 *	@return aidApplicationNum
	 */
	public int getAidApplicationNum() throws CFException {
   		return aidUserByteGroup.getAidUserByteRedefined01().getAidApplicationNum();
	}


	/**
	 *	Returns String value of aidApplicationNum
	 *	@return aidApplicationNum
	 */
	public char[]  getAidApplicationNumString() throws CFException {
	     return String.valueOf(aidUserByteGroup.getAidUserByteRedefined01().getAidApplicationNumString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean aidApplicationNumIsNumeric()  throws CFException{
	    return aidUserByteGroup.getAidUserByteRedefined01().aidApplicationNumIsNumeric();
	}

	/**
	 * 	Update AidApplicationNum with the passed value
	 *	@param number
	 */
	public void setAidApplicationNum(int number)  throws CFException{
		aidUserByteGroup.getAidUserByteRedefined01().setAidApplicationNum(number);
	}
	

	public void setAidApplicationNum(long number)  throws CFException{
	    aidUserByteGroup.getAidUserByteRedefined01().setAidApplicationNum(number);
	}
	
	
	/**
	 * 	Update AidApplicationNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setAidApplicationNum(char[] value)  throws CFException {
		aidUserByteGroup.getAidUserByteRedefined01().setAidApplicationNum(value);
	}
	
	/**
	 * 	Update AidApplicationNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAidApplicationNumString(char[] value)  throws CFException{
		aidUserByteGroup.getAidUserByteRedefined01().setAidApplicationNum(value);
	}	

	/**
	 *	Returns the value of wrkaApplication
	 *	@return wrkaApplication
	 */
   public char[] getWrkaApplication() throws CFException  {              
   		return work.getWrkaApplication();
   }

  
	/**
	*  set variable wrkaApplication
	*  @param value
	**/
   public void setWrkaApplication(char[] value) throws CFException {
      work.setWrkaApplication(value);
   } 


        public Move0Ctx getMove0Ctx() {
            return Move0Ctx.this;
        }

        public UsbIssueOutCtx getUsbIssueOutCtx() {
            return new UsbIssueOutCtx();
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
        str += aidUserByteGroup.hashCode();
       return str.hashCode();
    }

    public UsbIssueInCtx clone() {
        UsbIssueInCtx cloneObj = new UsbIssueInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.aidUserByteGroup = new AidUserByteGroup();
        cloneObj.aidUserByteGroup.set(aidUserByteGroup.getClonedField());
        return cloneObj;
    }

    }

    public UsbIssueInCtx getUsbIssueInCtx() {
            return new UsbIssueInCtx();
    }
     public class UsbIssueOutCtx implements Cloneable {
     Work work = Move0Ctx.this.getWork();
     AidUserByteGroup aidUserByteGroup = Move0Ctx.this.getAidUserByteGroup();

	/**
	 *	Returns the value of aidUserByte
	 *	@return aidUserByte
	 */
   public char[] getAidUserByte() throws CFException  {              
   		return aidUserByteGroup.getAidUserByte();
   }

  
	/**
	*  set variable aidUserByte
	*  @param value
	**/
   public void setAidUserByte(char[] value) throws CFException {
      aidUserByteGroup.setAidUserByte(value);
   } 

     /**
	 * 	Update AidUserByte 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAidUserByte(char[] source, int sourceIndex) throws CFException {
      aidUserByteGroup.setAidUserByte(source, sourceIndex);
   	
   }
   
   public void setAidUserByte(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      aidUserByteGroup.setAidUserByte(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update AidUserByte 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAidUserByte(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      aidUserByteGroup.setAidUserByte(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update AidUserByte with another Field
	 *	@param value
	 */
   public void setAidUserByte(Field source) {
      aidUserByteGroup.setAidUserByte(source);
   }  
   
     /**
	 * 	Update AidUserByte 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAidUserByte(Field source, int sourceIndex,int sourceLen) {
      aidUserByteGroup.setAidUserByte(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update AidUserByte 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAidUserByte(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      aidUserByteGroup.setAidUserByte(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of aidApplicationNum
	 *	@return aidApplicationNum
	 */
	public int getAidApplicationNum() throws CFException {
   		return aidUserByteGroup.getAidUserByteRedefined01().getAidApplicationNum();
	}


	/**
	 *	Returns String value of aidApplicationNum
	 *	@return aidApplicationNum
	 */
	public char[]  getAidApplicationNumString() throws CFException {
	     return String.valueOf(aidUserByteGroup.getAidUserByteRedefined01().getAidApplicationNumString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean aidApplicationNumIsNumeric()  throws CFException{
	    return aidUserByteGroup.getAidUserByteRedefined01().aidApplicationNumIsNumeric();
	}

	/**
	 * 	Update AidApplicationNum with the passed value
	 *	@param number
	 */
	public void setAidApplicationNum(int number)  throws CFException{
		aidUserByteGroup.getAidUserByteRedefined01().setAidApplicationNum(number);
	}
	

	public void setAidApplicationNum(long number)  throws CFException{
	    aidUserByteGroup.getAidUserByteRedefined01().setAidApplicationNum(number);
	}
	
	
	/**
	 * 	Update AidApplicationNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setAidApplicationNum(char[] value)  throws CFException {
		aidUserByteGroup.getAidUserByteRedefined01().setAidApplicationNum(value);
	}
	
	/**
	 * 	Update AidApplicationNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAidApplicationNumString(char[] value)  throws CFException{
		aidUserByteGroup.getAidUserByteRedefined01().setAidApplicationNum(value);
	}	

	/**
	 *	Returns the value of sub1
	 *	@return sub1
	 */
	public int getSub1() throws CFException {
   		return work.getSub1();
	}


	/**
	 *	Returns String value of sub1
	 *	@return sub1
	 */
	public char[]  getSub1String() throws CFException {
	     return String.valueOf(work.getSub1String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sub1IsNumeric()  throws CFException{
	    return work.sub1IsNumeric();
	}

	/**
	 * 	Update Sub1 with the passed value
	 *	@param number
	 */
	public void setSub1(int number)  throws CFException{
		work.setSub1(number);
	}
	

	public void setSub1(long number)  throws CFException{
	    work.setSub1(number);
	}
	
	
	/**
	 * 	Update Sub1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSub1(char[] value)  throws CFException {
		work.setSub1(value);
	}
	
	/**
	 * 	Update Sub1 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSub1String(char[] value)  throws CFException{
		work.setSub1(value);
	}	

	/**
	 *	Returns the value of wrkaApplication
	 *	@return wrkaApplication
	 */
   public char[] getWrkaApplication() throws CFException  {              
   		return work.getWrkaApplication();
   }

  
	/**
	*  set variable wrkaApplication
	*  @param value
	**/
   public void setWrkaApplication(char[] value) throws CFException {
      work.setWrkaApplication(value);
   } 


        public Move0Ctx getMove0Ctx() {
            return Move0Ctx.this;
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
        str += aidUserByteGroup.hashCode();
       return str.hashCode();
    }

    public UsbIssueOutCtx clone() {
        UsbIssueOutCtx cloneObj = new UsbIssueOutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.aidUserByteGroup = new AidUserByteGroup();
        cloneObj.aidUserByteGroup.set(aidUserByteGroup.getClonedField());
        return cloneObj;
    }

    }

    public UsbIssueOutCtx getUsbIssueOutCtx() {
            return new UsbIssueOutCtx();
    }
     public class Process1Split11InCtx implements Cloneable {
     Work work = Move0Ctx.this.getWork();
     PackedTo1 packedTo1 = Move0Ctx.this.getPackedTo1();
     PackedTo2 packedTo2 = Move0Ctx.this.getPackedTo2();

	/**
	 *	Returns the value of packedTo1
	 *	@return packedTo1
	 */   
	 public PackedTo1 getPackedTo1() {
   	return packedTo1;
   }


	/**
	 *	Returns the value of packedTo2
	 *	@return packedTo2
	 */   
	 public PackedTo2 getPackedTo2() {
   	return packedTo2;
   }



        public Move0Ctx getMove0Ctx() {
            return Move0Ctx.this;
        }

        public Process1Split11OutCtx getProcess1Split11OutCtx() {
            return new Process1Split11OutCtx();
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
        str += packedTo1.hashCode();
        str += packedTo2.hashCode();
       return str.hashCode();
    }

    public Process1Split11InCtx clone() {
        Process1Split11InCtx cloneObj = new Process1Split11InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.packedTo1 = new PackedTo1();
        cloneObj.packedTo1.set(packedTo1.getClonedField());
        cloneObj.packedTo2 = new PackedTo2();
        cloneObj.packedTo2.set(packedTo2.getClonedField());
        return cloneObj;
    }

    }

    public Process1Split11InCtx getProcess1Split11InCtx() {
            return new Process1Split11InCtx();
    }
     public class Process1Split11OutCtx implements Cloneable {
     Work work = Move0Ctx.this.getWork();
     PackedTo1 packedTo1 = Move0Ctx.this.getPackedTo1();
     PackedTo2 packedTo2 = Move0Ctx.this.getPackedTo2();

	/**
	 *	Returns the value of d50
	 *	@return d50
	 */
	public BigDecimal getD50() throws CFException {
   		return work.getD50();
	}

    /**
	 *	Returns the String value of d50
	 *	@return d50
	 */
	public char[]  getD50ActualString()  throws CFException{
	    return work.getD50ActualString();
	}

	 /**
     *	Returns String value of d50
     *	@return d50
     */
    public char[]  getD50String() throws CFException {
         return work.getD50String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean d50IsNumeric() {
        return work.d50IsNumeric();
    }
	/**
	 * 	Update D50 with the passed number
	 *	@param number
	 */
	public void setD50(BigDecimal number)  throws CFException{
		work.setD50(number);
   }

	/**
	 * 	Update D50 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setD50(char[] value)  throws CFException{
		work.setD50(value);
	}   

	public BigDecimal getT11() throws CFException{      
   		return packedTo2.getT11();
	}

    public char[] getT11String() throws CFException {
          return  packedTo2.getT11().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update T11 with the passed number
	 *	@param number
	 */
	public void setT11(BigDecimal number)  throws CFException{
		packedTo2.setT11(number);
   }

	/**
	 *	Returns the value of d40
	 *	@return d40
	 */
	public BigDecimal getD40() throws CFException {
   		return work.getD40();
	}

    /**
	 *	Returns the String value of d40
	 *	@return d40
	 */
	public char[]  getD40ActualString()  throws CFException{
	    return work.getD40ActualString();
	}

	 /**
     *	Returns String value of d40
     *	@return d40
     */
    public char[]  getD40String() throws CFException {
         return work.getD40String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean d40IsNumeric() {
        return work.d40IsNumeric();
    }
	/**
	 * 	Update D40 with the passed number
	 *	@param number
	 */
	public void setD40(BigDecimal number)  throws CFException{
		work.setD40(number);
   }

	/**
	 * 	Update D40 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setD40(char[] value)  throws CFException{
		work.setD40(value);
	}   

	/**
	 *	Returns the value of d41
	 *	@return d41
	 */
	public BigDecimal getD41() throws CFException {
   		return work.getD41();
	}


	 /**
     *	Returns String value of d41
     *	@return d41
     */
    public char[]  getD41String() throws CFException {
         return work.getD41String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean d41IsNumeric() {
        return work.d41IsNumeric();
    }
	/**
	 * 	Update D41 with the passed number
	 *	@param number
	 */
	public void setD41(BigDecimal number)  throws CFException{
		work.setD41(number);
   }

	/**
	 * 	Update D41 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setD41(char[] value)  throws CFException{
		work.setD41(value);
	}   

	/**
	 *	Returns the value of d51
	 *	@return d51
	 */
	public BigDecimal getD51() throws CFException {
   		return work.getD51();
	}


	 /**
     *	Returns String value of d51
     *	@return d51
     */
    public char[]  getD51String() throws CFException {
         return work.getD51String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean d51IsNumeric() {
        return work.d51IsNumeric();
    }
	/**
	 * 	Update D51 with the passed number
	 *	@param number
	 */
	public void setD51(BigDecimal number)  throws CFException{
		work.setD51(number);
   }

	/**
	 * 	Update D51 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setD51(char[] value)  throws CFException{
		work.setD51(value);
	}   

	public BigDecimal getT10() throws CFException{      
   		return packedTo1.getT10();
	}

    public char[] getT10String() throws CFException {
          return  packedTo1.getT10().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update T10 with the passed number
	 *	@param number
	 */
	public void setT10(BigDecimal number)  throws CFException{
		packedTo1.setT10(number);
   }

	/**
	 *	Returns the value of d21
	 *	@return d21
	 */
	public BigDecimal getD21() throws CFException {
   		return work.getD21();
	}


	 /**
     *	Returns String value of d21
     *	@return d21
     */
    public char[]  getD21String() throws CFException {
         return work.getD21String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean d21IsNumeric() {
        return work.d21IsNumeric();
    }
	/**
	 * 	Update D21 with the passed number
	 *	@param number
	 */
	public void setD21(BigDecimal number)  throws CFException{
		work.setD21(number);
   }

	/**
	 * 	Update D21 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setD21(char[] value)  throws CFException{
		work.setD21(value);
	}   

	/**
	 *	Returns the value of d30
	 *	@return d30
	 */
	public BigDecimal getD30() throws CFException {
   		return work.getD30();
	}

    /**
	 *	Returns the String value of d30
	 *	@return d30
	 */
	public char[]  getD30ActualString()  throws CFException{
	    return work.getD30ActualString();
	}

	 /**
     *	Returns String value of d30
     *	@return d30
     */
    public char[]  getD30String() throws CFException {
         return work.getD30String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean d30IsNumeric() {
        return work.d30IsNumeric();
    }
	/**
	 * 	Update D30 with the passed number
	 *	@param number
	 */
	public void setD30(BigDecimal number)  throws CFException{
		work.setD30(number);
   }

	/**
	 * 	Update D30 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setD30(char[] value)  throws CFException{
		work.setD30(value);
	}   

	/**
	 *	Returns the value of d31
	 *	@return d31
	 */
	public BigDecimal getD31() throws CFException {
   		return work.getD31();
	}


	 /**
     *	Returns String value of d31
     *	@return d31
     */
    public char[]  getD31String() throws CFException {
         return work.getD31String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean d31IsNumeric() {
        return work.d31IsNumeric();
    }
	/**
	 * 	Update D31 with the passed number
	 *	@param number
	 */
	public void setD31(BigDecimal number)  throws CFException{
		work.setD31(number);
   }

	/**
	 * 	Update D31 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setD31(char[] value)  throws CFException{
		work.setD31(value);
	}   


        public Move0Ctx getMove0Ctx() {
            return Move0Ctx.this;
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
        str += packedTo1.hashCode();
        str += packedTo2.hashCode();
       return str.hashCode();
    }

    public Process1Split11OutCtx clone() {
        Process1Split11OutCtx cloneObj = new Process1Split11OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.packedTo1 = new PackedTo1();
        cloneObj.packedTo1.set(packedTo1.getClonedField());
        cloneObj.packedTo2 = new PackedTo2();
        cloneObj.packedTo2.set(packedTo2.getClonedField());
        return cloneObj;
    }

    }

    public Process1Split11OutCtx getProcess1Split11OutCtx() {
            return new Process1Split11OutCtx();
    }
     public class Process2Split13InCtx implements Cloneable {
     Work work = Move0Ctx.this.getWork();
     PackedTo1 packedTo1 = Move0Ctx.this.getPackedTo1();
     PackedTo2 packedTo2 = Move0Ctx.this.getPackedTo2();

	/**
	 *	Returns the value of packedTo1
	 *	@return packedTo1
	 */   
	 public PackedTo1 getPackedTo1() {
   	return packedTo1;
   }


	/**
	 *	Returns the value of packedTo2
	 *	@return packedTo2
	 */   
	 public PackedTo2 getPackedTo2() {
   	return packedTo2;
   }



        public Move0Ctx getMove0Ctx() {
            return Move0Ctx.this;
        }

        public Process2Split13OutCtx getProcess2Split13OutCtx() {
            return new Process2Split13OutCtx();
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
        str += packedTo1.hashCode();
        str += packedTo2.hashCode();
       return str.hashCode();
    }

    public Process2Split13InCtx clone() {
        Process2Split13InCtx cloneObj = new Process2Split13InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.packedTo1 = new PackedTo1();
        cloneObj.packedTo1.set(packedTo1.getClonedField());
        cloneObj.packedTo2 = new PackedTo2();
        cloneObj.packedTo2.set(packedTo2.getClonedField());
        return cloneObj;
    }

    }

    public Process2Split13InCtx getProcess2Split13InCtx() {
            return new Process2Split13InCtx();
    }
     public class Process2Split13OutCtx implements Cloneable {
     Work work = Move0Ctx.this.getWork();
     PackedTo1 packedTo1 = Move0Ctx.this.getPackedTo1();
     PackedTo2 packedTo2 = Move0Ctx.this.getPackedTo2();

	public BigDecimal getT11() throws CFException{      
   		return packedTo2.getT11();
	}

    public char[] getT11String() throws CFException {
          return  packedTo2.getT11().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update T11 with the passed number
	 *	@param number
	 */
	public void setT11(BigDecimal number)  throws CFException{
		packedTo2.setT11(number);
   }

	/**
	 *	Returns the value of d51
	 *	@return d51
	 */
	public BigDecimal getD51() throws CFException {
   		return work.getD51();
	}


	 /**
     *	Returns String value of d51
     *	@return d51
     */
    public char[]  getD51String() throws CFException {
         return work.getD51String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean d51IsNumeric() {
        return work.d51IsNumeric();
    }
	/**
	 * 	Update D51 with the passed number
	 *	@param number
	 */
	public void setD51(BigDecimal number)  throws CFException{
		work.setD51(number);
   }

	/**
	 * 	Update D51 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setD51(char[] value)  throws CFException{
		work.setD51(value);
	}   

	public BigDecimal getT10() throws CFException{      
   		return packedTo1.getT10();
	}

    public char[] getT10String() throws CFException {
          return  packedTo1.getT10().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update T10 with the passed number
	 *	@param number
	 */
	public void setT10(BigDecimal number)  throws CFException{
		packedTo1.setT10(number);
   }

	/**
	 *	Returns the value of d81
	 *	@return d81
	 */
	public BigDecimal getD81() throws CFException {
   		return work.getD81();
	}


	 /**
     *	Returns String value of d81
     *	@return d81
     */
    public char[]  getD81String() throws CFException {
         return work.getD81String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean d81IsNumeric() {
        return work.d81IsNumeric();
    }
	/**
	 * 	Update D81 with the passed number
	 *	@param number
	 */
	public void setD81(BigDecimal number)  throws CFException{
		work.setD81(number);
   }

	/**
	 * 	Update D81 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setD81(char[] value)  throws CFException{
		work.setD81(value);
	}   

	/**
	 *	Returns the value of d71
	 *	@return d71
	 */
	public BigDecimal getD71() throws CFException {
   		return work.getD71();
	}


	 /**
     *	Returns String value of d71
     *	@return d71
     */
    public char[]  getD71String() throws CFException {
         return work.getD71String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean d71IsNumeric() {
        return work.d71IsNumeric();
    }
	/**
	 * 	Update D71 with the passed number
	 *	@param number
	 */
	public void setD71(BigDecimal number)  throws CFException{
		work.setD71(number);
   }

	/**
	 * 	Update D71 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setD71(char[] value)  throws CFException{
		work.setD71(value);
	}   

	/**
	 *	Returns the value of d61
	 *	@return d61
	 */
	public BigDecimal getD61() throws CFException {
   		return work.getD61();
	}


	 /**
     *	Returns String value of d61
     *	@return d61
     */
    public char[]  getD61String() throws CFException {
         return work.getD61String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean d61IsNumeric() {
        return work.d61IsNumeric();
    }
	/**
	 * 	Update D61 with the passed number
	 *	@param number
	 */
	public void setD61(BigDecimal number)  throws CFException{
		work.setD61(number);
   }

	/**
	 * 	Update D61 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setD61(char[] value)  throws CFException{
		work.setD61(value);
	}   

	/**
	 *	Returns the value of d60
	 *	@return d60
	 */
	public BigDecimal getD60() throws CFException {
   		return work.getD60();
	}

    /**
	 *	Returns the String value of d60
	 *	@return d60
	 */
	public char[]  getD60ActualString()  throws CFException{
	    return work.getD60ActualString();
	}

	 /**
     *	Returns String value of d60
     *	@return d60
     */
    public char[]  getD60String() throws CFException {
         return work.getD60String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean d60IsNumeric() {
        return work.d60IsNumeric();
    }
	/**
	 * 	Update D60 with the passed number
	 *	@param number
	 */
	public void setD60(BigDecimal number)  throws CFException{
		work.setD60(number);
   }

	/**
	 * 	Update D60 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setD60(char[] value)  throws CFException{
		work.setD60(value);
	}   

	/**
	 *	Returns the value of d70
	 *	@return d70
	 */
	public BigDecimal getD70() throws CFException {
   		return work.getD70();
	}

    /**
	 *	Returns the String value of d70
	 *	@return d70
	 */
	public char[]  getD70ActualString()  throws CFException{
	    return work.getD70ActualString();
	}

	 /**
     *	Returns String value of d70
     *	@return d70
     */
    public char[]  getD70String() throws CFException {
         return work.getD70String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean d70IsNumeric() {
        return work.d70IsNumeric();
    }
	/**
	 * 	Update D70 with the passed number
	 *	@param number
	 */
	public void setD70(BigDecimal number)  throws CFException{
		work.setD70(number);
   }

	/**
	 * 	Update D70 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setD70(char[] value)  throws CFException{
		work.setD70(value);
	}   

	/**
	 *	Returns the value of d80
	 *	@return d80
	 */
	public BigDecimal getD80() throws CFException {
   		return work.getD80();
	}

    /**
	 *	Returns the String value of d80
	 *	@return d80
	 */
	public char[]  getD80ActualString()  throws CFException{
	    return work.getD80ActualString();
	}

	 /**
     *	Returns String value of d80
     *	@return d80
     */
    public char[]  getD80String() throws CFException {
         return work.getD80String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean d80IsNumeric() {
        return work.d80IsNumeric();
    }
	/**
	 * 	Update D80 with the passed number
	 *	@param number
	 */
	public void setD80(BigDecimal number)  throws CFException{
		work.setD80(number);
   }

	/**
	 * 	Update D80 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setD80(char[] value)  throws CFException{
		work.setD80(value);
	}   


        public Move0Ctx getMove0Ctx() {
            return Move0Ctx.this;
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
        str += packedTo1.hashCode();
        str += packedTo2.hashCode();
       return str.hashCode();
    }

    public Process2Split13OutCtx clone() {
        Process2Split13OutCtx cloneObj = new Process2Split13OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.packedTo1 = new PackedTo1();
        cloneObj.packedTo1.set(packedTo1.getClonedField());
        cloneObj.packedTo2 = new PackedTo2();
        cloneObj.packedTo2.set(packedTo2.getClonedField());
        return cloneObj;
    }

    }

    public Process2Split13OutCtx getProcess2Split13OutCtx() {
            return new Process2Split13OutCtx();
    }
     public class Process3Split15InCtx implements Cloneable {
     Work work = Move0Ctx.this.getWork();
     PackedTo1 packedTo1 = Move0Ctx.this.getPackedTo1();
     PackedTo2 packedTo2 = Move0Ctx.this.getPackedTo2();

	/**
	 *	Returns the value of d81
	 *	@return d81
	 */
	public BigDecimal getD81() throws CFException {
   		return work.getD81();
	}


	 /**
     *	Returns String value of d81
     *	@return d81
     */
    public char[]  getD81String() throws CFException {
         return work.getD81String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean d81IsNumeric() {
        return work.d81IsNumeric();
    }
	/**
	 * 	Update D81 with the passed number
	 *	@param number
	 */
	public void setD81(BigDecimal number)  throws CFException{
		work.setD81(number);
   }

	/**
	 * 	Update D81 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setD81(char[] value)  throws CFException{
		work.setD81(value);
	}   

	/**
	 *	Returns the value of packedTo1
	 *	@return packedTo1
	 */   
	 public PackedTo1 getPackedTo1() {
   	return packedTo1;
   }


	/**
	 *	Returns the value of packedTo2
	 *	@return packedTo2
	 */   
	 public PackedTo2 getPackedTo2() {
   	return packedTo2;
   }



        public Move0Ctx getMove0Ctx() {
            return Move0Ctx.this;
        }

        public Process3Split15OutCtx getProcess3Split15OutCtx() {
            return new Process3Split15OutCtx();
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
        str += packedTo1.hashCode();
        str += packedTo2.hashCode();
       return str.hashCode();
    }

    public Process3Split15InCtx clone() {
        Process3Split15InCtx cloneObj = new Process3Split15InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.packedTo1 = new PackedTo1();
        cloneObj.packedTo1.set(packedTo1.getClonedField());
        cloneObj.packedTo2 = new PackedTo2();
        cloneObj.packedTo2.set(packedTo2.getClonedField());
        return cloneObj;
    }

    }

    public Process3Split15InCtx getProcess3Split15InCtx() {
            return new Process3Split15InCtx();
    }
     public class Process3Split15OutCtx implements Cloneable {
     Work work = Move0Ctx.this.getWork();
     PackedTo1 packedTo1 = Move0Ctx.this.getPackedTo1();
     PackedTo2 packedTo2 = Move0Ctx.this.getPackedTo2();

	public BigDecimal getT11() throws CFException{      
   		return packedTo2.getT11();
	}

    public char[] getT11String() throws CFException {
          return  packedTo2.getT11().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update T11 with the passed number
	 *	@param number
	 */
	public void setT11(BigDecimal number)  throws CFException{
		packedTo2.setT11(number);
   }

	public BigDecimal getP31() throws CFException{      
   		return work.getP31();
	}

    public char[] getP31String() throws CFException {
          return  work.getP31().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update P31 with the passed number
	 *	@param number
	 */
	public void setP31(BigDecimal number)  throws CFException{
		work.setP31(number);
   }

	public BigDecimal getP20() throws CFException{      
   		return work.getP20();
	}

    public char[] getP20String() throws CFException {
          return  work.getP20().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update P20 with the passed number
	 *	@param number
	 */
	public void setP20(BigDecimal number)  throws CFException{
		work.setP20(number);
   }

	public BigDecimal getT10() throws CFException{      
   		return packedTo1.getT10();
	}

    public char[] getT10String() throws CFException {
          return  packedTo1.getT10().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update T10 with the passed number
	 *	@param number
	 */
	public void setT10(BigDecimal number)  throws CFException{
		packedTo1.setT10(number);
   }

	/**
	 *	Returns the value of d81
	 *	@return d81
	 */
	public BigDecimal getD81() throws CFException {
   		return work.getD81();
	}


	 /**
     *	Returns String value of d81
     *	@return d81
     */
    public char[]  getD81String() throws CFException {
         return work.getD81String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean d81IsNumeric() {
        return work.d81IsNumeric();
    }
	/**
	 * 	Update D81 with the passed number
	 *	@param number
	 */
	public void setD81(BigDecimal number)  throws CFException{
		work.setD81(number);
   }

	/**
	 * 	Update D81 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setD81(char[] value)  throws CFException{
		work.setD81(value);
	}   

	public BigDecimal getP30() throws CFException{      
   		return work.getP30();
	}

    public char[] getP30String() throws CFException {
          return  work.getP30().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update P30 with the passed number
	 *	@param number
	 */
	public void setP30(BigDecimal number)  throws CFException{
		work.setP30(number);
   }

	public BigDecimal getP11() throws CFException{      
   		return work.getP11();
	}

    public char[] getP11String() throws CFException {
          return  work.getP11().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update P11 with the passed number
	 *	@param number
	 */
	public void setP11(BigDecimal number)  throws CFException{
		work.setP11(number);
   }

	public BigDecimal getP21() throws CFException{      
   		return work.getP21();
	}

    public char[] getP21String() throws CFException {
          return  work.getP21().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update P21 with the passed number
	 *	@param number
	 */
	public void setP21(BigDecimal number)  throws CFException{
		work.setP21(number);
   }

	public BigDecimal getP10() throws CFException{      
   		return work.getP10();
	}

    public char[] getP10String() throws CFException {
          return  work.getP10().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update P10 with the passed number
	 *	@param number
	 */
	public void setP10(BigDecimal number)  throws CFException{
		work.setP10(number);
   }


        public Move0Ctx getMove0Ctx() {
            return Move0Ctx.this;
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
        str += packedTo1.hashCode();
        str += packedTo2.hashCode();
       return str.hashCode();
    }

    public Process3Split15OutCtx clone() {
        Process3Split15OutCtx cloneObj = new Process3Split15OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.packedTo1 = new PackedTo1();
        cloneObj.packedTo1.set(packedTo1.getClonedField());
        cloneObj.packedTo2 = new PackedTo2();
        cloneObj.packedTo2.set(packedTo2.getClonedField());
        return cloneObj;
    }

    }

    public Process3Split15OutCtx getProcess3Split15OutCtx() {
            return new Process3Split15OutCtx();
    }
     public class Process4Split17InCtx implements Cloneable {
     Work work = Move0Ctx.this.getWork();
     PackedTo1 packedTo1 = Move0Ctx.this.getPackedTo1();
     PackedTo2 packedTo2 = Move0Ctx.this.getPackedTo2();

	/**
	 *	Returns the value of packedTo1
	 *	@return packedTo1
	 */   
	 public PackedTo1 getPackedTo1() {
   	return packedTo1;
   }


	/**
	 *	Returns the value of packedTo2
	 *	@return packedTo2
	 */   
	 public PackedTo2 getPackedTo2() {
   	return packedTo2;
   }



        public Move0Ctx getMove0Ctx() {
            return Move0Ctx.this;
        }

        public Process4Split17OutCtx getProcess4Split17OutCtx() {
            return new Process4Split17OutCtx();
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
        str += packedTo1.hashCode();
        str += packedTo2.hashCode();
       return str.hashCode();
    }

    public Process4Split17InCtx clone() {
        Process4Split17InCtx cloneObj = new Process4Split17InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.packedTo1 = new PackedTo1();
        cloneObj.packedTo1.set(packedTo1.getClonedField());
        cloneObj.packedTo2 = new PackedTo2();
        cloneObj.packedTo2.set(packedTo2.getClonedField());
        return cloneObj;
    }

    }

    public Process4Split17InCtx getProcess4Split17InCtx() {
            return new Process4Split17InCtx();
    }
     public class Process4Split17OutCtx implements Cloneable {
     Work work = Move0Ctx.this.getWork();
     PackedTo1 packedTo1 = Move0Ctx.this.getPackedTo1();
     PackedTo2 packedTo2 = Move0Ctx.this.getPackedTo2();

	public BigDecimal getP60() throws CFException{      
   		return work.getP60();
	}

    public char[] getP60String() throws CFException {
          return  work.getP60().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update P60 with the passed number
	 *	@param number
	 */
	public void setP60(BigDecimal number)  throws CFException{
		work.setP60(number);
   }

	public BigDecimal getT11() throws CFException{      
   		return packedTo2.getT11();
	}

    public char[] getT11String() throws CFException {
          return  packedTo2.getT11().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update T11 with the passed number
	 *	@param number
	 */
	public void setT11(BigDecimal number)  throws CFException{
		packedTo2.setT11(number);
   }

	public BigDecimal getP61() throws CFException{      
   		return work.getP61();
	}

    public char[] getP61String() throws CFException {
          return  work.getP61().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update P61 with the passed number
	 *	@param number
	 */
	public void setP61(BigDecimal number)  throws CFException{
		work.setP61(number);
   }

	public BigDecimal getP40() throws CFException{      
   		return work.getP40();
	}

    public char[] getP40String() throws CFException {
          return  work.getP40().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update P40 with the passed number
	 *	@param number
	 */
	public void setP40(BigDecimal number)  throws CFException{
		work.setP40(number);
   }

	public BigDecimal getT10() throws CFException{      
   		return packedTo1.getT10();
	}

    public char[] getT10String() throws CFException {
          return  packedTo1.getT10().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update T10 with the passed number
	 *	@param number
	 */
	public void setT10(BigDecimal number)  throws CFException{
		packedTo1.setT10(number);
   }

	public BigDecimal getP50() throws CFException{      
   		return work.getP50();
	}

    public char[] getP50String() throws CFException {
          return  work.getP50().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update P50 with the passed number
	 *	@param number
	 */
	public void setP50(BigDecimal number)  throws CFException{
		work.setP50(number);
   }

	public BigDecimal getP51() throws CFException{      
   		return work.getP51();
	}

    public char[] getP51String() throws CFException {
          return  work.getP51().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update P51 with the passed number
	 *	@param number
	 */
	public void setP51(BigDecimal number)  throws CFException{
		work.setP51(number);
   }

	public BigDecimal getP41() throws CFException{      
   		return work.getP41();
	}

    public char[] getP41String() throws CFException {
          return  work.getP41().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update P41 with the passed number
	 *	@param number
	 */
	public void setP41(BigDecimal number)  throws CFException{
		work.setP41(number);
   }

	public BigDecimal getP70() throws CFException{      
   		return work.getP70();
	}

    public char[] getP70String() throws CFException {
          return  work.getP70().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update P70 with the passed number
	 *	@param number
	 */
	public void setP70(BigDecimal number)  throws CFException{
		work.setP70(number);
   }


        public Move0Ctx getMove0Ctx() {
            return Move0Ctx.this;
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
        str += packedTo1.hashCode();
        str += packedTo2.hashCode();
       return str.hashCode();
    }

    public Process4Split17OutCtx clone() {
        Process4Split17OutCtx cloneObj = new Process4Split17OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.packedTo1 = new PackedTo1();
        cloneObj.packedTo1.set(packedTo1.getClonedField());
        cloneObj.packedTo2 = new PackedTo2();
        cloneObj.packedTo2.set(packedTo2.getClonedField());
        return cloneObj;
    }

    }

    public Process4Split17OutCtx getProcess4Split17OutCtx() {
            return new Process4Split17OutCtx();
    }
     public class Process5Split19InCtx implements Cloneable {
     Work work = Move0Ctx.this.getWork();
     SmallParent smallParent = Move0Ctx.this.getSmallParent();
     CurrentDateGroup currentDateGroup = Move0Ctx.this.getCurrentDateGroup();
     Rl7abTableInit rl7abTableInit = Move0Ctx.this.getRl7abTableInit();
     AcceptDate acceptDate = Move0Ctx.this.getAcceptDate();
     PackedTo1 packedTo1 = Move0Ctx.this.getPackedTo1();
     GrandParent grandParent = Move0Ctx.this.getGrandParent();
     PackedTo2 packedTo2 = Move0Ctx.this.getPackedTo2();

	/**
	 *	Returns the value of rl7abTableInit
	 *	@return rl7abTableInit
	 */   
	 public Rl7abTableInit getRl7abTableInit() {
   	return rl7abTableInit;
   }


	/**
	 *	Returns the value of acceptDate
	 *	@return acceptDate
	 */   
	 public AcceptDate getAcceptDate() {
   	return acceptDate;
   }


	/**
	 *	Returns the value of rl7abTableInfo
	 *	@return rl7abTableInfo
	 */   
	 public Rl7abTableInfo getRl7abTableInfo() {
   	return rl7abTableInit.getRl7abTableInfo();
   }

   /**
	* 	Update Rl7abTableInfo with the passed value
	*	@param value
	*/
   public void setRl7abTableInfo(char[] value) throws CFException {
      rl7abTableInit.setRl7abTableInfo(value);
   }   

     /**
	 * 	Update Rl7abTableInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRl7abTableInfo(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	rl7abTableInit.setRl7abTableInfo(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Rl7abTableInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRl7abTableInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	rl7abTableInit.setRl7abTableInfo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Rl7abTableInfo with another Field
	 *	@param value
	 */
   public void setRl7abTableInfo(Field source) {
   	rl7abTableInit.setRl7abTableInfo(source);
   }  
   
     /**
	 * 	Update Rl7abTableInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRl7abTableInfo(Field source, int sourceIndex,int sourceLen) {
   	rl7abTableInit.setRl7abTableInfo(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Rl7abTableInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRl7abTableInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	rl7abTableInit.setRl7abTableInfo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of grandParent
	 *	@return grandParent
	 */   
	 public GrandParent getGrandParent() {
   	return grandParent;
   }


	/**
	 *	Returns the value of packedTo2
	 *	@return packedTo2
	 */   
	 public PackedTo2 getPackedTo2() {
   	return packedTo2;
   }


	/**
	 *	Returns the value of lkplanDataAllowUom
	 *	@return lkplanDataAllowUom
	 */
   public char[] getLkplanDataAllowUom() throws CFException  {              
   		return work.getLkplanDataAllowUom();
   }

  
	/**
	*  set variable lkplanDataAllowUom
	*  @param value
	**/
   public void setLkplanDataAllowUom(char[] value) throws CFException {
      work.setLkplanDataAllowUom(value);
   } 

	/**
	 *	Returns the value of yyyy01
	 *	@return yyyy01
	 */
   public char[] getYyyy01() throws CFException  {              
   		return acceptDate.getYyyy01();
   }

  
	/**
	*  set variable yyyy01
	*  @param value
	**/
   public void setYyyy01(char[] value) throws CFException {
      acceptDate.setYyyy01(value);
   } 

     /**
	 * 	Update Yyyy01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setYyyy01(char[] source, int sourceIndex) throws CFException {
      acceptDate.setYyyy01(source, sourceIndex);
   	
   }
   
   public void setYyyy01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      acceptDate.setYyyy01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Yyyy01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setYyyy01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptDate.setYyyy01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Yyyy01 with another Field
	 *	@param value
	 */
   public void setYyyy01(Field source) {
      acceptDate.setYyyy01(source);
   }  
   
     /**
	 * 	Update Yyyy01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setYyyy01(Field source, int sourceIndex,int sourceLen) {
      acceptDate.setYyyy01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Yyyy01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setYyyy01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptDate.setYyyy01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of dd01
	 *	@return dd01
	 */
   public char[] getDd01() throws CFException  {              
   		return acceptDate.getDd01();
   }

  
	/**
	*  set variable dd01
	*  @param value
	**/
   public void setDd01(char[] value) throws CFException {
      acceptDate.setDd01(value);
   } 

     /**
	 * 	Update Dd01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDd01(char[] source, int sourceIndex) throws CFException {
      acceptDate.setDd01(source, sourceIndex);
   	
   }
   
   public void setDd01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      acceptDate.setDd01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Dd01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDd01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptDate.setDd01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Dd01 with another Field
	 *	@param value
	 */
   public void setDd01(Field source) {
      acceptDate.setDd01(source);
   }  
   
     /**
	 * 	Update Dd01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDd01(Field source, int sourceIndex,int sourceLen) {
      acceptDate.setDd01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Dd01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDd01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptDate.setDd01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of ending
	 *	@return ending
	 */
   public char[] getEnding() throws CFException  {              
   		return work.getEnding();
   }

  
	/**
	*  set variable ending
	*  @param value
	**/
   public void setEnding(char[] value) throws CFException {
      work.setEnding(value);
   } 

	/**
	 *	Returns the value of mm01
	 *	@return mm01
	 */
   public char[] getMm01() throws CFException  {              
   		return acceptDate.getMm01();
   }

  
	/**
	*  set variable mm01
	*  @param value
	**/
   public void setMm01(char[] value) throws CFException {
      acceptDate.setMm01(value);
   } 

     /**
	 * 	Update Mm01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMm01(char[] source, int sourceIndex) throws CFException {
      acceptDate.setMm01(source, sourceIndex);
   	
   }
   
   public void setMm01(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      acceptDate.setMm01(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Mm01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMm01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptDate.setMm01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Mm01 with another Field
	 *	@param value
	 */
   public void setMm01(Field source) {
      acceptDate.setMm01(source);
   }  
   
     /**
	 * 	Update Mm01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMm01(Field source, int sourceIndex,int sourceLen) {
      acceptDate.setMm01(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Mm01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMm01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      acceptDate.setMm01(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of smallParent
	 *	@return smallParent
	 */   
	 public SmallParent getSmallParent() {
   	return smallParent;
   }


	/**
	 *	Returns the value of beginning
	 *	@return beginning
	 */
   public char[] getBeginning() throws CFException  {              
   		return work.getBeginning();
   }

  
	/**
	*  set variable beginning
	*  @param value
	**/
   public void setBeginning(char[] value) throws CFException {
      work.setBeginning(value);
   } 

	/**
	 *	Returns the value of runDate
	 *	@return runDate
	 */
   public char[] getRunDate() throws CFException  {              
   		return currentDateGroup.getRunDate();
   }

  
	/**
	*  set variable runDate
	*  @param value
	**/
   public void setRunDate(char[] value) throws CFException {
      currentDateGroup.setRunDate(value);
   } 

     /**
	 * 	Update RunDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRunDate(char[] source, int sourceIndex) throws CFException {
      currentDateGroup.setRunDate(source, sourceIndex);
   	
   }
   
   public void setRunDate(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      currentDateGroup.setRunDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update RunDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRunDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentDateGroup.setRunDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update RunDate with another Field
	 *	@param value
	 */
   public void setRunDate(Field source) {
      currentDateGroup.setRunDate(source);
   }  
   
     /**
	 * 	Update RunDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRunDate(Field source, int sourceIndex,int sourceLen) {
      currentDateGroup.setRunDate(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update RunDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRunDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentDateGroup.setRunDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of packedTo1
	 *	@return packedTo1
	 */   
	 public PackedTo1 getPackedTo1() {
   	return packedTo1;
   }



        public Move0Ctx getMove0Ctx() {
            return Move0Ctx.this;
        }

        public Process5Split19OutCtx getProcess5Split19OutCtx() {
            return new Process5Split19OutCtx();
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
        str += smallParent.hashCode();
        str += currentDateGroup.hashCode();
        str += rl7abTableInit.hashCode();
        str += acceptDate.hashCode();
        str += packedTo1.hashCode();
        str += grandParent.hashCode();
        str += packedTo2.hashCode();
       return str.hashCode();
    }

    public Process5Split19InCtx clone() {
        Process5Split19InCtx cloneObj = new Process5Split19InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.smallParent = new SmallParent();
        cloneObj.smallParent.set(smallParent.getClonedField());
        cloneObj.currentDateGroup = new CurrentDateGroup();
        cloneObj.currentDateGroup.set(currentDateGroup.getClonedField());
        cloneObj.rl7abTableInit = new Rl7abTableInit();
        cloneObj.rl7abTableInit.set(rl7abTableInit.getClonedField());
        cloneObj.acceptDate = new AcceptDate();
        cloneObj.acceptDate.set(acceptDate.getClonedField());
        cloneObj.packedTo1 = new PackedTo1();
        cloneObj.packedTo1.set(packedTo1.getClonedField());
        cloneObj.grandParent = new GrandParent();
        cloneObj.grandParent.set(grandParent.getClonedField());
        cloneObj.packedTo2 = new PackedTo2();
        cloneObj.packedTo2.set(packedTo2.getClonedField());
        return cloneObj;
    }

    }

    public Process5Split19InCtx getProcess5Split19InCtx() {
            return new Process5Split19InCtx();
    }
     public class Process5Split19OutCtx implements Cloneable {
     Work work = Move0Ctx.this.getWork();
     SmallParent smallParent = Move0Ctx.this.getSmallParent();
     CurrentDateGroup currentDateGroup = Move0Ctx.this.getCurrentDateGroup();
     Rl7abTableInit rl7abTableInit = Move0Ctx.this.getRl7abTableInit();
     PackedTo1 packedTo1 = Move0Ctx.this.getPackedTo1();
     AcceptDate acceptDate = Move0Ctx.this.getAcceptDate();
     GrandParent grandParent = Move0Ctx.this.getGrandParent();
     PackedTo2 packedTo2 = Move0Ctx.this.getPackedTo2();

	public BigDecimal getP71() throws CFException{      
   		return work.getP71();
	}

    public char[] getP71String() throws CFException {
          return  work.getP71().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update P71 with the passed number
	 *	@param number
	 */
	public void setP71(BigDecimal number)  throws CFException{
		work.setP71(number);
   }

	public BigDecimal getP81() throws CFException{      
   		return work.getP81();
	}

    public char[] getP81String() throws CFException {
          return  work.getP81().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update P81 with the passed number
	 *	@param number
	 */
	public void setP81(BigDecimal number)  throws CFException{
		work.setP81(number);
   }

	/**
	 *	Returns the value of rl7abTableInit
	 *	@return rl7abTableInit
	 */   
	 public Rl7abTableInit getRl7abTableInit() {
   	return rl7abTableInit;
   }


	/**
	 *	Returns the value of dd
	 *	@return dd
	 */
   public char[] getDd() throws CFException  {              
   		return currentDateGroup.getCurrentDate().getDd();
   }

  
	/**
	*  set variable dd
	*  @param value
	**/
   public void setDd(char[] value) throws CFException {
      currentDateGroup.getCurrentDate().setDd(value);
   } 

     /**
	 * 	Update Dd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDd(char[] source, int sourceIndex) throws CFException {
      currentDateGroup.getCurrentDate().setDd(source, sourceIndex);
   	
   }
   
   public void setDd(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      currentDateGroup.getCurrentDate().setDd(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Dd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentDateGroup.getCurrentDate().setDd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Dd with another Field
	 *	@param value
	 */
   public void setDd(Field source) {
      currentDateGroup.getCurrentDate().setDd(source);
   }  
   
     /**
	 * 	Update Dd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDd(Field source, int sourceIndex,int sourceLen) {
      currentDateGroup.getCurrentDate().setDd(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Dd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentDateGroup.getCurrentDate().setDd(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of currentDate
	 *	@return currentDate
	 */   
	 public CurrentDate getCurrentDate() {
   	return currentDateGroup.getCurrentDate();
   }

   /**
	* 	Update CurrentDate with the passed value
	*	@param value
	*/
   public void setCurrentDate(char[] value) throws CFException {
      currentDateGroup.setCurrentDate(value);
   }   

     /**
	 * 	Update CurrentDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCurrentDate(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	currentDateGroup.setCurrentDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrentDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurrentDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	currentDateGroup.setCurrentDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update CurrentDate with another Field
	 *	@param value
	 */
   public void setCurrentDate(Field source) {
   	currentDateGroup.setCurrentDate(source);
   }  
   
     /**
	 * 	Update CurrentDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCurrentDate(Field source, int sourceIndex,int sourceLen) {
   	currentDateGroup.setCurrentDate(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update CurrentDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurrentDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	currentDateGroup.setCurrentDate(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of rl7abTableInfo
	 *	@return rl7abTableInfo
	 */   
	 public Rl7abTableInfo getRl7abTableInfo() {
   	return rl7abTableInit.getRl7abTableInfo();
   }

   /**
	* 	Update Rl7abTableInfo with the passed value
	*	@param value
	*/
   public void setRl7abTableInfo(char[] value) throws CFException {
      rl7abTableInit.setRl7abTableInfo(value);
   }   

     /**
	 * 	Update Rl7abTableInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRl7abTableInfo(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	rl7abTableInit.setRl7abTableInfo(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Rl7abTableInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRl7abTableInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	rl7abTableInit.setRl7abTableInfo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Rl7abTableInfo with another Field
	 *	@param value
	 */
   public void setRl7abTableInfo(Field source) {
   	rl7abTableInit.setRl7abTableInfo(source);
   }  
   
     /**
	 * 	Update Rl7abTableInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRl7abTableInfo(Field source, int sourceIndex,int sourceLen) {
   	rl7abTableInit.setRl7abTableInfo(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Rl7abTableInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRl7abTableInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	rl7abTableInit.setRl7abTableInfo(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of grandParent
	 *	@return grandParent
	 */   
	 public GrandParent getGrandParent() {
   	return grandParent;
   }


	/**
	 *	Returns the value of lkplanDataAllowUom
	 *	@return lkplanDataAllowUom
	 */
   public char[] getLkplanDataAllowUom() throws CFException  {              
   		return work.getLkplanDataAllowUom();
   }

  
	/**
	*  set variable lkplanDataAllowUom
	*  @param value
	**/
   public void setLkplanDataAllowUom(char[] value) throws CFException {
      work.setLkplanDataAllowUom(value);
   } 

	/**
	 *	Returns the value of yyyy
	 *	@return yyyy
	 */
   public char[] getYyyy() throws CFException  {              
   		return currentDateGroup.getCurrentDate().getYyyy();
   }

  
	/**
	*  set variable yyyy
	*  @param value
	**/
   public void setYyyy(char[] value) throws CFException {
      currentDateGroup.getCurrentDate().setYyyy(value);
   } 

     /**
	 * 	Update Yyyy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setYyyy(char[] source, int sourceIndex) throws CFException {
      currentDateGroup.getCurrentDate().setYyyy(source, sourceIndex);
   	
   }
   
   public void setYyyy(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      currentDateGroup.getCurrentDate().setYyyy(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Yyyy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setYyyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentDateGroup.getCurrentDate().setYyyy(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Yyyy with another Field
	 *	@param value
	 */
   public void setYyyy(Field source) {
      currentDateGroup.getCurrentDate().setYyyy(source);
   }  
   
     /**
	 * 	Update Yyyy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setYyyy(Field source, int sourceIndex,int sourceLen) {
      currentDateGroup.getCurrentDate().setYyyy(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Yyyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setYyyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentDateGroup.getCurrentDate().setYyyy(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getT11() throws CFException{      
   		return packedTo2.getT11();
	}

    public char[] getT11String() throws CFException {
          return  packedTo2.getT11().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update T11 with the passed number
	 *	@param number
	 */
	public void setT11(BigDecimal number)  throws CFException{
		packedTo2.setT11(number);
   }

	public BigDecimal getP80() throws CFException{      
   		return work.getP80();
	}

    public char[] getP80String() throws CFException {
          return  work.getP80().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update P80 with the passed number
	 *	@param number
	 */
	public void setP80(BigDecimal number)  throws CFException{
		work.setP80(number);
   }

	public BigDecimal getT10() throws CFException{      
   		return packedTo1.getT10();
	}

    public char[] getT10String() throws CFException {
          return  packedTo1.getT10().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update T10 with the passed number
	 *	@param number
	 */
	public void setT10(BigDecimal number)  throws CFException{
		packedTo1.setT10(number);
   }

	/**
	 *	Returns the value of smallParent
	 *	@return smallParent
	 */   
	 public SmallParent getSmallParent() {
   	return smallParent;
   }


	/**
	 *	Returns the value of rl6bfMonthlyAllowText1
	 *	@return rl6bfMonthlyAllowText1
	 */
   public char[] getRl6bfMonthlyAllowText1() throws CFException  {              
   		return work.getRl6bfMonthlyAllowText1();
   }

  
	/**
	*  set variable rl6bfMonthlyAllowText1
	*  @param value
	**/
   public void setRl6bfMonthlyAllowText1(char[] value) throws CFException {
      work.setRl6bfMonthlyAllowText1(value);
   } 

	/**
	 *	Returns the value of mm
	 *	@return mm
	 */
   public char[] getMm() throws CFException  {              
   		return currentDateGroup.getCurrentDate().getMm();
   }

  
	/**
	*  set variable mm
	*  @param value
	**/
   public void setMm(char[] value) throws CFException {
      currentDateGroup.getCurrentDate().setMm(value);
   } 

     /**
	 * 	Update Mm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMm(char[] source, int sourceIndex) throws CFException {
      currentDateGroup.getCurrentDate().setMm(source, sourceIndex);
   	
   }
   
   public void setMm(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      currentDateGroup.getCurrentDate().setMm(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Mm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentDateGroup.getCurrentDate().setMm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Mm with another Field
	 *	@param value
	 */
   public void setMm(Field source) {
      currentDateGroup.getCurrentDate().setMm(source);
   }  
   
     /**
	 * 	Update Mm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMm(Field source, int sourceIndex,int sourceLen) {
      currentDateGroup.getCurrentDate().setMm(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Mm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      currentDateGroup.getCurrentDate().setMm(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	public BigDecimal getP70() throws CFException{      
   		return work.getP70();
	}

    public char[] getP70String() throws CFException {
          return  work.getP70().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update P70 with the passed number
	 *	@param number
	 */
	public void setP70(BigDecimal number)  throws CFException{
		work.setP70(number);
   }


        public Move0Ctx getMove0Ctx() {
            return Move0Ctx.this;
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
        str += smallParent.hashCode();
        str += currentDateGroup.hashCode();
        str += rl7abTableInit.hashCode();
        str += packedTo1.hashCode();
        str += acceptDate.hashCode();
        str += grandParent.hashCode();
        str += packedTo2.hashCode();
       return str.hashCode();
    }

    public Process5Split19OutCtx clone() {
        Process5Split19OutCtx cloneObj = new Process5Split19OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.smallParent = new SmallParent();
        cloneObj.smallParent.set(smallParent.getClonedField());
        cloneObj.currentDateGroup = new CurrentDateGroup();
        cloneObj.currentDateGroup.set(currentDateGroup.getClonedField());
        cloneObj.rl7abTableInit = new Rl7abTableInit();
        cloneObj.rl7abTableInit.set(rl7abTableInit.getClonedField());
        cloneObj.packedTo1 = new PackedTo1();
        cloneObj.packedTo1.set(packedTo1.getClonedField());
        cloneObj.acceptDate = new AcceptDate();
        cloneObj.acceptDate.set(acceptDate.getClonedField());
        cloneObj.grandParent = new GrandParent();
        cloneObj.grandParent.set(grandParent.getClonedField());
        cloneObj.packedTo2 = new PackedTo2();
        cloneObj.packedTo2.set(packedTo2.getClonedField());
        return cloneObj;
    }

    }

    public Process5Split19OutCtx getProcess5Split19OutCtx() {
            return new Process5Split19OutCtx();
    }
     public class Process6InCtx implements Cloneable {
     GrandParent grandParent = Move0Ctx.this.getGrandParent();

	/**
	 *	Returns the value of grandParent
	 *	@return grandParent
	 */   
	 public GrandParent getGrandParent() {
   	return grandParent;
   }



        public Move0Ctx getMove0Ctx() {
            return Move0Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += grandParent.hashCode();
       return str.hashCode();
    }

    public Process6InCtx clone() {
        Process6InCtx cloneObj = new Process6InCtx();
        cloneObj.grandParent = new GrandParent();
        cloneObj.grandParent.set(grandParent.getClonedField());
        return cloneObj;
    }

    }

    public Process6InCtx getProcess6InCtx() {
            return new Process6InCtx();
    }
}
