package com.cloudframe.app.bm8090m.dto;

/**
*  The class WeleTab is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:28. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WeleTab extends WeleTabSerialized { 
   

						private char[] welem = Field.fillLowValue(1);
	
	/**
	* Constructor for WeleTab
	**/
    public WeleTab() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WeleTab. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WeleTab(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of welem
	 *	@return welem
	 */
   public char[] getWelem() throws CFException{
     if (isWelemModified()) { 
        welem = refreshWelem();
     }
   		return welem;
   }

  
	/**
	*  set variable welem
	*  Corresponding COBOL Variable is WELEM
	*  @param value
	**/
   public void setWelem(char[] value) {
      welem = checkWelemConstraints(value);
      serializeWelem(welem);
   } 

     /**
	 * 	Update Welem 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWelem(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWelem,welem.length);
   	
   }
   
   public void setWelem(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWelem,welem.length);
   	
   }
   
     /**
	 * 	Update Welem 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWelem(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWelem+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Welem with another Field
	 *	@param value
	 */
   public void setWelem(Field source) {
       replace(source,0,source.length(),beginWelem,WELEM_LEN);
   	
   }  
   
     /**
	 * 	Update Welem 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWelem(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWelem,WELEM_LEN);
   	
   }
   
     /**
	 * 	Update Welem 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWelem(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWelem+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWeleTabFieldLength() {
			return WELE_TAB_LENGTH;
		}

}
  
