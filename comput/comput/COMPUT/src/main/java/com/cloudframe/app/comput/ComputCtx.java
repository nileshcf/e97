package com.cloudframe.app.comput;

import com.cloudframe.app.dto.GlobalExecutorCtx;
import com.cloudframe.app.dto.ProgramContext;
import com.cloudframe.app.dto.Context;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import com.cloudframe.app.exception.CFException;

import com.cloudframe.app.comput.dto.Msp3pprcsIcaNumGroup300;
import com.cloudframe.app.comput.dto.Work;


@Context
public class ComputCtx implements ProgramContext, Cloneable {
    GlobalExecutorCtx globalCtx;

    Work work;
    Msp3pprcsIcaNumGroup300 msp3pprcsIcaNumGroup300;


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
    public Msp3pprcsIcaNumGroup300 getMsp3pprcsIcaNumGroup300() {
        if (msp3pprcsIcaNumGroup300 == null) {
            msp3pprcsIcaNumGroup300 = new Msp3pprcsIcaNumGroup300();
        }

        return msp3pprcsIcaNumGroup300;
    }

    public void setMsp3pprcsIcaNumGroup300(Msp3pprcsIcaNumGroup300 msp3pprcsIcaNumGroup300) {
        this.msp3pprcsIcaNumGroup300 = msp3pprcsIcaNumGroup300;
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
        str += msp3pprcsIcaNumGroup300.hashCode();
       return str.hashCode();
    }

    public ComputCtx clone() {
        ComputCtx cloneObj = new ComputCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.msp3pprcsIcaNumGroup300 = new Msp3pprcsIcaNumGroup300();
        cloneObj.msp3pprcsIcaNumGroup300.set(msp3pprcsIcaNumGroup300.getClonedField());
        return cloneObj;
    }

/**
 * Program method contexts
 *
 */
     public class ProcessInCtx implements Cloneable {
     Work work = ComputCtx.this.getWork();

	/**
	 *	Returns the value of omsumpvGen
	 *	@return omsumpvGen
	 */
	public int getOmsumpvGen() throws CFException {
   		return work.getOmsumpvGen();
	}


