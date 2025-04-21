package com.cloudframe.app.ip606130.dto;

/**
*  The class UpdateTrailerRecGroup200 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class UpdateTrailerRecGroup200 extends UpdateTrailerRecGroup200Serialized {
   
					private UpdateTrailerRec200 updateTrailerRec200 = new UpdateTrailerRec200();
					private UpdateTrailerRec200Redefined updateTrailerRec200Redefined = new UpdateTrailerRec200Redefined();
	
	/**
	* Constructor for UpdateTrailerRecGroup200
	**/
    public UpdateTrailerRecGroup200() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			updateTrailerRec200.setParent(this,getStartOffset() + 0);
	       			updateTrailerRec200Redefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of updateTrailerRec200
	 *	@return updateTrailerRec200
	 */   
	 public UpdateTrailerRec200 getUpdateTrailerRec200() {
   	return updateTrailerRec200;
   }
   /**
	* 	Update UpdateTrailerRec200 with the passed value
	*   Corresponding COBOL Variable is 200-UPDATE-TRAILER-REC
	*	@param value
	*/
   public void setUpdateTrailerRec200(char[] value) {
      updateTrailerRec200.setString(value); 
   }   
    
     /**
	 * 	Update UpdateTrailerRec200 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setUpdateTrailerRec200(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,updateTrailerRec200.begin,updateTrailerRec200.length());
   }
   
     /**
	 * 	Update UpdateTrailerRec200 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUpdateTrailerRec200(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,updateTrailerRec200.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update UpdateTrailerRec200 with another Field
	 *	@param value
	 */
   public void setUpdateTrailerRec200(Field source) {
   	replace(source,0,source.length(),updateTrailerRec200.begin,updateTrailerRec200.length());
   }  
   
     /**
	 * 	Update UpdateTrailerRec200 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setUpdateTrailerRec200(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,updateTrailerRec200.begin,updateTrailerRec200.length());
   }
   
     /**
	 * 	Update UpdateTrailerRec200 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUpdateTrailerRec200(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,updateTrailerRec200.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of updateTrailerRec200Redefined
	 *	@return updateTrailerRec200Redefined
	 */   
	 public UpdateTrailerRec200Redefined getUpdateTrailerRec200Redefined() {
   	return updateTrailerRec200Redefined;
   }
   /**
	* 	Update UpdateTrailerRec200Redefined with the passed value
	*   Corresponding COBOL Variable is 200-UPDATE-TRAILER-REC-REDEFINED
	*	@param value
	*/
   public void setUpdateTrailerRec200Redefined(char[] value) {
      updateTrailerRec200Redefined.setString(value); 
   }   
    
     /**
	 * 	Update UpdateTrailerRec200Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setUpdateTrailerRec200Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,updateTrailerRec200Redefined.begin,updateTrailerRec200Redefined.length());
   }
   
     /**
	 * 	Update UpdateTrailerRec200Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUpdateTrailerRec200Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,updateTrailerRec200Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update UpdateTrailerRec200Redefined with another Field
	 *	@param value
	 */
   public void setUpdateTrailerRec200Redefined(Field source) {
   	replace(source,0,source.length(),updateTrailerRec200Redefined.begin,updateTrailerRec200Redefined.length());
   }  
   
     /**
	 * 	Update UpdateTrailerRec200Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setUpdateTrailerRec200Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,updateTrailerRec200Redefined.begin,updateTrailerRec200Redefined.length());
   }
   
     /**
	 * 	Update UpdateTrailerRec200Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUpdateTrailerRec200Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,updateTrailerRec200Redefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getUpdateTrailerRecGroup200FieldLength() {
			return UPDATE_TRAILER_REC_GROUP_200_LENGTH;
		}

}
  
