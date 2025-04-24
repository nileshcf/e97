package com.cloudframe.app.ar640010.dto;

/**
*  The class GftDsn1000 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class GftDsn1000 extends GftDsn1000Serialized { 
   

						private char[] gftDd1000 = new char[8];

	
	/**
	* Constructor for GftDsn1000
	**/
    public GftDsn1000() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for GftDsn1000. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public GftDsn1000(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setGftDd1000(fillSpace(8));
       replaceValue( // serialize and save the value
             fillSpace(36)
             , getStartOffset() + 8
             ,36
             );
    } 

	/**
	 *	Returns the value of gftDd1000
	 *	@return gftDd1000
	 */
   public char[] getGftDd1000() throws CFException{
     if (isGftDd1000Modified()) { 
        gftDd1000 = refreshGftDd1000();
     }
   		return gftDd1000;
   }

  
	/**
	*  set variable gftDd1000
	*  Corresponding COBOL Variable is 1000-GFT-DD
	*  @param value
	**/
   public void setGftDd1000(char[] value) {
      gftDd1000 = checkGftDd1000Constraints(value);
      serializeGftDd1000(gftDd1000);
   } 

     /**
	 * 	Update GftDd1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGftDd1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGftDd1000,gftDd1000.length);
   	
   }
   
   public void setGftDd1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGftDd1000,gftDd1000.length);
   	
   }
   
     /**
	 * 	Update GftDd1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGftDd1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftDd1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GftDd1000 with another Field
	 *	@param value
	 */
   public void setGftDd1000(Field source) {
       replace(source,0,source.length(),beginGftDd1000,GFT_DD_1000_LEN);
   	
   }  
   
     /**
	 * 	Update GftDd1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGftDd1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGftDd1000,GFT_DD_1000_LEN);
   	
   }
   
     /**
	 * 	Update GftDd1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGftDd1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftDd1000+targetIndex,targetLen);
    
   }

	
	
	

		public static int getGftDsn1000FieldLength() {
			return GFT_DSN_1000_LENGTH;
		}

}
  
