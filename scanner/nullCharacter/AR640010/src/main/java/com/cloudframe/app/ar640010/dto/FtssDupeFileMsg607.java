package com.cloudframe.app.ar640010.dto;

/**
*  The class FtssDupeFileMsg607 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FtssDupeFileMsg607 extends FtssDupeFileMsg607Serialized {
   


						private char[] ftssDupeFileId607 = new char[14];

	
	/**
	* Constructor for FtssDupeFileMsg607
	**/
    public FtssDupeFileMsg607() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0071-FTSS FILE ALREADY POSTED FOR FILEID: ").toCharArray()
             , getStartOffset() + 0
             ,42
             );
								setFtssDupeFileId607(fillSpace(14));
       replaceValue( // serialize and save the value
             (", ENDPOINT BYPASSED").toCharArray()
             , getStartOffset() + 56
             ,19
             );
    }


 

	/**
	 *	Returns the value of ftssDupeFileId607
	 *	@return ftssDupeFileId607
	 */
   public char[] getFtssDupeFileId607() throws CFException{
     if (isFtssDupeFileId607Modified()) { 
        ftssDupeFileId607 = refreshFtssDupeFileId607();
     }
   		return ftssDupeFileId607;
   }

  
	/**
	*  set variable ftssDupeFileId607
	*  Corresponding COBOL Variable is 607-FTSS-DUPE-FILE-ID
	*  @param value
	**/
   public void setFtssDupeFileId607(char[] value) {
      ftssDupeFileId607 = checkFtssDupeFileId607Constraints(value);
      serializeFtssDupeFileId607(ftssDupeFileId607);
   } 

     /**
	 * 	Update FtssDupeFileId607 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFtssDupeFileId607(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFtssDupeFileId607,ftssDupeFileId607.length);
   	
   }
   
   public void setFtssDupeFileId607(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFtssDupeFileId607,ftssDupeFileId607.length);
   	
   }
   
     /**
	 * 	Update FtssDupeFileId607 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFtssDupeFileId607(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFtssDupeFileId607+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FtssDupeFileId607 with another Field
	 *	@param value
	 */
   public void setFtssDupeFileId607(Field source) {
       replace(source,0,source.length(),beginFtssDupeFileId607,FTSS_DUPE_FILE_ID_607_LEN);
   	
   }  
   
     /**
	 * 	Update FtssDupeFileId607 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFtssDupeFileId607(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFtssDupeFileId607,FTSS_DUPE_FILE_ID_607_LEN);
   	
   }
   
     /**
	 * 	Update FtssDupeFileId607 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFtssDupeFileId607(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFtssDupeFileId607+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFtssDupeFileMsg607FieldLength() {
			return FTSS_DUPE_FILE_MSG_607_LENGTH;
		}

}
  
