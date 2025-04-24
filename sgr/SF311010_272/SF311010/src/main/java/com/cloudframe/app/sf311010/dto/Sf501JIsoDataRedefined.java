package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf501JIsoDataRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf501JIsoDataRedefined extends Sf501JIsoDataRedefinedSerialized { 
   

						private char[] sf501J3Data = Field.fillLowValue(7912);
	
	/**
	* Constructor for Sf501JIsoDataRedefined
	**/
    public Sf501JIsoDataRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf501JIsoDataRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf501JIsoDataRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sf501J3Data
	 *	@return sf501J3Data
	 */
   public char[] getSf501J3Data() throws CFException{
     if (isSf501J3DataModified()) { 
        sf501J3Data = refreshSf501J3Data();
     }
   		return sf501J3Data;
   }

  
	/**
	*  set variable sf501J3Data
	*  Corresponding COBOL Variable is SF501-J3-DATA
	*  @param value
	**/
   public void setSf501J3Data(char[] value) {
      sf501J3Data = checkSf501J3DataConstraints(value);
      serializeSf501J3Data(sf501J3Data);
   } 

     /**
	 * 	Update Sf501J3Data 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf501J3Data(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf501J3Data,sf501J3Data.length);
   	
   }
   
   public void setSf501J3Data(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf501J3Data,sf501J3Data.length);
   	
   }
   
     /**
	 * 	Update Sf501J3Data 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf501J3Data(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501J3Data+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf501J3Data with another Field
	 *	@param value
	 */
   public void setSf501J3Data(Field source) {
       replace(source,0,source.length(),beginSf501J3Data,SF_501_J_3_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Sf501J3Data 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf501J3Data(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf501J3Data,SF_501_J_3_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Sf501J3Data 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf501J3Data(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf501J3Data+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf501JIsoDataRedefinedFieldLength() {
			return SF_501_JISO_DATA_REDEFINED_LENGTH;
		}

}
  
