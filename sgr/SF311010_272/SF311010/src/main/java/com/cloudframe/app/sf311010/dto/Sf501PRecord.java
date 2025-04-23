package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf501PRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf501PRecord extends Sf501PRecordSerialized { 
   

						private char[] sf501PData = Field.fillLowValue(7979);
	
	/**
	* Constructor for Sf501PRecord
	**/
    public Sf501PRecord() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf501PRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf501PRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sf501PData
	 *	@return sf501PData
	 */
   public char[] getSf501PData() throws CFException{
     if (isSf501PDataModified()) { 
        sf501PData = refreshSf501PData();
     }
   		return sf501PData;
   }

  
	/**
	*  set variable sf501PData
	*  Corresponding COBOL Variable is SF501-P-DATA
	*  @param value
	**/
   public void setSf501PData(char[] value) {
      sf501PData = checkSf501PDataConstraints(value);
      serializeSf501PData(sf501PData);
   } 

     /**
	 * 	Update Sf501PData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf501PData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf501PData,sf501PData.length);
   	
   }
   
   public void setSf501PData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf501PData,sf501PData.length);
   	
   }
   
     /**
	 * 	Update Sf501PData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501PData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501PData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf501PData with another Field
	 *	@param value
	 */
   public void setSf501PData(Field source) {
       replace(source,0,source.length(),beginSf501PData,SF_501_PDATA_LEN);
   	
   }  
   
     /**
	 * 	Update Sf501PData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf501PData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf501PData,SF_501_PDATA_LEN);
   	
   }
   
     /**
	 * 	Update Sf501PData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501PData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501PData+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf501PRecordFieldLength() {
			return SF_501_PRECORD_LENGTH;
		}

}
  
