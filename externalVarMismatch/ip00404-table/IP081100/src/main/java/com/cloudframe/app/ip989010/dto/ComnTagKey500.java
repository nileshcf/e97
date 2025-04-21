package com.cloudframe.app.ip989010.dto;

/**
*  The class ComnTagKey500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ComnTagKey500 extends ComnTagKey500Serialized { 
   

						private char[] comnTagType500 = Field.fillLowValue(1);

								private int comnTagNum500;

								private int comnTagSubfldNo500;

								private int comnTagOccur500;
	
	/**
	* Constructor for ComnTagKey500
	**/
    public ComnTagKey500() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ComnTagKey500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ComnTagKey500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of comnTagType500
	 *	@return comnTagType500
	 */
   public char[] getComnTagType500() throws CFException{
     if (isComnTagType500Modified()) { 
        comnTagType500 = refreshComnTagType500();
     }
   		return comnTagType500;
   }

  
	/**
	*  set variable comnTagType500
	*  Corresponding COBOL Variable is 500-COMN-TAG-TYPE
	*  @param value
	**/
   public void setComnTagType500(char[] value) {
      comnTagType500 = checkComnTagType500Constraints(value);
      serializeComnTagType500(comnTagType500);
   } 

     /**
	 * 	Update ComnTagType500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setComnTagType500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginComnTagType500,comnTagType500.length);
   	
   }
   
   public void setComnTagType500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginComnTagType500,comnTagType500.length);
   	
   }
   
     /**
	 * 	Update ComnTagType500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setComnTagType500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginComnTagType500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ComnTagType500 with another Field
	 *	@param value
	 */
   public void setComnTagType500(Field source) {
       replace(source,0,source.length(),beginComnTagType500,COMN_TAG_TYPE_500_LEN);
   	
   }  
   
     /**
	 * 	Update ComnTagType500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setComnTagType500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginComnTagType500,COMN_TAG_TYPE_500_LEN);
   	
   }
   
     /**
	 * 	Update ComnTagType500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setComnTagType500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginComnTagType500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of comnTagNum500
	 *	@return comnTagNum500
	 */
	public int getComnTagNum500() throws CFException {
       if (isComnTagNum500Modified()) { 
           comnTagNum500 = refreshComnTagNum500();
        }
   		return comnTagNum500;
	}
	

	
	   
	/**
	 * 	Update ComnTagNum500 with the passed value
	 *  Corresponding COBOL Variable is 500-COMN-TAG-NUM
	 *	@param number
	 */
	public void setComnTagNum500(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    comnTagNum500 = checkComnTagNum500MaxLimit(number); 
		serializeComnTagNum500(comnTagNum500);
	}
	

	public void setComnTagNum500(long number) {
	    number = checkComnTagNum500MaxLimit(number); // Truncate if value is beyond +/- Max range
		setComnTagNum500((int)number);
	}
	
	/**
	 * 	Update ComnTagNum500 with the passed value
	 *	@param value (String or char[])
	 */
	public void setComnTagNum500(char[] value) throws CFException {
		 comnTagNum500 = serializeComnTagNum500(value);
	}
	/**
	 * 	Update ComnTagNum500 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setComnTagNum500String(char[] value) throws CFException {
		 setComnTagNum500(value);
	}
	/**
	 *	Returns the value of comnTagSubfldNo500
	 *	@return comnTagSubfldNo500
	 */
	public int getComnTagSubfldNo500() throws CFException {
       if (isComnTagSubfldNo500Modified()) { 
           comnTagSubfldNo500 = refreshComnTagSubfldNo500();
        }
   		return comnTagSubfldNo500;
	}
	

	
	   
	/**
	 * 	Update ComnTagSubfldNo500 with the passed value
	 *  Corresponding COBOL Variable is 500-COMN-TAG-SUBFLD-NO
	 *	@param number
	 */
	public void setComnTagSubfldNo500(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    comnTagSubfldNo500 = checkComnTagSubfldNo500MaxLimit(number); 
		serializeComnTagSubfldNo500(comnTagSubfldNo500);
	}
	

	public void setComnTagSubfldNo500(long number) {
	    number = checkComnTagSubfldNo500MaxLimit(number); // Truncate if value is beyond +/- Max range
		setComnTagSubfldNo500((int)number);
	}
	
	/**
	 * 	Update ComnTagSubfldNo500 with the passed value
	 *	@param value (String or char[])
	 */
	public void setComnTagSubfldNo500(char[] value) throws CFException {
		 comnTagSubfldNo500 = serializeComnTagSubfldNo500(value);
	}
	/**
	 * 	Update ComnTagSubfldNo500 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setComnTagSubfldNo500String(char[] value) throws CFException {
		 setComnTagSubfldNo500(value);
	}
	/**
	 *	Returns the value of comnTagOccur500
	 *	@return comnTagOccur500
	 */
	public int getComnTagOccur500() throws CFException {
       if (isComnTagOccur500Modified()) { 
           comnTagOccur500 = refreshComnTagOccur500();
        }
   		return comnTagOccur500;
	}
	

	
	   
	/**
	 * 	Update ComnTagOccur500 with the passed value
	 *  Corresponding COBOL Variable is 500-COMN-TAG-OCCUR
	 *	@param number
	 */
	public void setComnTagOccur500(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    comnTagOccur500 = checkComnTagOccur500MaxLimit(number); 
		serializeComnTagOccur500(comnTagOccur500);
	}
	

	public void setComnTagOccur500(long number) {
	    number = checkComnTagOccur500MaxLimit(number); // Truncate if value is beyond +/- Max range
		setComnTagOccur500((int)number);
	}
	
	/**
	 * 	Update ComnTagOccur500 with the passed value
	 *	@param value (String or char[])
	 */
	public void setComnTagOccur500(char[] value) throws CFException {
		 comnTagOccur500 = serializeComnTagOccur500(value);
	}
	/**
	 * 	Update ComnTagOccur500 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setComnTagOccur500String(char[] value) throws CFException {
		 setComnTagOccur500(value);
	}

	
	
	

		public static int getComnTagKey500FieldLength() {
			return COMN_TAG_KEY_500_LENGTH;
		}

}
  
