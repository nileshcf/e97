package com.cloudframe.app.sf311010.dto;

/**
*  The class BiaDataConv800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:07. using version 5.0.0.256
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BiaDataConv800 extends BiaDataConv800Serialized { 
   


						private char[] biaByte800 = new char[1];
	
	/**
	* Constructor for BiaDataConv800
	**/
    public BiaDataConv800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BiaDataConv800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BiaDataConv800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             fillLowValue(1)
             , getStartOffset() + 0
             ,1
             );
								setBiaByte800(fillSpace(1));
    } 

	/**
	 *	Returns the value of biaByte800
	 *	@return biaByte800
	 */
   public char[] getBiaByte800() throws CFException{
     if (isBiaByte800Modified()) { 
        biaByte800 = refreshBiaByte800();
     }
   		return biaByte800;
   }

  
	/**
	*  set variable biaByte800
	*  Corresponding COBOL Variable is 800-BIA-BYTE
	*  @param value
	**/
   public void setBiaByte800(char[] value) {
      biaByte800 = checkBiaByte800Constraints(value);
      serializeBiaByte800(biaByte800);
   } 

     /**
	 * 	Update BiaByte800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBiaByte800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBiaByte800,biaByte800.length);
   	
   }
   
   public void setBiaByte800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBiaByte800,biaByte800.length);
   	
   }
   
     /**
	 * 	Update BiaByte800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBiaByte800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBiaByte800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BiaByte800 with another Field
	 *	@param value
	 */
   public void setBiaByte800(Field source) {
       replace(source,0,source.length(),beginBiaByte800,BIA_BYTE_800_LEN);
   	
   }  
   
     /**
	 * 	Update BiaByte800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBiaByte800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBiaByte800,BIA_BYTE_800_LEN);
   	
   }
   
     /**
	 * 	Update BiaByte800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBiaByte800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBiaByte800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBiaDataConv800FieldLength() {
			return BIA_DATA_CONV_800_LENGTH;
		}

}
  
