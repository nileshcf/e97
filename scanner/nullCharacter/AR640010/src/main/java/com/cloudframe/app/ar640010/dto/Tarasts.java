package com.cloudframe.app.ar640010.dto;

/**
*  The class Tarasts is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Tarasts extends TarastsSerialized {
   

						private char[] tarastsStatRefId = Field.fillLowValue(4);

						private char[] tarastsStatRefDesc = Field.fillLowValue(80);
	
	/**
	* Constructor for Tarasts
	**/
    public Tarasts() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of tarastsStatRefId
	 *	@return tarastsStatRefId
	 */
   public char[] getTarastsStatRefId() throws CFException{
     if (isTarastsStatRefIdModified()) { 
        tarastsStatRefId = refreshTarastsStatRefId();
     }
   		return tarastsStatRefId;
   }

  
	/**
	*  set variable tarastsStatRefId
	*  Corresponding COBOL Variable is TARASTS-STAT-REF-ID
	*  @param value
	**/
   public void setTarastsStatRefId(char[] value) {
      tarastsStatRefId = checkTarastsStatRefIdConstraints(value);
      serializeTarastsStatRefId(tarastsStatRefId);
   } 

     /**
	 * 	Update TarastsStatRefId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarastsStatRefId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarastsStatRefId,tarastsStatRefId.length);
   	
   }
   
   public void setTarastsStatRefId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarastsStatRefId,tarastsStatRefId.length);
   	
   }
   
     /**
	 * 	Update TarastsStatRefId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarastsStatRefId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarastsStatRefId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarastsStatRefId with another Field
	 *	@param value
	 */
   public void setTarastsStatRefId(Field source) {
       replace(source,0,source.length(),beginTarastsStatRefId,TARASTS_STAT_REF_ID_LEN);
   	
   }  
   
     /**
	 * 	Update TarastsStatRefId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarastsStatRefId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarastsStatRefId,TARASTS_STAT_REF_ID_LEN);
   	
   }
   
     /**
	 * 	Update TarastsStatRefId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarastsStatRefId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarastsStatRefId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tarastsStatRefDesc
	 *	@return tarastsStatRefDesc
	 */
   public char[] getTarastsStatRefDesc() throws CFException{
     if (isTarastsStatRefDescModified()) { 
        tarastsStatRefDesc = refreshTarastsStatRefDesc();
     }
   		return tarastsStatRefDesc;
   }

  
	/**
	*  set variable tarastsStatRefDesc
	*  Corresponding COBOL Variable is TARASTS-STAT-REF-DESC
	*  @param value
	**/
   public void setTarastsStatRefDesc(char[] value) {
      tarastsStatRefDesc = checkTarastsStatRefDescConstraints(value);
      serializeTarastsStatRefDesc(tarastsStatRefDesc);
   } 

     /**
	 * 	Update TarastsStatRefDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarastsStatRefDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarastsStatRefDesc,tarastsStatRefDesc.length);
   	
   }
   
   public void setTarastsStatRefDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarastsStatRefDesc,tarastsStatRefDesc.length);
   	
   }
   
     /**
	 * 	Update TarastsStatRefDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarastsStatRefDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarastsStatRefDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarastsStatRefDesc with another Field
	 *	@param value
	 */
   public void setTarastsStatRefDesc(Field source) {
       replace(source,0,source.length(),beginTarastsStatRefDesc,TARASTS_STAT_REF_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update TarastsStatRefDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarastsStatRefDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarastsStatRefDesc,TARASTS_STAT_REF_DESC_LEN);
   	
   }
   
     /**
	 * 	Update TarastsStatRefDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarastsStatRefDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarastsStatRefDesc+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTarastsFieldLength() {
			return TARASTS_LENGTH;
		}

}
  
