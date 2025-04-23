package com.cloudframe.app.ip088030.file.records;

/**
*  The class Ip98152RecordPart2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/


import com.cloudframe.app.ip088030.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.*;


public class Ip98152RecordPart2 extends Ip98152RecordPart2Serialized { 
   

								private long ip98152ClrFxDate;

								private long ip98152ClrTxnAmt;

						private char[] ip98152ClrTxnCurrCd = Field.fillLowValue(3);
			private List<Ip98152ClrSetlInfo> ip98152ClrSetlInfo = new ArrayList<>();
    	

						private char[] ip98152FundProdId = Field.fillLowValue(3);

						private char[] ip98152FundAcctNum = Field.fillLowValue(19);

						private char[] ip98152ActualMcc = Field.fillLowValue(4);

						private char[] ip98152FundProdType = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip98152RecordPart2
	**/
    public Ip98152RecordPart2() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip98152RecordPart2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip98152RecordPart2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip98152ClrFxDate
	 *	@return ip98152ClrFxDate
	 */
	public long getIp98152ClrFxDate() throws CFException {
       if (isIp98152ClrFxDateModified()) { 
           ip98152ClrFxDate = refreshIp98152ClrFxDate();
        }
   		return ip98152ClrFxDate;
	}
	

	
	   
	/**
	 * 	Update Ip98152ClrFxDate with the passed value
	 *  Corresponding COBOL Variable is IP98152-CLR-FX-DATE
	 *	@param number
	 */
	public void setIp98152ClrFxDate(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip98152ClrFxDate = checkIp98152ClrFxDateMaxLimit(number); 
		serializeIp98152ClrFxDate(ip98152ClrFxDate);
	}
	

	/**
	 * 	Update Ip98152ClrFxDate with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp98152ClrFxDate(char[] value) throws CFException {
		 ip98152ClrFxDate = serializeIp98152ClrFxDate(value);
	}
	/**
	 * 	Update Ip98152ClrFxDate with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp98152ClrFxDateString(char[] value) throws CFException {
		 setIp98152ClrFxDate(value);
	}
	public long getIp98152ClrTxnAmt() throws CFException {
        if (isIp98152ClrTxnAmtModified()) { 
           ip98152ClrTxnAmt = refreshIp98152ClrTxnAmt();
        }
   		return ip98152ClrTxnAmt;
	}
	
	/**
	 * 	Update Ip98152ClrTxnAmt with the passed value
	 *  Corresponding COBOL Variable is IP98152-CLR-TXN-AMT
	 *	@param number
	 */
	public void setIp98152ClrTxnAmt(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			ip98152ClrTxnAmt = checkIp98152ClrTxnAmtMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeIp98152ClrTxnAmt(ip98152ClrTxnAmt);
	}


	/**
	 *	Returns the value of ip98152ClrTxnCurrCd
	 *	@return ip98152ClrTxnCurrCd
	 */
   public char[] getIp98152ClrTxnCurrCd() throws CFException{
     if (isIp98152ClrTxnCurrCdModified()) { 
        ip98152ClrTxnCurrCd = refreshIp98152ClrTxnCurrCd();
     }
   		return ip98152ClrTxnCurrCd;
   }

  
	/**
	*  set variable ip98152ClrTxnCurrCd
	*  Corresponding COBOL Variable is IP98152-CLR-TXN-CURR-CD
	*  @param value
	**/
   public void setIp98152ClrTxnCurrCd(char[] value) {
      ip98152ClrTxnCurrCd = checkIp98152ClrTxnCurrCdConstraints(value);
      serializeIp98152ClrTxnCurrCd(ip98152ClrTxnCurrCd);
   } 

     /**
	 * 	Update Ip98152ClrTxnCurrCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp98152ClrTxnCurrCd,ip98152ClrTxnCurrCd.length);
   	
   }
   
   public void setIp98152ClrTxnCurrCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp98152ClrTxnCurrCd,ip98152ClrTxnCurrCd.length);
   	
   }
   
     /**
	 * 	Update Ip98152ClrTxnCurrCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98152ClrTxnCurrCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip98152ClrTxnCurrCd with another Field
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(Field source) {
       replace(source,0,source.length(),beginIp98152ClrTxnCurrCd,IP_98152_CLR_TXN_CURR_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip98152ClrTxnCurrCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp98152ClrTxnCurrCd,IP_98152_CLR_TXN_CURR_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip98152ClrTxnCurrCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ClrTxnCurrCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98152ClrTxnCurrCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the  value of ip98152ClrSetlInfo
	 *  Corresponding COBOL Variable is IP98152-CLR-SETL-INFO
	 *	@return ip98152ClrSetlInfo
	 */
   public List<Ip98152ClrSetlInfo> getIp98152ClrSetlInfo() {
       return ip98152ClrSetlInfo;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip98152ClrSetlInfo
	 */
	public Ip98152ClrSetlInfo getIp98152ClrSetlInfo(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp98152ClrSetlInfo(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_98152_CLR_SETL_INFO_SIZE) {
             	index = IP_98152_CLR_SETL_INFO_SIZE -1; // can't exceed max array size
             	logger.trace("ip98152ClrSetlInfo - Array index exceeded max Size {}, resetting it to max allowed",IP_98152_CLR_SETL_INFO_SIZE); 
	    }
		if (index >= ip98152ClrSetlInfo.size()) {
       		for (int fillIndex =  ip98152ClrSetlInfo.size() -1; fillIndex < index;fillIndex++) {
		       ip98152ClrSetlInfo.add(null);
		    }
			ip98152ClrSetlInfo.set(index,
			   	   	new Ip98152ClrSetlInfo(this,beginIp98152ClrSetlInfo + index * Ip98152ClrSetlInfo.getIp98152ClrSetlInfoFieldLength()) 
				                        ); 	
		} 
   	   Ip98152ClrSetlInfo value = ip98152ClrSetlInfo.get(index);
   	   if (value == null) {
   	      ip98152ClrSetlInfo.set(index,
			   	   	new Ip98152ClrSetlInfo(this,beginIp98152ClrSetlInfo + index * Ip98152ClrSetlInfo.getIp98152ClrSetlInfoFieldLength()) 
				                        ); 
		  value = ip98152ClrSetlInfo.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip98152ClrSetlInfo at index with the passed value
	 *  Corresponding COBOL Variable is IP98152-CLR-SETL-INFO
	 *  @param index
	 *	@param value
	 */
  public void setIp98152ClrSetlInfo(int index,char[] value) {
   	getIp98152ClrSetlInfo(index).setString(value);
   }
   
	
	/**
	 *	Returns the value of ip98152FundProdId
	 *	@return ip98152FundProdId
	 */
   public char[] getIp98152FundProdId() throws CFException{
     if (isIp98152FundProdIdModified()) { 
        ip98152FundProdId = refreshIp98152FundProdId();
     }
   		return ip98152FundProdId;
   }

  
	/**
	*  set variable ip98152FundProdId
	*  Corresponding COBOL Variable is IP98152-FUND-PROD-ID
	*  @param value
	**/
   public void setIp98152FundProdId(char[] value) {
      ip98152FundProdId = checkIp98152FundProdIdConstraints(value);
      serializeIp98152FundProdId(ip98152FundProdId);
   } 

     /**
	 * 	Update Ip98152FundProdId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98152FundProdId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp98152FundProdId,ip98152FundProdId.length);
   	
   }
   
   public void setIp98152FundProdId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp98152FundProdId,ip98152FundProdId.length);
   	
   }
   
     /**
	 * 	Update Ip98152FundProdId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98152FundProdId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98152FundProdId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip98152FundProdId with another Field
	 *	@param value
	 */
   public void setIp98152FundProdId(Field source) {
       replace(source,0,source.length(),beginIp98152FundProdId,IP_98152_FUND_PROD_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip98152FundProdId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98152FundProdId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp98152FundProdId,IP_98152_FUND_PROD_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip98152FundProdId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98152FundProdId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98152FundProdId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip98152FundAcctNum
	 *	@return ip98152FundAcctNum
	 */
   public char[] getIp98152FundAcctNum() throws CFException{
     if (isIp98152FundAcctNumModified()) { 
        ip98152FundAcctNum = refreshIp98152FundAcctNum();
     }
   		return ip98152FundAcctNum;
   }

  
	/**
	*  set variable ip98152FundAcctNum
	*  Corresponding COBOL Variable is IP98152-FUND-ACCT-NUM
	*  @param value
	**/
   public void setIp98152FundAcctNum(char[] value) {
      ip98152FundAcctNum = checkIp98152FundAcctNumConstraints(value);
      serializeIp98152FundAcctNum(ip98152FundAcctNum);
   } 

     /**
	 * 	Update Ip98152FundAcctNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98152FundAcctNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp98152FundAcctNum,ip98152FundAcctNum.length);
   	
   }
   
   public void setIp98152FundAcctNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp98152FundAcctNum,ip98152FundAcctNum.length);
   	
   }
   
     /**
	 * 	Update Ip98152FundAcctNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98152FundAcctNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98152FundAcctNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip98152FundAcctNum with another Field
	 *	@param value
	 */
   public void setIp98152FundAcctNum(Field source) {
       replace(source,0,source.length(),beginIp98152FundAcctNum,IP_98152_FUND_ACCT_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip98152FundAcctNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98152FundAcctNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp98152FundAcctNum,IP_98152_FUND_ACCT_NUM_LEN);
   	
   }
   
     /**
	 * 	Update Ip98152FundAcctNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98152FundAcctNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98152FundAcctNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip98152ActualMcc
	 *	@return ip98152ActualMcc
	 */
   public char[] getIp98152ActualMcc() throws CFException{
     if (isIp98152ActualMccModified()) { 
        ip98152ActualMcc = refreshIp98152ActualMcc();
     }
   		return ip98152ActualMcc;
   }

  
	/**
	*  set variable ip98152ActualMcc
	*  Corresponding COBOL Variable is IP98152-ACTUAL-MCC
	*  @param value
	**/
   public void setIp98152ActualMcc(char[] value) {
      ip98152ActualMcc = checkIp98152ActualMccConstraints(value);
      serializeIp98152ActualMcc(ip98152ActualMcc);
   } 

     /**
	 * 	Update Ip98152ActualMcc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98152ActualMcc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp98152ActualMcc,ip98152ActualMcc.length);
   	
   }
   
   public void setIp98152ActualMcc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp98152ActualMcc,ip98152ActualMcc.length);
   	
   }
   
     /**
	 * 	Update Ip98152ActualMcc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ActualMcc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98152ActualMcc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip98152ActualMcc with another Field
	 *	@param value
	 */
   public void setIp98152ActualMcc(Field source) {
       replace(source,0,source.length(),beginIp98152ActualMcc,IP_98152_ACTUAL_MCC_LEN);
   	
   }  
   
     /**
	 * 	Update Ip98152ActualMcc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98152ActualMcc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp98152ActualMcc,IP_98152_ACTUAL_MCC_LEN);
   	
   }
   
     /**
	 * 	Update Ip98152ActualMcc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98152ActualMcc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98152ActualMcc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip98152FundProdType
	 *	@return ip98152FundProdType
	 */
   public char[] getIp98152FundProdType() throws CFException{
     if (isIp98152FundProdTypeModified()) { 
        ip98152FundProdType = refreshIp98152FundProdType();
     }
   		return ip98152FundProdType;
   }

  
	/**
	*  set variable ip98152FundProdType
	*  Corresponding COBOL Variable is IP98152-FUND-PROD-TYPE
	*  @param value
	**/
   public void setIp98152FundProdType(char[] value) {
      ip98152FundProdType = checkIp98152FundProdTypeConstraints(value);
      serializeIp98152FundProdType(ip98152FundProdType);
   } 

     /**
	 * 	Update Ip98152FundProdType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98152FundProdType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp98152FundProdType,ip98152FundProdType.length);
   	
   }
   
   public void setIp98152FundProdType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp98152FundProdType,ip98152FundProdType.length);
   	
   }
   
     /**
	 * 	Update Ip98152FundProdType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98152FundProdType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98152FundProdType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip98152FundProdType with another Field
	 *	@param value
	 */
   public void setIp98152FundProdType(Field source) {
       replace(source,0,source.length(),beginIp98152FundProdType,IP_98152_FUND_PROD_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip98152FundProdType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98152FundProdType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp98152FundProdType,IP_98152_FUND_PROD_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Ip98152FundProdType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98152FundProdType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98152FundProdType+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIp98152RecordPart2FieldLength() {
			return IP_98152_RECORD_PART_2_LENGTH;
		}

}
  
