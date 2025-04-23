package com.cloudframe.app.sf311010.dto;

/**
*  The class TotalMessage650 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TotalMessage650 extends TotalMessage650Serialized {
   


						private char[] totalDescription650 = new char[40];

								private char[] total650 = Field.fillLowValue(14);
	
	/**
	* Constructor for TotalMessage650
	**/
    public TotalMessage650() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("SF311010  ").toCharArray()
             , getStartOffset() + 0
             ,10
             );
								setTotalDescription650(fillSpace(40));
    }


 

	/**
	 *	Returns the value of totalDescription650
	 *	@return totalDescription650
	 */
   public char[] getTotalDescription650() throws CFException{
     if (isTotalDescription650Modified()) { 
        totalDescription650 = refreshTotalDescription650();
     }
   		return totalDescription650;
   }

  
	/**
	*  set variable totalDescription650
	*  Corresponding COBOL Variable is 650-TOTAL-DESCRIPTION
	*  @param value
	**/
   public void setTotalDescription650(char[] value) {
      totalDescription650 = checkTotalDescription650Constraints(value);
      serializeTotalDescription650(totalDescription650);
   } 

     /**
	 * 	Update TotalDescription650 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTotalDescription650(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTotalDescription650,totalDescription650.length);
   	
   }
   
   public void setTotalDescription650(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTotalDescription650,totalDescription650.length);
   	
   }
   
     /**
	 * 	Update TotalDescription650 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTotalDescription650(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTotalDescription650+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TotalDescription650 with another Field
	 *	@param value
	 */
   public void setTotalDescription650(Field source) {
       replace(source,0,source.length(),beginTotalDescription650,TOTAL_DESCRIPTION_650_LEN);
   	
   }  
   
     /**
	 * 	Update TotalDescription650 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTotalDescription650(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTotalDescription650,TOTAL_DESCRIPTION_650_LEN);
   	
   }
   
     /**
	 * 	Update TotalDescription650 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTotalDescription650(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTotalDescription650+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of total650
	 *	@return total650
	 */
   public char[] getTotal650() throws CFException{
     if (isTotal650Modified()) { 
        total650 = refreshTotal650();
     }
   		return total650;
   }

  
	/**
	*  set variable total650
	*  Corresponding COBOL Variable is 650-TOTAL
	*  @param value
	**/
   public void setTotal650(char[] value) {
      total650 = checkTotal650Constraints(value);
      serializeTotal650(total650);
   } 

     /**
	 * 	Update Total650 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTotal650(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTotal650,total650.length);
   	
   }
   
   public void setTotal650(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTotal650,total650.length);
   	
   }
   
     /**
	 * 	Update Total650 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTotal650(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTotal650+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Total650 with another Field
	 *	@param value
	 */
   public void setTotal650(Field source) {
       replace(source,0,source.length(),beginTotal650,TOTAL_650_LEN);
   	
   }  
   
     /**
	 * 	Update Total650 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTotal650(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTotal650,TOTAL_650_LEN);
   	
   }
   
     /**
	 * 	Update Total650 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTotal650(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTotal650+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTotalMessage650FieldLength() {
			return TOTAL_MESSAGE_650_LENGTH;
		}

}
  
