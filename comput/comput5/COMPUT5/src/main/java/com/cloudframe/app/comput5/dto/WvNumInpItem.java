package com.cloudframe.app.comput5.dto;

/**
*  The class WvNumInpItem is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.comput5.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WvNumInpItem extends WvNumInpItemSerialized { 
   

						private char[] wvNumInp = Field.fillLowValue(1);
	
	/**
	* Constructor for WvNumInpItem
	**/
    public WvNumInpItem() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WvNumInpItem. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvNumInpItem(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wvNumInp
	 *	@return wvNumInp
	 */
   public char[] getWvNumInp() throws CFException{
     if (isWvNumInpModified()) { 
        wvNumInp = refreshWvNumInp();
     }
   		return wvNumInp;
   }

  
	/**
	*  set variable wvNumInp
	*  Corresponding COBOL Variable is WV-NUM-INP
	*  @param value
	**/
   public void setWvNumInp(char[] value) {
      wvNumInp = checkWvNumInpConstraints(value);
      serializeWvNumInp(wvNumInp);
   } 

     /**
	 * 	Update WvNumInp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvNumInp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvNumInp,wvNumInp.length);
   	
   }
   
   public void setWvNumInp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvNumInp,wvNumInp.length);
   	
   }
   
     /**
	 * 	Update WvNumInp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvNumInp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvNumInp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvNumInp with another Field
	 *	@param value
	 */
   public void setWvNumInp(Field source) {
       replace(source,0,source.length(),beginWvNumInp,WV_NUM_INP_LEN);
   	
   }  
   
     /**
	 * 	Update WvNumInp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvNumInp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvNumInp,WV_NUM_INP_LEN);
   	
   }
   
     /**
	 * 	Update WvNumInp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvNumInp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvNumInp+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWvNumInpItemFieldLength() {
			return WV_NUM_INP_ITEM_LENGTH;
		}

}
  
