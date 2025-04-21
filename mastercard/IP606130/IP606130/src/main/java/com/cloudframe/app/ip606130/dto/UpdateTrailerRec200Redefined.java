package com.cloudframe.app.ip606130.dto;

/**
*  The class UpdateTrailerRec200Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class UpdateTrailerRec200Redefined extends UpdateTrailerRec200RedefinedSerialized { 
   

						private char[] updateTrailerTable1200 = Field.fillLowValue(8);

								private long updateTrailerCount1200;
	
	/**
	* Constructor for UpdateTrailerRec200Redefined
	**/
    public UpdateTrailerRec200Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for UpdateTrailerRec200Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public UpdateTrailerRec200Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of updateTrailerTable1200
	 *	@return updateTrailerTable1200
	 */
   public char[] getUpdateTrailerTable1200() throws CFException{
     if (isUpdateTrailerTable1200Modified()) { 
        updateTrailerTable1200 = refreshUpdateTrailerTable1200();
     }
   		return updateTrailerTable1200;
   }

  
	/**
	*  set variable updateTrailerTable1200
	*  Corresponding COBOL Variable is 200-UPDATE-TRAILER-TABLE1
	*  @param value
	**/
   public void setUpdateTrailerTable1200(char[] value) {
      updateTrailerTable1200 = checkUpdateTrailerTable1200Constraints(value);
      serializeUpdateTrailerTable1200(updateTrailerTable1200);
   } 

     /**
	 * 	Update UpdateTrailerTable1200 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUpdateTrailerTable1200(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUpdateTrailerTable1200,updateTrailerTable1200.length);
   	
   }
   
   public void setUpdateTrailerTable1200(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUpdateTrailerTable1200,updateTrailerTable1200.length);
   	
   }
   
     /**
	 * 	Update UpdateTrailerTable1200 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUpdateTrailerTable1200(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUpdateTrailerTable1200+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UpdateTrailerTable1200 with another Field
	 *	@param value
	 */
   public void setUpdateTrailerTable1200(Field source) {
       replace(source,0,source.length(),beginUpdateTrailerTable1200,UPDATE_TRAILER_TABLE_1200_LEN);
   	
   }  
   
     /**
	 * 	Update UpdateTrailerTable1200 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUpdateTrailerTable1200(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUpdateTrailerTable1200,UPDATE_TRAILER_TABLE_1200_LEN);
   	
   }
   
     /**
	 * 	Update UpdateTrailerTable1200 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUpdateTrailerTable1200(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUpdateTrailerTable1200+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of updateTrailerCount1200
	 *	@return updateTrailerCount1200
	 */
	public long getUpdateTrailerCount1200() throws CFException {
       if (isUpdateTrailerCount1200Modified()) { 
           updateTrailerCount1200 = refreshUpdateTrailerCount1200();
        }
   		return updateTrailerCount1200;
	}
	

	
	   
	/**
	 * 	Update UpdateTrailerCount1200 with the passed value
	 *  Corresponding COBOL Variable is 200-UPDATE-TRAILER-COUNT1
	 *	@param number
	 */
	public void setUpdateTrailerCount1200(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    updateTrailerCount1200 = checkUpdateTrailerCount1200MaxLimit(number); 
		serializeUpdateTrailerCount1200(updateTrailerCount1200);
	}
	

	/**
	 * 	Update UpdateTrailerCount1200 with the passed value
	 *	@param value (String or char[])
	 */
	public void setUpdateTrailerCount1200(char[] value) throws CFException {
		 updateTrailerCount1200 = serializeUpdateTrailerCount1200(value);
	}
	/**
	 * 	Update UpdateTrailerCount1200 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setUpdateTrailerCount1200String(char[] value) throws CFException {
		 setUpdateTrailerCount1200(value);
	}

	
	
	

		public static int getUpdateTrailerRec200RedefinedFieldLength() {
			return UPDATE_TRAILER_REC_200_REDEFINED_LENGTH;
		}

}
  
