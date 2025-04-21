package com.cloudframe.app.ip989010.file.records;

/**
*  The class Sys004InRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/


import com.cloudframe.app.ip989010.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys004InRec extends Sys004InRecSerialized {
   

						private char[] sys004MtiFc = Field.fillLowValue(7);

						private char[] sys004TagKey = Field.fillLowValue(13);
				private Sys004TagData sys004TagData = new Sys004TagData();
	
	/**
	* Constructor for Sys004InRec
	**/
    public Sys004InRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			sys004TagData.setParent(this,getStartOffset() + 20);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of sys004MtiFc
	 *	@return sys004MtiFc
	 */
   public char[] getSys004MtiFc() throws CFException{
     if (isSys004MtiFcModified()) { 
        sys004MtiFc = refreshSys004MtiFc();
     }
   		return sys004MtiFc;
   }

  
	/**
	*  set variable sys004MtiFc
	*  Corresponding COBOL Variable is SYS004-MTI-FC
	*  @param value
	**/
   public void setSys004MtiFc(char[] value) {
      sys004MtiFc = checkSys004MtiFcConstraints(value);
      serializeSys004MtiFc(sys004MtiFc);
   } 

     /**
	 * 	Update Sys004MtiFc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys004MtiFc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys004MtiFc,sys004MtiFc.length);
   	
   }
   
   public void setSys004MtiFc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys004MtiFc,sys004MtiFc.length);
   	
   }
   
     /**
	 * 	Update Sys004MtiFc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys004MtiFc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys004MtiFc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys004MtiFc with another Field
	 *	@param value
	 */
   public void setSys004MtiFc(Field source) {
       replace(source,0,source.length(),beginSys004MtiFc,SYS_004_MTI_FC_LEN);
   	
   }  
   
     /**
	 * 	Update Sys004MtiFc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys004MtiFc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys004MtiFc,SYS_004_MTI_FC_LEN);
   	
   }
   
     /**
	 * 	Update Sys004MtiFc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys004MtiFc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys004MtiFc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sys004TagKey
	 *	@return sys004TagKey
	 */
   public char[] getSys004TagKey() throws CFException{
     if (isSys004TagKeyModified()) { 
        sys004TagKey = refreshSys004TagKey();
     }
   		return sys004TagKey;
   }

  
	/**
	*  set variable sys004TagKey
	*  Corresponding COBOL Variable is SYS004-TAG-KEY
	*  @param value
	**/
   public void setSys004TagKey(char[] value) {
      sys004TagKey = checkSys004TagKeyConstraints(value);
      serializeSys004TagKey(sys004TagKey);
   } 

     /**
	 * 	Update Sys004TagKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys004TagKey(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys004TagKey,sys004TagKey.length);
   	
   }
   
   public void setSys004TagKey(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys004TagKey,sys004TagKey.length);
   	
   }
   
     /**
	 * 	Update Sys004TagKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys004TagKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys004TagKey+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys004TagKey with another Field
	 *	@param value
	 */
   public void setSys004TagKey(Field source) {
       replace(source,0,source.length(),beginSys004TagKey,SYS_004_TAG_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update Sys004TagKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys004TagKey(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys004TagKey,SYS_004_TAG_KEY_LEN);
   	
   }
   
     /**
	 * 	Update Sys004TagKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys004TagKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys004TagKey+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sys004TagData
	 *	@return sys004TagData
	 */   
	 public Sys004TagData getSys004TagData() {
   	return sys004TagData;
   }
   /**
	* 	Update Sys004TagData with the passed value
	*   Corresponding COBOL Variable is SYS004-TAG-DATA
	*	@param value
	*/
   public void setSys004TagData(char[] value) {
      sys004TagData.setString(value); 
   }   
    
     /**
	 * 	Update Sys004TagData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSys004TagData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sys004TagData.begin,sys004TagData.length());
   }
   
     /**
	 * 	Update Sys004TagData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys004TagData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sys004TagData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sys004TagData with another Field
	 *	@param value
	 */
   public void setSys004TagData(Field source) {
   	replace(source,0,source.length(),sys004TagData.begin,sys004TagData.length());
   }  
   
     /**
	 * 	Update Sys004TagData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSys004TagData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sys004TagData.begin,sys004TagData.length());
   }
   
     /**
	 * 	Update Sys004TagData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys004TagData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sys004TagData.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSys004InRecFieldLength() {
			return SYS_004_IN_REC_LENGTH;
		}

}
  
