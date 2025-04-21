package com.cloudframe.app.ip200090.dto;

/**
*  The class BslId800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:02. using version 5.0.0.256
**/


import com.cloudframe.app.ip200090.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BslId800 extends BslId800Serialized { 
   

						private char[] bsl800 = new char[1];

						private char[] bsid800 = new char[6];
	
	/**
	* Constructor for BslId800
	**/
    public BslId800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BslId800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BslId800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setBsl800(fillSpace(1));
								setBsid800(fillSpace(6));
    } 

	/**
	 *	Returns the value of bsl800
	 *	@return bsl800
	 */
   public char[] getBsl800() throws CFException{
     if (isBsl800Modified()) { 
        bsl800 = refreshBsl800();
     }
   		return bsl800;
   }

  
	/**
	*  set variable bsl800
	*  Corresponding COBOL Variable is 800-BSL
	*  @param value
	**/
   public void setBsl800(char[] value) {
      bsl800 = checkBsl800Constraints(value);
      serializeBsl800(bsl800);
   } 

     /**
	 * 	Update Bsl800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBsl800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBsl800,bsl800.length);
   	
   }
   
   public void setBsl800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBsl800,bsl800.length);
   	
   }
   
     /**
	 * 	Update Bsl800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBsl800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBsl800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bsl800 with another Field
	 *	@param value
	 */
   public void setBsl800(Field source) {
       replace(source,0,source.length(),beginBsl800,BSL_800_LEN);
   	
   }  
   
     /**
	 * 	Update Bsl800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBsl800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBsl800,BSL_800_LEN);
   	
   }
   
     /**
	 * 	Update Bsl800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBsl800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBsl800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bsid800
	 *	@return bsid800
	 */
   public char[] getBsid800() throws CFException{
     if (isBsid800Modified()) { 
        bsid800 = refreshBsid800();
     }
   		return bsid800;
   }

  
	/**
	*  set variable bsid800
	*  Corresponding COBOL Variable is 800-BSID
	*  @param value
	**/
   public void setBsid800(char[] value) {
      bsid800 = checkBsid800Constraints(value);
      serializeBsid800(bsid800);
   } 

     /**
	 * 	Update Bsid800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBsid800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBsid800,bsid800.length);
   	
   }
   
   public void setBsid800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBsid800,bsid800.length);
   	
   }
   
     /**
	 * 	Update Bsid800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBsid800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBsid800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Bsid800 with another Field
	 *	@param value
	 */
   public void setBsid800(Field source) {
       replace(source,0,source.length(),beginBsid800,BSID_800_LEN);
   	
   }  
   
     /**
	 * 	Update Bsid800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBsid800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBsid800,BSID_800_LEN);
   	
   }
   
     /**
	 * 	Update Bsid800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBsid800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBsid800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBslId800FieldLength() {
			return BSL_ID_800_LENGTH;
		}

}
  
