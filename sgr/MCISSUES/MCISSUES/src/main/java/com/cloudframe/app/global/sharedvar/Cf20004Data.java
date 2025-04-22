package com.cloudframe.app.global.sharedvar;

/**
*  The class Cf20004Data is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Cf20004Data extends Cf20004DataSerialized { 
   
				private Cf20004TableDataKey cf20004TableDataKey = new Cf20004TableDataKey();
				private Cf20004ItemData cf20004ItemData = new Cf20004ItemData();

						private char[] cf20004Items = Field.fillLowValue(425);

								private int cf20004PtrToIp2000t2;
	
	/**
	* Constructor for Cf20004Data
	**/
    public Cf20004Data() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Cf20004Data. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Cf20004Data(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cf20004TableDataKey.setParent(this,getStartOffset() + 0);
	       			cf20004ItemData.setParent(this,getStartOffset() + 10);
    } 

	/**
	 *	Returns the value of cf20004TableDataKey
	 *	@return cf20004TableDataKey
	 */   
	 public Cf20004TableDataKey getCf20004TableDataKey() {
   	return cf20004TableDataKey;
   }
   /**
	* 	Update Cf20004TableDataKey with the passed value
	*   Corresponding COBOL Variable is CF20004-TABLE-DATA-KEY
	*	@param value
	*/
   public void setCf20004TableDataKey(char[] value) {
      cf20004TableDataKey.setString(value); 
   }   
    
     /**
	 * 	Update Cf20004TableDataKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCf20004TableDataKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cf20004TableDataKey.begin,cf20004TableDataKey.length());
   }
   
     /**
	 * 	Update Cf20004TableDataKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCf20004TableDataKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cf20004TableDataKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Cf20004TableDataKey with another Field
	 *	@param value
	 */
   public void setCf20004TableDataKey(Field source) {
   	replace(source,0,source.length(),cf20004TableDataKey.begin,cf20004TableDataKey.length());
   }  
   
     /**
	 * 	Update Cf20004TableDataKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCf20004TableDataKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cf20004TableDataKey.begin,cf20004TableDataKey.length());
   }
   
     /**
	 * 	Update Cf20004TableDataKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCf20004TableDataKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cf20004TableDataKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cf20004ItemData
	 *	@return cf20004ItemData
	 */   
	 public Cf20004ItemData getCf20004ItemData() {
   	return cf20004ItemData;
   }
   /**
	* 	Update Cf20004ItemData with the passed value
	*   Corresponding COBOL Variable is CF20004-ITEM-DATA
	*	@param value
	*/
   public void setCf20004ItemData(char[] value) {
      cf20004ItemData.setString(value); 
   }   
    
     /**
	 * 	Update Cf20004ItemData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCf20004ItemData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cf20004ItemData.begin,cf20004ItemData.length());
   }
   
     /**
	 * 	Update Cf20004ItemData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCf20004ItemData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cf20004ItemData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Cf20004ItemData with another Field
	 *	@param value
	 */
   public void setCf20004ItemData(Field source) {
   	replace(source,0,source.length(),cf20004ItemData.begin,cf20004ItemData.length());
   }  
   
     /**
	 * 	Update Cf20004ItemData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCf20004ItemData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cf20004ItemData.begin,cf20004ItemData.length());
   }
   
     /**
	 * 	Update Cf20004ItemData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCf20004ItemData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cf20004ItemData.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cf20004Items
	 *	@return cf20004Items
	 */
   public char[] getCf20004Items() throws CFException{
     if (isCf20004ItemsModified()) { 
        cf20004Items = refreshCf20004Items();
     }
   		return cf20004Items;
   }

  
	/**
	*  set variable cf20004Items
	*  Corresponding COBOL Variable is CF20004-ITEMS
	*  @param value
	**/
   public void setCf20004Items(char[] value) {
      cf20004Items = checkCf20004ItemsConstraints(value);
      serializeCf20004Items(cf20004Items);
   } 

     /**
	 * 	Update Cf20004Items 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCf20004Items(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCf20004Items,cf20004Items.length);
   	
   }
   
   public void setCf20004Items(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCf20004Items,cf20004Items.length);
   	
   }
   
     /**
	 * 	Update Cf20004Items 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCf20004Items(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCf20004Items+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Cf20004Items with another Field
	 *	@param value
	 */
   public void setCf20004Items(Field source) {
       replace(source,0,source.length(),beginCf20004Items,CF_20004_ITEMS_LEN);
   	
   }  
   
     /**
	 * 	Update Cf20004Items 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCf20004Items(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCf20004Items,CF_20004_ITEMS_LEN);
   	
   }
   
     /**
	 * 	Update Cf20004Items 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCf20004Items(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCf20004Items+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cf20004PtrToIp2000t2
	 *	@return cf20004PtrToIp2000t2
	 */
	public int getCf20004PtrToIp2000t2() throws CFException {
        if (isCf20004PtrToIp2000t2Modified()) { 
           cf20004PtrToIp2000t2 = refreshCf20004PtrToIp2000t2();
        }
   		return cf20004PtrToIp2000t2;
	}
	
	/**
	 * 	Update Cf20004PtrToIp2000t2 with the passed value
	 *  Corresponding COBOL Variable is CF20004-PTR-TO-IP2000T2
	 *	@param number
	 */
	public void setCf20004PtrToIp2000t2(int number) {
	     // Truncate if the number is beyond +/- Max range
	    cf20004PtrToIp2000t2 = checkCf20004PtrToIp2000t2MaxLimit(number); 
		serializeCf20004PtrToIp2000t2(cf20004PtrToIp2000t2);
	}


	public void setCf20004PtrToIp2000t2(long number) {
	    number = checkCf20004PtrToIp2000t2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCf20004PtrToIp2000t2((int)number);
	}
	

	
	
	
	/**
	 * 	initializes Cf20004Data
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          cf20004TableDataKey.initialize();
     
          cf20004ItemData.initialize();
     
         setCf20004Items(CONSTANTS.SPACE_425);
                     setCf20004PtrToIp2000t2(0);
   }

		public static int getCf20004DataFieldLength() {
			return CF_20004_DATA_LENGTH;
		}

}
  
