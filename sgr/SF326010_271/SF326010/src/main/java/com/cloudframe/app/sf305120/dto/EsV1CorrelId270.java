package com.cloudframe.app.sf305120.dto;

/**
*  The class EsV1CorrelId270 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class EsV1CorrelId270 extends EsV1CorrelId270Serialized { 
   

						private char[] esV1SrvId270 = new char[4];

						private char[] esV1SrvreqId270 = new char[6];
	
	/**
	* Constructor for EsV1CorrelId270
	**/
    public EsV1CorrelId270() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for EsV1CorrelId270. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EsV1CorrelId270(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setEsV1SrvId270(fillSpace(4));
								setEsV1SrvreqId270(fillSpace(6));
    } 

	/**
	 *	Returns the value of esV1SrvId270
	 *	@return esV1SrvId270
	 */
   public char[] getEsV1SrvId270() throws CFException{
     if (isEsV1SrvId270Modified()) { 
        esV1SrvId270 = refreshEsV1SrvId270();
     }
   		return esV1SrvId270;
   }

  
	/**
	*  set variable esV1SrvId270
	*  Corresponding COBOL Variable is 270-ES-V1-SRV-ID
	*  @param value
	**/
   public void setEsV1SrvId270(char[] value) {
      esV1SrvId270 = checkEsV1SrvId270Constraints(value);
      serializeEsV1SrvId270(esV1SrvId270);
   } 

     /**
	 * 	Update EsV1SrvId270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV1SrvId270(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsV1SrvId270,esV1SrvId270.length);
   	
   }
   
   public void setEsV1SrvId270(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsV1SrvId270,esV1SrvId270.length);
   	
   }
   
     /**
	 * 	Update EsV1SrvId270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV1SrvId270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV1SrvId270+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsV1SrvId270 with another Field
	 *	@param value
	 */
   public void setEsV1SrvId270(Field source) {
       replace(source,0,source.length(),beginEsV1SrvId270,ES_V_1_SRV_ID_270_LEN);
   	
   }  
   
     /**
	 * 	Update EsV1SrvId270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV1SrvId270(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsV1SrvId270,ES_V_1_SRV_ID_270_LEN);
   	
   }
   
     /**
	 * 	Update EsV1SrvId270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV1SrvId270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV1SrvId270+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of esV1SrvreqId270
	 *	@return esV1SrvreqId270
	 */
   public char[] getEsV1SrvreqId270() throws CFException{
     if (isEsV1SrvreqId270Modified()) { 
        esV1SrvreqId270 = refreshEsV1SrvreqId270();
     }
   		return esV1SrvreqId270;
   }

  
	/**
	*  set variable esV1SrvreqId270
	*  Corresponding COBOL Variable is 270-ES-V1-SRVREQ-ID
	*  @param value
	**/
   public void setEsV1SrvreqId270(char[] value) {
      esV1SrvreqId270 = checkEsV1SrvreqId270Constraints(value);
      serializeEsV1SrvreqId270(esV1SrvreqId270);
   } 

     /**
	 * 	Update EsV1SrvreqId270 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEsV1SrvreqId270(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEsV1SrvreqId270,esV1SrvreqId270.length);
   	
   }
   
   public void setEsV1SrvreqId270(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEsV1SrvreqId270,esV1SrvreqId270.length);
   	
   }
   
     /**
	 * 	Update EsV1SrvreqId270 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEsV1SrvreqId270(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV1SrvreqId270+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EsV1SrvreqId270 with another Field
	 *	@param value
	 */
   public void setEsV1SrvreqId270(Field source) {
       replace(source,0,source.length(),beginEsV1SrvreqId270,ES_V_1_SRVREQ_ID_270_LEN);
   	
   }  
   
     /**
	 * 	Update EsV1SrvreqId270 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEsV1SrvreqId270(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEsV1SrvreqId270,ES_V_1_SRVREQ_ID_270_LEN);
   	
   }
   
     /**
	 * 	Update EsV1SrvreqId270 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEsV1SrvreqId270(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEsV1SrvreqId270+targetIndex,targetLen);
    
   }

	
	
	

		public static int getEsV1CorrelId270FieldLength() {
			return ES_V_1_CORREL_ID_270_LENGTH;
		}

}
  
