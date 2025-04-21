package com.cloudframe.app.cfstring.dto;

/**
*  The class ExtServiceStartDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.cfstring.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ExtServiceStartDt extends ExtServiceStartDtSerialized { 
   

						private char[] slash3 = new char[1];

						private char[] slash4 = new char[1];
	
	/**
	* Constructor for ExtServiceStartDt
	**/
    public ExtServiceStartDt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ExtServiceStartDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ExtServiceStartDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSlash3(("/").toCharArray());
								setSlash4(("/").toCharArray());
    } 

	/**
	 *	Returns the value of slash3
	 *	@return slash3
	 */
   public char[] getSlash3() throws CFException{
     if (isSlash3Modified()) { 
        slash3 = refreshSlash3();
     }
   		return slash3;
   }

  
	/**
	*  set variable slash3
	*  Corresponding COBOL Variable is WS-SLASH-3
	*  @param value
	**/
   public void setSlash3(char[] value) {
      slash3 = checkSlash3Constraints(value);
      serializeSlash3(slash3);
   } 

     /**
	 * 	Update Slash3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSlash3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSlash3,slash3.length);
   	
   }
   
   public void setSlash3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSlash3,slash3.length);
   	
   }
   
     /**
	 * 	Update Slash3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSlash3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSlash3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Slash3 with another Field
	 *	@param value
	 */
   public void setSlash3(Field source) {
       replace(source,0,source.length(),beginSlash3,SLASH_3_LEN);
   	
   }  
   
     /**
	 * 	Update Slash3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSlash3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSlash3,SLASH_3_LEN);
   	
   }
   
     /**
	 * 	Update Slash3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSlash3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSlash3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of slash4
	 *	@return slash4
	 */
   public char[] getSlash4() throws CFException{
     if (isSlash4Modified()) { 
        slash4 = refreshSlash4();
     }
   		return slash4;
   }

  
	/**
	*  set variable slash4
	*  Corresponding COBOL Variable is WS-SLASH-4
	*  @param value
	**/
   public void setSlash4(char[] value) {
      slash4 = checkSlash4Constraints(value);
      serializeSlash4(slash4);
   } 

     /**
	 * 	Update Slash4 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSlash4(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSlash4,slash4.length);
   	
   }
   
   public void setSlash4(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSlash4,slash4.length);
   	
   }
   
     /**
	 * 	Update Slash4 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSlash4(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSlash4+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Slash4 with another Field
	 *	@param value
	 */
   public void setSlash4(Field source) {
       replace(source,0,source.length(),beginSlash4,SLASH_4_LEN);
   	
   }  
   
     /**
	 * 	Update Slash4 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSlash4(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSlash4,SLASH_4_LEN);
   	
   }
   
     /**
	 * 	Update Slash4 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSlash4(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSlash4+targetIndex,targetLen);
    
   }

	
	
	

		public static int getExtServiceStartDtFieldLength() {
			return EXT_SERVICE_START_DT_LENGTH;
		}

}
  
