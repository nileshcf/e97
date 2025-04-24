package com.cloudframe.app.ip662010.dto;

/**
*  The class IpmErrorElementId600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/


import com.cloudframe.app.ip662010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IpmErrorElementId600 extends IpmErrorElementId600Serialized { 
   

						private char[] ipmErrorElementType600 = Field.fillLowValue(1);

								private int ipmErrorElementNo600;
	
	/**
	* Constructor for IpmErrorElementId600
	**/
    public IpmErrorElementId600() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for IpmErrorElementId600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IpmErrorElementId600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ipmErrorElementType600
	 *	@return ipmErrorElementType600
	 */
   public char[] getIpmErrorElementType600() throws CFException{
     if (isIpmErrorElementType600Modified()) { 
        ipmErrorElementType600 = refreshIpmErrorElementType600();
     }
   		return ipmErrorElementType600;
   }

  
	/**
	*  set variable ipmErrorElementType600
	*  Corresponding COBOL Variable is 600-IPM-ERROR-ELEMENT-TYPE
	*  @param value
	**/
   public void setIpmErrorElementType600(char[] value) {
      ipmErrorElementType600 = checkIpmErrorElementType600Constraints(value);
      serializeIpmErrorElementType600(ipmErrorElementType600);
   } 

     /**
	 * 	Update IpmErrorElementType600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorElementType600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIpmErrorElementType600,ipmErrorElementType600.length);
   	
   }
   
   public void setIpmErrorElementType600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIpmErrorElementType600,ipmErrorElementType600.length);
   	
   }
   
     /**
	 * 	Update IpmErrorElementType600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorElementType600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIpmErrorElementType600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IpmErrorElementType600 with another Field
	 *	@param value
	 */
   public void setIpmErrorElementType600(Field source) {
       replace(source,0,source.length(),beginIpmErrorElementType600,IPM_ERROR_ELEMENT_TYPE_600_LEN);
   	
   }  
   
     /**
	 * 	Update IpmErrorElementType600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIpmErrorElementType600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIpmErrorElementType600,IPM_ERROR_ELEMENT_TYPE_600_LEN);
   	
   }
   
     /**
	 * 	Update IpmErrorElementType600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorElementType600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIpmErrorElementType600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ipmErrorElementNo600
	 *	@return ipmErrorElementNo600
	 */
	public int getIpmErrorElementNo600() throws CFException {
       if (isIpmErrorElementNo600Modified()) { 
           ipmErrorElementNo600 = refreshIpmErrorElementNo600();
        }
   		return ipmErrorElementNo600;
	}
	

	
	   
	/**
	 * 	Update IpmErrorElementNo600 with the passed value
	 *  Corresponding COBOL Variable is 600-IPM-ERROR-ELEMENT-NO
	 *	@param number
	 */
	public void setIpmErrorElementNo600(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ipmErrorElementNo600 = checkIpmErrorElementNo600MaxLimit(number); 
		serializeIpmErrorElementNo600(ipmErrorElementNo600);
	}
	

	public void setIpmErrorElementNo600(long number) {
	    number = checkIpmErrorElementNo600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setIpmErrorElementNo600((int)number);
	}
	
	/**
	 * 	Update IpmErrorElementNo600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIpmErrorElementNo600(char[] value) throws CFException {
		 ipmErrorElementNo600 = serializeIpmErrorElementNo600(value);
	}
	/**
	 * 	Update IpmErrorElementNo600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIpmErrorElementNo600String(char[] value) throws CFException {
		 setIpmErrorElementNo600(value);
	}

	
	
	

		public static int getIpmErrorElementId600FieldLength() {
			return IPM_ERROR_ELEMENT_ID_600_LENGTH;
		}

}
  
