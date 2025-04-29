package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503IsoRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf503IsoRecord extends Sf503IsoRecordSerialized { 
   

						private char[] sf503IsoData = Field.fillLowValue(32691);
				private Sf503IsoDataRedefined sf503IsoDataRedefined = new Sf503IsoDataRedefined();
	
	/**
	* Constructor for Sf503IsoRecord
	**/
    public Sf503IsoRecord() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf503IsoRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503IsoRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			sf503IsoDataRedefined.setParent(this,getStartOffset() + 46);
    } 

	/**
	 *	Returns the value of sf503IsoData
	 *	@return sf503IsoData
	 */
   public char[] getSf503IsoData() throws CFException{
     if (isSf503IsoDataModified()) { 
        sf503IsoData = refreshSf503IsoData();
     }
   		return sf503IsoData;
   }

  
	/**
	*  set variable sf503IsoData
	*  Corresponding COBOL Variable is SF503-ISO-DATA
	*  @param value
	**/
   public void setSf503IsoData(char[] value) {
      sf503IsoData = checkSf503IsoDataConstraints(value);
      serializeSf503IsoData(sf503IsoData);
   } 

     /**
	 * 	Update Sf503IsoData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503IsoData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503IsoData,sf503IsoData.length);
   	
   }
   
   public void setSf503IsoData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503IsoData,sf503IsoData.length);
   	
   }
   
     /**
	 * 	Update Sf503IsoData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503IsoData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503IsoData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503IsoData with another Field
	 *	@param value
	 */
   public void setSf503IsoData(Field source) {
       replace(source,0,source.length(),beginSf503IsoData,SF_503_ISO_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503IsoData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503IsoData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503IsoData,SF_503_ISO_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Sf503IsoData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503IsoData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503IsoData+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503IsoDataRedefined
	 *	@return sf503IsoDataRedefined
	 */   
	 public Sf503IsoDataRedefined getSf503IsoDataRedefined() {
   	return sf503IsoDataRedefined;
   }
   /**
	* 	Update Sf503IsoDataRedefined with the passed value
	*   Corresponding COBOL Variable is SF503-ISO-DATA-REDEFINED
	*	@param value
	*/
   public void setSf503IsoDataRedefined(char[] value) {
      sf503IsoDataRedefined.setString(value); 
   }   
    
     /**
	 * 	Update Sf503IsoDataRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf503IsoDataRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503IsoDataRedefined.begin,sf503IsoDataRedefined.length());
   }
   
     /**
	 * 	Update Sf503IsoDataRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503IsoDataRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503IsoDataRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf503IsoDataRedefined with another Field
	 *	@param value
	 */
   public void setSf503IsoDataRedefined(Field source) {
   	replace(source,0,source.length(),sf503IsoDataRedefined.begin,sf503IsoDataRedefined.length());
   }  
   
     /**
	 * 	Update Sf503IsoDataRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf503IsoDataRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503IsoDataRedefined.begin,sf503IsoDataRedefined.length());
   }
   
     /**
	 * 	Update Sf503IsoDataRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503IsoDataRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503IsoDataRedefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSf503IsoRecordFieldLength() {
			return SF_503_ISO_RECORD_LENGTH;
		}

}
  
