package com.cloudframe.app.crazy88.dto;

/**
*  The class WCharG is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:46. using version 5.0.0.254
**/


import com.cloudframe.app.crazy88.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WCharG extends WCharGSerialized { 
   

						private char[] wCharTestData = Field.fillLowValue(1);
	
	/**
	* Constructor for WCharG
	**/
    public WCharG() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wCharTestData
	 *	@return wCharTestData
	 */
   public char[] getWCharTestData() throws CFException{
     if (isWCharTestDataModified()) { 
        wCharTestData = refreshWCharTestData();
     }
   		return wCharTestData;
   }

  
	/**
	*  set variable wCharTestData
	*  Corresponding COBOL Variable is W-CHAR-TEST-DATA
	*  @param value
	**/
   public void setWCharTestData(char[] value) {
      wCharTestData = checkWCharTestDataConstraints(value);
      serializeWCharTestData(wCharTestData);
   } 

     /**
	 * 	Update WCharTestData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWCharTestData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWCharTestData,wCharTestData.length);
   	
   }
   
   public void setWCharTestData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWCharTestData,wCharTestData.length);
   	
   }
   
     /**
	 * 	Update WCharTestData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWCharTestData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWCharTestData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WCharTestData with another Field
	 *	@param value
	 */
   public void setWCharTestData(Field source) {
       replace(source,0,source.length(),beginWCharTestData,W_CHAR_TEST_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update WCharTestData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWCharTestData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWCharTestData,W_CHAR_TEST_DATA_LEN);
   	
   }
   
     /**
	 * 	Update WCharTestData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWCharTestData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWCharTestData+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWCharGFieldLength() {
			return W_CHAR_G_LENGTH;
		}

}
  
