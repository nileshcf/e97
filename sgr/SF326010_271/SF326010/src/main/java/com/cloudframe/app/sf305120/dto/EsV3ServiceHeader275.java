package com.cloudframe.app.sf305120.dto;

/**
*  The class EsV3ServiceHeader275 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class EsV3ServiceHeader275 extends EsV3ServiceHeader275Serialized {
   

						private char[] esV3SrvId275 = new char[4];

						private char[] esV3SrvreqId275 = new char[6];

						private char[] esV3SrvVersion275 = new char[1];

						private char[] esV3SiHdrLnth275 = new char[1];

						private char[] esV3SrvStatus275 = new char[1];

						private char[] esV3StatusRc275 = new char[1];

								private short esV3SrvDataLnth275;

						private char[] esV3PayloadSpec275 = new char[1];

								private short esV3PayloadLnth275;

						private char[] esV3PayloadData275 = new char[1000];
	
	/**
	* Constructor for EsV3ServiceHeader275
	**/
    public EsV3ServiceHeader275() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setEsV3SrvId275(fillSpace(4));
								setEsV3SrvreqId275(fillSpace(6));
								setEsV3SrvVersion275(fillLowValue(1));
								setEsV3SiHdrLnth275(fillLowValue(1));
								setEsV3SrvStatus275(fillSpace(1));
								setEsV3StatusRc275(fillLowValue(1));
								setEsV3SrvDataLnth275((short)0);
								setEsV3PayloadSpec275(fillLowValue(1));
								setEsV3PayloadLnth275((short)0);
								setEsV3PayloadData275(fillLowValue(1000));
    }


 

	/**
	 *	Returns the value of esV3SrvId275
	 *	@return esV3SrvId275
	 */
   public char[] getEsV3SrvId275() throws CFException{
     if (isEsV3SrvId275Modified()) { 
        esV3SrvId275 = refreshEsV3SrvId275();
     }
   		return esV3SrvId275;
   }

  
	/**
	*  set variable esV3SrvId275
	*  Corresponding COBOL Variable is 275-ES-V3-SRV-ID
	*  @param value
	**/
   public void setEsV3SrvId275(char[] value) {
      esV3SrvId275 = checkEsV3SrvId275Constraints(value);
      serializeEsV3SrvId275(esV3SrvId275);
   } 

     /**
	 * 	Update EsV3SrvId275 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV3SrvId275(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsV3SrvId275,esV3SrvId275.length);
   	
   }
   
   public void setEsV3SrvId275(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3SrvId275,esV3SrvId275.length);
   	
   }
   
     /**
	 * 	Update EsV3SrvId275 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV3SrvId275(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3SrvId275+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsV3SrvId275 with another Field
	 *	@param value
	 */
   public void setEsV3SrvId275(Field source) {
       replace(source,0,source.length(),beginEsV3SrvId275,ES_V_3_SRV_ID_275_LEN);
   	
   }  
   
     /**
	 * 	Update EsV3SrvId275 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV3SrvId275(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsV3SrvId275,ES_V_3_SRV_ID_275_LEN);
   	
   }
   
     /**
	 * 	Update EsV3SrvId275 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV3SrvId275(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3SrvId275+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of esV3SrvreqId275
	 *	@return esV3SrvreqId275
	 */
   public char[] getEsV3SrvreqId275() throws CFException{
     if (isEsV3SrvreqId275Modified()) { 
        esV3SrvreqId275 = refreshEsV3SrvreqId275();
     }
   		return esV3SrvreqId275;
   }

  
	/**
	*  set variable esV3SrvreqId275
	*  Corresponding COBOL Variable is 275-ES-V3-SRVREQ-ID
	*  @param value
	**/
   public void setEsV3SrvreqId275(char[] value) {
      esV3SrvreqId275 = checkEsV3SrvreqId275Constraints(value);
      serializeEsV3SrvreqId275(esV3SrvreqId275);
   } 

     /**
	 * 	Update EsV3SrvreqId275 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV3SrvreqId275(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsV3SrvreqId275,esV3SrvreqId275.length);
   	
   }
   
   public void setEsV3SrvreqId275(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3SrvreqId275,esV3SrvreqId275.length);
   	
   }
   
     /**
	 * 	Update EsV3SrvreqId275 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV3SrvreqId275(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3SrvreqId275+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsV3SrvreqId275 with another Field
	 *	@param value
	 */
   public void setEsV3SrvreqId275(Field source) {
       replace(source,0,source.length(),beginEsV3SrvreqId275,ES_V_3_SRVREQ_ID_275_LEN);
   	
   }  
   
     /**
	 * 	Update EsV3SrvreqId275 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV3SrvreqId275(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsV3SrvreqId275,ES_V_3_SRVREQ_ID_275_LEN);
   	
   }
   
     /**
	 * 	Update EsV3SrvreqId275 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV3SrvreqId275(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3SrvreqId275+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of esV3SrvVersion275
	 *	@return esV3SrvVersion275
	 */
   public char[] getEsV3SrvVersion275() throws CFException{
     if (isEsV3SrvVersion275Modified()) { 
        esV3SrvVersion275 = refreshEsV3SrvVersion275();
     }
   		return esV3SrvVersion275;
   }

  
	/**
	*  set variable esV3SrvVersion275
	*  Corresponding COBOL Variable is 275-ES-V3-SRV-VERSION
	*  @param value
	**/
   public void setEsV3SrvVersion275(char[] value) {
      esV3SrvVersion275 = checkEsV3SrvVersion275Constraints(value);
      serializeEsV3SrvVersion275(esV3SrvVersion275);
   } 

     /**
	 * 	Update EsV3SrvVersion275 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV3SrvVersion275(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsV3SrvVersion275,esV3SrvVersion275.length);
   	
   }
   
   public void setEsV3SrvVersion275(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3SrvVersion275,esV3SrvVersion275.length);
   	
   }
   
     /**
	 * 	Update EsV3SrvVersion275 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV3SrvVersion275(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3SrvVersion275+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsV3SrvVersion275 with another Field
	 *	@param value
	 */
   public void setEsV3SrvVersion275(Field source) {
       replace(source,0,source.length(),beginEsV3SrvVersion275,ES_V_3_SRV_VERSION_275_LEN);
   	
   }  
   
     /**
	 * 	Update EsV3SrvVersion275 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV3SrvVersion275(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsV3SrvVersion275,ES_V_3_SRV_VERSION_275_LEN);
   	
   }
   
     /**
	 * 	Update EsV3SrvVersion275 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV3SrvVersion275(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3SrvVersion275+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of esV3SiHdrLnth275
	 *	@return esV3SiHdrLnth275
	 */
   public char[] getEsV3SiHdrLnth275() throws CFException{
     if (isEsV3SiHdrLnth275Modified()) { 
        esV3SiHdrLnth275 = refreshEsV3SiHdrLnth275();
     }
   		return esV3SiHdrLnth275;
   }

  
	/**
	*  set variable esV3SiHdrLnth275
	*  Corresponding COBOL Variable is 275-ES-V3-SI-HDR-LNTH
	*  @param value
	**/
   public void setEsV3SiHdrLnth275(char[] value) {
      esV3SiHdrLnth275 = checkEsV3SiHdrLnth275Constraints(value);
      serializeEsV3SiHdrLnth275(esV3SiHdrLnth275);
   } 

     /**
	 * 	Update EsV3SiHdrLnth275 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV3SiHdrLnth275(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsV3SiHdrLnth275,esV3SiHdrLnth275.length);
   	
   }
   
   public void setEsV3SiHdrLnth275(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3SiHdrLnth275,esV3SiHdrLnth275.length);
   	
   }
   
     /**
	 * 	Update EsV3SiHdrLnth275 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV3SiHdrLnth275(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3SiHdrLnth275+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsV3SiHdrLnth275 with another Field
	 *	@param value
	 */
   public void setEsV3SiHdrLnth275(Field source) {
       replace(source,0,source.length(),beginEsV3SiHdrLnth275,ES_V_3_SI_HDR_LNTH_275_LEN);
   	
   }  
   
     /**
	 * 	Update EsV3SiHdrLnth275 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV3SiHdrLnth275(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsV3SiHdrLnth275,ES_V_3_SI_HDR_LNTH_275_LEN);
   	
   }
   
     /**
	 * 	Update EsV3SiHdrLnth275 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV3SiHdrLnth275(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3SiHdrLnth275+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of esV3SrvStatus275
	 *	@return esV3SrvStatus275
	 */
   public char[] getEsV3SrvStatus275() throws CFException{
     if (isEsV3SrvStatus275Modified()) { 
        esV3SrvStatus275 = refreshEsV3SrvStatus275();
     }
   		return esV3SrvStatus275;
   }

  
	/**
	*  set variable esV3SrvStatus275
	*  Corresponding COBOL Variable is 275-ES-V3-SRV-STATUS
	*  @param value
	**/
   public void setEsV3SrvStatus275(char[] value) {
      esV3SrvStatus275 = checkEsV3SrvStatus275Constraints(value);
      serializeEsV3SrvStatus275(esV3SrvStatus275);
   } 

     /**
	 * 	Update EsV3SrvStatus275 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV3SrvStatus275(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsV3SrvStatus275,esV3SrvStatus275.length);
   	
   }
   
   public void setEsV3SrvStatus275(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3SrvStatus275,esV3SrvStatus275.length);
   	
   }
   
     /**
	 * 	Update EsV3SrvStatus275 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV3SrvStatus275(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3SrvStatus275+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsV3SrvStatus275 with another Field
	 *	@param value
	 */
   public void setEsV3SrvStatus275(Field source) {
       replace(source,0,source.length(),beginEsV3SrvStatus275,ES_V_3_SRV_STATUS_275_LEN);
   	
   }  
   
     /**
	 * 	Update EsV3SrvStatus275 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV3SrvStatus275(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsV3SrvStatus275,ES_V_3_SRV_STATUS_275_LEN);
   	
   }
   
     /**
	 * 	Update EsV3SrvStatus275 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV3SrvStatus275(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3SrvStatus275+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of esV3StatusRc275
	 *	@return esV3StatusRc275
	 */
   public char[] getEsV3StatusRc275() throws CFException{
     if (isEsV3StatusRc275Modified()) { 
        esV3StatusRc275 = refreshEsV3StatusRc275();
     }
   		return esV3StatusRc275;
   }

  
	/**
	*  set variable esV3StatusRc275
	*  Corresponding COBOL Variable is 275-ES-V3-STATUS-RC
	*  @param value
	**/
   public void setEsV3StatusRc275(char[] value) {
      esV3StatusRc275 = checkEsV3StatusRc275Constraints(value);
      serializeEsV3StatusRc275(esV3StatusRc275);
   } 

     /**
	 * 	Update EsV3StatusRc275 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV3StatusRc275(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsV3StatusRc275,esV3StatusRc275.length);
   	
   }
   
   public void setEsV3StatusRc275(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3StatusRc275,esV3StatusRc275.length);
   	
   }
   
     /**
	 * 	Update EsV3StatusRc275 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV3StatusRc275(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3StatusRc275+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsV3StatusRc275 with another Field
	 *	@param value
	 */
   public void setEsV3StatusRc275(Field source) {
       replace(source,0,source.length(),beginEsV3StatusRc275,ES_V_3_STATUS_RC_275_LEN);
   	
   }  
   
     /**
	 * 	Update EsV3StatusRc275 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV3StatusRc275(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsV3StatusRc275,ES_V_3_STATUS_RC_275_LEN);
   	
   }
   
     /**
	 * 	Update EsV3StatusRc275 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV3StatusRc275(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3StatusRc275+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of esV3SrvDataLnth275
	 *	@return esV3SrvDataLnth275
	 */
	public short getEsV3SrvDataLnth275() throws CFException {
        if (isEsV3SrvDataLnth275Modified()) { 
           esV3SrvDataLnth275 = refreshEsV3SrvDataLnth275();
        }
   		return esV3SrvDataLnth275;
	}
	
	/**
	 * 	Update EsV3SrvDataLnth275 with the passed value
	 *  Corresponding COBOL Variable is 275-ES-V3-SRV-DATA-LNTH
	 *	@param number
	 */
	public void setEsV3SrvDataLnth275(short number) {
	     // Truncate if the number is beyond +/- Max range
	    esV3SrvDataLnth275 = checkEsV3SrvDataLnth275MaxLimit(number); 
		serializeEsV3SrvDataLnth275(esV3SrvDataLnth275);
	}

	public void setEsV3SrvDataLnth275(int number) {
	    number = checkEsV3SrvDataLnth275MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEsV3SrvDataLnth275((short)number);
	}
	public void setEsV3SrvDataLnth275(long number) {
	    number = checkEsV3SrvDataLnth275MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEsV3SrvDataLnth275((short)number);
	}
	

	/**
	 *	Returns the value of esV3PayloadSpec275
	 *	@return esV3PayloadSpec275
	 */
   public char[] getEsV3PayloadSpec275() throws CFException{
     if (isEsV3PayloadSpec275Modified()) { 
        esV3PayloadSpec275 = refreshEsV3PayloadSpec275();
     }
   		return esV3PayloadSpec275;
   }

  
	/**
	*  set variable esV3PayloadSpec275
	*  Corresponding COBOL Variable is 275-ES-V3-PAYLOAD-SPEC
	*  @param value
	**/
   public void setEsV3PayloadSpec275(char[] value) {
      esV3PayloadSpec275 = checkEsV3PayloadSpec275Constraints(value);
      serializeEsV3PayloadSpec275(esV3PayloadSpec275);
   } 

     /**
	 * 	Update EsV3PayloadSpec275 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV3PayloadSpec275(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsV3PayloadSpec275,esV3PayloadSpec275.length);
   	
   }
   
   public void setEsV3PayloadSpec275(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3PayloadSpec275,esV3PayloadSpec275.length);
   	
   }
   
     /**
	 * 	Update EsV3PayloadSpec275 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV3PayloadSpec275(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3PayloadSpec275+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsV3PayloadSpec275 with another Field
	 *	@param value
	 */
   public void setEsV3PayloadSpec275(Field source) {
       replace(source,0,source.length(),beginEsV3PayloadSpec275,ES_V_3_PAYLOAD_SPEC_275_LEN);
   	
   }  
   
     /**
	 * 	Update EsV3PayloadSpec275 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV3PayloadSpec275(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsV3PayloadSpec275,ES_V_3_PAYLOAD_SPEC_275_LEN);
   	
   }
   
     /**
	 * 	Update EsV3PayloadSpec275 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV3PayloadSpec275(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3PayloadSpec275+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of esV3PayloadLnth275
	 *	@return esV3PayloadLnth275
	 */
	public short getEsV3PayloadLnth275() throws CFException {
        if (isEsV3PayloadLnth275Modified()) { 
           esV3PayloadLnth275 = refreshEsV3PayloadLnth275();
        }
   		return esV3PayloadLnth275;
	}
	
	/**
	 * 	Update EsV3PayloadLnth275 with the passed value
	 *  Corresponding COBOL Variable is 275-ES-V3-PAYLOAD-LNTH
	 *	@param number
	 */
	public void setEsV3PayloadLnth275(short number) {
	     // Truncate if the number is beyond +/- Max range
	    esV3PayloadLnth275 = checkEsV3PayloadLnth275MaxLimit(number); 
		serializeEsV3PayloadLnth275(esV3PayloadLnth275);
	}

	public void setEsV3PayloadLnth275(int number) {
	    number = checkEsV3PayloadLnth275MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEsV3PayloadLnth275((short)number);
	}
	public void setEsV3PayloadLnth275(long number) {
	    number = checkEsV3PayloadLnth275MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEsV3PayloadLnth275((short)number);
	}
	

	/**
	 *	Returns the value of esV3PayloadData275
	 *	@return esV3PayloadData275
	 */
   public char[] getEsV3PayloadData275() throws CFException{
     if (isEsV3PayloadData275Modified()) { 
        esV3PayloadData275 = refreshEsV3PayloadData275();
     }
   		return esV3PayloadData275;
   }

  
	/**
	*  set variable esV3PayloadData275
	*  Corresponding COBOL Variable is 275-ES-V3-PAYLOAD-DATA
	*  @param value
	**/
   public void setEsV3PayloadData275(char[] value) {
      esV3PayloadData275 = checkEsV3PayloadData275Constraints(value);
      serializeEsV3PayloadData275(esV3PayloadData275);
   } 

     /**
	 * 	Update EsV3PayloadData275 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV3PayloadData275(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsV3PayloadData275,esV3PayloadData275.length);
   	
   }
   
   public void setEsV3PayloadData275(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3PayloadData275,esV3PayloadData275.length);
   	
   }
   
     /**
	 * 	Update EsV3PayloadData275 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV3PayloadData275(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3PayloadData275+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsV3PayloadData275 with another Field
	 *	@param value
	 */
   public void setEsV3PayloadData275(Field source) {
       replace(source,0,source.length(),beginEsV3PayloadData275,ES_V_3_PAYLOAD_DATA_275_LEN);
   	
   }  
   
     /**
	 * 	Update EsV3PayloadData275 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV3PayloadData275(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsV3PayloadData275,ES_V_3_PAYLOAD_DATA_275_LEN);
   	
   }
   
     /**
	 * 	Update EsV3PayloadData275 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV3PayloadData275(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3PayloadData275+targetIndex,targetLen);
    
   }

	
	
	

		public static int getEsV3ServiceHeader275FieldLength() {
			return ES_V_3_SERVICE_HEADER_275_LENGTH;
		}

}
  
