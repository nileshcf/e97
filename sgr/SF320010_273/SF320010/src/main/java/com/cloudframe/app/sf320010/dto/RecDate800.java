package com.cloudframe.app.sf320010.dto;

/**
*  The class RecDate800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RecDate800 extends RecDate800Serialized { 
   

						private char[] recDateCc800 = new char[2];

						private char[] recDateYy800 = new char[2];


						private char[] recDateMm800 = new char[2];


						private char[] recDateDd800 = new char[2];
	
	/**
	* Constructor for RecDate800
	**/
    public RecDate800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RecDate800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RecDate800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setRecDateCc800(fillSpace(2));
								setRecDateYy800(fillSpace(2));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 4
             ,1
             );
								setRecDateMm800(fillSpace(2));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 7
             ,1
             );
								setRecDateDd800(fillSpace(2));
    } 

	/**
	 *	Returns the value of recDateCc800
	 *	@return recDateCc800
	 */
   public char[] getRecDateCc800() throws CFException{
     if (isRecDateCc800Modified()) { 
        recDateCc800 = refreshRecDateCc800();
     }
   		return recDateCc800;
   }

  
	/**
	*  set variable recDateCc800
	*  Corresponding COBOL Variable is 800-REC-DATE-CC
	*  @param value
	**/
   public void setRecDateCc800(char[] value) {
      recDateCc800 = checkRecDateCc800Constraints(value);
      serializeRecDateCc800(recDateCc800);
   } 

     /**
	 * 	Update RecDateCc800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecDateCc800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRecDateCc800,recDateCc800.length);
   	
   }
   
   public void setRecDateCc800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRecDateCc800,recDateCc800.length);
   	
   }
   
     /**
	 * 	Update RecDateCc800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecDateCc800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecDateCc800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RecDateCc800 with another Field
	 *	@param value
	 */
   public void setRecDateCc800(Field source) {
       replace(source,0,source.length(),beginRecDateCc800,REC_DATE_CC_800_LEN);
   	
   }  
   
     /**
	 * 	Update RecDateCc800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecDateCc800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRecDateCc800,REC_DATE_CC_800_LEN);
   	
   }
   
     /**
	 * 	Update RecDateCc800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecDateCc800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecDateCc800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of recDateYy800
	 *	@return recDateYy800
	 */
   public char[] getRecDateYy800() throws CFException{
     if (isRecDateYy800Modified()) { 
        recDateYy800 = refreshRecDateYy800();
     }
   		return recDateYy800;
   }

  
	/**
	*  set variable recDateYy800
	*  Corresponding COBOL Variable is 800-REC-DATE-YY
	*  @param value
	**/
   public void setRecDateYy800(char[] value) {
      recDateYy800 = checkRecDateYy800Constraints(value);
      serializeRecDateYy800(recDateYy800);
   } 

     /**
	 * 	Update RecDateYy800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecDateYy800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRecDateYy800,recDateYy800.length);
   	
   }
   
   public void setRecDateYy800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRecDateYy800,recDateYy800.length);
   	
   }
   
     /**
	 * 	Update RecDateYy800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecDateYy800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecDateYy800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RecDateYy800 with another Field
	 *	@param value
	 */
   public void setRecDateYy800(Field source) {
       replace(source,0,source.length(),beginRecDateYy800,REC_DATE_YY_800_LEN);
   	
   }  
   
     /**
	 * 	Update RecDateYy800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecDateYy800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRecDateYy800,REC_DATE_YY_800_LEN);
   	
   }
   
     /**
	 * 	Update RecDateYy800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecDateYy800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecDateYy800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of recDateMm800
	 *	@return recDateMm800
	 */
   public char[] getRecDateMm800() throws CFException{
     if (isRecDateMm800Modified()) { 
        recDateMm800 = refreshRecDateMm800();
     }
   		return recDateMm800;
   }

  
	/**
	*  set variable recDateMm800
	*  Corresponding COBOL Variable is 800-REC-DATE-MM
	*  @param value
	**/
   public void setRecDateMm800(char[] value) {
      recDateMm800 = checkRecDateMm800Constraints(value);
      serializeRecDateMm800(recDateMm800);
   } 

     /**
	 * 	Update RecDateMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecDateMm800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRecDateMm800,recDateMm800.length);
   	
   }
   
   public void setRecDateMm800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRecDateMm800,recDateMm800.length);
   	
   }
   
     /**
	 * 	Update RecDateMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecDateMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecDateMm800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RecDateMm800 with another Field
	 *	@param value
	 */
   public void setRecDateMm800(Field source) {
       replace(source,0,source.length(),beginRecDateMm800,REC_DATE_MM_800_LEN);
   	
   }  
   
     /**
	 * 	Update RecDateMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecDateMm800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRecDateMm800,REC_DATE_MM_800_LEN);
   	
   }
   
     /**
	 * 	Update RecDateMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecDateMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecDateMm800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of recDateDd800
	 *	@return recDateDd800
	 */
   public char[] getRecDateDd800() throws CFException{
     if (isRecDateDd800Modified()) { 
        recDateDd800 = refreshRecDateDd800();
     }
   		return recDateDd800;
   }

  
	/**
	*  set variable recDateDd800
	*  Corresponding COBOL Variable is 800-REC-DATE-DD
	*  @param value
	**/
   public void setRecDateDd800(char[] value) {
      recDateDd800 = checkRecDateDd800Constraints(value);
      serializeRecDateDd800(recDateDd800);
   } 

     /**
	 * 	Update RecDateDd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecDateDd800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRecDateDd800,recDateDd800.length);
   	
   }
   
   public void setRecDateDd800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRecDateDd800,recDateDd800.length);
   	
   }
   
     /**
	 * 	Update RecDateDd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecDateDd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecDateDd800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RecDateDd800 with another Field
	 *	@param value
	 */
   public void setRecDateDd800(Field source) {
       replace(source,0,source.length(),beginRecDateDd800,REC_DATE_DD_800_LEN);
   	
   }  
   
     /**
	 * 	Update RecDateDd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecDateDd800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRecDateDd800,REC_DATE_DD_800_LEN);
   	
   }
   
     /**
	 * 	Update RecDateDd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecDateDd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecDateDd800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRecDate800FieldLength() {
			return REC_DATE_800_LENGTH;
		}

}
  
