package com.cloudframe.app.bm8090m.dto;

/**
*  The class WRespuMr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WRespuMr extends WRespuMrSerialized { 
   

						private char[] wRespMr1 = Field.fillLowValue(24);
	
	/**
	* Constructor for WRespuMr
	**/
    public WRespuMr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WRespuMr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WRespuMr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wRespMr1
	 *	@return wRespMr1
	 */
   public char[] getWRespMr1() throws CFException{
     if (isWRespMr1Modified()) { 
        wRespMr1 = refreshWRespMr1();
     }
   		return wRespMr1;
   }

  
	/**
	*  set variable wRespMr1
	*  Corresponding COBOL Variable is W-RESP-MR1
	*  @param value
	**/
   public void setWRespMr1(char[] value) {
      wRespMr1 = checkWRespMr1Constraints(value);
      serializeWRespMr1(wRespMr1);
   } 

     /**
	 * 	Update WRespMr1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWRespMr1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWRespMr1,wRespMr1.length);
   	
   }
   
   public void setWRespMr1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWRespMr1,wRespMr1.length);
   	
   }
   
     /**
	 * 	Update WRespMr1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWRespMr1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWRespMr1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WRespMr1 with another Field
	 *	@param value
	 */
   public void setWRespMr1(Field source) {
       replace(source,0,source.length(),beginWRespMr1,W_RESP_MR_1_LEN);
   	
   }  
   
     /**
	 * 	Update WRespMr1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWRespMr1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWRespMr1,W_RESP_MR_1_LEN);
   	
   }
   
     /**
	 * 	Update WRespMr1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWRespMr1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWRespMr1+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWRespuMrFieldLength() {
			return W_RESPU_MR_LENGTH;
		}

}
  
