package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf31IsoTransDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf31IsoTransDate extends Sf31IsoTransDateSerialized { 
   

						private char[] sf31IsoTransMmdd = new char[4];
	
	/**
	* Constructor for Sf31IsoTransDate
	**/
    public Sf31IsoTransDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf31IsoTransDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf31IsoTransDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSf31IsoTransMmdd(fillSpace(4));
    } 

	/**
	 *	Returns the value of sf31IsoTransMmdd
	 *	@return sf31IsoTransMmdd
	 */
   public char[] getSf31IsoTransMmdd() throws CFException{
     if (isSf31IsoTransMmddModified()) { 
        sf31IsoTransMmdd = refreshSf31IsoTransMmdd();
     }
   		return sf31IsoTransMmdd;
   }

  
	/**
	*  set variable sf31IsoTransMmdd
	*  Corresponding COBOL Variable is SF31-ISO-TRANS-MMDD
	*  @param value
	**/
   public void setSf31IsoTransMmdd(char[] value) {
      sf31IsoTransMmdd = checkSf31IsoTransMmddConstraints(value);
      serializeSf31IsoTransMmdd(sf31IsoTransMmdd);
   } 

     /**
	 * 	Update Sf31IsoTransMmdd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf31IsoTransMmdd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf31IsoTransMmdd,sf31IsoTransMmdd.length);
   	
   }
   
   public void setSf31IsoTransMmdd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoTransMmdd,sf31IsoTransMmdd.length);
   	
   }
   
     /**
	 * 	Update Sf31IsoTransMmdd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoTransMmdd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoTransMmdd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf31IsoTransMmdd with another Field
	 *	@param value
	 */
   public void setSf31IsoTransMmdd(Field source) {
       replace(source,0,source.length(),beginSf31IsoTransMmdd,SF_31_ISO_TRANS_MMDD_LEN);
   	
   }  
   
     /**
	 * 	Update Sf31IsoTransMmdd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf31IsoTransMmdd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf31IsoTransMmdd,SF_31_ISO_TRANS_MMDD_LEN);
   	
   }
   
     /**
	 * 	Update Sf31IsoTransMmdd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf31IsoTransMmdd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf31IsoTransMmdd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf31IsoTransDateFieldLength() {
			return SF_31_ISO_TRANS_DATE_LENGTH;
		}

}
  
