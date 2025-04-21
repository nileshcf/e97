package com.cloudframe.app.sf305120.dto;

/**
*  The class EsVersion3270 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class EsVersion3270 extends EsVersion3270Serialized { 
   

						private char[] esV3CorrelId270 = Field.fillLowValue(12);

						private char[] esV3SrvId270 = Field.fillLowValue(4);

						private char[] esV3SiHdrLnth270 = Field.fillLowValue(1);

						private char[] esV3SrvStatus270 = Field.fillLowValue(1);

						private char[] esV3StatusRc270 = Field.fillLowValue(1);

								private short esV3SrvDataLnth270;

						private char[] esV3SrvData270 = Field.fillLowValue(7900);
	
	/**
	* Constructor for EsVersion3270
	**/
    public EsVersion3270() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for EsVersion3270. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EsVersion3270(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of esV3CorrelId270
	 *	@return esV3CorrelId270
	 */
   public char[] getEsV3CorrelId270() throws CFException{
     if (isEsV3CorrelId270Modified()) { 
        esV3CorrelId270 = refreshEsV3CorrelId270();
     }
   		return esV3CorrelId270;
   }

  
	/**
	*  set variable esV3CorrelId270
	*  Corresponding COBOL Variable is 270-ES-V3-CORREL-ID
	*  @param value
	**/
   public void setEsV3CorrelId270(char[] value) {
      esV3CorrelId270 = checkEsV3CorrelId270Constraints(value);
      serializeEsV3CorrelId270(esV3CorrelId270);
   } 

     /**
	 * 	Update EsV3CorrelId270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV3CorrelId270(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsV3CorrelId270,esV3CorrelId270.length);
   	
   }
   
   public void setEsV3CorrelId270(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3CorrelId270,esV3CorrelId270.length);
   	
   }
   
     /**
	 * 	Update EsV3CorrelId270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV3CorrelId270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3CorrelId270+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsV3CorrelId270 with another Field
	 *	@param value
	 */
   public void setEsV3CorrelId270(Field source) {
       replace(source,0,source.length(),beginEsV3CorrelId270,ES_V_3_CORREL_ID_270_LEN);
   	
   }  
   
     /**
	 * 	Update EsV3CorrelId270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV3CorrelId270(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsV3CorrelId270,ES_V_3_CORREL_ID_270_LEN);
   	
   }
   
     /**
	 * 	Update EsV3CorrelId270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV3CorrelId270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3CorrelId270+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of esV3SrvId270
	 *	@return esV3SrvId270
	 */
   public char[] getEsV3SrvId270() throws CFException{
     if (isEsV3SrvId270Modified()) { 
        esV3SrvId270 = refreshEsV3SrvId270();
     }
   		return esV3SrvId270;
   }

  
	/**
	*  set variable esV3SrvId270
	*  Corresponding COBOL Variable is 270-ES-V3-SRV-ID
	*  @param value
	**/
   public void setEsV3SrvId270(char[] value) {
      esV3SrvId270 = checkEsV3SrvId270Constraints(value);
      serializeEsV3SrvId270(esV3SrvId270);
   } 

     /**
	 * 	Update EsV3SrvId270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV3SrvId270(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsV3SrvId270,esV3SrvId270.length);
   	
   }
   
   public void setEsV3SrvId270(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3SrvId270,esV3SrvId270.length);
   	
   }
   
     /**
	 * 	Update EsV3SrvId270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV3SrvId270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3SrvId270+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsV3SrvId270 with another Field
	 *	@param value
	 */
   public void setEsV3SrvId270(Field source) {
       replace(source,0,source.length(),beginEsV3SrvId270,ES_V_3_SRV_ID_270_LEN);
   	
   }  
   
     /**
	 * 	Update EsV3SrvId270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV3SrvId270(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsV3SrvId270,ES_V_3_SRV_ID_270_LEN);
   	
   }
   
     /**
	 * 	Update EsV3SrvId270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV3SrvId270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3SrvId270+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of esV3SiHdrLnth270
	 *	@return esV3SiHdrLnth270
	 */
   public char[] getEsV3SiHdrLnth270() throws CFException{
     if (isEsV3SiHdrLnth270Modified()) { 
        esV3SiHdrLnth270 = refreshEsV3SiHdrLnth270();
     }
   		return esV3SiHdrLnth270;
   }

  
	/**
	*  set variable esV3SiHdrLnth270
	*  Corresponding COBOL Variable is 270-ES-V3-SI-HDR-LNTH
	*  @param value
	**/
   public void setEsV3SiHdrLnth270(char[] value) {
      esV3SiHdrLnth270 = checkEsV3SiHdrLnth270Constraints(value);
      serializeEsV3SiHdrLnth270(esV3SiHdrLnth270);
   } 

     /**
	 * 	Update EsV3SiHdrLnth270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV3SiHdrLnth270(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsV3SiHdrLnth270,esV3SiHdrLnth270.length);
   	
   }
   
   public void setEsV3SiHdrLnth270(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3SiHdrLnth270,esV3SiHdrLnth270.length);
   	
   }
   
     /**
	 * 	Update EsV3SiHdrLnth270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV3SiHdrLnth270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3SiHdrLnth270+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsV3SiHdrLnth270 with another Field
	 *	@param value
	 */
   public void setEsV3SiHdrLnth270(Field source) {
       replace(source,0,source.length(),beginEsV3SiHdrLnth270,ES_V_3_SI_HDR_LNTH_270_LEN);
   	
   }  
   
     /**
	 * 	Update EsV3SiHdrLnth270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV3SiHdrLnth270(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsV3SiHdrLnth270,ES_V_3_SI_HDR_LNTH_270_LEN);
   	
   }
   
     /**
	 * 	Update EsV3SiHdrLnth270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV3SiHdrLnth270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3SiHdrLnth270+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of esV3SrvStatus270
	 *	@return esV3SrvStatus270
	 */
   public char[] getEsV3SrvStatus270() throws CFException{
     if (isEsV3SrvStatus270Modified()) { 
        esV3SrvStatus270 = refreshEsV3SrvStatus270();
     }
   		return esV3SrvStatus270;
   }

  
	/**
	*  set variable esV3SrvStatus270
	*  Corresponding COBOL Variable is 270-ES-V3-SRV-STATUS
	*  @param value
	**/
   public void setEsV3SrvStatus270(char[] value) {
      esV3SrvStatus270 = checkEsV3SrvStatus270Constraints(value);
      serializeEsV3SrvStatus270(esV3SrvStatus270);
   } 

     /**
	 * 	Update EsV3SrvStatus270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV3SrvStatus270(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsV3SrvStatus270,esV3SrvStatus270.length);
   	
   }
   
   public void setEsV3SrvStatus270(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3SrvStatus270,esV3SrvStatus270.length);
   	
   }
   
     /**
	 * 	Update EsV3SrvStatus270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV3SrvStatus270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3SrvStatus270+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsV3SrvStatus270 with another Field
	 *	@param value
	 */
   public void setEsV3SrvStatus270(Field source) {
       replace(source,0,source.length(),beginEsV3SrvStatus270,ES_V_3_SRV_STATUS_270_LEN);
   	
   }  
   
     /**
	 * 	Update EsV3SrvStatus270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV3SrvStatus270(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsV3SrvStatus270,ES_V_3_SRV_STATUS_270_LEN);
   	
   }
   
     /**
	 * 	Update EsV3SrvStatus270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV3SrvStatus270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3SrvStatus270+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of esV3StatusRc270
	 *	@return esV3StatusRc270
	 */
   public char[] getEsV3StatusRc270() throws CFException{
     if (isEsV3StatusRc270Modified()) { 
        esV3StatusRc270 = refreshEsV3StatusRc270();
     }
   		return esV3StatusRc270;
   }

  
	/**
	*  set variable esV3StatusRc270
	*  Corresponding COBOL Variable is 270-ES-V3-STATUS-RC
	*  @param value
	**/
   public void setEsV3StatusRc270(char[] value) {
      esV3StatusRc270 = checkEsV3StatusRc270Constraints(value);
      serializeEsV3StatusRc270(esV3StatusRc270);
   } 

     /**
	 * 	Update EsV3StatusRc270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV3StatusRc270(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsV3StatusRc270,esV3StatusRc270.length);
   	
   }
   
   public void setEsV3StatusRc270(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3StatusRc270,esV3StatusRc270.length);
   	
   }
   
     /**
	 * 	Update EsV3StatusRc270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV3StatusRc270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3StatusRc270+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsV3StatusRc270 with another Field
	 *	@param value
	 */
   public void setEsV3StatusRc270(Field source) {
       replace(source,0,source.length(),beginEsV3StatusRc270,ES_V_3_STATUS_RC_270_LEN);
   	
   }  
   
     /**
	 * 	Update EsV3StatusRc270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV3StatusRc270(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsV3StatusRc270,ES_V_3_STATUS_RC_270_LEN);
   	
   }
   
     /**
	 * 	Update EsV3StatusRc270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV3StatusRc270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3StatusRc270+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of esV3SrvDataLnth270
	 *	@return esV3SrvDataLnth270
	 */
	public short getEsV3SrvDataLnth270() throws CFException {
        if (isEsV3SrvDataLnth270Modified()) { 
           esV3SrvDataLnth270 = refreshEsV3SrvDataLnth270();
        }
   		return esV3SrvDataLnth270;
	}
	
	/**
	 * 	Update EsV3SrvDataLnth270 with the passed value
	 *  Corresponding COBOL Variable is 270-ES-V3-SRV-DATA-LNTH
	 *	@param number
	 */
	public void setEsV3SrvDataLnth270(short number) {
	     // Truncate if the number is beyond +/- Max range
	    esV3SrvDataLnth270 = checkEsV3SrvDataLnth270MaxLimit(number); 
		serializeEsV3SrvDataLnth270(esV3SrvDataLnth270);
	}

	public void setEsV3SrvDataLnth270(int number) {
	    number = checkEsV3SrvDataLnth270MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEsV3SrvDataLnth270((short)number);
	}
	public void setEsV3SrvDataLnth270(long number) {
	    number = checkEsV3SrvDataLnth270MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEsV3SrvDataLnth270((short)number);
	}
	

	/**
	 *	Returns the value of esV3SrvData270
	 *	@return esV3SrvData270
	 */
   public char[] getEsV3SrvData270() throws CFException{
     if (isEsV3SrvData270Modified()) { 
        esV3SrvData270 = refreshEsV3SrvData270();
     }
   		return esV3SrvData270;
   }

  
	/**
	*  set variable esV3SrvData270
	*  Corresponding COBOL Variable is 270-ES-V3-SRV-DATA
	*  @param value
	**/
   public void setEsV3SrvData270(char[] value) {
      esV3SrvData270 = checkEsV3SrvData270Constraints(value);
      serializeEsV3SrvData270(esV3SrvData270);
   } 

     /**
	 * 	Update EsV3SrvData270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV3SrvData270(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsV3SrvData270,esV3SrvData270.length);
   	
   }
   
   public void setEsV3SrvData270(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3SrvData270,esV3SrvData270.length);
   	
   }
   
     /**
	 * 	Update EsV3SrvData270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV3SrvData270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3SrvData270+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsV3SrvData270 with another Field
	 *	@param value
	 */
   public void setEsV3SrvData270(Field source) {
       replace(source,0,source.length(),beginEsV3SrvData270,ES_V_3_SRV_DATA_270_LEN);
   	
   }  
   
     /**
	 * 	Update EsV3SrvData270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV3SrvData270(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsV3SrvData270,ES_V_3_SRV_DATA_270_LEN);
   	
   }
   
     /**
	 * 	Update EsV3SrvData270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV3SrvData270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV3SrvData270+targetIndex,targetLen);
    
   }

	
	
	

		public static int getEsVersion3270FieldLength() {
			return ES_VERSION_3270_LENGTH;
		}

}
  
