package com.cloudframe.app.sf327010.dto;

/**
*  The class TotReadCountMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/


import com.cloudframe.app.sf327010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TotReadCountMsg600 extends TotReadCountMsg600Serialized {
   


								private char[] totReadCount600 = Field.fillLowValue(14);
	
	/**
	* Constructor for TotReadCountMsg600
	**/
    public TotReadCountMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (" SF327010- TOTAL NUMBER OF INPUT RECORDS READ      = ").toCharArray()
             , getStartOffset() + 0
             ,53
             );
    }


 

	/**
	 *	Returns the value of totReadCount600
	 *	@return totReadCount600
	 */
   public char[] getTotReadCount600() throws CFException{
     if (isTotReadCount600Modified()) { 
        totReadCount600 = refreshTotReadCount600();
     }
   		return totReadCount600;
   }

  
	/**
	*  set variable totReadCount600
	*  Corresponding COBOL Variable is 600-TOT-READ-COUNT
	*  @param value
	**/
   public void setTotReadCount600(char[] value) {
      totReadCount600 = checkTotReadCount600Constraints(value);
      serializeTotReadCount600(totReadCount600);
   } 

     /**
	 * 	Update TotReadCount600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTotReadCount600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTotReadCount600,totReadCount600.length);
   	
   }
   
   public void setTotReadCount600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTotReadCount600,totReadCount600.length);
   	
   }
   
     /**
	 * 	Update TotReadCount600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTotReadCount600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTotReadCount600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TotReadCount600 with another Field
	 *	@param value
	 */
   public void setTotReadCount600(Field source) {
       replace(source,0,source.length(),beginTotReadCount600,TOT_READ_COUNT_600_LEN);
   	
   }  
   
     /**
	 * 	Update TotReadCount600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTotReadCount600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTotReadCount600,TOT_READ_COUNT_600_LEN);
   	
   }
   
     /**
	 * 	Update TotReadCount600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTotReadCount600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTotReadCount600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTotReadCountMsg600FieldLength() {
			return TOT_READ_COUNT_MSG_600_LENGTH;
		}

}
  
