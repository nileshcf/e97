package com.cloudframe.app.bm8090m.dto;

/**
*  The class WRespu is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WRespu extends WRespuSerialized { 
   

						private char[] wResp1 = Field.fillLowValue(60);
	
	/**
	* Constructor for WRespu
	**/
    public WRespu() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WRespu. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WRespu(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wResp1
	 *	@return wResp1
	 */
   public char[] getWResp1() throws CFException{
     if (isWResp1Modified()) { 
        wResp1 = refreshWResp1();
     }
   		return wResp1;
   }

  
	/**
	*  set variable wResp1
	*  Corresponding COBOL Variable is W-RESP1
	*  @param value
	**/
   public void setWResp1(char[] value) {
      wResp1 = checkWResp1Constraints(value);
      serializeWResp1(wResp1);
   } 

     /**
	 * 	Update WResp1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWResp1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWResp1,wResp1.length);
   	
   }
   
   public void setWResp1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWResp1,wResp1.length);
   	
   }
   
     /**
	 * 	Update WResp1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWResp1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWResp1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WResp1 with another Field
	 *	@param value
	 */
   public void setWResp1(Field source) {
       replace(source,0,source.length(),beginWResp1,W_RESP_1_LEN);
   	
   }  
   
     /**
	 * 	Update WResp1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWResp1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWResp1,W_RESP_1_LEN);
   	
   }
   
     /**
	 * 	Update WResp1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWResp1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWResp1+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWRespuFieldLength() {
			return W_RESPU_LENGTH;
		}

}
  
