package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf501NRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf501NRecord extends Sf501NRecordSerialized { 
   

						private char[] sf501NData = Field.fillLowValue(7921);
	
	/**
	* Constructor for Sf501NRecord
	**/
    public Sf501NRecord() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf501NRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf501NRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sf501NData
	 *	@return sf501NData
	 */
   public char[] getSf501NData() throws CFException{
     if (isSf501NDataModified()) { 
        sf501NData = refreshSf501NData();
     }
   		return sf501NData;
   }

  
	/**
	*  set variable sf501NData
	*  Corresponding COBOL Variable is SF501-N-DATA
	*  @param value
	**/
   public void setSf501NData(char[] value) {
      sf501NData = checkSf501NDataConstraints(value);
      serializeSf501NData(sf501NData);
   } 

     /**
	 * 	Update Sf501NData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf501NData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf501NData,sf501NData.length);
   	
   }
   
   public void setSf501NData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf501NData,sf501NData.length);
   	
   }
   
     /**
	 * 	Update Sf501NData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501NData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501NData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf501NData with another Field
	 *	@param value
	 */
   public void setSf501NData(Field source) {
       replace(source,0,source.length(),beginSf501NData,SF_501_NDATA_LEN);
   	
   }  
   
     /**
	 * 	Update Sf501NData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf501NData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf501NData,SF_501_NDATA_LEN);
   	
   }
   
     /**
	 * 	Update Sf501NData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501NData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501NData+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf501NRecordFieldLength() {
			return SF_501_NRECORD_LENGTH;
		}

}
  
