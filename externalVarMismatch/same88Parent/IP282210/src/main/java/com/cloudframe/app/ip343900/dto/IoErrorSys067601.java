package com.cloudframe.app.ip343900.dto;

/**
*  The class IoErrorSys067601 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:10. using version 5.0.0.256
**/


import com.cloudframe.app.ip343900.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IoErrorSys067601 extends IoErrorSys067601Serialized {
   

						private char[] ioErrTxt601 = new char[40];


								private int sys067FileStat600;
	
	/**
	* Constructor for IoErrorSys067601
	**/
    public IoErrorSys067601() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIoErrTxt601(fillSpace(40));
       replaceValue( // serialize and save the value
             ("FILE STATUS:").toCharArray()
             , getStartOffset() + 40
             ,12
             );
								setSys067FileStat600(0);
    }


 

	/**
	 *	Returns the value of ioErrTxt601
	 *	@return ioErrTxt601
	 */
   public char[] getIoErrTxt601() throws CFException{
     if (isIoErrTxt601Modified()) { 
        ioErrTxt601 = refreshIoErrTxt601();
     }
   		return ioErrTxt601;
   }

  
	/**
	*  set variable ioErrTxt601
	*  Corresponding COBOL Variable is 601-IO-ERR-TXT
	*  @param value
	**/
   public void setIoErrTxt601(char[] value) {
      ioErrTxt601 = checkIoErrTxt601Constraints(value);
      serializeIoErrTxt601(ioErrTxt601);
   } 

     /**
	 * 	Update IoErrTxt601 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIoErrTxt601(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIoErrTxt601,ioErrTxt601.length);
   	
   }
   
   public void setIoErrTxt601(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIoErrTxt601,ioErrTxt601.length);
   	
   }
   
     /**
	 * 	Update IoErrTxt601 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIoErrTxt601(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIoErrTxt601+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IoErrTxt601 with another Field
	 *	@param value
	 */
   public void setIoErrTxt601(Field source) {
       replace(source,0,source.length(),beginIoErrTxt601,IO_ERR_TXT_601_LEN);
   	
   }  
   
     /**
	 * 	Update IoErrTxt601 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIoErrTxt601(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIoErrTxt601,IO_ERR_TXT_601_LEN);
   	
   }
   
     /**
	 * 	Update IoErrTxt601 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIoErrTxt601(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIoErrTxt601+targetIndex,targetLen);
    
   }
	char[] openError8860188Value = "ERROR OPENING SYS067 FILE.              ".toCharArray();
	/**
	 *	Test condition "ERROR OPENING SYS067 FILE.  " for isOpenError88601()
	 *	@return  Returns true if isOpenError88601() is "ERROR OPENING SYS067 FILE.  "
	 */
   public boolean isOpenError88601() throws CFException {
      return (  compareChars( getIoErrTxt601() , openError8860188Value)  == 0  );
   }


	/**
	*  set values "ERROR OPENING SYS067 FILE.  "
	*/
   	public void setOpenError88601True() {  			
    	setIoErrTxt601( openError8860188Value);
   	}
	char[] readError8860188Value = "ERROR READING SYS067 FILE.              ".toCharArray();
	/**
	 *	Test condition "ERROR READING SYS067 FILE.  " for isReadError88601()
	 *	@return  Returns true if isReadError88601() is "ERROR READING SYS067 FILE.  "
	 */
   public boolean isReadError88601() throws CFException {
      return (  compareChars( getIoErrTxt601() , readError8860188Value)  == 0  );
   }


	/**
	*  set values "ERROR READING SYS067 FILE.  "
	*/
   	public void setReadError88601True() {  			
    	setIoErrTxt601( readError8860188Value);
   	}
	char[] closeError8860188Value = "ERROR CLOSING SYS067 FILE.              ".toCharArray();
	/**
	 *	Test condition "ERROR CLOSING SYS067 FILE.  " for isCloseError88601()
	 *	@return  Returns true if isCloseError88601() is "ERROR CLOSING SYS067 FILE.  "
	 */
   public boolean isCloseError88601() throws CFException {
      return (  compareChars( getIoErrTxt601() , closeError8860188Value)  == 0  );
   }


	/**
	*  set values "ERROR CLOSING SYS067 FILE.  "
	*/
   	public void setCloseError88601True() {  			
    	setIoErrTxt601( closeError8860188Value);
   	}
	/**
	 *	Returns the value of sys067FileStat600
	 *	@return sys067FileStat600
	 */
	public int getSys067FileStat600() throws CFException {
       if (isSys067FileStat600Modified()) { 
           sys067FileStat600 = refreshSys067FileStat600();
        }
   		return sys067FileStat600;
	}
	

	
	   
	/**
	 * 	Update Sys067FileStat600 with the passed value
	 *  Corresponding COBOL Variable is 600-SYS067-FILE-STAT
	 *	@param number
	 */
	public void setSys067FileStat600(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    sys067FileStat600 = checkSys067FileStat600MaxLimit(number); 
		serializeSys067FileStat600(sys067FileStat600);
	}
	

	public void setSys067FileStat600(long number) {
	    number = checkSys067FileStat600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSys067FileStat600((int)number);
	}
	
	/**
	 * 	Update Sys067FileStat600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSys067FileStat600(char[] value) throws CFException {
		 sys067FileStat600 = serializeSys067FileStat600(value);
	}
	/**
	 * 	Update Sys067FileStat600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSys067FileStat600String(char[] value) throws CFException {
		 setSys067FileStat600(value);
	}

	
	
	

		public static int getIoErrorSys067601FieldLength() {
			return IO_ERROR_SYS_067601_LENGTH;
		}

}
  
