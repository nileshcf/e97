package com.cloudframe.app.sf305120.dto;

/**
*  The class RhDestination810 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RhDestination810 extends RhDestination810Serialized { 
   

						private char[] rhDestLnth810 = new char[1];

						private char[] rhDestData810 = new char[255];
	
	/**
	* Constructor for RhDestination810
	**/
    public RhDestination810() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setRhDestLnth810(getString(new byte[] {(byte)0x0F}).toCharArray());
								setRhDestData810(pad(255," ".toCharArray(),' ',RIGHT_PAD));
    }


 

	/**
	 *	Returns the value of rhDestLnth810
	 *	@return rhDestLnth810
	 */
   public char[] getRhDestLnth810() throws CFException{
     if (isRhDestLnth810Modified()) { 
        rhDestLnth810 = refreshRhDestLnth810();
     }
   		return rhDestLnth810;
   }

  
	/**
	*  set variable rhDestLnth810
	*  Corresponding COBOL Variable is 810-RH-DEST-LNTH
	*  @param value
	**/
   public void setRhDestLnth810(char[] value) {
      rhDestLnth810 = checkRhDestLnth810Constraints(value);
      serializeRhDestLnth810(rhDestLnth810);
   } 

     /**
	 * 	Update RhDestLnth810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRhDestLnth810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRhDestLnth810,rhDestLnth810.length);
   	
   }
   
   public void setRhDestLnth810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRhDestLnth810,rhDestLnth810.length);
   	
   }
   
     /**
	 * 	Update RhDestLnth810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRhDestLnth810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRhDestLnth810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RhDestLnth810 with another Field
	 *	@param value
	 */
   public void setRhDestLnth810(Field source) {
       replace(source,0,source.length(),beginRhDestLnth810,RH_DEST_LNTH_810_LEN);
   	
   }  
   
     /**
	 * 	Update RhDestLnth810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRhDestLnth810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRhDestLnth810,RH_DEST_LNTH_810_LEN);
   	
   }
   
     /**
	 * 	Update RhDestLnth810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRhDestLnth810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRhDestLnth810+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rhDestData810
	 *	@return rhDestData810
	 */
   public char[] getRhDestData810() throws CFException{
     if (isRhDestData810Modified()) { 
        rhDestData810 = refreshRhDestData810();
     }
   		return rhDestData810;
   }

  
	/**
	*  set variable rhDestData810
	*  Corresponding COBOL Variable is 810-RH-DEST-DATA
	*  @param value
	**/
   public void setRhDestData810(char[] value) {
      rhDestData810 = checkRhDestData810Constraints(value);
      serializeRhDestData810(rhDestData810);
   } 

     /**
	 * 	Update RhDestData810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRhDestData810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRhDestData810,rhDestData810.length);
   	
   }
   
   public void setRhDestData810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRhDestData810,rhDestData810.length);
   	
   }
   
     /**
	 * 	Update RhDestData810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRhDestData810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRhDestData810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RhDestData810 with another Field
	 *	@param value
	 */
   public void setRhDestData810(Field source) {
       replace(source,0,source.length(),beginRhDestData810,RH_DEST_DATA_810_LEN);
   	
   }  
   
     /**
	 * 	Update RhDestData810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRhDestData810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRhDestData810,RH_DEST_DATA_810_LEN);
   	
   }
   
     /**
	 * 	Update RhDestData810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRhDestData810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRhDestData810+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRhDestination810FieldLength() {
			return RH_DESTINATION_810_LENGTH;
		}

}
  
