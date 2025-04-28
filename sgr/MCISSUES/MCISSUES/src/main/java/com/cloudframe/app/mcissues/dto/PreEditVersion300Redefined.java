package com.cloudframe.app.mcissues.dto;

/**
*  The class PreEditVersion300Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class PreEditVersion300Redefined extends PreEditVersion300RedefinedSerialized { 
   

						private char[] peVerYy300 = Field.fillLowValue(2);

						private char[] peRelease300 = Field.fillLowValue(1);

						private char[] peVerSequence300 = Field.fillLowValue(2);
	
	/**
	* Constructor for PreEditVersion300Redefined
	**/
    public PreEditVersion300Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for PreEditVersion300Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PreEditVersion300Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of peVerYy300
	 *	@return peVerYy300
	 */
   public char[] getPeVerYy300() throws CFException{
     if (isPeVerYy300Modified()) { 
        peVerYy300 = refreshPeVerYy300();
     }
   		return peVerYy300;
   }

  
	/**
	*  set variable peVerYy300
	*  Corresponding COBOL Variable is 300-PE-VER-YY
	*  @param value
	**/
   public void setPeVerYy300(char[] value) {
      peVerYy300 = checkPeVerYy300Constraints(value);
      serializePeVerYy300(peVerYy300);
   } 

     /**
	 * 	Update PeVerYy300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPeVerYy300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPeVerYy300,peVerYy300.length);
   	
   }
   
   public void setPeVerYy300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPeVerYy300,peVerYy300.length);
   	
   }
   
     /**
	 * 	Update PeVerYy300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPeVerYy300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPeVerYy300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PeVerYy300 with another Field
	 *	@param value
	 */
   public void setPeVerYy300(Field source) {
       replace(source,0,source.length(),beginPeVerYy300,PE_VER_YY_300_LEN);
   	
   }  
   
     /**
	 * 	Update PeVerYy300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPeVerYy300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPeVerYy300,PE_VER_YY_300_LEN);
   	
   }
   
     /**
	 * 	Update PeVerYy300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPeVerYy300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPeVerYy300+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of peRelease300
	 *	@return peRelease300
	 */
   public char[] getPeRelease300() throws CFException{
     if (isPeRelease300Modified()) { 
        peRelease300 = refreshPeRelease300();
     }
   		return peRelease300;
   }

  
	/**
	*  set variable peRelease300
	*  Corresponding COBOL Variable is 300-PE-RELEASE
	*  @param value
	**/
   public void setPeRelease300(char[] value) {
      peRelease300 = checkPeRelease300Constraints(value);
      serializePeRelease300(peRelease300);
   } 

     /**
	 * 	Update PeRelease300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPeRelease300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPeRelease300,peRelease300.length);
   	
   }
   
   public void setPeRelease300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPeRelease300,peRelease300.length);
   	
   }
   
     /**
	 * 	Update PeRelease300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPeRelease300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPeRelease300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PeRelease300 with another Field
	 *	@param value
	 */
   public void setPeRelease300(Field source) {
       replace(source,0,source.length(),beginPeRelease300,PE_RELEASE_300_LEN);
   	
   }  
   
     /**
	 * 	Update PeRelease300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPeRelease300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPeRelease300,PE_RELEASE_300_LEN);
   	
   }
   
     /**
	 * 	Update PeRelease300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPeRelease300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPeRelease300+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of peVerSequence300
	 *	@return peVerSequence300
	 */
   public char[] getPeVerSequence300() throws CFException{
     if (isPeVerSequence300Modified()) { 
        peVerSequence300 = refreshPeVerSequence300();
     }
   		return peVerSequence300;
   }

  
	/**
	*  set variable peVerSequence300
	*  Corresponding COBOL Variable is 300-PE-VER-SEQUENCE
	*  @param value
	**/
   public void setPeVerSequence300(char[] value) {
      peVerSequence300 = checkPeVerSequence300Constraints(value);
      serializePeVerSequence300(peVerSequence300);
   } 

     /**
	 * 	Update PeVerSequence300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPeVerSequence300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPeVerSequence300,peVerSequence300.length);
   	
   }
   
   public void setPeVerSequence300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPeVerSequence300,peVerSequence300.length);
   	
   }
   
     /**
	 * 	Update PeVerSequence300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPeVerSequence300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPeVerSequence300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PeVerSequence300 with another Field
	 *	@param value
	 */
   public void setPeVerSequence300(Field source) {
       replace(source,0,source.length(),beginPeVerSequence300,PE_VER_SEQUENCE_300_LEN);
   	
   }  
   
     /**
	 * 	Update PeVerSequence300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPeVerSequence300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPeVerSequence300,PE_VER_SEQUENCE_300_LEN);
   	
   }
   
     /**
	 * 	Update PeVerSequence300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPeVerSequence300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPeVerSequence300+targetIndex,targetLen);
    
   }

	
	
	

		public static int getPreEditVersion300RedefinedFieldLength() {
			return PRE_EDIT_VERSION_300_REDEFINED_LENGTH;
		}

}
  
