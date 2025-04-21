package com.cloudframe.app.sf311010.dto;

/**
*  The class Date800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:07. using version 5.0.0.256
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Date800 extends Date800Serialized {
   

						private char[] dateMonth800 = new char[2];


						private char[] dateDay800 = new char[2];


						private char[] dateYear800 = new char[2];
	
	/**
	* Constructor for Date800
	**/
    public Date800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDateMonth800(fillSpace(2));
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 2
             ,1
             );
								setDateDay800(fillSpace(2));
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 5
             ,1
             );
								setDateYear800(fillSpace(2));
    }


 

	/**
	 *	Returns the value of dateMonth800
	 *	@return dateMonth800
	 */
   public char[] getDateMonth800() throws CFException{
     if (isDateMonth800Modified()) { 
        dateMonth800 = refreshDateMonth800();
     }
   		return dateMonth800;
   }

  
	/**
	*  set variable dateMonth800
	*  Corresponding COBOL Variable is 800-DATE-MONTH
	*  @param value
	**/
   public void setDateMonth800(char[] value) {
      dateMonth800 = checkDateMonth800Constraints(value);
      serializeDateMonth800(dateMonth800);
   } 

     /**
	 * 	Update DateMonth800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDateMonth800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDateMonth800,dateMonth800.length);
   	
   }
   
   public void setDateMonth800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDateMonth800,dateMonth800.length);
   	
   }
   
     /**
	 * 	Update DateMonth800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDateMonth800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDateMonth800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DateMonth800 with another Field
	 *	@param value
	 */
   public void setDateMonth800(Field source) {
       replace(source,0,source.length(),beginDateMonth800,DATE_MONTH_800_LEN);
   	
   }  
   
     /**
	 * 	Update DateMonth800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDateMonth800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDateMonth800,DATE_MONTH_800_LEN);
   	
   }
   
     /**
	 * 	Update DateMonth800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDateMonth800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDateMonth800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dateDay800
	 *	@return dateDay800
	 */
   public char[] getDateDay800() throws CFException{
     if (isDateDay800Modified()) { 
        dateDay800 = refreshDateDay800();
     }
   		return dateDay800;
   }

  
	/**
	*  set variable dateDay800
	*  Corresponding COBOL Variable is 800-DATE-DAY
	*  @param value
	**/
   public void setDateDay800(char[] value) {
      dateDay800 = checkDateDay800Constraints(value);
      serializeDateDay800(dateDay800);
   } 

     /**
	 * 	Update DateDay800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDateDay800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDateDay800,dateDay800.length);
   	
   }
   
   public void setDateDay800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDateDay800,dateDay800.length);
   	
   }
   
     /**
	 * 	Update DateDay800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDateDay800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDateDay800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DateDay800 with another Field
	 *	@param value
	 */
   public void setDateDay800(Field source) {
       replace(source,0,source.length(),beginDateDay800,DATE_DAY_800_LEN);
   	
   }  
   
     /**
	 * 	Update DateDay800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDateDay800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDateDay800,DATE_DAY_800_LEN);
   	
   }
   
     /**
	 * 	Update DateDay800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDateDay800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDateDay800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dateYear800
	 *	@return dateYear800
	 */
   public char[] getDateYear800() throws CFException{
     if (isDateYear800Modified()) { 
        dateYear800 = refreshDateYear800();
     }
   		return dateYear800;
   }

  
	/**
	*  set variable dateYear800
	*  Corresponding COBOL Variable is 800-DATE-YEAR
	*  @param value
	**/
   public void setDateYear800(char[] value) {
      dateYear800 = checkDateYear800Constraints(value);
      serializeDateYear800(dateYear800);
   } 

     /**
	 * 	Update DateYear800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDateYear800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDateYear800,dateYear800.length);
   	
   }
   
   public void setDateYear800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDateYear800,dateYear800.length);
   	
   }
   
     /**
	 * 	Update DateYear800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDateYear800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDateYear800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DateYear800 with another Field
	 *	@param value
	 */
   public void setDateYear800(Field source) {
       replace(source,0,source.length(),beginDateYear800,DATE_YEAR_800_LEN);
   	
   }  
   
     /**
	 * 	Update DateYear800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDateYear800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDateYear800,DATE_YEAR_800_LEN);
   	
   }
   
     /**
	 * 	Update DateYear800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDateYear800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDateYear800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDate800FieldLength() {
			return DATE_800_LENGTH;
		}

}
  
