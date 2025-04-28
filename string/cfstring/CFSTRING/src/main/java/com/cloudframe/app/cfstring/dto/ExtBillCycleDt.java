package com.cloudframe.app.cfstring.dto;

/**
*  The class ExtBillCycleDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/


import com.cloudframe.app.cfstring.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ExtBillCycleDt extends ExtBillCycleDtSerialized { 
   

						private char[] slash1 = new char[1];

						private char[] slash2 = new char[1];
	
	/**
	* Constructor for ExtBillCycleDt
	**/
    public ExtBillCycleDt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ExtBillCycleDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ExtBillCycleDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSlash1(("/").toCharArray());
								setSlash2(("/").toCharArray());
    } 

	/**
	 *	Returns the value of slash1
	 *	@return slash1
	 */
   public char[] getSlash1() throws CFException{
     if (isSlash1Modified()) { 
        slash1 = refreshSlash1();
     }
   		return slash1;
   }

  
	/**
	*  set variable slash1
	*  Corresponding COBOL Variable is WS-SLASH-1
	*  @param value
	**/
   public void setSlash1(char[] value) {
      slash1 = checkSlash1Constraints(value);
      serializeSlash1(slash1);
   } 

     /**
	 * 	Update Slash1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSlash1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSlash1,slash1.length);
   	
   }
   
   public void setSlash1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSlash1,slash1.length);
   	
   }
   
     /**
	 * 	Update Slash1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSlash1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSlash1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Slash1 with another Field
	 *	@param value
	 */
   public void setSlash1(Field source) {
       replace(source,0,source.length(),beginSlash1,SLASH_1_LEN);
   	
   }  
   
     /**
	 * 	Update Slash1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSlash1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSlash1,SLASH_1_LEN);
   	
   }
   
     /**
	 * 	Update Slash1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSlash1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSlash1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of slash2
	 *	@return slash2
	 */
   public char[] getSlash2() throws CFException{
     if (isSlash2Modified()) { 
        slash2 = refreshSlash2();
     }
   		return slash2;
   }

  
	/**
	*  set variable slash2
	*  Corresponding COBOL Variable is WS-SLASH-2
	*  @param value
	**/
   public void setSlash2(char[] value) {
      slash2 = checkSlash2Constraints(value);
      serializeSlash2(slash2);
   } 

     /**
	 * 	Update Slash2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSlash2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSlash2,slash2.length);
   	
   }
   
   public void setSlash2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSlash2,slash2.length);
   	
   }
   
     /**
	 * 	Update Slash2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSlash2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSlash2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Slash2 with another Field
	 *	@param value
	 */
   public void setSlash2(Field source) {
       replace(source,0,source.length(),beginSlash2,SLASH_2_LEN);
   	
   }  
   
     /**
	 * 	Update Slash2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSlash2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSlash2,SLASH_2_LEN);
   	
   }
   
     /**
	 * 	Update Slash2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSlash2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSlash2+targetIndex,targetLen);
    
   }

	
	
	

		public static int getExtBillCycleDtFieldLength() {
			return EXT_BILL_CYCLE_DT_LENGTH;
		}

}
  
