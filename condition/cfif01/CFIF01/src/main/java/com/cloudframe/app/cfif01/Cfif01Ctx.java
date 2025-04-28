package com.cloudframe.app.cfif01;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.cfif01.dto.Higher;
import com.cloudframe.app.cfif01.dto.DataTable;
import com.cloudframe.app.cfif01.dto.DelayUsageTotBp2Bp3Group;
import com.cloudframe.app.cfif01.dto.Work;
import com.cloudframe.app.cfif01.dto.Gp004300PinBlckFrmtCdGroup;
import com.cloudframe.app.cfif01.dto.Array;
import com.cloudframe.app.cfif01.dto.X9;


@Context
public class Cfif01Ctx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    DataTable dataTable;
    Higher higher;
    Work work;
    X9 x9;
    Gp004300PinBlckFrmtCdGroup gp004300PinBlckFrmtCdGroup;
    DelayUsageTotBp2Bp3Group delayUsageTotBp2Bp3Group;

    int dtIndx;

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


    public DataTable getDataTable() {
        if (dataTable == null) {
            dataTable = new DataTable();
        }

        return dataTable;
    }

    public void setDataTable(DataTable dataTable) {
        this.dataTable = dataTable;
    }
    public Higher getHigher() {
        if (higher == null) {
            higher = new Higher();
        }

        return higher;
    }

    public void setHigher(Higher higher) {
        this.higher = higher;
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
    public X9 getX9() {
        if (x9 == null) {
            x9 = new X9();
        }

        return x9;
    }

    public void setX9(X9 x9) {
        this.x9 = x9;
    }
    public Gp004300PinBlckFrmtCdGroup getGp004300PinBlckFrmtCdGroup() {
        if (gp004300PinBlckFrmtCdGroup == null) {
            gp004300PinBlckFrmtCdGroup = new Gp004300PinBlckFrmtCdGroup();
        }

        return gp004300PinBlckFrmtCdGroup;
    }

    public void setGp004300PinBlckFrmtCdGroup(Gp004300PinBlckFrmtCdGroup gp004300PinBlckFrmtCdGroup) {
        this.gp004300PinBlckFrmtCdGroup = gp004300PinBlckFrmtCdGroup;
    }
    public DelayUsageTotBp2Bp3Group getDelayUsageTotBp2Bp3Group() {
        if (delayUsageTotBp2Bp3Group == null) {
            delayUsageTotBp2Bp3Group = new DelayUsageTotBp2Bp3Group();
        }

        return delayUsageTotBp2Bp3Group;
    }

    public void setDelayUsageTotBp2Bp3Group(DelayUsageTotBp2Bp3Group delayUsageTotBp2Bp3Group) {
        this.delayUsageTotBp2Bp3Group = delayUsageTotBp2Bp3Group;
    }

    public int getDtIndx() {
        return dtIndx;
    }

    public void setDtIndx(int dtIndx) {
        this.dtIndx = dtIndx;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dataTable.hashCode();
        str += higher.hashCode();
        str += work.hashCode();
        str += x9.hashCode();
        str += gp004300PinBlckFrmtCdGroup.hashCode();
        str += delayUsageTotBp2Bp3Group.hashCode();
       return str.hashCode();
    }

    public Cfif01Ctx clone() {
        Cfif01Ctx cloneObj = new Cfif01Ctx();
        cloneObj.dataTable = new DataTable();
        cloneObj.dataTable.set(dataTable.getClonedField());
        cloneObj.higher = new Higher();
        cloneObj.higher.set(higher.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.x9 = new X9();
        cloneObj.x9.set(x9.getClonedField());
        cloneObj.gp004300PinBlckFrmtCdGroup = new Gp004300PinBlckFrmtCdGroup();
        cloneObj.gp004300PinBlckFrmtCdGroup.set(gp004300PinBlckFrmtCdGroup.getClonedField());
        cloneObj.delayUsageTotBp2Bp3Group = new DelayUsageTotBp2Bp3Group();
        cloneObj.delayUsageTotBp2Bp3Group.set(delayUsageTotBp2Bp3Group.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Work work = Cfif01Ctx.this.getWork();
     Higher higher = Cfif01Ctx.this.getHigher();
     X9 x9 = Cfif01Ctx.this.getX9();

	/**
	 *	Returns the value of dispNum
	 *	@return dispNum
	 */
	public short getDispNum() throws CFException {
   		return higher.getInit().getDispNum();
	}

    /**
	 *	Returns the String value of dispNum
	 *	@return dispNum
	 */
	public char[]  getDispNumActualString() {
		return higher.getInit().getDispNumActualString();
	}

	/**
	 *	Returns String value of dispNum
	 *	@return dispNum
	 */
	public char[]  getDispNumString() throws CFException {
	     return String.valueOf(higher.getInit().getDispNumString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dispNumIsNumeric()  throws CFException{
	    return higher.getInit().dispNumIsNumeric();
	}

	/**
	 * 	Update DispNum with the passed value
	 *	@param number
	 */
	public void setDispNum(short number)  throws CFException{
		higher.getInit().setDispNum(number);
	}
	
	public void setDispNum(int number)  throws CFException{
	    higher.getInit().setDispNum(number);
	}
	public void setDispNum(long number)  throws CFException{
	    higher.getInit().setDispNum(number);
	}
	

	
	/**
	 * 	Update DispNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setDispNum(char[] value)  throws CFException {
		higher.getInit().setDispNum(value);
	}
	
	/**
	 * 	Update DispNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDispNumString(char[] value)  throws CFException{
		higher.getInit().setDispNum(value);
	}	

	/**
	 *	Returns the value of x9
	 *	@return x9
	 */   
	 public X9 getX9() {
   	return x9;
   }


	/**
	 *	Returns the value of wS9
	 *	@return wS9
	 */
	public int getWS9() throws CFException {
   		return x9.getWS9();
	}


	/**
	 *	Returns String value of wS9
	 *	@return wS9
	 */
	public char[]  getWS9String() throws CFException {
	     return String.valueOf(x9.getWS9String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wS9IsNumeric()  throws CFException{
	    return x9.wS9IsNumeric();
	}

	/**
	 * 	Update WS9 with the passed value
	 *	@param number
	 */
	public void setWS9(int number)  throws CFException{
		x9.setWS9(number);
	}
	

	public void setWS9(long number)  throws CFException{
	    x9.setWS9(number);
	}
	
	
	/**
	 * 	Update WS9 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWS9(char[] value)  throws CFException {
		x9.setWS9(value);
	}
	
	/**
	 * 	Update WS9 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWS9String(char[] value)  throws CFException{
		x9.setWS9(value);
	}	

public int getOinGeoCd() throws CFException {  
        return work.getOinGeoCd();
}
	/**
	 * 	Update OinGeoCd with the passed value
	 *	@param number
	 */
	public void setOinGeoCd(int number)  throws CFException{
		work.setOinGeoCd(number);
	}


	public void setOinGeoCd(long number)  throws CFException{
	    work.setOinGeoCd(number);
	}
	


        public Cfif01Ctx getCfif01Ctx() {
            return Cfif01Ctx.this;
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
        str += higher.hashCode();
        str += x9.hashCode();
       return str.hashCode();
    }

    public ProcessInCtx clone() {
        ProcessInCtx cloneObj = new ProcessInCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.higher = new Higher();
        cloneObj.higher.set(higher.getClonedField());
        cloneObj.x9 = new X9();
        cloneObj.x9.set(x9.getClonedField());
        return cloneObj;
    }

    }

    public ProcessInCtx getProcessInCtx() {
            return new ProcessInCtx();
    }
     public class ProcessOutCtx implements Cloneable {
     Higher higher = Cfif01Ctx.this.getHigher();
     Work work = Cfif01Ctx.this.getWork();
     X9 x9 = Cfif01Ctx.this.getX9();

	/**
	 *	Returns the value of x4
	 *	@return x4
	 */
   public char[] getX4() throws CFException  {              
   		return work.getX4();
   }

  
	/**
	*  set variable x4
	*  @param value
	**/
   public void setX4(char[] value) throws CFException {
      work.setX4(value);
   } 

	/**
	 *	Test condition "A" "B" "C" for isChar88()
	 *	@return  Returns true if isChar88() is "A" "B" "C"
	 */
   public boolean isChar88() throws CFException {
      return higher.getInit().isChar88();
   }

	/**
	*  set values "A" "B" "C"
	*/
   	public void setChar88True()  throws CFException{  			
    	higher.getInit().setChar88True();
   	}
	/**
	 *	Returns the value of cisoutWorkRec
	 *	@return cisoutWorkRec
	 */
   public char[] getCisoutWorkRec() throws CFException  {              
   		return work.getCisoutWorkRec();
   }

  
	/**
	*  set variable cisoutWorkRec
	*  @param value
	**/
   public void setCisoutWorkRec(char[] value) throws CFException {
      work.setCisoutWorkRec(value);
   } 

	/**
	 *	Returns the value of batchId
	 *	@return batchId
	 */
   public char[] getBatchId() throws CFException  {              
   		return work.getBatchId();
   }

  
	/**
	*  set variable batchId
	*  @param value
	**/
   public void setBatchId(char[] value) throws CFException {
      work.setBatchId(value);
   } 

	/**
	 *	Returns the value of wS2
	 *	@return wS2
	 */
   public char[] getWS2() throws CFException  {              
   		return work.getWS2();
   }

  
	/**
	*  set variable wS2
	*  @param value
	**/
   public void setWS2(char[] value) throws CFException {
      work.setWS2(value);
   } 

     /**
	 * 	Update WS2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS2(char[] source, int sourceIndex) throws CFException {
      work.setWS2(source, sourceIndex);
   	
   }
   
   public void setWS2(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS2(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS2 with another Field
	 *	@param value
	 */
   public void setWS2(Field source) {
      work.setWS2(source);
   }  
   
     /**
	 * 	Update WS2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS2(Field source, int sourceIndex,int sourceLen) {
      work.setWS2(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS2(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition 0 for isZero()
	 *	@return  Returns true if isZero() is 0
	 */
   public boolean isZero() throws CFException {
      return x9.isZero();
   }

	/**
	*  set values 0
	*/
   	public void setZeroTrue()  throws CFException{  			
    	x9.setZeroTrue();
   	}
	/**
	 *	Returns the value of parmTyperun
	 *	@return parmTyperun
	 */
   public char[] getParmTyperun() throws CFException  {              
   		return work.getParmTyperun();
   }

  
	/**
	*  set variable parmTyperun
	*  @param value
	**/
   public void setParmTyperun(char[] value) throws CFException {
      work.setParmTyperun(value);
   } 

	/**
	 *	Returns the value of parmRao
	 *	@return parmRao
	 */
   public char[] getParmRao() throws CFException  {              
   		return work.getParmRao();
   }

  
	/**
	*  set variable parmRao
	*  @param value
	**/
   public void setParmRao(char[] value) throws CFException {
      work.setParmRao(value);
   } 

	/**
	 *	Returns the value of parmState
	 *	@return parmState
	 */
   public char[] getParmState() throws CFException  {              
   		return work.getParmState();
   }

  
	/**
	*  set variable parmState
	*  @param value
	**/
   public void setParmState(char[] value) throws CFException {
      work.setParmState(value);
   } 

public int getOinGeoCd() throws CFException {  
        return work.getOinGeoCd();
}
	/**
	 * 	Update OinGeoCd with the passed value
	 *	@param number
	 */
	public void setOinGeoCd(int number)  throws CFException{
		work.setOinGeoCd(number);
	}


	public void setOinGeoCd(long number)  throws CFException{
	    work.setOinGeoCd(number);
	}
	

	/**
	 *	Returns the value of x3
	 *	@return x3
	 */
   public char[] getX3() throws CFException  {              
   		return work.getX3();
   }

  
	/**
	*  set variable x3
	*  @param value
	**/
   public void setX3(char[] value) throws CFException {
      work.setX3(value);
   } 

	/**
	 *	Returns the value of wS1
	 *	@return wS1
	 */
   public char[] getWS1() throws CFException  {              
   		return work.getWS1();
   }

  
	/**
	*  set variable wS1
	*  @param value
	**/
   public void setWS1(char[] value) throws CFException {
      work.setWS1(value);
   } 

     /**
	 * 	Update WS1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWS1(char[] source, int sourceIndex) throws CFException {
      work.setWS1(source, sourceIndex);
   	
   }
   
   public void setWS1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setWS1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update WS1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWS1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update WS1 with another Field
	 *	@param value
	 */
   public void setWS1(Field source) {
      work.setWS1(source);
   }  
   
     /**
	 * 	Update WS1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWS1(Field source, int sourceIndex,int sourceLen) {
      work.setWS1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update WS1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWS1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setWS1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of from
	 *	@return from
	 */
	public BigDecimal getFrom() throws CFException {
   		return work.getFrom();
	}


	 /**
     *	Returns String value of from
     *	@return from
     */
    public char[]  getFromString() throws CFException {
         return work.getFromString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean fromIsNumeric() {
        return work.fromIsNumeric();
    }
	/**
	 * 	Update From with the passed number
	 *	@param number
	 */
	public void setFrom(BigDecimal number)  throws CFException{
		work.setFrom(number);
   }

	/**
	 * 	Update From with the passed value
	 *	@param value (String or char[]);
	 */
	public void setFrom(char[] value)  throws CFException{
		work.setFrom(value);
	}   

	/**
	 *	Returns the value of dispNum
	 *	@return dispNum
	 */
	public short getDispNum() throws CFException {
   		return higher.getInit().getDispNum();
	}

    /**
	 *	Returns the String value of dispNum
	 *	@return dispNum
	 */
	public char[]  getDispNumActualString() {
		return higher.getInit().getDispNumActualString();
	}

	/**
	 *	Returns String value of dispNum
	 *	@return dispNum
	 */
	public char[]  getDispNumString() throws CFException {
	     return String.valueOf(higher.getInit().getDispNumString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dispNumIsNumeric()  throws CFException{
	    return higher.getInit().dispNumIsNumeric();
	}

	/**
	 * 	Update DispNum with the passed value
	 *	@param number
	 */
	public void setDispNum(short number)  throws CFException{
		higher.getInit().setDispNum(number);
	}
	
	public void setDispNum(int number)  throws CFException{
	    higher.getInit().setDispNum(number);
	}
	public void setDispNum(long number)  throws CFException{
	    higher.getInit().setDispNum(number);
	}
	

	
	/**
	 * 	Update DispNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setDispNum(char[] value)  throws CFException {
		higher.getInit().setDispNum(value);
	}
	
	/**
	 * 	Update DispNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDispNumString(char[] value)  throws CFException{
		higher.getInit().setDispNum(value);
	}	

	/**
	 *	Returns the value of char1
	 *	@return char1
	 */
   public char[] getChar1() throws CFException  {              
   		return higher.getInit().getChar1();
   }

  
	/**
	*  set variable char1
	*  @param value
	**/
   public void setChar1(char[] value) throws CFException {
      higher.getInit().setChar1(value);
   } 

     /**
	 * 	Update Char1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setChar1(char[] source, int sourceIndex) throws CFException {
      higher.getInit().setChar1(source, sourceIndex);
   	
   }
   
   public void setChar1(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      higher.getInit().setChar1(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Char1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setChar1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      higher.getInit().setChar1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Char1 with another Field
	 *	@param value
	 */
   public void setChar1(Field source) {
      higher.getInit().setChar1(source);
   }  
   
     /**
	 * 	Update Char1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setChar1(Field source, int sourceIndex,int sourceLen) {
      higher.getInit().setChar1(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Char1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setChar1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      higher.getInit().setChar1(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of x9
	 *	@return x9
	 */   
	 public X9 getX9() {
   	return x9;
   }


	/**
	 *	Returns the value of wS9
	 *	@return wS9
	 */
	public int getWS9() throws CFException {
   		return x9.getWS9();
	}


	/**
	 *	Returns String value of wS9
	 *	@return wS9
	 */
	public char[]  getWS9String() throws CFException {
	     return String.valueOf(x9.getWS9String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wS9IsNumeric()  throws CFException{
	    return x9.wS9IsNumeric();
	}

	/**
	 * 	Update WS9 with the passed value
	 *	@param number
	 */
	public void setWS9(int number)  throws CFException{
		x9.setWS9(number);
	}
	

	public void setWS9(long number)  throws CFException{
	    x9.setWS9(number);
	}
	
	
	/**
	 * 	Update WS9 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWS9(char[] value)  throws CFException {
		x9.setWS9(value);
	}
	
	/**
	 * 	Update WS9 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWS9String(char[] value)  throws CFException{
		x9.setWS9(value);
	}	

	/**
	 *	Returns the value of tranCode
	 *	@return tranCode
	 */
   public char[] getTranCode() throws CFException  {              
   		return work.getTranCode();
   }

  
	/**
	*  set variable tranCode
	*  @param value
	**/
   public void setTranCode(char[] value) throws CFException {
      work.setTranCode(value);
   } 

	/**
	 *	Test condition "ORANGE" "BANANA" "APPLE " for isFruit()
	 *	@return  Returns true if isFruit() is "ORANGE" "BANANA" "APPLE "
	 */
   public boolean isFruit() throws CFException {
      return work.isFruit();
   }

	/**
	*  set values "ORANGE" "BANANA" "APPLE "
	*/
   	public void setFruitTrue()  throws CFException{  			
    	work.setFruitTrue();
   	}
	/**
	 *	Returns the value of cond
	 *	@return cond
	 */
   public char[] getCond() throws CFException  {              
   		return work.getCond();
   }

  
	/**
	*  set variable cond
	*  @param value
	**/
   public void setCond(char[] value) throws CFException {
      work.setCond(value);
   } 


        public Cfif01Ctx getCfif01Ctx() {
            return Cfif01Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += higher.hashCode();
        str += work.hashCode();
        str += x9.hashCode();
       return str.hashCode();
    }

    public ProcessOutCtx clone() {
        ProcessOutCtx cloneObj = new ProcessOutCtx();
        cloneObj.higher = new Higher();
        cloneObj.higher.set(higher.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.x9 = new X9();
        cloneObj.x9.set(x9.getClonedField());
        return cloneObj;
    }

    }

    public ProcessOutCtx getProcessOutCtx() {
            return new ProcessOutCtx();
    }
     public class TestConditionsInCtx implements Cloneable {
     DataTable dataTable = Cfif01Ctx.this.getDataTable();
     Work work = Cfif01Ctx.this.getWork();
     DelayUsageTotBp2Bp3Group delayUsageTotBp2Bp3Group = Cfif01Ctx.this.getDelayUsageTotBp2Bp3Group();


public void setDtIndx(int dtIndx) { 
    Cfif01Ctx.this.dtIndx = dtIndx;
}

public int getDtIndx() { 
    return Cfif01Ctx.this.dtIndx;
}

        public Cfif01Ctx getCfif01Ctx() {
            return Cfif01Ctx.this;
        }

        public TestConditionsOutCtx getTestConditionsOutCtx() {
            return new TestConditionsOutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dataTable.hashCode();
        str += work.hashCode();
        str += delayUsageTotBp2Bp3Group.hashCode();
       return str.hashCode();
    }

    public TestConditionsInCtx clone() {
        TestConditionsInCtx cloneObj = new TestConditionsInCtx();
        cloneObj.dataTable = new DataTable();
        cloneObj.dataTable.set(dataTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.delayUsageTotBp2Bp3Group = new DelayUsageTotBp2Bp3Group();
        cloneObj.delayUsageTotBp2Bp3Group.set(delayUsageTotBp2Bp3Group.getClonedField());
        return cloneObj;
    }

    }

    public TestConditionsInCtx getTestConditionsInCtx() {
            return new TestConditionsInCtx();
    }
     public class TestConditionsOutCtx implements Cloneable {
     DataTable dataTable = Cfif01Ctx.this.getDataTable();
     Work work = Cfif01Ctx.this.getWork();
     DelayUsageTotBp2Bp3Group delayUsageTotBp2Bp3Group = Cfif01Ctx.this.getDelayUsageTotBp2Bp3Group();

	public BigDecimal getDelayUsageTotBp2Bp3Dec() throws CFException{      
   		return delayUsageTotBp2Bp3Group.getDelayUsageTotBp2Bp3Dec();
	}

    public char[] getDelayUsageTotBp2Bp3DecString() throws CFException {
          return  delayUsageTotBp2Bp3Group.getDelayUsageTotBp2Bp3Dec().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update DelayUsageTotBp2Bp3Dec with the passed number
	 *	@param number
	 */
	public void setDelayUsageTotBp2Bp3Dec(BigDecimal number)  throws CFException{
		delayUsageTotBp2Bp3Group.setDelayUsageTotBp2Bp3Dec(number);
   }


public void setDtIndx(int dtIndx) { 
    Cfif01Ctx.this.dtIndx = dtIndx;
}

public int getDtIndx() { 
    return Cfif01Ctx.this.dtIndx;
}
	/**
	 *	Returns the value of delayMeasCd
	 *	@return delayMeasCd
	 */
   public char[] getDelayMeasCd() throws CFException  {              
   		return work.getDelayMeasCd();
   }

  
	/**
	*  set variable delayMeasCd
	*  @param value
	**/
   public void setDelayMeasCd(char[] value) throws CFException {
      work.setDelayMeasCd(value);
   } 

	/**
	 *	Returns the value of billku00CustIdNo
	 *	@return billku00CustIdNo
	 */
	public int getBillku00CustIdNo() throws CFException {        
   		return work.getBillku00CustIdNo();
	}
	
	/**
	 * 	Update Billku00CustIdNo with the passed value
	 *	@param number
	 */
	public void setBillku00CustIdNo(int number)  throws CFException{
		work.setBillku00CustIdNo(number);
	}


	public void setBillku00CustIdNo(long number)  throws CFException{
		work.setBillku00CustIdNo((int)number);
	}


	/**
	 *	Returns the value of delayCustIdNo
	 *	@return delayCustIdNo
	 */
	public int getDelayCustIdNo() throws CFException {        
   		return work.getDelayCustIdNo();
	}
	
	/**
	 * 	Update DelayCustIdNo with the passed value
	 *	@param number
	 */
	public void setDelayCustIdNo(int number)  throws CFException{
		work.setDelayCustIdNo(number);
	}


	public void setDelayCustIdNo(long number)  throws CFException{
		work.setDelayCustIdNo((int)number);
	}


	/**
	 *	Test condition "3" for isDelayBillPeriod3()
	 *	@return  Returns true if isDelayBillPeriod3() is "3"
	 */
   public boolean isDelayBillPeriod3() throws CFException {
      return work.isDelayBillPeriod3();
   }

	/**
	*  set values "3"
	*/
   	public void setDelayBillPeriod3True()  throws CFException{  			
    	work.setDelayBillPeriod3True();
   	}
	/**
	 *	Test condition "Y" for isStopReadDelaydat()
	 *	@return  Returns true if isStopReadDelaydat() is "Y"
	 */
   public boolean isStopReadDelaydat() throws CFException {
      return work.isStopReadDelaydat();
   }

	/**
	*  set values "Y"
	*/
   	public void setStopReadDelaydatTrue()  throws CFException{  			
    	work.setStopReadDelaydatTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xFF} for isDelaydatEof()
	 *	@return  Returns true if isDelaydatEof() is new byte[] {(byte)0xFF}
	 */
   public boolean isDelaydatEof() throws CFException {
      return work.isDelaydatEof();
   }

	/**
	*  set values new byte[] {(byte)0xFF}
	*/
   	public void setDelaydatEofTrue()  throws CFException{  			
    	work.setDelaydatEofTrue();
   	}
	/**
	 *	Returns the value of billku00Mtn
	 *	@return billku00Mtn
	 */
   public char[] getBillku00Mtn() throws CFException  {              
   		return work.getBillku00Mtn();
   }

  
	/**
	*  set variable billku00Mtn
	*  @param value
	**/
   public void setBillku00Mtn(char[] value) throws CFException {
      work.setBillku00Mtn(value);
   } 

	/**
	 *	Test condition "2" for isDelayBillPeriod2()
	 *	@return  Returns true if isDelayBillPeriod2() is "2"
	 */
   public boolean isDelayBillPeriod2() throws CFException {
      return work.isDelayBillPeriod2();
   }

	/**
	*  set values "2"
	*/
   	public void setDelayBillPeriod2True()  throws CFException{  			
    	work.setDelayBillPeriod2True();
   	}
	public BigDecimal getDataHmAirQtyDec(int index) throws CFException{      
   		return dataTable.getDataTableArray(index).getDataHmAirQtyDec();
	}

    public char[] getDataHmAirQtyDecString(int index) throws CFException {
          return  dataTable.getDataTableArray(index).getDataHmAirQtyDec().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update DataHmAirQtyDec with the passed number
	 *	@param number
	 */
	public void setDataHmAirQtyDec(int index,BigDecimal number)  throws CFException{
		dataTable.getDataTableArray(index).setDataHmAirQtyDec(number);
   }

	/**
	 *	Returns the value of delayMtn
	 *	@return delayMtn
	 */
   public char[] getDelayMtn() throws CFException  {              
   		return work.getDelayMtn();
   }

  
	/**
	*  set variable delayMtn
	*  @param value
	**/
   public void setDelayMtn(char[] value) throws CFException {
      work.setDelayMtn(value);
   } 


        public Cfif01Ctx getCfif01Ctx() {
            return Cfif01Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dataTable.hashCode();
        str += work.hashCode();
        str += delayUsageTotBp2Bp3Group.hashCode();
       return str.hashCode();
    }

    public TestConditionsOutCtx clone() {
        TestConditionsOutCtx cloneObj = new TestConditionsOutCtx();
        cloneObj.dataTable = new DataTable();
        cloneObj.dataTable.set(dataTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.delayUsageTotBp2Bp3Group = new DelayUsageTotBp2Bp3Group();
        cloneObj.delayUsageTotBp2Bp3Group.set(delayUsageTotBp2Bp3Group.getClonedField());
        return cloneObj;
    }

    }

    public TestConditionsOutCtx getTestConditionsOutCtx() {
            return new TestConditionsOutCtx();
    }
     public class TestIfParaInCtx implements Cloneable {
     DataTable dataTable = Cfif01Ctx.this.getDataTable();
     Work work = Cfif01Ctx.this.getWork();
     DelayUsageTotBp2Bp3Group delayUsageTotBp2Bp3Group = Cfif01Ctx.this.getDelayUsageTotBp2Bp3Group();

	public BigDecimal getDelayUsageTotBp2Bp3Dec() throws CFException{      
   		return delayUsageTotBp2Bp3Group.getDelayUsageTotBp2Bp3Dec();
	}

    public char[] getDelayUsageTotBp2Bp3DecString() throws CFException {
          return  delayUsageTotBp2Bp3Group.getDelayUsageTotBp2Bp3Dec().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update DelayUsageTotBp2Bp3Dec with the passed number
	 *	@param number
	 */
	public void setDelayUsageTotBp2Bp3Dec(BigDecimal number)  throws CFException{
		delayUsageTotBp2Bp3Group.setDelayUsageTotBp2Bp3Dec(number);
   }


public void setDtIndx(int dtIndx) { 
    Cfif01Ctx.this.dtIndx = dtIndx;
}

public int getDtIndx() { 
    return Cfif01Ctx.this.dtIndx;
}
	/**
	 *	Returns the value of delayMeasCd
	 *	@return delayMeasCd
	 */
   public char[] getDelayMeasCd() throws CFException  {              
   		return work.getDelayMeasCd();
   }

  
	/**
	*  set variable delayMeasCd
	*  @param value
	**/
   public void setDelayMeasCd(char[] value) throws CFException {
      work.setDelayMeasCd(value);
   } 

	/**
	 *	Returns the value of billku00CustIdNo
	 *	@return billku00CustIdNo
	 */
	public int getBillku00CustIdNo() throws CFException {        
   		return work.getBillku00CustIdNo();
	}
	
	/**
	 * 	Update Billku00CustIdNo with the passed value
	 *	@param number
	 */
	public void setBillku00CustIdNo(int number)  throws CFException{
		work.setBillku00CustIdNo(number);
	}


	public void setBillku00CustIdNo(long number)  throws CFException{
		work.setBillku00CustIdNo((int)number);
	}


	/**
	 *	Returns the value of delayCustIdNo
	 *	@return delayCustIdNo
	 */
	public int getDelayCustIdNo() throws CFException {        
   		return work.getDelayCustIdNo();
	}
	
	/**
	 * 	Update DelayCustIdNo with the passed value
	 *	@param number
	 */
	public void setDelayCustIdNo(int number)  throws CFException{
		work.setDelayCustIdNo(number);
	}


	public void setDelayCustIdNo(long number)  throws CFException{
		work.setDelayCustIdNo((int)number);
	}


	/**
	 *	Test condition "3" for isDelayBillPeriod3()
	 *	@return  Returns true if isDelayBillPeriod3() is "3"
	 */
   public boolean isDelayBillPeriod3() throws CFException {
      return work.isDelayBillPeriod3();
   }

	/**
	*  set values "3"
	*/
   	public void setDelayBillPeriod3True()  throws CFException{  			
    	work.setDelayBillPeriod3True();
   	}
	/**
	 *	Test condition "Y" for isStopReadDelaydat()
	 *	@return  Returns true if isStopReadDelaydat() is "Y"
	 */
   public boolean isStopReadDelaydat() throws CFException {
      return work.isStopReadDelaydat();
   }

	/**
	*  set values "Y"
	*/
   	public void setStopReadDelaydatTrue()  throws CFException{  			
    	work.setStopReadDelaydatTrue();
   	}
	/**
	 *	Test condition new byte[] {(byte)0xFF} for isDelaydatEof()
	 *	@return  Returns true if isDelaydatEof() is new byte[] {(byte)0xFF}
	 */
   public boolean isDelaydatEof() throws CFException {
      return work.isDelaydatEof();
   }

	/**
	*  set values new byte[] {(byte)0xFF}
	*/
   	public void setDelaydatEofTrue()  throws CFException{  			
    	work.setDelaydatEofTrue();
   	}
	/**
	 *	Returns the value of billku00Mtn
	 *	@return billku00Mtn
	 */
   public char[] getBillku00Mtn() throws CFException  {              
   		return work.getBillku00Mtn();
   }

  
	/**
	*  set variable billku00Mtn
	*  @param value
	**/
   public void setBillku00Mtn(char[] value) throws CFException {
      work.setBillku00Mtn(value);
   } 

	/**
	 *	Test condition "2" for isDelayBillPeriod2()
	 *	@return  Returns true if isDelayBillPeriod2() is "2"
	 */
   public boolean isDelayBillPeriod2() throws CFException {
      return work.isDelayBillPeriod2();
   }

	/**
	*  set values "2"
	*/
   	public void setDelayBillPeriod2True()  throws CFException{  			
    	work.setDelayBillPeriod2True();
   	}
	public BigDecimal getDataHmAirQtyDec(int index) throws CFException{      
   		return dataTable.getDataTableArray(index).getDataHmAirQtyDec();
	}

    public char[] getDataHmAirQtyDecString(int index) throws CFException {
          return  dataTable.getDataTableArray(index).getDataHmAirQtyDec().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update DataHmAirQtyDec with the passed number
	 *	@param number
	 */
	public void setDataHmAirQtyDec(int index,BigDecimal number)  throws CFException{
		dataTable.getDataTableArray(index).setDataHmAirQtyDec(number);
   }

	/**
	 *	Returns the value of delayMtn
	 *	@return delayMtn
	 */
   public char[] getDelayMtn() throws CFException  {              
   		return work.getDelayMtn();
   }

  
	/**
	*  set variable delayMtn
	*  @param value
	**/
   public void setDelayMtn(char[] value) throws CFException {
      work.setDelayMtn(value);
   } 


        public Cfif01Ctx getCfif01Ctx() {
            return Cfif01Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += dataTable.hashCode();
        str += work.hashCode();
        str += delayUsageTotBp2Bp3Group.hashCode();
       return str.hashCode();
    }

    public TestIfParaInCtx clone() {
        TestIfParaInCtx cloneObj = new TestIfParaInCtx();
        cloneObj.dataTable = new DataTable();
        cloneObj.dataTable.set(dataTable.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.delayUsageTotBp2Bp3Group = new DelayUsageTotBp2Bp3Group();
        cloneObj.delayUsageTotBp2Bp3Group.set(delayUsageTotBp2Bp3Group.getClonedField());
        return cloneObj;
    }

    }

    public TestIfParaInCtx getTestIfParaInCtx() {
            return new TestIfParaInCtx();
    }
     public class Process1InCtx implements Cloneable {
     Higher higher = Cfif01Ctx.this.getHigher();
     Work work = Cfif01Ctx.this.getWork();
     X9 x9 = Cfif01Ctx.this.getX9();
     Gp004300PinBlckFrmtCdGroup gp004300PinBlckFrmtCdGroup = Cfif01Ctx.this.getGp004300PinBlckFrmtCdGroup();

	/**
	 *	Test condition 0 for isZero()
	 *	@return  Returns true if isZero() is 0
	 */
   public boolean isZero() throws CFException {
      return x9.isZero();
   }

	/**
	*  set values 0
	*/
   	public void setZeroTrue()  throws CFException{  			
    	x9.setZeroTrue();
   	}
	/**
	 *	Returns the value of higher
	 *	@return higher
	 */   
	 public Higher getHigher() {
   	return higher;
   }


	/**
	 *	Returns the value of wmbcsShiftInPc
	 *	@return wmbcsShiftInPc
	 */
   public char[] getWmbcsShiftInPc() throws CFException  {              
   		return work.getWmbcsShiftInPc();
   }

  
	/**
	*  set variable wmbcsShiftInPc
	*  @param value
	**/
   public void setWmbcsShiftInPc(char[] value) throws CFException {
      work.setWmbcsShiftInPc(value);
   } 

	/**
	 *	Returns the value of wmbcsShiftOutPc
	 *	@return wmbcsShiftOutPc
	 */
   public char[] getWmbcsShiftOutPc() throws CFException  {              
   		return work.getWmbcsShiftOutPc();
   }

  
	/**
	*  set variable wmbcsShiftOutPc
	*  @param value
	**/
   public void setWmbcsShiftOutPc(char[] value) throws CFException {
      work.setWmbcsShiftOutPc(value);
   } 

	/**
	 *	Returns the value of wS9
	 *	@return wS9
	 */
	public int getWS9() throws CFException {
   		return x9.getWS9();
	}


	/**
	 *	Returns String value of wS9
	 *	@return wS9
	 */
	public char[]  getWS9String() throws CFException {
	     return String.valueOf(x9.getWS9String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wS9IsNumeric()  throws CFException{
	    return x9.wS9IsNumeric();
	}

	/**
	 * 	Update WS9 with the passed value
	 *	@param number
	 */
	public void setWS9(int number)  throws CFException{
		x9.setWS9(number);
	}
	

	public void setWS9(long number)  throws CFException{
	    x9.setWS9(number);
	}
	
	
	/**
	 * 	Update WS9 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWS9(char[] value)  throws CFException {
		x9.setWS9(value);
	}
	
	/**
	 * 	Update WS9 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWS9String(char[] value)  throws CFException{
		x9.setWS9(value);
	}	

	/**
	 *	Returns the value of array
	 *	@return array
	 */   
	 public Array getArray() {
   	return higher.getArray();
   }

   /**
	* 	Update Array with the passed value
	*	@param value
	*/
   public void setArray(char[] value) throws CFException {
      higher.setArray(value);
   }   

     /**
	 * 	Update Array 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setArray(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	higher.setArray(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Array 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setArray(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	higher.setArray(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Array with another Field
	 *	@param value
	 */
   public void setArray(Field source) {
   	higher.setArray(source);
   }  
   
     /**
	 * 	Update Array 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setArray(Field source, int sourceIndex,int sourceLen) {
   	higher.setArray(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Array 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setArray(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	higher.setArray(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of gp004300PinBlckFrmt
	 *	@return gp004300PinBlckFrmt
	 */
   public char[] getGp004300PinBlckFrmt() throws CFException  {              
   		return gp004300PinBlckFrmtCdGroup.getGp004300PinBlckFrmt();
   }

  
	/**
	*  set variable gp004300PinBlckFrmt
	*  @param value
	**/
   public void setGp004300PinBlckFrmt(char[] value) throws CFException {
      gp004300PinBlckFrmtCdGroup.setGp004300PinBlckFrmt(value);
   } 

     /**
	 * 	Update Gp004300PinBlckFrmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGp004300PinBlckFrmt(char[] source, int sourceIndex) throws CFException {
      gp004300PinBlckFrmtCdGroup.setGp004300PinBlckFrmt(source, sourceIndex);
   	
   }
   
   public void setGp004300PinBlckFrmt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      gp004300PinBlckFrmtCdGroup.setGp004300PinBlckFrmt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Gp004300PinBlckFrmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGp004300PinBlckFrmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      gp004300PinBlckFrmtCdGroup.setGp004300PinBlckFrmt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Gp004300PinBlckFrmt with another Field
	 *	@param value
	 */
   public void setGp004300PinBlckFrmt(Field source) {
      gp004300PinBlckFrmtCdGroup.setGp004300PinBlckFrmt(source);
   }  
   
     /**
	 * 	Update Gp004300PinBlckFrmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGp004300PinBlckFrmt(Field source, int sourceIndex,int sourceLen) {
      gp004300PinBlckFrmtCdGroup.setGp004300PinBlckFrmt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Gp004300PinBlckFrmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGp004300PinBlckFrmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      gp004300PinBlckFrmtCdGroup.setGp004300PinBlckFrmt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of wmbcsCsCharacter
	 *	@return wmbcsCsCharacter
	 */
   public char[] getWmbcsCsCharacter() throws CFException  {              
   		return work.getWmbcsCsCharacter();
   }

  
	/**
	*  set variable wmbcsCsCharacter
	*  @param value
	**/
   public void setWmbcsCsCharacter(char[] value) throws CFException {
      work.setWmbcsCsCharacter(value);
   } 

	/**
	 *	Returns the value of currentMonth
	 *	@return currentMonth
	 */
	public int getCurrentMonth() throws CFException {
   		return work.getCurrentMonth();
	}


	/**
	 *	Returns String value of currentMonth
	 *	@return currentMonth
	 */
	public char[]  getCurrentMonthString() throws CFException {
	     return String.valueOf(work.getCurrentMonthString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean currentMonthIsNumeric()  throws CFException{
	    return work.currentMonthIsNumeric();
	}

	/**
	 * 	Update CurrentMonth with the passed value
	 *	@param number
	 */
	public void setCurrentMonth(int number)  throws CFException{
		work.setCurrentMonth(number);
	}
	

	public void setCurrentMonth(long number)  throws CFException{
	    work.setCurrentMonth(number);
	}
	
	
	/**
	 * 	Update CurrentMonth with the passed value
	 *	@param value (String or char[])
	 */
	public void setCurrentMonth(char[] value)  throws CFException {
		work.setCurrentMonth(value);
	}
	
	/**
	 * 	Update CurrentMonth with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCurrentMonthString(char[] value)  throws CFException{
		work.setCurrentMonth(value);
	}	

	/**
	 *	Returns the value of tempMktgCd
	 *	@return tempMktgCd
	 */
	public int getTempMktgCd() throws CFException {        
   		return work.getTempMktgCd();
	}
	
	/**
	 * 	Update TempMktgCd with the passed value
	 *	@param number
	 */
	public void setTempMktgCd(int number)  throws CFException{
		work.setTempMktgCd(number);
	}


	public void setTempMktgCd(long number)  throws CFException{
		work.setTempMktgCd((int)number);
	}



        public Cfif01Ctx getCfif01Ctx() {
            return Cfif01Ctx.this;
        }

        public Process1OutCtx getProcess1OutCtx() {
            return new Process1OutCtx();
        }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += higher.hashCode();
        str += work.hashCode();
        str += x9.hashCode();
        str += gp004300PinBlckFrmtCdGroup.hashCode();
       return str.hashCode();
    }

    public Process1InCtx clone() {
        Process1InCtx cloneObj = new Process1InCtx();
        cloneObj.higher = new Higher();
        cloneObj.higher.set(higher.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.x9 = new X9();
        cloneObj.x9.set(x9.getClonedField());
        cloneObj.gp004300PinBlckFrmtCdGroup = new Gp004300PinBlckFrmtCdGroup();
        cloneObj.gp004300PinBlckFrmtCdGroup.set(gp004300PinBlckFrmtCdGroup.getClonedField());
        return cloneObj;
    }

    }

    public Process1InCtx getProcess1InCtx() {
            return new Process1InCtx();
    }
     public class Process1OutCtx implements Cloneable {
     Higher higher = Cfif01Ctx.this.getHigher();
     Work work = Cfif01Ctx.this.getWork();
     X9 x9 = Cfif01Ctx.this.getX9();
     Gp004300PinBlckFrmtCdGroup gp004300PinBlckFrmtCdGroup = Cfif01Ctx.this.getGp004300PinBlckFrmtCdGroup();

	/**
	 *	Returns the value of monthRange
	 *	@return monthRange
	 */
   public char[] getMonthRange() throws CFException  {              
   		return work.getMonthRange();
   }

  
	/**
	*  set variable monthRange
	*  @param value
	**/
   public void setMonthRange(char[] value) throws CFException {
      work.setMonthRange(value);
   } 

	/**
	 *	Returns the value of revoDnsCd
	 *	@return revoDnsCd
	 */
   public char[] getRevoDnsCd() throws CFException  {              
   		return work.getRevoDnsCd();
   }

  
	/**
	*  set variable revoDnsCd
	*  @param value
	**/
   public void setRevoDnsCd(char[] value) throws CFException {
      work.setRevoDnsCd(value);
   } 

	/**
	 *	Test condition "C" for isChar2C88()
	 *	@return  Returns true if isChar2C88() is "C"
	 */
   public boolean isChar2C88() throws CFException {
      return higher.getInit().isChar2C88();
   }

	/**
	*  set values "C"
	*/
   	public void setChar2C88True()  throws CFException{  			
    	higher.getInit().setChar2C88True();
   	}
	/**
	 *	Returns the value of higher
	 *	@return higher
	 */   
	 public Higher getHigher() {
   	return higher;
   }


	/**
	 *	Returns the value of dispNum
	 *	@return dispNum
	 */
	public short getDispNum() throws CFException {
   		return higher.getInit().getDispNum();
	}

    /**
	 *	Returns the String value of dispNum
	 *	@return dispNum
	 */
	public char[]  getDispNumActualString() {
		return higher.getInit().getDispNumActualString();
	}

	/**
	 *	Returns String value of dispNum
	 *	@return dispNum
	 */
	public char[]  getDispNumString() throws CFException {
	     return String.valueOf(higher.getInit().getDispNumString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean dispNumIsNumeric()  throws CFException{
	    return higher.getInit().dispNumIsNumeric();
	}

	/**
	 * 	Update DispNum with the passed value
	 *	@param number
	 */
	public void setDispNum(short number)  throws CFException{
		higher.getInit().setDispNum(number);
	}
	
	public void setDispNum(int number)  throws CFException{
	    higher.getInit().setDispNum(number);
	}
	public void setDispNum(long number)  throws CFException{
	    higher.getInit().setDispNum(number);
	}
	

	
	/**
	 * 	Update DispNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setDispNum(char[] value)  throws CFException {
		higher.getInit().setDispNum(value);
	}
	
	/**
	 * 	Update DispNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDispNumString(char[] value)  throws CFException{
		higher.getInit().setDispNum(value);
	}	

	/**
	 *	Returns the value of array
	 *	@return array
	 */   
	 public Array getArray() {
   	return higher.getArray();
   }

   /**
	* 	Update Array with the passed value
	*	@param value
	*/
   public void setArray(char[] value) throws CFException {
      higher.setArray(value);
   }   

     /**
	 * 	Update Array 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setArray(char[] source, int sourceIndex,int sourceLen) throws CFException {
   	higher.setArray(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Array 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setArray(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	higher.setArray(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Array with another Field
	 *	@param value
	 */
   public void setArray(Field source) {
   	higher.setArray(source);
   }  
   
     /**
	 * 	Update Array 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setArray(Field source, int sourceIndex,int sourceLen) {
   	higher.setArray(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Array 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setArray(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	higher.setArray(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "01" THRU "12" for isWithinRange()
	 *	@return  Returns true if isWithinRange() is "01" THRU "12"
	 */
   public boolean isWithinRange() throws CFException {
      return work.isWithinRange();
   }

	/**
	*  set values "01" THRU "12"
	*/
   	public void setWithinRangeTrue()  throws CFException{  			
    	work.setWithinRangeTrue();
   	}
	/**
	 *	Returns the value of gp004300PinBlckFrmt
	 *	@return gp004300PinBlckFrmt
	 */
   public char[] getGp004300PinBlckFrmt() throws CFException  {              
   		return gp004300PinBlckFrmtCdGroup.getGp004300PinBlckFrmt();
   }

  
	/**
	*  set variable gp004300PinBlckFrmt
	*  @param value
	**/
   public void setGp004300PinBlckFrmt(char[] value) throws CFException {
      gp004300PinBlckFrmtCdGroup.setGp004300PinBlckFrmt(value);
   } 

     /**
	 * 	Update Gp004300PinBlckFrmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGp004300PinBlckFrmt(char[] source, int sourceIndex) throws CFException {
      gp004300PinBlckFrmtCdGroup.setGp004300PinBlckFrmt(source, sourceIndex);
   	
   }
   
   public void setGp004300PinBlckFrmt(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      gp004300PinBlckFrmtCdGroup.setGp004300PinBlckFrmt(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update Gp004300PinBlckFrmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGp004300PinBlckFrmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      gp004300PinBlckFrmtCdGroup.setGp004300PinBlckFrmt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update Gp004300PinBlckFrmt with another Field
	 *	@param value
	 */
   public void setGp004300PinBlckFrmt(Field source) {
      gp004300PinBlckFrmtCdGroup.setGp004300PinBlckFrmt(source);
   }  
   
     /**
	 * 	Update Gp004300PinBlckFrmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGp004300PinBlckFrmt(Field source, int sourceIndex,int sourceLen) {
      gp004300PinBlckFrmtCdGroup.setGp004300PinBlckFrmt(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update Gp004300PinBlckFrmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGp004300PinBlckFrmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      gp004300PinBlckFrmtCdGroup.setGp004300PinBlckFrmt(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Test condition "B" for isCharB88()
	 *	@return  Returns true if isCharB88() is "B"
	 */
   public boolean isCharB88() throws CFException {
      return higher.getInit().isCharB88();
   }

	/**
	*  set values "B"
	*/
   	public void setCharB88True()  throws CFException{  			
    	higher.getInit().setCharB88True();
   	}
	/**
	 *	Returns the value of currentMonth
	 *	@return currentMonth
	 */
	public int getCurrentMonth() throws CFException {
   		return work.getCurrentMonth();
	}


	/**
	 *	Returns String value of currentMonth
	 *	@return currentMonth
	 */
	public char[]  getCurrentMonthString() throws CFException {
	     return String.valueOf(work.getCurrentMonthString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean currentMonthIsNumeric()  throws CFException{
	    return work.currentMonthIsNumeric();
	}

	/**
	 * 	Update CurrentMonth with the passed value
	 *	@param number
	 */
	public void setCurrentMonth(int number)  throws CFException{
		work.setCurrentMonth(number);
	}
	

	public void setCurrentMonth(long number)  throws CFException{
	    work.setCurrentMonth(number);
	}
	
	
	/**
	 * 	Update CurrentMonth with the passed value
	 *	@param value (String or char[])
	 */
	public void setCurrentMonth(char[] value)  throws CFException {
		work.setCurrentMonth(value);
	}
	
	/**
	 * 	Update CurrentMonth with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCurrentMonthString(char[] value)  throws CFException{
		work.setCurrentMonth(value);
	}	

	/**
	 *	Returns the value of tempMktgCd
	 *	@return tempMktgCd
	 */
	public int getTempMktgCd() throws CFException {        
   		return work.getTempMktgCd();
	}
	
	/**
	 * 	Update TempMktgCd with the passed value
	 *	@param number
	 */
	public void setTempMktgCd(int number)  throws CFException{
		work.setTempMktgCd(number);
	}


	public void setTempMktgCd(long number)  throws CFException{
		work.setTempMktgCd((int)number);
	}



        public Cfif01Ctx getCfif01Ctx() {
            return Cfif01Ctx.this;
        }


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        return this.hashCode() == o.hashCode();
    }

    @Override
    public int hashCode() {
        String str = "";
        str += higher.hashCode();
        str += work.hashCode();
        str += x9.hashCode();
        str += gp004300PinBlckFrmtCdGroup.hashCode();
       return str.hashCode();
    }

    public Process1OutCtx clone() {
        Process1OutCtx cloneObj = new Process1OutCtx();
        cloneObj.higher = new Higher();
        cloneObj.higher.set(higher.getClonedField());
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.x9 = new X9();
        cloneObj.x9.set(x9.getClonedField());
        cloneObj.gp004300PinBlckFrmtCdGroup = new Gp004300PinBlckFrmtCdGroup();
        cloneObj.gp004300PinBlckFrmtCdGroup.set(gp004300PinBlckFrmtCdGroup.getClonedField());
        return cloneObj;
    }

    }

    public Process1OutCtx getProcess1OutCtx() {
            return new Process1OutCtx();
    }
}
