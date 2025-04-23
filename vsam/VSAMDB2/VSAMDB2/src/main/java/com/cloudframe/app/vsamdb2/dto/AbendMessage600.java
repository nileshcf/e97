package com.cloudframe.app.vsamdb2.dto;

/**
*  The class AbendMessage600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:20. using version 5.0.0.254
**/


import com.cloudframe.app.vsamdb2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AbendMessage600 extends AbendMessage600Serialized {
   

						private char[] abendDescription600 = new char[42];


						private char[] fileStatus600 = Field.fillLowValue(2);
	
	/**
	* Constructor for AbendMessage600
	**/
    public AbendMessage600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setAbendDescription600(fillSpace(42));
       replaceValue( // serialize and save the value
             ("FILE STATUS=").toCharArray()
             , getStartOffset() + 42
             ,12
             );
    }


 

	/**
	 *	Returns the value of abendDescription600
	 *	@return abendDescription600
	 */
   public char[] getAbendDescription600() throws CFException{
     if (isAbendDescription600Modified()) { 
        abendDescription600 = refreshAbendDescription600();
     }
   		return abendDescription600;
   }

  
	/**
	*  set variable abendDescription600
	*  Corresponding COBOL Variable is 600-ABEND-DESCRIPTION
	*  @param value
	**/
   public void setAbendDescription600(char[] value) {
      abendDescription600 = checkAbendDescription600Constraints(value);
      serializeAbendDescription600(abendDescription600);
   } 

     /**
	 * 	Update AbendDescription600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendDescription600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAbendDescription600,abendDescription600.length);
   	
   }
   
   public void setAbendDescription600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAbendDescription600,abendDescription600.length);
   	
   }
   
     /**
	 * 	Update AbendDescription600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendDescription600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendDescription600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AbendDescription600 with another Field
	 *	@param value
	 */
   public void setAbendDescription600(Field source) {
       replace(source,0,source.length(),beginAbendDescription600,ABEND_DESCRIPTION_600_LEN);
   	
   }  
   
     /**
	 * 	Update AbendDescription600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendDescription600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAbendDescription600,ABEND_DESCRIPTION_600_LEN);
   	
   }
   
     /**
	 * 	Update AbendDescription600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendDescription600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendDescription600+targetIndex,targetLen);
    
   }
	char[] abendOpenSys0018860088Value = "ERROR OPENING SYS001-FILE                 ".toCharArray();
	/**
	 *	Test condition "ERROR OPENING SYS001-FILE" for isAbendOpenSys00188600()
	 *	@return  Returns true if isAbendOpenSys00188600() is "ERROR OPENING SYS001-FILE"
	 */
   public boolean isAbendOpenSys00188600() throws CFException {
      return (  compareChars( getAbendDescription600() , abendOpenSys0018860088Value)  == 0  );
   }


	/**
	*  set values "ERROR OPENING SYS001-FILE"
	*/
   	public void setAbendOpenSys00188600True() {  			
    	setAbendDescription600( abendOpenSys0018860088Value);
   	}
	char[] abendReadSys0018860088Value = "ERROR READING SYS001-FILE                 ".toCharArray();
	/**
	 *	Test condition "ERROR READING SYS001-FILE" for isAbendReadSys00188600()
	 *	@return  Returns true if isAbendReadSys00188600() is "ERROR READING SYS001-FILE"
	 */
   public boolean isAbendReadSys00188600() throws CFException {
      return (  compareChars( getAbendDescription600() , abendReadSys0018860088Value)  == 0  );
   }


	/**
	*  set values "ERROR READING SYS001-FILE"
	*/
   	public void setAbendReadSys00188600True() {  			
    	setAbendDescription600( abendReadSys0018860088Value);
   	}
	char[] abendCloseSys0018860088Value = "ERROR CLOSING SYS001-FILE                 ".toCharArray();
	/**
	 *	Test condition "ERROR CLOSING SYS001-FILE" for isAbendCloseSys00188600()
	 *	@return  Returns true if isAbendCloseSys00188600() is "ERROR CLOSING SYS001-FILE"
	 */
   public boolean isAbendCloseSys00188600() throws CFException {
      return (  compareChars( getAbendDescription600() , abendCloseSys0018860088Value)  == 0  );
   }


	/**
	*  set values "ERROR CLOSING SYS001-FILE"
	*/
   	public void setAbendCloseSys00188600True() {  			
    	setAbendDescription600( abendCloseSys0018860088Value);
   	}
	char[] abendStartSys0018860088Value = "ERROR STARTING SYS001-FILE                ".toCharArray();
	/**
	 *	Test condition "ERROR STARTING SYS001-FILE" for isAbendStartSys00188600()
	 *	@return  Returns true if isAbendStartSys00188600() is "ERROR STARTING SYS001-FILE"
	 */
   public boolean isAbendStartSys00188600() throws CFException {
      return (  compareChars( getAbendDescription600() , abendStartSys0018860088Value)  == 0  );
   }


	/**
	*  set values "ERROR STARTING SYS001-FILE"
	*/
   	public void setAbendStartSys00188600True() {  			
    	setAbendDescription600( abendStartSys0018860088Value);
   	}
	/**
	 *	Returns the value of fileStatus600
	 *	@return fileStatus600
	 */
   public char[] getFileStatus600() throws CFException{
     if (isFileStatus600Modified()) { 
        fileStatus600 = refreshFileStatus600();
     }
   		return fileStatus600;
   }

  
	/**
	*  set variable fileStatus600
	*  Corresponding COBOL Variable is 600-FILE-STATUS
	*  @param value
	**/
   public void setFileStatus600(char[] value) {
      fileStatus600 = checkFileStatus600Constraints(value);
      serializeFileStatus600(fileStatus600);
   } 

     /**
	 * 	Update FileStatus600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileStatus600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFileStatus600,fileStatus600.length);
   	
   }
   
   public void setFileStatus600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFileStatus600,fileStatus600.length);
   	
   }
   
     /**
	 * 	Update FileStatus600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileStatus600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileStatus600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FileStatus600 with another Field
	 *	@param value
	 */
   public void setFileStatus600(Field source) {
       replace(source,0,source.length(),beginFileStatus600,FILE_STATUS_600_LEN);
   	
   }  
   
     /**
	 * 	Update FileStatus600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileStatus600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFileStatus600,FILE_STATUS_600_LEN);
   	
   }
   
     /**
	 * 	Update FileStatus600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileStatus600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileStatus600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getAbendMessage600FieldLength() {
			return ABEND_MESSAGE_600_LENGTH;
		}

}
  
