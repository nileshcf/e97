package com.cloudframe.app.ip343900.dto;

/**
*  The class IoErrorType600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.ip343900.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IoErrorType600 extends IoErrorType600Serialized {
   

						private char[] ioErrTxt600 = new char[40];


								private int sys001FileStat600;

						private char[] noOfRecords600 = new char[55];
	
	/**
	* Constructor for IoErrorType600
	**/
    public IoErrorType600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIoErrTxt600(fillSpace(40));
       replaceValue( // serialize and save the value
             ("FILE STATUS:").toCharArray()
             , getStartOffset() + 40
             ,12
             );
								setSys001FileStat600(0);
								setNoOfRecords600(("TOTAL NUMBER OF RECORDS INSERTED IN TIPAPIM TABLE =    ").toCharArray());
    }


 

	/**
	 *	Returns the value of ioErrTxt600
	 *	@return ioErrTxt600
	 */
   public char[] getIoErrTxt600() throws CFException{
     if (isIoErrTxt600Modified()) { 
        ioErrTxt600 = refreshIoErrTxt600();
     }
   		return ioErrTxt600;
   }

  
	/**
	*  set variable ioErrTxt600
	*  Corresponding COBOL Variable is 600-IO-ERR-TXT
	*  @param value
	**/
   public void setIoErrTxt600(char[] value) {
      ioErrTxt600 = checkIoErrTxt600Constraints(value);
      serializeIoErrTxt600(ioErrTxt600);
   } 

     /**
	 * 	Update IoErrTxt600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIoErrTxt600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIoErrTxt600,ioErrTxt600.length);
   	
   }
   
   public void setIoErrTxt600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIoErrTxt600,ioErrTxt600.length);
   	
   }
   
     /**
	 * 	Update IoErrTxt600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIoErrTxt600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIoErrTxt600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IoErrTxt600 with another Field
	 *	@param value
	 */
   public void setIoErrTxt600(Field source) {
       replace(source,0,source.length(),beginIoErrTxt600,IO_ERR_TXT_600_LEN);
   	
   }  
   
     /**
	 * 	Update IoErrTxt600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIoErrTxt600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIoErrTxt600,IO_ERR_TXT_600_LEN);
   	
   }
   
     /**
	 * 	Update IoErrTxt600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIoErrTxt600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIoErrTxt600+targetIndex,targetLen);
    
   }
	char[] openError8860088Value = "ERROR OPENING SYS001 FILE.              ".toCharArray();
	/**
	 *	Test condition "ERROR OPENING SYS001 FILE.  " for isOpenError88600()
	 *	@return  Returns true if isOpenError88600() is "ERROR OPENING SYS001 FILE.  "
	 */
   public boolean isOpenError88600() throws CFException {
      return (  compareChars( getIoErrTxt600() , openError8860088Value)  == 0  );
   }


	/**
	*  set values "ERROR OPENING SYS001 FILE.  "
	*/
   	public void setOpenError88600True() {  			
    	setIoErrTxt600( openError8860088Value);
   	}
	char[] readError8860088Value = "ERROR READING SYS001 FILE.              ".toCharArray();
	/**
	 *	Test condition "ERROR READING SYS001 FILE.  " for isReadError88600()
	 *	@return  Returns true if isReadError88600() is "ERROR READING SYS001 FILE.  "
	 */
   public boolean isReadError88600() throws CFException {
      return (  compareChars( getIoErrTxt600() , readError8860088Value)  == 0  );
   }


	/**
	*  set values "ERROR READING SYS001 FILE.  "
	*/
   	public void setReadError88600True() {  			
    	setIoErrTxt600( readError8860088Value);
   	}
	char[] closeError8860088Value = "ERROR CLOSING SYS001 FILE.              ".toCharArray();
	/**
	 *	Test condition "ERROR CLOSING SYS001 FILE.  " for isCloseError88600()
	 *	@return  Returns true if isCloseError88600() is "ERROR CLOSING SYS001 FILE.  "
	 */
   public boolean isCloseError88600() throws CFException {
      return (  compareChars( getIoErrTxt600() , closeError8860088Value)  == 0  );
   }


	/**
	*  set values "ERROR CLOSING SYS001 FILE.  "
	*/
   	public void setCloseError88600True() {  			
    	setIoErrTxt600( closeError8860088Value);
   	}
	/**
	 *	Returns the value of sys001FileStat600
	 *	@return sys001FileStat600
	 */
	public int getSys001FileStat600() throws CFException {
       if (isSys001FileStat600Modified()) { 
           sys001FileStat600 = refreshSys001FileStat600();
        }
   		return sys001FileStat600;
	}
	

	
	   
	/**
	 * 	Update Sys001FileStat600 with the passed value
	 *  Corresponding COBOL Variable is 600-SYS001-FILE-STAT
	 *	@param number
	 */
	public void setSys001FileStat600(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    sys001FileStat600 = checkSys001FileStat600MaxLimit(number); 
		serializeSys001FileStat600(sys001FileStat600);
	}
	

	public void setSys001FileStat600(long number) {
	    number = checkSys001FileStat600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSys001FileStat600((int)number);
	}
	
	/**
	 * 	Update Sys001FileStat600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSys001FileStat600(char[] value) throws CFException {
		 sys001FileStat600 = serializeSys001FileStat600(value);
	}
	/**
	 * 	Update Sys001FileStat600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSys001FileStat600String(char[] value) throws CFException {
		 setSys001FileStat600(value);
	}
	/**
	 *	Returns the value of noOfRecords600
	 *	@return noOfRecords600
	 */
   public char[] getNoOfRecords600() throws CFException{
     if (isNoOfRecords600Modified()) { 
        noOfRecords600 = refreshNoOfRecords600();
     }
   		return noOfRecords600;
   }

  
	/**
	*  set variable noOfRecords600
	*  Corresponding COBOL Variable is 600-NO-OF-RECORDS
	*  @param value
	**/
   public void setNoOfRecords600(char[] value) {
      noOfRecords600 = checkNoOfRecords600Constraints(value);
      serializeNoOfRecords600(noOfRecords600);
   } 

     /**
	 * 	Update NoOfRecords600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNoOfRecords600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginNoOfRecords600,noOfRecords600.length);
   	
   }
   
   public void setNoOfRecords600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginNoOfRecords600,noOfRecords600.length);
   	
   }
   
     /**
	 * 	Update NoOfRecords600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNoOfRecords600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNoOfRecords600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update NoOfRecords600 with another Field
	 *	@param value
	 */
   public void setNoOfRecords600(Field source) {
       replace(source,0,source.length(),beginNoOfRecords600,NO_OF_RECORDS_600_LEN);
   	
   }  
   
     /**
	 * 	Update NoOfRecords600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNoOfRecords600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginNoOfRecords600,NO_OF_RECORDS_600_LEN);
   	
   }
   
     /**
	 * 	Update NoOfRecords600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNoOfRecords600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNoOfRecords600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIoErrorType600FieldLength() {
			return IO_ERROR_TYPE_600_LENGTH;
		}

}
  
