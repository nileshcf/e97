package com.cloudframe.app.ip305710.dto;

/**
*  The class AbendMessage900 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:47. using version 5.0.0.254
**/


import com.cloudframe.app.ip305710.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AbendMessage900 extends AbendMessage900Serialized { 
   



						private char[] abendCode900 = new char[4];


						private char[] abendText900 = new char[80];
	
	/**
	* Constructor for AbendMessage900
	**/
    public AbendMessage900() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP305710").toCharArray()
             , getStartOffset() + 0
             ,8
             );
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 8
             ,1
             );
								setAbendCode900(fillSpace(4));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 13
             ,1
             );
								setAbendText900(pad(80," ".toCharArray(),' ',RIGHT_PAD));
    }


 

	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException{
     if (isAbendCode900Modified()) { 
        abendCode900 = refreshAbendCode900();
     }
   		return abendCode900;
   }

  
	/**
	*  set variable abendCode900
	*  Corresponding COBOL Variable is 900-ABEND-CODE
	*  @param value
	**/
   public void setAbendCode900(char[] value) {
      abendCode900 = checkAbendCode900Constraints(value);
      serializeAbendCode900(abendCode900);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAbendCode900,abendCode900.length);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAbendCode900,abendCode900.length);
   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendCode900+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
       replace(source,0,source.length(),beginAbendCode900,ABEND_CODE_900_LEN);
   	
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAbendCode900,ABEND_CODE_900_LEN);
   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendCode900+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException{
     if (isAbendText900Modified()) { 
        abendText900 = refreshAbendText900();
     }
   		return abendText900;
   }

  
	/**
	*  set variable abendText900
	*  Corresponding COBOL Variable is 900-ABEND-TEXT
	*  @param value
	**/
   public void setAbendText900(char[] value) {
      abendText900 = checkAbendText900Constraints(value);
      serializeAbendText900(abendText900);
   } 

     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAbendText900,abendText900.length);
   	
   }
   
   public void setAbendText900(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAbendText900,abendText900.length);
   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendText900+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AbendText900 with another Field
	 *	@param value
	 */
   public void setAbendText900(Field source) {
       replace(source,0,source.length(),beginAbendText900,ABEND_TEXT_900_LEN);
   	
   }  
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAbendText900,ABEND_TEXT_900_LEN);
   	
   }
   
     /**
	 * 	Update AbendText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendText900+targetIndex,targetLen);
    
   }

	
	
	

		public static int getAbendMessage900FieldLength() {
			return ABEND_MESSAGE_900_LENGTH;
		}

}
  
