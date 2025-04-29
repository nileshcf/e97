package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip32101ChkPtDataRct is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:25. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip32101ChkPtDataRct extends Ip32101ChkPtDataRctSerialized { 
   

								private short ip32101RctDataLen;

								private long ip32101RctFreq;
				private Ip32101RctChkKey ip32101RctChkKey = new Ip32101RctChkKey();

								private long ip32101RctSumChkCnt;

								private long ip32101RctDtlChkCnt;

								private long ip32101RctSetlChkCnt;
	
	/**
	* Constructor for Ip32101ChkPtDataRct
	**/
    public Ip32101ChkPtDataRct() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip32101ChkPtDataRct. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip32101ChkPtDataRct(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip32101RctChkKey.setParent(this,getStartOffset() + 11);
    } 

	/**
	 *	Returns the value of ip32101RctDataLen
	 *	@return ip32101RctDataLen
	 */
	public short getIp32101RctDataLen() throws CFException {
        if (isIp32101RctDataLenModified()) { 
           ip32101RctDataLen = refreshIp32101RctDataLen();
        }
   		return ip32101RctDataLen;
	}
	
	/**
	 * 	Update Ip32101RctDataLen with the passed value
	 *  Corresponding COBOL Variable is IP32101-RCT-DATA-LEN
	 *	@param number
	 */
	public void setIp32101RctDataLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip32101RctDataLen = checkIp32101RctDataLenMaxLimit(number); 
		serializeIp32101RctDataLen(ip32101RctDataLen);
	}

	public void setIp32101RctDataLen(int number) {
	    number = checkIp32101RctDataLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp32101RctDataLen((short)number);
	}
	public void setIp32101RctDataLen(long number) {
	    number = checkIp32101RctDataLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp32101RctDataLen((short)number);
	}
	

	/**
	 *	Returns the value of ip32101RctFreq
	 *	@return ip32101RctFreq
	 */
	public long getIp32101RctFreq() throws CFException {
       if (isIp32101RctFreqModified()) { 
           ip32101RctFreq = refreshIp32101RctFreq();
        }
   		return ip32101RctFreq;
	}
	

	
	   
	/**
	 * 	Update Ip32101RctFreq with the passed value
	 *  Corresponding COBOL Variable is IP32101-RCT-FREQ
	 *	@param number
	 */
	public void setIp32101RctFreq(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip32101RctFreq = checkIp32101RctFreqMaxLimit(number); 
		serializeIp32101RctFreq(ip32101RctFreq);
	}
	

	/**
	 * 	Update Ip32101RctFreq with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp32101RctFreq(char[] value) throws CFException {
		 ip32101RctFreq = serializeIp32101RctFreq(value);
	}
	/**
	 * 	Update Ip32101RctFreq with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp32101RctFreqString(char[] value) throws CFException {
		 setIp32101RctFreq(value);
	}
	/**
	 *	Returns the value of ip32101RctChkKey
	 *	@return ip32101RctChkKey
	 */   
	 public Ip32101RctChkKey getIp32101RctChkKey() {
   	return ip32101RctChkKey;
   }
   /**
	* 	Update Ip32101RctChkKey with the passed value
	*   Corresponding COBOL Variable is IP32101-RCT-CHK-KEY
	*	@param value
	*/
   public void setIp32101RctChkKey(char[] value) {
      ip32101RctChkKey.setString(value); 
   }   
    
     /**
	 * 	Update Ip32101RctChkKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp32101RctChkKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip32101RctChkKey.begin,ip32101RctChkKey.length());
   }
   
     /**
	 * 	Update Ip32101RctChkKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp32101RctChkKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip32101RctChkKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip32101RctChkKey with another Field
	 *	@param value
	 */
   public void setIp32101RctChkKey(Field source) {
   	replace(source,0,source.length(),ip32101RctChkKey.begin,ip32101RctChkKey.length());
   }  
   
     /**
	 * 	Update Ip32101RctChkKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp32101RctChkKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip32101RctChkKey.begin,ip32101RctChkKey.length());
   }
   
     /**
	 * 	Update Ip32101RctChkKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp32101RctChkKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip32101RctChkKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip32101RctSumChkCnt
	 *	@return ip32101RctSumChkCnt
	 */
	public long getIp32101RctSumChkCnt() throws CFException {
       if (isIp32101RctSumChkCntModified()) { 
           ip32101RctSumChkCnt = refreshIp32101RctSumChkCnt();
        }
   		return ip32101RctSumChkCnt;
	}
	

	
	   
	/**
	 * 	Update Ip32101RctSumChkCnt with the passed value
	 *  Corresponding COBOL Variable is IP32101-RCT-SUM-CHK-CNT
	 *	@param number
	 */
	public void setIp32101RctSumChkCnt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip32101RctSumChkCnt = checkIp32101RctSumChkCntMaxLimit(number); 
		serializeIp32101RctSumChkCnt(ip32101RctSumChkCnt);
	}
	

	/**
	 * 	Update Ip32101RctSumChkCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp32101RctSumChkCnt(char[] value) throws CFException {
		 ip32101RctSumChkCnt = serializeIp32101RctSumChkCnt(value);
	}
	/**
	 * 	Update Ip32101RctSumChkCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp32101RctSumChkCntString(char[] value) throws CFException {
		 setIp32101RctSumChkCnt(value);
	}
	/**
	 *	Returns the value of ip32101RctDtlChkCnt
	 *	@return ip32101RctDtlChkCnt
	 */
	public long getIp32101RctDtlChkCnt() throws CFException {
       if (isIp32101RctDtlChkCntModified()) { 
           ip32101RctDtlChkCnt = refreshIp32101RctDtlChkCnt();
        }
   		return ip32101RctDtlChkCnt;
	}
	

	
	   
	/**
	 * 	Update Ip32101RctDtlChkCnt with the passed value
	 *  Corresponding COBOL Variable is IP32101-RCT-DTL-CHK-CNT
	 *	@param number
	 */
	public void setIp32101RctDtlChkCnt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip32101RctDtlChkCnt = checkIp32101RctDtlChkCntMaxLimit(number); 
		serializeIp32101RctDtlChkCnt(ip32101RctDtlChkCnt);
	}
	

	/**
	 * 	Update Ip32101RctDtlChkCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp32101RctDtlChkCnt(char[] value) throws CFException {
		 ip32101RctDtlChkCnt = serializeIp32101RctDtlChkCnt(value);
	}
	/**
	 * 	Update Ip32101RctDtlChkCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp32101RctDtlChkCntString(char[] value) throws CFException {
		 setIp32101RctDtlChkCnt(value);
	}
	/**
	 *	Returns the value of ip32101RctSetlChkCnt
	 *	@return ip32101RctSetlChkCnt
	 */
	public long getIp32101RctSetlChkCnt() throws CFException {
       if (isIp32101RctSetlChkCntModified()) { 
           ip32101RctSetlChkCnt = refreshIp32101RctSetlChkCnt();
        }
   		return ip32101RctSetlChkCnt;
	}
	

	
	   
	/**
	 * 	Update Ip32101RctSetlChkCnt with the passed value
	 *  Corresponding COBOL Variable is IP32101-RCT-SETL-CHK-CNT
	 *	@param number
	 */
	public void setIp32101RctSetlChkCnt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip32101RctSetlChkCnt = checkIp32101RctSetlChkCntMaxLimit(number); 
		serializeIp32101RctSetlChkCnt(ip32101RctSetlChkCnt);
	}
	

	/**
	 * 	Update Ip32101RctSetlChkCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp32101RctSetlChkCnt(char[] value) throws CFException {
		 ip32101RctSetlChkCnt = serializeIp32101RctSetlChkCnt(value);
	}
	/**
	 * 	Update Ip32101RctSetlChkCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp32101RctSetlChkCntString(char[] value) throws CFException {
		 setIp32101RctSetlChkCnt(value);
	}

	
	
	
	/**
	 * 	initializes Ip32101ChkPtDataRct
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp32101RctDataLen((short)0);
                     setIp32101RctFreq(0);
          ip32101RctChkKey.initialize();
     
                     setIp32101RctSumChkCnt(0);
                     setIp32101RctDtlChkCnt(0);
                     setIp32101RctSetlChkCnt(0);
   }

		public static int getIp32101ChkPtDataRctFieldLength() {
			return IP_32101_CHK_PT_DATA_RCT_LENGTH;
		}

}
  
