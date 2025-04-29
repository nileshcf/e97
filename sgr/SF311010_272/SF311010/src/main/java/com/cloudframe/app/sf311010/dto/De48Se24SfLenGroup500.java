package com.cloudframe.app.sf311010.dto;

/**
*  The class De48Se24SfLenGroup500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class De48Se24SfLenGroup500 extends De48Se24SfLenGroup500Serialized {
   

						private char[] de48Se24SfLen500 = new char[2];

								private int de48Se24SfLen9500;
	
	/**
	* Constructor for De48Se24SfLenGroup500
	**/
    public De48Se24SfLenGroup500() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDe48Se24SfLen500(fillSpace(2));
    }


 

	/**
	 *	Returns the value of de48Se24SfLen500
	 *	@return de48Se24SfLen500
	 */
   public char[] getDe48Se24SfLen500() throws CFException{
     if (isDe48Se24SfLen500Modified()) { 
        de48Se24SfLen500 = refreshDe48Se24SfLen500();
     }
   		return de48Se24SfLen500;
   }

  
	/**
	*  set variable de48Se24SfLen500
	*  Corresponding COBOL Variable is 500-DE48-SE24-SF-LEN
	*  @param value
	**/
   public void setDe48Se24SfLen500(char[] value) {
      de48Se24SfLen500 = checkDe48Se24SfLen500Constraints(value);
      serializeDe48Se24SfLen500(de48Se24SfLen500);
   } 

     /**
	 * 	Update De48Se24SfLen500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDe48Se24SfLen500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDe48Se24SfLen500,de48Se24SfLen500.length);
   	
   }
   
   public void setDe48Se24SfLen500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDe48Se24SfLen500,de48Se24SfLen500.length);
   	
   }
   
     /**
	 * 	Update De48Se24SfLen500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDe48Se24SfLen500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDe48Se24SfLen500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update De48Se24SfLen500 with another Field
	 *	@param value
	 */
   public void setDe48Se24SfLen500(Field source) {
       replace(source,0,source.length(),beginDe48Se24SfLen500,DE_48_SE_24_SF_LEN_500_LEN);
   	
   }  
   
     /**
	 * 	Update De48Se24SfLen500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDe48Se24SfLen500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDe48Se24SfLen500,DE_48_SE_24_SF_LEN_500_LEN);
   	
   }
   
     /**
	 * 	Update De48Se24SfLen500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDe48Se24SfLen500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDe48Se24SfLen500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of de48Se24SfLen9500
	 *	@return de48Se24SfLen9500
	 */
	public int getDe48Se24SfLen9500() throws CFException {
       if (isDe48Se24SfLen9500Modified()) { 
           de48Se24SfLen9500 = refreshDe48Se24SfLen9500();
        }
   		return de48Se24SfLen9500;
	}
	

	
	   
	/**
	 * 	Update De48Se24SfLen9500 with the passed value
	 *  Corresponding COBOL Variable is 500-DE48-SE24-SF-LEN-9
	 *	@param number
	 */
	public void setDe48Se24SfLen9500(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    de48Se24SfLen9500 = checkDe48Se24SfLen9500MaxLimit(number); 
		serializeDe48Se24SfLen9500(de48Se24SfLen9500);
	}
	

	public void setDe48Se24SfLen9500(long number) {
	    number = checkDe48Se24SfLen9500MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDe48Se24SfLen9500((int)number);
	}
	
	/**
	 * 	Update De48Se24SfLen9500 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDe48Se24SfLen9500(char[] value) throws CFException {
		 de48Se24SfLen9500 = serializeDe48Se24SfLen9500(value);
	}
	/**
	 * 	Update De48Se24SfLen9500 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDe48Se24SfLen9500String(char[] value) throws CFException {
		 setDe48Se24SfLen9500(value);
	}

	
	
	

		public static int getDe48Se24SfLenGroup500FieldLength() {
			return DE_48_SE_24_SF_LEN_GROUP_500_LENGTH;
		}

}
  
