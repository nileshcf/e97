package com.cloudframe.app.ar640010.dto;

/**
*  The class Tarafpl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Tarafpl extends TarafplSerialized { 
   

						private char[] tarafplBulkId = Field.fillLowValue(4);

						private char[] tarafplTtlNam = Field.fillLowValue(50);

								private short tarafplPrtyNum;

						private char[] tarafplAlctnSpcTypeCd = Field.fillLowValue(1);

								private int tarafplAlctnSpcPrimNum;

						private char[] tarafplSndRcvPrmsnCd = Field.fillLowValue(1);

								private int tarafplRecLenNum;

						private char[] tarafplRecFrmtCd = Field.fillLowValue(2);

								private int tarafplBulkFileSzNum;

						private char[] tarafplSystemId = Field.fillLowValue(2);

						private char[] tarafplAppEndptId = Field.fillLowValue(7);
	
	/**
	* Constructor for Tarafpl
	**/
    public Tarafpl() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of tarafplBulkId
	 *	@return tarafplBulkId
	 */
   public char[] getTarafplBulkId() throws CFException{
     if (isTarafplBulkIdModified()) { 
        tarafplBulkId = refreshTarafplBulkId();
     }
   		return tarafplBulkId;
   }

  
	/**
	*  set variable tarafplBulkId
	*  Corresponding COBOL Variable is TARAFPL-BULK-ID
	*  @param value
	**/
   public void setTarafplBulkId(char[] value) {
      tarafplBulkId = checkTarafplBulkIdConstraints(value);
      serializeTarafplBulkId(tarafplBulkId);
   } 

     /**
	 * 	Update TarafplBulkId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafplBulkId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafplBulkId,tarafplBulkId.length);
   	
   }
   
   public void setTarafplBulkId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafplBulkId,tarafplBulkId.length);
   	
   }
   
     /**
	 * 	Update TarafplBulkId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafplBulkId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafplBulkId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafplBulkId with another Field
	 *	@param value
	 */
   public void setTarafplBulkId(Field source) {
       replace(source,0,source.length(),beginTarafplBulkId,TARAFPL_BULK_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafplBulkId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafplBulkId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafplBulkId,TARAFPL_BULK_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafplBulkId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafplBulkId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafplBulkId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafplTtlNam
	 *	@return tarafplTtlNam
	 */
   public char[] getTarafplTtlNam() throws CFException{
     if (isTarafplTtlNamModified()) { 
        tarafplTtlNam = refreshTarafplTtlNam();
     }
   		return tarafplTtlNam;
   }

  
	/**
	*  set variable tarafplTtlNam
	*  Corresponding COBOL Variable is TARAFPL-TTL-NAM
	*  @param value
	**/
   public void setTarafplTtlNam(char[] value) {
      tarafplTtlNam = checkTarafplTtlNamConstraints(value);
      serializeTarafplTtlNam(tarafplTtlNam);
   } 

     /**
	 * 	Update TarafplTtlNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafplTtlNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafplTtlNam,tarafplTtlNam.length);
   	
   }
   
   public void setTarafplTtlNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafplTtlNam,tarafplTtlNam.length);
   	
   }
   
     /**
	 * 	Update TarafplTtlNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafplTtlNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafplTtlNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafplTtlNam with another Field
	 *	@param value
	 */
   public void setTarafplTtlNam(Field source) {
       replace(source,0,source.length(),beginTarafplTtlNam,TARAFPL_TTL_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update TarafplTtlNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafplTtlNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafplTtlNam,TARAFPL_TTL_NAM_LEN);
   	
   }
   
     /**
	 * 	Update TarafplTtlNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafplTtlNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafplTtlNam+targetIndex,targetLen);
    
   }
	public short getTarafplPrtyNum() throws CFException {
        if (isTarafplPrtyNumModified()) { 
           tarafplPrtyNum = refreshTarafplPrtyNum();
        }
   		return tarafplPrtyNum;
	}
	
	/**
	 * 	Update TarafplPrtyNum with the passed value
	 *  Corresponding COBOL Variable is TARAFPL-PRTY-NUM
	 *	@param number
	 */
	public void setTarafplPrtyNum(short number) {
			tarafplPrtyNum = checkTarafplPrtyNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTarafplPrtyNum(tarafplPrtyNum);
	}

	public void setTarafplPrtyNum(int number) {
	    number = checkTarafplPrtyNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafplPrtyNum((short)number);
	}
	public void setTarafplPrtyNum(long number) {
	    number = checkTarafplPrtyNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafplPrtyNum((short)number);
	}
	

	/**
	 *	Returns the value of tarafplAlctnSpcTypeCd
	 *	@return tarafplAlctnSpcTypeCd
	 */
   public char[] getTarafplAlctnSpcTypeCd() throws CFException{
     if (isTarafplAlctnSpcTypeCdModified()) { 
        tarafplAlctnSpcTypeCd = refreshTarafplAlctnSpcTypeCd();
     }
   		return tarafplAlctnSpcTypeCd;
   }

  
	/**
	*  set variable tarafplAlctnSpcTypeCd
	*  Corresponding COBOL Variable is TARAFPL-ALCTN-SPC-TYPE-CD
	*  @param value
	**/
   public void setTarafplAlctnSpcTypeCd(char[] value) {
      tarafplAlctnSpcTypeCd = checkTarafplAlctnSpcTypeCdConstraints(value);
      serializeTarafplAlctnSpcTypeCd(tarafplAlctnSpcTypeCd);
   } 

     /**
	 * 	Update TarafplAlctnSpcTypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafplAlctnSpcTypeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafplAlctnSpcTypeCd,tarafplAlctnSpcTypeCd.length);
   	
   }
   
   public void setTarafplAlctnSpcTypeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafplAlctnSpcTypeCd,tarafplAlctnSpcTypeCd.length);
   	
   }
   
     /**
	 * 	Update TarafplAlctnSpcTypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafplAlctnSpcTypeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafplAlctnSpcTypeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafplAlctnSpcTypeCd with another Field
	 *	@param value
	 */
   public void setTarafplAlctnSpcTypeCd(Field source) {
       replace(source,0,source.length(),beginTarafplAlctnSpcTypeCd,TARAFPL_ALCTN_SPC_TYPE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TarafplAlctnSpcTypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafplAlctnSpcTypeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafplAlctnSpcTypeCd,TARAFPL_ALCTN_SPC_TYPE_CD_LEN);
   	
   }
   
     /**
	 * 	Update TarafplAlctnSpcTypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafplAlctnSpcTypeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafplAlctnSpcTypeCd+targetIndex,targetLen);
    
   }
	public int getTarafplAlctnSpcPrimNum() throws CFException {
        if (isTarafplAlctnSpcPrimNumModified()) { 
           tarafplAlctnSpcPrimNum = refreshTarafplAlctnSpcPrimNum();
        }
   		return tarafplAlctnSpcPrimNum;
	}
	
	/**
	 * 	Update TarafplAlctnSpcPrimNum with the passed value
	 *  Corresponding COBOL Variable is TARAFPL-ALCTN-SPC-PRIM-NUM
	 *	@param number
	 */
	public void setTarafplAlctnSpcPrimNum(int number) {
			tarafplAlctnSpcPrimNum = checkTarafplAlctnSpcPrimNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTarafplAlctnSpcPrimNum(tarafplAlctnSpcPrimNum);
	}


	public void setTarafplAlctnSpcPrimNum(long number) {
	    number = checkTarafplAlctnSpcPrimNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTarafplAlctnSpcPrimNum((int)number);
	}
	
	/**
	 *	Returns the value of tarafplSndRcvPrmsnCd
	 *	@return tarafplSndRcvPrmsnCd
	 */
   public char[] getTarafplSndRcvPrmsnCd() throws CFException{
     if (isTarafplSndRcvPrmsnCdModified()) { 
        tarafplSndRcvPrmsnCd = refreshTarafplSndRcvPrmsnCd();
     }
   		return tarafplSndRcvPrmsnCd;
   }

  
	/**
	*  set variable tarafplSndRcvPrmsnCd
	*  Corresponding COBOL Variable is TARAFPL-SND-RCV-PRMSN-CD
	*  @param value
	**/
   public void setTarafplSndRcvPrmsnCd(char[] value) {
      tarafplSndRcvPrmsnCd = checkTarafplSndRcvPrmsnCdConstraints(value);
      serializeTarafplSndRcvPrmsnCd(tarafplSndRcvPrmsnCd);
   } 

     /**
	 * 	Update TarafplSndRcvPrmsnCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafplSndRcvPrmsnCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafplSndRcvPrmsnCd,tarafplSndRcvPrmsnCd.length);
   	
   }
   
   public void setTarafplSndRcvPrmsnCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafplSndRcvPrmsnCd,tarafplSndRcvPrmsnCd.length);
   	
   }
   
     /**
	 * 	Update TarafplSndRcvPrmsnCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafplSndRcvPrmsnCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafplSndRcvPrmsnCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafplSndRcvPrmsnCd with another Field
	 *	@param value
	 */
   public void setTarafplSndRcvPrmsnCd(Field source) {
       replace(source,0,source.length(),beginTarafplSndRcvPrmsnCd,TARAFPL_SND_RCV_PRMSN_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TarafplSndRcvPrmsnCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafplSndRcvPrmsnCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafplSndRcvPrmsnCd,TARAFPL_SND_RCV_PRMSN_CD_LEN);
   	
   }
   
     /**
	 * 	Update TarafplSndRcvPrmsnCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafplSndRcvPrmsnCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafplSndRcvPrmsnCd+targetIndex,targetLen);
    
   }
	public int getTarafplRecLenNum() throws CFException {
        if (isTarafplRecLenNumModified()) { 
           tarafplRecLenNum = refreshTarafplRecLenNum();
        }
   		return tarafplRecLenNum;
	}
	
	/**
	 * 	Update TarafplRecLenNum with the passed value
	 *  Corresponding COBOL Variable is TARAFPL-REC-LEN-NUM
	 *	@param number
	 */
	public void setTarafplRecLenNum(int number) {
			tarafplRecLenNum = checkTarafplRecLenNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTarafplRecLenNum(tarafplRecLenNum);
	}


	public void setTarafplRecLenNum(long number) {
	    number = checkTarafplRecLenNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTarafplRecLenNum((int)number);
	}
	
	/**
	 *	Returns the value of tarafplRecFrmtCd
	 *	@return tarafplRecFrmtCd
	 */
   public char[] getTarafplRecFrmtCd() throws CFException{
     if (isTarafplRecFrmtCdModified()) { 
        tarafplRecFrmtCd = refreshTarafplRecFrmtCd();
     }
   		return tarafplRecFrmtCd;
   }

  
	/**
	*  set variable tarafplRecFrmtCd
	*  Corresponding COBOL Variable is TARAFPL-REC-FRMT-CD
	*  @param value
	**/
   public void setTarafplRecFrmtCd(char[] value) {
      tarafplRecFrmtCd = checkTarafplRecFrmtCdConstraints(value);
      serializeTarafplRecFrmtCd(tarafplRecFrmtCd);
   } 

     /**
	 * 	Update TarafplRecFrmtCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafplRecFrmtCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafplRecFrmtCd,tarafplRecFrmtCd.length);
   	
   }
   
   public void setTarafplRecFrmtCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafplRecFrmtCd,tarafplRecFrmtCd.length);
   	
   }
   
     /**
	 * 	Update TarafplRecFrmtCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafplRecFrmtCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafplRecFrmtCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafplRecFrmtCd with another Field
	 *	@param value
	 */
   public void setTarafplRecFrmtCd(Field source) {
       replace(source,0,source.length(),beginTarafplRecFrmtCd,TARAFPL_REC_FRMT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update TarafplRecFrmtCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafplRecFrmtCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafplRecFrmtCd,TARAFPL_REC_FRMT_CD_LEN);
   	
   }
   
     /**
	 * 	Update TarafplRecFrmtCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafplRecFrmtCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafplRecFrmtCd+targetIndex,targetLen);
    
   }
	public int getTarafplBulkFileSzNum() throws CFException {
        if (isTarafplBulkFileSzNumModified()) { 
           tarafplBulkFileSzNum = refreshTarafplBulkFileSzNum();
        }
   		return tarafplBulkFileSzNum;
	}
	
	/**
	 * 	Update TarafplBulkFileSzNum with the passed value
	 *  Corresponding COBOL Variable is TARAFPL-BULK-FILE-SZ-NUM
	 *	@param number
	 */
	public void setTarafplBulkFileSzNum(int number) {
			tarafplBulkFileSzNum = checkTarafplBulkFileSzNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTarafplBulkFileSzNum(tarafplBulkFileSzNum);
	}


	public void setTarafplBulkFileSzNum(long number) {
	    number = checkTarafplBulkFileSzNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setTarafplBulkFileSzNum((int)number);
	}
	
	/**
	 *	Returns the value of tarafplSystemId
	 *	@return tarafplSystemId
	 */
   public char[] getTarafplSystemId() throws CFException{
     if (isTarafplSystemIdModified()) { 
        tarafplSystemId = refreshTarafplSystemId();
     }
   		return tarafplSystemId;
   }

  
	/**
	*  set variable tarafplSystemId
	*  Corresponding COBOL Variable is TARAFPL-SYSTEM-ID
	*  @param value
	**/
   public void setTarafplSystemId(char[] value) {
      tarafplSystemId = checkTarafplSystemIdConstraints(value);
      serializeTarafplSystemId(tarafplSystemId);
   } 

     /**
	 * 	Update TarafplSystemId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafplSystemId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafplSystemId,tarafplSystemId.length);
   	
   }
   
   public void setTarafplSystemId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafplSystemId,tarafplSystemId.length);
   	
   }
   
     /**
	 * 	Update TarafplSystemId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafplSystemId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafplSystemId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafplSystemId with another Field
	 *	@param value
	 */
   public void setTarafplSystemId(Field source) {
       replace(source,0,source.length(),beginTarafplSystemId,TARAFPL_SYSTEM_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafplSystemId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafplSystemId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafplSystemId,TARAFPL_SYSTEM_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafplSystemId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafplSystemId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafplSystemId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarafplAppEndptId
	 *	@return tarafplAppEndptId
	 */
   public char[] getTarafplAppEndptId() throws CFException{
     if (isTarafplAppEndptIdModified()) { 
        tarafplAppEndptId = refreshTarafplAppEndptId();
     }
   		return tarafplAppEndptId;
   }

  
	/**
	*  set variable tarafplAppEndptId
	*  Corresponding COBOL Variable is TARAFPL-APP-ENDPT-ID
	*  @param value
	**/
   public void setTarafplAppEndptId(char[] value) {
      tarafplAppEndptId = checkTarafplAppEndptIdConstraints(value);
      serializeTarafplAppEndptId(tarafplAppEndptId);
   } 

     /**
	 * 	Update TarafplAppEndptId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafplAppEndptId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafplAppEndptId,tarafplAppEndptId.length);
   	
   }
   
   public void setTarafplAppEndptId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafplAppEndptId,tarafplAppEndptId.length);
   	
   }
   
     /**
	 * 	Update TarafplAppEndptId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafplAppEndptId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafplAppEndptId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafplAppEndptId with another Field
	 *	@param value
	 */
   public void setTarafplAppEndptId(Field source) {
       replace(source,0,source.length(),beginTarafplAppEndptId,TARAFPL_APP_ENDPT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarafplAppEndptId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafplAppEndptId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafplAppEndptId,TARAFPL_APP_ENDPT_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarafplAppEndptId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafplAppEndptId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafplAppEndptId+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTarafplFieldLength() {
			return TARAFPL_LENGTH;
		}

}
  
