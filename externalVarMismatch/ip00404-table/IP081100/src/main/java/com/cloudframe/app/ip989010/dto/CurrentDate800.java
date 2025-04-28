package com.cloudframe.app.ip989010.dto;

/**
*  The class CurrentDate800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CurrentDate800 extends CurrentDate800Serialized { 
   

						private char[] curDtCc800 = new char[2];
				private CurDtYymmdd800 curDtYymmdd800 = new CurDtYymmdd800();
	
	/**
	* Constructor for CurrentDate800
	**/
    public CurrentDate800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CurrentDate800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurrentDate800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			curDtYymmdd800.setParent(this,getStartOffset() + 2);
								setCurDtCc800(fillSpace(2));
    } 

	/**
	 *	Returns the value of curDtCc800
	 *	@return curDtCc800
	 */
   public char[] getCurDtCc800() throws CFException{
     if (isCurDtCc800Modified()) { 
        curDtCc800 = refreshCurDtCc800();
     }
   		return curDtCc800;
   }

  
	/**
	*  set variable curDtCc800
	*  Corresponding COBOL Variable is 800-CUR-DT-CC
	*  @param value
	**/
   public void setCurDtCc800(char[] value) {
      curDtCc800 = checkCurDtCc800Constraints(value);
      serializeCurDtCc800(curDtCc800);
   } 

     /**
	 * 	Update CurDtCc800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCurDtCc800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCurDtCc800,curDtCc800.length);
   	
   }
   
   public void setCurDtCc800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCurDtCc800,curDtCc800.length);
   	
   }
   
     /**
	 * 	Update CurDtCc800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurDtCc800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurDtCc800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CurDtCc800 with another Field
	 *	@param value
	 */
   public void setCurDtCc800(Field source) {
       replace(source,0,source.length(),beginCurDtCc800,CUR_DT_CC_800_LEN);
   	
   }  
   
     /**
	 * 	Update CurDtCc800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCurDtCc800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCurDtCc800,CUR_DT_CC_800_LEN);
   	
   }
   
     /**
	 * 	Update CurDtCc800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurDtCc800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCurDtCc800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of curDtYymmdd800
	 *	@return curDtYymmdd800
	 */   
	 public CurDtYymmdd800 getCurDtYymmdd800() {
   	return curDtYymmdd800;
   }
   /**
	* 	Update CurDtYymmdd800 with the passed value
	*   Corresponding COBOL Variable is 800-CUR-DT-YYMMDD
	*	@param value
	*/
   public void setCurDtYymmdd800(char[] value) {
      curDtYymmdd800.setString(value); 
   }   
    
     /**
	 * 	Update CurDtYymmdd800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCurDtYymmdd800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,curDtYymmdd800.begin,curDtYymmdd800.length());
   }
   
     /**
	 * 	Update CurDtYymmdd800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCurDtYymmdd800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,curDtYymmdd800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CurDtYymmdd800 with another Field
	 *	@param value
	 */
   public void setCurDtYymmdd800(Field source) {
   	replace(source,0,source.length(),curDtYymmdd800.begin,curDtYymmdd800.length());
   }  
   
     /**
	 * 	Update CurDtYymmdd800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCurDtYymmdd800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,curDtYymmdd800.begin,curDtYymmdd800.length());
   }
   
     /**
	 * 	Update CurDtYymmdd800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCurDtYymmdd800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,curDtYymmdd800.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCurrentDate800FieldLength() {
			return CURRENT_DATE_800_LENGTH;
		}

}
  
