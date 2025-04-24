package com.cloudframe.app.global.sharedvar;

/**
*  The class Cf20004TableData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;


@GlobalDto
public class Cf20004TableData extends Cf20004TableDataSerialized { 
   
				private Cf20004ValidValuesEntry cf20004ValidValuesEntry = new Cf20004ValidValuesEntry();
	
	/**
	* Constructor for Cf20004TableData
	**/
    public Cf20004TableData() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			cf20004ValidValuesEntry.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of cf20004ValidValuesEntry
	 *	@return cf20004ValidValuesEntry
	 */   
	 public Cf20004ValidValuesEntry getCf20004ValidValuesEntry() {
   	return cf20004ValidValuesEntry;
   }
   /**
	* 	Update Cf20004ValidValuesEntry with the passed value
	*   Corresponding COBOL Variable is CF20004-VALID-VALUES-ENTRY
	*	@param value
	*/
   public void setCf20004ValidValuesEntry(char[] value) {
      cf20004ValidValuesEntry.setString(value); 
   }   
    
     /**
	 * 	Update Cf20004ValidValuesEntry 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCf20004ValidValuesEntry(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cf20004ValidValuesEntry.begin,cf20004ValidValuesEntry.length());
   }
   
     /**
	 * 	Update Cf20004ValidValuesEntry 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCf20004ValidValuesEntry(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cf20004ValidValuesEntry.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Cf20004ValidValuesEntry with another Field
	 *	@param value
	 */
   public void setCf20004ValidValuesEntry(Field source) {
   	replace(source,0,source.length(),cf20004ValidValuesEntry.begin,cf20004ValidValuesEntry.length());
   }  
   
     /**
	 * 	Update Cf20004ValidValuesEntry 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCf20004ValidValuesEntry(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cf20004ValidValuesEntry.begin,cf20004ValidValuesEntry.length());
   }
   
     /**
	 * 	Update Cf20004ValidValuesEntry 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCf20004ValidValuesEntry(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cf20004ValidValuesEntry.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Cf20004TableData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          cf20004ValidValuesEntry.initialize();
     
   }

		public static int getCf20004TableDataFieldLength() {
			return CF_20004_TABLE_DATA_LENGTH;
		}

}
  
