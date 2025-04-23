package com.cloudframe.app.sf305120.dto;

/**
*  The class AsciiTextW300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AsciiTextW300 extends AsciiTextW300Serialized { 
   
				private AsciiTextWGroup300Group1 asciiTextWGroup300Group1 = new AsciiTextWGroup300Group1();

				private AsciiTextWGroup300Group5 asciiTextWGroup300Group5 = new AsciiTextWGroup300Group5();
				private AsciiTextWGroup300Group8 asciiTextWGroup300Group8 = new AsciiTextWGroup300Group8();
	
	/**
	* Constructor for AsciiTextW300
	**/
    public AsciiTextW300() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AsciiTextW300. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AsciiTextW300(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			asciiTextWGroup300Group1.setParent(this,getStartOffset() + 0);
	       			asciiTextWGroup300Group5.setParent(this,getStartOffset() + 34);
	       			asciiTextWGroup300Group8.setParent(this,getStartOffset() + 60);
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x30,(byte)0x31,(byte)0x32,(byte)0x33,(byte)0x34,(byte)0x35,(byte)0x36,(byte)0x37,(byte)0x38,(byte)0x39}).toCharArray()
             , getStartOffset() + 24
             ,10
             );
    } 

	/**
	 *	Returns the value of asciiTextWGroup300Group1
	 *	@return asciiTextWGroup300Group1
	 */   
	 public AsciiTextWGroup300Group1 getAsciiTextWGroup300Group1() {
   	return asciiTextWGroup300Group1;
   }
   /**
	* 	Update AsciiTextWGroup300Group1 with the passed value
	*   Corresponding COBOL Variable is FILLER
	*	@param value
	*/
   public void setAsciiTextWGroup300Group1(char[] value) {
      asciiTextWGroup300Group1.setString(value); 
   }   
    
     /**
	 * 	Update AsciiTextWGroup300Group1 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAsciiTextWGroup300Group1(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,asciiTextWGroup300Group1.begin,asciiTextWGroup300Group1.length());
   }
   
     /**
	 * 	Update AsciiTextWGroup300Group1 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAsciiTextWGroup300Group1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,asciiTextWGroup300Group1.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AsciiTextWGroup300Group1 with another Field
	 *	@param value
	 */
   public void setAsciiTextWGroup300Group1(Field source) {
   	replace(source,0,source.length(),asciiTextWGroup300Group1.begin,asciiTextWGroup300Group1.length());
   }  
   
     /**
	 * 	Update AsciiTextWGroup300Group1 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAsciiTextWGroup300Group1(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,asciiTextWGroup300Group1.begin,asciiTextWGroup300Group1.length());
   }
   
     /**
	 * 	Update AsciiTextWGroup300Group1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAsciiTextWGroup300Group1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,asciiTextWGroup300Group1.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of asciiTextWGroup300Group5
	 *	@return asciiTextWGroup300Group5
	 */   
	 public AsciiTextWGroup300Group5 getAsciiTextWGroup300Group5() {
   	return asciiTextWGroup300Group5;
   }
   /**
	* 	Update AsciiTextWGroup300Group5 with the passed value
	*   Corresponding COBOL Variable is FILLER
	*	@param value
	*/
   public void setAsciiTextWGroup300Group5(char[] value) {
      asciiTextWGroup300Group5.setString(value); 
   }   
    
     /**
	 * 	Update AsciiTextWGroup300Group5 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAsciiTextWGroup300Group5(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,asciiTextWGroup300Group5.begin,asciiTextWGroup300Group5.length());
   }
   
     /**
	 * 	Update AsciiTextWGroup300Group5 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAsciiTextWGroup300Group5(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,asciiTextWGroup300Group5.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AsciiTextWGroup300Group5 with another Field
	 *	@param value
	 */
   public void setAsciiTextWGroup300Group5(Field source) {
   	replace(source,0,source.length(),asciiTextWGroup300Group5.begin,asciiTextWGroup300Group5.length());
   }  
   
     /**
	 * 	Update AsciiTextWGroup300Group5 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAsciiTextWGroup300Group5(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,asciiTextWGroup300Group5.begin,asciiTextWGroup300Group5.length());
   }
   
     /**
	 * 	Update AsciiTextWGroup300Group5 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAsciiTextWGroup300Group5(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,asciiTextWGroup300Group5.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of asciiTextWGroup300Group8
	 *	@return asciiTextWGroup300Group8
	 */   
	 public AsciiTextWGroup300Group8 getAsciiTextWGroup300Group8() {
   	return asciiTextWGroup300Group8;
   }
   /**
	* 	Update AsciiTextWGroup300Group8 with the passed value
	*   Corresponding COBOL Variable is FILLER
	*	@param value
	*/
   public void setAsciiTextWGroup300Group8(char[] value) {
      asciiTextWGroup300Group8.setString(value); 
   }   
    
     /**
	 * 	Update AsciiTextWGroup300Group8 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAsciiTextWGroup300Group8(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,asciiTextWGroup300Group8.begin,asciiTextWGroup300Group8.length());
   }
   
     /**
	 * 	Update AsciiTextWGroup300Group8 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAsciiTextWGroup300Group8(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,asciiTextWGroup300Group8.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update AsciiTextWGroup300Group8 with another Field
	 *	@param value
	 */
   public void setAsciiTextWGroup300Group8(Field source) {
   	replace(source,0,source.length(),asciiTextWGroup300Group8.begin,asciiTextWGroup300Group8.length());
   }  
   
     /**
	 * 	Update AsciiTextWGroup300Group8 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAsciiTextWGroup300Group8(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,asciiTextWGroup300Group8.begin,asciiTextWGroup300Group8.length());
   }
   
     /**
	 * 	Update AsciiTextWGroup300Group8 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAsciiTextWGroup300Group8(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,asciiTextWGroup300Group8.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getAsciiTextW300FieldLength() {
			return ASCII_TEXT_W_300_LENGTH;
		}

}
  
