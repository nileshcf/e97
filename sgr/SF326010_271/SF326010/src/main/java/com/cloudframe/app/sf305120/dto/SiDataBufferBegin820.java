package com.cloudframe.app.sf305120.dto;

/**
*  The class SiDataBufferBegin820 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SiDataBufferBegin820 extends SiDataBufferBegin820Serialized { 
   

						private char[] siDataBuffer820 = new char[8157];
	
	/**
	* Constructor for SiDataBufferBegin820
	**/
    public SiDataBufferBegin820() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SiDataBufferBegin820. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SiDataBufferBegin820(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSiDataBuffer820(pad(8157," ".toCharArray(),' ',RIGHT_PAD));
    } 

	/**
	 *	Returns the value of siDataBuffer820
	 *	@return siDataBuffer820
	 */
   public char[] getSiDataBuffer820() throws CFException{
     if (isSiDataBuffer820Modified()) { 
        siDataBuffer820 = refreshSiDataBuffer820();
     }
   		return siDataBuffer820;
   }

  
	/**
	*  set variable siDataBuffer820
	*  Corresponding COBOL Variable is 820-SI-DATA-BUFFER
	*  @param value
	**/
   public void setSiDataBuffer820(char[] value) {
      siDataBuffer820 = checkSiDataBuffer820Constraints(value);
      serializeSiDataBuffer820(siDataBuffer820);
   } 

     /**
	 * 	Update SiDataBuffer820 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSiDataBuffer820(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSiDataBuffer820,siDataBuffer820.length);
   	
   }
   
   public void setSiDataBuffer820(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSiDataBuffer820,siDataBuffer820.length);
   	
   }
   
     /**
	 * 	Update SiDataBuffer820 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSiDataBuffer820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSiDataBuffer820+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SiDataBuffer820 with another Field
	 *	@param value
	 */
   public void setSiDataBuffer820(Field source) {
       replace(source,0,source.length(),beginSiDataBuffer820,SI_DATA_BUFFER_820_LEN);
   	
   }  
   
     /**
	 * 	Update SiDataBuffer820 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSiDataBuffer820(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSiDataBuffer820,SI_DATA_BUFFER_820_LEN);
   	
   }
   
     /**
	 * 	Update SiDataBuffer820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSiDataBuffer820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSiDataBuffer820+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSiDataBufferBegin820FieldLength() {
			return SI_DATA_BUFFER_BEGIN_820_LENGTH;
		}

}
  