	/**
	 *	Returns String value of omsumpvGen
	 *	@return omsumpvGen
	 */
	public char[]  getOmsumpvGenString() throws CFException {
	     return String.valueOf(work.getOmsumpvGenString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean omsumpvGenIsNumeric()  throws CFException{
	    return work.omsumpvGenIsNumeric();
	}

	/**
	 * 	Update OmsumpvGen with the passed value
	 *	@param number
	 */
	public void setOmsumpvGen(int number)  throws CFException{
		work.setOmsumpvGen(number);
	}
	

	public void setOmsumpvGen(long number)  throws CFException{
	    work.setOmsumpvGen(number);
	}
	
	
	/**
	 * 	Update OmsumpvGen with the passed value
	 *	@param value (String or char[])
	 */
	public void setOmsumpvGen(char[] value)  throws CFException {
		work.setOmsumpvGen(value);
	}
	
	/**
	 * 	Update OmsumpvGen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOmsumpvGenString(char[] value)  throws CFException{
		work.setOmsumpvGen(value);
	}	

	/**
	 *	Returns the value of omencfGen
	 *	@return omencfGen
	 */
	public int getOmencfGen() throws CFException {
   		return work.getOmencfGen();
	}


	/**
	 *	Returns String value of omencfGen
	 *	@return omencfGen
	 */
	public char[]  getOmencfGenString() throws CFException {
	     return String.valueOf(work.getOmencfGenString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean omencfGenIsNumeric()  throws CFException{
	    return work.omencfGenIsNumeric();
	}

	/**
	 * 	Update OmencfGen with the passed value
	 *	@param number
	 */
	public void setOmencfGen(int number)  throws CFException{
		work.setOmencfGen(number);
	}
	

	public void setOmencfGen(long number)  throws CFException{
	    work.setOmencfGen(number);
	}
	
	
	/**
	 * 	Update OmencfGen with the passed value
	 *	@param value (String or char[])
	 */
	public void setOmencfGen(char[] value)  throws CFException {
		work.setOmencfGen(value);
	}
	
	/**
	 * 	Update OmencfGen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOmencfGenString(char[] value)  throws CFException{
		work.setOmencfGen(value);
	}	

public int getIntOfDt1() throws CFException {  
        return work.getIntOfDt1();
}
	/**
	 * 	Update IntOfDt1 with the passed value
	 *	@param number
	 */
	public void setIntOfDt1(int number)  throws CFException{
		work.setIntOfDt1(number);
	}


	public void setIntOfDt1(long number)  throws CFException{
	    work.setIntOfDt1(number);
	}
	

	/**
	 *	Returns the value of reportGen
	 *	@return reportGen
	 */
	public int getReportGen() throws CFException {
   		return work.getReportGen();
	}


	/**
	 *	Returns String value of reportGen
	 *	@return reportGen
	 */
	public char[]  getReportGenString() throws CFException {
	     return String.valueOf(work.getReportGenString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean reportGenIsNumeric()  throws CFException{
	    return work.reportGenIsNumeric();
	}

	/**
	 * 	Update ReportGen with the passed value
	 *	@param number
	 */
	public void setReportGen(int number)  throws CFException{
		work.setReportGen(number);
	}
	

	public void setReportGen(long number)  throws CFException{
	    work.setReportGen(number);
	}
	
	
	/**
	 * 	Update ReportGen with the passed value
	 *	@param value (String or char[])
	 */
	public void setReportGen(char[] value)  throws CFException {
		work.setReportGen(value);
	}
	
	/**
	 * 	Update ReportGen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setReportGenString(char[] value)  throws CFException{
		work.setReportGen(value);
	}	

	/**
	 *	Returns the value of cbsumGen
	 *	@return cbsumGen
	 */
	public int getCbsumGen() throws CFException {
   		return work.getCbsumGen();
	}


	/**
	 *	Returns String value of cbsumGen
	 *	@return cbsumGen
	 */
	public char[]  getCbsumGenString() throws CFException {
	     return String.valueOf(work.getCbsumGenString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cbsumGenIsNumeric()  throws CFException{
	    return work.cbsumGenIsNumeric();
	}

	/**
	 * 	Update CbsumGen with the passed value
	 *	@param number
	 */
	public void setCbsumGen(int number)  throws CFException{
		work.setCbsumGen(number);
	}
	

	public void setCbsumGen(long number)  throws CFException{
	    work.setCbsumGen(number);
	}
	
	
	/**
	 * 	Update CbsumGen with the passed value
	 *	@param value (String or char[])
	 */
	public void setCbsumGen(char[] value)  throws CFException {
		work.setCbsumGen(value);
	}
	
	/**
	 * 	Update CbsumGen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCbsumGenString(char[] value)  throws CFException{
		work.setCbsumGen(value);
	}	

	/**
	 *	Returns the value of omauditGen
	 *	@return omauditGen
	 */
	public int getOmauditGen() throws CFException {
   		return work.getOmauditGen();
	}


	/**
	 *	Returns String value of omauditGen
	 *	@return omauditGen
	 */
	public char[]  getOmauditGenString() throws CFException {
	     return String.valueOf(work.getOmauditGenString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean omauditGenIsNumeric()  throws CFException{
	    return work.omauditGenIsNumeric();
	}

	/**
	 * 	Update OmauditGen with the passed value
	 *	@param number
	 */
	public void setOmauditGen(int number)  throws CFException{
		work.setOmauditGen(number);
	}
	

	public void setOmauditGen(long number)  throws CFException{
	    work.setOmauditGen(number);
	}
	
	
	/**
	 * 	Update OmauditGen with the passed value
	 *	@param value (String or char[])
	 */
	public void setOmauditGen(char[] value)  throws CFException {
		work.setOmauditGen(value);
	}
	
	/**
	 * 	Update OmauditGen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOmauditGenString(char[] value)  throws CFException{
		work.setOmauditGen(value);
	}	


        public ComputCtx getComputCtx() {
            return ComputCtx.this;
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
     Work work = ComputCtx.this.getWork();

	public BigDecimal getTb11148AdminAmt() throws CFException{      
   		return work.getTb11148AdminAmt();
	}

    public char[] getTb11148AdminAmtString() throws CFException {
          return  work.getTb11148AdminAmt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Tb11148AdminAmt with the passed number
	 *	@param number
	 */
	public void setTb11148AdminAmt(BigDecimal number)  throws CFException{
		work.setTb11148AdminAmt(number);
   }

	/**
	 *	Returns the value of w3v2A
	 *	@return w3v2A
	 */
	public BigDecimal getW3v2A() throws CFException {
   		return work.getW3v2A();
	}


	 /**
     *	Returns String value of w3v2A
     *	@return w3v2A
     */
    public char[]  getW3v2AString() throws CFException {
         return work.getW3v2AString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean w3v2AIsNumeric() {
        return work.w3v2AIsNumeric();
    }
	/**
	 * 	Update W3v2A with the passed number
	 *	@param number
	 */
	public void setW3v2A(BigDecimal number)  throws CFException{
		work.setW3v2A(number);
   }

	/**
	 * 	Update W3v2A with the passed value
	 *	@param value (String or char[]);
	 */
	public void setW3v2A(char[] value)  throws CFException{
		work.setW3v2A(value);
	}   

public int getIntOfDt1() throws CFException {  
        return work.getIntOfDt1();
}
	/**
	 * 	Update IntOfDt1 with the passed value
	 *	@param number
	 */
	public void setIntOfDt1(int number)  throws CFException{
		work.setIntOfDt1(number);
	}


	public void setIntOfDt1(long number)  throws CFException{
	    work.setIntOfDt1(number);
	}
	

public long getRecsWithoutPrice() throws CFException {  
        return work.getRecsWithoutPrice();
}
	/**
	 * 	Update RecsWithoutPrice with the passed value
	 *	@param number
	 */
	public void setRecsWithoutPrice(long number)  throws CFException{
		work.setRecsWithoutPrice(number);
	}



	public BigDecimal getRlu3aMtnAcAcctChgsCredits() throws CFException{      
   		return work.getRlu3aMtnAcAcctChgsCredits();
	}

    public char[] getRlu3aMtnAcAcctChgsCreditsString() throws CFException {
          return  work.getRlu3aMtnAcAcctChgsCredits().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Rlu3aMtnAcAcctChgsCredits with the passed number
	 *	@param number
	 */
	public void setRlu3aMtnAcAcctChgsCredits(BigDecimal number)  throws CFException{
		work.setRlu3aMtnAcAcctChgsCredits(number);
   }

	/**
	 *	Returns the value of w3v2
	 *	@return w3v2
	 */
	public BigDecimal getW3v2() throws CFException {
   		return work.getW3v2();
	}


	 /**
     *	Returns String value of w3v2
     *	@return w3v2
     */
    public char[]  getW3v2String() throws CFException {
         return work.getW3v2String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean w3v2IsNumeric() {
        return work.w3v2IsNumeric();
    }
	/**
	 * 	Update W3v2 with the passed number
	 *	@param number
	 */
	public void setW3v2(BigDecimal number)  throws CFException{
		work.setW3v2(number);
   }

	/**
	 * 	Update W3v2 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setW3v2(char[] value)  throws CFException{
		work.setW3v2(value);
	}   

	public BigDecimal getB() throws CFException{      
   		return work.getB();
	}

    public char[] getBString() throws CFException {
          return  work.getB().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update B with the passed number
	 *	@param number
	 */
	public void setB(BigDecimal number)  throws CFException{
		work.setB(number);
   }

public long getDetailRecs() throws CFException {  
        return work.getDetailRecs();
}
	/**
	 * 	Update DetailRecs with the passed value
	 *	@param number
	 */
	public void setDetailRecs(long number)  throws CFException{
		work.setDetailRecs(number);
	}



	public BigDecimal getChrgCreditTotNotax() throws CFException{      
   		return work.getChrgCreditTotNotax();
	}

    public char[] getChrgCreditTotNotaxString() throws CFException {
          return  work.getChrgCreditTotNotax().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update ChrgCreditTotNotax with the passed number
	 *	@param number
	 */
	public void setChrgCreditTotNotax(BigDecimal number)  throws CFException{
		work.setChrgCreditTotNotax(number);
   }

	/**
	 *	Returns the value of omauditGen
	 *	@return omauditGen
	 */
	public int getOmauditGen() throws CFException {
   		return work.getOmauditGen();
	}


	/**
	 *	Returns String value of omauditGen
	 *	@return omauditGen
	 */
	public char[]  getOmauditGenString() throws CFException {
	     return String.valueOf(work.getOmauditGenString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean omauditGenIsNumeric()  throws CFException{
	    return work.omauditGenIsNumeric();
	}

	/**
	 * 	Update OmauditGen with the passed value
	 *	@param number
	 */
	public void setOmauditGen(int number)  throws CFException{
		work.setOmauditGen(number);
	}
	

	public void setOmauditGen(long number)  throws CFException{
	    work.setOmauditGen(number);
	}
	
	
	/**
	 * 	Update OmauditGen with the passed value
	 *	@param value (String or char[])
	 */
	public void setOmauditGen(char[] value)  throws CFException {
		work.setOmauditGen(value);
	}
	
	/**
	 * 	Update OmauditGen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOmauditGenString(char[] value)  throws CFException{
		work.setOmauditGen(value);
	}	

	/**
	 *	Returns the value of totAmt
	 *	@return totAmt
	 */
	public BigDecimal getTotAmt() throws CFException {           
   		return work.getTotAmt();
	}
	
	
	/**
	 * 	Update TotAmt with the passed value
	 *	@param number
	 */
	public void setTotAmt(BigDecimal number)  throws CFException{
		work.setTotAmt(number);
   }
              

	/**
	 *	Returns the value of a
	 *	@return a
	 */
	public BigDecimal getA() throws CFException {
   		return work.getA();
	}

    /**
	 *	Returns the String value of a
	 *	@return a
	 */
	public char[]  getAActualString()  throws CFException{
	    return work.getAActualString();
	}

	 /**
     *	Returns String value of a
     *	@return a
     */
    public char[]  getAString() throws CFException {
         return work.getAString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean aIsNumeric() {
        return work.aIsNumeric();
    }
	/**
	 * 	Update A with the passed number
	 *	@param number
	 */
	public void setA(BigDecimal number)  throws CFException{
		work.setA(number);
   }

	/**
	 * 	Update A with the passed value
	 *	@param value (String or char[]);
	 */
	public void setA(char[] value)  throws CFException{
		work.setA(value);
	}   

	/**
	 *	Returns the value of pctWoPrice
	 *	@return pctWoPrice
	 */
   public char[] getPctWoPrice() throws CFException  {              
   		return work.getPctWoPrice();
   }

  
	/**
	*  set variable pctWoPrice
	*  @param value
	**/
   public void setPctWoPrice(char[] value) throws CFException {
      work.setPctWoPrice(value);
   } 

     /**
	 * 	Update PctWoPrice 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPctWoPrice(char[] source, int sourceIndex) throws CFException {
      work.setPctWoPrice(source, sourceIndex);
   	
   }
   
   public void setPctWoPrice(char[] source, int sourceIndex , int sourceLen) throws CFException  {
      work.setPctWoPrice(source, sourceIndex, sourceLen);
   }
   
     /**
	 * 	Update PctWoPrice 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPctWoPrice(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setPctWoPrice(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }
   
    /**
	 * 	Update PctWoPrice with another Field
	 *	@param value
	 */
   public void setPctWoPrice(Field source) {
      work.setPctWoPrice(source);
   }  
   
     /**
	 * 	Update PctWoPrice 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPctWoPrice(Field source, int sourceIndex,int sourceLen) {
      work.setPctWoPrice(source, sourceIndex, sourceLen);   	
   }
   
     /**
	 * 	Update PctWoPrice 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPctWoPrice(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
      work.setPctWoPrice(source, sourceIndex, sourceLen, targetIndex, targetLen);
   }

	/**
	 *	Returns the value of coordinatedGeneration
	 *	@return coordinatedGeneration
	 */
	public int getCoordinatedGeneration() throws CFException {
   		return work.getCoordinatedGeneration();
	}


	/**
	 *	Returns String value of coordinatedGeneration
	 *	@return coordinatedGeneration
	 */
	public char[]  getCoordinatedGenerationString() throws CFException {
	     return String.valueOf(work.getCoordinatedGenerationString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean coordinatedGenerationIsNumeric()  throws CFException{
	    return work.coordinatedGenerationIsNumeric();
	}

	/**
	 * 	Update CoordinatedGeneration with the passed value
	 *	@param number
	 */
	public void setCoordinatedGeneration(int number)  throws CFException{
		work.setCoordinatedGeneration(number);
	}
	

	public void setCoordinatedGeneration(long number)  throws CFException{
	    work.setCoordinatedGeneration(number);
	}
	
	
	/**
	 * 	Update CoordinatedGeneration with the passed value
	 *	@param value (String or char[])
	 */
	public void setCoordinatedGeneration(char[] value)  throws CFException {
		work.setCoordinatedGeneration(value);
	}
	
	/**
	 * 	Update CoordinatedGeneration with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCoordinatedGenerationString(char[] value)  throws CFException{
		work.setCoordinatedGeneration(value);
	}	

	/**
	 *	Returns the value of e
	 *	@return e
	 */
	public BigDecimal getE() throws CFException {
   		return work.getE();
	}

    /**
	 *	Returns the String value of e
	 *	@return e
	 */
	public char[]  getEActualString()  throws CFException{
	    return work.getEActualString();
	}

	 /**
     *	Returns String value of e
     *	@return e
     */
    public char[]  getEString() throws CFException {
         return work.getEString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean eIsNumeric() {
        return work.eIsNumeric();
    }
	/**
	 * 	Update E with the passed number
	 *	@param number
	 */
	public void setE(BigDecimal number)  throws CFException{
		work.setE(number);
   }

	/**
	 * 	Update E with the passed value
	 *	@param value (String or char[]);
	 */
	public void setE(char[] value)  throws CFException{
		work.setE(value);
	}   

	/**
	 *	Returns the value of w3v2Result
	 *	@return w3v2Result
	 */
	public BigDecimal getW3v2Result() throws CFException {
   		return work.getW3v2Result();
	}


	 /**
     *	Returns String value of w3v2Result
     *	@return w3v2Result
     */
    public char[]  getW3v2ResultString() throws CFException {
         return work.getW3v2ResultString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean w3v2ResultIsNumeric() {
        return work.w3v2ResultIsNumeric();
    }
	/**
	 * 	Update W3v2Result with the passed number
	 *	@param number
	 */
	public void setW3v2Result(BigDecimal number)  throws CFException{
		work.setW3v2Result(number);
   }

	/**
	 * 	Update W3v2Result with the passed value
	 *	@param value (String or char[]);
	 */
	public void setW3v2Result(char[] value)  throws CFException{
		work.setW3v2Result(value);
	}   

	public BigDecimal getPctWithNoPrice() throws CFException{      
   		return work.getPctWithNoPrice();
	}

    public char[] getPctWithNoPriceString() throws CFException {
          return  work.getPctWithNoPrice().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update PctWithNoPrice with the passed number
	 *	@param number
	 */
	public void setPctWithNoPrice(BigDecimal number)  throws CFException{
		work.setPctWithNoPrice(number);
   }

	/**
	 *	Returns the value of cbsumGen
	 *	@return cbsumGen
	 */
	public int getCbsumGen() throws CFException {
   		return work.getCbsumGen();
	}


	/**
	 *	Returns String value of cbsumGen
	 *	@return cbsumGen
	 */
	public char[]  getCbsumGenString() throws CFException {
	     return String.valueOf(work.getCbsumGenString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cbsumGenIsNumeric()  throws CFException{
	    return work.cbsumGenIsNumeric();
	}

	/**
	 * 	Update CbsumGen with the passed value
	 *	@param number
	 */
	public void setCbsumGen(int number)  throws CFException{
		work.setCbsumGen(number);
	}
	

	public void setCbsumGen(long number)  throws CFException{
	    work.setCbsumGen(number);
	}
	
	
	/**
	 * 	Update CbsumGen with the passed value
	 *	@param value (String or char[])
	 */
	public void setCbsumGen(char[] value)  throws CFException {
		work.setCbsumGen(value);
	}
	
	/**
	 * 	Update CbsumGen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCbsumGenString(char[] value)  throws CFException{
		work.setCbsumGen(value);
	}	

	/**
	 *	Returns the value of omsumpvGen
	 *	@return omsumpvGen
	 */
	public int getOmsumpvGen() throws CFException {
   		return work.getOmsumpvGen();
	}


	/**
	 *	Returns String value of omsumpvGen
	 *	@return omsumpvGen
	 */
	public char[]  getOmsumpvGenString() throws CFException {
	     return String.valueOf(work.getOmsumpvGenString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean omsumpvGenIsNumeric()  throws CFException{
	    return work.omsumpvGenIsNumeric();
	}

	/**
	 * 	Update OmsumpvGen with the passed value
	 *	@param number
	 */
	public void setOmsumpvGen(int number)  throws CFException{
		work.setOmsumpvGen(number);
	}
	

	public void setOmsumpvGen(long number)  throws CFException{
	    work.setOmsumpvGen(number);
	}
	
	
	/**
	 * 	Update OmsumpvGen with the passed value
	 *	@param value (String or char[])
	 */
	public void setOmsumpvGen(char[] value)  throws CFException {
		work.setOmsumpvGen(value);
	}
	
	/**
	 * 	Update OmsumpvGen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOmsumpvGenString(char[] value)  throws CFException{
		work.setOmsumpvGen(value);
	}	

	/**
	 *	Returns the value of omencfGen
	 *	@return omencfGen
	 */
	public int getOmencfGen() throws CFException {
   		return work.getOmencfGen();
	}


	/**
	 *	Returns String value of omencfGen
	 *	@return omencfGen
	 */
	public char[]  getOmencfGenString() throws CFException {
	     return String.valueOf(work.getOmencfGenString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean omencfGenIsNumeric()  throws CFException{
	    return work.omencfGenIsNumeric();
	}

	/**
	 * 	Update OmencfGen with the passed value
	 *	@param number
	 */
	public void setOmencfGen(int number)  throws CFException{
		work.setOmencfGen(number);
	}
	

	public void setOmencfGen(long number)  throws CFException{
	    work.setOmencfGen(number);
	}
	
	
	/**
	 * 	Update OmencfGen with the passed value
	 *	@param value (String or char[])
	 */
	public void setOmencfGen(char[] value)  throws CFException {
		work.setOmencfGen(value);
	}
	
	/**
	 * 	Update OmencfGen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOmencfGenString(char[] value)  throws CFException{
		work.setOmencfGen(value);
	}	

	/**
	 *	Returns the value of f
	 *	@return f
	 */
	public BigDecimal getF() throws CFException {
   		return work.getF();
	}

    /**
	 *	Returns the String value of f
	 *	@return f
	 */
	public char[]  getFActualString()  throws CFException{
	    return work.getFActualString();
	}

	 /**
     *	Returns String value of f
     *	@return f
     */
    public char[]  getFString() throws CFException {
         return work.getFString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean fIsNumeric() {
        return work.fIsNumeric();
    }
	/**
	 * 	Update F with the passed number
	 *	@param number
	 */
	public void setF(BigDecimal number)  throws CFException{
		work.setF(number);
   }

	/**
	 * 	Update F with the passed value
	 *	@param value (String or char[]);
	 */
	public void setF(char[] value)  throws CFException{
		work.setF(value);
	}   

	/**
	 *	Returns the value of w5v5
	 *	@return w5v5
	 */
	public BigDecimal getW5v5() throws CFException {
   		return work.getW5v5();
	}


	 /**
     *	Returns String value of w5v5
     *	@return w5v5
     */
    public char[]  getW5v5String() throws CFException {
         return work.getW5v5String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean w5v5IsNumeric() {
        return work.w5v5IsNumeric();
    }
	/**
	 * 	Update W5v5 with the passed number
	 *	@param number
	 */
	public void setW5v5(BigDecimal number)  throws CFException{
		work.setW5v5(number);
   }

	/**
	 * 	Update W5v5 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setW5v5(char[] value)  throws CFException{
		work.setW5v5(value);
	}   

	/**
	 *	Returns the value of reportGen
	 *	@return reportGen
	 */
	public int getReportGen() throws CFException {
   		return work.getReportGen();
	}


	/**
	 *	Returns String value of reportGen
	 *	@return reportGen
	 */
	public char[]  getReportGenString() throws CFException {
	     return String.valueOf(work.getReportGenString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean reportGenIsNumeric()  throws CFException{
	    return work.reportGenIsNumeric();
	}

	/**
	 * 	Update ReportGen with the passed value
	 *	@param number
	 */
	public void setReportGen(int number)  throws CFException{
		work.setReportGen(number);
	}
	

	public void setReportGen(long number)  throws CFException{
	    work.setReportGen(number);
	}
	
	
	/**
	 * 	Update ReportGen with the passed value
	 *	@param value (String or char[])
	 */
	public void setReportGen(char[] value)  throws CFException {
		work.setReportGen(value);
	}
	
	/**
	 * 	Update ReportGen with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setReportGenString(char[] value)  throws CFException{
		work.setReportGen(value);
	}	

	/**
	 *	Returns the value of d
	 *	@return d
	 */
	public BigDecimal getD() throws CFException {
   		return work.getD();
	}

    /**
	 *	Returns the String value of d
	 *	@return d
	 */
	public char[]  getDActualString()  throws CFException{
	    return work.getDActualString();
	}

	 /**
     *	Returns String value of d
     *	@return d
     */
    public char[]  getDString() throws CFException {
         return work.getDString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean dIsNumeric() {
        return work.dIsNumeric();
    }
	/**
	 * 	Update D with the passed number
	 *	@param number
	 */
	public void setD(BigDecimal number)  throws CFException{
		work.setD(number);
   }

	/**
	 * 	Update D with the passed value
	 *	@param value (String or char[]);
	 */
	public void setD(char[] value)  throws CFException{
		work.setD(value);
	}   

	/**
	 *	Returns the value of ccatTitleSize
	 *	@return ccatTitleSize
	 */
	public int getCcatTitleSize() throws CFException {        
   		return work.getCcatTitleSize();
	}
	
	/**
	 * 	Update CcatTitleSize with the passed value
	 *	@param number
	 */
	public void setCcatTitleSize(int number)  throws CFException{
		work.setCcatTitleSize(number);
	}


	public void setCcatTitleSize(long number)  throws CFException{
		work.setCcatTitleSize((int)number);
	}


	/**
	 *	Returns the value of w5v5A
	 *	@return w5v5A
	 */
	public BigDecimal getW5v5A() throws CFException {
   		return work.getW5v5A();
	}


	 /**
     *	Returns String value of w5v5A
     *	@return w5v5A
     */
    public char[]  getW5v5AString() throws CFException {
         return work.getW5v5AString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean w5v5AIsNumeric() {
        return work.w5v5AIsNumeric();
    }
	/**
	 * 	Update W5v5A with the passed number
	 *	@param number
	 */
	public void setW5v5A(BigDecimal number)  throws CFException{
		work.setW5v5A(number);
   }

	/**
	 * 	Update W5v5A with the passed value
	 *	@param value (String or char[]);
	 */
	public void setW5v5A(char[] value)  throws CFException{
		work.setW5v5A(value);
	}   

	/**
	 *	Returns the value of hvStartDt81d
	 *	@return hvStartDt81d
	 */
	public long getHvStartDt81d() throws CFException {
   		return work.getHvStartDt81d();
	}


	/**
	 *	Returns String value of hvStartDt81d
	 *	@return hvStartDt81d
	 */
	public char[]  getHvStartDt81dString() throws CFException {
	     return String.valueOf(work.getHvStartDt81dString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean hvStartDt81dIsNumeric()  throws CFException{
	    return work.hvStartDt81dIsNumeric();
	}

	/**
	 * 	Update HvStartDt81d with the passed value
	 *	@param number
	 */
	public void setHvStartDt81d(long number)  throws CFException{
		work.setHvStartDt81d(number);
	}
	

	
	/**
	 * 	Update HvStartDt81d with the passed value
	 *	@param value (String or char[])
	 */
	public void setHvStartDt81d(char[] value)  throws CFException {
		work.setHvStartDt81d(value);
	}
	
	/**
	 * 	Update HvStartDt81d with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setHvStartDt81dString(char[] value)  throws CFException{
		work.setHvStartDt81d(value);
	}	

	/**
	 *	Returns the value of ccatCombinedSize
	 *	@return ccatCombinedSize
	 */
	public int getCcatCombinedSize() throws CFException {        
   		return work.getCcatCombinedSize();
	}
	
	/**
	 * 	Update CcatCombinedSize with the passed value
	 *	@param number
	 */
	public void setCcatCombinedSize(int number)  throws CFException{
		work.setCcatCombinedSize(number);
	}


	public void setCcatCombinedSize(long number)  throws CFException{
		work.setCcatCombinedSize((int)number);
	}


	public BigDecimal getC() throws CFException{      
   		return work.getC();
	}

    public char[] getCString() throws CFException {
          return  work.getC().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update C with the passed number
	 *	@param number
	 */
	public void setC(BigDecimal number)  throws CFException{
		work.setC(number);
   }


        public ComputCtx getComputCtx() {
            return ComputCtx.this;
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
     Work work = ComputCtx.this.getWork();

	/**
	 *	Returns the value of w3v2Result
	 *	@return w3v2Result
	 */
	public BigDecimal getW3v2Result() throws CFException {
   		return work.getW3v2Result();
	}


	 /**
     *	Returns String value of w3v2Result
     *	@return w3v2Result
     */
    public char[]  getW3v2ResultString() throws CFException {
         return work.getW3v2ResultString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean w3v2ResultIsNumeric() {
        return work.w3v2ResultIsNumeric();
    }
	/**
	 * 	Update W3v2Result with the passed number
	 *	@param number
	 */
	public void setW3v2Result(BigDecimal number)  throws CFException{
		work.setW3v2Result(number);
   }

	/**
	 * 	Update W3v2Result with the passed value
	 *	@param value (String or char[]);
	 */
	public void setW3v2Result(char[] value)  throws CFException{
		work.setW3v2Result(value);
	}   


        public ComputCtx getComputCtx() {
            return ComputCtx.this;
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
     Work work = ComputCtx.this.getWork();

	/**
	 *	Returns the value of w3v2A
	 *	@return w3v2A
	 */
	public BigDecimal getW3v2A() throws CFException {
   		return work.getW3v2A();
	}


	 /**
     *	Returns String value of w3v2A
     *	@return w3v2A
     */
    public char[]  getW3v2AString() throws CFException {
         return work.getW3v2AString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean w3v2AIsNumeric() {
        return work.w3v2AIsNumeric();
    }
	/**
	 * 	Update W3v2A with the passed number
	 *	@param number
	 */
	public void setW3v2A(BigDecimal number)  throws CFException{
		work.setW3v2A(number);
   }

	/**
	 * 	Update W3v2A with the passed value
	 *	@param value (String or char[]);
	 */
	public void setW3v2A(char[] value)  throws CFException{
		work.setW3v2A(value);
	}   

	/**
	 *	Returns the value of w3v2Result
	 *	@return w3v2Result
	 */
	public BigDecimal getW3v2Result() throws CFException {
   		return work.getW3v2Result();
	}


	 /**
     *	Returns String value of w3v2Result
     *	@return w3v2Result
     */
    public char[]  getW3v2ResultString() throws CFException {
         return work.getW3v2ResultString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean w3v2ResultIsNumeric() {
        return work.w3v2ResultIsNumeric();
    }
	/**
	 * 	Update W3v2Result with the passed number
	 *	@param number
	 */
	public void setW3v2Result(BigDecimal number)  throws CFException{
		work.setW3v2Result(number);
   }

	/**
	 * 	Update W3v2Result with the passed value
	 *	@param value (String or char[]);
	 */
	public void setW3v2Result(char[] value)  throws CFException{
		work.setW3v2Result(value);
	}   

	/**
	 *	Returns the value of w5v5
	 *	@return w5v5
	 */
	public BigDecimal getW5v5() throws CFException {
   		return work.getW5v5();
	}


	 /**
     *	Returns String value of w5v5
     *	@return w5v5
     */
    public char[]  getW5v5String() throws CFException {
         return work.getW5v5String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean w5v5IsNumeric() {
        return work.w5v5IsNumeric();
    }
	/**
	 * 	Update W5v5 with the passed number
	 *	@param number
	 */
	public void setW5v5(BigDecimal number)  throws CFException{
		work.setW5v5(number);
   }

	/**
	 * 	Update W5v5 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setW5v5(char[] value)  throws CFException{
		work.setW5v5(value);
	}   

	/**
	 *	Returns the value of w5v5A
	 *	@return w5v5A
	 */
	public BigDecimal getW5v5A() throws CFException {
   		return work.getW5v5A();
	}


	 /**
     *	Returns String value of w5v5A
     *	@return w5v5A
     */
    public char[]  getW5v5AString() throws CFException {
         return work.getW5v5AString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean w5v5AIsNumeric() {
        return work.w5v5AIsNumeric();
    }
	/**
	 * 	Update W5v5A with the passed number
	 *	@param number
	 */
	public void setW5v5A(BigDecimal number)  throws CFException{
		work.setW5v5A(number);
   }

	/**
	 * 	Update W5v5A with the passed value
	 *	@param value (String or char[]);
	 */
	public void setW5v5A(char[] value)  throws CFException{
		work.setW5v5A(value);
	}   

	/**
	 *	Returns the value of w3v2
	 *	@return w3v2
	 */
	public BigDecimal getW3v2() throws CFException {
   		return work.getW3v2();
	}


	 /**
     *	Returns String value of w3v2
     *	@return w3v2
     */
    public char[]  getW3v2String() throws CFException {
         return work.getW3v2String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean w3v2IsNumeric() {
        return work.w3v2IsNumeric();
    }
	/**
	 * 	Update W3v2 with the passed number
	 *	@param number
	 */
	public void setW3v2(BigDecimal number)  throws CFException{
		work.setW3v2(number);
   }

	/**
	 * 	Update W3v2 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setW3v2(char[] value)  throws CFException{
		work.setW3v2(value);
	}   


        public ComputCtx getComputCtx() {
            return ComputCtx.this;
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
     Work work = ComputCtx.this.getWork();

	/**
	 *	Returns the value of w5v5
	 *	@return w5v5
	 */
	public BigDecimal getW5v5() throws CFException {
   		return work.getW5v5();
	}


	 /**
     *	Returns String value of w5v5
     *	@return w5v5
     */
    public char[]  getW5v5String() throws CFException {
         return work.getW5v5String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean w5v5IsNumeric() {
        return work.w5v5IsNumeric();
    }
	/**
	 * 	Update W5v5 with the passed number
	 *	@param number
	 */
	public void setW5v5(BigDecimal number)  throws CFException{
		work.setW5v5(number);
   }

	/**
	 * 	Update W5v5 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setW5v5(char[] value)  throws CFException{
		work.setW5v5(value);
	}   


        public ComputCtx getComputCtx() {
            return ComputCtx.this;
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
     Work work = ComputCtx.this.getWork();

	/**
	 *	Returns the value of w03a1DiSmallint
	 *	@return w03a1DiSmallint
	 */
	public short getW03a1DiSmallint() throws CFException {        
   		return work.getW03a1DiSmallint();
	}
	
	/**
	 * 	Update W03a1DiSmallint with the passed value
	 *	@param number
	 */
	public void setW03a1DiSmallint(short number)  throws CFException{
		work.setW03a1DiSmallint(number);
	}

	public void setW03a1DiSmallint(int number)  throws CFException{
		work.setW03a1DiSmallint((short)number);
	}

	public void setW03a1DiSmallint(long number)  throws CFException{
		work.setW03a1DiSmallint((short)number);
	}



	public BigDecimal getW03a1DiDecimal() throws CFException{      
   		return work.getW03a1DiDecimal();
	}

    public char[] getW03a1DiDecimalString() throws CFException {
          return  work.getW03a1DiDecimal().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update W03a1DiDecimal with the passed number
	 *	@param number
	 */
	public void setW03a1DiDecimal(BigDecimal number)  throws CFException{
		work.setW03a1DiDecimal(number);
   }

	/**
	 *	Returns the value of w3v2
	 *	@return w3v2
	 */
	public BigDecimal getW3v2() throws CFException {
   		return work.getW3v2();
	}


	 /**
     *	Returns String value of w3v2
     *	@return w3v2
     */
    public char[]  getW3v2String() throws CFException {
         return work.getW3v2String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean w3v2IsNumeric() {
        return work.w3v2IsNumeric();
    }
	/**
	 * 	Update W3v2 with the passed number
	 *	@param number
	 */
	public void setW3v2(BigDecimal number)  throws CFException{
		work.setW3v2(number);
   }

	/**
	 * 	Update W3v2 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setW3v2(char[] value)  throws CFException{
		work.setW3v2(value);
	}   

	/**
	 *	Returns the value of w5
	 *	@return w5
	 */
	public int getW5() throws CFException {        
   		return work.getW5();
	}
	
	/**
	 * 	Update W5 with the passed value
	 *	@param number
	 */
	public void setW5(int number)  throws CFException{
		work.setW5(number);
	}


	public void setW5(long number)  throws CFException{
		work.setW5((int)number);
	}


	/**
	 *	Returns the value of wcdloLeapYear
	 *	@return wcdloLeapYear
	 */
	public BigDecimal getWcdloLeapYear() throws CFException {
   		return work.getWcdloLeapYear();
	}


	 /**
     *	Returns String value of wcdloLeapYear
     *	@return wcdloLeapYear
     */
    public char[]  getWcdloLeapYearString() throws CFException {
         return work.getWcdloLeapYearString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean wcdloLeapYearIsNumeric() {
        return work.wcdloLeapYearIsNumeric();
    }
	/**
	 * 	Update WcdloLeapYear with the passed number
	 *	@param number
	 */
	public void setWcdloLeapYear(BigDecimal number)  throws CFException{
		work.setWcdloLeapYear(number);
   }

	/**
	 * 	Update WcdloLeapYear with the passed value
	 *	@param value (String or char[]);
	 */
	public void setWcdloLeapYear(char[] value)  throws CFException{
		work.setWcdloLeapYear(value);
	}   

public long getW03a1DoComp3() throws CFException {  
        return work.getW03a1DoComp3();
}
	/**
	 * 	Update W03a1DoComp3 with the passed value
	 *	@param number
	 */
	public void setW03a1DoComp3(long number)  throws CFException{
		work.setW03a1DoComp3(number);
	}



	public BigDecimal getW03a1DoDecimal() throws CFException{      
   		return work.getW03a1DoDecimal();
	}

    public char[] getW03a1DoDecimalString() throws CFException {
          return  work.getW03a1DoDecimal().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update W03a1DoDecimal with the passed number
	 *	@param number
	 */
	public void setW03a1DoDecimal(BigDecimal number)  throws CFException{
		work.setW03a1DoDecimal(number);
   }

	/**
	 *	Returns the value of w03a1DiInt
	 *	@return w03a1DiInt
	 */
	public int getW03a1DiInt() throws CFException {        
   		return work.getW03a1DiInt();
	}
	
	/**
	 * 	Update W03a1DiInt with the passed value
	 *	@param number
	 */
	public void setW03a1DiInt(int number)  throws CFException{
		work.setW03a1DiInt(number);
	}


	public void setW03a1DiInt(long number)  throws CFException{
		work.setW03a1DiInt((int)number);
	}


	/**
	 *	Returns the value of w03a1DiBigint
	 *	@return w03a1DiBigint
	 */
	public long getW03a1DiBigint() throws CFException {        
   		return work.getW03a1DiBigint();
	}
	
	/**
	 * 	Update W03a1DiBigint with the passed value
	 *	@param number
	 */
	public void setW03a1DiBigint(long number)  throws CFException{
		work.setW03a1DiBigint(number);
	}



	/**
	 *	Returns the value of w03a1DoSmallint
	 *	@return w03a1DoSmallint
	 */
	public short getW03a1DoSmallint() throws CFException {        
   		return work.getW03a1DoSmallint();
	}
	
	/**
	 * 	Update W03a1DoSmallint with the passed value
	 *	@param number
	 */
	public void setW03a1DoSmallint(short number)  throws CFException{
		work.setW03a1DoSmallint(number);
	}

	public void setW03a1DoSmallint(int number)  throws CFException{
		work.setW03a1DoSmallint((short)number);
	}

	public void setW03a1DoSmallint(long number)  throws CFException{
		work.setW03a1DoSmallint((short)number);
	}



	/**
	 *	Returns the value of w3
	 *	@return w3
	 */
	public BigDecimal getW3() throws CFException {           
   		return work.getW3();
	}
	
	
	/**
	 * 	Update W3 with the passed value
	 *	@param number
	 */
	public void setW3(BigDecimal number)  throws CFException{
		work.setW3(number);
   }
              

	/**
	 *	Returns the value of w03a1DiComp
	 *	@return w03a1DiComp
	 */
	public int getW03a1DiComp() throws CFException {        
   		return work.getW03a1DiComp();
	}
	
	/**
	 * 	Update W03a1DiComp with the passed value
	 *	@param number
	 */
	public void setW03a1DiComp(int number)  throws CFException{
		work.setW03a1DiComp(number);
	}


	public void setW03a1DiComp(long number)  throws CFException{
		work.setW03a1DiComp((int)number);
	}


	/**
	 *	Returns the value of w3v2Result
	 *	@return w3v2Result
	 */
	public BigDecimal getW3v2Result() throws CFException {
   		return work.getW3v2Result();
	}


	 /**
     *	Returns String value of w3v2Result
     *	@return w3v2Result
     */
    public char[]  getW3v2ResultString() throws CFException {
         return work.getW3v2ResultString();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean w3v2ResultIsNumeric() {
        return work.w3v2ResultIsNumeric();
    }
	/**
	 * 	Update W3v2Result with the passed number
	 *	@param number
	 */
	public void setW3v2Result(BigDecimal number)  throws CFException{
		work.setW3v2Result(number);
   }

	/**
	 * 	Update W3v2Result with the passed value
	 *	@param value (String or char[]);
	 */
	public void setW3v2Result(char[] value)  throws CFException{
		work.setW3v2Result(value);
	}   

	/**
	 *	Returns the value of w03a1DoComp
	 *	@return w03a1DoComp
	 */
	public int getW03a1DoComp() throws CFException {        
   		return work.getW03a1DoComp();
	}
	
	/**
	 * 	Update W03a1DoComp with the passed value
	 *	@param number
	 */
	public void setW03a1DoComp(int number)  throws CFException{
		work.setW03a1DoComp(number);
	}


	public void setW03a1DoComp(long number)  throws CFException{
		work.setW03a1DoComp((int)number);
	}


	public BigDecimal getWFeePromoxAmt() throws CFException{      
   		return work.getWFeePromoxAmt();
	}

    public char[] getWFeePromoxAmtString() throws CFException {
          return  work.getWFeePromoxAmt().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WFeePromoxAmt with the passed number
	 *	@param number
	 */
	public void setWFeePromoxAmt(BigDecimal number)  throws CFException{
		work.setWFeePromoxAmt(number);
   }

	/**
	 *	Returns the value of w2
	 *	@return w2
	 */
	public BigDecimal getW2() throws CFException {           
   		return work.getW2();
	}
	
	
	/**
	 * 	Update W2 with the passed value
	 *	@param number
	 */
	public void setW2(BigDecimal number)  throws CFException{
		work.setW2(number);
   }
              

	public BigDecimal getWChgAmtDec5() throws CFException{      
   		return work.getWChgAmtDec5();
	}

    public char[] getWChgAmtDec5String() throws CFException {
          return  work.getWChgAmtDec5().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update WChgAmtDec5 with the passed number
	 *	@param number
	 */
	public void setWChgAmtDec5(BigDecimal number)  throws CFException{
		work.setWChgAmtDec5(number);
   }

	/**
	 *	Returns the value of w03a1DiDouble
	 *	@return w03a1DiDouble
	 */
   public BigDecimal getW03a1DiDouble() throws CFException {
   	return work.getW03a1DiDouble();
   }

  
	/**
	*  set variable w03a1DiDouble
	*  @param value
	**/
   public void setW03a1DiDouble(BigDecimal value)  throws CFException{
	work.setW03a1DiDouble(value);
   } 
	
	

	/**
	 *	Returns the value of wcdliCurYyyy
	 *	@return wcdliCurYyyy
	 */
	public int getWcdliCurYyyy() throws CFException {
   		return work.getWcdliCurYyyy();
	}


	/**
	 *	Returns String value of wcdliCurYyyy
	 *	@return wcdliCurYyyy
	 */
	public char[]  getWcdliCurYyyyString() throws CFException {
	     return String.valueOf(work.getWcdliCurYyyyString()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdliCurYyyyIsNumeric()  throws CFException{
	    return work.wcdliCurYyyyIsNumeric();
	}

	/**
	 * 	Update WcdliCurYyyy with the passed value
	 *	@param number
	 */
	public void setWcdliCurYyyy(int number)  throws CFException{
		work.setWcdliCurYyyy(number);
	}
	

	public void setWcdliCurYyyy(long number)  throws CFException{
	    work.setWcdliCurYyyy(number);
	}
	
	
	/**
	 * 	Update WcdliCurYyyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdliCurYyyy(char[] value)  throws CFException {
		work.setWcdliCurYyyy(value);
	}
	
	/**
	 * 	Update WcdliCurYyyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdliCurYyyyString(char[] value)  throws CFException{
		work.setWcdliCurYyyy(value);
	}	

	/**
	 *	Returns the value of w5v5
	 *	@return w5v5
	 */
	public BigDecimal getW5v5() throws CFException {
   		return work.getW5v5();
	}


	 /**
     *	Returns String value of w5v5
     *	@return w5v5
     */
    public char[]  getW5v5String() throws CFException {
         return work.getW5v5String();
    }
     /**
     *  This method allows testing if there is a numeric value stored in the serialized String
     *	@return true if numeric value is stored in the string
     */
    public boolean w5v5IsNumeric() {
        return work.w5v5IsNumeric();
    }
	/**
	 * 	Update W5v5 with the passed number
	 *	@param number
	 */
	public void setW5v5(BigDecimal number)  throws CFException{
		work.setW5v5(number);
   }

	/**
	 * 	Update W5v5 with the passed value
	 *	@param value (String or char[]);
	 */
	public void setW5v5(char[] value)  throws CFException{
		work.setW5v5(value);
	}   

	public BigDecimal getPmslk402ListPrice() throws CFException{      
   		return work.getPmslk402ListPrice();
	}

    public char[] getPmslk402ListPriceString() throws CFException {
          return  work.getPmslk402ListPrice().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update Pmslk402ListPrice with the passed number
	 *	@param number
	 */
	public void setPmslk402ListPrice(BigDecimal number)  throws CFException{
		work.setPmslk402ListPrice(number);
   }

	/**
	 *	Returns the value of w4
	 *	@return w4
	 */
	public BigDecimal getW4() throws CFException {           
   		return work.getW4();
	}
	
	
	/**
	 * 	Update W4 with the passed value
	 *	@param number
	 */
	public void setW4(BigDecimal number)  throws CFException{
		work.setW4(number);
   }
              

	/**
	 *	Returns the value of w03a1DiReal
	 *	@return w03a1DiReal
	 */
   public BigDecimal getW03a1DiReal() throws CFException {
   	return work.getW03a1DiReal();
   }

  
	/**
	*  set variable w03a1DiReal
	*  @param value
	**/
   public void setW03a1DiReal(BigDecimal value)  throws CFException{
	work.setW03a1DiReal(value);
   } 
	
	

public long getW03a1DiComp3() throws CFException {  
        return work.getW03a1DiComp3();
}
	/**
	 * 	Update W03a1DiComp3 with the passed value
	 *	@param number
	 */
	public void setW03a1DiComp3(long number)  throws CFException{
		work.setW03a1DiComp3(number);
	}



	/**
	 *	Returns the value of w1
	 *	@return w1
	 */
	public BigDecimal getW1() throws CFException {           
   		return work.getW1();
	}
	
	
	/**
	 * 	Update W1 with the passed value
	 *	@param number
	 */
	public void setW1(BigDecimal number)  throws CFException{
		work.setW1(number);
   }
              


        public ComputCtx getComputCtx() {
            return ComputCtx.this;
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
     Work work = ComputCtx.this.getWork();
     Msp3pprcsIcaNumGroup300 msp3pprcsIcaNumGroup300 = ComputCtx.this.getMsp3pprcsIcaNumGroup300();

	public BigDecimal getW03a1DiDecimal() throws CFException{      
   		return work.getW03a1DiDecimal();
	}

    public char[] getW03a1DiDecimalString() throws CFException {
          return  work.getW03a1DiDecimal().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update W03a1DiDecimal with the passed number
	 *	@param number
	 */
	public void setW03a1DiDecimal(BigDecimal number)  throws CFException{
		work.setW03a1DiDecimal(number);
   }

	/**
	 *	Returns the value of byte0300
	 *	@return byte0300
	 */
	public int getByte0300() throws CFException {
   		return msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().getByte0300();
	}


	/**
	 *	Returns String value of byte0300
	 *	@return byte0300
	 */
	public char[]  getByte0300String() throws CFException {
	     return String.valueOf(msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().getByte0300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean byte0300IsNumeric()  throws CFException{
	    return msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().byte0300IsNumeric();
	}

	/**
	 * 	Update Byte0300 with the passed value
	 *	@param number
	 */
	public void setByte0300(int number)  throws CFException{
		msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte0300(number);
	}
	

	public void setByte0300(long number)  throws CFException{
	    msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte0300(number);
	}
	
	
	/**
	 * 	Update Byte0300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setByte0300(char[] value)  throws CFException {
		msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte0300(value);
	}
	
	/**
	 * 	Update Byte0300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setByte0300String(char[] value)  throws CFException{
		msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte0300(value);
	}	

	/**
	 *	Returns the value of byte2300
	 *	@return byte2300
	 */
	public int getByte2300() throws CFException {
   		return msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().getByte2300();
	}


	/**
	 *	Returns String value of byte2300
	 *	@return byte2300
	 */
	public char[]  getByte2300String() throws CFException {
	     return String.valueOf(msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().getByte2300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean byte2300IsNumeric()  throws CFException{
	    return msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().byte2300IsNumeric();
	}

	/**
	 * 	Update Byte2300 with the passed value
	 *	@param number
	 */
	public void setByte2300(int number)  throws CFException{
		msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte2300(number);
	}
	

	public void setByte2300(long number)  throws CFException{
	    msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte2300(number);
	}
	
	
	/**
	 * 	Update Byte2300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setByte2300(char[] value)  throws CFException {
		msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte2300(value);
	}
	
	/**
	 * 	Update Byte2300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setByte2300String(char[] value)  throws CFException{
		msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte2300(value);
	}	

	/**
	 *	Returns the value of w03a1DoComp
	 *	@return w03a1DoComp
	 */
	public int getW03a1DoComp() throws CFException {        
   		return work.getW03a1DoComp();
	}
	
	/**
	 * 	Update W03a1DoComp with the passed value
	 *	@param number
	 */
	public void setW03a1DoComp(int number)  throws CFException{
		work.setW03a1DoComp(number);
	}


	public void setW03a1DoComp(long number)  throws CFException{
		work.setW03a1DoComp((int)number);
	}


public long getW03a1DoComp3() throws CFException {  
        return work.getW03a1DoComp3();
}
	/**
	 * 	Update W03a1DoComp3 with the passed value
	 *	@param number
	 */
	public void setW03a1DoComp3(long number)  throws CFException{
		work.setW03a1DoComp3(number);
	}



	/**
	 *	Returns the value of byte3300
	 *	@return byte3300
	 */
	public int getByte3300() throws CFException {
   		return msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().getByte3300();
	}


	/**
	 *	Returns String value of byte3300
	 *	@return byte3300
	 */
	public char[]  getByte3300String() throws CFException {
	     return String.valueOf(msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().getByte3300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean byte3300IsNumeric()  throws CFException{
	    return msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().byte3300IsNumeric();
	}

	/**
	 * 	Update Byte3300 with the passed value
	 *	@param number
	 */
	public void setByte3300(int number)  throws CFException{
		msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte3300(number);
	}
	

	public void setByte3300(long number)  throws CFException{
	    msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte3300(number);
	}
	
	
	/**
	 * 	Update Byte3300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setByte3300(char[] value)  throws CFException {
		msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte3300(value);
	}
	
	/**
	 * 	Update Byte3300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setByte3300String(char[] value)  throws CFException{
		msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte3300(value);
	}	

	/**
	 *	Returns the value of byte7300
	 *	@return byte7300
	 */
	public int getByte7300() throws CFException {
   		return msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().getByte7300();
	}


	/**
	 *	Returns String value of byte7300
	 *	@return byte7300
	 */
	public char[]  getByte7300String() throws CFException {
	     return String.valueOf(msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().getByte7300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean byte7300IsNumeric()  throws CFException{
	    return msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().byte7300IsNumeric();
	}

	/**
	 * 	Update Byte7300 with the passed value
	 *	@param number
	 */
	public void setByte7300(int number)  throws CFException{
		msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte7300(number);
	}
	

	public void setByte7300(long number)  throws CFException{
	    msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte7300(number);
	}
	
	
	/**
	 * 	Update Byte7300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setByte7300(char[] value)  throws CFException {
		msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte7300(value);
	}
	
	/**
	 * 	Update Byte7300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setByte7300String(char[] value)  throws CFException{
		msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte7300(value);
	}	

	/**
	 *	Returns the value of work
	 *	@return work
	 */   
	 public Work getWork() {
   	return work;
   }


	/**
	 *	Returns the value of w03a1DiInt
	 *	@return w03a1DiInt
	 */
	public int getW03a1DiInt() throws CFException {        
   		return work.getW03a1DiInt();
	}
	
	/**
	 * 	Update W03a1DiInt with the passed value
	 *	@param number
	 */
	public void setW03a1DiInt(int number)  throws CFException{
		work.setW03a1DiInt(number);
	}


	public void setW03a1DiInt(long number)  throws CFException{
		work.setW03a1DiInt((int)number);
	}


	/**
	 *	Returns the value of w03a1DiDouble
	 *	@return w03a1DiDouble
	 */
   public BigDecimal getW03a1DiDouble() throws CFException {
   	return work.getW03a1DiDouble();
   }

  
	/**
	*  set variable w03a1DiDouble
	*  @param value
	**/
   public void setW03a1DiDouble(BigDecimal value)  throws CFException{
	work.setW03a1DiDouble(value);
   } 
	
	

	/**
	 *	Returns the value of w03a1DiBigint
	 *	@return w03a1DiBigint
	 */
	public long getW03a1DiBigint() throws CFException {        
   		return work.getW03a1DiBigint();
	}
	
	/**
	 * 	Update W03a1DiBigint with the passed value
	 *	@param number
	 */
	public void setW03a1DiBigint(long number)  throws CFException{
		work.setW03a1DiBigint(number);
	}



	/**
	 *	Returns the value of byte6300
	 *	@return byte6300
	 */
	public int getByte6300() throws CFException {
   		return msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().getByte6300();
	}


	/**
	 *	Returns String value of byte6300
	 *	@return byte6300
	 */
	public char[]  getByte6300String() throws CFException {
	     return String.valueOf(msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().getByte6300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean byte6300IsNumeric()  throws CFException{
	    return msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().byte6300IsNumeric();
	}

	/**
	 * 	Update Byte6300 with the passed value
	 *	@param number
	 */
	public void setByte6300(int number)  throws CFException{
		msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte6300(number);
	}
	

	public void setByte6300(long number)  throws CFException{
	    msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte6300(number);
	}
	
	
	/**
	 * 	Update Byte6300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setByte6300(char[] value)  throws CFException {
		msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte6300(value);
	}
	
	/**
	 * 	Update Byte6300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setByte6300String(char[] value)  throws CFException{
		msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte6300(value);
	}	

	/**
	 *	Returns the value of w03a1DoSmallint
	 *	@return w03a1DoSmallint
	 */
	public short getW03a1DoSmallint() throws CFException {        
   		return work.getW03a1DoSmallint();
	}
	
	/**
	 * 	Update W03a1DoSmallint with the passed value
	 *	@param number
	 */
	public void setW03a1DoSmallint(short number)  throws CFException{
		work.setW03a1DoSmallint(number);
	}

	public void setW03a1DoSmallint(int number)  throws CFException{
		work.setW03a1DoSmallint((short)number);
	}

	public void setW03a1DoSmallint(long number)  throws CFException{
		work.setW03a1DoSmallint((short)number);
	}



	/**
	 *	Returns the value of byte4300
	 *	@return byte4300
	 */
	public int getByte4300() throws CFException {
   		return msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().getByte4300();
	}


	/**
	 *	Returns String value of byte4300
	 *	@return byte4300
	 */
	public char[]  getByte4300String() throws CFException {
	     return String.valueOf(msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().getByte4300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean byte4300IsNumeric()  throws CFException{
	    return msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().byte4300IsNumeric();
	}

	/**
	 * 	Update Byte4300 with the passed value
	 *	@param number
	 */
	public void setByte4300(int number)  throws CFException{
		msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte4300(number);
	}
	

	public void setByte4300(long number)  throws CFException{
	    msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte4300(number);
	}
	
	
	/**
	 * 	Update Byte4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setByte4300(char[] value)  throws CFException {
		msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte4300(value);
	}
	
	/**
	 * 	Update Byte4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setByte4300String(char[] value)  throws CFException{
		msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte4300(value);
	}	

	/**
	 *	Returns the value of w03a1DiReal
	 *	@return w03a1DiReal
	 */
   public BigDecimal getW03a1DiReal() throws CFException {
   	return work.getW03a1DiReal();
   }

  
	/**
	*  set variable w03a1DiReal
	*  @param value
	**/
   public void setW03a1DiReal(BigDecimal value)  throws CFException{
	work.setW03a1DiReal(value);
   } 
	
	

	/**
	 *	Returns the value of byte1300
	 *	@return byte1300
	 */
	public int getByte1300() throws CFException {
   		return msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().getByte1300();
	}


	/**
	 *	Returns String value of byte1300
	 *	@return byte1300
	 */
	public char[]  getByte1300String() throws CFException {
	     return String.valueOf(msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().getByte1300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean byte1300IsNumeric()  throws CFException{
	    return msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().byte1300IsNumeric();
	}

	/**
	 * 	Update Byte1300 with the passed value
	 *	@param number
	 */
	public void setByte1300(int number)  throws CFException{
		msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte1300(number);
	}
	

	public void setByte1300(long number)  throws CFException{
	    msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte1300(number);
	}
	
	
	/**
	 * 	Update Byte1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setByte1300(char[] value)  throws CFException {
		msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte1300(value);
	}
	
	/**
	 * 	Update Byte1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setByte1300String(char[] value)  throws CFException{
		msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte1300(value);
	}	

	/**
	 *	Returns the value of byte5300
	 *	@return byte5300
	 */
	public int getByte5300() throws CFException {
   		return msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().getByte5300();
	}


	/**
	 *	Returns String value of byte5300
	 *	@return byte5300
	 */
	public char[]  getByte5300String() throws CFException {
	     return String.valueOf(msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().getByte5300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean byte5300IsNumeric()  throws CFException{
	    return msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().byte5300IsNumeric();
	}

	/**
	 * 	Update Byte5300 with the passed value
	 *	@param number
	 */
	public void setByte5300(int number)  throws CFException{
		msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte5300(number);
	}
	

	public void setByte5300(long number)  throws CFException{
	    msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte5300(number);
	}
	
	
	/**
	 * 	Update Byte5300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setByte5300(char[] value)  throws CFException {
		msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte5300(value);
	}
	
	/**
	 * 	Update Byte5300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setByte5300String(char[] value)  throws CFException{
		msp3pprcsIcaNumGroup300.getMsp3pprcsIcaNum300Redefined().setByte5300(value);
	}	


        public ComputCtx getComputCtx() {
            return ComputCtx.this;
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
        str += msp3pprcsIcaNumGroup300.hashCode();
       return str.hashCode();
    }

    public Process3InCtx clone() {
        Process3InCtx cloneObj = new Process3InCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.msp3pprcsIcaNumGroup300 = new Msp3pprcsIcaNumGroup300();
        cloneObj.msp3pprcsIcaNumGroup300.set(msp3pprcsIcaNumGroup300.getClonedField());
        return cloneObj;
    }

    }

    public Process3InCtx getProcess3InCtx() {
            return new Process3InCtx();
    }
     public class Process3OutCtx implements Cloneable {
     Work work = ComputCtx.this.getWork();
     Msp3pprcsIcaNumGroup300 msp3pprcsIcaNumGroup300 = ComputCtx.this.getMsp3pprcsIcaNumGroup300();

	/**
	 *	Returns the value of decimalNo300
	 *	@return decimalNo300
	 */
	public long getDecimalNo300() throws CFException {
   		return work.getDecimalNo300();
	}


	/**
	 *	Returns String value of decimalNo300
	 *	@return decimalNo300
	 */
	public char[]  getDecimalNo300String() throws CFException {
	     return String.valueOf(work.getDecimalNo300String()).toCharArray();
	}

	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean decimalNo300IsNumeric()  throws CFException{
	    return work.decimalNo300IsNumeric();
	}

	/**
	 * 	Update DecimalNo300 with the passed value
	 *	@param number
	 */
	public void setDecimalNo300(long number)  throws CFException{
		work.setDecimalNo300(number);
	}
	

	
	/**
	 * 	Update DecimalNo300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDecimalNo300(char[] value)  throws CFException {
		work.setDecimalNo300(value);
	}
	
	/**
	 * 	Update DecimalNo300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDecimalNo300String(char[] value)  throws CFException{
		work.setDecimalNo300(value);
	}	

	/**
	 *	Returns the value of w03a1DoInt
	 *	@return w03a1DoInt
	 */
	public int getW03a1DoInt() throws CFException {        
   		return work.getW03a1DoInt();
	}
	
	/**
	 * 	Update W03a1DoInt with the passed value
	 *	@param number
	 */
	public void setW03a1DoInt(int number)  throws CFException{
		work.setW03a1DoInt(number);
	}


	public void setW03a1DoInt(long number)  throws CFException{
		work.setW03a1DoInt((int)number);
	}


	public BigDecimal getW03a1DoDecimal() throws CFException{      
   		return work.getW03a1DoDecimal();
	}

    public char[] getW03a1DoDecimalString() throws CFException {
          return  work.getW03a1DoDecimal().toPlainString().toCharArray();
    }
	
	/**
	 * 	Update W03a1DoDecimal with the passed number
	 *	@param number
	 */
	public void setW03a1DoDecimal(BigDecimal number)  throws CFException{
		work.setW03a1DoDecimal(number);
   }

	/**
	 *	Returns the value of w03a1DoBigint
	 *	@return w03a1DoBigint
	 */
	public long getW03a1DoBigint() throws CFException {        
   		return work.getW03a1DoBigint();
	}
	
	/**
	 * 	Update W03a1DoBigint with the passed value
	 *	@param number
	 */
	public void setW03a1DoBigint(long number)  throws CFException{
		work.setW03a1DoBigint(number);
	}



	/**
	 *	Returns the value of w03a1DoReal
	 *	@return w03a1DoReal
	 */
   public BigDecimal getW03a1DoReal() throws CFException {
   	return work.getW03a1DoReal();
   }

  
	/**
	*  set variable w03a1DoReal
	*  @param value
	**/
   public void setW03a1DoReal(BigDecimal value)  throws CFException{
	work.setW03a1DoReal(value);
   } 
	
	

	/**
	 *	Returns the value of w03a1DoDouble
	 *	@return w03a1DoDouble
	 */
   public BigDecimal getW03a1DoDouble() throws CFException {
   	return work.getW03a1DoDouble();
   }

  
	/**
	*  set variable w03a1DoDouble
	*  @param value
	**/
   public void setW03a1DoDouble(BigDecimal value)  throws CFException{
	work.setW03a1DoDouble(value);
   } 
	
	


        public ComputCtx getComputCtx() {
            return ComputCtx.this;
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
        str += msp3pprcsIcaNumGroup300.hashCode();
       return str.hashCode();
    }

    public Process3OutCtx clone() {
        Process3OutCtx cloneObj = new Process3OutCtx();
        cloneObj.work = new Work();
        cloneObj.work.set(work.getClonedField());
        cloneObj.msp3pprcsIcaNumGroup300 = new Msp3pprcsIcaNumGroup300();
        cloneObj.msp3pprcsIcaNumGroup300.set(msp3pprcsIcaNumGroup300.getClonedField());
        return cloneObj;
    }

    }

    public Process3OutCtx getProcess3OutCtx() {
            return new Process3OutCtx();
    }
}
