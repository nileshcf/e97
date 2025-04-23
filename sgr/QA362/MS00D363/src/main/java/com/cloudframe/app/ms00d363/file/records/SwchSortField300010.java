package com.cloudframe.app.ms00d363.file.records;

/**
*  The class SwchSortField300010 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SwchSortField300010 extends SwchSortField300010Serialized { 
   
				private SwchControlField300010 swchControlField300010 = new SwchControlField300010();

						private char[] swchDbCrInd300010 = Field.fillLowValue(1);
	
	/**
	* Constructor for SwchSortField300010
	**/
    public SwchSortField300010() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SwchSortField300010. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SwchSortField300010(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			swchControlField300010.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of swchControlField300010
	 *	@return swchControlField300010
	 */   
	 public SwchControlField300010 getSwchControlField300010() {
   	return swchControlField300010;
   }
   /**
	* 	Update SwchControlField300010 with the passed value
	*   Corresponding COBOL Variable is SWCH-CONTROL-FIELD-300010
	*	@param value
	*/
   public void setSwchControlField300010(char[] value) {
      swchControlField300010.setString(value); 
   }   
    
     /**
	 * 	Update SwchControlField300010 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSwchControlField300010(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,swchControlField300010.begin,swchControlField300010.length());
   }
   
     /**
	 * 	Update SwchControlField300010 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSwchControlField300010(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,swchControlField300010.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SwchControlField300010 with another Field
	 *	@param value
	 */
   public void setSwchControlField300010(Field source) {
   	replace(source,0,source.length(),swchControlField300010.begin,swchControlField300010.length());
   }  
   
     /**
	 * 	Update SwchControlField300010 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSwchControlField300010(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,swchControlField300010.begin,swchControlField300010.length());
   }
   
     /**
	 * 	Update SwchControlField300010 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSwchControlField300010(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,swchControlField300010.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of swchDbCrInd300010
	 *	@return swchDbCrInd300010
	 */
   public char[] getSwchDbCrInd300010() throws CFException{
     if (isSwchDbCrInd300010Modified()) { 
        swchDbCrInd300010 = refreshSwchDbCrInd300010();
     }
   		return swchDbCrInd300010;
   }

  
	/**
	*  set variable swchDbCrInd300010
	*  Corresponding COBOL Variable is SWCH-DB-CR-IND-300010
	*  @param value
	**/
   public void setSwchDbCrInd300010(char[] value) {
      swchDbCrInd300010 = checkSwchDbCrInd300010Constraints(value);
      serializeSwchDbCrInd300010(swchDbCrInd300010);
   } 

     /**
	 * 	Update SwchDbCrInd300010 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSwchDbCrInd300010(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSwchDbCrInd300010,swchDbCrInd300010.length);
   	
   }
   
   public void setSwchDbCrInd300010(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSwchDbCrInd300010,swchDbCrInd300010.length);
   	
   }
   
     /**
	 * 	Update SwchDbCrInd300010 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSwchDbCrInd300010(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSwchDbCrInd300010+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SwchDbCrInd300010 with another Field
	 *	@param value
	 */
   public void setSwchDbCrInd300010(Field source) {
       replace(source,0,source.length(),beginSwchDbCrInd300010,SWCH_DB_CR_IND_300010_LEN);
   	
   }  
   
     /**
	 * 	Update SwchDbCrInd300010 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSwchDbCrInd300010(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSwchDbCrInd300010,SWCH_DB_CR_IND_300010_LEN);
   	
   }
   
     /**
	 * 	Update SwchDbCrInd300010 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSwchDbCrInd300010(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSwchDbCrInd300010+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSwchSortField300010FieldLength() {
			return SWCH_SORT_FIELD_300010_LENGTH;
		}

}
  
