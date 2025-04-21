package com.cloudframe.app.ip606130.dto;

/**
*  The class UpdateTrailerRec200 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class UpdateTrailerRec200 extends UpdateTrailerRec200Serialized { 
   

						private char[] updateRestOfData200 = Field.fillLowValue(50);
	
	/**
	* Constructor for UpdateTrailerRec200
	**/
    public UpdateTrailerRec200() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for UpdateTrailerRec200. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public UpdateTrailerRec200(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of updateRestOfData200
	 *	@return updateRestOfData200
	 */
   public char[] getUpdateRestOfData200() throws CFException{
     if (isUpdateRestOfData200Modified()) { 
        updateRestOfData200 = refreshUpdateRestOfData200();
     }
   		return updateRestOfData200;
   }

  
	/**
	*  set variable updateRestOfData200
	*  Corresponding COBOL Variable is 200-UPDATE-REST-OF-DATA
	*  @param value
	**/
   public void setUpdateRestOfData200(char[] value) {
      updateRestOfData200 = checkUpdateRestOfData200Constraints(value);
      serializeUpdateRestOfData200(updateRestOfData200);
   } 

     /**
	 * 	Update UpdateRestOfData200 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUpdateRestOfData200(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUpdateRestOfData200,updateRestOfData200.length);
   	
   }
   
   public void setUpdateRestOfData200(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUpdateRestOfData200,updateRestOfData200.length);
   	
   }
   
     /**
	 * 	Update UpdateRestOfData200 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUpdateRestOfData200(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUpdateRestOfData200+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UpdateRestOfData200 with another Field
	 *	@param value
	 */
   public void setUpdateRestOfData200(Field source) {
       replace(source,0,source.length(),beginUpdateRestOfData200,UPDATE_REST_OF_DATA_200_LEN);
   	
   }  
   
     /**
	 * 	Update UpdateRestOfData200 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUpdateRestOfData200(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUpdateRestOfData200,UPDATE_REST_OF_DATA_200_LEN);
   	
   }
   
     /**
	 * 	Update UpdateRestOfData200 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUpdateRestOfData200(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUpdateRestOfData200+targetIndex,targetLen);
    
   }

	
	
	

		public static int getUpdateTrailerRec200FieldLength() {
			return UPDATE_TRAILER_REC_200_LENGTH;
		}

}
  
