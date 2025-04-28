package com.cloudframe.app.move0.dto;

/**
*  The class Parent5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:04. using version 5.0.0.256
**/


import com.cloudframe.app.move0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Parent5 extends Parent5Serialized { 
   
				private Parent51 parent51 = new Parent51();
	
	/**
	* Constructor for Parent5
	**/
    public Parent5() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Parent5. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Parent5(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			parent51.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of parent51
	 *	@return parent51
	 */   
	 public Parent51 getParent51() {
   	return parent51;
   }
   /**
	* 	Update Parent51 with the passed value
	*   Corresponding COBOL Variable is WS-PARENT-51
	*	@param value
	*/
   public void setParent51(char[] value) {
      parent51.setString(value); 
   }   
    
     /**
	 * 	Update Parent51 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setParent51(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,parent51.begin,parent51.length());
   }
   
     /**
	 * 	Update Parent51 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParent51(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,parent51.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Parent51 with another Field
	 *	@param value
	 */
   public void setParent51(Field source) {
   	replace(source,0,source.length(),parent51.begin,parent51.length());
   }  
   
     /**
	 * 	Update Parent51 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setParent51(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,parent51.begin,parent51.length());
   }
   
     /**
	 * 	Update Parent51 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParent51(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,parent51.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Parent5
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          parent51.initialize();
     
   }

		public static int getParent5FieldLength() {
			return PARENT_5_LENGTH;
		}

}
  
