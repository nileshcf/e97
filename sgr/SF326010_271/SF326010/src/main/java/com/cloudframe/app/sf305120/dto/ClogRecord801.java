package com.cloudframe.app.sf305120.dto;

/**
*  The class ClogRecord801 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ClogRecord801 extends ClogRecord801Serialized {
   
				private CFixedHeader801 cFixedHeader801 = new CFixedHeader801();

						private char[] clogVariableData801 = new char[8157];
	
	/**
	* Constructor for ClogRecord801
	**/
    public ClogRecord801() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			cFixedHeader801.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setClogVariableData801(fillLowValue(8157));
    }


 

	/**
	 *	Returns the value of cFixedHeader801
	 *	@return cFixedHeader801
	 */   
	 public CFixedHeader801 getCFixedHeader801() {
   	return cFixedHeader801;
   }
   /**
	* 	Update CFixedHeader801 with the passed value
	*   Corresponding COBOL Variable is 801-C-FIXED-HEADER
	*	@param value
	*/
   public void setCFixedHeader801(char[] value) {
      cFixedHeader801.setString(value); 
   }   
    
     /**
	 * 	Update CFixedHeader801 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCFixedHeader801(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cFixedHeader801.begin,cFixedHeader801.length());
   }
   
     /**
	 * 	Update CFixedHeader801 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCFixedHeader801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cFixedHeader801.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CFixedHeader801 with another Field
	 *	@param value
	 */
   public void setCFixedHeader801(Field source) {
   	replace(source,0,source.length(),cFixedHeader801.begin,cFixedHeader801.length());
   }  
   
     /**
	 * 	Update CFixedHeader801 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCFixedHeader801(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cFixedHeader801.begin,cFixedHeader801.length());
   }
   
     /**
	 * 	Update CFixedHeader801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCFixedHeader801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cFixedHeader801.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of clogVariableData801
	 *	@return clogVariableData801
	 */
   public char[] getClogVariableData801() throws CFException{
     if (isClogVariableData801Modified()) { 
        clogVariableData801 = refreshClogVariableData801();
     }
   		return clogVariableData801;
   }

  
	/**
	*  set variable clogVariableData801
	*  Corresponding COBOL Variable is 801-CLOG-VARIABLE-DATA
	*  @param value
	**/
   public void setClogVariableData801(char[] value) {
      clogVariableData801 = checkClogVariableData801Constraints(value);
      serializeClogVariableData801(clogVariableData801);
   } 

     /**
	 * 	Update ClogVariableData801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setClogVariableData801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginClogVariableData801,clogVariableData801.length);
   	
   }
   
   public void setClogVariableData801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginClogVariableData801,clogVariableData801.length);
   	
   }
   
     /**
	 * 	Update ClogVariableData801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setClogVariableData801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClogVariableData801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ClogVariableData801 with another Field
	 *	@param value
	 */
   public void setClogVariableData801(Field source) {
       replace(source,0,source.length(),beginClogVariableData801,CLOG_VARIABLE_DATA_801_LEN);
   	
   }  
   
     /**
	 * 	Update ClogVariableData801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setClogVariableData801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginClogVariableData801,CLOG_VARIABLE_DATA_801_LEN);
   	
   }
   
     /**
	 * 	Update ClogVariableData801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setClogVariableData801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginClogVariableData801+targetIndex,targetLen);
    
   }

	
	
	

		public static int getClogRecord801FieldLength() {
			return CLOG_RECORD_801_LENGTH;
		}

}
  
