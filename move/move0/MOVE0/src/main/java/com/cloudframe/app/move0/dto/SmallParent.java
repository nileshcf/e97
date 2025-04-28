package com.cloudframe.app.move0.dto;

/**
*  The class SmallParent is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:04. using version 5.0.0.256
**/


import com.cloudframe.app.move0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


public class SmallParent extends SmallParentSerialized { 
   

								private char[] parent11 = Field.fillLowValue(10);
				private Parent21 parent21 = new Parent21();

								private char[] parent31 = Field.fillLowValue(10);
	
	/**
	* Constructor for SmallParent
	**/
    public SmallParent() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			parent21.setParent(this,getStartOffset() + 10);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of parent11
	 *	@return parent11
	 */
   public char[] getParent11() throws CFException{
     if (isParent11Modified()) { 
        parent11 = refreshParent11();
     }
   		return parent11;
   }

  
	/**
	*  set variable parent11
	*  Corresponding COBOL Variable is WS-PARENT-11
	*  @param value
	**/
   public void setParent11(char[] value) {
      parent11 = checkParent11Constraints(value);
      serializeParent11(parent11);
   } 

     /**
	 * 	Update Parent11 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParent11(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginParent11,parent11.length);
   	
   }
   
   public void setParent11(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginParent11,parent11.length);
   	
   }
   
     /**
	 * 	Update Parent11 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParent11(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParent11+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Parent11 with another Field
	 *	@param value
	 */
   public void setParent11(Field source) {
       replace(source,0,source.length(),beginParent11,PARENT_11_LEN);
   	
   }  
   
     /**
	 * 	Update Parent11 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParent11(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginParent11,PARENT_11_LEN);
   	
   }
   
     /**
	 * 	Update Parent11 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParent11(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParent11+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of parent21
	 *	@return parent21
	 */   
	 public Parent21 getParent21() {
   	return parent21;
   }
   /**
	* 	Update Parent21 with the passed value
	*   Corresponding COBOL Variable is WS-PARENT-21
	*	@param value
	*/
   public void setParent21(char[] value) {
      parent21.setString(value); 
   }   
    
     /**
	 * 	Update Parent21 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setParent21(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,parent21.begin,parent21.length());
   }
   
     /**
	 * 	Update Parent21 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParent21(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,parent21.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Parent21 with another Field
	 *	@param value
	 */
   public void setParent21(Field source) {
   	replace(source,0,source.length(),parent21.begin,parent21.length());
   }  
   
     /**
	 * 	Update Parent21 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setParent21(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,parent21.begin,parent21.length());
   }
   
     /**
	 * 	Update Parent21 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParent21(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,parent21.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of parent31
	 *	@return parent31
	 */
   public char[] getParent31() throws CFException{
     if (isParent31Modified()) { 
        parent31 = refreshParent31();
     }
   		return parent31;
   }

  
	/**
	*  set variable parent31
	*  Corresponding COBOL Variable is WS-PARENT-31
	*  @param value
	**/
   public void setParent31(char[] value) {
      parent31 = checkParent31Constraints(value);
      serializeParent31(parent31);
   } 

     /**
	 * 	Update Parent31 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParent31(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginParent31,parent31.length);
   	
   }
   
   public void setParent31(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginParent31,parent31.length);
   	
   }
   
     /**
	 * 	Update Parent31 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParent31(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParent31+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Parent31 with another Field
	 *	@param value
	 */
   public void setParent31(Field source) {
       replace(source,0,source.length(),beginParent31,PARENT_31_LEN);
   	
   }  
   
     /**
	 * 	Update Parent31 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParent31(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginParent31,PARENT_31_LEN);
   	
   }
   
     /**
	 * 	Update Parent31 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParent31(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParent31+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes SmallParent
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setParent11(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_481093248,"0".toCharArray()));
          parent21.initialize();
     
                    setParent31(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_481093248,"0".toCharArray()));
   }

		public static int getSmallParentFieldLength() {
			return SMALL_PARENT_LENGTH;
		}

}
  
