package com.cloudframe.app.ip829010.dto;

/**
*  The class Ip82921FacData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:02. using version 5.0.0.256
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip82921FacData extends Ip82921FacDataSerialized { 
   

						private char[] ip82921InsertTimestamp = Field.fillLowValue(26);

								private int ip82921CycleIndicator;

								private long ip82921MsgRsnCd;

								private long ip82921ChargebackAmt;

								private int ip82921ChargebackCurrCd;

						private char[] ip82921ChargebackExpCd = Field.fillLowValue(1);

						private char[] ip82921ReversalIndicator = Field.fillLowValue(1);

						private char[] ip82921ChargebackRefNo = Field.fillLowValue(10);

								private int ip82921FuncCd;

						private char[] ip82921SwitchSerialNum = Field.fillLowValue(9);

						private char[] ip82921SourceCd = Field.fillLowValue(4);

								private short ip82921CntCd;

						private char[] ip82921OrigSwSerNum = Field.fillLowValue(9);
				private Ip82921CloseDt ip82921CloseDt = new Ip82921CloseDt();

								private int ip82921ChgbkCnt;

						private char[] ip82921RejRsn1Cd = Field.fillLowValue(4);

						private char[] ip82921RejRsn2Cd = Field.fillLowValue(4);

						private char[] ip82921VrtlAcctNum = Field.fillLowValue(19);
	
	/**
	* Constructor for Ip82921FacData
	**/
    public Ip82921FacData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip82921FacData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip82921FacData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip82921CloseDt.setParent(this,getStartOffset() + 89);
    } 

	/**
	 *	Returns the value of ip82921InsertTimestamp
	 *	@return ip82921InsertTimestamp
	 */
   public char[] getIp82921InsertTimestamp() throws CFException{
     if (isIp82921InsertTimestampModified()) { 
        ip82921InsertTimestamp = refreshIp82921InsertTimestamp();
     }
   		return ip82921InsertTimestamp;
   }

  
	/**
	*  set variable ip82921InsertTimestamp
	*  Corresponding COBOL Variable is IP82921-INSERT-TIMESTAMP
	*  @param value
	**/
   public void setIp82921InsertTimestamp(char[] value) {
      ip82921InsertTimestamp = checkIp82921InsertTimestampConstraints(value);
      serializeIp82921InsertTimestamp(ip82921InsertTimestamp);
   } 

     /**
	 * 	Update Ip82921InsertTimestamp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921InsertTimestamp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp82921InsertTimestamp,ip82921InsertTimestamp.length);
   	
   }
   
   public void setIp82921InsertTimestamp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921InsertTimestamp,ip82921InsertTimestamp.length);
   	
   }
   
     /**
	 * 	Update Ip82921InsertTimestamp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921InsertTimestamp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921InsertTimestamp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip82921InsertTimestamp with another Field
	 *	@param value
	 */
   public void setIp82921InsertTimestamp(Field source) {
       replace(source,0,source.length(),beginIp82921InsertTimestamp,IP_82921_INSERT_TIMESTAMP_LEN);
   	
   }  
   
     /**
	 * 	Update Ip82921InsertTimestamp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921InsertTimestamp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp82921InsertTimestamp,IP_82921_INSERT_TIMESTAMP_LEN);
   	
   }
   
     /**
	 * 	Update Ip82921InsertTimestamp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921InsertTimestamp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921InsertTimestamp+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip82921CycleIndicator
	 *	@return ip82921CycleIndicator
	 */
	public int getIp82921CycleIndicator() throws CFException {
       if (isIp82921CycleIndicatorModified()) { 
           ip82921CycleIndicator = refreshIp82921CycleIndicator();
        }
   		return ip82921CycleIndicator;
	}
	

	
	   
	/**
	 * 	Update Ip82921CycleIndicator with the passed value
	 *  Corresponding COBOL Variable is IP82921-CYCLE-INDICATOR
	 *	@param number
	 */
	public void setIp82921CycleIndicator(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip82921CycleIndicator = checkIp82921CycleIndicatorMaxLimit(number); 
		serializeIp82921CycleIndicator(ip82921CycleIndicator);
	}
	

	public void setIp82921CycleIndicator(long number) {
	    number = checkIp82921CycleIndicatorMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp82921CycleIndicator((int)number);
	}
	
	/**
	 * 	Update Ip82921CycleIndicator with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp82921CycleIndicator(char[] value) throws CFException {
		 ip82921CycleIndicator = serializeIp82921CycleIndicator(value);
	}
	/**
	 * 	Update Ip82921CycleIndicator with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp82921CycleIndicatorString(char[] value) throws CFException {
		 setIp82921CycleIndicator(value);
	}
	/**
	 *	Returns the value of ip82921MsgRsnCd
	 *	@return ip82921MsgRsnCd
	 */
	public long getIp82921MsgRsnCd() throws CFException {
       if (isIp82921MsgRsnCdModified()) { 
           ip82921MsgRsnCd = refreshIp82921MsgRsnCd();
        }
   		return ip82921MsgRsnCd;
	}
	

	
	   
	/**
	 * 	Update Ip82921MsgRsnCd with the passed value
	 *  Corresponding COBOL Variable is IP82921-MSG-RSN-CD
	 *	@param number
	 */
	public void setIp82921MsgRsnCd(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip82921MsgRsnCd = checkIp82921MsgRsnCdMaxLimit(number); 
		serializeIp82921MsgRsnCd(ip82921MsgRsnCd);
	}
	

	/**
	 * 	Update Ip82921MsgRsnCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp82921MsgRsnCd(char[] value) throws CFException {
		 ip82921MsgRsnCd = serializeIp82921MsgRsnCd(value);
	}
	/**
	 * 	Update Ip82921MsgRsnCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp82921MsgRsnCdString(char[] value) throws CFException {
		 setIp82921MsgRsnCd(value);
	}
	/**
	 *	Returns the value of ip82921ChargebackAmt
	 *	@return ip82921ChargebackAmt
	 */
	public long getIp82921ChargebackAmt() throws CFException {
       if (isIp82921ChargebackAmtModified()) { 
           ip82921ChargebackAmt = refreshIp82921ChargebackAmt();
        }
   		return ip82921ChargebackAmt;
	}
	

	
	   
	/**
	 * 	Update Ip82921ChargebackAmt with the passed value
	 *  Corresponding COBOL Variable is IP82921-CHARGEBACK-AMT
	 *	@param number
	 */
	public void setIp82921ChargebackAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip82921ChargebackAmt = checkIp82921ChargebackAmtMaxLimit(number); 
		serializeIp82921ChargebackAmt(ip82921ChargebackAmt);
	}
	

	/**
	 * 	Update Ip82921ChargebackAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp82921ChargebackAmt(char[] value) throws CFException {
		 ip82921ChargebackAmt = serializeIp82921ChargebackAmt(value);
	}
	/**
	 * 	Update Ip82921ChargebackAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp82921ChargebackAmtString(char[] value) throws CFException {
		 setIp82921ChargebackAmt(value);
	}
	/**
	 *	Returns the value of ip82921ChargebackCurrCd
	 *	@return ip82921ChargebackCurrCd
	 */
	public int getIp82921ChargebackCurrCd() throws CFException {
       if (isIp82921ChargebackCurrCdModified()) { 
           ip82921ChargebackCurrCd = refreshIp82921ChargebackCurrCd();
        }
   		return ip82921ChargebackCurrCd;
	}
	

	
	   
	/**
	 * 	Update Ip82921ChargebackCurrCd with the passed value
	 *  Corresponding COBOL Variable is IP82921-CHARGEBACK-CURR-CD
	 *	@param number
	 */
	public void setIp82921ChargebackCurrCd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip82921ChargebackCurrCd = checkIp82921ChargebackCurrCdMaxLimit(number); 
		serializeIp82921ChargebackCurrCd(ip82921ChargebackCurrCd);
	}
	

	public void setIp82921ChargebackCurrCd(long number) {
	    number = checkIp82921ChargebackCurrCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp82921ChargebackCurrCd((int)number);
	}
	
	/**
	 * 	Update Ip82921ChargebackCurrCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp82921ChargebackCurrCd(char[] value) throws CFException {
		 ip82921ChargebackCurrCd = serializeIp82921ChargebackCurrCd(value);
	}
	/**
	 * 	Update Ip82921ChargebackCurrCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp82921ChargebackCurrCdString(char[] value) throws CFException {
		 setIp82921ChargebackCurrCd(value);
	}
	/**
	 *	Returns the value of ip82921ChargebackExpCd
	 *	@return ip82921ChargebackExpCd
	 */
   public char[] getIp82921ChargebackExpCd() throws CFException{
     if (isIp82921ChargebackExpCdModified()) { 
        ip82921ChargebackExpCd = refreshIp82921ChargebackExpCd();
     }
   		return ip82921ChargebackExpCd;
   }

  
	/**
	*  set variable ip82921ChargebackExpCd
	*  Corresponding COBOL Variable is IP82921-CHARGEBACK-EXP-CD
	*  @param value
	**/
   public void setIp82921ChargebackExpCd(char[] value) {
      ip82921ChargebackExpCd = checkIp82921ChargebackExpCdConstraints(value);
      serializeIp82921ChargebackExpCd(ip82921ChargebackExpCd);
   } 

     /**
	 * 	Update Ip82921ChargebackExpCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921ChargebackExpCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp82921ChargebackExpCd,ip82921ChargebackExpCd.length);
   	
   }
   
   public void setIp82921ChargebackExpCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ChargebackExpCd,ip82921ChargebackExpCd.length);
   	
   }
   
     /**
	 * 	Update Ip82921ChargebackExpCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ChargebackExpCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ChargebackExpCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip82921ChargebackExpCd with another Field
	 *	@param value
	 */
   public void setIp82921ChargebackExpCd(Field source) {
       replace(source,0,source.length(),beginIp82921ChargebackExpCd,IP_82921_CHARGEBACK_EXP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip82921ChargebackExpCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921ChargebackExpCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp82921ChargebackExpCd,IP_82921_CHARGEBACK_EXP_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip82921ChargebackExpCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ChargebackExpCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ChargebackExpCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip82921ReversalIndicator
	 *	@return ip82921ReversalIndicator
	 */
   public char[] getIp82921ReversalIndicator() throws CFException{
     if (isIp82921ReversalIndicatorModified()) { 
        ip82921ReversalIndicator = refreshIp82921ReversalIndicator();
     }
   		return ip82921ReversalIndicator;
   }

  
	/**
	*  set variable ip82921ReversalIndicator
	*  Corresponding COBOL Variable is IP82921-REVERSAL-INDICATOR
	*  @param value
	**/
   public void setIp82921ReversalIndicator(char[] value) {
      ip82921ReversalIndicator = checkIp82921ReversalIndicatorConstraints(value);
      serializeIp82921ReversalIndicator(ip82921ReversalIndicator);
   } 

     /**
	 * 	Update Ip82921ReversalIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921ReversalIndicator(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp82921ReversalIndicator,ip82921ReversalIndicator.length);
   	
   }
   
   public void setIp82921ReversalIndicator(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ReversalIndicator,ip82921ReversalIndicator.length);
   	
   }
   
     /**
	 * 	Update Ip82921ReversalIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ReversalIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ReversalIndicator+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip82921ReversalIndicator with another Field
	 *	@param value
	 */
   public void setIp82921ReversalIndicator(Field source) {
       replace(source,0,source.length(),beginIp82921ReversalIndicator,IP_82921_REVERSAL_INDICATOR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip82921ReversalIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921ReversalIndicator(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp82921ReversalIndicator,IP_82921_REVERSAL_INDICATOR_LEN);
   	
   }
   
     /**
	 * 	Update Ip82921ReversalIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ReversalIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ReversalIndicator+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip82921ChargebackRefNo
	 *	@return ip82921ChargebackRefNo
	 */
   public char[] getIp82921ChargebackRefNo() throws CFException{
     if (isIp82921ChargebackRefNoModified()) { 
        ip82921ChargebackRefNo = refreshIp82921ChargebackRefNo();
     }
   		return ip82921ChargebackRefNo;
   }

  
	/**
	*  set variable ip82921ChargebackRefNo
	*  Corresponding COBOL Variable is IP82921-CHARGEBACK-REF-NO
	*  @param value
	**/
   public void setIp82921ChargebackRefNo(char[] value) {
      ip82921ChargebackRefNo = checkIp82921ChargebackRefNoConstraints(value);
      serializeIp82921ChargebackRefNo(ip82921ChargebackRefNo);
   } 

     /**
	 * 	Update Ip82921ChargebackRefNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921ChargebackRefNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp82921ChargebackRefNo,ip82921ChargebackRefNo.length);
   	
   }
   
   public void setIp82921ChargebackRefNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ChargebackRefNo,ip82921ChargebackRefNo.length);
   	
   }
   
     /**
	 * 	Update Ip82921ChargebackRefNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ChargebackRefNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ChargebackRefNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip82921ChargebackRefNo with another Field
	 *	@param value
	 */
   public void setIp82921ChargebackRefNo(Field source) {
       replace(source,0,source.length(),beginIp82921ChargebackRefNo,IP_82921_CHARGEBACK_REF_NO_LEN);
   	
   }  
   
     /**
	 * 	Update Ip82921ChargebackRefNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921ChargebackRefNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp82921ChargebackRefNo,IP_82921_CHARGEBACK_REF_NO_LEN);
   	
   }
   
     /**
	 * 	Update Ip82921ChargebackRefNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921ChargebackRefNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921ChargebackRefNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip82921FuncCd
	 *	@return ip82921FuncCd
	 */
	public int getIp82921FuncCd() throws CFException {
       if (isIp82921FuncCdModified()) { 
           ip82921FuncCd = refreshIp82921FuncCd();
        }
   		return ip82921FuncCd;
	}
	

	
	   
	/**
	 * 	Update Ip82921FuncCd with the passed value
	 *  Corresponding COBOL Variable is IP82921-FUNC-CD
	 *	@param number
	 */
	public void setIp82921FuncCd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip82921FuncCd = checkIp82921FuncCdMaxLimit(number); 
		serializeIp82921FuncCd(ip82921FuncCd);
	}
	

	public void setIp82921FuncCd(long number) {
	    number = checkIp82921FuncCdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp82921FuncCd((int)number);
	}
	
	/**
	 * 	Update Ip82921FuncCd with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp82921FuncCd(char[] value) throws CFException {
		 ip82921FuncCd = serializeIp82921FuncCd(value);
	}
	/**
	 * 	Update Ip82921FuncCd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp82921FuncCdString(char[] value) throws CFException {
		 setIp82921FuncCd(value);
	}
	/**
	 *	Returns the value of ip82921SwitchSerialNum
	 *	@return ip82921SwitchSerialNum
	 */
   public char[] getIp82921SwitchSerialNum() throws CFException{
     if (isIp82921SwitchSerialNumModified()) { 
        ip82921SwitchSerialNum = refreshIp82921SwitchSerialNum();
     }
   		return ip82921SwitchSerialNum;
   }

  
	/**
	*  set variable ip82921SwitchSerialNum
	*  Corresponding COBOL Variable is IP82921-SWITCH-SERIAL-NUM
	*  @param value
	**/
   public void setIp82921SwitchSerialNum(char[] value) {
      ip82921SwitchSerialNum = checkIp82921SwitchSerialNumConstraints(value);
      serializeIp82921SwitchSerialNum(ip82921SwitchSerialNum);
   } 

     /**
	 * 	Update Ip82921SwitchSerialNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921SwitchSerialNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp82921SwitchSerialNum,ip82921SwitchSerialNum.length);
   	
   }
   
   public void setIp82921SwitchSerialNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921SwitchSerialNum,ip82921SwitchSerialNum.length);
   	
   }
   
     /**
	 * 	Update Ip82921SwitchSerialNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921SwitchSerialNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921SwitchSerialNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip82921SwitchSerialNum with another Field
	 *	@param value
	 */
   public void setIp82921SwitchSerialNum(Field source) {
       replace(source,0,source.length(),beginIp82921SwitchSerialNum,IP_82921_SWITCH_SERIAL_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip82921SwitchSerialNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921SwitchSerialNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp82921SwitchSerialNum,IP_82921_SWITCH_SERIAL_NUM_LEN);
   	
   }
   
     /**
	 * 	Update Ip82921SwitchSerialNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921SwitchSerialNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921SwitchSerialNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip82921SourceCd
	 *	@return ip82921SourceCd
	 */
   public char[] getIp82921SourceCd() throws CFException{
     if (isIp82921SourceCdModified()) { 
        ip82921SourceCd = refreshIp82921SourceCd();
     }
   		return ip82921SourceCd;
   }

  
	/**
	*  set variable ip82921SourceCd
	*  Corresponding COBOL Variable is IP82921-SOURCE-CD
	*  @param value
	**/
   public void setIp82921SourceCd(char[] value) {
      ip82921SourceCd = checkIp82921SourceCdConstraints(value);
      serializeIp82921SourceCd(ip82921SourceCd);
   } 

     /**
	 * 	Update Ip82921SourceCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921SourceCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp82921SourceCd,ip82921SourceCd.length);
   	
   }
   
   public void setIp82921SourceCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921SourceCd,ip82921SourceCd.length);
   	
   }
   
     /**
	 * 	Update Ip82921SourceCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921SourceCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921SourceCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip82921SourceCd with another Field
	 *	@param value
	 */
   public void setIp82921SourceCd(Field source) {
       replace(source,0,source.length(),beginIp82921SourceCd,IP_82921_SOURCE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip82921SourceCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921SourceCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp82921SourceCd,IP_82921_SOURCE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip82921SourceCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921SourceCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921SourceCd+targetIndex,targetLen);
    
   }
	public short getIp82921CntCd() throws CFException {
        if (isIp82921CntCdModified()) { 
           ip82921CntCd = refreshIp82921CntCd();
        }
   		return ip82921CntCd;
	}
	
	/**
	 * 	Update Ip82921CntCd with the passed value
	 *  Corresponding COBOL Variable is IP82921-CNT-CD
	 *	@param number
	 */
	public void setIp82921CntCd(short number) {
			ip82921CntCd = checkIp82921CntCdMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeIp82921CntCd(ip82921CntCd);
	}

	public void setIp82921CntCd(int number) {
	    number = checkIp82921CntCdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp82921CntCd((short)number);
	}
	public void setIp82921CntCd(long number) {
	    number = checkIp82921CntCdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp82921CntCd((short)number);
	}
	

	/**
	 *	Returns the value of ip82921OrigSwSerNum
	 *	@return ip82921OrigSwSerNum
	 */
   public char[] getIp82921OrigSwSerNum() throws CFException{
     if (isIp82921OrigSwSerNumModified()) { 
        ip82921OrigSwSerNum = refreshIp82921OrigSwSerNum();
     }
   		return ip82921OrigSwSerNum;
   }

  
	/**
	*  set variable ip82921OrigSwSerNum
	*  Corresponding COBOL Variable is IP82921-ORIG-SW-SER-NUM
	*  @param value
	**/
   public void setIp82921OrigSwSerNum(char[] value) {
      ip82921OrigSwSerNum = checkIp82921OrigSwSerNumConstraints(value);
      serializeIp82921OrigSwSerNum(ip82921OrigSwSerNum);
   } 

     /**
	 * 	Update Ip82921OrigSwSerNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921OrigSwSerNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp82921OrigSwSerNum,ip82921OrigSwSerNum.length);
   	
   }
   
   public void setIp82921OrigSwSerNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921OrigSwSerNum,ip82921OrigSwSerNum.length);
   	
   }
   
     /**
	 * 	Update Ip82921OrigSwSerNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921OrigSwSerNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921OrigSwSerNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip82921OrigSwSerNum with another Field
	 *	@param value
	 */
   public void setIp82921OrigSwSerNum(Field source) {
       replace(source,0,source.length(),beginIp82921OrigSwSerNum,IP_82921_ORIG_SW_SER_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip82921OrigSwSerNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921OrigSwSerNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp82921OrigSwSerNum,IP_82921_ORIG_SW_SER_NUM_LEN);
   	
   }
   
     /**
	 * 	Update Ip82921OrigSwSerNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921OrigSwSerNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921OrigSwSerNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip82921CloseDt
	 *	@return ip82921CloseDt
	 */   
	 public Ip82921CloseDt getIp82921CloseDt() {
   	return ip82921CloseDt;
   }
   /**
	* 	Update Ip82921CloseDt with the passed value
	*   Corresponding COBOL Variable is IP82921-CLOSE-DT
	*	@param value
	*/
   public void setIp82921CloseDt(char[] value) {
      ip82921CloseDt.setString(value); 
   }   
    
     /**
	 * 	Update Ip82921CloseDt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp82921CloseDt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip82921CloseDt.begin,ip82921CloseDt.length());
   }
   
     /**
	 * 	Update Ip82921CloseDt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921CloseDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip82921CloseDt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip82921CloseDt with another Field
	 *	@param value
	 */
   public void setIp82921CloseDt(Field source) {
   	replace(source,0,source.length(),ip82921CloseDt.begin,ip82921CloseDt.length());
   }  
   
     /**
	 * 	Update Ip82921CloseDt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp82921CloseDt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip82921CloseDt.begin,ip82921CloseDt.length());
   }
   
     /**
	 * 	Update Ip82921CloseDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921CloseDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip82921CloseDt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip82921ChgbkCnt
	 *	@return ip82921ChgbkCnt
	 */
	public int getIp82921ChgbkCnt() throws CFException {
       if (isIp82921ChgbkCntModified()) { 
           ip82921ChgbkCnt = refreshIp82921ChgbkCnt();
        }
   		return ip82921ChgbkCnt;
	}
	

	
	   
	/**
	 * 	Update Ip82921ChgbkCnt with the passed value
	 *  Corresponding COBOL Variable is IP82921-CHGBK-CNT
	 *	@param number
	 */
	public void setIp82921ChgbkCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip82921ChgbkCnt = checkIp82921ChgbkCntMaxLimit(number); 
		serializeIp82921ChgbkCnt(ip82921ChgbkCnt);
	}
	

	public void setIp82921ChgbkCnt(long number) {
	    number = checkIp82921ChgbkCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp82921ChgbkCnt((int)number);
	}
	
	/**
	 * 	Update Ip82921ChgbkCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp82921ChgbkCnt(char[] value) throws CFException {
		 ip82921ChgbkCnt = serializeIp82921ChgbkCnt(value);
	}
	/**
	 * 	Update Ip82921ChgbkCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp82921ChgbkCntString(char[] value) throws CFException {
		 setIp82921ChgbkCnt(value);
	}
	/**
	 *	Returns the value of ip82921RejRsn1Cd
	 *	@return ip82921RejRsn1Cd
	 */
   public char[] getIp82921RejRsn1Cd() throws CFException{
     if (isIp82921RejRsn1CdModified()) { 
        ip82921RejRsn1Cd = refreshIp82921RejRsn1Cd();
     }
   		return ip82921RejRsn1Cd;
   }

  
	/**
	*  set variable ip82921RejRsn1Cd
	*  Corresponding COBOL Variable is IP82921-REJ-RSN-1-CD
	*  @param value
	**/
   public void setIp82921RejRsn1Cd(char[] value) {
      ip82921RejRsn1Cd = checkIp82921RejRsn1CdConstraints(value);
      serializeIp82921RejRsn1Cd(ip82921RejRsn1Cd);
   } 

     /**
	 * 	Update Ip82921RejRsn1Cd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921RejRsn1Cd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp82921RejRsn1Cd,ip82921RejRsn1Cd.length);
   	
   }
   
   public void setIp82921RejRsn1Cd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921RejRsn1Cd,ip82921RejRsn1Cd.length);
   	
   }
   
     /**
	 * 	Update Ip82921RejRsn1Cd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921RejRsn1Cd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921RejRsn1Cd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip82921RejRsn1Cd with another Field
	 *	@param value
	 */
   public void setIp82921RejRsn1Cd(Field source) {
       replace(source,0,source.length(),beginIp82921RejRsn1Cd,IP_82921_REJ_RSN_1_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip82921RejRsn1Cd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921RejRsn1Cd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp82921RejRsn1Cd,IP_82921_REJ_RSN_1_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip82921RejRsn1Cd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921RejRsn1Cd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921RejRsn1Cd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip82921RejRsn2Cd
	 *	@return ip82921RejRsn2Cd
	 */
   public char[] getIp82921RejRsn2Cd() throws CFException{
     if (isIp82921RejRsn2CdModified()) { 
        ip82921RejRsn2Cd = refreshIp82921RejRsn2Cd();
     }
   		return ip82921RejRsn2Cd;
   }

  
	/**
	*  set variable ip82921RejRsn2Cd
	*  Corresponding COBOL Variable is IP82921-REJ-RSN-2-CD
	*  @param value
	**/
   public void setIp82921RejRsn2Cd(char[] value) {
      ip82921RejRsn2Cd = checkIp82921RejRsn2CdConstraints(value);
      serializeIp82921RejRsn2Cd(ip82921RejRsn2Cd);
   } 

     /**
	 * 	Update Ip82921RejRsn2Cd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921RejRsn2Cd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp82921RejRsn2Cd,ip82921RejRsn2Cd.length);
   	
   }
   
   public void setIp82921RejRsn2Cd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921RejRsn2Cd,ip82921RejRsn2Cd.length);
   	
   }
   
     /**
	 * 	Update Ip82921RejRsn2Cd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921RejRsn2Cd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921RejRsn2Cd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip82921RejRsn2Cd with another Field
	 *	@param value
	 */
   public void setIp82921RejRsn2Cd(Field source) {
       replace(source,0,source.length(),beginIp82921RejRsn2Cd,IP_82921_REJ_RSN_2_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip82921RejRsn2Cd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921RejRsn2Cd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp82921RejRsn2Cd,IP_82921_REJ_RSN_2_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip82921RejRsn2Cd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921RejRsn2Cd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921RejRsn2Cd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip82921VrtlAcctNum
	 *	@return ip82921VrtlAcctNum
	 */
   public char[] getIp82921VrtlAcctNum() throws CFException{
     if (isIp82921VrtlAcctNumModified()) { 
        ip82921VrtlAcctNum = refreshIp82921VrtlAcctNum();
     }
   		return ip82921VrtlAcctNum;
   }

  
	/**
	*  set variable ip82921VrtlAcctNum
	*  Corresponding COBOL Variable is IP82921-VRTL-ACCT-NUM
	*  @param value
	**/
   public void setIp82921VrtlAcctNum(char[] value) {
      ip82921VrtlAcctNum = checkIp82921VrtlAcctNumConstraints(value);
      serializeIp82921VrtlAcctNum(ip82921VrtlAcctNum);
   } 

     /**
	 * 	Update Ip82921VrtlAcctNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp82921VrtlAcctNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp82921VrtlAcctNum,ip82921VrtlAcctNum.length);
   	
   }
   
   public void setIp82921VrtlAcctNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921VrtlAcctNum,ip82921VrtlAcctNum.length);
   	
   }
   
     /**
	 * 	Update Ip82921VrtlAcctNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp82921VrtlAcctNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921VrtlAcctNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip82921VrtlAcctNum with another Field
	 *	@param value
	 */
   public void setIp82921VrtlAcctNum(Field source) {
       replace(source,0,source.length(),beginIp82921VrtlAcctNum,IP_82921_VRTL_ACCT_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip82921VrtlAcctNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp82921VrtlAcctNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp82921VrtlAcctNum,IP_82921_VRTL_ACCT_NUM_LEN);
   	
   }
   
     /**
	 * 	Update Ip82921VrtlAcctNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp82921VrtlAcctNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp82921VrtlAcctNum+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip82921FacData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp82921InsertTimestamp(CONSTANTS.SPACE_26);
                     setIp82921CycleIndicator(0);
                     setIp82921MsgRsnCd(0);
                     setIp82921ChargebackAmt(0);
                     setIp82921ChargebackCurrCd(0);
         setIp82921ChargebackExpCd(CONSTANTS.SPACE);
         setIp82921ReversalIndicator(CONSTANTS.SPACE);
         setIp82921ChargebackRefNo(CONSTANTS.SPACE_10);
                     setIp82921FuncCd(0);
         setIp82921SwitchSerialNum(CONSTANTS.SPACE_9);
         setIp82921SourceCd(CONSTANTS.SPACE_4);
         	setIp82921CntCd((short)0);
         setIp82921OrigSwSerNum(CONSTANTS.SPACE_9);
          ip82921CloseDt.initialize();
     
                     setIp82921ChgbkCnt(0);
         setIp82921RejRsn1Cd(CONSTANTS.SPACE_4);
         setIp82921RejRsn2Cd(CONSTANTS.SPACE_4);
         setIp82921VrtlAcctNum(CONSTANTS.SPACE_19);
   }

		public static int getIp82921FacDataFieldLength() {
			return IP_82921_FAC_DATA_LENGTH;
		}

}
  
