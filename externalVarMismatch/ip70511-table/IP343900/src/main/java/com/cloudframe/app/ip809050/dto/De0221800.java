package com.cloudframe.app.ip809050.dto;

/**
*  The class De0221800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class De0221800 extends De0221800Serialized { 
   


						private char[] de022800 = new char[12];

	
	/**
	* Constructor for De0221800
	**/
    public De0221800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for De0221800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public De0221800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("'").toCharArray()
             , getStartOffset() + 0
             ,1
             );
								setDe022800(fillSpace(12));
       replaceValue( // serialize and save the value
             ("'").toCharArray()
             , getStartOffset() + 13
             ,1
             );
    } 

	/**
	 *	Returns the value of de022800
	 *	@return de022800
	 */
   public char[] getDe022800() throws CFException{
     if (isDe022800Modified()) { 
        de022800 = refreshDe022800();
     }
   		return de022800;
   }

  
	/**
	*  set variable de022800
	*  Corresponding COBOL Variable is 800-DE022
	*  @param value
	**/
   public void setDe022800(char[] value) {
      de022800 = checkDe022800Constraints(value);
      serializeDe022800(de022800);
   } 

     /**
	 * 	Update De022800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDe022800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDe022800,de022800.length);
   	
   }
   
   public void setDe022800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDe022800,de022800.length);
   	
   }
   
     /**
	 * 	Update De022800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDe022800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDe022800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update De022800 with another Field
	 *	@param value
	 */
   public void setDe022800(Field source) {
       replace(source,0,source.length(),beginDe022800,DE_022800_LEN);
   	
   }  
   
     /**
	 * 	Update De022800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDe022800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDe022800,DE_022800_LEN);
   	
   }
   
     /**
	 * 	Update De022800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDe022800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDe022800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDe0221800FieldLength() {
			return DE_0221800_LENGTH;
		}

}
  
