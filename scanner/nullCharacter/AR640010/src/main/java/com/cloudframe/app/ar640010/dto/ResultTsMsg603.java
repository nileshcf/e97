package com.cloudframe.app.ar640010.dto;

/**
*  The class ResultTsMsg603 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ResultTsMsg603 extends ResultTsMsg603Serialized {
   


						private char[] resultTs603 = new char[26];
	
	/**
	* Constructor for ResultTsMsg603
	**/
    public ResultTsMsg603() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 0
             ,1
             );
								setResultTs603(fillSpace(26));
    }


 

	/**
	 *	Returns the value of resultTs603
	 *	@return resultTs603
	 */
   public char[] getResultTs603() throws CFException{
     if (isResultTs603Modified()) { 
        resultTs603 = refreshResultTs603();
     }
   		return resultTs603;
   }

  
	/**
	*  set variable resultTs603
	*  Corresponding COBOL Variable is 603-RESULT-TS
	*  @param value
	**/
   public void setResultTs603(char[] value) {
      resultTs603 = checkResultTs603Constraints(value);
      serializeResultTs603(resultTs603);
   } 

     /**
	 * 	Update ResultTs603 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setResultTs603(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginResultTs603,resultTs603.length);
   	
   }
   
   public void setResultTs603(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginResultTs603,resultTs603.length);
   	
   }
   
     /**
	 * 	Update ResultTs603 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setResultTs603(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultTs603+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ResultTs603 with another Field
	 *	@param value
	 */
   public void setResultTs603(Field source) {
       replace(source,0,source.length(),beginResultTs603,RESULT_TS_603_LEN);
   	
   }  
   
     /**
	 * 	Update ResultTs603 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setResultTs603(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginResultTs603,RESULT_TS_603_LEN);
   	
   }
   
     /**
	 * 	Update ResultTs603 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setResultTs603(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginResultTs603+targetIndex,targetLen);
    
   }

	
	
	

		public static int getResultTsMsg603FieldLength() {
			return RESULT_TS_MSG_603_LENGTH;
		}

}
  
