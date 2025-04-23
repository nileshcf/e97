package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50211FacData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip50211FacData extends Ip50211FacDataSerialized { 
   

						private char[] ip50211InsertTimestamp = Field.fillLowValue(26);

								private int ip50211CycleIndicator;

								private long ip50211MsgRsnCd;

								private long ip50211ChargebackAmt;

								private int ip50211ChargebackCurrCd;

						private char[] ip50211ChargebackExpCd = Field.fillLowValue(1);

						private char[] ip50211ReversalIndicator = Field.fillLowValue(1);

						private char[] ip50211ChargebackRefNo = Field.fillLowValue(10);

								private int ip50211FuncCd;

						private char[] ip50211SwitchSerialNum = Field.fillLowValue(9);

						private char[] ip50211SourceCd = Field.fillLowValue(4);

								private short ip50211CntCd;

						private char[] ip50211OrigSwSerNum = Field.fillLowValue(9);
				private Ip50211CloseDt ip50211CloseDt = new Ip50211CloseDt();

								private int ip50211ChgbkCnt;

						private char[] ip50211RejRsn1Cd = Field.fillLowValue(4);

						private char[] ip50211RejRsn2Cd = Field.fillLowValue(4);

						private char[] ip50211VrtlAcctNum = Field.fillLowValue(19);
	
	/**
	* Constructor for Ip50211FacData
	**/
    public Ip50211FacData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip50211FacData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50211FacData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip50211CloseDt.setParent(this,getStartOffset() + 89);
    } 

	/**
	 *	Returns the value of ip50211InsertTimestamp
	 *	@return ip50211InsertTimestamp
	 */
   public char[] getIp50211InsertTimestamp() throws CFException{
     if (isIp50211InsertTimestampModified()) { 
        ip50211InsertTimestamp = refreshIp50211InsertTimestamp();
     }
   		return ip50211InsertTimestamp;
   }

  
	/**
	*  set variable ip50211InsertTimestamp
	*  Corresponding COBOL Variable is IP50211-INSERT-TIMESTAMP
	*  @param value
	**/
   public void setIp50211InsertTimestamp(char[] value) {
      ip50211InsertTimestamp = checkIp50211InsertTimestampConstraints(value);
      serializeIp50211InsertTimestamp(ip50211InsertTimestamp);
   } 

     /**
	 * 	Update Ip50211InsertTimestamp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50211InsertTimestamp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50211InsertTimestamp,ip50211InsertTimestamp.length);
   	
   }
   
   public void setIp50211InsertTimestamp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211InsertTimestamp,ip50211InsertTimestamp.length);
   	
   }
   
     /**
	 * 	Update Ip50211InsertTimestamp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50211InsertTimestamp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211InsertTimestamp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50211InsertTimestamp with another Field
	 *	@param value
	 */
   public void setIp50211InsertTimestamp(Field source) {
       replace(source,0,source.length(),beginIp50211InsertTimestamp,IP_50211_INSERT_TIMESTAMP_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50211InsertTimestamp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50211InsertTimestamp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50211InsertTimestamp,IP_50211_INSERT_TIMESTAMP_LEN);
   	
   }
   
     /**
	 * 	Update Ip50211InsertTimestamp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50211InsertTimestamp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211InsertTimestamp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip50211CycleIndicator
	 *	@return ip50211CycleIndicator
	 */
	public int getIp50211CycleIndicator() throws CFException {
       if (isIp50211CycleIndicatorModified()) { 
           ip50211CycleIndicator = refreshIp50211CycleIndicator();
        }
   		return ip50211CycleIndicator;
	}
	

	
	   
	/**
	 * 	Update Ip50211CycleIndicator with the passed value
	 *  Corresponding COBOL Variable is IP50211-CYCLE-INDICATOR
	 *	@param number
	 */
	public void setIp50211CycleIndicator(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip50211CycleIndicator = checkIp50211CycleIndicatorMaxLimit(number); 
		serializeIp50211CycleIndicator(ip50211CycleIndicator);
	}
	

	public void setIp50211CycleIndicator(long number) {
	    number = checkIp50211CycleIndicatorMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp50211CycleIndicator((int)number);
	}
	
	/**
	 * 	Update Ip50211CycleIndicator with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp50211CycleIndicator(char[] value) throws CFException {
		 ip50211CycleIndicator = serializeIp50211CycleIndicator(value);
	}
	/**
	 * 	Update Ip50211CycleIndicator with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp50211CycleIndicatorString(char[] value) throws CFException {
		 setIp50211CycleIndicator(value);
	}
	/**
	 *	Returns the value of ip50211MsgRsnCd
	 *	@return ip50211MsgRsnCd
	 */
	public long getIp50211MsgRsnCd() throws CFException {
       if (isIp50211MsgRsnCdModified()) { 
           ip50211MsgRsnCd = refreshIp50211MsgRsnCd();
        }
   		return ip50211MsgRsnCd;
	}
	

	
	   
	/**
	 * 	Update Ip50211MsgRsnCd with the passed value
	 *  Corresponding COBOL Variable is IP50211-MSG-RSN-CD
	 *	@param number
	 */
	public void setIp50211MsgRsnCd(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip50211MsgRsnCd = checkIp50211MsgRsnCdMaxLimit(number); 
		serializeIp50211MsgRsnCd(ip50211MsgRsnCd);
	}
	

	/**
	 * 	Update Ip50211MsgRsnCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp50211MsgRsnCd(char[] value) throws CFException {
		 ip50211MsgRsnCd = serializeIp50211MsgRsnCd(value);
	}
	/**
	 * 	Update Ip50211MsgRsnCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp50211MsgRsnCdString(char[] value) throws CFException {
		 setIp50211MsgRsnCd(value);
	}
	/**
	 *	Returns the value of ip50211ChargebackAmt
	 *	@return ip50211ChargebackAmt
	 */
	public long getIp50211ChargebackAmt() throws CFException {
       if (isIp50211ChargebackAmtModified()) { 
           ip50211ChargebackAmt = refreshIp50211ChargebackAmt();
        }
   		return ip50211ChargebackAmt;
	}
	

	
	   
	/**
	 * 	Update Ip50211ChargebackAmt with the passed value
	 *  Corresponding COBOL Variable is IP50211-CHARGEBACK-AMT
	 *	@param number
	 */
	public void setIp50211ChargebackAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip50211ChargebackAmt = checkIp50211ChargebackAmtMaxLimit(number); 
		serializeIp50211ChargebackAmt(ip50211ChargebackAmt);
	}
	

	/**
	 * 	Update Ip50211ChargebackAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp50211ChargebackAmt(char[] value) throws CFException {
		 ip50211ChargebackAmt = serializeIp50211ChargebackAmt(value);
	}
	/**
	 * 	Update Ip50211ChargebackAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp50211ChargebackAmtString(char[] value) throws CFException {
		 setIp50211ChargebackAmt(value);
	}
	/**
	 *	Returns the value of ip50211ChargebackCurrCd
	 *	@return ip50211ChargebackCurrCd
	 */
	public int getIp50211ChargebackCurrCd() throws CFException {
       if (isIp50211ChargebackCurrCdModified()) { 
           ip50211ChargebackCurrCd = refreshIp50211ChargebackCurrCd();
        }
   		return ip50211ChargebackCurrCd;
	}
	

	
	   
	/**
	 * 	Update Ip50211ChargebackCurrCd with the passed value
	 *  Corresponding COBOL Variable is IP50211-CHARGEBACK-CURR-CD
	 *	@param number
	 */
	public void setIp50211ChargebackCurrCd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip50211ChargebackCurrCd = checkIp50211ChargebackCurrCdMaxLimit(number); 
		serializeIp50211ChargebackCurrCd(ip50211ChargebackCurrCd);
	}
	

	public void setIp50211ChargebackCurrCd(long number) {
	    number = checkIp50211ChargebackCurrCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp50211ChargebackCurrCd((int)number);
	}
	
	/**
	 * 	Update Ip50211ChargebackCurrCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp50211ChargebackCurrCd(char[] value) throws CFException {
		 ip50211ChargebackCurrCd = serializeIp50211ChargebackCurrCd(value);
	}
	/**
	 * 	Update Ip50211ChargebackCurrCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp50211ChargebackCurrCdString(char[] value) throws CFException {
		 setIp50211ChargebackCurrCd(value);
	}
	/**
	 *	Returns the value of ip50211ChargebackExpCd
	 *	@return ip50211ChargebackExpCd
	 */
   public char[] getIp50211ChargebackExpCd() throws CFException{
     if (isIp50211ChargebackExpCdModified()) { 
        ip50211ChargebackExpCd = refreshIp50211ChargebackExpCd();
     }
   		return ip50211ChargebackExpCd;
   }

  
	/**
	*  set variable ip50211ChargebackExpCd
	*  Corresponding COBOL Variable is IP50211-CHARGEBACK-EXP-CD
	*  @param value
	**/
   public void setIp50211ChargebackExpCd(char[] value) {
      ip50211ChargebackExpCd = checkIp50211ChargebackExpCdConstraints(value);
      serializeIp50211ChargebackExpCd(ip50211ChargebackExpCd);
   } 

     /**
	 * 	Update Ip50211ChargebackExpCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50211ChargebackExpCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50211ChargebackExpCd,ip50211ChargebackExpCd.length);
   	
   }
   
   public void setIp50211ChargebackExpCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211ChargebackExpCd,ip50211ChargebackExpCd.length);
   	
   }
   
     /**
	 * 	Update Ip50211ChargebackExpCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50211ChargebackExpCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211ChargebackExpCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50211ChargebackExpCd with another Field
	 *	@param value
	 */
   public void setIp50211ChargebackExpCd(Field source) {
       replace(source,0,source.length(),beginIp50211ChargebackExpCd,IP_50211_CHARGEBACK_EXP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50211ChargebackExpCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50211ChargebackExpCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50211ChargebackExpCd,IP_50211_CHARGEBACK_EXP_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip50211ChargebackExpCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50211ChargebackExpCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211ChargebackExpCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip50211ReversalIndicator
	 *	@return ip50211ReversalIndicator
	 */
   public char[] getIp50211ReversalIndicator() throws CFException{
     if (isIp50211ReversalIndicatorModified()) { 
        ip50211ReversalIndicator = refreshIp50211ReversalIndicator();
     }
   		return ip50211ReversalIndicator;
   }

  
	/**
	*  set variable ip50211ReversalIndicator
	*  Corresponding COBOL Variable is IP50211-REVERSAL-INDICATOR
	*  @param value
	**/
   public void setIp50211ReversalIndicator(char[] value) {
      ip50211ReversalIndicator = checkIp50211ReversalIndicatorConstraints(value);
      serializeIp50211ReversalIndicator(ip50211ReversalIndicator);
   } 

     /**
	 * 	Update Ip50211ReversalIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50211ReversalIndicator(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50211ReversalIndicator,ip50211ReversalIndicator.length);
   	
   }
   
   public void setIp50211ReversalIndicator(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211ReversalIndicator,ip50211ReversalIndicator.length);
   	
   }
   
     /**
	 * 	Update Ip50211ReversalIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50211ReversalIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211ReversalIndicator+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50211ReversalIndicator with another Field
	 *	@param value
	 */
   public void setIp50211ReversalIndicator(Field source) {
       replace(source,0,source.length(),beginIp50211ReversalIndicator,IP_50211_REVERSAL_INDICATOR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50211ReversalIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50211ReversalIndicator(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50211ReversalIndicator,IP_50211_REVERSAL_INDICATOR_LEN);
   	
   }
   
     /**
	 * 	Update Ip50211ReversalIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50211ReversalIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211ReversalIndicator+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip50211ChargebackRefNo
	 *	@return ip50211ChargebackRefNo
	 */
   public char[] getIp50211ChargebackRefNo() throws CFException{
     if (isIp50211ChargebackRefNoModified()) { 
        ip50211ChargebackRefNo = refreshIp50211ChargebackRefNo();
     }
   		return ip50211ChargebackRefNo;
   }

  
	/**
	*  set variable ip50211ChargebackRefNo
	*  Corresponding COBOL Variable is IP50211-CHARGEBACK-REF-NO
	*  @param value
	**/
   public void setIp50211ChargebackRefNo(char[] value) {
      ip50211ChargebackRefNo = checkIp50211ChargebackRefNoConstraints(value);
      serializeIp50211ChargebackRefNo(ip50211ChargebackRefNo);
   } 

     /**
	 * 	Update Ip50211ChargebackRefNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50211ChargebackRefNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50211ChargebackRefNo,ip50211ChargebackRefNo.length);
   	
   }
   
   public void setIp50211ChargebackRefNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211ChargebackRefNo,ip50211ChargebackRefNo.length);
   	
   }
   
     /**
	 * 	Update Ip50211ChargebackRefNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50211ChargebackRefNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211ChargebackRefNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50211ChargebackRefNo with another Field
	 *	@param value
	 */
   public void setIp50211ChargebackRefNo(Field source) {
       replace(source,0,source.length(),beginIp50211ChargebackRefNo,IP_50211_CHARGEBACK_REF_NO_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50211ChargebackRefNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50211ChargebackRefNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50211ChargebackRefNo,IP_50211_CHARGEBACK_REF_NO_LEN);
   	
   }
   
     /**
	 * 	Update Ip50211ChargebackRefNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50211ChargebackRefNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211ChargebackRefNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip50211FuncCd
	 *	@return ip50211FuncCd
	 */
	public int getIp50211FuncCd() throws CFException {
       if (isIp50211FuncCdModified()) { 
           ip50211FuncCd = refreshIp50211FuncCd();
        }
   		return ip50211FuncCd;
	}
	

	
	   
	/**
	 * 	Update Ip50211FuncCd with the passed value
	 *  Corresponding COBOL Variable is IP50211-FUNC-CD
	 *	@param number
	 */
	public void setIp50211FuncCd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip50211FuncCd = checkIp50211FuncCdMaxLimit(number); 
		serializeIp50211FuncCd(ip50211FuncCd);
	}
	

	public void setIp50211FuncCd(long number) {
	    number = checkIp50211FuncCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp50211FuncCd((int)number);
	}
	
	/**
	 * 	Update Ip50211FuncCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp50211FuncCd(char[] value) throws CFException {
		 ip50211FuncCd = serializeIp50211FuncCd(value);
	}
	/**
	 * 	Update Ip50211FuncCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp50211FuncCdString(char[] value) throws CFException {
		 setIp50211FuncCd(value);
	}
	/**
	 *	Returns the value of ip50211SwitchSerialNum
	 *	@return ip50211SwitchSerialNum
	 */
   public char[] getIp50211SwitchSerialNum() throws CFException{
     if (isIp50211SwitchSerialNumModified()) { 
        ip50211SwitchSerialNum = refreshIp50211SwitchSerialNum();
     }
   		return ip50211SwitchSerialNum;
   }

  
	/**
	*  set variable ip50211SwitchSerialNum
	*  Corresponding COBOL Variable is IP50211-SWITCH-SERIAL-NUM
	*  @param value
	**/
   public void setIp50211SwitchSerialNum(char[] value) {
      ip50211SwitchSerialNum = checkIp50211SwitchSerialNumConstraints(value);
      serializeIp50211SwitchSerialNum(ip50211SwitchSerialNum);
   } 

     /**
	 * 	Update Ip50211SwitchSerialNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50211SwitchSerialNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50211SwitchSerialNum,ip50211SwitchSerialNum.length);
   	
   }
   
   public void setIp50211SwitchSerialNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211SwitchSerialNum,ip50211SwitchSerialNum.length);
   	
   }
   
     /**
	 * 	Update Ip50211SwitchSerialNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50211SwitchSerialNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211SwitchSerialNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50211SwitchSerialNum with another Field
	 *	@param value
	 */
   public void setIp50211SwitchSerialNum(Field source) {
       replace(source,0,source.length(),beginIp50211SwitchSerialNum,IP_50211_SWITCH_SERIAL_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50211SwitchSerialNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50211SwitchSerialNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50211SwitchSerialNum,IP_50211_SWITCH_SERIAL_NUM_LEN);
   	
   }
   
     /**
	 * 	Update Ip50211SwitchSerialNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50211SwitchSerialNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211SwitchSerialNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip50211SourceCd
	 *	@return ip50211SourceCd
	 */
   public char[] getIp50211SourceCd() throws CFException{
     if (isIp50211SourceCdModified()) { 
        ip50211SourceCd = refreshIp50211SourceCd();
     }
   		return ip50211SourceCd;
   }

  
	/**
	*  set variable ip50211SourceCd
	*  Corresponding COBOL Variable is IP50211-SOURCE-CD
	*  @param value
	**/
   public void setIp50211SourceCd(char[] value) {
      ip50211SourceCd = checkIp50211SourceCdConstraints(value);
      serializeIp50211SourceCd(ip50211SourceCd);
   } 

     /**
	 * 	Update Ip50211SourceCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50211SourceCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50211SourceCd,ip50211SourceCd.length);
   	
   }
   
   public void setIp50211SourceCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211SourceCd,ip50211SourceCd.length);
   	
   }
   
     /**
	 * 	Update Ip50211SourceCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50211SourceCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211SourceCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50211SourceCd with another Field
	 *	@param value
	 */
   public void setIp50211SourceCd(Field source) {
       replace(source,0,source.length(),beginIp50211SourceCd,IP_50211_SOURCE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50211SourceCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50211SourceCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50211SourceCd,IP_50211_SOURCE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip50211SourceCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50211SourceCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211SourceCd+targetIndex,targetLen);
    
   }
	public short getIp50211CntCd() throws CFException {
        if (isIp50211CntCdModified()) { 
           ip50211CntCd = refreshIp50211CntCd();
        }
   		return ip50211CntCd;
	}
	
	/**
	 * 	Update Ip50211CntCd with the passed value
	 *  Corresponding COBOL Variable is IP50211-CNT-CD
	 *	@param number
	 */
	public void setIp50211CntCd(short number) {
			ip50211CntCd = checkIp50211CntCdMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeIp50211CntCd(ip50211CntCd);
	}

	public void setIp50211CntCd(int number) {
	    number = checkIp50211CntCdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp50211CntCd((short)number);
	}
	public void setIp50211CntCd(long number) {
	    number = checkIp50211CntCdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp50211CntCd((short)number);
	}
	

	/**
	 *	Returns the value of ip50211OrigSwSerNum
	 *	@return ip50211OrigSwSerNum
	 */
   public char[] getIp50211OrigSwSerNum() throws CFException{
     if (isIp50211OrigSwSerNumModified()) { 
        ip50211OrigSwSerNum = refreshIp50211OrigSwSerNum();
     }
   		return ip50211OrigSwSerNum;
   }

  
	/**
	*  set variable ip50211OrigSwSerNum
	*  Corresponding COBOL Variable is IP50211-ORIG-SW-SER-NUM
	*  @param value
	**/
   public void setIp50211OrigSwSerNum(char[] value) {
      ip50211OrigSwSerNum = checkIp50211OrigSwSerNumConstraints(value);
      serializeIp50211OrigSwSerNum(ip50211OrigSwSerNum);
   } 

     /**
	 * 	Update Ip50211OrigSwSerNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50211OrigSwSerNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50211OrigSwSerNum,ip50211OrigSwSerNum.length);
   	
   }
   
   public void setIp50211OrigSwSerNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211OrigSwSerNum,ip50211OrigSwSerNum.length);
   	
   }
   
     /**
	 * 	Update Ip50211OrigSwSerNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50211OrigSwSerNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211OrigSwSerNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50211OrigSwSerNum with another Field
	 *	@param value
	 */
   public void setIp50211OrigSwSerNum(Field source) {
       replace(source,0,source.length(),beginIp50211OrigSwSerNum,IP_50211_ORIG_SW_SER_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50211OrigSwSerNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50211OrigSwSerNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50211OrigSwSerNum,IP_50211_ORIG_SW_SER_NUM_LEN);
   	
   }
   
     /**
	 * 	Update Ip50211OrigSwSerNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50211OrigSwSerNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211OrigSwSerNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip50211CloseDt
	 *	@return ip50211CloseDt
	 */   
	 public Ip50211CloseDt getIp50211CloseDt() {
   	return ip50211CloseDt;
   }
   /**
	* 	Update Ip50211CloseDt with the passed value
	*   Corresponding COBOL Variable is IP50211-CLOSE-DT
	*	@param value
	*/
   public void setIp50211CloseDt(char[] value) {
      ip50211CloseDt.setString(value); 
   }   
    
     /**
	 * 	Update Ip50211CloseDt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50211CloseDt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50211CloseDt.begin,ip50211CloseDt.length());
   }
   
     /**
	 * 	Update Ip50211CloseDt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50211CloseDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50211CloseDt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip50211CloseDt with another Field
	 *	@param value
	 */
   public void setIp50211CloseDt(Field source) {
   	replace(source,0,source.length(),ip50211CloseDt.begin,ip50211CloseDt.length());
   }  
   
     /**
	 * 	Update Ip50211CloseDt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50211CloseDt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50211CloseDt.begin,ip50211CloseDt.length());
   }
   
     /**
	 * 	Update Ip50211CloseDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50211CloseDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50211CloseDt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip50211ChgbkCnt
	 *	@return ip50211ChgbkCnt
	 */
	public int getIp50211ChgbkCnt() throws CFException {
       if (isIp50211ChgbkCntModified()) { 
           ip50211ChgbkCnt = refreshIp50211ChgbkCnt();
        }
   		return ip50211ChgbkCnt;
	}
	

	
	   
	/**
	 * 	Update Ip50211ChgbkCnt with the passed value
	 *  Corresponding COBOL Variable is IP50211-CHGBK-CNT
	 *	@param number
	 */
	public void setIp50211ChgbkCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip50211ChgbkCnt = checkIp50211ChgbkCntMaxLimit(number); 
		serializeIp50211ChgbkCnt(ip50211ChgbkCnt);
	}
	

	public void setIp50211ChgbkCnt(long number) {
	    number = checkIp50211ChgbkCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp50211ChgbkCnt((int)number);
	}
	
	/**
	 * 	Update Ip50211ChgbkCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp50211ChgbkCnt(char[] value) throws CFException {
		 ip50211ChgbkCnt = serializeIp50211ChgbkCnt(value);
	}
	/**
	 * 	Update Ip50211ChgbkCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp50211ChgbkCntString(char[] value) throws CFException {
		 setIp50211ChgbkCnt(value);
	}
	/**
	 *	Returns the value of ip50211RejRsn1Cd
	 *	@return ip50211RejRsn1Cd
	 */
   public char[] getIp50211RejRsn1Cd() throws CFException{
     if (isIp50211RejRsn1CdModified()) { 
        ip50211RejRsn1Cd = refreshIp50211RejRsn1Cd();
     }
   		return ip50211RejRsn1Cd;
   }

  
	/**
	*  set variable ip50211RejRsn1Cd
	*  Corresponding COBOL Variable is IP50211-REJ-RSN-1-CD
	*  @param value
	**/
   public void setIp50211RejRsn1Cd(char[] value) {
      ip50211RejRsn1Cd = checkIp50211RejRsn1CdConstraints(value);
      serializeIp50211RejRsn1Cd(ip50211RejRsn1Cd);
   } 

     /**
	 * 	Update Ip50211RejRsn1Cd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50211RejRsn1Cd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50211RejRsn1Cd,ip50211RejRsn1Cd.length);
   	
   }
   
   public void setIp50211RejRsn1Cd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211RejRsn1Cd,ip50211RejRsn1Cd.length);
   	
   }
   
     /**
	 * 	Update Ip50211RejRsn1Cd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50211RejRsn1Cd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211RejRsn1Cd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50211RejRsn1Cd with another Field
	 *	@param value
	 */
   public void setIp50211RejRsn1Cd(Field source) {
       replace(source,0,source.length(),beginIp50211RejRsn1Cd,IP_50211_REJ_RSN_1_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50211RejRsn1Cd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50211RejRsn1Cd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50211RejRsn1Cd,IP_50211_REJ_RSN_1_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip50211RejRsn1Cd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50211RejRsn1Cd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211RejRsn1Cd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip50211RejRsn2Cd
	 *	@return ip50211RejRsn2Cd
	 */
   public char[] getIp50211RejRsn2Cd() throws CFException{
     if (isIp50211RejRsn2CdModified()) { 
        ip50211RejRsn2Cd = refreshIp50211RejRsn2Cd();
     }
   		return ip50211RejRsn2Cd;
   }

  
	/**
	*  set variable ip50211RejRsn2Cd
	*  Corresponding COBOL Variable is IP50211-REJ-RSN-2-CD
	*  @param value
	**/
   public void setIp50211RejRsn2Cd(char[] value) {
      ip50211RejRsn2Cd = checkIp50211RejRsn2CdConstraints(value);
      serializeIp50211RejRsn2Cd(ip50211RejRsn2Cd);
   } 

     /**
	 * 	Update Ip50211RejRsn2Cd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50211RejRsn2Cd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50211RejRsn2Cd,ip50211RejRsn2Cd.length);
   	
   }
   
   public void setIp50211RejRsn2Cd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211RejRsn2Cd,ip50211RejRsn2Cd.length);
   	
   }
   
     /**
	 * 	Update Ip50211RejRsn2Cd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50211RejRsn2Cd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211RejRsn2Cd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50211RejRsn2Cd with another Field
	 *	@param value
	 */
   public void setIp50211RejRsn2Cd(Field source) {
       replace(source,0,source.length(),beginIp50211RejRsn2Cd,IP_50211_REJ_RSN_2_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50211RejRsn2Cd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50211RejRsn2Cd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50211RejRsn2Cd,IP_50211_REJ_RSN_2_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip50211RejRsn2Cd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50211RejRsn2Cd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211RejRsn2Cd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip50211VrtlAcctNum
	 *	@return ip50211VrtlAcctNum
	 */
   public char[] getIp50211VrtlAcctNum() throws CFException{
     if (isIp50211VrtlAcctNumModified()) { 
        ip50211VrtlAcctNum = refreshIp50211VrtlAcctNum();
     }
   		return ip50211VrtlAcctNum;
   }

  
	/**
	*  set variable ip50211VrtlAcctNum
	*  Corresponding COBOL Variable is IP50211-VRTL-ACCT-NUM
	*  @param value
	**/
   public void setIp50211VrtlAcctNum(char[] value) {
      ip50211VrtlAcctNum = checkIp50211VrtlAcctNumConstraints(value);
      serializeIp50211VrtlAcctNum(ip50211VrtlAcctNum);
   } 

     /**
	 * 	Update Ip50211VrtlAcctNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp50211VrtlAcctNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp50211VrtlAcctNum,ip50211VrtlAcctNum.length);
   	
   }
   
   public void setIp50211VrtlAcctNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211VrtlAcctNum,ip50211VrtlAcctNum.length);
   	
   }
   
     /**
	 * 	Update Ip50211VrtlAcctNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50211VrtlAcctNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211VrtlAcctNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip50211VrtlAcctNum with another Field
	 *	@param value
	 */
   public void setIp50211VrtlAcctNum(Field source) {
       replace(source,0,source.length(),beginIp50211VrtlAcctNum,IP_50211_VRTL_ACCT_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip50211VrtlAcctNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp50211VrtlAcctNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp50211VrtlAcctNum,IP_50211_VRTL_ACCT_NUM_LEN);
   	
   }
   
     /**
	 * 	Update Ip50211VrtlAcctNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50211VrtlAcctNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp50211VrtlAcctNum+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip50211FacData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp50211InsertTimestamp(CONSTANTS.SPACE_26);
                     setIp50211CycleIndicator(0);
                     setIp50211MsgRsnCd(0);
                     setIp50211ChargebackAmt(0);
                     setIp50211ChargebackCurrCd(0);
         setIp50211ChargebackExpCd(CONSTANTS.SPACE);
         setIp50211ReversalIndicator(CONSTANTS.SPACE);
         setIp50211ChargebackRefNo(CONSTANTS.SPACE_10);
                     setIp50211FuncCd(0);
         setIp50211SwitchSerialNum(CONSTANTS.SPACE_9);
         setIp50211SourceCd(CONSTANTS.SPACE_4);
         	setIp50211CntCd((short)0);
         setIp50211OrigSwSerNum(CONSTANTS.SPACE_9);
          ip50211CloseDt.initialize();
     
                     setIp50211ChgbkCnt(0);
         setIp50211RejRsn1Cd(CONSTANTS.SPACE_4);
         setIp50211RejRsn2Cd(CONSTANTS.SPACE_4);
         setIp50211VrtlAcctNum(CONSTANTS.SPACE_19);
   }

		public static int getIp50211FacDataFieldLength() {
			return IP_50211_FAC_DATA_LENGTH;
		}

}
  
