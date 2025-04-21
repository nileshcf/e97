package com.cloudframe.app.ar640010.dto;

/**
*  The class VersionId1000 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class VersionId1000 extends VersionId1000Serialized { 
   

						private char[] versionDate1000 = new char[10];


						private char[] versionMod1000 = new char[1];
	
	/**
	* Constructor for VersionId1000
	**/
    public VersionId1000() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for VersionId1000. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public VersionId1000(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setVersionDate1000(("2013-04-15").toCharArray());
       replaceValue( // serialize and save the value
             ("#").toCharArray()
             , getStartOffset() + 10
             ,1
             );
								setVersionMod1000(("0").toCharArray());
    } 

	/**
	 *	Returns the value of versionDate1000
	 *	@return versionDate1000
	 */
   public char[] getVersionDate1000() throws CFException{
     if (isVersionDate1000Modified()) { 
        versionDate1000 = refreshVersionDate1000();
     }
   		return versionDate1000;
   }

  
	/**
	*  set variable versionDate1000
	*  Corresponding COBOL Variable is 1000-VERSION-DATE
	*  @param value
	**/
   public void setVersionDate1000(char[] value) {
      versionDate1000 = checkVersionDate1000Constraints(value);
      serializeVersionDate1000(versionDate1000);
   } 

     /**
	 * 	Update VersionDate1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVersionDate1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginVersionDate1000,versionDate1000.length);
   	
   }
   
   public void setVersionDate1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginVersionDate1000,versionDate1000.length);
   	
   }
   
     /**
	 * 	Update VersionDate1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVersionDate1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVersionDate1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update VersionDate1000 with another Field
	 *	@param value
	 */
   public void setVersionDate1000(Field source) {
       replace(source,0,source.length(),beginVersionDate1000,VERSION_DATE_1000_LEN);
   	
   }  
   
     /**
	 * 	Update VersionDate1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVersionDate1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginVersionDate1000,VERSION_DATE_1000_LEN);
   	
   }
   
     /**
	 * 	Update VersionDate1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVersionDate1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVersionDate1000+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of versionMod1000
	 *	@return versionMod1000
	 */
   public char[] getVersionMod1000() throws CFException{
     if (isVersionMod1000Modified()) { 
        versionMod1000 = refreshVersionMod1000();
     }
   		return versionMod1000;
   }

  
	/**
	*  set variable versionMod1000
	*  Corresponding COBOL Variable is 1000-VERSION-MOD
	*  @param value
	**/
   public void setVersionMod1000(char[] value) {
      versionMod1000 = checkVersionMod1000Constraints(value);
      serializeVersionMod1000(versionMod1000);
   } 

     /**
	 * 	Update VersionMod1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVersionMod1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginVersionMod1000,versionMod1000.length);
   	
   }
   
   public void setVersionMod1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginVersionMod1000,versionMod1000.length);
   	
   }
   
     /**
	 * 	Update VersionMod1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVersionMod1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVersionMod1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update VersionMod1000 with another Field
	 *	@param value
	 */
   public void setVersionMod1000(Field source) {
       replace(source,0,source.length(),beginVersionMod1000,VERSION_MOD_1000_LEN);
   	
   }  
   
     /**
	 * 	Update VersionMod1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVersionMod1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginVersionMod1000,VERSION_MOD_1000_LEN);
   	
   }
   
     /**
	 * 	Update VersionMod1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVersionMod1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVersionMod1000+targetIndex,targetLen);
    
   }

	
	
	

		public static int getVersionId1000FieldLength() {
			return VERSION_ID_1000_LENGTH;
		}

}
  
