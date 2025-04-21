package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503IsoJDataRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf503IsoJDataRedefined extends Sf503IsoJDataRedefinedSerialized { 
   

						private char[] sf503J3JData = Field.fillLowValue(32650);
	
	/**
	* Constructor for Sf503IsoJDataRedefined
	**/
    public Sf503IsoJDataRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf503IsoJDataRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503IsoJDataRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sf503J3JData
	 *	@return sf503J3JData
	 */
   public char[] getSf503J3JData() throws CFException{
     if (isSf503J3JDataModified()) { 
        sf503J3JData = refreshSf503J3JData();
     }
   		return sf503J3JData;
   }

  
	/**
	*  set variable sf503J3JData
	*  Corresponding COBOL Variable is SF503-J3-J-DATA
	*  @param value
	**/
   public void setSf503J3JData(char[] value) {
      sf503J3JData = checkSf503J3JDataConstraints(value);
      serializeSf503J3JData(sf503J3JData);
   } 

     /**
	 * 	Update Sf503J3JData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503J3JData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503J3JData,sf503J3JData.length);
   	
   }
   
   public void setSf503J3JData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503J3JData,sf503J3JData.length);
   	
   }
   
     /**
	 * 	Update Sf503J3JData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503J3JData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503J3JData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503J3JData with another Field
	 *	@param value
	 */
   public void setSf503J3JData(Field source) {
       replace(source,0,source.length(),beginSf503J3JData,SF_503_J_3_JDATA_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503J3JData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503J3JData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503J3JData,SF_503_J_3_JDATA_LEN);
   	
   }
   
     /**
	 * 	Update Sf503J3JData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503J3JData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503J3JData+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf503IsoJDataRedefinedFieldLength() {
			return SF_503_ISO_JDATA_REDEFINED_LENGTH;
		}

}
  
