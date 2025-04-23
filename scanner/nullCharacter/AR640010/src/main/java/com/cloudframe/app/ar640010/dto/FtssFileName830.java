package com.cloudframe.app.ar640010.dto;

/**
*  The class FtssFileName830 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FtssFileName830 extends FtssFileName830Serialized {
   

						private char[] ftssFileBulkId830 = new char[4];

						private char[] ftssFileEndptNo830 = new char[5];

						private char[] ftssFileJulDay830 = new char[3];
				private FtssFileSeqNum830 ftssFileSeqNum830 = new FtssFileSeqNum830();
	
	/**
	* Constructor for FtssFileName830
	**/
    public FtssFileName830() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ftssFileSeqNum830.setParent(this,getStartOffset() + 12);
	   	/*  end of offset */
								setFtssFileBulkId830(fillSpace(4));
								setFtssFileEndptNo830(fillSpace(5));
								setFtssFileJulDay830(fillSpace(3));
								ftssFileSeqNum830.setString(fillSpace(2));
    }


 

	/**
	 *	Returns the value of ftssFileBulkId830
	 *	@return ftssFileBulkId830
	 */
   public char[] getFtssFileBulkId830() throws CFException{
     if (isFtssFileBulkId830Modified()) { 
        ftssFileBulkId830 = refreshFtssFileBulkId830();
     }
   		return ftssFileBulkId830;
   }

  
	/**
	*  set variable ftssFileBulkId830
	*  Corresponding COBOL Variable is 830-FTSS-FILE-BULK-ID
	*  @param value
	**/
   public void setFtssFileBulkId830(char[] value) {
      ftssFileBulkId830 = checkFtssFileBulkId830Constraints(value);
      serializeFtssFileBulkId830(ftssFileBulkId830);
   } 

     /**
	 * 	Update FtssFileBulkId830 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFtssFileBulkId830(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFtssFileBulkId830,ftssFileBulkId830.length);
   	
   }
   
   public void setFtssFileBulkId830(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFtssFileBulkId830,ftssFileBulkId830.length);
   	
   }
   
     /**
	 * 	Update FtssFileBulkId830 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFtssFileBulkId830(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFtssFileBulkId830+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FtssFileBulkId830 with another Field
	 *	@param value
	 */
   public void setFtssFileBulkId830(Field source) {
       replace(source,0,source.length(),beginFtssFileBulkId830,FTSS_FILE_BULK_ID_830_LEN);
   	
   }  
   
     /**
	 * 	Update FtssFileBulkId830 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFtssFileBulkId830(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFtssFileBulkId830,FTSS_FILE_BULK_ID_830_LEN);
   	
   }
   
     /**
	 * 	Update FtssFileBulkId830 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFtssFileBulkId830(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFtssFileBulkId830+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ftssFileEndptNo830
	 *	@return ftssFileEndptNo830
	 */
   public char[] getFtssFileEndptNo830() throws CFException{
     if (isFtssFileEndptNo830Modified()) { 
        ftssFileEndptNo830 = refreshFtssFileEndptNo830();
     }
   		return ftssFileEndptNo830;
   }

  
	/**
	*  set variable ftssFileEndptNo830
	*  Corresponding COBOL Variable is 830-FTSS-FILE-ENDPT-NO
	*  @param value
	**/
   public void setFtssFileEndptNo830(char[] value) {
      ftssFileEndptNo830 = checkFtssFileEndptNo830Constraints(value);
      serializeFtssFileEndptNo830(ftssFileEndptNo830);
   } 

     /**
	 * 	Update FtssFileEndptNo830 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFtssFileEndptNo830(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFtssFileEndptNo830,ftssFileEndptNo830.length);
   	
   }
   
   public void setFtssFileEndptNo830(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFtssFileEndptNo830,ftssFileEndptNo830.length);
   	
   }
   
     /**
	 * 	Update FtssFileEndptNo830 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFtssFileEndptNo830(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFtssFileEndptNo830+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FtssFileEndptNo830 with another Field
	 *	@param value
	 */
   public void setFtssFileEndptNo830(Field source) {
       replace(source,0,source.length(),beginFtssFileEndptNo830,FTSS_FILE_ENDPT_NO_830_LEN);
   	
   }  
   
     /**
	 * 	Update FtssFileEndptNo830 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFtssFileEndptNo830(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFtssFileEndptNo830,FTSS_FILE_ENDPT_NO_830_LEN);
   	
   }
   
     /**
	 * 	Update FtssFileEndptNo830 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFtssFileEndptNo830(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFtssFileEndptNo830+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ftssFileJulDay830
	 *	@return ftssFileJulDay830
	 */
   public char[] getFtssFileJulDay830() throws CFException{
     if (isFtssFileJulDay830Modified()) { 
        ftssFileJulDay830 = refreshFtssFileJulDay830();
     }
   		return ftssFileJulDay830;
   }

  
	/**
	*  set variable ftssFileJulDay830
	*  Corresponding COBOL Variable is 830-FTSS-FILE-JUL-DAY
	*  @param value
	**/
   public void setFtssFileJulDay830(char[] value) {
      ftssFileJulDay830 = checkFtssFileJulDay830Constraints(value);
      serializeFtssFileJulDay830(ftssFileJulDay830);
   } 

     /**
	 * 	Update FtssFileJulDay830 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFtssFileJulDay830(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFtssFileJulDay830,ftssFileJulDay830.length);
   	
   }
   
   public void setFtssFileJulDay830(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFtssFileJulDay830,ftssFileJulDay830.length);
   	
   }
   
     /**
	 * 	Update FtssFileJulDay830 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFtssFileJulDay830(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFtssFileJulDay830+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FtssFileJulDay830 with another Field
	 *	@param value
	 */
   public void setFtssFileJulDay830(Field source) {
       replace(source,0,source.length(),beginFtssFileJulDay830,FTSS_FILE_JUL_DAY_830_LEN);
   	
   }  
   
     /**
	 * 	Update FtssFileJulDay830 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFtssFileJulDay830(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFtssFileJulDay830,FTSS_FILE_JUL_DAY_830_LEN);
   	
   }
   
     /**
	 * 	Update FtssFileJulDay830 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFtssFileJulDay830(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFtssFileJulDay830+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ftssFileSeqNum830
	 *	@return ftssFileSeqNum830
	 */   
	 public FtssFileSeqNum830 getFtssFileSeqNum830() {
   	return ftssFileSeqNum830;
   }
   /**
	* 	Update FtssFileSeqNum830 with the passed value
	*   Corresponding COBOL Variable is 830-FTSS-FILE-SEQ-NUM
	*	@param value
	*/
   public void setFtssFileSeqNum830(char[] value) {
      ftssFileSeqNum830.setString(value); 
   }   
    
     /**
	 * 	Update FtssFileSeqNum830 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFtssFileSeqNum830(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ftssFileSeqNum830.begin,ftssFileSeqNum830.length());
   }
   
     /**
	 * 	Update FtssFileSeqNum830 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFtssFileSeqNum830(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ftssFileSeqNum830.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FtssFileSeqNum830 with another Field
	 *	@param value
	 */
   public void setFtssFileSeqNum830(Field source) {
   	replace(source,0,source.length(),ftssFileSeqNum830.begin,ftssFileSeqNum830.length());
   }  
   
     /**
	 * 	Update FtssFileSeqNum830 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFtssFileSeqNum830(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ftssFileSeqNum830.begin,ftssFileSeqNum830.length());
   }
   
     /**
	 * 	Update FtssFileSeqNum830 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFtssFileSeqNum830(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ftssFileSeqNum830.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getFtssFileName830FieldLength() {
			return FTSS_FILE_NAME_830_LENGTH;
		}

}
  
