package com.cloudframe.app.global.sharedvar;

/**
*  The class Cf20004ValidValuesEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Cf20004ValidValuesEntry extends Cf20004ValidValuesEntrySerialized { 
   
				private Cf20004TableKey cf20004TableKey = new Cf20004TableKey();
				private Cf20004Data cf20004Data = new Cf20004Data();
	
	/**
	* Constructor for Cf20004ValidValuesEntry
	**/
    public Cf20004ValidValuesEntry() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Cf20004ValidValuesEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Cf20004ValidValuesEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cf20004TableKey.setParent(this,getStartOffset() + 0);
	       			cf20004Data.setParent(this,getStartOffset() + 18);
    } 

	/**
	 *	Returns the value of cf20004TableKey
	 *	@return cf20004TableKey
	 */   
	 public Cf20004TableKey getCf20004TableKey() {
   	return cf20004TableKey;
   }
   /**
	* 	Update Cf20004TableKey with the passed value
	*   Corresponding COBOL Variable is CF20004-TABLE-KEY
	*	@param value
	*/
   public void setCf20004TableKey(char[] value) {
      cf20004TableKey.setString(value); 
   }   
    
     /**
	 * 	Update Cf20004TableKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCf20004TableKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cf20004TableKey.begin,cf20004TableKey.length());
   }
   
     /**
	 * 	Update Cf20004TableKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCf20004TableKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cf20004TableKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Cf20004TableKey with another Field
	 *	@param value
	 */
   public void setCf20004TableKey(Field source) {
   	replace(source,0,source.length(),cf20004TableKey.begin,cf20004TableKey.length());
   }  
   
     /**
	 * 	Update Cf20004TableKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCf20004TableKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cf20004TableKey.begin,cf20004TableKey.length());
   }
   
     /**
	 * 	Update Cf20004TableKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCf20004TableKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cf20004TableKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cf20004Data
	 *	@return cf20004Data
	 */   
	 public Cf20004Data getCf20004Data() {
   	return cf20004Data;
   }
   /**
	* 	Update Cf20004Data with the passed value
	*   Corresponding COBOL Variable is CF20004-DATA
	*	@param value
	*/
   public void setCf20004Data(char[] value) {
      cf20004Data.setString(value); 
   }   
    
     /**
	 * 	Update Cf20004Data 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCf20004Data(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cf20004Data.begin,cf20004Data.length());
   }
   
     /**
	 * 	Update Cf20004Data 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCf20004Data(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cf20004Data.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Cf20004Data with another Field
	 *	@param value
	 */
   public void setCf20004Data(Field source) {
   	replace(source,0,source.length(),cf20004Data.begin,cf20004Data.length());
   }  
   
     /**
	 * 	Update Cf20004Data 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCf20004Data(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cf20004Data.begin,cf20004Data.length());
   }
   
     /**
	 * 	Update Cf20004Data 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCf20004Data(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cf20004Data.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Cf20004ValidValuesEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          cf20004TableKey.initialize();
     
          cf20004Data.initialize();
     
   }

		public static int getCf20004ValidValuesEntryFieldLength() {
			return CF_20004_VALID_VALUES_ENTRY_LENGTH;
		}

}
  
