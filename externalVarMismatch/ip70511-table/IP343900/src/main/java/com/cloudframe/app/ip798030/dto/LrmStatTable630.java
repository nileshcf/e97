package com.cloudframe.app.ip798030.dto;

/**
*  The class LrmStatTable630 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/


import com.cloudframe.app.ip798030.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LrmStatTable630 extends LrmStatTable630Serialized { 
   

						private char[] lrmStatError630 = Field.fillLowValue(66);
	
	/**
	* Constructor for LrmStatTable630
	**/
    public LrmStatTable630() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for LrmStatTable630. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LrmStatTable630(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of lrmStatError630
	 *	@return lrmStatError630
	 */
   public char[] getLrmStatError630() throws CFException{
     if (isLrmStatError630Modified()) { 
        lrmStatError630 = refreshLrmStatError630();
     }
   		return lrmStatError630;
   }

  
	/**
	*  set variable lrmStatError630
	*  Corresponding COBOL Variable is 630-LRM-STAT-ERROR
	*  @param value
	**/
   public void setLrmStatError630(char[] value) {
      lrmStatError630 = checkLrmStatError630Constraints(value);
      serializeLrmStatError630(lrmStatError630);
   } 

     /**
	 * 	Update LrmStatError630 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLrmStatError630(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLrmStatError630,lrmStatError630.length);
   	
   }
   
   public void setLrmStatError630(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLrmStatError630,lrmStatError630.length);
   	
   }
   
     /**
	 * 	Update LrmStatError630 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLrmStatError630(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLrmStatError630+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LrmStatError630 with another Field
	 *	@param value
	 */
   public void setLrmStatError630(Field source) {
       replace(source,0,source.length(),beginLrmStatError630,LRM_STAT_ERROR_630_LEN);
   	
   }  
   
     /**
	 * 	Update LrmStatError630 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLrmStatError630(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLrmStatError630,LRM_STAT_ERROR_630_LEN);
   	
   }
   
     /**
	 * 	Update LrmStatError630 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLrmStatError630(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLrmStatError630+targetIndex,targetLen);
    
   }

	
	
	

		public static int getLrmStatTable630FieldLength() {
			return LRM_STAT_TABLE_630_LENGTH;
		}

}
  
