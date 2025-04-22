package com.cloudframe.app.ar640010.dto;

/**
*  The class StsInputParm250 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class StsInputParm250 extends StsInputParm250Serialized { 
   

						private char[] stsRefId250 = new char[4];
	
	/**
	* Constructor for StsInputParm250
	**/
    public StsInputParm250() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for StsInputParm250. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StsInputParm250(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setStsRefId250(fillSpace(4));
    } 

	/**
	 *	Returns the value of stsRefId250
	 *	@return stsRefId250
	 */
   public char[] getStsRefId250() throws CFException{
     if (isStsRefId250Modified()) { 
        stsRefId250 = refreshStsRefId250();
     }
   		return stsRefId250;
   }

  
	/**
	*  set variable stsRefId250
	*  Corresponding COBOL Variable is 250-STS-REF-ID
	*  @param value
	**/
   public void setStsRefId250(char[] value) {
      stsRefId250 = checkStsRefId250Constraints(value);
      serializeStsRefId250(stsRefId250);
   } 

     /**
	 * 	Update StsRefId250 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setStsRefId250(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginStsRefId250,stsRefId250.length);
   	
   }
   
   public void setStsRefId250(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginStsRefId250,stsRefId250.length);
   	
   }
   
     /**
	 * 	Update StsRefId250 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setStsRefId250(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsRefId250+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update StsRefId250 with another Field
	 *	@param value
	 */
   public void setStsRefId250(Field source) {
       replace(source,0,source.length(),beginStsRefId250,STS_REF_ID_250_LEN);
   	
   }  
   
     /**
	 * 	Update StsRefId250 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setStsRefId250(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginStsRefId250,STS_REF_ID_250_LEN);
   	
   }
   
     /**
	 * 	Update StsRefId250 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setStsRefId250(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginStsRefId250+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes StsInputParm250
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setStsRefId250(CONSTANTS.SPACE_4);
   }

		public static int getStsInputParm250FieldLength() {
			return STS_INPUT_PARM_250_LENGTH;
		}

}
  
