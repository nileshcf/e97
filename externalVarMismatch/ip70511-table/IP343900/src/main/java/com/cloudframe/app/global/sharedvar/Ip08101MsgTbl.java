package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip08101MsgTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:06. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip08101MsgTbl extends Ip08101MsgTblSerialized { 
   

						private char[] ip081011stPresThresh = Field.fillLowValue(3);

						private char[] ip081012ndPresChbkThresh = Field.fillLowValue(3);

						private char[] ip08101FeeCollectThresh = Field.fillLowValue(3);

						private char[] ip08101RetrievalThresh = Field.fillLowValue(3);

						private char[] ip08101AllMsgsThresh = Field.fillLowValue(3);
	
	/**
	* Constructor for Ip08101MsgTbl
	**/
    public Ip08101MsgTbl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip08101MsgTbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip08101MsgTbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip081011stPresThresh
	 *	@return ip081011stPresThresh
	 */
   public char[] getIp081011stPresThresh() throws CFException{
     if (isIp081011stPresThreshModified()) { 
        ip081011stPresThresh = refreshIp081011stPresThresh();
     }
   		return ip081011stPresThresh;
   }

  
	/**
	*  set variable ip081011stPresThresh
	*  Corresponding COBOL Variable is IP08101-1ST-PRES-THRESH
	*  @param value
	**/
   public void setIp081011stPresThresh(char[] value) {
      ip081011stPresThresh = checkIp081011stPresThreshConstraints(value);
      serializeIp081011stPresThresh(ip081011stPresThresh);
   } 

     /**
	 * 	Update Ip081011stPresThresh 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp081011stPresThresh(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp081011stPresThresh,ip081011stPresThresh.length);
   	
   }
   
   public void setIp081011stPresThresh(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp081011stPresThresh,ip081011stPresThresh.length);
   	
   }
   
     /**
	 * 	Update Ip081011stPresThresh 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp081011stPresThresh(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp081011stPresThresh+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip081011stPresThresh with another Field
	 *	@param value
	 */
   public void setIp081011stPresThresh(Field source) {
       replace(source,0,source.length(),beginIp081011stPresThresh,IP_081011ST_PRES_THRESH_LEN);
   	
   }  
   
     /**
	 * 	Update Ip081011stPresThresh 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp081011stPresThresh(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp081011stPresThresh,IP_081011ST_PRES_THRESH_LEN);
   	
   }
   
     /**
	 * 	Update Ip081011stPresThresh 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp081011stPresThresh(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp081011stPresThresh+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip081012ndPresChbkThresh
	 *	@return ip081012ndPresChbkThresh
	 */
   public char[] getIp081012ndPresChbkThresh() throws CFException{
     if (isIp081012ndPresChbkThreshModified()) { 
        ip081012ndPresChbkThresh = refreshIp081012ndPresChbkThresh();
     }
   		return ip081012ndPresChbkThresh;
   }

  
	/**
	*  set variable ip081012ndPresChbkThresh
	*  Corresponding COBOL Variable is IP08101-2ND-PRES-CHBK-THRESH
	*  @param value
	**/
   public void setIp081012ndPresChbkThresh(char[] value) {
      ip081012ndPresChbkThresh = checkIp081012ndPresChbkThreshConstraints(value);
      serializeIp081012ndPresChbkThresh(ip081012ndPresChbkThresh);
   } 

     /**
	 * 	Update Ip081012ndPresChbkThresh 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp081012ndPresChbkThresh(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp081012ndPresChbkThresh,ip081012ndPresChbkThresh.length);
   	
   }
   
   public void setIp081012ndPresChbkThresh(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp081012ndPresChbkThresh,ip081012ndPresChbkThresh.length);
   	
   }
   
     /**
	 * 	Update Ip081012ndPresChbkThresh 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp081012ndPresChbkThresh(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp081012ndPresChbkThresh+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip081012ndPresChbkThresh with another Field
	 *	@param value
	 */
   public void setIp081012ndPresChbkThresh(Field source) {
       replace(source,0,source.length(),beginIp081012ndPresChbkThresh,IP_081012ND_PRES_CHBK_THRESH_LEN);
   	
   }  
   
     /**
	 * 	Update Ip081012ndPresChbkThresh 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp081012ndPresChbkThresh(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp081012ndPresChbkThresh,IP_081012ND_PRES_CHBK_THRESH_LEN);
   	
   }
   
     /**
	 * 	Update Ip081012ndPresChbkThresh 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp081012ndPresChbkThresh(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp081012ndPresChbkThresh+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip08101FeeCollectThresh
	 *	@return ip08101FeeCollectThresh
	 */
   public char[] getIp08101FeeCollectThresh() throws CFException{
     if (isIp08101FeeCollectThreshModified()) { 
        ip08101FeeCollectThresh = refreshIp08101FeeCollectThresh();
     }
   		return ip08101FeeCollectThresh;
   }

  
	/**
	*  set variable ip08101FeeCollectThresh
	*  Corresponding COBOL Variable is IP08101-FEE-COLLECT-THRESH
	*  @param value
	**/
   public void setIp08101FeeCollectThresh(char[] value) {
      ip08101FeeCollectThresh = checkIp08101FeeCollectThreshConstraints(value);
      serializeIp08101FeeCollectThresh(ip08101FeeCollectThresh);
   } 

     /**
	 * 	Update Ip08101FeeCollectThresh 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101FeeCollectThresh(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp08101FeeCollectThresh,ip08101FeeCollectThresh.length);
   	
   }
   
   public void setIp08101FeeCollectThresh(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101FeeCollectThresh,ip08101FeeCollectThresh.length);
   	
   }
   
     /**
	 * 	Update Ip08101FeeCollectThresh 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101FeeCollectThresh(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101FeeCollectThresh+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip08101FeeCollectThresh with another Field
	 *	@param value
	 */
   public void setIp08101FeeCollectThresh(Field source) {
       replace(source,0,source.length(),beginIp08101FeeCollectThresh,IP_08101_FEE_COLLECT_THRESH_LEN);
   	
   }  
   
     /**
	 * 	Update Ip08101FeeCollectThresh 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101FeeCollectThresh(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp08101FeeCollectThresh,IP_08101_FEE_COLLECT_THRESH_LEN);
   	
   }
   
     /**
	 * 	Update Ip08101FeeCollectThresh 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101FeeCollectThresh(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101FeeCollectThresh+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip08101RetrievalThresh
	 *	@return ip08101RetrievalThresh
	 */
   public char[] getIp08101RetrievalThresh() throws CFException{
     if (isIp08101RetrievalThreshModified()) { 
        ip08101RetrievalThresh = refreshIp08101RetrievalThresh();
     }
   		return ip08101RetrievalThresh;
   }

  
	/**
	*  set variable ip08101RetrievalThresh
	*  Corresponding COBOL Variable is IP08101-RETRIEVAL-THRESH
	*  @param value
	**/
   public void setIp08101RetrievalThresh(char[] value) {
      ip08101RetrievalThresh = checkIp08101RetrievalThreshConstraints(value);
      serializeIp08101RetrievalThresh(ip08101RetrievalThresh);
   } 

     /**
	 * 	Update Ip08101RetrievalThresh 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101RetrievalThresh(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp08101RetrievalThresh,ip08101RetrievalThresh.length);
   	
   }
   
   public void setIp08101RetrievalThresh(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101RetrievalThresh,ip08101RetrievalThresh.length);
   	
   }
   
     /**
	 * 	Update Ip08101RetrievalThresh 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RetrievalThresh(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101RetrievalThresh+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip08101RetrievalThresh with another Field
	 *	@param value
	 */
   public void setIp08101RetrievalThresh(Field source) {
       replace(source,0,source.length(),beginIp08101RetrievalThresh,IP_08101_RETRIEVAL_THRESH_LEN);
   	
   }  
   
     /**
	 * 	Update Ip08101RetrievalThresh 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101RetrievalThresh(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp08101RetrievalThresh,IP_08101_RETRIEVAL_THRESH_LEN);
   	
   }
   
     /**
	 * 	Update Ip08101RetrievalThresh 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101RetrievalThresh(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101RetrievalThresh+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip08101AllMsgsThresh
	 *	@return ip08101AllMsgsThresh
	 */
   public char[] getIp08101AllMsgsThresh() throws CFException{
     if (isIp08101AllMsgsThreshModified()) { 
        ip08101AllMsgsThresh = refreshIp08101AllMsgsThresh();
     }
   		return ip08101AllMsgsThresh;
   }

  
	/**
	*  set variable ip08101AllMsgsThresh
	*  Corresponding COBOL Variable is IP08101-ALL-MSGS-THRESH
	*  @param value
	**/
   public void setIp08101AllMsgsThresh(char[] value) {
      ip08101AllMsgsThresh = checkIp08101AllMsgsThreshConstraints(value);
      serializeIp08101AllMsgsThresh(ip08101AllMsgsThresh);
   } 

     /**
	 * 	Update Ip08101AllMsgsThresh 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp08101AllMsgsThresh(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp08101AllMsgsThresh,ip08101AllMsgsThresh.length);
   	
   }
   
   public void setIp08101AllMsgsThresh(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101AllMsgsThresh,ip08101AllMsgsThresh.length);
   	
   }
   
     /**
	 * 	Update Ip08101AllMsgsThresh 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp08101AllMsgsThresh(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101AllMsgsThresh+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip08101AllMsgsThresh with another Field
	 *	@param value
	 */
   public void setIp08101AllMsgsThresh(Field source) {
       replace(source,0,source.length(),beginIp08101AllMsgsThresh,IP_08101_ALL_MSGS_THRESH_LEN);
   	
   }  
   
     /**
	 * 	Update Ip08101AllMsgsThresh 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp08101AllMsgsThresh(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp08101AllMsgsThresh,IP_08101_ALL_MSGS_THRESH_LEN);
   	
   }
   
     /**
	 * 	Update Ip08101AllMsgsThresh 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp08101AllMsgsThresh(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp08101AllMsgsThresh+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip08101MsgTbl
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp081011stPresThresh(CONSTANTS.SPACE_3);
         setIp081012ndPresChbkThresh(CONSTANTS.SPACE_3);
         setIp08101FeeCollectThresh(CONSTANTS.SPACE_3);
         setIp08101RetrievalThresh(CONSTANTS.SPACE_3);
         setIp08101AllMsgsThresh(CONSTANTS.SPACE_3);
   }

		public static int getIp08101MsgTblFieldLength() {
			return IP_08101_MSG_TBL_LENGTH;
		}

}
  
