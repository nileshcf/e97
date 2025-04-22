package com.cloudframe.app.init1.dto;

/**
*  The class WvExtrLdgUsgX is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


public class WvExtrLdgUsgX extends WvExtrLdgUsgXSerialized { 
   

								private char[] wvExtrLdgUsg = Field.fillLowValue(12);
	
	/**
	* Constructor for WvExtrLdgUsgX
	**/
    public WvExtrLdgUsgX() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WvExtrLdgUsgX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrLdgUsgX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wvExtrLdgUsg
	 *	@return wvExtrLdgUsg
	 */
   public char[] getWvExtrLdgUsg() throws CFException{
     if (isWvExtrLdgUsgModified()) { 
        wvExtrLdgUsg = refreshWvExtrLdgUsg();
     }
   		return wvExtrLdgUsg;
   }

  
	/**
	*  set variable wvExtrLdgUsg
	*  Corresponding COBOL Variable is WV-EXTR-LDG-USG
	*  @param value
	**/
   public void setWvExtrLdgUsg(char[] value) {
      wvExtrLdgUsg = checkWvExtrLdgUsgConstraints(value);
      serializeWvExtrLdgUsg(wvExtrLdgUsg);
   } 

     /**
	 * 	Update WvExtrLdgUsg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLdgUsg(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrLdgUsg,wvExtrLdgUsg.length);
   	
   }
   
   public void setWvExtrLdgUsg(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLdgUsg,wvExtrLdgUsg.length);
   	
   }
   
     /**
	 * 	Update WvExtrLdgUsg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgUsg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLdgUsg+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrLdgUsg with another Field
	 *	@param value
	 */
   public void setWvExtrLdgUsg(Field source) {
       replace(source,0,source.length(),beginWvExtrLdgUsg,WV_EXTR_LDG_USG_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrLdgUsg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrLdgUsg(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrLdgUsg,WV_EXTR_LDG_USG_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrLdgUsg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgUsg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLdgUsg+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WvExtrLdgUsgX
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setWvExtrLdgUsg(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1782754550,"0".toCharArray()));
   }

		public static int getWvExtrLdgUsgXFieldLength() {
			return WV_EXTR_LDG_USG_X_LENGTH;
		}

}
  
