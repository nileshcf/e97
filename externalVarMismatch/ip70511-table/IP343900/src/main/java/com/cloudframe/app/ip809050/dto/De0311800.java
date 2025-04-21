package com.cloudframe.app.ip809050.dto;

/**
*  The class De0311800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class De0311800 extends De0311800Serialized { 
   


						private char[] de031800 = new char[23];

	
	/**
	* Constructor for De0311800
	**/
    public De0311800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for De0311800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public De0311800(Field parent,int begin) {
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
								setDe031800(fillSpace(23));
       replaceValue( // serialize and save the value
             ("'").toCharArray()
             , getStartOffset() + 24
             ,1
             );
    } 

	/**
	 *	Returns the value of de031800
	 *	@return de031800
	 */
   public char[] getDe031800() throws CFException{
     if (isDe031800Modified()) { 
        de031800 = refreshDe031800();
     }
   		return de031800;
   }

  
	/**
	*  set variable de031800
	*  Corresponding COBOL Variable is 800-DE031
	*  @param value
	**/
   public void setDe031800(char[] value) {
      de031800 = checkDe031800Constraints(value);
      serializeDe031800(de031800);
   } 

     /**
	 * 	Update De031800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDe031800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDe031800,de031800.length);
   	
   }
   
   public void setDe031800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDe031800,de031800.length);
   	
   }
   
     /**
	 * 	Update De031800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDe031800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDe031800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update De031800 with another Field
	 *	@param value
	 */
   public void setDe031800(Field source) {
       replace(source,0,source.length(),beginDe031800,DE_031800_LEN);
   	
   }  
   
     /**
	 * 	Update De031800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDe031800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDe031800,DE_031800_LEN);
   	
   }
   
     /**
	 * 	Update De031800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDe031800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDe031800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDe0311800FieldLength() {
			return DE_0311800_LENGTH;
		}

}
  
