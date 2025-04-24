package com.cloudframe.app.bm8090m.dto;

/**
*  The class WRespuR is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WRespuR extends WRespuRSerialized { 
   

						private char[] wRespR1 = Field.fillLowValue(40);
	
	/**
	* Constructor for WRespuR
	**/
    public WRespuR() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WRespuR. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WRespuR(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wRespR1
	 *	@return wRespR1
	 */
   public char[] getWRespR1() throws CFException{
     if (isWRespR1Modified()) { 
        wRespR1 = refreshWRespR1();
     }
   		return wRespR1;
   }

  
	/**
	*  set variable wRespR1
	*  Corresponding COBOL Variable is W-RESP-R1
	*  @param value
	**/
   public void setWRespR1(char[] value) {
      wRespR1 = checkWRespR1Constraints(value);
      serializeWRespR1(wRespR1);
   } 

     /**
	 * 	Update WRespR1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWRespR1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWRespR1,wRespR1.length);
   	
   }
   
   public void setWRespR1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWRespR1,wRespR1.length);
   	
   }
   
     /**
	 * 	Update WRespR1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWRespR1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWRespR1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WRespR1 with another Field
	 *	@param value
	 */
   public void setWRespR1(Field source) {
       replace(source,0,source.length(),beginWRespR1,W_RESP_R_1_LEN);
   	
   }  
   
     /**
	 * 	Update WRespR1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWRespR1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWRespR1,W_RESP_R_1_LEN);
   	
   }
   
     /**
	 * 	Update WRespR1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWRespR1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWRespR1+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWRespuRFieldLength() {
			return W_RESPU_R_LENGTH;
		}

}
  
