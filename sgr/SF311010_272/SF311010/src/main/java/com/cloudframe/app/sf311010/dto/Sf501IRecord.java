package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf501IRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:30. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf501IRecord extends Sf501IRecordSerialized { 
   

						private char[] sf501IData = Field.fillLowValue(7941);
	
	/**
	* Constructor for Sf501IRecord
	**/
    public Sf501IRecord() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf501IRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf501IRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sf501IData
	 *	@return sf501IData
	 */
   public char[] getSf501IData() throws CFException{
     if (isSf501IDataModified()) { 
        sf501IData = refreshSf501IData();
     }
   		return sf501IData;
   }

  
	/**
	*  set variable sf501IData
	*  Corresponding COBOL Variable is SF501-I-DATA
	*  @param value
	**/
   public void setSf501IData(char[] value) {
      sf501IData = checkSf501IDataConstraints(value);
      serializeSf501IData(sf501IData);
   } 

     /**
	 * 	Update Sf501IData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf501IData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf501IData,sf501IData.length);
   	
   }
   
   public void setSf501IData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf501IData,sf501IData.length);
   	
   }
   
     /**
	 * 	Update Sf501IData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501IData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501IData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf501IData with another Field
	 *	@param value
	 */
   public void setSf501IData(Field source) {
       replace(source,0,source.length(),beginSf501IData,SF_501_IDATA_LEN);
   	
   }  
   
     /**
	 * 	Update Sf501IData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf501IData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf501IData,SF_501_IDATA_LEN);
   	
   }
   
     /**
	 * 	Update Sf501IData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501IData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501IData+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf501IRecordFieldLength() {
			return SF_501_IRECORD_LENGTH;
		}

}
  
