package com.cloudframe.app.init1.dto;

/**
*  The class WcdloDateTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WcdloDateTbl extends WcdloDateTblSerialized { 
   

								private short wcdloBlPeriodCd;
				private WcdloStartDt wcdloStartDt = new WcdloStartDt();
				private WcdloEndDt wcdloEndDt = new WcdloEndDt();

								private long wcdloStartDtIso;

								private long wcdloEndDtIso;
				private WcdloMonthEndDt wcdloMonthEndDt = new WcdloMonthEndDt();
	
	/**
	* Constructor for WcdloDateTbl
	**/
    public WcdloDateTbl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WcdloDateTbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcdloDateTbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			wcdloStartDt.setParent(this,getStartOffset() + 2);
	       			wcdloEndDt.setParent(this,getStartOffset() + 12);
	       			wcdloMonthEndDt.setParent(this,getStartOffset() + 38);
    } 

	/**
	 *	Returns the value of wcdloBlPeriodCd
	 *	@return wcdloBlPeriodCd
	 */
	public short getWcdloBlPeriodCd() throws CFException {
        if (isWcdloBlPeriodCdModified()) { 
           wcdloBlPeriodCd = refreshWcdloBlPeriodCd();
        }
   		return wcdloBlPeriodCd;
	}
	
	/**
	 * 	Update WcdloBlPeriodCd with the passed value
	 *  Corresponding COBOL Variable is WCDLO-BL-PERIOD-CD
	 *	@param number
	 */
	public void setWcdloBlPeriodCd(short number) {
	     // Truncate if the number is beyond +/- Max range
	    wcdloBlPeriodCd = checkWcdloBlPeriodCdMaxLimit(number); 
		serializeWcdloBlPeriodCd(wcdloBlPeriodCd);
	}

	public void setWcdloBlPeriodCd(int number) {
	    number = checkWcdloBlPeriodCdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWcdloBlPeriodCd((short)number);
	}
	public void setWcdloBlPeriodCd(long number) {
	    number = checkWcdloBlPeriodCdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWcdloBlPeriodCd((short)number);
	}
	

	/**
	 *	Returns the value of wcdloStartDt
	 *	@return wcdloStartDt
	 */   
	 public WcdloStartDt getWcdloStartDt() {
   	return wcdloStartDt;
   }
   /**
	* 	Update WcdloStartDt with the passed value
	*   Corresponding COBOL Variable is WCDLO-START-DT
	*	@param value
	*/
   public void setWcdloStartDt(char[] value) {
      wcdloStartDt.setString(value); 
   }   
    
     /**
	 * 	Update WcdloStartDt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWcdloStartDt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcdloStartDt.begin,wcdloStartDt.length());
   }
   
     /**
	 * 	Update WcdloStartDt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcdloStartDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcdloStartDt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WcdloStartDt with another Field
	 *	@param value
	 */
   public void setWcdloStartDt(Field source) {
   	replace(source,0,source.length(),wcdloStartDt.begin,wcdloStartDt.length());
   }  
   
     /**
	 * 	Update WcdloStartDt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWcdloStartDt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcdloStartDt.begin,wcdloStartDt.length());
   }
   
     /**
	 * 	Update WcdloStartDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcdloStartDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcdloStartDt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wcdloEndDt
	 *	@return wcdloEndDt
	 */   
	 public WcdloEndDt getWcdloEndDt() {
   	return wcdloEndDt;
   }
   /**
	* 	Update WcdloEndDt with the passed value
	*   Corresponding COBOL Variable is WCDLO-END-DT
	*	@param value
	*/
   public void setWcdloEndDt(char[] value) {
      wcdloEndDt.setString(value); 
   }   
    
     /**
	 * 	Update WcdloEndDt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWcdloEndDt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcdloEndDt.begin,wcdloEndDt.length());
   }
   
     /**
	 * 	Update WcdloEndDt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcdloEndDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcdloEndDt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WcdloEndDt with another Field
	 *	@param value
	 */
   public void setWcdloEndDt(Field source) {
   	replace(source,0,source.length(),wcdloEndDt.begin,wcdloEndDt.length());
   }  
   
     /**
	 * 	Update WcdloEndDt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWcdloEndDt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcdloEndDt.begin,wcdloEndDt.length());
   }
   
     /**
	 * 	Update WcdloEndDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcdloEndDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcdloEndDt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wcdloStartDtIso
	 *	@return wcdloStartDtIso
	 */
	public long getWcdloStartDtIso() throws CFException {
       if (isWcdloStartDtIsoModified()) { 
           wcdloStartDtIso = refreshWcdloStartDtIso();
        }
   		return wcdloStartDtIso;
	}
	

	
	   
	/**
	 * 	Update WcdloStartDtIso with the passed value
	 *  Corresponding COBOL Variable is WCDLO-START-DT-ISO
	 *	@param number
	 */
	public void setWcdloStartDtIso(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdloStartDtIso = checkWcdloStartDtIsoMaxLimit(number); 
		serializeWcdloStartDtIso(wcdloStartDtIso);
	}
	

	/**
	 * 	Update WcdloStartDtIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloStartDtIso(char[] value) throws CFException {
		 wcdloStartDtIso = serializeWcdloStartDtIso(value);
	}
	/**
	 * 	Update WcdloStartDtIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdloStartDtIsoString(char[] value) throws CFException {
		 setWcdloStartDtIso(value);
	}
	/**
	 *	Returns the value of wcdloEndDtIso
	 *	@return wcdloEndDtIso
	 */
	public long getWcdloEndDtIso() throws CFException {
       if (isWcdloEndDtIsoModified()) { 
           wcdloEndDtIso = refreshWcdloEndDtIso();
        }
   		return wcdloEndDtIso;
	}
	

	
	   
	/**
	 * 	Update WcdloEndDtIso with the passed value
	 *  Corresponding COBOL Variable is WCDLO-END-DT-ISO
	 *	@param number
	 */
	public void setWcdloEndDtIso(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdloEndDtIso = checkWcdloEndDtIsoMaxLimit(number); 
		serializeWcdloEndDtIso(wcdloEndDtIso);
	}
	

	/**
	 * 	Update WcdloEndDtIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloEndDtIso(char[] value) throws CFException {
		 wcdloEndDtIso = serializeWcdloEndDtIso(value);
	}
	/**
	 * 	Update WcdloEndDtIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdloEndDtIsoString(char[] value) throws CFException {
		 setWcdloEndDtIso(value);
	}
	/**
	 *	Returns the value of wcdloMonthEndDt
	 *	@return wcdloMonthEndDt
	 */   
	 public WcdloMonthEndDt getWcdloMonthEndDt() {
   	return wcdloMonthEndDt;
   }
   /**
	* 	Update WcdloMonthEndDt with the passed value
	*   Corresponding COBOL Variable is WCDLO-MONTH-END-DT
	*	@param value
	*/
   public void setWcdloMonthEndDt(char[] value) {
      wcdloMonthEndDt.setString(value); 
   }   
    
     /**
	 * 	Update WcdloMonthEndDt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWcdloMonthEndDt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcdloMonthEndDt.begin,wcdloMonthEndDt.length());
   }
   
     /**
	 * 	Update WcdloMonthEndDt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWcdloMonthEndDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcdloMonthEndDt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WcdloMonthEndDt with another Field
	 *	@param value
	 */
   public void setWcdloMonthEndDt(Field source) {
   	replace(source,0,source.length(),wcdloMonthEndDt.begin,wcdloMonthEndDt.length());
   }  
   
     /**
	 * 	Update WcdloMonthEndDt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWcdloMonthEndDt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wcdloMonthEndDt.begin,wcdloMonthEndDt.length());
   }
   
     /**
	 * 	Update WcdloMonthEndDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWcdloMonthEndDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wcdloMonthEndDt.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes WcdloDateTbl
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setWcdloBlPeriodCd((short)0);
          wcdloStartDt.initialize();
     
          wcdloEndDt.initialize();
     
                     setWcdloStartDtIso(0);
                     setWcdloEndDtIso(0);
          wcdloMonthEndDt.initialize();
     
   }

		public static int getWcdloDateTblFieldLength() {
			return WCDLO_DATE_TBL_LENGTH;
		}

}
  
