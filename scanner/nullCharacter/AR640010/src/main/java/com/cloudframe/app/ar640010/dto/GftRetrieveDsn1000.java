package com.cloudframe.app.ar640010.dto;

/**
*  The class GftRetrieveDsn1000 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class GftRetrieveDsn1000 extends GftRetrieveDsn1000Serialized { 
   

						private char[] gftRetrieveDd1000 = Field.fillLowValue(8);

	
	/**
	* Constructor for GftRetrieveDsn1000
	**/
    public GftRetrieveDsn1000() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for GftRetrieveDsn1000. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public GftRetrieveDsn1000(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of gftRetrieveDd1000
	 *	@return gftRetrieveDd1000
	 */
   public char[] getGftRetrieveDd1000() throws CFException{
     if (isGftRetrieveDd1000Modified()) { 
        gftRetrieveDd1000 = refreshGftRetrieveDd1000();
     }
   		return gftRetrieveDd1000;
   }

  
	/**
	*  set variable gftRetrieveDd1000
	*  Corresponding COBOL Variable is 1000-GFT-RETRIEVE-DD
	*  @param value
	**/
   public void setGftRetrieveDd1000(char[] value) {
      gftRetrieveDd1000 = checkGftRetrieveDd1000Constraints(value);
      serializeGftRetrieveDd1000(gftRetrieveDd1000);
   } 

     /**
	 * 	Update GftRetrieveDd1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGftRetrieveDd1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGftRetrieveDd1000,gftRetrieveDd1000.length);
   	
   }
   
   public void setGftRetrieveDd1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGftRetrieveDd1000,gftRetrieveDd1000.length);
   	
   }
   
     /**
	 * 	Update GftRetrieveDd1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGftRetrieveDd1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftRetrieveDd1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GftRetrieveDd1000 with another Field
	 *	@param value
	 */
   public void setGftRetrieveDd1000(Field source) {
       replace(source,0,source.length(),beginGftRetrieveDd1000,GFT_RETRIEVE_DD_1000_LEN);
   	
   }  
   
     /**
	 * 	Update GftRetrieveDd1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGftRetrieveDd1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGftRetrieveDd1000,GFT_RETRIEVE_DD_1000_LEN);
   	
   }
   
     /**
	 * 	Update GftRetrieveDd1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGftRetrieveDd1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftRetrieveDd1000+targetIndex,targetLen);
    
   }

	
	
	

		public static int getGftRetrieveDsn1000FieldLength() {
			return GFT_RETRIEVE_DSN_1000_LENGTH;
		}

}
  
