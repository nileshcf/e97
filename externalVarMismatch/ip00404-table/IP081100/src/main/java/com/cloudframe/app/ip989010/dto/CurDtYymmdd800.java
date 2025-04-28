package com.cloudframe.app.ip989010.dto;

/**
*  The class CurDtYymmdd800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CurDtYymmdd800 extends CurDtYymmdd800Serialized { 
   

						private char[] curDtYy800 = new char[2];

						private char[] curDtMm800 = new char[2];

						private char[] curDtDd800 = new char[2];
	
	/**
	* Constructor for CurDtYymmdd800
	**/
    public CurDtYymmdd800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CurDtYymmdd800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurDtYymmdd800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCurDtYy800(fillSpace(2));
								setCurDtMm800(fillSpace(2));
								setCurDtDd800(fillSpace(2));
    } 

	/**
	 *	Returns the value of curDtYy800
	 *	@return curDtYy800
	 */
   public char[] getCurDtYy800() throws CFException{
     if (isCurDtYy800Modified()) { 
        curDtYy800 = refreshCurDtYy800();
     }
   		return curDtYy800;
   }

  
	/**
	*  set variable curDtYy800
	*  Corresponding COBOL Variable is 800-CUR-DT-YY
	*  @param value
	**/
   public void setCurDtYy800(char[] value) {
      curDtYy800 = checkCurDtYy800Constraints(value);
      serializeCurDtYy800(curDtYy800);
   } 

     /**
	 * 	Update CurDtYy800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurDtYy800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurDtYy800,curDtYy800.length);
   	
   }
   
   public void setCurDtYy800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurDtYy800,curDtYy800.length);
   	
   }
   
     /**
	 * 	Update CurDtYy800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurDtYy800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurDtYy800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurDtYy800 with another Field
	 *	@param value
	 */
   public void setCurDtYy800(Field source) {
       replace(source,0,source.length(),beginCurDtYy800,CUR_DT_YY_800_LEN);
   	
   }  
   
     /**
	 * 	Update CurDtYy800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurDtYy800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurDtYy800,CUR_DT_YY_800_LEN);
   	
   }
   
     /**
	 * 	Update CurDtYy800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurDtYy800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurDtYy800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of curDtMm800
	 *	@return curDtMm800
	 */
   public char[] getCurDtMm800() throws CFException{
     if (isCurDtMm800Modified()) { 
        curDtMm800 = refreshCurDtMm800();
     }
   		return curDtMm800;
   }

  
	/**
	*  set variable curDtMm800
	*  Corresponding COBOL Variable is 800-CUR-DT-MM
	*  @param value
	**/
   public void setCurDtMm800(char[] value) {
      curDtMm800 = checkCurDtMm800Constraints(value);
      serializeCurDtMm800(curDtMm800);
   } 

     /**
	 * 	Update CurDtMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurDtMm800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurDtMm800,curDtMm800.length);
   	
   }
   
   public void setCurDtMm800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurDtMm800,curDtMm800.length);
   	
   }
   
     /**
	 * 	Update CurDtMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurDtMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurDtMm800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurDtMm800 with another Field
	 *	@param value
	 */
   public void setCurDtMm800(Field source) {
       replace(source,0,source.length(),beginCurDtMm800,CUR_DT_MM_800_LEN);
   	
   }  
   
     /**
	 * 	Update CurDtMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurDtMm800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurDtMm800,CUR_DT_MM_800_LEN);
   	
   }
   
     /**
	 * 	Update CurDtMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurDtMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurDtMm800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of curDtDd800
	 *	@return curDtDd800
	 */
   public char[] getCurDtDd800() throws CFException{
     if (isCurDtDd800Modified()) { 
        curDtDd800 = refreshCurDtDd800();
     }
   		return curDtDd800;
   }

  
	/**
	*  set variable curDtDd800
	*  Corresponding COBOL Variable is 800-CUR-DT-DD
	*  @param value
	**/
   public void setCurDtDd800(char[] value) {
      curDtDd800 = checkCurDtDd800Constraints(value);
      serializeCurDtDd800(curDtDd800);
   } 

     /**
	 * 	Update CurDtDd800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurDtDd800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurDtDd800,curDtDd800.length);
   	
   }
   
   public void setCurDtDd800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurDtDd800,curDtDd800.length);
   	
   }
   
     /**
	 * 	Update CurDtDd800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurDtDd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurDtDd800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurDtDd800 with another Field
	 *	@param value
	 */
   public void setCurDtDd800(Field source) {
       replace(source,0,source.length(),beginCurDtDd800,CUR_DT_DD_800_LEN);
   	
   }  
   
     /**
	 * 	Update CurDtDd800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurDtDd800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurDtDd800,CUR_DT_DD_800_LEN);
   	
   }
   
     /**
	 * 	Update CurDtDd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurDtDd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurDtDd800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCurDtYymmdd800FieldLength() {
			return CUR_DT_YYMMDD_800_LENGTH;
		}

}
  
