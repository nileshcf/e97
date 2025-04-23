package com.cloudframe.app.ar640010.dto;

/**
*  The class FileAllocateMsg602 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FileAllocateMsg602 extends FileAllocateMsg602Serialized {
   


						private char[] fileAtype602 = new char[3];


								private long fileUnits602;
	
	/**
	* Constructor for FileAllocateMsg602
	**/
    public FileAllocateMsg602() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0022-FILE ALLOCATE: TYPE=").toCharArray()
             , getStartOffset() + 0
             ,25
             );
								setFileAtype602(fillSpace(3));
       replaceValue( // serialize and save the value
             ("    SPACE=").toCharArray()
             , getStartOffset() + 28
             ,10
             );
								setFileUnits602(0L);
    }


 

	/**
	 *	Returns the value of fileAtype602
	 *	@return fileAtype602
	 */
   public char[] getFileAtype602() throws CFException{
     if (isFileAtype602Modified()) { 
        fileAtype602 = refreshFileAtype602();
     }
   		return fileAtype602;
   }

  
	/**
	*  set variable fileAtype602
	*  Corresponding COBOL Variable is 602-FILE-ATYPE
	*  @param value
	**/
   public void setFileAtype602(char[] value) {
      fileAtype602 = checkFileAtype602Constraints(value);
      serializeFileAtype602(fileAtype602);
   } 

     /**
	 * 	Update FileAtype602 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileAtype602(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFileAtype602,fileAtype602.length);
   	
   }
   
   public void setFileAtype602(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFileAtype602,fileAtype602.length);
   	
   }
   
     /**
	 * 	Update FileAtype602 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileAtype602(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileAtype602+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FileAtype602 with another Field
	 *	@param value
	 */
   public void setFileAtype602(Field source) {
       replace(source,0,source.length(),beginFileAtype602,FILE_ATYPE_602_LEN);
   	
   }  
   
     /**
	 * 	Update FileAtype602 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileAtype602(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFileAtype602,FILE_ATYPE_602_LEN);
   	
   }
   
     /**
	 * 	Update FileAtype602 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileAtype602(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileAtype602+targetIndex,targetLen);
    
   }
	char[] fileAtypeCyl8860288Value = "CYL".toCharArray();
	/**
	 *	Test condition "CYL" for isFileAtypeCyl88602()
	 *	@return  Returns true if isFileAtypeCyl88602() is "CYL"
	 */
   public boolean isFileAtypeCyl88602() throws CFException {
      return (  compareChars( getFileAtype602() , fileAtypeCyl8860288Value)  == 0  );
   }


	/**
	*  set values "CYL"
	*/
   	public void setFileAtypeCyl88602True() {  			
    	setFileAtype602( fileAtypeCyl8860288Value);
   	}
	char[] fileAtypeTrk8860288Value = "TRK".toCharArray();
	/**
	 *	Test condition "TRK" for isFileAtypeTrk88602()
	 *	@return  Returns true if isFileAtypeTrk88602() is "TRK"
	 */
   public boolean isFileAtypeTrk88602() throws CFException {
      return (  compareChars( getFileAtype602() , fileAtypeTrk8860288Value)  == 0  );
   }


	/**
	*  set values "TRK"
	*/
   	public void setFileAtypeTrk88602True() {  			
    	setFileAtype602( fileAtypeTrk8860288Value);
   	}
	char[] fileAtypeBlk8860288Value = "BLK".toCharArray();
	/**
	 *	Test condition "BLK" for isFileAtypeBlk88602()
	 *	@return  Returns true if isFileAtypeBlk88602() is "BLK"
	 */
   public boolean isFileAtypeBlk88602() throws CFException {
      return (  compareChars( getFileAtype602() , fileAtypeBlk8860288Value)  == 0  );
   }


	/**
	*  set values "BLK"
	*/
   	public void setFileAtypeBlk88602True() {  			
    	setFileAtype602( fileAtypeBlk8860288Value);
   	}
	char[] fileAtypeUnk8860288Value = "???".toCharArray();
	/**
	 *	Test condition "???" for isFileAtypeUnk88602()
	 *	@return  Returns true if isFileAtypeUnk88602() is "???"
	 */
   public boolean isFileAtypeUnk88602() throws CFException {
      return (  compareChars( getFileAtype602() , fileAtypeUnk8860288Value)  == 0  );
   }


	/**
	*  set values "???"
	*/
   	public void setFileAtypeUnk88602True() {  			
    	setFileAtype602( fileAtypeUnk8860288Value);
   	}
	/**
	 *	Returns the value of fileUnits602
	 *	@return fileUnits602
	 */
	public long getFileUnits602() throws CFException {
       if (isFileUnits602Modified()) { 
           fileUnits602 = refreshFileUnits602();
        }
   		return fileUnits602;
	}
	

	
	   
	/**
	 * 	Update FileUnits602 with the passed value
	 *  Corresponding COBOL Variable is 602-FILE-UNITS
	 *	@param number
	 */
	public void setFileUnits602(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    fileUnits602 = checkFileUnits602MaxLimit(number); 
		serializeFileUnits602(fileUnits602);
	}
	

	/**
	 * 	Update FileUnits602 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFileUnits602(char[] value) throws CFException {
		 fileUnits602 = serializeFileUnits602(value);
	}
	/**
	 * 	Update FileUnits602 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFileUnits602String(char[] value) throws CFException {
		 setFileUnits602(value);
	}

	
	
	

		public static int getFileAllocateMsg602FieldLength() {
			return FILE_ALLOCATE_MSG_602_LENGTH;
		}

}
  
