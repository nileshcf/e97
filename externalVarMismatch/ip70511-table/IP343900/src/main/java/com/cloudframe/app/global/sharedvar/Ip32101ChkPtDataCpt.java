package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip32101ChkPtDataCpt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:25. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip32101ChkPtDataCpt extends Ip32101ChkPtDataCptSerialized { 
   

								private short ip32101CptDataLen;

								private long ip32101CptFreq;
				private Ip32101CptChkKey ip32101CptChkKey = new Ip32101CptChkKey();

								private long ip32101CptChkCnt;
	
	/**
	* Constructor for Ip32101ChkPtDataCpt
	**/
    public Ip32101ChkPtDataCpt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip32101ChkPtDataCpt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip32101ChkPtDataCpt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip32101CptChkKey.setParent(this,getStartOffset() + 11);
    } 

	/**
	 *	Returns the value of ip32101CptDataLen
	 *	@return ip32101CptDataLen
	 */
	public short getIp32101CptDataLen() throws CFException {
        if (isIp32101CptDataLenModified()) { 
           ip32101CptDataLen = refreshIp32101CptDataLen();
        }
   		return ip32101CptDataLen;
	}
	
	/**
	 * 	Update Ip32101CptDataLen with the passed value
	 *  Corresponding COBOL Variable is IP32101-CPT-DATA-LEN
	 *	@param number
	 */
	public void setIp32101CptDataLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip32101CptDataLen = checkIp32101CptDataLenMaxLimit(number); 
		serializeIp32101CptDataLen(ip32101CptDataLen);
	}

	public void setIp32101CptDataLen(int number) {
	    number = checkIp32101CptDataLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp32101CptDataLen((short)number);
	}
	public void setIp32101CptDataLen(long number) {
	    number = checkIp32101CptDataLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp32101CptDataLen((short)number);
	}
	

	/**
	 *	Returns the value of ip32101CptFreq
	 *	@return ip32101CptFreq
	 */
	public long getIp32101CptFreq() throws CFException {
       if (isIp32101CptFreqModified()) { 
           ip32101CptFreq = refreshIp32101CptFreq();
        }
   		return ip32101CptFreq;
	}
	

	
	   
	/**
	 * 	Update Ip32101CptFreq with the passed value
	 *  Corresponding COBOL Variable is IP32101-CPT-FREQ
	 *	@param number
	 */
	public void setIp32101CptFreq(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip32101CptFreq = checkIp32101CptFreqMaxLimit(number); 
		serializeIp32101CptFreq(ip32101CptFreq);
	}
	

	/**
	 * 	Update Ip32101CptFreq with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp32101CptFreq(char[] value) throws CFException {
		 ip32101CptFreq = serializeIp32101CptFreq(value);
	}
	/**
	 * 	Update Ip32101CptFreq with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp32101CptFreqString(char[] value) throws CFException {
		 setIp32101CptFreq(value);
	}
	/**
	 *	Returns the value of ip32101CptChkKey
	 *	@return ip32101CptChkKey
	 */   
	 public Ip32101CptChkKey getIp32101CptChkKey() {
   	return ip32101CptChkKey;
   }
   /**
	* 	Update Ip32101CptChkKey with the passed value
	*   Corresponding COBOL Variable is IP32101-CPT-CHK-KEY
	*	@param value
	*/
   public void setIp32101CptChkKey(char[] value) {
      ip32101CptChkKey.setString(value); 
   }   
    
     /**
	 * 	Update Ip32101CptChkKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp32101CptChkKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip32101CptChkKey.begin,ip32101CptChkKey.length());
   }
   
     /**
	 * 	Update Ip32101CptChkKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp32101CptChkKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip32101CptChkKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip32101CptChkKey with another Field
	 *	@param value
	 */
   public void setIp32101CptChkKey(Field source) {
   	replace(source,0,source.length(),ip32101CptChkKey.begin,ip32101CptChkKey.length());
   }  
   
     /**
	 * 	Update Ip32101CptChkKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp32101CptChkKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip32101CptChkKey.begin,ip32101CptChkKey.length());
   }
   
     /**
	 * 	Update Ip32101CptChkKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp32101CptChkKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip32101CptChkKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip32101CptChkCnt
	 *	@return ip32101CptChkCnt
	 */
	public long getIp32101CptChkCnt() throws CFException {
       if (isIp32101CptChkCntModified()) { 
           ip32101CptChkCnt = refreshIp32101CptChkCnt();
        }
   		return ip32101CptChkCnt;
	}
	

	
	   
	/**
	 * 	Update Ip32101CptChkCnt with the passed value
	 *  Corresponding COBOL Variable is IP32101-CPT-CHK-CNT
	 *	@param number
	 */
	public void setIp32101CptChkCnt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip32101CptChkCnt = checkIp32101CptChkCntMaxLimit(number); 
		serializeIp32101CptChkCnt(ip32101CptChkCnt);
	}
	

	/**
	 * 	Update Ip32101CptChkCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp32101CptChkCnt(char[] value) throws CFException {
		 ip32101CptChkCnt = serializeIp32101CptChkCnt(value);
	}
	/**
	 * 	Update Ip32101CptChkCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp32101CptChkCntString(char[] value) throws CFException {
		 setIp32101CptChkCnt(value);
	}

	
	
	
	/**
	 * 	initializes Ip32101ChkPtDataCpt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp32101CptDataLen((short)0);
                     setIp32101CptFreq(0);
          ip32101CptChkKey.initialize();
     
                     setIp32101CptChkCnt(0);
   }

		public static int getIp32101ChkPtDataCptFieldLength() {
			return IP_32101_CHK_PT_DATA_CPT_LENGTH;
		}

}
  
