package com.cloudframe.app.move0.dto;

/**
*  The class CurrentDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:07. using version 5.0.0.256
**/


import com.cloudframe.app.move0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CurrentDate extends CurrentDateSerialized { 
   

						private char[] mm = Field.fillLowValue(2);


						private char[] dd = Field.fillLowValue(2);


						private char[] yyyy = Field.fillLowValue(4);
	
	/**
	* Constructor for CurrentDate
	**/
    public CurrentDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CurrentDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurrentDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 2
             ,1
             );
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 5
             ,1
             );
    } 

	/**
	 *	Returns the value of mm
	 *	@return mm
	 */
   public char[] getMm() throws CFException{
     if (isMmModified()) { 
        mm = refreshMm();
     }
   		return mm;
   }

  
	/**
	*  set variable mm
	*  Corresponding COBOL Variable is WS-MM
	*  @param value
	**/
   public void setMm(char[] value) {
      mm = checkMmConstraints(value);
      serializeMm(mm);
   } 

     /**
	 * 	Update Mm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMm,mm.length);
   	
   }
   
   public void setMm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMm,mm.length);
   	
   }
   
     /**
	 * 	Update Mm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Mm with another Field
	 *	@param value
	 */
   public void setMm(Field source) {
       replace(source,0,source.length(),beginMm,MM_LEN);
   	
   }  
   
     /**
	 * 	Update Mm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMm,MM_LEN);
   	
   }
   
     /**
	 * 	Update Mm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dd
	 *	@return dd
	 */
   public char[] getDd() throws CFException{
     if (isDdModified()) { 
        dd = refreshDd();
     }
   		return dd;
   }

  
	/**
	*  set variable dd
	*  Corresponding COBOL Variable is WS-DD
	*  @param value
	**/
   public void setDd(char[] value) {
      dd = checkDdConstraints(value);
      serializeDd(dd);
   } 

     /**
	 * 	Update Dd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDd,dd.length);
   	
   }
   
   public void setDd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDd,dd.length);
   	
   }
   
     /**
	 * 	Update Dd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dd with another Field
	 *	@param value
	 */
   public void setDd(Field source) {
       replace(source,0,source.length(),beginDd,DD_LEN);
   	
   }  
   
     /**
	 * 	Update Dd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDd,DD_LEN);
   	
   }
   
     /**
	 * 	Update Dd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of yyyy
	 *	@return yyyy
	 */
   public char[] getYyyy() throws CFException{
     if (isYyyyModified()) { 
        yyyy = refreshYyyy();
     }
   		return yyyy;
   }

  
	/**
	*  set variable yyyy
	*  Corresponding COBOL Variable is WS-YYYY
	*  @param value
	**/
   public void setYyyy(char[] value) {
      yyyy = checkYyyyConstraints(value);
      serializeYyyy(yyyy);
   } 

     /**
	 * 	Update Yyyy 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setYyyy(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginYyyy,yyyy.length);
   	
   }
   
   public void setYyyy(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginYyyy,yyyy.length);
   	
   }
   
     /**
	 * 	Update Yyyy 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setYyyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginYyyy+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Yyyy with another Field
	 *	@param value
	 */
   public void setYyyy(Field source) {
       replace(source,0,source.length(),beginYyyy,YYYY_LEN);
   	
   }  
   
     /**
	 * 	Update Yyyy 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setYyyy(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginYyyy,YYYY_LEN);
   	
   }
   
     /**
	 * 	Update Yyyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setYyyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginYyyy+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCurrentDateFieldLength() {
			return CURRENT_DATE_LENGTH;
		}

}
  
