package com.cloudframe.app.ar640010.dto;

/**
*  The class Taraefp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Taraefp extends TaraefpSerialized {
   

						private char[] taraefpEndptId = Field.fillLowValue(7);

						private char[] taraefpBulkId = Field.fillLowValue(4);

								private short taraefpCyclNum;

								private short taraefpAppFileRtnNum;

								private short taraefpPrtyNum;

						private char[] taraefpTrnsltnSw = Field.fillLowValue(1);

						private char[] taraefpTrnsltnRtnNam = Field.fillLowValue(50);

						private char[] taraefpXferTypeCd = Field.fillLowValue(1);

						private char[] taraefpStatusCd = Field.fillLowValue(1);
	
	/**
	* Constructor for Taraefp
	**/
    public Taraefp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of taraefpEndptId
	 *	@return taraefpEndptId
	 */
   public char[] getTaraefpEndptId() throws CFException{
     if (isTaraefpEndptIdModified()) { 
        taraefpEndptId = refreshTaraefpEndptId();
     }
   		return taraefpEndptId;
   }

  
	/**
	*  set variable taraefpEndptId
	*  Corresponding COBOL Variable is TARAEFP-ENDPT-ID
	*  @param value
	**/
   public void setTaraefpEndptId(char[] value) {
      taraefpEndptId = checkTaraefpEndptIdConstraints(value);
      serializeTaraefpEndptId(taraefpEndptId);
   } 

     /**
	 * 	Update TaraefpEndptId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraefpEndptId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraefpEndptId,taraefpEndptId.length);
   	
   }
   
   public void setTaraefpEndptId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraefpEndptId,taraefpEndptId.length);
   	
   }
   
     /**
	 * 	Update TaraefpEndptId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraefpEndptId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraefpEndptId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraefpEndptId with another Field
	 *	@param value
	 */
   public void setTaraefpEndptId(Field source) {
       replace(source,0,source.length(),beginTaraefpEndptId,TARAEFP_ENDPT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TaraefpEndptId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraefpEndptId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraefpEndptId,TARAEFP_ENDPT_ID_LEN);
   	
   }
   
     /**
	 * 	Update TaraefpEndptId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraefpEndptId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraefpEndptId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraefpBulkId
	 *	@return taraefpBulkId
	 */
   public char[] getTaraefpBulkId() throws CFException{
     if (isTaraefpBulkIdModified()) { 
        taraefpBulkId = refreshTaraefpBulkId();
     }
   		return taraefpBulkId;
   }

  
	/**
	*  set variable taraefpBulkId
	*  Corresponding COBOL Variable is TARAEFP-BULK-ID
	*  @param value
	**/
   public void setTaraefpBulkId(char[] value) {
      taraefpBulkId = checkTaraefpBulkIdConstraints(value);
      serializeTaraefpBulkId(taraefpBulkId);
   } 

     /**
	 * 	Update TaraefpBulkId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraefpBulkId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraefpBulkId,taraefpBulkId.length);
   	
   }
   
   public void setTaraefpBulkId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraefpBulkId,taraefpBulkId.length);
   	
   }
   
     /**
	 * 	Update TaraefpBulkId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraefpBulkId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraefpBulkId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraefpBulkId with another Field
	 *	@param value
	 */
   public void setTaraefpBulkId(Field source) {
       replace(source,0,source.length(),beginTaraefpBulkId,TARAEFP_BULK_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TaraefpBulkId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraefpBulkId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraefpBulkId,TARAEFP_BULK_ID_LEN);
   	
   }
   
     /**
	 * 	Update TaraefpBulkId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraefpBulkId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraefpBulkId+targetIndex,targetLen);
    
   }
	public short getTaraefpCyclNum() throws CFException {
        if (isTaraefpCyclNumModified()) { 
           taraefpCyclNum = refreshTaraefpCyclNum();
        }
   		return taraefpCyclNum;
	}
	
	/**
	 * 	Update TaraefpCyclNum with the passed value
	 *  Corresponding COBOL Variable is TARAEFP-CYCL-NUM
	 *	@param number
	 */
	public void setTaraefpCyclNum(short number) {
			taraefpCyclNum = checkTaraefpCyclNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTaraefpCyclNum(taraefpCyclNum);
	}

	public void setTaraefpCyclNum(int number) {
	    number = checkTaraefpCyclNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraefpCyclNum((short)number);
	}
	public void setTaraefpCyclNum(long number) {
	    number = checkTaraefpCyclNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraefpCyclNum((short)number);
	}
	

	public short getTaraefpAppFileRtnNum() throws CFException {
        if (isTaraefpAppFileRtnNumModified()) { 
           taraefpAppFileRtnNum = refreshTaraefpAppFileRtnNum();
        }
   		return taraefpAppFileRtnNum;
	}
	
	/**
	 * 	Update TaraefpAppFileRtnNum with the passed value
	 *  Corresponding COBOL Variable is TARAEFP-APP-FILE-RTN-NUM
	 *	@param number
	 */
	public void setTaraefpAppFileRtnNum(short number) {
			taraefpAppFileRtnNum = checkTaraefpAppFileRtnNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTaraefpAppFileRtnNum(taraefpAppFileRtnNum);
	}

	public void setTaraefpAppFileRtnNum(int number) {
	    number = checkTaraefpAppFileRtnNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraefpAppFileRtnNum((short)number);
	}
	public void setTaraefpAppFileRtnNum(long number) {
	    number = checkTaraefpAppFileRtnNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraefpAppFileRtnNum((short)number);
	}
	

	public short getTaraefpPrtyNum() throws CFException {
        if (isTaraefpPrtyNumModified()) { 
           taraefpPrtyNum = refreshTaraefpPrtyNum();
        }
   		return taraefpPrtyNum;
	}
	
	/**
	 * 	Update TaraefpPrtyNum with the passed value
	 *  Corresponding COBOL Variable is TARAEFP-PRTY-NUM
	 *	@param number
	 */
	public void setTaraefpPrtyNum(short number) {
			taraefpPrtyNum = checkTaraefpPrtyNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTaraefpPrtyNum(taraefpPrtyNum);
	}

	public void setTaraefpPrtyNum(int number) {
	    number = checkTaraefpPrtyNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraefpPrtyNum((short)number);
	}
	public void setTaraefpPrtyNum(long number) {
	    number = checkTaraefpPrtyNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraefpPrtyNum((short)number);
	}
	

	/**
	 *	Returns the value of taraefpTrnsltnSw
	 *	@return taraefpTrnsltnSw
	 */
   public char[] getTaraefpTrnsltnSw() throws CFException{
     if (isTaraefpTrnsltnSwModified()) { 
        taraefpTrnsltnSw = refreshTaraefpTrnsltnSw();
     }
   		return taraefpTrnsltnSw;
   }

  
	/**
	*  set variable taraefpTrnsltnSw
	*  Corresponding COBOL Variable is TARAEFP-TRNSLTN-SW
	*  @param value
	**/
   public void setTaraefpTrnsltnSw(char[] value) {
      taraefpTrnsltnSw = checkTaraefpTrnsltnSwConstraints(value);
      serializeTaraefpTrnsltnSw(taraefpTrnsltnSw);
   } 

     /**
	 * 	Update TaraefpTrnsltnSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraefpTrnsltnSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraefpTrnsltnSw,taraefpTrnsltnSw.length);
   	
   }
   
   public void setTaraefpTrnsltnSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraefpTrnsltnSw,taraefpTrnsltnSw.length);
   	
   }
   
     /**
	 * 	Update TaraefpTrnsltnSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraefpTrnsltnSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraefpTrnsltnSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraefpTrnsltnSw with another Field
	 *	@param value
	 */
   public void setTaraefpTrnsltnSw(Field source) {
       replace(source,0,source.length(),beginTaraefpTrnsltnSw,TARAEFP_TRNSLTN_SW_LEN);
   	
   }  
   
     /**
	 * 	Update TaraefpTrnsltnSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraefpTrnsltnSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraefpTrnsltnSw,TARAEFP_TRNSLTN_SW_LEN);
   	
   }
   
     /**
	 * 	Update TaraefpTrnsltnSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraefpTrnsltnSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraefpTrnsltnSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraefpTrnsltnRtnNam
	 *	@return taraefpTrnsltnRtnNam
	 */
   public char[] getTaraefpTrnsltnRtnNam() throws CFException{
     if (isTaraefpTrnsltnRtnNamModified()) { 
        taraefpTrnsltnRtnNam = refreshTaraefpTrnsltnRtnNam();
     }
   		return taraefpTrnsltnRtnNam;
   }

  
	/**
	*  set variable taraefpTrnsltnRtnNam
	*  Corresponding COBOL Variable is TARAEFP-TRNSLTN-RTN-NAM
	*  @param value
	**/
   public void setTaraefpTrnsltnRtnNam(char[] value) {
      taraefpTrnsltnRtnNam = checkTaraefpTrnsltnRtnNamConstraints(value);
      serializeTaraefpTrnsltnRtnNam(taraefpTrnsltnRtnNam);
   } 

     /**
	 * 	Update TaraefpTrnsltnRtnNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraefpTrnsltnRtnNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraefpTrnsltnRtnNam,taraefpTrnsltnRtnNam.length);
   	
   }
   
   public void setTaraefpTrnsltnRtnNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraefpTrnsltnRtnNam,taraefpTrnsltnRtnNam.length);
   	
   }
   
     /**
	 * 	Update TaraefpTrnsltnRtnNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraefpTrnsltnRtnNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraefpTrnsltnRtnNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraefpTrnsltnRtnNam with another Field
	 *	@param value
	 */
   public void setTaraefpTrnsltnRtnNam(Field source) {
       replace(source,0,source.length(),beginTaraefpTrnsltnRtnNam,TARAEFP_TRNSLTN_RTN_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TaraefpTrnsltnRtnNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraefpTrnsltnRtnNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraefpTrnsltnRtnNam,TARAEFP_TRNSLTN_RTN_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TaraefpTrnsltnRtnNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraefpTrnsltnRtnNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraefpTrnsltnRtnNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraefpXferTypeCd
	 *	@return taraefpXferTypeCd
	 */
   public char[] getTaraefpXferTypeCd() throws CFException{
     if (isTaraefpXferTypeCdModified()) { 
        taraefpXferTypeCd = refreshTaraefpXferTypeCd();
     }
   		return taraefpXferTypeCd;
   }

  
	/**
	*  set variable taraefpXferTypeCd
	*  Corresponding COBOL Variable is TARAEFP-XFER-TYPE-CD
	*  @param value
	**/
   public void setTaraefpXferTypeCd(char[] value) {
      taraefpXferTypeCd = checkTaraefpXferTypeCdConstraints(value);
      serializeTaraefpXferTypeCd(taraefpXferTypeCd);
   } 

     /**
	 * 	Update TaraefpXferTypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraefpXferTypeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraefpXferTypeCd,taraefpXferTypeCd.length);
   	
   }
   
   public void setTaraefpXferTypeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraefpXferTypeCd,taraefpXferTypeCd.length);
   	
   }
   
     /**
	 * 	Update TaraefpXferTypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraefpXferTypeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraefpXferTypeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraefpXferTypeCd with another Field
	 *	@param value
	 */
   public void setTaraefpXferTypeCd(Field source) {
       replace(source,0,source.length(),beginTaraefpXferTypeCd,TARAEFP_XFER_TYPE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TaraefpXferTypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraefpXferTypeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraefpXferTypeCd,TARAEFP_XFER_TYPE_CD_LEN);
   	
   }
   
     /**
	 * 	Update TaraefpXferTypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraefpXferTypeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraefpXferTypeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of taraefpStatusCd
	 *	@return taraefpStatusCd
	 */
   public char[] getTaraefpStatusCd() throws CFException{
     if (isTaraefpStatusCdModified()) { 
        taraefpStatusCd = refreshTaraefpStatusCd();
     }
   		return taraefpStatusCd;
   }

  
	/**
	*  set variable taraefpStatusCd
	*  Corresponding COBOL Variable is TARAEFP-STATUS-CD
	*  @param value
	**/
   public void setTaraefpStatusCd(char[] value) {
      taraefpStatusCd = checkTaraefpStatusCdConstraints(value);
      serializeTaraefpStatusCd(taraefpStatusCd);
   } 

     /**
	 * 	Update TaraefpStatusCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraefpStatusCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraefpStatusCd,taraefpStatusCd.length);
   	
   }
   
   public void setTaraefpStatusCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraefpStatusCd,taraefpStatusCd.length);
   	
   }
   
     /**
	 * 	Update TaraefpStatusCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraefpStatusCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraefpStatusCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraefpStatusCd with another Field
	 *	@param value
	 */
   public void setTaraefpStatusCd(Field source) {
       replace(source,0,source.length(),beginTaraefpStatusCd,TARAEFP_STATUS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TaraefpStatusCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraefpStatusCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraefpStatusCd,TARAEFP_STATUS_CD_LEN);
   	
   }
   
     /**
	 * 	Update TaraefpStatusCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraefpStatusCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraefpStatusCd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTaraefpFieldLength() {
			return TARAEFP_LENGTH;
		}

}
  
