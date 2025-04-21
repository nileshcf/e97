package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503SortFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf503SortFields extends Sf503SortFieldsSerialized { 
   

						private char[] sf503SortMipId = Field.fillLowValue(3);

						private char[] sf503SortDate = Field.fillLowValue(6);

						private char[] sf503SortTime = Field.fillLowValue(6);
	
	/**
	* Constructor for Sf503SortFields
	**/
    public Sf503SortFields() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf503SortFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503SortFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sf503SortMipId
	 *	@return sf503SortMipId
	 */
   public char[] getSf503SortMipId() throws CFException{
     if (isSf503SortMipIdModified()) { 
        sf503SortMipId = refreshSf503SortMipId();
     }
   		return sf503SortMipId;
   }

  
	/**
	*  set variable sf503SortMipId
	*  Corresponding COBOL Variable is SF503-SORT-MIP-ID
	*  @param value
	**/
   public void setSf503SortMipId(char[] value) {
      sf503SortMipId = checkSf503SortMipIdConstraints(value);
      serializeSf503SortMipId(sf503SortMipId);
   } 

     /**
	 * 	Update Sf503SortMipId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503SortMipId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503SortMipId,sf503SortMipId.length);
   	
   }
   
   public void setSf503SortMipId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503SortMipId,sf503SortMipId.length);
   	
   }
   
     /**
	 * 	Update Sf503SortMipId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503SortMipId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503SortMipId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503SortMipId with another Field
	 *	@param value
	 */
   public void setSf503SortMipId(Field source) {
       replace(source,0,source.length(),beginSf503SortMipId,SF_503_SORT_MIP_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503SortMipId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503SortMipId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503SortMipId,SF_503_SORT_MIP_ID_LEN);
   	
   }
   
     /**
	 * 	Update Sf503SortMipId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503SortMipId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503SortMipId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503SortDate
	 *	@return sf503SortDate
	 */
   public char[] getSf503SortDate() throws CFException{
     if (isSf503SortDateModified()) { 
        sf503SortDate = refreshSf503SortDate();
     }
   		return sf503SortDate;
   }

  
	/**
	*  set variable sf503SortDate
	*  Corresponding COBOL Variable is SF503-SORT-DATE
	*  @param value
	**/
   public void setSf503SortDate(char[] value) {
      sf503SortDate = checkSf503SortDateConstraints(value);
      serializeSf503SortDate(sf503SortDate);
   } 

     /**
	 * 	Update Sf503SortDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503SortDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503SortDate,sf503SortDate.length);
   	
   }
   
   public void setSf503SortDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503SortDate,sf503SortDate.length);
   	
   }
   
     /**
	 * 	Update Sf503SortDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503SortDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503SortDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503SortDate with another Field
	 *	@param value
	 */
   public void setSf503SortDate(Field source) {
       replace(source,0,source.length(),beginSf503SortDate,SF_503_SORT_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503SortDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503SortDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503SortDate,SF_503_SORT_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Sf503SortDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503SortDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503SortDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503SortTime
	 *	@return sf503SortTime
	 */
   public char[] getSf503SortTime() throws CFException{
     if (isSf503SortTimeModified()) { 
        sf503SortTime = refreshSf503SortTime();
     }
   		return sf503SortTime;
   }

  
	/**
	*  set variable sf503SortTime
	*  Corresponding COBOL Variable is SF503-SORT-TIME
	*  @param value
	**/
   public void setSf503SortTime(char[] value) {
      sf503SortTime = checkSf503SortTimeConstraints(value);
      serializeSf503SortTime(sf503SortTime);
   } 

     /**
	 * 	Update Sf503SortTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503SortTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503SortTime,sf503SortTime.length);
   	
   }
   
   public void setSf503SortTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503SortTime,sf503SortTime.length);
   	
   }
   
     /**
	 * 	Update Sf503SortTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503SortTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503SortTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503SortTime with another Field
	 *	@param value
	 */
   public void setSf503SortTime(Field source) {
       replace(source,0,source.length(),beginSf503SortTime,SF_503_SORT_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503SortTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503SortTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503SortTime,SF_503_SORT_TIME_LEN);
   	
   }
   
     /**
	 * 	Update Sf503SortTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503SortTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503SortTime+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf503SortFieldsFieldLength() {
			return SF_503_SORT_FIELDS_LENGTH;
		}

}
  
