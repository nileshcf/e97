package com.cloudframe.app.sf305120.dto;

/**
*  The class ZlogRecord801 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ZlogRecord801 extends ZlogRecord801Serialized {
   
				private FixedHeader801 fixedHeader801 = new FixedHeader801();

						private char[] zlogVariableData801 = new char[8157];
	
	/**
	* Constructor for ZlogRecord801
	**/
    public ZlogRecord801() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			fixedHeader801.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setZlogVariableData801(fillLowValue(8157));
    }


 

	/**
	 *	Returns the value of fixedHeader801
	 *	@return fixedHeader801
	 */   
	 public FixedHeader801 getFixedHeader801() {
   	return fixedHeader801;
   }
   /**
	* 	Update FixedHeader801 with the passed value
	*   Corresponding COBOL Variable is 801-FIXED-HEADER
	*	@param value
	*/
   public void setFixedHeader801(char[] value) {
      fixedHeader801.setString(value); 
   }   
    
     /**
	 * 	Update FixedHeader801 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFixedHeader801(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fixedHeader801.begin,fixedHeader801.length());
   }
   
     /**
	 * 	Update FixedHeader801 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFixedHeader801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fixedHeader801.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FixedHeader801 with another Field
	 *	@param value
	 */
   public void setFixedHeader801(Field source) {
   	replace(source,0,source.length(),fixedHeader801.begin,fixedHeader801.length());
   }  
   
     /**
	 * 	Update FixedHeader801 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFixedHeader801(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fixedHeader801.begin,fixedHeader801.length());
   }
   
     /**
	 * 	Update FixedHeader801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFixedHeader801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fixedHeader801.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of zlogVariableData801
	 *	@return zlogVariableData801
	 */
   public char[] getZlogVariableData801() throws CFException{
     if (isZlogVariableData801Modified()) { 
        zlogVariableData801 = refreshZlogVariableData801();
     }
   		return zlogVariableData801;
   }

  
	/**
	*  set variable zlogVariableData801
	*  Corresponding COBOL Variable is 801-ZLOG-VARIABLE-DATA
	*  @param value
	**/
   public void setZlogVariableData801(char[] value) {
      zlogVariableData801 = checkZlogVariableData801Constraints(value);
      serializeZlogVariableData801(zlogVariableData801);
   } 

     /**
	 * 	Update ZlogVariableData801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZlogVariableData801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginZlogVariableData801,zlogVariableData801.length);
   	
   }
   
   public void setZlogVariableData801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginZlogVariableData801,zlogVariableData801.length);
   	
   }
   
     /**
	 * 	Update ZlogVariableData801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZlogVariableData801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginZlogVariableData801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ZlogVariableData801 with another Field
	 *	@param value
	 */
   public void setZlogVariableData801(Field source) {
       replace(source,0,source.length(),beginZlogVariableData801,ZLOG_VARIABLE_DATA_801_LEN);
   	
   }  
   
     /**
	 * 	Update ZlogVariableData801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZlogVariableData801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginZlogVariableData801,ZLOG_VARIABLE_DATA_801_LEN);
   	
   }
   
     /**
	 * 	Update ZlogVariableData801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZlogVariableData801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginZlogVariableData801+targetIndex,targetLen);
    
   }

	
	
	

		public static int getZlogRecord801FieldLength() {
			return ZLOG_RECORD_801_LENGTH;
		}

}
  
