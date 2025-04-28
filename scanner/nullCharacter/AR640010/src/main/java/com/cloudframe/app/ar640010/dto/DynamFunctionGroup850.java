package com.cloudframe.app.ar640010.dto;

/**
*  The class DynamFunctionGroup850 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DynamFunctionGroup850 extends DynamFunctionGroup850Serialized { 
   

						private char[] dynamFunction850 = new char[8];
	
	/**
	* Constructor for DynamFunctionGroup850
	**/
    public DynamFunctionGroup850() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DynamFunctionGroup850. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DynamFunctionGroup850(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setDynamFunction850(fillSpace(8));
    } 

	/**
	 *	Returns the value of dynamFunction850
	 *	@return dynamFunction850
	 */
   public char[] getDynamFunction850() throws CFException{
     if (isDynamFunction850Modified()) { 
        dynamFunction850 = refreshDynamFunction850();
     }
   		return dynamFunction850;
   }

  
	/**
	*  set variable dynamFunction850
	*  Corresponding COBOL Variable is 850-DYNAM-FUNCTION
	*  @param value
	**/
   public void setDynamFunction850(char[] value) {
      dynamFunction850 = checkDynamFunction850Constraints(value);
      serializeDynamFunction850(dynamFunction850);
   } 

     /**
	 * 	Update DynamFunction850 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDynamFunction850(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDynamFunction850,dynamFunction850.length);
   	
   }
   
   public void setDynamFunction850(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDynamFunction850,dynamFunction850.length);
   	
   }
   
     /**
	 * 	Update DynamFunction850 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamFunction850(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamFunction850+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DynamFunction850 with another Field
	 *	@param value
	 */
   public void setDynamFunction850(Field source) {
       replace(source,0,source.length(),beginDynamFunction850,DYNAM_FUNCTION_850_LEN);
   	
   }  
   
     /**
	 * 	Update DynamFunction850 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDynamFunction850(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDynamFunction850,DYNAM_FUNCTION_850_LEN);
   	
   }
   
     /**
	 * 	Update DynamFunction850 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamFunction850(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamFunction850+targetIndex,targetLen);
    
   }
	char[] dynamFunctionAlloc8885088Value = "ALLOC   ".toCharArray();
	/**
	 *	Test condition "ALLOC   " for isDynamFunctionAlloc88850()
	 *	@return  Returns true if isDynamFunctionAlloc88850() is "ALLOC   "
	 */
   public boolean isDynamFunctionAlloc88850() throws CFException {
      return (  compareChars( getDynamFunction850() , dynamFunctionAlloc8885088Value)  == 0  );
   }


	/**
	*  set values "ALLOC   "
	*/
   	public void setDynamFunctionAlloc88850True() {  			
    	setDynamFunction850( dynamFunctionAlloc8885088Value);
   	}
	char[] dynamFunctionEnd8885088Value = "END     ".toCharArray();
	/**
	 *	Test condition "END     " for isDynamFunctionEnd88850()
	 *	@return  Returns true if isDynamFunctionEnd88850() is "END     "
	 */
   public boolean isDynamFunctionEnd88850() throws CFException {
      return (  compareChars( getDynamFunction850() , dynamFunctionEnd8885088Value)  == 0  );
   }


	/**
	*  set values "END     "
	*/
   	public void setDynamFunctionEnd88850True() {  			
    	setDynamFunction850( dynamFunctionEnd8885088Value);
   	}
	char[] dynamFunctionInfo8885088Value = "INFO    ".toCharArray();
	/**
	 *	Test condition "INFO    " for isDynamFunctionInfo88850()
	 *	@return  Returns true if isDynamFunctionInfo88850() is "INFO    "
	 */
   public boolean isDynamFunctionInfo88850() throws CFException {
      return (  compareChars( getDynamFunction850() , dynamFunctionInfo8885088Value)  == 0  );
   }


	/**
	*  set values "INFO    "
	*/
   	public void setDynamFunctionInfo88850True() {  			
    	setDynamFunction850( dynamFunctionInfo8885088Value);
   	}
	char[] dynamFunctionInit8885088Value = "INIT    ".toCharArray();
	/**
	 *	Test condition "INIT    " for isDynamFunctionInit88850()
	 *	@return  Returns true if isDynamFunctionInit88850() is "INIT    "
	 */
   public boolean isDynamFunctionInit88850() throws CFException {
      return (  compareChars( getDynamFunction850() , dynamFunctionInit8885088Value)  == 0  );
   }


	/**
	*  set values "INIT    "
	*/
   	public void setDynamFunctionInit88850True() {  			
    	setDynamFunction850( dynamFunctionInit8885088Value);
   	}
	char[] dynamFunctionUnalloc8885088Value = "UNALLOC ".toCharArray();
	/**
	 *	Test condition "UNALLOC " for isDynamFunctionUnalloc88850()
	 *	@return  Returns true if isDynamFunctionUnalloc88850() is "UNALLOC "
	 */
   public boolean isDynamFunctionUnalloc88850() throws CFException {
      return (  compareChars( getDynamFunction850() , dynamFunctionUnalloc8885088Value)  == 0  );
   }


	/**
	*  set values "UNALLOC "
	*/
   	public void setDynamFunctionUnalloc88850True() {  			
    	setDynamFunction850( dynamFunctionUnalloc8885088Value);
   	}

	
	
	

		public static int getDynamFunctionGroup850FieldLength() {
			return DYNAM_FUNCTION_GROUP_850_LENGTH;
		}

}
  
