package com.cloudframe.app.sf305120.dto;

/**
*  The class RhErrorDestination810 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RhErrorDestination810 extends RhErrorDestination810Serialized {
   

						private char[] rhErrDestLnth810 = new char[1];

						private char[] rhErrDestData810 = new char[255];
	
	/**
	* Constructor for RhErrorDestination810
	**/
    public RhErrorDestination810() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setRhErrDestLnth810(getString(new byte[] {(byte)0x0F}).toCharArray());
								setRhErrDestData810(pad(255," ".toCharArray(),' ',RIGHT_PAD));
    }


 

	/**
	 *	Returns the value of rhErrDestLnth810
	 *	@return rhErrDestLnth810
	 */
   public char[] getRhErrDestLnth810() throws CFException{
     if (isRhErrDestLnth810Modified()) { 
        rhErrDestLnth810 = refreshRhErrDestLnth810();
     }
   		return rhErrDestLnth810;
   }

  
	/**
	*  set variable rhErrDestLnth810
	*  Corresponding COBOL Variable is 810-RH-ERR-DEST-LNTH
	*  @param value
	**/
   public void setRhErrDestLnth810(char[] value) {
      rhErrDestLnth810 = checkRhErrDestLnth810Constraints(value);
      serializeRhErrDestLnth810(rhErrDestLnth810);
   } 

     /**
	 * 	Update RhErrDestLnth810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRhErrDestLnth810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRhErrDestLnth810,rhErrDestLnth810.length);
   	
   }
   
   public void setRhErrDestLnth810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRhErrDestLnth810,rhErrDestLnth810.length);
   	
   }
   
     /**
	 * 	Update RhErrDestLnth810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRhErrDestLnth810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRhErrDestLnth810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RhErrDestLnth810 with another Field
	 *	@param value
	 */
   public void setRhErrDestLnth810(Field source) {
       replace(source,0,source.length(),beginRhErrDestLnth810,RH_ERR_DEST_LNTH_810_LEN);
   	
   }  
   
     /**
	 * 	Update RhErrDestLnth810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRhErrDestLnth810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRhErrDestLnth810,RH_ERR_DEST_LNTH_810_LEN);
   	
   }
   
     /**
	 * 	Update RhErrDestLnth810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRhErrDestLnth810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRhErrDestLnth810+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rhErrDestData810
	 *	@return rhErrDestData810
	 */
   public char[] getRhErrDestData810() throws CFException{
     if (isRhErrDestData810Modified()) { 
        rhErrDestData810 = refreshRhErrDestData810();
     }
   		return rhErrDestData810;
   }

  
	/**
	*  set variable rhErrDestData810
	*  Corresponding COBOL Variable is 810-RH-ERR-DEST-DATA
	*  @param value
	**/
   public void setRhErrDestData810(char[] value) {
      rhErrDestData810 = checkRhErrDestData810Constraints(value);
      serializeRhErrDestData810(rhErrDestData810);
   } 

     /**
	 * 	Update RhErrDestData810 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRhErrDestData810(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRhErrDestData810,rhErrDestData810.length);
   	
   }
   
   public void setRhErrDestData810(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRhErrDestData810,rhErrDestData810.length);
   	
   }
   
     /**
	 * 	Update RhErrDestData810 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRhErrDestData810(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRhErrDestData810+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RhErrDestData810 with another Field
	 *	@param value
	 */
   public void setRhErrDestData810(Field source) {
       replace(source,0,source.length(),beginRhErrDestData810,RH_ERR_DEST_DATA_810_LEN);
   	
   }  
   
     /**
	 * 	Update RhErrDestData810 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRhErrDestData810(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRhErrDestData810,RH_ERR_DEST_DATA_810_LEN);
   	
   }
   
     /**
	 * 	Update RhErrDestData810 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRhErrDestData810(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRhErrDestData810+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRhErrorDestination810FieldLength() {
			return RH_ERROR_DESTINATION_810_LENGTH;
		}

}
  
