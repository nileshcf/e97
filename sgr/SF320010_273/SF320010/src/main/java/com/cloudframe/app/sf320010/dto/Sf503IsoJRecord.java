package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503IsoJRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf503IsoJRecord extends Sf503IsoJRecordSerialized { 
   

						private char[] sf503IsoJData = Field.fillLowValue(32677);
				private Sf503IsoJDataRedefined sf503IsoJDataRedefined = new Sf503IsoJDataRedefined();
	
	/**
	* Constructor for Sf503IsoJRecord
	**/
    public Sf503IsoJRecord() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf503IsoJRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503IsoJRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			sf503IsoJDataRedefined.setParent(this,getStartOffset() + 60);
    } 

	/**
	 *	Returns the value of sf503IsoJData
	 *	@return sf503IsoJData
	 */
   public char[] getSf503IsoJData() throws CFException{
     if (isSf503IsoJDataModified()) { 
        sf503IsoJData = refreshSf503IsoJData();
     }
   		return sf503IsoJData;
   }

  
	/**
	*  set variable sf503IsoJData
	*  Corresponding COBOL Variable is SF503-ISO-J-DATA
	*  @param value
	**/
   public void setSf503IsoJData(char[] value) {
      sf503IsoJData = checkSf503IsoJDataConstraints(value);
      serializeSf503IsoJData(sf503IsoJData);
   } 

     /**
	 * 	Update Sf503IsoJData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503IsoJData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503IsoJData,sf503IsoJData.length);
   	
   }
   
   public void setSf503IsoJData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503IsoJData,sf503IsoJData.length);
   	
   }
   
     /**
	 * 	Update Sf503IsoJData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503IsoJData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503IsoJData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503IsoJData with another Field
	 *	@param value
	 */
   public void setSf503IsoJData(Field source) {
       replace(source,0,source.length(),beginSf503IsoJData,SF_503_ISO_JDATA_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503IsoJData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503IsoJData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503IsoJData,SF_503_ISO_JDATA_LEN);
   	
   }
   
     /**
	 * 	Update Sf503IsoJData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503IsoJData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503IsoJData+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503IsoJDataRedefined
	 *	@return sf503IsoJDataRedefined
	 */   
	 public Sf503IsoJDataRedefined getSf503IsoJDataRedefined() {
   	return sf503IsoJDataRedefined;
   }
   /**
	* 	Update Sf503IsoJDataRedefined with the passed value
	*   Corresponding COBOL Variable is SF503-ISO-J-DATA-REDEFINED
	*	@param value
	*/
   public void setSf503IsoJDataRedefined(char[] value) {
      sf503IsoJDataRedefined.setString(value); 
   }   
    
     /**
	 * 	Update Sf503IsoJDataRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf503IsoJDataRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503IsoJDataRedefined.begin,sf503IsoJDataRedefined.length());
   }
   
     /**
	 * 	Update Sf503IsoJDataRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503IsoJDataRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503IsoJDataRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf503IsoJDataRedefined with another Field
	 *	@param value
	 */
   public void setSf503IsoJDataRedefined(Field source) {
   	replace(source,0,source.length(),sf503IsoJDataRedefined.begin,sf503IsoJDataRedefined.length());
   }  
   
     /**
	 * 	Update Sf503IsoJDataRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf503IsoJDataRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503IsoJDataRedefined.begin,sf503IsoJDataRedefined.length());
   }
   
     /**
	 * 	Update Sf503IsoJDataRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503IsoJDataRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503IsoJDataRedefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSf503IsoJRecordFieldLength() {
			return SF_503_ISO_JRECORD_LENGTH;
		}

}
  
