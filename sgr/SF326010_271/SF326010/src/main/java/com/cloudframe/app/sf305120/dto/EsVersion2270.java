package com.cloudframe.app.sf305120.dto;

/**
*  The class EsVersion2270 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class EsVersion2270 extends EsVersion2270Serialized { 
   

						private char[] esV2CorrelId270 = Field.fillLowValue(12);

						private char[] esV2SrvId270 = Field.fillLowValue(4);

						private char[] esV2SiHdrLnth270 = Field.fillLowValue(1);

						private char[] esV2SrvStatus270 = Field.fillLowValue(1);

						private char[] esV2StatusRc270 = Field.fillLowValue(1);

								private short esV2SrvDataLnth270;

						private char[] esV2SrvData270 = Field.fillLowValue(7900);
	
	/**
	* Constructor for EsVersion2270
	**/
    public EsVersion2270() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for EsVersion2270. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EsVersion2270(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of esV2CorrelId270
	 *	@return esV2CorrelId270
	 */
   public char[] getEsV2CorrelId270() throws CFException{
     if (isEsV2CorrelId270Modified()) { 
        esV2CorrelId270 = refreshEsV2CorrelId270();
     }
   		return esV2CorrelId270;
   }

  
	/**
	*  set variable esV2CorrelId270
	*  Corresponding COBOL Variable is 270-ES-V2-CORREL-ID
	*  @param value
	**/
   public void setEsV2CorrelId270(char[] value) {
      esV2CorrelId270 = checkEsV2CorrelId270Constraints(value);
      serializeEsV2CorrelId270(esV2CorrelId270);
   } 

     /**
	 * 	Update EsV2CorrelId270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV2CorrelId270(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsV2CorrelId270,esV2CorrelId270.length);
   	
   }
   
   public void setEsV2CorrelId270(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsV2CorrelId270,esV2CorrelId270.length);
   	
   }
   
     /**
	 * 	Update EsV2CorrelId270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV2CorrelId270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV2CorrelId270+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsV2CorrelId270 with another Field
	 *	@param value
	 */
   public void setEsV2CorrelId270(Field source) {
       replace(source,0,source.length(),beginEsV2CorrelId270,ES_V_2_CORREL_ID_270_LEN);
   	
   }  
   
     /**
	 * 	Update EsV2CorrelId270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV2CorrelId270(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsV2CorrelId270,ES_V_2_CORREL_ID_270_LEN);
   	
   }
   
     /**
	 * 	Update EsV2CorrelId270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV2CorrelId270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV2CorrelId270+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of esV2SrvId270
	 *	@return esV2SrvId270
	 */
   public char[] getEsV2SrvId270() throws CFException{
     if (isEsV2SrvId270Modified()) { 
        esV2SrvId270 = refreshEsV2SrvId270();
     }
   		return esV2SrvId270;
   }

  
	/**
	*  set variable esV2SrvId270
	*  Corresponding COBOL Variable is 270-ES-V2-SRV-ID
	*  @param value
	**/
   public void setEsV2SrvId270(char[] value) {
      esV2SrvId270 = checkEsV2SrvId270Constraints(value);
      serializeEsV2SrvId270(esV2SrvId270);
   } 

     /**
	 * 	Update EsV2SrvId270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV2SrvId270(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsV2SrvId270,esV2SrvId270.length);
   	
   }
   
   public void setEsV2SrvId270(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsV2SrvId270,esV2SrvId270.length);
   	
   }
   
     /**
	 * 	Update EsV2SrvId270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV2SrvId270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV2SrvId270+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsV2SrvId270 with another Field
	 *	@param value
	 */
   public void setEsV2SrvId270(Field source) {
       replace(source,0,source.length(),beginEsV2SrvId270,ES_V_2_SRV_ID_270_LEN);
   	
   }  
   
     /**
	 * 	Update EsV2SrvId270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV2SrvId270(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsV2SrvId270,ES_V_2_SRV_ID_270_LEN);
   	
   }
   
     /**
	 * 	Update EsV2SrvId270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV2SrvId270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV2SrvId270+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of esV2SiHdrLnth270
	 *	@return esV2SiHdrLnth270
	 */
   public char[] getEsV2SiHdrLnth270() throws CFException{
     if (isEsV2SiHdrLnth270Modified()) { 
        esV2SiHdrLnth270 = refreshEsV2SiHdrLnth270();
     }
   		return esV2SiHdrLnth270;
   }

  
	/**
	*  set variable esV2SiHdrLnth270
	*  Corresponding COBOL Variable is 270-ES-V2-SI-HDR-LNTH
	*  @param value
	**/
   public void setEsV2SiHdrLnth270(char[] value) {
      esV2SiHdrLnth270 = checkEsV2SiHdrLnth270Constraints(value);
      serializeEsV2SiHdrLnth270(esV2SiHdrLnth270);
   } 

     /**
	 * 	Update EsV2SiHdrLnth270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV2SiHdrLnth270(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsV2SiHdrLnth270,esV2SiHdrLnth270.length);
   	
   }
   
   public void setEsV2SiHdrLnth270(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsV2SiHdrLnth270,esV2SiHdrLnth270.length);
   	
   }
   
     /**
	 * 	Update EsV2SiHdrLnth270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV2SiHdrLnth270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV2SiHdrLnth270+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsV2SiHdrLnth270 with another Field
	 *	@param value
	 */
   public void setEsV2SiHdrLnth270(Field source) {
       replace(source,0,source.length(),beginEsV2SiHdrLnth270,ES_V_2_SI_HDR_LNTH_270_LEN);
   	
   }  
   
     /**
	 * 	Update EsV2SiHdrLnth270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV2SiHdrLnth270(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsV2SiHdrLnth270,ES_V_2_SI_HDR_LNTH_270_LEN);
   	
   }
   
     /**
	 * 	Update EsV2SiHdrLnth270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV2SiHdrLnth270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV2SiHdrLnth270+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of esV2SrvStatus270
	 *	@return esV2SrvStatus270
	 */
   public char[] getEsV2SrvStatus270() throws CFException{
     if (isEsV2SrvStatus270Modified()) { 
        esV2SrvStatus270 = refreshEsV2SrvStatus270();
     }
   		return esV2SrvStatus270;
   }

  
	/**
	*  set variable esV2SrvStatus270
	*  Corresponding COBOL Variable is 270-ES-V2-SRV-STATUS
	*  @param value
	**/
   public void setEsV2SrvStatus270(char[] value) {
      esV2SrvStatus270 = checkEsV2SrvStatus270Constraints(value);
      serializeEsV2SrvStatus270(esV2SrvStatus270);
   } 

     /**
	 * 	Update EsV2SrvStatus270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV2SrvStatus270(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsV2SrvStatus270,esV2SrvStatus270.length);
   	
   }
   
   public void setEsV2SrvStatus270(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsV2SrvStatus270,esV2SrvStatus270.length);
   	
   }
   
     /**
	 * 	Update EsV2SrvStatus270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV2SrvStatus270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV2SrvStatus270+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsV2SrvStatus270 with another Field
	 *	@param value
	 */
   public void setEsV2SrvStatus270(Field source) {
       replace(source,0,source.length(),beginEsV2SrvStatus270,ES_V_2_SRV_STATUS_270_LEN);
   	
   }  
   
     /**
	 * 	Update EsV2SrvStatus270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV2SrvStatus270(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsV2SrvStatus270,ES_V_2_SRV_STATUS_270_LEN);
   	
   }
   
     /**
	 * 	Update EsV2SrvStatus270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV2SrvStatus270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV2SrvStatus270+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of esV2StatusRc270
	 *	@return esV2StatusRc270
	 */
   public char[] getEsV2StatusRc270() throws CFException{
     if (isEsV2StatusRc270Modified()) { 
        esV2StatusRc270 = refreshEsV2StatusRc270();
     }
   		return esV2StatusRc270;
   }

  
	/**
	*  set variable esV2StatusRc270
	*  Corresponding COBOL Variable is 270-ES-V2-STATUS-RC
	*  @param value
	**/
   public void setEsV2StatusRc270(char[] value) {
      esV2StatusRc270 = checkEsV2StatusRc270Constraints(value);
      serializeEsV2StatusRc270(esV2StatusRc270);
   } 

     /**
	 * 	Update EsV2StatusRc270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV2StatusRc270(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsV2StatusRc270,esV2StatusRc270.length);
   	
   }
   
   public void setEsV2StatusRc270(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsV2StatusRc270,esV2StatusRc270.length);
   	
   }
   
     /**
	 * 	Update EsV2StatusRc270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV2StatusRc270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV2StatusRc270+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsV2StatusRc270 with another Field
	 *	@param value
	 */
   public void setEsV2StatusRc270(Field source) {
       replace(source,0,source.length(),beginEsV2StatusRc270,ES_V_2_STATUS_RC_270_LEN);
   	
   }  
   
     /**
	 * 	Update EsV2StatusRc270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV2StatusRc270(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsV2StatusRc270,ES_V_2_STATUS_RC_270_LEN);
   	
   }
   
     /**
	 * 	Update EsV2StatusRc270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV2StatusRc270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV2StatusRc270+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of esV2SrvDataLnth270
	 *	@return esV2SrvDataLnth270
	 */
	public short getEsV2SrvDataLnth270() throws CFException {
        if (isEsV2SrvDataLnth270Modified()) { 
           esV2SrvDataLnth270 = refreshEsV2SrvDataLnth270();
        }
   		return esV2SrvDataLnth270;
	}
	
	/**
	 * 	Update EsV2SrvDataLnth270 with the passed value
	 *  Corresponding COBOL Variable is 270-ES-V2-SRV-DATA-LNTH
	 *	@param number
	 */
	public void setEsV2SrvDataLnth270(short number) {
	     // Truncate if the number is beyond +/- Max range
	    esV2SrvDataLnth270 = checkEsV2SrvDataLnth270MaxLimit(number); 
		serializeEsV2SrvDataLnth270(esV2SrvDataLnth270);
	}

	public void setEsV2SrvDataLnth270(int number) {
	    number = checkEsV2SrvDataLnth270MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEsV2SrvDataLnth270((short)number);
	}
	public void setEsV2SrvDataLnth270(long number) {
	    number = checkEsV2SrvDataLnth270MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEsV2SrvDataLnth270((short)number);
	}
	

	/**
	 *	Returns the value of esV2SrvData270
	 *	@return esV2SrvData270
	 */
   public char[] getEsV2SrvData270() throws CFException{
     if (isEsV2SrvData270Modified()) { 
        esV2SrvData270 = refreshEsV2SrvData270();
     }
   		return esV2SrvData270;
   }

  
	/**
	*  set variable esV2SrvData270
	*  Corresponding COBOL Variable is 270-ES-V2-SRV-DATA
	*  @param value
	**/
   public void setEsV2SrvData270(char[] value) {
      esV2SrvData270 = checkEsV2SrvData270Constraints(value);
      serializeEsV2SrvData270(esV2SrvData270);
   } 

     /**
	 * 	Update EsV2SrvData270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV2SrvData270(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsV2SrvData270,esV2SrvData270.length);
   	
   }
   
   public void setEsV2SrvData270(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsV2SrvData270,esV2SrvData270.length);
   	
   }
   
     /**
	 * 	Update EsV2SrvData270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV2SrvData270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV2SrvData270+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsV2SrvData270 with another Field
	 *	@param value
	 */
   public void setEsV2SrvData270(Field source) {
       replace(source,0,source.length(),beginEsV2SrvData270,ES_V_2_SRV_DATA_270_LEN);
   	
   }  
   
     /**
	 * 	Update EsV2SrvData270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV2SrvData270(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsV2SrvData270,ES_V_2_SRV_DATA_270_LEN);
   	
   }
   
     /**
	 * 	Update EsV2SrvData270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV2SrvData270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV2SrvData270+targetIndex,targetLen);
    
   }

	
	
	

		public static int getEsVersion2270FieldLength() {
			return ES_VERSION_2270_LENGTH;
		}

}
  
