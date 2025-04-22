package com.cloudframe.app.si994010.dto;

/**
*  The class Si520DeAndLengthsGroupArray1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/


import com.cloudframe.app.si994010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Si520DeAndLengthsGroupArray1 extends Si520DeAndLengthsGroupArray1Serialized { 
   

						private char[] si520TblFomat = Field.fillLowValue(1);

								private short si520TblLength;
	
	/**
	* Constructor for Si520DeAndLengthsGroupArray1
	**/
    public Si520DeAndLengthsGroupArray1() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Si520DeAndLengthsGroupArray1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Si520DeAndLengthsGroupArray1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of si520TblFomat
	 *	@return si520TblFomat
	 */
   public char[] getSi520TblFomat() throws CFException{
     if (isSi520TblFomatModified()) { 
        si520TblFomat = refreshSi520TblFomat();
     }
   		return si520TblFomat;
   }

  
	/**
	*  set variable si520TblFomat
	*  Corresponding COBOL Variable is SI520-TBL-FOMAT
	*  @param value
	**/
   public void setSi520TblFomat(char[] value) {
      si520TblFomat = checkSi520TblFomatConstraints(value);
      serializeSi520TblFomat(si520TblFomat);
   } 

     /**
	 * 	Update Si520TblFomat 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSi520TblFomat(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSi520TblFomat,si520TblFomat.length);
   	
   }
   
   public void setSi520TblFomat(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSi520TblFomat,si520TblFomat.length);
   	
   }
   
     /**
	 * 	Update Si520TblFomat 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi520TblFomat(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSi520TblFomat+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Si520TblFomat with another Field
	 *	@param value
	 */
   public void setSi520TblFomat(Field source) {
       replace(source,0,source.length(),beginSi520TblFomat,SI_520_TBL_FOMAT_LEN);
   	
   }  
   
     /**
	 * 	Update Si520TblFomat 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSi520TblFomat(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSi520TblFomat,SI_520_TBL_FOMAT_LEN);
   	
   }
   
     /**
	 * 	Update Si520TblFomat 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi520TblFomat(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSi520TblFomat+targetIndex,targetLen);
    
   }
	char[] si520FixedFormat8888Value = "F".toCharArray();
	/**
	 *	Test condition "F" for isSi520FixedFormat88()
	 *	@return  Returns true if isSi520FixedFormat88() is "F"
	 */
   public boolean isSi520FixedFormat88() throws CFException {
      return (  compareChars( getSi520TblFomat() , si520FixedFormat8888Value)  == 0  );
   }


	/**
	*  set values "F"
	*/
   	public void setSi520FixedFormat88True() {  			
    	setSi520TblFomat( si520FixedFormat8888Value);
   	}
	char[] si520VarFormat8888Value = "V".toCharArray();
	/**
	 *	Test condition "V" for isSi520VarFormat88()
	 *	@return  Returns true if isSi520VarFormat88() is "V"
	 */
   public boolean isSi520VarFormat88() throws CFException {
      return (  compareChars( getSi520TblFomat() , si520VarFormat8888Value)  == 0  );
   }


	/**
	*  set values "V"
	*/
   	public void setSi520VarFormat88True() {  			
    	setSi520TblFomat( si520VarFormat8888Value);
   	}
	char[] si520Unused8888Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isSi520Unused88()
	 *	@return  Returns true if isSi520Unused88() is "U"
	 */
   public boolean isSi520Unused88() throws CFException {
      return (  compareChars( getSi520TblFomat() , si520Unused8888Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setSi520Unused88True() {  			
    	setSi520TblFomat( si520Unused8888Value);
   	}
	/**
	 *	Returns the value of si520TblLength
	 *	@return si520TblLength
	 */
	public short getSi520TblLength() throws CFException {
        if (isSi520TblLengthModified()) { 
           si520TblLength = refreshSi520TblLength();
        }
   		return si520TblLength;
	}
	
	/**
	 * 	Update Si520TblLength with the passed value
	 *  Corresponding COBOL Variable is SI520-TBL-LENGTH
	 *	@param number
	 */
	public void setSi520TblLength(short number) {
	     // Truncate if the number is beyond +/- Max range
	    si520TblLength = checkSi520TblLengthMaxLimit(number); 
		serializeSi520TblLength(si520TblLength);
	}

	public void setSi520TblLength(int number) {
	    number = checkSi520TblLengthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSi520TblLength((short)number);
	}
	public void setSi520TblLength(long number) {
	    number = checkSi520TblLengthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSi520TblLength((short)number);
	}
	


	
	
	

		public static int getSi520DeAndLengthsGroupArray1FieldLength() {
			return SI_520_DE_AND_LENGTHS_GROUP_ARRAY_1_LENGTH;
		}

}
  
