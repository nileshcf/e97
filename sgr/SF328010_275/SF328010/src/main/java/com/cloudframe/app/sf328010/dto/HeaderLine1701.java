package com.cloudframe.app.sf328010.dto;

/**
*  The class HeaderLine1701 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:35. using version 5.0.0.254
**/


import com.cloudframe.app.sf328010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HeaderLine1701 extends HeaderLine1701Serialized { 
   





						private char[] runDate701 = new char[2];


						private char[] runMonth701 = new char[3];


						private char[] runYear701 = new char[4];

	
	/**
	* Constructor for HeaderLine1701
	**/
    public HeaderLine1701() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("SF328010-AA                           ").toCharArray()
             , getStartOffset() + 0
             ,38
             );
       replaceValue( // serialize and save the value
             ("      MASTERCARD WORLDWIDE        ").toCharArray()
             , getStartOffset() + 38
             ,34
             );
       replaceValue( // serialize and save the value
             fillSpace(35)
             , getStartOffset() + 72
             ,35
             );
       replaceValue( // serialize and save the value
             ("RUN DATE :").toCharArray()
             , getStartOffset() + 107
             ,10
             );
								setRunDate701(fillSpace(2));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 119
             ,1
             );
								setRunMonth701(fillSpace(3));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 123
             ,1
             );
								setRunYear701(fillSpace(4));
       replaceValue( // serialize and save the value
             fillSpace(14)
             , getStartOffset() + 128
             ,14
             );
    }


 

	/**
	 *	Returns the value of runDate701
	 *	@return runDate701
	 */
   public char[] getRunDate701() throws CFException{
     if (isRunDate701Modified()) { 
        runDate701 = refreshRunDate701();
     }
   		return runDate701;
   }

  
	/**
	*  set variable runDate701
	*  Corresponding COBOL Variable is 701-RUN-DATE
	*  @param value
	**/
   public void setRunDate701(char[] value) {
      runDate701 = checkRunDate701Constraints(value);
      serializeRunDate701(runDate701);
   } 

     /**
	 * 	Update RunDate701 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRunDate701(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRunDate701,runDate701.length);
   	
   }
   
   public void setRunDate701(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRunDate701,runDate701.length);
   	
   }
   
     /**
	 * 	Update RunDate701 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRunDate701(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRunDate701+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RunDate701 with another Field
	 *	@param value
	 */
   public void setRunDate701(Field source) {
       replace(source,0,source.length(),beginRunDate701,RUN_DATE_701_LEN);
   	
   }  
   
     /**
	 * 	Update RunDate701 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRunDate701(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRunDate701,RUN_DATE_701_LEN);
   	
   }
   
     /**
	 * 	Update RunDate701 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRunDate701(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRunDate701+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of runMonth701
	 *	@return runMonth701
	 */
   public char[] getRunMonth701() throws CFException{
     if (isRunMonth701Modified()) { 
        runMonth701 = refreshRunMonth701();
     }
   		return runMonth701;
   }

  
	/**
	*  set variable runMonth701
	*  Corresponding COBOL Variable is 701-RUN-MONTH
	*  @param value
	**/
   public void setRunMonth701(char[] value) {
      runMonth701 = checkRunMonth701Constraints(value);
      serializeRunMonth701(runMonth701);
   } 

     /**
	 * 	Update RunMonth701 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRunMonth701(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRunMonth701,runMonth701.length);
   	
   }
   
   public void setRunMonth701(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRunMonth701,runMonth701.length);
   	
   }
   
     /**
	 * 	Update RunMonth701 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRunMonth701(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRunMonth701+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RunMonth701 with another Field
	 *	@param value
	 */
   public void setRunMonth701(Field source) {
       replace(source,0,source.length(),beginRunMonth701,RUN_MONTH_701_LEN);
   	
   }  
   
     /**
	 * 	Update RunMonth701 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRunMonth701(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRunMonth701,RUN_MONTH_701_LEN);
   	
   }
   
     /**
	 * 	Update RunMonth701 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRunMonth701(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRunMonth701+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of runYear701
	 *	@return runYear701
	 */
   public char[] getRunYear701() throws CFException{
     if (isRunYear701Modified()) { 
        runYear701 = refreshRunYear701();
     }
   		return runYear701;
   }

  
	/**
	*  set variable runYear701
	*  Corresponding COBOL Variable is 701-RUN-YEAR
	*  @param value
	**/
   public void setRunYear701(char[] value) {
      runYear701 = checkRunYear701Constraints(value);
      serializeRunYear701(runYear701);
   } 

     /**
	 * 	Update RunYear701 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRunYear701(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRunYear701,runYear701.length);
   	
   }
   
   public void setRunYear701(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRunYear701,runYear701.length);
   	
   }
   
     /**
	 * 	Update RunYear701 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRunYear701(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRunYear701+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RunYear701 with another Field
	 *	@param value
	 */
   public void setRunYear701(Field source) {
       replace(source,0,source.length(),beginRunYear701,RUN_YEAR_701_LEN);
   	
   }  
   
     /**
	 * 	Update RunYear701 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRunYear701(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRunYear701,RUN_YEAR_701_LEN);
   	
   }
   
     /**
	 * 	Update RunYear701 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRunYear701(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRunYear701+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHeaderLine1701FieldLength() {
			return HEADER_LINE_1701_LENGTH;
		}

}
  
