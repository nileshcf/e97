package com.cloudframe.app.init1.dto;

/**
*  The class KeyMtnFile is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class KeyMtnFile extends KeyMtnFileSerialized { 
   
				private KeyMtnCustAcct keyMtnCustAcct = new KeyMtnCustAcct();
				private KeyMtnMtn keyMtnMtn = new KeyMtnMtn();
	
	/**
	* Constructor for KeyMtnFile
	**/
    public KeyMtnFile() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for KeyMtnFile. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyMtnFile(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			keyMtnCustAcct.setParent(this,getStartOffset() + 0);
	       			keyMtnMtn.setParent(this,getStartOffset() + 8);
    } 

	/**
	 *	Returns the value of keyMtnCustAcct
	 *	@return keyMtnCustAcct
	 */   
	 public KeyMtnCustAcct getKeyMtnCustAcct() {
   	return keyMtnCustAcct;
   }
   /**
	* 	Update KeyMtnCustAcct with the passed value
	*   Corresponding COBOL Variable is WS-KEY-MTN-CUST-ACCT
	*	@param value
	*/
   public void setKeyMtnCustAcct(char[] value) {
      keyMtnCustAcct.setString(value); 
   }   
    
     /**
	 * 	Update KeyMtnCustAcct 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setKeyMtnCustAcct(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyMtnCustAcct.begin,keyMtnCustAcct.length());
   }
   
     /**
	 * 	Update KeyMtnCustAcct 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setKeyMtnCustAcct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyMtnCustAcct.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update KeyMtnCustAcct with another Field
	 *	@param value
	 */
   public void setKeyMtnCustAcct(Field source) {
   	replace(source,0,source.length(),keyMtnCustAcct.begin,keyMtnCustAcct.length());
   }  
   
     /**
	 * 	Update KeyMtnCustAcct 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setKeyMtnCustAcct(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyMtnCustAcct.begin,keyMtnCustAcct.length());
   }
   
     /**
	 * 	Update KeyMtnCustAcct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setKeyMtnCustAcct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyMtnCustAcct.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of keyMtnMtn
	 *	@return keyMtnMtn
	 */   
	 public KeyMtnMtn getKeyMtnMtn() {
   	return keyMtnMtn;
   }
   /**
	* 	Update KeyMtnMtn with the passed value
	*   Corresponding COBOL Variable is WS-KEY-MTN-MTN
	*	@param value
	*/
   public void setKeyMtnMtn(char[] value) {
      keyMtnMtn.setString(value); 
   }   
    
     /**
	 * 	Update KeyMtnMtn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setKeyMtnMtn(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyMtnMtn.begin,keyMtnMtn.length());
   }
   
     /**
	 * 	Update KeyMtnMtn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setKeyMtnMtn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyMtnMtn.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update KeyMtnMtn with another Field
	 *	@param value
	 */
   public void setKeyMtnMtn(Field source) {
   	replace(source,0,source.length(),keyMtnMtn.begin,keyMtnMtn.length());
   }  
   
     /**
	 * 	Update KeyMtnMtn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setKeyMtnMtn(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyMtnMtn.begin,keyMtnMtn.length());
   }
   
     /**
	 * 	Update KeyMtnMtn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setKeyMtnMtn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyMtnMtn.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes KeyMtnFile
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          keyMtnCustAcct.initialize();
     
          keyMtnMtn.initialize();
     
   }

		public static int getKeyMtnFileFieldLength() {
			return KEY_MTN_FILE_LENGTH;
		}

}
  
