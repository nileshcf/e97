package com.cloudframe.app.ip829010.dto;

/**
*  The class FnsPayload is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class FnsPayload extends FnsPayloadSerialized {
   

								private short fnsPayloadQueryNo;

						private char[] fnsPayloadGftDsn = Field.fillLowValue(44);

								private int fnsPayloadLogicalSeq;

								private int fnsPayloadTxnNum;

								private short fnsPayloadFacCount;

						private char[] fnsPayloadFaaPanStatCd = Field.fillLowValue(1);

						private char[] fnsPayloadFaaCloseDt = Field.fillLowValue(10);
				private FnsPayloadFnsDataFields fnsPayloadFnsDataFields = new FnsPayloadFnsDataFields();
	
	/**
	* Constructor for FnsPayload
	**/
    public FnsPayload() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			fnsPayloadFnsDataFields.setParent(this,getStartOffset() + 68);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of fnsPayloadQueryNo
	 *	@return fnsPayloadQueryNo
	 */
	public short getFnsPayloadQueryNo() throws CFException {
        if (isFnsPayloadQueryNoModified()) { 
           fnsPayloadQueryNo = refreshFnsPayloadQueryNo();
        }
   		return fnsPayloadQueryNo;
	}
	
	/**
	 * 	Update FnsPayloadQueryNo with the passed value
	 *  Corresponding COBOL Variable is FNS-PAYLOAD-QUERY-NO
	 *	@param number
	 */
	public void setFnsPayloadQueryNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    fnsPayloadQueryNo = checkFnsPayloadQueryNoMaxLimit(number); 
		serializeFnsPayloadQueryNo(fnsPayloadQueryNo);
	}

	public void setFnsPayloadQueryNo(int number) {
	    number = checkFnsPayloadQueryNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFnsPayloadQueryNo((short)number);
	}
	public void setFnsPayloadQueryNo(long number) {
	    number = checkFnsPayloadQueryNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFnsPayloadQueryNo((short)number);
	}
	

	/**
	 *	Returns the value of fnsPayloadGftDsn
	 *	@return fnsPayloadGftDsn
	 */
   public char[] getFnsPayloadGftDsn() throws CFException{
     if (isFnsPayloadGftDsnModified()) { 
        fnsPayloadGftDsn = refreshFnsPayloadGftDsn();
     }
   		return fnsPayloadGftDsn;
   }

  
	/**
	*  set variable fnsPayloadGftDsn
	*  Corresponding COBOL Variable is FNS-PAYLOAD-GFT-DSN
	*  @param value
	**/
   public void setFnsPayloadGftDsn(char[] value) {
      fnsPayloadGftDsn = checkFnsPayloadGftDsnConstraints(value);
      serializeFnsPayloadGftDsn(fnsPayloadGftDsn);
   } 

     /**
	 * 	Update FnsPayloadGftDsn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadGftDsn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPayloadGftDsn,fnsPayloadGftDsn.length);
   	
   }
   
   public void setFnsPayloadGftDsn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadGftDsn,fnsPayloadGftDsn.length);
   	
   }
   
     /**
	 * 	Update FnsPayloadGftDsn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadGftDsn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadGftDsn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPayloadGftDsn with another Field
	 *	@param value
	 */
   public void setFnsPayloadGftDsn(Field source) {
       replace(source,0,source.length(),beginFnsPayloadGftDsn,FNS_PAYLOAD_GFT_DSN_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPayloadGftDsn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadGftDsn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPayloadGftDsn,FNS_PAYLOAD_GFT_DSN_LEN);
   	
   }
   
     /**
	 * 	Update FnsPayloadGftDsn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadGftDsn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadGftDsn+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPayloadLogicalSeq
	 *	@return fnsPayloadLogicalSeq
	 */
	public int getFnsPayloadLogicalSeq() throws CFException {
        if (isFnsPayloadLogicalSeqModified()) { 
           fnsPayloadLogicalSeq = refreshFnsPayloadLogicalSeq();
        }
   		return fnsPayloadLogicalSeq;
	}
	
	/**
	 * 	Update FnsPayloadLogicalSeq with the passed value
	 *  Corresponding COBOL Variable is FNS-PAYLOAD-LOGICAL-SEQ
	 *	@param number
	 */
	public void setFnsPayloadLogicalSeq(int number) {
	     // Truncate if the number is beyond +/- Max range
	    fnsPayloadLogicalSeq = checkFnsPayloadLogicalSeqMaxLimit(number); 
		serializeFnsPayloadLogicalSeq(fnsPayloadLogicalSeq);
	}


	public void setFnsPayloadLogicalSeq(long number) {
	    number = checkFnsPayloadLogicalSeqMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFnsPayloadLogicalSeq((int)number);
	}
	
	public int getFnsPayloadTxnNum() throws CFException {
        if (isFnsPayloadTxnNumModified()) { 
           fnsPayloadTxnNum = refreshFnsPayloadTxnNum();
        }
   		return fnsPayloadTxnNum;
	}
	
	/**
	 * 	Update FnsPayloadTxnNum with the passed value
	 *  Corresponding COBOL Variable is FNS-PAYLOAD-TXN-NUM
	 *	@param number
	 */
	public void setFnsPayloadTxnNum(int number) {
			fnsPayloadTxnNum = checkFnsPayloadTxnNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeFnsPayloadTxnNum(fnsPayloadTxnNum);
	}


	public void setFnsPayloadTxnNum(long number) {
	    number = checkFnsPayloadTxnNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFnsPayloadTxnNum((int)number);
	}
	
	/**
	 *	Returns the value of fnsPayloadFacCount
	 *	@return fnsPayloadFacCount
	 */
	public short getFnsPayloadFacCount() throws CFException {
        if (isFnsPayloadFacCountModified()) { 
           fnsPayloadFacCount = refreshFnsPayloadFacCount();
        }
   		return fnsPayloadFacCount;
	}
	
	/**
	 * 	Update FnsPayloadFacCount with the passed value
	 *  Corresponding COBOL Variable is FNS-PAYLOAD-FAC-COUNT
	 *	@param number
	 */
	public void setFnsPayloadFacCount(short number) {
	     // Truncate if the number is beyond +/- Max range
	    fnsPayloadFacCount = checkFnsPayloadFacCountMaxLimit(number); 
		serializeFnsPayloadFacCount(fnsPayloadFacCount);
	}

	public void setFnsPayloadFacCount(int number) {
	    number = checkFnsPayloadFacCountMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFnsPayloadFacCount((short)number);
	}
	public void setFnsPayloadFacCount(long number) {
	    number = checkFnsPayloadFacCountMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFnsPayloadFacCount((short)number);
	}
	

	/**
	 *	Returns the value of fnsPayloadFaaPanStatCd
	 *	@return fnsPayloadFaaPanStatCd
	 */
   public char[] getFnsPayloadFaaPanStatCd() throws CFException{
     if (isFnsPayloadFaaPanStatCdModified()) { 
        fnsPayloadFaaPanStatCd = refreshFnsPayloadFaaPanStatCd();
     }
   		return fnsPayloadFaaPanStatCd;
   }

  
	/**
	*  set variable fnsPayloadFaaPanStatCd
	*  Corresponding COBOL Variable is FNS-PAYLOAD-FAA-PAN-STAT-CD
	*  @param value
	**/
   public void setFnsPayloadFaaPanStatCd(char[] value) {
      fnsPayloadFaaPanStatCd = checkFnsPayloadFaaPanStatCdConstraints(value);
      serializeFnsPayloadFaaPanStatCd(fnsPayloadFaaPanStatCd);
   } 

     /**
	 * 	Update FnsPayloadFaaPanStatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadFaaPanStatCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPayloadFaaPanStatCd,fnsPayloadFaaPanStatCd.length);
   	
   }
   
   public void setFnsPayloadFaaPanStatCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadFaaPanStatCd,fnsPayloadFaaPanStatCd.length);
   	
   }
   
     /**
	 * 	Update FnsPayloadFaaPanStatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadFaaPanStatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadFaaPanStatCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPayloadFaaPanStatCd with another Field
	 *	@param value
	 */
   public void setFnsPayloadFaaPanStatCd(Field source) {
       replace(source,0,source.length(),beginFnsPayloadFaaPanStatCd,FNS_PAYLOAD_FAA_PAN_STAT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPayloadFaaPanStatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadFaaPanStatCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPayloadFaaPanStatCd,FNS_PAYLOAD_FAA_PAN_STAT_CD_LEN);
   	
   }
   
     /**
	 * 	Update FnsPayloadFaaPanStatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadFaaPanStatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadFaaPanStatCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPayloadFaaCloseDt
	 *	@return fnsPayloadFaaCloseDt
	 */
   public char[] getFnsPayloadFaaCloseDt() throws CFException{
     if (isFnsPayloadFaaCloseDtModified()) { 
        fnsPayloadFaaCloseDt = refreshFnsPayloadFaaCloseDt();
     }
   		return fnsPayloadFaaCloseDt;
   }

  
	/**
	*  set variable fnsPayloadFaaCloseDt
	*  Corresponding COBOL Variable is FNS-PAYLOAD-FAA-CLOSE-DT
	*  @param value
	**/
   public void setFnsPayloadFaaCloseDt(char[] value) {
      fnsPayloadFaaCloseDt = checkFnsPayloadFaaCloseDtConstraints(value);
      serializeFnsPayloadFaaCloseDt(fnsPayloadFaaCloseDt);
   } 

     /**
	 * 	Update FnsPayloadFaaCloseDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadFaaCloseDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPayloadFaaCloseDt,fnsPayloadFaaCloseDt.length);
   	
   }
   
   public void setFnsPayloadFaaCloseDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadFaaCloseDt,fnsPayloadFaaCloseDt.length);
   	
   }
   
     /**
	 * 	Update FnsPayloadFaaCloseDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadFaaCloseDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadFaaCloseDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPayloadFaaCloseDt with another Field
	 *	@param value
	 */
   public void setFnsPayloadFaaCloseDt(Field source) {
       replace(source,0,source.length(),beginFnsPayloadFaaCloseDt,FNS_PAYLOAD_FAA_CLOSE_DT_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPayloadFaaCloseDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPayloadFaaCloseDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPayloadFaaCloseDt,FNS_PAYLOAD_FAA_CLOSE_DT_LEN);
   	
   }
   
     /**
	 * 	Update FnsPayloadFaaCloseDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadFaaCloseDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPayloadFaaCloseDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPayloadFnsDataFields
	 *	@return fnsPayloadFnsDataFields
	 */   
	 public FnsPayloadFnsDataFields getFnsPayloadFnsDataFields() {
   	return fnsPayloadFnsDataFields;
   }
   /**
	* 	Update FnsPayloadFnsDataFields with the passed value
	*   Corresponding COBOL Variable is FNS-PAYLOAD-FNS-DATA-FIELDS
	*	@param value
	*/
   public void setFnsPayloadFnsDataFields(char[] value) {
      fnsPayloadFnsDataFields.setString(value); 
   }   
    
     /**
	 * 	Update FnsPayloadFnsDataFields 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadFnsDataFields(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fnsPayloadFnsDataFields.begin,fnsPayloadFnsDataFields.length());
   }
   
     /**
	 * 	Update FnsPayloadFnsDataFields 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadFnsDataFields(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fnsPayloadFnsDataFields.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FnsPayloadFnsDataFields with another Field
	 *	@param value
	 */
   public void setFnsPayloadFnsDataFields(Field source) {
   	replace(source,0,source.length(),fnsPayloadFnsDataFields.begin,fnsPayloadFnsDataFields.length());
   }  
   
     /**
	 * 	Update FnsPayloadFnsDataFields 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFnsPayloadFnsDataFields(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fnsPayloadFnsDataFields.begin,fnsPayloadFnsDataFields.length());
   }
   
     /**
	 * 	Update FnsPayloadFnsDataFields 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPayloadFnsDataFields(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fnsPayloadFnsDataFields.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes FnsPayload
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setFnsPayloadQueryNo((short)0);
         setFnsPayloadGftDsn(CONSTANTS.SPACE_44);
                     setFnsPayloadLogicalSeq(0);
                     setFnsPayloadTxnNum(0);
         	setFnsPayloadFacCount((short)0);
         setFnsPayloadFaaPanStatCd(CONSTANTS.SPACE);
         setFnsPayloadFaaCloseDt(CONSTANTS.SPACE_10);
          fnsPayloadFnsDataFields.initialize();
     
   }

		public static int getFnsPayloadFieldLength() {
			return FNS_PAYLOAD_LENGTH;
		}

}
  
