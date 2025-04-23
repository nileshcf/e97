package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503IsoDataRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf503IsoDataRedefined extends Sf503IsoDataRedefinedSerialized { 
   

						private char[] sf503J3Data = Field.fillLowValue(32664);
	
	/**
	* Constructor for Sf503IsoDataRedefined
	**/
    public Sf503IsoDataRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf503IsoDataRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503IsoDataRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sf503J3Data
	 *	@return sf503J3Data
	 */
   public char[] getSf503J3Data() throws CFException{
     if (isSf503J3DataModified()) { 
        sf503J3Data = refreshSf503J3Data();
     }
   		return sf503J3Data;
   }

  
	/**
	*  set variable sf503J3Data
	*  Corresponding COBOL Variable is SF503-J3-DATA
	*  @param value
	**/
   public void setSf503J3Data(char[] value) {
      sf503J3Data = checkSf503J3DataConstraints(value);
      serializeSf503J3Data(sf503J3Data);
   } 

     /**
	 * 	Update Sf503J3Data 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503J3Data(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503J3Data,sf503J3Data.length);
   	
   }
   
   public void setSf503J3Data(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503J3Data,sf503J3Data.length);
   	
   }
   
     /**
	 * 	Update Sf503J3Data 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503J3Data(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503J3Data+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503J3Data with another Field
	 *	@param value
	 */
   public void setSf503J3Data(Field source) {
       replace(source,0,source.length(),beginSf503J3Data,SF_503_J_3_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503J3Data 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503J3Data(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503J3Data,SF_503_J_3_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Sf503J3Data 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503J3Data(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503J3Data+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf503IsoDataRedefinedFieldLength() {
			return SF_503_ISO_DATA_REDEFINED_LENGTH;
		}

}
  
