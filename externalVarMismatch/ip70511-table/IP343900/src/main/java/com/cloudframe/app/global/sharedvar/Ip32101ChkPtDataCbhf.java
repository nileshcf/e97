package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip32101ChkPtDataCbhf is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip32101ChkPtDataCbhf extends Ip32101ChkPtDataCbhfSerialized { 
   

								private short ip32101CbhfDataLen;

								private long ip32101CbhfFreq;
				private Ip32101CbhfChkKey ip32101CbhfChkKey = new Ip32101CbhfChkKey();

								private long ip32101CbhfChkCnt;

								private short ip32101CbhfCycInd;

								private int ip32101CbhfCsIpmRecCnt;

						private char[] ip32101CbhfBulkId = Field.fillLowValue(4);

						private char[] ip32101CbhfEdcDasetNam = Field.fillLowValue(44);
	
	/**
	* Constructor for Ip32101ChkPtDataCbhf
	**/
    public Ip32101ChkPtDataCbhf() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip32101ChkPtDataCbhf. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip32101ChkPtDataCbhf(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip32101CbhfChkKey.setParent(this,getStartOffset() + 11);
    } 

	/**
	 *	Returns the value of ip32101CbhfDataLen
	 *	@return ip32101CbhfDataLen
	 */
	public short getIp32101CbhfDataLen() throws CFException {
        if (isIp32101CbhfDataLenModified()) { 
           ip32101CbhfDataLen = refreshIp32101CbhfDataLen();
        }
   		return ip32101CbhfDataLen;
	}
	
	/**
	 * 	Update Ip32101CbhfDataLen with the passed value
	 *  Corresponding COBOL Variable is IP32101-CBHF-DATA-LEN
	 *	@param number
	 */
	public void setIp32101CbhfDataLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip32101CbhfDataLen = checkIp32101CbhfDataLenMaxLimit(number); 
		serializeIp32101CbhfDataLen(ip32101CbhfDataLen);
	}

	public void setIp32101CbhfDataLen(int number) {
	    number = checkIp32101CbhfDataLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp32101CbhfDataLen((short)number);
	}
	public void setIp32101CbhfDataLen(long number) {
	    number = checkIp32101CbhfDataLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp32101CbhfDataLen((short)number);
	}
	

	/**
	 *	Returns the value of ip32101CbhfFreq
	 *	@return ip32101CbhfFreq
	 */
	public long getIp32101CbhfFreq() throws CFException {
       if (isIp32101CbhfFreqModified()) { 
           ip32101CbhfFreq = refreshIp32101CbhfFreq();
        }
   		return ip32101CbhfFreq;
	}
	

	
	   
	/**
	 * 	Update Ip32101CbhfFreq with the passed value
	 *  Corresponding COBOL Variable is IP32101-CBHF-FREQ
	 *	@param number
	 */
	public void setIp32101CbhfFreq(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip32101CbhfFreq = checkIp32101CbhfFreqMaxLimit(number); 
		serializeIp32101CbhfFreq(ip32101CbhfFreq);
	}
	

	/**
	 * 	Update Ip32101CbhfFreq with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp32101CbhfFreq(char[] value) throws CFException {
		 ip32101CbhfFreq = serializeIp32101CbhfFreq(value);
	}
	/**
	 * 	Update Ip32101CbhfFreq with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp32101CbhfFreqString(char[] value) throws CFException {
		 setIp32101CbhfFreq(value);
	}
	/**
	 *	Returns the value of ip32101CbhfChkKey
	 *	@return ip32101CbhfChkKey
	 */   
	 public Ip32101CbhfChkKey getIp32101CbhfChkKey() {
   	return ip32101CbhfChkKey;
   }
   /**
	* 	Update Ip32101CbhfChkKey with the passed value
	*   Corresponding COBOL Variable is IP32101-CBHF-CHK-KEY
	*	@param value
	*/
   public void setIp32101CbhfChkKey(char[] value) {
      ip32101CbhfChkKey.setString(value); 
   }   
    
     /**
	 * 	Update Ip32101CbhfChkKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp32101CbhfChkKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip32101CbhfChkKey.begin,ip32101CbhfChkKey.length());
   }
   
     /**
	 * 	Update Ip32101CbhfChkKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp32101CbhfChkKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip32101CbhfChkKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip32101CbhfChkKey with another Field
	 *	@param value
	 */
   public void setIp32101CbhfChkKey(Field source) {
   	replace(source,0,source.length(),ip32101CbhfChkKey.begin,ip32101CbhfChkKey.length());
   }  
   
     /**
	 * 	Update Ip32101CbhfChkKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp32101CbhfChkKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip32101CbhfChkKey.begin,ip32101CbhfChkKey.length());
   }
   
     /**
	 * 	Update Ip32101CbhfChkKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp32101CbhfChkKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip32101CbhfChkKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip32101CbhfChkCnt
	 *	@return ip32101CbhfChkCnt
	 */
	public long getIp32101CbhfChkCnt() throws CFException {
       if (isIp32101CbhfChkCntModified()) { 
           ip32101CbhfChkCnt = refreshIp32101CbhfChkCnt();
        }
   		return ip32101CbhfChkCnt;
	}
	

	
	   
	/**
	 * 	Update Ip32101CbhfChkCnt with the passed value
	 *  Corresponding COBOL Variable is IP32101-CBHF-CHK-CNT
	 *	@param number
	 */
	public void setIp32101CbhfChkCnt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip32101CbhfChkCnt = checkIp32101CbhfChkCntMaxLimit(number); 
		serializeIp32101CbhfChkCnt(ip32101CbhfChkCnt);
	}
	

	/**
	 * 	Update Ip32101CbhfChkCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp32101CbhfChkCnt(char[] value) throws CFException {
		 ip32101CbhfChkCnt = serializeIp32101CbhfChkCnt(value);
	}
	/**
	 * 	Update Ip32101CbhfChkCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp32101CbhfChkCntString(char[] value) throws CFException {
		 setIp32101CbhfChkCnt(value);
	}
	public short getIp32101CbhfCycInd() throws CFException {
        if (isIp32101CbhfCycIndModified()) { 
           ip32101CbhfCycInd = refreshIp32101CbhfCycInd();
        }
   		return ip32101CbhfCycInd;
	}
	
	/**
	 * 	Update Ip32101CbhfCycInd with the passed value
	 *  Corresponding COBOL Variable is IP32101-CBHF-CYC-IND
	 *	@param number
	 */
	public void setIp32101CbhfCycInd(short number) {
			ip32101CbhfCycInd = checkIp32101CbhfCycIndMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeIp32101CbhfCycInd(ip32101CbhfCycInd);
	}

	public void setIp32101CbhfCycInd(int number) {
	    number = checkIp32101CbhfCycIndMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp32101CbhfCycInd((short)number);
	}
	public void setIp32101CbhfCycInd(long number) {
	    number = checkIp32101CbhfCycIndMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp32101CbhfCycInd((short)number);
	}
	

	public int getIp32101CbhfCsIpmRecCnt() throws CFException {
        if (isIp32101CbhfCsIpmRecCntModified()) { 
           ip32101CbhfCsIpmRecCnt = refreshIp32101CbhfCsIpmRecCnt();
        }
   		return ip32101CbhfCsIpmRecCnt;
	}
	
	/**
	 * 	Update Ip32101CbhfCsIpmRecCnt with the passed value
	 *  Corresponding COBOL Variable is IP32101-CBHF-CS-IPM-REC-CNT
	 *	@param number
	 */
	public void setIp32101CbhfCsIpmRecCnt(int number) {
			ip32101CbhfCsIpmRecCnt = checkIp32101CbhfCsIpmRecCntMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeIp32101CbhfCsIpmRecCnt(ip32101CbhfCsIpmRecCnt);
	}


	public void setIp32101CbhfCsIpmRecCnt(long number) {
	    number = checkIp32101CbhfCsIpmRecCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp32101CbhfCsIpmRecCnt((int)number);
	}
	
	/**
	 *	Returns the value of ip32101CbhfBulkId
	 *	@return ip32101CbhfBulkId
	 */
   public char[] getIp32101CbhfBulkId() throws CFException{
     if (isIp32101CbhfBulkIdModified()) { 
        ip32101CbhfBulkId = refreshIp32101CbhfBulkId();
     }
   		return ip32101CbhfBulkId;
   }

  
	/**
	*  set variable ip32101CbhfBulkId
	*  Corresponding COBOL Variable is IP32101-CBHF-BULK-ID
	*  @param value
	**/
   public void setIp32101CbhfBulkId(char[] value) {
      ip32101CbhfBulkId = checkIp32101CbhfBulkIdConstraints(value);
      serializeIp32101CbhfBulkId(ip32101CbhfBulkId);
   } 

     /**
	 * 	Update Ip32101CbhfBulkId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp32101CbhfBulkId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp32101CbhfBulkId,ip32101CbhfBulkId.length);
   	
   }
   
   public void setIp32101CbhfBulkId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101CbhfBulkId,ip32101CbhfBulkId.length);
   	
   }
   
     /**
	 * 	Update Ip32101CbhfBulkId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp32101CbhfBulkId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101CbhfBulkId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip32101CbhfBulkId with another Field
	 *	@param value
	 */
   public void setIp32101CbhfBulkId(Field source) {
       replace(source,0,source.length(),beginIp32101CbhfBulkId,IP_32101_CBHF_BULK_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip32101CbhfBulkId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp32101CbhfBulkId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp32101CbhfBulkId,IP_32101_CBHF_BULK_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip32101CbhfBulkId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp32101CbhfBulkId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101CbhfBulkId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip32101CbhfEdcDasetNam
	 *	@return ip32101CbhfEdcDasetNam
	 */
   public char[] getIp32101CbhfEdcDasetNam() throws CFException{
     if (isIp32101CbhfEdcDasetNamModified()) { 
        ip32101CbhfEdcDasetNam = refreshIp32101CbhfEdcDasetNam();
     }
   		return ip32101CbhfEdcDasetNam;
   }

  
	/**
	*  set variable ip32101CbhfEdcDasetNam
	*  Corresponding COBOL Variable is IP32101-CBHF-EDC-DASET-NAM
	*  @param value
	**/
   public void setIp32101CbhfEdcDasetNam(char[] value) {
      ip32101CbhfEdcDasetNam = checkIp32101CbhfEdcDasetNamConstraints(value);
      serializeIp32101CbhfEdcDasetNam(ip32101CbhfEdcDasetNam);
   } 

     /**
	 * 	Update Ip32101CbhfEdcDasetNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp32101CbhfEdcDasetNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp32101CbhfEdcDasetNam,ip32101CbhfEdcDasetNam.length);
   	
   }
   
   public void setIp32101CbhfEdcDasetNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101CbhfEdcDasetNam,ip32101CbhfEdcDasetNam.length);
   	
   }
   
     /**
	 * 	Update Ip32101CbhfEdcDasetNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp32101CbhfEdcDasetNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101CbhfEdcDasetNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip32101CbhfEdcDasetNam with another Field
	 *	@param value
	 */
   public void setIp32101CbhfEdcDasetNam(Field source) {
       replace(source,0,source.length(),beginIp32101CbhfEdcDasetNam,IP_32101_CBHF_EDC_DASET_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip32101CbhfEdcDasetNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp32101CbhfEdcDasetNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp32101CbhfEdcDasetNam,IP_32101_CBHF_EDC_DASET_NAM_LEN);
   	
   }
   
     /**
	 * 	Update Ip32101CbhfEdcDasetNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp32101CbhfEdcDasetNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101CbhfEdcDasetNam+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip32101ChkPtDataCbhf
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp32101CbhfDataLen((short)0);
                     setIp32101CbhfFreq(0);
          ip32101CbhfChkKey.initialize();
     
                     setIp32101CbhfChkCnt(0);
         	setIp32101CbhfCycInd((short)0);
                     setIp32101CbhfCsIpmRecCnt(0);
         setIp32101CbhfBulkId(CONSTANTS.SPACE_4);
         setIp32101CbhfEdcDasetNam(CONSTANTS.SPACE_44);
   }

		public static int getIp32101ChkPtDataCbhfFieldLength() {
			return IP_32101_CHK_PT_DATA_CBHF_LENGTH;
		}

}
  
