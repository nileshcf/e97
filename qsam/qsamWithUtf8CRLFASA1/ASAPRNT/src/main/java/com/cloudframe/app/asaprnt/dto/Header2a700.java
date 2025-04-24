package com.cloudframe.app.asaprnt.dto;

/**
*  The class Header2a700 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:50. using version 5.0.0.254
**/


import com.cloudframe.app.asaprnt.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Header2a700 extends Header2a700Serialized { 
   





						private char[] h2aTimeRun700 = new char[8];
	
	/**
	* Constructor for Header2a700
	**/
    public Header2a700() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(51)
             , getStartOffset() + 0
             ,51
             );
       replaceValue( // serialize and save the value
             ("IPM FILE MESSAGE LEVEL DETAIL").toCharArray()
             , getStartOffset() + 51
             ,29
             );
       replaceValue( // serialize and save the value
             fillSpace(29)
             , getStartOffset() + 80
             ,29
             );
       replaceValue( // serialize and save the value
             ("RUN TIME : ").toCharArray()
             , getStartOffset() + 109
             ,11
             );
								setH2aTimeRun700(fillSpace(8));
    }


 

	/**
	 *	Returns the value of h2aTimeRun700
	 *	@return h2aTimeRun700
	 */
   public char[] getH2aTimeRun700() throws CFException{
     if (isH2aTimeRun700Modified()) { 
        h2aTimeRun700 = refreshH2aTimeRun700();
     }
   		return h2aTimeRun700;
   }

  
	/**
	*  set variable h2aTimeRun700
	*  Corresponding COBOL Variable is 700-H2A-TIME-RUN
	*  @param value
	**/
   public void setH2aTimeRun700(char[] value) {
      h2aTimeRun700 = checkH2aTimeRun700Constraints(value);
      serializeH2aTimeRun700(h2aTimeRun700);
   } 

     /**
	 * 	Update H2aTimeRun700 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setH2aTimeRun700(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginH2aTimeRun700,h2aTimeRun700.length);
   	
   }
   
   public void setH2aTimeRun700(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginH2aTimeRun700,h2aTimeRun700.length);
   	
   }
   
     /**
	 * 	Update H2aTimeRun700 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setH2aTimeRun700(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginH2aTimeRun700+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update H2aTimeRun700 with another Field
	 *	@param value
	 */
   public void setH2aTimeRun700(Field source) {
       replace(source,0,source.length(),beginH2aTimeRun700,H_2A_TIME_RUN_700_LEN);
   	
   }  
   
     /**
	 * 	Update H2aTimeRun700 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setH2aTimeRun700(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginH2aTimeRun700,H_2A_TIME_RUN_700_LEN);
   	
   }
   
     /**
	 * 	Update H2aTimeRun700 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setH2aTimeRun700(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginH2aTimeRun700+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHeader2a700FieldLength() {
			return HEADER_2A_700_LENGTH;
		}

}
  
