package com.cloudframe.app.ip989010.dto;

/**
*  The class ComnTagData500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ComnTagData500 extends ComnTagData500Serialized { 
   

								private int comnTagLen500;

						private char[] comnTagValue500 = Field.fillLowValue(999);
	
	/**
	* Constructor for ComnTagData500
	**/
    public ComnTagData500() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ComnTagData500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ComnTagData500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of comnTagLen500
	 *	@return comnTagLen500
	 */
	public int getComnTagLen500() throws CFException {
       if (isComnTagLen500Modified()) { 
           comnTagLen500 = refreshComnTagLen500();
        }
   		return comnTagLen500;
	}
	

	
	   
	/**
	 * 	Update ComnTagLen500 with the passed value
	 *  Corresponding COBOL Variable is 500-COMN-TAG-LEN
	 *	@param number
	 */
	public void setComnTagLen500(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    comnTagLen500 = checkComnTagLen500MaxLimit(number); 
		serializeComnTagLen500(comnTagLen500);
	}
	

	public void setComnTagLen500(long number) {
	    number = checkComnTagLen500MaxLimit(number); // Truncate if value is beyond +/- Max range
		setComnTagLen500((int)number);
	}
	
	/**
	 * 	Update ComnTagLen500 with the passed value
	 *	@param value (String or char[])
	 */
	public void setComnTagLen500(char[] value) throws CFException {
		 comnTagLen500 = serializeComnTagLen500(value);
	}
	/**
	 * 	Update ComnTagLen500 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setComnTagLen500String(char[] value) throws CFException {
		 setComnTagLen500(value);
	}
	/**
	 *	Returns the value of comnTagValue500
	 *	@return comnTagValue500
	 */
   public char[] getComnTagValue500() throws CFException{
     if (isComnTagValue500Modified()) { 
        comnTagValue500 = refreshComnTagValue500();
     }
   		return comnTagValue500;
   }

  
	/**
	*  set variable comnTagValue500
	*  Corresponding COBOL Variable is 500-COMN-TAG-VALUE
	*  @param value
	**/
   public void setComnTagValue500(char[] value) {
      comnTagValue500 = checkComnTagValue500Constraints(value);
      serializeComnTagValue500(comnTagValue500);
   } 

     /**
	 * 	Update ComnTagValue500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setComnTagValue500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginComnTagValue500,comnTagValue500.length);
   	
   }
   
   public void setComnTagValue500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginComnTagValue500,comnTagValue500.length);
   	
   }
   
     /**
	 * 	Update ComnTagValue500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setComnTagValue500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginComnTagValue500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ComnTagValue500 with another Field
	 *	@param value
	 */
   public void setComnTagValue500(Field source) {
       replace(source,0,source.length(),beginComnTagValue500,COMN_TAG_VALUE_500_LEN);
   	
   }  
   
     /**
	 * 	Update ComnTagValue500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setComnTagValue500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginComnTagValue500,COMN_TAG_VALUE_500_LEN);
   	
   }
   
     /**
	 * 	Update ComnTagValue500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setComnTagValue500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginComnTagValue500+targetIndex,targetLen);
    
   }

	
	
	

		public static int getComnTagData500FieldLength() {
			return COMN_TAG_DATA_500_LENGTH;
		}

}
  
