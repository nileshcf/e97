package com.cloudframe.app.global.sharedvar;

/**
*  The class FnsPldRdFnsDataFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FnsPldRdFnsDataFields extends FnsPldRdFnsDataFieldsSerialized { 
   
				private FnsPldRdFacDataKey fnsPldRdFacDataKey = new FnsPldRdFacDataKey();
				private FnsPldRdFacData fnsPldRdFacData = new FnsPldRdFacData();
	
	/**
	* Constructor for FnsPldRdFnsDataFields
	**/
    public FnsPldRdFnsDataFields() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FnsPldRdFnsDataFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPldRdFnsDataFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			fnsPldRdFacDataKey.setParent(this,getStartOffset() + 0);
	       			fnsPldRdFacData.setParent(this,getStartOffset() + 25);
    } 

	/**
	 *	Returns the value of fnsPldRdFacDataKey
	 *	@return fnsPldRdFacDataKey
	 */   
	 public FnsPldRdFacDataKey getFnsPldRdFacDataKey() {
   	return fnsPldRdFacDataKey;
   }
   /**
	* 	Update FnsPldRdFacDataKey with the passed value
	*   Corresponding COBOL Variable is FNS-PLD-RD-FAC-DATA-KEY
	*	@param value
	*/
   public void setFnsPldRdFacDataKey(char[] value) {
      fnsPldRdFacDataKey.setString(value); 
   }   
    
     /**
	 * 	Update FnsPldRdFacDataKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdFacDataKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fnsPldRdFacDataKey.begin,fnsPldRdFacDataKey.length());
   }
   
     /**
	 * 	Update FnsPldRdFacDataKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdFacDataKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fnsPldRdFacDataKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FnsPldRdFacDataKey with another Field
	 *	@param value
	 */
   public void setFnsPldRdFacDataKey(Field source) {
   	replace(source,0,source.length(),fnsPldRdFacDataKey.begin,fnsPldRdFacDataKey.length());
   }  
   
     /**
	 * 	Update FnsPldRdFacDataKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdFacDataKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fnsPldRdFacDataKey.begin,fnsPldRdFacDataKey.length());
   }
   
     /**
	 * 	Update FnsPldRdFacDataKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdFacDataKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fnsPldRdFacDataKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of fnsPldRdFacData
	 *	@return fnsPldRdFacData
	 */   
	 public FnsPldRdFacData getFnsPldRdFacData() {
   	return fnsPldRdFacData;
   }
   /**
	* 	Update FnsPldRdFacData with the passed value
	*   Corresponding COBOL Variable is FNS-PLD-RD-FAC-DATA
	*	@param value
	*/
   public void setFnsPldRdFacData(char[] value) {
      fnsPldRdFacData.setString(value); 
   }   
    
     /**
	 * 	Update FnsPldRdFacData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdFacData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fnsPldRdFacData.begin,fnsPldRdFacData.length());
   }
   
     /**
	 * 	Update FnsPldRdFacData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdFacData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fnsPldRdFacData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FnsPldRdFacData with another Field
	 *	@param value
	 */
   public void setFnsPldRdFacData(Field source) {
   	replace(source,0,source.length(),fnsPldRdFacData.begin,fnsPldRdFacData.length());
   }  
   
     /**
	 * 	Update FnsPldRdFacData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdFacData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fnsPldRdFacData.begin,fnsPldRdFacData.length());
   }
   
     /**
	 * 	Update FnsPldRdFacData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdFacData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fnsPldRdFacData.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes FnsPldRdFnsDataFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          fnsPldRdFacDataKey.initialize();
     
          fnsPldRdFacData.initialize();
     
   }

		public static int getFnsPldRdFnsDataFieldsFieldLength() {
			return FNS_PLD_RD_FNS_DATA_FIELDS_LENGTH;
		}

}
  
