package com.cloudframe.app.cfstring.dto;

/**
*  The class ExtActEffDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.cfstring.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ExtActEffDt extends ExtActEffDtSerialized { 
   

						private char[] slashAct1 = new char[1];

						private char[] slashAct2 = new char[1];
	
	/**
	* Constructor for ExtActEffDt
	**/
    public ExtActEffDt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ExtActEffDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ExtActEffDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSlashAct1(("/").toCharArray());
								setSlashAct2(("/").toCharArray());
    } 

	/**
	 *	Returns the value of slashAct1
	 *	@return slashAct1
	 */
   public char[] getSlashAct1() throws CFException{
     if (isSlashAct1Modified()) { 
        slashAct1 = refreshSlashAct1();
     }
   		return slashAct1;
   }

  
	/**
	*  set variable slashAct1
	*  Corresponding COBOL Variable is SLASH-ACT-1
	*  @param value
	**/
   public void setSlashAct1(char[] value) {
      slashAct1 = checkSlashAct1Constraints(value);
      serializeSlashAct1(slashAct1);
   } 

     /**
	 * 	Update SlashAct1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSlashAct1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSlashAct1,slashAct1.length);
   	
   }
   
   public void setSlashAct1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSlashAct1,slashAct1.length);
   	
   }
   
     /**
	 * 	Update SlashAct1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSlashAct1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSlashAct1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SlashAct1 with another Field
	 *	@param value
	 */
   public void setSlashAct1(Field source) {
       replace(source,0,source.length(),beginSlashAct1,SLASH_ACT_1_LEN);
   	
   }  
   
     /**
	 * 	Update SlashAct1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSlashAct1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSlashAct1,SLASH_ACT_1_LEN);
   	
   }
   
     /**
	 * 	Update SlashAct1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSlashAct1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSlashAct1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of slashAct2
	 *	@return slashAct2
	 */
   public char[] getSlashAct2() throws CFException{
     if (isSlashAct2Modified()) { 
        slashAct2 = refreshSlashAct2();
     }
   		return slashAct2;
   }

  
	/**
	*  set variable slashAct2
	*  Corresponding COBOL Variable is SLASH-ACT-2
	*  @param value
	**/
   public void setSlashAct2(char[] value) {
      slashAct2 = checkSlashAct2Constraints(value);
      serializeSlashAct2(slashAct2);
   } 

     /**
	 * 	Update SlashAct2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSlashAct2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSlashAct2,slashAct2.length);
   	
   }
   
   public void setSlashAct2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSlashAct2,slashAct2.length);
   	
   }
   
     /**
	 * 	Update SlashAct2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSlashAct2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSlashAct2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SlashAct2 with another Field
	 *	@param value
	 */
   public void setSlashAct2(Field source) {
       replace(source,0,source.length(),beginSlashAct2,SLASH_ACT_2_LEN);
   	
   }  
   
     /**
	 * 	Update SlashAct2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSlashAct2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSlashAct2,SLASH_ACT_2_LEN);
   	
   }
   
     /**
	 * 	Update SlashAct2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSlashAct2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSlashAct2+targetIndex,targetLen);
    
   }

	
	
	

		public static int getExtActEffDtFieldLength() {
			return EXT_ACT_EFF_DT_LENGTH;
		}

}
  
