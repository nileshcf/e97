package com.cloudframe.app.sf305120.dto;

/**
*  The class RhSource810 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RhSource810 extends RhSource810Serialized {
   

						private char[] rhSourceLnth810 = new char[1];

						private char[] rhSourceData810 = new char[255];
	
	/**
	* Constructor for RhSource810
	**/
    public RhSource810() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setRhSourceLnth810(getString(new byte[] {(byte)0x0F}).toCharArray());
								setRhSourceData810(pad(255," ".toCharArray(),' ',RIGHT_PAD));
    }


 

	/**
	 *	Returns the value of rhSourceLnth810
	 *	@return rhSourceLnth810
	 */
   public char[] getRhSourceLnth810() throws CFException{
     if (isRhSourceLnth810Modified()) { 
        rhSourceLnth810 = refreshRhSourceLnth810();
     }
   		return rhSourceLnth810;
   }

  
	/**
	*  set variable rhSourceLnth810
	*  Corresponding COBOL Variable is 810-RH-SOURCE-LNTH
	*  @param value
	**/
   public void setRhSourceLnth810(char[] value) {
      rhSourceLnth810 = checkRhSourceLnth810Constraints(value);
      serializeRhSourceLnth810(rhSourceLnth810);
   } 

     /**
	 * 	Update RhSourceLnth810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRhSourceLnth810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRhSourceLnth810,rhSourceLnth810.length);
   	
   }
   
   public void setRhSourceLnth810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRhSourceLnth810,rhSourceLnth810.length);
   	
   }
   
     /**
	 * 	Update RhSourceLnth810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRhSourceLnth810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRhSourceLnth810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RhSourceLnth810 with another Field
	 *	@param value
	 */
   public void setRhSourceLnth810(Field source) {
       replace(source,0,source.length(),beginRhSourceLnth810,RH_SOURCE_LNTH_810_LEN);
   	
   }  
   
     /**
	 * 	Update RhSourceLnth810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRhSourceLnth810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRhSourceLnth810,RH_SOURCE_LNTH_810_LEN);
   	
   }
   
     /**
	 * 	Update RhSourceLnth810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRhSourceLnth810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRhSourceLnth810+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rhSourceData810
	 *	@return rhSourceData810
	 */
   public char[] getRhSourceData810() throws CFException{
     if (isRhSourceData810Modified()) { 
        rhSourceData810 = refreshRhSourceData810();
     }
   		return rhSourceData810;
   }

  
	/**
	*  set variable rhSourceData810
	*  Corresponding COBOL Variable is 810-RH-SOURCE-DATA
	*  @param value
	**/
   public void setRhSourceData810(char[] value) {
      rhSourceData810 = checkRhSourceData810Constraints(value);
      serializeRhSourceData810(rhSourceData810);
   } 

     /**
	 * 	Update RhSourceData810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRhSourceData810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRhSourceData810,rhSourceData810.length);
   	
   }
   
   public void setRhSourceData810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRhSourceData810,rhSourceData810.length);
   	
   }
   
     /**
	 * 	Update RhSourceData810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRhSourceData810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRhSourceData810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RhSourceData810 with another Field
	 *	@param value
	 */
   public void setRhSourceData810(Field source) {
       replace(source,0,source.length(),beginRhSourceData810,RH_SOURCE_DATA_810_LEN);
   	
   }  
   
     /**
	 * 	Update RhSourceData810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRhSourceData810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRhSourceData810,RH_SOURCE_DATA_810_LEN);
   	
   }
   
     /**
	 * 	Update RhSourceData810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRhSourceData810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRhSourceData810+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRhSource810FieldLength() {
			return RH_SOURCE_810_LENGTH;
		}

}
  
