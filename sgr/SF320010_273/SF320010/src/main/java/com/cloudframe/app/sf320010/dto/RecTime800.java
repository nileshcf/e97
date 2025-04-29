package com.cloudframe.app.sf320010.dto;

/**
*  The class RecTime800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RecTime800 extends RecTime800Serialized { 
   

						private char[] recTimeHh800 = new char[2];


						private char[] recTimeMm800 = new char[2];


						private char[] recTimeSs800 = new char[2];
	
	/**
	* Constructor for RecTime800
	**/
    public RecTime800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RecTime800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RecTime800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setRecTimeHh800(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 2
             ,1
             );
								setRecTimeMm800(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 5
             ,1
             );
								setRecTimeSs800(fillSpace(2));
    } 

	/**
	 *	Returns the value of recTimeHh800
	 *	@return recTimeHh800
	 */
   public char[] getRecTimeHh800() throws CFException{
     if (isRecTimeHh800Modified()) { 
        recTimeHh800 = refreshRecTimeHh800();
     }
   		return recTimeHh800;
   }

  
	/**
	*  set variable recTimeHh800
	*  Corresponding COBOL Variable is 800-REC-TIME-HH
	*  @param value
	**/
   public void setRecTimeHh800(char[] value) {
      recTimeHh800 = checkRecTimeHh800Constraints(value);
      serializeRecTimeHh800(recTimeHh800);
   } 

     /**
	 * 	Update RecTimeHh800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecTimeHh800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRecTimeHh800,recTimeHh800.length);
   	
   }
   
   public void setRecTimeHh800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRecTimeHh800,recTimeHh800.length);
   	
   }
   
     /**
	 * 	Update RecTimeHh800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecTimeHh800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecTimeHh800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RecTimeHh800 with another Field
	 *	@param value
	 */
   public void setRecTimeHh800(Field source) {
       replace(source,0,source.length(),beginRecTimeHh800,REC_TIME_HH_800_LEN);
   	
   }  
   
     /**
	 * 	Update RecTimeHh800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecTimeHh800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRecTimeHh800,REC_TIME_HH_800_LEN);
   	
   }
   
     /**
	 * 	Update RecTimeHh800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecTimeHh800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecTimeHh800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of recTimeMm800
	 *	@return recTimeMm800
	 */
   public char[] getRecTimeMm800() throws CFException{
     if (isRecTimeMm800Modified()) { 
        recTimeMm800 = refreshRecTimeMm800();
     }
   		return recTimeMm800;
   }

  
	/**
	*  set variable recTimeMm800
	*  Corresponding COBOL Variable is 800-REC-TIME-MM
	*  @param value
	**/
   public void setRecTimeMm800(char[] value) {
      recTimeMm800 = checkRecTimeMm800Constraints(value);
      serializeRecTimeMm800(recTimeMm800);
   } 

     /**
	 * 	Update RecTimeMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecTimeMm800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRecTimeMm800,recTimeMm800.length);
   	
   }
   
   public void setRecTimeMm800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRecTimeMm800,recTimeMm800.length);
   	
   }
   
     /**
	 * 	Update RecTimeMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecTimeMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecTimeMm800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RecTimeMm800 with another Field
	 *	@param value
	 */
   public void setRecTimeMm800(Field source) {
       replace(source,0,source.length(),beginRecTimeMm800,REC_TIME_MM_800_LEN);
   	
   }  
   
     /**
	 * 	Update RecTimeMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecTimeMm800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRecTimeMm800,REC_TIME_MM_800_LEN);
   	
   }
   
     /**
	 * 	Update RecTimeMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecTimeMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecTimeMm800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of recTimeSs800
	 *	@return recTimeSs800
	 */
   public char[] getRecTimeSs800() throws CFException{
     if (isRecTimeSs800Modified()) { 
        recTimeSs800 = refreshRecTimeSs800();
     }
   		return recTimeSs800;
   }

  
	/**
	*  set variable recTimeSs800
	*  Corresponding COBOL Variable is 800-REC-TIME-SS
	*  @param value
	**/
   public void setRecTimeSs800(char[] value) {
      recTimeSs800 = checkRecTimeSs800Constraints(value);
      serializeRecTimeSs800(recTimeSs800);
   } 

     /**
	 * 	Update RecTimeSs800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecTimeSs800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRecTimeSs800,recTimeSs800.length);
   	
   }
   
   public void setRecTimeSs800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRecTimeSs800,recTimeSs800.length);
   	
   }
   
     /**
	 * 	Update RecTimeSs800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecTimeSs800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecTimeSs800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RecTimeSs800 with another Field
	 *	@param value
	 */
   public void setRecTimeSs800(Field source) {
       replace(source,0,source.length(),beginRecTimeSs800,REC_TIME_SS_800_LEN);
   	
   }  
   
     /**
	 * 	Update RecTimeSs800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecTimeSs800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRecTimeSs800,REC_TIME_SS_800_LEN);
   	
   }
   
     /**
	 * 	Update RecTimeSs800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecTimeSs800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecTimeSs800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRecTime800FieldLength() {
			return REC_TIME_800_LENGTH;
		}

}
  
