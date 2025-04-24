package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip70711TipamrsEntries is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:39. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;


@GlobalDto
public class Ip70711TipamrsEntries extends Ip70711TipamrsEntriesSerialized { 
   
				private Ip70711TipamrsKey ip70711TipamrsKey = new Ip70711TipamrsKey();
				private Ip70711ResponseData ip70711ResponseData = new Ip70711ResponseData();
	
	/**
	* Constructor for Ip70711TipamrsEntries
	**/
    public Ip70711TipamrsEntries() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ip70711TipamrsKey.setParent(this,getStartOffset() + 0);
	       			ip70711ResponseData.setParent(this,getStartOffset() + 57);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip70711TipamrsKey
	 *	@return ip70711TipamrsKey
	 */   
	 public Ip70711TipamrsKey getIp70711TipamrsKey() {
   	return ip70711TipamrsKey;
   }
   /**
	* 	Update Ip70711TipamrsKey with the passed value
	*   Corresponding COBOL Variable is IP70711-TIPAMRS-KEY
	*	@param value
	*/
   public void setIp70711TipamrsKey(char[] value) {
      ip70711TipamrsKey.setString(value); 
   }   
    
     /**
	 * 	Update Ip70711TipamrsKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp70711TipamrsKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip70711TipamrsKey.begin,ip70711TipamrsKey.length());
   }
   
     /**
	 * 	Update Ip70711TipamrsKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70711TipamrsKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip70711TipamrsKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip70711TipamrsKey with another Field
	 *	@param value
	 */
   public void setIp70711TipamrsKey(Field source) {
   	replace(source,0,source.length(),ip70711TipamrsKey.begin,ip70711TipamrsKey.length());
   }  
   
     /**
	 * 	Update Ip70711TipamrsKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp70711TipamrsKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip70711TipamrsKey.begin,ip70711TipamrsKey.length());
   }
   
     /**
	 * 	Update Ip70711TipamrsKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70711TipamrsKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip70711TipamrsKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip70711ResponseData
	 *	@return ip70711ResponseData
	 */   
	 public Ip70711ResponseData getIp70711ResponseData() {
   	return ip70711ResponseData;
   }
   /**
	* 	Update Ip70711ResponseData with the passed value
	*   Corresponding COBOL Variable is IP70711-RESPONSE-DATA
	*	@param value
	*/
   public void setIp70711ResponseData(char[] value) {
      ip70711ResponseData.setString(value); 
   }   
    
     /**
	 * 	Update Ip70711ResponseData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp70711ResponseData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip70711ResponseData.begin,ip70711ResponseData.length());
   }
   
     /**
	 * 	Update Ip70711ResponseData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp70711ResponseData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip70711ResponseData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip70711ResponseData with another Field
	 *	@param value
	 */
   public void setIp70711ResponseData(Field source) {
   	replace(source,0,source.length(),ip70711ResponseData.begin,ip70711ResponseData.length());
   }  
   
     /**
	 * 	Update Ip70711ResponseData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp70711ResponseData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip70711ResponseData.begin,ip70711ResponseData.length());
   }
   
     /**
	 * 	Update Ip70711ResponseData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp70711ResponseData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip70711ResponseData.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip70711TipamrsEntries
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip70711TipamrsKey.initialize();
     
          ip70711ResponseData.initialize();
     
   }

		public static int getIp70711TipamrsEntriesFieldLength() {
			return IP_70711_TIPAMRS_ENTRIES_LENGTH;
		}

}
  
