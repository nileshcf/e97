package com.cloudframe.app.sf327010.dto;

/**
*  The class HdrLine1201 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:20. using version 5.0.0.257
**/


import com.cloudframe.app.sf327010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HdrLine1201 extends HdrLine1201Serialized {
   







						private char[] runDate201 = new char[2];


						private char[] runMonth201 = new char[3];


						private char[] runYear201 = new char[4];

	
	/**
	* Constructor for HdrLine1201
	**/
    public HdrLine1201() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("SF327010-AA ").toCharArray()
             , getStartOffset() + 0
             ,12
             );
       replaceValue( // serialize and save the value
             fillSpace(35)
             , getStartOffset() + 12
             ,35
             );
       replaceValue( // serialize and save the value
             ("  MASTERCARD WORLDWIDE  ").toCharArray()
             , getStartOffset() + 47
             ,24
             );
       replaceValue( // serialize and save the value
             fillSpace(32)
             , getStartOffset() + 71
             ,32
             );
       replaceValue( // serialize and save the value
             ("RUN DATE:").toCharArray()
             , getStartOffset() + 103
             ,9
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 112
             ,1
             );
								setRunDate201(fillSpace(2));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 115
             ,1
             );
								setRunMonth201(fillSpace(3));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 119
             ,1
             );
								setRunYear201(fillSpace(4));
       replaceValue( // serialize and save the value
             fillSpace(10)
             , getStartOffset() + 124
             ,10
             );
    }


 

	/**
	 *	Returns the value of runDate201
	 *	@return runDate201
	 */
   public char[] getRunDate201() throws CFException{
     if (isRunDate201Modified()) { 
        runDate201 = refreshRunDate201();
     }
   		return runDate201;
   }

  
	/**
	*  set variable runDate201
	*  Corresponding COBOL Variable is 201-RUN-DATE
	*  @param value
	**/
   public void setRunDate201(char[] value) {
      runDate201 = checkRunDate201Constraints(value);
      serializeRunDate201(runDate201);
   } 

     /**
	 * 	Update RunDate201 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRunDate201(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRunDate201,runDate201.length);
   	
   }
   
   public void setRunDate201(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRunDate201,runDate201.length);
   	
   }
   
     /**
	 * 	Update RunDate201 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRunDate201(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRunDate201+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RunDate201 with another Field
	 *	@param value
	 */
   public void setRunDate201(Field source) {
       replace(source,0,source.length(),beginRunDate201,RUN_DATE_201_LEN);
   	
   }  
   
     /**
	 * 	Update RunDate201 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRunDate201(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRunDate201,RUN_DATE_201_LEN);
   	
   }
   
     /**
	 * 	Update RunDate201 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRunDate201(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRunDate201+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of runMonth201
	 *	@return runMonth201
	 */
   public char[] getRunMonth201() throws CFException{
     if (isRunMonth201Modified()) { 
        runMonth201 = refreshRunMonth201();
     }
   		return runMonth201;
   }

  
	/**
	*  set variable runMonth201
	*  Corresponding COBOL Variable is 201-RUN-MONTH
	*  @param value
	**/
   public void setRunMonth201(char[] value) {
      runMonth201 = checkRunMonth201Constraints(value);
      serializeRunMonth201(runMonth201);
   } 

     /**
	 * 	Update RunMonth201 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRunMonth201(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRunMonth201,runMonth201.length);
   	
   }
   
   public void setRunMonth201(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRunMonth201,runMonth201.length);
   	
   }
   
     /**
	 * 	Update RunMonth201 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRunMonth201(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRunMonth201+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RunMonth201 with another Field
	 *	@param value
	 */
   public void setRunMonth201(Field source) {
       replace(source,0,source.length(),beginRunMonth201,RUN_MONTH_201_LEN);
   	
   }  
   
     /**
	 * 	Update RunMonth201 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRunMonth201(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRunMonth201,RUN_MONTH_201_LEN);
   	
   }
   
     /**
	 * 	Update RunMonth201 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRunMonth201(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRunMonth201+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of runYear201
	 *	@return runYear201
	 */
   public char[] getRunYear201() throws CFException{
     if (isRunYear201Modified()) { 
        runYear201 = refreshRunYear201();
     }
   		return runYear201;
   }

  
	/**
	*  set variable runYear201
	*  Corresponding COBOL Variable is 201-RUN-YEAR
	*  @param value
	**/
   public void setRunYear201(char[] value) {
      runYear201 = checkRunYear201Constraints(value);
      serializeRunYear201(runYear201);
   } 

     /**
	 * 	Update RunYear201 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRunYear201(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRunYear201,runYear201.length);
   	
   }
   
   public void setRunYear201(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRunYear201,runYear201.length);
   	
   }
   
     /**
	 * 	Update RunYear201 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRunYear201(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRunYear201+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RunYear201 with another Field
	 *	@param value
	 */
   public void setRunYear201(Field source) {
       replace(source,0,source.length(),beginRunYear201,RUN_YEAR_201_LEN);
   	
   }  
   
     /**
	 * 	Update RunYear201 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRunYear201(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRunYear201,RUN_YEAR_201_LEN);
   	
   }
   
     /**
	 * 	Update RunYear201 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRunYear201(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRunYear201+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHdrLine1201FieldLength() {
			return HDR_LINE_1201_LENGTH;
		}

}
  
